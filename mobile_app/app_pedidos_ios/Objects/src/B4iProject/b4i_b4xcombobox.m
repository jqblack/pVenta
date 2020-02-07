
#import "b4i_b4xcombobox.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"

@interface ResumableSub_b4xcombobox_btn_Click :B4IResumableSub 
- (instancetype) init: (b4i_b4xcombobox*) parent1 :(b4i_b4xcombobox*) __ref1;
@end
@implementation ResumableSub_b4xcombobox_btn_Click {
b4i_b4xcombobox* parent;
b4i_b4xcombobox* __ref;
B4IActionSheetWrapper* _sheet;
NSString* _item;
}
- (instancetype) init: (b4i_b4xcombobox*) parent1 :(b4i_b4xcombobox*) __ref1 {
self->__ref = __ref1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xcombobox* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xcombobox";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = -1;
B4IRDebugUtils.currentLine=17891329;
 //BA.debugLineNum = 17891329;BA.debugLine="Dim sheet As ActionSheet";
self->_sheet = [B4IActionSheetWrapper new];
B4IRDebugUtils.currentLine=17891330;
 //BA.debugLineNum = 17891330;BA.debugLine="sheet.Initialize(\"sheet\", \"\", \"\", \"\", mItems)";
[self->_sheet Initialize:self.bi :@"sheet" :@"" :@"" :@"" :self->__ref->__mitems /*B4IList**/ ];
B4IRDebugUtils.currentLine=17891331;
 //BA.debugLineNum = 17891331;BA.debugLine="sheet.Show(mBase)";
[self->_sheet Show:(UIView*)((self->__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=17891332;
 //BA.debugLineNum = 17891332;BA.debugLine="Wait For sheet_Click (Item As String)";
[parent->___c WaitFor:@"sheet_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xcombobox" :@"btn_click"] :nil];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
self->_item = ((NSString*) result[1]);
;
B4IRDebugUtils.currentLine=17891333;
 //BA.debugLineNum = 17891333;BA.debugLine="setSelectedIndex(mItems.IndexOf(Item))";
[self->__ref _setselectedindex /*NSString**/ :nil :[self->__ref->__mitems /*B4IList**/  IndexOf:(NSObject*)(self->_item)]];
B4IRDebugUtils.currentLine=17891334;
 //BA.debugLineNum = 17891334;BA.debugLine="RaiseEvent";
[self->__ref _raiseevent /*NSString**/ :nil];
B4IRDebugUtils.currentLine=17891335;
 //BA.debugLineNum = 17891335;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xcombobox 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xcombobox) instance released.");
}

- (NSString*)  _setitems:(b4i_b4xcombobox*) __ref :(B4IList*) _items{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"setitems"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setitems:" :@[[B4I nilToNSNull:_items]]]);}
B4IRDebugUtils.currentLine=17563648;
 //BA.debugLineNum = 17563648;BA.debugLine="Public Sub SetItems(Items As List)";
B4IRDebugUtils.currentLine=17563656;
 //BA.debugLineNum = 17563656;BA.debugLine="Dim mItems As List";
self->__mitems = [B4IList new];
B4IRDebugUtils.currentLine=17563657;
 //BA.debugLineNum = 17563657;BA.debugLine="mItems.Initialize";
[__ref->__mitems /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=17563658;
 //BA.debugLineNum = 17563658;BA.debugLine="mItems.AddAll(Items)";
[__ref->__mitems /*B4IList**/  AddAll:_items];
B4IRDebugUtils.currentLine=17563659;
 //BA.debugLineNum = 17563659;BA.debugLine="mSelectedIndex = -1";
__ref->__mselectedindex /*int*/  = (int) (-1);
B4IRDebugUtils.currentLine=17563661;
 //BA.debugLineNum = 17563661;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if ([_items Size]>0) { 
[__ref _setselectedindex /*NSString**/ :nil :(int) (0)];};
B4IRDebugUtils.currentLine=17563662;
 //BA.debugLineNum = 17563662;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setselectedindex:(b4i_b4xcombobox*) __ref :(int) _i{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"setselectedindex"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setselectedindex:" :@[@(_i)]]);}
B4IRDebugUtils.currentLine=17694720;
 //BA.debugLineNum = 17694720;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
B4IRDebugUtils.currentLine=17694724;
 //BA.debugLineNum = 17694724;BA.debugLine="mSelectedIndex = i";
__ref->__mselectedindex /*int*/  = _i;
B4IRDebugUtils.currentLine=17694725;
 //BA.debugLineNum = 17694725;BA.debugLine="If i < 0 Then";
if (_i<0) { 
B4IRDebugUtils.currentLine=17694726;
 //BA.debugLineNum = 17694726;BA.debugLine="mBtn.Text = \"\"";
[__ref->__mbtn /*B4XViewWrapper**/  setText:@""];
 }else {
B4IRDebugUtils.currentLine=17694728;
 //BA.debugLineNum = 17694728;BA.debugLine="mBtn.Text = mItems.Get(i)";
[__ref->__mbtn /*B4XViewWrapper**/  setText:[self.bi ObjectToString:[__ref->__mitems /*B4IList**/  Get:_i]]];
 };
B4IRDebugUtils.currentLine=17694731;
 //BA.debugLineNum = 17694731;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base_resize:(b4i_b4xcombobox*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=17498112;
 //BA.debugLineNum = 17498112;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=17498113;
 //BA.debugLineNum = 17498113;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
[[__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)] SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=17498114;
 //BA.debugLineNum = 17498114;BA.debugLine="End Sub";
return @"";
}
- (void)  _btn_click:(b4i_b4xcombobox*) __ref{
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"btn_click"])
	 {[B4IDebug delegate:self.bi :@"btn_click" :nil]; return;}
ResumableSub_b4xcombobox_btn_Click* rsub = [[ResumableSub_b4xcombobox_btn_Click alloc] init:self : __ref];
[rsub resume:self.bi :nil];
}
//1643450911
- (NSString*)  _raiseevent:(b4i_b4xcombobox*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"raiseevent"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"raiseevent" :nil]);}
B4IRDebugUtils.currentLine=17825792;
 //BA.debugLineNum = 17825792;BA.debugLine="Private Sub RaiseEvent";
