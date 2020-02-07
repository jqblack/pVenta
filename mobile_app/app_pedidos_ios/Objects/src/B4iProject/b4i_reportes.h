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
@interface b4i_reportes : B4IStaticModule
{
@public B4IPage* __pagereporte;
@public B4IPanelWrapper* __panel1;
@public B4IPanelWrapper* __panel3;
@public B4ILabelWrapper* __lblfechainicio;
@public B4ILabelWrapper* __lblfechafinal;
@public B4IPanelWrapper* __panelfondodatepicker;
@public BOOL __cualfe;
@public B4IMap* __mapaborrar;
@public int __indiceborrar;
@public NSString* __numorden;
@public B4IList* __listaaddall;
@public B4IList* __listaux;
@public B4IMap* __mapadetalleorden;
@public int __indicedetalleorden;
@public B4IButtonWrapper* __btncancelardate;
@public B4IButtonWrapper* __btnaceptardate;
@public B4IDatePickerWrapper* __datefecha;
@public b4i_customlistview* __listaordenes;
@public B4ILabelWrapper* __label3;
@public B4ILabelWrapper* __lbldir;
@public B4ILabelWrapper* __lblfecha;
@public B4ILabelWrapper* __lblprincipal;
@public B4IButtonWrapper* __btnbuscarreporte;
@public iHUD* __hud;
@public B4IPanelWrapper* __panelfondodetalleorden;
@public B4ILabelWrapper* __lbltituloproorden;
@public b4i_customlistview* __listproordendetalle;
@public B4IButtonWrapper* __btnbackproorden;
@public B4IButtonWrapper* __btnaddallproorden;
@public B4IImageViewWrapper* __imgcat;
@public B4ILabelWrapper* __lblnomcat;
@public B4ILabelWrapper* __lblcantcat;
@public B4IButtonWrapper* __btnreporteback;
@public B4IPanelWrapper* __panel2;
@public B4IPanelWrapper* __panelencabezadom;
@public B4IPanelWrapper* __panelencabezadorepo;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnaceptardate_click;
- (NSString*)  _btnaddallproorden_click;
- (NSString*)  _btnbackproorden_click;
- (NSString*)  _btnbuscarreporte_click;
- (NSString*)  _btncancelardate_click;
- (NSString*)  _btnreporteback_click;
- (NSString*)  _buscarordenes;
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _dir :(NSString*) _fecha :(NSString*) _principal :(int) _width :(int) _height;
- (B4IPanelWrapper*)  _createlistitem2:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _listaordenes_itemclick:(int) _index :(NSObject*) _value;
- (NSString*)  _listaordenes_itemlongclick:(int) _index :(NSObject*) _value;
- (NSString*)  _listproordendetalle_itemclick:(int) _index :(NSObject*) _value;
- (NSString*)  _msg1_click:(NSString*) _buttontext;
- (NSString*)  _msg2_click:(NSString*) _buttontext;
- (NSString*)  _msg3_click:(NSString*) _buttontext;
- (NSString*)  _panel1_click;
- (NSString*)  _panel3_click;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _pagereporte;
@property (nonatomic)B4IPanelWrapper* _panel1;
@property (nonatomic)B4IPanelWrapper* _panel3;
@property (nonatomic)B4ILabelWrapper* _lblfechainicio;
@property (nonatomic)B4ILabelWrapper* _lblfechafinal;
@property (nonatomic)B4IPanelWrapper* _panelfondodatepicker;
@property (nonatomic)BOOL _cualfe;
@property (nonatomic)B4IMap* _mapaborrar;
@property (nonatomic)int _indiceborrar;
@property (nonatomic)NSString* _numorden;
@property (nonatomic)B4IList* _listaaddall;
@property (nonatomic)B4IList* _listaux;
@property (nonatomic)B4IMap* _mapadetalleorden;
@property (nonatomic)int _indicedetalleorden;
@property (nonatomic)B4IButtonWrapper* _btncancelardate;
@property (nonatomic)B4IButtonWrapper* _btnaceptardate;
@property (nonatomic)B4IDatePickerWrapper* _datefecha;
@property (nonatomic)b4i_customlistview* _listaordenes;
@property (nonatomic)B4ILabelWrapper* _label3;
@property (nonatomic)B4ILabelWrapper* _lbldir;
@property (nonatomic)B4ILabelWrapper* _lblfecha;
@property (nonatomic)B4ILabelWrapper* _lblprincipal;
@property (nonatomic)B4IButtonWrapper* _btnbuscarreporte;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)B4IPanelWrapper* _panelfondodetalleorden;
@property (nonatomic)B4ILabelWrapper* _lbltituloproorden;
@property (nonatomic)b4i_customlistview* _listproordendetalle;
@property (nonatomic)B4IButtonWrapper* _btnbackproorden;
@property (nonatomic)B4IButtonWrapper* _btnaddallproorden;
@property (nonatomic)B4IImageViewWrapper* _imgcat;
@property (nonatomic)B4ILabelWrapper* _lblnomcat;
@property (nonatomic)B4ILabelWrapper* _lblcantcat;
@property (nonatomic)B4IButtonWrapper* _btnreporteback;
@property (nonatomic)B4IPanelWrapper* _panel2;
@property (nonatomic)B4IPanelWrapper* _panelencabezadom;
@property (nonatomic)B4IPanelWrapper* _panelencabezadorepo;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad;
- (NSString*)  _salvar_detalle_temporal_all:(B4IMap*) _map :(int) _cantidad;
@end
