package com.menube.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class facturacion_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,59);
if (RapidSub.canDelegate("activity_create")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","activity_create", _firsttime);}
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 61;BA.debugLine="Activity.LoadLayout(\"frmProductoOrden\")";
Debug.ShouldStop(268435456);
facturacion.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProductoOrden")),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.ItemHeigh";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 11)),facturacion.mostCurrent.activityBA));
 BA.debugLineNum = 65;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Tex";
Debug.ShouldStop(1);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 66;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Tex";
Debug.ShouldStop(2);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 67;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Typ";
Debug.ShouldStop(4);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",facturacion.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 68;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Pad";
Debug.ShouldStop(8);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {facturacion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 70;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
Debug.ShouldStop(32);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 71;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
Debug.ShouldStop(64);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",facturacion.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 72;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
Debug.ShouldStop(128);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 73;BA.debugLine="funcion.SetDivider(ListViewOrdenProducto,Colors.L";
Debug.ShouldStop(256);
facturacion.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._listviewordenproducto),(Object)(facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(facturacion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 74;BA.debugLine="ListViewOrdenProducto.Padding = Array As Int(2%x,";
Debug.ShouldStop(512);
facturacion.mostCurrent._listviewordenproducto.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),facturacion.mostCurrent.activityBA),facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),facturacion.mostCurrent.activityBA),facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),facturacion.mostCurrent.activityBA),facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),facturacion.mostCurrent.activityBA)}));
 BA.debugLineNum = 76;BA.debugLine="lblDireccion.Tag = 0";
Debug.ShouldStop(2048);
facturacion.mostCurrent._lbldireccion.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 77;BA.debugLine="lblPrecioEnvio.Text = Principal.mapEmpresaInfo.Ge";
Debug.ShouldStop(4096);
facturacion.mostCurrent._lblprecioenvio.runMethod(true,"setText",BA.ObjectToCharSequence(facturacion.mostCurrent._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_envio"))))));
 BA.debugLineNum = 79;BA.debugLine="cargarProductosTemporales";
Debug.ShouldStop(16384);
_cargarproductostemporales();
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("Activity_Pause (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,213);
if (RapidSub.canDelegate("activity_pause")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 213;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Activity_Resume (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,209);
if (RapidSub.canDelegate("activity_resume")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","activity_resume");}
 BA.debugLineNum = 209;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(65536);
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
public static RemoteObject  _btnabrirdireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnAbrirDireccion_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,449);
if (RapidSub.canDelegate("btnabrirdireccion_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnabrirdireccion_click");}
 BA.debugLineNum = 449;BA.debugLine="Sub btnAbrirDireccion_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 450;BA.debugLine="StartActivity(Direcciones)";
Debug.ShouldStop(2);
facturacion.mostCurrent.__c.runVoidMethod ("StartActivity",facturacion.processBA,(Object)((facturacion.mostCurrent._direcciones.getObject())));
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncantidadaumentar_click() throws Exception{
try {
		Debug.PushSubsStack("btnCantidadAumentar_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,286);
if (RapidSub.canDelegate("btncantidadaumentar_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btncantidadaumentar_click");}
 BA.debugLineNum = 286;BA.debugLine="Sub btnCantidadAumentar_Click";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="If IsNumber(txtCantidad.Text) = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(facturacion.mostCurrent._txtcantidad.runMethod(true,"getText"))),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 288;BA.debugLine="txtCantidad.Text = \"1\"";
Debug.ShouldStop(-2147483648);
facturacion.mostCurrent._txtcantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("1"));
 BA.debugLineNum = 289;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 292;BA.debugLine="txtCantidad.Text = txtCantidad.Text + 1";
Debug.ShouldStop(8);
facturacion.mostCurrent._txtcantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, facturacion.mostCurrent._txtcantidad.runMethod(true,"getText")),RemoteObject.createImmutable(1)}, "+",1, 0)));
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncantidaddesaumentar_click() throws Exception{
try {
		Debug.PushSubsStack("btnCantidadDesaumentar_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,274);
if (RapidSub.canDelegate("btncantidaddesaumentar_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btncantidaddesaumentar_click");}
 BA.debugLineNum = 274;BA.debugLine="Sub btnCantidadDesaumentar_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 275;BA.debugLine="If IsNumber(txtCantidad.Text) = False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(facturacion.mostCurrent._txtcantidad.runMethod(true,"getText"))),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 276;BA.debugLine="txtCantidad.Text = \"1\"";
Debug.ShouldStop(524288);
facturacion.mostCurrent._txtcantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence("1"));
 BA.debugLineNum = 277;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 280;BA.debugLine="If (txtCantidad.Text - 1)  <= 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("k",(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, facturacion.mostCurrent._txtcantidad.runMethod(true,"getText")),RemoteObject.createImmutable(1)}, "-",1, 0)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 281;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 283;BA.debugLine="txtCantidad.Text = txtCantidad.Text - 1";
Debug.ShouldStop(67108864);
facturacion.mostCurrent._txtcantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, facturacion.mostCurrent._txtcantidad.runMethod(true,"getText")),RemoteObject.createImmutable(1)}, "-",1, 0)));
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndireccioncerrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnDireccionCerrar_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,455);
if (RapidSub.canDelegate("btndireccioncerrar_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btndireccioncerrar_click");}
 BA.debugLineNum = 455;BA.debugLine="Sub btnDireccionCerrar_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 456;BA.debugLine="PanelDireccionModal.SetVisibleAnimated(250,False)";
