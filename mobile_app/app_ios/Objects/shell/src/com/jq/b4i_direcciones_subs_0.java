package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_direcciones_subs_0 {


public static RemoteObject  _btnnuevadireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnNuevaDireccion_Click (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,68);
if (RapidSub.canDelegate("btnnuevadireccion_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnnuevadireccion_click");}
 BA.debugLineNum = 68;BA.debugLine="Sub btnNuevaDireccion_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 69;BA.debugLine="txtDireccion.Text =\"\"";
Debug.ShouldStop(16);
b4i_direcciones._txtdireccion.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 70;BA.debugLine="txtDireccion.Tag = 0";
Debug.ShouldStop(32);
b4i_direcciones._txtdireccion.runMethod(false,"setTag:",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 71;BA.debugLine="chPrincipal.SetValueAnimated(False)";
Debug.ShouldStop(64);
b4i_direcciones._chprincipal.runVoidMethod ("SetValueAnimated:",(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 72;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(128);
_cargardirecciones();
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnSalvarDireccion_Click (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,53);
if (RapidSub.canDelegate("btnsalvardireccion_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnsalvardireccion_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 53;BA.debugLine="Sub btnSalvarDireccion_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 54;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 55;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca la dirección")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 56;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(8388608);
b4i_direcciones._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 57;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 60;BA.debugLine="Dim json As String";
Debug.ShouldStop(134217728);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 61;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_di";
Debug.ShouldStop(268435456);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipal.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion':'"),b4i_direcciones._funcion.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_idrecord':"),b4i_direcciones._txtdireccion.runMethod(false,"Tag"),RemoteObject.createImmutable(",'f_credito_fiscal':false"));Debug.locals.put("json", _json);
 BA.debugLineNum = 63;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(1073741824);
_jobsalvar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 64;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(-2147483648);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobSalvar")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 65;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(1);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("cargarDirecciones (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,47);
if (RapidSub.canDelegate("cargardirecciones")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 47;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(16384);
 BA.debugLineNum = 48;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(32768);
_jobdirecciones = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 49;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(65536);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 50;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(131072);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
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
public static RemoteObject  _crear() throws Exception{
try {
		Debug.PushSubsStack("crear (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,26);
if (RapidSub.canDelegate("crear")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","crear");}
RemoteObject _list = RemoteObject.declareNull("B4IList");
int _i = 0;
 BA.debugLineNum = 26;BA.debugLine="Sub crear";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="txtDireccion.SetShadow(Colors.Gray, 0dip,2dip, 0.";
Debug.ShouldStop(67108864);
b4i_direcciones._txtdireccion.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 28;BA.debugLine="Panel2.SetShadow(Colors.Gray, 0dip,2dip, 0.3,Fals";
Debug.ShouldStop(134217728);
b4i_direcciones._panel2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 34;BA.debugLine="Dim list As List";
Debug.ShouldStop(2);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 35;BA.debugLine="list = page.TopLeftButtons";
Debug.ShouldStop(4);
_list = b4i_direcciones._page.runMethod(false,"TopLeftButtons");Debug.locals.put("list", _list);
 BA.debugLineNum = 36;BA.debugLine="Log(list.Size)";
Debug.ShouldStop(8);
b4i_main.__c.runVoidMethod ("LogImpl:::","45177354",BA.NumberToString(_list.runMethod(true,"Size")),0);
 BA.debugLineNum = 37;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(16);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="GetType(list.Get(i))";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethod ("GetType:",(Object)(_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("Initialize (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,15);
if (RapidSub.canDelegate("initialize")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","initialize");}
 BA.debugLineNum = 15;BA.debugLine="Sub Initialize";
Debug.ShouldStop(16384);
 BA.debugLineNum = 16;BA.debugLine="page.Initialize(\"PageDirecciones\")";
Debug.ShouldStop(32768);
b4i_direcciones._page.runVoidMethod ("Initialize::",b4i_direcciones.ba,(Object)(RemoteObject.createImmutable("PageDirecciones")));
 BA.debugLineNum = 17;BA.debugLine="page.RootPanel.LoadLayout(\"frmDirecciones\")";
Debug.ShouldStop(65536);
b4i_direcciones._page.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDirecciones")),b4i_direcciones.ba);
 BA.debugLineNum = 19;BA.debugLine="Main.NavControl.ShowPage(page)";
Debug.ShouldStop(262144);
b4i_direcciones._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_direcciones._page).getObject())));
 BA.debugLineNum = 20;BA.debugLine="Main.NavControl.ToolBarVisible = False";
Debug.ShouldStop(524288);
b4i_direcciones._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="crear";
Debug.ShouldStop(2097152);
_crear();
 BA.debugLineNum = 23;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(4194304);
_cargardirecciones();
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("JobDone (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,75);
if (RapidSub.canDelegate("jobdone")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
RemoteObject _principaldireccion = RemoteObject.createImmutable(false);
int _i = 0;
RemoteObject _cell = RemoteObject.declareNull("B4ITableCell");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 75;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(1024);
 BA.debugLineNum = 77;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 78;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(8192);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_direcciones._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_direcciones._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 79;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 82;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",b4i_direcciones._funcion.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 86;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2097152);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 87;BA.debugLine="Dim list As List";
Debug.ShouldStop(4194304);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 88;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(8388608);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 89;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(16777216);
_json.runVoidMethod ("Initialize:",(Object)(b4i_direcciones._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 90;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(33554432);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 92;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobSalvar"))) {
case 0: {
 BA.debugLineNum = 95;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1073741824);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 97;BA.debugLine="If ListViewDirecciones.IsInitialized  Then";
Debug.ShouldStop(1);
if (b4i_direcciones._listviewdirecciones.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 98;BA.debugLine="ListViewDirecciones.RemoveViewFromParent";
Debug.ShouldStop(2);
b4i_direcciones._listviewdirecciones.runVoidMethod ("RemoveViewFromParent");
 };
 BA.debugLineNum = 100;BA.debugLine="ListViewDirecciones.Initialize(\"ListViewDirecci";
Debug.ShouldStop(8);
b4i_direcciones._listviewdirecciones.runVoidMethod ("Initialize:::",b4i_direcciones.ba,(Object)(BA.ObjectToString("ListViewDirecciones")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 101;BA.debugLine="Panel2.AddView(ListViewDirecciones,0,0,Panel2.W";
Debug.ShouldStop(16);
b4i_direcciones._panel2.runVoidMethod ("AddView:::::",(Object)(((b4i_direcciones._listviewdirecciones).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_direcciones._panel2.runMethod(true,"Width")),(Object)(b4i_direcciones._panel2.runMethod(true,"Height")));
 BA.debugLineNum = 103;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 104;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(128);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tiene direcciones registradas")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 105;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 109;BA.debugLine="Dim dr,default=\"\" As String";
Debug.ShouldStop(4096);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_default = BA.ObjectToString("");Debug.locals.put("default", _default);Debug.locals.put("default", _default);
 BA.debugLineNum = 110;BA.debugLine="Dim principalDireccion As  Boolean";
Debug.ShouldStop(8192);
_principaldireccion = RemoteObject.createImmutable(false);Debug.locals.put("principalDireccion", _principaldireccion);
 BA.debugLineNum = 111;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(16384);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 112;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(32768);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 114;BA.debugLine="principalDireccion = map.Get(\"f_principal\")";
Debug.ShouldStop(131072);
_principaldireccion = BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal")))));Debug.locals.put("principalDireccion", _principaldireccion);
 BA.debugLineNum = 115;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
Debug.ShouldStop(262144);
_dr = b4i_direcciones._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 117;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"Length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 118;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(2097152);
_dr = RemoteObject.concat(_dr.runMethod(true,"SubString2::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 121;BA.debugLine="If principalDireccion Then";
Debug.ShouldStop(16777216);
if (_principaldireccion.getBoolean()) { 
 BA.debugLineNum = 122;BA.debugLine="default = CRLF& \"Dirección principal\"";
Debug.ShouldStop(33554432);
_default = RemoteObject.concat(b4i_main.__c.runMethod(true,"CRLF"),RemoteObject.createImmutable("Dirección principal"));Debug.locals.put("default", _default);
 };
 BA.debugLineNum = 125;BA.debugLine="Dim cell As  TableCell = ListViewDirecciones.A";
Debug.ShouldStop(268435456);
_cell = b4i_direcciones._listviewdirecciones.runMethod(false,"AddTwoLines::",(Object)(_dr),(Object)(RemoteObject.concat(b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(BA.numberCast(long.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fecha"))))))),_default)));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 126;BA.debugLine="cell.Tag = map";
Debug.ShouldStop(536870912);
_cell.runMethod(false,"setTag:",(_map));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 131;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\")";
Debug.ShouldStop(4);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Dirección registrada.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 132;BA.debugLine="btnNuevaDireccion_Click";
Debug.ShouldStop(8);
_btnnuevadireccion_click();
 break; }
}
;
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewdirecciones_selectedchanged(RemoteObject _sectionindex,RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("ListViewDirecciones_SelectedChanged (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,151);
if (RapidSub.canDelegate("listviewdirecciones_selectedchanged")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","listviewdirecciones_selectedchanged", _sectionindex, _cell);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 151;BA.debugLine="Sub ListViewDirecciones_SelectedChanged (SectionIn";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 153;BA.debugLine="If Cell.Tag = Null Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_cell.runMethod(false,"Tag"))) { 
 BA.debugLineNum = 154;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 157;BA.debugLine="Dim map As Map = Cell.Tag";
Debug.ShouldStop(268435456);
_map = (_cell.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 158;BA.debugLine="txtDireccion.Text = funcion.base64_Decode(map.Get";
Debug.ShouldStop(536870912);
b4i_direcciones._txtdireccion.runMethod(true,"setText:",b4i_direcciones._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion"))))))));
 BA.debugLineNum = 159;BA.debugLine="txtDireccion.Tag = map.Get(\"f_idrecord\")";
Debug.ShouldStop(1073741824);
b4i_direcciones._txtdireccion.runMethod(false,"setTag:",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 160;BA.debugLine="chPrincipal.Value = map.Get(\"f_principal\")";
Debug.ShouldStop(-2147483648);
b4i_direcciones._chprincipal.runMethod(true,"setValue:",BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal"))))));
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
public static RemoteObject  _pagedirecciones_disappear() throws Exception{
try {
		Debug.PushSubsStack("PageDirecciones_Disappear (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,139);
if (RapidSub.canDelegate("pagedirecciones_disappear")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","pagedirecciones_disappear");}
 BA.debugLineNum = 139;BA.debugLine="Sub PageDirecciones_Disappear";
Debug.ShouldStop(1024);
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagedirecciones_keyboardstatechanged(RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("PageDirecciones_KeyboardStateChanged (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,147);
if (RapidSub.canDelegate("pagedirecciones_keyboardstatechanged")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","pagedirecciones_keyboardstatechanged", _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 147;BA.debugLine="Sub  PageDirecciones_KeyboardStateChanged (Height";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="funcion.KeyboardStateChanged(Height,page,page.Roo";
Debug.ShouldStop(524288);
b4i_direcciones._funcion.runVoidMethod ("_keyboardstatechanged:::" /*RemoteObject*/ ,(Object)(_height),(Object)(b4i_direcciones._page),(Object)(BA.numberCast(double.class, b4i_direcciones._page.runMethod(false,"RootPanel").runMethod(false,"Tag"))));
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
public static RemoteObject  _pagedirecciones_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("PageDirecciones_Resize (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,143);
if (RapidSub.canDelegate("pagedirecciones_resize")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","pagedirecciones_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 143;BA.debugLine="Sub PageDirecciones_Resize(Width As Int, Height As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="page.RootPanel.Tag = page.RootPanel.Top";
Debug.ShouldStop(32768);
b4i_direcciones._page.runMethod(false,"RootPanel").runMethod(false,"setTag:",(b4i_direcciones._page.runMethod(false,"RootPanel").runMethod(true,"Top")));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private page As Page";
b4i_direcciones._page = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 7;BA.debugLine="Private btnNuevaDireccion As Button";
b4i_direcciones._btnnuevadireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private btnSalvarDireccion As Button";
b4i_direcciones._btnsalvardireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private chPrincipal As Switch";
b4i_direcciones._chprincipal = RemoteObject.createNew ("B4ISwitchWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private Panel2 As Panel";
b4i_direcciones._panel2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private txtDireccion As TextView";
b4i_direcciones._txtdireccion = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private ListViewDirecciones As TableView";
b4i_direcciones._listviewdirecciones = RemoteObject.createNew ("B4ITableView");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _txtdireccion_textchanged(RemoteObject _oldtext,RemoteObject _newtext) throws Exception{
try {
		Debug.PushSubsStack("txtDireccion_TextChanged (direcciones) ","direcciones",4,b4i_direcciones.ba,b4i_direcciones.mostCurrent,165);
if (RapidSub.canDelegate("txtdireccion_textchanged")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtdireccion_textchanged", _oldtext, _newtext);}
Debug.locals.put("OldText", _oldtext);
Debug.locals.put("NewText", _newtext);
 BA.debugLineNum = 165;BA.debugLine="Sub txtDireccion_TextChanged (OldText As String, N";
Debug.ShouldStop(16);
 BA.debugLineNum = 167;BA.debugLine="If NewText.Contains(CRLF) Then";
Debug.ShouldStop(64);
if (_newtext.runMethod(true,"Contains:",(Object)(b4i_main.__c.runMethod(true,"CRLF"))).getBoolean()) { 
 BA.debugLineNum = 168;BA.debugLine="page.resignfocus";
Debug.ShouldStop(128);
b4i_direcciones._page.runVoidMethod ("ResignFocus");
 };
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}