
#import "b4i_b4xformatter.h"
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
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"

@implementation _b4xformatdata
-(void)Initialize{
self.IsInitialized = true;
self->_Prefix = @"";
self->_Postfix = @"";
self->_MinimumIntegers = 0;
self->_MinimumFractions = 0;
self->_MaximumFractions = 0;
self->_GroupingCharacter = @"";
self->_DecimalPoint = @"";
self->_TextColor = 0;
self->_FormatFont = [B4XFont new];
self->_RangeStart = 0.0;
self->_RangeEnd = 0.0;
self->_RemoveMinusSign = false;
self->_IntegerPaddingChar = @"";
self->_FractionPaddingChar = @"";
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_b4xformatter 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xformatter) instance released.");
}

- (_b4xformatdata*)  _getdefaultformat:(b4i_b4xformatter*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"getdefaultformat"])
	 {return ((_b4xformatdata*) [B4IDebug delegate:self.bi :@"getdefaultformat" :nil]);}
B4IRDebugUtils.currentLine=23199744;
 //BA.debugLineNum = 23199744;BA.debugLine="Public Sub GetDefaultFormat As B4XFormatData";
B4IRDebugUtils.currentLine=23199745;
 //BA.debugLineNum = 23199745;BA.debugLine="Return formats.Get(0)";
if (true) return (_b4xformatdata*)([__ref->__formats /*B4IList**/  Get:(int) (0)]);
B4IRDebugUtils.currentLine=23199746;
 //BA.debugLineNum = 23199746;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _format:(b4i_b4xformatter*) __ref :(double) _number{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"format"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"format:" :@[@(_number)]]);}
_b4xformatdata* _data = nil;
B4IStringBuilder* _sb = nil;
int _numberstartindex = 0;
double _factor = 0.0;
int _whole = 0;
double _frac = 0.0;
int _g = 0;
int _fracstartindex = 0;
int _lastzerocount = 0;
int _multipler = 0;
int _w = 0;
B4IRDebugUtils.currentLine=23330816;
 //BA.debugLineNum = 23330816;BA.debugLine="Public Sub Format (Number As Double) As String";
B4IRDebugUtils.currentLine=23330817;
 //BA.debugLineNum = 23330817;BA.debugLine="If Number < MIN_VALUE Or Number > MAX_VALUE Then";
if (_number<__ref->__min_value /*int*/  || _number>__ref->__max_value /*int*/ ) { 
if (true) return @"OVERFLOW";};
B4IRDebugUtils.currentLine=23330818;
 //BA.debugLineNum = 23330818;BA.debugLine="Dim data As B4XFormatData = GetFormatData (Number";
_data = [__ref _getformatdata /*_b4xformatdata**/ :nil :_number];
B4IRDebugUtils.currentLine=23330819;
 //BA.debugLineNum = 23330819;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
B4IRDebugUtils.currentLine=23330820;
 //BA.debugLineNum = 23330820;BA.debugLine="sb.Initialize";
[_sb Initialize];
B4IRDebugUtils.currentLine=23330821;
 //BA.debugLineNum = 23330821;BA.debugLine="sb.Append(data.Prefix)";
[_sb Append:_data->_Prefix /*NSString**/ ];
B4IRDebugUtils.currentLine=23330822;
 //BA.debugLineNum = 23330822;BA.debugLine="Dim NumberStartIndex As Int = sb.Length";
_numberstartindex = [_sb Length];
B4IRDebugUtils.currentLine=23330823;
 //BA.debugLineNum = 23330823;BA.debugLine="Dim factor As Double = Power(10, -data.MaximumFra";
_factor = pow(10,-_data->_MaximumFractions /*int*/ -1)*5;
B4IRDebugUtils.currentLine=23330824;
 //BA.debugLineNum = 23330824;BA.debugLine="If Number < -factor And data.RemoveMinusSign = Fa";
if (_number<-_factor && _data->_RemoveMinusSign /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=23330825;
 //BA.debugLineNum = 23330825;BA.debugLine="sb.Append(\"-\")";
[_sb Append:@"-"];
B4IRDebugUtils.currentLine=23330826;
 //BA.debugLineNum = 23330826;BA.debugLine="NumberStartIndex = NumberStartIndex + 1";
_numberstartindex = (int) (_numberstartindex+1);
 };
