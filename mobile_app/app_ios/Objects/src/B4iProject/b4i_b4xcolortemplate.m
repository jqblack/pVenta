
#import "b4i_b4xcolortemplate.h"
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

@implementation _colorpickerpart
-(void)Initialize{
self.IsInitialized = true;
self->_cvs = [B4XCanvas new];
self->_pnl = [B4XViewWrapper new];
self->_iv = [B4XViewWrapper new];
self->_checkersCanvas = [B4XCanvas new];
self->_DrawCheckers = false;
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end
@interface ResumableSub_b4xcolortemplate_Show :B4IResumableSub 
- (instancetype) init: (b4i_b4xcolortemplate*) parent1 :(b4i_b4xcolortemplate*) __ref1 :(b4i_b4xdialog*) _dialog1;
@end
@implementation ResumableSub_b4xcolortemplate_Show {
b4i_b4xcolortemplate* parent;
b4i_b4xcolortemplate* __ref;
b4i_b4xdialog* _dialog;
}
- (instancetype) init: (b4i_b4xcolortemplate*) parent1 :(b4i_b4xcolortemplate*) __ref1 :(b4i_b4xdialog*) _dialog1 {
self->__ref = __ref1;
self->_dialog = _dialog1;
self->parent = parent1;
self->__ref = parent;
return self;
}
b4i_b4xcolortemplate* __ref;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = -1;
B4IRDebugUtils.currentLine=11403265;
 //BA.debugLineNum = 11403265;BA.debugLine="InitialColor = getSelectedHSVColor";
__ref->__initialcolor /*B4IArray**/  = [__ref _getselectedhsvcolor /*B4IArray**/ :nil];
B4IRDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="xDialog = Dialog";
__ref->__xdialog /*b4i_b4xdialog**/  = _dialog;
B4IRDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Sleep(0)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"b4xcolortemplate" :@"show"] :(int) (0)];
self->_state = 1;
return;
case 1:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="UpdateBarColor";
[__ref _updatebarcolor /*NSString**/ :nil];
B4IRDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_b4xcolortemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xcolortemplate) instance released.");
}

- (NSString*)  _alpha_touch:(b4i_b4xcolortemplate*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"alpha_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"alpha_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Private Sub Alpha_Touch (Action As Int, X As Float";
B4IRDebugUtils.currentLine=11730945;
 //BA.debugLineNum = 11730945;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==[__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_MOVE_NOTOUCH]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="AlphaBarSelectedChange(x)";
[__ref _alphabarselectedchange /*NSString**/ :nil :_x];
B4IRDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _alphabarselectedchange:(b4i_b4xcolortemplate*) __ref :(float) _x{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"alphabarselectedchange"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"alphabarselectedchange:" :@[@(_x)]]);}
B4XRect* _r = nil;
B4IRDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Private Sub AlphaBarSelectedChange(x As Float)";
B4IRDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="SelectedAlpha = 255 * Max(0, Min(1, x / AlphaBar.";
__ref->__selectedalpha /*int*/  = (int) (255*fmax(0,fmin(1,_x/(double)[__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width])));
B4IRDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="x = SelectedAlpha / 255 * AlphaBar.pnl.Width";
_x = (float) (__ref->__selectedalpha /*int*/ /(double)255*[__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width]);
B4IRDebugUtils.currentLine=10813443;
 //BA.debugLineNum = 10813443;BA.debugLine="AlphaBar.cvs.ClearRect(AlphaBar.cvs.TargetRect)";
