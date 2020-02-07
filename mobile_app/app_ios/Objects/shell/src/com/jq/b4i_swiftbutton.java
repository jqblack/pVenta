
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_swiftbutton {
    public static RemoteObject myClass;
	public b4i_swiftbutton() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_swiftbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _cvs = RemoteObject.declareNull("B4XCanvas");
public static RemoteObject _xlbl = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _clr1 = RemoteObject.createImmutable(0);
public static RemoteObject _clr2 = RemoteObject.createImmutable(0);
public static RemoteObject _disabledcolor = RemoteObject.createImmutable(0);
public static RemoteObject _pressed = RemoteObject.createImmutable(false);
public static RemoteObject _tag = RemoteObject.declareNull("NSObject");
public static RemoteObject _mdisabled = RemoteObject.createImmutable(false);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"clr1",_ref.getField(false, "_clr1"),"clr2",_ref.getField(false, "_clr2"),"cvs",_ref.getField(false, "_cvs"),"DateUtils",_ref.getField(false, "_dateutils"),"disabledColor",_ref.getField(false, "_disabledcolor"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mDisabled",_ref.getField(false, "_mdisabled"),"mEventName",_ref.getField(false, "_meventname"),"pressed",_ref.getField(false, "_pressed"),"Tag",_ref.getField(false, "_tag"),"xLBL",_ref.getField(false, "_xlbl"),"xui",_ref.getField(false, "_xui")};
}
}