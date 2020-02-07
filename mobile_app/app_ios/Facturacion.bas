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
	Private pageOpciones As Page
	Private pageDirecciones As Page
	
	Private btnOrdenEnviar As Button
	Private lblDireccion As Label
	Private lblOrdenTotalPagar As Label
	Private lblPrecioEnvio As Label
	Private PanelDireccion As Panel
	Private PanelOrdenProductosDetalles As Panel
	Private PanelOrdenTotal As Panel
	Private ListViewOrdenProducto As TableView
	
	Private tax As Double = 0
	Private subtotal As Double = 0
	Private total As Double = 0
	Private hud As HUD
	
	
	'PRODUCTO OPCIONES
	Private btnOpcionesProductoSalvar As Button
	Private ScrollViewOpciones As ScrollView
	Private stModificarCantidad As Stepper
	Private txtCantidad As TextField
	Private txtProductoComentario As TextView
	Private lblOpcionesProductoNombre As Label
	Private PanelScrollViewOpciones As Panel
	
	'DIRECCIONES
	Private ListViewDirecciones As TableView
	Private btnAbrirDireccion As Button
	Private PanelListViewDirecciones As Panel
End Sub

Sub Initialize
	
	page.Initialize("ProductoOrden")
	page.RootPanel.LoadLayout("frmProductoOrden")
	Main.NavControl.ShowPage(page)
	Main.NavControl.ToolBarVisible = False
	
	crear
End Sub

Sub crear
	PanelDireccion.SetShadow(Colors.Gray, 0dip,2dip, 1,False)
	PanelOrdenProductosDetalles.SetShadow(Colors.Gray, 0dip,2dip, 1,False)
	PanelOrdenTotal.SetShadow(Colors.Gray, 0dip,2dip, 1,False)
	
	lblDireccion.Tag = 0
	lblPrecioEnvio.Text = Principal.mapEmpresaInfo.Get("f_precio_envio")
	
	ListViewOrdenProducto.Initialize("ListViewOrdenProducto",False)
	PanelOrdenProductosDetalles.AddView(ListViewOrdenProducto,0,0,PanelOrdenProductosDetalles.Width,PanelOrdenProductosDetalles.Height)
	ListViewOrdenProducto.AddTwoLines("","")

	cargarProductosTemporales
End Sub

Sub cargarProductosTemporales
	If Main.isLoggedIn = False Then
		Msgbox("Debe iniciar sesión para facturar un producto","Información")
		Return
	End If
	Dim JobBuscar As HttpJob
	JobBuscar.Initialize("JobBuscar",Me)
	JobBuscar.PostString(Main.url&"puntoventa/get_productos_temporales_by_key","json="&funcion.crearJson(Main.token,"'f_idempresa':"&Principal.idEmpresa))
End Sub


Sub btnOrdenEnviar_Click
	
'	LogColor(ListViewOrdenProducto.NumberOfSections,Colors.Blue)
'	Return
	
	If Principal.mapEmpresaInfo.Get("f_pedidos_minimos") > total Then
		Msgbox("El monto del pedido minimo debe ser de RD$"&Principal.mapEmpresaInfo.Get("f_pedidos_minimos"),"Información")
		Return
	Else If ListViewOrdenProducto.NumberOfSections = 0 Or ListViewOrdenProducto.GetItems(0).Size = 0 Then
		Msgbox("No hay productos para registrar esta orden","Información")
		Return
	else if lblDireccion.Tag = 0 Then
		Msgbox("Seleccione la dirección para el envio","Información")
		Return
	End If
	
	Dim json As String
	json = "'f_comprobante_fiscal':false,'f_idempresa':"&Principal.idEmpresa&",'f_itbis':"&tax&",'f_subtotal':"&subtotal&",'f_total':"&total&",'f_nota':'','f_direccion':'"&funcion.base64_Encode(lblDireccion.Text)&"'"
	
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"puntoventa/set_salvar_orden_delivery/","json="&funcion.crearJson(Main.token,json))
	
End Sub


Sub JobDone(Job As HttpJob)
	
