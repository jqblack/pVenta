package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class direcciones_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,82);
if (RapidSub.canDelegate("activity_create")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","activity_create", _firsttime);}
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 82;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 84;BA.debugLine="Activity.LoadLayout(\"frmDirecciones\")";
Debug.ShouldStop(524288);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDirecciones")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 86;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight = 8";
Debug.ShouldStop(2097152);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").runMethod(true,"setItemHeight",direcciones.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 85))));
 BA.debugLineNum = 87;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextColo";
Debug.ShouldStop(4194304);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(true,"setTextColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 88;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typeface";
Debug.ShouldStop(8388608);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"Label").runMethod(false,"setTypeface",direcciones.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 90;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Te";
Debug.ShouldStop(33554432);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setTextColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 91;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Ty";
Debug.ShouldStop(67108864);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(false,"setTypeface",direcciones.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 92;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.He";
Debug.ShouldStop(134217728);
direcciones.mostCurrent._listviewdirecciones.runMethod(false,"getTwoLinesLayout").getField(false,"SecondLabel").runMethod(true,"setHeight",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),direcciones.mostCurrent.activityBA));
 BA.debugLineNum = 93;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.Gra";
Debug.ShouldStop(268435456);
direcciones.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._listviewdirecciones),(Object)(direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray")),(Object)(direcciones.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 103;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(64);
if (direcciones.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 104;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(128);
_cargardirecciones();
 }else {
 BA.debugLineNum = 108;BA.debugLine="Dim r As Int";
Debug.ShouldStop(2048);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
 BA.debugLineNum = 110;BA.debugLine="r = Msgbox2(\"Para ver sus direcciones debe de in";
Debug.ShouldStop(8192);
_r = direcciones.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para ver sus direcciones debe de iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar Sesión?")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Más tarde")),(Object)((direcciones.mostCurrent.__c.getField(false,"Null"))),direcciones.mostCurrent.activityBA);Debug.locals.put("r", _r);
 BA.debugLineNum = 112;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, direcciones.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 113;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(65536);
