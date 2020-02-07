package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_perfil_subs_0 {


public static RemoteObject  _btnbackchangepass_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackChangePass_Click (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,199);
if (RapidSub.canDelegate("btnbackchangepass_click")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","btnbackchangepass_click");}
 BA.debugLineNum = 199;BA.debugLine="Sub btnBackChangePass_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 200;BA.debugLine="PanelFondoModalpass.SetAlphaAnimated(500,0)";
Debug.ShouldStop(128);
b4i_perfil._panelfondomodalpass.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnchangepass_click() throws Exception{
try {
		Debug.PushSubsStack("btnChangePass_Click (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,152);
if (RapidSub.canDelegate("btnchangepass_click")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","btnchangepass_click");}
 BA.debugLineNum = 152;BA.debugLine="Sub btnChangePass_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="PanelFondoModalpass.Left = 0%x";
Debug.ShouldStop(16777216);
b4i_perfil._panelfondomodalpass.runMethod(true,"setLeft:",b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 154;BA.debugLine="PanelFondoModalpass.SetAlphaAnimated(500,1)";
Debug.ShouldStop(33554432);
b4i_perfil._panelfondomodalpass.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnconfirmchangepass_click() throws Exception{
try {
		Debug.PushSubsStack("btnConfirmChangePass_Click (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,160);
if (RapidSub.canDelegate("btnconfirmchangepass_click")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","btnconfirmchangepass_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _changepass = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 160;BA.debugLine="Sub btnConfirmChangePass_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 162;BA.debugLine="If txtPassAntigua.Text == \"\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",b4i_perfil._txtpassantigua.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 163;BA.debugLine="Msgbox(\"Debe poner la contrseña antigua para pod";
Debug.ShouldStop(4);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Debe poner la contrseña antigua para poder actualizar")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 164;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 167;BA.debugLine="If txtNewPass.Text == \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",b4i_perfil._txtnewpass.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 168;BA.debugLine="Msgbox(\"Debe poner la  nueva contrseña  para pod";
Debug.ShouldStop(128);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Debe poner la  nueva contrseña  para poder actualizar")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 169;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 172;BA.debugLine="If txtNewPass.Text == txtPassAntigua.Text Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",b4i_perfil._txtnewpass.runMethod(true,"Text"),b4i_perfil._txtpassantigua.runMethod(true,"Text"))) { 
 BA.debugLineNum = 173;BA.debugLine="Msgbox(\"La nueva contrseña debe de ser diferente";
Debug.ShouldStop(4096);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La nueva contrseña debe de ser diferente a la anterior para poder actualizar")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 174;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 177;BA.debugLine="If txtPassConfirm.Text == \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",b4i_perfil._txtpassconfirm.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 178;BA.debugLine="Msgbox(\"Debe de confirmar su nueva contrseña  pa";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Debe de confirmar su nueva contrseña  para poder actualizar")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 179;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 182;BA.debugLine="If txtPassConfirm.Text <> txtPassConfirm.Text The";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("!",b4i_perfil._txtpassconfirm.runMethod(true,"Text"),b4i_perfil._txtpassconfirm.runMethod(true,"Text"))) { 
 BA.debugLineNum = 183;BA.debugLine="Msgbox(\"Las contrseñas nuevas no coinciden. Por";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Las contrseñas nuevas no coinciden. Por favor verifique de nuevo")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 184;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 187;BA.debugLine="Dim json As String";
Debug.ShouldStop(67108864);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 188;BA.debugLine="json = \"'f_antigua':\"&txtPassAntigua.Text& _ 	\",'";
Debug.ShouldStop(134217728);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_antigua':"),b4i_perfil._txtpassantigua.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_nueva':"),b4i_perfil._txtnewpass.runMethod(true,"Text"),RemoteObject.createImmutable(", 'f_idusuario':"),b4i_perfil._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ));Debug.locals.put("json", _json);
 BA.debugLineNum = 192;BA.debugLine="Dim changePass As HttpJob";
Debug.ShouldStop(-2147483648);
_changepass = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("changePass", _changepass);
 BA.debugLineNum = 193;BA.debugLine="changePass.Initialize(\"changePass\",Me)";
Debug.ShouldStop(1);
_changepass.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_perfil.ba,(Object)(BA.ObjectToString("changePass")),(Object)(b4i_perfil.getObject()));
 BA.debugLineNum = 194;BA.debugLine="changePass.PostString(Main.url&\"puntoventa/change";
Debug.ShouldStop(2);
_changepass.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_perfil._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/changePass"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_perfil._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_perfil._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnperfilback_click() throws Exception{
try {
		Debug.PushSubsStack("btnPerfilBack_Click (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,147);
if (RapidSub.canDelegate("btnperfilback_click")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","btnperfilback_click");}
 BA.debugLineNum = 147;BA.debugLine="Sub btnPerfilBack_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(524288);
b4i_perfil._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 149;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(1048576);
b4i_perfil._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsave_click() throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,111);
if (RapidSub.canDelegate("btnsave_click")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","btnsave_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _actualizar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 111;BA.debugLine="Sub btnSave_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="If txtNombre.Text == \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",b4i_perfil._txtnombre.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 114;BA.debugLine="Msgbox(\"No puede dejar el Nombre vacio\",\"Aviso\")";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No puede dejar el Nombre vacio")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 115;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 118;BA.debugLine="If lblemail.Text == \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",b4i_perfil._lblemail.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 119;BA.debugLine="Msgbox(\"No puede dejar el Email vacio\",\"Aviso\")";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No puede dejar el Email vacio")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 120;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 123;BA.debugLine="If txttel.Text == \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",b4i_perfil._txttel.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 124;BA.debugLine="Msgbox(\"No puede dejar el Teléfono vacio\",\"Aviso";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No puede dejar el Teléfono vacio")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 125;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 128;BA.debugLine="If txtdir.Text == \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",b4i_perfil._txtdir.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 129;BA.debugLine="Msgbox(\"No puede dejar la Dirección vacia\",\"Avis";
Debug.ShouldStop(1);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No puede dejar la Dirección vacia")),(Object)(RemoteObject.createImmutable("Aviso")));
 BA.debugLineNum = 130;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 134;BA.debugLine="Dim json As String";
Debug.ShouldStop(32);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 135;BA.debugLine="json = \"'f_nombre':\"&txtNombre.Text& _ 	\",'f_emai";
Debug.ShouldStop(64);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_nombre':"),b4i_perfil._txtnombre.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_email':"),b4i_perfil._lblemail.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_tel':"),b4i_perfil._txttel.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_direccion':"),b4i_perfil._txtdir.runMethod(true,"Text"),RemoteObject.createImmutable(", 'f_idusuario':"),b4i_perfil._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ));Debug.locals.put("json", _json);
 BA.debugLineNum = 141;BA.debugLine="Dim actualizar As HttpJob";
Debug.ShouldStop(4096);
_actualizar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("actualizar", _actualizar);
 BA.debugLineNum = 142;BA.debugLine="actualizar.Initialize(\"actualizar\",Me)";
Debug.ShouldStop(8192);
_actualizar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_perfil.ba,(Object)(BA.ObjectToString("actualizar")),(Object)(b4i_perfil.getObject()));
 BA.debugLineNum = 143;BA.debugLine="actualizar.PostString(Main.url&\"puntoventa/actual";
Debug.ShouldStop(16384);
_actualizar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_perfil._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/actualizar"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_perfil._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_perfil._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buscardatos() throws Exception{
try {
		Debug.PushSubsStack("BuscarDatos (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,38);
if (RapidSub.canDelegate("buscardatos")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","buscardatos");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobperfil = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 38;BA.debugLine="Sub BuscarDatos";
Debug.ShouldStop(32);
 BA.debugLineNum = 39;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
Debug.ShouldStop(64);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_perfil._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 41;BA.debugLine="Dim jobperfil As HttpJob";
Debug.ShouldStop(256);
_jobperfil = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("jobperfil", _jobperfil);
 BA.debugLineNum = 42;BA.debugLine="jobperfil.Initialize(\"BuscarPerfil\",Me)";
Debug.ShouldStop(512);
_jobperfil.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_perfil.ba,(Object)(BA.ObjectToString("BuscarPerfil")),(Object)(b4i_perfil.getObject()));
 BA.debugLineNum = 43;BA.debugLine="jobperfil.PostString(Main.url&\"puntoventa/perfil\"";
Debug.ShouldStop(1024);
_jobperfil.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_perfil._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/perfil"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_perfil._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_perfil._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("Initialize (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,27);
if (RapidSub.canDelegate("initialize")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","initialize");}
 BA.debugLineNum = 27;BA.debugLine="Sub Initialize";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 29;BA.debugLine="pagePerfil.Initialize(\"pagePerfil\")";
Debug.ShouldStop(268435456);
b4i_perfil._pageperfil.runVoidMethod ("Initialize::",b4i_perfil.ba,(Object)(RemoteObject.createImmutable("pagePerfil")));
 BA.debugLineNum = 30;BA.debugLine="pagePerfil.RootPanel.LoadLayout(\"frmPerfil\")";
Debug.ShouldStop(536870912);
b4i_perfil._pageperfil.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPerfil")),b4i_perfil.ba);
 BA.debugLineNum = 32;BA.debugLine="Main.NavControl.ShowPage(pagePerfil)";
Debug.ShouldStop(-2147483648);
b4i_perfil._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_perfil._pageperfil).getObject())));
 BA.debugLineNum = 34;BA.debugLine="BuscarDatos";
Debug.ShouldStop(2);
_buscardatos();
 BA.debugLineNum = 35;BA.debugLine="Main.smc.Tag = \"perfil\"";
Debug.ShouldStop(4);
b4i_perfil._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("perfil")));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("JobDone (perfil) ","perfil",8,b4i_perfil.ba,b4i_perfil.mostCurrent,47);
if (RapidSub.canDelegate("jobdone")) { return b4i_perfil.remoteMe.runUserSub(false, "perfil","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 47;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 50;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_perfil._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_perfil._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 51;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 54;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",b4i_perfil._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 55;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 58;BA.debugLine="Dim map As Map";
Debug.ShouldStop(33554432);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 59;BA.debugLine="Dim list As List";
Debug.ShouldStop(67108864);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 60;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(134217728);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 61;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
Debug.ShouldStop(268435456);
_json.runVoidMethod ("Initialize:",(Object)(b4i_perfil._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 62;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(536870912);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 64;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("BuscarPerfil"),BA.ObjectToString("changePass"),BA.ObjectToString("actualizar"))) {
case 0: {
 BA.debugLineNum = 68;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(8);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 69;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(16);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 70;BA.debugLine="mapa = list.Get(0)";
Debug.ShouldStop(32);
_mapa = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 72;BA.debugLine="txtNombre.Text = mapa.Get(\"f_nombre\")";
Debug.ShouldStop(128);
b4i_perfil._txtnombre.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 73;BA.debugLine="lblemail.Text = mapa.Get(\"f_email\")";
Debug.ShouldStop(256);
b4i_perfil._lblemail.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_email"))))));
 BA.debugLineNum = 74;BA.debugLine="txttel.Text = mapa.Get(\"f_telefono\")";
Debug.ShouldStop(512);
b4i_perfil._txttel.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_telefono"))))));
 BA.debugLineNum = 75;BA.debugLine="txtdir.Text = mapa.Get(\"f_direccion\")";
Debug.ShouldStop(1024);
b4i_perfil._txtdir.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion"))))));
 break; }
case 1: {
 BA.debugLineNum = 79;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(16384);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
 BA.debugLineNum = 80;BA.debugLine="hud.ToastMessageShow(\"Contrseña actualizada\",";
Debug.ShouldStop(32768);
b4i_perfil._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Contrseña actualizada")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 81;BA.debugLine="btnBackChangePass_Click";
Debug.ShouldStop(65536);
_btnbackchangepass_click();
 BA.debugLineNum = 83;BA.debugLine="txtPassAntigua.Text = \"\"";
Debug.ShouldStop(262144);
b4i_perfil._txtpassantigua.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 84;BA.debugLine="txtNewPass.Text = \"\"";
Debug.ShouldStop(524288);
b4i_perfil._txtnewpass.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 85;BA.debugLine="txtPassConfirm.Text = \"\"";
Debug.ShouldStop(1048576);
b4i_perfil._txtpassconfirm.runMethod(true,"setText:",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"La Contraseña introducida no coincide";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La Contraseña introducida no coincide con la anterior")),(Object)(RemoteObject.createImmutable("Error")));
 };
 break; }
case 2: {
 BA.debugLineNum = 93;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(268435456);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
 BA.debugLineNum = 94;BA.debugLine="hud.ToastMessageShow(\"Información actualizada\"";
Debug.ShouldStop(536870912);
b4i_perfil._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Información actualizada")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 95;BA.debugLine="btnPerfilBack_Click";
Debug.ShouldStop(1073741824);
_btnperfilback_click();
 BA.debugLineNum = 97;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(1);
b4i_perfil._txtnombre.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 98;BA.debugLine="lblemail.Text = \"\"";
Debug.ShouldStop(2);
b4i_perfil._lblemail.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 99;BA.debugLine="txttel.Text = \"\"";
Debug.ShouldStop(4);
b4i_perfil._txttel.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 100;BA.debugLine="txtdir.Text = \"\"";
Debug.ShouldStop(8);
b4i_perfil._txtdir.runMethod(true,"setText:",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 103;BA.debugLine="Msgbox(\"Hubo un error al actualizar la informa";
Debug.ShouldStop(64);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Hubo un error al actualizar la información")),(Object)(RemoteObject.createImmutable("Error")));
 };
 break; }
}
;
 BA.debugLineNum = 109;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim pagePerfil As Page";
b4i_perfil._pageperfil = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 8;BA.debugLine="Dim hud As HUD";
b4i_perfil._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 10;BA.debugLine="Private btnChangePass As Button";
b4i_perfil._btnchangepass = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private btnPerfilBack As Button";
b4i_perfil._btnperfilback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private btnSave As Button";
b4i_perfil._btnsave = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblemail As Label";
b4i_perfil._lblemail = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private PanelEncabezadoUser As Panel";
b4i_perfil._panelencabezadouser = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private txtdir As TextField";
b4i_perfil._txtdir = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private txtNombre As TextField";
b4i_perfil._txtnombre = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txttel As TextField";
b4i_perfil._txttel = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnBackChangePass As Button";
b4i_perfil._btnbackchangepass = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btnConfirmChangePass As Button";
b4i_perfil._btnconfirmchangepass = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private txtNewPass As TextField";
b4i_perfil._txtnewpass = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtPassAntigua As TextField";
b4i_perfil._txtpassantigua = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtPassConfirm As TextField";
b4i_perfil._txtpassconfirm = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelFondoModalpass As Panel";
b4i_perfil._panelfondomodalpass = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}