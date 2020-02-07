package com.jq.pedidos;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class funcion_subs_0 {


public static RemoteObject  _a_la_derecha(RemoteObject _ba,RemoteObject _caracter,RemoteObject _parametro,RemoteObject _limite) throws Exception{
try {
		Debug.PushSubsStack("A_la_Derecha (funcion) ","funcion",3,_ba,funcion.mostCurrent,318);
if (RapidSub.canDelegate("a_la_derecha")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","a_la_derecha", _ba, _caracter, _parametro, _limite);}
RemoteObject _a = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("caracter", _caracter);
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 318;BA.debugLine="Sub A_la_Derecha(caracter As String, parametro As";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 319;BA.debugLine="Dim a As String";
Debug.ShouldStop(1073741824);
_a = RemoteObject.createImmutable("");Debug.locals.put("a", _a);
 BA.debugLineNum = 320;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(-2147483648);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 322;BA.debugLine="limite=48";
Debug.ShouldStop(2);
_limite = BA.numberCast(int.class, 48);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 324;BA.debugLine="For i=1 To (limite - parametro.Length)";
Debug.ShouldStop(8);
{
final int step5 = 1;
final int limit5 = (RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"length")}, "-",1, 1)).<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 325;BA.debugLine="a=a&caracter";
Debug.ShouldStop(16);
_a = RemoteObject.concat(_a,_caracter);Debug.locals.put("a", _a);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 327;BA.debugLine="parametro=a&parametro";
Debug.ShouldStop(64);
_parametro = RemoteObject.concat(_a,_parametro);Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 328;BA.debugLine="Return parametro";
Debug.ShouldStop(128);
if (true) return _parametro;
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
public static RemoteObject  _addlinea(RemoteObject _ba,RemoteObject _parametro,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("AddLinea (funcion) ","funcion",3,_ba,funcion.mostCurrent,304);
if (RapidSub.canDelegate("addlinea")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","addlinea", _ba, _parametro, _cantidad);}
RemoteObject _linea = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 304;BA.debugLine="Sub AddLinea(parametro As String,cantidad As Int)";
Debug.ShouldStop(32768);
 BA.debugLineNum = 305;BA.debugLine="Dim linea As String";
Debug.ShouldStop(65536);
_linea = RemoteObject.createImmutable("");Debug.locals.put("linea", _linea);
 BA.debugLineNum = 306;BA.debugLine="If cantidad =0 Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 308;BA.debugLine="cantidad=48";
Debug.ShouldStop(524288);
_cantidad = BA.numberCast(int.class, 48);Debug.locals.put("cantidad", _cantidad);
 };
 BA.debugLineNum = 311;BA.debugLine="For i=1 To cantidad";
Debug.ShouldStop(4194304);
{
final int step5 = 1;
final int limit5 = _cantidad.<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 312;BA.debugLine="linea=linea & parametro";
Debug.ShouldStop(8388608);
_linea = RemoteObject.concat(_linea,_parametro);Debug.locals.put("linea", _linea);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 315;BA.debugLine="Return linea";
Debug.ShouldStop(67108864);
if (true) return _linea;
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _arrayimagetojson(RemoteObject _ba,RemoteObject _listimagen) throws Exception{
try {
		Debug.PushSubsStack("ArrayImageToJson (funcion) ","funcion",3,_ba,funcion.mostCurrent,96);
if (RapidSub.canDelegate("arrayimagetojson")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","arrayimagetojson", _ba, _listimagen);}
RemoteObject _json = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("listImagen", _listimagen);
 BA.debugLineNum = 96;BA.debugLine="Sub ArrayImageToJson(listImagen As List) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 97;BA.debugLine="Dim json As String = \"[\"";
Debug.ShouldStop(1);
_json = BA.ObjectToString("[");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 98;BA.debugLine="For i=0 To listImagen.Size -1";
Debug.ShouldStop(2);
{
final int step2 = 1;
final int limit2 = RemoteObject.solve(new RemoteObject[] {_listimagen.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step2 > 0 && _i <= limit2) || (step2 < 0 && _i >= limit2) ;_i = ((int)(0 + _i + step2))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 99;BA.debugLine="json = json & \",{'f_imagen':'\"&getByteImagen2(li";
Debug.ShouldStop(4);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable(",{'f_imagen':'"),_getbyteimagen2(_ba,(_listimagen.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))))),RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 101;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
Debug.ShouldStop(16);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("[,{")),(Object)(RemoteObject.createImmutable("[{")));Debug.locals.put("json", _json);
 BA.debugLineNum = 102;BA.debugLine="json = json & \"]\"";
Debug.ShouldStop(32);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable("]"));Debug.locals.put("json", _json);
 BA.debugLineNum = 103;BA.debugLine="Return json";
Debug.ShouldStop(64);
if (true) return _json;
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64_decode(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("base64_Decode (funcion) ","funcion",3,_ba,funcion.mostCurrent,216);
if (RapidSub.canDelegate("base64_decode")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","base64_decode", _ba, _text);}
RemoteObject _base64 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.Base64");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 216;BA.debugLine="Sub base64_Decode(text As String) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 217;BA.debugLine="If text = Null Or text.Length = 0 Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("n",_text) || RemoteObject.solveBoolean("=",_text.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 218;BA.debugLine="Return \"\"";
Debug.ShouldStop(33554432);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 221;BA.debugLine="Dim base64 As Base64";
Debug.ShouldStop(268435456);
_base64 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.Base64");Debug.locals.put("base64", _base64);
 BA.debugLineNum = 222;BA.debugLine="Return base64.DecodeStoS(text,\"UTF-8\")";
Debug.ShouldStop(536870912);
if (true) return _base64.runMethod(true,"DecodeStoS",(Object)(_text),(Object)(RemoteObject.createImmutable("UTF-8")));
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
public static RemoteObject  _base64_encode(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("base64_Encode (funcion) ","funcion",3,_ba,funcion.mostCurrent,211);
if (RapidSub.canDelegate("base64_encode")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","base64_encode", _ba, _text);}
RemoteObject _base64 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.Base64");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 211;BA.debugLine="Sub base64_Encode(text As String) As String";
Debug.ShouldStop(262144);
 BA.debugLineNum = 212;BA.debugLine="Dim base64 As Base64";
Debug.ShouldStop(524288);
_base64 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.Base64");Debug.locals.put("base64", _base64);
 BA.debugLineNum = 213;BA.debugLine="Return base64.EncodeStoS(text,\"UTF-8\")";
Debug.ShouldStop(1048576);
if (true) return _base64.runMethod(true,"EncodeStoS",(Object)(_text),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static void  _changescreen(RemoteObject _ba,RemoteObject _caso,RemoteObject _sm,RemoteObject _activiad) throws Exception{
try {
		Debug.PushSubsStack("ChangeScreen (funcion) ","funcion",3,_ba,funcion.mostCurrent,811);
if (RapidSub.canDelegate("changescreen")) { com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","changescreen", _ba, _caso, _sm, _activiad); return;}
ResumableSub_ChangeScreen rsub = new ResumableSub_ChangeScreen(null,_ba,_caso,_sm,_activiad);
rsub.resume(null, null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static class ResumableSub_ChangeScreen extends BA.ResumableSub {
public ResumableSub_ChangeScreen(com.jq.pedidos.funcion parent,RemoteObject _ba,RemoteObject _caso,RemoteObject _sm,RemoteObject _activiad) {
this.parent = parent;
this._ba = _ba;
this._caso = _caso;
this._sm = _sm;
this._activiad = _activiad;
}
java.util.LinkedHashMap<String, Object> rsLocals = new java.util.LinkedHashMap<String, Object>();
com.jq.pedidos.funcion parent;
RemoteObject _ba;
RemoteObject _caso;
RemoteObject _sm;
RemoteObject _activiad;
RemoteObject _res = RemoteObject.createImmutable(0);

@Override
public void resume(BA ba, RemoteObject result) throws Exception{
try {
		Debug.PushSubsStack("ChangeScreen (funcion) ","funcion",3,_ba,funcion.mostCurrent,811);
Debug.locals = rsLocals;Debug.currentSubFrame.locals = rsLocals;

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
;
Debug.locals.put("caso", _caso);
Debug.locals.put("sm", _sm);
Debug.locals.put("activiad", _activiad);
 BA.debugLineNum = 813;BA.debugLine="Select caso";
Debug.ShouldStop(4096);
if (true) break;

case 1:
//select
this.state = 30;
switch (BA.switchObjectToInt(_caso,BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6),BA.numberCast(int.class, 7),BA.numberCast(int.class, 8))) {
case 0: {
this.state = 3;
if (true) break;
}
case 1: {
this.state = 17;
if (true) break;
}
case 2: {
this.state = 19;
if (true) break;
}
case 3: {
this.state = 21;
if (true) break;
}
case 4: {
this.state = 23;
if (true) break;
}
case 5: {
this.state = 25;
if (true) break;
}
case 6: {
this.state = 27;
if (true) break;
}
case 7: {
this.state = 29;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
 BA.debugLineNum = 816;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(32768);
if (true) break;

case 4:
//if
this.state = 15;
if (parent.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
 BA.debugLineNum = 818;BA.debugLine="sm.Hide";
Debug.ShouldStop(131072);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 819;BA.debugLine="Sleep(200)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 31;
return;
case 31:
//C
this.state = 15;
;
 BA.debugLineNum = 820;BA.debugLine="StartActivity(Perfil)";
Debug.ShouldStop(524288);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._perfil.getObject())));
 if (true) break;

case 8:
//C
this.state = 9;
 BA.debugLineNum = 823;BA.debugLine="Dim res As Int";
Debug.ShouldStop(4194304);
_res = RemoteObject.createImmutable(0);Debug.locals.put("res", _res);
 BA.debugLineNum = 825;BA.debugLine="res = Msgbox2(\"Para ver su perfil primero debe";
Debug.ShouldStop(16777216);
_res = parent.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Para ver su perfil primero debe iniciar Sesión")),(Object)(BA.ObjectToCharSequence("Desea iniciar sesión")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("Mas tarde")),(Object)((parent.mostCurrent.__c.getField(false,"Null"))),_ba);Debug.locals.put("res", _res);
 BA.debugLineNum = 827;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
Debug.ShouldStop(67108864);
if (true) break;

case 9:
//if
this.state = 14;
if (RemoteObject.solveBoolean("=",_res,BA.numberCast(double.class, parent.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
 BA.debugLineNum = 828;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(134217728);
parent.mostCurrent._main._mostar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 829;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._main.getObject())));
 if (true) break;

case 13:
//C
this.state = 14;
 BA.debugLineNum = 832;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return ;
 if (true) break;

case 14:
//C
this.state = 15;
;
 if (true) break;

case 15:
//C
this.state = 30;
;
 if (true) break;

case 17:
//C
this.state = 30;
 BA.debugLineNum = 838;BA.debugLine="sm.Hide";
Debug.ShouldStop(32);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 839;BA.debugLine="Sleep(200)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 32;
return;
case 32:
//C
this.state = 30;
;
 BA.debugLineNum = 840;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(128);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._principal.getObject())));
 if (true) break;

case 19:
//C
this.state = 30;
 BA.debugLineNum = 843;BA.debugLine="sm.Hide";
Debug.ShouldStop(1024);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 844;BA.debugLine="Sleep(200)";
Debug.ShouldStop(2048);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 33;
return;
case 33:
//C
this.state = 30;
;
 BA.debugLineNum = 845;BA.debugLine="StartActivity(Categoria)";
Debug.ShouldStop(4096);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._categoria.getObject())));
 if (true) break;

case 21:
//C
this.state = 30;
 BA.debugLineNum = 848;BA.debugLine="sm.Hide";
Debug.ShouldStop(32768);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 849;BA.debugLine="Sleep(200)";
Debug.ShouldStop(65536);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 34;
return;
case 34:
//C
this.state = 30;
;
 BA.debugLineNum = 850;BA.debugLine="Principal.SendClickFav = True";
Debug.ShouldStop(131072);
parent.mostCurrent._principal._sendclickfav /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 851;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(262144);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._principal.getObject())));
 if (true) break;

case 23:
//C
this.state = 30;
 BA.debugLineNum = 854;BA.debugLine="sm.Hide";
Debug.ShouldStop(2097152);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 855;BA.debugLine="Sleep(200)";
Debug.ShouldStop(4194304);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 35;
return;
case 35:
//C
this.state = 30;
;
 BA.debugLineNum = 856;BA.debugLine="StartActivity(Direcciones)";
Debug.ShouldStop(8388608);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._direcciones.getObject())));
 if (true) break;

case 25:
//C
this.state = 30;
 BA.debugLineNum = 859;BA.debugLine="sm.Hide";
Debug.ShouldStop(67108864);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 860;BA.debugLine="Sleep(200)";
Debug.ShouldStop(134217728);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 36;
return;
case 36:
//C
this.state = 30;
;
 BA.debugLineNum = 861;BA.debugLine="StartActivity(ReporteOrdenes)";
Debug.ShouldStop(268435456);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._reporteordenes.getObject())));
 if (true) break;

