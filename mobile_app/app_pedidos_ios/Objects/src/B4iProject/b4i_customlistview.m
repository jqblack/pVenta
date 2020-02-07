
#import "b4i_customlistview.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
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
- (instancetype) init: (b4i_customlistview*) parent1 :(b4i_customlistview*) __ref1 :(B4XViewWrapper*) _senderpanel1;
@end
@implementation ResumableSub_customlistview_PanelClickHandler {
b4i_customlistview* parent;
b4i_customlistview* __ref;
B4XViewWrapper* _senderpanel;
int _clr;
BOOL _istransparentpressedcolor;
}
- (instancetype) init: (b4i_customlistview*) parent1 :(b4i_customlistview*) __ref1 :(B4XViewWrapper*) _senderpanel1 {
self->__ref = __ref1;
self->_senderpanel = _senderpanel1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_customlistview* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"customlistview";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="Dim clr As Int = GetRawListItem(SenderPanel.Tag).";
self->_clr = [self->__ref _getrawlistitem /*_clvitem**/ :nil :[self.bi ObjectToNumber:[self->_senderpanel Tag]].intValue]->_Color /*int*/ ;
B4IRDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Dim IsTransparentPressedColor As Boolean = Bit.An";
self->_istransparentpressedcolor = (((int) (0xff000000)) & (self->__ref->__pressedcolor /*int*/ ))==0;
B4IRDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="If IsTransparentPressedColor = False Then";
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
B4IRDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="SenderPanel.SetColorAnimated(50, clr, PressedCol";
[self->_senderpanel SetColorAnimated:(int) (50) :self->_clr :self->__ref->__pressedcolor /*int*/ ];
 if (true) break;
;
B4IRDebugUtils.currentLine=16056327;
 //BA.debugLineNum = 16056327;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemClic";

case 4:
//if
self->_state = 7;
if ([self->__ref->__xui /*B4IXUI**/  SubExists:self->__ref->__callback /*NSObject**/  :[@[self->__ref->__eventname /*NSString**/ ,@"_ItemClick"] componentsJoinedByString:@""] :(int) (2)]) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=16056328;
 //BA.debugLineNum = 16056328;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemClick\", Sen";
[parent->___c CallSub3:self.bi :self->__ref->__callback /*NSObject**/  :[@[self->__ref->__eventname /*NSString**/ ,@"_ItemClick"] componentsJoinedByString:@""] :[self->_senderpanel Tag] :[self->__ref _getrawlistitem /*_clvitem**/ :nil :[self.bi ObjectToNumber:[self->_senderpanel Tag]].intValue]->_Value /*NSObject**/ ];
 if (true) break;
;
B4IRDebugUtils.currentLine=16056330;
 //BA.debugLineNum = 16056330;BA.debugLine="If IsTransparentPressedColor = False Then";

case 7:
//if
self->_state = 10;
if (self->_istransparentpressedcolor==false) { 
self->_state = 9;
}if (true) break;

case 9:
//C
self->_state = 10;
B4IRDebugUtils.currentLine=16056331;
 //BA.debugLineNum = 16056331;BA.debugLine="Sleep(200)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"customlistview" :@"panelclickhandler"] :(int) (200)];
self->_state = 11;
return;
case 11:
//C
self->_state = 10;
;
B4IRDebugUtils.currentLine=16056332;
 //BA.debugLineNum = 16056332;BA.debugLine="SenderPanel.SetColorAnimated(200, PressedColor,";
[self->_senderpanel SetColorAnimated:(int) (200) :self->__ref->__pressedcolor /*int*/  :self->_clr];
 if (true) break;

case 10:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=16056334;
 //BA.debugLineNum = 16056334;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_customlistview 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_customlistview) instance released.");
}

- (NSString*)  _clear:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"clear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clear" :nil]);}
B4IRDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Public Sub Clear";
B4IRDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="items.Clear";
[__ref->__items /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="sv.ScrollViewInnerPanel.RemoveAllViews";
[[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] RemoveAllViews];
B4IRDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="SetScrollViewContentSize(0)";
[__ref _setscrollviewcontentsize /*NSString**/ :nil :(float) (0)];
B4IRDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="ResetVisibles";
[__ref _resetvisibles /*NSString**/ :nil];
B4IRDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _add:(b4i_customlistview*) __ref :(B4XViewWrapper*) _pnl :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"add"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"add::" :@[[B4I nilToNSNull:_pnl],[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Public Sub Add(Pnl As B4XView, Value As Object)";
B4IRDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="InsertAt(items.Size, Pnl, Value)";
[__ref _insertat /*NSString**/ :nil :[__ref->__items /*B4IList**/  Size] :_pnl :_value];
B4IRDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _getbase:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getbase"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getbase" :nil]);}
B4IRDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Public Sub GetBase As B4XView";
B4IRDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _removeat:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"removeat"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"removeat:" :@[@(_index)]]);}
_clvitem* _removeitem = nil;
B4XViewWrapper* _p = nil;
int _i = 0;
_clvitem* _item = nil;
int _newoffset = 0;
B4IRDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub RemoveAt(Index As Int)";
B4IRDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="If getSize <= 1 Then";
if ([__ref _getsize /*int*/ :nil]<=1) { 
B4IRDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Clear";
[__ref _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (_clvitem*)([__ref->__items /*B4IList**/  Get:_index]);
B4IRDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="Dim p As B4XView";
_p = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="For i = Index + 1 To items.Size - 1";
{
const int step7 = 1;
const int limit7 = (int) ([__ref->__items /*B4IList**/  Size]-1);
_i = (int) (_index+1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
B4IRDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="Dim item As CLVItem = items.Get(i)";
_item = (_clvitem*)([__ref->__items /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="p = item.Panel";
_p = _item->_Panel /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="p.Tag = i - 1";
[_p setTag:(NSObject*)(@(_i-1))];
B4IRDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="Dim NewOffset As Int = item.Offset - RemoveItem.";
_newoffset = (int) (_item->_Offset /*int*/ -_removeitem->_Size /*int*/ -__ref->__mdividersize /*float*/ );
B4IRDebugUtils.currentLine=14549004;
 //BA.debugLineNum = 14549004;BA.debugLine="SetItemOffset(item, NewOffset)";
[__ref _setitemoffset /*NSString**/ :nil :_item :(float) (_newoffset)];
 }
};
B4IRDebugUtils.currentLine=14549006;
 //BA.debugLineNum = 14549006;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
[__ref _setscrollviewcontentsize /*NSString**/ :nil :(float) ([__ref _getscrollviewcontentsize /*float*/ :nil]-_removeitem->_Size /*int*/ -__ref->__mdividersize /*float*/ )];
B4IRDebugUtils.currentLine=14549007;
 //BA.debugLineNum = 14549007;BA.debugLine="items.RemoveAt(Index)";
[__ref->__items /*B4IList**/  RemoveAt:_index];
B4IRDebugUtils.currentLine=14549008;
 //BA.debugLineNum = 14549008;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
[_removeitem->_Panel /*B4XViewWrapper**/  RemoveViewFromParent];
B4IRDebugUtils.currentLine=14549009;
 //BA.debugLineNum = 14549009;BA.debugLine="End Sub";
return @"";
}
- (int)  _getsize:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getsize" :nil]).intValue;}
B4IRDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub getSize As Int";
B4IRDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Return items.Size";
if (true) return [__ref->__items /*B4IList**/  Size];
B4IRDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _insertat:(b4i_customlistview*) __ref :(int) _index :(B4XViewWrapper*) _pnl :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"insertat"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"insertat:::" :@[@(_index),[B4I nilToNSNull:_pnl],[B4I nilToNSNull:_value]]]);}
float _size = 0.0f;
B4IRDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Public Sub InsertAt(Index As Int, pnl As B4XView,";
B4IRDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim size As Float";
_size = 0.0f;
B4IRDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="size = pnl.Width";
_size = [_pnl Width];
 }else {
B4IRDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="size = pnl.Height";
_size = [_pnl Height];
 };
