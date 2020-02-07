
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xcombobox {
    public static RemoteObject myClass;
	public b4i_b4xcombobox() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xcombobox.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _lastselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _mitems = RemoteObject.declareNull("B4IList");
public static RemoteObject _mselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _mbtn = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _delaybeforechangeevent = RemoteObject.createImmutable(0);
public static RemoteObject _delayindex = RemoteObject.createImmutable(0);
public static RemoteObject _tag = RemoteObject.declareNull("NSObject");
public static RemoteObject _b4icancelbutton = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"B4iCancelButton",_ref.getField(false, "_b4icancelbutton"),"DateUtils",_ref.getField(false, "_dateutils"),"DelayBeforeChangeEvent",_ref.getField(false, "_delaybeforechangeevent"),"DelayIndex",_ref.getField(false, "_delayindex"),"LastSelectedIndex",_ref.getField(false, "_lastselectedindex"),"mBase",_ref.getField(false, "_mbase"),"mBtn",_ref.getField(false, "_mbtn"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mItems",_ref.getField(false, "_mitems"),"mSelectedIndex",_ref.getField(false, "_mselectedindex"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}