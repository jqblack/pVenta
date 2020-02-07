package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_login_subs_0 {


public static RemoteObject  _btnconfiguracion_click() throws Exception{
try {
		Debug.PushSubsStack("btnConfiguracion_Click (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,74);
if (RapidSub.canDelegate("btnconfiguracion_click")) { return b4i_login.remoteMe.runUserSub(false, "login","btnconfiguracion_click");}
 BA.debugLineNum = 74;BA.debugLine="Sub btnConfiguracion_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 76;BA.debugLine="If txtURL.Alpha = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",b4i_login._txturl.runMethod(true,"Alpha"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 77;BA.debugLine="txtURL.SetAlphaAnimated(300,1)";
Debug.ShouldStop(4096);
b4i_login._txturl.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 1)));
 }else {
 BA.debugLineNum = 79;BA.debugLine="txtURL.SetAlphaAnimated(300,0)";
Debug.ShouldStop(16384);
b4i_login._txturl.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 80;BA.debugLine="updateURL";
Debug.ShouldStop(32768);
_updateurl();
 };
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnLogin_Click (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,90);
if (RapidSub.canDelegate("btnlogin_click")) { return b4i_login.remoteMe.runUserSub(false, "login","btnlogin_click");}
RemoteObject _url2 = RemoteObject.createImmutable("");
RemoteObject _dato = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _imei = RemoteObject.createImmutable("");
RemoteObject _operadora = RemoteObject.createImmutable("");
RemoteObject _device = RemoteObject.declareNull("B4INativeObject");
RemoteObject _joblogin = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 90;BA.debugLine="Sub btnLogin_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 93;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",b4i_login._txtcontrasena.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",b4i_login._txtusuario.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 94;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
Debug.ShouldStop(536870912);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Faltan datos por ingresar")),(Object)(RemoteObject.createImmutable("Aviso")));
 }else {
 BA.debugLineNum = 97;BA.debugLine="toast.ProgressDialogShow(\"Conectando..\")";
Debug.ShouldStop(1);
b4i_login._toast.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Conectando..")));
 BA.debugLineNum = 98;BA.debugLine="txtUsuario.UserInteractionEnabled = True";
Debug.ShouldStop(2);
b4i_login._txtusuario.runMethod(true,"setUserInteractionEnabled:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="Dim url2 As String";
Debug.ShouldStop(4);
_url2 = RemoteObject.createImmutable("");Debug.locals.put("url2", _url2);
 BA.debugLineNum = 100;BA.debugLine="Dim dato As String";
Debug.ShouldStop(8);
_dato = RemoteObject.createImmutable("");Debug.locals.put("dato", _dato);
 BA.debugLineNum = 101;BA.debugLine="Dim data As String";
Debug.ShouldStop(16);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 102;BA.debugLine="Dim  imei As String";
Debug.ShouldStop(32);
_imei = RemoteObject.createImmutable("");Debug.locals.put("imei", _imei);
 BA.debugLineNum = 103;BA.debugLine="Dim operadora As String";
Debug.ShouldStop(64);
_operadora = RemoteObject.createImmutable("");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 105;BA.debugLine="correro = txtUsuario.Text.Trim";
Debug.ShouldStop(256);
b4i_login._correro = b4i_login._txtusuario.runMethod(true,"Text").runMethod(true,"Trim");
 BA.debugLineNum = 107;BA.debugLine="Dim device As NativeObject";
Debug.ShouldStop(1024);
_device = RemoteObject.createNew ("B4INativeObject");Debug.locals.put("device", _device);
 BA.debugLineNum = 108;BA.debugLine="device = device.Initialize(\"UIDevice\").RunMethod";
Debug.ShouldStop(2048);
_device = _device.runMethod(false,"Initialize:",(Object)(RemoteObject.createImmutable("UIDevice"))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("currentDevice")),(Object)((b4i_main.__c.runMethod(false,"Null"))));Debug.locals.put("device", _device);
 BA.debugLineNum = 109;BA.debugLine="operadora= App.OSVersion";
Debug.ShouldStop(4096);
_operadora = b4i_login._app.runMethod(true,"OSVersion");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 110;BA.debugLine="imei = device.GetField(\"identifierForVendor\").As";
Debug.ShouldStop(8192);
_imei = _device.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("identifierForVendor"))).runMethod(true,"AsString");Debug.locals.put("imei", _imei);
 BA.debugLineNum = 112;BA.debugLine="data = \"'f_modelo':'','f_banda':'', 'f_operadora";