Debug.ShouldStop(128);
facturacion.mostCurrent._paneldireccionmodal.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(facturacion.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 458;BA.debugLine="funcion.DisableView(False,PanelOrdenProductos)";
Debug.ShouldStop(512);
facturacion.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent.__c.getField(true,"False")),(Object)(facturacion.mostCurrent._panelordenproductos));
 BA.debugLineNum = 459;BA.debugLine="funcion.DisableView(True,PanelDireccionModal)";
Debug.ShouldStop(1024);
facturacion.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent.__c.getField(true,"True")),(Object)(facturacion.mostCurrent._paneldireccionmodal));
 BA.debugLineNum = 460;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnopcionesback_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpcionesBack_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,270);
if (RapidSub.canDelegate("btnopcionesback_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnopcionesback_click");}
 BA.debugLineNum = 270;BA.debugLine="Sub btnOpcionesBack_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 271;BA.debugLine="openOpcionesLayout";
Debug.ShouldStop(16384);
_openopcioneslayout();
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnopcioneseliminar_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpcionesEliminar_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,388);
if (RapidSub.canDelegate("btnopcioneseliminar_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnopcioneseliminar_click");}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 388;BA.debugLine="Sub btnOpcionesEliminar_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Dim r As Int = Msgbox2(\"Seguro que desea eliminar";
Debug.ShouldStop(16);
_r = facturacion.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Seguro que desea eliminar este producto?")),(Object)(BA.ObjectToCharSequence("Confirmación")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((facturacion.mostCurrent.__c.getField(false,"Null"))),facturacion.mostCurrent.activityBA);Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 390;BA.debugLine="If r <> DialogResponse.POSITIVE Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("!",_r,BA.numberCast(double.class, facturacion.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 391;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 394;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
Debug.ShouldStop(512);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(false,"getTag"));Debug.locals.put("map", _map);
 BA.debugLineNum = 395;BA.debugLine="Dim json As String";
Debug.ShouldStop(1024);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 397;BA.debugLine="json = \"'f_regresa':true\"& _ 			\",'f_idempresa':\"";
Debug.ShouldStop(4096);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':true"),RemoteObject.createImmutable(",'f_idempresa':"),facturacion.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':2"),RemoteObject.createImmutable(",'f_idserver':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idserver")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 402;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(131072);
_jobdetalletemporal = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 403;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(262144);
_jobdetalletemporal.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,facturacion.processBA,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(facturacion.getObject()));
 BA.debugLineNum = 404;BA.debugLine="JobDetalleTemporal.Tag = True";
Debug.ShouldStop(524288);
_jobdetalletemporal.setField ("_tag" /*RemoteObject*/ ,(facturacion.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 405;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(1048576);
_jobdetalletemporal.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(facturacion.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),facturacion.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 407;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
Debug.ShouldStop(4194304);
facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 408;BA.debugLine="btnOpcionesEliminar.Enabled = False";
Debug.ShouldStop(8388608);
facturacion.mostCurrent._btnopcioneseliminar.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 409;BA.debugLine="btnOpcionesBack.Enabled = False";
Debug.ShouldStop(16777216);
facturacion.mostCurrent._btnopcionesback.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 410;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnopcionesproductosalvar_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpcionesProductoSalvar_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,343);
if (RapidSub.canDelegate("btnopcionesproductosalvar_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnopcionesproductosalvar_click");}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mapcalculos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonpropiedades = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _ch = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 343;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 344;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
Debug.ShouldStop(8388608);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(false,"getTag"));Debug.locals.put("map", _map);
 BA.debugLineNum = 345;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(16777216);
_mapcalculos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapcalculos = facturacion.mostCurrent._funcion.runMethod(false,"_recalcular" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_original")))))),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descuento")))))),(Object)(BA.numberCast(double.class, facturacion.mostCurrent._txtcantidad.runMethod(true,"getText"))),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_porciento_tax")))))),(Object)(facturacion.mostCurrent._principal._impuestoincluido /*RemoteObject*/ ),(Object)(facturacion.mostCurrent.__c.getField(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 346;BA.debugLine="Dim json As String";
Debug.ShouldStop(33554432);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 348;BA.debugLine="Dim jsonPropiedades As String = \"[\"";
Debug.ShouldStop(134217728);
_jsonpropiedades = BA.ObjectToString("[");Debug.locals.put("jsonPropiedades", _jsonpropiedades);Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 349;BA.debugLine="For Each v As View In ScrollViewOpciones.Panel.Ge";
Debug.ShouldStop(268435456);
_v = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group5 = facturacion.mostCurrent._scrollviewopciones.runMethod(false,"getPanel").runMethod(false,"GetAllViewsRecursive");
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v.setObject(group5.runMethod(false,"Get",index5));
Debug.locals.put("v", _v);
 BA.debugLineNum = 350;BA.debugLine="If GetType(v) <> \"android.widget.CheckBox\" Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("!",facturacion.mostCurrent.__c.runMethod(true,"GetType",(Object)((_v.getObject()))),BA.ObjectToString("android.widget.CheckBox"))) { 
 BA.debugLineNum = 351;BA.debugLine="Continue";
Debug.ShouldStop(1073741824);
if (true) continue;
 };
 BA.debugLineNum = 353;BA.debugLine="Dim ch As CheckBox = v";
Debug.ShouldStop(1);
_ch = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
_ch.setObject(_v.getObject());Debug.locals.put("ch", _ch);
 BA.debugLineNum = 354;BA.debugLine="If ch.Checked Then";