direcciones.mostCurrent._main._mostar /*RemoteObject*/  = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 114;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(131072);
direcciones.mostCurrent.__c.runVoidMethod ("StartActivity",direcciones.processBA,(Object)((direcciones.mostCurrent._main.getObject())));
 }else {
 BA.debugLineNum = 117;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(1048576);
direcciones.mostCurrent.__c.runVoidMethod ("StartActivity",direcciones.processBA,(Object)((direcciones.mostCurrent._principal.getObject())));
 };
 };
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_keypress(RemoteObject _keycode) throws Exception{
try {
		Debug.PushSubsStack("Activity_KeyPress (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,826);
if (RapidSub.canDelegate("activity_keypress")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","activity_keypress", _keycode);}
Debug.locals.put("KeyCode", _keycode);
 BA.debugLineNum = 826;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 827;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",_keycode,BA.numberCast(double.class, direcciones.mostCurrent.__c.getField(false,"KeyCodes").getField(true,"KEYCODE_BACK")))) { 
 BA.debugLineNum = 829;BA.debugLine="If Principal.isUsa Then";
Debug.ShouldStop(268435456);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 830;BA.debugLine="txtCity.RequestFocus";
Debug.ShouldStop(536870912);
direcciones.mostCurrent._txtcity.runVoidMethod ("RequestFocus");
 }else {
 BA.debugLineNum = 832;BA.debugLine="txtSector.RequestFocus";
Debug.ShouldStop(-2147483648);
direcciones.mostCurrent._txtsector.runVoidMethod ("RequestFocus");
 };
 BA.debugLineNum = 835;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return direcciones.mostCurrent.__c.getField(true,"True");
 };
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,312);
if (RapidSub.canDelegate("activity_pause")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 312;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_resume() throws Exception{
try {
		Debug.PushSubsStack("Activity_Resume (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,303);
if (RapidSub.canDelegate("activity_resume")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","activity_resume");}
 BA.debugLineNum = 303;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(16384);
 BA.debugLineNum = 305;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(65536);
if (direcciones.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 306;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(131072);
_cargardirecciones();
 };
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _actualizardirecciones() throws Exception{
try {
		Debug.PushSubsStack("actualizarDirecciones (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,643);
if (RapidSub.canDelegate("actualizardirecciones")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","actualizardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 643;BA.debugLine="Sub actualizarDirecciones";
Debug.ShouldStop(4);
 BA.debugLineNum = 645;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(16);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 646;BA.debugLine="ProgressDialogShow(\"We're reloading your address";
Debug.ShouldStop(32);
direcciones.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("We're reloading your addresses"))));
 }else {
 BA.debugLineNum = 648;BA.debugLine="ProgressDialogShow(\"Actualizando sus direcciónes";
Debug.ShouldStop(128);
direcciones.mostCurrent.__c.runVoidMethod ("ProgressDialogShow",direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Actualizando sus direcciónes"))));
 };
 BA.debugLineNum = 651;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(1024);
_jobdirecciones = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 652;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(2048);
_jobdirecciones.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 653;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(4096);
_jobdirecciones.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 654;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddireccion_click() throws Exception{
try {
		Debug.PushSubsStack("AddDireccion_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,710);
if (RapidSub.canDelegate("adddireccion_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","adddireccion_click");}
 BA.debugLineNum = 710;BA.debugLine="Sub AddDireccion_Click";
Debug.ShouldStop(32);
 BA.debugLineNum = 712;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(128);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 714;BA.debugLine="If PanelFondoDireccionesUSA.IsInitialized == Fal";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._panelfondodireccionesusa.runMethod(true,"IsInitialized"),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 715;BA.debugLine="Activity.LoadLayout(\"frmDireccionesUsa\")";
Debug.ShouldStop(1024);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDireccionesUsa")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 716;BA.debugLine="PanelFondoDireccionesUSA.Visible = False";
Debug.ShouldStop(2048);
direcciones.mostCurrent._panelfondodireccionesusa.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 720;BA.debugLine="PanelFondoDireccionesUSA.SetVisibleAnimated(200,";
Debug.ShouldStop(32768);
direcciones.mostCurrent._panelfondodireccionesusa.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(direcciones.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 721;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
Debug.ShouldStop(65536);
direcciones.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent.__c.getField(true,"True")),(Object)(direcciones.mostCurrent._paneldireccion));
 BA.debugLineNum = 723;BA.debugLine="btnState.DropdownBackgroundColor = Colors.White";
Debug.ShouldStop(262144);
direcciones.mostCurrent._btnstate.runMethod(true,"setDropdownBackgroundColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 724;BA.debugLine="btnState.DropdownTextColor = Colors.Black";
Debug.ShouldStop(524288);
direcciones.mostCurrent._btnstate.runMethod(true,"setDropdownTextColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 726;BA.debugLine="btnState.AddAll(estados)";
Debug.ShouldStop(2097152);
direcciones.mostCurrent._btnstate.runVoidMethod ("AddAll",(Object)(direcciones.mostCurrent._estados));
 BA.debugLineNum = 729;BA.debugLine="If edition Then";
Debug.ShouldStop(16777216);
if (direcciones._edition.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 730;BA.debugLine="btnDeleteUsa.Visible = True";
Debug.ShouldStop(33554432);
direcciones.mostCurrent._btndeleteusa.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 732;BA.debugLine="btnDeleteUsa.Visible = False";
Debug.ShouldStop(134217728);
direcciones.mostCurrent._btndeleteusa.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 734;BA.debugLine="actu = False";
Debug.ShouldStop(536870912);
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 738;BA.debugLine="If PanelFondoDireccionesRD.IsInitialized == Fals";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._panelfondodireccionesrd.runMethod(true,"IsInitialized"),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 739;BA.debugLine="Activity.LoadLayout(\"frmDireccionesRD\")";
Debug.ShouldStop(4);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDireccionesRD")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 740;BA.debugLine="PanelFondoDireccionesRD.Visible = False";
Debug.ShouldStop(8);
direcciones.mostCurrent._panelfondodireccionesrd.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 743;BA.debugLine="PanelFondoDireccionesRD.SetVisibleAnimated(200,T";
Debug.ShouldStop(64);
direcciones.mostCurrent._panelfondodireccionesrd.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(direcciones.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 744;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
Debug.ShouldStop(128);
direcciones.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent.__c.getField(true,"True")),(Object)(direcciones.mostCurrent._paneldireccion));
 BA.debugLineNum = 746;BA.debugLine="btnProvinciaCombo.DropdownBackgroundColor = Colo";
Debug.ShouldStop(512);
direcciones.mostCurrent._btnprovinciacombo.runMethod(true,"setDropdownBackgroundColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 747;BA.debugLine="btnProvinciaCombo.DropdownTextColor = Colors.Bla";
Debug.ShouldStop(1024);
direcciones.mostCurrent._btnprovinciacombo.runMethod(true,"setDropdownTextColor",direcciones.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 749;BA.debugLine="btnProvinciaCombo.AddAll(estados)";
Debug.ShouldStop(4096);
direcciones.mostCurrent._btnprovinciacombo.runVoidMethod ("AddAll",(Object)(direcciones.mostCurrent._estados));
 BA.debugLineNum = 752;BA.debugLine="If edition Then";
Debug.ShouldStop(32768);
if (direcciones._edition.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 753;BA.debugLine="btnDeleteRD.Visible = True";
Debug.ShouldStop(65536);
direcciones.mostCurrent._btndeleterd.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 }else {
 BA.debugLineNum = 755;BA.debugLine="btnDeleteRD.Visible = False";
Debug.ShouldStop(262144);
direcciones.mostCurrent._btndeleterd.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 757;BA.debugLine="actu = False";
Debug.ShouldStop(1048576);
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"False");
 };
 BA.debugLineNum = 761;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaceptarnombredir_click() throws Exception{
try {
		Debug.PushSubsStack("btnAceptarNombreDir_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,461);
if (RapidSub.canDelegate("btnaceptarnombredir_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnaceptarnombredir_click");}
 BA.debugLineNum = 461;BA.debugLine="Sub btnAceptarNombreDir_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 463;BA.debugLine="PanelFondoNombreDir.SetVisibleAnimated(200,False)";
Debug.ShouldStop(16384);
direcciones.mostCurrent._panelfondonombredir.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(direcciones.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 464;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(32768);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 466;BA.debugLine="ingresarDirUSA";
Debug.ShouldStop(131072);
_ingresardirusa();
 }else {
 BA.debugLineNum = 469;BA.debugLine="ingresarDirRD";
Debug.ShouldStop(1048576);
_ingresardirrd();
 };
 BA.debugLineNum = 472;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagregardireccionfinal_click() throws Exception{
try {
		Debug.PushSubsStack("BtnAgregarDireccionFinal_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,681);
if (RapidSub.canDelegate("btnagregardireccionfinal_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnagregardireccionfinal_click");}
 BA.debugLineNum = 681;BA.debugLine="Sub BtnAgregarDireccionFinal_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 683;BA.debugLine="NombreDireccion";
Debug.ShouldStop(1024);
_nombredireccion();
 BA.debugLineNum = 685;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagregardirrd_click() throws Exception{
try {
		Debug.PushSubsStack("btnAgregarDirRD_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,615);
if (RapidSub.canDelegate("btnagregardirrd_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnagregardirrd_click");}
 BA.debugLineNum = 615;BA.debugLine="Sub btnAgregarDirRD_Click";
Debug.ShouldStop(64);
 BA.debugLineNum = 617;BA.debugLine="NombreDireccion";
Debug.ShouldStop(256);
_nombredireccion();
 BA.debugLineNum = 619;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnbackrd_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackRd_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,591);
if (RapidSub.canDelegate("btnbackrd_click")) { com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnbackrd_click"); return;}
ResumableSub_btnBackRd_Click rsub = new ResumableSub_btnBackRd_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBackRd_Click extends BA.ResumableSub {
public ResumableSub_btnBackRd_Click(com.jq.pedidos.direcciones parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.direcciones parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBackRd_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,591);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 593;BA.debugLine="PanelFondoDireccionesRD.SetVisibleAnimated(250,Fa";
Debug.ShouldStop(65536);
parent.mostCurrent._panelfondodireccionesrd.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 594;BA.debugLine="funcion.DisableView(False,PanelDireccion)";
Debug.ShouldStop(131072);
parent.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._paneldireccion));
 BA.debugLineNum = 595;BA.debugLine="PanelDireccion.SetVisibleAnimated(200,True)";
Debug.ShouldStop(262144);
parent.mostCurrent._paneldireccion.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 597;BA.debugLine="If reload Then";
Debug.ShouldStop(1048576);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._reload.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 598;BA.debugLine="actualizarDirecciones";
Debug.ShouldStop(2097152);
_actualizardirecciones();
 BA.debugLineNum = 599;BA.debugLine="reload = False";
Debug.ShouldStop(4194304);
parent._reload = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 602;BA.debugLine="Sleep(200)";
Debug.ShouldStop(33554432);
parent.mostCurrent.__c.runVoidMethod ("Sleep",direcciones.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "direcciones", "btnbackrd_click"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 604;BA.debugLine="txtDireRD.Text = \"\"";
Debug.ShouldStop(134217728);
parent.mostCurrent._txtdirerd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 605;BA.debugLine="txtSector.Text = \"\"";
Debug.ShouldStop(268435456);
parent.mostCurrent._txtsector.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 606;BA.debugLine="btnProvinciaCombo.SelectedIndex = -1";
Debug.ShouldStop(536870912);
parent.mostCurrent._btnprovinciacombo.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 607;BA.debugLine="txtZipCodeRD.Text = \"\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._txtzipcoderd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 608;BA.debugLine="chPrincipalRD.Checked = False";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._chprincipalrd.runMethodAndSync(true,"setChecked",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 610;BA.debugLine="edition = False";
Debug.ShouldStop(2);
parent._edition = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 611;BA.debugLine="actu = False";
Debug.ShouldStop(4);
parent._actu = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 613;BA.debugLine="End Sub";
Debug.ShouldStop(16);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static void  _btnbackusa_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackUsa_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,656);
if (RapidSub.canDelegate("btnbackusa_click")) { com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnbackusa_click"); return;}
ResumableSub_btnBackUsa_Click rsub = new ResumableSub_btnBackUsa_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnBackUsa_Click extends BA.ResumableSub {
public ResumableSub_btnBackUsa_Click(com.jq.pedidos.direcciones parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.direcciones parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBackUsa_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,656);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 658;BA.debugLine="funcion.DisableView(False,PanelDireccion)";
Debug.ShouldStop(131072);
parent.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(parent.mostCurrent.__c.getField(true,"False")),(Object)(parent.mostCurrent._paneldireccion));
 BA.debugLineNum = 659;BA.debugLine="PanelFondoDireccionesUSA.SetVisibleAnimated(200,F";
Debug.ShouldStop(262144);
parent.mostCurrent._panelfondodireccionesusa.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(parent.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 660;BA.debugLine="PanelDireccion.SetVisibleAnimated(200,True)";
Debug.ShouldStop(524288);
parent.mostCurrent._paneldireccion.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 200)),(Object)(parent.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 662;BA.debugLine="If reload Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._reload.<Boolean>get().booleanValue()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 663;BA.debugLine="actualizarDirecciones";
Debug.ShouldStop(4194304);
_actualizardirecciones();
 BA.debugLineNum = 664;BA.debugLine="reload = False";
Debug.ShouldStop(8388608);
parent._reload = parent.mostCurrent.__c.getField(true,"False");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 667;BA.debugLine="Sleep(200)";
Debug.ShouldStop(67108864);
parent.mostCurrent.__c.runVoidMethod ("Sleep",direcciones.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "direcciones", "btnbackusa_click"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 669;BA.debugLine="txtAddress1.Text = \"\"";
Debug.ShouldStop(268435456);
parent.mostCurrent._txtaddress1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 670;BA.debugLine="txtAddress2.Text = \"\"";
Debug.ShouldStop(536870912);
parent.mostCurrent._txtaddress2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 671;BA.debugLine="txtCity.Text = \"\"";
Debug.ShouldStop(1073741824);
parent.mostCurrent._txtcity.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 672;BA.debugLine="btnState.SelectedIndex = -1";
Debug.ShouldStop(-2147483648);
parent.mostCurrent._btnstate.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 673;BA.debugLine="txtZipCode.Text = \"\"";
Debug.ShouldStop(1);
parent.mostCurrent._txtzipcode.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 674;BA.debugLine="chPrincipal.Checked = False";
Debug.ShouldStop(2);
parent.mostCurrent._chprincipal.runMethodAndSync(true,"setChecked",parent.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 676;BA.debugLine="edition = False";
Debug.ShouldStop(8);
parent._edition = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 677;BA.debugLine="actu = False";
Debug.ShouldStop(16);
parent._actu = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.ShouldStop(64);
if (true) break;

            }
        }
    }
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}
public static RemoteObject  _btndeleterd_click() throws Exception{
try {
		Debug.PushSubsStack("btnDeleteRD_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,571);
if (RapidSub.canDelegate("btndeleterd_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btndeleterd_click");}
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdeletedir = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 571;BA.debugLine="Sub btnDeleteRD_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 573;BA.debugLine="Dim res As Int";
Debug.ShouldStop(268435456);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 574;BA.debugLine="res = Msgbox2(\"Desea borrar esta dirección\",\"Avis";
Debug.ShouldStop(536870912);
_res = direcciones.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Desea borrar esta dirección")),(Object)(BA.ObjectToCharSequence("Aviso!")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((direcciones.mostCurrent.__c.getField(false,"Null"))),direcciones.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 576;BA.debugLine="If res == DialogResponse.POSITIVE Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, direcciones.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 578;BA.debugLine="Dim json As String";
Debug.ShouldStop(2);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 579;BA.debugLine="json = \"'f_idrecord':\"&mapaEdit.Get(\"f_idrecord\"";
Debug.ShouldStop(4);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 581;BA.debugLine="Dim JobDeleteDir As HttpJob";
Debug.ShouldStop(16);
_jobdeletedir = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDeleteDir", _jobdeletedir);
 BA.debugLineNum = 582;BA.debugLine="JobDeleteDir.Initialize(\"JobDeleteDir\",Me)";
Debug.ShouldStop(32);
_jobdeletedir.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobDeleteDir")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 583;BA.debugLine="JobDeleteDir.PostString(Main.url&\"ws/borrar_dire";
Debug.ShouldStop(64);
_jobdeletedir.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/borrar_direccion"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 586;BA.debugLine="Return";
Debug.ShouldStop(512);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndeleteusa_click() throws Exception{
try {
		Debug.PushSubsStack("btnDeleteUsa_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,621);
if (RapidSub.canDelegate("btndeleteusa_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btndeleteusa_click");}
RemoteObject _res = RemoteObject.createImmutable(0);
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdeletedir = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 621;BA.debugLine="Sub btnDeleteUsa_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 623;BA.debugLine="Dim res As Int";
Debug.ShouldStop(16384);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 624;BA.debugLine="res = Msgbox2(\"Do you want to delete this address";
Debug.ShouldStop(32768);
_res = direcciones.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Do you want to delete this address?")),(Object)(BA.ObjectToCharSequence("Warning!")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((direcciones.mostCurrent.__c.getField(false,"Null"))),direcciones.mostCurrent.activityBA);Debug.locals.put("res", _res);
 BA.debugLineNum = 626;BA.debugLine="If res == DialogResponse.POSITIVE Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, direcciones.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 628;BA.debugLine="Dim json As String";
Debug.ShouldStop(524288);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 629;BA.debugLine="json = \"'f_idrecord':\"&mapaEdit.Get(\"f_idrecord\"";
Debug.ShouldStop(1048576);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 631;BA.debugLine="Dim JobDeleteDir As HttpJob";
Debug.ShouldStop(4194304);
_jobdeletedir = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDeleteDir", _jobdeletedir);
 BA.debugLineNum = 632;BA.debugLine="JobDeleteDir.Initialize(\"JobDeleteDir\",Me)";
Debug.ShouldStop(8388608);
_jobdeletedir.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobDeleteDir")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 633;BA.debugLine="JobDeleteDir.PostString(Main.url&\"ws/borrar_dire";
Debug.ShouldStop(16777216);
_jobdeletedir.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/borrar_direccion"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 637;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 641;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndireccionback_click() throws Exception{
try {
		Debug.PushSubsStack("btnDireccionBack_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,452);
if (RapidSub.canDelegate("btndireccionback_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btndireccionback_click");}
 BA.debugLineNum = 452;BA.debugLine="Sub btnDireccionBack_Click";
Debug.ShouldStop(8);
 BA.debugLineNum = 453;BA.debugLine="Activity.Finish";
Debug.ShouldStop(16);
direcciones.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 454;BA.debugLine="Principal.keyotraparte = False";
Debug.ShouldStop(32);
direcciones.mostCurrent._principal._keyotraparte /*RemoteObject*/  = direcciones.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 455;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(64);
direcciones.mostCurrent.__c.runVoidMethod ("StartActivity",direcciones.processBA,(Object)((direcciones.mostCurrent._principal.getObject())));
 BA.debugLineNum = 456;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnnuevadireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnNuevaDireccion_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,445);
if (RapidSub.canDelegate("btnnuevadireccion_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnnuevadireccion_click");}
 BA.debugLineNum = 445;BA.debugLine="Sub btnNuevaDireccion_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 446;BA.debugLine="txtDireccion.Text =\"\"";
Debug.ShouldStop(536870912);
direcciones.mostCurrent._txtdireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 447;BA.debugLine="txtDireccion.Tag = 0";
Debug.ShouldStop(1073741824);
direcciones.mostCurrent._txtdireccion.runMethod(false,"setTag",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 448;BA.debugLine="chPrincipal.Checked = False";
Debug.ShouldStop(-2147483648);
direcciones.mostCurrent._chprincipal.runMethodAndSync(true,"setChecked",direcciones.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 449;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(1);
_cargardirecciones();
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprovinciacombo_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("btnProvinciaCombo_ItemClick (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,565);
if (RapidSub.canDelegate("btnprovinciacombo_itemclick")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnprovinciacombo_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 565;BA.debugLine="Sub btnProvinciaCombo_ItemClick (Position As Int,";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 567;BA.debugLine="indexCombo = Position";
Debug.ShouldStop(4194304);
direcciones._indexcombo = _position;
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnsalvardireccion_click() throws Exception{
try {
		Debug.PushSubsStack("btnSalvarDireccion_Click (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,418);
if (RapidSub.canDelegate("btnsalvardireccion_click")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnsalvardireccion_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 418;BA.debugLine="Sub btnSalvarDireccion_Click";
Debug.ShouldStop(2);
 BA.debugLineNum = 419;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim").runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 420;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
Debug.ShouldStop(8);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Introduzca la dirección")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 421;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(16);
direcciones.mostCurrent._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 422;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 425;BA.debugLine="If actualizar Then";
Debug.ShouldStop(256);
if (direcciones._actualizar.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 427;BA.debugLine="Dim json As String";
Debug.ShouldStop(1024);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 428;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
Debug.ShouldStop(2048);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipal.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_idrecord':"),direcciones.mostCurrent._txtdireccion.runMethod(false,"getTag"),RemoteObject.createImmutable(",'f_credito_fiscal':false,'f_iddireccion':"),direcciones._mapadir.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 429;BA.debugLine="actualizar = False";
Debug.ShouldStop(4096);
direcciones._actualizar = direcciones.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 433;BA.debugLine="Dim json As String";
Debug.ShouldStop(65536);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 434;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
Debug.ShouldStop(131072);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipal.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtdireccion.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_idrecord':"),direcciones.mostCurrent._txtdireccion.runMethod(false,"getTag"),RemoteObject.createImmutable(",'f_credito_fiscal':false"));Debug.locals.put("json", _json);
 };
 BA.debugLineNum = 439;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(4194304);
_jobsalvar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 440;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(8388608);
_jobsalvar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobSalvar")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 441;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(16777216);
_jobsalvar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnstate_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("btnState_ItemClick (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,515);
if (RapidSub.canDelegate("btnstate_itemclick")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","btnstate_itemclick", _position, _value);}
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 515;BA.debugLine="Sub btnState_ItemClick (Position As Int, Value As";
Debug.ShouldStop(4);
 BA.debugLineNum = 517;BA.debugLine="indexCombo = Position";
Debug.ShouldStop(16);
direcciones._indexcombo = _position;
 BA.debugLineNum = 519;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buscarestados() throws Exception{
try {
		Debug.PushSubsStack("BuscarEstados (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,316);
if (RapidSub.canDelegate("buscarestados")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","buscarestados");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobestados = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 316;BA.debugLine="Sub BuscarEstados";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 318;BA.debugLine="Dim json As String = \"'f_usa': true\"";
Debug.ShouldStop(536870912);
_json = BA.ObjectToString("'f_usa': true");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 320;BA.debugLine="Dim JobEstados As HttpJob";
Debug.ShouldStop(-2147483648);
_jobestados = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobEstados", _jobestados);
 BA.debugLineNum = 321;BA.debugLine="JobEstados.Initialize(\"JobEstados\",Me)";
Debug.ShouldStop(1);
_jobestados.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobEstados")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 322;BA.debugLine="JobEstados.PostString(Main.url&\"ws/Buscar_lista_e";
Debug.ShouldStop(2);
_jobestados.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/Buscar_lista_estados"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buscarprovincias() throws Exception{
try {
		Debug.PushSubsStack("BuscarProvincias (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,326);
if (RapidSub.canDelegate("buscarprovincias")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","buscarprovincias");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobprovincia = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 326;BA.debugLine="Sub BuscarProvincias";
Debug.ShouldStop(32);
 BA.debugLineNum = 328;BA.debugLine="Dim json As String = \"'f_usa': false\"";
Debug.ShouldStop(128);
_json = BA.ObjectToString("'f_usa': false");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 330;BA.debugLine="Dim JobProvincia As HttpJob";
Debug.ShouldStop(512);
_jobprovincia = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobProvincia", _jobprovincia);
 BA.debugLineNum = 331;BA.debugLine="JobProvincia.Initialize(\"JobEstados\",Me)";
Debug.ShouldStop(1024);
_jobprovincia.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobEstados")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 332;BA.debugLine="JobProvincia.PostString(Main.url&\"ws/Buscar_lista";
Debug.ShouldStop(2048);
_jobprovincia.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/Buscar_lista_estados"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 334;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargardirecciones() throws Exception{
try {
		Debug.PushSubsStack("cargarDirecciones (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,149);
if (RapidSub.canDelegate("cargardirecciones")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 149;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 150;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(2097152);
_jobdirecciones = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 151;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(4194304);
_jobdirecciones.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 152;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(8388608);
_jobdirecciones.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _globals() throws Exception{
 //BA.debugLineNum = 13;BA.debugLine="Sub Globals";
 //BA.debugLineNum = 17;BA.debugLine="Private btnDireccionBack As Button";
direcciones.mostCurrent._btndireccionback = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private btnNuevaDireccion As Button";
direcciones.mostCurrent._btnnuevadireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private btnSalvarDireccion As Button";
direcciones.mostCurrent._btnsalvardireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private ListViewDirecciones As ListView";
direcciones.mostCurrent._listviewdirecciones = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelDireccion As Panel";
direcciones.mostCurrent._paneldireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private txtDireccion As EditText";
direcciones.mostCurrent._txtdireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private chPrincipal As CheckBox";
direcciones.mostCurrent._chprincipal = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private btnAceptarNombreDir As Button";
direcciones.mostCurrent._btnaceptarnombredir = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private Label16 As Label";
direcciones.mostCurrent._label16 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private txtNombreDireccion As EditText";
direcciones.mostCurrent._txtnombredireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private btnAgregarDirRD As Button";
direcciones.mostCurrent._btnagregardirrd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private btnBackRd As Button";
direcciones.mostCurrent._btnbackrd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnDeleteRD As Button";
direcciones.mostCurrent._btndeleterd = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnProvinciaCombo As Spinner";
direcciones.mostCurrent._btnprovinciacombo = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private chPrincipalRD As CheckBox";
direcciones.mostCurrent._chprincipalrd = RemoteObject.createNew ("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private txtDireRD As EditText";
direcciones.mostCurrent._txtdirerd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private txtSector As EditText";
direcciones.mostCurrent._txtsector = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private txtZipCodeRD As EditText";
direcciones.mostCurrent._txtzipcoderd = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private BtnAgregarDireccionFinal As Button";
direcciones.mostCurrent._btnagregardireccionfinal = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private btnBackUsa As Button";
direcciones.mostCurrent._btnbackusa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private btnDeleteUsa As Button";
direcciones.mostCurrent._btndeleteusa = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private btnState As Spinner";
direcciones.mostCurrent._btnstate = RemoteObject.createNew ("anywheresoftware.b4a.objects.SpinnerWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private txtAddress1 As EditText";
direcciones.mostCurrent._txtaddress1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private txtAddress2 As EditText";
direcciones.mostCurrent._txtaddress2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private txtCity As EditText";
direcciones.mostCurrent._txtcity = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private txtZipCode As EditText";
direcciones.mostCurrent._txtzipcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.EditTextWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private PanelFondoDireccionesUSA As Panel";
direcciones.mostCurrent._panelfondodireccionesusa = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private PanelFondoNombreDir As Panel";
direcciones.mostCurrent._panelfondonombredir = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Dim actu As Boolean = False";
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 47;BA.debugLine="Dim mapaEdit As Map";
direcciones.mostCurrent._mapaedit = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 48;BA.debugLine="Dim edition As Boolean = False";
direcciones._edition = direcciones.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 49;BA.debugLine="Dim update As Int = 0";
direcciones._update = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 50;BA.debugLine="Dim reload As Boolean = False";
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 51;BA.debugLine="Dim estados As List";
direcciones.mostCurrent._estados = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 52;BA.debugLine="Dim indexCombo As Int";
direcciones._indexcombo = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 53;BA.debugLine="Dim IME As IME";
direcciones.mostCurrent._ime = RemoteObject.createNew ("anywheresoftware.b4a.objects.IME");
 //BA.debugLineNum = 55;BA.debugLine="Private PanelFondoDireccionesRD As Panel";
direcciones.mostCurrent._panelfondodireccionesrd = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private AddDireccion As Button";
direcciones.mostCurrent._adddireccion = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private PanelComboUSA As Panel";
direcciones.mostCurrent._panelcombousa = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private Label3 As Label";
direcciones.mostCurrent._label3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private Panel1 As Panel";
direcciones.mostCurrent._panel1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private Label5 As Label";
direcciones.mostCurrent._label5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private Panel2 As Panel";
direcciones.mostCurrent._panel2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private Label6 As Label";
direcciones.mostCurrent._label6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private Panel3 As Panel";
direcciones.mostCurrent._panel3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private Label7 As Label";
direcciones.mostCurrent._label7 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 65;BA.debugLine="Private panelZipCode As Panel";
direcciones.mostCurrent._panelzipcode = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Dim tlbl6 As Int";
direcciones._tlbl6 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 70;BA.debugLine="Dim tpanel3 As Int";
direcciones._tpanel3 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 71;BA.debugLine="Dim tlbl7 As Int";
direcciones._tlbl7 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 72;BA.debugLine="Dim tpanelcomboUsa As Int";
direcciones._tpanelcombousa = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 73;BA.debugLine="Dim tlbl8 As Int";
direcciones._tlbl8 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 74;BA.debugLine="Dim tpanelZip As Int";
direcciones._tpanelzip = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 75;BA.debugLine="dim tpanelMarco as int";
direcciones._tpanelmarco = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 77;BA.debugLine="Private Label8 As Label";
direcciones.mostCurrent._label8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private PanelMarcoDirRD As Panel";
direcciones.mostCurrent._panelmarcodirrd = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private PanelMarcoNombredir As Panel";
direcciones.mostCurrent._panelmarconombredir = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _ingresardirrd() throws Exception{
try {
		Debug.PushSubsStack("ingresarDirRD (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,522);
if (RapidSub.canDelegate("ingresardirrd")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","ingresardirrd");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 522;BA.debugLine="Sub ingresarDirRD";
Debug.ShouldStop(512);
 BA.debugLineNum = 524;BA.debugLine="If txtDireRD.Text == \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtdirerd.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 525;BA.debugLine="Msgbox(\"La dirección no puede estar vacia!!\",\"Er";
Debug.ShouldStop(4096);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La dirección no puede estar vacia!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 526;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 529;BA.debugLine="If txtSector.Text == \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtsector.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 530;BA.debugLine="Msgbox(\"El sector no puede estar vacio!!\",\"Error";
Debug.ShouldStop(131072);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("El sector no puede estar vacio!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 531;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 534;BA.debugLine="If txtZipCodeRD.Text == \"\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtzipcoderd.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 535;BA.debugLine="Msgbox(\"El Zip Code no puede estar vacio!!\",\"Err";
Debug.ShouldStop(4194304);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("El Zip Code no puede estar vacio!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 536;BA.debugLine="Return";
Debug.ShouldStop(8388608);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 539;BA.debugLine="If actu Then";
Debug.ShouldStop(67108864);
if (direcciones._actu.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 541;BA.debugLine="Dim json As String";
Debug.ShouldStop(268435456);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 542;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Checked&\",";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipalrd.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion1':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtdirerd.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_direccion2':''"),RemoteObject.createImmutable(",'f_idrecord':"),direcciones._update,RemoteObject.createImmutable(",'f_iddireccion':"),direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_usa':"),direcciones.mostCurrent._principal._isusa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_sector_city':'"),direcciones.mostCurrent._txtsector.runMethod(true,"getText"),RemoteObject.createImmutable("','f_zipcode':"),direcciones.mostCurrent._txtzipcoderd.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(",'f_nombre_direccion':'"),direcciones.mostCurrent._txtnombredireccion.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 545;BA.debugLine="actu = False";
Debug.ShouldStop(1);
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 549;BA.debugLine="Dim json As String";
Debug.ShouldStop(16);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 550;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Checked&\",";
Debug.ShouldStop(32);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipalrd.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion1':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtdirerd.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_direccion2':'','f_idrecord':"),direcciones._update,RemoteObject.createImmutable(",'f_usa':"),direcciones.mostCurrent._principal._isusa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_sector_city':'"),direcciones.mostCurrent._txtsector.runMethod(true,"getText"),RemoteObject.createImmutable("','f_zipcode':"),direcciones.mostCurrent._txtzipcoderd.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(",'f_nombre_direccion':'"),direcciones.mostCurrent._txtnombredireccion.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 };
 BA.debugLineNum = 555;BA.debugLine="reload = True";
Debug.ShouldStop(1024);
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 556;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(2048);
_jobsalvar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 557;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(4096);
_jobsalvar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobSalvar")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 558;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(8192);
_jobsalvar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 560;BA.debugLine="update = 0";
Debug.ShouldStop(32768);
direcciones._update = BA.numberCast(int.class, 0);
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ingresardirusa() throws Exception{
try {
		Debug.PushSubsStack("ingresarDirUSA (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,474);
if (RapidSub.canDelegate("ingresardirusa")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","ingresardirusa");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 474;BA.debugLine="Sub ingresarDirUSA";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 476;BA.debugLine="If txtAddress1.Text == \"\" Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtaddress1.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 477;BA.debugLine="Msgbox(\"The Addres 1 can't be empty!!\",\"Error\")";
Debug.ShouldStop(268435456);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("The Addres 1 can't be empty!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 478;BA.debugLine="Return";
Debug.ShouldStop(536870912);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 481;BA.debugLine="If txtCity.Text == \"\" Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtcity.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 482;BA.debugLine="Msgbox(\"The City can't be empty!!\",\"Error\")";
Debug.ShouldStop(2);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("The City can't be empty!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 483;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 486;BA.debugLine="If txtZipCode.Text == \"\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._txtzipcode.runMethod(true,"getText"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 487;BA.debugLine="Msgbox(\"The Zip Code can't be empty!!\",\"Error\")";
Debug.ShouldStop(64);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("The Zip Code can't be empty!!")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 488;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 491;BA.debugLine="If actu Then";
Debug.ShouldStop(1024);
if (direcciones._actu.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 493;BA.debugLine="Dim json As String";
Debug.ShouldStop(4096);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 494;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
Debug.ShouldStop(8192);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipal.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion1':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtaddress1.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_direccion2':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtaddress2.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_idrecord':"),direcciones._update,RemoteObject.createImmutable(",'f_iddireccion':"),direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_usa':"),direcciones.mostCurrent._principal._isusa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_sector_city':'"),direcciones.mostCurrent._txtcity.runMethod(true,"getText"),RemoteObject.createImmutable("','f_zipcode':"),direcciones.mostCurrent._txtzipcode.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(",'f_nombre_direccion':'"),direcciones.mostCurrent._txtnombredireccion.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 497;BA.debugLine="actu = False";
Debug.ShouldStop(65536);
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"False");
 }else {
 BA.debugLineNum = 501;BA.debugLine="Dim json As String";
Debug.ShouldStop(1048576);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 502;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
Debug.ShouldStop(2097152);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),direcciones.mostCurrent._chprincipal.runMethod(true,"getChecked"),RemoteObject.createImmutable(",'f_direccion1':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtaddress1.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_direccion2':'"),direcciones.mostCurrent._funcion.runMethod(true,"_base64_encode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._txtaddress2.runMethod(true,"getText").runMethod(true,"trim"))),RemoteObject.createImmutable("','f_idrecord':"),direcciones._update,RemoteObject.createImmutable(",'f_usa':"),direcciones.mostCurrent._principal._isusa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_sector_city':'"),direcciones.mostCurrent._txtcity.runMethod(true,"getText"),RemoteObject.createImmutable("','f_zipcode':"),direcciones.mostCurrent._txtzipcode.runMethod(true,"getText"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(",'f_nombre_direccion':'"),direcciones.mostCurrent._txtnombredireccion.runMethod(true,"getText"),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 };
 BA.debugLineNum = 507;BA.debugLine="reload = True";
Debug.ShouldStop(67108864);
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 508;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(134217728);
_jobsalvar = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 509;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(268435456);
_jobsalvar.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,direcciones.processBA,(Object)(BA.ObjectToString("JobSalvar")),(Object)(direcciones.getObject()));
 BA.debugLineNum = 510;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(536870912);
_jobsalvar.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(direcciones.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),direcciones.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 512;BA.debugLine="update = 0";
Debug.ShouldStop(-2147483648);
direcciones._update = BA.numberCast(int.class, 0);
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _jobdone(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("JobDone (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,155);
if (RapidSub.canDelegate("jobdone")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
int _i = 0;
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _principaldireccion = RemoteObject.createImmutable(false);
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 155;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 157;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 158;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(536870912);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(direcciones.mostCurrent._main._jobmsj /*RemoteObject*/ )),(Object)(BA.ObjectToCharSequence(direcciones.mostCurrent._main._jobmsjtitle /*RemoteObject*/ )),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 159;BA.debugLine="Return";
Debug.ShouldStop(1073741824);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 162;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ ))),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 163;BA.debugLine="Return";
Debug.ShouldStop(4);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 166;BA.debugLine="Dim map As Map";
Debug.ShouldStop(32);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 167;BA.debugLine="Dim list As List";
Debug.ShouldStop(64);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 168;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(128);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 169;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(256);
_json.runVoidMethod ("Initialize",(Object)(direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 170;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(512);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 172;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(2048);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobSalvar"),BA.ObjectToString("JobEstados"),BA.ObjectToString("JobDeleteDir"))) {
case 0: {
 BA.debugLineNum = 175;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(16384);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 176;BA.debugLine="ListViewDirecciones.Clear";
Debug.ShouldStop(32768);
direcciones.mostCurrent._listviewdirecciones.runVoidMethod ("Clear");
 BA.debugLineNum = 177;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 178;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(131072);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No tiene direcciones registradas")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 180;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(524288);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="BuscarEstados";
Debug.ShouldStop(1048576);
_buscarestados();
 }else {
 BA.debugLineNum = 183;BA.debugLine="BuscarProvincias";
Debug.ShouldStop(4194304);
_buscarprovincias();
 };
 BA.debugLineNum = 186;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 192;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(-2147483648);
{
final int step26 = 1;
final int limit26 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step26 > 0 && _i <= limit26) || (step26 < 0 && _i >= limit26) ;_i = ((int)(0 + _i + step26))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 194;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(2);
_map.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 196;BA.debugLine="Dim dr,city,default,name=\"\" As String";
Debug.ShouldStop(8);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_city = RemoteObject.createImmutable("");Debug.locals.put("city", _city);
_default = RemoteObject.createImmutable("");Debug.locals.put("default", _default);
_name = BA.ObjectToString("");Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 198;BA.debugLine="Dim principalDireccion As Boolean";
Debug.ShouldStop(32);
_principaldireccion = RemoteObject.createImmutable(false);Debug.locals.put("principalDireccion", _principaldireccion);
 BA.debugLineNum = 199;BA.debugLine="principalDireccion = map.Get(\"f_principal\")";
Debug.ShouldStop(64);
_principaldireccion = BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_principal")))));Debug.locals.put("principalDireccion", _principaldireccion);
 BA.debugLineNum = 200;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
Debug.ShouldStop(128);
_dr = direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion1")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 201;BA.debugLine="city = \" ,\"&map.Get(\"f_sector_city\")";
Debug.ShouldStop(256);
_city = RemoteObject.concat(RemoteObject.createImmutable(" ,"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_sector_city")))));Debug.locals.put("city", _city);
 BA.debugLineNum = 202;BA.debugLine="name = map.Get(\"f_nombre_direccion\")";
Debug.ShouldStop(512);
_name = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_nombre_direccion")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 204;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 205;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(4096);
_dr = RemoteObject.concat(_dr.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 208;BA.debugLine="If principalDireccion Then";
Debug.ShouldStop(32768);
if (_principaldireccion.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 210;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(131072);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 212;BA.debugLine="default = \"Main address\"";
Debug.ShouldStop(524288);
_default = BA.ObjectToString("Main address");Debug.locals.put("default", _default);
 }else {
 BA.debugLineNum = 216;BA.debugLine="default = \"Dirección principal\"";
Debug.ShouldStop(8388608);
_default = BA.ObjectToString("Dirección principal");Debug.locals.put("default", _default);
 };
 };
 BA.debugLineNum = 222;BA.debugLine="ListViewDirecciones.AddTwoLines2(name&\": \"&dr&";
Debug.ShouldStop(536870912);
direcciones.mostCurrent._listviewdirecciones.runVoidMethod ("AddTwoLines2",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(_name,RemoteObject.createImmutable(": "),_dr,_city))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(direcciones.mostCurrent.__c.getField(false,"DateTime").runMethod(true,"Date",(Object)(BA.numberCast(long.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fecha"))))))),direcciones.mostCurrent.__c.getField(true,"CRLF"),_default))),(Object)((_map.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 225;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(1);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 226;BA.debugLine="BuscarEstados";
Debug.ShouldStop(2);
_buscarestados();
 }else {
 BA.debugLineNum = 228;BA.debugLine="BuscarProvincias";
Debug.ShouldStop(8);
_buscarprovincias();
 };
 BA.debugLineNum = 231;BA.debugLine="ProgressDialogHide";
Debug.ShouldStop(64);
direcciones.mostCurrent.__c.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 234;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(512);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 236;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(2048);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 237;BA.debugLine="Msgbox(\"Address registred.\" ,\"info\")";
Debug.ShouldStop(4096);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Address registred.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("info"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 238;BA.debugLine="reload = True";
Debug.ShouldStop(8192);
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 239;BA.debugLine="btnBackUsa_Click";
Debug.ShouldStop(16384);
_btnbackusa_click();
 }else {
 BA.debugLineNum = 242;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\"";
Debug.ShouldStop(131072);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Dirección registrada.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 243;BA.debugLine="reload = True";
Debug.ShouldStop(262144);
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 244;BA.debugLine="btnBackRd_Click";
Debug.ShouldStop(524288);
_btnbackrd_click();
 };
 }else {
 BA.debugLineNum = 249;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(16777216);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 250;BA.debugLine="Msgbox(\"Error registering your address\",\"Erro";
Debug.ShouldStop(33554432);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error registering your address")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 252;BA.debugLine="Msgbox(\"Error al registrar su dirección\",\"Err";
Debug.ShouldStop(134217728);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Error al registrar su dirección")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 };
 };
 break; }
case 2: {
 BA.debugLineNum = 258;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(2);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 260;BA.debugLine="If list.Size <= 0 Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("k",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 261;BA.debugLine="Msgbox(\"No hay Estados en la BD\",\"Aviso!!\")";
Debug.ShouldStop(16);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("No hay Estados en la BD")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso!!"))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 262;BA.debugLine="Return";
Debug.ShouldStop(32);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 265;BA.debugLine="estados.Initialize";
Debug.ShouldStop(256);
direcciones.mostCurrent._estados.runVoidMethod ("Initialize");
 BA.debugLineNum = 266;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(512);
{
final int step77 = 1;
final int limit77 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step77 > 0 && _i <= limit77) || (step77 < 0 && _i >= limit77) ;_i = ((int)(0 + _i + step77))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 268;BA.debugLine="Dim mapa As Map = list.Get(i)";
Debug.ShouldStop(2048);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapa.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 270;BA.debugLine="estados.Add( mapa.Get(\"f_descripcion\"))";
Debug.ShouldStop(8192);
direcciones.mostCurrent._estados.runVoidMethod ("Add",(Object)(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 275;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(262144);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 277;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(1048576);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 278;BA.debugLine="reload = True";
Debug.ShouldStop(2097152);
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 279;BA.debugLine="btnBackUsa_Click";
Debug.ShouldStop(4194304);
_btnbackusa_click();
 BA.debugLineNum = 280;BA.debugLine="ToastMessageShow(\"The address has deleted cor";
Debug.ShouldStop(8388608);
direcciones.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("The address has deleted correctly!")),(Object)(direcciones.mostCurrent.__c.getField(true,"False")));
 }else {
 BA.debugLineNum = 283;BA.debugLine="reload = True";
Debug.ShouldStop(67108864);
direcciones._reload = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 284;BA.debugLine="btnBackRd_Click";
Debug.ShouldStop(134217728);
_btnbackrd_click();
 BA.debugLineNum = 285;BA.debugLine="ToastMessageShow(\"La dirección se ha eliminad";
Debug.ShouldStop(268435456);
direcciones.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("La dirección se ha eliminado correctamente!")),(Object)(direcciones.mostCurrent.__c.getField(true,"False")));
 };
 }else {
 BA.debugLineNum = 290;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(2);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 291;BA.debugLine="Msgbox(\"The address could not be deleted\",\"Er";
Debug.ShouldStop(4);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("The address could not be deleted")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 }else {
 BA.debugLineNum = 293;BA.debugLine="Msgbox(\"La dirección no pudo ser eliminada\",\"";
Debug.ShouldStop(16);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("La dirección no pudo ser eliminada")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Error"))),direcciones.mostCurrent.activityBA);
 };
 };
 break; }
}
;
 BA.debugLineNum = 300;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewdirecciones_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewDirecciones_ItemClick (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,337);
if (RapidSub.canDelegate("listviewdirecciones_itemclick")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","listviewdirecciones_itemclick", _position, _value);}
RemoteObject _r = RemoteObject.createImmutable(0);
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 337;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
Debug.ShouldStop(65536);
 BA.debugLineNum = 339;BA.debugLine="mapaEdit = Value";
Debug.ShouldStop(262144);
direcciones.mostCurrent._mapaedit.setObject(_value);
 BA.debugLineNum = 341;BA.debugLine="Dim r As Int";
Debug.ShouldStop(1048576);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
 BA.debugLineNum = 343;BA.debugLine="If Principal.isUsa Then";
Debug.ShouldStop(4194304);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 344;BA.debugLine="r = Msgbox2(\"Do you want to edit this address?\",";
Debug.ShouldStop(8388608);
_r = direcciones.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Do you want to edit this address?")),(Object)(BA.ObjectToCharSequence("Question")),(Object)(BA.ObjectToString("Yes")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((direcciones.mostCurrent.__c.getField(false,"Null"))),direcciones.mostCurrent.activityBA);Debug.locals.put("r", _r);
 }else {
 BA.debugLineNum = 346;BA.debugLine="r = Msgbox2(\"Desea editar esta dirección?\",\"Avis";
Debug.ShouldStop(33554432);
_r = direcciones.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Desea editar esta dirección?")),(Object)(BA.ObjectToCharSequence("Aviso")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((direcciones.mostCurrent.__c.getField(false,"Null"))),direcciones.mostCurrent.activityBA);Debug.locals.put("r", _r);
 };
 BA.debugLineNum = 349;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, direcciones.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 351;BA.debugLine="If Principal.isUsa Then";
Debug.ShouldStop(1073741824);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 353;BA.debugLine="edition = True";
Debug.ShouldStop(1);
direcciones._edition = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 355;BA.debugLine="If PanelFondoDireccionesUSA.IsInitialized == Fa";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._panelfondodireccionesusa.runMethod(true,"IsInitialized"),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 357;BA.debugLine="Activity.LoadLayout(\"frmDireccionesUsa\")";
Debug.ShouldStop(16);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDireccionesUsa")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 358;BA.debugLine="PanelFondoDireccionesUSA.Visible = False";
Debug.ShouldStop(32);
direcciones.mostCurrent._panelfondodireccionesusa.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 362;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
Debug.ShouldStop(512);
direcciones.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent.__c.getField(true,"True")),(Object)(direcciones.mostCurrent._paneldireccion));
 BA.debugLineNum = 363;BA.debugLine="PanelFondoDireccionesUSA.SetVisibleAnimated(250";
Debug.ShouldStop(1024);
direcciones.mostCurrent._panelfondodireccionesusa.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(direcciones.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 365;BA.debugLine="txtAddress1.Text = funcion.base64_Decode(mapaEd";
Debug.ShouldStop(4096);
direcciones.mostCurrent._txtaddress1.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion1")))))))));
 BA.debugLineNum = 367;BA.debugLine="If funcion.base64_Decode(mapaEdit.Get(\"f_direcc";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("N",direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion2")))))))) && RemoteObject.solveBoolean("!",direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion2"))))))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 368;BA.debugLine="txtAddress2.Text = funcion.base64_Decode(mapaE";
Debug.ShouldStop(32768);
direcciones.mostCurrent._txtaddress2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion2")))))))));
 }else {
 BA.debugLineNum = 370;BA.debugLine="txtAddress2.Text = \"\"";
Debug.ShouldStop(131072);
direcciones.mostCurrent._txtaddress2.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 };
 BA.debugLineNum = 373;BA.debugLine="btnDeleteUsa.Visible = True";
Debug.ShouldStop(1048576);
direcciones.mostCurrent._btndeleteusa.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 375;BA.debugLine="btnState.AddAll(estados)";
Debug.ShouldStop(4194304);
direcciones.mostCurrent._btnstate.runVoidMethod ("AddAll",(Object)(direcciones.mostCurrent._estados));
 BA.debugLineNum = 377;BA.debugLine="txtCity.Text = mapaEdit.Get(\"f_sector_city\")";
Debug.ShouldStop(16777216);
direcciones.mostCurrent._txtcity.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_sector_city"))))));
 BA.debugLineNum = 378;BA.debugLine="btnState.SelectedIndex = (mapaEdit.Get(\"f_state";
Debug.ShouldStop(33554432);
direcciones.mostCurrent._btnstate.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_state_provincia"))))),RemoteObject.createImmutable(1)}, "-",1, 0))));
 BA.debugLineNum = 379;BA.debugLine="txtZipCode.Text = mapaEdit.Get(\"f_zipcode\")";
Debug.ShouldStop(67108864);
direcciones.mostCurrent._txtzipcode.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_zipcode"))))));
 BA.debugLineNum = 380;BA.debugLine="chPrincipal.Checked = mapaEdit.Get(\"f_principal";
Debug.ShouldStop(134217728);
direcciones.mostCurrent._chprincipal.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_principal"))))));
 BA.debugLineNum = 381;BA.debugLine="actu = True";
Debug.ShouldStop(268435456);
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 382;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
Debug.ShouldStop(536870912);
direcciones._update = BA.numberCast(int.class, direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 }else {
 BA.debugLineNum = 386;BA.debugLine="edition = True";
Debug.ShouldStop(2);
direcciones._edition = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 387;BA.debugLine="If PanelFondoDireccionesRD.IsInitialized == Fal";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._panelfondodireccionesrd.runMethod(true,"IsInitialized"),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 389;BA.debugLine="Activity.LoadLayout(\"frmDireccionesRD\")";
Debug.ShouldStop(16);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDireccionesRD")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 390;BA.debugLine="PanelFondoDireccionesRD.Visible = False";
Debug.ShouldStop(32);
direcciones.mostCurrent._panelfondodireccionesrd.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 394;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
Debug.ShouldStop(512);
direcciones.mostCurrent._funcion.runVoidMethod ("_disableview" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(direcciones.mostCurrent.__c.getField(true,"True")),(Object)(direcciones.mostCurrent._paneldireccion));
 BA.debugLineNum = 395;BA.debugLine="PanelFondoDireccionesRD.SetVisibleAnimated(250,";
Debug.ShouldStop(1024);
direcciones.mostCurrent._panelfondodireccionesrd.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(direcciones.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 397;BA.debugLine="txtDireRD.Text = funcion.base64_Decode(mapaEdit";
Debug.ShouldStop(4096);
direcciones.mostCurrent._txtdirerd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,direcciones.mostCurrent.activityBA,(Object)(BA.ObjectToString(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_direccion1")))))))));
 BA.debugLineNum = 399;BA.debugLine="btnDeleteRD.Visible = True";
Debug.ShouldStop(16384);
direcciones.mostCurrent._btndeleterd.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 401;BA.debugLine="btnProvinciaCombo.AddAll(estados)";
Debug.ShouldStop(65536);
direcciones.mostCurrent._btnprovinciacombo.runVoidMethod ("AddAll",(Object)(direcciones.mostCurrent._estados));
 BA.debugLineNum = 403;BA.debugLine="txtSector.Text = mapaEdit.Get(\"f_sector_city\")";
Debug.ShouldStop(262144);
direcciones.mostCurrent._txtsector.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_sector_city"))))));
 BA.debugLineNum = 404;BA.debugLine="btnProvinciaCombo.SelectedIndex = (mapaEdit.Get";
Debug.ShouldStop(524288);
direcciones.mostCurrent._btnprovinciacombo.runMethod(true,"setSelectedIndex",BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_state_provincia"))))),RemoteObject.createImmutable(1)}, "-",1, 0))));
 BA.debugLineNum = 405;BA.debugLine="txtZipCodeRD.Text = mapaEdit.Get(\"f_zipcode\")";
Debug.ShouldStop(1048576);
direcciones.mostCurrent._txtzipcoderd.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_zipcode"))))));
 BA.debugLineNum = 406;BA.debugLine="chPrincipalRD.Checked = mapaEdit.Get(\"f_princip";
Debug.ShouldStop(2097152);
direcciones.mostCurrent._chprincipalrd.runMethodAndSync(true,"setChecked",BA.ObjectToBoolean(direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_principal"))))));
 BA.debugLineNum = 407;BA.debugLine="actu = True";
Debug.ShouldStop(4194304);
direcciones._actu = direcciones.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 408;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
Debug.ShouldStop(8388608);
direcciones._update = BA.numberCast(int.class, direcciones.mostCurrent._mapaedit.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 };
 }else {
 BA.debugLineNum = 413;BA.debugLine="Return";
Debug.ShouldStop(268435456);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _nombredireccion() throws Exception{
try {
		Debug.PushSubsStack("NombreDireccion (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,688);
if (RapidSub.canDelegate("nombredireccion")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","nombredireccion");}
 BA.debugLineNum = 688;BA.debugLine="Sub NombreDireccion";
Debug.ShouldStop(32768);
 BA.debugLineNum = 690;BA.debugLine="If PanelFondoNombreDir.IsInitialized == False The";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",direcciones.mostCurrent._panelfondonombredir.runMethod(true,"IsInitialized"),direcciones.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 691;BA.debugLine="Activity.LoadLayout(\"frmNombreDireccion\")";
Debug.ShouldStop(262144);
direcciones.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmNombreDireccion")),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 692;BA.debugLine="PanelFondoNombreDir.Visible = False";
Debug.ShouldStop(524288);
direcciones.mostCurrent._panelfondonombredir.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 695;BA.debugLine="PanelFondoNombreDir.SetVisibleAnimated(250,True)";
Debug.ShouldStop(4194304);
direcciones.mostCurrent._panelfondonombredir.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(direcciones.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 697;BA.debugLine="If Principal.IsUsa Then";
Debug.ShouldStop(16777216);
if (direcciones.mostCurrent._principal._isusa /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 698;BA.debugLine="Label16.Text = \"Name of the address\"";
Debug.ShouldStop(33554432);
direcciones.mostCurrent._label16.runMethod(true,"setText",BA.ObjectToCharSequence("Name of the address"));
 BA.debugLineNum = 699;BA.debugLine="txtNombreDireccion.Text = \"\"";
Debug.ShouldStop(67108864);
direcciones.mostCurrent._txtnombredireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 700;BA.debugLine="txtNombreDireccion.Hint = \"Name of the address\"";
Debug.ShouldStop(134217728);
direcciones.mostCurrent._txtnombredireccion.runMethod(true,"setHint",BA.ObjectToString("Name of the address"));
 }else {
 BA.debugLineNum = 702;BA.debugLine="Label16.Text = \"Nombre de la dirección\"";
Debug.ShouldStop(536870912);
direcciones.mostCurrent._label16.runMethod(true,"setText",BA.ObjectToCharSequence("Nombre de la dirección"));
 BA.debugLineNum = 703;BA.debugLine="txtNombreDireccion.Text = \"\"";
Debug.ShouldStop(1073741824);
direcciones.mostCurrent._txtnombredireccion.runMethodAndSync(true,"setText",BA.ObjectToCharSequence(""));
 BA.debugLineNum = 704;BA.debugLine="txtNombreDireccion.Hint = \"Nombre de la direcció";
Debug.ShouldStop(-2147483648);
direcciones.mostCurrent._txtnombredireccion.runMethod(true,"setHint",BA.ObjectToString("Nombre de la dirección"));
 };
 BA.debugLineNum = 708;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 6;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 9;BA.debugLine="Dim mapadir As Map";
direcciones._mapadir = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 10;BA.debugLine="Dim actualizar As Boolean = False";
direcciones._actualizar = direcciones.mostCurrent.__c.getField(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _txtcity_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txtCity_EnterPressed (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,770);
if (RapidSub.canDelegate("txtcity_enterpressed")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","txtcity_enterpressed");}
 BA.debugLineNum = 770;BA.debugLine="Sub txtCity_EnterPressed";
Debug.ShouldStop(2);
 BA.debugLineNum = 771;BA.debugLine="Msgbox(\"Llego\",\"\")";
Debug.ShouldStop(4);
direcciones.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Llego")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),direcciones.mostCurrent.activityBA);
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcode_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txtZipCode_EnterPressed (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,763);
if (RapidSub.canDelegate("txtzipcode_enterpressed")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcode_enterpressed");}
 BA.debugLineNum = 763;BA.debugLine="Sub txtZipCode_EnterPressed";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 765;BA.debugLine="txtCity.RequestFocus";
Debug.ShouldStop(268435456);
direcciones.mostCurrent._txtcity.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 768;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcode_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtZipCode_FocusChanged (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,774);
if (RapidSub.canDelegate("txtzipcode_focuschanged")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcode_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 774;BA.debugLine="Sub txtZipCode_FocusChanged (HasFocus As Boolean)";
Debug.ShouldStop(32);
 BA.debugLineNum = 776;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(128);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 777;BA.debugLine="Label3.Visible = False";
Debug.ShouldStop(256);
direcciones.mostCurrent._label3.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 778;BA.debugLine="Panel1.Visible = False";
Debug.ShouldStop(512);
direcciones.mostCurrent._panel1.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 780;BA.debugLine="Label5.Visible = False";
Debug.ShouldStop(2048);
direcciones.mostCurrent._label5.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 781;BA.debugLine="Panel2.Visible = False";
Debug.ShouldStop(4096);
direcciones.mostCurrent._panel2.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"False"));
 BA.debugLineNum = 785;BA.debugLine="tlbl6 = Label6.Top";
Debug.ShouldStop(65536);
direcciones._tlbl6 = direcciones.mostCurrent._label6.runMethod(true,"getTop");
 BA.debugLineNum = 786;BA.debugLine="tpanel3 = Panel3.Top";
Debug.ShouldStop(131072);
direcciones._tpanel3 = direcciones.mostCurrent._panel3.runMethod(true,"getTop");
 BA.debugLineNum = 788;BA.debugLine="tlbl7 = Label7.Top";
Debug.ShouldStop(524288);
direcciones._tlbl7 = direcciones.mostCurrent._label7.runMethod(true,"getTop");
 BA.debugLineNum = 789;BA.debugLine="tpanelcomboUsa = PanelComboUSA.Top";
Debug.ShouldStop(1048576);
direcciones._tpanelcombousa = direcciones.mostCurrent._panelcombousa.runMethod(true,"getTop");
 BA.debugLineNum = 791;BA.debugLine="tlbl8 = Label8.Top";
Debug.ShouldStop(4194304);
direcciones._tlbl8 = direcciones.mostCurrent._label8.runMethod(true,"getTop");
 BA.debugLineNum = 792;BA.debugLine="tpanelZip = panelZipCode.Top";
Debug.ShouldStop(8388608);
direcciones._tpanelzip = direcciones.mostCurrent._panelzipcode.runMethod(true,"getTop");
 BA.debugLineNum = 796;BA.debugLine="Label6.Top = 10%y";
Debug.ShouldStop(134217728);
direcciones.mostCurrent._label6.runMethod(true,"setTop",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),direcciones.mostCurrent.activityBA));
 BA.debugLineNum = 797;BA.debugLine="Panel3.Top = 15%y";
Debug.ShouldStop(268435456);
direcciones.mostCurrent._panel3.runMethod(true,"setTop",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),direcciones.mostCurrent.activityBA));
 BA.debugLineNum = 799;BA.debugLine="Label7.Top = 23%y";
Debug.ShouldStop(1073741824);
direcciones.mostCurrent._label7.runMethod(true,"setTop",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 23)),direcciones.mostCurrent.activityBA));
 BA.debugLineNum = 800;BA.debugLine="PanelComboUSA.Top = 29%y";
Debug.ShouldStop(-2147483648);
direcciones.mostCurrent._panelcombousa.runMethod(true,"setTop",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 29)),direcciones.mostCurrent.activityBA));
 BA.debugLineNum = 802;BA.debugLine="panelZipCode.Top = 40%y";
Debug.ShouldStop(2);
direcciones.mostCurrent._panelzipcode.runMethod(true,"setTop",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 40)),direcciones.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 806;BA.debugLine="Label3.Visible = True";
Debug.ShouldStop(32);
direcciones.mostCurrent._label3.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 807;BA.debugLine="Panel1.Visible = True";
Debug.ShouldStop(64);
direcciones.mostCurrent._panel1.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 809;BA.debugLine="Label5.Visible = True";
Debug.ShouldStop(256);
direcciones.mostCurrent._label5.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 810;BA.debugLine="Panel2.Visible = True";
Debug.ShouldStop(512);
direcciones.mostCurrent._panel2.runMethod(true,"setVisible",direcciones.mostCurrent.__c.getField(true,"True"));
 BA.debugLineNum = 812;BA.debugLine="Label6.Top = tlbl6";
Debug.ShouldStop(2048);
direcciones.mostCurrent._label6.runMethod(true,"setTop",direcciones._tlbl6);
 BA.debugLineNum = 813;BA.debugLine="Panel3.Top = tpanel3";
Debug.ShouldStop(4096);
direcciones.mostCurrent._panel3.runMethod(true,"setTop",direcciones._tpanel3);
 BA.debugLineNum = 815;BA.debugLine="Label7.Top = tlbl7";
Debug.ShouldStop(16384);
direcciones.mostCurrent._label7.runMethod(true,"setTop",direcciones._tlbl7);
 BA.debugLineNum = 816;BA.debugLine="PanelComboUSA.Top = tpanelcomboUsa";
Debug.ShouldStop(32768);
direcciones.mostCurrent._panelcombousa.runMethod(true,"setTop",direcciones._tpanelcombousa);
 BA.debugLineNum = 818;BA.debugLine="Label8.Top = tlbl8";
Debug.ShouldStop(131072);
direcciones.mostCurrent._label8.runMethod(true,"setTop",direcciones._tlbl8);
 BA.debugLineNum = 819;BA.debugLine="panelZipCode.Top = tpanelZip";
Debug.ShouldStop(262144);
direcciones.mostCurrent._panelzipcode.runMethod(true,"setTop",direcciones._tpanelzip);
 };
 BA.debugLineNum = 824;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcoderd_enterpressed() throws Exception{
try {
		Debug.PushSubsStack("txtZipCodeRD_EnterPressed (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,839);
if (RapidSub.canDelegate("txtzipcoderd_enterpressed")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcoderd_enterpressed");}
 BA.debugLineNum = 839;BA.debugLine="Sub txtZipCodeRD_EnterPressed";
Debug.ShouldStop(64);
 BA.debugLineNum = 841;BA.debugLine="txtSector.RequestFocus";
Debug.ShouldStop(256);
direcciones.mostCurrent._txtsector.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 843;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcoderd_focuschanged(RemoteObject _hasfocus) throws Exception{
try {
		Debug.PushSubsStack("txtZipCodeRD_FocusChanged (direcciones) ","direcciones",6,direcciones.mostCurrent.activityBA,direcciones.mostCurrent,845);
if (RapidSub.canDelegate("txtzipcoderd_focuschanged")) { return com.jq.pedidos.direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcoderd_focuschanged", _hasfocus);}
Debug.locals.put("HasFocus", _hasfocus);
 BA.debugLineNum = 845;BA.debugLine="Sub txtZipCodeRD_FocusChanged (HasFocus As Boolean";
Debug.ShouldStop(4096);
 BA.debugLineNum = 847;BA.debugLine="If HasFocus Then";
Debug.ShouldStop(16384);
if (_hasfocus.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 849;BA.debugLine="tpanelMarco = PanelMarcoDirRD.Top";
Debug.ShouldStop(65536);
direcciones._tpanelmarco = direcciones.mostCurrent._panelmarcodirrd.runMethod(true,"getTop");
 BA.debugLineNum = 851;BA.debugLine="PanelMarcoDirRD.Top = 0%y";
Debug.ShouldStop(262144);
direcciones.mostCurrent._panelmarcodirrd.runMethod(true,"setTop",direcciones.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),direcciones.mostCurrent.activityBA));
 }else {
 BA.debugLineNum = 855;BA.debugLine="PanelMarcoDirRD.Top = tpanelMarco";
Debug.ShouldStop(4194304);
direcciones.mostCurrent._panelmarcodirrd.runMethod(true,"setTop",direcciones._tpanelmarco);
 };
 BA.debugLineNum = 859;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}