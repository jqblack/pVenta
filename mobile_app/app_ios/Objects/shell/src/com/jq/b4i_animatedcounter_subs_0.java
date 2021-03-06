package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_animatedcounter_subs_0 {


public static RemoteObject  _base_resize(RemoteObject __ref,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Base_Resize (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,67);
if (RapidSub.canDelegate("base_resize")) { return __ref.runUserSub(false, "animatedcounter","base_resize", __ref, _width, _height);}
RemoteObject _columns = RemoteObject.createImmutable(0);
RemoteObject _bmp = RemoteObject.declareNull("B4XBitmapWrapper");
RemoteObject _left = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _iv = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 67;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 69;BA.debugLine="xfadeIv.SetLayoutAnimated(0, 0, 0, Width, Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xfadeiv" /*RemoteObject*/ ).runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 70;BA.debugLine="xfadeIv.SetBitmap(fade.Resize(Width, Height, Fals";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xfadeiv" /*RemoteObject*/ ).runVoidMethod ("SetBitmap:",(Object)(((__ref.getField(false,"_fade" /*RemoteObject*/ ).runMethod(false,"Resize:::",(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)),(Object)(b4i_main.__c.runMethod(true,"False")))).getObject())));
 BA.debugLineNum = 71;BA.debugLine="DigitHeight = Height";
Debug.JustUpdateDeviceLine();
__ref.setField ("_digitheight" /*RemoteObject*/ ,BA.numberCast(int.class, _height));
 BA.debugLineNum = 72;BA.debugLine="Dim Columns As Int = mdigits";
Debug.JustUpdateDeviceLine();
_columns = __ref.getField(true,"_mdigits" /*RemoteObject*/ );Debug.locals.put("Columns", _columns);Debug.locals.put("Columns", _columns);
 BA.debugLineNum = 73;BA.debugLine="DigitWidth = Width / Columns";
Debug.JustUpdateDeviceLine();
__ref.setField ("_digitwidth" /*RemoteObject*/ ,BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_width,_columns}, "/",0, 0)));
 BA.debugLineNum = 74;BA.debugLine="Dim bmp As B4XBitmap = CreateBitmap(lblTemplate)";
