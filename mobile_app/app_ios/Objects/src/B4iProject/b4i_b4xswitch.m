
#import "b4i_b4xswitch.h"
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
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"

@interface ResumableSub_b4xswitch_SetValueImpl :B4IResumableSub 
- (instancetype) init: (b4i_b4xswitch*) parent1 :(b4i_b4xswitch*) __ref1 :(BOOL) _b1 :(BOOL) _immediate1;
@end
@implementation ResumableSub_b4xswitch_SetValueImpl {
b4i_b4xswitch* parent;
b4i_b4xswitch* __ref;
BOOL _b;
BOOL _immediate;
int _myindex;
long long _start;
int _duration;
float _state1;
}
- (instancetype) init: (b4i_b4xswitch*) parent1 :(b4i_b4xswitch*) __ref1 :(BOOL) _b1 :(BOOL) _immediate1 {
self->__ref = __ref1;
self->_b = _b1;
self->_immediate = _immediate1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xswitch* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xswitch";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=22020097;
 //BA.debugLineNum = 22020097;BA.debugLine="mValue = b";
__ref->__mvalue /*BOOL*/  = _b;
B4IRDebugUtils.currentLine=22020098;
 //BA.debugLineNum = 22020098;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref->__loopindex /*int*/  = (int) (__ref->__loopindex /*int*/ +1);
B4IRDebugUtils.currentLine=22020099;
 //BA.debugLineNum = 22020099;BA.debugLine="If Immediate Then";
if (true) break;

case 1:
//if
self->_state = 41;
if (_immediate) { 
self->_state = 3;
}else {
self->_state = 13;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=22020100;
 //BA.debugLineNum = 22020100;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 4:
//if
self->_state = 11;
if (__ref->__mvalue /*BOOL*/ ) { 
self->_state = 6;
;}
else {
self->_state = 8;
;}if (true) break;

case 6:
//C
self->_state = 11;
[__ref _draw /*NSString**/ :nil :(float) (1)];
if (true) break;

case 8:
//C
self->_state = 11;
[__ref _draw /*NSString**/ :nil :(float) (0)];
if (true) break;

case 11:
//C
self->_state = 41;
;
 if (true) break;

case 13:
//C
self->_state = 14;
B4IRDebugUtils.currentLine=22020102;
 //BA.debugLineNum = 22020102;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref->__loopindex /*int*/ ;
B4IRDebugUtils.currentLine=22020103;
 //BA.debugLineNum = 22020103;BA.debugLine="Dim start As Long = DateTime.Now";
_start = [[parent->___c DateTime] Now];
B4IRDebugUtils.currentLine=22020104;
 //BA.debugLineNum = 22020104;BA.debugLine="Dim duration As Int = 200";
_duration = (int) (200);
B4IRDebugUtils.currentLine=22020105;
 //BA.debugLineNum = 22020105;BA.debugLine="Do While DateTime.Now < start + duration";
if (true) break;

case 14:
//do while
self->_state = 29;
while ([[parent->___c DateTime] Now]<_start+_duration) {
self->_state = 16;
if (true) break;
}
if (true) break;

case 16:
//C
self->_state = 17;
B4IRDebugUtils.currentLine=22020106;
 //BA.debugLineNum = 22020106;BA.debugLine="Dim state1 As Float = (DateTime.Now - start) /";
_state1 = (float) (([[parent->___c DateTime] Now]-_start)/(double)_duration);
B4IRDebugUtils.currentLine=22020107;
 //BA.debugLineNum = 22020107;BA.debugLine="If mValue = False Then state1 = 1 - state1";
if (true) break;

case 17:
//if
self->_state = 22;
if (__ref->__mvalue /*BOOL*/ ==false) { 
self->_state = 19;
;}if (true) break;

case 19:
//C
self->_state = 22;
_state1 = (float) (1-_state1);
if (true) break;

case 22:
//C
self->_state = 23;
;
B4IRDebugUtils.currentLine=22020108;
 //BA.debugLineNum = 22020108;BA.debugLine="Draw(state1)";
[__ref _draw /*NSString**/ :nil :_state1];
B4IRDebugUtils.currentLine=22020109;
 //BA.debugLineNum = 22020109;BA.debugLine="Sleep(16)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xswitch" :@"setvalueimpl"] :(int) (16)];
self->_state = 42;
return;
case 42:
//C
self->_state = 23;
;
B4IRDebugUtils.currentLine=22020110;
 //BA.debugLineNum = 22020110;BA.debugLine="If MyIndex <> LoopIndex Then Exit";
if (true) break;

case 23:
//if
self->_state = 28;
if (_myindex!=__ref->__loopindex /*int*/ ) { 
self->_state = 25;
;}if (true) break;

case 25:
//C
self->_state = 28;
self->_state = 29;
if (true) break;
if (true) break;

case 28:
//C
self->_state = 14;
;
 if (true) break;
;
B4IRDebugUtils.currentLine=22020112;
 //BA.debugLineNum = 22020112;BA.debugLine="If MyIndex = LoopIndex Then";

case 29:
//if
self->_state = 40;
if (_myindex==__ref->__loopindex /*int*/ ) { 
self->_state = 31;
}if (true) break;

case 31:
//C
self->_state = 32;
B4IRDebugUtils.currentLine=22020113;
 //BA.debugLineNum = 22020113;BA.debugLine="If mValue Then Draw(1) Else Draw(0)";
if (true) break;

case 32:
//if
self->_state = 39;
if (__ref->__mvalue /*BOOL*/ ) { 
self->_state = 34;
;}
else {
self->_state = 36;
;}if (true) break;

case 34:
//C
self->_state = 39;
[__ref _draw /*NSString**/ :nil :(float) (1)];
if (true) break;

case 36:
//C
self->_state = 39;
[__ref _draw /*NSString**/ :nil :(float) (0)];
if (true) break;

case 39:
//C
self->_state = 40;
;
 if (true) break;

case 40:
//C
self->_state = 41;
;
 if (true) break;

case 41:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=22020116;
 //BA.debugLineNum = 22020116;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xswitch 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xswitch) instance released.");
}

- (NSString*)  _base_resize:(b4i_b4xswitch*) __ref :(double) _width1 :(double) _height1{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width1),@(_height1)]]);}
B4IRDebugUtils.currentLine=22413312;
 //BA.debugLineNum = 22413312;BA.debugLine="Private Sub Base_Resize (Width1 As Double, Height1";
