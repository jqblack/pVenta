package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class principal_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,99);
if (RapidSub.canDelegate("activity_create")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","activity_create", _firsttime);}
RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _cantidadpro = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _jobempresainfo = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 99;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(4);
 BA.debugLineNum = 101;BA.debugLine="Dim hc As OkHttpClient";
Debug.ShouldStop(16);
_hc = RemoteObject.createNew ("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");Debug.locals.put("hc", _hc);
 BA.debugLineNum = 102;BA.debugLine="hc.InitializeAcceptAll(\"httpscliente\")";
Debug.ShouldStop(32);
_hc.runVoidMethod ("InitializeAcceptAll",(Object)(RemoteObject.createImmutable("httpscliente")));
 BA.debugLineNum = 106;BA.debugLine="hscrol.Initialize(100%x,\"\")";
Debug.ShouldStop(512);
principal.mostCurrent._hscrol.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA)),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 108;BA.debugLine="Activity.LoadLayout(\"frmPrincipalv2\")";
Debug.ShouldStop(2048);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmPrincipalv2")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 110;BA.debugLine="If FirstTime Then";
Debug.ShouldStop(8192);
if (_firsttime.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 112;BA.debugLine="Dim json As String";
Debug.ShouldStop(32768);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 113;BA.debugLine="json = \"'f_imei':\"&Main.imei";
Debug.ShouldStop(65536);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_imei':"),principal.mostCurrent._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 115;BA.debugLine="Dim cantidadPro As HttpJob";
Debug.ShouldStop(262144);
_cantidadpro = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("cantidadPro", _cantidadpro);
 BA.debugLineNum = 116;BA.debugLine="cantidadPro.Initialize(\"cantidadPro\",Me)";
Debug.ShouldStop(524288);
_cantidadpro.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("cantidadPro")),(Object)(principal.getObject()));
 BA.debugLineNum = 117;BA.debugLine="cantidadPro.PostString(Main.url&\"puntoventa/get_";
Debug.ShouldStop(1048576);
_cantidadpro.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_canitdad_producto_Login"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 };
 BA.debugLineNum = 121;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(16777216);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(67108864);
_buscarfavoritos();
 BA.debugLineNum = 125;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
Debug.ShouldStop(268435456);
_jobempresainfo = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobEmpresaInfo", _jobempresainfo);
 BA.debugLineNum = 126;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
Debug.ShouldStop(536870912);
_jobempresainfo.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobEmpresaInfo")),(Object)(principal.getObject()));
 BA.debugLineNum = 127;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos";
Debug.ShouldStop(1073741824);
_jobempresainfo.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_datos_preferencia"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa))))));
 }else {
 BA.debugLineNum = 129;BA.debugLine="cargarDatos";
Debug.ShouldStop(1);
_cargardatos();
 };
 BA.debugLineNum = 132;BA.debugLine="sm.Initialize(Activity,Me,\"SlideMenu\",8%y,75%x, C";
Debug.ShouldStop(8);
principal.mostCurrent._sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_initialize" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._activity),(Object)(principal.getObject()),(Object)(BA.ObjectToString("SlideMenu")),(Object)(principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),principal.mostCurrent.activityBA)),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),principal.mostCurrent.activityBA)),(Object)(principal.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 230)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 133;BA.debugLine="funcion.GenerarSlideMenu(sm)";
Debug.ShouldStop(16);
principal.mostCurrent._funcion.runVoidMethod ("_generarslidemenu" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._sm));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Activity_Pause (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,902);
if (RapidSub.canDelegate("activity_pause")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 902;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 904;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("Activity_Resume (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,836);
if (RapidSub.canDelegate("activity_resume")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","activity_resume");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _cantidadpro = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _jobempresainfo = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 836;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(8);
 BA.debugLineNum = 838;BA.debugLine="If Main.cargaragain And loadagain Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(".",principal.mostCurrent._main._cargaragain /*RemoteObject*/ ) && RemoteObject.solveBoolean(".",principal._loadagain)) { 
 BA.debugLineNum = 840;BA.debugLine="Dim json As String";
Debug.ShouldStop(128);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 841;BA.debugLine="json = \"'f_imei':\"&Main.imei";
Debug.ShouldStop(256);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_imei':"),principal.mostCurrent._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 843;BA.debugLine="Dim cantidadPro As HttpJob";
Debug.ShouldStop(1024);
_cantidadpro = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("cantidadPro", _cantidadpro);
 BA.debugLineNum = 844;BA.debugLine="cantidadPro.Initialize(\"cantidadPro\",Me)";
Debug.ShouldStop(2048);
_cantidadpro.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("cantidadPro")),(Object)(principal.getObject()));
 BA.debugLineNum = 845;BA.debugLine="cantidadPro.PostString(Main.url&\"puntoventa/get_";
Debug.ShouldStop(4096);
_cantidadpro.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/get_canitdad_producto_Login"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 847;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(16384);
_buscarfavoritos();
 BA.debugLineNum = 849;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
Debug.ShouldStop(65536);
_jobempresainfo = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobEmpresaInfo", _jobempresainfo);
 BA.debugLineNum = 850;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
Debug.ShouldStop(131072);
_jobempresainfo.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobEmpresaInfo")),(Object)(principal.getObject()));
 BA.debugLineNum = 851;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos";
Debug.ShouldStop(262144);
_jobempresainfo.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_datos_preferencia"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa))))));
 BA.debugLineNum = 854;BA.debugLine="sm.Initialize(Activity,Me,\"SlideMenu\",8%y,75%x,";
Debug.ShouldStop(2097152);
principal.mostCurrent._sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_initialize" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._activity),(Object)(principal.getObject()),(Object)(BA.ObjectToString("SlideMenu")),(Object)(principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),principal.mostCurrent.activityBA)),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),principal.mostCurrent.activityBA)),(Object)(principal.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 230)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 855;BA.debugLine="funcion.GenerarSlideMenu(sm)";
Debug.ShouldStop(4194304);
principal.mostCurrent._funcion.runVoidMethod ("_generarslidemenu" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._sm));
 BA.debugLineNum = 857;BA.debugLine="btnIniciarSecion.Text = \"Iniciar Sesión\"";
Debug.ShouldStop(16777216);
principal.mostCurrent._btniniciarsecion.runMethod(true,"setText",BA.ObjectToCharSequence("Iniciar Sesión"));
 BA.debugLineNum = 859;BA.debugLine="Main.cargaragain = False";
Debug.ShouldStop(67108864);
principal.mostCurrent._main._cargaragain /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 860;BA.debugLine="loadagain = False";
Debug.ShouldStop(134217728);
principal._loadagain = principal.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 864;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setText",BA.ObjectToCharSequence(principal._cantidadproduto));
 BA.debugLineNum = 865;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(1);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 866;BA.debugLine="If cantidadProduto == 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",principal._cantidadproduto,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 867;BA.debugLine="lblCantidadProductos.Visible = False";
Debug.ShouldStop(4);
principal.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 870;BA.debugLine="If Main.logged And buscarfavoritosvar And keyotra";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean(".",principal.mostCurrent._main._logged /*RemoteObject*/ ) && RemoteObject.solveBoolean(".",principal._buscarfavoritosvar) && RemoteObject.solveBoolean(".",principal._keyotraparte)) { 
 BA.debugLineNum = 871;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(64);
_buscarfavoritos();
 BA.debugLineNum = 873;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
Debug.ShouldStop(256);
_jobempresainfo = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobEmpresaInfo", _jobempresainfo);
 BA.debugLineNum = 874;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
Debug.ShouldStop(512);
_jobempresainfo.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobEmpresaInfo")),(Object)(principal.getObject()));
 BA.debugLineNum = 875;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos";
Debug.ShouldStop(1024);
_jobempresainfo.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_datos_preferencia"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa))))));
 };
 BA.debugLineNum = 878;BA.debugLine="If SendClickFav Then";
Debug.ShouldStop(8192);
if (principal._sendclickfav.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 879;BA.debugLine="btnMasVendido_Click";
Debug.ShouldStop(16384);
_btnmasvendido_click();
 BA.debugLineNum = 880;BA.debugLine="SendClickFav = False";
Debug.ShouldStop(32768);
principal._sendclickfav = principal.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 883;BA.debugLine="If SendClickAbout Then";
Debug.ShouldStop(262144);
if (principal._sendclickabout.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 884;BA.debugLine="mostrarAbout";
Debug.ShouldStop(524288);
_mostrarabout();
 BA.debugLineNum = 885;BA.debugLine="SendClickAbout = False";
Debug.ShouldStop(1048576);
principal._sendclickabout = principal.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 888;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(8388608);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 889;BA.debugLine="sm.Initialize(Activity,Me,\"SlideMenu\",8%y,75%x,";
Debug.ShouldStop(16777216);
principal.mostCurrent._sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_initialize" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._activity),(Object)(principal.getObject()),(Object)(BA.ObjectToString("SlideMenu")),(Object)(principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),principal.mostCurrent.activityBA)),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 75)),principal.mostCurrent.activityBA)),(Object)(principal.mostCurrent.__c.getField(false,"Colors").runMethod(true,"ARGB",(Object)(BA.numberCast(int.class, 230)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 250)),(Object)(BA.numberCast(int.class, 250)))));
 BA.debugLineNum = 890;BA.debugLine="funcion.GenerarSlideMenu(sm)";
Debug.ShouldStop(33554432);
principal.mostCurrent._funcion.runVoidMethod ("_generarslidemenu" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._sm));
 };
 BA.debugLineNum = 894;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(536870912);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 895;BA.debugLine="btnIniciarSecion.Text = \"Sr. \"&Main.usersData.no";
Debug.ShouldStop(1073741824);
principal.mostCurrent._btniniciarsecion.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Sr. "),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"nombre" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 899;BA.debugLine="keyotraparte = True";
Debug.ShouldStop(4);
principal._keyotraparte = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 900;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddpro_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddPro_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,182);
if (RapidSub.canDelegate("btnaddpro_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnaddpro_click");}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 182;BA.debugLine="Sub btnAddPro_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 183;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(4194304);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 184;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(8388608);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 186;BA.debugLine="Dim b As Button";
Debug.ShouldStop(33554432);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 187;BA.debugLine="b.Initialize(\"\")";
Debug.ShouldStop(67108864);
_b.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 188;BA.debugLine="b = Sender";
Debug.ShouldStop(134217728);
_b.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 190;BA.debugLine="mapa = b.Tag";
Debug.ShouldStop(536870912);
_mapa.setObject(_b.runMethod(false,"getTag"));
 BA.debugLineNum = 192;BA.debugLine="If mapa.Get(\"f_precio\") <= 0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 194;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
Debug.ShouldStop(2);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),principal.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 197;BA.debugLine="mapaDetalle.Initialize";
Debug.ShouldStop(16);
principal._mapadetalle.runVoidMethod ("Initialize");
 BA.debugLineNum = 198;BA.debugLine="salvar_detalle_temporal(mapa,1)";
Debug.ShouldStop(32);
_salvar_detalle_temporal(_mapa,BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnagregarcarritodetalle_click() throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,410);
if (RapidSub.canDelegate("btnagregarcarritodetalle_click")) { com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnagregarcarritodetalle_click"); return;}
ResumableSub_btnagregarCarritoDetalle_Click rsub = new ResumableSub_btnagregarCarritoDetalle_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnagregarCarritoDetalle_Click extends BA.ResumableSub {
public ResumableSub_btnagregarCarritoDetalle_Click(com.jq.pedidos.principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.principal parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,410);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 412;BA.debugLine="If lblcantidad.Text < 1 Then";
Debug.ShouldStop(134217728);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, parent.mostCurrent._lblcantidad.runMethod(true,"getText")),BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 413;BA.debugLine="Msgbox(\"Si va ha agregar este producto debe sele";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Si va ha agregar este producto debe seleccionar por lo menos una unidad")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 414;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 417;BA.debugLine="If mapaDetalle.Get(\"f_precio\") <= 0 Then";
Debug.ShouldStop(1);

case 4:
//if
this.state = 9;
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, parent._mapadetalle.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, 0))) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
 BA.debugLineNum = 418;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),principal.mostCurrent.activityBA);
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 422;BA.debugLine="salvar_detalle_temporal(mapaDetalle,lblcantidad.";
Debug.ShouldStop(32);
_salvar_detalle_temporal(parent._mapadetalle,BA.numberCast(int.class, parent.mostCurrent._lblcantidad.runMethod(true,"getText")));
 BA.debugLineNum = 423;BA.debugLine="Sleep(200)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "btnagregarcarritodetalle_click"),BA.numberCast(int.class, 200));
this.state = 10;
return;
case 10:
//C
this.state = 9;
;
 BA.debugLineNum = 424;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(128);
_btnbackdetalles_click();
 if (true) break;

case 9:
//C
this.state = -1;
;
 BA.debugLineNum = 428;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
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
public static RemoteObject  _btnbackaboutus_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackAboutus_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1462);
if (RapidSub.canDelegate("btnbackaboutus_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnbackaboutus_click");}
 BA.debugLineNum = 1462;BA.debugLine="Sub btnBackAboutus_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 1464;BA.debugLine="PanelFondoAboutus.SetVisibleAnimated(250,False)";
