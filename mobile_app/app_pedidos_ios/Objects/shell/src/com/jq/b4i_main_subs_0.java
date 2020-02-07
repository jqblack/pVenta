package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_main_subs_0 {


public static RemoteObject  _actualizar() throws Exception{
try {
		Debug.PushSubsStack("actualizar (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1411);
if (RapidSub.canDelegate("actualizar")) { return b4i_main.remoteMe.runUserSub(false, "main","actualizar");}
 BA.debugLineNum = 1411;BA.debugLine="Sub actualizar";
Debug.ShouldStop(4);
 BA.debugLineNum = 1412;BA.debugLine="If isLoged Then";
Debug.ShouldStop(8);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1413;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(16);
_buscarfavoritos();
 BA.debugLineNum = 1414;BA.debugLine="cargarDatos";
Debug.ShouldStop(32);
_cargardatos();
 };
 BA.debugLineNum = 1416;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actualizarcantidad() throws Exception{
try {
		Debug.PushSubsStack("actualizarCantidad (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1418);
if (RapidSub.canDelegate("actualizarcantidad")) { return b4i_main.remoteMe.runUserSub(false, "main","actualizarcantidad");}
 BA.debugLineNum = 1418;BA.debugLine="Sub actualizarCantidad";
Debug.ShouldStop(512);
 BA.debugLineNum = 1420;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(2048);
b4i_main._lblcantidadproductos.runMethod(true,"setText:",BA.NumberToString(b4i_main._cantidadproduto));
 BA.debugLineNum = 1422;BA.debugLine="If cantidadProduto > 0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",b4i_main._cantidadproduto,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1423;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(16384);
b4i_main._lblcantidadproductos.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 }else {
 BA.debugLineNum = 1425;BA.debugLine="lblCantidadProductos.Visible = False";
Debug.ShouldStop(65536);
b4i_main._lblcantidadproductos.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 };
 BA.debugLineNum = 1429;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_background() throws Exception{
try {
		Debug.PushSubsStack("Application_Background (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,285);
if (RapidSub.canDelegate("application_background")) { return b4i_main.remoteMe.runUserSub(false, "main","application_background");}
 BA.debugLineNum = 285;BA.debugLine="Private Sub Application_Background";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 287;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _application_start(RemoteObject _nav) throws Exception{
try {
		Debug.PushSubsStack("Application_Start (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,140);
if (RapidSub.canDelegate("application_start")) { return b4i_main.remoteMe.runUserSub(false, "main","application_start", _nav);}
RemoteObject _rs = RemoteObject.declareNull("B4IResultSet");
RemoteObject _device = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("Nav", _nav);
 BA.debugLineNum = 140;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
Debug.ShouldStop(2048);
 BA.debugLineNum = 143;BA.debugLine="If File.Exists(File.DirDocuments, \"db.db\") = Fals";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",b4i_main.__c.runMethod(false,"File").runMethod(true,"Exists::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(RemoteObject.createImmutable("db.db"))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 144;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDocum";
Debug.ShouldStop(32768);
b4i_main.__c.runMethod(false,"File").runVoidMethod ("Copy::::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(BA.ObjectToString("db.db")),(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(RemoteObject.createImmutable("db.db")));
 };
 BA.debugLineNum = 146;BA.debugLine="SQL.Initialize(File.DirDocuments, \"db.db\", False)";
Debug.ShouldStop(131072);
b4i_main._sql.runVoidMethod ("Initialize:::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirDocuments")),(Object)(BA.ObjectToString("db.db")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 148;BA.debugLine="Dim rs As ResultSet = SQL.ExecQuery(\"SELECT * FRO";
Debug.ShouldStop(524288);
_rs = b4i_main._sql.runMethod(false,"ExecQuery:",(Object)(RemoteObject.createImmutable("SELECT * FROM t_preferencia")));Debug.locals.put("rs", _rs);Debug.locals.put("rs", _rs);
 BA.debugLineNum = 149;BA.debugLine="Do While rs.NextRow";
Debug.ShouldStop(1048576);
while (_rs.runMethod(true,"NextRow").getBoolean()) {
 BA.debugLineNum = 150;BA.debugLine="url = rs.GetString(\"f_url\")";
Debug.ShouldStop(2097152);
b4i_main._url = _rs.runMethod(true,"GetString:",(Object)(RemoteObject.createImmutable("f_url")));
 }
;
 BA.debugLineNum = 153;BA.debugLine="Dim device As NativeObject";
Debug.ShouldStop(16777216);
_device = RemoteObject.createNew ("B4INativeObject");Debug.locals.put("device", _device);
 BA.debugLineNum = 154;BA.debugLine="device = device.Initialize(\"UIDevice\").RunMethod(";
Debug.ShouldStop(33554432);
_device = _device.runMethod(false,"Initialize:",(Object)(RemoteObject.createImmutable("UIDevice"))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("currentDevice")),(Object)((b4i_main.__c.runMethod(false,"Null"))));Debug.locals.put("device", _device);
 BA.debugLineNum = 155;BA.debugLine="operadora= App.OSVersion";
Debug.ShouldStop(67108864);
b4i_main._operadora = b4i_main._app.runMethod(true,"OSVersion");
 BA.debugLineNum = 156;BA.debugLine="imei = device.GetField(\"identifierForVendor\").AsS";
Debug.ShouldStop(134217728);
b4i_main._imei = _device.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("identifierForVendor"))).runMethod(true,"AsString");
 BA.debugLineNum = 159;BA.debugLine="Initialize";
Debug.ShouldStop(1073741824);
_initialize();
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddproducto_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddProducto_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,961);
if (RapidSub.canDelegate("btnaddproducto_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnaddproducto_click");}
RemoteObject _b = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
 BA.debugLineNum = 961;BA.debugLine="Sub btnAddProducto_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 962;BA.debugLine="Dim b As Button";
Debug.ShouldStop(2);
_b = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 963;BA.debugLine="b.Initialize(\"b\",b.STYLE_CONTACT_ADD)";
Debug.ShouldStop(4);
_b.runVoidMethod ("Initialize:::",(Object)(BA.ObjectToString("b")),b4i_main.ba,(Object)(_b.runMethod(false,"STYLE_CONTACT_ADD")));
 BA.debugLineNum = 964;BA.debugLine="b = Sender";
Debug.ShouldStop(8);
_b.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_main.ba));
 BA.debugLineNum = 966;BA.debugLine="Dim mapa As Map  = b.Tag";
Debug.ShouldStop(32);
_mapa = (_b.runMethod(false,"Tag"));Debug.locals.put("mapa", _mapa);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 968;BA.debugLine="If mapa.Get(\"f_precio\") <= 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 970;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
Debug.ShouldStop(512);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este")),(Object)(RemoteObject.createImmutable("Aviso")));
 }else {
 BA.debugLineNum = 974;BA.debugLine="salvar_detalle_temporal(mapa,1)";
Debug.ShouldStop(8192);
_salvar_detalle_temporal(_mapa,BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 977;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagregarcarritodetalle_click() throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1149);
if (RapidSub.canDelegate("btnagregarcarritodetalle_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnagregarcarritodetalle_click");}
 BA.debugLineNum = 1149;BA.debugLine="Sub btnagregarCarritoDetalle_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1150;BA.debugLine="salvar_detalle_temporal(mapaDetalle,lblcantidad.T";
Debug.ShouldStop(536870912);
_salvar_detalle_temporal(b4i_main._mapadetalle,BA.numberCast(int.class, b4i_main._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 1151;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(1073741824);
_btnbackdetalles_click();
 BA.debugLineNum = 1152;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackaboutus_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackAboutus_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1432);
if (RapidSub.canDelegate("btnbackaboutus_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnbackaboutus_click");}
 BA.debugLineNum = 1432;BA.debugLine="Sub btnBackAboutus_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 1433;BA.debugLine="NavControl.ShowPage(Page1)";
Debug.ShouldStop(16777216);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._page1).getObject())));
 BA.debugLineNum = 1434;BA.debugLine="smc.Tag = \"inicio\"";
Debug.ShouldStop(33554432);
b4i_main._smc.runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 1435;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackdetalles_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackDetalles_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1154);
if (RapidSub.canDelegate("btnbackdetalles_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnbackdetalles_click");}
 BA.debugLineNum = 1154;BA.debugLine="Sub btnBackDetalles_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1156;BA.debugLine="NavControl.ShowPage2(Page1,True)";
Debug.ShouldStop(8);
b4i_main._navcontrol.runVoidMethod ("ShowPage2::",(Object)(((b4i_main._page1).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1158;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbuscarproducto_click() throws Exception{
try {
		Debug.PushSubsStack("btnBuscarProducto_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,337);
if (RapidSub.canDelegate("btnbuscarproducto_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnbuscarproducto_click");}
 BA.debugLineNum = 337;BA.debugLine="Sub btnBuscarProducto_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 339;BA.debugLine="PanelModalProducto.Left = 0";
Debug.ShouldStop(262144);
b4i_main._panelmodalproducto.runMethod(true,"setLeft:",BA.numberCast(float.class, 0));
 BA.debugLineNum = 340;BA.debugLine="PanelModalProducto.SetAlphaAnimated(500,1)";
Debug.ShouldStop(524288);
b4i_main._panelmodalproducto.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 343;BA.debugLine="txtBuscarProducto.RequestFocus";
Debug.ShouldStop(4194304);
b4i_main._txtbuscarproducto.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btniniciarsecion_click() throws Exception{
try {
		Debug.PushSubsStack("btnIniciarSecion_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,290);
if (RapidSub.canDelegate("btniniciarsecion_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btniniciarsecion_click");}
 BA.debugLineNum = 290;BA.debugLine="Sub btnIniciarSecion_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 291;BA.debugLine="If isLoged Then";
Debug.ShouldStop(4);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 292;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 }else {
 BA.debugLineNum = 294;BA.debugLine="Login.Initialize";
Debug.ShouldStop(32);
b4i_main._login.runVoidMethod ("_initialize" /*RemoteObject*/ );
 };
 BA.debugLineNum = 297;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("btnMasVendido_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1448);
if (RapidSub.canDelegate("btnmasvendido_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnmasvendido_click");}
 BA.debugLineNum = 1448;BA.debugLine="Sub btnMasVendido_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 1450;BA.debugLine="If isLoged Then";
Debug.ShouldStop(512);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1451;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(1024);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1452;BA.debugLine="Favoritos.Initilize";
Debug.ShouldStop(2048);
b4i_main._favoritos.runVoidMethod ("_initilize" /*RemoteObject*/ );
 BA.debugLineNum = 1453;BA.debugLine="actualizar";
Debug.ShouldStop(4096);
_actualizar();
 }else {
 BA.debugLineNum = 1455;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
Debug.ShouldStop(16384);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Para agregar un producto a favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1458;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnorden_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrden_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,331);
if (RapidSub.canDelegate("btnorden_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnorden_click");}
 BA.debugLineNum = 331;BA.debugLine="Sub btnOrden_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 333;BA.debugLine="Facturacion.Initialize";
Debug.ShouldStop(4096);
b4i_main._facturacion.runVoidMethod ("_initialize" /*RemoteObject*/ );
 BA.debugLineNum = 335;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprincipalback_click() throws Exception{
try {
		Debug.PushSubsStack("btnPrincipalBack_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,276);
if (RapidSub.canDelegate("btnprincipalback_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnprincipalback_click");}
 BA.debugLineNum = 276;BA.debugLine="Sub btnPrincipalBack_Click";
Debug.ShouldStop(524288);
 BA.debugLineNum = 278;BA.debugLine="smc.OpenLeftMenu";
Debug.ShouldStop(2097152);
b4i_main._smc.runVoidMethod ("OpenLeftMenu");
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("btnProductoBuscarModal_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,348);
if (RapidSub.canDelegate("btnproductobuscarmodal_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnproductobuscarmodal_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscarproducto = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 348;BA.debugLine="Sub btnProductoBuscarModal_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 350;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",b4i_main._txtbuscarproducto.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 351;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
Debug.ShouldStop(1073741824);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Escriba el nombre del producto")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 352;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 355;BA.debugLine="Dim json As String";
Debug.ShouldStop(4);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 356;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
Debug.ShouldStop(8);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_main._idempresa,RemoteObject.createImmutable(",'f_parametro':'"),b4i_main._txtbuscarproducto.runMethod(true,"Text").runMethod(true,"Replace::",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"Replace::",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 358;BA.debugLine="Dim JobBuscarProducto As HttpJob";
Debug.ShouldStop(32);
_jobbuscarproducto = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscarProducto", _jobbuscarproducto);
 BA.debugLineNum = 359;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
Debug.ShouldStop(64);
_jobbuscarproducto.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobBuscarProducto")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 360;BA.debugLine="JobBuscarProducto.PostString(url&\"ws/get_producto";
Debug.ShouldStop(128);
_jobbuscarproducto.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("ws/get_productos_by_paramentros"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._tokenpublico),(Object)(_json)))));
 BA.debugLineNum = 361;BA.debugLine="hud.ProgressDialogShow(\"Buscando producto...\")";
Debug.ShouldStop(256);
b4i_main._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Buscando producto...")));
 BA.debugLineNum = 362;BA.debugLine="Page1.ResignFocus";
Debug.ShouldStop(512);
b4i_main._page1.runVoidMethod ("ResignFocus");
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
		Debug.PushSubsStack("btnProductoVolver_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,366);
if (RapidSub.canDelegate("btnproductovolver_click")) { return b4i_main.remoteMe.runUserSub(false, "main","btnproductovolver_click");}
 BA.debugLineNum = 366;BA.debugLine="Sub btnProductoVolver_Click";
Debug.ShouldStop(8192);
 BA.debugLineNum = 367;BA.debugLine="PanelModalProducto.SetAlphaAnimated(300,0)";
Debug.ShouldStop(16384);
b4i_main._panelmodalproducto.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 300)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buscarfavoritos() throws Exception{
try {
		Debug.PushSubsStack("BuscarFavoritos (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,255);
if (RapidSub.canDelegate("buscarfavoritos")) { return b4i_main.remoteMe.runUserSub(false, "main","buscarfavoritos");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobfavoritos = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 255;BA.debugLine="Sub BuscarFavoritos";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 257;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData.i";
Debug.ShouldStop(1);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_main._usersdata.getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idempresa':"),RemoteObject.createImmutable(1000));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 259;BA.debugLine="Dim jobFavoritos As HttpJob";
Debug.ShouldStop(4);
_jobfavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("jobFavoritos", _jobfavoritos);
 BA.debugLineNum = 260;BA.debugLine="jobFavoritos.Initialize(\"buscarFavoritos\",Me)";
Debug.ShouldStop(8);
_jobfavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("buscarFavoritos")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 261;BA.debugLine="jobFavoritos.PostString(url&\"puntoventa/buscarfav";
Debug.ShouldStop(16);
_jobfavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/buscarfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(_json)))));
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarallproductos() throws Exception{
try {
		Debug.PushSubsStack("cargarAllProductos (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,319);
if (RapidSub.canDelegate("cargarallproductos")) { return b4i_main.remoteMe.runUserSub(false, "main","cargarallproductos");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscarproducto = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 319;BA.debugLine="Sub cargarAllProductos";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 321;BA.debugLine="Dim json As String";
Debug.ShouldStop(1);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 322;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
Debug.ShouldStop(2);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_main._idempresa,RemoteObject.createImmutable(",'f_parametro':'%'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 324;BA.debugLine="Dim JobBuscarProducto As HttpJob";
Debug.ShouldStop(8);
_jobbuscarproducto = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobBuscarProducto", _jobbuscarproducto);
 BA.debugLineNum = 325;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProductoAL";
Debug.ShouldStop(16);
_jobbuscarproducto.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobBuscarProductoALL")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 326;BA.debugLine="JobBuscarProducto.PostString(url&\"ws/get_producto";
Debug.ShouldStop(32);
_jobbuscarproducto.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("ws/get_productos_by_paramentros2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._tokenpublico),(Object)(_json)))));
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargardatos() throws Exception{
try {
		Debug.PushSubsStack("cargarDatos (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,300);
if (RapidSub.canDelegate("cargardatos")) { return b4i_main.remoteMe.runUserSub(false, "main","cargardatos");}
 BA.debugLineNum = 300;BA.debugLine="Sub cargarDatos";
Debug.ShouldStop(2048);
 BA.debugLineNum = 305;BA.debugLine="cargarMasVendido";
Debug.ShouldStop(65536);
_cargarmasvendido();
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarmasvendido() throws Exception{
try {
		Debug.PushSubsStack("cargarMasVendido (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,309);
if (RapidSub.canDelegate("cargarmasvendido")) { return b4i_main.remoteMe.runUserSub(false, "main","cargarmasvendido");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductomasvendido = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 309;BA.debugLine="Sub cargarMasVendido";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 311;BA.debugLine="Dim json As String";
Debug.ShouldStop(4194304);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 312;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
Debug.ShouldStop(8388608);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_main._idempresa);Debug.locals.put("json", _json);
 BA.debugLineNum = 313;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
Debug.ShouldStop(16777216);
_jobproductomasvendido = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobProductoMasVendido", _jobproductomasvendido);
 BA.debugLineNum = 314;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMasV";
Debug.ShouldStop(33554432);
_jobproductomasvendido.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobProductoMasVendido")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 315;BA.debugLine="JobProductoMasVendido.PostString(url&\"ws/get_prod";
Debug.ShouldStop(67108864);
_jobproductomasvendido.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("ws/get_productos_main_page"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._tokenpublico),(Object)(_json)))));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearpanel() throws Exception{
try {
		Debug.PushSubsStack("crearPanel (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,124);
if (RapidSub.canDelegate("crearpanel")) { return b4i_main.remoteMe.runUserSub(false, "main","crearpanel");}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _img = RemoteObject.declareNull("B4IBitmap");
 BA.debugLineNum = 124;BA.debugLine="Sub crearPanel As Panel";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 126;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(536870912);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 127;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(1073741824);
_p.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 129;BA.debugLine="Dim img As Bitmap";
Debug.ShouldStop(1);
_img = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("img", _img);
 BA.debugLineNum = 130;BA.debugLine="img.Initialize(File.DirAssets,\"user32.png\")";
Debug.ShouldStop(2);
_img.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("user32.png")));
 BA.debugLineNum = 132;BA.debugLine="p.AddView(img,0%x,0%y,15%x,15%y)";
Debug.ShouldStop(8);
_p.runVoidMethod ("AddView:::::",(Object)(((_img).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 15)))),(Object)(b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 15)))));
 BA.debugLineNum = 136;BA.debugLine="Return p";
Debug.ShouldStop(128);
if (true) return _p;
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _nombre,RemoteObject _cantidad,RemoteObject _img1,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,669);
if (RapidSub.canDelegate("createlistitem")) { return b4i_main.remoteMe.runUserSub(false, "main","createlistitem", _nombre, _cantidad, _img1, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("img1", _img1);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 669;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 671;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1073741824);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 672;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_p.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 673;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(1);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 674;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
Debug.ShouldStop(2);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPanelesItems")),b4i_main.ba);
 BA.debugLineNum = 675;BA.debugLine="lblNomCat.Text = Nombre";
Debug.ShouldStop(4);
b4i_main._lblnomcat.runMethod(true,"setText:",_nombre);
 BA.debugLineNum = 676;BA.debugLine="lblCantCat.Text = cantidad";
Debug.ShouldStop(8);
b4i_main._lblcantcat.runMethod(true,"setText:",_cantidad);
 BA.debugLineNum = 677;BA.debugLine="imgCat.Bitmap = img1";
Debug.ShouldStop(16);
b4i_main._imgcat.runMethod(false,"setBitmap:",_img1);
 BA.debugLineNum = 678;BA.debugLine="Return p";
Debug.ShouldStop(32);
if (true) return _p;
 BA.debugLineNum = 680;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelproducto(RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("createPanelProducto (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,686);
if (RapidSub.canDelegate("createpanelproducto")) { return b4i_main.remoteMe.runUserSub(false, "main","createpanelproducto", _map);}
RemoteObject _panelfondopro = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _heigimg = RemoteObject.createImmutable(0);
RemoteObject _lef = RemoteObject.createImmutable(0);
RemoteObject _leffav = RemoteObject.createImmutable(0);
RemoteObject _tnom = RemoteObject.createImmutable(0);
RemoteObject _hnom = RemoteObject.createImmutable(0);
RemoteObject _tpre = RemoteObject.createImmutable(0);
RemoteObject _hpre = RemoteObject.createImmutable(0);
RemoteObject _timgfav = RemoteObject.createImmutable(0);
RemoteObject _mapaaux = RemoteObject.declareNull("B4IMap");
RemoteObject _imagenpro = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _lbltitulopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _imgfav = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _bmimgfav = RemoteObject.declareNull("B4IBitmap");
RemoteObject _mapaimg = RemoteObject.declareNull("B4IMap");
int _i = 0;
RemoteObject _mapafav = RemoteObject.declareNull("B4IMap");
Debug.locals.put("map", _map);
 BA.debugLineNum = 686;BA.debugLine="Sub createPanelProducto(map As Map) As Panel";
Debug.ShouldStop(8192);
 BA.debugLineNum = 688;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(32768);
_panelfondopro = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 689;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(65536);
_panelfondopro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 691;BA.debugLine="PanelFondoPro.Width = ViewCategoria.Width * 0.47";
Debug.ShouldStop(262144);
_panelfondopro.runMethod(true,"setWidth:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0)));
 BA.debugLineNum = 692;BA.debugLine="PanelFondoPro.Height = ViewCategoria.Height * 0.4";
Debug.ShouldStop(524288);
_panelfondopro.runMethod(true,"setHeight:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0)));
 BA.debugLineNum = 694;BA.debugLine="Dim heigImg As Int = PanelFondoPro.Height * 0.50";
Debug.ShouldStop(2097152);
_heigimg = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.50)}, "*",0, 0));Debug.locals.put("heigImg", _heigimg);Debug.locals.put("heigImg", _heigimg);
 BA.debugLineNum = 695;BA.debugLine="Dim lef As Int = ViewCategoria.Width * 0.02";
Debug.ShouldStop(4194304);
_lef = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.02)}, "*",0, 0));Debug.locals.put("lef", _lef);Debug.locals.put("lef", _lef);
 BA.debugLineNum = 696;BA.debugLine="Dim lefFav As Int =  ViewCategoria.Width * 0.30";
Debug.ShouldStop(8388608);
_leffav = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.30)}, "*",0, 0));Debug.locals.put("lefFav", _leffav);Debug.locals.put("lefFav", _leffav);
 BA.debugLineNum = 699;BA.debugLine="Dim Tnom As Int =   PanelFondoPro.Height * 0.39";
Debug.ShouldStop(67108864);
_tnom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.39)}, "*",0, 0));Debug.locals.put("Tnom", _tnom);Debug.locals.put("Tnom", _tnom);
 BA.debugLineNum = 700;BA.debugLine="Dim Hnom As Int =   PanelFondoPro.Height * 0.42";
Debug.ShouldStop(134217728);
_hnom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.42)}, "*",0, 0));Debug.locals.put("Hnom", _hnom);Debug.locals.put("Hnom", _hnom);
 BA.debugLineNum = 702;BA.debugLine="Dim tPre As Int = PanelFondoPro.Height * 0.51";
Debug.ShouldStop(536870912);
_tpre = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.51)}, "*",0, 0));Debug.locals.put("tPre", _tpre);Debug.locals.put("tPre", _tpre);
 BA.debugLineNum = 703;BA.debugLine="Dim hPre As Int  = PanelFondoPro.Height * 0.40";
