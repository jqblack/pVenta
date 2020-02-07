
#import "b4i_scrollinglabel.h"
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
#import "b4i_swiftbutton.h"

@interface ResumableSub_scrollinglabel_StartScrolling :B4IResumableSub 
- (instancetype) init: (b4i_scrollinglabel*) parent1 :(b4i_scrollinglabel*) __ref1 :(B4XViewWrapper*) _p1 :(float) _originalwidth1;
@end
@implementation ResumableSub_scrollinglabel_StartScrolling {
b4i_scrollinglabel* parent;
b4i_scrollinglabel* __ref;
B4XViewWrapper* _p;
float _originalwidth;
int _myindex;
int _duration;
}
- (instancetype) init: (b4i_scrollinglabel*) parent1 :(b4i_scrollinglabel*) __ref1 :(B4XViewWrapper*) _p1 :(float) _originalwidth1 {
self->__ref = __ref1;
self->_p = _p1;
self->_originalwidth = _originalwidth1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_scrollinglabel* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"scrollinglabel";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=24510465;
 //BA.debugLineNum = 24510465;BA.debugLine="taskIndex = taskIndex + 1";
__ref->__taskindex /*int*/  = (int) (__ref->__taskindex /*int*/ +1);
B4IRDebugUtils.currentLine=24510466;
 //BA.debugLineNum = 24510466;BA.debugLine="Dim myIndex As Int = taskIndex";
_myindex = __ref->__taskindex /*int*/ ;
B4IRDebugUtils.currentLine=24510467;
 //BA.debugLineNum = 24510467;BA.debugLine="Dim duration As Int = p.Width / WidthPerSecond *";
_duration = (int) ([_p Width]/(double)__ref->__widthpersecond /*int*/ *1000);
B4IRDebugUtils.currentLine=24510468;
 //BA.debugLineNum = 24510468;BA.debugLine="Sleep(StartPositionDelay)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"scrollinglabel" :@"startscrolling"] :__ref->__startpositiondelay /*int*/ ];
self->_state = 23;
return;
case 23:
//C
self->_state = 1;
;
B4IRDebugUtils.currentLine=24510469;
 //BA.debugLineNum = 24510469;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 1:
//if
self->_state = 6;
if (_myindex!=__ref->__taskindex /*int*/ ) { 
self->_state = 3;
;}if (true) break;

case 3:
//C
self->_state = 6;
if (true) return ;
if (true) break;

case 6:
//C
self->_state = 7;
;
B4IRDebugUtils.currentLine=24510470;
 //BA.debugLineNum = 24510470;BA.debugLine="Do While True";
if (true) break;

case 7:
//do while
self->_state = 22;
while (true) {
self->_state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
self->_state = 10;
B4IRDebugUtils.currentLine=24510471;
 //BA.debugLineNum = 24510471;BA.debugLine="p.SetLayoutAnimated(duration, -(p.Width - Origin";
[_p SetLayoutAnimated:_duration :(float) (-([_p Width]-_originalwidth)) :[_p Top] :[_p Width] :[_p Height]];
B4IRDebugUtils.currentLine=24510472;
 //BA.debugLineNum = 24510472;BA.debugLine="Sleep(duration)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"scrollinglabel" :@"startscrolling"] :_duration];
self->_state = 24;
return;
case 24:
//C
self->_state = 10;
;
B4IRDebugUtils.currentLine=24510473;
 //BA.debugLineNum = 24510473;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 10:
//if
self->_state = 15;
if (_myindex!=__ref->__taskindex /*int*/ ) { 
self->_state = 12;
;}if (true) break;

case 12:
//C
self->_state = 15;
if (true) return ;
if (true) break;

case 15:
//C
self->_state = 16;
;
B4IRDebugUtils.currentLine=24510474;
 //BA.debugLineNum = 24510474;BA.debugLine="Sleep(StartPositionDelay)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"scrollinglabel" :@"startscrolling"] :__ref->__startpositiondelay /*int*/ ];
self->_state = 25;
return;
case 25:
//C
self->_state = 16;
;
B4IRDebugUtils.currentLine=24510475;
 //BA.debugLineNum = 24510475;BA.debugLine="If myIndex <> taskIndex Then Return";
if (true) break;

case 16:
//if
self->_state = 21;
if (_myindex!=__ref->__taskindex /*int*/ ) { 
self->_state = 18;
;}if (true) break;

case 18:
//C
self->_state = 21;
if (true) return ;
if (true) break;

case 21:
//C
self->_state = 7;
;
B4IRDebugUtils.currentLine=24510476;
 //BA.debugLineNum = 24510476;BA.debugLine="p.SetLayoutAnimated(0, 0, p.Top, p.Width, p.Heig";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :[_p Top] :[_p Width] :[_p Height]];
 if (true) break;

case 22:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=24510478;
 //BA.debugLineNum = 24510478;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_scrollinglabel 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_scrollinglabel) instance released.");
}

- (NSString*)  _base_resize:(b4i_scrollinglabel*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=24248320;
 //BA.debugLineNum = 24248320;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=24248321;
 //BA.debugLineNum = 24248321;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
[[__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)] SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=24248322;
 //BA.debugLineNum = 24248322;BA.debugLine="setText(mText)";
[__ref _settext /*NSString**/ :nil :__ref->__mtext /*NSString**/ ];
B4IRDebugUtils.currentLine=24248323;
 //BA.debugLineNum = 24248323;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settext:(b4i_scrollinglabel*) __ref :(NSString*) _t{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"settext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settext:" :@[[B4I nilToNSNull:_t]]]);}
BOOL _needtocreatenewlabel = false;
B4XViewWrapper* _parent = nil;
B4XViewWrapper* _p = nil;
B4XViewWrapper* _xlbl = nil;
float _originaltextwidth = 0.0f;
B4ILabelWrapper* _lbl = nil;
NSString* _duplicatetext = @"";
float _width = 0.0f;
B4IRDebugUtils.currentLine=24313856;
 //BA.debugLineNum = 24313856;BA.debugLine="Public Sub setText(t As String)";
B4IRDebugUtils.currentLine=24313857;
 //BA.debugLineNum = 24313857;BA.debugLine="Dim NeedToCreateNewLabel As Boolean = True";
_needtocreatenewlabel = true;
B4IRDebugUtils.currentLine=24313858;
 //BA.debugLineNum = 24313858;BA.debugLine="Dim parent As B4XView = mBase.GetView(0)";
_parent = [B4XViewWrapper new];
_parent = [__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)];
B4IRDebugUtils.currentLine=24313859;
 //BA.debugLineNum = 24313859;BA.debugLine="If parent.NumberOfViews > 0 Then";
if ([_parent NumberOfViews]>0) { 
B4IRDebugUtils.currentLine=24313861;
 //BA.debugLineNum = 24313861;BA.debugLine="Dim p As B4XView = parent.GetView(0)";
_p = [B4XViewWrapper new];
_p = [_parent GetView:(int) (0)];
B4IRDebugUtils.currentLine=24313862;
 //BA.debugLineNum = 24313862;BA.debugLine="If p.Tag = \"static\" Then";
if ([[_p Tag] isEqual:(NSObject*)(@"static")]) { 
B4IRDebugUtils.currentLine=24313863;
 //BA.debugLineNum = 24313863;BA.debugLine="NeedToCreateNewLabel = False";
_needtocreatenewlabel = false;
B4IRDebugUtils.currentLine=24313864;
 //BA.debugLineNum = 24313864;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, parent.Width, pare";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_parent Width] :[_parent Height]];
B4IRDebugUtils.currentLine=24313865;
 //BA.debugLineNum = 24313865;BA.debugLine="Dim xlbl As B4XView = p.GetView(0)";
_xlbl = [B4XViewWrapper new];
_xlbl = [_p GetView:(int) (0)];
B4IRDebugUtils.currentLine=24313866;
 //BA.debugLineNum = 24313866;BA.debugLine="xlbl.SetLayoutAnimated(0, 0, 0, parent.Width, p";
[_xlbl SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_parent Width] :[_parent Height]];
 };
 };
