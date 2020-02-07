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

End Sub


Sub SetPaddingText(tf As TextField, Padding As Float)
	Dim pnl As Panel
	pnl.Initialize("")
	pnl.SetLayoutAnimated(0, 1, 0, 0, Padding, tf.Height)
	Dim no As NativeObject = tf
	no.SetField("leftView", pnl)
	no.SetField("leftViewMode", 3)
End Sub

Sub crearJson2(token As String,data As String) As String
	Dim json As String
	Dim su As StringUtils
	
	json="{'f_key':'"&token&"','f_data':"&data&"}"
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

Sub base64_Decode(text As String) As String
	If text = Null Or text.Length = 0 Or text = "" Then
		Return ""
	End If
	
	Dim su As StringUtils
	Dim b() As Byte = su.DecodeBase64(text)
	
	Dim res As String = BytesToString(b , 0, b.Length, "UTF8")
'	res = res.Replace(":NONE}",":'NONE'}").Replace("'","""")
	Return res
	
End Sub

Sub base64_Encode(text As String) As String
	
	Dim su As StringUtils
	Return  su.EncodeBase64(text.GetBytes("UTF8"))
	
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

Sub verificarJob(job As String) As Boolean
	
	job = base64_Decode(job)
	
	Dim map As Map
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
		Return False
	End If
	
	Return True
	
End Sub


Sub createPanelProducto(map As Map) As Panel
	
	Dim PanelFondoPro,PanelImagen As Panel
	PanelFondoPro.Initialize("PanelFondoPro")
	PanelFondoPro.Width = 152dip
	PanelFondoPro.Height = 185dip
	
	PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelFondoPro.Color = Colors.RGB(255, 255, 255)
	
	map.Put("f_destacado",True)
	
	PanelImagen.Initialize("")
	
	Dim imagenPro As ImageView
	imagenPro.Initialize("")
	
	Dim bm As Bitmap
	
	If map.Get("f_foto") <> Null And map.Get("f_foto") <> "" Then
		bm = getImagen(map.Get("f_foto"))
		'bm = map.Get("f_foto")
	Else
		bm.Initialize(File.DirAssets,"no-image.jpg")
	End If
	
	imagenPro.Bitmap = bm
	
	PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelImagen.AddView(imagenPro,0dip,0dip,152dip,85dip)
	
	PanelFondoPro.AddView(PanelImagen,0dip,0dip,PanelFondoPro.Width,85dip)
	
	
	Dim lblTituloPro As Label
	lblTituloPro.Initialize("")
	lblTituloPro.Text = map.Get("f_descripcion")
	lblTituloPro.TextColor = Colors.RGB(97, 97, 97)
	lblTituloPro.Font = Font.CreateNew(15)
	
	PanelFondoPro.AddView(lblTituloPro,4dip,90dip,145dip,14dip) '104
	
	Dim lblPrecioPro As Label
	lblPrecioPro.Initialize("")
	lblPrecioPro.Text = NumberFormat(map.Get("f_precio"),0,2)
	lblPrecioPro.Text = "$ "&lblPrecioPro.Text
	lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)
	lblPrecioPro.Font = Font.CreateNew(15)
	
	PanelFondoPro.AddView(lblPrecioPro,4dip,122dip,50dip,12dip)'127
	
	Dim btnAddPro As Button
	btnAddPro.InitializeCustom("btnAddProducto",Colors.RGB(244, 67, 54),Colors.RGB(0,0,0))
	btnAddPro.Color = Colors.RGB(255, 255, 255)
	btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,True)
	btnAddPro.Tag = map
	btnAddPro.Text = "Agregar"
	
	btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelFondoPro.AddView(btnAddPro,10dip,145dip,138dip,25dip)
	
'	Dim imgFav As ImageView
'	imgFav.Initialize("imgFav")
'	Dim bmImgFav As Bitmap
'	
'	Dim mapaimg As Map
'	mapaimg.Initialize
	
'	If Main.logged Then
'		
'		For i=0 To Principal.listafavoritos.Size -1
'			Dim mapafav As Map
'			mapafav = Principal.listafavoritos.Get(i)
'		
'			If mapafav.Get("f_idrecord") == map.Get("f_idrecord") Then
'				bmImgFav.Initialize(File.DirAssets,"no-image.jpg") 'CORAZON ROJO
'				map.Put("f_red",True)
'				map.Put("f_idproducto", map.Get("f_idrecord"))
'				
'				'PARA IMAGEN
'				mapaimg.Put("f_red",True)
'				mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
'				i = Principal.listafavoritos.Size -1
'			End If
'		Next
'		
'	End If
	
'	
'	If bmImgFav.IsInitialized == False Then
'		bmImgFav.Initialize(File.DirAssets,"no-image.jpg") ' CORAZON NEGRO
'		map.Put("f_red",False)
'		map.Put("f_idproducto", map.Get("f_idrecord"))
'		
'		'PARA LA IMAGEN
'		mapaimg.Put("f_red",False)
'		mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
'	End If
	
	PanelFondoPro.Tag = map
	
'	bmImgFav.Gravity = Gravity.FILL
'	
'	imgFav.Background = bmImgFav
'	
'	imgFav.Tag = mapaimg
'	
'	PanelFondoPro.AddView(imgFav,lblPrecioPro.Left + 32.5%x,lblPrecioPro.Top,8%x,3%y)

	
	Return PanelFondoPro
	
End Sub
 

Sub ResizeImage (Image As Bitmap, Width As Int, Height As Int) As Bitmap
	Dim PhotoCanvas As Canvas
	Dim PhotoPanel As Panel
	Dim PhotoView As ImageView
	Dim NewImage As Bitmap
   
	PhotoPanel.Initialize("")
	PhotoPanel.Width = Width / 2
	PhotoPanel.Height = Height / 2
   
	PhotoView.Initialize("")
	PhotoView.Bitmap = Image
   
	PhotoPanel.AddView(PhotoView,0,0,Width / 2,Height / 2)

	PhotoCanvas.Initialize(PhotoPanel)
	NewImage = PhotoCanvas.CreateBitmap
   
	Return NewImage
End Sub


Sub createPanelProductoScroll(map As Map, imagen As Bitmap) As Panel

	
	Dim PanelFondoPro,PanelImagen As Panel
	PanelFondoPro.Initialize("PanelFondoPro")
	PanelFondoPro.Width = 152dip
	PanelFondoPro.Height = 185dip	
	
	PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelFondoPro.Color = Colors.RGB(255, 255, 255)
	
	PanelImagen.Initialize("")
	
	PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	Dim imagenPro As ImageView
	imagenPro.Initialize("")
	
	imagenPro.Bitmap = imagen

	map.Put("f_foto",imagen)
	
	map.Put("f_destacado",False)
	
	
	PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,True)
	
	PanelImagen.AddView(imagenPro,0dip,0dip,152dip,85dip)
	
	PanelFondoPro.AddView(PanelImagen,0dip,0dip,PanelFondoPro.Width,85dip)
	
	Dim lblTituloPro As Label
	lblTituloPro.Initialize("")
	lblTituloPro.Text = map.Get("f_descripcion")
	lblTituloPro.TextColor = Colors.RGB(97, 97, 97)
	lblTituloPro.Font = Font.CreateNew(15)
	
	
	PanelFondoPro.AddView(lblTituloPro,4dip,90dip,145dip,14dip)
	
	Dim lblPrecioPro As Label
	lblPrecioPro.Initialize("")
	lblPrecioPro.Text = NumberFormat(map.Get("f_precio"),0,2)
	lblPrecioPro.Text = "$ "&lblPrecioPro.Text
	lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)
	lblPrecioPro.Font = Font.CreateNew(15)
	
	PanelFondoPro.AddView(lblPrecioPro,4dip,122dip,50dip,12dip)
	
	Dim btnAddPro As Button
	btnAddPro.InitializeCustom("btnAddProducto",Colors.RGB(244, 67, 54),Colors.RGB(0,0,0))
	btnAddPro.Color = Colors.RGB(255, 255, 255)
	btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,True)
	btnAddPro.Tag = map
	btnAddPro.Text = "Agregar"
	
	btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,True)
	
	PanelFondoPro.AddView(btnAddPro,10dip,145dip,138dip,25dip)
	
	
'	Dim imgFav As ImageView
'	imgFav.Initialize("imgFav")
'	Dim bmImgFav As Bitmap
'	
'	Dim mapaimg As Map
'	mapaimg.Initialize
'	
'	If Main.logged Then
'		
'		For i=0 To Principal.listafavoritos.Size -1
'			Dim mapafav As Map
'			mapafav = Principal.listafavoritos.Get(i)
'		
'			If mapafav.Get("f_idrecord") == map.Get("f_idrecord") Then
'				bmImgFav.Initialize(LoadBitmap(File.DirAssets,"heartRed.png"))
'				i = Principal.listafavoritos.Size -1
'				map.Put("f_red",True)
'				map.Put("f_idproducto", map.Get("f_idrecord"))
'				
'				'PARA LA IMAGEN
'				mapaimg.Put("f_red",True)
'				mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
'	
'			End If
'		Next
'		
'	End If
'	
'	If bmImgFav.IsInitialized == False Then
'		bmImgFav.Initialize(LoadBitmap(File.DirAssets,"heartWhiteandBlack.png"))
'		map.Put("f_red",False)
'		map.Put("f_idproducto", map.Get("f_idrecord"))
'		
'		'PARA LA IMAGEN
'		mapaimg.Put("f_red",False)
'		mapaimg.Put("f_idproducto", map.Get("f_idrecord"))
'	End If
'	
'	PanelFondoPro.Tag = map
'	bmImgFav.Gravity = Gravity.FILL
'	
'	imgFav.Background = bmImgFav
'	imgFav.Tag = mapaimg
'	
'	PanelFondoPro.AddView(imgFav,lblPrecioPro.Left + 32.5%x,lblPrecioPro.Top,8%x,3%y)
'	
	Return PanelFondoPro
	
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

  
Sub  get_descuento( precio As Double,  descuento As Double) As Double
	Dim precio2 As Double
	precio2 = precio * (descuento / 100)
	Return precio2
End Sub

Sub  get_tax( precio As Double, tax As Double , cantidad As Double ) As Double
	tax = (precio * (tax / 100)) * cantidad
	Return tax
End Sub


Sub  get_importe( cantidad As Double,  precio As Double, tax As Double) As Double
	Dim dato As Double
	dato = ((precio * cantidad) + tax)
	Return  dato
End Sub

Sub getDecimal(n As Double) As String
	
	If IsNumber(n) = False Then
		Return n
	End If
	
	Dim numero, punto As String
	'numero=Round2(n,0)
	
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



























