
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xsearchtemplate {
    public static RemoteObject myClass;
	public b4i_b4xsearchtemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xsearchtemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _mbase = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _customlistview1 = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _xdialog = RemoteObject.declareNull("b4i_b4xdialog");
public static RemoteObject _searchfield = RemoteObject.declareNull("b4i_b4xfloattextfield");
public static RemoteObject _prefixlist = RemoteObject.declareNull("B4IMap");
public static RemoteObject _substringlist = RemoteObject.declareNull("B4IMap");
public static RemoteObject _texthighlightcolor = RemoteObject.createImmutable(0);
public static RemoteObject _itemhightlightcolor = RemoteObject.createImmutable(0);
public static RemoteObject _max_limit = RemoteObject.createImmutable(0);
public static RemoteObject _maxnumberofitemstoshow = RemoteObject.createImmutable(0);
public static RemoteObject _itemscache = RemoteObject.declareNull("B4IList");
public static RemoteObject _allitems = RemoteObject.declareNull("B4IList");
public static RemoteObject _selecteditem = RemoteObject.createImmutable("");
public static RemoteObject _lastterm = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"AllItems",_ref.getField(false, "_allitems"),"CustomListView1",_ref.getField(false, "_customlistview1"),"DateUtils",_ref.getField(false, "_dateutils"),"ItemHightlightColor",_ref.getField(false, "_itemhightlightcolor"),"ItemsCache",_ref.getField(false, "_itemscache"),"LastTerm",_ref.getField(false, "_lastterm"),"MAX_LIMIT",_ref.getField(false, "_max_limit"),"MaxNumberOfItemsToShow",_ref.getField(false, "_maxnumberofitemstoshow"),"mBase",_ref.getField(false, "_mbase"),"prefixList",_ref.getField(false, "_prefixlist"),"SearchField",_ref.getField(false, "_searchfield"),"SelectedItem",_ref.getField(false, "_selecteditem"),"substringList",_ref.getField(false, "_substringlist"),"TextHighlightColor",_ref.getField(false, "_texthighlightcolor"),"xDialog",_ref.getField(false, "_xdialog"),"xui",_ref.getField(false, "_xui")};
}
}