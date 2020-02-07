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
@class b4i_favoritos;
@class b4i_httputils2service;
@class _typeu;
@class _clvitem;
@class b4i_customlistview;
@class b4i_b4xcombobox;
@class b4i_b4xdrawer;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_perfil : B4IStaticModule
{
@public B4IPage* __pageperfil;
@public iHUD* __hud;
@public B4IButtonWrapper* __btnchangepass;
@public B4IButtonWrapper* __btnperfilback;
@public B4IButtonWrapper* __btnsave;
@public B4ILabelWrapper* __lblemail;
@public B4IPanelWrapper* __panelencabezadouser;
@public B4ITextFieldWrapper* __txtdir;
@public B4ITextFieldWrapper* __txtnombre;
@public B4ITextFieldWrapper* __txttel;
@public B4IButtonWrapper* __btnbackchangepass;
@public B4IButtonWrapper* __btnconfirmchangepass;
@public B4ITextFieldWrapper* __txtnewpass;
@public B4ITextFieldWrapper* __txtpassantigua;
@public B4ITextFieldWrapper* __txtpassconfirm;
@public B4IPanelWrapper* __panelfondomodalpass;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _btnbackchangepass_click;
- (NSString*)  _btnchangepass_click;
- (NSString*)  _btnconfirmchangepass_click;
- (NSString*)  _btnperfilback_click;
- (NSString*)  _btnsave_click;
- (NSString*)  _buscardatos;
- (NSString*)  _initialize;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _process_globals;
@property (nonatomic)B4IPage* _pageperfil;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)B4IButtonWrapper* _btnchangepass;
@property (nonatomic)B4IButtonWrapper* _btnperfilback;
@property (nonatomic)B4IButtonWrapper* _btnsave;
@property (nonatomic)B4ILabelWrapper* _lblemail;
@property (nonatomic)B4IPanelWrapper* _panelencabezadouser;
@property (nonatomic)B4ITextFieldWrapper* _txtdir;
@property (nonatomic)B4ITextFieldWrapper* _txtnombre;
@property (nonatomic)B4ITextFieldWrapper* _txttel;
@property (nonatomic)B4IButtonWrapper* _btnbackchangepass;
@property (nonatomic)B4IButtonWrapper* _btnconfirmchangepass;
@property (nonatomic)B4ITextFieldWrapper* _txtnewpass;
@property (nonatomic)B4ITextFieldWrapper* _txtpassantigua;
@property (nonatomic)B4ITextFieldWrapper* _txtpassconfirm;
@property (nonatomic)B4IPanelWrapper* _panelfondomodalpass;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
@end
