
#import "b4i_b4xloadingindicator.h"
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

@interface ResumableSub_b4xloadingindicator_MainLoop :B4IResumableSub 
- (instancetype) init: (b4i_b4xloadingindicator*) parent1 :(b4i_b4xloadingindicator*) __ref1;
@end
@implementation ResumableSub_b4xloadingindicator_MainLoop {
b4i_b4xloadingindicator* parent;
b4i_b4xloadingindicator* __ref;
int _myindex;
long long _n;
float _progress;
}
- (instancetype) init: (b4i_b4xloadingindicator*) parent1 :(b4i_b4xloadingindicator*) __ref1 {
self->__ref = __ref1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xloadingindicator* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=18087937;
 //BA.debugLineNum = 18087937;BA.debugLine="index = index + 1";
__ref->__index /*int*/  = (int) (__ref->__index /*int*/ +1);
B4IRDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Dim MyIndex As Int = index";
_myindex = __ref->__index /*int*/ ;
B4IRDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Dim n As Long = DateTime.Now";
_n = [[parent->___c DateTime] Now];
B4IRDebugUtils.currentLine=18087940;
 //BA.debugLineNum = 18087940;BA.debugLine="Do While MyIndex = index";
if (true) break;

case 1:
//do while
self->_state = 4;
while (_myindex==__ref->__index /*int*/ ) {
self->_state = 3;
if (true) break;
}
if (true) break;

case 3:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="Dim progress As Float = (DateTime.Now - n) / dur";
_progress = (float) (([[parent->___c DateTime] Now]-_n)/(double)__ref->__duration /*int*/ );
B4IRDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="progress = progress - Floor(progress)";
_progress = (float) (_progress-floor(_progress));
B4IRDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
[__ref->__cvs /*B4XCanvas**/  ClearRect:[__ref->__cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=18087944;
 //BA.debugLineNum = 18087944;BA.debugLine="CallSub2(Me, DrawingSubName, progress)";
[parent->___c CallSubDebug2:self.bi :parent :__ref->__drawingsubname /*NSString**/  :(NSObject*)(@(_progress))];
B4IRDebugUtils.currentLine=18087945;
 //BA.debugLineNum = 18087945;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=18087946;
 //BA.debugLineNum = 18087946;BA.debugLine="Sleep(10)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xloadingindicator" :@"mainloop"] :(int) (10)];
self->_state = 5;
return;
case 5:
//C
self->_state = 1;
;
 if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xloadingindicator 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xloadingindicator) instance released.");
}

- (NSString*)  _base_resize:(b4i_b4xloadingindicator*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=18022401;
 //BA.debugLineNum = 18022401;BA.debugLine="cvs.Resize(Width, Height)";
[__ref->__cvs /*B4XCanvas**/  Resize:(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="MainLoop";
[__ref _mainloop /*void*/ :nil];
B4IRDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="End Sub";
return @"";
}
- (void)  _mainloop:(b4i_b4xloadingindicator*) __ref{
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"mainloop"])
	 {[B4IDebug delegate:self.bi :@"mainloop" :nil]; return;}
ResumableSub_b4xloadingindicator_MainLoop* rsub = [[ResumableSub_b4xloadingindicator_MainLoop alloc] init:self : __ref];
[rsub resume:self.bi :nil];
}
//927034256
- (NSString*)  _class_globals:(b4i_b4xloadingindicator*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
B4IRDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=17825795;
 //BA.debugLineNum = 17825795;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=17825796;
 //BA.debugLineNum = 17825796;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=17825797;
 //BA.debugLineNum = 17825797;BA.debugLine="Private clr As Int";
self->__clr = 0;
B4IRDebugUtils.currentLine=17825798;
 //BA.debugLineNum = 17825798;BA.debugLine="Private index As Int";
self->__index = 0;
B4IRDebugUtils.currentLine=17825799;
 //BA.debugLineNum = 17825799;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=17825800;
 //BA.debugLineNum = 17825800;BA.debugLine="Private duration As Int";
self->__duration = 0;
B4IRDebugUtils.currentLine=17825801;
 //BA.debugLineNum = 17825801;BA.debugLine="Private DrawingSubName As String";
self->__drawingsubname = @"";
B4IRDebugUtils.currentLine=17825802;
 //BA.debugLineNum = 17825802;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=17825803;
 //BA.debugLineNum = 17825803;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xloadingindicator*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
NSString* _style = @"";
B4IRDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=17956865;
 //BA.debugLineNum = 17956865;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=17956866;
 //BA.debugLineNum = 17956866;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=17956867;
 //BA.debugLineNum = 17956867;BA.debugLine="clr = xui.PaintOrColorToColor(Props.Get(\"Color\"";
__ref->__clr /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"Color")]];
B4IRDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Dim style As String= Props.Get(\"IndicatorStyle\")";
_style = [self.bi ObjectToString:[_props Get:(NSObject*)(@"IndicatorStyle")]];
B4IRDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="Dim duration As Int = Props.Get(\"Duration\")";
self->__duration = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"Duration")]].intValue;
B4IRDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="DrawingSubName = \"Draw_\" & style.Replace(\" \", \"\")";
__ref->__drawingsubname /*NSString**/  = [@[@"Draw_",[_style Replace:@" " :@""]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="cvs.Initialize(mBase)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="MainLoop";
[__ref _mainloop /*void*/ :nil];
B4IRDebugUtils.currentLine=17956873;
 //BA.debugLineNum = 17956873;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw_arc1:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_arc1"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_arc1:" :@[@(_progress)]]);}
B4XPath* _p = nil;
float _r = 0.0f;
B4IRDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Private Sub Draw_Arc1 (Progress As Float)";
B4IRDebugUtils.currentLine=18612225;
 //BA.debugLineNum = 18612225;BA.debugLine="Dim p As B4XPath";
_p = [B4XPath new];
B4IRDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX]-((int) (5)));
B4IRDebugUtils.currentLine=18612227;
 //BA.debugLineNum = 18612227;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
