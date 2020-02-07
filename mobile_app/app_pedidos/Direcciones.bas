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
	Dim mapadir As Map
	Dim actualizar As Boolean = False
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
	Private btnAceptarNombreDir As Button
	Private Label16 As Label
	Private txtNombreDireccion As EditText
	Private btnAgregarDirRD As Button
	Private btnBackRd As Button
	Private btnDeleteRD As Button
	Private btnProvinciaCombo As Spinner
	Private chPrincipalRD As CheckBox
	Private txtDireRD As EditText
	Private txtSector As EditText
	Private txtZipCodeRD As EditText
	Private BtnAgregarDireccionFinal As Button
	Private btnBackUsa As Button
	Private btnDeleteUsa As Button
	Private btnState As Spinner
	Private txtAddress1 As EditText
	Private txtAddress2 As EditText
	Private txtCity As EditText
	Private txtZipCode As EditText
	Private PanelFondoDireccionesUSA As Panel
	Private PanelFondoNombreDir As Panel
	
	Dim actu As Boolean = False
	Dim mapaEdit As Map 
	Dim edition As Boolean = False
	Dim update As Int = 0
	Dim reload As Boolean = False
	Dim estados As List
	Dim indexCombo As Int
	Dim IME As IME
	
	Private PanelFondoDireccionesRD As Panel
	Private AddDireccion As Button
	Private PanelComboUSA As Panel
	Private Label3 As Label
	Private Panel1 As Panel
	Private Label5 As Label
	Private Panel2 As Panel
	Private Label6 As Label
	Private Panel3 As Panel
	Private Label7 As Label
	Private panelZipCode As Panel
	
	
	
	Dim tlbl6 As Int
	Dim tpanel3 As Int
	Dim tlbl7 As Int
	Dim tpanelcomboUsa As Int
	Dim tlbl8 As Int
	Dim tpanelZip As Int
	dim tpanelMarco as int 
	
	Private Label8 As Label
	Private PanelMarcoDirRD As Panel
	Private PanelMarcoNombredir As Panel
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
	
'	IME.Initialize("IME")
'	IME.AddHeightChangedEvent
'	IME_HeightChanged(50%y, 0) 'manually call this method to set the layout of EditText1 and btnHideKeyboard
	
'	IME.SetCustomFilter(EditText3, EditText3.INPUT_TYPE_NUMBERS, "0123456789.")
'	IME.SetCustomFilter(EditText4, Bit.Or(EditText4.INPUT_TYPE_TEXT, 0x00080000), _ '0x0080000 is the flag of NO_SUGGESTIONS.
'		"01234567890abcdef")
	
	If Main.logged Then
		cargarDirecciones

		
	Else
		Dim r As Int
			
		r = Msgbox2("Para ver sus direcciones debe de iniciar Sesión","Desea iniciar Sesión?","Si","","Más tarde",Null)
			
		If r = DialogResponse.POSITIVE Then
			Main.mostar = True
			StartActivity(Main)
			
		Else
			StartActivity(Principal)
		End If
	End If
	
End Sub

