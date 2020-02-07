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
@class b4i_funciones;
@class b4i_categoria;
@class b4i_reportes;
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
@interface b4i_facturacion : B4IStaticModule
{
@public B4IPage* __page;
@public B4IButtonWrapper* __btnordenback;
@public B4IPanelWrapper* __panelordentitulo;
@public b4i_customlistview* __listacarrito;
@public iHUD* __hud;
@public BOOL __changevalue;
@public int __valorcantidad;
@public double __tax;
@public double __subtotal;
@public double __total;
@public B4ILabelWrapper* __lblordentotalpagar;
@public B4ILabelWrapper* __lblprecioenvio;
@public B4ILabelWrapper* __lbldireccion;
@public B4IImageViewWrapper* __imgcat;
@public B4ILabelWrapper* __lblnomcat;
@public B4ILabelWrapper* __lblcantcat;
@public B4ILabelWrapper* __lblopcionesproductonombre;
@public B4ITextFieldWrapper* __txtcantidad;
@public B4IStepperWrapper* __stmodificarcantidad;
@public B4IButtonWrapper* __btnopcionesproductosalvar;
@public B4IPanelWrapper* __panelopcionesback;
@public B4IButtonWrapper* __btnopcionesback;
@public B4IButtonWrapper* __btnopcioneseliminar;
@public B4ITextFieldWrapper* __txtproductocomentario;
@public B4IPanelWrapper* __paneldireccion;
@public b4i_customlistview* __milistadireccion;
@public B4IButtonWrapper* __btnbackmdaldireccion;
@public B4IButtonWrapper* __btnabrirdireccion;
@public B4IPanelWrapper* __panelfondodireccionmodal;
@public B4ILabelWrapper* __lbldir;
@public B4ILabelWrapper* __lblfecha;
@public B4ILabelWrapper* __lblprincipal;
@public B4IButtonWrapper* __btnordenenviar;
@public B4IButtonWrapper* __btnordeneliminartodos;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnabrirdireccion_click;
- (NSString*)  _btnbackmdaldireccion_click;
- (NSString*)  _btnopcionesback_click;
- (NSString*)  _btnopcioneseliminar_click;
- (NSString*)  _btnopcionesproductosalvar_click;
- (NSString*)  _btnordenback_click;
- (NSString*)  _btnordeneliminartodos_click;
- (NSString*)  _btnordenenviar_click;
- (NSString*)  _cargardirecciones;
- (NSString*)  _cargarproductostemporales;
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height;
- (B4IPanelWrapper*)  _createlistitemonlystring:(NSString*) _dir :(NSString*) _fecha :(NSString*) _principal :(int) _width :(int) _height;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _listacarrito_itemclick:(int) _index :(NSObject*) _value;
- (NSString*)  _milistadireccion_itemclick:(int) _index :(NSObject*) _value;
- (NSString*)  _msgdelete_click:(NSString*) _buttontext;
- (NSString*)  _msglogin_click:(NSString*) _buttontext;
- (NSString*)  _msgvender_click:(NSString*) _buttontext;
- (NSString*)  _msjeliminar_click:(NSString*) _buttontext;
- (NSString*)  _paneldireccion_click;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _page;
@property (nonatomic)B4IButtonWrapper* _btnordenback;
@property (nonatomic)B4IPanelWrapper* _panelordentitulo;
@property (nonatomic)b4i_customlistview* _listacarrito;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)BOOL _changevalue;
@property (nonatomic)int _valorcantidad;
@property (nonatomic)double _tax;
@property (nonatomic)double _subtotal;
@property (nonatomic)double _total;
@property (nonatomic)B4ILabelWrapper* _lblordentotalpagar;
@property (nonatomic)B4ILabelWrapper* _lblprecioenvio;
@property (nonatomic)B4ILabelWrapper* _lbldireccion;
@property (nonatomic)B4IImageViewWrapper* _imgcat;
@property (nonatomic)B4ILabelWrapper* _lblnomcat;
@property (nonatomic)B4ILabelWrapper* _lblcantcat;
@property (nonatomic)B4ILabelWrapper* _lblopcionesproductonombre;
@property (nonatomic)B4ITextFieldWrapper* _txtcantidad;
@property (nonatomic)B4IStepperWrapper* _stmodificarcantidad;
@property (nonatomic)B4IButtonWrapper* _btnopcionesproductosalvar;
@property (nonatomic)B4IPanelWrapper* _panelopcionesback;
@property (nonatomic)B4IButtonWrapper* _btnopcionesback;
@property (nonatomic)B4IButtonWrapper* _btnopcioneseliminar;
@property (nonatomic)B4ITextFieldWrapper* _txtproductocomentario;
@property (nonatomic)B4IPanelWrapper* _paneldireccion;
@property (nonatomic)b4i_customlistview* _milistadireccion;
@property (nonatomic)B4IButtonWrapper* _btnbackmdaldireccion;
@property (nonatomic)B4IButtonWrapper* _btnabrirdireccion;
@property (nonatomic)B4IPanelWrapper* _panelfondodireccionmodal;
@property (nonatomic)B4ILabelWrapper* _lbldir;
@property (nonatomic)B4ILabelWrapper* _lblfecha;
@property (nonatomic)B4ILabelWrapper* _lblprincipal;
@property (nonatomic)B4IButtonWrapper* _btnordenenviar;
@property (nonatomic)B4IButtonWrapper* _btnordeneliminartodos;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _stmodificarcantidad_valuechanged:(double) _value;
@end
