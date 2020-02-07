
#import "b4i_httpjob.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"

@implementation _multipartfiledata
-(void)Initialize{
self.IsInitialized = true;
self->_Dir = @"";
self->_FileName = @"";
self->_KeyName = @"";
self->_ContentType = @"";
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_httpjob 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_httpjob) instance released.");
}

- (NSString*)  _initialize:(b4i_httpjob*) __ref :(B4I*) _ba :(NSString*) _name :(NSObject*) _targetmodule{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:::" :@[[B4I nilToNSNull:_ba],[B4I nilToNSNull:_name],[B4I nilToNSNull:_targetmodule]]]);}
B4IRDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
B4IRDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="JobName = Name";
__ref->__jobname /*NSString**/  = _name;
B4IRDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="target = TargetModule";
__ref->__target /*NSObject**/  = _targetmodule;
B4IRDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _poststring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"poststring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"poststring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
B4IRDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _postbytes /*NSString**/ :nil :_link :[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getstring:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getstring" :nil]);}
B4IRDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Public Sub GetString As String";
B4IRDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return [__ref _getstring2 /*NSString**/ :nil :@"UTF8"];
B4IRDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _complete:(b4i_httpjob*) __ref :(B4IHttpResponse*) _res1{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"complete"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"complete:" :@[[B4I nilToNSNull:_res1]]]);}
B4IRDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Public Sub Complete (res1 As HttpResponse)";
B4IRDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Response = res1";
__ref->__response /*B4IHttpResponse**/  = _res1;
B4IRDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="CallSub2(target, \"Job\" & \"Done\", Me)";
[self->___c CallSub2:self.bi :__ref->__target /*NSObject**/  :[@[@"Job",@"Done"] componentsJoinedByString:@""] :self];
B4IRDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="End Sub";
return @"";
}
- (B4IHttpRequest*)  _getrequest:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getrequest"])
	 {return ((B4IHttpRequest*) [B4IDebug delegate:self.bi :@"getrequest" :nil]);}
B4IRDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Public Sub GetRequest As HttpRequest";
B4IRDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Return req";
if (true) return __ref->__req /*B4IHttpRequest**/ ;
B4IRDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _class_globals:(b4i_httpjob*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"httpjob";
B4IRDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Public JobName As String";
self->__jobname = @"";
B4IRDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Public Success As Boolean";
self->__success = false;
B4IRDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Public Username, Password As String";
self->__username = @"";
self->__password = @"";
B4IRDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Public ErrorMessage As String";
self->__errormessage = @"";
B4IRDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="Private target As Object";
self->__target = [NSObject new];
B4IRDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="Private req As HttpRequest";
self->__req = [B4IHttpRequest new];
B4IRDebugUtils.currentLine=3801100;
 //BA.debugLineNum = 3801100;BA.debugLine="Public Response As HttpResponse";
self->__response = [B4IHttpResponse new];
B4IRDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
B4IRDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _delete:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"delete"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"delete:" :@[[B4I nilToNSNull:_link]]]);}
B4IRDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Public Sub Delete(Link As String)";
B4IRDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="req.InitializeDelete(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeDelete:_link];
B4IRDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _delete2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"delete2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"delete2::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_parameters]]]);}
B4IRDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
B4IRDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
[__ref->__req /*B4IHttpRequest**/  InitializeDelete:[__ref _escapelink /*NSString**/ :nil :_link :_parameters]];
B4IRDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _escapelink:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"escapelink"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"escapelink::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_parameters]]]);}
B4IStringBuilder* _sb = nil;
iStringUtils* _su = nil;
int _i = 0;
B4IRDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
B4IRDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
B4IRDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="sb.Initialize";
[_sb Initialize];
B4IRDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="sb.Append(Link)";
[_sb Append:_link];
B4IRDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.Length>0) { 
[_sb Append:@"?"];};
B4IRDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
const int step6 = 2;
const int limit6 = (int) (_parameters.Length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
[_sb Append:@"&"];};
B4IRDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
[[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:_i]) :@"UTF8"]] Append:@"="];
B4IRDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:(int) (_i+1)]) :@"UTF8"]];
 }
};
B4IRDebugUtils.currentLine=4718603;
 //BA.debugLineNum = 4718603;BA.debugLine="Return sb.ToString";
if (true) return [_sb ToString];
B4IRDebugUtils.currentLine=4718604;
 //BA.debugLineNum = 4718604;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"download"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"download:" :@[[B4I nilToNSNull:_link]]]);}
