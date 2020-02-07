package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _application_active() throws Exception{
try {
		Debug.PushSubsStack("Application_Active (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,110);
if (RapidSub.canDelegate("application_active")) { return b4i_main.remoteMe.runUserSub(false, "main","application_active");}
 BA.debugLineNum = 110;BA.debugLine="Private Sub Application_Active";
Debug.ShouldStop(8192);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,106);
if (RapidSub.canDelegate("application_background")) { return b4i_main.remoteMe.runUserSub(false, "main","application_background");}
 BA.debugLineNum = 106;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="Log(\"Application_Background\")";
Debug.ShouldStop(1024);
b4i_main.__c.runVoidMethod ("LogImpl:::","4327681",RemoteObject.createImmutable("Application_Background"),0);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,57);
if (RapidSub.canDelegate("application_start")) { return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);}
RemoteObject _rs = RemoteObject.declareNull("B4IResultSet");
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 57;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 59;BA.debugLine="If File.Exists(File.DirDocuments, \"db.db\") = Fals";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",b4i_main.__c.runMethod(false,"File").runMethod(true,"Exists::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(RemoteObject.createImmutable("db.db"))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 60;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDocum";
Debug.ShouldStop(134217728);
b4i_main.__c.runMethod(false,"File").runVoidMethod ("Copy::::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 62;BA.debugLine="SQL.Initialize(File.DirDocuments, \"db.db\", False)";
Debug.ShouldStop(536870912);
b4i_main._sql.runVoidMethod ("Initialize:::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(BA.ObjectToString("db.db")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 64;BA.debugLine="Dim rs As ResultSet = SQL.ExecQuery(\"SELECT * FRO";
Debug.ShouldStop(-2147483648);
_rs = b4i_main._sql.runMethod(false,"ExecQuery:",(Object)(RemoteObject.createImmutable("SELECT * FROM t_preferencia")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 65;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1);
while (_rs.runMethod(true,"NextRow").getBoolean()) {
 }
;
 BA.debugLineNum = 69;BA.debugLine="NavControl = Nav";
Debug.ShouldStop(16);
b4i_main._navcontrol = _nav;
 BA.debugLineNum = 70;BA.debugLine="Page1.Initialize(\"Page1\")";
Debug.ShouldStop(32);
b4i_main._page1.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("Page1")));
 BA.debugLineNum = 71;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(64);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 72;BA.debugLine="Page1.RootPanel.LoadLayout(\"frmLogin\")";
Debug.ShouldStop(128);
b4i_main._page1.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmLogin")),b4i_main.ba);
 BA.debugLineNum = 74;BA.debugLine="NavControl.NavigationBarVisible = False";
Debug.ShouldStop(512);
b4i_main._navcontrol.runMethod(true,"setNavigationBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 75;BA.debugLine="NavControl.ShowPage2(Page1,True)";
Debug.ShouldStop(1024);
b4i_main._navcontrol.runVoidMethod ("ShowPage2::",(Object)(((b4i_main._page1).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 76;BA.debugLine="funcion.SetTitleColor(Nav,Colors.White)";
Debug.ShouldStop(2048);
b4i_main._funcion.runVoidMethod ("_settitlecolor::" /*RemoteObject*/ ,(Object)(_nav),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White")));
 BA.debugLineNum = 78;BA.debugLine="crear";
Debug.ShouldStop(8192);
_crear();
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfiguracion_click() throws Exception{
try {
		Debug.PushSubsStack("btnConfiguracion_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,265);
if (RapidSub.canDelegate("btnconfiguracion_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnconfiguracion_click");}
 BA.debugLineNum = 265;BA.debugLine="Sub btnConfiguracion_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 267;BA.debugLine="If txtURL.Alpha = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",b4i_main._txturl.runMethod(true,"Alpha"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 268;BA.debugLine="txtURL.SetAlphaAnimated(300,1)";
Debug.ShouldStop(2048);
b4i_main._txturl.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 1)));
 }else {
 BA.debugLineNum = 270;BA.debugLine="txtURL.SetAlphaAnimated(300,0)";
Debug.ShouldStop(8192);
b4i_main._txturl.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 271;BA.debugLine="updateURL";
Debug.ShouldStop(16384);
_updateurl();
 };
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnlogin_click() throws Exception{
try {
		Debug.PushSubsStack("btnLogin_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,122);
if (RapidSub.canDelegate("btnlogin_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnlogin_click");}
RemoteObject _url2 = RemoteObject.createImmutable("");
RemoteObject _dato = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _imei = RemoteObject.createImmutable("");
RemoteObject _operadora = RemoteObject.createImmutable("");
RemoteObject _device = RemoteObject.declareNull("B4INativeObject");
RemoteObject _joblogin = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 122;BA.debugLine="Sub btnLogin_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 126;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",b4i_main._txtcontrasena.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",b4i_main._txtusuario.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 127;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
Debug.ShouldStop(1073741824);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Faltan datos por ingresar")),(Object)(RemoteObject.createImmutable("Aviso")));
 }else {
 BA.debugLineNum = 130;BA.debugLine="hud.ProgressDialogShow(\"Conectando..\")";
Debug.ShouldStop(2);
b4i_main._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Conectando..")));
 BA.debugLineNum = 131;BA.debugLine="txtUsuario.UserInteractionEnabled = True";
Debug.ShouldStop(4);
b4i_main._txtusuario.runMethod(true,"setUserInteractionEnabled:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 132;BA.debugLine="Dim url2 As String";
Debug.ShouldStop(8);
_url2 = RemoteObject.createImmutable("");Debug.locals.put("url2", _url2);
 BA.debugLineNum = 133;BA.debugLine="Dim dato As String";
Debug.ShouldStop(16);
_dato = RemoteObject.createImmutable("");Debug.locals.put("dato", _dato);
 BA.debugLineNum = 134;BA.debugLine="Dim data As String";
Debug.ShouldStop(32);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 135;BA.debugLine="Dim  imei As String";
Debug.ShouldStop(64);
_imei = RemoteObject.createImmutable("");Debug.locals.put("imei", _imei);
 BA.debugLineNum = 136;BA.debugLine="Dim operadora As String";
Debug.ShouldStop(128);
_operadora = RemoteObject.createImmutable("");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 138;BA.debugLine="Dim device As NativeObject";
Debug.ShouldStop(512);
_device = RemoteObject.createNew ("B4INativeObject");Debug.locals.put("device", _device);
 BA.debugLineNum = 139;BA.debugLine="device = device.Initialize(\"UIDevice\").RunMethod";
Debug.ShouldStop(1024);
_device = _device.runMethod(false,"Initialize:",(Object)(RemoteObject.createImmutable("UIDevice"))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("currentDevice")),(Object)((b4i_main.__c.runMethod(false,"Null"))));Debug.locals.put("device", _device);
 BA.debugLineNum = 140;BA.debugLine="operadora= App.OSVersion";
Debug.ShouldStop(2048);
_operadora = b4i_main._app.runMethod(true,"OSVersion");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 141;BA.debugLine="imei = device.GetField(\"identifierForVendor\").As";
Debug.ShouldStop(4096);
_imei = _device.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("identifierForVendor"))).runMethod(true,"AsString");Debug.locals.put("imei", _imei);
 BA.debugLineNum = 143;BA.debugLine="data = \"'f_modelo':'','f_banda':'', 'f_operadora";
Debug.ShouldStop(16384);
_data = RemoteObject.concat(RemoteObject.createImmutable("'f_modelo':'','f_banda':'', 'f_operadora': '"),_operadora,RemoteObject.createImmutable("','f_tamano':0,"),RemoteObject.createImmutable("'f_imei':'"),_imei,RemoteObject.createImmutable("','f_usuario':'"),b4i_main._txtusuario.runMethod(true,"Text").runMethod(true,"Trim"),RemoteObject.createImmutable("','f_contrasena':'"),b4i_main._txtcontrasena.runMethod(true,"Text").runMethod(true,"Trim"),RemoteObject.createImmutable("'"));Debug.locals.put("data", _data);
 BA.debugLineNum = 146;BA.debugLine="dato=funcion.crearJson(\"none\",data)";
Debug.ShouldStop(131072);
_dato = b4i_main._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(BA.ObjectToString("none")),(Object)(_data));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 147;BA.debugLine="url2 = url & \"login/login/\"";
Debug.ShouldStop(262144);
_url2 = RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("login/login/"));Debug.locals.put("url2", _url2);
 BA.debugLineNum = 149;BA.debugLine="Dim JobLogin As HttpJob";
Debug.ShouldStop(1048576);
_joblogin = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobLogin", _joblogin);
 BA.debugLineNum = 150;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
Debug.ShouldStop(2097152);
_joblogin.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobLogin")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 151;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
Debug.ShouldStop(4194304);
_joblogin.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(_url2),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),_dato)));
 };
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnregistroclienteregistrarme_click() throws Exception{
try {
		Debug.PushSubsStack("btnRegistroClienteRegistrarme_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,206);
if (RapidSub.canDelegate("btnregistroclienteregistrarme_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnregistroclienteregistrarme_click");}
RemoteObject _json = RemoteObject.declareNull("B4IJSONGenerator");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _jobnewuser = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 206;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 208;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",b4i_main._txtnombre.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 209;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
Debug.ShouldStop(65536);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su nombre")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 210;BA.debugLine="txtNombre.RequestFocus";
Debug.ShouldStop(131072);
b4i_main._txtnombre.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 211;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 212;BA.debugLine="Else if txtTelefono.Text.Trim.Length = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",b4i_main._txttelefono.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 213;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
Debug.ShouldStop(1048576);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su teléfono")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 214;BA.debugLine="txtTelefono.RequestFocus";
Debug.ShouldStop(2097152);
b4i_main._txttelefono.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 215;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 216;BA.debugLine="else if txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",b4i_main._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 217;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
Debug.ShouldStop(16777216);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su dirección")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 218;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(33554432);
b4i_main._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 219;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 220;BA.debugLine="else if txtUsuarioRegistro.Text.Trim.Length = 0 T";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",b4i_main._txtusuarioregistro.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 221;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su correo electrónico")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 222;BA.debugLine="txtUsuarioRegistro.RequestFocus";
Debug.ShouldStop(536870912);
b4i_main._txtusuarioregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 223;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 224;BA.debugLine="else if txtContrasenaRegistro.Text.Trim.Length =";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",b4i_main._txtcontrasenaregistro.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 225;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
Debug.ShouldStop(1);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su contraseña")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 226;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(2);
b4i_main._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 227;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 228;BA.debugLine="else if txtContrasena2.Text.Trim.Length = 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",b4i_main._txtcontrasena2.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 229;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
Debug.ShouldStop(16);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su contraseña nuevamente")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 230;BA.debugLine="txtContrasena2.RequestFocus";
Debug.ShouldStop(32);
b4i_main._txtcontrasena2.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 231;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 232;BA.debugLine="Else If txtContrasenaRegistro.Text <> txtContrase";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",b4i_main._txtcontrasenaregistro.runMethod(true,"Text"),b4i_main._txtcontrasena2.runMethod(true,"Text"))) { 
 BA.debugLineNum = 233;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Las contraseñas no coinciden.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 234;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(512);
b4i_main._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 235;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 }}}}}}}
;
 BA.debugLineNum = 238;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(8192);
