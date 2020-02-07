package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class perfil_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,32);
if (RapidSub.canDelegate("activity_create")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","activity_create", _firsttime);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobperfil = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 32;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"frmPerfilClient\")";
Debug.ShouldStop(4);
perfil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmPerfilClient")),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
Debug.ShouldStop(16);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),perfil.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 39;BA.debugLine="Dim jobperfil As HttpJob";
Debug.ShouldStop(64);
_jobperfil = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("jobperfil", _jobperfil);
 BA.debugLineNum = 40;BA.debugLine="jobperfil.Initialize(\"BuscarPerfil\",Me)";
Debug.ShouldStop(128);
_jobperfil.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,perfil.processBA,(Object)(BA.ObjectToString("BuscarPerfil")),(Object)(perfil.getObject()));
 BA.debugLineNum = 41;BA.debugLine="jobperfil.PostString(Main.url&\"puntoventa/perfil\"";
Debug.ShouldStop(256);
_jobperfil.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(perfil.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/perfil"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),perfil.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(perfil.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Activity_Pause (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,49);
if (RapidSub.canDelegate("activity_pause")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 49;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("Activity_Resume (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,45);
if (RapidSub.canDelegate("activity_resume")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","activity_resume");}
 BA.debugLineNum = 45;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(4096);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackchangepass_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackChangePass_Click (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,178);
if (RapidSub.canDelegate("btnbackchangepass_click")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","btnbackchangepass_click");}
 BA.debugLineNum = 178;BA.debugLine="Sub btnBackChangePass_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 180;BA.debugLine="funcion.DisableView(False,PanelFondoUser)";
Debug.ShouldStop(524288);
perfil.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(perfil.mostCurrent.__c.getField(true,"False")),(Object)(perfil.mostCurrent._panelfondouser));
 BA.debugLineNum = 181;BA.debugLine="PanelFondoModalpass.SetVisibleAnimated(250,False)";
Debug.ShouldStop(1048576);
perfil.mostCurrent._panelfondomodalpass.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(perfil.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("btnChangePass_Click (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,128);
if (RapidSub.canDelegate("btnchangepass_click")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","btnchangepass_click");}
 BA.debugLineNum = 128;BA.debugLine="Sub btnChangePass_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 130;BA.debugLine="If  PanelFondoModalpass.IsInitialized == False Th";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._panelfondomodalpass.runMethod(true,"IsInitialized"),perfil.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 131;BA.debugLine="Activity.LoadLayout(\"frmChangePass\")";
Debug.ShouldStop(4);
perfil.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmChangePass")),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 132;BA.debugLine="PanelFondoModalpass.Visible = False";
Debug.ShouldStop(8);
perfil.mostCurrent._panelfondomodalpass.runMethod(true,"setVisible",perfil.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 135;BA.debugLine="funcion.DisableView(True,PanelFondoUser)";
Debug.ShouldStop(64);
perfil.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(perfil.mostCurrent.__c.getField(true,"True")),(Object)(perfil.mostCurrent._panelfondouser));
 BA.debugLineNum = 136;BA.debugLine="PanelFondoModalpass.SetVisibleAnimated(250,True)";
Debug.ShouldStop(128);
perfil.mostCurrent._panelfondomodalpass.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(perfil.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnConfirmChangePass_Click (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,140);
if (RapidSub.canDelegate("btnconfirmchangepass_click")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","btnconfirmchangepass_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _changepass = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 140;BA.debugLine="Sub btnConfirmChangePass_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 142;BA.debugLine="If txtPassAntigua.Text == \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txtpassantigua.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 143;BA.debugLine="Msgbox(\"Debe poner la contrseña antigua para pod";
Debug.ShouldStop(16384);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Debe poner la contrseña antigua para poder actualizar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 144;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 147;BA.debugLine="If txtNewPass.Text == \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txtnewpass.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 148;BA.debugLine="Msgbox(\"Debe poner la  nueva contrseña  para pod";
Debug.ShouldStop(524288);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Debe poner la  nueva contrseña  para poder actualizar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 149;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 152;BA.debugLine="If txtNewPass.Text == txtPassAntigua.Text Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txtnewpass.runMethod(true,"getText"),perfil.mostCurrent._txtpassantigua.runMethod(true,"getText"))) { 
 BA.debugLineNum = 153;BA.debugLine="Msgbox(\"La nueva contrseña debe de ser diferente";
Debug.ShouldStop(16777216);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La nueva contrseña debe de ser diferente a la anterior para poder actualizar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 154;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 157;BA.debugLine="If txtPassConfirm.Text == \"\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txtpassconfirm.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 158;BA.debugLine="Msgbox(\"Debe de confirmar su nueva contrseña  pa";
Debug.ShouldStop(536870912);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Debe de confirmar su nueva contrseña  para poder actualizar")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 159;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 162;BA.debugLine="If txtPassConfirm.Text <> txtPassConfirm.Text The";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("!",perfil.mostCurrent._txtpassconfirm.runMethod(true,"getText"),perfil.mostCurrent._txtpassconfirm.runMethod(true,"getText"))) { 
 BA.debugLineNum = 163;BA.debugLine="Msgbox(\"Las contrseñas nuevas no coinciden. Por";
Debug.ShouldStop(4);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Las contrseñas nuevas no coinciden. Por favor verifique de nuevo")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 164;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 167;BA.debugLine="Dim json As String";
Debug.ShouldStop(64);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 168;BA.debugLine="json = \"'f_antigua':\"&txtPassAntigua.Text& _ 	\",'";
Debug.ShouldStop(128);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_antigua':"),perfil.mostCurrent._txtpassantigua.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_nueva':"),perfil.mostCurrent._txtnewpass.runMethod(true,"getText"),RemoteObject.createImmutable(", 'f_idusuario':"),perfil.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ));Debug.locals.put("json", _json);
 BA.debugLineNum = 172;BA.debugLine="Dim changePass As HttpJob";
Debug.ShouldStop(2048);
_changepass = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("changePass", _changepass);
 BA.debugLineNum = 173;BA.debugLine="changePass.Initialize(\"changePass\",Me)";
Debug.ShouldStop(4096);
_changepass.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,perfil.processBA,(Object)(BA.ObjectToString("changePass")),(Object)(perfil.getObject()));
 BA.debugLineNum = 174;BA.debugLine="changePass.PostString(Main.url&\"puntoventa/change";
Debug.ShouldStop(8192);
_changepass.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(perfil.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/changePass"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),perfil.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(perfil.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndireccionback_click() throws Exception{
try {
		Debug.PushSubsStack("btnDireccionBack_Click (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,120);
if (RapidSub.canDelegate("btndireccionback_click")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","btndireccionback_click");}
 BA.debugLineNum = 120;BA.debugLine="Sub btnDireccionBack_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 122;BA.debugLine="Activity.Finish";
Debug.ShouldStop(33554432);
perfil.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 123;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(67108864);
perfil.mostCurrent.__c.runVoidMethod ("StartActivity",perfil.processBA,(Object)((perfil.mostCurrent._principal.getObject())));
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
public static RemoteObject  _btnsave_click() throws Exception{
try {
		Debug.PushSubsStack("btnSave_Click (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,185);
if (RapidSub.canDelegate("btnsave_click")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","btnsave_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _actualizar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 185;BA.debugLine="Sub btnSave_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 187;BA.debugLine="If txtNombre.Text == \"\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txtnombre.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 188;BA.debugLine="Msgbox(\"No puede dejar el Nombre vacio\",\"Aviso\")";
Debug.ShouldStop(134217728);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No puede dejar el Nombre vacio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 189;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 192;BA.debugLine="If lblemail.Text == \"\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._lblemail.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 193;BA.debugLine="Msgbox(\"No puede dejar el Email vacio\",\"Aviso\")";
Debug.ShouldStop(1);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No puede dejar el Email vacio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 194;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 197;BA.debugLine="If txttel.Text == \"\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txttel.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 198;BA.debugLine="Msgbox(\"No puede dejar el Teléfono vacio\",\"Aviso";
Debug.ShouldStop(32);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No puede dejar el Teléfono vacio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 199;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 202;BA.debugLine="If txtdir.Text == \"\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._txtdir.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 203;BA.debugLine="Msgbox(\"No puede dejar la Dirección vacia\",\"Avis";
Debug.ShouldStop(1024);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No puede dejar la Dirección vacia")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 204;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 208;BA.debugLine="Dim json As String";
Debug.ShouldStop(32768);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 209;BA.debugLine="json = \"'f_nombre':\"&txtNombre.Text& _ 	\",'f_emai";
Debug.ShouldStop(65536);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_nombre':"),perfil.mostCurrent._txtnombre.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_email':"),perfil.mostCurrent._lblemail.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_tel':"),perfil.mostCurrent._txttel.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_direccion':"),perfil.mostCurrent._txtdir.runMethod(true,"getText"),RemoteObject.createImmutable(", 'f_idusuario':"),perfil.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ));Debug.locals.put("json", _json);
 BA.debugLineNum = 215;BA.debugLine="Dim actualizar As HttpJob";
Debug.ShouldStop(4194304);
_actualizar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("actualizar", _actualizar);
 BA.debugLineNum = 216;BA.debugLine="actualizar.Initialize(\"actualizar\",Me)";
Debug.ShouldStop(8388608);
_actualizar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,perfil.processBA,(Object)(BA.ObjectToString("actualizar")),(Object)(perfil.getObject()));
 BA.debugLineNum = 217;BA.debugLine="actualizar.PostString(Main.url&\"puntoventa/actual";
Debug.ShouldStop(16777216);
_actualizar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(perfil.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/actualizar"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),perfil.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(perfil.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private txtdir As EditText";
perfil.mostCurrent._txtdir = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private txtNombre As EditText";
perfil.mostCurrent._txtnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private txttel As EditText";
perfil.mostCurrent._txttel = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private lblemail As Label";
perfil.mostCurrent._lblemail = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnDireccionBack As Button";
perfil.mostCurrent._btndireccionback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnChangePass As Button";
perfil.mostCurrent._btnchangepass = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelFondoModalpass As Panel";
perfil.mostCurrent._panelfondomodalpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelFondoUser As Panel";
perfil.mostCurrent._panelfondouser = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnBackChangePass As Button";
perfil.mostCurrent._btnbackchangepass = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnConfirmChangePass As Button";
perfil.mostCurrent._btnconfirmchangepass = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtNewPass As EditText";
perfil.mostCurrent._txtnewpass = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private txtPassAntigua As EditText";
perfil.mostCurrent._txtpassantigua = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtPassConfirm As EditText";
perfil.mostCurrent._txtpassconfirm = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnSave As Button";
perfil.mostCurrent._btnsave = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (perfil) ","perfil",10,perfil.mostCurrent.activityBA,perfil.mostCurrent,53);
if (RapidSub.canDelegate("jobdone")) { return com.jq.pedidos.perfil.remoteMe.runUserSub(false, "perfil","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 53;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 55;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),perfil.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 56;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(8388608);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(perfil.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(perfil.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),perfil.mostCurrent.activityBA);
 BA.debugLineNum = 57;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 60;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",perfil.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ ))),perfil.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 61;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 64;BA.debugLine="Dim map As Map";
Debug.ShouldStop(-2147483648);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 65;BA.debugLine="Dim list As List";
Debug.ShouldStop(1);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 66;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(2);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 67;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(4);
_json.runVoidMethod ("Initialize",(Object)(perfil.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,perfil.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 68;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(8);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 71;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(64);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("BuscarPerfil"),BA.ObjectToString("actualizar"),BA.ObjectToString("changePass"))) {
case 0: {
 BA.debugLineNum = 76;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(2048);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 77;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(4096);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 78;BA.debugLine="mapa = list.Get(0)";
Debug.ShouldStop(8192);
_mapa.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 80;BA.debugLine="txtNombre.Text = mapa.Get(\"f_nombre\")";
Debug.ShouldStop(32768);
perfil.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 81;BA.debugLine="lblemail.Text = mapa.Get(\"f_email\")";
Debug.ShouldStop(65536);
perfil.mostCurrent._lblemail.runMethod(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_email"))))));
 BA.debugLineNum = 82;BA.debugLine="txttel.Text = mapa.Get(\"f_telefono\")";
Debug.ShouldStop(131072);
perfil.mostCurrent._txttel.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_telefono"))))));
 BA.debugLineNum = 83;BA.debugLine="txtdir.Text = mapa.Get(\"f_direccion\")";
Debug.ShouldStop(262144);
perfil.mostCurrent._txtdir.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion"))))));
 break; }
case 1: {
 BA.debugLineNum = 87;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(4194304);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 88;BA.debugLine="ToastMessageShow(\"Información actualizada\", Fa";
Debug.ShouldStop(8388608);
perfil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Información actualizada")),(Object)(perfil.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 89;BA.debugLine="btnDireccionBack_Click";
Debug.ShouldStop(16777216);
_btndireccionback_click();
 BA.debugLineNum = 91;BA.debugLine="txtNombre.Text = \"\"";
Debug.ShouldStop(67108864);
perfil.mostCurrent._txtnombre.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 92;BA.debugLine="lblemail.Text = \"\"";
Debug.ShouldStop(134217728);
perfil.mostCurrent._lblemail.runMethod(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 93;BA.debugLine="txttel.Text = \"\"";
Debug.ShouldStop(268435456);
perfil.mostCurrent._txttel.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 94;BA.debugLine="txtdir.Text = \"\"";
Debug.ShouldStop(536870912);
perfil.mostCurrent._txtdir.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 97;BA.debugLine="Msgbox(\"Hubo un error al actualizar la inform";
Debug.ShouldStop(1);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Hubo un error al actualizar la información")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),perfil.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 102;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(32);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 103;BA.debugLine="ToastMessageShow(\"Contrseña actualizada\", Fals";
Debug.ShouldStop(64);
perfil.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Contrseña actualizada")),(Object)(perfil.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 104;BA.debugLine="btnBackChangePass_Click";
Debug.ShouldStop(128);
_btnbackchangepass_click();
 BA.debugLineNum = 106;BA.debugLine="txtPassAntigua.Text = \"\"";
Debug.ShouldStop(512);
perfil.mostCurrent._txtpassantigua.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 107;BA.debugLine="txtNewPass.Text = \"\"";
Debug.ShouldStop(1024);
perfil.mostCurrent._txtnewpass.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 108;BA.debugLine="txtPassConfirm.Text = \"\"";
Debug.ShouldStop(2048);
perfil.mostCurrent._txtpassconfirm.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 }else {
 BA.debugLineNum = 111;BA.debugLine="Msgbox(\"La Contraseña introducida no coincide";
Debug.ShouldStop(16384);
perfil.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La Contraseña introducida no coincide con la anterior")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),perfil.mostCurrent.activityBA);
 };
 break; }
}
;
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}