package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_direcciones_subs_0 {


public static RemoteObject  _actualizardirecciones() throws Exception{
try {
		Debug.PushSubsStack("actualizarDirecciones (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,122);
if (RapidSub.canDelegate("actualizardirecciones")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","actualizardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 122;BA.debugLine="Sub actualizarDirecciones";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 124;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(134217728);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 125;BA.debugLine="hud.ProgressDialogShow(\"We're reloading your add";
Debug.ShouldStop(268435456);
b4i_direcciones._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("We're reloading your addresses")));
 }else {
 BA.debugLineNum = 127;BA.debugLine="hud.ProgressDialogShow(\"Actualizando sus direcci";
Debug.ShouldStop(1073741824);
b4i_direcciones._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Actualizando sus direcciónes")));
 };
 BA.debugLineNum = 130;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(2);
_jobdirecciones = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 131;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(4);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 132;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(8);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
		Debug.PushSubsStack("AddDireccion_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,408);
if (RapidSub.canDelegate("adddireccion_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","adddireccion_click");}
 BA.debugLineNum = 408;BA.debugLine="Sub AddDireccion_Click";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 410;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(33554432);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 412;BA.debugLine="txtAddress1.SetShadow(Colors.Gray, 2dip,2dip,0.5";
Debug.ShouldStop(134217728);
b4i_direcciones._txtaddress1.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 413;BA.debugLine="txtAddress2.SetShadow(Colors.Gray, 2dip,2dip,0.5";
Debug.ShouldStop(268435456);
b4i_direcciones._txtaddress2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 414;BA.debugLine="txtCity.SetShadow(Colors.Gray, 2dip,2dip,0.5,Fal";
Debug.ShouldStop(536870912);
b4i_direcciones._txtcity.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 415;BA.debugLine="txtZipCode.SetShadow(Colors.Gray, 2dip,2dip,0.5,";
Debug.ShouldStop(1073741824);
b4i_direcciones._txtzipcode.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 416;BA.debugLine="BtnAgregarDireccionFinal.SetShadow(Colors.Gray,";
Debug.ShouldStop(-2147483648);
b4i_direcciones._btnagregardireccionfinal.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 417;BA.debugLine="btnDeleteUsa.SetShadow(Colors.Gray, 2dip,2dip,0.";
Debug.ShouldStop(1);
b4i_direcciones._btndeleteusa.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 418;BA.debugLine="PanelEncabezadoUsa.SetShadow(Colors.Gray,0dip,3d";
Debug.ShouldStop(2);
b4i_direcciones._panelencabezadousa.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 420;BA.debugLine="btnState.SetItems(estados)";
Debug.ShouldStop(8);
b4i_direcciones._btnstate.runClassMethod (b4i_b4xcombobox.class, "_setitems:" /*RemoteObject*/ ,(Object)(b4i_direcciones._estados));
 BA.debugLineNum = 421;BA.debugLine="PanelFondoDireccionesUSA.SetAlphaAnimated(0,0)";
Debug.ShouldStop(16);
b4i_direcciones._panelfondodireccionesusa.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 422;BA.debugLine="PanelFondoDireccionesUSA.Left = 0%x";
Debug.ShouldStop(32);
b4i_direcciones._panelfondodireccionesusa.runMethod(true,"setLeft:",b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 423;BA.debugLine="PanelFondoDireccionesUSA.SetAlphaAnimated(500,1)";
Debug.ShouldStop(64);
b4i_direcciones._panelfondodireccionesusa.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 425;BA.debugLine="If edition Then";
Debug.ShouldStop(256);
if (b4i_direcciones._edition.getBoolean()) { 
 BA.debugLineNum = 426;BA.debugLine="btnDeleteUsa.Visible = True";
Debug.ShouldStop(512);
b4i_direcciones._btndeleteusa.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 }else {
 BA.debugLineNum = 428;BA.debugLine="btnDeleteUsa.Visible = False";
Debug.ShouldStop(2048);
b4i_direcciones._btndeleteusa.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 };
 BA.debugLineNum = 430;BA.debugLine="actu = False";
Debug.ShouldStop(8192);
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"False");
 }else {
 BA.debugLineNum = 434;BA.debugLine="btnProvinciaCombo.SetItems(estados)";
Debug.ShouldStop(131072);
b4i_direcciones._btnprovinciacombo.runClassMethod (b4i_b4xcombobox.class, "_setitems:" /*RemoteObject*/ ,(Object)(b4i_direcciones._estados));
 BA.debugLineNum = 436;BA.debugLine="PanelFondoDireccionesRD.SetAlphaAnimated(0,0)";
Debug.ShouldStop(524288);
b4i_direcciones._panelfondodireccionesrd.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 437;BA.debugLine="PanelFondoDireccionesRD.Top = 0%y";
Debug.ShouldStop(1048576);
b4i_direcciones._panelfondodireccionesrd.runMethod(true,"setTop:",b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 438;BA.debugLine="PanelFondoDireccionesRD.SetAlphaAnimated(500,1)";
Debug.ShouldStop(2097152);
b4i_direcciones._panelfondodireccionesrd.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 440;BA.debugLine="PanelEncabezadoRD.SetShadow(Colors.Gray,0dip,3di";
Debug.ShouldStop(8388608);
b4i_direcciones._panelencabezadord.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 441;BA.debugLine="txtDireRD.SetShadow(Colors.Gray, 2dip,2dip,0.5,F";
Debug.ShouldStop(16777216);
b4i_direcciones._txtdirerd.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 442;BA.debugLine="txtSector.SetShadow(Colors.Gray, 2dip,2dip,0.5,F";
Debug.ShouldStop(33554432);
b4i_direcciones._txtsector.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 443;BA.debugLine="txtZipCodeRD.SetShadow(Colors.Gray, 2dip,2dip,0.";
Debug.ShouldStop(67108864);
b4i_direcciones._txtzipcoderd.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 445;BA.debugLine="If edition Then";
Debug.ShouldStop(268435456);
if (b4i_direcciones._edition.getBoolean()) { 
 BA.debugLineNum = 446;BA.debugLine="btnDeleteRD.Visible = True";
Debug.ShouldStop(536870912);
b4i_direcciones._btndeleterd.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 }else {
 BA.debugLineNum = 448;BA.debugLine="btnDeleteRD.Visible = False";
Debug.ShouldStop(-2147483648);
b4i_direcciones._btndeleterd.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 };
 BA.debugLineNum = 450;BA.debugLine="actu = False";
Debug.ShouldStop(2);
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"False");
 };
 BA.debugLineNum = 454;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _borrardireccion_click() throws Exception{
try {
		Debug.PushSubsStack("BorrarDireccion_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,456);
if (RapidSub.canDelegate("borrardireccion_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","borrardireccion_click");}
 BA.debugLineNum = 456;BA.debugLine="Sub BorrarDireccion_Click";
Debug.ShouldStop(128);
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnAceptarNombreDir_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,771);
if (RapidSub.canDelegate("btnaceptarnombredir_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnaceptarnombredir_click");}
 BA.debugLineNum = 771;BA.debugLine="Sub btnAceptarNombreDir_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 774;BA.debugLine="PanelFondoNombreDir.SetAlphaAnimated(0,0)";
Debug.ShouldStop(32);
b4i_direcciones._panelfondonombredir.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 775;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(64);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 776;BA.debugLine="ingresarDirUSA";
Debug.ShouldStop(128);
_ingresardirusa();
 }else {
 BA.debugLineNum = 778;BA.debugLine="ingresarDirRD";
Debug.ShouldStop(512);
_ingresardirrd();
 };
 BA.debugLineNum = 781;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("BtnAgregarDireccionFinal_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,533);
if (RapidSub.canDelegate("btnagregardireccionfinal_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnagregardireccionfinal_click");}
 BA.debugLineNum = 533;BA.debugLine="Sub BtnAgregarDireccionFinal_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 535;BA.debugLine="NombreDireccion";
Debug.ShouldStop(4194304);
_nombredireccion();
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnAgregarDirRD_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,703);
if (RapidSub.canDelegate("btnagregardirrd_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnagregardirrd_click");}
 BA.debugLineNum = 703;BA.debugLine="Sub btnAgregarDirRD_Click";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 705;BA.debugLine="NombreDireccion";
Debug.ShouldStop(1);
_nombredireccion();
 BA.debugLineNum = 707;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("btnBackRd_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,675);
if (RapidSub.canDelegate("btnbackrd_click")) { b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnbackrd_click"); return;}
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
public ResumableSub_btnBackRd_Click(b4i_direcciones parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_direcciones parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBackRd_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,675);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 677;BA.debugLine="If reload Then";
Debug.ShouldStop(16);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._reload.getBoolean()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 678;BA.debugLine="actualizarDirecciones";
Debug.ShouldStop(32);
_actualizardirecciones();
 BA.debugLineNum = 679;BA.debugLine="reload = False";
Debug.ShouldStop(64);
parent._reload = b4i_main.__c.runMethod(true,"False");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 682;BA.debugLine="PanelFondoDireccionesRD.SetAlphaAnimated(500,0)";
Debug.ShouldStop(512);
parent._panelfondodireccionesrd.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 684;BA.debugLine="Sleep(200)";
Debug.ShouldStop(2048);
b4i_main.__c.runVoidMethod ("Sleep:::",b4i_direcciones.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "direcciones", "btnbackrd_click"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 686;BA.debugLine="txtDireRD.Text = \"\"";
Debug.ShouldStop(8192);
parent._txtdirerd.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 687;BA.debugLine="txtSector.Text = \"\"";
Debug.ShouldStop(16384);
parent._txtsector.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 688;BA.debugLine="btnProvinciaCombo.SelectedIndex = -1";
Debug.ShouldStop(32768);
parent._btnprovinciacombo.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 689;BA.debugLine="txtZipCodeRD.Text = \"\"";
Debug.ShouldStop(65536);
parent._txtzipcoderd.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 690;BA.debugLine="chPrincipalRD.Value = False";
Debug.ShouldStop(131072);
parent._chprincipalrd.runMethod(true,"setValue:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 692;BA.debugLine="edition = False";
Debug.ShouldStop(524288);
parent._edition = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 693;BA.debugLine="actu = False";
Debug.ShouldStop(1048576);
parent._actu = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 695;BA.debugLine="pageDirecciones.ResignFocus";
Debug.ShouldStop(4194304);
parent._pagedirecciones.runVoidMethod ("ResignFocus");
 BA.debugLineNum = 697;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("btnBackUsa_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,468);
if (RapidSub.canDelegate("btnbackusa_click")) { b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnbackusa_click"); return;}
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
public ResumableSub_btnBackUsa_Click(b4i_direcciones parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_direcciones parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnBackUsa_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,468);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 470;BA.debugLine="If reload Then";
Debug.ShouldStop(2097152);
if (true) break;

case 1:
//if
this.state = 4;
if (parent._reload.getBoolean()) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 471;BA.debugLine="actualizarDirecciones";
Debug.ShouldStop(4194304);
_actualizardirecciones();
 BA.debugLineNum = 472;BA.debugLine="reload = False";
Debug.ShouldStop(8388608);
parent._reload = b4i_main.__c.runMethod(true,"False");
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 475;BA.debugLine="PanelFondoDireccionesUSA.SetAlphaAnimated(500,0)";
Debug.ShouldStop(67108864);
parent._panelfondodireccionesusa.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 477;BA.debugLine="Sleep(200)";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethod ("Sleep:::",b4i_direcciones.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "direcciones", "btnbackusa_click"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 479;BA.debugLine="txtAddress1.Text = \"\"";
Debug.ShouldStop(1073741824);
parent._txtaddress1.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 480;BA.debugLine="txtAddress2.Text = \"\"";
Debug.ShouldStop(-2147483648);
parent._txtaddress2.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 481;BA.debugLine="txtCity.Text = \"\"";
Debug.ShouldStop(1);
parent._txtcity.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 482;BA.debugLine="btnState.SelectedIndex = -1";
Debug.ShouldStop(2);
parent._btnstate.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 483;BA.debugLine="txtZipCode.Text = \"\"";
Debug.ShouldStop(4);
parent._txtzipcode.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 484;BA.debugLine="chPrincipal.Value = False";
Debug.ShouldStop(8);
parent._chprincipal.runMethod(true,"setValue:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 486;BA.debugLine="edition = False";
Debug.ShouldStop(32);
parent._edition = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 487;BA.debugLine="actu = False";
Debug.ShouldStop(64);
parent._actu = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 489;BA.debugLine="pageDirecciones.ResignFocus";
Debug.ShouldStop(256);
parent._pagedirecciones.runVoidMethod ("ResignFocus");
 BA.debugLineNum = 490;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("btnDeleteRD_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,751);
if (RapidSub.canDelegate("btndeleterd_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btndeleterd_click");}
 BA.debugLineNum = 751;BA.debugLine="Sub btnDeleteRD_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 753;BA.debugLine="Msgbox2(\"MsgDelete\",\"Desea borrar esta dirección\"";
Debug.ShouldStop(65536);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_direcciones.ba,(Object)(BA.ObjectToString("MsgDelete")),(Object)(BA.ObjectToString("Desea borrar esta dirección")),(Object)(BA.ObjectToString("Aviso!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 755;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("btnDeleteUsa_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,539);
if (RapidSub.canDelegate("btndeleteusa_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btndeleteusa_click");}
 BA.debugLineNum = 539;BA.debugLine="Sub btnDeleteUsa_Click";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 541;BA.debugLine="Msgbox2(\"MsgDelete\",\"Do you want to delete this";
Debug.ShouldStop(268435456);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_direcciones.ba,(Object)(BA.ObjectToString("MsgDelete")),(Object)(BA.ObjectToString("Do you want to delete this address?")),(Object)(BA.ObjectToString("Warning!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Yes")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 543;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btndireccionback2_click() throws Exception{
try {
		Debug.PushSubsStack("btnDireccionBack2_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,323);
if (RapidSub.canDelegate("btndireccionback2_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btndireccionback2_click");}
 BA.debugLineNum = 323;BA.debugLine="Sub btnDireccionBack2_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 325;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(16);
b4i_direcciones._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 326;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(32);
b4i_direcciones._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 328;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnNuevaDireccion_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,371);
if (RapidSub.canDelegate("btnnuevadireccion_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnnuevadireccion_click");}
 BA.debugLineNum = 371;BA.debugLine="Sub btnNuevaDireccion_Click";
Debug.ShouldStop(262144);
 BA.debugLineNum = 372;BA.debugLine="txtDireccion.Text =\"\"";
Debug.ShouldStop(524288);
b4i_direcciones._txtdireccion.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 373;BA.debugLine="txtDireccion.Tag = 0";
Debug.ShouldStop(1048576);
b4i_direcciones._txtdireccion.runMethod(false,"setTag:",RemoteObject.createImmutable((0)));
 BA.debugLineNum = 374;BA.debugLine="chPrincipal.Value = False";
Debug.ShouldStop(2097152);
b4i_direcciones._chprincipal.runMethod(true,"setValue:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 375;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(4194304);
_cargardirecciones();
 BA.debugLineNum = 376;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnprovinciacombo_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("btnProvinciaCombo_SelectedIndexChanged (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,699);
if (RapidSub.canDelegate("btnprovinciacombo_selectedindexchanged")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnprovinciacombo_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 699;BA.debugLine="Sub btnProvinciaCombo_SelectedIndexChanged (Index";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 700;BA.debugLine="indexCombo = Index";
Debug.ShouldStop(134217728);
b4i_direcciones._indexcombo = _index;
 BA.debugLineNum = 701;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
		Debug.PushSubsStack("btnSalvarDireccion_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,341);
if (RapidSub.canDelegate("btnsalvardireccion_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnsalvardireccion_click");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 341;BA.debugLine="Sub btnSalvarDireccion_Click";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 343;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim").runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 344;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Introduzca la dirección")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 345;BA.debugLine="txtDireccion.RequestFocus";
Debug.ShouldStop(16777216);
b4i_direcciones._txtdireccion.runVoidMethod ("RequestFocus");
 BA.debugLineNum = 346;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 351;BA.debugLine="If actualizar Then";
Debug.ShouldStop(1073741824);
if (b4i_direcciones._actualizar.getBoolean()) { 
 BA.debugLineNum = 353;BA.debugLine="Dim json As String";
Debug.ShouldStop(1);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 354;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
Debug.ShouldStop(2);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipal.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_idrecord':"),b4i_direcciones._txtdireccion.runMethod(false,"Tag"),RemoteObject.createImmutable(",'f_credito_fiscal':false,'f_iddireccion':"),b4i_direcciones._mapadir.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 355;BA.debugLine="actualizar = False";
Debug.ShouldStop(4);
b4i_direcciones._actualizar = b4i_main.__c.runMethod(true,"False");
 }else {
 BA.debugLineNum = 359;BA.debugLine="Dim json As String";
Debug.ShouldStop(64);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 360;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
Debug.ShouldStop(128);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipal.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtdireccion.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_idrecord':"),b4i_direcciones._txtdireccion.runMethod(false,"Tag"),RemoteObject.createImmutable(",'f_credito_fiscal':false"));Debug.locals.put("json", _json);
 };
 BA.debugLineNum = 365;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(4096);
_jobsalvar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 366;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(8192);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobSalvar")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 367;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(16384);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnstate_selectedindexchanged(RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("btnState_SelectedIndexChanged (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,462);
if (RapidSub.canDelegate("btnstate_selectedindexchanged")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","btnstate_selectedindexchanged", _index);}
Debug.locals.put("Index", _index);
 BA.debugLineNum = 462;BA.debugLine="Sub btnState_SelectedIndexChanged (Index As Int)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 464;BA.debugLine="indexCombo = Index";
Debug.ShouldStop(32768);
b4i_direcciones._indexcombo = _index;
 BA.debugLineNum = 466;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("BuscarEstados (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,303);
if (RapidSub.canDelegate("buscarestados")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","buscarestados");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobestados = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 303;BA.debugLine="Sub BuscarEstados";
Debug.ShouldStop(16384);
 BA.debugLineNum = 305;BA.debugLine="Dim json As String = \"'f_usa': true\"";
Debug.ShouldStop(65536);
_json = BA.ObjectToString("'f_usa': true");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 307;BA.debugLine="Dim JobEstados As HttpJob";
Debug.ShouldStop(262144);
_jobestados = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobEstados", _jobestados);
 BA.debugLineNum = 308;BA.debugLine="JobEstados.Initialize(\"JobEstados\",Me)";
Debug.ShouldStop(524288);
_jobestados.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobEstados")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 309;BA.debugLine="JobEstados.PostString(Main.url&\"ws/Buscar_lista_e";
Debug.ShouldStop(1048576);
_jobestados.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/Buscar_lista_estados"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("BuscarProvincias (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,313);
if (RapidSub.canDelegate("buscarprovincias")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","buscarprovincias");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobprovincia = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 313;BA.debugLine="Sub BuscarProvincias";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 315;BA.debugLine="Dim json As String = \"'f_usa': false\"";
Debug.ShouldStop(67108864);
_json = BA.ObjectToString("'f_usa': false");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 317;BA.debugLine="Dim JobProvincia As HttpJob";
Debug.ShouldStop(268435456);
_jobprovincia = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobProvincia", _jobprovincia);
 BA.debugLineNum = 318;BA.debugLine="JobProvincia.Initialize(\"JobEstados\",Me)";
Debug.ShouldStop(536870912);
_jobprovincia.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobEstados")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 319;BA.debugLine="JobProvincia.PostString(Main.url&\"ws/Buscar_lista";
Debug.ShouldStop(1073741824);
_jobprovincia.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/Buscar_lista_estados"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("cargarDirecciones (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,109);
if (RapidSub.canDelegate("cargardirecciones")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","cargardirecciones");}
RemoteObject _jobdirecciones = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 109;BA.debugLine="Sub cargarDirecciones";
Debug.ShouldStop(4096);
 BA.debugLineNum = 111;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(16384);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 112;BA.debugLine="hud.ProgressDialogShow(\"We're searching your add";
Debug.ShouldStop(32768);
b4i_direcciones._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("We're searching your addresses")));
 }else {
 BA.debugLineNum = 114;BA.debugLine="hud.ProgressDialogShow(\"Buscando sus direcciones";
Debug.ShouldStop(131072);
b4i_direcciones._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Buscando sus direcciones")));
 };
 BA.debugLineNum = 117;BA.debugLine="Dim JobDirecciones As HttpJob";
Debug.ShouldStop(1048576);
_jobdirecciones = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDirecciones", _jobdirecciones);
 BA.debugLineNum = 118;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
Debug.ShouldStop(2097152);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobDirecciones")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 119;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
Debug.ShouldStop(4194304);
_jobdirecciones.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/get_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crear() throws Exception{
try {
		Debug.PushSubsStack("crear (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,101);
if (RapidSub.canDelegate("crear")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","crear");}
 BA.debugLineNum = 101;BA.debugLine="Sub crear";
Debug.ShouldStop(16);
 BA.debugLineNum = 103;BA.debugLine="PanelEncabezadoDir2.SetShadow(Colors.Gray, 0dip,3";
Debug.ShouldStop(64);
b4i_direcciones._panelencabezadodir2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 104;BA.debugLine="Panel2V2.SetShadow(Colors.Gray,2dip,2dip,0.5,Fals";
Debug.ShouldStop(128);
b4i_direcciones._panel2v2.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 105;BA.debugLine="AddDireccion.SetShadow(Colors.Gray,2dip,2dip,0.5,";
Debug.ShouldStop(256);
b4i_direcciones._adddireccion.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.5)),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _dir,RemoteObject _fecha,RemoteObject _principal,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,292);
if (RapidSub.canDelegate("createlistitem")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","createlistitem", _dir, _fecha, _principal, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Dir", _dir);
Debug.locals.put("fecha", _fecha);
Debug.locals.put("principal", _principal);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 292;BA.debugLine="Sub CreateListItem(Dir As String, fecha As Long,pr";
Debug.ShouldStop(8);
 BA.debugLineNum = 293;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(16);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 294;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(32);
_p.runVoidMethod ("Initialize::",b4i_direcciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 295;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(64);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 296;BA.debugLine="p.LoadLayout(\"frmItemsDir\")";
Debug.ShouldStop(128);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmItemsDir")),b4i_direcciones.ba);
 BA.debugLineNum = 297;BA.debugLine="lblDir.Text = Dir";
Debug.ShouldStop(256);
b4i_direcciones._lbldir.runMethod(true,"setText:",_dir);
 BA.debugLineNum = 298;BA.debugLine="lblFecha.Text = DateTime.Date(fecha)";
Debug.ShouldStop(512);
b4i_direcciones._lblfecha.runMethod(true,"setText:",b4i_main.__c.runMethod(false,"DateTime").runMethod(true,"Date:",(Object)(_fecha)));
 BA.debugLineNum = 299;BA.debugLine="lblPrincipal.Text = principal";
Debug.ShouldStop(1024);
b4i_direcciones._lblprincipal.runMethod(true,"setText:",_principal);
 BA.debugLineNum = 300;BA.debugLine="Return p";
Debug.ShouldStop(2048);
if (true) return _p;
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _ingresardirrd() throws Exception{
try {
		Debug.PushSubsStack("ingresarDirRD (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,709);
if (RapidSub.canDelegate("ingresardirrd")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","ingresardirrd");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 709;BA.debugLine="Sub ingresarDirRD";
Debug.ShouldStop(16);
 BA.debugLineNum = 711;BA.debugLine="If txtDireRD.Text == \"\" Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtdirerd.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 712;BA.debugLine="Msgbox(\"La dirección no puede estar vacia!!\",\"Er";
Debug.ShouldStop(128);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La dirección no puede estar vacia!!")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 713;BA.debugLine="Return";
Debug.ShouldStop(256);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 716;BA.debugLine="If txtSector.Text == \"\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtsector.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 717;BA.debugLine="Msgbox(\"El sector no puede estar vacio!!\",\"Error";
Debug.ShouldStop(4096);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("El sector no puede estar vacio!!")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 718;BA.debugLine="Return";
Debug.ShouldStop(8192);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 721;BA.debugLine="If txtZipCodeRD.Text == \"\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtzipcoderd.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 722;BA.debugLine="Msgbox(\"El Zip Code no puede estar vacio!!\",\"Err";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("El Zip Code no puede estar vacio!!")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 723;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 726;BA.debugLine="If actu Then";
Debug.ShouldStop(2097152);
if (b4i_direcciones._actu.getBoolean()) { 
 BA.debugLineNum = 728;BA.debugLine="Dim json As String";
Debug.ShouldStop(8388608);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 729;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Value&\",'f";
Debug.ShouldStop(16777216);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipalrd.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion1':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtdirerd.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_direccion2':''"),RemoteObject.createImmutable(",'f_idrecord':"),b4i_direcciones._update,RemoteObject.createImmutable(",'f_iddireccion':"),b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_usa':"),BA.BooleanToString(b4i_direcciones._main._isusa /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_sector_city':'"),b4i_direcciones._txtsector.runMethod(true,"Text"),RemoteObject.createImmutable("','f_zipcode':"),b4i_direcciones._txtzipcoderd.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {b4i_direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("json", _json);
 BA.debugLineNum = 732;BA.debugLine="actu = False";
Debug.ShouldStop(134217728);
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"False");
 }else {
 BA.debugLineNum = 736;BA.debugLine="Dim json As String";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 737;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Value&\",'f";
Debug.ShouldStop(1);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipalrd.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion1':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtdirerd.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_direccion2':'','f_idrecord':"),b4i_direcciones._update,RemoteObject.createImmutable(",'f_usa':"),BA.BooleanToString(b4i_direcciones._main._isusa /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_sector_city':'"),b4i_direcciones._txtsector.runMethod(true,"Text"),RemoteObject.createImmutable("','f_zipcode':"),b4i_direcciones._txtzipcoderd.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {b4i_direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)));Debug.locals.put("json", _json);
 };
 BA.debugLineNum = 742;BA.debugLine="reload = True";
Debug.ShouldStop(32);
b4i_direcciones._reload = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 743;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(64);
_jobsalvar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 744;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(128);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobSalvar")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 745;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(256);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 747;BA.debugLine="update = 0";
Debug.ShouldStop(1024);
b4i_direcciones._update = BA.numberCast(int.class, 0);
 BA.debugLineNum = 749;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("ingresarDirUSA (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,492);
if (RapidSub.canDelegate("ingresardirusa")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","ingresardirusa");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobsalvar = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 492;BA.debugLine="Sub ingresarDirUSA";
Debug.ShouldStop(2048);
 BA.debugLineNum = 494;BA.debugLine="If txtAddress1.Text == \"\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtaddress1.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 495;BA.debugLine="Msgbox(\"The Addres 1 can't be empty!!\",\"Error\")";
Debug.ShouldStop(16384);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("The Addres 1 can't be empty!!")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 496;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 499;BA.debugLine="If txtCity.Text == \"\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtcity.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 500;BA.debugLine="Msgbox(\"The City can't be empty!!\",\"Error\")";
Debug.ShouldStop(524288);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("The City can't be empty!!")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 501;BA.debugLine="Return";
Debug.ShouldStop(1048576);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 504;BA.debugLine="If txtZipCode.Text == \"\" Then";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("=",b4i_direcciones._txtzipcode.runMethod(true,"Text"),BA.ObjectToString(""))) { 
 BA.debugLineNum = 505;BA.debugLine="Msgbox(\"The Zip Code can't be empty!!\",\"Error\")";
Debug.ShouldStop(16777216);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("The Zip Code can't be empty!!")),(Object)(RemoteObject.createImmutable("Error")));
 BA.debugLineNum = 506;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 509;BA.debugLine="If actu Then";
Debug.ShouldStop(268435456);
if (b4i_direcciones._actu.getBoolean()) { 
 BA.debugLineNum = 511;BA.debugLine="Dim json As String";
Debug.ShouldStop(1073741824);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 512;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipal.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion1':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtaddress1.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_direccion2':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtaddress2.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_idrecord':"),b4i_direcciones._update,RemoteObject.createImmutable(",'f_iddireccion':"),b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_usa':"),BA.BooleanToString(b4i_direcciones._main._isusa /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_sector_city':'"),b4i_direcciones._txtcity.runMethod(true,"Text"),RemoteObject.createImmutable("','f_zipcode':"),b4i_direcciones._txtzipcode.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {b4i_direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(",'f_nombre_direccion':'"),b4i_direcciones._txtnombredireccion.runMethod(true,"Text"),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 BA.debugLineNum = 515;BA.debugLine="actu = False";
Debug.ShouldStop(4);
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"False");
 }else {
 BA.debugLineNum = 519;BA.debugLine="Dim json As String";
Debug.ShouldStop(64);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 520;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
Debug.ShouldStop(128);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_principal':"),BA.BooleanToString(b4i_direcciones._chprincipal.runMethod(true,"Value")),RemoteObject.createImmutable(",'f_direccion1':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtaddress1.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_direccion2':'"),b4i_direcciones._funciones.runMethod(true,"_base64_encode:" /*RemoteObject*/ ,(Object)(b4i_direcciones._txtaddress2.runMethod(true,"Text").runMethod(true,"Trim"))),RemoteObject.createImmutable("','f_idrecord':"),b4i_direcciones._update,RemoteObject.createImmutable(",'f_usa':"),BA.BooleanToString(b4i_direcciones._main._isusa /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_sector_city':'"),b4i_direcciones._txtcity.runMethod(true,"Text"),RemoteObject.createImmutable("','f_zipcode':"),b4i_direcciones._txtzipcode.runMethod(true,"Text"),RemoteObject.createImmutable(",'f_state_prov':"),(RemoteObject.solve(new RemoteObject[] {b4i_direcciones._indexcombo,RemoteObject.createImmutable(1)}, "+",1, 1)),RemoteObject.createImmutable(",'f_nombre_direccion':'"),b4i_direcciones._txtnombredireccion.runMethod(true,"Text"),RemoteObject.createImmutable("'"));Debug.locals.put("json", _json);
 };
 BA.debugLineNum = 525;BA.debugLine="reload = True";
Debug.ShouldStop(4096);
b4i_direcciones._reload = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 526;BA.debugLine="Dim JobSalvar As HttpJob";
Debug.ShouldStop(8192);
_jobsalvar = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobSalvar", _jobsalvar);
 BA.debugLineNum = 527;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
Debug.ShouldStop(16384);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobSalvar")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 528;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
Debug.ShouldStop(32768);
_jobsalvar.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/set_salvar_direcciones_usuario"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 530;BA.debugLine="update = 0";
Debug.ShouldStop(131072);
b4i_direcciones._update = BA.numberCast(int.class, 0);
 BA.debugLineNum = 531;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize() throws Exception{
try {
		Debug.PushSubsStack("Initialize (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,88);
if (RapidSub.canDelegate("initialize")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","initialize");}
 BA.debugLineNum = 88;BA.debugLine="Sub Initialize";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="pageDirecciones.Initialize(\"PageDirecciones\")";
Debug.ShouldStop(16777216);
b4i_direcciones._pagedirecciones.runVoidMethod ("Initialize::",b4i_direcciones.ba,(Object)(RemoteObject.createImmutable("PageDirecciones")));
 BA.debugLineNum = 90;BA.debugLine="pageDirecciones.RootPanel.LoadLayout(\"frmDirecion";
Debug.ShouldStop(33554432);
b4i_direcciones._pagedirecciones.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDirecionUSA")),b4i_direcciones.ba);
 BA.debugLineNum = 92;BA.debugLine="Main.NavControl.ShowPage(pageDirecciones)";
Debug.ShouldStop(134217728);
b4i_direcciones._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_direcciones._pagedirecciones).getObject())));
 BA.debugLineNum = 95;BA.debugLine="crear";
Debug.ShouldStop(1073741824);
_crear();
 BA.debugLineNum = 96;BA.debugLine="cargarDirecciones";
Debug.ShouldStop(-2147483648);
_cargardirecciones();
 BA.debugLineNum = 98;BA.debugLine="Main.smc.Tag = \"direcciones\"";
Debug.ShouldStop(2);
b4i_direcciones._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("direcciones")));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
		Debug.PushSubsStack("JobDone (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,136);
if (RapidSub.canDelegate("jobdone")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _principaldireccion = RemoteObject.createImmutable(0);
RemoteObject _mymap = RemoteObject.declareNull("B4IMap");
int _i = 0;
RemoteObject _dr = RemoteObject.createImmutable("");
RemoteObject _city = RemoteObject.createImmutable("");
RemoteObject _default = RemoteObject.createImmutable("");
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 136;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(128);
 BA.debugLineNum = 138;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 139;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(1024);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_direcciones._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_direcciones._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 140;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 143;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",b4i_direcciones._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 144;BA.debugLine="Return";
Debug.ShouldStop(32768);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 147;BA.debugLine="Dim map As Map";
Debug.ShouldStop(262144);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 148;BA.debugLine="Dim list As List";
Debug.ShouldStop(524288);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 149;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(1048576);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 150;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
Debug.ShouldStop(2097152);
_json.runVoidMethod ("Initialize:",(Object)(b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 151;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(4194304);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 153;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(16777216);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("JobDirecciones"),BA.ObjectToString("JobSalvar"),BA.ObjectToString("JobEstados"),BA.ObjectToString("JobDeleteDir"))) {
case 0: {
 BA.debugLineNum = 157;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(268435456);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 159;BA.debugLine="ListaDirecciones2.Clear";
Debug.ShouldStop(1073741824);
b4i_direcciones._listadirecciones2.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 161;BA.debugLine="If list.Size = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 162;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
Debug.ShouldStop(2);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No tiene direcciones registradas")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 163;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(4);
b4i_direcciones._hud.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 165;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(16);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 166;BA.debugLine="BuscarEstados";
Debug.ShouldStop(32);
_buscarestados();
 }else {
 BA.debugLineNum = 168;BA.debugLine="BuscarProvincias";
Debug.ShouldStop(128);
_buscarprovincias();
 };
 BA.debugLineNum = 171;BA.debugLine="Return";
Debug.ShouldStop(1024);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 174;BA.debugLine="Dim principalDireccion As  Int";
Debug.ShouldStop(8192);
_principaldireccion = RemoteObject.createImmutable(0);Debug.locals.put("principalDireccion", _principaldireccion);
 BA.debugLineNum = 175;BA.debugLine="Dim mymap As Map";
Debug.ShouldStop(16384);
_mymap = RemoteObject.createNew ("B4IMap");Debug.locals.put("mymap", _mymap);
 BA.debugLineNum = 176;BA.debugLine="mymap.Initialize";
Debug.ShouldStop(32768);
_mymap.runVoidMethod ("Initialize");
 BA.debugLineNum = 178;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(131072);
{
final int step30 = 1;
final int limit30 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step30 > 0 && _i <= limit30) || (step30 < 0 && _i >= limit30) ;_i = ((int)(0 + _i + step30))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 179;BA.debugLine="map = list.Get(i)";
Debug.ShouldStop(262144);
_map = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("map", _map);
 BA.debugLineNum = 181;BA.debugLine="Dim dr,city,default,name=\"\" As String";
Debug.ShouldStop(1048576);
_dr = RemoteObject.createImmutable("");Debug.locals.put("dr", _dr);
_city = RemoteObject.createImmutable("");Debug.locals.put("city", _city);
_default = RemoteObject.createImmutable("");Debug.locals.put("default", _default);
_name = BA.ObjectToString("");Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 183;BA.debugLine="principalDireccion = map.Get(\"f_principal\")";
Debug.ShouldStop(4194304);
_principaldireccion = BA.numberCast(int.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal")))));Debug.locals.put("principalDireccion", _principaldireccion);
 BA.debugLineNum = 184;BA.debugLine="dr = funciones.base64_Decode(map.Get(\"f_direcc";
Debug.ShouldStop(8388608);
_dr = b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion1")))))));Debug.locals.put("dr", _dr);
 BA.debugLineNum = 185;BA.debugLine="city = \" ,\"&map.Get(\"f_sector_city\")";
Debug.ShouldStop(16777216);
_city = RemoteObject.concat(RemoteObject.createImmutable(" ,"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_sector_city")))));Debug.locals.put("city", _city);
 BA.debugLineNum = 186;BA.debugLine="name = map.Get(\"f_nombre_direccion\")";
Debug.ShouldStop(33554432);
_name = BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre_direccion")))));Debug.locals.put("name", _name);
 BA.debugLineNum = 189;BA.debugLine="If dr.Length > 40 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",_dr.runMethod(true,"Length"),BA.numberCast(double.class, 40))) { 
 BA.debugLineNum = 190;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
Debug.ShouldStop(536870912);
_dr = RemoteObject.concat(_dr.runMethod(true,"SubString2::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 40))),RemoteObject.createImmutable("..."));Debug.locals.put("dr", _dr);
 };
 BA.debugLineNum = 193;BA.debugLine="If principalDireccion == 1 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_principaldireccion,BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 195;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(4);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 197;BA.debugLine="default = \"Main address\"";
Debug.ShouldStop(16);
_default = BA.ObjectToString("Main address");Debug.locals.put("default", _default);
 }else {
 BA.debugLineNum = 201;BA.debugLine="default = \"Dirección principal\"";
Debug.ShouldStop(256);
_default = BA.ObjectToString("Dirección principal");Debug.locals.put("default", _default);
 };
 };
 BA.debugLineNum = 207;BA.debugLine="mymap.Clear";
Debug.ShouldStop(16384);
_mymap.runVoidMethod ("Clear");
 BA.debugLineNum = 209;BA.debugLine="mymap.Put(\"f_direccion\",dr)";
Debug.ShouldStop(65536);
_mymap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_direccion"))),(Object)((_dr)));
 BA.debugLineNum = 210;BA.debugLine="mymap.Put(\"f_principal\",default)";
Debug.ShouldStop(131072);
_mymap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_principal"))),(Object)((_default)));
 BA.debugLineNum = 211;BA.debugLine="mymap.Put(\"f_fecha\",map.Get(\"f_fecha\"))";
Debug.ShouldStop(262144);
_mymap.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_fecha"))),(Object)(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fecha"))))));
 BA.debugLineNum = 213;BA.debugLine="ListaDirecciones2.Add(CreateListItem(name&\": \"";
Debug.ShouldStop(1048576);
b4i_direcciones._listadirecciones2.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(RemoteObject.concat(_name,RemoteObject.createImmutable(": "),_dr,_city),BA.numberCast(long.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fecha"))))),_default,BA.numberCast(int.class, b4i_direcciones._listadirecciones2.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 80))))).getObject()),(Object)((_map)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 217;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(16777216);
b4i_direcciones._hud.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 219;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(67108864);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 220;BA.debugLine="BuscarEstados";
Debug.ShouldStop(134217728);
_buscarestados();
 }else {
 BA.debugLineNum = 222;BA.debugLine="BuscarProvincias";
Debug.ShouldStop(536870912);
_buscarprovincias();
 };
 break; }
case 1: {
 BA.debugLineNum = 227;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(4);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
 BA.debugLineNum = 229;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(16);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 230;BA.debugLine="Msgbox(\"Address registred.\" ,\"info\")";
Debug.ShouldStop(32);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Address registred.")),(Object)(RemoteObject.createImmutable("info")));
 BA.debugLineNum = 231;BA.debugLine="btnBackUsa_Click";
Debug.ShouldStop(64);
_btnbackusa_click();
 }else {
 BA.debugLineNum = 233;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\"";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Dirección registrada.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 234;BA.debugLine="btnBackRd_Click";
Debug.ShouldStop(512);
_btnbackrd_click();
 };
 }else {
 BA.debugLineNum = 239;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(16384);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 240;BA.debugLine="Msgbox(\"Error registering your address\",\"Erro";
Debug.ShouldStop(32768);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Error registering your address")),(Object)(RemoteObject.createImmutable("Error")));
 }else {
 BA.debugLineNum = 242;BA.debugLine="Msgbox(\"Error al registrar su dirección\",\"Err";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Error al registrar su dirección")),(Object)(RemoteObject.createImmutable("Error")));
 };
 };
 break; }
case 2: {
 BA.debugLineNum = 248;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(8388608);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 250;BA.debugLine="If list.Size <= 0 Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("k",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 251;BA.debugLine="Msgbox(\"No hay Estados en la BD\",\"Aviso!!\")";
Debug.ShouldStop(67108864);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("No hay Estados en la BD")),(Object)(RemoteObject.createImmutable("Aviso!!")));
 BA.debugLineNum = 252;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 255;BA.debugLine="estados.Initialize";
Debug.ShouldStop(1073741824);
b4i_direcciones._estados.runVoidMethod ("Initialize");
 BA.debugLineNum = 256;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(-2147483648);
{
final int step82 = 1;
final int limit82 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step82 > 0 && _i <= limit82) || (step82 < 0 && _i >= limit82) ;_i = ((int)(0 + _i + step82))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 258;BA.debugLine="Dim mapa As Map = list.Get(i)";
Debug.ShouldStop(2);
_mapa = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapa", _mapa);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 260;BA.debugLine="estados.Add( mapa.Get(\"f_descripcion\"))";
Debug.ShouldStop(8);
b4i_direcciones._estados.runVoidMethod ("Add:",(Object)(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 }
}Debug.locals.put("i", _i);
;
 break; }
case 3: {
 BA.debugLineNum = 266;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(512);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
 BA.debugLineNum = 268;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(2048);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 269;BA.debugLine="btnBackUsa_Click";
Debug.ShouldStop(4096);
_btnbackusa_click();
 BA.debugLineNum = 270;BA.debugLine="hud.ToastMessageShow(\"The address has deleted";
Debug.ShouldStop(8192);
b4i_direcciones._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("The address has deleted correctly!")),(Object)(b4i_main.__c.runMethod(true,"False")));
 }else {
 BA.debugLineNum = 273;BA.debugLine="btnBackRd_Click";
Debug.ShouldStop(65536);
_btnbackrd_click();
 BA.debugLineNum = 274;BA.debugLine="hud.ToastMessageShow(\"La dirección se ha elim";
Debug.ShouldStop(131072);
b4i_direcciones._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("La dirección se ha eliminado correctamente!")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 }else {
 BA.debugLineNum = 279;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(4194304);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 280;BA.debugLine="Msgbox(\"The address could not be deleted\",\"Er";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("The address could not be deleted")),(Object)(RemoteObject.createImmutable("Error")));
 }else {
 BA.debugLineNum = 282;BA.debugLine="Msgbox(\"La dirección no pudo ser eliminada\",\"";
Debug.ShouldStop(33554432);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("La dirección no pudo ser eliminada")),(Object)(RemoteObject.createImmutable("Error")));
 };
 };
 break; }
}
;
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listadirecciones_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListaDirecciones_ItemClick (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,330);
if (RapidSub.canDelegate("listadirecciones_itemclick")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","listadirecciones_itemclick", _index, _value);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 330;BA.debugLine="Sub ListaDirecciones_ItemClick (Index As Int, Valu";
Debug.ShouldStop(512);
 BA.debugLineNum = 332;BA.debugLine="Dim map As Map = Value";
Debug.ShouldStop(2048);
_map = (_value);Debug.locals.put("map", _map);Debug.locals.put("map", _map);
 BA.debugLineNum = 334;BA.debugLine="txtDireccion.Text = funciones.base64_Decode(map.G";
Debug.ShouldStop(8192);
b4i_direcciones._txtdireccion.runMethod(true,"setText:",b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion"))))))));
 BA.debugLineNum = 335;BA.debugLine="txtDireccion.Tag = map.Get(\"f_idrecord\")";
Debug.ShouldStop(16384);
b4i_direcciones._txtdireccion.runMethod(false,"setTag:",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 BA.debugLineNum = 336;BA.debugLine="mapadir = map";
Debug.ShouldStop(32768);
b4i_direcciones._mapadir = _map;
 BA.debugLineNum = 337;BA.debugLine="actualizar = True";
Debug.ShouldStop(65536);
b4i_direcciones._actualizar = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listadirecciones2_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListaDirecciones2_ItemClick (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,545);
if (RapidSub.canDelegate("listadirecciones2_itemclick")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","listadirecciones2_itemclick", _index, _value);}
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 545;BA.debugLine="Sub ListaDirecciones2_ItemClick (Index As Int, Val";
Debug.ShouldStop(1);
 BA.debugLineNum = 547;BA.debugLine="mapaEdit = Value";
Debug.ShouldStop(4);
b4i_direcciones._mapaedit = (_value);
 BA.debugLineNum = 549;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(16);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 550;BA.debugLine="Msgbox2(\"MsgEdit\",\"Do you want to edit this addr";
Debug.ShouldStop(32);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_direcciones.ba,(Object)(BA.ObjectToString("MsgEdit")),(Object)(BA.ObjectToString("Do you want to edit this address?")),(Object)(BA.ObjectToString("Question")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Yes")),(RemoteObject.createImmutable("No"))}))));
 }else {
 BA.debugLineNum = 552;BA.debugLine="Msgbox2(\"MsgEdit\",\"Desea editar esta dirección?\"";
Debug.ShouldStop(128);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_direcciones.ba,(Object)(BA.ObjectToString("MsgEdit")),(Object)(BA.ObjectToString("Desea editar esta dirección?")),(Object)(BA.ObjectToString("Aviso")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 };
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgdelete_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgDelete_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,603);
if (RapidSub.canDelegate("msgdelete_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","msgdelete_click", _buttontext);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdeletedir = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 603;BA.debugLine="Sub MsgDelete_Click(ButtonText As String)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 605;BA.debugLine="If ButtonText = \"Si\" Or ButtonText = \"Yes\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si")) || RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Yes"))) { 
 BA.debugLineNum = 607;BA.debugLine="Dim json As String";
Debug.ShouldStop(1073741824);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 608;BA.debugLine="json = \"'f_idrecord':\"&mapaEdit.Get(\"f_idrecord\"";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idrecord':"),b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 610;BA.debugLine="Dim JobDeleteDir As HttpJob";
Debug.ShouldStop(2);
_jobdeletedir = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDeleteDir", _jobdeletedir);
 BA.debugLineNum = 611;BA.debugLine="JobDeleteDir.Initialize(\"JobDeleteDir\",Me)";
Debug.ShouldStop(4);
_jobdeletedir.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_direcciones.ba,(Object)(BA.ObjectToString("JobDeleteDir")),(Object)(b4i_direcciones.getObject()));
 BA.debugLineNum = 612;BA.debugLine="JobDeleteDir.PostString(Main.url&\"ws/borrar_dire";
Debug.ShouldStop(8);
_jobdeletedir.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_direcciones._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("ws/borrar_direccion"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_direcciones._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_direcciones._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else 
{ BA.debugLineNum = 614;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 615;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 618;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgedit_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("MsgEdit_Click (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,557);
if (RapidSub.canDelegate("msgedit_click")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","msgedit_click", _buttontext);}
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 557;BA.debugLine="Sub MsgEdit_Click(ButtonText As String)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 559;BA.debugLine="If ButtonText = \"Si\" Or ButtonText = \"Yes\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si")) || RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Yes"))) { 
 BA.debugLineNum = 561;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(65536);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 563;BA.debugLine="edition = True";
Debug.ShouldStop(262144);
b4i_direcciones._edition = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 564;BA.debugLine="AddDireccion_Click";
Debug.ShouldStop(524288);
_adddireccion_click();
 BA.debugLineNum = 566;BA.debugLine="txtAddress1.Text = funciones.base64_Decode(mapa";
Debug.ShouldStop(2097152);
b4i_direcciones._txtaddress1.runMethod(true,"setText:",b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion1"))))))));
 BA.debugLineNum = 568;BA.debugLine="If funciones.base64_Decode(mapaEdit.Get(\"f_dire";
Debug.ShouldStop(8388608);
if (RemoteObject.solveBoolean("N",b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion2")))))))) && RemoteObject.solveBoolean("!",b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion2"))))))),BA.ObjectToString(""))) { 
 BA.debugLineNum = 569;BA.debugLine="txtAddress2.Text = funciones.base64_Decode(map";
Debug.ShouldStop(16777216);
b4i_direcciones._txtaddress2.runMethod(true,"setText:",b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion2"))))))));
 }else {
 BA.debugLineNum = 571;BA.debugLine="txtAddress2.Text = \"\"";
Debug.ShouldStop(67108864);
b4i_direcciones._txtaddress2.runMethod(true,"setText:",BA.ObjectToString(""));
 };
 BA.debugLineNum = 574;BA.debugLine="txtCity.Text = mapaEdit.Get(\"f_sector_city\")";
Debug.ShouldStop(536870912);
b4i_direcciones._txtcity.runMethod(true,"setText:",BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_sector_city"))))));
 BA.debugLineNum = 575;BA.debugLine="btnState.SelectedIndex = (mapaEdit.Get(\"f_state";
Debug.ShouldStop(1073741824);
b4i_direcciones._btnstate.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_state_provincia"))))),RemoteObject.createImmutable(1)}, "-",1, 0))));
 BA.debugLineNum = 576;BA.debugLine="txtZipCode.Text = mapaEdit.Get(\"f_zipcode\")";
Debug.ShouldStop(-2147483648);
b4i_direcciones._txtzipcode.runMethod(true,"setText:",BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_zipcode"))))));
 BA.debugLineNum = 577;BA.debugLine="chPrincipal.Value = mapaEdit.Get(\"f_principal\")";
Debug.ShouldStop(1);
b4i_direcciones._chprincipal.runMethod(true,"setValue:",BA.ObjectToBoolean(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal"))))));
 BA.debugLineNum = 578;BA.debugLine="actu = True";
Debug.ShouldStop(2);
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 579;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
Debug.ShouldStop(4);
b4i_direcciones._update = BA.numberCast(int.class, b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 }else {
 BA.debugLineNum = 583;BA.debugLine="edition = True";
Debug.ShouldStop(64);
b4i_direcciones._edition = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 584;BA.debugLine="AddDireccion_Click";
Debug.ShouldStop(128);
_adddireccion_click();
 BA.debugLineNum = 586;BA.debugLine="txtDireRD.Text = funciones.base64_Decode(mapaEd";
Debug.ShouldStop(512);
b4i_direcciones._txtdirerd.runMethod(true,"setText:",b4i_direcciones._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_direccion1"))))))));
 BA.debugLineNum = 588;BA.debugLine="txtSector.Text = mapaEdit.Get(\"f_sector_city\")";
Debug.ShouldStop(2048);
b4i_direcciones._txtsector.runMethod(true,"setText:",BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_sector_city"))))));
 BA.debugLineNum = 589;BA.debugLine="btnProvinciaCombo.SelectedIndex = (mapaEdit.Get";
Debug.ShouldStop(4096);
b4i_direcciones._btnprovinciacombo.runClassMethod (b4i_b4xcombobox.class, "_setselectedindex:" /*RemoteObject*/ ,BA.numberCast(int.class, (RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_state_provincia"))))),RemoteObject.createImmutable(1)}, "-",1, 0))));
 BA.debugLineNum = 590;BA.debugLine="txtZipCodeRD.Text = mapaEdit.Get(\"f_zipcode\")";
Debug.ShouldStop(8192);
b4i_direcciones._txtzipcoderd.runMethod(true,"setText:",BA.ObjectToString(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_zipcode"))))));
 BA.debugLineNum = 591;BA.debugLine="chPrincipalRD.Value = mapaEdit.Get(\"f_principal";
Debug.ShouldStop(16384);
b4i_direcciones._chprincipalrd.runMethod(true,"setValue:",BA.ObjectToBoolean(b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_principal"))))));
 BA.debugLineNum = 592;BA.debugLine="actu = True";
Debug.ShouldStop(32768);
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 593;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
Debug.ShouldStop(65536);
b4i_direcciones._update = BA.numberCast(int.class, b4i_direcciones._mapaedit.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));
 };
 }else 
{ BA.debugLineNum = 597;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 598;BA.debugLine="Return";
Debug.ShouldStop(2097152);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
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
		Debug.PushSubsStack("NombreDireccion (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,783);
if (RapidSub.canDelegate("nombredireccion")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","nombredireccion");}
 BA.debugLineNum = 783;BA.debugLine="Sub NombreDireccion";
Debug.ShouldStop(16384);
 BA.debugLineNum = 785;BA.debugLine="PanelFondoNombreDir.SetAlphaAnimated(0,0)";
Debug.ShouldStop(65536);
b4i_direcciones._panelfondonombredir.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 0)));
 BA.debugLineNum = 786;BA.debugLine="PanelFondoNombreDir.Top = 0%y";
Debug.ShouldStop(131072);
b4i_direcciones._panelfondonombredir.runMethod(true,"setTop:",b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 787;BA.debugLine="PanelFondoNombreDir.Left = 0%x";
Debug.ShouldStop(262144);
b4i_direcciones._panelfondonombredir.runMethod(true,"setLeft:",b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0))));
 BA.debugLineNum = 789;BA.debugLine="If Main.IsUsa Then";
Debug.ShouldStop(1048576);
if (b4i_direcciones._main._isusa /*RemoteObject*/ .getBoolean()) { 
 BA.debugLineNum = 790;BA.debugLine="Label16.Text = \"Name of the address\"";
Debug.ShouldStop(2097152);
b4i_direcciones._label16.runMethod(true,"setText:",BA.ObjectToString("Name of the address"));
 BA.debugLineNum = 791;BA.debugLine="txtNombreDireccion.Text = \"\"";
Debug.ShouldStop(4194304);
b4i_direcciones._txtnombredireccion.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 792;BA.debugLine="txtNombreDireccion.HintText = \"Name of the addre";
Debug.ShouldStop(8388608);
b4i_direcciones._txtnombredireccion.runMethod(true,"setHintText:",BA.ObjectToString("Name of the address"));
 }else {
 BA.debugLineNum = 794;BA.debugLine="Label16.Text = \"Nombre de la dirección\"";
Debug.ShouldStop(33554432);
b4i_direcciones._label16.runMethod(true,"setText:",BA.ObjectToString("Nombre de la dirección"));
 BA.debugLineNum = 795;BA.debugLine="txtNombreDireccion.Text = \"\"";
Debug.ShouldStop(67108864);
b4i_direcciones._txtnombredireccion.runMethod(true,"setText:",BA.ObjectToString(""));
 BA.debugLineNum = 796;BA.debugLine="txtNombreDireccion.HintText = \"Nombre de la dire";
Debug.ShouldStop(134217728);
b4i_direcciones._txtnombredireccion.runMethod(true,"setHintText:",BA.ObjectToString("Nombre de la dirección"));
 };
 BA.debugLineNum = 799;BA.debugLine="PanelFondoNombreDir.SetAlphaAnimated(500,1)";
Debug.ShouldStop(1073741824);
b4i_direcciones._panelfondonombredir.runVoidMethod ("SetAlphaAnimated::",(Object)(BA.numberCast(int.class, 500)),(Object)(BA.numberCast(float.class, 1)));
 BA.debugLineNum = 803;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 8;BA.debugLine="Dim mapadir As Map";
b4i_direcciones._mapadir = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 9;BA.debugLine="Dim actualizar As Boolean = False";
b4i_direcciones._actualizar = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 10;BA.debugLine="Dim toped As Int";
b4i_direcciones._toped = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 11;BA.debugLine="Dim topedLbl As Int";
b4i_direcciones._topedlbl = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 13;BA.debugLine="Dim estados As List";
b4i_direcciones._estados = RemoteObject.createNew ("B4IList");
 //BA.debugLineNum = 14;BA.debugLine="Dim actu As Boolean = False";
b4i_direcciones._actu = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 15;BA.debugLine="Dim update As Int = 0";
b4i_direcciones._update = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 16;BA.debugLine="Dim indexCombo As Int = 0";
b4i_direcciones._indexcombo = BA.numberCast(int.class, 0);
 //BA.debugLineNum = 17;BA.debugLine="Dim edition As Boolean = False";
b4i_direcciones._edition = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 18;BA.debugLine="Dim reload As Boolean = False";
b4i_direcciones._reload = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 20;BA.debugLine="Dim mapaEdit As Map";
b4i_direcciones._mapaedit = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 21;BA.debugLine="Dim topMarco As Int";
b4i_direcciones._topmarco = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 22;BA.debugLine="Dim toplblAdres2 As Int";
b4i_direcciones._toplbladres2 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 23;BA.debugLine="Dim topadres As Int";
b4i_direcciones._topadres = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 24;BA.debugLine="Dim toplbl6 As Int";
b4i_direcciones._toplbl6 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 25;BA.debugLine="Dim toptxtCity As Int";
b4i_direcciones._toptxtcity = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 26;BA.debugLine="Dim toplbl7 As Int";
b4i_direcciones._toplbl7 = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 27;BA.debugLine="Dim topbtnstate As Int";
b4i_direcciones._topbtnstate = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 29;BA.debugLine="Dim TOPlblZip As Int";
b4i_direcciones._toplblzip = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 30;BA.debugLine="Dim TOPtxtZip As Int";
b4i_direcciones._toptxtzip = RemoteObject.createImmutable(0);
 //BA.debugLineNum = 35;BA.debugLine="Private hud As HUD";
b4i_direcciones._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 36;BA.debugLine="Private pageDirecciones As Page";
b4i_direcciones._pagedirecciones = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 37;BA.debugLine="Private Panel2 As Panel";
b4i_direcciones._panel2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private ListaDirecciones As CustomListView";
b4i_direcciones._listadirecciones = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 39;BA.debugLine="Private lblDir As Label";
b4i_direcciones._lbldir = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private lblFecha As Label";
b4i_direcciones._lblfecha = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private lblPrincipal As Label";
b4i_direcciones._lblprincipal = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="Private btnDireccionBack As Button";
b4i_direcciones._btndireccionback = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 43;BA.debugLine="Private btnSalvarDireccion As Button";
b4i_direcciones._btnsalvardireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 44;BA.debugLine="Private chPrincipal As Switch";
b4i_direcciones._chprincipal = RemoteObject.createNew ("B4ISwitchWrapper");
 //BA.debugLineNum = 45;BA.debugLine="Private Label3 As Label";
b4i_direcciones._label3 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 46;BA.debugLine="Private Label2 As Label";
b4i_direcciones._label2 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 47;BA.debugLine="Private txtDireccion As TextView";
b4i_direcciones._txtdireccion = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 48;BA.debugLine="Private PanelEncabezadoDir2 As Panel";
b4i_direcciones._panelencabezadodir2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 49;BA.debugLine="Private Panel2V2 As Panel";
b4i_direcciones._panel2v2 = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 50;BA.debugLine="Private AddDireccion As Button";
b4i_direcciones._adddireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 51;BA.debugLine="Private BorrarDireccion As Button";
b4i_direcciones._borrardireccion = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 52;BA.debugLine="Private ListaDirecciones2 As CustomListView";
b4i_direcciones._listadirecciones2 = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 53;BA.debugLine="Private btnDireccionBack2 As Button";
b4i_direcciones._btndireccionback2 = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 54;BA.debugLine="Private btnState As B4XComboBox";
b4i_direcciones._btnstate = RemoteObject.createNew ("b4i_b4xcombobox");
 //BA.debugLineNum = 55;BA.debugLine="Private PanelFondoDireccionesUSA As Panel";
b4i_direcciones._panelfondodireccionesusa = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 56;BA.debugLine="Private btnBackUsa As Button";
b4i_direcciones._btnbackusa = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 57;BA.debugLine="Private txtAddress1 As TextView";
b4i_direcciones._txtaddress1 = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 58;BA.debugLine="Private txtAddress2 As TextView";
b4i_direcciones._txtaddress2 = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 59;BA.debugLine="Private txtCity As TextField";
b4i_direcciones._txtcity = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 60;BA.debugLine="Private BtnAgregarDireccionFinal As Button";
b4i_direcciones._btnagregardireccionfinal = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 61;BA.debugLine="Private txtZipCode As TextField";
b4i_direcciones._txtzipcode = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 62;BA.debugLine="Private btnDeleteUsa As Button";
b4i_direcciones._btndeleteusa = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 63;BA.debugLine="Private PanelMarcoDirRD As Panel";
b4i_direcciones._panelmarcodirrd = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 64;BA.debugLine="Private PanelFondoDireccionesRD As Panel";
b4i_direcciones._panelfondodireccionesrd = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 66;BA.debugLine="Private btnProvinciaCombo As B4XComboBox";
b4i_direcciones._btnprovinciacombo = RemoteObject.createNew ("b4i_b4xcombobox");
 //BA.debugLineNum = 67;BA.debugLine="Private btnBackRd As Button";
b4i_direcciones._btnbackrd = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 68;BA.debugLine="Private PanelEncabezadoRD As Panel";
b4i_direcciones._panelencabezadord = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 69;BA.debugLine="Private txtDireRD As TextView";
b4i_direcciones._txtdirerd = RemoteObject.createNew ("B4ITextViewWrapper");
 //BA.debugLineNum = 70;BA.debugLine="Private txtSector As TextField";
b4i_direcciones._txtsector = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 71;BA.debugLine="Private txtZipCodeRD As TextField";
b4i_direcciones._txtzipcoderd = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 72;BA.debugLine="Private btnAgregarDirRD As Button";
b4i_direcciones._btnagregardirrd = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 73;BA.debugLine="Private chPrincipalRD As Switch";
b4i_direcciones._chprincipalrd = RemoteObject.createNew ("B4ISwitchWrapper");
 //BA.debugLineNum = 74;BA.debugLine="Private PanelEncabezadoUsa As Panel";
b4i_direcciones._panelencabezadousa = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 75;BA.debugLine="Private btnDeleteRD As Button";
b4i_direcciones._btndeleterd = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 76;BA.debugLine="Private Label5 As Label";
b4i_direcciones._label5 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 77;BA.debugLine="Private Label6 As Label";
b4i_direcciones._label6 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 78;BA.debugLine="Private Label7 As Label";
b4i_direcciones._label7 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 79;BA.debugLine="Private PanelComboUSA As Panel";
b4i_direcciones._panelcombousa = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 80;BA.debugLine="Private Label8 As Label";
b4i_direcciones._label8 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 81;BA.debugLine="Private panelZipCode As Panel";
b4i_direcciones._panelzipcode = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 82;BA.debugLine="Private PanelFondoNombreDir As Panel";
b4i_direcciones._panelfondonombredir = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 83;BA.debugLine="Private Label16 As Label";
b4i_direcciones._label16 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 84;BA.debugLine="Private txtNombreDireccion As TextField";
b4i_direcciones._txtnombredireccion = RemoteObject.createNew ("B4ITextFieldWrapper");
 //BA.debugLineNum = 85;BA.debugLine="Private btnAceptarNombreDir As Button";
b4i_direcciones._btnaceptarnombredir = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _txtdireccion_beginedit() throws Exception{
try {
		Debug.PushSubsStack("txtDireccion_BeginEdit (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,378);
if (RapidSub.canDelegate("txtdireccion_beginedit")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtdireccion_beginedit");}
 BA.debugLineNum = 378;BA.debugLine="Sub txtDireccion_BeginEdit";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 381;BA.debugLine="Panel2.Visible = False";
Debug.ShouldStop(268435456);
b4i_direcciones._panel2.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 382;BA.debugLine="topedLbl = Label3.Top";
Debug.ShouldStop(536870912);
b4i_direcciones._topedlbl = BA.numberCast(int.class, b4i_direcciones._label3.runMethod(true,"Top"));
 BA.debugLineNum = 383;BA.debugLine="toped  = txtDireccion.Top";
Debug.ShouldStop(1073741824);
b4i_direcciones._toped = BA.numberCast(int.class, b4i_direcciones._txtdireccion.runMethod(true,"Top"));
 BA.debugLineNum = 385;BA.debugLine="Label3.Top = Label2.Top + 45dip";
Debug.ShouldStop(1);
b4i_direcciones._label3.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label2.runMethod(true,"Top"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 45)))}, "+",1, 0)));
 BA.debugLineNum = 386;BA.debugLine="txtDireccion.Top =  Label3.Top +  28dip";
Debug.ShouldStop(2);
b4i_direcciones._txtdireccion.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 28)))}, "+",1, 0)));
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtdireccion_endedit() throws Exception{
try {
		Debug.PushSubsStack("txtDireccion_EndEdit (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,390);
if (RapidSub.canDelegate("txtdireccion_endedit")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtdireccion_endedit");}
 BA.debugLineNum = 390;BA.debugLine="Sub txtDireccion_EndEdit";
Debug.ShouldStop(32);
 BA.debugLineNum = 392;BA.debugLine="Panel2.Visible = True";
Debug.ShouldStop(128);
b4i_direcciones._panel2.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 393;BA.debugLine="Label3.Top = topedLbl";
Debug.ShouldStop(256);
b4i_direcciones._label3.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._topedlbl));
 BA.debugLineNum = 394;BA.debugLine="txtDireccion.Top = toped";
Debug.ShouldStop(512);
b4i_direcciones._txtdireccion.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._toped));
 BA.debugLineNum = 396;BA.debugLine="pageDirecciones.ResignFocus";
Debug.ShouldStop(2048);
b4i_direcciones._pagedirecciones.runVoidMethod ("ResignFocus");
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtdireccion_textchanged(RemoteObject _oldtext,RemoteObject _newtext) throws Exception{
try {
		Debug.PushSubsStack("txtDireccion_TextChanged (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,400);
if (RapidSub.canDelegate("txtdireccion_textchanged")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtdireccion_textchanged", _oldtext, _newtext);}
Debug.locals.put("OldText", _oldtext);
Debug.locals.put("NewText", _newtext);
 BA.debugLineNum = 400;BA.debugLine="Sub txtDireccion_TextChanged (OldText As String, N";
Debug.ShouldStop(32768);
 BA.debugLineNum = 402;BA.debugLine="If NewText.Contains(Chr(10)) Then";
Debug.ShouldStop(131072);
if (_newtext.runMethod(true,"Contains:",(Object)(BA.CharToString(b4i_main.__c.runMethod(true,"Chr:",(Object)(BA.numberCast(int.class, 10)))))).getBoolean()) { 
 BA.debugLineNum = 403;BA.debugLine="txtDireccion_EndEdit";
Debug.ShouldStop(262144);
_txtdireccion_endedit();
 };
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcode_beginedit() throws Exception{
try {
		Debug.PushSubsStack("txtZipCode_BeginEdit (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,620);
if (RapidSub.canDelegate("txtzipcode_beginedit")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcode_beginedit");}
 BA.debugLineNum = 620;BA.debugLine="Sub txtZipCode_BeginEdit";
Debug.ShouldStop(2048);
 BA.debugLineNum = 622;BA.debugLine="Label3.Visible = False";
Debug.ShouldStop(8192);
b4i_direcciones._label3.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 623;BA.debugLine="txtAddress1.Visible = False";
Debug.ShouldStop(16384);
b4i_direcciones._txtaddress1.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"False"));
 BA.debugLineNum = 625;BA.debugLine="toplblAdres2 = Label5.Top";
Debug.ShouldStop(65536);
b4i_direcciones._toplbladres2 = BA.numberCast(int.class, b4i_direcciones._label5.runMethod(true,"Top"));
 BA.debugLineNum = 627;BA.debugLine="Label5.Top = Label3.Top * 0.8";
Debug.ShouldStop(262144);
b4i_direcciones._label5.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(0.8)}, "*",0, 0)));
 BA.debugLineNum = 629;BA.debugLine="topadres = txtAddress2.Top";
Debug.ShouldStop(1048576);
b4i_direcciones._topadres = BA.numberCast(int.class, b4i_direcciones._txtaddress2.runMethod(true,"Top"));
 BA.debugLineNum = 631;BA.debugLine="txtAddress2.Top = Label3.Top *1.2";
Debug.ShouldStop(4194304);
b4i_direcciones._txtaddress2.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(1.2)}, "*",0, 0)));
 BA.debugLineNum = 633;BA.debugLine="toplbl6 = Label6.Top";
Debug.ShouldStop(16777216);
b4i_direcciones._toplbl6 = BA.numberCast(int.class, b4i_direcciones._label6.runMethod(true,"Top"));
 BA.debugLineNum = 634;BA.debugLine="toptxtCity = txtCity.Top";
Debug.ShouldStop(33554432);
b4i_direcciones._toptxtcity = BA.numberCast(int.class, b4i_direcciones._txtcity.runMethod(true,"Top"));
 BA.debugLineNum = 637;BA.debugLine="Label6.Top = Label3.Top * 2.3";
Debug.ShouldStop(268435456);
b4i_direcciones._label6.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(2.3)}, "*",0, 0)));
 BA.debugLineNum = 639;BA.debugLine="txtCity.Top = Label3.Top * 2.8";
Debug.ShouldStop(1073741824);
b4i_direcciones._txtcity.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(2.8)}, "*",0, 0)));
 BA.debugLineNum = 641;BA.debugLine="toplbl7 = Label7.Top";
Debug.ShouldStop(1);
b4i_direcciones._toplbl7 = BA.numberCast(int.class, b4i_direcciones._label7.runMethod(true,"Top"));
 BA.debugLineNum = 642;BA.debugLine="topbtnstate = PanelComboUSA.Top";
Debug.ShouldStop(2);
b4i_direcciones._topbtnstate = BA.numberCast(int.class, b4i_direcciones._panelcombousa.runMethod(true,"Top"));
 BA.debugLineNum = 645;BA.debugLine="Label7.Top = Label3.Top * 3.5";
Debug.ShouldStop(16);
b4i_direcciones._label7.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(3.5)}, "*",0, 0)));
 BA.debugLineNum = 646;BA.debugLine="PanelComboUSA.Top = Label3.Top * 3.9";
