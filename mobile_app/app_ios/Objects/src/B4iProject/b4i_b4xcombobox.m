
#import "b4i_b4xcombobox.h"
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
self->_state = 1;
B4IRDebugUtils.currentLine=12386305;
 //BA.debugLineNum = 12386305;BA.debugLine="Dim sheet As ActionSheet";
_sheet = [B4IActionSheetWrapper new];
B4IRDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="sheet.Initialize(\"sheet\", \"\", B4iCancelButton, \"\"";
[_sheet Initialize:self.bi :@"sheet" :@"" :__ref->__b4icancelbutton /*NSString**/  :@"" :__ref->__mitems /*B4IList**/ ];
B4IRDebugUtils.currentLine=12386307;
 //BA.debugLineNum = 12386307;BA.debugLine="sheet.Show(mBase)";
[_sheet Show:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=12386308;
 //BA.debugLineNum = 12386308;BA.debugLine="Wait For sheet_Click (Item As String)";
[parent->___c WaitFor:@"sheet_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xcombobox" :@"btn_click"] :nil];
self->_state = 7;
return;
case 7:
//C
self->_state = 1;
_item = ((NSString*) result[1]);
;
B4IRDebugUtils.currentLine=12386309;
 //BA.debugLineNum = 12386309;BA.debugLine="if B4iCancelButton <> \"\" and Item = B4iCancelButt";
if (true) break;

case 1:
//if
self->_state = 6;
if ([__ref->__b4icancelbutton /*NSString**/  isEqual:@""] == false && [_item isEqual:__ref->__b4icancelbutton /*NSString**/ ]) { 
self->_state = 3;
;}if (true) break;

case 3:
//C
self->_state = 6;
if (true) return ;
if (true) break;

case 6:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=12386310;
 //BA.debugLineNum = 12386310;BA.debugLine="setSelectedIndex(mItems.IndexOf(Item))";
[__ref _setselectedindex /*NSString**/ :nil :[__ref->__mitems /*B4IList**/  IndexOf:(NSObject*)(_item)]];
B4IRDebugUtils.currentLine=12386311;
 //BA.debugLineNum = 12386311;BA.debugLine="LastSelectedIndex = -1";
__ref->__lastselectedindex /*int*/  = (int) (-1);
B4IRDebugUtils.currentLine=12386312;
 //BA.debugLineNum = 12386312;BA.debugLine="RaiseEvent";
[__ref _raiseevent /*void*/ :nil];
B4IRDebugUtils.currentLine=12386313;
 //BA.debugLineNum = 12386313;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_b4xcombobox_RaiseEvent :B4IResumableSub 
- (instancetype) init: (b4i_b4xcombobox*) parent1 :(b4i_b4xcombobox*) __ref1;
@end
@implementation ResumableSub_b4xcombobox_RaiseEvent {
b4i_b4xcombobox* parent;
b4i_b4xcombobox* __ref;
int _index;
int _myindex;
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
self->_state = 1;
B4IRDebugUtils.currentLine=12320769;
 //BA.debugLineNum = 12320769;BA.debugLine="Dim index As Int = getSelectedIndex";
_index = [__ref _getselectedindex /*int*/ :nil];
B4IRDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="If LastSelectedIndex = index Then Return";
if (true) break;

case 1:
//if
self->_state = 6;
if (__ref->__lastselectedindex /*int*/ ==_index) { 
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
B4IRDebugUtils.currentLine=12320771;
 //BA.debugLineNum = 12320771;BA.debugLine="If DelayBeforeChangeEvent > 0 Then";
if (true) break;

case 7:
//if
self->_state = 16;
if (__ref->__delaybeforechangeevent /*int*/ >0) { 
self->_state = 9;
}if (true) break;

case 9:
//C
self->_state = 10;
B4IRDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="DelayIndex = DelayIndex + 1";
__ref->__delayindex /*int*/  = (int) (__ref->__delayindex /*int*/ +1);
B4IRDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="Dim MyIndex As Int = DelayIndex";
_myindex = __ref->__delayindex /*int*/ ;
B4IRDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="Sleep(DelayBeforeChangeEvent)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xcombobox" :@"raiseevent"] :__ref->__delaybeforechangeevent /*int*/ ];
self->_state = 17;
return;
case 17:
//C
self->_state = 10;
;
B4IRDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="If MyIndex <> DelayIndex Then Return";
if (true) break;

