package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_principal_subs_0 {


public static RemoteObject  _btnbuscarproducto_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscarProducto_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,404);
if (RapidSub.canDelegate("btnbuscarproducto_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btnbuscarproducto_click");}
 BA.debugLineNum = 404;BA.debugLine="Sub btnBuscarProducto_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 406;BA.debugLine="PanelModalProducto.Left = 0";
Debug.ShouldStop(2097152);
b4i_principal._panelmodalproducto.runMethod(true,"setLeft:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 407;BA.debugLine="PanelModalProducto.SetAlphaAnimated(300,1)";
Debug.ShouldStop(4194304);
b4i_principal._panelmodalproducto.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 410;BA.debugLine="ListProductosModalView.Initialize(\"ListProductosM";
Debug.ShouldStop(33554432);
b4i_principal._listproductosmodalview.runVoidMethod ("Initialize:::",b4i_principal.ba,(Object)(BA.ObjectToString("ListProductosModalView")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 411;BA.debugLine="PanelProductosModalView.AddView(ListProductosModa";
Debug.ShouldStop(67108864);
b4i_principal._panelproductosmodalview.runVoidMethod ("AddView:::::",(Object)(((b4i_principal._listproductosmodalview).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_principal._panelproductosmodalview.runMethod(true,"Width")),(Object)(b4i_principal._panelproductosmodalview.runMethod(true,"Height")));
 BA.debugLineNum = 412;BA.debugLine="ListProductosModalView.AddTwoLines(\"\",\"\")";
Debug.ShouldStop(134217728);
b4i_principal._listproductosmodalview.runVoidMethod ("AddTwoLines::",(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 414;BA.debugLine="txtBuscarProducto.RequestFocus";
Debug.ShouldStop(536870912);
b4i_principal._txtbuscarproducto.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 415;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btninfocerrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnInfoCerrar_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,397);
if (RapidSub.canDelegate("btninfocerrar_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btninfocerrar_click");}
 BA.debugLineNum = 397;BA.debugLine="Sub btnInfoCerrar_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 398;BA.debugLine="Main.NavControl.RemoveCurrentPage2(True)";
Debug.ShouldStop(8192);
b4i_principal._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage2:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 399;BA.debugLine="Main.NavControl.SetNavigationBarVisibleAnimated(T";
Debug.ShouldStop(16384);
b4i_principal._main._navcontrol /*RemoteObject*/ .runVoidMethod ("SetNavigationBarVisibleAnimated:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 400;BA.debugLine="Main.NavControl.ToolBarVisible = True";
Debug.ShouldStop(32768);
b4i_principal._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 401;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmasvendido_click() throws Exception{
try {
		Debug.PushSubsStack("btnMasVendido_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,211);
if (RapidSub.canDelegate("btnmasvendido_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btnmasvendido_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductomasvendido = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 211;BA.debugLine="Sub btnMasVendido_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 213;BA.debugLine="If btnMasVendido.Tag Then";
Debug.ShouldStop(1048576);
if (BA.ObjectToBoolean(b4i_principal._btnmasvendido.runMethod(false,"Tag")).getBoolean()) { 
 BA.debugLineNum = 214;BA.debugLine="cargarCaterorias";
Debug.ShouldStop(2097152);
_cargarcaterorias();
 }else {
 BA.debugLineNum = 216;BA.debugLine="Dim json As String";
Debug.ShouldStop(8388608);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 217;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
Debug.ShouldStop(16777216);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_principal._idempresa);Debug.locals.put("json", _json);
 BA.debugLineNum = 218;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
Debug.ShouldStop(33554432);
_jobproductomasvendido = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobProductoMasVendido", _jobproductomasvendido);
 BA.debugLineNum = 219;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMas";
Debug.ShouldStop(67108864);
_jobproductomasvendido.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_principal.ba,(Object)(BA.ObjectToString("JobProductoMasVendido")),(Object)(b4i_principal.getObject()));
 BA.debugLineNum = 220;BA.debugLine="JobProductoMasVendido.PostString(Main.url&\"ws/ge";
Debug.ShouldStop(134217728);
_jobproductomasvendido.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_principal._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_main_page"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_principal._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_principal._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 };
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnproductobuscarmodal_click() throws Exception{
try {
		Debug.PushSubsStack("btnProductoBuscarModal_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,422);
if (RapidSub.canDelegate("btnproductobuscarmodal_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btnproductobuscarmodal_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscarproducto = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 422;BA.debugLine="Sub btnProductoBuscarModal_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 424;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",b4i_principal._txtbuscarproducto.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 425;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Escriba el nombre del producto")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 426;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 429;BA.debugLine="Dim json As String";
Debug.ShouldStop(4096);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 430;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
Debug.ShouldStop(8192);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_principal._idempresa,RemoteObject.createImmutable(",'f_parametro':'"),b4i_principal._txtbuscarproducto.runMethod(true,"Text").runMethod(true,"Replace::",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"Replace::",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 432;BA.debugLine="Dim JobBuscarProducto As HttpJob";
Debug.ShouldStop(32768);
_jobbuscarproducto = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscarProducto", _jobbuscarproducto);
 BA.debugLineNum = 433;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
Debug.ShouldStop(65536);
_jobbuscarproducto.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_principal.ba,(Object)(BA.ObjectToString("JobBuscarProducto")),(Object)(b4i_principal.getObject()));
 BA.debugLineNum = 434;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
Debug.ShouldStop(131072);
_jobbuscarproducto.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_principal._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_paramentros"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_principal._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_principal._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 435;BA.debugLine="hud.ProgressDialogShow(\"Buscando producto...\")";
Debug.ShouldStop(262144);
b4i_principal._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Buscando producto...")));
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
public static RemoteObject  _btnproductovolver_click() throws Exception{
try {
		Debug.PushSubsStack("btnProductoVolver_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,417);
if (RapidSub.canDelegate("btnproductovolver_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btnproductovolver_click");}
 BA.debugLineNum = 417;BA.debugLine="Sub btnProductoVolver_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 418;BA.debugLine="PanelModalProducto.SetAlphaAnimated(300,0)";
Debug.ShouldStop(2);
b4i_principal._panelmodalproducto.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnviewcategoria_click() throws Exception{
try {
		Debug.PushSubsStack("btnViewCategoria_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,341);
if (RapidSub.canDelegate("btnviewcategoria_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btnviewcategoria_click");}
RemoteObject _b = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductobycategoria = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 341;BA.debugLine="Sub btnViewCategoria_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 343;BA.debugLine="Dim b As Button";
Debug.ShouldStop(4194304);
_b = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 344;BA.debugLine="b = Sender";
Debug.ShouldStop(8388608);
_b.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_principal.ba));
 BA.debugLineNum = 345;BA.debugLine="Dim map As Map = b.Tag";
Debug.ShouldStop(16777216);
_map = (_b.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 346;BA.debugLine="Dim json As String = \"'f_idempresa':\"&idEmpresa&\"";
Debug.ShouldStop(33554432);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_principal._idempresa,RemoteObject.createImmutable(",'f_idcategoria':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 348;BA.debugLine="Dim JobProductoByCategoria As HttpJob";
Debug.ShouldStop(134217728);
_jobproductobycategoria = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobProductoByCategoria", _jobproductobycategoria);
 BA.debugLineNum = 349;BA.debugLine="JobProductoByCategoria.Initialize(\"JobProductoByC";
Debug.ShouldStop(268435456);
_jobproductobycategoria.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_principal.ba,(Object)(BA.ObjectToString("JobProductoByCategoria")),(Object)(b4i_principal.getObject()));
 BA.debugLineNum = 350;BA.debugLine="JobProductoByCategoria.PostString(Main.url&\"ws/ge";
Debug.ShouldStop(536870912);
_jobproductobycategoria.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_principal._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_categoria"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_principal._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_principal._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
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
public static RemoteObject  _btnviewproducto_click() throws Exception{
try {
		Debug.PushSubsStack("btnViewProducto_Click (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,355);
if (RapidSub.canDelegate("btnviewproducto_click")) { return b4i_principal.remoteMe.runUserSub(false, "principal","btnviewproducto_click");}
RemoteObject _b = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _map = RemoteObject.declareNull("B4IMap");
 BA.debugLineNum = 355;BA.debugLine="Sub btnViewProducto_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 357;BA.debugLine="If mapEmpresaInfo.IsInitialized And mapEmpresaInf";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean(".",b4i_principal._mapempresainfo.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_laborando")))),(b4i_main.__c.runMethod(true,"False")))) { 
 BA.debugLineNum = 358;BA.debugLine="Msgbox(\"No estamos laborando en estos momentos.";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 359;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 362;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(512);
_b = RemoteObject.createNew ("B4IButtonWrapper");
_b.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_principal.ba));Debug.locals.put("b", _b);
 BA.debugLineNum = 363;BA.debugLine="Dim map As Map = b.Tag";
Debug.ShouldStop(1024);
_map = (_b.runMethod(false,"Tag"));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 364;BA.debugLine="salvar_detalle_temporal(map)";
Debug.ShouldStop(2048);
_salvar_detalle_temporal(_map);
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarcaterorias() throws Exception{
try {
		Debug.PushSubsStack("cargarCaterorias (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,152);
if (RapidSub.canDelegate("cargarcaterorias")) { return b4i_principal.remoteMe.runUserSub(false, "principal","cargarcaterorias");}
RemoteObject _jobcategoria = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 152;BA.debugLine="Sub cargarCaterorias";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="hud.ProgressDialogShow(\"Cargando categorias\")";
Debug.ShouldStop(16777216);
b4i_principal._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Cargando categorias")));
 BA.debugLineNum = 154;BA.debugLine="Dim JobCategoria As HttpJob";
Debug.ShouldStop(33554432);
_jobcategoria = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobCategoria", _jobcategoria);
 BA.debugLineNum = 155;BA.debugLine="JobCategoria.Initialize(\"JobCategoria\",Me)";
Debug.ShouldStop(67108864);
_jobcategoria.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_principal.ba,(Object)(BA.ObjectToString("JobCategoria")),(Object)(b4i_principal.getObject()));
 BA.debugLineNum = 156;BA.debugLine="JobCategoria.PostString(Main.url&\"ws/get_categori";
Debug.ShouldStop(134217728);
_jobcategoria.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_principal._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_categorias_by_empresa/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_principal._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_principal._main._tokenpublico /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_principal._idempresa))))));
 BA.debugLineNum = 157;BA.debugLine="btnMasVendido.Text = \"Ver ofertas \"";
Debug.ShouldStop(268435456);
b4i_principal._btnmasvendido.runMethod(true,"setText:",BA.ObjectToString("Ver ofertas "));
 BA.debugLineNum = 158;BA.debugLine="btnMasVendido.Tag = False";
Debug.ShouldStop(536870912);
b4i_principal._btnmasvendido.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarviewproductos(RemoteObject _list,RemoteObject _categorias) throws Exception{
try {
		Debug.PushSubsStack("cargarViewProductos (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,163);
if (RapidSub.canDelegate("cargarviewproductos")) { return b4i_principal.remoteMe.runUserSub(false, "principal","cargarviewproductos", _list, _categorias);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _panelheight = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _left = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _btn = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("list", _list);
Debug.locals.put("categorias", _categorias);
 BA.debugLineNum = 163;BA.debugLine="Sub cargarViewProductos(list As List, categorias A";
Debug.ShouldStop(4);
 BA.debugLineNum = 165;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 166;BA.debugLine="Dim panelHeight As Int = 7dip";
Debug.ShouldStop(32);
_panelheight = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 7)));Debug.locals.put("panelHeight", _panelheight);Debug.locals.put("panelHeight", _panelheight);
 BA.debugLineNum = 167;BA.debugLine="Dim height As Int = ViewCategoria.Height  * 0.25";
Debug.ShouldStop(64);
_height = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_principal._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.25)}, "*",0, 0));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 168;BA.debugLine="Dim left As Int = ViewCategoria.Height  * 0.02";
Debug.ShouldStop(128);
_left = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_principal._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.02)}, "*",0, 0));Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 170;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
Debug.ShouldStop(512);
b4i_principal._viewcategoria.runMethod(false,"Panel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 172;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(2048);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(4096);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 174;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(8192);
_btn = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 175;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(16384);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 177;BA.debugLine="If categorias Then";
Debug.ShouldStop(65536);
if (_categorias.getBoolean()) { 
 BA.debugLineNum = 178;BA.debugLine="btn.InitializeCustom(\"btnViewCategoria\", Colors";
Debug.ShouldStop(131072);
_btn.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnViewCategoria")),b4i_principal.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White")),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Red")));
 BA.debugLineNum = 179;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fot";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 180;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(524288);
_bm = b4i_principal._funcion.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 182;BA.debugLine="bm.Initialize(File.DirAssets,\"cook-food.jpeg\")";
Debug.ShouldStop(2097152);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("cook-food.jpeg")));
 };
 BA.debugLineNum = 184;BA.debugLine="btn.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(8388608);
_btn.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 185;BA.debugLine="btn.CustomLabel.Font = Font.CreateNew(20)";
Debug.ShouldStop(16777216);
_btn.runMethod(false,"CustomLabel").runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 20))));
 }else {
 BA.debugLineNum = 188;BA.debugLine="btn.InitializeCustom(\"btnViewProducto\", Colors.";
Debug.ShouldStop(134217728);
_btn.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnViewProducto")),b4i_principal.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White")),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Red")));
 BA.debugLineNum = 189;BA.debugLine="bm.Initialize(File.DirAssets,\"pexels-photo.jpeg";
