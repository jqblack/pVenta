
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_customlistview {
    public static RemoteObject myClass;
	public b4i_customlistview() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_customlistview.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _sv = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _items = RemoteObject.declareNull("B4IList");
public static RemoteObject _mdividersize = RemoteObject.createImmutable(0.0f);
public static RemoteObject _eventname = RemoteObject.createImmutable("");
public static RemoteObject _callback = RemoteObject.declareNull("NSObject");
public static RemoteObject _defaulttextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _defaulttextbackgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _animationduration = RemoteObject.createImmutable(0);
public static RemoteObject _lastreachendevent = RemoteObject.createImmutable(0L);
public static RemoteObject _pressedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _designerlabel = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _horizontal = RemoteObject.createImmutable(false);
public static RemoteObject _feedbackgenerator = RemoteObject.declareNull("B4INativeObject");
public static RemoteObject _mfirstvisibleindex = RemoteObject.createImmutable(0);
public static RemoteObject _mlastvisibleindex = RemoteObject.createImmutable(0);
public static RemoteObject _monitorvisiblerange = RemoteObject.createImmutable(false);
public static RemoteObject _firescrollchanged = RemoteObject.createImmutable(false);
public static RemoteObject _scrollbarsvisible = RemoteObject.createImmutable(false);
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
		return new Object[] {"AnimationDuration",_ref.getField(false, "_animationduration"),"CallBack",_ref.getField(false, "_callback"),"DefaultTextBackgroundColor",_ref.getField(false, "_defaulttextbackgroundcolor"),"DefaultTextColor",_ref.getField(false, "_defaulttextcolor"),"DesignerLabel",_ref.getField(false, "_designerlabel"),"EventName",_ref.getField(false, "_eventname"),"FeedbackGenerator",_ref.getField(false, "_feedbackgenerator"),"FireScrollChanged",_ref.getField(false, "_firescrollchanged"),"horizontal",_ref.getField(false, "_horizontal"),"items",_ref.getField(false, "_items"),"LastReachEndEvent",_ref.getField(false, "_lastreachendevent"),"mBase",_ref.getField(false, "_mbase"),"mDividerSize",_ref.getField(false, "_mdividersize"),"mFirstVisibleIndex",_ref.getField(false, "_mfirstvisibleindex"),"mLastVisibleIndex",_ref.getField(false, "_mlastvisibleindex"),"MonitorVisibleRange",_ref.getField(false, "_monitorvisiblerange"),"PressedColor",_ref.getField(false, "_pressedcolor"),"ScrollBarsVisible",_ref.getField(false, "_scrollbarsvisible"),"sv",_ref.getField(false, "_sv"),"xui",_ref.getField(false, "_xui")};
}
}