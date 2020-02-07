
#import "b4i_swiftbutton.h"
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
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"


@implementation b4i_swiftbutton 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_swiftbutton) instance released.");
}

- (NSString*)  _base_resize:(b4i_swiftbutton*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4XViewWrapper* _v = nil;
B4IRDebugUtils.currentLine=24969216;
 //BA.debugLineNum = 24969216;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=24969217;
 //BA.debugLineNum = 24969217;BA.debugLine="cvs.Resize(Width, Height)";
[__ref->__cvs /*B4XCanvas**/  Resize:(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=24969218;
 //BA.debugLineNum = 24969218;BA.debugLine="For Each v As B4XView In mBase.GetAllViewsRecursi";
_v = [B4XViewWrapper new];
{
const id<B4IIterable> group2 = [__ref->__mbase /*B4XViewWrapper**/  GetAllViewsRecursive];
const int groupLen2 = group2.Size
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_v.object = (NSObject*)([group2 Get:index2]);
B4IRDebugUtils.currentLine=24969219;
 //BA.debugLineNum = 24969219;BA.debugLine="v.SetLayoutAnimated(0, 0, 0, Width, Height)";
[_v SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
 }
};
B4IRDebugUtils.currentLine=24969221;
 //BA.debugLineNum = 24969221;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=24969222;
 //BA.debugLineNum = 24969222;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw:(b4i_swiftbutton*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"draw"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw" :nil]);}
int _gap = 0;
int _corners = 0;
B4XRect* _r = nil;
B4XPath* _p = nil;
int _c = 0;
B4IRDebugUtils.currentLine=25296896;
 //BA.debugLineNum = 25296896;BA.debugLine="Private Sub Draw";
B4IRDebugUtils.currentLine=25296897;
 //BA.debugLineNum = 25296897;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
[__ref->__cvs /*B4XCanvas**/  ClearRect:[__ref->__cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=25296898;
 //BA.debugLineNum = 25296898;BA.debugLine="Dim gap As Int = 5dip";
_gap = ((int) (5));
B4IRDebugUtils.currentLine=25296899;
 //BA.debugLineNum = 25296899;BA.debugLine="Dim corners As Int = 15dip";
_corners = ((int) (15));
B4IRDebugUtils.currentLine=25296900;
 //BA.debugLineNum = 25296900;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=25296901;
 //BA.debugLineNum = 25296901;BA.debugLine="Dim p As B4XPath";
_p = [B4XPath new];
B4IRDebugUtils.currentLine=25296902;
 //BA.debugLineNum = 25296902;BA.debugLine="r.Initialize(0, gap, mBase.Width, mBase.Height)";
[_r Initialize:(float) (0) :(float) (_gap) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=25296903;
 //BA.debugLineNum = 25296903;BA.debugLine="If pressed = False Then";
if (__ref->__pressed /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=25296904;
 //BA.debugLineNum = 25296904;BA.debugLine="xLBL.Top = 0";
[__ref->__xlbl /*B4XViewWrapper**/  setTop:(float) (0)];
B4IRDebugUtils.currentLine=25296905;
 //BA.debugLineNum = 25296905;BA.debugLine="p.InitializeRoundedRect(r, corners)";
[_p InitializeRoundedRect:_r :(float) (_corners)];
B4IRDebugUtils.currentLine=25296906;
 //BA.debugLineNum = 25296906;BA.debugLine="cvs.DrawPath(p, clr2, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawPath:_p :__ref->__clr2 /*int*/  :true :(float) (0)];
B4IRDebugUtils.currentLine=25296907;
 //BA.debugLineNum = 25296907;BA.debugLine="r.Initialize(0, 0, mBase.Width, mBase.Height - g";
[_r Initialize:(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :(float) ([__ref->__mbase /*B4XViewWrapper**/  Height]-_gap)];
B4IRDebugUtils.currentLine=25296908;
 //BA.debugLineNum = 25296908;BA.debugLine="p.InitializeRoundedRect(r, corners)";
[_p InitializeRoundedRect:_r :(float) (_corners)];
B4IRDebugUtils.currentLine=25296909;
 //BA.debugLineNum = 25296909;BA.debugLine="cvs.DrawPath(p, clr1, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawPath:_p :__ref->__clr1 /*int*/  :true :(float) (0)];
 }else {
B4IRDebugUtils.currentLine=25296911;
 //BA.debugLineNum = 25296911;BA.debugLine="xLBL.Top = gap";
[__ref->__xlbl /*B4XViewWrapper**/  setTop:(float) (_gap)];
B4IRDebugUtils.currentLine=25296912;
 //BA.debugLineNum = 25296912;BA.debugLine="p.InitializeRoundedRect(r, corners)";
[_p InitializeRoundedRect:_r :(float) (_corners)];
B4IRDebugUtils.currentLine=25296913;
 //BA.debugLineNum = 25296913;BA.debugLine="Dim c As Int";
_c = 0;
B4IRDebugUtils.currentLine=25296914;
 //BA.debugLineNum = 25296914;BA.debugLine="If mDisabled Then c = disabledColor Else c = clr";
if (__ref->__mdisabled /*BOOL*/ ) { 
_c = __ref->__disabledcolor /*int*/ ;}
else {
_c = __ref->__clr1 /*int*/ ;};
B4IRDebugUtils.currentLine=25296915;
 //BA.debugLineNum = 25296915;BA.debugLine="cvs.DrawPath(p, c, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawPath:_p :_c :true :(float) (0)];
 };
B4IRDebugUtils.currentLine=25296918;
 //BA.debugLineNum = 25296918;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=25296919;
 //BA.debugLineNum = 25296919;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_swiftbutton*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"swiftbutton";
B4IRDebugUtils.currentLine=24772608;
 //BA.debugLineNum = 24772608;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=24772609;
 //BA.debugLineNum = 24772609;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=24772610;
 //BA.debugLineNum = 24772610;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=24772611;
 //BA.debugLineNum = 24772611;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=24772612;
 //BA.debugLineNum = 24772612;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=24772613;
 //BA.debugLineNum = 24772613;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=24772614;
 //BA.debugLineNum = 24772614;BA.debugLine="Public xLBL As B4XView";
self->__xlbl = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=24772615;
 //BA.debugLineNum = 24772615;BA.debugLine="Private clr1, clr2, disabledColor As Int";
self->__clr1 = 0;
self->__clr2 = 0;
self->__disabledcolor = 0;
B4IRDebugUtils.currentLine=24772616;
 //BA.debugLineNum = 24772616;BA.debugLine="Private pressed As Boolean";
self->__pressed = false;
B4IRDebugUtils.currentLine=24772617;
 //BA.debugLineNum = 24772617;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=24772618;
 //BA.debugLineNum = 24772618;BA.debugLine="Private mDisabled As Boolean";
self->__mdisabled = false;
B4IRDebugUtils.currentLine=24772619;
 //BA.debugLineNum = 24772619;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_swiftbutton*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _p = nil;
B4IRDebugUtils.currentLine=24903680;
 //BA.debugLineNum = 24903680;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=24903681;
 //BA.debugLineNum = 24903681;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=24903682;
 //BA.debugLineNum = 24903682;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=24903683;
 //BA.debugLineNum = 24903683;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"p\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"p"];
B4IRDebugUtils.currentLine=24903684;
 //BA.debugLineNum = 24903684;BA.debugLine="p.Color = xui.Color_Transparent";
[_p setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=24903685;
 //BA.debugLineNum = 24903685;BA.debugLine="clr1 = xui.PaintOrColorToColor(Props.Get(\"Primary";
__ref->__clr1 /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"PrimaryColor")]];
B4IRDebugUtils.currentLine=24903686;
 //BA.debugLineNum = 24903686;BA.debugLine="clr2 = xui.PaintOrColorToColor(Props.Get(\"Seconda";
__ref->__clr2 /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"SecondaryColor")]];
B4IRDebugUtils.currentLine=24903687;
 //BA.debugLineNum = 24903687;BA.debugLine="disabledColor = xui.PaintOrColorToColor(Props.Get";
__ref->__disabledcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props GetDefault:(NSObject*)(@"DisabledColor") :(NSObject*)(@(0xff999999))]];
B4IRDebugUtils.currentLine=24903688;
 //BA.debugLineNum = 24903688;BA.debugLine="xLBL = Lbl";
