B4A=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=7.01
@EndOfDesignText@
'Code module
'Subs in this code module will be accessible from all modules.
Sub Process_Globals
	'These global variables will be declared once when the application starts.
	'These variables can be accessed from all modules.
	
End Sub

Sub SetDivider(lv As ListView, color As Int, Height As Int)
   Dim r As Reflector
   r.Target = lv
   Dim CD As ColorDrawable
   CD.Initialize(color, 0)
   r.RunMethod4("setDivider", Array As Object(CD), Array As String("android.graphics.drawable.Drawable"))
	r.RunMethod2("setDividerHeight", Height, "java.lang.int")
	
End Sub

Sub recalcular(precio As Double , descuento As Double, cantidad As Double, tax As Double, impuestoIncluido As Boolean , exentoImpuesto As Boolean  ) As Map

	If exentoImpuesto Then
		tax = 0
	End If

	Dim precio_para_mostrar As Double = precio
	If (impuestoIncluido) Then 
		precio_para_mostrar = precio / ((tax / 100) + 1) ' DATOS PARA GUARDAR EN EL SERVER
	End If

	'Dim tax_para_mostrar As Double = get_tax(precio_para_mostrar, tax, cantidad) ' DATOS PARA GUARDAR EN EL SERVER
	descuento = get_descuento(precio_para_mostrar, descuento)   'BUSCO EL descuento
	Dim precioDescuento As Double = precio_para_mostrar - descuento   '// RESTO descuento A precio
	
	tax = get_tax(precioDescuento, tax, cantidad)  ' BUSCO EL tax
	Dim total As Double = get_importe(cantidad, precioDescuento, tax) '// BUSCO RL TOTAL (IMPORTE)
	
	Dim map As Map
	map.Initialize
	map.Put("f_precio_para_mostrar",precio_para_mostrar) 'valores[0] = precio_para_mostrar;
	map.Put("f_tax",tax) 'valores[1] = tax;
	map.Put("f_descuento",descuento) ' valores[2] = descuento;
	map.Put("f_total",total) 'valores[3] = total;
	'map.Put("f_tax_para_mostrar",tax_para_mostrar) 'valores[4] = tax_para_mostrar;
	
	Return map
End Sub

Sub getDiferenciaCantidad(cantidadActual As Double, cantidadNueva As Double) As Double
	
	If cantidadNueva > cantidadActual And cantidadActual <0 Then
		cantidadActual = cantidadActual*-1
	Else
		If cantidadActual > 0 Then
			cantidadActual = cantidadActual*-1
		End If
	End If
	
	Return cantidadActual
	
End Sub

Sub getSlideMenu(sm As SlideMenu, option As Int) As SlideMenu
	
'	Dim map As Map
'	sm.AddItem("Home",LoadBitmap(File.DirAssets,"home.png"),0)
'	For i=0 To Main.listaPermisos.Size -1
'		map = Main.listaPermisos.Get(i)
'		If map.Get("f_opcion") <> option Then
'			sm.AddItem(map.Get("f_nombre"),LoadBitmap(File.DirAssets,map.Get("f_imagen")),map.Get("f_opcion"))
'		End If
'	Next
'	sm.AddItem("Salir",LoadBitmap(File.DirAssets,"logout.png"),-1)
'	
'	Return sm
End Sub

Sub SlideMenu_Click(Item As Object, Act As Activity)
	
	If Item <> -1 Then
		Act.Finish
	End If
	Select Item
		
		Case -1
			Dim r As Int
			r = Msgbox2("Seguro que desea salir de la aplicación?","","Si","","No",Null)
			If r = DialogResponse.POSITIVE Then
				Act.Finish
				StartActivity(Main)
			End If
	End Select
	
End Sub


Sub ArrayImageToJson(listImagen As List) As String
	Dim json As String = "["
	For i=0 To listImagen.Size -1
		json = json & ",{'f_imagen':'"&getByteImagen2(listImagen.Get(i))&"'}"
	Next
	json = json.Replace("[,{","[{")
	json = json & "]"
	Return json
End Sub

Sub crear_preview(ScrollViewFotos As HorizontalScrollView,listImagen As List )
	ScrollViewFotos.Panel.RemoveAllViews
	Dim imagen() As Byte
	Dim left As Int = 1%x
	For i=0 To listImagen.Size -1
		imagen = listImagen.Get(i)
		Dim img As ImageView
		img.Initialize("View")
		img.Tag = i
		img.Background = getImagen2(imagen)
		ScrollViewFotos.Panel.AddView(img,left,0%y,23%x,15%y)
		left =left+25%x
	Next
	ScrollViewFotos.Panel.Width = left
