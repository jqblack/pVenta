
#import "b4i_b4xinputtemplate.h"
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

@interface ResumableSub_b4xinputtemplate_Show :B4IResumableSub 
- (instancetype) init: (b4i_b4xinputtemplate*) parent1 :(b4i_b4xinputtemplate*) __ref1 :(b4i_b4xdialog*) _dialog1;
@end
@implementation ResumableSub_b4xinputtemplate_Show {
b4i_b4xinputtemplate* parent;
b4i_b4xinputtemplate* __ref;
b4i_b4xdialog* _dialog;
B4ITextFieldWrapper* _tf;
}
- (instancetype) init: (b4i_b4xinputtemplate*) parent1 :(b4i_b4xinputtemplate*) __ref1 :(b4i_b4xdialog*) _dialog1 {
self->__ref = __ref1;
self->_dialog = _dialog1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xinputtemplate* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = -1;
B4IRDebugUtils.currentLine=17170433;
 //BA.debugLineNum = 17170433;BA.debugLine="xDialog = Dialog";
__ref->__xdialog /*b4i_b4xdialog**/  = _dialog;
B4IRDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref->__xdialog /*b4i_b4xdialog**/ ->__putattop /*BOOL*/  = [__ref->__xui /*B4IXUI**/  IsB4A] || [__ref->__xui /*B4IXUI**/  IsB4i];
B4IRDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Sleep(20)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xinputtemplate" :@"show"] :(int) (20)];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="TextField1.Text = Text";
[__ref->__textfield1 /*B4XViewWrapper**/  setText:__ref->__text /*NSString**/ ];
B4IRDebugUtils.currentLine=17170437;
 //BA.debugLineNum = 17170437;BA.debugLine="Validate(Text)";
[__ref _validate /*NSString**/ :nil :__ref->__text /*NSString**/ ];
B4IRDebugUtils.currentLine=17170438;
 //BA.debugLineNum = 17170438;BA.debugLine="TextField1.RequestFocus";
[__ref->__textfield1 /*B4XViewWrapper**/  RequestFocus];
B4IRDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="Dim tf As TextField = TextField1";
_tf = [B4ITextFieldWrapper new];
_tf.object = (UITextField*)((__ref->__textfield1 /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="tf.SelectAll";
[_tf SelectAll];
B4IRDebugUtils.currentLine=17170447;
 //BA.debugLineNum = 17170447;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xinputtemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xinputtemplate) instance released.");
}

- (B4XViewWrapper*)  _getpanel:(b4i_b4xinputtemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="End Sub";
return nil;
}
- (void)  _show:(b4i_b4xinputtemplate*) __ref :(b4i_b4xdialog*) _dialog{
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {[B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]; return;}
ResumableSub_b4xinputtemplate_Show* rsub = [[ResumableSub_b4xinputtemplate_Show alloc] init:self : __ref: _dialog];
[rsub resume:self.bi :nil];
}
//732661081
- (NSString*)  _dialogclosed:(b4i_b4xinputtemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Private Sub DialogClosed(Result As Int)";
B4IRDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="If Result = xui.DialogResponse_Positive Then";
if (_result==[__ref->__xui /*B4IXUI**/  DialogResponse_Positive]) { 
B4IRDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="Text = TextField1.Text";
__ref->__text /*NSString**/  = [__ref->__textfield1 /*B4XViewWrapper**/  Text];
 };
B4IRDebugUtils.currentLine=17235972;
 //BA.debugLineNum = 17235972;BA.debugLine="TextField1.Text = Text";
[__ref->__textfield1 /*B4XViewWrapper**/  setText:__ref->__text /*NSString**/ ];
B4IRDebugUtils.currentLine=17235973;
 //BA.debugLineNum = 17235973;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xinputtemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
B4IRDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Public Text As String";
self->__text = @"";
B4IRDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="Private xDialog As B4XDialog";
self->__xdialog = [b4i_b4xdialog new];
B4IRDebugUtils.currentLine=16580613;
 //BA.debugLineNum = 16580613;BA.debugLine="Public RegexPattern As String";
self->__regexpattern = @"";
B4IRDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="Public TextField1 As B4XView";
self->__textfield1 = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=16580615;
 //BA.debugLineNum = 16580615;BA.debugLine="Public lblTitle As Label";
self->__lbltitle = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _configurefornumbers:(b4i_b4xinputtemplate*) __ref :(BOOL) _allowdecimals :(BOOL) _allownegative{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"configurefornumbers"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"configurefornumbers::" :@[@(_allowdecimals),@(_allownegative)]]);}
B4ITextFieldWrapper* _tf = nil;
B4IRDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Public Sub ConfigureForNumbers (AllowDecimals As B";
B4IRDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="Dim tf As TextField = TextField1";
_tf = [B4ITextFieldWrapper new];
_tf.object = (UITextField*)((__ref->__textfield1 /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="If AllowNegative Then";
if (_allownegative) { 
B4IRDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="tf.KeyboardType = tf.TYPE_NUMBERS_AND_PUNCTUATIO";
[_tf setKeyboardType:[_tf TYPE_NUMBERS_AND_PUNCTUATIONS]];
 }else if(_allowdecimals) { 
B4IRDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="tf.KeyboardType = tf.TYPE_DECIMAL_PAD";
[_tf setKeyboardType:[_tf TYPE_DECIMAL_PAD]];
 }else {
B4IRDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="tf.KeyboardType = tf.TYPE_NUMBER_PAD";
[_tf setKeyboardType:[_tf TYPE_NUMBER_PAD]];
 };
B4IRDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="If AllowDecimals And AllowNegative Then";
if (_allowdecimals && _allownegative) { 
B4IRDebugUtils.currentLine=16711700;
 //BA.debugLineNum = 16711700;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
__ref->__regexpattern /*NSString**/  = @"^-?(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else if(_allowdecimals && _allownegative==false) { 
B4IRDebugUtils.currentLine=16711702;
 //BA.debugLineNum = 16711702;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$\"";
__ref->__regexpattern /*NSString**/  = @"^(0|[1-9]\\d*)?(\\.\\d+)?(?<=\\d)$";
 }else if(_allowdecimals==false && _allownegative==true) { 
B4IRDebugUtils.currentLine=16711704;
 //BA.debugLineNum = 16711704;BA.debugLine="RegexPattern = \"^-?(0|[1-9]\\d*)$\"";
__ref->__regexpattern /*NSString**/  = @"^-?(0|[1-9]\\d*)$";
 }else if(_allowdecimals==false && _allownegative==false) { 
B4IRDebugUtils.currentLine=16711706;
 //BA.debugLineNum = 16711706;BA.debugLine="RegexPattern = \"^(0|[1-9]\\d*)$\"";
__ref->__regexpattern /*NSString**/  = @"^(0|[1-9]\\d*)$";
 };
B4IRDebugUtils.currentLine=16711708;
 //BA.debugLineNum = 16711708;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xinputtemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"mBase"];
B4IRDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 80dip)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (((int) (80)))];
B4IRDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="mBase.LoadLayout(\"B4XInputTemplate\")";
[__ref->__mbase /*B4XViewWrapper**/  LoadLayout:@"B4XInputTemplate" :self.bi];
B4IRDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="TextField1.TextColor = xui.Color_White";
[__ref->__textfield1 /*B4XViewWrapper**/  setTextColor:[__ref->__xui /*B4IXUI**/  Color_White]];
B4IRDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _isvalid:(b4i_b4xinputtemplate*) __ref :(NSString*) _new{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"isvalid"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"isvalid:" :@[[B4I nilToNSNull:_new]]]).boolValue;}
B4IRDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Private Sub IsValid(New As String) As Boolean";
B4IRDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Return RegexPattern = \"\" Or Regex.IsMatch(RegexPa";
if (true) return [__ref->__regexpattern /*NSString**/  isEqual:@""] || [[self->___c Regex] IsMatch:__ref->__regexpattern /*NSString**/  :_new];
B4IRDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _validate:(b4i_b4xinputtemplate*) __ref :(NSString*) _new{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"validate"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"validate:" :@[[B4I nilToNSNull:_new]]]);}
int _bordercolor = 0;
BOOL _enabled = false;
B4IRDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Private Sub Validate (New As String)";
B4IRDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim BorderColor As Int = xui.Color_White";
_bordercolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Dim enabled As Boolean = True";
_enabled = true;
B4IRDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="If IsValid(New) = False Then";
if ([__ref _isvalid /*BOOL*/ :nil :_new]==false) { 
B4IRDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="If New.Length > 0 Then";
if ([_new Length]>0) { 
B4IRDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="BorderColor = xui.Color_Red";
_bordercolor = [__ref->__xui /*B4IXUI**/  Color_Red];
 };
B4IRDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="enabled = False";
_enabled = false;
 };
