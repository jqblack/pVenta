package com.menube.app;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class anotherdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.menube.app.anotherdatepicker");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.menube.app.anotherdatepicker.class).invoke(this, new Object[] {null});
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
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public long  _getdate(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "getdate", false))
	 {return ((Long) Debug.delegate(ba, "getdate", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub GetDate As Long";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Return selectedDate";
if (true) return __ref._selecteddate /*long*/ ;
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="End Sub";
return 0L;
}
public String  _addtoactivity(com.menube.app.anotherdatepicker __ref,anywheresoftware.b4a.objects.ActivityWrapper _act,anywheresoftware.b4a.objects.LabelWrapper _lbl) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "addtoactivity", false))
	 {return ((String) Debug.delegate(ba, "addtoactivity", new Object[] {_act,_lbl}));}
anywheresoftware.b4a.objects.EditTextWrapper _et = null;
int _y = 0;
String _m = "";
int _i = 0;
String _d = "";
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub AddToActivity(ACT As Activity, Lbl As L";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="holder.Initialize(\"holder\")";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"holder");
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="holder.Visible = False";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="holder.Color = Colors.Transparent";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="ACT.AddView(holder, 0, 0, 100%x, 100%y)";
_act.AddView((android.view.View)(__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="holder.LoadLayout(\"DatePicker\")";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .LoadLayout("DatePicker",ba);
RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="daysNames = Array As Label(Label1, Label2, Label3";
__ref._daysnames /*anywheresoftware.b4a.objects.LabelWrapper[]*/  = new anywheresoftware.b4a.objects.LabelWrapper[]{__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label2 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label3 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label4 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label5 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label6 /*anywheresoftware.b4a.objects.LabelWrapper*/ ,__ref._label7 /*anywheresoftware.b4a.objects.LabelWrapper*/ };
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="Dim et As EditText";
_et = new anywheresoftware.b4a.objects.EditTextWrapper();
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="et.Initialize(\"\")";
_et.Initialize(ba,"");
RDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="Lbl.Text=DateTime.Date(DateTime.Now)  'EDITADOO";
_lbl.setText(BA.ObjectToCharSequence(__c.DateTime.Date(__c.DateTime.getNow())));
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Lbl.TextSize = 15 'EDITADOO";
_lbl.setTextSize((float) (15));
RDebugUtils.currentLine=8912907;
 //BA.debugLineNum = 8912907;BA.debugLine="Lbl.Padding = Array As Int(0,0,0,0) 'EDITADOO";
_lbl.setPadding(new int[]{(int) (0),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="Lbl.Gravity = Gravity.CENTER_HORIZONTAL + Gravity";
_lbl.setGravity((int) (__c.Gravity.CENTER_HORIZONTAL+__c.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=8912909;
 //BA.debugLineNum = 8912909;BA.debugLine="Lbl.BACKGROUND = et.BACKGROUND";
_lbl.setBackground(_et.getBackground());
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="cvs.Initialize(DaysPanel)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._dayspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=8912911;
 //BA.debugLineNum = 8912911;BA.debugLine="cvsBackground.Initialize(DaysPanelBackground)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .Initialize((android.view.View)(__ref._dayspanelbackground /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=8912912;
 //BA.debugLineNum = 8912912;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref._month /*int*/  = __c.DateTime.GetMonth(__c.DateTime.getNow());
RDebugUtils.currentLine=8912913;
 //BA.debugLineNum = 8912913;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref._year /*int*/  = __c.DateTime.GetYear(__c.DateTime.getNow());
RDebugUtils.currentLine=8912914;
 //BA.debugLineNum = 8912914;BA.debugLine="For y = 1900 To 2100";
{
final int step18 = 1;
final int limit18 = (int) (2100);
_y = (int) (1900) ;
for (;_y <= limit18 ;_y = _y + step18 ) {
RDebugUtils.currentLine=8912915;
 //BA.debugLineNum = 8912915;BA.debugLine="Years.Add(y)";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(BA.NumberToString(_y));
 }
};
RDebugUtils.currentLine=8912917;
 //BA.debugLineNum = 8912917;BA.debugLine="For Each m As String In DateUtils.GetMonthsNames";
{
final anywheresoftware.b4a.BA.IterableList group21 = _dateutils._getmonthsnames(ba);
final int groupLen21 = group21.getSize()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_m = BA.ObjectToString(group21.Get(index21));
RDebugUtils.currentLine=8912918;
 //BA.debugLineNum = 8912918;BA.debugLine="Months.Add(m)";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .Add(_m);
 }
};
RDebugUtils.currentLine=8912920;
 //BA.debugLineNum = 8912920;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=8912921;
 //BA.debugLineNum = 8912921;BA.debugLine="For Each D As String In DateUtils.GetDaysNames";
{
final anywheresoftware.b4a.BA.IterableList group25 = _dateutils._getdaysnames(ba);
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_d = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=8912922;
 //BA.debugLineNum = 8912922;BA.debugLine="daysNames(i).Text = D.SubString2(0, 2)";
__ref._daysnames /*anywheresoftware.b4a.objects.LabelWrapper[]*/ [_i].setText(BA.ObjectToCharSequence(_d.substring((int) (0),(int) (2))));
RDebugUtils.currentLine=8912923;
 //BA.debugLineNum = 8912923;BA.debugLine="i = i + 1";
_i = (int) (_i+1);
 }
};
RDebugUtils.currentLine=8912925;
 //BA.debugLineNum = 8912925;BA.debugLine="SetDate(DateTime.Now, False)";
__ref._setdate /*String*/ (null,__c.DateTime.getNow(),__c.False);
RDebugUtils.currentLine=8912926;
 //BA.debugLineNum = 8912926;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typefa";
__ref._vcorrection /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .MeasureStringHeight("1",__c.Typeface.DEFAULT_BOLD,__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize())/(double)2);
RDebugUtils.currentLine=8912927;
 //BA.debugLineNum = 8912927;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
__ref._boxw /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getWidth()/(double)7);
RDebugUtils.currentLine=8912928;
 //BA.debugLineNum = 8912928;BA.debugLine="boxH = cvs.Bitmap.Height / 6";
__ref._boxh /*float*/  = (float) (__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .getBitmap().getHeight()/(double)6);
RDebugUtils.currentLine=8912929;
 //BA.debugLineNum = 8912929;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=8912930;
 //BA.debugLineNum = 8912930;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=8912931;
 //BA.debugLineNum = 8912931;BA.debugLine="targetLabel = Lbl";
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/  = _lbl;
RDebugUtils.currentLine=8912932;
 //BA.debugLineNum = 8912932;BA.debugLine="End Sub";
return "";
}
public String  _setdate(com.menube.app.anotherdatepicker __ref,long _date,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "setdate", false))
	 {return ((String) Debug.delegate(ba, "setdate", new Object[] {_date,_updatelabel}));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="year = DateTime.GetYear(date)";
__ref._year /*int*/  = __c.DateTime.GetYear(_date);
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="month = DateTime.GetMonth(date)";
__ref._month /*int*/  = __c.DateTime.GetMonth(_date);
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
__ref._selectday /*String*/ (null,__c.DateTime.GetDayOfMonth(_date),_updatelabel);
RDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="Years.SelectedIndex = year - 1900";
__ref._years /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._year /*int*/ -1900));
RDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Months.SelectedIndex = month - 1";
__ref._months /*anywheresoftware.b4a.objects.SpinnerWrapper*/ .setSelectedIndex((int) (__ref._month /*int*/ -1));
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="End Sub";
return "";
}
public String  _drawdays(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "drawdays", false))
	 {return ((String) Debug.delegate(ba, "drawdays", null));}
