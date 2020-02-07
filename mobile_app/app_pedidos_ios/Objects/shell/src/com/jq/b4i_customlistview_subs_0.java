package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_customlistview_subs_0 {


public static RemoteObject  _add(RemoteObject __ref,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("Add (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,379);
if (RapidSub.canDelegate("add")) { return __ref.runUserSub(false, "customlistview","add", __ref, _pnl, _value);}
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 379;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 380;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_customlistview.class, "_insertat:::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size")),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextitem(RemoteObject __ref,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddTextItem (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,188);
if (RapidSub.canDelegate("addtextitem")) { return __ref.runUserSub(false, "customlistview","addtextitem", __ref, _text, _value);}
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 188;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 189;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
Debug.ShouldStop(268435456);
__ref.runClassMethod (b4i_customlistview.class, "_insertattextitem:::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size")),(Object)(_text),(Object)(_value));
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
public static RemoteObject  _asview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AsView (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,130);
if (RapidSub.canDelegate("asview")) { return __ref.runUserSub(false, "customlistview","asview", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Public Sub AsView As B4XView";
Debug.ShouldStop(2);
 BA.debugLineNum = 131;BA.debugLine="Return mBase";
Debug.ShouldStop(4);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,106);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "customlistview","base_resize", __ref, _width, _height);}
RemoteObject _scrollbar = RemoteObject.createImmutable(0);
RemoteObject _it = RemoteObject.declareNull("_clvitem");
RemoteObject _lbl = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 106;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.ShouldStop(1024);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 108;BA.debugLine="Dim scrollbar As Int";
Debug.ShouldStop(2048);
_scrollbar = RemoteObject.createImmutable(0);Debug.locals.put("scrollbar", _scrollbar);
 BA.debugLineNum = 109;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4J")) && RemoteObject.solveBoolean(".",__ref.getField(true,"_scrollbarsvisible" /*RemoteObject*/ ))) { 
_scrollbar = BA.numberCast(int.class, 20);Debug.locals.put("scrollbar", _scrollbar);};
 BA.debugLineNum = 110;BA.debugLine="If horizontal Then";
Debug.ShouldStop(8192);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 111;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
Debug.ShouldStop(16384);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight:",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_height,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 112;BA.debugLine="For Each it As CLVItem In items";
Debug.ShouldStop(32768);
{
final RemoteObject group6 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"Size").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (group6.runMethod(false,"Get:",index6));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 113;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
Debug.ShouldStop(65536);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setHeight:",BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentHeight")));
 BA.debugLineNum = 114;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
Debug.ShouldStop(131072);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setHeight:",_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"Height"));
 }
}Debug.locals.put("it", _it);
;
 }else {
 BA.debugLineNum = 117;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
Debug.ShouldStop(1048576);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth:",BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,_scrollbar}, "-",1, 0)));
 BA.debugLineNum = 118;BA.debugLine="For Each it As CLVItem In items";
Debug.ShouldStop(2097152);
{
final RemoteObject group12 = __ref.getField(false,"_items" /*RemoteObject*/ );
final int groupLen12 = group12.runMethod(true,"Size").<Integer>get()
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (group12.runMethod(false,"Get:",index12));Debug.locals.put("it", _it);
Debug.locals.put("it", _it);
 BA.debugLineNum = 119;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
Debug.ShouldStop(4194304);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setWidth:",BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentWidth")));
 BA.debugLineNum = 120;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
Debug.ShouldStop(8388608);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runMethod(true,"setWidth:",_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"Width"));
 BA.debugLineNum = 121;BA.debugLine="If it.TextItem Then";
Debug.ShouldStop(16777216);
if (_it.getField(true,"TextItem" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 122;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
Debug.ShouldStop(33554432);
_lbl = RemoteObject.createNew ("B4XViewWrapper");
_lbl = _it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0)));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 123;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
Debug.ShouldStop(67108864);
_lbl.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(_lbl.runMethod(true,"Left")),(Object)(_lbl.runMethod(true,"Top")),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"Width"),_lbl.runMethod(true,"Left")}, "-",1, 0))),(Object)(_lbl.runMethod(true,"Height")));
 };
 }
}Debug.locals.put("it", _it);
;
 };
 BA.debugLineNum = 127;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4i_customlistview.class, "_updatevisiblerange" /*RemoteObject*/ );};
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As B4XView";
b4i_customlistview._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_customlistview._mbase);
 //BA.debugLineNum = 15;BA.debugLine="Public sv As B4XView";
b4i_customlistview._sv = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_sv",b4i_customlistview._sv);
 //BA.debugLineNum = 16;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
 //BA.debugLineNum = 18;BA.debugLine="Private items As List";
b4i_customlistview._items = RemoteObject.createNew ("B4IList");__ref.setField("_items",b4i_customlistview._items);
 //BA.debugLineNum = 19;BA.debugLine="Private mDividerSize As Float";
b4i_customlistview._mdividersize = RemoteObject.createImmutable(0.0f);__ref.setField("_mdividersize",b4i_customlistview._mdividersize);
 //BA.debugLineNum = 20;BA.debugLine="Private EventName As String";
b4i_customlistview._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",b4i_customlistview._eventname);
 //BA.debugLineNum = 21;BA.debugLine="Private CallBack As Object";
b4i_customlistview._callback = RemoteObject.createNew ("NSObject");__ref.setField("_callback",b4i_customlistview._callback);
 //BA.debugLineNum = 22;BA.debugLine="Public DefaultTextColor As Int";
b4i_customlistview._defaulttextcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextcolor",b4i_customlistview._defaulttextcolor);
 //BA.debugLineNum = 23;BA.debugLine="Public DefaultTextBackgroundColor As Int";
b4i_customlistview._defaulttextbackgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_defaulttextbackgroundcolor",b4i_customlistview._defaulttextbackgroundcolor);
 //BA.debugLineNum = 24;BA.debugLine="Public AnimationDuration As Int = 300";
b4i_customlistview._animationduration = BA.numberCast(int.class, 300);__ref.setField("_animationduration",b4i_customlistview._animationduration);
 //BA.debugLineNum = 25;BA.debugLine="Private LastReachEndEvent As Long";
b4i_customlistview._lastreachendevent = RemoteObject.createImmutable(0L);__ref.setField("_lastreachendevent",b4i_customlistview._lastreachendevent);
 //BA.debugLineNum = 26;BA.debugLine="Public PressedColor As Int";
b4i_customlistview._pressedcolor = RemoteObject.createImmutable(0);__ref.setField("_pressedcolor",b4i_customlistview._pressedcolor);
 //BA.debugLineNum = 27;BA.debugLine="Private xui As XUI";
b4i_customlistview._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_customlistview._xui);
 //BA.debugLineNum = 28;BA.debugLine="Private DesignerLabel As Label";
b4i_customlistview._designerlabel = RemoteObject.createNew ("B4ILabelWrapper");__ref.setField("_designerlabel",b4i_customlistview._designerlabel);
 //BA.debugLineNum = 29;BA.debugLine="Private horizontal As Boolean";
b4i_customlistview._horizontal = RemoteObject.createImmutable(false);__ref.setField("_horizontal",b4i_customlistview._horizontal);
 //BA.debugLineNum = 35;BA.debugLine="Private FeedbackGenerator As NativeObject";
b4i_customlistview._feedbackgenerator = RemoteObject.createNew ("B4INativeObject");__ref.setField("_feedbackgenerator",b4i_customlistview._feedbackgenerator);
 //BA.debugLineNum = 37;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
b4i_customlistview._mfirstvisibleindex = RemoteObject.createImmutable(0);__ref.setField("_mfirstvisibleindex",b4i_customlistview._mfirstvisibleindex);
b4i_customlistview._mlastvisibleindex = RemoteObject.createImmutable(0);__ref.setField("_mlastvisibleindex",b4i_customlistview._mlastvisibleindex);
 //BA.debugLineNum = 38;BA.debugLine="Private MonitorVisibleRange As Boolean";
b4i_customlistview._monitorvisiblerange = RemoteObject.createImmutable(false);__ref.setField("_monitorvisiblerange",b4i_customlistview._monitorvisiblerange);
 //BA.debugLineNum = 39;BA.debugLine="Private FireScrollChanged As Boolean";
b4i_customlistview._firescrollchanged = RemoteObject.createImmutable(false);__ref.setField("_firescrollchanged",b4i_customlistview._firescrollchanged);
 //BA.debugLineNum = 40;BA.debugLine="Private ScrollBarsVisible As Boolean";
b4i_customlistview._scrollbarsvisible = RemoteObject.createImmutable(false);__ref.setField("_scrollbarsvisible",b4i_customlistview._scrollbarsvisible);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,135);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "customlistview","clear", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Public Sub Clear";
Debug.ShouldStop(64);
 BA.debugLineNum = 136;BA.debugLine="items.Clear";
