#import "iCore.h"
#import "iXUI.h"
#import "iHttp.h"
#import "iHUD.h"
#import "iJSON.h"
#import "iDateUtils.h"
#import "iEncryption.h"
#import "iRandomAccessFile.h"
#import "iPhone.h"
#import "iMedia.h"
#import "iStringUtils.h"
@class b4i_httputils2service;
@class _clvitem;
@class b4i_customlistview;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_main : B4IStaticModule
{
@public B4IXUI* __xui;
@public NSString* __url;
@public int __idempresa;
@public NSString* __jobmsj;
@public NSString* __jobmsjtitle;
@public B4ICamera* __cam;
@public B4IMap* __mapaproducto;
@public B4IList* __listacategoria;
@public NSString* __idcategoria;
@public BOOL __enviado;
@public iHUD* __hudlistacargar;
@public iHUD* __hudenviar;
@public B4IApplicationWrapper* __app;
@public B4INavigationControllerWrapper* __navcontrol;
@public B4IPage* __page1;
@public B4IButtonWrapper* __btntipocategoria;
@public b4i_customlistview* __lista;
@public B4IPanelWrapper* __panelfondo;
@public B4ITextFieldWrapper* __txtnombreref;
@public B4IButtonWrapper* __btntomarfoto;
@public B4ILabelWrapper* __lblnombre;
@public B4ILabelWrapper* __lblreferencia;
@public B4IPanelWrapper* __panel1;
@public B4IButtonWrapper* __btncancelarfoto;
@public B4IButtonWrapper* __btnenviar;
@public B4IImageViewWrapper* __imgmyfoto;
@public B4ILabelWrapper* __lbltituloimagen;
@public B4IPanelWrapper* __panelfondoimagen;
@public B4IButtonWrapper* __btnbuscar;
@public b4i_dateutils* __dateutils;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _application_background;
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav;
- (NSString*)  _base64_decode:(NSString*) _text;
- (NSString*)  _btnbuscar_click;
- (NSString*)  _btncancelarfoto_click;
- (NSString*)  _btnenviar_click;
- (void)  _btntipocategoria_click;
- (void)  _sheet_click:(NSString*) _tipo;
- (NSString*)  _calllistaprincipal;
- (NSString*)  _cam_complete:(BOOL) _success :(B4IBitmap*) _image :(NSString*) _videopath;
- (NSString*)  _convertir:(NSObject*) _data;
- (B4XViewWrapper*)  _createitem:(NSString*) _nombre :(NSString*) _referencia;
- (NSString*)  _createlista:(B4IList*) _listapro;
- (B4IArray*)  _getbyteimagen:(B4IBitmap*) _bmap;
- (B4IArray*)  _getbyteimagen2:(B4IBitmap*) _bmap;
- (NSString*)  _getmd5:(NSString*) _text;
- (NSString*)  _gettoken;
- (NSString*)  _initcamera;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _lista_itemclick:(int) _index :(NSObject*) _value;
- (void)  _msg1_click:(NSString*) _buttontext;
- (NSString*)  _msg2_click:(NSString*) _buttontext;
- (NSString*)  _page1_resize:(int) _width :(int) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)NSString* _url;
@property (nonatomic)int _idempresa;
@property (nonatomic)NSString* _jobmsj;
@property (nonatomic)NSString* _jobmsjtitle;
@property (nonatomic)B4ICamera* _cam;
@property (nonatomic)B4IMap* _mapaproducto;
@property (nonatomic)B4IList* _listacategoria;
@property (nonatomic)NSString* _idcategoria;
@property (nonatomic)BOOL _enviado;
@property (nonatomic)iHUD* _hudlistacargar;
@property (nonatomic)iHUD* _hudenviar;
@property (nonatomic)B4IApplicationWrapper* _app;
@property (nonatomic)B4INavigationControllerWrapper* _navcontrol;
@property (nonatomic)B4IPage* _page1;
@property (nonatomic)B4IButtonWrapper* _btntipocategoria;
@property (nonatomic)b4i_customlistview* _lista;
@property (nonatomic)B4IPanelWrapper* _panelfondo;
@property (nonatomic)B4ITextFieldWrapper* _txtnombreref;
@property (nonatomic)B4IButtonWrapper* _btntomarfoto;
@property (nonatomic)B4ILabelWrapper* _lblnombre;
@property (nonatomic)B4ILabelWrapper* _lblreferencia;
@property (nonatomic)B4IPanelWrapper* _panel1;
@property (nonatomic)B4IButtonWrapper* _btncancelarfoto;
@property (nonatomic)B4IButtonWrapper* _btnenviar;
@property (nonatomic)B4IImageViewWrapper* _imgmyfoto;
@property (nonatomic)B4ILabelWrapper* _lbltituloimagen;
@property (nonatomic)B4IPanelWrapper* _panelfondoimagen;
@property (nonatomic)B4IButtonWrapper* _btnbuscar;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_httputils2service* _httputils2service;
@end