Debug.ShouldStop(32768);
_data = RemoteObject.concat(RemoteObject.createImmutable("'f_modelo':'','f_banda':'', 'f_operadora': '"),_operadora,RemoteObject.createImmutable("','f_tamano':0,"),RemoteObject.createImmutable("'f_imei':'"),_imei,RemoteObject.createImmutable("','f_usuario':'"),b4i_login._txtusuario.runMethod(true,"Text").runMethod(true,"Trim"),RemoteObject.createImmutable("','f_contrasena':'"),b4i_login._txtcontrasena.runMethod(true,"Text").runMethod(true,"Trim"),RemoteObject.createImmutable("'"));Debug.locals.put("data", _data);
 BA.debugLineNum = 115;BA.debugLine="dato=funciones.crearJson(\"none\",data)";
Debug.ShouldStop(262144);
_dato = b4i_login._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(BA.ObjectToString("none")),(Object)(_data));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 116;BA.debugLine="url2 = Main.url & \"login/login/\"";
Debug.ShouldStop(524288);
_url2 = RemoteObject.concat(b4i_login._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("login/login/"));Debug.locals.put("url2", _url2);
 BA.debugLineNum = 118;BA.debugLine="Dim JobLogin As HttpJob";
Debug.ShouldStop(2097152);
_joblogin = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobLogin", _joblogin);
 BA.debugLineNum = 119;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
Debug.ShouldStop(4194304);
_joblogin.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_login.ba,(Object)(BA.ObjectToString("JobLogin")),(Object)(b4i_login.getObject()));
 BA.debugLineNum = 120;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
Debug.ShouldStop(8388608);
_joblogin.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(_url2),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),_dato)));
 };
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmenuprincipal_click() throws Exception{
try {
		Debug.PushSubsStack("btnMenuPrincipal_Click (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,125);
if (RapidSub.canDelegate("btnmenuprincipal_click")) { return b4i_login.remoteMe.runUserSub(false, "login","btnmenuprincipal_click");}
 BA.debugLineNum = 125;BA.debugLine="Sub btnMenuPrincipal_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 127;BA.debugLine="If Main.reload Then";
Debug.ShouldStop(1073741824);
if (b4i_login._main._reload /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 128;BA.debugLine="Main.Initialize";
Debug.ShouldStop(-2147483648);
b4i_login._main.runVoidMethod ("_initialize" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 130;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(2);
b4i_login._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 131;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(4);
b4i_login._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnregistroclienteback_click() throws Exception{
try {
		Debug.PushSubsStack("btnRegistroClienteBack_Click (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,267);
if (RapidSub.canDelegate("btnregistroclienteback_click")) { return b4i_login.remoteMe.runUserSub(false, "login","btnregistroclienteback_click");}
 BA.debugLineNum = 267;BA.debugLine="Sub btnRegistroClienteBack_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 269;BA.debugLine="clearRegistro";
Debug.ShouldStop(4096);
_clearregistro();
 BA.debugLineNum = 270;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(8192);
b4i_login._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnRegistroClienteRegistrarme_Click (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,215);
if (RapidSub.canDelegate("btnregistroclienteregistrarme_click")) { return b4i_login.remoteMe.runUserSub(false, "login","btnregistroclienteregistrarme_click");}
RemoteObject _json = RemoteObject.declareNull("B4IJSONGenerator");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _jobnewuser = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 215;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 217;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",b4i_login._txtnombre.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 218;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
Debug.ShouldStop(33554432);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su nombre")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 219;BA.debugLine="txtNombre.RequestFocus";
Debug.ShouldStop(67108864);
b4i_login._txtnombre.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 220;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 221;BA.debugLine="Else if txtTelefono.Text.Trim.Length = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",b4i_login._txttelefono.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 222;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
Debug.ShouldStop(536870912);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su teléfono")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 223;BA.debugLine="txtTelefono.RequestFocus";
Debug.ShouldStop(1073741824);
b4i_login._txttelefono.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 224;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 225;BA.debugLine="else if txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",b4i_login._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 226;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su dirección")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 227;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(4);
b4i_login._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 228;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 229;BA.debugLine="else if txtUsuarioRegistro.Text.Trim.Length = 0 T";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",b4i_login._txtusuarioregistro.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 230;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su correo electrónico")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 231;BA.debugLine="txtUsuarioRegistro.RequestFocus";
Debug.ShouldStop(64);
b4i_login._txtusuarioregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 232;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 233;BA.debugLine="else if txtContrasenaRegistro.Text.Trim.Length =";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",b4i_login._txtcontrasenaregistro.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 234;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
Debug.ShouldStop(512);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su contraseña")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 235;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(1024);
b4i_login._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 236;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 237;BA.debugLine="else if txtContrasena2.Text.Trim.Length = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",b4i_login._txtcontrasena2.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 238;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
Debug.ShouldStop(8192);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca su contraseña nuevamente")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 239;BA.debugLine="txtContrasena2.RequestFocus";
Debug.ShouldStop(16384);
b4i_login._txtcontrasena2.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 240;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 241;BA.debugLine="Else If txtContrasenaRegistro.Text <> txtContrase";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",b4i_login._txtcontrasenaregistro.runMethod(true,"Text"),b4i_login._txtcontrasena2.runMethod(true,"Text"))) { 
 BA.debugLineNum = 242;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Las contraseñas no coinciden.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 243;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(262144);
b4i_login._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 244;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 }}}}}}}
;
 BA.debugLineNum = 247;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(4194304);
