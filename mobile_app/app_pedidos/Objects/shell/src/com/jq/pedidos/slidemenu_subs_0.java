package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class slidemenu_subs_0 {


public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _text,RemoteObject _image,RemoteObject _returnvalue) throws Exception{
try {
		Debug.PushSubsStack("AddItem (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "slidemenu","additem", __ref, _text, _image, _returnvalue);}
RemoteObject _item = RemoteObject.declareNull("com.jq.pedidos.slidemenu._actionitem");
Debug.locals.put("Text", _text);
Debug.locals.put("Image", _image);
Debug.locals.put("ReturnValue", _returnvalue);
 BA.debugLineNum = 172;BA.debugLine="Public Sub AddItem(Text As String, Image As Bitmap";
Debug.ShouldStop(2048);
 BA.debugLineNum = 173;BA.debugLine="Dim item As ActionItem";
Debug.ShouldStop(4096);
_item = RemoteObject.createNew ("com.jq.pedidos.slidemenu._actionitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 174;BA.debugLine="item.Initialize";
Debug.ShouldStop(8192);
_item.runVoidMethod ("Initialize");
 BA.debugLineNum = 175;BA.debugLine="item.Text = Text";
Debug.ShouldStop(16384);
_item.setField ("Text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 176;BA.debugLine="item.Image = Image";
Debug.ShouldStop(32768);
_item.setField ("Image" /*RemoteObject*/ ,_image);
 BA.debugLineNum = 177;BA.debugLine="item.Value = ReturnValue";
Debug.ShouldStop(65536);
_item.setField ("Value" /*RemoteObject*/ ,_returnvalue);
 BA.debugLineNum = 181;BA.debugLine="If Not(Image.IsInitialized) Then";
Debug.ShouldStop(1048576);
if (slidemenu.__c.runMethod(true,"Not",(Object)(_image.runMethod(true,"IsInitialized"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 182;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Null,";
Debug.ShouldStop(2097152);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_text)),(Object)(BA.ObjectToCharSequence("")),(Object)((slidemenu.__c.getField(false,"Null"))),(Object)(_returnvalue));
 }else {
 BA.debugLineNum = 186;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Image,";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_text)),(Object)(BA.ObjectToCharSequence("")),(Object)((_image.getObject())),(Object)(_returnvalue));
 };
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 7;BA.debugLine="Private Sub Class_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Type ActionItem (Text As String, Image As Bitmap,";
;
 //BA.debugLineNum = 10;BA.debugLine="Private View As ImageView";
slidemenu._view = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");__ref.setField("_view",slidemenu._view);
 //BA.debugLineNum = 11;BA.debugLine="Private lblnombre As Label";
slidemenu._lblnombre = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");__ref.setField("_lblnombre",slidemenu._lblnombre);
 //BA.debugLineNum = 12;BA.debugLine="Private panelMenu As Panel";
slidemenu._panelmenu = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_panelmenu",slidemenu._panelmenu);
 //BA.debugLineNum = 14;BA.debugLine="Private mSlidePanel As Panel";
slidemenu._mslidepanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mslidepanel",slidemenu._mslidepanel);
 //BA.debugLineNum = 15;BA.debugLine="Private mBackPanel As Panel";
slidemenu._mbackpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");__ref.setField("_mbackpanel",slidemenu._mbackpanel);
 //BA.debugLineNum = 17;BA.debugLine="Private mModule As Object";
slidemenu._mmodule = RemoteObject.createNew ("Object");__ref.setField("_mmodule",slidemenu._mmodule);
 //BA.debugLineNum = 18;BA.debugLine="Private mEventName As String";
slidemenu._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",slidemenu._meventname);
 //BA.debugLineNum = 20;BA.debugLine="Private mListView As ListView";
slidemenu._mlistview = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");__ref.setField("_mlistview",slidemenu._mlistview);
 //BA.debugLineNum = 22;BA.debugLine="Private mInAnimation As Animation";
slidemenu._minanimation = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");__ref.setField("_minanimation",slidemenu._minanimation);
 //BA.debugLineNum = 23;BA.debugLine="Private mOutAnimation As Animation";
slidemenu._moutanimation = RemoteObject.createNew ("anywheresoftware.b4a.objects.AnimationWrapper");__ref.setField("_moutanimation",slidemenu._moutanimation);
 //BA.debugLineNum = 24;BA.debugLine="Dim backgroundColor As Int : backgroundColor = Co";
slidemenu._backgroundcolor = RemoteObject.createImmutable(0);__ref.setField("_backgroundcolor",slidemenu._backgroundcolor);
 //BA.debugLineNum = 24;BA.debugLine="Dim backgroundColor As Int : backgroundColor = Co";
__ref.setField ("_backgroundcolor" /*RemoteObject*/ ,slidemenu.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 31)),(Object)(BA.numberCast(int.class, 154)),(Object)(BA.numberCast(int.class, 176))));
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "slidemenu","hide", __ref);}
 BA.debugLineNum = 206;BA.debugLine="Public Sub Hide";
