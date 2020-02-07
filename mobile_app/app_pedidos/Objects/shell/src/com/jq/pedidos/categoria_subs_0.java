package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class categoria_subs_0 {


public static RemoteObject  _activity_create(RemoteObject _firsttime) throws Exception{
try {
		Debug.PushSubsStack("Activity_Create (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,33);
if (RapidSub.canDelegate("activity_create")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","activity_create", _firsttime);}
RemoteObject _jobcategoria = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("FirstTime", _firsttime);
 BA.debugLineNum = 33;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
Debug.ShouldStop(1);
 BA.debugLineNum = 35;BA.debugLine="Activity.LoadLayout(\"frmCategoria\")";
Debug.ShouldStop(4);
categoria.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmCategoria")),categoria.mostCurrent.activityBA);
 BA.debugLineNum = 37;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.ItemHei";
Debug.ShouldStop(16);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").runMethod(true,"setItemHeight",categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 10)),categoria.mostCurrent.activityBA));
 BA.debugLineNum = 39;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(64);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextColor",categoria.mostCurrent.__c.getField(false,"Colors").getField(true,"Black"));
 BA.debugLineNum = 40;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(128);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(true,"setTextSize",BA.numberCast(float.class, 15));
 BA.debugLineNum = 41;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.T";
Debug.ShouldStop(256);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setTypeface",categoria.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 42;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.P";
Debug.ShouldStop(512);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"Label").runMethod(false,"setPadding",RemoteObject.createNewArray("int",new int[] {4},new Object[] {categoria.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 30))),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0)}));
 BA.debugLineNum = 44;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(2048);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setTextColor",categoria.mostCurrent.__c.getField(false,"Colors").getField(true,"Gray"));
 BA.debugLineNum = 45;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(4096);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(false,"setTypeface",categoria.mostCurrent.__c.getField(false,"Typeface").runMethod(false,"LoadFromAssets",(Object)(RemoteObject.createImmutable("Roboto-Light.ttf"))));
 BA.debugLineNum = 46;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.SecondL";
Debug.ShouldStop(8192);
categoria.mostCurrent._listviewslidecategorias.runMethod(false,"getTwoLinesAndBitmap").getField(false,"SecondLabel").runMethod(true,"setHeight",BA.numberCast(int.class, -(double) (0 + 1)));
 BA.debugLineNum = 47;BA.debugLine="funcion.SetDivider(ListViewSlideCategorias,Colors";
Debug.ShouldStop(16384);
categoria.mostCurrent._funcion.runVoidMethod ("_setdivider" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._listviewslidecategorias),(Object)(categoria.mostCurrent.__c.getField(false,"Colors").getField(true,"LightGray")),(Object)(categoria.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 49;BA.debugLine="If listaCategoria.IsInitialized Then";
Debug.ShouldStop(65536);
if (categoria._listacategoria.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="If listaCategoria.Size <> 0 Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("!",categoria._listacategoria.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 53;BA.debugLine="cargarListaCategorias";
Debug.ShouldStop(1048576);
_cargarlistacategorias();
 }else {
 BA.debugLineNum = 57;BA.debugLine="Dim jobCategoria As HttpJob";
Debug.ShouldStop(16777216);
_jobcategoria = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("jobCategoria", _jobcategoria);
 BA.debugLineNum = 58;BA.debugLine="jobCategoria.Initialize(\"jobCategorias\",Me)";
Debug.ShouldStop(33554432);
_jobcategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,categoria.processBA,(Object)(BA.ObjectToString("jobCategorias")),(Object)(categoria.getObject()));
 BA.debugLineNum = 59;BA.debugLine="jobCategoria.PostString(Main.url&\"/puntoventa/s";
Debug.ShouldStop(67108864);
_jobcategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(categoria.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("/puntoventa/searchcategorias"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),categoria.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 };
 }else {
 BA.debugLineNum = 65;BA.debugLine="Dim jobCategoria As HttpJob";
Debug.ShouldStop(1);
_jobcategoria = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("jobCategoria", _jobcategoria);
 BA.debugLineNum = 66;BA.debugLine="jobCategoria.Initialize(\"jobCategorias\",Me)";
Debug.ShouldStop(2);
_jobcategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,categoria.processBA,(Object)(BA.ObjectToString("jobCategorias")),(Object)(categoria.getObject()));
 BA.debugLineNum = 67;BA.debugLine="jobCategoria.PostString(Main.url&\"/puntoventa/se";
