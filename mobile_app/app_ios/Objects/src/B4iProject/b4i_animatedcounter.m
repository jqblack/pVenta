
#import "b4i_animatedcounter.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_reporteordenes.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"
#import "b4i_anotherprogressbar.h"
#import "b4i_b4xbreadcrumb.h"
#import "b4i_b4xcolortemplate.h"
#import "b4i_b4xcombobox.h"
#import "b4i_b4xdatetemplate.h"
#import "b4i_b4xdialog.h"
#import "b4i_b4xfloattextfield.h"
#import "b4i_b4xinputtemplate.h"
#import "b4i_b4xlisttemplate.h"
#import "b4i_b4xloadingindicator.h"
#import "b4i_b4xlongtexttemplate.h"
#import "b4i_b4xplusminus.h"
#import "b4i_b4xsearchtemplate.h"
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"


@implementation b4i_animatedcounter 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_animatedcounter) instance released.");
}

- (NSString*)  _base_resize:(b4i_animatedcounter*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
int _columns = 0;
B4XBitmapWrapper* _bmp = nil;
int _left = 0;
int _i = 0;
B4XViewWrapper* _iv = nil;
B4IRDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
[[__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)] SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="xfadeIv.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__xfadeiv /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="xfadeIv.SetBitmap(fade.Resize(Width, Height, Fals";
[__ref->__xfadeiv /*B4XViewWrapper**/  SetBitmap:(UIImage*)(([__ref->__fade /*B4XBitmapWrapper**/  Resize:(float) (_width) :(float) (_height) :false]).object)];
B4IRDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="DigitHeight = Height";
__ref->__digitheight /*int*/  = (int) (_height);
B4IRDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Dim Columns As Int = mdigits";
_columns = __ref->__mdigits /*int*/ ;
B4IRDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="DigitWidth = Width / Columns";
__ref->__digitwidth /*int*/  = (int) (_width/(double)_columns);
B4IRDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="Dim bmp As B4XBitmap = CreateBitmap(lblTemplate)";
_bmp = [B4XBitmapWrapper new];
_bmp = [__ref _createbitmap /*B4XBitmapWrapper**/ :nil :__ref->__lbltemplate /*B4XViewWrapper**/ ];
B4IRDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="Dim left As Int = Width";
_left = (int) (_width);
B4IRDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="For i = 0 To ImageViews.Size - 1";
{
const int step9 = 1;
const int limit9 = (int) ([__ref->__imageviews /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
B4IRDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = [B4XViewWrapper new];
_iv.object = (NSObject*)([__ref->__imageviews /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="left = left - DigitWidth";
_left = (int) (_left-__ref->__digitwidth /*int*/ );
B4IRDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="iv.SetLayoutAnimated(0, left, TopFromValue(i), D";
[_iv SetLayoutAnimated:(int) (0) :(float) (_left) :(float) ([__ref _topfromvalue /*int*/ :nil :_i]) :(float) (__ref->__digitwidth /*int*/ ) :(float) (__ref->__digitheight /*int*/ *10)];
B4IRDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="iv.SetBitmap(bmp)";
[_iv SetBitmap:(UIImage*)((_bmp).object)];
 }
};
B4IRDebugUtils.currentLine=8519696;
 //BA.debugLineNum = 8519696;BA.debugLine="End Sub";
return @"";
}
- (B4XBitmapWrapper*)  _createbitmap:(b4i_animatedcounter*) __ref :(B4XViewWrapper*) _lbl{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"createbitmap"])
	 {return ((B4XBitmapWrapper*) [B4IDebug delegate:self.bi :@"createbitmap:" :@[[B4I nilToNSNull:_lbl]]]);}
B4XViewWrapper* _p = nil;
B4XCanvas* _cvs = nil;
B4XRect* _r = nil;
int _baseline = 0;
int _i = 0;
B4XBitmapWrapper* _res = nil;
B4IRDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Private Sub CreateBitmap (lbl As B4XView) As B4XBi";
B4IRDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, DigitWidth, DigitHei";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (__ref->__digitwidth /*int*/ ) :(float) (__ref->__digitheight /*int*/ *10)];
B4IRDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Dim cvs As B4XCanvas";
_cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="cvs.Initialize(p)";
[_cvs Initialize:(UIView*)((_p).object)];
B4IRDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"5\", lbl.Font)";
_r = [B4XRect new];
_r = [_cvs MeasureText:@"5" :[_lbl Font]];
B4IRDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Dim BaseLine As Int = DigitHeight / 2 - r.Height";
_baseline = (int) (__ref->__digitheight /*int*/ /(double)2-[_r Height]/(double)2-[_r Top]);
B4IRDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="For i = 0 To 9";
{
const int step7 = 1;
const int limit7 = (int) (9);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
B4IRDebugUtils.currentLine=8650760;
 //BA.debugLineNum = 8650760;BA.debugLine="cvs.DrawText(i, DigitWidth / 2, i * DigitHeight";
[_cvs DrawText:[self.bi NumberToString:@(_i)] :(float) (__ref->__digitwidth /*int*/ /(double)2) :(float) (_i*__ref->__digitheight /*int*/ +_baseline) :[_lbl Font] :[_lbl TextColor] :@"CENTER"];
 }
};
B4IRDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="cvs.Invalidate";
[_cvs Invalidate];
B4IRDebugUtils.currentLine=8650763;
 //BA.debugLineNum = 8650763;BA.debugLine="Dim res As B4XBitmap = cvs.CreateBitmap";
_res = [B4XBitmapWrapper new];
_res = [_cvs CreateBitmap];
B4IRDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="cvs.Release";
[_cvs Release];
B4IRDebugUtils.currentLine=8650765;
 //BA.debugLineNum = 8650765;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="End Sub";
return nil;
}
- (int)  _topfromvalue:(b4i_animatedcounter*) __ref :(int) _digit{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"topfromvalue"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"topfromvalue:" :@[@(_digit)]]).intValue;}
int _d = 0;
B4IRDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Private Sub TopFromValue (Digit As Int) As Int";
B4IRDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Dim d As Int = mValue.Get(Digit)";
_d = [self.bi ObjectToNumber:[__ref->__mvalue /*B4IList**/  Get:_digit]].intValue;
B4IRDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Return -d * DigitHeight";
if (true) return (int) (-_d*__ref->__digitheight /*int*/ );
B4IRDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _class_globals:(b4i_animatedcounter*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"animatedcounter";
B4IRDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=8257540;
 //BA.debugLineNum = 8257540;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="Private ImageViews As List";
self->__imageviews = [B4IList new];
B4IRDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="Private mdigits As Int";
self->__mdigits = 0;
B4IRDebugUtils.currentLine=8257543;
 //BA.debugLineNum = 8257543;BA.debugLine="Private lblTemplate As B4XView";
self->__lbltemplate = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="Private mValue As List";
self->__mvalue = [B4IList new];
B4IRDebugUtils.currentLine=8257545;
 //BA.debugLineNum = 8257545;BA.debugLine="Private DigitHeight, DigitWidth As Int";
self->__digitheight = 0;
self->__digitwidth = 0;
B4IRDebugUtils.currentLine=8257546;
 //BA.debugLineNum = 8257546;BA.debugLine="Private mDuration As Int";
self->__mduration = 0;
B4IRDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="Private fade As B4XBitmap";
self->__fade = [B4XBitmapWrapper new];
B4IRDebugUtils.currentLine=8257548;
 //BA.debugLineNum = 8257548;BA.debugLine="Private xfadeIv As B4XView";
self->__xfadeiv = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=8257550;
 //BA.debugLineNum = 8257550;BA.debugLine="End Sub";
return @"";
}
- (B4XBitmapWrapper*)  _createfadebitmap:(b4i_animatedcounter*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"createfadebitmap"])
	 {return ((B4XBitmapWrapper*) [B4IDebug delegate:self.bi :@"createfadebitmap" :nil]);}
