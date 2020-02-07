package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_funciones_subs_0 {


public static RemoteObject  _base64_decode(RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("base64_Decode (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,40);
if (RapidSub.canDelegate("base64_decode")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","base64_decode", _text);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
RemoteObject _b = null;
RemoteObject _res = RemoteObject.createImmutable("");
Debug.locals.put("text", _text);
 BA.debugLineNum = 40;BA.debugLine="Sub base64_Decode(text As String) As String";
Debug.ShouldStop(128);
 BA.debugLineNum = 41;BA.debugLine="If text = Null Or text.Length = 0 Or text = \"\" Th";
Debug.ShouldStop(256);
if (RemoteObject.solveBoolean("n",_text) || RemoteObject.solveBoolean("=",_text.runMethod(true,"Length"),BA.numberCast(double.class, 0)) || RemoteObject.solveBoolean("=",_text,BA.ObjectToString(""))) { 
 BA.debugLineNum = 42;BA.debugLine="Return \"\"";
Debug.ShouldStop(512);
if (true) return BA.ObjectToString("");
 };
 BA.debugLineNum = 45;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(4096);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 46;BA.debugLine="Dim b() As Byte = su.DecodeBase64(text)";
Debug.ShouldStop(8192);
_b = _su.runMethod(false,"DecodeBase64:",(Object)(_text));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 48;BA.debugLine="Dim res As String = BytesToString(b , 0, b.Length";
Debug.ShouldStop(32768);
_res = b4i_main.__c.runMethod(true,"BytesToString::::",(Object)(_b),(Object)(BA.numberCast(int.class, 0)),(Object)(_b.getField(true,"Length")),(Object)(RemoteObject.createImmutable("UTF8")));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 50;BA.debugLine="Return res";
Debug.ShouldStop(131072);
if (true) return _res;
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.ShouldStop(524288);
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
		Debug.PushSubsStack("base64_Encode (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,54);
if (RapidSub.canDelegate("base64_encode")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","base64_encode", _text);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
Debug.locals.put("text", _text);
 BA.debugLineNum = 54;BA.debugLine="Sub base64_Encode(text As String) As String";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 56;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(8388608);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 57;BA.debugLine="Return  su.EncodeBase64(text.GetBytes(\"UTF8\"))";
Debug.ShouldStop(16777216);
if (true) return _su.runMethod(true,"EncodeBase64:",(Object)(_text.runMethod(false,"GetBytes:",(Object)(RemoteObject.createImmutable("UTF8")))));
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
public static RemoteObject  _crearjson(RemoteObject _token,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("crearJson (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,29);
if (RapidSub.canDelegate("crearjson")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","crearjson", _token, _data);}
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 29;BA.debugLine="Sub crearJson(token As String,data As String) As S";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 36;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
Debug.ShouldStop(8);
if (true) return _crearjson2(_token,RemoteObject.concat(RemoteObject.createImmutable("{"),_data,RemoteObject.createImmutable("}")));
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("crearJson2 (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,19);
if (RapidSub.canDelegate("crearjson2")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","crearjson2", _token, _data);}
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
Debug.locals.put("token", _token);
Debug.locals.put("data", _data);
 BA.debugLineNum = 19;BA.debugLine="Sub crearJson2(token As String,data As String) As";
Debug.ShouldStop(262144);
 BA.debugLineNum = 20;BA.debugLine="Dim json As String";
Debug.ShouldStop(524288);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 21;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(1048576);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 23;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
Debug.ShouldStop(4194304);
_json = RemoteObject.concat(RemoteObject.createImmutable("{'f_key':'"),_token,RemoteObject.createImmutable("','f_data':"),_data,RemoteObject.createImmutable("}"));Debug.locals.put("json", _json);
 BA.debugLineNum = 24;BA.debugLine="json = su.EncodeBase64(json.GetBytes(\"UTF8\") )";
Debug.ShouldStop(8388608);
_json = _su.runMethod(true,"EncodeBase64:",(Object)(_json.runMethod(false,"GetBytes:",(Object)(RemoteObject.createImmutable("UTF8")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 25;BA.debugLine="Return json";
Debug.ShouldStop(16777216);
if (true) return _json;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.ShouldStop(33554432);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelproducto(RemoteObject _map) throws Exception{
try {
		Debug.PushSubsStack("createPanelProducto (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,104);
if (RapidSub.canDelegate("createpanelproducto")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","createpanelproducto", _map);}
RemoteObject _panelfondopro = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _imagenpro = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _lbltitulopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("B4IButtonWrapper");
Debug.locals.put("map", _map);
 BA.debugLineNum = 104;BA.debugLine="Sub createPanelProducto(map As Map) As Panel";
Debug.ShouldStop(128);
 BA.debugLineNum = 106;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(512);
_panelfondopro = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 107;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(1024);
_panelfondopro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 108;BA.debugLine="PanelFondoPro.Width = 152dip";
Debug.ShouldStop(2048);
_panelfondopro.runMethod(true,"setWidth:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 152)))));
 BA.debugLineNum = 109;BA.debugLine="PanelFondoPro.Height = 185dip";
Debug.ShouldStop(4096);
_panelfondopro.runMethod(true,"setHeight:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 185)))));
 BA.debugLineNum = 111;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
Debug.ShouldStop(16384);
_panelfondopro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 113;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(65536);
_panelfondopro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 115;BA.debugLine="map.Put(\"f_destacado\",True)";
Debug.ShouldStop(262144);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((b4i_main.__c.runMethod(true,"True"))));
 BA.debugLineNum = 117;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(1048576);
_panelimagen.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 119;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(4194304);
_imagenpro = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 120;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(8388608);
_imagenpro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 122;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(33554432);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 124;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_foto\"";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 125;BA.debugLine="bm = getImagen(map.Get(\"f_foto\"))";
Debug.ShouldStop(268435456);
_bm = _getimagen(BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 128;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(-2147483648);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 131;BA.debugLine="imagenPro.Bitmap = bm";
Debug.ShouldStop(4);
_imagenpro.runMethod(false,"setBitmap:",_bm);
 BA.debugLineNum = 133;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
Debug.ShouldStop(16);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 135;BA.debugLine="PanelImagen.AddView(imagenPro,0dip,0dip,152dip,85";
Debug.ShouldStop(64);
_panelimagen.runVoidMethod ("AddView:::::",(Object)(((_imagenpro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 152))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 85))))));
 BA.debugLineNum = 137;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0dip,0dip,Panel";
Debug.ShouldStop(256);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_panelimagen).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 85))))));
 BA.debugLineNum = 140;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(2048);
_lbltitulopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 141;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(4096);
_lbltitulopro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 142;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(8192);
_lbltitulopro.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 143;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(16384);
_lbltitulopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 144;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(32768);
_lbltitulopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 146;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,4dip,90dip,145";
Debug.ShouldStop(131072);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lbltitulopro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 90))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 145))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 14))))));
 BA.debugLineNum = 148;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(524288);
_lblpreciopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 149;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(1048576);
_lblpreciopro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 150;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
Debug.ShouldStop(2097152);
_lblpreciopro.runMethod(true,"setText:",b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 151;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(4194304);
_lblpreciopro.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"Text")));
 BA.debugLineNum = 152;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(8388608);
_lblpreciopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 153;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(16777216);
_lblpreciopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 155;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,4dip,122dip,50";
Debug.ShouldStop(67108864);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lblpreciopro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 122))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 12))))));
 BA.debugLineNum = 157;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(268435456);
_btnaddpro = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 158;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
Debug.ShouldStop(536870912);
_btnaddpro.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnAddProducto")),b4i_funciones.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 159;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(1073741824);
_btnaddpro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 160;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
Debug.ShouldStop(-2147483648);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 161;BA.debugLine="btnAddPro.Tag = map";
Debug.ShouldStop(1);
_btnaddpro.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 162;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(2);
_btnaddpro.runMethod(true,"setText:",BA.ObjectToString("Agregar"));
 BA.debugLineNum = 164;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
Debug.ShouldStop(8);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 166;BA.debugLine="PanelFondoPro.AddView(btnAddPro,10dip,145dip,138d";
Debug.ShouldStop(32);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_btnaddpro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 145))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 138))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 25))))));
 BA.debugLineNum = 206;BA.debugLine="PanelFondoPro.Tag = map";
Debug.ShouldStop(8192);
_panelfondopro.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 217;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(16777216);
if (true) return _panelfondopro;
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelproductoscroll(RemoteObject _map,RemoteObject _imagen) throws Exception{
try {
		Debug.PushSubsStack("createPanelProductoScroll (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,244);
if (RapidSub.canDelegate("createpanelproductoscroll")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","createpanelproductoscroll", _map, _imagen);}
RemoteObject _panelfondopro = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _imagenpro = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _lbltitulopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("B4IButtonWrapper");
Debug.locals.put("map", _map);
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 244;BA.debugLine="Sub createPanelProductoScroll(map As Map, imagen A";
Debug.ShouldStop(524288);
 BA.debugLineNum = 247;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(4194304);
_panelfondopro = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 248;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(8388608);
_panelfondopro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 249;BA.debugLine="PanelFondoPro.Width = 152dip";
Debug.ShouldStop(16777216);
_panelfondopro.runMethod(true,"setWidth:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 152)))));
 BA.debugLineNum = 250;BA.debugLine="PanelFondoPro.Height = 185dip";
Debug.ShouldStop(33554432);
_panelfondopro.runMethod(true,"setHeight:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 185)))));
 BA.debugLineNum = 252;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
Debug.ShouldStop(134217728);
_panelfondopro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 254;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(536870912);
_panelfondopro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 256;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(-2147483648);
_panelimagen.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 258;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
Debug.ShouldStop(2);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 260;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(8);
_imagenpro = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 261;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(16);
_imagenpro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 263;BA.debugLine="imagenPro.Bitmap = imagen";
Debug.ShouldStop(64);
_imagenpro.runMethod(false,"setBitmap:",_imagen);
 BA.debugLineNum = 265;BA.debugLine="map.Put(\"f_foto\",imagen)";
Debug.ShouldStop(256);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_foto"))),(Object)(((_imagen).getObject())));
 BA.debugLineNum = 267;BA.debugLine="map.Put(\"f_destacado\",False)";
Debug.ShouldStop(1024);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 270;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,T";
Debug.ShouldStop(8192);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.1)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 272;BA.debugLine="PanelImagen.AddView(imagenPro,0dip,0dip,152dip,85";
Debug.ShouldStop(32768);
_panelimagen.runVoidMethod ("AddView:::::",(Object)(((_imagenpro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 152))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 85))))));
 BA.debugLineNum = 274;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0dip,0dip,Panel";
Debug.ShouldStop(131072);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_panelimagen).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 85))))));
 BA.debugLineNum = 276;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(524288);
_lbltitulopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 277;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(1048576);
_lbltitulopro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 278;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
Debug.ShouldStop(2097152);
_lbltitulopro.runMethod(true,"setText:",BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 279;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(4194304);
_lbltitulopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 280;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(8388608);
_lbltitulopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 283;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,4dip,90dip,145";
Debug.ShouldStop(67108864);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lbltitulopro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 90))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 145))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 14))))));
 BA.debugLineNum = 285;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(268435456);
_lblpreciopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 286;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(536870912);
_lblpreciopro.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 287;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
Debug.ShouldStop(1073741824);
_lblpreciopro.runMethod(true,"setText:",b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 288;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(-2147483648);
_lblpreciopro.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"Text")));
 BA.debugLineNum = 289;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(1);
_lblpreciopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 290;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(2);
_lblpreciopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 292;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,4dip,122dip,50";
Debug.ShouldStop(8);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lblpreciopro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 4))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 122))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 12))))));
 BA.debugLineNum = 294;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(32);
_btnaddpro = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 295;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
Debug.ShouldStop(64);
_btnaddpro.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnAddProducto")),b4i_funciones.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 296;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(128);
_btnaddpro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 297;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
Debug.ShouldStop(256);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 298;BA.debugLine="btnAddPro.Tag = map";
Debug.ShouldStop(512);
_btnaddpro.runMethod(false,"setTag:",(_map));
 BA.debugLineNum = 299;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(1024);
_btnaddpro.runMethod(true,"setText:",BA.ObjectToString("Agregar"));
 BA.debugLineNum = 301;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
Debug.ShouldStop(4096);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 303;BA.debugLine="PanelFondoPro.AddView(btnAddPro,10dip,145dip,138d";
Debug.ShouldStop(16384);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_btnaddpro).getObject())),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 10))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 145))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 138))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 25))))));
 BA.debugLineNum = 352;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(-2147483648);
if (true) return _panelfondopro;
 BA.debugLineNum = 354;BA.debugLine="End Sub";
