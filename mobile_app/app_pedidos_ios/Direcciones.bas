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
	
	'GLOBALES
	Dim mapadir As Map
	Dim actualizar As Boolean = False
	Dim toped As Int  
	Dim topedLbl As Int
	
	Dim estados As List
	Dim actu As Boolean = False
	Dim update As Int = 0  
	Dim indexCombo As Int = 0
	Dim edition As Boolean = False
	Dim reload As Boolean = False
	
	Dim mapaEdit As Map
	Dim topMarco As Int 
	Dim toplblAdres2 As Int 
	Dim topadres As Int
	Dim toplbl6 As Int
	Dim toptxtCity As Int
	Dim toplbl7 As Int
	Dim topbtnstate As Int
	
	Dim TOPlblZip As Int
	Dim TOPtxtZip As Int

	
	
	
	Private hud As HUD
	Private pageDirecciones As Page
	Private Panel2 As Panel
	Private ListaDirecciones As CustomListView
	Private lblDir As Label
	Private lblFecha As Label
	Private lblPrincipal As Label
	Private btnDireccionBack As Button
	Private btnSalvarDireccion As Button
	Private chPrincipal As Switch
	Private Label3 As Label
	Private Label2 As Label
	Private txtDireccion As TextView
	Private PanelEncabezadoDir2 As Panel
	Private Panel2V2 As Panel
	Private AddDireccion As Button
	Private BorrarDireccion As Button
	Private ListaDirecciones2 As CustomListView
	Private btnDireccionBack2 As Button
	Private btnState As B4XComboBox
	Private PanelFondoDireccionesUSA As Panel
	Private btnBackUsa As Button
	Private txtAddress1 As TextView
	Private txtAddress2 As TextView
	Private txtCity As TextField
	Private BtnAgregarDireccionFinal As Button
	Private txtZipCode As TextField
	Private btnDeleteUsa As Button
	Private PanelMarcoDirRD As Panel
	Private PanelFondoDireccionesRD As Panel

	Private btnProvinciaCombo As B4XComboBox
	Private btnBackRd As Button
	Private PanelEncabezadoRD As Panel
	Private txtDireRD As TextView
	Private txtSector As TextField
	Private txtZipCodeRD As TextField
	Private btnAgregarDirRD As Button
	Private chPrincipalRD As Switch
	Private PanelEncabezadoUsa As Panel
	Private btnDeleteRD As Button
	Private Label5 As Label
	Private Label6 As Label
	Private Label7 As Label
	Private PanelComboUSA As Panel
	Private Label8 As Label
	Private panelZipCode As Panel
	Private PanelFondoNombreDir As Panel
	Private Label16 As Label
	Private txtNombreDireccion As TextField
	Private btnAceptarNombreDir As Button
End Sub

Sub Initialize
	pageDirecciones.Initialize("PageDirecciones")
	pageDirecciones.RootPanel.LoadLayout("frmDirecionUSA")
	
	Main.NavControl.ShowPage(pageDirecciones)
	'Main.NavControl.ToolBarVisible = False
	
	crear
	cargarDirecciones
	
	Main.smc.Tag = "direcciones"
End Sub

Sub crear
	
	PanelEncabezadoDir2.SetShadow(Colors.Gray, 0dip,3dip,0.5,False)
	Panel2V2.SetShadow(Colors.Gray,2dip,2dip,0.5,False)
	AddDireccion.SetShadow(Colors.Gray,2dip,2dip,0.5,False)
	
End Sub

Sub cargarDirecciones
	
	If Main.IsUsa Then
		hud.ProgressDialogShow("We're searching your addresses")
		Else
		hud.ProgressDialogShow("Buscando sus direcciones")
	End If
	
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funciones.crearJson(Main.token,""))
End Sub

