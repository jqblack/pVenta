package com.menube.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class reporteordenes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,23);
if (RapidSub.canDelegate("activity_create")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 23;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 26;BA.debugLine="Activity.LoadLayout(\"frmReporteOrdenes\")";
Debug.ShouldStop(33554432);
reporteordenes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmReporteOrdenes")),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 28;BA.debugLine="ListViewOrdenes.TwoLinesLayout.ItemHeight = 85dip";
Debug.ShouldStop(134217728);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",reporteordenes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85))));
 BA.debugLineNum = 29;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextColor =";
Debug.ShouldStop(268435456);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 30;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextSize = 1";
Debug.ShouldStop(536870912);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 31;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.Typeface = T";
Debug.ShouldStop(1073741824);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(false,"setTypeface",reporteordenes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 33;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.TextCo";
Debug.ShouldStop(1);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 34;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Typefa";
Debug.ShouldStop(2);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(false,"setTypeface",reporteordenes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 35;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Height";
Debug.ShouldStop(4);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setHeight",reporteordenes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),reporteordenes.mostCurrent.activityBA));
 BA.debugLineNum = 36;BA.debugLine="funcion.SetDivider(ListViewOrdenes,Colors.Gray,1d";
Debug.ShouldStop(8);
reporteordenes.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._listviewordenes),(Object)(reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(reporteordenes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 38;BA.debugLine="chOrdenesAbiertas.Checked = True";
Debug.ShouldStop(32);
reporteordenes.mostCurrent._chordenesabiertas.runMethodAndSync(true,"setChecked",reporteordenes.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="btnBuscarReporte_Click";
Debug.ShouldStop(128);
_btnbuscarreporte_click();
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
		Debug.PushSubsStack("Activity_Pause (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,47);
if (RapidSub.canDelegate("activity_pause")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 47;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Resume (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,43);
if (RapidSub.canDelegate("activity_resume")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","activity_resume");}
 BA.debugLineNum = 43;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(1024);
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
public static RemoteObject  _btnbuscarreporte_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscarReporte_Click (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,55);
if (RapidSub.canDelegate("btnbuscarreporte_click")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnbuscarreporte_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscar = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 55;BA.debugLine="Sub btnBuscarReporte_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 57;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(16777216);
reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 59;BA.debugLine="Dim json As String";
Debug.ShouldStop(67108864);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 60;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(date.GetDate)";
Debug.ShouldStop(134217728);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_fecha1':'"),reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(reporteordenes.mostCurrent._date.runClassMethod (com.menube.app.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))),RemoteObject.createImmutable("','f_pendiente':"),reporteordenes.mostCurrent._chordenesabiertas.runMethod(true,"getChecked"));Debug.locals.put("json", _json);
 BA.debugLineNum = 61;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(268435456);
_jobbuscar = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 62;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(536870912);
_jobbuscar.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobBuscar")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 63;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_ord";
Debug.ShouldStop(1073741824);
_jobbuscar.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_ordenes_cliente"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnreporteback_click() throws Exception{
try {
		Debug.PushSubsStack("btnReporteBack_Click (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,51);
if (RapidSub.canDelegate("btnreporteback_click")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnreporteback_click");}
 BA.debugLineNum = 51;BA.debugLine="Sub btnReporteBack_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 52;BA.debugLine="Activity.Finish";
Debug.ShouldStop(524288);
reporteordenes.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
 //BA.debugLineNum = 16;BA.debugLine="Private btnBuscarReporte As Button";
reporteordenes.mostCurrent._btnbuscarreporte = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnReporteBack As Button";
reporteordenes.mostCurrent._btnreporteback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private chOrdenesAbiertas As CheckBox";
reporteordenes.mostCurrent._chordenesabiertas = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private date As AnotherDatePicker";
reporteordenes.mostCurrent._date = RemoteObject.createNew ("com.menube.app.anotherdatepicker");
 //BA.debugLineNum = 20;BA.debugLine="Private ListViewOrdenes As ListView";
reporteordenes.mostCurrent._listviewordenes = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,68);
if (RapidSub.canDelegate("jobdone")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _secondline = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 68;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8);
 BA.debugLineNum = 70;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),reporteordenes.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 71;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(64);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(reporteordenes.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(reporteordenes.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 72;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 75;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",reporteordenes.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ ))),reporteordenes.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 76;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 79;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16384);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 80;BA.debugLine="Dim list As List";
Debug.ShouldStop(32768);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 81;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(65536);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 82;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(131072);
_json.runVoidMethod ("Initialize",(Object)(reporteordenes.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 83;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(262144);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 85;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(1048576);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobEliminar"))) {
case 0: {
 BA.debugLineNum = 88;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(8388608);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 89;BA.debugLine="ListViewOrdenes.Clear";
Debug.ShouldStop(16777216);
reporteordenes.mostCurrent._listviewordenes.runVoidMethod ("Clear");
 BA.debugLineNum = 90;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
Debug.ShouldStop(67108864);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay ordenes registradas")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 92;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 95;BA.debugLine="Dim secondLine As String";
Debug.ShouldStop(1073741824);
_secondline = RemoteObject.createImmutable("");Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 96;BA.debugLine="For i=0 To list.Size - 1";
Debug.ShouldStop(-2147483648);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 97;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(1);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 98;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
Debug.ShouldStop(2);
_secondline = RemoteObject.concat(RemoteObject.createImmutable("Fecha: "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fecha_regstro_orden")))),reporteordenes.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Estado: "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_status")))));Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 99;BA.debugLine="ListViewOrdenes.AddTwoLines2(map.Get(\"f_negoci";
Debug.ShouldStop(4);
reporteordenes.mostCurrent._listviewordenes.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_negocio")))),RemoteObject.createImmutable("   $"),reporteordenes.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))),(Object)(BA.ObjectToCharSequence(_secondline)),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 103;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(64);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 104;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 105;BA.debugLine="ListViewOrdenes.Clear";
Debug.ShouldStop(256);
reporteordenes.mostCurrent._listviewordenes.runVoidMethod ("Clear");
 BA.debugLineNum = 106;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
Debug.ShouldStop(512);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Orden cancelada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 107;BA.debugLine="btnBuscarReporte_Click";
Debug.ShouldStop(1024);
_btnbuscarreporte_click();
 }else {
 BA.debugLineNum = 109;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
Debug.ShouldStop(4096);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La orden ya no se puede ser cancelada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 };
 break; }
}
;
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewordenes_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewOrdenes_ItemClick (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,116);
if (RapidSub.canDelegate("listviewordenes_itemclick")) { return com.menube.app.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","listviewordenes_itemclick", _position, _value);}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobeliminar = RemoteObject.declareNull("com.menube.app.httpjob");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 116;BA.debugLine="Sub ListViewOrdenes_ItemClick (Position As Int, Va";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="Dim r As Int =  Msgbox2(\"Seguro que desea elimina";
Debug.ShouldStop(2097152);
_r = reporteordenes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Seguro que desea eliminar esta orden?")),(Object)(BA.ObjectToCharSequence("Confirmación")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Volver")),(Object)((reporteordenes.mostCurrent.__c.getField(false,"Null"))),reporteordenes.mostCurrent.activityBA);Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 120;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 121;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(16777216);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_value);Debug.locals.put("map", _map);
 BA.debugLineNum = 125;BA.debugLine="Dim json As String";
Debug.ShouldStop(268435456);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 126;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_idempresa':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idempresa")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 128;BA.debugLine="Dim JobEliminar As HttpJob";
Debug.ShouldStop(-2147483648);
_jobeliminar = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobEliminar", _jobeliminar);
 BA.debugLineNum = 129;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
Debug.ShouldStop(1);
_jobeliminar.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobEliminar")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 130;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
Debug.ShouldStop(2);
_jobeliminar.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_eliminar_orden"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 };
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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