Debug.ShouldStop(8388608);
principal.mostCurrent._panelfondoaboutus.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1465;BA.debugLine="PanelMenu.SetVisibleAnimated(250,True)";
Debug.ShouldStop(16777216);
principal.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1467;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbackdetalles_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackDetalles_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,379);
if (RapidSub.canDelegate("btnbackdetalles_click")) { com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnbackdetalles_click"); return;}
ResumableSub_btnBackDetalles_Click rsub = new ResumableSub_btnBackDetalles_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBackDetalles_Click extends BA.ResumableSub {
public ResumableSub_btnBackDetalles_Click(com.jq.pedidos.principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.principal parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBackDetalles_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,379);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 381;BA.debugLine="If actu Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._actu.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 382;BA.debugLine="BuscarFavoritos";
Debug.ShouldStop(536870912);
_buscarfavoritos();
 BA.debugLineNum = 383;BA.debugLine="actu = False";
Debug.ShouldStop(1073741824);
parent._actu = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 384;BA.debugLine="ToastMessageShow(\"Actualizando sus productos\",Fa";
Debug.ShouldStop(-2147483648);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Actualizando sus productos")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 385;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "btnbackdetalles_click"),BA.numberCast(int.class, 200));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
 BA.debugLineNum = 386;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
Debug.ShouldStop(2);
parent.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 387;BA.debugLine="PanelMenu.SetVisibleAnimated(500,True)";
Debug.ShouldStop(4);
parent.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 388;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 391;BA.debugLine="If isfav Then";
Debug.ShouldStop(64);

case 4:
//if
this.state = 7;
if (parent._isfav.<Boolean>get().booleanValue()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 392;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
Debug.ShouldStop(128);
parent.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 393;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(500,True)";
Debug.ShouldStop(256);
parent.mostCurrent._panelfondofavorito.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 394;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 397;BA.debugLine="If ismodal Then";
Debug.ShouldStop(4096);

case 7:
//if
this.state = 12;
if (parent._ismodal.<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
 BA.debugLineNum = 399;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
Debug.ShouldStop(16384);
parent.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 400;BA.debugLine="PanelMenu.SetVisibleAnimated(500,True)";
Debug.ShouldStop(32768);
parent.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 401;BA.debugLine="PanelModalProducto.SetVisibleAnimated(500,True)";
Debug.ShouldStop(65536);
parent.mostCurrent._panelmodalproducto.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 404;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
Debug.ShouldStop(524288);
parent.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 405;BA.debugLine="PanelMenu.SetVisibleAnimated(500,True)";
Debug.ShouldStop(1048576);
parent.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 if (true) break;

case 12:
//C
this.state = -1;
;
 BA.debugLineNum = 408;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _btnbackfavoritos_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackFavoritos_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1161);
if (RapidSub.canDelegate("btnbackfavoritos_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnbackfavoritos_click");}
 BA.debugLineNum = 1161;BA.debugLine="Sub btnBackFavoritos_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 1163;BA.debugLine="isfav = False";
Debug.ShouldStop(1024);
principal._isfav = principal.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1164;BA.debugLine="LlistaFavoritos.Clear";
Debug.ShouldStop(2048);
principal.mostCurrent._llistafavoritos.runVoidMethod ("Clear");
 BA.debugLineNum = 1165;BA.debugLine="PanelFondoFavorito.Visible = False";
Debug.ShouldStop(4096);
principal.mostCurrent._panelfondofavorito.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1167;BA.debugLine="PanelMenu.SetVisibleAnimated(250,True)";
Debug.ShouldStop(16384);
principal.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1169;BA.debugLine="If actualizame Then";
Debug.ShouldStop(65536);
if (principal._actualizame.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1170;BA.debugLine="cargarDatos";
Debug.ShouldStop(131072);
_cargardatos();
 BA.debugLineNum = 1171;BA.debugLine="actualizame = False";
Debug.ShouldStop(262144);
principal._actualizame = principal.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 1174;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("btnBuscarProducto_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1216);
if (RapidSub.canDelegate("btnbuscarproducto_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnbuscarproducto_click");}
 BA.debugLineNum = 1216;BA.debugLine="Sub btnBuscarProducto_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 1218;BA.debugLine="If PanelModalProducto.IsInitialized = False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelmodalproducto.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1219;BA.debugLine="Activity.LoadLayout(\"frmProducoModal\")";
Debug.ShouldStop(4);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProducoModal")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 1221;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.ItemHei";
Debug.ShouldStop(16);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 1223;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(64);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 1224;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(128);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 1225;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(256);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",principal.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 1226;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.P";
Debug.ShouldStop(512);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 1228;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(2048);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 1229;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(4096);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",principal.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 1230;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(8192);
principal.mostCurrent._listproductosmodalview.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 1231;BA.debugLine="funcion.SetDivider( ListProductosModalView,Color";
Debug.ShouldStop(16384);
principal.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._listproductosmodalview),(Object)(principal.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 1235;BA.debugLine="PanelModalProducto.Visible = False";
Debug.ShouldStop(262144);
principal.mostCurrent._panelmodalproducto.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1236;BA.debugLine="funcion.DisableView(False,PanelModalProducto)";
Debug.ShouldStop(524288);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmodalproducto));
 BA.debugLineNum = 1238;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,True)";
Debug.ShouldStop(2097152);
principal.mostCurrent._panelmodalproducto.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1239;BA.debugLine="funcion.DisableView(True,PanelMenu)";
Debug.ShouldStop(4194304);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 1240;BA.debugLine="txtBuscarProducto.RequestFocus";
Debug.ShouldStop(8388608);
principal.mostCurrent._txtbuscarproducto.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 1241;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnEmpresaInfo_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1178);
if (RapidSub.canDelegate("btnempresainfo_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnempresainfo_click");}
 BA.debugLineNum = 1178;BA.debugLine="Sub btnEmpresaInfo_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1180;BA.debugLine="If  mapEmpresaInfo.IsInitialized =False Or mapEmp";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",principal._mapempresainfo.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False")) || RemoteObject.solveBoolean("n",principal._mapempresainfo)) { 
 BA.debugLineNum = 1181;BA.debugLine="Msgbox(\"Buscando información del negocio...\",\"In";
Debug.ShouldStop(268435456);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Buscando información del negocio...")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 1182;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1185;BA.debugLine="If PanelInfoBack.IsInitialized = False Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelinfoback.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1186;BA.debugLine="Activity.LoadLayout(\"frmInfoEmpresa\")";
Debug.ShouldStop(2);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmInfoEmpresa")),principal.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1188;BA.debugLine="PanelInfoBack.Visible = False";
Debug.ShouldStop(8);
principal.mostCurrent._panelinfoback.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1189;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,True)";
Debug.ShouldStop(16);
principal.mostCurrent._panelinfoback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1191;BA.debugLine="funcion.DisableView(True,PanelMenu)";
Debug.ShouldStop(64);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 1192;BA.debugLine="funcion.DisableView(False,PanelInfoBack)";
Debug.ShouldStop(128);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelinfoback));
 BA.debugLineNum = 1194;BA.debugLine="lblInfoEmpresa.Text = mapEmpresaInfo.Get(\"f_nombr";
Debug.ShouldStop(512);
principal.mostCurrent._lblinfoempresa.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 1195;BA.debugLine="lblInfoNegocio.Text = mapEmpresaInfo.Get(\"f_tipo_";
Debug.ShouldStop(1024);
principal.mostCurrent._lblinfonegocio.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tipo_negocio"))))));
 BA.debugLineNum = 1196;BA.debugLine="lblPedidoMinimo.Text =  \"RD$ \"&mapEmpresaInfo.Get";
Debug.ShouldStop(2048);
principal.mostCurrent._lblpedidominimo.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("RD$ "),principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_pedidos_minimos")))))));
 BA.debugLineNum = 1197;BA.debugLine="lblTelefono.Text = mapEmpresaInfo.Get(\"f_telefono";
Debug.ShouldStop(4096);
principal.mostCurrent._lbltelefono.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_telefono"))))));
 BA.debugLineNum = 1198;BA.debugLine="lblDireccion.Text = mapEmpresaInfo.Get(\"f_direcci";