long _firstday = 0L;
int _day = 0;
int _row = 0;
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Private Sub DrawDays";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="Dim firstDay As Long = DateUtils.SetDate(year, mo";
_firstday = (long) (_dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,(int) (1))-1);
RDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="dayOfWeekOffset = DateTime.GetDayOfWeek(firstDay)";
__ref._dayofweekoffset /*int*/  = (int) (__c.DateTime.GetDayOfWeek(_firstday)%7);
RDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref._daysinmonth /*int*/  = _dateutils._numberofdaysinmonth(ba,__ref._month /*int*/ ,__ref._year /*int*/ );
RDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref._year /*int*/ ==__ref._selectedyear /*int*/  && __ref._month /*int*/ ==__ref._selectedmonth /*int*/ ) { 
RDebugUtils.currentLine=9109512;
 //BA.debugLineNum = 9109512;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay - 1 + d";
__ref._drawbox /*String*/ (null,__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._selectedcolor /*int*/ ,(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )%7),(int) ((__ref._selectedday /*int*/ -1+__ref._dayofweekoffset /*int*/ )/(double)7));
 };
RDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="For day = 1 To daysInMonth";
{
final int step9 = 1;
final int limit9 = __ref._daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit9 ;_day = _day + step9 ) {
RDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref._dayofweekoffset /*int*/ )/(double)7);
RDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
__ref._cvs /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawText(ba,BA.NumberToString(_day),(float) ((((__ref._dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref._boxw /*float*/ ),(float) ((_row+0.5)*__ref._boxh /*float*/ +__ref._vcorrection /*float*/ ),__c.Typeface.DEFAULT_BOLD,__ref._label1 /*anywheresoftware.b4a.objects.LabelWrapper*/ .getTextSize(),__c.Colors.Black,BA.getEnumFromString(android.graphics.Paint.Align.class,"CENTER"));
 }
};
RDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="DaysPanel.Invalidate";
__ref._dayspanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="End Sub";
return "";
}
public String  _btncancel_click(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "btncancel_click", false))
	 {return ((String) Debug.delegate(ba, "btncancel_click", null));}
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Public Sub btnCancel_Click";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", True, G";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.True),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="End Sub";
return "";
}
public String  _hide(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "hide", false))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="holder.Visible = False";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="End Sub";
return "";
}
public String  _btntoday_click(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "btntoday_click", false))
	 {return ((String) Debug.delegate(ba, "btntoday_click", null));}
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Private Sub btnToday_Click";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="SetDate(DateTime.Now, True)";
__ref._setdate /*String*/ (null,__c.DateTime.getNow(),__c.True);
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False,";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Private holder As Panel";
_holder = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Private cvs, cvsBackground As Canvas";
_cvs = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
_cvsbackground = new anywheresoftware.b4a.objects.drawable.CanvasWrapper();
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Private DaysPanel As Panel";
_dayspanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="Private month, year As Int";
_month = 0;
_year = 0;
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Private Months As Spinner";
_months = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Private Years As Spinner";
_years = new anywheresoftware.b4a.objects.SpinnerWrapper();
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="Private boxW, boxH As Float";
_boxw = 0f;
_boxh = 0f;
RDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="Private vCorrection As Float";
_vcorrection = 0f;
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
_action_up = (int) (1);
_action_move = (int) (2);
_action_down = (int) (0);
RDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="Private tempSelectedDay As Int";
_tempselectedday = 0;
RDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="Private DaysPanelBackground As Panel";
_dayspanelbackground = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="Private dayOfWeekOffset As Int";
_dayofweekoffset = 0;
RDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="Private daysInMonth As Int";
_daysinmonth = 0;
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="Private tempSelectedColor As Int = Colors.Cyan";
_tempselectedcolor = __c.Colors.Cyan;
RDebugUtils.currentLine=8650767;
 //BA.debugLineNum = 8650767;BA.debugLine="Private selectedColor As Int = Colors.RGB(44, 176";
