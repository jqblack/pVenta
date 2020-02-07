package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class main_subs_0 {


public static void  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,75);
if (RapidSub.canDelegate("activity_create")) { com.jq.pedidos.main.remoteMe.runUserSub(false, "main","activity_create", _firsttime); return;}
ResumableSub_Activity_Create rsub = new ResumableSub_Activity_Create(null,_firsttime);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Activity_Create extends BA.ResumableSub {
public ResumableSub_Activity_Create(com.jq.pedidos.main parent,RemoteObject _firsttime) {
this.parent = parent;
this._firsttime = _firsttime;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.main parent;
RemoteObject _firsttime;
RemoteObject _rt = RemoteObject.declareNull("anywheresoftware.b4a.objects.RuntimePermissions");
RemoteObject _key = RemoteObject.createImmutable(0);
RemoteObject _permission = RemoteObject.createImmutable("");
RemoteObject _result = RemoteObject.createImmutable(false);
RemoteObject _cur = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,75);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 77;BA.debugLine="Dim rt  As RuntimePermissions";
Debug.ShouldStop(4096);
_rt = RemoteObject.createNew ("anywheresoftware.b4a.objects.RuntimePermissions");Debug.locals.put("rt", _rt);
 BA.debugLineNum = 78;BA.debugLine="Dim key As Int = 0";
Debug.ShouldStop(8192);
_key = BA.numberCast(int.class, 0);Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 80;BA.debugLine="Do While key < 1";
Debug.ShouldStop(32768);
if (true) break;

case 1:
//do while
this.state = 11;
while (RemoteObject.solveBoolean("<",_key,BA.numberCast(double.class, 1))) {
this.state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 85;BA.debugLine="rt.CheckAndRequest(rt.PERMISSION_READ_PHONE_STAT";
Debug.ShouldStop(1048576);
_rt.runVoidMethod ("CheckAndRequest",main.processBA,(Object)(_rt.getField(true,"PERMISSION_READ_PHONE_STATE")));
 BA.debugLineNum = 87;BA.debugLine="wait for Activity_PermissionResult(permission As";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("WaitFor","activity_permissionresult", main.processBA, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "activity_create"), null);
this.state = 15;
return;
case 15:
//C
this.state = 4;
_permission = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(0));Debug.locals.put("permission", _permission);
_result = (RemoteObject) result.getArrayElement(true,RemoteObject.createImmutable(1));Debug.locals.put("result", _result);
;
 BA.debugLineNum = 89;BA.debugLine="If result Then";
Debug.ShouldStop(16777216);
if (true) break;

case 4:
//if
this.state = 7;
if (_result.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 90;BA.debugLine="key = 2";
Debug.ShouldStop(33554432);
_key = BA.numberCast(int.class, 2);Debug.locals.put("key", _key);
 if (true) break;
;
 BA.debugLineNum = 93;BA.debugLine="If result == False Then";
Debug.ShouldStop(268435456);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_result,parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 95;BA.debugLine="Msgbox(\"You should accept this permisson for t";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("You should accept this permisson for to use this App. / Debe aceptar este permiso para usar la aplicación")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Warning! / Aviso!"))),main.mostCurrent.activityBA);
 if (true) break;

case 10:
//C
this.state = 1;
;
 if (true) break;
;
 BA.debugLineNum = 102;BA.debugLine="If File.Exists(rt.GetSafeDirDefaultExternal(\"\"),";
Debug.ShouldStop(32);

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",parent.mostCurrent.__c.getField(false,"File").runMethod(true,"Exists",(Object)(_rt.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("db.db"))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 103;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", rt.GetSafeDir";
Debug.ShouldStop(64);
parent.mostCurrent.__c.getField(false,"File").runVoidMethod ("Copy",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(_rt.runMethod(true,"GetSafeDirDefaultExternal",(Object)(RemoteObject.createImmutable("")))),(Object)(RemoteObject.createImmutable("db.db")));
 if (true) break;

case 14:
//C
this.state = -1;
;
 BA.debugLineNum = 105;BA.debugLine="SQL.Initialize(File.DirDefaultExternal,\"db.db\", T";
Debug.ShouldStop(256);
parent._sql.runVoidMethod ("Initialize",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirDefaultExternal")),(Object)(BA.ObjectToString("db.db")),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 107;BA.debugLine="Dim cur As Cursor";
Debug.ShouldStop(1024);
_cur = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");Debug.locals.put("cur", _cur);
 BA.debugLineNum = 108;BA.debugLine="cur = SQL.ExecQuery(\"SELECT * FROM t_preferencia\"";
Debug.ShouldStop(2048);
_cur.setObject(parent._sql.runMethod(false,"ExecQuery",(Object)(RemoteObject.createImmutable("SELECT * FROM t_preferencia"))));
 BA.debugLineNum = 109;BA.debugLine="cur.Position = 0";
Debug.ShouldStop(4096);
_cur.runMethod(true,"setPosition",BA.numberCast(int.class, 0));
 BA.debugLineNum = 110;BA.debugLine="url = cur.GetString(\"f_url\")";
Debug.ShouldStop(8192);
parent._url = _cur.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("f_url")));
 BA.debugLineNum = 111;BA.debugLine="imei=PI.GetDeviceId";