Debug.JustUpdateDeviceLine();
_bmp = RemoteObject.createNew ("B4XBitmapWrapper");
_bmp = __ref.runClassMethod (b4i_animatedcounter.class, "_createbitmap:" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lbltemplate" /*RemoteObject*/ )));Debug.locals.put("bmp", _bmp);Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 75;BA.debugLine="Dim left As Int = Width";
Debug.JustUpdateDeviceLine();
_left = BA.numberCast(int.class, _width);Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 76;BA.debugLine="For i = 0 To ImageViews.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_imageviews" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step9 > 0 && _i <= limit9) || (step9 < 0 && _i >= limit9) ;_i = ((int)(0 + _i + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 77;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("B4XViewWrapper");
_iv.setObject(__ref.getField(false,"_imageviews" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 79;BA.debugLine="left = left - DigitWidth";
Debug.JustUpdateDeviceLine();
_left = RemoteObject.solve(new RemoteObject[] {_left,__ref.getField(true,"_digitwidth" /*RemoteObject*/ )}, "-",1, 1);Debug.locals.put("left", _left);
 BA.debugLineNum = 80;BA.debugLine="iv.SetLayoutAnimated(0, left, TopFromValue(i), D";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, _left)),(Object)(BA.numberCast(float.class, __ref.runClassMethod (b4i_animatedcounter.class, "_topfromvalue:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.numberCast(float.class, __ref.getField(true,"_digitwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_digitheight" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "*",0, 1))));
 BA.debugLineNum = 81;BA.debugLine="iv.SetBitmap(bmp)";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("SetBitmap:",(Object)(((_bmp).getObject())));
 }
}Debug.locals.put("i", _i);
;
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 4;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 5;BA.debugLine="Private mEventName As String 'ignore";
b4i_animatedcounter._meventname = RemoteObject.createImmutable("");__ref.setField("_meventname",b4i_animatedcounter._meventname);
 //BA.debugLineNum = 6;BA.debugLine="Private mCallBack As Object 'ignore";
b4i_animatedcounter._mcallback = RemoteObject.createNew ("NSObject");__ref.setField("_mcallback",b4i_animatedcounter._mcallback);
 //BA.debugLineNum = 7;BA.debugLine="Public mBase As B4XView 'ignore";
b4i_animatedcounter._mbase = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_mbase",b4i_animatedcounter._mbase);
 //BA.debugLineNum = 8;BA.debugLine="Private xui As XUI 'ignore";
b4i_animatedcounter._xui = RemoteObject.createNew ("B4IXUI");__ref.setField("_xui",b4i_animatedcounter._xui);
 //BA.debugLineNum = 9;BA.debugLine="Private ImageViews As List";
b4i_animatedcounter._imageviews = RemoteObject.createNew ("B4IList");__ref.setField("_imageviews",b4i_animatedcounter._imageviews);
 //BA.debugLineNum = 10;BA.debugLine="Private mdigits As Int";
b4i_animatedcounter._mdigits = RemoteObject.createImmutable(0);__ref.setField("_mdigits",b4i_animatedcounter._mdigits);
 //BA.debugLineNum = 11;BA.debugLine="Private lblTemplate As B4XView";
b4i_animatedcounter._lbltemplate = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_lbltemplate",b4i_animatedcounter._lbltemplate);
 //BA.debugLineNum = 12;BA.debugLine="Private mValue As List";
b4i_animatedcounter._mvalue = RemoteObject.createNew ("B4IList");__ref.setField("_mvalue",b4i_animatedcounter._mvalue);
 //BA.debugLineNum = 13;BA.debugLine="Private DigitHeight, DigitWidth As Int";
b4i_animatedcounter._digitheight = RemoteObject.createImmutable(0);__ref.setField("_digitheight",b4i_animatedcounter._digitheight);
b4i_animatedcounter._digitwidth = RemoteObject.createImmutable(0);__ref.setField("_digitwidth",b4i_animatedcounter._digitwidth);
 //BA.debugLineNum = 14;BA.debugLine="Private mDuration As Int";
b4i_animatedcounter._mduration = RemoteObject.createImmutable(0);__ref.setField("_mduration",b4i_animatedcounter._mduration);
 //BA.debugLineNum = 15;BA.debugLine="Private fade As B4XBitmap";
b4i_animatedcounter._fade = RemoteObject.createNew ("B4XBitmapWrapper");__ref.setField("_fade",b4i_animatedcounter._fade);
 //BA.debugLineNum = 16;BA.debugLine="Private xfadeIv As B4XView";
b4i_animatedcounter._xfadeiv = RemoteObject.createNew ("B4XViewWrapper");__ref.setField("_xfadeiv",b4i_animatedcounter._xfadeiv);
 //BA.debugLineNum = 17;BA.debugLine="Public Tag As Object";
b4i_animatedcounter._tag = RemoteObject.createNew ("NSObject");__ref.setField("_tag",b4i_animatedcounter._tag);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createbitmap(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("CreateBitmap (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,90);
if (RapidSub.canDelegate("createbitmap")) { return __ref.runUserSub(false, "animatedcounter","createbitmap", __ref, _lbl);}
RemoteObject _p = RemoteObject.declareNull("B4XViewWrapper");
RemoteObject _cvs = RemoteObject.declareNull("B4XCanvas");
RemoteObject _r = RemoteObject.declareNull("B4XRect");
RemoteObject _baseline = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _res = RemoteObject.declareNull("B4XBitmapWrapper");
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 90;BA.debugLine="Private Sub CreateBitmap (lbl As B4XView) As B4XBi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("B4XViewWrapper");
_p = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("p", _p);Debug.locals.put("p", _p);
 BA.debugLineNum = 92;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, DigitWidth, DigitHei";
Debug.JustUpdateDeviceLine();
_p.runVoidMethod ("SetLayoutAnimated:::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, __ref.getField(true,"_digitwidth" /*RemoteObject*/ ))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_digitheight" /*RemoteObject*/ ),RemoteObject.createImmutable(10)}, "*",0, 1))));
 BA.debugLineNum = 93;BA.debugLine="Dim cvs As B4XCanvas";
Debug.JustUpdateDeviceLine();
_cvs = RemoteObject.createNew ("B4XCanvas");Debug.locals.put("cvs", _cvs);
 BA.debugLineNum = 94;BA.debugLine="cvs.Initialize(p)";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Initialize:",(Object)(((_p).getObject())));
 BA.debugLineNum = 95;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"5\", lbl.Font)";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("B4XRect");