__ref->__xlbl /*B4XViewWrapper**/ .object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=24903689;
 //BA.debugLineNum = 24903689;BA.debugLine="mBase.AddView(xLBL, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__xlbl /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=24903690;
 //BA.debugLineNum = 24903690;BA.debugLine="mBase.AddView(p, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_p).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=24903691;
 //BA.debugLineNum = 24903691;BA.debugLine="xLBL.SetTextAlignment(\"CENTER\", \"CENTER\")";
[__ref->__xlbl /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=24903692;
 //BA.debugLineNum = 24903692;BA.debugLine="cvs.Initialize(mBase)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=24903693;
 //BA.debugLineNum = 24903693;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=24903694;
 //BA.debugLineNum = 24903694;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _getenabled:(b4i_swiftbutton*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"getenabled"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getenabled" :nil]).boolValue;}
B4IRDebugUtils.currentLine=25034752;
 //BA.debugLineNum = 25034752;BA.debugLine="Public Sub getEnabled As Boolean";
B4IRDebugUtils.currentLine=25034753;
 //BA.debugLineNum = 25034753;BA.debugLine="Return Not(mDisabled)";
if (true) return (!(__ref->__mdisabled /*BOOL*/ ));
B4IRDebugUtils.currentLine=25034754;
 //BA.debugLineNum = 25034754;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _initialize:(b4i_swiftbutton*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=24838144;
 //BA.debugLineNum = 24838144;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=24838145;
 //BA.debugLineNum = 24838145;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=24838146;
 //BA.debugLineNum = 24838146;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=24838147;
 //BA.debugLineNum = 24838147;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _p_touch:(b4i_swiftbutton*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"p_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"p_touch:::" :@[@(_action),@(_x),@(_y)]]);}
BOOL _inside = false;
B4IRDebugUtils.currentLine=25165824;
 //BA.debugLineNum = 25165824;BA.debugLine="Private Sub p_Touch (Action As Int, X As Float, Y";
B4IRDebugUtils.currentLine=25165825;
 //BA.debugLineNum = 25165825;BA.debugLine="If mDisabled Then Return";
if (__ref->__mdisabled /*BOOL*/ ) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=25165826;
 //BA.debugLineNum = 25165826;BA.debugLine="Dim Inside As Boolean = x > 0 And x < mBase.Width";
_inside = _x>0 && _x<[__ref->__mbase /*B4XViewWrapper**/  Width] && _y>0 && _y<[__ref->__mbase /*B4XViewWrapper**/  Height];
B4IRDebugUtils.currentLine=25165827;
 //BA.debugLineNum = 25165827;BA.debugLine="Select Action";
switch ([self.bi switchObjectToInt:@(_action) :@[@([__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_DOWN]),@([__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_MOVE]),@([__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_UP])]]) {
case 0: {
B4IRDebugUtils.currentLine=25165829;
 //BA.debugLineNum = 25165829;BA.debugLine="pressed = True";
__ref->__pressed /*BOOL*/  = true;
B4IRDebugUtils.currentLine=25165830;
 //BA.debugLineNum = 25165830;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
 break; }
case 1: {
B4IRDebugUtils.currentLine=25165832;
 //BA.debugLineNum = 25165832;BA.debugLine="If pressed <> Inside Then";
if (__ref->__pressed /*BOOL*/ !=_inside) { 
B4IRDebugUtils.currentLine=25165833;
 //BA.debugLineNum = 25165833;BA.debugLine="pressed = Inside";
__ref->__pressed /*BOOL*/  = _inside;
B4IRDebugUtils.currentLine=25165834;
 //BA.debugLineNum = 25165834;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
 };
 break; }
case 2: {
B4IRDebugUtils.currentLine=25165837;
 //BA.debugLineNum = 25165837;BA.debugLine="pressed = False";
__ref->__pressed /*BOOL*/  = false;
B4IRDebugUtils.currentLine=25165838;
 //BA.debugLineNum = 25165838;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=25165839;
 //BA.debugLineNum = 25165839;BA.debugLine="If Inside Then";
if (_inside) { 
B4IRDebugUtils.currentLine=25165840;
 //BA.debugLineNum = 25165840;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_Click";
[self->___c CallSubDelayed:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_Click"] componentsJoinedByString:@""]];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=25165843;
 //BA.debugLineNum = 25165843;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setcolors:(b4i_swiftbutton*) __ref :(int) _primary :(int) _secondary{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"setcolors"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setcolors::" :@[@(_primary),@(_secondary)]]);}
B4IRDebugUtils.currentLine=25231360;
 //BA.debugLineNum = 25231360;BA.debugLine="Public Sub SetColors(Primary As Int, Secondary As";
B4IRDebugUtils.currentLine=25231361;
 //BA.debugLineNum = 25231361;BA.debugLine="clr1 = Primary";
__ref->__clr1 /*int*/  = _primary;
B4IRDebugUtils.currentLine=25231362;
 //BA.debugLineNum = 25231362;BA.debugLine="clr2 = Secondary";
__ref->__clr2 /*int*/  = _secondary;
B4IRDebugUtils.currentLine=25231363;
 //BA.debugLineNum = 25231363;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=25231364;
 //BA.debugLineNum = 25231364;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setenabled:(b4i_swiftbutton*) __ref :(BOOL) _b{
__ref = self;
B4IRDebugUtils.currentModule=@"swiftbutton";
if ([B4IDebug shouldDelegate: @"setenabled"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setenabled:" :@[@(_b)]]);}
B4IRDebugUtils.currentLine=25100288;
 //BA.debugLineNum = 25100288;BA.debugLine="Public Sub setEnabled(b As Boolean)";
B4IRDebugUtils.currentLine=25100289;
 //BA.debugLineNum = 25100289;BA.debugLine="mDisabled = Not(b)";
__ref->__mdisabled /*BOOL*/  = (!(_b));
B4IRDebugUtils.currentLine=25100290;
 //BA.debugLineNum = 25100290;BA.debugLine="pressed = mDisabled";
__ref->__pressed /*BOOL*/  = __ref->__mdisabled /*BOOL*/ ;
B4IRDebugUtils.currentLine=25100291;
 //BA.debugLineNum = 25100291;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=25100292;
 //BA.debugLineNum = 25100292;BA.debugLine="End Sub";
return @"";
}
@end