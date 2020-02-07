package com.jq.pedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.jq.pedidos.anotherdatepicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.jq.pedidos.anotherdatepicker.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.PanelWrapper _holder = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvs = null;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper _cvsbackground = null;
public anywheresoftware.b4a.objects.PanelWrapper _dayspanel = null;
public int _month = 0;
public int _year = 0;
public anywheresoftware.b4a.objects.SpinnerWrapper _months = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _years = null;
public float _boxw = 0f;
public float _boxh = 0f;
public float _vcorrection = 0f;
public int _action_up = 0;
public int _action_move = 0;
public int _action_down = 0;
public int _tempselectedday = 0;
public anywheresoftware.b4a.objects.PanelWrapper _dayspanelbackground = null;
public int _dayofweekoffset = 0;
public int _daysinmonth = 0;
public int _tempselectedcolor = 0;
public int _selectedcolor = 0;
public anywheresoftware.b4a.objects.LabelWrapper _lblselectedday = null;
public long _selecteddate = 0L;
public anywheresoftware.b4a.objects.LabelWrapper _targetlabel = null;
public int _selectedyear = 0;
public int _selectedmonth = 0;
public int _selectedday = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label4 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.LabelWrapper[] _daysnames = null;
public Object _mtarget = null;
public String _meventname = "";
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public long  _getdate(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "getdate", false))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Public Sub GetDate As Long";
RDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="End Sub";
return 0L;
}
public String  _addtoactivity(com.jq.pedidos.anotherdatepicker __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_lbl}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
int _y = 0;
String _m = "";
int _i = 0;
String _d = "";
RDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub AddToActivity(ACT As Activity, Lbl As L";
RDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="holder.Initialize(\"holder\")";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"holder");
RDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="holder.Visible = False";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="holder.Color = Colors.Transparent";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="ACT.AddView(holder, 0, 0, 100%x, 100%y)";
_act.AddView((android.view.View)(__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="holder.LoadLayout(\"DatePicker\")";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("DatePicker",ba);
RDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="daysNames = Array As Label(Label1, Label2, Label3";
__ref._daysnames /*anywheresoftware.b4a.objects.LabelWrapper[]*/  = new anywheresoftware.b4a.objects.LabelWrapper[]{__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label4 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label5 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label6 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label7 /*anywheresoftware.b4a.objects.LabelWrapper*/ };
RDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="Dim et As EditText";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="et.Initialize(\"\")";
_et.Initialize(ba,"");
RDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="Lbl.Text=DateTime.Date(DateTime.Now)  'EDITADOO";
_lbl.setText(BA.ObjectToCharSequence(__c.DateTime.Date(__c.DateTime.getNow())));
RDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="Lbl.TextSize = 15 'EDITADOO";
_lbl.setTextSize((float) (15));
RDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="Lbl.Padding = Array As Int(0,0,0,0) 'EDITADOO";
_lbl.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="Lbl.Gravity = Gravity.CENTER_HORIZONTAL + Gravity";
_lbl.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="Lbl.BACKGROUND = et.BACKGROUND";
_lbl.setBackground(_et.getBackground());
RDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="cvs.Initialize(DaysPanel)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._dayspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="cvsBackground.Initialize(DaysPanelBackground)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._dayspanelbackground /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=12517393;
 //BA.debugLineNum = 12517393;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=12517394;
 //BA.debugLineNum = 12517394;BA.debugLine="For y = 1900 To 2100";
{
final int step18 = 1;
final int limit18 = (int) (2100);
_y = (int) (1900) ;
for (;_y <= limit18 ;_y = _y + step18 ) {
RDebugUtils.currentLine=12517395;
 //BA.debugLineNum = 12517395;BA.debugLine="Years.Add(y)";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_y));
 }
};
RDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="For Each m As String In DateUtils.GetMonthsNames";
{
final anywheresoftware.b4a.BA.IterableList group21 = _dateutils._getmonthsnames(ba);
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_m = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=12517398;
 //BA.debugLineNum = 12517398;BA.debugLine="Months.Add(m)";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_m);
 }
};
RDebugUtils.currentLine=12517400;
 //BA.debugLineNum = 12517400;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=12517401;
 //BA.debugLineNum = 12517401;BA.debugLine="For Each D As String In DateUtils.GetDaysNames";
{
final anywheresoftware.b4a.BA.IterableList group25 = _dateutils._getdaysnames(ba);
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_d = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=12517402;
 //BA.debugLineNum = 12517402;BA.debugLine="daysNames(i).Text = D.SubString2(0, 2)";
__ref._daysnames /*anywheresoftware.b4a.objects.LabelWrapper[]*/ [_i].setText(BA.ObjectToCharSequence(_d.substring((int) (0),(int) (2))));
RDebugUtils.currentLine=12517403;
 //BA.debugLineNum = 12517403;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=12517405;
 //BA.debugLineNum = 12517405;BA.debugLine="SetDate(DateTime.Now, False)";
__ref._setdate /*String*/ (null,__c.DateTime.getNow(),__c.False);
RDebugUtils.currentLine=12517406;
 //BA.debugLineNum = 12517406;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typefa";
__ref._vcorrection /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringHeight("1",__c.Typeface.DEFAULT_BOLD,__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize())/(double)2);
RDebugUtils.currentLine=12517407;
 //BA.debugLineNum = 12517407;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getWidth()/(double)7);
RDebugUtils.currentLine=12517408;
 //BA.debugLineNum = 12517408;BA.debugLine="boxH = cvs.Bitmap.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getHeight()/(double)6);
RDebugUtils.currentLine=12517409;
 //BA.debugLineNum = 12517409;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12517410;
 //BA.debugLineNum = 12517410;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=12517411;
 //BA.debugLineNum = 12517411;BA.debugLine="targetLabel = Lbl";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = _lbl;
RDebugUtils.currentLine=12517412;
 //BA.debugLineNum = 12517412;BA.debugLine="End Sub";
return "";
}
public String  _setdate(com.jq.pedidos.anotherdatepicker __ref,long _date,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "setdate", false))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date,_updatelabel}));}
RDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
RDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date),_updatelabel);
RDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="Years.SelectedIndex = year - 1900";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._year /*int*/ -1900));
RDebugUtils.currentLine=12648453;
 //BA.debugLineNum = 12648453;BA.debugLine="Months.SelectedIndex = month - 1";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._month /*int*/ -1));
