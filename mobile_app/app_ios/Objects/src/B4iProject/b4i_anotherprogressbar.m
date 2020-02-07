
#import "b4i_anotherprogressbar.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_reporteordenes.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"
#import "b4i_animatedcounter.h"
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

@interface ResumableSub_anotherprogressbar_BusyLoop :B4IResumableSub 
- (instancetype) init: (b4i_anotherprogressbar*) parent1 :(b4i_anotherprogressbar*) __ref1;
@end
@implementation ResumableSub_anotherprogressbar_BusyLoop {
b4i_anotherprogressbar* parent;
b4i_anotherprogressbar* __ref;
int _myindex;
B4XRect* _r;
long long _lasttime;
B4IList* _tasks;
float _delta;
float _change;
B4XBitmapWrapper* _bmp;
}
- (instancetype) init: (b4i_anotherprogressbar*) parent1 :(b4i_anotherprogressbar*) __ref1 {
self->__ref = __ref1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_anotherprogressbar* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"anotherprogressbar";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="Dim MyIndex As Int = BusyIndex";
_myindex = __ref->__busyindex /*int*/ ;
B4IRDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="r.Initialize(0, 0, bc.mWidth, bc.mHeight)";
[_r Initialize:(float) (0) :(float) (0) :(float) (__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth) :(float) (__ref->__bc /*b4i_bitmapcreator**/ ->__mheight)];
B4IRDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Dim LastTime As Long = DateTime.Now";
_lasttime = [[parent->___c DateTime] Now];
B4IRDebugUtils.currentLine=9109509;
 //BA.debugLineNum = 9109509;BA.debugLine="Do While MyIndex = BusyIndex";
if (true) break;

case 1:
//do while
self->_state = 37;
while (_myindex==__ref->__busyindex /*int*/ ) {
self->_state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="If Vertical Then";
if (true) break;

case 4:
//if
self->_state = 9;
if (__ref->__vertical /*BOOL*/ ) { 
self->_state = 6;
}else {
self->_state = 8;
}if (true) break;

case 6:
//C
self->_state = 9;
B4IRDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="BusyBrush.SrcOffsetY = BusyBrush.SrcOffsetY + B";
__ref->__busybrush /*_bcbrush**/ ->_SrcOffsetY = (int) (__ref->__busybrush /*_bcbrush**/ ->_SrcOffsetY+__ref->__brushoffsetdelta /*int*/ );
 if (true) break;

case 8:
//C
self->_state = 9;
B4IRDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="BusyBrush.SrcOffsetX = BusyBrush.SrcOffsetX + B";
__ref->__busybrush /*_bcbrush**/ ->_SrcOffsetX = (int) (__ref->__busybrush /*_bcbrush**/ ->_SrcOffsetX+__ref->__brushoffsetdelta /*int*/ );
 if (true) break;

case 9:
//C
self->_state = 10;
;
B4IRDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="Dim tasks As List";
_tasks = [B4IList new];
B4IRDebugUtils.currentLine=9109516;
 //BA.debugLineNum = 9109516;BA.debugLine="tasks.Initialize";
[_tasks Initialize];
B4IRDebugUtils.currentLine=9109517;
 //BA.debugLineNum = 9109517;BA.debugLine="tasks.Add(bc.AsyncDrawRect(bc.TargetRect, Transp";
[_tasks Add:(NSObject*)([__ref->__bc /*b4i_bitmapcreator**/  _asyncdrawrect:__ref->__bc /*b4i_bitmapcreator**/ ->__targetrect :__ref->__transparentbrush /*_bcbrush**/  :true :(int) (0)])];
B4IRDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="Dim delta As Float = mValue - CurrentValue";
_delta = (float) (__ref->__mvalue /*int*/ -__ref->__currentvalue /*float*/ );
B4IRDebugUtils.currentLine=9109519;
 //BA.debugLineNum = 9109519;BA.debugLine="If Abs(delta) <= 1 Then";
if (true) break;

case 10:
//if
self->_state = 21;
if (fabs(_delta)<=1) { 
self->_state = 12;
}else {
self->_state = 14;
}if (true) break;

case 12:
//C
self->_state = 21;
B4IRDebugUtils.currentLine=9109520;
 //BA.debugLineNum = 9109520;BA.debugLine="CurrentValue = mValue";
__ref->__currentvalue /*float*/  = (float) (__ref->__mvalue /*int*/ );
 if (true) break;

case 14:
//C
self->_state = 15;
B4IRDebugUtils.currentLine=9109522;
 //BA.debugLineNum = 9109522;BA.debugLine="Dim change As Float = (DateTime.Now - LastTime)";
_change = (float) (([[parent->___c DateTime] Now]-_lasttime)/(double)1000*__ref->__valuechangepersecond /*float*/ );
B4IRDebugUtils.currentLine=9109523;
 //BA.debugLineNum = 9109523;BA.debugLine="If delta > 0 Then";
if (true) break;

case 15:
//if
self->_state = 20;
if (_delta>0) { 
self->_state = 17;
}else {
self->_state = 19;
}if (true) break;

case 17:
//C
self->_state = 20;
B4IRDebugUtils.currentLine=9109524;
 //BA.debugLineNum = 9109524;BA.debugLine="CurrentValue = CurrentValue + Min(change, mVal";
__ref->__currentvalue /*float*/  = (float) (__ref->__currentvalue /*float*/ +fmin(_change,__ref->__mvalue /*int*/ -__ref->__currentvalue /*float*/ ));
 if (true) break;

case 19:
//C
self->_state = 20;
B4IRDebugUtils.currentLine=9109526;
 //BA.debugLineNum = 9109526;BA.debugLine="CurrentValue = CurrentValue - Min(change, Curr";
__ref->__currentvalue /*float*/  = (float) (__ref->__currentvalue /*float*/ -fmin(_change,__ref->__currentvalue /*float*/ -__ref->__mvalue /*int*/ ));
 if (true) break;

case 20:
//C
self->_state = 21;
;
 if (true) break;

case 21:
//C
self->_state = 22;
;
B4IRDebugUtils.currentLine=9109529;
 //BA.debugLineNum = 9109529;BA.debugLine="LastTime = DateTime.Now";
_lasttime = [[parent->___c DateTime] Now];
B4IRDebugUtils.currentLine=9109530;
 //BA.debugLineNum = 9109530;BA.debugLine="If CurrentValue < 100 Then";
if (true) break;

case 22:
//if
self->_state = 25;
if (__ref->__currentvalue /*float*/ <100) { 
self->_state = 24;
}if (true) break;

case 24:
//C
self->_state = 25;
B4IRDebugUtils.currentLine=9109531;
 //BA.debugLineNum = 9109531;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(bc.TargetRect";
[_tasks Add:(NSObject*)([__ref->__bc /*b4i_bitmapcreator**/  _asyncdrawrectrounded:__ref->__bc /*b4i_bitmapcreator**/ ->__targetrect :__ref->__emptybrush /*_bcbrush**/  :true :(int) (0) :__ref->__cornerradius /*int*/ ])];
 if (true) break;
;
B4IRDebugUtils.currentLine=9109533;
 //BA.debugLineNum = 9109533;BA.debugLine="If Vertical Then";

case 25:
//if
self->_state = 30;
if (__ref->__vertical /*BOOL*/ ) { 
self->_state = 27;
}else {
self->_state = 29;
}if (true) break;

case 27:
//C
self->_state = 30;
B4IRDebugUtils.currentLine=9109534;
 //BA.debugLineNum = 9109534;BA.debugLine="r.Bottom = Round(CurrentValue / 100 * bc.mHeigh";
[_r setBottom:(float) (((double)lrint(__ref->__currentvalue /*float*/ /(double)100*__ref->__bc /*b4i_bitmapcreator**/ ->__mheight)))];
 if (true) break;

case 29:
//C
self->_state = 30;
B4IRDebugUtils.currentLine=9109536;
 //BA.debugLineNum = 9109536;BA.debugLine="r.Right = Round(CurrentValue / 100 * bc.mWidth)";
[_r setRight:(float) (((double)lrint(__ref->__currentvalue /*float*/ /(double)100*__ref->__bc /*b4i_bitmapcreator**/ ->__mwidth)))];
 if (true) break;

case 30:
//C
self->_state = 31;
;
B4IRDebugUtils.currentLine=9109539;
 //BA.debugLineNum = 9109539;BA.debugLine="tasks.Add(bc.AsyncDrawRectRounded(r, BusyBrush,";
[_tasks Add:(NSObject*)([__ref->__bc /*b4i_bitmapcreator**/  _asyncdrawrectrounded:_r :__ref->__busybrush /*_bcbrush**/  :true :(int) (0) :__ref->__cornerradius /*int*/ ])];
B4IRDebugUtils.currentLine=9109540;
 //BA.debugLineNum = 9109540;BA.debugLine="bc.DrawBitmapCreatorsAsync(Me, \"BC\", tasks)";
[__ref->__bc /*b4i_bitmapcreator**/  _drawbitmapcreatorsasync:parent :@"BC" :_tasks];
B4IRDebugUtils.currentLine=9109541;
 //BA.debugLineNum = 9109541;BA.debugLine="Wait For BC_BitmapReady (bmp As B4XBitmap)";
[parent->___c WaitFor:@"bc_bitmapready:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"anotherprogressbar" :@"busyloop"] :nil];
self->_state = 38;
return;
case 38:
//C
self->_state = 31;
_bmp = ((B4XBitmapWrapper*) result[1]);
;
B4IRDebugUtils.currentLine=9109542;
 //BA.debugLineNum = 9109542;BA.debugLine="If xui.IsB4J Then bmp = bc.Bitmap";
if (true) break;

case 31:
//if
self->_state = 36;
if ([__ref->__xui /*B4IXUI**/  IsB4J]) { 
self->_state = 33;
;}if (true) break;

case 33:
//C
self->_state = 36;
_bmp = [__ref->__bc /*b4i_bitmapcreator**/  _getbitmap];
if (true) break;

case 36:
//C
self->_state = 1;
;
B4IRDebugUtils.currentLine=9109543;
 //BA.debugLineNum = 9109543;BA.debugLine="bc.SetBitmapToImageView(bmp, mIV)";
[__ref->__bc /*b4i_bitmapcreator**/  _setbitmaptoimageview:_bmp :__ref->__miv /*B4XViewWrapper**/ ];
B4IRDebugUtils.currentLine=9109544;
 //BA.debugLineNum = 9109544;BA.debugLine="Sleep(30)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"anotherprogressbar" :@"busyloop"] :(int) (30)];
self->_state = 39;
return;
case 39:
//C
self->_state = 1;
;
 if (true) break;

case 37:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=9109546;
 //BA.debugLineNum = 9109546;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_anotherprogressbar 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_anotherprogressbar) instance released.");
}

- (NSString*)  _base_resize:(b4i_anotherprogressbar*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4XViewWrapper* _v = nil;
B4IRDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = [B4XViewWrapper new];
{
const id<B4IIterable> group1 = [__ref->__mbase /*B4XViewWrapper**/  GetAllViewsRecursive];
const int groupLen1 = group1.Size
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_v.object = (NSObject*)([group1 Get:index1]);
B4IRDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
[_v SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
 }
};
B4IRDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="bc.Initialize(mBase.Width / xui.Scale, mBase.Heig";
[__ref->__bc /*b4i_bitmapcreator**/  _initialize:self.bi :(int) ([__ref->__mbase /*B4XViewWrapper**/  Width]/(double)[__ref->__xui /*B4IXUI**/  Scale]) :(int) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)[__ref->__xui /*B4IXUI**/  Scale])];
B4IRDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="Vertical = mBase.Height > mBase.Width";
__ref->__vertical /*BOOL*/  = [__ref->__mbase /*B4XViewWrapper**/  Height]>[__ref->__mbase /*B4XViewWrapper**/  Width];
B4IRDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="UpdateGraphics";
[__ref _updategraphics /*NSString**/ :nil];
B4IRDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updategraphics:(b4i_anotherprogressbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"updategraphics"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updategraphics" :nil]);}
int _width = 0;
b4i_bitmapcreator* _template = nil;
_argbcolor* _bcolor = nil;
B4IRDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Public Sub UpdateGraphics";
B4IRDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="EmptyBrush = bc.CreateBrushFromColor(EmptyColor)";
__ref->__emptybrush /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfromcolor:__ref->__emptycolor /*int*/ ];
B4IRDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="TransparentBrush = bc.CreateBrushFromColor(xui.Co";
__ref->__transparentbrush /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfromcolor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="Dim Width As Int = 40";
_width = (int) (40);
B4IRDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Dim Template As BitmapCreator";
_template = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = [_argbcolor new];
B4IRDebugUtils.currentLine=9175046;
 //BA.debugLineNum = 9175046;BA.debugLine="bc.ColorToARGB(BackgroundColor, bcolor)";
[__ref->__bc /*b4i_bitmapcreator**/  _colortoargb:__ref->__backgroundcolor /*int*/  :_bcolor];
B4IRDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="bcolor.r = Min(255, bcolor.r * 1.5)";
_bcolor->_r = (int) (fmin(255,_bcolor->_r*1.5));
B4IRDebugUtils.currentLine=9175048;
 //BA.debugLineNum = 9175048;BA.debugLine="bcolor.g = Min(255, bcolor.g * 1.5)";
_bcolor->_g = (int) (fmin(255,_bcolor->_g*1.5));
B4IRDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="bcolor.b = Min(255, bcolor.b * 1.5)";
_bcolor->_b = (int) (fmin(255,_bcolor->_b*1.5));
B4IRDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="If Vertical Then";
if (__ref->__vertical /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=9175051;
 //BA.debugLineNum = 9175051;BA.debugLine="Template.Initialize(mBase.Width / xui.Scale, mBa";
[_template _initialize:self.bi :(int) ([__ref->__mbase /*B4XViewWrapper**/  Width]/(double)[__ref->__xui /*B4IXUI**/  Scale]) :(int) ([__ref->__mbase /*B4XViewWrapper**/  Width]/(double)[__ref->__xui /*B4IXUI**/  Scale]+_width)];
 }else {
B4IRDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="Template.Initialize(mBase.Height / xui.Scale + W";
[_template _initialize:self.bi :(int) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)[__ref->__xui /*B4IXUI**/  Scale]+_width) :(int) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)[__ref->__xui /*B4IXUI**/  Scale])];
 };
