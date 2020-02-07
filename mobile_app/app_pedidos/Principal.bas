B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=7.8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	Dim idEmpresa As Int = 1053 '1000
	Dim impuestoIncluido As Boolean = True
	Dim mapEmpresaInfo As Map = Null
	Dim cantidadProduto As Int = 0
	Dim mapaDetalle As Map
	Dim ismodal, isfav As Boolean
	Dim listafavoritos As List
	Dim buscarfavoritosvar As Boolean = True
	Dim keyotraparte As Boolean = True
	Dim SendClickFav As Boolean = False
	Dim SendClickAbout As Boolean = False
	Dim imgfavDetalle As Boolean = False
	Dim actu As Boolean = False
	Dim loadagain As Boolean = False
	Dim actualizame As Boolean =False
	Dim mapaDetalleImagen As Map 
	Dim isUsa As Boolean = False
	
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	'------------------------------
	
	'VARIABLE SLIDE
	Dim sm As SlideMenu
	
	Private ViewCategoria As ScrollView
	Private btnAbierto As Button
	Private btnEmpresaInfo As Button
	Private btnMasVendido As Button
	Private btnOrden As Button
	Private btnPrincipalBack As Button
	Private lblLema As Label
	Private PanelCategoria As Panel
	Private PanelMenu As Panel
	Private PanelTitulo As Panel
	Private lblCategoria As Label
	
	Private lblCantidadProductos As Label
	Private btnBuscarProducto As Button
	
	
	'BUSCAR PRODUCTO MODAL
	Private btnProductoVolver As Button
	Private ListProductosModalView As ListView
	Private PanelModalProducto As Panel
	Private txtBuscarProducto As EditText
	Private btnProductoBuscarModal As Button
	
	'EMPRESA INFO
	Private btnInfoCerrar As Button
	Private PanelInfoBack As Panel
	Private lblDireccion As Label
	Private lblInfoEmpresa As Label
	Private lblInfoNegocio As Label
	Private lblPedidoMinimo As Label
	Private lblTelefono As Label
	
	'SLIDE MENU
	Private PanelSlide As Panel
	Private PanelSlideBack As Panel
	Private btnSlideVolver As Button
	
	'SCROLL HORIZONTAL
	Dim hscrol As HorizontalScrollView
	
	'DETALLE DE PRODUCTOS
	
	Private btnagregarCarritoDetalle As Button
	Private btnBackDetalles As Button
	Private btnless As Button
	Private btnMore As Button
	Private lblcantidad As Label
	Private PanelFondoDetalles As Panel
	Private lblPrecioEncabezado As Label
	Private lblNombeEncabezado As Label
	Private lblPrecio As Label
	Private ImageViewDetalles As ImageView
	Private PanelFondoFavorito As Panel
	Private btnBackFavoritos As Button
	Private lblCantProductos As Label
	Private LlistaFavoritos As ListView
	Private btnIniciarSecion As Button
	Private btnBackAboutus As Button
	Private PanelFondoAboutus As Panel
	Private imgdetallefav As ImageView
End Sub

Sub Activity_Create(FirstTime As Boolean)
	
	Dim hc As OkHttpClient
	hc.InitializeAcceptAll("httpscliente")
	
	
	'Do not forget to load the layout file created with the visual designer. For example:
	hscrol.Initialize(100%x,"")
	
	Activity.LoadLayout("frmPrincipalv2")
	
	If FirstTime Then

		Dim json As String
		json = "'f_imei':"&Main.imei
	
		Dim cantidadPro As HttpJob
		cantidadPro.Initialize("cantidadPro",Me)
		cantidadPro.PostString(Main.url&"puntoventa/get_canitdad_producto_Login","json="&funcion.crearJson(Main.tokenPublico,json))

	End If
	
	If Main.logged Then
		
		BuscarFavoritos
		
		Dim JobEmpresaInfo As HttpJob
		JobEmpresaInfo.Initialize("JobEmpresaInfo",Me)
		JobEmpresaInfo.PostString(Main.url&"ws/get_datos_preferencia","json="&funcion.crearJson(Main.token,"'f_idempresa':"&idEmpresa))
		Else	
		cargarDatos
	End If
	
	sm.Initialize(Activity,Me,"SlideMenu",8%y,75%x, Colors.ARGB(230,255,250,250))
	funcion.GenerarSlideMenu(sm)
		
		
	
End Sub

Sub BuscarFavoritos
	
	Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
	",'f_idempresa':"&1000
	Dim jobFavoritos As HttpJob
	jobFavoritos.Initialize("buscarFavoritos",Me)
	jobFavoritos.PostString(Main.url&"puntoventa/buscarfav","json="&funcion.crearJson(Main.token,json))
	
End Sub

Sub cargarDatos
	If actu Then
		ViewCategoria.Panel.RemoveAllViews
	End If
	
	cargarMasVendido
	cargarAllProductos
End Sub

Sub cargarMasVendido
	
	Dim json As String
	json = "'f_idempresa':"&idEmpresa
	Dim JobProductoMasVendido As HttpJob
	JobProductoMasVendido.Initialize("JobProductoMasVendido",Me)
	JobProductoMasVendido.PostString(Main.url&"ws/get_productos_main_page","json="&funcion.crearJson(Main.tokenPublico,json))
	