Debug.ShouldStop(8192);
principal.mostCurrent._lbldireccion.runMethod(true,"setText",BA.ObjectToCharSequence(principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion"))))));
 BA.debugLineNum = 1200;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("btnInfoCerrar_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1210);
if (RapidSub.canDelegate("btninfocerrar_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btninfocerrar_click");}
 BA.debugLineNum = 1210;BA.debugLine="Sub btnInfoCerrar_Click";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 1211;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,False)";
Debug.ShouldStop(67108864);
principal.mostCurrent._panelinfoback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1212;BA.debugLine="funcion.DisableView(False,PanelMenu)";
Debug.ShouldStop(134217728);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 1213;BA.debugLine="funcion.DisableView(True,PanelInfoBack)";
Debug.ShouldStop(268435456);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelinfoback));
 BA.debugLineNum = 1214;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("btnIniciarSecion_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1442);
if (RapidSub.canDelegate("btniniciarsecion_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btniniciarsecion_click");}
 BA.debugLineNum = 1442;BA.debugLine="Sub btnIniciarSecion_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 1444;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(8);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 }else {
 BA.debugLineNum = 1449;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(256);
principal.mostCurrent._main._mostar /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1450;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(512);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._main.getObject())));
 };
 BA.debugLineNum = 1453;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnless_click() throws Exception{
try {
		Debug.PushSubsStack("btnless_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,373);
if (RapidSub.canDelegate("btnless_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnless_click");}
RemoteObject _num = RemoteObject.createImmutable(0);
 BA.debugLineNum = 373;BA.debugLine="Sub btnless_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 374;BA.debugLine="Dim num As Int = lblcantidad.Text";
Debug.ShouldStop(2097152);
_num = BA.numberCast(int.class, principal.mostCurrent._lblcantidad.runMethod(true,"getText"));Debug.locals.put("num", _num);Debug.locals.put("num", _num);
 BA.debugLineNum = 376;BA.debugLine="lblcantidad.Text = num - 1";
Debug.ShouldStop(8388608);
principal.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {_num,RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 377;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnMasVendido_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,923);
if (RapidSub.canDelegate("btnmasvendido_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnmasvendido_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobfavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 923;BA.debugLine="Sub btnMasVendido_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 925;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(268435456);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 927;BA.debugLine="If PanelFondoFavorito.IsInitialized = False Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelfondofavorito.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 928;BA.debugLine="Activity.LoadLayout(\"frmProductosFavoritos\")";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProductosFavoritos")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 929;BA.debugLine="PanelFondoFavorito.Visible = False";
Debug.ShouldStop(1);
principal.mostCurrent._panelfondofavorito.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 931;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.ItemHeight =";
Debug.ShouldStop(4);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 12)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 933;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.TextCol";
Debug.ShouldStop(16);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 934;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.TextSiz";
Debug.ShouldStop(32);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 935;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.Typefac";
Debug.ShouldStop(64);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",principal.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 936;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.Padding";
Debug.ShouldStop(128);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 938;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(512);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 939;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.T";
Debug.ShouldStop(1024);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",principal.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 940;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.H";
Debug.ShouldStop(2048);
principal.mostCurrent._llistafavoritos.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 941;BA.debugLine="funcion.SetDivider(LlistaFavoritos,Colors.Light";
Debug.ShouldStop(4096);
principal.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._llistafavoritos),(Object)(principal.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(principal.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 };
 BA.debugLineNum = 945;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(250,True)";
Debug.ShouldStop(65536);
principal.mostCurrent._panelfondofavorito.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 947;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.users";
Debug.ShouldStop(262144);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idempresa':"),principal._idempresa);Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 949;BA.debugLine="Dim jobFavoritos As HttpJob";
Debug.ShouldStop(1048576);
_jobfavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("jobFavoritos", _jobfavoritos);
 BA.debugLineNum = 950;BA.debugLine="jobFavoritos.Initialize(\"RefreshFavoritos\",Me)";
Debug.ShouldStop(2097152);
_jobfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("RefreshFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 951;BA.debugLine="ToastMessageShow(\"Cargando sus Favoritos\",False)";
Debug.ShouldStop(4194304);
principal.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Cargando sus Favoritos")),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 952;BA.debugLine="jobFavoritos.PostString(Main.url&\"puntoventa/bus";
Debug.ShouldStop(8388608);
_jobfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/buscarfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 954;BA.debugLine="PanelMenu.Visible = False";
Debug.ShouldStop(33554432);
principal.mostCurrent._panelmenu.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 955;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(250,True)";
Debug.ShouldStop(67108864);
principal.mostCurrent._panelfondofavorito.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 957;BA.debugLine="lblCantProductos.Text = \"Productos Favoritos: \"&";
Debug.ShouldStop(268435456);
principal.mostCurrent._lblcantproductos.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Productos Favoritos: "),principal._listafavoritos.runMethod(true,"getSize"))));
 BA.debugLineNum = 959;BA.debugLine="isfav = True";
Debug.ShouldStop(1073741824);
principal._isfav = principal.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 963;BA.debugLine="Dim res As Int";
Debug.ShouldStop(4);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 965;BA.debugLine="res = Msgbox2(\"Para buscar en sus productos fav";
Debug.ShouldStop(16);
_res = principal.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para buscar en sus productos favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar sesión")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Mas tarde")),(Object)((principal.mostCurrent.__c.getField(false,"Null"))),principal.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 967;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, principal.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 968;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(128);
principal.mostCurrent._main._mostar /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 969;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(256);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 972;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 978;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmore_click() throws Exception{
try {
		Debug.PushSubsStack("btnMore_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,367);
if (RapidSub.canDelegate("btnmore_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnmore_click");}
RemoteObject _num = RemoteObject.createImmutable(0);
 BA.debugLineNum = 367;BA.debugLine="Sub btnMore_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 368;BA.debugLine="Dim num As Int = lblcantidad.Text";
Debug.ShouldStop(32768);
_num = BA.numberCast(int.class, principal.mostCurrent._lblcantidad.runMethod(true,"getText"));Debug.locals.put("num", _num);Debug.locals.put("num", _num);
 BA.debugLineNum = 370;BA.debugLine="lblcantidad.Text = num + 1";
Debug.ShouldStop(131072);
principal.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {_num,RemoteObject.createImmutable(1)}, "+",1, 1)));
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
public static RemoteObject  _btnorden_click() throws Exception{
try {
		Debug.PushSubsStack("btnOrden_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,907);
if (RapidSub.canDelegate("btnorden_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnorden_click");}
 BA.debugLineNum = 907;BA.debugLine="Sub btnOrden_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 908;BA.debugLine="StartActivity(Facturacion)";
Debug.ShouldStop(2048);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._facturacion.getObject())));
 BA.debugLineNum = 909;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("btnPrincipalBack_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1202);
if (RapidSub.canDelegate("btnprincipalback_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnprincipalback_click");}
 BA.debugLineNum = 1202;BA.debugLine="Sub btnPrincipalBack_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 1206;BA.debugLine="sm.Show";
Debug.ShouldStop(2097152);
principal.mostCurrent._sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 1208;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnProductoBuscarModal_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1303);
if (RapidSub.canDelegate("btnproductobuscarmodal_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnproductobuscarmodal_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscarproducto = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 1303;BA.debugLine="Sub btnProductoBuscarModal_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 1304;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._txtbuscarproducto.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1305;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
Debug.ShouldStop(16777216);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Escriba el nombre del producto")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 1306;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1309;BA.debugLine="Dim json As String";
Debug.ShouldStop(268435456);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 1310;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_parametro':'"),principal.mostCurrent._txtbuscarproducto.runMethod(true,"getText").runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable(""))).runMethod(true,"replace",(Object)(BA.ObjectToString("\"")),(Object)(RemoteObject.createImmutable(""))),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 1312;BA.debugLine="Dim JobBuscarProducto As HttpJob";
Debug.ShouldStop(-2147483648);
_jobbuscarproducto = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobBuscarProducto", _jobbuscarproducto);
 BA.debugLineNum = 1313;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProductoLi";
Debug.ShouldStop(1);
_jobbuscarproducto.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobBuscarProductoLista")),(Object)(principal.getObject()));
 BA.debugLineNum = 1314;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
Debug.ShouldStop(2);
_jobbuscarproducto.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_paramentros"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 1315;BA.debugLine="btnProductoBuscarModal.Enabled = False";
Debug.ShouldStop(4);
principal.mostCurrent._btnproductobuscarmodal.runMethod(true,"setEnabled",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1317;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("btnProductoVolver_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1291);
if (RapidSub.canDelegate("btnproductovolver_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnproductovolver_click");}
 BA.debugLineNum = 1291;BA.debugLine="Sub btnProductoVolver_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 1293;BA.debugLine="funcion.DisableView(True,PanelModalProducto)";
Debug.ShouldStop(4096);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmodalproducto));
 BA.debugLineNum = 1294;BA.debugLine="funcion.DisableView(False,PanelMenu)";
Debug.ShouldStop(8192);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmenu));
 BA.debugLineNum = 1295;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,False)";
Debug.ShouldStop(16384);
principal.mostCurrent._panelmodalproducto.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1297;BA.debugLine="txtBuscarProducto.Text = \"\"";
Debug.ShouldStop(65536);
principal.mostCurrent._txtbuscarproducto.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 1298;BA.debugLine="ListProductosModalView.Clear";
Debug.ShouldStop(131072);
principal.mostCurrent._listproductosmodalview.runVoidMethod ("Clear");
 BA.debugLineNum = 1300;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("btnSlideVolver_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1437);
if (RapidSub.canDelegate("btnslidevolver_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnslidevolver_click");}
 BA.debugLineNum = 1437;BA.debugLine="Sub btnSlideVolver_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 1438;BA.debugLine="openSlide";
Debug.ShouldStop(536870912);
_openslide();
 BA.debugLineNum = 1439;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("btnViewCategoria_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,786);
if (RapidSub.canDelegate("btnviewcategoria_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnviewcategoria_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductobycategoria = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 786;BA.debugLine="Sub btnViewCategoria_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 788;BA.debugLine="Dim b As Button";
Debug.ShouldStop(524288);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 789;BA.debugLine="b = Sender";
Debug.ShouldStop(1048576);
_b.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 790;BA.debugLine="Dim map As Map = b.Tag";
Debug.ShouldStop(2097152);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_b.runMethod(false,"getTag"));Debug.locals.put("map", _map);
 BA.debugLineNum = 791;BA.debugLine="Dim json As String = \"'f_idempresa':\"&idEmpresa&\"";
Debug.ShouldStop(4194304);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_idcategoria':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 793;BA.debugLine="Dim JobProductoByCategoria As HttpJob";
Debug.ShouldStop(16777216);
_jobproductobycategoria = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobProductoByCategoria", _jobproductobycategoria);
 BA.debugLineNum = 794;BA.debugLine="JobProductoByCategoria.Initialize(\"JobProductoByC";
Debug.ShouldStop(33554432);
_jobproductobycategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobProductoByCategoria")),(Object)(principal.getObject()));
 BA.debugLineNum = 795;BA.debugLine="JobProductoByCategoria.PostString(Main.url&\"ws/ge";
Debug.ShouldStop(67108864);
_jobproductobycategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_categoria"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 797;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnViewProducto_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,799);
if (RapidSub.canDelegate("btnviewproducto_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","btnviewproducto_click");}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 799;BA.debugLine="Sub btnViewProducto_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 801;BA.debugLine="If mapEmpresaInfo.IsInitialized And mapEmpresaInf";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(".",principal._mapempresainfo.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",principal._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_laborando")))),(principal.mostCurrent.__c.getField(true,"False")))) { 
 BA.debugLineNum = 802;BA.debugLine="Msgbox(\"No estamos laborando en estos momentos.";
Debug.ShouldStop(2);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 803;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 806;BA.debugLine="Dim b As Button = Sender";
Debug.ShouldStop(32);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
_b.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));Debug.locals.put("b", _b);
 BA.debugLineNum = 807;BA.debugLine="Dim map As Map = b.Tag";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(_b.runMethod(false,"getTag"));Debug.locals.put("map", _map);
 BA.debugLineNum = 808;BA.debugLine="salvar_detalle_temporal(map,1)";
Debug.ShouldStop(128);
_salvar_detalle_temporal(_map,BA.numberCast(int.class, 1));
 BA.debugLineNum = 809;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
		Debug.PushSubsStack("BuscarFavoritos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,139);
if (RapidSub.canDelegate("buscarfavoritos")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","buscarfavoritos");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobfavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 139;BA.debugLine="Sub BuscarFavoritos";
Debug.ShouldStop(1024);
 BA.debugLineNum = 141;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
Debug.ShouldStop(4096);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idempresa':"),RemoteObject.createImmutable(1000));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 143;BA.debugLine="Dim jobFavoritos As HttpJob";
Debug.ShouldStop(16384);
_jobfavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("jobFavoritos", _jobfavoritos);
 BA.debugLineNum = 144;BA.debugLine="jobFavoritos.Initialize(\"buscarFavoritos\",Me)";
Debug.ShouldStop(32768);
_jobfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("buscarFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 145;BA.debugLine="jobFavoritos.PostString(Main.url&\"puntoventa/busc";
Debug.ShouldStop(65536);
_jobfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/buscarfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("cargarAllProductos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,169);
if (RapidSub.canDelegate("cargarallproductos")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","cargarallproductos");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbuscarproducto = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 169;BA.debugLine="Sub cargarAllProductos";
Debug.ShouldStop(256);
 BA.debugLineNum = 171;BA.debugLine="Dim json As String";
Debug.ShouldStop(1024);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 172;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
Debug.ShouldStop(2048);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_parametro':'%'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 174;BA.debugLine="Dim JobBuscarProducto As HttpJob";
Debug.ShouldStop(8192);
_jobbuscarproducto = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobBuscarProducto", _jobbuscarproducto);
 BA.debugLineNum = 175;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
Debug.ShouldStop(16384);
_jobbuscarproducto.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobBuscarProducto")),(Object)(principal.getObject()));
 BA.debugLineNum = 176;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
Debug.ShouldStop(32768);
_jobbuscarproducto.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_by_paramentros"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("cargarCaterorias (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,432);
if (RapidSub.canDelegate("cargarcaterorias")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","cargarcaterorias");}
RemoteObject _jobcategoria = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 432;BA.debugLine="Sub cargarCaterorias";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="Dim JobCategoria As HttpJob";
Debug.ShouldStop(65536);
_jobcategoria = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobCategoria", _jobcategoria);
 BA.debugLineNum = 434;BA.debugLine="JobCategoria.Initialize(\"JobCategoria\",Me)";
Debug.ShouldStop(131072);
_jobcategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobCategoria")),(Object)(principal.getObject()));
 BA.debugLineNum = 435;BA.debugLine="JobCategoria.PostString(Main.url&\"ws/get_categori";
Debug.ShouldStop(262144);
_jobcategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_categorias_by_empresa/"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa))))));
 BA.debugLineNum = 436;BA.debugLine="btnMasVendido.Text = \"Ver ofertas \"";
Debug.ShouldStop(524288);
principal.mostCurrent._btnmasvendido.runMethod(true,"setText",BA.ObjectToCharSequence("Ver ofertas "));
 BA.debugLineNum = 437;BA.debugLine="btnMasVendido.Tag = False";
Debug.ShouldStop(1048576);
principal.mostCurrent._btnmasvendido.runMethod(false,"setTag",(principal.mostCurrent.__c.getField(true,"False")));
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
public static RemoteObject  _cargardatos() throws Exception{
try {
		Debug.PushSubsStack("cargarDatos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,149);
if (RapidSub.canDelegate("cargardatos")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","cargardatos");}
 BA.debugLineNum = 149;BA.debugLine="Sub cargarDatos";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="If actu Then";
Debug.ShouldStop(2097152);
if (principal._actu.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 151;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
Debug.ShouldStop(4194304);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 };
 BA.debugLineNum = 154;BA.debugLine="cargarMasVendido";
Debug.ShouldStop(33554432);
_cargarmasvendido();
 BA.debugLineNum = 155;BA.debugLine="cargarAllProductos";
Debug.ShouldStop(67108864);
_cargarallproductos();
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarlistafavoritos() throws Exception{
try {
		Debug.PushSubsStack("cargarListaFavoritos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,983);
if (RapidSub.canDelegate("cargarlistafavoritos")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","cargarlistafavoritos");}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
int _i = 0;
RemoteObject _mapalist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 983;BA.debugLine="Sub cargarListaFavoritos";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 985;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(16777216);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 986;BA.debugLine="LlistaFavoritos.Clear";
Debug.ShouldStop(33554432);
principal.mostCurrent._llistafavoritos.runVoidMethod ("Clear");
 BA.debugLineNum = 987;BA.debugLine="lblCantProductos.Text = \"Productos Favoritos: \"&l";
Debug.ShouldStop(67108864);
principal.mostCurrent._lblcantproductos.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Productos Favoritos: "),principal._listafavoritos.runMethod(true,"getSize"))));
 BA.debugLineNum = 988;BA.debugLine="For i = 0 To listafavoritos.Size-1";
Debug.ShouldStop(134217728);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {principal._listafavoritos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 989;BA.debugLine="Dim mapalist As Map";
Debug.ShouldStop(268435456);
_mapalist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapalist", _mapalist);
 BA.debugLineNum = 990;BA.debugLine="mapalist = listafavoritos.Get(i)";
Debug.ShouldStop(536870912);
_mapalist.setObject(principal._listafavoritos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 993;BA.debugLine="If  mapalist.Get(\"f_foto\")<> Null And  mapalist.";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("N",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 994;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_foto\"))";
Debug.ShouldStop(2);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 996;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(8);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 };
 BA.debugLineNum = 999;BA.debugLine="mapalist.Put(\"f_red\",True)";
Debug.ShouldStop(64);
_mapalist.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((principal.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 1001;BA.debugLine="LlistaFavoritos.AddTwoLinesAndBitmap2(mapalist.G";
Debug.ShouldStop(256);
principal.mostCurrent._llistafavoritos.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Precio: "),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))),(Object)(_bm.runMethod(false,"getBitmap")),(Object)((_mapalist.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1005;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("cargarMasVendido (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,158);
if (RapidSub.canDelegate("cargarmasvendido")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","cargarmasvendido");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobproductomasvendido = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 158;BA.debugLine="Sub cargarMasVendido";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 160;BA.debugLine="Dim json As String";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 161;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
Debug.ShouldStop(1);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idempresa':"),principal._idempresa);Debug.locals.put("json", _json);
 BA.debugLineNum = 162;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
Debug.ShouldStop(2);
_jobproductomasvendido = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobProductoMasVendido", _jobproductomasvendido);
 BA.debugLineNum = 163;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMasV";
Debug.ShouldStop(4);
_jobproductomasvendido.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobProductoMasVendido")),(Object)(principal.getObject()));
 BA.debugLineNum = 164;BA.debugLine="JobProductoMasVendido.PostString(Main.url&\"ws/get";
Debug.ShouldStop(8);
_jobproductomasvendido.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_productos_main_page"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("cargarViewProductos (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,734);
if (RapidSub.canDelegate("cargarviewproductos")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","cargarviewproductos", _list, _categorias);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _panelheight = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _btn = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("list", _list);
Debug.locals.put("categorias", _categorias);
 BA.debugLineNum = 734;BA.debugLine="Sub cargarViewProductos(list As List, categorias A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 736;BA.debugLine="Dim map As Map";
Debug.ShouldStop(-2147483648);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 737;BA.debugLine="Dim height,  panelHeight As Int";
Debug.ShouldStop(1);
_height = RemoteObject.createImmutable(0);Debug.locals.put("height", _height);
_panelheight = RemoteObject.createImmutable(0);Debug.locals.put("panelHeight", _panelheight);
 BA.debugLineNum = 738;BA.debugLine="panelHeight = 2%y";
Debug.ShouldStop(2);
_panelheight = principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("panelHeight", _panelheight);
 BA.debugLineNum = 739;BA.debugLine="height = 18%y";
Debug.ShouldStop(4);
_height = principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 18)),principal.mostCurrent.activityBA);Debug.locals.put("height", _height);
 BA.debugLineNum = 741;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
Debug.ShouldStop(16);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 742;BA.debugLine="ViewCategoria.Tag = categorias";
Debug.ShouldStop(32);
principal.mostCurrent._viewcategoria.runMethod(false,"setTag",(_categorias));
 BA.debugLineNum = 743;BA.debugLine="ViewCategoria.Panel.Height = 100%y";
Debug.ShouldStop(64);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"setHeight",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 744;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(128);
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8) ;_i = ((int)(0 + _i + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 745;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(256);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 747;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(1024);
_btn = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 748;BA.debugLine="If categorias Then";
Debug.ShouldStop(2048);
if (_categorias.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 749;BA.debugLine="btn.Initialize(\"btnViewCategoria\")";
Debug.ShouldStop(4096);
_btn.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnViewCategoria")));
 }else {
 BA.debugLineNum = 751;BA.debugLine="btn.Initialize(\"btnViewProducto\")";
Debug.ShouldStop(16384);
_btn.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("btnViewProducto")));
 };
 BA.debugLineNum = 754;BA.debugLine="btn.Tag = map";
Debug.ShouldStop(131072);
_btn.runMethod(false,"setTag",(_map.getObject()));
 BA.debugLineNum = 755;BA.debugLine="btn.TextColor = Colors.White";
Debug.ShouldStop(262144);
_btn.runMethod(true,"setTextColor",principal.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 756;BA.debugLine="btn.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
Debug.ShouldStop(524288);
_btn.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 759;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(4194304);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 760;BA.debugLine="If categorias Then";
Debug.ShouldStop(8388608);
if (_categorias.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 761;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fot";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 762;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(33554432);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 764;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"cook-";
Debug.ShouldStop(134217728);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("cook-food.jpeg"))).getObject())));
 BA.debugLineNum = 765;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(268435456);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 BA.debugLineNum = 767;BA.debugLine="btn.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(1073741824);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 768;BA.debugLine="btn.TextSize = 20";
Debug.ShouldStop(-2147483648);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 20));
 }else {
 BA.debugLineNum = 770;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pexels";
Debug.ShouldStop(2);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("pexels-photo.jpeg"))).getObject())));
 BA.debugLineNum = 771;BA.debugLine="bm.Gravity = Gravity.CENTER";
Debug.ShouldStop(4);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"CENTER"));
 BA.debugLineNum = 772;BA.debugLine="btn.Text = map.Get(\"f_descripcion\") &CRLF&CRLF&";
Debug.ShouldStop(8);
_btn.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion")))),principal.mostCurrent.__c.getField(true,"CRLF"),principal.mostCurrent.__c.getField(true,"CRLF"),RemoteObject.createImmutable("RD$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 773;BA.debugLine="btn.TextSize = 15";
Debug.ShouldStop(16);
_btn.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 };
 BA.debugLineNum = 775;BA.debugLine="btn.Background = bm";
Debug.ShouldStop(64);
_btn.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 777;BA.debugLine="ViewCategoria.Panel.AddView(btn,2%x, panelHeight";
Debug.ShouldStop(256);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_btn.getObject())),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA)),(Object)(_panelheight),(Object)(principal.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 90)),principal.mostCurrent.activityBA)),(Object)(_height));
 BA.debugLineNum = 778;BA.debugLine="btn.Visible = False";