B4IRDebugUtils.currentLine=9175056;
 //BA.debugLineNum = 9175056;BA.debugLine="Template.DrawRect(Template.TargetRect, Background";
[_template _drawrect:_template->__targetrect :__ref->__backgroundcolor /*int*/  :true :(int) (0)];
B4IRDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="If Vertical Then";
if (__ref->__vertical /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=9175058;
 //BA.debugLineNum = 9175058;BA.debugLine="Template.DrawLine(-Width / 2, Width / 2, Templat";
[_template _drawline:(float) (-_width/(double)2) :(float) (_width/(double)2) :(float) (_template->__mwidth+_width/(double)2) :(float) (_template->__mheight-_width/(double)2) :[__ref->__bc /*b4i_bitmapcreator**/  _argbtocolor:_bcolor] :_width];
 }else {
B4IRDebugUtils.currentLine=9175060;
 //BA.debugLineNum = 9175060;BA.debugLine="Template.DrawLine(Width / 2, -Width / 2, Templat";
[_template _drawline:(float) (_width/(double)2) :(float) (-_width/(double)2) :(float) (_template->__mwidth-_width/(double)2) :(float) (_template->__mheight+_width/(double)2) :[__ref->__bc /*b4i_bitmapcreator**/  _argbtocolor:_bcolor] :_width];
 };