B4IRDebugUtils.currentLine=23330828;
 //BA.debugLineNum = 23330828;BA.debugLine="Number = Abs(Number) + factor";
_number = fabs(_number)+_factor;
B4IRDebugUtils.currentLine=23330829;
 //BA.debugLineNum = 23330829;BA.debugLine="Dim whole As Int = Number";
_whole = (int) (_number);
B4IRDebugUtils.currentLine=23330830;
 //BA.debugLineNum = 23330830;BA.debugLine="Dim frac As Double = Number - whole";
_frac = _number-_whole;
B4IRDebugUtils.currentLine=23330831;
 //BA.debugLineNum = 23330831;BA.debugLine="Dim g As Int";
_g = 0;
B4IRDebugUtils.currentLine=23330832;
 //BA.debugLineNum = 23330832;BA.debugLine="Do While whole > 0";
while (_whole>0) {
B4IRDebugUtils.currentLine=23330833;
 //BA.debugLineNum = 23330833;BA.debugLine="If g > 0 And g Mod 3 = 0 And data.GroupingCharac";
if (_g>0 && _g%3==0 && [_data->_GroupingCharacter /*NSString**/  Length]>0) { 
B4IRDebugUtils.currentLine=23330834;
 //BA.debugLineNum = 23330834;BA.debugLine="sb.Insert(NumberStartIndex, data.GroupingCharac";
[_sb Insert:_numberstartindex :_data->_GroupingCharacter /*NSString**/ ];
 };
B4IRDebugUtils.currentLine=23330836;
 //BA.debugLineNum = 23330836;BA.debugLine="g = g + 1";
_g = (int) (_g+1);
B4IRDebugUtils.currentLine=23330837;
 //BA.debugLineNum = 23330837;BA.debugLine="sb.Insert(NumberStartIndex, whole Mod 10)";
[_sb Insert:_numberstartindex :[self.bi NumberToString:@(_whole%10)]];
B4IRDebugUtils.currentLine=23330838;
 //BA.debugLineNum = 23330838;BA.debugLine="whole = whole / 10";
_whole = (int) (_whole/(double)10);
 }
;
B4IRDebugUtils.currentLine=23330840;
 //BA.debugLineNum = 23330840;BA.debugLine="Do While sb.Length - NumberStartIndex < data.Mini";
while ([_sb Length]-_numberstartindex<_data->_MinimumIntegers /*int*/ ) {
B4IRDebugUtils.currentLine=23330841;
 //BA.debugLineNum = 23330841;BA.debugLine="sb.Insert(NumberStartIndex, data.IntegerPaddingC";
[_sb Insert:_numberstartindex :_data->_IntegerPaddingChar /*NSString**/ ];
 }
;
B4IRDebugUtils.currentLine=23330843;
 //BA.debugLineNum = 23330843;BA.debugLine="If data.MaximumFractions > 0 And (data.MinimumFra";
