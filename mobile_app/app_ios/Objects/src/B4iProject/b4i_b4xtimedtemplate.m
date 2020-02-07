
#import "b4i_b4xtimedtemplate.h"
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
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"

@interface ResumableSub_b4xtimedtemplate_Show :B4IResumableSub 
- (instancetype) init: (b4i_b4xtimedtemplate*) parent1 :(b4i_b4xtimedtemplate*) __ref1 :(b4i_b4xdialog*) _dialog1;
@end
@implementation ResumableSub_b4xtimedtemplate_Show {
b4i_b4xtimedtemplate* parent;
b4i_b4xtimedtemplate* __ref;
b4i_b4xdialog* _dialog;
int _myindex;
}
- (instancetype) init: (b4i_b4xtimedtemplate*) parent1 :(b4i_b4xtimedtemplate*) __ref1 :(b4i_b4xdialog*) _dialog1 {
self->__ref = __ref1;
self->_dialog = _dialog1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xtimedtemplate* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xtimedtemplate";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=22675457;
 //BA.debugLineNum = 22675457;BA.debugLine="CallSub2(mTemplate, \"Show\", Dialog)";
[parent->___c CallSubDebug2:self.bi :__ref->__mtemplate /*NSObject**/  :@"Show" :(NSObject*)(_dialog)];
B4IRDebugUtils.currentLine=22675458;
 //BA.debugLineNum = 22675458;BA.debugLine="AnotherProgressBar1.SetValueNoAnimation(0)";
[__ref->__anotherprogressbar1 /*b4i_anotherprogressbar**/  _setvaluenoanimation /*NSString**/ :nil :(int) (0)];
B4IRDebugUtils.currentLine=22675459;
 //BA.debugLineNum = 22675459;BA.debugLine="AnotherProgressBar1.ValueChangePerSecond = 100 /";
__ref->__anotherprogressbar1 /*b4i_anotherprogressbar**/ ->__valuechangepersecond /*float*/  = (float) (100/(double)(__ref->__timeoutmilliseconds /*int*/ /(double)1000));
B4IRDebugUtils.currentLine=22675460;
 //BA.debugLineNum = 22675460;BA.debugLine="AnotherProgressBar1.Value = 100";
[__ref->__anotherprogressbar1 /*b4i_anotherprogressbar**/  _setvalue: /*int*/ nil :(int) (100)];
B4IRDebugUtils.currentLine=22675461;
 //BA.debugLineNum = 22675461;BA.debugLine="Index = Index + 1";
__ref->__index /*int*/  = (int) (__ref->__index /*int*/ +1);
B4IRDebugUtils.currentLine=22675462;
 //BA.debugLineNum = 22675462;BA.debugLine="Dim MyIndex As Int = Index";
_myindex = __ref->__index /*int*/ ;
B4IRDebugUtils.currentLine=22675463;
 //BA.debugLineNum = 22675463;BA.debugLine="Sleep(TimeoutMilliseconds)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xtimedtemplate" :@"show"] :__ref->__timeoutmilliseconds /*int*/ ];
self->_state = 5;
return;
case 5:
//C
self->_state = 1;
;
B4IRDebugUtils.currentLine=22675464;
 //BA.debugLineNum = 22675464;BA.debugLine="If MyIndex = Index Then";
if (true) break;

case 1:
//if
self->_state = 4;
if (_myindex==__ref->__index /*int*/ ) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=22675465;
 //BA.debugLineNum = 22675465;BA.debugLine="Dialog.Close(xui.DialogResponse_Cancel)";
[_dialog _close /*BOOL*/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Cancel]];
 if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=22675467;
 //BA.debugLineNum = 22675467;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xtimedtemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xtimedtemplate) instance released.");
}