B4IRDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="InsertAtImpl(Index, pnl, size, Value, 0)";
[__ref _insertatimpl /*NSString**/ :nil :_index :_pnl :(int) (_size) :_value :(int) (0)];
B4IRDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addtextitem:(b4i_customlistview*) __ref :(NSObject*) _text :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"addtextitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addtextitem::" :@[[B4I nilToNSNull:_text],[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub AddTextItem(Text As Object, Value As Ob";
B4IRDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="InsertAtTextItem(items.Size, Text, Value)";
[__ref _insertattextitem /*NSString**/ :nil :[__ref->__items /*B4IList**/  Size] :_text :_value];
B4IRDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insertattextitem:(b4i_customlistview*) __ref :(int) _index :(NSObject*) _text :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"insertattextitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"insertattextitem:::" :@[@(_index),[B4I nilToNSNull:_text],[B4I nilToNSNull:_value]]]);}
B4XViewWrapper* _pnl = nil;
B4XViewWrapper* _lbl = nil;
_clvitem* _item = nil;
B4IRDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Public Sub InsertAtTextItem(Index As Int, Text As";
B4IRDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Log(\"AddTextItem is only supported in vertical o";
[self->___c LogImpl:@"414680066" :@"AddTextItem is only supported in vertical orientation." :0];
B4IRDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="Dim pnl As B4XView = CreatePanel(\"\")";
_pnl = [B4XViewWrapper new];
_pnl = [__ref _createpanel /*B4XViewWrapper**/ :nil :@""];
B4IRDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="Dim lbl As B4XView = CreateLabel(Text)";
_lbl = [B4XViewWrapper new];
_lbl = [__ref _createlabel /*B4XViewWrapper**/ :nil :_text];
B4IRDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="lbl.Height = Max(50dip, lbl.Height)";
[_lbl setHeight:(float) (fmax(((int) (50)),[_lbl Height]))];
B4IRDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="pnl.AddView(lbl, 5dip, 2dip, sv.ScrollViewContent";
[_pnl AddView:(UIView*)((_lbl).object) :(float) (((int) (5))) :(float) (((int) (2))) :(float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentWidth]-((int) (10))) :[_lbl Height]];
B4IRDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="If xui.IsB4i = False Then";
if ([__ref->__xui /*B4IXUI**/  IsB4i]==false) { 
B4IRDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="lbl.TextColor = DefaultTextColor";
[_lbl setTextColor:__ref->__defaulttextcolor /*int*/ ];
 };
B4IRDebugUtils.currentLine=14680076;
 //BA.debugLineNum = 14680076;BA.debugLine="pnl.Color = DefaultTextBackgroundColor";
[_pnl setColor:__ref->__defaulttextbackgroundcolor /*int*/ ];
B4IRDebugUtils.currentLine=14680077;
 //BA.debugLineNum = 14680077;BA.debugLine="pnl.Height = lbl.Height + 2dip";
[_pnl setHeight:(float) ([_lbl Height]+((int) (2)))];
B4IRDebugUtils.currentLine=14680078;
 //BA.debugLineNum = 14680078;BA.debugLine="InsertAt(Index, pnl, Value)";
[__ref _insertat /*NSString**/ :nil :_index :_pnl :_value];
B4IRDebugUtils.currentLine=14680079;
 //BA.debugLineNum = 14680079;BA.debugLine="Dim item As CLVItem = GetRawListItem(Index)";
_item = [__ref _getrawlistitem /*_clvitem**/ :nil :_index];
B4IRDebugUtils.currentLine=14680080;
 //BA.debugLineNum = 14680080;BA.debugLine="item.TextItem = True";
_item->_TextItem /*BOOL*/  = true;
B4IRDebugUtils.currentLine=14680081;
 //BA.debugLineNum = 14680081;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _asview:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"asview"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"asview" :nil]);}
B4IRDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub AsView As B4XView";
B4IRDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _base_resize:(b4i_customlistview*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
int _scrollbar = 0;
_clvitem* _it = nil;
B4XViewWrapper* _lbl = nil;
B4IRDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Public Sub Base_Resize (Width As Double, Height As";
B4IRDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="sv.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__sv /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim scrollbar As Int";
_scrollbar = 0;
B4IRDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="If xui.IsB4J And ScrollBarsVisible Then scrollbar";
if ([__ref->__xui /*B4IXUI**/  IsB4J] && __ref->__scrollbarsvisible /*BOOL*/ ) { 
_scrollbar = (int) (20);};
B4IRDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="sv.ScrollViewContentHeight = Height - scrollbar";
[__ref->__sv /*B4XViewWrapper**/  setScrollViewContentHeight:(int) (_height-_scrollbar)];
B4IRDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="For Each it As CLVItem In items";
{
const id<B4IIterable> group6 = __ref->__items /*B4IList**/ ;
const int groupLen6 = group6.Size
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_it = (_clvitem*)([group6 Get:index6]);
B4IRDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="it.Panel.Height = sv.ScrollViewContentHeight";
[_it->_Panel /*B4XViewWrapper**/  setHeight:(float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentHeight])];
B4IRDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="it.Panel.GetView(0).Height = it.Panel.Height";
[[_it->_Panel /*B4XViewWrapper**/  GetView:(int) (0)] setHeight:[_it->_Panel /*B4XViewWrapper**/  Height]];
 }
};
 }else {
B4IRDebugUtils.currentLine=14024715;
 //BA.debugLineNum = 14024715;BA.debugLine="sv.ScrollViewContentWidth = Width - scrollbar";
[__ref->__sv /*B4XViewWrapper**/  setScrollViewContentWidth:(int) (_width-_scrollbar)];
B4IRDebugUtils.currentLine=14024716;
 //BA.debugLineNum = 14024716;BA.debugLine="For Each it As CLVItem In items";
{
const id<B4IIterable> group12 = __ref->__items /*B4IList**/ ;
const int groupLen12 = group12.Size
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_it = (_clvitem*)([group12 Get:index12]);
B4IRDebugUtils.currentLine=14024717;
 //BA.debugLineNum = 14024717;BA.debugLine="it.Panel.Width = sv.ScrollViewContentWidth";
[_it->_Panel /*B4XViewWrapper**/  setWidth:(float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentWidth])];
B4IRDebugUtils.currentLine=14024718;
 //BA.debugLineNum = 14024718;BA.debugLine="it.Panel.GetView(0).Width = it.Panel.Width";
[[_it->_Panel /*B4XViewWrapper**/  GetView:(int) (0)] setWidth:[_it->_Panel /*B4XViewWrapper**/  Width]];
B4IRDebugUtils.currentLine=14024719;
 //BA.debugLineNum = 14024719;BA.debugLine="If it.TextItem Then";
if (_it->_TextItem /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14024720;
 //BA.debugLineNum = 14024720;BA.debugLine="Dim lbl As B4XView = it.Panel.GetView(0).GetVi";
_lbl = [B4XViewWrapper new];
_lbl = [[_it->_Panel /*B4XViewWrapper**/  GetView:(int) (0)] GetView:(int) (0)];
B4IRDebugUtils.currentLine=14024721;
 //BA.debugLineNum = 14024721;BA.debugLine="lbl.SetLayoutAnimated(0, lbl.Left, lbl.Top, it";
[_lbl SetLayoutAnimated:(int) (0) :[_lbl Left] :[_lbl Top] :(float) ([_it->_Panel /*B4XViewWrapper**/  Width]-[_lbl Left]) :[_lbl Height]];
 };
 }
};
 };
B4IRDebugUtils.currentLine=14024725;
 //BA.debugLineNum = 14024725;BA.debugLine="If items.Size > 0 Then UpdateVisibleRange";
if ([__ref->__items /*B4IList**/  Size]>0) { 
[__ref _updatevisiblerange /*NSString**/ :nil];};
B4IRDebugUtils.currentLine=14024726;
 //BA.debugLineNum = 14024726;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updatevisiblerange:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"updatevisiblerange"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updatevisiblerange" :nil]);}
int _first = 0;
int _last = 0;
B4IRDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Private Sub UpdateVisibleRange";
B4IRDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="If MonitorVisibleRange = False Or getSize = 0 The";
if (__ref->__monitorvisiblerange /*BOOL*/ ==false || [__ref _getsize /*int*/ :nil]==0) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Dim first As Int = getFirstVisibleIndex";
_first = [__ref _getfirstvisibleindex /*int*/ :nil];
B4IRDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Dim last As Int = getLastVisibleIndex";
_last = [__ref _getlastvisibleindex /*int*/ :nil];
B4IRDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="If first <> mFirstVisibleIndex Or last <> mLastVi";
if (_first!=__ref->__mfirstvisibleindex /*int*/  || _last!=__ref->__mlastvisibleindex /*int*/ ) { 
B4IRDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="mFirstVisibleIndex = first";
__ref->__mfirstvisibleindex /*int*/  = _first;
B4IRDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="mLastVisibleIndex = last";
__ref->__mlastvisibleindex /*int*/  = _last;
B4IRDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="CallSubDelayed3(CallBack, EventName & \"_VisibleR";
[self->___c CallSubDelayed3:self.bi :__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_VisibleRangeChanged"] componentsJoinedByString:@""] :(NSObject*)(@(__ref->__mfirstvisibleindex /*int*/ )) :(NSObject*)(@(__ref->__mlastvisibleindex /*int*/ ))];
 };
B4IRDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_customlistview*) __ref{
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
B4IRDebugUtils.currentModule=@"customlistview";
B4IRDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Private mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Public sv As B4XView";
self->__sv = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Type CLVItem(Panel As B4XView, Size As Int, Value";
;
B4IRDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="Private items As List";
self->__items = [B4IList new];
B4IRDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Private mDividerSize As Float";
self->__mdividersize = 0.0f;
B4IRDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="Private EventName As String";
self->__eventname = @"";
B4IRDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Private CallBack As Object";
self->__callback = [NSObject new];
B4IRDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="Public DefaultTextColor As Int";
self->__defaulttextcolor = 0;
B4IRDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="Public DefaultTextBackgroundColor As Int";
self->__defaulttextbackgroundcolor = 0;
B4IRDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="Public AnimationDuration As Int = 300";
self->__animationduration = (int) (300);
B4IRDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="Private LastReachEndEvent As Long";
self->__lastreachendevent = 0L;
B4IRDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="Public PressedColor As Int";
self->__pressedcolor = 0;
B4IRDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="Private DesignerLabel As Label";
self->__designerlabel = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="Private horizontal As Boolean";
self->__horizontal = false;
B4IRDebugUtils.currentLine=13697046;
 //BA.debugLineNum = 13697046;BA.debugLine="Private FeedbackGenerator As NativeObject";
self->__feedbackgenerator = [B4INativeObject new];
B4IRDebugUtils.currentLine=13697048;
 //BA.debugLineNum = 13697048;BA.debugLine="Private mFirstVisibleIndex, mLastVisibleIndex As";
self->__mfirstvisibleindex = 0;
self->__mlastvisibleindex = 0;
B4IRDebugUtils.currentLine=13697049;
 //BA.debugLineNum = 13697049;BA.debugLine="Private MonitorVisibleRange As Boolean";
self->__monitorvisiblerange = false;
B4IRDebugUtils.currentLine=13697050;
 //BA.debugLineNum = 13697050;BA.debugLine="Private FireScrollChanged As Boolean";
self->__firescrollchanged = false;
B4IRDebugUtils.currentLine=13697051;
 //BA.debugLineNum = 13697051;BA.debugLine="Private ScrollBarsVisible As Boolean";
self->__scrollbarsvisible = false;
B4IRDebugUtils.currentLine=13697052;
 //BA.debugLineNum = 13697052;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setscrollviewcontentsize:(b4i_customlistview*) __ref :(float) _f{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"setscrollviewcontentsize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setscrollviewcontentsize:" :@[@(_f)]]);}
B4IRDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub SetScrollViewContentSize(f As Float)";
B4IRDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="sv.ScrollViewContentWidth = f";
[__ref->__sv /*B4XViewWrapper**/  setScrollViewContentWidth:(int) (_f)];
 }else {
B4IRDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="sv.ScrollViewContentHeight = f";
[__ref->__sv /*B4XViewWrapper**/  setScrollViewContentHeight:(int) (_f)];
 };
B4IRDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resetvisibles:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"resetvisibles"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resetvisibles" :nil]);}
B4IRDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub ResetVisibles";
B4IRDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="mFirstVisibleIndex = -1";
__ref->__mfirstvisibleindex /*int*/  = (int) (-1);
B4IRDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="mLastVisibleIndex = 0x7FFFFFFF";
__ref->__mlastvisibleindex /*int*/  = (int) (0x7fffffff);
B4IRDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createlabel:(b4i_customlistview*) __ref :(NSObject*) _txt{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"createlabel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"createlabel:" :@[[B4I nilToNSNull:_txt]]]);}
B4ILabelWrapper* _lbl = nil;
B4IRDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Private Sub CreateLabel(txt As Object) As B4XView";
B4IRDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="lbl.Initialize(\"\")";
[_lbl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="lbl.TextAlignment = DesignerLabel.TextAlignment";
[_lbl setTextAlignment:[__ref->__designerlabel /*B4ILabelWrapper**/  TextAlignment]];
B4IRDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="lbl.Font = DesignerLabel.Font";
[_lbl setFont:[__ref->__designerlabel /*B4ILabelWrapper**/  Font]];
B4IRDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="lbl.Multiline = True";
[_lbl setMultiline:true];
B4IRDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="lbl.TextColor = DefaultTextColor";
[_lbl setTextColor:__ref->__defaulttextcolor /*int*/ ];
B4IRDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="If txt Is AttributedString Then";
if ([_txt isKindOfClass: [NSAttributedString class]]) { 
B4IRDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="lbl.AttributedText = txt";
[_lbl setAttributedText:(B4IAttributedString*) [B4IObjectWrapper createWrapper:[B4IAttributedString new] object:(NSAttributedString*)(_txt)]];
 }else {
B4IRDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="lbl.Text = txt";
[_lbl setText:[self.bi ObjectToString:_txt]];
 };
B4IRDebugUtils.currentLine=16646156;
 //BA.debugLineNum = 16646156;BA.debugLine="lbl.Width = sv.ScrollViewContentWidth - 10dip";
[_lbl setWidth:(float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentWidth]-((int) (10)))];
B4IRDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="lbl.SizeToFit";
[_lbl SizeToFit];
B4IRDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="Return lbl";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_lbl).object)];
B4IRDebugUtils.currentLine=16646159;
 //BA.debugLineNum = 16646159;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _createpanel:(b4i_customlistview*) __ref :(NSString*) _paneleventname{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"createpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"createpanel:" :@[[B4I nilToNSNull:_paneleventname]]]);}