Debug.ShouldStop(8192);
 BA.debugLineNum = 207;BA.debugLine="If isVisible = False Then Return";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (com.jq.pedidos.slidemenu.class, "_isvisible" /*RemoteObject*/ ),slidemenu.__c.getField(true,"False"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 209;BA.debugLine="mBackPanel.Left = -mBackPanel.Width";
Debug.ShouldStop(65536);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + __ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runMethod(true,"getWidth").<Integer>get().intValue())));
 BA.debugLineNum = 210;BA.debugLine="mSlidePanel.Left = -mSlidePanel.Width";
Debug.ShouldStop(131072);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, -(double) (0 + __ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"getWidth").<Integer>get().intValue())));
 BA.debugLineNum = 211;BA.debugLine="mOutAnimation.Start(mSlidePanel)";
Debug.ShouldStop(262144);
__ref.getField(false,"_moutanimation" /*RemoteObject*/ ).runVoidMethod ("Start",(Object)((__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _activity,RemoteObject _module,RemoteObject _eventname,RemoteObject _top,RemoteObject _width,RemoteObject _colorbackgound) throws Exception{
try {
		Debug.PushSubsStack("Initialize (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "slidemenu","initialize", __ref, _ba, _activity, _module, _eventname, _top, _width, _colorbackgound);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("Activity", _activity);
Debug.locals.put("Module", _module);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("colorBackgound", _colorbackgound);
 BA.debugLineNum = 34;BA.debugLine="Sub Initialize(Activity As Activity, Module As Obj";
Debug.ShouldStop(2);
 BA.debugLineNum = 72;BA.debugLine="mModule = Module";
Debug.ShouldStop(128);
__ref.setField ("_mmodule" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 73;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(256);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 75;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
Debug.ShouldStop(1024);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mSlidePanel")));
 BA.debugLineNum = 77;BA.debugLine="mListView.Initialize(\"mListView\")";
Debug.ShouldStop(4096);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mListView")));
 BA.debugLineNum = 78;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
Debug.ShouldStop(8192);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setVisible",slidemenu.__c.getField(true,"False"));
 BA.debugLineNum = 79;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
Debug.ShouldStop(16384);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 80;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
Debug.ShouldStop(32768);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setGravity",slidemenu.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 81;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
Debug.ShouldStop(65536);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setHeight",__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"getItemHeight"));
 BA.debugLineNum = 82;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
Debug.ShouldStop(131072);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTop",BA.numberCast(int.class, 0));
 BA.debugLineNum = 83;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextColor = Col";
Debug.ShouldStop(262144);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",slidemenu.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 33)),(Object)(BA.numberCast(int.class, 33))));
 BA.debugLineNum = 84;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
Debug.ShouldStop(524288);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"ImageView").runVoidMethod ("SetLayout",(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 13)))),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 13)))),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 85;BA.debugLine="mListView.Color = colorBackgound";
Debug.ShouldStop(1048576);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runVoidMethod ("setColor",_colorbackgound);
 BA.debugLineNum = 87;BA.debugLine="funcion.SetDivider( mListView,Colors.LightGray,1d";