Debug.ShouldStop(16384);
parent._imei = parent.mostCurrent._pi.runMethod(true,"GetDeviceId");
 BA.debugLineNum = 112;BA.debugLine="Msgbox(url,\"\")";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(parent._url)),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),main.mostCurrent.activityBA);
 BA.debugLineNum = 113;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((parent.mostCurrent._principal.getObject())));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _activity_permissionresult(RemoteObject _permission,RemoteObject _result) throws Exception{
}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,175);
if (RapidSub.canDelegate("activity_pause")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 175;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Resume (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,164);
if (RapidSub.canDelegate("activity_resume")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","activity_resume");}
 BA.debugLineNum = 164;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 167;BA.debugLine="If mostar Then";
Debug.ShouldStop(64);
if (main._mostar.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="Activity.LoadLayout(\"frmLogin\")";
Debug.ShouldStop(128);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmLogin")),main.mostCurrent.activityBA);
 BA.debugLineNum = 169;BA.debugLine="PanelConfiguracion.Top = -PanelConfiguracion.Hei";
Debug.ShouldStop(256);
main.mostCurrent._panelconfiguracion.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + main.mostCurrent._panelconfiguracion.runMethod(true,"getHeight").<Integer>get().intValue())-(double) (0 + main.mostCurrent._btnconfiguracion.runMethod(true,"getTop").<Integer>get().intValue())));
 BA.debugLineNum = 170;BA.debugLine="txtURL.Text = url";
Debug.ShouldStop(512);
main.mostCurrent._txturl.runMethod(true,"setText",BA.ObjectToCharSequence(main._url));
 };
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btnConfiguracion_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,129);
if (RapidSub.canDelegate("btnconfiguracion_click")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","btnconfiguracion_click");}
RemoteObject _posicion = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 129;BA.debugLine="Sub btnConfiguracion_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 131;BA.debugLine="Dim posicion As Int = PanelConfiguracion.Height +";
Debug.ShouldStop(4);
_posicion = RemoteObject.solve(new RemoteObject[] {main.mostCurrent._panelconfiguracion.runMethod(true,"getHeight"),main.mostCurrent._btnconfiguracion.runMethod(true,"getTop"),main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),main.mostCurrent.activityBA)}, "++",2, 1);Debug.locals.put("posicion", _posicion);Debug.locals.put("posicion", _posicion);
 BA.debugLineNum = 132;BA.debugLine="If PanelConfiguracion.Top > 0%y Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",main.mostCurrent._panelconfiguracion.runMethod(true,"getTop"),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 133;BA.debugLine="posicion = -posicion";
Debug.ShouldStop(16);
_posicion = BA.numberCast(int.class, -(double) (0 + _posicion.<Integer>get().intValue()));Debug.locals.put("posicion", _posicion);
 };
 BA.debugLineNum = 136;BA.debugLine="PanelConfiguracion.Tag = posicion";
Debug.ShouldStop(128);
main.mostCurrent._panelconfiguracion.runMethod(false,"setTag",(_posicion));
 BA.debugLineNum = 137;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(256);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 138;BA.debugLine="a.InitializeTranslate(\"url\",0,0,0,posicion)";
Debug.ShouldStop(512);
_a.runVoidMethod ("InitializeTranslate",main.mostCurrent.activityBA,(Object)(BA.ObjectToString("url")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _posicion)));
 BA.debugLineNum = 139;BA.debugLine="a.Duration = 300";
Debug.ShouldStop(1024);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, 300));
 BA.debugLineNum = 140;BA.debugLine="a.Start(PanelConfiguracion)";
