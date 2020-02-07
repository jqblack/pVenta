
#import "b4i_roundslider.h"
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
#import "b4i_b4xsearchtemplate.h"
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"


@implementation b4i_roundslider 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_roundslider) instance released.");
}

- (NSString*)  _base_resize:(b4i_roundslider*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=23724032;
 //BA.debugLineNum = 23724032;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=23724033;
 //BA.debugLineNum = 23724033;BA.debugLine="cvs.Resize(Width, Height)";
[__ref->__cvs /*B4XCanvas**/  Resize:(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=23724034;
 //BA.debugLineNum = 23724034;BA.debugLine="pnl.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__pnl /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=23724035;
 //BA.debugLineNum = 23724035;BA.debugLine="If thumb.IsInitialized = False Then CreateThumb";
if ([__ref->__thumb /*B4XBitmapWrapper**/  IsInitialized]==false) { 
[__ref _createthumb /*NSString**/ :nil];};
B4IRDebugUtils.currentLine=23724036;
 //BA.debugLineNum = 23724036;BA.debugLine="CircleRect.Initialize(ThumbSize + stroke, ThumbSi";
[__ref->__circlerect /*B4XRect**/  Initialize:(float) (__ref->__thumbsize /*int*/ +__ref->__stroke /*int*/ ) :(float) (__ref->__thumbsize /*int*/ +__ref->__stroke /*int*/ ) :(float) (_width-__ref->__thumbsize /*int*/ -__ref->__stroke /*int*/ ) :(float) (_height-__ref->__thumbsize /*int*/ -__ref->__stroke /*int*/ )];
B4IRDebugUtils.currentLine=23724037;
 //BA.debugLineNum = 23724037;BA.debugLine="xlbl.SetLayoutAnimated(0, CircleRect.Left, Circle";
[__ref->__xlbl /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :[__ref->__circlerect /*B4XRect**/  Left] :[__ref->__circlerect /*B4XRect**/  Top] :[__ref->__circlerect /*B4XRect**/  Width] :[__ref->__circlerect /*B4XRect**/  Height]];
B4IRDebugUtils.currentLine=23724038;
 //BA.debugLineNum = 23724038;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=23724039;
 //BA.debugLineNum = 23724039;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _createthumb:(b4i_roundslider*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"createthumb"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createthumb" :nil]);}
b4i_bcpath* _p = nil;
int _r = 0;
int _g = 0;
int _l = 0;
b4i_bitmapcreator* _bc = nil;
B4IRDebugUtils.currentLine=23658496;
 //BA.debugLineNum = 23658496;BA.debugLine="Private Sub CreateThumb";
B4IRDebugUtils.currentLine=23658497;
 //BA.debugLineNum = 23658497;BA.debugLine="Dim p As BCPath";
_p = [b4i_bcpath new];
B4IRDebugUtils.currentLine=23658498;
 //BA.debugLineNum = 23658498;BA.debugLine="Dim r As Int = 80dip";
_r = ((int) (80));
B4IRDebugUtils.currentLine=23658499;
 //BA.debugLineNum = 23658499;BA.debugLine="Dim g As Int = 8dip";
_g = ((int) (8));
B4IRDebugUtils.currentLine=23658500;
 //BA.debugLineNum = 23658500;BA.debugLine="Dim l As Int = 28dip";
_l = ((int) (28));
B4IRDebugUtils.currentLine=23658501;
 //BA.debugLineNum = 23658501;BA.debugLine="Dim bc As BitmapCreator";
_bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=23658502;
 //BA.debugLineNum = 23658502;BA.debugLine="bc.Initialize(2 * r + g + 3dip, 2 * r + l + g)";
[_bc _initialize:self.bi :(int) (2*_r+_g+((int) (3))) :(int) (2*_r+_l+_g)];
B4IRDebugUtils.currentLine=23658503;
 //BA.debugLineNum = 23658503;BA.debugLine="p.Initialize(r - l + g, 2 * r - 2dip + g)";
[_p _initialize:self.bi :(float) (_r-_l+_g) :(float) (2*_r-((int) (2))+_g)];
B4IRDebugUtils.currentLine=23658504;
 //BA.debugLineNum = 23658504;BA.debugLine="p.LineTo(r + l + g, 2 * r - 2dip + g)";
[_p _lineto:(float) (_r+_l+_g) :(float) (2*_r-((int) (2))+_g)];
B4IRDebugUtils.currentLine=23658505;
 //BA.debugLineNum = 23658505;BA.debugLine="p.LineTo(r + g, 2 * r + l + g)";
[_p _lineto:(float) (_r+_g) :(float) (2*_r+_l+_g)];
B4IRDebugUtils.currentLine=23658506;
 //BA.debugLineNum = 23658506;BA.debugLine="p.LineTo(r - l + g, 2 * r - 2dip + g)";
[_p _lineto:(float) (_r-_l+_g) :(float) (2*_r-((int) (2))+_g)];
B4IRDebugUtils.currentLine=23658507;
 //BA.debugLineNum = 23658507;BA.debugLine="bc.DrawPath(p, 0xFF5B5B5B, True, 0)";
[_bc _drawpath:_p :(int) (0xff5b5b5b) :true :(int) (0)];
B4IRDebugUtils.currentLine=23658508;
 //BA.debugLineNum = 23658508;BA.debugLine="bc.DrawCircle(r + g, r + g, r, xui.Color_White, T";
[_bc _drawcircle:(float) (_r+_g) :(float) (_r+_g) :(float) (_r) :[__ref->__xui /*B4IXUI**/  Color_White] :true :(int) (0)];
B4IRDebugUtils.currentLine=23658509;
 //BA.debugLineNum = 23658509;BA.debugLine="bc.DrawCircle(r + g, r + g, r, 0xFF5B5B5B, False,";
[_bc _drawcircle:(float) (_r+_g) :(float) (_r+_g) :(float) (_r) :(int) (0xff5b5b5b) :false :((int) (10))];
B4IRDebugUtils.currentLine=23658510;
 //BA.debugLineNum = 23658510;BA.debugLine="thumb = bc.Bitmap";
__ref->__thumb /*B4XBitmapWrapper**/  = [_bc _getbitmap];
B4IRDebugUtils.currentLine=23658511;
 //BA.debugLineNum = 23658511;BA.debugLine="ThumbSize = thumb.Height / 4";
__ref->__thumbsize /*int*/  = (int) ([__ref->__thumb /*B4XBitmapWrapper**/  Height]/(double)4);
B4IRDebugUtils.currentLine=23658512;
 //BA.debugLineNum = 23658512;BA.debugLine="xlbl.SetTextAlignment(\"CENTER\", \"CENTER\")";
[__ref->__xlbl /*B4XViewWrapper**/  SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=23658513;
 //BA.debugLineNum = 23658513;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _draw:(b4i_roundslider*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"draw"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"draw" :nil]);}
int _radius = 0;
B4XPath* _p = nil;
int _angle = 0;
int _b4jstrokeoffset = 0;
B4XRect* _dest = nil;
int _r = 0;
int _cx = 0;
int _cy = 0;
B4IRDebugUtils.currentLine=23789568;
 //BA.debugLineNum = 23789568;BA.debugLine="Private Sub Draw";
B4IRDebugUtils.currentLine=23789569;
 //BA.debugLineNum = 23789569;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
[__ref->__cvs /*B4XCanvas**/  ClearRect:[__ref->__cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=23789570;
 //BA.debugLineNum = 23789570;BA.debugLine="Dim radius As Int = CircleRect.Width / 2";
_radius = (int) ([__ref->__circlerect /*B4XRect**/  Width]/(double)2);
B4IRDebugUtils.currentLine=23789571;
 //BA.debugLineNum = 23789571;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:[__ref->__circlerect /*B4XRect**/  CenterX] :[__ref->__circlerect /*B4XRect**/  CenterY] :(float) (_radius) :(int) (0xffb6b6b6) :false :(float) (__ref->__stroke /*int*/ )];
B4IRDebugUtils.currentLine=23789572;
 //BA.debugLineNum = 23789572;BA.debugLine="Dim p As B4XPath";
_p = [B4XPath new];
B4IRDebugUtils.currentLine=23789573;
 //BA.debugLineNum = 23789573;BA.debugLine="Dim angle As Int = (mValue - mMin) / (mMax - mMin";
_angle = (int) ((__ref->__mvalue /*int*/ -__ref->__mmin /*int*/ )/(double)(__ref->__mmax /*int*/ -__ref->__mmin /*int*/ )*360);
B4IRDebugUtils.currentLine=23789574;
 //BA.debugLineNum = 23789574;BA.debugLine="Dim B4JStrokeOffset As Int";
_b4jstrokeoffset = 0;
B4IRDebugUtils.currentLine=23789575;
 //BA.debugLineNum = 23789575;BA.debugLine="If xui.IsB4J Then B4JStrokeOffset = stroke / 2";
if ([__ref->__xui /*B4IXUI**/  IsB4J]) { 
_b4jstrokeoffset = (int) (__ref->__stroke /*int*/ /(double)2);};
B4IRDebugUtils.currentLine=23789576;
 //BA.debugLineNum = 23789576;BA.debugLine="p.InitializeArc(CircleRect.CenterX, CircleRect.Ce";
[_p InitializeArc:[__ref->__circlerect /*B4XRect**/  CenterX] :[__ref->__circlerect /*B4XRect**/  CenterY] :(float) (_radius+_b4jstrokeoffset) :(float) (-90) :(float) (_angle)];
B4IRDebugUtils.currentLine=23789577;
 //BA.debugLineNum = 23789577;BA.debugLine="cvs.DrawPath(p, ValueColor, False, stroke)";
[__ref->__cvs /*B4XCanvas**/  DrawPath:_p :__ref->__valuecolor /*int*/  :false :(float) (__ref->__stroke /*int*/ )];
B4IRDebugUtils.currentLine=23789578;
 //BA.debugLineNum = 23789578;BA.debugLine="cvs.DrawCircle(CircleRect.CenterX, CircleRect.Cen";
[__ref->__cvs /*B4XCanvas**/  DrawCircle:[__ref->__circlerect /*B4XRect**/  CenterX] :[__ref->__circlerect /*B4XRect**/  CenterY] :(float) (_radius-_b4jstrokeoffset) :[__ref->__xui /*B4IXUI**/  Color_White] :true :(float) (0)];
B4IRDebugUtils.currentLine=23789579;
 //BA.debugLineNum = 23789579;BA.debugLine="Dim dest As B4XRect";
_dest = [B4XRect new];
B4IRDebugUtils.currentLine=23789580;
 //BA.debugLineNum = 23789580;BA.debugLine="Dim r As Int = radius + ThumbSize / 2 + stroke /";
_r = (int) (_radius+__ref->__thumbsize /*int*/ /(double)2+__ref->__stroke /*int*/ /(double)2);
B4IRDebugUtils.currentLine=23789581;
 //BA.debugLineNum = 23789581;BA.debugLine="Dim cx As Int = CircleRect.CenterX + r * CosD(ang";
_cx = (int) ([__ref->__circlerect /*B4XRect**/  CenterX]+_r*cos((_angle-90)/ 180.0 * M_PI));
B4IRDebugUtils.currentLine=23789582;
 //BA.debugLineNum = 23789582;BA.debugLine="Dim cy As Int = CircleRect.CenterY + r * SinD(ang";
_cy = (int) ([__ref->__circlerect /*B4XRect**/  CenterY]+_r*sin((_angle-90)/ 180.0 * M_PI));
B4IRDebugUtils.currentLine=23789583;
 //BA.debugLineNum = 23789583;BA.debugLine="dest.Initialize(cx - thumb.Width / 8, cy - ThumbS";
[_dest Initialize:(float) (_cx-[__ref->__thumb /*B4XBitmapWrapper**/  Width]/(double)8) :(float) (_cy-__ref->__thumbsize /*int*/ /(double)2) :(float) (_cx+[__ref->__thumb /*B4XBitmapWrapper**/  Width]/(double)8) :(float) (_cy+__ref->__thumbsize /*int*/ /(double)2)];
B4IRDebugUtils.currentLine=23789584;
 //BA.debugLineNum = 23789584;BA.debugLine="cvs.DrawBitmapRotated(thumb, dest, angle)";
[__ref->__cvs /*B4XCanvas**/  DrawBitmapRotated:(UIImage*)((__ref->__thumb /*B4XBitmapWrapper**/ ).object) :_dest :(float) (_angle)];
B4IRDebugUtils.currentLine=23789585;
 //BA.debugLineNum = 23789585;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=23789586;
 //BA.debugLineNum = 23789586;BA.debugLine="xlbl.Text = mValue";
[__ref->__xlbl /*B4XViewWrapper**/  setText:[self.bi NumberToString:@(__ref->__mvalue /*int*/ )]];
B4IRDebugUtils.currentLine=23789587;
 //BA.debugLineNum = 23789587;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_roundslider*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"roundslider";
B4IRDebugUtils.currentLine=23461888;
 //BA.debugLineNum = 23461888;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=23461889;
 //BA.debugLineNum = 23461889;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=23461890;
 //BA.debugLineNum = 23461890;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=23461891;
 //BA.debugLineNum = 23461891;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=23461892;
 //BA.debugLineNum = 23461892;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=23461893;
 //BA.debugLineNum = 23461893;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=23461894;
 //BA.debugLineNum = 23461894;BA.debugLine="Private mValue As Int = 75";
self->__mvalue = (int) (75);
B4IRDebugUtils.currentLine=23461895;
 //BA.debugLineNum = 23461895;BA.debugLine="Private mMin, mMax As Int";
self->__mmin = 0;
self->__mmax = 0;
B4IRDebugUtils.currentLine=23461896;
 //BA.debugLineNum = 23461896;BA.debugLine="Private thumb As B4XBitmap";
self->__thumb = [B4XBitmapWrapper new];
B4IRDebugUtils.currentLine=23461897;
 //BA.debugLineNum = 23461897;BA.debugLine="Private pnl As B4XView";
self->__pnl = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=23461898;
 //BA.debugLineNum = 23461898;BA.debugLine="Private xlbl As B4XView";
self->__xlbl = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=23461899;
 //BA.debugLineNum = 23461899;BA.debugLine="Private CircleRect As B4XRect";
self->__circlerect = [B4XRect new];
B4IRDebugUtils.currentLine=23461900;
 //BA.debugLineNum = 23461900;BA.debugLine="Private ValueColor As Int";
self->__valuecolor = 0;
B4IRDebugUtils.currentLine=23461901;
 //BA.debugLineNum = 23461901;BA.debugLine="Private stroke As Int";
self->__stroke = 0;
B4IRDebugUtils.currentLine=23461902;
 //BA.debugLineNum = 23461902;BA.debugLine="Private ThumbSize As Int";
self->__thumbsize = 0;
B4IRDebugUtils.currentLine=23461903;
 //BA.debugLineNum = 23461903;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=23461904;
 //BA.debugLineNum = 23461904;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_roundslider*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4IRDebugUtils.currentLine=23592960;
 //BA.debugLineNum = 23592960;BA.debugLine="Public Sub DesignerCreateView (Base As Object, Lbl";
B4IRDebugUtils.currentLine=23592961;
 //BA.debugLineNum = 23592961;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=23592962;
 //BA.debugLineNum = 23592962;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=23592963;
 //BA.debugLineNum = 23592963;BA.debugLine="cvs.Initialize(mBase)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__mbase /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=23592964;
 //BA.debugLineNum = 23592964;BA.debugLine="mMin = Props.Get(\"Min\")";
__ref->__mmin /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"Min")]].intValue;
B4IRDebugUtils.currentLine=23592965;
 //BA.debugLineNum = 23592965;BA.debugLine="mMax = Props.Get(\"Max\")";
__ref->__mmax /*int*/  = [self.bi ObjectToNumber:[_props Get:(NSObject*)(@"Max")]].intValue;
B4IRDebugUtils.currentLine=23592966;
 //BA.debugLineNum = 23592966;BA.debugLine="pnl = xui.CreatePanel(\"pnl\")";
__ref->__pnl /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"pnl"];
B4IRDebugUtils.currentLine=23592967;
 //BA.debugLineNum = 23592967;BA.debugLine="xlbl = Lbl";
__ref->__xlbl /*B4XViewWrapper**/ .object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=23592968;
 //BA.debugLineNum = 23592968;BA.debugLine="mBase.AddView(xlbl, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__xlbl /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=23592969;
 //BA.debugLineNum = 23592969;BA.debugLine="mBase.AddView(pnl, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__pnl /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=23592970;
 //BA.debugLineNum = 23592970;BA.debugLine="ValueColor = xui.PaintOrColorToColor(Props.Get(\"V";
__ref->__valuecolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"ValueColor")]];
B4IRDebugUtils.currentLine=23592971;
 //BA.debugLineNum = 23592971;BA.debugLine="If xui.IsB4A Or xui.IsB4i Then";
