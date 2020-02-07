
#import "b4i_b4xbreadcrumb.h"
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
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"


@implementation b4i_b4xbreadcrumb 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xbreadcrumb) instance released.");
}

- (NSString*)  _base_resize:(b4i_b4xbreadcrumb*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="cvs.Resize(Width, Height)";
[__ref->__cvs /*B4XCanvas**/  Resize:(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="TouchPanel.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__touchpanel /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw:(b4i_b4xbreadcrumb*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"draw"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw" :nil]);}
_argbcolor* _bcolor = nil;
int _strokecolor = 0;
B4IArray* _clrs = nil;
int _left = 0;
int _i = 0;
int _sc = 0;
int _width = 0;
B4IRDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Private Sub Draw";
B4IRDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
[__ref->__cvs /*B4XCanvas**/  ClearRect:[__ref->__cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="Dim bcolor As ARGBColor";
_bcolor = [_argbcolor new];
B4IRDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
[__ref->__bc /*b4i_bitmapcreator**/  _colortoargb:__ref->__crumbcolor /*int*/  :_bcolor];
B4IRDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="bcolor.r = Min(255, bcolor.r * 2)";
_bcolor->_r = (int) (fmin(255,_bcolor->_r*2));
B4IRDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="bcolor.g = Min(255, bcolor.g * 2)";
_bcolor->_g = (int) (fmin(255,_bcolor->_g*2));
B4IRDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="bcolor.b = Min(255, bcolor.b * 2)";
_bcolor->_b = (int) (fmin(255,_bcolor->_b*2));
B4IRDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="Dim strokeColor As Int = bc.ARGBToColor(bcolor)";
_strokecolor = [__ref->__bc /*b4i_bitmapcreator**/  _argbtocolor:_bcolor];
B4IRDebugUtils.currentLine=9830409;
 //BA.debugLineNum = 9830409;BA.debugLine="bc.ColorToARGB(CrumbColor, bcolor)";
[__ref->__bc /*b4i_bitmapcreator**/  _colortoargb:__ref->__crumbcolor /*int*/  :_bcolor];
B4IRDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="bcolor.r = bcolor.r * 0.8";
_bcolor->_r = (int) (_bcolor->_r*0.8);
B4IRDebugUtils.currentLine=9830411;
 //BA.debugLineNum = 9830411;BA.debugLine="bcolor.g = bcolor.g * 0.8";
_bcolor->_g = (int) (_bcolor->_g*0.8);
B4IRDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="bcolor.b = bcolor.b * 0.8";
_bcolor->_b = (int) (_bcolor->_b*0.8);
B4IRDebugUtils.currentLine=9830413;
 //BA.debugLineNum = 9830413;BA.debugLine="Dim Clrs() As Int = Array As Int(CrumbColor, bc.A";
_clrs = [[B4IArray alloc]initObjectsWithData:@[@(__ref->__crumbcolor /*int*/ ),@([__ref->__bc /*b4i_bitmapcreator**/  _argbtocolor:_bcolor])]];
B4IRDebugUtils.currentLine=9830415;
 //BA.debugLineNum = 9830415;BA.debugLine="RightPositions.Clear";
[__ref->__rightpositions /*B4IList**/  Clear];
B4IRDebugUtils.currentLine=9830416;
 //BA.debugLineNum = 9830416;BA.debugLine="If mItems.Size = 0 Then Return";
if ([__ref->__mitems /*B4IList**/  Size]==0) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=9830417;
 //BA.debugLineNum = 9830417;BA.debugLine="Dim Left As Int = 0";
_left = (int) (0);
B4IRDebugUtils.currentLine=9830418;
 //BA.debugLineNum = 9830418;BA.debugLine="For i = 0 To mItems.Size - 1";
{
const int step16 = 1;
const int limit16 = (int) ([__ref->__mitems /*B4IList**/  Size]-1);
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
B4IRDebugUtils.currentLine=9830419;
 //BA.debugLineNum = 9830419;BA.debugLine="Dim sc As Int";
_sc = 0;
B4IRDebugUtils.currentLine=9830420;
 //BA.debugLineNum = 9830420;BA.debugLine="If PressedItem = i Then sc = strokeColor Else sc";
if (__ref->__presseditem /*int*/ ==_i) { 
_sc = _strokecolor;}
else {
_sc = (int) (0);};
B4IRDebugUtils.currentLine=9830421;
 //BA.debugLineNum = 9830421;BA.debugLine="Dim width As Int = DrawItem(Left, mItems.Get(i),";
_width = [__ref _drawitem /*int*/ :nil :_left :[self.bi ObjectToString:[__ref->__mitems /*B4IList**/  Get:_i]] :_i==0 :_i==[__ref->__mitems /*B4IList**/  Size]-1 :((NSNumber*)[_clrs getObjectFastN:(int) (_i%_clrs.Length)]).intValue :_sc];
B4IRDebugUtils.currentLine=9830422;
 //BA.debugLineNum = 9830422;BA.debugLine="Left = Left + width + offset + 2dip";
_left = (int) (_left+_width+__ref->__offset /*int*/ +((int) (2)));
B4IRDebugUtils.currentLine=9830423;
 //BA.debugLineNum = 9830423;BA.debugLine="RightPositions.Add(Left)";
[__ref->__rightpositions /*B4IList**/  Add:(NSObject*)(@(_left))];
 }
};
B4IRDebugUtils.currentLine=9830425;
 //BA.debugLineNum = 9830425;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=9830426;
 //BA.debugLineNum = 9830426;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xbreadcrumb*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
B4IRDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Private mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="Private mItems As List";
self->__mitems = [B4IList new];
B4IRDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="Private RightPositions As List";
self->__rightpositions = [B4IList new];
B4IRDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="Public TextColor As Int";
self->__textcolor = 0;
B4IRDebugUtils.currentLine=9568265;
 //BA.debugLineNum = 9568265;BA.debugLine="Public fnt As B4XFont";
self->__fnt = [B4XFont new];
B4IRDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="Private offset As Int = 10dip";
self->__offset = ((int) (10));
B4IRDebugUtils.currentLine=9568267;
 //BA.debugLineNum = 9568267;BA.debugLine="Private bc As BitmapCreator";
self->__bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=9568268;
 //BA.debugLineNum = 9568268;BA.debugLine="Public CrumbColor As Int";
self->__crumbcolor = 0;
B4IRDebugUtils.currentLine=9568269;
 //BA.debugLineNum = 9568269;BA.debugLine="Private TouchPanel As B4XView";
self->__touchpanel = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=9568270;
 //BA.debugLineNum = 9568270;BA.debugLine="Private PressedItem As Int = -1";
self->__presseditem = (int) (-1);
B4IRDebugUtils.currentLine=9568271;
 //BA.debugLineNum = 9568271;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xbreadcrumb*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _xlbl = nil;
NSString* _items = @"";
NSString* _s = @"";
B4IRDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="cvs.Initialize(mBase)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Dim xlbl As B4XView = Lbl";
_xlbl = [B4XViewWrapper new];
_xlbl.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="fnt = xlbl.Font";
__ref->__fnt /*B4XFont**/  = [_xlbl Font];
B4IRDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="TextColor = xlbl.TextColor";
__ref->__textcolor /*int*/  = [_xlbl TextColor];
B4IRDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="CrumbColor = xui.PaintOrColorToColor(Props.Get(\"C";
__ref->__crumbcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"CrumbColor")]];
B4IRDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="TouchPanel = xui.CreatePanel(\"Touch\")";
__ref->__touchpanel /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"Touch"];
B4IRDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="mBase.AddView(TouchPanel, 0, 0, mBase.Width, mBas";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__touchpanel /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="Dim items As String = Props.Get(\"Items\")";
_items = [self.bi ObjectToString:[_props Get:(NSObject*)(@"Items")]];
B4IRDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="For Each s As String In Regex.Split(\"\\|\", items)";
{
const id<B4IIterable> group10 = [[self->___c Regex] Split:@"\\|" :_items];
const int groupLen10 = group10.Size
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_s = [group10 Get:index10];
B4IRDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="mItems.Add(s)";
[__ref->__mitems /*B4IList**/  Add:(NSObject*)(_s)];
 }
};
B4IRDebugUtils.currentLine=9699341;
 //BA.debugLineNum = 9699341;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="End Sub";