Debug.ShouldStop(268435456);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("pexels-photo.jpeg")));
 BA.debugLineNum = 190;BA.debugLine="btn.Text = map.Get(\"f_descripcion\") &CRLF&CRLF&";
Debug.ShouldStop(536870912);
_btn.runMethod(true,"setText:",RemoteObject.concat(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion")))),b4i_main.__c.runMethod(true,"CRLF"),b4i_main.__c.runMethod(true,"CRLF"),RemoteObject.createImmutable("RD$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 191;BA.debugLine="btn.CustomLabel.Font = Font.CreateNew(15)";
Debug.ShouldStop(1073741824);
_btn.runMethod(false,"CustomLabel").runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 };
 BA.debugLineNum = 194;BA.debugLine="funcion.SetBackgroundImage(btn,bm,0)";
Debug.ShouldStop(2);
b4i_principal._funcion.runVoidMethod ("_setbackgroundimage:::" /*RemoteObject*/ ,(Object)(_btn),(Object)(_bm),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 195;BA.debugLine="btn.Color = Colors.Red";
Debug.ShouldStop(4);
_btn.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Red"));
 BA.debugLineNum = 196;BA.debugLine="btn.CustomLabel.TextColor = Colors.White";
Debug.ShouldStop(8);
_btn.runMethod(false,"CustomLabel").runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 197;BA.debugLine="btn.CustomLabel.Multiline = True";
Debug.ShouldStop(16);
_btn.runMethod(false,"CustomLabel").runMethod(true,"setMultiline:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 198;BA.debugLine="btn.CustomLabel.TextAlignment = btn.CustomLabel.";
Debug.ShouldStop(32);
_btn.runMethod(false,"CustomLabel").runMethod(true,"setTextAlignment:",_btn.runMethod(false,"CustomLabel").runMethod(true,"ALIGNMENT_CENTER"));
 BA.debugLineNum = 199;BA.debugLine="btn.Tag = map";
Debug.ShouldStop(64);
_btn.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 200;BA.debugLine="btn.Alpha = 0";
Debug.ShouldStop(128);
_btn.runMethod(true,"setAlpha:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 201;BA.debugLine="btn.SetAlphaAnimated(500,1)";
Debug.ShouldStop(256);
_btn.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 203;BA.debugLine="ViewCategoria.Panel.AddView(btn, left , panelHei";
Debug.ShouldStop(1024);
b4i_principal._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_btn).getObject())),(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, _panelheight)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_principal._viewcategoria.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 204;BA.debugLine="panelHeight = height + panelHeight + ViewCategor";
Debug.ShouldStop(2048);
_panelheight = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,_panelheight,b4i_principal._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.02)}, "++*",2, 0));Debug.locals.put("panelHeight", _panelheight);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 207;BA.debugLine="ViewCategoria.ContentHeight = panelHeight";
Debug.ShouldStop(16384);
b4i_principal._viewcategoria.runMethod(true,"setContentHeight:",_panelheight);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,43);
if (RapidSub.canDelegate("initialize")) { b4i_principal.remoteMe.runUserSub(false, "principal","initialize"); return;}
ResumableSub_Initialize rsub = new ResumableSub_Initialize(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Initialize extends BA.ResumableSub {
public ResumableSub_Initialize(b4i_principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_principal parent;
RemoteObject _jobempresainfo = RemoteObject.declareNull("b4i_httpjob");
RemoteObject _buttontext = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Initialize (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,43);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 45;BA.debugLine="page.Initialize(\"PagePrincipal\")";
Debug.ShouldStop(4096);
parent._page.runVoidMethod ("Initialize::",b4i_principal.ba,(Object)(RemoteObject.createImmutable("PagePrincipal")));
 BA.debugLineNum = 46;BA.debugLine="page.RootPanel.LoadLayout(\"frmPrincipal\")";
Debug.ShouldStop(8192);
parent._page.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPrincipal")),b4i_principal.ba);
 BA.debugLineNum = 48;BA.debugLine="Main.NavControl.ShowPage2(page,False )";
Debug.ShouldStop(32768);
parent._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((parent._page).getObject())),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 49;BA.debugLine="Main.NavControl.SetNavigationBarVisibleAnimated(T";
Debug.ShouldStop(65536);
parent._main._navcontrol /*RemoteObject*/ .runVoidMethod ("SetNavigationBarVisibleAnimated:",(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 50;BA.debugLine="Main.NavControl.ToolBarVisible = True";
Debug.ShouldStop(131072);
parent._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 52;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
Debug.ShouldStop(524288);
_jobempresainfo = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEmpresaInfo", _jobempresainfo);
 BA.debugLineNum = 53;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
Debug.ShouldStop(1048576);
_jobempresainfo.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_principal.ba,(Object)(BA.ObjectToString("JobEmpresaInfo")),(Object)(b4i_principal.getObject()));
 BA.debugLineNum = 54;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos_";
Debug.ShouldStop(2097152);
_jobempresainfo.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(parent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_datos_preferencia"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),parent._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(parent._main._tokenpublico /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),parent._idempresa))))));
 BA.debugLineNum = 56;BA.debugLine="btnMasVendido.Tag = False";
Debug.ShouldStop(8388608);
parent._btnmasvendido.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 57;BA.debugLine="btnBuscarProducto.SetShadow(Colors.Gray, 0dip,2di";
Debug.ShouldStop(16777216);
parent._btnbuscarproducto.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 58;BA.debugLine="btnMasVendido.SetShadow(Colors.Gray, 0dip,2dip, 1";
Debug.ShouldStop(33554432);
parent._btnmasvendido.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 59;BA.debugLine="PanelCategoria.SetShadow(Colors.Gray, 0,0, 1, Fal";
Debug.ShouldStop(67108864);
parent._panelcategoria.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 61;BA.debugLine="ViewCategoria.ContentWidth = ViewCategoria.Width";
Debug.ShouldStop(268435456);
parent._viewcategoria.runMethod(true,"setContentWidth:",BA.numberCast(int.class, parent._viewcategoria.runMethod(true,"Width")));
 BA.debugLineNum = 62;BA.debugLine="ViewCategoria.ContentHeight = ViewCategoria.Heigh";
Debug.ShouldStop(536870912);
parent._viewcategoria.runMethod(true,"setContentHeight:",BA.numberCast(int.class, parent._viewcategoria.runMethod(true,"Height")));
 BA.debugLineNum = 63;BA.debugLine="PanelModalProducto.Alpha = 0";
Debug.ShouldStop(1073741824);
parent._panelmodalproducto.runMethod(true,"setAlpha:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 64;BA.debugLine="btnMasVendido_Click";
Debug.ShouldStop(-2147483648);
_btnmasvendido_click();
 BA.debugLineNum = 73;BA.debugLine="Sleep(2000)";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethod ("Sleep:::",b4i_principal.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "initialize"),BA.numberCast(int.class, 2000));
this.state = 9;
return;
case 9:
//C
this.state = 1;
;
 BA.debugLineNum = 74;BA.debugLine="If Main.isLoggedIn = False Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 8;
if (RemoteObject.solveBoolean("=",parent._main._isloggedin /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 75;BA.debugLine="Msgbox2(\"Msg\", \"Desea iniciar sesión y asi poder";
Debug.ShouldStop(1024);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_principal.ba,(Object)(BA.ObjectToString("Msg")),(Object)(BA.ObjectToString("Desea iniciar sesión y asi poder registrar ordenes?")),(Object)(BA.ObjectToString("Información")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Iniciar Sesion")),(RemoteObject.createImmutable("Mas tarde"))}))));
 BA.debugLineNum = 76;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
Debug.ShouldStop(2048);
b4i_main.__c.runVoidMethod ("WaitFor::::","msg_click:", b4i_principal.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "initialize"), null);
this.state = 10;
return;
case 10:
//C
this.state = 4;
_buttontext = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(0));Debug.locals.put("ButtonText", _buttontext);
;
 BA.debugLineNum = 77;BA.debugLine="If ButtonText = \"Iniciar Sesion\" Then";
Debug.ShouldStop(4096);
if (true) break;

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Iniciar Sesion"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 78;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(8192);
parent._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 80;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return ;
 if (true) break;

case 8:
//C
this.state = -1;
;
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,226);
if (RapidSub.canDelegate("jobdone")) { return b4i_principal.remoteMe.runUserSub(false, "principal","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _cell = RemoteObject.declareNull("B4ITableCell");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 226;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(2);
 BA.debugLineNum = 231;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(64);
b4i_principal._hud.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 233;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 234;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(512);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_principal._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_principal._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 235;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 238;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4i_principal._funcion.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 239;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 242;BA.debugLine="Dim map As Map";
Debug.ShouldStop(131072);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 243;BA.debugLine="Dim list As List";
Debug.ShouldStop(262144);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 244;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(524288);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 245;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(1048576);
_json.runVoidMethod ("Initialize:",(Object)(b4i_principal._funcion.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 246;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(2097152);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 249;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobEmpresaInfo"),BA.ObjectToString("JobCategoria"),BA.ObjectToString("JobProductoByCategoria"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobProductoMasVendido"),BA.ObjectToString("JobBuscarProducto"))) {
case 0: {
 BA.debugLineNum = 253;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(268435456);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 254;BA.debugLine="mapEmpresaInfo = list.Get(0)";
Debug.ShouldStop(536870912);
b4i_principal._mapempresainfo = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 256;BA.debugLine="page.Title =  mapEmpresaInfo.Get(\"f_nombre\")";
Debug.ShouldStop(-2147483648);
b4i_principal._page.runMethod(true,"setTitle:",BA.ObjectToString(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 257;BA.debugLine="btnAbierto.Enabled = mapEmpresaInfo.Get(\"f_labo";
Debug.ShouldStop(1);
b4i_principal._btnabierto.runMethod(true,"setEnabled:",BA.ObjectToBoolean(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_laborando"))))));
 BA.debugLineNum = 258;BA.debugLine="lblLema.Text = mapEmpresaInfo.Get(\"f_lema\")";
Debug.ShouldStop(2);
b4i_principal._lbllema.runMethod(true,"setText:",BA.ObjectToString(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_lema"))))));
 BA.debugLineNum = 260;BA.debugLine="If btnAbierto.Enabled Then";
Debug.ShouldStop(8);
if (b4i_principal._btnabierto.runMethod(true,"Enabled").getBoolean()) { 
 BA.debugLineNum = 261;BA.debugLine="btnAbierto.Text = \"Abierto\"";
Debug.ShouldStop(16);
b4i_principal._btnabierto.runMethod(true,"setText:",BA.ObjectToString("Abierto"));
 BA.debugLineNum = 262;BA.debugLine="btnAbierto.CustomLabel.TextColor = Colors.RGB(";
Debug.ShouldStop(32);
b4i_principal._btnabierto.runMethod(false,"CustomLabel").runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 263;BA.debugLine="btnAbierto.SetBorder(1, Colors.RGB(12,166,0),1";
Debug.ShouldStop(64);
b4i_principal._btnabierto.runVoidMethod ("SetBorder:::",(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 0)))),(Object)(BA.numberCast(float.class, 13)));
 }else {
 BA.debugLineNum = 265;BA.debugLine="btnAbierto.Text = \"Cerrado\"";
Debug.ShouldStop(256);
b4i_principal._btnabierto.runMethod(true,"setText:",BA.ObjectToString("Cerrado"));
 BA.debugLineNum = 266;BA.debugLine="btnAbierto.SetBorder(1, Colors.RGB(192,13,13),";
Debug.ShouldStop(512);
b4i_principal._btnabierto.runVoidMethod ("SetBorder:::",(Object)(BA.numberCast(float.class, 1)),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 13)),(Object)(BA.numberCast(int.class, 13)))),(Object)(BA.numberCast(float.class, 15)));
 BA.debugLineNum = 267;BA.debugLine="btnAbierto.CustomLabel.TextColor = Colors.RGB(";
Debug.ShouldStop(1024);
b4i_principal._btnabierto.runMethod(false,"CustomLabel").runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 13)),(Object)(BA.numberCast(int.class, 13))));
 };
 break; }
case 1: {
 BA.debugLineNum = 271;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(16384);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 272;BA.debugLine="lblCategoria.Text = list.Size & \" Categotias\"";
Debug.ShouldStop(32768);
b4i_principal._lblcategoria.runMethod(true,"setText:",RemoteObject.concat(_list.runMethod(true,"Size"),RemoteObject.createImmutable(" Categotias")));
 BA.debugLineNum = 273;BA.debugLine="cargarViewProductos(list, True)";
Debug.ShouldStop(65536);
_cargarviewproductos(_list,b4i_main.__c.runMethod(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 276;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(524288);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 277;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 278;BA.debugLine="Msgbox(\"Esta categoria no tiene productos.\",\"I";
Debug.ShouldStop(2097152);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Esta categoria no tiene productos.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 279;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 282;BA.debugLine="lblCategoria.Alpha = 0";
Debug.ShouldStop(33554432);
b4i_principal._lblcategoria.runMethod(true,"setAlpha:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 283;BA.debugLine="lblCategoria. SetAlphaAnimated(300, 1)";
Debug.ShouldStop(67108864);
b4i_principal._lblcategoria.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 284;BA.debugLine="lblCategoria.Text =  list.Size & \" Productos\"";
Debug.ShouldStop(134217728);
b4i_principal._lblcategoria.runMethod(true,"setText:",RemoteObject.concat(_list.runMethod(true,"Size"),RemoteObject.createImmutable(" Productos")));
 BA.debugLineNum = 285;BA.debugLine="ViewCategoria.Tag = list";
Debug.ShouldStop(268435456);
b4i_principal._viewcategoria.runMethod(false,"setTag:",((_list).getObject()));
 BA.debugLineNum = 286;BA.debugLine="cargarViewProductos(list, False)";
Debug.ShouldStop(536870912);
_cargarviewproductos(_list,b4i_main.__c.runMethod(true,"False"));
 break; }
case 3: {
 BA.debugLineNum = 289;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(1);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 290;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 291;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(4);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),b4i_main.__c.runMethod(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 292;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 294;BA.debugLine="cantidadProduto = cantidadProduto + 1";
Debug.ShouldStop(32);
b4i_principal._cantidadproduto = RemoteObject.solve(new RemoteObject[] {b4i_principal._cantidadproduto,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 297;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
Debug.ShouldStop(256);
b4i_principal._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto agregado al carrito.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 break; }
case 4: {
 BA.debugLineNum = 300;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(2048);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 301;BA.debugLine="lblCategoria.Text = list.Size & \" Productos en";
Debug.ShouldStop(4096);
b4i_principal._lblcategoria.runMethod(true,"setText:",RemoteObject.concat(_list.runMethod(true,"Size"),RemoteObject.createImmutable(" Productos en oferta")));
 BA.debugLineNum = 302;BA.debugLine="cargarViewProductos(list,False)";
Debug.ShouldStop(8192);
_cargarviewproductos(_list,b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 303;BA.debugLine="btnMasVendido.Text = \"Ver cartegorias  \"";
Debug.ShouldStop(16384);
b4i_principal._btnmasvendido.runMethod(true,"setText:",BA.ObjectToString("Ver cartegorias  "));
 BA.debugLineNum = 304;BA.debugLine="btnMasVendido.Tag = True";
Debug.ShouldStop(32768);
b4i_principal._btnmasvendido.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"True")));
 break; }
case 5: {
 BA.debugLineNum = 308;BA.debugLine="If ListProductosModalView.IsInitialized Then";
Debug.ShouldStop(524288);
if (b4i_principal._listproductosmodalview.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 309;BA.debugLine="ListProductosModalView.RemoveViewFromParent";
Debug.ShouldStop(1048576);
b4i_principal._listproductosmodalview.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 310;BA.debugLine="ListProductosModalView.Initialize(\"ListProduct";
Debug.ShouldStop(2097152);
b4i_principal._listproductosmodalview.runVoidMethod ("Initialize:::",b4i_principal.ba,(Object)(BA.ObjectToString("ListProductosModalView")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 311;BA.debugLine="PanelProductosModalView.AddView(ListProductosM";
Debug.ShouldStop(4194304);
b4i_principal._panelproductosmodalview.runVoidMethod ("AddView:::::",(Object)(((b4i_principal._listproductosmodalview).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_principal._panelproductosmodalview.runMethod(true,"Width")),(Object)(b4i_principal._panelproductosmodalview.runMethod(true,"Height")));
 };
 BA.debugLineNum = 314;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(33554432);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 315;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 316;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No se ha encontrado productos con esta referencia")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 317;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 320;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(-2147483648);
{
final int step70 = 1;
final int limit70 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step70 > 0 && _i <= limit70) || (step70 < 0 && _i >= limit70) ;_i = ((int)(0 + _i + step70))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 321;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(1);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 322;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(2);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 323;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 324;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(8);
_bm = b4i_principal._funcion.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 326;BA.debugLine="bm.Initialize(File.DirAssets,\"packing.png\")";
Debug.ShouldStop(32);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("packing.png")));
 };
 BA.debugLineNum = 329;BA.debugLine="Dim cell As TableCell  = ListProductosModalVie";
Debug.ShouldStop(256);
_cell = b4i_principal._listproductosmodalview.runMethod(false,"AddTwoLines::",(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion")))))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("Precio: "),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 330;BA.debugLine="cell.Bitmap = bm";
Debug.ShouldStop(512);
_cell.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 331;BA.debugLine="cell.Tag = map";
Debug.ShouldStop(1024);
_cell.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 333;BA.debugLine="cell.ShowSelection = True";
Debug.ShouldStop(4096);
_cell.runMethod(true,"setShowSelection:",b4i_main.__c.runMethod(true,"True"));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listproductosmodalview_selectedchanged(RemoteObject _sectionindex,RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("ListProductosModalView_SelectedChanged (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,440);
if (RapidSub.canDelegate("listproductosmodalview_selectedchanged")) { return b4i_principal.remoteMe.runUserSub(false, "principal","listproductosmodalview_selectedchanged", _sectionindex, _cell);}
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 440;BA.debugLine="Sub ListProductosModalView_SelectedChanged (Sectio";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 442;BA.debugLine="If Cell.Tag = Null Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("n",_cell.runMethod(false,"Tag"))) { 
 BA.debugLineNum = 443;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 446;BA.debugLine="If Main.isLoggedIn = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",b4i_principal._main._isloggedin /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 447;BA.debugLine="loginUser";
Debug.ShouldStop(1073741824);
_loginuser();
 BA.debugLineNum = 448;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 451;BA.debugLine="salvar_detalle_temporal(Cell.Tag)";
Debug.ShouldStop(4);
_salvar_detalle_temporal((_cell.runMethod(false,"Tag")));
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _loginuser() throws Exception{
try {
		Debug.PushSubsStack("loginUser (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,455);
if (RapidSub.canDelegate("loginuser")) { b4i_principal.remoteMe.runUserSub(false, "principal","loginuser"); return;}
ResumableSub_loginUser rsub = new ResumableSub_loginUser(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_loginUser extends BA.ResumableSub {
public ResumableSub_loginUser(b4i_principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_principal parent;
RemoteObject _buttontext = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("loginUser (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,455);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 457;BA.debugLine="Msgbox2(\"Msg\", \"Debe iniciar sesión para realizar";
Debug.ShouldStop(256);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_principal.ba,(Object)(BA.ObjectToString("Msg")),(Object)(BA.ObjectToString("Debe iniciar sesión para realizar esta acción")),(Object)(BA.ObjectToString("Información")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Iniciar Sesion")),(RemoteObject.createImmutable("Volver"))}))));
 BA.debugLineNum = 458;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
Debug.ShouldStop(512);
b4i_main.__c.runVoidMethod ("WaitFor::::","msg_click:", b4i_principal.ba, anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "loginuser"), null);
this.state = 5;
return;
case 5:
//C
this.state = 1;
_buttontext = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(0));Debug.locals.put("ButtonText", _buttontext);
;
 BA.debugLineNum = 459;BA.debugLine="If ButtonText = \"Iniciar Sesion\" Then";
Debug.ShouldStop(1024);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Iniciar Sesion"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 460;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(2048);
parent._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
public static RemoteObject  _pageprincipal_appear() throws Exception{
try {
		Debug.PushSubsStack("PagePrincipal_Appear (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,138);
if (RapidSub.canDelegate("pageprincipal_appear")) { return b4i_principal.remoteMe.runUserSub(false, "principal","pageprincipal_appear");}
 BA.debugLineNum = 138;BA.debugLine="Sub PagePrincipal_Appear";
Debug.ShouldStop(512);
 BA.debugLineNum = 139;BA.debugLine="Main.NavControl.ToolBarVisible = True";
Debug.ShouldStop(1024);
b4i_principal._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pageprincipal_barbuttonclick(RemoteObject _tag) throws Exception{
try {
		Debug.PushSubsStack("PagePrincipal_BarButtonClick (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,85);
if (RapidSub.canDelegate("pageprincipal_barbuttonclick")) { return b4i_principal.remoteMe.runUserSub(false, "principal","pageprincipal_barbuttonclick", _tag);}
Debug.locals.put("Tag", _tag);
 BA.debugLineNum = 85;BA.debugLine="Sub PagePrincipal_BarButtonClick (Tag As String)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 86;BA.debugLine="Log(\"BarButtonClicked: \" & Tag)";
Debug.ShouldStop(2097152);
b4i_main.__c.runVoidMethod ("LogImpl:::","41114113",RemoteObject.concat(RemoteObject.createImmutable("BarButtonClicked: "),_tag),0);
 BA.debugLineNum = 88;BA.debugLine="Select Tag";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(_tag,BA.ObjectToString("info"),BA.ObjectToString("facturacion"),BA.ObjectToString("direcciones"),BA.ObjectToString("logout"),BA.ObjectToString("ordenes"))) {
case 0: {
 BA.debugLineNum = 91;BA.debugLine="If  mapEmpresaInfo.IsInitialized =False Or mapE";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",b4i_principal._mapempresainfo.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False")) || RemoteObject.solveBoolean("n",b4i_principal._mapempresainfo)) { 
 BA.debugLineNum = 92;BA.debugLine="Msgbox(\"Buscando información del negocio...\",\"";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Buscando información del negocio...")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 93;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 96;BA.debugLine="If pageInfo.IsInitialized  = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",b4i_principal._pageinfo.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 97;BA.debugLine="pageInfo.Initialize(\"pageInfo\")";
Debug.ShouldStop(1);
b4i_principal._pageinfo.runVoidMethod ("Initialize::",b4i_principal.ba,(Object)(RemoteObject.createImmutable("pageInfo")));
 BA.debugLineNum = 98;BA.debugLine="pageInfo.RootPanel.LoadLayout(\"frmInfoEmpresa\"";
Debug.ShouldStop(2);
b4i_principal._pageinfo.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmInfoEmpresa")),b4i_principal.ba);
 BA.debugLineNum = 99;BA.debugLine="pageInfo.HideBackButton = True";
Debug.ShouldStop(4);
b4i_principal._pageinfo.runMethod(true,"setHideBackButton:",b4i_main.__c.runMethod(true,"True"));
 };
 BA.debugLineNum = 102;BA.debugLine="Main.NavControl.SetNavigationBarVisibleAnimated";
Debug.ShouldStop(32);
b4i_principal._main._navcontrol /*RemoteObject*/ .runVoidMethod ("SetNavigationBarVisibleAnimated:",(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 103;BA.debugLine="Main.NavControl.ToolBarVisible = False";
Debug.ShouldStop(64);
b4i_principal._main._navcontrol /*RemoteObject*/ .runMethod(true,"setToolBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 104;BA.debugLine="Main.NavControl.ShowPage2(pageInfo,True)";
Debug.ShouldStop(128);
b4i_principal._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_principal._pageinfo).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 107;BA.debugLine="lblInfoEmpresa.Text = mapEmpresaInfo.Get(\"f_nom";
Debug.ShouldStop(1024);
b4i_principal._lblinfoempresa.runMethod(true,"setText:",BA.ObjectToString(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 108;BA.debugLine="lblInfoNegocio.Text = mapEmpresaInfo.Get(\"f_tip";
Debug.ShouldStop(2048);
b4i_principal._lblinfonegocio.runMethod(true,"setText:",BA.ObjectToString(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tipo_negocio"))))));
 BA.debugLineNum = 109;BA.debugLine="lblPedidoMinimo.Text =  \"RD$ \"&mapEmpresaInfo.G";
Debug.ShouldStop(4096);
b4i_principal._lblpedidominimo.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("RD$ "),b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_pedidos_minimos"))))));
 BA.debugLineNum = 110;BA.debugLine="lblTelefono.Text = mapEmpresaInfo.Get(\"f_telefo";
Debug.ShouldStop(8192);
b4i_principal._lbltelefono.runMethod(true,"setText:",BA.ObjectToString(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_telefono"))))));
 BA.debugLineNum = 111;BA.debugLine="lblDireccion.Text = mapEmpresaInfo.Get(\"f_direc";
Debug.ShouldStop(16384);
b4i_principal._lbldireccion.runMethod(true,"setText:",BA.ObjectToString(b4i_principal._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion"))))));
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="Facturacion.Initialize";
Debug.ShouldStop(131072);
b4i_principal._facturacion.runVoidMethod ("_initialize" /*RemoteObject*/ );
 break; }
case 2: {
 BA.debugLineNum = 117;BA.debugLine="If Main.isLoggedIn = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",b4i_principal._main._isloggedin /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 118;BA.debugLine="loginUser";
Debug.ShouldStop(2097152);
_loginuser();
 BA.debugLineNum = 119;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 121;BA.debugLine="Direcciones.Initialize";
Debug.ShouldStop(16777216);
b4i_principal._direcciones.runVoidMethod ("_initialize" /*RemoteObject*/ );
 break; }
case 3: {
 BA.debugLineNum = 124;BA.debugLine="Main.isLoggedIn = False";
Debug.ShouldStop(134217728);
b4i_principal._main._isloggedin /*RemoteObject*/  = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 125;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(268435456);
b4i_principal._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 break; }
case 4: {
 BA.debugLineNum = 128;BA.debugLine="If Main.isLoggedIn = False Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",b4i_principal._main._isloggedin /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 129;BA.debugLine="loginUser";
Debug.ShouldStop(1);
_loginuser();
 BA.debugLineNum = 130;BA.debugLine="Return";
Debug.ShouldStop(2);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 132;BA.debugLine="ReporteOrdenes.Initialize";
Debug.ShouldStop(8);
b4i_principal._reporteordenes.runVoidMethod ("_initialize" /*RemoteObject*/ );
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
public static RemoteObject  _pageprincipal_disappear() throws Exception{
try {
		Debug.PushSubsStack("PagePrincipal_Disappear (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,142);
if (RapidSub.canDelegate("pageprincipal_disappear")) { return b4i_principal.remoteMe.runUserSub(false, "principal","pageprincipal_disappear");}
 BA.debugLineNum = 142;BA.debugLine="Sub PagePrincipal_Disappear";
Debug.ShouldStop(8192);
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
public static RemoteObject  _pageprincipal_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("PagePrincipal_Resize (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,147);
if (RapidSub.canDelegate("pageprincipal_resize")) { return b4i_principal.remoteMe.runUserSub(false, "principal","pageprincipal_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 147;BA.debugLine="Sub PagePrincipal_Resize(Width As Int, Height As I";
Debug.ShouldStop(262144);
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private page As Page";
b4i_principal._page = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 7;BA.debugLine="Private pageInfo As Page";
b4i_principal._pageinfo = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 8;BA.debugLine="Dim idEmpresa As Int = 5";
b4i_principal._idempresa = BA.numberCast(int.class, 5);
 //BA.debugLineNum = 9;BA.debugLine="Dim impuestoIncluido As Boolean = True";
b4i_principal._impuestoincluido = b4i_main.__c.runMethod(true,"True");
 //BA.debugLineNum = 10;BA.debugLine="Dim mapEmpresaInfo As Map = Null";
b4i_principal._mapempresainfo = (b4i_main.__c.runMethod(false,"Null"));
 //BA.debugLineNum = 11;BA.debugLine="Dim cantidadProduto As Int = 0";
b4i_principal._cantidadproduto = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 13;BA.debugLine="Private btnAbierto As Button";
b4i_principal._btnabierto = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 14;BA.debugLine="Private btnBuscarProducto As Button";
b4i_principal._btnbuscarproducto = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 15;BA.debugLine="Private btnMasVendido As Button";
b4i_principal._btnmasvendido = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private lblCategoria As Label";
b4i_principal._lblcategoria = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private lblLema As Label";
b4i_principal._lbllema = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private ViewCategoria As ScrollView";
b4i_principal._viewcategoria = RemoteObject.createNew ("B4IScrollView");
 //BA.debugLineNum = 19;BA.debugLine="Private hud As HUD";
b4i_principal._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 20;BA.debugLine="Private PanelCategoria As Panel";
b4i_principal._panelcategoria = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnInfoCerrar As Button";
b4i_principal._btninfocerrar = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblDireccion As TextView";
b4i_principal._lbldireccion = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblInfoEmpresa As Label";
b4i_principal._lblinfoempresa = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblInfoNegocio As Label";
b4i_principal._lblinfonegocio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblPedidoMinimo As Label";
b4i_principal._lblpedidominimo = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblTelefono As Label";
b4i_principal._lbltelefono = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private PanelInfoBack As Panel";
b4i_principal._panelinfoback = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private ListProductosModalView As TableView";
b4i_principal._listproductosmodalview = RemoteObject.createNew ("B4ITableView");
 //BA.debugLineNum = 34;BA.debugLine="Private btnProductoBuscarModal As Button";
b4i_principal._btnproductobuscarmodal = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private btnProductoVolver As Button";
b4i_principal._btnproductovolver = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private PanelProductosModalView As Panel";
b4i_principal._panelproductosmodalview = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private txtBuscarProducto As TextField";
b4i_principal._txtbuscarproducto = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private PanelModalProducto As Panel";
b4i_principal._panelmodalproducto = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (principal) ","principal",1,b4i_principal.ba,b4i_principal.mostCurrent,367);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return b4i_principal.remoteMe.runUserSub(false, "principal","salvar_detalle_temporal", _map);}
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("map", _map);
 BA.debugLineNum = 367;BA.debugLine="Sub salvar_detalle_temporal(map As Map)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 369;BA.debugLine="If Main.isLoggedIn = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",b4i_principal._main._isloggedin /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 370;BA.debugLine="loginUser";
Debug.ShouldStop(131072);
_loginuser();
 BA.debugLineNum = 371;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 375;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(4194304);
_mapcalculos = b4i_principal._funcion.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(b4i_principal._impuestoincluido),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 377;BA.debugLine="Dim json As String";
Debug.ShouldStop(16777216);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 378;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(33554432);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_principal._idempresa,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':1"),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 391;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(64);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 392;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(128);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_principal.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_principal.getObject()));
 BA.debugLineNum = 393;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(256);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_principal._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_principal._funcion.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_principal._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 395;BA.debugLine="End Sub";
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