package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xcombobox_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,55);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xcombobox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 55;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btn_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("btn_Click (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,129);
if (RapidSub.canDelegate("btn_click")) { __ref.runUserSub(false, "b4xcombobox","btn_click", __ref); return;}
ResumableSub_btn_Click rsub = new ResumableSub_btn_Click(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btn_Click extends BA.ResumableSub {
public ResumableSub_btn_Click(b4i_b4xcombobox parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_b4xcombobox parent;
RemoteObject _sheet = RemoteObject.declareNull("B4IActionSheetWrapper");
RemoteObject _item = RemoteObject.createImmutable("");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btn_Click (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,129);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 130;BA.debugLine="Dim sheet As ActionSheet";
Debug.JustUpdateDeviceLine();
_sheet = RemoteObject.createNew ("B4IActionSheetWrapper");Debug.locals.put("sheet", _sheet);
 BA.debugLineNum = 131;BA.debugLine="sheet.Initialize(\"sheet\", \"\", B4iCancelButton, \"\"";
Debug.JustUpdateDeviceLine();
_sheet.runVoidMethod ("Initialize::::::",__ref.getField(false, "bi"),(Object)(BA.ObjectToString("sheet")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(true,"_b4icancelbutton" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_mitems" /*RemoteObject*/ )));
 BA.debugLineNum = 132;BA.debugLine="sheet.Show(mBase)";
Debug.JustUpdateDeviceLine();
_sheet.runVoidMethodAndSync ("Show:",(Object)(((__ref.getField(false,"_mbase" /*RemoteObject*/ )).getObject())));
 BA.debugLineNum = 133;BA.debugLine="Wait For sheet_Click (Item As String)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("WaitFor::::","sheet_click:", __ref.getField(false, "bi"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcombobox", "btn_click"), null);
this.state = 7;
return;
case 7:
//C
this.state = 1;
_item = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(1));Debug.locals.put("Item", _item);
;
 BA.debugLineNum = 134;BA.debugLine="if B4iCancelButton <> \"\" and Item = B4iCancelButt";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_b4icancelbutton" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("=",_item,__ref.getField(true,"_b4icancelbutton" /*RemoteObject*/ ))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 135;BA.debugLine="setSelectedIndex(mItems.IndexOf(Item))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(true,"IndexOf:",(Object)((_item)))));
 BA.debugLineNum = 136;BA.debugLine="LastSelectedIndex = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 137;BA.debugLine="RaiseEvent";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xcombobox.class, "_raiseevent" /*void*/ );
 BA.debugLineNum = 138;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static void  _sheet_click(RemoteObject __ref,RemoteObject _item) throws Exception{
}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private mEventName As String 'ignore";
b4i_b4xcombobox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_b4xcombobox._meventname);
 //BA.debugLineNum = 4;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_b4xcombobox._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_b4xcombobox._mcallback);
 //BA.debugLineNum = 5;BA.debugLine="Public mBase As B4XView";
b4i_b4xcombobox._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_b4xcombobox._mbase);
 //BA.debugLineNum = 6;BA.debugLine="Private xui As XUI 'ignore";
b4i_b4xcombobox._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xcombobox._xui);
 //BA.debugLineNum = 7;BA.debugLine="Private LastSelectedIndex As Int";
b4i_b4xcombobox._lastselectedindex = RemoteObject.createImmutable(0);__ref.setField("_lastselectedindex",b4i_b4xcombobox._lastselectedindex);
 //BA.debugLineNum = 13;BA.debugLine="Private mItems As List";
b4i_b4xcombobox._mitems = RemoteObject.createNew ("B4IList");__ref.setField("_mitems",b4i_b4xcombobox._mitems);
 //BA.debugLineNum = 14;BA.debugLine="Private mSelectedIndex As Int";
