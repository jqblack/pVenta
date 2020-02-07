
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xbreadcrumb {
    public static RemoteObject myClass;
	public b4i_b4xbreadcrumb() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xbreadcrumb.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _cvs = RemoteObject.declareNull("B4XCanvas");
public static RemoteObject _mitems = RemoteObject.declareNull("B4IList");
public static RemoteObject _rightpositions = RemoteObject.declareNull("B4IList");
public static RemoteObject _textcolor = RemoteObject.createImmutable(0);
public static RemoteObject _fnt = RemoteObject.declareNull("B4XFont");
public static RemoteObject _offset = RemoteObject.createImmutable(0);
public static RemoteObject _bc = RemoteObject.declareNull("b4i_bitmapcreator");
public static RemoteObject _crumbcolor = RemoteObject.createImmutable(0);
public static RemoteObject _touchpanel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _presseditem = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bc",_ref.getField(false, "_bc"),"CrumbColor",_ref.getField(false, "_crumbcolor"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"fnt",_ref.getField(false, "_fnt"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mItems",_ref.getField(false, "_mitems"),"offset",_ref.getField(false, "_offset"),"PressedItem",_ref.getField(false, "_presseditem"),"RightPositions",_ref.getField(false, "_rightpositions"),"TextColor",_ref.getField(false, "_textcolor"),"TouchPanel",_ref.getField(false, "_touchpanel"),"xui",_ref.getField(false, "_xui")};
}
}