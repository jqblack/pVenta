B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=Activity
Version=9.01
@EndOfDesignText@
#Region  Activity Attributes 
	#FullScreen: False
	#IncludeTitle: false
#End Region

Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.

End Sub

Sub Globals
	'These global variables will be redeclared each time the activity is created.
	'These variables can only be accessed from this module.

	Private txtdir As EditText
	Private txtNombre As EditText
	Private txttel As EditText
	Private lblemail As Label
	Private btnDireccionBack As Button
	Private btnChangePass As Button
	Private PanelFondoModalpass As Panel
	Private PanelFondoUser As Panel
	Private btnBackChangePass As Button
	Private btnConfirmChangePass As Button
	Private txtNewPass As EditText
	Private txtPassAntigua As EditText
	Private txtPassConfirm As EditText
	Private btnSave As Button
End Sub

Sub Activity_Create(FirstTime As Boolean)
	'Do not forget to load the layout file created with the visual designer. For example:
	
	Activity.LoadLayout("frmPerfilClient")
	
	Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario
	
	Dim jobperfil As HttpJob
	jobperfil.Initialize("BuscarPerfil",Me)
	jobperfil.PostString(Main.url&"puntoventa/perfil","json="&funcion.crearJson(Main.token,json))

End Sub

Sub Activity_Resume

End Sub

Sub Activity_Pause (UserClosed As Boolean)

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
		
		
		Case "BuscarPerfil"
			
			Dim mapa As Map
			list = map.Get("f_data")
			mapa = list.Get(0)
			
			txtNombre.Text = mapa.Get("f_nombre")
			lblemail.Text = mapa.Get("f_email")
			txttel.Text = mapa.Get("f_telefono")
			txtdir.Text = mapa.Get("f_direccion")
			
		Case "actualizar"
			
			If map.Get("f_data") Then
				ToastMessageShow("Información actualizada", False)
				btnDireccionBack_Click
				
				txtNombre.Text = ""
				lblemail.Text = ""
				txttel.Text = ""
				txtdir.Text = ""
				
				Else
					Msgbox("Hubo un error al actualizar la información","Error")
			End If
			
		Case "changePass"
			
			If map.Get("f_data") Then
				ToastMessageShow("Contrseña actualizada", False)
			btnBackChangePass_Click
			
			txtPassAntigua.Text = ""
			txtNewPass.Text = ""
			txtPassConfirm.Text = ""
			
			Else
				Msgbox("La Contraseña introducida no coincide con la anterior","Error")
			End If
			
								
	End Select
	
End Sub
	

Sub btnDireccionBack_Click
	
	Activity.Finish
	StartActivity(Principal)
	
End Sub


Sub btnChangePass_Click
	
	If  PanelFondoModalpass.IsInitialized == False Then
		Activity.LoadLayout("frmChangePass")
		PanelFondoModalpass.Visible = False
	End If
	
	funcion.DisableView(True,PanelFondoUser)
	PanelFondoModalpass.SetVisibleAnimated(250,True)
	
End Sub

Sub btnConfirmChangePass_Click
	
	If txtPassAntigua.Text == "" Then
		Msgbox("Debe poner la contrseña antigua para poder actualizar","Aviso")
		Return
	End If
	
	If txtNewPass.Text == "" Then
		Msgbox("Debe poner la  nueva contrseña  para poder actualizar","Aviso")
		Return
	End If
	
	If txtNewPass.Text == txtPassAntigua.Text Then
		Msgbox("La nueva contrseña debe de ser diferente a la anterior para poder actualizar","Aviso")
		Return
	End If
	
	If txtPassConfirm.Text == "" Then
		Msgbox("Debe de confirmar su nueva contrseña  para poder actualizar","Aviso")
		Return
	End If
	
	If txtPassConfirm.Text <> txtPassConfirm.Text Then
		Msgbox("Las contrseñas nuevas no coinciden. Por favor verifique de nuevo","Aviso")
		Return
	End If
	
	Dim json As String
	json = "'f_antigua':"&txtPassAntigua.Text& _
	",'f_nueva':"&txtNewPass.Text& _
	", 'f_idusuario':"&Main.usersData.idUsuario
	
	Dim changePass As HttpJob
	changePass.Initialize("changePass",Me)
	changePass.PostString(Main.url&"puntoventa/changePass","json="&funcion.crearJson(Main.token,json))
	
End Sub

Sub btnBackChangePass_Click
	
	funcion.DisableView(False,PanelFondoUser)
	PanelFondoModalpass.SetVisibleAnimated(250,False)
	
End Sub

Sub btnSave_Click
	
	If txtNombre.Text == "" Then
		Msgbox("No puede dejar el Nombre vacio","Aviso")
		Return
	End If
	
	If lblemail.Text == "" Then
		Msgbox("No puede dejar el Email vacio","Aviso")
		Return
	End If
	
	If txttel.Text == "" Then
		Msgbox("No puede dejar el Teléfono vacio","Aviso")
		Return
	End If
	
	If txtdir.Text == "" Then
		Msgbox("No puede dejar la Dirección vacia","Aviso")
		Return
	End If
	
	
	Dim json As String
	json = "'f_nombre':"&txtNombre.Text& _
	",'f_email':"&lblemail.Text& _
	  		",'f_tel':"&txttel.Text& _
	",'f_direccion':"&txtdir.Text& _
	", 'f_idusuario':"&Main.usersData.idUsuario
	
	Dim actualizar As HttpJob
	actualizar.Initialize("actualizar",Me)
	actualizar.PostString(Main.url&"puntoventa/actualizar","json="&funcion.crearJson(Main.token,json))
	
End Sub












