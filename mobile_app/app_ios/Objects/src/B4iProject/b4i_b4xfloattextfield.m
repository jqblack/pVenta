
#import "b4i_b4xfloattextfield.h"
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


@implementation b4i_b4xfloattextfield 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xfloattextfield) instance released.");
}

- (NSString*)  _base_resize:(b4i_b4xfloattextfield*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
int _firstdistance = 0;
B4IRDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="mTextField.SetLayoutAnimated(0, 0, 0, Width, Heig";
[__ref->__mtextfield /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="Dim FirstDistance As Int = 2dip";
_firstdistance = ((int) (2));
B4IRDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="If Multiline And xui.IsB4J Then FirstDistance = 2";
if (__ref->__multiline /*BOOL*/  && [__ref->__xui /*B4IXUI**/  IsB4J]) { 
_firstdistance = ((int) (22));};
B4IRDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="If lblV.IsInitialized Then";
if ([__ref->__lblv /*B4XViewWrapper**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="lblV.SetLayoutAnimated(0, Width - lblV.Width - F";
[__ref->__lblv /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (_width-[__ref->__lblv /*B4XViewWrapper**/  Width]-_firstdistance) :(float) (0) :[__ref->__lblv /*B4XViewWrapper**/  Width] :(float) (_height)];
B4IRDebugUtils.currentLine=15335430;
 //BA.debugLineNum = 15335430;BA.debugLine="FirstDistance = FirstDistance + lblV.Width + 2di";
_firstdistance = (int) (_firstdistance+[__ref->__lblv /*B4XViewWrapper**/  Width]+((int) (2)));
 };
B4IRDebugUtils.currentLine=15335432;
 //BA.debugLineNum = 15335432;BA.debugLine="If lblClear.IsInitialized Then";
if ([__ref->__lblclear /*B4XViewWrapper**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=15335433;
 //BA.debugLineNum = 15335433;BA.debugLine="lblClear.SetLayoutAnimated(0, Width - lblClear.W";
[__ref->__lblclear /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (_width-[__ref->__lblclear /*B4XViewWrapper**/  Width]-_firstdistance) :(float) (0) :[__ref->__lblclear /*B4XViewWrapper**/  Width] :(float) (_height)];
 };
B4IRDebugUtils.currentLine=15335435;
 //BA.debugLineNum = 15335435;BA.debugLine="UpdateLabel(mTextField.Text, True)";
[__ref _updatelabel /*NSString**/ :nil :[__ref->__mtextfield /*B4XViewWrapper**/  Text] :true];
B4IRDebugUtils.currentLine=15335436;
 //BA.debugLineNum = 15335436;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updatelabel:(b4i_b4xfloattextfield*) __ref :(NSString*) _txt :(BOOL) _force{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"updatelabel"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updatelabel::" :@[[B4I nilToNSNull:_txt],@(_force)]]);}
B4XViewWrapper* _lbl = nil;
BOOL _goingtolarge = false;
B4XBitmapWrapper* _b = nil;
B4IRDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Private Sub UpdateLabel (txt As String, force As B";
B4IRDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="For Each lbl As B4XView In Array As B4XView(lblCl";
{
const id<B4IIterable> group1 = [[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:__ref->__lblclear /*B4XViewWrapper**/ ],[B4I nilToNSNull:__ref->__lblv /*B4XViewWrapper**/ ]]];
const int groupLen1 = group1.Size
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lbl = [group1 Get:index1];
B4IRDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If lbl.IsInitialized Then lbl.Visible = Focused";
if ([_lbl IsInitialized]) { 
[_lbl setVisible:__ref->__focused /*BOOL*/  && [_txt Length]>0];};
 }
};
B4IRDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="Dim GoingToLarge As Boolean = txt.Length = 0";
_goingtolarge = [_txt Length]==0;
B4IRDebugUtils.currentLine=15400966;
 //BA.debugLineNum = 15400966;BA.debugLine="If GoingToLarge = LargeLabel And force = False Th";