End Sub


Sub getDecimal(n As Double) As String
	
	If IsNumber(n) = False Then
		Return n
	End If
	
	Dim numero, punto As String
	numero=Round2(n,0)
	
	If numero>n Then
		numero=numero-1
	End If
	
	If (n-numero) > 0 Then
		punto = n
		If punto.SubString(punto.IndexOf(".")+1).Length<=1 Then
			punto= punto&"0"			
		End If
		Return punto
	Else
		Return numero&".00"
	End If	
End Sub



Sub DisableView(tipo As Boolean, pan As Panel)
	
	For Each n As View In pan
		n.Enabled= Not(tipo)
		
		Select GetType(n)
			
			Case "anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView"
				Dim listV As ScrollView = n
				DisableView(tipo,listV.Panel)
				
			Case "anywheresoftware.b4a.BALayout"
				DisableView(tipo,n)
				
		End Select
		
	Next
	
End Sub

Sub getDay(day As Int) As String
	
	Select day
		Case 0
			Return "Sunday"		
		Case 1
			Return "Monday"		
		Case 2
			Return "Tuesday"		
		Case 3
			Return "Wednesday"
		Case 4
			Return "Thursday"
		Case 5
			Return "Friday"
		Case 6
			Return "Saturday"
	End Select	
End Sub

Sub crearJson2(token As String,data As String) As String
	Dim json As String
	Dim b64 As Base64
	json="{'f_key':'"&token&"','f_data':"&data&"}"
	Log(json)
	json = b64.EncodeStoS(json,"UTF-8")
	Return json
End Sub


Sub crearJson(token As String,data As String) As String
'	Dim json As String
'	Dim b64 As Base64
'	json="{'f_key':'"&token&"','f_data':{"&data&"}}"
'	Log(json)
'	json = b64.EncodeStoS(json,"UTF-8")
'	Return json
	Return crearJson2(token, "{"&data&"}")

End Sub


Sub base64_Encode(text As String) As String
	Dim base64 As Base64
	Return base64.EncodeStoS(text,"UTF-8")
End Sub

Sub base64_Decode(text As String) As String
	If text = Null Or text.Length = 0 Then
		Return ""
	End If
	
	Dim base64 As Base64
	Return base64.DecodeStoS(text,"UTF-8")
End Sub

Sub verificarJob(job As String) As Boolean
	
	job = base64_Decode(job)
	Dim map As Map
	Log(job)
	Dim Json As JSONParser
	Json.Initialize(job)
	map=Json.NextObject
	Dim confirm As String
	confirm=map.Get("f_key")
	
	If confirm="-1" Then
		Msgbox("Usuario o contraseña incorrectos.","Información")
		Return False
	else if confirm="-2" Then
		Msgbox("Este usuario esta desactivado","")
		Return False
	else if confirm="-3" Then
		Msgbox("Este usuario ya existe","Información")
		Return False
	else if confirm="-4" Then
		'Msgbox(map.Get("f_data"),"Exelente")
		Msgbox("**The print is not finish yet","Information")
		Log(job)
		Return False
	End If	
	
	Return True
	
End Sub

Sub GetDevicePhysicalSize As Float
   Dim lv As LayoutValues
   lv = GetDeviceLayoutValues
   Return Sqrt(Power(lv.Height / lv.Scale / 160, 2) + Power(lv.Width / lv.Scale / 160, 2))
End Sub

Sub getImagen(imagenB64 As String) As BitmapDrawable
	Dim su As StringUtils
	Dim imagen() As Byte
	imagen = su.DecodeBase64(imagenB64)
	Dim inp As InputStream
	inp.InitializeFromBytesArray(imagen, 0, imagen.Length)
	Dim bmp As Bitmap
	bmp.Initialize2(inp)
	Dim draw As BitmapDrawable
	draw.Initialize(bmp)
	Return draw
End Sub

Sub getImagen2(imagen() As Byte) As BitmapDrawable
	
	Dim inp As InputStream
	inp.InitializeFromBytesArray(imagen, 0, imagen.Length)
	Dim bmp As Bitmap
	bmp.Initialize2(inp)
	Dim draw As BitmapDrawable
	draw.Initialize(bmp)
	Return draw