_json = RemoteObject.createNew ("B4IJSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 248;BA.debugLine="Dim map As Map";
Debug.ShouldStop(8388608);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 249;BA.debugLine="map.Initialize";
Debug.ShouldStop(16777216);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 250;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
Debug.ShouldStop(33554432);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_nombre"))),(Object)((b4i_login._txtnombre.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 251;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
Debug.ShouldStop(67108864);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_telefono"))),(Object)((b4i_login._txttelefono.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 252;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
Debug.ShouldStop(134217728);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_direccion"))),(Object)((b4i_login._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 253;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
Debug.ShouldStop(268435456);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_email"))),(Object)((b4i_login._txtusuarioregistro.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 254;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
Debug.ShouldStop(536870912);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_password"))),(Object)((b4i_login._txtcontrasenaregistro.runMethod(true,"Text").runMethod(true,"Trim"))));
 BA.debugLineNum = 255;BA.debugLine="map.Put(\"f_latitud\",\"\")";
Debug.ShouldStop(1073741824);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_latitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 256;BA.debugLine="map.Put(\"f_longitud\",\"\")";
Debug.ShouldStop(-2147483648);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_longitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 257;BA.debugLine="map.Put(\"f_idrecord\",0)";
Debug.ShouldStop(1);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idrecord"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 258;BA.debugLine="json.Initialize(map)";
Debug.ShouldStop(2);
_json.runVoidMethod ("Initialize:",(Object)(_map));
 BA.debugLineNum = 260;BA.debugLine="Dim JobNewUser As HttpJob";
Debug.ShouldStop(8);
_jobnewuser = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobNewUser", _jobnewuser);
 BA.debugLineNum = 261;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
Debug.ShouldStop(16);
_jobnewuser.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_login.ba,(Object)(BA.ObjectToString("JobNewUser")),(Object)(b4i_login.getObject()));
 BA.debugLineNum = 262;BA.debugLine="JobNewUser.Tag = map";
Debug.ShouldStop(32);
_jobnewuser.setField ("_tag" /*RemoteObject*/ ,(_map));
 BA.debugLineNum = 263;BA.debugLine="JobNewUser.PostString(Main.url&\"ws/set_salvar_usu";
