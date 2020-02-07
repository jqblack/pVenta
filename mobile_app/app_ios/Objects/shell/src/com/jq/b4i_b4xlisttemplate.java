
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xlisttemplate {
    public static RemoteObject myClass;
	public b4i_b4xlisttemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xlisttemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _options = RemoteObject.declareNull("B4IList");
public static RemoteObject _selecteditem = RemoteObject.createImmutable("");
public static RemoteObject _xdialog = RemoteObject.declareNull("b4i_b4xdialog");
public static RemoteObject _allowmultiselection = RemoteObject.createImmutable(false);
public static RemoteObject _selectioncolor = RemoteObject.createImmutable(0);
public static RemoteObject _selecteditems = RemoteObject.declareNull("B4IList");
public static RemoteObject _multiselectionminimum = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AllowMultiSelection",_ref.getField(false, "_allowmultiselection"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"mBase",_ref.getField(false, "_mbase"),"MultiSelectionMinimum",_ref.getField(false, "_multiselectionminimum"),"Options",_ref.getField(false, "_options"),"SelectedItem",_ref.getField(false, "_selecteditem"),"SelectedItems",_ref.getField(false, "_selecteditems"),"SelectionColor",_ref.getField(false, "_selectioncolor"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}