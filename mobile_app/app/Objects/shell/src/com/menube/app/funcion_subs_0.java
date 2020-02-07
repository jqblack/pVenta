package com.menube.app;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class funcion_subs_0 {


public static RemoteObject  _a_la_derecha(RemoteObject _ba,RemoteObject _caracter,RemoteObject _parametro,RemoteObject _limite) throws Exception{
try {
		Debug.PushSubsStack("A_la_Derecha (funcion) ","funcion",3,_ba,funcion.mostCurrent,320);
if (RapidSub.canDelegate("a_la_derecha")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","a_la_derecha", _ba, _caracter, _parametro, _limite);}
RemoteObject _a = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("caracter", _caracter);
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 320;BA.debugLine="Sub A_la_Derecha(caracter As String, parametro As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 321;BA.debugLine="Dim a As String";
Debug.ShouldStop(1);
_a = RemoteObject.createImmutable("");Debug.locals.put("a", _a);
 BA.debugLineNum = 322;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 324;BA.debugLine="limite=48";
Debug.ShouldStop(8);
_limite = BA.numberCast(int.class, 48);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 326;BA.debugLine="For i=1 To (limite - parametro.Length)";
Debug.ShouldStop(32);
{
final int step5 = 1;
final int limit5 = (RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"length")}, "-",1, 1)).<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 327;BA.debugLine="a=a&caracter";
Debug.ShouldStop(64);
_a = RemoteObject.concat(_a,_caracter);Debug.locals.put("a", _a);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 329;BA.debugLine="parametro=a&parametro";
Debug.ShouldStop(256);
_parametro = RemoteObject.concat(_a,_parametro);Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 330;BA.debugLine="Return parametro";
Debug.ShouldStop(512);
if (true) return _parametro;
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
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
		Debug.PushSubsStack("AddLinea (funcion) ","funcion",3,_ba,funcion.mostCurrent,306);
if (RapidSub.canDelegate("addlinea")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","addlinea", _ba, _parametro, _cantidad);}
RemoteObject _linea = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 306;BA.debugLine="Sub AddLinea(parametro As String,cantidad As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 307;BA.debugLine="Dim linea As String";
Debug.ShouldStop(262144);
_linea = RemoteObject.createImmutable("");Debug.locals.put("linea", _linea);
 BA.debugLineNum = 308;BA.debugLine="If cantidad =0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 310;BA.debugLine="cantidad=48";
Debug.ShouldStop(2097152);
_cantidad = BA.numberCast(int.class, 48);Debug.locals.put("cantidad", _cantidad);
 };
 BA.debugLineNum = 313;BA.debugLine="For i=1 To cantidad";
Debug.ShouldStop(16777216);
{
final int step5 = 1;
final int limit5 = _cantidad.<Integer>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 314;BA.debugLine="linea=linea & parametro";
Debug.ShouldStop(33554432);
_linea = RemoteObject.concat(_linea,_parametro);Debug.locals.put("linea", _linea);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 317;BA.debugLine="Return linea";
Debug.ShouldStop(268435456);
if (true) return _linea;
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
if (RapidSub.canDelegate("arrayimagetojson")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","arrayimagetojson", _ba, _listimagen);}
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
		Debug.PushSubsStack("base64_Decode (funcion) ","funcion",3,_ba,funcion.mostCurrent,218);
if (RapidSub.canDelegate("base64_decode")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","base64_decode", _ba, _text);}
RemoteObject _base64 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.Base64");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 218;BA.debugLine="Sub base64_Decode(text As String) As String";
Debug.ShouldStop(33554432);
 BA.debugLineNum = 219;BA.debugLine="If text = Null Or text.Length = 0 Then";
Debug.ShouldStop(67108864);
if (RemoteObject.solveBoolean("n",_text) || RemoteObject.solveBoolean("=",_text.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 220;BA.debugLine="Return \"\"";
Debug.ShouldStop(134217728);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 223;BA.debugLine="Dim base64 As Base64";
Debug.ShouldStop(1073741824);
_base64 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.Base64");Debug.locals.put("base64", _base64);
 BA.debugLineNum = 224;BA.debugLine="Return base64.DecodeStoS(text,\"UTF-8\")";
Debug.ShouldStop(-2147483648);
if (true) return _base64.runMethod(true,"DecodeStoS",(Object)(_text),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("base64_Encode (funcion) ","funcion",3,_ba,funcion.mostCurrent,213);
if (RapidSub.canDelegate("base64_encode")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","base64_encode", _ba, _text);}
RemoteObject _base64 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.Base64");
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 213;BA.debugLine="Sub base64_Encode(text As String) As String";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 214;BA.debugLine="Dim base64 As Base64";
Debug.ShouldStop(2097152);
_base64 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.Base64");Debug.locals.put("base64", _base64);
 BA.debugLineNum = 215;BA.debugLine="Return base64.EncodeStoS(text,\"UTF-8\")";
Debug.ShouldStop(4194304);
if (true) return _base64.runMethod(true,"EncodeStoS",(Object)(_text),(Object)(RemoteObject.createImmutable("UTF-8")));
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crear_preview(RemoteObject _ba,RemoteObject _scrollviewfotos,RemoteObject _listimagen) throws Exception{
try {
		Debug.PushSubsStack("crear_preview (funcion) ","funcion",3,_ba,funcion.mostCurrent,106);
if (RapidSub.canDelegate("crear_preview")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","crear_preview", _ba, _scrollviewfotos, _listimagen);}
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
		Debug.PushSubsStack("crearJson (funcion) ","funcion",3,_ba,funcion.mostCurrent,201);
if (RapidSub.canDelegate("crearjson")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","crearjson", _ba, _token, _data);}
;
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 201;BA.debugLine="Sub crearJson(token As String,data As String) As S";
Debug.ShouldStop(256);
 BA.debugLineNum = 208;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
Debug.ShouldStop(32768);
if (true) return _crearjson2(_ba,_token,RemoteObject.concat(RemoteObject.createImmutable("{"),_data,RemoteObject.createImmutable("}")));
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("crearJson2 (funcion) ","funcion",3,_ba,funcion.mostCurrent,191);
if (RapidSub.canDelegate("crearjson2")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","crearjson2", _ba, _token, _data);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _b64 = RemoteObject.declareNull("anywheresoftware.b4a.agraham.encryption.Base64");
;
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 191;BA.debugLine="Sub crearJson2(token As String,data As String) As";
Debug.ShouldStop(1073741824);
 BA.debugLineNum = 192;BA.debugLine="Dim json As String";
Debug.ShouldStop(-2147483648);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 193;BA.debugLine="Dim b64 As Base64";
Debug.ShouldStop(1);
_b64 = RemoteObject.createNew ("anywheresoftware.b4a.agraham.encryption.Base64");Debug.locals.put("b64", _b64);
 BA.debugLineNum = 194;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
Debug.ShouldStop(2);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'f_key':'"),_token,RemoteObject.createImmutable("','f_data':"),_data,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 195;BA.debugLine="Log(json)";
Debug.ShouldStop(4);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","43801092",_json,0);
 BA.debugLineNum = 196;BA.debugLine="json = b64.EncodeStoS(json,\"UTF-8\")";
Debug.ShouldStop(8);
_json = _b64.runMethod(true,"EncodeStoS",(Object)(_json),(Object)(RemoteObject.createImmutable("UTF-8")));Debug.locals.put("json", _json);
 BA.debugLineNum = 197;BA.debugLine="Return json";
Debug.ShouldStop(16);
if (true) return _json;
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.ShouldStop(32);
return RemoteObject.createImmutable("");
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
if (RapidSub.canDelegate("disableview")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","disableview", _ba, _tipo, _pan);}
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
 BA.debugLineNum = 169;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("get_descuento (funcion) ","funcion",3,_ba,funcion.mostCurrent,387);
if (RapidSub.canDelegate("get_descuento")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","get_descuento", _ba, _precio, _descuento);}
RemoteObject _precio2 = RemoteObject.createImmutable(0);
;
Debug.locals.put("precio", _precio);
Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 387;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
Debug.ShouldStop(4);
 BA.debugLineNum = 388;BA.debugLine="Dim precio2 As Double";
Debug.ShouldStop(8);
_precio2 = RemoteObject.createImmutable(0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 389;BA.debugLine="precio2 = precio * (descuento / 100)";
Debug.ShouldStop(16);
_precio2 = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_descuento,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 390;BA.debugLine="Return precio2";
Debug.ShouldStop(32);
if (true) return _precio2;
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("get_importe (funcion) ","funcion",3,_ba,funcion.mostCurrent,394);
if (RapidSub.canDelegate("get_importe")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","get_importe", _ba, _cantidad, _precio, _tax);}
RemoteObject _dato = RemoteObject.createImmutable(0);
;
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
 BA.debugLineNum = 394;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
Debug.ShouldStop(512);
 BA.debugLineNum = 395;BA.debugLine="Dim dato As Double";
Debug.ShouldStop(1024);
_dato = RemoteObject.createImmutable(0);Debug.locals.put("dato", _dato);
 BA.debugLineNum = 396;BA.debugLine="dato = ((precio * cantidad) + tax)";
Debug.ShouldStop(2048);
_dato = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,_cantidad}, "*",0, 0)),_tax}, "+",1, 0));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 397;BA.debugLine="Return  dato";
Debug.ShouldStop(4096);
if (true) return _dato;
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.ShouldStop(8192);
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
		Debug.PushSubsStack("get_tax (funcion) ","funcion",3,_ba,funcion.mostCurrent,382);
if (RapidSub.canDelegate("get_tax")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","get_tax", _ba, _precio, _tax, _cantidad);}
;
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 382;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 383;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
Debug.ShouldStop(1073741824);
_tax = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),_cantidad}, "*",0, 0);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 384;BA.debugLine="Return tax";
Debug.ShouldStop(-2147483648);
if (true) return _tax;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.ShouldStop(1);
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
		Debug.PushSubsStack("GetAllContacts (funcion) ","funcion",3,_ba,funcion.mostCurrent,402);
if (RapidSub.canDelegate("getallcontacts")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getallcontacts", _ba);}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper");
RemoteObject _peopleprojection = null;
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _u = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
RemoteObject _crsr = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
 BA.debugLineNum = 402;BA.debugLine="Sub GetAllContacts As String";
Debug.ShouldStop(131072);
 BA.debugLineNum = 403;BA.debugLine="Dim cr As ContentResolver";
Debug.ShouldStop(262144);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper");Debug.locals.put("cr", _cr);
 BA.debugLineNum = 404;BA.debugLine="Private PeopleProjection() As String = Array As S";
Debug.ShouldStop(524288);
_peopleprojection = RemoteObject.createNewArray("String",new int[] {7},new Object[] {BA.ObjectToString("times_contacted"),BA.ObjectToString("last_time_contacted"),BA.ObjectToString("display_name"),BA.ObjectToString("has_phone_number"),BA.ObjectToString("starred"),BA.ObjectToString("_id"),RemoteObject.createImmutable("photo_id")});Debug.locals.put("PeopleProjection", _peopleprojection);Debug.locals.put("PeopleProjection", _peopleprojection);
 BA.debugLineNum = 407;BA.debugLine="Dim json As String = \"[\"";
Debug.ShouldStop(4194304);
_json = BA.ObjectToString("[");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 409;BA.debugLine="Dim u As Uri";
Debug.ShouldStop(16777216);
_u = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("u", _u);
 BA.debugLineNum = 410;BA.debugLine="u.Parse(\"content://com.android.contacts/contacts\"";
Debug.ShouldStop(33554432);
_u.runVoidMethod ("Parse",(Object)(RemoteObject.createImmutable("content://com.android.contacts/contacts")));
 BA.debugLineNum = 411;BA.debugLine="Dim Crsr As Cursor = cr.Query(u, PeopleProjection";
Debug.ShouldStop(67108864);
_crsr = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_crsr = _cr.runMethod(false,"Query",(Object)(_u),(Object)(_peopleprojection),(Object)(BA.ObjectToString("")),(Object)((funcion.mostCurrent.__c.getField(false,"Null"))),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("Crsr", _crsr);Debug.locals.put("Crsr", _crsr);
 BA.debugLineNum = 412;BA.debugLine="For i = 0 To Crsr.RowCount - 1";
Debug.ShouldStop(134217728);
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_crsr.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step7 > 0 && _i <= limit7) || (step7 < 0 && _i >= limit7) ;_i = ((int)(0 + _i + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 413;BA.debugLine="Crsr.Position = i";
Debug.ShouldStop(268435456);
_crsr.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 415;BA.debugLine="json = json & \",{'f_nombre':'\"& base64_Encode(Cr";
Debug.ShouldStop(1073741824);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable(",{'f_nombre':'"),_base64_encode(_ba,_crsr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("display_name")))),RemoteObject.createImmutable("','f_id':'"),_crsr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("_id"))),RemoteObject.createImmutable("','f_phone_list':"),_getphonesbyid(_ba,_crsr.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("_id")))),RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 420;BA.debugLine="Crsr.Close";
Debug.ShouldStop(8);
_crsr.runVoidMethod ("Close");
 BA.debugLineNum = 422;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
Debug.ShouldStop(32);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("[,{")),(Object)(RemoteObject.createImmutable("[{")));Debug.locals.put("json", _json);
 BA.debugLineNum = 423;BA.debugLine="json = json & \"]\"";
Debug.ShouldStop(64);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable("]"));Debug.locals.put("json", _json);
 BA.debugLineNum = 425;BA.debugLine="json = json.Replace(\"'\",Chr(34))";
Debug.ShouldStop(256);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(BA.ObjectToString(funcion.mostCurrent.__c.runMethod(true,"Chr",(Object)(BA.numberCast(int.class, 34))))));Debug.locals.put("json", _json);
 BA.debugLineNum = 427;BA.debugLine="Log(json)";
Debug.ShouldStop(1024);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","44980761",_json,0);
 BA.debugLineNum = 428;BA.debugLine="Return json";
Debug.ShouldStop(2048);
if (true) return _json;
 BA.debugLineNum = 429;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
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
		Debug.PushSubsStack("getByteImagen (funcion) ","funcion",3,_ba,funcion.mostCurrent,288);
if (RapidSub.canDelegate("getbyteimagen")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getbyteimagen", _ba, _bmap);}
RemoteObject _out = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");
RemoteObject _data = null;
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("bmap", _bmap);
 BA.debugLineNum = 288;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 289;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1);
_out = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper");Debug.locals.put("out", _out);
 BA.debugLineNum = 290;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(2);
_data = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("data", _data);
 BA.debugLineNum = 291;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(4);
_out.runVoidMethod ("InitializeToBytesArray",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 292;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
Debug.ShouldStop(8);
_bmap.runVoidMethod ("WriteToStream",(Object)((_out.getObject())),(Object)(BA.numberCast(int.class, 100)),(Object)(BA.getEnumFromString(BA.getDeviceClass("android.graphics.Bitmap.CompressFormat"),RemoteObject.createImmutable("PNG"))));
 BA.debugLineNum = 293;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(16);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 294;BA.debugLine="out.Close";
Debug.ShouldStop(32);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 295;BA.debugLine="out.Flush";
Debug.ShouldStop(64);
_out.runVoidMethod ("Flush");
 BA.debugLineNum = 296;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(128);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 297;BA.debugLine="Return su.EncodeBase64(data)";
Debug.ShouldStop(256);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_data));
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("getByteImagen2 (funcion) ","funcion",3,_ba,funcion.mostCurrent,300);
if (RapidSub.canDelegate("getbyteimagen2")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getbyteimagen2", _ba, _data);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
;
Debug.locals.put("data", _data);
 BA.debugLineNum = 300;BA.debugLine="Sub getByteImagen2(data() As Byte) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 301;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(4096);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 302;BA.debugLine="Return su.EncodeBase64(data)";
Debug.ShouldStop(8192);
if (true) return _su.runMethod(true,"EncodeBase64",(Object)(_data));
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("getDay (funcion) ","funcion",3,_ba,funcion.mostCurrent,171);
if (RapidSub.canDelegate("getday")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getday", _ba, _day);}
;
Debug.locals.put("day", _day);
 BA.debugLineNum = 171;BA.debugLine="Sub getDay(day As Int) As String";
Debug.ShouldStop(1024);
 BA.debugLineNum = 173;BA.debugLine="Select day";
Debug.ShouldStop(4096);
switch (BA.switchObjectToInt(_day,BA.numberCast(int.class, 0),BA.numberCast(int.class, 1),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3),BA.numberCast(int.class, 4),BA.numberCast(int.class, 5),BA.numberCast(int.class, 6))) {
case 0: {
 BA.debugLineNum = 175;BA.debugLine="Return \"Sunday\"";
Debug.ShouldStop(16384);
if (true) return BA.ObjectToString("Sunday");
 break; }
case 1: {
 BA.debugLineNum = 177;BA.debugLine="Return \"Monday\"";
Debug.ShouldStop(65536);
if (true) return BA.ObjectToString("Monday");
 break; }
case 2: {
 BA.debugLineNum = 179;BA.debugLine="Return \"Tuesday\"";
Debug.ShouldStop(262144);
if (true) return BA.ObjectToString("Tuesday");
 break; }
case 3: {
 BA.debugLineNum = 181;BA.debugLine="Return \"Wednesday\"";
Debug.ShouldStop(1048576);
if (true) return BA.ObjectToString("Wednesday");
 break; }
case 4: {
 BA.debugLineNum = 183;BA.debugLine="Return \"Thursday\"";
Debug.ShouldStop(4194304);
if (true) return BA.ObjectToString("Thursday");
 break; }
case 5: {
 BA.debugLineNum = 185;BA.debugLine="Return \"Friday\"";
Debug.ShouldStop(16777216);
if (true) return BA.ObjectToString("Friday");
 break; }
case 6: {
 BA.debugLineNum = 187;BA.debugLine="Return \"Saturday\"";
Debug.ShouldStop(67108864);
if (true) return BA.ObjectToString("Saturday");
 break; }
}
;
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
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
if (RapidSub.canDelegate("getdecimal")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getdecimal", _ba, _n);}
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
		Debug.PushSubsStack("GetDevicePhysicalSize (funcion) ","funcion",3,_ba,funcion.mostCurrent,258);
if (RapidSub.canDelegate("getdevicephysicalsize")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getdevicephysicalsize", _ba);}
RemoteObject _lv = RemoteObject.declareNull("anywheresoftware.b4a.keywords.LayoutValues");
;
 BA.debugLineNum = 258;BA.debugLine="Sub GetDevicePhysicalSize As Float";
Debug.ShouldStop(2);
 BA.debugLineNum = 259;BA.debugLine="Dim lv As LayoutValues";
Debug.ShouldStop(4);
_lv = RemoteObject.createNew ("anywheresoftware.b4a.keywords.LayoutValues");Debug.locals.put("lv", _lv);
 BA.debugLineNum = 260;BA.debugLine="lv = GetDeviceLayoutValues";
Debug.ShouldStop(8);
_lv = funcion.mostCurrent.__c.runMethod(false,"GetDeviceLayoutValues",_ba);Debug.locals.put("lv", _lv);
 BA.debugLineNum = 261;BA.debugLine="Return Sqrt(Power(lv.Height / lv.Scale / 160, 2";
Debug.ShouldStop(16);
if (true) return BA.numberCast(float.class, funcion.mostCurrent.__c.runMethod(true,"Sqrt",(Object)(RemoteObject.solve(new RemoteObject[] {funcion.mostCurrent.__c.runMethod(true,"Power",(Object)(RemoteObject.solve(new RemoteObject[] {_lv.getField(true,"Height"),_lv.getField(true,"Scale"),RemoteObject.createImmutable(160)}, "//",0, 0)),(Object)(BA.numberCast(double.class, 2))),funcion.mostCurrent.__c.runMethod(true,"Power",(Object)(RemoteObject.solve(new RemoteObject[] {_lv.getField(true,"Width"),_lv.getField(true,"Scale"),RemoteObject.createImmutable(160)}, "//",0, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));
 BA.debugLineNum = 262;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
if (RapidSub.canDelegate("getdiferenciacantidad")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getdiferenciacantidad", _ba, _cantidadactual, _cantidadnueva);}
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
		Debug.PushSubsStack("getImagen (funcion) ","funcion",3,_ba,funcion.mostCurrent,264);
if (RapidSub.canDelegate("getimagen")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getimagen", _ba, _imagenb64);}
RemoteObject _su = RemoteObject.declareNull("anywheresoftware.b4a.objects.StringUtils");
RemoteObject _imagen = null;
RemoteObject _inp = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _draw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
;
Debug.locals.put("imagenB64", _imagenb64);
 BA.debugLineNum = 264;BA.debugLine="Sub getImagen(imagenB64 As String) As BitmapDrawab";
Debug.ShouldStop(128);
 BA.debugLineNum = 265;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(256);
_su = RemoteObject.createNew ("anywheresoftware.b4a.objects.StringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 266;BA.debugLine="Dim imagen() As Byte";
Debug.ShouldStop(512);
_imagen = RemoteObject.createNewArray ("byte", new int[] {0}, new Object[]{});Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 267;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
Debug.ShouldStop(1024);
_imagen = _su.runMethod(false,"DecodeBase64",(Object)(_imagenb64));Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 268;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(2048);
_inp = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 269;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(4096);
_inp.runVoidMethod ("InitializeFromBytesArray",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"length")));
 BA.debugLineNum = 270;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(8192);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 271;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(16384);
_bmp.runVoidMethod ("Initialize2",(Object)((_inp.getObject())));
 BA.debugLineNum = 272;BA.debugLine="Dim draw As BitmapDrawable";
Debug.ShouldStop(32768);
_draw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("draw", _draw);
 BA.debugLineNum = 273;BA.debugLine="draw.Initialize(bmp)";
Debug.ShouldStop(65536);
_draw.runVoidMethod ("Initialize",(Object)((_bmp.getObject())));
 BA.debugLineNum = 274;BA.debugLine="Return draw";
Debug.ShouldStop(131072);
if (true) return _draw;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
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
		Debug.PushSubsStack("getImagen2 (funcion) ","funcion",3,_ba,funcion.mostCurrent,277);
if (RapidSub.canDelegate("getimagen2")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getimagen2", _ba, _imagen);}
RemoteObject _inp = RemoteObject.declareNull("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");
RemoteObject _bmp = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");
RemoteObject _draw = RemoteObject.declareNull("anywheresoftware.b4a.objects.drawable.BitmapDrawable");
;
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 277;BA.debugLine="Sub getImagen2(imagen() As Byte) As BitmapDrawable";
Debug.ShouldStop(1048576);
 BA.debugLineNum = 279;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(4194304);
_inp = RemoteObject.createNew ("anywheresoftware.b4a.objects.streams.File.InputStreamWrapper");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 280;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(8388608);
_inp.runVoidMethod ("InitializeFromBytesArray",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"length")));
 BA.debugLineNum = 281;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(16777216);
_bmp = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 282;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(33554432);
_bmp.runVoidMethod ("Initialize2",(Object)((_inp.getObject())));
 BA.debugLineNum = 283;BA.debugLine="Dim draw As BitmapDrawable";
Debug.ShouldStop(67108864);
_draw = RemoteObject.createNew ("anywheresoftware.b4a.objects.drawable.BitmapDrawable");Debug.locals.put("draw", _draw);
 BA.debugLineNum = 284;BA.debugLine="draw.Initialize(bmp)";
Debug.ShouldStop(134217728);
_draw.runVoidMethod ("Initialize",(Object)((_bmp.getObject())));
 BA.debugLineNum = 285;BA.debugLine="Return draw";
Debug.ShouldStop(268435456);
if (true) return _draw;
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
		Debug.PushSubsStack("getPhonesByID (funcion) ","funcion",3,_ba,funcion.mostCurrent,432);
if (RapidSub.canDelegate("getphonesbyid")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getphonesbyid", _ba, _id);}
RemoteObject _cr = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _phonesuri = RemoteObject.declareNull("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");
RemoteObject _phones = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL.CursorWrapper");
int _i = 0;
;
Debug.locals.put("id", _id);
 BA.debugLineNum = 432;BA.debugLine="Sub getPhonesByID(id As String) As String";
Debug.ShouldStop(32768);
 BA.debugLineNum = 433;BA.debugLine="Dim cr As ContentResolver";
Debug.ShouldStop(65536);
_cr = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper");Debug.locals.put("cr", _cr);
 BA.debugLineNum = 434;BA.debugLine="Dim json As String = \"[\"";
Debug.ShouldStop(131072);
_json = BA.ObjectToString("[");Debug.locals.put("json", _json);Debug.locals.put("json", _json);
 BA.debugLineNum = 435;BA.debugLine="Dim phonesUri As Uri";
Debug.ShouldStop(262144);
_phonesuri = RemoteObject.createNew ("anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper");Debug.locals.put("phonesUri", _phonesuri);
 BA.debugLineNum = 436;BA.debugLine="phonesUri.Parse(\"content://com.android.contacts/d";
Debug.ShouldStop(524288);
_phonesuri.runVoidMethod ("Parse",(Object)(RemoteObject.createImmutable("content://com.android.contacts/data/phones")));
 BA.debugLineNum = 437;BA.debugLine="Dim phones As Cursor = cr.Query(phonesUri,  Array";
Debug.ShouldStop(1048576);
_phones = RemoteObject.createNew ("anywheresoftware.b4a.sql.SQL.CursorWrapper");
_phones = _cr.runMethod(false,"Query",(Object)(_phonesuri),(Object)(RemoteObject.createNewArray("String",new int[] {2},new Object[] {BA.ObjectToString("data1"),RemoteObject.createImmutable("data2")})),(Object)(BA.ObjectToString("contact_id = ?")),(Object)(RemoteObject.createNewArray("String",new int[] {1},new Object[] {_id})),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("phones", _phones);Debug.locals.put("phones", _phones);
 BA.debugLineNum = 438;BA.debugLine="For i = 0 To phones.RowCount - 1";
Debug.ShouldStop(2097152);
{
final int step6 = 1;
final int limit6 = RemoteObject.solve(new RemoteObject[] {_phones.runMethod(true,"getRowCount"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = 0 ;
for (;(step6 > 0 && _i <= limit6) || (step6 < 0 && _i >= limit6) ;_i = ((int)(0 + _i + step6))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 439;BA.debugLine="phones.Position = i";
Debug.ShouldStop(4194304);
_phones.runMethod(true,"setPosition",BA.numberCast(int.class, _i));
 BA.debugLineNum = 440;BA.debugLine="json = json & \",{'f_phone_number':'\"&phones.GetS";
Debug.ShouldStop(8388608);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable(",{'f_phone_number':'"),_phones.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data1"))),RemoteObject.createImmutable("','f_type':'"),_phones.runMethod(true,"GetString",(Object)(RemoteObject.createImmutable("data2"))),RemoteObject.createImmutable("'}"));Debug.locals.put("json", _json);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 443;BA.debugLine="phones.Close";
Debug.ShouldStop(67108864);
_phones.runVoidMethod ("Close");
 BA.debugLineNum = 445;BA.debugLine="json =  json.Replace(\"[,{\",\"[{\")";
Debug.ShouldStop(268435456);
_json = _json.runMethod(true,"replace",(Object)(BA.ObjectToString("[,{")),(Object)(RemoteObject.createImmutable("[{")));Debug.locals.put("json", _json);
 BA.debugLineNum = 446;BA.debugLine="json = json & \"]\"";
Debug.ShouldStop(536870912);
_json = RemoteObject.concat(_json,RemoteObject.createImmutable("]"));Debug.locals.put("json", _json);
 BA.debugLineNum = 448;BA.debugLine="Return json";
Debug.ShouldStop(-2147483648);
if (true) return _json;
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.ShouldStop(4);
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
if (RapidSub.canDelegate("getslidemenu")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","getslidemenu", _ba, _sm, _option);}
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
if (RapidSub.canDelegate("recalcular")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","recalcular", _ba, _precio, _descuento, _cantidad, _tax, _impuestoincluido, _exentoimpuesto);}
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
		Debug.PushSubsStack("remplace (funcion) ","funcion",3,_ba,funcion.mostCurrent,376);
if (RapidSub.canDelegate("remplace")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","remplace", _ba, _text);}
;
Debug.locals.put("text", _text);
 BA.debugLineNum = 376;BA.debugLine="Sub remplace(text As String ) As String";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 378;BA.debugLine="text=text.Replace(\"'\",\"´´\")";
Debug.ShouldStop(33554432);
_text = _text.runMethod(true,"replace",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("´´")));Debug.locals.put("text", _text);
 BA.debugLineNum = 379;BA.debugLine="Return text";
Debug.ShouldStop(67108864);
if (true) return _text;
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
public static RemoteObject  _setdivider(RemoteObject _ba,RemoteObject _lv,RemoteObject _color,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("SetDivider (funcion) ","funcion",3,_ba,funcion.mostCurrent,9);
if (RapidSub.canDelegate("setdivider")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","setdivider", _ba, _lv, _color, _height);}
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
public static RemoteObject  _slidemenu_click(RemoteObject _ba,RemoteObject _item,RemoteObject _act) throws Exception{
try {
		Debug.PushSubsStack("SlideMenu_Click (funcion) ","funcion",3,_ba,funcion.mostCurrent,77);
if (RapidSub.canDelegate("slidemenu_click")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","slidemenu_click", _ba, _item, _act);}
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
		Debug.PushSubsStack("titulo (funcion) ","funcion",3,_ba,funcion.mostCurrent,353);
if (RapidSub.canDelegate("titulo")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","titulo", _ba, _parametro, _limite);}
RemoteObject _espacio = RemoteObject.createImmutable("");
RemoteObject _totals = RemoteObject.createImmutable("");
RemoteObject _cal = RemoteObject.createImmutable(0);
int _i = 0;
;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 353;BA.debugLine="Sub titulo(parametro As String,limite As Int) As S";
Debug.ShouldStop(1);
 BA.debugLineNum = 354;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(2);
_espacio = RemoteObject.createImmutable("");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 354;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(2);
_espacio = BA.ObjectToString(" ");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 355;BA.debugLine="Dim totals As String : totals=\"\"";
Debug.ShouldStop(4);
_totals = RemoteObject.createImmutable("");Debug.locals.put("totals", _totals);
 BA.debugLineNum = 355;BA.debugLine="Dim totals As String : totals=\"\"";
Debug.ShouldStop(4);
_totals = BA.ObjectToString("");Debug.locals.put("totals", _totals);
 BA.debugLineNum = 356;BA.debugLine="Dim cal As Double";
Debug.ShouldStop(8);
_cal = RemoteObject.createImmutable(0);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 357;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(16);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 358;BA.debugLine="limite=48";
Debug.ShouldStop(32);
_limite = BA.numberCast(int.class, 48);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 361;BA.debugLine="If parametro.Length<limite Then";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("<",_parametro.runMethod(true,"length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 362;BA.debugLine="cal=limite-parametro.Length";
Debug.ShouldStop(512);
_cal = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"length")}, "-",1, 1));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 363;BA.debugLine="cal= cal/2";
Debug.ShouldStop(1024);
_cal = RemoteObject.solve(new RemoteObject[] {_cal,RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 365;BA.debugLine="For i=1 To Round(cal)";
Debug.ShouldStop(4096);
{
final int step12 = 1;
final int limit12 = (int) (0 + funcion.mostCurrent.__c.runMethod(true,"Round",(Object)(_cal)).<Long>get().longValue());
_i = 1 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 366;BA.debugLine="totals=espacio& totals";
Debug.ShouldStop(8192);
_totals = RemoteObject.concat(_espacio,_totals);Debug.locals.put("totals", _totals);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 368;BA.debugLine="parametro=totals&parametro";
Debug.ShouldStop(32768);
_parametro = RemoteObject.concat(_totals,_parametro);Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 369;BA.debugLine="Return parametro";
Debug.ShouldStop(65536);
if (true) return _parametro;
 }else {
 BA.debugLineNum = 371;BA.debugLine="Return parametro";
Debug.ShouldStop(262144);
if (true) return _parametro;
 };
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("V (funcion) ","funcion",3,_ba,funcion.mostCurrent,333);
if (RapidSub.canDelegate("v")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","v", _ba, _parametro, _limite);}
RemoteObject _espacio = RemoteObject.createImmutable("");
int _i = 0;
;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 333;BA.debugLine="Sub V (parametro As String,limite As Int) As Strin";
Debug.ShouldStop(4096);
 BA.debugLineNum = 334;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 336;BA.debugLine="limite=47";
Debug.ShouldStop(32768);
_limite = BA.numberCast(int.class, 47);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 339;BA.debugLine="If parametro.Length>limite Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean(">",_parametro.runMethod(true,"length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 340;BA.debugLine="parametro=parametro.SubString2(0,limite-2)&\"..\"";
Debug.ShouldStop(524288);
_parametro = RemoteObject.concat(_parametro.runMethod(true,"substring",(Object)(BA.numberCast(int.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_limite,RemoteObject.createImmutable(2)}, "-",1, 1))),RemoteObject.createImmutable(".."));Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 341;BA.debugLine="Return parametro";
Debug.ShouldStop(1048576);
if (true) return _parametro;
 }else 
{ BA.debugLineNum = 343;BA.debugLine="Else if parametro.Length<limite Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("<",_parametro.runMethod(true,"length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 344;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(8388608);
_espacio = RemoteObject.createImmutable("");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 344;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(8388608);
_espacio = BA.ObjectToString(" ");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 345;BA.debugLine="For i=1 To (limite-parametro.Length)";
Debug.ShouldStop(16777216);
{
final int step10 = 1;
final int limit10 = (RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"length")}, "-",1, 1)).<Integer>get().intValue();
_i = 1 ;
for (;(step10 > 0 && _i <= limit10) || (step10 < 0 && _i >= limit10) ;_i = ((int)(0 + _i + step10))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 346;BA.debugLine="parametro=parametro&espacio";
Debug.ShouldStop(33554432);
_parametro = RemoteObject.concat(_parametro,_espacio);Debug.locals.put("parametro", _parametro);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 348;BA.debugLine="Return parametro";
Debug.ShouldStop(134217728);
if (true) return _parametro;
 }}
;
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("verificarJob (funcion) ","funcion",3,_ba,funcion.mostCurrent,227);
if (RapidSub.canDelegate("verificarjob")) { return com.menube.app.funcion.remoteMe.runUserSub(false, "funcion","verificarjob", _ba, _job);}
RemoteObject _map = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _json = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.JSONParser");
RemoteObject _confirm = RemoteObject.createImmutable("");
;
Debug.locals.put("job", _job);
 BA.debugLineNum = 227;BA.debugLine="Sub verificarJob(job As String) As Boolean";
Debug.ShouldStop(4);
 BA.debugLineNum = 229;BA.debugLine="job = base64_Decode(job)";
Debug.ShouldStop(16);
_job = _base64_decode(_ba,_job);Debug.locals.put("job", _job);
 BA.debugLineNum = 230;BA.debugLine="Dim map As Map";
Debug.ShouldStop(32);
_map = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("map", _map);
 BA.debugLineNum = 231;BA.debugLine="Log(job)";
Debug.ShouldStop(64);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","44063236",_job,0);
 BA.debugLineNum = 232;BA.debugLine="Dim Json As JSONParser";
Debug.ShouldStop(128);
_json = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.JSONParser");Debug.locals.put("Json", _json);
 BA.debugLineNum = 233;BA.debugLine="Json.Initialize(job)";
Debug.ShouldStop(256);
_json.runVoidMethod ("Initialize",(Object)(_job));
 BA.debugLineNum = 234;BA.debugLine="map=Json.NextObject";
Debug.ShouldStop(512);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 235;BA.debugLine="Dim confirm As String";
Debug.ShouldStop(1024);
_confirm = RemoteObject.createImmutable("");Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 236;BA.debugLine="confirm=map.Get(\"f_key\")";
Debug.ShouldStop(2048);
_confirm = BA.ObjectToString(_map.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("f_key")))));Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 238;BA.debugLine="If confirm=\"-1\" Then";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-1"))) { 
 BA.debugLineNum = 239;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
Debug.ShouldStop(16384);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Usuario o contraseña incorrectos.")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),_ba);
 BA.debugLineNum = 240;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 241;BA.debugLine="else if confirm=\"-2\" Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-2"))) { 
 BA.debugLineNum = 242;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"\")";
Debug.ShouldStop(131072);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Este usuario esta desactivado")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable(""))),_ba);
 BA.debugLineNum = 243;BA.debugLine="Return False";
Debug.ShouldStop(262144);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 244;BA.debugLine="else if confirm=\"-3\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-3"))) { 
 BA.debugLineNum = 245;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
Debug.ShouldStop(1048576);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("Este usuario ya existe")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Información"))),_ba);
 BA.debugLineNum = 246;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }else 
{ BA.debugLineNum = 247;BA.debugLine="else if confirm=\"-4\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-4"))) { 
 BA.debugLineNum = 249;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
Debug.ShouldStop(16777216);
funcion.mostCurrent.__c.runVoidMethodAndSync ("Msgbox",(Object)(BA.ObjectToCharSequence("**The print is not finish yet")),(Object)(BA.ObjectToCharSequence(RemoteObject.createImmutable("Information"))),_ba);
 BA.debugLineNum = 250;BA.debugLine="Log(job)";
Debug.ShouldStop(33554432);
funcion.mostCurrent.__c.runVoidMethod ("LogImpl","44063255",_job,0);
 BA.debugLineNum = 251;BA.debugLine="Return False";
Debug.ShouldStop(67108864);
if (true) return funcion.mostCurrent.__c.getField(true,"False");
 }}}}
;
 BA.debugLineNum = 254;BA.debugLine="Return True";
Debug.ShouldStop(536870912);
if (true) return funcion.mostCurrent.__c.getField(true,"True");
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}