'	If btnOpcionesProductoSalvar.IsInitialized And btnOpcionesProductoSalvar.Enabled = False Then
'		btnOpcionesProductoSalvar.Enabled = True
'		btnOpcionesEliminar.Enabled = True
'		btnOpcionesBack.Enabled = True
'	End If
	
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
		
		Case "JobBuscar"
			
			list = map.Get("f_data")
			ListViewOrdenProducto.RemoveViewFromParent
			ListViewOrdenProducto.Initialize("ListViewOrdenProducto",False)
			PanelOrdenProductosDetalles.AddView(ListViewOrdenProducto,0,0,PanelOrdenProductosDetalles.Width,PanelOrdenProductosDetalles.Height)
			If list.Size = 0 Then
				Msgbox("No tiene productos registrados","Información")
				Return
			End If
			
			total = 0
			tax = 0
			subtotal = 0
			
			For i = 0 To list.Size -1
				map = list.Get(i)
				total = total + map.Get("f_importe")
				tax = tax + (map.Get("f_tax") * map.Get("f_cantidad"))
				subtotal = subtotal + (map.Get("f_precio") * map.Get("f_cantidad"))
				
				Dim bm As Bitmap
				If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
					bm = funcion.getImagen(map.Get("f_foto"))
				Else
					bm.Initialize(File.DirAssets,"packing.png")
				End If
				
				Dim cell As TableCell =  ListViewOrdenProducto.AddTwoLines( map.Get("f_descripcion"),  "Cantidad: "&map.Get("f_cantidad")& "     $"& _
				NumberFormat(map.Get("f_precio") + map.Get("f_tax"),0,2) )
				cell.Bitmap = bm
				cell.Tag = map
				
			Next
			lblOrdenTotalPagar.Text = "$"& NumberFormat(total+ Principal.mapEmpresaInfo.Get("f_precio_envio"),0,2)
			
		Case "JobSalvar"
			Msgbox("Orden registrada."&CRLF&"Numero de orden: "&map.Get("f_data"),"Información")
			Principal.cantidadProduto = 0
			Main.NavControl.RemoveCurrentPage
				
		Case "JobDetalleTemporal"
			'{'f_key':'1','f_data':{'f_paso':'1','f_cantidad':'1','f_tax':'15.254237288135593','f_existencia':'77.00','f_importe':'100.00000000000001'}}
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				If Job.Tag Then
					hud.ToastMessageShow("Producto eliminado.",False)
					Principal.cantidadProduto = Principal.cantidadProduto -1
				Else
					hud.ToastMessageShow("Producto actualizado.",False)
				End If
				Main.NavControl.RemoveCurrentPage
				cargarProductosTemporales
				
				
			Else
				Msgbox("No hay unidades suficientes de este producto. La existencia actual es de "&map.Get("f_existencia"),"Información")
				Return
			End If
		
		Case "JobDirecciones"
			list = map.Get("f_data")
			
			If ListViewDirecciones.IsInitialized Then
				ListViewDirecciones.RemoveViewFromParent
				ListViewDirecciones.Initialize("ListViewDirecciones",False)
				PanelListViewDirecciones.AddView(ListViewDirecciones,0,0,PanelListViewDirecciones.Width,PanelListViewDirecciones.Height)
			End If
			
			If list.Size = 0 Then
				Msgbox("No tiene direcciones registradas","Información")
				Return
			End If
			
			'{'f_key':'1','f_data':[{"f_idrecord":1,"f_idusuario":7,"f_fecha":1540927870000,"f_principal":true,"f_direccion":"SABANA LARGA "}]}
			Dim dr,default="" As String
			For i=0 To list.Size -1
				map = list.Get(i)
				dr = funcion.base64_Decode(map.Get("f_direccion"))
				If dr.Length > 40 Then
					dr = dr.SubString2(0,40)&"..."
				End If
				
				If map.Get("f_principal") Then
					default = CRLF& "Dirección principal"
				End If
				
				Dim cell As TableCell = ListViewDirecciones.AddTwoLines(dr,default)
				cell.Tag = map
			Next
			
		Case "JobEliminarTodo"
			map=map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				ListViewOrdenProducto.Clear
				Principal.cantidadProduto = 0
				hud.ToastMessageShow("Todos los productos fueron eliminados",False)
			Else
				Msgbox("Los productos no fueron eliminados","Información")
			End If
			
	End Select
	
End Sub