if (_goingtolarge==__ref->__largelabel /*BOOL*/  && _force==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="Dim b As B4XBitmap";
_b = [B4XBitmapWrapper new];
B4IRDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="If Focused Then";
if (__ref->__focused /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="If GoingToLarge Then b = LargeFocused Else b = S";
if (_goingtolarge) { 
_b = __ref->__largefocused /*B4XBitmapWrapper**/ ;}
else {
_b = __ref->__smallfocused /*B4XBitmapWrapper**/ ;};
 }else {
B4IRDebugUtils.currentLine=15400971;
 //BA.debugLineNum = 15400971;BA.debugLine="If GoingToLarge Then b = LargeNotFocused Else b";
if (_goingtolarge) { 
_b = __ref->__largenotfocused /*B4XBitmapWrapper**/ ;}
else {
_b = __ref->__smallnotfocused /*B4XBitmapWrapper**/ ;};
 };
B4IRDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="If b.IsInitialized = False Then Return";
if ([_b IsInitialized]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="HintImageView.SetBitmap(b)";
[__ref->__hintimageview /*B4XViewWrapper**/  SetBitmap:(UIImage*)((_b).object)];
B4IRDebugUtils.currentLine=15400975;
 //BA.debugLineNum = 15400975;BA.debugLine="If GoingToLarge Then";
if (_goingtolarge) { 
B4IRDebugUtils.currentLine=15400976;
 //BA.debugLineNum = 15400976;BA.debugLine="HintImageView.SetLayoutAnimated (Duration, Horiz";
[__ref->__hintimageview /*B4XViewWrapper**/  SetLayoutAnimated:__ref->__duration /*int*/  :(float) (__ref->__horizontalpadding /*int*/ ) :(float) ([__ref->__mbase /*B4XViewWrapper**/  Height]/(double)2-[_b Height]/(double)2) :[_b Width] :[_b Height]];
B4IRDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="LargeLabel = True";
__ref->__largelabel /*BOOL*/  = true;
 }else {
B4IRDebugUtils.currentLine=15400979;
 //BA.debugLineNum = 15400979;BA.debugLine="HintImageView.SetLayoutAnimated(Duration, 2dip,";
[__ref->__hintimageview /*B4XViewWrapper**/  SetLayoutAnimated:__ref->__duration /*int*/  :(float) (((int) (2))) :(float) (((int) (2))) :[_b Width] :[_b Height]];
B4IRDebugUtils.currentLine=15400980;
 //BA.debugLineNum = 15400980;BA.debugLine="LargeLabel = False";
__ref->__largelabel /*BOOL*/  = false;
 };
B4IRDebugUtils.currentLine=15400982;
 //BA.debugLineNum = 15400982;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xfloattextfield*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
B4IRDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Private mEventName As String 'ignore";
self->__meventname = @"";
B4IRDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Private mCallBack As Object 'ignore";
self->__mcallback = [NSObject new];
B4IRDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="Private mTextField As B4XView";
self->__mtextfield = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="Private Duration As Int = 200";
self->__duration = (int) (200);
B4IRDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="Public LargeLabelTextSize = 18, SmallLabelTextSiz";
self->__largelabeltextsize = (float) (18);
self->__smalllabeltextsize = (float) (14);
B4IRDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="Private LargeLabel As Boolean";
self->__largelabel = false;
B4IRDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="Private MeasuringCanvas As B4XCanvas";
self->__measuringcanvas = [B4XCanvas new];
B4IRDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="Public HintColor As Int";
self->__hintcolor = 0;
B4IRDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="Public NonFocusedHintColor As Int";
self->__nonfocusedhintcolor = 0;
B4IRDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="Private HorizontalPadding As Int";
self->__horizontalpadding = 0;
B4IRDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="Private HintImageView As B4XView";
self->__hintimageview = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="Public HintText As String";
self->__hinttext = @"";
B4IRDebugUtils.currentLine=14745615;
 //BA.debugLineNum = 14745615;BA.debugLine="Public HintFont As B4XFont";
self->__hintfont = [B4XFont new];
B4IRDebugUtils.currentLine=14745616;
 //BA.debugLineNum = 14745616;BA.debugLine="Private LargeFocused, LargeNotFocused, SmallFocus";
self->__largefocused = [B4XBitmapWrapper new];
self->__largenotfocused = [B4XBitmapWrapper new];
self->__smallfocused = [B4XBitmapWrapper new];
self->__smallnotfocused = [B4XBitmapWrapper new];
B4IRDebugUtils.currentLine=14745617;
 //BA.debugLineNum = 14745617;BA.debugLine="Public Focused As Boolean";
self->__focused = false;
B4IRDebugUtils.currentLine=14745618;
 //BA.debugLineNum = 14745618;BA.debugLine="Public lblClear As B4XView";
self->__lblclear = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=14745619;
 //BA.debugLineNum = 14745619;BA.debugLine="Public lblV As B4XView";
self->__lblv = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=14745620;
 //BA.debugLineNum = 14745620;BA.debugLine="Private mProps As Map";
self->__mprops = [B4IMap new];
B4IRDebugUtils.currentLine=14745621;
 //BA.debugLineNum = 14745621;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=14745622;
 //BA.debugLineNum = 14745622;BA.debugLine="Private KeyboardType As String 'ignore";
self->__keyboardtype = @"";
B4IRDebugUtils.currentLine=14745623;
 //BA.debugLineNum = 14745623;BA.debugLine="Private Multiline As Boolean";
self->__multiline = false;
B4IRDebugUtils.currentLine=14745624;
 //BA.debugLineNum = 14745624;BA.debugLine="Private mNextTextField As B4XFloatTextField";
self->__mnexttextfield = [b4i_b4xfloattextfield new];
B4IRDebugUtils.currentLine=14745628;
 //BA.debugLineNum = 14745628;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _createacceptbutton:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createacceptbutton"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createacceptbutton" :nil]);}
B4IRDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Private Sub CreateAcceptButton";
B4IRDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="If mProps.GetDefault(\"ShowAccept\", True) = False";
if ([[__ref->__mprops /*B4IMap**/  GetDefault:(NSObject*)(@"ShowAccept") :(NSObject*)(@(true))] isEqual:(NSObject*)(@(false))]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="lblV = CreateButton(Chr(0xE5CA))";
__ref->__lblv /*B4XViewWrapper**/  = [__ref _createbutton /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe5ca)))]];
B4IRDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="lblV.Tag = \"v\"";
[__ref->__lblv /*B4XViewWrapper**/  setTag:(NSObject*)(@"v")];
B4IRDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createbutton:(b4i_b4xfloattextfield*) __ref :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createbutton"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"createbutton:" :@[[B4I nilToNSNull:_text]]]);}
B4ILabelWrapper* _lc = nil;
B4XViewWrapper* _x = nil;
B4IRDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Private Sub CreateButton (Text As String) As B4XVi";
B4IRDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim lc As Label";
_lc = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="lc.Initialize(\"lc\")";
[_lc Initialize:self.bi :@"lc"];
B4IRDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Dim x As B4XView = lc";
_x = [B4XViewWrapper new];
_x.object = (NSObject*)((_lc).object);
B4IRDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="x = lc";
_x.object = (NSObject*)((_lc).object);
B4IRDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="x.Font = xui.CreateMaterialIcons(20)";
[_x setFont:[__ref->__xui /*B4IXUI**/  CreateMaterialIcons:(float) (20)]];
B4IRDebugUtils.currentLine=15269894;
 //BA.debugLineNum = 15269894;BA.debugLine="x.Text = Text";