Debug.ShouldStop(2);
if (_ch.runMethod(true,"getChecked").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 355;BA.debugLine="jsonPropiedades = jsonPropiedades & \",{'f_idrec";
Debug.ShouldStop(4);
_jsonpropiedades = RemoteObject.concat(_jsonpropiedades,RemoteObject.createImmutable(",{'f_idrecord':"),_ch.runMethod(false,"getTag"),RemoteObject.createImmutable("}"));Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 358;BA.debugLine="jsonPropiedades = jsonPropiedades.Replace(\"[,\",\"[";
Debug.ShouldStop(32);
_jsonpropiedades = _jsonpropiedades.runMethod(true,"replace",(Object)(BA.ObjectToString("[,")),(Object)(RemoteObject.createImmutable("[")));Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 359;BA.debugLine="jsonPropiedades = jsonPropiedades& \"]\"";
Debug.ShouldStop(64);
_jsonpropiedades = RemoteObject.concat(_jsonpropiedades,RemoteObject.createImmutable("]"));Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 362;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(512);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),facturacion.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_propiedades':"),_jsonpropiedades,RemoteObject.createImmutable(",'f_tipo':2"),RemoteObject.createImmutable(",'f_cantidad':"),facturacion.mostCurrent._txtcantidad.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_idserver':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idserver")))),RemoteObject.createImmutable(",'f_diferencia':"),facturacion.mostCurrent._funcion.runMethod(true,"_getdiferenciacantidad" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_cantidad")))))),(Object)(BA.numberCast(double.class, facturacion.mostCurrent._txtcantidad.runMethod(true,"getText")))),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_comentario':'"),facturacion.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._txtproductocomentario.runMethod(true,"getText"))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_porciento_tax")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 378;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(33554432);
_jobdetalletemporal = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 379;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(67108864);
_jobdetalletemporal.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,facturacion.processBA,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(facturacion.getObject()));
 BA.debugLineNum = 380;BA.debugLine="JobDetalleTemporal.Tag = False";
Debug.ShouldStop(134217728);
_jobdetalletemporal.setField ("_tag" /*RemoteObject*/ ,(facturacion.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 381;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(268435456);
_jobdetalletemporal.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(facturacion.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),facturacion.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 382;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
Debug.ShouldStop(536870912);
facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 383;BA.debugLine="btnOpcionesEliminar.Enabled = False";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent._btnopcioneseliminar.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 384;BA.debugLine="btnOpcionesBack.Enabled = False";
Debug.ShouldStop(-2147483648);
facturacion.mostCurrent._btnopcionesback.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _btnordenback_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrdenBack_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,239);
if (RapidSub.canDelegate("btnordenback_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnordenback_click");}
 BA.debugLineNum = 239;BA.debugLine="Sub btnOrdenBack_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Activity.Finish";
Debug.ShouldStop(32768);
facturacion.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnordeneliminartodos_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrdenEliminarTodos_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,462);
if (RapidSub.canDelegate("btnordeneliminartodos_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnordeneliminartodos_click");}
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _jobeliminartodo = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 462;BA.debugLine="Sub btnOrdenEliminarTodos_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 463;BA.debugLine="Dim r As Int = Msgbox2(\"Seguro que desea eliminar";
Debug.ShouldStop(16384);
_r = facturacion.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Seguro que desea eliminar todos los productos?")),(Object)(BA.ObjectToCharSequence("Confirmación")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((facturacion.mostCurrent.__c.getField(false,"Null"))),facturacion.mostCurrent.activityBA);Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 464;BA.debugLine="If r <> DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_r,BA.numberCast(double.class, facturacion.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 465;BA.debugLine="Return";
Debug.ShouldStop(65536);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 468;BA.debugLine="Dim JobEliminarTodo As HttpJob";
Debug.ShouldStop(524288);
_jobeliminartodo = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobEliminarTodo", _jobeliminartodo);
 BA.debugLineNum = 469;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me)";
Debug.ShouldStop(1048576);
_jobeliminartodo.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,facturacion.processBA,(Object)(BA.ObjectToString("JobEliminarTodo")),(Object)(facturacion.getObject()));
 BA.debugLineNum = 470;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa/g";
Debug.ShouldStop(2097152);
_jobeliminartodo.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(facturacion.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_eliminar_detalle_usuarios"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),facturacion.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),facturacion.mostCurrent._principal._idempresa /*RemoteObject*/ ))))));
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnordenenviar_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrdenEnviar_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,217);
if (RapidSub.canDelegate("btnordenenviar_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","btnordenenviar_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 217;BA.debugLine="Sub btnOrdenEnviar_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 219;BA.debugLine="If Principal.mapEmpresaInfo.Get(\"f_pedidos_minimo";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, facturacion.mostCurrent._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_pedidos_minimos"))))),facturacion._total)) { 
 BA.debugLineNum = 220;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de R";
Debug.ShouldStop(134217728);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("El monto del pedido minimo debe ser de RD$"),facturacion.mostCurrent._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_pedidos_minimos"))))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 221;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 222;BA.debugLine="Else If ListViewOrdenProducto.Size = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent._listviewordenproducto.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 223;BA.debugLine="Msgbox(\"No hay productos para registrar esta ord";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay productos para registrar esta orden")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 224;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 225;BA.debugLine="else if lblDireccion.Tag = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent._lbldireccion.runMethod(false,"getTag"),RemoteObject.createImmutable((0)))) { 
 BA.debugLineNum = 226;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",\"";
Debug.ShouldStop(2);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Seleccione la dirección para el envio")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 227;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 }}}
;
 BA.debugLineNum = 230;BA.debugLine="Dim json As String";
Debug.ShouldStop(32);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 231;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempresa";
Debug.ShouldStop(64);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_comprobante_fiscal':false,'f_idempresa':"),facturacion.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_itbis':"),facturacion._tax,RemoteObject.createImmutable(",'f_subtotal':"),facturacion._subtotal,RemoteObject.createImmutable(",'f_total':"),facturacion._total,RemoteObject.createImmutable(",'f_nota':'','f_direccion':'"),facturacion.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._lbldireccion.runMethod(true,"getText"))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 233;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(256);
_jobsalvar = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 234;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(512);
_jobsalvar.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,facturacion.processBA,(Object)(BA.ObjectToString("JobSalvar")),(Object)(facturacion.getObject()));
 BA.debugLineNum = 235;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_sal";
