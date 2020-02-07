package com.menube.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class principal_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,59);
if (RapidSub.canDelegate("activity_create")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","activity_create", _firsttime);}
RemoteObject _jobempresainfo = RemoteObject.declareNull("com.menube.app.httpjob");
RemoteObject _jobsendcontacts = RemoteObject.declareNull("com.menube.app.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 59;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 62;BA.debugLine="Activity.LoadLayout(\"frmPrincipal\")";
Debug.ShouldStop(536870912);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmPrincipal")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 63;BA.debugLine="lblCantidadProductos.Visible = False";
Debug.ShouldStop(1073741824);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
Debug.ShouldStop(1);
_jobempresainfo = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobEmpresaInfo", _jobempresainfo);
 BA.debugLineNum = 66;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
Debug.ShouldStop(2);
_jobempresainfo.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobEmpresaInfo")),(Object)(principal.getObject()));
 BA.debugLineNum = 67;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos_";
Debug.ShouldStop(4);
_jobempresainfo.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_datos_preferencia"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa))))));
 BA.debugLineNum = 68;BA.debugLine="cantidadProduto = 0";
Debug.ShouldStop(8);
principal._cantidadproduto = BA.numberCast(int.class, 0);
 BA.debugLineNum = 71;BA.debugLine="btnMasVendido.Tag = False";
Debug.ShouldStop(64);
principal.mostCurrent._btnmasvendido.runMethod(false,"setTag",(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 72;BA.debugLine="btnMasVendido_Click";
Debug.ShouldStop(128);
_btnmasvendido_click();
 BA.debugLineNum = 75;BA.debugLine="Dim JobSendContacts As HttpJob";
Debug.ShouldStop(1024);
_jobsendcontacts = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobSendContacts", _jobsendcontacts);
 BA.debugLineNum = 76;BA.debugLine="JobSendContacts.Initialize(\"JobSendUSer\",Me)";
Debug.ShouldStop(2048);
_jobsendcontacts.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobSendUSer")),(Object)(principal.getObject()));
 BA.debugLineNum = 77;BA.debugLine="JobSendContacts.PostString(Main.url&\"login/set_sa";
Debug.ShouldStop(4096);
_jobsendcontacts.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("login/set_salvar_contactos"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_agenda':"),principal.mostCurrent._funcion.runMethod(true,"_getallcontacts" /*RemoteObject*/ ,principal.mostCurrent.activityBA)))))));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("Activity_Pause (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,306);
if (RapidSub.canDelegate("activity_pause")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 306;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("Activity_Resume (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,298);
if (RapidSub.canDelegate("activity_resume")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","activity_resume");}
 BA.debugLineNum = 298;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(512);
 BA.debugLineNum = 299;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(1024);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setText",BA.ObjectToCharSequence(principal._cantidadproduto));
 BA.debugLineNum = 300;BA.debugLine="If cantidadProduto = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",principal._cantidadproduto,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 301;BA.debugLine="lblCantidadProductos.Visible = False";
Debug.ShouldStop(4096);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnBuscarProducto_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,365);
if (RapidSub.canDelegate("btnbuscarproducto_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnbuscarproducto_click");}
 BA.debugLineNum = 365;BA.debugLine="Sub btnBuscarProducto_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 367;BA.debugLine="If PanelModalProducto.IsInitialized = False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelmodalproducto.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 368;BA.debugLine="Activity.LoadLayout(\"frmProducoModal\")";
Debug.ShouldStop(32768);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProducoModal")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 370;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.ItemHei";
Debug.ShouldStop(131072);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 372;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(524288);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 373;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(1048576);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 374;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(2097152);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",principal.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 375;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.P";
Debug.ShouldStop(4194304);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 377;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(16777216);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 378;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(33554432);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",principal.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 379;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(67108864);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 380;BA.debugLine="funcion.SetDivider( ListProductosModalView,Color";
Debug.ShouldStop(134217728);
principal.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._listproductosmodalview),(Object)(principal.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 384;BA.debugLine="PanelModalProducto.Visible = False";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._panelmodalproducto.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 385;BA.debugLine="funcion.DisableView(False,PanelModalProducto)";
Debug.ShouldStop(1);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmodalproducto));
 BA.debugLineNum = 387;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,True)";
Debug.ShouldStop(4);
principal.mostCurrent._panelmodalproducto.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 388;BA.debugLine="funcion.DisableView(True,PanelMenu)";
Debug.ShouldStop(8);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 389;BA.debugLine="txtBuscarProducto.RequestFocus";
Debug.ShouldStop(16);
principal.mostCurrent._txtbuscarproducto.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnempresainfo_click() throws Exception{
try {
		Debug.PushSubsStack("btnEmpresaInfo_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,330);
if (RapidSub.canDelegate("btnempresainfo_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnempresainfo_click");}
 BA.debugLineNum = 330;BA.debugLine="Sub btnEmpresaInfo_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 332;BA.debugLine="If  mapEmpresaInfo.IsInitialized =False Or mapEmp";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",principal._mapempresainfo.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("n",principal._mapempresainfo)) { 
 BA.debugLineNum = 333;BA.debugLine="Msgbox(\"Buscando información del negocio...\",\"In";
Debug.ShouldStop(4096);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Buscando información del negocio...")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 334;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 337;BA.debugLine="If PanelInfoBack.IsInitialized = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelinfoback.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 338;BA.debugLine="Activity.LoadLayout(\"frmInfoEmpresa\")";
Debug.ShouldStop(131072);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmInfoEmpresa")),principal.mostCurrent.activityBA);
 };
 BA.debugLineNum = 340;BA.debugLine="PanelInfoBack.Visible = False";
Debug.ShouldStop(524288);
principal.mostCurrent._panelinfoback.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 341;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,True)";
Debug.ShouldStop(1048576);
principal.mostCurrent._panelinfoback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 343;BA.debugLine="funcion.DisableView(True,PanelMenu)";
Debug.ShouldStop(4194304);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 344;BA.debugLine="funcion.DisableView(False,PanelInfoBack)";
Debug.ShouldStop(8388608);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelinfoback));
 BA.debugLineNum = 346;BA.debugLine="lblInfoEmpresa.Text = mapEmpresaInfo.Get(\"f_nombr";
Debug.ShouldStop(33554432);
principal.mostCurrent._lblinfoempresa.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 347;BA.debugLine="lblInfoNegocio.Text = mapEmpresaInfo.Get(\"f_tipo_";
Debug.ShouldStop(67108864);
principal.mostCurrent._lblinfonegocio.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tipo_negocio"))))));
 BA.debugLineNum = 348;BA.debugLine="lblPedidoMinimo.Text =  \"RD$ \"&mapEmpresaInfo.Get";
Debug.ShouldStop(134217728);
principal.mostCurrent._lblpedidominimo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RD$ "),principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_pedidos_minimos")))))));
 BA.debugLineNum = 349;BA.debugLine="lblTelefono.Text = mapEmpresaInfo.Get(\"f_telefono";
