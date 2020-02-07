
#import "b4i_httpjob.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_reporteordenes.h"
#import "b4i_httputils2service.h"
#import "b4i_animatedcounter.h"
#import "b4i_anotherprogressbar.h"
#import "b4i_b4xbreadcrumb.h"
#import "b4i_b4xcolortemplate.h"
#import "b4i_b4xcombobox.h"
#import "b4i_b4xdatetemplate.h"
#import "b4i_b4xdialog.h"
#import "b4i_b4xfloattextfield.h"
#import "b4i_b4xinputtemplate.h"
#import "b4i_b4xlisttemplate.h"
#import "b4i_b4xloadingindicator.h"
#import "b4i_b4xlongtexttemplate.h"
#import "b4i_b4xplusminus.h"
#import "b4i_b4xsearchtemplate.h"
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"

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
B4IRDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Public Sub Initialize (Name As String, TargetModul";
B4IRDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="JobName = Name";
__ref->__jobname /*NSString**/  = _name;
B4IRDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="target = TargetModule";
__ref->__target /*NSObject**/  = _targetmodule;
B4IRDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _poststring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"poststring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"poststring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Public Sub PostString(Link As String, Text As Stri";
B4IRDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="PostBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _postbytes /*NSString**/ :nil :_link :[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getstring:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getstring" :nil]);}
B4IRDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Public Sub GetString As String";
B4IRDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Return GetString2(\"UTF8\")";
if (true) return [__ref _getstring2 /*NSString**/ :nil :@"UTF8"];
B4IRDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _complete:(b4i_httpjob*) __ref :(B4IHttpResponse*) _res1{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"complete"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"complete:" :@[[B4I nilToNSNull:_res1]]]);}
B4IRDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Public Sub Complete (res1 As HttpResponse)";
B4IRDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Response = res1";
__ref->__response /*B4IHttpResponse**/  = _res1;
B4IRDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="CallSub2(target, \"Job\" & \"Done\", Me)";
[self->___c CallSub2:self.bi :__ref->__target /*NSObject**/  :[@[@"Job",@"Done"] componentsJoinedByString:@""] :self];
B4IRDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="End Sub";
return @"";
}
- (B4IHttpRequest*)  _getrequest:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getrequest"])
	 {return ((B4IHttpRequest*) [B4IDebug delegate:self.bi :@"getrequest" :nil]);}
B4IRDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Public Sub GetRequest As HttpRequest";
B4IRDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Return req";
if (true) return __ref->__req /*B4IHttpRequest**/ ;
B4IRDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _class_globals:(b4i_httpjob*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"httpjob";
B4IRDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Public JobName As String";
self->__jobname = @"";
B4IRDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Public Success As Boolean";
self->__success = false;
B4IRDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Public Username, Password As String";
self->__username = @"";
self->__password = @"";
B4IRDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Public ErrorMessage As String";
self->__errormessage = @"";
B4IRDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Private target As Object";
self->__target = [NSObject new];
B4IRDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="Private req As HttpRequest";
self->__req = [B4IHttpRequest new];
B4IRDebugUtils.currentLine=6619148;
 //BA.debugLineNum = 6619148;BA.debugLine="Public Response As HttpResponse";
self->__response = [B4IHttpResponse new];
B4IRDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="Public Tag As Object";
self->__tag = [NSObject new];
B4IRDebugUtils.currentLine=6619151;
 //BA.debugLineNum = 6619151;BA.debugLine="Type MultipartFileData (Dir As String, FileName A";
;
B4IRDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _delete:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"delete"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"delete:" :@[[B4I nilToNSNull:_link]]]);}
B4IRDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Public Sub Delete(Link As String)";
B4IRDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="req.InitializeDelete(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeDelete:_link];
B4IRDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _delete2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"delete2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"delete2::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_parameters]]]);}
B4IRDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Public Sub Delete2(Link As String, Parameters() As";
B4IRDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="req.InitializeDelete(escapeLink(Link, Parameters)";
[__ref->__req /*B4IHttpRequest**/  InitializeDelete:[__ref _escapelink /*NSString**/ :nil :_link :_parameters]];
B4IRDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="End Sub";
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
B4IRDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Private Sub escapeLink(Link As String, Parameters(";
B4IRDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim sb As StringBuilder";
_sb = [B4IStringBuilder new];
B4IRDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="sb.Initialize";
[_sb Initialize];
B4IRDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="sb.Append(Link)";
[_sb Append:_link];
B4IRDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="If Parameters.Length > 0 Then sb.Append(\"?\")";
if (_parameters.Length>0) { 
[_sb Append:@"?"];};
B4IRDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="For i = 0 To Parameters.Length - 1 Step 2";
{
const int step6 = 2;
const int limit6 = (int) (_parameters.Length-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="If i > 0 Then sb.Append(\"&\")";
if (_i>0) { 
[_sb Append:@"&"];};
B4IRDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i), \"UTF8\")).A";
[[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:_i]) :@"UTF8"]] Append:@"="];
B4IRDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="sb.Append(su.EncodeUrl(Parameters(i + 1), \"UTF8\"";
[_sb Append:[_su EncodeUrl:((NSString*)[_parameters getObjectFast:(int) (_i+1)]) :@"UTF8"]];
 }
};
B4IRDebugUtils.currentLine=7536651;
 //BA.debugLineNum = 7536651;BA.debugLine="Return sb.ToString";
