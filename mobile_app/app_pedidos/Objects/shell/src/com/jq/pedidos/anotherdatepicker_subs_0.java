package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class anotherdatepicker_subs_0 {


public static RemoteObject  _addtoactivity(RemoteObject __ref,RemoteObject _act,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("AddToActivity (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("addtoactivity")) { return __ref.runUserSub(false, "anotherdatepicker","addtoactivity", __ref, _act, _lbl);}
RemoteObject _et = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
int _y = 0;
RemoteObject _m = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _d = RemoteObject.createImmutable("");
Debug.locals.put("ACT", _act);
Debug.locals.put("Lbl", _lbl);
 BA.debugLineNum = 61;BA.debugLine="Public Sub AddToActivity(ACT As Activity, Lbl As L";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="holder.Initialize(\"holder\")";
Debug.ShouldStop(536870912);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("holder")));
 BA.debugLineNum = 63;BA.debugLine="holder.Visible = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 64;BA.debugLine="holder.Color = Colors.Transparent";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runVoidMethod ("setColor",anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 65;BA.debugLine="ACT.AddView(holder, 0, 0, 100%x, 100%y)";
Debug.ShouldStop(1);
_act.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_holder" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(anotherdatepicker.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(anotherdatepicker.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 66;BA.debugLine="holder.LoadLayout(\"DatePicker\")";
Debug.ShouldStop(2);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("DatePicker")),__ref.getField(false, "ba"));
 BA.debugLineNum = 67;BA.debugLine="daysNames = Array As Label(Label1, Label2, Label3";
Debug.ShouldStop(4);
__ref.setField ("_daysnames" /*RemoteObject*/ ,RemoteObject.createNewArray("anywheresoftware.b4a.objects.LabelWrapper",new int[] {7},new Object[] {__ref.getField(false,"_label1" /*RemoteObject*/ ),__ref.getField(false,"_label2" /*RemoteObject*/ ),__ref.getField(false,"_label3" /*RemoteObject*/ ),__ref.getField(false,"_label4" /*RemoteObject*/ ),__ref.getField(false,"_label5" /*RemoteObject*/ ),__ref.getField(false,"_label6" /*RemoteObject*/ ),__ref.getField(false,"_label7" /*RemoteObject*/ )}));
 BA.debugLineNum = 68;BA.debugLine="Dim et As EditText";
Debug.ShouldStop(8);
_et = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");Debug.locals.put("et", _et);
 BA.debugLineNum = 69;BA.debugLine="et.Initialize(\"\")";
