
package com.jq;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class b4i_b4xdatetemplate {
    public static RemoteObject myClass;
	public b4i_b4xdatetemplate() {
	}
    public static PCBA staticBA = new PCBA(null, b4i_b4xdatetemplate.class);

public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _xui = RemoteObject.declareNull("B4IXUI");
public static RemoteObject _month = RemoteObject.createImmutable(0);
public static RemoteObject _year = RemoteObject.createImmutable(0);
public static RemoteObject _boxw = RemoteObject.createImmutable(0.0f);
public static RemoteObject _boxh = RemoteObject.createImmutable(0.0f);
public static RemoteObject _vcorrection = RemoteObject.createImmutable(0.0f);
public static RemoteObject _tempselectedday = RemoteObject.createImmutable(0);
public static RemoteObject _dayofweekoffset = RemoteObject.createImmutable(0);
public static RemoteObject _daysinmonth = RemoteObject.createImmutable(0);
public static RemoteObject _dayspanebg = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _dayspanefg = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("B4XCanvas");
public static RemoteObject _cvsbackground = RemoteObject.declareNull("B4XCanvas");
public static RemoteObject _selecteddate = RemoteObject.createImmutable(0L);
public static RemoteObject _selectedyear = RemoteObject.createImmutable(0);
public static RemoteObject _selectedmonth = RemoteObject.createImmutable(0);
public static RemoteObject _selectedday = RemoteObject.createImmutable(0);
public static RemoteObject _highlightedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _daysinmonthcolor = RemoteObject.createImmutable(0);
public static RemoteObject _daysinweekcolor = RemoteObject.createImmutable(0);
public static RemoteObject _cvsdays = RemoteObject.declareNull("B4XCanvas");
public static RemoteObject _daystitlespane = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _firstday = RemoteObject.createImmutable(0);
public static RemoteObject _minyear = RemoteObject.createImmutable(0);
public static RemoteObject _maxyear = RemoteObject.createImmutable(0);
public static RemoteObject _btnmonthleft = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _btnmonthright = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _btnyearleft = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _btnyearright = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _lblmonth = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _lblyear = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _pnldialog = RemoteObject.declareNull("B4XViewWrapper");
public static RemoteObject _months = RemoteObject.declareNull("B4IList");
public static RemoteObject _mdialog = RemoteObject.declareNull("b4i_b4xdialog");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"boxH",_ref.getField(false, "_boxh"),"boxW",_ref.getField(false, "_boxw"),"btnMonthLeft",_ref.getField(false, "_btnmonthleft"),"btnMonthRight",_ref.getField(false, "_btnmonthright"),"btnYearLeft",_ref.getField(false, "_btnyearleft"),"btnYearRight",_ref.getField(false, "_btnyearright"),"cvs",_ref.getField(false, "_cvs"),"cvsBackground",_ref.getField(false, "_cvsbackground"),"cvsDays",_ref.getField(false, "_cvsdays"),"DateUtils",_ref.getField(false, "_dateutils"),"dayOfWeekOffset",_ref.getField(false, "_dayofweekoffset"),"daysInMonth",_ref.getField(false, "_daysinmonth"),"DaysInMonthColor",_ref.getField(false, "_daysinmonthcolor"),"DaysInWeekColor",_ref.getField(false, "_daysinweekcolor"),"DaysPaneBg",_ref.getField(false, "_dayspanebg"),"DaysPaneFg",_ref.getField(false, "_dayspanefg"),"DaysTitlesPane",_ref.getField(false, "_daystitlespane"),"FirstDay",_ref.getField(false, "_firstday"),"HighlightedColor",_ref.getField(false, "_highlightedcolor"),"lblMonth",_ref.getField(false, "_lblmonth"),"lblYear",_ref.getField(false, "_lblyear"),"MaxYear",_ref.getField(false, "_maxyear"),"mDialog",_ref.getField(false, "_mdialog"),"MinYear",_ref.getField(false, "_minyear"),"month",_ref.getField(false, "_month"),"months",_ref.getField(false, "_months"),"pnlDialog",_ref.getField(false, "_pnldialog"),"SelectedColor",_ref.getField(false, "_selectedcolor"),"selectedDate",_ref.getField(false, "_selecteddate"),"selectedDay",_ref.getField(false, "_selectedday"),"selectedMonth",_ref.getField(false, "_selectedmonth"),"selectedYear",_ref.getField(false, "_selectedyear"),"tempSelectedDay",_ref.getField(false, "_tempselectedday"),"vCorrection",_ref.getField(false, "_vcorrection"),"xui",_ref.getField(false, "_xui"),"year",_ref.getField(false, "_year")};
}
}