case 10:
//if
self->_state = 15;
if (_myindex!=__ref->__delayindex /*int*/ ) { 
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
 if (true) break;

case 16:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="LastSelectedIndex = index";
__ref->__lastselectedindex /*int*/  = _index;
B4IRDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="CallSub2(mCallBack, mEventName & \"_SelectedIndexC";
[parent->___c CallSub2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_SelectedIndexChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_index))];
B4IRDebugUtils.currentLine=12320779;
 //BA.debugLineNum = 12320779;BA.debugLine="End Sub";
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

- (NSString*)  _base_resize:(b4i_b4xcombobox*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=11993089;
 //BA.debugLineNum = 11993089;BA.debugLine="mBase.GetView(0).SetLayoutAnimated(0, 0, 0, Width";
[[__ref->__mbase /*B4XViewWrapper**/  GetView:(int) (0)] SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="End Sub";
return @"";
}
- (void)  _btn_click:(b4i_b4xcombobox*) __ref{
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"btn_click"])
	 {[B4IDebug delegate:self.bi :@"btn_click" :nil]; return;}
ResumableSub_b4xcombobox_btn_Click* rsub = [[ResumableSub_b4xcombobox_btn_Click alloc] init:self : __ref];
[rsub resume:self.bi :nil];
}
//-627279463
- (NSString*)  _setselectedindex:(b4i_b4xcombobox*) __ref :(int) _i{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"setselectedindex"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setselectedindex:" :@[@(_i)]]);}
B4IRDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Public Sub setSelectedIndex(i As Int)";
B4IRDebugUtils.currentLine=12189697;
 //BA.debugLineNum = 12189697;BA.debugLine="LastSelectedIndex = i";
__ref->__lastselectedindex /*int*/  = _i;
B4IRDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="mSelectedIndex = i";
__ref->__mselectedindex /*int*/  = _i;
B4IRDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="If i < 0 Then";
if (_i<0) { 
B4IRDebugUtils.currentLine=12189703;
 //BA.debugLineNum = 12189703;BA.debugLine="mBtn.Text = \"\"";
[__ref->__mbtn /*B4XViewWrapper**/  setText:@""];
 }else {
B4IRDebugUtils.currentLine=12189705;
 //BA.debugLineNum = 12189705;BA.debugLine="mBtn.Text = mItems.Get(i)";
[__ref->__mbtn /*B4XViewWrapper**/  setText:[self.bi ObjectToString:[__ref->__mitems /*B4IList**/  Get:_i]]];
 };
B4IRDebugUtils.currentLine=12189708;
 //BA.debugLineNum = 12189708;BA.debugLine="End Sub";
return @"";
}
- (void)  _raiseevent:(b4i_b4xcombobox*) __ref{
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"raiseevent"])
	 {[B4IDebug delegate:self.bi :@"raiseevent" :nil]; return;}