Debug.ShouldStop(1073741824);
_hpre = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0));Debug.locals.put("hPre", _hpre);Debug.locals.put("hPre", _hpre);
 BA.debugLineNum = 705;BA.debugLine="Dim tImgFav As Int = PanelFondoPro.Height * 0.68";
Debug.ShouldStop(1);
_timgfav = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.68)}, "*",0, 0));Debug.locals.put("tImgFav", _timgfav);Debug.locals.put("tImgFav", _timgfav);
 BA.debugLineNum = 708;BA.debugLine="Dim mapaAux As Map";
Debug.ShouldStop(8);
_mapaaux = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapaAux", _mapaaux);
 BA.debugLineNum = 709;BA.debugLine="mapaAux.Initialize";
Debug.ShouldStop(16);
_mapaaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 711;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
Debug.ShouldStop(64);
_panelfondopro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 713;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(256);
_panelfondopro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 715;BA.debugLine="map.Put(\"f_destacado\",True)";
Debug.ShouldStop(1024);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 717;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(4096);
_panelimagen.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 719;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(16384);
_imagenpro = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 720;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(32768);
_imagenpro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 722;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(131072);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 724;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_foto\"";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 725;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(1048576);
_bm = b4i_main._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 728;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(8388608);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 731;BA.debugLine="imagenPro.Bitmap = bm";
Debug.ShouldStop(67108864);
_imagenpro.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 733;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
Debug.ShouldStop(268435456);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 735;BA.debugLine="PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondo";
Debug.ShouldStop(1073741824);
_panelimagen.runVoidMethod ("AddView:::::",(Object)(((_imagenpro).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _heigimg)));
 BA.debugLineNum = 737;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelF";
Debug.ShouldStop(1);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_panelimagen).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _heigimg)));
 BA.debugLineNum = 740;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(8);
_lbltitulopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 741;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(16);
_lbltitulopro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 742;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(32);
_lbltitulopro.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 743;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(64);
_lbltitulopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 744;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(128);
_lbltitulopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 746;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,lef,Tnom,Panel";
Debug.ShouldStop(512);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lbltitulopro).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, _tnom)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, _hnom)));
 BA.debugLineNum = 748;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(2048);
_lblpreciopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 749;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(4096);
_lblpreciopro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 750;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
Debug.ShouldStop(8192);
_lblpreciopro.runMethod(true,"setText:",b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 751;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(16384);
_lblpreciopro.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"Text")));
 BA.debugLineNum = 752;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(32768);
_lblpreciopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 753;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(65536);
_lblpreciopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 755;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,lef,tPre,Panel";
Debug.ShouldStop(262144);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lblpreciopro).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, _tpre)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),RemoteObject.createImmutable(0.50)}, "*",0, 0))),(Object)(BA.numberCast(float.class, _hpre)));
 BA.debugLineNum = 757;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(1048576);
_btnaddpro = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 758;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
Debug.ShouldStop(2097152);
_btnaddpro.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnAddProducto")),b4i_main.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 759;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(4194304);
_btnaddpro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 760;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
Debug.ShouldStop(8388608);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 761;BA.debugLine="btnAddPro.Tag = map";
Debug.ShouldStop(16777216);
_btnaddpro.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 762;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(33554432);
_btnaddpro.runMethod(true,"setText:",BA.ObjectToString("Agregar"));
 BA.debugLineNum = 764;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
Debug.ShouldStop(134217728);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 766;BA.debugLine="PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Wid";
Debug.ShouldStop(536870912);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_btnaddpro).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),RemoteObject.createImmutable(0.02)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.80)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.14)}, "*",0, 0))));
 BA.debugLineNum = 768;BA.debugLine="Dim imgFav As ImageView";
Debug.ShouldStop(-2147483648);
_imgfav = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imgFav", _imgfav);
 BA.debugLineNum = 769;BA.debugLine="imgFav.Initialize(\"imgFav\")";
Debug.ShouldStop(1);
_imgfav.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("imgFav")));
 BA.debugLineNum = 770;BA.debugLine="Dim bmImgFav As Bitmap";
Debug.ShouldStop(2);
_bmimgfav = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmImgFav", _bmimgfav);
 BA.debugLineNum = 772;BA.debugLine="Dim mapaimg As Map";
Debug.ShouldStop(8);
_mapaimg = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapaimg", _mapaimg);
 BA.debugLineNum = 773;BA.debugLine="mapaimg.Initialize";
Debug.ShouldStop(16);
_mapaimg.runVoidMethod ("Initialize");
 BA.debugLineNum = 775;BA.debugLine="If isLoged Then";
Debug.ShouldStop(64);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 777;BA.debugLine="For i=0 To listafavoritos.Size -1";
Debug.ShouldStop(256);
{
final int step58 = 1;
final int limit58 = RemoteObject.solve(new RemoteObject[] {b4i_main._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step58 > 0 && _i <= limit58) || (step58 < 0 && _i >= limit58) ;_i = ((int)(0 + _i + step58))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 778;BA.debugLine="Dim mapafav As Map";
Debug.ShouldStop(512);
_mapafav = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapafav", _mapafav);
 BA.debugLineNum = 779;BA.debugLine="mapafav = listafavoritos.Get(i)";
Debug.ShouldStop(1024);
_mapafav = (b4i_main._listafavoritos.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapafav", _mapafav);
 BA.debugLineNum = 781;BA.debugLine="If mapafav.Get(\"f_idrecord\") == map.Get(\"f_idre";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_mapafav.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 782;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartred.p";
Debug.ShouldStop(8192);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartred.png")));
 BA.debugLineNum = 783;BA.debugLine="mapaimg.Put(\"f_red\",True)";
Debug.ShouldStop(16384);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 784;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecor";
Debug.ShouldStop(32768);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 787;BA.debugLine="map.Put(\"f_red\",True)";
Debug.ShouldStop(262144);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 788;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
Debug.ShouldStop(524288);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 790;BA.debugLine="mapaAux.Put(\"f_red\",True)";
Debug.ShouldStop(2097152);
_mapaaux.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 791;BA.debugLine="mapaAux.Put(\"f_idproducto\", map.Get(\"f_idrecor";
Debug.ShouldStop(4194304);
_mapaaux.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 793;BA.debugLine="i = listafavoritos.Size -1";
Debug.ShouldStop(16777216);
_i = RemoteObject.solve(new RemoteObject[] {b4i_main._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();Debug.locals.put("i", _i);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 801;BA.debugLine="If bmImgFav.IsInitialized == False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 802;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartwhitean";
Debug.ShouldStop(2);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartwhiteandblack.png")));
 BA.debugLineNum = 803;BA.debugLine="mapaimg.Put(\"f_red\",False)";
Debug.ShouldStop(4);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 804;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
Debug.ShouldStop(8);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 807;BA.debugLine="map.Put(\"f_red\",False)";
Debug.ShouldStop(64);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 808;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
Debug.ShouldStop(128);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 810;BA.debugLine="mapaAux.Put(\"f_red\",False)";
Debug.ShouldStop(512);
_mapaaux.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 811;BA.debugLine="mapaAux.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
Debug.ShouldStop(1024);
_mapaaux.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 };
 BA.debugLineNum = 814;BA.debugLine="PanelFondoPro.Tag = map";
Debug.ShouldStop(8192);
_panelfondopro.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 816;BA.debugLine="imgFav.Bitmap = bmImgFav";
Debug.ShouldStop(32768);
_imgfav.runMethod(false,"setBitmap:",_bmimgfav);
 BA.debugLineNum = 818;BA.debugLine="imgFav.Tag = mapaimg";
Debug.ShouldStop(131072);
_imgfav.runMethod(false,"setTag:",(_mapaimg));
 BA.debugLineNum = 820;BA.debugLine="PanelFondoPro.AddView(imgFav,lefFav,tImgFav,30dip";
Debug.ShouldStop(524288);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_imgfav).getObject())),(Object)(BA.numberCast(float.class, _leffav)),(Object)(BA.numberCast(float.class, _timgfav)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 30))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 17))))));
 BA.debugLineNum = 823;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(4194304);