case 27:
//C
this.state = 30;
 BA.debugLineNum = 864;BA.debugLine="sm.Hide";
Debug.ShouldStop(-2147483648);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 865;BA.debugLine="Sleep(200)";
Debug.ShouldStop(1);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 37;
return;
case 37:
//C
this.state = 30;
;
 BA.debugLineNum = 866;BA.debugLine="Principal.SendClickAbout = True";
Debug.ShouldStop(2);
parent.mostCurrent._principal._sendclickabout /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 867;BA.debugLine="StartActivity(Principal)";
Debug.ShouldStop(4);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._principal.getObject())));
 if (true) break;

case 29:
//C
this.state = 30;
 BA.debugLineNum = 870;BA.debugLine="sm.Hide";
Debug.ShouldStop(32);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 871;BA.debugLine="Sleep(200)";
Debug.ShouldStop(64);
parent.mostCurrent.__c.runVoidMethod ("Sleep",_ba,anywheresoftware.b4a.pc.PCResumableSub.createDebugResumeSub(this, "funcion", "changescreen"),BA.numberCast(int.class, 200));
this.state = 38;
return;
case 38:
//C
this.state = 30;
;
 BA.debugLineNum = 872;BA.debugLine="Main.mostar = True";
Debug.ShouldStop(128);
parent.mostCurrent._main._mostar /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 873;BA.debugLine="Main.logged = False";
Debug.ShouldStop(256);
parent.mostCurrent._main._logged /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"False");
 BA.debugLineNum = 874;BA.debugLine="Principal.loadagain = True";
Debug.ShouldStop(512);
parent.mostCurrent._principal._loadagain /*RemoteObject*/  = parent.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 875;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(1024);
parent.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((parent.mostCurrent._main.getObject())));
 if (true) break;

case 30:
//C
this.state = -1;
;
 BA.debugLineNum = 886;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
public static RemoteObject  _crear_preview(RemoteObject _ba,RemoteObject _scrollviewfotos,RemoteObject _listimagen) throws Exception{
try {
		Debug.PushSubsStack("crear_preview (funcion) ","funcion",3,_ba,funcion.mostCurrent,106);
if (RapidSub.canDelegate("crear_preview")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","crear_preview", _ba, _scrollviewfotos, _listimagen);}
RemoteObject _imagen = null;
RemoteObject _left = RemoteObject.createImmutable(0);
int _i = 0;
RemoteObject _img = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
;
Debug.locals.put("ScrollViewFotos", _scrollviewfotos);
Debug.locals.put("listImagen", _listimagen);
 BA.debugLineNum = 106;BA.debugLine="Sub crear_preview(ScrollViewFotos As HorizontalScr";
Debug.ShouldStop(512);
 BA.debugLineNum = 107;BA.debugLine="ScrollViewFotos.Panel.RemoveAllViews";
Debug.ShouldStop(1024);
_scrollviewfotos.runMethod(false,"getPanel").runVoidMethod ("RemoveAllViews");
 BA.debugLineNum = 108;BA.debugLine="Dim imagen() As Byte";
Debug.ShouldStop(2048);
_imagen = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 109;BA.debugLine="Dim left As Int = 1%x";
Debug.ShouldStop(4096);
_left = funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 1)),_ba);Debug.locals.put("left", _left);Debug.locals.put("left", _left);
 BA.debugLineNum = 110;BA.debugLine="For i=0 To listImagen.Size -1";
Debug.ShouldStop(8192);
{
final int step4 = 1;
final int limit4 = RemoteObject.solve(new RemoteObject[] {_listimagen.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step4 > 0 && _i <= limit4) || (step4 < 0 && _i >= limit4) ;_i = ((int)(0 + _i + step4))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 111;BA.debugLine="imagen = listImagen.Get(i)";
Debug.ShouldStop(16384);
_imagen = (_listimagen.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 112;BA.debugLine="Dim img As ImageView";
Debug.ShouldStop(32768);
_img = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("img", _img);
 BA.debugLineNum = 113;BA.debugLine="img.Initialize(\"View\")";
Debug.ShouldStop(65536);
_img.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("View")));
 BA.debugLineNum = 114;BA.debugLine="img.Tag = i";
Debug.ShouldStop(131072);
_img.runMethod(false,"setTag",RemoteObject.createImmutable((_i)));
 BA.debugLineNum = 115;BA.debugLine="img.Background = getImagen2(imagen)";
Debug.ShouldStop(262144);
_img.runMethod(false,"setBackground",(_getimagen2(_ba,_imagen).getObject()));
 BA.debugLineNum = 116;BA.debugLine="ScrollViewFotos.Panel.AddView(img,left,0%y,23%x,";
Debug.ShouldStop(524288);
_scrollviewfotos.runMethod(false,"getPanel").runVoidMethod ("AddView",(Object)((_img.getObject())),(Object)(_left),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 0)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 23)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 15)),_ba)));
 BA.debugLineNum = 117;BA.debugLine="left =left+25%x";
Debug.ShouldStop(1048576);
_left = RemoteObject.solve(new RemoteObject[] {_left,funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 25)),_ba)}, "+",1, 1);Debug.locals.put("left", _left);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 119;BA.debugLine="ScrollViewFotos.Panel.Width = left";
Debug.ShouldStop(4194304);
_scrollviewfotos.runMethod(false,"getPanel").runMethod(true,"setWidth",_left);
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
public static RemoteObject  _crearjson(RemoteObject _ba,RemoteObject _token,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("crearJson (funcion) ","funcion",3,_ba,funcion.mostCurrent,199);
if (RapidSub.canDelegate("crearjson")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","crearjson", _ba, _token, _data);}
;
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 199;BA.debugLine="Sub crearJson(token As String,data As String) As S";
Debug.ShouldStop(64);
 BA.debugLineNum = 206;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
Debug.ShouldStop(8192);
if (true) return _crearjson2(_ba,_token,RemoteObject.concat(RemoteObject.createImmutable("{"),_data,RemoteObject.createImmutable("}")));
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearjson2(RemoteObject _ba,RemoteObject _token,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("crearJson2 (funcion) ","funcion",3,_ba,funcion.mostCurrent,189);
if (RapidSub.canDelegate("crearjson2")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","crearjson2", _ba, _token, _data);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _b64 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.Base64");
;
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 189;BA.debugLine="Sub crearJson2(token As String,data As String) As";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 190;BA.debugLine="Dim json As String";
Debug.ShouldStop(536870912);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 191;BA.debugLine="Dim b64 As Base64";
Debug.ShouldStop(1073741824);
_b64 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.Base64");Debug.locals.put("b64", _b64);
 BA.debugLineNum = 192;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'f_key':'"),_token,RemoteObject.createImmutable("','f_data':"),_data,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 193;BA.debugLine="Log(json)";
Debug.ShouldStop(1);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","65177348",_json,0);
 BA.debugLineNum = 194;BA.debugLine="json = b64.EncodeStoS(json,\"UTF-8\")";
Debug.ShouldStop(2);
_json = _b64.runMethod(true,"EncodeStoS",(Object)(_json),(Object)(RemoteObject.createImmutable("UTF-8")));Debug.locals.put("json", _json);
 BA.debugLineNum = 195;BA.debugLine="Return json";
Debug.ShouldStop(4);
if (true) return _json;
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
public static RemoteObject  _createpanelproducto(RemoteObject _ba,RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("createPanelProducto (funcion) ","funcion",3,_ba,funcion.mostCurrent,451);
if (RapidSub.canDelegate("createpanelproducto")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","createpanelproducto", _ba, _map);}
RemoteObject _dr = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _panelfondopro = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _colpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _drima = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _imagenpro = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bm = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _lbltitulopro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _imgfav = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bmimgfav = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _mapaimg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _mapafav = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("map", _map);
 BA.debugLineNum = 451;BA.debugLine="Sub createPanelProducto(map As Map) As Panel";
Debug.ShouldStop(4);
 BA.debugLineNum = 454;BA.debugLine="Dim dr As GradientDrawable";
Debug.ShouldStop(32);
_dr = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("dr", _dr);
 BA.debugLineNum = 455;BA.debugLine="dr.Initialize(\"TR_BL\", Array As Int(Colors.Red, C";
Debug.ShouldStop(64);
_dr.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"),funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")})));
 BA.debugLineNum = 458;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(512);
_panelfondopro = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 459;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(1024);
_panelfondopro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 460;BA.debugLine="PanelFondoPro.Width = 47%x";
Debug.ShouldStop(2048);
_panelfondopro.runMethod(true,"setWidth",funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),_ba));
 BA.debugLineNum = 461;BA.debugLine="PanelFondoPro.Height = 4%y";
Debug.ShouldStop(4096);
_panelfondopro.runMethod(true,"setHeight",funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 4)),_ba));
 BA.debugLineNum = 463;BA.debugLine="PanelFondoPro.Background = dr";
Debug.ShouldStop(16384);
_panelfondopro.runMethod(false,"setBackground",(_dr.getObject()));
 BA.debugLineNum = 465;BA.debugLine="Dim colpanel As ColorDrawable";
Debug.ShouldStop(65536);
_colpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("colpanel", _colpanel);
 BA.debugLineNum = 466;BA.debugLine="colpanel.Initialize(Colors.RGB(255, 255, 255),3di";
Debug.ShouldStop(131072);
_colpanel.runVoidMethod ("Initialize",(Object)(funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 468;BA.debugLine="PanelFondoPro.Background = colpanel";
Debug.ShouldStop(524288);
_panelfondopro.runMethod(false,"setBackground",(_colpanel.getObject()));
 BA.debugLineNum = 470;BA.debugLine="PanelFondoPro.Elevation = 5dip";
Debug.ShouldStop(2097152);
_panelfondopro.runMethod(true,"setElevation",BA.numberCast(float.class, funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 472;BA.debugLine="map.Put(\"f_destacado\",True)";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((funcion.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 474;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(33554432);
_panelimagen.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 475;BA.debugLine="PanelImagen.Width = PanelFondoPro.Width";
Debug.ShouldStop(67108864);
_panelimagen.runMethod(true,"setWidth",_panelfondopro.runMethod(true,"getWidth"));
 BA.debugLineNum = 476;BA.debugLine="PanelImagen.Height = 20%y";
Debug.ShouldStop(134217728);
_panelimagen.runMethod(true,"setHeight",funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),_ba));
 BA.debugLineNum = 478;BA.debugLine="Dim drima As GradientDrawable";
Debug.ShouldStop(536870912);
_drima = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("drima", _drima);
 BA.debugLineNum = 479;BA.debugLine="drima.Initialize(\"TL_BR\" ,Array As Int(Colors.Whi";
Debug.ShouldStop(1073741824);
_drima.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TL_BR")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"White"),funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"White")})));
 BA.debugLineNum = 481;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(1);
_imagenpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 482;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(2);
_imagenpro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 484;BA.debugLine="Dim bm As BitmapDrawable";
Debug.ShouldStop(8);
_bm = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 486;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_foto\"";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 487;BA.debugLine="bm = getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(64);
_bm = _getimagen(_ba,BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_foto"))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 489;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
Debug.ShouldStop(256);
_bm.runVoidMethod ("Initialize",(Object)((funcion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funcion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg"))).getObject())));
 };
 BA.debugLineNum = 492;BA.debugLine="bm.Gravity = Gravity.FILL";
Debug.ShouldStop(2048);
_bm.runMethod(true,"setGravity",funcion.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 494;BA.debugLine="imagenPro.Background = bm";
Debug.ShouldStop(8192);
_imagenpro.runMethod(false,"setBackground",(_bm.getObject()));
 BA.debugLineNum = 495;BA.debugLine="PanelImagen.Background = drima";
Debug.ShouldStop(16384);
_panelimagen.runMethod(false,"setBackground",(_drima.getObject()));
 BA.debugLineNum = 497;BA.debugLine="PanelImagen.Elevation = 1dip";
Debug.ShouldStop(65536);
_panelimagen.runMethod(true,"setElevation",BA.numberCast(float.class, funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 499;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0,0,PanelFondoP";
Debug.ShouldStop(262144);
_panelfondopro.runVoidMethod ("AddView",(Object)((_panelimagen.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_panelfondopro.runMethod(true,"getWidth")),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 17)),_ba)));
 BA.debugLineNum = 501;BA.debugLine="PanelImagen.AddView(imagenPro,0,0,PanelImagen.Wid";
Debug.ShouldStop(1048576);
_panelimagen.runVoidMethod ("AddView",(Object)((_imagenpro.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_panelimagen.runMethod(true,"getWidth")),(Object)(_panelimagen.runMethod(true,"getHeight")));
 BA.debugLineNum = 503;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(4194304);
_lbltitulopro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 504;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(8388608);
_lbltitulopro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 505;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(16777216);
_lbltitulopro.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 506;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(33554432);
_lbltitulopro.runMethod(true,"setTextColor",funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 507;BA.debugLine="lblTituloPro.TextSize = 14";
Debug.ShouldStop(67108864);
_lbltitulopro.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 510;BA.debugLine="lblTituloPro.Width = PanelFondoPro.Width - 2%x";
Debug.ShouldStop(536870912);
_lbltitulopro.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"getWidth"),funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)}, "-",1, 1));
 BA.debugLineNum = 511;BA.debugLine="lblTituloPro.Height = 7%y";
Debug.ShouldStop(1073741824);
_lbltitulopro.runMethod(true,"setHeight",funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),_ba));
 BA.debugLineNum = 513;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,2%x,17%y,Panel";
Debug.ShouldStop(1);
_panelfondopro.runVoidMethod ("AddView",(Object)((_lbltitulopro.getObject())),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 17)),_ba)),(Object)(RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"getWidth"),funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)}, "-",1, 1)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),_ba)));
 BA.debugLineNum = 515;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(4);
