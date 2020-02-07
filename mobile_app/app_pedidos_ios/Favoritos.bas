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
	
	Dim pageFv As Page
	Dim pagedetalle As Page
	Dim mapadetalle As Map
	Dim actu As Boolean = False
	Dim actuCantidad As Boolean = False
	
	Private hud As HUD

	Private lblCantProductos As Label
	Private btnBackFavoritos As Button
	Private LlistaFavoritos As CustomListView
	
	Dim MilitaFav As List
	Private lblNomCat As Label
	Private lblCantCat As Label
	Private imgCat As ImageView
	Private PanelFondoDetalles As Panel
	Private ImageViewDetalles As ImageView
	Private lblPrecioEncabezado As Label
	Private lblNombeEncabezado As Label
	Private imgdetallefav As ImageView
	Private lblcantidad As Label
	Private btnless As Button
	Private btnMore As Button
	Private lblPrecio As Label
	Private btnagregarCarritoDetalle As Button
	Private btnBackDetalles As Button
	Private PanelImagenDetalles As Panel
	Private PanellblCantidad As Panel
	Private PanelEncabezadoDetalles As Panel
	Private StepperCantidad As Stepper
	Private lblCantidadProductos As Label
End Sub

Sub Initilize 
	
	pageFv.Initialize("pageFv")
	pageFv.RootPanel.LoadLayout("frmFavoritos")
	Main.NavControl.ShowPage(pageFv)
	
	pagedetalle.Initialize("pagedetalle")
	
	Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
	",'f_idempresa':"&Main.idEmpresa
	Dim jobFavoritos As HttpJob
	jobFavoritos.Initialize("RefreshFavoritos",Me)
	hud.ToastMessageShow("Cargando sus Favoritos",False)
	MilitaFav.Initialize
	jobFavoritos.PostString(Main.url&"puntoventa/buscarfav","json="&funciones.crearJson(Main.token,json))
	
	Main.smc.Tag = "favoritos"
	
End Sub

Sub btnBackFavoritos_Click
	
	Main.NavControl.RemoveCurrentPage
	Main.smc.Tag = "inicio"
	
	If actuCantidad Then
		actuCantidad = False
		Main.actualizarCantidad
	End If
	
	If actu Then
		actu = False
		Main.actualizar
	End If

End Sub

Sub JobDone(Job As HttpJob)

	
	If Job.Success = False Then
		Msgbox(Main.jobMsj,Main.jobMsjTitle)
		Return
	End If
	
	If funciones.verificarJob(Job.GetString)=False Then
		Return
	End If
	
	Dim map As Map
	Dim list As List
	Dim json As JSONParser
	json.Initialize(funciones.base64_Decode(Job.GetString))
	map = json.NextObject
	
	Select Job.JobName
		
		Case "RefreshFavoritos"
			If MilitaFav.IsInitialized Then
				MilitaFav.Clear
			End If
			
			MilitaFav = map.Get("f_data")
			cargarListaFavoritos
		
		Case "JobDetalleTemporal"
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Main.cantidadProduto = Main.cantidadProduto + 1
'			lblCantidadProductos.Text = Main.cantidadProduto
'			lblCantidadProductos.Visible = True
			hud.ToastMessageShow("Producto agregado al carrito.",False)
			actuCantidad = True
			
		Case "deleteFavoritos"
			
			If map.Get("f_data") Then
				hud.ToastMessageShow("Producto eliminado de favorito",False)
				
				For i=0 To MilitaFav.Size-1
			
					Dim mapadel As Map
					mapadel = MilitaFav.Get(i)
			
					If mapadetalle.Get("f_idrecord") == mapadel.Get("f_idrecord") Then
						MilitaFav.RemoveAt(i)
						i = MilitaFav.Size
					End If
			
				Next
				
				actu = True
				cargarListaFavoritos
				btnBackDetalles_Click
			Else
				hud.ToastMessageShow("Hubo un error a remover este producto de su lista de favritos",False)
			End If
		
	End Select
	
End Sub
	

Sub cargarListaFavoritos
	
	Dim bm As Bitmap
	LlistaFavoritos.Clear
	lblCantProductos.Text = "Productos Favoritos: "&MilitaFav.Size
	For i = 0 To MilitaFav.Size-1
		Dim mapalist As Map
		mapalist = MilitaFav.Get(i)
		
	
		If  mapalist.Get("f_foto")<> Null And  mapalist.Get("f_foto") <> "" Then
			bm = funciones.getImagen(mapalist.Get("f_foto"))
		Else
			bm.Initialize(File.DirAssets,"no-image.jpg")
		End If
		
		mapalist.Put("f_red",True)
		
		LlistaFavoritos.Add(CreateListItem(mapalist.Get("f_descripcion"),"Precio: "&NumberFormat(mapalist.Get("f_precio"),0,2),bm,LlistaFavoritos.GetBase.Width,50dip),mapalist)
	
	Next
	
End Sub

Sub CreateListItem(Nombre As String, cantidad As String,img As Bitmap, Width As Int, Height As Int) As Panel
	
	Dim p As Panel
	p.Initialize("")
	p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) 'set the size before the layout is loaded
	p.LoadLayout("frmPanelesItems")
	lblNomCat.Text = Nombre
	lblCantCat.Text = cantidad
	imgCat.Bitmap = img
	Return p
	
End Sub

Sub LlistaFavoritos_ItemClick (Index As Int, Value As Object)
	
	Dim mapa As Map = Value
	mapadetalle = mapa
	
	pagedetalle.RootPanel.LoadLayout("frmDetalleProducto")
	
	Main.NavControl.ShowPage2(pagedetalle,True)
	
	Dim bm As Bitmap
	
	If  mapa.Get("f_foto") <> Null And mapa.Get("f_foto") <> "" Then
		bm = funciones.getImagen(mapa.Get("f_foto"))

		ImageViewDetalles.Bitmap= bm
			
	Else
		bm.Initialize(File.DirAssets,"no-image.jpg")

		ImageViewDetalles.Bitmap = bm
	End If
	
	'PARA PONER LO DE FAV
	
	Dim bmimgfav As Bitmap
	
	bmimgfav.Initialize(File.DirAssets,"heartRed.png")
	
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
	
End Sub

	
#Region

Sub btnagregarCarritoDetalle_Click
	
	If mapadetalle.Get("f_precio") <= 0 Then
		Msgbox("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este","Aviso")
		
	Else
			
		salvar_detalle_temporal(mapadetalle,lblcantidad.Text)
		Sleep(200)
		btnBackDetalles_Click
		
	End If
	
End Sub

Sub btnBackDetalles_Click
	Main.NavControl.RemoveCurrentPage
	Main.NavControl.ShowPage(pageFv)
End Sub

Sub StepperCantidad_ValueChanged (Value As Double)
	lblcantidad.Text = Value
End Sub


Sub imgdetallefav_Click
	
	Msgbox2("msgEliminar","Seguro que quiere quitar este producto de sus favoritos?","Aviso!!",Array("Si","No"))
	
End Sub

Sub msgEliminar_Click(ButtonText As String)

	If ButtonText = "Si" Then
		
		Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
		    ",'f_idproducto':"&mapadetalle.Get("f_idrecord") 
		
		Dim deleteFavoritos As HttpJob
		deleteFavoritos.Initialize("deleteFavoritos",Me)
		deleteFavoritos.PostString(Main.url&"puntoventa/deletefav","json="&funciones.crearJson(Main.token,json))
			
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

#End Region
	
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

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	





