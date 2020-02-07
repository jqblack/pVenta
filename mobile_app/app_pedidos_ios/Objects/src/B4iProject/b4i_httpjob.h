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
@class b4i_b4xdrawer;
@class _multipartfiledata;
@interface b4i_httpjob : B4IClass
{
@public NSString* __jobname;
@public BOOL __success;
@public NSString* __username;
@public NSString* __password;
@public NSString* __errormessage;
@public NSObject* __target;
@public B4IHttpRequest* __req;
@public B4IHttpResponse* __response;
@public NSObject* __tag;
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

}- (NSString*)  _class_globals:(b4i_httpjob*) __ref;
@property (nonatomic)NSString* _jobname;
@property (nonatomic)BOOL _success;
@property (nonatomic)NSString* _username;
@property (nonatomic)NSString* _password;
@property (nonatomic)NSString* _errormessage;
@property (nonatomic)NSObject* _target;
@property (nonatomic)B4IHttpRequest* _req;
@property (nonatomic)B4IHttpResponse* _response;
@property (nonatomic)NSObject* _tag;
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
- (NSString*)  _complete:(b4i_httpjob*) __ref :(B4IHttpResponse*) _res1;
- (NSString*)  _delete:(b4i_httpjob*) __ref :(NSString*) _link;
- (NSString*)  _delete2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters;
- (NSString*)  _download:(b4i_httpjob*) __ref :(NSString*) _link;
- (NSString*)  _download2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters;
- (NSString*)  _escapelink:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters;
- (B4IBitmap*)  _getbitmap:(b4i_httpjob*) __ref;
- (B4IBitmap*)  _getbitmapresize:(b4i_httpjob*) __ref :(int) _width :(int) _height :(BOOL) _keepaspectratio;
- (B4IInputStream*)  _getinputstream:(b4i_httpjob*) __ref;
- (B4IHttpRequest*)  _getrequest:(b4i_httpjob*) __ref;
- (NSString*)  _getstring:(b4i_httpjob*) __ref;
- (NSString*)  _getstring2:(b4i_httpjob*) __ref :(NSString*) _encoding;
- (NSString*)  _head:(b4i_httpjob*) __ref :(NSString*) _link;
- (NSString*)  _initialize:(b4i_httpjob*) __ref :(B4I*) _ba :(NSString*) _name :(NSObject*) _targetmodule;
- (BOOL)  _multipartstartsection:(b4i_httpjob*) __ref :(B4IOutputStream*) _stream :(BOOL) _empty;
- (NSString*)  _patchbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data;
- (NSString*)  _patchstring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text;
- (NSString*)  _postbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data;
- (NSString*)  _postfile:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _dir :(NSString*) _filename;
- (NSString*)  _postmultipart:(b4i_httpjob*) __ref :(NSString*) _link :(B4IMap*) _namevalues :(B4IList*) _files;
- (NSString*)  _poststring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text;
- (NSString*)  _putbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data;
- (NSString*)  _putstring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text;
- (NSString*)  _release:(b4i_httpjob*) __ref;
@end
@interface _multipartfiledata:NSObject
{
@public BOOL _IsInitialized;
@public NSString* _Dir;
@public NSString* _FileName;
@public NSString* _KeyName;
@public NSString* _ContentType;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSString* Dir;
@property (nonatomic)NSString* FileName;
@property (nonatomic)NSString* KeyName;
@property (nonatomic)NSString* ContentType;
-(void)Initialize;
@end
