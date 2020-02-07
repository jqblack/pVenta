
#import "b4i_b4xplusminus.h"
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
#import "b4i_b4xsearchtemplate.h"
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"

@interface ResumableSub_b4xplusminus_StartDownLoop :B4IResumableSub 
- (instancetype) init: (b4i_b4xplusminus*) parent1 :(b4i_b4xplusminus*) __ref1 :(BOOL) _up1;
@end
@implementation ResumableSub_b4xplusminus_StartDownLoop {
b4i_b4xplusminus* parent;
b4i_b4xplusminus* __ref;
BOOL _up;
int _myindex;
}
- (instancetype) init: (b4i_b4xplusminus*) parent1 :(b4i_b4xplusminus*) __ref1 :(BOOL) _up1 {
self->__ref = __ref1;
self->_up = _up1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xplusminus* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xplusminus";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=20185089;
 //BA.debugLineNum = 20185089;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref->__loopindex /*int*/  = (int) (__ref->__loopindex /*int*/ +1);
B4IRDebugUtils.currentLine=20185090;
 //BA.debugLineNum = 20185090;BA.debugLine="If mRapid = False Then Return";
if (true) break;

case 1:
//if
self->_state = 6;
if (__ref->__mrapid /*BOOL*/ ==false) { 
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
B4IRDebugUtils.currentLine=20185091;
 //BA.debugLineNum = 20185091;BA.debugLine="Dim MyIndex As Int = LoopIndex";
_myindex = __ref->__loopindex /*int*/ ;
B4IRDebugUtils.currentLine=20185092;
 //BA.debugLineNum = 20185092;BA.debugLine="Sleep(RapidPeriod1)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xplusminus" :@"startdownloop"] :__ref->__rapidperiod1 /*int*/ ];
self->_state = 19;
return;
case 19:
//C
self->_state = 7;
;
B4IRDebugUtils.currentLine=20185093;
 //BA.debugLineNum = 20185093;BA.debugLine="Do While MyIndex = LoopIndex";
if (true) break;

case 7:
//do while
self->_state = 18;
while (_myindex==__ref->__loopindex /*int*/ ) {
self->_state = 9;
if (true) break;
}
if (true) break;

case 9:
//C
self->_state = 10;
B4IRDebugUtils.currentLine=20185094;
 //BA.debugLineNum = 20185094;BA.debugLine="If Up Then Increment Else Decrement";
if (true) break;

case 10:
//if
self->_state = 17;
if (_up) { 
self->_state = 12;
;}
else {
self->_state = 14;
;}if (true) break;

case 12:
//C
self->_state = 17;
[__ref _increment /*NSString**/ :nil];
if (true) break;

case 14:
//C
self->_state = 17;
[__ref _decrement /*NSString**/ :nil];
if (true) break;

case 17:
//C
self->_state = 7;
;
B4IRDebugUtils.currentLine=20185095;
 //BA.debugLineNum = 20185095;BA.debugLine="Sleep(RapidPeriod2)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xplusminus" :@"startdownloop"] :__ref->__rapidperiod2 /*int*/ ];
self->_state = 20;
return;
case 20:
//C
self->_state = 7;
;
 if (true) break;

case 18:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=20185097;
 //BA.debugLineNum = 20185097;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xplusminus 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xplusminus) instance released.");
}

- (NSString*)  _base_resize:(b4i_b4xplusminus*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
B4IRDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="If Formation = \"Horizontal\" Then";
if ([__ref->__formation /*NSString**/  isEqual:@"Horizontal"]) { 
B4IRDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, 0, ArrowsSize,";
[__ref->__pnlminus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (__ref->__arrowssize /*int*/ ) :(float) (_height)];
B4IRDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width - ArrowsSize,";
[__ref->__pnlplus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (_width-__ref->__arrowssize /*int*/ ) :(float) (0) :(float) (__ref->__arrowssize /*int*/ ) :(float) (_height)];
B4IRDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__mainlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
 }else if([__ref->__formation /*NSString**/  isEqual:@"Vertical"]) { 
B4IRDebugUtils.currentLine=19398662;
 //BA.debugLineNum = 19398662;BA.debugLine="pnlPlus.SetLayoutAnimated(0, 0, 0, Width, Arrows";
[__ref->__pnlplus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (__ref->__arrowssize /*int*/ )];
B4IRDebugUtils.currentLine=19398663;
 //BA.debugLineNum = 19398663;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
[__ref->__pnlminus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (_height-__ref->__arrowssize /*int*/ ) :(float) (_width) :(float) (__ref->__arrowssize /*int*/ )];
B4IRDebugUtils.currentLine=19398664;
 //BA.debugLineNum = 19398664;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__mainlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
 }else {
B4IRDebugUtils.currentLine=19398666;
 //BA.debugLineNum = 19398666;BA.debugLine="pnlMinus.SetLayoutAnimated(0, 0, Height - Arrows";
[__ref->__pnlminus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (_height-__ref->__arrowssize /*int*/ ) :(float) (_width/(double)2) :(float) (__ref->__arrowssize /*int*/ )];
B4IRDebugUtils.currentLine=19398667;
 //BA.debugLineNum = 19398667;BA.debugLine="pnlPlus.SetLayoutAnimated(0, Width / 2, pnlMinus";
[__ref->__pnlplus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (_width/(double)2) :[__ref->__pnlminus /*B4XViewWrapper**/  Top] :[__ref->__pnlminus /*B4XViewWrapper**/  Width] :[__ref->__pnlminus /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=19398668;
 //BA.debugLineNum = 19398668;BA.debugLine="MainLabel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__mainlabel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height-__ref->__arrowssize /*int*/ +((int) (5)))];
 };
B4IRDebugUtils.currentLine=19398670;
 //BA.debugLineNum = 19398670;BA.debugLine="lblMinus.SetLayoutAnimated(0, 0, 0, pnlMinus.Widt";
[__ref->__lblminus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[__ref->__pnlminus /*B4XViewWrapper**/  Width] :[__ref->__pnlminus /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=19398671;
 //BA.debugLineNum = 19398671;BA.debugLine="lblPlus.SetLayoutAnimated(0, 0, 0, pnlPlus.Width,";
[__ref->__lblplus /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[__ref->__pnlplus /*B4XViewWrapper**/  Width] :[__ref->__pnlplus /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=19398672;
 //BA.debugLineNum = 19398672;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xplusminus*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xplusminus";
B4IRDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=19202051;
 //BA.debugLineNum = 19202051;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="Public pnlPlus, pnlMinus As B4XView";
self->__pnlplus = [B4XViewWrapper new];
self->__pnlminus = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=19202055;
 //BA.debugLineNum = 19202055;BA.debugLine="Public lblPlus, lblMinus As B4XView";
self->__lblplus = [B4XViewWrapper new];
self->__lblminus = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="Public Formation As String";
self->__formation = @"";
B4IRDebugUtils.currentLine=19202057;
 //BA.debugLineNum = 19202057;BA.debugLine="Public mCyclic As Boolean";
self->__mcyclic = false;
B4IRDebugUtils.currentLine=19202058;
 //BA.debugLineNum = 19202058;BA.debugLine="Public mRapid As Boolean";
self->__mrapid = false;
B4IRDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="Public MainLabel As B4XView";
self->__mainlabel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="Public ArrowsSize As Int = 30dip";
self->__arrowssize = ((int) (30));
B4IRDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="Private mStringItems As List";
self->__mstringitems = [B4IList new];
B4IRDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="Private mStartRange, mInterval, mEndRange As Doub";
self->__mstartrange = 0.0;
self->__minterval = 0.0;
self->__mendrange = 0.0;
B4IRDebugUtils.currentLine=19202063;
 //BA.debugLineNum = 19202063;BA.debugLine="Private mSelectedIndex As Int = -1";
self->__mselectedindex = (int) (-1);
B4IRDebugUtils.currentLine=19202064;
 //BA.debugLineNum = 19202064;BA.debugLine="Private LoopIndex As Int";
self->__loopindex = 0;
B4IRDebugUtils.currentLine=19202065;
 //BA.debugLineNum = 19202065;BA.debugLine="Public RapidPeriod1 As Int = 1000";
self->__rapidperiod1 = (int) (1000);
B4IRDebugUtils.currentLine=19202066;
 //BA.debugLineNum = 19202066;BA.debugLine="Public RapidPeriod2 As Int = 30";
self->__rapidperiod2 = (int) (30);
B4IRDebugUtils.currentLine=19202067;
 //BA.debugLineNum = 19202067;BA.debugLine="Public Formatter As B4XFormatter";
self->__formatter = [b4i_b4xformatter new];
B4IRDebugUtils.currentLine=19202068;
 //BA.debugLineNum = 19202068;BA.debugLine="Private StringMode As Boolean";
self->__stringmode = false;
B4IRDebugUtils.currentLine=19202069;
 //BA.debugLineNum = 19202069;BA.debugLine="Private Size As Int";
self->__size = 0;
B4IRDebugUtils.currentLine=19202070;
 //BA.debugLineNum = 19202070;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createlabel:(b4i_b4xplusminus*) __ref :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"createlabel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"createlabel:" :@[[B4I nilToNSNull:_text]]]);}
B4ILabelWrapper* _lbl = nil;
B4XViewWrapper* _xlbl = nil;
B4IRDebugUtils.currentLine=20250624;
 //BA.debugLineNum = 20250624;BA.debugLine="Private Sub CreateLabel (text As String) As B4XVie";
B4IRDebugUtils.currentLine=20250625;
 //BA.debugLineNum = 20250625;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=20250626;
 //BA.debugLineNum = 20250626;BA.debugLine="lbl.Initialize(\"\")";
[_lbl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=20250627;
 //BA.debugLineNum = 20250627;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=20250628;
 //BA.debugLineNum = 20250628;BA.debugLine="xlbl.Font = xui.CreateMaterialIcons(30)";
[_xlbl setFont:[__ref->__xui /*B4IXUI**/  CreateMaterialIcons:(float) (30)]];
B4IRDebugUtils.currentLine=20250629;
 //BA.debugLineNum = 20250629;BA.debugLine="xlbl.Text = text";
[_xlbl setText:_text];
B4IRDebugUtils.currentLine=20250630;
 //BA.debugLineNum = 20250630;BA.debugLine="xlbl.TextColor = MainLabel.TextColor";
[_xlbl setTextColor:[__ref->__mainlabel /*B4XViewWrapper**/  TextColor]];
B4IRDebugUtils.currentLine=20250631;
 //BA.debugLineNum = 20250631;BA.debugLine="Return xlbl";
if (true) return _xlbl;
B4IRDebugUtils.currentLine=20250632;
 //BA.debugLineNum = 20250632;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _decrement:(b4i_b4xplusminus*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"decrement"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"decrement" :nil]);}
B4IRDebugUtils.currentLine=19922944;
 //BA.debugLineNum = 19922944;BA.debugLine="Public Sub Decrement";
B4IRDebugUtils.currentLine=19922945;
 //BA.debugLineNum = 19922945;BA.debugLine="If mSelectedIndex <= 0 Then";
if (__ref->__mselectedindex /*int*/ <=0) { 
B4IRDebugUtils.currentLine=19922946;
 //BA.debugLineNum = 19922946;BA.debugLine="If mCyclic Then";
if (__ref->__mcyclic /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=19922947;
 //BA.debugLineNum = 19922947;BA.debugLine="mSelectedIndex = Size";
__ref->__mselectedindex /*int*/  = __ref->__size /*int*/ ;
 }else {
B4IRDebugUtils.currentLine=19922949;
 //BA.debugLineNum = 19922949;BA.debugLine="mSelectedIndex = 0";
__ref->__mselectedindex /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=19922950;
 //BA.debugLineNum = 19922950;BA.debugLine="Return";
if (true) return @"";
 };
 };
B4IRDebugUtils.currentLine=19922953;
 //BA.debugLineNum = 19922953;BA.debugLine="SetIndex(mSelectedIndex - 1, True)";
[__ref _setindex /*NSString**/ :nil :(int) (__ref->__mselectedindex /*int*/ -1) :true];
B4IRDebugUtils.currentLine=19922954;
 //BA.debugLineNum = 19922954;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setindex:(b4i_b4xplusminus*) __ref :(int) _i :(BOOL) _raiseevent{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"setindex"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setindex::" :@[@(_i),@(_raiseevent)]]);}
NSObject* _value = nil;
B4IRDebugUtils.currentLine=19791872;
 //BA.debugLineNum = 19791872;BA.debugLine="Private Sub SetIndex(i As Int, RaiseEvent As Boole";
B4IRDebugUtils.currentLine=19791873;
 //BA.debugLineNum = 19791873;BA.debugLine="If i >= Size Then i = -1";
if (_i>=__ref->__size /*int*/ ) { 
_i = (int) (-1);};
B4IRDebugUtils.currentLine=19791874;
 //BA.debugLineNum = 19791874;BA.debugLine="mSelectedIndex = i";
__ref->__mselectedindex /*int*/  = _i;
B4IRDebugUtils.currentLine=19791875;
 //BA.debugLineNum = 19791875;BA.debugLine="If mSelectedIndex = -1 Then";
if (__ref->__mselectedindex /*int*/ ==-1) { 
B4IRDebugUtils.currentLine=19791876;
 //BA.debugLineNum = 19791876;BA.debugLine="MainLabel.Text = \"\"";
[__ref->__mainlabel /*B4XViewWrapper**/  setText:@""];
 }else {
B4IRDebugUtils.currentLine=19791878;
 //BA.debugLineNum = 19791878;BA.debugLine="Dim value As Object = GetValueImpl (mSelectedInd";
_value = [__ref _getvalueimpl /*NSObject**/ :nil :__ref->__mselectedindex /*int*/ ];
B4IRDebugUtils.currentLine=19791879;
 //BA.debugLineNum = 19791879;BA.debugLine="If StringMode Then";
if (__ref->__stringmode /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=19791880;
 //BA.debugLineNum = 19791880;BA.debugLine="InternalSetTextOrCSBuilderToLabel(MainLabel, va";
[__ref _internalsettextorcsbuildertolabel /*NSString**/ :nil :__ref->__mainlabel /*B4XViewWrapper**/  :_value];
 }else {
B4IRDebugUtils.currentLine=19791882;
 //BA.debugLineNum = 19791882;BA.debugLine="MainLabel.Text = Formatter.Format(value)";
[__ref->__mainlabel /*B4XViewWrapper**/  setText:[__ref->__formatter /*b4i_b4xformatter**/  _format /*NSString**/ :nil :[self.bi ObjectToNumber:_value].doubleValue]];
 };
B4IRDebugUtils.currentLine=19791884;
 //BA.debugLineNum = 19791884;BA.debugLine="If RaiseEvent And xui.SubExists(mCallBack, mEven";
if (_raiseevent && [__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_valuechanged"] componentsJoinedByString:@""] :(int) (1)]) { 
B4IRDebugUtils.currentLine=19791885;
 //BA.debugLineNum = 19791885;BA.debugLine="CallSub2(mCallBack, mEventName & \"_valuechanged";
[self->___c CallSub2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_valuechanged"] componentsJoinedByString:@""] :_value];
 };
 };
B4IRDebugUtils.currentLine=19791888;
 //BA.debugLineNum = 19791888;BA.debugLine="lblPlus.Enabled = Size > 0 And (mCyclic Or mSelec";
[__ref->__lblplus /*B4XViewWrapper**/  setEnabled:__ref->__size /*int*/ >0 && (__ref->__mcyclic /*BOOL*/  || __ref->__mselectedindex /*int*/ <__ref->__size /*int*/ -1)];
B4IRDebugUtils.currentLine=19791889;
 //BA.debugLineNum = 19791889;BA.debugLine="lblMinus.Enabled = Size > 0 And (mCyclic Or mSele";
[__ref->__lblminus /*B4XViewWrapper**/  setEnabled:__ref->__size /*int*/ >0 && (__ref->__mcyclic /*BOOL*/  || __ref->__mselectedindex /*int*/ >0)];
B4IRDebugUtils.currentLine=19791890;
 //BA.debugLineNum = 19791890;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xplusminus*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4INativeObject* _nme = nil;
B4IPanelWrapper* _p = nil;
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
B4IRDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=19333123;
 //BA.debugLineNum = 19333123;BA.debugLine="MainLabel = lbl";
__ref->__mainlabel /*B4XViewWrapper**/ .object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=19333124;
 //BA.debugLineNum = 19333124;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
[__ref->__mainlabel /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=19333127;
 //BA.debugLineNum = 19333127;BA.debugLine="pnlPlus = xui.CreatePanel(\"\")";
__ref->__pnlplus /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=19333128;
 //BA.debugLineNum = 19333128;BA.debugLine="pnlMinus = xui.CreatePanel(\"\")";
__ref->__pnlminus /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=19333129;
 //BA.debugLineNum = 19333129;BA.debugLine="Dim nme As NativeObject = Me";
_nme = [B4INativeObject new];
_nme.object = (NSObject*)(self);
B4IRDebugUtils.currentLine=19333130;
 //BA.debugLineNum = 19333130;BA.debugLine="For Each p As Panel In Array(pnlPlus, pnlMinus)";
_p = [B4IPanelWrapper new];
{
const id<B4IIterable> group9 = [[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((__ref->__pnlplus /*B4XViewWrapper**/ ).object)],[B4I nilToNSNull:(NSObject*)((__ref->__pnlminus /*B4XViewWrapper**/ ).object)]]];
const int groupLen9 = group9.Size
;int index9 = 0;
;
for (; index9 < groupLen9;index9++){
_p.object = (B4IPanelView*)([group9 Get:index9]);
B4IRDebugUtils.currentLine=19333131;
 //BA.debugLineNum = 19333131;BA.debugLine="Dim no As NativeObject = p";
_no = [B4INativeObject new];
_no.object = (NSObject*)((_p).object);
B4IRDebugUtils.currentLine=19333132;
 //BA.debugLineNum = 19333132;BA.debugLine="no.RunMethod(\"addGestureRecognizer:\", Array(nme.";
[_no RunMethod:@"addGestureRecognizer:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(([_nme RunMethod:@"CreateRecognizer" :(B4IArray*)(nil)]).object)]]]];
 }
};
B4IRDebugUtils.currentLine=19333138;
 //BA.debugLineNum = 19333138;BA.debugLine="pnlPlus.Tag = True";
[__ref->__pnlplus /*B4XViewWrapper**/  setTag:(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=19333139;
 //BA.debugLineNum = 19333139;BA.debugLine="pnlMinus.Tag = False";
[__ref->__pnlminus /*B4XViewWrapper**/  setTag:(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=19333140;
 //BA.debugLineNum = 19333140;BA.debugLine="Formation = Props.Get(\"Orientation\")";
__ref->__formation /*NSString**/  = [self.bi ObjectToString:[_props Get:(NSObject*)(@"Orientation")]];
B4IRDebugUtils.currentLine=19333141;
 //BA.debugLineNum = 19333141;BA.debugLine="mCyclic = Props.Get(\"Cyclic\")";
__ref->__mcyclic /*BOOL*/  = [self.bi ObjectToBoolean:[_props Get:(NSObject*)(@"Cyclic")]];
B4IRDebugUtils.currentLine=19333142;
 //BA.debugLineNum = 19333142;BA.debugLine="mRapid = Props.Get(\"Rapid\")";
__ref->__mrapid /*BOOL*/  = [self.bi ObjectToBoolean:[_props Get:(NSObject*)(@"Rapid")]];
B4IRDebugUtils.currentLine=19333143;
 //BA.debugLineNum = 19333143;BA.debugLine="Formatter.GetDefaultFormat.FormatFont = MainLabel";
[__ref->__formatter /*b4i_b4xformatter**/  _getdefaultformat /*_b4xformatdata**/ :nil]->_FormatFont /*B4XFont**/  = [__ref->__mainlabel /*B4XViewWrapper**/  Font];
B4IRDebugUtils.currentLine=19333144;
 //BA.debugLineNum = 19333144;BA.debugLine="Formatter.GetDefaultFormat.TextColor = MainLabel.";
[__ref->__formatter /*b4i_b4xformatter**/  _getdefaultformat /*_b4xformatdata**/ :nil]->_TextColor /*int*/  = [__ref->__mainlabel /*B4XViewWrapper**/  TextColor];
B4IRDebugUtils.currentLine=19333145;
 //BA.debugLineNum = 19333145;BA.debugLine="If Formation = \"Horizontal\" Then";
if ([__ref->__formation /*NSString**/  isEqual:@"Horizontal"]) { 
B4IRDebugUtils.currentLine=19333146;
 //BA.debugLineNum = 19333146;BA.debugLine="lblPlus = CreateLabel(Chr(0xE315))";
__ref->__lblplus /*B4XViewWrapper**/  = [__ref _createlabel /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe315)))]];
B4IRDebugUtils.currentLine=19333147;
 //BA.debugLineNum = 19333147;BA.debugLine="lblMinus = CreateLabel(Chr(0xE314))";
__ref->__lblminus /*B4XViewWrapper**/  = [__ref _createlabel /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe314)))]];
 }else {
B4IRDebugUtils.currentLine=19333149;
 //BA.debugLineNum = 19333149;BA.debugLine="lblPlus = CreateLabel(Chr(0xE316))";
__ref->__lblplus /*B4XViewWrapper**/  = [__ref _createlabel /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe316)))]];
B4IRDebugUtils.currentLine=19333150;
 //BA.debugLineNum = 19333150;BA.debugLine="lblMinus = CreateLabel(Chr(0xE313))";
__ref->__lblminus /*B4XViewWrapper**/  = [__ref _createlabel /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe313)))]];
 };
