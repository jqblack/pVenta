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
@class b4i_facturacion;
@class b4i_direcciones;
@class b4i_perfil;
@class b4i_httputils2service;
@class _typeu;
@class _clvitem;
@class b4i_customlistview;
@class b4i_b4xcombobox;
@class b4i_b4xdrawer;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_favoritos : B4IStaticModule
{
@public B4IPage* __pagefv;
@public B4IPage* __pagedetalle;
@public B4IMap* __mapadetalle;
@public BOOL __actu;
@public BOOL __actucantidad;
@public iHUD* __hud;
@public B4ILabelWrapper* __lblcantproductos;
@public B4IButtonWrapper* __btnbackfavoritos;
@public b4i_customlistview* __llistafavoritos;
@public B4IList* __militafav;
@public B4ILabelWrapper* __lblnomcat;
@public B4ILabelWrapper* __lblcantcat;
@public B4IImageViewWrapper* __imgcat;
@public B4IPanelWrapper* __panelfondodetalles;
@public B4IImageViewWrapper* __imageviewdetalles;
@public B4ILabelWrapper* __lblprecioencabezado;
@public B4ILabelWrapper* __lblnombeencabezado;
@public B4IImageViewWrapper* __imgdetallefav;
@public B4ILabelWrapper* __lblcantidad;
@public B4IButtonWrapper* __btnless;
@public B4IButtonWrapper* __btnmore;
@public B4ILabelWrapper* __lblprecio;
@public B4IButtonWrapper* __btnagregarcarritodetalle;
@public B4IButtonWrapper* __btnbackdetalles;
@public B4IPanelWrapper* __panelimagendetalles;
@public B4IPanelWrapper* __panellblcantidad;
@public B4IPanelWrapper* __panelencabezadodetalles;
@public B4IStepperWrapper* __steppercantidad;
@public B4ILabelWrapper* __lblcantidadproductos;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_httputils2service* __httputils2service;

}- (void)  _btnagregarcarritodetalle_click;
- (NSString*)  _btnbackdetalles_click;
- (NSString*)  _btnbackfavoritos_click;
- (NSString*)  _cargarlistafavoritos;
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height;
- (NSString*)  _imgdetallefav_click;
- (NSString*)  _initilize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _llistafavoritos_itemclick:(int) _index :(NSObject*) _value;
- (NSString*)  _msgeliminar_click:(NSString*) _buttontext;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _pagefv;
@property (nonatomic)B4IPage* _pagedetalle;
@property (nonatomic)B4IMap* _mapadetalle;
@property (nonatomic)BOOL _actu;
@property (nonatomic)BOOL _actucantidad;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)B4ILabelWrapper* _lblcantproductos;
@property (nonatomic)B4IButtonWrapper* _btnbackfavoritos;
@property (nonatomic)b4i_customlistview* _llistafavoritos;
@property (nonatomic)B4IList* _militafav;
@property (nonatomic)B4ILabelWrapper* _lblnomcat;
@property (nonatomic)B4ILabelWrapper* _lblcantcat;
@property (nonatomic)B4IImageViewWrapper* _imgcat;
@property (nonatomic)B4IPanelWrapper* _panelfondodetalles;
@property (nonatomic)B4IImageViewWrapper* _imageviewdetalles;
@property (nonatomic)B4ILabelWrapper* _lblprecioencabezado;
@property (nonatomic)B4ILabelWrapper* _lblnombeencabezado;
@property (nonatomic)B4IImageViewWrapper* _imgdetallefav;
@property (nonatomic)B4ILabelWrapper* _lblcantidad;
@property (nonatomic)B4IButtonWrapper* _btnless;
@property (nonatomic)B4IButtonWrapper* _btnmore;
@property (nonatomic)B4ILabelWrapper* _lblprecio;
@property (nonatomic)B4IButtonWrapper* _btnagregarcarritodetalle;
@property (nonatomic)B4IButtonWrapper* _btnbackdetalles;
@property (nonatomic)B4IPanelWrapper* _panelimagendetalles;
@property (nonatomic)B4IPanelWrapper* _panellblcantidad;
@property (nonatomic)B4IPanelWrapper* _panelencabezadodetalles;
@property (nonatomic)B4IStepperWrapper* _steppercantidad;
@property (nonatomic)B4ILabelWrapper* _lblcantidadproductos;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad;
- (NSString*)  _steppercantidad_valuechanged:(double) _value;
@end