B4IRDebugUtils.currentLine=17825793;
 //BA.debugLineNum = 17825793;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
[self->___c CallSub2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_SelectedIndexChanged"] componentsJoinedByString:@""] :(NSObject*)(@([__ref _getselectedindex /*int*/ :nil]))];
B4IRDebugUtils.currentLine=17825794;
 //BA.debugLineNum = 17825794;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xcombobox*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"b4xcombobox";
B4IRDebugUtils.currentLine=17301504;
 //BA.debugLineNum = 17301504;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=17301505;
 //BA.debugLineNum = 17301505;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=17301506;
 //BA.debugLineNum = 17301506;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=17301507;
 //BA.debugLineNum = 17301507;BA.debugLine="Private mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=17301508;
 //BA.debugLineNum = 17301508;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=17301515;
 //BA.debugLineNum = 17301515;BA.debugLine="Private mItems As List";
self->__mitems = [B4IList new];
B4IRDebugUtils.currentLine=17301516;
 //BA.debugLineNum = 17301516;BA.debugLine="Private mSelectedIndex As Int";
self->__mselectedindex = 0;
B4IRDebugUtils.currentLine=17301517;
 //BA.debugLineNum = 17301517;BA.debugLine="Private mBtn As B4XView";
self->__mbtn = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=17301519;
 //BA.debugLineNum = 17301519;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xcombobox*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _xlbl = nil;
B4IButtonWrapper* _btn = nil;
B4IRDebugUtils.currentLine=17432576;
 //BA.debugLineNum = 17432576;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=17432577;
 //BA.debugLineNum = 17432577;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=17432578;
 //BA.debugLineNum = 17432578;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=17432589;
 //BA.debugLineNum = 17432589;BA.debugLine="Dim btn As Button";
_btn = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=17432590;
 //BA.debugLineNum = 17432590;BA.debugLine="btn.Initialize(\"btn\", btn.STYLE_SYSTEM)";
[_btn Initialize:@"btn" :self.bi :[_btn STYLE_SYSTEM]];
B4IRDebugUtils.currentLine=17432591;
 //BA.debugLineNum = 17432591;BA.debugLine="mBtn = btn";
__ref->__mbtn /*B4XViewWrapper**/ .object = (NSObject*)((_btn).object);
B4IRDebugUtils.currentLine=17432592;
 //BA.debugLineNum = 17432592;BA.debugLine="mBtn.Font = xlbl.Font";
[__ref->__mbtn /*B4XViewWrapper**/  setFont:[_xlbl Font]];
B4IRDebugUtils.currentLine=17432593;
 //BA.debugLineNum = 17432593;BA.debugLine="mBase.AddView(mBtn, 0, 0, mBase.Width, mBase.Heig";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mbtn /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=17432596;
 //BA.debugLineNum = 17432596;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getitem:(b4i_b4xcombobox*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"getitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getitem:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=17760256;
 //BA.debugLineNum = 17760256;BA.debugLine="Public Sub GetItem(Index As Int) As String";
B4IRDebugUtils.currentLine=17760262;
 //BA.debugLineNum = 17760262;BA.debugLine="Return mItems.Get(Index)";
if (true) return [self.bi ObjectToString:[__ref->__mitems /*B4IList**/  Get:_index]];
B4IRDebugUtils.currentLine=17760264;
 //BA.debugLineNum = 17760264;BA.debugLine="End Sub";
return @"";
}
- (int)  _getselectedindex:(b4i_b4xcombobox*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"getselectedindex"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getselectedindex" :nil]).intValue;}
B4IRDebugUtils.currentLine=17629184;
 //BA.debugLineNum = 17629184;BA.debugLine="Public Sub getSelectedIndex As Int";
B4IRDebugUtils.currentLine=17629188;
 //BA.debugLineNum = 17629188;BA.debugLine="Return mSelectedIndex";
if (true) return __ref->__mselectedindex /*int*/ ;
B4IRDebugUtils.currentLine=17629190;
 //BA.debugLineNum = 17629190;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_b4xcombobox*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=17367040;
 //BA.debugLineNum = 17367040;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=17367041;
 //BA.debugLineNum = 17367041;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=17367042;
 //BA.debugLineNum = 17367042;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=17367043;
 //BA.debugLineNum = 17367043;BA.debugLine="End Sub";
return @"";
}
@end