_json = RemoteObject.createNew ("B4IJSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 239;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16384);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 240;BA.debugLine="map.Initialize";
Debug.ShouldStop(32768);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 241;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
Debug.ShouldStop(65536);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_nombre"))),(Object)((b4i_main._txtnombre.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 242;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
Debug.ShouldStop(131072);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_telefono"))),(Object)((b4i_main._txttelefono.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 243;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
Debug.ShouldStop(262144);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_direccion"))),(Object)((b4i_main._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 244;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
Debug.ShouldStop(524288);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_email"))),(Object)((b4i_main._txtusuarioregistro.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 245;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
Debug.ShouldStop(1048576);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_password"))),(Object)((b4i_main._txtcontrasenaregistro.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 246;BA.debugLine="map.Put(\"f_latitud\",\"\")";
Debug.ShouldStop(2097152);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_latitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 247;BA.debugLine="map.Put(\"f_longitud\",\"\")";
Debug.ShouldStop(4194304);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_longitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 248;BA.debugLine="map.Put(\"f_idrecord\",0)";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idrecord"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 249;BA.debugLine="json.Initialize(map)";
Debug.ShouldStop(16777216);
_json.runVoidMethod ("Initialize:",(Object)(_map));
 BA.debugLineNum = 251;BA.debugLine="Dim JobNewUser As HttpJob";
Debug.ShouldStop(67108864);
_jobnewuser = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobNewUser", _jobnewuser);
 BA.debugLineNum = 252;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
Debug.ShouldStop(134217728);
_jobnewuser.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobNewUser")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 253;BA.debugLine="JobNewUser.Tag = map";
Debug.ShouldStop(268435456);
_jobnewuser.setField ("_tag" /*RemoteObject*/ ,(_map));
 BA.debugLineNum = 254;BA.debugLine="JobNewUser.PostString(url&\"ws/set_salvar_usuario\"";
Debug.ShouldStop(536870912);
_jobnewuser.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("ws/set_salvar_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funcion.runMethod(true,"_crearjson2::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(_json.runMethod(true,"ToString"))))));
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crear() throws Exception{
try {
		Debug.PushSubsStack("crear (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,81);
if (RapidSub.canDelegate("crear")) { return b4i_main.remoteMe.runUserSub(false, "main","crear");}
RemoteObject _no = RemoteObject.declareNull("B4INativeObject");
 BA.debugLineNum = 81;BA.debugLine="Sub crear";
Debug.ShouldStop(65536);
 BA.debugLineNum = 82;BA.debugLine="txtURL.Alpha = 0";
Debug.ShouldStop(131072);
b4i_main._txturl.runMethod(true,"setAlpha:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 83;BA.debugLine="txtURL.Text = url";
Debug.ShouldStop(262144);
b4i_main._txturl.runMethod(true,"setText:",b4i_main._url);
 BA.debugLineNum = 84;BA.debugLine="Label3.Font = Font.CreateNew2(\"DancingScript-Regu";
Debug.ShouldStop(524288);
b4i_main._label3.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew2::",(Object)(BA.ObjectToString("DancingScript-Regular")),(Object)(BA.numberCast(float.class, 50))));
 BA.debugLineNum = 86;BA.debugLine="Dim no As NativeObject = NavControl";
Debug.ShouldStop(2097152);
_no = RemoteObject.createNew ("B4INativeObject");
_no.setObject((b4i_main._navcontrol).getObject());Debug.locals.put("no", _no);
 BA.debugLineNum = 88;BA.debugLine="no.GetField(\"navigationBar\").RunMethod(\"setBarTin";
Debug.ShouldStop(8388608);
_no.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("navigationBar"))).runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("setBarTintColor:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(_no.runMethod(false,"ColorToUIColor:",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54))))))})));
 BA.debugLineNum = 89;BA.debugLine="no.GetField(\"navigationBar\").RunMethod(\"setTintCo";
Debug.ShouldStop(16777216);
_no.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("navigationBar"))).runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("setTintColor:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(_no.runMethod(false,"ColorToUIColor:",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"))))})));
 BA.debugLineNum = 93;BA.debugLine="Principal.Initialize";
