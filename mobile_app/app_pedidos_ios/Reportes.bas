B4i=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=5.81
@EndOfDesignText@
'Code module

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'Public variables can be accessed from all modules.
	
	Private pageReporte As Page

	Private Panel1 As Panel
	Private Panel3 As Panel
	Private lblFechaInicio As Label
	Private lblfechaFinal As Label
	Private PanelFondoDatePicker As Panel
	
	Dim cualFe As Boolean
	Dim mapaBorrar As Map
	Dim indiceBorrar As Int
	Dim numOrden As String
	Dim listaAddAll As List
	Dim listAux As List
	Dim mapaDetalleOrden As Map
	Dim indiceDetalleOrden As Int
	
	Private btnCancelarDate As Button
	Private btnAceptarDate As Button
	Private DateFecha As DatePicker
	Private listaOrdenes As CustomListView
	Private Label3 As Label
	Private lblDir As Label
	Private lblFecha As Label
	Private lblPrincipal As Label
	Private btnBuscarReporte As Button

	
	Dim hud As HUD
	Private PanelFondoDetalleOrden As Panel
	Private lbltituloProOrden As Label
	Private ListProOrdenDetalle As CustomListView
	Private btnbackProOrden As Button
	Private btnAddAllproOrden As Button
	Private imgCat As ImageView
	Private lblNomCat As Label
	Private lblCantCat As Label
	Private btnReporteBack As Button
	Private Panel2 As Panel
	Private PanelEncabezadoM As Panel
	Private PanelEncabezadoRepo As Panel
End Sub

Sub Initialize 
	
	pageReporte.Initialize("pageReporte")
	pageReporte.RootPanel.LoadLayout("frmReportesOrdenes")
	Main.NavControl.ShowPage(pageReporte)
	
	PanelEncabezadoRepo.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	PanelEncabezadoM.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	Panel2.SetShadow(Colors.Gray,1dip,2dip,0.3,True)
	btnBuscarReporte.SetShadow(Colors.Gray,1dip,2dip,0.3,True)
	btnAceptarDate.SetShadow(Colors.Gray,1dip,2dip,0.3,True)
	btnCancelarDate.SetShadow(Colors.Gray,1dip,2dip,0.3,True)
	btnbackProOrden.SetShadow(Colors.Gray,1dip,2dip,0.3,True)
	btnAddAllproOrden.SetShadow(Colors.Gray,1dip,2dip,0.3,True)
	
	DateTime.DateFormat = "yyyy-MM-dd"
	
	lblFechaInicio.Text = DateTime.Date(DateTime.Now)
	lblfechaFinal.Text = DateTime.Date(DateTime.Now)
	BuscarOrdenes
	
	Main.smc.Tag = "reporte"
	
	
End Sub

Sub Panel1_Click
	
	cualFe = True
	PanelFondoDatePicker.Left = 0
	PanelFondoDatePicker.SetAlphaAnimated(500,1)
	
	DateFecha.Ticks = DateTime.Now
	
End Sub

Sub Panel3_Click
	
	cualFe = False
	PanelFondoDatePicker.Left = 0
	PanelFondoDatePicker.SetAlphaAnimated(500,1)
	
	DateFecha.Ticks = DateTime.Now
	
End Sub

Sub btnCancelarDate_Click
	
	PanelFondoDatePicker.SetAlphaAnimated(500,0)
	
End Sub

Sub btnAceptarDate_Click
	
	DateTime.DateFormat = "yyyy-MM-dd"
	
	If cualFe Then
		lblFechaInicio.Text = DateTime.Date(DateFecha.Ticks)
		Else
		lblfechaFinal.Text =  DateTime.Date(DateFecha.Ticks)
	End If
	
	btnCancelarDate_Click
	
End Sub