End Sub


Sub cargarAllProductos
	
	Dim json As String
	json = "'f_idempresa':"&idEmpresa&",'f_parametro':'%'"
	
	Dim JobBuscarProducto As HttpJob
	JobBuscarProducto.Initialize("JobBuscarProducto",Me)
	JobBuscarProducto.PostString(Main.url&"ws/get_productos_by_paramentros","json="&funcion.crearJson(Main.tokenPublico,json))
	
End Sub

#Region paneles

Sub btnAddPro_Click
	Dim mapa As Map
	mapa.Initialize
	
	Dim b As Button
	b.Initialize("")
	b = Sender
	
	mapa = b.Tag
	
	If mapa.Get("f_precio") <= 0 Then
		
		Msgbox("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este","Aviso")
		
		Else
		mapaDetalle.Initialize
		salvar_detalle_temporal(mapa,1)
	End If
	
End Sub

Sub PanelFondoPro_Click
	Dim mapa As Map
	mapa.Initialize
	
	Dim b As Panel
	b.Initialize("")
	b = Sender
	
	mapa = b.Tag

	mapaDetalle = mapa
	'ENVIARLO AQUI AL DETALLE
	
	If PanelFondoDetalles.IsInitialized == False Then
		Activity.LoadLayout("frmDetallesProducto")
		PanelFondoDetalles.Visible = False
	End If
	
	Dim bm As BitmapDrawable
		
	If mapa.Get("f_destacado") Then
	
		If  mapa.Get("f_foto") <> Null And mapa.Get("f_foto") <> "" Then
			bm = funcion.getImagen(mapa.Get("f_foto"))

			bm.Gravity = Gravity.FILL
			ImageViewDetalles.Background = bm
			'ImageViewDetalles.Background =  mapa.Get("f_foto")
			
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
			bm.Gravity = Gravity.FILL
			ImageViewDetalles.Background = bm
		End If
	
	Else
		If  mapa.Get("f_foto") <> "" Then
'			bm = funcion.getImagen(mapa.Get("f_foto"))

			ImageViewDetalles.Background =  mapa.Get("f_foto")
			
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
			bm.Gravity = Gravity.FILL
			ImageViewDetalles.Background = bm
		End If
	
    End If
		
		Dim bmimgfav As BitmapDrawable
		
'		If mapa.Get("f_red") Then
'			
'		bmimgfav.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
'		bmimgfav.Gravity = Gravity.FILL
'		
'			Else
'				
'		bmimgfav.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
'		bmimgfav.Gravity = Gravity.FILL
'	End If
			
	If Main.logged Then
		
		For i=0 To listafavoritos.Size-1
		
			Dim mimap As Map = listafavoritos.Get(i)
		
			If mapa.Get("f_idrecord") == mimap.Get("f_idproducto") Then
				bmimgfav.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
				i = listafavoritos.Size
				imgdetallefav.Tag = True
			End If
		
		Next
		
	End If

	If bmimgfav.IsInitialized == False Then
		bmimgfav.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
		imgdetallefav.Tag = False
	End If

	imgdetallefav.Background = bmimgfav
	
	lblPrecioEncabezado.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	lblNombeEncabezado.Text = mapa.Get("f_descripcion")
	lblcantidad.Text = 1
	lblPrecio.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	PanelMenu.SetVisibleAnimated(500, False)
	PanelFondoDetalles.SetVisibleAnimated(500,True)
	
	ismodal = False
	
End Sub

Sub imgFav_Click
	
	If Main.logged Then
		
		Dim img As ImageView
		img.Initialize("")
		img = Sender
	
		Dim mapa As Map
		mapa.Initialize
	
		mapa = img.Tag
		
		mapaDetalleImagen = mapa
	
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
			
		Dim res As Int
			
		res = Msgbox2("Para agregar un producto a favoritos primero debe iniciar Sesión","Desea iniciar sesión","Si","","Mas tarde",Null)

		If res ==  DialogResponse.POSITIVE  Then
			Main.mostar = True
			StartActivity(Main)
			
		Else
			Return
		End If
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
	
	If actu Then
		BuscarFavoritos
		actu = False
		ToastMessageShow("Actualizando sus productos",False)
		Sleep(200)
		PanelFondoDetalles.SetVisibleAnimated(500,False)
		PanelMenu.SetVisibleAnimated(500,True)
		Return
	End If
	
	If isfav Then
		PanelFondoDetalles.SetVisibleAnimated(500,False)
		PanelFondoFavorito.SetVisibleAnimated(500,True)
		Return
	End If
	
	If ismodal Then
		
		PanelFondoDetalles.SetVisibleAnimated(500,False)
		PanelMenu.SetVisibleAnimated(500,True)
		PanelModalProducto.SetVisibleAnimated(500,True)
		
	Else
		PanelFondoDetalles.SetVisibleAnimated(500,False)
		PanelMenu.SetVisibleAnimated(500,True)
	End If
	
End Sub

Sub btnagregarCarritoDetalle_Click
	
	If lblcantidad.Text < 1 Then
		Msgbox("Si va ha agregar este producto debe seleccionar por lo menos una unidad","")
		Return
	End If
	
	If mapaDetalle.Get("f_precio") <= 0 Then
		Msgbox("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este","Aviso")
		
		Else
			
		salvar_detalle_temporal(mapaDetalle,lblcantidad.Text)
		Sleep(200)
		btnBackDetalles_Click
			
	End If
	