if (true) return _panelfondopro;
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelproductoscroll(RemoteObject _mapapanel1,RemoteObject _imagen) throws Exception{
try {
		Debug.PushSubsStack("createPanelProductoScroll (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,829);
if (RapidSub.canDelegate("createpanelproductoscroll")) { return b4i_main.remoteMe.runUserSub(false, "main","createpanelproductoscroll", _mapapanel1, _imagen);}
RemoteObject _panelfondopro = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _heigimg = RemoteObject.createImmutable(0);
RemoteObject _lef = RemoteObject.createImmutable(0);
RemoteObject _leffav = RemoteObject.createImmutable(0);
RemoteObject _tnom = RemoteObject.createImmutable(0);
RemoteObject _hnom = RemoteObject.createImmutable(0);
RemoteObject _tpre = RemoteObject.createImmutable(0);
RemoteObject _hpre = RemoteObject.createImmutable(0);
RemoteObject _timgfav = RemoteObject.createImmutable(0);
RemoteObject _imagenpro = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _lbltitulopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _imgfav = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _bmimgfav = RemoteObject.declareNull("B4IBitmap");
RemoteObject _mapaimg = RemoteObject.declareNull("B4IMap");
int _i = 0;
RemoteObject _mapafav = RemoteObject.declareNull("B4IMap");
Debug.locals.put("mapaPanel1", _mapapanel1);
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 829;BA.debugLine="Sub createPanelProductoScroll(mapaPanel1 As Map, i";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 832;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(-2147483648);
_panelfondopro = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 833;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(1);
_panelfondopro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 835;BA.debugLine="PanelFondoPro.Width = ViewCategoria.Width * 0.47";
Debug.ShouldStop(4);
_panelfondopro.runMethod(true,"setWidth:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0)));
 BA.debugLineNum = 836;BA.debugLine="PanelFondoPro.Height = ViewCategoria.Height * 0.4";
Debug.ShouldStop(8);
_panelfondopro.runMethod(true,"setHeight:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0)));
 BA.debugLineNum = 838;BA.debugLine="Dim heigImg As Int = PanelFondoPro.Height * 0.50";
Debug.ShouldStop(32);
_heigimg = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.50)}, "*",0, 0));Debug.locals.put("heigImg", _heigimg);Debug.locals.put("heigImg", _heigimg);
 BA.debugLineNum = 839;BA.debugLine="Dim lef As Int = ViewCategoria.Width * 0.02";
Debug.ShouldStop(64);
_lef = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.02)}, "*",0, 0));Debug.locals.put("lef", _lef);Debug.locals.put("lef", _lef);
 BA.debugLineNum = 840;BA.debugLine="Dim lefFav As Int =  ViewCategoria.Width * 0.30";
Debug.ShouldStop(128);
_leffav = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.30)}, "*",0, 0));Debug.locals.put("lefFav", _leffav);Debug.locals.put("lefFav", _leffav);
 BA.debugLineNum = 843;BA.debugLine="Dim Tnom As Int =   PanelFondoPro.Height * 0.39";
Debug.ShouldStop(1024);
_tnom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.39)}, "*",0, 0));Debug.locals.put("Tnom", _tnom);Debug.locals.put("Tnom", _tnom);
 BA.debugLineNum = 844;BA.debugLine="Dim Hnom As Int =   PanelFondoPro.Height * 0.42";
Debug.ShouldStop(2048);
_hnom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.42)}, "*",0, 0));Debug.locals.put("Hnom", _hnom);Debug.locals.put("Hnom", _hnom);
 BA.debugLineNum = 846;BA.debugLine="Dim tPre As Int = PanelFondoPro.Height * 0.51";
Debug.ShouldStop(8192);
_tpre = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.51)}, "*",0, 0));Debug.locals.put("tPre", _tpre);Debug.locals.put("tPre", _tpre);
 BA.debugLineNum = 847;BA.debugLine="Dim hPre As Int  = PanelFondoPro.Height * 0.40";
Debug.ShouldStop(16384);
_hpre = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0));Debug.locals.put("hPre", _hpre);Debug.locals.put("hPre", _hpre);
 BA.debugLineNum = 849;BA.debugLine="Dim tImgFav As Int = PanelFondoPro.Height * 0.68";
Debug.ShouldStop(65536);
_timgfav = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.68)}, "*",0, 0));Debug.locals.put("tImgFav", _timgfav);Debug.locals.put("tImgFav", _timgfav);
 BA.debugLineNum = 851;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
Debug.ShouldStop(262144);
_panelfondopro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 853;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(1048576);
_panelfondopro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 855;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(4194304);
_panelimagen.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 857;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
Debug.ShouldStop(16777216);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 859;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(67108864);
_imagenpro = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 860;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(134217728);
_imagenpro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 862;BA.debugLine="imagenPro.Bitmap = imagen";
Debug.ShouldStop(536870912);
_imagenpro.runMethod(false,"setBitmap:",_imagen);
 BA.debugLineNum = 864;BA.debugLine="mapaPanel1.Put(\"f_foto\",imagen)";
Debug.ShouldStop(-2147483648);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_foto"))),(Object)(((_imagen).getObject())));
 BA.debugLineNum = 866;BA.debugLine="mapaPanel1.Put(\"f_destacado\",False)";
Debug.ShouldStop(2);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 869;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,T";
Debug.ShouldStop(16);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.1)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 871;BA.debugLine="PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondo";
Debug.ShouldStop(64);
_panelimagen.runVoidMethod ("AddView:::::",(Object)(((_imagenpro).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _heigimg)));
 BA.debugLineNum = 873;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelF";
Debug.ShouldStop(256);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_panelimagen).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _heigimg)));
 BA.debugLineNum = 875;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(1024);
_lbltitulopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 876;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(2048);
_lbltitulopro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 877;BA.debugLine="lblTituloPro.Text = mapaPanel1.Get(\"f_descripcion";
Debug.ShouldStop(4096);
_lbltitulopro.runMethod(true,"setText:",BA.ObjectToString(_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 878;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(8192);
_lbltitulopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 879;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(16384);
_lbltitulopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 882;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,lef,Tnom,Panel";
Debug.ShouldStop(131072);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lbltitulopro).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, _tnom)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, _hnom)));
 BA.debugLineNum = 884;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(524288);
_lblpreciopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 885;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(1048576);
_lblpreciopro.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 886;BA.debugLine="lblPrecioPro.Text = NumberFormat(mapaPanel1.Get(\"";
Debug.ShouldStop(2097152);
_lblpreciopro.runMethod(true,"setText:",b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 887;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(4194304);
_lblpreciopro.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"Text")));
 BA.debugLineNum = 888;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(8388608);
_lblpreciopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 889;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(16777216);
_lblpreciopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 891;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,lef,tPre,Panel";
Debug.ShouldStop(67108864);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lblpreciopro).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, _tpre)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),RemoteObject.createImmutable(0.50)}, "*",0, 0))),(Object)(BA.numberCast(float.class, _hpre)));
 BA.debugLineNum = 893;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(268435456);
_btnaddpro = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 894;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
Debug.ShouldStop(536870912);
_btnaddpro.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnAddProducto")),b4i_main.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 895;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(1073741824);
_btnaddpro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 896;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
Debug.ShouldStop(-2147483648);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 897;BA.debugLine="btnAddPro.Tag = mapaPanel1";
Debug.ShouldStop(1);
_btnaddpro.runMethod(false,"setTag:",(_mapapanel1));
 BA.debugLineNum = 898;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(2);
_btnaddpro.runMethod(true,"setText:",BA.ObjectToString("Agregar"));
 BA.debugLineNum = 900;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
Debug.ShouldStop(8);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 902;BA.debugLine="PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Wid";
Debug.ShouldStop(32);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_btnaddpro).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),RemoteObject.createImmutable(0.02)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.80)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.14)}, "*",0, 0))));
 BA.debugLineNum = 905;BA.debugLine="Dim imgFav As ImageView";
Debug.ShouldStop(256);
_imgfav = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imgFav", _imgfav);
 BA.debugLineNum = 906;BA.debugLine="imgFav.Initialize(\"imgFav\")";
Debug.ShouldStop(512);
_imgfav.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("imgFav")));
 BA.debugLineNum = 907;BA.debugLine="Dim bmImgFav As Bitmap";
Debug.ShouldStop(1024);
_bmimgfav = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmImgFav", _bmimgfav);
 BA.debugLineNum = 909;BA.debugLine="Dim mapaimg As Map";
Debug.ShouldStop(4096);
_mapaimg = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapaimg", _mapaimg);
 BA.debugLineNum = 910;BA.debugLine="mapaimg.Initialize";
Debug.ShouldStop(8192);
_mapaimg.runVoidMethod ("Initialize");
 BA.debugLineNum = 912;BA.debugLine="If isLoged Then";
Debug.ShouldStop(32768);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 914;BA.debugLine="For i=0 To listafavoritos.Size -1";
Debug.ShouldStop(131072);
{
final int step52 = 1;
final int limit52 = RemoteObject.solve(new RemoteObject[] {b4i_main._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step52 > 0 && _i <= limit52) || (step52 < 0 && _i >= limit52) ;_i = ((int)(0 + _i + step52))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 915;BA.debugLine="Dim mapafav As Map";
Debug.ShouldStop(262144);
_mapafav = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapafav", _mapafav);
 BA.debugLineNum = 916;BA.debugLine="mapafav = listafavoritos.Get(i)";
Debug.ShouldStop(524288);
_mapafav = (b4i_main._listafavoritos.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapafav", _mapafav);
 BA.debugLineNum = 918;BA.debugLine="If mapafav.Get(\"f_idrecord\") == mapaPanel1.Get(";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_mapafav.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 919;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartRed.p";
Debug.ShouldStop(4194304);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png")));
 BA.debugLineNum = 920;BA.debugLine="i = listafavoritos.Size -1";
Debug.ShouldStop(8388608);
_i = RemoteObject.solve(new RemoteObject[] {b4i_main._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();Debug.locals.put("i", _i);
 BA.debugLineNum = 921;BA.debugLine="mapaimg.Put(\"f_red\",True)";
Debug.ShouldStop(16777216);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 922;BA.debugLine="mapaimg.Put(\"f_idproducto\", mapaPanel1.Get(\"f_";
Debug.ShouldStop(33554432);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 925;BA.debugLine="mapaPanel1.Put(\"f_red\",True)";
Debug.ShouldStop(268435456);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 926;BA.debugLine="mapaPanel1.Put(\"f_idproducto\", mapaPanel1.Get(";
Debug.ShouldStop(536870912);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 933;BA.debugLine="If bmImgFav.IsInitialized == False Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 934;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartWhitean";
Debug.ShouldStop(32);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png")));
 BA.debugLineNum = 935;BA.debugLine="mapaimg.Put(\"f_red\",False)";
Debug.ShouldStop(64);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 936;BA.debugLine="mapaimg.Put(\"f_idproducto\", mapaPanel1.Get(\"f_id";
Debug.ShouldStop(128);
_mapaimg.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 939;BA.debugLine="mapaPanel1.Put(\"f_red\",False)";
Debug.ShouldStop(1024);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 940;BA.debugLine="mapaPanel1.Put(\"f_idproducto\", mapaPanel1.Get(\"f";
Debug.ShouldStop(2048);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 };
 BA.debugLineNum = 945;BA.debugLine="PanelFondoPro.Tag = mapaPanel1";
Debug.ShouldStop(65536);
_panelfondopro.runMethod(false,"setTag:",(_mapapanel1));
 BA.debugLineNum = 947;BA.debugLine="imgFav.Bitmap = bmImgFav";
Debug.ShouldStop(262144);
_imgfav.runMethod(false,"setBitmap:",_bmimgfav);
 BA.debugLineNum = 948;BA.debugLine="imgFav.Tag = mapaimg";
Debug.ShouldStop(524288);
_imgfav.runMethod(false,"setTag:",(_mapaimg));
 BA.debugLineNum = 950;BA.debugLine="PanelFondoPro.AddView(imgFav,lefFav,tImgFav,30dip";
Debug.ShouldStop(2097152);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_imgfav).getObject())),(Object)(BA.numberCast(float.class, _leffav)),(Object)(BA.numberCast(float.class, _timgfav)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 30))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 17))))));
 BA.debugLineNum = 952;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(8388608);
