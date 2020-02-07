package com.menube.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,66);
if (RapidSub.canDelegate("activity_create")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime);}
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 66;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 68;BA.debugLine="If File.Exists(File.DirDefaultExternal, \"db.db\")";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",main.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db"))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 69;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDefau";
Debug.ShouldStop(16);
main.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 71;BA.debugLine="SQL.Initialize(File.DirDefaultExternal,\"db.db\", T";
Debug.ShouldStop(64);
main._sql.runVoidMethod ("Initialize",(Object)(main.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 73;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(256);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 74;BA.debugLine="cur = SQL.ExecQuery(\"SELECT * FROM t_preferencia\"";
Debug.ShouldStop(512);
_cur.setObject(main._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM t_preferencia"))));
 BA.debugLineNum = 75;BA.debugLine="cur.Position = 0";
Debug.ShouldStop(1024);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 76;BA.debugLine="url = cur.GetString(\"f_url\")";
Debug.ShouldStop(2048);
main._url = _cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("f_url")));
 BA.debugLineNum = 78;BA.debugLine="Activity.LoadLayout(\"frmLogin\")";
Debug.ShouldStop(8192);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmLogin")),main.mostCurrent.activityBA);
 BA.debugLineNum = 79;BA.debugLine="PanelConfiguracion.Top = -PanelConfiguracion.Heig";
Debug.ShouldStop(16384);
main.mostCurrent._panelconfiguracion.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + main.mostCurrent._panelconfiguracion.runMethod(true,"getHeight").<Integer>get().intValue())-(double) (0 + main.mostCurrent._btnconfiguracion.runMethod(true,"getTop").<Integer>get().intValue())));
 BA.debugLineNum = 80;BA.debugLine="txtURL.Text = url";
Debug.ShouldStop(32768);
main.mostCurrent._txturl.runMethod(true,"setText",BA.ObjectToCharSequence(main._url));
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
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,123);
if (RapidSub.canDelegate("activity_pause")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 123;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,118);
if (RapidSub.canDelegate("activity_resume")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 118;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnConfiguracion_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,84);
if (RapidSub.canDelegate("btnconfiguracion_click")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","btnconfiguracion_click");}
RemoteObject _posicion = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 84;BA.debugLine="Sub btnConfiguracion_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 86;BA.debugLine="Dim posicion As Int = PanelConfiguracion.Height +";
Debug.ShouldStop(2097152);
_posicion = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._panelconfiguracion.runMethod(true,"getHeight"),main.mostCurrent._btnconfiguracion.runMethod(true,"getTop"),main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),main.mostCurrent.activityBA)}, "++",2, 1);Debug.locals.put("posicion", _posicion);Debug.locals.put("posicion", _posicion);
 BA.debugLineNum = 87;BA.debugLine="If PanelConfiguracion.Top > 0%y Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",main.mostCurrent._panelconfiguracion.runMethod(true,"getTop"),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 88;BA.debugLine="posicion = -posicion";
Debug.ShouldStop(8388608);
_posicion = BA.numberCast(int.class, -(double) (0 + _posicion.<Integer>get().intValue()));Debug.locals.put("posicion", _posicion);
 };
 BA.debugLineNum = 91;BA.debugLine="PanelConfiguracion.Tag = posicion";
Debug.ShouldStop(67108864);
main.mostCurrent._panelconfiguracion.runMethod(false,"setTag",(_posicion));
 BA.debugLineNum = 92;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(134217728);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 93;BA.debugLine="a.InitializeTranslate(\"url\",0,0,0,posicion)";
Debug.ShouldStop(268435456);
_a.runVoidMethod ("InitializeTranslate",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("url")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _posicion)));
 BA.debugLineNum = 94;BA.debugLine="a.Duration = 300";
Debug.ShouldStop(536870912);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, 300));
 BA.debugLineNum = 95;BA.debugLine="a.Start(PanelConfiguracion)";