B4IRDebugUtils.currentLine=22413314;
 //BA.debugLineNum = 22413314;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xswitch*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xswitch";
B4IRDebugUtils.currentLine=21757952;
 //BA.debugLineNum = 21757952;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=21757953;
 //BA.debugLineNum = 21757953;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=21757954;
 //BA.debugLineNum = 21757954;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=21757955;
 //BA.debugLineNum = 21757955;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=21757956;
 //BA.debugLineNum = 21757956;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=21757957;
 //BA.debugLineNum = 21757957;BA.debugLine="Private OnColor, OffColor As BCBrush";
self->__oncolor = [_bcbrush new];
self->__offcolor = [_bcbrush new];
B4IRDebugUtils.currentLine=21757958;
 //BA.debugLineNum = 21757958;BA.debugLine="Private bc As BitmapCreator";
self->__bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=21757959;
 //BA.debugLineNum = 21757959;BA.debugLine="Private Width As Int = 55dip";
self->__width = ((int) (55));
B4IRDebugUtils.currentLine=21757960;
 //BA.debugLineNum = 21757960;BA.debugLine="Private Height As Int = 31dip";
self->__height = ((int) (31));
B4IRDebugUtils.currentLine=21757961;
 //BA.debugLineNum = 21757961;BA.debugLine="Private ThumbColor As BCBrush";
self->__thumbcolor = [_bcbrush new];
B4IRDebugUtils.currentLine=21757962;
 //BA.debugLineNum = 21757962;BA.debugLine="Private iv As ImageView";