End Sub

#End Region

Sub cargarCaterorias
	Dim JobCategoria As HttpJob
	JobCategoria.Initialize("JobCategoria",Me)
	JobCategoria.PostString(Main.url&"ws/get_categorias_by_empresa/","json="&funcion.crearJson(Main.token,"'f_idempresa':"&idEmpresa))
	btnMasVendido.Text = "Ver ofertas "
	btnMasVendido.Tag = False
End Sub

Sub JobDone(Job As HttpJob)
	
	If btnProductoBuscarModal.IsInitialized And btnProductoBuscarModal.Enabled = False Then
		btnProductoBuscarModal.Enabled = True
	End If
	
	If Job.Success = False Then
		Msgbox(Main.jobMsj,Main.jobMsjTitle)
		Return
	End If
	
	If funcion.verificarJob(Job.GetString)=False Then
		Return
	End If
	
	Dim map As Map
	Dim list As List
	Dim json As JSONParser
	json.Initialize(funcion.base64_Decode(Job.GetString))
	Log("KLOK"&funcion.base64_Decode(Job.GetString))
	map = json.NextObject
	
	
	Select Job.JobName
		
		Case "JobEmpresaInfo"
			
			list = map.Get("f_data")
			mapEmpresaInfo = list.Get(0)
			isUsa = mapEmpresaInfo.Get("f_adressusa")
			
'			btnAbierto.Enabled = mapEmpresaInfo.Get("f_laborando")
'			If btnAbierto.Enabled Then
'				btnAbierto.Text = "Abierto"
'				btnAbierto.TextColor = Colors.RGB(12,166,0)
'			Else
'				btnAbierto.Text = "Cerrado"
'				btnAbierto.TextColor = Colors.RGB(192,13,13)
'			End If
			
		Case "JobCategoria"
			list = map.Get("f_data")
			lblCategoria.Text = list.Size & " Categotias"
			cargarViewProductos(list, True)
		
		Case "JobProductoByCategoria"
			Msgbox("","PRODUCTOS AHORA")
			list = map.Get("f_data")
			Log(map.Get("f_data"))
			If list.Size = 0 Then
				Msgbox("Esta categoria no tiene productos.","Información")
				Return
			End If
			
			lblCategoria.SetTextColorAnimated(300,Colors.Transparent)
'			Dim ani As Animation
'			ani.InitializeTranslate("ViewProducto",0,0,120%x,0)
'			ani.Duration = 500
'			ani.RepeatMode = ani.REPEAT_REVERSE
'			ani.RepeatCount = 1
'			ani.Start(PanelCategoria)
			PanelCategoria.Tag = list
			lblCategoria.Text =  list.Size & " Productos"
			lblCategoria.SetTextColorAnimated(200,Colors.Black)
			cargarViewProductos(list, False)
			
		
		Case "JobDetalleTemporal"

			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			cantidadProduto = cantidadProduto + 1
			lblCantidadProductos.Text = cantidadProduto
			lblCantidadProductos.Visible = True
			ToastMessageShow("Producto agregado al carrito.",False)
			
		Case "JobProductoMasVendido"
			list = map.Get("f_data")
			