End Sub

Sub getByteImagen(bmap As Bitmap) As String
	Dim out As OutputStream
	Dim data() As Byte
	out.InitializeToBytesArray(1)
	bmap.WriteToStream(out,100,"PNG")
	data = out.ToBytesArray
	out.Close
	out.Flush
	Dim su As StringUtils
	Return su.EncodeBase64(data)
End Sub

Sub getByteImagen2(data() As Byte) As String
	Dim su As StringUtils
	Return su.EncodeBase64(data)	
End Sub


Sub AddLinea(parametro As String,cantidad As Int) As String
	Dim linea As String
	If cantidad =0 Then
		'cantidad=32
		cantidad=48
	End If
	
	For i=1 To cantidad
	linea=linea & parametro	
	Next

	Return linea
End Sub

Sub A_la_Derecha(caracter As String, parametro As String,limite As Int) As String
	Dim a As String
	If limite =0 Then
		'limite=32
		limite=48
	End If
	For i=1 To (limite - parametro.Length)
		a=a&caracter
	Next
	parametro=a&parametro
	Return parametro
End Sub

Sub V (parametro As String,limite As Int) As String
	If limite =0 Then
		'limite=32
		limite=47
	End If
	
	If parametro.Length>limite Then
		parametro=parametro.SubString2(0,limite-2)&".."
		Return parametro
		
	Else if parametro.Length<limite Then
		Dim espacio As String : espacio=" "
		For i=1 To (limite-parametro.Length)
			parametro=parametro&espacio
		Next
		Return parametro
	End If

End Sub

Sub titulo(parametro As String,limite As Int) As String
	Dim espacio As String : espacio=" "
	Dim totals As String : totals=""
	Dim cal As Double
	If limite =0 Then
		limite=48
	End If
	
	If parametro.Length<limite Then
		cal=limite-parametro.Length
		cal= cal/2
		
		For i=1 To Round(cal)
			totals=espacio& totals
		Next
		parametro=totals&parametro
		Return parametro
	Else
		Return parametro
	End If
	
End Sub

Sub remplace(text As String ) As String
	
	text=text.Replace("'","´´")
	Return text
End Sub

Sub  get_tax( precio As Double, tax As Double , cantidad As Double ) As Double
        tax = (precio * (tax / 100)) * cantidad
        Return tax
  End Sub
  
Sub  get_descuento( precio As Double,  descuento As Double) As Double
		Dim precio2 As Double
        precio2 = precio * (descuento / 100)
        Return precio2
End Sub


Sub  get_importe( cantidad As Double,  precio As Double, tax As Double) As Double
	Dim dato As Double
	dato = ((precio * cantidad) + tax)
	Return  dato
End Sub



Sub GetAllContacts As String
	Dim cr As ContentResolver
	Private PeopleProjection() As String = Array As String("times_contacted","last_time_contacted", _
      "display_name", "has_phone_number", "starred", "_id", "photo_id")
	  
	Dim json As String = "["
	
	Dim u As Uri
	u.Parse("content://com.android.contacts/contacts")
	Dim Crsr As Cursor = cr.Query(u, PeopleProjection, "", Null, "")
	For i = 0 To Crsr.RowCount - 1
		Crsr.Position = i
		
		json = json & ",{'f_nombre':'"& base64_Encode(Crsr.GetString("display_name"))&"','f_id':'"&Crsr.GetString("_id")& _
		"','f_phone_list':"&getPhonesByID(Crsr.GetString("_id"))&"}"
		
		'Log(Crsr.GetString("_id"))
	Next
	Crsr.Close
	
	json = json.Replace("[,{","[{")
	json = json & "]"
	
	json = json.Replace("'",Chr(34))
	
	Log(json)
	Return json
End Sub


Sub getPhonesByID(id As String) As String
	Dim cr As ContentResolver
	Dim json As String = "["
	Dim phonesUri As Uri
	phonesUri.Parse("content://com.android.contacts/data/phones")
	Dim phones As Cursor = cr.Query(phonesUri,  Array As String("data1", "data2"), "contact_id = ?", Array As String(id), "")
	For i = 0 To phones.RowCount - 1
		phones.Position = i
		json = json & ",{'f_phone_number':'"&phones.GetString("data1")&"','f_type':'"&phones.GetString("data2")&"'}"
		'Log("Phone: " & phones.GetString("data1") & ", type = " & phones.GetString("data2"))
	Next
	phones.Close
	
	json =  json.Replace("[,{","[{")
	json = json & "]"
	
	Return json
	
	
