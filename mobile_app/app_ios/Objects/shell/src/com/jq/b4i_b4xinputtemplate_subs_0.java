package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_b4xinputtemplate_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 1;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 2;BA.debugLine="Private xui As XUI";
b4i_b4xinputtemplate._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_b4xinputtemplate._xui);
 //BA.debugLineNum = 3;BA.debugLine="Public mBase As B4XView";
b4i_b4xinputtemplate._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_b4xinputtemplate._mbase);
 //BA.debugLineNum = 4;BA.debugLine="Public Text As String";
b4i_b4xinputtemplate._text = RemoteObject.createImmutable("");__ref.setField("_text",b4i_b4xinputtemplate._text);
 //BA.debugLineNum = 5;BA.debugLine="Private xDialog As B4XDialog";
b4i_b4xinputtemplate._xdialog = RemoteObject.createNew ("b4i_b4xdialog");__ref.setField("_xdialog",b4i_b4xinputtemplate._xdialog);
 //BA.debugLineNum = 6;BA.debugLine="Public RegexPattern As String";
b4i_b4xinputtemplate._regexpattern = RemoteObject.createImmutable("");__ref.setField("_regexpattern",b4i_b4xinputtemplate._regexpattern);
 //BA.debugLineNum = 7;BA.debugLine="Public TextField1 As B4XView";
b4i_b4xinputtemplate._textfield1 = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_textfield1",b4i_b4xinputtemplate._textfield1);
 //BA.debugLineNum = 8;BA.debugLine="Public lblTitle As Label";
b4i_b4xinputtemplate._lbltitle = RemoteObject.createNew ("B4ILabelWrapper");__ref.setField("_lbltitle",b4i_b4xinputtemplate._lbltitle);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _configurefornumbers(RemoteObject __ref,RemoteObject _allowdecimals,RemoteObject _allownegative) throws Exception{
try {
		Debug.PushSubsStack("ConfigureForNumbers (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,30);
if (RapidSub.canDelegate("configurefornumbers")) { return __ref.runUserSub(false, "b4xinputtemplate","configurefornumbers", __ref, _allowdecimals, _allownegative);}
RemoteObject _tf = RemoteObject.declareNull("B4ITextFieldWrapper");
Debug.locals.put("AllowDecimals", _allowdecimals);
Debug.locals.put("AllowNegative", _allownegative);
 BA.debugLineNum = 30;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="Dim tf As TextField = TextField1";
Debug.JustUpdateDeviceLine();
_tf = RemoteObject.createNew ("B4ITextFieldWrapper");
_tf.setObject((__ref.getField(false,"_textfield1" /*RemoteObject*/ )).getObject());Debug.locals.put("tf", _tf);
 BA.debugLineNum = 40;BA.debugLine="If AllowNegative Then";
Debug.JustUpdateDeviceLine();
if (_allownegative.getBoolean()) { 
 BA.debugLineNum = 41;BA.debugLine="tf.KeyboardType = tf.TYPE_NUMBERS_AND_PUNCTUATIO";
Debug.JustUpdateDeviceLine();
_tf.runMethod(true,"setKeyboardType:",_tf.runMethod(true,"TYPE_NUMBERS_AND_PUNCTUATIONS"));
 }else 
{ BA.debugLineNum = 42;BA.debugLine="Else If AllowDecimals  Then";
Debug.JustUpdateDeviceLine();
if (_allowdecimals.getBoolean()) { 
 BA.debugLineNum = 43;BA.debugLine="tf.KeyboardType = tf.TYPE_DECIMAL_PAD";
Debug.JustUpdateDeviceLine();
_tf.runMethod(true,"setKeyboardType:",_tf.runMethod(true,"TYPE_DECIMAL_PAD"));
 }else {
 BA.debugLineNum = 45;BA.debugLine="tf.KeyboardType = tf.TYPE_NUMBER_PAD";
Debug.JustUpdateDeviceLine();
_tf.runMethod(true,"setKeyboardType:",_tf.runMethod(true,"TYPE_NUMBER_PAD"));
 }}
;
 BA.debugLineNum = 49;BA.debugLine="If AllowDecimals And AllowNegative Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_allowdecimals) && RemoteObject.solveBoolean(".",_allownegative)) { 
 BA.debugLineNum = 50;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$"));
 }else 
{ BA.debugLineNum = 51;BA.debugLine="Else If AllowDecimals And AllowNegative = False T";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(".",_allowdecimals) && RemoteObject.solveBoolean("=",_allownegative,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 52;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$"));
 }else 
{ BA.debugLineNum = 53;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_allowdecimals,b4i_main.__c.runMethod(true,"False")) && RemoteObject.solveBoolean("=",_allownegative,b4i_main.__c.runMethod(true,"True"))) { 
 BA.debugLineNum = 54;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^-?(0|[1-9]\\d*)$"));
 }else 
{ BA.debugLineNum = 55;BA.debugLine="Else If AllowDecimals = False And AllowNegative =";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_allowdecimals,b4i_main.__c.runMethod(true,"False")) && RemoteObject.solveBoolean("=",_allownegative,b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 56;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_regexpattern" /*RemoteObject*/ ,BA.ObjectToString("^(0|[1-9]\\d*)$"));
 }}}}