Debug.ShouldStop(64);
_jobnewuser.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_login._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_login._funciones.runMethod(true,"_crearjson2::" /*RemoteObject*/ ,(Object)(b4i_login._main._tokenpublico /*RemoteObject*/ ),(Object)(_json.runMethod(true,"ToString"))))));
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearregistro() throws Exception{
try {
		Debug.PushSubsStack("clearRegistro (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,274);
if (RapidSub.canDelegate("clearregistro")) { return b4i_login.remoteMe.runUserSub(false, "login","clearregistro");}
 BA.debugLineNum = 274;BA.debugLine="Sub clearRegistro";
Debug.ShouldStop(131072);
 BA.debugLineNum = 276;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(524288);
b4i_login._txtnombre.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 277;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(1048576);
b4i_login._txttelefono.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 278;BA.debugLine="txtDireccion.Text = \"\"";
Debug.ShouldStop(2097152);
b4i_login._txtdireccion.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 279;BA.debugLine="txtUsuarioRegistro.Text = \"\"";
Debug.ShouldStop(4194304);
b4i_login._txtusuarioregistro.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 280;BA.debugLine="txtContrasenaRegistro.Text = \"\"";
Debug.ShouldStop(8388608);
b4i_login._txtcontrasenaregistro.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 281;BA.debugLine="txtContrasena2.Text = \"\"";
Debug.ShouldStop(16777216);
b4i_login._txtcontrasena2.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,43);
if (RapidSub.canDelegate("initialize")) { return b4i_login.remoteMe.runUserSub(false, "login","initialize");}
 BA.debugLineNum = 43;BA.debugLine="Sub Initialize";
Debug.ShouldStop(1024);
 BA.debugLineNum = 46;BA.debugLine="If File.Exists(File.DirDocuments, \"db.db\") = Fals";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4i_main.__c.runMethod(false,"File").runMethod(true,"Exists::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(RemoteObject.createImmutable("db.db"))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 47;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDocum";
Debug.ShouldStop(16384);
b4i_main.__c.runMethod(false,"File").runVoidMethod ("Copy::::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 49;BA.debugLine="SQL.Initialize(File.DirDocuments, \"db.db\", False)";
Debug.ShouldStop(65536);
b4i_login._sql.runVoidMethod ("Initialize:::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(BA.ObjectToString("db.db")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 51;BA.debugLine="page.Initialize(\"PageLogin\")";
Debug.ShouldStop(262144);
b4i_login._page.runVoidMethod ("Initialize::",b4i_login.ba,(Object)(RemoteObject.createImmutable("PageLogin")));
 BA.debugLineNum = 53;BA.debugLine="page.RootPanel.LoadLayout(\"frmLogin\")";
Debug.ShouldStop(1048576);
b4i_login._page.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmLogin")),b4i_login.ba);
 BA.debugLineNum = 55;BA.debugLine="page.Tag = page.RootPanel.Top + 50%y";
Debug.ShouldStop(4194304);
b4i_login._page.runMethod(false,"setTag:",(RemoteObject.solve(new RemoteObject[] {b4i_login._page.runMethod(false,"RootPanel").runMethod(true,"Top"),b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 50)))}, "+",1, 0)));
 BA.debugLineNum = 57;BA.debugLine="Main.NavControl.ShowPage2(page,True)";
Debug.ShouldStop(16777216);
b4i_login._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_login._page).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 59;BA.debugLine="txtURL.Alpha = 0";
Debug.ShouldStop(67108864);
b4i_login._txturl.runMethod(true,"setAlpha:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 60;BA.debugLine="txtURL.Text = Main.url";
Debug.ShouldStop(134217728);
b4i_login._txturl.runMethod(true,"setText:",b4i_login._main._url /*RemoteObject*/ );
 BA.debugLineNum = 62;BA.debugLine="Main.smc.Tag = \"login\"";
Debug.ShouldStop(536870912);
b4i_login._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("login")));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("JobDone (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,136);
if (RapidSub.canDelegate("jobdone")) { return b4i_login.remoteMe.runUserSub(false, "login","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 136;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="toast.ProgressDialogHide";
Debug.ShouldStop(512);
b4i_login._toast.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 140;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 141;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(4096);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_login._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_login._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 142;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 145;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",b4i_login._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 146;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 149;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1048576);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 150;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(2097152);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 151;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
Debug.ShouldStop(4194304);
_json.runVoidMethod ("Initialize:",(Object)(b4i_login._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 152;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(8388608);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 154;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobLogin"),BA.ObjectToString("JobNewUser"))) {
case 0: {
 BA.debugLineNum = 158;BA.debugLine="Main.token = map.Get(\"f_key\")";
Debug.ShouldStop(536870912);
b4i_login._main._token /*RemoteObject*/  = BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_key")))));
 BA.debugLineNum = 159;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(1073741824);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 160;BA.debugLine="Main.usersData.idUsuario = map.Get(\"f_idrecord\"";
Debug.ShouldStop(-2147483648);
b4i_login._main._usersdata /*RemoteObject*/ .setField ("idUsuario" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 161;BA.debugLine="Main.usersData.nombre = map.Get(\"f_nombre\")";
Debug.ShouldStop(1);
b4i_login._main._usersdata /*RemoteObject*/ .setField ("nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 162;BA.debugLine="Main.usersData.longitud = map.Get(\"f_longitud\")";
Debug.ShouldStop(2);
b4i_login._main._usersdata /*RemoteObject*/ .setField ("longitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_longitud"))))));
 BA.debugLineNum = 163;BA.debugLine="Main.usersData.latitud = map.Get(\"f_latitud\")";
Debug.ShouldStop(4);
b4i_login._main._usersdata /*RemoteObject*/ .setField ("latitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_latitud"))))));
 BA.debugLineNum = 165;BA.debugLine="Main.isLoged= True";
Debug.ShouldStop(16);
b4i_login._main._isloged /*RemoteObject*/  = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 166;BA.debugLine="txtContrasena.Text = \"\"";
Debug.ShouldStop(32);
b4i_login._txtcontrasena.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 167;BA.debugLine="txtUsuario.Text = \"\"";
Debug.ShouldStop(64);
b4i_login._txtusuario.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 168;BA.debugLine="Main.Initialize";
Debug.ShouldStop(128);
b4i_login._main.runVoidMethod ("_initialize" /*RemoteObject*/ );
 break; }