'MODIFICACION DE LO MAS VENDIDOS

			Dim lef As Int = 2%x
			Dim mapa As Map
			mapa.Initialize
			
			Dim widhth As Int = list.Size*47%x
			hscrol.Initialize(widhth,"")
			
			For i = 0 To list.Size-1
				mapa = list.Get(i)
				hscrol.Panel.AddView(funcion.createPanelProducto(mapa),lef,1%y,46%x,38%y)
				lef = lef + 47%x
			Next
			hscrol.Color = Colors.RGB(237, 237, 238)
			
			Dim lblmasVendidos As Label
			lblmasVendidos.Initialize("")
			
			lblmasVendidos.Text = "Mas vendidos"
			lblmasVendidos.TextColor = Colors.RGB(97, 97, 97)
			lblmasVendidos.TextSize = 16
			
			ViewCategoria.Panel.AddView(lblmasVendidos,2%x,0,70%x,5%y)
			
			ViewCategoria.Panel.AddView(hscrol,1%x,lblmasVendidos.Top + 5%y,95%x,36%y)
			
			
			
		Case "JobBuscarProducto"

			list = map.Get("f_data")
			If list.Size = 0 Then
				Msgbox("No se ha encontrado productos con esta referencia","Información")
				Return
			End If
			
			Dim lblProductos As Label
			lblProductos.Initialize("")
			
			lblProductos.Text = "Productos"
			lblProductos.TextSize = 16
			lblProductos.TextColor = Colors.RGB(97, 97, 97)
			
			ViewCategoria.Panel.AddView(lblProductos,1%x,hscrol.Top + 36%y,70%x,5%y)

			If list.Size > 20 Then
				
				Dim alttop As Int  = lblProductos.Top + 6%y
				
				For i=0 To 19
					map = list.Get(i)
					Dim bm As BitmapDrawable
					If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
						bm = funcion.getImagen(map.Get("f_foto"))
						
					Else
						bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
					End If
					
					Dim lefpro As Int = 2%x
					
					If i Mod 2 == 0 Then
						
						lefpro = 2%x
						ViewCategoria.Panel.AddView(funcion.createPanelProductoScroll(map,bm),lefpro,alttop,46%x,36%y)
						
						If i == list.Size-1 Then
							alttop = alttop+37%y
						End If
						
						Else
							
						lefpro = lefpro + 47%x
						ViewCategoria.Panel.AddView(funcion.createPanelProductoScroll(map,bm),lefpro,alttop,46%x,36%y)
						alttop = alttop+37%y
						
					End If
					
				Next
				
				ViewCategoria.Panel.Height = alttop
				
			Else
				
				Dim alttop As Int  = lblProductos.Top + 6%y
				
				For i=0 To list.Size-1
					map = list.Get(i)
					Dim bm As BitmapDrawable
					If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
						bm = funcion.getImagen(map.Get("f_foto"))
					Else
						bm.Initialize(LoadBitmap(File.DirAssets,"packing.png"))
					End If
					
					'ListProductosModalView.AddTwoLinesAndBitmap2(map.Get("f_descripcion"),"Precio: "&NumberFormat(map.Get("f_precio"),0,2), bm.Bitmap,map)
					
					Dim lefpro As Int = 2%x
					
					If i Mod 2 == 0 Then
						
						lefpro = 2%x
						ViewCategoria.Panel.AddView(funcion.createPanelProductoScroll(map,bm),lefpro,alttop,46%x,36%y)
						
					Else
							
						ViewCategoria.Panel.Height = ViewCategoria.Panel.Height+ 32.2%y
						lefpro = lefpro + 47%x
						ViewCategoria.Panel.AddView(funcion.createPanelProductoScroll(map,bm),lefpro,alttop,46%x,36%y)
						alttop = alttop+37%y
						
					End If
					
				Next
				
			End If
			
		Case "JobBuscarProductoLista"
			
			list = map.Get("f_data")
			If list.Size = 0 Then
				Msgbox("No se ha encontrado productos con esta referencia","Información")
				Return
			End If
			
			ListProductosModalView.Clear
			
			Dim bm As BitmapDrawable
			For i = 0 To list.Size-1
				Dim mapalist As Map
				mapalist = list.Get(i)
				
				If  mapalist.Get("f_foto")<> Null And  mapalist.Get("f_foto") <> "" Then
					bm = funcion.getImagen(mapalist.Get("f_foto"))
				Else
					bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
				End If
				
				ListProductosModalView.AddTwoLinesAndBitmap2(mapalist.Get("f_descripcion"),"Precio: "&NumberFormat(mapalist.Get("f_precio"),0,2),bm.Bitmap,mapalist)
			Next
			
		Case "buscarFavoritos"
			
			If listafavoritos.IsInitialized Then
				listafavoritos.Clear
			End If
			
			listafavoritos = map.Get("f_data")
			buscarfavoritosvar = False
           cargarDatos
			
		Case "addFavoritos"
			
			If map.Get("f_data") Then
				
				listafavoritos.Add(mapaDetalleImagen)
				
				ToastMessageShow("Producto agregado a favoritos",False)
				Else
				ToastMessageShow("Error al agregar su producto a favoritos",False)
			End If
			
		Case "deleteFavoritos"
			
			If map.Get("f_data") Then
				ToastMessageShow("Producto eliminado de favorito",False)
				
				For i=0 To listafavoritos.Size-1
					
					Dim map As Map = listafavoritos.Get(i)
					
					If map.Get("f_idrecord") == mapaDetalleImagen.Get("f_idproducto") Then
						listafavoritos.RemoveAt(i)
						i = listafavoritos.Size
					End If
				Next
				
				Sleep(100)
				
			Else
				ToastMessageShow("Hubo un error a remover este producto de su lista de favritos",False)
			End If
			
		Case "RefreshFavoritos"
			If listafavoritos.IsInitialized Then
				listafavoritos.Clear
			End If
			
			listafavoritos = map.Get("f_data")
			cargarListaFavoritos
			
		Case "cantidadPro"
			
			cantidadProduto = map.Get("f_data")
			
			If cantidadProduto <> 0 Then
				
				lblCantidadProductos.Text = cantidadProduto
				lblCantidadProductos.Visible = True
				
			End If
			
			
	End Select
	
End Sub

Sub ViewProducto_AnimationEnd
	
End Sub

