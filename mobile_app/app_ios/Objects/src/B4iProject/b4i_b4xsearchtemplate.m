
#import "b4i_b4xsearchtemplate.h"
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
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"

@interface ResumableSub_b4xsearchtemplate_Show :B4IResumableSub 
- (instancetype) init: (b4i_b4xsearchtemplate*) parent1 :(b4i_b4xsearchtemplate*) __ref1 :(b4i_b4xdialog*) _dialog1;
@end
@implementation ResumableSub_b4xsearchtemplate_Show {
b4i_b4xsearchtemplate* parent;
b4i_b4xsearchtemplate* __ref;
b4i_b4xdialog* _dialog;
}
- (instancetype) init: (b4i_b4xsearchtemplate*) parent1 :(b4i_b4xsearchtemplate*) __ref1 :(b4i_b4xdialog*) _dialog1 {
self->__ref = __ref1;
self->_dialog = _dialog1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xsearchtemplate* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = -1;
B4IRDebugUtils.currentLine=20643841;
 //BA.debugLineNum = 20643841;BA.debugLine="xDialog = Dialog";
__ref->__xdialog /*b4i_b4xdialog**/  = _dialog;
B4IRDebugUtils.currentLine=20643842;
 //BA.debugLineNum = 20643842;BA.debugLine="xDialog.PutAtTop = xui.IsB4A Or xui.IsB4i";
__ref->__xdialog /*b4i_b4xdialog**/ ->__putattop /*BOOL*/  = [__ref->__xui /*B4IXUI**/  IsB4A] || [__ref->__xui /*B4IXUI**/  IsB4i];
B4IRDebugUtils.currentLine=20643843;
 //BA.debugLineNum = 20643843;BA.debugLine="CustomListView1.AsView.Color = xui.Color_Transpar";
[[__ref->__customlistview1 /*b4i_customlistview**/  _asview] setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=20643844;
 //BA.debugLineNum = 20643844;BA.debugLine="CustomListView1.sv.Color = xui.Color_Transparent";
[__ref->__customlistview1 /*b4i_customlistview**/ ->__sv setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=20643845;
 //BA.debugLineNum = 20643845;BA.debugLine="mBase.Color = xui.Color_Transparent";
[__ref->__mbase /*B4XViewWrapper**/  setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
B4IRDebugUtils.currentLine=20643846;
 //BA.debugLineNum = 20643846;BA.debugLine="Sleep(20)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xsearchtemplate" :@"show"] :(int) (20)];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=20643847;
 //BA.debugLineNum = 20643847;BA.debugLine="Update(\"\", True)";
[__ref _update /*NSString**/ :nil :@"" :true];
B4IRDebugUtils.currentLine=20643848;
 //BA.debugLineNum = 20643848;BA.debugLine="CustomListView1.JumpToItem(0)";
[__ref->__customlistview1 /*b4i_customlistview**/  _jumptoitem:(int) (0)];
B4IRDebugUtils.currentLine=20643849;
 //BA.debugLineNum = 20643849;BA.debugLine="SearchField.Text = \"\"";
[__ref->__searchfield /*b4i_b4xfloattextfield**/  _settext: /*NSString**/ nil :@""];
B4IRDebugUtils.currentLine=20643850;
 //BA.debugLineNum = 20643850;BA.debugLine="SearchField.TextField.RequestFocus";
[[__ref->__searchfield /*b4i_b4xfloattextfield**/  _gettextfield /*B4XViewWrapper**/ :nil] RequestFocus];
B4IRDebugUtils.currentLine=20643854;
 //BA.debugLineNum = 20643854;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xsearchtemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xsearchtemplate) instance released.");
}

- (B4XViewWrapper*)  _getpanel:(b4i_b4xsearchtemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=20578304;
 //BA.debugLineNum = 20578304;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=20578305;
 //BA.debugLineNum = 20578305;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=20578306;
 //BA.debugLineNum = 20578306;BA.debugLine="End Sub";
return nil;
}
- (void)  _show:(b4i_b4xsearchtemplate*) __ref :(b4i_b4xdialog*) _dialog{
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {[B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]; return;}
ResumableSub_b4xsearchtemplate_Show* rsub = [[ResumableSub_b4xsearchtemplate_Show alloc] init:self : __ref: _dialog];
[rsub resume:self.bi :nil];
}
//-994558248
- (NSString*)  _dialogclosed:(b4i_b4xsearchtemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=21168128;
 //BA.debugLineNum = 21168128;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
B4IRDebugUtils.currentLine=21168130;
 //BA.debugLineNum = 21168130;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _additemstolist:(b4i_b4xsearchtemplate*) __ref :(B4IList*) _li :(NSString*) _full{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"additemstolist"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"additemstolist::" :@[[B4I nilToNSNull:_li],[B4I nilToNSNull:_full]]]);}
int _i = 0;
NSString* _item = @"";
int _x = 0;
int _pnlcolor = 0;
B4ICSBuilder* _cs = nil;
B4XViewWrapper* _p = nil;
B4ILabelWrapper* _lbl = nil;
B4IRDebugUtils.currentLine=20971520;
 //BA.debugLineNum = 20971520;BA.debugLine="Private Sub AddItemsToList(li As List, full As Str";
B4IRDebugUtils.currentLine=20971521;
 //BA.debugLineNum = 20971521;BA.debugLine="If li.IsInitialized = False Then Return";
if ([_li IsInitialized]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=20971526;
 //BA.debugLineNum = 20971526;BA.debugLine="For i = 0 To li.Size - 1";
{
const int step2 = 1;
const int limit2 = (int) ([_li Size]-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
B4IRDebugUtils.currentLine=20971527;
 //BA.debugLineNum = 20971527;BA.debugLine="If CustomListView1.Size >= MaxNumberOfItemsToSho";
if ([__ref->__customlistview1 /*b4i_customlistview**/  _getsize]>=__ref->__maxnumberofitemstoshow /*int*/ ) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=20971528;
 //BA.debugLineNum = 20971528;BA.debugLine="Dim item As String = li.Get(i)";
_item = [self.bi ObjectToString:[_li Get:_i]];
B4IRDebugUtils.currentLine=20971529;
 //BA.debugLineNum = 20971529;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = [[_item ToLowerCase] IndexOf:_full];
B4IRDebugUtils.currentLine=20971530;
 //BA.debugLineNum = 20971530;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
B4IRDebugUtils.currentLine=20971531;
 //BA.debugLineNum = 20971531;BA.debugLine="Continue";
if (true) continue;
 };
B4IRDebugUtils.currentLine=20971533;
 //BA.debugLineNum = 20971533;BA.debugLine="Dim pnlColor As Int";
_pnlcolor = 0;
B4IRDebugUtils.currentLine=20971534;
 //BA.debugLineNum = 20971534;BA.debugLine="If CustomListView1.Size = 0 And full.Length > 0";
if ([__ref->__customlistview1 /*b4i_customlistview**/  _getsize]==0 && [_full Length]>0) { 
_pnlcolor = __ref->__itemhightlightcolor /*int*/ ;}
else {
_pnlcolor = __ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor;};
B4IRDebugUtils.currentLine=20971536;
 //BA.debugLineNum = 20971536;BA.debugLine="Dim cs As CSBuilder";
_cs = [B4ICSBuilder new];
B4IRDebugUtils.currentLine=20971537;
 //BA.debugLineNum = 20971537;BA.debugLine="cs.Initialize.Append(item.SubString2(0, x)).Colo";
[[[[[_cs Initialize] Append:[_item SubString2:(int) (0) :_x]] Color:__ref->__texthighlightcolor /*int*/ ] Append:[_item SubString2:_x :(int) (_x+[_full Length])]] Pop];
B4IRDebugUtils.currentLine=20971538;
 //BA.debugLineNum = 20971538;BA.debugLine="cs.Append(item.SubString(x + full.Length))";
[_cs Append:[_item SubString:(int) (_x+[_full Length])]];
B4IRDebugUtils.currentLine=20971539;
 //BA.debugLineNum = 20971539;BA.debugLine="If ItemsCache.Size > 0 Then";
if ([__ref->__itemscache /*B4IList**/  Size]>0) { 
B4IRDebugUtils.currentLine=20971540;
 //BA.debugLineNum = 20971540;BA.debugLine="Dim p As B4XView = ItemsCache.Get(ItemsCache.Si";
_p = [B4XViewWrapper new];
_p.object = (NSObject*)([__ref->__itemscache /*B4IList**/  Get:(int) ([__ref->__itemscache /*B4IList**/  Size]-1)]);
B4IRDebugUtils.currentLine=20971541;
 //BA.debugLineNum = 20971541;BA.debugLine="ItemsCache.RemoveAt(ItemsCache.Size - 1)";
[__ref->__itemscache /*B4IList**/  RemoveAt:(int) ([__ref->__itemscache /*B4IList**/  Size]-1)];
B4IRDebugUtils.currentLine=20971545;
 //BA.debugLineNum = 20971545;BA.debugLine="Dim lbl As Label = p.GetView(0)";
_lbl = [B4ILabelWrapper new];
_lbl.object = (UILabel*)(([_p GetView:(int) (0)]).object);
B4IRDebugUtils.currentLine=20971546;
 //BA.debugLineNum = 20971546;BA.debugLine="lbl.AttributedText = cs";
[_lbl setAttributedText:(B4IAttributedString*) [B4IObjectWrapper createWrapper:[B4IAttributedString new] object:(NSAttributedString*)((_cs).object)]];
B4IRDebugUtils.currentLine=20971548;
 //BA.debugLineNum = 20971548;BA.debugLine="p.Color = pnlColor";
[_p setColor:_pnlcolor];
B4IRDebugUtils.currentLine=20971549;
 //BA.debugLineNum = 20971549;BA.debugLine="CustomListView1.Add(p, item)";
[__ref->__customlistview1 /*b4i_customlistview**/  _add:_p :(NSObject*)(_item)];
 }else {
B4IRDebugUtils.currentLine=20971551;
 //BA.debugLineNum = 20971551;BA.debugLine="CustomListView1.AddTextItem(cs, item)";
[__ref->__customlistview1 /*b4i_customlistview**/  _addtextitem:(NSObject*)((_cs).object) :(NSObject*)(_item)];
 };
 }
};
B4IRDebugUtils.currentLine=20971572;
 //BA.debugLineNum = 20971572;BA.debugLine="For i = 0 To li.Size - 1";
{
const int step25 = 1;
const int limit25 = (int) ([_li Size]-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
B4IRDebugUtils.currentLine=20971573;
 //BA.debugLineNum = 20971573;BA.debugLine="Dim item As String = li.Get(i)";
_item = [self.bi ObjectToString:[_li Get:_i]];
B4IRDebugUtils.currentLine=20971574;
 //BA.debugLineNum = 20971574;BA.debugLine="Dim x As Int = item.ToLowerCase.IndexOf(full)";
_x = [[_item ToLowerCase] IndexOf:_full];
B4IRDebugUtils.currentLine=20971575;
 //BA.debugLineNum = 20971575;BA.debugLine="If x = -1 Then";
if (_x==-1) { 
B4IRDebugUtils.currentLine=20971576;
 //BA.debugLineNum = 20971576;BA.debugLine="Continue";
if (true) continue;
 };
 }
};
B4IRDebugUtils.currentLine=20971579;
 //BA.debugLineNum = 20971579;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xsearchtemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
B4IRDebugUtils.currentLine=20381696;
 //BA.debugLineNum = 20381696;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=20381697;
 //BA.debugLineNum = 20381697;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=20381698;
 //BA.debugLineNum = 20381698;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=20381699;
 //BA.debugLineNum = 20381699;BA.debugLine="Public CustomListView1 As CustomListView";
self->__customlistview1 = [b4i_customlistview new];
B4IRDebugUtils.currentLine=20381700;
 //BA.debugLineNum = 20381700;BA.debugLine="Private xDialog As B4XDialog";
self->__xdialog = [b4i_b4xdialog new];
B4IRDebugUtils.currentLine=20381701;
 //BA.debugLineNum = 20381701;BA.debugLine="Public SearchField As B4XFloatTextField";
self->__searchfield = [b4i_b4xfloattextfield new];
B4IRDebugUtils.currentLine=20381702;
 //BA.debugLineNum = 20381702;BA.debugLine="Private prefixList As Map";
self->__prefixlist = [B4IMap new];
B4IRDebugUtils.currentLine=20381703;
 //BA.debugLineNum = 20381703;BA.debugLine="Private substringList As Map";
self->__substringlist = [B4IMap new];
B4IRDebugUtils.currentLine=20381704;
 //BA.debugLineNum = 20381704;BA.debugLine="Public TextHighlightColor As Int = 0xFFFD5C5C";
self->__texthighlightcolor = (int) (0xfffd5c5c);
B4IRDebugUtils.currentLine=20381705;
 //BA.debugLineNum = 20381705;BA.debugLine="Public ItemHightlightColor As Int = 0x7E008EFF";
self->__itemhightlightcolor = (int) (0x7e008eff);
B4IRDebugUtils.currentLine=20381706;
 //BA.debugLineNum = 20381706;BA.debugLine="Private MAX_LIMIT = 4 As Int";
self->__max_limit = (int) (4);
B4IRDebugUtils.currentLine=20381707;
 //BA.debugLineNum = 20381707;BA.debugLine="Public MaxNumberOfItemsToShow As Int = 100";
self->__maxnumberofitemstoshow = (int) (100);
B4IRDebugUtils.currentLine=20381708;
 //BA.debugLineNum = 20381708;BA.debugLine="Private ItemsCache As List";
self->__itemscache = [B4IList new];
B4IRDebugUtils.currentLine=20381709;
 //BA.debugLineNum = 20381709;BA.debugLine="Private AllItems As List";
self->__allitems = [B4IList new];
B4IRDebugUtils.currentLine=20381710;
 //BA.debugLineNum = 20381710;BA.debugLine="Public SelectedItem As String";
self->__selecteditem = @"";
B4IRDebugUtils.currentLine=20381711;
 //BA.debugLineNum = 20381711;BA.debugLine="Private LastTerm As String";
self->__lastterm = @"";
B4IRDebugUtils.currentLine=20381715;
 //BA.debugLineNum = 20381715;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _customlistview1_itemclick:(b4i_b4xsearchtemplate*) __ref :(int) _index :(NSObject*) _value{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"customlistview1_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"customlistview1_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=20905984;
 //BA.debugLineNum = 20905984;BA.debugLine="Private Sub CustomListView1_ItemClick (Index As In";
B4IRDebugUtils.currentLine=20905985;
 //BA.debugLineNum = 20905985;BA.debugLine="If Value = \"\" Then Return";
if ([_value isEqual:(NSObject*)(@"")]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=20905986;
 //BA.debugLineNum = 20905986;BA.debugLine="SelectedItem = Value";
__ref->__selecteditem /*NSString**/  = [self.bi ObjectToString:_value];
B4IRDebugUtils.currentLine=20905987;
 //BA.debugLineNum = 20905987;BA.debugLine="xDialog.Close(xui.DialogResponse_Positive)";
[__ref->__xdialog /*b4i_b4xdialog**/  _close /*BOOL*/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Positive]];
B4IRDebugUtils.currentLine=20905988;
 //BA.debugLineNum = 20905988;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xsearchtemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
int _height = 0;
B4IRDebugUtils.currentLine=20447232;
 //BA.debugLineNum = 20447232;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=20447233;
 //BA.debugLineNum = 20447233;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"mBase"];
B4IRDebugUtils.currentLine=20447235;
 //BA.debugLineNum = 20447235;BA.debugLine="Dim height As Int";
_height = 0;
B4IRDebugUtils.currentLine=20447236;
 //BA.debugLineNum = 20447236;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then height = 220dip El";
if ([__ref->__xui /*B4IXUI**/  IsB4A] || [__ref->__xui /*B4IXUI**/  IsB4i]) { 
_height = ((int) (220));}
else {
_height = ((int) (300));};
B4IRDebugUtils.currentLine=20447237;
 //BA.debugLineNum = 20447237;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, height)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (_height)];
B4IRDebugUtils.currentLine=20447238;
 //BA.debugLineNum = 20447238;BA.debugLine="mBase.LoadLayout(\"SearchTemplate\")";
[__ref->__mbase /*B4XViewWrapper**/  LoadLayout:@"SearchTemplate" :self.bi];
B4IRDebugUtils.currentLine=20447239;
 //BA.debugLineNum = 20447239;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=20447240;
 //BA.debugLineNum = 20447240;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
[__ref->__customlistview1 /*b4i_customlistview**/ ->__sv SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=20447241;
 //BA.debugLineNum = 20447241;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor = (int) (0xff555555);
B4IRDebugUtils.currentLine=20447242;
 //BA.debugLineNum = 20447242;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextcolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=20447252;
 //BA.debugLineNum = 20447252;BA.debugLine="ItemsCache.Initialize";
[__ref->__itemscache /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=20447253;
 //BA.debugLineNum = 20447253;BA.debugLine="prefixList.Initialize";
[__ref->__prefixlist /*B4IMap**/  Initialize];
B4IRDebugUtils.currentLine=20447254;
 //BA.debugLineNum = 20447254;BA.debugLine="substringList.Initialize";
[__ref->__substringlist /*B4IMap**/  Initialize];
B4IRDebugUtils.currentLine=20447260;
 //BA.debugLineNum = 20447260;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resize:(b4i_b4xsearchtemplate*) __ref :(int) _width :(int) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=20512768;
 //BA.debugLineNum = 20512768;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
B4IRDebugUtils.currentLine=20512769;
 //BA.debugLineNum = 20512769;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=20512770;
 //BA.debugLineNum = 20512770;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
[__ref->__customlistview1 /*b4i_customlistview**/  _base_resize:_width :_height];
B4IRDebugUtils.currentLine=20512771;
 //BA.debugLineNum = 20512771;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _searchfield_enterpressed:(b4i_b4xsearchtemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"searchfield_enterpressed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"searchfield_enterpressed" :nil]);}
B4IRDebugUtils.currentLine=20840448;
 //BA.debugLineNum = 20840448;BA.debugLine="Private Sub SearchField_EnterPressed";
B4IRDebugUtils.currentLine=20840449;
 //BA.debugLineNum = 20840449;BA.debugLine="If CustomListView1.Size > 0 And LastTerm.Length >";
if ([__ref->__customlistview1 /*b4i_customlistview**/  _getsize]>0 && [__ref->__lastterm /*NSString**/  Length]>0) { 
B4IRDebugUtils.currentLine=20840450;
 //BA.debugLineNum = 20840450;BA.debugLine="CustomListView1_ItemClick(0, CustomListView1.Get";
[__ref _customlistview1_itemclick /*NSString**/ :nil :(int) (0) :[__ref->__customlistview1 /*b4i_customlistview**/  _getvalue:(int) (0)]];
 };
B4IRDebugUtils.currentLine=20840452;
 //BA.debugLineNum = 20840452;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _searchfield_textchanged:(b4i_b4xsearchtemplate*) __ref :(NSString*) _old :(NSString*) _new{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"searchfield_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"searchfield_textchanged::" :@[[B4I nilToNSNull:_old],[B4I nilToNSNull:_new]]]);}
B4IRDebugUtils.currentLine=20709376;
 //BA.debugLineNum = 20709376;BA.debugLine="Private Sub SearchField_TextChanged (Old As String";
B4IRDebugUtils.currentLine=20709377;
 //BA.debugLineNum = 20709377;BA.debugLine="Update(New, False)";
[__ref _update /*NSString**/ :nil :_new :false];
B4IRDebugUtils.currentLine=20709378;
 //BA.debugLineNum = 20709378;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _update:(b4i_b4xsearchtemplate*) __ref :(NSString*) _term :(BOOL) _force{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"update"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"update::" :@[[B4I nilToNSNull:_term],@(_force)]]);}
int _i = 0;
B4XViewWrapper* _p = nil;
NSString* _str1 = @"";
NSString* _str2 = @"";
B4IRDebugUtils.currentLine=20774912;
 //BA.debugLineNum = 20774912;BA.debugLine="Private Sub Update(Term As String, Force As Boolea";
B4IRDebugUtils.currentLine=20774913;
 //BA.debugLineNum = 20774913;BA.debugLine="If Term = LastTerm And Force = False Then Return";
if ([_term isEqual:__ref->__lastterm /*NSString**/ ] && _force==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=20774914;
 //BA.debugLineNum = 20774914;BA.debugLine="LastTerm = Term";
__ref->__lastterm /*NSString**/  = _term;
B4IRDebugUtils.currentLine=20774915;
 //BA.debugLineNum = 20774915;BA.debugLine="If xui.IsB4J = False Then";
if ([__ref->__xui /*B4IXUI**/  IsB4J]==false) { 
B4IRDebugUtils.currentLine=20774916;
 //BA.debugLineNum = 20774916;BA.debugLine="For i = 0 To CustomListView1.Size - 1";
{
const int step4 = 1;
const int limit4 = (int) ([__ref->__customlistview1 /*b4i_customlistview**/  _getsize]-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=20774917;
 //BA.debugLineNum = 20774917;BA.debugLine="Dim p As B4XView = CustomListView1.GetPanel(i)";
_p = [B4XViewWrapper new];
_p = [__ref->__customlistview1 /*b4i_customlistview**/  _getpanel:_i];
B4IRDebugUtils.currentLine=20774918;
 //BA.debugLineNum = 20774918;BA.debugLine="p.RemoveViewFromParent";
[_p RemoveViewFromParent];
B4IRDebugUtils.currentLine=20774919;
 //BA.debugLineNum = 20774919;BA.debugLine="ItemsCache.Add(p)";
[__ref->__itemscache /*B4IList**/  Add:(NSObject*)((_p).object)];
 }
};
 };
B4IRDebugUtils.currentLine=20774922;
 //BA.debugLineNum = 20774922;BA.debugLine="CustomListView1.Clear";
[__ref->__customlistview1 /*b4i_customlistview**/  _clear];
B4IRDebugUtils.currentLine=20774924;
 //BA.debugLineNum = 20774924;BA.debugLine="Dim str1, str2 As String";
_str1 = @"";
_str2 = @"";
B4IRDebugUtils.currentLine=20774925;
 //BA.debugLineNum = 20774925;BA.debugLine="str1 = Term.ToLowerCase";
_str1 = [_term ToLowerCase];
B4IRDebugUtils.currentLine=20774926;
 //BA.debugLineNum = 20774926;BA.debugLine="If Term = \"\" Then";
if ([_term isEqual:@""]) { 
B4IRDebugUtils.currentLine=20774927;
 //BA.debugLineNum = 20774927;BA.debugLine="AddItemsToList(AllItems, str1)";
[__ref _additemstolist /*NSString**/ :nil :__ref->__allitems /*B4IList**/  :_str1];
 }else {
B4IRDebugUtils.currentLine=20774929;
 //BA.debugLineNum = 20774929;BA.debugLine="If str1.Length > MAX_LIMIT Then";
if ([_str1 Length]>__ref->__max_limit /*int*/ ) { 
B4IRDebugUtils.currentLine=20774930;
 //BA.debugLineNum = 20774930;BA.debugLine="str2 = str1.SubString2(0, MAX_LIMIT)";
_str2 = [_str1 SubString2:(int) (0) :__ref->__max_limit /*int*/ ];
 }else {
B4IRDebugUtils.currentLine=20774932;
 //BA.debugLineNum = 20774932;BA.debugLine="str2 = str1";
_str2 = _str1;
 };
B4IRDebugUtils.currentLine=20774934;
 //BA.debugLineNum = 20774934;BA.debugLine="AddItemsToList(prefixList.Get(str2), str1)";
[__ref _additemstolist /*NSString**/ :nil :(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)([__ref->__prefixlist /*B4IMap**/  Get:(NSObject*)(_str2)])] :_str1];
B4IRDebugUtils.currentLine=20774935;
 //BA.debugLineNum = 20774935;BA.debugLine="AddItemsToList(substringList.Get(str2), str1)";
[__ref _additemstolist /*NSString**/ :nil :(B4IList*) [B4IObjectWrapper createWrapper:[B4IList new] object:(NSArray*)([__ref->__substringlist /*B4IMap**/  Get:(NSObject*)(_str2)])] :_str1];
 };
B4IRDebugUtils.currentLine=20774937;
 //BA.debugLineNum = 20774937;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setindex:(b4i_b4xsearchtemplate*) __ref :(NSObject*) _index{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"setindex"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setindex:" :@[[B4I nilToNSNull:_index]]]);}
B4IArray* _obj = nil;
B4IRDebugUtils.currentLine=21102592;
 //BA.debugLineNum = 21102592;BA.debugLine="Public Sub SetIndex(Index As Object)";
B4IRDebugUtils.currentLine=21102593;
 //BA.debugLineNum = 21102593;BA.debugLine="Dim obj() As Object";
_obj = [[B4IArray alloc]initObjects:@[@((int) (0))] :nil :@"NSObject"];
B4IRDebugUtils.currentLine=21102594;
 //BA.debugLineNum = 21102594;BA.debugLine="obj = Index";
_obj = (B4IArray*)(_index);
B4IRDebugUtils.currentLine=21102595;
 //BA.debugLineNum = 21102595;BA.debugLine="prefixList = obj(0)";
__ref->__prefixlist /*B4IMap**/  = (B4IMap*)(((NSObject*)[_obj getObjectFast:(int) (0)]));
B4IRDebugUtils.currentLine=21102596;
 //BA.debugLineNum = 21102596;BA.debugLine="substringList = obj(1)";
__ref->__substringlist /*B4IMap**/  = (B4IMap*)(((NSObject*)[_obj getObjectFast:(int) (1)]));
B4IRDebugUtils.currentLine=21102597;
 //BA.debugLineNum = 21102597;BA.debugLine="AllItems = obj(2)";
__ref->__allitems /*B4IList**/ .object = (NSArray*)(((NSObject*)[_obj getObjectFast:(int) (2)]));
B4IRDebugUtils.currentLine=21102598;
 //BA.debugLineNum = 21102598;BA.debugLine="End Sub";
return @"";
}
- (NSObject*)  _setitems:(b4i_b4xsearchtemplate*) __ref :(B4IList*) _items{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xsearchtemplate";
if ([B4IDebug shouldDelegate: @"setitems"])
	 {return ((NSObject*) [B4IDebug delegate:self.bi :@"setitems:" :@[[B4I nilToNSNull:_items]]]);}
long long _starttime = 0L;
B4IMap* _noduplicates = nil;
B4IMap* _m = nil;
B4IList* _li = nil;
int _i = 0;
NSString* _item = @"";
int _start = 0;
int _count = 0;
NSString* _str = @"";
B4IRDebugUtils.currentLine=21037056;
 //BA.debugLineNum = 21037056;BA.debugLine="Public Sub SetItems(Items As List) As Object";
B4IRDebugUtils.currentLine=21037057;
 //BA.debugLineNum = 21037057;BA.debugLine="Dim startTime As Long";
_starttime = 0L;
B4IRDebugUtils.currentLine=21037058;
 //BA.debugLineNum = 21037058;BA.debugLine="startTime = DateTime.Now";
_starttime = [[self->___c DateTime] Now];
B4IRDebugUtils.currentLine=21037059;
 //BA.debugLineNum = 21037059;BA.debugLine="Dim noDuplicates As Map";
_noduplicates = [B4IMap new];
B4IRDebugUtils.currentLine=21037060;
 //BA.debugLineNum = 21037060;BA.debugLine="noDuplicates.Initialize";
[_noduplicates Initialize];
B4IRDebugUtils.currentLine=21037061;
 //BA.debugLineNum = 21037061;BA.debugLine="prefixList.Clear";
[__ref->__prefixlist /*B4IMap**/  Clear];
B4IRDebugUtils.currentLine=21037062;
 //BA.debugLineNum = 21037062;BA.debugLine="substringList.Clear";
[__ref->__substringlist /*B4IMap**/  Clear];
B4IRDebugUtils.currentLine=21037063;
 //BA.debugLineNum = 21037063;BA.debugLine="Dim m As Map";
_m = [B4IMap new];
B4IRDebugUtils.currentLine=21037064;
 //BA.debugLineNum = 21037064;BA.debugLine="Dim li As List";
_li = [B4IList new];
B4IRDebugUtils.currentLine=21037065;
 //BA.debugLineNum = 21037065;BA.debugLine="For i = 0 To Items.Size - 1";
{
const int step9 = 1;
const int limit9 = (int) ([_items Size]-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
B4IRDebugUtils.currentLine=21037066;
 //BA.debugLineNum = 21037066;BA.debugLine="Dim item As String";
_item = @"";
B4IRDebugUtils.currentLine=21037067;
 //BA.debugLineNum = 21037067;BA.debugLine="item = Items.Get(i)";
_item = [self.bi ObjectToString:[_items Get:_i]];
B4IRDebugUtils.currentLine=21037068;
 //BA.debugLineNum = 21037068;BA.debugLine="item = item.ToLowerCase";
_item = [_item ToLowerCase];
B4IRDebugUtils.currentLine=21037069;
 //BA.debugLineNum = 21037069;BA.debugLine="noDuplicates.Clear";
[_noduplicates Clear];
B4IRDebugUtils.currentLine=21037070;
 //BA.debugLineNum = 21037070;BA.debugLine="For start = 0 To item.Length";
{
const int step14 = 1;
const int limit14 = [_item Length];
_start = (int) (0) ;
for (;_start <= limit14 ;_start = _start + step14 ) {
B4IRDebugUtils.currentLine=21037071;
 //BA.debugLineNum = 21037071;BA.debugLine="Dim count As Int = 1";
_count = (int) (1);
B4IRDebugUtils.currentLine=21037072;
 //BA.debugLineNum = 21037072;BA.debugLine="Do While count <= MAX_LIMIT And start + count <";
while (_count<=__ref->__max_limit /*int*/  && _start+_count<=[_item Length]) {
B4IRDebugUtils.currentLine=21037073;
 //BA.debugLineNum = 21037073;BA.debugLine="Dim str As String";
_str = @"";
B4IRDebugUtils.currentLine=21037074;
 //BA.debugLineNum = 21037074;BA.debugLine="str = item.SubString2(start, start + count)";
_str = [_item SubString2:_start :(int) (_start+_count)];
B4IRDebugUtils.currentLine=21037075;
 //BA.debugLineNum = 21037075;BA.debugLine="If noDuplicates.ContainsKey(str) = False Then";
if ([_noduplicates ContainsKey:(NSObject*)(_str)]==false) { 
B4IRDebugUtils.currentLine=21037076;
 //BA.debugLineNum = 21037076;BA.debugLine="noDuplicates.Put(str, \"\")";
[_noduplicates Put:(NSObject*)(_str) :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=21037077;
 //BA.debugLineNum = 21037077;BA.debugLine="If start = 0 Then m = prefixList Else m = sub";
if (_start==0) { 
_m = __ref->__prefixlist /*B4IMap**/ ;}
else {
_m = __ref->__substringlist /*B4IMap**/ ;};
B4IRDebugUtils.currentLine=21037078;
 //BA.debugLineNum = 21037078;BA.debugLine="li = m.Get(str)";
_li.object = (NSArray*)([_m Get:(NSObject*)(_str)]);
B4IRDebugUtils.currentLine=21037079;
 //BA.debugLineNum = 21037079;BA.debugLine="If li.IsInitialized = False Then";
if ([_li IsInitialized]==false) { 
B4IRDebugUtils.currentLine=21037080;
 //BA.debugLineNum = 21037080;BA.debugLine="li.Initialize";
[_li Initialize];
B4IRDebugUtils.currentLine=21037081;
 //BA.debugLineNum = 21037081;BA.debugLine="m.Put(str, li)";
[_m Put:(NSObject*)(_str) :(NSObject*)((_li).object)];
 };
B4IRDebugUtils.currentLine=21037083;
 //BA.debugLineNum = 21037083;BA.debugLine="li.Add(Items.Get(i)) 'Preserve the original c";
[_li Add:[_items Get:_i]];
 };
B4IRDebugUtils.currentLine=21037085;
 //BA.debugLineNum = 21037085;BA.debugLine="count = count + 1";
_count = (int) (_count+1);
 }
;
 }
};
 }
};
B4IRDebugUtils.currentLine=21037089;
 //BA.debugLineNum = 21037089;BA.debugLine="Log(\"Index time: \" & (DateTime.Now - startTime) &";
[self->___c LogImpl:@"921037089" :[@[@"Index time: ",[self.bi NumberToString:@(([[self->___c DateTime] Now]-_starttime))],@" ms (",[self.bi NumberToString:@([_items Size])],@" Items)"] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=21037090;
 //BA.debugLineNum = 21037090;BA.debugLine="AllItems = Items";
__ref->__allitems /*B4IList**/  = _items;
B4IRDebugUtils.currentLine=21037091;
 //BA.debugLineNum = 21037091;BA.debugLine="Return Array(prefixList, substringList, AllItems)";
if (true) return (NSObject*)([[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(__ref->__prefixlist /*B4IMap**/ )],[B4I nilToNSNull:(NSObject*)(__ref->__substringlist /*B4IMap**/ )],[B4I nilToNSNull:(NSObject*)((__ref->__allitems /*B4IList**/ ).object)]]]);
B4IRDebugUtils.currentLine=21037092;
 //BA.debugLineNum = 21037092;BA.debugLine="End Sub";
return nil;
}
@end