if (_data->_MaximumFractions /*int*/ >0 && (_data->_MinimumFractions /*int*/ >0 || _frac>0)) { 
B4IRDebugUtils.currentLine=23330844;
 //BA.debugLineNum = 23330844;BA.debugLine="Dim FracStartIndex As Int = sb.Length";
_fracstartindex = [_sb Length];
B4IRDebugUtils.currentLine=23330845;
 //BA.debugLineNum = 23330845;BA.debugLine="Dim LastZeroCount As Int";
_lastzerocount = 0;
B4IRDebugUtils.currentLine=23330846;
 //BA.debugLineNum = 23330846;BA.debugLine="Dim Multipler As Int = 10";
_multipler = (int) (10);
B4IRDebugUtils.currentLine=23330847;
 //BA.debugLineNum = 23330847;BA.debugLine="Do While frac >= 2 * factor And sb.Length - Frac";
while (_frac>=2*_factor && [_sb Length]-_fracstartindex<_data->_MaximumFractions /*int*/ ) {
B4IRDebugUtils.currentLine=23330848;
 //BA.debugLineNum = 23330848;BA.debugLine="Dim w As Int = (frac * Multipler)";
_w = (int) ((_frac*_multipler));
B4IRDebugUtils.currentLine=23330849;
 //BA.debugLineNum = 23330849;BA.debugLine="w = w Mod 10";
_w = (int) (_w%10);
B4IRDebugUtils.currentLine=23330850;
 //BA.debugLineNum = 23330850;BA.debugLine="If w = 0 Then LastZeroCount = LastZeroCount + 1";
if (_w==0) { 
_lastzerocount = (int) (_lastzerocount+1);}
else {
_lastzerocount = (int) (0);};
B4IRDebugUtils.currentLine=23330851;
 //BA.debugLineNum = 23330851;BA.debugLine="sb.Append(w)";
[_sb Append:[self.bi NumberToString:@(_w)]];
B4IRDebugUtils.currentLine=23330852;
 //BA.debugLineNum = 23330852;BA.debugLine="Multipler = Multipler * 10";
_multipler = (int) (_multipler*10);
 }
;
B4IRDebugUtils.currentLine=23330854;
 //BA.debugLineNum = 23330854;BA.debugLine="If data.FractionPaddingChar <> \"0\" And LastZeroC";
if ([_data->_FractionPaddingChar /*NSString**/  isEqual:@"0"] == false && _lastzerocount>0) { 
B4IRDebugUtils.currentLine=23330855;
 //BA.debugLineNum = 23330855;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
[_sb Remove:(int) ([_sb Length]-_lastzerocount) :[_sb Length]];
B4IRDebugUtils.currentLine=23330856;
 //BA.debugLineNum = 23330856;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 };
B4IRDebugUtils.currentLine=23330858;
 //BA.debugLineNum = 23330858;BA.debugLine="Do While sb.Length - FracStartIndex < data.Minim";
while ([_sb Length]-_fracstartindex<_data->_MinimumFractions /*int*/ ) {
B4IRDebugUtils.currentLine=23330859;
 //BA.debugLineNum = 23330859;BA.debugLine="sb.Append(data.FractionPaddingChar)";
[_sb Append:_data->_FractionPaddingChar /*NSString**/ ];
B4IRDebugUtils.currentLine=23330860;
 //BA.debugLineNum = 23330860;BA.debugLine="LastZeroCount = 0";
_lastzerocount = (int) (0);
 }
;
B4IRDebugUtils.currentLine=23330862;
 //BA.debugLineNum = 23330862;BA.debugLine="LastZeroCount = Min(LastZeroCount, sb.Length - F";
_lastzerocount = (int) (fmin(_lastzerocount,[_sb Length]-_fracstartindex-_data->_MinimumFractions /*int*/ ));
B4IRDebugUtils.currentLine=23330863;
 //BA.debugLineNum = 23330863;BA.debugLine="If LastZeroCount > 0 Then";
if (_lastzerocount>0) { 
B4IRDebugUtils.currentLine=23330864;
 //BA.debugLineNum = 23330864;BA.debugLine="sb.Remove(sb.Length - LastZeroCount, sb.Length)";
[_sb Remove:(int) ([_sb Length]-_lastzerocount) :[_sb Length]];
 };
B4IRDebugUtils.currentLine=23330866;
 //BA.debugLineNum = 23330866;BA.debugLine="If sb.Length > FracStartIndex Then sb.Insert(Fra";
if ([_sb Length]>_fracstartindex) { 
[_sb Insert:_fracstartindex :_data->_DecimalPoint /*NSString**/ ];};
 };
B4IRDebugUtils.currentLine=23330868;
 //BA.debugLineNum = 23330868;BA.debugLine="sb.Append(data.Postfix)";
[_sb Append:_data->_Postfix /*NSString**/ ];
B4IRDebugUtils.currentLine=23330869;
 //BA.debugLineNum = 23330869;BA.debugLine="Return sb.ToString";
if (true) return [_sb ToString];
B4IRDebugUtils.currentLine=23330870;
 //BA.debugLineNum = 23330870;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xformatter*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
_b4xformatdata* _d = nil;
B4IRDebugUtils.currentLine=22872064;
 //BA.debugLineNum = 22872064;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=22872065;
 //BA.debugLineNum = 22872065;BA.debugLine="formats.Initialize";
[__ref->__formats /*B4IList**/  Initialize];
B4IRDebugUtils.currentLine=22872066;
 //BA.debugLineNum = 22872066;BA.debugLine="Dim d As B4XFormatData = CreateDefaultFormat";
_d = [__ref _createdefaultformat /*_b4xformatdata**/ :nil];
B4IRDebugUtils.currentLine=22872067;
 //BA.debugLineNum = 22872067;BA.debugLine="AddFormatData(d, MIN_VALUE, MAX_VALUE, True)";
[__ref _addformatdata /*NSString**/ :nil :_d :__ref->__min_value /*int*/  :__ref->__max_value /*int*/  :true];
B4IRDebugUtils.currentLine=22872068;
 //BA.debugLineNum = 22872068;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addformatdata:(b4i_b4xformatter*) __ref :(_b4xformatdata*) _data :(double) _rangestart :(double) _rangeend :(BOOL) _includeedges{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"addformatdata"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addformatdata::::" :@[[B4I nilToNSNull:_data],@(_rangestart),@(_rangeend),@(_includeedges)]]);}
double _factor = 0.0;
B4IRDebugUtils.currentLine=23134208;
 //BA.debugLineNum = 23134208;BA.debugLine="Public Sub AddFormatData (Data As B4XFormatData, R";
B4IRDebugUtils.currentLine=23134209;
 //BA.debugLineNum = 23134209;BA.debugLine="Dim factor As Double = Power(10, -Data.MaximumFra";
_factor = pow(10,-_data->_MaximumFractions /*int*/ );
B4IRDebugUtils.currentLine=23134210;
 //BA.debugLineNum = 23134210;BA.debugLine="If IncludeEdges = False Then";
if (_includeedges==false) { 
B4IRDebugUtils.currentLine=23134211;
 //BA.debugLineNum = 23134211;BA.debugLine="RangeStart = RangeStart + factor";
_rangestart = _rangestart+_factor;
B4IRDebugUtils.currentLine=23134212;
 //BA.debugLineNum = 23134212;BA.debugLine="RangeEnd = RangeEnd - factor";
_rangeend = _rangeend-_factor;
 };
B4IRDebugUtils.currentLine=23134214;
 //BA.debugLineNum = 23134214;BA.debugLine="RangeStart = RangeStart - factor / 2";
_rangestart = _rangestart-_factor/(double)2;
B4IRDebugUtils.currentLine=23134215;
 //BA.debugLineNum = 23134215;BA.debugLine="RangeEnd = RangeEnd + factor / 2";
_rangeend = _rangeend+_factor/(double)2;
B4IRDebugUtils.currentLine=23134216;
 //BA.debugLineNum = 23134216;BA.debugLine="Data.RangeStart = RangeStart";
_data->_RangeStart /*double*/  = _rangestart;
B4IRDebugUtils.currentLine=23134217;
 //BA.debugLineNum = 23134217;BA.debugLine="Data.RangeEnd = RangeEnd";
_data->_RangeEnd /*double*/  = _rangeend;
B4IRDebugUtils.currentLine=23134218;
 //BA.debugLineNum = 23134218;BA.debugLine="formats.Add(Data)";
[__ref->__formats /*B4IList**/  Add:(NSObject*)(_data)];
B4IRDebugUtils.currentLine=23134219;
 //BA.debugLineNum = 23134219;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xformatter*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xformatter";
B4IRDebugUtils.currentLine=22806528;
 //BA.debugLineNum = 22806528;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=22806529;
 //BA.debugLineNum = 22806529;BA.debugLine="Type B4XFormatData (Prefix As String, Postfix As";
;
B4IRDebugUtils.currentLine=22806533;
 //BA.debugLineNum = 22806533;BA.debugLine="Private formats As List";
self->__formats = [B4IList new];
B4IRDebugUtils.currentLine=22806534;
 //BA.debugLineNum = 22806534;BA.debugLine="Public Const MAX_VALUE = 0x7fffffff, MIN_VALUE =";
self->__max_value = (int) (0x7fffffff);
self->__min_value = (int) (0x80000000);
B4IRDebugUtils.currentLine=22806535;
 //BA.debugLineNum = 22806535;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=22806536;
 //BA.debugLineNum = 22806536;BA.debugLine="End Sub";
return @"";
}
- (_b4xformatdata*)  _copyformatdata:(b4i_b4xformatter*) __ref :(_b4xformatdata*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"copyformatdata"])
	 {return ((_b4xformatdata*) [B4IDebug delegate:self.bi :@"copyformatdata:" :@[[B4I nilToNSNull:_data]]]);}