B4IRDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
[_p InitializeArc:[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX] :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :_r :(float) (-90) :(float) (_progress*2*360)];
 }else {
B4IRDebugUtils.currentLine=18612230;
 //BA.debugLineNum = 18612230;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
[_p InitializeArc:[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX] :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :_r :(float) (-90) :(float) (-(1-_progress)*2*360)];
 };
B4IRDebugUtils.currentLine=18612232;
 //BA.debugLineNum = 18612232;BA.debugLine="cvs.ClipPath(p)";
[__ref->__cvs /*B4XCanvas**/  ClipPath:_p];
B4IRDebugUtils.currentLine=18612233;
 //BA.debugLineNum = 18612233;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawRect:[__ref->__cvs /*B4XCanvas**/  TargetRect] :__ref->__clr /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=18612234;
 //BA.debugLineNum = 18612234;BA.debugLine="cvs.RemoveClip";
[__ref->__cvs /*B4XCanvas**/  RemoveClip];
B4IRDebugUtils.currentLine=18612235;
 //BA.debugLineNum = 18612235;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw_arc2:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_arc2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_arc2:" :@[@(_progress)]]);}
B4XPath* _p = nil;
float _r = 0.0f;
B4IRDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Private Sub Draw_Arc2 (Progress As Float)";
B4IRDebugUtils.currentLine=18677761;
 //BA.debugLineNum = 18677761;BA.debugLine="Dim p As B4XPath";
_p = [B4XPath new];
B4IRDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="Dim r As Float = cvs.TargetRect.CenterX - 5dip";
_r = (float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX]-((int) (5)));
B4IRDebugUtils.currentLine=18677763;
 //BA.debugLineNum = 18677763;BA.debugLine="If Progress < 0.5 Then";
