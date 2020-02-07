package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xdrawer_subs_0 {


public static RemoteObject  _cancelgesture(RemoteObject __ref,RemoteObject _rec) throws Exception{
try {
		Debug.PushSubsStack("CancelGesture (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,157);
if (RapidSub.canDelegate("cancelgesture")) { return __ref.runUserSub(false, "b4xdrawer","cancelgesture", __ref, _rec);}
Debug.locals.put("rec", _rec);
 BA.debugLineNum = 157;BA.debugLine="Private Sub CancelGesture (rec As NativeObject)";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 158;BA.debugLine="rec.SetField(\"enabled\", False)";
Debug.ShouldStop(536870912);
_rec.runVoidMethod ("SetField::",(Object)(BA.ObjectToString("enabled")),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 159;BA.debugLine="rec.SetField(\"enabled\", True)";
Debug.ShouldStop(1073741824);
_rec.runVoidMethod ("SetField::",(Object)(BA.ObjectToString("enabled")),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _changeoffset(RemoteObject __ref,RemoteObject _x,RemoteObject _currentlytouching,RemoteObject _noanimation) throws Exception{
try {
		Debug.PushSubsStack("ChangeOffset (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,170);
if (RapidSub.canDelegate("changeoffset")) { return __ref.runUserSub(false, "b4xdrawer","changeoffset", __ref, _x, _currentlytouching, _noanimation);}
RemoteObject _visibleoffset = RemoteObject.createImmutable(0);
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _dx = RemoteObject.createImmutable(0);
RemoteObject _duration = RemoteObject.createImmutable(0);
Debug.locals.put("x", _x);
Debug.locals.put("CurrentlyTouching", _currentlytouching);
Debug.locals.put("NoAnimation", _noanimation);
 BA.debugLineNum = 170;BA.debugLine="Private Sub ChangeOffset (x As Float, CurrentlyTou";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="x = Max(-mSideWidth, Min(0, x))";
Debug.ShouldStop(1024);
_x = BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue()))),(Object)(b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _x))))));Debug.locals.put("x", _x);
 BA.debugLineNum = 172;BA.debugLine="Dim VisibleOffset As Int = mSideWidth + x";
Debug.ShouldStop(2048);
_visibleoffset = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_msidewidth" /*RemoteObject*/ ),_x}, "+",1, 0));Debug.locals.put("VisibleOffset", _visibleoffset);Debug.locals.put("VisibleOffset", _visibleoffset);
 BA.debugLineNum = 174;BA.debugLine="Dim p As Panel = getLeftPanel";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("B4IPanelWrapper");
_p.setObject((__ref.runClassMethod (b4i_b4xdrawer.class, "_getleftpanel" /*RemoteObject*/ )).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 175;BA.debugLine="If mLeftPanel.Left = -mSideWidth And x > -mSideWi";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left"),BA.numberCast(double.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue()))) && RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue())))) { 
 BA.debugLineNum = 176;BA.debugLine="p.SetShadow(xui.Color_Black, 2, 0, 0.5, True)";
Debug.ShouldStop(32768);
_p.runVoidMethod ("SetShadow:::::",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Black")),(Object)(BA.numberCast(float.class, 2)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"True")));
 }else 
{ BA.debugLineNum = 177;BA.debugLine="Else If x = -mSideWidth Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_x,BA.numberCast(double.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue())))) { 
 BA.debugLineNum = 178;BA.debugLine="p.SetShadow(0, 0, 0, 0, True)";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetShadow:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 }}
;
 BA.debugLineNum = 181;BA.debugLine="If CurrentlyTouching = False Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_currentlytouching,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 182;BA.debugLine="If (IsOpen And VisibleOffset < 0.8 * mSideWidth)";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean(".",__ref.getField(true,"_isopen" /*RemoteObject*/ )) && RemoteObject.solveBoolean("<",_visibleoffset,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.8),__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "*",0, 0))))) || RemoteObject.solveBoolean(".",BA.ObjectToBoolean((RemoteObject.solveBoolean("=",__ref.getField(true,"_isopen" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False")) && RemoteObject.solveBoolean("<",_visibleoffset,RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(0.2),__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "*",0, 0)))))) { 
 BA.debugLineNum = 183;BA.debugLine="x = -mSideWidth";
Debug.ShouldStop(4194304);
_x = BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue()));Debug.locals.put("x", _x);
 BA.debugLineNum = 184;BA.debugLine="IsOpen = False";