Debug.ShouldStop(16);
_et.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 70;BA.debugLine="Lbl.Text=DateTime.Date(DateTime.Now)  'EDITADOO";
Debug.ShouldStop(32);
_lbl.runMethod(true,"setText",BA.ObjectToCharSequence(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")))));
 BA.debugLineNum = 71;BA.debugLine="Lbl.TextSize = 15 'EDITADOO";
Debug.ShouldStop(64);
_lbl.runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 72;BA.debugLine="Lbl.Padding = Array As Int(0,0,0,0) 'EDITADOO";
Debug.ShouldStop(128);
_lbl.runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 73;BA.debugLine="Lbl.Gravity = Gravity.CENTER_HORIZONTAL + Gravity";
Debug.ShouldStop(256);
_lbl.runMethod(true,"setGravity",RemoteObject.solve(new RemoteObject[] {anotherdatepicker.__c.getField(false,"Gravity").getField(true,"CENTER_HORIZONTAL"),anotherdatepicker.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL")}, "+",1, 1));
 BA.debugLineNum = 74;BA.debugLine="Lbl.BACKGROUND = et.BACKGROUND";
Debug.ShouldStop(512);
_lbl.runMethod(false,"setBackground",_et.runMethod(false,"getBackground"));
 BA.debugLineNum = 75;BA.debugLine="cvs.Initialize(DaysPanel)";
Debug.ShouldStop(1024);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_dayspanel" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 76;BA.debugLine="cvsBackground.Initialize(DaysPanelBackground)";
Debug.ShouldStop(2048);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((__ref.getField(false,"_dayspanelbackground" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 77;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
Debug.ShouldStop(4096);
__ref.setField ("_month" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 78;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
Debug.ShouldStop(8192);
__ref.setField ("_year" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow"))));
 BA.debugLineNum = 79;BA.debugLine="For y = 1900 To 2100";
Debug.ShouldStop(16384);
{
final int step18 = 1;
final int limit18 = 2100;
_y = 1900 ;
for (;(step18 > 0 && _y <= limit18) || (step18 < 0 && _y >= limit18) ;_y = ((int)(0 + _y + step18))  ) {
Debug.locals.put("y", _y);
 BA.debugLineNum = 80;BA.debugLine="Years.Add(y)";
Debug.ShouldStop(32768);
__ref.getField(false,"_years" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(BA.NumberToString(_y)));
 }
}Debug.locals.put("y", _y);
;
 BA.debugLineNum = 82;BA.debugLine="For Each m As String In DateUtils.GetMonthsNames";
Debug.ShouldStop(131072);
{
final RemoteObject group21 = anotherdatepicker._dateutils.runMethod(false,"_getmonthsnames",__ref.getField(false, "ba"));
final int groupLen21 = group21.runMethod(true,"getSize").<Integer>get()
;int index21 = 0;
;
for (; index21 < groupLen21;index21++){
_m = BA.ObjectToString(group21.runMethod(false,"Get",index21));Debug.locals.put("m", _m);
Debug.locals.put("m", _m);
 BA.debugLineNum = 83;BA.debugLine="Months.Add(m)";
Debug.ShouldStop(262144);
__ref.getField(false,"_months" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_m));
 }
}Debug.locals.put("m", _m);
;
 BA.debugLineNum = 85;BA.debugLine="Dim i As Int";
Debug.ShouldStop(1048576);
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 86;BA.debugLine="For Each D As String In DateUtils.GetDaysNames";
Debug.ShouldStop(2097152);
{
final RemoteObject group25 = anotherdatepicker._dateutils.runMethod(false,"_getdaysnames",__ref.getField(false, "ba"));
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_d = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("D", _d);
Debug.locals.put("D", _d);
 BA.debugLineNum = 87;BA.debugLine="daysNames(i).Text = D.SubString2(0, 2)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_daysnames" /*RemoteObject*/ ).getArrayElement(false,_i).runMethod(true,"setText",BA.ObjectToCharSequence(_d.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 88;BA.debugLine="i = i + 1";
Debug.ShouldStop(8388608);
_i = RemoteObject.solve(new RemoteObject[] {_i,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("i", _i);
 }
}Debug.locals.put("D", _d);
;
 BA.debugLineNum = 90;BA.debugLine="SetDate(DateTime.Now, False)";
Debug.ShouldStop(33554432);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_setdate" /*RemoteObject*/ ,(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(anotherdatepicker.__c.getField(true,"False")));
 BA.debugLineNum = 91;BA.debugLine="vCorrection = cvs.MeasureStringHeight(\"1\", Typefa";
Debug.ShouldStop(67108864);
__ref.setField ("_vcorrection" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(true,"MeasureStringHeight",(Object)(BA.ObjectToString("1")),(Object)(anotherdatepicker.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTextSize"))),RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 92;BA.debugLine="boxW = cvs.Bitmap.Width / 7";
Debug.ShouldStop(134217728);
__ref.setField ("_boxw" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getWidth"),RemoteObject.createImmutable(7)}, "/",0, 0)));
 BA.debugLineNum = 93;BA.debugLine="boxH = cvs.Bitmap.Height / 6";
Debug.ShouldStop(268435456);
__ref.setField ("_boxh" /*RemoteObject*/ ,BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_cvs" /*RemoteObject*/ ).runMethod(false,"getBitmap").runMethod(true,"getHeight"),RemoteObject.createImmutable(6)}, "/",0, 0)));
 BA.debugLineNum = 94;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(536870912);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 95;BA.debugLine="DrawDays";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="targetLabel = Lbl";
Debug.ShouldStop(-2147483648);
__ref.setField ("_targetlabel" /*RemoteObject*/ ,_lbl);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btncancel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnCancel_Click (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("btncancel_click")) { return __ref.runUserSub(false, "anotherdatepicker","btncancel_click", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Public Sub btnCancel_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 188;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", True, G";
Debug.ShouldStop(134217728);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((anotherdatepicker.__c.getField(true,"True"))),(Object)((__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 189;BA.debugLine="Hide";
Debug.ShouldStop(268435456);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btntoday_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btnToday_Click (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("btntoday_click")) { return __ref.runUserSub(false, "anotherdatepicker","btntoday_click", __ref);}
 BA.debugLineNum = 181;BA.debugLine="Private Sub btnToday_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 182;BA.debugLine="SetDate(DateTime.Now, True)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_setdate" /*RemoteObject*/ ,(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"getNow")),(Object)(anotherdatepicker.__c.getField(true,"True")));
 BA.debugLineNum = 183;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False,";
Debug.ShouldStop(4194304);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((anotherdatepicker.__c.getField(true,"False"))),(Object)((__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 184;BA.debugLine="Hide";
Debug.ShouldStop(8388608);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private holder As Panel";
anotherdatepicker._holder = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_holder",anotherdatepicker._holder);
 //BA.debugLineNum = 6;BA.debugLine="Private cvs, cvsBackground As Canvas";
anotherdatepicker._cvs = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvs",anotherdatepicker._cvs);
anotherdatepicker._cvsbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper");__ref.setField("_cvsbackground",anotherdatepicker._cvsbackground);
 //BA.debugLineNum = 7;BA.debugLine="Private DaysPanel As Panel";
anotherdatepicker._dayspanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dayspanel",anotherdatepicker._dayspanel);
 //BA.debugLineNum = 8;BA.debugLine="Private month, year As Int";
anotherdatepicker._month = RemoteObject.createImmutable(0);__ref.setField("_month",anotherdatepicker._month);
anotherdatepicker._year = RemoteObject.createImmutable(0);__ref.setField("_year",anotherdatepicker._year);
 //BA.debugLineNum = 9;BA.debugLine="Private Months As Spinner";
anotherdatepicker._months = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_months",anotherdatepicker._months);
 //BA.debugLineNum = 10;BA.debugLine="Private Years As Spinner";
anotherdatepicker._years = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");__ref.setField("_years",anotherdatepicker._years);
 //BA.debugLineNum = 11;BA.debugLine="Private boxW, boxH As Float";
anotherdatepicker._boxw = RemoteObject.createImmutable(0f);__ref.setField("_boxw",anotherdatepicker._boxw);
anotherdatepicker._boxh = RemoteObject.createImmutable(0f);__ref.setField("_boxh",anotherdatepicker._boxh);
 //BA.debugLineNum = 12;BA.debugLine="Private vCorrection As Float";
anotherdatepicker._vcorrection = RemoteObject.createImmutable(0f);__ref.setField("_vcorrection",anotherdatepicker._vcorrection);
 //BA.debugLineNum = 13;BA.debugLine="Private ACTION_UP = 1, ACTION_MOVE = 2, ACTION_DO";
anotherdatepicker._action_up = BA.numberCast(int.class, 1);__ref.setField("_action_up",anotherdatepicker._action_up);
anotherdatepicker._action_move = BA.numberCast(int.class, 2);__ref.setField("_action_move",anotherdatepicker._action_move);
anotherdatepicker._action_down = BA.numberCast(int.class, 0);__ref.setField("_action_down",anotherdatepicker._action_down);
 //BA.debugLineNum = 14;BA.debugLine="Private tempSelectedDay As Int";
anotherdatepicker._tempselectedday = RemoteObject.createImmutable(0);__ref.setField("_tempselectedday",anotherdatepicker._tempselectedday);
 //BA.debugLineNum = 15;BA.debugLine="Private DaysPanelBackground As Panel";
anotherdatepicker._dayspanelbackground = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_dayspanelbackground",anotherdatepicker._dayspanelbackground);
 //BA.debugLineNum = 16;BA.debugLine="Private dayOfWeekOffset As Int";
anotherdatepicker._dayofweekoffset = RemoteObject.createImmutable(0);__ref.setField("_dayofweekoffset",anotherdatepicker._dayofweekoffset);
 //BA.debugLineNum = 17;BA.debugLine="Private daysInMonth As Int";
anotherdatepicker._daysinmonth = RemoteObject.createImmutable(0);__ref.setField("_daysinmonth",anotherdatepicker._daysinmonth);
 //BA.debugLineNum = 18;BA.debugLine="Private tempSelectedColor As Int = Colors.Cyan";
anotherdatepicker._tempselectedcolor = anotherdatepicker.__c.getField(false,"Colors").getField(true,"Cyan");__ref.setField("_tempselectedcolor",anotherdatepicker._tempselectedcolor);
 //BA.debugLineNum = 19;BA.debugLine="Private selectedColor As Int = Colors.RGB(44, 176";
anotherdatepicker._selectedcolor = anotherdatepicker.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 44)),(Object)(BA.numberCast(int.class, 176)),(Object)(BA.numberCast(int.class, 248)));__ref.setField("_selectedcolor",anotherdatepicker._selectedcolor);
 //BA.debugLineNum = 20;BA.debugLine="Private lblSelectedDay As Label";
anotherdatepicker._lblselectedday = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblselectedday",anotherdatepicker._lblselectedday);
 //BA.debugLineNum = 21;BA.debugLine="Private selectedDate As Long";
anotherdatepicker._selecteddate = RemoteObject.createImmutable(0L);__ref.setField("_selecteddate",anotherdatepicker._selecteddate);
 //BA.debugLineNum = 22;BA.debugLine="Private targetLabel As Label";
anotherdatepicker._targetlabel = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_targetlabel",anotherdatepicker._targetlabel);
 //BA.debugLineNum = 23;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
anotherdatepicker._selectedyear = RemoteObject.createImmutable(0);__ref.setField("_selectedyear",anotherdatepicker._selectedyear);
anotherdatepicker._selectedmonth = RemoteObject.createImmutable(0);__ref.setField("_selectedmonth",anotherdatepicker._selectedmonth);
anotherdatepicker._selectedday = RemoteObject.createImmutable(0);__ref.setField("_selectedday",anotherdatepicker._selectedday);
 //BA.debugLineNum = 24;BA.debugLine="Private Label1 As Label";
anotherdatepicker._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label1",anotherdatepicker._label1);
 //BA.debugLineNum = 25;BA.debugLine="Private Label2 As Label";
anotherdatepicker._label2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label2",anotherdatepicker._label2);
 //BA.debugLineNum = 26;BA.debugLine="Private Label3 As Label";
anotherdatepicker._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label3",anotherdatepicker._label3);
 //BA.debugLineNum = 27;BA.debugLine="Private Label4 As Label";
anotherdatepicker._label4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label4",anotherdatepicker._label4);
 //BA.debugLineNum = 28;BA.debugLine="Private Label5 As Label";
anotherdatepicker._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label5",anotherdatepicker._label5);
 //BA.debugLineNum = 29;BA.debugLine="Private Label6 As Label";
anotherdatepicker._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label6",anotherdatepicker._label6);
 //BA.debugLineNum = 30;BA.debugLine="Private Label7 As Label";
anotherdatepicker._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_label7",anotherdatepicker._label7);
 //BA.debugLineNum = 31;BA.debugLine="Private daysNames() As Label";
anotherdatepicker._daysnames = RemoteObject.createNewArray ("anywheresoftware.b4a.objects.LabelWrapper", new int[] {0}, new Object[]{});__ref.setField("_daysnames",anotherdatepicker._daysnames);
 //BA.debugLineNum = 32;BA.debugLine="Private mTarget As Object";
anotherdatepicker._mtarget = RemoteObject.createNew ("Object");__ref.setField("_mtarget",anotherdatepicker._mtarget);
 //BA.debugLineNum = 33;BA.debugLine="Private mEventName As String";
anotherdatepicker._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",anotherdatepicker._meventname);
 //BA.debugLineNum = 34;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dayspanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DaysPanel_Touch (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("dayspanel_touch")) { return __ref.runUserSub(false, "anotherdatepicker","dayspanel_touch", __ref, _action, _x, _y);}
RemoteObject _boxx = RemoteObject.createImmutable(0);
RemoteObject _boxy = RemoteObject.createImmutable(0);
RemoteObject _newselectedday = RemoteObject.createImmutable(0);
RemoteObject _validday = RemoteObject.createImmutable(false);
Debug.locals.put("ACTION", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 149;BA.debugLine="Private Sub DaysPanel_Touch (ACTION As Int, X As F";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim boxX = X / boxW, boxY = Y / boxH As Int";
Debug.ShouldStop(2097152);
_boxx = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxX", _boxx);Debug.locals.put("boxX", _boxx);
_boxy = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("boxY", _boxy);Debug.locals.put("boxY", _boxy);
 BA.debugLineNum = 151;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
Debug.ShouldStop(4194304);
_newselectedday = RemoteObject.solve(new RemoteObject[] {_boxy,RemoteObject.createImmutable(7),_boxx,RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "*++-",3, 1);Debug.locals.put("newSelectedDay", _newselectedday);Debug.locals.put("newSelectedDay", _newselectedday);
 BA.debugLineNum = 152;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
Debug.ShouldStop(8388608);
_validday = BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_newselectedday,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean("k",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ))));Debug.locals.put("validDay", _validday);Debug.locals.put("validDay", _validday);
 BA.debugLineNum = 153;BA.debugLine="If ACTION = ACTION_DOWN Or ACTION = ACTION_MOVE T";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_down" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_move" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 154;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_newselectedday,BA.numberCast(double.class, __ref.getField(true,"_tempselectedday" /*RemoteObject*/ )))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 155;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent) 'cle";
Debug.ShouldStop(67108864);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 156;BA.debugLine="tempSelectedDay = newSelectedDay";
Debug.ShouldStop(134217728);
__ref.setField ("_tempselectedday" /*RemoteObject*/ ,_newselectedday);
 BA.debugLineNum = 157;BA.debugLine="If validDay Then";
Debug.ShouldStop(268435456);
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 158;BA.debugLine="DrawBox(cvsBackground, tempSelectedColor, boxX,";
Debug.ShouldStop(536870912);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvsbackground" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_tempselectedcolor" /*RemoteObject*/ )),(Object)(_boxx),(Object)(_boxy));
 BA.debugLineNum = 159;BA.debugLine="lblSelectedDay.Text = newSelectedDay";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(_newselectedday));
 BA.debugLineNum = 160;BA.debugLine="lblSelectedDay.Visible = True";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 162;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(2);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 };
 }else 
{ BA.debugLineNum = 164;BA.debugLine="Else If ACTION = ACTION_UP Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(true,"_action_up" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 165;BA.debugLine="lblSelectedDay.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_lblselectedday" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 166;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
Debug.ShouldStop(32);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 167;BA.debugLine="If validDay Then";
Debug.ShouldStop(64);
if (_validday.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="SelectDay(newSelectedDay, True)";
Debug.ShouldStop(128);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_selectday" /*RemoteObject*/ ,(Object)(_newselectedday),(Object)(anotherdatepicker.__c.getField(true,"True")));
 BA.debugLineNum = 169;BA.debugLine="CallSub3(mTarget, mEventName & \"_Closed\", False";
Debug.ShouldStop(256);
anotherdatepicker.__c.runMethodAndSync(false,"CallSubNew3",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mtarget" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Closed"))),(Object)((anotherdatepicker.__c.getField(true,"False"))),(Object)((__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_getdate" /*RemoteObject*/ ))));
 BA.debugLineNum = 170;BA.debugLine="Hide";
Debug.ShouldStop(512);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_hide" /*RemoteObject*/ );
 };
 }}
;
 BA.debugLineNum = 173;BA.debugLine="DaysPanelBackground.Invalidate";
Debug.ShouldStop(4096);
__ref.getField(false,"_dayspanelbackground" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "anotherdatepicker","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _newlbl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _act = RemoteObject.declareNull("anywheresoftware.b4a.objects.ActivityWrapper");
Debug.locals.put("base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("props", _props);
 BA.debugLineNum = 42;BA.debugLine="Public Sub DesignerCreateView(base As Panel, lbl A";
Debug.ShouldStop(512);
 BA.debugLineNum = 44;BA.debugLine="Dim newLbl As Label";
Debug.ShouldStop(2048);
_newlbl = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("newLbl", _newlbl);
 BA.debugLineNum = 45;BA.debugLine="newLbl.Initialize(\"lbl\")";
Debug.ShouldStop(4096);
_newlbl.runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lbl")));
 BA.debugLineNum = 46;BA.debugLine="newLbl.TextSize = lbl.TextSize";
Debug.ShouldStop(8192);
_newlbl.runMethod(true,"setTextSize",_lbl.runMethod(true,"getTextSize"));
 BA.debugLineNum = 47;BA.debugLine="newLbl.TextColor = lbl.TextColor";
Debug.ShouldStop(16384);
_newlbl.runMethod(true,"setTextColor",_lbl.runMethod(true,"getTextColor"));
 BA.debugLineNum = 48;BA.debugLine="base.AddView(newLbl, 0, 0, base.Width, base.Heigh";
Debug.ShouldStop(32768);
_base.runVoidMethod ("AddView",(Object)((_newlbl.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_base.runMethod(true,"getWidth")),(Object)(_base.runMethod(true,"getHeight")));
 BA.debugLineNum = 49;BA.debugLine="Dim act As Activity = props.Get(\"activity\")";
Debug.ShouldStop(65536);
_act = RemoteObject.createNew ("anywheresoftware.b4a.objects.ActivityWrapper");
_act.setObject(_props.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("activity")))));Debug.locals.put("act", _act);
 BA.debugLineNum = 52;BA.debugLine="CallSubDelayed3(Me, \"AddToActivity\",act , newLbl)";
Debug.ShouldStop(524288);
anotherdatepicker.__c.runVoidMethod ("CallSubDelayed3",__ref.getField(false, "ba"),(Object)(__ref),(Object)(BA.ObjectToString("AddToActivity")),(Object)((_act)),(Object)((_newlbl)));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawbox(RemoteObject __ref,RemoteObject _c,RemoteObject _clr,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("DrawBox (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("drawbox")) { return __ref.runUserSub(false, "anotherdatepicker","drawbox", __ref, _c, _clr, _x, _y);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");
Debug.locals.put("c", _c);
Debug.locals.put("clr", _clr);
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 143;BA.debugLine="Private Sub DrawBox(c As Canvas, clr As Int, x As";
Debug.ShouldStop(16384);
 BA.debugLineNum = 144;BA.debugLine="Dim r As Rect";
Debug.ShouldStop(32768);
_r = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.RectWrapper");Debug.locals.put("r", _r);
 BA.debugLineNum = 145;BA.debugLine="r.Initialize(x * boxW, y * boxH, (x + 1) * boxW,";
Debug.ShouldStop(65536);
_r.runVoidMethod ("Initialize",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_y,__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_x,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_y,RemoteObject.createImmutable(1)}, "+",1, 1)),__ref.getField(true,"_boxh" /*RemoteObject*/ )}, "*",0, 0))));
 BA.debugLineNum = 146;BA.debugLine="c.DrawRect(r, clr, True, 0)";
Debug.ShouldStop(131072);
_c.runVoidMethod ("DrawRect",(Object)((_r.getObject())),(Object)(_clr),(Object)(anotherdatepicker.__c.getField(true,"True")),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _drawdays(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DrawDays (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("drawdays")) { return __ref.runUserSub(false, "anotherdatepicker","drawdays", __ref);}
RemoteObject _firstday = RemoteObject.createImmutable(0L);
int _day = 0;
RemoteObject _row = RemoteObject.createImmutable(0);
 BA.debugLineNum = 112;BA.debugLine="Private Sub DrawDays";
Debug.ShouldStop(32768);
 BA.debugLineNum = 113;BA.debugLine="cvsBackground.DrawColor(Colors.Transparent)";
Debug.ShouldStop(65536);
__ref.getField(false,"_cvsbackground" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 114;BA.debugLine="cvs.DrawColor(Colors.Transparent)";
Debug.ShouldStop(131072);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawColor",(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Transparent")));
 BA.debugLineNum = 115;BA.debugLine="Dim firstDay As Long = DateUtils.SetDate(year, mo";
Debug.ShouldStop(262144);
_firstday = RemoteObject.solve(new RemoteObject[] {anotherdatepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, 1))),RemoteObject.createImmutable(1)}, "-",1, 2);Debug.locals.put("firstDay", _firstday);Debug.locals.put("firstDay", _firstday);
 BA.debugLineNum = 116;BA.debugLine="dayOfWeekOffset = DateTime.GetDayOfWeek(firstDay)";