Debug.ShouldStop(1024);
_jobsalvar.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(facturacion.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_salvar_orden_delivery/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),facturacion.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("cargarDirecciones (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,434);
if (RapidSub.canDelegate("cargardirecciones")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 434;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(131072);
 BA.debugLineNum = 435;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(262144);
_jobdirecciones = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 436;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(524288);
_jobdirecciones.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,facturacion.processBA,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(facturacion.getObject()));
 BA.debugLineNum = 437;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(1048576);
_jobdirecciones.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(facturacion.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),facturacion.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarproductostemporales() throws Exception{
try {
		Debug.PushSubsStack("cargarProductosTemporales (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,83);
if (RapidSub.canDelegate("cargarproductostemporales")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","cargarproductostemporales");}
RemoteObject _jobbuscar = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 83;BA.debugLine="Sub cargarProductosTemporales";
Debug.ShouldStop(262144);
 BA.debugLineNum = 84;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(524288);
_jobbuscar = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 85;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(1048576);
_jobbuscar.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,facturacion.processBA,(Object)(BA.ObjectToString("JobBuscar")),(Object)(facturacion.getObject()));
 BA.debugLineNum = 86;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pro";
Debug.ShouldStop(2097152);
_jobbuscar.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(facturacion.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_productos_temporales_by_key"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),facturacion.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),facturacion.mostCurrent._principal._idempresa /*RemoteObject*/ ))))));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 16;BA.debugLine="Private btnOrdenBack As Button";
facturacion.mostCurrent._btnordenback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnOrdenEnviar As Button";
facturacion.mostCurrent._btnordenenviar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ListViewOrdenProducto As ListView";
facturacion.mostCurrent._listviewordenproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private PanelOrdenEnviar As Panel";
facturacion.mostCurrent._panelordenenviar = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelOrdenProductos As Panel";
facturacion.mostCurrent._panelordenproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelOrdenProductosDetalles As Panel";
facturacion.mostCurrent._panelordenproductosdetalles = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelOrdenTitulo As Panel";
facturacion.mostCurrent._panelordentitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblOrdenTotalPagar As Label";
facturacion.mostCurrent._lblordentotalpagar = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private lblDireccion As Label";
facturacion.mostCurrent._lbldireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblPrecioEnvio As Label";
facturacion.mostCurrent._lblprecioenvio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private PanelDireccion As Panel";
facturacion.mostCurrent._paneldireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnOrdenEliminarTodos As Button";
facturacion.mostCurrent._btnordeneliminartodos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Dim tax As Double = 0";
facturacion._tax = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 30;BA.debugLine="Dim subtotal As Double = 0";
facturacion._subtotal = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 31;BA.debugLine="Dim total As Double = 0";
facturacion._total = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 34;BA.debugLine="Private btnCantidadAumentar As Button";
facturacion.mostCurrent._btncantidadaumentar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private btnCantidadDesaumentar As Button";
facturacion.mostCurrent._btncantidaddesaumentar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private btnOpcionesBack As Button";
facturacion.mostCurrent._btnopcionesback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PanelOpciones As Panel";
facturacion.mostCurrent._panelopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private PanelOpcionesBack As Panel";
facturacion.mostCurrent._panelopcionesback = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private txtCantidad As EditText";
facturacion.mostCurrent._txtcantidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblOpcionesProductoNombre As Label";
facturacion.mostCurrent._lblopcionesproductonombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private ScrollViewOpciones As ScrollView";
facturacion.mostCurrent._scrollviewopciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private btnOpcionesProductoSalvar As Button";
facturacion.mostCurrent._btnopcionesproductosalvar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private txtProductoComentario As EditText";
facturacion.mostCurrent._txtproductocomentario = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private btnOpcionesEliminar As Button";
facturacion.mostCurrent._btnopcioneseliminar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private btnAbrirDireccion As Button";
facturacion.mostCurrent._btnabrirdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private ListViewDirecciones As ListView";
facturacion.mostCurrent._listviewdirecciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private PanelDireccionModal As Panel";
facturacion.mostCurrent._paneldireccionmodal = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,90);
if (RapidSub.canDelegate("jobdone")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 90;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 92;BA.debugLine="If btnOpcionesProductoSalvar.IsInitialized And bt";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(".",facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(true,"getEnabled"),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 93;BA.debugLine="btnOpcionesProductoSalvar.Enabled = True";
Debug.ShouldStop(268435456);
facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="btnOpcionesEliminar.Enabled = True";
Debug.ShouldStop(536870912);
facturacion.mostCurrent._btnopcioneseliminar.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 95;BA.debugLine="btnOpcionesBack.Enabled = True";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent._btnopcionesback.runMethod(true,"setEnabled",facturacion.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 98;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 99;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(4);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(facturacion.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(facturacion.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 100;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 103;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ ))),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 104;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 107;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1024);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 108;BA.debugLine="Dim list As List";
Debug.ShouldStop(2048);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 109;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(4096);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 110;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(8192);
_json.runVoidMethod ("Initialize",(Object)(facturacion.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 111;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(16384);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 113;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(65536);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobSalvar"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobEliminarTodo"))) {
case 0: {
 BA.debugLineNum = 117;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1048576);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 118;BA.debugLine="ListViewOrdenProducto.Clear";
Debug.ShouldStop(2097152);
facturacion.mostCurrent._listviewordenproducto.runVoidMethod ("Clear");
 BA.debugLineNum = 119;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
Debug.ShouldStop(8388608);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No tiene productos registrados")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 121;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 125;BA.debugLine="total = 0";
Debug.ShouldStop(268435456);
facturacion._total = BA.numberCast(double.class, 0);
 BA.debugLineNum = 126;BA.debugLine="tax = 0";
Debug.ShouldStop(536870912);
facturacion._tax = BA.numberCast(double.class, 0);
 BA.debugLineNum = 127;BA.debugLine="subtotal = 0";
Debug.ShouldStop(1073741824);
facturacion._subtotal = BA.numberCast(double.class, 0);
 BA.debugLineNum = 129;BA.debugLine="For i = 0 To list.Size -1";
Debug.ShouldStop(1);
{
final int step29 = 1;
final int limit29 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step29 > 0 && _i <= limit29) || (step29 < 0 && _i >= limit29) ;_i = ((int)(0 + _i + step29))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 130;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(2);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 131;BA.debugLine="total = total + map.Get(\"f_importe\")";
Debug.ShouldStop(4);
facturacion._total = RemoteObject.solve(new RemoteObject[] {facturacion._total,BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_importe")))))}, "+",1, 0);
 BA.debugLineNum = 132;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
Debug.ShouldStop(8);
facturacion._tax = RemoteObject.solve(new RemoteObject[] {facturacion._tax,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax"))))),BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_cantidad")))))}, "*",0, 0))}, "+",1, 0);
 BA.debugLineNum = 133;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
