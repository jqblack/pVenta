
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
public static RemoteObject _mitems = RemoteObject.declareNull("B4IList");
public static RemoteObject _mselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _mbtn = RemoteObject.declareNull("B4XViewWrapper");
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
		return new Object[] {"mBase",_ref.getField(false, "_mbase"),"mBtn",_ref.getField(false, "_mbtn"),"mCallBack",_ref.getField(false, "_mcallback"),"mEventName",_ref.getField(false, "_meventname"),"mItems",_ref.getField(false, "_mitems"),"mSelectedIndex",_ref.getField(false, "_mselectedindex"),"xui",_ref.getField(false, "_xui")};
}
}