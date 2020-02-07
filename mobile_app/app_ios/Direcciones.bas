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
	Private btnNuevaDireccion As Button
	Private btnSalvarDireccion As Button
	Private chPrincipal As Switch
	Private Panel2 As Panel
	Private txtDireccion As TextView
	Private ListViewDirecciones As TableView
End Sub

Sub Initialize
	page.Initialize("PageDirecciones")
	page.RootPanel.LoadLayout("frmDirecciones")
	
	Main.NavControl.ShowPage(page)
	Main.NavControl.ToolBarVisible = False
	
	crear
	cargarDirecciones
End Sub

Sub crear
	txtDireccion.SetShadow(Colors.Gray, 0dip,2dip, 0.5,False)
	Panel2.SetShadow(Colors.Gray, 0dip,2dip, 0.3,False)
	'page.RootPanel.CalcRelativeKeyboardHeight(500)
	
'	Dim btn As BarButton
'	btn.TintColor = Colors.White
'	
	Dim list As List
	list = page.TopLeftButtons
	Log(list.Size)
	For i=0 To list.Size -1
		GetType(list.Get(i))
	Next
	

	'setTintColor instead of 
	
End Sub


Sub cargarDirecciones
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funcion.crearJson(Main.token,""))
End Sub

Sub btnSalvarDireccion_Click
	If txtDireccion.Text.Trim.Length = 0 Then
		Msgbox("Introduzca la dirección","Información")
		txtDireccion.RequestFocus
		Return
	End If
	
	Dim json As String
	json = "'f_principal':"&chPrincipal.Value&",'f_direccion':'"&funcion.base64_Encode(txtDireccion.Text.Trim)&"','f_idrecord':"&txtDireccion.Tag&",'f_credito_fiscal':false"
	
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funcion.crearJson(Main.token,json))
End Sub

Sub btnNuevaDireccion_Click
	txtDireccion.Text =""
	txtDireccion.Tag = 0
	chPrincipal.SetValueAnimated(False)
	cargarDirecciones
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
		
		Case "JobDirecciones"
			list = map.Get("f_data")
			
			If ListViewDirecciones.IsInitialized  Then
				ListViewDirecciones.RemoveViewFromParent
			End If
			ListViewDirecciones.Initialize("ListViewDirecciones",False)
			Panel2.AddView(ListViewDirecciones,0,0,Panel2.Width,Panel2.Height)
			
			If list.Size = 0 Then
				Msgbox("No tiene direcciones registradas","Información")
				Return
			End If
			
			'{'f_key':'1','f_data':[{"f_idrecord":1,"f_idusuario":7,"f_fecha":1540927870000,"f_principal":true,"f_direccion":"SABANA LARGA "}]}
			Dim dr,default="" As String
			Dim principalDireccion As  Boolean
			For i=0 To list.Size -1
				map = list.Get(i)
				
				principalDireccion = map.Get("f_principal")
				dr = funcion.base64_Decode(map.Get("f_direccion"))
				
				If dr.Length > 40 Then
					dr = dr.SubString2(0,40)&"..."
				End If
				
				If principalDireccion Then
					default = CRLF& "Dirección principal"
				End If
				
				Dim cell As  TableCell = ListViewDirecciones.AddTwoLines(dr, DateTime.Date(map.Get("f_fecha")) & default)
				cell.Tag = map
				
			Next
			
		Case "JobSalvar"
			Msgbox("Dirección registrada." ,"Información")
			btnNuevaDireccion_Click
			
	End Select
	
End Sub


Sub PageDirecciones_Disappear
	
End Sub

Sub PageDirecciones_Resize(Width As Int, Height As Int)
	page.RootPanel.Tag = page.RootPanel.Top
End Sub

Sub  PageDirecciones_KeyboardStateChanged (Height As Float)
	funcion.KeyboardStateChanged(Height,page,page.RootPanel.Tag)
End Sub

Sub ListViewDirecciones_SelectedChanged (SectionIndex As Int, Cell As TableCell)
	
	If Cell.Tag = Null Then
		Return
	End If
	
	Dim map As Map = Cell.Tag
	txtDireccion.Text = funcion.base64_Decode(map.Get("f_direccion"))
	txtDireccion.Tag = map.Get("f_idrecord")
	chPrincipal.Value = map.Get("f_principal")
	
End Sub


Sub txtDireccion_TextChanged (OldText As String, NewText As String)
	
	If NewText.Contains(CRLF) Then
		page.resignfocus
	End If
	
End Sub