return @"";
}
- (int)  _drawitem:(b4i_b4xbreadcrumb*) __ref :(int) _left :(NSString*) _text :(BOOL) _first :(BOOL) _last :(int) _clr :(int) _strokecolor{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"drawitem"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"drawitem::::::" :@[@(_left),[B4I nilToNSNull:_text],@(_first),@(_last),@(_clr),@(_strokecolor)]]).intValue;}
B4XRect* _r = nil;
int _itemwidth = 0;
int _itemheight = 0;
int _baseline = 0;
B4XPath* _p = nil;
B4IRDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Private Sub DrawItem(Left As Int, Text As String,";
B4IRDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim r As B4XRect = cvs.MeasureText(Text, fnt)";
_r = [B4XRect new];
_r = [__ref->__cvs /*B4XCanvas**/  MeasureText:_text :__ref->__fnt /*B4XFont**/ ];
B4IRDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim ItemWidth As Int = r.Width + 30dip";
_itemwidth = (int) ([_r Width]+((int) (30)));
B4IRDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Dim ItemHeight As Int = cvs.TargetRect.Height";
_itemheight = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Height]);
B4IRDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="Dim BaseLine As Int = cvs.TargetRect.CenterY - r.";
_baseline = (int) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] CenterY]-[_r Height]/(double)2-[_r Top]);
B4IRDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Dim p As B4XPath";
_p = [B4XPath new];
B4IRDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="p.Initialize(Left, 0)";
[_p Initialize:(float) (_left) :(float) (0)];
B4IRDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="p.LineTo(Left + ItemWidth, 0)";
[_p LineTo:(float) (_left+_itemwidth) :(float) (0)];
B4IRDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="If Last = False Then";
if (_last==false) { 
B4IRDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="p.LineTo(Left + ItemWidth + offset, ItemHeight /";
[_p LineTo:(float) (_left+_itemwidth+__ref->__offset /*int*/ ) :(float) (_itemheight/(double)2)];
 };
