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

'state: 
'0 - normal, 
'1 - highlighted, 
'2 - disabled
Sub SetBackgroundImage(b As Button, bmp As Bitmap, state As Int)
	Dim no As NativeObject = b
	no.RunMethod("setBackgroundImage:forState:", Array(bmp, state))
End Sub


Sub SetTitleColor(nav As NavigationController, color As Int)
	Dim attributes As NativeObject
	attributes = attributes.Initialize("B4IAttributedString").RunMethod("createAttributes::", _
     Array(Font.CreateNew(18), attributes.ColorToUIColor(color)))
	Dim no As NativeObject = nav
	no.GetField("navigationBar").RunMethod("setTitleTextAttributes:", Array(attributes))
End Sub

Sub DisableView(tipo As Boolean, pan As Panel)
	
	For Each n As View In pan
'		n.Enabled= Not(tipo)
		Select GetType(n)
			
			Case "anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView"
				Dim listV As ScrollView = n
				DisableView(tipo,listV.Panel)
				
			Case "anywheresoftware.b4a.BALayout"
				DisableView(tipo,n)
				
		End Select
	Next
	
End Sub

Sub crearJson2(token As String,data As String) As String
	Dim json As String
	Dim su As StringUtils
	
	json="{'f_key':'"&token&"','f_data':"&data&"}"
	Log(json)
	json = su.EncodeBase64(json.GetBytes("UTF8") )
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
	
	Dim su As StringUtils
	Return  su.EncodeBase64(text.GetBytes("UTF8"))
	
End Sub

Sub base64_Decode(text As String) As String
	If text = Null Or text.Length = 0 Then
		Return ""
	End If
	
	Dim su As StringUtils
	Dim b() As Byte = su.DecodeBase64(text)
	
	Dim res As String = BytesToString(b , 0, b.Length, "UTF8")
'	res = res.Replace(":NONE}",":'NONE'}").Replace("'","""")
	Return res
	
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
		Msgbox("Este usuario esta desactivado","Información")
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

Sub getImagen(imagenB64 As String) As Bitmap
	Dim su As StringUtils
	Dim imagen() As Byte
	imagen = su.DecodeBase64(imagenB64)
	Dim inp As InputStream
	inp.InitializeFromBytesArray(imagen, 0, imagen.Length)
	Dim bmp As Bitmap
	bmp.Initialize2(inp)
	
	Return bmp
End Sub

Sub getImagen2(imagen() As Byte) As Bitmap
	
	Dim inp As InputStream
	inp.InitializeFromBytesArray(imagen, 0, imagen.Length)
	Dim bmp As Bitmap
	bmp.Initialize2(inp)
	
	Return bmp
End Sub

Sub getByteImagen(bmap As Bitmap) As String
	Dim out As OutputStream
	Dim data() As Byte
	out.InitializeToBytesArray(1)
	bmap.WriteToStream(out,100,"PNG")
	data = out.ToBytesArray
	out.Close
	'out.Flush
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


Sub KeyboardStateChanged (Height As Float, Page1 As Page, Top As Double)
	
	If Top = -1 Then
		Top = 20
	End If
	
	If Height = 0 Then
		Page1.RootPanel.SetLayoutAnimated(200,1,Page1.RootPanel.Left,Top,Page1.RootPanel.Width,Page1.RootPanel.Height) 'Top = 20
	Else
		For Each V As View In Page1.RootPanel.GetAllViewsRecursive
			If IsFirstResponder(V) Then
				Page1.RootPanel.Top = Min(0,Page1.RootPanel.Top - 3%y - (Height - (Page1.RootPanel.Height - (V.Top + V.Height))))
			End If
		Next
	End If
End Sub

Sub IsFirstResponder(V As NativeObject) As Boolean
	If V.RunMethod("isFirstResponder",Null) = 1 Then Return True
	Return False
End Sub