[_x setText:_text];
B4IRDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="x.TextColor = mTextField.TextColor";
[_x setTextColor:[__ref->__mtextfield /*B4XViewWrapper**/  TextColor]];
B4IRDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="x.Visible = False";
[_x setVisible:false];
B4IRDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="x.SetTextAlignment(\"CENTER\", \"CENTER\")";
[_x SetTextAlignment:@"CENTER" :@"CENTER"];
B4IRDebugUtils.currentLine=15269898;
 //BA.debugLineNum = 15269898;BA.debugLine="mBase.AddView(x, 0, 0, 30dip, 30dip)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_x).object) :(float) (0) :(float) (0) :(float) (((int) (30))) :(float) (((int) (30)))];
B4IRDebugUtils.currentLine=15269899;
 //BA.debugLineNum = 15269899;BA.debugLine="Return x";
if (true) return _x;
B4IRDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="End Sub";
return nil;
}
- (B4XBitmapWrapper*)  _createbitmap:(b4i_b4xfloattextfield*) __ref :(B4XRect*) _r :(int) _color :(B4XFont*) _fnt{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createbitmap"])
	 {return ((B4XBitmapWrapper*) [B4IDebug delegate:self.bi :@"createbitmap:::" :@[[B4I nilToNSNull:_r],@(_color),[B4I nilToNSNull:_fnt]]]);}
B4XViewWrapper* _p = nil;
B4XCanvas* _c = nil;
int _baseline = 0;
B4XBitmapWrapper* _bmp = nil;
B4IRDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Private Sub CreateBitmap(r As B4XRect, Color As In";
B4IRDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, r.Width + 2dip, r.He";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) ([_r Width]+((int) (2))) :(float) ([_r Height]+((int) (2)))];
B4IRDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Dim c As B4XCanvas";
_c = [B4XCanvas new];
B4IRDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="c.Initialize(p)";
[_c Initialize:(UIView*)((_p).object)];
B4IRDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Dim BaseLine As Int = p.Height / 2 - r.Height / 2";
_baseline = (int) ([_p Height]/(double)2-[_r Height]/(double)2-[_r Top]);
B4IRDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="c.DrawText(HintText, p.Width / 2, BaseLine, Fnt,";
[_c DrawText:__ref->__hinttext /*NSString**/  :(float) ([_p Width]/(double)2) :(float) (_baseline) :_fnt :_color :@"CENTER"];
B4IRDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="Dim bmp As B4XBitmap = c.CreateBitmap";
_bmp = [B4XBitmapWrapper new];
_bmp = [_c CreateBitmap];
B4IRDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="c.Release";
[_c Release];
B4IRDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="Return bmp";
if (true) return _bmp;
B4IRDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _createclearbutton:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createclearbutton"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createclearbutton" :nil]);}
B4IRDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Private Sub CreateClearButton";
B4IRDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="If mProps.GetDefault(\"ShowClear\", True) = False T";
if ([[__ref->__mprops /*B4IMap**/  GetDefault:(NSObject*)(@"ShowClear") :(NSObject*)(@(true))] isEqual:(NSObject*)(@(false))]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="If lblClear.IsInitialized And lblClear.Parent.IsI";
if ([__ref->__lblclear /*B4XViewWrapper**/  IsInitialized] && [[__ref->__lblclear /*B4XViewWrapper**/  Parent] IsInitialized]) { 
[__ref->__lblclear /*B4XViewWrapper**/  RemoveViewFromParent];};
B4IRDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="lblClear = CreateButton(Chr(0xE14C))";
__ref->__lblclear /*B4XViewWrapper**/  = [__ref _createbutton /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe14c)))]];
B4IRDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="lblClear.Tag = \"clear\"";
[__ref->__lblclear /*B4XViewWrapper**/  setTag:(NSObject*)(@"clear")];
B4IRDebugUtils.currentLine=15007750;
 //BA.debugLineNum = 15007750;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _createrevealbutton:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createrevealbutton"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createrevealbutton" :nil]);}