Debug.ShouldStop(8388608);
__ref.setField ("_isopen" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"));
 }else {
 BA.debugLineNum = 186;BA.debugLine="x = 0";
Debug.ShouldStop(33554432);
_x = BA.numberCast(float.class, 0);Debug.locals.put("x", _x);
 BA.debugLineNum = 187;BA.debugLine="IsOpen = True";
Debug.ShouldStop(67108864);
__ref.setField ("_isopen" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 };
 BA.debugLineNum = 189;BA.debugLine="Dim dx As Int = Abs(mLeftPanel.Left - x)";
Debug.ShouldStop(268435456);
_dx = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Abs:",(Object)(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left"),_x}, "-",1, 0))));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 190;BA.debugLine="Dim duration As Int = Max(0, 200 * dx / mSideWid";
Debug.ShouldStop(536870912);
_duration = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(200),_dx,__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "*/",0, 0))));Debug.locals.put("duration", _duration);Debug.locals.put("duration", _duration);
 BA.debugLineNum = 191;BA.debugLine="If NoAnimation Then duration = 0";
Debug.ShouldStop(1073741824);
if (_noanimation.getBoolean()) { 
_duration = BA.numberCast(int.class, 0);Debug.locals.put("duration", _duration);};
 BA.debugLineNum = 192;BA.debugLine="mLeftPanel.SetLayoutAnimated(duration, x, 0, mLe";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(_duration),(Object)(_x),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 193;BA.debugLine="mDarkPanel.SetColorAnimated(duration, mDarkPanel";
Debug.ShouldStop(1);
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetColorAnimated:::",(Object)(_duration),(Object)(__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"Color")),(Object)(__ref.runClassMethod (b4i_b4xdrawer.class, "_offsettocolor:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x)))));
 BA.debugLineNum = 195;BA.debugLine="Dim p As Panel = mDarkPanel";
Debug.ShouldStop(4);
_p = RemoteObject.createNew ("B4IPanelWrapper");
_p.setObject((__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ )).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 196;BA.debugLine="p.UserInteractionEnabled = IsOpen";
Debug.ShouldStop(8);
_p.runMethod(true,"setUserInteractionEnabled:",__ref.getField(true,"_isopen" /*RemoteObject*/ ));
 BA.debugLineNum = 197;BA.debugLine="p = getLeftPanel";
Debug.ShouldStop(16);
_p.setObject((__ref.runClassMethod (b4i_b4xdrawer.class, "_getleftpanel" /*RemoteObject*/ )).getObject());
 }else {
 BA.debugLineNum = 201;BA.debugLine="mDarkPanel.Color = OffsetToColor(x)";
Debug.ShouldStop(256);
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"setColor:",__ref.runClassMethod (b4i_b4xdrawer.class, "_offsettocolor:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _x))));
 BA.debugLineNum = 202;BA.debugLine="mLeftPanel.Left = x";
Debug.ShouldStop(512);
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"setLeft:",_x);
 };
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
b4i_b4xdrawer._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_b4xdrawer._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_b4xdrawer._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_b4xdrawer._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Private xui As XUI 'ignore";
b4i_b4xdrawer._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xdrawer._xui);
 //BA.debugLineNum = 6;BA.debugLine="Private mSideWidth As Int";
b4i_b4xdrawer._msidewidth = RemoteObject.createImmutable(0);__ref.setField("_msidewidth",b4i_b4xdrawer._msidewidth);
 //BA.debugLineNum = 7;BA.debugLine="Private mLeftPanel As B4XView";
b4i_b4xdrawer._mleftpanel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mleftpanel",b4i_b4xdrawer._mleftpanel);
 //BA.debugLineNum = 8;BA.debugLine="Private mDarkPanel As B4XView";
b4i_b4xdrawer._mdarkpanel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mdarkpanel",b4i_b4xdrawer._mdarkpanel);
 //BA.debugLineNum = 9;BA.debugLine="Private mBasePanel As B4XView";
b4i_b4xdrawer._mbasepanel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbasepanel",b4i_b4xdrawer._mbasepanel);
 //BA.debugLineNum = 10;BA.debugLine="Private mCenterPanel As B4XView";
