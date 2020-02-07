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
	
	Dim numOrden As String
	Dim listaAddAll As List
	Dim listAux As List
End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private btnBuscarReporte As Button
	Private btnReporteBack As Button
	Private chOrdenesAbiertas As CheckBox
	Private date As AnotherDatePicker
	Private ListViewOrdenes As ListView
	Private PanelFondoOrdeDetalle As Panel
	Private lbltituloProOrden As Label
	Private ListProOrdenDetalle As ListView
	Private btnbackProOrden As Button
	Private btnAddAllproOrden As Button
	Private PanelOrdenes As Panel
	Private date2 As AnotherDatePicker
	Private Label3 As Label
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	

		
		Activity.LoadLayout("frmReporteOrdenes")

		ListViewOrdenes.TwoLinesLayout.ItemHeight = 85dip
		ListViewOrdenes.TwoLinesLayout.Label.TextColor = Colors.Black
		ListViewOrdenes.TwoLinesLayout.Label.TextSize = 15
		ListViewOrdenes.TwoLinesLayout.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	
		ListViewOrdenes.TwoLinesLayout.SecondLabel.TextColor = Colors.Gray
		ListViewOrdenes.TwoLinesLayout.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
		ListViewOrdenes.TwoLinesLayout.SecondLabel.Height = 10%y
		funcion.SetDivider(ListViewOrdenes,Colors.Gray,1dip)
	
	
	If Main.logged Then
		
		
		Else
			Dim r As Int
			
			r = Msgbox2("Para ver sus ordenes debe de iniciar Sesión","Desea iniciar Sesión?","Si","","Más tarde",Null)
			
			If r = DialogResponse.POSITIVE Then
			Main.mostar = True
			StartActivity(Main)
			
			Else
				StartActivity(Principal)
			End If
	End If
	
	
End Sub

Sub Activity_Resume

	If Main.logged Then
		
		Dim JobBuscar As HttpJob
		JobBuscar.Initialize("JobBuscar",Me)
		JobBuscar.PostString(Main.url&"puntoventa/get_ordenes_cliente","json="&funcion.crearJson(Main.token,""))
		
	Else
		Dim r As Int
			
		r = Msgbox2("Para ver sus ordenes debe de iniciar Sesión","Desea iniciar Sesión?","Si","","Más tarde",Null)
			
		If r = DialogResponse.POSITIVE Then
			Main.mostar = True
			StartActivity(Main)
			
		Else
			StartActivity(Principal)
		End If
	End If

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnReporteBack_Click
	Activity.Finish
End Sub

Sub btnBuscarReporte_Click
	
	DateTime.DateFormat = "yyyy-MM-dd"
	
	If DateTime.DateParse(DateTime.Date(date.GetDate))<=  DateTime.DateParse(DateTime.Date(date2.GetDate)) Then
		
		Dim json As String
		json = "'f_fecha1':'"&DateTime.Date(date.GetDate)&"','f_fecha2':"&DateTime.Date(date2.GetDate)
		Dim JobBuscar As HttpJob
		JobBuscar.Initialize("JobBuscar",Me)
		ToastMessageShow("Buscando ordenes...",False)
		JobBuscar.PostString(Main.url&"puntoventa/get_ordenes_cliente2","json="&funcion.crearJson(Main.token,json))
		
		Else
			Msgbox("La fecha de inicio tiene que ser anterior a la fecha límite!","Error")
			Return
	End If
	
End Sub


Sub JobDone(Job As HttpJob)
	
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
			ListViewOrdenes.Clear
			If list.Size == 0 Then
				Msgbox("No hay ordenes registradas","Información")
				Return
			End If
			
			Label3.Text = "Ordenes registradas: "&list.Size
			
			Dim secondLine As String
			For i=0 To list.Size - 1
				map = list.Get(i)
				
				secondLine = "Fecha: "&map.Get("f_fecha_regstro_orden")&CRLF&"Estado: "&map.Get("f_status")
				ListViewOrdenes.AddTwoLines2(map.Get("f_negocio")&"   $"&NumberFormat(map.Get("f_total"),0,2),secondLine,map)
			Next
			
		Case "JobEliminar"
			map = map.Get("f_data")
			If map.Get("f_paso") = "1" Then
				ListViewOrdenes.Clear
				Msgbox("Orden cancelada.","Información")
				btnBuscarReporte_Click
			Else
				Msgbox("La orden ya no se puede ser cancelada.","Información")
			End If
			
		Case "BuscarProducto"
			
			list = map.Get("f_data")
			listaAddAll.Clear
			listaAddAll = list 
			
			listAux = listaAddAll
			
			If PanelFondoOrdeDetalle.IsInitialized == False Then
				
				Activity.LoadLayout("frmProductosOrdenDetalle")
				PanelFondoOrdeDetalle.Visible = False
				
				ListProOrdenDetalle.TwoLinesAndBitmap.ItemHeight = 12%y
	
				ListProOrdenDetalle.TwoLinesAndBitmap.Label.TextColor = Colors.Black
				ListProOrdenDetalle.TwoLinesAndBitmap.Label.TextSize = 15
				ListProOrdenDetalle.TwoLinesAndBitmap.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
				ListProOrdenDetalle.TwoLinesAndBitmap.Label.Padding = Array As Int(30dip,0,0,0)
	
				ListProOrdenDetalle.TwoLinesAndBitmap.SecondLabel.TextColor = Colors.Gray
				ListProOrdenDetalle.TwoLinesAndBitmap.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
				ListProOrdenDetalle.TwoLinesAndBitmap.SecondLabel.Height = -1
				
				funcion.SetDivider(ListProOrdenDetalle,Colors.LightGray,1dip)
		
	
			End If
			
			funcion.DisableView(True,PanelOrdenes)
			lbltituloProOrden.Text = numOrden
			PanelFondoOrdeDetalle.SetVisibleAnimated(250,True)
			
			Dim bm As BitmapDrawable
			
			ListProOrdenDetalle.Clear
			
			For i = 0 To list.Size-1
				
				Dim mapa As Map 
				mapa = list.Get(i)
				
				If  mapa.Get("f_foto")<> Null And  mapa.Get("f_foto") <> "" Then
					bm = funcion.getImagen(mapa.Get("f_foto"))
				Else
					bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
				End If
				
				ListProOrdenDetalle.AddTwoLinesAndBitmap2(mapa.Get("f_nombre"),mapa.Get("f_precio"),bm.Bitmap,mapa)
				
			Next
			
		Case "JobDetalleTemporal"

			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Principal.cantidadProduto = Principal.cantidadProduto + 1
