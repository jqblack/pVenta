B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=5.3
@EndOfDesignText@
'Code module

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'Public variables can be accessed from all modules.
	Private page As Page
	Private pageInfo As Page
	Dim idEmpresa As Int = 5
	Dim impuestoIncluido As Boolean = True
	Dim mapEmpresaInfo As Map = Null
	Dim cantidadProduto As Int = 0
	
	Private btnAbierto As Button
	Private btnBuscarProducto As Button
	Private btnMasVendido As Button
	Private lblCategoria As Label
	Private lblLema As Label
	Private ViewCategoria As ScrollView
	Private hud As HUD
	Private PanelCategoria As Panel
	
	
	'EMPRESA INFO
	Private btnInfoCerrar As Button
	Private lblDireccion As TextView
	Private lblInfoEmpresa As Label
	Private lblInfoNegocio As Label
	Private lblPedidoMinimo As Label
	Private lblTelefono As Label
	Private PanelInfoBack As Panel
	
	'BUSCAR PRODUCTO
	Private ListProductosModalView As TableView
	Private btnProductoBuscarModal As Button
	Private btnProductoVolver As Button
	Private PanelProductosModalView As Panel
	Private txtBuscarProducto As TextField
	Private PanelModalProducto As Panel
	
	
End Sub

Sub Initialize
	
	page.Initialize("PagePrincipal")
	page.RootPanel.LoadLayout("frmPrincipal")
	
	Main.NavControl.ShowPage2(page,False )
	Main.NavControl.SetNavigationBarVisibleAnimated(True)
	Main.NavControl.ToolBarVisible = True
	
	Dim JobEmpresaInfo As HttpJob
	JobEmpresaInfo.Initialize("JobEmpresaInfo",Me)
	JobEmpresaInfo.PostString(Main.url&"ws/get_datos_preferencia","json="&funcion.crearJson(Main.tokenPublico,"'f_idempresa':"&idEmpresa))
	
	btnMasVendido.Tag = False
	btnBuscarProducto.SetShadow(Colors.Gray, 0dip,2dip, 1,False)
	btnMasVendido.SetShadow(Colors.Gray, 0dip,2dip, 1,False)
	PanelCategoria.SetShadow(Colors.Gray, 0,0, 1, False  )
	
	ViewCategoria.ContentWidth = ViewCategoria.Width
	ViewCategoria.ContentHeight = ViewCategoria.Height
	PanelModalProducto.Alpha = 0
	btnMasVendido_Click
	
	'Chr(0xF060)
'	Dim btn As BarButton
'	btn.InitializeText("Hola" ,"")
'	btn.SetFont(Font.CreateFontAwesome(20))
'	page.TopLeftButtons = Array As BarButton(btn)


	Sleep(2000)
	If Main.isLoggedIn = False Then
		Msgbox2("Msg", "Desea iniciar sesión y asi poder registrar ordenes?", "Información", Array ("Iniciar Sesion", "Mas tarde"))
		Wait For Msg_Click (ButtonText As String)
		If ButtonText = "Iniciar Sesion" Then
			Main.NavControl.RemoveCurrentPage
		End If
		Return
	End If
	
End Sub

Sub PagePrincipal_BarButtonClick (Tag As String)
	Log("BarButtonClicked: " & Tag)
	
	Select Tag
		
		Case "info"
			If  mapEmpresaInfo.IsInitialized =False Or mapEmpresaInfo = Null Then
				Msgbox("Buscando información del negocio...","Información")
				Return
			End If
			
			If pageInfo.IsInitialized  = False Then
				pageInfo.Initialize("pageInfo")
				pageInfo.RootPanel.LoadLayout("frmInfoEmpresa")
				pageInfo.HideBackButton = True
			End If
			
			Main.NavControl.SetNavigationBarVisibleAnimated(False)
			Main.NavControl.ToolBarVisible = False
			Main.NavControl.ShowPage2(pageInfo,True)
			'Main.NavControl.ToolBarVisible = False
			
			lblInfoEmpresa.Text = mapEmpresaInfo.Get("f_nombre")
			lblInfoNegocio.Text = mapEmpresaInfo.Get("f_tipo_negocio")
			lblPedidoMinimo.Text =  "RD$ "&mapEmpresaInfo.Get("f_pedidos_minimos")
			lblTelefono.Text = mapEmpresaInfo.Get("f_telefono")
			lblDireccion.Text = mapEmpresaInfo.Get("f_direccion")
			
		Case "facturacion"
			Facturacion.Initialize
			
		Case "direcciones"
			If Main.isLoggedIn = False Then
				loginUser
				Return
			End If
			Direcciones.Initialize
			
		Case "logout"
			Main.isLoggedIn = False
			Main.NavControl.RemoveCurrentPage
			
		Case "ordenes"
			If Main.isLoggedIn = False Then
				loginUser
				Return
			End If
			ReporteOrdenes.Initialize
		
	End Select
	