B4IRDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
[__ref->__xdialog /*b4i_b4xdialog**/  _setbuttonstate /*NSString**/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Positive] :_enabled];
B4IRDebugUtils.currentLine=16842762;
 //BA.debugLineNum = 16842762;BA.debugLine="TextField1.SetColorAndBorder(xui.Color_Transparen";
[__ref->__textfield1 /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (((int) (1))) :_bordercolor :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _textfield1_action:(b4i_b4xinputtemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"textfield1_action"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"textfield1_action" :nil]);}
B4IRDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Private Sub TextField1_Action";
B4IRDebugUtils.currentLine=16973825;
 //BA.debugLineNum = 16973825;BA.debugLine="TextField1_EnterPressed";
[__ref _textfield1_enterpressed /*NSString**/ :nil];
B4IRDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _textfield1_enterpressed:(b4i_b4xinputtemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"textfield1_enterpressed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"textfield1_enterpressed" :nil]);}
B4IRDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Private Sub TextField1_EnterPressed";
B4IRDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="If IsValid(TextField1.Text) Then xDialog.Close(xu";
if ([__ref _isvalid /*BOOL*/ :nil :[__ref->__textfield1 /*B4XViewWrapper**/  Text]]) { 
[__ref->__xdialog /*b4i_b4xdialog**/  _close /*BOOL*/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Positive]];};
B4IRDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _textfield1_textchanged:(b4i_b4xinputtemplate*) __ref :(NSString*) _old :(NSString*) _new{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xinputtemplate";
if ([B4IDebug shouldDelegate: @"textfield1_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"textfield1_textchanged::" :@[[B4I nilToNSNull:_old],[B4I nilToNSNull:_new]]]);}
B4IRDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Private Sub TextField1_TextChanged (Old As String,";
B4IRDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Validate (New)";
[__ref _validate /*NSString**/ :nil :_new];
B4IRDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="End Sub";
return @"";
}
@end