- (B4XViewWrapper*)  _getpanel:(b4i_b4xtimedtemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xtimedtemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4XViewWrapper* _innerpanel = nil;
B4IRDebugUtils.currentLine=22609920;
 //BA.debugLineNum = 22609920;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=22609921;
 //BA.debugLineNum = 22609921;BA.debugLine="If mBase.NumberOfViews = 0 Then";
if ([__ref->__mbase /*B4XViewWrapper**/  NumberOfViews]==0) { 
B4IRDebugUtils.currentLine=22609922;
 //BA.debugLineNum = 22609922;BA.debugLine="Dim InnerPanel As B4XView = CallSub2(mTemplate,";
_innerpanel = [B4XViewWrapper new];
_innerpanel.object = (NSObject*)([self->___c CallSubDebug2:self.bi :__ref->__mtemplate /*NSObject**/  :@"GetPanel" :(NSObject*)(_dialog)]);
B4IRDebugUtils.currentLine=22609923;
 //BA.debugLineNum = 22609923;BA.debugLine="If InnerPanel.Parent.IsInitialized Then InnerPan";
if ([[_innerpanel Parent] IsInitialized]) { 
[_innerpanel RemoveViewFromParent];};
B4IRDebugUtils.currentLine=22609924;
 //BA.debugLineNum = 22609924;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, InnerPanel.Widt";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_innerpanel Width] :(float) ([_innerpanel Height]+((int) (19)))];
B4IRDebugUtils.currentLine=22609925;
 //BA.debugLineNum = 22609925;BA.debugLine="mBase.LoadLayout(\"TimedDialogTemplate\")";
[__ref->__mbase /*B4XViewWrapper**/  LoadLayout:@"TimedDialogTemplate" :self.bi];
B4IRDebugUtils.currentLine=22609926;
 //BA.debugLineNum = 22609926;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=22609927;
 //BA.debugLineNum = 22609927;BA.debugLine="mBase.AddView(InnerPanel, 0, 19dip, InnerPanel.W";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_innerpanel).object) :(float) (0) :(float) (((int) (19))) :[_innerpanel Width] :[_innerpanel Height]];
 };
B4IRDebugUtils.currentLine=22609929;
 //BA.debugLineNum = 22609929;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=22609930;
 //BA.debugLineNum = 22609930;BA.debugLine="End Sub";
return nil;
}
- (void)  _show:(b4i_b4xtimedtemplate*) __ref :(b4i_b4xdialog*) _dialog{
B4IRDebugUtils.currentModule=@"b4xtimedtemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {[B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]; return;}
ResumableSub_b4xtimedtemplate_Show* rsub = [[ResumableSub_b4xtimedtemplate_Show alloc] init:self : __ref: _dialog];
[rsub resume:self.bi :nil];
}
//1816296453
- (NSString*)  _dialogclosed:(b4i_b4xtimedtemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xtimedtemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=22740992;
 //BA.debugLineNum = 22740992;BA.debugLine="Private Sub DialogClosed(Result As Int)";
B4IRDebugUtils.currentLine=22740993;
 //BA.debugLineNum = 22740993;BA.debugLine="Index = Index + 1";
__ref->__index /*int*/  = (int) (__ref->__index /*int*/ +1);
B4IRDebugUtils.currentLine=22740994;
 //BA.debugLineNum = 22740994;BA.debugLine="CallSub2(mTemplate, \"DialogClosed\", Result)";
[self->___c CallSubDebug2:self.bi :__ref->__mtemplate /*NSObject**/  :@"DialogClosed" :(NSObject*)(@(_result))];
B4IRDebugUtils.currentLine=22740995;
 //BA.debugLineNum = 22740995;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xtimedtemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xtimedtemplate";
B4IRDebugUtils.currentLine=22478848;
 //BA.debugLineNum = 22478848;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=22478849;
 //BA.debugLineNum = 22478849;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=22478850;
 //BA.debugLineNum = 22478850;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=22478851;
 //BA.debugLineNum = 22478851;BA.debugLine="Private AnotherProgressBar1 As AnotherProgressBar";
self->__anotherprogressbar1 = [b4i_anotherprogressbar new];
B4IRDebugUtils.currentLine=22478852;
 //BA.debugLineNum = 22478852;BA.debugLine="Private mTemplate As Object";
self->__mtemplate = [NSObject new];
B4IRDebugUtils.currentLine=22478853;
 //BA.debugLineNum = 22478853;BA.debugLine="Public TimeoutMilliseconds As Int = 10000";
self->__timeoutmilliseconds = (int) (10000);
B4IRDebugUtils.currentLine=22478854;
 //BA.debugLineNum = 22478854;BA.debugLine="Private Index As Int";
self->__index = 0;
B4IRDebugUtils.currentLine=22478855;
 //BA.debugLineNum = 22478855;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xtimedtemplate*) __ref :(B4I*) _ba :(NSObject*) _innertemplate{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xtimedtemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_innertemplate]]]);}
B4IRDebugUtils.currentLine=22544384;
 //BA.debugLineNum = 22544384;BA.debugLine="Public Sub Initialize (InnerTemplate As Object)";
B4IRDebugUtils.currentLine=22544385;
 //BA.debugLineNum = 22544385;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"mBase"];
B4IRDebugUtils.currentLine=22544386;
 //BA.debugLineNum = 22544386;BA.debugLine="mTemplate = InnerTemplate";
__ref->__mtemplate /*NSObject**/  = _innertemplate;
B4IRDebugUtils.currentLine=22544388;
 //BA.debugLineNum = 22544388;BA.debugLine="End Sub";
return @"";
}
@end