if (_progress<0.5) { 
B4IRDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
[_p InitializeArc:[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX] :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :_r :(float) (-90) :(float) (_progress*2*360)];
 }else {
B4IRDebugUtils.currentLine=18677766;
 //BA.debugLineNum = 18677766;BA.debugLine="p.InitializeArc(cvs.TargetRect.CenterX, cvs.Targ";
[_p InitializeArc:[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX] :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :_r :(float) (-90) :(float) (360-(_progress-0.5)*2*360)];
 };
B4IRDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="cvs.ClipPath(p)";
[__ref->__cvs /*B4XCanvas**/  ClipPath:_p];
B4IRDebugUtils.currentLine=18677769;
 //BA.debugLineNum = 18677769;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawRect:[__ref->__cvs /*B4XCanvas**/  TargetRect] :__ref->__clr /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=18677770;
 //BA.debugLineNum = 18677770;BA.debugLine="cvs.RemoveClip";
[__ref->__cvs /*B4XCanvas**/  RemoveClip];
B4IRDebugUtils.currentLine=18677771;
 //BA.debugLineNum = 18677771;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw_fivelines1:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_fivelines1"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_fivelines1:" :@[@(_progress)]]);}
int _minr = 0;
int _maxr = 0;
int _dx = 0;
int _i = 0;
float _r = 0.0f;
B4IRDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Private Sub Draw_FiveLines1(Progress As Float)";
B4IRDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="Dim MinR As Int = 10dip";
_minr = ((int) (10));
B4IRDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Height / 2";
_maxr = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Height]/(double)2);
B4IRDebugUtils.currentLine=18546691;
 //BA.debugLineNum = 18546691;BA.debugLine="Dim dx As Int = (cvs.TargetRect.Width - 2dip) / 5";
_dx = (int) (([[__ref->__cvs /*B4XCanvas**/  TargetRect] Width]-((int) (2)))/(double)5);
B4IRDebugUtils.currentLine=18546692;
 //BA.debugLineNum = 18546692;BA.debugLine="For i = 0 To 4";
{
const int step4 = 1;
const int limit4 = (int) (4);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=18546693;
 //BA.debugLineNum = 18546693;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*sin((_progress*360-30*_i)/ 180.0 * M_PI));
B4IRDebugUtils.currentLine=18546694;
 //BA.debugLineNum = 18546694;BA.debugLine="cvs.DrawLine(2dip + i * dx, cvs.TargetRect.Cente";
[__ref->__cvs /*B4XCanvas**/  DrawLine:(float) (((int) (2))+_i*_dx) :(float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY]-_r) :(float) (((int) (2))+_i*_dx) :(float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY]+_r) :__ref->__clr /*int*/  :(float) (((int) (4)))];
 }
};
B4IRDebugUtils.currentLine=18546696;
 //BA.debugLineNum = 18546696;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw_pacman:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_pacman"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_pacman:" :@[@(_progress)]]);}
int _dotr = 0;
B4XPath* _p = nil;
int _angle = 0;
int _cx = 0;
int _cy = 0;
int _r = 0;
B4IRDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Private Sub Draw_PacMan(Progress As Float)";
B4IRDebugUtils.currentLine=18743297;
 //BA.debugLineNum = 18743297;BA.debugLine="Dim DotR As Int = 5dip";
_dotr = ((int) (5));
B4IRDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.Width - DotR - Prog";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Width]-_dotr-_progress*([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX]-((int) (10)))) :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :(float) (_dotr) :[__ref _setalpha /*int*/ :nil :__ref->__clr /*int*/  :(int) (255-200*_progress)] :true :(float) (0)];
B4IRDebugUtils.currentLine=18743299;
 //BA.debugLineNum = 18743299;BA.debugLine="Dim p As B4XPath";
_p = [B4XPath new];
B4IRDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="Dim angle As Int = 70 * SinD(Progress * 180)";
_angle = (int) (70*sin((_progress*180)/ 180.0 * M_PI));
B4IRDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="Dim cx As Int = cvs.TargetRect.CenterX - 5dip";
_cx = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX]-((int) (5)));
B4IRDebugUtils.currentLine=18743302;
 //BA.debugLineNum = 18743302;BA.debugLine="Dim cy As Int = cvs.TargetRect.CenterY";