Debug.ShouldStop(128);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 137;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
Debug.ShouldStop(256);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 138;BA.debugLine="SetScrollViewContentSize(0)";
Debug.ShouldStop(512);
__ref.runClassMethod (b4i_customlistview.class, "_setscrollviewcontentsize:" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 139;BA.debugLine="ResetVisibles";
Debug.ShouldStop(1024);
__ref.runClassMethod (b4i_customlistview.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("CreateLabel (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,581);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "customlistview","createlabel", __ref, _txt);}
RemoteObject _lbl = RemoteObject.declareNull("B4ILabelWrapper");
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 581;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
Debug.ShouldStop(16);
 BA.debugLineNum = 582;BA.debugLine="Dim lbl As Label";
Debug.ShouldStop(32);
_lbl = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 583;BA.debugLine="lbl.Initialize(\"\")";
Debug.ShouldStop(64);
_lbl.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 584;BA.debugLine="lbl.TextAlignment = DesignerLabel.TextAlignment";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setTextAlignment:",__ref.getField(false,"_designerlabel" /*RemoteObject*/ ).runMethod(true,"TextAlignment"));
 BA.debugLineNum = 585;BA.debugLine="lbl.Font = DesignerLabel.Font";
Debug.ShouldStop(256);
_lbl.runMethod(false,"setFont:",__ref.getField(false,"_designerlabel" /*RemoteObject*/ ).runMethod(false,"Font"));
 BA.debugLineNum = 586;BA.debugLine="lbl.Multiline = True";
Debug.ShouldStop(512);
_lbl.runMethod(true,"setMultiline:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 587;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setTextColor:",__ref.getField(true,"_defaulttextcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 588;BA.debugLine="If txt Is AttributedString Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("i",_txt, RemoteObject.createImmutable("NSAttributedString"))) { 
 BA.debugLineNum = 589;BA.debugLine="lbl.AttributedText = txt";
Debug.ShouldStop(4096);
_lbl.runMethod(false,"setAttributedText:",BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IAttributedString"), _txt));
 }else {
 BA.debugLineNum = 591;BA.debugLine="lbl.Text = txt";
Debug.ShouldStop(16384);
_lbl.runMethod(true,"setText:",BA.ObjectToString(_txt));
 };
 BA.debugLineNum = 593;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
Debug.ShouldStop(65536);
_lbl.runMethod(true,"setWidth:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentWidth"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1)));
 BA.debugLineNum = 594;BA.debugLine="lbl.SizeToFit";
Debug.ShouldStop(131072);
_lbl.runVoidMethod ("SizeToFit");
 BA.debugLineNum = 595;BA.debugLine="Return lbl";
Debug.ShouldStop(262144);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_lbl).getObject());
 BA.debugLineNum = 596;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanel(RemoteObject __ref,RemoteObject _paneleventname) throws Exception{
try {
		Debug.PushSubsStack("CreatePanel (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,517);
if (RapidSub.canDelegate("createpanel")) { return __ref.runUserSub(false, "customlistview","createpanel", __ref, _paneleventname);}
Debug.locals.put("PanelEventName", _paneleventname);
 BA.debugLineNum = 517;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
Debug.ShouldStop(16);
 BA.debugLineNum = 518;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
Debug.ShouldStop(32);
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(_paneleventname));
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createscrollview(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateScrollView (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,569);
if (RapidSub.canDelegate("createscrollview")) { return __ref.runUserSub(false, "customlistview","createscrollview", __ref);}
RemoteObject _nsv = RemoteObject.declareNull("B4IScrollView");
 BA.debugLineNum = 569;BA.debugLine="Private Sub CreateScrollView As B4XView";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 570;BA.debugLine="Dim nsv As ScrollView";
Debug.ShouldStop(33554432);
_nsv = RemoteObject.createNew ("B4IScrollView");Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 571;BA.debugLine="nsv.Initialize(\"sv\", 0, 0)";
Debug.ShouldStop(67108864);
_nsv.runVoidMethod ("Initialize::::",__ref.getField(false, "bi"),(Object)(BA.ObjectToString("sv")),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 572;BA.debugLine="Return nsv";
Debug.ShouldStop(134217728);
if (true) return BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_nsv).getObject());
 BA.debugLineNum = 573;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,71);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "customlistview","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _o = RemoteObject.createImmutable("");
RemoteObject _no = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 71;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(64);
 BA.debugLineNum = 72;BA.debugLine="mBase = Base";
Debug.ShouldStop(128);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 73;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
Debug.ShouldStop(256);
_o = BA.ObjectToString(_props.runMethod(false,"GetDefault::",(Object)(RemoteObject.createImmutable(("ListOrientation"))),(Object)((RemoteObject.createImmutable("Vertical")))));Debug.locals.put("o", _o);Debug.locals.put("o", _o);
 BA.debugLineNum = 74;BA.debugLine="horizontal = o = \"Horizontal\"";
Debug.ShouldStop(512);
__ref.setField ("_horizontal" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean("=",_o,BA.ObjectToString("Horizontal"))));
 BA.debugLineNum = 75;BA.debugLine="sv = CreateScrollView";
Debug.ShouldStop(1024);
__ref.setField ("_sv" /*RemoteObject*/ ,__ref.runClassMethod (b4i_customlistview.class, "_createscrollview" /*RemoteObject*/ ));
 BA.debugLineNum = 76;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
Debug.ShouldStop(2048);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_sv" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 77;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
Debug.ShouldStop(4096);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel").runMethod(true,"setColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor:",(Object)(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("DividerColor")))))));
 BA.debugLineNum = 78;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
Debug.ShouldStop(8192);
__ref.setField ("_mdividersize" /*RemoteObject*/ ,BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, _props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("DividerHeight")))))))));
 BA.debugLineNum = 79;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
Debug.ShouldStop(16384);
__ref.setField ("_pressedcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor:",(Object)(_props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("PressedColor")))))));
 BA.debugLineNum = 80;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
Debug.ShouldStop(32768);
__ref.setField ("_animationduration" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"GetDefault::",(Object)(RemoteObject.createImmutable(("InsertAnimationDuration"))),(Object)((__ref.getField(true,"_animationduration" /*RemoteObject*/ ))))));
 BA.debugLineNum = 81;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
Debug.ShouldStop(65536);
__ref.setField ("_scrollbarsvisible" /*RemoteObject*/ ,BA.ObjectToBoolean(_props.runMethod(false,"GetDefault::",(Object)(RemoteObject.createImmutable(("ShowScrollBar"))),(Object)((b4i_main.__c.runMethod(true,"True"))))));
 BA.debugLineNum = 82;BA.debugLine="If ScrollBarsVisible = False Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_scrollbarsvisible" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 95;BA.debugLine="Dim no As NativeObject = sv";
Debug.ShouldStop(1073741824);
_no = RemoteObject.createNew ("B4INativeObject");
_no.setObject((__ref.getField(false,"_sv" /*RemoteObject*/ )).getObject());Debug.locals.put("no", _no);
 BA.debugLineNum = 96;BA.debugLine="no.RunMethod(\"setShowsHorizontalScrollIndicator:";
Debug.ShouldStop(-2147483648);
_no.runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("setShowsHorizontalScrollIndicator:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(b4i_main.__c.runMethod(true,"False"))})));
 BA.debugLineNum = 97;BA.debugLine="no.RunMethod(\"setShowsVerticalScrollIndicator:\",";
Debug.ShouldStop(1);
_no.runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("setShowsVerticalScrollIndicator:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {(b4i_main.__c.runMethod(true,"False"))})));
 };
 BA.debugLineNum = 100;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
Debug.ShouldStop(8);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"PaintOrColorToColor:",(Object)((_lbl.runMethod(true,"TextColor")))));
 BA.debugLineNum = 101;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
Debug.ShouldStop(16);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Color"));
 BA.debugLineNum = 102;BA.debugLine="DesignerLabel = Lbl";
Debug.ShouldStop(32);
__ref.setField ("_designerlabel" /*RemoteObject*/ ,_lbl);
 BA.debugLineNum = 103;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.ShouldStop(64);
__ref.runClassMethod (b4i_customlistview.class, "_base_resize::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"))));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _findindexfromoffset(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("FindIndexFromOffset (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,421);
if (RapidSub.canDelegate("findindexfromoffset")) { return __ref.runUserSub(false, "customlistview","findindexfromoffset", __ref, _offset);}
RemoteObject _position = RemoteObject.createImmutable(0);
RemoteObject _stepsize = RemoteObject.createImmutable(0);
RemoteObject _currentitem = RemoteObject.declareNull("_clvitem");
RemoteObject _nextoffset = RemoteObject.createImmutable(0);
RemoteObject _prevoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Offset", _offset);
 BA.debugLineNum = 421;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
Debug.ShouldStop(16);
 BA.debugLineNum = 423;BA.debugLine="Dim Position As Int = items.Size / 2";
Debug.ShouldStop(64);
_position = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(2)}, "/",0, 0));Debug.locals.put("Position", _position);Debug.locals.put("Position", _position);
 BA.debugLineNum = 424;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
