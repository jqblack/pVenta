B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=8
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: False
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btnOrdenBack As Button
	Private btnOrdenEnviar As Button
	Private ListViewOrdenProducto As ListView
	Private PanelOrdenEnviar As Panel
	Private PanelOrdenProductos As Panel
	Private PanelOrdenProductosDetalles As Panel
	Private PanelOrdenTitulo As Panel
	Private lblOrdenTotalPagar As Label
	Private lblDireccion As Label
	Private lblPrecioEnvio As Label
	Private PanelDireccion As Panel
	Private btnOrdenEliminarTodos As Button
	
	Dim tax As Double = 0
	Dim subtotal As Double = 0
	Dim total As Double = 0
	
	'EDITAR PRODUCTO
	Private btnCantidadAumentar As Button
	Private btnCantidadDesaumentar As Button
	Private btnOpcionesBack As Button
	Private PanelOpciones As Panel
	Private PanelOpcionesBack As Panel
	Private txtCantidad As EditText
	Private lblOpcionesProductoNombre As Label
	Private ScrollViewOpciones As ScrollView
	
	
	'OPCIONES DEL PRODUCTO
	Private btnOpcionesProductoSalvar As Button
	Private txtProductoComentario As EditText
	Private btnOpcionesEliminar As Button
	
	
	'DIRECCIONES MODALES
	Private btnAbrirDireccion As Button
	Private ListViewDirecciones As ListView
	
	Private PanelDireccionModal As Panel
	
	
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("frmProductoOrden")
	
	ListViewOrdenProducto.TwoLinesAndBitmap.ItemHeight = 11%y
	
	ListViewOrdenProducto.TwoLinesAndBitmap.Label.TextColor = Colors.Black
	ListViewOrdenProducto.TwoLinesAndBitmap.Label.TextSize = 15
	ListViewOrdenProducto.TwoLinesAndBitmap.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	ListViewOrdenProducto.TwoLinesAndBitmap.Label.Padding = Array As Int(30dip,0,0,0)
	
	ListViewOrdenProducto.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Gray
	ListViewOrdenProducto.TwoLinesAndBitmap.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	ListViewOrdenProducto.TwoLinesAndBitmap.SecondLabel.Height = -1
	funcion.SetDivider(ListViewOrdenProducto,Colors.LightGray ,1dip)
	ListViewOrdenProducto.Padding = Array As Int(2%x,1%y,2%x,2%y)
	
	lblDireccion.Tag = 0
	lblPrecioEnvio.Text = Principal.mapEmpresaInfo.Get("f_precio_envio")
	
	cargarProductosTemporales
	
End Sub

Sub cargarProductosTemporales
	Dim JobBuscar As HttpJob
	JobBuscar.Initialize("JobBuscar",Me)
	JobBuscar.PostString(Main.url&"puntoventa/get_productos_temporales_by_key","json="&funcion.crearJson(Main.token,"'f_idempresa':"&Principal.idEmpresa))
End Sub


Sub JobDone(Job As HttpJob)
	
	If btnOpcionesProductoSalvar.IsInitialized And btnOpcionesProductoSalvar.Enabled = False Then
		btnOpcionesProductoSalvar.Enabled = True
		btnOpcionesEliminar.Enabled = True
		btnOpcionesBack.Enabled = True
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
		
		Case "JobBuscar"
			
			list = map.Get("f_data")
			ListViewOrdenProducto.Clear
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
				
				Dim bm As BitmapDrawable
				If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
					bm = funcion.getImagen(map.Get("f_foto"))
				Else
					bm.Initialize(LoadBitmap(File.DirAssets,"packing.png"))
				End If
				
				ListViewOrdenProducto.AddTwoLinesAndBitmap2(map.Get("f_descripcion"),"Cantidad: "&map.Get("f_cantidad")& "     $"& NumberFormat(funcion.getDecimal(map.Get("f_precio") + map.Get("f_tax")),0,2),bm.Bitmap,map)
			Next
			lblOrdenTotalPagar.Text = "$"& NumberFormat(funcion.getDecimal(total+ Principal.mapEmpresaInfo.Get("f_precio_envio")),0,2)
			
		Case "JobSalvar"
			Msgbox("Orden registrada."&CRLF&"Numero de orden: "&map.Get("f_data"),"Información")
			Principal.cantidadProduto = 0
			btnOrdenBack_Click
				
		Case "JobDetalleTemporal"
			'{'f_key':'1','f_data':{'f_paso':'1','f_cantidad':'1','f_tax':'15.254237288135593','f_existencia':'77.00','f_importe':'100.00000000000001'}}
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				If Job.Tag Then
					ToastMessageShow("Producto eliminado.",False)
					Principal.cantidadProduto = Principal.cantidadProduto -1
				Else
					ToastMessageShow("Producto actualizado.",False)
				End If
				
				openOpcionesLayout
				cargarProductosTemporales
			Else
				Msgbox("No hay unidades suficientes de este producto. La existencia actual es de "&map.Get("f_existencia"),"Información")
				Return
			End If
		
		Case "JobDirecciones"
			list = map.Get("f_data")
			ListViewDirecciones.Clear
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
				
				ListViewDirecciones.AddTwoLines2(dr,map.Get("f_fecha") & default ,map)
			Next
			
		Case "JobEliminarTodo"
			map=map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				ListViewOrdenProducto.Clear
				Principal.cantidadProduto = 0
				ToastMessageShow("Todos los productos fueron eliminados",False)
			Else
				Msgbox("Los productos no fueron eliminados","Información")
			End If
			
	End Select
	