B4IRDebugUtils.currentLine=9175062;
 //BA.debugLineNum = 9175062;BA.debugLine="BusyBrush = bc.CreateBrushFromBitmapCreator(Templ";
__ref->__busybrush /*_bcbrush**/  = [__ref->__bc /*b4i_bitmapcreator**/  _createbrushfrombitmapcreator:_template];
B4IRDebugUtils.currentLine=9175063;
 //BA.debugLineNum = 9175063;BA.debugLine="If mValue = 100 Then";
if (__ref->__mvalue /*int*/ ==100) { 
B4IRDebugUtils.currentLine=9175064;
 //BA.debugLineNum = 9175064;BA.debugLine="bc.DrawRectRounded(bc.TargetRect, BackgroundColo";
[__ref->__bc /*b4i_bitmapcreator**/  _drawrectrounded:__ref->__bc /*b4i_bitmapcreator**/ ->__targetrect :__ref->__backgroundcolor /*int*/  :true :(int) (0) :(int) (15)];
 }else {
B4IRDebugUtils.currentLine=9175066;
 //BA.debugLineNum = 9175066;BA.debugLine="bc.DrawRectRounded2(bc.TargetRect, EmptyBrush, T";
[__ref->__bc /*b4i_bitmapcreator**/  _drawrectrounded2:__ref->__bc /*b4i_bitmapcreator**/ ->__targetrect :__ref->__emptybrush /*_bcbrush**/  :true :(int) (0) :(int) (15)];
 };