_selectedcolor = __c.Colors.RGB((int) (44),(int) (176),(int) (248));
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="Private lblSelectedDay As Label";
_lblselectedday = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650769;
 //BA.debugLineNum = 8650769;BA.debugLine="Private selectedDate As Long";
_selecteddate = 0L;
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="Private targetLabel As Label";
_targetlabel = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
_selectedyear = 0;
_selectedmonth = 0;
_selectedday = 0;
RDebugUtils.currentLine=8650772;
 //BA.debugLineNum = 8650772;BA.debugLine="Private Label1 As Label";
_label1 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650773;
 //BA.debugLineNum = 8650773;BA.debugLine="Private Label2 As Label";
_label2 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650774;
 //BA.debugLineNum = 8650774;BA.debugLine="Private Label3 As Label";
_label3 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650775;
 //BA.debugLineNum = 8650775;BA.debugLine="Private Label4 As Label";
_label4 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650776;
 //BA.debugLineNum = 8650776;BA.debugLine="Private Label5 As Label";
_label5 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650777;
 //BA.debugLineNum = 8650777;BA.debugLine="Private Label6 As Label";
_label6 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650778;
 //BA.debugLineNum = 8650778;BA.debugLine="Private Label7 As Label";
_label7 = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8650779;
 //BA.debugLineNum = 8650779;BA.debugLine="Private daysNames() As Label";