End Sub


Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnOrdenEnviar_Click
	
	If Principal.mapEmpresaInfo.Get("f_pedidos_minimos") > total Then
		Msgbox("El monto del pedido minimo debe ser de RD$"&Principal.mapEmpresaInfo.Get("f_pedidos_minimos"),"Información")
		Return
	Else If ListViewOrdenProducto.Size = 0 Then
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

Sub btnOrdenBack_Click
	Activity.Finish
End Sub

Sub openOpcionesLayout
	Dim posicion As Double = 100%x
	
	If PanelOpciones.IsInitialized = False Or PanelOpcionesBack.Left = 100%x Then
		If PanelOpciones.IsInitialized = False Then
			Activity.LoadLayout("frmProductoOpciones")
		End If
		PanelOpcionesBack.Left = 100%x
		posicion = posicion * -1
		PanelOpcionesBack.Tag = 0
		PanelOpcionesBack.SetColorAnimated(400,Colors.Transparent,Colors.ARGB(180,0,0,0))
	Else
		funcion.DisableView(False,PanelOrdenProductos)
		PanelOpcionesBack.Tag = 100%x
		PanelOpcionesBack.SetColorAnimated(150,Colors.ARGB(180,0,0,0),Colors.Transparent)
	End If
	
	Dim a As Animation
	a.InitializeTranslate("ProductosOpciones", 0,0,posicion,0)
	a.Duration = 250
	a.Start(PanelOpcionesBack)
End Sub

Sub ProductosOpciones_AnimationEnd
	PanelOpcionesBack.Left = PanelOpcionesBack.Tag
End Sub

Sub btnOpcionesBack_Click
	openOpcionesLayout
End Sub

Sub btnCantidadDesaumentar_Click
	If IsNumber(txtCantidad.Text) = False Then
		txtCantidad.Text = "1"
		Return
	End If
	
	If (txtCantidad.Text - 1)  <= 0 Then
		Return
	End If
	txtCantidad.Text = txtCantidad.Text - 1
End Sub

Sub btnCantidadAumentar_Click
	If IsNumber(txtCantidad.Text) = False Then
		txtCantidad.Text = "1"
		Return
	End If
	
	txtCantidad.Text = txtCantidad.Text + 1
End Sub


Sub ListViewOrdenProducto_ItemLongClick (Position As Int, Value As Object)
	openOpcionesLayout
	
	Dim listaProductos As List
	Dim json As JSONParser
	
	Dim map As Map = Value
	txtCantidad.Text = map.Get("f_cantidad")
	txtCantidad.Tag = map.Get("f_cantidad")
	lblOpcionesProductoNombre.Text = map.Get("f_descripcion")
	txtProductoComentario.Text = funcion.base64_Decode(map.Get("f_comentario"))
	
	json.Initialize(map.Get("f_propiedades"))
	listaProductos = json.NextArray
	ScrollViewOpciones.Panel.RemoveAllViews
	btnOpcionesProductoSalvar.Tag =Value
	
	If listaProductos.Size = 0 Then
		Dim lbl As Label
		lbl.Initialize("-")
		lbl.Text = "No hay opciones disponibles"
		lbl.Gravity = Gravity.CENTER_HORIZONTAL + Gravity.CENTER_VERTICAL
		lbl.TextColor = Colors.LightGray
		lbl.TextSize = 15
		
		ScrollViewOpciones.Panel.AddView(lbl,2%x,2%y,ScrollViewOpciones.Panel.Width,5%y)
		Return
	End If
	
	Dim height As Double = 1%y
	Dim map2 As Map
	For i=0 To listaProductos.Size -1
		map2 = listaProductos.Get(i)
		Dim ch As CheckBox
		ch.Initialize(i&"ck")
		ch.Tag = map2.Get("f_idrecord")
		ch.Text = map2.Get("f_descripcion")
		ch.Checked = map2.Get("f_agregado")
		ch.TextColor = Colors.Black
		
		ScrollViewOpciones.Panel.AddView(ch,2%x,height,96%x,5%y)
		height = height + 5%y
	Next
	ScrollViewOpciones.Panel.Height = height
	
