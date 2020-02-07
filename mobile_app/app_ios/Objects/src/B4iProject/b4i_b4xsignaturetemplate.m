
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_reporteordenes.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"
#import "b4i_animatedcounter.h"
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
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"


@implementation b4i_b4xsignaturetemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xsignaturetemplate) instance released.");
}

- (B4XViewWrapper*)  _getpanel:(b4i_b4xsignaturetemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=21430272;
 //BA.debugLineNum = 21430272;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=21430273;
 //BA.debugLineNum = 21430273;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=21430274;
 //BA.debugLineNum = 21430274;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _show:(b4i_b4xsignaturetemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=21495808;
 //BA.debugLineNum = 21495808;BA.debugLine="Private Sub Show (Dialog As B4XDialog) 'ignore";
B4IRDebugUtils.currentLine=21495809;
 //BA.debugLineNum = 21495809;BA.debugLine="cvs.DrawRect(cvs.TargetRect, BackgroundColor, Tru";
[__ref->__cvs /*B4XCanvas**/  DrawRect:[__ref->__cvs /*B4XCanvas**/  TargetRect] :__ref->__backgroundcolor /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=21495810;
 //BA.debugLineNum = 21495810;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=21495811;
 //BA.debugLineNum = 21495811;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _dialogclosed:(b4i_b4xsignaturetemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4XRect* _r = nil;
int _baseline = 0;
B4IRDebugUtils.currentLine=21692416;
 //BA.debugLineNum = 21692416;BA.debugLine="Private Sub DialogClosed (Result As Int)";
B4IRDebugUtils.currentLine=21692417;
 //BA.debugLineNum = 21692417;BA.debugLine="If Result = xui.DialogResponse_Positive And AddDa";
if (_result==[__ref->__xui /*B4IXUI**/  DialogResponse_Positive] && __ref->__adddateandtime /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=21692418;
 //BA.debugLineNum = 21692418;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(\"M\", TextFont";
_r = [B4XRect new];
_r = [__ref->__cvs /*B4XCanvas**/  MeasureText:@"M" :__ref->__textfont /*B4XFont**/ ];
B4IRDebugUtils.currentLine=21692419;
 //BA.debugLineNum = 21692419;BA.debugLine="Dim Baseline As Int = cvs.TargetRect.Bottom - r.";
_baseline = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Bottom]-[_r Height]-[_r Top]-((int) (2)));
B4IRDebugUtils.currentLine=21692420;
 //BA.debugLineNum = 21692420;BA.debugLine="cvs.DrawText($\"$DateTime{DateTime.Now}\"$, 2dip,";
[__ref->__cvs /*B4XCanvas**/  DrawText:([@[@"",[self->___c SmartStringFormatter:@"datetime" :(NSObject*)(@([[self->___c DateTime] Now]))],@""] componentsJoinedByString:@""]) :(float) (((int) (2))) :(float) (_baseline) :__ref->__textfont /*B4XFont**/  :__ref->__textcolor /*int*/  :@"LEFT"];
 };
B4IRDebugUtils.currentLine=21692422;
 //BA.debugLineNum = 21692422;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xsignaturetemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
B4IRDebugUtils.currentLine=21233664;
 //BA.debugLineNum = 21233664;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=21233665;
 //BA.debugLineNum = 21233665;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=21233666;
 //BA.debugLineNum = 21233666;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=21233667;
 //BA.debugLineNum = 21233667;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=21233668;
 //BA.debugLineNum = 21233668;BA.debugLine="Private LastX, LastY As Float";
self->__lastx = 0.0f;
self->__lasty = 0.0f;
B4IRDebugUtils.currentLine=21233669;
 //BA.debugLineNum = 21233669;BA.debugLine="Public StrokeWidth As Float = 2dip";
self->__strokewidth = (float) (((int) (2)));
B4IRDebugUtils.currentLine=21233670;
 //BA.debugLineNum = 21233670;BA.debugLine="Public StrokeColor As Int = xui.Color_Black";
self->__strokecolor = [__ref->__xui /*B4IXUI**/  Color_Black];
B4IRDebugUtils.currentLine=21233671;
 //BA.debugLineNum = 21233671;BA.debugLine="Public TextColor As Int = 0xFFFF8800";
self->__textcolor = (int) (0xffff8800);
B4IRDebugUtils.currentLine=21233672;
 //BA.debugLineNum = 21233672;BA.debugLine="Public BackgroundColor As Int = xui.Color_White";
self->__backgroundcolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=21233673;
 //BA.debugLineNum = 21233673;BA.debugLine="Public AddDateAndTime As Boolean = True";