Debug.ShouldStop(4194304);
slidemenu._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mlistview" /*RemoteObject*/ )),(Object)(slidemenu.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 89;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
Debug.ShouldStop(16777216);
__ref.getField(false,"_minanimation" /*RemoteObject*/ ).runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, -(double) (0 + _width.<Integer>get().intValue()))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 90;BA.debugLine="mInAnimation.Duration = 350";
Debug.ShouldStop(33554432);
__ref.getField(false,"_minanimation" /*RemoteObject*/ ).runMethod(true,"setDuration",BA.numberCast(long.class, 350));
 BA.debugLineNum = 91;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
Debug.ShouldStop(67108864);
__ref.getField(false,"_moutanimation" /*RemoteObject*/ ).runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Out")),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 92;BA.debugLine="mOutAnimation.Duration = 200";
Debug.ShouldStop(134217728);
__ref.getField(false,"_moutanimation" /*RemoteObject*/ ).runMethod(true,"setDuration",BA.numberCast(long.class, 200));
 BA.debugLineNum = 94;BA.debugLine="Activity.AddView(mSlidePanel, 0, Top, Width, 100%";
Debug.ShouldStop(536870912);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_top}, "-",1, 1)));
 BA.debugLineNum = 96;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBackPanel")));
 BA.debugLineNum = 97;BA.debugLine="mBackPanel.Color = Colors.Transparent";
Debug.ShouldStop(1);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runVoidMethod ("setColor",slidemenu.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 98;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
Debug.ShouldStop(2);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, 0)),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 100;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
Debug.ShouldStop(8);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlistview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 101;BA.debugLine="mSlidePanel.Visible = False";
Debug.ShouldStop(16);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",slidemenu.__c.getField(true,"False"));
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize2(RemoteObject __ref,RemoteObject _activity,RemoteObject _module,RemoteObject _eventname,RemoteObject _top,RemoteObject _width,RemoteObject _image_name) throws Exception{
try {
		Debug.PushSubsStack("Initialize2 (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("initialize2")) { return __ref.runUserSub(false, "slidemenu","initialize2", __ref, _activity, _module, _eventname, _top, _width, _image_name);}
RemoteObject _a = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
Debug.locals.put("Activity", _activity);
Debug.locals.put("Module", _module);
Debug.locals.put("EventName", _eventname);
Debug.locals.put("Top", _top);
Debug.locals.put("Width", _width);
Debug.locals.put("image_name", _image_name);
 BA.debugLineNum = 109;BA.debugLine="Sub Initialize2(Activity As Activity, Module As Ob";
Debug.ShouldStop(4096);
 BA.debugLineNum = 110;BA.debugLine="panelMenu.Initialize(\"panelMenu\")";
Debug.ShouldStop(8192);
__ref.getField(false,"_panelmenu" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("panelMenu")));
 BA.debugLineNum = 111;BA.debugLine="View.Initialize(\"View\")";
Debug.ShouldStop(16384);
__ref.getField(false,"_view" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("View")));
 BA.debugLineNum = 112;BA.debugLine="lblnombre.Initialize(\"lblnombre\")";
Debug.ShouldStop(32768);
__ref.getField(false,"_lblnombre" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("lblnombre")));
 BA.debugLineNum = 115;BA.debugLine="lblnombre.TextColor=Colors.White";