case 1: {
 BA.debugLineNum = 172;BA.debugLine="map = Job.Tag";
Debug.ShouldStop(2048);
_map = (_job.getField(false,"_tag" /*RemoteObject*/ ));Debug.locals.put("map", _map);
 BA.debugLineNum = 173;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
Debug.ShouldStop(4096);
b4i_login._txtusuario.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_email"))))));
 BA.debugLineNum = 174;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
Debug.ShouldStop(8192);
b4i_login._txtcontrasena.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_password"))))));
 BA.debugLineNum = 175;BA.debugLine="btnRegistroClienteBack_Click";
Debug.ShouldStop(16384);
_btnregistroclienteback_click();
 BA.debugLineNum = 176;BA.debugLine="btnLogin_Click";
Debug.ShouldStop(32768);
_btnlogin_click();
 break; }
}
;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("lblRegistrarme_Click (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,182);
if (RapidSub.canDelegate("lblregistrarme_click")) { return b4i_login.remoteMe.runUserSub(false, "login","lblregistrarme_click");}
 BA.debugLineNum = 182;BA.debugLine="Sub lblRegistrarme_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 185;BA.debugLine="pageReg.Initialize(\"pageReg\")";
Debug.ShouldStop(16777216);
b4i_login._pagereg.runVoidMethod ("Initialize::",b4i_login.ba,(Object)(RemoteObject.createImmutable("pageReg")));
 BA.debugLineNum = 187;BA.debugLine="pageReg.RootPanel.LoadLayout(\"frmRegistarCliente\"";
Debug.ShouldStop(67108864);
b4i_login._pagereg.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmRegistarCliente")),b4i_login.ba);
 BA.debugLineNum = 189;BA.debugLine="Main.NavControl.ShowPage(pageReg)";
Debug.ShouldStop(268435456);
b4i_login._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_login._pagereg).getObject())));
 BA.debugLineNum = 190;BA.debugLine="pageReg.Tag = pageReg.RootPanel.Top + 50%y";