b4i_b4xcombobox._mselectedindex = RemoteObject.createImmutable(0);__ref.setField("_mselectedindex",b4i_b4xcombobox._mselectedindex);
 //BA.debugLineNum = 15;BA.debugLine="Public mBtn As B4XView";
b4i_b4xcombobox._mbtn = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbtn",b4i_b4xcombobox._mbtn);
 //BA.debugLineNum = 17;BA.debugLine="Public DelayBeforeChangeEvent As Int";
b4i_b4xcombobox._delaybeforechangeevent = RemoteObject.createImmutable(0);__ref.setField("_delaybeforechangeevent",b4i_b4xcombobox._delaybeforechangeevent);
 //BA.debugLineNum = 19;BA.debugLine="Private DelayIndex As Int";
b4i_b4xcombobox._delayindex = RemoteObject.createImmutable(0);__ref.setField("_delayindex",b4i_b4xcombobox._delayindex);
 //BA.debugLineNum = 20;BA.debugLine="Public Tag As Object";
b4i_b4xcombobox._tag = RemoteObject.createNew ("NSObject");__ref.setField("_tag",b4i_b4xcombobox._tag);
 //BA.debugLineNum = 21;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
b4i_b4xcombobox._b4icancelbutton = BA.ObjectToString("Cancel");__ref.setField("_b4icancelbutton",b4i_b4xcombobox._b4icancelbutton);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,32);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xcombobox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _btn = RemoteObject.declareNull("B4IButtonWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 32;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"Tag"));
 BA.debugLineNum = 34;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag:",__ref);
 BA.debugLineNum = 35;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.JustUpdateDeviceLine();
_xlbl = RemoteObject.createNew ("B4XViewWrapper");
_xlbl.setObject((_lbl).getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 46;BA.debugLine="Dim btn As Button";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 47;BA.debugLine="btn.Initialize(\"btn\", btn.STYLE_SYSTEM)";
Debug.JustUpdateDeviceLine();
_btn.runVoidMethod ("Initialize:::",(Object)(BA.ObjectToString("btn")),__ref.getField(false, "bi"),(Object)(_btn.runMethod(false,"STYLE_SYSTEM")));
 BA.debugLineNum = 48;BA.debugLine="mBtn = btn";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).setObject ((_btn).getObject());
 BA.debugLineNum = 49;BA.debugLine="mBtn.Font = xlbl.Font";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).runMethod(false,"setFont:",_xlbl.runMethod(false,"Font"));
 BA.debugLineNum = 50;BA.debugLine="mBase.AddView(mBtn, 0, 0, mBase.Width, mBase.Heig";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mbtn" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getitem(RemoteObject __ref,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("GetItem (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,97);
if (RapidSub.canDelegate("getitem")) { return __ref.runUserSub(false, "b4xcombobox","getitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 97;BA.debugLine="Public Sub GetItem(Index As Int) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="Return mItems.Get(Index)";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToString(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselectedindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedIndex (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,75);
if (RapidSub.canDelegate("getselectedindex")) { return __ref.runUserSub(false, "b4xcombobox","getselectedindex", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Public Sub getSelectedIndex As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="Return mSelectedIndex";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mselectedindex" /*RemoteObject*/ );
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _callback,RemoteObject _eventname) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcombobox","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 26;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 27;BA.debugLine="LastSelectedIndex = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 28;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4J").getBoolean()) { 
__ref.setField ("_delaybeforechangeevent" /*RemoteObject*/ ,BA.numberCast(int.class, 500));};
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _raiseevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,107);
if (RapidSub.canDelegate("raiseevent")) { __ref.runUserSub(false, "b4xcombobox","raiseevent", __ref); return;}
ResumableSub_RaiseEvent rsub = new ResumableSub_RaiseEvent(null,__ref);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_RaiseEvent extends BA.ResumableSub {
public ResumableSub_RaiseEvent(b4i_b4xcombobox parent,RemoteObject __ref) {
this.parent = parent;
this.__ref = __ref;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_b4xcombobox parent;
RemoteObject _index = RemoteObject.createImmutable(0);
RemoteObject _myindex = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,107);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 108;BA.debugLine="Dim index As Int = getSelectedIndex";
Debug.JustUpdateDeviceLine();
_index = __ref.runClassMethod (b4i_b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ );Debug.locals.put("index", _index);Debug.locals.put("index", _index);
 BA.debugLineNum = 109;BA.debugLine="If LastSelectedIndex = index Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_lastselectedindex" /*RemoteObject*/ ),BA.numberCast(double.class, _index))) { 
this.state = 3;
;}if (true) break;

