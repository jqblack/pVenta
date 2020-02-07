package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xcombobox_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,48);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "b4xcombobox","base_resize", __ref, _width, _height);}
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 48;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.ShouldStop(32768);
 BA.debugLineNum = 49;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("btn_Click (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,112);
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
		Debug.PushSubsStack("btn_Click (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,112);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
 BA.debugLineNum = 113;BA.debugLine="Dim sheet As ActionSheet";
Debug.ShouldStop(65536);
_sheet = RemoteObject.createNew ("B4IActionSheetWrapper");Debug.locals.put("sheet", _sheet);
 BA.debugLineNum = 114;BA.debugLine="sheet.Initialize(\"sheet\", \"\", \"\", \"\", mItems)";
Debug.ShouldStop(131072);
_sheet.runVoidMethod ("Initialize::::::",__ref.getField(false, "bi"),(Object)(BA.ObjectToString("sheet")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_mitems" /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="sheet.Show(mBase)";
Debug.ShouldStop(262144);
_sheet.runVoidMethodAndSync ("Show:",(Object)(((__ref.getField(false,"_mbase" /*RemoteObject*/ )).getObject())));
 BA.debugLineNum = 116;BA.debugLine="Wait For sheet_Click (Item As String)";
Debug.ShouldStop(524288);
b4i_main.__c.runVoidMethod ("WaitFor::::","sheet_click:", __ref.getField(false, "bi"), anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xcombobox", "btn_click"), null);
this.state = 1;
return;
case 1:
//C
this.state = -1;
_item = (RemoteObject) result.runMethod(true,"objectAtIndex:", RemoteObject.createImmutable(1));Debug.locals.put("Item", _item);
;
 BA.debugLineNum = 117;BA.debugLine="setSelectedIndex(mItems.IndexOf(Item))";
Debug.ShouldStop(1048576);
__ref.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(true,"IndexOf:",(Object)((_item)))));
 BA.debugLineNum = 118;BA.debugLine="RaiseEvent";
Debug.ShouldStop(2097152);
__ref.runClassMethod (b4i_b4xcombobox.class, "_raiseevent" /*RemoteObject*/ );
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private mEventName As String 'ignore";
b4i_b4xcombobox._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_b4xcombobox._meventname);
 //BA.debugLineNum = 5;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_b4xcombobox._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_b4xcombobox._mcallback);
 //BA.debugLineNum = 6;BA.debugLine="Private mBase As B4XView";
b4i_b4xcombobox._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_b4xcombobox._mbase);
 //BA.debugLineNum = 7;BA.debugLine="Private xui As XUI 'ignore";
b4i_b4xcombobox._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xcombobox._xui);
 //BA.debugLineNum = 14;BA.debugLine="Private mItems As List";
b4i_b4xcombobox._mitems = RemoteObject.createNew ("B4IList");__ref.setField("_mitems",b4i_b4xcombobox._mitems);
 //BA.debugLineNum = 15;BA.debugLine="Private mSelectedIndex As Int";
b4i_b4xcombobox._mselectedindex = RemoteObject.createImmutable(0);__ref.setField("_mselectedindex",b4i_b4xcombobox._mselectedindex);
 //BA.debugLineNum = 16;BA.debugLine="Private mBtn As B4XView";