self->__adddateandtime = true;
B4IRDebugUtils.currentLine=21233674;
 //BA.debugLineNum = 21233674;BA.debugLine="Public TextFont As B4XFont";
self->__textfont = [B4XFont new];
B4IRDebugUtils.currentLine=21233675;
 //BA.debugLineNum = 21233675;BA.debugLine="End Sub";
return @"";
}
- (B4XBitmapWrapper*)  _getbitmap:(b4i_b4xsignaturetemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"getbitmap"])
	 {return ((B4XBitmapWrapper*) [B4IDebug delegate:self.bi :@"getbitmap" :nil]);}
B4IRDebugUtils.currentLine=21626880;
 //BA.debugLineNum = 21626880;BA.debugLine="Public Sub getBitmap As B4XBitmap";
B4IRDebugUtils.currentLine=21626881;
 //BA.debugLineNum = 21626881;BA.debugLine="Return cvs.CreateBitmap";
if (true) return [__ref->__cvs /*B4XCanvas**/  CreateBitmap];
B4IRDebugUtils.currentLine=21626882;
 //BA.debugLineNum = 21626882;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_b4xsignaturetemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=21299200;
 //BA.debugLineNum = 21299200;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=21299201;
 //BA.debugLineNum = 21299201;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"mBase"];
B4IRDebugUtils.currentLine=21299202;
 //BA.debugLineNum = 21299202;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 200dip)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (((int) (200)))];
B4IRDebugUtils.currentLine=21299203;
 //BA.debugLineNum = 21299203;BA.debugLine="cvs.Initialize(mBase)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=21299204;
 //BA.debugLineNum = 21299204;BA.debugLine="TextFont = xui.CreateDefaultFont(14)";
__ref->__textfont /*B4XFont**/  = [__ref->__xui /*B4IXUI**/  CreateDefaultFont:(float) (14)];
B4IRDebugUtils.currentLine=21299205;
 //BA.debugLineNum = 21299205;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _mbase_touch:(b4i_b4xsignaturetemplate*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"mbase_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"mbase_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=21561344;
 //BA.debugLineNum = 21561344;BA.debugLine="Private Sub mBase_Touch (Action As Int, X As Float";
B4IRDebugUtils.currentLine=21561345;
 //BA.debugLineNum = 21561345;BA.debugLine="Select Action";
switch ([self.bi switchObjectToInt:@(_action) :@[@([__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_DOWN]),@([__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_MOVE])]]) {
case 0: {
B4IRDebugUtils.currentLine=21561347;
 //BA.debugLineNum = 21561347;BA.debugLine="LastX = X";
__ref->__lastx /*float*/  = _x;
B4IRDebugUtils.currentLine=21561348;
 //BA.debugLineNum = 21561348;BA.debugLine="LastY = Y";
__ref->__lasty /*float*/  = _y;
 break; }
case 1: {
B4IRDebugUtils.currentLine=21561350;
 //BA.debugLineNum = 21561350;BA.debugLine="cvs.DrawLine(LastX, LastY, X, Y, StrokeColor, S";
[__ref->__cvs /*B4XCanvas**/  DrawLine:__ref->__lastx /*float*/  :__ref->__lasty /*float*/  :_x :_y :__ref->__strokecolor /*int*/  :__ref->__strokewidth /*float*/ ];
B4IRDebugUtils.currentLine=21561351;
 //BA.debugLineNum = 21561351;BA.debugLine="LastX = X";
__ref->__lastx /*float*/  = _x;
B4IRDebugUtils.currentLine=21561352;
 //BA.debugLineNum = 21561352;BA.debugLine="LastY = Y";
__ref->__lasty /*float*/  = _y;
B4IRDebugUtils.currentLine=21561353;
 //BA.debugLineNum = 21561353;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
 break; }
}
;
B4IRDebugUtils.currentLine=21561355;
 //BA.debugLineNum = 21561355;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resize:(b4i_b4xsignaturetemplate*) __ref :(int) _width :(int) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsignaturetemplate";
if ([B4IDebug shouldDelegate: @"resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=21364736;
 //BA.debugLineNum = 21364736;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
B4IRDebugUtils.currentLine=21364737;
 //BA.debugLineNum = 21364737;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=21364738;
 //BA.debugLineNum = 21364738;BA.debugLine="cvs.Resize(Width, Height)";
[__ref->__cvs /*B4XCanvas**/  Resize:(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=21364739;
 //BA.debugLineNum = 21364739;BA.debugLine="End Sub";
return @"";
}
@end