B4IRDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Private Sub CreateRevealButton";
B4IRDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="lblClear = CreateButton(Chr(0xE8F4))";
__ref->__lblclear /*B4XViewWrapper**/  = [__ref _createbutton /*B4XViewWrapper**/ :nil :[self.bi CharToString:((unichar)((int) (0xe8f4)))]];
B4IRDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="lblClear.Tag = \"reveal\"";
[__ref->__lblclear /*B4XViewWrapper**/  setTag:(NSObject*)(@"reveal")];
B4IRDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createtextfield:(b4i_b4xfloattextfield*) __ref :(BOOL) _password{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createtextfield"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"createtextfield:" :@[@(_password)]]);}
B4ITextViewWrapper* _ta = nil;
B4INativeObject* _no = nil;
B4ITextFieldWrapper* _tf = nil;
B4IRDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="Private Sub CreateTextField (Password As Boolean)";
B4IRDebugUtils.currentLine=16187423;
 //BA.debugLineNum = 16187423;BA.debugLine="If Multiline Then";
if (__ref->__multiline /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=16187424;
 //BA.debugLineNum = 16187424;BA.debugLine="Dim ta As TextView";
_ta = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=16187425;
 //BA.debugLineNum = 16187425;BA.debugLine="ta.Initialize(\"tf\")";
[_ta Initialize:self.bi :@"tf"];
B4IRDebugUtils.currentLine=16187426;
 //BA.debugLineNum = 16187426;BA.debugLine="Dim no As NativeObject = ta";
_no = [B4INativeObject new];
_no.object = (NSObject*)((_ta).object);
B4IRDebugUtils.currentLine=16187427;
 //BA.debugLineNum = 16187427;BA.debugLine="no.RunMethod(\"setContentInset:\", Array(no.MakeEd";
[_no RunMethod:@"setContentInset:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)([_no MakeEdgeInsets:(float) (0) :(float) (8) :(float) (0) :(float) (0)])]]]];
B4IRDebugUtils.currentLine=16187428;
 //BA.debugLineNum = 16187428;BA.debugLine="Return ta";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_ta).object)];
 }else {
B4IRDebugUtils.currentLine=16187430;
 //BA.debugLineNum = 16187430;BA.debugLine="Dim tf As TextField";
_tf = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16187431;
 //BA.debugLineNum = 16187431;BA.debugLine="tf.Initialize(\"tf\")";
[_tf Initialize:self.bi :@"tf"];
B4IRDebugUtils.currentLine=16187432;
 //BA.debugLineNum = 16187432;BA.debugLine="tf.PasswordMode = Password";
[_tf setPasswordMode:_password];
B4IRDebugUtils.currentLine=16187433;
 //BA.debugLineNum = 16187433;BA.debugLine="tf.ShowClearButton = False";
[_tf setShowClearButton:false];
B4IRDebugUtils.currentLine=16187434;
 //BA.debugLineNum = 16187434;BA.debugLine="tf.Autocorrect = tf.AUTOCORRECT_NO";
[_tf setAutocorrect:[_tf AUTOCORRECT_NO]];
B4IRDebugUtils.currentLine=16187435;
 //BA.debugLineNum = 16187435;BA.debugLine="Select KeyboardType";
switch ([self.bi switchObjectToInt:__ref->__keyboardtype /*NSString**/  :@[@"Numbers",@"Decimal"]]) {
case 0: {
B4IRDebugUtils.currentLine=16187437;
 //BA.debugLineNum = 16187437;BA.debugLine="tf.KeyboardType = tf.TYPE_NUMBER_PAD";
[_tf setKeyboardType:[_tf TYPE_NUMBER_PAD]];
 break; }
case 1: {
B4IRDebugUtils.currentLine=16187439;
 //BA.debugLineNum = 16187439;BA.debugLine="tf.KeyboardType = tf.TYPE_NUMBERS_AND_PUNCTUAT";
[_tf setKeyboardType:[_tf TYPE_NUMBERS_AND_PUNCTUATIONS]];
 break; }
}
;
B4IRDebugUtils.currentLine=16187441;
 //BA.debugLineNum = 16187441;BA.debugLine="Return tf";
if (true) return (B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)((_tf).object)];
 };
B4IRDebugUtils.currentLine=16187444;
 //BA.debugLineNum = 16187444;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _createtextfieldall:(b4i_b4xfloattextfield*) __ref :(BOOL) _passwordmode :(B4XFont*) _font1 :(int) _textcolor{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"createtextfieldall"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"createtextfieldall:::" :@[@(_passwordmode),[B4I nilToNSNull:_font1],@(_textcolor)]]);}
B4IRDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Private Sub CreateTextFieldAll (PasswordMode As Bo";
B4IRDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="mTextField = CreateTextField (PasswordMode)";
__ref->__mtextfield /*B4XViewWrapper**/  = [__ref _createtextfield /*B4XViewWrapper**/ :nil :_passwordmode];
B4IRDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="mTextField.Font = Font1";
[__ref->__mtextfield /*B4XViewWrapper**/  setFont:_font1];
B4IRDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="mTextField.TextColor = TextColor";
[__ref->__mtextfield /*B4XViewWrapper**/  setTextColor:_textcolor];
B4IRDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="setNextField(mNextTextField)";
[__ref _setnextfield /*NSString**/ :nil :__ref->__mnexttextfield /*b4i_b4xfloattextfield**/ ];
B4IRDebugUtils.currentLine=14942213;
 //BA.debugLineNum = 14942213;BA.debugLine="mBase.AddView(mTextField, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__mtextfield /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=14942214;
 //BA.debugLineNum = 14942214;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setnextfield:(b4i_b4xfloattextfield*) __ref :(b4i_b4xfloattextfield*) _field{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"setnextfield"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setnextfield:" :@[[B4I nilToNSNull:_field]]]);}
NSObject* _o = nil;
B4IRDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Public Sub setNextField (Field As B4XFloatTextFiel";
B4IRDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="If Field.IsInitialized = False Then Return";
if ([_field IsInitialized /*BOOL*/ ]==false) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=15990795;
 //BA.debugLineNum = 15990795;BA.debugLine="Dim o As Object = Field";
_o = (NSObject*)(_field);
B4IRDebugUtils.currentLine=15990796;
 //BA.debugLineNum = 15990796;BA.debugLine="mNextTextField = o";
__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  = (b4i_b4xfloattextfield*)(_o);
B4IRDebugUtils.currentLine=15990797;
 //BA.debugLineNum = 15990797;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _designercreateview:(b4i_b4xfloattextfield*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"designercreateview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"designercreateview:::" :@[[B4I nilToNSNull:_base],[B4I nilToNSNull:_lbl],[B4I nilToNSNull:_props]]]);}
B4XViewWrapper* _passedlabel = nil;
B4IImageViewWrapper* _iv = nil;
BOOL _passwordmode = false;
B4XViewWrapper* _p = nil;
B4IRDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Public Sub DesignerCreateView (Base As Object, lbl";
B4IRDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="mBase = Base";
__ref->__mbase /*B4XViewWrapper**/ .object = (NSObject*)(_base);
B4IRDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
__ref->__tag /*NSObject**/  = [__ref->__mbase /*B4XViewWrapper**/  Tag];
B4IRDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Tag = mBase.Tag : mBase.Tag = Me";
[__ref->__mbase /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="mProps = Props";
__ref->__mprops /*B4IMap**/  = _props;
B4IRDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="Dim PassedLabel As B4XView = lbl";
_passedlabel = [B4XViewWrapper new];
_passedlabel.object = (NSObject*)((_lbl).object);
B4IRDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="Dim iv As ImageView";
_iv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="iv.Initialize(\"\")";
[_iv Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="HintImageView = iv";
__ref->__hintimageview /*B4XViewWrapper**/ .object = (NSObject*)((_iv).object);
B4IRDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="KeyboardType = Props.GetDefault(\"KeyboardType\", \"";
__ref->__keyboardtype /*NSString**/  = [self.bi ObjectToString:[_props GetDefault:(NSObject*)(@"KeyboardType") :(NSObject*)(@"Text")]];
B4IRDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="HintColor = xui.PaintOrColorToColor(Props.Get(\"Hi";
__ref->__hintcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"HintColor")]];
B4IRDebugUtils.currentLine=14876687;
 //BA.debugLineNum = 14876687;BA.debugLine="NonFocusedHintColor = xui.PaintOrColorToColor(Pro";
__ref->__nonfocusedhintcolor /*int*/  = [__ref->__xui /*B4IXUI**/  PaintOrColorToColor:[_props Get:(NSObject*)(@"NonFocusedHintColor")]];
B4IRDebugUtils.currentLine=14876689;
 //BA.debugLineNum = 14876689;BA.debugLine="HintText = Props.Get(\"Hint\")";
__ref->__hinttext /*NSString**/  = [self.bi ObjectToString:[_props Get:(NSObject*)(@"Hint")]];
B4IRDebugUtils.currentLine=14876690;
 //BA.debugLineNum = 14876690;BA.debugLine="HintFont = PassedLabel.Font";
__ref->__hintfont /*B4XFont**/  = [_passedlabel Font];
B4IRDebugUtils.currentLine=14876691;
 //BA.debugLineNum = 14876691;BA.debugLine="Dim PasswordMode As Boolean = Props.GetDefault(\"P";
_passwordmode = [self.bi ObjectToBoolean:[_props GetDefault:(NSObject*)(@"PasswordField") :(NSObject*)(@(false))]];
B4IRDebugUtils.currentLine=14876692;
 //BA.debugLineNum = 14876692;BA.debugLine="Multiline = Props.GetDefault(\"Multiline\", False)";
__ref->__multiline /*BOOL*/  = [self.bi ObjectToBoolean:[_props GetDefault:(NSObject*)(@"Multiline") :(NSObject*)(@(false))]];
B4IRDebugUtils.currentLine=14876693;
 //BA.debugLineNum = 14876693;BA.debugLine="If PasswordMode And Multiline Then";
if (_passwordmode && __ref->__multiline /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=14876694;
 //BA.debugLineNum = 14876694;BA.debugLine="Multiline = False";
__ref->__multiline /*BOOL*/  = false;
B4IRDebugUtils.currentLine=14876695;
 //BA.debugLineNum = 14876695;BA.debugLine="Log(\"Multiline not supported with password mode.";
[self->___c LogImpl:@"914876695" :@"Multiline not supported with password mode." :0];
 };
B4IRDebugUtils.currentLine=14876697;
 //BA.debugLineNum = 14876697;BA.debugLine="CreateTextFieldAll(PasswordMode, PassedLabel.Font";
[__ref _createtextfieldall /*NSString**/ :nil :_passwordmode :[_passedlabel Font] :[__ref->__xui /*B4IXUI**/  PaintOrColorToColor:(NSObject*)(@([_lbl TextColor]))]];
B4IRDebugUtils.currentLine=14876699;
 //BA.debugLineNum = 14876699;BA.debugLine="mBase.AddView(HintImageView, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((__ref->__hintimageview /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=14876700;
 //BA.debugLineNum = 14876700;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=14876701;
 //BA.debugLineNum = 14876701;BA.debugLine="p.SetLayoutAnimated(0, 0, 0, 2dip, 2dip)";
[_p SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (2))) :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=14876702;
 //BA.debugLineNum = 14876702;BA.debugLine="MeasuringCanvas.Initialize(p)";
[__ref->__measuringcanvas /*B4XCanvas**/  Initialize:(UIView*)((_p).object)];
B4IRDebugUtils.currentLine=14876703;
 //BA.debugLineNum = 14876703;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=14876704;
 //BA.debugLineNum = 14876704;BA.debugLine="If PasswordMode And Props.GetDefault(\"ShowRevealB";
if (_passwordmode && [self.bi ObjectToBoolean:[_props GetDefault:(NSObject*)(@"ShowRevealButton") :(NSObject*)(@(false))]]) { 
B4IRDebugUtils.currentLine=14876705;
 //BA.debugLineNum = 14876705;BA.debugLine="CreateRevealButton";
[__ref _createrevealbutton /*NSString**/ :nil];
 }else {
B4IRDebugUtils.currentLine=14876707;
 //BA.debugLineNum = 14876707;BA.debugLine="CreateClearButton";
[__ref _createclearbutton /*NSString**/ :nil];
 };
B4IRDebugUtils.currentLine=14876709;
 //BA.debugLineNum = 14876709;BA.debugLine="CreateAcceptButton";
[__ref _createacceptbutton /*NSString**/ :nil];
B4IRDebugUtils.currentLine=14876710;
 //BA.debugLineNum = 14876710;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=14876711;
 //BA.debugLineNum = 14876711;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _update:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"update"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"update" :nil]);}
B4XFont* _f = nil;
B4XRect* _r = nil;
B4IRDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Public Sub Update";
B4IRDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dim f As B4XFont =  xui.CreateFont2(HintFont, Lar";
_f = [B4XFont new];
_f = [__ref->__xui /*B4IXUI**/  CreateFont2:__ref->__hintfont /*B4XFont**/  :__ref->__largelabeltextsize /*float*/ ];
B4IRDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = [B4XRect new];
_r = [__ref->__measuringcanvas /*B4XCanvas**/  MeasureText:__ref->__hinttext /*NSString**/  :_f];
B4IRDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="LargeFocused = CreateBitmap(r, HintColor, f)";
__ref->__largefocused /*B4XBitmapWrapper**/  = [__ref _createbitmap /*B4XBitmapWrapper**/ :nil :_r :__ref->__hintcolor /*int*/  :_f];
B4IRDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="LargeNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref->__largenotfocused /*B4XBitmapWrapper**/  = [__ref _createbitmap /*B4XBitmapWrapper**/ :nil :_r :__ref->__nonfocusedhintcolor /*int*/  :_f];
B4IRDebugUtils.currentLine=15532037;
 //BA.debugLineNum = 15532037;BA.debugLine="f = xui.CreateFont2(HintFont, SmallLabelTextSize)";
_f = [__ref->__xui /*B4IXUI**/  CreateFont2:__ref->__hintfont /*B4XFont**/  :__ref->__smalllabeltextsize /*float*/ ];
B4IRDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="Dim r As B4XRect = MeasuringCanvas.MeasureText(Hi";
_r = [B4XRect new];
_r = [__ref->__measuringcanvas /*B4XCanvas**/  MeasureText:__ref->__hinttext /*NSString**/  :_f];
B4IRDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="SmallFocused = CreateBitmap(r, HintColor, f)";
__ref->__smallfocused /*B4XBitmapWrapper**/  = [__ref _createbitmap /*B4XBitmapWrapper**/ :nil :_r :__ref->__hintcolor /*int*/  :_f];
B4IRDebugUtils.currentLine=15532040;
 //BA.debugLineNum = 15532040;BA.debugLine="SmallNotFocused = CreateBitmap(r, NonFocusedHintC";
__ref->__smallnotfocused /*B4XBitmapWrapper**/  = [__ref _createbitmap /*B4XBitmapWrapper**/ :nil :_r :__ref->__nonfocusedhintcolor /*int*/  :_f];
B4IRDebugUtils.currentLine=15532041;
 //BA.debugLineNum = 15532041;BA.debugLine="UpdateLabel(mTextField.Text, True)";
[__ref _updatelabel /*NSString**/ :nil :[__ref->__mtextfield /*B4XViewWrapper**/  Text] :true];
B4IRDebugUtils.currentLine=15532042;
 //BA.debugLineNum = 15532042;BA.debugLine="End Sub";
return @"";
}
- (b4i_b4xfloattextfield*)  _getnextfield:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"getnextfield"])
	 {return ((b4i_b4xfloattextfield*) [B4IDebug delegate:self.bi :@"getnextfield" :nil]);}