Debug.ShouldStop(268435456);
b4i_main._principal.runVoidMethod ("_initialize" /*void*/ );
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,156);
if (RapidSub.canDelegate("jobdone")) { return b4i_main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 156;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 158;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(536870912);
b4i_main._hud.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 159;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 160;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
Debug.ShouldStop(-2147483648);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_main._jobmsj),(Object)(b4i_main._jobmsjtitle));
 BA.debugLineNum = 161;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 164;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",b4i_main._funcion.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 165;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 168;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 169;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(256);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 170;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(512);
_json.runVoidMethod ("Initialize:",(Object)(b4i_main._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 171;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(1024);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 173;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobLogin"),BA.ObjectToString("JobNewUser"))) {
case 0: {
 BA.debugLineNum = 176;BA.debugLine="isLoggedIn = True";
Debug.ShouldStop(32768);
b4i_main._isloggedin = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 177;BA.debugLine="token = map.Get(\"f_key\")";
Debug.ShouldStop(65536);
b4i_main._token = BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_key")))));
 BA.debugLineNum = 178;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(131072);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 179;BA.debugLine="usersData.idUsuario = map.Get(\"f_idrecord\")";
Debug.ShouldStop(262144);
b4i_main._usersdata.setField ("idUsuario" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 180;BA.debugLine="usersData.nombre = map.Get(\"f_nombre\")";
Debug.ShouldStop(524288);
b4i_main._usersdata.setField ("nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 181;BA.debugLine="usersData.longitud = map.Get(\"f_longitud\")";
Debug.ShouldStop(1048576);
b4i_main._usersdata.setField ("longitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_longitud"))))));
 BA.debugLineNum = 182;BA.debugLine="usersData.latitud = map.Get(\"f_latitud\")";
Debug.ShouldStop(2097152);
b4i_main._usersdata.setField ("latitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_latitud"))))));
 BA.debugLineNum = 183;BA.debugLine="Principal.Initialize";