_lblpreciopro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 516;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(8);
_lblpreciopro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 517;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
Debug.ShouldStop(16);
_lblpreciopro.runMethod(true,"setText",BA.ObjectToCharSequence(funcion.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 518;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(32);
_lblpreciopro.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"getText"))));
 BA.debugLineNum = 519;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(64);
_lblpreciopro.runMethod(true,"setTextColor",funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 520;BA.debugLine="lblPrecioPro.TextSize = 16";
Debug.ShouldStop(128);
_lblpreciopro.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 522;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,2%x,23%y,28%x,";
Debug.ShouldStop(512);
_panelfondopro.runVoidMethod ("AddView",(Object)((_lblpreciopro.getObject())),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 23)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 28)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba)));
 BA.debugLineNum = 524;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(2048);
_btnaddpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 525;BA.debugLine="btnAddPro.Initialize(\"btnAddPro\")";
Debug.ShouldStop(4096);
_btnaddpro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("btnAddPro")));
 BA.debugLineNum = 526;BA.debugLine="btnAddPro.Tag = map";
Debug.ShouldStop(8192);
_btnaddpro.runMethod(false,"setTag",(_map.getObject()));
 BA.debugLineNum = 527;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(16384);
_btnaddpro.runMethod(true,"setText",BA.ObjectToCharSequence("Agregar"));
 BA.debugLineNum = 528;BA.debugLine="btnAddPro.TextColor = Colors.White";
Debug.ShouldStop(32768);
_btnaddpro.runMethod(true,"setTextColor",funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 530;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(131072);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 531;BA.debugLine="cd.Initialize(Colors.RGB(244, 67, 54),3dip)";
Debug.ShouldStop(262144);
_cd.runVoidMethod ("Initialize",(Object)(funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 532;BA.debugLine="btnAddPro.Background = cd";
Debug.ShouldStop(524288);
_btnaddpro.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 534;BA.debugLine="SetPadding(btnAddPro,0,0,0,0)";
Debug.ShouldStop(2097152);
_setpadding(_ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _btnaddpro.getObject()),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 536;BA.debugLine="PanelFondoPro.AddView(btnAddPro,2%x,28%y,43%x,6%y";
Debug.ShouldStop(8388608);
_panelfondopro.runVoidMethod ("AddView",(Object)((_btnaddpro.getObject())),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 28)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 43)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),_ba)));
 BA.debugLineNum = 538;BA.debugLine="Dim imgFav As ImageView";
Debug.ShouldStop(33554432);
_imgfav = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("imgFav", _imgfav);
 BA.debugLineNum = 539;BA.debugLine="imgFav.Initialize(\"imgFav\")";
Debug.ShouldStop(67108864);
_imgfav.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("imgFav")));
 BA.debugLineNum = 540;BA.debugLine="Dim bmImgFav As BitmapDrawable";
Debug.ShouldStop(134217728);
_bmimgfav = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmImgFav", _bmimgfav);
 BA.debugLineNum = 542;BA.debugLine="Dim mapaimg As Map";
Debug.ShouldStop(536870912);
_mapaimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapaimg", _mapaimg);
 BA.debugLineNum = 543;BA.debugLine="mapaimg.Initialize";
Debug.ShouldStop(1073741824);
_mapaimg.runVoidMethod ("Initialize");
 BA.debugLineNum = 545;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(1);
if (funcion.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 547;BA.debugLine="For i=0 To Principal.listafavoritos.Size -1";
Debug.ShouldStop(4);
{
final int step63 = 1;
final int limit63 = RemoteObject.solve(new RemoteObject[] {funcion.mostCurrent._principal._listafavoritos /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step63 > 0 && _i <= limit63) || (step63 < 0 && _i >= limit63) ;_i = ((int)(0 + _i + step63))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 548;BA.debugLine="Dim mapafav As Map";
Debug.ShouldStop(8);
_mapafav = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapafav", _mapafav);
 BA.debugLineNum = 549;BA.debugLine="mapafav = Principal.listafavoritos.Get(i)";
Debug.ShouldStop(16);
_mapafav.setObject(funcion.mostCurrent._principal._listafavoritos /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 551;BA.debugLine="If mapafav.Get(\"f_idrecord\") == map.Get(\"f_idre";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",_mapafav.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 552;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,";
Debug.ShouldStop(128);
_bmimgfav.runVoidMethod ("Initialize",(Object)((funcion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funcion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 553;BA.debugLine="map.Put(\"f_red\",True)";
Debug.ShouldStop(256);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 554;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
Debug.ShouldStop(512);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 557;BA.debugLine="mapaimg.Put(\"f_red\",True)";
Debug.ShouldStop(4096);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 558;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecor";
Debug.ShouldStop(8192);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 559;BA.debugLine="i = Principal.listafavoritos.Size -1";
Debug.ShouldStop(16384);
_i = RemoteObject.solve(new RemoteObject[] {funcion.mostCurrent._principal._listafavoritos /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();Debug.locals.put("i", _i);
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 566;BA.debugLine="If bmImgFav.IsInitialized == False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),funcion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 567;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,\"h";
Debug.ShouldStop(4194304);
_bmimgfav.runVoidMethod ("Initialize",(Object)((funcion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funcion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png"))).getObject())));
 BA.debugLineNum = 568;BA.debugLine="map.Put(\"f_red\",False)";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 569;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
Debug.ShouldStop(16777216);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 572;BA.debugLine="mapaimg.Put(\"f_red\",False)";
Debug.ShouldStop(134217728);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 573;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
Debug.ShouldStop(268435456);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 };
 BA.debugLineNum = 576;BA.debugLine="PanelFondoPro.Tag = map";
Debug.ShouldStop(-2147483648);
_panelfondopro.runMethod(false,"setTag",(_map.getObject()));
 BA.debugLineNum = 578;BA.debugLine="bmImgFav.Gravity = Gravity.FILL";
Debug.ShouldStop(2);
_bmimgfav.runMethod(true,"setGravity",funcion.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 580;BA.debugLine="imgFav.Background = bmImgFav";
Debug.ShouldStop(8);
_imgfav.runMethod(false,"setBackground",(_bmimgfav.getObject()));
 BA.debugLineNum = 582;BA.debugLine="imgFav.Tag = mapaimg";
Debug.ShouldStop(32);
_imgfav.runMethod(false,"setTag",(_mapaimg.getObject()));
 BA.debugLineNum = 584;BA.debugLine="PanelFondoPro.AddView(imgFav,lblPrecioPro.Left +";
Debug.ShouldStop(128);
_panelfondopro.runVoidMethod ("AddView",(Object)((_imgfav.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblpreciopro.runMethod(true,"getLeft"),funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 32.5)),_ba)}, "+",1, 1)),(Object)(_lblpreciopro.runMethod(true,"getTop")),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),_ba)));
 BA.debugLineNum = 586;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(512);
if (true) return _panelfondopro;
 BA.debugLineNum = 588;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelproductoscroll(RemoteObject _ba,RemoteObject _map,RemoteObject _imagen) throws Exception{
try {
		Debug.PushSubsStack("createPanelProductoScroll (funcion) ","funcion",3,_ba,funcion.mostCurrent,596);
if (RapidSub.canDelegate("createpanelproductoscroll")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","createpanelproductoscroll", _ba, _map, _imagen);}
RemoteObject _dr = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _panelfondopro = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
RemoteObject _colpanel = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _drima = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.GradientDrawable");
RemoteObject _imagenpro = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _lbltitulopro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
RemoteObject _imgfav = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
RemoteObject _bmimgfav = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
RemoteObject _mapaimg = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _mapafav = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("map", _map);
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 596;BA.debugLine="Sub createPanelProductoScroll(map As Map, imagen A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 598;BA.debugLine="Dim dr As GradientDrawable";
Debug.ShouldStop(2097152);
_dr = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("dr", _dr);
 BA.debugLineNum = 599;BA.debugLine="dr.Initialize(\"TR_BL\", Array As Int(Colors.Red, C";
Debug.ShouldStop(4194304);
_dr.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TR_BL")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"Red"),funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"Red")})));
 BA.debugLineNum = 602;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(33554432);
_panelfondopro = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("anywheresoftware.b4a.objects.PanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 603;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(67108864);
_panelfondopro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 604;BA.debugLine="PanelFondoPro.Width = 47%x";
Debug.ShouldStop(134217728);
_panelfondopro.runMethod(true,"setWidth",funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 47)),_ba));
 BA.debugLineNum = 605;BA.debugLine="PanelFondoPro.Height = 45%y";
Debug.ShouldStop(268435456);
_panelfondopro.runMethod(true,"setHeight",funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 45)),_ba));
 BA.debugLineNum = 607;BA.debugLine="PanelFondoPro.Background = dr";
Debug.ShouldStop(1073741824);
_panelfondopro.runMethod(false,"setBackground",(_dr.getObject()));
 BA.debugLineNum = 609;BA.debugLine="Dim colpanel As ColorDrawable";
Debug.ShouldStop(1);
_colpanel = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("colpanel", _colpanel);
 BA.debugLineNum = 610;BA.debugLine="colpanel.Initialize(Colors.RGB(255, 255, 255),3di";
Debug.ShouldStop(2);
_colpanel.runVoidMethod ("Initialize",(Object)(funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)))),(Object)(funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 613;BA.debugLine="PanelFondoPro.Background = colpanel";
Debug.ShouldStop(16);
_panelfondopro.runMethod(false,"setBackground",(_colpanel.getObject()));
 BA.debugLineNum = 615;BA.debugLine="PanelFondoPro.Elevation = 5dip";
Debug.ShouldStop(64);
_panelfondopro.runMethod(true,"setElevation",BA.numberCast(float.class, funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 5)))));
 BA.debugLineNum = 617;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(256);
_panelimagen.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 618;BA.debugLine="PanelImagen.Width = PanelFondoPro.Width";
Debug.ShouldStop(512);
_panelimagen.runMethod(true,"setWidth",_panelfondopro.runMethod(true,"getWidth"));
 BA.debugLineNum = 619;BA.debugLine="PanelImagen.Height = 20%y";
Debug.ShouldStop(1024);
_panelimagen.runMethod(true,"setHeight",funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 20)),_ba));
 BA.debugLineNum = 621;BA.debugLine="Dim drima As GradientDrawable";
Debug.ShouldStop(4096);
_drima = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.GradientDrawable");Debug.locals.put("drima", _drima);
 BA.debugLineNum = 622;BA.debugLine="drima.Initialize(\"TL_BR\" ,Array As Int(Colors.Whi";
Debug.ShouldStop(8192);
_drima.runVoidMethod ("Initialize",(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.drawable.GradientDrawable.Orientation"),"TL_BR")),(Object)(RemoteObject.createNewArray("int",new int[] {2},new Object[] {funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"White"),funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"White")})));
 BA.debugLineNum = 624;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(32768);
_imagenpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 625;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(65536);
_imagenpro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 628;BA.debugLine="imagen.Gravity = Gravity.FILL";
Debug.ShouldStop(524288);
_imagen.runMethod(true,"setGravity",funcion.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 630;BA.debugLine="imagenPro.Background = imagen";
Debug.ShouldStop(2097152);
_imagenpro.runMethod(false,"setBackground",(_imagen.getObject()));
 BA.debugLineNum = 631;BA.debugLine="PanelImagen.Background = drima";
Debug.ShouldStop(4194304);
_panelimagen.runMethod(false,"setBackground",(_drima.getObject()));
 BA.debugLineNum = 633;BA.debugLine="map.Put(\"f_foto\",imagen)";
Debug.ShouldStop(16777216);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_foto"))),(Object)((_imagen.getObject())));
 BA.debugLineNum = 635;BA.debugLine="map.Put(\"f_destacado\",False)";
Debug.ShouldStop(67108864);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((funcion.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 638;BA.debugLine="PanelImagen.Elevation = 1dip";
Debug.ShouldStop(536870912);
_panelimagen.runMethod(true,"setElevation",BA.numberCast(float.class, funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 1)))));
 BA.debugLineNum = 640;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0,0,PanelFondoP";
Debug.ShouldStop(-2147483648);
_panelfondopro.runVoidMethod ("AddView",(Object)((_panelimagen.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_panelfondopro.runMethod(true,"getWidth")),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 17)),_ba)));
 BA.debugLineNum = 642;BA.debugLine="PanelImagen.AddView(imagenPro,0,0,PanelImagen.Wid";