self->__iv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=21757963;
 //BA.debugLineNum = 21757963;BA.debugLine="Private mValue As Boolean";
self->__mvalue = false;
B4IRDebugUtils.currentLine=21757964;
 //BA.debugLineNum = 21757964;BA.debugLine="Private transparent As BCBrush";
self->__transparent = [_bcbrush new];
B4IRDebugUtils.currentLine=21757965;
 //BA.debugLineNum = 21757965;BA.debugLine="Private LoopIndex As Int";
self->__loopindex = 0;
B4IRDebugUtils.currentLine=21757966;
 //BA.debugLineNum = 21757966;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=21757967;
 //BA.debugLineNum = 21757967;BA.debugLine="Private Scale As Float";
self->__scale = 0.0f;
B4IRDebugUtils.currentLine=21757968;
 //BA.debugLineNum = 21757968;BA.debugLine="Private mEnabled As Boolean = True";
self->__menabled = true;
B4IRDebugUtils.currentLine=21757969;
 //BA.debugLineNum = 21757969;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xswitch*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _pnl = nil;
B4IRDebugUtils.currentLine=21889024;
 //BA.debugLineNum = 21889024;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=21889025;
 //BA.debugLineNum = 21889025;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=21889026;
 //BA.debugLineNum = 21889026;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=21889027;
 //BA.debugLineNum = 21889027;BA.debugLine="mBase.SetLayoutAnimated(0, mBase.Left, mBase.Top,";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :[__ref->__mbase /*B4XViewWrapper**/  Left] :[__ref->__mbase /*B4XViewWrapper**/  Top] :(float) (__ref->__width /*int*/ ) :(float) (__ref->__height /*int*/ )];
B4IRDebugUtils.currentLine=21889028;
 //BA.debugLineNum = 21889028;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=21889029;
 //BA.debugLineNum = 21889029;BA.debugLine="Dim pnl As B4XView = xui.CreatePanel(\"pnl\")";
_pnl = [B4XViewWrapper new];
_pnl = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"pnl"];
B4IRDebugUtils.currentLine=21889030;
 //BA.debugLineNum = 21889030;BA.debugLine="pnl.Color = xui.Color_Transparent";
[_pnl setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=21889031;
 //BA.debugLineNum = 21889031;BA.debugLine="iv.Initialize(\"\")";
[__ref->__iv /*B4IImageViewWrapper**/  Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=21889032;
 //BA.debugLineNum = 21889032;BA.debugLine="mBase.AddView(iv, 0, 0, Width, Height)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__iv /*B4IImageViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (__ref->__width /*int*/ ) :(float) (__ref->__height /*int*/ )];
B4IRDebugUtils.currentLine=21889033;
 //BA.debugLineNum = 21889033;BA.debugLine="mBase.AddView(pnl, 0, 0, Width, Height)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_pnl).object) :(float) (0) :(float) (0) :(float) (__ref->__width /*int*/ ) :(float) (__ref->__height /*int*/ )];
B4IRDebugUtils.currentLine=21889038;
 //BA.debugLineNum = 21889038;BA.debugLine="Scale = GetDeviceLayoutValues.NonnormalizedScale";
__ref->__scale /*float*/  = [[self->___c GetDeviceLayoutValues] NonnormalizedScale];
B4IRDebugUtils.currentLine=21889039;
 //BA.debugLineNum = 21889039;BA.debugLine="bc.Initialize(Round(Width * Scale), Round(Height";
[__ref->__bc /*b4i_bitmapcreator**/  _initialize:self.bi :(int) (((double)lrint(__ref->__width /*int*/ *__ref->__scale /*float*/ ))) :(int) (((double)lrint(__ref->__height /*int*/ *__ref->__scale /*float*/ )))];
B4IRDebugUtils.currentLine=21889041;
 //BA.debugLineNum = 21889041;BA.debugLine="OnColor = bc.CreateBrushFromColor(xui.PaintOrColo";
__ref->__oncolor /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfromcolor:[__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"OnColor")]]];
B4IRDebugUtils.currentLine=21889042;
 //BA.debugLineNum = 21889042;BA.debugLine="OffColor = bc.CreateBrushFromColor(xui.PaintOrCol";