Debug.ShouldStop(4194304);
b4i_main._principal.runVoidMethod ("_initialize" /*void*/ );
 break; }
case 1: {
 BA.debugLineNum = 187;BA.debugLine="NavControl.NavigationBarVisible = False";
Debug.ShouldStop(67108864);
b4i_main._navcontrol.runMethod(true,"setNavigationBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 188;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(134217728);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 189;BA.debugLine="map = Job.Tag";
Debug.ShouldStop(268435456);
_map = (_job.getField(false,"_tag" /*RemoteObject*/ ));Debug.locals.put("map", _map);
 BA.debugLineNum = 190;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
Debug.ShouldStop(536870912);
b4i_main._txtusuario.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_email"))))));
 BA.debugLineNum = 191;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
Debug.ShouldStop(1073741824);
b4i_main._txtcontrasena.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_password"))))));
 BA.debugLineNum = 192;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(-2147483648);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 194;BA.debugLine="btnLogin_Click";
Debug.ShouldStop(2);
_btnlogin_click();
 break; }
}
;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lblregistrarme_click() throws Exception{
try {
		Debug.PushSubsStack("lblRegistrarme_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,114);
if (RapidSub.canDelegate("lblregistrarme_click")) { return b4i_main.remoteMe.runUserSub(false, "main","lblregistrarme_click");}
 BA.debugLineNum = 114;BA.debugLine="Sub lblRegistrarme_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 115;BA.debugLine="NavControl.SetNavigationBarVisibleAnimated(True)";
Debug.ShouldStop(262144);
b4i_main._navcontrol.runVoidMethod ("SetNavigationBarVisibleAnimated:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 116;BA.debugLine="PageRegistro.Initialize(\"pageRegistroCliente\")";
Debug.ShouldStop(524288);
b4i_main._pageregistro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("pageRegistroCliente")));
 BA.debugLineNum = 117;BA.debugLine="PageRegistro.RootPanel.LoadLayout(\"frmRegistroCli";
Debug.ShouldStop(1048576);
b4i_main._pageregistro.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmRegistroCliente")),b4i_main.ba);
 BA.debugLineNum = 118;BA.debugLine="NavControl.ShowPage(PageRegistro)";
Debug.ShouldStop(2097152);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._pageregistro).getObject())));
 BA.debugLineNum = 119;BA.debugLine="PageRegistro.Tag = PageRegistro.RootPanel.Top";