Sub actualizarDirecciones
	
	If Main.IsUsa Then
		hud.ProgressDialogShow("We're reloading your addresses")
	Else
		hud.ProgressDialogShow("Actualizando sus direcciónes")
	End If
	
	Dim JobDirecciones As HttpJob
	JobDirecciones.Initialize("JobDirecciones",Me)
	JobDirecciones.PostString(Main.url&"ws/get_direcciones_usuario","json="&funciones.crearJson(Main.token,""))
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
		
		
		Case "JobDirecciones"
			list = map.Get("f_data")
			
			ListaDirecciones2.Clear
			
			If list.Size = 0 Then
				Msgbox("No tiene direcciones registradas","Información")
				hud.ProgressDialogHide
				
				If Main.IsUsa Then
					BuscarEstados
				Else
					BuscarProvincias
				End If
				
				Return
			End If

			Dim principalDireccion As  Int 
			Dim mymap As Map
			mymap.Initialize
			
			For i=0 To list.Size -1
				map = list.Get(i)
				
				Dim dr,city,default,name="" As String

				principalDireccion = map.Get("f_principal")
				dr = funciones.base64_Decode(map.Get("f_direccion1"))
				city = " ,"&map.Get("f_sector_city")
				name = map.Get("f_nombre_direccion")
				
				
				If dr.Length > 40 Then
					dr = dr.SubString2(0,40)&"..."
				End If
				
				If principalDireccion == 1 Then
				
				If Main.IsUsa Then
					
						default = "Main address"
					
					Else
						
					default = "Dirección principal"
				
				End If
				
				End If
			
				mymap.Clear
				
				mymap.Put("f_direccion",dr)
				mymap.Put("f_principal",default)
				mymap.Put("f_fecha",map.Get("f_fecha"))
				
				ListaDirecciones2.Add(CreateListItem(name&": "&dr&city,map.Get("f_fecha"),default,ListaDirecciones2.GetBase.Width,80dip),map)
				
			Next
			
			hud.ProgressDialogHide
			
			If Main.IsUsa Then
				BuscarEstados
				Else
				BuscarProvincias
			End If
			
		Case "JobSalvar"
			
			If map.Get("f_data") Then
				
				If Main.IsUsa Then
					Msgbox("Address registred." ,"info")
					btnBackUsa_Click
					Else
					Msgbox("Dirección registrada." ,"Información")
					btnBackRd_Click
				End If
				
					Else
						
						If Main.IsUsa Then
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
				
				If Main.IsUsa Then
					btnBackUsa_Click
					hud.ToastMessageShow("The address has deleted correctly!",False)
					
					Else
					btnBackRd_Click
					hud.ToastMessageShow("La dirección se ha eliminado correctamente!",False)
				End If
				
				Else
					
					If Main.IsUsa Then
					Msgbox("The address could not be deleted","Error")
						Else
					Msgbox("La dirección no pudo ser eliminada","Error")
					End If
					
			End If
	
	End Select
		
End Sub


Sub CreateListItem(Dir As String, fecha As Long,principal As String, Width As Int, Height As Int) As Panel
	Dim p As Panel
	p.Initialize("")
	p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) 'set the size before the layout is loaded
	p.LoadLayout("frmItemsDir")
	lblDir.Text = Dir
	lblFecha.Text = DateTime.Date(fecha)
	lblPrincipal.Text = principal
	Return p
End Sub

Sub BuscarEstados
	
	Dim json As String = "'f_usa': true"
	
	Dim JobEstados As HttpJob
	JobEstados.Initialize("JobEstados",Me)
	JobEstados.PostString(Main.url&"ws/Buscar_lista_estados","json="&funciones.crearJson(Main.token,json))
	
End Sub

Sub BuscarProvincias
	
	Dim json As String = "'f_usa': false"
	
	Dim JobProvincia As HttpJob
	JobProvincia.Initialize("JobEstados",Me)
	JobProvincia.PostString(Main.url&"ws/Buscar_lista_estados","json="&funciones.crearJson(Main.token,json))

End Sub

Sub btnDireccionBack2_Click
	
	Main.smc.Tag = "inicio"
	Main.NavControl.RemoveCurrentPage
	
End Sub

Sub ListaDirecciones_ItemClick (Index As Int, Value As Object)
	
	Dim map As Map = Value

	txtDireccion.Text = funciones.base64_Decode(map.Get("f_direccion"))
	txtDireccion.Tag = map.Get("f_idrecord")
	mapadir = map
	actualizar = True
	
End Sub

Sub btnSalvarDireccion_Click
	
	If txtDireccion.Text.Trim.Length = 0 Then
		Msgbox("Introduzca la dirección","Información")
		txtDireccion.RequestFocus
		Return
	End If
	