[__ref->__alphabar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  ClearRect:[__ref->__alphabar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="r.Initialize(x - 3dip, 1dip, x + 3dip, AlphaBar.c";
[_r Initialize:(float) (_x-((int) (3))) :(float) (((int) (1))) :(float) (_x+((int) (3))) :(float) ([[__ref->__alphabar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  TargetRect] Bottom]-((int) (1)))];
B4IRDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="AlphaBar.cvs.DrawRect(r, xui.Color_Black, True, 2";
[__ref->__alphabar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  DrawRect:_r :[__ref->__xui /*B4IXUI**/  Color_Black] :true :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=10813447;
 //BA.debugLineNum = 10813447;BA.debugLine="AlphaBar.cvs.Invalidate";
[__ref->__alphabar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10813449;
 //BA.debugLineNum = 10813449;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _update:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"update"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"update" :nil]);}
B4IRDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Private Sub Update";
B4IRDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="DrawColors";
[__ref _drawcolors /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="HandleSelectedColorChanged(DONT_CHANGE, DONT_CHAN";
[__ref _handleselectedcolorchanged /*NSString**/ :nil :__ref->__dont_change /*int*/  :__ref->__dont_change /*int*/ ];
B4IRDebugUtils.currentLine=10878979;
 //BA.debugLineNum = 10878979;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base_resize:(b4i_b4xcolortemplate*) __ref :(double) _width :(double) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"base_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base_resize::" :@[@(_width),@(_height)]]);}
int _r = 0;
int _w = 0;
_colorpickerpart* _cpp = nil;
int _i = 0;
B4IRDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Private Sub Base_Resize (Width As Double, Height A";
B4IRDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="ColorScale = Max(1, Max(Width, Height) / 100 / De";
__ref->__colorscale /*float*/  = (float) (fmax(1,fmax(_width,_height)/(double)100/(double)__ref->__devicescale /*float*/ ));
B4IRDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="HueBar.pnl.SetLayoutAnimated(0, 1dip, 1dip, 30dip";
[__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (((int) (1))) :(float) (((int) (1))) :(float) (((int) (30))) :(float) (_height-((int) (2)))];
B4IRDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="Dim r As Int = HueBar.pnl.Width + HueBar.pnl.Left";
_r = (int) ([__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width]+[__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Left]+((int) (1)));
B4IRDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="Dim w As Int = Width - r - 1dip";
_w = (int) (_width-_r-((int) (1)));
B4IRDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="If xui.IsB4i Then";
if ([__ref->__xui /*B4IXUI**/  IsB4i]) { 
B4IRDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="r = r - 1";
_r = (int) (_r-1);
B4IRDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="w = w + 1";
_w = (int) (_w+1);
 };
B4IRDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="AlphaBar.pnl.SetLayoutAnimated(0, r, Height - 31d";
[__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (_r) :(float) (_height-((int) (31))) :(float) (_w) :(float) (((int) (30)))];
B4IRDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="ColorPicker.pnl.SetLayoutAnimated(0, r, 1dip, w,";
[__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (_r) :(float) (((int) (1))) :(float) (_w) :(float) (_height-((int) (3))-[__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height])];
B4IRDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="bcColors.Initialize(ColorPicker.pnl.Width / Color";
[__ref->__bccolors /*b4i_bitmapcreator**/  _initialize:self.bi :(int) ([__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width]/(double)__ref->__colorscale /*float*/ ) :(int) ([__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]/(double)__ref->__colorscale /*float*/ )];
B4IRDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="For Each cpp As ColorPickerPart In Array(HueBar,";
{
const id<B4IIterable> group12 = [[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(__ref->__huebar /*_colorpickerpart**/ )],[B4I nilToNSNull:(NSObject*)(__ref->__colorpicker /*_colorpickerpart**/ )],[B4I nilToNSNull:(NSObject*)(__ref->__alphabar /*_colorpickerpart**/ )]]];
const int groupLen12 = group12.Size
;int index12 = 0;
;
for (; index12 < groupLen12;index12++){
_cpp = (_colorpickerpart*)([group12 Get:index12]);
B4IRDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="For i = 0 To cpp.pnl.NumberOfViews - 1";
{
const int step13 = 1;
const int limit13 = (int) ([_cpp->_pnl /*B4XViewWrapper**/  NumberOfViews]-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
B4IRDebugUtils.currentLine=10420239;
 //BA.debugLineNum = 10420239;BA.debugLine="cpp.pnl.GetView(i).SetLayoutAnimated(0, 0, 0, c";
[[_cpp->_pnl /*B4XViewWrapper**/  GetView:_i] SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :[_cpp->_pnl /*B4XViewWrapper**/  Width] :[_cpp->_pnl /*B4XViewWrapper**/  Height]];
 }
};
B4IRDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="cpp.cvs.Resize(cpp.pnl.Width, cpp.pnl.Height)";
[_cpp->_cvs /*B4XCanvas**/  Resize:[_cpp->_pnl /*B4XViewWrapper**/  Width] :[_cpp->_pnl /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="If cpp.DrawCheckers Then";
if (_cpp->_DrawCheckers /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="DrawCheckers(cpp)";
[__ref _drawcheckers /*NSString**/ :nil :_cpp];
 };
 }
};
B4IRDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="DrawHueBar";
[__ref _drawhuebar /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="DrawAlphaBar";
[__ref _drawalphabar /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="HueBarSelectedChanged (selectedH / 360 * HueBar.p";
[__ref _huebarselectedchanged /*NSString**/ :nil :(float) (__ref->__selectedh /*float*/ /(double)360*[__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height])];
B4IRDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="AlphaBarSelectedChange (SelectedAlpha / 255 * Alp";
[__ref _alphabarselectedchange /*NSString**/ :nil :(float) (__ref->__selectedalpha /*int*/ /(double)255*[__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width])];
B4IRDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawcheckers:(b4i_b4xcolortemplate*) __ref :(_colorpickerpart*) _cpp{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"drawcheckers"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawcheckers:" :@[[B4I nilToNSNull:_cpp]]]);}
int _size = 0;
B4IArray* _clrs = nil;
int _clr = 0;
B4XRect* _r = nil;
int _x = 0;
int _xx = 0;
int _y = 0;
B4IRDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Private Sub DrawCheckers (cpp As ColorPickerPart)";
B4IRDebugUtils.currentLine=10485761;
 //BA.debugLineNum = 10485761;BA.debugLine="cpp.checkersCanvas.Resize(cpp.pnl.Width, cpp.pnl.";
[_cpp->_checkersCanvas /*B4XCanvas**/  Resize:[_cpp->_pnl /*B4XViewWrapper**/  Width] :[_cpp->_pnl /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="cpp.checkersCanvas.ClearRect(cpp.checkersCanvas.T";
[_cpp->_checkersCanvas /*B4XCanvas**/  ClearRect:[_cpp->_checkersCanvas /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="Dim size As Int = 10dip";
_size = ((int) (10));
B4IRDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Dim clrs() As Int = Array As Int(0xFFC0C0C0, 0xFF";
_clrs = [[B4IArray alloc]initObjectsWithData:@[@((int) (0xffc0c0c0)),@((int) (0xff757575))]];
B4IRDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="Dim clr As Int = 0";
_clr = (int) (0);
B4IRDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="For x = 0 To cpp.checkersCanvas.TargetRect.Right";
{
const int step7 = _size;
const int limit7 = (int) ([[_cpp->_checkersCanvas /*B4XCanvas**/  TargetRect] Right]-((int) (1)));
_x = (int) (0) ;
for (;(step7 > 0 && _x <= limit7) || (step7 < 0 && _x >= limit7) ;_x = ((int)(0 + _x + step7))  ) {
B4IRDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="Dim xx As Int = x / size";
_xx = (int) (_x/(double)_size);
B4IRDebugUtils.currentLine=10485769;
 //BA.debugLineNum = 10485769;BA.debugLine="clr = xx Mod 2";
_clr = (int) (_xx%2);
B4IRDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="For y = 0 To cpp.checkersCanvas.TargetRect.Botto";
{
const int step10 = _size;
const int limit10 = (int) ([[_cpp->_checkersCanvas /*B4XCanvas**/  TargetRect] Bottom]-((int) (1)));
_y = (int) (0) ;
for (;(step10 > 0 && _y <= limit10) || (step10 < 0 && _y >= limit10) ;_y = ((int)(0 + _y + step10))  ) {
B4IRDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="clr = (clr + 1) Mod 2";
_clr = (int) ((_clr+1)%2);
B4IRDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="r.Initialize(x, y, x + size, y + size)";
[_r Initialize:(float) (_x) :(float) (_y) :(float) (_x+_size) :(float) (_y+_size)];
B4IRDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="cpp.checkersCanvas.DrawRect(r, clrs(clr), True,";
[_cpp->_checkersCanvas /*B4XCanvas**/  DrawRect:_r :((NSNumber*)[_clrs getObjectFastN:_clr]).intValue :true :(float) (0)];
 }
};
 }
};
B4IRDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="cpp.checkersCanvas.Invalidate";
[_cpp->_checkersCanvas /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawhuebar:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"drawhuebar"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawhuebar" :nil]);}
b4i_bitmapcreator* _bchue = nil;
int _y = 0;
int _x = 0;
B4IRDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Private Sub DrawHueBar";
B4IRDebugUtils.currentLine=10551297;
 //BA.debugLineNum = 10551297;BA.debugLine="Dim bcHue As BitmapCreator";
_bchue = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="bcHue.Initialize(HueBar.pnl.Width / DeviceScale,";
[_bchue _initialize:self.bi :(int) ([__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width]/(double)__ref->__devicescale /*float*/ ) :(int) ([__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]/(double)__ref->__devicescale /*float*/ )];
B4IRDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="For y = 0 To bcHue.mHeight - 1";
{
const int step3 = 1;
const int limit3 = (int) (_bchue->__mheight-1);
_y = (int) (0) ;
for (;_y <= limit3 ;_y = _y + step3 ) {
B4IRDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="For x = 0 To bcHue.mWidth - 1";
{
const int step4 = 1;
const int limit4 = (int) (_bchue->__mwidth-1);
_x = (int) (0) ;
for (;_x <= limit4 ;_x = _x + step4 ) {
B4IRDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="bcHue.SetHSV(x, y, 255, 360 / bcHue.mHeight * y";
[_bchue _sethsv:_x :_y :(int) (255) :(int) (360/(double)_bchue->__mheight*_y) :(float) (1) :(float) (1)];
 }
};
 }
};
B4IRDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="HueBar.iv.SetBitmap(bcHue.Bitmap)";
[__ref->__huebar /*_colorpickerpart**/ ->_iv /*B4XViewWrapper**/  SetBitmap:(UIImage*)(([_bchue _getbitmap]).object)];
B4IRDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawalphabar:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"drawalphabar"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawalphabar" :nil]);}
b4i_bitmapcreator* _bc = nil;
_argbcolor* _argb = nil;
int _y = 0;
int _x = 0;
B4IRDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Private Sub DrawAlphaBar";
B4IRDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim bc As BitmapCreator";
_bc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="bc.Initialize(AlphaBar.pnl.Width / DeviceScale, A";
[_bc _initialize:self.bi :(int) ([__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width]/(double)__ref->__devicescale /*float*/ ) :(int) ([__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]/(double)__ref->__devicescale /*float*/ )];
B4IRDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="Dim argb As ARGBColor";
_argb = [_argbcolor new];
B4IRDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="argb.r = 0xcc";
_argb->_r = (int) (0xcc);
B4IRDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="argb.g = 0xcc";
_argb->_g = (int) (0xcc);
B4IRDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="argb.b = 0xcc";
_argb->_b = (int) (0xcc);
B4IRDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="For y = 0 To bc.mHeight - 1";
{
const int step7 = 1;
const int limit7 = (int) (_bc->__mheight-1);
_y = (int) (0) ;
for (;_y <= limit7 ;_y = _y + step7 ) {
B4IRDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="For x = 0 To bc.mWidth - 1";
{
const int step8 = 1;
const int limit8 = (int) (_bc->__mwidth-1);
_x = (int) (0) ;
for (;_x <= limit8 ;_x = _x + step8 ) {
B4IRDebugUtils.currentLine=10616842;
 //BA.debugLineNum = 10616842;BA.debugLine="argb.a = x / bc.mWidth * 255";
_argb->_a = (int) (_x/(double)_bc->__mwidth*255);
B4IRDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="bc.SetARGB(x, y, argb)";
[_bc _setargb:_x :_y :_argb];
 }
};
 }
};
B4IRDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="AlphaBar.iv.SetBitmap(bc.Bitmap)";
[__ref->__alphabar /*_colorpickerpart**/ ->_iv /*B4XViewWrapper**/  SetBitmap:(UIImage*)(([_bc _getbitmap]).object)];
B4IRDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _huebarselectedchanged:(b4i_b4xcolortemplate*) __ref :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"huebarselectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"huebarselectedchanged:" :@[@(_y)]]);}
B4XRect* _r = nil;
B4IRDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Private Sub HueBarSelectedChanged (y As Float)";
B4IRDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="selectedH = Max(0, Min(360, 360 * y / HueBar.pnl.";
__ref->__selectedh /*float*/  = (float) (fmax(0,fmin(360,360*_y/(double)[__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height])));
B4IRDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="y = selectedH * HueBar.pnl.Height / 360";
_y = (float) (__ref->__selectedh /*float*/ *[__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]/(double)360);
B4IRDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="HueBar.cvs.ClearRect(HueBar.cvs.TargetRect)";
[__ref->__huebar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  ClearRect:[__ref->__huebar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="r.Initialize(0, y - 3dip, HueBar.cvs.TargetRect.R";
[_r Initialize:(float) (0) :(float) (_y-((int) (3))) :[[__ref->__huebar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  TargetRect] Right] :(float) (_y+((int) (3)))];
B4IRDebugUtils.currentLine=10747910;
 //BA.debugLineNum = 10747910;BA.debugLine="HueBar.cvs.DrawRect(r, xui.Color_White, False, 2d";
[__ref->__huebar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  DrawRect:_r :[__ref->__xui /*B4IXUI**/  Color_White] :false :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="HueBar.cvs.Invalidate";
[__ref->__huebar /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=10747912;
 //BA.debugLineNum = 10747912;BA.debugLine="Update";
[__ref _update /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xcolortemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
B4IRDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="Public mBase As B4XView 'ignore";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Private xui As XUI 'ignore";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="Private SelectedAlpha As Int = 255";
self->__selectedalpha = (int) (255);
B4IRDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="Private bcColors As BitmapCreator";
self->__bccolors = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Private selectedH = 60, selectedS = 0.5, selected";
self->__selectedh = (float) (60);
self->__selecteds = (float) (0.5);
self->__selectedv = (float) (0.5);
B4IRDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Private DeviceScale, ColorScale As Float";
self->__devicescale = 0.0f;
self->__colorscale = 0.0f;
B4IRDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="Private tempBC As BitmapCreator";
self->__tempbc = [b4i_bitmapcreator new];
B4IRDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Private const DONT_CHANGE As Int = -999999999";
self->__dont_change = (int) (-999999999);
B4IRDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="Type ColorPickerPart (cvs As B4XCanvas, pnl As B4";
;
B4IRDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="Private HueBar, ColorPicker, AlphaBar As ColorPic";
self->__huebar = [_colorpickerpart new];
self->__colorpicker = [_colorpickerpart new];
self->__alphabar = [_colorpickerpart new];
B4IRDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="Private BordersColor As Int";
self->__borderscolor = 0;
B4IRDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="Private xDialog As B4XDialog";
self->__xdialog = [b4i_b4xdialog new];
B4IRDebugUtils.currentLine=10223629;
 //BA.debugLineNum = 10223629;BA.debugLine="Private InitialColor() As Object";
self->__initialcolor = [[B4IArray alloc]initObjects:@[@((int) (0))] :nil :@"NSObject"];
B4IRDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _colors_touch:(b4i_b4xcolortemplate*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"colors_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"colors_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Private Sub Colors_Touch (Action As Int, X As Floa";
B4IRDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==[__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_MOVE_NOTOUCH]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="HandleSelectedColorChanged(X, Y)";
[__ref _handleselectedcolorchanged /*NSString**/ :nil :(int) (_x) :(int) (_y)];
B4IRDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _handleselectedcolorchanged:(b4i_b4xcolortemplate*) __ref :(int) _x :(int) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"handleselectedcolorchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"handleselectedcolorchanged::" :@[@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Private Sub HandleSelectedColorChanged (x As Int,";
B4IRDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="If x <> DONT_CHANGE Then";
if (_x!=__ref->__dont_change /*int*/ ) { 
B4IRDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="selectedS = Max(0, Min(1, x / ColorPicker.pnl.Wi";
__ref->__selecteds /*float*/  = (float) (fmax(0,fmin(1,_x/(double)[__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width])));
B4IRDebugUtils.currentLine=10944515;
 //BA.debugLineNum = 10944515;BA.debugLine="selectedV = Max(0, Min(1, (ColorPicker.pnl.Heigh";
__ref->__selectedv /*float*/  = (float) (fmax(0,fmin(1,([__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]-_y)/(double)[__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height])));
 };
B4IRDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="ColorPicker.cvs.ClearRect(ColorPicker.cvs.TargetR";
[__ref->__colorpicker /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  ClearRect:[__ref->__colorpicker /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=10944518;
 //BA.debugLineNum = 10944518;BA.debugLine="ColorPicker.cvs.DrawCircle(selectedS * ColorPicke";
[__ref->__colorpicker /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  DrawCircle:(float) (__ref->__selecteds /*float*/ *[__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width]) :(float) ([__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]-__ref->__selectedv /*float*/ *[__ref->__colorpicker /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height]) :(float) (((int) (10))) :[__ref->__xui /*B4IXUI**/  Color_White] :false :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=10944520;
 //BA.debugLineNum = 10944520;BA.debugLine="ColorPicker.cvs.Invalidate";
[__ref->__colorpicker /*_colorpickerpart**/ ->_cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=10944521;
 //BA.debugLineNum = 10944521;BA.debugLine="UpdateBarColor";
[__ref _updatebarcolor /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10944522;
 //BA.debugLineNum = 10944522;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _colortohsv:(b4i_b4xcolortemplate*) __ref :(int) _clr{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"colortohsv"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"colortohsv:" :@[@(_clr)]]);}
int _a = 0;
int _r = 0;
int _g = 0;
int _b = 0;
float _h = 0.0f;
float _s = 0.0f;
float _v = 0.0f;
int _cmax = 0;
int _cmin = 0;
float _rc = 0.0f;
float _gc = 0.0f;
float _bc = 0.0f;
B4IRDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Public Sub ColorToHSV(clr As Int) As Object()";
B4IRDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="Dim a As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_a = (((int) (0xff)) & ((((unsigned int)_clr) >> ((int) (24)))));
B4IRDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim r As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_r = (((int) (0xff)) & ((((unsigned int)_clr) >> ((int) (16)))));
B4IRDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Dim g As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_g = (((int) (0xff)) & ((((unsigned int)_clr) >> ((int) (8)))));
B4IRDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Dim b As Int = Bit.And(0xff, Bit.UnsignedShiftRig";
_b = (((int) (0xff)) & ((((unsigned int)_clr) >> ((int) (0)))));
B4IRDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Dim h, s, v As Float";
_h = 0.0f;
_s = 0.0f;
_v = 0.0f;
B4IRDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Dim cmax As Int = Max(Max(r, g), b)";
_cmax = (int) (fmax(fmax(_r,_g),_b));
B4IRDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Dim cmin As Int = Min(Min(r, g), b)";
_cmin = (int) (fmin(fmin(_r,_g),_b));
B4IRDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="v = cmax / 255";
_v = (float) (_cmax/(double)255);
B4IRDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="If cmax <> 0 Then";
if (_cmax!=0) { 
B4IRDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="s = (cmax - cmin) / cmax";
_s = (float) ((_cmax-_cmin)/(double)_cmax);
 };
B4IRDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="If s = 0 Then";
if (_s==0) { 
B4IRDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="h = 0";
_h = (float) (0);
 }else {
B4IRDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="Dim rc As Float = (cmax - r) / (cmax - cmin)";
_rc = (float) ((_cmax-_r)/(double)(_cmax-_cmin));
B4IRDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="Dim gc As Float = (cmax - g) / (cmax - cmin)";
_gc = (float) ((_cmax-_g)/(double)(_cmax-_cmin));
B4IRDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="Dim bc As Float = (cmax - b) / (cmax - cmin)";
_bc = (float) ((_cmax-_b)/(double)(_cmax-_cmin));
B4IRDebugUtils.currentLine=11272210;
 //BA.debugLineNum = 11272210;BA.debugLine="If r = cmax Then";
if (_r==_cmax) { 
B4IRDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="h = bc - gc";
_h = (float) (_bc-_gc);
 }else if(_g==_cmax) { 
B4IRDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="h = 2 + rc - bc";
_h = (float) (2+_rc-_bc);
 }else {
B4IRDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="h = 4 + gc - rc";
_h = (float) (4+_gc-_rc);
 };
B4IRDebugUtils.currentLine=11272217;
 //BA.debugLineNum = 11272217;BA.debugLine="h = h / 6";
_h = (float) (_h/(double)6);
B4IRDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="If h < 0 Then h = h + 1";
if (_h<0) { 
_h = (float) (_h+1);};
 };
B4IRDebugUtils.currentLine=11272220;
 //BA.debugLineNum = 11272220;BA.debugLine="Return Array (h * 360, s, v, a)";
if (true) return [[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(_h*360))],[B4I nilToNSNull:(NSObject*)(@(_s))],[B4I nilToNSNull:(NSObject*)(@(_v))],[B4I nilToNSNull:(NSObject*)(@(_a))]]];
B4IRDebugUtils.currentLine=11272221;
 //BA.debugLineNum = 11272221;BA.debugLine="End Sub";
return nil;
}
- (_colorpickerpart*)  _createpanelforbitmapcreator:(b4i_b4xcolortemplate*) __ref :(NSString*) _eventname :(BOOL) _withcheckers{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"createpanelforbitmapcreator"])
	 {return ((_colorpickerpart*) [B4IDebug delegate:self.bi :@"createpanelforbitmapcreator::" :@[[B4I nilToNSNull:_eventname],@(_withcheckers)]]);}
_colorpickerpart* _cpp = nil;
B4IImageViewWrapper* _iv = nil;
B4XViewWrapper* _overlay = nil;
B4IRDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Private Sub CreatePanelForBitmapCreator (EventName";
B4IRDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim cpp As ColorPickerPart";
_cpp = [_colorpickerpart new];
B4IRDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="cpp.Initialize";
[_cpp Initialize];
B4IRDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="cpp.pnl = xui.CreatePanel(\"\")";
_cpp->_pnl /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="cpp.pnl.SetColorAndBorder(BordersColor, 1dip, Bor";
[_cpp->_pnl /*B4XViewWrapper**/  SetColorAndBorder:__ref->__borderscolor /*int*/  :(float) (((int) (1))) :__ref->__borderscolor /*int*/  :(float) (0)];
B4IRDebugUtils.currentLine=10354693;
 //BA.debugLineNum = 10354693;BA.debugLine="cpp.pnl.SetLayoutAnimated(0, 1dip, 1dip, 1dip, 1d";
[_cpp->_pnl /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (((int) (1))) :(float) (((int) (1))) :(float) (((int) (1))) :(float) (((int) (1)))];
B4IRDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="If WithCheckers Then";
if (_withcheckers) { 
B4IRDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="cpp.checkersCanvas.Initialize(cpp.pnl)";
[_cpp->_checkersCanvas /*B4XCanvas**/  Initialize:(UIView*)((_cpp->_pnl /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="cpp.DrawCheckers = True";
_cpp->_DrawCheckers /*BOOL*/  = true;
 };
B4IRDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="Dim iv As ImageView";
_iv = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="iv.Initialize(\"\")";
[_iv Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=10354700;
 //BA.debugLineNum = 10354700;BA.debugLine="cpp.iv = iv";
_cpp->_iv /*B4XViewWrapper**/ .object = (NSObject*)((_iv).object);
B4IRDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="Dim overlay As B4XView = xui.CreatePanel(EventNam";
_overlay = [B4XViewWrapper new];
_overlay = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :_eventname];
B4IRDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="cpp.pnl.AddView(iv, 0, 0, 0, 0)";
[_cpp->_pnl /*B4XViewWrapper**/  AddView:(UIView*)((_iv).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="cpp.pnl.AddView(overlay, 1dip, 1dip, 1dip, 1dip)";
[_cpp->_pnl /*B4XViewWrapper**/  AddView:(UIView*)((_overlay).object) :(float) (((int) (1))) :(float) (((int) (1))) :(float) (((int) (1))) :(float) (((int) (1)))];
B4IRDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="cpp.cvs.Initialize(overlay)";
[_cpp->_cvs /*B4XCanvas**/  Initialize:(UIView*)((_overlay).object)];
B4IRDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="mBase.AddView(cpp.pnl, 0, 0, 0, 0)";
[__ref->__mbase /*B4XViewWrapper**/  AddView:(UIView*)((_cpp->_pnl /*B4XViewWrapper**/ ).object) :(float) (0) :(float) (0) :(float) (0) :(float) (0)];
B4IRDebugUtils.currentLine=10354706;
 //BA.debugLineNum = 10354706;BA.debugLine="Return cpp";
if (true) return _cpp;
B4IRDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _dialogclosed:(b4i_b4xcolortemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Private Sub DialogClosed(Result As Int)";
B4IRDebugUtils.currentLine=11468801;
 //BA.debugLineNum = 11468801;BA.debugLine="If Result <> xui.DialogResponse_Positive Then";
if (_result!=[__ref->__xui /*B4IXUI**/  DialogResponse_Positive]) { 
B4IRDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="setSelectedHSVColor(InitialColor)";
[__ref _setselectedhsvcolor /*NSString**/ :nil :__ref->__initialcolor /*B4IArray**/ ];
 };
B4IRDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setselectedhsvcolor:(b4i_b4xcolortemplate*) __ref :(B4IArray*) _hsv{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"setselectedhsvcolor"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setselectedhsvcolor:" :@[[B4I nilToNSNull:_hsv]]]);}
B4IRDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Public Sub setSelectedHSVColor (HSV() As Object)";
B4IRDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="selectedH = HSV(0)";
__ref->__selectedh /*float*/  = [self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (0)])].floatValue;
B4IRDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="selectedS = HSV(1)";
__ref->__selecteds /*float*/  = [self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (1)])].floatValue;
B4IRDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="selectedV = HSV(2)";
__ref->__selectedv /*float*/  = [self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (2)])].floatValue;
B4IRDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="SelectedAlpha = HSV(3)";
__ref->__selectedalpha /*int*/  = [self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (3)])].intValue;
B4IRDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="HueBarSelectedChanged(selectedH / 360 * HueBar.pn";
[__ref _huebarselectedchanged /*NSString**/ :nil :(float) (__ref->__selectedh /*float*/ /(double)360*[__ref->__huebar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Height])];
B4IRDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="AlphaBarSelectedChange(SelectedAlpha / 255 * Alph";
[__ref _alphabarselectedchange /*NSString**/ :nil :(float) (__ref->__selectedalpha /*int*/ /(double)255*[__ref->__alphabar /*_colorpickerpart**/ ->_pnl /*B4XViewWrapper**/  Width])];
B4IRDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawcolors:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"drawcolors"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawcolors" :nil]);}
int _x = 0;
int _y = 0;
B4IRDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Private Sub DrawColors";
B4IRDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="For x = 0 To bcColors.mWidth - 1";
{
const int step1 = 1;
const int limit1 = (int) (__ref->__bccolors /*b4i_bitmapcreator**/ ->__mwidth-1);
_x = (int) (0) ;
for (;_x <= limit1 ;_x = _x + step1 ) {
B4IRDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="For y = 0 To bcColors.mHeight - 1";
{
const int step2 = 1;
const int limit2 = (int) (__ref->__bccolors /*b4i_bitmapcreator**/ ->__mheight-1);
_y = (int) (0) ;
for (;_y <= limit2 ;_y = _y + step2 ) {
B4IRDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="bcColors.SetHSV(x, y, SelectedAlpha, selectedH,";
[__ref->__bccolors /*b4i_bitmapcreator**/  _sethsv:_x :_y :__ref->__selectedalpha /*int*/  :(int) (__ref->__selectedh /*float*/ ) :(float) (_x/(double)__ref->__bccolors /*b4i_bitmapcreator**/ ->__mwidth) :(float) ((__ref->__bccolors /*b4i_bitmapcreator**/ ->__mheight-_y)/(double)__ref->__bccolors /*b4i_bitmapcreator**/ ->__mheight)];
 }
};
 }
};
B4IRDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="ColorPicker.iv.SetBitmap(bcColors.Bitmap.Resize(C";
[__ref->__colorpicker /*_colorpickerpart**/ ->_iv /*B4XViewWrapper**/  SetBitmap:(UIImage*)(([[__ref->__bccolors /*b4i_bitmapcreator**/  _getbitmap] Resize:[__ref->__colorpicker /*_colorpickerpart**/ ->_iv /*B4XViewWrapper**/  Width] :[__ref->__colorpicker /*_colorpickerpart**/ ->_iv /*B4XViewWrapper**/  Height] :false]).object)];
B4IRDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _getpanel:(b4i_b4xcolortemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="End Sub";
return nil;
}
- (int)  _getselectedcolor:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"getselectedcolor"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getselectedcolor" :nil]).intValue;}
B4IArray* _hsv = nil;
B4IRDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Public Sub getSelectedColor As Int";
B4IRDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim hsv() As Object = getSelectedHSVColor";
_hsv = [__ref _getselectedhsvcolor /*B4IArray**/ :nil];
B4IRDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="tempBC.SetHSV(0, 0, SelectedAlpha, hsv(0), hsv(1)";
[__ref->__tempbc /*b4i_bitmapcreator**/  _sethsv:(int) (0) :(int) (0) :__ref->__selectedalpha /*int*/  :[self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (0)])].intValue :[self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (1)])].floatValue :[self.bi ObjectToNumber:((NSObject*)[_hsv getObjectFast:(int) (2)])].floatValue];
B4IRDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Return tempBC.GetColor(0, 0)";
if (true) return [__ref->__tempbc /*b4i_bitmapcreator**/  _getcolor:(int) (0) :(int) (0)];
B4IRDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="End Sub";
return 0;
}
- (B4IArray*)  _getselectedhsvcolor:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"getselectedhsvcolor"])
	 {return ((B4IArray*) [B4IDebug delegate:self.bi :@"getselectedhsvcolor" :nil]);}
B4IRDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Public Sub getSelectedHSVColor As Object()";
B4IRDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Return Array (selectedH, selectedS, selectedV, Se";
if (true) return [[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@(__ref->__selectedh /*float*/ ))],[B4I nilToNSNull:(NSObject*)(@(__ref->__selecteds /*float*/ ))],[B4I nilToNSNull:(NSObject*)(@(__ref->__selectedv /*float*/ ))],[B4I nilToNSNull:(NSObject*)(@(__ref->__selectedalpha /*int*/ ))]]];
B4IRDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _updatebarcolor:(b4i_b4xcolortemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"updatebarcolor"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updatebarcolor" :nil]);}
B4IRDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Private Sub UpdateBarColor";
B4IRDebugUtils.currentLine=11534337;
 //BA.debugLineNum = 11534337;BA.debugLine="If xDialog.IsInitialized And xDialog.TitleBar.IsI";
if ([__ref->__xdialog /*b4i_b4xdialog**/  IsInitialized /*BOOL*/ ] && [__ref->__xdialog /*b4i_b4xdialog**/ ->__titlebar /*B4XViewWrapper**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="xDialog.TitleBar.Color = getSelectedColor";
[__ref->__xdialog /*b4i_b4xdialog**/ ->__titlebar /*B4XViewWrapper**/  setColor:[__ref _getselectedcolor /*int*/ :nil]];
 };
B4IRDebugUtils.currentLine=11534340;
 //BA.debugLineNum = 11534340;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _huebar_touch:(b4i_b4xcolortemplate*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"huebar_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"huebar_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4IRDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Private Sub HueBar_Touch (Action As Int, X As Floa";
B4IRDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="If Action = mBase.TOUCH_ACTION_MOVE_NOTOUCH Then";
if (_action==[__ref->__mbase /*B4XViewWrapper**/  TOUCH_ACTION_MOVE_NOTOUCH]) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="HueBarSelectedChanged(Y)";
[__ref _huebarselectedchanged /*NSString**/ :nil :_y];
B4IRDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xcolortemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="tempBC.Initialize(1, 1)";
[__ref->__tempbc /*b4i_bitmapcreator**/  _initialize:self.bi :(int) (1) :(int) (1)];
B4IRDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="DeviceScale = 100dip / 100";
__ref->__devicescale /*float*/  = (float) (((int) (100))/(double)100);
B4IRDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="mBase = xui.CreatePanel(\"\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 250dip)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (((int) (250)))];
B4IRDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="BordersColor = xui.Color_Black";
__ref->__borderscolor /*int*/  = [__ref->__xui /*B4IXUI**/  Color_Black];
B4IRDebugUtils.currentLine=10289158;
 //BA.debugLineNum = 10289158;BA.debugLine="mBase.SetColorAndBorder(BordersColor, 1dip, Borde";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:__ref->__borderscolor /*int*/  :(float) (((int) (1))) :__ref->__borderscolor /*int*/  :(float) (((int) (2)))];
B4IRDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="HueBar = CreatePanelForBitmapCreator(\"hueBar\", Fa";
__ref->__huebar /*_colorpickerpart**/  = [__ref _createpanelforbitmapcreator /*_colorpickerpart**/ :nil :@"hueBar" :false];
B4IRDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="ColorPicker = CreatePanelForBitmapCreator(\"colors";
__ref->__colorpicker /*_colorpickerpart**/  = [__ref _createpanelforbitmapcreator /*_colorpickerpart**/ :nil :@"colors" :true];
B4IRDebugUtils.currentLine=10289161;
 //BA.debugLineNum = 10289161;BA.debugLine="AlphaBar = CreatePanelForBitmapCreator(\"alpha\", T";
__ref->__alphabar /*_colorpickerpart**/  = [__ref _createpanelforbitmapcreator /*_colorpickerpart**/ :nil :@"alpha" :true];
B4IRDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="Base_Resize(mBase.Width, mBase.Height)";
[__ref _base_resize /*NSString**/ :nil :[__ref->__mbase /*B4XViewWrapper**/  Width] :[__ref->__mbase /*B4XViewWrapper**/  Height]];
B4IRDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setselectedcolor:(b4i_b4xcolortemplate*) __ref :(int) _i{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"setselectedcolor"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setselectedcolor:" :@[@(_i)]]);}
B4IRDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Public Sub setSelectedColor(i As Int)";
B4IRDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="setSelectedHSVColor(ColorToHSV(i))";
[__ref _setselectedhsvcolor /*NSString**/ :nil :[__ref _colortohsv /*B4IArray**/ :nil :_i]];
B4IRDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="End Sub";
return @"";
}
- (void)  _show:(b4i_b4xcolortemplate*) __ref :(b4i_b4xdialog*) _dialog{
B4IRDebugUtils.currentModule=@"b4xcolortemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {[B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]; return;}
ResumableSub_b4xcolortemplate_Show* rsub = [[ResumableSub_b4xcolortemplate_Show alloc] init:self : __ref: _dialog];
[rsub resume:self.bi :nil];
}
//1105031134
@end