Debug.ShouldStop(128);
_stepsize = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Ceil:",(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("StepSize", _stepsize);Debug.locals.put("StepSize", _stepsize);
 BA.debugLineNum = 425;BA.debugLine="Do While True";
Debug.ShouldStop(256);
while (b4i_main.__c.runMethod(true,"True").getBoolean()) {
 BA.debugLineNum = 426;BA.debugLine="Dim CurrentItem As CLVItem = items.Get(Position)";
Debug.ShouldStop(512);
_currentitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_position)));Debug.locals.put("CurrentItem", _currentitem);Debug.locals.put("CurrentItem", _currentitem);
 BA.debugLineNum = 427;BA.debugLine="Dim NextOffset As Int";
Debug.ShouldStop(1024);
_nextoffset = RemoteObject.createImmutable(0);Debug.locals.put("NextOffset", _nextoffset);
 BA.debugLineNum = 428;BA.debugLine="If Position < items.Size - 1 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("<",_position,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 429;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
Debug.ShouldStop(4096);
_nextoffset = RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(RemoteObject.solve(new RemoteObject[] {_position,RemoteObject.createImmutable(1)}, "+",1, 1))).getField(true,"Offset" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("NextOffset", _nextoffset);
 }else {
 BA.debugLineNum = 431;BA.debugLine="NextOffset = 0x7FFFFFFF";
Debug.ShouldStop(16384);
_nextoffset = BA.numberCast(int.class, 0x7fffffff);Debug.locals.put("NextOffset", _nextoffset);
 };
 BA.debugLineNum = 433;BA.debugLine="Dim PrevOffset As Int";
Debug.ShouldStop(65536);
_prevoffset = RemoteObject.createImmutable(0);Debug.locals.put("PrevOffset", _prevoffset);
 BA.debugLineNum = 434;BA.debugLine="If Position = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_position,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 435;BA.debugLine="PrevOffset = 0x80000000";
Debug.ShouldStop(262144);
_prevoffset = BA.numberCast(int.class, 0x80000000);Debug.locals.put("PrevOffset", _prevoffset);
 }else {
 BA.debugLineNum = 437;BA.debugLine="PrevOffset = CurrentItem.Offset";
Debug.ShouldStop(1048576);
_prevoffset = _currentitem.getField(true,"Offset" /*RemoteObject*/ );Debug.locals.put("PrevOffset", _prevoffset);
 };
 BA.debugLineNum = 439;BA.debugLine="If Offset > NextOffset Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean(">",_offset,BA.numberCast(double.class, _nextoffset))) { 
 BA.debugLineNum = 440;BA.debugLine="Position = Min(Position + StepSize, items.Size";
Debug.ShouldStop(8388608);
_position = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,_stepsize}, "+",1, 1))),(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1)))));Debug.locals.put("Position", _position);
 }else 
{ BA.debugLineNum = 441;BA.debugLine="Else if Offset < PrevOffset Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("<",_offset,BA.numberCast(double.class, _prevoffset))) { 
 BA.debugLineNum = 442;BA.debugLine="Position = Max(Position - StepSize, 0)";
Debug.ShouldStop(33554432);
_position = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_position,_stepsize}, "-",1, 1))),(Object)(BA.numberCast(double.class, 0))));Debug.locals.put("Position", _position);
 }else {
 BA.debugLineNum = 444;BA.debugLine="Return Position";
Debug.ShouldStop(134217728);
if (true) return _position;
 }}
;
 BA.debugLineNum = 446;BA.debugLine="StepSize = Ceil(StepSize / 2)";
Debug.ShouldStop(536870912);
_stepsize = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Ceil:",(Object)(RemoteObject.solve(new RemoteObject[] {_stepsize,RemoteObject.createImmutable(2)}, "/",0, 0))));Debug.locals.put("StepSize", _stepsize);
 }
;
 BA.debugLineNum = 448;BA.debugLine="Return -1";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(int.class, -(double) (0 + 1));
 BA.debugLineNum = 449;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _finditemoffset(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("FindItemOffset (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,416);
if (RapidSub.canDelegate("finditemoffset")) { return __ref.runUserSub(false, "customlistview","finditemoffset", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 416;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 417;BA.debugLine="Return GetRawListItem(Index).Offset";
Debug.ShouldStop(1);
if (true) return __ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(_index)).getField(true,"Offset" /*RemoteObject*/ );
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetBase (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,142);
if (RapidSub.canDelegate("getbase")) { return __ref.runUserSub(false, "customlistview","getbase", __ref);}
 BA.debugLineNum = 142;BA.debugLine="Public Sub GetBase As B4XView";
Debug.ShouldStop(8192);
 BA.debugLineNum = 143;BA.debugLine="Return mBase";
Debug.ShouldStop(16384);
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdividersize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getDividerSize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,521);
if (RapidSub.canDelegate("getdividersize")) { return __ref.runUserSub(false, "customlistview","getdividersize", __ref);}
 BA.debugLineNum = 521;BA.debugLine="Public Sub getDividerSize As Float";
Debug.ShouldStop(256);
 BA.debugLineNum = 522;BA.debugLine="Return mDividerSize";
Debug.ShouldStop(512);
if (true) return __ref.getField(true,"_mdividersize" /*RemoteObject*/ );
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfirstvisibleindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getFirstVisibleIndex (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,452);
if (RapidSub.canDelegate("getfirstvisibleindex")) { return __ref.runUserSub(false, "customlistview","getfirstvisibleindex", __ref);}
 BA.debugLineNum = 452;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
Debug.ShouldStop(16);
if (true) return __ref.runClassMethod (b4i_customlistview.class, "_findindexfromoffset:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewoffset" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitemfromview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetItemFromView (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,490);
if (RapidSub.canDelegate("getitemfromview")) { return __ref.runUserSub(false, "customlistview","getitemfromview", __ref, _v);}
RemoteObject _parent = RemoteObject.declareNull("NSObject");
RemoteObject _current = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("v", _v);
 BA.debugLineNum = 490;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
Debug.ShouldStop(512);
 BA.debugLineNum = 491;BA.debugLine="Dim parent = v As Object, current As B4XView";
Debug.ShouldStop(1024);
_parent = ((_v).getObject());Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
_current = RemoteObject.createNew ("B4XViewWrapper");Debug.locals.put("current", _current);
 BA.debugLineNum = 492;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
Debug.ShouldStop(2048);
while (RemoteObject.solveBoolean("!",__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel"),_parent)) {
 BA.debugLineNum = 493;BA.debugLine="current = parent";
Debug.ShouldStop(4096);
_current.setObject(_parent);
 BA.debugLineNum = 494;BA.debugLine="parent = current.Parent";
Debug.ShouldStop(8192);
_parent = ((_current.runMethod(false,"Parent")).getObject());Debug.locals.put("parent", _parent);
 }
;
 BA.debugLineNum = 496;BA.debugLine="v = current";
Debug.ShouldStop(32768);
_v = _current;Debug.locals.put("v", _v);
 BA.debugLineNum = 497;BA.debugLine="Return v.Tag";
Debug.ShouldStop(65536);
if (true) return BA.numberCast(int.class, _v.runMethod(false,"Tag"));
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getlastvisibleindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLastVisibleIndex (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,457);
if (RapidSub.canDelegate("getlastvisibleindex")) { return __ref.runUserSub(false, "customlistview","getlastvisibleindex", __ref);}
 BA.debugLineNum = 457;BA.debugLine="Public Sub getLastVisibleIndex As Int";
Debug.ShouldStop(256);
 BA.debugLineNum = 458;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
Debug.ShouldStop(512);
if (true) return __ref.runClassMethod (b4i_customlistview.class, "_findindexfromoffset:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewoffset" /*RemoteObject*/ ),__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "+",1, 0))));
 BA.debugLineNum = 459;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaxscrolloffset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetMaxScrollOffset (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,388);
if (RapidSub.canDelegate("getmaxscrolloffset")) { return __ref.runUserSub(false, "customlistview","getmaxscrolloffset", __ref);}
 BA.debugLineNum = 388;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
Debug.ShouldStop(8);
 BA.debugLineNum = 389;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