B4IRDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub CreatePanel (PanelEventName As String)";
B4IRDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Return xui.CreatePanel(PanelEventName)";
if (true) return [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :_paneleventname];
B4IRDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return nil;
}
- (B4XViewWrapper*)  _createscrollview:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"createscrollview"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"createscrollview" :nil]);}
B4IScrollView* _nsv = nil;
B4IRDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Private Sub CreateScrollView As B4XView";
B4IRDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim nsv As ScrollView";
_nsv = [B4IScrollView new];
B4IRDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="nsv.Initialize(\"sv\", 0, 0)";
[_nsv Initialize:self.bi :@"sv" :(int) (0) :(int) (0)];
B4IRDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Return nsv";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_nsv).object)];
B4IRDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _designercreateview:(b4i_customlistview*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
NSString* _o = @"";
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Dim o As String = Props.GetDefault(\"ListOrientati";
_o = [self.bi ObjectToString:[_props GetDefault:(NSObject*)(@"ListOrientation") :(NSObject*)(@"Vertical")]];
B4IRDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="horizontal = o = \"Horizontal\"";
__ref->__horizontal /*BOOL*/  = [_o isEqual:@"Horizontal"];
B4IRDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="sv = CreateScrollView";
__ref->__sv /*B4XViewWrapper**/  = [__ref _createscrollview /*B4XViewWrapper**/ :nil];
B4IRDebugUtils.currentLine=13959173;
 //BA.debugLineNum = 13959173;BA.debugLine="mBase.AddView(sv, 0, 0, mBase.Width, mBase.Height";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__sv /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="sv.ScrollViewInnerPanel.Color = xui.PaintOrColorT";
[[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] setColor:[__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"DividerColor")]]];
B4IRDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="mDividerSize = DipToCurrent(Props.Get(\"DividerHei";
__ref->__mdividersize /*float*/  = (float) (([self.bi ObjectToNumber:[_props Get:(NSObject*)(@"DividerHeight")]].intValue));
B4IRDebugUtils.currentLine=13959176;
 //BA.debugLineNum = 13959176;BA.debugLine="PressedColor = xui.PaintOrColorToColor(Props.Get(";