Sub cargarViewProductos(list As List, categorias As Boolean)
	
	Dim map As Map
	Dim height,  panelHeight As Int
	panelHeight = 2%y
	height = 18%y
	
	ViewCategoria.Panel.RemoveAllViews
	ViewCategoria.Tag = categorias
	ViewCategoria.Panel.Height = 100%y
	For i=0 To list.Size -1
		map = list.Get(i)
		
		Dim btn As Button
		If categorias Then
			btn.Initialize("btnViewCategoria")
		Else
			btn.Initialize("btnViewProducto")
		End If
		
		btn.Tag = map
		btn.TextColor = Colors.White
		btn.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
		
		'
		Dim bm As BitmapDrawable
		If categorias Then
			If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
				bm = funcion.getImagen(map.Get("f_foto"))    
			Else
				bm.Initialize(LoadBitmap(File.DirAssets,"cook-food.jpeg"))
				bm.Gravity = Gravity.FILL
			End If
			btn.Text = map.Get("f_descripcion")
			btn.TextSize = 20
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"pexels-photo.jpeg"))
			bm.Gravity = Gravity.CENTER
			btn.Text = map.Get("f_descripcion") &CRLF&CRLF& "RD$" & NumberFormat(map.Get("f_precio"),0,2)
			btn.TextSize = 15
		End If
		btn.Background = bm
				
		ViewCategoria.Panel.AddView(btn,2%x, panelHeight, 90%x, height)
		btn.Visible = False
		btn.SetVisibleAnimated(500,True)
		'ViewCategoria.Panel.AddView(btn,2%x, panelHeight,   PanelCategoria.Width - 4%x , height)
		panelHeight = height + panelHeight + 2%y
	Next
	ViewCategoria.Panel.Height = panelHeight
End Sub

Sub btnViewCategoria_Click
	
	Dim b As Button
	b = Sender
	Dim map As Map = b.Tag
	Dim json As String = "'f_idempresa':"&idEmpresa&",'f_idcategoria':"&map.Get("f_idrecord")
	
	Dim JobProductoByCategoria As HttpJob
	JobProductoByCategoria.Initialize("JobProductoByCategoria",Me)
	JobProductoByCategoria.PostString(Main.url&"ws/get_productos_by_categoria","json="&funcion.crearJson(Main.token,json))
	
End Sub

Sub btnViewProducto_Click
	
	If mapEmpresaInfo.IsInitialized And mapEmpresaInfo.Get("f_laborando") = False Then
		Msgbox("No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales.","Información")
		Return
	End If
	
	Dim b As Button = Sender
	Dim map As Map = b.Tag
	salvar_detalle_temporal(map,1)
End Sub

Sub salvar_detalle_temporal(map As Map, cantidad As Int )
	
	Dim mapCalculos As Map = funcion.recalcular(map.Get("f_precio"),0, cantidad ,map.Get("f_tax"), impuestoIncluido,  False)
	
	Dim json As String
	json = "'f_regresa':false"& _
			",'f_idempresa':"&idEmpresa& _
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
	JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funcion.crearJson(Main.tokenPublico,json))
	
End Sub

Sub Activity_Resume
	
	If Main.cargaragain And loadagain Then
		
		Dim json As String
		json = "'f_imei':"&Main.imei
	
		Dim cantidadPro As HttpJob
		cantidadPro.Initialize("cantidadPro",Me)
		cantidadPro.PostString(Main.url&"puntoventa/get_canitdad_producto_Login","json="&funcion.crearJson(Main.tokenPublico,json))
		
		BuscarFavoritos
		
		Dim JobEmpresaInfo As HttpJob
		JobEmpresaInfo.Initialize("JobEmpresaInfo",Me)
		JobEmpresaInfo.PostString(Main.url&"ws/get_datos_preferencia","json="&funcion.crearJson(Main.token,"'f_idempresa':"&idEmpresa))
		
		
		sm.Initialize(Activity,Me,"SlideMenu",8%y,75%x, Colors.ARGB(230,255,250,250))
		funcion.GenerarSlideMenu(sm)
		
		btnIniciarSecion.Text = "Iniciar Sesión"
		
		Main.cargaragain = False
		loadagain = False
		
	End If
	
	lblCantidadProductos.Text = cantidadProduto
	lblCantidadProductos.Visible = True
	If cantidadProduto == 0 Then
		lblCantidadProductos.Visible = False
	End If
	
	If Main.logged And buscarfavoritosvar And keyotraparte Then 
		BuscarFavoritos
	
		Dim JobEmpresaInfo As HttpJob
		JobEmpresaInfo.Initialize("JobEmpresaInfo",Me)
		JobEmpresaInfo.PostString(Main.url&"ws/get_datos_preferencia","json="&funcion.crearJson(Main.token,"'f_idempresa':"&idEmpresa))
	End If
	
	If SendClickFav Then
		btnMasVendido_Click
		SendClickFav = False
	End If
	
	If SendClickAbout Then
		mostrarAbout
		SendClickAbout = False
	End If
	
	If Main.logged Then
		sm.Initialize(Activity,Me,"SlideMenu",8%y,75%x, Colors.ARGB(230,255,250,250))
		funcion.GenerarSlideMenu(sm)
	End If
	
	
	If Main.logged Then
		btnIniciarSecion.Text = "Sr. "&Main.usersData.nombre
	End If
	
	
	keyotraparte = True
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btnOrden_Click
	StartActivity(Facturacion)
End Sub

Sub mostrarAbout
	
	If PanelFondoAboutus.IsInitialized == False Then
		Activity.LoadLayout("frmAboutUs")
		PanelFondoAboutus.Visible = False
	End If
	
	PanelMenu.SetVisibleAnimated(250,False)
	PanelFondoAboutus.SetVisibleAnimated(250,True)
	
End Sub

