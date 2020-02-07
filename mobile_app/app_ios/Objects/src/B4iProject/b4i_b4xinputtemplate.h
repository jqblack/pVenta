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
@interface b4i_b4xinputtemplate : B4IClass
{
@public B4IXUI* __xui;
@public B4XViewWrapper* __mbase;
@public NSString* __text;
@public b4i_b4xdialog* __xdialog;
@public NSString* __regexpattern;
@public B4XViewWrapper* __textfield1;
@public B4ILabelWrapper* __lbltitle;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _class_globals:(b4i_b4xinputtemplate*) __ref;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)NSString* _text;
@property (nonatomic)b4i_b4xdialog* _xdialog;
@property (nonatomic)NSString* _regexpattern;
@property (nonatomic)B4XViewWrapper* _textfield1;
@property (nonatomic)B4ILabelWrapper* _lbltitle;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _configurefornumbers:(b4i_b4xinputtemplate*) __ref :(BOOL) _allowdecimals :(BOOL) _allownegative;
- (NSString*)  _dialogclosed:(b4i_b4xinputtemplate*) __ref :(int) _result;
- (B4XViewWrapper*)  _getpanel:(b4i_b4xinputtemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (NSString*)  _initialize:(b4i_b4xinputtemplate*) __ref :(B4I*) _ba;
- (BOOL)  _isvalid:(b4i_b4xinputtemplate*) __ref :(NSString*) _new;
- (void)  _show:(b4i_b4xinputtemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (NSString*)  _textfield1_action:(b4i_b4xinputtemplate*) __ref;
- (NSString*)  _textfield1_enterpressed:(b4i_b4xinputtemplate*) __ref;
- (NSString*)  _textfield1_textchanged:(b4i_b4xinputtemplate*) __ref :(NSString*) _old :(NSString*) _new;
- (NSString*)  _validate:(b4i_b4xinputtemplate*) __ref :(NSString*) _new;
@end