Debug.ShouldStop(16);
facturacion._subtotal = RemoteObject.solve(new RemoteObject[] {facturacion._subtotal,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_cantidad")))))}, "*",0, 0))}, "+",1, 0);
 BA.debugLineNum = 135;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(64);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 136;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 137;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(256);
_bm = facturacion.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 139;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pack";
Debug.ShouldStop(1024);
_bm.runVoidMethod ("Initialize",(Object)((facturacion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(facturacion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("packing.png"))).getObject())));
 };
 BA.debugLineNum = 142;BA.debugLine="ListViewOrdenProducto.AddTwoLinesAndBitmap2(ma";
Debug.ShouldStop(8192);
facturacion.mostCurrent._listviewordenproducto.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_cantidad")))),RemoteObject.createImmutable("     $"),facturacion.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, facturacion.mostCurrent._funcion.runMethod(true,"_getdecimal" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))))}, "+",1, 0))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))),(Object)(_bm.runMethod(false,"getBitmap")),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 144;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(fun";
Debug.ShouldStop(32768);
facturacion.mostCurrent._lblordentotalpagar.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),facturacion.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, facturacion.mostCurrent._funcion.runMethod(true,"_getdecimal" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(RemoteObject.solve(new RemoteObject[] {facturacion._total,BA.numberCast(double.class, facturacion.mostCurrent._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_envio")))))}, "+",1, 0))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 break; }
case 1: {
 BA.debugLineNum = 147;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
Debug.ShouldStop(262144);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Orden registrada."),facturacion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Numero de orden: "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 148;BA.debugLine="Principal.cantidadProduto = 0";
Debug.ShouldStop(524288);
facturacion.mostCurrent._principal._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 149;BA.debugLine="btnOrdenBack_Click";
Debug.ShouldStop(1048576);
_btnordenback_click();
 break; }
case 2: {
 BA.debugLineNum = 154;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(33554432);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 155;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 156;BA.debugLine="If Job.Tag Then";
Debug.ShouldStop(134217728);
if (BA.ObjectToBoolean(_job.getField(false,"_tag" /*RemoteObject*/ )).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 157;BA.debugLine="ToastMessageShow(\"Producto eliminado.\",False)";
Debug.ShouldStop(268435456);
facturacion.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto eliminado.")),(Object)(facturacion.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 158;BA.debugLine="Principal.cantidadProduto = Principal.cantida";
Debug.ShouldStop(536870912);
facturacion.mostCurrent._principal._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {facturacion.mostCurrent._principal._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "-",1, 1);
 }else {
 BA.debugLineNum = 160;BA.debugLine="ToastMessageShow(\"Producto actualizado.\",Fals";
Debug.ShouldStop(-2147483648);
facturacion.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto actualizado.")),(Object)(facturacion.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 163;BA.debugLine="openOpcionesLayout";
Debug.ShouldStop(4);
_openopcioneslayout();
 BA.debugLineNum = 164;BA.debugLine="cargarProductosTemporales";
Debug.ShouldStop(8);
_cargarproductostemporales();
 }else {
 BA.debugLineNum = 166;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
Debug.ShouldStop(32);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("No hay unidades suficientes de este producto. La existencia actual es de "),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_existencia"))))))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 break; }
case 3: {
 BA.debugLineNum = 171;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1024);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 172;BA.debugLine="ListViewDirecciones.Clear";
Debug.ShouldStop(2048);
facturacion.mostCurrent._listviewdirecciones.runVoidMethod ("Clear");
 BA.debugLineNum = 173;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 174;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(8192);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No tiene direcciones registradas")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 175;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 179;BA.debugLine="Dim dr,default=\"\" As String";
Debug.ShouldStop(262144);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_default = BA.ObjectToString("");Debug.locals.put("default", _default);Debug.locals.put("default", _default);
 BA.debugLineNum = 180;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(524288);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 181;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(1048576);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 182;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
Debug.ShouldStop(2097152);
_dr = facturacion.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 183;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 184;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(8388608);
_dr = RemoteObject.concat(_dr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 187;BA.debugLine="If map.Get(\"f_principal\") Then";
Debug.ShouldStop(67108864);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_principal"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 188;BA.debugLine="default = CRLF& \"Dirección principal\"";
Debug.ShouldStop(134217728);
_default = RemoteObject.concat(facturacion.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("Dirección principal"));Debug.locals.put("default", _default);
 };
 BA.debugLineNum = 191;BA.debugLine="ListViewDirecciones.AddTwoLines2(dr,map.Get(\"f";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent._listviewdirecciones.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(_dr)),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fecha")))),_default))),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 4: {
 BA.debugLineNum = 195;BA.debugLine="map=map.Get(\"f_data\")";
Debug.ShouldStop(4);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 196;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 197;BA.debugLine="ListViewOrdenProducto.Clear";
Debug.ShouldStop(16);
facturacion.mostCurrent._listviewordenproducto.runVoidMethod ("Clear");
 BA.debugLineNum = 198;BA.debugLine="Principal.cantidadProduto = 0";
Debug.ShouldStop(32);
facturacion.mostCurrent._principal._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 199;BA.debugLine="ToastMessageShow(\"Todos los productos fueron e";
Debug.ShouldStop(64);
facturacion.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Todos los productos fueron eliminados")),(Object)(facturacion.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 201;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
Debug.ShouldStop(256);
facturacion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Los productos no fueron eliminados")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),facturacion.mostCurrent.activityBA);
 };
 break; }
}
;
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("ListViewDirecciones_ItemClick (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,442);
if (RapidSub.canDelegate("listviewdirecciones_itemclick")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","listviewdirecciones_itemclick", _position, _value);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 442;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 443;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(67108864);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_value);Debug.locals.put("map", _map);
 BA.debugLineNum = 444;BA.debugLine="lblDireccion.Text = funcion.base64_Decode( map.Ge";
Debug.ShouldStop(134217728);
facturacion.mostCurrent._lbldireccion.runMethod(true,"setText",BA.ObjectToCharSequence(facturacion.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion")))))))));
 BA.debugLineNum = 445;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
Debug.ShouldStop(268435456);
facturacion.mostCurrent._lbldireccion.runMethod(false,"setTag",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 446;BA.debugLine="btnDireccionCerrar_Click";
Debug.ShouldStop(536870912);
_btndireccioncerrar_click();
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewordenproducto_itemlongclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewOrdenProducto_ItemLongClick (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,296);
if (RapidSub.canDelegate("listviewordenproducto_itemlongclick")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","listviewordenproducto_itemlongclick", _position, _value);}
RemoteObject _listaproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _map2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _ch = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 296;BA.debugLine="Sub ListViewOrdenProducto_ItemLongClick (Position";
Debug.ShouldStop(128);
 BA.debugLineNum = 297;BA.debugLine="openOpcionesLayout";
Debug.ShouldStop(256);
_openopcioneslayout();
 BA.debugLineNum = 299;BA.debugLine="Dim listaProductos As List";
Debug.ShouldStop(1024);
_listaproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaProductos", _listaproductos);
 BA.debugLineNum = 300;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(2048);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 302;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(8192);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_value);Debug.locals.put("map", _map);
 BA.debugLineNum = 303;BA.debugLine="txtCantidad.Text = map.Get(\"f_cantidad\")";
Debug.ShouldStop(16384);
facturacion.mostCurrent._txtcantidad.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_cantidad"))))));
 BA.debugLineNum = 304;BA.debugLine="txtCantidad.Tag = map.Get(\"f_cantidad\")";
Debug.ShouldStop(32768);
facturacion.mostCurrent._txtcantidad.runMethod(false,"setTag",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_cantidad")))));
 BA.debugLineNum = 305;BA.debugLine="lblOpcionesProductoNombre.Text = map.Get(\"f_descr";
Debug.ShouldStop(65536);
facturacion.mostCurrent._lblopcionesproductonombre.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 306;BA.debugLine="txtProductoComentario.Text = funcion.base64_Decod";
Debug.ShouldStop(131072);
facturacion.mostCurrent._txtproductocomentario.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(facturacion.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_comentario")))))))));
 BA.debugLineNum = 308;BA.debugLine="json.Initialize(map.Get(\"f_propiedades\"))";
Debug.ShouldStop(524288);
_json.runVoidMethod ("Initialize",(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_propiedades")))))));
 BA.debugLineNum = 309;BA.debugLine="listaProductos = json.NextArray";
Debug.ShouldStop(1048576);
_listaproductos = _json.runMethod(false,"NextArray");Debug.locals.put("listaProductos", _listaproductos);
 BA.debugLineNum = 310;BA.debugLine="ScrollViewOpciones.Panel.RemoveAllViews";
Debug.ShouldStop(2097152);
facturacion.mostCurrent._scrollviewopciones.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 311;BA.debugLine="btnOpcionesProductoSalvar.Tag =Value";
Debug.ShouldStop(4194304);
facturacion.mostCurrent._btnopcionesproductosalvar.runMethod(false,"setTag",_value);
 BA.debugLineNum = 313;BA.debugLine="If listaProductos.Size = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_listaproductos.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 314;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(33554432);
_lbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 315;BA.debugLine="lbl.Initialize(\"-\")";
Debug.ShouldStop(67108864);
_lbl.runVoidMethod ("Initialize",facturacion.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("-")));
 BA.debugLineNum = 316;BA.debugLine="lbl.Text = \"No hay opciones disponibles\"";
Debug.ShouldStop(134217728);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence("No hay opciones disponibles"));
 BA.debugLineNum = 317;BA.debugLine="lbl.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
Debug.ShouldStop(268435456);
_lbl.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {facturacion.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),facturacion.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 318;BA.debugLine="lbl.TextColor = Colors.LightGray";
Debug.ShouldStop(536870912);
_lbl.runMethod(true,"setTextColor",facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray"));
 BA.debugLineNum = 319;BA.debugLine="lbl.TextSize = 15";
Debug.ShouldStop(1073741824);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 321;BA.debugLine="ScrollViewOpciones.Panel.AddView(lbl,2%x,2%y,Scr";
Debug.ShouldStop(1);
facturacion.mostCurrent._scrollviewopciones.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lbl.getObject())),(Object)(facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),facturacion.mostCurrent.activityBA)),(Object)(facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),facturacion.mostCurrent.activityBA)),(Object)(facturacion.mostCurrent._scrollviewopciones.runMethod(false,"getPanel").runMethod(true,"getWidth")),(Object)(facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),facturacion.mostCurrent.activityBA)));
 BA.debugLineNum = 322;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 325;BA.debugLine="Dim height As Double = 1%y";
Debug.ShouldStop(16);
_height = BA.numberCast(double.class, facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),facturacion.mostCurrent.activityBA));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 326;BA.debugLine="Dim map2 As Map";
Debug.ShouldStop(32);
_map2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map2", _map2);
 BA.debugLineNum = 327;BA.debugLine="For i=0 To listaProductos.Size -1";
