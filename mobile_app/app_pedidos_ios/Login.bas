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

	Private btnConfiguracion As Button
	Private btnLogin As Button
	Private PanelConfiguracion As Panel
	Dim toast As HUD
	Private page As Page
	Dim correro As String
	Dim pageReg As Page
	Dim SQL As SQL
	Dim hud As HUD
	
	Dim width As Int
	Dim smcLog As SideMenuController
	
	
	Private btnMenuPrincipal As Button
	Private txtUsuario As TextField
	Private txtContrasena As TextField
	
	Dim App As Application
	Private lblRegistrarme As Label
	Private btnRegistroClienteBack As Button
	Private btnRegistroClienteRegistrarme As Button
	Private Panel1 As Panel
	Private txtContrasena2 As TextField
	Private txtContrasenaRegistro As TextField
	Private txtDireccion As TextField
	Private txtNombre As TextField
	Private txtTelefono As TextField
	Private txtUsuarioRegistro As TextField
	
	
	Private txtURL As TextView
	Private btnIniciarSecion As Button
End Sub


Sub Initialize
	
	
	If File.Exists(File.DirDocuments, "db.db") = False Then
		File.Copy(File.DirAssets, "db.db", File.DirDocuments, "db.db")
	End If
	SQL.Initialize(File.DirDocuments, "db.db", False)
	
	page.Initialize("PageLogin")
	
	page.RootPanel.LoadLayout("frmLogin")
	
	page.Tag = page.RootPanel.Top + 50%y
	
	Main.NavControl.ShowPage2(page,True)
	
	txtURL.Alpha = 0
	txtURL.Text = Main.url
	
	Main.smc.Tag = "login"
	
'	Dim ncLog As NavigationController
'	ncLog.Initialize("nc")
'	Main.NavControl = ncLog
'	
'	smcLog.Initialize(Null, ncLog,Null)
'	App.KeyController = smcLog
'	Main.NavControl.ShowPage(page)
	
End Sub

Sub btnConfiguracion_Click
	
	If txtURL.Alpha = 0 Then
		txtURL.SetAlphaAnimated(300,1)
	Else
		txtURL.SetAlphaAnimated(300,0)
		updateURL
	End If
End Sub

Sub updateURL
	SQL.ExecNonQuery2("UPDATE t_preferencia SET f_url = ?",Array As Object(txtURL.Text.Trim))
	Main.url = txtURL.Text.Trim
	hud.ToastMessageShow("URL actializado",False)
End Sub

Sub btnLogin_Click
	
	
	If  txtContrasena.Text.Trim.Length = 0 Or txtUsuario.Text.Trim.Length = 0 Then
		Msgbox("Faltan datos por ingresar","Aviso")
	Else
		'hd.ToastMessageShow("Conectando..",False)
		toast.ProgressDialogShow("Conectando..")
		txtUsuario.UserInteractionEnabled = True
		Dim url2 As String
		Dim dato As String
		Dim data As String
		Dim  imei As String
		Dim operadora As String
		
		correro = txtUsuario.Text.Trim
		
		Dim device As NativeObject
		device = device.Initialize("UIDevice").RunMethod("currentDevice", Null)
		operadora= App.OSVersion
		imei = device.GetField("identifierForVendor").AsString
		
		data = "'f_modelo':'','f_banda':'', 'f_operadora': '"& operadora&"','f_tamano':0,"& _
		"'f_imei':'"&imei&"','f_usuario':'"&txtUsuario.Text.Trim&"','f_contrasena':'"&txtContrasena.Text.Trim&"'"
		
		dato=funciones.crearJson("none",data)
		url2 = Main.url & "login/login/"
		
		Dim JobLogin As HttpJob
		JobLogin.Initialize("JobLogin",Me)
		JobLogin.PostString(url2 ,"json="&dato)
	End If
	
End Sub

Sub btnMenuPrincipal_Click
	
	If Main.reload Then
		Main.Initialize
		Else
		Main.smc.Tag = "inicio"
		Main.NavControl.RemoveCurrentPage
	End If
	
End Sub