Debug.ShouldStop(16);
if (true) return BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "-",1, 0));
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,157);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "customlistview","getpanel", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 157;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
Debug.ShouldStop(536870912);
if (true) return __ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(_index)).getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrawlistitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetRawListItem (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,152);
if (RapidSub.canDelegate("getrawlistitem")) { return __ref.runUserSub(false, "customlistview","getrawlistitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 152;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVItem";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 153;BA.debugLine="Return items.Get(Index)";
Debug.ShouldStop(16777216);
if (true) return (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewcontentsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewContentSize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,332);
if (RapidSub.canDelegate("getscrollviewcontentsize")) { return __ref.runUserSub(false, "customlistview","getscrollviewcontentsize", __ref);}
 BA.debugLineNum = 332;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
Debug.ShouldStop(2048);
 BA.debugLineNum = 333;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 334;BA.debugLine="Return sv.ScrollViewContentWidth";
Debug.ShouldStop(8192);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentWidth"));
 }else {
 BA.debugLineNum = 336;BA.debugLine="Return sv.ScrollViewContentHeight";
Debug.ShouldStop(32768);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentHeight"));
 };
 BA.debugLineNum = 338;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewoffset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewOffset (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,316);
if (RapidSub.canDelegate("getscrollviewoffset")) { return __ref.runUserSub(false, "customlistview","getscrollviewoffset", __ref);}
 BA.debugLineNum = 316;BA.debugLine="Private Sub GetScrollViewOffset As Float";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 317;BA.debugLine="If horizontal Then";
Debug.ShouldStop(268435456);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 318;BA.debugLine="Return sv.ScrollViewOffsetX";
Debug.ShouldStop(536870912);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewOffsetX"));
 }else {
 BA.debugLineNum = 320;BA.debugLine="Return sv.ScrollViewOffsetY";
Debug.ShouldStop(-2147483648);
if (true) return BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewOffsetY"));
 };
 BA.debugLineNum = 322;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getscrollviewvisiblesize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetScrollViewVisibleSize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,308);
if (RapidSub.canDelegate("getscrollviewvisiblesize")) { return __ref.runUserSub(false, "customlistview","getscrollviewvisiblesize", __ref);}
 BA.debugLineNum = 308;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
Debug.ShouldStop(524288);
 BA.debugLineNum = 309;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1048576);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 310;BA.debugLine="Return sv.Width";
Debug.ShouldStop(2097152);
if (true) return __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"Width");
 }else {
 BA.debugLineNum = 312;BA.debugLine="Return sv.Height";
Debug.ShouldStop(8388608);
if (true) return __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"Height");
 };
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getsize(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,147);
if (RapidSub.canDelegate("getsize")) { return __ref.runUserSub(false, "customlistview","getsize", __ref);}
 BA.debugLineNum = 147;BA.debugLine="Public Sub getSize As Int";
Debug.ShouldStop(262144);
 BA.debugLineNum = 148;BA.debugLine="Return items.Size";
Debug.ShouldStop(524288);
if (true) return __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size");
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetValue (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,162);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "customlistview","getvalue", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 162;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="Return GetRawListItem(Index).Value";
Debug.ShouldStop(4);
if (true) return __ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(_index)).getField(false,"Value" /*RemoteObject*/ );
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _vcallback,RemoteObject _veventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,43);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "customlistview","initialize", __ref, _ba, _vcallback, _veventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("vCallBack", _vcallback);
Debug.locals.put("vEventName", _veventname);
 BA.debugLineNum = 43;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
Debug.ShouldStop(1024);
 BA.debugLineNum = 44;BA.debugLine="EventName = vEventName";
Debug.ShouldStop(2048);
__ref.setField ("_eventname" /*RemoteObject*/ ,_veventname);
 BA.debugLineNum = 45;BA.debugLine="CallBack = vCallBack";
Debug.ShouldStop(4096);
__ref.setField ("_callback" /*RemoteObject*/ ,_vcallback);
 BA.debugLineNum = 46;BA.debugLine="items.Initialize";
Debug.ShouldStop(8192);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
Debug.ShouldStop(16384);
__ref.setField ("_defaulttextbackgroundcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 48;BA.debugLine="DefaultTextColor = xui.Color_Black";
Debug.ShouldStop(32768);
__ref.setField ("_defaulttextcolor" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Black"));
 BA.debugLineNum = 49;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
Debug.ShouldStop(65536);
__ref.setField ("_monitorvisiblerange" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleRangeChanged"))),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 50;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
Debug.ShouldStop(131072);
__ref.setField ("_firescrollchanged" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)(BA.numberCast(int.class, 1))));
 BA.debugLineNum = 52;BA.debugLine="FeedbackGenerator.Initialize(\"UIImpactFeedbackGen";
Debug.ShouldStop(524288);
__ref.getField(false,"_feedbackgenerator" /*RemoteObject*/ ).runVoidMethod ("Initialize:",(Object)(RemoteObject.createImmutable("UIImpactFeedbackGenerator")));
 BA.debugLineNum = 53;BA.debugLine="If FeedbackGenerator.IsInitialized Then";
Debug.ShouldStop(1048576);
if (__ref.getField(false,"_feedbackgenerator" /*RemoteObject*/ ).runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 54;BA.debugLine="FeedbackGenerator =FeedbackGenerator.RunMethod(\"";
Debug.ShouldStop(2097152);
__ref.setField ("_feedbackgenerator" /*RemoteObject*/ ,__ref.getField(false,"_feedbackgenerator" /*RemoteObject*/ ).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("alloc")),(Object)((b4i_main.__c.runMethod(false,"Null")))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("initWithStyle:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable((0))}))));
 };
 BA.debugLineNum = 57;BA.debugLine="ResetVisibles";
Debug.ShouldStop(16777216);
__ref.runClassMethod (b4i_customlistview.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAt (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,213);
if (RapidSub.canDelegate("insertat")) { return __ref.runUserSub(false, "customlistview","insertat", __ref, _index, _pnl, _value);}
RemoteObject _size = RemoteObject.createImmutable(0.0f);
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 213;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="Dim size As Float";
Debug.ShouldStop(2097152);
_size = RemoteObject.createImmutable(0.0f);Debug.locals.put("size", _size);
 BA.debugLineNum = 215;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4194304);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 216;BA.debugLine="size = pnl.Width";
Debug.ShouldStop(8388608);
_size = _pnl.runMethod(true,"Width");Debug.locals.put("size", _size);
 }else {
 BA.debugLineNum = 218;BA.debugLine="size = pnl.Height";
Debug.ShouldStop(33554432);
_size = _pnl.runMethod(true,"Height");Debug.locals.put("size", _size);
 };
 BA.debugLineNum = 220;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_customlistview.class, "_insertatimpl:::::" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(BA.numberCast(int.class, _size)),(Object)(_value),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertatimpl(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemsize,RemoteObject _value,RemoteObject _initialsize) throws Exception{
try {
		Debug.PushSubsStack("InsertAtImpl (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,224);
if (RapidSub.canDelegate("insertatimpl")) { return __ref.runUserSub(false, "customlistview","insertatimpl", __ref, _index, _pnl, _itemsize, _value, _initialsize);}
RemoteObject _p = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _includedividierheight = RemoteObject.createImmutable(0);
RemoteObject _newitem = RemoteObject.declareNull("_clvitem");
RemoteObject _offset = RemoteObject.createImmutable(0);
RemoteObject _previtem = RemoteObject.declareNull("_clvitem");
int _i = 0;
RemoteObject _it = RemoteObject.declareNull("_clvitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
Debug.locals.put("Pnl", _pnl);
Debug.locals.put("ItemSize", _itemsize);
Debug.locals.put("Value", _value);
Debug.locals.put("InitialSize", _initialsize);
 BA.debugLineNum = 224;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 226;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
Debug.ShouldStop(2);
_p = RemoteObject.createNew ("B4XViewWrapper");
_p = __ref.runClassMethod (b4i_customlistview.class, "_createpanel:" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Panel")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 227;BA.debugLine="p.Color = Pnl.Color";
Debug.ShouldStop(4);
_p.runMethod(true,"setColor:",_pnl.runMethod(true,"Color"));
 BA.debugLineNum = 228;BA.debugLine="Pnl.Color = xui.Color_Transparent";
Debug.ShouldStop(8);
_pnl.runMethod(true,"setColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Transparent"));
 BA.debugLineNum = 229;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 230;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
Debug.ShouldStop(32);
_p.runVoidMethod ("AddView:::::",(Object)(((_pnl).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _itemsize)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentHeight"))));
 }else {
 BA.debugLineNum = 232;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
Debug.ShouldStop(128);
_p.runVoidMethod ("AddView:::::",(Object)(((_pnl).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentWidth"))),(Object)(BA.numberCast(float.class, _itemsize)));
 };
 BA.debugLineNum = 234;BA.debugLine="p.Tag = Index";
Debug.ShouldStop(512);
_p.runMethod(false,"setTag:",(_index));
 BA.debugLineNum = 235;BA.debugLine="Dim IncludeDividierHeight As Int";
Debug.ShouldStop(1024);
_includedividierheight = RemoteObject.createImmutable(0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);
 BA.debugLineNum = 236;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_initialsize,BA.numberCast(double.class, 0))) { 
_includedividierheight = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("IncludeDividierHeight", _includedividierheight);}
else {
_includedividierheight = BA.numberCast(int.class, 0);Debug.locals.put("IncludeDividierHeight", _includedividierheight);};
 BA.debugLineNum = 237;BA.debugLine="Dim NewItem As CLVItem";
Debug.ShouldStop(4096);
_newitem = RemoteObject.createNew ("_clvitem");Debug.locals.put("NewItem", _newitem);
 BA.debugLineNum = 238;BA.debugLine="NewItem.Panel = p";
Debug.ShouldStop(8192);
_newitem.setField ("Panel" /*RemoteObject*/ ,_p);
 BA.debugLineNum = 239;BA.debugLine="NewItem.Size = ItemSize";
Debug.ShouldStop(16384);
_newitem.setField ("Size" /*RemoteObject*/ ,_itemsize);
 BA.debugLineNum = 240;BA.debugLine="NewItem.Value = Value";
Debug.ShouldStop(32768);
_newitem.setField ("Value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 241;BA.debugLine="NewItem.Color = p.Color";
Debug.ShouldStop(65536);
_newitem.setField ("Color" /*RemoteObject*/ ,_p.runMethod(true,"Color"));
 BA.debugLineNum = 242;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"))) && RemoteObject.solveBoolean("=",_initialsize,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 243;BA.debugLine="items.Add(NewItem)";
Debug.ShouldStop(262144);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add:",(Object)((_newitem)));
 BA.debugLineNum = 244;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(524288);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 245;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 246;BA.debugLine="offset = mDividerSize";
Debug.ShouldStop(2097152);
_offset = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 }else {
 BA.debugLineNum = 248;BA.debugLine="offset = GetScrollViewContentSize";
Debug.ShouldStop(8388608);
_offset = BA.numberCast(int.class, __ref.runClassMethod (b4i_customlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 };
 BA.debugLineNum = 250;BA.debugLine="NewItem.Offset = offset";
Debug.ShouldStop(33554432);
_newitem.setField ("Offset" /*RemoteObject*/ ,_offset);
 BA.debugLineNum = 251;BA.debugLine="If horizontal Then";
Debug.ShouldStop(67108864);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 252;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(134217728);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel").runVoidMethod ("AddView:::::",(Object)(((_p).getObject())),(Object)(BA.numberCast(float.class, _offset)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _itemsize)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"Height")));
 }else {
 BA.debugLineNum = 254;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(536870912);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel").runVoidMethod ("AddView:::::",(Object)(((_p).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _offset)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _itemsize)));
 };
 }else {
 BA.debugLineNum = 257;BA.debugLine="Dim offset As Int";
Debug.ShouldStop(1);
_offset = RemoteObject.createImmutable(0);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 258;BA.debugLine="If Index = 0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 259;BA.debugLine="offset = mDividerSize";
Debug.ShouldStop(4);
_offset = BA.numberCast(int.class, __ref.getField(true,"_mdividersize" /*RemoteObject*/ ));Debug.locals.put("offset", _offset);
 }else {
 BA.debugLineNum = 261;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
Debug.ShouldStop(16);
_previtem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "-",1, 1))));Debug.locals.put("PrevItem", _previtem);Debug.locals.put("PrevItem", _previtem);
 BA.debugLineNum = 262;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
Debug.ShouldStop(32);
_offset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_previtem.getField(true,"Offset" /*RemoteObject*/ ),_previtem.getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "++",2, 0));Debug.locals.put("offset", _offset);
 };
 BA.debugLineNum = 264;BA.debugLine="For i = Index To items.Size - 1";
Debug.ShouldStop(128);
{
final int step39 = 1;
final int limit39 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = _index.<Number>get().intValue() ;
for (;(step39 > 0 && _i <= limit39) || (step39 < 0 && _i >= limit39) ;_i = ((int)(0 + _i + step39))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 265;BA.debugLine="Dim It As CLVItem = items.Get(i)";
Debug.ShouldStop(256);
_it = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("It", _it);Debug.locals.put("It", _it);
 BA.debugLineNum = 266;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
Debug.ShouldStop(512);
_newoffset = RemoteObject.solve(new RemoteObject[] {_it.getField(true,"Offset" /*RemoteObject*/ ),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 1);Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 267;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, _newoffset)),(Object)(BA.numberCast(double.class, _it.getField(true,"Offset" /*RemoteObject*/ )))),__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewoffset" /*RemoteObject*/ )}, "-",1, 0),BA.numberCast(double.class, __ref.runClassMethod (b4i_customlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 268;BA.debugLine="It.Offset = NewOffset";
Debug.ShouldStop(2048);
_it.setField ("Offset" /*RemoteObject*/ ,_newoffset);
 BA.debugLineNum = 269;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 270;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(8192);
_it.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _newoffset)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _it.getField(true,"Size" /*RemoteObject*/ ))),(Object)(_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"Height")));
 }else {
 BA.debugLineNum = 272;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
Debug.ShouldStop(32768);
_it.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _newoffset)),(Object)(_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _it.getField(true,"Size" /*RemoteObject*/ ))));
 };
 }else {
 BA.debugLineNum = 275;BA.debugLine="SetItemOffset(It, NewOffset)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4i_customlistview.class, "_setitemoffset::" /*RemoteObject*/ ,(Object)(_it),(Object)(BA.numberCast(float.class, _newoffset)));
 };
 BA.debugLineNum = 277;BA.debugLine="It.Panel.Tag = i + 1";
