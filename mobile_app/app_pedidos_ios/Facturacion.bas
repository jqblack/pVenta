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

	Private page As Page
	
	Private btnOrdenBack As Button
	Private PanelOrdenTitulo As Panel
	Private ListaCarrito As CustomListView
	Dim hud As HUD
	Dim changeValue As Boolean = False
	dim valorCantidad as Int = 0
	
	Dim tax As Double = 0
	Dim subtotal As Double = 0
	Dim total As Double = 0
	
	
	Private lblOrdenTotalPagar As Label
	Private lblPrecioEnvio As Label
	Private lblDireccion As Label
	Private imgCat As ImageView
	Private lblNomCat As Label
	Private lblCantCat As Label
	Private lblOpcionesProductoNombre As Label
	Private txtCantidad As TextField
	Private stModificarCantidad As Stepper
	Private btnOpcionesProductoSalvar As Button
	Private PanelOpcionesBack As Panel
	Private btnOpcionesBack As Button
	Private btnOpcionesEliminar As Button
	Private txtProductoComentario As TextField
	Private PanelDireccion As Panel
	Private MiListaDireccion As CustomListView
	Private btnBackMdalDireccion As Button
	Private btnAbrirDireccion As Button
	Private PanelFondoDireccionModal As Panel
	Private lblDir As Label
	Private lblFecha As Label
	Private lblPrincipal As Label
	Private btnOrdenEnviar As Button
	Private btnOrdenEliminarTodos As Button
	
	
End Sub

Sub Initialize
	
	page.Initialize("PageLogin")
	
	page.RootPanel.LoadLayout("frmProductoOrden")
	
	Main.NavControl.ShowPage2(page,True)
	cargarProductosTemporales
	lblDireccion.Tag = 0
	
	Main.smc.Tag = "facturacion"
	
End Sub

Sub btnOrdenBack_Click
	
	Main.smc.Tag = "inicio"
	Main.NavControl.RemoveCurrentPage
	
	Main.actualizarCantidad
	
End Sub

Sub cargarProductosTemporales
	
	Dim json As String  = "'f_idempresa':"&Main.idEmpresa& _
	" ,'f_imei':"&Main.imei
	
	Dim JobBuscar As HttpJob
	JobBuscar.Initialize("JobBuscar",Me)
	JobBuscar.PostString(Main.url&"puntoventa/get_productos_temporales_by_key2","json="&funciones.crearJson(Main.tokenPublico,json))
	
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
	
	If funciones.verificarJob(Job.GetString)=False Then
		Return
	End If
	
	Dim map As Map
	Dim list As List
	Dim json As JSONParser
	json.Initialize(funciones.base64_Decode(Job.GetString))
	map = json.NextObject
	
	
	Select Job.JobName
		
		Case "JobBuscar"
			
			list = map.Get("f_data")

			ListaCarrito.Clear
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
					bm = funciones.getImagen(map.Get("f_foto"))
				Else
					bm.Initialize(File.DirAssets,"no-image.jpg")
				End If
				'Agregar el frm aqui y poner todo lo que tengo que hacer para hacerlo con el customview
				
'				ListaCarrito.Add(CreateListItem(map.Get("f_descripcion"),"Cantidad: "&map.Get("f_cantidad")&"   $"& _
'				NumberFormat(map.Get("f_precio") + map.Get("f_tax"),0,2) ,bm,ListaCarrito.GetBase.Width,50dip),map)

				ListaCarrito.Add(CreateListItem(map.Get("f_descripcion"),"Cantidad: "&map.Get("f_cantidad")&"   $"& _
				NumberFormat(map.Get("f_precio_original"),0,2) ,bm,ListaCarrito.GetBase.Width,50dip),map)
				
			Next
			
			If Main.isLoged Then
				lblPrecioEnvio.Text = Main.mapEmpresaInfo.Get("f_precio_envio")
				lblOrdenTotalPagar.Text = "$"& NumberFormat(total+ Main.mapEmpresaInfo.Get("f_precio_envio"),2,2)
					
			Else
				'lblOrdenTotalPagar.Text = "$"& NumberFormat(funcion.getDecimal(total),2,2)
				lblOrdenTotalPagar.Text = "$"& NumberFormat2(total,0,2,2,False)
				hud.ToastMessageShow("Precio calculado sin precio de envio!!",False)
			End If
			
		Case "JobDetalleTemporal"
			'{'f_key':'1','f_data':{'f_paso':'1','f_cantidad':'1','f_tax':'15.254237288135593','f_existencia':'77.00','f_importe':'100.00000000000001'}}
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				If Job.Tag Then
					hud.ToastMessageShow("Producto eliminado.",False)
					Main.cantidadProduto = Main.cantidadProduto -1
				Else
					hud.ToastMessageShow("Producto actualizado.",False)
				End If

				cargarProductosTemporales
				btnOpcionesBack_Click
			Else
				Msgbox("No hay unidades suficientes de este producto. La existencia actual es de "&map.Get("f_existencia"),"Información")
				Return
			End If
			
		Case "JobDirecciones"
			list = map.Get("f_data")
			MiListaDireccion.Clear
			If list.Size = 0 Then
				Msgbox("No tiene direcciones registradas","Información")
				Return
			End If
			
			Dim dr,city,name,default="" As String
			For i=0 To list.Size -1
				map = list.Get(i)
				dr = funciones.base64_Decode(map.Get("f_direccion1"))
				city = " ,"&map.Get("f_sector_city")
				name = map.Get("f_nombre_direccion")
				If dr.Length > 40 Then
					dr = dr.SubString2(0,40)&"..."
				End If
				
				If map.Get("f_principal") Then