Debug.ShouldStop(2);
_panelimagen.runVoidMethod ("AddView",(Object)((_imagenpro.getObject())),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(_panelimagen.runMethod(true,"getWidth")),(Object)(_panelimagen.runMethod(true,"getHeight")));
 BA.debugLineNum = 644;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(8);
_lbltitulopro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 645;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(16);
_lbltitulopro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 646;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(32);
_lbltitulopro.runMethod(true,"setText",BA.ObjectToCharSequence(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 647;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(64);
_lbltitulopro.runMethod(true,"setTextColor",funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 648;BA.debugLine="lblTituloPro.TextSize = 14";
Debug.ShouldStop(128);
_lbltitulopro.runMethod(true,"setTextSize",BA.numberCast(float.class, 14));
 BA.debugLineNum = 651;BA.debugLine="lblTituloPro.Width = PanelFondoPro.Width - 2%x";
Debug.ShouldStop(1024);
_lbltitulopro.runMethod(true,"setWidth",RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"getWidth"),funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)}, "-",1, 1));
 BA.debugLineNum = 652;BA.debugLine="lblTituloPro.Height = 7%y";
Debug.ShouldStop(2048);
_lbltitulopro.runMethod(true,"setHeight",funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),_ba));
 BA.debugLineNum = 654;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,2%x,17%y,Panel";
Debug.ShouldStop(8192);
_panelfondopro.runVoidMethod ("AddView",(Object)((_lbltitulopro.getObject())),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 17)),_ba)),(Object)(RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"getWidth"),funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)}, "-",1, 1)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 7)),_ba)));
 BA.debugLineNum = 656;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(32768);
_lblpreciopro = RemoteObject.createNew ("anywheresoftware.b4a.objects.LabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 657;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(65536);
_lblpreciopro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 658;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
Debug.ShouldStop(131072);
_lblpreciopro.runMethod(true,"setText",BA.ObjectToCharSequence(funcion.mostCurrent.__c.runMethod(true,"NumberFormat",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 659;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(262144);
_lblpreciopro.runMethod(true,"setText",BA.ObjectToCharSequence(RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"getText"))));
 BA.debugLineNum = 660;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(524288);
_lblpreciopro.runMethod(true,"setTextColor",funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 661;BA.debugLine="lblPrecioPro.TextSize = 16";
Debug.ShouldStop(1048576);
_lblpreciopro.runMethod(true,"setTextSize",BA.numberCast(float.class, 16));
 BA.debugLineNum = 663;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,2%x,23%y,28%x,";
Debug.ShouldStop(4194304);
_panelfondopro.runVoidMethod ("AddView",(Object)((_lblpreciopro.getObject())),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 23)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 28)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 5)),_ba)));
 BA.debugLineNum = 665;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(16777216);
_btnaddpro = RemoteObject.createNew ("anywheresoftware.b4a.objects.ButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 666;BA.debugLine="btnAddPro.Initialize(\"btnAddPro\")";
Debug.ShouldStop(33554432);
_btnaddpro.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("btnAddPro")));
 BA.debugLineNum = 667;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(67108864);
_btnaddpro.runMethod(true,"setText",BA.ObjectToCharSequence("Agregar"));
 BA.debugLineNum = 668;BA.debugLine="btnAddPro.TextColor = Colors.White";
Debug.ShouldStop(134217728);
_btnaddpro.runMethod(true,"setTextColor",funcion.mostCurrent.__c.getField(false,"Colors").getField(true,"White"));
 BA.debugLineNum = 669;BA.debugLine="btnAddPro.Tag = map";
Debug.ShouldStop(268435456);
_btnaddpro.runMethod(false,"setTag",(_map.getObject()));
 BA.debugLineNum = 671;BA.debugLine="Dim cd As ColorDrawable";
Debug.ShouldStop(1073741824);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("cd", _cd);
 BA.debugLineNum = 672;BA.debugLine="cd.Initialize(Colors.RGB(244, 67, 54),3dip)";
Debug.ShouldStop(-2147483648);
_cd.runVoidMethod ("Initialize",(Object)(funcion.mostCurrent.__c.getField(false,"Colors").runMethod(true,"RGB",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(funcion.mostCurrent.__c.runMethod(true,"DipToCurrent",(Object)(BA.numberCast(int.class, 3)))));
 BA.debugLineNum = 673;BA.debugLine="btnAddPro.Background = cd";
Debug.ShouldStop(1);
_btnaddpro.runMethod(false,"setBackground",(_cd.getObject()));
 BA.debugLineNum = 675;BA.debugLine="SetPadding(btnAddPro,0,0,0,0)";
Debug.ShouldStop(4);
_setpadding(_ba,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.ConcreteViewWrapper"), _btnaddpro.getObject()),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0),BA.numberCast(int.class, 0));
 BA.debugLineNum = 677;BA.debugLine="PanelFondoPro.AddView(btnAddPro,2%x,28%y,43%x,6%y";
Debug.ShouldStop(16);
_panelfondopro.runVoidMethod ("AddView",(Object)((_btnaddpro.getObject())),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 2)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 28)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 43)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 6)),_ba)));
 BA.debugLineNum = 679;BA.debugLine="Dim imgFav As ImageView";
Debug.ShouldStop(64);
_imgfav = RemoteObject.createNew ("anywheresoftware.b4a.objects.ImageViewWrapper");Debug.locals.put("imgFav", _imgfav);
 BA.debugLineNum = 680;BA.debugLine="imgFav.Initialize(\"imgFav\")";
Debug.ShouldStop(128);
_imgfav.runVoidMethod ("Initialize",_ba,(Object)(RemoteObject.createImmutable("imgFav")));
 BA.debugLineNum = 681;BA.debugLine="Dim bmImgFav As BitmapDrawable";
Debug.ShouldStop(256);
_bmimgfav = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("bmImgFav", _bmimgfav);
 BA.debugLineNum = 683;BA.debugLine="Dim mapaimg As Map";
Debug.ShouldStop(1024);
_mapaimg = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapaimg", _mapaimg);
 BA.debugLineNum = 684;BA.debugLine="mapaimg.Initialize";
Debug.ShouldStop(2048);
_mapaimg.runVoidMethod ("Initialize");
 BA.debugLineNum = 686;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(8192);
if (funcion.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 688;BA.debugLine="For i=0 To Principal.listafavoritos.Size -1";
Debug.ShouldStop(32768);
{
final int step58 = 1;
final int limit58 = RemoteObject.solve(new RemoteObject[] {funcion.mostCurrent._principal._listafavoritos /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step58 > 0 && _i <= limit58) || (step58 < 0 && _i >= limit58) ;_i = ((int)(0 + _i + step58))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 689;BA.debugLine="Dim mapafav As Map";
Debug.ShouldStop(65536);
_mapafav = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapafav", _mapafav);
 BA.debugLineNum = 690;BA.debugLine="mapafav = Principal.listafavoritos.Get(i)";
Debug.ShouldStop(131072);
_mapafav.setObject(funcion.mostCurrent._principal._listafavoritos /*RemoteObject*/ .runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 692;BA.debugLine="If mapafav.Get(\"f_idrecord\") == map.Get(\"f_idre";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_mapafav.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))),_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord")))))) { 
 BA.debugLineNum = 693;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,";
Debug.ShouldStop(1048576);
_bmimgfav.runVoidMethod ("Initialize",(Object)((funcion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funcion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartRed.png"))).getObject())));
 BA.debugLineNum = 694;BA.debugLine="i = Principal.listafavoritos.Size -1";
Debug.ShouldStop(2097152);
_i = RemoteObject.solve(new RemoteObject[] {funcion.mostCurrent._principal._listafavoritos /*RemoteObject*/ .runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();Debug.locals.put("i", _i);
 BA.debugLineNum = 695;BA.debugLine="map.Put(\"f_red\",True)";
Debug.ShouldStop(4194304);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 696;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 699;BA.debugLine="mapaimg.Put(\"f_red\",True)";
Debug.ShouldStop(67108864);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"True"))));
 BA.debugLineNum = 700;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecor";
Debug.ShouldStop(134217728);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 };
 }
}Debug.locals.put("i", _i);
;
 };
 BA.debugLineNum = 707;BA.debugLine="If bmImgFav.IsInitialized == False Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),funcion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 708;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,\"h";
Debug.ShouldStop(8);
_bmimgfav.runVoidMethod ("Initialize",(Object)((funcion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funcion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png"))).getObject())));
 BA.debugLineNum = 709;BA.debugLine="map.Put(\"f_red\",False)";
Debug.ShouldStop(16);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 710;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
Debug.ShouldStop(32);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 BA.debugLineNum = 713;BA.debugLine="mapaimg.Put(\"f_red\",False)";
Debug.ShouldStop(256);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_red"))),(Object)((funcion.mostCurrent.__c.getField(true,"False"))));
 BA.debugLineNum = 714;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
Debug.ShouldStop(512);
_mapaimg.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_idproducto"))),(Object)(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_idrecord"))))));
 };
 BA.debugLineNum = 717;BA.debugLine="PanelFondoPro.Tag = map";
Debug.ShouldStop(4096);
_panelfondopro.runMethod(false,"setTag",(_map.getObject()));
 BA.debugLineNum = 718;BA.debugLine="bmImgFav.Gravity = Gravity.FILL";
Debug.ShouldStop(8192);
_bmimgfav.runMethod(true,"setGravity",funcion.mostCurrent.__c.getField(false,"Gravity").getField(true,"FILL"));
 BA.debugLineNum = 720;BA.debugLine="imgFav.Background = bmImgFav";
Debug.ShouldStop(32768);
_imgfav.runMethod(false,"setBackground",(_bmimgfav.getObject()));
 BA.debugLineNum = 721;BA.debugLine="imgFav.Tag = mapaimg";
Debug.ShouldStop(65536);
_imgfav.runMethod(false,"setTag",(_mapaimg.getObject()));
 BA.debugLineNum = 723;BA.debugLine="PanelFondoPro.AddView(imgFav,lblPrecioPro.Left +";
Debug.ShouldStop(262144);
_panelfondopro.runVoidMethod ("AddView",(Object)((_imgfav.getObject())),(Object)(RemoteObject.solve(new RemoteObject[] {_lblpreciopro.runMethod(true,"getLeft"),funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 32.5)),_ba)}, "+",1, 1)),(Object)(_lblpreciopro.runMethod(true,"getTop")),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerXToCurrent",(Object)(BA.numberCast(float.class, 8)),_ba)),(Object)(funcion.mostCurrent.__c.runMethod(true,"PerYToCurrent",(Object)(BA.numberCast(float.class, 3)),_ba)));
 BA.debugLineNum = 725;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(1048576);