__ref->__offcolor /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfromcolor:[__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"OffColor")]]];
B4IRDebugUtils.currentLine=21889043;
 //BA.debugLineNum = 21889043;BA.debugLine="ThumbColor = bc.CreateBrushFromColor(xui.PaintOrC";
__ref->__thumbcolor /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfromcolor:[__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"ThumbColor")]]];
B4IRDebugUtils.currentLine=21889044;
 //BA.debugLineNum = 21889044;BA.debugLine="transparent = bc.CreateBrushFromColor(xui.Color_T";
__ref->__transparent /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfromcolor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=21889045;
 //BA.debugLineNum = 21889045;BA.debugLine="mEnabled = mBase.Enabled";
__ref->__menabled /*BOOL*/  = [__ref->__mbase /*B4XViewWrapper**/  Enabled];
B4IRDebugUtils.currentLine=21889046;
 //BA.debugLineNum = 21889046;BA.debugLine="mBase.Enabled = True";
[__ref->__mbase /*B4XViewWrapper**/  setEnabled:true];
B4IRDebugUtils.currentLine=21889047;
 //BA.debugLineNum = 21889047;BA.debugLine="SetValueImpl(Props.Get(\"Value\"), True)";
[__ref _setvalueimpl /*void*/ :nil :[self.bi ObjectToBoolean:[_props Get:(NSObject*)(@"Value")]] :true];
B4IRDebugUtils.currentLine=21889048;
 //BA.debugLineNum = 21889048;BA.debugLine="End Sub";
return @"";
}
- (void)  _setvalueimpl:(b4i_b4xswitch*) __ref :(BOOL) _b :(BOOL) _immediate{
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"setvalueimpl"])
	 {[B4IDebug delegate:self.bi :@"setvalueimpl::" :@[@(_b),@(_immediate)]]; return;}