Sub BuscarOrdenes
	
	Dim JobBuscar As HttpJob
	JobBuscar.Initialize("JobBuscar",Me)
	JobBuscar.PostString(Main.url&"puntoventa/get_ordenes_cliente","json="&funciones.crearJson(Main.token,""))
	
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
		
		Case "JobBuscar"
			list = map.Get("f_data")
			
			If list.Size == 0 Then
				Msgbox("No hay ordenes registradas","Información")
				Return
			End If
			
			Label3.Text = "Ordenes registradas: "&list.Size
			
			Dim titulo As String
			Dim secondLine As String
			Dim estado As String
			
			listaOrdenes.Clear
			
			For i=0 To list.Size - 1
				
				map = list.Get(i)
				
				secondLine = "Fecha: "&map.Get("f_fecha_regstro_orden")
				estado = "Estado: "&map.Get("f_status")
				titulo = map.Get("f_negocio")&"   $"&NumberFormat(map.Get("f_total"),0,2)
				
				listaOrdenes.Add(CreateListItem(titulo,secondLine,estado,listaOrdenes.GetBase.Width,65dip),map)
				
			Next
			
		Case "JobEliminar"
			map = map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				listaOrdenes.RemoveAt(indiceBorrar)
				Msgbox("Orden cancelada.","Información")
				
			Else
				Msgbox("La orden ya no se puede ser cancelada.","Información")
			End If
			
		Case "BuscarProducto"
			
			list = map.Get("f_data")
			listaAddAll.Clear
			listaAddAll = list
			
			listAux = listaAddAll
			
			PanelFondoDetalleOrden.Top = 0%y
			PanelFondoDetalleOrden.SetAlphaAnimated(500,1)
			
			lbltituloProOrden.Text = numOrden
			
			Dim bm As Bitmap
			
			ListProOrdenDetalle.Clear
			
			For i = 0 To list.Size-1
				
				Dim mapa As Map
				mapa = list.Get(i)
				
				
				If  mapa.Get("f_foto")<> Null And  mapa.Get("f_foto") <> "" Then
					bm = funciones.getImagen(mapa.Get("f_foto"))
					'bm = (mapa.Get("f_foto"))
				Else
					bm.Initialize(File.DirAssets,"no-image.jpg")
				End If
				
				ListProOrdenDetalle.Add(CreateListItem2(mapa.Get("f_nombre"),mapa.Get("f_precio"),bm,ListProOrdenDetalle.GetBase.Width,50dip),mapa)
				
			Next
			
		Case "JobDetalleTemporal"
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Main.cantidadProduto = Main.cantidadProduto + 1
			hud.ToastMessageShow("Producto agregado...",False)
			
		Case "JobDetalleTemporalAll"
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Main.cantidadProduto = Main.cantidadProduto + 1
		
	End Select
	
End Sub


Sub CreateListItem2(Nombre As String, cantidad As String,img As Bitmap, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) 'set the size before the layout is loaded
	p.LoadLayout("frmPanelesItems")
	lblNomCat.Text = Nombre
	lblCantCat.Text = "$ "&cantidad
	imgCat.Bitmap = img
	Return p
End Sub

Sub CreateListItem(Dir As String, fecha As String,principal As String, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) 'set the size before the layout is loaded
	p.LoadLayout("frmItemsDir")
	lblDir.Text = Dir
	lblFecha.Text = fecha
	lblPrincipal.Text = principal
	Return p
End Sub


Sub btnBuscarReporte_Click
	
	'Msgbox(DateTime.DateParse(lblfechaFinal.Text),"")

	If DateTime.DateParse(lblfechaFinal.Text) >= DateTime.DateParse(lblFechaInicio.Text) Then
		
		DateTime.DateFormat = "yyyy-MM-dd"
		
		Dim json As String
		json = "'f_fecha1':'"&DateTime.Date(DateTime.DateParse(lblFechaInicio.Text))&"','f_fecha2':"&DateTime.Date(DateTime.DateParse(lblfechaFinal.Text))
		
		Dim JobBuscar As HttpJob
		JobBuscar.Initialize("JobBuscar",Me)
		hud.ToastMessageShow("Buscando ordenes...",False)
		JobBuscar.PostString(Main.url&"puntoventa/get_ordenes_cliente2","json="&funciones.crearJson(Main.token,json))
		
		Else
			Msgbox("La fecha final debe ser mayor a la fecha de inicio para poder realizar la busqueda!!","Advertencia!")
	End If
	
