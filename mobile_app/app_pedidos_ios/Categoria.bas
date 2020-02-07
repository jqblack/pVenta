B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=5.51
@EndOfDesignText@
'Code module

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'Public variables can be accessed from all modules.

	Private PanelLista As Panel
	Private listaCat As TableView
	
	Private hud As HUD
	Dim mapaDetalle As Map
	dim actualizar as Boolean = False
	
	Private pageCat As Page
	Private pageProByCat As Page
	Private pageDetalle As Page
	
	Private btnBackCat As Button
	Private CustomListViewCategoria As CustomListView
	Private imgCat As ImageView
	Private lblNomCat As Label
	Private lblCantCat As Label
	Private ScrollViewProByCat As ScrollView
	Private Label1 As Label
	Private PanelFondoProductosbycategorias As Panel
	Private btnbackprobycat As Button
	Private Label2 As Label

	Private btnBackDetalles As Button
	Private ImageViewDetalles As ImageView
	Private lblPrecioEncabezado As Label
	Private lblNombeEncabezado As Label
	Private imgdetallefav As ImageView
	Private btnagregarCarritoDetalle As Button
	Private StepperCantidad As Stepper
	Private lblPrecio As Label
	Private PanelImagenDetalles As Panel
	Private PanelFondoDetalles As Panel
	Private lblcantidad As Label
	Private PanellblCantidad As Panel
	Private PanelEncabezadoDetalles As Panel
End Sub

Sub Initialize

	pageCat.Initialize("PageCategoria")
	
	pageCat.RootPanel.LoadLayout("frmCategoria")
		
	listaCat.Initialize("lista",False)
	
	
	Main.NavControl.ShowPage2(pageCat,True)
	
	Dim jobCategoria As HttpJob
	jobCategoria.Initialize("jobCategorias",Me)
	jobCategoria.PostString(Main.url&"/puntoventa/searchcategorias","json="&funciones.crearJson(Main.tokenPublico,""))
	
	hud.ProgressDialogShow("Cargando lista de Favoritos")
	
	Main.smc.Tag = "categoria"
	
End Sub