End Sub

Sub PagePrincipal_Appear
	Main.NavControl.ToolBarVisible = True
End Sub

Sub PagePrincipal_Disappear
'	Main.NavControl.NavigationBarVisible = False
'	Main.NavControl.ToolBarVisible = False
End Sub

Sub PagePrincipal_Resize(Width As Int, Height As Int)
	
End Sub


Sub cargarCaterorias
	hud.ProgressDialogShow("Cargando categorias")
	Dim JobCategoria As HttpJob
	JobCategoria.Initialize("JobCategoria",Me)
	JobCategoria.PostString(Main.url&"ws/get_categorias_by_empresa/","json="&funcion.crearJson(Main.tokenPublico,"'f_idempresa':"&idEmpresa))
	btnMasVendido.Text = "Ver ofertas "
	btnMasVendido.Tag = False
End Sub



Sub cargarViewProductos(list As List, categorias As Boolean)
	
	Dim map As Map
	Dim panelHeight As Int = 7dip
	Dim height As Int = ViewCategoria.Height  * 0.25
	Dim left As Int = ViewCategoria.Height  * 0.02
	
	ViewCategoria.Panel.RemoveAllViews
	
	For i=0 To list.Size -1
		map = list.Get(i)
		Dim btn As Button
		Dim bm As Bitmap
		
		If categorias Then
			btn.InitializeCustom("btnViewCategoria", Colors.White,Colors.Red)
			If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
				bm = funcion.getImagen(map.Get("f_foto"))
			Else
				bm.Initialize(File.DirAssets,"cook-food.jpeg")
			End If
			btn.Text = map.Get("f_descripcion")
			btn.CustomLabel.Font = Font.CreateNew(20)
			
		Else
			btn.InitializeCustom("btnViewProducto", Colors.White,Colors.Red)
			bm.Initialize(File.DirAssets,"pexels-photo.jpeg")
			btn.Text = map.Get("f_descripcion") &CRLF&CRLF& "RD$" & NumberFormat(map.Get("f_precio"),0,2)
			btn.CustomLabel.Font = Font.CreateNew(15)
		End If
		
		funcion.SetBackgroundImage(btn,bm,0)
		btn.Color = Colors.Red
		btn.CustomLabel.TextColor = Colors.White
		btn.CustomLabel.Multiline = True
		btn.CustomLabel.TextAlignment = btn.CustomLabel.ALIGNMENT_CENTER
		btn.Tag = map
		btn.Alpha = 0
		btn.SetAlphaAnimated(500,1)
		
		ViewCategoria.Panel.AddView(btn, left , panelHeight, ViewCategoria.Width - 4%x, height)
		panelHeight = height + panelHeight + ViewCategoria.Height * 0.02
	Next
	
	ViewCategoria.ContentHeight = panelHeight
End Sub


Sub btnMasVendido_Click
	
	If btnMasVendido.Tag Then
		cargarCaterorias
	Else
		Dim json As String
		json = "'f_idempresa':"&idEmpresa
		Dim JobProductoMasVendido As HttpJob
		JobProductoMasVendido.Initialize("JobProductoMasVendido",Me)
		JobProductoMasVendido.PostString(Main.url&"ws/get_productos_main_page","json="&funcion.crearJson(Main.tokenPublico,json))
	End If
	
End Sub


Sub JobDone(Job As HttpJob)
	