case 3:
//C
this.state = 6;
if (true) return ;
if (true) break;

case 6:
//C
this.state = 7;
;
 BA.debugLineNum = 110;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
Debug.JustUpdateDeviceLine();
if (true) break;

case 7:
//if
this.state = 16;
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_delaybeforechangeevent" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
 BA.debugLineNum = 111;BA.debugLine="DelayIndex = DelayIndex + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_delayindex" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_delayindex" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 112;BA.debugLine="Dim MyIndex As Int = DelayIndex";
Debug.JustUpdateDeviceLine();
_myindex = __ref.getField(true,"_delayindex" /*RemoteObject*/ );Debug.locals.put("MyIndex", _myindex);Debug.locals.put("MyIndex", _myindex);
 BA.debugLineNum = 113;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("Sleep:::",__ref.getField(false, "bi"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcombobox", "raiseevent"),__ref.getField(true,"_delaybeforechangeevent" /*RemoteObject*/ ));
this.state = 17;
return;
case 17:
//C
this.state = 10;
;
 BA.debugLineNum = 114;BA.debugLine="If MyIndex <> DelayIndex Then Return";
Debug.JustUpdateDeviceLine();
if (true) break;

case 10:
//if
this.state = 15;
if (RemoteObject.solveBoolean("!",_myindex,BA.numberCast(double.class, __ref.getField(true,"_delayindex" /*RemoteObject*/ )))) { 
this.state = 12;
;}if (true) break;

case 12:
//C
this.state = 15;
if (true) return ;
if (true) break;

case 15:
//C
this.state = 16;
;
 if (true) break;

case 16:
//C
this.state = -1;
;
 BA.debugLineNum = 116;BA.debugLine="LastSelectedIndex = index";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,_index);
 BA.debugLineNum = 117;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedIndexChanged"))),(Object)((_index)));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("SetItems (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,59);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "b4xcombobox","setitems", __ref, _items);}
Debug.locals.put("Items", _items);
 BA.debugLineNum = 59;BA.debugLine="Public Sub SetItems(Items As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="Dim mItems As List";
Debug.JustUpdateDeviceLine();
b4i_b4xcombobox._mitems = RemoteObject.createNew ("B4IList");__ref.setField("_mitems",b4i_b4xcombobox._mitems);
 BA.debugLineNum = 68;BA.debugLine="mItems.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mitems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 69;BA.debugLine="mItems.AddAll(Items)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mitems" /*RemoteObject*/ ).runVoidMethod ("AddAll:",(Object)(_items));
 BA.debugLineNum = 70;BA.debugLine="mSelectedIndex = -1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 72;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectedindex(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("setSelectedIndex (b4xcombobox) ","b4xcombobox",12,__ref.getField(false, "bi"),__ref,83);
if (RapidSub.canDelegate("setselectedindex")) { return __ref.runUserSub(false, "b4xcombobox","setselectedindex", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 83;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="LastSelectedIndex = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastselectedindex" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 88;BA.debugLine="mSelectedIndex = i";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 89;BA.debugLine="If i < 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 90;BA.debugLine="mBtn.Text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).runMethod(true,"setText:",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 92;BA.debugLine="mBtn.Text = mItems.Get(i)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).runMethod(true,"setText:",BA.ObjectToString(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_i))));
 };
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}