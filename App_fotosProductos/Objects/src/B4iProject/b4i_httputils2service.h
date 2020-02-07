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
@class b4i_main;
@class _clvitem;
@class b4i_customlistview;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_httputils2service : B4IStaticModule
{
@public B4IHttp* __hc;
@public B4IMap* __taskidtojob;
@public NSString* __tempfolder;
@public int __taskcounter;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;

}- (NSString*)  _completejob:(int) _taskid :(BOOL) _success :(NSString*) _errormessage :(B4IHttpResponse*) _res;
- (NSString*)  _hc_responseerror:(B4IHttpResponse*) _response :(NSString*) _reason :(int) _statuscode :(int) _taskid;
- (NSString*)  _hc_responsesuccess:(B4IHttpResponse*) _response :(int) _taskid;
- (NSString*)  _process_globals;
@property (nonatomic)B4IHttp* _hc;
@property (nonatomic)B4IMap* _taskidtojob;
@property (nonatomic)NSString* _tempfolder;
@property (nonatomic)int _taskcounter;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
- (NSString*)  _service_create;
- (NSString*)  _submitjob:(b4i_httpjob*) _job;
@end
