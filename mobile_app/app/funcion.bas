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
