B4IRDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="p.LineTo(Left + ItemWidth, ItemHeight)";
[_p LineTo:(float) (_left+_itemwidth) :(float) (_itemheight)];
B4IRDebugUtils.currentLine=9895948;
 //BA.debugLineNum = 9895948;BA.debugLine="If First = False Then";
if (_first==false) { 
B4IRDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="p.LineTo(Left - offset, ItemHeight)";
[_p LineTo:(float) (_left-__ref->__offset /*int*/ ) :(float) (_itemheight)];
B4IRDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="p.LineTo(Left, ItemHeight / 2)";
[_p LineTo:(float) (_left) :(float) (_itemheight/(double)2)];
B4IRDebugUtils.currentLine=9895951;
 //BA.debugLineNum = 9895951;BA.debugLine="p.LineTo(Left - offset, 0)";
[_p LineTo:(float) (_left-__ref->__offset /*int*/ ) :(float) (0)];
 }else {
B4IRDebugUtils.currentLine=9895953;
 //BA.debugLineNum = 9895953;BA.debugLine="p.LineTo(Left, ItemHeight)";
[_p LineTo:(float) (_left) :(float) (_itemheight)];
 };
B4IRDebugUtils.currentLine=9895955;
 //BA.debugLineNum = 9895955;BA.debugLine="p.LineTo(Left, 0)";
[_p LineTo:(float) (_left) :(float) (0)];
B4IRDebugUtils.currentLine=9895956;
 //BA.debugLineNum = 9895956;BA.debugLine="cvs.DrawPath(p, clr, True, 0)";
[__ref->__cvs /*B4XCanvas**/  DrawPath:_p :_clr :true :(float) (0)];
B4IRDebugUtils.currentLine=9895957;
 //BA.debugLineNum = 9895957;BA.debugLine="If strokeColor <> 0 Then";
if (_strokecolor!=0) { 
B4IRDebugUtils.currentLine=9895958;
 //BA.debugLineNum = 9895958;BA.debugLine="cvs.DrawPath(p, strokeColor, False, 3dip)";
[__ref->__cvs /*B4XCanvas**/  DrawPath:_p :_strokecolor :false :(float) (((int) (3)))];
 };
B4IRDebugUtils.currentLine=9895961;
 //BA.debugLineNum = 9895961;BA.debugLine="cvs.DrawText(Text, Left + ItemWidth / 2, BaseLine";
[__ref->__cvs /*B4XCanvas**/  DrawText:_text :(float) (_left+_itemwidth/(double)2) :(float) (_baseline) :__ref->__fnt /*B4XFont**/  :__ref->__textcolor /*int*/  :@"CENTER"];
B4IRDebugUtils.currentLine=9895962;
 //BA.debugLineNum = 9895962;BA.debugLine="Return ItemWidth";
if (true) return _itemwidth;
B4IRDebugUtils.currentLine=9895963;
 //BA.debugLineNum = 9895963;BA.debugLine="End Sub";
return 0;
}
- (int)  _finditem:(b4i_b4xbreadcrumb*) __ref :(int) _x :(int) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"finditem"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"finditem::" :@[@(_x),@(_y)]]).intValue;}
int _r = 0;
int _i = 0;
B4IRDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Private Sub FindItem (x As Int, y As Int) As Int";
B4IRDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="If RightPositions.Size = 0 Then Return -1";
if ([__ref->__rightpositions /*B4IList**/  Size]==0) { 
if (true) return (int) (-1);};
B4IRDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="If y < 0 Or y > cvs.TargetRect.Height Then Return";
if (_y<0 || _y>[[__ref->__cvs /*B4XCanvas**/  TargetRect] Height]) { 
if (true) return (int) (-1);};
B4IRDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Dim r As Int = RightPositions.Get(RightPositions.";
_r = [self.bi ObjectToNumber:[__ref->__rightpositions /*B4IList**/  Get:(int) ([__ref->__rightpositions /*B4IList**/  Size]-1)]].intValue;
B4IRDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="If x > r Then Return -1";
if (_x>_r) { 
if (true) return (int) (-1);};
B4IRDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="For i = RightPositions.Size - 2 To 0 Step -1";
{
const int step5 = -1;
const int limit5 = (int) (0);
_i = (int) ([__ref->__rightpositions /*B4IList**/  Size]-2) ;
for (;_i >= limit5 ;_i = _i + step5 ) {
B4IRDebugUtils.currentLine=10027014;
 //BA.debugLineNum = 10027014;BA.debugLine="Dim r As Int = RightPositions.Get(i)";
_r = [self.bi ObjectToNumber:[__ref->__rightpositions /*B4IList**/  Get:_i]].intValue;
B4IRDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="If x > r Then Return i + 1";
if (_x>_r) { 
if (true) return (int) (_i+1);};
 }
};
B4IRDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Return 0";
if (true) return (int) (0);
B4IRDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="End Sub";
return 0;
}
- (B4IList*)  _getitems:(b4i_b4xbreadcrumb*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"getitems"])
	 {return ((B4IList*) [B4IDebug delegate:self.bi :@"getitems" :nil]);}