Debug.ShouldStop(32);
b4i_direcciones._panelcombousa.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(3.9)}, "*",0, 0)));
 BA.debugLineNum = 648;BA.debugLine="TOPtxtZip = panelZipCode.Top";
Debug.ShouldStop(128);
b4i_direcciones._toptxtzip = BA.numberCast(int.class, b4i_direcciones._panelzipcode.runMethod(true,"Top"));
 BA.debugLineNum = 650;BA.debugLine="panelZipCode.Top = Label3.Top * 4.8";
Debug.ShouldStop(512);
b4i_direcciones._panelzipcode.runMethod(true,"setTop:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_direcciones._label3.runMethod(true,"Top"),RemoteObject.createImmutable(4.8)}, "*",0, 0)));
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
public static RemoteObject  _txtzipcode_endedit() throws Exception{
try {
		Debug.PushSubsStack("txtZipCode_EndEdit (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,656);
if (RapidSub.canDelegate("txtzipcode_endedit")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcode_endedit");}
 BA.debugLineNum = 656;BA.debugLine="Sub txtZipCode_EndEdit";
Debug.ShouldStop(32768);
 BA.debugLineNum = 658;BA.debugLine="Label3.Visible = True";
Debug.ShouldStop(131072);
b4i_direcciones._label3.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 659;BA.debugLine="txtAddress1.Visible = True";
Debug.ShouldStop(262144);
b4i_direcciones._txtaddress1.runMethod(true,"setVisible:",b4i_main.__c.runMethod(true,"True"));
 BA.debugLineNum = 661;BA.debugLine="Label5.Top = toplblAdres2";
Debug.ShouldStop(1048576);
b4i_direcciones._label5.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._toplbladres2));
 BA.debugLineNum = 662;BA.debugLine="txtAddress2.Top = topadres";
Debug.ShouldStop(2097152);
b4i_direcciones._txtaddress2.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._topadres));
 BA.debugLineNum = 663;BA.debugLine="Label6.Top = toplbl6";
Debug.ShouldStop(4194304);
b4i_direcciones._label6.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._toplbl6));
 BA.debugLineNum = 664;BA.debugLine="txtCity.Top = toptxtCity";
