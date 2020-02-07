package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_facturacion_subs_0 {


public static RemoteObject  _btnabrirdireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnAbrirDireccion_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,432);
if (RapidSub.canDelegate("btnabrirdireccion_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnabrirdireccion_click");}
 BA.debugLineNum = 432;BA.debugLine="Sub btnAbrirDireccion_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="Direcciones.Initialize";
Debug.ShouldStop(65536);
b4i_facturacion._direcciones.runVoidMethod ("_initialize" /*RemoteObject*/ );
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackmdaldireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackMdalDireccion_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,428);
if (RapidSub.canDelegate("btnbackmdaldireccion_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnbackmdaldireccion_click");}
 BA.debugLineNum = 428;BA.debugLine="Sub btnBackMdalDireccion_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 429;BA.debugLine="PanelFondoDireccionModal.SetAlphaAnimated(500,0)";
Debug.ShouldStop(4096);
b4i_facturacion._panelfondodireccionmodal.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 430;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("btnOpcionesBack_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,328);
if (RapidSub.canDelegate("btnopcionesback_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnopcionesback_click");}
 BA.debugLineNum = 328;BA.debugLine="Sub btnOpcionesBack_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 329;BA.debugLine="PanelOpcionesBack.SetAlphaAnimated(500,0)";
Debug.ShouldStop(256);
b4i_facturacion._panelopcionesback.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 330;BA.debugLine="If changeValue Then";
Debug.ShouldStop(512);
if (b4i_facturacion._changevalue.getBoolean()) { 
 BA.debugLineNum = 331;BA.debugLine="changeValue = False";
Debug.ShouldStop(1024);
b4i_facturacion._changevalue = b4i_main.__c.runMethod(true,"False");
 }else {
 BA.debugLineNum = 333;BA.debugLine="stModificarCantidad.Value = valorCantidad";
Debug.ShouldStop(4096);
b4i_facturacion._stmodificarcantidad.runMethod(true,"setValue:",BA.numberCast(double.class, b4i_facturacion._valorcantidad));
 };
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
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
		Debug.PushSubsStack("btnOpcionesEliminar_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,339);
if (RapidSub.canDelegate("btnopcioneseliminar_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnopcioneseliminar_click");}
 BA.debugLineNum = 339;BA.debugLine="Sub btnOpcionesEliminar_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 341;BA.debugLine="Msgbox2(\"msjEliminar\",\"Desea eliminar este produc";
Debug.ShouldStop(1048576);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("msjEliminar")),(Object)(BA.ObjectToString("Desea eliminar este producto?")),(Object)(BA.ObjectToString("Aviso!!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
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
public static RemoteObject  _btnopcionesproductosalvar_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpcionesProductoSalvar_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,284);
if (RapidSub.canDelegate("btnopcionesproductosalvar_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnopcionesproductosalvar_click");}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonpropiedades = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 284;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 286;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
Debug.ShouldStop(536870912);
_map = (b4i_facturacion._btnopcionesproductosalvar.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 287;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
Debug.ShouldStop(1073741824);
_mapcalculos = b4i_facturacion._funciones.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_original")))))),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descuento")))))),(Object)(BA.numberCast(double.class, b4i_facturacion._txtcantidad.runMethod(true,"Text"))),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_porciento_tax")))))),(Object)(b4i_facturacion._main._impuestoincluido /*RemoteObject*/ ),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 288;BA.debugLine="Dim json As String";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 290;BA.debugLine="Dim jsonPropiedades As String = \"[]\"";
Debug.ShouldStop(2);
_jsonpropiedades = BA.ObjectToString("[]");Debug.locals.put("jsonPropiedades", _jsonpropiedades);Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 294;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(32);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_facturacion._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_propiedades':"),_jsonpropiedades,RemoteObject.createImmutable(",'f_tipo':2"),RemoteObject.createImmutable(",'f_cantidad':"),b4i_facturacion._txtcantidad.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_idserver':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idserver")))),RemoteObject.createImmutable(",'f_diferencia':"),b4i_facturacion._funciones.runMethod(true,"_getdiferenciacantidad::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))))),(Object)(BA.numberCast(double.class, b4i_facturacion._txtcantidad.runMethod(true,"Text")))),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_comentario':'"),b4i_facturacion._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_facturacion._txtproductocomentario.runMethod(true,"Text"))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_porciento_tax")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 310;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(2097152);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 311;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(4194304);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 312;BA.debugLine="JobDetalleTemporal.Tag = False";
Debug.ShouldStop(8388608);
_jobdetalletemporal.setField ("_tag" /*RemoteObject*/ ,(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 314;BA.debugLine="changeValue = True";
Debug.ShouldStop(33554432);
b4i_facturacion._changevalue = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 316;BA.debugLine="If Main.isLoged And 1 == 2 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean(".",b4i_facturacion._main._isloged /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 317;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
Debug.ShouldStop(268435456);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 319;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
Debug.ShouldStop(1073741824);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 };
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("btnOrdenBack_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,63);
if (RapidSub.canDelegate("btnordenback_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnordenback_click");}
 BA.debugLineNum = 63;BA.debugLine="Sub btnOrdenBack_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 65;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(1);
b4i_facturacion._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 66;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(2);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 68;BA.debugLine="Main.actualizarCantidad";
Debug.ShouldStop(8);
b4i_facturacion._main.runVoidMethod ("_actualizarcantidad" /*RemoteObject*/ );
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
public static RemoteObject  _btnordeneliminartodos_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrdenEliminarTodos_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,480);
if (RapidSub.canDelegate("btnordeneliminartodos_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnordeneliminartodos_click");}
 BA.debugLineNum = 480;BA.debugLine="Sub btnOrdenEliminarTodos_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 481;BA.debugLine="Msgbox2(\"MsgDelete\",\"Seguro que desea borrar todo";
Debug.ShouldStop(1);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("MsgDelete")),(Object)(BA.ObjectToString("Seguro que desea borrar todos los productos del carrito?")),(Object)(BA.ObjectToString("Advertencia!!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 482;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("btnOrdenEnviar_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,439);
if (RapidSub.canDelegate("btnordenenviar_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnordenenviar_click");}
 BA.debugLineNum = 439;BA.debugLine="Sub btnOrdenEnviar_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 441;BA.debugLine="If Main.isLoged Then";
Debug.ShouldStop(16777216);
if (b4i_facturacion._main._isloged /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 443;BA.debugLine="If Main.mapEmpresaInfo.Get(\"f_pedidos_minimos\")";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, b4i_facturacion._main._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_pedidos_minimos"))))),b4i_facturacion._total)) { 
 BA.debugLineNum = 444;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El monto del pedido minimo debe ser de RD$"),b4i_facturacion._main._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_pedidos_minimos")))))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 445;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 446;BA.debugLine="Else If ListaCarrito.Size = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",b4i_facturacion._listacarrito.runClassMethod (b4i_customlistview.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 447;BA.debugLine="Msgbox(\"No hay productos para registrar esta or";
Debug.ShouldStop(1073741824);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No hay productos para registrar esta orden")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 448;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 449;BA.debugLine="else if lblDireccion.Tag == 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",b4i_facturacion._lbldireccion.runMethod(false,"Tag"),RemoteObject.createImmutable((0)))) { 
 BA.debugLineNum = 450;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Seleccione la dirección para el envio")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 451;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 }}}
;
 BA.debugLineNum = 454;BA.debugLine="Msgbox2(\"MsgVender\",\"Desea realizar esta orden?\"";
Debug.ShouldStop(32);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("MsgVender")),(Object)(BA.ObjectToString("Desea realizar esta orden?")),(Object)(BA.ObjectToString("Aviso!!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 }else {
 BA.debugLineNum = 458;BA.debugLine="Msgbox2(\"MsgLogin\",\"Antes realizar su orden tien";
Debug.ShouldStop(512);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("MsgLogin")),(Object)(BA.ObjectToString("Antes realizar su orden tiene que iniciar sesion")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("cargarDirecciones (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,409);
if (RapidSub.canDelegate("cargardirecciones")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 409;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 410;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(33554432);
_jobdirecciones = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 411;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(67108864);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 412;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(134217728);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("cargarProductosTemporales (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,72);
if (RapidSub.canDelegate("cargarproductostemporales")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","cargarproductostemporales");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 72;BA.debugLine="Sub cargarProductosTemporales";
Debug.ShouldStop(128);
 BA.debugLineNum = 74;BA.debugLine="Dim json As String  = \"'f_idempresa':\"&Main.idEmp";
Debug.ShouldStop(512);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_facturacion._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(" ,'f_imei':"),b4i_facturacion._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 77;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(4096);
_jobbuscar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 78;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(8192);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobBuscar")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 79;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pro";
Debug.ShouldStop(16384);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_productos_temporales_by_key2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
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
public static RemoteObject  _createlistitem(RemoteObject _nombre,RemoteObject _cantidad,RemoteObject _img,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,249);
if (RapidSub.canDelegate("createlistitem")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","createlistitem", _nombre, _cantidad, _img, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("img", _img);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 249;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As S";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 250;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(33554432);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 251;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 252;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(134217728);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 253;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
Debug.ShouldStop(268435456);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPanelesItems")),b4i_facturacion.ba);
 BA.debugLineNum = 254;BA.debugLine="lblNomCat.Text = Nombre";
Debug.ShouldStop(536870912);
b4i_facturacion._lblnomcat.runMethod(true,"setText:",_nombre);
 BA.debugLineNum = 255;BA.debugLine="lblCantCat.Text = cantidad";
Debug.ShouldStop(1073741824);
b4i_facturacion._lblcantcat.runMethod(true,"setText:",_cantidad);
 BA.debugLineNum = 256;BA.debugLine="imgCat.Bitmap = img";
Debug.ShouldStop(-2147483648);
b4i_facturacion._imgcat.runMethod(false,"setBitmap:",_img);
 BA.debugLineNum = 257;BA.debugLine="Return p";
Debug.ShouldStop(1);
if (true) return _p;
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitemonlystring(RemoteObject _dir,RemoteObject _fecha,RemoteObject _principal,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItemOnlyString (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,238);
if (RapidSub.canDelegate("createlistitemonlystring")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","createlistitemonlystring", _dir, _fecha, _principal, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("fecha", _fecha);
Debug.locals.put("principal", _principal);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 238;BA.debugLine="Sub CreateListItemOnlyString(Dir As String, fecha";
Debug.ShouldStop(8192);
 BA.debugLineNum = 239;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16384);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 240;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(32768);
_p.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 241;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(65536);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 242;BA.debugLine="p.LoadLayout(\"frmItemsDir\")";
Debug.ShouldStop(131072);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmItemsDir")),b4i_facturacion.ba);
 BA.debugLineNum = 243;BA.debugLine="lblDir.Text = Dir";
Debug.ShouldStop(262144);
b4i_facturacion._lbldir.runMethod(true,"setText:",_dir);
 BA.debugLineNum = 244;BA.debugLine="lblFecha.Text = fecha";
Debug.ShouldStop(524288);
b4i_facturacion._lblfecha.runMethod(true,"setText:",_fecha);
 BA.debugLineNum = 245;BA.debugLine="lblPrincipal.Text = principal";
Debug.ShouldStop(1048576);
b4i_facturacion._lblprincipal.runMethod(true,"setText:",_principal);
 BA.debugLineNum = 246;BA.debugLine="Return p";
Debug.ShouldStop(2097152);
if (true) return _p;
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("Initialize (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,49);
if (RapidSub.canDelegate("initialize")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","initialize");}
 BA.debugLineNum = 49;BA.debugLine="Sub Initialize";
Debug.ShouldStop(65536);
 BA.debugLineNum = 51;BA.debugLine="page.Initialize(\"PageLogin\")";
Debug.ShouldStop(262144);
b4i_facturacion._page.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("PageLogin")));
 BA.debugLineNum = 53;BA.debugLine="page.RootPanel.LoadLayout(\"frmProductoOrden\")";
Debug.ShouldStop(1048576);
b4i_facturacion._page.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmProductoOrden")),b4i_facturacion.ba);
 BA.debugLineNum = 55;BA.debugLine="Main.NavControl.ShowPage2(page,True)";
Debug.ShouldStop(4194304);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_facturacion._page).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 56;BA.debugLine="cargarProductosTemporales";
Debug.ShouldStop(8388608);
_cargarproductostemporales();
 BA.debugLineNum = 57;BA.debugLine="lblDireccion.Tag = 0";
Debug.ShouldStop(16777216);
b4i_facturacion._lbldireccion.runMethod(false,"setTag:",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 59;BA.debugLine="Main.smc.Tag = \"facturacion\"";
Debug.ShouldStop(67108864);
b4i_facturacion._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("facturacion")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("JobDone (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,84);
if (RapidSub.canDelegate("jobdone")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 84;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 92;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 93;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_facturacion._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_facturacion._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 94;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 97;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",b4i_facturacion._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 98;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 101;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 102;BA.debugLine="Dim list As List";
Debug.ShouldStop(32);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 103;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(64);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 104;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
Debug.ShouldStop(128);
_json.runVoidMethod ("Initialize:",(Object)(b4i_facturacion._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 105;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(256);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 108;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobSalvar"),BA.ObjectToString("JobEliminarTodo"))) {
case 0: {
 BA.debugLineNum = 112;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(32768);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 114;BA.debugLine="ListaCarrito.Clear";
Debug.ShouldStop(131072);
b4i_facturacion._listacarrito.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 115;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 116;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
Debug.ShouldStop(524288);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tiene productos registrados")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 117;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 121;BA.debugLine="total = 0";
Debug.ShouldStop(16777216);
b4i_facturacion._total = BA.numberCast(double.class, 0);
 BA.debugLineNum = 122;BA.debugLine="tax = 0";
Debug.ShouldStop(33554432);
b4i_facturacion._tax = BA.numberCast(double.class, 0);
 BA.debugLineNum = 123;BA.debugLine="subtotal = 0";
Debug.ShouldStop(67108864);
b4i_facturacion._subtotal = BA.numberCast(double.class, 0);
 BA.debugLineNum = 125;BA.debugLine="For i = 0 To list.Size -1";
Debug.ShouldStop(268435456);
{
final int step24 = 1;
final int limit24 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step24 > 0 && _i <= limit24) || (step24 < 0 && _i >= limit24) ;_i = ((int)(0 + _i + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(536870912);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 128;BA.debugLine="total = total + map.Get(\"f_importe\")";
Debug.ShouldStop(-2147483648);
b4i_facturacion._total = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._total,BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_importe")))))}, "+",1, 0);
 BA.debugLineNum = 129;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
Debug.ShouldStop(1);
b4i_facturacion._tax = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._tax,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax"))))),BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))))}, "*",0, 0))}, "+",1, 0);
 BA.debugLineNum = 130;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
Debug.ShouldStop(2);
b4i_facturacion._subtotal = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._subtotal,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))))}, "*",0, 0))}, "+",1, 0);
 BA.debugLineNum = 132;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(8);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 133;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 134;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(32);
_bm = b4i_facturacion._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 136;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(128);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 143;BA.debugLine="ListaCarrito.Add(CreateListItem(map.Get(\"f_des";
Debug.ShouldStop(16384);
b4i_facturacion._listacarrito.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))),RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))),RemoteObject.createImmutable("   $"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_original")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))),_bm,BA.numberCast(int.class, b4i_facturacion._listacarrito.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_map)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 148;BA.debugLine="If Main.isLoged Then";
Debug.ShouldStop(524288);
if (b4i_facturacion._main._isloged /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 149;BA.debugLine="lblPrecioEnvio.Text = Main.mapEmpresaInfo.Get(";
Debug.ShouldStop(1048576);
b4i_facturacion._lblprecioenvio.runMethod(true,"setText:",BA.ObjectToString(b4i_facturacion._main._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_envio"))))));
 BA.debugLineNum = 150;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(to";
Debug.ShouldStop(2097152);
b4i_facturacion._lblordentotalpagar.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_facturacion._total,BA.numberCast(double.class, b4i_facturacion._main._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_envio")))))}, "+",1, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)))));
 }else {
 BA.debugLineNum = 154;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat2(t";
Debug.ShouldStop(33554432);
b4i_facturacion._lblordentotalpagar.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat2:::::",(Object)(b4i_facturacion._total),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)),(Object)(BA.numberCast(int.class, 2)),(Object)(b4i_main.__c.runMethod(true,"False")))));
 BA.debugLineNum = 155;BA.debugLine="hud.ToastMessageShow(\"Precio calculado sin pre";
Debug.ShouldStop(67108864);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Precio calculado sin precio de envio!!")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 break; }
case 1: {
 BA.debugLineNum = 161;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(1);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 162;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 163;BA.debugLine="If Job.Tag Then";
Debug.ShouldStop(4);
if (BA.ObjectToBoolean(_job.getField(false,"_tag" /*RemoteObject*/ )).getBoolean()) { 
 BA.debugLineNum = 164;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado.\",Fa";
Debug.ShouldStop(8);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto eliminado.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 165;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto -";
Debug.ShouldStop(16);
b4i_facturacion._main._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._main._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "-",1, 1);
 }else {
 BA.debugLineNum = 167;BA.debugLine="hud.ToastMessageShow(\"Producto actualizado.\",";
Debug.ShouldStop(64);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto actualizado.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 170;BA.debugLine="cargarProductosTemporales";
Debug.ShouldStop(512);
_cargarproductostemporales();
 BA.debugLineNum = 171;BA.debugLine="btnOpcionesBack_Click";
Debug.ShouldStop(1024);
_btnopcionesback_click();
 }else {
 BA.debugLineNum = 173;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
Debug.ShouldStop(4096);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay unidades suficientes de este producto. La existencia actual es de "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_existencia")))))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 174;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 break; }
case 2: {
 BA.debugLineNum = 178;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(131072);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 179;BA.debugLine="MiListaDireccion.Clear";
Debug.ShouldStop(262144);
b4i_facturacion._milistadireccion.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 180;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 181;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(1048576);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tiene direcciones registradas")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 182;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 185;BA.debugLine="Dim dr,city,name,default=\"\" As String";
Debug.ShouldStop(16777216);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_city = RemoteObject.createImmutable("");Debug.locals.put("city", _city);
_name = RemoteObject.createImmutable("");Debug.locals.put("name", _name);
_default = BA.ObjectToString("");Debug.locals.put("default", _default);Debug.locals.put("default", _default);
 BA.debugLineNum = 186;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(33554432);
{
final int step67 = 1;
final int limit67 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step67 > 0 && _i <= limit67) || (step67 < 0 && _i >= limit67) ;_i = ((int)(0 + _i + step67))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 187;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(67108864);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 188;BA.debugLine="dr = funciones.base64_Decode(map.Get(\"f_direcc";
Debug.ShouldStop(134217728);
_dr = b4i_facturacion._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion1")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 189;BA.debugLine="city = \" ,\"&map.Get(\"f_sector_city\")";
Debug.ShouldStop(268435456);
_city = RemoteObject.concat(RemoteObject.createImmutable(" ,"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_sector_city")))));Debug.locals.put("city", _city);
 BA.debugLineNum = 190;BA.debugLine="name = map.Get(\"f_nombre_direccion\")";
Debug.ShouldStop(536870912);
_name = BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre_direccion")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 191;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"Length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 192;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(-2147483648);
_dr = RemoteObject.concat(_dr.runMethod(true,"SubString2::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 195;BA.debugLine="If map.Get(\"f_principal\") Then";
Debug.ShouldStop(4);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal"))))).getBoolean()) { 
 BA.debugLineNum = 198;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(32);
if (b4i_facturacion._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 200;BA.debugLine="default = \"Main address\"";
Debug.ShouldStop(128);
_default = BA.ObjectToString("Main address");Debug.locals.put("default", _default);
 }else {
 BA.debugLineNum = 204;BA.debugLine="default = \"Dirección principal\"";
Debug.ShouldStop(2048);
_default = BA.ObjectToString("Dirección principal");Debug.locals.put("default", _default);
 };
 };
 BA.debugLineNum = 209;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
Debug.ShouldStop(65536);
b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"setDateFormat:",BA.ObjectToString("dd/MM/yyyy"));
 BA.debugLineNum = 211;BA.debugLine="MiListaDireccion.Add(CreateListItemOnlyString(";
Debug.ShouldStop(262144);
b4i_facturacion._milistadireccion.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitemonlystring(RemoteObject.concat(_name,RemoteObject.createImmutable(": "),_dr,_city),b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(BA.numberCast(long.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fecha"))))))),_default,BA.numberCast(int.class, b4i_facturacion._milistadireccion.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 80))))).getObject()),(Object)((_map)));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 215;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Orden registrada."),b4i_main.__c.runMethod(true,"CRLF"),RemoteObject.createImmutable("Numero de orden: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 216;BA.debugLine="Main.cantidadProduto = 0";
Debug.ShouldStop(8388608);
b4i_facturacion._main._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 217;BA.debugLine="btnOrdenBack_Click";
Debug.ShouldStop(16777216);
_btnordenback_click();
 break; }
case 4: {
 BA.debugLineNum = 220;BA.debugLine="map=map.Get(\"f_data\")";
Debug.ShouldStop(134217728);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 221;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 222;BA.debugLine="ListaCarrito.Clear";
Debug.ShouldStop(536870912);
b4i_facturacion._listacarrito.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 223;BA.debugLine="Main.cantidadProduto = 0";
Debug.ShouldStop(1073741824);
b4i_facturacion._main._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 224;BA.debugLine="lblOrdenTotalPagar.Text = \"0.00\"";
Debug.ShouldStop(-2147483648);
b4i_facturacion._lblordentotalpagar.runMethod(true,"setText:",BA.ObjectToString("0.00"));
 BA.debugLineNum = 225;BA.debugLine="hud.ToastMessageShow(\"Eliminados Correctamente";
Debug.ShouldStop(1);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Eliminados Correctamente")),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 227;BA.debugLine="Main.cantidadProduto = 0";
Debug.ShouldStop(4);
b4i_facturacion._main._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 228;BA.debugLine="btnOrdenBack_Click";
Debug.ShouldStop(8);
_btnordenback_click();
 }else {
 BA.debugLineNum = 230;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Los productos no fueron eliminados")),(Object)(RemoteObject.createImmutable("Información")));
 };
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
public static RemoteObject  _listacarrito_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListaCarrito_ItemClick (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,260);
if (RapidSub.canDelegate("listacarrito_itemclick")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","listacarrito_itemclick", _index, _value);}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 260;BA.debugLine="Sub ListaCarrito_ItemClick (Index As Int, Value As";
Debug.ShouldStop(8);
 BA.debugLineNum = 262;BA.debugLine="Dim mapa As Map = Value";
Debug.ShouldStop(32);
_mapa = (_value);Debug.locals.put("mapa", _mapa);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 263;BA.debugLine="btnOpcionesProductoSalvar.Tag = mapa";
Debug.ShouldStop(64);
b4i_facturacion._btnopcionesproductosalvar.runMethod(false,"setTag:",(_mapa));
 BA.debugLineNum = 266;BA.debugLine="lblOpcionesProductoNombre.Text = mapa.Get(\"f_desc";
Debug.ShouldStop(512);
b4i_facturacion._lblopcionesproductonombre.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 267;BA.debugLine="txtCantidad.Text =mapa.Get(\"f_cantidad\")";
Debug.ShouldStop(1024);
b4i_facturacion._txtcantidad.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad"))))));
 BA.debugLineNum = 268;BA.debugLine="valorCantidad = mapa.Get(\"f_cantidad\")";
Debug.ShouldStop(2048);
b4i_facturacion._valorcantidad = BA.numberCast(int.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))));
 BA.debugLineNum = 269;BA.debugLine="txtProductoComentario.Text = mapa.Get(\"f_comentar";
Debug.ShouldStop(4096);
b4i_facturacion._txtproductocomentario.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_comentario"))))));
 BA.debugLineNum = 271;BA.debugLine="PanelOpcionesBack.Left = 0%x";
Debug.ShouldStop(16384);
b4i_facturacion._panelopcionesback.runMethod(true,"setLeft:",b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 272;BA.debugLine="PanelOpcionesBack.SetAlphaAnimated(500,1)";
Debug.ShouldStop(32768);
b4i_facturacion._panelopcionesback.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _milistadireccion_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("MiListaDireccion_ItemClick (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,418);
if (RapidSub.canDelegate("milistadireccion_itemclick")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","milistadireccion_itemclick", _index, _value);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 418;BA.debugLine="Sub MiListaDireccion_ItemClick (Index As Int, Valu";
Debug.ShouldStop(2);
 BA.debugLineNum = 420;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(8);
_map = (_value);Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 422;BA.debugLine="lblDireccion.Text = funciones.base64_Decode(map.G";
Debug.ShouldStop(32);
b4i_facturacion._lbldireccion.runMethod(true,"setText:",RemoteObject.concat(b4i_facturacion._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion1"))))))),RemoteObject.createImmutable(", "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_sector_city")))),RemoteObject.createImmutable(", "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nom_estado"))))));
 BA.debugLineNum = 423;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
Debug.ShouldStop(64);
b4i_facturacion._lbldireccion.runMethod(false,"setTag:",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 424;BA.debugLine="btnBackMdalDireccion_Click";
Debug.ShouldStop(128);
_btnbackmdaldireccion_click();
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgdelete_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgDelete_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,484);
if (RapidSub.canDelegate("msgdelete_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","msgdelete_click", _buttontext);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobeliminartodo = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 484;BA.debugLine="Sub MsgDelete_Click(ButtonText As String)";
Debug.ShouldStop(8);
 BA.debugLineNum = 486;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 487;BA.debugLine="Dim json As String";
Debug.ShouldStop(64);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 489;BA.debugLine="json = \"'f_imei':\"&Main.imei";
Debug.ShouldStop(256);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_imei':"),b4i_facturacion._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 491;BA.debugLine="Dim JobEliminarTodo As HttpJob";
Debug.ShouldStop(1024);
_jobeliminartodo = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEliminarTodo", _jobeliminartodo);
 BA.debugLineNum = 492;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me)";
Debug.ShouldStop(2048);
_jobeliminartodo.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobEliminarTodo")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 493;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa/";
Debug.ShouldStop(4096);
_jobeliminartodo.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_eliminar_detalle_usuarios2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 }else 
{ BA.debugLineNum = 495;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 496;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msglogin_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgLogin_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,398);
if (RapidSub.canDelegate("msglogin_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","msglogin_click", _buttontext);}
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 398;BA.debugLine="Sub MsgLogin_Click(ButtonText As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 400;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 401;BA.debugLine="Login.Initialize";
Debug.ShouldStop(65536);
b4i_facturacion._login.runVoidMethod ("_initialize" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 403;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 404;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgvender_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgVender_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,464);
if (RapidSub.canDelegate("msgvender_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","msgvender_click", _buttontext);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 464;BA.debugLine="Sub MsgVender_Click(ButtonText As String)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 466;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 467;BA.debugLine="Dim json As String";
Debug.ShouldStop(262144);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 468;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempres";
Debug.ShouldStop(524288);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_comprobante_fiscal':false,'f_idempresa':"),b4i_facturacion._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_itbis':"),b4i_facturacion._tax,RemoteObject.createImmutable(",'f_subtotal':"),b4i_facturacion._subtotal,RemoteObject.createImmutable(",'f_total':"),b4i_facturacion._total,RemoteObject.createImmutable(",'f_nota':'','f_imei':"),b4i_facturacion._main._imei /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_direccion':'"),b4i_facturacion._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_facturacion._lbldireccion.runMethod(true,"Text"))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 470;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(2097152);
_jobsalvar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 471;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(4194304);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobSalvar")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 472;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_sa";
Debug.ShouldStop(8388608);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_salvar_orden_delivery2/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else 
{ BA.debugLineNum = 474;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 475;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msjeliminar_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("msjEliminar_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,352);
if (RapidSub.canDelegate("msjeliminar_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","msjeliminar_click", _buttontext);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 352;BA.debugLine="Sub msjEliminar_Click(ButtonText As String)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 354;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 356;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
Debug.ShouldStop(8);
_map = (b4i_facturacion._btnopcionesproductosalvar.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 357;BA.debugLine="Dim json As String";
Debug.ShouldStop(16);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 359;BA.debugLine="json = \"'f_regresa':true\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(64);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':true"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_facturacion._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':2"),RemoteObject.createImmutable(",'f_idserver':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idserver")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 364;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(2048);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 365;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTempora";
Debug.ShouldStop(4096);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 366;BA.debugLine="JobDetalleTemporal.Tag = True";
Debug.ShouldStop(8192);
_jobdetalletemporal.setField ("_tag" /*RemoteObject*/ ,(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 368;BA.debugLine="If Main.isLoged And 1 == 2 Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean(".",b4i_facturacion._main._isloged /*RemoteObject*/ ) && RemoteObject.solveBoolean("=",RemoteObject.createImmutable(1),BA.numberCast(double.class, 2))) { 
 BA.debugLineNum = 369;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntove";
Debug.ShouldStop(65536);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 371;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntove";
Debug.ShouldStop(262144);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 };
 }else 
{ BA.debugLineNum = 375;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 376;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("PanelDireccion_Click (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,384);
if (RapidSub.canDelegate("paneldireccion_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","paneldireccion_click");}
 BA.debugLineNum = 384;BA.debugLine="Sub PanelDireccion_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 386;BA.debugLine="If Main.isLoged Then";
Debug.ShouldStop(2);
if (b4i_facturacion._main._isloged /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 388;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(8);
_cargardirecciones();
 BA.debugLineNum = 389;BA.debugLine="PanelFondoDireccionModal.Top = 0%y";
Debug.ShouldStop(16);
b4i_facturacion._panelfondodireccionmodal.runMethod(true,"setTop:",b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 390;BA.debugLine="PanelFondoDireccionModal.SetAlphaAnimated(500,1)";
Debug.ShouldStop(32);
b4i_facturacion._panelfondodireccionmodal.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 }else {
 BA.debugLineNum = 393;BA.debugLine="Msgbox2(\"MsgLogin\",\"Antes de ver sus direcciones";
Debug.ShouldStop(256);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("MsgLogin")),(Object)(BA.ObjectToString("Antes de ver sus direcciones tiene que iniciar sesion")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
 //BA.debugLineNum = 7;BA.debugLine="Private page As Page";
b4i_facturacion._page = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 9;BA.debugLine="Private btnOrdenBack As Button";
b4i_facturacion._btnordenback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 10;BA.debugLine="Private PanelOrdenTitulo As Panel";
b4i_facturacion._panelordentitulo = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private ListaCarrito As CustomListView";
b4i_facturacion._listacarrito = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 12;BA.debugLine="Dim hud As HUD";
b4i_facturacion._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 13;BA.debugLine="Dim changeValue As Boolean = False";
b4i_facturacion._changevalue = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 14;BA.debugLine="dim valorCantidad as Int = 0";
b4i_facturacion._valorcantidad = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 16;BA.debugLine="Dim tax As Double = 0";
b4i_facturacion._tax = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 17;BA.debugLine="Dim subtotal As Double = 0";
b4i_facturacion._subtotal = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 18;BA.debugLine="Dim total As Double = 0";
b4i_facturacion._total = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 21;BA.debugLine="Private lblOrdenTotalPagar As Label";
b4i_facturacion._lblordentotalpagar = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblPrecioEnvio As Label";
b4i_facturacion._lblprecioenvio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private lblDireccion As Label";
b4i_facturacion._lbldireccion = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private imgCat As ImageView";
b4i_facturacion._imgcat = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblNomCat As Label";
b4i_facturacion._lblnomcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblCantCat As Label";
b4i_facturacion._lblcantcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblOpcionesProductoNombre As Label";
b4i_facturacion._lblopcionesproductonombre = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private txtCantidad As TextField";
b4i_facturacion._txtcantidad = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private stModificarCantidad As Stepper";
b4i_facturacion._stmodificarcantidad = RemoteObject.createNew ("B4IStepperWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnOpcionesProductoSalvar As Button";
b4i_facturacion._btnopcionesproductosalvar = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private PanelOpcionesBack As Panel";
b4i_facturacion._panelopcionesback = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnOpcionesBack As Button";
b4i_facturacion._btnopcionesback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private btnOpcionesEliminar As Button";
b4i_facturacion._btnopcioneseliminar = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private txtProductoComentario As TextField";
b4i_facturacion._txtproductocomentario = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private PanelDireccion As Panel";
b4i_facturacion._paneldireccion = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private MiListaDireccion As CustomListView";
b4i_facturacion._milistadireccion = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 37;BA.debugLine="Private btnBackMdalDireccion As Button";
b4i_facturacion._btnbackmdaldireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnAbrirDireccion As Button";
b4i_facturacion._btnabrirdireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private PanelFondoDireccionModal As Panel";
b4i_facturacion._panelfondodireccionmodal = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblDir As Label";
b4i_facturacion._lbldir = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lblFecha As Label";
b4i_facturacion._lblfecha = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private lblPrincipal As Label";
b4i_facturacion._lblprincipal = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private btnOrdenEnviar As Button";
b4i_facturacion._btnordenenviar = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private btnOrdenEliminarTodos As Button";
b4i_facturacion._btnordeneliminartodos = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _stmodificarcantidad_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("stModificarCantidad_ValueChanged (facturacion) ","facturacion",5,b4i_facturacion.ba,b4i_facturacion.mostCurrent,280);
if (RapidSub.canDelegate("stmodificarcantidad_valuechanged")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","stmodificarcantidad_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 280;BA.debugLine="Sub stModificarCantidad_ValueChanged (Value As Dou";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 281;BA.debugLine="txtCantidad.Text = Value";
Debug.ShouldStop(16777216);
b4i_facturacion._txtcantidad.runMethod(true,"setText:",BA.NumberToString(_value));
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
}