Debug.ShouldStop(1048576);
_it.getField(false,"Panel" /*RemoteObject*/ ).runMethod(false,"setTag:",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 279;BA.debugLine="items.InsertAt(Index, NewItem)";
Debug.ShouldStop(4194304);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("InsertAt::",(Object)(_index),(Object)((_newitem)));
 BA.debugLineNum = 280;BA.debugLine="NewItem.Offset = offset";
Debug.ShouldStop(8388608);
_newitem.setField ("Offset" /*RemoteObject*/ ,_offset);
 BA.debugLineNum = 281;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16777216);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 282;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
Debug.ShouldStop(33554432);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel").runVoidMethod ("AddView:::::",(Object)(((_p).getObject())),(Object)(BA.numberCast(float.class, _offset)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _initialsize)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 283;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
Debug.ShouldStop(67108864);
_p.runVoidMethod ("SetLayoutAnimated:::::",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, _offset)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _itemsize)),(Object)(_p.runMethod(true,"Height")));
 }else {
 BA.debugLineNum = 285;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
Debug.ShouldStop(268435456);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(false,"ScrollViewInnerPanel").runVoidMethod ("AddView:::::",(Object)(((_p).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _offset)),(Object)(__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _initialsize)));
 BA.debugLineNum = 286;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
Debug.ShouldStop(536870912);
_p.runVoidMethod ("SetLayoutAnimated:::::",(Object)(__ref.getField(true,"_animationduration" /*RemoteObject*/ )),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _offset)),(Object)(_p.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _itemsize)));
 };
 };
 BA.debugLineNum = 289;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(1);
__ref.runClassMethod (b4i_customlistview.class, "_setscrollviewcontentsize:" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_itemsize,_initialsize,_includedividierheight}, "+-+",3, 0))));
 BA.debugLineNum = 290;BA.debugLine="If items.Size = 1 And Index = 0 Then SetScrollVie";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),BA.numberCast(double.class, 1)) && RemoteObject.solveBoolean("=",_index,BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4i_customlistview.class, "_setscrollviewcontentsize:" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_itemsize,__ref.getField(true,"_mdividersize" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "+*",1, 0))));};
 BA.debugLineNum = 291;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("<",_index,BA.numberCast(double.class, __ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("<",RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))).getField(true,"Offset" /*RemoteObject*/ ),__ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))).getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "++",2, 0),BA.numberCast(double.class, __ref.runClassMethod (b4i_customlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 293;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(16);
__ref.runClassMethod (b4i_customlistview.class, "_updatevisiblerange" /*RemoteObject*/ );
 };
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertattextitem(RemoteObject __ref,RemoteObject _index,RemoteObject _text,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("InsertAtTextItem (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,193);
if (RapidSub.canDelegate("insertattextitem")) { return __ref.runUserSub(false, "customlistview","insertattextitem", __ref, _index, _text, _value);}
RemoteObject _pnl = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _lbl = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _item = RemoteObject.declareNull("_clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("Text", _text);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 193;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="If horizontal Then";
Debug.ShouldStop(2);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 195;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
Debug.ShouldStop(4);
b4i_main.__c.runVoidMethod ("LogImpl:::","414680066",RemoteObject.createImmutable("AddTextItem is only supported in vertical orientation."),0);
 BA.debugLineNum = 196;BA.debugLine="Return";
Debug.ShouldStop(8);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 198;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
Debug.ShouldStop(32);
_pnl = RemoteObject.createNew ("B4XViewWrapper");
_pnl = __ref.runClassMethod (b4i_customlistview.class, "_createpanel:" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 199;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
Debug.ShouldStop(64);
_lbl = RemoteObject.createNew ("B4XViewWrapper");
_lbl = __ref.runClassMethod (b4i_customlistview.class, "_createlabel:" /*RemoteObject*/ ,(Object)(_text));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 200;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
Debug.ShouldStop(128);
_lbl.runMethod(true,"setHeight:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(double.class, _lbl.runMethod(true,"Height"))))));
 BA.debugLineNum = 201;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
Debug.ShouldStop(256);
_pnl.runVoidMethod ("AddView:::::",(Object)(((_lbl).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 5))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"ScrollViewContentWidth"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 10)))}, "-",1, 1))),(Object)(_lbl.runMethod(true,"Height")));
 BA.debugLineNum = 202;BA.debugLine="If xui.IsB4i = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 203;BA.debugLine="lbl.TextColor = DefaultTextColor";
