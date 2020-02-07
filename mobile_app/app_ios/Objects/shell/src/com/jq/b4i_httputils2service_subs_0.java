package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_httputils2service_subs_0 {


public static RemoteObject  _completejob(RemoteObject _taskid,RemoteObject _success,RemoteObject _errormessage,RemoteObject _res) throws Exception{
try {
		Debug.PushSubsStack("CompleteJob (httputils2service) ","httputils2service",6,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,95);
if (RapidSub.canDelegate("completejob")) { return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","completejob", _taskid, _success, _errormessage, _res);}
RemoteObject _job = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("TaskId", _taskid);
Debug.locals.put("success", _success);
Debug.locals.put("errorMessage", _errormessage);
Debug.locals.put("res", _res);
 BA.debugLineNum = 95;BA.debugLine="Sub CompleteJob(TaskId As Int, success As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Dim job As HttpJob = TaskIdToJob.Get(TaskId)";
Debug.JustUpdateDeviceLine();
_job = (b4i_httputils2service._taskidtojob.runMethod(false,"Get:",(Object)((_taskid))));Debug.locals.put("job", _job);Debug.locals.put("job", _job);
 BA.debugLineNum = 98;BA.debugLine="TaskIdToJob.Remove(TaskId)";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._taskidtojob.runVoidMethod ("Remove:",(Object)((_taskid)));
 BA.debugLineNum = 99;BA.debugLine="job.success = success";
Debug.JustUpdateDeviceLine();
_job.setField ("_success" /*RemoteObject*/ ,_success);
 BA.debugLineNum = 100;BA.debugLine="job.errorMessage = errorMessage";
Debug.JustUpdateDeviceLine();
_job.setField ("_errormessage" /*RemoteObject*/ ,_errormessage);
 BA.debugLineNum = 104;BA.debugLine="job.Complete(res)";
Debug.JustUpdateDeviceLine();
_job.runClassMethod (b4i_httpjob.class, "_complete:" /*RemoteObject*/ ,(Object)(_res));
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responseerror(RemoteObject _response,RemoteObject _reason,RemoteObject _statuscode,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseError (httputils2service) ","httputils2service",6,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,82);
if (RapidSub.canDelegate("hc_responseerror")) { return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responseerror", _response, _reason, _statuscode, _taskid);}
Debug.locals.put("Response", _response);
Debug.locals.put("Reason", _reason);
Debug.locals.put("StatusCode", _statuscode);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 82;BA.debugLine="Sub hc_ResponseError (Response As HttpResponse, Re";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Log(\"ResponseError: \" & Reason & \", status code:";
Debug.JustUpdateDeviceLine();
b4i_main.__c.runVoidMethod ("LogImpl:::","96422529",RemoteObject.concat(RemoteObject.createImmutable("ResponseError: "),_reason,RemoteObject.createImmutable(", status code: "),_statuscode),0);
 BA.debugLineNum = 84;BA.debugLine="CompleteJob(TaskId, False, Reason, Response)";
Debug.JustUpdateDeviceLine();
_completejob(_taskid,b4i_main.__c.runMethod(true,"False"),_reason,_response);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hc_responsesuccess(RemoteObject _response,RemoteObject _taskid) throws Exception{
try {
		Debug.PushSubsStack("hc_ResponseSuccess (httputils2service) ","httputils2service",6,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,87);
if (RapidSub.canDelegate("hc_responsesuccess")) { return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","hc_responsesuccess", _response, _taskid);}
Debug.locals.put("Response", _response);
Debug.locals.put("TaskId", _taskid);
 BA.debugLineNum = 87;BA.debugLine="Sub hc_ResponseSuccess (Response As HttpResponse,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="CompleteJob(TaskId, True, \"\", Response)";
Debug.JustUpdateDeviceLine();
_completejob(_taskid,b4i_main.__c.runMethod(true,"True"),BA.ObjectToString(""),_response);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 6;BA.debugLine="Private hc As HttpClient";
b4i_httputils2service._hc = RemoteObject.createNew ("B4IHttp");
 //BA.debugLineNum = 8;BA.debugLine="Private TaskIdToJob As Map";
b4i_httputils2service._taskidtojob = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 9;BA.debugLine="Public TempFolder As String";
b4i_httputils2service._tempfolder = RemoteObject.createImmutable("");
 //BA.debugLineNum = 10;BA.debugLine="Private taskCounter As Int";
b4i_httputils2service._taskcounter = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _service_create() throws Exception{
try {
		Debug.PushSubsStack("Service_Create (httputils2service) ","httputils2service",6,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,13);
if (RapidSub.canDelegate("service_create")) { return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","service_create");}
 BA.debugLineNum = 13;BA.debugLine="Sub Service_Create";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="hc.Initialize(\"hc\")";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._hc.runVoidMethod ("Initialize::",b4i_httputils2service.ba,(Object)(RemoteObject.createImmutable("hc")));
 BA.debugLineNum = 29;BA.debugLine="TaskIdToJob.Initialize";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._taskidtojob.runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _submitjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("SubmitJob (httputils2service) ","httputils2service",6,b4i_httputils2service.ba,b4i_httputils2service.mostCurrent,42);
if (RapidSub.canDelegate("submitjob")) { return b4i_httputils2service.remoteMe.runUserSub(false, "httputils2service","submitjob", _job);}
Debug.locals.put("job", _job);
 BA.debugLineNum = 42;BA.debugLine="Public Sub SubmitJob(job As HttpJob)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="If hc.IsInitialized = False Then Service_Create";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",b4i_httputils2service._hc.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
_service_create();};
 BA.debugLineNum = 44;BA.debugLine="taskCounter = taskCounter + 1";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._taskcounter = RemoteObject.solve(new RemoteObject[] {b4i_httputils2service._taskcounter,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 45;BA.debugLine="TaskIdToJob.Put(taskCounter, job)";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._taskidtojob.runVoidMethod ("Put::",(Object)((b4i_httputils2service._taskcounter)),(Object)((_job)));
 BA.debugLineNum = 46;BA.debugLine="If job.Username <> \"\" And job.Password <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_job.getField(true,"_username" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_job.getField(true,"_password" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 47;BA.debugLine="hc.ExecuteCredentials(job.GetRequest, taskCounte";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._hc.runVoidMethod ("ExecuteCredentials::::",(Object)(_job.runClassMethod (b4i_httpjob.class, "_getrequest" /*RemoteObject*/ )),(Object)(b4i_httputils2service._taskcounter),(Object)(_job.getField(true,"_username" /*RemoteObject*/ )),(Object)(_job.getField(true,"_password" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 49;BA.debugLine="hc.Execute(job.GetRequest, taskCounter)";
Debug.JustUpdateDeviceLine();
b4i_httputils2service._hc.runVoidMethod ("Execute::",(Object)(_job.runClassMethod (b4i_httpjob.class, "_getrequest" /*RemoteObject*/ )),(Object)(b4i_httputils2service._taskcounter));
 };
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}