B4IRDebugUtils.currentLine=19333152;
 //BA.debugLineNum = 19333152;BA.debugLine="lblMinus.SetTextAlignment(\"CENTER\", \"CENTER\")";
[__ref->__lblminus /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=19333153;
 //BA.debugLineNum = 19333153;BA.debugLine="lblPlus.SetTextAlignment(\"CENTER\", \"CENTER\")";
[__ref->__lblplus /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=19333154;
 //BA.debugLineNum = 19333154;BA.debugLine="MainLabel.SetTextAlignment(\"CENTER\", \"CENTER\")";
[__ref->__mainlabel /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=19333155;
 //BA.debugLineNum = 19333155;BA.debugLine="mBase.AddView(MainLabel, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mainlabel /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=19333156;
 //BA.debugLineNum = 19333156;BA.debugLine="mBase.AddView(pnlPlus, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__pnlplus /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=19333157;
 //BA.debugLineNum = 19333157;BA.debugLine="mBase.AddView(pnlMinus, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__pnlminus /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=19333158;
 //BA.debugLineNum = 19333158;BA.debugLine="pnlPlus.AddView(lblPlus, 0, 0, 0, 0)";
[__ref->__pnlplus /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__lblplus /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=19333159;
 //BA.debugLineNum = 19333159;BA.debugLine="pnlMinus.AddView(lblMinus, 0, 0, 0, 0)";
[__ref->__pnlminus /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__lblminus /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=19333160;
 //BA.debugLineNum = 19333160;BA.debugLine="SetIndex(-1, False)";
[__ref _setindex /*NSString**/ :nil :(int) (-1) :false];
B4IRDebugUtils.currentLine=19333161;
 //BA.debugLineNum = 19333161;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=19333162;
 //BA.debugLineNum = 19333162;BA.debugLine="End Sub";
return @"";
}
- (NSObject*)  _getselectedvalue:(b4i_b4xplusminus*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"getselectedvalue"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getselectedvalue" :nil]);}
B4IRDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub getSelectedValue As Object";
B4IRDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="Return GetValueImpl (mSelectedIndex)";
if (true) return [__ref _getvalueimpl /*NSObject**/ :nil :__ref->__mselectedindex /*int*/ ];
B4IRDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getvalueimpl:(b4i_b4xplusminus*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"getvalueimpl"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getvalueimpl:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Private Sub GetValueImpl (Index As Int) As Object";
B4IRDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="If StringMode Then";
if (__ref->__stringmode /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="Return mStringItems.Get(Index)";
if (true) return [__ref->__mstringitems /*B4IList**/  Get:_index];
 }else {
B4IRDebugUtils.currentLine=19726340;
 //BA.debugLineNum = 19726340;BA.debugLine="If Index = Size - 1 Then";
if (_index==__ref->__size /*int*/ -1) { 
B4IRDebugUtils.currentLine=19726341;
 //BA.debugLineNum = 19726341;BA.debugLine="Return mEndRange";
if (true) return (NSObject*)(@(__ref->__mendrange /*double*/ ));
 }else {
B4IRDebugUtils.currentLine=19726343;
 //BA.debugLineNum = 19726343;BA.debugLine="Return mStartRange + Index * mInterval";
if (true) return (NSObject*)(@(__ref->__mstartrange /*double*/ +_index*__ref->__minterval /*double*/ ));
 };
 };
B4IRDebugUtils.currentLine=19726346;
 //BA.debugLineNum = 19726346;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _increment:(b4i_b4xplusminus*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"increment"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"increment" :nil]);}
double _v1 = 0.0;
double _v2 = 0.0;
B4IRDebugUtils.currentLine=19857408;
 //BA.debugLineNum = 19857408;BA.debugLine="Public Sub Increment";
B4IRDebugUtils.currentLine=19857409;
 //BA.debugLineNum = 19857409;BA.debugLine="If mSelectedIndex = Size - 3 And StringMode = Fal";
if (__ref->__mselectedindex /*int*/ ==__ref->__size /*int*/ -3 && __ref->__stringmode /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=19857410;
 //BA.debugLineNum = 19857410;BA.debugLine="Dim v1 As Double = GetValueImpl(mSelectedIndex +";
_v1 = [self.bi ObjectToNumber:[__ref _getvalueimpl /*NSObject**/ :nil :(int) (__ref->__mselectedindex /*int*/ +1)]].doubleValue;
B4IRDebugUtils.currentLine=19857411;
 //BA.debugLineNum = 19857411;BA.debugLine="Dim v2 As Double = GetValueImpl(mSelectedIndex +";
_v2 = [self.bi ObjectToNumber:[__ref _getvalueimpl /*NSObject**/ :nil :(int) (__ref->__mselectedindex /*int*/ +2)]].doubleValue;
B4IRDebugUtils.currentLine=19857412;
 //BA.debugLineNum = 19857412;BA.debugLine="If Formatter.Format(v1) = Formatter.Format(v2) T";
if ([[__ref->__formatter /*b4i_b4xformatter**/  _format /*NSString**/ :nil :_v1] isEqual:[__ref->__formatter /*b4i_b4xformatter**/  _format /*NSString**/ :nil :_v2]]) { 
B4IRDebugUtils.currentLine=19857413;
 //BA.debugLineNum = 19857413;BA.debugLine="mSelectedIndex = mSelectedIndex + 1";
__ref->__mselectedindex /*int*/  = (int) (__ref->__mselectedindex /*int*/ +1);
 };
 };
B4IRDebugUtils.currentLine=19857416;
 //BA.debugLineNum = 19857416;BA.debugLine="If mSelectedIndex >= Size - 1 Then";
if (__ref->__mselectedindex /*int*/ >=__ref->__size /*int*/ -1) { 
B4IRDebugUtils.currentLine=19857417;
 //BA.debugLineNum = 19857417;BA.debugLine="If mCyclic Then";
if (__ref->__mcyclic /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=19857418;
 //BA.debugLineNum = 19857418;BA.debugLine="mSelectedIndex = -1";
__ref->__mselectedindex /*int*/  = (int) (-1);
 }else {
B4IRDebugUtils.currentLine=19857420;
 //BA.debugLineNum = 19857420;BA.debugLine="mSelectedIndex = Size - 1";
__ref->__mselectedindex /*int*/  = (int) (__ref->__size /*int*/ -1);
B4IRDebugUtils.currentLine=19857421;
 //BA.debugLineNum = 19857421;BA.debugLine="Return";
if (true) return @"";
 };
 };
B4IRDebugUtils.currentLine=19857424;
 //BA.debugLineNum = 19857424;BA.debugLine="SetIndex(mSelectedIndex + 1, True)";
[__ref _setindex /*NSString**/ :nil :(int) (__ref->__mselectedindex /*int*/ +1) :true];
B4IRDebugUtils.currentLine=19857425;
 //BA.debugLineNum = 19857425;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xplusminus*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="Formatter.Initialize";
[__ref->__formatter /*b4i_b4xformatter**/  _initialize /*NSString**/ :nil :self.bi];
B4IRDebugUtils.currentLine=19267588;
 //BA.debugLineNum = 19267588;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _internalsettextorcsbuildertolabel:(b4i_b4xplusminus*) __ref :(B4XViewWrapper*) _xlbl :(NSObject*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"internalsettextorcsbuildertolabel"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"internalsettextorcsbuildertolabel::" :@[[B4I nilToNSNull:_xlbl],[B4I nilToNSNull:_text]]]);}
B4ILabelWrapper* _lbl = nil;
B4IRDebugUtils.currentLine=20316160;
 //BA.debugLineNum = 20316160;BA.debugLine="Private Sub InternalSetTextOrCSBuilderToLabel(xlbl";
B4IRDebugUtils.currentLine=20316164;
 //BA.debugLineNum = 20316164;BA.debugLine="If Text Is CSBuilder And xlbl Is Label Then";
if ([_text isKindOfClass: [NSAttributedString class]] && [_xlbl.objectOrNull isKindOfClass: [UILabel class]]) { 
B4IRDebugUtils.currentLine=20316165;
 //BA.debugLineNum = 20316165;BA.debugLine="Dim lbl As Label = xlbl";
_lbl = [B4ILabelWrapper new];
_lbl.object = (UILabel*)((_xlbl).object);
B4IRDebugUtils.currentLine=20316166;
 //BA.debugLineNum = 20316166;BA.debugLine="lbl.AttributedText = Text";
[_lbl setAttributedText:(B4IAttributedString*) [B4IObjectWrapper createWrapper:[B4IAttributedString new] object:(NSAttributedString*)(_text)]];
 }else {
B4IRDebugUtils.currentLine=20316168;
 //BA.debugLineNum = 20316168;BA.debugLine="If GetType(Text) = \"__NSCFNumber\" Then Text = \"\"";
if ([[self->___c GetType:_text] isEqual:@"__NSCFNumber"]) { 
_text = (NSObject*)([@[@"",[self.bi CharToString:((unichar)([self.bi ObjectToNumber:_text].intValue))]] componentsJoinedByString:@""]);};
B4IRDebugUtils.currentLine=20316169;
 //BA.debugLineNum = 20316169;BA.debugLine="xlbl.Text = Text";
[_xlbl setText:[self.bi ObjectToString:_text]];
 };
B4IRDebugUtils.currentLine=20316172;
 //BA.debugLineNum = 20316172;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pnlarrow_touch:(b4i_b4xplusminus*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"pnlarrow_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pnlarrow_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=19988480;
 //BA.debugLineNum = 19988480;BA.debugLine="Private Sub pnlArrow_Touch (Action As Int, X As Fl";
B4IRDebugUtils.currentLine=19988481;
 //BA.debugLineNum = 19988481;BA.debugLine="Touch(Action = lblPlus.TOUCH_ACTION_DOWN, Action";
[__ref _touch /*NSString**/ :nil :_action==[__ref->__lblplus /*B4XViewWrapper**/  TOUCH_ACTION_DOWN] :_action!=[__ref->__lblplus /*B4XViewWrapper**/  TOUCH_ACTION_MOVE] :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]];
B4IRDebugUtils.currentLine=19988482;
 //BA.debugLineNum = 19988482;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _touch:(b4i_b4xplusminus*) __ref :(BOOL) _start :(BOOL) _stop :(B4XViewWrapper*) _pnl{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"touch:::" :@[@(_start),@(_stop),[B4I nilToNSNull:_pnl]]]);}
B4IRDebugUtils.currentLine=20054016;
 //BA.debugLineNum = 20054016;BA.debugLine="Private Sub Touch (Start As Boolean, Stop As Boole";
B4IRDebugUtils.currentLine=20054017;
 //BA.debugLineNum = 20054017;BA.debugLine="If pnl.GetView(0).Enabled = False Then Return";
if ([[_pnl GetView:(int) (0)] Enabled]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=20054018;
 //BA.debugLineNum = 20054018;BA.debugLine="If Start Then";
if (_start) { 
B4IRDebugUtils.currentLine=20054019;
 //BA.debugLineNum = 20054019;BA.debugLine="If pnl.Tag = True Then";
if ([[_pnl Tag] isEqual:(NSObject*)(@(true))]) { 
B4IRDebugUtils.currentLine=20054020;
 //BA.debugLineNum = 20054020;BA.debugLine="Increment";
[__ref _increment /*NSString**/ :nil];
B4IRDebugUtils.currentLine=20054021;
 //BA.debugLineNum = 20054021;BA.debugLine="StartDownLoop(True)";
[__ref _startdownloop /*void*/ :nil :true];
 }else {
B4IRDebugUtils.currentLine=20054023;
 //BA.debugLineNum = 20054023;BA.debugLine="Decrement";
[__ref _decrement /*NSString**/ :nil];
B4IRDebugUtils.currentLine=20054024;
 //BA.debugLineNum = 20054024;BA.debugLine="StartDownLoop(False)";
[__ref _startdownloop /*void*/ :nil :false];
 };
 }else if(_stop) { 
B4IRDebugUtils.currentLine=20054027;
 //BA.debugLineNum = 20054027;BA.debugLine="LoopIndex = LoopIndex + 1";
__ref->__loopindex /*int*/  = (int) (__ref->__loopindex /*int*/ +1);
 };
B4IRDebugUtils.currentLine=20054029;
 //BA.debugLineNum = 20054029;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setnumericrange:(b4i_b4xplusminus*) __ref :(double) _startrange :(double) _endrange :(double) _interval{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"setnumericrange"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setnumericrange:::" :@[@(_startrange),@(_endrange),@(_interval)]]);}
B4IRDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub SetNumericRange (StartRange As Double,";
B4IRDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Size = Ceil((EndRange - StartRange) / Interval) +";
__ref->__size /*int*/  = (int) (ceil((_endrange-_startrange)/(double)_interval)+1);
B4IRDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="mStartRange = StartRange";
__ref->__mstartrange /*double*/  = _startrange;
B4IRDebugUtils.currentLine=19529731;
 //BA.debugLineNum = 19529731;BA.debugLine="mEndRange = EndRange";
__ref->__mendrange /*double*/  = _endrange;
B4IRDebugUtils.currentLine=19529732;
 //BA.debugLineNum = 19529732;BA.debugLine="mInterval = Interval";
__ref->__minterval /*double*/  = _interval;
B4IRDebugUtils.currentLine=19529733;
 //BA.debugLineNum = 19529733;BA.debugLine="StringMode = False";
__ref->__stringmode /*BOOL*/  = false;
B4IRDebugUtils.currentLine=19529734;
 //BA.debugLineNum = 19529734;BA.debugLine="SetIndex(0, False)";
[__ref _setindex /*NSString**/ :nil :(int) (0) :false];
B4IRDebugUtils.currentLine=19529735;
 //BA.debugLineNum = 19529735;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setselectedvalue:(b4i_b4xplusminus*) __ref :(NSObject*) _v{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"setselectedvalue"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setselectedvalue:" :@[[B4I nilToNSNull:_v]]]);}
double _n = 0.0;
B4IRDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub setSelectedValue (v As Object)";
B4IRDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="If StringMode Then";
if (__ref->__stringmode /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="SetIndex(mStringItems.IndexOf(v), False)";
[__ref _setindex /*NSString**/ :nil :[__ref->__mstringitems /*B4IList**/  IndexOf:_v] :false];
 }else {
B4IRDebugUtils.currentLine=19660804;
 //BA.debugLineNum = 19660804;BA.debugLine="Dim n As Double = v";
_n = [self.bi ObjectToNumber:_v].doubleValue;
B4IRDebugUtils.currentLine=19660805;
 //BA.debugLineNum = 19660805;BA.debugLine="SetIndex(Min(Size - 1, Max(0, Round((n - mStartR";
[__ref _setindex /*NSString**/ :nil :(int) (fmin(__ref->__size /*int*/ -1,fmax(0,((double)lrint((_n-__ref->__mstartrange /*double*/ )/(double)__ref->__minterval /*double*/ ))))) :false];
 };
B4IRDebugUtils.currentLine=19660807;
 //BA.debugLineNum = 19660807;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setstringitems:(b4i_b4xplusminus*) __ref :(B4IList*) _list{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"setstringitems"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setstringitems:" :@[[B4I nilToNSNull:_list]]]);}
B4IRDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub SetStringItems (list As List)";
B4IRDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="mStringItems = list";
__ref->__mstringitems /*B4IList**/  = _list;
B4IRDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="StringMode = True";
__ref->__stringmode /*BOOL*/  = true;
B4IRDebugUtils.currentLine=19464195;
 //BA.debugLineNum = 19464195;BA.debugLine="Size = mStringItems.Size";
__ref->__size /*int*/  = [__ref->__mstringitems /*B4IList**/  Size];
B4IRDebugUtils.currentLine=19464196;
 //BA.debugLineNum = 19464196;BA.debugLine="SetIndex(-1, False)";
[__ref _setindex /*NSString**/ :nil :(int) (-1) :false];
B4IRDebugUtils.currentLine=19464197;
 //BA.debugLineNum = 19464197;BA.debugLine="End Sub";
return @"";
}
- (void)  _startdownloop:(b4i_b4xplusminus*) __ref :(BOOL) _up{
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"startdownloop"])
	 {[B4IDebug delegate:self.bi :@"startdownloop:" :@[@(_up)]]; return;}
ResumableSub_b4xplusminus_StartDownLoop* rsub = [[ResumableSub_b4xplusminus_StartDownLoop alloc] init:self : __ref: _up];
[rsub resume:self.bi :nil];
}
//850412006
- (NSString*)  _tap_event:(b4i_b4xplusminus*) __ref :(NSObject*) _rrec{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xplusminus";
if ([B4IDebug shouldDelegate: @"tap_event"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tap_event:" :@[[B4I nilToNSNull:_rrec]]]);}
B4INativeObject* _rec = nil;
int _state = 0;
B4IRDebugUtils.currentLine=20119552;
 //BA.debugLineNum = 20119552;BA.debugLine="Private Sub Tap_Event (rrec As Object)";
B4IRDebugUtils.currentLine=20119553;
 //BA.debugLineNum = 20119553;BA.debugLine="Dim rec As NativeObject = rrec";
_rec = [B4INativeObject new];
_rec.object = (NSObject*)(_rrec);
B4IRDebugUtils.currentLine=20119554;
 //BA.debugLineNum = 20119554;BA.debugLine="Dim state As Int = rec.GetField(\"state\").AsNumber";
_state = [self.bi ObjectToNumber:[[_rec GetField:@"state"] AsNumber]].intValue;
B4IRDebugUtils.currentLine=20119555;
 //BA.debugLineNum = 20119555;BA.debugLine="Touch(state = 1, state <> 2, rec.GetField(\"view\")";
[__ref _touch /*NSString**/ :nil :_state==1 :_state!=2 :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([_rec GetField:@"view"]).object)]];
B4IRDebugUtils.currentLine=20119556;
 //BA.debugLineNum = 20119556;BA.debugLine="End Sub";
return @"";
}
- (NSObject*) CreateRecognizer{
 	 UILongPressGestureRecognizer *rec = [[UILongPressGestureRecognizer alloc] initWithTarget:self action:@selector(action:)];
	 rec.minimumPressDuration = 0;
	return rec;
}
-(void) action:(UIGestureRecognizer*)rec {
	[self.bi raiseEvent:nil event:@"tap_event:" params:@[rec]];
}
@end