Sub btnMasVendido_Click
	
	If Main.logged Then
		
		If PanelFondoFavorito.IsInitialized = False Then
			Activity.LoadLayout("frmProductosFavoritos")
			PanelFondoFavorito.Visible = False
		
			LlistaFavoritos.TwoLinesAndBitmap.ItemHeight = 12%y
	
			LlistaFavoritos.TwoLinesAndBitmap.Label.TextColor = Colors.Black
			LlistaFavoritos.TwoLinesAndBitmap.Label.TextSize = 15
			LlistaFavoritos.TwoLinesAndBitmap.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
			LlistaFavoritos.TwoLinesAndBitmap.Label.Padding = Array As Int(30dip,0,0,0)
	
			LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Gray
			LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
			LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.Height = -1
			funcion.SetDivider(LlistaFavoritos,Colors.LightGray,1dip)
		
		End If
		
		PanelFondoFavorito.SetVisibleAnimated(250,True)
	
		Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
	",'f_idempresa':"&idEmpresa
		Dim jobFavoritos As HttpJob
		jobFavoritos.Initialize("RefreshFavoritos",Me)
		ToastMessageShow("Cargando sus Favoritos",False)
		jobFavoritos.PostString(Main.url&"puntoventa/buscarfav","json="&funcion.crearJson(Main.token,json))
	
		PanelMenu.Visible = False
		PanelFondoFavorito.SetVisibleAnimated(250,True)
	
		lblCantProductos.Text = "Productos Favoritos: "&listafavoritos.Size
	
		isfav = True
		
		Else
			
			Dim res As Int 
			
			res = Msgbox2("Para buscar en sus productos favoritos primero debe iniciar Sesión","Desea iniciar sesión","Si","","Mas tarde",Null)

			If res ==  DialogResponse.POSITIVE  Then
			Main.mostar = True
			StartActivity(Main)
			
			Else
				Return
			End If
			
	End If
	
		
End Sub


#Region ProductosFavoritos

Sub cargarListaFavoritos
	
	Dim bm As BitmapDrawable
	LlistaFavoritos.Clear
	lblCantProductos.Text = "Productos Favoritos: "&listafavoritos.Size
	For i = 0 To listafavoritos.Size-1
		Dim mapalist As Map
		mapalist = listafavoritos.Get(i)
		
	
		If  mapalist.Get("f_foto")<> Null And  mapalist.Get("f_foto") <> "" Then
			bm = funcion.getImagen(mapalist.Get("f_foto"))
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
		End If
		
		mapalist.Put("f_red",True)
				
		LlistaFavoritos.AddTwoLinesAndBitmap2(mapalist.Get("f_descripcion"),"Precio: "&NumberFormat(mapalist.Get("f_precio"),0,2),bm.Bitmap,mapalist)
	
	Next
	
End Sub



Sub imgdetallefav_Click
	
	
	If Main.logged Then
		
		If imgfavDetalle Then
		
			Dim img As ImageView
			img  = Sender
	
			Dim mapa As Map
			mapa = img.Tag
	
			If mapa.Get("f_red") Then
		
				Dim r As Int
				r = Msgbox2("Desea eliminar este producto de su lista de favoritos?","Aviso","Si","","No",Null)
	
				If r == DialogResponse.POSITIVE Then
			
					Dim listaaux As List
					listaaux.Initialize
			
					For i=0 To listafavoritos.Size-1
			
						Dim mapadel As Map
						mapadel = listafavoritos.Get(i)
			
						If mapa.Get("f_idrecord") <> mapadel.Get("f_idrecord") Then
					
							listaaux.Add(mapadel)
						End If
			
					Next
		
					listafavoritos.Clear
					listafavoritos = listaaux
			
					Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
		    ",'f_idproducto':"&mapa.Get("f_idrecord") 
		
					Dim deleteFavoritos As HttpJob
					deleteFavoritos.Initialize("deleteFavoritos",Me)
					deleteFavoritos.PostString(Main.url&"puntoventa/deletefav","json="&funcion.crearJson(Main.token,json))
			
					cargarListaFavoritos
					isfav = True
					imgfavDetalle= False 
					actualizame = True
					btnBackDetalles_Click
		
				Else
					Return
				End If
		
			End If
		
		
		Else
			
			Dim bmaux As BitmapDrawable
			If mapaDetalle.Get("f_red") Then
			
				bmaux.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
				bmaux.Gravity = Gravity.FILL
			
			imgdetallefav.Background = bmaux
			
				Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
		",'f_idproducto':"&mapaDetalle.Get("f_idrecord") 
		
				Dim deleteFavoritos As HttpJob
				deleteFavoritos.Initialize("deleteFavoritos",Me)
				deleteFavoritos.PostString(Main.url&"puntoventa/deletefav","json="&funcion.crearJson(Main.token,json))
				
				mapaDetalle.Put("f_red",False)
				actu = True
				
			Else
				
				bmaux.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
				bmaux.Gravity = Gravity.FILL
				
				imgdetallefav.Background = bmaux
			
				Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario& _
		",'f_idproducto':"&mapaDetalle.Get("f_idrecord") 
		
				Dim putFavoritos As HttpJob
				putFavoritos.Initialize("addFavoritos",Me)
				putFavoritos.PostString(Main.url&"puntoventa/addfav","json="&funcion.crearJson(Main.token,json))
			
				mapaDetalle.Put("f_red",True)
				actu = True
				
			End If
			
		End If
	
		
		Else
			Msgbox("Para agregar productos a favoritos primero debe iniciar Sesión","Aviso")
			
	End If
