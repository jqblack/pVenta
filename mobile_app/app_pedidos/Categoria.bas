B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim listaCategoria As List
	Dim mapadetalle As Map
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	Private ListViewSlideCategorias As ListView
	Private btnBackSlideCategoria As Button
	Private PanelFondoProductosbycategorias As Panel
	Private Label1 As Label
	Private btnbackprobycat As Button
	Private PanelFondoSlideCategorias As Panel
	Private PanelScroll As Panel
	Private ScrollViewProByCat As ScrollView
	Private PanelFondoDetalles As Panel
	Private ImageViewDetalles As ImageView
	Private lblcantidad As Label
	Private lblNombeEncabezado As Label
	Private lblPrecio As Label
	Private lblPrecioEncabezado As Label
	Private lblCantidadProductos As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("frmCategoria")	
	
	ListViewSlideCategorias.TwoLinesAndBitmap.ItemHeight = 10%y
	
	ListViewSlideCategorias.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListViewSlideCategorias.TwoLinesAndBitmap.Label.TextSize = 15
	ListViewSlideCategorias.TwoLinesAndBitmap.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	ListViewSlideCategorias.TwoLinesAndBitmap.Label.Padding = Array As Int(30dip,0,0,0)
	
	ListViewSlideCategorias.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Gray
	ListViewSlideCategorias.TwoLinesAndBitmap.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	ListViewSlideCategorias.TwoLinesAndBitmap.SecondLabel.Height = -1
	funcion.SetDivider(ListViewSlideCategorias,Colors.LightGray,1dip)
	
	If listaCategoria.IsInitialized Then
		
		If listaCategoria.Size <> 0 Then

			cargarListaCategorias
		
		Else
			
			Dim jobCategoria As HttpJob
			jobCategoria.Initialize("jobCategorias",Me)
			jobCategoria.PostString(Main.url&"/puntoventa/searchcategorias","json="&funcion.crearJson(Main.tokenPublico,""))
		
		End If
		
		Else
			
		Dim jobCategoria As HttpJob
		jobCategoria.Initialize("jobCategorias",Me)
		jobCategoria.PostString(Main.url&"/puntoventa/searchcategorias","json="&funcion.crearJson(Main.tokenPublico,""))
		
	End If

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnBackSlideCategoria_Click
	
	Activity.Finish
	Principal.keyotraparte = False
	StartActivity(Principal)
	
End Sub

Sub JobDone(Job As HttpJob)
	
	If funcion.verificarJob(Job.GetString)=False Then
		Return
	End If
	
	Dim map As Map
	Dim list As List
	Dim json As JSONParser
	json.Initialize(funcion.base64_Decode(Job.GetString))
	map = json.NextObject
	
	
	Select Job.JobName
		
		Case "jobCategorias"
			
			list = map.Get("f_data")
			listaCategoria = list
			
			cargarListaCategorias
			
			
		Case "ProductosByCategoria"
			
			list = map.Get("f_data")
			
			If list.Size <= 0 Then
				Msgbox("Esta categoría todavía no tiene productos","Aviso")
			End If
			
			Dim tam As Int = list.Size
			
			Dim alttop As Int = 2%y
			
			ScrollViewProByCat.Panel.Height = 100%y
			
			For i=0 To list.Size-1
				Dim mapalist As Map
				mapalist = list.Get(i)
				
				Dim bm As BitmapDrawable
				
				If mapalist.Get("f_foto") <> Null And mapalist.Get("f_foto") <> "" Then
					bm = funcion.getImagen(mapalist.Get("f_foto"))
						
				Else
					bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
				End If
				
				'YA TENGO LA IMAGEN 
					
				Dim lefpro As Int = 2%x
					
				If i Mod 2 == 0 Then
					
					lefpro = 2%x
					ScrollViewProByCat.Panel.AddView(funcion.createPanelProductoScroll(mapalist,bm),lefpro,alttop,46%x,36%y)
					
					If i == list.Size-1 Then
						alttop = alttop+37%y
					End If
						
				Else
							
					lefpro = lefpro + 47%x
					ScrollViewProByCat.Panel.AddView(funcion.createPanelProductoScroll(mapalist,bm),lefpro,alttop,46%x,36%y)
					alttop = alttop+37%y
						
				End If
					
			Next
			ScrollViewProByCat.Panel.Height = alttop
			
		Case "JobDetalleTemporal"
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Principal.cantidadProduto = Principal.cantidadProduto + 1
			
			ToastMessageShow("Producto agregado al carrito.",False)
			
	End Select
	
