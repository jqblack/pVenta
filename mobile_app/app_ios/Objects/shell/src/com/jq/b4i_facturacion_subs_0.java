package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_facturacion_subs_0 {


public static RemoteObject  _btnabrirdireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnAbrirDireccion_Click (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,443);
if (RapidSub.canDelegate("btnabrirdireccion_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnabrirdireccion_click");}
 BA.debugLineNum = 443;BA.debugLine="Sub btnAbrirDireccion_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 444;BA.debugLine="Direcciones.Initialize";
Debug.ShouldStop(134217728);
b4i_facturacion._direcciones.runVoidMethod ("_initialize" /*RemoteObject*/ );
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
public static RemoteObject  _btnopcionesproductosalvar_click() throws Exception{
try {
		Debug.PushSubsStack("btnOpcionesProductoSalvar_Click (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,386);
if (RapidSub.canDelegate("btnopcionesproductosalvar_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnopcionesproductosalvar_click");}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jsonpropiedades = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("B4IViewWrapper");
RemoteObject _ch = RemoteObject.declareNull("B4ISwitchWrapper");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 386;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
Debug.ShouldStop(4);
_map = (b4i_facturacion._btnopcionesproductosalvar.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 388;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(8);
_mapcalculos = b4i_facturacion._funcion.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_original")))))),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descuento")))))),(Object)(BA.numberCast(double.class, b4i_facturacion._txtcantidad.runMethod(true,"Text"))),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_porciento_tax")))))),(Object)(b4i_facturacion._principal._impuestoincluido /*RemoteObject*/ ),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 389;BA.debugLine="Dim json As String";
Debug.ShouldStop(16);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 391;BA.debugLine="Dim jsonPropiedades As String = \"[\"";
Debug.ShouldStop(64);
_jsonpropiedades = BA.ObjectToString("[");Debug.locals.put("jsonPropiedades", _jsonpropiedades);Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 392;BA.debugLine="For Each v As View In ScrollViewOpciones.Panel.Ge";
Debug.ShouldStop(128);
_v = RemoteObject.createNew ("B4IViewWrapper");
{
final RemoteObject group5 = b4i_facturacion._scrollviewopciones.runMethod(false,"Panel").runMethod(false,"GetAllViewsRecursive");
final int groupLen5 = group5.runMethod(true,"Size").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v.setObject(group5.runMethod(false,"Get:",index5));
Debug.locals.put("v", _v);
 BA.debugLineNum = 393;BA.debugLine="If v.Tag <> \"label\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("!",_v.runMethod(false,"Tag"),RemoteObject.createImmutable(("label")))) { 
 BA.debugLineNum = 394;BA.debugLine="Dim ch As Switch = v";
Debug.ShouldStop(512);
_ch = RemoteObject.createNew ("B4ISwitchWrapper");
_ch.setObject((_v).getObject());Debug.locals.put("ch", _ch);
 BA.debugLineNum = 395;BA.debugLine="If ch.Value Then";
Debug.ShouldStop(1024);
if (_ch.runMethod(true,"Value").getBoolean()) { 
 BA.debugLineNum = 396;BA.debugLine="jsonPropiedades = jsonPropiedades & \",{'f_idre";
Debug.ShouldStop(2048);
_jsonpropiedades = RemoteObject.concat(_jsonpropiedades,RemoteObject.createImmutable(",{'f_idrecord':"),_ch.runMethod(false,"Tag"),RemoteObject.createImmutable("}"));Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 };
 };
 }
}Debug.locals.put("v", _v);
;
 BA.debugLineNum = 400;BA.debugLine="jsonPropiedades = jsonPropiedades.Replace(\"[,\",\"[";
Debug.ShouldStop(32768);
_jsonpropiedades = _jsonpropiedades.runMethod(true,"Replace::",(Object)(BA.ObjectToString("[,")),(Object)(RemoteObject.createImmutable("[")));Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 401;BA.debugLine="jsonPropiedades = jsonPropiedades& \"]\"";
Debug.ShouldStop(65536);
_jsonpropiedades = RemoteObject.concat(_jsonpropiedades,RemoteObject.createImmutable("]"));Debug.locals.put("jsonPropiedades", _jsonpropiedades);
 BA.debugLineNum = 404;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(524288);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_facturacion._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_propiedades':"),_jsonpropiedades,RemoteObject.createImmutable(",'f_tipo':2"),RemoteObject.createImmutable(",'f_cantidad':"),b4i_facturacion._txtcantidad.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_idserver':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idserver")))),RemoteObject.createImmutable(",'f_diferencia':"),b4i_facturacion._funcion.runMethod(true,"_getdiferenciacantidad::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))))),(Object)(BA.numberCast(double.class, b4i_facturacion._txtcantidad.runMethod(true,"Text")))),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_comentario':'"),b4i_facturacion._funcion.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_facturacion._txtproductocomentario.runMethod(true,"Text"))),RemoteObject.createImmutable("'"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_porciento_tax")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 420;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(8);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 421;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(16);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 422;BA.debugLine="JobDetalleTemporal.Tag = False";