ResumableSub_b4xswitch_SetValueImpl* rsub = [[ResumableSub_b4xswitch_SetValueImpl alloc] init:self : __ref: _b: _immediate];
[rsub resume:self.bi :nil];
}
//1205112280
- (NSString*)  _draw:(b4i_b4xswitch*) __ref :(float) _state{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"draw"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw:" :@[@(_state)]]);}
float _r = 0.0f;
float _cx = 0.0f;
int _cy = 0;
B4XRect* _smallrect = nil;
float _w = 0.0f;
float _h = 0.0f;
B4IRDebugUtils.currentLine=22347776;
 //BA.debugLineNum = 22347776;BA.debugLine="Private Sub Draw (State As Float)";
B4IRDebugUtils.currentLine=22347777;
 //BA.debugLineNum = 22347777;BA.debugLine="bc.DrawRect2(bc.TargetRect, transparent, True, 0)";
[__ref->__bc /*b4i_bitmapcreator**/  _drawrect2:__ref->__bc /*b4i_bitmapcreator**/ ->__targetrect :__ref->__transparent /*_bcbrush**/  :true :(int) (0)];
B4IRDebugUtils.currentLine=22347778;
 //BA.debugLineNum = 22347778;BA.debugLine="Dim r As Float = Round(bc.mHeight / 2)";
_r = (float) (((double)lrint(__ref->__bc /*b4i_bitmapcreator**/ ->__mheight/(double)2)));
B4IRDebugUtils.currentLine=22347779;
 //BA.debugLineNum = 22347779;BA.debugLine="Dim cx As Float = r - 1 * Scale + (bc.mWidth - 2";
_cx = (float) (_r-1*__ref->__scale /*float*/ +(__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth-2*_r)*_state);
B4IRDebugUtils.currentLine=22347780;
 //BA.debugLineNum = 22347780;BA.debugLine="If State = 0 Then";
if (_state==0) { 
B4IRDebugUtils.currentLine=22347781;
 //BA.debugLineNum = 22347781;BA.debugLine="cx = r";
_cx = _r;
 }else if(_state==1) { 
B4IRDebugUtils.currentLine=22347783;
 //BA.debugLineNum = 22347783;BA.debugLine="cx = Round(bc.mWidth - 1 * Scale - r)";
_cx = (float) (((double)lrint(__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth-1*__ref->__scale /*float*/ -_r)));
 };
B4IRDebugUtils.currentLine=22347785;
 //BA.debugLineNum = 22347785;BA.debugLine="Dim cy As Int = bc.mHeight / 2";
_cy = (int) (__ref->__bc /*b4i_bitmapcreator**/ ->__mheight/(double)2);
B4IRDebugUtils.currentLine=22347786;
 //BA.debugLineNum = 22347786;BA.debugLine="Dim smallrect As B4XRect";
_smallrect = [B4XRect new];
B4IRDebugUtils.currentLine=22347787;
 //BA.debugLineNum = 22347787;BA.debugLine="Dim w As Float = State * bc.mWidth";
_w = (float) (_state*__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth);
B4IRDebugUtils.currentLine=22347788;
 //BA.debugLineNum = 22347788;BA.debugLine="Dim h As Float = State * bc.mHeight";
_h = (float) (_state*__ref->__bc /*b4i_bitmapcreator**/ ->__mheight);
B4IRDebugUtils.currentLine=22347789;
 //BA.debugLineNum = 22347789;BA.debugLine="If State < 1 Then bc.DrawRectRounded2(bc.TargetRe";
if (_state<1) { 
[__ref->__bc /*b4i_bitmapcreator**/  _drawrectrounded2:__ref->__bc /*b4i_bitmapcreator**/ ->__targetrect :__ref->__offcolor /*_bcbrush**/  :true :(int) (2*__ref->__scale /*float*/ ) :(int) (_r)];};
B4IRDebugUtils.currentLine=22347790;
 //BA.debugLineNum = 22347790;BA.debugLine="smallrect.Initialize(bc.mWidth / 2 - w / 2, cy -";
[_smallrect Initialize:(float) (__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth/(double)2-_w/(double)2) :(float) (_cy-_h/(double)2) :(float) (__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth/(double)2+_w/(double)2) :(float) (_cy+_h/(double)2)];
B4IRDebugUtils.currentLine=22347791;
 //BA.debugLineNum = 22347791;BA.debugLine="If State > 0 Then bc.DrawRectRounded2(smallrect,";
if (_state>0) { 
[__ref->__bc /*b4i_bitmapcreator**/  _drawrectrounded2:_smallrect :__ref->__oncolor /*_bcbrush**/  :true :(int) (2*__ref->__scale /*float*/ ) :(int) ([_smallrect Height]/(double)2)];};
B4IRDebugUtils.currentLine=22347792;
 //BA.debugLineNum = 22347792;BA.debugLine="If mEnabled Then";
if (__ref->__menabled /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=22347793;
 //BA.debugLineNum = 22347793;BA.debugLine="bc.DrawCircle2(cx, cy, r - 2 * Scale, ThumbColor";
[__ref->__bc /*b4i_bitmapcreator**/  _drawcircle2:_cx :(float) (_cy) :(float) (_r-2*__ref->__scale /*float*/ ) :__ref->__thumbcolor /*_bcbrush**/  :true :(int) (0)];
 };
B4IRDebugUtils.currentLine=22347795;
 //BA.debugLineNum = 22347795;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, iv)";
[__ref->__bc /*b4i_bitmapcreator**/  _setbitmaptoimageview:[__ref->__bc /*b4i_bitmapcreator**/  _getbitmap] :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((__ref->__iv /*B4IImageViewWrapper**/ ).object)]];
B4IRDebugUtils.currentLine=22347796;
 //BA.debugLineNum = 22347796;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _getenabled:(b4i_b4xswitch*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"getenabled"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getenabled" :nil]).boolValue;}
B4IRDebugUtils.currentLine=22282240;
 //BA.debugLineNum = 22282240;BA.debugLine="Public Sub getEnabled As Boolean";