_r = _cvs.runMethod(false,"MeasureText::",(Object)(BA.ObjectToString("5")),(Object)(_lbl.runMethod(false,"Font")));Debug.locals.put("r", _r);Debug.locals.put("r", _r);
 BA.debugLineNum = 96;BA.debugLine="Dim BaseLine As Int = DigitHeight / 2 - r.Height";
Debug.JustUpdateDeviceLine();
_baseline = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_digitheight" /*RemoteObject*/ ),RemoteObject.createImmutable(2),_r.runMethod(true,"Height"),RemoteObject.createImmutable(2),_r.runMethod(true,"Top")}, "/-/-",2, 0));Debug.locals.put("BaseLine", _baseline);Debug.locals.put("BaseLine", _baseline);
 BA.debugLineNum = 97;BA.debugLine="For i = 0 To 9";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = 9;
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 98;BA.debugLine="cvs.DrawText(i, DigitWidth / 2, i * DigitHeight";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("DrawText::::::",(Object)(BA.NumberToString(_i)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_digitwidth" /*RemoteObject*/ ),RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),__ref.getField(true,"_digitheight" /*RemoteObject*/ ),_baseline}, "*+",1, 1))),(Object)(_lbl.runMethod(false,"Font")),(Object)(_lbl.runMethod(true,"TextColor")),(Object)(RemoteObject.createImmutable("CENTER")));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 100;BA.debugLine="cvs.Invalidate";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Invalidate");
 BA.debugLineNum = 101;BA.debugLine="Dim res As B4XBitmap = cvs.CreateBitmap";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("B4XBitmapWrapper");
_res = _cvs.runMethod(false,"CreateBitmap");Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 102;BA.debugLine="cvs.Release";
Debug.JustUpdateDeviceLine();
_cvs.runVoidMethod ("Release");
 BA.debugLineNum = 103;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfadebitmap(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateFadeBitmap (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,54);
if (RapidSub.canDelegate("createfadebitmap")) { return __ref.runUserSub(false, "animatedcounter","createfadebitmap", __ref);}
RemoteObject _bc = RemoteObject.declareNull("b4i_bitmapcreator");
RemoteObject _r = RemoteObject.declareNull("B4XRect");
 BA.debugLineNum = 54;BA.debugLine="Private Sub CreateFadeBitmap As B4XBitmap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="Dim bc As BitmapCreator";
Debug.JustUpdateDeviceLine();
_bc = RemoteObject.createNew ("b4i_bitmapcreator");Debug.locals.put("bc", _bc);
 BA.debugLineNum = 56;BA.debugLine="bc.Initialize(200, 50)";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_initialize:::",__ref.getField(false, "bi"),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 50)));
 BA.debugLineNum = 57;BA.debugLine="Dim r As B4XRect";
Debug.JustUpdateDeviceLine();
_r = RemoteObject.createNew ("B4XRect");Debug.locals.put("r", _r);
 BA.debugLineNum = 58;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight / 3)";
Debug.JustUpdateDeviceLine();
_r.runVoidMethod ("Initialize::::",(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _bc.getField(true,"_mwidth"))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(3)}, "/",0, 0))));
 BA.debugLineNum = 59;BA.debugLine="bc.FillGradient(Array As Int(xui.Color_White, 0x0";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_fillgradient:::",(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"),BA.numberCast(int.class, 0x00ffffff)})),(Object)(_r),(Object)(RemoteObject.createImmutable("TOP_BOTTOM")));
 BA.debugLineNum = 60;BA.debugLine="r.Top = bc.mHeight * 2 / 3";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_bc.getField(true,"_mheight"),RemoteObject.createImmutable(2),RemoteObject.createImmutable(3)}, "*/",0, 0)));
 BA.debugLineNum = 61;BA.debugLine="r.Bottom = bc.mHeight";
Debug.JustUpdateDeviceLine();
_r.runMethod(true,"setBottom:",BA.numberCast(float.class, _bc.getField(true,"_mheight")));
 BA.debugLineNum = 62;BA.debugLine="bc.FillGradient(Array As Int(xui.Color_White, 0x0";
Debug.JustUpdateDeviceLine();
_bc.runVoidMethod ("_fillgradient:::",(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"Color_White"),BA.numberCast(int.class, 0x00ffffff)})),(Object)(_r),(Object)(RemoteObject.createImmutable("BOTTOM_TOP")));
 BA.debugLineNum = 63;BA.debugLine="Return bc.Bitmap";