Sub JobDone(Job As HttpJob)
	
	
	hud.ProgressDialogHide
	
	If Job.Success = False Then
		Msgbox(Main.jobMsj,Main.jobMsjTitle)
		Return
	End If
	
	If funciones.verificarJob(Job.GetString)=False Then
		Return
	End If
	
	Dim map As Map
	Dim list As List
	Dim json2 As JSONParser
	
	
	json2.Initialize(funciones.base64_Decode(Job.GetString))

	map = json2.NextObject
	
	Select Job.JobName
		
		
		Case "jobCategorias"			
			
			If listaCat.IsInitialized Then
				
				listaCat.RemoveViewFromParent
				listaCat.Initialize("listaCat",False)
				
				
			End If
			
			list = map.Get("f_data")
			
			For i=0 To list.Size-1
				
				Dim key As Boolean = False
				
				Dim mapa As Map 
				mapa = list.Get(i)
				
				Dim bm As Bitmap

				If mapa.Get("f_fotoCategoria") <> Null And mapa.Get("f_fotoCategoria") <> "" Then
					
					Dim imaDim As Bitmap
					bm = funciones.getImagen(mapa.Get("f_fotoCategoria"))
					
					imaDim = funciones.ResizeImage(bm,200,200)

					key = True
					
					Else
					bm.Initialize(File.DirAssets,"no-image.jpg")
					
				End If
				
				If key Then
					CustomListViewCategoria.Add(CreateListItem(mapa.Get("f_nombre"),mapa.Get("f_cantidad") ,imaDim,CustomListViewCategoria.GetBase.Width,50dip),mapa)
					Else
					CustomListViewCategoria.Add(CreateListItem(mapa.Get("f_nombre"),mapa.Get("f_cantidad"),bm,CustomListViewCategoria.GetBase.Width,50dip),mapa)
				End If
				
			Next
			
			hud.ProgressDialogHide
			
		Case "ProductosByCategoria"
			
			list = map.Get("f_data")
			
			If list.Size <= 0 Then
				Msgbox("Esta categoría todavía no tiene productos","Aviso")
			End If
			
			Main.NavControl.ShowPage2(pageProByCat,True)
			
			'AQUI MIO
			ScrollViewProByCat.ContentWidth = ScrollViewProByCat.Width
			Dim alttop As Int  = ScrollViewProByCat.Height * 0.02
			Dim lef2 As Int = 1%x
			Dim lef3 As Int = ScrollViewProByCat.Width * 0.50
								
			For i=0 To list.Size -1
			Dim mapaMio As Map = list.Get(i)
			
				Dim bm As Bitmap
				If mapaMio.Get("f_foto") <> Null And mapaMio.Get("f_foto") <> "" Then
					bm = funciones.getImagen(mapaMio.Get("f_foto"))
						
				Else
					bm.Initialize(File.DirAssets,"no-image.jpg")
				End If
					
				If i Mod 2 == 0 Then

					ScrollViewProByCat.Panel.AddView(createPanelProductoScroll(mapaMio,bm),lef2,alttop,ScrollViewProByCat.Width * 0.48,ScrollViewProByCat.Height * 0.41)
						
					If i == list.Size-1 Then
						alttop = alttop +  ScrollViewProByCat.Height * 0.43
					End If
						
				Else
							
					ScrollViewProByCat.Panel.AddView(createPanelProductoScroll(mapaMio,bm),lef3,alttop,ScrollViewProByCat.Width * 0.48,ScrollViewProByCat.Height * 0.41)
					alttop = alttop +  ScrollViewProByCat.Height * 0.43
						
				End If
					
			Next
			
			ScrollViewProByCat.ScrollTo(0,0,True)
			ScrollViewProByCat.ContentHeight = alttop
			
		Case "JobDetalleTemporal"
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Main.cantidadProduto = Main.cantidadProduto + 1
			hud.ToastMessageShow("Producto agregado al carrito.",False)
			actualizar = True
			
	End Select
	
End Sub

Sub CreateListItem(Nombre As String, cantidad As Int,img As Bitmap, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) 'set the size before the layout is loaded
	p.LoadLayout("frmPanelesItems")
	lblNomCat.Text = Nombre
	lblCantCat.Text = "Cantidad de Productos: "&cantidad
	imgCat.Bitmap = img
	Return p
End Sub

Sub btnBackCat_Click
	
	If actualizar Then
		Main.actualizarCantidad
		actualizar = False
	End If
	
	Main.smc.Tag = "inicio"
	Main.NavControl.RemoveCurrentPage
	
End Sub

Sub listaCat_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	
	If Cell.Tag = Null Then
		Return
	End If
	
	
End Sub

Sub CustomListViewCategoria_ItemClick (Index As Int, Value As Object)
	
	Dim mapa As Map
	mapa = Value
	
	If mapa.Get("f_cantidad") > 0 Then
		
		Dim json As String
		json = "'f_idcategoria':"&mapa.Get("idcategoria")
	
		Dim jobBusqueda As HttpJob
		jobBusqueda.Initialize("ProductosByCategoria",Me)
		
		'CARGAR EL LAYOUT DE PRODUCTOS BY CATEGORIA DE B4A Y COPIAR LOS METODOS, PRIMERO DEBO DE SABER COMO PONER LOS PANELES 
		
		If PanelFondoProductosbycategorias.IsInitialized = False Then
			
			pageProByCat.Initialize("pageProByCat")
			pageProByCat.RootPanel.LoadLayout("frmProductoByCategoria")
			
		End If
		
'		Main.NavControl.ShowPage2(pageProByCat,True)
		Label1.Text = mapa.Get("f_nombre")
		Label2.Text = "Cantidad de productos: "&mapa.Get("f_cantidad")
		
		ClearScrollView(ScrollViewProByCat)
		
		jobBusqueda.PostString(Main.url&"/puntoventa/productosbycat","json="&funciones.crearJson(Main.tokenPublico,json))
		
		Else
		Msgbox("La categoria "&mapa.Get("f_nombre")&" no tiene Productos!!","Ups..")
	End If
	
	
	
