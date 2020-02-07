package com.menube.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class direcciones_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,25);
if (RapidSub.canDelegate("activity_create")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 25;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 27;BA.debugLine="Activity.LoadLayout(\"frmDirecciones\")";
Debug.ShouldStop(67108864);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDirecciones")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 29;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight = 8";
Debug.ShouldStop(268435456);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",direcciones.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85))));
 BA.debugLineNum = 30;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextColo";
Debug.ShouldStop(536870912);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 31;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typeface";
Debug.ShouldStop(1073741824);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(false,"setTypeface",direcciones.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 33;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Te";
Debug.ShouldStop(1);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 34;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Ty";
Debug.ShouldStop(2);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(false,"setTypeface",direcciones.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 35;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.He";
Debug.ShouldStop(4);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setHeight",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),direcciones.mostCurrent.activityBA));
 BA.debugLineNum = 36;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.Gra";
Debug.ShouldStop(8);
direcciones.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._listviewdirecciones),(Object)(direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(direcciones.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 37;BA.debugLine="txtDireccion.Tag = 0";
Debug.ShouldStop(16);
direcciones.mostCurrent._txtdireccion.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 39;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(64);
_cargardirecciones();
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("Activity_Pause (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,107);
if (RapidSub.canDelegate("activity_pause")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 107;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1024);
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
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,103);
if (RapidSub.canDelegate("activity_resume")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","activity_resume");}
 BA.debugLineNum = 103;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(64);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnDireccionBack_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,141);
if (RapidSub.canDelegate("btndireccionback_click")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","btndireccionback_click");}
 BA.debugLineNum = 141;BA.debugLine="Sub btnDireccionBack_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 142;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8192);
direcciones.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnuevadireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnNuevaDireccion_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,134);
if (RapidSub.canDelegate("btnnuevadireccion_click")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","btnnuevadireccion_click");}
 BA.debugLineNum = 134;BA.debugLine="Sub btnNuevaDireccion_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 135;BA.debugLine="txtDireccion.Text =\"\"";
Debug.ShouldStop(64);
direcciones.mostCurrent._txtdireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 136;BA.debugLine="txtDireccion.Tag = 0";
Debug.ShouldStop(128);
direcciones.mostCurrent._txtdireccion.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 137;BA.debugLine="chPrincipal.Checked = False";
Debug.ShouldStop(256);
direcciones.mostCurrent._chprincipal.runMethodAndSync(true,"setChecked",direcciones.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 138;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(512);
_cargardirecciones();
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalvardireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnSalvarDireccion_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,118);
if (RapidSub.canDelegate("btnsalvardireccion_click")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","btnsalvardireccion_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 118;BA.debugLine="Sub btnSalvarDireccion_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
Debug.ShouldStop(8388608);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca la dirección")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 121;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(16777216);
direcciones.mostCurrent._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 122;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 125;BA.debugLine="Dim json As String";
Debug.ShouldStop(268435456);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 126;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f_";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipal.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_idrecord':"),direcciones.mostCurrent._txtdireccion.runMethod(false,"getTag"),RemoteObject.createImmutable(",'f_credito_fiscal':false"));Debug.locals.put("json", _json);
 BA.debugLineNum = 128;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(-2147483648);
_jobsalvar = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 129;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(1);
_jobsalvar.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobSalvar")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 130;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(2);
_jobsalvar.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargardirecciones() throws Exception{
try {
		Debug.PushSubsStack("cargarDirecciones (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,43);
if (RapidSub.canDelegate("cargardirecciones")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 43;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(2048);
_jobdirecciones = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 45;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(4096);
_jobdirecciones.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 46;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(8192);
_jobdirecciones.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 12;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 16;BA.debugLine="Private btnDireccionBack As Button";
direcciones.mostCurrent._btndireccionback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnNuevaDireccion As Button";
direcciones.mostCurrent._btnnuevadireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnSalvarDireccion As Button";
direcciones.mostCurrent._btnsalvardireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private ListViewDirecciones As ListView";
direcciones.mostCurrent._listviewdirecciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelDireccion As Panel";
direcciones.mostCurrent._paneldireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private txtDireccion As EditText";
direcciones.mostCurrent._txtdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private chPrincipal As CheckBox";
direcciones.mostCurrent._chprincipal = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,49);
if (RapidSub.canDelegate("jobdone")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 49;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 52;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(524288);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(direcciones.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(direcciones.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 53;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 56;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ ))),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 57;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 60;BA.debugLine="Dim map As Map";
Debug.ShouldStop(134217728);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 61;BA.debugLine="Dim list As List";
Debug.ShouldStop(268435456);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 62;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(536870912);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 63;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(1073741824);
_json.runVoidMethod ("Initialize",(Object)(direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 64;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(-2147483648);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 66;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobSalvar"))) {
case 0: {
 BA.debugLineNum = 69;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(16);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 70;BA.debugLine="ListViewDirecciones.Clear";
Debug.ShouldStop(32);
direcciones.mostCurrent._listviewdirecciones.runVoidMethod ("Clear");
 BA.debugLineNum = 71;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(128);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No tiene direcciones registradas")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 73;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 77;BA.debugLine="Dim dr,default=\"\" As String";
Debug.ShouldStop(4096);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_default = BA.ObjectToString("");Debug.locals.put("default", _default);Debug.locals.put("default", _default);
 BA.debugLineNum = 78;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(8192);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 79;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(16384);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 80;BA.debugLine="chPrincipal.Checked = map.Get(\"f_principal\")";
Debug.ShouldStop(32768);
direcciones.mostCurrent._chprincipal.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_principal"))))));
 BA.debugLineNum = 81;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
Debug.ShouldStop(65536);
_dr = direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 83;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 84;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(524288);
_dr = RemoteObject.concat(_dr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 87;BA.debugLine="If chPrincipal.Checked Then";
Debug.ShouldStop(4194304);
if (direcciones.mostCurrent._chprincipal.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 88;BA.debugLine="default = CRLF& \"Dirección principal\"";
Debug.ShouldStop(8388608);
_default = RemoteObject.concat(direcciones.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Dirección principal"));Debug.locals.put("default", _default);
 };
 BA.debugLineNum = 91;BA.debugLine="ListViewDirecciones.AddTwoLines2(dr,map.Get(\"f";
Debug.ShouldStop(67108864);
direcciones.mostCurrent._listviewdirecciones.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_dr)),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fecha")))),_default))),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 95;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\")";
Debug.ShouldStop(1073741824);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Dirección registrada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 96;BA.debugLine="btnNuevaDireccion_Click";
Debug.ShouldStop(-2147483648);
_btnnuevadireccion_click();
 break; }
}
;
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewdirecciones_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewDirecciones_ItemClick (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,112);
if (RapidSub.canDelegate("listviewdirecciones_itemclick")) { return com.menube.app.direcciones.remoteMe.runUserSub(false, "direcciones","listviewdirecciones_itemclick", _position, _value);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 112;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(65536);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_value);Debug.locals.put("map", _map);
 BA.debugLineNum = 114;BA.debugLine="txtDireccion.Text = funcion.base64_Decode(map.Get";
Debug.ShouldStop(131072);
direcciones.mostCurrent._txtdireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion")))))))));
 BA.debugLineNum = 115;BA.debugLine="txtDireccion.Tag = map.Get(\"f_idrecord\")";
Debug.ShouldStop(262144);
direcciones.mostCurrent._txtdireccion.runMethod(false,"setTag",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}