Debug.ShouldStop(512);
_btn.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 779;BA.debugLine="btn.SetVisibleAnimated(500,True)";
Debug.ShouldStop(1024);
_btn.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 781;BA.debugLine="panelHeight = height + panelHeight + 2%y";
Debug.ShouldStop(4096);
_panelheight = RemoteObject.solve(new RemoteObject[] {_height,_panelheight,principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA)}, "++",2, 1);Debug.locals.put("panelHeight", _panelheight);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 783;BA.debugLine="ViewCategoria.Panel.Height = panelHeight";
Debug.ShouldStop(16384);
principal.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"setHeight",_panelheight);
 BA.debugLineNum = 784;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 29;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 35;BA.debugLine="Dim sm As SlideMenu";
principal.mostCurrent._sm = RemoteObject.createNew ("com.jq.pedidos.slidemenu");
 //BA.debugLineNum = 37;BA.debugLine="Private ViewCategoria As ScrollView";
principal.mostCurrent._viewcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnAbierto As Button";
principal.mostCurrent._btnabierto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private btnEmpresaInfo As Button";
principal.mostCurrent._btnempresainfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private btnMasVendido As Button";
principal.mostCurrent._btnmasvendido = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private btnOrden As Button";
principal.mostCurrent._btnorden = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private btnPrincipalBack As Button";
principal.mostCurrent._btnprincipalback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private lblLema As Label";
principal.mostCurrent._lbllema = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private PanelCategoria As Panel";
principal.mostCurrent._panelcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private PanelMenu As Panel";
principal.mostCurrent._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private PanelTitulo As Panel";
principal.mostCurrent._paneltitulo = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private lblCategoria As Label";
principal.mostCurrent._lblcategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private lblCantidadProductos As Label";
principal.mostCurrent._lblcantidadproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private btnBuscarProducto As Button";
principal.mostCurrent._btnbuscarproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private btnProductoVolver As Button";
principal.mostCurrent._btnproductovolver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 55;BA.debugLine="Private ListProductosModalView As ListView";
principal.mostCurrent._listproductosmodalview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private PanelModalProducto As Panel";
principal.mostCurrent._panelmodalproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private txtBuscarProducto As EditText";
principal.mostCurrent._txtbuscarproducto = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private btnProductoBuscarModal As Button";
principal.mostCurrent._btnproductobuscarmodal = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private btnInfoCerrar As Button";
principal.mostCurrent._btninfocerrar = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private PanelInfoBack As Panel";
principal.mostCurrent._panelinfoback = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private lblDireccion As Label";
principal.mostCurrent._lbldireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private lblInfoEmpresa As Label";
principal.mostCurrent._lblinfoempresa = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private lblInfoNegocio As Label";
principal.mostCurrent._lblinfonegocio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private lblPedidoMinimo As Label";
principal.mostCurrent._lblpedidominimo = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 67;BA.debugLine="Private lblTelefono As Label";
principal.mostCurrent._lbltelefono = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private PanelSlide As Panel";
principal.mostCurrent._panelslide = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private PanelSlideBack As Panel";
principal.mostCurrent._panelslideback = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private btnSlideVolver As Button";
principal.mostCurrent._btnslidevolver = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Dim hscrol As HorizontalScrollView";
principal.mostCurrent._hscrol = RemoteObject.createNew ("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private btnagregarCarritoDetalle As Button";
principal.mostCurrent._btnagregarcarritodetalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private btnBackDetalles As Button";
principal.mostCurrent._btnbackdetalles = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private btnless As Button";
principal.mostCurrent._btnless = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private btnMore As Button";
principal.mostCurrent._btnmore = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private lblcantidad As Label";
principal.mostCurrent._lblcantidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private PanelFondoDetalles As Panel";
principal.mostCurrent._panelfondodetalles = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private lblPrecioEncabezado As Label";
principal.mostCurrent._lblprecioencabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 86;BA.debugLine="Private lblNombeEncabezado As Label";
principal.mostCurrent._lblnombeencabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 87;BA.debugLine="Private lblPrecio As Label";
principal.mostCurrent._lblprecio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 88;BA.debugLine="Private ImageViewDetalles As ImageView";
principal.mostCurrent._imageviewdetalles = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 89;BA.debugLine="Private PanelFondoFavorito As Panel";
principal.mostCurrent._panelfondofavorito = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 90;BA.debugLine="Private btnBackFavoritos As Button";
principal.mostCurrent._btnbackfavoritos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 91;BA.debugLine="Private lblCantProductos As Label";
principal.mostCurrent._lblcantproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 92;BA.debugLine="Private LlistaFavoritos As ListView";
principal.mostCurrent._llistafavoritos = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 93;BA.debugLine="Private btnIniciarSecion As Button";
principal.mostCurrent._btniniciarsecion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 94;BA.debugLine="Private btnBackAboutus As Button";
principal.mostCurrent._btnbackaboutus = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 95;BA.debugLine="Private PanelFondoAboutus As Panel";
principal.mostCurrent._panelfondoaboutus = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 96;BA.debugLine="Private imgdetallefav As ImageView";
principal.mostCurrent._imgdetallefav = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgdetallefav_click() throws Exception{
try {
		Debug.PushSubsStack("imgdetallefav_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1009);
if (RapidSub.canDelegate("imgdetallefav_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","imgdetallefav_click");}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _r = RemoteObject.createImmutable(0);
RemoteObject _listaaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _i = 0;
RemoteObject _mapadel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _deletefavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _bmaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _putfavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 1009;BA.debugLine="Sub imgdetallefav_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 1012;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(524288);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1014;BA.debugLine="If imgfavDetalle Then";
Debug.ShouldStop(2097152);
if (principal._imgfavdetalle.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1016;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(8388608);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 1017;BA.debugLine="img  = Sender";
Debug.ShouldStop(16777216);
_img.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 1019;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(67108864);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 1020;BA.debugLine="mapa = img.Tag";
Debug.ShouldStop(134217728);
_mapa.setObject(_img.runMethod(false,"getTag"));
 BA.debugLineNum = 1022;BA.debugLine="If mapa.Get(\"f_red\") Then";
Debug.ShouldStop(536870912);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_red"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1024;BA.debugLine="Dim r As Int";
Debug.ShouldStop(-2147483648);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
 BA.debugLineNum = 1025;BA.debugLine="r = Msgbox2(\"Desea eliminar este producto de s";
Debug.ShouldStop(1);
_r = principal.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Desea eliminar este producto de su lista de favoritos?")),(Object)(BA.ObjectToCharSequence("Aviso")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((principal.mostCurrent.__c.getField(false,"Null"))),principal.mostCurrent.activityBA);Debug.locals.put("r", _r);
 BA.debugLineNum = 1027;BA.debugLine="If r == DialogResponse.POSITIVE Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, principal.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 1029;BA.debugLine="Dim listaaux As List";
Debug.ShouldStop(16);
_listaaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listaaux", _listaaux);
 BA.debugLineNum = 1030;BA.debugLine="listaaux.Initialize";
Debug.ShouldStop(32);
_listaaux.runVoidMethod ("Initialize");
 BA.debugLineNum = 1032;BA.debugLine="For i=0 To listafavoritos.Size-1";
Debug.ShouldStop(128);
{
final int step13 = 1;
final int limit13 = RemoteObject.solve(new RemoteObject[] {principal._listafavoritos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step13 > 0 && _i <= limit13) || (step13 < 0 && _i >= limit13) ;_i = ((int)(0 + _i + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 1034;BA.debugLine="Dim mapadel As Map";
Debug.ShouldStop(512);
_mapadel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapadel", _mapadel);
 BA.debugLineNum = 1035;BA.debugLine="mapadel = listafavoritos.Get(i)";
Debug.ShouldStop(1024);
_mapadel.setObject(principal._listafavoritos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 1037;BA.debugLine="If mapa.Get(\"f_idrecord\") <> mapadel.Get(\"f_";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mapadel.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 1039;BA.debugLine="listaaux.Add(mapadel)";
Debug.ShouldStop(16384);
_listaaux.runVoidMethod ("Add",(Object)((_mapadel.getObject())));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 1044;BA.debugLine="listafavoritos.Clear";
Debug.ShouldStop(524288);
principal._listafavoritos.runVoidMethod ("Clear");
 BA.debugLineNum = 1045;BA.debugLine="listafavoritos = listaaux";
Debug.ShouldStop(1048576);
principal._listafavoritos = _listaaux;
 BA.debugLineNum = 1047;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.us";
Debug.ShouldStop(4194304);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1050;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(33554432);
_deletefavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 1051;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",";
Debug.ShouldStop(67108864);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 1052;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoven";
Debug.ShouldStop(134217728);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 1054;BA.debugLine="cargarListaFavoritos";
Debug.ShouldStop(536870912);
_cargarlistafavoritos();
 BA.debugLineNum = 1055;BA.debugLine="isfav = True";
Debug.ShouldStop(1073741824);
principal._isfav = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1056;BA.debugLine="imgfavDetalle= False";
Debug.ShouldStop(-2147483648);
principal._imgfavdetalle = principal.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 1057;BA.debugLine="actualizame = True";
Debug.ShouldStop(1);
principal._actualizame = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1058;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(2);
_btnbackdetalles_click();
 }else {
 BA.debugLineNum = 1061;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return RemoteObject.createImmutable("");
 };
 };
 }else {
 BA.debugLineNum = 1069;BA.debugLine="Dim bmaux As BitmapDrawable";
Debug.ShouldStop(4096);
_bmaux = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmaux", _bmaux);
 BA.debugLineNum = 1070;BA.debugLine="If mapaDetalle.Get(\"f_red\") Then";
Debug.ShouldStop(8192);
if (BA.ObjectToBoolean(principal._mapadetalle.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_red"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1072;BA.debugLine="bmaux.Initialize(LoadBitmap(File.DirAssets,\"he";
Debug.ShouldStop(32768);
_bmaux.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png"))).getObject())));
 BA.debugLineNum = 1073;BA.debugLine="bmaux.Gravity = Gravity.FILL";
Debug.ShouldStop(65536);
_bmaux.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 1075;BA.debugLine="imgdetallefav.Background = bmaux";
Debug.ShouldStop(262144);
principal.mostCurrent._imgdetallefav.runMethod(false,"setBackground",(_bmaux.getObject()));
 BA.debugLineNum = 1077;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.use";
Debug.ShouldStop(1048576);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),principal._mapadetalle.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1080;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(8388608);
_deletefavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 1081;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",M";
Debug.ShouldStop(16777216);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 1082;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntovent";
Debug.ShouldStop(33554432);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 1084;BA.debugLine="mapaDetalle.Put(\"f_red\",False)";
Debug.ShouldStop(134217728);
principal._mapadetalle.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((principal.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 1085;BA.debugLine="actu = True";
Debug.ShouldStop(268435456);
principal._actu = principal.mostCurrent.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 1089;BA.debugLine="bmaux.Initialize(LoadBitmap(File.DirAssets,\"he";
Debug.ShouldStop(1);
_bmaux.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 1090;BA.debugLine="bmaux.Gravity = Gravity.FILL";
Debug.ShouldStop(2);
_bmaux.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 1092;BA.debugLine="imgdetallefav.Background = bmaux";
Debug.ShouldStop(8);
principal.mostCurrent._imgdetallefav.runMethod(false,"setBackground",(_bmaux.getObject()));
 BA.debugLineNum = 1094;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.use";
Debug.ShouldStop(32);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),principal._mapadetalle.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 1097;BA.debugLine="Dim putFavoritos As HttpJob";
Debug.ShouldStop(256);
_putfavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("putFavoritos", _putfavoritos);
 BA.debugLineNum = 1098;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
Debug.ShouldStop(512);
_putfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("addFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 1099;BA.debugLine="putFavoritos.PostString(Main.url&\"puntoventa/a";
Debug.ShouldStop(1024);
_putfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/addfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 1101;BA.debugLine="mapaDetalle.Put(\"f_red\",True)";
Debug.ShouldStop(4096);
principal._mapadetalle.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((principal.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 1102;BA.debugLine="actu = True";
Debug.ShouldStop(8192);
principal._actu = principal.mostCurrent.__c.getField(true,"True");
 };
 };
 }else {
 BA.debugLineNum = 1110;BA.debugLine="Msgbox(\"Para agregar productos a favoritos prim";
Debug.ShouldStop(2097152);
principal.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Para agregar productos a favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),principal.mostCurrent.activityBA);
 };
 BA.debugLineNum = 1113;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("imgFav_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,299);
if (RapidSub.canDelegate("imgfav_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","imgfav_click");}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _deletefavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _putfavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _res = RemoteObject.createImmutable(0);
 BA.debugLineNum = 299;BA.debugLine="Sub imgFav_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 301;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(4096);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 303;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(16384);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 304;BA.debugLine="img.Initialize(\"\")";
Debug.ShouldStop(32768);
_img.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 305;BA.debugLine="img = Sender";
Debug.ShouldStop(65536);
_img.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 307;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(262144);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 308;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(524288);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 310;BA.debugLine="mapa = img.Tag";
Debug.ShouldStop(2097152);
_mapa.setObject(_img.runMethod(false,"getTag"));
 BA.debugLineNum = 312;BA.debugLine="mapaDetalleImagen = mapa";
Debug.ShouldStop(8388608);
principal._mapadetalleimagen = _mapa;
 BA.debugLineNum = 314;BA.debugLine="Dim bm As  BitmapDrawable";
Debug.ShouldStop(33554432);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 316;BA.debugLine="If mapa.Get(\"f_red\") Then";
Debug.ShouldStop(134217728);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_red"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 318;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartW";
Debug.ShouldStop(536870912);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png"))).getObject())));
 BA.debugLineNum = 319;BA.debugLine="img.Background = bm";
Debug.ShouldStop(1073741824);
_img.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 320;BA.debugLine="mapa.Put(\"f_red\",False)";
Debug.ShouldStop(-2147483648);
_mapa.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((principal.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 322;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
Debug.ShouldStop(2);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idproducto")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 325;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(16);
_deletefavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 326;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me";
Debug.ShouldStop(32);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 327;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoventa";
Debug.ShouldStop(64);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 332;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartR";
Debug.ShouldStop(2048);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 333;BA.debugLine="img.Background = bm";
Debug.ShouldStop(4096);
_img.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 334;BA.debugLine="mapa.Put(\"f_red\",True)";
Debug.ShouldStop(8192);
_mapa.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((principal.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 336;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
Debug.ShouldStop(32768);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),principal.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idproducto")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 339;BA.debugLine="Dim putFavoritos As HttpJob";
Debug.ShouldStop(262144);
_putfavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("putFavoritos", _putfavoritos);
 BA.debugLineNum = 340;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
Debug.ShouldStop(524288);
_putfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("addFavoritos")),(Object)(principal.getObject()));
 BA.debugLineNum = 341;BA.debugLine="putFavoritos.PostString(Main.url&\"puntoventa/ad";
Debug.ShouldStop(1048576);
_putfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/addfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 };
 }else {
 BA.debugLineNum = 347;BA.debugLine="Dim res As Int";
Debug.ShouldStop(67108864);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 349;BA.debugLine="res = Msgbox2(\"Para agregar un producto a favori";
Debug.ShouldStop(268435456);
_res = principal.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para agregar un producto a favoritos primero debe iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar sesión")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Mas tarde")),(Object)((principal.mostCurrent.__c.getField(false,"Null"))),principal.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 351;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, principal.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 352;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._main._mostar /*RemoteObject*/  = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 353;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(1);
principal.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((principal.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 356;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.ShouldStop(128);
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
		Debug.PushSubsStack("JobDone (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,440);
if (RapidSub.canDelegate("jobdone")) { com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","jobdone", _job); return;}
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
public ResumableSub_JobDone(com.jq.pedidos.principal parent,RemoteObject _job) {
this.parent = parent;
this._job = _job;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.principal parent;
RemoteObject _job;
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _lef = RemoteObject.createImmutable(0);
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _widhth = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _lblmasvendidos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _alttop = RemoteObject.createImmutable(0);
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _lefpro = RemoteObject.createImmutable(0);
RemoteObject _mapalist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int step56;
int limit56;
int step83;
int limit83;
int step107;
int limit107;
int step135;
int limit135;
int step162;
int limit162;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("JobDone (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,440);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("Job", _job);
 BA.debugLineNum = 442;BA.debugLine="If btnProductoBuscarModal.IsInitialized And btnPr";
Debug.ShouldStop(33554432);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean(".",parent.mostCurrent._btnproductobuscarmodal.runMethod(true,"IsInitialized")) && RemoteObject.solveBoolean("=",parent.mostCurrent._btnproductobuscarmodal.runMethod(true,"getEnabled"),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 443;BA.debugLine="btnProductoBuscarModal.Enabled = True";
Debug.ShouldStop(67108864);
parent.mostCurrent._btnproductobuscarmodal.runMethod(true,"setEnabled",parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;
;
 BA.debugLineNum = 446;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(536870912);

case 4:
//if
this.state = 7;
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 447;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(parent.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(parent.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),principal.mostCurrent.activityBA);
 BA.debugLineNum = 448;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;
;
 BA.debugLineNum = 451;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(4);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",parent.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ ))),parent.mostCurrent.__c.getField(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 452;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
 BA.debugLineNum = 455;BA.debugLine="Dim map As Map";
Debug.ShouldStop(64);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 456;BA.debugLine="Dim list As List";
Debug.ShouldStop(128);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 457;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(256);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 458;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(512);
_json.runVoidMethod ("Initialize",(Object)(parent.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 459;BA.debugLine="Log(\"KLOK\"&funcion.base64_Decode(Job.GetString))";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62490387",RemoteObject.concat(RemoteObject.createImmutable("KLOK"),parent.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))),0);
 BA.debugLineNum = 460;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(2048);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 463;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16384);
if (true) break;

case 11:
//select
this.state = 140;
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobEmpresaInfo"),BA.ObjectToString("JobCategoria"),BA.ObjectToString("JobProductoByCategoria"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("JobProductoMasVendido"),BA.ObjectToString("JobBuscarProducto"),BA.ObjectToString("JobBuscarProductoLista"),BA.ObjectToString("buscarFavoritos"),BA.ObjectToString("addFavoritos"),BA.ObjectToString("deleteFavoritos"),BA.ObjectToString("RefreshFavoritos"),BA.ObjectToString("cantidadPro"))) {
case 0: {
this.state = 13;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
case 3: {
this.state = 23;
if (true) break;
}
case 4: {
this.state = 29;
if (true) break;
}
case 5: {
this.state = 35;
if (true) break;
}
case 6: {
this.state = 83;
if (true) break;
}
case 7: {
this.state = 99;
if (true) break;
}
case 8: {
this.state = 105;
if (true) break;
}
case 9: {
this.state = 113;
if (true) break;
}
case 10: {
this.state = 129;
if (true) break;
}
case 11: {
this.state = 135;
if (true) break;
}
}
if (true) break;

case 13:
//C
this.state = 140;
 BA.debugLineNum = 467;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(262144);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 468;BA.debugLine="mapEmpresaInfo = list.Get(0)";
Debug.ShouldStop(524288);
parent._mapempresainfo.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));
 BA.debugLineNum = 469;BA.debugLine="isUsa = mapEmpresaInfo.Get(\"f_adressusa\")";
Debug.ShouldStop(1048576);
parent._isusa = BA.ObjectToBoolean(parent._mapempresainfo.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_adressusa")))));
 if (true) break;

case 15:
//C
this.state = 140;
 BA.debugLineNum = 481;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(1);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 482;BA.debugLine="lblCategoria.Text = list.Size & \" Categotias\"";
Debug.ShouldStop(2);
parent.mostCurrent._lblcategoria.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_list.runMethod(true,"getSize"),RemoteObject.createImmutable(" Categotias"))));
 BA.debugLineNum = 483;BA.debugLine="cargarViewProductos(list, True)";
Debug.ShouldStop(4);
_cargarviewproductos(_list,parent.mostCurrent.__c.getField(true,"True"));
 if (true) break;

case 17:
//C
this.state = 18;
 BA.debugLineNum = 486;BA.debugLine="Msgbox(\"\",\"PRODUCTOS AHORA\")";
Debug.ShouldStop(32);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("PRODUCTOS AHORA"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 487;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(64);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 488;BA.debugLine="Log(map.Get(\"f_data\"))";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("LogImpl","62490416",BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))),0);
 BA.debugLineNum = 489;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(256);
if (true) break;

case 18:
//if
this.state = 21;
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
 BA.debugLineNum = 490;BA.debugLine="Msgbox(\"Esta categoria no tiene productos.\",\"I";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Esta categoria no tiene productos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 491;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 140;
;
 BA.debugLineNum = 494;BA.debugLine="lblCategoria.SetTextColorAnimated(300,Colors.Tr";
Debug.ShouldStop(8192);
parent.mostCurrent._lblcategoria.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 300)),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 501;BA.debugLine="PanelCategoria.Tag = list";
Debug.ShouldStop(1048576);
parent.mostCurrent._panelcategoria.runMethod(false,"setTag",(_list.getObject()));
 BA.debugLineNum = 502;BA.debugLine="lblCategoria.Text =  list.Size & \" Productos\"";
Debug.ShouldStop(2097152);
parent.mostCurrent._lblcategoria.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(_list.runMethod(true,"getSize"),RemoteObject.createImmutable(" Productos"))));
 BA.debugLineNum = 503;BA.debugLine="lblCategoria.SetTextColorAnimated(200,Colors.Bl";
Debug.ShouldStop(4194304);
parent.mostCurrent._lblcategoria.runVoidMethod ("SetTextColorAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(parent.mostCurrent.__c.getField(false,"Colors").getField(true,"Black")));
 BA.debugLineNum = 504;BA.debugLine="cargarViewProductos(list, False)";
Debug.ShouldStop(8388608);
_cargarviewproductos(_list,parent.mostCurrent.__c.getField(true,"False"));
 if (true) break;

case 23:
//C
this.state = 24;
 BA.debugLineNum = 509;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(268435456);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 510;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(536870912);
if (true) break;

case 24:
//if
this.state = 27;
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 511;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),parent.mostCurrent.__c.getField(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable(".")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 512;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 140;
;
 BA.debugLineNum = 514;BA.debugLine="cantidadProduto = cantidadProduto + 1";
Debug.ShouldStop(2);
parent._cantidadproduto = RemoteObject.solve(new RemoteObject[] {parent._cantidadproduto,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 515;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(4);
parent.mostCurrent._lblcantidadproductos.runMethod(true,"setText",BA.ObjectToCharSequence(parent._cantidadproduto));
 BA.debugLineNum = 516;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(8);
parent.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 517;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto agregado al carrito.")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 520;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(128);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 524;BA.debugLine="Dim lef As Int = 2%x";
Debug.ShouldStop(2048);
_lef = parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("lef", _lef);Debug.locals.put("lef", _lef);
 BA.debugLineNum = 525;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(4096);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 526;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(8192);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 528;BA.debugLine="Dim widhth As Int = list.Size*47%x";
Debug.ShouldStop(32768);
_widhth = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),principal.mostCurrent.activityBA)}, "*",0, 1);Debug.locals.put("widhth", _widhth);Debug.locals.put("widhth", _widhth);
 BA.debugLineNum = 529;BA.debugLine="hscrol.Initialize(widhth,\"\")";
Debug.ShouldStop(65536);
parent.mostCurrent._hscrol.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(_widhth),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 531;BA.debugLine="For i = 0 To list.Size-1";
Debug.ShouldStop(262144);
if (true) break;

case 30:
//for
this.state = 33;
step56 = 1;
limit56 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 141;
if (true) break;

case 141:
//C
this.state = 33;
if ((step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56)) this.state = 32;
if (true) break;

case 142:
//C
this.state = 141;
_i = ((int)(0 + _i + step56)) ;
Debug.locals.put("i", _i);
if (true) break;

case 32:
//C
this.state = 142;
 BA.debugLineNum = 532;BA.debugLine="mapa = list.Get(i)";
Debug.ShouldStop(524288);
_mapa.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 533;BA.debugLine="hscrol.Panel.AddView(funcion.createPanelProduc";
Debug.ShouldStop(1048576);
parent.mostCurrent._hscrol.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._funcion.runMethod(false,"_createpanelproducto" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_mapa)).getObject())),(Object)(_lef),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 38)),principal.mostCurrent.activityBA)));
 BA.debugLineNum = 534;BA.debugLine="lef = lef + 47%x";
Debug.ShouldStop(2097152);
_lef = RemoteObject.solve(new RemoteObject[] {_lef,parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("lef", _lef);
 if (true) break;
if (true) break;

case 33:
//C
this.state = 140;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 536;BA.debugLine="hscrol.Color = Colors.RGB(237, 237, 238)";
Debug.ShouldStop(8388608);
parent.mostCurrent._hscrol.runVoidMethod ("setColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 237)),(Object)(BA.numberCast(int.class, 237)),(Object)(BA.numberCast(int.class, 238))));
 BA.debugLineNum = 538;BA.debugLine="Dim lblmasVendidos As Label";
Debug.ShouldStop(33554432);
_lblmasvendidos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblmasVendidos", _lblmasvendidos);
 BA.debugLineNum = 539;BA.debugLine="lblmasVendidos.Initialize(\"\")";
Debug.ShouldStop(67108864);
_lblmasvendidos.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 541;BA.debugLine="lblmasVendidos.Text = \"Mas vendidos\"";
Debug.ShouldStop(268435456);
_lblmasvendidos.runMethod(true,"setText",BA.ObjectToCharSequence("Mas vendidos"));
 BA.debugLineNum = 542;BA.debugLine="lblmasVendidos.TextColor = Colors.RGB(97, 97, 9";
Debug.ShouldStop(536870912);
_lblmasvendidos.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 543;BA.debugLine="lblmasVendidos.TextSize = 16";
Debug.ShouldStop(1073741824);
_lblmasvendidos.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 545;BA.debugLine="ViewCategoria.Panel.AddView(lblmasVendidos,2%x,";
Debug.ShouldStop(1);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lblmasvendidos.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA)),(Object)(BA.numberCast(int.class, 0)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),principal.mostCurrent.activityBA)));
 BA.debugLineNum = 547;BA.debugLine="ViewCategoria.Panel.AddView(hscrol,1%x,lblmasVe";