Debug.ShouldStop(2048);
_a.runVoidMethod ("Start",(Object)((main.mostCurrent._panelconfiguracion.getObject())));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("btnLogin_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,180);
if (RapidSub.canDelegate("btnlogin_click")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","btnlogin_click");}
RemoteObject _url2 = RemoteObject.createImmutable("");
RemoteObject _dato = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.createImmutable("");
RemoteObject _banda = RemoteObject.createImmutable("");
RemoteObject _operadora = RemoteObject.createImmutable("");
RemoteObject _joblogin = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 180;BA.debugLine="Sub btnLogin_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 187;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtcontrasena.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",main.mostCurrent._txtusuario.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 188;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Faltan datos por ingresar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),main.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 190;BA.debugLine="ToastMessageShow(\"Conectando..\",False)";
Debug.ShouldStop(536870912);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Conectando..")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 191;BA.debugLine="Dim url2 As String";
Debug.ShouldStop(1073741824);
_url2 = RemoteObject.createImmutable("");Debug.locals.put("url2", _url2);
 BA.debugLineNum = 192;BA.debugLine="Dim dato As String";
Debug.ShouldStop(-2147483648);
_dato = RemoteObject.createImmutable("");Debug.locals.put("dato", _dato);
 BA.debugLineNum = 193;BA.debugLine="Dim data As String";
Debug.ShouldStop(1);
_data = RemoteObject.createImmutable("");Debug.locals.put("data", _data);
 BA.debugLineNum = 194;BA.debugLine="Dim banda As String";
Debug.ShouldStop(2);
_banda = RemoteObject.createImmutable("");Debug.locals.put("banda", _banda);
 BA.debugLineNum = 196;BA.debugLine="Dim operadora As String";
Debug.ShouldStop(8);
_operadora = RemoteObject.createImmutable("");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 198;BA.debugLine="operadora=P.GetNetworkOperatorName";
Debug.ShouldStop(32);
_operadora = main.mostCurrent._p.runMethod(true,"GetNetworkOperatorName");Debug.locals.put("operadora", _operadora);
 BA.debugLineNum = 199;BA.debugLine="banda=P.GetPhoneType";
Debug.ShouldStop(64);
_banda = main.mostCurrent._p.runMethod(true,"GetPhoneType");Debug.locals.put("banda", _banda);
 BA.debugLineNum = 201;BA.debugLine="If operadora = \"Null\" Or operadora = \"\"   Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_operadora,BA.ObjectToString("Null")) || RemoteObject.solveBoolean("=",_operadora,BA.ObjectToString(""))) { 
 BA.debugLineNum = 202;BA.debugLine="operadora=\"0\"";
Debug.ShouldStop(512);
_operadora = BA.ObjectToString("0");Debug.locals.put("operadora", _operadora);
 };
 BA.debugLineNum = 205;BA.debugLine="If imei= \"\"  Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",main._imei,BA.ObjectToString(""))) { 
 BA.debugLineNum = 206;BA.debugLine="imei=P.GetSettings(\"android_id\")";
Debug.ShouldStop(8192);
main._imei = main.mostCurrent._p.runMethod(true,"GetSettings",(Object)(RemoteObject.createImmutable("android_id")));
 };
 BA.debugLineNum = 209;BA.debugLine="If banda= \"\"  Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_banda,BA.ObjectToString(""))) { 
 BA.debugLineNum = 210;BA.debugLine="banda=\"0\"";
Debug.ShouldStop(131072);
_banda = BA.ObjectToString("0");Debug.locals.put("banda", _banda);
 };
 BA.debugLineNum = 214;BA.debugLine="data = \"'f_modelo':'\"&P.Model& \" - \"&P.Manufactu";
Debug.ShouldStop(2097152);
_data = RemoteObject.concat(RemoteObject.createImmutable("'f_modelo':'"),main.mostCurrent._p.runMethod(true,"getModel"),RemoteObject.createImmutable(" - "),main.mostCurrent._p.runMethod(true,"getManufacturer"),RemoteObject.createImmutable("','f_banda':'"),_banda,RemoteObject.createImmutable("', 'f_operadora': '"),_operadora,RemoteObject.createImmutable("','f_tamano':"),main.mostCurrent._funcion.runMethod(true,"_getdevicephysicalsize" /*RemoteObject*/ ,main.mostCurrent.activityBA),RemoteObject.createImmutable(","),RemoteObject.createImmutable("'f_imei':'"),main._imei,RemoteObject.createImmutable("','f_usuario':'"),main.mostCurrent._txtusuario.runMethod(true,"getText").runMethod(true,"trim"),RemoteObject.createImmutable("','f_contrasena':'"),main.mostCurrent._txtcontrasena.runMethod(true,"getText").runMethod(true,"trim"),RemoteObject.createImmutable("'"));Debug.locals.put("data", _data);
 BA.debugLineNum = 217;BA.debugLine="dato=funcion.crearJson(\"none\",data)";
Debug.ShouldStop(16777216);
_dato = main.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(BA.ObjectToString("none")),(Object)(_data));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 218;BA.debugLine="url2 = url & \"login/login/\"";
Debug.ShouldStop(33554432);
_url2 = RemoteObject.concat(main._url,RemoteObject.createImmutable("login/login/"));Debug.locals.put("url2", _url2);
 BA.debugLineNum = 220;BA.debugLine="Dim JobLogin As HttpJob";