B4IRDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Public Sub getNextField As B4XFloatTextField";
B4IRDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="Return mNextTextField";
if (true) return __ref->__mnexttextfield /*b4i_b4xfloattextfield**/ ;
B4IRDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _gettext:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"gettext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"gettext" :nil]);}
B4IRDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Public Sub getText As String";
B4IRDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Return mTextField.Text";
if (true) return [__ref->__mtextfield /*B4XViewWrapper**/  Text];
B4IRDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _gettextfield:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"gettextfield"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"gettextfield" :nil]);}
B4IRDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Public Sub getTextField As B4XView";
B4IRDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Return mTextField";
if (true) return __ref->__mtextfield /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="End Sub";
return nil;
}
- (BOOL)  _ime_handleaction:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"ime_handleaction"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"ime_handleaction" :nil]).boolValue;}
B4IRDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Private Sub ime_HandleAction As Boolean";
B4IRDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="tf_EnterPressed";
[__ref _tf_enterpressed /*NSString**/ :nil];
B4IRDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="If mNextTextField.IsInitialized Then Return True";
if ([__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  IsInitialized /*BOOL*/ ]) { 
if (true) return true;};
B4IRDebugUtils.currentLine=16056323;
 //BA.debugLineNum = 16056323;BA.debugLine="Return False";