Debug.ShouldStop(1073741824);
_a.runVoidMethod ("Start",(Object)((main.mostCurrent._panelconfiguracion.getObject())));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,128);
if (RapidSub.canDelegate("btnlogin_click")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","btnlogin_click");}
RemoteObject _url2 = RemoteObject.createImmutable("");
RemoteObject _dato = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _banda = RemoteObject.createImmutable("");
RemoteObject _imei = RemoteObject.createImmutable("");
RemoteObject _operadora = RemoteObject.createImmutable("");
RemoteObject _joblogin = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 128;BA.debugLine="Sub btnLogin_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 133;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtcontrasena.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",main.mostCurrent._txtusuario.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Faltan datos por ingresar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 136;BA.debugLine="ToastMessageShow(\"Conectando..\",False)";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Conectando..")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 137;BA.debugLine="Dim url2 As String";
Debug.ShouldStop(256);
_url2 = RemoteObject.createImmutable("");Debug.locals.put("url2", _url2);
 BA.debugLineNum = 138;BA.debugLine="Dim dato As String";
Debug.ShouldStop(512);
_dato = RemoteObject.createImmutable("");Debug.locals.put("dato", _dato);
 BA.debugLineNum = 139;BA.debugLine="Dim data As String";
Debug.ShouldStop(1024);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 140;BA.debugLine="Dim banda As String";
Debug.ShouldStop(2048);
_banda = RemoteObject.createImmutable("");Debug.locals.put("banda", _banda);
 BA.debugLineNum = 141;BA.debugLine="Dim  imei As String";
Debug.ShouldStop(4096);
_imei = RemoteObject.createImmutable("");Debug.locals.put("imei", _imei);
 BA.debugLineNum = 142;BA.debugLine="Dim operadora As String";
Debug.ShouldStop(8192);
_operadora = RemoteObject.createImmutable("");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 144;BA.debugLine="operadora=P.GetNetworkOperatorName";
Debug.ShouldStop(32768);
_operadora = main.mostCurrent._p.runMethod(true,"GetNetworkOperatorName");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 145;BA.debugLine="imei=PI.GetDeviceId";
Debug.ShouldStop(65536);
_imei = main.mostCurrent._pi.runMethod(true,"GetDeviceId");Debug.locals.put("imei", _imei);
 BA.debugLineNum = 146;BA.debugLine="banda=P.GetPhoneType";
Debug.ShouldStop(131072);
_banda = main.mostCurrent._p.runMethod(true,"GetPhoneType");Debug.locals.put("banda", _banda);
 BA.debugLineNum = 148;BA.debugLine="If operadora = \"Null\" Or operadora = \"\"   Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_operadora,BA.ObjectToString("Null")) || RemoteObject.solveBoolean("=",_operadora,BA.ObjectToString(""))) { 
 BA.debugLineNum = 149;BA.debugLine="operadora=\"0\"";
Debug.ShouldStop(1048576);
_operadora = BA.ObjectToString("0");Debug.locals.put("operadora", _operadora);
 };
 BA.debugLineNum = 152;BA.debugLine="If imei= \"\"  Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_imei,BA.ObjectToString(""))) { 
 BA.debugLineNum = 153;BA.debugLine="imei=P.GetSettings(\"android_id\")";
Debug.ShouldStop(16777216);
_imei = main.mostCurrent._p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));Debug.locals.put("imei", _imei);
 };
 BA.debugLineNum = 156;BA.debugLine="If banda= \"\"  Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_banda,BA.ObjectToString(""))) { 
 BA.debugLineNum = 157;BA.debugLine="banda=\"0\"";
Debug.ShouldStop(268435456);
_banda = BA.ObjectToString("0");Debug.locals.put("banda", _banda);
 };
 BA.debugLineNum = 161;BA.debugLine="data = \"'f_modelo':'\"&P.Model& \" - \"&P.Manufactu";
Debug.ShouldStop(1);
_data = RemoteObject.concat(RemoteObject.createImmutable("'f_modelo':'"),main.mostCurrent._p.runMethod(true,"getModel"),RemoteObject.createImmutable(" - "),main.mostCurrent._p.runMethod(true,"getManufacturer"),RemoteObject.createImmutable("','f_banda':'"),_banda,RemoteObject.createImmutable("', 'f_operadora': '"),_operadora,RemoteObject.createImmutable("','f_tamano':"),main.mostCurrent._funcion.runMethod(true,"_getdevicephysicalsize" /*RemoteObject*/ ,main.mostCurrent.activityBA),RemoteObject.createImmutable(","),RemoteObject.createImmutable("'f_imei':'"),_imei,RemoteObject.createImmutable("','f_usuario':'"),main.mostCurrent._txtusuario.runMethod(true,"getText").runMethod(true,"trim"),RemoteObject.createImmutable("','f_contrasena':'"),main.mostCurrent._txtcontrasena.runMethod(true,"getText").runMethod(true,"trim"),RemoteObject.createImmutable("'"));Debug.locals.put("data", _data);
 BA.debugLineNum = 164;BA.debugLine="dato=funcion.crearJson(\"none\",data)";