RDebugUtils.currentLine=12648454;
 //BA.debugLineNum = 12648454;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "drawdays", false))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstday = 0L;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12713987;
 //BA.debugLineNum = 12713987;BA.debugLine="Dim firstDay As Long = DateUtils.SetDate(year, mo";
_firstday = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="dayOfWeekOffset = DateTime.GetDayOfWeek(firstDay)";
__ref._dayofweekoffset /*int*/  = (int) (__c.DateTime.GetDayOfWeek(_firstday)%7);
RDebugUtils.currentLine=12713989;
 //BA.debugLineNum = 12713989;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=12713990;
 //BA.debugLineNum = 12713990;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=12713992;
 //BA.debugLineNum = 12713992;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=12713995;
 //BA.debugLineNum = 12713995;BA.debugLine="For day = 1 To daysInMonth";
{
final int step9 = 1;
final int limit9 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit9 ;_day = _day + step9 ) {
RDebugUtils.currentLine=12713996;
 //BA.debugLineNum = 12713996;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=12713997;
 //BA.debugLineNum = 12713997;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),__c.Typeface.DEFAULT_BOLD,__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize(),__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=12714000;
 //BA.debugLineNum = 12714000;BA.debugLine="DaysPanel.Invalidate";
__ref._dayspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=12714001;
 //BA.debugLineNum = 12714001;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", null));}
RDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Public Sub btnCancel_Click";
RDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", True, G";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.True),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="End Sub";
return "";
}
public String  _hide(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "hide", false))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="holder.Visible = False";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="End Sub";
return "";
}
public String  _btntoday_click(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "btntoday_click", false))
	 {return ((String) Debug.delegate(ba, "btntoday_click", null));}
RDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub btnToday_Click";
RDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="SetDate(DateTime.Now, True)";
__ref._setdate /*String*/ (null,__c.DateTime.getNow(),__c.True);
RDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False,";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
RDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=12255233;
 //BA.debugLineNum = 12255233;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="Private cvs, cvsBackground As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsbackground = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="Private DaysPanel As Panel";
_dayspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12255236;
 //BA.debugLineNum = 12255236;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=12255237;
 //BA.debugLineNum = 12255237;BA.debugLine="Private Months As Spinner";
_months = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="Private Years As Spinner";
_years = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=12255239;
 //BA.debugLineNum = 12255239;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=12255241;
 //BA.debugLineNum = 12255241;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
_action_up = (int) (1);
_action_move = (int) (2);
_action_down = (int) (0);
RDebugUtils.currentLine=12255242;
 //BA.debugLineNum = 12255242;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=12255243;
 //BA.debugLineNum = 12255243;BA.debugLine="Private DaysPanelBackground As Panel";
_dayspanelbackground = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=12255244;
 //BA.debugLineNum = 12255244;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=12255245;
 //BA.debugLineNum = 12255245;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=12255246;
 //BA.debugLineNum = 12255246;BA.debugLine="Private tempSelectedColor As Int = Colors.Cyan";
_tempselectedcolor = __c.Colors.Cyan;
RDebugUtils.currentLine=12255247;
 //BA.debugLineNum = 12255247;BA.debugLine="Private selectedColor As Int = Colors.RGB(44, 176";
_selectedcolor = __c.Colors.RGB((int) (44),(int) (176),(int) (248));
RDebugUtils.currentLine=12255248;
 //BA.debugLineNum = 12255248;BA.debugLine="Private lblSelectedDay As Label";
_lblselectedday = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255249;
 //BA.debugLineNum = 12255249;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=12255250;
 //BA.debugLineNum = 12255250;BA.debugLine="Private targetLabel As Label";
_targetlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255251;
 //BA.debugLineNum = 12255251;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=12255252;
 //BA.debugLineNum = 12255252;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255253;
 //BA.debugLineNum = 12255253;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255254;
 //BA.debugLineNum = 12255254;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255255;
 //BA.debugLineNum = 12255255;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255256;
 //BA.debugLineNum = 12255256;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255257;
 //BA.debugLineNum = 12255257;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255258;
 //BA.debugLineNum = 12255258;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12255259;
 //BA.debugLineNum = 12255259;BA.debugLine="Private daysNames() As Label";
_daysnames = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _daysnames.length;
for (int i0 = 0;i0 < d0;i0++) {
_daysnames[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=12255260;
 //BA.debugLineNum = 12255260;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=12255261;
 //BA.debugLineNum = 12255261;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=12255262;
 //BA.debugLineNum = 12255262;BA.debugLine="End Sub";
return "";
}
public String  _dayspanel_touch(com.jq.pedidos.anotherdatepicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "dayspanel_touch", false))
	 {return ((String) Debug.delegate(ba, "dayspanel_touch", new Object[] {_action,_x,_y}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Private Sub DaysPanel_Touch (ACTION As Int, X As F";
RDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=12976132;
 //BA.debugLineNum = 12976132;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
if (_action==__ref._action_down /*int*/  || _action==__ref._action_move /*int*/ ) { 
RDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=12976134;
 //BA.debugLineNum = 12976134;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=12976136;
 //BA.debugLineNum = 12976136;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._tempselectedcolor /*int*/ ,_boxx,_boxy);
RDebugUtils.currentLine=12976138;
 //BA.debugLineNum = 12976138;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_newselectedday));
RDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="lblSelectedDay.Visible = True";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=12976143;
 //BA.debugLineNum = 12976143;BA.debugLine="Else If ACTION = ACTION_UP Then";
if (_action==__ref._action_up /*int*/ ) { 
RDebugUtils.currentLine=12976144;
 //BA.debugLineNum = 12976144;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=12976146;
 //BA.debugLineNum = 12976146;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="SelectDay(newSelectedDay, True)";
__ref._selectday /*String*/ (null,_newselectedday,__c.True);
RDebugUtils.currentLine=12976148;
 //BA.debugLineNum = 12976148;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
 }}
;
RDebugUtils.currentLine=12976152;
 //BA.debugLineNum = 12976152;BA.debugLine="DaysPanelBackground.Invalidate";
__ref._dayspanelbackground /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(com.jq.pedidos.anotherdatepicker __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "drawbox", false))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
RDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
_r.Initialize((int) (_x*__ref._boxw /*float*/ ),(int) (_y*__ref._boxh /*float*/ ),(int) ((_x+1)*__ref._boxw /*float*/ ),(int) ((_y+1)*__ref._boxh /*float*/ ));
RDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="c.DrawRect(r, clr, True, 0)";
_c.DrawRect((android.graphics.Rect)(_r.getObject()),_clr,__c.True,(float) (0));
RDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="End Sub";
return "";
}
public String  _selectday(com.jq.pedidos.anotherdatepicker __ref,int _day,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "selectday", false))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day,_updatelabel}));}
RDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
RDebugUtils.currentLine=12779521;
 //BA.debugLineNum = 12779521;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
