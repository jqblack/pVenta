package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class reporteordenes_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,34);
if (RapidSub.canDelegate("activity_create")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","activity_create", _firsttime);}
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 34;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(2);
 BA.debugLineNum = 39;BA.debugLine="Activity.LoadLayout(\"frmReporteOrdenes\")";
Debug.ShouldStop(64);
reporteordenes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmReporteOrdenes")),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 41;BA.debugLine="ListViewOrdenes.TwoLinesLayout.ItemHeight = 85di";
Debug.ShouldStop(256);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",reporteordenes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85))));
 BA.debugLineNum = 42;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextColor =";
Debug.ShouldStop(512);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 43;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextSize =";
Debug.ShouldStop(1024);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 44;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.Typeface =";
Debug.ShouldStop(2048);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(false,"setTypeface",reporteordenes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 46;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.TextC";
Debug.ShouldStop(8192);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 47;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Typef";
Debug.ShouldStop(16384);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(false,"setTypeface",reporteordenes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 48;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Heigh";
Debug.ShouldStop(32768);
reporteordenes.mostCurrent._listviewordenes.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setHeight",reporteordenes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),reporteordenes.mostCurrent.activityBA));
 BA.debugLineNum = 49;BA.debugLine="funcion.SetDivider(ListViewOrdenes,Colors.Gray,1";
Debug.ShouldStop(65536);
reporteordenes.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._listviewordenes),(Object)(reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(reporteordenes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 52;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(524288);
if (reporteordenes.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 56;BA.debugLine="Dim r As Int";
Debug.ShouldStop(8388608);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
 BA.debugLineNum = 58;BA.debugLine="r = Msgbox2(\"Para ver sus ordenes debe de inici";
Debug.ShouldStop(33554432);
_r = reporteordenes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para ver sus ordenes debe de iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar Sesión?")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Más tarde")),(Object)((reporteordenes.mostCurrent.__c.getField(false,"Null"))),reporteordenes.mostCurrent.activityBA);Debug.locals.put("r", _r);
 BA.debugLineNum = 60;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 61;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(268435456);
reporteordenes.mostCurrent._main._mostar /*RemoteObject*/  = reporteordenes.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 62;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(536870912);
reporteordenes.mostCurrent.__c.runVoidMethod ("StartActivity",reporteordenes.processBA,(Object)((reporteordenes.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 65;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(1);
reporteordenes.mostCurrent.__c.runVoidMethod ("StartActivity",reporteordenes.processBA,(Object)((reporteordenes.mostCurrent._principal.getObject())));
 };
 };
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("Activity_Pause (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,96);
if (RapidSub.canDelegate("activity_pause")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 96;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Activity_Resume (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,72);
if (RapidSub.canDelegate("activity_resume")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","activity_resume");}
RemoteObject _jobbuscar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _r = RemoteObject.createImmutable(0);
 BA.debugLineNum = 72;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(512);
if (reporteordenes.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(2048);
_jobbuscar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 77;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(4096);
_jobbuscar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobBuscar")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 78;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_or";
Debug.ShouldStop(8192);
_jobbuscar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_ordenes_cliente"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 }else {
 BA.debugLineNum = 81;BA.debugLine="Dim r As Int";
Debug.ShouldStop(65536);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
 BA.debugLineNum = 83;BA.debugLine="r = Msgbox2(\"Para ver sus ordenes debe de inicia";
Debug.ShouldStop(262144);
_r = reporteordenes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para ver sus ordenes debe de iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar Sesión?")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Más tarde")),(Object)((reporteordenes.mostCurrent.__c.getField(false,"Null"))),reporteordenes.mostCurrent.activityBA);Debug.locals.put("r", _r);
 BA.debugLineNum = 85;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 86;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(2097152);
reporteordenes.mostCurrent._main._mostar /*RemoteObject*/  = reporteordenes.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 87;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4194304);
reporteordenes.mostCurrent.__c.runVoidMethod ("StartActivity",reporteordenes.processBA,(Object)((reporteordenes.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 90;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(33554432);
reporteordenes.mostCurrent.__c.runVoidMethod ("StartActivity",reporteordenes.processBA,(Object)((reporteordenes.mostCurrent._principal.getObject())));
 };
 };
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
public static RemoteObject  _btnaddallproorden_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddAllproOrden_Click (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,300);
if (RapidSub.canDelegate("btnaddallproorden_click")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnaddallproorden_click");}
RemoteObject _res = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 300;BA.debugLine="Sub btnAddAllproOrden_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 302;BA.debugLine="Dim res As Int = Msgbox2(\"Desea agregar todos los";
Debug.ShouldStop(8192);
_res = reporteordenes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Desea agregar todos los  productos al carrito?")),(Object)(BA.ObjectToCharSequence("Aviso!")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((reporteordenes.mostCurrent.__c.getField(false,"Null"))),reporteordenes.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 304;BA.debugLine="If res == DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 307;BA.debugLine="For i=0 To listaAddAll.Size-1";
Debug.ShouldStop(262144);
{
final int step3 = 1;
final int limit3 = RemoteObject.solve(new RemoteObject[] {reporteordenes._listaaddall.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step3 > 0 && _i <= limit3) || (step3 < 0 && _i >= limit3) ;_i = ((int)(0 + _i + step3))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 308;BA.debugLine="Log(i)";
Debug.ShouldStop(524288);
reporteordenes.mostCurrent.__c.runVoidMethod ("LogImpl","611993096",BA.NumberToString(_i),0);
 BA.debugLineNum = 309;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1048576);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 310;BA.debugLine="map = listaAddAll.Get(i)";
Debug.ShouldStop(2097152);
_map.setObject(reporteordenes._listaaddall.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 312;BA.debugLine="salvar_detalle_temporal_All(map,1)";
Debug.ShouldStop(8388608);
_salvar_detalle_temporal_all(_map,BA.numberCast(int.class, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 315;BA.debugLine="Msgbox(\"Se agregaron todos los productos en exis";
Debug.ShouldStop(67108864);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Se agregaron todos los productos en existencia, verifique en su carrito!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Realizado"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 316;BA.debugLine="btnbackProOrden_Click";
Debug.ShouldStop(134217728);
_btnbackproorden_click();
 }else {
 BA.debugLineNum = 319;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackproorden_click() throws Exception{
try {
		Debug.PushSubsStack("btnbackProOrden_Click (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,293);
if (RapidSub.canDelegate("btnbackproorden_click")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnbackproorden_click");}
 BA.debugLineNum = 293;BA.debugLine="Sub btnbackProOrden_Click";
Debug.ShouldStop(16);
 BA.debugLineNum = 295;BA.debugLine="funcion.DisableView(False,PanelOrdenes)";
Debug.ShouldStop(64);
reporteordenes.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent.__c.getField(true,"False")),(Object)(reporteordenes.mostCurrent._panelordenes));
 BA.debugLineNum = 296;BA.debugLine="PanelFondoOrdeDetalle.SetVisibleAnimated(250,Fals";
Debug.ShouldStop(128);
reporteordenes.mostCurrent._panelfondoordedetalle.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(reporteordenes.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnBuscarReporte_Click (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,104);
if (RapidSub.canDelegate("btnbuscarreporte_click")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnbuscarreporte_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 104;BA.debugLine="Sub btnBuscarReporte_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(512);
reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"setDateFormat",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 108;BA.debugLine="If DateTime.DateParse(DateTime.Date(date.GetDate)";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("k",reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(reporteordenes.mostCurrent._date.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))))),BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"DateParse",(Object)(reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(reporteordenes.mostCurrent._date2.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ )))))))) { 
 BA.debugLineNum = 110;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 111;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(date.GetDate";
Debug.ShouldStop(16384);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_fecha1':'"),reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(reporteordenes.mostCurrent._date.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))),RemoteObject.createImmutable("','f_fecha2':"),reporteordenes.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(reporteordenes.mostCurrent._date2.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));Debug.locals.put("json", _json);
 BA.debugLineNum = 112;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(32768);
_jobbuscar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 113;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(65536);
_jobbuscar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobBuscar")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 114;BA.debugLine="ToastMessageShow(\"Buscando ordenes...\",False)";
Debug.ShouldStop(131072);
reporteordenes.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Buscando ordenes...")),(Object)(reporteordenes.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 115;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_or";
Debug.ShouldStop(262144);
_jobbuscar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_ordenes_cliente2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 118;BA.debugLine="Msgbox(\"La fecha de inicio tiene que ser anteri";
Debug.ShouldStop(2097152);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La fecha de inicio tiene que ser anterior a la fecha límite!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 119;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnReporteBack_Click (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,100);
if (RapidSub.canDelegate("btnreporteback_click")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","btnreporteback_click");}
 BA.debugLineNum = 100;BA.debugLine="Sub btnReporteBack_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 101;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
reporteordenes.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 19;BA.debugLine="Private btnBuscarReporte As Button";
reporteordenes.mostCurrent._btnbuscarreporte = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnReporteBack As Button";
reporteordenes.mostCurrent._btnreporteback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private chOrdenesAbiertas As CheckBox";
reporteordenes.mostCurrent._chordenesabiertas = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private date As AnotherDatePicker";
reporteordenes.mostCurrent._date = RemoteObject.createNew ("com.jq.pedidos.anotherdatepicker");
 //BA.debugLineNum = 23;BA.debugLine="Private ListViewOrdenes As ListView";
reporteordenes.mostCurrent._listviewordenes = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PanelFondoOrdeDetalle As Panel";
reporteordenes.mostCurrent._panelfondoordedetalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lbltituloProOrden As Label";
reporteordenes.mostCurrent._lbltituloproorden = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private ListProOrdenDetalle As ListView";
reporteordenes.mostCurrent._listproordendetalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnbackProOrden As Button";
reporteordenes.mostCurrent._btnbackproorden = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnAddAllproOrden As Button";
reporteordenes.mostCurrent._btnaddallproorden = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelOrdenes As Panel";
reporteordenes.mostCurrent._panelordenes = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private date2 As AnotherDatePicker";
reporteordenes.mostCurrent._date2 = RemoteObject.createNew ("com.jq.pedidos.anotherdatepicker");
 //BA.debugLineNum = 31;BA.debugLine="Private Label3 As Label";
reporteordenes.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,125);
if (RapidSub.canDelegate("jobdone")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _secondline = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 125;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 127;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),reporteordenes.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 128;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(-2147483648);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(reporteordenes.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(reporteordenes.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 129;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 132;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",reporteordenes.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ ))),reporteordenes.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 133;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 136;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 137;BA.debugLine="Dim list As List";
Debug.ShouldStop(256);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 138;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(512);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 139;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(1024);
_json.runVoidMethod ("Initialize",(Object)(reporteordenes.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 140;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(2048);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 142;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobEliminar"),BA.ObjectToString("BuscarProducto"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobDetalleTemporalAll"))) {
case 0: {
 BA.debugLineNum = 145;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(65536);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 146;BA.debugLine="ListViewOrdenes.Clear";
Debug.ShouldStop(131072);
reporteordenes.mostCurrent._listviewordenes.runVoidMethod ("Clear");
 BA.debugLineNum = 147;BA.debugLine="If list.Size == 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 148;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
Debug.ShouldStop(524288);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay ordenes registradas")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 149;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 152;BA.debugLine="Label3.Text = \"Ordenes registradas: \"&list.Size";
Debug.ShouldStop(8388608);
reporteordenes.mostCurrent._label3.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Ordenes registradas: "),_list.runMethod(true,"getSize"))));
 BA.debugLineNum = 154;BA.debugLine="Dim secondLine As String";
Debug.ShouldStop(33554432);
_secondline = RemoteObject.createImmutable("");Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 155;BA.debugLine="For i=0 To list.Size - 1";
Debug.ShouldStop(67108864);
{
final int step23 = 1;
final int limit23 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step23 > 0 && _i <= limit23) || (step23 < 0 && _i >= limit23) ;_i = ((int)(0 + _i + step23))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 156;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(134217728);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 158;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
Debug.ShouldStop(536870912);
_secondline = RemoteObject.concat(RemoteObject.createImmutable("Fecha: "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fecha_regstro_orden")))),reporteordenes.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Estado: "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_status")))));Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 159;BA.debugLine="ListViewOrdenes.AddTwoLines2(map.Get(\"f_negoci";
Debug.ShouldStop(1073741824);
reporteordenes.mostCurrent._listviewordenes.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_negocio")))),RemoteObject.createImmutable("   $"),reporteordenes.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))),(Object)(BA.ObjectToCharSequence(_secondline)),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 163;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(4);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 164;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 165;BA.debugLine="ListViewOrdenes.Clear";
Debug.ShouldStop(16);
reporteordenes.mostCurrent._listviewordenes.runVoidMethod ("Clear");
 BA.debugLineNum = 166;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
Debug.ShouldStop(32);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Orden cancelada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 167;BA.debugLine="btnBuscarReporte_Click";
Debug.ShouldStop(64);
_btnbuscarreporte_click();
 }else {
 BA.debugLineNum = 169;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
Debug.ShouldStop(256);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La orden ya no se puede ser cancelada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 };
 break; }
case 2: {
 BA.debugLineNum = 174;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(8192);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 175;BA.debugLine="listaAddAll.Clear";
Debug.ShouldStop(16384);
reporteordenes._listaaddall.runVoidMethod ("Clear");
 BA.debugLineNum = 176;BA.debugLine="listaAddAll = list";
Debug.ShouldStop(32768);
reporteordenes._listaaddall = _list;
 BA.debugLineNum = 178;BA.debugLine="listAux = listaAddAll";
Debug.ShouldStop(131072);
reporteordenes._listaux = reporteordenes._listaaddall;
 BA.debugLineNum = 180;BA.debugLine="If PanelFondoOrdeDetalle.IsInitialized == False";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",reporteordenes.mostCurrent._panelfondoordedetalle.runMethod(true,"IsInitialized"),reporteordenes.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 182;BA.debugLine="Activity.LoadLayout(\"frmProductosOrdenDetalle\"";
Debug.ShouldStop(2097152);
reporteordenes.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProductosOrdenDetalle")),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 183;BA.debugLine="PanelFondoOrdeDetalle.Visible = False";
Debug.ShouldStop(4194304);
reporteordenes.mostCurrent._panelfondoordedetalle.runMethod(true,"setVisible",reporteordenes.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 185;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.ItemHeig";
Debug.ShouldStop(16777216);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",reporteordenes.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),reporteordenes.mostCurrent.activityBA));
 BA.debugLineNum = 187;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Te";
Debug.ShouldStop(67108864);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 188;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Te";
Debug.ShouldStop(134217728);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 189;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Ty";
Debug.ShouldStop(268435456);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",reporteordenes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 190;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Pa";
Debug.ShouldStop(536870912);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {reporteordenes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 192;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.SecondLa";
Debug.ShouldStop(-2147483648);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 193;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.SecondLa";
Debug.ShouldStop(1);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",reporteordenes.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 194;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.SecondLa";
Debug.ShouldStop(2);
reporteordenes.mostCurrent._listproordendetalle.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 196;BA.debugLine="funcion.SetDivider(ListProOrdenDetalle,Colors.";
Debug.ShouldStop(8);
reporteordenes.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._listproordendetalle),(Object)(reporteordenes.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(reporteordenes.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 201;BA.debugLine="funcion.DisableView(True,PanelOrdenes)";
Debug.ShouldStop(256);
reporteordenes.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent.__c.getField(true,"True")),(Object)(reporteordenes.mostCurrent._panelordenes));
 BA.debugLineNum = 202;BA.debugLine="lbltituloProOrden.Text = numOrden";
Debug.ShouldStop(512);
reporteordenes.mostCurrent._lbltituloproorden.runMethod(true,"setText",BA.ObjectToCharSequence(reporteordenes._numorden));
 BA.debugLineNum = 203;BA.debugLine="PanelFondoOrdeDetalle.SetVisibleAnimated(250,Tr";
Debug.ShouldStop(1024);
reporteordenes.mostCurrent._panelfondoordedetalle.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(reporteordenes.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 205;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(4096);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 207;BA.debugLine="ListProOrdenDetalle.Clear";
Debug.ShouldStop(16384);
reporteordenes.mostCurrent._listproordendetalle.runVoidMethod ("Clear");
 BA.debugLineNum = 209;BA.debugLine="For i = 0 To list.Size-1";
Debug.ShouldStop(65536);
{
final int step60 = 1;
final int limit60 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step60 > 0 && _i <= limit60) || (step60 < 0 && _i >= limit60) ;_i = ((int)(0 + _i + step60))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 211;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(262144);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 212;BA.debugLine="mapa = list.Get(i)";
Debug.ShouldStop(524288);
_mapa.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 214;BA.debugLine="If  mapa.Get(\"f_foto\")<> Null And  mapa.Get(\"f";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 215;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(4194304);
_bm = reporteordenes.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 217;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-i";
Debug.ShouldStop(16777216);
_bm.runVoidMethod ("Initialize",(Object)((reporteordenes.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(reporteordenes.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 };
 BA.debugLineNum = 220;BA.debugLine="ListProOrdenDetalle.AddTwoLinesAndBitmap2(mapa";
Debug.ShouldStop(134217728);
reporteordenes.mostCurrent._listproordendetalle.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre")))))),(Object)(BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(_bm.runMethod(false,"getBitmap")),(Object)((_mapa.getObject())));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 226;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(2);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 227;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 228;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(8);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),reporteordenes.mostCurrent.__c.getField(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable(".")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 229;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 231;BA.debugLine="Principal.cantidadProduto = Principal.cantidadP";
Debug.ShouldStop(64);
reporteordenes.mostCurrent._principal._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {reporteordenes.mostCurrent._principal._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 234;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
Debug.ShouldStop(512);
reporteordenes.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto agregado al carrito.")),(Object)(reporteordenes.mostCurrent.__c.getField(true,"False")));
 break; }
case 4: {
 BA.debugLineNum = 238;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(8192);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 239;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 240;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(32768);
reporteordenes.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),reporteordenes.mostCurrent.__c.getField(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable(".")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),reporteordenes.mostCurrent.activityBA);
 BA.debugLineNum = 241;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 243;BA.debugLine="Principal.cantidadProduto = Principal.cantidadP";
Debug.ShouldStop(262144);
reporteordenes.mostCurrent._principal._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {reporteordenes.mostCurrent._principal._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 break; }
}
;
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listproordendetalle_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListProOrdenDetalle_ItemClick (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,324);
if (RapidSub.canDelegate("listproordendetalle_itemclick")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","listproordendetalle_itemclick", _position, _value);}
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _mapapro = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 324;BA.debugLine="Sub ListProOrdenDetalle_ItemClick (Position As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 326;BA.debugLine="Dim res As Int = Msgbox2(\"Desea agregar este prod";
Debug.ShouldStop(32);
_res = reporteordenes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Desea agregar este producto al carrito?")),(Object)(BA.ObjectToCharSequence("Aviso!")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((reporteordenes.mostCurrent.__c.getField(false,"Null"))),reporteordenes.mostCurrent.activityBA);Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 328;BA.debugLine="If res == DialogResponse.POSITIVE Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 330;BA.debugLine="Dim mapaPro As Map";
Debug.ShouldStop(512);
_mapapro = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapaPro", _mapapro);
 BA.debugLineNum = 331;BA.debugLine="mapaPro = Value";
Debug.ShouldStop(1024);
_mapapro.setObject(_value);
 BA.debugLineNum = 333;BA.debugLine="listAux.Clear";
Debug.ShouldStop(4096);
reporteordenes._listaux.runVoidMethod ("Clear");
 BA.debugLineNum = 335;BA.debugLine="For i=0 To listaAddAll.Size -1";
Debug.ShouldStop(16384);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {reporteordenes._listaaddall.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 336;BA.debugLine="Dim map As Map";
Debug.ShouldStop(32768);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 337;BA.debugLine="map = listaAddAll.Get(i)";
Debug.ShouldStop(65536);
_map.setObject(reporteordenes._listaaddall.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 339;BA.debugLine="If map.Get(\"f_idrecord\") == mapaPro.Get(\"f_idre";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mapapro.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 340;BA.debugLine="listaAddAll.RemoveAt(Position)";
Debug.ShouldStop(524288);
reporteordenes._listaaddall.runVoidMethod ("RemoveAt",(Object)(_position));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 344;BA.debugLine="salvar_detalle_temporal(mapaPro,1)";
Debug.ShouldStop(8388608);
_salvar_detalle_temporal(_mapapro,BA.numberCast(int.class, 1));
 }else {
 BA.debugLineNum = 347;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("ListViewOrdenes_ItemClick (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,249);
if (RapidSub.canDelegate("listviewordenes_itemclick")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","listviewordenes_itemclick", _position, _value);}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _buscarproducto = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 249;BA.debugLine="Sub ListViewOrdenes_ItemClick (Position As Int, Va";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 253;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(268435456);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 254;BA.debugLine="mapa = Value";
Debug.ShouldStop(536870912);
_mapa.setObject(_value);
 BA.debugLineNum = 256;BA.debugLine="Dim json As String = \"'f_idrecord':\"&mapa.Get(\"f_";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 258;BA.debugLine="Dim BuscarProducto As HttpJob";
Debug.ShouldStop(2);
_buscarproducto = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("BuscarProducto", _buscarproducto);
 BA.debugLineNum = 259;BA.debugLine="BuscarProducto.Initialize(\"BuscarProducto\",Me)";
Debug.ShouldStop(4);
_buscarproducto.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("BuscarProducto")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 261;BA.debugLine="numOrden = mapa.Get(\"f_numero\")";
Debug.ShouldStop(16);
reporteordenes._numorden = BA.ObjectToString(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_numero")))));
 BA.debugLineNum = 262;BA.debugLine="listaAddAll.Initialize";
Debug.ShouldStop(32);
reporteordenes._listaaddall.runVoidMethod ("Initialize");
 BA.debugLineNum = 264;BA.debugLine="BuscarProducto.PostString(Main.url&\"puntoventa/bu";
Debug.ShouldStop(128);
_buscarproducto.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/buscar_productos_by_orden"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewordenes_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewOrdenes_ItemLongClick (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,270);
if (RapidSub.canDelegate("listviewordenes_itemlongclick")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","listviewordenes_itemlongclick", _position, _value);}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobeliminar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 270;BA.debugLine="Sub ListViewOrdenes_ItemLongClick (Position As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 274;BA.debugLine="Dim r As Int =  Msgbox2(\"Seguro que desea elimina";
Debug.ShouldStop(131072);
_r = reporteordenes.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Seguro que desea eliminar esta orden?")),(Object)(BA.ObjectToCharSequence("Confirmación")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Volver")),(Object)((reporteordenes.mostCurrent.__c.getField(false,"Null"))),reporteordenes.mostCurrent.activityBA);Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 276;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, reporteordenes.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 277;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(1048576);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_value);Debug.locals.put("map", _map);
 BA.debugLineNum = 281;BA.debugLine="Dim json As String";
Debug.ShouldStop(16777216);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 282;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
Debug.ShouldStop(33554432);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_idempresa':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idempresa")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 284;BA.debugLine="Dim JobEliminar As HttpJob";
Debug.ShouldStop(134217728);
_jobeliminar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobEliminar", _jobeliminar);
 BA.debugLineNum = 285;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
Debug.ShouldStop(268435456);
_jobeliminar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobEliminar")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 286;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
Debug.ShouldStop(536870912);
_jobeliminar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_eliminar_orden"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 };
 BA.debugLineNum = 290;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
 //BA.debugLineNum = 10;BA.debugLine="Dim numOrden As String";
reporteordenes._numorden = RemoteObject.createImmutable("");
 //BA.debugLineNum = 11;BA.debugLine="Dim listaAddAll As List";
reporteordenes._listaaddall = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 12;BA.debugLine="Dim listAux As List";
reporteordenes._listaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,352);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 352;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 354;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(2);
_mapcalculos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapcalculos = reporteordenes.mostCurrent._funcion.runMethod(false,"_recalcular" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(reporteordenes.mostCurrent._principal._impuestoincluido /*RemoteObject*/ ),(Object)(reporteordenes.mostCurrent.__c.getField(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 356;BA.debugLine="Dim json As String";
Debug.ShouldStop(8);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 357;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(16);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),reporteordenes.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),reporteordenes.mostCurrent._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 371;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(262144);
_jobdetalletemporal = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 372;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(524288);
_jobdetalletemporal.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 373;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(1048576);
_jobdetalletemporal.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 375;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _salvar_detalle_temporal_all(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal_All (reporteordenes) ","reporteordenes",7,reporteordenes.mostCurrent.activityBA,reporteordenes.mostCurrent,377);
if (RapidSub.canDelegate("salvar_detalle_temporal_all")) { return com.jq.pedidos.reporteordenes.remoteMe.runUserSub(false, "reporteordenes","salvar_detalle_temporal_all", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal2 = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 377;BA.debugLine="Sub salvar_detalle_temporal_All(map As Map, cantid";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 379;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(67108864);
_mapcalculos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapcalculos = reporteordenes.mostCurrent._funcion.runMethod(false,"_recalcular" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(reporteordenes.mostCurrent._principal._impuestoincluido /*RemoteObject*/ ),(Object)(reporteordenes.mostCurrent.__c.getField(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 381;BA.debugLine="Dim json As String";
Debug.ShouldStop(268435456);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 382;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),reporteordenes.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),reporteordenes.mostCurrent._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 396;BA.debugLine="Dim JobDetalleTemporal2 As HttpJob";
Debug.ShouldStop(2048);
_jobdetalletemporal2 = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDetalleTemporal2", _jobdetalletemporal2);
 BA.debugLineNum = 397;BA.debugLine="JobDetalleTemporal2.Initialize(\"JobDetalleTempora";
Debug.ShouldStop(4096);
_jobdetalletemporal2.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,reporteordenes.processBA,(Object)(BA.ObjectToString("JobDetalleTemporalAll")),(Object)(reporteordenes.getObject()));
 BA.debugLineNum = 398;BA.debugLine="JobDetalleTemporal2.PostString(Main.url&\"puntoven";
Debug.ShouldStop(8192);
_jobdetalletemporal2.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(reporteordenes.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),reporteordenes.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,reporteordenes.mostCurrent.activityBA,(Object)(reporteordenes.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}