Debug.JustUpdateDeviceLine();
if (true) return _bc.runMethod(false,"_getbitmap");
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
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
		Debug.PushSubsStack("DesignerCreateView (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,28);
if (RapidSub.canDelegate("designercreateview")) { return __ref.runUserSub(false, "animatedcounter","designercreateview", __ref, _base, _lbl, _props);}
RemoteObject _pnl = RemoteObject.declareNull("B4XViewWrapper");
int _i = 0;
RemoteObject _iv = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _fadeiv = RemoteObject.declareNull("B4IImageViewWrapper");
Debug.locals.put("Base", _base);
Debug.locals.put("lbl", _lbl);
Debug.locals.put("Props", _props);
 BA.debugLineNum = 28;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="mBase = Base";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).setObject (_base);
 BA.debugLineNum = 30;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tag" /*RemoteObject*/ ,__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"Tag"));
 BA.debugLineNum = 30;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"setTag:",__ref);
 BA.debugLineNum = 31;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\") 'needed";
Debug.JustUpdateDeviceLine();
_pnl = RemoteObject.createNew ("B4XViewWrapper");
_pnl = __ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(false,"CreatePanel::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("pnl", _pnl);Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 32;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runVoidMethod ("AddView:::::",(Object)(((_pnl).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 33;BA.debugLine="mdigits = Props.Get(\"Digits\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdigits" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("Digits"))))));
 BA.debugLineNum = 34;BA.debugLine="mDuration = Props.Get(\"Duration\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mduration" /*RemoteObject*/ ,BA.numberCast(int.class, _props.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("Duration"))))));
 BA.debugLineNum = 35;BA.debugLine="lblTemplate = lbl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbltemplate" /*RemoteObject*/ ).setObject ((_lbl).getObject());
 BA.debugLineNum = 36;BA.debugLine="fade = CreateFadeBitmap";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fade" /*RemoteObject*/ ,__ref.runClassMethod (b4i_animatedcounter.class, "_createfadebitmap" /*RemoteObject*/ ));
 BA.debugLineNum = 37;BA.debugLine="For i = 0 To mdigits - 1";
Debug.JustUpdateDeviceLine();
{
final int step10 = 1;
final int limit10 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mdigits" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 38;BA.debugLine="Dim iv As ImageView";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("iv", _iv);
 BA.debugLineNum = 39;BA.debugLine="iv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 40;BA.debugLine="ImageViews.Add(iv)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageviews" /*RemoteObject*/ ).runVoidMethod ("Add:",(Object)(((_iv).getObject())));
 BA.debugLineNum = 41;BA.debugLine="mBase.GetView(0).AddView(iv, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("AddView:::::",(Object)(((_iv).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 43;BA.debugLine="Dim fadeIv As ImageView";
Debug.JustUpdateDeviceLine();
_fadeiv = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("fadeIv", _fadeiv);
 BA.debugLineNum = 44;BA.debugLine="fadeIv.Initialize(\"\")";
Debug.JustUpdateDeviceLine();
_fadeiv.runVoidMethod ("Initialize::",__ref.getField(false, "bi"),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 45;BA.debugLine="xfadeIv = fadeIv";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xfadeiv" /*RemoteObject*/ ).setObject ((_fadeiv).getObject());
 BA.debugLineNum = 46;BA.debugLine="mBase.GetView(0).AddView(fadeIv, 0, 0, 0, 0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, 0))).runVoidMethod ("AddView:::::",(Object)(((_fadeiv).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 47;BA.debugLine="setValue(0)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_animatedcounter.class, "_setvalue:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 48;BA.debugLine="If xui.IsB4A Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_xui" /*RemoteObject*/ ).runMethod(true,"IsB4A").getBoolean()) { 
 BA.debugLineNum = 49;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_animatedcounter.class, "_base_resize::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Width"))),(Object)(BA.numberCast(double.class, __ref.getField(false,"_mbase" /*RemoteObject*/ ).runMethod(true,"Height"))));
 BA.debugLineNum = 50;BA.debugLine="setValue(getValue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4i_animatedcounter.class, "_setvalue:" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4i_animatedcounter.class, "_getvalue" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getvalue(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getValue (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,117);
if (RapidSub.canDelegate("getvalue")) { return __ref.runUserSub(false, "animatedcounter","getvalue", __ref);}
RemoteObject _res = RemoteObject.createImmutable(0);
int _i = 0;
 BA.debugLineNum = 117;BA.debugLine="Public Sub getValue As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="Dim res As Int";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 119;BA.debugLine="For i = 0 To mValue.Size - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_mvalue" /*RemoteObject*/ ).runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 120;BA.debugLine="res = res + mValue.Get(i) * Power(10, i)";