End Sub

Sub createPanelProducto(map As Map) As Panel
	
	'ELEVATION
	Dim dr As GradientDrawable
	dr.Initialize("TR_BL", Array As Int(Colors.Red, Colors.Red))
	
	
	Dim PanelFondoPro,PanelImagen As Panel
	PanelFondoPro.Initialize("PanelFondoPro")
	PanelFondoPro.Width = 47%x
	PanelFondoPro.Height = 4%y
	
	PanelFondoPro.Background = dr
	
	Dim colpanel As ColorDrawable
	colpanel.Initialize(Colors.RGB(255, 255, 255),3dip)
	
	PanelFondoPro.Background = colpanel
	
	PanelFondoPro.Elevation = 5dip
	
	map.Put("f_destacado",True)
	
	PanelImagen.Initialize("")
	PanelImagen.Width = PanelFondoPro.Width
	PanelImagen.Height = 20%y
	
	Dim drima As GradientDrawable
	drima.Initialize("TL_BR" ,Array As Int(Colors.White, Colors.White))
	
	Dim imagenPro As ImageView
	imagenPro.Initialize("")
	
	Dim bm As BitmapDrawable
	
	If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
		bm = getImagen(map.Get("f_foto"))				
	Else
		bm.Initialize(LoadBitmap(File.DirAssets,"no-image.jpg"))
	End If

	bm.Gravity = Gravity.FILL
	
	imagenPro.Background = bm
	PanelImagen.Background = drima
	
	PanelImagen.Elevation = 1dip
	
	PanelFondoPro.AddView(PanelImagen,0,0,PanelFondoPro.Width,17%y)
	
	PanelImagen.AddView(imagenPro,0,0,PanelImagen.Width,PanelImagen.Height)
	
	Dim lblTituloPro As Label
	lblTituloPro.Initialize("")
	lblTituloPro.Text = map.Get("f_descripcion")
	lblTituloPro.TextColor = Colors.RGB(97, 97, 97)
	lblTituloPro.TextSize = 14
	
	
	lblTituloPro.Width = PanelFondoPro.Width - 2%x
	lblTituloPro.Height = 7%y
	
	PanelFondoPro.AddView(lblTituloPro,2%x,17%y,PanelFondoPro.Width - 2%x,7%y)
	
	Dim lblPrecioPro As Label
	lblPrecioPro.Initialize("")
	lblPrecioPro.Text = NumberFormat(map.Get("f_precio"),0,2) 
	lblPrecioPro.Text = "$ "&lblPrecioPro.Text
	lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)
	lblPrecioPro.TextSize = 16
	
	PanelFondoPro.AddView(lblPrecioPro,2%x,23%y,28%x,5%y)
	
	Dim btnAddPro As Button
	btnAddPro.Initialize("btnAddPro")
	btnAddPro.Tag = map
	btnAddPro.Text = "Agregar"
	btnAddPro.TextColor = Colors.White

	Dim cd As ColorDrawable
	cd.Initialize(Colors.RGB(244, 67, 54),3dip)
	btnAddPro.Background = cd
	
	SetPadding(btnAddPro,0,0,0,0)
	
	PanelFondoPro.AddView(btnAddPro,2%x,28%y,43%x,6%y)
	
	Dim imgFav As ImageView
	imgFav.Initialize("imgFav")
	Dim bmImgFav As BitmapDrawable
	
	Dim mapaimg As Map
	mapaimg.Initialize
	
	If Main.logged Then
		
		For i=0 To Principal.listafavoritos.Size -1
			Dim mapafav As Map
			mapafav = Principal.listafavoritos.Get(i)
		
			If mapafav.Get("f_idrecord") == map.Get("f_idrecord") Then
				bmImgFav.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
				map.Put("f_red",True)
				map.Put("f_idproducto", map.Get("f_idrecord"))
				
				'PARA IMAGEN 
				mapaimg.Put("f_red",True)
				mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
				i = Principal.listafavoritos.Size -1
			End If
		Next
		
	End If
	
	
	If bmImgFav.IsInitialized == False Then
		bmImgFav.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
		map.Put("f_red",False)
		map.Put("f_idproducto", map.Get("f_idrecord"))
		
		'PARA LA IMAGEN
		mapaimg.Put("f_red",False)
		mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
	End If
	
	PanelFondoPro.Tag = map
	
	bmImgFav.Gravity = Gravity.FILL
	
	imgFav.Background = bmImgFav
	
	imgFav.Tag = mapaimg
	
	PanelFondoPro.AddView(imgFav,lblPrecioPro.Left + 32.5%x,lblPrecioPro.Top,8%x,3%y)
	
	Return PanelFondoPro
	