_b4xformatdata* _d = nil;
B4IRDebugUtils.currentLine=23068672;
 //BA.debugLineNum = 23068672;BA.debugLine="Public Sub CopyFormatData (Data As B4XFormatData)";
B4IRDebugUtils.currentLine=23068673;
 //BA.debugLineNum = 23068673;BA.debugLine="Dim d As B4XFormatData";
_d = [_b4xformatdata new];
B4IRDebugUtils.currentLine=23068674;
 //BA.debugLineNum = 23068674;BA.debugLine="d.Initialize";
[_d Initialize];
B4IRDebugUtils.currentLine=23068675;
 //BA.debugLineNum = 23068675;BA.debugLine="d.DecimalPoint = Data.DecimalPoint";
_d->_DecimalPoint /*NSString**/  = _data->_DecimalPoint /*NSString**/ ;
B4IRDebugUtils.currentLine=23068676;
 //BA.debugLineNum = 23068676;BA.debugLine="If Data.FormatFont.IsInitialized Then";
if ([_data->_FormatFont /*B4XFont**/  IsInitialized]) { 
B4IRDebugUtils.currentLine=23068677;
 //BA.debugLineNum = 23068677;BA.debugLine="d.FormatFont = xui.CreateFont(Data.FormatFont.To";
_d->_FormatFont /*B4XFont**/  = [__ref->__xui /*B4IXUI**/  CreateFont:(UIFont*)(([_data->_FormatFont /*B4XFont**/  ToNativeFont]).object) :[_data->_FormatFont /*B4XFont**/  Size]];
 };