Debug.ShouldStop(134217728);
_joblogin = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobLogin", _joblogin);
 BA.debugLineNum = 221;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
Debug.ShouldStop(268435456);
_joblogin.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("JobLogin")),(Object)(main.getObject()));
 BA.debugLineNum = 222;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
Debug.ShouldStop(536870912);
_joblogin.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(_url2),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),_dato)));
 };
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnMenuPrincipal_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,404);
if (RapidSub.canDelegate("btnmenuprincipal_click")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","btnmenuprincipal_click");}
 BA.debugLineNum = 404;BA.debugLine="Sub btnMenuPrincipal_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 406;BA.debugLine="If Principal.loadagain Then";
Debug.ShouldStop(2097152);
if (main.mostCurrent._principal._loadagain /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 407;BA.debugLine="cargaragain = True";
Debug.ShouldStop(4194304);
main._cargaragain = main.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 410;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(33554432);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._principal.getObject())));
 BA.debugLineNum = 412;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("btnRegistroClienteBack_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,379);
if (RapidSub.canDelegate("btnregistroclienteback_click")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","btnregistroclienteback_click");}
 BA.debugLineNum = 379;BA.debugLine="Sub btnRegistroClienteBack_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 381;BA.debugLine="clearRegistro";
Debug.ShouldStop(268435456);
_clearregistro();
 BA.debugLineNum = 382;BA.debugLine="funcion.DisableView(False,PanelLogin)";
Debug.ShouldStop(536870912);
main.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent.__c.getField(true,"False")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), main.mostCurrent._panellogin.getObject()));
 BA.debugLineNum = 383;BA.debugLine="PanelRegistroCliente.SetVisibleAnimated(250,False";
Debug.ShouldStop(1073741824);
main.mostCurrent._panelregistrocliente.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 384;BA.debugLine="PanelLogin.SetVisibleAnimated(250,True)";
Debug.ShouldStop(-2147483648);
main.mostCurrent._panellogin.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(main.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("btnRegistroClienteRegistrarme_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,313);
if (RapidSub.canDelegate("btnregistroclienteregistrarme_click")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","btnregistroclienteregistrarme_click");}
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _jobnewuser = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 313;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 315;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtnombre.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 316;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
Debug.ShouldStop(134217728);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su nombre")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 317;BA.debugLine="txtNombre.RequestFocus";
Debug.ShouldStop(268435456);
main.mostCurrent._txtnombre.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 318;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 319;BA.debugLine="Else if txtTelefono.Text.Trim.Length = 0 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txttelefono.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 320;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
Debug.ShouldStop(-2147483648);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su teléfono")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 321;BA.debugLine="txtTelefono.RequestFocus";
Debug.ShouldStop(1);
main.mostCurrent._txttelefono.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 322;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 323;BA.debugLine="else if txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 324;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
Debug.ShouldStop(8);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su dirección")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 325;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(16);
main.mostCurrent._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 326;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 327;BA.debugLine="else if txtUsuarioRegistro.Text.Trim.Length = 0 T";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtusuarioregistro.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 328;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
Debug.ShouldStop(128);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su correo electrónico")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 329;BA.debugLine="txtUsuarioRegistro.RequestFocus";
Debug.ShouldStop(256);
main.mostCurrent._txtusuarioregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 330;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 331;BA.debugLine="else if txtContrasenaRegistro.Text.Trim.Length =";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtcontrasenaregistro.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 332;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su contraseña")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 333;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(4096);
main.mostCurrent._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 334;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 335;BA.debugLine="else if txtContrasena2.Text.Trim.Length = 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",main.mostCurrent._txtcontrasena2.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 336;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca su contraseña nuevamente")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 337;BA.debugLine="txtContrasena2.RequestFocus";
Debug.ShouldStop(65536);
main.mostCurrent._txtcontrasena2.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 338;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 339;BA.debugLine="Else If txtContrasenaRegistro.Text <> txtContrase";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",main.mostCurrent._txtcontrasenaregistro.runMethod(true,"getText"),main.mostCurrent._txtcontrasena2.runMethod(true,"getText"))) { 
 BA.debugLineNum = 340;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Las contraseñas no coinciden.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),main.mostCurrent.activityBA);
 BA.debugLineNum = 341;BA.debugLine="txtContrasenaRegistro.RequestFocus";
Debug.ShouldStop(1048576);
main.mostCurrent._txtcontrasenaregistro.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 342;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 }}}}}}}
;
 BA.debugLineNum = 345;BA.debugLine="Dim json As JSONGenerator";
Debug.ShouldStop(16777216);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator");Debug.locals.put("json", _json);
 BA.debugLineNum = 346;BA.debugLine="Dim map As Map";