b4i_b4xdrawer._mcenterpanel = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mcenterpanel",b4i_b4xdrawer._mcenterpanel);
 //BA.debugLineNum = 11;BA.debugLine="Private ExtraWidth As Int = 50dip";
b4i_b4xdrawer._extrawidth = b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50)));__ref.setField("_extrawidth",b4i_b4xdrawer._extrawidth);
 //BA.debugLineNum = 12;BA.debugLine="Private TouchXStart, TouchYStart As Float 'ignore";
b4i_b4xdrawer._touchxstart = RemoteObject.createImmutable(0.0f);__ref.setField("_touchxstart",b4i_b4xdrawer._touchxstart);
b4i_b4xdrawer._touchystart = RemoteObject.createImmutable(0.0f);__ref.setField("_touchystart",b4i_b4xdrawer._touchystart);
 //BA.debugLineNum = 13;BA.debugLine="Private IsOpen As Boolean";
b4i_b4xdrawer._isopen = RemoteObject.createImmutable(false);__ref.setField("_isopen",b4i_b4xdrawer._isopen);
 //BA.debugLineNum = 14;BA.debugLine="Private HandlingSwipe As Boolean";
b4i_b4xdrawer._handlingswipe = RemoteObject.createImmutable(false);__ref.setField("_handlingswipe",b4i_b4xdrawer._handlingswipe);
 //BA.debugLineNum = 15;BA.debugLine="Private StartAtScrim As Boolean 'ignore";
b4i_b4xdrawer._startatscrim = RemoteObject.createImmutable(false);__ref.setField("_startatscrim",b4i_b4xdrawer._startatscrim);
 //BA.debugLineNum = 16;BA.debugLine="Private mEnabled As Boolean = True";
b4i_b4xdrawer._menabled = b4i_main.__c.runMethod(true,"True");__ref.setField("_menabled",b4i_b4xdrawer._menabled);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _dark_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("Dark_Touch (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,162);
if (RapidSub.canDelegate("dark_touch")) { return __ref.runUserSub(false, "b4xdrawer","dark_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 162;BA.debugLine="Private Sub Dark_Touch(Action As Int, X As Float,";
Debug.ShouldStop(2);
 BA.debugLineNum = 163;BA.debugLine="If HandlingSwipe = False And Action = mDarkPanel.";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_handlingswipe" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False")) && RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, __ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runMethod(true,"TOUCH_ACTION_UP")))) { 
 BA.debugLineNum = 164;BA.debugLine="setLeftOpen(False)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4i_b4xdrawer.class, "_setleftopen:" /*RemoteObject*/ ,(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcenterpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getCenterPanel (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,227);
if (RapidSub.canDelegate("getcenterpanel")) { return __ref.runUserSub(false, "b4xdrawer","getcenterpanel", __ref);}
 BA.debugLineNum = 227;BA.debugLine="Public Sub getCenterPanel As B4XView";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Return mCenterPanel";
Debug.ShouldStop(8);
if (true) return __ref.getField(false,"_mcenterpanel" /*RemoteObject*/ );
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getgestureenabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getGestureEnabled (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,239);
if (RapidSub.canDelegate("getgestureenabled")) { return __ref.runUserSub(false, "b4xdrawer","getgestureenabled", __ref);}
 BA.debugLineNum = 239;BA.debugLine="Public Sub getGestureEnabled As Boolean";
Debug.ShouldStop(16384);
 BA.debugLineNum = 240;BA.debugLine="Return mEnabled";
Debug.ShouldStop(32768);
if (true) return __ref.getField(true,"_menabled" /*RemoteObject*/ );
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleftopen(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeftOpen (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,212);
if (RapidSub.canDelegate("getleftopen")) { return __ref.runUserSub(false, "b4xdrawer","getleftopen", __ref);}
 BA.debugLineNum = 212;BA.debugLine="Public Sub getLeftOpen As Boolean";
Debug.ShouldStop(524288);
 BA.debugLineNum = 213;BA.debugLine="Return IsOpen";
Debug.ShouldStop(1048576);
if (true) return __ref.getField(true,"_isopen" /*RemoteObject*/ );
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getleftpanel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getLeftPanel (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,223);
if (RapidSub.canDelegate("getleftpanel")) { return __ref.runUserSub(false, "b4xdrawer","getleftpanel", __ref);}
 BA.debugLineNum = 223;BA.debugLine="Public Sub getLeftPanel As B4XView";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 224;BA.debugLine="Return mLeftPanel";
Debug.ShouldStop(-2147483648);
if (true) return __ref.getField(false,"_mleftpanel" /*RemoteObject*/ );
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname,RemoteObject _parent,RemoteObject _sidewidth) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,19);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xdrawer","initialize", __ref, _ba, _callback, _eventname, _parent, _sidewidth);}
__ref.runVoidMethodAndSync("initializeClassModule");
RemoteObject _nme = RemoteObject.declareNull("B4INativeObject");
RemoteObject _no = RemoteObject.declareNull("B4INativeObject");
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Parent", _parent);
Debug.locals.put("SideWidth", _sidewidth);
 BA.debugLineNum = 19;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(524288);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 21;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(1048576);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 22;BA.debugLine="mSideWidth = SideWidth";
