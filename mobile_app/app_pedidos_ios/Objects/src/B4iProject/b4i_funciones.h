#import "iCore.h"
#import "iHUD.h"
#import "iXUI.h"
#import "iTableView.h"
#import "iHttp.h"
#import "iJSON.h"
#import "iStringUtils.h"
#import "iSQL.h"
#import "iPhone.h"
#import "iSideMenu.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_login;
@class b4i_categoria;
@class b4i_reportes;
@class b4i_facturacion;
@class b4i_direcciones;
@class b4i_perfil;
@class b4i_favoritos;
@class b4i_httputils2service;
@class _typeu;
@class _clvitem;
@class b4i_customlistview;
@class b4i_b4xcombobox;
@class b4i_b4xdrawer;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_funciones : B4IStaticModule
{
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _base64_decode:(NSString*) _text;
- (NSString*)  _base64_encode:(NSString*) _text;
- (NSString*)  _crearjson:(NSString*) _token :(NSString*) _data;
- (NSString*)  _crearjson2:(NSString*) _token :(NSString*) _data;
- (B4IPanelWrapper*)  _createpanelproducto:(B4IMap*) _map;
- (B4IPanelWrapper*)  _createpanelproductoscroll:(B4IMap*) _map :(B4IBitmap*) _imagen;
- (double)  _get_descuento:(double) _precio :(double) _descuento;
- (double)  _get_importe:(double) _cantidad :(double) _precio :(double) _tax;
- (double)  _get_tax:(double) _precio :(double) _tax :(double) _cantidad;
- (NSString*)  _getdecimal:(double) _n;
- (double)  _getdiferenciacantidad:(double) _cantidadactual :(double) _cantidadnueva;
- (B4IBitmap*)  _getimagen:(NSString*) _imagenb64;
- (BOOL)  _isfirstresponder:(B4INativeObject*) _v;
- (NSString*)  _keyboardstatechanged:(float) _height :(B4IPage*) _page1 :(double) _top;
- (NSString*)  _process_globals;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (B4IMap*)  _recalcular:(double) _precio :(double) _descuento :(double) _cantidad :(double) _tax :(BOOL) _impuestoincluido :(BOOL) _exentoimpuesto;
- (B4IBitmap*)  _resizeimage:(B4IBitmap*) _image :(int) _width :(int) _height;
- (NSString*)  _setpaddingtext:(B4ITextFieldWrapper*) _tf :(float) _padding;
- (BOOL)  _verificarjob:(NSString*) _job;
@end