Debug.ShouldStop(268435456);
principal.mostCurrent._lbltelefono.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_telefono"))))));
 BA.debugLineNum = 350;BA.debugLine="lblDireccion.Text = mapEmpresaInfo.Get(\"f_direcci";
Debug.ShouldStop(536870912);
principal.mostCurrent._lbldireccion.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion"))))));
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
public static RemoteObject  _btninfocerrar_click() throws Exception{
try {
		Debug.PushSubsStack("btnInfoCerrar_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,359);
if (RapidSub.canDelegate("btninfocerrar_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btninfocerrar_click");}
 BA.debugLineNum = 359;BA.debugLine="Sub btnInfoCerrar_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 360;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,False)";
Debug.ShouldStop(128);
principal.mostCurrent._panelinfoback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 361;BA.debugLine="funcion.DisableView(False,PanelMenu)";
Debug.ShouldStop(256);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 362;BA.debugLine="funcion.DisableView(True,PanelInfoBack)";
Debug.ShouldStop(512);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelinfoback));
 BA.debugLineNum = 363;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("btnMasVendido_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,315);
if (RapidSub.canDelegate("btnmasvendido_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnmasvendido_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductomasvendido = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 315;BA.debugLine="Sub btnMasVendido_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 317;BA.debugLine="If btnMasVendido.Tag Then";
Debug.ShouldStop(268435456);
if (BA.ObjectToBoolean(principal.mostCurrent._btnmasvendido.runMethod(false,"getTag")).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 318;BA.debugLine="cargarCaterorias";
Debug.ShouldStop(536870912);
_cargarcaterorias();
 }else {
 BA.debugLineNum = 320;BA.debugLine="Dim json As String";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 321;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
Debug.ShouldStop(1);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa);Debug.locals.put("json", _json);
 BA.debugLineNum = 322;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
Debug.ShouldStop(2);
_jobproductomasvendido = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobProductoMasVendido", _jobproductomasvendido);
 BA.debugLineNum = 323;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMas";
Debug.ShouldStop(4);
_jobproductomasvendido.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobProductoMasVendido")),(Object)(principal.getObject()));
 BA.debugLineNum = 325;BA.debugLine="JobProductoMasVendido.PostString(Main.url&\"ws/ge";
Debug.ShouldStop(16);
_jobproductomasvendido.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_main_page"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 };
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
public static RemoteObject  _btnorden_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrden_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,311);
if (RapidSub.canDelegate("btnorden_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnorden_click");}
 BA.debugLineNum = 311;BA.debugLine="Sub btnOrden_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 312;BA.debugLine="StartActivity(Facturacion)";
Debug.ShouldStop(8388608);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._facturacion.getObject())));
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnPrincipalBack_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,354);
if (RapidSub.canDelegate("btnprincipalback_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnprincipalback_click");}
 BA.debugLineNum = 354;BA.debugLine="Sub btnPrincipalBack_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 356;BA.debugLine="openSlide";
