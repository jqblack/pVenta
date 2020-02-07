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
@interface b4i_categoria : B4IStaticModule
{
@public B4IPanelWrapper* __panellista;
@public B4ITableView* __listacat;
@public iHUD* __hud;
@public B4IMap* __mapadetalle;
@public BOOL __actualizar;
@public B4IPage* __pagecat;
@public B4IPage* __pageprobycat;
@public B4IPage* __pagedetalle;
@public B4IButtonWrapper* __btnbackcat;
@public b4i_customlistview* __customlistviewcategoria;
@public B4IImageViewWrapper* __imgcat;
@public B4ILabelWrapper* __lblnomcat;
@public B4ILabelWrapper* __lblcantcat;
@public B4IScrollView* __scrollviewprobycat;
@public B4ILabelWrapper* __label1;
@public B4IPanelWrapper* __panelfondoproductosbycategorias;
@public B4IButtonWrapper* __btnbackprobycat;
@public B4ILabelWrapper* __label2;
@public B4IButtonWrapper* __btnbackdetalles;
@public B4IImageViewWrapper* __imageviewdetalles;
@public B4ILabelWrapper* __lblprecioencabezado;
@public B4ILabelWrapper* __lblnombeencabezado;
@public B4IImageViewWrapper* __imgdetallefav;
@public B4IButtonWrapper* __btnagregarcarritodetalle;
@public B4IStepperWrapper* __steppercantidad;
@public B4ILabelWrapper* __lblprecio;
@public B4IPanelWrapper* __panelimagendetalles;
@public B4IPanelWrapper* __panelfondodetalles;
@public B4ILabelWrapper* __lblcantidad;
@public B4IPanelWrapper* __panellblcantidad;
@public B4IPanelWrapper* __panelencabezadodetalles;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnaddproducto_click;
- (NSString*)  _btnagregarcarritodetalle_click;
- (NSString*)  _btnbackcat_click;
- (NSString*)  _btnbackdetalles_click;
- (NSString*)  _btnbackprobycat_click;
- (NSString*)  _clearscrollview:(B4IScrollView*) _sv;
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(int) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height;
- (B4IPanelWrapper*)  _createpanelproductoscroll:(B4IMap*) _mapapanel1 :(B4IBitmap*) _imagen;
- (NSString*)  _customlistviewcategoria_itemclick:(int) _index :(NSObject*) _value;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _listacat_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell;
- (NSString*)  _panelfondopro_click;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPanelWrapper* _panellista;
@property (nonatomic)B4ITableView* _listacat;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)B4IMap* _mapadetalle;
@property (nonatomic)BOOL _actualizar;
@property (nonatomic)B4IPage* _pagecat;
@property (nonatomic)B4IPage* _pageprobycat;
@property (nonatomic)B4IPage* _pagedetalle;
@property (nonatomic)B4IButtonWrapper* _btnbackcat;
@property (nonatomic)b4i_customlistview* _customlistviewcategoria;
@property (nonatomic)B4IImageViewWrapper* _imgcat;
@property (nonatomic)B4ILabelWrapper* _lblnomcat;
@property (nonatomic)B4ILabelWrapper* _lblcantcat;
@property (nonatomic)B4IScrollView* _scrollviewprobycat;
@property (nonatomic)B4ILabelWrapper* _label1;
@property (nonatomic)B4IPanelWrapper* _panelfondoproductosbycategorias;
@property (nonatomic)B4IButtonWrapper* _btnbackprobycat;
@property (nonatomic)B4ILabelWrapper* _label2;
@property (nonatomic)B4IButtonWrapper* _btnbackdetalles;
@property (nonatomic)B4IImageViewWrapper* _imageviewdetalles;
@property (nonatomic)B4ILabelWrapper* _lblprecioencabezado;
@property (nonatomic)B4ILabelWrapper* _lblnombeencabezado;
@property (nonatomic)B4IImageViewWrapper* _imgdetallefav;
@property (nonatomic)B4IButtonWrapper* _btnagregarcarritodetalle;
@property (nonatomic)B4IStepperWrapper* _steppercantidad;
@property (nonatomic)B4ILabelWrapper* _lblprecio;
@property (nonatomic)B4IPanelWrapper* _panelimagendetalles;
@property (nonatomic)B4IPanelWrapper* _panelfondodetalles;
@property (nonatomic)B4ILabelWrapper* _lblcantidad;
@property (nonatomic)B4IPanelWrapper* _panellblcantidad;
@property (nonatomic)B4IPanelWrapper* _panelencabezadodetalles;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad;
- (NSString*)  _steppercantidad_valuechanged:(double) _value;
@end