B4IRDebugUtils.currentLine=22282241;
 //BA.debugLineNum = 22282241;BA.debugLine="Return mEnabled";
if (true) return __ref->__menabled /*BOOL*/ ;
B4IRDebugUtils.currentLine=22282242;
 //BA.debugLineNum = 22282242;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _getvalue:(b4i_b4xswitch*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"getvalue"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getvalue" :nil]).boolValue;}
B4IRDebugUtils.currentLine=22151168;
 //BA.debugLineNum = 22151168;BA.debugLine="Public Sub getValue As Boolean";
B4IRDebugUtils.currentLine=22151169;
 //BA.debugLineNum = 22151169;BA.debugLine="Return mValue";
if (true) return __ref->__mvalue /*BOOL*/ ;
B4IRDebugUtils.currentLine=22151170;
 //BA.debugLineNum = 22151170;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _initialize:(b4i_b4xswitch*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=21823488;
 //BA.debugLineNum = 21823488;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=21823489;
 //BA.debugLineNum = 21823489;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=21823490;
 //BA.debugLineNum = 21823490;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=21823491;
 //BA.debugLineNum = 21823491;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pnl_click:(b4i_b4xswitch*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"pnl_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pnl_click" :nil]);}
B4IRDebugUtils.currentLine=21954560;
 //BA.debugLineNum = 21954560;BA.debugLine="Private Sub pnl_Click";
B4IRDebugUtils.currentLine=21954562;
 //BA.debugLineNum = 21954562;BA.debugLine="If mEnabled Then";
if (__ref->__menabled /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=21954563;
 //BA.debugLineNum = 21954563;BA.debugLine="SetValueImpl(Not(mValue), False)";
[__ref _setvalueimpl /*void*/ :nil :(!(__ref->__mvalue /*BOOL*/ )) :false];
B4IRDebugUtils.currentLine=21954564;
 //BA.debugLineNum = 21954564;BA.debugLine="CallSubDelayed2(mCallBack, mEventName & \"_ValueC";
[self->___c CallSubDelayed2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_ValueChanged"] componentsJoinedByString:@""] :(NSObject*)(@(__ref->__mvalue /*BOOL*/ ))];
 };
B4IRDebugUtils.currentLine=21954566;
 //BA.debugLineNum = 21954566;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setenabled:(b4i_b4xswitch*) __ref :(BOOL) _b{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"setenabled"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setenabled:" :@[@(_b)]]);}
B4IRDebugUtils.currentLine=22216704;
 //BA.debugLineNum = 22216704;BA.debugLine="Public Sub setEnabled (b As Boolean)";
B4IRDebugUtils.currentLine=22216705;
 //BA.debugLineNum = 22216705;BA.debugLine="mEnabled = b";
__ref->__menabled /*BOOL*/  = _b;
B4IRDebugUtils.currentLine=22216706;
 //BA.debugLineNum = 22216706;BA.debugLine="SetValueImpl(mValue, True)";
[__ref _setvalueimpl /*void*/ :nil :__ref->__mvalue /*BOOL*/  :true];
B4IRDebugUtils.currentLine=22216707;
 //BA.debugLineNum = 22216707;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvalue:(b4i_b4xswitch*) __ref :(BOOL) _b{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xswitch";
if ([B4IDebug shouldDelegate: @"setvalue"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvalue:" :@[@(_b)]]);}
B4IRDebugUtils.currentLine=22085632;
 //BA.debugLineNum = 22085632;BA.debugLine="Public Sub setValue(b As Boolean)";
B4IRDebugUtils.currentLine=22085633;
 //BA.debugLineNum = 22085633;BA.debugLine="If b = mValue Then Return";
if (_b==__ref->__mvalue /*BOOL*/ ) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=22085634;
 //BA.debugLineNum = 22085634;BA.debugLine="SetValueImpl(b, False)";
[__ref _setvalueimpl /*void*/ :nil :_b :false];
B4IRDebugUtils.currentLine=22085635;
 //BA.debugLineNum = 22085635;BA.debugLine="End Sub";
return @"";
}
@end