'Sub IME_HandleAction As Boolean
'	Dim e As EditText
'	e = Sender
'	If e.Text.StartsWith("a") = False Then
'		'ToastMessageShow("Text must start with 'a'.", True)
'		'Consume the event.
'		'The keyboard will not be closed
'		Return True
'	Else
'		Return False 'will close the keyboard
'	End If
'End Sub
'
'Sub IME_HeightChanged(NewHeight As Int, OldHeight As Int)
'	
'	If Principal.isUsa Then
'	
'		PanelComboUSA.Top = NewHeight - PanelComboUSA.Height
''		EditText1.Height = btnHideKeyboard.Top - EditText1.Top
'		
'		Else
'			
'	End If
'	
'End Sub

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
				
				If Principal.IsUsa Then
					BuscarEstados
				Else
					BuscarProvincias
				End If
				
				Return
			End If
			
			'{'f_key':'1','f_data':[{"f_idrecord":1,"f_idusuario":7,"f_fecha":1540927870000,"f_principal":true,"f_direccion":"SABANA LARGA "}]}
			
			
			For i=0 To list.Size -1
				
				map = list.Get(i)
				
				Dim dr,city,default,name="" As String
				
				Dim principalDireccion As Boolean
				principalDireccion = map.Get("f_principal")
				dr = funcion.base64_Decode(map.Get("f_direccion1"))
				city = " ,"&map.Get("f_sector_city")
				name = map.Get("f_nombre_direccion")
				
				If dr.Length > 40 Then
					dr = dr.SubString2(0,40)&"..."
				End If
				
				If principalDireccion Then
				
					If Principal.IsUsa Then
					
						default = "Main address"
					
					Else
						
						default = "Dirección principal"
				
					End If
				
				End If
				
				ListViewDirecciones.AddTwoLines2(name&": "&dr&city, DateTime.Date(map.Get("f_fecha")) &CRLF&default ,map)
			Next
			
			If Principal.IsUsa Then
				BuscarEstados
			Else
				BuscarProvincias
			End If
			
			ProgressDialogHide
			
		Case "JobSalvar"
			If map.Get("f_data") Then
				
				If Principal.IsUsa Then
					Msgbox("Address registred." ,"info")
					reload = True
					btnBackUsa_Click
					
				Else
					Msgbox("Dirección registrada." ,"Información")
					reload = True
					btnBackRd_Click
				End If
				
			Else
						
				If Principal.IsUsa Then
					Msgbox("Error registering your address","Error")
				Else
					Msgbox("Error al registrar su dirección","Error")
				End If
			End If
			
			
		Case "JobEstados"
			list = map.Get("f_data")
			
			If list.Size <= 0 Then
				Msgbox("No hay Estados en la BD","Aviso!!")
				Return
			End If
			
			estados.Initialize
			For i=0 To list.Size-1 
				
				Dim mapa As Map = list.Get(i)
				
				estados.Add( mapa.Get("f_descripcion"))
			Next
			
		Case "JobDeleteDir"
			
			If map.Get("f_data") Then
				
				If Principal.IsUsa Then
					reload = True
					btnBackUsa_Click
					ToastMessageShow("The address has deleted correctly!",False)
					
				Else
					reload = True
					btnBackRd_Click
					ToastMessageShow("La dirección se ha eliminado correctamente!",False)
				End If
				
			Else
					
				If Principal.IsUsa Then
					Msgbox("The address could not be deleted","Error")
				Else
					Msgbox("La dirección no pudo ser eliminada","Error")
				End If
					
			End If
	
	End Select
	
End Sub


Sub Activity_Resume
	
	If Main.logged Then
		cargarDirecciones
		
	End If
	
End Sub

Sub Activity_Pause (UserClosed As Boolean)

End Sub

Sub BuscarEstados
	
	Dim json As String = "'f_usa': true"
	
	Dim JobEstados As HttpJob
	JobEstados.Initialize("JobEstados",Me)
	JobEstados.PostString(Main.url&"ws/Buscar_lista_estados","json="&funcion.crearJson(Main.token,json))
	
End Sub

Sub BuscarProvincias
	
	Dim json As String = "'f_usa': false"
	
	Dim JobProvincia As HttpJob
	JobProvincia.Initialize("JobEstados",Me)
	JobProvincia.PostString(Main.url&"ws/Buscar_lista_estados","json="&funcion.crearJson(Main.token,json))

End Sub


Sub ListViewDirecciones_ItemClick (Position As Int, Value As Object)

	mapaEdit = Value
	
	Dim r As Int 
	
	If Principal.isUsa Then
		r = Msgbox2("Do you want to edit this address?","Question","Yes","","No",Null)
		Else
		r = Msgbox2("Desea editar esta dirección?","Aviso","Si","","No",Null)
	End If
	
	If r = DialogResponse.POSITIVE Then
		
		If Principal.isUsa Then
			
			edition = True
			
			If PanelFondoDireccionesUSA.IsInitialized == False Then
				
				Activity.LoadLayout("frmDireccionesUsa")
				PanelFondoDireccionesUSA.Visible = False
				
			End If
			
			funcion.DisableView(True,PanelDireccion)
			PanelFondoDireccionesUSA.SetVisibleAnimated(250,True)
			
			txtAddress1.Text = funcion.base64_Decode(mapaEdit.Get("f_direccion1"))
			
			If funcion.base64_Decode(mapaEdit.Get("f_direccion2")) <> Null And funcion.base64_Decode(mapaEdit.Get("f_direccion2")) <> "" Then
				txtAddress2.Text = funcion.base64_Decode(mapaEdit.Get("f_direccion2"))
			Else
				txtAddress2.Text = ""
			End If
			
			btnDeleteUsa.Visible = True
			
			btnState.AddAll(estados)
			
			txtCity.Text = mapaEdit.Get("f_sector_city")
			btnState.SelectedIndex = (mapaEdit.Get("f_state_provincia")-1)
			txtZipCode.Text = mapaEdit.Get("f_zipcode")
			chPrincipal.Checked = mapaEdit.Get("f_principal")
			actu = True
			update = mapaEdit.Get("f_idrecord")
			
			Else
				
			edition = True
			If PanelFondoDireccionesRD.IsInitialized == False Then
				
				Activity.LoadLayout("frmDireccionesRD")
				PanelFondoDireccionesRD.Visible = False
				
			End If
			
			funcion.DisableView(True,PanelDireccion)
			PanelFondoDireccionesRD.SetVisibleAnimated(250,True)
			
			txtDireRD.Text = funcion.base64_Decode(mapaEdit.Get("f_direccion1"))
			
			btnDeleteRD.Visible = True
			
			btnProvinciaCombo.AddAll(estados)
			
			txtSector.Text = mapaEdit.Get("f_sector_city")
			btnProvinciaCombo.SelectedIndex = (mapaEdit.Get("f_state_provincia")-1)
			txtZipCodeRD.Text = mapaEdit.Get("f_zipcode")
			chPrincipalRD.Checked = mapaEdit.Get("f_principal")
			actu = True
			update = mapaEdit.Get("f_idrecord")
					
		End If
		
		Else
			Return
	End If
	