Debug.ShouldStop(8);
_openslide();
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("btnProductoBuscarModal_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,412);
if (RapidSub.canDelegate("btnproductobuscarmodal_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnproductobuscarmodal_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscarproducto = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 412;BA.debugLine="Sub btnProductoBuscarModal_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 413;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._txtbuscarproducto.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 414;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
Debug.ShouldStop(536870912);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Escriba el nombre del producto")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 415;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 418;BA.debugLine="Dim json As String";
Debug.ShouldStop(2);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 419;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
Debug.ShouldStop(4);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_parametro':'"),principal.mostCurrent._txtbuscarproducto.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 421;BA.debugLine="Dim JobBuscarProducto As HttpJob";
Debug.ShouldStop(16);
_jobbuscarproducto = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobBuscarProducto", _jobbuscarproducto);
 BA.debugLineNum = 422;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
Debug.ShouldStop(32);
_jobbuscarproducto.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobBuscarProducto")),(Object)(principal.getObject()));
 BA.debugLineNum = 423;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
Debug.ShouldStop(64);
_jobbuscarproducto.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_paramentros"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 424;BA.debugLine="btnProductoBuscarModal.Enabled = False";
Debug.ShouldStop(128);
principal.mostCurrent._btnproductobuscarmodal.runMethod(true,"setEnabled",principal.mostCurrent.__c.getField(true,"False"));
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
public static RemoteObject  _btnproductovolver_click() throws Exception{
try {
		Debug.PushSubsStack("btnProductoVolver_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,403);
if (RapidSub.canDelegate("btnproductovolver_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnproductovolver_click");}
 BA.debugLineNum = 403;BA.debugLine="Sub btnProductoVolver_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 405;BA.debugLine="funcion.DisableView(True,PanelModalProducto)";
Debug.ShouldStop(1048576);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmodalproducto));
 BA.debugLineNum = 406;BA.debugLine="funcion.DisableView(False,PanelMenu)";
Debug.ShouldStop(2097152);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 407;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,False)";
Debug.ShouldStop(4194304);
principal.mostCurrent._panelmodalproducto.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnslidevolver_click() throws Exception{
try {
		Debug.PushSubsStack("btnSlideVolver_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,503);
if (RapidSub.canDelegate("btnslidevolver_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnslidevolver_click");}
 BA.debugLineNum = 503;BA.debugLine="Sub btnSlideVolver_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 504;BA.debugLine="openSlide";
Debug.ShouldStop(8388608);
_openslide();
 BA.debugLineNum = 505;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnViewCategoria_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,249);
if (RapidSub.canDelegate("btnviewcategoria_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnviewcategoria_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductobycategoria = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 249;BA.debugLine="Sub btnViewCategoria_Click";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 251;BA.debugLine="Dim b As Button";
Debug.ShouldStop(67108864);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 252;BA.debugLine="b = Sender";
Debug.ShouldStop(134217728);
_b.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 253;BA.debugLine="Dim map As Map = b.Tag";
Debug.ShouldStop(268435456);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_b.runMethod(false,"getTag"));Debug.locals.put("map", _map);
 BA.debugLineNum = 254;BA.debugLine="Dim json As String = \"'f_idempresa':\"&idEmpresa&\"";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_idcategoria':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 256;BA.debugLine="Dim JobProductoByCategoria As HttpJob";
Debug.ShouldStop(-2147483648);
_jobproductobycategoria = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobProductoByCategoria", _jobproductobycategoria);
 BA.debugLineNum = 257;BA.debugLine="JobProductoByCategoria.Initialize(\"JobProductoByC";
Debug.ShouldStop(1);
_jobproductobycategoria.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobProductoByCategoria")),(Object)(principal.getObject()));
 BA.debugLineNum = 258;BA.debugLine="JobProductoByCategoria.PostString(Main.url&\"ws/ge";
Debug.ShouldStop(2);
_jobproductobycategoria.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_categoria"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("btnViewProducto_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,262);
if (RapidSub.canDelegate("btnviewproducto_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","btnviewproducto_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 262;BA.debugLine="Sub btnViewProducto_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 264;BA.debugLine="If mapEmpresaInfo.IsInitialized And mapEmpresaInf";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(".",principal._mapempresainfo.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_laborando")))),(principal.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 265;BA.debugLine="Msgbox(\"No estamos laborando en estos momentos.";
Debug.ShouldStop(256);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 266;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 269;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(4096);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 270;BA.debugLine="Dim map As Map = b.Tag";
Debug.ShouldStop(8192);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_b.runMethod(false,"getTag"));Debug.locals.put("map", _map);
 BA.debugLineNum = 271;BA.debugLine="salvar_detalle_temporal(map)";
Debug.ShouldStop(16384);
_salvar_detalle_temporal(_map);
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
public static RemoteObject  _cargarcaterorias() throws Exception{
try {
		Debug.PushSubsStack("cargarCaterorias (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,80);
if (RapidSub.canDelegate("cargarcaterorias")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","cargarcaterorias");}
RemoteObject _jobcategoria = RemoteObject.declareNull("com.menube.app.httpjob");
 BA.debugLineNum = 80;BA.debugLine="Sub cargarCaterorias";
Debug.ShouldStop(32768);
 BA.debugLineNum = 81;BA.debugLine="Dim JobCategoria As HttpJob";
Debug.ShouldStop(65536);
_jobcategoria = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobCategoria", _jobcategoria);
 BA.debugLineNum = 82;BA.debugLine="JobCategoria.Initialize(\"JobCategoria\",Me)";
Debug.ShouldStop(131072);
_jobcategoria.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobCategoria")),(Object)(principal.getObject()));
 BA.debugLineNum = 83;BA.debugLine="JobCategoria.PostString(Main.url&\"ws/get_categori";
Debug.ShouldStop(262144);
_jobcategoria.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_categorias_by_empresa/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa))))));
 BA.debugLineNum = 84;BA.debugLine="btnMasVendido.Text = \"Ver ofertas \"";
Debug.ShouldStop(524288);
principal.mostCurrent._btnmasvendido.runMethod(true,"setText",BA.ObjectToCharSequence("Ver ofertas "));
 BA.debugLineNum = 85;BA.debugLine="btnMasVendido.Tag = False";
Debug.ShouldStop(1048576);
principal.mostCurrent._btnmasvendido.runMethod(false,"setTag",(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("cargarViewProductos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,197);
if (RapidSub.canDelegate("cargarviewproductos")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","cargarviewproductos", _list, _categorias);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _panelheight = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("list", _list);
Debug.locals.put("categorias", _categorias);
 BA.debugLineNum = 197;BA.debugLine="Sub cargarViewProductos(list As List, categorias A";
Debug.ShouldStop(16);
 BA.debugLineNum = 199;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 200;BA.debugLine="Dim height,  panelHeight As Int";
Debug.ShouldStop(128);
_height = RemoteObject.createImmutable(0);Debug.locals.put("height", _height);
_panelheight = RemoteObject.createImmutable(0);Debug.locals.put("panelHeight", _panelheight);
 BA.debugLineNum = 201;BA.debugLine="panelHeight = 2%y";
Debug.ShouldStop(256);
_panelheight = principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("panelHeight", _panelheight);
 BA.debugLineNum = 202;BA.debugLine="height = 18%y";
Debug.ShouldStop(512);
_height = principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18)),principal.mostCurrent.activityBA);Debug.locals.put("height", _height);
 BA.debugLineNum = 204;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
Debug.ShouldStop(2048);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 205;BA.debugLine="ViewCategoria.Tag = categorias";
Debug.ShouldStop(4096);
principal.mostCurrent._viewcategoria.runMethod(false,"setTag",(_categorias));
 BA.debugLineNum = 206;BA.debugLine="ViewCategoria.Panel.Height = 100%y";
Debug.ShouldStop(8192);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"setHeight",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 207;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(16384);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 208;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(32768);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 210;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(131072);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 211;BA.debugLine="If categorias Then";
Debug.ShouldStop(262144);
if (_categorias.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 212;BA.debugLine="btn.Initialize(\"btnViewCategoria\")";
Debug.ShouldStop(524288);
_btn.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnViewCategoria")));
 }else {
 BA.debugLineNum = 214;BA.debugLine="btn.Initialize(\"btnViewProducto\")";
Debug.ShouldStop(2097152);
_btn.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnViewProducto")));
 };
 BA.debugLineNum = 217;BA.debugLine="btn.Tag = map";
Debug.ShouldStop(16777216);
_btn.runMethod(false,"setTag",(_map.getObject()));
 BA.debugLineNum = 218;BA.debugLine="btn.TextColor = Colors.White";
Debug.ShouldStop(33554432);
_btn.runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 219;BA.debugLine="btn.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
Debug.ShouldStop(67108864);
_btn.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 222;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(536870912);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 223;BA.debugLine="If categorias Then";
Debug.ShouldStop(1073741824);
if (_categorias.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 224;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fot";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 225;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(1);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 227;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"cook-";
Debug.ShouldStop(4);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cook-food.jpeg"))).getObject())));
 BA.debugLineNum = 228;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(8);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 BA.debugLineNum = 230;BA.debugLine="btn.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(32);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 231;BA.debugLine="btn.TextSize = 20";
Debug.ShouldStop(64);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 }else {
 BA.debugLineNum = 233;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pexels";
Debug.ShouldStop(256);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pexels-photo.jpeg"))).getObject())));
 BA.debugLineNum = 234;BA.debugLine="bm.Gravity = Gravity.CENTER";
Debug.ShouldStop(512);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 235;BA.debugLine="btn.Text = map.Get(\"f_descripcion\") &CRLF&CRLF&";
Debug.ShouldStop(1024);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion")))),principal.mostCurrent.__c.getField(true,"CRLF"),principal.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("RD$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 236;BA.debugLine="btn.TextSize = 15";
Debug.ShouldStop(2048);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 };
 BA.debugLineNum = 238;BA.debugLine="btn.Background = bm";
Debug.ShouldStop(8192);
_btn.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 240;BA.debugLine="ViewCategoria.Panel.AddView(btn,2%x, panelHeight";
Debug.ShouldStop(32768);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_btn.getObject())),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA)),(Object)(_panelheight),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),principal.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 241;BA.debugLine="btn.Visible = False";
Debug.ShouldStop(65536);
_btn.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 242;BA.debugLine="btn.SetVisibleAnimated(500,True)";
Debug.ShouldStop(131072);
_btn.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 244;BA.debugLine="panelHeight = height + panelHeight + 2%y";
Debug.ShouldStop(524288);
_panelheight = RemoteObject.solve(new RemoteObject[] {_height,_panelheight,principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA)}, "++",2, 1);Debug.locals.put("panelHeight", _panelheight);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 246;BA.debugLine="ViewCategoria.Panel.Height = panelHeight";
Debug.ShouldStop(2097152);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"setHeight",_panelheight);
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
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 15;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 20;BA.debugLine="Private ViewCategoria As ScrollView";
principal.mostCurrent._viewcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private btnAbierto As Button";
principal.mostCurrent._btnabierto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private btnEmpresaInfo As Button";
principal.mostCurrent._btnempresainfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private btnMasVendido As Button";
principal.mostCurrent._btnmasvendido = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnOrden As Button";
principal.mostCurrent._btnorden = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private btnPrincipalBack As Button";
principal.mostCurrent._btnprincipalback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblLema As Label";
principal.mostCurrent._lbllema = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private PanelCategoria As Panel";
principal.mostCurrent._panelcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private PanelMenu As Panel";
principal.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private PanelTitulo As Panel";
principal.mostCurrent._paneltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblCategoria As Label";
principal.mostCurrent._lblcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblCantidadProductos As Label";
principal.mostCurrent._lblcantidadproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private btnBuscarProducto As Button";
principal.mostCurrent._btnbuscarproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private btnProductoVolver As Button";
principal.mostCurrent._btnproductovolver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ListProductosModalView As ListView";
principal.mostCurrent._listproductosmodalview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private PanelModalProducto As Panel";
principal.mostCurrent._panelmodalproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private txtBuscarProducto As EditText";
principal.mostCurrent._txtbuscarproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private btnProductoBuscarModal As Button";
principal.mostCurrent._btnproductobuscarmodal = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private btnInfoCerrar As Button";
principal.mostCurrent._btninfocerrar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private PanelInfoBack As Panel";
principal.mostCurrent._panelinfoback = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private lblDireccion As Label";
principal.mostCurrent._lbldireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private lblInfoEmpresa As Label";
principal.mostCurrent._lblinfoempresa = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private lblInfoNegocio As Label";
principal.mostCurrent._lblinfonegocio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private lblPedidoMinimo As Label";
principal.mostCurrent._lblpedidominimo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private lblTelefono As Label";
principal.mostCurrent._lbltelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 53;BA.debugLine="Private PanelSlide As Panel";
principal.mostCurrent._panelslide = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private PanelSlideBack As Panel";
principal.mostCurrent._panelslideback = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private btnSlideVolver As Button";
principal.mostCurrent._btnslidevolver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,88);
if (RapidSub.canDelegate("jobdone")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
int _i = 0;
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 88;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 90;BA.debugLine="If btnProductoBuscarModal.IsInitialized And btnPr";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean(".",principal.mostCurrent._btnproductobuscarmodal.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",principal.mostCurrent._btnproductobuscarmodal.runMethod(true,"getEnabled"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 91;BA.debugLine="btnProductoBuscarModal.Enabled = True";
Debug.ShouldStop(67108864);
principal.mostCurrent._btnproductobuscarmodal.runMethod(true,"setEnabled",principal.mostCurrent.__c.getField(true,"True"));
 };
 BA.debugLineNum = 94;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 95;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(1073741824);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(principal.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(principal.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),principal.mostCurrent.activityBA);
 BA.debugLineNum = 96;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 99;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ ))),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 100;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 103;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 104;BA.debugLine="Dim list As List";