Debug.JustUpdateDeviceLine();
_res = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_res,BA.numberCast(double.class, __ref.getField(false,"_mvalue" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i)))),b4i_main.__c.runMethod(true,"Power::",(Object)(BA.numberCast(double.class, 10)),(Object)(BA.numberCast(double.class, _i)))}, "+*",1, 0));Debug.locals.put("res", _res);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 122;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "animatedcounter","initialize", __ref, _ba, _callback, _eventname);}
__ref.runVoidMethodAndSync("initializeClassModule");
Debug.locals.put("ba", _ba);
Debug.locals.put("Callback", _callback);
Debug.locals.put("EventName", _eventname);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="mEventName = EventName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_meventname" /*RemoteObject*/ ,_eventname);
 BA.debugLineNum = 22;BA.debugLine="mCallBack = Callback";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_callback);
 BA.debugLineNum = 23;BA.debugLine="ImageViews.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_imageviews" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="mValue.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mvalue" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("setValue (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,106);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "animatedcounter","setvalue", __ref, _v);}
int _i = 0;
RemoteObject _iv = RemoteObject.declareNull("B4XViewWrapper");
Debug.locals.put("v", _v);
 BA.debugLineNum = 106;BA.debugLine="Public Sub setValue(v As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="mValue.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mvalue" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 108;BA.debugLine="For i = 0 To mdigits - 1";
Debug.JustUpdateDeviceLine();
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_mdigits" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 109;BA.debugLine="mValue.Add(v Mod 10)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mvalue" /*RemoteObject*/ ).runVoidMethod ("Add:",(Object)((RemoteObject.solve(new RemoteObject[] {_v,RemoteObject.createImmutable(10)}, "%",0, 1))));
 BA.debugLineNum = 110;BA.debugLine="v = v / 10";
Debug.JustUpdateDeviceLine();
_v = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_v,RemoteObject.createImmutable(10)}, "/",0, 0));Debug.locals.put("v", _v);
 BA.debugLineNum = 111;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.createNew ("B4XViewWrapper");
_iv.setObject(__ref.getField(false,"_imageviews" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("iv", _iv);
 BA.debugLineNum = 112;BA.debugLine="iv.SetLayoutAnimated(mDuration, iv.Left, TopFrom";
Debug.JustUpdateDeviceLine();
_iv.runVoidMethod ("SetLayoutAnimated:::::",(Object)(__ref.getField(true,"_mduration" /*RemoteObject*/ )),(Object)(_iv.runMethod(true,"Left")),(Object)(BA.numberCast(float.class, __ref.runClassMethod (b4i_animatedcounter.class, "_topfromvalue:" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _i))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _iv.runMethod(true,"Width")))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Max::",(Object)(BA.numberCast(double.class, 1)),(Object)(BA.numberCast(double.class, _iv.runMethod(true,"Height")))))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _topfromvalue(RemoteObject __ref,RemoteObject _digit) throws Exception{
try {
		Debug.PushSubsStack("TopFromValue (animatedcounter) ","animatedcounter",8,__ref.getField(false, "bi"),__ref,85);
if (RapidSub.canDelegate("topfromvalue")) { return __ref.runUserSub(false, "animatedcounter","topfromvalue", __ref, _digit);}
RemoteObject _d = RemoteObject.createImmutable(0);
Debug.locals.put("Digit", _digit);
 BA.debugLineNum = 85;BA.debugLine="Private Sub TopFromValue (Digit As Int) As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Dim d As Int = mValue.Get(Digit)";
Debug.JustUpdateDeviceLine();
_d = BA.numberCast(int.class, __ref.getField(false,"_mvalue" /*RemoteObject*/ ).runMethod(false,"Get:",(Object)(_digit)));Debug.locals.put("d", _d);Debug.locals.put("d", _d);
 BA.debugLineNum = 87;BA.debugLine="Return -d * DigitHeight";
Debug.JustUpdateDeviceLine();
if (true) return BA.numberCast(int.class, -(double) (0 + _d.<Number>get().intValue())*(double) (0 + __ref.getField(true,"_digitheight" /*RemoteObject*/ ).<Number>get().intValue()));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}