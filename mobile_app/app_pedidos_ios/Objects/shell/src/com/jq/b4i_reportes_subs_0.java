package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_reportes_subs_0 {


public static RemoteObject  _btnaceptardate_click() throws Exception{
try {
		Debug.PushSubsStack("btnAceptarDate_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,102);
if (RapidSub.canDelegate("btnaceptardate_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","btnaceptardate_click");}
 BA.debugLineNum = 102;BA.debugLine="Sub btnAceptarDate_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 104;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(128);
b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"setDateFormat:",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 106;BA.debugLine="If cualFe Then";
Debug.ShouldStop(512);
if (b4i_reportes._cualfe.getBoolean()) { 
 BA.debugLineNum = 107;BA.debugLine="lblFechaInicio.Text = DateTime.Date(DateFecha.Ti";
Debug.ShouldStop(1024);
b4i_reportes._lblfechainicio.runMethod(true,"setText:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_reportes._datefecha.runMethod(true,"Ticks"))));
 }else {
 BA.debugLineNum = 109;BA.debugLine="lblfechaFinal.Text =  DateTime.Date(DateFecha.Ti";
Debug.ShouldStop(4096);
b4i_reportes._lblfechafinal.runMethod(true,"setText:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_reportes._datefecha.runMethod(true,"Ticks"))));
 };
 BA.debugLineNum = 112;BA.debugLine="btnCancelarDate_Click";
Debug.ShouldStop(32768);
_btncancelardate_click();
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
public static RemoteObject  _btnaddallproorden_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddAllproOrden_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,348);
if (RapidSub.canDelegate("btnaddallproorden_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","btnaddallproorden_click");}
 BA.debugLineNum = 348;BA.debugLine="Sub btnAddAllproOrden_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 350;BA.debugLine="Msgbox2(\"Msg3\",\"Desea agregar todos los productos";
Debug.ShouldStop(536870912);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_reportes.ba,(Object)(BA.ObjectToString("Msg3")),(Object)(BA.ObjectToString("Desea agregar todos los productos a su carrito?")),(Object)(BA.ObjectToString("Aviso!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnbackProOrden_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,344);
if (RapidSub.canDelegate("btnbackproorden_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","btnbackproorden_click");}
 BA.debugLineNum = 344;BA.debugLine="Sub btnbackProOrden_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 345;BA.debugLine="PanelFondoDetalleOrden.SetAlphaAnimated(500,0)";
Debug.ShouldStop(16777216);
b4i_reportes._panelfondodetalleorden.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
		Debug.PushSubsStack("btnBuscarReporte_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,262);
if (RapidSub.canDelegate("btnbuscarreporte_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","btnbuscarreporte_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 262;BA.debugLine="Sub btnBuscarReporte_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 266;BA.debugLine="If DateTime.DateParse(lblfechaFinal.Text) >= Date";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("g",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"DateParse:",(Object)(b4i_reportes._lblfechafinal.runMethod(true,"Text"))),BA.numberCast(double.class, b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"DateParse:",(Object)(b4i_reportes._lblfechainicio.runMethod(true,"Text")))))) { 
 BA.debugLineNum = 268;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(2048);
b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"setDateFormat:",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 270;BA.debugLine="Dim json As String";
Debug.ShouldStop(8192);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 271;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(DateTime.Dat";
Debug.ShouldStop(16384);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_fecha1':'"),b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"DateParse:",(Object)(b4i_reportes._lblfechainicio.runMethod(true,"Text"))))),RemoteObject.createImmutable("','f_fecha2':"),b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"DateParse:",(Object)(b4i_reportes._lblfechafinal.runMethod(true,"Text"))))));Debug.locals.put("json", _json);
 BA.debugLineNum = 273;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(65536);
_jobbuscar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 274;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(131072);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reportes.ba,(Object)(BA.ObjectToString("JobBuscar")),(Object)(b4i_reportes.getObject()));
 BA.debugLineNum = 275;BA.debugLine="hud.ToastMessageShow(\"Buscando ordenes...\",False";
Debug.ShouldStop(262144);
b4i_reportes._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Buscando ordenes...")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 276;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_or";
Debug.ShouldStop(524288);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reportes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_ordenes_cliente2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reportes._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reportes._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 279;BA.debugLine="Msgbox(\"La fecha final debe ser mayor a la fech";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La fecha final debe ser mayor a la fecha de inicio para poder realizar la busqueda!!")),(Object)(RemoteObject.createImmutable("Advertencia!")));
 };
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
public static RemoteObject  _btncancelardate_click() throws Exception{
try {
		Debug.PushSubsStack("btnCancelarDate_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,96);
if (RapidSub.canDelegate("btncancelardate_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","btncancelardate_click");}
 BA.debugLineNum = 96;BA.debugLine="Sub btnCancelarDate_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 98;BA.debugLine="PanelFondoDatePicker.SetAlphaAnimated(500,0)";
Debug.ShouldStop(2);
b4i_reportes._panelfondodatepicker.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
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
public static RemoteObject  _btnreporteback_click() throws Exception{
try {
		Debug.PushSubsStack("btnReporteBack_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,447);
if (RapidSub.canDelegate("btnreporteback_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","btnreporteback_click");}
 BA.debugLineNum = 447;BA.debugLine="Sub btnReporteBack_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 449;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(1);
b4i_reportes._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 450;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(2);
b4i_reportes._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 452;BA.debugLine="Main.actualizarCantidad";
Debug.ShouldStop(8);
b4i_reportes._main.runVoidMethod ("_actualizarcantidad" /*RemoteObject*/ );
 BA.debugLineNum = 453;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buscarordenes() throws Exception{
try {
		Debug.PushSubsStack("BuscarOrdenes (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,116);
if (RapidSub.canDelegate("buscarordenes")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","buscarordenes");}
RemoteObject _jobbuscar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 116;BA.debugLine="Sub BuscarOrdenes";
Debug.ShouldStop(524288);
 BA.debugLineNum = 118;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(2097152);
_jobbuscar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 119;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(4194304);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reportes.ba,(Object)(BA.ObjectToString("JobBuscar")),(Object)(b4i_reportes.getObject()));
 BA.debugLineNum = 120;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_ord";
Debug.ShouldStop(8388608);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reportes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_ordenes_cliente"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reportes._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reportes._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
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
public static RemoteObject  _createlistitem(RemoteObject _dir,RemoteObject _fecha,RemoteObject _principal,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,250);
if (RapidSub.canDelegate("createlistitem")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","createlistitem", _dir, _fecha, _principal, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("fecha", _fecha);
Debug.locals.put("principal", _principal);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 250;BA.debugLine="Sub CreateListItem(Dir As String, fecha As String,";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 251;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(67108864);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 252;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("Initialize::",b4i_reportes.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 253;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(268435456);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 254;BA.debugLine="p.LoadLayout(\"frmItemsDir\")";
Debug.ShouldStop(536870912);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmItemsDir")),b4i_reportes.ba);
 BA.debugLineNum = 255;BA.debugLine="lblDir.Text = Dir";
Debug.ShouldStop(1073741824);
b4i_reportes._lbldir.runMethod(true,"setText:",_dir);
 BA.debugLineNum = 256;BA.debugLine="lblFecha.Text = fecha";
Debug.ShouldStop(-2147483648);
b4i_reportes._lblfecha.runMethod(true,"setText:",_fecha);
 BA.debugLineNum = 257;BA.debugLine="lblPrincipal.Text = principal";
Debug.ShouldStop(1);
b4i_reportes._lblprincipal.runMethod(true,"setText:",_principal);
 BA.debugLineNum = 258;BA.debugLine="Return p";
Debug.ShouldStop(2);
if (true) return _p;
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem2(RemoteObject _nombre,RemoteObject _cantidad,RemoteObject _img,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem2 (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,239);
if (RapidSub.canDelegate("createlistitem2")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","createlistitem2", _nombre, _cantidad, _img, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("img", _img);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 239;BA.debugLine="Sub CreateListItem2(Nombre As String, cantidad As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(32768);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 241;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(65536);
_p.runVoidMethod ("Initialize::",b4i_reportes.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 242;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 243;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
Debug.ShouldStop(262144);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPanelesItems")),b4i_reportes.ba);
 BA.debugLineNum = 244;BA.debugLine="lblNomCat.Text = Nombre";
Debug.ShouldStop(524288);
b4i_reportes._lblnomcat.runMethod(true,"setText:",_nombre);
 BA.debugLineNum = 245;BA.debugLine="lblCantCat.Text = \"$ \"&cantidad";
Debug.ShouldStop(1048576);
b4i_reportes._lblcantcat.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$ "),_cantidad));
 BA.debugLineNum = 246;BA.debugLine="imgCat.Bitmap = img";
Debug.ShouldStop(2097152);
b4i_reportes._imgcat.runMethod(false,"setBitmap:",_img);
 BA.debugLineNum = 247;BA.debugLine="Return p";
Debug.ShouldStop(4194304);
if (true) return _p;
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,50);
if (RapidSub.canDelegate("initialize")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","initialize");}
 BA.debugLineNum = 50;BA.debugLine="Sub Initialize";
Debug.ShouldStop(131072);
 BA.debugLineNum = 52;BA.debugLine="pageReporte.Initialize(\"pageReporte\")";
Debug.ShouldStop(524288);
b4i_reportes._pagereporte.runVoidMethod ("Initialize::",b4i_reportes.ba,(Object)(RemoteObject.createImmutable("pageReporte")));
 BA.debugLineNum = 53;BA.debugLine="pageReporte.RootPanel.LoadLayout(\"frmReportesOrde";
Debug.ShouldStop(1048576);
b4i_reportes._pagereporte.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmReportesOrdenes")),b4i_reportes.ba);
 BA.debugLineNum = 54;BA.debugLine="Main.NavControl.ShowPage(pageReporte)";
Debug.ShouldStop(2097152);
b4i_reportes._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_reportes._pagereporte).getObject())));
 BA.debugLineNum = 56;BA.debugLine="PanelEncabezadoRepo.SetShadow(Colors.Gray,0dip,2d";
Debug.ShouldStop(8388608);
b4i_reportes._panelencabezadorepo.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 57;BA.debugLine="PanelEncabezadoM.SetShadow(Colors.Gray,0dip,2dip,";
Debug.ShouldStop(16777216);
b4i_reportes._panelencabezadom.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 58;BA.debugLine="Panel2.SetShadow(Colors.Gray,1dip,2dip,0.3,True)";
Debug.ShouldStop(33554432);
b4i_reportes._panel2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 59;BA.debugLine="btnBuscarReporte.SetShadow(Colors.Gray,1dip,2dip,";
Debug.ShouldStop(67108864);
b4i_reportes._btnbuscarreporte.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 60;BA.debugLine="btnAceptarDate.SetShadow(Colors.Gray,1dip,2dip,0.";
Debug.ShouldStop(134217728);
b4i_reportes._btnaceptardate.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="btnCancelarDate.SetShadow(Colors.Gray,1dip,2dip,0";
Debug.ShouldStop(268435456);
b4i_reportes._btncancelardate.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 62;BA.debugLine="btnbackProOrden.SetShadow(Colors.Gray,1dip,2dip,0";
Debug.ShouldStop(536870912);
b4i_reportes._btnbackproorden.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="btnAddAllproOrden.SetShadow(Colors.Gray,1dip,2dip";
Debug.ShouldStop(1073741824);
b4i_reportes._btnaddallproorden.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 65;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
Debug.ShouldStop(1);
b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"setDateFormat:",BA.ObjectToString("yyyy-MM-dd"));
 BA.debugLineNum = 67;BA.debugLine="lblFechaInicio.Text = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(4);
b4i_reportes._lblfechainicio.runMethod(true,"setText:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"))));
 BA.debugLineNum = 68;BA.debugLine="lblfechaFinal.Text = DateTime.Date(DateTime.Now)";
Debug.ShouldStop(8);
b4i_reportes._lblfechafinal.runMethod(true,"setText:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"))));
 BA.debugLineNum = 69;BA.debugLine="BuscarOrdenes";
Debug.ShouldStop(16);
_buscarordenes();
 BA.debugLineNum = 71;BA.debugLine="Main.smc.Tag = \"reporte\"";
Debug.ShouldStop(64);
b4i_reportes._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("reporte")));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("JobDone (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,124);
if (RapidSub.canDelegate("jobdone")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _titulo = RemoteObject.createImmutable("");
RemoteObject _secondline = RemoteObject.createImmutable("");
RemoteObject _estado = RemoteObject.createImmutable("");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 124;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 127;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(1073741824);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_reportes._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_reportes._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 128;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 131;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",b4i_reportes._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 132;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 135;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 136;BA.debugLine="Dim list As List";
Debug.ShouldStop(128);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 137;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(256);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 138;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
Debug.ShouldStop(512);
_json.runVoidMethod ("Initialize:",(Object)(b4i_reportes._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 139;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(1024);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 141;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobEliminar"),BA.ObjectToString("BuscarProducto"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobDetalleTemporalAll"))) {
case 0: {
 BA.debugLineNum = 144;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(32768);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 146;BA.debugLine="If list.Size == 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 147;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
Debug.ShouldStop(262144);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No hay ordenes registradas")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 148;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 151;BA.debugLine="Label3.Text = \"Ordenes registradas: \"&list.Size";
Debug.ShouldStop(4194304);
b4i_reportes._label3.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("Ordenes registradas: "),_list.runMethod(true,"Size")));
 BA.debugLineNum = 153;BA.debugLine="Dim titulo As String";
Debug.ShouldStop(16777216);
_titulo = RemoteObject.createImmutable("");Debug.locals.put("titulo", _titulo);
 BA.debugLineNum = 154;BA.debugLine="Dim secondLine As String";
Debug.ShouldStop(33554432);
_secondline = RemoteObject.createImmutable("");Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 155;BA.debugLine="Dim estado As String";
Debug.ShouldStop(67108864);
_estado = RemoteObject.createImmutable("");Debug.locals.put("estado", _estado);
 BA.debugLineNum = 157;BA.debugLine="listaOrdenes.Clear";
Debug.ShouldStop(268435456);
b4i_reportes._listaordenes.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 159;BA.debugLine="For i=0 To list.Size - 1";
Debug.ShouldStop(1073741824);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 161;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(1);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 163;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
Debug.ShouldStop(4);
_secondline = RemoteObject.concat(RemoteObject.createImmutable("Fecha: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fecha_regstro_orden")))));Debug.locals.put("secondLine", _secondline);
 BA.debugLineNum = 164;BA.debugLine="estado = \"Estado: \"&map.Get(\"f_status\")";
Debug.ShouldStop(8);
_estado = RemoteObject.concat(RemoteObject.createImmutable("Estado: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_status")))));Debug.locals.put("estado", _estado);
 BA.debugLineNum = 165;BA.debugLine="titulo = map.Get(\"f_negocio\")&\"   $\"&NumberFor";
Debug.ShouldStop(16);
_titulo = RemoteObject.concat(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_negocio")))),RemoteObject.createImmutable("   $"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));Debug.locals.put("titulo", _titulo);
 BA.debugLineNum = 167;BA.debugLine="listaOrdenes.Add(CreateListItem(titulo,secondL";
Debug.ShouldStop(64);
b4i_reportes._listaordenes.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(_titulo,_secondline,_estado,BA.numberCast(int.class, b4i_reportes._listaordenes.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 65))))).getObject()),(Object)((_map)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 1: {
 BA.debugLineNum = 172;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(2048);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 173;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 174;BA.debugLine="listaOrdenes.RemoveAt(indiceBorrar)";
Debug.ShouldStop(8192);
b4i_reportes._listaordenes.runClassMethod (b4i_customlistview.class, "_removeat:" /*RemoteObject*/ ,(Object)(b4i_reportes._indiceborrar));
 BA.debugLineNum = 175;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
Debug.ShouldStop(16384);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Orden cancelada.")),(Object)(RemoteObject.createImmutable("Información")));
 }else {
 BA.debugLineNum = 178;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La orden ya no se puede ser cancelada.")),(Object)(RemoteObject.createImmutable("Información")));
 };
 break; }
case 2: {
 BA.debugLineNum = 183;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(4194304);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 184;BA.debugLine="listaAddAll.Clear";
Debug.ShouldStop(8388608);
b4i_reportes._listaaddall.runVoidMethod ("Clear");
 BA.debugLineNum = 185;BA.debugLine="listaAddAll = list";
Debug.ShouldStop(16777216);
b4i_reportes._listaaddall = _list;
 BA.debugLineNum = 187;BA.debugLine="listAux = listaAddAll";
Debug.ShouldStop(67108864);
b4i_reportes._listaux = b4i_reportes._listaaddall;
 BA.debugLineNum = 189;BA.debugLine="PanelFondoDetalleOrden.Top = 0%y";
Debug.ShouldStop(268435456);
b4i_reportes._panelfondodetalleorden.runMethod(true,"setTop:",b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 190;BA.debugLine="PanelFondoDetalleOrden.SetAlphaAnimated(500,1)";
Debug.ShouldStop(536870912);
b4i_reportes._panelfondodetalleorden.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 192;BA.debugLine="lbltituloProOrden.Text = numOrden";
Debug.ShouldStop(-2147483648);
b4i_reportes._lbltituloproorden.runMethod(true,"setText:",b4i_reportes._numorden);
 BA.debugLineNum = 194;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(2);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 196;BA.debugLine="ListProOrdenDetalle.Clear";
Debug.ShouldStop(8);
b4i_reportes._listproordendetalle.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 198;BA.debugLine="For i = 0 To list.Size-1";
Debug.ShouldStop(32);
{
final int step50 = 1;
final int limit50 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step50 > 0 && _i <= limit50) || (step50 < 0 && _i >= limit50) ;_i = ((int)(0 + _i + step50))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 200;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(128);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 201;BA.debugLine="mapa = list.Get(i)";
Debug.ShouldStop(256);
_mapa = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 204;BA.debugLine="If  mapa.Get(\"f_foto\")<> Null And  mapa.Get(\"f";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 205;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(4096);
_bm = b4i_reportes._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 208;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(32768);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 211;BA.debugLine="ListProOrdenDetalle.Add(CreateListItem2(mapa.G";
Debug.ShouldStop(262144);
b4i_reportes._listproordendetalle.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem2(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))),BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),_bm,BA.numberCast(int.class, b4i_reportes._listproordendetalle.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_mapa)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 217;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(16777216);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 218;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 219;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(67108864);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),b4i_main.__c.runMethod(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 220;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 222;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
Debug.ShouldStop(536870912);
b4i_reportes._main._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4i_reportes._main._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 223;BA.debugLine="hud.ToastMessageShow(\"Producto agregado...\",Fal";
Debug.ShouldStop(1073741824);
b4i_reportes._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto agregado...")),(Object)(b4i_main.__c.runMethod(true,"False")));
 break; }
