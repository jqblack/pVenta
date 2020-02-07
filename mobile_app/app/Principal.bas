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
	Dim idEmpresa As Int = 1000 '1044
	Dim impuestoIncluido As Boolean = True
	Dim mapEmpresaInfo As Map = Null
	Dim cantidadProduto As Int = 0
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.
	'------------------------------
	
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
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("frmPrincipal")
	lblCantidadProductos.Visible = False
	
	Dim JobEmpresaInfo As HttpJob
	JobEmpresaInfo.Initialize("JobEmpresaInfo",Me)
	JobEmpresaInfo.PostString(Main.url&"ws/get_datos_preferencia","json="&funcion.crearJson(Main.token,"'f_idempresa':"&idEmpresa))
	cantidadProduto = 0
	
	'cargarCaterorias
	btnMasVendido.Tag = False
	btnMasVendido_Click
	
	
	Dim JobSendContacts As HttpJob
	JobSendContacts.Initialize("JobSendUSer",Me)
	JobSendContacts.PostString(Main.url&"login/set_salvar_contactos" ,"json="&funcion.crearJson(Main.token, "'f_agenda':"&funcion.GetAllContacts ))
End Sub

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
	map = json.NextObject
	
	
	Select Job.JobName
		
		Case "JobEmpresaInfo"
			
			list = map.Get("f_data")
			mapEmpresaInfo = list.Get(0)
			
			btnAbierto.Enabled = mapEmpresaInfo.Get("f_laborando")
			If btnAbierto.Enabled Then
				btnAbierto.Text = "Abierto"
				btnAbierto.TextColor = Colors.RGB(12,166,0)
			Else
				btnAbierto.Text = "Cerrado"
				btnAbierto.TextColor = Colors.RGB(192,13,13)
			End If
			
		Case "JobCategoria"
			list = map.Get("f_data")
			lblCategoria.Text = list.Size & " Categotias"
			cargarViewProductos(list, True)
		
		Case "JobProductoByCategoria"
			list = map.Get("f_data")
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
			lblCategoria.Text = list.Size & " Productos en oferta"
			cargarViewProductos(list,False)
			btnMasVendido.Text = "Ver cartegorias  " 
			btnMasVendido.Tag = True
			
		Case "JobBuscarProducto"
			ListProductosModalView.Clear
			list = map.Get("f_data")
			If list.Size = 0 Then
				Msgbox("No se ha encontrado productos con esta referencia","Información")
				Return
			End If
			
			For i=0 To list.Size -1
				map = list.Get(i)
				Dim bm As BitmapDrawable
				If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
					bm = funcion.getImagen(map.Get("f_foto"))
				Else
					bm.Initialize(LoadBitmap(File.DirAssets,"packing.png"))
				End If
				
				ListProductosModalView.AddTwoLinesAndBitmap2(map.Get("f_descripcion"),"Precio: "&NumberFormat(map.Get("f_precio"),0,2), bm.Bitmap,map)
			Next
		
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
	salvar_detalle_temporal(map)
End Sub

Sub salvar_detalle_temporal(map As Map)
	
	Dim mapCalculos As Map = funcion.recalcular(map.Get("f_precio"),0,1,map.Get("f_tax"), impuestoIncluido,  False)
	
	Dim json As String
	json = "'f_regresa':false"& _
			",'f_idempresa':"&idEmpresa& _
	  		",'f_tipo':1"& _
			",'f_idproducto':"&map.Get("f_idrecord")& _
			",'f_cantidad':1"& _
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

Sub Activity_Resume
	lblCantidadProductos.Text = cantidadProduto
	If cantidadProduto = 0 Then
		lblCantidadProductos.Visible = False
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub btnOrden_Click
	StartActivity(Facturacion)
End Sub

Sub btnMasVendido_Click
	
	If btnMasVendido.Tag Then
		cargarCaterorias
	Else
		Dim json As String
		json = "'f_idempresa':"&idEmpresa
		Dim JobProductoMasVendido As HttpJob
		JobProductoMasVendido.Initialize("JobProductoMasVendido",Me)
		'JobProductoMasVendido.PostString(Main.url&"ws/get_diez_productos_mas_vendidos","json="&funcion.crearJson(Main.token,json))
		JobProductoMasVendido.PostString(Main.url&"ws/get_productos_main_page","json="&funcion.crearJson(Main.token,json))
	End If
	
End Sub

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
	openSlide
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
	salvar_detalle_temporal(Value)
End Sub

Sub btnProductoVolver_Click
	
	funcion.DisableView(True,PanelModalProducto)
	funcion.DisableView(False,PanelMenu)
	PanelModalProducto.SetVisibleAnimated(250,False)
	
End Sub


Sub btnProductoBuscarModal_Click
	If txtBuscarProducto.Text.Trim.Length = 0 Then
		Msgbox("Escriba el nombre del producto","Información")
		Return
	End If
	
	Dim json As String
	json = "'f_idempresa':"&idEmpresa&",'f_parametro':'"&txtBuscarProducto.Text.Replace("'","").Replace("""","")&"'"
	
	Dim JobBuscarProducto As HttpJob
	JobBuscarProducto.Initialize("JobBuscarProducto",Me)
	JobBuscarProducto.PostString(Main.url&"ws/get_productos_by_paramentros","json="&funcion.crearJson(Main.token,json))
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
		Activity.Finish
		Return
	End If
	
	StartActivity(p.Tag)
	'openSlide
End Sub

Sub btnSlideVolver_Click
	openSlide
End Sub