Debug.ShouldStop(1024);
_lbl.runMethod(true,"setTextColor:",__ref.getField(true,"_defaulttextcolor" /*RemoteObject*/ ));
 };
 BA.debugLineNum = 205;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
Debug.ShouldStop(4096);
_pnl.runMethod(true,"setColor:",__ref.getField(true,"_defaulttextbackgroundcolor" /*RemoteObject*/ ));
 BA.debugLineNum = 206;BA.debugLine="pnl.Height = lbl.Height + 2dip";
Debug.ShouldStop(8192);
_pnl.runMethod(true,"setHeight:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_lbl.runMethod(true,"Height"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2)))}, "+",1, 0)));
 BA.debugLineNum = 207;BA.debugLine="InsertAt(Index, pnl, Value)";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4i_customlistview.class, "_insertat:::" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(_value));
 BA.debugLineNum = 208;BA.debugLine="Dim item As CLVItem = GetRawListItem(Index)";
Debug.ShouldStop(32768);
_item = __ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 209;BA.debugLine="item.TextItem = True";
Debug.ShouldStop(65536);
_item.setField ("TextItem" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jumptoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("JumpToItem (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,384);
if (RapidSub.canDelegate("jumptoitem")) { return __ref.runUserSub(false, "customlistview","jumptoitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 384;BA.debugLine="Public Sub JumpToItem(Index As Int)";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 385;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
Debug.ShouldStop(1);
__ref.runClassMethod (b4i_customlistview.class, "_setscrollviewoffset:" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4i_customlistview.class, "_getmaxscrolloffset" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4i_customlistview.class, "_finditemoffset:" /*RemoteObject*/ ,(Object)(_index))))))));
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_Click (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,528);
if (RapidSub.canDelegate("panel_click")) { return __ref.runUserSub(false, "customlistview","panel_click", __ref);}
 BA.debugLineNum = 528;BA.debugLine="Private Sub Panel_Click";
Debug.ShouldStop(32768);
 BA.debugLineNum = 529;BA.debugLine="PanelClickHandler(Sender)";
Debug.ShouldStop(65536);
__ref.runClassMethod (b4i_customlistview.class, "_panelclickhandler:" /*void*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))));
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panel_longclick(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Panel_LongClick (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,532);
if (RapidSub.canDelegate("panel_longclick")) { return __ref.runUserSub(false, "customlistview","panel_longclick", __ref);}
 BA.debugLineNum = 532;BA.debugLine="Private Sub Panel_LongClick";
Debug.ShouldStop(524288);
 BA.debugLineNum = 533;BA.debugLine="PanelLongClickHandler(Sender)";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_customlistview.class, "_panellongclickhandler:" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), b4i_main.__c.runMethod(false,"Sender:",__ref.getField(false, "bi"))));
 BA.debugLineNum = 534;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _panelclickhandler(RemoteObject __ref,RemoteObject _senderpanel) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,473);
if (RapidSub.canDelegate("panelclickhandler")) { __ref.runUserSub(false, "customlistview","panelclickhandler", __ref, _senderpanel); return;}
ResumableSub_PanelClickHandler rsub = new ResumableSub_PanelClickHandler(null,__ref,_senderpanel);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_PanelClickHandler extends BA.ResumableSub {
public ResumableSub_PanelClickHandler(b4i_customlistview parent,RemoteObject __ref,RemoteObject _senderpanel) {
this.parent = parent;
this.__ref = __ref;
this._senderpanel = _senderpanel;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_customlistview parent;
RemoteObject _senderpanel;
RemoteObject _clr = RemoteObject.createImmutable(0);
RemoteObject _istransparentpressedcolor = RemoteObject.createImmutable(false);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("PanelClickHandler (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,473);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("SenderPanel", _senderpanel);
 BA.debugLineNum = 475;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
Debug.ShouldStop(67108864);
_clr = __ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"Tag")))).getField(true,"Color" /*RemoteObject*/ );Debug.locals.put("clr", _clr);Debug.locals.put("clr", _clr);
 BA.debugLineNum = 476;BA.debugLine="Dim IsTransparentPressedColor As Boolean = Bit.An";
Debug.ShouldStop(134217728);
_istransparentpressedcolor = BA.ObjectToBoolean(RemoteObject.solveBoolean("=",b4i_main.__c.runMethod(false,"Bit").runMethod(true,"And::",(Object)(BA.numberCast(int.class, 0xff000000)),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ ))),BA.numberCast(double.class, 0)));Debug.locals.put("IsTransparentPressedColor", _istransparentpressedcolor);Debug.locals.put("IsTransparentPressedColor", _istransparentpressedcolor);
 BA.debugLineNum = 477;BA.debugLine="If IsTransparentPressedColor = False Then";
Debug.ShouldStop(268435456);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("=",_istransparentpressedcolor,b4i_main.__c.runMethod(true,"False"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 478;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedCol";
Debug.ShouldStop(536870912);
_senderpanel.runVoidMethod ("SetColorAnimated:::",(Object)(BA.numberCast(int.class, 50)),(Object)(_clr),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 480;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";
Debug.ShouldStop(-2147483648);

case 4:
//if
this.state = 7;
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(BA.numberCast(int.class, 2))).getBoolean()) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
 BA.debugLineNum = 481;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
Debug.ShouldStop(1);
b4i_main.__c.runMethodAndSync(false,"CallSub3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemClick"))),(Object)(_senderpanel.runMethod(false,"Tag")),(Object)(__ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"Tag")))).getField(false,"Value" /*RemoteObject*/ )));
 if (true) break;
;
 BA.debugLineNum = 483;BA.debugLine="If IsTransparentPressedColor = False Then";
Debug.ShouldStop(4);