if (true) return false;
B4IRDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _tf_enterpressed:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"tf_enterpressed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tf_enterpressed" :nil]);}
B4IViewWrapper* _f = nil;
B4IRDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Private Sub tf_EnterPressed";
B4IRDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="tf_Action";
[__ref _tf_action /*NSString**/ :nil];
B4IRDebugUtils.currentLine=16121859;
 //BA.debugLineNum = 16121859;BA.debugLine="Dim f As View = mTextField";
_f = [B4IViewWrapper new];
_f.object = (UIView*)((__ref->__mtextfield /*B4XViewWrapper**/ ).object);
B4IRDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="f.ResignFocus";
[_f ResignFocus];
B4IRDebugUtils.currentLine=16121862;
 //BA.debugLineNum = 16121862;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xfloattextfield*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_callback],[B4I nilToNSNull:_eventname]]]);}
B4IRDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Public Sub Initialize (Callback As Object, EventNa";
B4IRDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="mEventName = EventName";
__ref->__meventname /*NSString**/  = _eventname;
B4IRDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="mCallBack = Callback";
__ref->__mcallback /*NSObject**/  = _callback;
B4IRDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="If xui.IsB4A Then";
if ([__ref->__xui /*B4IXUI**/  IsB4A]) { 
B4IRDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="HorizontalPadding = 6dip";
__ref->__horizontalpadding /*int*/  = ((int) (6));
 }else {
B4IRDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="HorizontalPadding = 12dip";
__ref->__horizontalpadding /*int*/  = ((int) (12));
 };
B4IRDebugUtils.currentLine=14811151;
 //BA.debugLineNum = 14811151;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _lc_click:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"lc_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"lc_click" :nil]);}
B4XViewWrapper* _btn = nil;
B4IRDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Private Sub lc_Click";
B4IRDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Dim btn As B4XView = Sender";
_btn = [B4XViewWrapper new];
_btn.object = (NSObject*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Select btn.Tag";
switch ([self.bi switchObjectToInt:[_btn Tag] :@[(NSObject*)(@"clear"),(NSObject*)(@"reveal"),(NSObject*)(@"hide"),(NSObject*)(@"v")]]) {
case 0: {
B4IRDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="setText(\"\")";
[__ref _settext /*NSString**/ :nil :@""];
 break; }
case 1: {
B4IRDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="SwitchFromPasswordToRegular (True)";
[__ref _switchfrompasswordtoregular /*NSString**/ :nil :true];
 break; }
case 2: {
B4IRDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="SwitchFromPasswordToRegular(False)";
[__ref _switchfrompasswordtoregular /*NSString**/ :nil :false];
 break; }
case 3: {
B4IRDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="tf_EnterPressed";
[__ref _tf_enterpressed /*NSString**/ :nil];
B4IRDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="If mNextTextField.IsInitialized = False Or mNex";
if ([__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  IsInitialized /*BOOL*/ ]==false || [__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  isEqual:(b4i_b4xfloattextfield*)(self)]) { 
 };
 break; }
}
;
B4IRDebugUtils.currentLine=16384019;
 //BA.debugLineNum = 16384019;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _settext:(b4i_b4xfloattextfield*) __ref :(NSString*) _s{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"settext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settext:" :@[[B4I nilToNSNull:_s]]]);}
NSString* _old = @"";
B4IRDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="Public Sub setText(s As String)";
B4IRDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim old As String = mTextField.Text 'ignore";
_old = [__ref->__mtextfield /*B4XViewWrapper**/  Text];
B4IRDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="mTextField.Text = s";
[__ref->__mtextfield /*B4XViewWrapper**/  setText:_s];
B4IRDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="tf_TextChanged (old, s)";
[__ref _tf_textchanged /*NSString**/ :nil :_old :_s];
B4IRDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _switchfrompasswordtoregular:(b4i_b4xfloattextfield*) __ref :(BOOL) _toregular{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"switchfrompasswordtoregular"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"switchfrompasswordtoregular:" :@[@(_toregular)]]);}
NSString* _text = @"";
int _textcolor = 0;
B4XFont* _font1 = nil;
B4IRDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Private Sub SwitchFromPasswordToRegular (ToRegular";
B4IRDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="Dim text As String = mTextField.Text";
_text = [__ref->__mtextfield /*B4XViewWrapper**/  Text];
B4IRDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim textcolor As Int = mTextField.TextColor";
_textcolor = [__ref->__mtextfield /*B4XViewWrapper**/  TextColor];
B4IRDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Dim Font1 As B4XFont = mTextField.Font";
_font1 = [B4XFont new];
_font1 = [__ref->__mtextfield /*B4XViewWrapper**/  Font];
B4IRDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="mTextField.RemoveViewFromParent";
[__ref->__mtextfield /*B4XViewWrapper**/  RemoveViewFromParent];
B4IRDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="CreateTextFieldAll(Not(ToRegular), Font1, textcol";
[__ref _createtextfieldall /*NSString**/ :nil :(!(_toregular)) :_font1 :_textcolor];
B4IRDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="mTextField.Text = text";
[__ref->__mtextfield /*B4XViewWrapper**/  setText:_text];
B4IRDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="If lblClear.IsInitialized Then";
if ([__ref->__lblclear /*B4XViewWrapper**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="If ToRegular = False Then";
if (_toregular==false) { 
B4IRDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="lblClear.Text = Chr(0xE8F4)";
[__ref->__lblclear /*B4XViewWrapper**/  setText:[self.bi CharToString:((unichar)((int) (0xe8f4)))]];
B4IRDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="lblClear.Tag = \"reveal\"";
[__ref->__lblclear /*B4XViewWrapper**/  setTag:(NSObject*)(@"reveal")];
 }else {
B4IRDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="lblClear.Tag = \"hide\"";
[__ref->__lblclear /*B4XViewWrapper**/  setTag:(NSObject*)(@"hide")];
B4IRDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="lblClear.Text = Chr(0xE8F5)";
[__ref->__lblclear /*B4XViewWrapper**/  setText:[self.bi CharToString:((unichar)((int) (0xe8f5)))]];
 };
B4IRDebugUtils.currentLine=15204367;
 //BA.debugLineNum = 15204367;BA.debugLine="lblClear.BringToFront";
[__ref->__lblclear /*B4XViewWrapper**/  BringToFront];
 };