if (true) return _panelfondopro;
 BA.debugLineNum = 954;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgdetallefav_click() throws Exception{
try {
		Debug.PushSubsStack("imgdetallefav_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1164);
if (RapidSub.canDelegate("imgdetallefav_click")) { return b4i_main.remoteMe.runUserSub(false, "main","imgdetallefav_click");}
RemoteObject _i = RemoteObject.declareNull("B4IImageViewWrapper");
 BA.debugLineNum = 1164;BA.debugLine="Sub imgdetallefav_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1166;BA.debugLine="Dim i As ImageView";
Debug.ShouldStop(8192);
_i = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("i", _i);
 BA.debugLineNum = 1167;BA.debugLine="i.Initialize(\"\")";
Debug.ShouldStop(16384);
_i.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1168;BA.debugLine="i = Sender";
Debug.ShouldStop(32768);
_i.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_main.ba));
 BA.debugLineNum = 1170;BA.debugLine="If isLoged Then";
Debug.ShouldStop(131072);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1172;BA.debugLine="If i.Tag == 1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_i.runMethod(false,"Tag"),RemoteObject.createImmutable((1)))) { 
 BA.debugLineNum = 1174;BA.debugLine="Msgbox2(\"MsgDeleteFav\",\"Desea eliminar este pro";
Debug.ShouldStop(2097152);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("MsgDeleteFav")),(Object)(BA.ObjectToString("Desea eliminar este producto de su lista de favoritos?")),(Object)(BA.ObjectToString("Advertencia!!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 }else {
 BA.debugLineNum = 1177;BA.debugLine="Msgbox2(\"MsgAddFav\",\"Desea agregar este product";
Debug.ShouldStop(16777216);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("MsgAddFav")),(Object)(BA.ObjectToString("Desea agregar este producto de su lista de favoritos?")),(Object)(BA.ObjectToString("Advertencia!!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 }else {
 BA.debugLineNum = 1181;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
Debug.ShouldStop(268435456);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Para agregar un producto a favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1184;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgfav_click() throws Exception{
try {
		Debug.PushSubsStack("imgFav_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1072);
if (RapidSub.canDelegate("imgfav_click")) { return b4i_main.remoteMe.runUserSub(false, "main","imgfav_click");}
RemoteObject _img = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _deletefavoritos = RemoteObject.declareNull("b4i_httpjob");
RemoteObject _putfavoritos = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 1072;BA.debugLine="Sub imgFav_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 1074;BA.debugLine="If isLoged Then";
Debug.ShouldStop(131072);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1076;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(524288);
_img = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 1077;BA.debugLine="img.Initialize(\"\")";
Debug.ShouldStop(1048576);
_img.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1078;BA.debugLine="img = Sender";
Debug.ShouldStop(2097152);
_img.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_main.ba));
 BA.debugLineNum = 1080;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(8388608);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 1081;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(16777216);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 1082;BA.debugLine="mapa = img.Tag";
Debug.ShouldStop(33554432);
_mapa = (_img.runMethod(false,"Tag"));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 1084;BA.debugLine="mapaDetalleImagen = mapa";
Debug.ShouldStop(134217728);
b4i_main._mapadetalleimagen = _mapa;
 BA.debugLineNum = 1086;BA.debugLine="Dim bm As  Bitmap";
Debug.ShouldStop(536870912);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1088;BA.debugLine="If mapa.Get(\"f_red\") Then";
Debug.ShouldStop(-2147483648);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_red"))))).getBoolean()) { 
 BA.debugLineNum = 1090;BA.debugLine="bm.Initialize(File.DirAssets,\"heartWhiteandBlac";
Debug.ShouldStop(2);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png")));
 BA.debugLineNum = 1091;BA.debugLine="img.Bitmap = bm";
Debug.ShouldStop(4);
_img.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 1092;BA.debugLine="mapa.Put(\"f_red\",False)";
Debug.ShouldStop(8);
_mapa.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 1094;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData";
Debug.ShouldStop(32);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_main._usersdata.getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idproducto")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1097;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(256);
_deletefavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 1098;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me";
Debug.ShouldStop(512);
_deletefavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 1099;BA.debugLine="CargarAgain = False";
Debug.ShouldStop(1024);
b4i_main._cargaragain = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 1100;BA.debugLine="deleteFavoritos.PostString(url&\"puntoventa/dele";
Debug.ShouldStop(2048);
_deletefavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(_json)))));
 }else {
 BA.debugLineNum = 1104;BA.debugLine="bm.Initialize(File.DirAssets,\"heartRed.png\")";
Debug.ShouldStop(32768);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png")));
 BA.debugLineNum = 1105;BA.debugLine="img.Bitmap = bm";
Debug.ShouldStop(65536);
_img.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 1106;BA.debugLine="mapa.Put(\"f_red\",True)";
Debug.ShouldStop(131072);
_mapa.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 1108;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData";
Debug.ShouldStop(524288);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_main._usersdata.getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idproducto")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1111;BA.debugLine="Dim putFavoritos As HttpJob";
Debug.ShouldStop(4194304);
_putfavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("putFavoritos", _putfavoritos);
 BA.debugLineNum = 1112;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
Debug.ShouldStop(8388608);
_putfavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("addFavoritos")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 1113;BA.debugLine="CargarAgain = False";
Debug.ShouldStop(16777216);
b4i_main._cargaragain = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 1114;BA.debugLine="putFavoritos.PostString(url&\"puntoventa/addfav\"";
Debug.ShouldStop(33554432);
_putfavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/addfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(_json)))));
 };
 }else {
 BA.debugLineNum = 1120;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
Debug.ShouldStop(-2147483648);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Para agregar un producto a favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1124;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("Initialize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,164);
if (RapidSub.canDelegate("initialize")) { return b4i_main.remoteMe.runUserSub(false, "main","initialize");}
RemoteObject _nc = RemoteObject.declareNull("B4INavigationControllerWrapper");
RemoteObject _lp = RemoteObject.declareNull("B4IPage");
RemoteObject _bmuser = RemoteObject.declareNull("B4IBitmap");
RemoteObject _jobempresainfo = RemoteObject.declareNull("b4i_httpjob");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _cantidadpro = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 164;BA.debugLine="Sub Initialize";
Debug.ShouldStop(8);
 BA.debugLineNum = 169;BA.debugLine="Dim nc As NavigationController";
Debug.ShouldStop(256);
_nc = RemoteObject.createNew ("B4INavigationControllerWrapper");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 170;BA.debugLine="nc.Initialize(\"nc\")";
Debug.ShouldStop(512);
_nc.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("nc")));
 BA.debugLineNum = 171;BA.debugLine="NavControl = nc";
Debug.ShouldStop(1024);
b4i_main._navcontrol = _nc;
 BA.debugLineNum = 172;BA.debugLine="Page1.Initialize(\"Page1\")";
Debug.ShouldStop(2048);
b4i_main._page1.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("Page1")));
 BA.debugLineNum = 173;BA.debugLine="Page1.Title = \"Page 1\"";
Debug.ShouldStop(4096);
b4i_main._page1.runMethod(true,"setTitle:",BA.ObjectToString("Page 1"));
 BA.debugLineNum = 175;BA.debugLine="NavControl.NavigationBarVisible = False";
Debug.ShouldStop(16384);
b4i_main._navcontrol.runMethod(true,"setNavigationBarVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 176;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(32768);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 179;BA.debugLine="Page1.RootPanel.Color = Colors.White";
Debug.ShouldStop(262144);
b4i_main._page1.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"White"));
 BA.debugLineNum = 180;BA.debugLine="Page1.RootPanel.LoadLayout(\"frmPrincipal\")";
Debug.ShouldStop(524288);
b4i_main._page1.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPrincipal")),b4i_main.ba);
 BA.debugLineNum = 181;BA.debugLine="Dim lp As Page";
Debug.ShouldStop(1048576);
_lp = RemoteObject.createNew ("B4IPage");Debug.locals.put("lp", _lp);
 BA.debugLineNum = 182;BA.debugLine="lp.Initialize(\"lp\")";
Debug.ShouldStop(2097152);
_lp.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("lp")));
 BA.debugLineNum = 183;BA.debugLine="lp.RootPanel.Color = Colors.Red";
Debug.ShouldStop(4194304);
_lp.runMethod(false,"RootPanel").runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Red"));
 BA.debugLineNum = 184;BA.debugLine="lp.RootPanel.LoadLayout(\"frmSlideNew\")";
Debug.ShouldStop(8388608);
_lp.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmSlideNew")),b4i_main.ba);
 BA.debugLineNum = 185;BA.debugLine="smc.Initialize(lp, nc,Null)";
Debug.ShouldStop(16777216);
b4i_main._smc.runVoidMethod ("Initialize:::",(Object)(_lp),(Object)(_nc),BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPage"), b4i_main.__c.runMethod(false,"Null")));
 BA.debugLineNum = 186;BA.debugLine="App.KeyController = smc";
Debug.ShouldStop(33554432);
b4i_main._app.runMethod(false,"setKeyController:",((b4i_main._smc).getObject()));
 BA.debugLineNum = 187;BA.debugLine="NavControl.ShowPage(Page1)";
Debug.ShouldStop(67108864);
b4i_main._navcontrol.runVoidMethod ("ShowPage:",(Object)(((b4i_main._page1).getObject())));
 BA.debugLineNum = 191;BA.debugLine="lblCantidadProductos.Visible = False";
Debug.ShouldStop(1073741824);
b4i_main._lblcantidadproductos.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 194;BA.debugLine="PanelTitulo.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
Debug.ShouldStop(2);
b4i_main._paneltitulo.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 196;BA.debugLine="btnMasVendido.SetShadow(Colors.Gray,0dip,2dip,0.2";
Debug.ShouldStop(8);
b4i_main._btnmasvendido.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 197;BA.debugLine="btnBuscarProducto.SetShadow(Colors.Gray,0dip,2dip";
Debug.ShouldStop(16);
b4i_main._btnbuscarproducto.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 199;BA.debugLine="PanelFooterv2.SetShadow(Colors.Gray,0dip,-2dip,0.";
Debug.ShouldStop(64);
b4i_main._panelfooterv2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, -(double) (0 + b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))).<Number>get().intValue()))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 201;BA.debugLine="btnIniciarSecion.SetShadow(Colors.Gray,1dip,2dip,";
Debug.ShouldStop(256);
b4i_main._btniniciarsecion.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 204;BA.debugLine="Panel1.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(2048);
b4i_main._panel1.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 205;BA.debugLine="Panel2.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(4096);
b4i_main._panel2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 206;BA.debugLine="Panel3.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(8192);
b4i_main._panel3.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 207;BA.debugLine="Panel4.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(16384);
b4i_main._panel4.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 208;BA.debugLine="Panel5.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(32768);
b4i_main._panel5.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 209;BA.debugLine="Panel6.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(65536);
b4i_main._panel6.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 210;BA.debugLine="Panel7.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
Debug.ShouldStop(131072);
b4i_main._panel7.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 212;BA.debugLine="Dim bmUser As Bitmap";
Debug.ShouldStop(524288);
_bmuser = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmUser", _bmuser);
 BA.debugLineNum = 213;BA.debugLine="bmUser.Initialize(File.DirAssets,\"user32.png\")";
Debug.ShouldStop(1048576);
_bmuser.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("user32.png")));
 BA.debugLineNum = 215;BA.debugLine="imageUser.Bitmap =bmUser";
Debug.ShouldStop(4194304);
b4i_main._imageuser.runMethod(false,"setBitmap:",_bmuser);
 BA.debugLineNum = 221;BA.debugLine="hud2.ProgressDialogShow(\"Cargando productos...\")";
Debug.ShouldStop(268435456);
b4i_main._hud2.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Cargando productos...")));
 BA.debugLineNum = 222;BA.debugLine="If isLoged Then";
Debug.ShouldStop(536870912);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 224;BA.debugLine="Panel7.Visible = True";
Debug.ShouldStop(-2147483648);
b4i_main._panel7.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 225;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(1);
_buscarfavoritos();
 BA.debugLineNum = 226;BA.debugLine="CargarAgain = True";
Debug.ShouldStop(2);
b4i_main._cargaragain = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 227;BA.debugLine="btnIniciarSecion.Text = usersData.nombre";
Debug.ShouldStop(4);
b4i_main._btniniciarsecion.runMethod(true,"setText:",b4i_main._usersdata.getField(true,"nombre" /*RemoteObject*/ ));
 BA.debugLineNum = 228;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
Debug.ShouldStop(8);
_jobempresainfo = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEmpresaInfo", _jobempresainfo);
 BA.debugLineNum = 229;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
Debug.ShouldStop(16);
_jobempresainfo.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobEmpresaInfo")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 230;BA.debugLine="JobEmpresaInfo.PostString(url&\"ws/get_datos_pre";
Debug.ShouldStop(32);
_jobempresainfo.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("ws/get_datos_preferencia"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),b4i_main._idempresa))))));
 }else {
 BA.debugLineNum = 232;BA.debugLine="Panel7.Visible = False";
Debug.ShouldStop(128);
b4i_main._panel7.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 233;BA.debugLine="cargarDatos";
Debug.ShouldStop(256);
_cargardatos();
 };
 BA.debugLineNum = 239;BA.debugLine="Dim json As String";
Debug.ShouldStop(16384);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 240;BA.debugLine="json = \"'f_imei':\"&imei";
Debug.ShouldStop(32768);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_imei':"),b4i_main._imei);Debug.locals.put("json", _json);
 BA.debugLineNum = 242;BA.debugLine="Dim cantidadPro As HttpJob";
Debug.ShouldStop(131072);
_cantidadpro = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("cantidadPro", _cantidadpro);
 BA.debugLineNum = 243;BA.debugLine="cantidadPro.Initialize(\"cantidadPro\",Me)";
Debug.ShouldStop(262144);
_cantidadpro.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("cantidadPro")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 244;BA.debugLine="cantidadPro.PostString(url&\"puntoventa/get_canitd";
Debug.ShouldStop(524288);
_cantidadpro.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/get_canitdad_producto_Login"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._tokenpublico),(Object)(_json)))));
 BA.debugLineNum = 246;BA.debugLine="If isLoged Then";
Debug.ShouldStop(2097152);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 247;BA.debugLine="lblNombreUser.Text = usersData.nombre";
Debug.ShouldStop(4194304);
b4i_main._lblnombreuser.runMethod(true,"setText:",b4i_main._usersdata.getField(true,"nombre" /*RemoteObject*/ ));
 BA.debugLineNum = 248;BA.debugLine="lblEmailUser.Text = Login.correro";
Debug.ShouldStop(8388608);
b4i_main._lblemailuser.runMethod(true,"setText:",b4i_main._login._correro /*RemoteObject*/ );
 };
 BA.debugLineNum = 251;BA.debugLine="reload = False";
Debug.ShouldStop(67108864);
b4i_main._reload = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 252;BA.debugLine="smc.Tag = \"inicio\"";
Debug.ShouldStop(134217728);
b4i_main._smc.runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,378);
if (RapidSub.canDelegate("jobdone")) { b4i_main.remoteMe.runUserSub(false, "main","jobdone", _job); return;}
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(b4i_main parent,RemoteObject _job) {
this.parent = parent;
this._job = _job;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_main parent;
RemoteObject _job;
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json2 = RemoteObject.declareNull("B4IJSONParser");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _lef = RemoteObject.createImmutable(0);
RemoteObject _wi = RemoteObject.createImmutable(0);
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _lblmasvendidos = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _leflbl = RemoteObject.createImmutable(0);
RemoteObject _lblproductos = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _alttop = RemoteObject.createImmutable(0);
RemoteObject _lef2 = RemoteObject.createImmutable(0);
RemoteObject _lef3 = RemoteObject.createImmutable(0);
int step22;
int limit22;
int step47;
int limit47;
int step86;
int limit86;
int step109;
int limit109;
int step162;
int limit162;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JobDone (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,378);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 381;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(268435456);
parent._hud.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 383;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 384;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
Debug.ShouldStop(-2147483648);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(parent._jobmsj),(Object)(parent._jobmsjtitle));
 BA.debugLineNum = 385;BA.debugLine="Return";
Debug.ShouldStop(1);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 388;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(8);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",parent._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 389;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 7:
//C
this.state = 8;
;
 BA.debugLineNum = 392;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 393;BA.debugLine="Dim list As List";
Debug.ShouldStop(256);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 394;BA.debugLine="Dim json2 As JSONParser";
Debug.ShouldStop(512);
_json2 = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json2", _json2);
 BA.debugLineNum = 397;BA.debugLine="json2.Initialize(funciones.base64_Decode(Job.GetS";
Debug.ShouldStop(4096);
_json2.runVoidMethod ("Initialize:",(Object)(parent._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 399;BA.debugLine="map = json2.NextObject";
Debug.ShouldStop(16384);
_map = _json2.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 401;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(65536);
if (true) break;

case 8:
//select
this.state = 140;
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobBuscarProducto"),BA.ObjectToString("JobProductoMasVendido"),BA.ObjectToString("JobBuscarProductoALL"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobEmpresaInfo"),BA.ObjectToString("buscarFavoritos"),BA.ObjectToString("addFavoritos"),BA.ObjectToString("deleteFavoritos"),BA.ObjectToString("cantidadPro"))) {
case 0: {
this.state = 10;
if (true) break;
}
case 1: {
this.state = 25;
if (true) break;
}
case 2: {
this.state = 41;
if (true) break;
}
case 3: {
this.state = 93;
if (true) break;
}
case 4: {
this.state = 99;
if (true) break;
}
case 5: {
this.state = 101;
if (true) break;
}
case 6: {
this.state = 111;
if (true) break;
}
case 7: {
this.state = 119;
if (true) break;
}
case 8: {
this.state = 135;
if (true) break;
}
}
if (true) break;

case 10:
//C
this.state = 11;
 BA.debugLineNum = 405;BA.debugLine="ListaBusquedaPro.Clear";
Debug.ShouldStop(1048576);
parent._listabusquedapro.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 407;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(4194304);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 408;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 11:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
this.state = 13;
}if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 409;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
Debug.ShouldStop(16777216);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No se ha encontrado productos con esta referencia")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 410;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 413;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(268435456);

case 14:
//for
this.state = 23;
step22 = 1;
limit22 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 141;
if (true) break;

case 141:
//C
this.state = 23;
if ((step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22)) this.state = 16;
if (true) break;

case 142:
//C
this.state = 141;
_i = ((int)(0 + _i + step22)) ;
Debug.locals.put("i", _i);
if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 415;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(1073741824);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 416;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(-2147483648);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 418;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
Debug.ShouldStop(2);
if (true) break;

case 17:
//if
this.state = 22;
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
this.state = 19;
}else {
this.state = 21;
}if (true) break;

