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
@class b4i_b4xdatetemplate;
@class b4i_b4xdialog;
@class b4i_b4xfloattextfield;
@class b4i_b4xinputtemplate;
@class b4i_b4xlisttemplate;
@class b4i_b4xloadingindicator;
@class b4i_b4xlongtexttemplate;
@class b4i_b4xsearchtemplate;
@class b4i_b4xsignaturetemplate;
@class b4i_b4xswitch;
@class b4i_b4xtimedtemplate;
@class _b4xformatdata;
@class b4i_b4xformatter;
@class b4i_roundslider;
@class b4i_scrollinglabel;
@class b4i_swiftbutton;
@interface b4i_b4xplusminus : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public NSObject* __tag;
@public B4XViewWrapper* __pnlplus;
@public B4XViewWrapper* __pnlminus;
@public B4XViewWrapper* __lblplus;
@public B4XViewWrapper* __lblminus;
@public NSString* __formation;
@public BOOL __mcyclic;
@public BOOL __mrapid;
@public B4XViewWrapper* __mainlabel;
@public int __arrowssize;
@public B4IList* __mstringitems;
@public double __mstartrange;
@public double __minterval;
@public double __mendrange;
@public int __mselectedindex;
@public int __loopindex;
@public int __rapidperiod1;
@public int __rapidperiod2;
@public b4i_b4xformatter* __formatter;
@public BOOL __stringmode;
@public int __size;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _base_resize:(b4i_b4xplusminus*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_b4xplusminus*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)NSObject* _tag;
@property (nonatomic)B4XViewWrapper* _pnlplus;
@property (nonatomic)B4XViewWrapper* _pnlminus;
@property (nonatomic)B4XViewWrapper* _lblplus;
@property (nonatomic)B4XViewWrapper* _lblminus;
@property (nonatomic)NSString* _formation;
@property (nonatomic)BOOL _mcyclic;
@property (nonatomic)BOOL _mrapid;
@property (nonatomic)B4XViewWrapper* _mainlabel;
@property (nonatomic)int _arrowssize;
@property (nonatomic)B4IList* _mstringitems;
@property (nonatomic)double _mstartrange;
@property (nonatomic)double _minterval;
@property (nonatomic)double _mendrange;
@property (nonatomic)int _mselectedindex;
@property (nonatomic)int _loopindex;
@property (nonatomic)int _rapidperiod1;
@property (nonatomic)int _rapidperiod2;
@property (nonatomic)b4i_b4xformatter* _formatter;
@property (nonatomic)BOOL _stringmode;
@property (nonatomic)int _size;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (B4XViewWrapper*)  _createlabel:(b4i_b4xplusminus*) __ref :(NSString*) _text;
- (NSString*)  _decrement:(b4i_b4xplusminus*) __ref;
- (NSString*)  _designercreateview:(b4i_b4xplusminus*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (NSObject*)  _getselectedvalue:(b4i_b4xplusminus*) __ref;
- (NSObject*)  _getvalueimpl:(b4i_b4xplusminus*) __ref :(int) _index;
- (NSString*)  _increment:(b4i_b4xplusminus*) __ref;
- (NSString*)  _initialize:(b4i_b4xplusminus*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (NSString*)  _internalsettextorcsbuildertolabel:(b4i_b4xplusminus*) __ref :(B4XViewWrapper*) _xlbl :(NSObject*) _text;
- (NSString*)  _pnlarrow_touch:(b4i_b4xplusminus*) __ref :(int) _action :(float) _x :(float) _y;
- (NSString*)  _setindex:(b4i_b4xplusminus*) __ref :(int) _i :(BOOL) _raiseevent;
- (NSString*)  _setnumericrange:(b4i_b4xplusminus*) __ref :(double) _startrange :(double) _endrange :(double) _interval;
- (NSString*)  _setselectedvalue:(b4i_b4xplusminus*) __ref :(NSObject*) _v;
- (NSString*)  _setstringitems:(b4i_b4xplusminus*) __ref :(B4IList*) _list;
- (void)  _startdownloop:(b4i_b4xplusminus*) __ref :(BOOL) _up;
- (NSString*)  _tap_event:(b4i_b4xplusminus*) __ref :(NSObject*) _rrec;
- (NSString*)  _touch:(b4i_b4xplusminus*) __ref :(BOOL) _start :(BOOL) _stop :(B4XViewWrapper*) _pnl;
@end