if (true) return _panelfondopro;
 BA.debugLineNum = 727;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disableview(RemoteObject _ba,RemoteObject _tipo,RemoteObject _pan) throws Exception{
try {
		Debug.PushSubsStack("DisableView (funcion) ","funcion",3,_ba,funcion.mostCurrent,149);
if (RapidSub.canDelegate("disableview")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","disableview", _ba, _tipo, _pan);}
RemoteObject _n = RemoteObject.declareNull("anywheresoftware.b4a.objects.ConcreteViewWrapper");
RemoteObject _listv = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
;
Debug.locals.put("tipo", _tipo);
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 149;BA.debugLine="Sub DisableView(tipo As Boolean, pan As Panel)";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 151;BA.debugLine="For Each n As View In pan";
Debug.ShouldStop(4194304);
_n = RemoteObject.createNew ("anywheresoftware.b4a.objects.ConcreteViewWrapper");
{
final RemoteObject group1 = _pan;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_n.setObject(group1.runMethod(false,"Get",index1));
Debug.locals.put("n", _n);
 BA.debugLineNum = 152;BA.debugLine="n.Enabled= Not(tipo)";
Debug.ShouldStop(8388608);
_n.runMethod(true,"setEnabled",funcion.mostCurrent.__c.runMethod(true,"Not",(Object)(_tipo)));
 BA.debugLineNum = 154;BA.debugLine="Select GetType(n)";
Debug.ShouldStop(33554432);
switch (BA.switchObjectToInt(funcion.mostCurrent.__c.runMethod(true,"GetType",(Object)((_n.getObject()))),BA.ObjectToString("anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView"),BA.ObjectToString("anywheresoftware.b4a.BALayout"))) {
case 0: {
 BA.debugLineNum = 157;BA.debugLine="Dim listV As ScrollView = n";
Debug.ShouldStop(268435456);
_listv = RemoteObject.createNew ("anywheresoftware.b4a.objects.ScrollViewWrapper");
_listv.setObject(_n.getObject());Debug.locals.put("listV", _listv);
 BA.debugLineNum = 158;BA.debugLine="DisableView(tipo,listV.Panel)";
Debug.ShouldStop(536870912);
_disableview(_ba,_tipo,_listv.runMethod(false,"getPanel"));
 break; }
case 1: {
 BA.debugLineNum = 161;BA.debugLine="DisableView(tipo,n)";
Debug.ShouldStop(1);
_disableview(_ba,_tipo,RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.PanelWrapper"), _n.getObject()));
 break; }
}
;
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.ShouldStop(64);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _generarslidemenu(RemoteObject _ba,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("GenerarSlideMenu (funcion) ","funcion",3,_ba,funcion.mostCurrent,731);
if (RapidSub.canDelegate("generarslidemenu")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","generarslidemenu", _ba, _sm);}
RemoteObject _lista = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map4 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _map9 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
int _i = 0;
RemoteObject _mapares = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 731;BA.debugLine="Sub GenerarSlideMenu(sm As SlideMenu)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 733;BA.debugLine="Dim lista As List";
Debug.ShouldStop(268435456);
_lista = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lista", _lista);
 BA.debugLineNum = 734;BA.debugLine="lista.Initialize";
Debug.ShouldStop(536870912);
_lista.runVoidMethod ("Initialize");
 BA.debugLineNum = 735;BA.debugLine="Dim map As Map";
Debug.ShouldStop(1073741824);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 737;BA.debugLine="map.Initialize";
Debug.ShouldStop(1);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 739;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(4);
if (funcion.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 741;BA.debugLine="map.Put(\"Nombre\",Main.usersData.nombre)";
Debug.ShouldStop(16);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((funcion.mostCurrent._main._usersdata /*RemoteObject*/ .getField(true,"nombre" /*RemoteObject*/ ))));
 BA.debugLineNum = 742;BA.debugLine="map.Put(\"ruta\",\"user32.png\")";
Debug.ShouldStop(32);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("user32.png"))));
 BA.debugLineNum = 743;BA.debugLine="lista.Add(map)";
Debug.ShouldStop(64);
_lista.runVoidMethod ("Add",(Object)((_map.getObject())));
 }else {
 BA.debugLineNum = 746;BA.debugLine="map.Put(\"Nombre\",\"Público\")";
Debug.ShouldStop(512);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Público"))));
 BA.debugLineNum = 747;BA.debugLine="map.Put(\"ruta\",\"user32.png\")";
Debug.ShouldStop(1024);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("user32.png"))));
 BA.debugLineNum = 748;BA.debugLine="lista.Add(map)";
Debug.ShouldStop(2048);
_lista.runVoidMethod ("Add",(Object)((_map.getObject())));
 };
 BA.debugLineNum = 751;BA.debugLine="Dim map2 As Map";
Debug.ShouldStop(16384);
_map2 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map2", _map2);
 BA.debugLineNum = 752;BA.debugLine="map2.Initialize";
Debug.ShouldStop(32768);
_map2.runVoidMethod ("Initialize");
 BA.debugLineNum = 754;BA.debugLine="map2.Put(\"Nombre\",\"Inicio\")";
Debug.ShouldStop(131072);
_map2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Inicio"))));
 BA.debugLineNum = 755;BA.debugLine="map2.Put(\"ruta\",\"house32.png\")";
Debug.ShouldStop(262144);
_map2.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("house32.png"))));
 BA.debugLineNum = 756;BA.debugLine="lista.Add(map2)";
Debug.ShouldStop(524288);
_lista.runVoidMethod ("Add",(Object)((_map2.getObject())));
 BA.debugLineNum = 758;BA.debugLine="Dim map3 As Map";
Debug.ShouldStop(2097152);
_map3 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map3", _map3);
 BA.debugLineNum = 759;BA.debugLine="map3.Initialize";
Debug.ShouldStop(4194304);
_map3.runVoidMethod ("Initialize");
 BA.debugLineNum = 760;BA.debugLine="map3.Put(\"Nombre\",\"Categoria\")";
Debug.ShouldStop(8388608);
_map3.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Categoria"))));
 BA.debugLineNum = 761;BA.debugLine="map3.Put(\"ruta\",\"categoria.jpg\")";
Debug.ShouldStop(16777216);
_map3.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("categoria.jpg"))));
 BA.debugLineNum = 762;BA.debugLine="lista.Add(map3)";
Debug.ShouldStop(33554432);
_lista.runVoidMethod ("Add",(Object)((_map3.getObject())));
 BA.debugLineNum = 764;BA.debugLine="Dim map4 As Map";
Debug.ShouldStop(134217728);
_map4 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map4", _map4);
 BA.debugLineNum = 765;BA.debugLine="map4.Initialize";
Debug.ShouldStop(268435456);
_map4.runVoidMethod ("Initialize");
 BA.debugLineNum = 766;BA.debugLine="map4.Put(\"Nombre\",\"Lista Favoritos\")";
Debug.ShouldStop(536870912);
_map4.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Lista Favoritos"))));
 BA.debugLineNum = 767;BA.debugLine="map4.Put(\"ruta\",\"favorite.png\")";
Debug.ShouldStop(1073741824);
_map4.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("favorite.png"))));
 BA.debugLineNum = 768;BA.debugLine="lista.Add(map4)";
Debug.ShouldStop(-2147483648);
_lista.runVoidMethod ("Add",(Object)((_map4.getObject())));
 BA.debugLineNum = 770;BA.debugLine="Dim map5 As Map";
Debug.ShouldStop(2);
_map5 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map5", _map5);
 BA.debugLineNum = 771;BA.debugLine="map5.Initialize";
Debug.ShouldStop(4);
_map5.runVoidMethod ("Initialize");
 BA.debugLineNum = 772;BA.debugLine="map5.Put(\"Nombre\",\"Direcciones\")";
Debug.ShouldStop(8);
_map5.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Direcciones"))));
 BA.debugLineNum = 773;BA.debugLine="map5.Put(\"ruta\",\"location-pin.png\")";
Debug.ShouldStop(16);
_map5.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("location-pin.png"))));
 BA.debugLineNum = 774;BA.debugLine="lista.Add(map5)";
Debug.ShouldStop(32);
_lista.runVoidMethod ("Add",(Object)((_map5.getObject())));
 BA.debugLineNum = 776;BA.debugLine="Dim map6 As Map";
Debug.ShouldStop(128);
_map6 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map6", _map6);
 BA.debugLineNum = 777;BA.debugLine="map6.Initialize";
Debug.ShouldStop(256);
_map6.runVoidMethod ("Initialize");
 BA.debugLineNum = 778;BA.debugLine="map6.Put(\"Nombre\",\"Mis Ordenes\")";
Debug.ShouldStop(512);
_map6.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Mis Ordenes"))));
 BA.debugLineNum = 779;BA.debugLine="map6.Put(\"ruta\",\"bill.png\")";
Debug.ShouldStop(1024);
_map6.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("bill.png"))));
 BA.debugLineNum = 780;BA.debugLine="lista.Add(map6)";
Debug.ShouldStop(2048);
_lista.runVoidMethod ("Add",(Object)((_map6.getObject())));
 BA.debugLineNum = 783;BA.debugLine="Dim map8 As Map";
Debug.ShouldStop(16384);
_map8 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map8", _map8);
 BA.debugLineNum = 784;BA.debugLine="map8.Initialize";
Debug.ShouldStop(32768);
_map8.runVoidMethod ("Initialize");
 BA.debugLineNum = 785;BA.debugLine="map8.Put(\"Nombre\",\"Acerca de nostros\") '7";
Debug.ShouldStop(65536);
_map8.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Acerca de nostros"))));
 BA.debugLineNum = 786;BA.debugLine="map8.Put(\"ruta\",\"question.png\")";
Debug.ShouldStop(131072);
_map8.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("question.png"))));
 BA.debugLineNum = 787;BA.debugLine="lista.Add(map8)";
Debug.ShouldStop(262144);
_lista.runVoidMethod ("Add",(Object)((_map8.getObject())));
 BA.debugLineNum = 789;BA.debugLine="If Main.logged Then";
Debug.ShouldStop(1048576);
if (funcion.mostCurrent._main._logged /*RemoteObject*/ .<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 790;BA.debugLine="Dim map9 As Map";
Debug.ShouldStop(2097152);
_map9 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map9", _map9);
 BA.debugLineNum = 791;BA.debugLine="map9.Initialize";
Debug.ShouldStop(4194304);
_map9.runVoidMethod ("Initialize");
 BA.debugLineNum = 792;BA.debugLine="map9.Put(\"Nombre\",\"Cerrar Sesión\") '8";
Debug.ShouldStop(8388608);
_map9.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Nombre"))),(Object)((RemoteObject.createImmutable("Cerrar Sesión"))));
 BA.debugLineNum = 793;BA.debugLine="map9.Put(\"ruta\",\"logout.png\")";
Debug.ShouldStop(16777216);
_map9.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ruta"))),(Object)((RemoteObject.createImmutable("logout.png"))));
 BA.debugLineNum = 794;BA.debugLine="lista.Add(map9)";
Debug.ShouldStop(33554432);
_lista.runVoidMethod ("Add",(Object)((_map9.getObject())));
 };
 BA.debugLineNum = 798;BA.debugLine="For i=0 To lista.Size -1 Step 1";
