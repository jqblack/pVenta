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
@class b4i_principal;
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
@interface b4i_main : B4IStaticModule
{
@public B4IApplicationWrapper* __app;
@public B4INavigationControllerWrapper* __navcontrol;
@public B4IPage* __page1;
@public B4IPage* __pageregistro;
@public B4ILabelWrapper* __label3;
@public B4IButtonWrapper* __btnlogin;
@public B4ILabelWrapper* __lblregistrarme;
@public B4ITextFieldWrapper* __txtcontrasena;
@public B4ITextFieldWrapper* __txtusuario;
@public B4ITextFieldWrapper* __txturl;
@public NSString* __token;
@public NSString* __tokenpublico;
@public BOOL __isloggedin;
@public NSString* __jobmsj;
@public NSString* __jobmsjtitle;
@public _typeu* __usersdata;
@public B4ISQL* __sql;
@public iHUD* __hud;
@public NSString* __url;
@public B4IButtonWrapper* __btnregistroclienteregistrarme;
@public B4ITextFieldWrapper* __txtcontrasena2;
@public B4ITextFieldWrapper* __txtcontrasenaregistro;
@public B4ITextFieldWrapper* __txtdireccion;
@public B4ITextFieldWrapper* __txtnombre;
@public B4ITextFieldWrapper* __txttelefono;
@public B4ITextFieldWrapper* __txtusuarioregistro;
@public b4i_dateutils* __dateutils;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _application_active;
- (NSString*)  _application_background;
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav;
- (NSString*)  _btnconfiguracion_click;
- (NSString*)  _btnlogin_click;
- (NSString*)  _btnregistroclienteregistrarme_click;
- (NSString*)  _crear;
- (NSString*)  _jobdone:(b4i_httpjob*) _job;
- (NSString*)  _lblregistrarme_click;
- (NSString*)  _page1_appear;
- (NSString*)  _page1_keyboardstatechanged:(float) _height;
- (NSString*)  _page1_resize:(int) _width :(int) _height;
- (NSString*)  _pageregistrocliente_keyboardstatechanged:(float) _height;
- (NSString*)  _process_globals;
@property (nonatomic)B4IApplicationWrapper* _app;
@property (nonatomic)B4INavigationControllerWrapper* _navcontrol;
@property (nonatomic)B4IPage* _page1;
@property (nonatomic)B4IPage* _pageregistro;
@property (nonatomic)B4ILabelWrapper* _label3;
@property (nonatomic)B4IButtonWrapper* _btnlogin;
@property (nonatomic)B4ILabelWrapper* _lblregistrarme;
@property (nonatomic)B4ITextFieldWrapper* _txtcontrasena;
@property (nonatomic)B4ITextFieldWrapper* _txtusuario;
@property (nonatomic)B4ITextFieldWrapper* _txturl;
@property (nonatomic)NSString* _token;
@property (nonatomic)NSString* _tokenpublico;
@property (nonatomic)BOOL _isloggedin;
@property (nonatomic)NSString* _jobmsj;
@property (nonatomic)NSString* _jobmsjtitle;
@property (nonatomic)_typeu* _usersdata;
@property (nonatomic)B4ISQL* _sql;
@property (nonatomic)iHUD* _hud;
@property (nonatomic)NSString* _url;
@property (nonatomic)B4IButtonWrapper* _btnregistroclienteregistrarme;
@property (nonatomic)B4ITextFieldWrapper* _txtcontrasena2;
@property (nonatomic)B4ITextFieldWrapper* _txtcontrasenaregistro;
@property (nonatomic)B4ITextFieldWrapper* _txtdireccion;
@property (nonatomic)B4ITextFieldWrapper* _txtnombre;
@property (nonatomic)B4ITextFieldWrapper* _txttelefono;
@property (nonatomic)B4ITextFieldWrapper* _txtusuarioregistro;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _updateurl;
@end
@interface _typeu:NSObject
{
@public BOOL _IsInitialized;
@public int _idUsuario;
@public NSString* _nombre;
@public NSString* _latitud;
@public NSString* _longitud;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)int idUsuario;
@property (nonatomic)NSString* nombre;
@property (nonatomic)NSString* latitud;
@property (nonatomic)NSString* longitud;
-(void)Initialize;
@end
