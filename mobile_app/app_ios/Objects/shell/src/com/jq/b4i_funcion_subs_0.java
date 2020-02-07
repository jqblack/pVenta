package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_funcion_subs_0 {


public static RemoteObject  _a_la_derecha(RemoteObject _caracter,RemoteObject _parametro,RemoteObject _limite) throws Exception{
try {
		Debug.PushSubsStack("A_la_Derecha (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,224);
if (RapidSub.canDelegate("a_la_derecha")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","a_la_derecha", _caracter, _parametro, _limite);}
RemoteObject _a = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("caracter", _caracter);
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 224;BA.debugLine="Sub A_la_Derecha(caracter As String, parametro As";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 225;BA.debugLine="Dim a As String";
Debug.ShouldStop(1);
_a = RemoteObject.createImmutable("");Debug.locals.put("a", _a);
 BA.debugLineNum = 226;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(2);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 228;BA.debugLine="limite=48";
Debug.ShouldStop(8);
_limite = BA.numberCast(int.class, 48);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 230;BA.debugLine="For i=1 To (limite - parametro.Length)";
Debug.ShouldStop(32);
{
final int step5 = 1;
final int limit5 = (RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"Length")}, "-",1, 1)).<Number>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 231;BA.debugLine="a=a&caracter";
Debug.ShouldStop(64);
_a = RemoteObject.concat(_a,_caracter);Debug.locals.put("a", _a);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 233;BA.debugLine="parametro=a&parametro";
Debug.ShouldStop(256);
_parametro = RemoteObject.concat(_a,_parametro);Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 234;BA.debugLine="Return parametro";
Debug.ShouldStop(512);
if (true) return _parametro;
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlinea(RemoteObject _parametro,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("AddLinea (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,210);
if (RapidSub.canDelegate("addlinea")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","addlinea", _parametro, _cantidad);}
RemoteObject _linea = RemoteObject.createImmutable("");
int _i = 0;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 210;BA.debugLine="Sub AddLinea(parametro As String,cantidad As Int)";
Debug.ShouldStop(131072);
 BA.debugLineNum = 211;BA.debugLine="Dim linea As String";
Debug.ShouldStop(262144);
_linea = RemoteObject.createImmutable("");Debug.locals.put("linea", _linea);
 BA.debugLineNum = 212;BA.debugLine="If cantidad =0 Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_cantidad,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 214;BA.debugLine="cantidad=48";
Debug.ShouldStop(2097152);
_cantidad = BA.numberCast(int.class, 48);Debug.locals.put("cantidad", _cantidad);
 };
 BA.debugLineNum = 217;BA.debugLine="For i=1 To cantidad";
Debug.ShouldStop(16777216);
{
final int step5 = 1;
final int limit5 = _cantidad.<Number>get().intValue();
_i = 1 ;
for (;(step5 > 0 && _i <= limit5) || (step5 < 0 && _i >= limit5) ;_i = ((int)(0 + _i + step5))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 218;BA.debugLine="linea=linea & parametro";
Debug.ShouldStop(33554432);
_linea = RemoteObject.concat(_linea,_parametro);Debug.locals.put("linea", _linea);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 221;BA.debugLine="Return linea";
Debug.ShouldStop(268435456);
if (true) return _linea;
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64_decode(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("base64_Decode (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,118);
if (RapidSub.canDelegate("base64_decode")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","base64_decode", _text);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
RemoteObject _b = null;
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("text", _text);
 BA.debugLineNum = 118;BA.debugLine="Sub base64_Decode(text As String) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 119;BA.debugLine="If text = Null Or text.Length = 0 Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("n",_text) || RemoteObject.solveBoolean("=",_text.runMethod(true,"Length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 120;BA.debugLine="Return \"\"";
Debug.ShouldStop(8388608);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 123;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(67108864);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 124;BA.debugLine="Dim b() As Byte = su.DecodeBase64(text)";
Debug.ShouldStop(134217728);
_b = _su.runMethod(false,"DecodeBase64:",(Object)(_text));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 126;BA.debugLine="Dim res As String = BytesToString(b , 0, b.Length";
Debug.ShouldStop(536870912);
_res = b4i_main.__c.runMethod(true,"BytesToString::::",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"Length")),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 128;BA.debugLine="Return res";
Debug.ShouldStop(-2147483648);
if (true) return _res;
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _base64_encode(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("base64_Encode (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,111);
if (RapidSub.canDelegate("base64_encode")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","base64_encode", _text);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
Debug.locals.put("text", _text);
 BA.debugLineNum = 111;BA.debugLine="Sub base64_Encode(text As String) As String";
Debug.ShouldStop(16384);
 BA.debugLineNum = 113;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(65536);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 114;BA.debugLine="Return  su.EncodeBase64(text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(131072);
if (true) return _su.runMethod(true,"EncodeBase64:",(Object)(_text.runMethod(false,"GetBytes:",(Object)(RemoteObject.createImmutable("UTF8")))));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearjson(RemoteObject _token,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("crearJson (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,99);
if (RapidSub.canDelegate("crearjson")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","crearjson", _token, _data);}
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 99;BA.debugLine="Sub crearJson(token As String,data As String) As S";
Debug.ShouldStop(4);
 BA.debugLineNum = 106;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
Debug.ShouldStop(512);
if (true) return _crearjson2(_token,RemoteObject.concat(RemoteObject.createImmutable("{"),_data,RemoteObject.createImmutable("}")));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.ShouldStop(2048);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _crearjson2(RemoteObject _token,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("crearJson2 (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,88);
if (RapidSub.canDelegate("crearjson2")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","crearjson2", _token, _data);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 88;BA.debugLine="Sub crearJson2(token As String,data As String) As";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 89;BA.debugLine="Dim json As String";
Debug.ShouldStop(16777216);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 90;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(33554432);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 92;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
Debug.ShouldStop(134217728);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'f_key':'"),_token,RemoteObject.createImmutable("','f_data':"),_data,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 93;BA.debugLine="Log(json)";
Debug.ShouldStop(268435456);
b4i_main.__c.runVoidMethod ("LogImpl:::","42621445",_json,0);
 BA.debugLineNum = 94;BA.debugLine="json = su.EncodeBase64(json.GetBytes(\"UTF8\") )";
Debug.ShouldStop(536870912);
_json = _su.runMethod(true,"EncodeBase64:",(Object)(_json.runMethod(false,"GetBytes:",(Object)(RemoteObject.createImmutable("UTF8")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 95;BA.debugLine="Return json";
Debug.ShouldStop(1073741824);
if (true) return _json;
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.ShouldStop(-2147483648);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disableview(RemoteObject _tipo,RemoteObject _pan) throws Exception{
try {
		Debug.PushSubsStack("DisableView (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,70);
if (RapidSub.canDelegate("disableview")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","disableview", _tipo, _pan);}
RemoteObject _n = RemoteObject.declareNull("B4IViewWrapper");
RemoteObject _listv = RemoteObject.declareNull("B4IScrollView");
Debug.locals.put("tipo", _tipo);
Debug.locals.put("pan", _pan);
 BA.debugLineNum = 70;BA.debugLine="Sub DisableView(tipo As Boolean, pan As Panel)";
Debug.ShouldStop(32);
 BA.debugLineNum = 72;BA.debugLine="For Each n As View In pan";
Debug.ShouldStop(128);
_n = RemoteObject.createNew ("B4IViewWrapper");
{
final RemoteObject group1 = _pan;
final int groupLen1 = group1.runMethod(true,"Size").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_n.setObject(group1.runMethod(false,"Get:",index1));
Debug.locals.put("n", _n);
 BA.debugLineNum = 74;BA.debugLine="Select GetType(n)";
Debug.ShouldStop(512);
switch (BA.switchObjectToInt(b4i_main.__c.runMethod(true,"GetType:",(Object)(((_n).getObject()))),BA.ObjectToString("anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView"),BA.ObjectToString("anywheresoftware.b4a.BALayout"))) {
case 0: {
 BA.debugLineNum = 77;BA.debugLine="Dim listV As ScrollView = n";
Debug.ShouldStop(4096);
_listv = RemoteObject.createNew ("B4IScrollView");
_listv.setObject((_n).getObject());Debug.locals.put("listV", _listv);
 BA.debugLineNum = 78;BA.debugLine="DisableView(tipo,listV.Panel)";
Debug.ShouldStop(8192);
_disableview(_tipo,_listv.runMethod(false,"Panel"));
 break; }
case 1: {
 BA.debugLineNum = 81;BA.debugLine="DisableView(tipo,n)";
Debug.ShouldStop(65536);
_disableview(_tipo,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IPanelWrapper"), (_n).getObject()));
 break; }
}
;
 }
}Debug.locals.put("n", _n);
;
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_descuento(RemoteObject _precio,RemoteObject _descuento) throws Exception{
try {
		Debug.PushSubsStack("get_descuento (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,271);
if (RapidSub.canDelegate("get_descuento")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","get_descuento", _precio, _descuento);}
RemoteObject _precio2 = RemoteObject.createImmutable(0.0);
Debug.locals.put("precio", _precio);
Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 271;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
Debug.ShouldStop(16384);
 BA.debugLineNum = 272;BA.debugLine="Dim precio2 As Double";
Debug.ShouldStop(32768);
_precio2 = RemoteObject.createImmutable(0.0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 273;BA.debugLine="precio2 = precio * (descuento / 100)";
Debug.ShouldStop(65536);
_precio2 = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_descuento,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 274;BA.debugLine="Return precio2";
Debug.ShouldStop(131072);
if (true) return _precio2;
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.ShouldStop(262144);
return RemoteObject.createImmutable(0.0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_importe(RemoteObject _cantidad,RemoteObject _precio,RemoteObject _tax) throws Exception{
try {
		Debug.PushSubsStack("get_importe (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,278);
if (RapidSub.canDelegate("get_importe")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","get_importe", _cantidad, _precio, _tax);}
RemoteObject _dato = RemoteObject.createImmutable(0.0);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
 BA.debugLineNum = 278;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 279;BA.debugLine="Dim dato As Double";
Debug.ShouldStop(4194304);
_dato = RemoteObject.createImmutable(0.0);Debug.locals.put("dato", _dato);
 BA.debugLineNum = 280;BA.debugLine="dato = ((precio * cantidad) + tax)";
Debug.ShouldStop(8388608);
_dato = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,_cantidad}, "*",0, 0)),_tax}, "+",1, 0));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 281;BA.debugLine="Return  dato";
Debug.ShouldStop(16777216);
if (true) return _dato;
 BA.debugLineNum = 282;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable(0.0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_tax(RemoteObject _precio,RemoteObject _tax,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("get_tax (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,266);
if (RapidSub.canDelegate("get_tax")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","get_tax", _precio, _tax, _cantidad);}
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 266;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
Debug.ShouldStop(512);
 BA.debugLineNum = 267;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
Debug.ShouldStop(1024);
_tax = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),_cantidad}, "*",0, 0);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 268;BA.debugLine="Return tax";
Debug.ShouldStop(2048);
if (true) return _tax;
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.ShouldStop(4096);
return RemoteObject.createImmutable(0.0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbyteimagen(RemoteObject _bmap) throws Exception{
try {
		Debug.PushSubsStack("getByteImagen (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,192);
if (RapidSub.canDelegate("getbyteimagen")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","getbyteimagen", _bmap);}
RemoteObject _out = RemoteObject.declareNull("B4IOutputStream");
RemoteObject _data = null;
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
Debug.locals.put("bmap", _bmap);
 BA.debugLineNum = 192;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As String";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 193;BA.debugLine="Dim out As OutputStream";
Debug.ShouldStop(1);
_out = RemoteObject.createNew ("B4IOutputStream");Debug.locals.put("out", _out);
 BA.debugLineNum = 194;BA.debugLine="Dim data() As Byte";
Debug.ShouldStop(2);
_data = RemoteObject.createNew("B4IArray").runMethod(false, "initBytes:", (Object)new RemoteObject[] {BA.numberCast(int.class, 0)});Debug.locals.put("data", _data);
 BA.debugLineNum = 195;BA.debugLine="out.InitializeToBytesArray(1)";
Debug.ShouldStop(4);
_out.runVoidMethod ("InitializeToBytesArray:",(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 196;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
Debug.ShouldStop(8);
_bmap.runVoidMethod ("WriteToStream:::",(Object)(_out),(Object)(BA.numberCast(int.class, 100)),(Object)(RemoteObject.createImmutable("PNG")));
 BA.debugLineNum = 197;BA.debugLine="data = out.ToBytesArray";
Debug.ShouldStop(16);
_data = _out.runMethod(false,"ToBytesArray");Debug.locals.put("data", _data);
 BA.debugLineNum = 198;BA.debugLine="out.Close";
Debug.ShouldStop(32);
_out.runVoidMethod ("Close");
 BA.debugLineNum = 200;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(128);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 201;BA.debugLine="Return su.EncodeBase64(data)";
Debug.ShouldStop(256);
if (true) return _su.runMethod(true,"EncodeBase64:",(Object)(_data));
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbyteimagen2(RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("getByteImagen2 (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,204);
if (RapidSub.canDelegate("getbyteimagen2")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","getbyteimagen2", _data);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
Debug.locals.put("data", _data);
 BA.debugLineNum = 204;BA.debugLine="Sub getByteImagen2(data() As Byte) As String";
Debug.ShouldStop(2048);
 BA.debugLineNum = 205;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(4096);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 206;BA.debugLine="Return su.EncodeBase64(data)";
Debug.ShouldStop(8192);
if (true) return _su.runMethod(true,"EncodeBase64:",(Object)(_data));
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdevicephysicalsize() throws Exception{
try {
		Debug.PushSubsStack("GetDevicePhysicalSize (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,164);
if (RapidSub.canDelegate("getdevicephysicalsize")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","getdevicephysicalsize");}
RemoteObject _lv = RemoteObject.declareNull("B4ILayoutValues");
 BA.debugLineNum = 164;BA.debugLine="Sub GetDevicePhysicalSize As Float";
Debug.ShouldStop(8);
 BA.debugLineNum = 165;BA.debugLine="Dim lv As LayoutValues";
Debug.ShouldStop(16);
_lv = RemoteObject.createNew ("B4ILayoutValues");Debug.locals.put("lv", _lv);
 BA.debugLineNum = 166;BA.debugLine="lv = GetDeviceLayoutValues";
Debug.ShouldStop(32);
_lv = b4i_main.__c.runMethod(false,"GetDeviceLayoutValues");Debug.locals.put("lv", _lv);
 BA.debugLineNum = 167;BA.debugLine="Return Sqrt(Power(lv.Height / lv.Scale / 160, 2";
Debug.ShouldStop(64);
if (true) return BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Sqrt:",(Object)(RemoteObject.solve(new RemoteObject[] {b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {_lv.runMethod(true,"Height"),_lv.runMethod(true,"Scale"),RemoteObject.createImmutable(160)}, "//",0, 0)),(Object)(BA.numberCast(double.class, 2))),b4i_main.__c.runMethod(true,"Power::",(Object)(RemoteObject.solve(new RemoteObject[] {_lv.runMethod(true,"Width"),_lv.runMethod(true,"Scale"),RemoteObject.createImmutable(160)}, "//",0, 0)),(Object)(BA.numberCast(double.class, 2)))}, "+",1, 0))));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable(0.0f);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdiferenciacantidad(RemoteObject _cantidadactual,RemoteObject _cantidadnueva) throws Exception{
try {
		Debug.PushSubsStack("getDiferenciaCantidad (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,38);
if (RapidSub.canDelegate("getdiferenciacantidad")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","getdiferenciacantidad", _cantidadactual, _cantidadnueva);}
Debug.locals.put("cantidadActual", _cantidadactual);
Debug.locals.put("cantidadNueva", _cantidadnueva);
 BA.debugLineNum = 38;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
Debug.ShouldStop(32);
 BA.debugLineNum = 40;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean(">",_cantidadnueva,_cantidadactual) && RemoteObject.solveBoolean("<",_cantidadactual,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 41;BA.debugLine="cantidadActual = cantidadActual*-1";
Debug.ShouldStop(256);
_cantidadactual = BA.numberCast(double.class, _cantidadactual.<Number>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("cantidadActual", _cantidadactual);
 }else {
 BA.debugLineNum = 43;BA.debugLine="If cantidadActual > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",_cantidadactual,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 44;BA.debugLine="cantidadActual = cantidadActual*-1";
Debug.ShouldStop(2048);
_cantidadactual = BA.numberCast(double.class, _cantidadactual.<Number>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("cantidadActual", _cantidadactual);
 };
 };
 BA.debugLineNum = 48;BA.debugLine="Return cantidadActual";
Debug.ShouldStop(32768);
if (true) return _cantidadactual;
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
return RemoteObject.createImmutable(0.0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimagen(RemoteObject _imagenb64) throws Exception{
try {
		Debug.PushSubsStack("getImagen (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,170);
if (RapidSub.canDelegate("getimagen")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","getimagen", _imagenb64);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
RemoteObject _imagen = null;
RemoteObject _inp = RemoteObject.declareNull("B4IInputStream");
RemoteObject _bmp = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("imagenB64", _imagenb64);
 BA.debugLineNum = 170;BA.debugLine="Sub getImagen(imagenB64 As String) As Bitmap";
Debug.ShouldStop(512);
 BA.debugLineNum = 171;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1024);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 172;BA.debugLine="Dim imagen() As Byte";
Debug.ShouldStop(2048);
_imagen = RemoteObject.createNew("B4IArray").runMethod(false, "initBytes:", (Object)new RemoteObject[] {BA.numberCast(int.class, 0)});Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 173;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
Debug.ShouldStop(4096);
_imagen = _su.runMethod(false,"DecodeBase64:",(Object)(_imagenb64));Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 174;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(8192);
_inp = RemoteObject.createNew ("B4IInputStream");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 175;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(16384);
_inp.runVoidMethod ("InitializeFromBytesArray:::",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"Length")));
 BA.debugLineNum = 176;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(32768);
_bmp = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 177;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(65536);
_bmp.runVoidMethod ("Initialize2:",(Object)(_inp));
 BA.debugLineNum = 179;BA.debugLine="Return bmp";
Debug.ShouldStop(262144);
if (true) return _bmp;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getimagen2(RemoteObject _imagen) throws Exception{
try {
		Debug.PushSubsStack("getImagen2 (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,182);
if (RapidSub.canDelegate("getimagen2")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","getimagen2", _imagen);}
RemoteObject _inp = RemoteObject.declareNull("B4IInputStream");
RemoteObject _bmp = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 182;BA.debugLine="Sub getImagen2(imagen() As Byte) As Bitmap";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 184;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(8388608);
_inp = RemoteObject.createNew ("B4IInputStream");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 185;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(16777216);
_inp.runVoidMethod ("InitializeFromBytesArray:::",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"Length")));
 BA.debugLineNum = 186;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(33554432);
_bmp = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 187;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(67108864);
_bmp.runVoidMethod ("Initialize2:",(Object)(_inp));
 BA.debugLineNum = 189;BA.debugLine="Return bmp";
Debug.ShouldStop(268435456);
if (true) return _bmp;
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _isfirstresponder(RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("IsFirstResponder (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,302);
if (RapidSub.canDelegate("isfirstresponder")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","isfirstresponder", _v);}
Debug.locals.put("V", _v);
 BA.debugLineNum = 302;BA.debugLine="Sub IsFirstResponder(V As NativeObject) As Boolean";
Debug.ShouldStop(8192);
 BA.debugLineNum = 303;BA.debugLine="If V.RunMethod(\"isFirstResponder\",Null) = 1 Then";
Debug.ShouldStop(16384);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("isFirstResponder")),(Object)((b4i_main.__c.runMethod(false,"Null")))),RemoteObject.createImmutable(1))) { 
if (true) return b4i_main.__c.runMethod(true,"True");};
 BA.debugLineNum = 304;BA.debugLine="Return False";
Debug.ShouldStop(32768);
if (true) return b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _keyboardstatechanged(RemoteObject _height,RemoteObject _page1,RemoteObject _top) throws Exception{
try {
		Debug.PushSubsStack("KeyboardStateChanged (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,285);
if (RapidSub.canDelegate("keyboardstatechanged")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","keyboardstatechanged", _height, _page1, _top);}
RemoteObject _v = RemoteObject.declareNull("B4IViewWrapper");
Debug.locals.put("Height", _height);
Debug.locals.put("Page1", _page1);
Debug.locals.put("Top", _top);
 BA.debugLineNum = 285;BA.debugLine="Sub KeyboardStateChanged (Height As Float, Page1 A";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 287;BA.debugLine="If Top = -1 Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("=",_top,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 288;BA.debugLine="Top = 20";
Debug.ShouldStop(-2147483648);
_top = BA.numberCast(double.class, 20);Debug.locals.put("Top", _top);
 };
 BA.debugLineNum = 291;BA.debugLine="If Height = 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 292;BA.debugLine="Page1.RootPanel.SetLayoutAnimated(200,1,Page1.Ro";
Debug.ShouldStop(8);
_page1.runMethod(false,"RootPanel").runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(float.class, 1)),(Object)(_page1.runMethod(false,"RootPanel").runMethod(true,"Left")),(Object)(BA.numberCast(float.class, _top)),(Object)(_page1.runMethod(false,"RootPanel").runMethod(true,"Width")),(Object)(_page1.runMethod(false,"RootPanel").runMethod(true,"Height")));
 }else {
 BA.debugLineNum = 294;BA.debugLine="For Each V As View In Page1.RootPanel.GetAllView";
Debug.ShouldStop(32);
_v = RemoteObject.createNew ("B4IViewWrapper");
{
final RemoteObject group7 = _page1.runMethod(false,"RootPanel").runMethod(false,"GetAllViewsRecursive");
final int groupLen7 = group7.runMethod(true,"Size").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject(group7.runMethod(false,"Get:",index7));
Debug.locals.put("V", _v);
 BA.debugLineNum = 295;BA.debugLine="If IsFirstResponder(V) Then";
Debug.ShouldStop(64);
if (_isfirstresponder(BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4INativeObject"), (_v).getObject())).getBoolean()) { 
 BA.debugLineNum = 296;BA.debugLine="Page1.RootPanel.Top = Min(0,Page1.RootPanel.To";
Debug.ShouldStop(128);
_page1.runMethod(false,"RootPanel").runMethod(true,"setTop:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_page1.runMethod(false,"RootPanel").runMethod(true,"Top"),b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 3))),(RemoteObject.solve(new RemoteObject[] {_height,(RemoteObject.solve(new RemoteObject[] {_page1.runMethod(false,"RootPanel").runMethod(true,"Height"),(RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"Top"),_v.runMethod(true,"Height")}, "+",1, 0))}, "-",1, 0))}, "-",1, 0))}, "--",2, 0)))));
 };
 }
}Debug.locals.put("V", _v);
;
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recalcular(RemoteObject _precio,RemoteObject _descuento,RemoteObject _cantidad,RemoteObject _tax,RemoteObject _impuestoincluido,RemoteObject _exentoimpuesto) throws Exception{
try {
		Debug.PushSubsStack("recalcular (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,9);
if (RapidSub.canDelegate("recalcular")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","recalcular", _precio, _descuento, _cantidad, _tax, _impuestoincluido, _exentoimpuesto);}
RemoteObject _precio_para_mostrar = RemoteObject.createImmutable(0.0);
RemoteObject _preciodescuento = RemoteObject.createImmutable(0.0);
RemoteObject _total = RemoteObject.createImmutable(0.0);
RemoteObject _map = RemoteObject.declareNull("B4IMap");
Debug.locals.put("precio", _precio);
Debug.locals.put("descuento", _descuento);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("tax", _tax);
Debug.locals.put("impuestoIncluido", _impuestoincluido);
Debug.locals.put("exentoImpuesto", _exentoimpuesto);
 BA.debugLineNum = 9;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
Debug.ShouldStop(256);
 BA.debugLineNum = 11;BA.debugLine="If exentoImpuesto Then";
Debug.ShouldStop(1024);
if (_exentoimpuesto.getBoolean()) { 
 BA.debugLineNum = 12;BA.debugLine="tax = 0";
Debug.ShouldStop(2048);
_tax = BA.numberCast(double.class, 0);Debug.locals.put("tax", _tax);
 };
 BA.debugLineNum = 15;BA.debugLine="Dim precio_para_mostrar As Double = precio";
Debug.ShouldStop(16384);
_precio_para_mostrar = _precio;Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);
 BA.debugLineNum = 16;BA.debugLine="If (impuestoIncluido) Then";
Debug.ShouldStop(32768);
if ((_impuestoincluido).getBoolean()) { 
 BA.debugLineNum = 17;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
Debug.ShouldStop(65536);
_precio_para_mostrar = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0)),RemoteObject.createImmutable(1)}, "+",1, 0))}, "/",0, 0);Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);
 };
 BA.debugLineNum = 21;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
Debug.ShouldStop(1048576);
_descuento = _get_descuento(_precio_para_mostrar,_descuento);Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 22;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
Debug.ShouldStop(2097152);
_preciodescuento = RemoteObject.solve(new RemoteObject[] {_precio_para_mostrar,_descuento}, "-",1, 0);Debug.locals.put("precioDescuento", _preciodescuento);Debug.locals.put("precioDescuento", _preciodescuento);
 BA.debugLineNum = 24;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
Debug.ShouldStop(8388608);
_tax = _get_tax(_preciodescuento,_tax,_cantidad);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 25;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
Debug.ShouldStop(16777216);
_total = _get_importe(_cantidad,_preciodescuento,_tax);Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 27;BA.debugLine="Dim map As Map";
Debug.ShouldStop(67108864);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 28;BA.debugLine="map.Initialize";
Debug.ShouldStop(134217728);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
Debug.ShouldStop(268435456);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_precio_para_mostrar"))),(Object)((_precio_para_mostrar)));
 BA.debugLineNum = 30;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
Debug.ShouldStop(536870912);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_tax"))),(Object)((_tax)));
 BA.debugLineNum = 31;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
Debug.ShouldStop(1073741824);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_descuento"))),(Object)((_descuento)));
 BA.debugLineNum = 32;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
Debug.ShouldStop(-2147483648);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_total"))),(Object)((_total)));
 BA.debugLineNum = 35;BA.debugLine="Return map";
Debug.ShouldStop(4);
if (true) return _map;
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _remplace(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("remplace (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,260);
if (RapidSub.canDelegate("remplace")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","remplace", _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 260;BA.debugLine="Sub remplace(text As String ) As String";
Debug.ShouldStop(8);
 BA.debugLineNum = 262;BA.debugLine="text=text.Replace(\"'\",\"´´\")";
Debug.ShouldStop(32);
_text = _text.runMethod(true,"Replace::",(Object)(BA.ObjectToString("'")),(Object)(RemoteObject.createImmutable("´´")));Debug.locals.put("text", _text);
 BA.debugLineNum = 263;BA.debugLine="Return text";
Debug.ShouldStop(64);
if (true) return _text;
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.ShouldStop(128);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundimage(RemoteObject _b,RemoteObject _bmp,RemoteObject _state) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundImage (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,56);
if (RapidSub.canDelegate("setbackgroundimage")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","setbackgroundimage", _b, _bmp, _state);}
RemoteObject _no = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("b", _b);
Debug.locals.put("bmp", _bmp);
Debug.locals.put("state", _state);
 BA.debugLineNum = 56;BA.debugLine="Sub SetBackgroundImage(b As Button, bmp As Bitmap,";
Debug.ShouldStop(8388608);
 BA.debugLineNum = 57;BA.debugLine="Dim no As NativeObject = b";
Debug.ShouldStop(16777216);
_no = RemoteObject.createNew ("B4INativeObject");
_no.setObject((_b).getObject());Debug.locals.put("no", _no);
 BA.debugLineNum = 58;BA.debugLine="no.RunMethod(\"setBackgroundImage:forState:\", Arra";
Debug.ShouldStop(33554432);
_no.runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("setBackgroundImage:forState:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_bmp).getObject()),(_state)})));
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
public static RemoteObject  _settitlecolor(RemoteObject _nav,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("SetTitleColor (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,62);
if (RapidSub.canDelegate("settitlecolor")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","settitlecolor", _nav, _color);}
RemoteObject _attributes = RemoteObject.declareNull("B4INativeObject");
RemoteObject _no = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("nav", _nav);
Debug.locals.put("color", _color);
 BA.debugLineNum = 62;BA.debugLine="Sub SetTitleColor(nav As NavigationController, col";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 63;BA.debugLine="Dim attributes As NativeObject";
Debug.ShouldStop(1073741824);
_attributes = RemoteObject.createNew ("B4INativeObject");Debug.locals.put("attributes", _attributes);
 BA.debugLineNum = 64;BA.debugLine="attributes = attributes.Initialize(\"B4IAttributed";
Debug.ShouldStop(-2147483648);
_attributes = _attributes.runMethod(false,"Initialize:",(Object)(RemoteObject.createImmutable("B4IAttributedString"))).runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("createAttributes::")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 18)))).getObject()),(_attributes.runMethod(false,"ColorToUIColor:",(Object)(_color)))})));Debug.locals.put("attributes", _attributes);
 BA.debugLineNum = 66;BA.debugLine="Dim no As NativeObject = nav";
Debug.ShouldStop(2);
_no = RemoteObject.createNew ("B4INativeObject");
_no.setObject((_nav).getObject());Debug.locals.put("no", _no);
 BA.debugLineNum = 67;BA.debugLine="no.GetField(\"navigationBar\").RunMethod(\"setTitleT";
Debug.ShouldStop(4);
_no.runMethod(false,"GetField:",(Object)(RemoteObject.createImmutable("navigationBar"))).runVoidMethod ("RunMethod::",(Object)(BA.ObjectToString("setTitleTextAttributes:")),(Object)(RemoteObject.createNew("B4IArray").runMethod(false, "initObjectsWithData:", (Object)new RemoteObject[] {((_attributes).getObject())})));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.ShouldStop(8);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _titulo(RemoteObject _parametro,RemoteObject _limite) throws Exception{
try {
		Debug.PushSubsStack("titulo (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,237);
if (RapidSub.canDelegate("titulo")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","titulo", _parametro, _limite);}
RemoteObject _espacio = RemoteObject.createImmutable("");
RemoteObject _totals = RemoteObject.createImmutable("");
RemoteObject _cal = RemoteObject.createImmutable(0.0);
int _i = 0;
Debug.locals.put("parametro", _parametro);
Debug.locals.put("limite", _limite);
 BA.debugLineNum = 237;BA.debugLine="Sub titulo(parametro As String,limite As Int) As S";
Debug.ShouldStop(4096);
 BA.debugLineNum = 238;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(8192);
_espacio = RemoteObject.createImmutable("");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 238;BA.debugLine="Dim espacio As String : espacio=\" \"";
Debug.ShouldStop(8192);
_espacio = BA.ObjectToString(" ");Debug.locals.put("espacio", _espacio);
 BA.debugLineNum = 239;BA.debugLine="Dim totals As String : totals=\"\"";
Debug.ShouldStop(16384);
_totals = RemoteObject.createImmutable("");Debug.locals.put("totals", _totals);
 BA.debugLineNum = 239;BA.debugLine="Dim totals As String : totals=\"\"";
Debug.ShouldStop(16384);
_totals = BA.ObjectToString("");Debug.locals.put("totals", _totals);
 BA.debugLineNum = 240;BA.debugLine="Dim cal As Double";
Debug.ShouldStop(32768);
_cal = RemoteObject.createImmutable(0.0);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 241;BA.debugLine="If limite =0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean("=",_limite,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 242;BA.debugLine="limite=48";
Debug.ShouldStop(131072);
_limite = BA.numberCast(int.class, 48);Debug.locals.put("limite", _limite);
 };
 BA.debugLineNum = 245;BA.debugLine="If parametro.Length<limite Then";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("<",_parametro.runMethod(true,"Length"),BA.numberCast(double.class, _limite))) { 
 BA.debugLineNum = 246;BA.debugLine="cal=limite-parametro.Length";
Debug.ShouldStop(2097152);
_cal = BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_limite,_parametro.runMethod(true,"Length")}, "-",1, 1));Debug.locals.put("cal", _cal);
 BA.debugLineNum = 247;BA.debugLine="cal= cal/2";
Debug.ShouldStop(4194304);
_cal = RemoteObject.solve(new RemoteObject[] {_cal,RemoteObject.createImmutable(2)}, "/",0, 0);Debug.locals.put("cal", _cal);
 BA.debugLineNum = 249;BA.debugLine="For i=1 To Round(cal)";
Debug.ShouldStop(16777216);
{
final int step12 = 1;
final int limit12 = (int) (0 + b4i_main.__c.runMethod(true,"Round:",(Object)(_cal)).<Number>get().doubleValue());
_i = 1 ;
for (;(step12 > 0 && _i <= limit12) || (step12 < 0 && _i >= limit12) ;_i = ((int)(0 + _i + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 250;BA.debugLine="totals=espacio& totals";
Debug.ShouldStop(33554432);
_totals = RemoteObject.concat(_espacio,_totals);Debug.locals.put("totals", _totals);
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 252;BA.debugLine="parametro=totals&parametro";
Debug.ShouldStop(134217728);
_parametro = RemoteObject.concat(_totals,_parametro);Debug.locals.put("parametro", _parametro);
 BA.debugLineNum = 253;BA.debugLine="Return parametro";
Debug.ShouldStop(268435456);
if (true) return _parametro;
 }else {
 BA.debugLineNum = 255;BA.debugLine="Return parametro";
Debug.ShouldStop(1073741824);
if (true) return _parametro;
 };
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _verificarjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("verificarJob (funcion) ","funcion",2,b4i_funcion.ba,b4i_funcion.mostCurrent,132);
if (RapidSub.canDelegate("verificarjob")) { return b4i_funcion.remoteMe.runUserSub(false, "funcion","verificarjob", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _confirm = RemoteObject.createImmutable("");
Debug.locals.put("job", _job);
 BA.debugLineNum = 132;BA.debugLine="Sub verificarJob(job As String) As Boolean";
Debug.ShouldStop(8);
 BA.debugLineNum = 134;BA.debugLine="job = base64_Decode(job)";
Debug.ShouldStop(32);
_job = _base64_decode(_job);Debug.locals.put("job", _job);
 BA.debugLineNum = 136;BA.debugLine="Dim map As Map";
Debug.ShouldStop(128);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 137;BA.debugLine="Log(job)";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethod ("LogImpl:::","42883589",_job,0);
 BA.debugLineNum = 138;BA.debugLine="Dim Json As JSONParser";
Debug.ShouldStop(512);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("Json", _json);
 BA.debugLineNum = 139;BA.debugLine="Json.Initialize(job)";
Debug.ShouldStop(1024);
_json.runVoidMethod ("Initialize:",(Object)(_job));
 BA.debugLineNum = 140;BA.debugLine="map=Json.NextObject";
Debug.ShouldStop(2048);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 141;BA.debugLine="Dim confirm As String";
Debug.ShouldStop(4096);
_confirm = RemoteObject.createImmutable("");Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 142;BA.debugLine="confirm=map.Get(\"f_key\")";
Debug.ShouldStop(8192);
_confirm = BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_key")))));Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 144;BA.debugLine="If confirm=\"-1\" Then";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-1"))) { 
 BA.debugLineNum = 145;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
Debug.ShouldStop(65536);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Usuario o contraseña incorrectos.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 146;BA.debugLine="Return False";
Debug.ShouldStop(131072);
if (true) return b4i_main.__c.runMethod(true,"False");
 }else 
{ BA.debugLineNum = 147;BA.debugLine="else if confirm=\"-2\" Then";
Debug.ShouldStop(262144);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-2"))) { 
 BA.debugLineNum = 148;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"Informac";
Debug.ShouldStop(524288);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este usuario esta desactivado")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 149;BA.debugLine="Return False";
Debug.ShouldStop(1048576);
if (true) return b4i_main.__c.runMethod(true,"False");
 }else 
{ BA.debugLineNum = 150;BA.debugLine="else if confirm=\"-3\" Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-3"))) { 
 BA.debugLineNum = 151;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
Debug.ShouldStop(4194304);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este usuario ya existe")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 152;BA.debugLine="Return False";
Debug.ShouldStop(8388608);
if (true) return b4i_main.__c.runMethod(true,"False");
 }else 
{ BA.debugLineNum = 153;BA.debugLine="else if confirm=\"-4\" Then";
Debug.ShouldStop(16777216);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-4"))) { 
 BA.debugLineNum = 155;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
Debug.ShouldStop(67108864);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("**The print is not finish yet")),(Object)(RemoteObject.createImmutable("Information")));
 BA.debugLineNum = 156;BA.debugLine="Log(job)";
Debug.ShouldStop(134217728);
b4i_main.__c.runVoidMethod ("LogImpl:::","42883608",_job,0);
 BA.debugLineNum = 157;BA.debugLine="Return False";
Debug.ShouldStop(268435456);
if (true) return b4i_main.__c.runMethod(true,"False");
 }}}}
;
 BA.debugLineNum = 160;BA.debugLine="Return True";
Debug.ShouldStop(-2147483648);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}