_cy = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY]);
B4IRDebugUtils.currentLine=18743303;
 //BA.debugLineNum = 18743303;BA.debugLine="Dim r As Int = cvs.TargetRect.CenterY - 5dip";
_r = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY]-((int) (5)));
B4IRDebugUtils.currentLine=18743304;
 //BA.debugLineNum = 18743304;BA.debugLine="If angle = 0 Then";
if (_angle==0) { 
B4IRDebugUtils.currentLine=18743305;
 //BA.debugLineNum = 18743305;BA.debugLine="cvs.DrawCircle(cx, cy, r, clr, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) (_cx) :(float) (_cy) :(float) (_r) :__ref->__clr /*int*/  :true :(float) (0)];
 }else {
B4IRDebugUtils.currentLine=18743307;
 //BA.debugLineNum = 18743307;BA.debugLine="p.InitializeArc(cx, cy , r, -angle / 2, -(360-an";
[_p InitializeArc:(float) (_cx) :(float) (_cy) :(float) (_r) :(float) (-_angle/(double)2) :(float) (-(360-_angle))];
B4IRDebugUtils.currentLine=18743308;
 //BA.debugLineNum = 18743308;BA.debugLine="cvs.ClipPath(p)";
[__ref->__cvs /*B4XCanvas**/  ClipPath:_p];
B4IRDebugUtils.currentLine=18743309;
 //BA.debugLineNum = 18743309;BA.debugLine="cvs.DrawRect(cvs.TargetRect, clr, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawRect:[__ref->__cvs /*B4XCanvas**/  TargetRect] :__ref->__clr /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=18743310;
 //BA.debugLineNum = 18743310;BA.debugLine="cvs.RemoveClip";
[__ref->__cvs /*B4XCanvas**/  RemoveClip];
 };
B4IRDebugUtils.currentLine=18743313;
 //BA.debugLineNum = 18743313;BA.debugLine="End Sub";
return @"";
}
- (int)  _setalpha:(b4i_b4xloadingindicator*) __ref :(int) _c :(int) _alpha{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"setalpha"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"setalpha::" :@[@(_c),@(_alpha)]]).intValue;}
B4IRDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Private Sub SetAlpha (c As Int, alpha As Int) As I";
B4IRDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Return Bit.And(0xffffff, c) + Bit.ShiftLeft(alpha";
if (true) return (int) ((((int) (0xffffff)) & (_c))+((_alpha) << ((int) (24))));
B4IRDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _draw_singlecircle:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_singlecircle"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_singlecircle:" :@[@(_progress)]]);}
int _i = 0;
B4IRDebugUtils.currentLine=18415616;
 //BA.debugLineNum = 18415616;BA.debugLine="Private Sub Draw_SingleCircle(Progress As Float)";
B4IRDebugUtils.currentLine=18415617;
 //BA.debugLineNum = 18415617;BA.debugLine="For i = 0 To 2";
{
const int step1 = 1;
const int limit1 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit1 ;_i = _i + step1 ) {
B4IRDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX, cvs.Targe";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX] :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :(float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX]*_progress) :[__ref _setalpha /*int*/ :nil :__ref->__clr /*int*/  :(int) (255-255*_progress)] :true :(float) (0)];
 }
};
B4IRDebugUtils.currentLine=18415620;
 //BA.debugLineNum = 18415620;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw_threecircles1:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_threecircles1"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_threecircles1:" :@[@(_progress)]]);}
float _maxr = 0.0f;
float _r = 0.0f;
int _i = 0;
int _alpha = 0;
B4IRDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Private Sub Draw_ThreeCircles1 (Progress As Float)";
B4IRDebugUtils.currentLine=18284545;
 //BA.debugLineNum = 18284545;BA.debugLine="Dim MaxR As Float = (cvs.TargetRect.Width / 2 - 2";