Debug.ShouldStop(33554432);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 347;BA.debugLine="map.Initialize";
Debug.ShouldStop(67108864);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 348;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
Debug.ShouldStop(134217728);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_nombre"))),(Object)((main.mostCurrent._txtnombre.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 349;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
Debug.ShouldStop(268435456);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_telefono"))),(Object)((main.mostCurrent._txttelefono.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 350;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
Debug.ShouldStop(536870912);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_direccion"))),(Object)((main.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 351;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
Debug.ShouldStop(1073741824);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_email"))),(Object)((main.mostCurrent._txtusuarioregistro.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 352;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
Debug.ShouldStop(-2147483648);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_password"))),(Object)((main.mostCurrent._txtcontrasenaregistro.runMethod(true,"getText").runMethod(true,"trim"))));
 BA.debugLineNum = 353;BA.debugLine="map.Put(\"f_latitud\",\"\")";
Debug.ShouldStop(1);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_latitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 354;BA.debugLine="map.Put(\"f_longitud\",\"\")";
Debug.ShouldStop(2);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_longitud"))),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 355;BA.debugLine="map.Put(\"f_idrecord\",0)";
Debug.ShouldStop(4);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idrecord"))),(Object)(RemoteObject.createImmutable((0))));
 BA.debugLineNum = 356;BA.debugLine="json.Initialize(map)";
Debug.ShouldStop(8);
_json.runVoidMethod ("Initialize",(Object)(_map));
 BA.debugLineNum = 358;BA.debugLine="Dim JobNewUser As HttpJob";
Debug.ShouldStop(32);
_jobnewuser = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobNewUser", _jobnewuser);
 BA.debugLineNum = 359;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
Debug.ShouldStop(64);
_jobnewuser.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("JobNewUser")),(Object)(main.getObject()));
 BA.debugLineNum = 360;BA.debugLine="JobNewUser.Tag = map";
Debug.ShouldStop(128);
_jobnewuser.setField ("_tag" /*RemoteObject*/ ,(_map.getObject()));
 BA.debugLineNum = 361;BA.debugLine="JobNewUser.PostString(url&\"ws/set_salvar_usuario\"";
