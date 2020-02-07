
#import "b4i_httpjob.h"
#import "b4i_main.h"
#import "b4i_customlistview.h"
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
    return [B4I alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_httpjob) instance released.");
}
- (NSString*)  _class_globals{
self->__main=[b4i_main new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public JobName As String";
self->__jobname = @"";
 //BA.debugLineNum = 4;BA.debugLine="Public Success As Boolean";
self->__success = false;
 //BA.debugLineNum = 5;BA.debugLine="Public Username, Password As String";
self->__username = @"";
self->__password = @"";
 //BA.debugLineNum = 6;BA.debugLine="Public ErrorMessage As String";
self->__errormessage = @"";
 //BA.debugLineNum = 7;BA.debugLine="Private target As Object";
self->__target = [NSObject new];
 //BA.debugLineNum = 13;BA.debugLine="Private req As HttpRequest";
self->__req = [B4IHttpRequest new];
 //BA.debugLineNum = 14;BA.debugLine="Public Response As HttpResponse";
self->__response = [B4IHttpResponse new];
 //BA.debugLineNum = 16;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
 //BA.debugLineNum = 17;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _complete:(B4IHttpResponse*) _res1{
 //BA.debugLineNum = 283;BA.debugLine="Public Sub Complete (res1 As HttpResponse)";
 //BA.debugLineNum = 284;BA.debugLine="Response = res1";
self->__response = _res1;
 //BA.debugLineNum = 285;BA.debugLine="CallSub2(target, \"Job\" & \"Done\", Me)";
[self->___c CallSub2:self.bi :self->__target :[@[@"Job",@"Done"] componentsJoinedByString:@""] :self];
 //BA.debugLineNum = 286;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _delete:(NSString*) _link{
 //BA.debugLineNum = 197;BA.debugLine="Public Sub Delete(Link As String)";
 //BA.debugLineNum = 198;BA.debugLine="req.InitializeDelete(Link)";
[self->__req InitializeDelete:_link];
 //BA.debugLineNum = 199;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _delete2:(NSString*) _link :(B4IArray*) _parameters{
 //BA.debugLineNum = 202;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
 //BA.debugLineNum = 203;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
[self->__req InitializeDelete:[self _escapelink:_link :_parameters]];
 //BA.debugLineNum = 204;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 205;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download:(NSString*) _link{
 //BA.debugLineNum = 167;BA.debugLine="Public Sub Download(Link As String)";
 //BA.debugLineNum = 168;BA.debugLine="req.InitializeGet(Link)";
[self->__req InitializeGet:_link];
 //BA.debugLineNum = 169;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 170;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download2:(NSString*) _link :(B4IArray*) _parameters{
 //BA.debugLineNum = 177;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
 //BA.debugLineNum = 178;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
[self->__req InitializeGet:[self _escapelink:_link :_parameters]];
 //BA.debugLineNum = 179;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 180;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _escapelink:(NSString*) _link :(B4IArray*) _parameters{
B4IStringBuilder* _sb = nil;
iStringUtils* _su = nil;
int _i = 0;
 //BA.debugLineNum = 182;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
 //BA.debugLineNum = 183;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
 //BA.debugLineNum = 184;BA.debugLine="sb.Initialize";
[_sb Initialize];
 //BA.debugLineNum = 185;BA.debugLine="sb.Append(Link)";
[_sb Append:_link];
 //BA.debugLineNum = 186;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.Length>0) { 
[_sb Append:@"?"];};
 //BA.debugLineNum = 187;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
 //BA.debugLineNum = 188;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
const int step6 = 2;
const int limit6 = (int) (_parameters.Length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
 //BA.debugLineNum = 189;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
[_sb Append:@"&"];};
 //BA.debugLineNum = 190;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
[[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:_i]) :@"UTF8"]] Append:@"="];
 //BA.debugLineNum = 191;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:(int) (_i+1)]) :@"UTF8"]];
 }
};
 //BA.debugLineNum = 193;BA.debugLine="Return sb.ToString";