Sub ProductoOrden_BarButtonClick (Tag As String)
	Log("BarButtonClicked: " & Tag)
	
	Select Tag
		
		Case "delete"
			Msgbox2("Msg", "Seguro que desea eliminar todos los productos?", "Confirmación", Array ("Si", "No"))
			Wait For Msg_Click (ButtonText As String)
	
			If ButtonText <> "Si" Then
				Return
			End If
			
			Dim JobEliminarTodo As HttpJob
			JobEliminarTodo.Initialize("JobEliminarTodo",Me)
			JobEliminarTodo.PostString(Main.url&"puntoventa/get_eliminar_detalle_usuarios","json="&funcion.crearJson(Main.token,"'f_idempresa':"&Principal.idEmpresa))
			
	End Select
End Sub

Sub pageProductoOpciones_BarButtonClick (Tag As String)
	Log("BarButtonClicked: " & Tag)
	
	Select Tag
		
		Case "delete"
			Msgbox2("Msg", "Seguro que desea eliminar este producto?", "Confirmación", Array ("Si", "No"))
			Wait For Msg_Click (ButtonText As String)
	
			If ButtonText <> "Si" Then
				Return
			End If
			
			Dim map As Map = btnOpcionesProductoSalvar.Tag
			Dim json As String
	
			json = "'f_regresa':true"& _
			",'f_idempresa':"&Principal.idEmpresa& _
	  		",'f_tipo':2"& _
			",'f_idserver':"&map.Get("f_idserver")
	
			Dim JobDetalleTemporal As HttpJob
			JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
			JobDetalleTemporal.Tag = True
			JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal","json="&funcion.crearJson(Main.token,json))
	
			btnOpcionesProductoSalvar.Enabled = False
			
	End Select
End Sub

Sub ListViewDirecciones_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	Dim map As Map = Cell.Tag
	lblDireccion.Text = funcion.base64_Decode( map.Get("f_direccion"))
	lblDireccion.Tag = map.Get("f_idrecord")
	Main.NavControl.RemoveCurrentPage
End Sub


Sub PanelDireccion_Click
	
	
	pageDirecciones.Initialize("pageDireccionesModal")
	pageDirecciones.RootPanel.LoadLayout("frmDireccionesModal")
	Main.NavControl.ShowPage(pageDirecciones)
	
	ListViewDirecciones.Initialize("ListViewDirecciones",False)
	PanelListViewDirecciones.AddView(ListViewDirecciones,0,0,PanelListViewDirecciones.Width,PanelListViewDirecciones.Height)
	PanelListViewDirecciones.SetShadow(Colors.Gray, 0dip,2dip, 1,False)
	cargarDirecciones
End Sub


Sub cargarDirecciones
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funcion.crearJson(Main.token,""))
End Sub

Sub ListViewOrdenProducto_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	
	pageOpciones.Initialize("pageProductoOpciones")
	pageOpciones.RootPanel.LoadLayout("frmProductoOpciones")
	pageOpciones.RootPanel.Tag = pageOpciones.RootPanel.Top
	
	txtCantidad.SetShadow(Colors.Gray, 0dip,0dip, 0.2,False)
	PanelScrollViewOpciones.SetShadow(Colors.Gray, 0dip,0dip, 0.5,False)
	txtProductoComentario.SetShadow(Colors.Gray, 0dip,0dip, 0.5,False)
	
	Dim listaProductos As List
	Dim json As JSONParser
	Main.NavControl.ShowPage(pageOpciones)
	
	Dim map As Map = Cell.Tag
	txtCantidad.Tag = map.Get("f_cantidad")
	txtCantidad.Text = txtCantidad.Tag
	stModificarCantidad.Value = txtCantidad.Tag
	
	lblOpcionesProductoNombre.Text = map.Get("f_descripcion")
	txtProductoComentario.Text = funcion.base64_Decode(map.Get("f_comentario"))
	
	json.Initialize(map.Get("f_propiedades"))
	listaProductos = json.NextArray
	ScrollViewOpciones.Panel.RemoveAllViews
	ScrollViewOpciones.ContentWidth = ScrollViewOpciones.Width
	btnOpcionesProductoSalvar.Tag =Cell.Tag
	
	If listaProductos.Size = 0 Then
		Dim lbl As Label
		lbl.Initialize("-")
		lbl.Text = "No hay opciones disponibles"
		lbl.TextAlignment = lbl.ALIGNMENT_CENTER
		lbl.TextColor = Colors.Gray
		lbl.Font = Font.CreateNew(15)
		lbl.Tag = "label"
		
		ScrollViewOpciones.Panel.AddView(lbl,2%x,5%y,ScrollViewOpciones.Panel.Width,20dip)
		Return
	End If
	
	Dim height As Double = 10dip
	Dim map2 As Map
	For i=0 To listaProductos.Size -1
		map2 = listaProductos.Get(i)
		Dim ch As Switch
		ch.Initialize(i&"ck")
		ch.Tag = map2.Get("f_idrecord")
		ch.Value = map2.Get("f_agregado")
		
		Dim lbl As Label
		lbl.Initialize("-")
		lbl.Text = map2.Get("f_descripcion")
		lbl.TextAlignment = lbl.ALIGNMENT_LEFT
		lbl.TextColor =  Colors.Black
		lbl.Font = Font.CreateNew(15)
		lbl.Tag = "label"
		
		ScrollViewOpciones.Panel.AddView(ch,2%x,height,15%x,50dip)
		ScrollViewOpciones.Panel.AddView(lbl,ch.Left + ch.Width,height,96%x , 30dip)
		height = height + 40dip
	Next
	ScrollViewOpciones.ContentHeight = height
	