Debug.ShouldStop(2097152);
__ref.setField ("_msidewidth" /*RemoteObject*/ ,_sidewidth);
 BA.debugLineNum = 27;BA.debugLine="mBasePanel = xui.CreatePanel(\"\")";
Debug.ShouldStop(67108864);
__ref.setField ("_mbasepanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 28;BA.debugLine="Dim nme As NativeObject = Me";
Debug.ShouldStop(134217728);
_nme = RemoteObject.createNew ("B4INativeObject");
_nme.setObject(__ref);Debug.locals.put("nme", _nme);
 BA.debugLineNum = 29;BA.debugLine="Dim no As NativeObject = mBasePanel";
Debug.ShouldStop(268435456);
_no = RemoteObject.createNew ("B4INativeObject");
_no.setObject((__ref.getField(false,"_mbasepanel" /*RemoteObject*/ )).getObject());Debug.locals.put("no", _no);
 BA.debugLineNum = 30;BA.debugLine="no.RunMethod(\"addGestureRecognizer:\", Array(nme.R";
Debug.ShouldStop(536870912);
_no.runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("addGestureRecognizer:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_nme.runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("CreateRecognizer")),(Object)((b4i_main.__c.runMethod(false,"Null"))))).getObject())})));
 BA.debugLineNum = 32;BA.debugLine="Parent.AddView(mBasePanel, 0, 0, Parent.Width, Pa";
Debug.ShouldStop(-2147483648);
_parent.runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mbasepanel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_parent.runMethod(true,"Width")),(Object)(_parent.runMethod(true,"Height")));
 BA.debugLineNum = 33;BA.debugLine="mCenterPanel = xui.CreatePanel(\"\")";
Debug.ShouldStop(1);
__ref.setField ("_mcenterpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable(""))));
 BA.debugLineNum = 34;BA.debugLine="mBasePanel.AddView(mCenterPanel, 0, 0, mBasePanel";
Debug.ShouldStop(2);
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mcenterpanel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 35;BA.debugLine="mDarkPanel = xui.CreatePanel(\"dark\")";
Debug.ShouldStop(4);
__ref.setField ("_mdarkpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("dark"))));
 BA.debugLineNum = 36;BA.debugLine="mBasePanel.AddView(mDarkPanel, 0, 0, mBasePanel.W";
Debug.ShouldStop(8);
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 37;BA.debugLine="mLeftPanel = xui.CreatePanel(\"LeftPanel\")";
Debug.ShouldStop(16);
__ref.setField ("_mleftpanel" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("LeftPanel"))));
 BA.debugLineNum = 38;BA.debugLine="mBasePanel.AddView(mLeftPanel, -SideWidth, 0, Sid";
Debug.ShouldStop(32);
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mleftpanel" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, -(double) (0 + _sidewidth.<Number>get().intValue()))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _sidewidth)),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 39;BA.debugLine="mLeftPanel.Color = xui.Color_Red";
Debug.ShouldStop(64);
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"setColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Red"));
 BA.debugLineNum = 44;BA.debugLine="Dim p As Panel = mDarkPanel";
Debug.ShouldStop(2048);
_p = RemoteObject.createNew ("B4IPanelWrapper");
_p.setObject((__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ )).getObject());Debug.locals.put("p", _p);
 BA.debugLineNum = 45;BA.debugLine="p.UserInteractionEnabled = False";