Debug.ShouldStop(8);
_dato = main.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("none")),(Object)(_data));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 165;BA.debugLine="url2 = url & \"login/login/\"";
Debug.ShouldStop(16);
_url2 = RemoteObject.concat(main._url,RemoteObject.createImmutable("login/login/"));Debug.locals.put("url2", _url2);
 BA.debugLineNum = 167;BA.debugLine="Dim JobLogin As HttpJob";
Debug.ShouldStop(64);
_joblogin = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobLogin", _joblogin);
 BA.debugLineNum = 168;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
Debug.ShouldStop(128);
_joblogin.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("JobLogin")),(Object)(main.getObject()));
 BA.debugLineNum = 169;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
Debug.ShouldStop(256);
_joblogin.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url2),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),_dato)));
 };
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("btnRegistroClienteBack_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,279);
if (RapidSub.canDelegate("btnregistroclienteback_click")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","btnregistroclienteback_click");}
 BA.debugLineNum = 279;BA.debugLine="Sub btnRegistroClienteBack_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 280;BA.debugLine="openRegistrarCliente";
Debug.ShouldStop(8388608);
_openregistrarcliente();
 BA.debugLineNum = 281;BA.debugLine="clearRegistro";
Debug.ShouldStop(16777216);
_clearregistro();
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnRegistroClienteRegistrarme_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,213);
if (RapidSub.canDelegate("btnregistroclienteregistrarme_click")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","btnregistroclienteregistrarme_click");}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jobnewuser = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 213;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 215;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtnombre.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 216;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
Debug.ShouldStop(8388608);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su nombre")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 217;BA.debugLine="txtNombre.RequestFocus";
Debug.ShouldStop(16777216);
main.mostCurrent._txtnombre.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 218;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 219;BA.debugLine="Else if txtTelefono.Text.Trim.Length = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txttelefono.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 220;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su teléfono")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 221;BA.debugLine="txtTelefono.RequestFocus";
Debug.ShouldStop(268435456);
main.mostCurrent._txttelefono.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 222;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 223;BA.debugLine="else if txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 224;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su dirección")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 225;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(1);
main.mostCurrent._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 226;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 227;BA.debugLine="else if txtUsuarioRegistro.Text.Trim.Length = 0 T";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtusuarioregistro.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 228;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su correo electrónico")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 229;BA.debugLine="txtUsuarioRegistro.RequestFocus";
Debug.ShouldStop(16);
main.mostCurrent._txtusuarioregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 230;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 231;BA.debugLine="else if txtContrasenaRegistro.Text.Trim.Length =";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtcontrasenaregistro.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 232;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su contraseña")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 233;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(256);
main.mostCurrent._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 234;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 235;BA.debugLine="else if txtContrasena2.Text.Trim.Length = 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtcontrasena2.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 236;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su contraseña nuevamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 237;BA.debugLine="txtContrasena2.RequestFocus";
Debug.ShouldStop(4096);
main.mostCurrent._txtcontrasena2.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 238;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 239;BA.debugLine="Else If txtContrasenaRegistro.Text <> txtContrase";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",main.mostCurrent._txtcontrasenaregistro.runMethod(true,"getText"),main.mostCurrent._txtcontrasena2.runMethod(true,"getText"))) { 
 BA.debugLineNum = 240;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Las contraseñas no coinciden.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 241;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(65536);
main.mostCurrent._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 242;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 }}}}}}}
;
 BA.debugLineNum = 245;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(1048576);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 246;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2097152);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 247;BA.debugLine="map.Initialize";