End Sub

Sub btnSalvarDireccion_Click
	If txtDireccion.Text.Trim.Length = 0 Then
		Msgbox("Introduzca la dirección","Información")
		txtDireccion.RequestFocus
		Return
	End If
	
	If actualizar Then
		
		Dim json As String
		json = "'f_principal':"&chPrincipal.Checked&",'f_direccion':'"&funcion.base64_Encode(txtDireccion.Text.Trim)&"','f_idrecord':"&txtDireccion.Tag&",'f_credito_fiscal':false,'f_iddireccion':"&mapadir.Get("f_idrecord")
		actualizar = False
		
		Else
			
		Dim json As String
		json = "'f_principal':"&chPrincipal.Checked&",'f_direccion':'"&funcion.base64_Encode(txtDireccion.Text.Trim)&"','f_idrecord':"&txtDireccion.Tag&",'f_credito_fiscal':false"
		
		
	End If
	
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
	Principal.keyotraparte = False
	StartActivity(Principal)
End Sub




Sub btnAceptarNombreDir_Click
	
	PanelFondoNombreDir.SetVisibleAnimated(200,False)
	If Principal.IsUsa Then
		
		ingresarDirUSA
	Else
		
		ingresarDirRD
	End If
	
End Sub

Sub ingresarDirUSA
	
	If txtAddress1.Text == "" Then
		Msgbox("The Addres 1 can't be empty!!","Error")
		Return
	End If
	
	If txtCity.Text == "" Then
		Msgbox("The City can't be empty!!","Error")
		Return
	End If
	
	If txtZipCode.Text == "" Then
		Msgbox("The Zip Code can't be empty!!","Error")
		Return
	End If
	
	If actu Then
		
		Dim json As String
		json = "'f_principal':"&chPrincipal.Checked&",'f_direccion1':'"&funcion.base64_Encode(txtAddress1.Text.Trim)&"','f_direccion2':'"&funcion.base64_Encode(txtAddress2.Text.Trim)& _
		"','f_idrecord':"&update&",'f_iddireccion':"&mapaEdit.Get("f_idrecord")&",'f_usa':"&Principal.IsUsa&",'f_sector_city':'"&txtCity.Text&"','f_zipcode':"&txtZipCode.Text& _
		",'f_state_prov':"&(indexCombo+1)&",'f_nombre_direccion':'"&txtNombreDireccion.Text&"'"
		actu = False
		
	Else
			
		Dim json As String
		json = "'f_principal':"&chPrincipal.Checked&",'f_direccion1':'"&funcion.base64_Encode(txtAddress1.Text.Trim)&"','f_direccion2':'"&funcion.base64_Encode(txtAddress2.Text.Trim)&"','f_idrecord':"&update& _
		",'f_usa':"&Principal.IsUsa&",'f_sector_city':'"&txtCity.Text&"','f_zipcode':"&txtZipCode.Text&",'f_state_prov':"&(indexCombo+1)&",'f_nombre_direccion':'"&txtNombreDireccion.Text&"'"
		
	End If
	
	reload = True
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funcion.crearJson(Main.token,json))
	
	update = 0
End Sub

Sub btnState_ItemClick (Position As Int, Value As Object)
	
	indexCombo = Position
	
End Sub