'					default = CRLF& "Dirección principal"

					If Main.IsUsa Then
					
						default = "Main address"
					
					Else
						
						default = "Dirección principal"
				
					End If
				End If
				
				DateTime.DateFormat = "dd/MM/yyyy"
				
				MiListaDireccion.Add(CreateListItemOnlyString(name&": "&dr&city,DateTime.Date(map.Get("f_fecha")),default,MiListaDireccion.GetBase.Width,80dip),map)
			Next
			
		Case "JobSalvar"
			Msgbox("Orden registrada."&CRLF&"Numero de orden: "&map.Get("f_data"),"Información")
			Main.cantidadProduto = 0
			btnOrdenBack_Click
			
		Case "JobEliminarTodo"
			map=map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				ListaCarrito.Clear
				Main.cantidadProduto = 0
				lblOrdenTotalPagar.Text = "0.00"
				hud.ToastMessageShow("Eliminados Correctamente",True)
				
				Main.cantidadProduto = 0
				btnOrdenBack_Click
			Else
				Msgbox("Los productos no fueron eliminados","Información")
			End If
		
	End Select
	
	
End Sub

Sub CreateListItemOnlyString(Dir As String, fecha As String,principal As String, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) 'set the size before the layout is loaded
	p.LoadLayout("frmItemsDir")
	lblDir.Text = Dir
	lblFecha.Text = fecha
	lblPrincipal.Text = principal
	Return p
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

Sub ListaCarrito_ItemClick (Index As Int, Value As Object)
	
	Dim mapa As Map = Value
	btnOpcionesProductoSalvar.Tag = mapa
	'Msgbox(mapa,"")
	
	lblOpcionesProductoNombre.Text = mapa.Get("f_descripcion")
	txtCantidad.Text =mapa.Get("f_cantidad")
	valorCantidad = mapa.Get("f_cantidad")
	txtProductoComentario.Text = mapa.Get("f_comentario")
	
	PanelOpcionesBack.Left = 0%x
	PanelOpcionesBack.SetAlphaAnimated(500,1)
	
End Sub



#Region OpcionesDeProductos

Sub stModificarCantidad_ValueChanged (Value As Double)
	txtCantidad.Text = Value
End Sub

Sub btnOpcionesProductoSalvar_Click
	
	Dim map As Map = btnOpcionesProductoSalvar.Tag
	Dim mapCalculos As Map = funciones.recalcular(map.Get("f_precio_original"),map.Get("f_descuento"),txtCantidad.Text,map.Get("f_porciento_tax"), Main.impuestoIncluido,  False)
	Dim json As String
	
	Dim jsonPropiedades As String = "[]"

	
	
	json = "'f_regresa':false"& _
			",'f_idempresa':"&Main.idEmpresa& _
			",'f_propiedades':"&jsonPropiedades& _
	  		",'f_tipo':2"& _
			",'f_cantidad':"&txtCantidad.Text& _
			",'f_tax':"&mapCalculos.Get("f_tax")& _ 
			",'f_precio':"&mapCalculos.Get("f_precio_para_mostrar")& _
			",'f_importe':"&mapCalculos.Get("f_total")& _
			",'f_descuento':0"& _
			",'f_idserver':"&map.Get("f_idserver")& _
			",'f_diferencia':"&funciones.getDiferenciaCantidad(map.Get("f_cantidad"),txtCantidad.Text)& _
			",'f_porciento_descuento':0"& _
			",'f_comentario':'"& funciones.base64_Encode(txtProductoComentario.Text) &"'"& _
			",'f_porciento_tax':"&map.Get("f_porciento_tax")
	
	
	Dim JobDetalleTemporal As HttpJob
	JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
	JobDetalleTemporal.Tag = False
	
	changeValue = True
	
	If Main.isLoged And 1 == 2 Then
		JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal","json="&funciones.crearJson(Main.token,json))
	Else
		JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funciones.crearJson(Main.tokenPublico,json))
	End If

'	btnOpcionesProductoSalvar.Enabled = False
'	btnOpcionesEliminar.Enabled = False
'	btnOpcionesBack.Enabled = False
	
End Sub