Debug.ShouldStop(4);
_jobcategoria.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(categoria.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("/puntoventa/searchcategorias"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),categoria.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 };
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _activity_pause(RemoteObject _userclosed) throws Exception{
try {
		Debug.PushSubsStack("Activity_Pause (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,77);
if (RapidSub.canDelegate("activity_pause")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","activity_pause", _userclosed);}
Debug.locals.put("UserClosed", _userclosed);
 BA.debugLineNum = 77;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("Activity_Resume (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,73);
if (RapidSub.canDelegate("activity_resume")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","activity_resume");}
 BA.debugLineNum = 73;BA.debugLine="Sub Activity_Resume";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnaddpro_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddPro_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,269);
if (RapidSub.canDelegate("btnaddpro_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnaddpro_click");}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
 BA.debugLineNum = 269;BA.debugLine="Sub btnAddPro_Click";
Debug.ShouldStop(4096);
 BA.debugLineNum = 270;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(8192);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 271;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(16384);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 273;BA.debugLine="Dim b As Button";
Debug.ShouldStop(65536);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 274;BA.debugLine="b.Initialize(\"\")";
Debug.ShouldStop(131072);
_b.runVoidMethod ("Initialize",categoria.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 275;BA.debugLine="b = Sender";
Debug.ShouldStop(262144);
_b.setObject(categoria.mostCurrent.__c.runMethod(false,"Sender",categoria.mostCurrent.activityBA));
 BA.debugLineNum = 277;BA.debugLine="mapa = b.Tag";
Debug.ShouldStop(1048576);
_mapa.setObject(_b.runMethod(false,"getTag"));
 BA.debugLineNum = 279;BA.debugLine="mapadetalle.Initialize";
Debug.ShouldStop(4194304);
categoria._mapadetalle.runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="salvar_detalle_temporal(mapa,1)";
Debug.ShouldStop(16777216);
_salvar_detalle_temporal(_mapa,BA.numberCast(int.class, 1));
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _btnagregarcarritodetalle_click() throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,406);
if (RapidSub.canDelegate("btnagregarcarritodetalle_click")) { com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnagregarcarritodetalle_click"); return;}
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
public ResumableSub_btnagregarCarritoDetalle_Click(com.jq.pedidos.categoria parent) {
this.parent = parent;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.categoria parent;

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,406);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
 BA.debugLineNum = 408;BA.debugLine="If lblcantidad.Text < 1 Then";
Debug.ShouldStop(8388608);
if (true) break;

case 1:
//if
this.state = 4;
if (RemoteObject.solveBoolean("<",BA.numberCast(double.class, parent.mostCurrent._lblcantidad.runMethod(true,"getText")),BA.numberCast(double.class, 1))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 409;BA.debugLine="Msgbox(\"Si va ha agregar este producto debe sele";
Debug.ShouldStop(16777216);
parent.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Si va ha agregar este producto debe seleccionar por lo menos una unidad")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),categoria.mostCurrent.activityBA);
 BA.debugLineNum = 410;BA.debugLine="Return";
Debug.ShouldStop(33554432);
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
 BA.debugLineNum = 413;BA.debugLine="salvar_detalle_temporal(mapadetalle,lblcantidad.T";
Debug.ShouldStop(268435456);
_salvar_detalle_temporal(parent._mapadetalle,BA.numberCast(int.class, parent.mostCurrent._lblcantidad.runMethod(true,"getText")));
 BA.debugLineNum = 414;BA.debugLine="Sleep(200)";
Debug.ShouldStop(536870912);
parent.mostCurrent.__c.runVoidMethod ("Sleep",categoria.mostCurrent.activityBA,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "categoria", "btnagregarcarritodetalle_click"),BA.numberCast(int.class, 200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
 BA.debugLineNum = 415;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(1073741824);
_btnbackdetalles_click();
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
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
		Debug.PushSubsStack("btnBackDetalles_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,399);
if (RapidSub.canDelegate("btnbackdetalles_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnbackdetalles_click");}
 BA.debugLineNum = 399;BA.debugLine="Sub btnBackDetalles_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 401;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(250,False)";
Debug.ShouldStop(65536);
categoria.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(categoria.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 402;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
Debug.ShouldStop(131072);
categoria.mostCurrent._panelfondoproductosbycategorias.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(categoria.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackprobycat_click() throws Exception{
try {
		Debug.PushSubsStack("btnbackprobycat_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,234);
if (RapidSub.canDelegate("btnbackprobycat_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnbackprobycat_click");}
 BA.debugLineNum = 234;BA.debugLine="Sub btnbackprobycat_Click";
Debug.ShouldStop(512);
 BA.debugLineNum = 236;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
Debug.ShouldStop(2048);
categoria.mostCurrent._panelfondoproductosbycategorias.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(categoria.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 237;BA.debugLine="PanelFondoSlideCategorias.SetVisibleAnimated(250,";
Debug.ShouldStop(4096);
categoria.mostCurrent._panelfondoslidecategorias.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(categoria.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackslidecategoria_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackSlideCategoria_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,81);
if (RapidSub.canDelegate("btnbackslidecategoria_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnbackslidecategoria_click");}
 BA.debugLineNum = 81;BA.debugLine="Sub btnBackSlideCategoria_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 83;BA.debugLine="Activity.Finish";
Debug.ShouldStop(262144);
categoria.mostCurrent._activity.runVoidMethod ("Finish");
 BA.debugLineNum = 84;BA.debugLine="Principal.keyotraparte = False";
Debug.ShouldStop(524288);
categoria.mostCurrent._principal._keyotraparte /*RemoteObject*/  = categoria.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 85;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(1048576);
categoria.mostCurrent.__c.runVoidMethod ("StartActivity",categoria.processBA,(Object)((categoria.mostCurrent._principal.getObject())));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnless_click() throws Exception{
try {
		Debug.PushSubsStack("btnless_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,393);
if (RapidSub.canDelegate("btnless_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnless_click");}
RemoteObject _num = RemoteObject.createImmutable(0);
 BA.debugLineNum = 393;BA.debugLine="Sub btnless_Click";
Debug.ShouldStop(256);
 BA.debugLineNum = 394;BA.debugLine="Dim num As Int = lblcantidad.Text";
Debug.ShouldStop(512);
_num = BA.numberCast(int.class, categoria.mostCurrent._lblcantidad.runMethod(true,"getText"));Debug.locals.put("num", _num);Debug.locals.put("num", _num);
 BA.debugLineNum = 396;BA.debugLine="lblcantidad.Text = num - 1";
Debug.ShouldStop(2048);
categoria.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {_num,RemoteObject.createImmutable(1)}, "-",1, 1)));
 BA.debugLineNum = 397;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnmore_click() throws Exception{
try {
		Debug.PushSubsStack("btnMore_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,387);
if (RapidSub.canDelegate("btnmore_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","btnmore_click");}
RemoteObject _num = RemoteObject.createImmutable(0);
 BA.debugLineNum = 387;BA.debugLine="Sub btnMore_Click";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="Dim num As Int = lblcantidad.Text";
Debug.ShouldStop(8);
_num = BA.numberCast(int.class, categoria.mostCurrent._lblcantidad.runMethod(true,"getText"));Debug.locals.put("num", _num);Debug.locals.put("num", _num);
 BA.debugLineNum = 390;BA.debugLine="lblcantidad.Text = num + 1";
Debug.ShouldStop(32);
categoria.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.solve(new RemoteObject[] {_num,RemoteObject.createImmutable(1)}, "+",1, 1)));
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cargarlistacategorias() throws Exception{
try {
		Debug.PushSubsStack("cargarListaCategorias (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,177);
if (RapidSub.canDelegate("cargarlistacategorias")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","cargarlistacategorias");}
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
int _i = 0;
RemoteObject _mapalist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 177;BA.debugLine="Sub cargarListaCategorias";
Debug.ShouldStop(65536);
 BA.debugLineNum = 179;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(262144);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 181;BA.debugLine="For i = 0 To listaCategoria.Size-1";
Debug.ShouldStop(1048576);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {categoria._listacategoria.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 183;BA.debugLine="Dim mapalist As Map";
Debug.ShouldStop(4194304);
_mapalist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapalist", _mapalist);
 BA.debugLineNum = 184;BA.debugLine="mapalist = listaCategoria.Get(i)";
Debug.ShouldStop(8388608);
_mapalist.setObject(categoria._listacategoria.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 186;BA.debugLine="If  mapalist.Get(\"f_fotoCategoria\")<> Null And";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("N",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fotoCategoria"))))) && RemoteObject.solveBoolean("!",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fotoCategoria")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 187;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_fotoCate";
Debug.ShouldStop(67108864);
_bm = categoria.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_fotoCategoria")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 189;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(268435456);
_bm.runVoidMethod ("Initialize",(Object)((categoria.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(categoria.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 };
 BA.debugLineNum = 192;BA.debugLine="ListViewSlideCategorias.AddTwoLinesAndBitmap2(ma";
Debug.ShouldStop(-2147483648);
categoria.mostCurrent._listviewslidecategorias.runVoidMethod ("AddTwoLinesAndBitmap2",(Object)(BA.ObjectToCharSequence(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombrecategoria")))))),(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Cantidad de Productos: "),_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("cantproductos"))))))),(Object)(_bm.runMethod(false,"getBitmap")),(Object)((_mapalist.getObject())));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 196;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _clearscrollview(RemoteObject _sv) throws Exception{
try {
		Debug.PushSubsStack("ClearScrollView (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,225);
if (RapidSub.canDelegate("clearscrollview")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","clearscrollview", _sv);}
int _i = 0;
Debug.locals.put("sv", _sv);
 BA.debugLineNum = 225;BA.debugLine="Sub ClearScrollView(sv As ScrollView)";
Debug.ShouldStop(1);
 BA.debugLineNum = 226;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(2);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_sv.runMethod(false,"getPanel").runMethod(true,"getNumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 227;BA.debugLine="sv.Panel.GetView(i).RemoveView";
Debug.ShouldStop(4);
_sv.runMethod(false,"getPanel").runMethod(false,"GetView",(Object)(BA.numberCast(int.class, _i))).runVoidMethod ("RemoveView");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.ShouldStop(16);
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
 //BA.debugLineNum = 16;BA.debugLine="Private ListViewSlideCategorias As ListView";
categoria.mostCurrent._listviewslidecategorias = RemoteObject.createNew ("anywheresoftware.b4a.objects.ListViewWrapper");
 //BA.debugLineNum = 17;BA.debugLine="Private btnBackSlideCategoria As Button";
categoria.mostCurrent._btnbackslidecategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 18;BA.debugLine="Private PanelFondoProductosbycategorias As Panel";
categoria.mostCurrent._panelfondoproductosbycategorias = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private Label1 As Label";
categoria.mostCurrent._label1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 20;BA.debugLine="Private btnbackprobycat As Button";
categoria.mostCurrent._btnbackprobycat = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private PanelFondoSlideCategorias As Panel";
categoria.mostCurrent._panelfondoslidecategorias = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private PanelScroll As Panel";
categoria.mostCurrent._panelscroll = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ScrollViewProByCat As ScrollView";
categoria.mostCurrent._scrollviewprobycat = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
 //BA.debugLineNum = 24;BA.debugLine="Private PanelFondoDetalles As Panel";
categoria.mostCurrent._panelfondodetalles = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private ImageViewDetalles As ImageView";
categoria.mostCurrent._imageviewdetalles = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private lblcantidad As Label";
categoria.mostCurrent._lblcantidad = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private lblNombeEncabezado As Label";
categoria.mostCurrent._lblnombeencabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 28;BA.debugLine="Private lblPrecio As Label";
categoria.mostCurrent._lblprecio = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private lblPrecioEncabezado As Label";
categoria.mostCurrent._lblprecioencabezado = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private lblCantidadProductos As Label";
categoria.mostCurrent._lblcantidadproductos = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _imgfav_click() throws Exception{
try {
		Debug.PushSubsStack("imgFav_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,331);
if (RapidSub.canDelegate("imgfav_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","imgfav_click");}
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _deletefavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
RemoteObject _putfavoritos = RemoteObject.declareNull("com.jq.pedidos.httpjob");
 BA.debugLineNum = 331;BA.debugLine="Sub imgFav_Click";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(2048);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 333;BA.debugLine="img.Initialize(\"\")";
Debug.ShouldStop(4096);
_img.runVoidMethod ("Initialize",categoria.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 334;BA.debugLine="img = Sender";
Debug.ShouldStop(8192);
_img.setObject(categoria.mostCurrent.__c.runMethod(false,"Sender",categoria.mostCurrent.activityBA));
 BA.debugLineNum = 336;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(32768);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 337;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(65536);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 339;BA.debugLine="mapa = img.Tag";
Debug.ShouldStop(262144);
_mapa.setObject(_img.runMethod(false,"getTag"));
 BA.debugLineNum = 341;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(1048576);
if (categoria.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 343;BA.debugLine="Dim bm As  BitmapDrawable";
Debug.ShouldStop(4194304);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 345;BA.debugLine="If mapa.Get(\"f_red\") Then";
Debug.ShouldStop(16777216);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_red"))))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 347;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartW";
Debug.ShouldStop(67108864);
_bm.runVoidMethod ("Initialize",(Object)((categoria.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(categoria.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png"))).getObject())));
 BA.debugLineNum = 348;BA.debugLine="img.Background = bm";
Debug.ShouldStop(134217728);
_img.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 349;BA.debugLine="mapa.Put(\"f_red\",False)";
Debug.ShouldStop(268435456);
_mapa.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((categoria.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 351;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
Debug.ShouldStop(1073741824);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),categoria.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idproducto")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 354;BA.debugLine="Dim deleteFavoritos As HttpJob";
Debug.ShouldStop(2);
_deletefavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("deleteFavoritos", _deletefavoritos);
 BA.debugLineNum = 355;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me";
Debug.ShouldStop(4);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,categoria.processBA,(Object)(BA.ObjectToString("deleteFavoritos")),(Object)(categoria.getObject()));
 BA.debugLineNum = 356;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoventa";
Debug.ShouldStop(8);
_deletefavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(categoria.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/deletefav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),categoria.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 361;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartR";
Debug.ShouldStop(256);
_bm.runVoidMethod ("Initialize",(Object)((categoria.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(categoria.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 362;BA.debugLine="img.Background = bm";
Debug.ShouldStop(512);
_img.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 363;BA.debugLine="mapa.Put(\"f_red\",True)";
Debug.ShouldStop(1024);
_mapa.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((categoria.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 365;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
Debug.ShouldStop(4096);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idusuario':"),categoria.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"idUsuario" /*RemoteObject*/ ),RemoteObject.createImmutable(",'f_idproducto':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idproducto")))));Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 368;BA.debugLine="Dim putFavoritos As HttpJob";
Debug.ShouldStop(32768);
_putfavoritos = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("putFavoritos", _putfavoritos);
 BA.debugLineNum = 369;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
Debug.ShouldStop(65536);
_putfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,categoria.processBA,(Object)(BA.ObjectToString("addFavoritos")),(Object)(categoria.getObject()));
 BA.debugLineNum = 370;BA.debugLine="putFavoritos.PostString(Main.url&\"puntoventa/ad";
Debug.ShouldStop(131072);
_putfavoritos.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(categoria.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/addfav"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),categoria.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 };
 }else {
 BA.debugLineNum = 376;BA.debugLine="ToastMessageShow(\"Primero debe inicar sesión\",F";
Debug.ShouldStop(8388608);
categoria.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Primero debe inicar sesión")),(Object)(categoria.mostCurrent.__c.getField(true,"False")));
 };
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
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
		Debug.PushSubsStack("JobDone (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,89);
if (RapidSub.canDelegate("jobdone")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _list = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _tam = RemoteObject.createImmutable(0);
RemoteObject _alttop = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _mapalist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _lefpro = RemoteObject.createImmutable(0);
Debug.locals.put("Job", _job);
 BA.debugLineNum = 89;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(16777216);
 BA.debugLineNum = 91;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("=",categoria.mostCurrent._funcion.runMethod(true,"_verificarjob" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ ))),categoria.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 92;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 95;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1073741824);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 96;BA.debugLine="Dim list As List";
Debug.ShouldStop(-2147483648);
_list = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("list", _list);
 BA.debugLineNum = 97;BA.debugLine="Dim json As JSONParser";
Debug.ShouldStop(1);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 98;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
Debug.ShouldStop(2);
_json.runVoidMethod ("Initialize",(Object)(categoria.mostCurrent._funcion.runMethod(true,"_base64_decode" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(_job.runClassMethod (com.jq.pedidos.httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 99;BA.debugLine="map = json.NextObject";
Debug.ShouldStop(4);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 102;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(32);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("jobCategorias"),BA.ObjectToString("ProductosByCategoria"),BA.ObjectToString("JobDetalleTemporal"))) {
case 0: {
 BA.debugLineNum = 106;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(512);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 107;BA.debugLine="listaCategoria = list";
Debug.ShouldStop(1024);
categoria._listacategoria = _list;
 BA.debugLineNum = 109;BA.debugLine="cargarListaCategorias";
Debug.ShouldStop(4096);
_cargarlistacategorias();
 break; }
case 1: {
 BA.debugLineNum = 114;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(131072);
_list.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 116;BA.debugLine="If list.Size <= 0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("k",_list.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 117;BA.debugLine="Msgbox(\"Esta categoría todavía no tiene produc";
Debug.ShouldStop(1048576);
categoria.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Esta categoría todavía no tiene productos")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Aviso"))),categoria.mostCurrent.activityBA);
 };
 BA.debugLineNum = 120;BA.debugLine="Dim tam As Int = list.Size";
Debug.ShouldStop(8388608);
_tam = _list.runMethod(true,"getSize");Debug.locals.put("tam", _tam);Debug.locals.put("tam", _tam);
 BA.debugLineNum = 122;BA.debugLine="Dim alttop As Int = 2%y";
Debug.ShouldStop(33554432);
_alttop = categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 2)),categoria.mostCurrent.activityBA);Debug.locals.put("alttop", _alttop);Debug.locals.put("alttop", _alttop);
 BA.debugLineNum = 124;BA.debugLine="ScrollViewProByCat.Panel.Height = 100%y";
Debug.ShouldStop(134217728);
categoria.mostCurrent._scrollviewprobycat.runMethod(false,"getPanel").runMethod(true,"setHeight",categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 100)),categoria.mostCurrent.activityBA));
 BA.debugLineNum = 126;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(536870912);
{
final int step22 = 1;
final int limit22 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step22 > 0 && _i <= limit22) || (step22 < 0 && _i >= limit22) ;_i = ((int)(0 + _i + step22))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 127;BA.debugLine="Dim mapalist As Map";
Debug.ShouldStop(1073741824);
_mapalist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapalist", _mapalist);
 BA.debugLineNum = 128;BA.debugLine="mapalist = list.Get(i)";
Debug.ShouldStop(-2147483648);
_mapalist.setObject(_list.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 130;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(2);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 132;BA.debugLine="If mapalist.Get(\"f_foto\") <> Null And mapalist";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean("N",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 133;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_foto\")";
Debug.ShouldStop(16);
_bm = categoria.mostCurrent._funcion.runMethod(false,"_getimagen" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(BA.ObjectToString(_mapalist.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 136;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-i";
Debug.ShouldStop(128);
_bm.runVoidMethod ("Initialize",(Object)((categoria.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(categoria.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 };
 BA.debugLineNum = 141;BA.debugLine="Dim lefpro As Int = 2%x";
Debug.ShouldStop(4096);
_lefpro = categoria.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),categoria.mostCurrent.activityBA);Debug.locals.put("lefpro", _lefpro);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 143;BA.debugLine="If i Mod 2 == 0 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 145;BA.debugLine="lefpro = 2%x";
Debug.ShouldStop(65536);
_lefpro = categoria.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),categoria.mostCurrent.activityBA);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 146;BA.debugLine="ScrollViewProByCat.Panel.AddView(funcion.crea";
Debug.ShouldStop(131072);
categoria.mostCurrent._scrollviewprobycat.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((categoria.mostCurrent._funcion.runMethod(false,"_createpanelproductoscroll" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(_mapalist),(Object)(_bm)).getObject())),(Object)(_lefpro),(Object)(_alttop),(Object)(categoria.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),categoria.mostCurrent.activityBA)),(Object)(categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),categoria.mostCurrent.activityBA)));
 BA.debugLineNum = 148;BA.debugLine="If i == list.Size-1 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 149;BA.debugLine="alttop = alttop+37%y";
Debug.ShouldStop(1048576);
_alttop = RemoteObject.solve(new RemoteObject[] {_alttop,categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 37)),categoria.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);
 };
 }else {
 BA.debugLineNum = 154;BA.debugLine="lefpro = lefpro + 47%x";
Debug.ShouldStop(33554432);
_lefpro = RemoteObject.solve(new RemoteObject[] {_lefpro,categoria.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),categoria.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("lefpro", _lefpro);
 BA.debugLineNum = 155;BA.debugLine="ScrollViewProByCat.Panel.AddView(funcion.crea";
Debug.ShouldStop(67108864);
categoria.mostCurrent._scrollviewprobycat.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((categoria.mostCurrent._funcion.runMethod(false,"_createpanelproductoscroll" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(_mapalist),(Object)(_bm)).getObject())),(Object)(_lefpro),(Object)(_alttop),(Object)(categoria.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 46)),categoria.mostCurrent.activityBA)),(Object)(categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 36)),categoria.mostCurrent.activityBA)));
 BA.debugLineNum = 156;BA.debugLine="alttop = alttop+37%y";
Debug.ShouldStop(134217728);
_alttop = RemoteObject.solve(new RemoteObject[] {_alttop,categoria.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 37)),categoria.mostCurrent.activityBA)}, "+",1, 1);Debug.locals.put("alttop", _alttop);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 161;BA.debugLine="ScrollViewProByCat.Panel.Height = alttop";
Debug.ShouldStop(1);
categoria.mostCurrent._scrollviewprobycat.runMethod(false,"getPanel").runMethod(true,"setHeight",_alttop);
 break; }
case 2: {
 BA.debugLineNum = 164;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(8);
_map.setObject(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 165;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 166;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(32);
categoria.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),categoria.mostCurrent.__c.getField(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable(".")))),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),categoria.mostCurrent.activityBA);
 BA.debugLineNum = 167;BA.debugLine="Return";
Debug.ShouldStop(64);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 169;BA.debugLine="Principal.cantidadProduto = Principal.cantidadP";
Debug.ShouldStop(256);
categoria.mostCurrent._principal._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {categoria.mostCurrent._principal._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 171;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
Debug.ShouldStop(1024);
categoria.mostCurrent.__c.runVoidMethod ("ToastMessageShow",(Object)(BA.ObjectToCharSequence("Producto agregado al carrito.")),(Object)(categoria.mostCurrent.__c.getField(true,"False")));
 break; }
}
;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _listviewslidecategorias_itemclick(RemoteObject _position,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("ListViewSlideCategorias_ItemClick (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,199);
if (RapidSub.canDelegate("listviewslidecategorias_itemclick")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","listviewslidecategorias_itemclick", _position, _value);}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbusqueda = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("Position", _position);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 199;BA.debugLine="Sub ListViewSlideCategorias_ItemClick (Position As";
Debug.ShouldStop(64);
 BA.debugLineNum = 201;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(256);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 202;BA.debugLine="mapa = Value";
Debug.ShouldStop(512);
_mapa.setObject(_value);
 BA.debugLineNum = 204;BA.debugLine="Dim json As String";
Debug.ShouldStop(2048);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 205;BA.debugLine="json = \"'f_idcategoria':\"&mapa.Get(\"idcategoria\")";
Debug.ShouldStop(4096);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idcategoria':"),_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("idcategoria")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 207;BA.debugLine="Dim jobBusqueda As HttpJob";
Debug.ShouldStop(16384);
_jobbusqueda = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("jobBusqueda", _jobbusqueda);
 BA.debugLineNum = 208;BA.debugLine="jobBusqueda.Initialize(\"ProductosByCategoria\",Me)";
Debug.ShouldStop(32768);
_jobbusqueda.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,categoria.processBA,(Object)(BA.ObjectToString("ProductosByCategoria")),(Object)(categoria.getObject()));
 BA.debugLineNum = 213;BA.debugLine="If PanelFondoProductosbycategorias.IsInitialized";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",categoria.mostCurrent._panelfondoproductosbycategorias.runMethod(true,"IsInitialized"),categoria.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 214;BA.debugLine="Activity.LoadLayout(\"frmProductosByCatgoria\")";
Debug.ShouldStop(2097152);
categoria.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmProductosByCatgoria")),categoria.mostCurrent.activityBA);
 BA.debugLineNum = 215;BA.debugLine="PanelFondoProductosbycategorias.Visible = False";
Debug.ShouldStop(4194304);
categoria.mostCurrent._panelfondoproductosbycategorias.runMethod(true,"setVisible",categoria.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 217;BA.debugLine="ClearScrollView(ScrollViewProByCat)";
Debug.ShouldStop(16777216);
_clearscrollview(categoria.mostCurrent._scrollviewprobycat);
 BA.debugLineNum = 218;BA.debugLine="Label1.Text = mapa.Get(\"nombrecategoria\")";
Debug.ShouldStop(33554432);
categoria.mostCurrent._label1.runMethod(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("nombrecategoria"))))));
 BA.debugLineNum = 219;BA.debugLine="PanelFondoSlideCategorias.SetVisibleAnimated(250,";
Debug.ShouldStop(67108864);
categoria.mostCurrent._panelfondoslidecategorias.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(categoria.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 220;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
Debug.ShouldStop(134217728);
categoria.mostCurrent._panelfondoproductosbycategorias.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 250)),(Object)(categoria.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 221;BA.debugLine="jobBusqueda.PostString(Main.url&\"/puntoventa/prod";
Debug.ShouldStop(268435456);
_jobbusqueda.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(categoria.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("/puntoventa/productosbycat"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),categoria.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _panelfondopro_click() throws Exception{
try {
		Debug.PushSubsStack("PanelFondoPro_Click (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,284);
if (RapidSub.canDelegate("panelfondopro_click")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","panelfondopro_click");}
RemoteObject _mapa = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
 BA.debugLineNum = 284;BA.debugLine="Sub PanelFondoPro_Click";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 285;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(268435456);
_mapa = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 286;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(536870912);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 288;BA.debugLine="Dim b As Panel";
Debug.ShouldStop(-2147483648);
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 289;BA.debugLine="b.Initialize(\"\")";
Debug.ShouldStop(1);
_b.runVoidMethod ("Initialize",categoria.mostCurrent.activityBA,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 290;BA.debugLine="b = Sender";
Debug.ShouldStop(2);
_b.setObject(categoria.mostCurrent.__c.runMethod(false,"Sender",categoria.mostCurrent.activityBA));
 BA.debugLineNum = 292;BA.debugLine="mapa = b.Tag";
Debug.ShouldStop(8);
_mapa.setObject(_b.runMethod(false,"getTag"));
 BA.debugLineNum = 293;BA.debugLine="mapadetalle = mapa";
Debug.ShouldStop(16);
categoria._mapadetalle = _mapa;
 BA.debugLineNum = 296;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",categoria.mostCurrent._panelfondodetalles.runMethod(true,"IsInitialized"),categoria.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 297;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
Debug.ShouldStop(256);
categoria.mostCurrent._activity.runMethodAndSync(false,"LoadLayout",(Object)(RemoteObject.createImmutable("frmDetallesProducto")),categoria.mostCurrent.activityBA);
 BA.debugLineNum = 298;BA.debugLine="PanelFondoDetalles.Visible = False";
Debug.ShouldStop(512);
categoria.mostCurrent._panelfondodetalles.runMethod(true,"setVisible",categoria.mostCurrent.__c.getField(true,"False"));
 };
 BA.debugLineNum = 301;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(4096);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 302;BA.debugLine="If mapa.ContainsKey(\"f_foto\") Then";
Debug.ShouldStop(8192);
if (_mapa.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("f_foto")))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 304;BA.debugLine="If  mapa.Get(\"f_foto\") <> \"\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 307;BA.debugLine="ImageViewDetalles.Background =  mapa.Get(\"f_fot";
Debug.ShouldStop(262144);
categoria.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))));
 }else {
 BA.debugLineNum = 310;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
Debug.ShouldStop(2097152);
_bm.runVoidMethod ("Initialize",(Object)((categoria.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(categoria.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 311;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(4194304);
_bm.runMethod(true,"setGravity",categoria.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 312;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(8388608);
categoria.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 };
 }else {
 BA.debugLineNum = 316;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
Debug.ShouldStop(134217728);
_bm.runVoidMethod ("Initialize",(Object)((categoria.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(categoria.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 BA.debugLineNum = 317;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(268435456);
_bm.runMethod(true,"setGravity",categoria.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 318;BA.debugLine="ImageViewDetalles.Background = bm";
Debug.ShouldStop(536870912);
categoria.mostCurrent._imageviewdetalles.runMethod(false,"setBackground",(_bm.getObject()));
 };
 BA.debugLineNum = 321;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(1);
categoria.mostCurrent._lblprecioencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),categoria.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 322;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(2);
categoria.mostCurrent._lblnombeencabezado.runMethod(true,"setText",BA.ObjectToCharSequence(_mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 323;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(4);
categoria.mostCurrent._lblcantidad.runMethod(true,"setText",BA.ObjectToCharSequence(1));
 BA.debugLineNum = 324;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(8);
categoria.mostCurrent._lblprecio.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$"),categoria.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))))));
 BA.debugLineNum = 325;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
Debug.ShouldStop(16);
categoria.mostCurrent._panelfondoproductosbycategorias.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(categoria.mostCurrent.__c.getField(true,"False")));
 BA.debugLineNum = 326;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,True)";
Debug.ShouldStop(32);
categoria.mostCurrent._panelfondodetalles.runVoidMethod ("SetVisibleAnimated",(Object)(BA.numberCast(int.class, 500)),(Object)(categoria.mostCurrent.__c.getField(true,"True")));
 BA.debugLineNum = 329;BA.debugLine="End Sub";
Debug.ShouldStop(256);
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
 //BA.debugLineNum = 9;BA.debugLine="Dim listaCategoria As List";
categoria._listacategoria = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
 //BA.debugLineNum = 10;BA.debugLine="Dim mapadetalle As Map";
categoria._mapadetalle = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (categoria) ","categoria",9,categoria.mostCurrent.activityBA,categoria.mostCurrent,243);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return com.jq.pedidos.categoria.remoteMe.runUserSub(false, "categoria","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("com.jq.pedidos.httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 243;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(262144);
 BA.debugLineNum = 245;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
Debug.ShouldStop(1048576);
_mapcalculos = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapcalculos = categoria.mostCurrent._funcion.runMethod(false,"_recalcular" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(categoria.mostCurrent._principal._impuestoincluido /*RemoteObject*/ ),(Object)(categoria.mostCurrent.__c.getField(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 247;BA.debugLine="Dim json As String";
Debug.ShouldStop(4194304);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 248;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(8388608);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),categoria.mostCurrent._principal._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_tax")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 261;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(16);
_jobdetalletemporal = RemoteObject.createNew ("com.jq.pedidos.httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 262;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(32);
_jobdetalletemporal.runClassMethod (com.jq.pedidos.httpjob.class, "_initialize" /*RemoteObject*/ ,categoria.processBA,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(categoria.getObject()));
 BA.debugLineNum = 263;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(64);
_jobdetalletemporal.runClassMethod (com.jq.pedidos.httpjob.class, "_poststring" /*RemoteObject*/ ,(Object)(RemoteObject.concat(categoria.mostCurrent._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),categoria.mostCurrent._funcion.runMethod(true,"_crearjson" /*RemoteObject*/ ,categoria.mostCurrent.activityBA,(Object)(categoria.mostCurrent._main._token /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 265;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}