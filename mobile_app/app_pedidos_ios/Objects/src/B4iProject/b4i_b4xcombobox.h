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
@class b4i_b4xdrawer;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_b4xcombobox : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public B4IList* __mitems;
@public int __mselectedindex;
@public B4XViewWrapper* __mbtn;
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

}- (NSString*)  _base_resize:(b4i_b4xcombobox*) __ref :(double) _width :(double) _height;
- (void)  _btn_click:(b4i_b4xcombobox*) __ref;
- (NSString*)  _class_globals:(b4i_b4xcombobox*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4IList* _mitems;
@property (nonatomic)int _mselectedindex;
@property (nonatomic)B4XViewWrapper* _mbtn;
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
- (NSString*)  _designercreateview:(b4i_b4xcombobox*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (NSString*)  _getitem:(b4i_b4xcombobox*) __ref :(int) _index;
- (int)  _getselectedindex:(b4i_b4xcombobox*) __ref;
- (NSString*)  _initialize:(b4i_b4xcombobox*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (NSString*)  _raiseevent:(b4i_b4xcombobox*) __ref;
- (NSString*)  _setitems:(b4i_b4xcombobox*) __ref :(B4IList*) _items;
- (NSString*)  _setselectedindex:(b4i_b4xcombobox*) __ref :(int) _i;
@end