ResumableSub_b4xcombobox_RaiseEvent* rsub = [[ResumableSub_b4xcombobox_RaiseEvent alloc] init:self : __ref];
[rsub resume:self.bi :nil];
}
//-1626848429
- (NSString*)  _class_globals:(b4i_b4xcombobox*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xcombobox";
B4IRDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=11796481;
 //BA.debugLineNum = 11796481;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=11796483;
 //BA.debugLineNum = 11796483;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="Private LastSelectedIndex As Int";
self->__lastselectedindex = 0;
B4IRDebugUtils.currentLine=11796491;
 //BA.debugLineNum = 11796491;BA.debugLine="Private mItems As List";
self->__mitems = [B4IList new];
B4IRDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="Private mSelectedIndex As Int";
self->__mselectedindex = 0;
B4IRDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="Public mBtn As B4XView";
self->__mbtn = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="Public DelayBeforeChangeEvent As Int";
self->__delaybeforechangeevent = 0;
B4IRDebugUtils.currentLine=11796497;
 //BA.debugLineNum = 11796497;BA.debugLine="Private DelayIndex As Int";
self->__delayindex = 0;
B4IRDebugUtils.currentLine=11796498;
 //BA.debugLineNum = 11796498;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=11796499;
 //BA.debugLineNum = 11796499;BA.debugLine="Public B4iCancelButton As String = \"Cancel\"";
self->__b4icancelbutton = @"Cancel";
B4IRDebugUtils.currentLine=11796500;
 //BA.debugLineNum = 11796500;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xcombobox*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _xlbl = nil;
B4IButtonWrapper* _btn = nil;
B4IRDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=11927553;
 //BA.debugLineNum = 11927553;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=11927566;
 //BA.debugLineNum = 11927566;BA.debugLine="Dim btn As Button";
_btn = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11927567;
 //BA.debugLineNum = 11927567;BA.debugLine="btn.Initialize(\"btn\", btn.STYLE_SYSTEM)";
[_btn Initialize:@"btn" :self.bi :[_btn STYLE_SYSTEM]];
B4IRDebugUtils.currentLine=11927568;
 //BA.debugLineNum = 11927568;BA.debugLine="mBtn = btn";
__ref->__mbtn /*B4XViewWrapper**/ .object = (NSObject*)((_btn).object);
B4IRDebugUtils.currentLine=11927569;
 //BA.debugLineNum = 11927569;BA.debugLine="mBtn.Font = xlbl.Font";
[__ref->__mbtn /*B4XViewWrapper**/  setFont:[_xlbl Font]];
B4IRDebugUtils.currentLine=11927570;
 //BA.debugLineNum = 11927570;BA.debugLine="mBase.AddView(mBtn, 0, 0, mBase.Width, mBase.Heig";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mbtn /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=11927573;
 //BA.debugLineNum = 11927573;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getitem:(b4i_b4xcombobox*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"getitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getitem:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Public Sub GetItem(Index As Int) As String";
B4IRDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="Return mItems.Get(Index)";
if (true) return [self.bi ObjectToString:[__ref->__mitems /*B4IList**/  Get:_index]];
B4IRDebugUtils.currentLine=12255240;
 //BA.debugLineNum = 12255240;BA.debugLine="End Sub";
return @"";
}
- (int)  _getselectedindex:(b4i_b4xcombobox*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"getselectedindex"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getselectedindex" :nil]).intValue;}
B4IRDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Public Sub getSelectedIndex As Int";
B4IRDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Return mSelectedIndex";
if (true) return __ref->__mselectedindex /*int*/ ;
B4IRDebugUtils.currentLine=12124166;
 //BA.debugLineNum = 12124166;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_b4xcombobox*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=11862017;
 //BA.debugLineNum = 11862017;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="LastSelectedIndex = -1";
__ref->__lastselectedindex /*int*/  = (int) (-1);
B4IRDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="If xui.IsB4J Then DelayBeforeChangeEvent = 500";
if ([__ref->__xui /*B4IXUI**/  IsB4J]) { 
__ref->__delaybeforechangeevent /*int*/  = (int) (500);};
B4IRDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setitems:(b4i_b4xcombobox*) __ref :(B4IList*) _items{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcombobox";
if ([B4IDebug shouldDelegate: @"setitems"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setitems:" :@[[B4I nilToNSNull:_items]]]);}
B4IRDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Public Sub SetItems(Items As List)";
B4IRDebugUtils.currentLine=12058632;
 //BA.debugLineNum = 12058632;BA.debugLine="Dim mItems As List";
self->__mitems = [B4IList new];
B4IRDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="mItems.Initialize";
[__ref->__mitems /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=12058634;
 //BA.debugLineNum = 12058634;BA.debugLine="mItems.AddAll(Items)";
[__ref->__mitems /*B4IList**/  AddAll:_items];
B4IRDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="mSelectedIndex = -1";
__ref->__mselectedindex /*int*/  = (int) (-1);
B4IRDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="If Items.Size > 0 Then setSelectedIndex(0)";
if ([_items Size]>0) { 
[__ref _setselectedindex /*NSString**/ :nil :(int) (0)];};
B4IRDebugUtils.currentLine=12058638;
 //BA.debugLineNum = 12058638;BA.debugLine="End Sub";
return @"";
}
@end