Debug.ShouldStop(256);
_jobnewuser.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(main._url,RemoteObject.createImmutable("ws/set_salvar_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),main.mostCurrent._funcion.runMethod(true,"_crearjson2" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main._token),(Object)(_json.runMethod(true,"ToString"))))));
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("clearRegistro (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,393);
if (RapidSub.canDelegate("clearregistro")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","clearregistro");}
 BA.debugLineNum = 393;BA.debugLine="Sub clearRegistro";
Debug.ShouldStop(256);
 BA.debugLineNum = 395;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(1024);
main.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 396;BA.debugLine="txtTelefono.Text = \"\"";
Debug.ShouldStop(2048);
main.mostCurrent._txttelefono.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 397;BA.debugLine="txtDireccion.Text = \"\"";
Debug.ShouldStop(4096);
main.mostCurrent._txtdireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 398;BA.debugLine="txtUsuarioRegistro.Text = \"\"";
Debug.ShouldStop(8192);
main.mostCurrent._txtusuarioregistro.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 399;BA.debugLine="txtContrasenaRegistro.Text = \"\"";
Debug.ShouldStop(16384);
main.mostCurrent._txtcontrasenaregistro.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 400;BA.debugLine="txtContrasena2.Text = \"\"";
Debug.ShouldStop(32768);
main.mostCurrent._txtcontrasena2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 42;BA.debugLine="Private Label3 As B4XView";
main.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private btnLogin As B4XView";
main.mostCurrent._btnlogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private Panel1 As B4XView";
main.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Panel2 As B4XView";
main.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private PanelLogin As B4XView";
main.mostCurrent._panellogin = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private txtContrasena As B4XView";
main.mostCurrent._txtcontrasena = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private txtUsuario As EditText";
main.mostCurrent._txtusuario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private ViewLogo As ImageView";
main.mostCurrent._viewlogo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Dim P As Phone";
main.mostCurrent._p = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone");
 //BA.debugLineNum = 51;BA.debugLine="Dim PI As PhoneId";
main.mostCurrent._pi = RemoteObject.createNew ("anywheresoftware.b4a.phone.Phone.PhoneId");
 //BA.debugLineNum = 54;BA.debugLine="Private btnRegistroClienteBack As B4XView";
main.mostCurrent._btnregistroclienteback = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private btnRegistroClienteRegistrarme As B4XView";
main.mostCurrent._btnregistroclienteregistrarme = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private PanelRegistroCliente As Panel";
main.mostCurrent._panelregistrocliente = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private txtContrasena2 As EditText";
main.mostCurrent._txtcontrasena2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private txtDireccion As EditText";
main.mostCurrent._txtdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private txtNombre As EditText";
main.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private txtTelefono As EditText";
main.mostCurrent._txttelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private txtUsuarioRegistro As EditText";
main.mostCurrent._txtusuarioregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private txtContrasenaRegistro As EditText";
main.mostCurrent._txtcontrasenaregistro = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private lblRegistrarme As Label";
main.mostCurrent._lblregistrarme = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private btnConfiguracion As B4XView";
main.mostCurrent._btnconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private txtURL As Label";
main.mostCurrent._txturl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private PanelConfiguracion As B4XView";
main.mostCurrent._panelconfiguracion = RemoteObject.createNew ("anywheresoftware.b4a.objects.B4XViewWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private btnMenuPrincipal As Button";
main.mostCurrent._btnmenuprincipal = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private btnIniciarSecion As Button";
main.mostCurrent._btniniciarsecion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 72;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,242);
if (RapidSub.canDelegate("jobdone")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 242;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 244;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 245;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
Debug.ShouldStop(1048576);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(main._jobmsj)),(Object)(BA.ObjectToCharSequence(main._jobmsjtitle)),main.mostCurrent.activityBA);
 BA.debugLineNum = 246;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 249;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",main.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ ))),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 250;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 253;BA.debugLine="Dim map As Map";
Debug.ShouldStop(268435456);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 254;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 255;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(main.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 256;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(-2147483648);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 258;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobLogin"),BA.ObjectToString("JobNewUser"),BA.ObjectToString("pasarProductosCarrito"))) {
case 0: {
 BA.debugLineNum = 261;BA.debugLine="token = map.Get(\"f_key\")";
Debug.ShouldStop(16);
main._token = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_key")))));
 BA.debugLineNum = 262;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(32);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 263;BA.debugLine="usersData.idUsuario = map.Get(\"f_idrecord\")";
Debug.ShouldStop(64);
main._usersdata.setField ("idUsuario" /*RemoteObject*/ ,BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 264;BA.debugLine="usersData.nombre = map.Get(\"f_nombre\")";
Debug.ShouldStop(128);
main._usersdata.setField ("nombre" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 265;BA.debugLine="usersData.longitud = map.Get(\"f_longitud\")";
Debug.ShouldStop(256);
main._usersdata.setField ("longitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_longitud"))))));
 BA.debugLineNum = 266;BA.debugLine="usersData.latitud = map.Get(\"f_latitud\")";
Debug.ShouldStop(512);
main._usersdata.setField ("latitud" /*RemoteObject*/ ,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_latitud"))))));
 BA.debugLineNum = 269;BA.debugLine="ToastMessageShow(\"Bienvenido/a\",False)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Bienvenido/a")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 270;BA.debugLine="txtUsuario.Text = \"\"";
Debug.ShouldStop(8192);
main.mostCurrent._txtusuario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 271;BA.debugLine="txtContrasena.Text = \"\"";
Debug.ShouldStop(16384);
main.mostCurrent._txtcontrasena.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 273;BA.debugLine="If Principal.loadagain Then";
Debug.ShouldStop(65536);
if (main.mostCurrent._principal._loadagain /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 274;BA.debugLine="cargaragain = True";
Debug.ShouldStop(131072);
main._cargaragain = main.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 277;BA.debugLine="logged = True";
Debug.ShouldStop(1048576);
main._logged = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 278;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(2097152);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._principal.getObject())));
 break; }
case 1: {
 BA.debugLineNum = 282;BA.debugLine="map = Job.Tag";
Debug.ShouldStop(33554432);
_map.setObject(_job.getField(false,"_tag" /*RemoteObject*/ ));
 BA.debugLineNum = 283;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
Debug.ShouldStop(67108864);
main.mostCurrent._txtusuario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_email"))))));
 BA.debugLineNum = 284;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
Debug.ShouldStop(134217728);
main.mostCurrent._txtcontrasena.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_password"))))));
 BA.debugLineNum = 285;BA.debugLine="btnRegistroClienteBack_Click";
Debug.ShouldStop(268435456);
_btnregistroclienteback_click();
 BA.debugLineNum = 286;BA.debugLine="btnLogin_Click";
Debug.ShouldStop(536870912);
_btnlogin_click();
 break; }