b4i_b4xcombobox._mbtn = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbtn",b4i_b4xcombobox._mbtn);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _designercreateview(RemoteObject __ref,RemoteObject _base,RemoteObject _lbl,RemoteObject _props) throws Exception{
try {
		Debug.PushSubsStack("DesignerCreateView (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,26);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "b4xcombobox","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _xlbl = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _btn = RemoteObject.declareNull("B4IButtonWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("Lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 26;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 27;BA.debugLine="mBase = Base";
Debug.ShouldStop(67108864);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 28;BA.debugLine="Dim xlbl As B4XView = Lbl";
Debug.ShouldStop(134217728);
_xlbl = RemoteObject.createNew ("B4XViewWrapper");
_xlbl.setObject((_lbl).getObject());Debug.locals.put("xlbl", _xlbl);
 BA.debugLineNum = 39;BA.debugLine="Dim btn As Button";
Debug.ShouldStop(64);
_btn = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 40;BA.debugLine="btn.Initialize(\"btn\", btn.STYLE_SYSTEM)";
Debug.ShouldStop(128);
_btn.runVoidMethod ("Initialize:::",(Object)(BA.ObjectToString("btn")),__ref.getField(false, "bi"),(Object)(_btn.runMethod(false,"STYLE_SYSTEM")));
 BA.debugLineNum = 41;BA.debugLine="mBtn = btn";
Debug.ShouldStop(256);
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).setObject ((_btn).getObject());
 BA.debugLineNum = 42;BA.debugLine="mBtn.Font = xlbl.Font";
Debug.ShouldStop(512);
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).runMethod(false,"setFont:",_xlbl.runMethod(false,"Font"));
 BA.debugLineNum = 43;BA.debugLine="mBase.AddView(mBtn, 0, 0, mBase.Width, mBase.Heig";
Debug.ShouldStop(1024);
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((__ref.getField(false,"_mbtn" /*RemoteObject*/ )).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width")),(Object)(__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height")));
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("GetItem (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,89);
if (RapidSub.canDelegate("getitem")) { return __ref.runUserSub(false, "b4xcombobox","getitem", __ref, _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 89;BA.debugLine="Public Sub GetItem(Index As Int) As String";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 95;BA.debugLine="Return mItems.Get(Index)";
Debug.ShouldStop(1073741824);
if (true) return BA.ObjectToString(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_index)));
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
public static RemoteObject  _getselectedindex(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getSelectedIndex (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,68);
if (RapidSub.canDelegate("getselectedindex")) { return __ref.runUserSub(false, "b4xcombobox","getselectedindex", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Public Sub getSelectedIndex As Int";
Debug.ShouldStop(8);
 BA.debugLineNum = 72;BA.debugLine="Return mSelectedIndex";
Debug.ShouldStop(128);
if (true) return __ref.getField(true,"_mselectedindex" /*RemoteObject*/ );
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Initialize (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xcombobox","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.ShouldStop(524288);
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1048576);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.ShouldStop(2097152);
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _raiseevent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RaiseEvent (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,99);
if (RapidSub.canDelegate("raiseevent")) { return __ref.runUserSub(false, "b4xcombobox","raiseevent", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Private Sub RaiseEvent";
Debug.ShouldStop(4);
 BA.debugLineNum = 100;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
Debug.ShouldStop(8);
b4i_main.__c.runMethodAndSync(false,"CallSub2::::",__ref.getField(false, "bi"),(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_SelectedIndexChanged"))),(Object)((__ref.runClassMethod (b4i_b4xcombobox.class, "_getselectedindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setitems(RemoteObject __ref,RemoteObject _items) throws Exception{
try {
		Debug.PushSubsStack("SetItems (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,52);
if (RapidSub.canDelegate("setitems")) { return __ref.runUserSub(false, "b4xcombobox","setitems", __ref, _items);}
Debug.locals.put("Items", _items);
 BA.debugLineNum = 52;BA.debugLine="Public Sub SetItems(Items As List)";
Debug.ShouldStop(524288);
 BA.debugLineNum = 60;BA.debugLine="Dim mItems As List";
Debug.ShouldStop(134217728);
b4i_b4xcombobox._mitems = RemoteObject.createNew ("B4IList");__ref.setField("_mitems",b4i_b4xcombobox._mitems);
 BA.debugLineNum = 61;BA.debugLine="mItems.Initialize";
Debug.ShouldStop(268435456);
__ref.getField(false,"_mitems" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="mItems.AddAll(Items)";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mitems" /*RemoteObject*/ ).runVoidMethod ("AddAll:",(Object)(_items));
 BA.debugLineNum = 63;BA.debugLine="mSelectedIndex = -1";
Debug.ShouldStop(1073741824);
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 65;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",_items.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
__ref.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));};
 BA.debugLineNum = 66;BA.debugLine="End Sub";
Debug.ShouldStop(2);
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
		Debug.PushSubsStack("setSelectedIndex (b4xcombobox) ","b4xcombobox",9,__ref.getField(false, "bi"),__ref,76);
if (RapidSub.canDelegate("setselectedindex")) { return __ref.runUserSub(false, "b4xcombobox","setselectedindex", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 76;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 80;BA.debugLine="mSelectedIndex = i";
Debug.ShouldStop(32768);
__ref.setField ("_mselectedindex" /*RemoteObject*/ ,_i);
 BA.debugLineNum = 81;BA.debugLine="If i < 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("<",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 82;BA.debugLine="mBtn.Text = \"\"";
Debug.ShouldStop(131072);
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).runMethod(true,"setText:",BA.ObjectToString(""));
 }else {
 BA.debugLineNum = 84;BA.debugLine="mBtn.Text = mItems.Get(i)";
Debug.ShouldStop(524288);
__ref.getField(false,"_mbtn" /*RemoteObject*/ ).runMethod(true,"setText:",BA.ObjectToString(__ref.getField(false,"_mitems" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_i))));
 };
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}