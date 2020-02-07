
#import "b4i_b4xlisttemplate.h"
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

@interface ResumableSub_b4xlisttemplate_Show :B4IResumableSub 
- (instancetype) init: (b4i_b4xlisttemplate*) parent1 :(b4i_b4xlisttemplate*) __ref1 :(b4i_b4xdialog*) _dialog1;
@end
@implementation ResumableSub_b4xlisttemplate_Show {
b4i_b4xlisttemplate* parent;
b4i_b4xlisttemplate* __ref;
b4i_b4xdialog* _dialog;
NSObject* _opt;
int _i;
_clvitem* _item;
}
- (instancetype) init: (b4i_b4xlisttemplate*) parent1 :(b4i_b4xlisttemplate*) __ref1 :(b4i_b4xdialog*) _dialog1 {
self->__ref = __ref1;
self->_dialog = _dialog1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xlisttemplate* __ref;
id<B4IIterable> group3;
int index3;
int groupLen3;
int step8;
int limit8;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xlisttemplate";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=17563649;
 //BA.debugLineNum = 17563649;BA.debugLine="xDialog = Dialog";
__ref->__xdialog /*b4i_b4xdialog**/  = _dialog;
B4IRDebugUtils.currentLine=17563650;
 //BA.debugLineNum = 17563650;BA.debugLine="CustomListView1.Clear";
[__ref->__customlistview1 /*b4i_customlistview**/  _clear];
B4IRDebugUtils.currentLine=17563651;
 //BA.debugLineNum = 17563651;BA.debugLine="For Each opt As Object In Options";
if (true) break;

case 1:
//for
self->_state = 4;
group3 = __ref->__options /*B4IList**/ ;
index3 = 0;
groupLen3 = group3.Size;
self->_state = 12;
if (true) break;

case 12:
//C
self->_state = 4;
if (index3 < groupLen3) {
self->_state = 3;
_opt = [group3 Get:index3];}
if (true) break;

case 13:
//C
self->_state = 12;
index3++;
if (true) break;

case 3:
//C
self->_state = 13;
B4IRDebugUtils.currentLine=17563652;
 //BA.debugLineNum = 17563652;BA.debugLine="CustomListView1.AddTextItem(opt, opt)";
[__ref->__customlistview1 /*b4i_customlistview**/  _addtextitem:_opt :_opt];
 if (true) break;
if (true) break;
;
B4IRDebugUtils.currentLine=17563654;
 //BA.debugLineNum = 17563654;BA.debugLine="If AllowMultiSelection Then";

case 4:
//if
self->_state = 11;
if (__ref->__allowmultiselection /*BOOL*/ ) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=17563655;
 //BA.debugLineNum = 17563655;BA.debugLine="Sleep(20)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xlisttemplate" :@"show"] :(int) (20)];
self->_state = 14;
return;
case 14:
//C
self->_state = 7;
;
B4IRDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
if (true) break;

case 7:
//for
self->_state = 10;
step8 = 1;
limit8 = (int) ([__ref->__customlistview1 /*b4i_customlistview**/  _getsize]-1);
_i = (int) (0) ;
self->_state = 15;
if (true) break;

case 15:
//C
self->_state = 10;
if ((step8 > 0 && _i <= limit8) || (step8 < 0 && _i >= limit8)) self->_state = 9;
if (true) break;

case 16:
//C
self->_state = 15;
_i = ((int)(0 + _i + step8)) ;
if (true) break;

case 9:
//C
self->_state = 16;
B4IRDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="Dim item As CLVItem = CustomListView1.GetRawLis";
_item = [__ref->__customlistview1 /*b4i_customlistview**/  _getrawlistitem:_i];
B4IRDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="SelectItem (item, False)";
[__ref _selectitem /*NSString**/ :nil :_item :false];
 if (true) break;
if (true) break;

case 10:
//C
self->_state = 11;
;
 if (true) break;

case 11:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVie";
[_dialog _internaladdstubtoclvifneeded /*NSString**/ :nil :__ref->__customlistview1 /*b4i_customlistview**/  :__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor];
B4IRDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="SelectedItem = \"\"";
__ref->__selecteditem /*NSString**/  = @"";
B4IRDebugUtils.currentLine=17563664;
 //BA.debugLineNum = 17563664;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xlisttemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xlisttemplate) instance released.");
}