End Sub

Sub SetPadding(va As View, Left As Int, Top As Int, Right As Int, Bottom As Int)
	Dim jo As JavaObject = va
	jo.RunMethod("setPadding", Array As Object(Left, Top, Right, Bottom))
End Sub


Sub createPanelProductoScroll(map As Map, imagen As BitmapDrawable) As Panel
	'ELEVATION
	Dim dr As GradientDrawable
	dr.Initialize("TR_BL", Array As Int(Colors.Red, Colors.Red))
	
	
	Dim PanelFondoPro,PanelImagen As Panel
	PanelFondoPro.Initialize("PanelFondoPro")
	PanelFondoPro.Width = 47%x
	PanelFondoPro.Height = 45%y

	PanelFondoPro.Background = dr

	Dim colpanel As ColorDrawable
	colpanel.Initialize(Colors.RGB(255, 255, 255),3dip)
	
	
	PanelFondoPro.Background = colpanel
	
	PanelFondoPro.Elevation = 5dip
	
	PanelImagen.Initialize("")
	PanelImagen.Width = PanelFondoPro.Width
	PanelImagen.Height = 20%y
	
	Dim drima As GradientDrawable
	drima.Initialize("TL_BR" ,Array As Int(Colors.White, Colors.White))
	
	Dim imagenPro As ImageView
	imagenPro.Initialize("")
	

	imagen.Gravity = Gravity.FILL
	
	imagenPro.Background = imagen
	PanelImagen.Background = drima
	
	map.Put("f_foto",imagen)
	
	map.Put("f_destacado",False)
	
	
	PanelImagen.Elevation = 1dip
	
	PanelFondoPro.AddView(PanelImagen,0,0,PanelFondoPro.Width,17%y)
	
	PanelImagen.AddView(imagenPro,0,0,PanelImagen.Width,PanelImagen.Height)
	
	Dim lblTituloPro As Label
	lblTituloPro.Initialize("")
	lblTituloPro.Text = map.Get("f_descripcion")
	lblTituloPro.TextColor = Colors.RGB(97, 97, 97)
	lblTituloPro.TextSize = 14
	
	
	lblTituloPro.Width = PanelFondoPro.Width - 2%x
	lblTituloPro.Height = 7%y
	
	PanelFondoPro.AddView(lblTituloPro,2%x,17%y,PanelFondoPro.Width - 2%x,7%y)
	
	Dim lblPrecioPro As Label
	lblPrecioPro.Initialize("")
	lblPrecioPro.Text = NumberFormat(map.Get("f_precio"),0,2)
	lblPrecioPro.Text = "$ "&lblPrecioPro.Text
	lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)
	lblPrecioPro.TextSize = 16
	
	PanelFondoPro.AddView(lblPrecioPro,2%x,23%y,28%x,5%y)
	
	Dim btnAddPro As Button
	btnAddPro.Initialize("btnAddPro")
	btnAddPro.Text = "Agregar"
	btnAddPro.TextColor = Colors.White
	btnAddPro.Tag = map

	Dim cd As ColorDrawable
	cd.Initialize(Colors.RGB(244, 67, 54),3dip)
	btnAddPro.Background = cd
	
	SetPadding(btnAddPro,0,0,0,0)
	
	PanelFondoPro.AddView(btnAddPro,2%x,28%y,43%x,6%y)
	
	Dim imgFav As ImageView
	imgFav.Initialize("imgFav")
	Dim bmImgFav As BitmapDrawable
	
	Dim mapaimg As Map
	mapaimg.Initialize
	
	If Main.logged Then
		
		For i=0 To Principal.listafavoritos.Size -1
			Dim mapafav As Map
			mapafav = Principal.listafavoritos.Get(i)
		
			If mapafav.Get("f_idrecord") == map.Get("f_idrecord") Then
				bmImgFav.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
				i = Principal.listafavoritos.Size -1
				map.Put("f_red",True)
				map.Put("f_idproducto", map.Get("f_idrecord"))
				
				'PARA LA IMAGEN
				mapaimg.Put("f_red",True)
				mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
	
			End If
		Next
		
	End If
	
	If bmImgFav.IsInitialized == False Then
		bmImgFav.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
		map.Put("f_red",False)
		map.Put("f_idproducto", map.Get("f_idrecord"))
		
		'PARA LA IMAGEN
		mapaimg.Put("f_red",False)
		mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
	End If
	
	PanelFondoPro.Tag = map
	bmImgFav.Gravity = Gravity.FILL
	
	imgFav.Background = bmImgFav
	imgFav.Tag = mapaimg
	
	PanelFondoPro.AddView(imgFav,lblPrecioPro.Left + 32.5%x,lblPrecioPro.Top,8%x,3%y)
	
	Return PanelFondoPro
	