End Sub

Sub btnOpcionesProductoSalvar_Click
	Dim map As Map = btnOpcionesProductoSalvar.Tag
	Dim mapCalculos As Map = funcion.recalcular(map.Get("f_precio_original"),map.Get("f_descuento"),txtCantidad.Text,map.Get("f_porciento_tax"), Principal.impuestoIncluido,  False)
	Dim json As String
	
	Dim jsonPropiedades As String = "["
	For Each v As View In ScrollViewOpciones.Panel.GetAllViewsRecursive
		If GetType(v) <> "android.widget.CheckBox" Then
			Continue
		End If
		Dim ch As CheckBox = v
		If ch.Checked Then
			jsonPropiedades = jsonPropiedades & ",{'f_idrecord':"&ch.Tag&"}"
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
	btnOpcionesEliminar.Enabled = False
	btnOpcionesBack.Enabled = False
End Sub


Sub btnOpcionesEliminar_Click
	Dim r As Int = Msgbox2("Seguro que desea eliminar este producto?","Confirmación","Si","","No",Null)
	If r <> DialogResponse.POSITIVE Then
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
	btnOpcionesEliminar.Enabled = False
	btnOpcionesBack.Enabled = False
End Sub

Sub PanelDireccion_Click
	
	If PanelDireccionModal.IsInitialized = False Then
		Activity.LoadLayout("frmDireccionesModal")
		ListViewDirecciones.TwoLinesLayout.ItemHeight = 85dip
		ListViewDirecciones.TwoLinesLayout.Label.TextColor = Colors.Black
		ListViewDirecciones.TwoLinesLayout.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	
		ListViewDirecciones.TwoLinesLayout.SecondLabel.TextColor = Colors.Gray
		ListViewDirecciones.TwoLinesLayout.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
		ListViewDirecciones.TwoLinesLayout.SecondLabel.Height = 10%y
		funcion.SetDivider(ListViewDirecciones,Colors.Gray,1dip)
	End If
	
	PanelDireccionModal.Visible = False
	PanelDireccionModal.SetVisibleAnimated(250,True)
	
	funcion.DisableView(True,PanelOrdenProductos)
	funcion.DisableView(False,PanelDireccionModal)
	cargarDirecciones
End Sub

Sub cargarDirecciones
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funcion.crearJson(Main.token,""))
End Sub

#Region Direccion Modal

Sub ListViewDirecciones_ItemClick (Position As Int, Value As Object)
	Dim map As Map = Value
	lblDireccion.Text = funcion.base64_Decode( map.Get("f_direccion"))
	lblDireccion.Tag = map.Get("f_idrecord")
	btnDireccionCerrar_Click
End Sub

Sub btnAbrirDireccion_Click
	StartActivity(Direcciones)
End Sub

#End Region

Sub btnDireccionCerrar_Click
	PanelDireccionModal.SetVisibleAnimated(250,False)
	
	funcion.DisableView(False,PanelOrdenProductos)
	funcion.DisableView(True,PanelDireccionModal)
End Sub

Sub btnOrdenEliminarTodos_Click
	Dim r As Int = Msgbox2("Seguro que desea eliminar todos los productos?","Confirmación","Si","","No",Null)
	If r <> DialogResponse.POSITIVE Then
		Return
	End If
	
	Dim JobEliminarTodo As HttpJob
	JobEliminarTodo.Initialize("JobEliminarTodo",Me)
	JobEliminarTodo.PostString(Main.url&"puntoventa/get_eliminar_detalle_usuarios","json="&funcion.crearJson(Main.token,"'f_idempresa':"&Principal.idEmpresa))
End Sub