case 19:
//C
this.state = 22;
 BA.debugLineNum = 420;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(8);
_bm = parent._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 423;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(64);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 if (true) break;

case 22:
//C
this.state = 142;
;
 BA.debugLineNum = 426;BA.debugLine="ListaBusquedaPro.Add(CreateListItem(map.Get(\"f";
Debug.ShouldStop(512);
parent._listabusquedapro.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))),RemoteObject.concat(RemoteObject.createImmutable("Precio: "),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))),_bm,BA.numberCast(int.class, parent._listabusquedapro.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_map)));
 if (true) break;
if (true) break;

case 23:
//C
this.state = 140;
Debug.locals.put("i", _i);
;
 if (true) break;

case 25:
//C
this.state = 26;
 BA.debugLineNum = 433;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(65536);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 435;BA.debugLine="Dim lef As Int = 0%x";
Debug.ShouldStop(262144);
_lef = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));Debug.locals.put("lef", _lef);Debug.locals.put("lef", _lef);
 BA.debugLineNum = 436;BA.debugLine="Dim wi As Int =  0%x 'ViewCategoria.Width*(list";
Debug.ShouldStop(524288);
_wi = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));Debug.locals.put("wi", _wi);Debug.locals.put("wi", _wi);
 BA.debugLineNum = 437;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(1048576);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 438;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(2097152);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 440;BA.debugLine="If list.Size < 1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 26:
//if
this.state = 35;
if (RemoteObject.solveBoolean("<",_list.runMethod(true,"Size"),BA.numberCast(double.class, 1))) { 
this.state = 28;
}if (true) break;

case 28:
//C
this.state = 29;
 BA.debugLineNum = 442;BA.debugLine="If IsUsa Then";
Debug.ShouldStop(33554432);
if (true) break;

case 29:
//if
this.state = 34;
if (parent._isusa.getBoolean()) { 
this.state = 31;
}else {
this.state = 33;
}if (true) break;

case 31:
//C
this.state = 34;
 BA.debugLineNum = 443;BA.debugLine="Msgbox(\"there isn't product in register\",\"War";
Debug.ShouldStop(67108864);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("there isn't product in register")),(Object)(RemoteObject.createImmutable("Warning!")));
 if (true) break;

case 33:
//C
this.state = 34;
 BA.debugLineNum = 445;BA.debugLine="Msgbox(\"No tienes productos registrados\",\"Avi";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tienes productos registrados")),(Object)(RemoteObject.createImmutable("Aviso!")));
 if (true) break;

case 34:
//C
this.state = 35;
;
 BA.debugLineNum = 448;BA.debugLine="hud2.ProgressDialogHide";
Debug.ShouldStop(-2147483648);
parent._hud2.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 35:
//C
this.state = 36;
;
 BA.debugLineNum = 451;BA.debugLine="Hscroll.Initialize(\"\",47%x*list.Size,ViewCatego";
Debug.ShouldStop(4);
parent._hscroll.runVoidMethod ("Initialize::::",b4i_main.ba,(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 47))),_list.runMethod(true,"Size")}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0))));
 BA.debugLineNum = 453;BA.debugLine="For i = 0 To list.Size-1";
Debug.ShouldStop(16);
if (true) break;

case 36:
//for
this.state = 39;
step47 = 1;
limit47 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 143;
if (true) break;

case 143:
//C
this.state = 39;
if ((step47 > 0 && _i <= limit47) || (step47 < 0 && _i >= limit47)) this.state = 38;
if (true) break;

case 144:
//C
this.state = 143;
_i = ((int)(0 + _i + step47)) ;
Debug.locals.put("i", _i);
if (true) break;

case 38:
//C
this.state = 144;
 BA.debugLineNum = 454;BA.debugLine="mapa = list.Get(i)";
Debug.ShouldStop(32);
_mapa = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 456;BA.debugLine="Hscroll.Panel.AddView(createPanelProducto(mapa";
Debug.ShouldStop(128);
parent._hscroll.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproducto(_mapa)).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0))));
 BA.debugLineNum = 457;BA.debugLine="lef = lef + ViewCategoria.Width * 0.49";
Debug.ShouldStop(256);
_lef = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_lef,parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.49)}, "+*",1, 0));Debug.locals.put("lef", _lef);
 BA.debugLineNum = 458;BA.debugLine="wi = wi + ViewCategoria.Width * 0.47";
Debug.ShouldStop(512);
_wi = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_wi,parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "+*",1, 0));Debug.locals.put("wi", _wi);
 BA.debugLineNum = 459;BA.debugLine="Hscroll.Width = wi";
Debug.ShouldStop(1024);
parent._hscroll.runMethod(true,"setWidth:",BA.numberCast(float.class, _wi));
 if (true) break;
if (true) break;

case 39:
//C
this.state = 140;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 463;BA.debugLine="Hscroll.Color = Colors.RGB(222, 222, 222)";
Debug.ShouldStop(16384);
parent._hscroll.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 222)),(Object)(BA.numberCast(int.class, 222)),(Object)(BA.numberCast(int.class, 222))));
 BA.debugLineNum = 465;BA.debugLine="cargarAllProductos";
Debug.ShouldStop(65536);
_cargarallproductos();
 BA.debugLineNum = 467;BA.debugLine="Dim lblmasVendidos As Label";
Debug.ShouldStop(262144);
_lblmasvendidos = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblmasVendidos", _lblmasvendidos);
 BA.debugLineNum = 468;BA.debugLine="lblmasVendidos.Initialize(\"\")";
Debug.ShouldStop(524288);
_lblmasvendidos.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 469;BA.debugLine="lblmasVendidos.Tag = \"hola\"";
Debug.ShouldStop(1048576);
_lblmasvendidos.runMethod(false,"setTag:",RemoteObject.createImmutable(("hola")));
 BA.debugLineNum = 470;BA.debugLine="lblmasVendidos.Text = \"Mas vendidos\"";
Debug.ShouldStop(2097152);
_lblmasvendidos.runMethod(true,"setText:",BA.ObjectToString("Mas vendidos"));
 BA.debugLineNum = 471;BA.debugLine="lblmasVendidos.TextColor = Colors.RGB(97, 97, 9";
Debug.ShouldStop(4194304);
_lblmasvendidos.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 472;BA.debugLine="lblmasVendidos.Font = Font.CreateNew(20)";
Debug.ShouldStop(8388608);
_lblmasvendidos.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 474;BA.debugLine="Dim lefLbl As Int = ViewCategoria.Width * 0.03";
Debug.ShouldStop(33554432);
_leflbl = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.03)}, "*",0, 0));Debug.locals.put("lefLbl", _leflbl);Debug.locals.put("lefLbl", _leflbl);
 BA.debugLineNum = 476;BA.debugLine="ViewCategoria.Panel.AddView(lblmasVendidos,lefL";
Debug.ShouldStop(134217728);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_lblmasvendidos).getObject())),(Object)(BA.numberCast(float.class, _leflbl)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),parent._viewcategoria.runMethod(true,"Height")}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.30)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.05)}, "*",0, 0))));
 BA.debugLineNum = 478;BA.debugLine="ViewCategoria.Panel.AddView(Hscroll,0%x,ViewCat";
Debug.ShouldStop(536870912);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((parent._hscroll).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.06)}, "*",0, 0))),(Object)(parent._viewcategoria.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.41)}, "*",0, 0))));
 if (true) break;

case 41:
//C
this.state = 42;
 BA.debugLineNum = 483;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(4);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 484;BA.debugLine="If list.Size < 1 Then";
Debug.ShouldStop(8);
if (true) break;

case 42:
//if
this.state = 51;
if (RemoteObject.solveBoolean("<",_list.runMethod(true,"Size"),BA.numberCast(double.class, 1))) { 
this.state = 44;
}if (true) break;

case 44:
//C
this.state = 45;
 BA.debugLineNum = 486;BA.debugLine="If IsUsa Then";
Debug.ShouldStop(32);
if (true) break;

case 45:
//if
this.state = 50;
if (parent._isusa.getBoolean()) { 
this.state = 47;
}else {
this.state = 49;
}if (true) break;

case 47:
//C
this.state = 50;
 BA.debugLineNum = 487;BA.debugLine="Msgbox(\"we can't found any product for you\",\"";
Debug.ShouldStop(64);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("we can't found any product for you")),(Object)(RemoteObject.createImmutable("Warning!")));
 if (true) break;

case 49:
//C
this.state = 50;
 BA.debugLineNum = 489;BA.debugLine="Msgbox(\"No se ha encontrado productos\",\"Infor";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No se ha encontrado productos")),(Object)(RemoteObject.createImmutable("Información")));
 if (true) break;

case 50:
//C
this.state = 51;
;
 BA.debugLineNum = 492;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 51:
//C
this.state = 52;
;
 BA.debugLineNum = 495;BA.debugLine="Dim lblProductos As Label";
Debug.ShouldStop(16384);
_lblproductos = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblProductos", _lblproductos);
 BA.debugLineNum = 496;BA.debugLine="lblProductos.Initialize(\"\")";
Debug.ShouldStop(32768);
_lblproductos.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 498;BA.debugLine="lblProductos.Text = \"Productos\"";
Debug.ShouldStop(131072);
_lblproductos.runMethod(true,"setText:",BA.ObjectToString("Productos"));
 BA.debugLineNum = 499;BA.debugLine="lblProductos.Font = Font.CreateNew(20)";
Debug.ShouldStop(262144);
_lblproductos.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 20))));
 BA.debugLineNum = 500;BA.debugLine="lblProductos.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(524288);
_lblproductos.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 502;BA.debugLine="ViewCategoria.Panel.AddView(lblProductos,4dip,V";
Debug.ShouldStop(2097152);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_lblproductos).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.50)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.30)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.05)}, "*",0, 0))));
 BA.debugLineNum = 506;BA.debugLine="Dim lef As Int = 0%x";
Debug.ShouldStop(33554432);
_lef = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));Debug.locals.put("lef", _lef);Debug.locals.put("lef", _lef);
 BA.debugLineNum = 508;BA.debugLine="If list.Size > 20 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 52:
//if
this.state = 91;
if (RemoteObject.solveBoolean(">",_list.runMethod(true,"Size"),BA.numberCast(double.class, 20))) { 
this.state = 54;
}else {
this.state = 75;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 510;BA.debugLine="Dim alttop As Int  = ViewCategoria.Height * 0.";
Debug.ShouldStop(536870912);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.56)}, "*",0, 0));Debug.locals.put("alttop", _alttop);Debug.locals.put("alttop", _alttop);
 BA.debugLineNum = 511;BA.debugLine="Dim lef2 As Int = 0%x";
Debug.ShouldStop(1073741824);
_lef2 = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));Debug.locals.put("lef2", _lef2);Debug.locals.put("lef2", _lef2);
 BA.debugLineNum = 512;BA.debugLine="Dim lef3 As Int = ViewCategoria.Width * 0.49";
Debug.ShouldStop(-2147483648);
_lef3 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.49)}, "*",0, 0));Debug.locals.put("lef3", _lef3);Debug.locals.put("lef3", _lef3);
 BA.debugLineNum = 514;BA.debugLine="For i=0 To 19";
Debug.ShouldStop(2);
if (true) break;

case 55:
//for
this.state = 73;
step86 = 1;
limit86 = 19;
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 145;
if (true) break;

case 145:
//C
this.state = 73;
if ((step86 > 0 && _i <= limit86) || (step86 < 0 && _i >= limit86)) this.state = 57;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step86)) ;
Debug.locals.put("i", _i);
if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 515;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(4);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 516;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(8);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 517;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
Debug.ShouldStop(16);
if (true) break;

case 58:
//if
this.state = 63;
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
this.state = 60;
}else {
this.state = 62;
}if (true) break;

case 60:
//C
this.state = 63;
 BA.debugLineNum = 518;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(32);
_bm = parent._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 if (true) break;

case 62:
//C
this.state = 63;
 BA.debugLineNum = 521;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(256);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 if (true) break;
;
 BA.debugLineNum = 524;BA.debugLine="If i Mod 2 == 0 Then";
Debug.ShouldStop(2048);

case 63:
//if
this.state = 72;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 65;
}else {
this.state = 71;
}if (true) break;

case 65:
//C
this.state = 66;
 BA.debugLineNum = 526;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
Debug.ShouldStop(8192);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproductoscroll(_map,_bm)).getObject())),(Object)(BA.numberCast(float.class, _lef2)),(Object)(BA.numberCast(float.class, _alttop)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.41)}, "*",0, 0))));
 BA.debugLineNum = 528;BA.debugLine="If i == list.Size-1 Then";
Debug.ShouldStop(32768);
if (true) break;

case 66:
//if
this.state = 69;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
this.state = 68;
}if (true) break;

case 68:
//C
this.state = 69;
 BA.debugLineNum = 529;BA.debugLine="alttop = alttop +  ViewCategoria.Height * 0";
Debug.ShouldStop(65536);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_alttop,parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.42)}, "+*",1, 0));Debug.locals.put("alttop", _alttop);
 if (true) break;

case 69:
//C
this.state = 72;
;
 if (true) break;

case 71:
//C
this.state = 72;
 BA.debugLineNum = 534;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
Debug.ShouldStop(2097152);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproductoscroll(_map,_bm)).getObject())),(Object)(BA.numberCast(float.class, _lef3)),(Object)(BA.numberCast(float.class, _alttop)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.41)}, "*",0, 0))));
 BA.debugLineNum = 535;BA.debugLine="alttop = alttop +  ViewCategoria.Height * 0.";
Debug.ShouldStop(4194304);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_alttop,parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.42)}, "+*",1, 0));Debug.locals.put("alttop", _alttop);
 if (true) break;

case 72:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 73:
//C
this.state = 91;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 541;BA.debugLine="ViewCategoria.ContentHeight = alttop";
Debug.ShouldStop(268435456);
parent._viewcategoria.runMethod(true,"setContentHeight:",_alttop);
 if (true) break;

case 75:
//C
this.state = 76;
 BA.debugLineNum = 545;BA.debugLine="Dim alttop As Int  = ViewCategoria.Height * 0.";
Debug.ShouldStop(1);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.56)}, "*",0, 0));Debug.locals.put("alttop", _alttop);Debug.locals.put("alttop", _alttop);
 BA.debugLineNum = 546;BA.debugLine="Dim lef2 As Int = 0%x";
Debug.ShouldStop(2);
_lef2 = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));Debug.locals.put("lef2", _lef2);Debug.locals.put("lef2", _lef2);
 BA.debugLineNum = 547;BA.debugLine="Dim lef3 As Int = ViewCategoria.Width * 0.49";
Debug.ShouldStop(4);
_lef3 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.49)}, "*",0, 0));Debug.locals.put("lef3", _lef3);Debug.locals.put("lef3", _lef3);
 BA.debugLineNum = 550;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(32);
if (true) break;

case 76:
//for
this.state = 90;
step109 = 1;
limit109 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 147;
if (true) break;

case 147:
//C
this.state = 90;
if ((step109 > 0 && _i <= limit109) || (step109 < 0 && _i >= limit109)) this.state = 78;
if (true) break;

case 148:
//C
this.state = 147;
_i = ((int)(0 + _i + step109)) ;
Debug.locals.put("i", _i);
if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 551;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(64);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 552;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(128);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 553;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
Debug.ShouldStop(256);
if (true) break;

case 79:
//if
this.state = 84;
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
this.state = 81;
}else {
this.state = 83;
}if (true) break;

case 81:
//C
this.state = 84;
 BA.debugLineNum = 554;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(512);
_bm = parent._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 556;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(2048);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 if (true) break;
;
 BA.debugLineNum = 559;BA.debugLine="If i Mod 2 == 0 Then";
