
package com.jq.pedidos;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class anotherdatepicker {
    public static RemoteObject myClass;
	public anotherdatepicker() {
	}
    public static PCBA staticBA = new PCBA(null, anotherdatepicker.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _holder = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _cvs = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _cvsbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper");
public static RemoteObject _dayspanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _month = RemoteObject.createImmutable(0);
public static RemoteObject _year = RemoteObject.createImmutable(0);
public static RemoteObject _months = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _years = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _boxw = RemoteObject.createImmutable(0f);
public static RemoteObject _boxh = RemoteObject.createImmutable(0f);
public static RemoteObject _vcorrection = RemoteObject.createImmutable(0f);
public static RemoteObject _action_up = RemoteObject.createImmutable(0);
public static RemoteObject _action_move = RemoteObject.createImmutable(0);
public static RemoteObject _action_down = RemoteObject.createImmutable(0);
public static RemoteObject _tempselectedday = RemoteObject.createImmutable(0);
public static RemoteObject _dayspanelbackground = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dayofweekoffset = RemoteObject.createImmutable(0);
public static RemoteObject _daysinmonth = RemoteObject.createImmutable(0);
public static RemoteObject _tempselectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _selectedcolor = RemoteObject.createImmutable(0);
public static RemoteObject _lblselectedday = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _selecteddate = RemoteObject.createImmutable(0L);
public static RemoteObject _targetlabel = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _selectedyear = RemoteObject.createImmutable(0);
public static RemoteObject _selectedmonth = RemoteObject.createImmutable(0);
public static RemoteObject _selectedday = RemoteObject.createImmutable(0);
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _daysnames = null;
public static RemoteObject _mtarget = RemoteObject.declareNull("Object");
public static RemoteObject _meventname = RemoteObject.createImmutable("");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.perfil _perfil = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ACTION_DOWN",_ref.getField(false, "_action_down"),"ACTION_MOVE",_ref.getField(false, "_action_move"),"ACTION_UP",_ref.getField(false, "_action_up"),"boxH",_ref.getField(false, "_boxh"),"boxW",_ref.getField(false, "_boxw"),"cvs",_ref.getField(false, "_cvs"),"cvsBackground",_ref.getField(false, "_cvsbackground"),"DateUtils",_ref.getField(false, "_dateutils"),"dayOfWeekOffset",_ref.getField(false, "_dayofweekoffset"),"daysInMonth",_ref.getField(false, "_daysinmonth"),"daysNames",_ref.getField(false, "_daysnames"),"DaysPanel",_ref.getField(false, "_dayspanel"),"DaysPanelBackground",_ref.getField(false, "_dayspanelbackground"),"holder",_ref.getField(false, "_holder"),"Label1",_ref.getField(false, "_label1"),"Label2",_ref.getField(false, "_label2"),"Label3",_ref.getField(false, "_label3"),"Label4",_ref.getField(false, "_label4"),"Label5",_ref.getField(false, "_label5"),"Label6",_ref.getField(false, "_label6"),"Label7",_ref.getField(false, "_label7"),"lblSelectedDay",_ref.getField(false, "_lblselectedday"),"mEventName",_ref.getField(false, "_meventname"),"month",_ref.getField(false, "_month"),"Months",_ref.getField(false, "_months"),"mTarget",_ref.getField(false, "_mtarget"),"selectedColor",_ref.getField(false, "_selectedcolor"),"selectedDate",_ref.getField(false, "_selecteddate"),"selectedDay",_ref.getField(false, "_selectedday"),"selectedMonth",_ref.getField(false, "_selectedmonth"),"selectedYear",_ref.getField(false, "_selectedyear"),"targetLabel",_ref.getField(false, "_targetlabel"),"tempSelectedColor",_ref.getField(false, "_tempselectedcolor"),"tempSelectedDay",_ref.getField(false, "_tempselectedday"),"vCorrection",_ref.getField(false, "_vcorrection"),"year",_ref.getField(false, "_year"),"Years",_ref.getField(false, "_years")};
}
}