Sub ingresarDirRD
	
	If txtDireRD.Text == "" Then
		Msgbox("La dirección no puede estar vacia!!","Error")
		Return
	End If
	
	If txtSector.Text == "" Then
		Msgbox("El sector no puede estar vacio!!","Error")
		Return
	End If
	
	If txtZipCodeRD.Text == "" Then
		Msgbox("El Zip Code no puede estar vacio!!","Error")
		Return
	End If
	
	If actu Then
		
		Dim json As String
		json = "'f_principal':"&chPrincipalRD.Checked&",'f_direccion1':'"&funcion.base64_Encode(txtDireRD.Text.Trim)&"','f_direccion2':''"& _
		",'f_idrecord':"&update&",'f_iddireccion':"&mapaEdit.Get("f_idrecord")&",'f_usa':"&Principal.IsUsa&",'f_sector_city':'"&txtSector.Text&"','f_zipcode':"&txtZipCodeRD.Text& _
		",'f_state_prov':"&(indexCombo+1)&",'f_nombre_direccion':'"&txtNombreDireccion.Text&"'"
		actu = False
		
	Else
			
		Dim json As String
		json = "'f_principal':"&chPrincipalRD.Checked&",'f_direccion1':'"&funcion.base64_Encode(txtDireRD.Text.Trim)&"','f_direccion2':'','f_idrecord':"&update& _
		",'f_usa':"&Principal.IsUsa&",'f_sector_city':'"&txtSector.Text&"','f_zipcode':"&txtZipCodeRD.Text&",'f_state_prov':"&(indexCombo+1)&",'f_nombre_direccion':'"&txtNombreDireccion.Text&"'"
		
	End If
	
	reload = True
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funcion.crearJson(Main.token,json))
	
	update = 0
	
End Sub


Sub btnProvinciaCombo_ItemClick (Position As Int, Value As Object)
	
	indexCombo = Position
	
End Sub

Sub btnDeleteRD_Click
	
	Dim res As Int 
	res = Msgbox2("Desea borrar esta dirección","Aviso!","Si","","No",Null)
	
	If res == DialogResponse.POSITIVE Then
		
		Dim json As String
		json = "'f_idrecord':"&mapaEdit.Get("f_idrecord")
		
		Dim JobDeleteDir As HttpJob
		JobDeleteDir.Initialize("JobDeleteDir",Me)
		JobDeleteDir.PostString(Main.url&"ws/borrar_direccion","json="&funcion.crearJson(Main.token,json))
		
		Else
			Return
	End If
	
End Sub

Sub btnBackRd_Click
	
	PanelFondoDireccionesRD.SetVisibleAnimated(250,False)
	funcion.DisableView(False,PanelDireccion)
	PanelDireccion.SetVisibleAnimated(200,True)
	
	If reload Then
		actualizarDirecciones
		reload = False
	End If
		
	Sleep(200)
	
	txtDireRD.Text = ""
	txtSector.Text = ""
	btnProvinciaCombo.SelectedIndex = -1
	txtZipCodeRD.Text = ""
	chPrincipalRD.Checked = False
	
	edition = False
	actu = False
	
End Sub

Sub btnAgregarDirRD_Click
	
	NombreDireccion
	
End Sub

Sub btnDeleteUsa_Click
	
	Dim res As Int
	res = Msgbox2("Do you want to delete this address?","Warning!","Yes","","No",Null)
	
	If res == DialogResponse.POSITIVE Then
		
		Dim json As String
		json = "'f_idrecord':"&mapaEdit.Get("f_idrecord")
		
		Dim JobDeleteDir As HttpJob
		JobDeleteDir.Initialize("JobDeleteDir",Me)
		JobDeleteDir.PostString(Main.url&"ws/borrar_direccion","json="&funcion.crearJson(Main.token,json))
		
		Else
			
			Return
		
	End If
	
End Sub

Sub actualizarDirecciones
	
	If Principal.IsUsa Then
		ProgressDialogShow("We're reloading your addresses")
	Else
		ProgressDialogShow("Actualizando sus direcciónes")
	End If
	
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funcion.crearJson(Main.token,""))
End Sub

Sub btnBackUsa_Click
	
	funcion.DisableView(False,PanelDireccion)
	PanelFondoDireccionesUSA.SetVisibleAnimated(200,False)
	PanelDireccion.SetVisibleAnimated(200,True)
	
	If reload Then
		actualizarDirecciones
		reload = False
	End If
	
	Sleep(200)
	
	txtAddress1.Text = ""
	txtAddress2.Text = ""
	txtCity.Text = ""
	btnState.SelectedIndex = -1
	txtZipCode.Text = ""
	chPrincipal.Checked = False
	
	edition = False
	actu = False
	