if (true) return [_sb ToString];
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getbitmap{
B4IBitmap* _b = nil;
 //BA.debugLineNum = 288;BA.debugLine="Public Sub GetBitmap As Bitmap";
 //BA.debugLineNum = 289;BA.debugLine="Dim b As Bitmap";
_b = [B4IBitmap new];
 //BA.debugLineNum = 290;BA.debugLine="b.Initialize2(Response.GetInputStream)";
[_b Initialize2:[self->__response GetInputStream]];
 //BA.debugLineNum = 291;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 292;BA.debugLine="End Sub";
return nil;
}
- (B4IBitmap*)  _getbitmapresize:(int) _width :(int) _height :(BOOL) _keepaspectratio{
 //BA.debugLineNum = 295;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
 //BA.debugLineNum = 296;BA.debugLine="Return GetBitmap.Resize(Width, Height, KeepAspect";
if (true) return [[self _getbitmap] Resize:(float) (_width) :(float) (_height) :_keepaspectratio];
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return nil;
}
- (B4IInputStream*)  _getinputstream{
 //BA.debugLineNum = 300;BA.debugLine="Public Sub GetInputStream As InputStream";
 //BA.debugLineNum = 301;BA.debugLine="Return Response.GetInputStream";
if (true) return [self->__response GetInputStream];
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return nil;
}
- (B4IHttpRequest*)  _getrequest{
 //BA.debugLineNum = 278;BA.debugLine="Public Sub GetRequest As HttpRequest";
 //BA.debugLineNum = 279;BA.debugLine="Return req";
if (true) return self->__req;
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getstring{
 //BA.debugLineNum = 215;BA.debugLine="Public Sub GetString As String";
 //BA.debugLineNum = 216;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return [self _getstring2:@"UTF8"];
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getstring2:(NSString*) _encoding{
 //BA.debugLineNum = 220;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
 //BA.debugLineNum = 222;BA.debugLine="Return Response.GetString2(Encoding)";
if (true) return [self->__response GetString2:_encoding];
 //BA.debugLineNum = 230;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _head:(NSString*) _link{
 //BA.debugLineNum = 74;BA.debugLine="Public Sub Head(Link As String)";
 //BA.debugLineNum = 75;BA.debugLine="req.InitializeHead(Link)";
[self->__req InitializeHead:_link];
 //BA.debugLineNum = 76;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(B4I*) _ba :(NSString*) _name :(NSObject*) _targetmodule{
[self initializeClassModule];
 //BA.debugLineNum = 26;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
 //BA.debugLineNum = 27;BA.debugLine="JobName = Name";
self->__jobname = _name;
 //BA.debugLineNum = 28;BA.debugLine="target = TargetModule";
self->__target = _targetmodule;
 //BA.debugLineNum = 29;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _multipartstartsection:(B4IOutputStream*) _stream :(BOOL) _empty{
 //BA.debugLineNum = 128;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
 //BA.debugLineNum = 129;BA.debugLine="If empty = False Then";
if (_empty==false) { 
 //BA.debugLineNum = 130;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
[_stream WriteBytes:[[B4IArray alloc]initBytesWithData:@[@((unsigned char) (13)),@((unsigned char) (10))]] :(int) (0) :(int) (2)];
 }else {
 //BA.debugLineNum = 132;BA.debugLine="empty = False";
_empty = false;
 };
 //BA.debugLineNum = 134;BA.debugLine="Return empty";
if (true) return _empty;
 //BA.debugLineNum = 135;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _patchbytes:(NSString*) _link :(B4IArray*) _data{
B4INativeObject* _no = nil;
 //BA.debugLineNum = 58;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
 //BA.debugLineNum = 60;BA.debugLine="req.InitializeGet(Link)";
[self->__req InitializeGet:_link];
 //BA.debugLineNum = 61;BA.debugLine="Dim no As NativeObject = req";
_no = [B4INativeObject new];
_no.object = (NSObject*)(self->__req);
 //BA.debugLineNum = 62;BA.debugLine="no = no.GetField(\"object\")";
_no = [_no GetField:@"object"];
 //BA.debugLineNum = 63;BA.debugLine="no.RunMethod(\"setHTTPMethod:\", Array(\"PATCH\"))";
[_no RunMethod:@"setHTTPMethod:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"PATCH")]]]];
 //BA.debugLineNum = 64;BA.debugLine="no.RunMethod(\"setHTTPBody:\", Array(no.ArrayToNSDa";
[_no RunMethod:@"setHTTPBody:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:[_no ArrayToNSData:_data]]]]];
 //BA.debugLineNum = 69;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _patchstring:(NSString*) _link :(NSString*) _text{
 //BA.debugLineNum = 53;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
 //BA.debugLineNum = 54;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
[self _patchbytes:_link :[_text GetBytes:@"UTF8"]];
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postbytes:(NSString*) _link :(B4IArray*) _data{
 //BA.debugLineNum = 36;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
 //BA.debugLineNum = 37;BA.debugLine="req.InitializePost2(Link, Data)";
[self->__req InitializePost2:_link :_data];
 //BA.debugLineNum = 38;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postfile:(NSString*) _link :(NSString*) _dir :(NSString*) _filename{
 //BA.debugLineNum = 139;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
 //BA.debugLineNum = 141;BA.debugLine="req.InitializePost(Link, Dir, FileName)";
[self->__req InitializePost:_link :_dir :_filename];
 //BA.debugLineNum = 142;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postmultipart:(NSString*) _link :(B4IMap*) _namevalues :(B4IList*) _files{
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
 //BA.debugLineNum = 82;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
 //BA.debugLineNum = 83;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = @"---------------------------1461124740692";
 //BA.debugLineNum = 84;BA.debugLine="Dim stream As OutputStream";
_stream = [B4IOutputStream new];
 //BA.debugLineNum = 85;BA.debugLine="stream.InitializeToBytesArray(0)";
[_stream InitializeToBytesArray:(int) (0)];
 //BA.debugLineNum = 86;BA.debugLine="Dim b() As Byte";
_b = [[B4IArray alloc]initBytes:@[@((int) (0))]];
 //BA.debugLineNum = 87;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = [@[[self.bi CharToString:((unichar)((int) (13)))],[self.bi CharToString:((unichar)((int) (10)))]] componentsJoinedByString:@""];
 //BA.debugLineNum = 88;BA.debugLine="Dim empty As Boolean = True";
_empty = true;
 //BA.debugLineNum = 89;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= nil && [_namevalues IsInitialized]) { 
 //BA.debugLineNum = 90;BA.debugLine="For Each key As String In NameValues.Keys";
{
const id<B4IIterable> group8 = [_namevalues Keys];
const int groupLen8 = group8.Size
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = [self.bi ObjectToString:[group8 Get:index8]];
 //BA.debugLineNum = 91;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = [self.bi ObjectToString:[_namevalues Get:(NSObject*)(_key)]];
 //BA.debugLineNum = 92;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [self _multipartstartsection:_stream :_empty];
 //BA.debugLineNum = 93;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"\n",@"Content-Disposition: form-data; name=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_key)],@"\"\n",@"\n",@"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_value)],@""] componentsJoinedByString:@""]);
 //BA.debugLineNum = 98;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
 //BA.debugLineNum = 99;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
 }
};
 };
 //BA.debugLineNum = 102;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= nil && [_files IsInitialized]) { 
 //BA.debugLineNum = 103;BA.debugLine="For Each fd As MultipartFileData In Files";
{
const id<B4IIterable> group17 = _files;
const int groupLen17 = group17.Size
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (_multipartfiledata*)([group17 Get:index17]);
 //BA.debugLineNum = 104;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [self _multipartstartsection:_stream :_empty];
 //BA.debugLineNum = 105;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"\n",@"Content-Disposition: form-data; name=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_KeyName /*NSString**/ )],@"\"; filename=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_FileName /*NSString**/ )],@"\"\n",@"Content-Type: ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_ContentType /*NSString**/ )],@"\n",@"\n",@""] componentsJoinedByString:@""]);
 //BA.debugLineNum = 111;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
 //BA.debugLineNum = 112;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
 //BA.debugLineNum = 113;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = [B4IInputStream new];
_in = [[self->___c File] OpenInput:_fd->_Dir /*NSString**/  :_fd->_FileName /*NSString**/ ];
 //BA.debugLineNum = 114;BA.debugLine="File.Copy2(in, stream)";
[[self->___c File] Copy2:_in :_stream];
 }
};
 };
 //BA.debugLineNum = 117;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [self _multipartstartsection:_stream :_empty];
 //BA.debugLineNum = 118;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"--\n",@""] componentsJoinedByString:@""]);
 //BA.debugLineNum = 121;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
 //BA.debugLineNum = 122;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
 //BA.debugLineNum = 123;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
[self _postbytes:_link :[_stream ToBytesArray]];
 //BA.debugLineNum = 124;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
[self->__req SetContentType:[@[@"multipart/form-data; boundary=",_boundary] componentsJoinedByString:@""]];
 //BA.debugLineNum = 125;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
[self->__req SetContentEncoding:@"UTF8"];
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _poststring:(NSString*) _link :(NSString*) _text{
 //BA.debugLineNum = 31;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
 //BA.debugLineNum = 32;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
[self _postbytes:_link :[_text GetBytes:@"UTF8"]];
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _putbytes:(NSString*) _link :(B4IArray*) _data{
 //BA.debugLineNum = 47;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
 //BA.debugLineNum = 48;BA.debugLine="req.InitializePut2(Link, Data)";
[self->__req InitializePut2:_link :_data];
 //BA.debugLineNum = 49;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _putstring:(NSString*) _link :(NSString*) _text{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
 //BA.debugLineNum = 43;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
[self _putbytes:_link :[_text GetBytes:@"UTF8"]];
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _release{
 //BA.debugLineNum = 208;BA.debugLine="Public Sub Release";
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return @"";
}
@end