B4IRDebugUtils.currentLine=23068679;
 //BA.debugLineNum = 23068679;BA.debugLine="d.GroupingCharacter = Data.GroupingCharacter";
_d->_GroupingCharacter /*NSString**/  = _data->_GroupingCharacter /*NSString**/ ;
B4IRDebugUtils.currentLine=23068680;
 //BA.debugLineNum = 23068680;BA.debugLine="d.MaximumFractions = Data.MaximumFractions";
_d->_MaximumFractions /*int*/  = _data->_MaximumFractions /*int*/ ;
B4IRDebugUtils.currentLine=23068681;
 //BA.debugLineNum = 23068681;BA.debugLine="d.MinimumFractions = Data.MinimumFractions";
_d->_MinimumFractions /*int*/  = _data->_MinimumFractions /*int*/ ;
B4IRDebugUtils.currentLine=23068682;
 //BA.debugLineNum = 23068682;BA.debugLine="d.MinimumIntegers = Data.MinimumIntegers";
_d->_MinimumIntegers /*int*/  = _data->_MinimumIntegers /*int*/ ;
B4IRDebugUtils.currentLine=23068683;
 //BA.debugLineNum = 23068683;BA.debugLine="d.Postfix = Data.Postfix";
_d->_Postfix /*NSString**/  = _data->_Postfix /*NSString**/ ;
B4IRDebugUtils.currentLine=23068684;
 //BA.debugLineNum = 23068684;BA.debugLine="d.Prefix = Data.Prefix";
_d->_Prefix /*NSString**/  = _data->_Prefix /*NSString**/ ;
B4IRDebugUtils.currentLine=23068685;
 //BA.debugLineNum = 23068685;BA.debugLine="d.RangeEnd = Data.RangeEnd";
_d->_RangeEnd /*double*/  = _data->_RangeEnd /*double*/ ;
B4IRDebugUtils.currentLine=23068686;
 //BA.debugLineNum = 23068686;BA.debugLine="d.RangeStart = Data.RangeStart";
_d->_RangeStart /*double*/  = _data->_RangeStart /*double*/ ;
B4IRDebugUtils.currentLine=23068687;
 //BA.debugLineNum = 23068687;BA.debugLine="d.RemoveMinusSign = Data.RemoveMinusSign";
