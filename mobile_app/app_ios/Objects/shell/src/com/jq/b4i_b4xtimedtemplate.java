
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xtimedtemplate {
    public static RemoteObject myClass;
	public b4i_b4xtimedtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xtimedtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _anotherprogressbar1 = RemoteObject.declareNull("b4i_anotherprogressbar");
public static RemoteObject _mtemplate = RemoteObject.declareNull("NSObject");
public static RemoteObject _timeoutmilliseconds = RemoteObject.createImmutable(0);
public static RemoteObject _index = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AnotherProgressBar1",_ref.getField(false, "_anotherprogressbar1"),"DateUtils",_ref.getField(false, "_dateutils"),"Index",_ref.getField(false, "_index"),"mBase",_ref.getField(false, "_mbase"),"mTemplate",_ref.getField(false, "_mtemplate"),"TimeoutMilliseconds",_ref.getField(false, "_timeoutmilliseconds"),"xui",_ref.getField(false, "_xui")};
}
}