- (B4XViewWrapper*)  _getpanel:(b4i_b4xlisttemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return nil;
}
- (void)  _show:(b4i_b4xlisttemplate*) __ref :(b4i_b4xdialog*) _dialog{
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {[B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]; return;}
ResumableSub_b4xlisttemplate_Show* rsub = [[ResumableSub_b4xlisttemplate_Show alloc] init:self : __ref: _dialog];
[rsub resume:self.bi :nil];
}
//1042777311
- (NSString*)  _dialogclosed:(b4i_b4xlisttemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
B4IRDebugUtils.currentLine=17760258;
 //BA.debugLineNum = 17760258;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xlisttemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
B4IRDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="Public CustomListView1 As CustomListView";
self->__customlistview1 = [b4i_customlistview new];
B4IRDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Public Options As List";
self->__options = [B4IList new];
B4IRDebugUtils.currentLine=17301509;
 //BA.debugLineNum = 17301509;BA.debugLine="Public SelectedItem As String";
self->__selecteditem = @"";
B4IRDebugUtils.currentLine=17301510;
 //BA.debugLineNum = 17301510;BA.debugLine="Private xDialog As B4XDialog";
self->__xdialog = [b4i_b4xdialog new];
B4IRDebugUtils.currentLine=17301511;
 //BA.debugLineNum = 17301511;BA.debugLine="Public AllowMultiSelection As Boolean";
self->__allowmultiselection = false;
B4IRDebugUtils.currentLine=17301512;
 //BA.debugLineNum = 17301512;BA.debugLine="Public SelectionColor As Int = 0xAA0086FF";
self->__selectioncolor = (int) (0xaa0086ff);
B4IRDebugUtils.currentLine=17301513;
 //BA.debugLineNum = 17301513;BA.debugLine="Public SelectedItems As List";
self->__selecteditems = [B4IList new];
B4IRDebugUtils.currentLine=17301514;
 //BA.debugLineNum = 17301514;BA.debugLine="Public MultiSelectionMinimum As Int = 0";
self->__multiselectionminimum = (int) (0);
B4IRDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _customlistview1_itemclick:(b4i_b4xlisttemplate*) __ref :(int) _index :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"customlistview1_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"customlistview1_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
_clvitem* _item = nil;
B4IRDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
B4IRDebugUtils.currentLine=17694721;
 //BA.debugLineNum = 17694721;BA.debugLine="If Value = \"\" Then Return";
if ([_value isEqual:(NSObject*)(@"")]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=17694722;
 //BA.debugLineNum = 17694722;BA.debugLine="If AllowMultiSelection Then";
if (__ref->__allowmultiselection /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=17694723;
 //BA.debugLineNum = 17694723;BA.debugLine="Dim Item As CLVItem = CustomListView1.GetRawList";
_item = [__ref->__customlistview1 /*b4i_customlistview**/  _getrawlistitem:_index];
B4IRDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="SelectItem (Item, True)";
[__ref _selectitem /*NSString**/ :nil :_item :true];
 }else {
B4IRDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="SelectedItem = Value";
__ref->__selecteditem /*NSString**/  = [self.bi ObjectToString:_value];
B4IRDebugUtils.currentLine=17694727;
 //BA.debugLineNum = 17694727;BA.debugLine="SelectedItems.Clear";
[__ref->__selecteditems /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="SelectedItems.Add(Value)";
[__ref->__selecteditems /*B4IList**/  Add:_value];
B4IRDebugUtils.currentLine=17694729;
 //BA.debugLineNum = 17694729;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
[__ref->__xdialog /*b4i_b4xdialog**/  _close /*BOOL*/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Positive]];
 };
B4IRDebugUtils.currentLine=17694731;
 //BA.debugLineNum = 17694731;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _selectitem:(b4i_b4xlisttemplate*) __ref :(_clvitem*) _item :(BOOL) _toggle{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"selectitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"selectitem::" :@[[B4I nilToNSNull:_item],@(_toggle)]]);}
int _index = 0;
BOOL _selected = false;
B4IRDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Private Sub SelectItem (Item As CLVItem, Toggle As";
B4IRDebugUtils.currentLine=17629185;
 //BA.debugLineNum = 17629185;BA.debugLine="Dim index As Int = SelectedItems.IndexOf(Item.Val";
_index = [__ref->__selecteditems /*B4IList**/  IndexOf:_item->_Value];
B4IRDebugUtils.currentLine=17629186;
 //BA.debugLineNum = 17629186;BA.debugLine="Dim Selected As Boolean = index > -1";
_selected = _index>-1;
B4IRDebugUtils.currentLine=17629187;
 //BA.debugLineNum = 17629187;BA.debugLine="If Toggle Then Selected = Not(Selected)";
if (_toggle) { 
_selected = (!(_selected));};
B4IRDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="If Selected Then";
if (_selected) { 
B4IRDebugUtils.currentLine=17629189;
 //BA.debugLineNum = 17629189;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = Selection";
if ((!(_toggle))) { 
[_item->_Panel setColor:__ref->__selectioncolor /*int*/ ];};
B4IRDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="Item.Color = CustomListView1.DefaultTextBackgrou";
_item->_Color = __ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor;
B4IRDebugUtils.currentLine=17629191;
 //BA.debugLineNum = 17629191;BA.debugLine="If index = -1 Then SelectedItems.Add(Item.Value)";
if (_index==-1) { 
[__ref->__selecteditems /*B4IList**/  Add:_item->_Value];};
 }else {
B4IRDebugUtils.currentLine=17629193;
 //BA.debugLineNum = 17629193;BA.debugLine="Item.Color = SelectionColor";
_item->_Color = __ref->__selectioncolor /*int*/ ;
B4IRDebugUtils.currentLine=17629194;
 //BA.debugLineNum = 17629194;BA.debugLine="If Not(Toggle) Then Item.Panel.Color = CustomLis";
if ((!(_toggle))) { 
[_item->_Panel setColor:__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor];};
B4IRDebugUtils.currentLine=17629195;
 //BA.debugLineNum = 17629195;BA.debugLine="If index > -1 Then SelectedItems.RemoveAt(index)";
if (_index>-1) { 
[__ref->__selecteditems /*B4IList**/  RemoveAt:_index];};
 };
B4IRDebugUtils.currentLine=17629197;
 //BA.debugLineNum = 17629197;BA.debugLine="xDialog.SetButtonState(xui.DialogResponse_Positiv";
[__ref->__xdialog /*b4i_b4xdialog**/  _setbuttonstate /*NSString**/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Positive] :[__ref->__selecteditems /*B4IList**/  Size]>=__ref->__multiselectionminimum /*int*/ ];
B4IRDebugUtils.currentLine=17629198;
 //BA.debugLineNum = 17629198;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xlisttemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"mBase"];
B4IRDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (((int) (300)))];
B4IRDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="mBase.LoadLayout(\"ListTemplate\")";
[__ref->__mbase /*B4XViewWrapper**/  LoadLayout:@"ListTemplate" :self.bi];
B4IRDebugUtils.currentLine=17367044;
 //BA.debugLineNum = 17367044;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=17367045;
 //BA.debugLineNum = 17367045;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
[__ref->__customlistview1 /*b4i_customlistview**/ ->__sv SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=17367046;
 //BA.debugLineNum = 17367046;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor = (int) (0xff555555);
B4IRDebugUtils.currentLine=17367047;
 //BA.debugLineNum = 17367047;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextcolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=17367052;
 //BA.debugLineNum = 17367052;BA.debugLine="Options.Initialize";
[__ref->__options /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=17367053;
 //BA.debugLineNum = 17367053;BA.debugLine="SelectedItems.Initialize";
[__ref->__selecteditems /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=17367054;
 //BA.debugLineNum = 17367054;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resize:(b4i_b4xlisttemplate*) __ref :(int) _width :(int) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlisttemplate";
if ([B4IDebug shouldDelegate: @"resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
B4IRDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
[__ref->__customlistview1 /*b4i_customlistview**/  _base_resize:_width :_height];
B4IRDebugUtils.currentLine=17432579;
 //BA.debugLineNum = 17432579;BA.debugLine="End Sub";
return @"";
}
@end