_d->_RemoveMinusSign /*BOOL*/  = _data->_RemoveMinusSign /*BOOL*/ ;
B4IRDebugUtils.currentLine=23068688;
 //BA.debugLineNum = 23068688;BA.debugLine="d.TextColor = Data.TextColor";
_d->_TextColor /*int*/  = _data->_TextColor /*int*/ ;
B4IRDebugUtils.currentLine=23068689;
 //BA.debugLineNum = 23068689;BA.debugLine="d.FractionPaddingChar = Data.FractionPaddingChar";
_d->_FractionPaddingChar /*NSString**/  = _data->_FractionPaddingChar /*NSString**/ ;
B4IRDebugUtils.currentLine=23068690;
 //BA.debugLineNum = 23068690;BA.debugLine="d.IntegerPaddingChar = Data.IntegerPaddingChar";
_d->_IntegerPaddingChar /*NSString**/  = _data->_IntegerPaddingChar /*NSString**/ ;
B4IRDebugUtils.currentLine=23068691;
 //BA.debugLineNum = 23068691;BA.debugLine="Return d";
if (true) return _d;
B4IRDebugUtils.currentLine=23068692;
 //BA.debugLineNum = 23068692;BA.debugLine="End Sub";
return nil;
}
- (_b4xformatdata*)  _createdefaultformat:(b4i_b4xformatter*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"createdefaultformat"])
	 {return ((_b4xformatdata*) [B4IDebug delegate:self.bi :@"createdefaultformat" :nil]);}
_b4xformatdata* _d = nil;
B4IRDebugUtils.currentLine=22937600;
 //BA.debugLineNum = 22937600;BA.debugLine="Private Sub CreateDefaultFormat As B4XFormatData";
B4IRDebugUtils.currentLine=22937601;
 //BA.debugLineNum = 22937601;BA.debugLine="Dim d As B4XFormatData";
_d = [_b4xformatdata new];
B4IRDebugUtils.currentLine=22937602;
 //BA.debugLineNum = 22937602;BA.debugLine="d.Initialize";
[_d Initialize];
B4IRDebugUtils.currentLine=22937603;
 //BA.debugLineNum = 22937603;BA.debugLine="d.GroupingCharacter = \",\"";
_d->_GroupingCharacter /*NSString**/  = @",";
B4IRDebugUtils.currentLine=22937604;
 //BA.debugLineNum = 22937604;BA.debugLine="d.DecimalPoint = \".\"";
_d->_DecimalPoint /*NSString**/  = @".";
B4IRDebugUtils.currentLine=22937605;
 //BA.debugLineNum = 22937605;BA.debugLine="d.MaximumFractions = 3";
_d->_MaximumFractions /*int*/  = (int) (3);
B4IRDebugUtils.currentLine=22937606;
 //BA.debugLineNum = 22937606;BA.debugLine="d.MinimumIntegers = 1";
_d->_MinimumIntegers /*int*/  = (int) (1);
B4IRDebugUtils.currentLine=22937607;
 //BA.debugLineNum = 22937607;BA.debugLine="d.IntegerPaddingChar = \"0\"";
_d->_IntegerPaddingChar /*NSString**/  = @"0";
B4IRDebugUtils.currentLine=22937608;
 //BA.debugLineNum = 22937608;BA.debugLine="d.FractionPaddingChar = \"0\"";
_d->_FractionPaddingChar /*NSString**/  = @"0";
B4IRDebugUtils.currentLine=22937609;
 //BA.debugLineNum = 22937609;BA.debugLine="Return d";
if (true) return _d;
B4IRDebugUtils.currentLine=22937610;
 //BA.debugLineNum = 22937610;BA.debugLine="End Sub";
return nil;
}
- (_b4xformatdata*)  _getformatdata:(b4i_b4xformatter*) __ref :(double) _number{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"getformatdata"])
	 {return ((_b4xformatdata*) [B4IDebug delegate:self.bi :@"getformatdata:" :@[@(_number)]]);}
int _i = 0;
_b4xformatdata* _d = nil;
B4IRDebugUtils.currentLine=23265280;
 //BA.debugLineNum = 23265280;BA.debugLine="Public Sub GetFormatData (Number As Double) As B4X";