case 4: {
 BA.debugLineNum = 227;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(4);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 228;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 229;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(16);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),b4i_main.__c.runMethod(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 230;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 232;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
Debug.ShouldStop(128);
b4i_reportes._main._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4i_reportes._main._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 break; }
}
;
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listaordenes_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listaOrdenes_ItemClick (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,314);
if (RapidSub.canDelegate("listaordenes_itemclick")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","listaordenes_itemclick", _index, _value);}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _buscarproducto = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 314;BA.debugLine="Sub listaOrdenes_ItemClick (Index As Int, Value As";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 318;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(536870912);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 319;BA.debugLine="mapa = Value";
Debug.ShouldStop(1073741824);
_mapa = (_value);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 321;BA.debugLine="Dim json As String = \"'f_idrecord':\"&mapa.Get(\"f_";
Debug.ShouldStop(1);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 323;BA.debugLine="Dim BuscarProducto As HttpJob";
Debug.ShouldStop(4);
_buscarproducto = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("BuscarProducto", _buscarproducto);
 BA.debugLineNum = 324;BA.debugLine="BuscarProducto.Initialize(\"BuscarProducto\",Me)";
Debug.ShouldStop(8);
_buscarproducto.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reportes.ba,(Object)(BA.ObjectToString("BuscarProducto")),(Object)(b4i_reportes.getObject()));
 BA.debugLineNum = 326;BA.debugLine="numOrden = mapa.Get(\"f_numero\")";
Debug.ShouldStop(32);
b4i_reportes._numorden = BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_numero")))));
 BA.debugLineNum = 327;BA.debugLine="listaAddAll.Initialize";
Debug.ShouldStop(64);
b4i_reportes._listaaddall.runVoidMethod ("Initialize");
 BA.debugLineNum = 329;BA.debugLine="BuscarProducto.PostString(Main.url&\"puntoventa/bu";
Debug.ShouldStop(256);
_buscarproducto.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reportes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/buscar_productos_by_orden"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reportes._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reportes._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listaordenes_itemlongclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("listaOrdenes_ItemLongClick (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,284);
if (RapidSub.canDelegate("listaordenes_itemlongclick")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","listaordenes_itemlongclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 284;BA.debugLine="Sub listaOrdenes_ItemLongClick (Index As Int, Valu";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 287;BA.debugLine="Msgbox2(\"Msg1\",\"Desea elimiar esta orden?\",\"Adver";
Debug.ShouldStop(1073741824);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_reportes.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Desea elimiar esta orden?")),(Object)(BA.ObjectToString("Advertencia!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 288;BA.debugLine="mapaBorrar.Initialize";
Debug.ShouldStop(-2147483648);
b4i_reportes._mapaborrar.runVoidMethod ("Initialize");
 BA.debugLineNum = 289;BA.debugLine="mapaBorrar = Value";
Debug.ShouldStop(1);
b4i_reportes._mapaborrar = (_value);
 BA.debugLineNum = 290;BA.debugLine="indiceBorrar = Index";
Debug.ShouldStop(2);
b4i_reportes._indiceborrar = _index;
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listproordendetalle_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListProOrdenDetalle_ItemClick (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,335);
if (RapidSub.canDelegate("listproordendetalle_itemclick")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","listproordendetalle_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 335;BA.debugLine="Sub ListProOrdenDetalle_ItemClick (Index As Int, V";
Debug.ShouldStop(16384);
 BA.debugLineNum = 337;BA.debugLine="Msgbox2(\"Msg2\",\"Desea agregar este producto a su";
Debug.ShouldStop(65536);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_reportes.ba,(Object)(BA.ObjectToString("Msg2")),(Object)(BA.ObjectToString("Desea agregar este producto a su carrito?")),(Object)(BA.ObjectToString("Aviso!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 339;BA.debugLine="mapaDetalleOrden = Value";
Debug.ShouldStop(262144);
b4i_reportes._mapadetalleorden = (_value);
 BA.debugLineNum = 340;BA.debugLine="indiceDetalleOrden = Index";
Debug.ShouldStop(524288);
b4i_reportes._indicedetalleorden = _index;
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msg1_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("Msg1_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,295);
if (RapidSub.canDelegate("msg1_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","msg1_click", _buttontext);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobeliminar = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 295;BA.debugLine="Sub Msg1_Click(ButtonText As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 297;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 299;BA.debugLine="Dim map As Map = mapaBorrar";
Debug.ShouldStop(1024);
_map = b4i_reportes._mapaborrar;Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 301;BA.debugLine="Dim json As String";
Debug.ShouldStop(4096);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 302;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
Debug.ShouldStop(8192);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_idempresa':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idempresa")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 304;BA.debugLine="Dim JobEliminar As HttpJob";
Debug.ShouldStop(32768);
_jobeliminar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEliminar", _jobeliminar);
 BA.debugLineNum = 305;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
Debug.ShouldStop(65536);
_jobeliminar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reportes.ba,(Object)(BA.ObjectToString("JobEliminar")),(Object)(b4i_reportes.getObject()));
 BA.debugLineNum = 306;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
Debug.ShouldStop(131072);
_jobeliminar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reportes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_eliminar_orden"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reportes._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reportes._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else 
{ BA.debugLineNum = 308;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 309;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msg2_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("Msg2_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,355);
if (RapidSub.canDelegate("msg2_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","msg2_click", _buttontext);}
RemoteObject _mapapro = RemoteObject.declareNull("B4IMap");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 355;BA.debugLine="Sub Msg2_Click(ButtonText As String)";
Debug.ShouldStop(4);
 BA.debugLineNum = 357;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 359;BA.debugLine="Dim mapaPro As Map";
Debug.ShouldStop(64);
_mapapro = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapaPro", _mapapro);
 BA.debugLineNum = 360;BA.debugLine="mapaPro = mapaDetalleOrden";
Debug.ShouldStop(128);
_mapapro = b4i_reportes._mapadetalleorden;Debug.locals.put("mapaPro", _mapapro);
 BA.debugLineNum = 362;BA.debugLine="listAux.RemoveAt(indiceDetalleOrden)";
Debug.ShouldStop(512);
b4i_reportes._listaux.runVoidMethod ("RemoveAt:",(Object)(b4i_reportes._indicedetalleorden));
 BA.debugLineNum = 365;BA.debugLine="salvar_detalle_temporal(mapaPro,1)";
Debug.ShouldStop(4096);
_salvar_detalle_temporal(_mapapro,BA.numberCast(int.class, 1));
 }else 
{ BA.debugLineNum = 367;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 368;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msg3_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("Msg3_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,374);
if (RapidSub.canDelegate("msg3_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","msg3_click", _buttontext);}
int _i = 0;
RemoteObject _map = RemoteObject.declareNull("B4IMap");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 374;BA.debugLine="Sub Msg3_Click(ButtonText As String)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 376;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 378;BA.debugLine="For i=0 To listAux.Size-1";
Debug.ShouldStop(33554432);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {b4i_reportes._listaux.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 380;BA.debugLine="Dim map As Map";
Debug.ShouldStop(134217728);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 381;BA.debugLine="map = listAux.Get(i)";
Debug.ShouldStop(268435456);
_map = (b4i_reportes._listaux.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 383;BA.debugLine="salvar_detalle_temporal_All(map,1)";
Debug.ShouldStop(1073741824);
_salvar_detalle_temporal_all(_map,BA.numberCast(int.class, 1));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 386;BA.debugLine="Msgbox(\"Se agregaron todos los productos en exis";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Se agregaron todos los productos en existencia, verifique en su carrito!")),(Object)(RemoteObject.createImmutable("Realizado")));
 BA.debugLineNum = 387;BA.debugLine="btnbackProOrden_Click";
Debug.ShouldStop(4);
_btnbackproorden_click();
 }else 
{ BA.debugLineNum = 389;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 390;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel1_click() throws Exception{
try {
		Debug.PushSubsStack("Panel1_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,76);
if (RapidSub.canDelegate("panel1_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","panel1_click");}
 BA.debugLineNum = 76;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 78;BA.debugLine="cualFe = True";
Debug.ShouldStop(8192);
b4i_reportes._cualfe = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 79;BA.debugLine="PanelFondoDatePicker.Left = 0";
Debug.ShouldStop(16384);
b4i_reportes._panelfondodatepicker.runMethod(true,"setLeft:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 80;BA.debugLine="PanelFondoDatePicker.SetAlphaAnimated(500,1)";
Debug.ShouldStop(32768);
b4i_reportes._panelfondodatepicker.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 82;BA.debugLine="DateFecha.Ticks = DateTime.Now";
Debug.ShouldStop(131072);
b4i_reportes._datefecha.runMethod(true,"setTicks:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"));
 BA.debugLineNum = 84;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel3_click() throws Exception{
try {
		Debug.PushSubsStack("Panel3_Click (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,86);
if (RapidSub.canDelegate("panel3_click")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","panel3_click");}
 BA.debugLineNum = 86;BA.debugLine="Sub Panel3_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 88;BA.debugLine="cualFe = False";
Debug.ShouldStop(8388608);
b4i_reportes._cualfe = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 89;BA.debugLine="PanelFondoDatePicker.Left = 0";
Debug.ShouldStop(16777216);
b4i_reportes._panelfondodatepicker.runMethod(true,"setLeft:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 90;BA.debugLine="PanelFondoDatePicker.SetAlphaAnimated(500,1)";
Debug.ShouldStop(33554432);
b4i_reportes._panelfondodatepicker.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 92;BA.debugLine="DateFecha.Ticks = DateTime.Now";
Debug.ShouldStop(134217728);
b4i_reportes._datefecha.runMethod(true,"setTicks:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"));
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="Private pageReporte As Page";
b4i_reportes._pagereporte = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 9;BA.debugLine="Private Panel1 As Panel";
b4i_reportes._panel1 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private Panel3 As Panel";
b4i_reportes._panel3 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private lblFechaInicio As Label";
b4i_reportes._lblfechainicio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private lblfechaFinal As Label";
b4i_reportes._lblfechafinal = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private PanelFondoDatePicker As Panel";
b4i_reportes._panelfondodatepicker = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Dim cualFe As Boolean";
b4i_reportes._cualfe = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 16;BA.debugLine="Dim mapaBorrar As Map";
b4i_reportes._mapaborrar = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 17;BA.debugLine="Dim indiceBorrar As Int";
b4i_reportes._indiceborrar = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 18;BA.debugLine="Dim numOrden As String";
b4i_reportes._numorden = RemoteObject.createImmutable("");
 //BA.debugLineNum = 19;BA.debugLine="Dim listaAddAll As List";
b4i_reportes._listaaddall = RemoteObject.createNew ("B4IList");
 //BA.debugLineNum = 20;BA.debugLine="Dim listAux As List";
b4i_reportes._listaux = RemoteObject.createNew ("B4IList");
 //BA.debugLineNum = 21;BA.debugLine="Dim mapaDetalleOrden As Map";
b4i_reportes._mapadetalleorden = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 22;BA.debugLine="Dim indiceDetalleOrden As Int";
b4i_reportes._indicedetalleorden = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 24;BA.debugLine="Private btnCancelarDate As Button";
b4i_reportes._btncancelardate = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnAceptarDate As Button";
b4i_reportes._btnaceptardate = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private DateFecha As DatePicker";
b4i_reportes._datefecha = RemoteObject.createNew ("B4IDatePickerWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private listaOrdenes As CustomListView";
b4i_reportes._listaordenes = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 28;BA.debugLine="Private Label3 As Label";
b4i_reportes._label3 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblDir As Label";
b4i_reportes._lbldir = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblFecha As Label";
b4i_reportes._lblfecha = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblPrincipal As Label";
b4i_reportes._lblprincipal = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnBuscarReporte As Button";
b4i_reportes._btnbuscarreporte = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Dim hud As HUD";
b4i_reportes._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 36;BA.debugLine="Private PanelFondoDetalleOrden As Panel";
b4i_reportes._panelfondodetalleorden = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private lbltituloProOrden As Label";
b4i_reportes._lbltituloproorden = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ListProOrdenDetalle As CustomListView";
b4i_reportes._listproordendetalle = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 39;BA.debugLine="Private btnbackProOrden As Button";
b4i_reportes._btnbackproorden = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private btnAddAllproOrden As Button";
b4i_reportes._btnaddallproorden = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private imgCat As ImageView";
b4i_reportes._imgcat = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblNomCat As Label";
b4i_reportes._lblnomcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lblCantCat As Label";
b4i_reportes._lblcantcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private btnReporteBack As Button";
b4i_reportes._btnreporteback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Panel2 As Panel";
b4i_reportes._panel2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private PanelEncabezadoM As Panel";
b4i_reportes._panelencabezadom = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private PanelEncabezadoRepo As Panel";
b4i_reportes._panelencabezadorepo = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,397);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 397;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(4096);
 BA.debugLineNum = 399;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
Debug.ShouldStop(16384);
_mapcalculos = b4i_reportes._funciones.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(b4i_reportes._main._impuestoincluido /*RemoteObject*/ ),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 401;BA.debugLine="Dim json As String";
Debug.ShouldStop(65536);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 402;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_reportes._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),b4i_reportes._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 416;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(-2147483648);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 417;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(1);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reportes.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_reportes.getObject()));
 BA.debugLineNum = 418;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(2);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reportes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reportes._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reportes._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 420;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("salvar_detalle_temporal_All (reportes) ","reportes",4,b4i_reportes.ba,b4i_reportes.mostCurrent,422);
if (RapidSub.canDelegate("salvar_detalle_temporal_all")) { return b4i_reportes.remoteMe.runUserSub(false, "reportes","salvar_detalle_temporal_all", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal2 = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 422;BA.debugLine="Sub salvar_detalle_temporal_All(map As Map, cantid";
Debug.ShouldStop(32);
 BA.debugLineNum = 424;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
Debug.ShouldStop(128);
_mapcalculos = b4i_reportes._funciones.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(b4i_reportes._main._impuestoincluido /*RemoteObject*/ ),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 426;BA.debugLine="Dim json As String";
Debug.ShouldStop(512);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 427;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(1024);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_reportes._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),b4i_reportes._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 441;BA.debugLine="Dim JobDetalleTemporal2 As HttpJob";
Debug.ShouldStop(16777216);
_jobdetalletemporal2 = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal2", _jobdetalletemporal2);
 BA.debugLineNum = 442;BA.debugLine="JobDetalleTemporal2.Initialize(\"JobDetalleTempora";
Debug.ShouldStop(33554432);
_jobdetalletemporal2.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_reportes.ba,(Object)(BA.ObjectToString("JobDetalleTemporalAll")),(Object)(b4i_reportes.getObject()));
 BA.debugLineNum = 443;BA.debugLine="JobDetalleTemporal2.PostString(Main.url&\"puntoven";
Debug.ShouldStop(67108864);
_jobdetalletemporal2.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_reportes._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_reportes._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_reportes._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 445;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}