Debug.ShouldStop(262144);
__ref.getField(false,"_lblnombre" /*RemoteObject*/ ).runMethod(true,"setTextColor",slidemenu.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 116;BA.debugLine="lblnombre.TextSize=4%y";
Debug.ShouldStop(524288);
__ref.getField(false,"_lblnombre" /*RemoteObject*/ ).runMethod(true,"setTextSize",BA.numberCast(float.class, slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 118;BA.debugLine="Dim a As BitmapDrawable";
Debug.ShouldStop(2097152);
_a = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("a", _a);
 BA.debugLineNum = 119;BA.debugLine="a.Initialize(LoadBitmap(File.DirAssets,image_name";
Debug.ShouldStop(4194304);
_a.runVoidMethod ("Initialize",(Object)((slidemenu.__c.runMethod(false,"LoadBitmap",(Object)(slidemenu.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(_image_name)).getObject())));
 BA.debugLineNum = 120;BA.debugLine="View.Background=a";
Debug.ShouldStop(8388608);
__ref.getField(false,"_view" /*RemoteObject*/ ).runMethod(false,"setBackground",(_a.getObject()));
 BA.debugLineNum = 123;BA.debugLine="panelMenu.AddView(View,2%x,1%y,4%x,9%y)";
Debug.ShouldStop(67108864);
__ref.getField(false,"_panelmenu" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_view" /*RemoteObject*/ ).getObject())),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 4)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 9)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 124;BA.debugLine="panelMenu.AddView(lblnombre,10%x,1%y,50%x,8%y)";
Debug.ShouldStop(134217728);
__ref.getField(false,"_panelmenu" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_lblnombre" /*RemoteObject*/ ).getObject())),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 1)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 50)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 8)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 126;BA.debugLine="Activity.AddView(panelMenu,0%x,0%y,100%x,10%y)";
Debug.ShouldStop(536870912);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_panelmenu" /*RemoteObject*/ ).getObject())),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 128;BA.debugLine="mModule = Module";
Debug.ShouldStop(-2147483648);
__ref.setField ("_mmodule" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 129;BA.debugLine="mEventName = EventName";
Debug.ShouldStop(1);
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 131;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
Debug.ShouldStop(4);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mSlidePanel")));
 BA.debugLineNum = 133;BA.debugLine="mListView.Initialize(\"mListView\")";
Debug.ShouldStop(16);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mListView")));
 BA.debugLineNum = 134;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
Debug.ShouldStop(32);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setVisible",slidemenu.__c.getField(true,"False"));
 BA.debugLineNum = 135;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
Debug.ShouldStop(64);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 50))));
 BA.debugLineNum = 136;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
Debug.ShouldStop(128);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setGravity",slidemenu.__c.getField(false,"Gravity").getField(true,"CENTER_VERTICAL"));
 BA.debugLineNum = 137;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
Debug.ShouldStop(256);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setHeight",__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"getItemHeight"));
 BA.debugLineNum = 138;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
Debug.ShouldStop(512);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTop",BA.numberCast(int.class, 0));
 BA.debugLineNum = 139;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
Debug.ShouldStop(1024);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"ImageView").runVoidMethod ("SetLayout",(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 13)))),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 13)))),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))),(Object)(slidemenu.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 24)))));
 BA.debugLineNum = 140;BA.debugLine="mListView.Color = Colors.RGB(168,90,7)";
Debug.ShouldStop(2048);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runVoidMethod ("setColor",slidemenu.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 168)),(Object)(BA.numberCast(int.class, 90)),(Object)(BA.numberCast(int.class, 7))));
 BA.debugLineNum = 143;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextColor=Co";
Debug.ShouldStop(16384);
__ref.getField(false,"_mlistview" /*RemoteObject*/ ).runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",slidemenu.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 146;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
Debug.ShouldStop(131072);
__ref.getField(false,"_minanimation" /*RemoteObject*/ ).runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("")),(Object)(BA.numberCast(float.class, -(double) (0 + _width.<Integer>get().intValue()))),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 147;BA.debugLine="mInAnimation.Duration = 200";
Debug.ShouldStop(262144);
__ref.getField(false,"_minanimation" /*RemoteObject*/ ).runMethod(true,"setDuration",BA.numberCast(long.class, 200));
 BA.debugLineNum = 148;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
