
#import "b4i_httputils2service.h"
#import "b4i_main.h"
#import "b4i_customlistview.h"
#import "b4i_httpjob.h"


@implementation b4i_httputils2service 


+ (instancetype)new {
    static b4i_httputils2service* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4I alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}

- (NSString*)  _completejob:(int) _taskid :(BOOL) _success :(NSString*) _errormessage :(B4IHttpResponse*) _res{
b4i_httpjob* _job = nil;
 //BA.debugLineNum = 95;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
 //BA.debugLineNum = 97;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4i_httpjob*)([self->__taskidtojob Get:(NSObject*)(@(_taskid))]);
 //BA.debugLineNum = 98;BA.debugLine="TaskIdToJob.Remove(TaskId)";
[self->__taskidtojob Remove:(NSObject*)(@(_taskid))];
 //BA.debugLineNum = 99;BA.debugLine="job.success = success";
_job->__success /*BOOL*/  = _success;
 //BA.debugLineNum = 100;BA.debugLine="job.errorMessage = errorMessage";
_job->__errormessage /*NSString**/  = _errormessage;
 //BA.debugLineNum = 104;BA.debugLine="job.Complete(res)";
[_job _complete /*NSString**/ :_res];
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responseerror:(B4IHttpResponse*) _response :(NSString*) _reason :(int) _statuscode :(int) _taskid{
 //BA.debugLineNum = 82;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
 //BA.debugLineNum = 83;BA.debugLine="Log(\"ResponseError: \" & Reason & \", status code:";
[self->___c LogImpl:@"94718593" :[@[@"ResponseError: ",_reason,@", status code: ",[self.bi NumberToString:@(_statuscode)]] componentsJoinedByString:@""] :0];
 //BA.debugLineNum = 84;BA.debugLine="CompleteJob(TaskId, False, Reason, Response)";
[self _completejob:_taskid :false :_reason :_response];
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responsesuccess:(B4IHttpResponse*) _response :(int) _taskid{
 //BA.debugLineNum = 87;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
 //BA.debugLineNum = 88;BA.debugLine="CompleteJob(TaskId, True, \"\", Response)";
[self _completejob:_taskid :true :@"" :_response];
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__dateutils=[b4i_dateutils new];
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private hc As HttpClient";
self->__hc = [B4IHttp new];
 //BA.debugLineNum = 8;BA.debugLine="Private TaskIdToJob As Map";
self->__taskidtojob = [B4IMap new];
 //BA.debugLineNum = 9;BA.debugLine="Public TempFolder As String";
self->__tempfolder = @"";
 //BA.debugLineNum = 10;BA.debugLine="Private taskCounter As Int";
self->__taskcounter = 0;
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _service_create{
 //BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
 //BA.debugLineNum = 28;BA.debugLine="hc.Initialize(\"hc\")";
[self->__hc Initialize:self.bi :@"hc"];
 //BA.debugLineNum = 29;BA.debugLine="TaskIdToJob.Initialize";
[self->__taskidtojob Initialize];
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _submitjob:(b4i_httpjob*) _job{
 //BA.debugLineNum = 42;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
 //BA.debugLineNum = 43;BA.debugLine="If hc.IsInitialized = False Then Service_Create";
if ([self->__hc IsInitialized]==false) { 
[self _service_create];};
 //BA.debugLineNum = 44;BA.debugLine="taskCounter = taskCounter + 1";
self->__taskcounter = (int) (self->__taskcounter+1);
 //BA.debugLineNum = 45;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
[self->__taskidtojob Put:(NSObject*)(@(self->__taskcounter)) :(NSObject*)(_job)];
 //BA.debugLineNum = 46;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ([_job->__username /*NSString**/  isEqual:@""] == false && [_job->__password /*NSString**/  isEqual:@""] == false) { 
 //BA.debugLineNum = 47;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
[self->__hc ExecuteCredentials:[_job _getrequest /*B4IHttpRequest**/ ] :self->__taskcounter :_job->__username /*NSString**/  :_job->__password /*NSString**/ ];
 }else {
 //BA.debugLineNum = 49;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
[self->__hc Execute:[_job _getrequest /*B4IHttpRequest**/ ] :self->__taskcounter];
 };
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return @"";
}
@end
