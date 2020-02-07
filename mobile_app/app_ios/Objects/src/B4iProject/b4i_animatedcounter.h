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
@interface b4i_animatedcounter : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public B4IList* __imageviews;
@public int __mdigits;
@public B4XViewWrapper* __lbltemplate;
@public B4IList* __mvalue;
@public int __digitheight;
@public int __digitwidth;
@public int __mduration;
@public B4XBitmapWrapper* __fade;
@public B4XViewWrapper* __xfadeiv;
@public NSObject* __tag;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _base_resize:(b4i_animatedcounter*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_animatedcounter*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4IList* _imageviews;
@property (nonatomic)int _mdigits;
@property (nonatomic)B4XViewWrapper* _lbltemplate;
@property (nonatomic)B4IList* _mvalue;
@property (nonatomic)int _digitheight;
@property (nonatomic)int _digitwidth;
@property (nonatomic)int _mduration;
@property (nonatomic)B4XBitmapWrapper* _fade;
@property (nonatomic)B4XViewWrapper* _xfadeiv;
@property (nonatomic)NSObject* _tag;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (B4XBitmapWrapper*)  _createbitmap:(b4i_animatedcounter*) __ref :(B4XViewWrapper*) _lbl;
- (B4XBitmapWrapper*)  _createfadebitmap:(b4i_animatedcounter*) __ref;
- (NSString*)  _designercreateview:(b4i_animatedcounter*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (int)  _getvalue:(b4i_animatedcounter*) __ref;
- (NSString*)  _initialize:(b4i_animatedcounter*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (NSString*)  _setvalue:(b4i_animatedcounter*) __ref :(int) _v;
- (int)  _topfromvalue:(b4i_animatedcounter*) __ref :(int) _digit;
@end