;
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dialogclosed(RemoteObject __ref,RemoteObject _result) throws Exception{
try {
		Debug.PushSubsStack("DialogClosed (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,111);
if (RapidSub.canDelegate("dialogclosed")) { return __ref.runUserSub(false, "b4xinputtemplate","dialogclosed", __ref, _result);}
Debug.locals.put("Result", _result);
 BA.debugLineNum = 111;BA.debugLine="Private Sub DialogClosed(Result As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_result,BA.numberCast(double.class, __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"DialogResponse_Positive")))) { 
 BA.debugLineNum = 113;BA.debugLine="Text = TextField1.Text";
Debug.JustUpdateDeviceLine();
__ref.setField ("_text" /*RemoteObject*/ ,__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"Text"));
 };
 BA.debugLineNum = 115;BA.debugLine="TextField1.Text = Text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setText:",__ref.getField(true,"_text" /*RemoteObject*/ ));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getpanel(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("GetPanel (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,90);
if (RapidSub.canDelegate("getpanel")) { return __ref.runUserSub(false, "b4xinputtemplate","getpanel", __ref, _dialog);}
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 90;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Return mBase";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_mbase" /*RemoteObject*/ );
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "b4xinputtemplate","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mbase" /*RemoteObject*/ ,__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("mBase"))));
 BA.debugLineNum = 16;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 300))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 80))))));
 BA.debugLineNum = 17;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethodAndSync ("LoadLayout::",(Object)(RemoteObject.createImmutable("B4XInputTemplate")),__ref.getField(false, "bi"));
 BA.debugLineNum = 18;BA.debugLine="TextField1.TextColor = xui.Color_White";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setTextColor:",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"));
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isvalid(RemoteObject __ref,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("IsValid (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,77);
if (RapidSub.canDelegate("isvalid")) { return __ref.runUserSub(false, "b4xinputtemplate","isvalid", __ref, _new);}
Debug.locals.put("New", _new);
 BA.debugLineNum = 77;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
Debug.JustUpdateDeviceLine();
if (true) return BA.ObjectToBoolean(RemoteObject.solveBoolean("=",__ref.getField(true,"_regexpattern" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean(".",b4i_main.__c.runMethod(false,"Regex").runMethod(true,"IsMatch::",(Object)(__ref.getField(true,"_regexpattern" /*RemoteObject*/ )),(Object)(_new))));
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _show(RemoteObject __ref,RemoteObject _dialog) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,94);
if (RapidSub.canDelegate("show")) { __ref.runUserSub(false, "b4xinputtemplate","show", __ref, _dialog); return;}
ResumableSub_Show rsub = new ResumableSub_Show(null,__ref,_dialog);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_Show extends BA.ResumableSub {
public ResumableSub_Show(b4i_b4xinputtemplate parent,RemoteObject __ref,RemoteObject _dialog) {
this.parent = parent;
this.__ref = __ref;
this._dialog = _dialog;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
RemoteObject __ref;
b4i_b4xinputtemplate parent;
RemoteObject _dialog;
RemoteObject _tf = RemoteObject.declareNull("B4ITextFieldWrapper");

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("Show (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,94);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = -1;
Debug.locals.put("_ref", __ref);
Debug.locals.put("Dialog", _dialog);
 BA.debugLineNum = 95;BA.debugLine="xDialog = Dialog";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xdialog" /*RemoteObject*/ ,_dialog);
 BA.debugLineNum = 96;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).setField ("_putattop" /*RemoteObject*/ ,BA.ObjectToBoolean(RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4A")) || RemoteObject.solveBoolean(".",__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4i"))));
 BA.debugLineNum = 97;BA.debugLine="Sleep(20)";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("Sleep:::",__ref.getField(false, "bi"),anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "b4xinputtemplate", "show"),BA.numberCast(int.class, 20));
this.state = 1;
return;
case 1:
//C
this.state = -1;
;
 BA.debugLineNum = 98;BA.debugLine="TextField1.Text = Text";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"setText:",__ref.getField(true,"_text" /*RemoteObject*/ ));
 BA.debugLineNum = 99;BA.debugLine="Validate(Text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xinputtemplate.class, "_validate:" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 100;BA.debugLine="TextField1.RequestFocus";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runVoidMethod ("RequestFocus");
 BA.debugLineNum = 106;BA.debugLine="Dim tf As TextField = TextField1";
Debug.JustUpdateDeviceLine();
_tf = RemoteObject.createNew ("B4ITextFieldWrapper");
_tf.setObject((__ref.getField(false,"_textfield1" /*RemoteObject*/ )).getObject());Debug.locals.put("tf", _tf);
 BA.debugLineNum = 107;BA.debugLine="tf.SelectAll";
Debug.JustUpdateDeviceLine();
_tf.runVoidMethod ("SelectAll");
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
public static RemoteObject  _textfield1_action(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TextField1_Action (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,81);
if (RapidSub.canDelegate("textfield1_action")) { return __ref.runUserSub(false, "b4xinputtemplate","textfield1_action", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Private Sub TextField1_Action";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="TextField1_EnterPressed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xinputtemplate.class, "_textfield1_enterpressed" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textfield1_enterpressed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TextField1_EnterPressed (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,85);
if (RapidSub.canDelegate("textfield1_enterpressed")) { return __ref.runUserSub(false, "b4xinputtemplate","textfield1_enterpressed", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Private Sub TextField1_EnterPressed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
Debug.JustUpdateDeviceLine();
if (__ref.runClassMethod (b4i_b4xinputtemplate.class, "_isvalid:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runMethod(true,"Text"))).getBoolean()) { 
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4i_b4xdialog.class, "_close:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"DialogResponse_Positive")));};
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _textfield1_textchanged(RemoteObject __ref,RemoteObject _old,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("TextField1_TextChanged (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,60);
if (RapidSub.canDelegate("textfield1_textchanged")) { return __ref.runUserSub(false, "b4xinputtemplate","textfield1_textchanged", __ref, _old, _new);}
Debug.locals.put("Old", _old);
Debug.locals.put("New", _new);
 BA.debugLineNum = 60;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="Validate (New)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_b4xinputtemplate.class, "_validate:" /*RemoteObject*/ ,(Object)(_new));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validate(RemoteObject __ref,RemoteObject _new) throws Exception{
try {
		Debug.PushSubsStack("Validate (b4xinputtemplate) ","b4xinputtemplate",16,__ref.getField(false, "bi"),__ref,64);
if (RapidSub.canDelegate("validate")) { return __ref.runUserSub(false, "b4xinputtemplate","validate", __ref, _new);}
RemoteObject _bordercolor = RemoteObject.createImmutable(0);
RemoteObject _enabled = RemoteObject.createImmutable(false);
Debug.locals.put("New", _new);
 BA.debugLineNum = 64;BA.debugLine="Private Sub Validate (New As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="Dim BorderColor As Int = xui.Color_White";
Debug.JustUpdateDeviceLine();
_bordercolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White");Debug.locals.put("BorderColor", _bordercolor);Debug.locals.put("BorderColor", _bordercolor);
 BA.debugLineNum = 66;BA.debugLine="Dim enabled As Boolean = True";
Debug.JustUpdateDeviceLine();
_enabled = b4i_main.__c.runMethod(true,"True");Debug.locals.put("enabled", _enabled);Debug.locals.put("enabled", _enabled);
 BA.debugLineNum = 67;BA.debugLine="If IsValid(New) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4i_b4xinputtemplate.class, "_isvalid:" /*RemoteObject*/ ,(Object)(_new)),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 68;BA.debugLine="If New.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_new.runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 69;BA.debugLine="BorderColor = xui.Color_Red";
Debug.JustUpdateDeviceLine();
_bordercolor = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Red");Debug.locals.put("BorderColor", _bordercolor);
 };
 BA.debugLineNum = 71;BA.debugLine="enabled = False";
Debug.JustUpdateDeviceLine();
_enabled = b4i_main.__c.runMethod(true,"False");Debug.locals.put("enabled", _enabled);
 };
 BA.debugLineNum = 73;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xdialog" /*RemoteObject*/ ).runClassMethod (b4i_b4xdialog.class, "_setbuttonstate::" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"DialogResponse_Positive")),(Object)(_enabled));
 BA.debugLineNum = 74;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textfield1" /*RemoteObject*/ ).runVoidMethod ("SetColorAndBorder::::",(Object)(__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_Transparent")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(_bordercolor),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
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