case 2: {
 BA.debugLineNum = 290;BA.debugLine="If map.Get(\"f_data\") == 1  Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))),RemoteObject.createImmutable((1)))) { 
 BA.debugLineNum = 292;BA.debugLine="logged = True";
Debug.ShouldStop(8);
main._logged = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 293;BA.debugLine="ToastMessageShow(\"Cargando su carrito\",False)";
Debug.ShouldStop(16);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cargando su carrito")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 294;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(32);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._principal.getObject())));
 }else {
 BA.debugLineNum = 297;BA.debugLine="If map.Get(\"f_data\") == 2  Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))),RemoteObject.createImmutable((2)))) { 
 BA.debugLineNum = 299;BA.debugLine="logged = True";
Debug.ShouldStop(1024);
main._logged = main.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 300;BA.debugLine="ToastMessageShow(\"Bienvenido/a\",False)";
Debug.ShouldStop(2048);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Bienvenido/a")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 301;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(4096);
main.mostCurrent.__c.runVoidMethod ("StartActivity",main.processBA,(Object)((main.mostCurrent._principal.getObject())));
 }else {
 BA.debugLineNum = 304;BA.debugLine="Msgbox(\"Hubo algun tipo de error en la trasac";
Debug.ShouldStop(32768);
main.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Hubo algun tipo de error en la trasaccion de sus productos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Advertencia"))),main.mostCurrent.activityBA);
 };
 };
 break; }
}
;
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("lblRegistrarme_Click (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,387);
if (RapidSub.canDelegate("lblregistrarme_click")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","lblregistrarme_click");}
 BA.debugLineNum = 387;BA.debugLine="Sub lblRegistrarme_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="openRegistrarCliente";
Debug.ShouldStop(8);
_openregistrarcliente();
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("openRegistrarCliente (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,366);
if (RapidSub.canDelegate("openregistrarcliente")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","openregistrarcliente");}
 BA.debugLineNum = 366;BA.debugLine="Sub openRegistrarCliente";
Debug.ShouldStop(8192);
 BA.debugLineNum = 368;BA.debugLine="If PanelRegistroCliente.IsInitialized = False The";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",main.mostCurrent._panelregistrocliente.runMethod(true,"IsInitialized"),main.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 369;BA.debugLine="Activity.LoadLayout(\"frmRegistroCliente\")";
Debug.ShouldStop(65536);
main.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmRegistroCliente")),main.mostCurrent.activityBA);
 BA.debugLineNum = 370;BA.debugLine="PanelRegistroCliente.Visible = False";
Debug.ShouldStop(131072);
main.mostCurrent._panelregistrocliente.runMethod(true,"setVisible",main.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 373;BA.debugLine="funcion.DisableView(PanelRegistroCliente.Visible,";
Debug.ShouldStop(1048576);
main.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent._panelregistrocliente.runMethod(true,"getVisible")),(Object)(main.mostCurrent._panelregistrocliente));
 BA.debugLineNum = 374;BA.debugLine="funcion.DisableView(Not(PanelRegistroCliente.Visi";
Debug.ShouldStop(2097152);
main.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._panelregistrocliente.runMethod(true,"getVisible")))),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), main.mostCurrent._panellogin.getObject()));
 BA.debugLineNum = 375;BA.debugLine="PanelRegistroCliente.SetVisibleAnimated(300,Not(P";
Debug.ShouldStop(4194304);
main.mostCurrent._panelregistrocliente.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(main.mostCurrent.__c.runMethod(true,"Not",(Object)(main.mostCurrent._panelregistrocliente.runMethod(true,"getVisible")))));
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepararcarrito() throws Exception{
try {
		Debug.PushSubsStack("prepararCarrito (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,227);
if (RapidSub.canDelegate("prepararcarrito")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","prepararcarrito");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobcarro = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 227;BA.debugLine="Sub prepararCarrito";
Debug.ShouldStop(4);
 BA.debugLineNum = 229;BA.debugLine="Dim json As String";
Debug.ShouldStop(16);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 230;BA.debugLine="json = \"'f_regresa':false\"& _ 		   \",'f_idempresa";
Debug.ShouldStop(32);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),main.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_imei':"),main._imei);Debug.locals.put("json", _json);
 BA.debugLineNum = 234;BA.debugLine="Dim Jobcarro As HttpJob";
Debug.ShouldStop(512);
_jobcarro = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("Jobcarro", _jobcarro);
 BA.debugLineNum = 235;BA.debugLine="Jobcarro.Initialize(\"pasarProductosCarrito\",Me)";
Debug.ShouldStop(1024);
_jobcarro.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,main.processBA,(Object)(BA.ObjectToString("pasarProductosCarrito")),(Object)(main.getObject()));
 BA.debugLineNum = 236;BA.debugLine="Jobcarro.PostString(url&\"puntoventa/pass_producto";
Debug.ShouldStop(2048);
_jobcarro.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(main._url,RemoteObject.createImmutable("puntoventa/pass_productos_temporales_by_key"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),main.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,main.mostCurrent.activityBA,(Object)(main._token),(Object)(_json)))));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
categoria_subs_0._process_globals();
perfil_subs_0._process_globals();
httputils2service_subs_0._process_globals();
main.myClass = BA.getDeviceClass ("com.jq.pedidos.main");
starter.myClass = BA.getDeviceClass ("com.jq.pedidos.starter");
principal.myClass = BA.getDeviceClass ("com.jq.pedidos.principal");
funcion.myClass = BA.getDeviceClass ("com.jq.pedidos.funcion");
slidemenu.myClass = BA.getDeviceClass ("com.jq.pedidos.slidemenu");
facturacion.myClass = BA.getDeviceClass ("com.jq.pedidos.facturacion");
direcciones.myClass = BA.getDeviceClass ("com.jq.pedidos.direcciones");
reporteordenes.myClass = BA.getDeviceClass ("com.jq.pedidos.reporteordenes");
anotherdatepicker.myClass = BA.getDeviceClass ("com.jq.pedidos.anotherdatepicker");
categoria.myClass = BA.getDeviceClass ("com.jq.pedidos.categoria");
perfil.myClass = BA.getDeviceClass ("com.jq.pedidos.perfil");
httputils2service.myClass = BA.getDeviceClass ("com.jq.pedidos.httputils2service");
httpjob.myClass = BA.getDeviceClass ("com.jq.pedidos.httpjob");
		
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
main._usersdata = RemoteObject.createNew ("com.jq.pedidos.main._typeu");
 //BA.debugLineNum = 27;BA.debugLine="Dim SQL As SQL";