if (_updatelabel) { 
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.DateTime.Date(__ref._selecteddate /*long*/ )));};
RDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.jq.pedidos.anotherdatepicker __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.LabelWrapper _newlbl = null;
anywheresoftware.b4a.objects.ActivityWrapper _act = null;
RDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
RDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="Dim newLbl As Label";
_newlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="newLbl.Initialize(\"lbl\")";
_newlbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="newLbl.TextSize = lbl.TextSize";
_newlbl.setTextSize(_lbl.getTextSize());
RDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="newLbl.TextColor = lbl.TextColor";
_newlbl.setTextColor(_lbl.getTextColor());
RDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="base.AddView(newLbl, 0, 0, base.Width, base.Heigh";
_base.AddView((android.view.View)(_newlbl.getObject()),(int) (0),(int) (0),_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="Dim act As Activity = props.Get(\"activity\")";
_act = new anywheresoftware.b4a.objects.ActivityWrapper();
_act.setObject((anywheresoftware.b4a.BALayout)(_props.Get((Object)("activity"))));
RDebugUtils.currentLine=12386314;
 //BA.debugLineNum = 12386314;BA.debugLine="CallSubDelayed3(Me, \"AddToActivity\",act , newLbl)";
__c.CallSubDelayed3(ba,this,"AddToActivity",(Object)(_act),(Object)(_newlbl));
RDebugUtils.currentLine=12386315;
 //BA.debugLineNum = 12386315;BA.debugLine="End Sub";
return "";
}
public String  _holder_click(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "holder_click", false))
	 {return ((String) Debug.delegate(ba, "holder_click", null));}
RDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Private Sub holder_Click";
RDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="btnCancel_Click";
__ref._btncancel_click /*String*/ (null);
RDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.jq.pedidos.anotherdatepicker __ref,anywheresoftware.b4a.BA _ba,Object _target,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_eventname}));}
RDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
RDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="mTarget = Target";
__ref._mtarget /*Object*/  = _target;
RDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "isvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isvisible", null));}
RDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Public Sub IsVisible As Boolean";
RDebugUtils.currentLine=13369345;
 //BA.debugLineNum = 13369345;BA.debugLine="Return holder.Visible";
if (true) return __ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return false;
}
public String  _lbl_click(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "lbl_click", false))
	 {return ((String) Debug.delegate(ba, "lbl_click", null));}
RDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Private Sub lbl_Click";
RDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Show";
__ref._show /*String*/ (null);
RDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="End Sub";
return "";
}
public String  _show(com.jq.pedidos.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="holder.Visible = True";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="End Sub";
return "";
}
public String  _months_itemclick(com.jq.pedidos.anotherdatepicker __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "months_itemclick", false))
	 {return ((String) Debug.delegate(ba, "months_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="month = Position + 1";
__ref._month /*int*/  = (int) (_position+1);
RDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=13238275;
 //BA.debugLineNum = 13238275;BA.debugLine="End Sub";
return "";
}
public String  _years_itemclick(com.jq.pedidos.anotherdatepicker __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "years_itemclick", false))
	 {return ((String) Debug.delegate(ba, "years_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="year = Value";
__ref._year /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="End Sub";
return "";
}
}