End Sub



Sub GenerarSlideMenu(sm As SlideMenu)
	
	Dim lista As List
	lista.Initialize
	Dim map As Map
	
	map.Initialize
	
	If Main.logged Then
		
		map.Put("Nombre",Main.usersData.nombre)
		map.Put("ruta","user32.png")
		lista.Add(map)
		
		Else
		map.Put("Nombre","Público")
		map.Put("ruta","user32.png")
		lista.Add(map)
	End If	
	
	Dim map2 As Map
	map2.Initialize
	
	map2.Put("Nombre","Inicio")
	map2.Put("ruta","house32.png")
	lista.Add(map2)
	
	Dim map3 As Map
	map3.Initialize
	map3.Put("Nombre","Categoria")
	map3.Put("ruta","categoria.jpg")
	lista.Add(map3)
	
	Dim map4 As Map
	map4.Initialize
	map4.Put("Nombre","Lista Favoritos")
	map4.Put("ruta","favorite.png")
	lista.Add(map4)
	
	Dim map5 As Map
	map5.Initialize
	map5.Put("Nombre","Direcciones")
	map5.Put("ruta","location-pin.png")
	lista.Add(map5)
	
	Dim map6 As Map
	map6.Initialize
	map6.Put("Nombre","Mis Ordenes")
	map6.Put("ruta","bill.png")
	lista.Add(map6)
	
	
	Dim map8 As Map
	map8.Initialize
	map8.Put("Nombre","Acerca de nostros") '7
	map8.Put("ruta","question.png")
	lista.Add(map8)
	
	If Main.logged Then
		Dim map9 As Map
		map9.Initialize
		map9.Put("Nombre","Cerrar Sesión") '8
		map9.Put("ruta","logout.png")
		lista.Add(map9)
		
	End If
	
	For i=0 To lista.Size -1 Step 1
		
		Dim mapaRes As Map
		mapaRes.Initialize
		
		mapaRes = lista.Get(i)
		
		sm.AddItem(mapaRes.Get("Nombre"),LoadBitmap(File.DirAssets,mapaRes.Get("ruta")),i+1)

	Next
	
End Sub

Sub ChangeScreen(caso As Int,sm As SlideMenu, activiad As Activity)
	
	Select caso
		
		Case 1
			If Main.logged Then
				
				sm.Hide
				Sleep(200)
				StartActivity(Perfil)
				
			Else
				Dim res As Int
			
				res = Msgbox2("Para ver su perfil primero debe iniciar Sesión","Desea iniciar sesión","Si","","Mas tarde",Null)

				If res ==  DialogResponse.POSITIVE  Then
					Main.mostar = True
					StartActivity(Main)
			
				Else
					Return
				End If
			End If
			
			
		Case 2
			sm.Hide
			Sleep(200)
			StartActivity(Principal)
			
		Case 3
			sm.Hide
			Sleep(200)
			StartActivity(Categoria)
			
		Case 4
			sm.Hide
			Sleep(200)
			Principal.SendClickFav = True
			StartActivity(Principal)
			
		Case 5
			sm.Hide
			Sleep(200)
			StartActivity(Direcciones)
			
		Case 6
			sm.Hide
			Sleep(200)
			StartActivity(ReporteOrdenes)
			
		Case 7
			sm.Hide
			Sleep(200)
			Principal.SendClickAbout = True
			StartActivity(Principal)
		
		Case 8
			sm.Hide
			Sleep(200)
			Main.mostar = True
			Main.logged = False
			Principal.loadagain = True
			StartActivity(Main)
'			
'		Case 9
'			sm.Hide
'			Sleep(200)
'			activiad.Finish
'			StartActivity(login)
	End Select
'	
'	activiad.Finish
	
End Sub