B4IRDebugUtils.currentLine=15204369;
 //BA.debugLineNum = 15204369;BA.debugLine="If lblV.IsInitialized Then lblV.BringToFront";
if ([__ref->__lblv /*B4XViewWrapper**/  IsInitialized]) { 
[__ref->__lblv /*B4XViewWrapper**/  BringToFront];};
B4IRDebugUtils.currentLine=15204370;
 //BA.debugLineNum = 15204370;BA.debugLine="HintImageView.BringToFront";
[__ref->__hintimageview /*B4XViewWrapper**/  BringToFront];
B4IRDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=15204379;
 //BA.debugLineNum = 15204379;BA.debugLine="mTextField.RequestFocus";
[__ref->__mtextfield /*B4XViewWrapper**/  RequestFocus];
B4IRDebugUtils.currentLine=15204380;
 //BA.debugLineNum = 15204380;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _requestfocusandshowkeyboard:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"requestfocusandshowkeyboard"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"requestfocusandshowkeyboard" :nil]);}
B4IRDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="Public Sub RequestFocusAndShowKeyboard";
B4IRDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="mTextField.RequestFocus";
[__ref->__mtextfield /*B4XViewWrapper**/  RequestFocus];
B4IRDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _tf_textchanged:(b4i_b4xfloattextfield*) __ref :(NSString*) _old :(NSString*) _new{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"tf_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tf_textchanged::" :@[[B4I nilToNSNull:_old],[B4I nilToNSNull:_new]]]);}
B4IRDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Private Sub tf_TextChanged (Old As String, New As";
B4IRDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="UpdateLabel(New, False)";
[__ref _updatelabel /*NSString**/ :nil :_new :false];
B4IRDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_TextCh";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_TextChanged"] componentsJoinedByString:@""] :(int) (2)]) { 
B4IRDebugUtils.currentLine=15859715;
 //BA.debugLineNum = 15859715;BA.debugLine="CallSub3(mCallBack, mEventName & \"_TextChanged\",";
[self->___c CallSub3:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_TextChanged"] componentsJoinedByString:@""] :(NSObject*)(_old) :(NSObject*)(_new)];
 };
B4IRDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _tf_action:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"tf_action"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tf_action" :nil]);}
B4IRDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="Private Sub tf_Action";
B4IRDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="If mNextTextField.IsInitialized And mNextTextFiel";
if ([__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  IsInitialized /*BOOL*/ ] && [__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  isEqual:(b4i_b4xfloattextfield*)(self)] == false) { 
B4IRDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="mNextTextField.TextField.RequestFocus";
[[__ref->__mnexttextfield /*b4i_b4xfloattextfield**/  _gettextfield /*B4XViewWrapper**/ :nil] RequestFocus];
 };
B4IRDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="If xui.SubExists(mCallBack, mEventName & \"_EnterP";
if ([__ref->__xui /*B4IXUI**/  SubExists:__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_EnterPressed"] componentsJoinedByString:@""] :(int) (0)]) { 
B4IRDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="CallSubDelayed(mCallBack, mEventName & \"_EnterPr";
[self->___c CallSubDelayed:self.bi :__ref->__mcallback /*NSObject**/  :[@[__ref->__meventname /*NSString**/ ,@"_EnterPressed"] componentsJoinedByString:@""]];
 };
B4IRDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _tf_beginedit:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"tf_beginedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tf_beginedit" :nil]);}
B4IRDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="Private Sub tf_BeginEdit";
B4IRDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="tf_FocusChanged(True)";
[__ref _tf_focuschanged /*NSString**/ :nil :true];
B4IRDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _tf_focuschanged:(b4i_b4xfloattextfield*) __ref :(BOOL) _hasfocus{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"tf_focuschanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tf_focuschanged:" :@[@(_hasfocus)]]);}
B4IRDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Private Sub tf_FocusChanged (HasFocus As Boolean)";
B4IRDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="Focused = HasFocus";
__ref->__focused /*BOOL*/  = _hasfocus;
B4IRDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="UpdateLabel(mTextField.Text, True)";
[__ref _updatelabel /*NSString**/ :nil :[__ref->__mtextfield /*B4XViewWrapper**/  Text] :true];
B4IRDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _tf_endedit:(b4i_b4xfloattextfield*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xfloattextfield";
if ([B4IDebug shouldDelegate: @"tf_endedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"tf_endedit" :nil]);}
B4IRDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="Private Sub tf_EndEdit";
B4IRDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="tf_FocusChanged(False)";
[__ref _tf_focuschanged /*NSString**/ :nil :false];
B4IRDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="End Sub";
return @"";
}
@end