Debug.ShouldStop(128);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 105;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(256);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 106;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(512);
_json.runVoidMethod ("Initialize",(Object)(principal.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.menube.app.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 107;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(1024);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 110;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8192);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobEmpresaInfo"),BA.ObjectToString("JobCategoria"),BA.ObjectToString("JobProductoByCategoria"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobProductoMasVendido"),BA.ObjectToString("JobBuscarProducto"))) {
case 0: {
 BA.debugLineNum = 114;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(131072);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 115;BA.debugLine="mapEmpresaInfo = list.Get(0)";
Debug.ShouldStop(262144);
principal._mapempresainfo.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 117;BA.debugLine="btnAbierto.Enabled = mapEmpresaInfo.Get(\"f_labo";
Debug.ShouldStop(1048576);
principal.mostCurrent._btnabierto.runMethod(true,"setEnabled",BA.ObjectToBoolean(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_laborando"))))));
 BA.debugLineNum = 118;BA.debugLine="If btnAbierto.Enabled Then";
Debug.ShouldStop(2097152);
if (principal.mostCurrent._btnabierto.runMethod(true,"getEnabled").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 119;BA.debugLine="btnAbierto.Text = \"Abierto\"";
Debug.ShouldStop(4194304);
principal.mostCurrent._btnabierto.runMethod(true,"setText",BA.ObjectToCharSequence("Abierto"));
 BA.debugLineNum = 120;BA.debugLine="btnAbierto.TextColor = Colors.RGB(12,166,0)";
Debug.ShouldStop(8388608);
principal.mostCurrent._btnabierto.runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 12)),(Object)(BA.numberCast(int.class, 166)),(Object)(BA.numberCast(int.class, 0))));
 }else {
 BA.debugLineNum = 122;BA.debugLine="btnAbierto.Text = \"Cerrado\"";
Debug.ShouldStop(33554432);
principal.mostCurrent._btnabierto.runMethod(true,"setText",BA.ObjectToCharSequence("Cerrado"));
 BA.debugLineNum = 123;BA.debugLine="btnAbierto.TextColor = Colors.RGB(192,13,13)";
Debug.ShouldStop(67108864);
principal.mostCurrent._btnabierto.runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 192)),(Object)(BA.numberCast(int.class, 13)),(Object)(BA.numberCast(int.class, 13))));
 };
 break; }
