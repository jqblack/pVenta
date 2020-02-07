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

	Private btnDireccionBack As Button
	Private btnNuevaDireccion As Button
	Private btnSalvarDireccion As Button
	Private ListViewDirecciones As ListView
	Private PanelDireccion As Panel
	Private txtDireccion As EditText
	Private chPrincipal As CheckBox
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	Activity.LoadLayout("frmDirecciones")
	
	ListViewDirecciones.TwoLinesLayout.ItemHeight = 85dip
	ListViewDirecciones.TwoLinesLayout.Label.TextColor = Colors.Black
	ListViewDirecciones.TwoLinesLayout.Label.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	
	ListViewDirecciones.TwoLinesLayout.SecondLabel.TextColor = Colors.Gray
	ListViewDirecciones.TwoLinesLayout.SecondLabel.Typeface = Typeface.LoadFromAssets("Roboto-Light.ttf")
	ListViewDirecciones.TwoLinesLayout.SecondLabel.Height = 10%y
	funcion.SetDivider(ListViewDirecciones,Colors.Gray,1dip)
	txtDireccion.Tag = 0
	
	cargarDirecciones
	
End Sub

Sub cargarDirecciones
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funcion.crearJson(Main.token,""))
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
			ListViewDirecciones.Clear
			If list.Size = 0 Then
				Msgbox("No tiene direcciones registradas","Información")
				Return
			End If
			
			'{'f_key':'1','f_data':[{"f_idrecord":1,"f_idusuario":7,"f_fecha":1540927870000,"f_principal":true,"f_direccion":"SABANA LARGA "}]}
			Dim dr,default="" As String
			For i=0 To list.Size -1
				map = list.Get(i)
				chPrincipal.Checked = map.Get("f_principal")
				dr = funcion.base64_Decode(map.Get("f_direccion"))
				
				If dr.Length > 40 Then
					dr = dr.SubString2(0,40)&"..."
				End If
				
				If chPrincipal.Checked Then
					default = CRLF& "Dirección principal"
				End If
				
				ListViewDirecciones.AddTwoLines2(dr,map.Get("f_fecha") & default ,map)
			Next
			
		Case "JobSalvar"
			Msgbox("Dirección registrada." ,"Información")
			btnNuevaDireccion_Click
	
	End Select
	
End Sub


Sub Activity_Resume
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub


Sub ListViewDirecciones_ItemClick (Position As Int, Value As Object)
	Dim map As Map = Value
	txtDireccion.Text = funcion.base64_Decode(map.Get("f_direccion"))
	txtDireccion.Tag = map.Get("f_idrecord")
End Sub

Sub btnSalvarDireccion_Click
	If txtDireccion.Text.Trim.Length = 0 Then
		Msgbox("Introduzca la dirección","Información")
		txtDireccion.RequestFocus
		Return
	End If
	
	Dim json As String
	json = "'f_principal':"&chPrincipal.Checked&",'f_direccion':'"&funcion.base64_Encode(txtDireccion.Text.Trim)&"','f_idrecord':"&txtDireccion.Tag&",'f_credito_fiscal':false"
	
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funcion.crearJson(Main.token,json))
	
End Sub

Sub btnNuevaDireccion_Click
	txtDireccion.Text =""
	txtDireccion.Tag = 0
	chPrincipal.Checked = False
	cargarDirecciones
End Sub

Sub btnDireccionBack_Click
	Activity.Finish
End Sub