Sub JobDone(Job As HttpJob)
	
	toast.ProgressDialogHide
	
	If Job.Success = False Then
		Msgbox(Main.jobMsj,Main.jobMsjTitle)
		Return
	End If
	
	If funciones.verificarJob(Job.GetString)=False Then
		Return
	End If
	
	Dim map As Map
	Dim json As JSONParser
	json.Initialize(funciones.base64_Decode(Job.GetString))
	map = json.NextObject
	
	Select Job.JobName
		
		Case "JobLogin"
			
			Main.token = map.Get("f_key")
			map = map.Get("f_data")
			Main.usersData.idUsuario = map.Get("f_idrecord")
			Main.usersData.nombre = map.Get("f_nombre")
			Main.usersData.longitud = map.Get("f_longitud")
			Main.usersData.latitud = map.Get("f_latitud")
			
			Main.isLoged= True
			txtContrasena.Text = ""
			txtUsuario.Text = ""
			Main.Initialize
			
		Case "JobNewUser"
			'map = map.Get("f_data")
			map = Job.Tag
			txtUsuario.Text = map.Get("f_email")
			txtContrasena.Text = map.Get("f_password")
			btnRegistroClienteBack_Click
			btnLogin_Click
			
	End Select
	
End Sub

Sub lblRegistrarme_Click
	

	pageReg.Initialize("pageReg")
	
	pageReg.RootPanel.LoadLayout("frmRegistarCliente")
	
	Main.NavControl.ShowPage(pageReg)
	pageReg.Tag = pageReg.RootPanel.Top + 50%y
	
End Sub

#Region MoverTeclado

Sub pageReg_KeyboardStateChanged (Height As Float)
	
	funciones.KeyboardStateChanged(Height,pageReg,pageReg.Tag)
	
End Sub

Sub PageLogin_KeyboardStateChanged (Height As Float)

	funciones.KeyboardStateChanged(Height,page,-1) 
	 
End Sub


#End Region



#Region RegistroDeClientes

Sub btnRegistroClienteRegistrarme_Click
	
	If txtNombre.Text.Trim.Length = 0 Then
		Msgbox("Introduzca su nombre","Información")
		txtNombre.RequestFocus
		Return
	Else if txtTelefono.Text.Trim.Length = 0 Then
		Msgbox("Introduzca su teléfono","Información")
		txtTelefono.RequestFocus
		Return
	else if txtDireccion.Text.Trim.Length = 0 Then
		Msgbox("Introduzca su dirección","Información")
		txtDireccion.RequestFocus
		Return
	else if txtUsuarioRegistro.Text.Trim.Length = 0 Then
		Msgbox("Introduzca su correo electrónico","Información")
		txtUsuarioRegistro.RequestFocus
		Return
	else if txtContrasenaRegistro.Text.Trim.Length = 0 Then
		Msgbox("Introduzca su contraseña","Información")
		txtContrasenaRegistro.RequestFocus
		Return
	else if txtContrasena2.Text.Trim.Length = 0 Then
		Msgbox("Introduzca su contraseña nuevamente","Información")
		txtContrasena2.RequestFocus
		Return
	Else If txtContrasenaRegistro.Text <> txtContrasena2.Text Then
		Msgbox("Las contraseñas no coinciden.","Información")
		txtContrasenaRegistro.RequestFocus
		Return
	End If
	
	Dim json As JSONGenerator
	Dim map As Map
	map.Initialize
	map.Put("f_nombre",txtNombre.Text.Trim)
	map.Put("f_telefono", txtTelefono.Text.Trim)
	map.Put("f_direccion", txtDireccion.Text.Trim)
	map.Put("f_email",txtUsuarioRegistro.Text.Trim)
	map.Put("f_password",txtContrasenaRegistro.Text.Trim)
	map.Put("f_latitud","")
	map.Put("f_longitud","")
	map.Put("f_idrecord",0)
	json.Initialize(map)
	
	Dim JobNewUser As HttpJob
	JobNewUser.Initialize("JobNewUser",Me)
	JobNewUser.Tag = map
	JobNewUser.PostString(Main.url&"ws/set_salvar_usuario" ,"json="&funciones.crearJson2(Main.tokenPublico, json.ToString))
	
End Sub

Sub btnRegistroClienteBack_Click
	
	clearRegistro
	Main.NavControl.RemoveCurrentPage
	
End Sub

Sub clearRegistro
	
	txtNombre.Text = ""
	txtTelefono.Text = ""
	txtDireccion.Text = ""
	txtUsuarioRegistro.Text = ""
	txtContrasenaRegistro.Text = ""
	txtContrasena2.Text = ""
	
End Sub

#End Region






















