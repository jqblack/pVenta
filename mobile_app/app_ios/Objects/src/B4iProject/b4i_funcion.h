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
@interface b4i_funcion : B4IStaticModule
{
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _a_la_derecha:(NSString*) _caracter :(NSString*) _parametro :(int) _limite;
- (NSString*)  _addlinea:(NSString*) _parametro :(int) _cantidad;
- (NSString*)  _base64_decode:(NSString*) _text;
- (NSString*)  _base64_encode:(NSString*) _text;
- (NSString*)  _crearjson:(NSString*) _token :(NSString*) _data;
- (NSString*)  _crearjson2:(NSString*) _token :(NSString*) _data;
- (NSString*)  _disableview:(BOOL) _tipo :(B4IPanelWrapper*) _pan;
- (double)  _get_descuento:(double) _precio :(double) _descuento;
- (double)  _get_importe:(double) _cantidad :(double) _precio :(double) _tax;
- (double)  _get_tax:(double) _precio :(double) _tax :(double) _cantidad;
- (NSString*)  _getbyteimagen:(B4IBitmap*) _bmap;
- (NSString*)  _getbyteimagen2:(B4IArray*) _data;
- (float)  _getdevicephysicalsize;
- (double)  _getdiferenciacantidad:(double) _cantidadactual :(double) _cantidadnueva;
- (B4IBitmap*)  _getimagen:(NSString*) _imagenb64;
- (B4IBitmap*)  _getimagen2:(B4IArray*) _imagen;
- (BOOL)  _isfirstresponder:(B4INativeObject*) _v;
- (NSString*)  _keyboardstatechanged:(float) _height :(B4IPage*) _page1 :(double) _top;
- (NSString*)  _process_globals;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (B4IMap*)  _recalcular:(double) _precio :(double) _descuento :(double) _cantidad :(double) _tax :(BOOL) _impuestoincluido :(BOOL) _exentoimpuesto;
- (NSString*)  _remplace:(NSString*) _text;
- (NSString*)  _setbackgroundimage:(B4IButtonWrapper*) _b :(B4IBitmap*) _bmp :(int) _state;
- (NSString*)  _settitlecolor:(B4INavigationControllerWrapper*) _nav :(int) _color;
- (NSString*)  _titulo:(NSString*) _parametro :(int) _limite;
- (BOOL)  _verificarjob:(NSString*) _job;
@end