B4IRDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Public Sub Download(Link As String)";
B4IRDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="req.InitializeGet(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeGet:_link];
B4IRDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"download2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"download2::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_parameters]]]);}
B4IRDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
B4IRDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
[__ref->__req /*B4IHttpRequest**/  InitializeGet:[__ref _escapelink /*NSString**/ :nil :_link :_parameters]];
B4IRDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getbitmap:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getbitmap"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getbitmap" :nil]);}
B4IBitmap* _b = nil;
B4IRDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Public Sub GetBitmap As Bitmap";
B4IRDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim b As Bitmap";
_b = [B4IBitmap new];
B4IRDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="b.Initialize2(Response.GetInputStream)";
[_b Initialize2:[__ref->__response /*B4IHttpResponse**/  GetInputStream]];
B4IRDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="Return b";
if (true) return _b;
B4IRDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return nil;
}
- (B4IBitmap*)  _getbitmapresize:(b4i_httpjob*) __ref :(int) _width :(int) _height :(BOOL) _keepaspectratio{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getbitmapresize"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getbitmapresize:::" :@[@(_width),@(_height),@(_keepaspectratio)]]);}
B4IRDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
B4IRDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Return GetBitmap.Resize(Width, Height, KeepAspect";
if (true) return [[__ref _getbitmap /*B4IBitmap**/ :nil] Resize:(float) (_width) :(float) (_height) :_keepaspectratio];
B4IRDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="End Sub";
return nil;
}
- (B4IInputStream*)  _getinputstream:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getinputstream"])
	 {return ((B4IInputStream*) [B4IDebug delegate:self.bi :@"getinputstream" :nil]);}
B4IRDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub GetInputStream As InputStream";
B4IRDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Return Response.GetInputStream";
if (true) return [__ref->__response /*B4IHttpResponse**/  GetInputStream];
B4IRDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getstring2:(b4i_httpjob*) __ref :(NSString*) _encoding{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getstring2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getstring2:" :@[[B4I nilToNSNull:_encoding]]]);}
B4IRDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
B4IRDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Return Response.GetString2(Encoding)";
if (true) return [__ref->__response /*B4IHttpResponse**/  GetString2:_encoding];
B4IRDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _head:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"head"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"head:" :@[[B4I nilToNSNull:_link]]]);}
B4IRDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Public Sub Head(Link As String)";
B4IRDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="req.InitializeHead(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeHead:_link];
B4IRDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _multipartstartsection:(b4i_httpjob*) __ref :(B4IOutputStream*) _stream :(BOOL) _empty{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"multipartstartsection"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"multipartstartsection::" :@[[B4I nilToNSNull:_stream],@(_empty)]]).boolValue;}
B4IRDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
B4IRDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="If empty = False Then";
if (_empty==false) { 
B4IRDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
[_stream WriteBytes:[[B4IArray alloc]initBytesWithData:@[@((unsigned char) (13)),@((unsigned char) (10))]] :(int) (0) :(int) (2)];
 }else {
B4IRDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="empty = False";
_empty = false;
 };
B4IRDebugUtils.currentLine=4456454;
 //BA.debugLineNum = 4456454;BA.debugLine="Return empty";
if (true) return _empty;
B4IRDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _patchbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"patchbytes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"patchbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);}
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
B4IRDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="req.InitializeGet(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeGet:_link];
B4IRDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Dim no As NativeObject = req";
_no = [B4INativeObject new];
_no.object = (NSObject*)(__ref->__req /*B4IHttpRequest**/ );
B4IRDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="no = no.GetField(\"object\")";
_no = [_no GetField:@"object"];
B4IRDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="no.RunMethod(\"setHTTPMethod:\", Array(\"PATCH\"))";
[_no RunMethod:@"setHTTPMethod:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"PATCH")]]]];
B4IRDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="no.RunMethod(\"setHTTPBody:\", Array(no.ArrayToNSDa";
[_no RunMethod:@"setHTTPBody:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:[_no ArrayToNSData:_data]]]]];
B4IRDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _patchstring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"patchstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"patchstring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
B4IRDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _patchbytes /*NSString**/ :nil :_link :[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postbytes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"postbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
B4IRDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="req.InitializePost2(Link, Data)";
[__ref->__req /*B4IHttpRequest**/  InitializePost2:_link :_data];
B4IRDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postfile:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _dir :(NSString*) _filename{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postfile"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"postfile:::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_dir],[B4I nilToNSNull:_filename]]]);}
B4IRDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
B4IRDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="req.InitializePost(Link, Dir, FileName)";
[__ref->__req /*B4IHttpRequest**/  InitializePost:_link :_dir :_filename];
B4IRDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4522009;
 //BA.debugLineNum = 4522009;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postmultipart:(b4i_httpjob*) __ref :(NSString*) _link :(B4IMap*) _namevalues :(B4IList*) _files{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postmultipart"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"postmultipart:::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_namevalues],[B4I nilToNSNull:_files]]]);}