Debug.ShouldStop(8388608);
b4i_direcciones._txtcity.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._toptxtcity));
 BA.debugLineNum = 665;BA.debugLine="Label7.Top = toplbl7";
Debug.ShouldStop(16777216);
b4i_direcciones._label7.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._toplbl7));
 BA.debugLineNum = 666;BA.debugLine="PanelComboUSA.Top = topbtnstate";
Debug.ShouldStop(33554432);
b4i_direcciones._panelcombousa.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._topbtnstate));
 BA.debugLineNum = 667;BA.debugLine="panelZipCode.Top = TOPtxtZip";
Debug.ShouldStop(67108864);
b4i_direcciones._panelzipcode.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._toptxtzip));
 BA.debugLineNum = 669;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcoderd_beginedit() throws Exception{
try {
		Debug.PushSubsStack("txtZipCodeRD_BeginEdit (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,757);
if (RapidSub.canDelegate("txtzipcoderd_beginedit")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcoderd_beginedit");}
 BA.debugLineNum = 757;BA.debugLine="Sub txtZipCodeRD_BeginEdit";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 759;BA.debugLine="topMarco = PanelMarcoDirRD.Top";
Debug.ShouldStop(4194304);
b4i_direcciones._topmarco = BA.numberCast(int.class, b4i_direcciones._panelmarcodirrd.runMethod(true,"Top"));
 BA.debugLineNum = 760;BA.debugLine="PanelMarcoDirRD.Top = PanelFondoDireccionesRD.Top";
Debug.ShouldStop(8388608);
b4i_direcciones._panelmarcodirrd.runMethod(true,"setTop:",b4i_direcciones._panelfondodireccionesrd.runMethod(true,"Top"));
 BA.debugLineNum = 762;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _txtzipcoderd_endedit() throws Exception{
try {
		Debug.PushSubsStack("txtZipCodeRD_EndEdit (direcciones) ","direcciones",6,b4i_direcciones.ba,b4i_direcciones.mostCurrent,764);
if (RapidSub.canDelegate("txtzipcoderd_endedit")) { return b4i_direcciones.remoteMe.runUserSub(false, "direcciones","txtzipcoderd_endedit");}
 BA.debugLineNum = 764;BA.debugLine="Sub txtZipCodeRD_EndEdit";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 765;BA.debugLine="PanelMarcoDirRD.Top = topMarco";
Debug.ShouldStop(268435456);
b4i_direcciones._panelmarcodirrd.runMethod(true,"setTop:",BA.numberCast(float.class, b4i_direcciones._topmarco));
 BA.debugLineNum = 766;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}