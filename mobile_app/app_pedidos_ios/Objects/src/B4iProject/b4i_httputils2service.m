
#import "b4i_httputils2service.h"
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
#import "b4i_httpjob.h"


@implementation b4i_httputils2service 


+ (instancetype)new {
    static b4i_httputils2service* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 5;
}


- (NSString*)  _completejob:(int) _taskid :(BOOL) _success :(NSString*) _errormessage :(B4IHttpResponse*) _res{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"completejob"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"completejob::::" :@[@(_taskid),@(_success),[B4I nilToNSNull:_errormessage],[B4I nilToNSNull:_res]]]);}
b4i_httpjob* _job = nil;
B4IRDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
B4IRDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4i_httpjob*)([self->__taskidtojob Get:(NSObject*)(@(_taskid))]);
B4IRDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="TaskIdToJob.Remove(TaskId)";
[self->__taskidtojob Remove:(NSObject*)(@(_taskid))];
B4IRDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="job.success = success";
_job->__success /*BOOL*/  = _success;
B4IRDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="job.errorMessage = errorMessage";
_job->__errormessage /*NSString**/  = _errormessage;
B4IRDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="job.Complete(res)";
[_job _complete /*NSString**/ :nil :_res];
B4IRDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responseerror:(B4IHttpResponse*) _response :(NSString*) _reason :(int) _statuscode :(int) _taskid{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"hc_responseerror"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"hc_responseerror::::" :@[[B4I nilToNSNull:_response],[B4I nilToNSNull:_reason],@(_statuscode),@(_taskid)]]);}
B4IRDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
B4IRDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Log(\"ResponseError: \" & Reason & \", status code:";
[self->___c LogImpl:@"93604481" :[@[@"ResponseError: ",_reason,@", status code: ",[self.bi NumberToString:@(_statuscode)]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="CompleteJob(TaskId, False, Reason, Response)";
[self _completejob:_taskid :false :_reason :_response];
B4IRDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responsesuccess:(B4IHttpResponse*) _response :(int) _taskid{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"hc_responsesuccess"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"hc_responsesuccess::" :@[[B4I nilToNSNull:_response],@(_taskid)]]);}
B4IRDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
B4IRDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="CompleteJob(TaskId, True, \"\", Response)";
[self _completejob:_taskid :true :@"" :_response];
B4IRDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Private hc As HttpClient";
self->__hc = [B4IHttp new];
B4IRDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Private TaskIdToJob As Map";
self->__taskidtojob = [B4IMap new];
B4IRDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Public TempFolder As String";
self->__tempfolder = @"";
B4IRDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Private taskCounter As Int";
self->__taskcounter = 0;
B4IRDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _service_create{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"service_create"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"service_create" :nil]);}
B4IRDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub Service_Create";
B4IRDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="hc.Initialize(\"hc\")";
[self->__hc Initialize:self.bi :@"hc"];
B4IRDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="TaskIdToJob.Initialize";
[self->__taskidtojob Initialize];
B4IRDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _submitjob:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"submitjob"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"submitjob:" :@[[B4I nilToNSNull:_job]]]);}
B4IRDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
B4IRDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="If hc.IsInitialized = False Then Service_Create";
if ([self->__hc IsInitialized]==false) { 
[self _service_create];};
B4IRDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="taskCounter = taskCounter + 1";
self->__taskcounter = (int) (self->__taskcounter+1);
B4IRDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
[self->__taskidtojob Put:(NSObject*)(@(self->__taskcounter)) :(NSObject*)(_job)];
B4IRDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ([_job->__username /*NSString**/  isEqual:@""] == false && [_job->__password /*NSString**/  isEqual:@""] == false) { 
B4IRDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
[self->__hc ExecuteCredentials:[_job _getrequest /*B4IHttpRequest**/ :nil] :self->__taskcounter :_job->__username /*NSString**/  :_job->__password /*NSString**/ ];
 }else {
B4IRDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
[self->__hc Execute:[_job _getrequest /*B4IHttpRequest**/ :nil] :self->__taskcounter];
 };
B4IRDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="End Sub";
return @"";
}
@end