Debug.ShouldStop(4);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._hscrol.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),principal.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {_lblmasvendidos.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),principal.mostCurrent.activityBA)}, "+",1, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 95)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),principal.mostCurrent.activityBA)));
 if (true) break;

case 35:
//C
this.state = 36;
 BA.debugLineNum = 553;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(256);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 554;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 36:
//if
this.state = 39;
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
 BA.debugLineNum = 555;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se ha encontrado productos con esta referencia")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 556;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return ;
 if (true) break;

case 39:
//C
this.state = 40;
;
 BA.debugLineNum = 559;BA.debugLine="Dim lblProductos As Label";
Debug.ShouldStop(16384);
_lblproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblProductos", _lblproductos);
 BA.debugLineNum = 560;BA.debugLine="lblProductos.Initialize(\"\")";
Debug.ShouldStop(32768);
_lblproductos.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 562;BA.debugLine="lblProductos.Text = \"Productos\"";
Debug.ShouldStop(131072);
_lblproductos.runMethod(true,"setText",BA.ObjectToCharSequence("Productos"));
 BA.debugLineNum = 563;BA.debugLine="lblProductos.TextSize = 16";
Debug.ShouldStop(262144);
_lblproductos.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 564;BA.debugLine="lblProductos.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(524288);
_lblproductos.runMethod(true,"setTextColor",parent.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 566;BA.debugLine="ViewCategoria.Panel.AddView(lblProductos,1%x,hs";
Debug.ShouldStop(2097152);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_lblproductos.getObject())),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),principal.mostCurrent.activityBA)),(Object)(RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._hscrol.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),principal.mostCurrent.activityBA)}, "+",1, 1)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 70)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),principal.mostCurrent.activityBA)));
 BA.debugLineNum = 568;BA.debugLine="If list.Size > 20 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 40:
//if
this.state = 81;
if (RemoteObject.solveBoolean(">",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 20))) { 
this.state = 42;
}else {
this.state = 64;
}if (true) break;

case 42:
//C
this.state = 43;
 BA.debugLineNum = 570;BA.debugLine="Dim alttop As Int  = lblProductos.Top + 6%y";
Debug.ShouldStop(33554432);
_alttop = RemoteObject.solve(new RemoteObject[] {_lblproductos.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);Debug.locals.put("alttop", _alttop);
 BA.debugLineNum = 572;BA.debugLine="For i=0 To 19";
Debug.ShouldStop(134217728);
if (true) break;

case 43:
//for
this.state = 62;
step83 = 1;
limit83 = 19;
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 143;
if (true) break;

case 143:
//C
this.state = 62;
if ((step83 > 0 && _i <= limit83) || (step83 < 0 && _i >= limit83)) this.state = 45;
if (true) break;

case 144:
//C
this.state = 143;
_i = ((int)(0 + _i + step83)) ;
Debug.locals.put("i", _i);
if (true) break;

case 45:
//C
this.state = 46;
 BA.debugLineNum = 573;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(268435456);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 574;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(536870912);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 575;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
Debug.ShouldStop(1073741824);
if (true) break;

case 46:
//if
this.state = 51;
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
 BA.debugLineNum = 576;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(-2147483648);
_bm = parent.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 if (true) break;

case 50:
//C
this.state = 51;
 BA.debugLineNum = 579;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-";
Debug.ShouldStop(4);
_bm.runVoidMethod ("Initialize",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 if (true) break;

case 51:
//C
this.state = 52;
;
 BA.debugLineNum = 582;BA.debugLine="Dim lefpro As Int = 2%x";
Debug.ShouldStop(32);
_lefpro = parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("lefpro", _lefpro);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 584;BA.debugLine="If i Mod 2 == 0 Then";
Debug.ShouldStop(128);
if (true) break;

case 52:
//if
this.state = 61;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 54;
}else {
this.state = 60;
}if (true) break;

case 54:
//C
this.state = 55;
 BA.debugLineNum = 586;BA.debugLine="lefpro = 2%x";
Debug.ShouldStop(512);
_lefpro = parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 587;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
Debug.ShouldStop(1024);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._funcion.runMethod(false,"_createpanelproductoscroll" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_map),(Object)(_bm)).getObject())),(Object)(_lefpro),(Object)(_alttop),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),principal.mostCurrent.activityBA)));
 BA.debugLineNum = 589;BA.debugLine="If i == list.Size-1 Then";
Debug.ShouldStop(4096);
if (true) break;

case 55:
//if
this.state = 58;
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
 BA.debugLineNum = 590;BA.debugLine="alttop = alttop+37%y";
Debug.ShouldStop(8192);
_alttop = RemoteObject.solve(new RemoteObject[] {_alttop,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 37)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);
 if (true) break;

case 58:
//C
this.state = 61;
;
 if (true) break;

case 60:
//C
this.state = 61;
 BA.debugLineNum = 595;BA.debugLine="lefpro = lefpro + 47%x";
Debug.ShouldStop(262144);
_lefpro = RemoteObject.solve(new RemoteObject[] {_lefpro,parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 596;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
Debug.ShouldStop(524288);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._funcion.runMethod(false,"_createpanelproductoscroll" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_map),(Object)(_bm)).getObject())),(Object)(_lefpro),(Object)(_alttop),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),principal.mostCurrent.activityBA)));
 BA.debugLineNum = 597;BA.debugLine="alttop = alttop+37%y";
Debug.ShouldStop(1048576);
_alttop = RemoteObject.solve(new RemoteObject[] {_alttop,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 37)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);
 if (true) break;

case 61:
//C
this.state = 144;
;
 if (true) break;
if (true) break;

case 62:
//C
this.state = 81;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 603;BA.debugLine="ViewCategoria.Panel.Height = alttop";
Debug.ShouldStop(67108864);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"setHeight",_alttop);
 if (true) break;

case 64:
//C
this.state = 65;
 BA.debugLineNum = 607;BA.debugLine="Dim alttop As Int  = lblProductos.Top + 6%y";
Debug.ShouldStop(1073741824);
_alttop = RemoteObject.solve(new RemoteObject[] {_lblproductos.runMethod(true,"getTop"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);Debug.locals.put("alttop", _alttop);
 BA.debugLineNum = 609;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(1);
if (true) break;

case 65:
//for
this.state = 80;
step107 = 1;
limit107 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 145;
if (true) break;

case 145:
//C
this.state = 80;
if ((step107 > 0 && _i <= limit107) || (step107 < 0 && _i >= limit107)) this.state = 67;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step107)) ;
Debug.locals.put("i", _i);
if (true) break;

case 67:
//C
this.state = 68;
 BA.debugLineNum = 610;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(2);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 611;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(4);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 612;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
Debug.ShouldStop(8);
if (true) break;

case 68:
//if
this.state = 73;
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
this.state = 70;
}else {
this.state = 72;
}if (true) break;

case 70:
//C
this.state = 73;
 BA.debugLineNum = 613;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(16);
_bm = parent.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 if (true) break;

case 72:
//C
this.state = 73;
 BA.debugLineNum = 615;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pac";
Debug.ShouldStop(64);
_bm.runVoidMethod ("Initialize",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("packing.png"))).getObject())));
 if (true) break;

case 73:
//C
this.state = 74;
;
 BA.debugLineNum = 620;BA.debugLine="Dim lefpro As Int = 2%x";
Debug.ShouldStop(2048);
_lefpro = parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("lefpro", _lefpro);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 622;BA.debugLine="If i Mod 2 == 0 Then";
Debug.ShouldStop(8192);
if (true) break;

case 74:
//if
this.state = 79;
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
 BA.debugLineNum = 624;BA.debugLine="lefpro = 2%x";
Debug.ShouldStop(32768);
_lefpro = parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),principal.mostCurrent.activityBA);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 625;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
Debug.ShouldStop(65536);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._funcion.runMethod(false,"_createpanelproductoscroll" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_map),(Object)(_bm)).getObject())),(Object)(_lefpro),(Object)(_alttop),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),principal.mostCurrent.activityBA)));
 if (true) break;

case 78:
//C
this.state = 79;
 BA.debugLineNum = 629;BA.debugLine="ViewCategoria.Panel.Height = ViewCategoria.P";
Debug.ShouldStop(1048576);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"setHeight",RemoteObject.solve(new RemoteObject[] {parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runMethod(true,"getHeight"),parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 32.2)),principal.mostCurrent.activityBA)}, "+",1, 1));
 BA.debugLineNum = 630;BA.debugLine="lefpro = lefpro + 47%x";
Debug.ShouldStop(2097152);
_lefpro = RemoteObject.solve(new RemoteObject[] {_lefpro,parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 631;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
Debug.ShouldStop(4194304);
parent.mostCurrent._viewcategoria.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((parent.mostCurrent._funcion.runMethod(false,"_createpanelproductoscroll" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(_map),(Object)(_bm)).getObject())),(Object)(_lefpro),(Object)(_alttop),(Object)(parent.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),principal.mostCurrent.activityBA)),(Object)(parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),principal.mostCurrent.activityBA)));
 BA.debugLineNum = 632;BA.debugLine="alttop = alttop+37%y";
Debug.ShouldStop(8388608);
_alttop = RemoteObject.solve(new RemoteObject[] {_alttop,parent.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 37)),principal.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);
 if (true) break;

case 79:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 80:
//C
this.state = 81;
Debug.locals.put("i", _i);
;
 if (true) break;

case 81:
//C
this.state = 140;
;
 if (true) break;

case 83:
//C
this.state = 84;
 BA.debugLineNum = 642;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(2);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 643;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(4);
if (true) break;

case 84:
//if
this.state = 87;
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
 BA.debugLineNum = 644;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No se ha encontrado productos con esta referencia")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),principal.mostCurrent.activityBA);
 BA.debugLineNum = 645;BA.debugLine="Return";
Debug.ShouldStop(16);
if (true) return ;
 if (true) break;

case 87:
//C
this.state = 88;
;
 BA.debugLineNum = 648;BA.debugLine="ListProductosModalView.Clear";
Debug.ShouldStop(128);
parent.mostCurrent._listproductosmodalview.runVoidMethod ("Clear");
 BA.debugLineNum = 650;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(512);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 651;BA.debugLine="For i = 0 To list.Size-1";
Debug.ShouldStop(1024);
if (true) break;

case 88:
//for
this.state = 97;
step135 = 1;
limit135 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 147;
if (true) break;

case 147:
//C
this.state = 97;
if ((step135 > 0 && _i <= limit135) || (step135 < 0 && _i >= limit135)) this.state = 90;
if (true) break;

case 148:
//C
this.state = 147;
_i = ((int)(0 + _i + step135)) ;
Debug.locals.put("i", _i);
if (true) break;

case 90:
//C
this.state = 91;
 BA.debugLineNum = 652;BA.debugLine="Dim mapalist As Map";
Debug.ShouldStop(2048);
_mapalist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapalist", _mapalist);
 BA.debugLineNum = 653;BA.debugLine="mapalist = list.Get(i)";
Debug.ShouldStop(4096);
_mapalist.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 655;BA.debugLine="If  mapalist.Get(\"f_foto\")<> Null And  mapalis";
Debug.ShouldStop(16384);
if (true) break;

case 91:
//if
this.state = 96;
if (RemoteObject.solveBoolean("N",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
this.state = 93;
}else {
this.state = 95;
}if (true) break;

case 93:
//C
this.state = 96;
 BA.debugLineNum = 656;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_foto\")";
Debug.ShouldStop(32768);
_bm = parent.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 if (true) break;

case 95:
//C
this.state = 96;
 BA.debugLineNum = 658;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-i";
Debug.ShouldStop(131072);
_bm.runVoidMethod ("Initialize",(Object)((parent.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(parent.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 if (true) break;

case 96:
//C
this.state = 148;
;
 BA.debugLineNum = 661;BA.debugLine="ListProductosModalView.AddTwoLinesAndBitmap2(m";
Debug.ShouldStop(1048576);
parent.mostCurrent._listproductosmodalview.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Precio: "),parent.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))))),(Object)(_bm.runMethod(false,"getBitmap")),(Object)((_mapalist.getObject())));
 if (true) break;
if (true) break;

case 97:
//C
this.state = 140;
Debug.locals.put("i", _i);
;
 if (true) break;

case 99:
//C
this.state = 100;
 BA.debugLineNum = 666;BA.debugLine="If listafavoritos.IsInitialized Then";
Debug.ShouldStop(33554432);
if (true) break;

case 100:
//if
this.state = 103;
if (parent._listafavoritos.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 102;
}if (true) break;

case 102:
//C
this.state = 103;
 BA.debugLineNum = 667;BA.debugLine="listafavoritos.Clear";
Debug.ShouldStop(67108864);
parent._listafavoritos.runVoidMethod ("Clear");
 if (true) break;

case 103:
//C
this.state = 140;
;
 BA.debugLineNum = 670;BA.debugLine="listafavoritos = map.Get(\"f_data\")";
Debug.ShouldStop(536870912);
parent._listafavoritos.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 671;BA.debugLine="buscarfavoritosvar = False";
Debug.ShouldStop(1073741824);
parent._buscarfavoritosvar = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 672;BA.debugLine="cargarDatos";
Debug.ShouldStop(-2147483648);
_cargardatos();
 if (true) break;

case 105:
//C
this.state = 106;
 BA.debugLineNum = 676;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(8);
if (true) break;

case 106:
//if
this.state = 111;
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))).<Boolean>get().booleanValue()) { 
this.state = 108;
}else {
this.state = 110;
}if (true) break;

case 108:
//C
this.state = 111;
 BA.debugLineNum = 678;BA.debugLine="listafavoritos.Add(mapaDetalleImagen)";
Debug.ShouldStop(32);
parent._listafavoritos.runVoidMethod ("Add",(Object)((parent._mapadetalleimagen.getObject())));
 BA.debugLineNum = 680;BA.debugLine="ToastMessageShow(\"Producto agregado a favorito";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto agregado a favoritos")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 110:
//C
this.state = 111;
 BA.debugLineNum = 682;BA.debugLine="ToastMessageShow(\"Error al agregar su producto";
Debug.ShouldStop(512);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Error al agregar su producto a favoritos")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 111:
//C
this.state = 140;
;
 if (true) break;

case 113:
//C
this.state = 114;
 BA.debugLineNum = 687;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(16384);
if (true) break;

case 114:
//if
this.state = 127;
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))).<Boolean>get().booleanValue()) { 
this.state = 116;
}else {
this.state = 126;
}if (true) break;

case 116:
//C
this.state = 117;
 BA.debugLineNum = 688;BA.debugLine="ToastMessageShow(\"Producto eliminado de favori";
Debug.ShouldStop(32768);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto eliminado de favorito")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 690;BA.debugLine="For i=0 To listafavoritos.Size-1";
Debug.ShouldStop(131072);
if (true) break;