__ref->__pressedcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"PressedColor")]];
B4IRDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="AnimationDuration = Props.GetDefault(\"InsertAnima";
__ref->__animationduration /*int*/  = [self.bi ObjectToNumber:[_props GetDefault:(NSObject*)(@"InsertAnimationDuration") :(NSObject*)(@(__ref->__animationduration /*int*/ ))]].intValue;
B4IRDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="ScrollBarsVisible = Props.GetDefault(\"ShowScrollB";
__ref->__scrollbarsvisible /*BOOL*/  = [self.bi ObjectToBoolean:[_props GetDefault:(NSObject*)(@"ShowScrollBar") :(NSObject*)(@(true))]];
B4IRDebugUtils.currentLine=13959179;
 //BA.debugLineNum = 13959179;BA.debugLine="If ScrollBarsVisible = False Then";
if (__ref->__scrollbarsvisible /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=13959192;
 //BA.debugLineNum = 13959192;BA.debugLine="Dim no As NativeObject = sv";
_no = [B4INativeObject new];
_no.object = (NSObject*)((__ref->__sv /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=13959193;
 //BA.debugLineNum = 13959193;BA.debugLine="no.RunMethod(\"setShowsHorizontalScrollIndicator:";
[_no RunMethod:@"setShowsHorizontalScrollIndicator:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(false))]]]];
B4IRDebugUtils.currentLine=13959194;
 //BA.debugLineNum = 13959194;BA.debugLine="no.RunMethod(\"setShowsVerticalScrollIndicator:\",";
[_no RunMethod:@"setShowsVerticalScrollIndicator:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(false))]]]];
 };
B4IRDebugUtils.currentLine=13959197;
 //BA.debugLineNum = 13959197;BA.debugLine="DefaultTextColor = xui.PaintOrColorToColor(Lbl.Te";
__ref->__defaulttextcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:(NSObject*)(@([_lbl TextColor]))];
B4IRDebugUtils.currentLine=13959198;
 //BA.debugLineNum = 13959198;BA.debugLine="DefaultTextBackgroundColor = mBase.Color";
__ref->__defaulttextbackgroundcolor /*int*/  = [__ref->__mbase /*B4XViewWrapper**/  Color];
B4IRDebugUtils.currentLine=13959199;
 //BA.debugLineNum = 13959199;BA.debugLine="DesignerLabel = Lbl";
__ref->__designerlabel /*B4ILabelWrapper**/  = _lbl;
B4IRDebugUtils.currentLine=13959200;
 //BA.debugLineNum = 13959200;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=13959201;
 //BA.debugLineNum = 13959201;BA.debugLine="End Sub";
return @"";
}
- (int)  _findindexfromoffset:(b4i_customlistview*) __ref :(int) _offset{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"findindexfromoffset"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"findindexfromoffset:" :@[@(_offset)]]).intValue;}
int _position = 0;
int _stepsize = 0;
_clvitem* _currentitem = nil;
int _nextoffset = 0;
int _prevoffset = 0;
B4IRDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Public Sub FindIndexFromOffset(Offset As Int) As I";
B4IRDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="Dim Position As Int = items.Size / 2";
_position = (int) ([__ref->__items /*B4IList**/  Size]/(double)2);
B4IRDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="Dim StepSize As Int = Ceil(Position / 2)";
_stepsize = (int) (ceil(_position/(double)2));
B4IRDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Do While True";
while (true) {
B4IRDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="Dim CurrentItem As CLVItem = items.Get(Position)";
_currentitem = (_clvitem*)([__ref->__items /*B4IList**/  Get:_position]);
B4IRDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="Dim NextOffset As Int";
_nextoffset = 0;
B4IRDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="If Position < items.Size - 1 Then";
if (_position<[__ref->__items /*B4IList**/  Size]-1) { 
B4IRDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="NextOffset = GetRawListItem(Position + 1).Offse";
_nextoffset = (int) ([__ref _getrawlistitem /*_clvitem**/ :nil :(int) (_position+1)]->_Offset /*int*/ -1);
 }else {
B4IRDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="NextOffset = 0x7FFFFFFF";
_nextoffset = (int) (0x7fffffff);
 };
B4IRDebugUtils.currentLine=15794188;
 //BA.debugLineNum = 15794188;BA.debugLine="Dim PrevOffset As Int";
_prevoffset = 0;
B4IRDebugUtils.currentLine=15794189;
 //BA.debugLineNum = 15794189;BA.debugLine="If Position = 0 Then";
if (_position==0) { 
B4IRDebugUtils.currentLine=15794190;
 //BA.debugLineNum = 15794190;BA.debugLine="PrevOffset = 0x80000000";
_prevoffset = (int) (0x80000000);
 }else {
B4IRDebugUtils.currentLine=15794192;
 //BA.debugLineNum = 15794192;BA.debugLine="PrevOffset = CurrentItem.Offset";
_prevoffset = _currentitem->_Offset /*int*/ ;
 };
B4IRDebugUtils.currentLine=15794194;
 //BA.debugLineNum = 15794194;BA.debugLine="If Offset > NextOffset Then";
if (_offset>_nextoffset) { 
B4IRDebugUtils.currentLine=15794195;
 //BA.debugLineNum = 15794195;BA.debugLine="Position = Min(Position + StepSize, items.Size";
_position = (int) (fmin(_position+_stepsize,[__ref->__items /*B4IList**/  Size]-1));
 }else if(_offset<_prevoffset) { 
B4IRDebugUtils.currentLine=15794197;
 //BA.debugLineNum = 15794197;BA.debugLine="Position = Max(Position - StepSize, 0)";
_position = (int) (fmax(_position-_stepsize,0));
 }else {
B4IRDebugUtils.currentLine=15794199;
 //BA.debugLineNum = 15794199;BA.debugLine="Return Position";
if (true) return _position;
 };
B4IRDebugUtils.currentLine=15794201;
 //BA.debugLineNum = 15794201;BA.debugLine="StepSize = Ceil(StepSize / 2)";
_stepsize = (int) (ceil(_stepsize/(double)2));
 }
;
B4IRDebugUtils.currentLine=15794203;
 //BA.debugLineNum = 15794203;BA.debugLine="Return -1";
if (true) return (int) (-1);
B4IRDebugUtils.currentLine=15794204;
 //BA.debugLineNum = 15794204;BA.debugLine="End Sub";
