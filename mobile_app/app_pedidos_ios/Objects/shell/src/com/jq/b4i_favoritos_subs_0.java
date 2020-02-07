package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_favoritos_subs_0 {


public static void  _btnagregarcarritodetalle_click() throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,232);
if (RapidSub.canDelegate("btnagregarcarritodetalle_click")) { b4i_favoritos.remoteMe.runUserSub(false, "favoritos","btnagregarcarritodetalle_click"); return;}
ResumableSub_btnagregarCarritoDetalle_Click rsub = new ResumableSub_btnagregarCarritoDetalle_Click(null);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_btnagregarCarritoDetalle_Click extends BA.ResumableSub {
public ResumableSub_btnagregarCarritoDetalle_Click(b4i_favoritos parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
b4i_favoritos parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,232);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 234;BA.debugLine="If mapadetalle.Get(\"f_precio\") <= 0 Then";
Debug.ShouldStop(512);
if (true) break;

case 1:
//if
this.state = 6;
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, parent._mapadetalle.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, 0))) { 
this.state = 3;
}else {
this.state = 5;
}if (true) break;

case 3:
//C
this.state = 6;
 BA.debugLineNum = 235;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
Debug.ShouldStop(1024);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este")),(Object)(RemoteObject.createImmutable("Aviso")));
 if (true) break;

case 5:
//C
this.state = 6;
 BA.debugLineNum = 239;BA.debugLine="salvar_detalle_temporal(mapadetalle,lblcantidad.";