'	Msgbox(chPrincipal.Value,"")
'	Return
	If actualizar Then
		
		Dim json As String
		json = "'f_principal':"&chPrincipal.Value&",'f_direccion':'"&funciones.base64_Encode(txtDireccion.Text.Trim)&"','f_idrecord':"&txtDireccion.Tag&",'f_credito_fiscal':false,'f_iddireccion':"&mapadir.Get("f_idrecord")
		actualizar = False
		
	Else
			
		Dim json As String
		json = "'f_principal':"&chPrincipal.Value&",'f_direccion':'"&funciones.base64_Encode(txtDireccion.Text.Trim)&"','f_idrecord':"&txtDireccion.Tag&",'f_credito_fiscal':false"
		
		
	End If
	
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funciones.crearJson(Main.token,json))
	
End Sub

Sub btnNuevaDireccion_Click
	txtDireccion.Text =""
	txtDireccion.Tag = 0
	chPrincipal.Value = False
	cargarDirecciones
End Sub

Sub txtDireccion_BeginEdit
	
	'CON ESTO VOY A PODER MOVER LA POSICION O ESO CREO XD
	Panel2.Visible = False
	topedLbl = Label3.Top
	toped  = txtDireccion.Top
	
	Label3.Top = Label2.Top + 45dip
	txtDireccion.Top =  Label3.Top +  28dip
	
End Sub
	
Sub txtDireccion_EndEdit
	
	Panel2.Visible = True
	Label3.Top = topedLbl
	txtDireccion.Top = toped
	
	pageDirecciones.ResignFocus
	
End Sub
		
Sub txtDireccion_TextChanged (OldText As String, NewText As String)
	
	If NewText.Contains(Chr(10)) Then 
		txtDireccion_EndEdit
	End If
	
End Sub
		
Sub AddDireccion_Click
	
	If Main.IsUsa Then
		
		txtAddress1.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		txtAddress2.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		txtCity.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		txtZipCode.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		BtnAgregarDireccionFinal.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		btnDeleteUsa.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		PanelEncabezadoUsa.SetShadow(Colors.Gray,0dip,3dip,0.5,False)
		
		btnState.SetItems(estados)
		PanelFondoDireccionesUSA.SetAlphaAnimated(0,0)
		PanelFondoDireccionesUSA.Left = 0%x
		PanelFondoDireccionesUSA.SetAlphaAnimated(500,1)
		
		If edition Then
			btnDeleteUsa.Visible = True
			Else
			btnDeleteUsa.Visible = False
		End If
		actu = False
		
		Else
			
		btnProvinciaCombo.SetItems(estados)  
		
		PanelFondoDireccionesRD.SetAlphaAnimated(0,0)
		PanelFondoDireccionesRD.Top = 0%y
		PanelFondoDireccionesRD.SetAlphaAnimated(500,1) 
		
		PanelEncabezadoRD.SetShadow(Colors.Gray,0dip,3dip,0.5,False)
		txtDireRD.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		txtSector.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		txtZipCodeRD.SetShadow(Colors.Gray, 2dip,2dip,0.5,False)
		
		If edition Then
			btnDeleteRD.Visible = True
		Else
			btnDeleteRD.Visible = False
		End If
		actu = False
		
	End If
	
End Sub

Sub BorrarDireccion_Click
	
End Sub
		
#Region USA

Sub btnState_SelectedIndexChanged (Index As Int)
	
	indexCombo = Index
	
End Sub

Sub btnBackUsa_Click
	
	If reload Then
		actualizarDirecciones
		reload = False
	End If
	
	PanelFondoDireccionesUSA.SetAlphaAnimated(500,0)
	
	Sleep(200)
	
	txtAddress1.Text = ""
	txtAddress2.Text = ""
	txtCity.Text = ""
	btnState.SelectedIndex = -1
	txtZipCode.Text = ""
	chPrincipal.Value = False
	
	edition = False
	actu = False
	
	pageDirecciones.ResignFocus
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
		json = "'f_principal':"&chPrincipal.Value&",'f_direccion1':'"&funciones.base64_Encode(txtAddress1.Text.Trim)&"','f_direccion2':'"&funciones.base64_Encode(txtAddress2.Text.Trim)& _
		"','f_idrecord':"&update&",'f_iddireccion':"&mapaEdit.Get("f_idrecord")&",'f_usa':"&Main.IsUsa&",'f_sector_city':'"&txtCity.Text&"','f_zipcode':"&txtZipCode.Text& _
		",'f_state_prov':"&(indexCombo+1)&",'f_nombre_direccion':'"&txtNombreDireccion.Text&"'"
		actu = False
		
	Else
			
		Dim json As String
		json = "'f_principal':"&chPrincipal.Value&",'f_direccion1':'"&funciones.base64_Encode(txtAddress1.Text.Trim)&"','f_direccion2':'"&funciones.base64_Encode(txtAddress2.Text.Trim)&"','f_idrecord':"&update& _
		",'f_usa':"&Main.IsUsa&",'f_sector_city':'"&txtCity.Text&"','f_zipcode':"&txtZipCode.Text&",'f_state_prov':"&(indexCombo+1)&",'f_nombre_direccion':'"&txtNombreDireccion.Text&"'"
		
	End If
	
	reload = True
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funciones.crearJson(Main.token,json))
	
	update = 0