End Sub

Sub ProductoOpciones_Disappear
	
	'Main.NavControl.SetNavigationBarVisibleAnimated(True)
	'Main.NavControl.ToolBarVisible = True
	
End Sub


Sub btnOpcionesProductoSalvar_Click
	Dim map As Map = btnOpcionesProductoSalvar.Tag
	Dim mapCalculos As Map = funcion.recalcular(map.Get("f_precio_original"),map.Get("f_descuento"),txtCantidad.Text,map.Get("f_porciento_tax"), Principal.impuestoIncluido,  False)
	Dim json As String
	
	Dim jsonPropiedades As String = "["
	For Each v As View In ScrollViewOpciones.Panel.GetAllViewsRecursive
		If v.Tag <> "label" Then
			Dim ch As Switch = v
			If ch.Value Then
				jsonPropiedades = jsonPropiedades & ",{'f_idrecord':"&ch.Tag&"}"
			End If
		End If
	Next
	jsonPropiedades = jsonPropiedades.Replace("[,","[")
	jsonPropiedades = jsonPropiedades& "]"
	
	
	json = "'f_regresa':false"& _
			",'f_idempresa':"&Principal.idEmpresa& _
			",'f_propiedades':"&jsonPropiedades& _
	  		",'f_tipo':2"& _
			",'f_cantidad':"&txtCantidad.Text& _
			",'f_tax':"&mapCalculos.Get("f_tax")& _ 
			",'f_precio':"&mapCalculos.Get("f_precio_para_mostrar")& _
			",'f_importe':"&mapCalculos.Get("f_total")& _
			",'f_descuento':0"& _
			",'f_idserver':"&map.Get("f_idserver")& _
			",'f_diferencia':"&funcion.getDiferenciaCantidad(map.Get("f_cantidad"),txtCantidad.Text)& _
			",'f_porciento_descuento':0"& _
			",'f_comentario':'"& funcion.base64_Encode(txtProductoComentario.Text) &"'"& _
			",'f_porciento_tax':"&map.Get("f_porciento_tax")
	
	
	Dim JobDetalleTemporal As HttpJob
	JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
	JobDetalleTemporal.Tag = False
	JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal","json="&funcion.crearJson(Main.token,json))
	btnOpcionesProductoSalvar.Enabled = False
'	btnOpcionesEliminar.Enabled = False
'	btnOpcionesBack.Enabled = False
End Sub

Sub txtProductoComentario_TextChanged (OldText As String, NewText As String)
	If NewText.Contains(CRLF) Then
		pageOpciones.resignfocus
	End If
End Sub

Sub  pageProductoOpciones_KeyboardStateChanged (Height As Float)
	funcion.KeyboardStateChanged(Height,pageOpciones,pageOpciones.RootPanel.Tag)
End Sub

Sub stModificarCantidad_ValueChanged (Value As Double)
	txtCantidad.Text = Value
End Sub

Sub btnAbrirDireccion_Click
	Direcciones.Initialize
End Sub