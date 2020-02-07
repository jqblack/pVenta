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
@class b4i_favoritos;
@class b4i_httputils2service;
@class _typeu;
@class _clvitem;
@class b4i_customlistview;
@class b4i_b4xcombobox;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_b4xdrawer : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4IXUI* __xui;
@public int __msidewidth;
@public B4XViewWrapper* __mleftpanel;
@public B4XViewWrapper* __mdarkpanel;
@public B4XViewWrapper* __mbasepanel;
@public B4XViewWrapper* __mcenterpanel;
@public int __extrawidth;
@public float __touchxstart;
@public float __touchystart;
@public BOOL __isopen;
@public BOOL __handlingswipe;
@public BOOL __startatscrim;
@public BOOL __menabled;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _cancelgesture:(b4i_b4xdrawer*) __ref :(B4INativeObject*) _rec;
- (NSString*)  _changeoffset:(b4i_b4xdrawer*) __ref :(float) _x :(BOOL) _currentlytouching :(BOOL) _noanimation;
- (NSString*)  _class_globals:(b4i_b4xdrawer*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)int _msidewidth;
@property (nonatomic)B4XViewWrapper* _mleftpanel;
@property (nonatomic)B4XViewWrapper* _mdarkpanel;
@property (nonatomic)B4XViewWrapper* _mbasepanel;
@property (nonatomic)B4XViewWrapper* _mcenterpanel;
@property (nonatomic)int _extrawidth;
@property (nonatomic)float _touchxstart;
@property (nonatomic)float _touchystart;
@property (nonatomic)BOOL _isopen;
@property (nonatomic)BOOL _handlingswipe;
@property (nonatomic)BOOL _startatscrim;
@property (nonatomic)BOOL _menabled;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _dark_touch:(b4i_b4xdrawer*) __ref :(int) _action :(float) _x :(float) _y;
- (B4XViewWrapper*)  _getcenterpanel:(b4i_b4xdrawer*) __ref;
- (BOOL)  _getgestureenabled:(b4i_b4xdrawer*) __ref;
- (BOOL)  _getleftopen:(b4i_b4xdrawer*) __ref;
- (B4XViewWrapper*)  _getleftpanel:(b4i_b4xdrawer*) __ref;
- (NSString*)  _initialize:(b4i_b4xdrawer*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname :(B4XViewWrapper*) _parent :(int) _sidewidth;
- (NSString*)  _leftpanel_click:(b4i_b4xdrawer*) __ref;
- (int)  _offsettocolor:(b4i_b4xdrawer*) __ref :(int) _x;
- (NSString*)  _pan_event:(b4i_b4xdrawer*) __ref :(NSObject*) _pan;
- (NSString*)  _resize:(b4i_b4xdrawer*) __ref :(int) _width :(int) _height;
- (NSString*)  _setgestureenabled:(b4i_b4xdrawer*) __ref :(BOOL) _b;
- (NSString*)  _setleftopen:(b4i_b4xdrawer*) __ref :(BOOL) _b;
@end