Debug.ShouldStop(16384);
_salvar_detalle_temporal(parent._mapadetalle,BA.numberCast(int.class, parent._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 240;BA.debugLine="Sleep(200)";
Debug.ShouldStop(32768);
b4i_main.__c.runVoidMethod ("Sleep:::",b4i_favoritos.ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "favoritos", "btnagregarcarritodetalle_click"),BA.numberCast(int.class, 200));
this.state = 7;
return;
case 7:
//C
this.state = 6;
;
 BA.debugLineNum = 241;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(65536);
_btnbackdetalles_click();
 if (true) break;

case 6:
//C
this.state = -1;
;
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.ShouldStop(1048576);
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
public static RemoteObject  _btnbackdetalles_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackDetalles_Click (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,247);
if (RapidSub.canDelegate("btnbackdetalles_click")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","btnbackdetalles_click");}
 BA.debugLineNum = 247;BA.debugLine="Sub btnBackDetalles_Click";
Debug.ShouldStop(4194304);
 BA.debugLineNum = 248;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(8388608);
b4i_favoritos._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 249;BA.debugLine="Main.NavControl.ShowPage(pageFv)";
Debug.ShouldStop(16777216);
b4i_favoritos._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_favoritos._pagefv).getObject())));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackfavoritos_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackFavoritos_Click (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,61);
if (RapidSub.canDelegate("btnbackfavoritos_click")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","btnbackfavoritos_click");}
 BA.debugLineNum = 61;BA.debugLine="Sub btnBackFavoritos_Click";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 63;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(1073741824);
b4i_favoritos._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 64;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(-2147483648);
b4i_favoritos._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 66;BA.debugLine="If actuCantidad Then";
Debug.ShouldStop(2);
if (b4i_favoritos._actucantidad.getBoolean()) { 
 BA.debugLineNum = 67;BA.debugLine="actuCantidad = False";
Debug.ShouldStop(4);
b4i_favoritos._actucantidad = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 68;BA.debugLine="Main.actualizarCantidad";
Debug.ShouldStop(8);
b4i_favoritos._main.runVoidMethod ("_actualizarcantidad" /*RemoteObject*/ );
 };
 BA.debugLineNum = 71;BA.debugLine="If actu Then";
Debug.ShouldStop(64);
if (b4i_favoritos._actu.getBoolean()) { 
 BA.debugLineNum = 72;BA.debugLine="actu = False";
Debug.ShouldStop(128);
b4i_favoritos._actu = b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 73;BA.debugLine="Main.actualizar";
Debug.ShouldStop(256);
b4i_favoritos._main.runVoidMethod ("_actualizar" /*RemoteObject*/ );
 };
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarlistafavoritos() throws Exception{
try {
		Debug.PushSubsStack("cargarListaFavoritos (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,148);
if (RapidSub.canDelegate("cargarlistafavoritos")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","cargarlistafavoritos");}
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
int _i = 0;
RemoteObject _mapalist = RemoteObject.declareNull("B4IMap");
 BA.debugLineNum = 148;BA.debugLine="Sub cargarListaFavoritos";
Debug.ShouldStop(524288);
 BA.debugLineNum = 150;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(2097152);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 151;BA.debugLine="LlistaFavoritos.Clear";
Debug.ShouldStop(4194304);
b4i_favoritos._llistafavoritos.runClassMethod (b4i_customlistview.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 152;BA.debugLine="lblCantProductos.Text = \"Productos Favoritos: \"&M";
Debug.ShouldStop(8388608);
b4i_favoritos._lblcantproductos.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("Productos Favoritos: "),b4i_favoritos._militafav.runMethod(true,"Size")));
 BA.debugLineNum = 153;BA.debugLine="For i = 0 To MilitaFav.Size-1";
Debug.ShouldStop(16777216);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {b4i_favoritos._militafav.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 154;BA.debugLine="Dim mapalist As Map";
Debug.ShouldStop(33554432);
_mapalist = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapalist", _mapalist);
 BA.debugLineNum = 155;BA.debugLine="mapalist = MilitaFav.Get(i)";
Debug.ShouldStop(67108864);
_mapalist = (b4i_favoritos._militafav.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapalist", _mapalist);
 BA.debugLineNum = 158;BA.debugLine="If  mapalist.Get(\"f_foto\")<> Null And  mapalist.";
Debug.ShouldStop(536870912);
if (RemoteObject.solveBoolean("N",_mapalist.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapalist.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 159;BA.debugLine="bm = funciones.getImagen(mapalist.Get(\"f_foto\")";
Debug.ShouldStop(1073741824);
_bm = b4i_favoritos._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapalist.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 161;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(1);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 164;BA.debugLine="mapalist.Put(\"f_red\",True)";
Debug.ShouldStop(8);
_mapalist.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 166;BA.debugLine="LlistaFavoritos.Add(CreateListItem(mapalist.Get(";
Debug.ShouldStop(32);
b4i_favoritos._llistafavoritos.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(BA.ObjectToString(_mapalist.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))),RemoteObject.concat(RemoteObject.createImmutable("Precio: "),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapalist.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))),_bm,BA.numberCast(int.class, b4i_favoritos._llistafavoritos.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_mapalist)));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject _nombre,RemoteObject _cantidad,RemoteObject _img,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,172);
if (RapidSub.canDelegate("createlistitem")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","createlistitem", _nombre, _cantidad, _img, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("img", _img);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 172;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As S";
Debug.ShouldStop(2048);
 BA.debugLineNum = 174;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(8192);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 175;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(16384);
_p.runVoidMethod ("Initialize::",b4i_favoritos.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 176;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(32768);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 177;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
Debug.ShouldStop(65536);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPanelesItems")),b4i_favoritos.ba);
 BA.debugLineNum = 178;BA.debugLine="lblNomCat.Text = Nombre";
Debug.ShouldStop(131072);
b4i_favoritos._lblnomcat.runMethod(true,"setText:",_nombre);
 BA.debugLineNum = 179;BA.debugLine="lblCantCat.Text = cantidad";
Debug.ShouldStop(262144);
b4i_favoritos._lblcantcat.runMethod(true,"setText:",_cantidad);
 BA.debugLineNum = 180;BA.debugLine="imgCat.Bitmap = img";
Debug.ShouldStop(524288);
b4i_favoritos._imgcat.runMethod(false,"setBitmap:",_img);
 BA.debugLineNum = 181;BA.debugLine="Return p";
Debug.ShouldStop(1048576);
if (true) return _p;
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imgdetallefav_click() throws Exception{
try {
		Debug.PushSubsStack("imgdetallefav_Click (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,257);
if (RapidSub.canDelegate("imgdetallefav_click")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","imgdetallefav_click");}
 BA.debugLineNum = 257;BA.debugLine="Sub imgdetallefav_Click";
Debug.ShouldStop(1);
 BA.debugLineNum = 259;BA.debugLine="Msgbox2(\"msgEliminar\",\"Seguro que quiere quitar e";
Debug.ShouldStop(4);
b4i_main.__c.runMethodAndSync(false,"Msgbox2:::::",b4i_favoritos.ba,(Object)(BA.ObjectToString("msgEliminar")),(Object)(BA.ObjectToString("Seguro que quiere quitar este producto de sus favoritos?")),(Object)(BA.ObjectToString("Aviso!!")),(Object)(BA.ArrayToList(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {RemoteObject.createImmutable(("Si")),(RemoteObject.createImmutable("No"))}))));
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initilize() throws Exception{
try {
		Debug.PushSubsStack("Initilize (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,41);
if (RapidSub.canDelegate("initilize")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","initilize");}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobfavoritos = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 41;BA.debugLine="Sub Initilize";
Debug.ShouldStop(256);
 BA.debugLineNum = 43;BA.debugLine="pageFv.Initialize(\"pageFv\")";
Debug.ShouldStop(1024);
b4i_favoritos._pagefv.runVoidMethod ("Initialize::",b4i_favoritos.ba,(Object)(RemoteObject.createImmutable("pageFv")));
 BA.debugLineNum = 44;BA.debugLine="pageFv.RootPanel.LoadLayout(\"frmFavoritos\")";
Debug.ShouldStop(2048);
b4i_favoritos._pagefv.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmFavoritos")),b4i_favoritos.ba);
 BA.debugLineNum = 45;BA.debugLine="Main.NavControl.ShowPage(pageFv)";
Debug.ShouldStop(4096);
b4i_favoritos._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage:",(Object)(((b4i_favoritos._pagefv).getObject())));
 BA.debugLineNum = 47;BA.debugLine="pagedetalle.Initialize(\"pagedetalle\")";
Debug.ShouldStop(16384);
b4i_favoritos._pagedetalle.runVoidMethod ("Initialize::",b4i_favoritos.ba,(Object)(RemoteObject.createImmutable("pagedetalle")));
 BA.debugLineNum = 49;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
Debug.ShouldStop(65536);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_favoritos._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idempresa':"),b4i_favoritos._main._idempresa /*RemoteObject*/ );Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 51;BA.debugLine="Dim jobFavoritos As HttpJob";
Debug.ShouldStop(262144);
_jobfavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("jobFavoritos", _jobfavoritos);
 BA.debugLineNum = 52;BA.debugLine="jobFavoritos.Initialize(\"RefreshFavoritos\",Me)";
Debug.ShouldStop(524288);
_jobfavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_favoritos.ba,(Object)(BA.ObjectToString("RefreshFavoritos")),(Object)(b4i_favoritos.getObject()));
 BA.debugLineNum = 53;BA.debugLine="hud.ToastMessageShow(\"Cargando sus Favoritos\",Fal";
Debug.ShouldStop(1048576);
b4i_favoritos._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Cargando sus Favoritos")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="MilitaFav.Initialize";
Debug.ShouldStop(2097152);
b4i_favoritos._militafav.runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="jobFavoritos.PostString(Main.url&\"puntoventa/busc";
Debug.ShouldStop(4194304);
_jobfavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_favoritos._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/buscarfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_favoritos._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_favoritos._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 57;BA.debugLine="Main.smc.Tag = \"favoritos\"";
Debug.ShouldStop(16777216);
b4i_favoritos._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("favoritos")));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
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
		Debug.PushSubsStack("JobDone (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,78);
if (RapidSub.canDelegate("jobdone")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
int _i = 0;
RemoteObject _mapadel = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 78;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(8192);
 BA.debugLineNum = 81;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 82;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(131072);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_favoritos._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_favoritos._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="Return";
Debug.ShouldStop(262144);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 86;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",b4i_favoritos._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 87;BA.debugLine="Return";
Debug.ShouldStop(4194304);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 90;BA.debugLine="Dim map As Map";
Debug.ShouldStop(33554432);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 91;BA.debugLine="Dim list As List";
Debug.ShouldStop(67108864);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 92;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(134217728);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 93;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
Debug.ShouldStop(268435456);
_json.runVoidMethod ("Initialize:",(Object)(b4i_favoritos._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 94;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(536870912);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 96;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(-2147483648);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("RefreshFavoritos"),BA.ObjectToString("JobDetalleTemporal"),BA.ObjectToString("deleteFavoritos"))) {
case 0: {
 BA.debugLineNum = 99;BA.debugLine="If MilitaFav.IsInitialized Then";
Debug.ShouldStop(4);
if (b4i_favoritos._militafav.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 100;BA.debugLine="MilitaFav.Clear";
Debug.ShouldStop(8);
b4i_favoritos._militafav.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 103;BA.debugLine="MilitaFav = map.Get(\"f_data\")";
Debug.ShouldStop(64);
b4i_favoritos._militafav.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 104;BA.debugLine="cargarListaFavoritos";
Debug.ShouldStop(128);
_cargarlistafavoritos();
 break; }
case 1: {
 BA.debugLineNum = 108;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(2048);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 109;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 110;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(8192);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),b4i_main.__c.runMethod(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 111;BA.debugLine="Return";
Debug.ShouldStop(16384);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 113;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
Debug.ShouldStop(65536);
b4i_favoritos._main._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4i_favoritos._main._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 116;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
Debug.ShouldStop(524288);
b4i_favoritos._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto agregado al carrito.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 117;BA.debugLine="actuCantidad = True";
Debug.ShouldStop(1048576);
b4i_favoritos._actucantidad = b4i_main.__c.runMethod(true,"True");
 break; }
case 2: {
 BA.debugLineNum = 121;BA.debugLine="If map.Get(\"f_data\") Then";
Debug.ShouldStop(16777216);
if (BA.ObjectToBoolean(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data"))))).getBoolean()) { 
 BA.debugLineNum = 122;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado de fa";
Debug.ShouldStop(33554432);
b4i_favoritos._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto eliminado de favorito")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 124;BA.debugLine="For i=0 To MilitaFav.Size-1";
Debug.ShouldStop(134217728);
{
final int step32 = 1;
final int limit32 = RemoteObject.solve(new RemoteObject[] {b4i_favoritos._militafav.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step32 > 0 && _i <= limit32) || (step32 < 0 && _i >= limit32) ;_i = ((int)(0 + _i + step32))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 126;BA.debugLine="Dim mapadel As Map";
Debug.ShouldStop(536870912);
_mapadel = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapadel", _mapadel);
 BA.debugLineNum = 127;BA.debugLine="mapadel = MilitaFav.Get(i)";
Debug.ShouldStop(1073741824);
_mapadel = (b4i_favoritos._militafav.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapadel", _mapadel);
 BA.debugLineNum = 129;BA.debugLine="If mapadetalle.Get(\"f_idrecord\") == mapadel.G";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",b4i_favoritos._mapadetalle.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),_mapadel.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 130;BA.debugLine="MilitaFav.RemoveAt(i)";
Debug.ShouldStop(2);
b4i_favoritos._militafav.runVoidMethod ("RemoveAt:",(Object)(BA.numberCast(int.class, _i)));
 BA.debugLineNum = 131;BA.debugLine="i = MilitaFav.Size";
Debug.ShouldStop(4);
_i = b4i_favoritos._militafav.runMethod(true,"Size").<Number>get().intValue();Debug.locals.put("i", _i);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 136;BA.debugLine="actu = True";
Debug.ShouldStop(128);
b4i_favoritos._actu = b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 137;BA.debugLine="cargarListaFavoritos";
Debug.ShouldStop(256);
_cargarlistafavoritos();
 BA.debugLineNum = 138;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(512);
_btnbackdetalles_click();
 }else {
 BA.debugLineNum = 140;BA.debugLine="hud.ToastMessageShow(\"Hubo un error a remover";
Debug.ShouldStop(2048);
b4i_favoritos._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Hubo un error a remover este producto de su lista de favritos")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 break; }
}
;
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _llistafavoritos_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("LlistaFavoritos_ItemClick (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,185);
if (RapidSub.canDelegate("llistafavoritos_itemclick")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","llistafavoritos_itemclick", _index, _value);}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _bmimgfav = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 185;BA.debugLine="Sub LlistaFavoritos_ItemClick (Index As Int, Value";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 187;BA.debugLine="Dim mapa As Map = Value";
Debug.ShouldStop(67108864);
_mapa = (_value);Debug.locals.put("mapa", _mapa);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 188;BA.debugLine="mapadetalle = mapa";
Debug.ShouldStop(134217728);
b4i_favoritos._mapadetalle = _mapa;
 BA.debugLineNum = 190;BA.debugLine="pagedetalle.RootPanel.LoadLayout(\"frmDetalleProdu";
Debug.ShouldStop(536870912);
b4i_favoritos._pagedetalle.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDetalleProducto")),b4i_favoritos.ba);
 BA.debugLineNum = 192;BA.debugLine="Main.NavControl.ShowPage2(pagedetalle,True)";
Debug.ShouldStop(-2147483648);
b4i_favoritos._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_favoritos._pagedetalle).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 194;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(2);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 196;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_fo";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 197;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(16);
_bm = b4i_favoritos._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 BA.debugLineNum = 199;BA.debugLine="ImageViewDetalles.Bitmap= bm";
Debug.ShouldStop(64);
b4i_favoritos._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 }else {
 BA.debugLineNum = 202;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(512);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 BA.debugLineNum = 204;BA.debugLine="ImageViewDetalles.Bitmap = bm";
Debug.ShouldStop(2048);
b4i_favoritos._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 };
 BA.debugLineNum = 209;BA.debugLine="Dim bmimgfav As Bitmap";
Debug.ShouldStop(65536);
_bmimgfav = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmimgfav", _bmimgfav);
 BA.debugLineNum = 211;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartRed.png\"";
Debug.ShouldStop(262144);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png")));
 BA.debugLineNum = 213;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
Debug.ShouldStop(1048576);
b4i_favoritos._imgdetallefav.runMethod(false,"setBitmap:",_bmimgfav);
 BA.debugLineNum = 216;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
Debug.ShouldStop(8388608);
b4i_favoritos._btnagregarcarritodetalle.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 217;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
Debug.ShouldStop(16777216);
b4i_favoritos._panelimagendetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 218;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
Debug.ShouldStop(33554432);
b4i_favoritos._panellblcantidad.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 219;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
Debug.ShouldStop(67108864);
b4i_favoritos._panelencabezadodetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 221;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(268435456);
b4i_favoritos._lblprecioencabezado.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 222;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(536870912);
b4i_favoritos._lblnombeencabezado.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 223;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(1073741824);
b4i_favoritos._lblcantidad.runMethod(true,"setText:",BA.NumberToString(1));
 BA.debugLineNum = 224;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
Debug.ShouldStop(-2147483648);
b4i_favoritos._steppercantidad.runMethod(true,"setValue:",BA.numberCast(double.class, b4i_favoritos._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 225;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(1);
b4i_favoritos._lblprecio.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.ShouldStop(4);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _msgeliminar_click(RemoteObject _buttontext) throws Exception{
try {
		Debug.PushSubsStack("msgEliminar_Click (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,263);
if (RapidSub.canDelegate("msgeliminar_click")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","msgeliminar_click", _buttontext);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _deletefavoritos = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("ButtonText", _buttontext);
 BA.debugLineNum = 263;BA.debugLine="Sub msgEliminar_Click(ButtonText As String)";
Debug.ShouldStop(64);
 BA.debugLineNum = 265;BA.debugLine="If ButtonText = \"Si\" Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("Si"))) { 
 BA.debugLineNum = 267;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.users";
Debug.ShouldStop(1024);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),b4i_favoritos._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),b4i_favoritos._mapadetalle.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 270;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(8192);
_deletefavoritos = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 271;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me)";
Debug.ShouldStop(16384);
_deletefavoritos.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_favoritos.ba,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(b4i_favoritos.getObject()));
 BA.debugLineNum = 272;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoventa/";
Debug.ShouldStop(32768);
_deletefavoritos.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_favoritos._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_favoritos._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_favoritos._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else 
{ BA.debugLineNum = 275;BA.debugLine="Else If ButtonText = \"No\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_buttontext,BA.ObjectToString("No"))) { 
 BA.debugLineNum = 276;BA.debugLine="Return";
Debug.ShouldStop(524288);
if (true) return RemoteObject.createImmutable("");
 }}
;
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
 //BA.debugLineNum = 7;BA.debugLine="Dim pageFv As Page";
b4i_favoritos._pagefv = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 8;BA.debugLine="Dim pagedetalle As Page";
b4i_favoritos._pagedetalle = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 9;BA.debugLine="Dim mapadetalle As Map";
b4i_favoritos._mapadetalle = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 10;BA.debugLine="Dim actu As Boolean = False";
b4i_favoritos._actu = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 11;BA.debugLine="Dim actuCantidad As Boolean = False";
b4i_favoritos._actucantidad = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 13;BA.debugLine="Private hud As HUD";
b4i_favoritos._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 15;BA.debugLine="Private lblCantProductos As Label";
b4i_favoritos._lblcantproductos = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 16;BA.debugLine="Private btnBackFavoritos As Button";
b4i_favoritos._btnbackfavoritos = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private LlistaFavoritos As CustomListView";
b4i_favoritos._llistafavoritos = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 19;BA.debugLine="Dim MilitaFav As List";
b4i_favoritos._militafav = RemoteObject.createNew ("B4IList");
 //BA.debugLineNum = 20;BA.debugLine="Private lblNomCat As Label";
b4i_favoritos._lblnomcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblCantCat As Label";
b4i_favoritos._lblcantcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private imgCat As ImageView";
b4i_favoritos._imgcat = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private PanelFondoDetalles As Panel";
b4i_favoritos._panelfondodetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private ImageViewDetalles As ImageView";
b4i_favoritos._imageviewdetalles = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private lblPrecioEncabezado As Label";
b4i_favoritos._lblprecioencabezado = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblNombeEncabezado As Label";
b4i_favoritos._lblnombeencabezado = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private imgdetallefav As ImageView";
b4i_favoritos._imgdetallefav = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblcantidad As Label";
b4i_favoritos._lblcantidad = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnless As Button";
b4i_favoritos._btnless = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private btnMore As Button";
b4i_favoritos._btnmore = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblPrecio As Label";
b4i_favoritos._lblprecio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private btnagregarCarritoDetalle As Button";
b4i_favoritos._btnagregarcarritodetalle = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private btnBackDetalles As Button";
b4i_favoritos._btnbackdetalles = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private PanelImagenDetalles As Panel";
b4i_favoritos._panelimagendetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private PanellblCantidad As Panel";
b4i_favoritos._panellblcantidad = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private PanelEncabezadoDetalles As Panel";
b4i_favoritos._panelencabezadodetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private StepperCantidad As Stepper";
b4i_favoritos._steppercantidad = RemoteObject.createNew ("B4IStepperWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private lblCantidadProductos As Label";
b4i_favoritos._lblcantidadproductos = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,283);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 283;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 285;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
Debug.ShouldStop(268435456);
_mapcalculos = b4i_favoritos._funciones.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(b4i_favoritos._main._impuestoincluido /*RemoteObject*/ ),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 287;BA.debugLine="Dim json As String";
Debug.ShouldStop(1073741824);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 288;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_favoritos._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),b4i_favoritos._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 302;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(8192);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 303;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(16384);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_favoritos.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_favoritos.getObject()));
 BA.debugLineNum = 304;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(32768);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_favoritos._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_favoritos._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_favoritos._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _steppercantidad_valuechanged(RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("StepperCantidad_ValueChanged (favoritos) ","favoritos",10,b4i_favoritos.ba,b4i_favoritos.mostCurrent,252);
if (RapidSub.canDelegate("steppercantidad_valuechanged")) { return b4i_favoritos.remoteMe.runUserSub(false, "favoritos","steppercantidad_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 252;BA.debugLine="Sub StepperCantidad_ValueChanged (Value As Double)";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 253;BA.debugLine="lblcantidad.Text = Value";
Debug.ShouldStop(268435456);
b4i_favoritos._lblcantidad.runMethod(true,"setText:",BA.NumberToString(_value));
 BA.debugLineNum = 254;BA.debugLine="End Sub";
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