End Sub

Sub BtnAgregarDireccionFinal_Click
	
	NombreDireccion
	
End Sub

Sub btnDeleteUsa_Click
	
		Msgbox2("MsgDelete","Do you want to delete this address?","Warning!",Array("Yes","No"))

End Sub

Sub ListaDirecciones2_ItemClick (Index As Int, Value As Object)
	
	mapaEdit = Value
	
	If Main.IsUsa Then
		Msgbox2("MsgEdit","Do you want to edit this address?","Question",Array("Yes","No"))
		Else
		Msgbox2("MsgEdit","Desea editar esta dirección?","Aviso",Array("Si","No"))
	End If
	
End Sub

Sub MsgEdit_Click(ButtonText As String)

	If ButtonText = "Si" Or ButtonText = "Yes" Then
		
		If Main.IsUsa Then
			
			edition = True
			AddDireccion_Click
		
			txtAddress1.Text = funciones.base64_Decode(mapaEdit.Get("f_direccion1"))
			
			If funciones.base64_Decode(mapaEdit.Get("f_direccion2")) <> Null And funciones.base64_Decode(mapaEdit.Get("f_direccion2")) <> "" Then
				txtAddress2.Text = funciones.base64_Decode(mapaEdit.Get("f_direccion2"))
				Else
					txtAddress2.Text = ""
			End If
			
			txtCity.Text = mapaEdit.Get("f_sector_city")
			btnState.SelectedIndex = (mapaEdit.Get("f_state_provincia")-1)
			txtZipCode.Text = mapaEdit.Get("f_zipcode")
			chPrincipal.Value = mapaEdit.Get("f_principal")
			actu = True
			update = mapaEdit.Get("f_idrecord")
			
		Else
				
			edition = True
			AddDireccion_Click 
		
			txtDireRD.Text = funciones.base64_Decode(mapaEdit.Get("f_direccion1"))
			
			txtSector.Text = mapaEdit.Get("f_sector_city")
			btnProvinciaCombo.SelectedIndex = (mapaEdit.Get("f_state_provincia")-1)
			txtZipCodeRD.Text = mapaEdit.Get("f_zipcode")
			chPrincipalRD.Value = mapaEdit.Get("f_principal")
			actu = True
			update = mapaEdit.Get("f_idrecord")
		End If
		
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

Sub MsgDelete_Click(ButtonText As String)

	If ButtonText = "Si" Or ButtonText = "Yes" Then
		
		Dim json As String
		json = "'f_idrecord':"&mapaEdit.Get("f_idrecord")
		
		Dim JobDeleteDir As HttpJob
		JobDeleteDir.Initialize("JobDeleteDir",Me)
		JobDeleteDir.PostString(Main.url&"ws/borrar_direccion","json="&funciones.crearJson(Main.token,json))
		
	Else If ButtonText = "No" Then
		Return
	End If

End Sub

Sub txtZipCode_BeginEdit
	
	Label3.Visible = False
	txtAddress1.Visible = False
	
	toplblAdres2 = Label5.Top
	'Label5.Top = 50dip
	Label5.Top = Label3.Top * 0.8
	
	topadres = txtAddress2.Top  
	'txtAddress2.Top = 80dip
	txtAddress2.Top = Label3.Top *1.2
	
	toplbl6 = Label6.Top
	toptxtCity = txtCity.Top
	
	'Label6.Top = 155dip
	Label6.Top = Label3.Top * 2.3
	'txtCity.Top = 190dip
	txtCity.Top = Label3.Top * 2.8
	
	toplbl7 = Label7.Top
	topbtnstate = PanelComboUSA.Top
	
	'Label7.Top = 240dip
	Label7.Top = Label3.Top * 3.5
	PanelComboUSA.Top = Label3.Top * 3.9
	
	TOPtxtZip = panelZipCode.Top
	
	panelZipCode.Top = Label3.Top * 4.8
	
	
	