End Sub

Sub BtnAgregarDireccionFinal_Click
	
	NombreDireccion
	
End Sub


Sub NombreDireccion
	
	If PanelFondoNombreDir.IsInitialized == False Then
		Activity.LoadLayout("frmNombreDireccion")
		PanelFondoNombreDir.Visible = False
	End If
	
	PanelFondoNombreDir.SetVisibleAnimated(250,True)
	
	If Principal.IsUsa Then
		Label16.Text = "Name of the address"
		txtNombreDireccion.Text = ""
		txtNombreDireccion.Hint = "Name of the address"
	Else
		Label16.Text = "Nombre de la dirección"
		txtNombreDireccion.Text = ""
		txtNombreDireccion.Hint = "Nombre de la dirección"
	End If
	
	
End Sub

Sub AddDireccion_Click
	
	If Principal.IsUsa Then
		
		If PanelFondoDireccionesUSA.IsInitialized == False Then
			Activity.LoadLayout("frmDireccionesUsa")
			PanelFondoDireccionesUSA.Visible = False
		End If
		
		
		PanelFondoDireccionesUSA.SetVisibleAnimated(200,True)
		funcion.DisableView(True,PanelDireccion)
		
		btnState.DropdownBackgroundColor = Colors.White
		btnState.DropdownTextColor = Colors.Black
		
		btnState.AddAll(estados)

		
		If edition Then
			btnDeleteUsa.Visible = True
		Else
			btnDeleteUsa.Visible = False
		End If
		actu = False
		
	Else
		
		If PanelFondoDireccionesRD.IsInitialized == False Then
			Activity.LoadLayout("frmDireccionesRD")
			PanelFondoDireccionesRD.Visible = False
		End If
		
		PanelFondoDireccionesRD.SetVisibleAnimated(200,True)
		funcion.DisableView(True,PanelDireccion)
		
		btnProvinciaCombo.DropdownBackgroundColor = Colors.White
		btnProvinciaCombo.DropdownTextColor = Colors.Black
			
		btnProvinciaCombo.AddAll(estados)
		
		
		If edition Then
			btnDeleteRD.Visible = True
		Else
			btnDeleteRD.Visible = False
		End If
		actu = False
		
	End If
	
End Sub

Sub txtZipCode_EnterPressed
	
	txtCity.RequestFocus
	'BtnAgregarDireccionFinal.RequestFocus
	
End Sub

Sub txtCity_EnterPressed
	Msgbox("Llego","")
End Sub

Sub txtZipCode_FocusChanged (HasFocus As Boolean)
	
	If HasFocus Then
		Label3.Visible = False
		Panel1.Visible = False
		
		Label5.Visible = False
		Panel2.Visible = False
		
		'GUARDANDO LAS ALTURAS 
		
		tlbl6 = Label6.Top
		tpanel3 = Panel3.Top
		
		tlbl7 = Label7.Top
		tpanelcomboUsa = PanelComboUSA.Top
		
		tlbl8 = Label8.Top
		tpanelZip = panelZipCode.Top
		
		'PONIENDO NUEVAS ALTURAS
		
		Label6.Top = 10%y
		Panel3.Top = 15%y
		
		Label7.Top = 23%y
		PanelComboUSA.Top = 29%y
		
		panelZipCode.Top = 40%y
		
		
	Else
		Label3.Visible = True
		Panel1.Visible = True
		
		Label5.Visible = True
		Panel2.Visible = True
		
		Label6.Top = tlbl6
		Panel3.Top = tpanel3
		
		Label7.Top = tlbl7
	    PanelComboUSA.Top = tpanelcomboUsa
		
		Label8.Top = tlbl8
		panelZipCode.Top = tpanelZip
		
	End If
	
	
End Sub

Sub Activity_KeyPress (KeyCode As Int) As Boolean
	If KeyCode = KeyCodes.KEYCODE_BACK Then 
		
		If Principal.isUsa Then
			txtCity.RequestFocus
			Else
				txtSector.RequestFocus
		End If

		Return True                                         
	End If
End Sub

Sub txtZipCodeRD_EnterPressed
	
	txtSector.RequestFocus
	
End Sub

Sub txtZipCodeRD_FocusChanged (HasFocus As Boolean)
	
	If HasFocus Then
		
		tpanelMarco = PanelMarcoDirRD.Top
		
		PanelMarcoDirRD.Top = 0%y
		
		Else
			
			PanelMarcoDirRD.Top = tpanelMarco
		
	End If
	
End Sub



















