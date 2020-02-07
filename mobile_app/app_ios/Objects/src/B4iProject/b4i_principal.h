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
@interface b4i_principal : B4IStaticModule
{
@public B4IPage* __page;
@public B4IPage* __pageinfo;
@public int __idempresa;
@public BOOL __impuestoincluido;
@public B4IMap* __mapempresainfo;
@public int __cantidadproduto;
@public B4IButtonWrapper* __btnabierto;
@public B4IButtonWrapper* __btnbuscarproducto;
@public B4IButtonWrapper* __btnmasvendido;
@public B4ILabelWrapper* __lblcategoria;
@public B4ILabelWrapper* __lbllema;
@public B4IScrollView* __viewcategoria;
@public iHUD* __hud;
@public B4IPanelWrapper* __panelcategoria;
@public B4IButtonWrapper* __btninfocerrar;
@public B4ITextViewWrapper* __lbldireccion;
@public B4ILabelWrapper* __lblinfoempresa;
@public B4ILabelWrapper* __lblinfonegocio;
@public B4ILabelWrapper* __lblpedidominimo;
@public B4ILabelWrapper* __lbltelefono;
@public B4IPanelWrapper* __panelinfoback;
@public B4ITableView* __listproductosmodalview;
@public B4IButtonWrapper* __btnproductobuscarmodal;
@public B4IButtonWrapper* __btnproductovolver;
@public B4IPanelWrapper* __panelproductosmodalview;
@public B4ITextFieldWrapper* __txtbuscarproducto;
@public B4IPanelWrapper* __panelmodalproducto;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnbuscarproducto_click;
- (NSString*)  _btninfocerrar_click;
- (NSString*)  _btnmasvendido_click;
- (NSString*)  _btnproductobuscarmodal_click;
- (NSString*)  _btnproductovolver_click;
- (NSString*)  _btnviewcategoria_click;
- (NSString*)  _btnviewproducto_click;
- (NSString*)  _cargarcaterorias;
- (NSString*)  _cargarviewproductos:(B4IList*) _list :(BOOL) _categorias;
- (void)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _listproductosmodalview_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell;
- (void)  _loginuser;
- (NSString*)  _pageprincipal_appear;
- (NSString*)  _pageprincipal_barbuttonclick:(NSString*) _tag;
- (NSString*)  _pageprincipal_disappear;
- (NSString*)  _pageprincipal_resize:(int) _width :(int) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _page;
@property (nonatomic)B4IPage* _pageinfo;
@property (nonatomic)int _idempresa;
@property (nonatomic)BOOL _impuestoincluido;
@property (nonatomic)B4IMap* _mapempresainfo;
@property (nonatomic)int _cantidadproduto;
@property (nonatomic)B4IButtonWrapper* _btnabierto;
@property (nonatomic)B4IButtonWrapper* _btnbuscarproducto;
@property (nonatomic)B4IButtonWrapper* _btnmasvendido;
@property (nonatomic)B4ILabelWrapper* _lblcategoria;
@property (nonatomic)B4ILabelWrapper* _lbllema;
@property (nonatomic)B4IScrollView* _viewcategoria;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)B4IPanelWrapper* _panelcategoria;
@property (nonatomic)B4IButtonWrapper* _btninfocerrar;
@property (nonatomic)B4ITextViewWrapper* _lbldireccion;
@property (nonatomic)B4ILabelWrapper* _lblinfoempresa;
@property (nonatomic)B4ILabelWrapper* _lblinfonegocio;
@property (nonatomic)B4ILabelWrapper* _lblpedidominimo;
@property (nonatomic)B4ILabelWrapper* _lbltelefono;
@property (nonatomic)B4IPanelWrapper* _panelinfoback;
@property (nonatomic)B4ITableView* _listproductosmodalview;
@property (nonatomic)B4IButtonWrapper* _btnproductobuscarmodal;
@property (nonatomic)B4IButtonWrapper* _btnproductovolver;
@property (nonatomic)B4IPanelWrapper* _panelproductosmodalview;
@property (nonatomic)B4ITextFieldWrapper* _txtbuscarproducto;
@property (nonatomic)B4IPanelWrapper* _panelmodalproducto;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map;
@end