case 7:
//if
this.state = 10;
if (RemoteObject.solveBoolean("=",_istransparentpressedcolor,b4i_main.__c.runMethod(true,"False"))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 484;BA.debugLine="Sleep(200)";
Debug.ShouldStop(8);
b4i_main.__c.runVoidMethod ("Sleep:::",__ref.getField(false, "bi"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "customlistview", "panelclickhandler"),BA.numberCast(int.class, 200));
this.state = 11;
return;
case 11:
//C
this.state = 10;
;
 BA.debugLineNum = 485;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor,";
Debug.ShouldStop(16);
_senderpanel.runVoidMethod ("SetColorAnimated:::",(Object)(BA.numberCast(int.class, 200)),(Object)(__ref.getField(true,"_pressedcolor" /*RemoteObject*/ )),(Object)(_clr));
 if (true) break;

case 10:
//C
this.state = -1;
;
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _panellongclickhandler(RemoteObject __ref,RemoteObject _senderpanel) throws Exception{
try {
		Debug.PushSubsStack("PanelLongClickHandler (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,462);
if (RapidSub.canDelegate("panellongclickhandler")) { return __ref.runUserSub(false, "customlistview","panellongclickhandler", __ref, _senderpanel);}
Debug.locals.put("SenderPanel", _senderpanel);
 BA.debugLineNum = 462;BA.debugLine="Private Sub PanelLongClickHandler(SenderPanel As B";
Debug.ShouldStop(8192);
 BA.debugLineNum = 463;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemLong";
Debug.ShouldStop(16384);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemLongClick"))),(Object)(BA.numberCast(int.class, 2))).getBoolean()) { 
 BA.debugLineNum = 465;BA.debugLine="If FeedbackGenerator.IsInitialized Then";
Debug.ShouldStop(65536);
if (__ref.getField(false,"_feedbackgenerator" /*RemoteObject*/ ).runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 466;BA.debugLine="FeedbackGenerator.RunMethod(\"impactOccurred\", N";
Debug.ShouldStop(131072);
__ref.getField(false,"_feedbackgenerator" /*RemoteObject*/ ).runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("impactOccurred")),(Object)((b4i_main.__c.runMethod(false,"Null"))));
 };
 BA.debugLineNum = 469;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemLongClick\",";
Debug.ShouldStop(1048576);
b4i_main.__c.runMethodAndSync(false,"CallSub3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ItemLongClick"))),(Object)(_senderpanel.runMethod(false,"Tag")),(Object)(__ref.runClassMethod (b4i_customlistview.class, "_getrawlistitem:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _senderpanel.runMethod(false,"Tag")))).getField(false,"Value" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 471;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,66);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "customlistview","refresh", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Public Sub Refresh";
Debug.ShouldStop(2);
 BA.debugLineNum = 67;BA.debugLine="ResetVisibles";
Debug.ShouldStop(4);
__ref.runClassMethod (b4i_customlistview.class, "_resetvisibles" /*RemoteObject*/ );
 BA.debugLineNum = 68;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(8);
__ref.runClassMethod (b4i_customlistview.class, "_updatevisiblerange" /*RemoteObject*/ );
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeat(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("RemoveAt (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,167);
if (RapidSub.canDelegate("removeat")) { return __ref.runUserSub(false, "customlistview","removeat", __ref, _index);}
RemoteObject _removeitem = RemoteObject.declareNull("_clvitem");
RemoteObject _p = RemoteObject.declareNull("B4XViewWrapper");
int _i = 0;
RemoteObject _item = RemoteObject.declareNull("_clvitem");
RemoteObject _newoffset = RemoteObject.createImmutable(0);
Debug.locals.put("Index", _index);
 BA.debugLineNum = 167;BA.debugLine="Public Sub RemoveAt(Index As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 168;BA.debugLine="If getSize <= 1 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("k",__ref.runClassMethod (b4i_customlistview.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 169;BA.debugLine="Clear";
Debug.ShouldStop(256);
__ref.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 170;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 172;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
Debug.ShouldStop(2048);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 173;BA.debugLine="Dim p As B4XView";
Debug.ShouldStop(4096);
_p = RemoteObject.createNew ("B4XViewWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 174;BA.debugLine="For i = Index + 1 To items.Size - 1";
Debug.ShouldStop(8192);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = RemoteObject.solve(new RemoteObject[] {_index,RemoteObject.createImmutable(1)}, "+",1, 1).<Number>get().intValue() ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 175;BA.debugLine="Dim item As CLVItem = items.Get(i)";
Debug.ShouldStop(16384);
_item = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("item", _item);Debug.locals.put("item", _item);
 BA.debugLineNum = 176;BA.debugLine="p = item.Panel";
Debug.ShouldStop(32768);
_p = _item.getField(false,"Panel" /*RemoteObject*/ );Debug.locals.put("p", _p);
 BA.debugLineNum = 177;BA.debugLine="p.Tag = i - 1";
Debug.ShouldStop(65536);
_p.runMethod(false,"setTag:",(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 178;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
Debug.ShouldStop(131072);
_newoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_item.getField(true,"Offset" /*RemoteObject*/ ),_removeitem.getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "--",2, 0));Debug.locals.put("NewOffset", _newoffset);Debug.locals.put("NewOffset", _newoffset);
 BA.debugLineNum = 179;BA.debugLine="SetItemOffset(item, NewOffset)";
Debug.ShouldStop(262144);
__ref.runClassMethod (b4i_customlistview.class, "_setitemoffset::" /*RemoteObject*/ ,(Object)(_item),(Object)(BA.numberCast(float.class, _newoffset)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 181;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_customlistview.class, "_setscrollviewcontentsize:" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),_removeitem.getField(true,"Size" /*RemoteObject*/ ),__ref.getField(true,"_mdividersize" /*RemoteObject*/ )}, "--",2, 0))));
 BA.debugLineNum = 182;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(2097152);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt:",(Object)(_index));
 BA.debugLineNum = 183;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(4194304);
_removeitem.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replaceat(RemoteObject __ref,RemoteObject _index,RemoteObject _pnl,RemoteObject _itemheight,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ReplaceAt (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,369);
if (RapidSub.canDelegate("replaceat")) { return __ref.runUserSub(false, "customlistview","replaceat", __ref, _index, _pnl, _itemheight, _value);}
RemoteObject _removeitem = RemoteObject.declareNull("_clvitem");
Debug.locals.put("Index", _index);
Debug.locals.put("pnl", _pnl);
Debug.locals.put("ItemHeight", _itemheight);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 369;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
Debug.ShouldStop(65536);
 BA.debugLineNum = 370;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
Debug.ShouldStop(131072);
_removeitem = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)));Debug.locals.put("RemoveItem", _removeitem);Debug.locals.put("RemoveItem", _removeitem);
 BA.debugLineNum = 371;BA.debugLine="items.RemoveAt(Index)";
Debug.ShouldStop(262144);
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("RemoveAt:",(Object)(_index));
 BA.debugLineNum = 372;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
Debug.ShouldStop(524288);
_removeitem.getField(false,"Panel" /*RemoteObject*/ ).runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 373;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_customlistview.class, "_insertatimpl:::::" /*RemoteObject*/ ,(Object)(_index),(Object)(_pnl),(Object)(_itemheight),(Object)(_value),(Object)(_removeitem.getField(true,"Size" /*RemoteObject*/ )));
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resetvisibles(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetVisibles (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,60);
if (RapidSub.canDelegate("resetvisibles")) { return __ref.runUserSub(false, "customlistview","resetvisibles", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Private Sub ResetVisibles";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 61;BA.debugLine="mFirstVisibleIndex = -1";
Debug.ShouldStop(268435456);
__ref.setField ("_mfirstvisibleindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 62;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
Debug.ShouldStop(536870912);
__ref.setField ("_mlastvisibleindex" /*RemoteObject*/ ,BA.numberCast(int.class, 0x7fffffff));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizeitem(RemoteObject __ref,RemoteObject _index,RemoteObject _itemheight) throws Exception{
try {
		Debug.PushSubsStack("ResizeItem (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,358);
if (RapidSub.canDelegate("resizeitem")) { return __ref.runUserSub(false, "customlistview","resizeitem", __ref, _index, _itemheight);}
RemoteObject _p = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _value = RemoteObject.declareNull("NSObject");
RemoteObject _parent = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("Index", _index);
Debug.locals.put("ItemHeight", _itemheight);
 BA.debugLineNum = 358;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
Debug.ShouldStop(32);
 BA.debugLineNum = 359;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("B4XViewWrapper");
_p = __ref.runClassMethod (b4i_customlistview.class, "_getpanel:" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 360;BA.debugLine="Dim value As Object = GetValue(Index)";
Debug.ShouldStop(128);
_value = __ref.runClassMethod (b4i_customlistview.class, "_getvalue:" /*RemoteObject*/ ,(Object)(_index));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 361;BA.debugLine="Dim parent As B4XView = p.Parent";
Debug.ShouldStop(256);
_parent = RemoteObject.createNew ("B4XViewWrapper");
_parent = _p.runMethod(false,"Parent");Debug.locals.put("parent", _parent);Debug.locals.put("parent", _parent);
 BA.debugLineNum = 362;BA.debugLine="p.Color = parent.Color";
Debug.ShouldStop(512);
_p.runMethod(true,"setColor:",_parent.runMethod(true,"Color"));
 BA.debugLineNum = 363;BA.debugLine="p.RemoveViewFromParent";
Debug.ShouldStop(1024);
_p.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 364;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
Debug.ShouldStop(2048);
__ref.runClassMethod (b4i_customlistview.class, "_replaceat::::" /*RemoteObject*/ ,(Object)(_index),(Object)(_p),(Object)(_itemheight),(Object)(_value));
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrollhandler(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ScrollHandler (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,500);
if (RapidSub.canDelegate("scrollhandler")) { return __ref.runUserSub(false, "customlistview","scrollhandler", __ref);}
RemoteObject _position = RemoteObject.createImmutable(0);
 BA.debugLineNum = 500;BA.debugLine="Private Sub ScrollHandler";
Debug.ShouldStop(524288);
 BA.debugLineNum = 501;BA.debugLine="If items.Size = 0 Then Return";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 502;BA.debugLine="Dim position As Int = GetScrollViewOffset";
Debug.ShouldStop(2097152);
_position = BA.numberCast(int.class, __ref.runClassMethod (b4i_customlistview.class, "_getscrollviewoffset" /*RemoteObject*/ ));Debug.locals.put("position", _position);Debug.locals.put("position", _position);
 BA.debugLineNum = 503;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_position,__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewvisiblesize" /*RemoteObject*/ )}, "+",1, 0),RemoteObject.solve(new RemoteObject[] {__ref.runClassMethod (b4i_customlistview.class, "_getscrollviewcontentsize" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 5)))}, "-",1, 0)) && RemoteObject.solveBoolean(">",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastreachendevent" /*RemoteObject*/ ),RemoteObject.createImmutable(100)}, "+",1, 2)))) { 
 BA.debugLineNum = 504;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
Debug.ShouldStop(8388608);
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"SubExists:::",(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))),(Object)(BA.numberCast(int.class, 0))).getBoolean()) { 
 BA.debugLineNum = 505;BA.debugLine="LastReachEndEvent = DateTime.Now";
Debug.ShouldStop(16777216);
__ref.setField ("_lastreachendevent" /*RemoteObject*/ ,b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"));
 BA.debugLineNum = 506;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
Debug.ShouldStop(33554432);
b4i_main.__c.runVoidMethod ("CallSubDelayed:::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ReachEnd"))));
 }else {
 BA.debugLineNum = 508;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
Debug.ShouldStop(134217728);
__ref.setField ("_lastreachendevent" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Now"),RemoteObject.createImmutable(1000),b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"TicksPerDay")}, "+*",1, 2));
 };
 };
 BA.debugLineNum = 511;BA.debugLine="UpdateVisibleRange";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4i_customlistview.class, "_updatevisiblerange" /*RemoteObject*/ );
 BA.debugLineNum = 512;BA.debugLine="If FireScrollChanged Then";