Debug.ShouldStop(64);
{
final int step25 = 1;
final int limit25 = RemoteObject.solve(new RemoteObject[] {_listaproductos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step25 > 0 && _i <= limit25) || (step25 < 0 && _i >= limit25) ;_i = ((int)(0 + _i + step25))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 328;BA.debugLine="map2 = listaProductos.Get(i)";
Debug.ShouldStop(128);
_map2.setObject(_listaproductos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 329;BA.debugLine="Dim ch As CheckBox";
Debug.ShouldStop(256);
_ch = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");Debug.locals.put("ch", _ch);
 BA.debugLineNum = 330;BA.debugLine="ch.Initialize(i&\"ck\")";
Debug.ShouldStop(512);
_ch.runVoidMethod ("Initialize",facturacion.mostCurrent.activityBA,(Object)(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("ck"))));
 BA.debugLineNum = 331;BA.debugLine="ch.Tag = map2.Get(\"f_idrecord\")";
Debug.ShouldStop(1024);
_ch.runMethod(false,"setTag",_map2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 332;BA.debugLine="ch.Text = map2.Get(\"f_descripcion\")";
Debug.ShouldStop(2048);
_ch.runMethod(true,"setText",BA.ObjectToCharSequence(_map2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 333;BA.debugLine="ch.Checked = map2.Get(\"f_agregado\")";
Debug.ShouldStop(4096);
_ch.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(_map2.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_agregado"))))));
 BA.debugLineNum = 334;BA.debugLine="ch.TextColor = Colors.Black";
Debug.ShouldStop(8192);
_ch.runMethod(true,"setTextColor",facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 336;BA.debugLine="ScrollViewOpciones.Panel.AddView(ch,2%x,height,9";
Debug.ShouldStop(32768);
facturacion.mostCurrent._scrollviewopciones.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_ch.getObject())),(Object)(facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),facturacion.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, _height)),(Object)(facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 96)),facturacion.mostCurrent.activityBA)),(Object)(facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),facturacion.mostCurrent.activityBA)));
 BA.debugLineNum = 337;BA.debugLine="height = height + 5%y";