Debug.ShouldStop(16384);

case 84:
//if
this.state = 89;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 86;
}else {
this.state = 88;
}if (true) break;

case 86:
//C
this.state = 89;
 BA.debugLineNum = 562;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
Debug.ShouldStop(131072);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproductoscroll(_map,_bm)).getObject())),(Object)(BA.numberCast(float.class, _lef2)),(Object)(BA.numberCast(float.class, _alttop)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0))));
 if (true) break;

case 88:
//C
this.state = 89;
 BA.debugLineNum = 566;BA.debugLine="ViewCategoria.ContentHeight = ViewCategoria.";
Debug.ShouldStop(2097152);
parent._viewcategoria.runMethod(true,"setContentHeight:",BA.numberCast(int.class, parent._viewcategoria.runMethod(false,"Panel").runMethod(true,"Height")));
 BA.debugLineNum = 568;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
Debug.ShouldStop(8388608);
parent._viewcategoria.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproductoscroll(_map,_bm)).getObject())),(Object)(BA.numberCast(float.class, _lef3)),(Object)(BA.numberCast(float.class, _alttop)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0))));
 BA.debugLineNum = 570;BA.debugLine="alttop = alttop +  ViewCategoria.Height * 0.";
Debug.ShouldStop(33554432);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_alttop,parent._viewcategoria.runMethod(true,"Height"),RemoteObject.createImmutable(0.42)}, "+*",1, 0));Debug.locals.put("alttop", _alttop);
 if (true) break;

case 89:
//C
this.state = 148;
;
 if (true) break;
if (true) break;

case 90:
//C
this.state = 91;
Debug.locals.put("i", _i);
;
 if (true) break;

case 91:
//C
this.state = 140;
;
 BA.debugLineNum = 578;BA.debugLine="hud2.ProgressDialogHide";
Debug.ShouldStop(2);
parent._hud2.runVoidMethod ("ProgressDialogHide");
 if (true) break;

case 93:
//C
this.state = 94;
 BA.debugLineNum = 583;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(64);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 584;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(128);
if (true) break;

case 94:
//if
this.state = 97;
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
this.state = 96;
}if (true) break;

case 96:
//C
this.state = 97;
 BA.debugLineNum = 585;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),b4i_main.__c.runMethod(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 586;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;

case 97:
//C
this.state = 140;
;
 BA.debugLineNum = 588;BA.debugLine="cantidadProduto = cantidadProduto + 1";
Debug.ShouldStop(2048);
parent._cantidadproduto = RemoteObject.solve(new RemoteObject[] {parent._cantidadproduto,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 589;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(4096);
parent._lblcantidadproductos.runMethod(true,"setText:",BA.NumberToString(parent._cantidadproduto));
 BA.debugLineNum = 590;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(8192);
parent._lblcantidadproductos.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 591;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
Debug.ShouldStop(16384);
parent._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto agregado al carrito.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 if (true) break;

case 99:
//C
this.state = 140;
 BA.debugLineNum = 595;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(262144);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 596;BA.debugLine="mapEmpresaInfo = list.Get(0)";
Debug.ShouldStop(524288);
parent._mapempresainfo = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 598;BA.debugLine="IsUsa = mapEmpresaInfo.Get(\"f_adressusa\")";
Debug.ShouldStop(2097152);
parent._isusa = BA.ObjectToBoolean(parent._mapempresainfo.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_adressusa")))));
 if (true) break;

case 101:
//C
this.state = 102;
 BA.debugLineNum = 602;BA.debugLine="If listafavoritos.IsInitialized Then";
Debug.ShouldStop(33554432);
if (true) break;

case 102:
//if
this.state = 105;
if (parent._listafavoritos.runMethod(true,"IsInitialized").getBoolean()) { 
this.state = 104;
}if (true) break;

case 104:
//C
this.state = 105;
 BA.debugLineNum = 603;BA.debugLine="listafavoritos.Clear";
Debug.ShouldStop(67108864);
parent._listafavoritos.runVoidMethod ("Clear");
 if (true) break;

case 105:
//C
this.state = 106;
;
 BA.debugLineNum = 606;BA.debugLine="listafavoritos = map.Get(\"f_data\")";
Debug.ShouldStop(536870912);
parent._listafavoritos.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 608;BA.debugLine="buscarfavoritosvar = False";
Debug.ShouldStop(-2147483648);
parent._buscarfavoritosvar = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 611;BA.debugLine="If CargarAgain Then";
Debug.ShouldStop(4);
if (true) break;

case 106:
//if
this.state = 109;
if (parent._cargaragain.getBoolean()) { 
this.state = 108;
}if (true) break;

case 108:
//C
this.state = 109;
 BA.debugLineNum = 612;BA.debugLine="cargarDatos";
Debug.ShouldStop(8);
_cargardatos();
 BA.debugLineNum = 613;BA.debugLine="CargarAgain = False";
Debug.ShouldStop(16);
parent._cargaragain = b4i_main.__c.runMethod(true,"False");
 if (true) break;

case 109:
//C
this.state = 140;
;
 if (true) break;

case 111:
//C
this.state = 112;
 BA.debugLineNum = 619;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(1024);
if (true) break;

case 112:
//if
this.state = 117;
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
this.state = 114;
}else {
this.state = 116;
}if (true) break;

case 114:
//C
this.state = 117;
 BA.debugLineNum = 621;BA.debugLine="listafavoritos.Add(mapaDetalleImagen)";
Debug.ShouldStop(4096);
parent._listafavoritos.runVoidMethod ("Add:",(Object)((parent._mapadetalleimagen)));
 BA.debugLineNum = 623;BA.debugLine="Sleep(100)";
Debug.ShouldStop(16384);
b4i_main.__c.runVoidMethod ("Sleep:::",b4i_main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "jobdone"),BA.numberCast(int.class, 100));
this.state = 149;
return;
case 149:
//C
this.state = 117;
;
 BA.debugLineNum = 625;BA.debugLine="hud.ToastMessageShow(\"Producto agregado a favo";
Debug.ShouldStop(65536);
parent._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto agregado a favoritos")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 627;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(262144);
_buscarfavoritos();
 if (true) break;

case 116:
//C
this.state = 117;
 BA.debugLineNum = 629;BA.debugLine="hud.ToastMessageShow(\"Error al agregar su prod";
Debug.ShouldStop(1048576);
parent._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Error al agregar su producto a favoritos")),(Object)(b4i_main.__c.runMethod(true,"False")));
 if (true) break;

case 117:
//C
this.state = 140;
;
 if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 634;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(33554432);
if (true) break;

case 120:
//if
this.state = 133;
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
this.state = 122;
}else {
this.state = 132;
}if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 636;BA.debugLine="For i=0 To listafavoritos.Size-1";
Debug.ShouldStop(134217728);
if (true) break;

case 123:
//for
this.state = 130;
step162 = 1;
limit162 = RemoteObject.solve(new RemoteObject[] {parent._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 150;
if (true) break;

case 150:
//C
this.state = 130;
if ((step162 > 0 && _i <= limit162) || (step162 < 0 && _i >= limit162)) this.state = 125;
if (true) break;

case 151:
//C
this.state = 150;
_i = ((int)(0 + _i + step162)) ;
Debug.locals.put("i", _i);
if (true) break;

case 125:
//C
this.state = 126;
 BA.debugLineNum = 638;BA.debugLine="Dim map As Map = listafavoritos.Get(i)";
Debug.ShouldStop(536870912);
_map = (parent._listafavoritos.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 640;BA.debugLine="If map.Get(\"f_idrecord\") == mapaDetalleImagen";
Debug.ShouldStop(-2147483648);
if (true) break;

case 126:
//if
this.state = 129;
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),parent._mapadetalleimagen.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idproducto")))))) { 
this.state = 128;
}if (true) break;

case 128:
//C
this.state = 129;
 BA.debugLineNum = 641;BA.debugLine="listafavoritos.RemoveAt(i)";
Debug.ShouldStop(1);
parent._listafavoritos.runVoidMethod ("RemoveAt:",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 642;BA.debugLine="i = listafavoritos.Size";
Debug.ShouldStop(2);
_i = parent._listafavoritos.runMethod(true,"Size").<Number>get().intValue();Debug.locals.put("i", _i);
 if (true) break;

case 129:
//C
this.state = 151;
;
 if (true) break;
if (true) break;

case 130:
//C
this.state = 133;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 646;BA.debugLine="Sleep(100)";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethod ("Sleep:::",b4i_main.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "main", "jobdone"),BA.numberCast(int.class, 100));
this.state = 152;
return;
case 152:
//C
this.state = 133;
;
 BA.debugLineNum = 648;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado de fa";
Debug.ShouldStop(128);
parent._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto eliminado de favorito")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 649;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(256);
_buscarfavoritos();
 if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 651;BA.debugLine="hud.ToastMessageShow(\"Hubo un error a remover";
Debug.ShouldStop(1024);
parent._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Hubo un error a remover este producto de su lista de favritos")),(Object)(b4i_main.__c.runMethod(true,"False")));
 if (true) break;

case 133:
//C
this.state = 140;
;
 if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 656;BA.debugLine="cantidadProduto = map.Get(\"f_data\")";
Debug.ShouldStop(32768);
parent._cantidadproduto = BA.numberCast(int.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 658;BA.debugLine="If cantidadProduto <> 0 Then";
Debug.ShouldStop(131072);
if (true) break;

case 136:
//if
this.state = 139;
if (RemoteObject.solveBoolean("!",parent._cantidadproduto,BA.numberCast(double.class, 0))) { 
this.state = 138;
}if (true) break;

case 138:
//C
this.state = 139;
 BA.debugLineNum = 660;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(524288);
parent._lblcantidadproductos.runMethod(true,"setText:",BA.NumberToString(parent._cantidadproduto));
 BA.debugLineNum = 661;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(1048576);
parent._lblcantidadproductos.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 if (true) break;

case 139:
//C
this.state = 140;
;
 if (true) break;

case 140:
//C
this.state = -1;
;
 BA.debugLineNum = 667;BA.debugLine="End Sub";
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
public static RemoteObject  _listabusquedapro_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListaBusquedaPro_ItemClick (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1461);
if (RapidSub.canDelegate("listabusquedapro_itemclick")) { return b4i_main.remoteMe.runUserSub(false, "main","listabusquedapro_itemclick", _index, _value);}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _bmimgfav = RemoteObject.declareNull("B4IBitmap");
int _i = 0;
RemoteObject _mimap = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1461;BA.debugLine="Sub ListaBusquedaPro_ItemClick (Index As Int, Valu";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1463;BA.debugLine="Dim mapa As Map = Value";
Debug.ShouldStop(4194304);
_mapa = (_value);Debug.locals.put("mapa", _mapa);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 1464;BA.debugLine="mapaDetalle = mapa";
Debug.ShouldStop(8388608);
b4i_main._mapadetalle = _mapa;
 BA.debugLineNum = 1466;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",b4i_main._panelfondodetalles.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 1467;BA.debugLine="pageDetalle.Initialize(\"pageDetalle\")";
Debug.ShouldStop(67108864);
b4i_main._pagedetalle.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("pageDetalle")));
 BA.debugLineNum = 1469;BA.debugLine="pageDetalle.RootPanel.LoadLayout(\"frmDetalleProd";
Debug.ShouldStop(268435456);
b4i_main._pagedetalle.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDetalleProducto")),b4i_main.ba);
 };
 BA.debugLineNum = 1472;BA.debugLine="NavControl.ShowPage2(pageDetalle,True)";
Debug.ShouldStop(-2147483648);
b4i_main._navcontrol.runVoidMethod ("ShowPage2::",(Object)(((b4i_main._pagedetalle).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1474;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(2);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1476;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_fo";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 1477;BA.debugLine="ImageViewDetalles.Bitmap = funciones.getImagen(m";
Debug.ShouldStop(16);
b4i_main._imageviewdetalles.runMethod(false,"setBitmap:",b4i_main._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))))));
 }else {
 BA.debugLineNum = 1480;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(128);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 BA.debugLineNum = 1481;BA.debugLine="ImageViewDetalles.Bitmap = bm";
Debug.ShouldStop(256);
b4i_main._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 };
 BA.debugLineNum = 1485;BA.debugLine="Dim bmimgfav As Bitmap";
Debug.ShouldStop(4096);
_bmimgfav = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmimgfav", _bmimgfav);
 BA.debugLineNum = 1487;BA.debugLine="If isLoged Then";
Debug.ShouldStop(16384);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1489;BA.debugLine="For i=0 To listafavoritos.Size-1";
Debug.ShouldStop(65536);
{
final int step17 = 1;
final int limit17 = RemoteObject.solve(new RemoteObject[] {b4i_main._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step17 > 0 && _i <= limit17) || (step17 < 0 && _i >= limit17) ;_i = ((int)(0 + _i + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1491;BA.debugLine="Dim mimap As Map = listafavoritos.Get(i)";
Debug.ShouldStop(262144);
_mimap = (b4i_main._listafavoritos.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mimap", _mimap);Debug.locals.put("mimap", _mimap);
 BA.debugLineNum = 1493;BA.debugLine="If mapa.Get(\"f_idrecord\") == mimap.Get(\"f_idrec";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mimap.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 1494;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartRed.p";
Debug.ShouldStop(2097152);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png")));
 BA.debugLineNum = 1495;BA.debugLine="i = listafavoritos.Size";
Debug.ShouldStop(4194304);
_i = b4i_main._listafavoritos.runMethod(true,"Size").<Number>get().intValue();Debug.locals.put("i", _i);
 BA.debugLineNum = 1496;BA.debugLine="imgdetallefav.Tag = True";
Debug.ShouldStop(8388608);
b4i_main._imgdetallefav.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"True")));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1503;BA.debugLine="If bmimgfav.IsInitialized == False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 1504;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartWhitean";
Debug.ShouldStop(-2147483648);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png")));
 BA.debugLineNum = 1505;BA.debugLine="imgdetallefav.Tag = False";
Debug.ShouldStop(1);
b4i_main._imgdetallefav.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 1508;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
Debug.ShouldStop(8);
b4i_main._imgdetallefav.runMethod(false,"setBitmap:",_bmimgfav);
 BA.debugLineNum = 1511;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
Debug.ShouldStop(64);
b4i_main._btnagregarcarritodetalle.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1512;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
Debug.ShouldStop(128);
b4i_main._panelimagendetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1513;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
Debug.ShouldStop(256);
b4i_main._panellblcantidad.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1514;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
Debug.ShouldStop(512);
b4i_main._panelencabezadodetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1516;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(2048);
b4i_main._lblprecioencabezado.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1517;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(4096);
b4i_main._lblnombeencabezado.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 1518;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(8192);
b4i_main._lblcantidad.runMethod(true,"setText:",BA.NumberToString(1));
 BA.debugLineNum = 1519;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
Debug.ShouldStop(16384);
b4i_main._steppercantidad.runMethod(true,"setValue:",BA.numberCast(double.class, b4i_main._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 1520;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(32768);
b4i_main._lblprecio.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1523;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("ListProductosModalView_SelectedChanged (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1260);
if (RapidSub.canDelegate("listproductosmodalview_selectedchanged")) { return b4i_main.remoteMe.runUserSub(false, "main","listproductosmodalview_selectedchanged", _sectionindex, _cell);}
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 1260;BA.debugLine="Sub ListProductosModalView_SelectedChanged (Sectio";
Debug.ShouldStop(2048);
 BA.debugLineNum = 1262;BA.debugLine="Msgbox(\"HOLA\",\"MUNDO\")";
Debug.ShouldStop(8192);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("HOLA")),(Object)(RemoteObject.createImmutable("MUNDO")));
 BA.debugLineNum = 1263;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Msg1_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1126);
if (RapidSub.canDelegate("msg1_click")) { return b4i_main.remoteMe.runUserSub(false, "main","msg1_click", _buttontext);}
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 1126;BA.debugLine="Sub Msg1_Click(ButtonText As String)";
Debug.ShouldStop(32);
 BA.debugLineNum = 1128;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 1130;BA.debugLine="If smc.Tag <> \"inicio\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("!",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1131;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(1024);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 1135;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(16384);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1136;BA.debugLine="Login.Initialize";
Debug.ShouldStop(32768);
b4i_main._login.runVoidMethod ("_initialize" /*RemoteObject*/ );
 }else 
{ BA.debugLineNum = 1138;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 1139;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 1142;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgaddfav_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgAddFav_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1209);
if (RapidSub.canDelegate("msgaddfav_click")) { return b4i_main.remoteMe.runUserSub(false, "main","msgaddfav_click", _buttontext);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _putfavoritos = RemoteObject.declareNull("b4i_httpjob");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 1209;BA.debugLine="Sub MsgAddFav_Click(ButtonText As String)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 1211;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 1213;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData.";
Debug.ShouldStop(268435456);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_main._usersdata.getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),b4i_main._mapadetalle.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1216;BA.debugLine="Dim putFavoritos As HttpJob";
Debug.ShouldStop(-2147483648);
_putfavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("putFavoritos", _putfavoritos);
 BA.debugLineNum = 1217;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
Debug.ShouldStop(1);
_putfavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("addFavoritos")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 1218;BA.debugLine="putFavoritos.PostString(url&\"puntoventa/addfav\",";
Debug.ShouldStop(2);
_putfavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/addfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(_json)))));
 BA.debugLineNum = 1220;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(8);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1221;BA.debugLine="bm.Initialize(File.DirAssets,\"heartred.png\")";