Debug.ShouldStop(-2147483648);
if (__ref.getField(true,"_firescrollchanged" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 513;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
Debug.ShouldStop(1);
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_ScrollChanged"))),(Object)((_position)));
 };
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _scrolltoitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("ScrollToItem (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,393);
if (RapidSub.canDelegate("scrolltoitem")) { return __ref.runUserSub(false, "customlistview","scrolltoitem", __ref, _index);}
RemoteObject _offset = RemoteObject.createImmutable(0.0f);
RemoteObject _nsv = RemoteObject.declareNull("B4IScrollView");
Debug.locals.put("Index", _index);
 BA.debugLineNum = 393;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
Debug.ShouldStop(512);
_offset = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4i_customlistview.class, "_getmaxscrolloffset" /*RemoteObject*/ ))),(Object)(BA.numberCast(double.class, __ref.runClassMethod (b4i_customlistview.class, "_finditemoffset:" /*RemoteObject*/ ,(Object)(_index))))));Debug.locals.put("offset", _offset);Debug.locals.put("offset", _offset);
 BA.debugLineNum = 396;BA.debugLine="Dim nsv As ScrollView = sv";
Debug.ShouldStop(2048);
_nsv = RemoteObject.createNew ("B4IScrollView");
_nsv.setObject((__ref.getField(false,"_sv" /*RemoteObject*/ )).getObject());Debug.locals.put("nsv", _nsv);
 BA.debugLineNum = 397;BA.debugLine="If horizontal Then";
Debug.ShouldStop(4096);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 398;BA.debugLine="nsv.ScrollTo(offset, 0, True)";
Debug.ShouldStop(8192);
_nsv.runVoidMethod ("ScrollTo:::",(Object)(BA.numberCast(int.class, _offset)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 }else {
 BA.debugLineNum = 400;BA.debugLine="nsv.ScrollTo(0, offset, True)";
Debug.ShouldStop(32768);
_nsv.runVoidMethod ("ScrollTo:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, _offset)),(Object)(b4i_main.__c.runMethod(true,"True")));
 };
 BA.debugLineNum = 414;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitemoffset(RemoteObject __ref,RemoteObject _item,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetItemOffset (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,348);
if (RapidSub.canDelegate("setitemoffset")) { return __ref.runUserSub(false, "customlistview","setitemoffset", __ref, _item, _offset);}
Debug.locals.put("item", _item);
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 348;BA.debugLine="Private Sub SetItemOffset (item As CLVItem, offset";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 349;BA.debugLine="item.Offset = offset";
Debug.ShouldStop(268435456);
_item.setField ("Offset" /*RemoteObject*/ ,BA.numberCast(int.class, _offset));
 BA.debugLineNum = 350;BA.debugLine="If horizontal Then";
Debug.ShouldStop(536870912);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 351;BA.debugLine="item.Panel.Left = offset";
Debug.ShouldStop(1073741824);
_item.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setLeft:",_offset);
 }else {
 BA.debugLineNum = 353;BA.debugLine="item.Panel.Top = offset";
Debug.ShouldStop(1);
_item.getField(false,"Panel" /*RemoteObject*/ ).runMethod(true,"setTop:",_offset);
 };
 BA.debugLineNum = 355;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollviewcontentsize(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewContentSize (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,340);
if (RapidSub.canDelegate("setscrollviewcontentsize")) { return __ref.runUserSub(false, "customlistview","setscrollviewcontentsize", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 340;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 341;BA.debugLine="If horizontal Then";
Debug.ShouldStop(1048576);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 342;BA.debugLine="sv.ScrollViewContentWidth = f";
Debug.ShouldStop(2097152);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentWidth:",BA.numberCast(int.class, _f));
 }else {
 BA.debugLineNum = 344;BA.debugLine="sv.ScrollViewContentHeight = f";
Debug.ShouldStop(8388608);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewContentHeight:",BA.numberCast(int.class, _f));
 };
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollviewoffset(RemoteObject __ref,RemoteObject _offset) throws Exception{
try {
		Debug.PushSubsStack("SetScrollViewOffset (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,324);
if (RapidSub.canDelegate("setscrollviewoffset")) { return __ref.runUserSub(false, "customlistview","setscrollviewoffset", __ref, _offset);}
Debug.locals.put("offset", _offset);
 BA.debugLineNum = 324;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
Debug.ShouldStop(8);
 BA.debugLineNum = 325;BA.debugLine="If horizontal Then";
Debug.ShouldStop(16);
if (__ref.getField(true,"_horizontal" /*RemoteObject*/ ).getBoolean()) { 
 BA.debugLineNum = 326;BA.debugLine="sv.ScrollViewOffsetX = offset";
Debug.ShouldStop(32);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetX:",BA.numberCast(int.class, _offset));
 }else {
 BA.debugLineNum = 328;BA.debugLine="sv.ScrollViewOffsetY = offset";
Debug.ShouldStop(128);
__ref.getField(false,"_sv" /*RemoteObject*/ ).runMethod(true,"setScrollViewOffsetY:",BA.numberCast(int.class, _offset));
 };
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sv_scrollchanged(RemoteObject __ref,RemoteObject _offsetx,RemoteObject _offsety) throws Exception{
try {
		Debug.PushSubsStack("sv_ScrollChanged (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,577);
if (RapidSub.canDelegate("sv_scrollchanged")) { return __ref.runUserSub(false, "customlistview","sv_scrollchanged", __ref, _offsetx, _offsety);}
Debug.locals.put("OffsetX", _offsetx);
Debug.locals.put("OffsetY", _offsety);
 BA.debugLineNum = 577;BA.debugLine="Sub sv_ScrollChanged (OffsetX As Int, OffsetY As I";
Debug.ShouldStop(1);
 BA.debugLineNum = 578;BA.debugLine="ScrollHandler";
Debug.ShouldStop(2);
__ref.runClassMethod (b4i_customlistview.class, "_scrollhandler" /*RemoteObject*/ );
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatevisiblerange(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UpdateVisibleRange (customlistview) ","customlistview",7,__ref.getField(false, "bi"),__ref,297);
if (RapidSub.canDelegate("updatevisiblerange")) { return __ref.runUserSub(false, "customlistview","updatevisiblerange", __ref);}
RemoteObject _first = RemoteObject.createImmutable(0);
RemoteObject _last = RemoteObject.createImmutable(0);
 BA.debugLineNum = 297;BA.debugLine="Private Sub UpdateVisibleRange";
Debug.ShouldStop(256);
 BA.debugLineNum = 298;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_monitorvisiblerange" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False")) || RemoteObject.solveBoolean("=",__ref.runClassMethod (b4i_customlistview.class, "_getsize" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 299;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
Debug.ShouldStop(1024);
_first = __ref.runClassMethod (b4i_customlistview.class, "_getfirstvisibleindex" /*RemoteObject*/ );Debug.locals.put("first", _first);Debug.locals.put("first", _first);
 BA.debugLineNum = 300;BA.debugLine="Dim last As Int = getLastVisibleIndex";
Debug.ShouldStop(2048);
_last = __ref.runClassMethod (b4i_customlistview.class, "_getlastvisibleindex" /*RemoteObject*/ );Debug.locals.put("last", _last);Debug.locals.put("last", _last);
 BA.debugLineNum = 301;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("!",_first,BA.numberCast(double.class, __ref.getField(true,"_mfirstvisibleindex" /*RemoteObject*/ ))) || RemoteObject.solveBoolean("!",_last,BA.numberCast(double.class, __ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 302;BA.debugLine="mFirstVisibleIndex = first";
Debug.ShouldStop(8192);
__ref.setField ("_mfirstvisibleindex" /*RemoteObject*/ ,_first);
 BA.debugLineNum = 303;BA.debugLine="mLastVisibleIndex = last";
Debug.ShouldStop(16384);
__ref.setField ("_mlastvisibleindex" /*RemoteObject*/ ,_last);
 BA.debugLineNum = 304;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
Debug.ShouldStop(32768);
b4i_main.__c.runVoidMethod ("CallSubDelayed3:::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_callback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_VisibleRangeChanged"))),(Object)((__ref.getField(true,"_mfirstvisibleindex" /*RemoteObject*/ ))),(Object)((__ref.getField(true,"_mlastvisibleindex" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}