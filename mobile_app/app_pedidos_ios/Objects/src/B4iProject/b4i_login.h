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
@class b4i_funciones;
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
@interface b4i_login : B4IStaticModule
{
@public B4IButtonWrapper* __btnconfiguracion;
@public B4IButtonWrapper* __btnlogin;
@public B4IPanelWrapper* __panelconfiguracion;
@public iHUD* __toast;
@public B4IPage* __page;
@public NSString* __correro;
@public B4IPage* __pagereg;
@public B4ISQL* __sql;
@public iHUD* __hud;
@public int __width;
@public B4ISideMenuController* __smclog;
@public B4IButtonWrapper* __btnmenuprincipal;
@public B4ITextFieldWrapper* __txtusuario;
@public B4ITextFieldWrapper* __txtcontrasena;
@public B4IApplicationWrapper* __app;
@public B4ILabelWrapper* __lblregistrarme;
@public B4IButtonWrapper* __btnregistroclienteback;
@public B4IButtonWrapper* __btnregistroclienteregistrarme;
@public B4IPanelWrapper* __panel1;
@public B4ITextFieldWrapper* __txtcontrasena2;
@public B4ITextFieldWrapper* __txtcontrasenaregistro;
@public B4ITextFieldWrapper* __txtdireccion;
@public B4ITextFieldWrapper* __txtnombre;
@public B4ITextFieldWrapper* __txttelefono;
@public B4ITextFieldWrapper* __txtusuarioregistro;
@public B4ITextViewWrapper* __txturl;
@public B4IButtonWrapper* __btniniciarsecion;
@public b4i_main* __main;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnconfiguracion_click;
- (NSString*)  _btnlogin_click;
- (NSString*)  _btnmenuprincipal_click;
- (NSString*)  _btnregistroclienteback_click;
- (NSString*)  _btnregistroclienteregistrarme_click;
- (NSString*)  _clearregistro;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _lblregistrarme_click;
- (NSString*)  _pagelogin_keyboardstatechanged:(float) _height;
- (NSString*)  _pagereg_keyboardstatechanged:(float) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IButtonWrapper* _btnconfiguracion;
@property (nonatomic)B4IButtonWrapper* _btnlogin;
@property (nonatomic)B4IPanelWrapper* _panelconfiguracion;
@property (nonatomic)iHUD* _toast;
@property (nonatomic)B4IPage* _page;
@property (nonatomic)NSString* _correro;
@property (nonatomic)B4IPage* _pagereg;
@property (nonatomic)B4ISQL* _sql;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)int _width;
@property (nonatomic)B4ISideMenuController* _smclog;
@property (nonatomic)B4IButtonWrapper* _btnmenuprincipal;
@property (nonatomic)B4ITextFieldWrapper* _txtusuario;
@property (nonatomic)B4ITextFieldWrapper* _txtcontrasena;
@property (nonatomic)B4IApplicationWrapper* _app;
@property (nonatomic)B4ILabelWrapper* _lblregistrarme;
@property (nonatomic)B4IButtonWrapper* _btnregistroclienteback;
@property (nonatomic)B4IButtonWrapper* _btnregistroclienteregistrarme;
@property (nonatomic)B4IPanelWrapper* _panel1;
@property (nonatomic)B4ITextFieldWrapper* _txtcontrasena2;
@property (nonatomic)B4ITextFieldWrapper* _txtcontrasenaregistro;
@property (nonatomic)B4ITextFieldWrapper* _txtdireccion;
@property (nonatomic)B4ITextFieldWrapper* _txtnombre;
@property (nonatomic)B4ITextFieldWrapper* _txttelefono;
@property (nonatomic)B4ITextFieldWrapper* _txtusuarioregistro;
@property (nonatomic)B4ITextViewWrapper* _txturl;
@property (nonatomic)B4IButtonWrapper* _btniniciarsecion;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _updateurl;
@end
