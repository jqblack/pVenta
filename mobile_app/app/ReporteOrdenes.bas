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

	Private btnBuscarReporte As Button
	Private btnReporteBack As Button
	Private chOrdenesAbiertas As CheckBox
	Private date As AnotherDatePicker
	Private ListViewOrdenes As ListView
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
	
	chOrdenesAbiertas.Checked = True
	
	btnBuscarReporte_Click
End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub btnReporteBack_Click
	Activity.Finish
End Sub

Sub btnBuscarReporte_Click
	
	DateTime.DateFormat = "yyyy-MM-dd"
	
	Dim json As String
	json = "'f_fecha1':'"&DateTime.Date(date.GetDate)&"','f_pendiente':"&chOrdenesAbiertas.Checked
	Dim JobBuscar As HttpJob
	JobBuscar.Initialize("JobBuscar",Me)
	JobBuscar.PostString(Main.url&"puntoventa/get_ordenes_cliente","json="&funcion.crearJson(Main.token,json))
	
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
			If list.Size = 0 Then
				Msgbox("No hay ordenes registradas","Información")
				Return
			End If
			
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
		
	End Select

End Sub

Sub ListViewOrdenes_ItemClick (Position As Int, Value As Object)
	
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