Debug.ShouldStop(4194304);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 248;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_nombre"))),(Object)((main.mostCurrent._txtnombre.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 249;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
Debug.ShouldStop(16777216);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_telefono"))),(Object)((main.mostCurrent._txttelefono.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 250;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
Debug.ShouldStop(33554432);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_direccion"))),(Object)((main.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 251;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
Debug.ShouldStop(67108864);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_email"))),(Object)((main.mostCurrent._txtusuarioregistro.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 252;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
Debug.ShouldStop(134217728);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_password"))),(Object)((main.mostCurrent._txtcontrasenaregistro.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 253;BA.debugLine="map.Put(\"f_latitud\",\"\")";
Debug.ShouldStop(268435456);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_latitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 254;BA.debugLine="map.Put(\"f_longitud\",\"\")";
Debug.ShouldStop(536870912);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_longitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 255;BA.debugLine="map.Put(\"f_idrecord\",0)";
Debug.ShouldStop(1073741824);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idrecord"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 256;BA.debugLine="json.Initialize(map)";
Debug.ShouldStop(-2147483648);
_json.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 258;BA.debugLine="Dim JobNewUser As HttpJob";
Debug.ShouldStop(2);
_jobnewuser = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobNewUser", _jobnewuser);
 BA.debugLineNum = 259;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
Debug.ShouldStop(4);
_jobnewuser.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("JobNewUser")),(Object)(main.getObject()));
 BA.debugLineNum = 260;BA.debugLine="JobNewUser.Tag = map";
Debug.ShouldStop(8);
_jobnewuser.setField ("_tag" /*RemoteObject*/ ,(_map.getObject()));
 BA.debugLineNum = 261;BA.debugLine="JobNewUser.PostString(url&\"ws/set_salvar_usuario\"";
Debug.ShouldStop(16);
_jobnewuser.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(main._url,RemoteObject.createImmutable("ws/set_salvar_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),main.mostCurrent._funcion.runMethod(true,"_crearjson2" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main._token),(Object)(_json.runMethod(true,"ToString"))))));
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("clearRegistro (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,290);
if (RapidSub.canDelegate("clearregistro")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","clearregistro");}
 BA.debugLineNum = 290;BA.debugLine="Sub clearRegistro";
Debug.ShouldStop(2);
 BA.debugLineNum = 292;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(8);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 293;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(16);
main.mostCurrent._txttelefono.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 294;BA.debugLine="txtDireccion.Text = \"\"";
Debug.ShouldStop(32);
main.mostCurrent._txtdireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 295;BA.debugLine="txtUsuarioRegistro.Text = \"\"";
Debug.ShouldStop(64);
main.mostCurrent._txtusuarioregistro.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 296;BA.debugLine="txtContrasenaRegistro.Text = \"\"";
Debug.ShouldStop(128);
main.mostCurrent._txtcontrasenaregistro.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 297;BA.debugLine="txtContrasena2.Text = \"\"";
Debug.ShouldStop(256);
main.mostCurrent._txtcontrasena2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 31;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 35;BA.debugLine="Private Label3 As B4XView";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private btnLogin As B4XView";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private Panel1 As B4XView";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private Panel2 As B4XView";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private PanelLogin As B4XView";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private txtContrasena As B4XView";
main.mostCurrent._txtcontrasena = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private txtUsuario As EditText";
main.mostCurrent._txtusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private ViewLogo As ImageView";
main.mostCurrent._viewlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Dim P As Phone";
main.mostCurrent._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 44;BA.debugLine="Dim PI As PhoneId";
main.mostCurrent._pi = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");
 //BA.debugLineNum = 47;BA.debugLine="Private btnRegistroClienteBack As B4XView";
main.mostCurrent._btnregistroclienteback = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private btnRegistroClienteRegistrarme As B4XView";
main.mostCurrent._btnregistroclienteregistrarme = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private PanelRegistroCliente As Panel";
main.mostCurrent._panelregistrocliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private txtContrasena2 As EditText";
main.mostCurrent._txtcontrasena2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private txtDireccion As EditText";
main.mostCurrent._txtdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private txtTelefono As EditText";
main.mostCurrent._txttelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private txtUsuarioRegistro As EditText";
main.mostCurrent._txtusuarioregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private txtContrasenaRegistro As EditText";
main.mostCurrent._txtcontrasenaregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private lblRegistrarme As Label";
main.mostCurrent._lblregistrarme = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private btnConfiguracion As B4XView";
main.mostCurrent._btnconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private txtURL As Label";
main.mostCurrent._txturl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private PanelConfiguracion As B4XView";
main.mostCurrent._panelconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,174);
if (RapidSub.canDelegate("jobdone")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 174;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 176;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 177;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
Debug.ShouldStop(65536);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(main._jobmsj)),(Object)(BA.ObjectToCharSequence(main._jobmsjtitle)),main.mostCurrent.activityBA);
 BA.debugLineNum = 178;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 181;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",main.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ ))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 182;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 185;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16777216);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 186;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(33554432);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 187;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(67108864);
_json.runVoidMethod ("Initialize",(Object)(main.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 188;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(134217728);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 190;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(536870912);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobLogin"),BA.ObjectToString("JobNewUser"))) {
case 0: {
 BA.debugLineNum = 193;BA.debugLine="token = map.Get(\"f_key\")";
Debug.ShouldStop(1);
main._token = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_key")))));
 BA.debugLineNum = 194;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(2);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 195;BA.debugLine="usersData.idUsuario = map.Get(\"f_idrecord\")";
Debug.ShouldStop(4);
main._usersdata.setField ("idUsuario" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 196;BA.debugLine="usersData.nombre = map.Get(\"f_nombre\")";
Debug.ShouldStop(8);
main._usersdata.setField ("nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 197;BA.debugLine="usersData.longitud = map.Get(\"f_longitud\")";
Debug.ShouldStop(16);
main._usersdata.setField ("longitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_longitud"))))));
 BA.debugLineNum = 198;BA.debugLine="usersData.latitud = map.Get(\"f_latitud\")";
Debug.ShouldStop(32);
main._usersdata.setField ("latitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_latitud"))))));
 BA.debugLineNum = 199;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(64);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._principal.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 203;BA.debugLine="map = Job.Tag";