B4IRDebugUtils.currentLine=9175068;
 //BA.debugLineNum = 9175068;BA.debugLine="bc.SetBitmapToImageView(bc.Bitmap, mIV)";
[__ref->__bc /*b4i_bitmapcreator**/  _setbitmaptoimageview:[__ref->__bc /*b4i_bitmapcreator**/  _getbitmap] :__ref->__miv /*B4XViewWrapper**/ ];
B4IRDebugUtils.currentLine=9175069;
 //BA.debugLineNum = 9175069;BA.debugLine="setVisible(mBase.Visible)";
[__ref _setvisible /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Visible]];
B4IRDebugUtils.currentLine=9175070;
 //BA.debugLineNum = 9175070;BA.debugLine="End Sub";
return @"";
}
- (void)  _busyloop:(b4i_anotherprogressbar*) __ref{
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"busyloop"])
	 {[B4IDebug delegate:self.bi :@"busyloop" :nil]; return;}
ResumableSub_anotherprogressbar_BusyLoop* rsub = [[ResumableSub_anotherprogressbar_BusyLoop alloc] init:self : __ref];
[rsub resume:self.bi :nil];
}
//465922531
- (NSString*)  _class_globals:(b4i_anotherprogressbar*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"anotherprogressbar";
B4IRDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Private BusyBrush As BCBrush";
self->__busybrush = [_bcbrush new];
B4IRDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="Private BackgroundColor As Int";
self->__backgroundcolor = 0;
B4IRDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="Private BusyIndex As Int";
self->__busyindex = 0;
B4IRDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Private bc As BitmapCreator";
self->__bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="Private mIV As B4XView";
self->__miv = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=8847370;
 //BA.debugLineNum = 8847370;BA.debugLine="Private TransparentBrush As BCBrush";
self->__transparentbrush = [_bcbrush new];
B4IRDebugUtils.currentLine=8847371;
 //BA.debugLineNum = 8847371;BA.debugLine="Private Vertical As Boolean";
self->__vertical = false;
B4IRDebugUtils.currentLine=8847372;
 //BA.debugLineNum = 8847372;BA.debugLine="Private CurrentValue As Float";
self->__currentvalue = 0.0f;
B4IRDebugUtils.currentLine=8847373;
 //BA.debugLineNum = 8847373;BA.debugLine="Public EmptyColor As Int = xui.Color_White";
self->__emptycolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=8847374;
 //BA.debugLineNum = 8847374;BA.debugLine="Private EmptyBrush As BCBrush";
self->__emptybrush = [_bcbrush new];
B4IRDebugUtils.currentLine=8847375;
 //BA.debugLineNum = 8847375;BA.debugLine="Private mValue As Int";
self->__mvalue = 0;
B4IRDebugUtils.currentLine=8847376;
 //BA.debugLineNum = 8847376;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=8847377;
 //BA.debugLineNum = 8847377;BA.debugLine="Public ValueChangePerSecond As Float = 60";
self->__valuechangepersecond = (float) (60);
B4IRDebugUtils.currentLine=8847378;
 //BA.debugLineNum = 8847378;BA.debugLine="Public CornerRadius As Int";
self->__cornerradius = 0;
B4IRDebugUtils.currentLine=8847379;
 //BA.debugLineNum = 8847379;BA.debugLine="Public BrushOffsetDelta As Int = 3";
self->__brushoffsetdelta = (int) (3);
B4IRDebugUtils.currentLine=8847380;
 //BA.debugLineNum = 8847380;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_anotherprogressbar*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4IImageViewWrapper* _iv = nil;
B4IRDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
B4IRDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Dim iv As ImageView";
_iv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="iv.Initialize(\"\")";
[_iv Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="mIV = iv";
__ref->__miv /*B4XViewWrapper**/ .object = (NSObject*)((_iv).object);
B4IRDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="setValue(Props.GetDefault(\"Value\", 100))";
[__ref _setvalue /*NSString**/ :nil :[self.bi ObjectToNumber:[_props GetDefault:(NSObject*)(@"Value") :(NSObject*)(@(100))]].intValue];
B4IRDebugUtils.currentLine=8978439;
 //BA.debugLineNum = 8978439;BA.debugLine="CurrentValue = mValue";
__ref->__currentvalue /*float*/  = (float) (__ref->__mvalue /*int*/ );
B4IRDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="mBase.AddView(mIV, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__miv /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="mBase.AddView(lbl, 0, 0, mBase.Width, mBase.Heigh";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_lbl).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=8978442;
 //BA.debugLineNum = 8978442;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="BackgroundColor = xui.PaintOrColorToColor(Props.G";
__ref->__backgroundcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"ProgressColor")]];
B4IRDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="CornerRadius = Props.GetDefault(\"CornerRadius\", 1";
__ref->__cornerradius /*int*/  = [self.bi ObjectToNumber:[_props GetDefault:(NSObject*)(@"CornerRadius") :(NSObject*)(@(15))]].intValue;
B4IRDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvalue:(b4i_anotherprogressbar*) __ref :(int) _v{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"setvalue"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvalue:" :@[@(_v)]]);}
B4IRDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Public Sub setValue (v As Int)";
B4IRDebugUtils.currentLine=9437185;
 //BA.debugLineNum = 9437185;BA.debugLine="mValue = Max(0, Min(100, v))";
__ref->__mvalue /*int*/  = (int) (fmax(0,fmin(100,_v)));
B4IRDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="End Sub";
return @"";
}
- (int)  _getvalue:(b4i_anotherprogressbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"getvalue"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getvalue" :nil]).intValue;}
B4IRDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Public Sub getValue As Int";
B4IRDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Return mValue";
if (true) return __ref->__mvalue /*int*/ ;
B4IRDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="End Sub";
return 0;
}
- (BOOL)  _getvisible:(b4i_anotherprogressbar*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"getvisible"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getvisible" :nil]).boolValue;}
B4IRDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Public Sub getVisible As Boolean";
B4IRDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Return mBase.Visible";
if (true) return [__ref->__mbase /*B4XViewWrapper**/  Visible];
B4IRDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _initialize:(b4i_anotherprogressbar*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvaluenoanimation:(b4i_anotherprogressbar*) __ref :(int) _v{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"setvaluenoanimation"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvaluenoanimation:" :@[@(_v)]]);}
B4IRDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Public Sub SetValueNoAnimation (v As Int)";
B4IRDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="setValue(v)";
[__ref _setvalue /*NSString**/ :nil :_v];
B4IRDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="CurrentValue = mValue";
__ref->__currentvalue /*float*/  = (float) (__ref->__mvalue /*int*/ );
B4IRDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvisible:(b4i_anotherprogressbar*) __ref :(BOOL) _b{
__ref = self;
B4IRDebugUtils.currentModule=@"anotherprogressbar";
if ([B4IDebug shouldDelegate: @"setvisible"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvisible:" :@[@(_b)]]);}
B4IRDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Public Sub setVisible(b As Boolean)";
B4IRDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="BusyIndex = BusyIndex + 1";
__ref->__busyindex /*int*/  = (int) (__ref->__busyindex /*int*/ +1);
B4IRDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="If b Then";
if (_b) { 
B4IRDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="BusyLoop";
[__ref _busyloop /*void*/ :nil];
 };
B4IRDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="mBase.Visible = b";
[__ref->__mbase /*B4XViewWrapper**/  setVisible:_b];
B4IRDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="End Sub";
return @"";
}
@end