End Sub

Sub txtZipCode_EndEdit
	
	Label3.Visible = True
	txtAddress1.Visible = True
	
	Label5.Top = toplblAdres2 
	txtAddress2.Top = topadres 
	Label6.Top = toplbl6 
	txtCity.Top = toptxtCity 
	Label7.Top = toplbl7 
	PanelComboUSA.Top = topbtnstate 
	panelZipCode.Top = TOPtxtZip 
	
End Sub

#End Region
		
#Region RD

Sub btnBackRd_Click
	
	If reload Then
		actualizarDirecciones
		reload = False
	End If
	
	PanelFondoDireccionesRD.SetAlphaAnimated(500,0)
	
	Sleep(200)
	
	txtDireRD.Text = ""
	txtSector.Text = ""
	btnProvinciaCombo.SelectedIndex = -1
	txtZipCodeRD.Text = ""
	chPrincipalRD.Value = False
	
	edition = False
	actu = False
	
	pageDirecciones.ResignFocus
	
End Sub

Sub btnProvinciaCombo_SelectedIndexChanged (Index As Int)
	indexCombo = Index 
End Sub

Sub btnAgregarDirRD_Click
	
	NombreDireccion
	
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
		json = "'f_principal':"&chPrincipalRD.Value&",'f_direccion1':'"&funciones.base64_Encode(txtDireRD.Text.Trim)&"','f_direccion2':''"& _
		",'f_idrecord':"&update&",'f_iddireccion':"&mapaEdit.Get("f_idrecord")&",'f_usa':"&Main.IsUsa&",'f_sector_city':'"&txtSector.Text&"','f_zipcode':"&txtZipCodeRD.Text& _
		",'f_state_prov':"&(indexCombo+1)
		actu = False
		
	Else
			
		Dim json As String
		json = "'f_principal':"&chPrincipalRD.Value&",'f_direccion1':'"&funciones.base64_Encode(txtDireRD.Text.Trim)&"','f_direccion2':'','f_idrecord':"&update& _
		",'f_usa':"&Main.IsUsa&",'f_sector_city':'"&txtSector.Text&"','f_zipcode':"&txtZipCodeRD.Text&",'f_state_prov':"&(indexCombo+1)
		
	End If
	
	reload = True
	Dim JobSalvar As HttpJob
	JobSalvar.Initialize("JobSalvar",Me)
	JobSalvar.PostString(Main.url&"ws/set_salvar_direcciones_usuario","json="&funciones.crearJson(Main.token,json))
	
	update = 0
	
End Sub

Sub btnDeleteRD_Click
	
	Msgbox2("MsgDelete","Desea borrar esta dirección","Aviso!",Array("Si","No"))
	
End Sub

Sub txtZipCodeRD_BeginEdit
	
	topMarco = PanelMarcoDirRD.Top
	PanelMarcoDirRD.Top = PanelFondoDireccionesRD.Top
	
End Sub

Sub txtZipCodeRD_EndEdit
	PanelMarcoDirRD.Top = topMarco
End Sub

#End Region	
		

Sub btnAceptarNombreDir_Click
	
	
	PanelFondoNombreDir.SetAlphaAnimated(0,0)
	If Main.IsUsa Then
		ingresarDirUSA
		Else
			ingresarDirRD
	End If
	
End Sub

Sub NombreDireccion
	
	PanelFondoNombreDir.SetAlphaAnimated(0,0)
	PanelFondoNombreDir.Top = 0%y
	PanelFondoNombreDir.Left = 0%x
	
	If Main.IsUsa Then
		Label16.Text = "Name of the address"
		txtNombreDireccion.Text = ""
		txtNombreDireccion.HintText = "Name of the address"
		Else
		Label16.Text = "Nombre de la dirección"
		txtNombreDireccion.Text = ""
		txtNombreDireccion.HintText = "Nombre de la dirección"
	End If
	
	PanelFondoNombreDir.SetAlphaAnimated(500,1)
	
	
	
End Sub
		
		
		
		
		
		
		
		
		
		






