End Sub

Sub listaOrdenes_ItemLongClick (Index As Int, Value As Object)
	
	'ELIMINA LAS ORDENES
	Msgbox2("Msg1","Desea elimiar esta orden?","Advertencia!",Array("Si","No"))
	mapaBorrar.Initialize
	mapaBorrar = Value
	indiceBorrar = Index

End Sub


Sub Msg1_Click(ButtonText As String)

	If ButtonText = "Si" Then

		Dim map As Map = mapaBorrar
		
		Dim json As String
		json = "'f_idrecord':"&map.Get("f_idrecord")&",'f_idempresa':"&map.Get("f_idempresa")
		
		Dim JobEliminar As HttpJob
		JobEliminar.Initialize("JobEliminar",Me)
		JobEliminar.PostString(Main.url&"puntoventa/set_eliminar_orden","json="&funciones.crearJson(Main.token,json))
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

Sub listaOrdenes_ItemClick (Index As Int, Value As Object)
	
	'BUSCO LOS PRODUCTOS PARA PRESENTAR EL MODAL
	
	Dim mapa As Map
	mapa = Value

	Dim json As String = "'f_idrecord':"&mapa.Get("f_idrecord")
	
	Dim BuscarProducto As HttpJob
	BuscarProducto.Initialize("BuscarProducto",Me)
	
	numOrden = mapa.Get("f_numero")
	listaAddAll.Initialize
	
	BuscarProducto.PostString(Main.url&"puntoventa/buscar_productos_by_orden","json="&funciones.crearJson(Main.token,json))
	
End Sub

#Region Detalles de Orden

Sub ListProOrdenDetalle_ItemClick (Index As Int, Value As Object)
	
	Msgbox2("Msg2","Desea agregar este producto a su carrito?","Aviso!",Array("Si","No"))
	
	mapaDetalleOrden = Value
	indiceDetalleOrden = Index
	
End Sub

Sub btnbackProOrden_Click
	PanelFondoDetalleOrden.SetAlphaAnimated(500,0)
End Sub

Sub btnAddAllproOrden_Click
	
	Msgbox2("Msg3","Desea agregar todos los productos a su carrito?","Aviso!",Array("Si","No"))
	
End Sub


Sub Msg2_Click(ButtonText As String)

	If ButtonText = "Si" Then

		Dim mapaPro As Map
		mapaPro = mapaDetalleOrden
		
		listAux.RemoveAt(indiceDetalleOrden)

	
		salvar_detalle_temporal(mapaPro,1)
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub


Sub Msg3_Click(ButtonText As String)

	If ButtonText = "Si" Then

		For i=0 To listAux.Size-1
		
			Dim map As Map
			map = listAux.Get(i)
		
			salvar_detalle_temporal_All(map,1)
		Next
	
		Msgbox("Se agregaron todos los productos en existencia, verifique en su carrito!","Realizado")
		btnbackProOrden_Click
		
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

Sub salvar_detalle_temporal_All(map As Map, cantidad As Int )
	
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
	
	Dim JobDetalleTemporal2 As HttpJob
	JobDetalleTemporal2.Initialize("JobDetalleTemporalAll",Me)
	JobDetalleTemporal2.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funciones.crearJson(Main.tokenPublico,json))
	
End Sub

Sub btnReporteBack_Click
	
	Main.smc.Tag = "inicio"
	Main.NavControl.RemoveCurrentPage
	
	Main.actualizarCantidad
End Sub