Debug.ShouldStop(16);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartred.png")));
 BA.debugLineNum = 1222;BA.debugLine="CargarAgain = True";
Debug.ShouldStop(32);
b4i_main._cargaragain = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 1223;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(64);
_buscarfavoritos();
 BA.debugLineNum = 1224;BA.debugLine="imgdetallefav.Bitmap = bm";
Debug.ShouldStop(128);
b4i_main._imgdetallefav.runMethod(false,"setBitmap:",_bm);
 }else 
{ BA.debugLineNum = 1226;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 1227;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 1230;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgcerrarsesion_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgCerrarSesion_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1294);
if (RapidSub.canDelegate("msgcerrarsesion_click")) { return b4i_main.remoteMe.runUserSub(false, "main","msgcerrarsesion_click", _buttontext);}
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 1294;BA.debugLine="Sub MsgCerrarSesion_Click(ButtonText As String)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 1296;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 1297;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(65536);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1298;BA.debugLine="isLoged = False";
Debug.ShouldStop(131072);
b4i_main._isloged = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 1299;BA.debugLine="reload = True";
Debug.ShouldStop(262144);
b4i_main._reload = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 1301;BA.debugLine="lblNombreUser.Text = \"Público\"";
Debug.ShouldStop(1048576);
b4i_main._lblnombreuser.runMethod(true,"setText:",BA.ObjectToString("Público"));
 BA.debugLineNum = 1302;BA.debugLine="lblEmailUser.Text = \"\"";
Debug.ShouldStop(2097152);
b4i_main._lblemailuser.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 1303;BA.debugLine="Login.Initialize";
Debug.ShouldStop(4194304);
b4i_main._login.runVoidMethod ("_initialize" /*RemoteObject*/ );
 BA.debugLineNum = 1304;BA.debugLine="Panel7.Visible = False";
Debug.ShouldStop(8388608);
b4i_main._panel7.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 }else 
{ BA.debugLineNum = 1306;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 1307;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 1310;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgdeletefav_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgDeleteFav_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1186);
if (RapidSub.canDelegate("msgdeletefav_click")) { return b4i_main.remoteMe.runUserSub(false, "main","msgdeletefav_click", _buttontext);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _deletefavoritos = RemoteObject.declareNull("b4i_httpjob");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 1186;BA.debugLine="Sub MsgDeleteFav_Click(ButtonText As String)";
Debug.ShouldStop(2);
 BA.debugLineNum = 1188;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 1190;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData.";
Debug.ShouldStop(32);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_main._usersdata.getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),b4i_main._mapadetalle.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1193;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(256);
_deletefavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 1194;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me)";
Debug.ShouldStop(512);
_deletefavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 1195;BA.debugLine="deleteFavoritos.PostString(url&\"puntoventa/delet";
Debug.ShouldStop(1024);
_deletefavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._token),(Object)(_json)))));
 BA.debugLineNum = 1197;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(4096);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1198;BA.debugLine="bm.Initialize(File.DirAssets,\"heartwhiteandblack";
Debug.ShouldStop(8192);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartwhiteandblack.png")));
 BA.debugLineNum = 1199;BA.debugLine="CargarAgain = True";
Debug.ShouldStop(16384);
b4i_main._cargaragain = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 1200;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(32768);
_buscarfavoritos();
 BA.debugLineNum = 1201;BA.debugLine="imgdetallefav.Bitmap = bm";