Sub btnOpcionesBack_Click
	PanelOpcionesBack.SetAlphaAnimated(500,0)
	If changeValue Then
		changeValue = False
		Else
			stModificarCantidad.Value = valorCantidad
			
	End If
	
End Sub

Sub btnOpcionesEliminar_Click
	
	Msgbox2("msjEliminar","Desea eliminar este producto?","Aviso!!",Array("Si","No"))
	
	
'	
'	
'	btnOpcionesProductoSalvar.Enabled = False
'	btnOpcionesEliminar.Enabled = False
'	btnOpcionesBack.Enabled = False
	
End Sub

Sub msjEliminar_Click(ButtonText As String)

	If ButtonText = "Si" Then

		Dim map As Map = btnOpcionesProductoSalvar.Tag
		Dim json As String
	
		json = "'f_regresa':true"& _
			",'f_idempresa':"&Main.idEmpresa& _
	  		",'f_tipo':2"& _
			",'f_idserver':"&map.Get("f_idserver") 
	
		Dim JobDetalleTemporal As HttpJob
		JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
		JobDetalleTemporal.Tag = True
	
		If Main.isLoged And 1 == 2 Then
			JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal","json="&funciones.crearJson(Main.token,json))
		Else
			JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funciones.crearJson(Main.tokenPublico,json))
		End If
		
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

#End Region


Sub PanelDireccion_Click
	
	If Main.isLoged Then
		
		cargarDirecciones
		PanelFondoDireccionModal.Top = 0%y
		PanelFondoDireccionModal.SetAlphaAnimated(500,1)
		
		Else
		Msgbox2("MsgLogin","Antes de ver sus direcciones tiene que iniciar sesion","Advertencia",Array("Si","No"))
	End If
	
End Sub

Sub MsgLogin_Click(ButtonText As String)

	If ButtonText = "Si" Then
		Login.Initialize
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

Sub cargarDirecciones
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funciones.crearJson(Main.token,""))
End Sub


#Region ModalDeDireccion

Sub MiListaDireccion_ItemClick (Index As Int, Value As Object)
	
	Dim map As Map = Value
	
	lblDireccion.Text = funciones.base64_Decode(map.Get("f_direccion1"))&", "&map.Get("f_sector_city")&", "&map.Get("f_nom_estado")
	lblDireccion.Tag = map.Get("f_idrecord")
	btnBackMdalDireccion_Click
	
End Sub

Sub btnBackMdalDireccion_Click
	PanelFondoDireccionModal.SetAlphaAnimated(500,0)
End Sub

Sub btnAbrirDireccion_Click
	Direcciones.Initialize
End Sub

#End Region


Sub btnOrdenEnviar_Click
	
	If Main.isLoged Then
		
		If Main.mapEmpresaInfo.Get("f_pedidos_minimos") > total Then
			Msgbox("El monto del pedido minimo debe ser de RD$"&Main.mapEmpresaInfo.Get("f_pedidos_minimos"),"Información")
			Return
		Else If ListaCarrito.Size = 0 Then
			Msgbox("No hay productos para registrar esta orden","Información")
			Return
		else if lblDireccion.Tag == 0 Then
			Msgbox("Seleccione la dirección para el envio","Información")
			Return
		End If
		
		Msgbox2("MsgVender","Desea realizar esta orden?","Aviso!!",Array("Si","No"))

	Else
			
		Msgbox2("MsgLogin","Antes realizar su orden tiene que iniciar sesion","Advertencia",Array("Si","No"))
			
		End If	
	
	End Sub

Sub MsgVender_Click(ButtonText As String)

	If ButtonText = "Si" Then
		Dim json As String
		json = "'f_comprobante_fiscal':false,'f_idempresa':"&Main.idEmpresa&",'f_itbis':"&tax&",'f_subtotal':"&subtotal&",'f_total':"&total&",'f_nota':'','f_imei':"&Main.imei&",'f_direccion':'"&funciones.base64_Encode(lblDireccion.Text)&"'"
	
		Dim JobSalvar As HttpJob
		JobSalvar.Initialize("JobSalvar",Me)
		JobSalvar.PostString(Main.url&"puntoventa/set_salvar_orden_delivery2/","json="&funciones.crearJson(Main.token,json))
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

Sub btnOrdenEliminarTodos_Click
	Msgbox2("MsgDelete","Seguro que desea borrar todos los productos del carrito?","Advertencia!!",Array("Si","No"))
End Sub

Sub MsgDelete_Click(ButtonText As String)

	If ButtonText = "Si" Then
		Dim json As String
	
		json = "'f_imei':"&Main.imei
	
		Dim JobEliminarTodo As HttpJob
		JobEliminarTodo.Initialize("JobEliminarTodo",Me)
		JobEliminarTodo.PostString(Main.url&"puntoventa/get_eliminar_detalle_usuarios2","json="&funciones.crearJson(Main.tokenPublico,json))
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub






