End Sub

Sub cargarListaCategorias
	
	Dim bm As BitmapDrawable
			
	For i = 0 To listaCategoria.Size-1
				
		Dim mapalist As Map
		mapalist = listaCategoria.Get(i)
				
		If  mapalist.Get("f_fotoCategoria")<> Null And  mapalist.Get("f_fotoCategoria") <> "" Then
			bm = funcion.getImagen(mapalist.Get("f_fotoCategoria"))
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
		End If
				
		ListViewSlideCategorias.AddTwoLinesAndBitmap2(mapalist.Get("nombrecategoria"),"Cantidad de Productos: "&mapalist.Get("cantproductos"),bm.Bitmap,mapalist)
					
	Next
	
End Sub


Sub ListViewSlideCategorias_ItemClick (Position As Int, Value As Object)
	
	Dim mapa As Map
	mapa = Value
	
	Dim json As String
	json = "'f_idcategoria':"&mapa.Get("idcategoria")
	
	Dim jobBusqueda As HttpJob
	jobBusqueda.Initialize("ProductosByCategoria",Me)
	
	'Primero cargar el layout
	
	
	If PanelFondoProductosbycategorias.IsInitialized = False Then
		Activity.LoadLayout("frmProductosByCatgoria")
		PanelFondoProductosbycategorias.Visible = False
	End If
	ClearScrollView(ScrollViewProByCat)
	Label1.Text = mapa.Get("nombrecategoria")
	PanelFondoSlideCategorias.SetVisibleAnimated(250,False)
	PanelFondoProductosbycategorias.SetVisibleAnimated(250,True)
	jobBusqueda.PostString(Main.url&"/puntoventa/productosbycat","json="&funcion.crearJson(Main.tokenPublico,json)) ' cambiar el metodo
	
End Sub

Sub ClearScrollView(sv As ScrollView)
	For i = sv.Panel.NumberOfViews - 1 To 0 Step -1
		sv.Panel.GetView(i).RemoveView
	Next
End Sub


#Region

Sub btnbackprobycat_Click
	
	PanelFondoProductosbycategorias.SetVisibleAnimated(250,False)
	PanelFondoSlideCategorias.SetVisibleAnimated(250,True)
	
End Sub

#End Region

Sub salvar_detalle_temporal(map As Map, cantidad As Int )
	
	Dim mapCalculos As Map = funcion.recalcular(map.Get("f_precio"),0, cantidad ,map.Get("f_tax"), Principal.impuestoIncluido,  False)
	
	Dim json As String
	json = "'f_regresa':false"& _
			",'f_idempresa':"&Principal.idEmpresa& _
	  		",'f_tipo':1"& _
			",'f_idproducto':"&map.Get("f_idrecord")& _
			",'f_cantidad':"&cantidad&""& _
			",'f_tax':"&mapCalculos.Get("f_tax")& _ 
			",'f_precio':"&mapCalculos.Get("f_precio_para_mostrar")& _
			",'f_importe':"&mapCalculos.Get("f_total")& _
			",'f_descuento':0"& _
			",'f_diferencia':0"& _
			",'f_porciento_descuento':0"& _
			",'f_porciento_tax':"&map.Get("f_tax")    
	
	Dim JobDetalleTemporal As HttpJob
	JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
	JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal","json="&funcion.crearJson(Main.token,json))
	