Debug.ShouldStop(536870912);
{
final int step51 = 1;
final int limit51 = RemoteObject.solve(new RemoteObject[] {_lista.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51) ;_i = ((int)(0 + _i + step51))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 800;BA.debugLine="Dim mapaRes As Map";
Debug.ShouldStop(-2147483648);
_mapares = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("mapaRes", _mapares);
 BA.debugLineNum = 801;BA.debugLine="mapaRes.Initialize";
Debug.ShouldStop(1);
_mapares.runVoidMethod ("Initialize");
 BA.debugLineNum = 803;BA.debugLine="mapaRes = lista.Get(i)";
Debug.ShouldStop(4);
_mapares.setObject(_lista.runMethod(false,"Get",(Object)(BA.numberCast(int.class, _i))));
 BA.debugLineNum = 805;BA.debugLine="sm.AddItem(mapaRes.Get(\"Nombre\"),LoadBitmap(File";
Debug.ShouldStop(16);
_sm.runClassMethod (com.jq.pedidos.slidemenu.class, "_additem" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapares.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("Nombre")))))),(Object)(funcion.mostCurrent.__c.runMethod(false,"LoadBitmap",(Object)(funcion.mostCurrent.__c.getField(false,"File").runMethod(true,"getDirAssets")),(Object)(BA.ObjectToString(_mapares.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ruta")))))))),(Object)((RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(1)}, "+",1, 1))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 809;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_descuento(RemoteObject _ba,RemoteObject _precio,RemoteObject _descuento) throws Exception{
try {
		Debug.PushSubsStack("get_descuento (funcion) ","funcion",3,_ba,funcion.mostCurrent,385);
if (RapidSub.canDelegate("get_descuento")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","get_descuento", _ba, _precio, _descuento);}
RemoteObject _precio2 = RemoteObject.createImmutable(0);
;
Debug.locals.put("precio", _precio);
Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 385;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
Debug.ShouldStop(1);
 BA.debugLineNum = 386;BA.debugLine="Dim precio2 As Double";
Debug.ShouldStop(2);
_precio2 = RemoteObject.createImmutable(0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 387;BA.debugLine="precio2 = precio * (descuento / 100)";
Debug.ShouldStop(4);
_precio2 = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_descuento,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 388;BA.debugLine="Return precio2";
Debug.ShouldStop(8);
if (true) return _precio2;
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_importe(RemoteObject _ba,RemoteObject _cantidad,RemoteObject _precio,RemoteObject _tax) throws Exception{
try {
		Debug.PushSubsStack("get_importe (funcion) ","funcion",3,_ba,funcion.mostCurrent,392);
if (RapidSub.canDelegate("get_importe")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","get_importe", _ba, _cantidad, _precio, _tax);}
RemoteObject _dato = RemoteObject.createImmutable(0);
;
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
 BA.debugLineNum = 392;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="Dim dato As Double";
Debug.ShouldStop(256);
_dato = RemoteObject.createImmutable(0);Debug.locals.put("dato", _dato);
 BA.debugLineNum = 394;BA.debugLine="dato = ((precio * cantidad) + tax)";
Debug.ShouldStop(512);
_dato = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,_cantidad}, "*",0, 0)),_tax}, "+",1, 0));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 395;BA.debugLine="Return  dato";
Debug.ShouldStop(1024);
if (true) return _dato;
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_tax(RemoteObject _ba,RemoteObject _precio,RemoteObject _tax,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("get_tax (funcion) ","funcion",3,_ba,funcion.mostCurrent,380);
if (RapidSub.canDelegate("get_tax")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","get_tax", _ba, _precio, _tax, _cantidad);}
;
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 380;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
Debug.ShouldStop(134217728);
 BA.debugLineNum = 381;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
Debug.ShouldStop(268435456);
_tax = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),_cantidad}, "*",0, 0);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 382;BA.debugLine="Return tax";
Debug.ShouldStop(536870912);
if (true) return _tax;
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getallcontacts(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetAllContacts (funcion) ","funcion",3,_ba,funcion.mostCurrent,400);
if (RapidSub.canDelegate("getallcontacts")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getallcontacts", _ba);}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper");
RemoteObject _peopleprojection = null;
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _u = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
RemoteObject _crsr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 400;BA.debugLine="Sub GetAllContacts As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 401;BA.debugLine="Dim cr As ContentResolver";
Debug.ShouldStop(65536);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper");Debug.locals.put("cr", _cr);
 BA.debugLineNum = 402;BA.debugLine="Private PeopleProjection() As String = Array As S";
Debug.ShouldStop(131072);
_peopleprojection = RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("times_contacted"),BA.ObjectToString("last_time_contacted"),BA.ObjectToString("display_name"),BA.ObjectToString("has_phone_number"),BA.ObjectToString("starred"),BA.ObjectToString("_id"),RemoteObject.createImmutable("photo_id")});Debug.locals.put("PeopleProjection", _peopleprojection);Debug.locals.put("PeopleProjection", _peopleprojection);
 BA.debugLineNum = 405;BA.debugLine="Dim json As String = \"[\"";
Debug.ShouldStop(1048576);
_json = BA.ObjectToString("[");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 407;BA.debugLine="Dim u As Uri";
Debug.ShouldStop(4194304);
_u = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("u", _u);
 BA.debugLineNum = 408;BA.debugLine="u.Parse(\"content://com.android.contacts/contacts\"";
Debug.ShouldStop(8388608);
_u.runVoidMethod ("Parse",(Object)(RemoteObject.createImmutable("content://com.android.contacts/contacts")));
 BA.debugLineNum = 409;BA.debugLine="Dim Crsr As Cursor = cr.Query(u, PeopleProjection";
Debug.ShouldStop(16777216);
_crsr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crsr = _cr.runMethod(false,"Query",(Object)(_u),(Object)(_peopleprojection),(Object)(BA.ObjectToString("")),(Object)((funcion.mostCurrent.__c.getField(false,"Null"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Crsr", _crsr);Debug.locals.put("Crsr", _crsr);
 BA.debugLineNum = 410;BA.debugLine="For i = 0 To Crsr.RowCount - 1";
Debug.ShouldStop(33554432);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_crsr.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 411;BA.debugLine="Crsr.Position = i";
Debug.ShouldStop(67108864);
_crsr.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 413;BA.debugLine="json = json & \",{'f_nombre':'\"& base64_Encode(Cr";
Debug.ShouldStop(268435456);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable(",{'f_nombre':'"),_base64_encode(_ba,_crsr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("display_name")))),RemoteObject.createImmutable("','f_id':'"),_crsr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("_id"))),RemoteObject.createImmutable("','f_phone_list':"),_getphonesbyid(_ba,_crsr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("_id")))),RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 418;BA.debugLine="Crsr.Close";
Debug.ShouldStop(2);
_crsr.runVoidMethod ("Close");
 BA.debugLineNum = 420;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
Debug.ShouldStop(8);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("[,{")),(Object)(RemoteObject.createImmutable("[{")));Debug.locals.put("json", _json);
 BA.debugLineNum = 421;BA.debugLine="json = json & \"]\"";
Debug.ShouldStop(16);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable("]"));Debug.locals.put("json", _json);
 BA.debugLineNum = 423;BA.debugLine="json = json.Replace(\"'\",Chr(34))";
Debug.ShouldStop(64);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(BA.ObjectToString(funcion.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))))));Debug.locals.put("json", _json);
 BA.debugLineNum = 425;BA.debugLine="Log(json)";
Debug.ShouldStop(256);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","66357017",_json,0);
 BA.debugLineNum = 426;BA.debugLine="Return json";