B4IRDebugUtils.currentLine=23265281;
 //BA.debugLineNum = 23265281;BA.debugLine="For i = formats.Size - 1 To 1 Step - 1";
{
const int step1 = -1;
const int limit1 = (int) (1);
_i = (int) ([__ref->__formats /*B4IList**/  Size]-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
B4IRDebugUtils.currentLine=23265282;
 //BA.debugLineNum = 23265282;BA.debugLine="Dim d As B4XFormatData = formats.Get(i)";
_d = (_b4xformatdata*)([__ref->__formats /*B4IList**/  Get:_i]);
B4IRDebugUtils.currentLine=23265283;
 //BA.debugLineNum = 23265283;BA.debugLine="If Number <= d.RangeEnd And Number >= d.RangeSta";
if (_number<=_d->_RangeEnd /*double*/  && _number>=_d->_RangeStart /*double*/ ) { 
if (true) return _d;};
 }
};
B4IRDebugUtils.currentLine=23265285;
 //BA.debugLineNum = 23265285;BA.debugLine="Return formats.Get(0)";
if (true) return (_b4xformatdata*)([__ref->__formats /*B4IList**/  Get:(int) (0)]);
B4IRDebugUtils.currentLine=23265286;
 //BA.debugLineNum = 23265286;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _formatlabel:(b4i_b4xformatter*) __ref :(NSString*) _number :(B4XViewWrapper*) _label{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"formatlabel"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"formatlabel::" :@[[B4I nilToNSNull:_number],[B4I nilToNSNull:_label]]]);}
_b4xformatdata* _data = nil;
B4IRDebugUtils.currentLine=23396352;
 //BA.debugLineNum = 23396352;BA.debugLine="Public Sub FormatLabel (Number As String, Label As";
B4IRDebugUtils.currentLine=23396353;
 //BA.debugLineNum = 23396353;BA.debugLine="Label.Text = Format(Number)";
[_label setText:[__ref _format /*NSString**/ :nil :[self.bi ObjectToNumber:_number].doubleValue]];
B4IRDebugUtils.currentLine=23396354;
 //BA.debugLineNum = 23396354;BA.debugLine="Dim data As B4XFormatData = GetFormatData(Number)";
_data = [__ref _getformatdata /*_b4xformatdata**/ :nil :[self.bi ObjectToNumber:_number].doubleValue];
B4IRDebugUtils.currentLine=23396355;
 //BA.debugLineNum = 23396355;BA.debugLine="If data.TextColor <> 0 Then Label.TextColor = dat";
if (_data->_TextColor /*int*/ !=0) { 
[_label setTextColor:_data->_TextColor /*int*/ ];};
B4IRDebugUtils.currentLine=23396356;
 //BA.debugLineNum = 23396356;BA.debugLine="If data.FormatFont.IsInitialized Then Label.Font";
if ([_data->_FormatFont /*B4XFont**/  IsInitialized]) { 
[_label setFont:_data->_FormatFont /*B4XFont**/ ];};
B4IRDebugUtils.currentLine=23396357;
 //BA.debugLineNum = 23396357;BA.debugLine="End Sub";
return @"";
}
- (_b4xformatdata*)  _newformatdata:(b4i_b4xformatter*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xformatter";
if ([B4IDebug shouldDelegate: @"newformatdata"])
	 {return ((_b4xformatdata*) [B4IDebug delegate:self.bi :@"newformatdata" :nil]);}
B4IRDebugUtils.currentLine=23003136;
 //BA.debugLineNum = 23003136;BA.debugLine="Public Sub NewFormatData As B4XFormatData";
B4IRDebugUtils.currentLine=23003137;
 //BA.debugLineNum = 23003137;BA.debugLine="Return CopyFormatData(GetDefaultFormat)";
if (true) return [__ref _copyformatdata /*_b4xformatdata**/ :nil :[__ref _getdefaultformat /*_b4xformatdata**/ :nil]];
B4IRDebugUtils.currentLine=23003138;
 //BA.debugLineNum = 23003138;BA.debugLine="End Sub";
return nil;
}
@end