End Sub

Sub ClearScrollView(sv As ScrollView)
	For i = sv.Panel.NumberOfViews - 1 To 0 Step -1
		sv.Panel.GetView(i).RemoveViewFromParent
	Next
End Sub

Sub btnbackprobycat_Click
	
	Main.NavControl.ShowPage2(pageCat,True)
	
End Sub


#Region funcionPaneles

Sub createPanelProductoScroll(mapaPanel1 As Map, imagen As Bitmap) As Panel

	
	Dim PanelFondoPro,PanelImagen As Panel
	PanelFondoPro.Initialize("PanelFondoPro")
	
	PanelFondoPro.Width = ScrollViewProByCat.Width * 0.47
	PanelFondoPro.Height = ScrollViewProByCat.Height * 0.40
	
	Dim heigImg As Int = PanelFondoPro.Height * 0.50
	Dim lef As Int = ScrollViewProByCat.Width * 0.02
	
	
	Dim Tnom As Int =   PanelFondoPro.Height * 0.39
	Dim Hnom As Int =   PanelFondoPro.Height * 0.42
	
	Dim tPre As Int = PanelFondoPro.Height * 0.51
	Dim hPre As Int  = PanelFondoPro.Height * 0.40
	
	
	PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelFondoPro.Color = Colors.RGB(255, 255, 255)
	
	PanelImagen.Initialize("")
	
	PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	Dim imagenPro As ImageView
	imagenPro.Initialize("")
	
	imagenPro.Bitmap = imagen

	mapaPanel1.Put("f_foto",imagen)
	
	mapaPanel1.Put("f_destacado",False)
	
	
	PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,True)
	
	PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondoPro.Width,heigImg)
	
	PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelFondoPro.Width,heigImg)
	
	Dim lblTituloPro As Label
	lblTituloPro.Initialize("")
	lblTituloPro.Text = mapaPanel1.Get("f_descripcion")
	lblTituloPro.TextColor = Colors.RGB(97, 97, 97)
	lblTituloPro.Font = Font.CreateNew(15)
	
	
	PanelFondoPro.AddView(lblTituloPro,lef,Tnom,PanelFondoPro.Width - 4%x,Hnom)
	
	Dim lblPrecioPro As Label
	lblPrecioPro.Initialize("")
	lblPrecioPro.Text = NumberFormat(mapaPanel1.Get("f_precio"),0,2)
	lblPrecioPro.Text = "$ "&lblPrecioPro.Text
	lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)
	lblPrecioPro.Font = Font.CreateNew(15)
	
	PanelFondoPro.AddView(lblPrecioPro,lef,tPre,PanelFondoPro.Width * 0.50,hPre)
	
	Dim btnAddPro As Button
	btnAddPro.InitializeCustom("btnAddProducto",Colors.RGB(244, 67, 54),Colors.RGB(0,0,0))
	btnAddPro.Color = Colors.RGB(255, 255, 255)
	btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,True)
	btnAddPro.Tag = mapaPanel1
	btnAddPro.Text = "Agregar"
	
	btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Width * 0.02,PanelFondoPro.Height * 0.80,PanelFondoPro.Width - 4%x,PanelFondoPro.Height *0.14)
	
	PanelFondoPro.Tag = mapaPanel1
	btnAddPro.Tag = mapaPanel1
	
	Return PanelFondoPro
	
End Sub

#End Region



Sub PanelFondoPro_Click
	
	Dim mapa As Map
	mapa.Initialize
	
	Dim b As Panel
	b = Sender
	
	mapa = b.Tag
	mapaDetalle = mapa
	