Debug.ShouldStop(536870912);
b4i_login._pagereg.runMethod(false,"setTag:",(RemoteObject.solve(new RemoteObject[] {b4i_login._pagereg.runMethod(false,"RootPanel").runMethod(true,"Top"),b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 50)))}, "+",1, 0)));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagelogin_keyboardstatechanged(RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("PageLogin_KeyboardStateChanged (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,202);
if (RapidSub.canDelegate("pagelogin_keyboardstatechanged")) { return b4i_login.remoteMe.runUserSub(false, "login","pagelogin_keyboardstatechanged", _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 202;BA.debugLine="Sub PageLogin_KeyboardStateChanged (Height As Floa";
Debug.ShouldStop(512);
 BA.debugLineNum = 204;BA.debugLine="funciones.KeyboardStateChanged(Height,page,-1)";
Debug.ShouldStop(2048);
b4i_login._funciones.runVoidMethod ("_keyboardstatechanged:::" /*RemoteObject*/ ,(Object)(_height),(Object)(b4i_login._page),(Object)(BA.numberCast(double.class, -(double) (0 + 1))));
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagereg_keyboardstatechanged(RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("pageReg_KeyboardStateChanged (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,196);
if (RapidSub.canDelegate("pagereg_keyboardstatechanged")) { return b4i_login.remoteMe.runUserSub(false, "login","pagereg_keyboardstatechanged", _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 196;BA.debugLine="Sub pageReg_KeyboardStateChanged (Height As Float)";
Debug.ShouldStop(8);
 BA.debugLineNum = 198;BA.debugLine="funciones.KeyboardStateChanged(Height,pageReg,pag";
Debug.ShouldStop(32);
b4i_login._funciones.runVoidMethod ("_keyboardstatechanged:::" /*RemoteObject*/ ,(Object)(_height),(Object)(b4i_login._pagereg),(Object)(BA.numberCast(double.class, b4i_login._pagereg.runMethod(false,"Tag"))));
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private btnConfiguracion As Button";
b4i_login._btnconfiguracion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private btnLogin As Button";
b4i_login._btnlogin = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private PanelConfiguracion As Panel";
b4i_login._panelconfiguracion = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Dim toast As HUD";
b4i_login._toast = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 11;BA.debugLine="Private page As Page";
b4i_login._page = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 12;BA.debugLine="Dim correro As String";
b4i_login._correro = RemoteObject.createImmutable("");
 //BA.debugLineNum = 13;BA.debugLine="Dim pageReg As Page";
b4i_login._pagereg = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 14;BA.debugLine="Dim SQL As SQL";
b4i_login._sql = RemoteObject.createNew ("B4ISQL");
 //BA.debugLineNum = 15;BA.debugLine="Dim hud As HUD";
b4i_login._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 17;BA.debugLine="Dim width As Int";
b4i_login._width = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Dim smcLog As SideMenuController";
b4i_login._smclog = RemoteObject.createNew ("B4ISideMenuController");
 //BA.debugLineNum = 21;BA.debugLine="Private btnMenuPrincipal As Button";
b4i_login._btnmenuprincipal = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtUsuario As TextField";
b4i_login._txtusuario = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private txtContrasena As TextField";
b4i_login._txtcontrasena = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Dim App As Application";
b4i_login._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblRegistrarme As Label";
b4i_login._lblregistrarme = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnRegistroClienteBack As Button";
b4i_login._btnregistroclienteback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnRegistroClienteRegistrarme As Button";
b4i_login._btnregistroclienteregistrarme = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private Panel1 As Panel";
b4i_login._panel1 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private txtContrasena2 As TextField";
b4i_login._txtcontrasena2 = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private txtContrasenaRegistro As TextField";
b4i_login._txtcontrasenaregistro = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private txtDireccion As TextField";
b4i_login._txtdireccion = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private txtNombre As TextField";
b4i_login._txtnombre = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private txtTelefono As TextField";
b4i_login._txttelefono = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private txtUsuarioRegistro As TextField";
b4i_login._txtusuarioregistro = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private txtURL As TextView";
b4i_login._txturl = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnIniciarSecion As Button";
b4i_login._btniniciarsecion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updateurl() throws Exception{
try {
		Debug.PushSubsStack("updateURL (login) ","login",1,b4i_login.ba,b4i_login.mostCurrent,84);
if (RapidSub.canDelegate("updateurl")) { return b4i_login.remoteMe.runUserSub(false, "login","updateurl");}
 BA.debugLineNum = 84;BA.debugLine="Sub updateURL";
Debug.ShouldStop(524288);
 BA.debugLineNum = 85;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE t_preferencia SET f_url";
Debug.ShouldStop(1048576);
b4i_login._sql.runVoidMethod ("ExecNonQuery2::",(Object)(BA.ObjectToString("UPDATE t_preferencia SET f_url = ?")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(b4i_login._txturl.runMethod(true,"Text").runMethod(true,"Trim"))}))));
 BA.debugLineNum = 86;BA.debugLine="Main.url = txtURL.Text.Trim";
Debug.ShouldStop(2097152);
b4i_login._main._url /*RemoteObject*/  = b4i_login._txturl.runMethod(true,"Text").runMethod(true,"Trim");
 BA.debugLineNum = 87;BA.debugLine="hud.ToastMessageShow(\"URL actializado\",False)";
Debug.ShouldStop(4194304);
b4i_login._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("URL actializado")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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