Debug.ShouldStop(65536);
_height = RemoteObject.solve(new RemoteObject[] {_height,facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),facturacion.mostCurrent.activityBA)}, "+",1, 0);Debug.locals.put("height", _height);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 339;BA.debugLine="ScrollViewOpciones.Panel.Height = height";
Debug.ShouldStop(262144);
facturacion.mostCurrent._scrollviewopciones.runMethod(false,"getPanel").runMethod(true,"setHeight",BA.numberCast(int.class, _height));
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _openopcioneslayout() throws Exception{
try {
		Debug.PushSubsStack("openOpcionesLayout (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,243);
if (RapidSub.canDelegate("openopcioneslayout")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","openopcioneslayout");}
RemoteObject _posicion = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 243;BA.debugLine="Sub openOpcionesLayout";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="Dim posicion As Double = 100%x";
Debug.ShouldStop(524288);
_posicion = BA.numberCast(double.class, facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),facturacion.mostCurrent.activityBA));Debug.locals.put("posicion", _posicion);Debug.locals.put("posicion", _posicion);
 BA.debugLineNum = 246;BA.debugLine="If PanelOpciones.IsInitialized = False Or PanelOp";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent._panelopciones.runMethod(true,"IsInitialized"),facturacion.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("=",facturacion.mostCurrent._panelopcionesback.runMethod(true,"getLeft"),BA.numberCast(double.class, facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),facturacion.mostCurrent.activityBA)))) { 
 BA.debugLineNum = 247;BA.debugLine="If PanelOpciones.IsInitialized = False Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent._panelopciones.runMethod(true,"IsInitialized"),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 248;BA.debugLine="Activity.LoadLayout(\"frmProductoOpciones\")";
Debug.ShouldStop(8388608);
facturacion.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProductoOpciones")),facturacion.mostCurrent.activityBA);
 };
 BA.debugLineNum = 250;BA.debugLine="PanelOpcionesBack.Left = 100%x";
Debug.ShouldStop(33554432);
facturacion.mostCurrent._panelopcionesback.runMethod(true,"setLeft",facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),facturacion.mostCurrent.activityBA));
 BA.debugLineNum = 251;BA.debugLine="posicion = posicion * -1";