Debug.ShouldStop(524288);
__ref.setField ("_dayofweekoffset" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfWeek",(Object)(_firstday)),RemoteObject.createImmutable(7)}, "%",0, 1));
 BA.debugLineNum = 117;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
Debug.ShouldStop(1048576);
__ref.setField ("_daysinmonth" /*RemoteObject*/ ,anotherdatepicker._dateutils.runMethod(true,"_numberofdaysinmonth",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ ))));
 BA.debugLineNum = 118;BA.debugLine="If year = selectedYear And month = selectedMonth";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_year" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedyear" /*RemoteObject*/ ))) && RemoteObject.solveBoolean("=",__ref.getField(true,"_month" /*RemoteObject*/ ),BA.numberCast(double.class, __ref.getField(true,"_selectedmonth" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 120;BA.debugLine="DrawBox(cvs, selectedColor, (selectedDay - 1 + d";
Debug.ShouldStop(8388608);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_drawbox" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cvs" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_selectedcolor" /*RemoteObject*/ )),(Object)(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_selectedday" /*RemoteObject*/ ),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0))));
 };
 BA.debugLineNum = 123;BA.debugLine="For day = 1 To daysInMonth";
Debug.ShouldStop(67108864);
{
final int step9 = 1;
final int limit9 = __ref.getField(true,"_daysinmonth" /*RemoteObject*/ ).<Integer>get().intValue();
_day = 1 ;
for (;(step9 > 0 && _day <= limit9) || (step9 < 0 && _day >= limit9) ;_day = ((int)(0 + _day + step9))  ) {
Debug.locals.put("day", _day);
 BA.debugLineNum = 124;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
Debug.ShouldStop(134217728);
_row = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1),__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ )}, "-+",2, 1)),RemoteObject.createImmutable(7)}, "/",0, 0));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 125;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
Debug.ShouldStop(268435456);
__ref.getField(false,"_cvs" /*RemoteObject*/ ).runVoidMethod ("DrawText",__ref.getField(false, "ba"),(Object)(BA.NumberToString(_day)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_dayofweekoffset" /*RemoteObject*/ ),RemoteObject.createImmutable(_day),RemoteObject.createImmutable(1)}, "+-",2, 1)),RemoteObject.createImmutable(7)}, "%",0, 1)),RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxw" /*RemoteObject*/ )}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_row,RemoteObject.createImmutable(0.5)}, "+",1, 0)),__ref.getField(true,"_boxh" /*RemoteObject*/ ),__ref.getField(true,"_vcorrection" /*RemoteObject*/ )}, "*+",1, 0))),(Object)(anotherdatepicker.__c.getField(false,"Typeface").getField(false,"DEFAULT_BOLD")),(Object)(__ref.getField(false,"_label1" /*RemoteObject*/ ).runMethod(true,"getTextSize")),(Object)(anotherdatepicker.__c.getField(false,"Colors").getField(true,"Black")),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Paint.Align"),RemoteObject.createImmutable("CENTER"))));
 }
}Debug.locals.put("day", _day);
;
 BA.debugLineNum = 128;BA.debugLine="DaysPanel.Invalidate";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_dayspanel" /*RemoteObject*/ ).runVoidMethod ("Invalidate");
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetDate (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("getdate")) { return __ref.runUserSub(false, "anotherdatepicker","getdate", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Public Sub GetDate As Long";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="Return selectedDate";
Debug.ShouldStop(8);
if (true) return __ref.getField(true,"_selecteddate" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0L);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "anotherdatepicker","hide", __ref);}
 BA.debugLineNum = 139;BA.debugLine="Public Sub Hide";