b4i_bitmapcreator* _bc = nil;
B4XRect* _r = nil;
B4IRDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Private Sub CreateFadeBitmap As B4XBitmap";
B4IRDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="Dim bc As BitmapCreator";
_bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="bc.Initialize(200, 50)";
[_bc _initialize:self.bi :(int) (200) :(int) (50)];
B4IRDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight / 3)";
[_r Initialize:(float) (0) :(float) (0) :(float) (_bc->__mwidth) :(float) (_bc->__mheight/(double)3)];
B4IRDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="bc.FillGradient(Array As Int(xui.Color_White, 0x0";
[_bc _fillgradient:[[B4IArray alloc]initObjectsWithData:@[@([__ref->__xui /*B4IXUI**/  Color_White]),@((int) (0x00ffffff))]] :_r :@"TOP_BOTTOM"];
B4IRDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="r.Top = bc.mHeight * 2 / 3";
[_r setTop:(float) (_bc->__mheight*2/(double)3)];
B4IRDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="r.Bottom = bc.mHeight";
[_r setBottom:(float) (_bc->__mheight)];
B4IRDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="bc.FillGradient(Array As Int(xui.Color_White, 0x0";
[_bc _fillgradient:[[B4IArray alloc]initObjectsWithData:@[@([__ref->__xui /*B4IXUI**/  Color_White]),@((int) (0x00ffffff))]] :_r :@"BOTTOM_TOP"];
B4IRDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="Return bc.Bitmap";
if (true) return [_bc _getbitmap];
B4IRDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _designercreateview:(b4i_animatedcounter*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _pnl = nil;
int _i = 0;
B4IImageViewWrapper* _iv = nil;
B4IImageViewWrapper* _fadeiv = nil;
B4IRDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
B4IRDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"\") 'needed";
_pnl = [B4XViewWrapper new];
_pnl = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_pnl).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="mdigits = Props.Get(\"Digits\")";
__ref->__mdigits /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"Digits")]].intValue;
B4IRDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="mDuration = Props.Get(\"Duration\")";
__ref->__mduration /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"Duration")]].intValue;
B4IRDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="lblTemplate = lbl";
__ref->__lbltemplate /*B4XViewWrapper**/ .object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="fade = CreateFadeBitmap";
__ref->__fade /*B4XBitmapWrapper**/  = [__ref _createfadebitmap /*B4XBitmapWrapper**/ :nil];
B4IRDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="For i = 0 To mdigits - 1";
{
const int step10 = 1;
const int limit10 = (int) (__ref->__mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
B4IRDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="Dim iv As ImageView";
_iv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="iv.Initialize(\"\")";
[_iv Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="ImageViews.Add(iv)";
[__ref->__imageviews /*B4IList**/  Add:(NSObject*)((_iv).object)];
B4IRDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="mBase.GetView(0).AddView(iv, 0, 0, 0, 0)";
[[__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)] AddView:(UIView*)((_iv).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
 }
};
B4IRDebugUtils.currentLine=8388623;
 //BA.debugLineNum = 8388623;BA.debugLine="Dim fadeIv As ImageView";
_fadeiv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=8388624;
 //BA.debugLineNum = 8388624;BA.debugLine="fadeIv.Initialize(\"\")";
[_fadeiv Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="xfadeIv = fadeIv";
__ref->__xfadeiv /*B4XViewWrapper**/ .object = (NSObject*)((_fadeiv).object);
B4IRDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="mBase.GetView(0).AddView(fadeIv, 0, 0, 0, 0)";
[[__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)] AddView:(UIView*)((_fadeiv).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="setValue(0)";
[__ref _setvalue /*NSString**/ :nil :(int) (0)];
B4IRDebugUtils.currentLine=8388628;
 //BA.debugLineNum = 8388628;BA.debugLine="If xui.IsB4A Then";
if ([__ref->__xui /*B4IXUI**/  IsB4A]) { 
B4IRDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=8388630;
 //BA.debugLineNum = 8388630;BA.debugLine="setValue(getValue)";
[__ref _setvalue /*NSString**/ :nil :[__ref _getvalue /*int*/ :nil]];
 };
B4IRDebugUtils.currentLine=8388632;
 //BA.debugLineNum = 8388632;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvalue:(b4i_animatedcounter*) __ref :(int) _v{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"setvalue"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvalue:" :@[@(_v)]]);}
int _i = 0;
B4XViewWrapper* _iv = nil;
B4IRDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Public Sub setValue(v As Int)";
B4IRDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="mValue.Clear";
[__ref->__mvalue /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="For i = 0 To mdigits - 1";
{
const int step2 = 1;
const int limit2 = (int) (__ref->__mdigits /*int*/ -1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
B4IRDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="mValue.Add(v Mod 10)";
[__ref->__mvalue /*B4IList**/  Add:(NSObject*)(@(_v%10))];
B4IRDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="v = v / 10";
_v = (int) (_v/(double)10);
B4IRDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Dim iv As B4XView = ImageViews.Get(i)";
_iv = [B4XViewWrapper new];
_iv.object = (NSObject*)([__ref->__imageviews /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="iv.SetLayoutAnimated(mDuration, iv.Left, TopFrom";
[_iv SetLayoutAnimated:__ref->__mduration /*int*/  :[_iv Left] :(float) ([__ref _topfromvalue /*int*/ :nil :_i]) :(float) (fmax(1,[_iv Width])) :(float) (fmax(1,[_iv Height]))];
 }
};
B4IRDebugUtils.currentLine=8716297;
 //BA.debugLineNum = 8716297;BA.debugLine="End Sub";
return @"";
}
- (int)  _getvalue:(b4i_animatedcounter*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"getvalue"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getvalue" :nil]).intValue;}
int _res = 0;
int _i = 0;
B4IRDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Public Sub getValue As Int";
B4IRDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim res As Int";
_res = 0;
B4IRDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="For i = 0 To mValue.Size - 1";
{
const int step2 = 1;
const int limit2 = (int) ([__ref->__mvalue /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
B4IRDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="res = res + mValue.Get(i) * Power(10, i)";
_res = (int) (_res+[self.bi ObjectToNumber:[__ref->__mvalue /*B4IList**/  Get:_i]].doubleValue*pow(10,_i));
 }
};
B4IRDebugUtils.currentLine=8781829;
 //BA.debugLineNum = 8781829;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=8781830;
 //BA.debugLineNum = 8781830;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_animatedcounter*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"animatedcounter";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="ImageViews.Initialize";
[__ref->__imageviews /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="mValue.Initialize";
[__ref->__mvalue /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=8323077;
 //BA.debugLineNum = 8323077;BA.debugLine="End Sub";
return @"";
}
@end