Debug.ShouldStop(2);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _get_descuento(RemoteObject _precio,RemoteObject _descuento) throws Exception{
try {
		Debug.PushSubsStack("get_descuento (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,386);
if (RapidSub.canDelegate("get_descuento")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","get_descuento", _precio, _descuento);}
RemoteObject _precio2 = RemoteObject.createImmutable(0.0);
Debug.locals.put("precio", _precio);
Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 386;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
Debug.ShouldStop(2);
 BA.debugLineNum = 387;BA.debugLine="Dim precio2 As Double";
Debug.ShouldStop(4);
_precio2 = RemoteObject.createImmutable(0.0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 388;BA.debugLine="precio2 = precio * (descuento / 100)";
Debug.ShouldStop(8);
_precio2 = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_descuento,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0);Debug.locals.put("precio2", _precio2);
 BA.debugLineNum = 389;BA.debugLine="Return precio2";
Debug.ShouldStop(16);
if (true) return _precio2;
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.ShouldStop(32);
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
		Debug.PushSubsStack("get_importe (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,398);
if (RapidSub.canDelegate("get_importe")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","get_importe", _cantidad, _precio, _tax);}
RemoteObject _dato = RemoteObject.createImmutable(0.0);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
 BA.debugLineNum = 398;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
Debug.ShouldStop(8192);
 BA.debugLineNum = 399;BA.debugLine="Dim dato As Double";
Debug.ShouldStop(16384);
_dato = RemoteObject.createImmutable(0.0);Debug.locals.put("dato", _dato);
 BA.debugLineNum = 400;BA.debugLine="dato = ((precio * cantidad) + tax)";
Debug.ShouldStop(32768);
_dato = (RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,_cantidad}, "*",0, 0)),_tax}, "+",1, 0));Debug.locals.put("dato", _dato);
 BA.debugLineNum = 401;BA.debugLine="Return  dato";
Debug.ShouldStop(65536);
if (true) return _dato;
 BA.debugLineNum = 402;BA.debugLine="End Sub";
Debug.ShouldStop(131072);
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
		Debug.PushSubsStack("get_tax (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,392);
if (RapidSub.canDelegate("get_tax")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","get_tax", _precio, _tax, _cantidad);}
Debug.locals.put("precio", _precio);
Debug.locals.put("tax", _tax);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 392;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
Debug.ShouldStop(128);
 BA.debugLineNum = 393;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
Debug.ShouldStop(256);
_tax = RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0))}, "*",0, 0)),_cantidad}, "*",0, 0);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 394;BA.debugLine="Return tax";
Debug.ShouldStop(512);
if (true) return _tax;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.ShouldStop(1024);
return RemoteObject.createImmutable(0.0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdecimal(RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("getDecimal (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,404);
if (RapidSub.canDelegate("getdecimal")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","getdecimal", _n);}
RemoteObject _numero = RemoteObject.createImmutable("");
RemoteObject _punto = RemoteObject.createImmutable("");
Debug.locals.put("n", _n);
 BA.debugLineNum = 404;BA.debugLine="Sub getDecimal(n As Double) As String";
Debug.ShouldStop(524288);
 BA.debugLineNum = 406;BA.debugLine="If IsNumber(n) = False Then";
Debug.ShouldStop(2097152);
if (RemoteObject.solveBoolean("=",b4i_main.__c.runMethod(true,"IsNumber:",(Object)(BA.NumberToString(_n))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 407;BA.debugLine="Return n";
Debug.ShouldStop(4194304);
if (true) return BA.NumberToString(_n);
 };
 BA.debugLineNum = 410;BA.debugLine="Dim numero, punto As String";
Debug.ShouldStop(33554432);
_numero = RemoteObject.createImmutable("");Debug.locals.put("numero", _numero);
_punto = RemoteObject.createImmutable("");Debug.locals.put("punto", _punto);
 BA.debugLineNum = 413;BA.debugLine="If numero>n Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _numero),_n)) { 
 BA.debugLineNum = 414;BA.debugLine="numero=numero-1";
Debug.ShouldStop(536870912);
_numero = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {BA.numberCast(double.class, _numero),RemoteObject.createImmutable(1)}, "-",1, 0));Debug.locals.put("numero", _numero);
 };
 BA.debugLineNum = 417;BA.debugLine="If (n-numero) > 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean(">",(RemoteObject.solve(new RemoteObject[] {_n,BA.numberCast(double.class, _numero)}, "-",1, 0)),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 418;BA.debugLine="punto = n";
Debug.ShouldStop(2);
_punto = BA.NumberToString(_n);Debug.locals.put("punto", _punto);
 BA.debugLineNum = 419;BA.debugLine="If punto.SubString(punto.IndexOf(\".\")+1).Length<";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("k",_punto.runMethod(true,"SubString:",(Object)(RemoteObject.solve(new RemoteObject[] {_punto.runMethod(true,"IndexOf:",(Object)(RemoteObject.createImmutable("."))),RemoteObject.createImmutable(1)}, "+",1, 1))).runMethod(true,"Length"),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 420;BA.debugLine="punto= punto&\"0\"";
Debug.ShouldStop(8);
_punto = RemoteObject.concat(_punto,RemoteObject.createImmutable("0"));Debug.locals.put("punto", _punto);
 };
 BA.debugLineNum = 422;BA.debugLine="Return punto";
Debug.ShouldStop(32);
if (true) return _punto;
 }else {
 BA.debugLineNum = 424;BA.debugLine="Return numero&\".00\"";
Debug.ShouldStop(128);
if (true) return RemoteObject.concat(_numero,RemoteObject.createImmutable(".00"));
 };
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.ShouldStop(512);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdiferenciacantidad(RemoteObject _cantidadactual,RemoteObject _cantidadnueva) throws Exception{
try {
		Debug.PushSubsStack("getDiferenciaCantidad (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,428);
if (RapidSub.canDelegate("getdiferenciacantidad")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","getdiferenciacantidad", _cantidadactual, _cantidadnueva);}
Debug.locals.put("cantidadActual", _cantidadactual);
Debug.locals.put("cantidadNueva", _cantidadnueva);
 BA.debugLineNum = 428;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
Debug.ShouldStop(2048);
 BA.debugLineNum = 430;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
Debug.ShouldStop(8192);
if (RemoteObject.solveBoolean(">",_cantidadnueva,_cantidadactual) && RemoteObject.solveBoolean("<",_cantidadactual,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 431;BA.debugLine="cantidadActual = cantidadActual*-1";
Debug.ShouldStop(16384);
_cantidadactual = BA.numberCast(double.class, _cantidadactual.<Number>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("cantidadActual", _cantidadactual);
 }else {
 BA.debugLineNum = 433;BA.debugLine="If cantidadActual > 0 Then";
Debug.ShouldStop(65536);
if (RemoteObject.solveBoolean(">",_cantidadactual,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 434;BA.debugLine="cantidadActual = cantidadActual*-1";
Debug.ShouldStop(131072);
_cantidadactual = BA.numberCast(double.class, _cantidadactual.<Number>get().doubleValue()*-(double) (0 + 1));Debug.locals.put("cantidadActual", _cantidadactual);
 };
 };
 BA.debugLineNum = 438;BA.debugLine="Return cantidadActual";
Debug.ShouldStop(2097152);
if (true) return _cantidadactual;
 BA.debugLineNum = 440;BA.debugLine="End Sub";
Debug.ShouldStop(8388608);
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
		Debug.PushSubsStack("getImagen (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,61);
if (RapidSub.canDelegate("getimagen")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","getimagen", _imagenb64);}
RemoteObject _su = RemoteObject.declareNull("iStringUtils");
RemoteObject _imagen = null;
RemoteObject _inp = RemoteObject.declareNull("B4IInputStream");
RemoteObject _bmp = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("imagenB64", _imagenb64);
 BA.debugLineNum = 61;BA.debugLine="Sub getImagen(imagenB64 As String) As Bitmap";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 62;BA.debugLine="Dim su As StringUtils";
Debug.ShouldStop(536870912);
_su = RemoteObject.createNew ("iStringUtils");Debug.locals.put("su", _su);
 BA.debugLineNum = 63;BA.debugLine="Dim imagen() As Byte";
Debug.ShouldStop(1073741824);
_imagen = RemoteObject.createNew("B4IArray").runMethod(false, "initBytes:", (Object)new RemoteObject[] {BA.numberCast(int.class, 0)});Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 64;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
Debug.ShouldStop(-2147483648);
_imagen = _su.runMethod(false,"DecodeBase64:",(Object)(_imagenb64));Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 65;BA.debugLine="Dim inp As InputStream";
Debug.ShouldStop(1);
_inp = RemoteObject.createNew ("B4IInputStream");Debug.locals.put("inp", _inp);
 BA.debugLineNum = 66;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
Debug.ShouldStop(2);
_inp.runVoidMethod ("InitializeFromBytesArray:::",(Object)(_imagen),(Object)(BA.numberCast(int.class, 0)),(Object)(_imagen.getField(true,"Length")));
 BA.debugLineNum = 67;BA.debugLine="Dim bmp As Bitmap";
Debug.ShouldStop(4);
_bmp = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmp", _bmp);
 BA.debugLineNum = 68;BA.debugLine="bmp.Initialize2(inp)";
Debug.ShouldStop(8);
_bmp.runVoidMethod ("Initialize2:",(Object)(_inp));
 BA.debugLineNum = 70;BA.debugLine="Return bmp";
Debug.ShouldStop(32);
if (true) return _bmp;
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.ShouldStop(64);
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
		Debug.PushSubsStack("IsFirstResponder (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,460);
if (RapidSub.canDelegate("isfirstresponder")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","isfirstresponder", _v);}
Debug.locals.put("V", _v);
 BA.debugLineNum = 460;BA.debugLine="Sub IsFirstResponder(V As NativeObject) As Boolean";
Debug.ShouldStop(2048);
 BA.debugLineNum = 461;BA.debugLine="If V.RunMethod(\"isFirstResponder\",Null) = 1 Then";
Debug.ShouldStop(4096);
if (RemoteObject.solveBoolean("=",_v.runMethod(false,"RunMethod::",(Object)(BA.ObjectToString("isFirstResponder")),(Object)((b4i_main.__c.runMethod(false,"Null")))),RemoteObject.createImmutable(1))) { 
if (true) return b4i_main.__c.runMethod(true,"True");};
 BA.debugLineNum = 462;BA.debugLine="Return False";
Debug.ShouldStop(8192);
if (true) return b4i_main.__c.runMethod(true,"False");
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
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
		Debug.PushSubsStack("KeyboardStateChanged (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,443);
if (RapidSub.canDelegate("keyboardstatechanged")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","keyboardstatechanged", _height, _page1, _top);}
RemoteObject _v = RemoteObject.declareNull("B4IViewWrapper");
Debug.locals.put("Height", _height);
Debug.locals.put("Page1", _page1);
Debug.locals.put("Top", _top);
 BA.debugLineNum = 443;BA.debugLine="Sub KeyboardStateChanged (Height As Float, Page1 A";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 445;BA.debugLine="If Top = -1 Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_top,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 446;BA.debugLine="Top = 20";
Debug.ShouldStop(536870912);
_top = BA.numberCast(double.class, 20);Debug.locals.put("Top", _top);
 };
 BA.debugLineNum = 449;BA.debugLine="If Height = 0 Then";
Debug.ShouldStop(1);
if (RemoteObject.solveBoolean("=",_height,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 450;BA.debugLine="Page1.RootPanel.SetLayoutAnimated(200,1,Page1.Ro";
Debug.ShouldStop(2);
_page1.runMethod(false,"RootPanel").runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(float.class, 1)),(Object)(_page1.runMethod(false,"RootPanel").runMethod(true,"Left")),(Object)(BA.numberCast(float.class, _top)),(Object)(_page1.runMethod(false,"RootPanel").runMethod(true,"Width")),(Object)(_page1.runMethod(false,"RootPanel").runMethod(true,"Height")));
 }else {
 BA.debugLineNum = 452;BA.debugLine="For Each V As View In Page1.RootPanel.GetAllView";
Debug.ShouldStop(8);
_v = RemoteObject.createNew ("B4IViewWrapper");
{
final RemoteObject group7 = _page1.runMethod(false,"RootPanel").runMethod(false,"GetAllViewsRecursive");
final int groupLen7 = group7.runMethod(true,"Size").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.setObject(group7.runMethod(false,"Get:",index7));
Debug.locals.put("V", _v);
 BA.debugLineNum = 453;BA.debugLine="If IsFirstResponder(V) Then";
Debug.ShouldStop(16);
if (_isfirstresponder(BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4INativeObject"), (_v).getObject())).getBoolean()) { 
 BA.debugLineNum = 454;BA.debugLine="Page1.RootPanel.Top = Min(0,Page1.RootPanel.To";
Debug.ShouldStop(32);
_page1.runMethod(false,"RootPanel").runMethod(true,"setTop:",BA.numberCast(float.class, b4i_main.__c.runMethod(true,"Min::",(Object)(BA.numberCast(double.class, 0)),(Object)(RemoteObject.solve(new RemoteObject[] {_page1.runMethod(false,"RootPanel").runMethod(true,"Top"),b4i_main.__c.runMethod(true,"PerYToCurrent:",(Object)(BA.numberCast(float.class, 3))),(RemoteObject.solve(new RemoteObject[] {_height,(RemoteObject.solve(new RemoteObject[] {_page1.runMethod(false,"RootPanel").runMethod(true,"Height"),(RemoteObject.solve(new RemoteObject[] {_v.runMethod(true,"Top"),_v.runMethod(true,"Height")}, "+",1, 0))}, "-",1, 0))}, "-",1, 0))}, "--",2, 0)))));
 };
 }
}Debug.locals.put("V", _v);
;
 };
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
public static RemoteObject  _process_globals() throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _recalcular(RemoteObject _precio,RemoteObject _descuento,RemoteObject _cantidad,RemoteObject _tax,RemoteObject _impuestoincluido,RemoteObject _exentoimpuesto) throws Exception{
try {
		Debug.PushSubsStack("recalcular (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,356);
if (RapidSub.canDelegate("recalcular")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","recalcular", _precio, _descuento, _cantidad, _tax, _impuestoincluido, _exentoimpuesto);}
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
 BA.debugLineNum = 356;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
Debug.ShouldStop(8);
 BA.debugLineNum = 358;BA.debugLine="If exentoImpuesto Then";
Debug.ShouldStop(32);
if (_exentoimpuesto.getBoolean()) { 
 BA.debugLineNum = 359;BA.debugLine="tax = 0";
Debug.ShouldStop(64);
_tax = BA.numberCast(double.class, 0);Debug.locals.put("tax", _tax);
 };
 BA.debugLineNum = 362;BA.debugLine="Dim precio_para_mostrar As Double = precio";
Debug.ShouldStop(512);
_precio_para_mostrar = _precio;Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);
 BA.debugLineNum = 363;BA.debugLine="If (impuestoIncluido) Then";
Debug.ShouldStop(1024);
if ((_impuestoincluido).getBoolean()) { 
 BA.debugLineNum = 364;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
Debug.ShouldStop(2048);
_precio_para_mostrar = RemoteObject.solve(new RemoteObject[] {_precio,(RemoteObject.solve(new RemoteObject[] {(RemoteObject.solve(new RemoteObject[] {_tax,RemoteObject.createImmutable(100)}, "/",0, 0)),RemoteObject.createImmutable(1)}, "+",1, 0))}, "/",0, 0);Debug.locals.put("precio_para_mostrar", _precio_para_mostrar);
 };
 BA.debugLineNum = 368;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
Debug.ShouldStop(32768);
_descuento = _get_descuento(_precio_para_mostrar,_descuento);Debug.locals.put("descuento", _descuento);
 BA.debugLineNum = 369;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
Debug.ShouldStop(65536);
_preciodescuento = RemoteObject.solve(new RemoteObject[] {_precio_para_mostrar,_descuento}, "-",1, 0);Debug.locals.put("precioDescuento", _preciodescuento);Debug.locals.put("precioDescuento", _preciodescuento);
 BA.debugLineNum = 371;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
Debug.ShouldStop(262144);
_tax = _get_tax(_preciodescuento,_tax,_cantidad);Debug.locals.put("tax", _tax);
 BA.debugLineNum = 372;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
Debug.ShouldStop(524288);
_total = _get_importe(_cantidad,_preciodescuento,_tax);Debug.locals.put("total", _total);Debug.locals.put("total", _total);
 BA.debugLineNum = 374;BA.debugLine="Dim map As Map";
Debug.ShouldStop(2097152);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 375;BA.debugLine="map.Initialize";
Debug.ShouldStop(4194304);
_map.runVoidMethod ("Initialize");
 BA.debugLineNum = 376;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
Debug.ShouldStop(8388608);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_precio_para_mostrar"))),(Object)((_precio_para_mostrar)));
 BA.debugLineNum = 377;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
Debug.ShouldStop(16777216);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_tax"))),(Object)((_tax)));
 BA.debugLineNum = 378;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
Debug.ShouldStop(33554432);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_descuento"))),(Object)((_descuento)));
 BA.debugLineNum = 379;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
Debug.ShouldStop(67108864);
_map.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_total"))),(Object)((_total)));
 BA.debugLineNum = 382;BA.debugLine="Return map";
Debug.ShouldStop(536870912);
if (true) return _map;
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _resizeimage(RemoteObject _image,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("ResizeImage (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,222);
if (RapidSub.canDelegate("resizeimage")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","resizeimage", _image, _width, _height);}
RemoteObject _photocanvas = RemoteObject.declareNull("B4ICanvas");
RemoteObject _photopanel = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _photoview = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _newimage = RemoteObject.declareNull("B4IBitmap");
Debug.locals.put("Image", _image);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 222;BA.debugLine="Sub ResizeImage (Image As Bitmap, Width As Int, He";
Debug.ShouldStop(536870912);
 BA.debugLineNum = 223;BA.debugLine="Dim PhotoCanvas As Canvas";
Debug.ShouldStop(1073741824);
_photocanvas = RemoteObject.createNew ("B4ICanvas");Debug.locals.put("PhotoCanvas", _photocanvas);
 BA.debugLineNum = 224;BA.debugLine="Dim PhotoPanel As Panel";
Debug.ShouldStop(-2147483648);
_photopanel = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PhotoPanel", _photopanel);
 BA.debugLineNum = 225;BA.debugLine="Dim PhotoView As ImageView";
Debug.ShouldStop(1);
_photoview = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("PhotoView", _photoview);
 BA.debugLineNum = 226;BA.debugLine="Dim NewImage As Bitmap";
Debug.ShouldStop(2);
_newimage = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("NewImage", _newimage);
 BA.debugLineNum = 228;BA.debugLine="PhotoPanel.Initialize(\"\")";
Debug.ShouldStop(8);
_photopanel.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 229;BA.debugLine="PhotoPanel.Width = Width / 2";
Debug.ShouldStop(16);
_photopanel.runMethod(true,"setWidth:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 230;BA.debugLine="PhotoPanel.Height = Height / 2";
Debug.ShouldStop(32);
_photopanel.runMethod(true,"setHeight:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0)));
 BA.debugLineNum = 232;BA.debugLine="PhotoView.Initialize(\"\")";
Debug.ShouldStop(128);
_photoview.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 233;BA.debugLine="PhotoView.Bitmap = Image";
Debug.ShouldStop(256);
_photoview.runMethod(false,"setBitmap:",_image);
 BA.debugLineNum = 235;BA.debugLine="PhotoPanel.AddView(PhotoView,0,0,Width / 2,Height";
Debug.ShouldStop(1024);
_photopanel.runVoidMethod ("AddView:::::",(Object)(((_photoview).getObject())),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_width,RemoteObject.createImmutable(2)}, "/",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_height,RemoteObject.createImmutable(2)}, "/",0, 0))));
 BA.debugLineNum = 237;BA.debugLine="PhotoCanvas.Initialize(PhotoPanel)";
Debug.ShouldStop(4096);
_photocanvas.runVoidMethod ("Initialize:",BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4IViewWrapper"), (_photopanel).getObject()));
 BA.debugLineNum = 238;BA.debugLine="NewImage = PhotoCanvas.CreateBitmap";
Debug.ShouldStop(8192);
_newimage = _photocanvas.runMethod(false,"CreateBitmap");Debug.locals.put("NewImage", _newimage);
 BA.debugLineNum = 240;BA.debugLine="Return NewImage";
Debug.ShouldStop(32768);
if (true) return _newimage;
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.ShouldStop(65536);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaddingtext(RemoteObject _tf,RemoteObject _padding) throws Exception{
try {
		Debug.PushSubsStack("SetPaddingText (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,10);
if (RapidSub.canDelegate("setpaddingtext")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","setpaddingtext", _tf, _padding);}
RemoteObject _pnl = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _no = RemoteObject.declareNull("B4INativeObject");
Debug.locals.put("tf", _tf);
Debug.locals.put("Padding", _padding);
 BA.debugLineNum = 10;BA.debugLine="Sub SetPaddingText(tf As TextField, Padding As Flo";
Debug.ShouldStop(512);
 BA.debugLineNum = 11;BA.debugLine="Dim pnl As Panel";
Debug.ShouldStop(1024);
_pnl = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("pnl", _pnl);
 BA.debugLineNum = 12;BA.debugLine="pnl.Initialize(\"\")";
Debug.ShouldStop(2048);
_pnl.runVoidMethod ("Initialize::",b4i_funciones.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 13;BA.debugLine="pnl.SetLayoutAnimated(0, 1, 0, 0, Padding, tf.Hei";
Debug.ShouldStop(4096);
_pnl.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(_padding),(Object)(_tf.runMethod(true,"Height")));
 BA.debugLineNum = 14;BA.debugLine="Dim no As NativeObject = tf";
Debug.ShouldStop(8192);
_no = RemoteObject.createNew ("B4INativeObject");
_no.setObject((_tf).getObject());Debug.locals.put("no", _no);
 BA.debugLineNum = 15;BA.debugLine="no.SetField(\"leftView\", pnl)";
Debug.ShouldStop(16384);
_no.runVoidMethod ("SetField::",(Object)(BA.ObjectToString("leftView")),(Object)(((_pnl).getObject())));
 BA.debugLineNum = 16;BA.debugLine="no.SetField(\"leftViewMode\", 3)";
Debug.ShouldStop(32768);
_no.runVoidMethod ("SetField::",(Object)(BA.ObjectToString("leftViewMode")),(Object)(RemoteObject.createImmutable((3))));
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
public static RemoteObject  _verificarjob(RemoteObject _job) throws Exception{
try {
		Debug.PushSubsStack("verificarJob (funciones) ","funciones",2,b4i_funciones.ba,b4i_funciones.mostCurrent,73);
if (RapidSub.canDelegate("verificarjob")) { return b4i_funciones.remoteMe.runUserSub(false, "funciones","verificarjob", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.declareNull("B4IJSONParser");
RemoteObject _confirm = RemoteObject.createImmutable("");
Debug.locals.put("job", _job);
 BA.debugLineNum = 73;BA.debugLine="Sub verificarJob(job As String) As Boolean";
Debug.ShouldStop(256);
 BA.debugLineNum = 75;BA.debugLine="job = base64_Decode(job)";
Debug.ShouldStop(1024);
_job = _base64_decode(_job);Debug.locals.put("job", _job);
 BA.debugLineNum = 77;BA.debugLine="Dim map As Map";
Debug.ShouldStop(4096);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 78;BA.debugLine="Dim Json As JSONParser";
Debug.ShouldStop(8192);
_json = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("Json", _json);
 BA.debugLineNum = 79;BA.debugLine="Json.Initialize(job)";
Debug.ShouldStop(16384);
_json.runVoidMethod ("Initialize:",(Object)(_job));
 BA.debugLineNum = 80;BA.debugLine="map=Json.NextObject";
Debug.ShouldStop(32768);
_map = _json.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 81;BA.debugLine="Dim confirm As String";
Debug.ShouldStop(65536);
_confirm = RemoteObject.createImmutable("");Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 82;BA.debugLine="confirm=map.Get(\"f_key\")";
Debug.ShouldStop(131072);
_confirm = BA.ObjectToString(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_key")))));Debug.locals.put("confirm", _confirm);
 BA.debugLineNum = 84;BA.debugLine="If confirm=\"-1\" Then";
Debug.ShouldStop(524288);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-1"))) { 
 BA.debugLineNum = 85;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
Debug.ShouldStop(1048576);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Usuario o contraseña incorrectos.")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 86;BA.debugLine="Return False";
Debug.ShouldStop(2097152);
if (true) return b4i_main.__c.runMethod(true,"False");
 }else 
{ BA.debugLineNum = 87;BA.debugLine="else if confirm=\"-2\" Then";
Debug.ShouldStop(4194304);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-2"))) { 
 BA.debugLineNum = 88;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"Informac";
Debug.ShouldStop(8388608);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este usuario esta desactivado")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 89;BA.debugLine="Return False";
Debug.ShouldStop(16777216);
if (true) return b4i_main.__c.runMethod(true,"False");
 }else 
{ BA.debugLineNum = 90;BA.debugLine="else if confirm=\"-3\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-3"))) { 
 BA.debugLineNum = 91;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
Debug.ShouldStop(67108864);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este usuario ya existe")),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 92;BA.debugLine="Return False";
Debug.ShouldStop(134217728);
if (true) return b4i_main.__c.runMethod(true,"False");
 }else 
{ BA.debugLineNum = 93;BA.debugLine="else if confirm=\"-4\" Then";
Debug.ShouldStop(268435456);
if (RemoteObject.solveBoolean("=",_confirm,BA.ObjectToString("-4"))) { 
 BA.debugLineNum = 95;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
Debug.ShouldStop(1073741824);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("**The print is not finish yet")),(Object)(RemoteObject.createImmutable("Information")));
 BA.debugLineNum = 96;BA.debugLine="Return False";
Debug.ShouldStop(-2147483648);
if (true) return b4i_main.__c.runMethod(true,"False");
 }}}}
;
 BA.debugLineNum = 99;BA.debugLine="Return True";
Debug.ShouldStop(4);
if (true) return b4i_main.__c.runMethod(true,"True");
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.ShouldStop(16);
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}