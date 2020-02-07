
#import "b4i_customlistview.h"
#import "b4i_main.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"

@implementation _clvitem
-(void)Initialize{
self.IsInitialized = true;
self->_Panel = [B4XViewWrapper new];
self->_Size = 0;
self->_Value = [NSObject new];
self->_Color = 0;
self->_TextItem = false;
self->_Offset = 0;
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end
@interface ResumableSub_customlistview_PanelClickHandler :B4IResumableSub 
- (instancetype) init: (b4i_customlistview*) parent1 :(B4XViewWrapper*) _senderpanel1;
@end
@implementation ResumableSub_customlistview_PanelClickHandler {
b4i_customlistview* parent;
B4XViewWrapper* _senderpanel;
int _clr;
BOOL _istransparentpressedcolor;
}
- (instancetype) init: (b4i_customlistview*) parent1 :(B4XViewWrapper*) _senderpanel1 {
self->_senderpanel = _senderpanel1;
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
 //BA.debugLineNum = 477;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
self->_clr = [parent _getrawlistitem:[self.bi ObjectToNumber:[self->_senderpanel Tag]].intValue]->_Color /*int*/ ;
 //BA.debugLineNum = 478;BA.debugLine="Dim IsTransparentPressedColor As Boolean = Bit.An";
self->_istransparentpressedcolor = (((int) (0xff000000)) & (parent->__pressedcolor))==0;
 //BA.debugLineNum = 479;BA.debugLine="If IsTransparentPressedColor = False Then";
if (true) break;

case 1:
//if
self->_state = 4;
if (self->_istransparentpressedcolor==false) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
 //BA.debugLineNum = 480;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedCol";
[self->_senderpanel SetColorAnimated:(int) (50) :self->_clr :parent->__pressedcolor];
 if (true) break;
;
 //BA.debugLineNum = 482;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";

case 4:
//if
self->_state = 7;
if ([parent->__xui SubExists:parent->__callback :[@[parent->__eventname,@"_ItemClick"] componentsJoinedByString:@""] :(int) (2)]) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
 //BA.debugLineNum = 483;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
[parent->___c CallSub3:self.bi :parent->__callback :[@[parent->__eventname,@"_ItemClick"] componentsJoinedByString:@""] :[self->_senderpanel Tag] :[parent _getrawlistitem:[self.bi ObjectToNumber:[self->_senderpanel Tag]].intValue]->_Value /*NSObject**/ ];
 if (true) break;
;
 //BA.debugLineNum = 485;BA.debugLine="If IsTransparentPressedColor = False Then";

case 7:
//if
self->_state = 10;
if (self->_istransparentpressedcolor==false) { 
self->_state = 9;
}if (true) break;

case 9:
//C
self->_state = 10;
 //BA.debugLineNum = 486;BA.debugLine="Sleep(200)";
[parent->___c Sleep:self.bi :self :(int) (200)];
self->_state = 11;
return;
case 11:
//C
self->_state = 10;
;
 //BA.debugLineNum = 487;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor,";
[self->_senderpanel SetColorAnimated:(int) (200) :parent->__pressedcolor :self->_clr];
 if (true) break;

case 10:
//C
self->_state = -1;
;
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_customlistview 


+ (B4I*)createBI {
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_customlistview) instance released.");
}
- (NSString*)  _add:(B4XViewWrapper*) _pnl :(NSObject*) _value{
 //BA.debugLineNum = 380;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
 //BA.debugLineNum = 381;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
[self _insertat:[self->__items Size] :_pnl :_value];
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addtextitem:(NSObject*) _text :(NSObject*) _value{
 //BA.debugLineNum = 188;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
 //BA.debugLineNum = 189;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
[self _insertattextitem:[self->__items Size] :_text :_value];
 //BA.debugLineNum = 190;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _asview{
 //BA.debugLineNum = 130;BA.debugLine="Public Sub AsView As B4XView";
 //BA.debugLineNum = 131;BA.debugLine="Return mBase";
if (true) return self->__mbase;
 //BA.debugLineNum = 132;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _base_resize:(double) _width :(double) _height{
int _scrollbar = 0;
_clvitem* _it = nil;
B4XViewWrapper* _lbl = nil;
 //BA.debugLineNum = 106;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
 //BA.debugLineNum = 107;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
[self->__sv SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
 //BA.debugLineNum = 108;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
 //BA.debugLineNum = 109;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
if ([self->__xui IsB4J] && self->__scrollbarsvisible) { 
_scrollbar = (int) (20);};
 //BA.debugLineNum = 110;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 111;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
[self->__sv setScrollViewContentHeight:(int) (_height-_scrollbar)];
 //BA.debugLineNum = 112;BA.debugLine="For Each it As CLVItem In items";
{
const id<B4IIterable> group6 = self->__items;
const int groupLen6 = group6.Size
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (_clvitem*)([group6 Get:index6]);
 //BA.debugLineNum = 113;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
[_it->_Panel /*B4XViewWrapper**/  setHeight:(float) ([self->__sv ScrollViewContentHeight])];
 //BA.debugLineNum = 114;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
[[_it->_Panel /*B4XViewWrapper**/  GetView:(int) (0)] setHeight:[_it->_Panel /*B4XViewWrapper**/  Height]];
 }
};
 }else {
 //BA.debugLineNum = 117;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
[self->__sv setScrollViewContentWidth:(int) (_width-_scrollbar)];
 //BA.debugLineNum = 118;BA.debugLine="For Each it As CLVItem In items";
{
const id<B4IIterable> group12 = self->__items;
const int groupLen12 = group12.Size
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (_clvitem*)([group12 Get:index12]);
 //BA.debugLineNum = 119;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
[_it->_Panel /*B4XViewWrapper**/  setWidth:(float) ([self->__sv ScrollViewContentWidth])];
 //BA.debugLineNum = 120;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
[[_it->_Panel /*B4XViewWrapper**/  GetView:(int) (0)] setWidth:[_it->_Panel /*B4XViewWrapper**/  Width]];
 //BA.debugLineNum = 121;BA.debugLine="If it.TextItem Then";
if (_it->_TextItem /*BOOL*/ ) { 
 //BA.debugLineNum = 122;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = [B4XViewWrapper new];
_lbl = [[_it->_Panel /*B4XViewWrapper**/  GetView:(int) (0)] GetView:(int) (0)];
 //BA.debugLineNum = 123;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
[_lbl SetLayoutAnimated:(int) (0) :[_lbl Left] :[_lbl Top] :(float) ([_it->_Panel /*B4XViewWrapper**/  Width]-[_lbl Left]) :[_lbl Height]];
 };
 }
};
 };
 //BA.debugLineNum = 127;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
if ([self->__items Size]>0) { 
[self _updatevisiblerange];};
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
 //BA.debugLineNum = 13;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 14;BA.debugLine="Private mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
 //BA.debugLineNum = 15;BA.debugLine="Public sv As B4XView";
self->__sv = [B4XViewWrapper new];
 //BA.debugLineNum = 16;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
 //BA.debugLineNum = 18;BA.debugLine="Private items As List";
self->__items = [B4IList new];
 //BA.debugLineNum = 19;BA.debugLine="Private mDividerSize As Float";
self->__mdividersize = 0.0f;
 //BA.debugLineNum = 20;BA.debugLine="Private EventName As String";
self->__eventname = @"";
 //BA.debugLineNum = 21;BA.debugLine="Private CallBack As Object";
self->__callback = [NSObject new];
 //BA.debugLineNum = 22;BA.debugLine="Public DefaultTextColor As Int";
self->__defaulttextcolor = 0;
 //BA.debugLineNum = 23;BA.debugLine="Public DefaultTextBackgroundColor As Int";
self->__defaulttextbackgroundcolor = 0;
 //BA.debugLineNum = 24;BA.debugLine="Public AnimationDuration As Int = 300";
self->__animationduration = (int) (300);
 //BA.debugLineNum = 25;BA.debugLine="Private LastReachEndEvent As Long";
self->__lastreachendevent = 0L;
 //BA.debugLineNum = 26;BA.debugLine="Public PressedColor As Int";
self->__pressedcolor = 0;
 //BA.debugLineNum = 27;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 28;BA.debugLine="Public DesignerLabel As Label";
self->__designerlabel = [B4ILabelWrapper new];
 //BA.debugLineNum = 29;BA.debugLine="Public horizontal As Boolean";
self->__horizontal = false;
 //BA.debugLineNum = 35;BA.debugLine="Private FeedbackGenerator As NativeObject";
self->__feedbackgenerator = [B4INativeObject new];
 //BA.debugLineNum = 37;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
self->__mfirstvisibleindex = 0;
self->__mlastvisibleindex = 0;
 //BA.debugLineNum = 38;BA.debugLine="Private MonitorVisibleRange As Boolean";
self->__monitorvisiblerange = false;
 //BA.debugLineNum = 39;BA.debugLine="Private FireScrollChanged As Boolean";
self->__firescrollchanged = false;
 //BA.debugLineNum = 40;BA.debugLine="Private ScrollBarsVisible As Boolean";
self->__scrollbarsvisible = false;
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clear{
 //BA.debugLineNum = 135;BA.debugLine="Public Sub Clear";
 //BA.debugLineNum = 136;BA.debugLine="items.Clear";
[self->__items Clear];
 //BA.debugLineNum = 137;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
[[self->__sv ScrollViewInnerPanel] RemoveAllViews];
 //BA.debugLineNum = 138;BA.debugLine="SetScrollViewContentSize(0)";
[self _setscrollviewcontentsize:(float) (0)];
 //BA.debugLineNum = 139;BA.debugLine="ResetVisibles";
[self _resetvisibles];
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createlabel:(NSObject*) _txt{
B4ILabelWrapper* _lbl = nil;
 //BA.debugLineNum = 584;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
 //BA.debugLineNum = 585;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
 //BA.debugLineNum = 586;BA.debugLine="lbl.Initialize(\"\")";
[_lbl Initialize:self.bi :@""];
 //BA.debugLineNum = 587;BA.debugLine="lbl.TextAlignment = DesignerLabel.TextAlignment";
[_lbl setTextAlignment:[self->__designerlabel TextAlignment]];
 //BA.debugLineNum = 588;BA.debugLine="lbl.Font = DesignerLabel.Font";
[_lbl setFont:[self->__designerlabel Font]];
 //BA.debugLineNum = 589;BA.debugLine="lbl.Multiline = True";
[_lbl setMultiline:true];
 //BA.debugLineNum = 590;BA.debugLine="lbl.TextColor = DefaultTextColor";
[_lbl setTextColor:self->__defaulttextcolor];
 //BA.debugLineNum = 591;BA.debugLine="If txt Is AttributedString Then";
if ([_txt isKindOfClass: [NSAttributedString class]]) { 
 //BA.debugLineNum = 592;BA.debugLine="lbl.AttributedText = txt";
[_lbl setAttributedText:(B4IAttributedString*) [B4IObjectWrapper createWrapper:[B4IAttributedString new] object:(NSAttributedString*)(_txt)]];
 }else {
 //BA.debugLineNum = 594;BA.debugLine="lbl.Text = txt";
[_lbl setText:[self.bi ObjectToString:_txt]];
 };
 //BA.debugLineNum = 596;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
[_lbl setWidth:(float) ([self->__sv ScrollViewContentWidth]-((int) (10)))];
 //BA.debugLineNum = 597;BA.debugLine="lbl.SizeToFit";
[_lbl SizeToFit];
 //BA.debugLineNum = 598;BA.debugLine="Return lbl";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_lbl).object)];
 //BA.debugLineNum = 599;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _createpanel:(NSString*) _paneleventname{
 //BA.debugLineNum = 519;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
 //BA.debugLineNum = 520;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return [self->__xui CreatePanel:self.bi :_paneleventname];
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _createscrollview{
B4IScrollView* _nsv = nil;
 //BA.debugLineNum = 572;BA.debugLine="Private Sub CreateScrollView As B4XView";
 //BA.debugLineNum = 573;BA.debugLine="Dim nsv As ScrollView";
_nsv = [B4IScrollView new];
 //BA.debugLineNum = 574;BA.debugLine="nsv.Initialize(\"sv\", 0, 0)";
[_nsv Initialize:self.bi :@"sv" :(int) (0) :(int) (0)];
 //BA.debugLineNum = 575;BA.debugLine="Return nsv";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_nsv).object)];
 //BA.debugLineNum = 576;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _designercreateview:(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
NSString* _o = @"";
B4INativeObject* _no = nil;
 //BA.debugLineNum = 71;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
 //BA.debugLineNum = 72;BA.debugLine="mBase = Base";
self->__mbase.object = (NSObject*)(_base);
 //BA.debugLineNum = 73;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = [self.bi ObjectToString:[_props GetDefault:(NSObject*)(@"ListOrientation") :(NSObject*)(@"Vertical")]];
 //BA.debugLineNum = 74;BA.debugLine="horizontal = o = \"Horizontal\"";
self->__horizontal = [_o isEqual:@"Horizontal"];
 //BA.debugLineNum = 75;BA.debugLine="sv = CreateScrollView";
self->__sv = [self _createscrollview];
 //BA.debugLineNum = 76;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
[self->__mbase AddView:(UIView*)((self->__sv).object) :(float) (0) :(float) (0) :[self->__mbase Width] :[self->__mbase Height]];
 //BA.debugLineNum = 77;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
[[self->__sv ScrollViewInnerPanel] setColor:[self->__xui PaintOrColorToColor:[_props Get:(NSObject*)(@"DividerColor")]]];
 //BA.debugLineNum = 78;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
self->__mdividersize = (float) (([self.bi ObjectToNumber:[_props Get:(NSObject*)(@"DividerHeight")]].intValue));
 //BA.debugLineNum = 79;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
self->__pressedcolor = [self->__xui PaintOrColorToColor:[_props Get:(NSObject*)(@"PressedColor")]];
 //BA.debugLineNum = 80;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
self->__animationduration = [self.bi ObjectToNumber:[_props GetDefault:(NSObject*)(@"InsertAnimationDuration") :(NSObject*)(@(self->__animationduration))]].intValue;
 //BA.debugLineNum = 81;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
self->__scrollbarsvisible = [self.bi ObjectToBoolean:[_props GetDefault:(NSObject*)(@"ShowScrollBar") :(NSObject*)(@(true))]];
 //BA.debugLineNum = 82;BA.debugLine="If ScrollBarsVisible = False Then";
if (self->__scrollbarsvisible==false) { 
 //BA.debugLineNum = 95;BA.debugLine="Dim no As NativeObject = sv";
_no = [B4INativeObject new];
_no.object = (NSObject*)((self->__sv).object);
 //BA.debugLineNum = 96;BA.debugLine="no.RunMethod(\"setShowsHorizontalScrollIndicator:";
[_no RunMethod:@"setShowsHorizontalScrollIndicator:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(false))]]]];
 //BA.debugLineNum = 97;BA.debugLine="no.RunMethod(\"setShowsVerticalScrollIndicator:\",";
[_no RunMethod:@"setShowsVerticalScrollIndicator:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(false))]]]];
 };
 //BA.debugLineNum = 100;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
self->__defaulttextcolor = [self->__xui PaintOrColorToColor:(NSObject*)(@([_lbl TextColor]))];
 //BA.debugLineNum = 101;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
self->__defaulttextbackgroundcolor = [self->__mbase Color];
 //BA.debugLineNum = 102;BA.debugLine="DesignerLabel = Lbl";
self->__designerlabel = _lbl;
 //BA.debugLineNum = 103;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[self _base_resize:[self->__mbase Width] :[self->__mbase Height]];
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return @"";
}
- (int)  _findindexfromoffset:(int) _offset{
int _position = 0;
int _stepsize = 0;
_clvitem* _currentitem = nil;
int _nextoffset = 0;
int _prevoffset = 0;
 //BA.debugLineNum = 422;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
 //BA.debugLineNum = 423;BA.debugLine="If items.Size = 0 Then Return -1";
if ([self->__items Size]==0) { 
if (true) return (int) (-1);};
 //BA.debugLineNum = 425;BA.debugLine="Dim Position As Int = items.Size / 2";
_position = (int) ([self->__items Size]/(double)2);
 //BA.debugLineNum = 426;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
_stepsize = (int) (ceil(_position/(double)2));
 //BA.debugLineNum = 427;BA.debugLine="Do While True";
while (true) {
 //BA.debugLineNum = 428;BA.debugLine="Dim CurrentItem As CLVItem = items.Get(Position)";
_currentitem = (_clvitem*)([self->__items Get:_position]);
 //BA.debugLineNum = 429;BA.debugLine="Dim NextOffset As Int";
_nextoffset = 0;
 //BA.debugLineNum = 430;BA.debugLine="If Position < items.Size - 1 Then";
if (_position<[self->__items Size]-1) { 
 //BA.debugLineNum = 431;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
_nextoffset = (int) ([self _getrawlistitem:(int) (_position+1)]->_Offset /*int*/ -1);
 }else {
 //BA.debugLineNum = 433;BA.debugLine="NextOffset = 0x7FFFFFFF";
_nextoffset = (int) (0x7fffffff);
 };
 //BA.debugLineNum = 435;BA.debugLine="Dim PrevOffset As Int";
_prevoffset = 0;
 //BA.debugLineNum = 436;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
 //BA.debugLineNum = 437;BA.debugLine="PrevOffset = 0x80000000";
_prevoffset = (int) (0x80000000);
 }else {
 //BA.debugLineNum = 439;BA.debugLine="PrevOffset = CurrentItem.Offset";
_prevoffset = _currentitem->_Offset /*int*/ ;
 };
 //BA.debugLineNum = 441;BA.debugLine="If Offset > NextOffset Then";
if (_offset>_nextoffset) { 
 //BA.debugLineNum = 442;BA.debugLine="Position = Min(Position + StepSize, items.Size";
_position = (int) (fmin(_position+_stepsize,[self->__items Size]-1));
 }else if(_offset<_prevoffset) { 
 //BA.debugLineNum = 444;BA.debugLine="Position = Max(Position - StepSize, 0)";
_position = (int) (fmax(_position-_stepsize,0));
 }else {
 //BA.debugLineNum = 446;BA.debugLine="Return Position";
if (true) return _position;
 };
 //BA.debugLineNum = 448;BA.debugLine="StepSize = Ceil(StepSize / 2)";
_stepsize = (int) (ceil(_stepsize/(double)2));
 }
;
 //BA.debugLineNum = 450;BA.debugLine="Return -1";
if (true) return (int) (-1);
 //BA.debugLineNum = 451;BA.debugLine="End Sub";
return 0;
}
- (int)  _finditemoffset:(int) _index{
 //BA.debugLineNum = 417;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
 //BA.debugLineNum = 418;BA.debugLine="Return GetRawListItem(Index).Offset";
if (true) return [self _getrawlistitem:_index]->_Offset /*int*/ ;
 //BA.debugLineNum = 419;BA.debugLine="End Sub";
return 0;
}
- (B4XViewWrapper*)  _getbase{
 //BA.debugLineNum = 142;BA.debugLine="Public Sub GetBase As B4XView";
 //BA.debugLineNum = 143;BA.debugLine="Return mBase";
if (true) return self->__mbase;
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return nil;
}
- (float)  _getdividersize{
 //BA.debugLineNum = 523;BA.debugLine="Public Sub getDividerSize As Float";
 //BA.debugLineNum = 524;BA.debugLine="Return mDividerSize";
if (true) return self->__mdividersize;
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return 0.0f;
}
- (int)  _getfirstvisibleindex{
 //BA.debugLineNum = 454;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
 //BA.debugLineNum = 455;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return [self _findindexfromoffset:(int) ([self _getscrollviewoffset]+self->__mdividersize)];
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return 0;
}
- (int)  _getitemfromview:(B4XViewWrapper*) _v{
NSObject* _parent = nil;
B4XViewWrapper* _current = nil;
 //BA.debugLineNum = 492;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
 //BA.debugLineNum = 493;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (NSObject*)((_v).object);
_current = [B4XViewWrapper new];
 //BA.debugLineNum = 494;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ([[self->__sv ScrollViewInnerPanel] isEqual:(NSObject*)(_parent)] == false) {
 //BA.debugLineNum = 495;BA.debugLine="current = parent";
_current.object = (NSObject*)(_parent);
 //BA.debugLineNum = 496;BA.debugLine="parent = current.Parent";
_parent = (NSObject*)(([_current Parent]).object);
 }
;
 //BA.debugLineNum = 498;BA.debugLine="v = current";
_v = _current;
 //BA.debugLineNum = 499;BA.debugLine="Return v.Tag";
if (true) return [self.bi ObjectToNumber:[_v Tag]].intValue;
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return 0;
}
- (int)  _getlastvisibleindex{
 //BA.debugLineNum = 459;BA.debugLine="Public Sub getLastVisibleIndex As Int";
 //BA.debugLineNum = 460;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return [self _findindexfromoffset:(int) ([self _getscrollviewoffset]+[self _getscrollviewvisiblesize])];
 //BA.debugLineNum = 461;BA.debugLine="End Sub";
return 0;
}
- (float)  _getmaxscrolloffset{
 //BA.debugLineNum = 389;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
 //BA.debugLineNum = 390;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
if (true) return (float) ([self _getscrollviewcontentsize]-[self _getscrollviewvisiblesize]);
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return 0.0f;
}
- (B4XViewWrapper*)  _getpanel:(int) _index{
 //BA.debugLineNum = 157;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
 //BA.debugLineNum = 158;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
if (true) return [[self _getrawlistitem:_index]->_Panel /*B4XViewWrapper**/  GetView:(int) (0)];
 //BA.debugLineNum = 159;BA.debugLine="End Sub";
return nil;
}
- (_clvitem*)  _getrawlistitem:(int) _index{
 //BA.debugLineNum = 152;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVItem";
 //BA.debugLineNum = 153;BA.debugLine="Return items.Get(Index)";
if (true) return (_clvitem*)([self->__items Get:_index]);
 //BA.debugLineNum = 154;BA.debugLine="End Sub";
return nil;
}
- (float)  _getscrollviewcontentsize{
 //BA.debugLineNum = 332;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
 //BA.debugLineNum = 333;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 334;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) ([self->__sv ScrollViewContentWidth]);
 }else {
 //BA.debugLineNum = 336;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) ([self->__sv ScrollViewContentHeight]);
 };
 //BA.debugLineNum = 338;BA.debugLine="End Sub";
return 0.0f;
}
- (float)  _getscrollviewoffset{
 //BA.debugLineNum = 316;BA.debugLine="Private Sub GetScrollViewOffset As Float";
 //BA.debugLineNum = 317;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 318;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) ([self->__sv ScrollViewOffsetX]);
 }else {
 //BA.debugLineNum = 320;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) ([self->__sv ScrollViewOffsetY]);
 };
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return 0.0f;
}
- (float)  _getscrollviewvisiblesize{
 //BA.debugLineNum = 308;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
 //BA.debugLineNum = 309;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 310;BA.debugLine="Return sv.Width";
if (true) return [self->__sv Width];
 }else {
 //BA.debugLineNum = 312;BA.debugLine="Return sv.Height";
if (true) return [self->__sv Height];
 };
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return 0.0f;
}
- (int)  _getsize{
 //BA.debugLineNum = 147;BA.debugLine="Public Sub getSize As Int";
 //BA.debugLineNum = 148;BA.debugLine="Return items.Size";
if (true) return [self->__items Size];
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return 0;
}
- (NSObject*)  _getvalue:(int) _index{
 //BA.debugLineNum = 162;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
 //BA.debugLineNum = 163;BA.debugLine="Return GetRawListItem(Index).Value";
if (true) return [self _getrawlistitem:_index]->_Value /*NSObject**/ ;
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(B4I*) _ba :(NSObject*) _vcallback :(NSString*) _veventname{
[self initializeClassModule];
 //BA.debugLineNum = 43;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
 //BA.debugLineNum = 44;BA.debugLine="EventName = vEventName";
self->__eventname = _veventname;
 //BA.debugLineNum = 45;BA.debugLine="CallBack = vCallBack";
self->__callback = _vcallback;
 //BA.debugLineNum = 46;BA.debugLine="items.Initialize";
[self->__items Initialize];
 //BA.debugLineNum = 47;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
self->__defaulttextbackgroundcolor = [self->__xui Color_White];
 //BA.debugLineNum = 48;BA.debugLine="DefaultTextColor = xui.Color_Black";
self->__defaulttextcolor = [self->__xui Color_Black];
 //BA.debugLineNum = 49;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
self->__monitorvisiblerange = [self->__xui SubExists:self->__callback :[@[self->__eventname,@"_VisibleRangeChanged"] componentsJoinedByString:@""] :(int) (2)];
 //BA.debugLineNum = 50;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
self->__firescrollchanged = [self->__xui SubExists:self->__callback :[@[self->__eventname,@"_ScrollChanged"] componentsJoinedByString:@""] :(int) (1)];
 //BA.debugLineNum = 52;BA.debugLine="FeedbackGenerator.Initialize(\"UIImpactFeedbackGene";
[self->__feedbackgenerator Initialize:@"UIImpactFeedbackGenerator"];
 //BA.debugLineNum = 53;BA.debugLine="If FeedbackGenerator.IsInitialized Then";
if ([self->__feedbackgenerator IsInitialized]) { 
 //BA.debugLineNum = 54;BA.debugLine="FeedbackGenerator = FeedbackGenerator.RunMethod(\"";
self->__feedbackgenerator = [[self->__feedbackgenerator RunMethod:@"alloc" :(B4IArray*)(nil)] RunMethod:@"initWithStyle:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(0))]]]];
 };
 //BA.debugLineNum = 57;BA.debugLine="ResetVisibles";
[self _resetvisibles];
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insertat:(int) _index :(B4XViewWrapper*) _pnl :(NSObject*) _value{
float _size = 0.0f;
 //BA.debugLineNum = 213;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
 //BA.debugLineNum = 214;BA.debugLine="Dim size As Float";
_size = 0.0f;
 //BA.debugLineNum = 215;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 216;BA.debugLine="size = pnl.Width";
_size = [_pnl Width];
 }else {
 //BA.debugLineNum = 218;BA.debugLine="size = pnl.Height";
_size = [_pnl Height];
 };
 //BA.debugLineNum = 220;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
[self _insertatimpl:_index :_pnl :(int) (_size) :_value :(int) (0)];
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insertatimpl:(int) _index :(B4XViewWrapper*) _pnl :(int) _itemsize :(NSObject*) _value :(int) _initialsize{
B4XViewWrapper* _p = nil;
int _includedividierheight = 0;
_clvitem* _newitem = nil;
int _offset = 0;
_clvitem* _previtem = nil;
int _i = 0;
_clvitem* _it = nil;
int _newoffset = 0;
 //BA.debugLineNum = 224;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
 //BA.debugLineNum = 226;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = [B4XViewWrapper new];
_p = [self _createpanel:@"Panel"];
 //BA.debugLineNum = 227;BA.debugLine="p.Color = Pnl.Color";
[_p setColor:[_pnl Color]];
 //BA.debugLineNum = 228;BA.debugLine="Pnl.Color = xui.Color_Transparent";
[_pnl setColor:[self->__xui Color_Transparent]];
 //BA.debugLineNum = 229;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 230;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
[_p AddView:(UIView*)((_pnl).object) :(float) (0) :(float) (0) :(float) (_itemsize) :(float) ([self->__sv ScrollViewContentHeight])];
 }else {
 //BA.debugLineNum = 232;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
[_p AddView:(UIView*)((_pnl).object) :(float) (0) :(float) (0) :(float) ([self->__sv ScrollViewContentWidth]) :(float) (_itemsize)];
 };
 //BA.debugLineNum = 234;BA.debugLine="p.Tag = Index";
[_p setTag:(NSObject*)(@(_index))];
 //BA.debugLineNum = 235;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
 //BA.debugLineNum = 236;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
if (_initialsize==0) { 
_includedividierheight = (int) (self->__mdividersize);}
else {
_includedividierheight = (int) (0);};
 //BA.debugLineNum = 237;BA.debugLine="Dim NewItem As CLVItem";
_newitem = [_clvitem new];
 //BA.debugLineNum = 238;BA.debugLine="NewItem.Panel = p";
_newitem->_Panel /*B4XViewWrapper**/  = _p;
 //BA.debugLineNum = 239;BA.debugLine="NewItem.Size = ItemSize";
_newitem->_Size /*int*/  = _itemsize;
 //BA.debugLineNum = 240;BA.debugLine="NewItem.Value = Value";
_newitem->_Value /*NSObject**/  = _value;
 //BA.debugLineNum = 241;BA.debugLine="NewItem.Color = p.Color";
_newitem->_Color /*int*/  = [_p Color];
 //BA.debugLineNum = 242;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
if (_index==[self->__items Size] && _initialsize==0) { 
 //BA.debugLineNum = 243;BA.debugLine="items.Add(NewItem)";
[self->__items Add:(NSObject*)(_newitem)];
 //BA.debugLineNum = 244;BA.debugLine="Dim offset As Int";
_offset = 0;
 //BA.debugLineNum = 245;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
 //BA.debugLineNum = 246;BA.debugLine="offset = mDividerSize";
_offset = (int) (self->__mdividersize);
 }else {
 //BA.debugLineNum = 248;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) ([self _getscrollviewcontentsize]);
 };
 //BA.debugLineNum = 250;BA.debugLine="NewItem.Offset = offset";
_newitem->_Offset /*int*/  = _offset;
 //BA.debugLineNum = 251;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 252;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
[[self->__sv ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (_offset) :(float) (0) :(float) (_itemsize) :[self->__sv Height]];
 }else {
 //BA.debugLineNum = 254;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
[[self->__sv ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (0) :(float) (_offset) :[self->__sv Width] :(float) (_itemsize)];
 };
 }else {
 //BA.debugLineNum = 257;BA.debugLine="Dim offset As Int";
_offset = 0;
 //BA.debugLineNum = 258;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
 //BA.debugLineNum = 259;BA.debugLine="offset = mDividerSize";
_offset = (int) (self->__mdividersize);
 }else {
 //BA.debugLineNum = 261;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
_previtem = (_clvitem*)([self->__items Get:(int) (_index-1)]);
 //BA.debugLineNum = 262;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
_offset = (int) (_previtem->_Offset /*int*/ +_previtem->_Size /*int*/ +self->__mdividersize);
 };
 //BA.debugLineNum = 264;BA.debugLine="For i = Index To items.Size - 1";
{
const int step39 = 1;
const int limit39 = (int) ([self->__items Size]-1);
_i = _index ;
for (;_i <= limit39 ;_i = _i + step39 ) {
 //BA.debugLineNum = 265;BA.debugLine="Dim It As CLVItem = items.Get(i)";
_it = (_clvitem*)([self->__items Get:_i]);
 //BA.debugLineNum = 266;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
_newoffset = (int) (_it->_Offset /*int*/ +_itemsize-_initialsize+_includedividierheight);
 //BA.debugLineNum = 267;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
if (fmin(_newoffset,_it->_Offset /*int*/ )-[self _getscrollviewoffset]<[self _getscrollviewvisiblesize]) { 
 //BA.debugLineNum = 268;BA.debugLine="It.Offset = NewOffset";
_it->_Offset /*int*/  = _newoffset;
 //BA.debugLineNum = 269;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 270;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
[_it->_Panel /*B4XViewWrapper**/  SetLayoutAnimated:self->__animationduration :(float) (_newoffset) :(float) (0) :(float) (_it->_Size /*int*/ ) :[_it->_Panel /*B4XViewWrapper**/  Height]];
 }else {
 //BA.debugLineNum = 272;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
[_it->_Panel /*B4XViewWrapper**/  SetLayoutAnimated:self->__animationduration :(float) (0) :(float) (_newoffset) :[_it->_Panel /*B4XViewWrapper**/  Width] :(float) (_it->_Size /*int*/ )];
 };
 }else {
 //BA.debugLineNum = 275;BA.debugLine="SetItemOffset(It, NewOffset)";
[self _setitemoffset:_it :(float) (_newoffset)];
 };
 //BA.debugLineNum = 277;BA.debugLine="It.Panel.Tag = i + 1";
[_it->_Panel /*B4XViewWrapper**/  setTag:(NSObject*)(@(_i+1))];
 }
};
 //BA.debugLineNum = 279;BA.debugLine="items.InsertAt(Index, NewItem)";
[self->__items InsertAt:_index :(NSObject*)(_newitem)];
 //BA.debugLineNum = 280;BA.debugLine="NewItem.Offset = offset";
_newitem->_Offset /*int*/  = _offset;
 //BA.debugLineNum = 281;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 282;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
[[self->__sv ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (_offset) :(float) (0) :(float) (_initialsize) :[self->__sv Height]];
 //BA.debugLineNum = 283;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
[_p SetLayoutAnimated:self->__animationduration :(float) (_offset) :(float) (0) :(float) (_itemsize) :[_p Height]];
 }else {
 //BA.debugLineNum = 285;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
[[self->__sv ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (0) :(float) (_offset) :[self->__sv Width] :(float) (_initialsize)];
 //BA.debugLineNum = 286;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
[_p SetLayoutAnimated:self->__animationduration :(float) (0) :(float) (_offset) :[_p Width] :(float) (_itemsize)];
 };
 };
 //BA.debugLineNum = 289;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
[self _setscrollviewcontentsize:(float) ([self _getscrollviewcontentsize]+_itemsize-_initialsize+_includedividierheight)];
 //BA.debugLineNum = 290;BA.debugLine="If items.Size = 1 And Index = 0 Then SetScrollVie";
if ([self->__items Size]==1 && _index==0) { 
[self _setscrollviewcontentsize:(float) (_itemsize+self->__mdividersize*2)];};
 //BA.debugLineNum = 291;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
if (_index<self->__mlastvisibleindex || [self _getrawlistitem:self->__mlastvisibleindex]->_Offset /*int*/ +[self _getrawlistitem:self->__mlastvisibleindex]->_Size /*int*/ +self->__mdividersize<[self _getscrollviewvisiblesize]) { 
 //BA.debugLineNum = 293;BA.debugLine="UpdateVisibleRange";
[self _updatevisiblerange];
 };
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insertattextitem:(int) _index :(NSObject*) _text :(NSObject*) _value{
B4XViewWrapper* _pnl = nil;
B4XViewWrapper* _lbl = nil;
_clvitem* _item = nil;
 //BA.debugLineNum = 193;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
 //BA.debugLineNum = 194;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 195;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
[self->___c LogImpl:@"62490370" :@"AddTextItem is only supported in vertical orientation." :0];
 //BA.debugLineNum = 196;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 198;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = [B4XViewWrapper new];
_pnl = [self _createpanel:@""];
 //BA.debugLineNum = 199;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = [B4XViewWrapper new];
_lbl = [self _createlabel:_text];
 //BA.debugLineNum = 200;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
[_lbl setHeight:(float) (fmax(((int) (50)),[_lbl Height]))];
 //BA.debugLineNum = 201;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
[_pnl AddView:(UIView*)((_lbl).object) :(float) (((int) (5))) :(float) (((int) (2))) :(float) ([self->__sv ScrollViewContentWidth]-((int) (10))) :[_lbl Height]];
 //BA.debugLineNum = 202;BA.debugLine="If xui.IsB4i = False Then";
if ([self->__xui IsB4i]==false) { 
 //BA.debugLineNum = 203;BA.debugLine="lbl.TextColor = DefaultTextColor";
[_lbl setTextColor:self->__defaulttextcolor];
 };
 //BA.debugLineNum = 205;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
[_pnl setColor:self->__defaulttextbackgroundcolor];
 //BA.debugLineNum = 206;BA.debugLine="pnl.Height = lbl.Height + 2dip";
[_pnl setHeight:(float) ([_lbl Height]+((int) (2)))];
 //BA.debugLineNum = 207;BA.debugLine="InsertAt(Index, pnl, Value)";
[self _insertat:_index :_pnl :_value];
 //BA.debugLineNum = 208;BA.debugLine="Dim item As CLVItem = GetRawListItem(Index)";
_item = [self _getrawlistitem:_index];
 //BA.debugLineNum = 209;BA.debugLine="item.TextItem = True";
_item->_TextItem /*BOOL*/  = true;
 //BA.debugLineNum = 210;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jumptoitem:(int) _index{
 //BA.debugLineNum = 385;BA.debugLine="Public Sub JumpToItem(Index As Int)";
 //BA.debugLineNum = 386;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
[self _setscrollviewoffset:(float) (fmin([self _getmaxscrolloffset],[self _finditemoffset:_index]))];
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel_click{
 //BA.debugLineNum = 530;BA.debugLine="Private Sub Panel_Click";
 //BA.debugLineNum = 531;BA.debugLine="PanelClickHandler(Sender)";
[self _panelclickhandler:(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]];
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel_longclick{
 //BA.debugLineNum = 534;BA.debugLine="Private Sub Panel_LongClick";
 //BA.debugLineNum = 535;BA.debugLine="PanelLongClickHandler(Sender)";
[self _panellongclickhandler:(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]];
 //BA.debugLineNum = 536;BA.debugLine="End Sub";
return @"";
}
- (void)  _panelclickhandler:(B4XViewWrapper*) _senderpanel{
ResumableSub_customlistview_PanelClickHandler* rsub = [[ResumableSub_customlistview_PanelClickHandler alloc] init:self : _senderpanel];
[rsub resume:self.bi :nil];
}
//490320509
- (NSString*)  _panellongclickhandler:(B4XViewWrapper*) _senderpanel{
 //BA.debugLineNum = 464;BA.debugLine="Private Sub PanelLongClickHandler(SenderPanel As B";
 //BA.debugLineNum = 465;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemLong";
if ([self->__xui SubExists:self->__callback :[@[self->__eventname,@"_ItemLongClick"] componentsJoinedByString:@""] :(int) (2)]) { 
 //BA.debugLineNum = 467;BA.debugLine="If FeedbackGenerator.IsInitialized Then";
if ([self->__feedbackgenerator IsInitialized]) { 
 //BA.debugLineNum = 468;BA.debugLine="FeedbackGenerator.RunMethod(\"impactOccurred\", N";
[self->__feedbackgenerator RunMethod:@"impactOccurred" :(B4IArray*)(nil)];
 };
 //BA.debugLineNum = 471;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemLongClick\",";
[self->___c CallSub3:self.bi :self->__callback :[@[self->__eventname,@"_ItemLongClick"] componentsJoinedByString:@""] :[_senderpanel Tag] :[self _getrawlistitem:[self.bi ObjectToNumber:[_senderpanel Tag]].intValue]->_Value /*NSObject**/ ];
 };
 //BA.debugLineNum = 473;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _refresh{
 //BA.debugLineNum = 66;BA.debugLine="Public Sub Refresh";
 //BA.debugLineNum = 67;BA.debugLine="ResetVisibles";
[self _resetvisibles];
 //BA.debugLineNum = 68;BA.debugLine="UpdateVisibleRange";
[self _updatevisiblerange];
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _removeat:(int) _index{
_clvitem* _removeitem = nil;
B4XViewWrapper* _p = nil;
int _i = 0;
_clvitem* _item = nil;
int _newoffset = 0;
 //BA.debugLineNum = 167;BA.debugLine="Public Sub RemoveAt(Index As Int)";
 //BA.debugLineNum = 168;BA.debugLine="If getSize <= 1 Then";
if ([self _getsize]<=1) { 
 //BA.debugLineNum = 169;BA.debugLine="Clear";
[self _clear];
 //BA.debugLineNum = 170;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 172;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (_clvitem*)([self->__items Get:_index]);
 //BA.debugLineNum = 173;BA.debugLine="Dim p As B4XView";
_p = [B4XViewWrapper new];
 //BA.debugLineNum = 174;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
const int step7 = 1;
const int limit7 = (int) ([self->__items Size]-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 175;BA.debugLine="Dim item As CLVItem = items.Get(i)";
_item = (_clvitem*)([self->__items Get:_i]);
 //BA.debugLineNum = 176;BA.debugLine="p = item.Panel";
_p = _item->_Panel /*B4XViewWrapper**/ ;
 //BA.debugLineNum = 177;BA.debugLine="p.Tag = i - 1";
[_p setTag:(NSObject*)(@(_i-1))];
 //BA.debugLineNum = 178;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
_newoffset = (int) (_item->_Offset /*int*/ -_removeitem->_Size /*int*/ -self->__mdividersize);
 //BA.debugLineNum = 179;BA.debugLine="SetItemOffset(item, NewOffset)";
[self _setitemoffset:_item :(float) (_newoffset)];
 }
};
 //BA.debugLineNum = 181;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
[self _setscrollviewcontentsize:(float) ([self _getscrollviewcontentsize]-_removeitem->_Size /*int*/ -self->__mdividersize)];
 //BA.debugLineNum = 182;BA.debugLine="items.RemoveAt(Index)";
[self->__items RemoveAt:_index];
 //BA.debugLineNum = 183;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
[_removeitem->_Panel /*B4XViewWrapper**/  RemoveViewFromParent];
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _replaceat:(int) _index :(B4XViewWrapper*) _pnl :(int) _itemsize :(NSObject*) _value{
_clvitem* _removeitem = nil;
 //BA.debugLineNum = 370;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
 //BA.debugLineNum = 371;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (_clvitem*)([self->__items Get:_index]);
 //BA.debugLineNum = 372;BA.debugLine="items.RemoveAt(Index)";
[self->__items RemoveAt:_index];
 //BA.debugLineNum = 373;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
[_removeitem->_Panel /*B4XViewWrapper**/  RemoveViewFromParent];
 //BA.debugLineNum = 374;BA.debugLine="InsertAtImpl(Index, pnl, ItemSize, Value, RemoveI";
[self _insertatimpl:_index :_pnl :_itemsize :_value :_removeitem->_Size /*int*/ ];
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resetvisibles{
 //BA.debugLineNum = 60;BA.debugLine="Private Sub ResetVisibles";
 //BA.debugLineNum = 61;BA.debugLine="mFirstVisibleIndex = -1";
self->__mfirstvisibleindex = (int) (-1);
 //BA.debugLineNum = 62;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
self->__mlastvisibleindex = (int) (0x7fffffff);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resizeitem:(int) _index :(int) _itemsize{
B4XViewWrapper* _p = nil;
NSObject* _value = nil;
B4XViewWrapper* _parent = nil;
 //BA.debugLineNum = 358;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemSize As In";
 //BA.debugLineNum = 359;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = [B4XViewWrapper new];
_p = [self _getpanel:_index];
 //BA.debugLineNum = 360;BA.debugLine="Dim value As Object = GetValue(Index)";
_value = [self _getvalue:_index];
 //BA.debugLineNum = 361;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = [B4XViewWrapper new];
_parent = [_p Parent];
 //BA.debugLineNum = 362;BA.debugLine="p.Color = parent.Color";
[_p setColor:[_parent Color]];
 //BA.debugLineNum = 363;BA.debugLine="p.RemoveViewFromParent";
[_p RemoveViewFromParent];
 //BA.debugLineNum = 364;BA.debugLine="ReplaceAt(Index, p, ItemSize, value)";
[self _replaceat:_index :_p :_itemsize :_value];
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _scrollhandler{
int _position = 0;
 //BA.debugLineNum = 502;BA.debugLine="Private Sub ScrollHandler";
 //BA.debugLineNum = 503;BA.debugLine="If items.Size = 0 Then Return";
if ([self->__items Size]==0) { 
if (true) return @"";};
 //BA.debugLineNum = 504;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) ([self _getscrollviewoffset]);
 //BA.debugLineNum = 505;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+[self _getscrollviewvisiblesize]>=[self _getscrollviewcontentsize]-((int) (5)) && [[self->___c DateTime] Now]>self->__lastreachendevent+100) { 
 //BA.debugLineNum = 506;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if ([self->__xui SubExists:self->__callback :[@[self->__eventname,@"_ReachEnd"] componentsJoinedByString:@""] :(int) (0)]) { 
 //BA.debugLineNum = 507;BA.debugLine="LastReachEndEvent = DateTime.Now";
self->__lastreachendevent = [[self->___c DateTime] Now];
 //BA.debugLineNum = 508;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
[self->___c CallSubDelayed:self.bi :self->__callback :[@[self->__eventname,@"_ReachEnd"] componentsJoinedByString:@""]];
 }else {
 //BA.debugLineNum = 510;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
self->__lastreachendevent = (long long) ([[self->___c DateTime] Now]+1000*[[self->___c DateTime] TicksPerDay]);
 };
 };
 //BA.debugLineNum = 513;BA.debugLine="UpdateVisibleRange";
[self _updatevisiblerange];
 //BA.debugLineNum = 514;BA.debugLine="If FireScrollChanged Then";
if (self->__firescrollchanged) { 
 //BA.debugLineNum = 515;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
[self->___c CallSub2:self.bi :self->__callback :[@[self->__eventname,@"_ScrollChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_position))];
 };
 //BA.debugLineNum = 517;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _scrolltoitem:(int) _index{
float _offset = 0.0f;
B4IScrollView* _nsv = nil;
 //BA.debugLineNum = 394;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
 //BA.debugLineNum = 395;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
_offset = (float) (fmin([self _getmaxscrolloffset],[self _finditemoffset:_index]));
 //BA.debugLineNum = 397;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = [B4IScrollView new];
_nsv.object = (UIScrollView*)((self->__sv).object);
 //BA.debugLineNum = 398;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 399;BA.debugLine="nsv.ScrollTo(offset, 0, True)";
[_nsv ScrollTo:(int) (_offset) :(int) (0) :true];
 }else {
 //BA.debugLineNum = 401;BA.debugLine="nsv.ScrollTo(0, offset, True)";
[_nsv ScrollTo:(int) (0) :(int) (_offset) :true];
 };
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setitemoffset:(_clvitem*) _item :(float) _offset{
 //BA.debugLineNum = 348;BA.debugLine="Private Sub SetItemOffset (item As CLVItem, offset";
 //BA.debugLineNum = 349;BA.debugLine="item.Offset = offset";
_item->_Offset /*int*/  = (int) (_offset);
 //BA.debugLineNum = 350;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 351;BA.debugLine="item.Panel.Left = offset";
[_item->_Panel /*B4XViewWrapper**/  setLeft:_offset];
 }else {
 //BA.debugLineNum = 353;BA.debugLine="item.Panel.Top = offset";
[_item->_Panel /*B4XViewWrapper**/  setTop:_offset];
 };
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setscrollviewcontentsize:(float) _f{
 //BA.debugLineNum = 340;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
 //BA.debugLineNum = 341;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 342;BA.debugLine="sv.ScrollViewContentWidth = f";
[self->__sv setScrollViewContentWidth:(int) (_f)];
 }else {
 //BA.debugLineNum = 344;BA.debugLine="sv.ScrollViewContentHeight = f";
[self->__sv setScrollViewContentHeight:(int) (_f)];
 };
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setscrollviewoffset:(float) _offset{
 //BA.debugLineNum = 324;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
 //BA.debugLineNum = 325;BA.debugLine="If horizontal Then";
if (self->__horizontal) { 
 //BA.debugLineNum = 326;BA.debugLine="sv.ScrollViewOffsetX = offset";
[self->__sv setScrollViewOffsetX:(int) (_offset)];
 }else {
 //BA.debugLineNum = 328;BA.debugLine="sv.ScrollViewOffsetY = offset";
[self->__sv setScrollViewOffsetY:(int) (_offset)];
 };
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _sv_scrollchanged:(int) _offsetx :(int) _offsety{
 //BA.debugLineNum = 580;BA.debugLine="Sub sv_ScrollChanged (OffsetX As Int, OffsetY As I";
 //BA.debugLineNum = 581;BA.debugLine="ScrollHandler";
[self _scrollhandler];
 //BA.debugLineNum = 582;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updatevisiblerange{
int _first = 0;
int _last = 0;
 //BA.debugLineNum = 297;BA.debugLine="Private Sub UpdateVisibleRange";
 //BA.debugLineNum = 298;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
if (self->__monitorvisiblerange==false || [self _getsize]==0) { 
if (true) return @"";};
 //BA.debugLineNum = 299;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = [self _getfirstvisibleindex];
 //BA.debugLineNum = 300;BA.debugLine="Dim last As Int = getLastVisibleIndex";
_last = [self _getlastvisibleindex];
 //BA.debugLineNum = 301;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
if (_first!=self->__mfirstvisibleindex || _last!=self->__mlastvisibleindex) { 
 //BA.debugLineNum = 302;BA.debugLine="mFirstVisibleIndex = first";
self->__mfirstvisibleindex = _first;
 //BA.debugLineNum = 303;BA.debugLine="mLastVisibleIndex = last";
self->__mlastvisibleindex = _last;
 //BA.debugLineNum = 304;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
[self->___c CallSubDelayed3:self.bi :self->__callback :[@[self->__eventname,@"_VisibleRangeChanged"] componentsJoinedByString:@""] :(NSObject*)(@(self->__mfirstvisibleindex)) :(NSObject*)(@(self->__mlastvisibleindex))];
 };
 //BA.debugLineNum = 306;BA.debugLine="End Sub";
return @"";
}
@end
