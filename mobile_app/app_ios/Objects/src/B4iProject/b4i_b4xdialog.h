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
@interface b4i_b4xdialog : B4IClass
{
@public B4IXUI* __xui;
@public int __buttonheight;
@public int __buttonwidth;
@public B4XViewWrapper* __base;
@public int __backgroundcolor;
@public int __overlaycolor;
@public int __bordercolor;
@public int __bordercornersradius;
@public int __borderwidth;
@public int __buttonscolor;
@public int __buttonstextcolor;
@public B4XViewWrapper* __background;
@public B4XViewWrapper* __blurimageview;
@public BOOL __blurbackground;
@public int __blurreducescale;
@public B4XViewWrapper* __mparent;
@public NSObject* __title;
@public int __titlebarcolor;
@public int __titlebartextcolor;
@public B4XViewWrapper* __titlebar;
@public BOOL __putattop;
@public B4XFont* __titlebarfont;
@public B4XFont* __buttonsfont;
@public int __buttonstextcolordisabled;
@public int __visibleanimationduration;
@public B4IArray* __buttonsorder;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _background_click:(b4i_b4xdialog*) __ref;
- (NSString*)  _background_touch:(b4i_b4xdialog*) __ref :(int) _action :(float) _x :(float) _y;
- (b4i_bitmapcreator*)  _blur:(b4i_b4xdialog*) __ref :(B4XBitmapWrapper*) _bmp;
- (NSString*)  _button_click:(b4i_b4xdialog*) __ref;
- (NSString*)  _class_globals:(b4i_b4xdialog*) __ref;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)int _buttonheight;
@property (nonatomic)int _buttonwidth;
@property (nonatomic)B4XViewWrapper* _base;
@property (nonatomic)int _backgroundcolor;
@property (nonatomic)int _overlaycolor;
@property (nonatomic)int _bordercolor;
@property (nonatomic)int _bordercornersradius;
@property (nonatomic)int _borderwidth;
@property (nonatomic)int _buttonscolor;
@property (nonatomic)int _buttonstextcolor;
@property (nonatomic)B4XViewWrapper* _background;
@property (nonatomic)B4XViewWrapper* _blurimageview;
@property (nonatomic)BOOL _blurbackground;
@property (nonatomic)int _blurreducescale;
@property (nonatomic)B4XViewWrapper* _mparent;
@property (nonatomic)NSObject* _title;
@property (nonatomic)int _titlebarcolor;
@property (nonatomic)int _titlebartextcolor;
@property (nonatomic)B4XViewWrapper* _titlebar;
@property (nonatomic)BOOL _putattop;
@property (nonatomic)B4XFont* _titlebarfont;
@property (nonatomic)B4XFont* _buttonsfont;
@property (nonatomic)int _buttonstextcolordisabled;
@property (nonatomic)int _visibleanimationduration;
@property (nonatomic)B4IArray* _buttonsorder;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (BOOL)  _close:(b4i_b4xdialog*) __ref :(int) _result;
- (NSString*)  _createbutton:(b4i_b4xdialog*) __ref :(NSObject*) _text :(int) _code;
- (B4XViewWrapper*)  _getbutton:(b4i_b4xdialog*) __ref :(int) _resultcode;
- (BOOL)  _getvisible:(b4i_b4xdialog*) __ref;
- (NSString*)  _initialize:(b4i_b4xdialog*) __ref :(B4I*) _ba :(B4XViewWrapper*) _parent;
- (NSString*)  _internaladdstubtoclvifneeded:(b4i_b4xdialog*) __ref :(b4i_customlistview*) _customlistview1 :(int) _color;
- (NSString*)  _internalsettextorcsbuildertolabel:(b4i_b4xdialog*) __ref :(B4XViewWrapper*) _xlbl :(NSObject*) _text;
- (NSString*)  _resize:(b4i_b4xdialog*) __ref :(int) _width :(int) _height;
- (NSString*)  _setavg:(b4i_b4xdialog*) __ref :(b4i_bitmapcreator*) _bc :(int) _x :(int) _y :(B4IArray*) _clrs :(_argbcolor*) _temp;
- (NSString*)  _setbuttonstate:(b4i_b4xdialog*) __ref :(int) _resultcode :(BOOL) _enabled;
- (B4IResumableSubWrapper*)  _show:(b4i_b4xdialog*) __ref :(NSObject*) _text :(NSObject*) _yes :(NSObject*) _no :(NSObject*) _cancel;
- (B4IResumableSubWrapper*)  _showcustom:(b4i_b4xdialog*) __ref :(B4XViewWrapper*) _content :(NSObject*) _yes :(NSObject*) _no :(NSObject*) _cancel;
- (B4IResumableSubWrapper*)  _showtemplate:(b4i_b4xdialog*) __ref :(NSObject*) _dialogtemplate :(NSObject*) _yes :(NSObject*) _no :(NSObject*) _cancel;
- (NSString*)  _stub_click:(b4i_b4xdialog*) __ref;
- (NSString*)  _updateblur:(b4i_b4xdialog*) __ref;
@end