Debug.ShouldStop(524288);
__ref.getField(false,"_moutanimation" /*RemoteObject*/ ).runVoidMethod ("InitializeTranslate",__ref.getField(false, "ba"),(Object)(BA.ObjectToString("Out")),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 149;BA.debugLine="mOutAnimation.Duration = 200";
Debug.ShouldStop(1048576);
__ref.getField(false,"_moutanimation" /*RemoteObject*/ ).runMethod(true,"setDuration",BA.numberCast(long.class, 200));
 BA.debugLineNum = 151;BA.debugLine="Activity.AddView(mSlidePanel, 0,  Top, Width, 100";
Debug.ShouldStop(4194304);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(_top),(Object)(_width),(Object)(RemoteObject.solve(new RemoteObject[] {slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")),_top}, "-",1, 1)));
 BA.debugLineNum = 153;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
Debug.ShouldStop(16777216);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runVoidMethod ("Initialize",__ref.getField(false, "ba"),(Object)(RemoteObject.createImmutable("mBackPanel")));
 BA.debugLineNum = 154;BA.debugLine="mBackPanel.Color = Colors.Transparent";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runVoidMethod ("setColor",slidemenu.__c.getField(false,"Colors").getField(true,"Transparent"));
 BA.debugLineNum = 155;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
Debug.ShouldStop(67108864);
_activity.runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, -(double) (0 + slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba")).<Integer>get().intValue()))),(Object)(BA.numberCast(int.class, 0)),(Object)(slidemenu.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))),(Object)(slidemenu.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),__ref.getField(false, "ba"))));
 BA.debugLineNum = 158;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
Debug.ShouldStop(536870912);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runVoidMethod ("AddView",(Object)((__ref.getField(false,"_mlistview" /*RemoteObject*/ ).getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"getWidth")),(Object)(__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"getHeight")));
 BA.debugLineNum = 159;BA.debugLine="mSlidePanel.Visible = False";
Debug.ShouldStop(1073741824);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",slidemenu.__c.getField(true,"False"));
 BA.debugLineNum = 160;BA.debugLine="mSlidePanel.Color=Colors.White";
Debug.ShouldStop(-2147483648);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runVoidMethod ("setColor",slidemenu.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("isVisible (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("isvisible")) { return __ref.runUserSub(false, "slidemenu","isvisible", __ref);}
 BA.debugLineNum = 237;BA.debugLine="Public Sub isVisible As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="Return mSlidePanel.Visible";
Debug.ShouldStop(8192);
if (true) return __ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"getVisible");
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mbackpanel_touch(RemoteObject __ref,RemoteObject _action,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("mBackPanel_Touch (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("mbackpanel_touch")) { return __ref.runUserSub(false, "slidemenu","mbackpanel_touch", __ref, _action, _x, _y);}
Debug.locals.put("Action", _action);
Debug.locals.put("X", _x);
Debug.locals.put("Y", _y);
 BA.debugLineNum = 221;BA.debugLine="Private Sub mBackPanel_Touch (Action As Int, X As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 222;BA.debugLine="If Action = 1 Then";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("=",_action,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 223;BA.debugLine="Hide";
Debug.ShouldStop(1073741824);
__ref.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 };
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mlistview_itemclick(RemoteObject __ref,RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("mListView_ItemClick (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("mlistview_itemclick")) { return __ref.runUserSub(false, "slidemenu","mlistview_itemclick", __ref, _position, _value);}
RemoteObject _subname = RemoteObject.createImmutable("");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 227;BA.debugLine="Private Sub mListView_ItemClick (Position As Int,";
Debug.ShouldStop(4);
 BA.debugLineNum = 228;BA.debugLine="Dim subname As String";
Debug.ShouldStop(8);
_subname = RemoteObject.createImmutable("");Debug.locals.put("subname", _subname);
 BA.debugLineNum = 229;BA.debugLine="Hide";
Debug.ShouldStop(16);
__ref.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 230;BA.debugLine="subname = mEventName & \"_Click\"";
Debug.ShouldStop(32);
_subname = RemoteObject.concat(__ref.getField(true,"_meventname" /*RemoteObject*/ ),RemoteObject.createImmutable("_Click"));Debug.locals.put("subname", _subname);
 BA.debugLineNum = 231;BA.debugLine="If SubExists(mModule, subname) Then";
Debug.ShouldStop(64);
if (slidemenu.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 232;BA.debugLine="CallSub2(mModule, subname, Value)";
Debug.ShouldStop(128);
slidemenu.__c.runMethodAndSync(false,"CallSubNew2",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule" /*RemoteObject*/ )),(Object)(_subname),(Object)(_value));
 };
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _out_animationend(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Out_AnimationEnd (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("out_animationend")) { return __ref.runUserSub(false, "slidemenu","out_animationend", __ref);}
 BA.debugLineNum = 217;BA.debugLine="Public Sub Out_AnimationEnd";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 218;BA.debugLine="mSlidePanel.Visible = False";
Debug.ShouldStop(33554432);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",slidemenu.__c.getField(true,"False"));
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("Show (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "slidemenu","show", __ref);}
 BA.debugLineNum = 193;BA.debugLine="Public Sub Show";
Debug.ShouldStop(1);
 BA.debugLineNum = 194;BA.debugLine="If isVisible = True Then Return";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (com.jq.pedidos.slidemenu.class, "_isvisible" /*RemoteObject*/ ),slidemenu.__c.getField(true,"True"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 196;BA.debugLine="mBackPanel.BringToFront";
Debug.ShouldStop(8);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 197;BA.debugLine="mSlidePanel.BringToFront";
Debug.ShouldStop(16);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runVoidMethod ("BringToFront");
 BA.debugLineNum = 198;BA.debugLine="mBackPanel.Left = 0";
Debug.ShouldStop(32);
__ref.getField(false,"_mbackpanel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 199;BA.debugLine="mSlidePanel.Left = 0";
Debug.ShouldStop(64);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"setLeft",BA.numberCast(int.class, 0));
 BA.debugLineNum = 201;BA.debugLine="mSlidePanel.Visible = True";
Debug.ShouldStop(256);
__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).runMethod(true,"setVisible",slidemenu.__c.getField(true,"True"));
 BA.debugLineNum = 202;BA.debugLine="mInAnimation.Start(mSlidePanel)";
Debug.ShouldStop(512);
__ref.getField(false,"_minanimation" /*RemoteObject*/ ).runVoidMethod ("Start",(Object)((__ref.getField(false,"_mslidepanel" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _view_click(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("View_Click (slidemenu) ","slidemenu",4,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("view_click")) { return __ref.runUserSub(false, "slidemenu","view_click", __ref);}
RemoteObject _subname = RemoteObject.createImmutable("");
 BA.debugLineNum = 163;BA.debugLine="Public Sub View_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 164;BA.debugLine="Dim subname As String";
Debug.ShouldStop(8);
_subname = RemoteObject.createImmutable("");Debug.locals.put("subname", _subname);
 BA.debugLineNum = 165;BA.debugLine="Hide";
Debug.ShouldStop(16);
__ref.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 166;BA.debugLine="subname = \"sm_Click\"";
Debug.ShouldStop(32);
_subname = BA.ObjectToString("sm_Click");Debug.locals.put("subname", _subname);
 BA.debugLineNum = 167;BA.debugLine="If SubExists(mModule, subname) Then";
Debug.ShouldStop(64);
if (slidemenu.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule" /*RemoteObject*/ )),(Object)(_subname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="CallSub(mModule, subname)";
Debug.ShouldStop(128);
slidemenu.__c.runMethodAndSync(false,"CallSubNew",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_mmodule" /*RemoteObject*/ )),(Object)(_subname));
 };
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}