_daysnames = new anywheresoftware.b4a.objects.LabelWrapper[(int) (0)];
{
int d0 = _daysnames.length;
for (int i0 = 0;i0 < d0;i0++) {
_daysnames[i0] = new anywheresoftware.b4a.objects.LabelWrapper();
}
}
;
RDebugUtils.currentLine=8650780;
 //BA.debugLineNum = 8650780;BA.debugLine="Private mTarget As Object";
_mtarget = new Object();
RDebugUtils.currentLine=8650781;
 //BA.debugLineNum = 8650781;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=8650782;
 //BA.debugLineNum = 8650782;BA.debugLine="End Sub";
return "";
}
public String  _dayspanel_touch(com.menube.app.anotherdatepicker __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "dayspanel_touch", false))
	 {return ((String) Debug.delegate(ba, "dayspanel_touch", new Object[] {_action,_x,_y}));}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
boolean _validday = false;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Private Sub DaysPanel_Touch (ACTION As Int, X As F";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
_boxx = (int) (_x/(double)__ref._boxw /*float*/ );
_boxy = (int) (_y/(double)__ref._boxh /*float*/ );
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref._dayofweekoffset /*int*/ );
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref._daysinmonth /*int*/ ;
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
if (_action==__ref._action_down /*int*/  || _action==__ref._action_move /*int*/ ) { 
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref._tempselectedday /*int*/ ) { 
if (true) return "";};
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref._tempselectedday /*int*/  = _newselectedday;
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
__ref._drawbox /*String*/ (null,__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ ,__ref._tempselectedcolor /*int*/ ,_boxx,_boxy);
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(_newselectedday));
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="lblSelectedDay.Visible = True";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.True);
 }else {
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
 };
 }else 
{RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="Else If ACTION = ACTION_UP Then";
if (_action==__ref._action_up /*int*/ ) { 
RDebugUtils.currentLine=9371664;
 //BA.debugLineNum = 9371664;BA.debugLine="lblSelectedDay.Visible = False";
__ref._lblselectedday /*anywheresoftware.b4a.objects.LabelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=9371665;
 //BA.debugLineNum = 9371665;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
__ref._cvsbackground /*anywheresoftware.b4a.objects.drawable.CanvasWrapper*/ .DrawColor(__c.Colors.Transparent);
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="If validDay Then";
if (_validday) { 
RDebugUtils.currentLine=9371667;
 //BA.debugLineNum = 9371667;BA.debugLine="SelectDay(newSelectedDay, True)";
__ref._selectday /*String*/ (null,_newselectedday,__c.True);
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False";
__c.CallSubNew3(ba,__ref._mtarget /*Object*/ ,__ref._meventname /*String*/ +"_Closed",(Object)(__c.False),(Object)(__ref._getdate /*long*/ (null)));
RDebugUtils.currentLine=9371669;
 //BA.debugLineNum = 9371669;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
 }}
;
RDebugUtils.currentLine=9371672;
 //BA.debugLineNum = 9371672;BA.debugLine="DaysPanelBackground.Invalidate";
__ref._dayspanelbackground /*anywheresoftware.b4a.objects.PanelWrapper*/ .Invalidate();
RDebugUtils.currentLine=9371673;
 //BA.debugLineNum = 9371673;BA.debugLine="End Sub";
return "";
}
public String  _drawbox(com.menube.app.anotherdatepicker __ref,anywheresoftware.b4a.objects.drawable.CanvasWrapper _c,int _clr,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "drawbox", false))
	 {return ((String) Debug.delegate(ba, "drawbox", new Object[] {_c,_clr,_x,_y}));}
anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper _r = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim r As Rect";
_r = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper();
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
_r.Initialize((int) (_x*__ref._boxw /*float*/ ),(int) (_y*__ref._boxh /*float*/ ),(int) ((_x+1)*__ref._boxw /*float*/ ),(int) ((_y+1)*__ref._boxh /*float*/ ));
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="c.DrawRect(r, clr, True, 0)";
_c.DrawRect((android.graphics.Rect)(_r.getObject()),_clr,__c.True,(float) (0));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
return "";
}
public String  _selectday(com.menube.app.anotherdatepicker __ref,int _day,boolean _updatelabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "selectday", false))
	 {return ((String) Debug.delegate(ba, "selectday", new Object[] {_day,_updatelabel}));}
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
__ref._selecteddate /*long*/  = _dateutils._setdate(ba,__ref._year /*int*/ ,__ref._month /*int*/ ,_day);
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="selectedDay = day";
__ref._selectedday /*int*/  = _day;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="selectedMonth = month";
__ref._selectedmonth /*int*/  = __ref._month /*int*/ ;
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="selectedYear = year";
__ref._selectedyear /*int*/  = __ref._year /*int*/ ;
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
if (_updatelabel) { 
__ref._targetlabel /*anywheresoftware.b4a.objects.LabelWrapper*/ .setText(BA.ObjectToCharSequence(__c.DateTime.Date(__ref._selecteddate /*long*/ )));};
RDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="End Sub";
return "";
}
public String  _designercreateview(com.menube.app.anotherdatepicker __ref,anywheresoftware.b4a.objects.PanelWrapper _base,anywheresoftware.b4a.objects.LabelWrapper _lbl,anywheresoftware.b4a.objects.collections.Map _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "designercreateview", false))
	 {return ((String) Debug.delegate(ba, "designercreateview", new Object[] {_base,_lbl,_props}));}
anywheresoftware.b4a.objects.LabelWrapper _newlbl = null;
anywheresoftware.b4a.objects.ActivityWrapper _act = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="Dim newLbl As Label";
_newlbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="newLbl.Initialize(\"lbl\")";
_newlbl.Initialize(ba,"lbl");
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="newLbl.TextSize = lbl.TextSize";
_newlbl.setTextSize(_lbl.getTextSize());
RDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="newLbl.TextColor = lbl.TextColor";
_newlbl.setTextColor(_lbl.getTextColor());
RDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="base.AddView(newLbl, 0, 0, base.Width, base.Heigh";
_base.AddView((android.view.View)(_newlbl.getObject()),(int) (0),(int) (0),_base.getWidth(),_base.getHeight());
RDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="Dim act As Activity = props.Get(\"activity\")";
_act = new anywheresoftware.b4a.objects.ActivityWrapper();
_act.setObject((anywheresoftware.b4a.BALayout)(_props.Get((Object)("activity"))));
RDebugUtils.currentLine=8781834;
 //BA.debugLineNum = 8781834;BA.debugLine="CallSubDelayed3(Me, \"AddToActivity\",act , newLbl)";
__c.CallSubDelayed3(ba,this,"AddToActivity",(Object)(_act),(Object)(_newlbl));
RDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="End Sub";
return "";
}
public String  _holder_click(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "holder_click", false))
	 {return ((String) Debug.delegate(ba, "holder_click", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub holder_Click";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="btnCancel_Click";
__ref._btncancel_click /*String*/ (null);
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="End Sub";
return "";
}
public String  _initialize(com.menube.app.anotherdatepicker __ref,anywheresoftware.b4a.BA _ba,Object _target,String _eventname) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_target,_eventname}));}
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="mTarget = Target";
__ref._mtarget /*Object*/  = _target;
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "isvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isvisible", null));}
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Public Sub IsVisible As Boolean";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Return holder.Visible";
if (true) return __ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="End Sub";
return false;
}
public String  _lbl_click(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "lbl_click", false))
	 {return ((String) Debug.delegate(ba, "lbl_click", null));}
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Private Sub lbl_Click";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Show";
__ref._show /*String*/ (null);
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="End Sub";
return "";
}
public String  _show(com.menube.app.anotherdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="holder.Visible = True";
__ref._holder /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="End Sub";
return "";
}
public String  _months_itemclick(com.menube.app.anotherdatepicker __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "months_itemclick", false))
	 {return ((String) Debug.delegate(ba, "months_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="month = Position + 1";
__ref._month /*int*/  = (int) (_position+1);
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="End Sub";
return "";
}
public String  _years_itemclick(com.menube.app.anotherdatepicker __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="anotherdatepicker";
if (Debug.shouldDelegate(ba, "years_itemclick", false))
	 {return ((String) Debug.delegate(ba, "years_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="year = Value";
__ref._year /*int*/  = (int)(BA.ObjectToNumber(_value));
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="DrawDays";
__ref._drawdays /*String*/ (null);
RDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="End Sub";
return "";
}
}