End Sub


Sub LlistaFavoritos_ItemClick (Position As Int, Value As Object)
	
	imgfavDetalle = True
	Dim mapa As Map
	mapa = Value
	Dim bm As BitmapDrawable
	Dim bmfav As BitmapDrawable
	
	If mapa.ContainsKey("f_foto") Then
		'SI TIENE EL CAMPO DE FOTO
		If  mapa.Get("f_foto") <> Null And mapa.Get("f_foto") <> "" Then
			bm = funcion.getImagen(mapa.Get("f_foto"))
			
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
			bm.Gravity = Gravity.FILL
		End If
		
	Else
		bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
		bm.Gravity = Gravity.FILL
	End If
	
	If PanelFondoDetalles.IsInitialized == False Then
		Activity.LoadLayout("frmDetallesProducto")
		PanelFondoDetalles.Visible = False
	End If
	
	bmfav.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
	bmfav.Gravity = Gravity.FILL
	
	imgdetallefav.Background = bmfav
	imgdetallefav.Tag = mapa
	
	ImageViewDetalles.Background = bm
	lblPrecioEncabezado.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	lblNombeEncabezado.Text = mapa.Get("f_descripcion")
	lblcantidad.Text = 1
	lblPrecio.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	PanelFondoFavorito.SetVisibleAnimated(250, False)
	mapaDetalle = mapa
	PanelFondoDetalles.SetVisibleAnimated(250,True)
	
End Sub

Sub btnBackFavoritos_Click
	
	isfav = False
	LlistaFavoritos.Clear
	PanelFondoFavorito.Visible = False
	
	PanelMenu.SetVisibleAnimated(250,True)
	
	If actualizame Then
		cargarDatos
		actualizame = False
	End If
	
End Sub

#End Region

Sub btnEmpresaInfo_Click
	
	If  mapEmpresaInfo.IsInitialized =False Or mapEmpresaInfo = Null Then
		Msgbox("Buscando información del negocio...","Información")
		Return
	End If
	
	If PanelInfoBack.IsInitialized = False Then
		Activity.LoadLayout("frmInfoEmpresa")
	End If
	PanelInfoBack.Visible = False
	PanelInfoBack.SetVisibleAnimated(300,True)
	
	funcion.DisableView(True,PanelMenu)
	funcion.DisableView(False,PanelInfoBack)
	
	lblInfoEmpresa.Text = mapEmpresaInfo.Get("f_nombre")
	lblInfoNegocio.Text = mapEmpresaInfo.Get("f_tipo_negocio")
	lblPedidoMinimo.Text =  "RD$ "&mapEmpresaInfo.Get("f_pedidos_minimos")
	lblTelefono.Text = mapEmpresaInfo.Get("f_telefono")
	lblDireccion.Text = mapEmpresaInfo.Get("f_direccion")
		
End Sub

Sub btnPrincipalBack_Click
	'Activity.Finish
	'openSlide
	
	sm.Show
	
End Sub

Sub btnInfoCerrar_Click
	PanelInfoBack.SetVisibleAnimated(300,False)
	funcion.DisableView(False,PanelMenu)
	funcion.DisableView(True,PanelInfoBack)
End Sub

Sub btnBuscarProducto_Click
	
	If PanelModalProducto.IsInitialized = False Then
		Activity.LoadLayout("frmProducoModal")
		
		ListProductosModalView.TwoLinesAndBitmap.ItemHeight = 10%y
	
		ListProductosModalView.TwoLinesAndBitmap.Label.TextColor = Colors.Black
		ListProductosModalView.TwoLinesAndBitmap.Label.TextSize = 15
		ListProductosModalView.TwoLinesAndBitmap.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
		ListProductosModalView.TwoLinesAndBitmap.Label.Padding = Array As Int(30dip,0,0,0)
	
		ListProductosModalView.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Gray
		ListProductosModalView.TwoLinesAndBitmap.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
		ListProductosModalView.TwoLinesAndBitmap.SecondLabel.Height = -1
		funcion.SetDivider( ListProductosModalView,Colors.LightGray,1dip)
		
	End If
	
	PanelModalProducto.Visible = False
	funcion.DisableView(False,PanelModalProducto)
	
	PanelModalProducto.SetVisibleAnimated(250,True)
	funcion.DisableView(True,PanelMenu)
	txtBuscarProducto.RequestFocus
End Sub


#Region BuscarProducto

Sub txtBuscarProducto_EnterPressed
	'btnProductoBuscarModal_Click
End Sub

