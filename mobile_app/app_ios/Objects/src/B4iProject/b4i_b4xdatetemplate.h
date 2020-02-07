#import "iCore.h"
#import "iXUI.h"
#import "iHUD.h"
#import "iPhone.h"
#import "iJSON.h"
#import "iStringUtils.h"
#import "iHttp.h"
#import "iSQL.h"
#import "iTableView.h"
#import "iBitmapCreator.h"
#import "iDateUtils.h"
#import "xCustomListView.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_principal;
@class b4i_funcion;
@class b4i_facturacion;
@class b4i_direcciones;
@class b4i_reporteordenes;
@class b4i_httputils2service;
@class _typeu;
@class _multipartfiledata;
@class b4i_httpjob;
@class b4i_animatedcounter;
@class b4i_anotherprogressbar;
@class b4i_b4xbreadcrumb;
@class _colorpickerpart;
@class b4i_b4xcolortemplate;
@class b4i_b4xcombobox;
@class b4i_b4xdialog;
@class b4i_b4xfloattextfield;
@class b4i_b4xinputtemplate;
@class b4i_b4xlisttemplate;
@class b4i_b4xloadingindicator;
@class b4i_b4xlongtexttemplate;
@class b4i_b4xplusminus;
@class b4i_b4xsearchtemplate;
@class b4i_b4xsignaturetemplate;
@class b4i_b4xswitch;
@class b4i_b4xtimedtemplate;
@class _b4xformatdata;
@class b4i_b4xformatter;
@class b4i_roundslider;
@class b4i_scrollinglabel;
@class b4i_swiftbutton;
@interface b4i_b4xdatetemplate : B4IClass
{
@public B4IXUI* __xui;
@public int __month;
@public int __year;
@public float __boxw;
@public float __boxh;
@public float __vcorrection;
@public int __tempselectedday;
@public int __dayofweekoffset;
@public int __daysinmonth;
@public B4XViewWrapper* __dayspanebg;
@public B4XViewWrapper* __dayspanefg;
@public B4XCanvas* __cvs;
@public B4XCanvas* __cvsbackground;
@public long long __selecteddate;
@public int __selectedyear;
@public int __selectedmonth;
@public int __selectedday;
@public int __highlightedcolor;
@public int __selectedcolor;
@public int __daysinmonthcolor;
@public int __daysinweekcolor;
@public B4XCanvas* __cvsdays;
@public B4XViewWrapper* __daystitlespane;
@public int __firstday;
@public int __minyear;
@public int __maxyear;
@public B4XViewWrapper* __btnmonthleft;
@public B4XViewWrapper* __btnmonthright;
@public B4XViewWrapper* __btnyearleft;
@public B4XViewWrapper* __btnyearright;
@public B4XViewWrapper* __lblmonth;
@public B4XViewWrapper* __lblyear;
@public B4XViewWrapper* __pnldialog;
@public B4IList* __months;
@public b4i_b4xdialog* __mdialog;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnmonth_click:(b4i_b4xdatetemplate*) __ref;
- (NSString*)  _btnyear_click:(b4i_b4xdatetemplate*) __ref;
- (NSString*)  _class_globals:(b4i_b4xdatetemplate*) __ref;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)int _month;
@property (nonatomic)int _year;
@property (nonatomic)float _boxw;
@property (nonatomic)float _boxh;
@property (nonatomic)float _vcorrection;
@property (nonatomic)int _tempselectedday;
@property (nonatomic)int _dayofweekoffset;
@property (nonatomic)int _daysinmonth;
@property (nonatomic)B4XViewWrapper* _dayspanebg;
@property (nonatomic)B4XViewWrapper* _dayspanefg;
@property (nonatomic)B4XCanvas* _cvs;
@property (nonatomic)B4XCanvas* _cvsbackground;
@property (nonatomic)long long _selecteddate;
@property (nonatomic)int _selectedyear;
@property (nonatomic)int _selectedmonth;
@property (nonatomic)int _selectedday;
@property (nonatomic)int _highlightedcolor;
@property (nonatomic)int _selectedcolor;
@property (nonatomic)int _daysinmonthcolor;
@property (nonatomic)int _daysinweekcolor;
@property (nonatomic)B4XCanvas* _cvsdays;
@property (nonatomic)B4XViewWrapper* _daystitlespane;
@property (nonatomic)int _firstday;
@property (nonatomic)int _minyear;
@property (nonatomic)int _maxyear;
@property (nonatomic)B4XViewWrapper* _btnmonthleft;
@property (nonatomic)B4XViewWrapper* _btnmonthright;
@property (nonatomic)B4XViewWrapper* _btnyearleft;
@property (nonatomic)B4XViewWrapper* _btnyearright;
@property (nonatomic)B4XViewWrapper* _lblmonth;
@property (nonatomic)B4XViewWrapper* _lblyear;
@property (nonatomic)B4XViewWrapper* _pnldialog;
@property (nonatomic)B4IList* _months;
@property (nonatomic)b4i_b4xdialog* _mdialog;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _dayspanefg_touch:(b4i_b4xdatetemplate*) __ref :(int) _action :(float) _x :(float) _y;
- (NSString*)  _dialogclosed:(b4i_b4xdatetemplate*) __ref :(int) _result;
- (NSString*)  _drawbox:(b4i_b4xdatetemplate*) __ref :(B4XCanvas*) _c :(int) _clr :(int) _x :(int) _y;
- (NSString*)  _drawdays:(b4i_b4xdatetemplate*) __ref;
- (long long)  _getdate:(b4i_b4xdatetemplate*) __ref;
- (B4XViewWrapper*)  _getpanel:(b4i_b4xdatetemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (NSString*)  _handlemouse:(b4i_b4xdatetemplate*) __ref :(double) _x :(double) _y :(BOOL) _move;
- (NSString*)  _hide:(b4i_b4xdatetemplate*) __ref;
- (NSString*)  _initialize:(b4i_b4xdatetemplate*) __ref :(B4I*) _ba;
- (NSString*)  _selectday:(b4i_b4xdatetemplate*) __ref :(int) _day;
- (NSString*)  _setdate:(b4i_b4xdatetemplate*) __ref :(long long) _date;
- (NSString*)  _show:(b4i_b4xdatetemplate*) __ref :(b4i_b4xdialog*) _dialog;
@end