_maxr = (float) (([[__ref->__cvs /*B4XCanvas**/  TargetRect] Width]/(double)2-((int) (20)))/(double)2);
B4IRDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="Dim r As Float = 10dip + MaxR + MaxR * Sin(Progre";
_r = (float) (((int) (10))+_maxr+_maxr*sin(_progress*2*[self->___c cPI]));
B4IRDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="For i = 0 To 2";
{
const int step3 = 1;
const int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
B4IRDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="Dim alpha As Int = i * 120 + Progress * 360";
_alpha = (int) (_i*120+_progress*360);
B4IRDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="cvs.DrawCircle(cvs.TargetRect.CenterX + r * SinD";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterX]+_r*sin((_alpha)/ 180.0 * M_PI)) :(float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY]+_r*cos((_alpha)/ 180.0 * M_PI)) :(float) (((int) (7))) :__ref->__clr /*int*/  :true :(float) (((int) (1)))];
 }
};
B4IRDebugUtils.currentLine=18284552;
 //BA.debugLineNum = 18284552;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw_threecircles2:(b4i_b4xloadingindicator*) __ref :(float) _progress{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"draw_threecircles2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw_threecircles2:" :@[@(_progress)]]);}
int _minr = 0;
int _maxr = 0;
int _i = 0;
float _r = 0.0f;
B4IRDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Private Sub Draw_ThreeCircles2 (Progress As Float)";
B4IRDebugUtils.currentLine=18350081;
 //BA.debugLineNum = 18350081;BA.debugLine="Dim MinR As Int = 5dip";
_minr = ((int) (5));
B4IRDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Dim MaxR As Int = cvs.TargetRect.Width / 2 / 3 -";
_maxr = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Width]/(double)2/(double)3-_minr-((int) (2)));
B4IRDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="For i = 0 To 2";
{
const int step3 = 1;
const int limit3 = (int) (2);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
B4IRDebugUtils.currentLine=18350084;
 //BA.debugLineNum = 18350084;BA.debugLine="Dim r As Float = MinR + MaxR / 2 + MaxR / 2 * Si";
_r = (float) (_minr+_maxr/(double)2+_maxr/(double)2*sin((_progress*360-60*_i)/ 180.0 * M_PI));
B4IRDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="cvs.DrawCircle(MaxR + MinR + (MinR + MaxR + 2dip";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:(float) (_maxr+_minr+(_minr+_maxr+((int) (2)))*2*_i) :[[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY] :_r :__ref->__clr /*int*/  :true :(float) (0)];
 }
};
B4IRDebugUtils.currentLine=18350087;
 //BA.debugLineNum = 18350087;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hide:(b4i_b4xloadingindicator*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"hide"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"hide" :nil]);}
B4IRDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Public Sub Hide";
B4IRDebugUtils.currentLine=18219009;
 //BA.debugLineNum = 18219009;BA.debugLine="mBase.Visible = False";
[__ref->__mbase /*B4XViewWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="index = index + 1";
__ref->__index /*int*/  = (int) (__ref->__index /*int*/ +1);
B4IRDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xloadingindicator*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=17891328;
 //BA.debugLineNum = 17891328;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _show:(b4i_b4xloadingindicator*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xloadingindicator";
if ([B4IDebug shouldDelegate: @"show"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"show" :nil]);}
B4IRDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Public Sub Show";
B4IRDebugUtils.currentLine=18153473;
 //BA.debugLineNum = 18153473;BA.debugLine="mBase.Visible = True";
[__ref->__mbase /*B4XViewWrapper**/  setVisible:true];
B4IRDebugUtils.currentLine=18153474;
 //BA.debugLineNum = 18153474;BA.debugLine="MainLoop";
[__ref _mainloop /*void*/ :nil];
B4IRDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="End Sub";
return @"";
}
@end