
package com.menube.app;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class slidemenu {
    public static RemoteObject myClass;
	public slidemenu() {
	}
    public static PCBA staticBA = new PCBA(null, slidemenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _view = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mslidepanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mbackpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _mmodule = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _mlistview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _minanimation = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _moutanimation = RemoteObject.declareNull("anywheresoftware.b4a.objects.AnimationWrapper");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.menube.app.main _main = null;
public static com.menube.app.starter _starter = null;
public static com.menube.app.principal _principal = null;
public static com.menube.app.funcion _funcion = null;
public static com.menube.app.facturacion _facturacion = null;
public static com.menube.app.direcciones _direcciones = null;
public static com.menube.app.reporteordenes _reporteordenes = null;
public static com.menube.app.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"backgroundColor",_ref.getField(false, "_backgroundcolor"),"DateUtils",_ref.getField(false, "_dateutils"),"lblnombre",_ref.getField(false, "_lblnombre"),"mBackPanel",_ref.getField(false, "_mbackpanel"),"mEventName",_ref.getField(false, "_meventname"),"mInAnimation",_ref.getField(false, "_minanimation"),"mListView",_ref.getField(false, "_mlistview"),"mModule",_ref.getField(false, "_mmodule"),"mOutAnimation",_ref.getField(false, "_moutanimation"),"mSlidePanel",_ref.getField(false, "_mslidepanel"),"panelMenu",_ref.getField(false, "_panelmenu"),"View",_ref.getField(false, "_view")};
}
}