main._sql = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL");
 //BA.debugLineNum = 28;BA.debugLine="Dim url As String '= \"http://10.0.0.4:8089/menube";
main._url = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim logged As Boolean = False";
main._logged = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 32;BA.debugLine="Dim tokenPublico As String = \"dbea1e74de894c3a37f";
main._tokenpublico = BA.ObjectToString("dbea1e74de894c3a37f4696a10ed6dd7");
 //BA.debugLineNum = 33;BA.debugLine="Dim  imei As String";
main._imei = RemoteObject.createImmutable("");
 //BA.debugLineNum = 34;BA.debugLine="Dim mostar As Boolean = False";
main._mostar = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 35;BA.debugLine="Dim cargaragain As Boolean = False";
main._cargaragain = main.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _updateurl() throws Exception{
try {
		Debug.PushSubsStack("updateURL (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,144);
if (RapidSub.canDelegate("updateurl")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","updateurl");}
 BA.debugLineNum = 144;BA.debugLine="Sub updateURL";
Debug.ShouldStop(32768);
 BA.debugLineNum = 146;BA.debugLine="SQL.ExecNonQuery(\"UPDATE t_preferencia SET f_url";
Debug.ShouldStop(131072);
main._sql.runVoidMethod ("ExecNonQuery",(Object)(RemoteObject.concat(RemoteObject.createImmutable("UPDATE t_preferencia SET f_url = '"),main.mostCurrent._txturl.runMethod(true,"getText").runMethod(true,"trim"),RemoteObject.createImmutable("' where f_idrecord = 1"))));
 BA.debugLineNum = 147;BA.debugLine="url = txtURL.Text.Trim";
Debug.ShouldStop(262144);
main._url = main.mostCurrent._txturl.runMethod(true,"getText").runMethod(true,"trim");
 BA.debugLineNum = 148;BA.debugLine="ToastMessageShow(\"URL actializado\",False)";
Debug.ShouldStop(524288);
main.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("URL actializado")),(Object)(main.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("url_AnimationEnd (main) ","main",0,main.mostCurrent.activityBA,main.mostCurrent,151);
if (RapidSub.canDelegate("url_animationend")) { return com.jq.pedidos.main.remoteMe.runUserSub(false, "main","url_animationend");}
 BA.debugLineNum = 151;BA.debugLine="Sub url_AnimationEnd";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="If PanelConfiguracion.Tag < 0%x Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, main.mostCurrent._panelconfiguracion.runMethod(false,"getTag")),BA.numberCast(double.class, main.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),main.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 154;BA.debugLine="PanelConfiguracion.Top = -PanelConfiguracion.Hei";
Debug.ShouldStop(33554432);
main.mostCurrent._panelconfiguracion.runMethod(true,"setTop",BA.numberCast(int.class, -(double) (0 + main.mostCurrent._panelconfiguracion.runMethod(true,"getHeight").<Integer>get().intValue())-(double) (0 + main.mostCurrent._btnconfiguracion.runMethod(true,"getTop").<Integer>get().intValue())));
 BA.debugLineNum = 155;BA.debugLine="updateURL";
Debug.ShouldStop(67108864);
_updateurl();
 }else {
 BA.debugLineNum = 158;BA.debugLine="PanelConfiguracion.Top = btnConfiguracion.Top";
Debug.ShouldStop(536870912);
main.mostCurrent._panelconfiguracion.runMethod(true,"setTop",main.mostCurrent._btnconfiguracion.runMethod(true,"getTop"));
 };
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}