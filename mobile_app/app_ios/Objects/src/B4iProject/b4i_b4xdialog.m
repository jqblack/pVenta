
#import "b4i_b4xdialog.h"
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

@interface ResumableSub_b4xdialog_Show :B4IResumableSub 
- (instancetype) init: (b4i_b4xdialog*) parent1 :(b4i_b4xdialog*) __ref1 :(NSObject*) _text1 :(NSObject*) _yes1 :(NSObject*) _no1 :(NSObject*) _cancel1;
@end
@implementation ResumableSub_b4xdialog_Show {
b4i_b4xdialog* parent;
b4i_b4xdialog* __ref;
NSObject* _text;
NSObject* _yes;
NSObject* _no;
NSObject* _cancel;
B4XViewWrapper* _p;
B4ILabelWrapper* _lbl;
B4XViewWrapper* _xlbl;
int _result;
}
- (instancetype) init: (b4i_b4xdialog*) parent1 :(b4i_b4xdialog*) __ref1 :(NSObject*) _text1 :(NSObject*) _yes1 :(NSObject*) _no1 :(NSObject*) _cancel1 {
self->__ref = __ref1;
self->_text = _text1;
self->_yes = _yes1;
self->_no = _no1;
self->_cancel = _cancel1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xdialog* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xdialog";

    while (true) {
        switch (self->_state) {
            case -1:
{
[parent->___c ReturnFromResumableSub:self :nil];return;}
case 0:
//C
self->_state = -1;
B4IRDebugUtils.currentLine=13631489;
 //BA.debugLineNum = 13631489;BA.debugLine="Dim p As B4XView";
_p = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="p = xui.CreatePanel(\"\")";
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 300dip, 100dip)";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (((int) (100)))];
B4IRDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=13631493;
 //BA.debugLineNum = 13631493;BA.debugLine="lbl.Initialize(\"\")";
[_lbl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="lbl.Multiline = True";
[_lbl setMultiline:true];
B4IRDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="p.AddView(xlbl, 5dip, 0, p.Width - 10dip, p.Heigh";
[_p AddView:(UIView*)((_xlbl).object) :(float) (((int) (5))) :(float) (0) :(float) ([_p Width]-((int) (10))) :[_p Height]];
B4IRDebugUtils.currentLine=13631503;
 //BA.debugLineNum = 13631503;BA.debugLine="xlbl.TextColor = xui.Color_White";
[_xlbl setTextColor:[__ref->__xui /*B4IXUI**/  Color_White]];
B4IRDebugUtils.currentLine=13631504;
 //BA.debugLineNum = 13631504;BA.debugLine="xlbl.Font = TitleBarFont";
[_xlbl setFont:__ref->__titlebarfont /*B4XFont**/ ];
B4IRDebugUtils.currentLine=13631505;
 //BA.debugLineNum = 13631505;BA.debugLine="InternalSetTextOrCSBuilderToLabel(xlbl, Text)";
[__ref _internalsettextorcsbuildertolabel /*NSString**/ :nil :_xlbl :_text];
B4IRDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"LEFT\")";
[_xlbl SetTextAlignment:@"CENTER" :@"LEFT"];
B4IRDebugUtils.currentLine=13631507;
 //BA.debugLineNum = 13631507;BA.debugLine="Wait For (ShowCustom(p, Yes, No, Cancel)) Complet";
[parent->___c WaitFor:@"complete:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xdialog" :@"show"] :[__ref _showcustom /*B4IResumableSubWrapper**/ :nil :_p :_yes :_no :_cancel]];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
_result = ((NSNumber*) result[1]).intValue;
;
B4IRDebugUtils.currentLine=13631508;
 //BA.debugLineNum = 13631508;BA.debugLine="Return Result";
if (true) {
[parent->___c ReturnFromResumableSub:self :(NSObject*)(@(_result))];return;};
B4IRDebugUtils.currentLine=13631509;
 //BA.debugLineNum = 13631509;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_b4xdialog_ShowCustom :B4IResumableSub 
- (instancetype) init: (b4i_b4xdialog*) parent1 :(b4i_b4xdialog*) __ref1 :(B4XViewWrapper*) _content1 :(NSObject*) _yes1 :(NSObject*) _no1 :(NSObject*) _cancel1;
@end
@implementation ResumableSub_b4xdialog_ShowCustom {
b4i_b4xdialog* parent;
b4i_b4xdialog* __ref;
B4XViewWrapper* _content;
NSObject* _yes;
NSObject* _no;
NSObject* _cancel;
B4XViewWrapper* _v;
B4IImageViewWrapper* _iv;
BOOL _includetitle;
int _titlebarheight;
int _height;
int _width;
int _top;
BOOL _removetitle;
int _i;
int _btype;
B4ILabelWrapper* _lbl;
B4XViewWrapper* _xlbl;
int _result;
}
- (instancetype) init: (b4i_b4xdialog*) parent1 :(b4i_b4xdialog*) __ref1 :(B4XViewWrapper*) _content1 :(NSObject*) _yes1 :(NSObject*) _no1 :(NSObject*) _cancel1 {
self->__ref = __ref1;
self->_content = _content1;
self->_yes = _yes1;
self->_no = _no1;
self->_cancel = _cancel1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xdialog* __ref;
id<B4IIterable> group1;
int index1;
int groupLen1;
int step43;
int limit43;
id<B4IIterable> group71;
int index71;
int groupLen71;
id<B4IIterable> group75;
int index75;
int groupLen75;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xdialog";

    while (true) {
        switch (self->_state) {
            case -1:
{
[parent->___c ReturnFromResumableSub:self :nil];return;}
case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="For Each v As B4XView In mParent.GetAllViewsRecur";
if (true) break;

case 1:
//for
self->_state = 8;
_v = [B4XViewWrapper new];
group1 = [__ref->__mparent /*B4XViewWrapper**/  GetAllViewsRecursive];
index1 = 0;
groupLen1 = group1.Size;
self->_state = 60;
if (true) break;

case 60:
//C
self->_state = 8;
if (index1 < groupLen1) {
self->_state = 3;
_v.object = (NSObject*)([group1 Get:index1]);}
if (true) break;

case 61:
//C
self->_state = 60;
index1++;
if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="If v.Tag <> Null And v.Tag = \"b4xdialog_backgrou";
if (true) break;

case 4:
//if
self->_state = 7;
if ([_v Tag]!= nil && [[_v Tag] isEqual:(NSObject*)(@"b4xdialog_background")]) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="v.RemoveViewFromParent";
[_v RemoveViewFromParent];
B4IRDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Exit";
self->_state = 8;
if (true) break;
 if (true) break;

case 7:
//C
self->_state = 61;
;
 if (true) break;
if (true) break;

case 8:
//C
self->_state = 9;
;
B4IRDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="Dim Background As B4XView = xui.CreatePanel(\"back";
parent->__background = [B4XViewWrapper new];
parent->__background = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"background"];
B4IRDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Background.Tag = \"b4xdialog_background\"";
[__ref->__background /*B4XViewWrapper**/  setTag:(NSObject*)(@"b4xdialog_background")];
B4IRDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="If BlurBackground Then";
if (true) break;

case 9:
//if
self->_state = 14;
if (__ref->__blurbackground /*BOOL*/ ) { 
self->_state = 11;
}else {
self->_state = 13;
}if (true) break;

case 11:
//C
self->_state = 14;
B4IRDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="Dim iv As ImageView";
_iv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="iv.Initialize(\"\")";
[_iv Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="BlurImageView = iv";
__ref->__blurimageview /*B4XViewWrapper**/ .object = (NSObject*)((_iv).object);
B4IRDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="Background.AddView(BlurImageView, 0, 0, Backgrou";
[__ref->__background /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__blurimageview /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__background /*B4XViewWrapper**/  Width] :[__ref->__background /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="Background.Color = xui.Color_Transparent";
[__ref->__background /*B4XViewWrapper**/  setColor:[__ref->__xui /*B4IXUI**/  Color_Transparent]];
 if (true) break;

case 13:
//C
self->_state = 14;
B4IRDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="Background.Color = OverlayColor";
[__ref->__background /*B4XViewWrapper**/  setColor:__ref->__overlaycolor /*int*/ ];
 if (true) break;

case 14:
//C
self->_state = 15;
;
B4IRDebugUtils.currentLine=13697046;
 //BA.debugLineNum = 13697046;BA.debugLine="mParent.AddView(Background, 0, 0, mParent.Width,";
[__ref->__mparent /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__background /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mparent /*B4XViewWrapper**/  Width] :[__ref->__mparent /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=13697047;
 //BA.debugLineNum = 13697047;BA.debugLine="UpdateBlur";
[__ref _updateblur /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13697048;
 //BA.debugLineNum = 13697048;BA.debugLine="Base = xui.CreatePanel(\"\")";
__ref->__base /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=13697049;
 //BA.debugLineNum = 13697049;BA.debugLine="Base.SetColorAndBorder(BackgroundColor, BorderWid";
[__ref->__base /*B4XViewWrapper**/  SetColorAndBorder:__ref->__backgroundcolor /*int*/  :(float) (__ref->__borderwidth /*int*/ ) :__ref->__bordercolor /*int*/  :(float) (__ref->__bordercornersradius /*int*/ )];
B4IRDebugUtils.currentLine=13697050;
 //BA.debugLineNum = 13697050;BA.debugLine="Base.RequestFocus";
[__ref->__base /*B4XViewWrapper**/  RequestFocus];
B4IRDebugUtils.currentLine=13697051;
 //BA.debugLineNum = 13697051;BA.debugLine="Dim IncludeTitle As Boolean = Title <> \"\"";
_includetitle = [__ref->__title /*NSObject**/  isEqual:(NSObject*)(@"")] == false;
B4IRDebugUtils.currentLine=13697052;
 //BA.debugLineNum = 13697052;BA.debugLine="Dim TitleBarHeight As Int = 0";
_titlebarheight = (int) (0);
B4IRDebugUtils.currentLine=13697053;
 //BA.debugLineNum = 13697053;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 15:
//if
self->_state = 18;
if (_includetitle) { 
self->_state = 17;
}if (true) break;

case 17:
//C
self->_state = 18;
B4IRDebugUtils.currentLine=13697054;
 //BA.debugLineNum = 13697054;BA.debugLine="TitleBarHeight = 30dip";
_titlebarheight = ((int) (30));
 if (true) break;

case 18:
//C
self->_state = 19;
;
B4IRDebugUtils.currentLine=13697056;
 //BA.debugLineNum = 13697056;BA.debugLine="Dim height As Int = Content.Height + ButtonHeight";
_height = (int) ([_content Height]+__ref->__buttonheight /*int*/ +((int) (3))+((int) (3))+_titlebarheight);
B4IRDebugUtils.currentLine=13697057;
 //BA.debugLineNum = 13697057;BA.debugLine="Dim width As Int = Content.Width + 4dip";
_width = (int) ([_content Width]+((int) (4)));
B4IRDebugUtils.currentLine=13697058;
 //BA.debugLineNum = 13697058;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - he";
_top = (int) (((double)lrint([__ref->__background /*B4XViewWrapper**/  Height]/(double)2-_height/(double)2)));
B4IRDebugUtils.currentLine=13697059;
 //BA.debugLineNum = 13697059;BA.debugLine="Dim RemoveTitle As Boolean";
_removetitle = false;
B4IRDebugUtils.currentLine=13697060;
 //BA.debugLineNum = 13697060;BA.debugLine="If PutAtTop Then";
if (true) break;

case 19:
//if
self->_state = 28;
if (__ref->__putattop /*BOOL*/ ) { 
self->_state = 21;
}if (true) break;

case 21:
//C
self->_state = 22;
B4IRDebugUtils.currentLine=13697061;
 //BA.debugLineNum = 13697061;BA.debugLine="Top = 20dip";
_top = ((int) (20));
B4IRDebugUtils.currentLine=13697062;
 //BA.debugLineNum = 13697062;BA.debugLine="If Background.Height - Top - height < 200dip The";
if (true) break;

case 22:
//if
self->_state = 27;
if ([__ref->__background /*B4XViewWrapper**/  Height]-_top-_height<((int) (200))) { 
self->_state = 24;
;}if (true) break;

case 24:
//C
self->_state = 27;
_removetitle = true;
if (true) break;

case 27:
//C
self->_state = 28;
;
 if (true) break;
;
B4IRDebugUtils.currentLine=13697064;
 //BA.debugLineNum = 13697064;BA.debugLine="If RemoveTitle Or Background.Height < height Then";

case 28:
//if
self->_state = 31;
if (_removetitle || [__ref->__background /*B4XViewWrapper**/  Height]<_height) { 
self->_state = 30;
}if (true) break;

case 30:
//C
self->_state = 31;
B4IRDebugUtils.currentLine=13697065;
 //BA.debugLineNum = 13697065;BA.debugLine="Top = 1dip";
_top = ((int) (1));
B4IRDebugUtils.currentLine=13697066;
 //BA.debugLineNum = 13697066;BA.debugLine="IncludeTitle = False";
_includetitle = false;
B4IRDebugUtils.currentLine=13697067;
 //BA.debugLineNum = 13697067;BA.debugLine="height = height - TitleBarHeight - 3dip";
_height = (int) (_height-_titlebarheight-((int) (3)));
B4IRDebugUtils.currentLine=13697068;
 //BA.debugLineNum = 13697068;BA.debugLine="TitleBarHeight = 0";
_titlebarheight = (int) (0);
 if (true) break;

case 31:
//C
self->_state = 32;
;
B4IRDebugUtils.currentLine=13697070;
 //BA.debugLineNum = 13697070;BA.debugLine="Background.AddView(Base, Round(Background.Width /";
[__ref->__background /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__base /*B4XViewWrapper**/ ).object) :(float) (((double)lrint([__ref->__background /*B4XViewWrapper**/  Width]/(double)2-_width/(double)2))) :(float) (_top) :(float) (((double)lrint(_width))) :(float) (((double)lrint(_height)))];
B4IRDebugUtils.currentLine=13697072;
 //BA.debugLineNum = 13697072;BA.debugLine="For i = ButtonsOrder.Length - 1 To 0 Step - 1";
if (true) break;

case 32:
//for
self->_state = 43;
step43 = -1;
limit43 = (int) (0);
_i = (int) (__ref->__buttonsorder /*B4IArray**/ .Length-1) ;
self->_state = 62;
if (true) break;

case 62:
//C
self->_state = 43;
if ((step43 > 0 && _i <= limit43) || (step43 < 0 && _i >= limit43)) self->_state = 34;
if (true) break;

case 63:
//C
self->_state = 62;
_i = ((int)(0 + _i + step43)) ;
if (true) break;

case 34:
//C
self->_state = 35;
B4IRDebugUtils.currentLine=13697073;
 //BA.debugLineNum = 13697073;BA.debugLine="Dim btype As Int = ButtonsOrder(i)";
_btype = ((NSNumber*)[__ref->__buttonsorder /*B4IArray**/  getObjectFastN:_i]).intValue;
B4IRDebugUtils.currentLine=13697074;
 //BA.debugLineNum = 13697074;BA.debugLine="Select btype";
if (true) break;

case 35:
//select
self->_state = 42;
switch ([self.bi switchObjectToInt:@(_btype) :@[@([__ref->__xui /*B4IXUI**/  DialogResponse_Cancel]),@([__ref->__xui /*B4IXUI**/  DialogResponse_Negative]),@([__ref->__xui /*B4IXUI**/  DialogResponse_Positive])]]) {
case 0: {
self->_state = 37;
if (true) break;
}
case 1: {
self->_state = 39;
if (true) break;
}
case 2: {
self->_state = 41;
if (true) break;
}
}
if (true) break;

case 37:
//C
self->_state = 42;
B4IRDebugUtils.currentLine=13697076;
 //BA.debugLineNum = 13697076;BA.debugLine="CreateButton(Cancel, btype)";
[__ref _createbutton /*NSString**/ :nil :_cancel :_btype];
 if (true) break;

case 39:
//C
self->_state = 42;
B4IRDebugUtils.currentLine=13697078;
 //BA.debugLineNum = 13697078;BA.debugLine="CreateButton(No, btype)";
[__ref _createbutton /*NSString**/ :nil :_no :_btype];
 if (true) break;

case 41:
//C
self->_state = 42;
B4IRDebugUtils.currentLine=13697080;
 //BA.debugLineNum = 13697080;BA.debugLine="CreateButton(Yes, btype)";
[__ref _createbutton /*NSString**/ :nil :_yes :_btype];
 if (true) break;

case 42:
//C
self->_state = 63;
;
 if (true) break;
if (true) break;

case 43:
//C
self->_state = 44;
;
B4IRDebugUtils.currentLine=13697083;
 //BA.debugLineNum = 13697083;BA.debugLine="Base.Visible = False";
[__ref->__base /*B4XViewWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=13697084;
 //BA.debugLineNum = 13697084;BA.debugLine="If IncludeTitle Then";
if (true) break;

case 44:
//if
self->_state = 47;
if (_includetitle) { 
self->_state = 46;
}if (true) break;

case 46:
//C
self->_state = 47;
B4IRDebugUtils.currentLine=13697085;
 //BA.debugLineNum = 13697085;BA.debugLine="TitleBar = xui.CreatePanel(\"TitleBar\")";
__ref->__titlebar /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"TitleBar"];
B4IRDebugUtils.currentLine=13697086;
 //BA.debugLineNum = 13697086;BA.debugLine="TitleBar.Color = TitleBarColor";
[__ref->__titlebar /*B4XViewWrapper**/  setColor:__ref->__titlebarcolor /*int*/ ];
B4IRDebugUtils.currentLine=13697087;
 //BA.debugLineNum = 13697087;BA.debugLine="Base.AddView(TitleBar, 2dip, 2dip, Content.Width";
[__ref->__base /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__titlebar /*B4XViewWrapper**/ ).object) :(float) (((int) (2))) :(float) (((int) (2))) :[_content Width] :(float) (_titlebarheight)];
B4IRDebugUtils.currentLine=13697088;
 //BA.debugLineNum = 13697088;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=13697089;
 //BA.debugLineNum = 13697089;BA.debugLine="lbl.Initialize(\"\")";
[_lbl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=13697090;
 //BA.debugLineNum = 13697090;BA.debugLine="Dim xlbl As B4XView = lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=13697091;
 //BA.debugLineNum = 13697091;BA.debugLine="InternalSetTextOrCSBuilderToLabel(xlbl, Title)";
[__ref _internalsettextorcsbuildertolabel /*NSString**/ :nil :_xlbl :__ref->__title /*NSObject**/ ];
B4IRDebugUtils.currentLine=13697092;
 //BA.debugLineNum = 13697092;BA.debugLine="xlbl.TextColor = TitleBarTextColor";
[_xlbl setTextColor:__ref->__titlebartextcolor /*int*/ ];
B4IRDebugUtils.currentLine=13697093;
 //BA.debugLineNum = 13697093;BA.debugLine="xlbl.Font = TitleBarFont";
[_xlbl setFont:__ref->__titlebarfont /*B4XFont**/ ];
B4IRDebugUtils.currentLine=13697094;
 //BA.debugLineNum = 13697094;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
[_xlbl SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=13697095;
 //BA.debugLineNum = 13697095;BA.debugLine="TitleBar.AddView(xlbl, 0, 0, TitleBar.Width, Tit";
[__ref->__titlebar /*B4XViewWrapper**/  AddView:(UIView*)((_xlbl).object) :(float) (0) :(float) (0) :[__ref->__titlebar /*B4XViewWrapper**/  Width] :[__ref->__titlebar /*B4XViewWrapper**/  Height]];
 if (true) break;

case 47:
//C
self->_state = 48;
;
B4IRDebugUtils.currentLine=13697097;
 //BA.debugLineNum = 13697097;BA.debugLine="Content.RemoveViewFromParent";
[_content RemoveViewFromParent];
B4IRDebugUtils.currentLine=13697098;
 //BA.debugLineNum = 13697098;BA.debugLine="Base.AddView(Content, 2dip, 2dip + TitleBarHeight";
[__ref->__base /*B4XViewWrapper**/  AddView:(UIView*)((_content).object) :(float) (((int) (2))) :(float) (((int) (2))+_titlebarheight) :[_content Width] :[_content Height]];
B4IRDebugUtils.currentLine=13697099;
 //BA.debugLineNum = 13697099;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
[__ref->__base /*B4XViewWrapper**/  SetVisibleAnimated:__ref->__visibleanimationduration /*int*/  :true];
B4IRDebugUtils.currentLine=13697100;
 //BA.debugLineNum = 13697100;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 48:
//for
self->_state = 51;
_v = [B4XViewWrapper new];
group71 = [__ref->__background /*B4XViewWrapper**/  GetAllViewsRecursive];
index71 = 0;
groupLen71 = group71.Size;
self->_state = 64;
if (true) break;

case 64:
//C
self->_state = 51;
if (index71 < groupLen71) {
self->_state = 50;
_v.object = (NSObject*)([group71 Get:index71]);}
if (true) break;

case 65:
//C
self->_state = 64;
index71++;
if (true) break;

case 50:
//C
self->_state = 65;
B4IRDebugUtils.currentLine=13697101;
 //BA.debugLineNum = 13697101;BA.debugLine="v.Enabled = True";
[_v setEnabled:true];
 if (true) break;
if (true) break;

case 51:
//C
self->_state = 52;
;
B4IRDebugUtils.currentLine=13697103;
 //BA.debugLineNum = 13697103;BA.debugLine="Wait For CloseMessage (Result As Int)";
[parent->___c WaitFor:@"closemessage:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xdialog" :@"showcustom"] :nil];
self->_state = 66;
return;
case 66:
//C
self->_state = 52;
_result = ((NSNumber*) result[1]).intValue;
;
B4IRDebugUtils.currentLine=13697104;
 //BA.debugLineNum = 13697104;BA.debugLine="For Each v As B4XView In Background.GetAllViewsRe";
if (true) break;

case 52:
//for
self->_state = 55;
_v = [B4XViewWrapper new];
group75 = [__ref->__background /*B4XViewWrapper**/  GetAllViewsRecursive];
index75 = 0;
groupLen75 = group75.Size;
self->_state = 67;
if (true) break;

case 67:
//C
self->_state = 55;
if (index75 < groupLen75) {
self->_state = 54;
_v.object = (NSObject*)([group75 Get:index75]);}
if (true) break;

case 68:
//C
self->_state = 67;
index75++;
if (true) break;

case 54:
//C
self->_state = 68;
B4IRDebugUtils.currentLine=13697105;
 //BA.debugLineNum = 13697105;BA.debugLine="v.Enabled = False";
[_v setEnabled:false];
 if (true) break;
if (true) break;

case 55:
//C
self->_state = 56;
;
B4IRDebugUtils.currentLine=13697107;
 //BA.debugLineNum = 13697107;BA.debugLine="Base.SetVisibleAnimated(VisibleAnimationDuration,";
[__ref->__base /*B4XViewWrapper**/  SetVisibleAnimated:__ref->__visibleanimationduration /*int*/  :false];
B4IRDebugUtils.currentLine=13697108;
 //BA.debugLineNum = 13697108;BA.debugLine="If VisibleAnimationDuration > 0 Then";
if (true) break;

case 56:
//if
self->_state = 59;
if (__ref->__visibleanimationduration /*int*/ >0) { 
self->_state = 58;
}if (true) break;

case 58:
//C
self->_state = 59;
B4IRDebugUtils.currentLine=13697109;
 //BA.debugLineNum = 13697109;BA.debugLine="Sleep(VisibleAnimationDuration)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xdialog" :@"showcustom"] :__ref->__visibleanimationduration /*int*/ ];
self->_state = 69;
return;
case 69:
//C
self->_state = 59;
;
 if (true) break;

case 59:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=13697111;
 //BA.debugLineNum = 13697111;BA.debugLine="Background.RemoveViewFromParent";
[__ref->__background /*B4XViewWrapper**/  RemoveViewFromParent];
B4IRDebugUtils.currentLine=13697112;
 //BA.debugLineNum = 13697112;BA.debugLine="Return Result";
if (true) {
[parent->___c ReturnFromResumableSub:self :(NSObject*)(@(_result))];return;};
B4IRDebugUtils.currentLine=13697113;
 //BA.debugLineNum = 13697113;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_b4xdialog_ShowTemplate :B4IResumableSub 
- (instancetype) init: (b4i_b4xdialog*) parent1 :(b4i_b4xdialog*) __ref1 :(NSObject*) _dialogtemplate1 :(NSObject*) _yes1 :(NSObject*) _no1 :(NSObject*) _cancel1;
@end
@implementation ResumableSub_b4xdialog_ShowTemplate {
b4i_b4xdialog* parent;
b4i_b4xdialog* __ref;
NSObject* _dialogtemplate;
NSObject* _yes;
NSObject* _no;
NSObject* _cancel;
B4XViewWrapper* _content;
int _result;
}
- (instancetype) init: (b4i_b4xdialog*) parent1 :(b4i_b4xdialog*) __ref1 :(NSObject*) _dialogtemplate1 :(NSObject*) _yes1 :(NSObject*) _no1 :(NSObject*) _cancel1 {
self->__ref = __ref1;
self->_dialogtemplate = _dialogtemplate1;
self->_yes = _yes1;
self->_no = _no1;
self->_cancel = _cancel1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xdialog* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xdialog";

    while (true) {
        switch (self->_state) {
            case -1:
{
[parent->___c ReturnFromResumableSub:self :nil];return;}
case 0:
//C
self->_state = -1;
B4IRDebugUtils.currentLine=13565953;
 //BA.debugLineNum = 13565953;BA.debugLine="Dim content As B4XView = CallSub2(DialogTemplate,";
_content = [B4XViewWrapper new];
_content.object = (NSObject*)([parent->___c CallSubDebug2:self.bi :_dialogtemplate :@"GetPanel" :parent]);
B4IRDebugUtils.currentLine=13565954;
 //BA.debugLineNum = 13565954;BA.debugLine="CallSub2(DialogTemplate, \"Show\", Me)";
[parent->___c CallSubDebug2:self.bi :_dialogtemplate :@"Show" :parent];
B4IRDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="Wait For (ShowCustom(content , Yes, No, Cancel))";
[parent->___c WaitFor:@"complete:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xdialog" :@"showtemplate"] :[__ref _showcustom /*B4IResumableSubWrapper**/ :nil :_content :_yes :_no :_cancel]];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
_result = ((NSNumber*) result[1]).intValue;
;
B4IRDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="CallSub2(DialogTemplate, \"DialogClosed\", Result)";
[parent->___c CallSubDebug2:self.bi :_dialogtemplate :@"DialogClosed" :(NSObject*)(@(_result))];
B4IRDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="PutAtTop = False";
__ref->__putattop /*BOOL*/  = false;
B4IRDebugUtils.currentLine=13565958;
 //BA.debugLineNum = 13565958;BA.debugLine="Return Result";
if (true) {
[parent->___c ReturnFromResumableSub:self :(NSObject*)(@(_result))];return;};
B4IRDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xdialog 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xdialog) instance released.");
}

- (BOOL)  _close:(b4i_b4xdialog*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"close"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"close:" :@[@(_result)]]).boolValue;}
B4IRDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Public Sub Close (Result As Int) As Boolean";
B4IRDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="If getVisible Then";
if ([__ref _getvisible /*BOOL*/ :nil]) { 
B4IRDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="CallSubDelayed2(Me, \"CloseMessage\", Result)";
[self->___c CallSubDelayed2:self.bi :self :@"CloseMessage" :(NSObject*)(@(_result))];
B4IRDebugUtils.currentLine=14090243;
 //BA.debugLineNum = 14090243;BA.debugLine="Return True";
if (true) return true;
 };
B4IRDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="Return False";
if (true) return false;
B4IRDebugUtils.currentLine=14090246;
 //BA.debugLineNum = 14090246;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _background_click:(b4i_b4xdialog*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"background_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"background_click" :nil]);}
B4IRDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Private Sub Background_Click";
B4IRDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _background_touch:(b4i_b4xdialog*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"background_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"background_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Private Sub Background_Touch (Action As Int, X As";
B4IRDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="End Sub";
return @"";
}
- (b4i_bitmapcreator*)  _blur:(b4i_b4xdialog*) __ref :(B4XBitmapWrapper*) _bmp{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"blur"])
	 {return ((b4i_bitmapcreator*) [B4IDebug delegate:self.bi :@"blur:" :@[[B4I nilToNSNull:_bmp]]]);}
long long _n = 0L;
b4i_bitmapcreator* _bc = nil;
int _reducescale = 0;
int _count = 0;
B4IArray* _clrs = nil;
_argbcolor* _temp = nil;
int _m = 0;
int _steps = 0;
int _y = 0;
int _x = 0;
B4IRDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Private Sub Blur (bmp As B4XBitmap) As BitmapCreat";
B4IRDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim n As Long = DateTime.Now";
_n = [[self->___c DateTime] Now];
B4IRDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="Dim bc As BitmapCreator";
_bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="Dim ReduceScale As Int = BlurReduceScale";
_reducescale = __ref->__blurreducescale /*int*/ ;
B4IRDebugUtils.currentLine=14417924;
 //BA.debugLineNum = 14417924;BA.debugLine="bc.Initialize(bmp.Width / ReduceScale / bmp.Scale";
[_bc _initialize:self.bi :(int) ([_bmp Width]/(double)_reducescale/(double)[_bmp Scale]) :(int) ([_bmp Height]/(double)_reducescale/(double)[_bmp Scale])];
B4IRDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="bc.CopyPixelsFromBitmap(bmp)";
[_bc _copypixelsfrombitmap:_bmp];
B4IRDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="Dim count As Int = 2";
_count = (int) (2);
B4IRDebugUtils.currentLine=14417927;
 //BA.debugLineNum = 14417927;BA.debugLine="Dim clrs(3) As ARGBColor";
_clrs = [[B4IArray alloc]initObjects:@[@((int) (3))] :nil :@"_argbcolor"];
B4IRDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="Dim temp As ARGBColor";
_temp = [_argbcolor new];
B4IRDebugUtils.currentLine=14417929;
 //BA.debugLineNum = 14417929;BA.debugLine="Dim m As Int";
_m = 0;
B4IRDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="For steps = 1 To count";
{
const int step10 = 1;
const int limit10 = _count;
_steps = (int) (1) ;
for (;_steps <= limit10 ;_steps = _steps + step10 ) {
B4IRDebugUtils.currentLine=14417931;
 //BA.debugLineNum = 14417931;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
const int step11 = 1;
const int limit11 = (int) (_bc->__mheight-1);
_y = (int) (0) ;
for (;_y <= limit11 ;_y = _y + step11 ) {
B4IRDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="For x = 0 To 2";
{
const int step12 = 1;
const int limit12 = (int) (2);
_x = (int) (0) ;
for (;_x <= limit12 ;_x = _x + step12 ) {
B4IRDebugUtils.currentLine=14417933;
 //BA.debugLineNum = 14417933;BA.debugLine="bc.GetARGB(x, y, clrs(x))";
[_bc _getargb:_x :_y :((_argbcolor*)[_clrs getObjectFast:_x])];
 }
};
B4IRDebugUtils.currentLine=14417935;
 //BA.debugLineNum = 14417935;BA.debugLine="SetAvg(bc, 1, y, clrs, temp)";
[__ref _setavg /*NSString**/ :nil :_bc :(int) (1) :_y :_clrs :_temp];
B4IRDebugUtils.currentLine=14417936;
 //BA.debugLineNum = 14417936;BA.debugLine="m = 0";
_m = (int) (0);
B4IRDebugUtils.currentLine=14417937;
 //BA.debugLineNum = 14417937;BA.debugLine="For x = 2 To bc.mWidth - 2";
{
const int step17 = 1;
const int limit17 = (int) (_bc->__mwidth-2);
_x = (int) (2) ;
for (;_x <= limit17 ;_x = _x + step17 ) {
B4IRDebugUtils.currentLine=14417938;
 //BA.debugLineNum = 14417938;BA.debugLine="bc.GetARGB(x + 1, y, clrs(m))";
[_bc _getargb:(int) (_x+1) :_y :((_argbcolor*)[_clrs getObjectFast:_m])];
B4IRDebugUtils.currentLine=14417939;
 //BA.debugLineNum = 14417939;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
B4IRDebugUtils.currentLine=14417940;
 //BA.debugLineNum = 14417940;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
[__ref _setavg /*NSString**/ :nil :_bc :_x :_y :_clrs :_temp];
 }
};
 }
};
B4IRDebugUtils.currentLine=14417943;
 //BA.debugLineNum = 14417943;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
const int step23 = 1;
const int limit23 = (int) (_bc->__mwidth-1);
_x = (int) (0) ;
for (;_x <= limit23 ;_x = _x + step23 ) {
B4IRDebugUtils.currentLine=14417944;
 //BA.debugLineNum = 14417944;BA.debugLine="For y = 0 To 2";
{
const int step24 = 1;
const int limit24 = (int) (2);
_y = (int) (0) ;
for (;_y <= limit24 ;_y = _y + step24 ) {
B4IRDebugUtils.currentLine=14417945;
 //BA.debugLineNum = 14417945;BA.debugLine="bc.GetARGB(x, y, clrs(y))";
[_bc _getargb:_x :_y :((_argbcolor*)[_clrs getObjectFast:_y])];
 }
};
B4IRDebugUtils.currentLine=14417947;
 //BA.debugLineNum = 14417947;BA.debugLine="SetAvg(bc, x, 1, clrs, temp)";
[__ref _setavg /*NSString**/ :nil :_bc :_x :(int) (1) :_clrs :_temp];
B4IRDebugUtils.currentLine=14417948;
 //BA.debugLineNum = 14417948;BA.debugLine="m = 0";
_m = (int) (0);
B4IRDebugUtils.currentLine=14417949;
 //BA.debugLineNum = 14417949;BA.debugLine="For y = 2 To bc.mHeight - 2";
{
const int step29 = 1;
const int limit29 = (int) (_bc->__mheight-2);
_y = (int) (2) ;
for (;_y <= limit29 ;_y = _y + step29 ) {
B4IRDebugUtils.currentLine=14417950;
 //BA.debugLineNum = 14417950;BA.debugLine="bc.GetARGB(x, y + 1, clrs(m))";
[_bc _getargb:_x :(int) (_y+1) :((_argbcolor*)[_clrs getObjectFast:_m])];
B4IRDebugUtils.currentLine=14417951;
 //BA.debugLineNum = 14417951;BA.debugLine="m = (m + 1) Mod 3";
_m = (int) ((_m+1)%3);
B4IRDebugUtils.currentLine=14417952;
 //BA.debugLineNum = 14417952;BA.debugLine="SetAvg(bc, x, y, clrs, temp)";
[__ref _setavg /*NSString**/ :nil :_bc :_x :_y :_clrs :_temp];
 }
};
 }
};
 }
};
B4IRDebugUtils.currentLine=14417956;
 //BA.debugLineNum = 14417956;BA.debugLine="Log(\"Time: \" & (DateTime.Now - n))";
[self->___c LogImpl:@"914417956" :[@[@"Time: ",[self.bi NumberToString:@(([[self->___c DateTime] Now]-_n))]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=14417957;
 //BA.debugLineNum = 14417957;BA.debugLine="Return bc";
if (true) return _bc;
B4IRDebugUtils.currentLine=14417958;
 //BA.debugLineNum = 14417958;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _setavg:(b4i_b4xdialog*) __ref :(b4i_bitmapcreator*) _bc :(int) _x :(int) _y :(B4IArray*) _clrs :(_argbcolor*) _temp{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"setavg"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setavg:::::" :@[[B4I nilToNSNull:_bc],@(_x),@(_y),[B4I nilToNSNull:_clrs],[B4I nilToNSNull:_temp]]]);}
_argbcolor* _c = nil;
B4IRDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Private Sub SetAvg(bc As BitmapCreator, x As Int,";
B4IRDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="temp.Initialize";
[_temp Initialize];
B4IRDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="For Each c As ARGBColor In clrs";
{
const id<B4IIterable> group2 = _clrs;
const int groupLen2 = group2.Size
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_c = [group2 Get:index2];
B4IRDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="temp.r = temp.r + c.r";
_temp->_r = (int) (_temp->_r+_c->_r);
B4IRDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="temp.g = temp.g + c.g";
_temp->_g = (int) (_temp->_g+_c->_g);
B4IRDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="temp.b = temp.b + c.b";
_temp->_b = (int) (_temp->_b+_c->_b);
 }
};
B4IRDebugUtils.currentLine=14483463;
 //BA.debugLineNum = 14483463;BA.debugLine="temp.a = 255";
_temp->_a = (int) (255);
B4IRDebugUtils.currentLine=14483464;
 //BA.debugLineNum = 14483464;BA.debugLine="temp.r = temp.r / 3";
_temp->_r = (int) (_temp->_r/(double)3);
B4IRDebugUtils.currentLine=14483465;
 //BA.debugLineNum = 14483465;BA.debugLine="temp.g = temp.g / 3";
_temp->_g = (int) (_temp->_g/(double)3);
B4IRDebugUtils.currentLine=14483466;
 //BA.debugLineNum = 14483466;BA.debugLine="temp.b = temp.b / 3";
_temp->_b = (int) (_temp->_b/(double)3);
B4IRDebugUtils.currentLine=14483467;
 //BA.debugLineNum = 14483467;BA.debugLine="bc.SetARGB(x, y, temp)";
[_bc _setargb:_x :_y :_temp];
B4IRDebugUtils.currentLine=14483468;
 //BA.debugLineNum = 14483468;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _button_click:(b4i_b4xdialog*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"button_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"button_click" :nil]);}
B4XViewWrapper* _b = nil;
B4IRDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Private Sub Button_Click";
B4IRDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="Dim b As B4XView = Sender";
_b = [B4XViewWrapper new];
_b.object = (NSObject*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Close(b.Tag)";
[__ref _close /*BOOL*/ :nil :[self.bi ObjectToNumber:[_b Tag]].intValue];
B4IRDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xdialog*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xdialog";
B4IRDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=13434881;
 //BA.debugLineNum = 13434881;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="Private ButtonHeight As Int = 40dip";
self->__buttonheight = ((int) (40));
B4IRDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="Private ButtonWidth As Int = 80dip";
self->__buttonwidth = ((int) (80));
B4IRDebugUtils.currentLine=13434884;
 //BA.debugLineNum = 13434884;BA.debugLine="Public Base As B4XView";
self->__base = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="Public BackgroundColor As Int = 0xFF555555 'base";
self->__backgroundcolor = (int) (0xff555555);
B4IRDebugUtils.currentLine=13434886;
 //BA.debugLineNum = 13434886;BA.debugLine="Public OverlayColor As Int = 0xaa000000";
self->__overlaycolor = (int) (0xaa000000);
B4IRDebugUtils.currentLine=13434887;
 //BA.debugLineNum = 13434887;BA.debugLine="Public BorderColor As Int = 0xff000000";
self->__bordercolor = (int) (0xff000000);
B4IRDebugUtils.currentLine=13434888;
 //BA.debugLineNum = 13434888;BA.debugLine="Public BorderCornersRadius As Int = 2dip";
self->__bordercornersradius = ((int) (2));
B4IRDebugUtils.currentLine=13434889;
 //BA.debugLineNum = 13434889;BA.debugLine="Public BorderWidth As Int = 2dip";
self->__borderwidth = ((int) (2));
B4IRDebugUtils.currentLine=13434890;
 //BA.debugLineNum = 13434890;BA.debugLine="Public ButtonsColor As Int = 0xFF555555";
self->__buttonscolor = (int) (0xff555555);
B4IRDebugUtils.currentLine=13434891;
 //BA.debugLineNum = 13434891;BA.debugLine="Public ButtonsTextColor As Int = 0xFF89D5FF";
self->__buttonstextcolor = (int) (0xff89d5ff);
B4IRDebugUtils.currentLine=13434892;
 //BA.debugLineNum = 13434892;BA.debugLine="Private Background As B4XView";
self->__background = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13434893;
 //BA.debugLineNum = 13434893;BA.debugLine="Private BlurImageView As B4XView";
self->__blurimageview = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13434894;
 //BA.debugLineNum = 13434894;BA.debugLine="Public BlurBackground As Boolean";
self->__blurbackground = false;
B4IRDebugUtils.currentLine=13434895;
 //BA.debugLineNum = 13434895;BA.debugLine="Private BlurReduceScale As Int";
self->__blurreducescale = 0;
B4IRDebugUtils.currentLine=13434896;
 //BA.debugLineNum = 13434896;BA.debugLine="Public mParent As B4XView";
self->__mparent = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13434897;
 //BA.debugLineNum = 13434897;BA.debugLine="Public Title As Object = \"\"";
self->__title = (NSObject*)(@"");
B4IRDebugUtils.currentLine=13434898;
 //BA.debugLineNum = 13434898;BA.debugLine="Public TitleBarColor As Int = 0xFF0083B8";
self->__titlebarcolor = (int) (0xff0083b8);
B4IRDebugUtils.currentLine=13434899;
 //BA.debugLineNum = 13434899;BA.debugLine="Public TitleBarTextColor As Int";
self->__titlebartextcolor = 0;
B4IRDebugUtils.currentLine=13434900;
 //BA.debugLineNum = 13434900;BA.debugLine="Public TitleBar As B4XView";
self->__titlebar = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=13434901;
 //BA.debugLineNum = 13434901;BA.debugLine="Public PutAtTop As Boolean";
self->__putattop = false;
B4IRDebugUtils.currentLine=13434902;
 //BA.debugLineNum = 13434902;BA.debugLine="Public TitleBarFont As B4XFont";
self->__titlebarfont = [B4XFont new];
B4IRDebugUtils.currentLine=13434903;
 //BA.debugLineNum = 13434903;BA.debugLine="Public ButtonsFont As B4XFont";
self->__buttonsfont = [B4XFont new];
B4IRDebugUtils.currentLine=13434904;
 //BA.debugLineNum = 13434904;BA.debugLine="Public ButtonsTextColorDisabled As Int = 0xFF8080";
self->__buttonstextcolordisabled = (int) (0xff808080);
B4IRDebugUtils.currentLine=13434905;
 //BA.debugLineNum = 13434905;BA.debugLine="Public VisibleAnimationDuration As Int = 100";
self->__visibleanimationduration = (int) (100);
B4IRDebugUtils.currentLine=13434906;
 //BA.debugLineNum = 13434906;BA.debugLine="Public ButtonsOrder() As Int = Array As Int(xui.D";
self->__buttonsorder = [[B4IArray alloc]initObjectsWithData:@[@([__ref->__xui /*B4IXUI**/  DialogResponse_Positive]),@([__ref->__xui /*B4IXUI**/  DialogResponse_Negative]),@([__ref->__xui /*B4IXUI**/  DialogResponse_Cancel])]];
B4IRDebugUtils.currentLine=13434907;
 //BA.debugLineNum = 13434907;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _getvisible:(b4i_b4xdialog*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"getvisible"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getvisible" :nil]).boolValue;}
B4IRDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Public Sub getVisible As Boolean";
B4IRDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Return Background.IsInitialized And Background.Pa";
if (true) return [__ref->__background /*B4XViewWrapper**/  IsInitialized] && [[__ref->__background /*B4XViewWrapper**/  Parent] IsInitialized];
B4IRDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _createbutton:(b4i_b4xdialog*) __ref :(NSObject*) _text :(int) _code{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"createbutton"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createbutton::" :@[[B4I nilToNSNull:_text],@(_code)]]);}
B4ILabelWrapper* _btn = nil;
B4XViewWrapper* _xbtn = nil;
int _numberofbuttons = 0;
B4IRDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Private Sub CreateButton (Text As Object, Code As";
B4IRDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="If Text = \"\" Then Return";
if ([_text isEqual:(NSObject*)(@"")]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Dim btn As Label";
_btn = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=13828103;
 //BA.debugLineNum = 13828103;BA.debugLine="btn.Initialize(\"Button\")";
[_btn Initialize:self.bi :@"Button"];
B4IRDebugUtils.currentLine=13828104;
 //BA.debugLineNum = 13828104;BA.debugLine="Dim xbtn As B4XView = btn";
_xbtn = [B4XViewWrapper new];
_xbtn.object = (NSObject*)((_btn).object);
B4IRDebugUtils.currentLine=13828105;
 //BA.debugLineNum = 13828105;BA.debugLine="InternalSetTextOrCSBuilderToLabel(xbtn, Text)";
[__ref _internalsettextorcsbuildertolabel /*NSString**/ :nil :_xbtn :_text];
B4IRDebugUtils.currentLine=13828106;
 //BA.debugLineNum = 13828106;BA.debugLine="xbtn.Tag = Code";
[_xbtn setTag:(NSObject*)(@(_code))];
B4IRDebugUtils.currentLine=13828107;
 //BA.debugLineNum = 13828107;BA.debugLine="xbtn.SetColorAndBorder(ButtonsColor, 0dip, Border";
[_xbtn SetColorAndBorder:__ref->__buttonscolor /*int*/  :(float) (((int) (0))) :__ref->__bordercolor /*int*/  :(float) (((int) (5)))];
B4IRDebugUtils.currentLine=13828108;
 //BA.debugLineNum = 13828108;BA.debugLine="xbtn.SetTextAlignment(\"CENTER\", \"CENTER\")";
[_xbtn SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=13828109;
 //BA.debugLineNum = 13828109;BA.debugLine="xbtn.TextColor = ButtonsTextColor";
[_xbtn setTextColor:__ref->__buttonstextcolor /*int*/ ];
B4IRDebugUtils.currentLine=13828110;
 //BA.debugLineNum = 13828110;BA.debugLine="xbtn.Font = ButtonsFont";
[_xbtn setFont:__ref->__buttonsfont /*B4XFont**/ ];
B4IRDebugUtils.currentLine=13828111;
 //BA.debugLineNum = 13828111;BA.debugLine="Dim numberOfButtons As Int = Base.NumberOfViews '";
_numberofbuttons = [__ref->__base /*B4XViewWrapper**/  NumberOfViews];
B4IRDebugUtils.currentLine=13828112;
 //BA.debugLineNum = 13828112;BA.debugLine="Base.AddView(xbtn, Base.Width - 4dip - numberOfBu";
[__ref->__base /*B4XViewWrapper**/  AddView:(UIView*)((_xbtn).object) :(float) ([__ref->__base /*B4XViewWrapper**/  Width]-((int) (4))-_numberofbuttons*(__ref->__buttonwidth /*int*/ +((int) (5)))-__ref->__buttonwidth /*int*/ ) :(float) ([__ref->__base /*B4XViewWrapper**/  Height]-__ref->__buttonheight /*int*/ -((int) (4))) :(float) (__ref->__buttonwidth /*int*/ ) :(float) (__ref->__buttonheight /*int*/ )];
B4IRDebugUtils.currentLine=13828114;
 //BA.debugLineNum = 13828114;BA.debugLine="If Code = xui.DialogResponse_Cancel Then xbtn.Req";
if (_code==[__ref->__xui /*B4IXUI**/  DialogResponse_Cancel]) { 
[_xbtn RequestFocus];};
B4IRDebugUtils.currentLine=13828115;
 //BA.debugLineNum = 13828115;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _internalsettextorcsbuildertolabel:(b4i_b4xdialog*) __ref :(B4XViewWrapper*) _xlbl :(NSObject*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"internalsettextorcsbuildertolabel"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"internalsettextorcsbuildertolabel::" :@[[B4I nilToNSNull:_xlbl],[B4I nilToNSNull:_text]]]);}
B4ILabelWrapper* _lbl = nil;
B4IRDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Public Sub InternalSetTextOrCSBuilderToLabel(xlbl";
B4IRDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="If Text Is CSBuilder And xlbl Is Label Then";
if ([_text isKindOfClass: [NSAttributedString class]] && [_xlbl.objectOrNull isKindOfClass: [UILabel class]]) { 
B4IRDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="Dim lbl As Label = xlbl";
_lbl = [B4ILabelWrapper new];
_lbl.object = (UILabel*)((_xlbl).object);
B4IRDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="lbl.AttributedText = Text";
[_lbl setAttributedText:(B4IAttributedString*) [B4IObjectWrapper createWrapper:[B4IAttributedString new] object:(NSAttributedString*)(_text)]];
 }else {
B4IRDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="If GetType(Text) = \"__NSCFNumber\" Then Text = \"\"";
if ([[self->___c GetType:_text] isEqual:@"__NSCFNumber"]) { 
_text = (NSObject*)([@[@"",[self.bi CharToString:((unichar)([self.bi ObjectToNumber:_text].intValue))]] componentsJoinedByString:@""]);};
B4IRDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="xlbl.Text = Text";
[_xlbl setText:[self.bi ObjectToString:_text]];
 };
B4IRDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _getbutton:(b4i_b4xdialog*) __ref :(int) _resultcode{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"getbutton"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getbutton:" :@[@(_resultcode)]]);}
B4XViewWrapper* _b = nil;
B4IRDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Public Sub GetButton (ResultCode As Int) As B4XVie";
B4IRDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="For Each b As B4XView In Base.GetAllViewsRecursiv";
_b = [B4XViewWrapper new];
{
const id<B4IIterable> group1 = [__ref->__base /*B4XViewWrapper**/  GetAllViewsRecursive];
const int groupLen1 = group1.Size
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b.object = (NSObject*)([group1 Get:index1]);
B4IRDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="If b.Tag = ResultCode Then Return b";
if ([[_b Tag] isEqual:(NSObject*)(@(_resultcode))]) { 
if (true) return _b;};
 }
};
B4IRDebugUtils.currentLine=13893636;
 //BA.debugLineNum = 13893636;BA.debugLine="Return Null";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(nil)];
B4IRDebugUtils.currentLine=13893637;
 //BA.debugLineNum = 13893637;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_b4xdialog*) __ref :(B4I*) _ba :(B4XViewWrapper*) _parent{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_parent]]]);}
B4IRDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Public Sub Initialize (Parent As B4XView)";
B4IRDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="BlurBackground = False";
__ref->__blurbackground /*BOOL*/  = false;
B4IRDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="If xui.IsB4i Then";
if ([__ref->__xui /*B4IXUI**/  IsB4i]) { 
B4IRDebugUtils.currentLine=13500419;
 //BA.debugLineNum = 13500419;BA.debugLine="BlurReduceScale = 3";
__ref->__blurreducescale /*int*/  = (int) (3);
 }else if([__ref->__xui /*B4IXUI**/  IsB4J]) { 
B4IRDebugUtils.currentLine=13500421;
 //BA.debugLineNum = 13500421;BA.debugLine="BlurReduceScale = 1";
__ref->__blurreducescale /*int*/  = (int) (1);
 }else if([__ref->__xui /*B4IXUI**/  IsB4A]) { 
B4IRDebugUtils.currentLine=13500423;
 //BA.debugLineNum = 13500423;BA.debugLine="BlurReduceScale = 3";
__ref->__blurreducescale /*int*/  = (int) (3);
 };
B4IRDebugUtils.currentLine=13500425;
 //BA.debugLineNum = 13500425;BA.debugLine="mParent = Parent";
__ref->__mparent /*B4XViewWrapper**/  = _parent;
B4IRDebugUtils.currentLine=13500431;
 //BA.debugLineNum = 13500431;BA.debugLine="TitleBarFont = xui.CreateDefaultBoldFont(16)";
__ref->__titlebarfont /*B4XFont**/  = [__ref->__xui /*B4IXUI**/  CreateDefaultBoldFont:(float) (16)];
B4IRDebugUtils.currentLine=13500432;
 //BA.debugLineNum = 13500432;BA.debugLine="ButtonsFont = xui.CreateDefaultBoldFont(15)";
__ref->__buttonsfont /*B4XFont**/  = [__ref->__xui /*B4IXUI**/  CreateDefaultBoldFont:(float) (15)];
B4IRDebugUtils.currentLine=13500433;
 //BA.debugLineNum = 13500433;BA.debugLine="TitleBarTextColor = xui.Color_White";
__ref->__titlebartextcolor /*int*/  = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=13500434;
 //BA.debugLineNum = 13500434;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _internaladdstubtoclvifneeded:(b4i_b4xdialog*) __ref :(b4i_customlistview*) _customlistview1 :(int) _color{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"internaladdstubtoclvifneeded"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"internaladdstubtoclvifneeded::" :@[[B4I nilToNSNull:_customlistview1],@(_color)]]);}
_clvitem* _lastitem = nil;
B4XViewWrapper* _p = nil;
int _height = 0;
B4IRDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Public Sub InternalAddStubToCLVIfNeeded(CustomList";
B4IRDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="If CustomListView1.Size = 0 Then Return";
if ([_customlistview1 _getsize]==0) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Dim LastItem As CLVItem = CustomListView1.GetRawL";
_lastitem = [_customlistview1 _getrawlistitem:(int) ([_customlistview1 _getsize]-1)];
B4IRDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="If LastItem.Offset + LastItem.Panel.Height < Cust";
if (_lastitem->_Offset+[_lastitem->_Panel Height]<[[_customlistview1 _asview] Height]) { 
B4IRDebugUtils.currentLine=14548997;
 //BA.debugLineNum = 14548997;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"stub\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"stub"];
B4IRDebugUtils.currentLine=14548998;
 //BA.debugLineNum = 14548998;BA.debugLine="p.Color = Color";
[_p setColor:_color];
B4IRDebugUtils.currentLine=14548999;
 //BA.debugLineNum = 14548999;BA.debugLine="Dim Height As Int = CustomListView1.AsView.Heigh";
_height = (int) ([[_customlistview1 _asview] Height]-_lastitem->_Offset-[_lastitem->_Panel Height]-((int) (3)));
B4IRDebugUtils.currentLine=14549000;
 //BA.debugLineNum = 14549000;BA.debugLine="If xui.IsB4J Then Height = Height + 5";
if ([__ref->__xui /*B4IXUI**/  IsB4J]) { 
_height = (int) (_height+5);};
B4IRDebugUtils.currentLine=14549001;
 //BA.debugLineNum = 14549001;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, CustomListView1.AsV";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[[_customlistview1 _asview] Width] :(float) (_height)];
B4IRDebugUtils.currentLine=14549002;
 //BA.debugLineNum = 14549002;BA.debugLine="CustomListView1.Add(p, \"\")";
[_customlistview1 _add:_p :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=14549003;
 //BA.debugLineNum = 14549003;BA.debugLine="CustomListView1.sv.ScrollViewContentHeight = Cus";
[_customlistview1->__sv setScrollViewContentHeight:(int) ([_customlistview1->__sv ScrollViewContentHeight]-[_customlistview1 _getdividersize])];
 };
B4IRDebugUtils.currentLine=14549005;
 //BA.debugLineNum = 14549005;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resize:(b4i_b4xdialog*) __ref :(int) _width :(int) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resize::" :@[@(_width),@(_height)]]);}
int _top = 0;
B4IRDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Public Sub Resize (Width As Int, Height As Int)";
B4IRDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="Dim Top As Int = Round(Background.Height / 2 - Ba";
_top = (int) (((double)lrint([__ref->__background /*B4XViewWrapper**/  Height]/(double)2-[__ref->__base /*B4XViewWrapper**/  Height]/(double)2)));
B4IRDebugUtils.currentLine=14286851;
 //BA.debugLineNum = 14286851;BA.debugLine="If PutAtTop Then Top = 20dip";
if (__ref->__putattop /*BOOL*/ ) { 
_top = ((int) (20));};
B4IRDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Background.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__background /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="Base.SetLayoutAnimated(200, Round(Background.Widt";
[__ref->__base /*B4XViewWrapper**/  SetLayoutAnimated:(int) (200) :(float) (((double)lrint([__ref->__background /*B4XViewWrapper**/  Width]/(double)2-[__ref->__base /*B4XViewWrapper**/  Width]/(double)2))) :(float) (_top) :[__ref->__base /*B4XViewWrapper**/  Width] :[__ref->__base /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="If xui.IsB4J Then";
if ([__ref->__xui /*B4IXUI**/  IsB4J]) { 
B4IRDebugUtils.currentLine=14286855;
 //BA.debugLineNum = 14286855;BA.debugLine="UpdateBlur";
[__ref _updateblur /*NSString**/ :nil];
 };
B4IRDebugUtils.currentLine=14286857;
 //BA.debugLineNum = 14286857;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updateblur:(b4i_b4xdialog*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"updateblur"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updateblur" :nil]);}
B4XBitmapWrapper* _source = nil;
b4i_bitmapcreator* _blurred = nil;
B4IRDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Private Sub UpdateBlur";
B4IRDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="If BlurBackground = False Then Return";
if (__ref->__blurbackground /*BOOL*/ ==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="Background.Visible = False";
[__ref->__background /*B4XViewWrapper**/  setVisible:false];
B4IRDebugUtils.currentLine=14352387;
 //BA.debugLineNum = 14352387;BA.debugLine="Dim source As B4XBitmap = Background.Parent.Snaps";
_source = [B4XBitmapWrapper new];
_source = [[__ref->__background /*B4XViewWrapper**/  Parent] Snapshot];
B4IRDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="If source.Width > Background.Width Or source.Heig";
if ([_source Width]>[__ref->__background /*B4XViewWrapper**/  Width] || [_source Height]>[__ref->__background /*B4XViewWrapper**/  Height]) { 
B4IRDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="source = source.Crop(0, 0, Background.Width, Bac";
_source = [_source Crop:(float) (0) :(float) (0) :[__ref->__background /*B4XViewWrapper**/  Width] :[__ref->__background /*B4XViewWrapper**/  Height]];
 };
B4IRDebugUtils.currentLine=14352391;
 //BA.debugLineNum = 14352391;BA.debugLine="Background.Visible = True";
[__ref->__background /*B4XViewWrapper**/  setVisible:true];
B4IRDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="BlurImageView.SetLayoutAnimated(0, 0, 0, Backgrou";
[__ref->__blurimageview /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[__ref->__background /*B4XViewWrapper**/  Width] :[__ref->__background /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="Dim blurred As BitmapCreator = Blur(source)";
_blurred = [__ref _blur /*b4i_bitmapcreator**/ :nil :_source];
B4IRDebugUtils.currentLine=14352394;
 //BA.debugLineNum = 14352394;BA.debugLine="blurred.SetBitmapToImageView(blurred.Bitmap, Blur";
[_blurred _setbitmaptoimageview:[_blurred _getbitmap] :__ref->__blurimageview /*B4XViewWrapper**/ ];
B4IRDebugUtils.currentLine=14352395;
 //BA.debugLineNum = 14352395;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setbuttonstate:(b4i_b4xdialog*) __ref :(int) _resultcode :(BOOL) _enabled{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"setbuttonstate"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setbuttonstate::" :@[@(_resultcode),@(_enabled)]]);}
B4XViewWrapper* _b = nil;
B4IRDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Public Sub SetButtonState (ResultCode As Int, Enab";
B4IRDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="Dim b As B4XView = GetButton(ResultCode)";
_b = [B4XViewWrapper new];
_b = [__ref _getbutton /*B4XViewWrapper**/ :nil :_resultcode];
B4IRDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="If b.IsInitialized Then";
if ([_b IsInitialized]) { 
B4IRDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="b.Enabled = Enabled";
[_b setEnabled:_enabled];
B4IRDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="If Enabled Then b.TextColor = ButtonsTextColor E";
if (_enabled) { 
[_b setTextColor:__ref->__buttonstextcolor /*int*/ ];}
else {
[_b setTextColor:__ref->__buttonstextcolordisabled /*int*/ ];};
 };
B4IRDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="End Sub";
return @"";
}
- (B4IResumableSubWrapper*)  _show:(b4i_b4xdialog*) __ref :(NSObject*) _text :(NSObject*) _yes :(NSObject*) _no :(NSObject*) _cancel{
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"show"])
	 {return ((B4IResumableSubWrapper*) [B4IDebug delegate:self.bi :@"show::::" :@[[B4I nilToNSNull:_text],[B4I nilToNSNull:_yes],[B4I nilToNSNull:_no],[B4I nilToNSNull:_cancel]]]);}
ResumableSub_b4xdialog_Show* rsub = [[ResumableSub_b4xdialog_Show alloc] init:self : __ref: _text: _yes: _no: _cancel];
[rsub resume:self.bi :nil];
return (B4IResumableSubWrapper*) [B4IObjectWrapper createWrapper:[B4IResumableSubWrapper new] object:rsub];
}
//402398154
- (B4IResumableSubWrapper*)  _showcustom:(b4i_b4xdialog*) __ref :(B4XViewWrapper*) _content :(NSObject*) _yes :(NSObject*) _no :(NSObject*) _cancel{
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"showcustom"])
	 {return ((B4IResumableSubWrapper*) [B4IDebug delegate:self.bi :@"showcustom::::" :@[[B4I nilToNSNull:_content],[B4I nilToNSNull:_yes],[B4I nilToNSNull:_no],[B4I nilToNSNull:_cancel]]]);}
ResumableSub_b4xdialog_ShowCustom* rsub = [[ResumableSub_b4xdialog_ShowCustom alloc] init:self : __ref: _content: _yes: _no: _cancel];
[rsub resume:self.bi :nil];
return (B4IResumableSubWrapper*) [B4IObjectWrapper createWrapper:[B4IResumableSubWrapper new] object:rsub];
}
//-434784830
- (B4IResumableSubWrapper*)  _showtemplate:(b4i_b4xdialog*) __ref :(NSObject*) _dialogtemplate :(NSObject*) _yes :(NSObject*) _no :(NSObject*) _cancel{
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"showtemplate"])
	 {return ((B4IResumableSubWrapper*) [B4IDebug delegate:self.bi :@"showtemplate::::" :@[[B4I nilToNSNull:_dialogtemplate],[B4I nilToNSNull:_yes],[B4I nilToNSNull:_no],[B4I nilToNSNull:_cancel]]]);}
ResumableSub_b4xdialog_ShowTemplate* rsub = [[ResumableSub_b4xdialog_ShowTemplate alloc] init:self : __ref: _dialogtemplate: _yes: _no: _cancel];
[rsub resume:self.bi :nil];
return (B4IResumableSubWrapper*) [B4IObjectWrapper createWrapper:[B4IResumableSubWrapper new] object:rsub];
}
//-1950491661
- (NSString*)  _stub_click:(b4i_b4xdialog*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdialog";
if ([B4IDebug shouldDelegate: @"stub_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"stub_click" :nil]);}
B4IRDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Private Sub Stub_Click";
B4IRDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="End Sub";
return @"";
}
@end