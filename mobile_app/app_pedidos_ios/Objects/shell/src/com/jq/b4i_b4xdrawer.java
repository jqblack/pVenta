
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xdrawer {
    public static RemoteObject myClass;
	public b4i_b4xdrawer() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xdrawer.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _msidewidth = RemoteObject.createImmutable(0);
public static RemoteObject _mleftpanel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _mdarkpanel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _mbasepanel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _mcenterpanel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _extrawidth = RemoteObject.createImmutable(0);
public static RemoteObject _touchxstart = RemoteObject.createImmutable(0.0f);
public static RemoteObject _touchystart = RemoteObject.createImmutable(0.0f);
public static RemoteObject _isopen = RemoteObject.createImmutable(false);
public static RemoteObject _handlingswipe = RemoteObject.createImmutable(false);
public static RemoteObject _startatscrim = RemoteObject.createImmutable(false);
public static RemoteObject _menabled = RemoteObject.createImmutable(false);
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ExtraWidth",_ref.getField(false, "_extrawidth"),"HandlingSwipe",_ref.getField(false, "_handlingswipe"),"IsOpen",_ref.getField(false, "_isopen"),"mBasePanel",_ref.getField(false, "_mbasepanel"),"mCallBack",_ref.getField(false, "_mcallback"),"mCenterPanel",_ref.getField(false, "_mcenterpanel"),"mDarkPanel",_ref.getField(false, "_mdarkpanel"),"mEnabled",_ref.getField(false, "_menabled"),"mEventName",_ref.getField(false, "_meventname"),"mLeftPanel",_ref.getField(false, "_mleftpanel"),"mSideWidth",_ref.getField(false, "_msidewidth"),"StartAtScrim",_ref.getField(false, "_startatscrim"),"TouchXStart",_ref.getField(false, "_touchxstart"),"TouchYStart",_ref.getField(false, "_touchystart"),"xui",_ref.getField(false, "_xui")};
}
}