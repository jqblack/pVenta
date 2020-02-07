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
	
	Dim pagePerfil As Page
	Dim hud As HUD
	
	Private btnChangePass As Button
	Private btnPerfilBack As Button
	Private btnSave As Button
	Private lblemail As Label
	Private PanelEncabezadoUser As Panel
	Private txtdir As TextField
	Private txtNombre As TextField
	Private txttel As TextField
	Private btnBackChangePass As Button
	Private btnConfirmChangePass As Button
	Private txtNewPass As TextField
	Private txtPassAntigua As TextField
	Private txtPassConfirm As TextField
	Private PanelFondoModalpass As Panel

End Sub

Sub Initialize 
	
	pagePerfil.Initialize("pagePerfil")
	pagePerfil.RootPanel.LoadLayout("frmPerfil")
	
	Main.NavControl.ShowPage(pagePerfil)
	
	BuscarDatos
	Main.smc.Tag = "perfil"
End Sub

Sub BuscarDatos
	Dim json As String = "'f_idusuario':"&Main.usersData.idUsuario
	
	Dim jobperfil As HttpJob
	jobperfil.Initialize("BuscarPerfil",Me)
	jobperfil.PostString(Main.url&"puntoventa/perfil","json="&funciones.crearJson(Main.token,json))
	
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
		
		Case "BuscarPerfil"
			
			Dim mapa As Map
			list = map.Get("f_data")
			mapa = list.Get(0)
			
			txtNombre.Text = mapa.Get("f_nombre")
			lblemail.Text = mapa.Get("f_email")
			txttel.Text = mapa.Get("f_telefono")
			txtdir.Text = mapa.Get("f_direccion")
			
		Case "changePass"
			
			If map.Get("f_data") Then
				hud.ToastMessageShow("Contrseña actualizada", False)
				btnBackChangePass_Click
			
				txtPassAntigua.Text = ""
				txtNewPass.Text = ""
				txtPassConfirm.Text = ""
			
			Else
				Msgbox("La Contraseña introducida no coincide con la anterior","Error")
			End If
			
		Case "actualizar"
			
			If map.Get("f_data") Then
				hud.ToastMessageShow("Información actualizada", False)
				btnPerfilBack_Click
				
				txtNombre.Text = ""
				lblemail.Text = ""
				txttel.Text = ""
				txtdir.Text = ""
				
			Else
				Msgbox("Hubo un error al actualizar la información","Error")
			End If
		
		
	End Select
	
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
	actualizar.PostString(Main.url&"puntoventa/actualizar","json="&funciones.crearJson(Main.token,json))
	
End Sub

Sub btnPerfilBack_Click
	Main.smc.Tag = "inicio"
	Main.NavControl.RemoveCurrentPage
End Sub

Sub btnChangePass_Click
	PanelFondoModalpass.Left = 0%x
	PanelFondoModalpass.SetAlphaAnimated(500,1)
End Sub
	

#Region Modal

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
	changePass.PostString(Main.url&"puntoventa/changePass","json="&funciones.crearJson(Main.token,json))
	
	
End Sub

Sub btnBackChangePass_Click
	PanelFondoModalpass.SetAlphaAnimated(500,0)
End Sub

#End Region
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	