Debug.ShouldStop(32);
_jobdetalletemporal.setField ("_tag" /*RemoteObject*/ ,(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 423;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(64);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 424;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
Debug.ShouldStop(128);
b4i_facturacion._btnopcionesproductosalvar.runMethod(true,"setEnabled:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("btnOrdenEnviar_Click (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,76);
if (RapidSub.canDelegate("btnordenenviar_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","btnordenenviar_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 76;BA.debugLine="Sub btnOrdenEnviar_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 81;BA.debugLine="If Principal.mapEmpresaInfo.Get(\"f_pedidos_minimo";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, b4i_facturacion._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_pedidos_minimos"))))),b4i_facturacion._total)) { 
 BA.debugLineNum = 82;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de R";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("El monto del pedido minimo debe ser de RD$"),b4i_facturacion._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_pedidos_minimos")))))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 84;BA.debugLine="Else If ListViewOrdenProducto.NumberOfSections =";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",b4i_facturacion._listviewordenproducto.runMethod(true,"NumberOfSections"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",b4i_facturacion._listviewordenproducto.runMethod(false,"GetItems:",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"No hay productos para registrar esta ord";
Debug.ShouldStop(1048576);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No hay productos para registrar esta orden")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 86;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 }else 
{ BA.debugLineNum = 87;BA.debugLine="else if lblDireccion.Tag = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",b4i_facturacion._lbldireccion.runMethod(false,"Tag"),RemoteObject.createImmutable((0)))) { 
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",\"";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Seleccione la dirección para el envio")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 89;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 }}}
;
 BA.debugLineNum = 92;BA.debugLine="Dim json As String";
Debug.ShouldStop(134217728);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 93;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempresa";
Debug.ShouldStop(268435456);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_comprobante_fiscal':false,'f_idempresa':"),b4i_facturacion._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_itbis':"),b4i_facturacion._tax,RemoteObject.createImmutable(",'f_subtotal':"),b4i_facturacion._subtotal,RemoteObject.createImmutable(",'f_total':"),b4i_facturacion._total,RemoteObject.createImmutable(",'f_nota':'','f_direccion':'"),b4i_facturacion._funcion.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_facturacion._lbldireccion.runMethod(true,"Text"))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 95;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(1073741824);
_jobsalvar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 96;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(-2147483648);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobSalvar")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 97;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_sal";
Debug.ShouldStop(1);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/set_salvar_orden_delivery/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("cargarDirecciones (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,306);
if (RapidSub.canDelegate("cargardirecciones")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 306;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(262144);
_jobdirecciones = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 308;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(524288);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 309;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(1048576);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 310;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("cargarProductosTemporales (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,65);
if (RapidSub.canDelegate("cargarproductostemporales")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","cargarproductostemporales");}
RemoteObject _jobbuscar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 65;BA.debugLine="Sub cargarProductosTemporales";
Debug.ShouldStop(1);
 BA.debugLineNum = 66;BA.debugLine="If Main.isLoggedIn = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",b4i_facturacion._main._isloggedin /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 67;BA.debugLine="Msgbox(\"Debe iniciar sesión para facturar un pro";
Debug.ShouldStop(4);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Debe iniciar sesión para facturar un producto")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 68;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 70;BA.debugLine="Dim JobBuscar As HttpJob";
Debug.ShouldStop(32);
_jobbuscar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscar", _jobbuscar);
 BA.debugLineNum = 71;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
Debug.ShouldStop(64);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobBuscar")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 72;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pro";
Debug.ShouldStop(128);
_jobbuscar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_facturacion._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_productos_temporales_by_key"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_facturacion._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_facturacion._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_facturacion._principal._idempresa /*RemoteObject*/ ))))));
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
public static RemoteObject  _crear() throws Exception{
try {
		Debug.PushSubsStack("crear (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,50);
if (RapidSub.canDelegate("crear")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","crear");}
 BA.debugLineNum = 50;BA.debugLine="Sub crear";
Debug.ShouldStop(131072);
 BA.debugLineNum = 51;BA.debugLine="PanelDireccion.SetShadow(Colors.Gray, 0dip,2dip,";
Debug.ShouldStop(262144);
b4i_facturacion._paneldireccion.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 52;BA.debugLine="PanelOrdenProductosDetalles.SetShadow(Colors.Gray";
Debug.ShouldStop(524288);
b4i_facturacion._panelordenproductosdetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 53;BA.debugLine="PanelOrdenTotal.SetShadow(Colors.Gray, 0dip,2dip,";
Debug.ShouldStop(1048576);
b4i_facturacion._panelordentotal.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 55;BA.debugLine="lblDireccion.Tag = 0";
Debug.ShouldStop(4194304);
b4i_facturacion._lbldireccion.runMethod(false,"setTag:",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 56;BA.debugLine="lblPrecioEnvio.Text = Principal.mapEmpresaInfo.Ge";
Debug.ShouldStop(8388608);
b4i_facturacion._lblprecioenvio.runMethod(true,"setText:",BA.ObjectToString(b4i_facturacion._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_envio"))))));
 BA.debugLineNum = 58;BA.debugLine="ListViewOrdenProducto.Initialize(\"ListViewOrdenPr";
Debug.ShouldStop(33554432);
b4i_facturacion._listviewordenproducto.runVoidMethod ("Initialize:::",b4i_facturacion.ba,(Object)(BA.ObjectToString("ListViewOrdenProducto")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 59;BA.debugLine="PanelOrdenProductosDetalles.AddView(ListViewOrden";
Debug.ShouldStop(67108864);
b4i_facturacion._panelordenproductosdetalles.runVoidMethod ("AddView:::::",(Object)(((b4i_facturacion._listviewordenproducto).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_facturacion._panelordenproductosdetalles.runMethod(true,"Width")),(Object)(b4i_facturacion._panelordenproductosdetalles.runMethod(true,"Height")));
 BA.debugLineNum = 60;BA.debugLine="ListViewOrdenProducto.AddTwoLines(\"\",\"\")";
Debug.ShouldStop(134217728);
b4i_facturacion._listviewordenproducto.runVoidMethod ("AddTwoLines::",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 62;BA.debugLine="cargarProductosTemporales";
Debug.ShouldStop(536870912);
_cargarproductostemporales();
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("Initialize (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,40);
if (RapidSub.canDelegate("initialize")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","initialize");}
 BA.debugLineNum = 40;BA.debugLine="Sub Initialize";
Debug.ShouldStop(128);
 BA.debugLineNum = 42;BA.debugLine="page.Initialize(\"ProductoOrden\")";
Debug.ShouldStop(512);
b4i_facturacion._page.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("ProductoOrden")));
 BA.debugLineNum = 43;BA.debugLine="page.RootPanel.LoadLayout(\"frmProductoOrden\")";
Debug.ShouldStop(1024);
b4i_facturacion._page.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmProductoOrden")),b4i_facturacion.ba);
 BA.debugLineNum = 44;BA.debugLine="Main.NavControl.ShowPage(page)";
Debug.ShouldStop(2048);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_facturacion._page).getObject())));
 BA.debugLineNum = 45;BA.debugLine="Main.NavControl.ToolBarVisible = False";
Debug.ShouldStop(4096);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 47;BA.debugLine="crear";
Debug.ShouldStop(16384);
_crear();
 BA.debugLineNum = 48;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("JobDone (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,102);
if (RapidSub.canDelegate("jobdone")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _cell = RemoteObject.declareNull("B4ITableCell");
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 102;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(32);
 BA.debugLineNum = 110;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 111;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(16384);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_facturacion._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_facturacion._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 112;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 115;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",b4i_facturacion._funcion.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 116;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 119;BA.debugLine="Dim map As Map";
Debug.ShouldStop(4194304);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 120;BA.debugLine="Dim list As List";
Debug.ShouldStop(8388608);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 121;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(16777216);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 122;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(33554432);
_json.runVoidMethod ("Initialize:",(Object)(b4i_facturacion._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 123;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(67108864);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 125;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(268435456);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscar"),BA.ObjectToString("JobSalvar"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobEliminarTodo"))) {
case 0: {
 BA.debugLineNum = 129;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 130;BA.debugLine="ListViewOrdenProducto.RemoveViewFromParent";
Debug.ShouldStop(2);
b4i_facturacion._listviewordenproducto.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 131;BA.debugLine="ListViewOrdenProducto.Initialize(\"ListViewOrden";
Debug.ShouldStop(4);
b4i_facturacion._listviewordenproducto.runVoidMethod ("Initialize:::",b4i_facturacion.ba,(Object)(BA.ObjectToString("ListViewOrdenProducto")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 132;BA.debugLine="PanelOrdenProductosDetalles.AddView(ListViewOrd";
Debug.ShouldStop(8);
b4i_facturacion._panelordenproductosdetalles.runVoidMethod ("AddView:::::",(Object)(((b4i_facturacion._listviewordenproducto).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_facturacion._panelordenproductosdetalles.runMethod(true,"Width")),(Object)(b4i_facturacion._panelordenproductosdetalles.runMethod(true,"Height")));
 BA.debugLineNum = 133;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tiene productos registrados")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 135;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 138;BA.debugLine="total = 0";
Debug.ShouldStop(512);
b4i_facturacion._total = BA.numberCast(double.class, 0);
 BA.debugLineNum = 139;BA.debugLine="tax = 0";
Debug.ShouldStop(1024);
b4i_facturacion._tax = BA.numberCast(double.class, 0);
 BA.debugLineNum = 140;BA.debugLine="subtotal = 0";
Debug.ShouldStop(2048);
b4i_facturacion._subtotal = BA.numberCast(double.class, 0);
 BA.debugLineNum = 142;BA.debugLine="For i = 0 To list.Size -1";
Debug.ShouldStop(8192);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 143;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(16384);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 144;BA.debugLine="total = total + map.Get(\"f_importe\")";
Debug.ShouldStop(32768);
b4i_facturacion._total = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._total,BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_importe")))))}, "+",1, 0);
 BA.debugLineNum = 145;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
Debug.ShouldStop(65536);
b4i_facturacion._tax = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._tax,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax"))))),BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))))}, "*",0, 0))}, "+",1, 0);
 BA.debugLineNum = 146;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
Debug.ShouldStop(131072);
b4i_facturacion._subtotal = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._subtotal,(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))))}, "*",0, 0))}, "+",1, 0);
 BA.debugLineNum = 148;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(524288);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 149;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 150;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(2097152);
_bm = b4i_facturacion._funcion.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 152;BA.debugLine="bm.Initialize(File.DirAssets,\"packing.png\")";
Debug.ShouldStop(8388608);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("packing.png")));
 };
 BA.debugLineNum = 155;BA.debugLine="Dim cell As TableCell =  ListViewOrdenProducto";
Debug.ShouldStop(67108864);
_cell = b4i_facturacion._listviewordenproducto.runMethod(false,"AddTwoLines::",(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion")))))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Cantidad: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))),RemoteObject.createImmutable("     $"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))}, "+",1, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 157;BA.debugLine="cell.Bitmap = bm";
Debug.ShouldStop(268435456);
_cell.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 158;BA.debugLine="cell.Tag = map";
Debug.ShouldStop(536870912);
_cell.runMethod(false,"setTag:",(_map));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 161;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(tot";
Debug.ShouldStop(1);
b4i_facturacion._lblordentotalpagar.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_facturacion._total,BA.numberCast(double.class, b4i_facturacion._principal._mapempresainfo /*RemoteObject*/ .runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_envio")))))}, "+",1, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 break; }
case 1: {
 BA.debugLineNum = 164;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
Debug.ShouldStop(8);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Orden registrada."),b4i_main.__c.runMethod(true,"CRLF"),RemoteObject.createImmutable("Numero de orden: "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 165;BA.debugLine="Principal.cantidadProduto = 0";
Debug.ShouldStop(16);
b4i_facturacion._principal._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 166;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(32);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 break; }
case 2: {
 BA.debugLineNum = 171;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(1024);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 172;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 173;BA.debugLine="If Job.Tag Then";
Debug.ShouldStop(4096);
if (BA.ObjectToBoolean(_job.getField(false,"_tag" /*RemoteObject*/ )).getBoolean()) { 
 BA.debugLineNum = 174;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado.\",Fa";
Debug.ShouldStop(8192);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto eliminado.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 175;BA.debugLine="Principal.cantidadProduto = Principal.cantida";
Debug.ShouldStop(16384);
b4i_facturacion._principal._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4i_facturacion._principal._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "-",1, 1);
 }else {
 BA.debugLineNum = 177;BA.debugLine="hud.ToastMessageShow(\"Producto actualizado.\",";
Debug.ShouldStop(65536);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto actualizado.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 179;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(262144);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 180;BA.debugLine="cargarProductosTemporales";
Debug.ShouldStop(524288);
_cargarproductostemporales();
 }else {
 BA.debugLineNum = 184;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("No hay unidades suficientes de este producto. La existencia actual es de "),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_existencia")))))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 185;BA.debugLine="Return";
Debug.ShouldStop(16777216);
if (true) return RemoteObject.createImmutable("");
 };
 break; }
case 3: {
 BA.debugLineNum = 189;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(268435456);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 191;BA.debugLine="If ListViewDirecciones.IsInitialized Then";
Debug.ShouldStop(1073741824);
if (b4i_facturacion._listviewdirecciones.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 192;BA.debugLine="ListViewDirecciones.RemoveViewFromParent";
Debug.ShouldStop(-2147483648);
b4i_facturacion._listviewdirecciones.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 193;BA.debugLine="ListViewDirecciones.Initialize(\"ListViewDirecc";
Debug.ShouldStop(1);
b4i_facturacion._listviewdirecciones.runVoidMethod ("Initialize:::",b4i_facturacion.ba,(Object)(BA.ObjectToString("ListViewDirecciones")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 194;BA.debugLine="PanelListViewDirecciones.AddView(ListViewDirec";
Debug.ShouldStop(2);
b4i_facturacion._panellistviewdirecciones.runVoidMethod ("AddView:::::",(Object)(((b4i_facturacion._listviewdirecciones).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_facturacion._panellistviewdirecciones.runMethod(true,"Width")),(Object)(b4i_facturacion._panellistviewdirecciones.runMethod(true,"Height")));
 };
 BA.debugLineNum = 197;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 198;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tiene direcciones registradas")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 199;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 203;BA.debugLine="Dim dr,default=\"\" As String";
Debug.ShouldStop(1024);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_default = BA.ObjectToString("");Debug.locals.put("default", _default);Debug.locals.put("default", _default);
 BA.debugLineNum = 204;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(2048);
{
final int step73 = 1;
final int limit73 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step73 > 0 && _i <= limit73) || (step73 < 0 && _i >= limit73) ;_i = ((int)(0 + _i + step73))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 205;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(4096);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 206;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
Debug.ShouldStop(8192);
_dr = b4i_facturacion._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 207;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"Length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 208;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(32768);
_dr = RemoteObject.concat(_dr.runMethod(true,"SubString2::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 211;BA.debugLine="If map.Get(\"f_principal\") Then";
Debug.ShouldStop(262144);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal"))))).getBoolean()) { 
 BA.debugLineNum = 212;BA.debugLine="default = CRLF& \"Dirección principal\"";
Debug.ShouldStop(524288);
_default = RemoteObject.concat(b4i_main.__c.runMethod(true,"CRLF"),RemoteObject.createImmutable("Dirección principal"));Debug.locals.put("default", _default);
 };
 BA.debugLineNum = 215;BA.debugLine="Dim cell As TableCell = ListViewDirecciones.Ad";
Debug.ShouldStop(4194304);
_cell = b4i_facturacion._listviewdirecciones.runMethod(false,"AddTwoLines::",(Object)(_dr),(Object)(_default));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 216;BA.debugLine="cell.Tag = map";
Debug.ShouldStop(8388608);
_cell.runMethod(false,"setTag:",(_map));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 4: {
 BA.debugLineNum = 220;BA.debugLine="map=map.Get(\"f_data\")";
Debug.ShouldStop(134217728);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 221;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("1")))) { 
 BA.debugLineNum = 222;BA.debugLine="ListViewOrdenProducto.Clear";
Debug.ShouldStop(536870912);
b4i_facturacion._listviewordenproducto.runVoidMethod ("Clear");
 BA.debugLineNum = 223;BA.debugLine="Principal.cantidadProduto = 0";
Debug.ShouldStop(1073741824);
b4i_facturacion._principal._cantidadproduto /*RemoteObject*/  = BA.numberCast(int.class, 0);
 BA.debugLineNum = 224;BA.debugLine="hud.ToastMessageShow(\"Todos los productos fuer";
Debug.ShouldStop(-2147483648);
b4i_facturacion._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Todos los productos fueron eliminados")),(Object)(b4i_main.__c.runMethod(true,"False")));
 }else {
 BA.debugLineNum = 226;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Los productos no fueron eliminados")),(Object)(RemoteObject.createImmutable("Información")));
 };
 break; }
}
;
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("ListViewDirecciones_SelectedChanged (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,284);
if (RapidSub.canDelegate("listviewdirecciones_selectedchanged")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","listviewdirecciones_selectedchanged", _sectionindex, _cell);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 284;BA.debugLine="Sub ListViewDirecciones_SelectedChanged (SectionIn";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim map As Map = Cell.Tag";
Debug.ShouldStop(268435456);
_map = (_cell.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 286;BA.debugLine="lblDireccion.Text = funcion.base64_Decode( map.Ge";
Debug.ShouldStop(536870912);
b4i_facturacion._lbldireccion.runMethod(true,"setText:",b4i_facturacion._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion"))))))));
 BA.debugLineNum = 287;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
Debug.ShouldStop(1073741824);
b4i_facturacion._lbldireccion.runMethod(false,"setTag:",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 288;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(-2147483648);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewordenproducto_selectedchanged(RemoteObject _sectionindex,RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("ListViewOrdenProducto_SelectedChanged (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,312);
if (RapidSub.canDelegate("listviewordenproducto_selectedchanged")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","listviewordenproducto_selectedchanged", _sectionindex, _cell);}
RemoteObject _listaproductos = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _lbl = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _height = RemoteObject.createImmutable(0.0);
RemoteObject _map2 = RemoteObject.declareNull("B4IMap");
int _i = 0;
RemoteObject _ch = RemoteObject.declareNull("B4ISwitchWrapper");
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 312;BA.debugLine="Sub ListViewOrdenProducto_SelectedChanged (Section";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 314;BA.debugLine="pageOpciones.Initialize(\"pageProductoOpciones\")";
Debug.ShouldStop(33554432);
b4i_facturacion._pageopciones.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("pageProductoOpciones")));
 BA.debugLineNum = 315;BA.debugLine="pageOpciones.RootPanel.LoadLayout(\"frmProductoOpc";
Debug.ShouldStop(67108864);
b4i_facturacion._pageopciones.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmProductoOpciones")),b4i_facturacion.ba);
 BA.debugLineNum = 316;BA.debugLine="pageOpciones.RootPanel.Tag = pageOpciones.RootPan";
Debug.ShouldStop(134217728);
b4i_facturacion._pageopciones.runMethod(false,"RootPanel").runMethod(false,"setTag:",(b4i_facturacion._pageopciones.runMethod(false,"RootPanel").runMethod(true,"Top")));
 BA.debugLineNum = 318;BA.debugLine="txtCantidad.SetShadow(Colors.Gray, 0dip,0dip, 0.2";
Debug.ShouldStop(536870912);
b4i_facturacion._txtcantidad.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 319;BA.debugLine="PanelScrollViewOpciones.SetShadow(Colors.Gray, 0d";
Debug.ShouldStop(1073741824);
b4i_facturacion._panelscrollviewopciones.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 320;BA.debugLine="txtProductoComentario.SetShadow(Colors.Gray, 0dip";
Debug.ShouldStop(-2147483648);
b4i_facturacion._txtproductocomentario.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 322;BA.debugLine="Dim listaProductos As List";
Debug.ShouldStop(2);
_listaproductos = RemoteObject.createNew ("B4IList");Debug.locals.put("listaProductos", _listaproductos);
 BA.debugLineNum = 323;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(4);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 324;BA.debugLine="Main.NavControl.ShowPage(pageOpciones)";
Debug.ShouldStop(8);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_facturacion._pageopciones).getObject())));
 BA.debugLineNum = 326;BA.debugLine="Dim map As Map = Cell.Tag";
Debug.ShouldStop(32);
_map = (_cell.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 327;BA.debugLine="txtCantidad.Tag = map.Get(\"f_cantidad\")";
Debug.ShouldStop(64);
b4i_facturacion._txtcantidad.runMethod(false,"setTag:",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad")))));
 BA.debugLineNum = 328;BA.debugLine="txtCantidad.Text = txtCantidad.Tag";
Debug.ShouldStop(128);
b4i_facturacion._txtcantidad.runMethod(true,"setText:",BA.ObjectToString(b4i_facturacion._txtcantidad.runMethod(false,"Tag")));
 BA.debugLineNum = 329;BA.debugLine="stModificarCantidad.Value = txtCantidad.Tag";
Debug.ShouldStop(256);
b4i_facturacion._stmodificarcantidad.runMethod(true,"setValue:",BA.numberCast(double.class, b4i_facturacion._txtcantidad.runMethod(false,"Tag")));
 BA.debugLineNum = 331;BA.debugLine="lblOpcionesProductoNombre.Text = map.Get(\"f_descr";
Debug.ShouldStop(1024);
b4i_facturacion._lblopcionesproductonombre.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 332;BA.debugLine="txtProductoComentario.Text = funcion.base64_Decod";
Debug.ShouldStop(2048);
b4i_facturacion._txtproductocomentario.runMethod(true,"setText:",b4i_facturacion._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_comentario"))))))));
 BA.debugLineNum = 334;BA.debugLine="json.Initialize(map.Get(\"f_propiedades\"))";
Debug.ShouldStop(8192);
_json.runVoidMethod ("Initialize:",(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_propiedades")))))));
 BA.debugLineNum = 335;BA.debugLine="listaProductos = json.NextArray";
Debug.ShouldStop(16384);
_listaproductos = _json.runMethod(false,"NextArray");Debug.locals.put("listaProductos", _listaproductos);
 BA.debugLineNum = 336;BA.debugLine="ScrollViewOpciones.Panel.RemoveAllViews";
Debug.ShouldStop(32768);
b4i_facturacion._scrollviewopciones.runMethod(false,"Panel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 337;BA.debugLine="ScrollViewOpciones.ContentWidth = ScrollViewOpcio";
Debug.ShouldStop(65536);
b4i_facturacion._scrollviewopciones.runMethod(true,"setContentWidth:",BA.numberCast(int.class, b4i_facturacion._scrollviewopciones.runMethod(true,"Width")));
 BA.debugLineNum = 338;BA.debugLine="btnOpcionesProductoSalvar.Tag =Cell.Tag";
Debug.ShouldStop(131072);
b4i_facturacion._btnopcionesproductosalvar.runMethod(false,"setTag:",_cell.runMethod(false,"Tag"));
 BA.debugLineNum = 340;BA.debugLine="If listaProductos.Size = 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_listaproductos.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 341;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(1048576);
_lbl = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 342;BA.debugLine="lbl.Initialize(\"-\")";
Debug.ShouldStop(2097152);
_lbl.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("-")));
 BA.debugLineNum = 343;BA.debugLine="lbl.Text = \"No hay opciones disponibles\"";
Debug.ShouldStop(4194304);
_lbl.runMethod(true,"setText:",BA.ObjectToString("No hay opciones disponibles"));
 BA.debugLineNum = 344;BA.debugLine="lbl.TextAlignment = lbl.ALIGNMENT_CENTER";
Debug.ShouldStop(8388608);
_lbl.runMethod(true,"setTextAlignment:",_lbl.runMethod(true,"ALIGNMENT_CENTER"));
 BA.debugLineNum = 345;BA.debugLine="lbl.TextColor = Colors.Gray";
Debug.ShouldStop(16777216);
_lbl.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray"));
 BA.debugLineNum = 346;BA.debugLine="lbl.Font = Font.CreateNew(15)";
Debug.ShouldStop(33554432);
_lbl.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 347;BA.debugLine="lbl.Tag = \"label\"";
Debug.ShouldStop(67108864);
_lbl.runMethod(false,"setTag:",RemoteObject.createImmutable(("label")));
 BA.debugLineNum = 349;BA.debugLine="ScrollViewOpciones.Panel.AddView(lbl,2%x,5%y,Scr";
Debug.ShouldStop(268435456);
b4i_facturacion._scrollviewopciones.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_lbl).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 2)))),(Object)(b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 5)))),(Object)(b4i_facturacion._scrollviewopciones.runMethod(false,"Panel").runMethod(true,"Width")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 20))))));
 BA.debugLineNum = 350;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 353;BA.debugLine="Dim height As Double = 10dip";
Debug.ShouldStop(1);
_height = BA.numberCast(double.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 10))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 354;BA.debugLine="Dim map2 As Map";
Debug.ShouldStop(2);
_map2 = RemoteObject.createNew ("B4IMap");Debug.locals.put("map2", _map2);
 BA.debugLineNum = 355;BA.debugLine="For i=0 To listaProductos.Size -1";
Debug.ShouldStop(4);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {_listaproductos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 356;BA.debugLine="map2 = listaProductos.Get(i)";
Debug.ShouldStop(8);
_map2 = (_listaproductos.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map2", _map2);
 BA.debugLineNum = 357;BA.debugLine="Dim ch As Switch";
Debug.ShouldStop(16);
_ch = RemoteObject.createNew ("B4ISwitchWrapper");Debug.locals.put("ch", _ch);
 BA.debugLineNum = 358;BA.debugLine="ch.Initialize(i&\"ck\")";
Debug.ShouldStop(32);
_ch.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.concat(RemoteObject.createImmutable(_i),RemoteObject.createImmutable("ck"))));
 BA.debugLineNum = 359;BA.debugLine="ch.Tag = map2.Get(\"f_idrecord\")";
Debug.ShouldStop(64);
_ch.runMethod(false,"setTag:",_map2.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 360;BA.debugLine="ch.Value = map2.Get(\"f_agregado\")";
Debug.ShouldStop(128);
_ch.runMethod(true,"setValue:",BA.ObjectToBoolean(_map2.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_agregado"))))));
 BA.debugLineNum = 362;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(512);
_lbl = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 363;BA.debugLine="lbl.Initialize(\"-\")";
Debug.ShouldStop(1024);
_lbl.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("-")));
 BA.debugLineNum = 364;BA.debugLine="lbl.Text = map2.Get(\"f_descripcion\")";
Debug.ShouldStop(2048);
_lbl.runMethod(true,"setText:",BA.ObjectToString(_map2.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 365;BA.debugLine="lbl.TextAlignment = lbl.ALIGNMENT_LEFT";
Debug.ShouldStop(4096);
_lbl.runMethod(true,"setTextAlignment:",_lbl.runMethod(true,"ALIGNMENT_LEFT"));
 BA.debugLineNum = 366;BA.debugLine="lbl.TextColor =  Colors.Black";
Debug.ShouldStop(8192);
_lbl.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Black"));
 BA.debugLineNum = 367;BA.debugLine="lbl.Font = Font.CreateNew(15)";
Debug.ShouldStop(16384);
_lbl.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 368;BA.debugLine="lbl.Tag = \"label\"";
Debug.ShouldStop(32768);
_lbl.runMethod(false,"setTag:",RemoteObject.createImmutable(("label")));
 BA.debugLineNum = 370;BA.debugLine="ScrollViewOpciones.Panel.AddView(ch,2%x,height,1";
Debug.ShouldStop(131072);
b4i_facturacion._scrollviewopciones.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_ch).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 2)))),(Object)(BA.numberCast(float.class, _height)),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 15)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))));
 BA.debugLineNum = 371;BA.debugLine="ScrollViewOpciones.Panel.AddView(lbl,ch.Left + c";