Debug.ShouldStop(67108864);
_posicion = BA.numberCast(double.class, _posicion.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("posicion", _posicion);
 BA.debugLineNum = 252;BA.debugLine="PanelOpcionesBack.Tag = 0";
Debug.ShouldStop(134217728);
facturacion.mostCurrent._panelopcionesback.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 253;BA.debugLine="PanelOpcionesBack.SetColorAnimated(400,Colors.Tr";
Debug.ShouldStop(268435456);
facturacion.mostCurrent._panelopcionesback.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 400)),(Object)(facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")),(Object)(facturacion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 }else {
 BA.debugLineNum = 255;BA.debugLine="funcion.DisableView(False,PanelOrdenProductos)";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent.__c.getField(true,"False")),(Object)(facturacion.mostCurrent._panelordenproductos));
 BA.debugLineNum = 256;BA.debugLine="PanelOpcionesBack.Tag = 100%x";
Debug.ShouldStop(-2147483648);
facturacion.mostCurrent._panelopcionesback.runMethod(false,"setTag",(facturacion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),facturacion.mostCurrent.activityBA)));
 BA.debugLineNum = 257;BA.debugLine="PanelOpcionesBack.SetColorAnimated(150,Colors.AR";
Debug.ShouldStop(1);
facturacion.mostCurrent._panelopcionesback.runVoidMethod ("SetColorAnimated",(Object)(BA.numberCast(int.class, 150)),(Object)(facturacion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 180)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))),(Object)(facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 };
 BA.debugLineNum = 260;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(8);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 261;BA.debugLine="a.InitializeTranslate(\"ProductosOpciones\", 0,0,po";
Debug.ShouldStop(16);
_a.runVoidMethod ("InitializeTranslate",facturacion.mostCurrent.activityBA,(Object)(BA.ObjectToString("ProductosOpciones")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _posicion)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 262;BA.debugLine="a.Duration = 250";
Debug.ShouldStop(32);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, 250));
 BA.debugLineNum = 263;BA.debugLine="a.Start(PanelOpcionesBack)";
Debug.ShouldStop(64);
_a.runVoidMethod ("Start",(Object)((facturacion.mostCurrent._panelopcionesback.getObject())));
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
public static RemoteObject  _paneldireccion_click() throws Exception{
try {
		Debug.PushSubsStack("PanelDireccion_Click (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,412);
if (RapidSub.canDelegate("paneldireccion_click")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","paneldireccion_click");}
 BA.debugLineNum = 412;BA.debugLine="Sub PanelDireccion_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 414;BA.debugLine="If PanelDireccionModal.IsInitialized = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",facturacion.mostCurrent._paneldireccionmodal.runMethod(true,"IsInitialized"),facturacion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 415;BA.debugLine="Activity.LoadLayout(\"frmDireccionesModal\")";
Debug.ShouldStop(1073741824);
facturacion.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDireccionesModal")),facturacion.mostCurrent.activityBA);
 BA.debugLineNum = 416;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight =";
Debug.ShouldStop(-2147483648);
facturacion.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",facturacion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85))));
 BA.debugLineNum = 417;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextCol";
Debug.ShouldStop(1);
facturacion.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 418;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typefac";
Debug.ShouldStop(2);
facturacion.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(false,"setTypeface",facturacion.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 420;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.T";
Debug.ShouldStop(8);
facturacion.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 421;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.T";
Debug.ShouldStop(16);
facturacion.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(false,"setTypeface",facturacion.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 422;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.H";
Debug.ShouldStop(32);
facturacion.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setHeight",facturacion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),facturacion.mostCurrent.activityBA));
 BA.debugLineNum = 423;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.Gr";
Debug.ShouldStop(64);
facturacion.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent._listviewdirecciones),(Object)(facturacion.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(facturacion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 426;BA.debugLine="PanelDireccionModal.Visible = False";
Debug.ShouldStop(512);
facturacion.mostCurrent._paneldireccionmodal.runMethod(true,"setVisible",facturacion.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 427;BA.debugLine="PanelDireccionModal.SetVisibleAnimated(250,True)";
Debug.ShouldStop(1024);
facturacion.mostCurrent._paneldireccionmodal.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(facturacion.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 429;BA.debugLine="funcion.DisableView(True,PanelOrdenProductos)";
Debug.ShouldStop(4096);
facturacion.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent.__c.getField(true,"True")),(Object)(facturacion.mostCurrent._panelordenproductos));
 BA.debugLineNum = 430;BA.debugLine="funcion.DisableView(False,PanelDireccionModal)";
Debug.ShouldStop(8192);
facturacion.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,facturacion.mostCurrent.activityBA,(Object)(facturacion.mostCurrent.__c.getField(true,"False")),(Object)(facturacion.mostCurrent._paneldireccionmodal));
 BA.debugLineNum = 431;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(16384);
_cargardirecciones();
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
public static RemoteObject  _productosopciones_animationend() throws Exception{
try {
		Debug.PushSubsStack("ProductosOpciones_AnimationEnd (facturacion) ","facturacion",5,facturacion.mostCurrent.activityBA,facturacion.mostCurrent,266);
if (RapidSub.canDelegate("productosopciones_animationend")) { return com.menube.app.facturacion.remoteMe.runUserSub(false, "facturacion","productosopciones_animationend");}
 BA.debugLineNum = 266;BA.debugLine="Sub ProductosOpciones_AnimationEnd";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="PanelOpcionesBack.Left = PanelOpcionesBack.Tag";
Debug.ShouldStop(1024);
facturacion.mostCurrent._panelopcionesback.runMethod(true,"setLeft",BA.numberCast(int.class, facturacion.mostCurrent._panelopcionesback.runMethod(false,"getTag")));
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}