Debug.ShouldStop(65536);
b4i_main._imgdetallefav.runMethod(false,"setBitmap:",_bm);
 }else 
{ BA.debugLineNum = 1203;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 1204;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 1207;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _page1_click() throws Exception{
try {
		Debug.PushSubsStack("Page1_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,272);
if (RapidSub.canDelegate("page1_click")) { return b4i_main.remoteMe.runUserSub(false, "main","page1_click");}
 BA.debugLineNum = 272;BA.debugLine="Sub Page1_Click";
Debug.ShouldStop(32768);
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
public static RemoteObject  _page1_resize(RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Page1_Resize (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,265);
if (RapidSub.canDelegate("page1_resize")) { return b4i_main.remoteMe.runUserSub(false, "main","page1_resize", _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 265;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
Debug.ShouldStop(256);
 BA.debugLineNum = 268;BA.debugLine="ViewCategoria.ContentWidth =  PanelCategoria.Widt";
Debug.ShouldStop(2048);
b4i_main._viewcategoria.runMethod(true,"setContentWidth:",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_main._panelcategoria.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0)));
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Panel1_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1266);
if (RapidSub.canDelegate("panel1_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel1_click");}
 BA.debugLineNum = 1266;BA.debugLine="Sub Panel1_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1268;BA.debugLine="If smc.Tag == \"inicio\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1269;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(1048576);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 1272;BA.debugLine="If smc.Tag == \"login\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("login")))) { 
 BA.debugLineNum = 1273;BA.debugLine="Initialize";
Debug.ShouldStop(16777216);
_initialize();
 }else {
 BA.debugLineNum = 1275;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(67108864);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 1276;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(134217728);
b4i_main._smc.runVoidMethod ("CloseMenu");
 };
 };
 BA.debugLineNum = 1281;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel2_click() throws Exception{
try {
		Debug.PushSubsStack("Panel2_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1373);
if (RapidSub.canDelegate("panel2_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel2_click");}
 BA.debugLineNum = 1373;BA.debugLine="Sub Panel2_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1375;BA.debugLine="If smc.Tag == \"categoria\" Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("categoria")))) { 
 BA.debugLineNum = 1376;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(-2147483648);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 1379;BA.debugLine="If smc.Tag <> \"inicio\" Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("!",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1380;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(8);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 1382;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(32);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1383;BA.debugLine="Categoria.Initialize";
Debug.ShouldStop(64);
b4i_main._categoria.runVoidMethod ("_initialize" /*RemoteObject*/ );
 };
 BA.debugLineNum = 1387;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("Panel3_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1353);
if (RapidSub.canDelegate("panel3_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel3_click");}
 BA.debugLineNum = 1353;BA.debugLine="Sub Panel3_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1355;BA.debugLine="If isLoged Then";
Debug.ShouldStop(1024);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1357;BA.debugLine="If smc.Tag == \"favoritos\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("favoritos")))) { 
 BA.debugLineNum = 1358;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(8192);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 1361;BA.debugLine="If smc.Tag <> \"inicio\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("!",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1362;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(131072);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 1364;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(524288);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1365;BA.debugLine="Favoritos.Initilize";
Debug.ShouldStop(1048576);
b4i_main._favoritos.runVoidMethod ("_initilize" /*RemoteObject*/ );
 };
 }else {
 BA.debugLineNum = 1368;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
Debug.ShouldStop(8388608);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Para agregar un producto a favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1371;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel4_click() throws Exception{
try {
		Debug.PushSubsStack("Panel4_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1333);
if (RapidSub.canDelegate("panel4_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel4_click");}
 BA.debugLineNum = 1333;BA.debugLine="Sub Panel4_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 1335;BA.debugLine="If isLoged Then";
Debug.ShouldStop(4194304);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1337;BA.debugLine="If smc.Tag == \"direcciones\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("direcciones")))) { 
 BA.debugLineNum = 1338;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(33554432);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 1341;BA.debugLine="If smc.Tag <> \"inicio\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("!",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1342;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(536870912);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 1344;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(-2147483648);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1345;BA.debugLine="Direcciones.Initialize";
Debug.ShouldStop(1);
b4i_main._direcciones.runVoidMethod ("_initialize" /*RemoteObject*/ );
 };
 }else {
 BA.debugLineNum = 1348;BA.debugLine="Msgbox2(\"Msg1\",\"Antes de ver sus direcciones tie";
Debug.ShouldStop(8);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Antes de ver sus direcciones tiene que iniciar sesion")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1351;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel5_click() throws Exception{
try {
		Debug.PushSubsStack("Panel5_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1389);
if (RapidSub.canDelegate("panel5_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel5_click");}
 BA.debugLineNum = 1389;BA.debugLine="Sub Panel5_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 1391;BA.debugLine="If isLoged Then";
Debug.ShouldStop(16384);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1393;BA.debugLine="If smc.Tag == \"reporte\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("reporte")))) { 
 BA.debugLineNum = 1394;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(131072);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 1397;BA.debugLine="If smc.Tag <> \"inicio\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("!",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1398;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(2097152);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 1400;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(8388608);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1401;BA.debugLine="Reportes.Initialize";
Debug.ShouldStop(16777216);
b4i_main._reportes.runVoidMethod ("_initialize" /*RemoteObject*/ );
 };
 }else {
 BA.debugLineNum = 1405;BA.debugLine="Msgbox2(\"Msg1\",\"Antes de ver sus ordenes tiene q";
Debug.ShouldStop(268435456);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Antes de ver sus ordenes tiene que iniciar sesion")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1409;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel6_click() throws Exception{
try {
		Debug.PushSubsStack("Panel6_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1312);
if (RapidSub.canDelegate("panel6_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel6_click");}
 BA.debugLineNum = 1312;BA.debugLine="Sub Panel6_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1314;BA.debugLine="If smc.Tag == \"about\" Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("about")))) { 
 BA.debugLineNum = 1315;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(4);
b4i_main._smc.runVoidMethod ("CloseMenu");
 }else {
 BA.debugLineNum = 1317;BA.debugLine="pageAboutUs.Initialize(\"pageAboutUs\")";
Debug.ShouldStop(16);
b4i_main._pageaboutus.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("pageAboutUs")));
 BA.debugLineNum = 1318;BA.debugLine="pageAboutUs.RootPanel.LoadLayout(\"frmAboutsUs\")";
Debug.ShouldStop(32);
b4i_main._pageaboutus.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmAboutsUs")),b4i_main.ba);
 BA.debugLineNum = 1320;BA.debugLine="If smc.Tag <> \"inicio\" Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("!",b4i_main._smc.runMethod(false,"Tag"),RemoteObject.createImmutable(("inicio")))) { 
 BA.debugLineNum = 1321;BA.debugLine="NavControl.RemoveCurrentPage";
Debug.ShouldStop(256);
b4i_main._navcontrol.runVoidMethod ("RemoveCurrentPage");
 };
 BA.debugLineNum = 1325;BA.debugLine="smc.Tag = \"about\"";
Debug.ShouldStop(4096);
b4i_main._smc.runMethod(false,"setTag:",RemoteObject.createImmutable(("about")));
 BA.debugLineNum = 1327;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(16384);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1328;BA.debugLine="NavControl.ShowPage2(pageAboutUs,True)";
Debug.ShouldStop(32768);
b4i_main._navcontrol.runVoidMethod ("ShowPage2::",(Object)(((b4i_main._pageaboutus).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 };
 BA.debugLineNum = 1331;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel7_click() throws Exception{
try {
		Debug.PushSubsStack("Panel7_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1283);
if (RapidSub.canDelegate("panel7_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panel7_click");}
 BA.debugLineNum = 1283;BA.debugLine="Sub Panel7_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 1285;BA.debugLine="If isLoged Then";
Debug.ShouldStop(16);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1286;BA.debugLine="Msgbox2(\"MsgCerrarSesion\",\"Desea cerrar sesion?\"";
Debug.ShouldStop(32);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("MsgCerrarSesion")),(Object)(BA.ObjectToString("Desea cerrar sesion?")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 }else {
 BA.debugLineNum = 1288;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(128);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1289;BA.debugLine="btnIniciarSecion_Click";
Debug.ShouldStop(256);
_btniniciarsecion_click();
 };
 BA.debugLineNum = 1292;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelfondopro_click() throws Exception{
try {
		Debug.PushSubsStack("PanelFondoPro_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,979);
if (RapidSub.canDelegate("panelfondopro_click")) { return b4i_main.remoteMe.runUserSub(false, "main","panelfondopro_click");}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _b = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _bmimgfav = RemoteObject.declareNull("B4IBitmap");
int _i = 0;
RemoteObject _mimap = RemoteObject.declareNull("B4IMap");
 BA.debugLineNum = 979;BA.debugLine="Sub PanelFondoPro_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 981;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(1048576);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 982;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(2097152);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 984;BA.debugLine="Dim b As Panel";
Debug.ShouldStop(8388608);
_b = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 985;BA.debugLine="b = Sender";
Debug.ShouldStop(16777216);
_b.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_main.ba));
 BA.debugLineNum = 987;BA.debugLine="mapa = b.Tag";
Debug.ShouldStop(67108864);
_mapa = (_b.runMethod(false,"Tag"));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 988;BA.debugLine="mapaDetalle = mapa";
Debug.ShouldStop(134217728);
b4i_main._mapadetalle = _mapa;
 BA.debugLineNum = 990;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",b4i_main._panelfondodetalles.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 991;BA.debugLine="pageDetalle.Initialize(\"pageDetalle\")";
Debug.ShouldStop(1073741824);
b4i_main._pagedetalle.runVoidMethod ("Initialize::",b4i_main.ba,(Object)(RemoteObject.createImmutable("pageDetalle")));
 BA.debugLineNum = 993;BA.debugLine="pageDetalle.RootPanel.LoadLayout(\"frmDetalleProd";
Debug.ShouldStop(1);
b4i_main._pagedetalle.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDetalleProducto")),b4i_main.ba);
 };
 BA.debugLineNum = 996;BA.debugLine="NavControl.ShowPage2(pageDetalle,True)";
Debug.ShouldStop(8);
b4i_main._navcontrol.runVoidMethod ("ShowPage2::",(Object)(((b4i_main._pagedetalle).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 998;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(32);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1000;BA.debugLine="If mapa.Get(\"f_destacado\") Then";
Debug.ShouldStop(128);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_destacado"))))).getBoolean()) { 
 BA.debugLineNum = 1002;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_fo";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 1003;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(1024);
_bm = b4i_main._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1005;BA.debugLine="ImageViewDetalles.Bitmap= bm";
Debug.ShouldStop(4096);
b4i_main._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 }else {
 BA.debugLineNum = 1009;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(65536);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 BA.debugLineNum = 1011;BA.debugLine="ImageViewDetalles.Bitmap = bm";
Debug.ShouldStop(262144);
b4i_main._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 };
 }else {
 BA.debugLineNum = 1015;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 1018;BA.debugLine="ImageViewDetalles.Bitmap = funciones.getImagen(";
Debug.ShouldStop(33554432);
b4i_main._imageviewdetalles.runMethod(false,"setBitmap:",b4i_main._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))))));
 }else {
 BA.debugLineNum = 1021;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(268435456);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 BA.debugLineNum = 1023;BA.debugLine="ImageViewDetalles.Bitmap = bm";
Debug.ShouldStop(1073741824);
b4i_main._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 };
 };
 BA.debugLineNum = 1030;BA.debugLine="Dim bmimgfav As Bitmap";
Debug.ShouldStop(32);
_bmimgfav = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmimgfav", _bmimgfav);
 BA.debugLineNum = 1032;BA.debugLine="If isLoged Then";
Debug.ShouldStop(128);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1034;BA.debugLine="For i=0 To listafavoritos.Size-1";
Debug.ShouldStop(512);
{
final int step31 = 1;
final int limit31 = RemoteObject.solve(new RemoteObject[] {b4i_main._listafavoritos.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step31 > 0 && _i <= limit31) || (step31 < 0 && _i >= limit31) ;_i = ((int)(0 + _i + step31))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1036;BA.debugLine="Dim mimap As Map = listafavoritos.Get(i)";
Debug.ShouldStop(2048);
_mimap = (b4i_main._listafavoritos.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mimap", _mimap);Debug.locals.put("mimap", _mimap);
 BA.debugLineNum = 1038;BA.debugLine="If mapa.Get(\"f_idrecord\") == mimap.Get(\"f_idrec";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mimap.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 1039;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartRed.p";
Debug.ShouldStop(16384);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png")));
 BA.debugLineNum = 1040;BA.debugLine="i = listafavoritos.Size";
Debug.ShouldStop(32768);
_i = b4i_main._listafavoritos.runMethod(true,"Size").<Number>get().intValue();Debug.locals.put("i", _i);
 BA.debugLineNum = 1041;BA.debugLine="imgdetallefav.Tag = True";
Debug.ShouldStop(65536);
b4i_main._imgdetallefav.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"True")));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 1048;BA.debugLine="If bmimgfav.IsInitialized == False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 1049;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartWhitean";
Debug.ShouldStop(16777216);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png")));
 BA.debugLineNum = 1050;BA.debugLine="imgdetallefav.Tag = False";
Debug.ShouldStop(33554432);
b4i_main._imgdetallefav.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 1053;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
Debug.ShouldStop(268435456);
b4i_main._imgdetallefav.runMethod(false,"setBitmap:",_bmimgfav);
 BA.debugLineNum = 1057;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
Debug.ShouldStop(1);
b4i_main._btnagregarcarritodetalle.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1058;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
Debug.ShouldStop(2);
b4i_main._panelimagendetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1059;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
Debug.ShouldStop(4);
b4i_main._panellblcantidad.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1060;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
Debug.ShouldStop(8);
b4i_main._panelencabezadodetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 1062;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(32);
b4i_main._lblprecioencabezado.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1063;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(64);
b4i_main._lblnombeencabezado.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 1064;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(128);
b4i_main._lblcantidad.runMethod(true,"setText:",BA.NumberToString(1));
 BA.debugLineNum = 1065;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
Debug.ShouldStop(256);
b4i_main._steppercantidad.runMethod(true,"setValue:",BA.numberCast(double.class, b4i_main._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 1066;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(512);
b4i_main._lblprecio.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 1070;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _paneluser_click() throws Exception{
try {
		Debug.PushSubsStack("PanelUser_Click (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1437);
if (RapidSub.canDelegate("paneluser_click")) { return b4i_main.remoteMe.runUserSub(false, "main","paneluser_click");}
 BA.debugLineNum = 1437;BA.debugLine="Sub PanelUser_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1439;BA.debugLine="If isLoged Then";
Debug.ShouldStop(1073741824);
if (b4i_main._isloged.getBoolean()) { 
 BA.debugLineNum = 1440;BA.debugLine="smc.CloseMenu";
Debug.ShouldStop(-2147483648);
b4i_main._smc.runVoidMethod ("CloseMenu");
 BA.debugLineNum = 1441;BA.debugLine="Perfil.Initialize";
Debug.ShouldStop(1);
b4i_main._perfil.runVoidMethod ("_initialize" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 1443;BA.debugLine="Msgbox2(\"Msg1\",\"Para editar su perfil tiene que";
Debug.ShouldStop(4);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_main.ba,(Object)(BA.ObjectToString("Msg1")),(Object)(BA.ObjectToString("Para editar su perfil tiene que iniciar sesion")),(Object)(BA.ObjectToString("Advertencia")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 1446;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 19;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 22;BA.debugLine="Public App As Application";
b4i_main._app = RemoteObject.createNew ("B4IApplicationWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Public NavControl As NavigationController";
b4i_main._navcontrol = RemoteObject.createNew ("B4INavigationControllerWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private Page1 As Page";
b4i_main._page1 = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 25;BA.debugLine="Private pageDetalle As Page";
b4i_main._pagedetalle = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 26;BA.debugLine="Private pageAboutUs As Page";
b4i_main._pageaboutus = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 29;BA.debugLine="Dim tokenPublico As String = \"dbea1e74de894c3a37f";
b4i_main._tokenpublico = BA.ObjectToString("dbea1e74de894c3a37f4696a10ed6dd7");
 //BA.debugLineNum = 30;BA.debugLine="Dim token As String";
b4i_main._token = RemoteObject.createImmutable("");
 //BA.debugLineNum = 31;BA.debugLine="Dim isLoged As Boolean = False";
b4i_main._isloged = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 32;BA.debugLine="Dim listafavoritos As List";
b4i_main._listafavoritos = RemoteObject.createNew ("B4IList");
 //BA.debugLineNum = 33;BA.debugLine="Dim mapEmpresaInfo As Map = Null";
b4i_main._mapempresainfo = (b4i_main.__c.runMethod(false,"Null"));
 //BA.debugLineNum = 34;BA.debugLine="Dim url As String '= \"http://10.0.0.108:8010/menu";
b4i_main._url = RemoteObject.createImmutable("");
 //BA.debugLineNum = 36;BA.debugLine="Dim idEmpresa As Int = 1053 '1000";
b4i_main._idempresa = BA.numberCast(int.class, 1053);
 //BA.debugLineNum = 37;BA.debugLine="Dim jobMsj As String = \"No se pudo conectar con e";
b4i_main._jobmsj = BA.ObjectToString("No se pudo conectar con el servidor. Compruebe su conexión a internet.");
 //BA.debugLineNum = 38;BA.debugLine="Dim jobMsjTitle As String = \"Problemas de conexió";
b4i_main._jobmsjtitle = BA.ObjectToString("Problemas de conexión");
 //BA.debugLineNum = 39;BA.debugLine="Dim impuestoIncluido As Boolean = True";
b4i_main._impuestoincluido = b4i_main.__c.runMethod(true,"True");
 //BA.debugLineNum = 40;BA.debugLine="Dim cantidadProduto As Int = 0";
b4i_main._cantidadproduto = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 41;BA.debugLine="Dim mapaDetalle As Map";
b4i_main._mapadetalle = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 42;BA.debugLine="Dim SQL As SQL";
b4i_main._sql = RemoteObject.createNew ("B4ISQL");
 //BA.debugLineNum = 43;BA.debugLine="Dim  imei As String";
b4i_main._imei = RemoteObject.createImmutable("");
 //BA.debugLineNum = 44;BA.debugLine="Dim operadora As String";
b4i_main._operadora = RemoteObject.createImmutable("");
 //BA.debugLineNum = 45;BA.debugLine="Dim CargarAgain As Boolean = True";
b4i_main._cargaragain = b4i_main.__c.runMethod(true,"True");
 //BA.debugLineNum = 46;BA.debugLine="Dim reload As Boolean = False";
b4i_main._reload = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 49;BA.debugLine="Type typeU (idUsuario As Int, nombre As String, l";
;
 //BA.debugLineNum = 50;BA.debugLine="Dim usersData As typeU";
b4i_main._usersdata = RemoteObject.createNew ("_typeu");
 //BA.debugLineNum = 52;BA.debugLine="Dim IsUsa As Boolean = False";
b4i_main._isusa = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 54;BA.debugLine="Dim mapaDetalleImagen As Map";
b4i_main._mapadetalleimagen = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 58;BA.debugLine="Private Drawer As B4XDrawer";
b4i_main._drawer = RemoteObject.createNew ("b4i_b4xdrawer");
 //BA.debugLineNum = 59;BA.debugLine="Private ListSlide As CustomListView";
b4i_main._listslide = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 60;BA.debugLine="Private btnPrincipalBack As Button";
b4i_main._btnprincipalback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private btnBuscarProducto As Button";
b4i_main._btnbuscarproducto = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private btnIniciarSecion As Button";
b4i_main._btniniciarsecion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private btnOrden As Button";
b4i_main._btnorden = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private PanelFooterv2 As Panel";
b4i_main._panelfooterv2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private PanelTitulo As Panel";
b4i_main._paneltitulo = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private lblCantidadProductos As Label";
b4i_main._lblcantidadproductos = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private btnMasVendido As Button";
b4i_main._btnmasvendido = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private PanelSlide As Panel";
b4i_main._panelslide = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private hud As HUD";
b4i_main._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 72;BA.debugLine="Private hud2 As HUD";
b4i_main._hud2 = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 74;BA.debugLine="Private Panel1 As Panel";
b4i_main._panel1 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private txtBuscarProducto As TextField";
b4i_main._txtbuscarproducto = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private btnProductoBuscarModal As Button";
b4i_main._btnproductobuscarmodal = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private PanelProductosModalView As Panel";
b4i_main._panelproductosmodalview = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private btnProductoVolver As Button";
b4i_main._btnproductovolver = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private PanelModalProducto As Panel";
b4i_main._panelmodalproducto = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private ViewCategoria As ScrollView";
b4i_main._viewcategoria = RemoteObject.createNew ("B4IScrollView");
 //BA.debugLineNum = 83;BA.debugLine="Dim Hscroll As ScrollView";
b4i_main._hscroll = RemoteObject.createNew ("B4IScrollView");
 //BA.debugLineNum = 84;BA.debugLine="Private PanelUser As Panel";
b4i_main._paneluser = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private imageUser As ImageView";
b4i_main._imageuser = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Public smc As SideMenuController";
b4i_main._smc = RemoteObject.createNew ("B4ISideMenuController");
 //BA.debugLineNum = 89;BA.debugLine="Private Panel2 As Panel";
b4i_main._panel2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private Panel3 As Panel";
b4i_main._panel3 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private Panel4 As Panel";
b4i_main._panel4 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private Panel5 As Panel";
b4i_main._panel5 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private Panel6 As Panel";
b4i_main._panel6 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private  Panel7 As Panel";
b4i_main._panel7 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private PanelFondoDetalles As Panel";
b4i_main._panelfondodetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private ImageViewDetalles As ImageView";
b4i_main._imageviewdetalles = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 97;BA.debugLine="Private lblPrecioEncabezado As Label";
b4i_main._lblprecioencabezado = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 98;BA.debugLine="Private lblNombeEncabezado As Label";
b4i_main._lblnombeencabezado = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 99;BA.debugLine="Private imgdetallefav As ImageView";
b4i_main._imgdetallefav = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 100;BA.debugLine="Private lblPrecio As Label";
b4i_main._lblprecio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 101;BA.debugLine="Private lblcantidad As Label";
b4i_main._lblcantidad = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 102;BA.debugLine="Private btnBackDetalles As Button";
b4i_main._btnbackdetalles = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 103;BA.debugLine="Private btnagregarCarritoDetalle As Button";
b4i_main._btnagregarcarritodetalle = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 104;BA.debugLine="Private btnless As Button";
b4i_main._btnless = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 105;BA.debugLine="Private btnMore As Button";
b4i_main._btnmore = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 106;BA.debugLine="Private PanelImagenDetalles As Panel";
b4i_main._panelimagendetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 107;BA.debugLine="Private PanellblCantidad As Panel";
b4i_main._panellblcantidad = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 108;BA.debugLine="Private PanelEncabezadoDetalles As Panel";
b4i_main._panelencabezadodetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 109;BA.debugLine="Private btnBackAboutus As Button";
b4i_main._btnbackaboutus = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 112;BA.debugLine="Dim buscarfavoritosvar As Boolean = True";
b4i_main._buscarfavoritosvar = b4i_main.__c.runMethod(true,"True");
 //BA.debugLineNum = 114;BA.debugLine="Private PanelCategoria As Panel";
b4i_main._panelcategoria = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 115;BA.debugLine="Private StepperCantidad As Stepper";
b4i_main._steppercantidad = RemoteObject.createNew ("B4IStepperWrapper");
 //BA.debugLineNum = 116;BA.debugLine="Private lblNombreUser As Label";
b4i_main._lblnombreuser = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 117;BA.debugLine="Private lblEmailUser As Label";
b4i_main._lblemailuser = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 118;BA.debugLine="Private ListaBusquedaPro As CustomListView";
b4i_main._listabusquedapro = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 119;BA.debugLine="Private imgCat As ImageView";
b4i_main._imgcat = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 120;BA.debugLine="Private lblNomCat As Label";
b4i_main._lblnomcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 121;BA.debugLine="Private lblCantCat As Label";
b4i_main._lblcantcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1235);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return b4i_main.remoteMe.runUserSub(false, "main","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 1235;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 1237;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
Debug.ShouldStop(1048576);
_mapcalculos = b4i_main._funciones.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(b4i_main._impuestoincluido),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 1239;BA.debugLine="Dim json As String";
Debug.ShouldStop(4194304);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 1240;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(8388608);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_main._idempresa,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),b4i_main._imei);Debug.locals.put("json", _json);
 BA.debugLineNum = 1254;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(32);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 1255;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(64);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_main.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_main.getObject()));
 BA.debugLineNum = 1256;BA.debugLine="JobDetalleTemporal.PostString(url&\"puntoventa/sal";
Debug.ShouldStop(128);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_main._url,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_main._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_main._tokenpublico),(Object)(_json)))));
 BA.debugLineNum = 1258;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _steppercantidad_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("StepperCantidad_ValueChanged (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,1160);
if (RapidSub.canDelegate("steppercantidad_valuechanged")) { return b4i_main.remoteMe.runUserSub(false, "main","steppercantidad_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1160;BA.debugLine="Sub StepperCantidad_ValueChanged (Value As Double)";
Debug.ShouldStop(128);
 BA.debugLineNum = 1161;BA.debugLine="lblcantidad.Text = Value";
Debug.ShouldStop(256);
b4i_main._lblcantidad.runMethod(true,"setText:",BA.NumberToString(_value));
 BA.debugLineNum = 1162;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtbuscarproducto_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txtBuscarProducto_EnterPressed (main) ","main",0,b4i_main.ba,b4i_main.mostCurrent,370);
if (RapidSub.canDelegate("txtbuscarproducto_enterpressed")) { return b4i_main.remoteMe.runUserSub(false, "main","txtbuscarproducto_enterpressed");}
 BA.debugLineNum = 370;BA.debugLine="Sub txtBuscarProducto_EnterPressed";
Debug.ShouldStop(131072);
 BA.debugLineNum = 372;BA.debugLine="Page1.ResignFocus";
Debug.ShouldStop(524288);
b4i_main._page1.runVoidMethod ("ResignFocus");
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}