Debug.ShouldStop(262144);
b4i_facturacion._scrollviewopciones.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_lbl).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_ch.runMethod(true,"Left"),_ch.runMethod(true,"Width")}, "+",1, 0))),(Object)(BA.numberCast(float.class, _height)),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 96)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 30))))));
 BA.debugLineNum = 372;BA.debugLine="height = height + 40dip";
Debug.ShouldStop(524288);
_height = RemoteObject.solve(new RemoteObject[] {_height,b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 40)))}, "+",1, 0);Debug.locals.put("height", _height);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 374;BA.debugLine="ScrollViewOpciones.ContentHeight = height";
Debug.ShouldStop(2097152);
b4i_facturacion._scrollviewopciones.runMethod(true,"setContentHeight:",BA.numberCast(int.class, _height));
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _pageproductoopciones_barbuttonclick(RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("pageProductoOpciones_BarButtonClick (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,253);
if (RapidSub.canDelegate("pageproductoopciones_barbuttonclick")) { b4i_facturacion.remoteMe.runUserSub(false, "facturacion","pageproductoopciones_barbuttonclick", _tag); return;}
ResumableSub_pageProductoOpciones_BarButtonClick rsub = new ResumableSub_pageProductoOpciones_BarButtonClick(null,_tag);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_pageProductoOpciones_BarButtonClick extends BA.ResumableSub {
public ResumableSub_pageProductoOpciones_BarButtonClick(b4i_facturacion parent,RemoteObject _tag) {
this.parent = parent;
this._tag = _tag;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_facturacion parent;
RemoteObject _tag;
RemoteObject _buttontext = RemoteObject.createImmutable("");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("pageProductoOpciones_BarButtonClick (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,253);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 254;BA.debugLine="Log(\"BarButtonClicked: \" & Tag)";
Debug.ShouldStop(536870912);
b4i_main.__c.runVoidMethod ("LogImpl:::","44325377",RemoteObject.concat(RemoteObject.createImmutable("BarButtonClicked: "),_tag),0);
 BA.debugLineNum = 256;BA.debugLine="Select Tag";
Debug.ShouldStop(-2147483648);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("delete"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 259;BA.debugLine="Msgbox2(\"Msg\", \"Seguro que desea eliminar este";
Debug.ShouldStop(4);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("Msg")),(Object)(BA.ObjectToString("Seguro que desea eliminar este producto?")),(Object)(BA.ObjectToString("Confirmación")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 260;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
Debug.ShouldStop(8);
b4i_main.__c.runVoidMethod ("WaitFor::::","msg_click:", b4i_facturacion.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "facturacion", "pageproductoopciones_barbuttonclick"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_buttontext = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(0));Debug.locals.put("ButtonText", _buttontext);
;
 BA.debugLineNum = 262;BA.debugLine="If ButtonText <> \"Si\" Then";
Debug.ShouldStop(32);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_buttontext,BA.ObjectToString("Si"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 263;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 266;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
Debug.ShouldStop(512);
_map = (parent._btnopcionesproductosalvar.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 267;BA.debugLine="Dim json As String";
Debug.ShouldStop(1024);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 269;BA.debugLine="json = \"'f_regresa':true\"& _ 			\",'f_idempresa'";
Debug.ShouldStop(4096);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':true"),RemoteObject.createImmutable(",'f_idempresa':"),parent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':2"),RemoteObject.createImmutable(",'f_idserver':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idserver")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 274;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(131072);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 275;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTempor";
Debug.ShouldStop(262144);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 276;BA.debugLine="JobDetalleTemporal.Tag = True";
Debug.ShouldStop(524288);
_jobdetalletemporal.setField ("_tag" /*RemoteObject*/ ,(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 277;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntove";
Debug.ShouldStop(1048576);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),parent._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(parent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 279;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
Debug.ShouldStop(4194304);
parent._btnopcionesproductosalvar.runMethod(true,"setEnabled:",b4i_main.__c.runMethod(true,"False"));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
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
public static RemoteObject  _pageproductoopciones_keyboardstatechanged(RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("pageProductoOpciones_KeyboardStateChanged (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,435);
if (RapidSub.canDelegate("pageproductoopciones_keyboardstatechanged")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","pageproductoopciones_keyboardstatechanged", _height);}
Debug.locals.put("Height", _height);
 BA.debugLineNum = 435;BA.debugLine="Sub  pageProductoOpciones_KeyboardStateChanged (He";
Debug.ShouldStop(262144);
 BA.debugLineNum = 436;BA.debugLine="funcion.KeyboardStateChanged(Height,pageOpciones,";
Debug.ShouldStop(524288);
b4i_facturacion._funcion.runVoidMethod ("_keyboardstatechanged:::" /*RemoteObject*/ ,(Object)(_height),(Object)(b4i_facturacion._pageopciones),(Object)(BA.numberCast(double.class, b4i_facturacion._pageopciones.runMethod(false,"RootPanel").runMethod(false,"Tag"))));
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("PanelDireccion_Click (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,292);
if (RapidSub.canDelegate("paneldireccion_click")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","paneldireccion_click");}
 BA.debugLineNum = 292;BA.debugLine="Sub PanelDireccion_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 295;BA.debugLine="pageDirecciones.Initialize(\"pageDireccionesModal\"";
Debug.ShouldStop(64);
b4i_facturacion._pagedirecciones.runVoidMethod ("Initialize::",b4i_facturacion.ba,(Object)(RemoteObject.createImmutable("pageDireccionesModal")));
 BA.debugLineNum = 296;BA.debugLine="pageDirecciones.RootPanel.LoadLayout(\"frmDireccio";
Debug.ShouldStop(128);
b4i_facturacion._pagedirecciones.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDireccionesModal")),b4i_facturacion.ba);
 BA.debugLineNum = 297;BA.debugLine="Main.NavControl.ShowPage(pageDirecciones)";
Debug.ShouldStop(256);
b4i_facturacion._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_facturacion._pagedirecciones).getObject())));
 BA.debugLineNum = 299;BA.debugLine="ListViewDirecciones.Initialize(\"ListViewDireccion";
Debug.ShouldStop(1024);
b4i_facturacion._listviewdirecciones.runVoidMethod ("Initialize:::",b4i_facturacion.ba,(Object)(BA.ObjectToString("ListViewDirecciones")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 300;BA.debugLine="PanelListViewDirecciones.AddView(ListViewDireccio";
Debug.ShouldStop(2048);
b4i_facturacion._panellistviewdirecciones.runVoidMethod ("AddView:::::",(Object)(((b4i_facturacion._listviewdirecciones).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_facturacion._panellistviewdirecciones.runMethod(true,"Width")),(Object)(b4i_facturacion._panellistviewdirecciones.runMethod(true,"Height")));
 BA.debugLineNum = 301;BA.debugLine="PanelListViewDirecciones.SetShadow(Colors.Gray, 0";
Debug.ShouldStop(4096);
b4i_facturacion._panellistviewdirecciones.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 302;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(8192);
_cargardirecciones();
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
b4i_facturacion._page = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 7;BA.debugLine="Private pageOpciones As Page";
b4i_facturacion._pageopciones = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 8;BA.debugLine="Private pageDirecciones As Page";
b4i_facturacion._pagedirecciones = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 10;BA.debugLine="Private btnOrdenEnviar As Button";
b4i_facturacion._btnordenenviar = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 11;BA.debugLine="Private lblDireccion As Label";
b4i_facturacion._lbldireccion = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 12;BA.debugLine="Private lblOrdenTotalPagar As Label";
b4i_facturacion._lblordentotalpagar = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 13;BA.debugLine="Private lblPrecioEnvio As Label";
b4i_facturacion._lblprecioenvio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private PanelDireccion As Panel";
b4i_facturacion._paneldireccion = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private PanelOrdenProductosDetalles As Panel";
b4i_facturacion._panelordenproductosdetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private PanelOrdenTotal As Panel";
b4i_facturacion._panelordentotal = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private ListViewOrdenProducto As TableView";
b4i_facturacion._listviewordenproducto = RemoteObject.createNew ("B4ITableView");
 //BA.debugLineNum = 19;BA.debugLine="Private tax As Double = 0";
b4i_facturacion._tax = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 20;BA.debugLine="Private subtotal As Double = 0";
b4i_facturacion._subtotal = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 21;BA.debugLine="Private total As Double = 0";
b4i_facturacion._total = BA.numberCast(double.class, 0);
 //BA.debugLineNum = 22;BA.debugLine="Private hud As HUD";
b4i_facturacion._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 26;BA.debugLine="Private btnOpcionesProductoSalvar As Button";
b4i_facturacion._btnopcionesproductosalvar = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private ScrollViewOpciones As ScrollView";
b4i_facturacion._scrollviewopciones = RemoteObject.createNew ("B4IScrollView");
 //BA.debugLineNum = 28;BA.debugLine="Private stModificarCantidad As Stepper";
b4i_facturacion._stmodificarcantidad = RemoteObject.createNew ("B4IStepperWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private txtCantidad As TextField";
b4i_facturacion._txtcantidad = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private txtProductoComentario As TextView";
b4i_facturacion._txtproductocomentario = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblOpcionesProductoNombre As Label";
b4i_facturacion._lblopcionesproductonombre = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private PanelScrollViewOpciones As Panel";
b4i_facturacion._panelscrollviewopciones = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private ListViewDirecciones As TableView";
b4i_facturacion._listviewdirecciones = RemoteObject.createNew ("B4ITableView");
 //BA.debugLineNum = 36;BA.debugLine="Private btnAbrirDireccion As Button";
b4i_facturacion._btnabrirdireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PanelListViewDirecciones As Panel";
b4i_facturacion._panellistviewdirecciones = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _productoopciones_disappear() throws Exception{
try {
		Debug.PushSubsStack("ProductoOpciones_Disappear (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,378);
if (RapidSub.canDelegate("productoopciones_disappear")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","productoopciones_disappear");}
 BA.debugLineNum = 378;BA.debugLine="Sub ProductoOpciones_Disappear";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _productoorden_barbuttonclick(RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("ProductoOrden_BarButtonClick (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,233);
if (RapidSub.canDelegate("productoorden_barbuttonclick")) { b4i_facturacion.remoteMe.runUserSub(false, "facturacion","productoorden_barbuttonclick", _tag); return;}
ResumableSub_ProductoOrden_BarButtonClick rsub = new ResumableSub_ProductoOrden_BarButtonClick(null,_tag);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ProductoOrden_BarButtonClick extends BA.ResumableSub {
public ResumableSub_ProductoOrden_BarButtonClick(b4i_facturacion parent,RemoteObject _tag) {
this.parent = parent;
this._tag = _tag;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_facturacion parent;
RemoteObject _tag;
RemoteObject _buttontext = RemoteObject.createImmutable("");
RemoteObject _jobeliminartodo = RemoteObject.declareNull("b4i_httpjob");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ProductoOrden_BarButtonClick (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,233);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 234;BA.debugLine="Log(\"BarButtonClicked: \" & Tag)";
Debug.ShouldStop(512);
b4i_main.__c.runVoidMethod ("LogImpl:::","44259841",RemoteObject.concat(RemoteObject.createImmutable("BarButtonClicked: "),_tag),0);
 BA.debugLineNum = 236;BA.debugLine="Select Tag";
Debug.ShouldStop(2048);
if (true) break;

case 1:
//select
this.state = 8;
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("delete"))) {
case 0: {
this.state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 239;BA.debugLine="Msgbox2(\"Msg\", \"Seguro que desea eliminar todos";
Debug.ShouldStop(16384);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_facturacion.ba,(Object)(BA.ObjectToString("Msg")),(Object)(BA.ObjectToString("Seguro que desea eliminar todos los productos?")),(Object)(BA.ObjectToString("Confirmación")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 240;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
Debug.ShouldStop(32768);
b4i_main.__c.runVoidMethod ("WaitFor::::","msg_click:", b4i_facturacion.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "facturacion", "productoorden_barbuttonclick"), null);
this.state = 9;
return;
case 9:
//C
this.state = 4;
_buttontext = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(0));Debug.locals.put("ButtonText", _buttontext);
;
 BA.debugLineNum = 242;BA.debugLine="If ButtonText <> \"Si\" Then";
Debug.ShouldStop(131072);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("!",_buttontext,BA.ObjectToString("Si"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 243;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 246;BA.debugLine="Dim JobEliminarTodo As HttpJob";
Debug.ShouldStop(2097152);
_jobeliminartodo = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEliminarTodo", _jobeliminartodo);
 BA.debugLineNum = 247;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me";
Debug.ShouldStop(4194304);
_jobeliminartodo.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_facturacion.ba,(Object)(BA.ObjectToString("JobEliminarTodo")),(Object)(b4i_facturacion.getObject()));
 BA.debugLineNum = 248;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa";
Debug.ShouldStop(8388608);
_jobeliminartodo.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_eliminar_detalle_usuarios"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),parent._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(parent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),parent._principal._idempresa /*RemoteObject*/ ))))));
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
public static RemoteObject  _stmodificarcantidad_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("stModificarCantidad_ValueChanged (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,439);
if (RapidSub.canDelegate("stmodificarcantidad_valuechanged")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","stmodificarcantidad_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 439;BA.debugLine="Sub stModificarCantidad_ValueChanged (Value As Dou";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 440;BA.debugLine="txtCantidad.Text = Value";
Debug.ShouldStop(8388608);
b4i_facturacion._txtcantidad.runMethod(true,"setText:",BA.NumberToString(_value));
 BA.debugLineNum = 441;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtproductocomentario_textchanged(RemoteObject _oldtext,RemoteObject _newtext) throws Exception{
try {
		Debug.PushSubsStack("txtProductoComentario_TextChanged (facturacion) ","facturacion",3,b4i_facturacion.ba,b4i_facturacion.mostCurrent,429);
if (RapidSub.canDelegate("txtproductocomentario_textchanged")) { return b4i_facturacion.remoteMe.runUserSub(false, "facturacion","txtproductocomentario_textchanged", _oldtext, _newtext);}
Debug.locals.put("OldText", _oldtext);
Debug.locals.put("NewText", _newtext);
 BA.debugLineNum = 429;BA.debugLine="Sub txtProductoComentario_TextChanged (OldText As";
Debug.ShouldStop(4096);
 BA.debugLineNum = 430;BA.debugLine="If NewText.Contains(CRLF) Then";
Debug.ShouldStop(8192);
if (_newtext.runMethod(true,"Contains:",(Object)(b4i_main.__c.runMethod(true,"CRLF"))).getBoolean()) { 
 BA.debugLineNum = 431;BA.debugLine="pageOpciones.resignfocus";
Debug.ShouldStop(16384);
b4i_facturacion._pageopciones.runVoidMethod ("ResignFocus");
 };
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}