'	If btnProductoBuscarModal.IsInitialized And btnProductoBuscarModal.Enabled = False Then
'		btnProductoBuscarModal.Enabled = True
'	End If
	hud.ProgressDialogHide
	
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
			
			page.Title =  mapEmpresaInfo.Get("f_nombre")
			btnAbierto.Enabled = mapEmpresaInfo.Get("f_laborando")
			lblLema.Text = mapEmpresaInfo.Get("f_lema")
			
			If btnAbierto.Enabled Then
				btnAbierto.Text = "Abierto"
				btnAbierto.CustomLabel.TextColor = Colors.RGB(12,166,0)
				btnAbierto.SetBorder(1, Colors.RGB(12,166,0),13)
			Else
				btnAbierto.Text = "Cerrado"
				btnAbierto.SetBorder(1, Colors.RGB(192,13,13),15)
				btnAbierto.CustomLabel.TextColor = Colors.RGB(192,13,13)
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
			
			lblCategoria.Alpha = 0
			lblCategoria. SetAlphaAnimated(300, 1)
			lblCategoria.Text =  list.Size & " Productos"
			ViewCategoria.Tag = list
			cargarViewProductos(list, False)
		
		Case "JobDetalleTemporal"
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			cantidadProduto = cantidadProduto + 1
'			lblCantidadProductos.Text = cantidadProduto
'			lblCantidadProductos.Visible = True
			hud.ToastMessageShow("Producto agregado al carrito.",False)
			
		Case "JobProductoMasVendido"
			list = map.Get("f_data")
			lblCategoria.Text = list.Size & " Productos en oferta"
			cargarViewProductos(list,False)
			btnMasVendido.Text = "Ver cartegorias  "
			btnMasVendido.Tag = True
			
		Case "JobBuscarProducto"
			
			If ListProductosModalView.IsInitialized Then
				ListProductosModalView.RemoveViewFromParent
				ListProductosModalView.Initialize("ListProductosModalView",False)
				PanelProductosModalView.AddView(ListProductosModalView,0,0,PanelProductosModalView.Width,PanelProductosModalView.Height)
			End If
			
			list = map.Get("f_data")
			If list.Size = 0 Then
				Msgbox("No se ha encontrado productos con esta referencia","Información")
				Return
			End If
			
			For i=0 To list.Size -1
				map = list.Get(i)
				Dim bm As Bitmap
				If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
					bm = funcion.getImagen(map.Get("f_foto"))
				Else
					bm.Initialize(File.DirAssets,"packing.png")
				End If
				
				Dim cell As TableCell  = ListProductosModalView.AddTwoLines(map.Get("f_descripcion"),"Precio: "&NumberFormat(map.Get("f_precio"),0,2))
				cell.Bitmap = bm
				cell.Tag = map
				'cell.InitializeTwoLines(map.Get("f_descripcion"),"Precio: "&NumberFormat(map.Get("f_precio"),0,2) )
				cell.ShowSelection = True
			Next
		
	End Select
	
End Sub


Sub btnViewCategoria_Click
	
	Dim b As Button
	b = Sender
	Dim map As Map = b.Tag
	Dim json As String = "'f_idempresa':"&idEmpresa&",'f_idcategoria':"&map.Get("f_idrecord")
	
	Dim JobProductoByCategoria As HttpJob
	JobProductoByCategoria.Initialize("JobProductoByCategoria",Me)
	JobProductoByCategoria.PostString(Main.url&"ws/get_productos_by_categoria","json="&funcion.crearJson(Main.tokenPublico,json))
	
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
	
	If Main.isLoggedIn = False Then
		loginUser
		Return
	End If
	
	
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

Sub btnInfoCerrar_Click
	Main.NavControl.RemoveCurrentPage2(True)
	Main.NavControl.SetNavigationBarVisibleAnimated(True)
	Main.NavControl.ToolBarVisible = True
End Sub


Sub btnBuscarProducto_Click
	
	PanelModalProducto.Left = 0
	PanelModalProducto.SetAlphaAnimated(300,1)
	'Main.NavControl.SetNavigationBarVisibleAnimated(False)
	
	ListProductosModalView.Initialize("ListProductosModalView",False)
	PanelProductosModalView.AddView(ListProductosModalView,0,0,PanelProductosModalView.Width,PanelProductosModalView.Height)
	ListProductosModalView.AddTwoLines("","")
	
	txtBuscarProducto.RequestFocus
End Sub

Sub btnProductoVolver_Click
	PanelModalProducto.SetAlphaAnimated(300,0)
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
	JobBuscarProducto.PostString(Main.url&"ws/get_productos_by_paramentros","json="&funcion.crearJson(Main.tokenPublico,json))
	hud.ProgressDialogShow("Buscando producto...")
	'btnProductoBuscarModal.Enabled = False
	
End Sub

Sub ListProductosModalView_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	
	If Cell.Tag = Null Then
		Return
	End If
	
	If Main.isLoggedIn = False Then
		loginUser
		Return
	End If
	
	salvar_detalle_temporal(Cell.Tag)
End Sub


Sub loginUser
	
	Msgbox2("Msg", "Debe iniciar sesión para realizar esta acción", "Información", Array ("Iniciar Sesion", "Volver"))
	Wait For Msg_Click (ButtonText As String)
	If ButtonText = "Iniciar Sesion" Then
		Main.NavControl.RemoveCurrentPage
	End If
	
End Sub


