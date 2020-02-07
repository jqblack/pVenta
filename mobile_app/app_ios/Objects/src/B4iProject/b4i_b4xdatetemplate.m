
#import "b4i_b4xdatetemplate.h"
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


@implementation b4i_b4xdatetemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xdatetemplate) instance released.");
}

- (NSString*)  _btnmonth_click:(b4i_b4xdatetemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"btnmonth_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnmonth_click" :nil]);}
B4XViewWrapper* _btn = nil;
int _m = 0;
B4IRDebugUtils.currentLine=13107200;
 //BA.debugLineNum = 13107200;BA.debugLine="Private Sub btnMonth_Click";
B4IRDebugUtils.currentLine=13107201;
 //BA.debugLineNum = 13107201;BA.debugLine="Dim btn As B4XView = Sender";
_btn = [B4XViewWrapper new];
_btn.object = (NSObject*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="Dim m As Int = 12 + month - 1 + btn.Tag";
_m = (int) (12+__ref->__month /*int*/ -1+[self.bi ObjectToNumber:[_btn Tag]].doubleValue);
B4IRDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="month = (m Mod 12) + 1";
__ref->__month /*int*/  = (int) ((_m%12)+1);
B4IRDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="DrawDays";
[__ref _drawdays /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13107205;
 //BA.debugLineNum = 13107205;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawdays:(b4i_b4xdatetemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"drawdays"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawdays" :nil]);}
long long _firstdayofmonth = 0L;
B4XFont* _daysfont = nil;
int _day = 0;
int _row = 0;
B4IRDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Private Sub DrawDays";
B4IRDebugUtils.currentLine=12582913;
 //BA.debugLineNum = 12582913;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
[__ref->__lblmonth /*B4XViewWrapper**/  setText:[self.bi ObjectToString:[__ref->__months /*B4IList**/  Get:(int) (__ref->__month /*int*/ -1)]]];
B4IRDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="lblYear.Text = year";
[__ref->__lblyear /*B4XViewWrapper**/  setText:[self.bi NumberToString:@(__ref->__year /*int*/ )]];
B4IRDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="btnYearLeft.Enabled = year > MinYear";
[__ref->__btnyearleft /*B4XViewWrapper**/  setEnabled:__ref->__year /*int*/ >__ref->__minyear /*int*/ ];
B4IRDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="btnYearRight.Enabled = year < MaxYear";
[__ref->__btnyearright /*B4XViewWrapper**/  setEnabled:__ref->__year /*int*/ <__ref->__maxyear /*int*/ ];
B4IRDebugUtils.currentLine=12582917;
 //BA.debugLineNum = 12582917;BA.debugLine="cvs.ClearRect(cvs.TargetRect)";
[__ref->__cvs /*B4XCanvas**/  ClearRect:[__ref->__cvs /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=12582918;
 //BA.debugLineNum = 12582918;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect)";
[__ref->__cvsbackground /*B4XCanvas**/  ClearRect:[__ref->__cvsbackground /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="Dim firstDayOfMonth As Long = DateUtils.setDate(y";
_firstdayofmonth = (long long) ([self->__dateutils _setdate:__ref->__year /*int*/  :__ref->__month /*int*/  :(int) (1)]-1);
B4IRDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="dayOfWeekOffset = (7 + DateTime.GetDayOfWeek(firs";
__ref->__dayofweekoffset /*int*/  = (int) ((7+[[self->___c DateTime] GetDayOfWeek:_firstdayofmonth]-__ref->__firstday /*int*/ )%7);
B4IRDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="daysInMonth = DateUtils.NumberOfDaysInMonth(month";
__ref->__daysinmonth /*int*/  = [self->__dateutils _numberofdaysinmonth:__ref->__month /*int*/  :__ref->__year /*int*/ ];
B4IRDebugUtils.currentLine=12582922;
 //BA.debugLineNum = 12582922;BA.debugLine="If year = selectedYear And month = selectedMonth";
if (__ref->__year /*int*/ ==__ref->__selectedyear /*int*/  && __ref->__month /*int*/ ==__ref->__selectedmonth /*int*/ ) { 
B4IRDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="DrawBox(cvs, SelectedColor, (selectedDay - 1 + d";
[__ref _drawbox /*NSString**/ :nil :__ref->__cvs /*B4XCanvas**/  :__ref->__selectedcolor /*int*/  :(int) ((__ref->__selectedday /*int*/ -1+__ref->__dayofweekoffset /*int*/ )%7) :(int) ((__ref->__selectedday /*int*/ -1+__ref->__dayofweekoffset /*int*/ )/(double)7)];
 };
B4IRDebugUtils.currentLine=12582927;
 //BA.debugLineNum = 12582927;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = [B4XFont new];
_daysfont = [__ref->__xui /*B4IXUI**/  CreateDefaultBoldFont:(float) (14)];
B4IRDebugUtils.currentLine=12582928;
 //BA.debugLineNum = 12582928;BA.debugLine="For day = 1 To daysInMonth";
{
const int step14 = 1;
const int limit14 = __ref->__daysinmonth /*int*/ ;
_day = (int) (1) ;
for (;_day <= limit14 ;_day = _day + step14 ) {
B4IRDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="Dim row As Int = (day - 1 + dayOfWeekOffset) / 7";
_row = (int) ((_day-1+__ref->__dayofweekoffset /*int*/ )/(double)7);
B4IRDebugUtils.currentLine=12582930;
 //BA.debugLineNum = 12582930;BA.debugLine="cvs.DrawText(day, (((dayOfWeekOffset + day - 1)";
[__ref->__cvs /*B4XCanvas**/  DrawText:[self.bi NumberToString:@(_day)] :(float) ((((__ref->__dayofweekoffset /*int*/ +_day-1)%7)+0.5)*__ref->__boxw /*float*/ ) :(float) ((_row+0.5)*__ref->__boxh /*float*/ +__ref->__vcorrection /*float*/ ) :_daysfont :__ref->__daysinmonthcolor /*int*/  :@"CENTER"];
 }
};
B4IRDebugUtils.currentLine=12582933;
 //BA.debugLineNum = 12582933;BA.debugLine="cvsBackground.Invalidate";
[__ref->__cvsbackground /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=12582934;
 //BA.debugLineNum = 12582934;BA.debugLine="cvs.Invalidate";
[__ref->__cvs /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnyear_click:(b4i_b4xdatetemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"btnyear_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnyear_click" :nil]);}
B4XViewWrapper* _btn = nil;
B4IRDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Private Sub btnYear_Click";
B4IRDebugUtils.currentLine=13041665;
 //BA.debugLineNum = 13041665;BA.debugLine="Dim btn As B4XView = Sender";
_btn = [B4XViewWrapper new];
_btn.object = (NSObject*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="year = year + btn.Tag";
__ref->__year /*int*/  = (int) (__ref->__year /*int*/ +[self.bi ObjectToNumber:[_btn Tag]].doubleValue);
B4IRDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="DrawDays";
[__ref _drawdays /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13041668;
 //BA.debugLineNum = 13041668;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xdatetemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
B4IRDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=12451841;
 //BA.debugLineNum = 12451841;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="Private month, year As Int";
self->__month = 0;
self->__year = 0;
B4IRDebugUtils.currentLine=12451843;
 //BA.debugLineNum = 12451843;BA.debugLine="Private boxW, boxH As Float";
self->__boxw = 0.0f;
self->__boxh = 0.0f;
B4IRDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="Private vCorrection As Float";
self->__vcorrection = 0.0f;
B4IRDebugUtils.currentLine=12451845;
 //BA.debugLineNum = 12451845;BA.debugLine="Private tempSelectedDay As Int";
self->__tempselectedday = 0;
B4IRDebugUtils.currentLine=12451846;
 //BA.debugLineNum = 12451846;BA.debugLine="Private dayOfWeekOffset As Int";
self->__dayofweekoffset = 0;
B4IRDebugUtils.currentLine=12451847;
 //BA.debugLineNum = 12451847;BA.debugLine="Private daysInMonth As Int";
self->__daysinmonth = 0;
B4IRDebugUtils.currentLine=12451848;
 //BA.debugLineNum = 12451848;BA.debugLine="Private DaysPaneBg As B4XView";
self->__dayspanebg = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451849;
 //BA.debugLineNum = 12451849;BA.debugLine="Private DaysPaneFg As B4XView";
self->__dayspanefg = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451850;
 //BA.debugLineNum = 12451850;BA.debugLine="Private cvs As B4XCanvas";
self->__cvs = [B4XCanvas new];
B4IRDebugUtils.currentLine=12451851;
 //BA.debugLineNum = 12451851;BA.debugLine="Private cvsBackground As B4XCanvas";
self->__cvsbackground = [B4XCanvas new];
B4IRDebugUtils.currentLine=12451852;
 //BA.debugLineNum = 12451852;BA.debugLine="Private selectedDate As Long";
self->__selecteddate = 0L;
B4IRDebugUtils.currentLine=12451853;
 //BA.debugLineNum = 12451853;BA.debugLine="Private selectedYear, selectedMonth, selectedDay";
self->__selectedyear = 0;
self->__selectedmonth = 0;
self->__selectedday = 0;
B4IRDebugUtils.currentLine=12451854;
 //BA.debugLineNum = 12451854;BA.debugLine="Public HighlightedColor As Int = 0xFF001BBD";
self->__highlightedcolor = (int) (0xff001bbd);
B4IRDebugUtils.currentLine=12451855;
 //BA.debugLineNum = 12451855;BA.debugLine="Public SelectedColor As Int = 0xFF0BA29B";
self->__selectedcolor = (int) (0xff0ba29b);
B4IRDebugUtils.currentLine=12451856;
 //BA.debugLineNum = 12451856;BA.debugLine="Public DaysInMonthColor As Int = xui.Color_White";
self->__daysinmonthcolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=12451857;
 //BA.debugLineNum = 12451857;BA.debugLine="Public DaysInWeekColor As Int = xui.Color_Gray";
self->__daysinweekcolor = [__ref->__xui /*B4IXUI**/  Color_Gray];
B4IRDebugUtils.currentLine=12451858;
 //BA.debugLineNum = 12451858;BA.debugLine="Private cvsDays As B4XCanvas";
self->__cvsdays = [B4XCanvas new];
B4IRDebugUtils.currentLine=12451859;
 //BA.debugLineNum = 12451859;BA.debugLine="Private DaysTitlesPane As B4XView";
self->__daystitlespane = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451860;
 //BA.debugLineNum = 12451860;BA.debugLine="Public FirstDay As Int = 0";
self->__firstday = (int) (0);
B4IRDebugUtils.currentLine=12451861;
 //BA.debugLineNum = 12451861;BA.debugLine="Public MinYear = 1970, MaxYear = 2030 As Int";
self->__minyear = (int) (1970);
self->__maxyear = (int) (2030);
B4IRDebugUtils.currentLine=12451862;
 //BA.debugLineNum = 12451862;BA.debugLine="Public btnMonthLeft As B4XView";
self->__btnmonthleft = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451863;
 //BA.debugLineNum = 12451863;BA.debugLine="Public btnMonthRight As B4XView";
self->__btnmonthright = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451864;
 //BA.debugLineNum = 12451864;BA.debugLine="Public btnYearLeft As B4XView";
self->__btnyearleft = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451865;
 //BA.debugLineNum = 12451865;BA.debugLine="Public btnYearRight As B4XView";
self->__btnyearright = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451866;
 //BA.debugLineNum = 12451866;BA.debugLine="Public lblMonth As B4XView";
self->__lblmonth = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451867;
 //BA.debugLineNum = 12451867;BA.debugLine="Public lblYear As B4XView";
self->__lblyear = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451868;
 //BA.debugLineNum = 12451868;BA.debugLine="Private pnlDialog As B4XView";
self->__pnldialog = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=12451869;
 //BA.debugLineNum = 12451869;BA.debugLine="Private months As List";
self->__months = [B4IList new];
B4IRDebugUtils.currentLine=12451870;
 //BA.debugLineNum = 12451870;BA.debugLine="Private mDialog As B4XDialog";
self->__mdialog = [b4i_b4xdialog new];
B4IRDebugUtils.currentLine=12451871;
 //BA.debugLineNum = 12451871;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _dayspanefg_touch:(b4i_b4xdatetemplate*) __ref :(int) _action :(float) _x :(float) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"dayspanefg_touch"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dayspanefg_touch:::" :@[@(_action),@(_x),@(_y)]]);}
B4XViewWrapper* _p = nil;
B4IRDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Private Sub DaysPaneFg_Touch (Action As Int, X As";
B4IRDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="Dim p As B4XView = DaysPaneFg";
_p = [B4XViewWrapper new];
_p = __ref->__dayspanefg /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="HandleMouse(X, Y, Action <> p.TOUCH_ACTION_UP)";
[__ref _handlemouse /*NSString**/ :nil :_x :_y :_action!=[_p TOUCH_ACTION_UP]];
B4IRDebugUtils.currentLine=13172739;
 //BA.debugLineNum = 13172739;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _handlemouse:(b4i_b4xdatetemplate*) __ref :(double) _x :(double) _y :(BOOL) _move{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"handlemouse"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"handlemouse:::" :@[@(_x),@(_y),@(_move)]]);}
int _boxx = 0;
int _boxy = 0;
int _newselectedday = 0;
BOOL _validday = false;
B4IRDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Private Sub HandleMouse(x As Double, y As Double,";
B4IRDebugUtils.currentLine=12910593;
 //BA.debugLineNum = 12910593;BA.debugLine="Dim boxX = x / boxW, boxY =  y / boxH As Int";
_boxx = (int) (_x/(double)__ref->__boxw /*float*/ );
_boxy = (int) (_y/(double)__ref->__boxh /*float*/ );
B4IRDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="Dim newSelectedDay As Int = boxY * 7 + boxX + 1 -";
_newselectedday = (int) (_boxy*7+_boxx+1-__ref->__dayofweekoffset /*int*/ );
B4IRDebugUtils.currentLine=12910595;
 //BA.debugLineNum = 12910595;BA.debugLine="Dim validDay As Boolean = newSelectedDay > 0 And";
_validday = _newselectedday>0 && _newselectedday<=__ref->__daysinmonth /*int*/ ;
B4IRDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="If move Then";
if (_move) { 
B4IRDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="If newSelectedDay = tempSelectedDay Then Return";
if (_newselectedday==__ref->__tempselectedday /*int*/ ) { 
if (true) return @"";};
B4IRDebugUtils.currentLine=12910598;
 //BA.debugLineNum = 12910598;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
[__ref->__cvsbackground /*B4XCanvas**/  ClearRect:[__ref->__cvsbackground /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="tempSelectedDay = newSelectedDay";
__ref->__tempselectedday /*int*/  = _newselectedday;
B4IRDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="If validDay Then";
if (_validday) { 
B4IRDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="DrawBox(cvsBackground, HighlightedColor, boxX,";
[__ref _drawbox /*NSString**/ :nil :__ref->__cvsbackground /*B4XCanvas**/  :__ref->__highlightedcolor /*int*/  :_boxx :_boxy];
 };
 }else {
B4IRDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="cvsBackground.ClearRect(cvsBackground.TargetRect";
[__ref->__cvsbackground /*B4XCanvas**/  ClearRect:[__ref->__cvsbackground /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=12910605;
 //BA.debugLineNum = 12910605;BA.debugLine="If validDay Then";
if (_validday) { 
B4IRDebugUtils.currentLine=12910606;
 //BA.debugLineNum = 12910606;BA.debugLine="SelectDay(newSelectedDay)";
[__ref _selectday /*NSString**/ :nil :_newselectedday];
B4IRDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="Hide";
[__ref _hide /*NSString**/ :nil];
 };
 };
B4IRDebugUtils.currentLine=12910611;
 //BA.debugLineNum = 12910611;BA.debugLine="cvsBackground.Invalidate";
[__ref->__cvsbackground /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=12910612;
 //BA.debugLineNum = 12910612;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _dialogclosed:(b4i_b4xdatetemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
B4IRDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _drawbox:(b4i_b4xdatetemplate*) __ref :(B4XCanvas*) _c :(int) _clr :(int) _x :(int) _y{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"drawbox"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"drawbox::::" :@[[B4I nilToNSNull:_c],@(_clr),@(_x),@(_y)]]);}
B4XRect* _r = nil;
B4IRDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Private Sub DrawBox(c As B4XCanvas, clr As Int, x";
B4IRDebugUtils.currentLine=12648449;
 //BA.debugLineNum = 12648449;BA.debugLine="Dim r As B4XRect";
_r = [B4XRect new];
B4IRDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="r.Initialize(x * boxW, y * boxH, x * boxW + boxW,";
[_r Initialize:(float) (_x*__ref->__boxw /*float*/ ) :(float) (_y*__ref->__boxh /*float*/ ) :(float) (_x*__ref->__boxw /*float*/ +__ref->__boxw /*float*/ ) :(float) (_y*__ref->__boxh /*float*/ +__ref->__boxh /*float*/ )];
B4IRDebugUtils.currentLine=12648451;
 //BA.debugLineNum = 12648451;BA.debugLine="c.DrawRect(r, clr, True, 1dip)";
[_c DrawRect:_r :_clr :true :(float) (((int) (1)))];
B4IRDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="End Sub";
return @"";
}
- (long long)  _getdate:(b4i_b4xdatetemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"getdate"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getdate" :nil]).longLongValue;}
B4IRDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Public Sub getDate As Long";
B4IRDebugUtils.currentLine=12713985;
 //BA.debugLineNum = 12713985;BA.debugLine="Return selectedDate";
if (true) return __ref->__selecteddate /*long long*/ ;
B4IRDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="End Sub";
return 0L;
}
- (B4XViewWrapper*)  _getpanel:(b4i_b4xdatetemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=13238273;
 //BA.debugLineNum = 13238273;BA.debugLine="Return pnlDialog";
if (true) return __ref->__pnldialog /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _selectday:(b4i_b4xdatetemplate*) __ref :(int) _day{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"selectday"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"selectday:" :@[@(_day)]]);}
B4IRDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Private Sub SelectDay(day As Int)";
B4IRDebugUtils.currentLine=12845057;
 //BA.debugLineNum = 12845057;BA.debugLine="selectedDate = DateUtils.setDate(year, month, day";
__ref->__selecteddate /*long long*/  = [self->__dateutils _setdate:__ref->__year /*int*/  :__ref->__month /*int*/  :_day];
B4IRDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="selectedDay = day";
__ref->__selectedday /*int*/  = _day;
B4IRDebugUtils.currentLine=12845059;
 //BA.debugLineNum = 12845059;BA.debugLine="selectedMonth = month";
__ref->__selectedmonth /*int*/  = __ref->__month /*int*/ ;
B4IRDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="selectedYear = year";
__ref->__selectedyear /*int*/  = __ref->__year /*int*/ ;
B4IRDebugUtils.currentLine=12845061;
 //BA.debugLineNum = 12845061;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hide:(b4i_b4xdatetemplate*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"hide"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"hide" :nil]);}
B4IRDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Private Sub Hide";
B4IRDebugUtils.currentLine=12976129;
 //BA.debugLineNum = 12976129;BA.debugLine="mDialog.Close(xui.DialogResponse_Positive)";
[__ref->__mdialog /*b4i_b4xdialog**/  _close /*BOOL*/ :nil :[__ref->__xui /*B4IXUI**/  DialogResponse_Positive]];
B4IRDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xdatetemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=12517376;
 //BA.debugLineNum = 12517376;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=12517377;
 //BA.debugLineNum = 12517377;BA.debugLine="pnlDialog = xui.CreatePanel(\"\")";
__ref->__pnldialog /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@""];
B4IRDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="pnlDialog.SetLayoutAnimated(0, 0, 0, 320dip,300di";
[__ref->__pnldialog /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (320))) :(float) (((int) (300)))];
B4IRDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="pnlDialog.LoadLayout(\"DateTemplate\")";
[__ref->__pnldialog /*B4XViewWrapper**/  LoadLayout:@"DateTemplate" :self.bi];
B4IRDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="pnlDialog.Tag = Me";
[__ref->__pnldialog /*B4XViewWrapper**/  setTag:self];
B4IRDebugUtils.currentLine=12517381;
 //BA.debugLineNum = 12517381;BA.debugLine="month = DateTime.GetMonth(DateTime.Now)";
__ref->__month /*int*/  = [[self->___c DateTime] GetMonth:[[self->___c DateTime] Now]];
B4IRDebugUtils.currentLine=12517382;
 //BA.debugLineNum = 12517382;BA.debugLine="year = DateTime.GetYear(DateTime.Now)";
__ref->__year /*int*/  = [[self->___c DateTime] GetYear:[[self->___c DateTime] Now]];
B4IRDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="months = DateUtils.GetMonthsNames";
__ref->__months /*B4IList**/  = [self->__dateutils _getmonthsnames];
B4IRDebugUtils.currentLine=12517384;
 //BA.debugLineNum = 12517384;BA.debugLine="selectedDate = DateTime.Now";
__ref->__selecteddate /*long long*/  = [[self->___c DateTime] Now];
B4IRDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="setDate(selectedDate)";
[__ref _setdate /*NSString**/ :nil :__ref->__selecteddate /*long long*/ ];
B4IRDebugUtils.currentLine=12517386;
 //BA.debugLineNum = 12517386;BA.debugLine="cvs.Initialize(DaysPaneFg)";
[__ref->__cvs /*B4XCanvas**/  Initialize:(UIView*)((__ref->__dayspanefg /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="cvsBackground.Initialize(DaysPaneBg)";
[__ref->__cvsbackground /*B4XCanvas**/  Initialize:(UIView*)((__ref->__dayspanebg /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="boxW = cvs.TargetRect.Width / 7";
__ref->__boxw /*float*/  = (float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Width]/(double)7);
B4IRDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="boxH = cvs.TargetRect.Height / 6";
__ref->__boxh /*float*/  = (float) ([[__ref->__cvs /*B4XCanvas**/  TargetRect] Height]/(double)6);
B4IRDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="vCorrection = 5dip";
__ref->__vcorrection /*float*/  = (float) (((int) (5)));
B4IRDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="cvsDays.Initialize(DaysTitlesPane)";
[__ref->__cvsdays /*B4XCanvas**/  Initialize:(UIView*)((__ref->__daystitlespane /*B4XViewWrapper**/ ).object)];
B4IRDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _setdate:(b4i_b4xdatetemplate*) __ref :(long long) _date{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"setdate"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setdate:" :@[@(_date)]]);}
B4IRDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Public Sub setDate(date As Long)";
B4IRDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="If lblYear.IsInitialized = False Then";
if ([__ref->__lblyear /*B4XViewWrapper**/  IsInitialized]==false) { 
B4IRDebugUtils.currentLine=12779523;
 //BA.debugLineNum = 12779523;BA.debugLine="selectedDate = date";
__ref->__selecteddate /*long long*/  = _date;
B4IRDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="Return 'the date will be set after the layout is";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=12779526;
 //BA.debugLineNum = 12779526;BA.debugLine="year = DateTime.GetYear(date)";
__ref->__year /*int*/  = [[self->___c DateTime] GetYear:_date];
B4IRDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="month = DateTime.GetMonth(date)";
__ref->__month /*int*/  = [[self->___c DateTime] GetMonth:_date];
B4IRDebugUtils.currentLine=12779528;
 //BA.debugLineNum = 12779528;BA.debugLine="SelectDay(DateTime.GetDayOfMonth(date))";
[__ref _selectday /*NSString**/ :nil :[[self->___c DateTime] GetDayOfMonth:_date]];
B4IRDebugUtils.currentLine=12779529;
 //BA.debugLineNum = 12779529;BA.debugLine="lblYear.Text = year";
[__ref->__lblyear /*B4XViewWrapper**/  setText:[self.bi NumberToString:@(__ref->__year /*int*/ )]];
B4IRDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="lblMonth.Text = months.Get(month - 1)";
[__ref->__lblmonth /*B4XViewWrapper**/  setText:[self.bi ObjectToString:[__ref->__months /*B4IList**/  Get:(int) (__ref->__month /*int*/ -1)]]];
B4IRDebugUtils.currentLine=12779531;
 //BA.debugLineNum = 12779531;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _show:(b4i_b4xdatetemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xdatetemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IList* _days = nil;
B4XFont* _daysfont = nil;
int _i = 0;
NSString* _d = @"";
B4IRDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Private Sub Show (Dialog As B4XDialog)";
B4IRDebugUtils.currentLine=13303809;
 //BA.debugLineNum = 13303809;BA.debugLine="Dim days As List = DateUtils.GetDaysNames";
_days = [B4IList new];
_days = [self->__dateutils _getdaysnames];
B4IRDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="Dim daysFont As B4XFont = xui.CreateDefaultBoldFo";
_daysfont = [B4XFont new];
_daysfont = [__ref->__xui /*B4IXUI**/  CreateDefaultBoldFont:(float) (14)];
B4IRDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="cvsDays.ClearRect(cvsDays.TargetRect)";
[__ref->__cvsdays /*B4XCanvas**/  ClearRect:[__ref->__cvsdays /*B4XCanvas**/  TargetRect]];
B4IRDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="For i = FirstDay To FirstDay + 7 - 1";
{
const int step4 = 1;
const int limit4 = (int) (__ref->__firstday /*int*/ +7-1);
_i = __ref->__firstday /*int*/  ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=13303813;
 //BA.debugLineNum = 13303813;BA.debugLine="Dim d As String = days.Get(i Mod 7)";
_d = [self.bi ObjectToString:[_days Get:(int) (_i%7)]];
B4IRDebugUtils.currentLine=13303814;
 //BA.debugLineNum = 13303814;BA.debugLine="cvsDays.DrawText(d.SubString2(0, 2), (i - FirstD";
[__ref->__cvsdays /*B4XCanvas**/  DrawText:[_d SubString2:(int) (0) :(int) (2)] :(float) ((_i-__ref->__firstday /*int*/ +0.5)*__ref->__boxw /*float*/ ) :(float) (((int) (20))) :_daysfont :__ref->__daysinweekcolor /*int*/  :@"CENTER"];
 }
};
B4IRDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="cvsDays.Invalidate";
[__ref->__cvsdays /*B4XCanvas**/  Invalidate];
B4IRDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="mDialog = Dialog";
__ref->__mdialog /*b4i_b4xdialog**/  = _dialog;
B4IRDebugUtils.currentLine=13303818;
 //BA.debugLineNum = 13303818;BA.debugLine="DrawDays";
[__ref _drawdays /*NSString**/ :nil];
B4IRDebugUtils.currentLine=13303819;
 //BA.debugLineNum = 13303819;BA.debugLine="End Sub";
return @"";
}
@end