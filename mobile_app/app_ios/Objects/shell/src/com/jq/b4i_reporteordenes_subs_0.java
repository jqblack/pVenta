package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_reporteordenes_subs_0 {


public static RemoteObject  _btnbuscarreporte_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscarReporte_Click (reporteordenes) ","reporteordenes",5,b4i_reporteordenes.ba,b4i_reporteordenes.mostCurrent,37);
if (RapidSub.canDelegate("btnbuscarreporte_click")) { return b4i_reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnbuscarreporte_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 37;BA.debugLine="Sub btnBuscarReporte_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 39;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(64);
b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"setDateFormat:",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 41;BA.debugLine="Dim json As String";
Debug.ShouldStop(256);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 42;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(date.Ticks)&\"";
Debug.ShouldStop(512);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_fecha1':'"),b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_reporteordenes._date.runMethod(true,"Ticks"))),RemoteObject.createImmutable("','f_pendiente':"),BA.BooleanToString(b4i_reporteordenes._chordenesabiertas.runMethod(true,"Value")));Debug.locals.put("json", _json);
 BA.debugLineNum = 43;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(1024);
_jobbuscar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 44;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(2048);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reporteordenes.ba,(Object)(BA.ObjectToString("JobBuscar")),(Object)(b4i_reporteordenes.getObject()));
 BA.debugLineNum = 45;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_ord";
Debug.ShouldStop(4096);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reporteordenes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_ordenes_cliente"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reporteordenes._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reporteordenes._main._token /*RemoteObject*/ ),(Object)(_json)))));
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
public static RemoteObject  _crear() throws Exception{
try {
		Debug.PushSubsStack("crear (reporteordenes) ","reporteordenes",5,b4i_reporteordenes.ba,b4i_reporteordenes.mostCurrent,27);
if (RapidSub.canDelegate("crear")) { return b4i_reporteordenes.remoteMe.runUserSub(false, "reporteordenes","crear");}
 BA.debugLineNum = 27;BA.debugLine="Sub crear";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 28;BA.debugLine="Panel1.SetShadow(Colors.Gray, 0dip,0dip, 0.5,Fals";
Debug.ShouldStop(134217728);
b4i_reporteordenes._panel1.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 29;BA.debugLine="Panel2.SetShadow(Colors.Gray, 0dip,0dip, 0.5,Fals";
Debug.ShouldStop(268435456);
b4i_reporteordenes._panel2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 31;BA.debugLine="ListViewOrdenes.Initialize(\"ListViewDirecciones\",";
Debug.ShouldStop(1073741824);
b4i_reporteordenes._listviewordenes.runVoidMethod ("Initialize:::",b4i_reporteordenes.ba,(Object)(BA.ObjectToString("ListViewDirecciones")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 32;BA.debugLine="Panel2.AddView(ListViewOrdenes,0,0,Panel2.Width,P";
Debug.ShouldStop(-2147483648);
b4i_reporteordenes._panel2.runVoidMethod ("AddView:::::",(Object)(((b4i_reporteordenes._listviewordenes).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_reporteordenes._panel2.runMethod(true,"Width")),(Object)(b4i_reporteordenes._panel2.runMethod(true,"Height")));
 BA.debugLineNum = 34;BA.debugLine="chOrdenesAbiertas.Value = True";
Debug.ShouldStop(2);
b4i_reporteordenes._chordenesabiertas.runMethod(true,"setValue:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("Initialize (reporteordenes) ","reporteordenes",5,b4i_reporteordenes.ba,b4i_reporteordenes.mostCurrent,16);
if (RapidSub.canDelegate("initialize")) { return b4i_reporteordenes.remoteMe.runUserSub(false, "reporteordenes","initialize");}
 BA.debugLineNum = 16;BA.debugLine="Sub Initialize";
Debug.ShouldStop(32768);
 BA.debugLineNum = 17;BA.debugLine="page.Initialize(\"PageReporteOrdenes\")";
Debug.ShouldStop(65536);
b4i_reporteordenes._page.runVoidMethod ("Initialize::",b4i_reporteordenes.ba,(Object)(RemoteObject.createImmutable("PageReporteOrdenes")));
 BA.debugLineNum = 18;BA.debugLine="page.RootPanel.LoadLayout(\"frmReporteOrdenes\")";
Debug.ShouldStop(131072);
b4i_reporteordenes._page.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmReporteOrdenes")),b4i_reporteordenes.ba);
 BA.debugLineNum = 20;BA.debugLine="Main.NavControl.ShowPage(page)";
Debug.ShouldStop(524288);
b4i_reporteordenes._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_reporteordenes._page).getObject())));
 BA.debugLineNum = 21;BA.debugLine="Main.NavControl.ToolBarVisible = False";
Debug.ShouldStop(1048576);
b4i_reporteordenes._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="chOrdenesAbiertas.Value = True";
Debug.ShouldStop(2097152);
b4i_reporteordenes._chordenesabiertas.runMethod(true,"setValue:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 23;BA.debugLine="crear";
Debug.ShouldStop(4194304);
_crear();
 BA.debugLineNum = 24;BA.debugLine="btnBuscarReporte_Click";
Debug.ShouldStop(8388608);
_btnbuscarreporte_click();
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("JobDone (reporteordenes) ","reporteordenes",5,b4i_reporteordenes.ba,b4i_reporteordenes.mostCurrent,51);
if (RapidSub.canDelegate("jobdone")) { return b4i_reporteordenes.remoteMe.runUserSub(false, "reporteordenes","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _secondline = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _cell = RemoteObject.declareNull("B4ITableCell");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 51;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 53;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 54;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(2097152);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_reporteordenes._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_reporteordenes._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 55;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 58;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",b4i_reporteordenes._funcion.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 59;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 62;BA.debugLine="Dim map As Map";
Debug.ShouldStop(536870912);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 63;BA.debugLine="Dim list As List";
Debug.ShouldStop(1073741824);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 64;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 65;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(1);
_json.runVoidMethod ("Initialize:",(Object)(b4i_reporteordenes._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 66;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(2);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 68;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobEliminar"))) {
case 0: {
 BA.debugLineNum = 71;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(64);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 72;BA.debugLine="ListViewOrdenes.Clear";
Debug.ShouldStop(128);
b4i_reporteordenes._listviewordenes.runVoidMethod ("Clear");
 BA.debugLineNum = 74;BA.debugLine="If ListViewOrdenes.IsInitialized Then";
Debug.ShouldStop(512);
if (b4i_reporteordenes._listviewordenes.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 75;BA.debugLine="ListViewOrdenes.RemoveViewFromParent";
Debug.ShouldStop(1024);
b4i_reporteordenes._listviewordenes.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 76;BA.debugLine="ListViewOrdenes.Initialize(\"ListViewOrdenes\",F";
Debug.ShouldStop(2048);
b4i_reporteordenes._listviewordenes.runVoidMethod ("Initialize:::",b4i_reporteordenes.ba,(Object)(BA.ObjectToString("ListViewOrdenes")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 77;BA.debugLine="Panel2.AddView(ListViewOrdenes,0,0,Panel2.Widt";
Debug.ShouldStop(4096);
b4i_reporteordenes._panel2.runVoidMethod ("AddView:::::",(Object)(((b4i_reporteordenes._listviewordenes).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_reporteordenes._panel2.runMethod(true,"Width")),(Object)(b4i_reporteordenes._panel2.runMethod(true,"Height")));
 };
 BA.debugLineNum = 80;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 81;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
Debug.ShouldStop(65536);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No hay ordenes registradas")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 82;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 85;BA.debugLine="Dim secondLine As String";
Debug.ShouldStop(1048576);
_secondline = RemoteObject.createImmutable("");Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 86;BA.debugLine="For i=0 To list.Size - 1";
Debug.ShouldStop(2097152);
{
final int step27 = 1;
final int limit27 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step27 > 0 && _i <= limit27) || (step27 < 0 && _i >= limit27) ;_i = ((int)(0 + _i + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 87;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(4194304);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 88;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
Debug.ShouldStop(8388608);
_secondline = RemoteObject.concat(RemoteObject.createImmutable("Fecha: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fecha_regstro_orden")))),b4i_main.__c.runMethod(true,"CRLF"),RemoteObject.createImmutable("Estado: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_status")))));Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 90;BA.debugLine="Dim cell As TableCell = ListViewOrdenes.AddTwo";
Debug.ShouldStop(33554432);
_cell = b4i_reporteordenes._listviewordenes.runMethod(false,"AddTwoLines::",(Object)(RemoteObject.concat(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_negocio")))),RemoteObject.createImmutable("   $"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))),(Object)(_secondline));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 91;BA.debugLine="cell.Tag = map";
Debug.ShouldStop(67108864);
_cell.runMethod(false,"setTag:",(_map));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 95;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(1073741824);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 96;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 97;BA.debugLine="ListViewOrdenes.Clear";
Debug.ShouldStop(1);
b4i_reporteordenes._listviewordenes.runVoidMethod ("Clear");
 BA.debugLineNum = 98;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Orden cancelada.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 99;BA.debugLine="btnBuscarReporte_Click";
Debug.ShouldStop(4);
_btnbuscarreporte_click();
 }else {
 BA.debugLineNum = 101;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
Debug.ShouldStop(16);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La orden ya no se puede ser cancelada.")),(Object)(RemoteObject.createImmutable("Información")));
 };
 break; }
}
;
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _listviewordenes_selectedchanged(RemoteObject _sectionindex,RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("ListViewOrdenes_SelectedChanged (reporteordenes) ","reporteordenes",5,b4i_reporteordenes.ba,b4i_reporteordenes.mostCurrent,110);
if (RapidSub.canDelegate("listviewordenes_selectedchanged")) { b4i_reporteordenes.remoteMe.runUserSub(false, "reporteordenes","listviewordenes_selectedchanged", _sectionindex, _cell); return;}
ResumableSub_ListViewOrdenes_SelectedChanged rsub = new ResumableSub_ListViewOrdenes_SelectedChanged(null,_sectionindex,_cell);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ListViewOrdenes_SelectedChanged extends BA.ResumableSub {
public ResumableSub_ListViewOrdenes_SelectedChanged(b4i_reporteordenes parent,RemoteObject _sectionindex,RemoteObject _cell) {
this.parent = parent;
this._sectionindex = _sectionindex;
this._cell = _cell;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_reporteordenes parent;
RemoteObject _sectionindex;
RemoteObject _cell;
RemoteObject _buttontext = RemoteObject.createImmutable("");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobeliminar = RemoteObject.declareNull("b4i_httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ListViewOrdenes_SelectedChanged (reporteordenes) ","reporteordenes",5,b4i_reporteordenes.ba,b4i_reporteordenes.mostCurrent,110);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 113;BA.debugLine="Msgbox2(\"Msg\", \"Seguro que desea eliminar esta or";
Debug.ShouldStop(65536);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_reporteordenes.ba,(Object)(BA.ObjectToString("Msg")),(Object)(BA.ObjectToString("Seguro que desea eliminar esta orden?")),(Object)(BA.ObjectToString("Confirmación")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("Volver"))}))));
 BA.debugLineNum = 114;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethod ("WaitFor::::","msg_click:", b4i_reporteordenes.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "reporteordenes", "listviewordenes_selectedchanged"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_buttontext = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(0));Debug.locals.put("ButtonText", _buttontext);
;
 BA.debugLineNum = 116;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(524288);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 117;BA.debugLine="Dim map As Map = Cell.Tag";
Debug.ShouldStop(1048576);
_map = (_cell.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 118;BA.debugLine="Dim json As String";
Debug.ShouldStop(2097152);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 119;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
Debug.ShouldStop(4194304);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_idempresa':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idempresa")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 121;BA.debugLine="Dim JobEliminar As HttpJob";
Debug.ShouldStop(16777216);
_jobeliminar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEliminar", _jobeliminar);
 BA.debugLineNum = 122;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
Debug.ShouldStop(33554432);
_jobeliminar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reporteordenes.ba,(Object)(BA.ObjectToString("JobEliminar")),(Object)(b4i_reporteordenes.getObject()));
 BA.debugLineNum = 123;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
Debug.ShouldStop(67108864);
_jobeliminar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_eliminar_orden"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),parent._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(parent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
public static void  _msg_click(RemoteObject _buttontext) throws Exception{
}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private page As Page";
b4i_reporteordenes._page = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 7;BA.debugLine="Private btnBuscarReporte As Button";
b4i_reporteordenes._btnbuscarreporte = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private chOrdenesAbiertas As Switch";
b4i_reporteordenes._chordenesabiertas = RemoteObject.createNew ("B4ISwitchWrapper");
 //BA.debugLineNum = 9;BA.debugLine="Private date As DatePicker";
b4i_reporteordenes._date = RemoteObject.createNew ("B4IDatePickerWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private Panel1 As Panel";
b4i_reporteordenes._panel1 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private Panel2 As Panel";
b4i_reporteordenes._panel2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private ListViewOrdenes As TableView";
b4i_reporteordenes._listviewordenes = RemoteObject.createNew ("B4ITableView");
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
}