Debug.ShouldStop(4194304);
b4i_main._pageregistro.runMethod(false,"setTag:",(b4i_main._pageregistro.runMethod(false,"RootPanel").runMethod(true,"Top")));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_appear() throws Exception{
try {
		Debug.PushSubsStack("Page1_Appear (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,96);
if (RapidSub.canDelegate("page1_appear")) { return b4i_main.remoteMe.runUserSub(false, "main","page1_appear");}
 BA.debugLineNum = 96;BA.debugLine="Sub Page1_Appear";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="NavControl.NavigationBarVisible = False";
Debug.ShouldStop(1);
b4i_main._navcontrol.runMethod(true,"setNavigationBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 98;BA.debugLine="NavControl.ToolBarVisible = False";
Debug.ShouldStop(2);
b4i_main._navcontrol.runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_keyboardstatechanged(RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Page1_KeyboardStateChanged (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,200);
if (RapidSub.canDelegate("page1_keyboardstatechanged")) { return b4i_main.remoteMe.runUserSub(false, "main","page1_keyboardstatechanged", _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 200;BA.debugLine="Sub Page1_KeyboardStateChanged (Height As Float)";
Debug.ShouldStop(128);
 BA.debugLineNum = 202;BA.debugLine="funcion.KeyboardStateChanged(Height,Page1,-1)";
Debug.ShouldStop(512);
b4i_main._funcion.runVoidMethod ("_keyboardstatechanged:::" /*RemoteObject*/ ,(Object)(_height),(Object)(b4i_main._page1),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Page1_Resize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,101);
if (RapidSub.canDelegate("page1_resize")) { return b4i_main.remoteMe.runUserSub(false, "main","page1_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 101;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
Debug.ShouldStop(16);
 BA.debugLineNum = 102;BA.debugLine="Log(\"Page1_Resize\")";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethod ("LogImpl:::","4262145",RemoteObject.createImmutable("Page1_Resize"),0);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pageregistrocliente_keyboardstatechanged(RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("pageRegistroCliente_KeyboardStateChanged (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,259);
if (RapidSub.canDelegate("pageregistrocliente_keyboardstatechanged")) { return b4i_main.remoteMe.runUserSub(false, "main","pageregistrocliente_keyboardstatechanged", _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 259;BA.debugLine="Sub pageRegistroCliente_KeyboardStateChanged (Heig";
Debug.ShouldStop(4);
 BA.debugLineNum = 261;BA.debugLine="funcion.KeyboardStateChanged(Height,PageRegistro,";
Debug.ShouldStop(16);
b4i_main._funcion.runVoidMethod ("_keyboardstatechanged:::" /*RemoteObject*/ ,(Object)(_height),(Object)(b4i_main._pageregistro),(Object)(BA.numberCast(double.class, b4i_main._pageregistro.runMethod(false,"Tag"))));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
b4i_main._dateutils=RemoteObject.createNew ("b4i_dateutils");
b4i_principal._dateutils=b4i_main._dateutils;
b4i_funcion._dateutils=b4i_main._dateutils;
b4i_facturacion._dateutils=b4i_main._dateutils;
b4i_direcciones._dateutils=b4i_main._dateutils;
b4i_reporteordenes._dateutils=b4i_main._dateutils;
b4i_httputils2service._dateutils=b4i_main._dateutils;
b4i_httpjob._dateutils=b4i_main._dateutils;
b4i_animatedcounter._dateutils=b4i_main._dateutils;
b4i_anotherprogressbar._dateutils=b4i_main._dateutils;
b4i_b4xbreadcrumb._dateutils=b4i_main._dateutils;
b4i_b4xcolortemplate._dateutils=b4i_main._dateutils;
b4i_b4xcombobox._dateutils=b4i_main._dateutils;
b4i_b4xdatetemplate._dateutils=b4i_main._dateutils;
b4i_b4xdialog._dateutils=b4i_main._dateutils;
b4i_b4xfloattextfield._dateutils=b4i_main._dateutils;
b4i_b4xinputtemplate._dateutils=b4i_main._dateutils;
b4i_b4xlisttemplate._dateutils=b4i_main._dateutils;
b4i_b4xloadingindicator._dateutils=b4i_main._dateutils;
b4i_b4xlongtexttemplate._dateutils=b4i_main._dateutils;
b4i_b4xplusminus._dateutils=b4i_main._dateutils;
b4i_b4xsearchtemplate._dateutils=b4i_main._dateutils;
b4i_b4xsignaturetemplate._dateutils=b4i_main._dateutils;
b4i_b4xswitch._dateutils=b4i_main._dateutils;
b4i_b4xtimedtemplate._dateutils=b4i_main._dateutils;
b4i_b4xformatter._dateutils=b4i_main._dateutils;
b4i_roundslider._dateutils=b4i_main._dateutils;
b4i_scrollinglabel._dateutils=b4i_main._dateutils;
b4i_swiftbutton._dateutils=b4i_main._dateutils;
 //BA.debugLineNum = 18;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 21;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew ("B4INavigationControllerWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private Page1 As Page";
b4i_main._page1 = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 24;BA.debugLine="Private PageRegistro As Page";
b4i_main._pageregistro = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 26;BA.debugLine="Private Label3 As Label";
b4i_main._label3 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnLogin As Button";
b4i_main._btnlogin = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblRegistrarme As Label";
b4i_main._lblregistrarme = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txtContrasena As TextField";
b4i_main._txtcontrasena = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private txtUsuario As TextField";
b4i_main._txtusuario = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private txtURL As TextField";
b4i_main._txturl = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Dim token As String";
b4i_main._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 35;BA.debugLine="Dim tokenPublico As String = \"dbea1e74de894c3a37f";
b4i_main._tokenpublico = BA.ObjectToString("dbea1e74de894c3a37f4696a10ed6dd7");
 //BA.debugLineNum = 36;BA.debugLine="Dim  isLoggedIn As Boolean = False";
b4i_main._isloggedin = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 37;BA.debugLine="Dim jobMsj As String = \"No se pudo conectar con e";
b4i_main._jobmsj = BA.ObjectToString("No se pudo conectar con el servidor. Compruebe su conexión a internet.");
 //BA.debugLineNum = 38;BA.debugLine="Dim jobMsjTitle As String = \"Problemas de conexió";
b4i_main._jobmsjtitle = BA.ObjectToString("Problemas de conexión");
 //BA.debugLineNum = 39;BA.debugLine="Type typeU (idUsuario As Int, nombre As String, l";
;
 //BA.debugLineNum = 40;BA.debugLine="Dim usersData As typeU";
b4i_main._usersdata = RemoteObject.createNew ("_typeu");
 //BA.debugLineNum = 41;BA.debugLine="Dim SQL As SQL";
b4i_main._sql = RemoteObject.createNew ("B4ISQL");
 //BA.debugLineNum = 42;BA.debugLine="Private hud As HUD";
b4i_main._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 44;BA.debugLine="Dim url As String = \"http://162.211.121.18:8090/m";
b4i_main._url = BA.ObjectToString("http://162.211.121.18:8090/menube_app_server_ios/");
 //BA.debugLineNum = 47;BA.debugLine="Private btnRegistroClienteRegistrarme As Button";
b4i_main._btnregistroclienteregistrarme = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private txtContrasena2 As TextField";
b4i_main._txtcontrasena2 = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private txtContrasenaRegistro As TextField";
b4i_main._txtcontrasenaregistro = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private txtDireccion As TextField";
b4i_main._txtdireccion = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private txtNombre As TextField";
b4i_main._txtnombre = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private txtTelefono As TextField";
b4i_main._txttelefono = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private txtUsuarioRegistro As TextField";
b4i_main._txtusuarioregistro = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updateurl() throws Exception{
try {
		Debug.PushSubsStack("updateURL (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,276);
if (RapidSub.canDelegate("updateurl")) { return b4i_main.remoteMe.runUserSub(false, "main","updateurl");}
 BA.debugLineNum = 276;BA.debugLine="Sub updateURL";
Debug.ShouldStop(524288);
 BA.debugLineNum = 277;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE t_preferencia SET f_url";
Debug.ShouldStop(1048576);
b4i_main._sql.runVoidMethod ("ExecNonQuery2::",(Object)(BA.ObjectToString("UPDATE t_preferencia SET f_url = ?")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(b4i_main._txturl.runMethod(true,"Text").runMethod(true,"Trim"))}))));
 BA.debugLineNum = 278;BA.debugLine="url = txtURL.Text.Trim";
Debug.ShouldStop(2097152);
b4i_main._url = b4i_main._txturl.runMethod(true,"Text").runMethod(true,"Trim");
 BA.debugLineNum = 279;BA.debugLine="hud.ToastMessageShow(\"URL actializado\",False)";
Debug.ShouldStop(4194304);
b4i_main._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("URL actializado")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}