Debug.ShouldStop(1024);
_map.setObject(_job.getField(false,"_tag" /*RemoteObject*/ ));
 BA.debugLineNum = 204;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
Debug.ShouldStop(2048);
main.mostCurrent._txtusuario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_email"))))));
 BA.debugLineNum = 205;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
Debug.ShouldStop(4096);
main.mostCurrent._txtcontrasena.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_password"))))));
 BA.debugLineNum = 206;BA.debugLine="btnRegistroClienteBack_Click";
Debug.ShouldStop(8192);
_btnregistroclienteback_click();
 BA.debugLineNum = 207;BA.debugLine="btnLogin_Click";
Debug.ShouldStop(16384);
_btnlogin_click();
 break; }
}
;
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("lblRegistrarme_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,284);
if (RapidSub.canDelegate("lblregistrarme_click")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","lblregistrarme_click");}
 BA.debugLineNum = 284;BA.debugLine="Sub lblRegistrarme_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="openRegistrarCliente";
Debug.ShouldStop(268435456);
_openregistrarcliente();
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openregistrarcliente() throws Exception{
try {
		Debug.PushSubsStack("openRegistrarCliente (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,266);
if (RapidSub.canDelegate("openregistrarcliente")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","openregistrarcliente");}
 BA.debugLineNum = 266;BA.debugLine="Sub openRegistrarCliente";
Debug.ShouldStop(512);
 BA.debugLineNum = 268;BA.debugLine="If PanelRegistroCliente.IsInitialized = False The";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",main.mostCurrent._panelregistrocliente.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 269;BA.debugLine="Activity.LoadLayout(\"frmRegistroCliente\")";
Debug.ShouldStop(4096);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmRegistroCliente")),main.mostCurrent.activityBA);
 BA.debugLineNum = 270;BA.debugLine="PanelRegistroCliente.Visible = False";
Debug.ShouldStop(8192);
main.mostCurrent._panelregistrocliente.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 273;BA.debugLine="funcion.DisableView(PanelRegistroCliente.Visible,";
Debug.ShouldStop(65536);
main.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._panelregistrocliente.runMethod(true,"getVisible")),(Object)(main.mostCurrent._panelregistrocliente));
 BA.debugLineNum = 274;BA.debugLine="funcion.DisableView(Not(PanelRegistroCliente.Visi";
Debug.ShouldStop(131072);
main.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._panelregistrocliente.runMethod(true,"getVisible")))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), main.mostCurrent._panellogin.getObject()));
 BA.debugLineNum = 275;BA.debugLine="PanelRegistroCliente.SetVisibleAnimated(300,Not(P";
Debug.ShouldStop(262144);
main.mostCurrent._panelregistrocliente.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._panelregistrocliente.runMethod(true,"getVisible")))));
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}