End Sub

#Region

Sub btnAddPro_Click
	Dim mapa As Map
	mapa.Initialize
	
	Dim b As Button
	b.Initialize("")
	b = Sender
	
	mapa = b.Tag
	
	mapadetalle.Initialize
	
	salvar_detalle_temporal(mapa,1)
End Sub

Sub PanelFondoPro_Click
	Dim mapa As Map
	mapa.Initialize
	
	Dim b As Panel
	b.Initialize("")
	b = Sender
	
	mapa = b.Tag
	mapadetalle = mapa
	'ENVIARLO AQUI AL DETALLE
	
	If PanelFondoDetalles.IsInitialized == False Then
		Activity.LoadLayout("frmDetallesProducto")
		PanelFondoDetalles.Visible = False
	End If
	
	Dim bm As BitmapDrawable
	If mapa.ContainsKey("f_foto") Then
		'SI TIENE EL CAMPO DE FOTO
		If  mapa.Get("f_foto") <> "" Then
			'bm = funcion.getImagen(mapa.Get("f_foto"))

			ImageViewDetalles.Background =  mapa.Get("f_foto")
			
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
			bm.Gravity = Gravity.FILL
			ImageViewDetalles.Background = bm
		End If
		
	Else
		bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
		bm.Gravity = Gravity.FILL
		ImageViewDetalles.Background = bm
	End If
	
	lblPrecioEncabezado.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	lblNombeEncabezado.Text = mapa.Get("f_descripcion")
	lblcantidad.Text = 1
	lblPrecio.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	PanelFondoProductosbycategorias.SetVisibleAnimated(500, False)
	PanelFondoDetalles.SetVisibleAnimated(500,True)
	
	
End Sub

Sub imgFav_Click
	Dim img As ImageView
	img.Initialize("")
	img = Sender
	
	Dim mapa As Map
	mapa.Initialize
	
	mapa = img.Tag
	
	If Main.logged Then
		
		Dim bm As  BitmapDrawable
	
		If mapa.Get("f_red") Then
		
			bm.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
			img.Background = bm
			mapa.Put("f_red",False)
		
			Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
		",'f_idproducto':"&mapa.Get("f_idproducto") 
		
			Dim deleteFavoritos As HttpJob
			deleteFavoritos.Initialize("deleteFavoritos",Me)
			deleteFavoritos.PostString(Main.url&"puntoventa/deletefav","json="&funcion.crearJson(Main.token,json))
		
		
		Else
			
			bm.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
			img.Background = bm
			mapa.Put("f_red",True)
		
			Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
		",'f_idproducto':"&mapa.Get("f_idproducto") 
		
			Dim putFavoritos As HttpJob
			putFavoritos.Initialize("addFavoritos",Me)
			putFavoritos.PostString(Main.url&"puntoventa/addfav","json="&funcion.crearJson(Main.token,json))
		
		End If
		
		Else
			
			ToastMessageShow("Primero debe inicar sesión",False)
		
	End If
		
End Sub

#End Region

#Region DetallesProductos


Sub btnMore_Click
	Dim num As Int = lblcantidad.Text
	
	lblcantidad.Text = num + 1
End Sub

Sub btnless_Click
	Dim num As Int = lblcantidad.Text
	
	lblcantidad.Text = num - 1
End Sub

Sub btnBackDetalles_Click
	
	PanelFondoDetalles.SetVisibleAnimated(250,False)
	PanelFondoProductosbycategorias.SetVisibleAnimated(250,True)
	
End Sub

Sub btnagregarCarritoDetalle_Click
	
	If lblcantidad.Text < 1 Then
		Msgbox("Si va ha agregar este producto debe seleccionar por lo menos una unidad","")
		Return
	End If
	
	salvar_detalle_temporal(mapadetalle,lblcantidad.Text)
	Sleep(200)
	btnBackDetalles_Click
End Sub

#End Region