case 1: {
 BA.debugLineNum = 127;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1073741824);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 128;BA.debugLine="lblCategoria.Text = list.Size & \" Categotias\"";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._lblcategoria.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_list.runMethod(true,"getSize"),RemoteObject.createImmutable(" Categotias"))));
 BA.debugLineNum = 129;BA.debugLine="cargarViewProductos(list, True)";
Debug.ShouldStop(1);
_cargarviewproductos(_list,principal.mostCurrent.__c.getField(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 132;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(8);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 133;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 134;BA.debugLine="Msgbox(\"Esta categoria no tiene productos.\",\"I";
Debug.ShouldStop(32);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Esta categoria no tiene productos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 135;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 138;BA.debugLine="lblCategoria.SetTextColorAnimated(300,Colors.Tr";
Debug.ShouldStop(512);
principal.mostCurrent._lblcategoria.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 145;BA.debugLine="PanelCategoria.Tag = list";
Debug.ShouldStop(65536);
principal.mostCurrent._panelcategoria.runMethod(false,"setTag",(_list.getObject()));
 BA.debugLineNum = 146;BA.debugLine="lblCategoria.Text =  list.Size & \" Productos\"";
Debug.ShouldStop(131072);
principal.mostCurrent._lblcategoria.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_list.runMethod(true,"getSize"),RemoteObject.createImmutable(" Productos"))));
 BA.debugLineNum = 147;BA.debugLine="lblCategoria.SetTextColorAnimated(200,Colors.Bl";
