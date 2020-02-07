
#import "b4i_b4xdrawer.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"


@implementation b4i_b4xdrawer 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xdrawer) instance released.");
}

- (NSString*)  _cancelgesture:(b4i_b4xdrawer*) __ref :(B4INativeObject*) _rec{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"cancelgesture"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cancelgesture:" :@[[B4I nilToNSNull:_rec]]]);}
B4IRDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub CancelGesture (rec As NativeObject)";
B4IRDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="rec.SetField(\"enabled\", False)";
[_rec SetField:@"enabled" :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="rec.SetField(\"enabled\", True)";
[_rec SetField:@"enabled" :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _changeoffset:(b4i_b4xdrawer*) __ref :(float) _x :(BOOL) _currentlytouching :(BOOL) _noanimation{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"changeoffset"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"changeoffset:::" :@[@(_x),@(_currentlytouching),@(_noanimation)]]);}
int _visibleoffset = 0;
B4IPanelWrapper* _p = nil;
int _dx = 0;
int _duration = 0;
B4IRDebugUtils.currentLine=19202048;
 //BA.debugLineNum = 19202048;BA.debugLine="Private Sub ChangeOffset (x As Float, CurrentlyTou";
B4IRDebugUtils.currentLine=19202049;
 //BA.debugLineNum = 19202049;BA.debugLine="x = Max(-mSideWidth, Min(0, x))";
_x = (float) (fmax(-__ref->__msidewidth /*int*/ ,fmin(0,_x)));
B4IRDebugUtils.currentLine=19202050;
 //BA.debugLineNum = 19202050;BA.debugLine="Dim VisibleOffset As Int = mSideWidth + x";
_visibleoffset = (int) (__ref->__msidewidth /*int*/ +_x);
B4IRDebugUtils.currentLine=19202052;
 //BA.debugLineNum = 19202052;BA.debugLine="Dim p As Panel = getLeftPanel";
_p = [B4IPanelWrapper new];
_p.object = (B4IPanelView*)(([__ref _getleftpanel /*B4XViewWrapper**/ :nil]).object);
B4IRDebugUtils.currentLine=19202053;
 //BA.debugLineNum = 19202053;BA.debugLine="If mLeftPanel.Left = -mSideWidth And x > -mSideWi";
if ([__ref->__mleftpanel /*B4XViewWrapper**/  Left]==-__ref->__msidewidth /*int*/  && _x>-__ref->__msidewidth /*int*/ ) { 
B4IRDebugUtils.currentLine=19202054;
 //BA.debugLineNum = 19202054;BA.debugLine="p.SetShadow(xui.Color_Black, 2, 0, 0.5, True)";
[_p SetShadow:[__ref->__xui /*B4IXUI**/  Color_Black] :(float) (2) :(float) (0) :(float) (0.5) :true];
 }else if(_x==-__ref->__msidewidth /*int*/ ) { 
B4IRDebugUtils.currentLine=19202056;
 //BA.debugLineNum = 19202056;BA.debugLine="p.SetShadow(0, 0, 0, 0, True)";
[_p SetShadow:(int) (0) :(float) (0) :(float) (0) :(float) (0) :true];
 };
B4IRDebugUtils.currentLine=19202059;
 //BA.debugLineNum = 19202059;BA.debugLine="If CurrentlyTouching = False Then";
if (_currentlytouching==false) { 
B4IRDebugUtils.currentLine=19202060;
 //BA.debugLineNum = 19202060;BA.debugLine="If (IsOpen And VisibleOffset < 0.8 * mSideWidth)";
if ((__ref->__isopen /*BOOL*/  && _visibleoffset<0.8*__ref->__msidewidth /*int*/ ) || (__ref->__isopen /*BOOL*/ ==false && _visibleoffset<0.2*__ref->__msidewidth /*int*/ )) { 
B4IRDebugUtils.currentLine=19202061;
 //BA.debugLineNum = 19202061;BA.debugLine="x = -mSideWidth";
_x = (float) (-__ref->__msidewidth /*int*/ );
B4IRDebugUtils.currentLine=19202062;
 //BA.debugLineNum = 19202062;BA.debugLine="IsOpen = False";
__ref->__isopen /*BOOL*/  = false;
 }else {
B4IRDebugUtils.currentLine=19202064;
 //BA.debugLineNum = 19202064;BA.debugLine="x = 0";
_x = (float) (0);
B4IRDebugUtils.currentLine=19202065;
 //BA.debugLineNum = 19202065;BA.debugLine="IsOpen = True";
__ref->__isopen /*BOOL*/  = true;
 };
B4IRDebugUtils.currentLine=19202067;
 //BA.debugLineNum = 19202067;BA.debugLine="Dim dx As Int = Abs(mLeftPanel.Left - x)";
_dx = (int) (fabs([__ref->__mleftpanel /*B4XViewWrapper**/  Left]-_x));
B4IRDebugUtils.currentLine=19202068;
 //BA.debugLineNum = 19202068;BA.debugLine="Dim duration As Int = Max(0, 200 * dx / mSideWid";
_duration = (int) (fmax(0,200*_dx/(double)__ref->__msidewidth /*int*/ ));
B4IRDebugUtils.currentLine=19202069;
 //BA.debugLineNum = 19202069;BA.debugLine="If NoAnimation Then duration = 0";
if (_noanimation) { 
_duration = (int) (0);};
B4IRDebugUtils.currentLine=19202070;
 //BA.debugLineNum = 19202070;BA.debugLine="mLeftPanel.SetLayoutAnimated(duration, x, 0, mLe";
[__ref->__mleftpanel /*B4XViewWrapper**/  SetLayoutAnimated:_duration :_x :(float) (0) :[__ref->__mleftpanel /*B4XViewWrapper**/  Width] :[__ref->__mleftpanel /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=19202071;
 //BA.debugLineNum = 19202071;BA.debugLine="mDarkPanel.SetColorAnimated(duration, mDarkPanel";
[__ref->__mdarkpanel /*B4XViewWrapper**/  SetColorAnimated:_duration :[__ref->__mdarkpanel /*B4XViewWrapper**/  Color] :[__ref _offsettocolor /*int*/ :nil :(int) (_x)]];
B4IRDebugUtils.currentLine=19202073;
 //BA.debugLineNum = 19202073;BA.debugLine="Dim p As Panel = mDarkPanel";
_p = [B4IPanelWrapper new];
_p.object = (B4IPanelView*)((__ref->__mdarkpanel /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=19202074;
 //BA.debugLineNum = 19202074;BA.debugLine="p.UserInteractionEnabled = IsOpen";
[_p setUserInteractionEnabled:__ref->__isopen /*BOOL*/ ];
B4IRDebugUtils.currentLine=19202075;
 //BA.debugLineNum = 19202075;BA.debugLine="p = getLeftPanel";
_p.object = (B4IPanelView*)(([__ref _getleftpanel /*B4XViewWrapper**/ :nil]).object);
 }else {
B4IRDebugUtils.currentLine=19202079;
 //BA.debugLineNum = 19202079;BA.debugLine="mDarkPanel.Color = OffsetToColor(x)";
[__ref->__mdarkpanel /*B4XViewWrapper**/  setColor:[__ref _offsettocolor /*int*/ :nil :(int) (_x)]];
B4IRDebugUtils.currentLine=19202080;
 //BA.debugLineNum = 19202080;BA.debugLine="mLeftPanel.Left = x";
[__ref->__mleftpanel /*B4XViewWrapper**/  setLeft:_x];
 };
B4IRDebugUtils.currentLine=19202083;
 //BA.debugLineNum = 19202083;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _getleftpanel:(b4i_b4xdrawer*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"getleftpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getleftpanel" :nil]);}
B4IRDebugUtils.currentLine=19464192;
 //BA.debugLineNum = 19464192;BA.debugLine="Public Sub getLeftPanel As B4XView";
B4IRDebugUtils.currentLine=19464193;
 //BA.debugLineNum = 19464193;BA.debugLine="Return mLeftPanel";
if (true) return __ref->__mleftpanel /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=19464194;
 //BA.debugLineNum = 19464194;BA.debugLine="End Sub";
return nil;
}
- (int)  _offsettocolor:(b4i_b4xdrawer*) __ref :(int) _x{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"offsettocolor"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"offsettocolor:" :@[@(_x)]]).intValue;}
float _visible = 0.0f;
B4IRDebugUtils.currentLine=19267584;
 //BA.debugLineNum = 19267584;BA.debugLine="Private Sub OffsetToColor (x As Int) As Int";
B4IRDebugUtils.currentLine=19267585;
 //BA.debugLineNum = 19267585;BA.debugLine="Dim Visible As Float = (mSideWidth + x) / mSideWi";
_visible = (float) ((__ref->__msidewidth /*int*/ +_x)/(double)__ref->__msidewidth /*int*/ );
B4IRDebugUtils.currentLine=19267586;
 //BA.debugLineNum = 19267586;BA.debugLine="Return xui.Color_ARGB(100 * Visible, 0, 0, 0)";
if (true) return [__ref->__xui /*B4IXUI**/  Color_ARGB:(int) (100*_visible) :(int) (0) :(int) (0) :(int) (0)];
B4IRDebugUtils.currentLine=19267587;
 //BA.debugLineNum = 19267587;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _class_globals:(b4i_b4xdrawer*) __ref{
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
B4IRDebugUtils.currentModule=@"b4xdrawer";
B4IRDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Private mSideWidth As Int";
self->__msidewidth = 0;
B4IRDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="Private mLeftPanel As B4XView";
self->__mleftpanel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=18808838;
 //BA.debugLineNum = 18808838;BA.debugLine="Private mDarkPanel As B4XView";
self->__mdarkpanel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=18808839;
 //BA.debugLineNum = 18808839;BA.debugLine="Private mBasePanel As B4XView";
self->__mbasepanel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=18808840;
 //BA.debugLineNum = 18808840;BA.debugLine="Private mCenterPanel As B4XView";
self->__mcenterpanel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=18808841;
 //BA.debugLineNum = 18808841;BA.debugLine="Private ExtraWidth As Int = 50dip";
self->__extrawidth = ((int) (50));
B4IRDebugUtils.currentLine=18808842;
 //BA.debugLineNum = 18808842;BA.debugLine="Private TouchXStart, TouchYStart As Float 'ignore";
self->__touchxstart = 0.0f;
self->__touchystart = 0.0f;
B4IRDebugUtils.currentLine=18808843;
 //BA.debugLineNum = 18808843;BA.debugLine="Private IsOpen As Boolean";
self->__isopen = false;
B4IRDebugUtils.currentLine=18808844;
 //BA.debugLineNum = 18808844;BA.debugLine="Private HandlingSwipe As Boolean";
self->__handlingswipe = false;
B4IRDebugUtils.currentLine=18808845;
 //BA.debugLineNum = 18808845;BA.debugLine="Private StartAtScrim As Boolean 'ignore";
self->__startatscrim = false;
B4IRDebugUtils.currentLine=18808846;
 //BA.debugLineNum = 18808846;BA.debugLine="Private mEnabled As Boolean = True";
self->__menabled = true;
B4IRDebugUtils.currentLine=18808847;
 //BA.debugLineNum = 18808847;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _dark_touch:(b4i_b4xdrawer*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"dark_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dark_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub Dark_Touch(Action As Int, X As Float,";
B4IRDebugUtils.currentLine=19136513;
 //BA.debugLineNum = 19136513;BA.debugLine="If HandlingSwipe = False And Action = mDarkPanel.";
if (__ref->__handlingswipe /*BOOL*/ ==false && _action==[__ref->__mdarkpanel /*B4XViewWrapper**/  TOUCH_ACTION_UP]) { 
B4IRDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="setLeftOpen(False)";
[__ref _setleftopen /*NSString**/ :nil :false];
 };
B4IRDebugUtils.currentLine=19136516;
 //BA.debugLineNum = 19136516;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setleftopen:(b4i_b4xdrawer*) __ref :(BOOL) _b{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"setleftopen"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setleftopen:" :@[@(_b)]]);}
float _x = 0.0f;
B4IRDebugUtils.currentLine=19398656;
 //BA.debugLineNum = 19398656;BA.debugLine="Public Sub setLeftOpen (b As Boolean)";
B4IRDebugUtils.currentLine=19398657;
 //BA.debugLineNum = 19398657;BA.debugLine="If b = IsOpen Then Return";
if (_b==__ref->__isopen /*BOOL*/ ) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=19398658;
 //BA.debugLineNum = 19398658;BA.debugLine="Dim x As Float";
_x = 0.0f;
B4IRDebugUtils.currentLine=19398659;
 //BA.debugLineNum = 19398659;BA.debugLine="If b Then x = 0 Else x = -mSideWidth";
if (_b) { 
_x = (float) (0);}
else {
_x = (float) (-__ref->__msidewidth /*int*/ );};
B4IRDebugUtils.currentLine=19398660;
 //BA.debugLineNum = 19398660;BA.debugLine="ChangeOffset(x, False, False)";
[__ref _changeoffset /*NSString**/ :nil :_x :false :false];
B4IRDebugUtils.currentLine=19398661;
 //BA.debugLineNum = 19398661;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _getcenterpanel:(b4i_b4xdrawer*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"getcenterpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getcenterpanel" :nil]);}
B4IRDebugUtils.currentLine=19529728;
 //BA.debugLineNum = 19529728;BA.debugLine="Public Sub getCenterPanel As B4XView";
B4IRDebugUtils.currentLine=19529729;
 //BA.debugLineNum = 19529729;BA.debugLine="Return mCenterPanel";
if (true) return __ref->__mcenterpanel /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=19529730;
 //BA.debugLineNum = 19529730;BA.debugLine="End Sub";
return nil;
}
- (BOOL)  _getgestureenabled:(b4i_b4xdrawer*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"getgestureenabled"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getgestureenabled" :nil]).boolValue;}
B4IRDebugUtils.currentLine=19660800;
 //BA.debugLineNum = 19660800;BA.debugLine="Public Sub getGestureEnabled As Boolean";
B4IRDebugUtils.currentLine=19660801;
 //BA.debugLineNum = 19660801;BA.debugLine="Return mEnabled";
if (true) return __ref->__menabled /*BOOL*/ ;
B4IRDebugUtils.currentLine=19660802;
 //BA.debugLineNum = 19660802;BA.debugLine="End Sub";
return false;
}
- (BOOL)  _getleftopen:(b4i_b4xdrawer*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"getleftopen"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getleftopen" :nil]).boolValue;}
B4IRDebugUtils.currentLine=19333120;
 //BA.debugLineNum = 19333120;BA.debugLine="Public Sub getLeftOpen As Boolean";
B4IRDebugUtils.currentLine=19333121;
 //BA.debugLineNum = 19333121;BA.debugLine="Return IsOpen";
if (true) return __ref->__isopen /*BOOL*/ ;
B4IRDebugUtils.currentLine=19333122;
 //BA.debugLineNum = 19333122;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _initialize:(b4i_b4xdrawer*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname :(B4XViewWrapper*) _parent :(int) _sidewidth{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname],[B4I nilToNSNull:_parent],@(_sidewidth)]]);}
B4INativeObject* _nme = nil;
B4INativeObject* _no = nil;
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="mSideWidth = SideWidth";
__ref->__msidewidth /*int*/  = _sidewidth;
B4IRDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="mBasePanel = xui.CreatePanel(\"\")";
__ref->__mbasepanel /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=18874377;
 //BA.debugLineNum = 18874377;BA.debugLine="Dim nme As NativeObject = Me";
_nme = [B4INativeObject new];
_nme.object = (NSObject*)(self);
B4IRDebugUtils.currentLine=18874378;
 //BA.debugLineNum = 18874378;BA.debugLine="Dim no As NativeObject = mBasePanel";
_no = [B4INativeObject new];
_no.object = (NSObject*)((__ref->__mbasepanel /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=18874379;
 //BA.debugLineNum = 18874379;BA.debugLine="no.RunMethod(\"addGestureRecognizer:\", Array(nme.R";
[_no RunMethod:@"addGestureRecognizer:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(([_nme RunMethod:@"CreateRecognizer" :(B4IArray*)(nil)]).object)]]]];
B4IRDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="Parent.AddView(mBasePanel, 0, 0, Parent.Width, Pa";
[_parent AddView:(UIView*)((__ref->__mbasepanel /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[_parent Width] :[_parent Height]];
B4IRDebugUtils.currentLine=18874382;
 //BA.debugLineNum = 18874382;BA.debugLine="mCenterPanel = xui.CreatePanel(\"\")";
__ref->__mcenterpanel /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=18874383;
 //BA.debugLineNum = 18874383;BA.debugLine="mBasePanel.AddView(mCenterPanel, 0, 0, mBasePanel";
[__ref->__mbasepanel /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mcenterpanel /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbasepanel /*B4XViewWrapper**/  Width] :[__ref->__mbasepanel /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=18874384;
 //BA.debugLineNum = 18874384;BA.debugLine="mDarkPanel = xui.CreatePanel(\"dark\")";
__ref->__mdarkpanel /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"dark"];
B4IRDebugUtils.currentLine=18874385;
 //BA.debugLineNum = 18874385;BA.debugLine="mBasePanel.AddView(mDarkPanel, 0, 0, mBasePanel.W";
[__ref->__mbasepanel /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mdarkpanel /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbasepanel /*B4XViewWrapper**/  Width] :[__ref->__mbasepanel /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=18874386;
 //BA.debugLineNum = 18874386;BA.debugLine="mLeftPanel = xui.CreatePanel(\"LeftPanel\")";
__ref->__mleftpanel /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"LeftPanel"];
B4IRDebugUtils.currentLine=18874387;
 //BA.debugLineNum = 18874387;BA.debugLine="mBasePanel.AddView(mLeftPanel, -SideWidth, 0, Sid";
[__ref->__mbasepanel /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mleftpanel /*B4XViewWrapper**/ ).object) :(float) (-_sidewidth) :(float) (0) :(float) (_sidewidth) :[__ref->__mbasepanel /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=18874388;
 //BA.debugLineNum = 18874388;BA.debugLine="mLeftPanel.Color = xui.Color_Red";
[__ref->__mleftpanel /*B4XViewWrapper**/  setColor:[__ref->__xui /*B4IXUI**/  Color_Red]];
B4IRDebugUtils.currentLine=18874393;
 //BA.debugLineNum = 18874393;BA.debugLine="Dim p As Panel = mDarkPanel";
_p = [B4IPanelWrapper new];
_p.object = (B4IPanelView*)((__ref->__mdarkpanel /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=18874394;
 //BA.debugLineNum = 18874394;BA.debugLine="p.UserInteractionEnabled = False";
[_p setUserInteractionEnabled:false];
B4IRDebugUtils.currentLine=18874395;
 //BA.debugLineNum = 18874395;BA.debugLine="p.SetBorder(0, 0, 0)";
[_p SetBorder:(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=18874396;
 //BA.debugLineNum = 18874396;BA.debugLine="p = mLeftPanel";
_p.object = (B4IPanelView*)((__ref->__mleftpanel /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=18874398;
 //BA.debugLineNum = 18874398;BA.debugLine="p = mCenterPanel";
_p.object = (B4IPanelView*)((__ref->__mcenterpanel /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=18874399;
 //BA.debugLineNum = 18874399;BA.debugLine="p.SetBorder(0, 0, 0)";
[_p SetBorder:(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=18874400;
 //BA.debugLineNum = 18874400;BA.debugLine="p = mBasePanel";
_p.object = (B4IPanelView*)((__ref->__mbasepanel /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=18874401;
 //BA.debugLineNum = 18874401;BA.debugLine="p.SetBorder(0, 0, 0)";
[_p SetBorder:(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=18874403;
 //BA.debugLineNum = 18874403;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _leftpanel_click:(b4i_b4xdrawer*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"leftpanel_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"leftpanel_click" :nil]);}
B4IRDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Private Sub LeftPanel_Click";
B4IRDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pan_event:(b4i_b4xdrawer*) __ref :(NSObject*) _pan{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"pan_event"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pan_event:" :@[[B4I nilToNSNull:_pan]]]);}
B4INativeObject* _rec = nil;
B4IArray* _points = nil;
float _x = 0.0f;
int _state = 0;
int _leftpanelrightside = 0;
float _dx = 0.0f;
B4IRDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Private Sub Pan_Event (pan As Object)";
B4IRDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Dim rec As NativeObject = pan";
_rec = [B4INativeObject new];
_rec.object = (NSObject*)(_pan);
B4IRDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="Dim points() As Float = rec.ArrayFromPoint(rec.Ru";
_points = [_rec ArrayFromPoint:(NSData*)(([_rec RunMethod:@"locationInView:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((__ref->__mbasepanel /*B4XViewWrapper**/ ).object)]]]]).object)];
B4IRDebugUtils.currentLine=19005443;
 //BA.debugLineNum = 19005443;BA.debugLine="Dim x As Float = points(0)";
_x = ((NSNumber*)[_points getObjectFastN:(int) (0)]).floatValue;
B4IRDebugUtils.currentLine=19005444;
 //BA.debugLineNum = 19005444;BA.debugLine="Dim state As Int = rec.GetField(\"state\").AsNumber";
_state = [self.bi ObjectToNumber:[[_rec GetField:@"state"] AsNumber]].intValue;
B4IRDebugUtils.currentLine=19005445;
 //BA.debugLineNum = 19005445;BA.debugLine="Dim LeftPanelRightSide As Int = mLeftPanel.Left +";
_leftpanelrightside = (int) ([__ref->__mleftpanel /*B4XViewWrapper**/  Left]+[__ref->__mleftpanel /*B4XViewWrapper**/  Width]);
B4IRDebugUtils.currentLine=19005446;
 //BA.debugLineNum = 19005446;BA.debugLine="Select state";
switch (_state) {
case 1: {
B4IRDebugUtils.currentLine=19005448;
 //BA.debugLineNum = 19005448;BA.debugLine="If mEnabled = False Then";
if (__ref->__menabled /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=19005449;
 //BA.debugLineNum = 19005449;BA.debugLine="CancelGesture(rec)";
[__ref _cancelgesture /*NSString**/ :nil :_rec];
B4IRDebugUtils.currentLine=19005450;
 //BA.debugLineNum = 19005450;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=19005452;
 //BA.debugLineNum = 19005452;BA.debugLine="If x > LeftPanelRightSide Then";
if (_x>_leftpanelrightside) { 
B4IRDebugUtils.currentLine=19005453;
 //BA.debugLineNum = 19005453;BA.debugLine="If IsOpen = False And x > LeftPanelRightSide +";
if (__ref->__isopen /*BOOL*/ ==false && _x>_leftpanelrightside+__ref->__extrawidth /*int*/ ) { 
B4IRDebugUtils.currentLine=19005454;
 //BA.debugLineNum = 19005454;BA.debugLine="CancelGesture(rec)";
[__ref _cancelgesture /*NSString**/ :nil :_rec];
B4IRDebugUtils.currentLine=19005455;
 //BA.debugLineNum = 19005455;BA.debugLine="HandlingSwipe = False";
__ref->__handlingswipe /*BOOL*/  = false;
B4IRDebugUtils.currentLine=19005456;
 //BA.debugLineNum = 19005456;BA.debugLine="Return";
if (true) return @"";
 };
 };
B4IRDebugUtils.currentLine=19005459;
 //BA.debugLineNum = 19005459;BA.debugLine="StartAtScrim = x > LeftPanelRightSide";
__ref->__startatscrim /*BOOL*/  = _x>_leftpanelrightside;
B4IRDebugUtils.currentLine=19005460;
 //BA.debugLineNum = 19005460;BA.debugLine="HandlingSwipe = True";
__ref->__handlingswipe /*BOOL*/  = true;
B4IRDebugUtils.currentLine=19005461;
 //BA.debugLineNum = 19005461;BA.debugLine="TouchXStart = x";
__ref->__touchxstart /*float*/  = _x;
 break; }
case 2: {
B4IRDebugUtils.currentLine=19005463;
 //BA.debugLineNum = 19005463;BA.debugLine="If mLeftPanel.Left < 0 Or x <= LeftPanelRightSi";
if ([__ref->__mleftpanel /*B4XViewWrapper**/  Left]<0 || _x<=_leftpanelrightside) { 
B4IRDebugUtils.currentLine=19005464;
 //BA.debugLineNum = 19005464;BA.debugLine="Dim dx As Float = x - TouchXStart";
_dx = (float) (_x-__ref->__touchxstart /*float*/ );
B4IRDebugUtils.currentLine=19005465;
 //BA.debugLineNum = 19005465;BA.debugLine="ChangeOffset(mLeftPanel.Left + dx, True, False";
[__ref _changeoffset /*NSString**/ :nil :(float) ([__ref->__mleftpanel /*B4XViewWrapper**/  Left]+_dx) :true :false];
B4IRDebugUtils.currentLine=19005466;
 //BA.debugLineNum = 19005466;BA.debugLine="StartAtScrim = False";
__ref->__startatscrim /*BOOL*/  = false;
 };
B4IRDebugUtils.currentLine=19005468;
 //BA.debugLineNum = 19005468;BA.debugLine="TouchXStart = X";
__ref->__touchxstart /*float*/  = _x;
 break; }
case 3: {
B4IRDebugUtils.currentLine=19005470;
 //BA.debugLineNum = 19005470;BA.debugLine="HandlingSwipe = False";
__ref->__handlingswipe /*BOOL*/  = false;
B4IRDebugUtils.currentLine=19005471;
 //BA.debugLineNum = 19005471;BA.debugLine="If IsOpen And StartAtScrim And x > LeftPanelRig";
if (__ref->__isopen /*BOOL*/  && __ref->__startatscrim /*BOOL*/  && _x>_leftpanelrightside) { 
B4IRDebugUtils.currentLine=19005472;
 //BA.debugLineNum = 19005472;BA.debugLine="setLeftOpen(False)";
[__ref _setleftopen /*NSString**/ :nil :false];
 }else {
B4IRDebugUtils.currentLine=19005474;
 //BA.debugLineNum = 19005474;BA.debugLine="ChangeOffset(mLeftPanel.Left, False, False)";
[__ref _changeoffset /*NSString**/ :nil :[__ref->__mleftpanel /*B4XViewWrapper**/  Left] :false :false];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=19005477;
 //BA.debugLineNum = 19005477;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resize:(b4i_b4xdrawer*) __ref :(int) _width :(int) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=19595264;
 //BA.debugLineNum = 19595264;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
B4IRDebugUtils.currentLine=19595265;
 //BA.debugLineNum = 19595265;BA.debugLine="If IsOpen Then ChangeOffset(-mSideWidth, False, T";
if (__ref->__isopen /*BOOL*/ ) { 
[__ref _changeoffset /*NSString**/ :nil :(float) (-__ref->__msidewidth /*int*/ ) :false :true];};
B4IRDebugUtils.currentLine=19595266;
 //BA.debugLineNum = 19595266;BA.debugLine="mBasePanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__mbasepanel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=19595267;
 //BA.debugLineNum = 19595267;BA.debugLine="mLeftPanel.SetLayoutAnimated(0, mLeftPanel.Left,";
[__ref->__mleftpanel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :[__ref->__mleftpanel /*B4XViewWrapper**/  Left] :(float) (0) :[__ref->__mleftpanel /*B4XViewWrapper**/  Width] :[__ref->__mbasepanel /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=19595268;
 //BA.debugLineNum = 19595268;BA.debugLine="mDarkPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__mdarkpanel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=19595269;
 //BA.debugLineNum = 19595269;BA.debugLine="mCenterPanel.SetLayoutAnimated(0, 0, 0, Width, He";
[__ref->__mcenterpanel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=19595270;
 //BA.debugLineNum = 19595270;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setgestureenabled:(b4i_b4xdrawer*) __ref :(BOOL) _b{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdrawer";
if ([B4IDebug shouldDelegate: @"setgestureenabled"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setgestureenabled:" :@[@(_b)]]);}
B4IRDebugUtils.currentLine=19726336;
 //BA.debugLineNum = 19726336;BA.debugLine="Public Sub setGestureEnabled (b As Boolean)";
B4IRDebugUtils.currentLine=19726337;
 //BA.debugLineNum = 19726337;BA.debugLine="mEnabled = b";
__ref->__menabled /*BOOL*/  = _b;
B4IRDebugUtils.currentLine=19726338;
 //BA.debugLineNum = 19726338;BA.debugLine="End Sub";
return @"";
}
- (NSObject*) CreateRecognizer{
 	 UIPanGestureRecognizer *rec = [[UIPanGestureRecognizer alloc] initWithTarget:self action:@selector(action:)];
    [rec setMinimumNumberOfTouches:1];
    [rec setMaximumNumberOfTouches:1];
	return rec;
}
-(void) action:(UIPanGestureRecognizer*)rec {
	[self.bi raiseEvent:nil event:@"pan_event:" params:@[rec]];
}
@end