case 117:
//for
this.state = 124;
step162 = 1;
limit162 = RemoteObject.solve(new RemoteObject[] {parent._listafavoritos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
Debug.locals.put("i", _i);
this.state = 149;
if (true) break;

case 149:
//C
this.state = 124;
if ((step162 > 0 && _i <= limit162) || (step162 < 0 && _i >= limit162)) this.state = 119;
if (true) break;

case 150:
//C
this.state = 149;
_i = ((int)(0 + _i + step162)) ;
Debug.locals.put("i", _i);
if (true) break;

case 119:
//C
this.state = 120;
 BA.debugLineNum = 692;BA.debugLine="Dim map As Map = listafavoritos.Get(i)";
Debug.ShouldStop(524288);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_map.setObject(parent._listafavoritos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 694;BA.debugLine="If map.Get(\"f_idrecord\") == mapaDetalleImagen";
Debug.ShouldStop(2097152);
if (true) break;

case 120:
//if
this.state = 123;
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),parent._mapadetalleimagen.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idproducto")))))) { 
this.state = 122;
}if (true) break;

case 122:
//C
this.state = 123;
 BA.debugLineNum = 695;BA.debugLine="listafavoritos.RemoveAt(i)";
Debug.ShouldStop(4194304);
parent._listafavoritos.runVoidMethod ("RemoveAt",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 696;BA.debugLine="i = listafavoritos.Size";
Debug.ShouldStop(8388608);
_i = parent._listafavoritos.runMethod(true,"getSize").<Integer>get().intValue();Debug.locals.put("i", _i);
 if (true) break;

case 123:
//C
this.state = 150;
;
 if (true) break;
if (true) break;

case 124:
//C
this.state = 127;
Debug.locals.put("i", _i);
;
 BA.debugLineNum = 700;BA.debugLine="Sleep(100)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "jobdone"),BA.numberCast(int.class, 100));
this.state = 151;
return;
case 151:
//C
this.state = 127;
;
 if (true) break;

case 126:
//C
this.state = 127;
 BA.debugLineNum = 703;BA.debugLine="ToastMessageShow(\"Hubo un error a remover este";
Debug.ShouldStop(1073741824);
parent.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Hubo un error a remover este producto de su lista de favritos")),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 if (true) break;

case 127:
//C
this.state = 140;
;
 if (true) break;

case 129:
//C
this.state = 130;
 BA.debugLineNum = 707;BA.debugLine="If listafavoritos.IsInitialized Then";
Debug.ShouldStop(4);
if (true) break;

case 130:
//if
this.state = 133;
if (parent._listafavoritos.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
 BA.debugLineNum = 708;BA.debugLine="listafavoritos.Clear";
Debug.ShouldStop(8);
parent._listafavoritos.runVoidMethod ("Clear");
 if (true) break;

case 133:
//C
this.state = 140;
;
 BA.debugLineNum = 711;BA.debugLine="listafavoritos = map.Get(\"f_data\")";
Debug.ShouldStop(64);
parent._listafavoritos.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 712;BA.debugLine="cargarListaFavoritos";
Debug.ShouldStop(128);
_cargarlistafavoritos();
 if (true) break;

case 135:
//C
this.state = 136;
 BA.debugLineNum = 716;BA.debugLine="cantidadProduto = map.Get(\"f_data\")";
Debug.ShouldStop(2048);
parent._cantidadproduto = BA.numberCast(int.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 718;BA.debugLine="If cantidadProduto <> 0 Then";
Debug.ShouldStop(8192);
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
 BA.debugLineNum = 720;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
Debug.ShouldStop(32768);
parent.mostCurrent._lblcantidadproductos.runMethod(true,"setText",BA.ObjectToCharSequence(parent._cantidadproduto));
 BA.debugLineNum = 721;BA.debugLine="lblCantidadProductos.Visible = True";
Debug.ShouldStop(65536);
parent.mostCurrent._lblcantidadproductos.runMethod(true,"setVisible",parent.mostCurrent.__c.getField(true,"True"));
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
 BA.debugLineNum = 728;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _listproductosmodalview_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListProductosModalView_ItemClick (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1250);
if (RapidSub.canDelegate("listproductosmodalview_itemclick")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","listproductosmodalview_itemclick", _position, _value);}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1250;BA.debugLine="Sub ListProductosModalView_ItemClick (Position As";
Debug.ShouldStop(2);
 BA.debugLineNum = 1253;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(16);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 1254;BA.debugLine="mapa = Value";
Debug.ShouldStop(32);
_mapa.setObject(_value);
 BA.debugLineNum = 1256;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(128);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1258;BA.debugLine="If mapa.ContainsKey(\"f_foto\") Then";
Debug.ShouldStop(512);
if (_mapa.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("f_foto")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1260;BA.debugLine="If  mapa.Get(\"f_foto\") <> \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 1261;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(4096);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 1264;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(32768);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 1265;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(65536);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 }else {
 BA.debugLineNum = 1269;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
Debug.ShouldStop(1048576);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 1270;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(2097152);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 BA.debugLineNum = 1273;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelfondodetalles.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1274;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
Debug.ShouldStop(33554432);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDetallesProducto")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 1275;BA.debugLine="PanelFondoDetalles.Visible = False";
Debug.ShouldStop(67108864);
principal.mostCurrent._panelfondodetalles.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1278;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(536870912);
principal.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 1279;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(1073741824);
principal.mostCurrent._lblprecioencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1280;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._lblnombeencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 1281;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(1);
principal.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 1282;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(2);
principal.mostCurrent._lblprecio.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1283;BA.debugLine="PanelModalProducto.SetVisibleAnimated(500, False)";
Debug.ShouldStop(4);
principal.mostCurrent._panelmodalproducto.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1284;BA.debugLine="PanelMenu.SetVisibleAnimated(500, False)";
Debug.ShouldStop(8);
principal.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1285;BA.debugLine="mapaDetalle = mapa";
Debug.ShouldStop(16);
principal._mapadetalle = _mapa;
 BA.debugLineNum = 1286;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,True)";
Debug.ShouldStop(32);
principal.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1288;BA.debugLine="ismodal = True";
Debug.ShouldStop(128);
principal._ismodal = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1289;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _llistafavoritos_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("LlistaFavoritos_ItemClick (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1116);
if (RapidSub.canDelegate("llistafavoritos_itemclick")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","llistafavoritos_itemclick", _position, _value);}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmfav = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1116;BA.debugLine="Sub LlistaFavoritos_ItemClick (Position As Int, Va";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 1118;BA.debugLine="imgfavDetalle = True";
Debug.ShouldStop(536870912);
principal._imgfavdetalle = principal.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1119;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(1073741824);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 1120;BA.debugLine="mapa = Value";
Debug.ShouldStop(-2147483648);
_mapa.setObject(_value);
 BA.debugLineNum = 1121;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(1);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 1122;BA.debugLine="Dim bmfav As BitmapDrawable";
Debug.ShouldStop(2);
_bmfav = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmfav", _bmfav);
 BA.debugLineNum = 1124;BA.debugLine="If mapa.ContainsKey(\"f_foto\") Then";
Debug.ShouldStop(8);
if (_mapa.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("f_foto")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1126;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 1127;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(64);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 1130;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(512);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 1131;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(1024);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 }else {
 BA.debugLineNum = 1135;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
Debug.ShouldStop(16384);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 1136;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(32768);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 };
 BA.debugLineNum = 1139;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelfondodetalles.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1140;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
Debug.ShouldStop(524288);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDetallesProducto")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 1141;BA.debugLine="PanelFondoDetalles.Visible = False";
Debug.ShouldStop(1048576);
principal.mostCurrent._panelfondodetalles.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 1144;BA.debugLine="bmfav.Initialize(LoadBitmap(File.DirAssets,\"heart";
Debug.ShouldStop(8388608);
_bmfav.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 1145;BA.debugLine="bmfav.Gravity = Gravity.FILL";
Debug.ShouldStop(16777216);
_bmfav.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 1147;BA.debugLine="imgdetallefav.Background = bmfav";
Debug.ShouldStop(67108864);
principal.mostCurrent._imgdetallefav.runMethod(false,"setBackground",(_bmfav.getObject()));
 BA.debugLineNum = 1148;BA.debugLine="imgdetallefav.Tag = mapa";
Debug.ShouldStop(134217728);
principal.mostCurrent._imgdetallefav.runMethod(false,"setTag",(_mapa.getObject()));
 BA.debugLineNum = 1150;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(536870912);
principal.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 1151;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(1073741824);
principal.mostCurrent._lblprecioencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1152;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._lblnombeencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 1153;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(1);
principal.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 1154;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(2);
principal.mostCurrent._lblprecio.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 1155;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(250, False)";
Debug.ShouldStop(4);
principal.mostCurrent._panelfondofavorito.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1156;BA.debugLine="mapaDetalle = mapa";
Debug.ShouldStop(8);
principal._mapadetalle = _mapa;
 BA.debugLineNum = 1157;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(250,True)";
Debug.ShouldStop(16);
principal.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1159;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mostrarabout() throws Exception{
try {
		Debug.PushSubsStack("mostrarAbout (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,911);
if (RapidSub.canDelegate("mostrarabout")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","mostrarabout");}
 BA.debugLineNum = 911;BA.debugLine="Sub mostrarAbout";
Debug.ShouldStop(16384);
 BA.debugLineNum = 913;BA.debugLine="If PanelFondoAboutus.IsInitialized == False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelfondoaboutus.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 914;BA.debugLine="Activity.LoadLayout(\"frmAboutUs\")";
Debug.ShouldStop(131072);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmAboutUs")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 915;BA.debugLine="PanelFondoAboutus.Visible = False";
Debug.ShouldStop(262144);
principal.mostCurrent._panelfondoaboutus.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 918;BA.debugLine="PanelMenu.SetVisibleAnimated(250,False)";
Debug.ShouldStop(2097152);
principal.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 919;BA.debugLine="PanelFondoAboutus.SetVisibleAnimated(250,True)";
Debug.ShouldStop(4194304);
principal.mostCurrent._panelfondoaboutus.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 921;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("openSlide (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1322);
if (RapidSub.canDelegate("openslide")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","openslide");}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _duration = RemoteObject.createImmutable(0);
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 1322;BA.debugLine="Sub openSlide";
Debug.ShouldStop(512);
 BA.debugLineNum = 1324;BA.debugLine="Dim position,duration As Double";
Debug.ShouldStop(2048);
_position = RemoteObject.createImmutable(0);Debug.locals.put("position", _position);
_duration = RemoteObject.createImmutable(0);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 1325;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(4096);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 1327;BA.debugLine="If PanelSlideBack.IsInitialized= False Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelslideback.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1328;BA.debugLine="Activity.LoadLayout(\"frmSlideOrden\")";
Debug.ShouldStop(32768);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmSlideOrden")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 1329;BA.debugLine="PanelSlideBack.Visible = False";
Debug.ShouldStop(65536);
principal.mostCurrent._panelslideback.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 1330;BA.debugLine="PanelSlideBack.Tag = PanelSlide.Top";
Debug.ShouldStop(131072);
principal.mostCurrent._panelslideback.runMethod(false,"setTag",(principal.mostCurrent._panelslide.runMethod(true,"getTop")));
 };
 BA.debugLineNum = 1333;BA.debugLine="If PanelSlideBack.Visible Then";
Debug.ShouldStop(1048576);
if (principal.mostCurrent._panelslideback.runMethod(true,"getVisible").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1334;BA.debugLine="duration = 250";
Debug.ShouldStop(2097152);
_duration = BA.numberCast(double.class, 250);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 1335;BA.debugLine="position = -PanelSlideBack.Tag -PanelSlide.Heigh";
Debug.ShouldStop(4194304);
_position = BA.numberCast(double.class, -(double)(BA.ObjectToNumber(principal.mostCurrent._panelslideback.runMethod(false,"getTag")).<Double>get().doubleValue())-(double) (0 + principal.mostCurrent._panelslide.runMethod(true,"getHeight").<Integer>get().intValue()));Debug.locals.put("position", _position);
 }else {
 BA.debugLineNum = 1338;BA.debugLine="PanelSlide.Top = 100%y";
Debug.ShouldStop(33554432);
principal.mostCurrent._panelslide.runMethod(true,"setTop",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 1339;BA.debugLine="position = -70%y";
Debug.ShouldStop(67108864);
_position = BA.numberCast(double.class, -(double) (0 + principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 70)),principal.mostCurrent.activityBA).<Integer>get().intValue()));Debug.locals.put("position", _position);
 BA.debugLineNum = 1340;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,True)";
Debug.ShouldStop(134217728);
principal.mostCurrent._panelslideback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 1342;BA.debugLine="duration = 251";
Debug.ShouldStop(536870912);
_duration = BA.numberCast(double.class, 251);Debug.locals.put("duration", _duration);
 };
 BA.debugLineNum = 1346;BA.debugLine="a.InitializeTranslate(\"Slide\",0,0,0,position)";
Debug.ShouldStop(2);
_a.runVoidMethod ("InitializeTranslate",principal.mostCurrent.activityBA,(Object)(BA.ObjectToString("Slide")),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _position)));
 BA.debugLineNum = 1347;BA.debugLine="a.Duration = duration";
Debug.ShouldStop(4);
_a.runMethod(true,"setDuration",BA.numberCast(long.class, _duration));
 BA.debugLineNum = 1348;BA.debugLine="a.Start(PanelSlide)";
Debug.ShouldStop(8);
_a.runVoidMethod ("Start",(Object)((principal.mostCurrent._panelslide.getObject())));
 BA.debugLineNum = 1349;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("PanelFondoPro_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,203);
if (RapidSub.canDelegate("panelfondopro_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","panelfondopro_click");}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _bmimgfav = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
int _i = 0;
RemoteObject _mimap = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 203;BA.debugLine="Sub PanelFondoPro_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 204;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(2048);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 205;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(4096);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 207;BA.debugLine="Dim b As Panel";
Debug.ShouldStop(16384);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 208;BA.debugLine="b.Initialize(\"\")";
Debug.ShouldStop(32768);
_b.runVoidMethod ("Initialize",principal.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 209;BA.debugLine="b = Sender";
Debug.ShouldStop(65536);
_b.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 211;BA.debugLine="mapa = b.Tag";
Debug.ShouldStop(262144);
_mapa.setObject(_b.runMethod(false,"getTag"));
 BA.debugLineNum = 213;BA.debugLine="mapaDetalle = mapa";
Debug.ShouldStop(1048576);
principal._mapadetalle = _mapa;
 BA.debugLineNum = 216;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",principal.mostCurrent._panelfondodetalles.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 217;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
Debug.ShouldStop(16777216);
principal.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDetallesProducto")),principal.mostCurrent.activityBA);
 BA.debugLineNum = 218;BA.debugLine="PanelFondoDetalles.Visible = False";
Debug.ShouldStop(33554432);
principal.mostCurrent._panelfondodetalles.runMethod(true,"setVisible",principal.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 221;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(268435456);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 223;BA.debugLine="If mapa.Get(\"f_destacado\") Then";
Debug.ShouldStop(1073741824);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_destacado"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 225;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 226;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(2);
_bm = principal.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 BA.debugLineNum = 228;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(8);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 229;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(16);
principal.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 }else {
 BA.debugLineNum = 233;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(256);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 234;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(512);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 235;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(1024);
principal.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 };
 }else {
 BA.debugLineNum = 239;BA.debugLine="If  mapa.Get(\"f_foto\") <> \"\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 242;BA.debugLine="ImageViewDetalles.Background =  mapa.Get(\"f_fot";
Debug.ShouldStop(131072);
principal.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))));
 }else {
 BA.debugLineNum = 245;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(1048576);
_bm.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 246;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(2097152);
_bm.runMethod(true,"setGravity",principal.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 247;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(4194304);
principal.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 };
 };
 BA.debugLineNum = 252;BA.debugLine="Dim bmimgfav As BitmapDrawable";
Debug.ShouldStop(134217728);
_bmimgfav = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmimgfav", _bmimgfav);
 BA.debugLineNum = 265;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(256);
if (principal.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 267;BA.debugLine="For i=0 To listafavoritos.Size-1";
Debug.ShouldStop(1024);
{
final int step34 = 1;
final int limit34 = RemoteObject.solve(new RemoteObject[] {principal._listafavoritos.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step34 > 0 && _i <= limit34) || (step34 < 0 && _i >= limit34) ;_i = ((int)(0 + _i + step34))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 269;BA.debugLine="Dim mimap As Map = listafavoritos.Get(i)";
Debug.ShouldStop(4096);
_mimap = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mimap.setObject(principal._listafavoritos.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mimap", _mimap);
 BA.debugLineNum = 271;BA.debugLine="If mapa.Get(\"f_idrecord\") == mimap.Get(\"f_idpro";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mimap.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idproducto")))))) { 
 BA.debugLineNum = 272;BA.debugLine="bmimgfav.Initialize(LoadBitmap(File.DirAssets,";
Debug.ShouldStop(32768);
_bmimgfav.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 273;BA.debugLine="i = listafavoritos.Size";
Debug.ShouldStop(65536);
_i = principal._listafavoritos.runMethod(true,"getSize").<Integer>get().intValue();Debug.locals.put("i", _i);
 BA.debugLineNum = 274;BA.debugLine="imgdetallefav.Tag = True";
Debug.ShouldStop(131072);
principal.mostCurrent._imgdetallefav.runMethod(false,"setTag",(principal.mostCurrent.__c.getField(true,"True")));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 281;BA.debugLine="If bmimgfav.IsInitialized == False Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),principal.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 282;BA.debugLine="bmimgfav.Initialize(LoadBitmap(File.DirAssets,\"h";
Debug.ShouldStop(33554432);
_bmimgfav.runVoidMethod ("Initialize",(Object)((principal.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(principal.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png"))).getObject())));
 BA.debugLineNum = 283;BA.debugLine="imgdetallefav.Tag = False";
Debug.ShouldStop(67108864);
principal.mostCurrent._imgdetallefav.runMethod(false,"setTag",(principal.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 286;BA.debugLine="imgdetallefav.Background = bmimgfav";
Debug.ShouldStop(536870912);
principal.mostCurrent._imgdetallefav.runMethod(false,"setBackground",(_bmimgfav.getObject()));
 BA.debugLineNum = 288;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(-2147483648);
principal.mostCurrent._lblprecioencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 289;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(1);
principal.mostCurrent._lblnombeencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 290;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(2);
principal.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 291;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(4);
principal.mostCurrent._lblprecio.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),principal.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 292;BA.debugLine="PanelMenu.SetVisibleAnimated(500, False)";
Debug.ShouldStop(8);
principal.mostCurrent._panelmenu.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 293;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,True)";
Debug.ShouldStop(16);
principal.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(principal.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 295;BA.debugLine="ismodal = False";
Debug.ShouldStop(64);
principal._ismodal = principal.mostCurrent.__c.getField(true,"False");
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim idEmpresa As Int = 1053 '1000";
principal._idempresa = BA.numberCast(int.class, 1053);
 //BA.debugLineNum = 10;BA.debugLine="Dim impuestoIncluido As Boolean = True";
principal._impuestoincluido = principal.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 11;BA.debugLine="Dim mapEmpresaInfo As Map = Null";
principal._mapempresainfo = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
principal._mapempresainfo.setObject(principal.mostCurrent.__c.getField(false,"Null"));
 //BA.debugLineNum = 12;BA.debugLine="Dim cantidadProduto As Int = 0";
principal._cantidadproduto = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 13;BA.debugLine="Dim mapaDetalle As Map";
principal._mapadetalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 14;BA.debugLine="Dim ismodal, isfav As Boolean";
principal._ismodal = RemoteObject.createImmutable(false);
principal._isfav = RemoteObject.createImmutable(false);
 //BA.debugLineNum = 15;BA.debugLine="Dim listafavoritos As List";
principal._listafavoritos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 16;BA.debugLine="Dim buscarfavoritosvar As Boolean = True";
principal._buscarfavoritosvar = principal.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 17;BA.debugLine="Dim keyotraparte As Boolean = True";
principal._keyotraparte = principal.mostCurrent.__c.getField(true,"True");
 //BA.debugLineNum = 18;BA.debugLine="Dim SendClickFav As Boolean = False";
principal._sendclickfav = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 19;BA.debugLine="Dim SendClickAbout As Boolean = False";
principal._sendclickabout = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="Dim imgfavDetalle As Boolean = False";
principal._imgfavdetalle = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 21;BA.debugLine="Dim actu As Boolean = False";
principal._actu = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 22;BA.debugLine="Dim loadagain As Boolean = False";
principal._loadagain = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 23;BA.debugLine="Dim actualizame As Boolean =False";
principal._actualizame = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 24;BA.debugLine="Dim mapaDetalleImagen As Map";
principal._mapadetalleimagen = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 25;BA.debugLine="Dim isUsa As Boolean = False";
principal._isusa = principal.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,811);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 811;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(1024);
 BA.debugLineNum = 813;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(4096);
_mapcalculos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapcalculos = principal.mostCurrent._funcion.runMethod(false,"_recalcular" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(principal._impuestoincluido),(Object)(principal.mostCurrent.__c.getField(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 815;BA.debugLine="Dim json As String";
Debug.ShouldStop(16384);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 816;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(32768);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),principal._idempresa,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),principal.mostCurrent._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 830;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(536870912);
_jobdetalletemporal = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 831;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(1073741824);
_jobdetalletemporal.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,principal.processBA,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(principal.getObject()));
 BA.debugLineNum = 832;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(-2147483648);
_jobdetalletemporal.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(principal.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),principal.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 834;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("Slide_AnimationEnd (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1352);
if (RapidSub.canDelegate("slide_animationend")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","slide_animationend");}
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
 BA.debugLineNum = 1352;BA.debugLine="Sub Slide_AnimationEnd";
Debug.ShouldStop(128);
 BA.debugLineNum = 1354;BA.debugLine="Dim a As Animation";
Debug.ShouldStop(512);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");Debug.locals.put("a", _a);
 BA.debugLineNum = 1355;BA.debugLine="a = Sender";
Debug.ShouldStop(1024);
_a.setObject(principal.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 1357;BA.debugLine="If a.Duration = 251 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_a.runMethod(true,"getDuration"),BA.numberCast(double.class, 251))) { 
 BA.debugLineNum = 1358;BA.debugLine="PanelSlide.Top = PanelSlideBack.Tag";
Debug.ShouldStop(8192);
principal.mostCurrent._panelslide.runMethod(true,"setTop",BA.numberCast(int.class, principal.mostCurrent._panelslideback.runMethod(false,"getTag")));
 BA.debugLineNum = 1359;BA.debugLine="funcion.DisableView( False,PanelSlide)";
Debug.ShouldStop(16384);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelslide));
 BA.debugLineNum = 1360;BA.debugLine="funcion.DisableView(True,PanelMenu)";
Debug.ShouldStop(32768);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelmenu));
 }else {
 BA.debugLineNum = 1362;BA.debugLine="PanelSlide.Top = 100%y";
Debug.ShouldStop(131072);
principal.mostCurrent._panelslide.runMethod(true,"setTop",principal.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),principal.mostCurrent.activityBA));
 BA.debugLineNum = 1363;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,False)";
Debug.ShouldStop(262144);
principal.mostCurrent._panelslideback.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(principal.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 1364;BA.debugLine="funcion.DisableView(True,PanelSlide)";
Debug.ShouldStop(524288);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"True")),(Object)(principal.mostCurrent._panelslide));
 BA.debugLineNum = 1365;BA.debugLine="funcion.DisableView(False,PanelMenu)";
Debug.ShouldStop(1048576);
principal.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,principal.mostCurrent.activityBA,(Object)(principal.mostCurrent.__c.getField(true,"False")),(Object)(principal.mostCurrent._panelmenu));
 };
 BA.debugLineNum = 1368;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slidemenu_click(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SlideMenu_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1455);
if (RapidSub.canDelegate("slidemenu_click")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","slidemenu_click", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 1455;BA.debugLine="Sub SlideMenu_Click(Value As Object)";
Debug.ShouldStop(16384);
 BA.debugLineNum = 1457;BA.debugLine="funcion.ChangeScreen(Value,sm,Activity)";
Debug.ShouldStop(65536);
principal.mostCurrent._funcion.runVoidMethod ("_changescreen" /*void*/ ,principal.mostCurrent.activityBA,(Object)(BA.numberCast(int.class, _value)),(Object)(principal.mostCurrent._sm),(Object)(principal.mostCurrent._activity));
 BA.debugLineNum = 1459;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _slideoption_click() throws Exception{
try {
		Debug.PushSubsStack("SlideOption_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1370);
if (RapidSub.canDelegate("slideoption_click")) { com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","slideoption_click"); return;}
ResumableSub_SlideOption_Click rsub = new ResumableSub_SlideOption_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_SlideOption_Click extends BA.ResumableSub {
public ResumableSub_SlideOption_Click(com.jq.pedidos.principal parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.principal parent;
RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("SlideOption_Click (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1370);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 1372;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(134217728);
_p = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 1373;BA.debugLine="p = Sender";
Debug.ShouldStop(268435456);
_p.setObject(parent.mostCurrent.__c.runMethod(false,"Sender",principal.mostCurrent.activityBA));
 BA.debugLineNum = 1375;BA.debugLine="If p.Tag = \"Exit\" Then";
Debug.ShouldStop(1073741824);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("Exit")))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 1376;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._main._mostar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1377;BA.debugLine="openSlide";
Debug.ShouldStop(1);
_openslide();
 BA.debugLineNum = 1378;BA.debugLine="Sleep(400)";
Debug.ShouldStop(2);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "slideoption_click"),BA.numberCast(int.class, 400));
this.state = 35;
return;
case 35:
//C
this.state = 4;
;
 BA.debugLineNum = 1380;BA.debugLine="Activity.Finish";
Debug.ShouldStop(8);
parent.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 1381;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((parent.mostCurrent._main.getObject())));
 if (true) break;
;
 BA.debugLineNum = 1384;BA.debugLine="If p.Tag = \"Direcciones\" Then";
Debug.ShouldStop(128);

case 4:
//if
this.state = 19;
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("Direcciones")))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 1385;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(256);
if (true) break;

case 7:
//if
this.state = 18;
if (parent.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
 BA.debugLineNum = 1387;BA.debugLine="openSlide";
Debug.ShouldStop(1024);
_openslide();
 BA.debugLineNum = 1388;BA.debugLine="Sleep(400)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "slideoption_click"),BA.numberCast(int.class, 400));
this.state = 36;
return;
case 36:
//C
this.state = 18;
;
 BA.debugLineNum = 1389;BA.debugLine="StartActivity(p.Tag)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)(_p.runMethod(false,"getTag")));
 BA.debugLineNum = 1390;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
 BA.debugLineNum = 1393;BA.debugLine="Dim res As Int";
Debug.ShouldStop(65536);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 1395;BA.debugLine="res = Msgbox2(\"Para agregar o ver sus direccion";
Debug.ShouldStop(262144);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para agregar o ver sus direcciones primero debe iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar sesión")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Mas tarde")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),principal.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 1397;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
Debug.ShouldStop(1048576);
if (true) break;

case 12:
//if
this.state = 17;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
 BA.debugLineNum = 1398;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(2097152);
parent.mostCurrent._main._mostar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1399;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((parent.mostCurrent._main.getObject())));
 if (true) break;

case 16:
//C
this.state = 17;
 BA.debugLineNum = 1402;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;
;
 BA.debugLineNum = 1408;BA.debugLine="If p.Tag = \"ReporteOrdenes\" Then";
Debug.ShouldStop(-2147483648);

case 19:
//if
this.state = 34;
if (RemoteObject.solveBoolean("=",_p.runMethod(false,"getTag"),RemoteObject.createImmutable(("ReporteOrdenes")))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
 BA.debugLineNum = 1409;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(1);
if (true) break;

case 22:
//if
this.state = 33;
if (parent.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 33;
 BA.debugLineNum = 1411;BA.debugLine="openSlide";
Debug.ShouldStop(4);
_openslide();
 BA.debugLineNum = 1412;BA.debugLine="Sleep(400)";
Debug.ShouldStop(8);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "slideoption_click"),BA.numberCast(int.class, 400));
this.state = 37;
return;
case 37:
//C
this.state = 33;
;
 BA.debugLineNum = 1413;BA.debugLine="StartActivity(p.Tag)";
Debug.ShouldStop(16);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)(_p.runMethod(false,"getTag")));
 BA.debugLineNum = 1414;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
 BA.debugLineNum = 1417;BA.debugLine="Dim res As Int";
Debug.ShouldStop(256);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 1419;BA.debugLine="res = Msgbox2(\"Para ver sus ordenes realizadas";
Debug.ShouldStop(1024);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para ver sus ordenes realizadas primero debe iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar sesión")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Mas tarde")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),principal.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 1421;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
Debug.ShouldStop(4096);
if (true) break;

case 27:
//if
this.state = 32;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
 BA.debugLineNum = 1422;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(8192);
parent.mostCurrent._main._mostar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 1423;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(16384);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)((parent.mostCurrent._main.getObject())));
 if (true) break;

case 31:
//C
this.state = 32;
 BA.debugLineNum = 1426;BA.debugLine="Return";
Debug.ShouldStop(131072);
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
 BA.debugLineNum = 1430;BA.debugLine="openSlide";
Debug.ShouldStop(2097152);
_openslide();
 BA.debugLineNum = 1432;BA.debugLine="Sleep(400)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("Sleep",principal.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "principal", "slideoption_click"),BA.numberCast(int.class, 400));
this.state = 38;
return;
case 38:
//C
this.state = -1;
;
 BA.debugLineNum = 1433;BA.debugLine="StartActivity(p.Tag)";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",principal.processBA,(Object)(_p.runMethod(false,"getTag")));
 BA.debugLineNum = 1435;BA.debugLine="End Sub";
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
public static RemoteObject  _txtbuscarproducto_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txtBuscarProducto_EnterPressed (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,1246);
if (RapidSub.canDelegate("txtbuscarproducto_enterpressed")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","txtbuscarproducto_enterpressed");}
 BA.debugLineNum = 1246;BA.debugLine="Sub txtBuscarProducto_EnterPressed";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 1248;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("ViewProducto_AnimationEnd (principal) ","principal",2,principal.mostCurrent.activityBA,principal.mostCurrent,730);
if (RapidSub.canDelegate("viewproducto_animationend")) { return com.jq.pedidos.principal.remoteMe.runUserSub(false, "principal","viewproducto_animationend");}
 BA.debugLineNum = 730;BA.debugLine="Sub ViewProducto_AnimationEnd";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}