B4IRDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Public Sub getItems As List";
B4IRDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Return mItems";
if (true) return __ref->__mitems /*B4IList**/ ;
B4IRDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _initialize:(b4i_b4xbreadcrumb*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="mItems.Initialize";
[__ref->__mitems /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="RightPositions.Initialize";
[__ref->__rightpositions /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="bc.Initialize(1, 1)";
[__ref->__bc /*b4i_bitmapcreator**/  _initialize:self.bi :(int) (1) :(int) (1)];
B4IRDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setitems:(b4i_b4xbreadcrumb*) __ref :(B4IList*) _i{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"setitems"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setitems:" :@[[B4I nilToNSNull:_i]]]);}
B4IRDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Public Sub setItems (i As List)";
B4IRDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="mItems = i";
__ref->__mitems /*B4IList**/  = _i;
B4IRDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _touch_touch:(b4i_b4xbreadcrumb*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xbreadcrumb";
if ([B4IDebug shouldDelegate: @"touch_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"touch_touch:::" :@[@(_action),@(_x),@(_y)]]);}
int _prev = 0;
int _index = 0;
B4IList* _items = nil;
int _i = 0;
B4IRDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Private Sub Touch_Touch (Action As Int, X As Float";
B4IRDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Select Action";
switch ([self.bi switchObjectToInt:@(_action) :@[@([__ref->__touchpanel /*B4XViewWrapper**/  TOUCH_ACTION_DOWN]),@([__ref->__touchpanel /*B4XViewWrapper**/  TOUCH_ACTION_MOVE]),@([__ref->__touchpanel /*B4XViewWrapper**/  TOUCH_ACTION_UP])]]) {
case 0: 
case 1: {
B4IRDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Dim prev As Int = PressedItem";
_prev = __ref->__presseditem /*int*/ ;
B4IRDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="PressedItem = FindItem(X, Y)";
__ref->__presseditem /*int*/  = [__ref _finditem /*int*/ :nil :(int) (_x) :(int) (_y)];
B4IRDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="If prev <> PressedItem Then Draw";
if (_prev!=__ref->__presseditem /*int*/ ) { 
[__ref _draw /*NSString**/ :nil];};
 break; }
case 2: {
B4IRDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="Dim index As Int = FindItem(X, Y)";
_index = [__ref _finditem /*int*/ :nil :(int) (_x) :(int) (_y)];
B4IRDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="If index = PressedItem And index > -1 Then";
if (_index==__ref->__presseditem /*int*/  && _index>-1) { 
B4IRDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="Dim Items As List";
_items = [B4IList new];
B4IRDebugUtils.currentLine=9961482;
 //BA.debugLineNum = 9961482;BA.debugLine="Items.Initialize";
[_items Initialize];
B4IRDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="For i = 0 To index";
{
const int step11 = 1;
const int limit11 = _index;
_i = (int) (0) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
B4IRDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="Items.Add(mItems.Get(i))";
[_items Add:[__ref->__mitems /*B4IList**/  Get:_i]];
 }
};
B4IRDebugUtils.currentLine=9961486;
 //BA.debugLineNum = 9961486;BA.debugLine="CallSub2(mCallBack, mEventName & \"_CrumbClick\"";
[self->___c CallSub2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_CrumbClick"] componentsJoinedByString:@""] :(NSObject*)(_items)];
 };
B4IRDebugUtils.currentLine=9961488;
 //BA.debugLineNum = 9961488;BA.debugLine="PressedItem = -1";
__ref->__presseditem /*int*/  = (int) (-1);
B4IRDebugUtils.currentLine=9961489;
 //BA.debugLineNum = 9961489;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
 break; }
}
;
B4IRDebugUtils.currentLine=9961491;
 //BA.debugLineNum = 9961491;BA.debugLine="End Sub";
return @"";
}
@end