B4IRDebugUtils.currentLine=24313870;
 //BA.debugLineNum = 24313870;BA.debugLine="Dim originalTextWidth As Float = MeasureTextWidth";
_originaltextwidth = [__ref _measuretextwidth /*float*/ :nil :_t :__ref->__fnt /*B4XFont**/ ];
B4IRDebugUtils.currentLine=24313871;
 //BA.debugLineNum = 24313871;BA.debugLine="mText = t";
__ref->__mtext /*NSString**/  = _t;
B4IRDebugUtils.currentLine=24313872;
 //BA.debugLineNum = 24313872;BA.debugLine="If NeedToCreateNewLabel Then";
if (_needtocreatenewlabel) { 
B4IRDebugUtils.currentLine=24313873;
 //BA.debugLineNum = 24313873;BA.debugLine="parent.RemoveAllViews";
[_parent RemoveAllViews];
B4IRDebugUtils.currentLine=24313874;
 //BA.debugLineNum = 24313874;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=24313875;
 //BA.debugLineNum = 24313875;BA.debugLine="parent.AddView(p, 0, 0, parent.Width, parent.Hei";
[_parent AddView:(UIView*)((_p).object) :(float) (0) :(float) (0) :[_parent Width] :[_parent Height]];
B4IRDebugUtils.currentLine=24313876;
 //BA.debugLineNum = 24313876;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=24313877;
 //BA.debugLineNum = 24313877;BA.debugLine="lbl.Initialize(\"\")";
[_lbl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=24313882;
 //BA.debugLineNum = 24313882;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=24313883;
 //BA.debugLineNum = 24313883;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
[_xlbl SetTextAlignment:@"CENTER" :@"LEFT"];
B4IRDebugUtils.currentLine=24313884;
 //BA.debugLineNum = 24313884;BA.debugLine="xlbl.Font = fnt";
[_xlbl setFont:__ref->__fnt /*B4XFont**/ ];
B4IRDebugUtils.currentLine=24313886;
 //BA.debugLineNum = 24313886;BA.debugLine="p.AddView(xlbl, 0, 0, mBase.Width, mBase.Height)";
[_p AddView:(UIView*)((_xlbl).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
 };
B4IRDebugUtils.currentLine=24313888;
 //BA.debugLineNum = 24313888;BA.debugLine="xlbl.TextColor = mTextColor";
[_xlbl setTextColor:__ref->__mtextcolor /*int*/ ];
B4IRDebugUtils.currentLine=24313889;
 //BA.debugLineNum = 24313889;BA.debugLine="If originalTextWidth <= mBase.Width Then";
if (_originaltextwidth<=[__ref->__mbase /*B4XViewWrapper**/  Width]) { 
B4IRDebugUtils.currentLine=24313890;
 //BA.debugLineNum = 24313890;BA.debugLine="xlbl.Text = t";
[_xlbl setText:_t];
B4IRDebugUtils.currentLine=24313891;
 //BA.debugLineNum = 24313891;BA.debugLine="p.Tag = \"static\"";
[_p setTag:(NSObject*)(@"static")];
B4IRDebugUtils.currentLine=24313892;
 //BA.debugLineNum = 24313892;BA.debugLine="StopScrolling";
[__ref _stopscrolling /*NSString**/ :nil];
 }else {
B4IRDebugUtils.currentLine=24313894;
 //BA.debugLineNum = 24313894;BA.debugLine="p.Tag = \"\"";
[_p setTag:(NSObject*)(@"")];
B4IRDebugUtils.currentLine=24313895;
 //BA.debugLineNum = 24313895;BA.debugLine="Dim duplicateText As String = t & \"   \" & t";
_duplicatetext = [@[_t,@"   ",_t] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=24313896;
 //BA.debugLineNum = 24313896;BA.debugLine="Dim Width As Float = MeasureTextWidth(duplicateT";
_width = [__ref _measuretextwidth /*float*/ :nil :_duplicatetext :__ref->__fnt /*B4XFont**/ ];
B4IRDebugUtils.currentLine=24313897;
 //BA.debugLineNum = 24313897;BA.debugLine="p.Width = Width";
[_p setWidth:_width];
B4IRDebugUtils.currentLine=24313898;
 //BA.debugLineNum = 24313898;BA.debugLine="xlbl.Width = Width";
[_xlbl setWidth:_width];
B4IRDebugUtils.currentLine=24313899;
 //BA.debugLineNum = 24313899;BA.debugLine="xlbl.Text = duplicateText";
[_xlbl setText:_duplicatetext];
B4IRDebugUtils.currentLine=24313900;
 //BA.debugLineNum = 24313900;BA.debugLine="StartScrolling (p, originalTextWidth)";
[__ref _startscrolling /*void*/ :nil :_p :_originaltextwidth];
 };
B4IRDebugUtils.currentLine=24313902;
 //BA.debugLineNum = 24313902;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_scrollinglabel*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"scrollinglabel";
B4IRDebugUtils.currentLine=24051712;
 //BA.debugLineNum = 24051712;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=24051713;
 //BA.debugLineNum = 24051713;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=24051714;
 //BA.debugLineNum = 24051714;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=24051715;
 //BA.debugLineNum = 24051715;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=24051716;
 //BA.debugLineNum = 24051716;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=24051717;
 //BA.debugLineNum = 24051717;BA.debugLine="Private mText As String";
self->__mtext = @"";
B4IRDebugUtils.currentLine=24051718;
 //BA.debugLineNum = 24051718;BA.debugLine="Private taskIndex As Int";
self->__taskindex = 0;
B4IRDebugUtils.currentLine=24051719;
 //BA.debugLineNum = 24051719;BA.debugLine="Private WidthPerSecond As Int = 100dip";
self->__widthpersecond = ((int) (100));
B4IRDebugUtils.currentLine=24051720;
 //BA.debugLineNum = 24051720;BA.debugLine="Private fnt As B4XFont";
self->__fnt = [B4XFont new];
B4IRDebugUtils.currentLine=24051721;
 //BA.debugLineNum = 24051721;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=24051722;
 //BA.debugLineNum = 24051722;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=24051723;
 //BA.debugLineNum = 24051723;BA.debugLine="Public StartPositionDelay As Int = 1000";
self->__startpositiondelay = (int) (1000);
B4IRDebugUtils.currentLine=24051724;
 //BA.debugLineNum = 24051724;BA.debugLine="Private mTextColor As Int = xui.Color_Black";
self->__mtextcolor = [__ref->__xui /*B4IXUI**/  Color_Black];
B4IRDebugUtils.currentLine=24051725;
 //BA.debugLineNum = 24051725;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_scrollinglabel*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _p = nil;
B4XViewWrapper* _l = nil;
B4IRDebugUtils.currentLine=24182784;
 //BA.debugLineNum = 24182784;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=24182785;
 //BA.debugLineNum = 24182785;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=24182786;
 //BA.debugLineNum = 24182786;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=24182788;
 //BA.debugLineNum = 24182788;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=24182789;
 //BA.debugLineNum = 24182789;BA.debugLine="mBase.AddView(p, 0, 0, mBase.Width, mBase.Height)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_p).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=24182790;
 //BA.debugLineNum = 24182790;BA.debugLine="mText = Lbl.Text";
__ref->__mtext /*NSString**/  = [_lbl Text];
B4IRDebugUtils.currentLine=24182791;
 //BA.debugLineNum = 24182791;BA.debugLine="Dim l As B4XView = Lbl";
_l = [B4XViewWrapper new];
_l.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=24182792;
 //BA.debugLineNum = 24182792;BA.debugLine="fnt = l.Font";
__ref->__fnt /*B4XFont**/  = [_l Font];
B4IRDebugUtils.currentLine=24182793;
 //BA.debugLineNum = 24182793;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=24182794;
 //BA.debugLineNum = 24182794;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (2))) :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=24182795;
 //BA.debugLineNum = 24182795;BA.debugLine="cvs.Initialize(p)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((_p).object)];
B4IRDebugUtils.currentLine=24182796;
 //BA.debugLineNum = 24182796;BA.debugLine="setText(mText)";
[__ref _settext /*NSString**/ :nil :__ref->__mtext /*NSString**/ ];
B4IRDebugUtils.currentLine=24182797;
 //BA.debugLineNum = 24182797;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _gettext:(b4i_scrollinglabel*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"gettext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"gettext" :nil]);}
B4IRDebugUtils.currentLine=24379392;
 //BA.debugLineNum = 24379392;BA.debugLine="Public Sub getText As String";
B4IRDebugUtils.currentLine=24379393;
 //BA.debugLineNum = 24379393;BA.debugLine="Return mText";
if (true) return __ref->__mtext /*NSString**/ ;
B4IRDebugUtils.currentLine=24379394;
 //BA.debugLineNum = 24379394;BA.debugLine="End Sub";
return @"";
}
- (int)  _gettextcolor:(b4i_scrollinglabel*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"gettextcolor"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"gettextcolor" :nil]).intValue;}
B4IRDebugUtils.currentLine=24707072;
 //BA.debugLineNum = 24707072;BA.debugLine="Public Sub getTextColor As Int";
B4IRDebugUtils.currentLine=24707073;
 //BA.debugLineNum = 24707073;BA.debugLine="Return mTextColor";
if (true) return __ref->__mtextcolor /*int*/ ;
B4IRDebugUtils.currentLine=24707074;
 //BA.debugLineNum = 24707074;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_scrollinglabel*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=24117248;
 //BA.debugLineNum = 24117248;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=24117249;
 //BA.debugLineNum = 24117249;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=24117250;
 //BA.debugLineNum = 24117250;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=24117251;
 //BA.debugLineNum = 24117251;BA.debugLine="End Sub";
return @"";
}
- (float)  _measuretextwidth:(b4i_scrollinglabel*) __ref :(NSString*) _s :(B4XFont*) _font1{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"measuretextwidth"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"measuretextwidth::" :@[[B4I nilToNSNull:_s],[B4I nilToNSNull:_font1]]]).floatValue;}
B4IRDebugUtils.currentLine=24576000;
 //BA.debugLineNum = 24576000;BA.debugLine="Private Sub MeasureTextWidth(s As String, font1 As";