NSString* _boundary = @"";
B4IOutputStream* _stream = nil;
B4IArray* _b = nil;
NSString* _eol = @"";
BOOL _empty = false;
NSString* _key = @"";
NSString* _value = @"";
NSString* _s = @"";
_multipartfiledata* _fd = nil;
B4IInputStream* _in = nil;
B4IRDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
B4IRDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = @"---------------------------1461124740692";
B4IRDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Dim stream As OutputStream";
_stream = [B4IOutputStream new];
B4IRDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="stream.InitializeToBytesArray(0)";
[_stream InitializeToBytesArray:(int) (0)];
B4IRDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Dim b() As Byte";
_b = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = [@[[self.bi CharToString:((unichar)((int) (13)))],[self.bi CharToString:((unichar)((int) (10)))]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=4390918;
 //BA.debugLineNum = 4390918;BA.debugLine="Dim empty As Boolean = True";
_empty = true;
B4IRDebugUtils.currentLine=4390919;
 //BA.debugLineNum = 4390919;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= nil && [_namevalues IsInitialized]) { 
B4IRDebugUtils.currentLine=4390920;
 //BA.debugLineNum = 4390920;BA.debugLine="For Each key As String In NameValues.Keys";
{
const id<B4IIterable> group8 = [_namevalues Keys];
const int groupLen8 = group8.Size
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = [self.bi ObjectToString:[group8 Get:index8]];
B4IRDebugUtils.currentLine=4390921;
 //BA.debugLineNum = 4390921;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = [self.bi ObjectToString:[_namevalues Get:(NSObject*)(_key)]];
B4IRDebugUtils.currentLine=4390922;
 //BA.debugLineNum = 4390922;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [__ref _multipartstartsection /*BOOL*/ :nil :_stream :_empty];
B4IRDebugUtils.currentLine=4390923;
 //BA.debugLineNum = 4390923;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"\n",@"Content-Disposition: form-data; name=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_key)],@"\"\n",@"\n",@"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_value)],@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=4390928;
 //BA.debugLineNum = 4390928;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
B4IRDebugUtils.currentLine=4390929;
 //BA.debugLineNum = 4390929;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
 }
};
 };
B4IRDebugUtils.currentLine=4390932;
 //BA.debugLineNum = 4390932;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= nil && [_files IsInitialized]) { 
B4IRDebugUtils.currentLine=4390933;
 //BA.debugLineNum = 4390933;BA.debugLine="For Each fd As MultipartFileData In Files";
{
const id<B4IIterable> group17 = _files;
const int groupLen17 = group17.Size
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (_multipartfiledata*)([group17 Get:index17]);
B4IRDebugUtils.currentLine=4390934;
 //BA.debugLineNum = 4390934;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [__ref _multipartstartsection /*BOOL*/ :nil :_stream :_empty];
B4IRDebugUtils.currentLine=4390935;
 //BA.debugLineNum = 4390935;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"\n",@"Content-Disposition: form-data; name=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_KeyName /*NSString**/ )],@"\"; filename=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_FileName /*NSString**/ )],@"\"\n",@"Content-Type: ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_ContentType /*NSString**/ )],@"\n",@"\n",@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=4390941;
 //BA.debugLineNum = 4390941;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
B4IRDebugUtils.currentLine=4390942;
 //BA.debugLineNum = 4390942;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
B4IRDebugUtils.currentLine=4390943;
 //BA.debugLineNum = 4390943;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = [B4IInputStream new];
_in = [[self->___c File] OpenInput:_fd->_Dir /*NSString**/  :_fd->_FileName /*NSString**/ ];
B4IRDebugUtils.currentLine=4390944;
 //BA.debugLineNum = 4390944;BA.debugLine="File.Copy2(in, stream)";
[[self->___c File] Copy2:_in :_stream];
 }
};
 };
B4IRDebugUtils.currentLine=4390947;
 //BA.debugLineNum = 4390947;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [__ref _multipartstartsection /*BOOL*/ :nil :_stream :_empty];
B4IRDebugUtils.currentLine=4390948;
 //BA.debugLineNum = 4390948;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"--\n",@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=4390951;
 //BA.debugLineNum = 4390951;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
B4IRDebugUtils.currentLine=4390952;
 //BA.debugLineNum = 4390952;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
B4IRDebugUtils.currentLine=4390953;
 //BA.debugLineNum = 4390953;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
[__ref _postbytes /*NSString**/ :nil :_link :[_stream ToBytesArray]];
B4IRDebugUtils.currentLine=4390954;
 //BA.debugLineNum = 4390954;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
[__ref->__req /*B4IHttpRequest**/  SetContentType:[@[@"multipart/form-data; boundary=",_boundary] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4390955;
 //BA.debugLineNum = 4390955;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
[__ref->__req /*B4IHttpRequest**/  SetContentEncoding:@"UTF8"];
B4IRDebugUtils.currentLine=4390956;
 //BA.debugLineNum = 4390956;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _putbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"putbytes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"putbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
B4IRDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="req.InitializePut2(Link, Data)";
[__ref->__req /*B4IHttpRequest**/  InitializePut2:_link :_data];
B4IRDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _putstring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"putstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"putstring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
B4IRDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _putbytes /*NSString**/ :nil :_link :[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _release:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"release"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"release" :nil]);}
B4IRDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Public Sub Release";
B4IRDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="End Sub";
return @"";
}
@end