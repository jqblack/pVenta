
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xplusminus {
    public static RemoteObject myClass;
	public b4i_b4xplusminus() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xplusminus.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mcallback = RemoteObject.declareNull("NSObject");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _tag = RemoteObject.declareNull("NSObject");
public static RemoteObject _pnlplus = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _pnlminus = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _lblplus = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _lblminus = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _formation = RemoteObject.createImmutable("");
public static RemoteObject _mcyclic = RemoteObject.createImmutable(false);
public static RemoteObject _mrapid = RemoteObject.createImmutable(false);
public static RemoteObject _mainlabel = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _arrowssize = RemoteObject.createImmutable(0);
public static RemoteObject _mstringitems = RemoteObject.declareNull("B4IList");
public static RemoteObject _mstartrange = RemoteObject.createImmutable(0.0);
public static RemoteObject _minterval = RemoteObject.createImmutable(0.0);
public static RemoteObject _mendrange = RemoteObject.createImmutable(0.0);
public static RemoteObject _mselectedindex = RemoteObject.createImmutable(0);
public static RemoteObject _loopindex = RemoteObject.createImmutable(0);
public static RemoteObject _rapidperiod1 = RemoteObject.createImmutable(0);
public static RemoteObject _rapidperiod2 = RemoteObject.createImmutable(0);
public static RemoteObject _formatter = RemoteObject.declareNull("b4i_b4xformatter");
public static RemoteObject _stringmode = RemoteObject.createImmutable(false);
public static RemoteObject _size = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ArrowsSize",_ref.getField(false, "_arrowssize"),"DateUtils",_ref.getField(false, "_dateutils"),"Formation",_ref.getField(false, "_formation"),"Formatter",_ref.getField(false, "_formatter"),"lblMinus",_ref.getField(false, "_lblminus"),"lblPlus",_ref.getField(false, "_lblplus"),"LoopIndex",_ref.getField(false, "_loopindex"),"MainLabel",_ref.getField(false, "_mainlabel"),"mBase",_ref.getField(false, "_mbase"),"mCallBack",_ref.getField(false, "_mcallback"),"mCyclic",_ref.getField(false, "_mcyclic"),"mEndRange",_ref.getField(false, "_mendrange"),"mEventName",_ref.getField(false, "_meventname"),"mInterval",_ref.getField(false, "_minterval"),"mRapid",_ref.getField(false, "_mrapid"),"mSelectedIndex",_ref.getField(false, "_mselectedindex"),"mStartRange",_ref.getField(false, "_mstartrange"),"mStringItems",_ref.getField(false, "_mstringitems"),"pnlMinus",_ref.getField(false, "_pnlminus"),"pnlPlus",_ref.getField(false, "_pnlplus"),"RapidPeriod1",_ref.getField(false, "_rapidperiod1"),"RapidPeriod2",_ref.getField(false, "_rapidperiod2"),"Size",_ref.getField(false, "_size"),"StringMode",_ref.getField(false, "_stringmode"),"Tag",_ref.getField(false, "_tag"),"xui",_ref.getField(false, "_xui")};
}
}