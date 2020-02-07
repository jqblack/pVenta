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
@interface b4i_facturacion : B4IStaticModule
{
@public B4IPage* __page;
@public B4IPage* __pageopciones;
@public B4IPage* __pagedirecciones;
@public B4IButtonWrapper* __btnordenenviar;
@public B4ILabelWrapper* __lbldireccion;
@public B4ILabelWrapper* __lblordentotalpagar;
@public B4ILabelWrapper* __lblprecioenvio;
@public B4IPanelWrapper* __paneldireccion;
@public B4IPanelWrapper* __panelordenproductosdetalles;
@public B4IPanelWrapper* __panelordentotal;
@public B4ITableView* __listviewordenproducto;
@public double __tax;
@public double __subtotal;
@public double __total;
@public iHUD* __hud;
@public B4IButtonWrapper* __btnopcionesproductosalvar;
@public B4IScrollView* __scrollviewopciones;
@public B4IStepperWrapper* __stmodificarcantidad;
@public B4ITextFieldWrapper* __txtcantidad;
@public B4ITextViewWrapper* __txtproductocomentario;
@public B4ILabelWrapper* __lblopcionesproductonombre;
@public B4IPanelWrapper* __panelscrollviewopciones;
@public B4ITableView* __listviewdirecciones;
@public B4IButtonWrapper* __btnabrirdireccion;
@public B4IPanelWrapper* __panellistviewdirecciones;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnabrirdireccion_click;
- (NSString*)  _btnopcionesproductosalvar_click;
- (NSString*)  _btnordenenviar_click;
- (NSString*)  _cargardirecciones;
- (NSString*)  _cargarproductostemporales;
- (NSString*)  _crear;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _listviewdirecciones_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell;
- (NSString*)  _listviewordenproducto_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell;
- (void)  _pageproductoopciones_barbuttonclick:(NSString*) _tag;
- (NSString*)  _pageproductoopciones_keyboardstatechanged:(float) _height;
- (NSString*)  _paneldireccion_click;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _page;
@property (nonatomic)B4IPage* _pageopciones;
@property (nonatomic)B4IPage* _pagedirecciones;
@property (nonatomic)B4IButtonWrapper* _btnordenenviar;
@property (nonatomic)B4ILabelWrapper* _lbldireccion;
@property (nonatomic)B4ILabelWrapper* _lblordentotalpagar;
@property (nonatomic)B4ILabelWrapper* _lblprecioenvio;
@property (nonatomic)B4IPanelWrapper* _paneldireccion;
@property (nonatomic)B4IPanelWrapper* _panelordenproductosdetalles;
@property (nonatomic)B4IPanelWrapper* _panelordentotal;
@property (nonatomic)B4ITableView* _listviewordenproducto;
@property (nonatomic)double _tax;
@property (nonatomic)double _subtotal;
@property (nonatomic)double _total;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)B4IButtonWrapper* _btnopcionesproductosalvar;
@property (nonatomic)B4IScrollView* _scrollviewopciones;
@property (nonatomic)B4IStepperWrapper* _stmodificarcantidad;
@property (nonatomic)B4ITextFieldWrapper* _txtcantidad;
@property (nonatomic)B4ITextViewWrapper* _txtproductocomentario;
@property (nonatomic)B4ILabelWrapper* _lblopcionesproductonombre;
@property (nonatomic)B4IPanelWrapper* _panelscrollviewopciones;
@property (nonatomic)B4ITableView* _listviewdirecciones;
@property (nonatomic)B4IButtonWrapper* _btnabrirdireccion;
@property (nonatomic)B4IPanelWrapper* _panellistviewdirecciones;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _productoopciones_disappear;
- (void)  _productoorden_barbuttonclick:(NSString*) _tag;
- (NSString*)  _stmodificarcantidad_valuechanged:(double) _value;
- (NSString*)  _txtproductocomentario_textchanged:(NSString*) _oldtext :(NSString*) _newtext;
@end