Debug.ShouldStop(1024);
 BA.debugLineNum = 140;BA.debugLine="holder.Visible = False";
Debug.ShouldStop(2048);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _holder_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("holder_Click (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("holder_click")) { return __ref.runUserSub(false, "anotherdatepicker","holder_click", __ref);}
 BA.debugLineNum = 204;BA.debugLine="Private Sub holder_Click";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="btnCancel_Click";
Debug.ShouldStop(4096);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_btncancel_click" /*RemoteObject*/ );
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _target,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "anotherdatepicker","initialize", __ref, _ba, _target, _eventname);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Target", _target);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 37;BA.debugLine="Public Sub Initialize (Target As Object, EventName";
Debug.ShouldStop(16);
 BA.debugLineNum = 38;BA.debugLine="mTarget = Target";
Debug.ShouldStop(32);
__ref.setField ("_mtarget" /*RemoteObject*/ ,_target);
 BA.debugLineNum = 39;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(64);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("IsVisible (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("isvisible")) { return __ref.runUserSub(false, "anotherdatepicker","isvisible", __ref);}
 BA.debugLineNum = 201;BA.debugLine="Public Sub IsVisible As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 202;BA.debugLine="Return holder.Visible";
Debug.ShouldStop(512);
if (true) return __ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _lbl_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("lbl_Click (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("lbl_click")) { return __ref.runUserSub(false, "anotherdatepicker","lbl_click", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Private Sub lbl_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 56;BA.debugLine="Show";
Debug.ShouldStop(8388608);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _months_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Months_ItemClick (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("months_itemclick")) { return __ref.runUserSub(false, "anotherdatepicker","months_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 192;BA.debugLine="Private Sub Months_ItemClick (Position As Int, Val";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="month = Position + 1";
Debug.ShouldStop(1);
__ref.setField ("_month" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 194;BA.debugLine="DrawDays";
Debug.ShouldStop(2);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectday(RemoteObject __ref,RemoteObject _day,RemoteObject _updatelabel) throws Exception{
try {
		Debug.PushSubsStack("SelectDay (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("selectday")) { return __ref.runUserSub(false, "anotherdatepicker","selectday", __ref, _day, _updatelabel);}
Debug.locals.put("day", _day);
Debug.locals.put("UpdateLabel", _updatelabel);
 BA.debugLineNum = 131;BA.debugLine="Private Sub SelectDay(day As Int, UpdateLabel As B";
Debug.ShouldStop(4);
 BA.debugLineNum = 132;BA.debugLine="selectedDate = DateUtils.SetDate(year, month, day";
Debug.ShouldStop(8);
__ref.setField ("_selecteddate" /*RemoteObject*/ ,anotherdatepicker._dateutils.runMethod(true,"_setdate",__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_year" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_month" /*RemoteObject*/ )),(Object)(_day)));
 BA.debugLineNum = 133;BA.debugLine="selectedDay = day";
Debug.ShouldStop(16);
__ref.setField ("_selectedday" /*RemoteObject*/ ,_day);
 BA.debugLineNum = 134;BA.debugLine="selectedMonth = month";
Debug.ShouldStop(32);
__ref.setField ("_selectedmonth" /*RemoteObject*/ ,__ref.getField(true,"_month" /*RemoteObject*/ ));
 BA.debugLineNum = 135;BA.debugLine="selectedYear = year";
Debug.ShouldStop(64);
__ref.setField ("_selectedyear" /*RemoteObject*/ ,__ref.getField(true,"_year" /*RemoteObject*/ ));
 BA.debugLineNum = 136;BA.debugLine="If UpdateLabel Then targetLabel.Text = DateTime.D";
Debug.ShouldStop(128);
if (_updatelabel.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_targetlabel" /*RemoteObject*/ ).runMethod(true,"setText",BA.ObjectToCharSequence(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(__ref.getField(true,"_selecteddate" /*RemoteObject*/ )))));};
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdate(RemoteObject __ref,RemoteObject _date,RemoteObject _updatelabel) throws Exception{
try {
		Debug.PushSubsStack("SetDate (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setdate")) { return __ref.runUserSub(false, "anotherdatepicker","setdate", __ref, _date, _updatelabel);}
Debug.locals.put("date", _date);
Debug.locals.put("UpdateLabel", _updatelabel);
 BA.debugLineNum = 104;BA.debugLine="Public Sub SetDate(date As Long, UpdateLabel As Bo";
Debug.ShouldStop(128);
 BA.debugLineNum = 105;BA.debugLine="year = DateTime.GetYear(date)";
Debug.ShouldStop(256);
__ref.setField ("_year" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetYear",(Object)(_date)));
 BA.debugLineNum = 106;BA.debugLine="month = DateTime.GetMonth(date)";
Debug.ShouldStop(512);
__ref.setField ("_month" /*RemoteObject*/ ,anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetMonth",(Object)(_date)));
 BA.debugLineNum = 107;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date), UpdateLab";
Debug.ShouldStop(1024);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_selectday" /*RemoteObject*/ ,(Object)(anotherdatepicker.__c.getField(false,"DateTime").runMethod(true,"GetDayOfMonth",(Object)(_date))),(Object)(_updatelabel));
 BA.debugLineNum = 108;BA.debugLine="Years.SelectedIndex = year - 1900";
Debug.ShouldStop(2048);
__ref.getField(false,"_years" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_year" /*RemoteObject*/ ),RemoteObject.createImmutable(1900)}, "-",1, 1));
 BA.debugLineNum = 109;BA.debugLine="Months.SelectedIndex = month - 1";
Debug.ShouldStop(4096);
__ref.getField(false,"_months" /*RemoteObject*/ ).runMethod(true,"setSelectedIndex",RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_month" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "anotherdatepicker","show", __ref);}
 BA.debugLineNum = 176;BA.debugLine="Public Sub Show";
Debug.ShouldStop(32768);
 BA.debugLineNum = 177;BA.debugLine="holder.Visible = True";
Debug.ShouldStop(65536);
__ref.getField(false,"_holder" /*RemoteObject*/ ).runMethod(true,"setVisible",anotherdatepicker.__c.getField(true,"True"));
 BA.debugLineNum = 178;BA.debugLine="DrawDays";
Debug.ShouldStop(131072);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _years_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Years_ItemClick (anotherdatepicker) ","anotherdatepicker",8,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("years_itemclick")) { return __ref.runUserSub(false, "anotherdatepicker","years_itemclick", __ref, _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 197;BA.debugLine="Private Sub Years_ItemClick (Position As Int, Valu";
Debug.ShouldStop(16);
 BA.debugLineNum = 198;BA.debugLine="year = Value";
Debug.ShouldStop(32);
__ref.setField ("_year" /*RemoteObject*/ ,BA.numberCast(int.class, _value));
 BA.debugLineNum = 199;BA.debugLine="DrawDays";
Debug.ShouldStop(64);
__ref.runClassMethod (com.jq.pedidos.anotherdatepicker.class, "_drawdays" /*RemoteObject*/ );
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}