if ([__ref->__xui /*B4IXUI**/  IsB4A] || [__ref->__xui /*B4IXUI**/  IsB4i]) { 
B4IRDebugUtils.currentLine=23592972;
 //BA.debugLineNum = 23592972;BA.debugLine="stroke = 8dip";
__ref->__stroke /*int*/  = ((int) (8));
 }else if([__ref->__xui /*B4IXUI**/  IsB4J]) { 
B4IRDebugUtils.currentLine=23592974;
 //BA.debugLineNum = 23592974;BA.debugLine="stroke = 6dip";
__ref->__stroke /*int*/  = ((int) (6));
 };
B4IRDebugUtils.currentLine=23592976;
 //BA.debugLineNum = 23592976;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=23592977;
 //BA.debugLineNum = 23592977;BA.debugLine="End Sub";
return @"";
}
- (int)  _getvalue:(b4i_roundslider*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"getvalue"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getvalue" :nil]).intValue;}
B4IRDebugUtils.currentLine=23986176;
 //BA.debugLineNum = 23986176;BA.debugLine="Public Sub getValue As Int";
B4IRDebugUtils.currentLine=23986177;
 //BA.debugLineNum = 23986177;BA.debugLine="Return mValue";
if (true) return __ref->__mvalue /*int*/ ;
B4IRDebugUtils.currentLine=23986178;
 //BA.debugLineNum = 23986178;BA.debugLine="End Sub";
return 0;
}
- (NSString*)  _initialize:(b4i_roundslider*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=23527424;
 //BA.debugLineNum = 23527424;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=23527425;
 //BA.debugLineNum = 23527425;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=23527426;
 //BA.debugLineNum = 23527426;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=23527427;
 //BA.debugLineNum = 23527427;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pnl_touch:(b4i_roundslider*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"pnl_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pnl_touch:::" :@[@(_action),@(_x),@(_y)]]);}
int _dx = 0;
int _dy = 0;
float _dist = 0.0f;
int _angle = 0;
int _newvalue = 0;
B4IRDebugUtils.currentLine=23855104;
 //BA.debugLineNum = 23855104;BA.debugLine="Private Sub pnl_Touch (Action As Int, X As Float,";
B4IRDebugUtils.currentLine=23855105;
 //BA.debugLineNum = 23855105;BA.debugLine="If Action = pnl.TOUCH_ACTION_MOVE_NOTOUCH Then Re";
if (_action==[__ref->__pnl /*B4XViewWrapper**/  TOUCH_ACTION_MOVE_NOTOUCH]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=23855106;
 //BA.debugLineNum = 23855106;BA.debugLine="Dim dx As Int = x - CircleRect.CenterX";
_dx = (int) (_x-[__ref->__circlerect /*B4XRect**/  CenterX]);
B4IRDebugUtils.currentLine=23855107;
 //BA.debugLineNum = 23855107;BA.debugLine="Dim dy As Int = y - CircleRect.CenterY";
_dy = (int) (_y-[__ref->__circlerect /*B4XRect**/  CenterY]);
B4IRDebugUtils.currentLine=23855108;
 //BA.debugLineNum = 23855108;BA.debugLine="Dim dist As Float = Sqrt(Power(dx, 2) + Power(dy,";
_dist = (float) (sqrt(pow(_dx,2)+pow(_dy,2)));
B4IRDebugUtils.currentLine=23855109;
 //BA.debugLineNum = 23855109;BA.debugLine="If dist > CircleRect.Width / 2 Then";
if (_dist>[__ref->__circlerect /*B4XRect**/  Width]/(double)2) { 
B4IRDebugUtils.currentLine=23855110;
 //BA.debugLineNum = 23855110;BA.debugLine="Dim angle As Int = Round(ATan2D(dy, dx))";
_angle = (int) (((double)lrint((atan2(_dy,_dx)/M_PI * 180))));
B4IRDebugUtils.currentLine=23855111;
 //BA.debugLineNum = 23855111;BA.debugLine="angle = angle + 90";
_angle = (int) (_angle+90);
B4IRDebugUtils.currentLine=23855112;
 //BA.debugLineNum = 23855112;BA.debugLine="angle = (angle + 360) Mod 360";
_angle = (int) ((_angle+360)%360);
B4IRDebugUtils.currentLine=23855113;
 //BA.debugLineNum = 23855113;BA.debugLine="Dim NewValue As Int = mMin + angle / 360 * (mMax";
_newvalue = (int) (__ref->__mmin /*int*/ +_angle/(double)360*(__ref->__mmax /*int*/ -__ref->__mmin /*int*/ ));
B4IRDebugUtils.currentLine=23855114;
 //BA.debugLineNum = 23855114;BA.debugLine="NewValue = Max(mMin, Min(mMax, NewValue))";
_newvalue = (int) (fmax(__ref->__mmin /*int*/ ,fmin(__ref->__mmax /*int*/ ,_newvalue)));
B4IRDebugUtils.currentLine=23855115;
 //BA.debugLineNum = 23855115;BA.debugLine="If NewValue <> mValue Then";
if (_newvalue!=__ref->__mvalue /*int*/ ) { 
B4IRDebugUtils.currentLine=23855116;
 //BA.debugLineNum = 23855116;BA.debugLine="mValue = NewValue";
__ref->__mvalue /*int*/  = _newvalue;
B4IRDebugUtils.currentLine=23855117;
 //BA.debugLineNum = 23855117;BA.debugLine="CallSub2(mCallBack, mEventName & \"_ValueChanged";
[self->___c CallSub2:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_ValueChanged"] componentsJoinedByString:@""] :(NSObject*)(@(__ref->__mvalue /*int*/ ))];
 };
B4IRDebugUtils.currentLine=23855119;
 //BA.debugLineNum = 23855119;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
 };
B4IRDebugUtils.currentLine=23855121;
 //BA.debugLineNum = 23855121;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setvalue:(b4i_roundslider*) __ref :(int) _v{
__ref = self;
B4IRDebugUtils.currentModule=@"roundslider";
if ([B4IDebug shouldDelegate: @"setvalue"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setvalue:" :@[@(_v)]]);}
B4IRDebugUtils.currentLine=23920640;
 //BA.debugLineNum = 23920640;BA.debugLine="Public Sub setValue (v As Int)";
B4IRDebugUtils.currentLine=23920641;
 //BA.debugLineNum = 23920641;BA.debugLine="mValue = Max(mMin, Min(mMax, v))";
__ref->__mvalue /*int*/  = (int) (fmax(__ref->__mmin /*int*/ ,fmin(__ref->__mmax /*int*/ ,_v)));
B4IRDebugUtils.currentLine=23920642;
 //BA.debugLineNum = 23920642;BA.debugLine="Draw";
[__ref _draw /*NSString**/ :nil];
B4IRDebugUtils.currentLine=23920643;
 //BA.debugLineNum = 23920643;BA.debugLine="End Sub";
return @"";
}
@end