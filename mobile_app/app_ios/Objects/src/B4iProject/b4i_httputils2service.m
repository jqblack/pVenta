
#import "b4i_httputils2service.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_reporteordenes.h"
#import "b4i_httpjob.h"
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
    return 14;
}


- (NSString*)  _completejob:(int) _taskid :(BOOL) _success :(NSString*) _errormessage :(B4IHttpResponse*) _res{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"completejob"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"completejob::::" :@[@(_taskid),@(_success),[B4I nilToNSNull:_errormessage],[B4I nilToNSNull:_res]]]);}
b4i_httpjob* _job = nil;
B4IRDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
B4IRDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
_job = (b4i_httpjob*)([self->__taskidtojob Get:(NSObject*)(@(_taskid))]);
B4IRDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="TaskIdToJob.Remove(TaskId)";
[self->__taskidtojob Remove:(NSObject*)(@(_taskid))];
B4IRDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="job.success = success";
_job->__success /*BOOL*/  = _success;
B4IRDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="job.errorMessage = errorMessage";
_job->__errormessage /*NSString**/  = _errormessage;
B4IRDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="job.Complete(res)";
[_job _complete /*NSString**/ :nil :_res];
B4IRDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responseerror:(B4IHttpResponse*) _response :(NSString*) _reason :(int) _statuscode :(int) _taskid{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"hc_responseerror"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"hc_responseerror::::" :@[[B4I nilToNSNull:_response],[B4I nilToNSNull:_reason],@(_statuscode),@(_taskid)]]);}
B4IRDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
B4IRDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Log(\"ResponseError: \" & Reason & \", status code:";
[self->___c LogImpl:@"96422529" :[@[@"ResponseError: ",_reason,@", status code: ",[self.bi NumberToString:@(_statuscode)]] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="CompleteJob(TaskId, False, Reason, Response)";
[self _completejob:_taskid :false :_reason :_response];
B4IRDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _hc_responsesuccess:(B4IHttpResponse*) _response :(int) _taskid{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"hc_responsesuccess"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"hc_responsesuccess::" :@[[B4I nilToNSNull:_response],@(_taskid)]]);}
B4IRDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
B4IRDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="CompleteJob(TaskId, True, \"\", Response)";
[self _completejob:_taskid :true :@"" :_response];
B4IRDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Private hc As HttpClient";
self->__hc = [B4IHttp new];
B4IRDebugUtils.currentLine=6225926;
 //BA.debugLineNum = 6225926;BA.debugLine="Private TaskIdToJob As Map";
self->__taskidtojob = [B4IMap new];
B4IRDebugUtils.currentLine=6225927;
 //BA.debugLineNum = 6225927;BA.debugLine="Public TempFolder As String";
self->__tempfolder = @"";
B4IRDebugUtils.currentLine=6225928;
 //BA.debugLineNum = 6225928;BA.debugLine="Private taskCounter As Int";
self->__taskcounter = 0;
B4IRDebugUtils.currentLine=6225929;
 //BA.debugLineNum = 6225929;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _service_create{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"service_create"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"service_create" :nil]);}
B4IRDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub Service_Create";
B4IRDebugUtils.currentLine=6291471;
 //BA.debugLineNum = 6291471;BA.debugLine="hc.Initialize(\"hc\")";
[self->__hc Initialize:self.bi :@"hc"];
B4IRDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="TaskIdToJob.Initialize";
[self->__taskidtojob Initialize];
B4IRDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _submitjob:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"httputils2service";
if ([B4IDebug shouldDelegate: @"submitjob"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"submitjob:" :@[[B4I nilToNSNull:_job]]]);}
B4IRDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
B4IRDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="If hc.IsInitialized = False Then Service_Create";
if ([self->__hc IsInitialized]==false) { 
[self _service_create];};
B4IRDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="taskCounter = taskCounter + 1";
self->__taskcounter = (int) (self->__taskcounter+1);
B4IRDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
[self->__taskidtojob Put:(NSObject*)(@(self->__taskcounter)) :(NSObject*)(_job)];
B4IRDebugUtils.currentLine=6356996;
 //BA.debugLineNum = 6356996;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
if ([_job->__username /*NSString**/  isEqual:@""] == false && [_job->__password /*NSString**/  isEqual:@""] == false) { 
B4IRDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
[self->__hc ExecuteCredentials:[_job _getrequest /*B4IHttpRequest**/ :nil] :self->__taskcounter :_job->__username /*NSString**/  :_job->__password /*NSString**/ ];
 }else {
B4IRDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
[self->__hc Execute:[_job _getrequest /*B4IHttpRequest**/ :nil] :self->__taskcounter];
 };
B4IRDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="End Sub";
return @"";
}
@end