'			lblCantidadProductos.Text = cantidadProduto
'			lblCantidadProductos.Visible = True
			ToastMessageShow("Producto agregado al carrito.",False)
			
		Case "JobDetalleTemporalAll"
			
			map = map.Get("f_data")
			If map.Get("f_paso") = "0" Then
				Msgbox("Este producto no tiene existencia: "& CRLF & Job.Tag&"." ,"Información")
				Return
			End If
			Principal.cantidadProduto = Principal.cantidadProduto + 1
		
	End Select

End Sub

Sub ListViewOrdenes_ItemClick (Position As Int, Value As Object)

	'BUSCO LOS PRODUCTOS PARA PRESENTAR EL MODAL
	
	Dim mapa As Map
	mapa = Value

	Dim json As String = "'f_idrecord':"&mapa.Get("f_idrecord")
	
	Dim BuscarProducto As HttpJob
	BuscarProducto.Initialize("BuscarProducto",Me)
	
	numOrden = mapa.Get("f_numero")
	listaAddAll.Initialize
	
	BuscarProducto.PostString(Main.url&"puntoventa/buscar_productos_by_orden","json="&funcion.crearJson(Main.token,json))
	
	
End Sub


Sub ListViewOrdenes_ItemLongClick (Position As Int, Value As Object)
	
	'ELIMINA LAS ORDENES
	
	Dim r As Int =  Msgbox2("Seguro que desea eliminar esta orden?","Confirmación","Si","","Volver",Null)
	
	If r = DialogResponse.POSITIVE Then
		Dim map As Map = Value
		
		'{"f_idrecord":308,"f_numero":"ORD 000023","f_fecha_regstro_orden":"2018-10-31 12:00:00 am","f_negocio":"Delicias CxA","f_itbis":30.5,"f_total":200,"f_idempresa":1000,"f_status":"On-way"}}}
		
		Dim json As String
		json = "'f_idrecord':"&map.Get("f_idrecord")&",'f_idempresa':"&map.Get("f_idempresa")
		
		Dim JobEliminar As HttpJob
		JobEliminar.Initialize("JobEliminar",Me)
		JobEliminar.PostString(Main.url&"puntoventa/set_eliminar_orden","json="&funcion.crearJson(Main.token,json))
	End If

	
End Sub


Sub btnbackProOrden_Click
	
	funcion.DisableView(False,PanelOrdenes)
	PanelFondoOrdeDetalle.SetVisibleAnimated(250,False)
	
End Sub

Sub btnAddAllproOrden_Click
	
	Dim res As Int = Msgbox2("Desea agregar todos los  productos al carrito?","Aviso!","Si","","No",Null)
	
	If res == DialogResponse.POSITIVE Then
'		Msgbox(listaAddAll.Size-1,"")
'		Return
		For i=0 To listaAddAll.Size-1
		Log(i)
			Dim map As Map
			map = listaAddAll.Get(i)
		
			salvar_detalle_temporal_All(map,1)
		Next
	
		Msgbox("Se agregaron todos los productos en existencia, verifique en su carrito!","Realizado")
		btnbackProOrden_Click
		
		Else
			Return 
	End If
	
End Sub

Sub ListProOrdenDetalle_ItemClick (Position As Int, Value As Object)
	
	Dim res As Int = Msgbox2("Desea agregar este producto al carrito?","Aviso!","Si","","No",Null)
	
	If res == DialogResponse.POSITIVE Then
		
		Dim mapaPro As Map
		mapaPro = Value
	
		listAux.Clear
	
		For i=0 To listaAddAll.Size -1
			Dim map As Map
			map = listaAddAll.Get(i)

			If map.Get("f_idrecord") == mapaPro.Get("f_idrecord") Then
				listaAddAll.RemoveAt(Position)
			End If
		Next
	
		salvar_detalle_temporal(mapaPro,1)
		
		Else 
			Return 
	End If
	
End Sub

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
			",'f_porciento_tax':"&map.Get("f_tax")& _
			",'f_imei':"&Main.imei 
	
	Dim JobDetalleTemporal As HttpJob
	JobDetalleTemporal.Initialize("JobDetalleTemporal",Me)
	JobDetalleTemporal.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funcion.crearJson(Main.tokenPublico,json))
	
End Sub

Sub salvar_detalle_temporal_All(map As Map, cantidad As Int )
	
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
			",'f_porciento_tax':"&map.Get("f_tax")& _
			",'f_imei':"&Main.imei 
	
	Dim JobDetalleTemporal2 As HttpJob
	JobDetalleTemporal2.Initialize("JobDetalleTemporalAll",Me)
	JobDetalleTemporal2.PostString(Main.url&"puntoventa/salvar_detalle_temporal2","json="&funcion.crearJson(Main.tokenPublico,json))
	
End Sub









