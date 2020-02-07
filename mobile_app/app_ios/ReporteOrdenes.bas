﻿B4i=true
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
	Private btnBuscarReporte As Button
	Private chOrdenesAbiertas As Switch
	Private date As DatePicker
	Private Panel1 As Panel
	Private Panel2 As Panel
	Private ListViewOrdenes As TableView
	
End Sub

Sub Initialize
	page.Initialize("PageReporteOrdenes")
	page.RootPanel.LoadLayout("frmReporteOrdenes")
	
	Main.NavControl.ShowPage(page)
	Main.NavControl.ToolBarVisible = False
	chOrdenesAbiertas.Value = True
	crear
	btnBuscarReporte_Click
End Sub

Sub crear
	Panel1.SetShadow(Colors.Gray, 0dip,0dip, 0.5,False)
	Panel2.SetShadow(Colors.Gray, 0dip,0dip, 0.5,False)
	
	ListViewOrdenes.Initialize("ListViewDirecciones",False)
	Panel2.AddView(ListViewOrdenes,0,0,Panel2.Width,Panel2.Height)
	
	chOrdenesAbiertas.Value = True
End Sub

Sub btnBuscarReporte_Click
	
	DateTime.DateFormat = "yyyy-MM-dd"
	
	Dim json As String
	json = "'f_fecha1':'"&DateTime.Date(date.Ticks)&"','f_pendiente':"&chOrdenesAbiertas.Value
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
			
			If ListViewOrdenes.IsInitialized Then
				ListViewOrdenes.RemoveViewFromParent
				ListViewOrdenes.Initialize("ListViewOrdenes",False)
				Panel2.AddView(ListViewOrdenes,0,0,Panel2.Width,Panel2.Height)
			End If
			
			If list.Size = 0 Then
				Msgbox("No hay ordenes registradas","Información")
				Return
			End If
			
			Dim secondLine As String
			For i=0 To list.Size - 1
				map = list.Get(i)
				secondLine = "Fecha: "&map.Get("f_fecha_regstro_orden")&CRLF&"Estado: "&map.Get("f_status")
				
				Dim cell As TableCell = ListViewOrdenes.AddTwoLines(map.Get("f_negocio")&"   $"&NumberFormat(map.Get("f_total"),0,2),secondLine)
				cell.Tag = map
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



Sub ListViewOrdenes_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	'{"f_idrecord":308,"f_numero":"ORD 000023","f_fecha_regstro_orden":"2018-10-31 12:00:00 am","f_negocio":"Delicias CxA","f_itbis":30.5,"f_total":200,"f_idempresa":1000,"f_status":"On-way"}}}
	
	Msgbox2("Msg", "Seguro que desea eliminar esta orden?", "Confirmación", Array ("Si", "Volver"))
	Wait For Msg_Click (ButtonText As String)	
	
	If ButtonText = "Si" Then
		Dim map As Map = Cell.Tag
		Dim json As String
		json = "'f_idrecord':"&map.Get("f_idrecord")&",'f_idempresa':"&map.Get("f_idempresa")
		
		Dim JobEliminar As HttpJob
		JobEliminar.Initialize("JobEliminar",Me)
		JobEliminar.PostString(Main.url&"puntoventa/set_eliminar_orden","json="&funcion.crearJson(Main.token,json))
	End If
	
End Sub