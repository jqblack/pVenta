
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xdialog {
    public static RemoteObject myClass;
	public b4i_b4xdialog() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xdialog.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _buttonheight = RemoteObject.createImmutable(0);
public static RemoteObject _buttonwidth = RemoteObject.createImmutable(0);
public static RemoteObject _base = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _backgroundcolor = RemoteObject.createImmutable(0);
public static RemoteObject _overlaycolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercolor = RemoteObject.createImmutable(0);
public static RemoteObject _bordercornersradius = RemoteObject.createImmutable(0);
public static RemoteObject _borderwidth = RemoteObject.createImmutable(0);
public static RemoteObject _buttonscolor = RemoteObject.createImmutable(0);
public static RemoteObject _buttonstextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _background = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _blurimageview = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _blurbackground = RemoteObject.createImmutable(false);
public static RemoteObject _blurreducescale = RemoteObject.createImmutable(0);
public static RemoteObject _mparent = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _title = RemoteObject.declareNull("NSObject");
public static RemoteObject _titlebarcolor = RemoteObject.createImmutable(0);
public static RemoteObject _titlebartextcolor = RemoteObject.createImmutable(0);
public static RemoteObject _titlebar = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _putattop = RemoteObject.createImmutable(false);
public static RemoteObject _titlebarfont = RemoteObject.declareNull("B4XFont");
public static RemoteObject _buttonsfont = RemoteObject.declareNull("B4XFont");
public static RemoteObject _buttonstextcolordisabled = RemoteObject.createImmutable(0);
public static RemoteObject _visibleanimationduration = RemoteObject.createImmutable(0);
public static RemoteObject _buttonsorder = null;
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Background",_ref.getField(false, "_background"),"BackgroundColor",_ref.getField(false, "_backgroundcolor"),"Base",_ref.getField(false, "_base"),"BlurBackground",_ref.getField(false, "_blurbackground"),"BlurImageView",_ref.getField(false, "_blurimageview"),"BlurReduceScale",_ref.getField(false, "_blurreducescale"),"BorderColor",_ref.getField(false, "_bordercolor"),"BorderCornersRadius",_ref.getField(false, "_bordercornersradius"),"BorderWidth",_ref.getField(false, "_borderwidth"),"ButtonHeight",_ref.getField(false, "_buttonheight"),"ButtonsColor",_ref.getField(false, "_buttonscolor"),"ButtonsFont",_ref.getField(false, "_buttonsfont"),"ButtonsOrder",_ref.getField(false, "_buttonsorder"),"ButtonsTextColor",_ref.getField(false, "_buttonstextcolor"),"ButtonsTextColorDisabled",_ref.getField(false, "_buttonstextcolordisabled"),"ButtonWidth",_ref.getField(false, "_buttonwidth"),"DateUtils",_ref.getField(false, "_dateutils"),"mParent",_ref.getField(false, "_mparent"),"OverlayColor",_ref.getField(false, "_overlaycolor"),"PutAtTop",_ref.getField(false, "_putattop"),"Title",_ref.getField(false, "_title"),"TitleBar",_ref.getField(false, "_titlebar"),"TitleBarColor",_ref.getField(false, "_titlebarcolor"),"TitleBarFont",_ref.getField(false, "_titlebarfont"),"TitleBarTextColor",_ref.getField(false, "_titlebartextcolor"),"VisibleAnimationDuration",_ref.getField(false, "_visibleanimationduration"),"xui",_ref.getField(false, "_xui")};
}
}