Debug.ShouldStop(262144);
principal.mostCurrent._lblcategoria.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 148;BA.debugLine="cargarViewProductos(list, False)";
Debug.ShouldStop(524288);
_cargarviewproductos(_list,principal.mostCurrent.__c.getField(true,"False"));
 break; }
case 3: {
 BA.debugLineNum = 152;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(8388608);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 153;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 154;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(33554432);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),principal.mostCurrent.__c.getField(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable(".")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 155;BA.debugLine="Return";
Debug.ShouldStop(67108864);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 157;BA.debugLine="cantidadProduto = cantidadProduto + 1";
Debug.ShouldStop(268435456);
principal._cantidadproduto = RemoteObject.solve(new RemoteObject[] {principal._cantidadproduto,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 158;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(536870912);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setText",BA.ObjectToCharSequence(principal._cantidadproduto));
 BA.debugLineNum = 159;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(1073741824);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 160;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
Debug.ShouldStop(-2147483648);
principal.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto agregado al carrito.")),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 break; }
case 4: {
 BA.debugLineNum = 163;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(4);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 164;BA.debugLine="lblCategoria.Text = list.Size & \" Productos en";
Debug.ShouldStop(8);
principal.mostCurrent._lblcategoria.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_list.runMethod(true,"getSize"),RemoteObject.createImmutable(" Productos en oferta"))));
 BA.debugLineNum = 165;BA.debugLine="cargarViewProductos(list,False)";
Debug.ShouldStop(16);
_cargarviewproductos(_list,principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 166;BA.debugLine="btnMasVendido.Text = \"Ver cartegorias  \"";
Debug.ShouldStop(32);
principal.mostCurrent._btnmasvendido.runMethod(true,"setText",BA.ObjectToCharSequence("Ver cartegorias  "));
 BA.debugLineNum = 167;BA.debugLine="btnMasVendido.Tag = True";
Debug.ShouldStop(64);
principal.mostCurrent._btnmasvendido.runMethod(false,"setTag",(principal.mostCurrent.__c.getField(true,"True")));
 break; }
case 5: {
 BA.debugLineNum = 170;BA.debugLine="ListProductosModalView.Clear";
Debug.ShouldStop(512);
principal.mostCurrent._listproductosmodalview.runVoidMethod ("Clear");
 BA.debugLineNum = 171;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1024);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 172;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 173;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
Debug.ShouldStop(4096);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se ha encontrado productos con esta referencia")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 174;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 177;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(65536);
{
final int step66 = 1;
final int limit66 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step66 > 0 && _i <= limit66) || (step66 < 0 && _i >= limit66) ;_i = ((int)(0 + _i + step66))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 178;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(131072);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 179;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(262144);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 180;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 181;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(1048576);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 183;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pack";
Debug.ShouldStop(4194304);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("packing.png"))).getObject())));
 };
 BA.debugLineNum = 186;BA.debugLine="ListProductosModalView.AddTwoLinesAndBitmap2(m";