'	Msgbox(mapa,"")
	
	If PanelFondoDetalles.IsInitialized == False Then
		pageDetalle.Initialize("pageDetalle")

		pageDetalle.RootPanel.LoadLayout("frmDetalleProducto")
	End If
	
	Main.NavControl.ShowPage2(pageDetalle,True)
	
	Dim bm As Bitmap
		
	If mapa.Get("f_destacado") Then
	
		If  mapa.Get("f_foto") <> Null And mapa.Get("f_foto") <> "" Then
			bm = funciones.getImagen(mapa.Get("f_foto"))

			ImageViewDetalles.Bitmap= bm
			'ImageViewDetalles.Background =  mapa.Get("f_foto")
			
		Else
			bm.Initialize(File.DirAssets,"no-image.jpg")

			ImageViewDetalles.Bitmap = bm
		End If
	
	Else
		If  mapa.Get("f_foto") <> Null And mapa.Get("f_foto") <> "" Then
			'bm = funciones.getImagen(mapa.Get("f_foto"))

			ImageViewDetalles.Bitmap = funciones.getImagen(mapa.Get("f_foto"))
			
		Else
			bm.Initialize(File.DirAssets,"no-image.jpg")
			
			ImageViewDetalles.Bitmap = bm
		End If
	
	End If
	
	'PARA PONER LO DE FAV
	
	Dim bmimgfav As Bitmap
	
	

	If bmimgfav.IsInitialized == False Then
		bmimgfav.Initialize(File.DirAssets,"heartWhiteandBlack.png")
		imgdetallefav.Tag = False
	End If

	imgdetallefav.Bitmap = bmimgfav
	
	
	'SOMBRAS
	btnagregarCarritoDetalle.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3dip,0.3,True)
	PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,0.3,True)
	PanelEncabezadoDetalles.SetShadow(Colors.Gray,0dip,3dip,0.3,True)
	
	lblPrecioEncabezado.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	lblNombeEncabezado.Text = mapa.Get("f_descripcion")
	lblcantidad.Text = 1
	StepperCantidad.Value = lblcantidad.Text
	lblPrecio.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	
	'ismodal = False CONFIGURACIONES
	
End Sub

Sub btnAddProducto_Click
	Dim b As Button
	b.Initialize("b",b.STYLE_CONTACT_ADD)
	b = Sender
	
	Dim mapa As Map  = b.Tag
	
	If mapa.Get("f_precio") <= 0 Then
		
		Msgbox("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este","Aviso")
		
	Else
		'mapaDetalle.Initialize
		salvar_detalle_temporal(mapa,1)
	End If
	
End Sub

Sub btnBackDetalles_Click
	Main.NavControl.RemoveCurrentPage
End Sub

Sub btnagregarCarritoDetalle_Click
	salvar_detalle_temporal(mapaDetalle,lblcantidad.Text)
	btnBackDetalles_Click
End Sub

Sub StepperCantidad_ValueChanged (Value As Double)
	lblcantidad.Text = Value
End Sub


Sub salvar_detalle_temporal(map As Map, cantidad As Int )
	
	Dim mapCalculos As Map = funciones.recalcular(map.Get("f_precio"),0, cantidad ,map.Get("f_tax"), Main.impuestoIncluido,  False)
	
	Dim json As String
	json = "'f_regresa':false"& _
			",'f_idempresa':"&Main.idEmpresa& _
	  		",'f_tipo':1"& _
			",'f_idproducto':"&map.Get("f_idrecord")& _
			",'f_cantidad':"&cantidad&""& _
			",'f_tax':"&mapCalculos.Get("f_tax")& _ 
			",'f_precio':"&mapCalculos.Get("f_precio_para_mostrar")& _
			",'f_importe':"&mapCalculos.Get("f_total")& _
			",'f_descuento':0"& _
			",'f_diferencia':0"& _
			",'f_porciento_descuento':0"& _
			",'f_porciento_tax':"&map.Get("f_tax")& _
			",'f_imei':"&Main.imei
	
	Dim JobDetalleTemporal As HttpJob
	JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
	JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funciones.crearJson(Main.tokenPublico,json))
	
End Sub





	