return 0;
}
- (_clvitem*)  _getrawlistitem:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getrawlistitem"])
	 {return ((_clvitem*) [B4IDebug delegate:self.bi :@"getrawlistitem:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Public Sub GetRawListItem(Index As Int) As CLVItem";
B4IRDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Return items.Get(Index)";
if (true) return (_clvitem*)([__ref->__items /*B4IList**/  Get:_index]);
B4IRDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="End Sub";
return nil;
}
- (int)  _finditemoffset:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"finditemoffset"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"finditemoffset:" :@[@(_index)]]).intValue;}
B4IRDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub FindItemOffset(Index As Int) As Int";
B4IRDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Return GetRawListItem(Index).Offset";
if (true) return [__ref _getrawlistitem /*_clvitem**/ :nil :_index]->_Offset /*int*/ ;
B4IRDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
return 0;
}
- (float)  _getdividersize:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getdividersize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getdividersize" :nil]).floatValue;}
B4IRDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub getDividerSize As Float";
B4IRDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Return mDividerSize";
if (true) return __ref->__mdividersize /*float*/ ;
B4IRDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="End Sub";
return 0.0f;
}
- (int)  _getfirstvisibleindex:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getfirstvisibleindex"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getfirstvisibleindex" :nil]).intValue;}
B4IRDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Public Sub getFirstVisibleIndex As Int";
B4IRDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return [__ref _findindexfromoffset /*int*/ :nil :(int) ([__ref _getscrollviewoffset /*float*/ :nil]+__ref->__mdividersize /*float*/ )];
B4IRDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="End Sub";
return 0;
}
- (float)  _getscrollviewoffset:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getscrollviewoffset"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getscrollviewoffset" :nil]).floatValue;}
B4IRDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub GetScrollViewOffset As Float";
B4IRDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="Return sv.ScrollViewOffsetX";
if (true) return (float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewOffsetX]);
 }else {
B4IRDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="Return sv.ScrollViewOffsetY";
if (true) return (float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewOffsetY]);
 };
B4IRDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="End Sub";
return 0.0f;
}
- (int)  _getitemfromview:(b4i_customlistview*) __ref :(B4XViewWrapper*) _v{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getitemfromview"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getitemfromview:" :@[[B4I nilToNSNull:_v]]]).intValue;}
NSObject* _parent = nil;
B4XViewWrapper* _current = nil;
B4IRDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Public Sub GetItemFromView(v As B4XView) As Int";
B4IRDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="Dim parent = v As Object, current As B4XView";
_parent = (NSObject*)((_v).object);
_current = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="Do While sv.ScrollViewInnerPanel <> parent";
while ([[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] isEqual:(NSObject*)(_parent)] == false) {
B4IRDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="current = parent";
_current.object = (NSObject*)(_parent);
B4IRDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="parent = current.Parent";
_parent = (NSObject*)(([_current Parent]).object);
 }
;
B4IRDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="v = current";
_v = _current;
B4IRDebugUtils.currentLine=16121863;
 //BA.debugLineNum = 16121863;BA.debugLine="Return v.Tag";
if (true) return [self.bi ObjectToNumber:[_v Tag]].intValue;
B4IRDebugUtils.currentLine=16121864;
 //BA.debugLineNum = 16121864;BA.debugLine="End Sub";
return 0;
}
- (int)  _getlastvisibleindex:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getlastvisibleindex"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getlastvisibleindex" :nil]).intValue;}
B4IRDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub getLastVisibleIndex As Int";
B4IRDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Return FindIndexFromOffset(GetScrollViewOffset +";
if (true) return [__ref _findindexfromoffset /*int*/ :nil :(int) ([__ref _getscrollviewoffset /*float*/ :nil]+[__ref _getscrollviewvisiblesize /*float*/ :nil])];
B4IRDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="End Sub";
return 0;
}
- (float)  _getscrollviewvisiblesize:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getscrollviewvisiblesize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getscrollviewvisiblesize" :nil]).floatValue;}
B4IRDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub GetScrollViewVisibleSize As Float";
B4IRDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="Return sv.Width";
if (true) return [__ref->__sv /*B4XViewWrapper**/  Width];
 }else {
B4IRDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="Return sv.Height";
if (true) return [__ref->__sv /*B4XViewWrapper**/  Height];
 };
B4IRDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="End Sub";
return 0.0f;
}
- (float)  _getmaxscrolloffset:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getmaxscrolloffset"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getmaxscrolloffset" :nil]).floatValue;}
B4IRDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub GetMaxScrollOffset As Float";
B4IRDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Return GetScrollViewContentSize - GetScrollViewVi";
if (true) return (float) ([__ref _getscrollviewcontentsize /*float*/ :nil]-[__ref _getscrollviewvisiblesize /*float*/ :nil]);
B4IRDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="End Sub";
return 0.0f;
}
- (float)  _getscrollviewcontentsize:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getscrollviewcontentsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getscrollviewcontentsize" :nil]).floatValue;}
B4IRDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub GetScrollViewContentSize As Float";
B4IRDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Return sv.ScrollViewContentWidth";
if (true) return (float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentWidth]);
 }else {
B4IRDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="Return sv.ScrollViewContentHeight";
if (true) return (float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentHeight]);
 };
B4IRDebugUtils.currentLine=15138822;
 //BA.debugLineNum = 15138822;BA.debugLine="End Sub";