Debug.ShouldStop(33554432);
principal.mostCurrent._listproductosmodalview.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Precio: "),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))),(Object)(_bm.runMethod(false,"getBitmap")),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 break; }
}
;
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listproductosmodalview_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListProductosModalView_ItemClick (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,399);
if (RapidSub.canDelegate("listproductosmodalview_itemclick")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","listproductosmodalview_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 399;BA.debugLine="Sub ListProductosModalView_ItemClick (Position As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 400;BA.debugLine="salvar_detalle_temporal(Value)";
Debug.ShouldStop(32768);
_salvar_detalle_temporal(RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.Map"), _value));
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
public static RemoteObject  _openslide() throws Exception{
try {
		Debug.PushSubsStack("openSlide (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,441);
if (RapidSub.canDelegate("openslide")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","openslide");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 441;BA.debugLine="Sub openSlide";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 443;BA.debugLine="Dim position,duration As Double";
Debug.ShouldStop(67108864);
_position = RemoteObject.createImmutable(0);Debug.locals.put("position", _position);
_duration = RemoteObject.createImmutable(0);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 444;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(134217728);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 446;BA.debugLine="If PanelSlideBack.IsInitialized= False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelslideback.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 447;BA.debugLine="Activity.LoadLayout(\"frmSlideOrden\")";
Debug.ShouldStop(1073741824);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmSlideOrden")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 448;BA.debugLine="PanelSlideBack.Visible = False";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._panelslideback.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 449;BA.debugLine="PanelSlideBack.Tag = PanelSlide.Top";
Debug.ShouldStop(1);
principal.mostCurrent._panelslideback.runMethod(false,"setTag",(principal.mostCurrent._panelslide.runMethod(true,"getTop")));
 };
 BA.debugLineNum = 452;BA.debugLine="If PanelSlideBack.Visible Then";
Debug.ShouldStop(8);
if (principal.mostCurrent._panelslideback.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 453;BA.debugLine="duration = 250";
Debug.ShouldStop(16);
_duration = BA.numberCast(double.class, 250);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 454;BA.debugLine="position = -PanelSlideBack.Tag -PanelSlide.Heigh";
Debug.ShouldStop(32);
_position = BA.numberCast(double.class, -(double)(BA.ObjectToNumber(principal.mostCurrent._panelslideback.runMethod(false,"getTag")).<Double>get().doubleValue())-(double) (0 + principal.mostCurrent._panelslide.runMethod(true,"getHeight").<Integer>get().intValue()));Debug.locals.put("position", _position);
 }else {
 BA.debugLineNum = 457;BA.debugLine="PanelSlide.Top = 100%y";
Debug.ShouldStop(256);
principal.mostCurrent._panelslide.runMethod(true,"setTop",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 458;BA.debugLine="position = -70%y";
Debug.ShouldStop(512);
_position = BA.numberCast(double.class, -(double) (0 + principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),principal.mostCurrent.activityBA).<Integer>get().intValue()));Debug.locals.put("position", _position);
 BA.debugLineNum = 459;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,True)";
Debug.ShouldStop(1024);
principal.mostCurrent._panelslideback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 461;BA.debugLine="duration = 251";
Debug.ShouldStop(4096);
_duration = BA.numberCast(double.class, 251);Debug.locals.put("duration", _duration);
 };
 BA.debugLineNum = 465;BA.debugLine="a.InitializeTranslate(\"Slide\",0,0,0,position)";
Debug.ShouldStop(65536);
_a.runVoidMethod ("InitializeTranslate",principal.mostCurrent.activityBA,(Object)(BA.ObjectToString("Slide")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _position)));
 BA.debugLineNum = 466;BA.debugLine="a.Duration = duration";
Debug.ShouldStop(131072);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, _duration));
 BA.debugLineNum = 467;BA.debugLine="a.Start(PanelSlide)";
Debug.ShouldStop(262144);
_a.runVoidMethod ("Start",(Object)((principal.mostCurrent._panelslide.getObject())));
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim idEmpresa As Int = 1000 '1044";
principal._idempresa = BA.numberCast(int.class, 1000);
 //BA.debugLineNum = 10;BA.debugLine="Dim impuestoIncluido As Boolean = True";
principal._impuestoincluido = principal.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 11;BA.debugLine="Dim mapEmpresaInfo As Map = Null";
principal._mapempresainfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
principal._mapempresainfo.setObject(principal.mostCurrent.__c.getField(false,"Null"));
 //BA.debugLineNum = 12;BA.debugLine="Dim cantidadProduto As Int = 0";
principal._cantidadproduto = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,274);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","salvar_detalle_temporal", _map);}
RemoteObject _mapcalculos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("com.menube.app.httpjob");
Debug.locals.put("map", _map);
 BA.debugLineNum = 274;BA.debugLine="Sub salvar_detalle_temporal(map As Map)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 276;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(524288);