Debug.ShouldStop(512);
if (true) return _json;
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbyteimagen(RemoteObject _ba,RemoteObject _bmap) throws Exception{
try {
		Debug.PushSubsStack("getByteImagen (funcion) ","funcion",3,_ba,funcion.mostCurrent,286);
if (RapidSub.canDelegate("getbyteimagen")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getbyteimagen", _ba, _bmap);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("bmap", _bmap);
 BA.debugLineNum = 286;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As String";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 287;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1073741824);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 288;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(-2147483648);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 289;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(1);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 290;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
Debug.ShouldStop(2);
_bmap.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 291;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(4);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 292;BA.debugLine="out.Close";
Debug.ShouldStop(8);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 293;BA.debugLine="out.Flush";
Debug.ShouldStop(16);
_out.runVoidMethod ("Flush");
 BA.debugLineNum = 294;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(32);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 295;BA.debugLine="Return su.EncodeBase64(data)";
Debug.ShouldStop(64);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_data));
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbyteimagen2(RemoteObject _ba,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("getByteImagen2 (funcion) ","funcion",3,_ba,funcion.mostCurrent,298);
if (RapidSub.canDelegate("getbyteimagen2")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getbyteimagen2", _ba, _data);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 298;BA.debugLine="Sub getByteImagen2(data() As Byte) As String";
Debug.ShouldStop(512);
 BA.debugLineNum = 299;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1024);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 300;BA.debugLine="Return su.EncodeBase64(data)";
Debug.ShouldStop(2048);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_data));
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getday(RemoteObject _ba,RemoteObject _day) throws Exception{
try {
		Debug.PushSubsStack("getDay (funcion) ","funcion",3,_ba,funcion.mostCurrent,169);
if (RapidSub.canDelegate("getday")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getday", _ba, _day);}
;
Debug.locals.put("day", _day);
 BA.debugLineNum = 169;BA.debugLine="Sub getDay(day As Int) As String";
Debug.ShouldStop(256);
 BA.debugLineNum = 171;BA.debugLine="Select day";
Debug.ShouldStop(1024);
switch (BA.switchObjectToInt(_day,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 173;BA.debugLine="Return \"Sunday\"";
Debug.ShouldStop(4096);
if (true) return BA.ObjectToString("Sunday");
 break; }
case 1: {
 BA.debugLineNum = 175;BA.debugLine="Return \"Monday\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("Monday");
 break; }
case 2: {
 BA.debugLineNum = 177;BA.debugLine="Return \"Tuesday\"";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToString("Tuesday");
 break; }
case 3: {
 BA.debugLineNum = 179;BA.debugLine="Return \"Wednesday\"";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToString("Wednesday");
 break; }
case 4: {
 BA.debugLineNum = 181;BA.debugLine="Return \"Thursday\"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString("Thursday");
 break; }
case 5: {
 BA.debugLineNum = 183;BA.debugLine="Return \"Friday\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("Friday");
 break; }
case 6: {
 BA.debugLineNum = 185;BA.debugLine="Return \"Saturday\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("Saturday");
 break; }
}
;
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdecimal(RemoteObject _ba,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("getDecimal (funcion) ","funcion",3,_ba,funcion.mostCurrent,123);
if (RapidSub.canDelegate("getdecimal")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getdecimal", _ba, _n);}
RemoteObject _numero = RemoteObject.createImmutable("");
RemoteObject _punto = RemoteObject.createImmutable("");
;
Debug.locals.put("n", _n);
 BA.debugLineNum = 123;BA.debugLine="Sub getDecimal(n As Double) As String";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 125;BA.debugLine="If IsNumber(n) = False Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",funcion.mostCurrent.__c.runMethod(true,"IsNumber",(Object)(BA.NumberToString(_n))),funcion.mostCurrent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 126;BA.debugLine="Return n";
Debug.ShouldStop(536870912);
if (true) return BA.NumberToString(_n);
 };
 BA.debugLineNum = 129;BA.debugLine="Dim numero, punto As String";
Debug.ShouldStop(1);
_numero = RemoteObject.createImmutable("");Debug.locals.put("numero", _numero);
_punto = RemoteObject.createImmutable("");Debug.locals.put("punto", _punto);
 BA.debugLineNum = 130;BA.debugLine="numero=Round2(n,0)";
Debug.ShouldStop(2);
_numero = BA.NumberToString(funcion.mostCurrent.__c.runMethod(true,"Round2",(Object)(_n),(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("numero", _numero);
 BA.debugLineNum = 132;BA.debugLine="If numero>n Then";
Debug.ShouldStop(8);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _numero),_n)) { 
 BA.debugLineNum = 133;BA.debugLine="numero=numero-1";
Debug.ShouldStop(16);
_numero = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _numero),RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("numero", _numero);
 };
 BA.debugLineNum = 136;BA.debugLine="If (n-numero) > 0 Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {_n,BA.numberCast(double.class, _numero)}, "-",1, 0)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 137;BA.debugLine="punto = n";
Debug.ShouldStop(256);
_punto = BA.NumberToString(_n);Debug.locals.put("punto", _punto);
 BA.debugLineNum = 138;BA.debugLine="If punto.SubString(punto.IndexOf(\".\")+1).Length<";
Debug.ShouldStop(512);
if (RemoteObject.solveBoolean("k",_punto.runMethod(true,"substring",(Object)(RemoteObject.solve(new RemoteObject[] {_punto.runMethod(true,"indexOf",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "+",1, 1))).runMethod(true,"length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 139;BA.debugLine="punto= punto&\"0\"";
Debug.ShouldStop(1024);
_punto = RemoteObject.concat(_punto,RemoteObject.createImmutable("0"));Debug.locals.put("punto", _punto);
 };
 BA.debugLineNum = 141;BA.debugLine="Return punto";
Debug.ShouldStop(4096);
if (true) return _punto;
 }else {
 BA.debugLineNum = 143;BA.debugLine="Return numero&\".00\"";
Debug.ShouldStop(16384);
if (true) return RemoteObject.concat(_numero,RemoteObject.createImmutable(".00"));
 };
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
public static RemoteObject  _getdevicephysicalsize(RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("GetDevicePhysicalSize (funcion) ","funcion",3,_ba,funcion.mostCurrent,256);
if (RapidSub.canDelegate("getdevicephysicalsize")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getdevicephysicalsize", _ba);}
RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.keywords.LayoutValues");
;
 BA.debugLineNum = 256;BA.debugLine="Sub GetDevicePhysicalSize As Float";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 257;BA.debugLine="Dim lv As LayoutValues";
Debug.ShouldStop(1);
_lv = RemoteObject.createNew ("anywheresoftware.b4a.keywords.LayoutValues");Debug.locals.put("lv", _lv);
 BA.debugLineNum = 258;BA.debugLine="lv = GetDeviceLayoutValues";
Debug.ShouldStop(2);
_lv = funcion.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",_ba);Debug.locals.put("lv", _lv);
 BA.debugLineNum = 259;BA.debugLine="Return Sqrt(Power(lv.Height / lv.Scale / 160, 2";
Debug.ShouldStop(4);
if (true) return BA.numberCast(float.class, funcion.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {funcion.mostCurrent.__c.runMethod(true,"Power",(Object)(RemoteObject.solve(new RemoteObject[] {_lv.getField(true,"Height"),_lv.getField(true,"Scale"),RemoteObject.createImmutable(160)}, "//",0, 0)),(Object)(BA.numberCast(double.class, 2))),funcion.mostCurrent.__c.runMethod(true,"Power",(Object)(RemoteObject.solve(new RemoteObject[] {_lv.getField(true,"Width"),_lv.getField(true,"Scale"),RemoteObject.createImmutable(160)}, "//",0, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdiferenciacantidad(RemoteObject _ba,RemoteObject _cantidadactual,RemoteObject _cantidadnueva) throws Exception{
try {
		Debug.PushSubsStack("getDiferenciaCantidad (funcion) ","funcion",3,_ba,funcion.mostCurrent,48);
if (RapidSub.canDelegate("getdiferenciacantidad")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getdiferenciacantidad", _ba, _cantidadactual, _cantidadnueva);}
;
Debug.locals.put("cantidadActual", _cantidadactual);
Debug.locals.put("cantidadNueva", _cantidadnueva);
 BA.debugLineNum = 48;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
Debug.ShouldStop(32768);
 BA.debugLineNum = 50;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean(">",_cantidadnueva,_cantidadactual) && RemoteObject.solveBoolean("<",_cantidadactual,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 51;BA.debugLine="cantidadActual = cantidadActual*-1";
Debug.ShouldStop(262144);
_cantidadactual = BA.numberCast(double.class, _cantidadactual.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("cantidadActual", _cantidadactual);
 }else {
 BA.debugLineNum = 53;BA.debugLine="If cantidadActual > 0 Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean(">",_cantidadactual,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 54;BA.debugLine="cantidadActual = cantidadActual*-1";
Debug.ShouldStop(2097152);
_cantidadactual = BA.numberCast(double.class, _cantidadactual.<Double>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("cantidadActual", _cantidadactual);
 };
 };
 BA.debugLineNum = 58;BA.debugLine="Return cantidadActual";
Debug.ShouldStop(33554432);
if (true) return _cantidadactual;
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimagen(RemoteObject _ba,RemoteObject _imagenb64) throws Exception{
try {
		Debug.PushSubsStack("getImagen (funcion) ","funcion",3,_ba,funcion.mostCurrent,262);
if (RapidSub.canDelegate("getimagen")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getimagen", _ba, _imagenb64);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _imagen = null;
RemoteObject _inp = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _draw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
;
Debug.locals.put("imagenB64", _imagenb64);
 BA.debugLineNum = 262;BA.debugLine="Sub getImagen(imagenB64 As String) As BitmapDrawab";
Debug.ShouldStop(32);
 BA.debugLineNum = 263;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(64);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 264;BA.debugLine="Dim imagen() As Byte";
Debug.ShouldStop(128);
_imagen = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 265;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
Debug.ShouldStop(256);
_imagen = _su.runMethod(false,"DecodeBase64",(Object)(_imagenb64));Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 266;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(512);
_inp = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 267;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(1024);
_inp.runVoidMethod ("InitializeFromBytesArray",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"length")));
 BA.debugLineNum = 268;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(2048);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 269;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(4096);
_bmp.runVoidMethod ("Initialize2",(Object)((_inp.getObject())));
 BA.debugLineNum = 270;BA.debugLine="Dim draw As BitmapDrawable";
Debug.ShouldStop(8192);
_draw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("draw", _draw);
 BA.debugLineNum = 271;BA.debugLine="draw.Initialize(bmp)";
Debug.ShouldStop(16384);
_draw.runVoidMethod ("Initialize",(Object)((_bmp.getObject())));
 BA.debugLineNum = 272;BA.debugLine="Return draw";
Debug.ShouldStop(32768);
if (true) return _draw;
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimagen2(RemoteObject _ba,RemoteObject _imagen) throws Exception{
try {
		Debug.PushSubsStack("getImagen2 (funcion) ","funcion",3,_ba,funcion.mostCurrent,275);
if (RapidSub.canDelegate("getimagen2")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getimagen2", _ba, _imagen);}
RemoteObject _inp = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _draw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
;
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 275;BA.debugLine="Sub getImagen2(imagen() As Byte) As BitmapDrawable";
Debug.ShouldStop(262144);
 BA.debugLineNum = 277;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(1048576);
_inp = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 278;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(2097152);
_inp.runVoidMethod ("InitializeFromBytesArray",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"length")));
 BA.debugLineNum = 279;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(4194304);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 280;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(8388608);
_bmp.runVoidMethod ("Initialize2",(Object)((_inp.getObject())));
 BA.debugLineNum = 281;BA.debugLine="Dim draw As BitmapDrawable";
Debug.ShouldStop(16777216);
_draw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("draw", _draw);
 BA.debugLineNum = 282;BA.debugLine="draw.Initialize(bmp)";
Debug.ShouldStop(33554432);
_draw.runVoidMethod ("Initialize",(Object)((_bmp.getObject())));
 BA.debugLineNum = 283;BA.debugLine="Return draw";
Debug.ShouldStop(67108864);
if (true) return _draw;
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.ShouldStop(134217728);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getphonesbyid(RemoteObject _ba,RemoteObject _id) throws Exception{
try {
		Debug.PushSubsStack("getPhonesByID (funcion) ","funcion",3,_ba,funcion.mostCurrent,430);
if (RapidSub.canDelegate("getphonesbyid")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getphonesbyid", _ba, _id);}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _phonesuri = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
RemoteObject _phones = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
Debug.locals.put("id", _id);
 BA.debugLineNum = 430;BA.debugLine="Sub getPhonesByID(id As String) As String";
Debug.ShouldStop(8192);
 BA.debugLineNum = 431;BA.debugLine="Dim cr As ContentResolver";
Debug.ShouldStop(16384);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper");Debug.locals.put("cr", _cr);
 BA.debugLineNum = 432;BA.debugLine="Dim json As String = \"[\"";
Debug.ShouldStop(32768);
_json = BA.ObjectToString("[");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 433;BA.debugLine="Dim phonesUri As Uri";
Debug.ShouldStop(65536);
_phonesuri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("phonesUri", _phonesuri);
 BA.debugLineNum = 434;BA.debugLine="phonesUri.Parse(\"content://com.android.contacts/d";
Debug.ShouldStop(131072);
_phonesuri.runVoidMethod ("Parse",(Object)(RemoteObject.createImmutable("content://com.android.contacts/data/phones")));
 BA.debugLineNum = 435;BA.debugLine="Dim phones As Cursor = cr.Query(phonesUri,  Array";
Debug.ShouldStop(262144);
_phones = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_phones = _cr.runMethod(false,"Query",(Object)(_phonesuri),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("data1"),RemoteObject.createImmutable("data2")})),(Object)(BA.ObjectToString("contact_id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_id})),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("phones", _phones);Debug.locals.put("phones", _phones);
 BA.debugLineNum = 436;BA.debugLine="For i = 0 To phones.RowCount - 1";
Debug.ShouldStop(524288);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_phones.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 437;BA.debugLine="phones.Position = i";
Debug.ShouldStop(1048576);
_phones.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 438;BA.debugLine="json = json & \",{'f_phone_number':'\"&phones.GetS";
Debug.ShouldStop(2097152);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable(",{'f_phone_number':'"),_phones.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data1"))),RemoteObject.createImmutable("','f_type':'"),_phones.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data2"))),RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 441;BA.debugLine="phones.Close";
Debug.ShouldStop(16777216);
_phones.runVoidMethod ("Close");
 BA.debugLineNum = 443;BA.debugLine="json =  json.Replace(\"[,{\",\"[{\")";
Debug.ShouldStop(67108864);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("[,{")),(Object)(RemoteObject.createImmutable("[{")));Debug.locals.put("json", _json);
 BA.debugLineNum = 444;BA.debugLine="json = json & \"]\"";
Debug.ShouldStop(134217728);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable("]"));Debug.locals.put("json", _json);
 BA.debugLineNum = 446;BA.debugLine="Return json";
Debug.ShouldStop(536870912);
if (true) return _json;
 BA.debugLineNum = 449;BA.debugLine="End Sub";
Debug.ShouldStop(1);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getslidemenu(RemoteObject _ba,RemoteObject _sm,RemoteObject _option) throws Exception{
try {
		Debug.PushSubsStack("getSlideMenu (funcion) ","funcion",3,_ba,funcion.mostCurrent,62);
if (RapidSub.canDelegate("getslidemenu")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","getslidemenu", _ba, _sm, _option);}
;
Debug.locals.put("sm", _sm);
Debug.locals.put("option", _option);
 BA.debugLineNum = 62;BA.debugLine="Sub getSlideMenu(sm As SlideMenu, option As Int) A";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recalcular(RemoteObject _ba,RemoteObject _precio,RemoteObject _descuento,RemoteObject _cantidad,RemoteObject _tax,RemoteObject _impuestoincluido,RemoteObject _exentoimpuesto) throws Exception{
try {
		Debug.PushSubsStack("recalcular (funcion) ","funcion",3,_ba,funcion.mostCurrent,19);
if (RapidSub.canDelegate("recalcular")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","recalcular", _ba, _precio, _descuento, _cantidad, _tax, _impuestoincluido, _exentoimpuesto);}
RemoteObject _precio_para_mostrar = RemoteObject.createImmutable(0);
RemoteObject _preciodescuento = RemoteObject.createImmutable(0);
RemoteObject _total = RemoteObject.createImmutable(0);
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
;
Debug.locals.put("precio", _precio);
Debug.locals.put("descuento", _descuento);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("tax", _tax);
Debug.locals.put("impuestoIncluido", _impuestoincluido);
Debug.locals.put("exentoImpuesto", _exentoimpuesto);
 BA.debugLineNum = 19;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
Debug.ShouldStop(262144);
 BA.debugLineNum = 21;BA.debugLine="If exentoImpuesto Then";
Debug.ShouldStop(1048576);
if (_exentoimpuesto.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 22;BA.debugLine="tax = 0";
Debug.ShouldStop(2097152);
_tax = BA.numberCast(double.class, 0);Debug.locals.put("tax", _tax);
 };
 BA.debugLineNum = 25;BA.debugLine="Dim precio_para_mostrar As Double = precio";
Debug.ShouldStop(16777216);
_precio_para_mostrar = _precio;Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);
 BA.debugLineNum = 26;BA.debugLine="If (impuestoIncluido) Then";
Debug.ShouldStop(33554432);
if ((_impuestoincluido).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 27;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
Debug.ShouldStop(67108864);
_precio_para_mostrar = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0)),RemoteObject.createImmutable(1)}, "+",1, 0))}, "/",0, 0);Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);
 };
 BA.debugLineNum = 31;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
Debug.ShouldStop(1073741824);
_descuento = _get_descuento(_ba,_precio_para_mostrar,_descuento);Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 32;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
Debug.ShouldStop(-2147483648);
_preciodescuento = RemoteObject.solve(new RemoteObject[] {_precio_para_mostrar,_descuento}, "-",1, 0);Debug.locals.put("precioDescuento", _preciodescuento);Debug.locals.put("precioDescuento", _preciodescuento);
 BA.debugLineNum = 34;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
Debug.ShouldStop(2);
_tax = _get_tax(_ba,_preciodescuento,_tax,_cantidad);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 35;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
Debug.ShouldStop(4);
_total = _get_importe(_ba,_cantidad,_preciodescuento,_tax);Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 37;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 38;BA.debugLine="map.Initialize";
Debug.ShouldStop(32);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 39;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
Debug.ShouldStop(64);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_precio_para_mostrar"))),(Object)((_precio_para_mostrar)));
 BA.debugLineNum = 40;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
Debug.ShouldStop(128);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_tax"))),(Object)((_tax)));
 BA.debugLineNum = 41;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
Debug.ShouldStop(256);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_descuento"))),(Object)((_descuento)));
 BA.debugLineNum = 42;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
Debug.ShouldStop(512);
_map.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("f_total"))),(Object)((_total)));
 BA.debugLineNum = 45;BA.debugLine="Return map";
Debug.ShouldStop(4096);
if (true) return _map;
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _remplace(RemoteObject _ba,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("remplace (funcion) ","funcion",3,_ba,funcion.mostCurrent,374);
if (RapidSub.canDelegate("remplace")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","remplace", _ba, _text);}
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 374;BA.debugLine="Sub remplace(text As String ) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 376;BA.debugLine="text=text.Replace(\"'\",\"´´\")";
Debug.ShouldStop(8388608);
_text = _text.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("´´")));Debug.locals.put("text", _text);
 BA.debugLineNum = 377;BA.debugLine="Return text";
Debug.ShouldStop(16777216);
if (true) return _text;
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdivider(RemoteObject _ba,RemoteObject _lv,RemoteObject _color,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (funcion) ","funcion",3,_ba,funcion.mostCurrent,9);
if (RapidSub.canDelegate("setdivider")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","setdivider", _ba, _lv, _color, _height);}
RemoteObject _r = RemoteObject.declareNull("anywheresoftware.b4a.agraham.reflection.Reflection");
RemoteObject _cd = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.ColorDrawable");
;
Debug.locals.put("lv", _lv);
Debug.locals.put("color", _color);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 9;BA.debugLine="Sub SetDivider(lv As ListView, color As Int, Heigh";
Debug.ShouldStop(256);
 BA.debugLineNum = 10;BA.debugLine="Dim r As Reflector";
Debug.ShouldStop(512);
_r = RemoteObject.createNew ("anywheresoftware.b4a.agraham.reflection.Reflection");Debug.locals.put("r", _r);
 BA.debugLineNum = 11;BA.debugLine="r.Target = lv";
Debug.ShouldStop(1024);
_r.setField ("Target",(_lv.getObject()));
 BA.debugLineNum = 12;BA.debugLine="Dim CD As ColorDrawable";
Debug.ShouldStop(2048);
_cd = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.ColorDrawable");Debug.locals.put("CD", _cd);
 BA.debugLineNum = 13;BA.debugLine="CD.Initialize(color, 0)";
Debug.ShouldStop(4096);
_cd.runVoidMethod ("Initialize",(Object)(_color),(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 14;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD),";
Debug.ShouldStop(8192);
_r.runVoidMethod ("RunMethod4",(Object)(BA.ObjectToString("setDivider")),(Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cd.getObject())})),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {RemoteObject.createImmutable("android.graphics.drawable.Drawable")})));
 BA.debugLineNum = 15;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
Debug.ShouldStop(16384);
_r.runVoidMethod ("RunMethod2",(Object)(BA.ObjectToString("setDividerHeight")),(Object)(BA.NumberToString(_height)),(Object)(RemoteObject.createImmutable("java.lang.int")));
 BA.debugLineNum = 17;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject _ba,RemoteObject _va,RemoteObject _left,RemoteObject _top,RemoteObject _right,RemoteObject _bottom) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (funcion) ","funcion",3,_ba,funcion.mostCurrent,590);
if (RapidSub.canDelegate("setpadding")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","setpadding", _ba, _va, _left, _top, _right, _bottom);}
RemoteObject _jo = RemoteObject.declareNull("anywheresoftware.b4j.object.JavaObject");
;
Debug.locals.put("va", _va);
Debug.locals.put("Left", _left);
Debug.locals.put("Top", _top);
Debug.locals.put("Right", _right);
Debug.locals.put("Bottom", _bottom);
 BA.debugLineNum = 590;BA.debugLine="Sub SetPadding(va As View, Left As Int, Top As Int";
Debug.ShouldStop(8192);
 BA.debugLineNum = 591;BA.debugLine="Dim jo As JavaObject = va";
Debug.ShouldStop(16384);
_jo = RemoteObject.createNew ("anywheresoftware.b4j.object.JavaObject");
_jo.setObject(_va.getObject());Debug.locals.put("jo", _jo);
 BA.debugLineNum = 592;BA.debugLine="jo.RunMethod(\"setPadding\", Array As Object(Left,";
Debug.ShouldStop(32768);
_jo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setPadding")),(Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_left),(_top),(_right),(_bottom)})));
 BA.debugLineNum = 593;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _slidemenu_click(RemoteObject _ba,RemoteObject _item,RemoteObject _act) throws Exception{
try {
		Debug.PushSubsStack("SlideMenu_Click (funcion) ","funcion",3,_ba,funcion.mostCurrent,77);
if (RapidSub.canDelegate("slidemenu_click")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","slidemenu_click", _ba, _item, _act);}
RemoteObject _r = RemoteObject.createImmutable(0);
;
Debug.locals.put("Item", _item);
Debug.locals.put("Act", _act);
 BA.debugLineNum = 77;BA.debugLine="Sub SlideMenu_Click(Item As Object, Act As Activit";
Debug.ShouldStop(4096);
 BA.debugLineNum = 79;BA.debugLine="If Item <> -1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("!",_item,RemoteObject.createImmutable((-(double) (0 + 1))))) { 
 BA.debugLineNum = 80;BA.debugLine="Act.Finish";
Debug.ShouldStop(32768);
_act.runVoidMethod ("Finish");
 };
 BA.debugLineNum = 82;BA.debugLine="Select Item";
Debug.ShouldStop(131072);
switch (BA.switchObjectToInt(_item,RemoteObject.createImmutable((-(double) (0 + 1))))) {
case 0: {
 BA.debugLineNum = 85;BA.debugLine="Dim r As Int";
Debug.ShouldStop(1048576);
_r = RemoteObject.createImmutable(0);Debug.locals.put("r", _r);
 BA.debugLineNum = 86;BA.debugLine="r = Msgbox2(\"Seguro que desea salir de la aplic";
Debug.ShouldStop(2097152);
_r = funcion.mostCurrent.__c.runMethodAndSync(true,"Msgbox2",(Object)(BA.ObjectToCharSequence("Seguro que desea salir de la aplicación?")),(Object)(BA.ObjectToCharSequence("")),(Object)(BA.ObjectToString("Si")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("No")),(Object)((funcion.mostCurrent.__c.getField(false,"Null"))),_ba);Debug.locals.put("r", _r);
 BA.debugLineNum = 87;BA.debugLine="If r = DialogResponse.POSITIVE Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, funcion.mostCurrent.__c.getField(false,"DialogResponse").getField(true,"POSITIVE")))) { 
 BA.debugLineNum = 88;BA.debugLine="Act.Finish";
Debug.ShouldStop(8388608);
_act.runVoidMethod ("Finish");
 BA.debugLineNum = 89;BA.debugLine="StartActivity(Main)";
Debug.ShouldStop(16777216);
funcion.mostCurrent.__c.runVoidMethod ("StartActivity",BA.rdebugUtils.runMethod(false, "processBAFromBA", _ba),(Object)((funcion.mostCurrent._main.getObject())));
 };
 break; }
}
;
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _titulo(RemoteObject _ba,RemoteObject _parametro,RemoteObject _limite) throws Exception{
try {
		Debug.PushSubsStack("titulo (funcion) ","funcion",3,_ba,funcion.mostCurrent,351);
if (RapidSub.canDelegate("titulo")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","titulo", _ba, _parametro, _limite);}
RemoteObject _espacio = RemoteObject.createImmutable("");
RemoteObject _totals = RemoteObject.createImmutable("");
RemoteObject _cal = RemoteObject.createImmutable(0);
int _i = 0;
;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 351;BA.debugLine="Sub titulo(parametro As String,limite As Int) As S";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 352;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(-2147483648);
_espacio = RemoteObject.createImmutable("");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 352;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(-2147483648);
_espacio = BA.ObjectToString(" ");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 353;BA.debugLine="Dim totals As String : totals=\"\"";
Debug.ShouldStop(1);
_totals = RemoteObject.createImmutable("");Debug.locals.put("totals", _totals);
 BA.debugLineNum = 353;BA.debugLine="Dim totals As String : totals=\"\"";
Debug.ShouldStop(1);
_totals = BA.ObjectToString("");Debug.locals.put("totals", _totals);
 BA.debugLineNum = 354;BA.debugLine="Dim cal As Double";
Debug.ShouldStop(2);
_cal = RemoteObject.createImmutable(0);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 355;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 356;BA.debugLine="limite=48";
Debug.ShouldStop(8);
_limite = BA.numberCast(int.class, 48);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 359;BA.debugLine="If parametro.Length<limite Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("<",_parametro.runMethod(true,"length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 360;BA.debugLine="cal=limite-parametro.Length";
Debug.ShouldStop(128);
_cal = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"length")}, "-",1, 1));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 361;BA.debugLine="cal= cal/2";
Debug.ShouldStop(256);
_cal = RemoteObject.solve(new RemoteObject[] {_cal,RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 363;BA.debugLine="For i=1 To Round(cal)";
Debug.ShouldStop(1024);
{
final int step12 = 1;
final int limit12 = (int) (0 + funcion.mostCurrent.__c.runMethod(true,"Round",(Object)(_cal)).<Long>get().longValue());
_i = 1 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 364;BA.debugLine="totals=espacio& totals";
Debug.ShouldStop(2048);
_totals = RemoteObject.concat(_espacio,_totals);Debug.locals.put("totals", _totals);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 366;BA.debugLine="parametro=totals&parametro";
Debug.ShouldStop(8192);
_parametro = RemoteObject.concat(_totals,_parametro);Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 367;BA.debugLine="Return parametro";
Debug.ShouldStop(16384);
if (true) return _parametro;
 }else {
 BA.debugLineNum = 369;BA.debugLine="Return parametro";
Debug.ShouldStop(65536);
if (true) return _parametro;
 };
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _v(RemoteObject _ba,RemoteObject _parametro,RemoteObject _limite) throws Exception{
try {
		Debug.PushSubsStack("V (funcion) ","funcion",3,_ba,funcion.mostCurrent,331);
if (RapidSub.canDelegate("v")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","v", _ba, _parametro, _limite);}
RemoteObject _espacio = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 331;BA.debugLine="Sub V (parametro As String,limite As Int) As Strin";
Debug.ShouldStop(1024);
 BA.debugLineNum = 332;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 334;BA.debugLine="limite=47";
Debug.ShouldStop(8192);
_limite = BA.numberCast(int.class, 47);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 337;BA.debugLine="If parametro.Length>limite Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_parametro.runMethod(true,"length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 338;BA.debugLine="parametro=parametro.SubString2(0,limite-2)&\"..\"";
Debug.ShouldStop(131072);
_parametro = RemoteObject.concat(_parametro.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_limite,RemoteObject.createImmutable(2)}, "-",1, 1))),RemoteObject.createImmutable(".."));Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 339;BA.debugLine="Return parametro";
Debug.ShouldStop(262144);
if (true) return _parametro;
 }else 
{ BA.debugLineNum = 341;BA.debugLine="Else if parametro.Length<limite Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",_parametro.runMethod(true,"length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 342;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(2097152);
_espacio = RemoteObject.createImmutable("");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 342;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(2097152);
_espacio = BA.ObjectToString(" ");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 343;BA.debugLine="For i=1 To (limite-parametro.Length)";
Debug.ShouldStop(4194304);
{
final int step10 = 1;
final int limit10 = (RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"length")}, "-",1, 1)).<Integer>get().intValue();
_i = 1 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 344;BA.debugLine="parametro=parametro&espacio";
Debug.ShouldStop(8388608);
_parametro = RemoteObject.concat(_parametro,_espacio);Debug.locals.put("parametro", _parametro);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 346;BA.debugLine="Return parametro";
Debug.ShouldStop(33554432);
if (true) return _parametro;
 }}
;
 BA.debugLineNum = 349;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verificarjob(RemoteObject _ba,RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("verificarJob (funcion) ","funcion",3,_ba,funcion.mostCurrent,225);
if (RapidSub.canDelegate("verificarjob")) { return com.jq.pedidos.funcion.remoteMe.runUserSub(false, "funcion","verificarjob", _ba, _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _confirm = RemoteObject.createImmutable("");
;
Debug.locals.put("job", _job);
 BA.debugLineNum = 225;BA.debugLine="Sub verificarJob(job As String) As Boolean";
Debug.ShouldStop(1);
 BA.debugLineNum = 227;BA.debugLine="job = base64_Decode(job)";
Debug.ShouldStop(4);
_job = _base64_decode(_ba,_job);Debug.locals.put("job", _job);
 BA.debugLineNum = 228;BA.debugLine="Dim map As Map";
Debug.ShouldStop(8);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 229;BA.debugLine="Log(job)";
Debug.ShouldStop(16);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","65439492",_job,0);
 BA.debugLineNum = 230;BA.debugLine="Dim Json As JSONParser";
Debug.ShouldStop(32);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("Json", _json);
 BA.debugLineNum = 231;BA.debugLine="Json.Initialize(job)";
Debug.ShouldStop(64);
_json.runVoidMethod ("Initialize",(Object)(_job));
 BA.debugLineNum = 232;BA.debugLine="map=Json.NextObject";
Debug.ShouldStop(128);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 233;BA.debugLine="Dim confirm As String";
Debug.ShouldStop(256);
_confirm = RemoteObject.createImmutable("");Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 234;BA.debugLine="confirm=map.Get(\"f_key\")";
Debug.ShouldStop(512);
_confirm = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_key")))));Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 236;BA.debugLine="If confirm=\"-1\" Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-1"))) { 
 BA.debugLineNum = 237;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
Debug.ShouldStop(4096);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuario o contraseña incorrectos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),_ba);
 BA.debugLineNum = 238;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 239;BA.debugLine="else if confirm=\"-2\" Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-2"))) { 
 BA.debugLineNum = 240;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"\")";
Debug.ShouldStop(32768);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Este usuario esta desactivado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),_ba);
 BA.debugLineNum = 241;BA.debugLine="Return False";
Debug.ShouldStop(65536);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 242;BA.debugLine="else if confirm=\"-3\" Then";
Debug.ShouldStop(131072);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-3"))) { 
 BA.debugLineNum = 243;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
Debug.ShouldStop(262144);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Este usuario ya existe")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),_ba);
 BA.debugLineNum = 244;BA.debugLine="Return False";
Debug.ShouldStop(524288);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 245;BA.debugLine="else if confirm=\"-4\" Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-4"))) { 
 BA.debugLineNum = 247;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
Debug.ShouldStop(4194304);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("**The print is not finish yet")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Information"))),_ba);
 BA.debugLineNum = 248;BA.debugLine="Log(job)";
Debug.ShouldStop(8388608);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","65439511",_job,0);
 BA.debugLineNum = 249;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }}}}
;
 BA.debugLineNum = 252;BA.debugLine="Return True";
Debug.ShouldStop(134217728);
if (true) return funcion.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}