Debug.ShouldStop(4096);
_p.runMethod(true,"setUserInteractionEnabled:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 46;BA.debugLine="p.SetBorder(0, 0, 0)";
Debug.ShouldStop(8192);
_p.runVoidMethod ("SetBorder:::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 47;BA.debugLine="p = mLeftPanel";
Debug.ShouldStop(16384);
_p.setObject((__ref.getField(false,"_mleftpanel" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 49;BA.debugLine="p = mCenterPanel";
Debug.ShouldStop(65536);
_p.setObject((__ref.getField(false,"_mcenterpanel" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 50;BA.debugLine="p.SetBorder(0, 0, 0)";
Debug.ShouldStop(131072);
_p.runVoidMethod ("SetBorder:::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 51;BA.debugLine="p = mBasePanel";
Debug.ShouldStop(262144);
_p.setObject((__ref.getField(false,"_mbasepanel" /*RemoteObject*/ )).getObject());
 BA.debugLineNum = 52;BA.debugLine="p.SetBorder(0, 0, 0)";
Debug.ShouldStop(524288);
_p.runVoidMethod ("SetBorder:::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _leftpanel_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("LeftPanel_Click (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,56);
if (RapidSub.canDelegate("leftpanel_click")) { return __ref.runUserSub(false, "b4xdrawer","leftpanel_click", __ref);}
 BA.debugLineNum = 56;BA.debugLine="Private Sub LeftPanel_Click";
Debug.ShouldStop(8388608);
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
public static RemoteObject  _offsettocolor(RemoteObject __ref,RemoteObject _x) throws Exception{
try {
		Debug.PushSubsStack("OffsetToColor (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,207);
if (RapidSub.canDelegate("offsettocolor")) { return __ref.runUserSub(false, "b4xdrawer","offsettocolor", __ref, _x);}
RemoteObject _visible = RemoteObject.createImmutable(0.0f);
Debug.locals.put("x", _x);
 BA.debugLineNum = 207;BA.debugLine="Private Sub OffsetToColor (x As Int) As Int";
Debug.ShouldStop(16384);
 BA.debugLineNum = 208;BA.debugLine="Dim Visible As Float = (mSideWidth + x) / mSideWi";
Debug.ShouldStop(32768);
_visible = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_msidewidth" /*RemoteObject*/ ),_x}, "+",1, 1)),__ref.getField(true,"_msidewidth" /*RemoteObject*/ )}, "/",0, 0));Debug.locals.put("Visible", _visible);Debug.locals.put("Visible", _visible);
 BA.debugLineNum = 209;BA.debugLine="Return xui.Color_ARGB(100 * Visible, 0, 0, 0)";
Debug.ShouldStop(65536);
if (true) return __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_ARGB::::",(Object)(BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(100),_visible}, "*",0, 0))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pan_event(RemoteObject __ref,RemoteObject _pan) throws Exception{
try {
		Debug.PushSubsStack("Pan_Event (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,118);
if (RapidSub.canDelegate("pan_event")) { return __ref.runUserSub(false, "b4xdrawer","pan_event", __ref, _pan);}
RemoteObject _rec = RemoteObject.declareNull("B4INativeObject");
RemoteObject _points = null;
RemoteObject _x = RemoteObject.createImmutable(0.0f);
RemoteObject _state = RemoteObject.createImmutable(0);
RemoteObject _leftpanelrightside = RemoteObject.createImmutable(0);
RemoteObject _dx = RemoteObject.createImmutable(0.0f);
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 118;BA.debugLine="Private Sub Pan_Event (pan As Object)";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="Dim rec As NativeObject = pan";
Debug.ShouldStop(4194304);
_rec = RemoteObject.createNew ("B4INativeObject");
_rec.setObject(_pan);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 120;BA.debugLine="Dim points() As Float = rec.ArrayFromPoint(rec.Ru";
Debug.ShouldStop(8388608);
_points = _rec.runMethod(false,"ArrayFromPoint:",(Object)(((_rec.runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("locationInView:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((__ref.getField(false,"_mbasepanel" /*RemoteObject*/ )).getObject())})))).getObject())));Debug.locals.put("points", _points);Debug.locals.put("points", _points);
 BA.debugLineNum = 121;BA.debugLine="Dim x As Float = points(0)";
Debug.ShouldStop(16777216);
_x = _points.runMethod(true,"getObjectFastN:", BA.numberCast(int.class, 0));Debug.locals.put("x", _x);Debug.locals.put("x", _x);
 BA.debugLineNum = 122;BA.debugLine="Dim state As Int = rec.GetField(\"state\").AsNumber";
Debug.ShouldStop(33554432);
_state = BA.numberCast(int.class, _rec.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("state"))).runMethod(false,"AsNumber"));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 123;BA.debugLine="Dim LeftPanelRightSide As Int = mLeftPanel.Left +";
Debug.ShouldStop(67108864);
_leftpanelrightside = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left"),__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Width")}, "+",1, 0));Debug.locals.put("LeftPanelRightSide", _leftpanelrightside);Debug.locals.put("LeftPanelRightSide", _leftpanelrightside);
 BA.debugLineNum = 124;BA.debugLine="Select state";
Debug.ShouldStop(134217728);
switch (BA.switchObjectToInt(_state,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 126;BA.debugLine="If mEnabled = False Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_menabled" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 127;BA.debugLine="CancelGesture(rec)";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (b4i_b4xdrawer.class, "_cancelgesture:" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 128;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 130;BA.debugLine="If x > LeftPanelRightSide Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, _leftpanelrightside))) { 
 BA.debugLineNum = 131;BA.debugLine="If IsOpen = False And x > LeftPanelRightSide +";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isopen" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False")) && RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_leftpanelrightside,__ref.getField(true,"_extrawidth" /*RemoteObject*/ )}, "+",1, 1)))) { 
 BA.debugLineNum = 132;BA.debugLine="CancelGesture(rec)";
Debug.ShouldStop(8);
__ref.runClassMethod (b4i_b4xdrawer.class, "_cancelgesture:" /*RemoteObject*/ ,(Object)(_rec));
 BA.debugLineNum = 133;BA.debugLine="HandlingSwipe = False";
Debug.ShouldStop(16);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 134;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 };
 BA.debugLineNum = 137;BA.debugLine="StartAtScrim = x > LeftPanelRightSide";
Debug.ShouldStop(256);
__ref.setField ("_startatscrim" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, _leftpanelrightside))));
 BA.debugLineNum = 138;BA.debugLine="HandlingSwipe = True";
Debug.ShouldStop(512);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 139;BA.debugLine="TouchXStart = x";
Debug.ShouldStop(1024);
__ref.setField ("_touchxstart" /*RemoteObject*/ ,_x);
 break; }
case 1: {
 BA.debugLineNum = 141;BA.debugLine="If mLeftPanel.Left < 0 Or x <= LeftPanelRightSi";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("<",__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("k",_x,BA.numberCast(double.class, _leftpanelrightside))) { 
 BA.debugLineNum = 142;BA.debugLine="Dim dx As Float = x - TouchXStart";
Debug.ShouldStop(8192);
_dx = BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_x,__ref.getField(true,"_touchxstart" /*RemoteObject*/ )}, "-",1, 0));Debug.locals.put("dx", _dx);Debug.locals.put("dx", _dx);
 BA.debugLineNum = 143;BA.debugLine="ChangeOffset(mLeftPanel.Left + dx, True, False";
Debug.ShouldStop(16384);
__ref.runClassMethod (b4i_b4xdrawer.class, "_changeoffset:::" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left"),_dx}, "+",1, 0))),(Object)(b4i_main.__c.runMethod(true,"True")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 144;BA.debugLine="StartAtScrim = False";
Debug.ShouldStop(32768);
__ref.setField ("_startatscrim" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"));
 };
 BA.debugLineNum = 146;BA.debugLine="TouchXStart = X";
Debug.ShouldStop(131072);
__ref.setField ("_touchxstart" /*RemoteObject*/ ,_x);
 break; }
case 2: {
 BA.debugLineNum = 148;BA.debugLine="HandlingSwipe = False";
Debug.ShouldStop(524288);
__ref.setField ("_handlingswipe" /*RemoteObject*/ ,b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 149;BA.debugLine="If IsOpen And StartAtScrim And x > LeftPanelRig";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(".",__ref.getField(true,"_isopen" /*RemoteObject*/ )) && RemoteObject.solveBoolean(".",__ref.getField(true,"_startatscrim" /*RemoteObject*/ )) && RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, _leftpanelrightside))) { 
 BA.debugLineNum = 150;BA.debugLine="setLeftOpen(False)";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4i_b4xdrawer.class, "_setleftopen:" /*RemoteObject*/ ,(Object)(b4i_main.__c.runMethod(true,"False")));
 }else {
 BA.debugLineNum = 152;BA.debugLine="ChangeOffset(mLeftPanel.Left, False, False)";
Debug.ShouldStop(8388608);
__ref.runClassMethod (b4i_b4xdrawer.class, "_changeoffset:::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(b4i_main.__c.runMethod(true,"False")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 break; }
}
;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Resize (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,231);
if (RapidSub.canDelegate("resize")) { return __ref.runUserSub(false, "b4xdrawer","resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 231;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
Debug.ShouldStop(64);
 BA.debugLineNum = 232;BA.debugLine="If IsOpen Then ChangeOffset(-mSideWidth, False, T";
Debug.ShouldStop(128);
if (__ref.getField(true,"_isopen" /*RemoteObject*/ ).getBoolean()) { 
__ref.runClassMethod (b4i_b4xdrawer.class, "_changeoffset:::" /*RemoteObject*/ ,(Object)(BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue()))),(Object)(b4i_main.__c.runMethod(true,"False")),(Object)(b4i_main.__c.runMethod(true,"True")));};
 BA.debugLineNum = 233;BA.debugLine="mBasePanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.ShouldStop(256);
__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 234;BA.debugLine="mLeftPanel.SetLayoutAnimated(0, mLeftPanel.Left,";
Debug.ShouldStop(512);
__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Left")),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mleftpanel" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbasepanel" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 235;BA.debugLine="mDarkPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
Debug.ShouldStop(1024);
__ref.getField(false,"_mdarkpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 236;BA.debugLine="mCenterPanel.SetLayoutAnimated(0, 0, 0, Width, He";
Debug.ShouldStop(2048);
__ref.getField(false,"_mcenterpanel" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgestureenabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setGestureEnabled (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,243);
if (RapidSub.canDelegate("setgestureenabled")) { return __ref.runUserSub(false, "b4xdrawer","setgestureenabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 243;BA.debugLine="Public Sub setGestureEnabled (b As Boolean)";
Debug.ShouldStop(262144);
 BA.debugLineNum = 244;BA.debugLine="mEnabled = b";
Debug.ShouldStop(524288);
__ref.setField ("_menabled" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setleftopen(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("setLeftOpen (b4xdrawer) ","b4xdrawer",11,__ref.getField(false, "bi"),__ref,216);
if (RapidSub.canDelegate("setleftopen")) { return __ref.runUserSub(false, "b4xdrawer","setleftopen", __ref, _b);}
RemoteObject _x = RemoteObject.createImmutable(0.0f);
Debug.locals.put("b", _b);
 BA.debugLineNum = 216;BA.debugLine="Public Sub setLeftOpen (b As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="If b = IsOpen Then Return";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_b,__ref.getField(true,"_isopen" /*RemoteObject*/ ))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 218;BA.debugLine="Dim x As Float";
Debug.ShouldStop(33554432);
_x = RemoteObject.createImmutable(0.0f);Debug.locals.put("x", _x);
 BA.debugLineNum = 219;BA.debugLine="If b Then x = 0 Else x = -mSideWidth";
Debug.ShouldStop(67108864);
if (_b.getBoolean()) { 
_x = BA.numberCast(float.class, 0);Debug.locals.put("x", _x);}
else {
_x = BA.numberCast(float.class, -(double) (0 + __ref.getField(true,"_msidewidth" /*RemoteObject*/ ).<Number>get().intValue()));Debug.locals.put("x", _x);};
 BA.debugLineNum = 220;BA.debugLine="ChangeOffset(x, False, False)";
Debug.ShouldStop(134217728);
__ref.runClassMethod (b4i_b4xdrawer.class, "_changeoffset:::" /*RemoteObject*/ ,(Object)(_x),(Object)(b4i_main.__c.runMethod(true,"False")),(Object)(b4i_main.__c.runMethod(true,"False")));
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
}