return 0.0f;
}
- (B4XViewWrapper*)  _getpanel:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Public Sub GetPanel(Index As Int) As B4XView";
B4IRDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Return GetRawListItem(Index).Panel.GetView(0)";
if (true) return [[__ref _getrawlistitem /*_clvitem**/ :nil :_index]->_Panel /*B4XViewWrapper**/  GetView:(int) (0)];
B4IRDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return nil;
}
- (NSObject*)  _getvalue:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"getvalue"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"getvalue:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Public Sub GetValue(Index As Int) As Object";
B4IRDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Return GetRawListItem(Index).Value";
if (true) return [__ref _getrawlistitem /*_clvitem**/ :nil :_index]->_Value /*NSObject**/ ;
B4IRDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_customlistview*) __ref :(B4I*) _ba :(NSObject*) _vcallback :(NSString*) _veventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_vcallback],[B4I nilToNSNull:_veventname]]]);}
B4IRDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub Initialize (vCallBack As Object, vEvent";
B4IRDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="EventName = vEventName";
__ref->__eventname /*NSString**/  = _veventname;
B4IRDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="CallBack = vCallBack";
__ref->__callback /*NSObject**/  = _vcallback;
B4IRDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="items.Initialize";
[__ref->__items /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="DefaultTextBackgroundColor = xui.Color_White";
__ref->__defaulttextbackgroundcolor /*int*/  = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=13762565;
 //BA.debugLineNum = 13762565;BA.debugLine="DefaultTextColor = xui.Color_Black";
__ref->__defaulttextcolor /*int*/  = [__ref->__xui /*B4IXUI**/  Color_Black];
B4IRDebugUtils.currentLine=13762566;
 //BA.debugLineNum = 13762566;BA.debugLine="MonitorVisibleRange = xui.SubExists(CallBack, Eve";
__ref->__monitorvisiblerange /*BOOL*/  = [__ref->__xui /*B4IXUI**/  SubExists:__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_VisibleRangeChanged"] componentsJoinedByString:@""] :(int) (2)];
B4IRDebugUtils.currentLine=13762567;
 //BA.debugLineNum = 13762567;BA.debugLine="FireScrollChanged = xui.SubExists(CallBack, Event";
__ref->__firescrollchanged /*BOOL*/  = [__ref->__xui /*B4IXUI**/  SubExists:__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_ScrollChanged"] componentsJoinedByString:@""] :(int) (1)];
B4IRDebugUtils.currentLine=13762569;
 //BA.debugLineNum = 13762569;BA.debugLine="FeedbackGenerator.Initialize(\"UIImpactFeedbackGen";
[__ref->__feedbackgenerator /*B4INativeObject**/  Initialize:@"UIImpactFeedbackGenerator"];
B4IRDebugUtils.currentLine=13762570;
 //BA.debugLineNum = 13762570;BA.debugLine="If FeedbackGenerator.IsInitialized Then";
if ([__ref->__feedbackgenerator /*B4INativeObject**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=13762571;
 //BA.debugLineNum = 13762571;BA.debugLine="FeedbackGenerator =FeedbackGenerator.RunMethod(\"";
__ref->__feedbackgenerator /*B4INativeObject**/  = [[__ref->__feedbackgenerator /*B4INativeObject**/  RunMethod:@"alloc" :(B4IArray*)(nil)] RunMethod:@"initWithStyle:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(0))]]]];
 };
B4IRDebugUtils.currentLine=13762574;
 //BA.debugLineNum = 13762574;BA.debugLine="ResetVisibles";
[__ref _resetvisibles /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13762575;
 //BA.debugLineNum = 13762575;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _insertatimpl:(b4i_customlistview*) __ref :(int) _index :(B4XViewWrapper*) _pnl :(int) _itemsize :(NSObject*) _value :(int) _initialsize{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"insertatimpl"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"insertatimpl:::::" :@[@(_index),[B4I nilToNSNull:_pnl],@(_itemsize),[B4I nilToNSNull:_value],@(_initialsize)]]);}
B4XViewWrapper* _p = nil;
int _includedividierheight = 0;
_clvitem* _newitem = nil;
int _offset = 0;
_clvitem* _previtem = nil;
int _i = 0;
_clvitem* _it = nil;
int _newoffset = 0;
B4IRDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Private Sub InsertAtImpl(Index As Int, Pnl As B4XV";
B4IRDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Dim p As B4XView = CreatePanel(\"Panel\")";
_p = [B4XViewWrapper new];
_p = [__ref _createpanel /*B4XViewWrapper**/ :nil :@"Panel"];
B4IRDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="p.Color = Pnl.Color";
[_p setColor:[_pnl Color]];
B4IRDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="Pnl.Color = xui.Color_Transparent";
[_pnl setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="p.AddView(Pnl, 0, 0, ItemSize, sv.ScrollViewCont";
[_p AddView:(UIView*)((_pnl).object) :(float) (0) :(float) (0) :(float) (_itemsize) :(float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentHeight])];
 }else {
B4IRDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="p.AddView(Pnl, 0, 0, sv.ScrollViewContentWidth,";
[_p AddView:(UIView*)((_pnl).object) :(float) (0) :(float) (0) :(float) ([__ref->__sv /*B4XViewWrapper**/  ScrollViewContentWidth]) :(float) (_itemsize)];
 };
B4IRDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="p.Tag = Index";
[_p setTag:(NSObject*)(@(_index))];
B4IRDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="Dim IncludeDividierHeight As Int";
_includedividierheight = 0;
B4IRDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="If InitialSize = 0 Then IncludeDividierHeight = m";
if (_initialsize==0) { 
_includedividierheight = (int) (__ref->__mdividersize /*float*/ );}
else {
_includedividierheight = (int) (0);};
B4IRDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Dim NewItem As CLVItem";
_newitem = [_clvitem new];
B4IRDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="NewItem.Panel = p";
_newitem->_Panel /*B4XViewWrapper**/  = _p;
B4IRDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="NewItem.Size = ItemSize";
_newitem->_Size /*int*/  = _itemsize;
B4IRDebugUtils.currentLine=14811152;
 //BA.debugLineNum = 14811152;BA.debugLine="NewItem.Value = Value";
_newitem->_Value /*NSObject**/  = _value;
B4IRDebugUtils.currentLine=14811153;
 //BA.debugLineNum = 14811153;BA.debugLine="NewItem.Color = p.Color";
_newitem->_Color /*int*/  = [_p Color];
B4IRDebugUtils.currentLine=14811154;
 //BA.debugLineNum = 14811154;BA.debugLine="If Index = items.Size And InitialSize = 0 Then";
if (_index==[__ref->__items /*B4IList**/  Size] && _initialsize==0) { 
B4IRDebugUtils.currentLine=14811155;
 //BA.debugLineNum = 14811155;BA.debugLine="items.Add(NewItem)";
[__ref->__items /*B4IList**/  Add:(NSObject*)(_newitem)];
B4IRDebugUtils.currentLine=14811156;
 //BA.debugLineNum = 14811156;BA.debugLine="Dim offset As Int";
_offset = 0;
B4IRDebugUtils.currentLine=14811157;
 //BA.debugLineNum = 14811157;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
B4IRDebugUtils.currentLine=14811158;
 //BA.debugLineNum = 14811158;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref->__mdividersize /*float*/ );
 }else {
B4IRDebugUtils.currentLine=14811160;
 //BA.debugLineNum = 14811160;BA.debugLine="offset = GetScrollViewContentSize";
_offset = (int) ([__ref _getscrollviewcontentsize /*float*/ :nil]);
 };
B4IRDebugUtils.currentLine=14811162;
 //BA.debugLineNum = 14811162;BA.debugLine="NewItem.Offset = offset";
_newitem->_Offset /*int*/  = _offset;
B4IRDebugUtils.currentLine=14811163;
 //BA.debugLineNum = 14811163;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14811164;
 //BA.debugLineNum = 14811164;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
[[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (_offset) :(float) (0) :(float) (_itemsize) :[__ref->__sv /*B4XViewWrapper**/  Height]];
 }else {
B4IRDebugUtils.currentLine=14811166;
 //BA.debugLineNum = 14811166;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
[[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (0) :(float) (_offset) :[__ref->__sv /*B4XViewWrapper**/  Width] :(float) (_itemsize)];
 };
 }else {
B4IRDebugUtils.currentLine=14811169;
 //BA.debugLineNum = 14811169;BA.debugLine="Dim offset As Int";
_offset = 0;
B4IRDebugUtils.currentLine=14811170;
 //BA.debugLineNum = 14811170;BA.debugLine="If Index = 0 Then";
if (_index==0) { 
B4IRDebugUtils.currentLine=14811171;
 //BA.debugLineNum = 14811171;BA.debugLine="offset = mDividerSize";
_offset = (int) (__ref->__mdividersize /*float*/ );
 }else {
B4IRDebugUtils.currentLine=14811173;
 //BA.debugLineNum = 14811173;BA.debugLine="Dim PrevItem As CLVItem = items.Get(Index - 1)";
_previtem = (_clvitem*)([__ref->__items /*B4IList**/  Get:(int) (_index-1)]);
B4IRDebugUtils.currentLine=14811174;
 //BA.debugLineNum = 14811174;BA.debugLine="offset = PrevItem.Offset + PrevItem.Size + mDiv";
_offset = (int) (_previtem->_Offset /*int*/ +_previtem->_Size /*int*/ +__ref->__mdividersize /*float*/ );
 };
B4IRDebugUtils.currentLine=14811176;
 //BA.debugLineNum = 14811176;BA.debugLine="For i = Index To items.Size - 1";
{
const int step39 = 1;
const int limit39 = (int) ([__ref->__items /*B4IList**/  Size]-1);
_i = _index ;
for (;_i <= limit39 ;_i = _i + step39 ) {
B4IRDebugUtils.currentLine=14811177;
 //BA.debugLineNum = 14811177;BA.debugLine="Dim It As CLVItem = items.Get(i)";
_it = (_clvitem*)([__ref->__items /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=14811178;
 //BA.debugLineNum = 14811178;BA.debugLine="Dim NewOffset As Int = It.Offset + ItemSize - I";
_newoffset = (int) (_it->_Offset /*int*/ +_itemsize-_initialsize+_includedividierheight);
B4IRDebugUtils.currentLine=14811179;
 //BA.debugLineNum = 14811179;BA.debugLine="If Min(NewOffset, It.Offset) - GetScrollViewOff";
if (fmin(_newoffset,_it->_Offset /*int*/ )-[__ref _getscrollviewoffset /*float*/ :nil]<[__ref _getscrollviewvisiblesize /*float*/ :nil]) { 
B4IRDebugUtils.currentLine=14811180;
 //BA.debugLineNum = 14811180;BA.debugLine="It.Offset = NewOffset";
_it->_Offset /*int*/  = _newoffset;
B4IRDebugUtils.currentLine=14811181;
 //BA.debugLineNum = 14811181;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14811182;
 //BA.debugLineNum = 14811182;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
[_it->_Panel /*B4XViewWrapper**/  SetLayoutAnimated:__ref->__animationduration /*int*/  :(float) (_newoffset) :(float) (0) :(float) (_it->_Size /*int*/ ) :[_it->_Panel /*B4XViewWrapper**/  Height]];
 }else {
B4IRDebugUtils.currentLine=14811184;
 //BA.debugLineNum = 14811184;BA.debugLine="It.Panel.SetLayoutAnimated(AnimationDuration,";
[_it->_Panel /*B4XViewWrapper**/  SetLayoutAnimated:__ref->__animationduration /*int*/  :(float) (0) :(float) (_newoffset) :[_it->_Panel /*B4XViewWrapper**/  Width] :(float) (_it->_Size /*int*/ )];
 };
 }else {
B4IRDebugUtils.currentLine=14811187;
 //BA.debugLineNum = 14811187;BA.debugLine="SetItemOffset(It, NewOffset)";
[__ref _setitemoffset /*NSString**/ :nil :_it :(float) (_newoffset)];
 };
B4IRDebugUtils.currentLine=14811189;
 //BA.debugLineNum = 14811189;BA.debugLine="It.Panel.Tag = i + 1";
[_it->_Panel /*B4XViewWrapper**/  setTag:(NSObject*)(@(_i+1))];
 }
};
B4IRDebugUtils.currentLine=14811191;
 //BA.debugLineNum = 14811191;BA.debugLine="items.InsertAt(Index, NewItem)";
[__ref->__items /*B4IList**/  InsertAt:_index :(NSObject*)(_newitem)];
B4IRDebugUtils.currentLine=14811192;
 //BA.debugLineNum = 14811192;BA.debugLine="NewItem.Offset = offset";
_newitem->_Offset /*int*/  = _offset;
B4IRDebugUtils.currentLine=14811193;
 //BA.debugLineNum = 14811193;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14811194;
 //BA.debugLineNum = 14811194;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, offset, 0, I";
[[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (_offset) :(float) (0) :(float) (_initialsize) :[__ref->__sv /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=14811195;
 //BA.debugLineNum = 14811195;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, offset,";
[_p SetLayoutAnimated:__ref->__animationduration /*int*/  :(float) (_offset) :(float) (0) :(float) (_itemsize) :[_p Height]];
 }else {
B4IRDebugUtils.currentLine=14811197;
 //BA.debugLineNum = 14811197;BA.debugLine="sv.ScrollViewInnerPanel.AddView(p, 0, offset, s";
[[__ref->__sv /*B4XViewWrapper**/  ScrollViewInnerPanel] AddView:(UIView*)((_p).object) :(float) (0) :(float) (_offset) :[__ref->__sv /*B4XViewWrapper**/  Width] :(float) (_initialsize)];
B4IRDebugUtils.currentLine=14811198;
 //BA.debugLineNum = 14811198;BA.debugLine="p.SetLayoutAnimated(AnimationDuration, 0, offse";
[_p SetLayoutAnimated:__ref->__animationduration /*int*/  :(float) (0) :(float) (_offset) :[_p Width] :(float) (_itemsize)];
 };
 };
B4IRDebugUtils.currentLine=14811201;
 //BA.debugLineNum = 14811201;BA.debugLine="SetScrollViewContentSize(GetScrollViewContentSize";
[__ref _setscrollviewcontentsize /*NSString**/ :nil :(float) ([__ref _getscrollviewcontentsize /*float*/ :nil]+_itemsize-_initialsize+_includedividierheight)];
B4IRDebugUtils.currentLine=14811202;
 //BA.debugLineNum = 14811202;BA.debugLine="If items.Size = 1 And Index = 0 Then SetScrollVie";
if ([__ref->__items /*B4IList**/  Size]==1 && _index==0) { 
[__ref _setscrollviewcontentsize /*NSString**/ :nil :(float) (_itemsize+__ref->__mdividersize /*float*/ *2)];};
B4IRDebugUtils.currentLine=14811203;
 //BA.debugLineNum = 14811203;BA.debugLine="If Index < mLastVisibleIndex Or GetRawListItem(mL";
if (_index<__ref->__mlastvisibleindex /*int*/  || [__ref _getrawlistitem /*_clvitem**/ :nil :__ref->__mlastvisibleindex /*int*/ ]->_Offset /*int*/ +[__ref _getrawlistitem /*_clvitem**/ :nil :__ref->__mlastvisibleindex /*int*/ ]->_Size /*int*/ +__ref->__mdividersize /*float*/ <[__ref _getscrollviewvisiblesize /*float*/ :nil]) { 
B4IRDebugUtils.currentLine=14811205;
 //BA.debugLineNum = 14811205;BA.debugLine="UpdateVisibleRange";
[__ref _updatevisiblerange /*NSString**/ :nil];
 };
B4IRDebugUtils.currentLine=14811207;
 //BA.debugLineNum = 14811207;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setitemoffset:(b4i_customlistview*) __ref :(_clvitem*) _item :(float) _offset{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"setitemoffset"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setitemoffset::" :@[[B4I nilToNSNull:_item],@(_offset)]]);}
B4IRDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub SetItemOffset (item As CLVItem, offset";
B4IRDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="item.Offset = offset";
_item->_Offset /*int*/  = (int) (_offset);
B4IRDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="item.Panel.Left = offset";
[_item->_Panel /*B4XViewWrapper**/  setLeft:_offset];
 }else {
B4IRDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="item.Panel.Top = offset";
[_item->_Panel /*B4XViewWrapper**/  setTop:_offset];
 };
B4IRDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jumptoitem:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"jumptoitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jumptoitem:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub JumpToItem(Index As Int)";
B4IRDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="SetScrollViewOffset(Min(GetMaxScrollOffset, FindI";
[__ref _setscrollviewoffset /*NSString**/ :nil :(float) (fmin([__ref _getmaxscrolloffset /*float*/ :nil],[__ref _finditemoffset /*int*/ :nil :_index]))];
B4IRDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setscrollviewoffset:(b4i_customlistview*) __ref :(float) _offset{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"setscrollviewoffset"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setscrollviewoffset:" :@[@(_offset)]]);}
B4IRDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub SetScrollViewOffset(offset As Float)";
B4IRDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="sv.ScrollViewOffsetX = offset";
[__ref->__sv /*B4XViewWrapper**/  setScrollViewOffsetX:(int) (_offset)];
 }else {
B4IRDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="sv.ScrollViewOffsetY = offset";
[__ref->__sv /*B4XViewWrapper**/  setScrollViewOffsetY:(int) (_offset)];
 };
B4IRDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel_click:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"panel_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel_click" :nil]);}
B4IRDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub Panel_Click";
B4IRDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="PanelClickHandler(Sender)";
[__ref _panelclickhandler /*void*/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]];
B4IRDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="End Sub";
return @"";
}
- (void)  _panelclickhandler:(b4i_customlistview*) __ref :(B4XViewWrapper*) _senderpanel{
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"panelclickhandler"])
	 {[B4IDebug delegate:self.bi :@"panelclickhandler:" :@[[B4I nilToNSNull:_senderpanel]]]; return;}
ResumableSub_customlistview_PanelClickHandler* rsub = [[ResumableSub_customlistview_PanelClickHandler alloc] init:self : __ref: _senderpanel];
[rsub resume:self.bi :nil];
}
//-1636491043
- (NSString*)  _panel_longclick:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"panel_longclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel_longclick" :nil]);}
B4IRDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Private Sub Panel_LongClick";
B4IRDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="PanelLongClickHandler(Sender)";
[__ref _panellongclickhandler /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)([self->___c Sender:self.bi])]];
B4IRDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panellongclickhandler:(b4i_customlistview*) __ref :(B4XViewWrapper*) _senderpanel{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"panellongclickhandler"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panellongclickhandler:" :@[[B4I nilToNSNull:_senderpanel]]]);}
B4IRDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Private Sub PanelLongClickHandler(SenderPanel As B";
B4IRDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ItemLong";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_ItemLongClick"] componentsJoinedByString:@""] :(int) (2)]) { 
B4IRDebugUtils.currentLine=15990787;
 //BA.debugLineNum = 15990787;BA.debugLine="If FeedbackGenerator.IsInitialized Then";
if ([__ref->__feedbackgenerator /*B4INativeObject**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="FeedbackGenerator.RunMethod(\"impactOccurred\", N";
[__ref->__feedbackgenerator /*B4INativeObject**/  RunMethod:@"impactOccurred" :(B4IArray*)(nil)];
 };
B4IRDebugUtils.currentLine=15990791;
 //BA.debugLineNum = 15990791;BA.debugLine="CallSub3(CallBack, EventName & \"_ItemLongClick\",";
[self->___c CallSub3:self.bi :__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_ItemLongClick"] componentsJoinedByString:@""] :[_senderpanel Tag] :[__ref _getrawlistitem /*_clvitem**/ :nil :[self.bi ObjectToNumber:[_senderpanel Tag]].intValue]->_Value /*NSObject**/ ];
 };
B4IRDebugUtils.currentLine=15990793;
 //BA.debugLineNum = 15990793;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _refresh:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"refresh"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"refresh" :nil]);}
B4IRDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub Refresh";
B4IRDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="ResetVisibles";
[__ref _resetvisibles /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="UpdateVisibleRange";
[__ref _updatevisiblerange /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _replaceat:(b4i_customlistview*) __ref :(int) _index :(B4XViewWrapper*) _pnl :(int) _itemheight :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"replaceat"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"replaceat::::" :@[@(_index),[B4I nilToNSNull:_pnl],@(_itemheight),[B4I nilToNSNull:_value]]]);}
_clvitem* _removeitem = nil;
B4IRDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Public Sub ReplaceAt(Index As Int, pnl As B4XView,";
B4IRDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim RemoveItem As CLVItem = items.Get(Index)";
_removeitem = (_clvitem*)([__ref->__items /*B4IList**/  Get:_index]);
B4IRDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="items.RemoveAt(Index)";
[__ref->__items /*B4IList**/  RemoveAt:_index];
B4IRDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="RemoveItem.Panel.RemoveViewFromParent";
[_removeitem->_Panel /*B4XViewWrapper**/  RemoveViewFromParent];
B4IRDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="InsertAtImpl(Index, pnl, ItemHeight, Value, Remov";
[__ref _insertatimpl /*NSString**/ :nil :_index :_pnl :_itemheight :_value :_removeitem->_Size /*int*/ ];
B4IRDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resizeitem:(b4i_customlistview*) __ref :(int) _index :(int) _itemheight{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"resizeitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resizeitem::" :@[@(_index),@(_itemheight)]]);}
B4XViewWrapper* _p = nil;
NSObject* _value = nil;
B4XViewWrapper* _parent = nil;
B4IRDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Public Sub ResizeItem(Index As Int, ItemHeight As";
B4IRDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim p As B4XView = GetPanel(Index)";
_p = [B4XViewWrapper new];
_p = [__ref _getpanel /*B4XViewWrapper**/ :nil :_index];
B4IRDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Dim value As Object = GetValue(Index)";
_value = [__ref _getvalue /*NSObject**/ :nil :_index];
B4IRDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Dim parent As B4XView = p.Parent";
_parent = [B4XViewWrapper new];
_parent = [_p Parent];
B4IRDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="p.Color = parent.Color";
[_p setColor:[_parent Color]];
B4IRDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="p.RemoveViewFromParent";
[_p RemoveViewFromParent];
B4IRDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="ReplaceAt(Index, p, ItemHeight, value)";
[__ref _replaceat /*NSString**/ :nil :_index :_p :_itemheight :_value];
B4IRDebugUtils.currentLine=15335431;
 //BA.debugLineNum = 15335431;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _scrollhandler:(b4i_customlistview*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"scrollhandler"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"scrollhandler" :nil]);}
int _position = 0;
B4IRDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub ScrollHandler";
B4IRDebugUtils.currentLine=16187393;
 //BA.debugLineNum = 16187393;BA.debugLine="If items.Size = 0 Then Return";
if ([__ref->__items /*B4IList**/  Size]==0) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim position As Int = GetScrollViewOffset";
_position = (int) ([__ref _getscrollviewoffset /*float*/ :nil]);
B4IRDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="If position + GetScrollViewVisibleSize >= GetScro";
if (_position+[__ref _getscrollviewvisiblesize /*float*/ :nil]>=[__ref _getscrollviewcontentsize /*float*/ :nil]-((int) (5)) && [[self->___c DateTime] Now]>__ref->__lastreachendevent /*long long*/ +100) { 
B4IRDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="If xui.SubExists(CallBack, EventName & \"_ReachEn";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_ReachEnd"] componentsJoinedByString:@""] :(int) (0)]) { 
B4IRDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="LastReachEndEvent = DateTime.Now";
__ref->__lastreachendevent /*long long*/  = [[self->___c DateTime] Now];
B4IRDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="CallSubDelayed(CallBack, EventName & \"_ReachEnd";
[self->___c CallSubDelayed:self.bi :__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_ReachEnd"] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="LastReachEndEvent = DateTime.Now + 1000 * DateT";
__ref->__lastreachendevent /*long long*/  = (long long) ([[self->___c DateTime] Now]+1000*[[self->___c DateTime] TicksPerDay]);
 };
 };
B4IRDebugUtils.currentLine=16187403;
 //BA.debugLineNum = 16187403;BA.debugLine="UpdateVisibleRange";
[__ref _updatevisiblerange /*NSString**/ :nil];
B4IRDebugUtils.currentLine=16187404;
 //BA.debugLineNum = 16187404;BA.debugLine="If FireScrollChanged Then";
if (__ref->__firescrollchanged /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="CallSub2(CallBack, EventName & \"_ScrollChanged\",";
[self->___c CallSub2:self.bi :__ref->__callback /*NSObject**/  :[@[__ref->__eventname /*NSString**/ ,@"_ScrollChanged"] componentsJoinedByString:@""] :(NSObject*)(@(_position))];
 };
B4IRDebugUtils.currentLine=16187407;
 //BA.debugLineNum = 16187407;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _scrolltoitem:(b4i_customlistview*) __ref :(int) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"scrolltoitem"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"scrolltoitem:" :@[@(_index)]]);}
float _offset = 0.0f;
B4IScrollView* _nsv = nil;
B4IRDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Public Sub ScrollToItem(Index As Int)";
B4IRDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim offset As Float = Min(GetMaxScrollOffset, Fin";
_offset = (float) (fmin([__ref _getmaxscrolloffset /*float*/ :nil],[__ref _finditemoffset /*int*/ :nil :_index]));
B4IRDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="Dim nsv As ScrollView = sv";
_nsv = [B4IScrollView new];
_nsv.object = (UIScrollView*)((__ref->__sv /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="If horizontal Then";
if (__ref->__horizontal /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="nsv.ScrollTo(offset, 0, True)";
[_nsv ScrollTo:(int) (_offset) :(int) (0) :true];
 }else {
B4IRDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="nsv.ScrollTo(0, offset, True)";
[_nsv ScrollTo:(int) (0) :(int) (_offset) :true];
 };
B4IRDebugUtils.currentLine=15663125;
 //BA.debugLineNum = 15663125;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _sv_scrollchanged:(b4i_customlistview*) __ref :(int) _offsetx :(int) _offsety{
__ref = self;
B4IRDebugUtils.currentModule=@"customlistview";
if ([B4IDebug shouldDelegate: @"sv_scrollchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"sv_scrollchanged::" :@[@(_offsetx),@(_offsety)]]);}
B4IRDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub sv_ScrollChanged (OffsetX As Int, OffsetY As I";
B4IRDebugUtils.currentLine=16580609;
 //BA.debugLineNum = 16580609;BA.debugLine="ScrollHandler";
[__ref _scrollhandler /*NSString**/ :nil];
B4IRDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="End Sub";
return @"";
}
@end