_mapcalculos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapcalculos = principal.mostCurrent._funcion.runMethod(false,"_recalcular" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(principal._impuestoincluido),(Object)(principal.mostCurrent.__c.getField(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 278;BA.debugLine="Dim json As String";
Debug.ShouldStop(2097152);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 279;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(4194304);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':1"),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 292;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(8);
_jobdetalletemporal = RemoteObject.createNew ("com.menube.app.httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 293;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(16);
_jobdetalletemporal.runClassMethod (com.menube.app.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(principal.getObject()));
 BA.debugLineNum = 294;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(32);
_jobdetalletemporal.runClassMethod (com.menube.app.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slide_animationend() throws Exception{
try {
		Debug.PushSubsStack("Slide_AnimationEnd (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,471);
if (RapidSub.canDelegate("slide_animationend")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","slide_animationend");}
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 471;BA.debugLine="Sub Slide_AnimationEnd";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 473;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(16777216);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 474;BA.debugLine="a = Sender";
Debug.ShouldStop(33554432);
_a.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 476;BA.debugLine="If a.Duration = 251 Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",_a.runMethod(true,"getDuration"),BA.numberCast(double.class, 251))) { 
 BA.debugLineNum = 477;BA.debugLine="PanelSlide.Top = PanelSlideBack.Tag";
Debug.ShouldStop(268435456);
principal.mostCurrent._panelslide.runMethod(true,"setTop",BA.numberCast(int.class, principal.mostCurrent._panelslideback.runMethod(false,"getTag")));
 BA.debugLineNum = 478;BA.debugLine="funcion.DisableView( False,PanelSlide)";
Debug.ShouldStop(536870912);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelslide));
 BA.debugLineNum = 479;BA.debugLine="funcion.DisableView(True,PanelMenu)";
Debug.ShouldStop(1073741824);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmenu));
 }else {
 BA.debugLineNum = 481;BA.debugLine="PanelSlide.Top = 100%y";
Debug.ShouldStop(1);
principal.mostCurrent._panelslide.runMethod(true,"setTop",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 482;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,False)";
Debug.ShouldStop(2);
principal.mostCurrent._panelslideback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 483;BA.debugLine="funcion.DisableView(True,PanelSlide)";
Debug.ShouldStop(4);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelslide));
 BA.debugLineNum = 484;BA.debugLine="funcion.DisableView(False,PanelMenu)";
Debug.ShouldStop(8);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmenu));
 };
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slideoption_click() throws Exception{
try {
		Debug.PushSubsStack("SlideOption_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,489);
if (RapidSub.canDelegate("slideoption_click")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","slideoption_click");}
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
 BA.debugLineNum = 489;BA.debugLine="Sub SlideOption_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 491;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(1024);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 492;BA.debugLine="p = Sender";
Debug.ShouldStop(2048);
_p.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 494;BA.debugLine="If p.Tag = \"Exit\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("Exit")))) { 
 BA.debugLineNum = 495;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16384);
principal.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 496;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 499;BA.debugLine="StartActivity(p.Tag)";
Debug.ShouldStop(262144);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)(_p.runMethod(false,"getTag")));
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
		Debug.PushSubsStack("txtBuscarProducto_EnterPressed (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,395);
if (RapidSub.canDelegate("txtbuscarproducto_enterpressed")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","txtbuscarproducto_enterpressed");}
 BA.debugLineNum = 395;BA.debugLine="Sub txtBuscarProducto_EnterPressed";
Debug.ShouldStop(1024);
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _viewproducto_animationend() throws Exception{
try {
		Debug.PushSubsStack("ViewProducto_AnimationEnd (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,193);
if (RapidSub.canDelegate("viewproducto_animationend")) { return com.menube.app.principal.remoteMe.runUserSub(false, "principal","viewproducto_animationend");}
 BA.debugLineNum = 193;BA.debugLine="Sub ViewProducto_AnimationEnd";
Debug.ShouldStop(1);
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}