if (true) return [_sb ToString];
B4IRDebugUtils.currentLine=7536652;
 //BA.debugLineNum = 7536652;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"download"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"download:" :@[[B4I nilToNSNull:_link]]]);}
B4IRDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Public Sub Download(Link As String)";
B4IRDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="req.InitializeGet(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeGet:_link];
B4IRDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _download2:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _parameters{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"download2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"download2::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_parameters]]]);}
B4IRDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub Download2(Link As String, Parameters()";
B4IRDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="req.InitializeGet(escapeLink(Link, Parameters))";
[__ref->__req /*B4IHttpRequest**/  InitializeGet:[__ref _escapelink /*NSString**/ :nil :_link :_parameters]];
B4IRDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getbitmap:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getbitmap"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getbitmap" :nil]);}
B4IBitmap* _b = nil;
B4IRDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Public Sub GetBitmap As Bitmap";
B4IRDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim b As Bitmap";
_b = [B4IBitmap new];
B4IRDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="b.Initialize2(Response.GetInputStream)";
[_b Initialize2:[__ref->__response /*B4IHttpResponse**/  GetInputStream]];
B4IRDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="Return b";
if (true) return _b;
B4IRDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return nil;
}
- (B4IBitmap*)  _getbitmapresize:(b4i_httpjob*) __ref :(int) _width :(int) _height :(BOOL) _keepaspectratio{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getbitmapresize"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getbitmapresize:::" :@[@(_width),@(_height),@(_keepaspectratio)]]);}
B4IRDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Public Sub GetBitmapResize(Width As Int, Height As";
B4IRDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Return GetBitmap.Resize(Width, Height, KeepAspect";
if (true) return [[__ref _getbitmap /*B4IBitmap**/ :nil] Resize:(float) (_width) :(float) (_height) :_keepaspectratio];
B4IRDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return nil;
}
- (B4IInputStream*)  _getinputstream:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getinputstream"])
	 {return ((B4IInputStream*) [B4IDebug delegate:self.bi :@"getinputstream" :nil]);}
B4IRDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub GetInputStream As InputStream";
B4IRDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Return Response.GetInputStream";
if (true) return [__ref->__response /*B4IHttpResponse**/  GetInputStream];
B4IRDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getstring2:(b4i_httpjob*) __ref :(NSString*) _encoding{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"getstring2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getstring2:" :@[[B4I nilToNSNull:_encoding]]]);}
B4IRDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Public Sub GetString2(Encoding As String) As Strin";
B4IRDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Return Response.GetString2(Encoding)";
if (true) return [__ref->__response /*B4IHttpResponse**/  GetString2:_encoding];
B4IRDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _head:(b4i_httpjob*) __ref :(NSString*) _link{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"head"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"head:" :@[[B4I nilToNSNull:_link]]]);}
B4IRDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub Head(Link As String)";
B4IRDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="req.InitializeHead(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeHead:_link];
B4IRDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _multipartstartsection:(b4i_httpjob*) __ref :(B4IOutputStream*) _stream :(BOOL) _empty{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"multipartstartsection"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"multipartstartsection::" :@[[B4I nilToNSNull:_stream],@(_empty)]]).boolValue;}
B4IRDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Private Sub MultipartStartSection (stream As Outpu";
B4IRDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="If empty = False Then";
if (_empty==false) { 
B4IRDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="stream.WriteBytes(Array As Byte(13, 10), 0, 2)";
[_stream WriteBytes:[[B4IArray alloc]initBytesWithData:@[@((unsigned char) (13)),@((unsigned char) (10))]] :(int) (0) :(int) (2)];
 }else {
B4IRDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="empty = False";
_empty = false;
 };
B4IRDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Return empty";
if (true) return _empty;
B4IRDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _patchbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"patchbytes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"patchbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);}
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub PatchBytes(Link As String, Data() As By";
B4IRDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="req.InitializeGet(Link)";
[__ref->__req /*B4IHttpRequest**/  InitializeGet:_link];
B4IRDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Dim no As NativeObject = req";
_no = [B4INativeObject new];
_no.object = (NSObject*)(__ref->__req /*B4IHttpRequest**/ );
B4IRDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="no = no.GetField(\"object\")";
_no = [_no GetField:@"object"];
B4IRDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="no.RunMethod(\"setHTTPMethod:\", Array(\"PATCH\"))";
[_no RunMethod:@"setHTTPMethod:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"PATCH")]]]];
B4IRDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="no.RunMethod(\"setHTTPBody:\", Array(no.ArrayToNSDa";
[_no RunMethod:@"setHTTPBody:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:[_no ArrayToNSData:_data]]]]];
B4IRDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7077900;
 //BA.debugLineNum = 7077900;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _patchstring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"patchstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"patchstring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub PatchString(Link As String, Text As Str";
B4IRDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="PatchBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _patchbytes /*NSString**/ :nil :_link :[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postbytes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"postbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Public Sub PostBytes(Link As String, Data() As Byt";
B4IRDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="req.InitializePost2(Link, Data)";
[__ref->__req /*B4IHttpRequest**/  InitializePost2:_link :_data];
B4IRDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _postfile:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _dir :(NSString*) _filename{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"postfile"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"postfile:::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_dir],[B4I nilToNSNull:_filename]]]);}
B4IRDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Public Sub PostFile(Link As String, Dir As String,";
B4IRDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="req.InitializePost(Link, Dir, FileName)";
[__ref->__req /*B4IHttpRequest**/  InitializePost:_link :_dir :_filename];
B4IRDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=7340057;
 //BA.debugLineNum = 7340057;BA.debugLine="End Sub";
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
B4IRDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub PostMultipart(Link As String, NameValue";
B4IRDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="Dim boundary As String = \"-----------------------";
_boundary = @"---------------------------1461124740692";
B4IRDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim stream As OutputStream";
_stream = [B4IOutputStream new];
B4IRDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="stream.InitializeToBytesArray(0)";
[_stream InitializeToBytesArray:(int) (0)];
B4IRDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Dim b() As Byte";
_b = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="Dim eol As String = Chr(13) & Chr(10)";
_eol = [@[[self.bi CharToString:((unichar)((int) (13)))],[self.bi CharToString:((unichar)((int) (10)))]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="Dim empty As Boolean = True";
_empty = true;
B4IRDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="If NameValues <> Null And NameValues.IsInitialize";
if (_namevalues!= nil && [_namevalues IsInitialized]) { 
B4IRDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="For Each key As String In NameValues.Keys";
{
const id<B4IIterable> group8 = [_namevalues Keys];
const int groupLen8 = group8.Size
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_key = [self.bi ObjectToString:[group8 Get:index8]];
B4IRDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="Dim value As String = NameValues.Get(key)";
_value = [self.bi ObjectToString:[_namevalues Get:(NSObject*)(_key)]];
B4IRDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [__ref _multipartstartsection /*BOOL*/ :nil :_stream :_empty];
B4IRDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"\n",@"Content-Disposition: form-data; name=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_key)],@"\"\n",@"\n",@"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_value)],@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
B4IRDebugUtils.currentLine=7208977;
 //BA.debugLineNum = 7208977;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
 }
};
 };
B4IRDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="If Files <> Null And Files.IsInitialized Then";
if (_files!= nil && [_files IsInitialized]) { 
B4IRDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="For Each fd As MultipartFileData In Files";
{
const id<B4IIterable> group17 = _files;
const int groupLen17 = group17.Size
;int index17 = 0;
;
for (; index17 < groupLen17;index17++){
_fd = (_multipartfiledata*)([group17 Get:index17]);
B4IRDebugUtils.currentLine=7208982;
 //BA.debugLineNum = 7208982;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [__ref _multipartstartsection /*BOOL*/ :nil :_stream :_empty];
B4IRDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="Dim s As String = _ $\"--${boundary} Content-Dis";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"\n",@"Content-Disposition: form-data; name=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_KeyName /*NSString**/ )],@"\"; filename=\"",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_FileName /*NSString**/ )],@"\"\n",@"Content-Type: ",[self->___c SmartStringFormatter:@"" :(NSObject*)(_fd->_ContentType /*NSString**/ )],@"\n",@"\n",@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=7208989;
 //BA.debugLineNum = 7208989;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
B4IRDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
B4IRDebugUtils.currentLine=7208991;
 //BA.debugLineNum = 7208991;BA.debugLine="Dim in As InputStream = File.OpenInput(fd.Dir,";
_in = [B4IInputStream new];
_in = [[self->___c File] OpenInput:_fd->_Dir /*NSString**/  :_fd->_FileName /*NSString**/ ];
B4IRDebugUtils.currentLine=7208992;
 //BA.debugLineNum = 7208992;BA.debugLine="File.Copy2(in, stream)";
[[self->___c File] Copy2:_in :_stream];
 }
};
 };
B4IRDebugUtils.currentLine=7208995;
 //BA.debugLineNum = 7208995;BA.debugLine="empty = MultipartStartSection (stream, empty)";
_empty = [__ref _multipartstartsection /*BOOL*/ :nil :_stream :_empty];
B4IRDebugUtils.currentLine=7208996;
 //BA.debugLineNum = 7208996;BA.debugLine="s = _ $\"--${boundary}-- \"$";
_s = ([@[@"--",[self->___c SmartStringFormatter:@"" :(NSObject*)(_boundary)],@"--\n",@""] componentsJoinedByString:@""]);
B4IRDebugUtils.currentLine=7208999;
 //BA.debugLineNum = 7208999;BA.debugLine="b = s.Replace(CRLF, eol).GetBytes(\"UTF8\")";
_b = [[_s Replace:@"\n" :_eol] GetBytes:@"UTF8"];
B4IRDebugUtils.currentLine=7209000;
 //BA.debugLineNum = 7209000;BA.debugLine="stream.WriteBytes(b, 0, b.Length)";
[_stream WriteBytes:_b :(int) (0) :_b.Length];
B4IRDebugUtils.currentLine=7209001;
 //BA.debugLineNum = 7209001;BA.debugLine="PostBytes(Link, stream.ToBytesArray)";
[__ref _postbytes /*NSString**/ :nil :_link :[_stream ToBytesArray]];
B4IRDebugUtils.currentLine=7209002;
 //BA.debugLineNum = 7209002;BA.debugLine="req.SetContentType(\"multipart/form-data; boundary";
[__ref->__req /*B4IHttpRequest**/  SetContentType:[@[@"multipart/form-data; boundary=",_boundary] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=7209003;
 //BA.debugLineNum = 7209003;BA.debugLine="req.SetContentEncoding(\"UTF8\")";
[__ref->__req /*B4IHttpRequest**/  SetContentEncoding:@"UTF8"];
B4IRDebugUtils.currentLine=7209004;
 //BA.debugLineNum = 7209004;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _putbytes:(b4i_httpjob*) __ref :(NSString*) _link :(B4IArray*) _data{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"putbytes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"putbytes::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Public Sub PutBytes(Link As String, Data() As Byte";
B4IRDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="req.InitializePut2(Link, Data)";
[__ref->__req /*B4IHttpRequest**/  InitializePut2:_link :_data];
B4IRDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="CallSubDelayed2(HttpUtils2Service, \"SubmitJob\", M";
[self->___c CallSubDelayed2:self.bi :(NSObject*)((self->__httputils2service).object) :@"SubmitJob" :self];
B4IRDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _putstring:(b4i_httpjob*) __ref :(NSString*) _link :(NSString*) _text{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"putstring"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"putstring::" :@[[B4I nilToNSNull:_link],[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Public Sub PutString(Link As String, Text As Strin";
B4IRDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="PutBytes(Link, Text.GetBytes(\"UTF8\"))";
[__ref _putbytes /*NSString**/ :nil :_link :[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _release:(b4i_httpjob*) __ref{
__ref = self;
B4IRDebugUtils.currentModule=@"httpjob";
if ([B4IDebug shouldDelegate: @"release"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"release" :nil]);}
B4IRDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Public Sub Release";
B4IRDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="End Sub";
return @"";
}
@end