Sub ListProductosModalView_ItemClick (Position As Int, Value As Object)
	'salvar_detalle_temporal(Value) 
	
	Dim mapa As Map
	mapa = Value
	
	Dim bm As BitmapDrawable 
	
	If mapa.ContainsKey("f_foto") Then
		'SI TIENE EL CAMPO DE FOTO
		If  mapa.Get("f_foto") <> "" Then
			bm = funcion.getImagen(mapa.Get("f_foto"))
			
		Else
			bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
			bm.Gravity = Gravity.FILL
		End If
		
	Else
		bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
		bm.Gravity = Gravity.FILL
	End If
	
	If PanelFondoDetalles.IsInitialized == False Then
		Activity.LoadLayout("frmDetallesProducto")
		PanelFondoDetalles.Visible = False
	End If
	
	ImageViewDetalles.Background = bm
	lblPrecioEncabezado.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	lblNombeEncabezado.Text = mapa.Get("f_descripcion")
	lblcantidad.Text = 1
	lblPrecio.Text = "$"&NumberFormat( mapa.Get("f_precio"),0,2)
	PanelModalProducto.SetVisibleAnimated(500, False)
	PanelMenu.SetVisibleAnimated(500, False)
	mapaDetalle = mapa
	PanelFondoDetalles.SetVisibleAnimated(500,True)
	
	ismodal = True
End Sub

Sub btnProductoVolver_Click
	
	funcion.DisableView(True,PanelModalProducto)
	funcion.DisableView(False,PanelMenu)
	PanelModalProducto.SetVisibleAnimated(250,False)
	
	txtBuscarProducto.Text = ""
	ListProductosModalView.Clear
	
End Sub


Sub btnProductoBuscarModal_Click
	If txtBuscarProducto.Text.Trim.Length = 0 Then
		Msgbox("Escriba el nombre del producto","Información")
		Return
	End If
	
	Dim json As String
	json = "'f_idempresa':"&idEmpresa&",'f_parametro':'"&txtBuscarProducto.Text.Replace("'","").Replace("""","")&"'"
	
	Dim JobBuscarProducto As HttpJob
	JobBuscarProducto.Initialize("JobBuscarProductoLista",Me)
	JobBuscarProducto.PostString(Main.url&"ws/get_productos_by_paramentros","json="&funcion.crearJson(Main.tokenPublico,json))
	btnProductoBuscarModal.Enabled = False
	
End Sub

#End Region


Sub openSlide
	
	Dim position,duration As Double
	Dim a As Animation
	
	If PanelSlideBack.IsInitialized= False Then
		Activity.LoadLayout("frmSlideOrden")
		PanelSlideBack.Visible = False
		PanelSlideBack.Tag = PanelSlide.Top
	End If
	
	If PanelSlideBack.Visible Then
		duration = 250
		position = -PanelSlideBack.Tag -PanelSlide.Height
		
	Else
		PanelSlide.Top = 100%y
		position = -70%y
		PanelSlideBack.SetVisibleAnimated(200,True)
		'Sleep(200)
		duration = 251
		
	End If
	
	a.InitializeTranslate("Slide",0,0,0,position)
	a.Duration = duration
	a.Start(PanelSlide)
End Sub


Sub Slide_AnimationEnd
	
	Dim a As Animation
	a = Sender
	
	If a.Duration = 251 Then
		PanelSlide.Top = PanelSlideBack.Tag
		funcion.DisableView( False,PanelSlide)
		funcion.DisableView(True,PanelMenu)
	Else
		PanelSlide.Top = 100%y
		PanelSlideBack.SetVisibleAnimated(200,False)
		funcion.DisableView(True,PanelSlide)
		funcion.DisableView(False,PanelMenu)
	End If
	
End Sub

Sub SlideOption_Click
	
	Dim p As Panel
	p = Sender
	
	If p.Tag = "Exit" Then
		Main.mostar = True
		openSlide
		Sleep(400)
		'Main.logged = False
		Activity.Finish
		StartActivity(Main)
	End If
	
	If p.Tag = "Direcciones" Then
		If Main.logged Then
			
			openSlide
			Sleep(400)
			StartActivity(p.Tag)
			Return
			
		Else
			Dim res As Int
			
			res = Msgbox2("Para agregar o ver sus direcciones primero debe iniciar Sesión","Desea iniciar sesión","Si","","Mas tarde",Null)

			If res ==  DialogResponse.POSITIVE  Then
				Main.mostar = True
				StartActivity(Main)
			
			Else
				Return
			End If
		End If
	End If
	
	'REPORTE DE ORDENES
	If p.Tag = "ReporteOrdenes" Then
		If Main.logged Then
			
			openSlide
			Sleep(400)
			StartActivity(p.Tag)
			Return
			
		Else
			Dim res As Int
			
			res = Msgbox2("Para ver sus ordenes realizadas primero debe iniciar Sesión","Desea iniciar sesión","Si","","Mas tarde",Null)

			If res ==  DialogResponse.POSITIVE  Then
				Main.mostar = True
				StartActivity(Main)
			
			Else
				Return
			End If
		End If
	End If
	openSlide
'	Activity.Finish 
    Sleep(400)
	StartActivity(p.Tag)
	
End Sub

Sub btnSlideVolver_Click
	openSlide
End Sub


Sub btnIniciarSecion_Click
	
	If Main.logged Then
		
		'Msgbox("Ya usted ha iniciado Sesión","Advertencia")
		
		Else
		Main.mostar = True
		StartActivity(Main)
	End If
	
End Sub

Sub SlideMenu_Click(Value As Object)
	
	funcion.ChangeScreen(Value,sm,Activity)
	
End Sub


Sub btnBackAboutus_Click
	
	PanelFondoAboutus.SetVisibleAnimated(250,False)
	PanelMenu.SetVisibleAnimated(250,True)
	
End Sub
