B4IRDebugUtils.currentLine=24576001;
 //BA.debugLineNum = 24576001;BA.debugLine="Return cvs.MeasureText(s, font1).Width";
if (true) return [[__ref->__cvs /*B4XCanvas**/  MeasureText:_s :_font1] Width];
B4IRDebugUtils.currentLine=24576002;
 //BA.debugLineNum = 24576002;BA.debugLine="End Sub";
return 0.0f;
}
- (NSString*)  _stopscrolling:(b4i_scrollinglabel*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"stopscrolling"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"stopscrolling" :nil]);}
B4IRDebugUtils.currentLine=24444928;
 //BA.debugLineNum = 24444928;BA.debugLine="Private Sub StopScrolling";
B4IRDebugUtils.currentLine=24444929;
 //BA.debugLineNum = 24444929;BA.debugLine="taskIndex = taskIndex + 1";
__ref->__taskindex /*int*/  = (int) (__ref->__taskindex /*int*/ +1);
B4IRDebugUtils.currentLine=24444930;
 //BA.debugLineNum = 24444930;BA.debugLine="End Sub";
return @"";
}
- (void)  _startscrolling:(b4i_scrollinglabel*) __ref :(B4XViewWrapper*) _p :(float) _originalwidth{
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"startscrolling"])
	 {[B4IDebug delegate:self.bi :@"startscrolling::" :@[[B4I nilToNSNull:_p],@(_originalwidth)]]; return;}
ResumableSub_scrollinglabel_StartScrolling* rsub = [[ResumableSub_scrollinglabel_StartScrolling alloc] init:self : __ref: _p: _originalwidth];
[rsub resume:self.bi :nil];
}
//-954497583
- (NSString*)  _settextcolor:(b4i_scrollinglabel*) __ref :(int) _c{
__ref = self;
B4IRDebugUtils.currentModule=@"scrollinglabel";
if ([B4IDebug shouldDelegate: @"settextcolor"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settextcolor:" :@[@(_c)]]);}
B4IRDebugUtils.currentLine=24641536;
 //BA.debugLineNum = 24641536;BA.debugLine="Public Sub setTextColor(c As Int)";
B4IRDebugUtils.currentLine=24641537;
 //BA.debugLineNum = 24641537;BA.debugLine="mTextColor = c";
__ref->__mtextcolor /*int*/  = _c;
B4IRDebugUtils.currentLine=24641538;
 //BA.debugLineNum = 24641538;BA.debugLine="setText(mText)";
[__ref _settext /*NSString**/ :nil :__ref->__mtext /*NSString**/ ];
B4IRDebugUtils.currentLine=24641539;
 //BA.debugLineNum = 24641539;BA.debugLine="End Sub";
return @"";
}
@end