public static void initializeProcessGlobals() {
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        main_subs_0._process_globals();
starter_subs_0._process_globals();
principal_subs_0._process_globals();
funcion_subs_0._process_globals();
facturacion_subs_0._process_globals();
direcciones_subs_0._process_globals();
reporteordenes_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.menube.app.main");
starter.myClass = BA.getDeviceClass ("com.menube.app.starter");
principal.myClass = BA.getDeviceClass ("com.menube.app.principal");
funcion.myClass = BA.getDeviceClass ("com.menube.app.funcion");
slidemenu.myClass = BA.getDeviceClass ("com.menube.app.slidemenu");
facturacion.myClass = BA.getDeviceClass ("com.menube.app.facturacion");
direcciones.myClass = BA.getDeviceClass ("com.menube.app.direcciones");
reporteordenes.myClass = BA.getDeviceClass ("com.menube.app.reporteordenes");
anotherdatepicker.myClass = BA.getDeviceClass ("com.menube.app.anotherdatepicker");
httputils2service.myClass = BA.getDeviceClass ("com.menube.app.httputils2service");
httpjob.myClass = BA.getDeviceClass ("com.menube.app.httpjob");
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 17;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 22;BA.debugLine="Dim token As String";
main._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 23;BA.debugLine="Dim jobMsj As String = \"No se pudo conectar con e";
main._jobmsj = BA.ObjectToString("No se pudo conectar con el servidor. Compruebe su conexión a internet.");
 //BA.debugLineNum = 24;BA.debugLine="Dim jobMsjTitle As String = \"Problemas de conexió";
main._jobmsjtitle = BA.ObjectToString("Problemas de conexión.");
 //BA.debugLineNum = 25;BA.debugLine="Type typeU (idUsuario As Int, nombre As String, l";
;
 //BA.debugLineNum = 26;BA.debugLine="Dim usersData As typeU";
main._usersdata = RemoteObject.createNew ("com.menube.app.main._typeu");
 //BA.debugLineNum = 27;BA.debugLine="Dim SQL As SQL";
main._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 28;BA.debugLine="Dim url As String '= \"http://10.0.0.4:8089/menube";
main._url = RemoteObject.createImmutable("");
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updateurl() throws Exception{
try {
		Debug.PushSubsStack("updateURL (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,99);
if (RapidSub.canDelegate("updateurl")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","updateurl");}
 BA.debugLineNum = 99;BA.debugLine="Sub updateURL";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE t_preferencia SET f_url";
Debug.ShouldStop(8);
main._sql.runVoidMethod ("ExecNonQuery2",(Object)(BA.ObjectToString("UPDATE t_preferencia SET f_url = ?")),(Object)(main.mostCurrent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(main.mostCurrent._txturl.runMethod(true,"getText").runMethod(true,"trim"))})))));
 BA.debugLineNum = 101;BA.debugLine="url = txtURL.Text.Trim";
Debug.ShouldStop(16);
main._url = main.mostCurrent._txturl.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 102;BA.debugLine="ToastMessageShow(\"URL actializado\",False)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("URL actializado")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _url_animationend() throws Exception{
try {
		Debug.PushSubsStack("url_AnimationEnd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,105);
if (RapidSub.canDelegate("url_animationend")) { return com.menube.app.main.remoteMe.runUserSub(false, "main","url_animationend");}
 BA.debugLineNum = 105;BA.debugLine="Sub url_AnimationEnd";
Debug.ShouldStop(256);
 BA.debugLineNum = 107;BA.debugLine="If PanelConfiguracion.Tag < 0%x Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, main.mostCurrent._panelconfiguracion.runMethod(false,"getTag")),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 108;BA.debugLine="PanelConfiguracion.Top = -PanelConfiguracion.Hei";
Debug.ShouldStop(2048);
main.mostCurrent._panelconfiguracion.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + main.mostCurrent._panelconfiguracion.runMethod(true,"getHeight").<Integer>get().intValue())-(double) (0 + main.mostCurrent._btnconfiguracion.runMethod(true,"getTop").<Integer>get().intValue())));
 BA.debugLineNum = 109;BA.debugLine="updateURL";
Debug.ShouldStop(4096);
_updateurl();
 }else {
 BA.debugLineNum = 112;BA.debugLine="PanelConfiguracion.Top = btnConfiguracion.Top";
Debug.ShouldStop(32768);
main.mostCurrent._panelconfiguracion.runMethod(true,"setTop",main.mostCurrent._btnconfiguracion.runMethod(true,"getTop"));
 };
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}