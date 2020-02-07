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
@interface b4i_direcciones : B4IStaticModule
{
@public B4IPage* __page;
@public B4IButtonWrapper* __btnnuevadireccion;
@public B4IButtonWrapper* __btnsalvardireccion;
@public B4ISwitchWrapper* __chprincipal;
@public B4IPanelWrapper* __panel2;
@public B4ITextViewWrapper* __txtdireccion;
@public B4ITableView* __listviewdirecciones;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnnuevadireccion_click;
- (NSString*)  _btnsalvardireccion_click;
- (NSString*)  _cargardirecciones;
- (NSString*)  _crear;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _listviewdirecciones_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell;
- (NSString*)  _pagedirecciones_disappear;
- (NSString*)  _pagedirecciones_keyboardstatechanged:(float) _height;
- (NSString*)  _pagedirecciones_resize:(int) _width :(int) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _page;
@property (nonatomic)B4IButtonWrapper* _btnnuevadireccion;
@property (nonatomic)B4IButtonWrapper* _btnsalvardireccion;
@property (nonatomic)B4ISwitchWrapper* _chprincipal;
@property (nonatomic)B4IPanelWrapper* _panel2;
@property (nonatomic)B4ITextViewWrapper* _txtdireccion;
@property (nonatomic)B4ITableView* _listviewdirecciones;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _txtdireccion_textchanged:(NSString*) _oldtext :(NSString*) _newtext;
@end
