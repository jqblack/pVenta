package com.jq.pedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class funcion {
private static funcion mostCurrent = new funcion();
public static Object getObject() {
    throw new RuntimeException("Code module does not support this method.");
}
 
public anywheresoftware.b4a.keywords.Common __c = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static float  _getdevicephysicalsize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getdevicephysicalsize", false))
	 {return ((Float) Debug.delegate(null, "getdevicephysicalsize", new Object[] {_ba}));}
anywheresoftware.b4a.keywords.LayoutValues _lv = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub GetDevicePhysicalSize As Float";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim lv As LayoutValues";
_lv = new anywheresoftware.b4a.keywords.LayoutValues();
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="lv = GetDeviceLayoutValues";
_lv = anywheresoftware.b4a.keywords.Common.GetDeviceLayoutValues(_ba);
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Return Sqrt(Power(lv.Height / lv.Scale / 160, 2";
if (true) return (float) (anywheresoftware.b4a.keywords.Common.Sqrt(anywheresoftware.b4a.keywords.Common.Power(_lv.Height/(double)_lv.Scale/(double)160,2)+anywheresoftware.b4a.keywords.Common.Power(_lv.Width/(double)_lv.Scale/(double)160,2)));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="End Sub";
return 0f;
}
public static String  _crearjson(anywheresoftware.b4a.BA _ba,String _token,String _data) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "crearjson", false))
	 {return ((String) Debug.delegate(null, "crearjson", new Object[] {_ba,_token,_data}));}
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub crearJson(token As String,data As String) As S";
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
if (true) return _crearjson2(_ba,_token,"{"+_data+"}");
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="End Sub";
return "";
}
public static String  _disableview(anywheresoftware.b4a.BA _ba,boolean _tipo,anywheresoftware.b4a.objects.PanelWrapper _pan) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "disableview", false))
	 {return ((String) Debug.delegate(null, "disableview", new Object[] {_ba,_tipo,_pan}));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _n = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _listv = null;
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub DisableView(tipo As Boolean, pan As Panel)";
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="For Each n As View In pan";
_n = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _pan;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_n.setObject((android.view.View)(group1.Get(index1)));
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="n.Enabled= Not(tipo)";
_n.setEnabled(anywheresoftware.b4a.keywords.Common.Not(_tipo));
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Select GetType(n)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject())),"anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView","anywheresoftware.b4a.BALayout")) {
case 0: {
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Dim listV As ScrollView = n";
_listv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_listv.setObject((android.widget.ScrollView)(_n.getObject()));
RDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="DisableView(tipo,listV.Panel)";
_disableview(_ba,_tipo,_listv.getPanel());
 break; }
case 1: {
RDebugUtils.currentLine=5046284;
 //BA.debugLineNum = 5046284;BA.debugLine="DisableView(tipo,n)";
_disableview(_ba,_tipo,(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_n.getObject())));
 break; }
}
;
 }
};
RDebugUtils.currentLine=5046290;
 //BA.debugLineNum = 5046290;BA.debugLine="End Sub";
return "";
}
public static String  _crearjson2(anywheresoftware.b4a.BA _ba,String _token,String _data) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "crearjson2", false))
	 {return ((String) Debug.delegate(null, "crearjson2", new Object[] {_ba,_token,_data}));}
String _json = "";
anywheresoftware.b4a.agraham.encryption.Base64 _b64 = null;
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub crearJson2(token As String,data As String) As";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Dim b64 As Base64";
_b64 = new anywheresoftware.b4a.agraham.encryption.Base64();
RDebugUtils.currentLine=5177347;
 //BA.debugLineNum = 5177347;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
_json = "{'f_key':'"+_token+"','f_data':"+_data+"}";
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Log(json)";
anywheresoftware.b4a.keywords.Common.LogImpl("65177348",_json,0);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="json = b64.EncodeStoS(json,\"UTF-8\")";
_json = _b64.EncodeStoS(_json,"UTF-8");
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="End Sub";
return "";
}
public static boolean  _verificarjob(anywheresoftware.b4a.BA _ba,String _job) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "verificarjob", false))
	 {return ((Boolean) Debug.delegate(null, "verificarjob", new Object[] {_ba,_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
String _confirm = "";
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub verificarJob(job As String) As Boolean";
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="job = base64_Decode(job)";
_job = _base64_decode(_ba,_job);
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Log(job)";
anywheresoftware.b4a.keywords.Common.LogImpl("65439492",_job,0);
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim Json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="Json.Initialize(job)";
_json.Initialize(_job);
RDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="map=Json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="Dim confirm As String";
_confirm = "";
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="confirm=map.Get(\"f_key\")";
_confirm = BA.ObjectToString(_map.Get((Object)("f_key")));
RDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="If confirm=\"-1\" Then";
if ((_confirm).equals("-1")) { 
RDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Usuario o contraseña incorrectos."),BA.ObjectToCharSequence("Información"),_ba);
RDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="else if confirm=\"-2\" Then";
if ((_confirm).equals("-2")) { 
RDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este usuario esta desactivado"),BA.ObjectToCharSequence(""),_ba);
RDebugUtils.currentLine=5439504;
 //BA.debugLineNum = 5439504;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="else if confirm=\"-3\" Then";
if ((_confirm).equals("-3")) { 
RDebugUtils.currentLine=5439506;
 //BA.debugLineNum = 5439506;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este usuario ya existe"),BA.ObjectToCharSequence("Información"),_ba);
RDebugUtils.currentLine=5439507;
 //BA.debugLineNum = 5439507;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=5439508;
 //BA.debugLineNum = 5439508;BA.debugLine="else if confirm=\"-4\" Then";
if ((_confirm).equals("-4")) { 
RDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("**The print is not finish yet"),BA.ObjectToCharSequence("Information"),_ba);
RDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="Log(job)";
anywheresoftware.b4a.keywords.Common.LogImpl("65439511",_job,0);
RDebugUtils.currentLine=5439512;
 //BA.debugLineNum = 5439512;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }}}}
;
RDebugUtils.currentLine=5439515;
 //BA.debugLineNum = 5439515;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=5439517;
 //BA.debugLineNum = 5439517;BA.debugLine="End Sub";
return false;
}
public static String  _base64_decode(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "base64_decode", false))
	 {return ((String) Debug.delegate(null, "base64_decode", new Object[] {_ba,_text}));}
anywheresoftware.b4a.agraham.encryption.Base64 _base64 = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub base64_Decode(text As String) As String";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="If text = Null Or text.Length = 0 Then";
if (_text== null || _text.length()==0) { 
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="Dim base64 As Base64";
_base64 = new anywheresoftware.b4a.agraham.encryption.Base64();
RDebugUtils.currentLine=5373958;
 //BA.debugLineNum = 5373958;BA.debugLine="Return base64.DecodeStoS(text,\"UTF-8\")";
if (true) return _base64.DecodeStoS(_text,"UTF-8");
RDebugUtils.currentLine=5373959;
 //BA.debugLineNum = 5373959;BA.debugLine="End Sub";
return "";
}
public static String  _generarslidemenu(anywheresoftware.b4a.BA _ba,com.jq.pedidos.slidemenu _sm) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "generarslidemenu", false))
	 {return ((String) Debug.delegate(null, "generarslidemenu", new Object[] {_ba,_sm}));}
anywheresoftware.b4a.objects.collections.List _lista = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.Map _map2 = null;
anywheresoftware.b4a.objects.collections.Map _map3 = null;
anywheresoftware.b4a.objects.collections.Map _map4 = null;
anywheresoftware.b4a.objects.collections.Map _map5 = null;
anywheresoftware.b4a.objects.collections.Map _map6 = null;
anywheresoftware.b4a.objects.collections.Map _map8 = null;
anywheresoftware.b4a.objects.collections.Map _map9 = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapares = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub GenerarSlideMenu(sm As SlideMenu)";
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim lista As List";
_lista = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="lista.Initialize";
_lista.Initialize();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="map.Put(\"Nombre\",Main.usersData.nombre)";
_map.Put((Object)("Nombre"),(Object)(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .nombre /*String*/ ));
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="map.Put(\"ruta\",\"user32.png\")";
_map.Put((Object)("ruta"),(Object)("user32.png"));
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="lista.Add(map)";
_lista.Add((Object)(_map.getObject()));
 }else {
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="map.Put(\"Nombre\",\"Público\")";
_map.Put((Object)("Nombre"),(Object)("Público"));
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="map.Put(\"ruta\",\"user32.png\")";
_map.Put((Object)("ruta"),(Object)("user32.png"));
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="lista.Add(map)";
_lista.Add((Object)(_map.getObject()));
 };
RDebugUtils.currentLine=6684692;
 //BA.debugLineNum = 6684692;BA.debugLine="Dim map2 As Map";
_map2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684693;
 //BA.debugLineNum = 6684693;BA.debugLine="map2.Initialize";
_map2.Initialize();
RDebugUtils.currentLine=6684695;
 //BA.debugLineNum = 6684695;BA.debugLine="map2.Put(\"Nombre\",\"Inicio\")";
_map2.Put((Object)("Nombre"),(Object)("Inicio"));
RDebugUtils.currentLine=6684696;
 //BA.debugLineNum = 6684696;BA.debugLine="map2.Put(\"ruta\",\"house32.png\")";
_map2.Put((Object)("ruta"),(Object)("house32.png"));
RDebugUtils.currentLine=6684697;
 //BA.debugLineNum = 6684697;BA.debugLine="lista.Add(map2)";
_lista.Add((Object)(_map2.getObject()));
RDebugUtils.currentLine=6684699;
 //BA.debugLineNum = 6684699;BA.debugLine="Dim map3 As Map";
_map3 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684700;
 //BA.debugLineNum = 6684700;BA.debugLine="map3.Initialize";
_map3.Initialize();
RDebugUtils.currentLine=6684701;
 //BA.debugLineNum = 6684701;BA.debugLine="map3.Put(\"Nombre\",\"Categoria\")";
_map3.Put((Object)("Nombre"),(Object)("Categoria"));
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="map3.Put(\"ruta\",\"categoria.jpg\")";
_map3.Put((Object)("ruta"),(Object)("categoria.jpg"));
RDebugUtils.currentLine=6684703;
 //BA.debugLineNum = 6684703;BA.debugLine="lista.Add(map3)";
_lista.Add((Object)(_map3.getObject()));
RDebugUtils.currentLine=6684705;
 //BA.debugLineNum = 6684705;BA.debugLine="Dim map4 As Map";
_map4 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684706;
 //BA.debugLineNum = 6684706;BA.debugLine="map4.Initialize";
_map4.Initialize();
RDebugUtils.currentLine=6684707;
 //BA.debugLineNum = 6684707;BA.debugLine="map4.Put(\"Nombre\",\"Lista Favoritos\")";
_map4.Put((Object)("Nombre"),(Object)("Lista Favoritos"));
RDebugUtils.currentLine=6684708;
 //BA.debugLineNum = 6684708;BA.debugLine="map4.Put(\"ruta\",\"favorite.png\")";
_map4.Put((Object)("ruta"),(Object)("favorite.png"));
RDebugUtils.currentLine=6684709;
 //BA.debugLineNum = 6684709;BA.debugLine="lista.Add(map4)";
_lista.Add((Object)(_map4.getObject()));
RDebugUtils.currentLine=6684711;
 //BA.debugLineNum = 6684711;BA.debugLine="Dim map5 As Map";
_map5 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684712;
 //BA.debugLineNum = 6684712;BA.debugLine="map5.Initialize";
_map5.Initialize();
RDebugUtils.currentLine=6684713;
 //BA.debugLineNum = 6684713;BA.debugLine="map5.Put(\"Nombre\",\"Direcciones\")";
_map5.Put((Object)("Nombre"),(Object)("Direcciones"));
RDebugUtils.currentLine=6684714;
 //BA.debugLineNum = 6684714;BA.debugLine="map5.Put(\"ruta\",\"location-pin.png\")";
_map5.Put((Object)("ruta"),(Object)("location-pin.png"));
RDebugUtils.currentLine=6684715;
 //BA.debugLineNum = 6684715;BA.debugLine="lista.Add(map5)";
_lista.Add((Object)(_map5.getObject()));
RDebugUtils.currentLine=6684717;
 //BA.debugLineNum = 6684717;BA.debugLine="Dim map6 As Map";
_map6 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684718;
 //BA.debugLineNum = 6684718;BA.debugLine="map6.Initialize";
_map6.Initialize();
RDebugUtils.currentLine=6684719;
 //BA.debugLineNum = 6684719;BA.debugLine="map6.Put(\"Nombre\",\"Mis Ordenes\")";
_map6.Put((Object)("Nombre"),(Object)("Mis Ordenes"));
RDebugUtils.currentLine=6684720;
 //BA.debugLineNum = 6684720;BA.debugLine="map6.Put(\"ruta\",\"bill.png\")";
_map6.Put((Object)("ruta"),(Object)("bill.png"));
RDebugUtils.currentLine=6684721;
 //BA.debugLineNum = 6684721;BA.debugLine="lista.Add(map6)";
_lista.Add((Object)(_map6.getObject()));
RDebugUtils.currentLine=6684724;
 //BA.debugLineNum = 6684724;BA.debugLine="Dim map8 As Map";
_map8 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684725;
 //BA.debugLineNum = 6684725;BA.debugLine="map8.Initialize";
_map8.Initialize();
RDebugUtils.currentLine=6684726;
 //BA.debugLineNum = 6684726;BA.debugLine="map8.Put(\"Nombre\",\"Acerca de nostros\") '7";
_map8.Put((Object)("Nombre"),(Object)("Acerca de nostros"));
RDebugUtils.currentLine=6684727;
 //BA.debugLineNum = 6684727;BA.debugLine="map8.Put(\"ruta\",\"question.png\")";
_map8.Put((Object)("ruta"),(Object)("question.png"));
RDebugUtils.currentLine=6684728;
 //BA.debugLineNum = 6684728;BA.debugLine="lista.Add(map8)";
_lista.Add((Object)(_map8.getObject()));
RDebugUtils.currentLine=6684730;
 //BA.debugLineNum = 6684730;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=6684731;
 //BA.debugLineNum = 6684731;BA.debugLine="Dim map9 As Map";
_map9 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684732;
 //BA.debugLineNum = 6684732;BA.debugLine="map9.Initialize";
_map9.Initialize();
RDebugUtils.currentLine=6684733;
 //BA.debugLineNum = 6684733;BA.debugLine="map9.Put(\"Nombre\",\"Cerrar Sesión\") '8";
_map9.Put((Object)("Nombre"),(Object)("Cerrar Sesión"));
RDebugUtils.currentLine=6684734;
 //BA.debugLineNum = 6684734;BA.debugLine="map9.Put(\"ruta\",\"logout.png\")";
_map9.Put((Object)("ruta"),(Object)("logout.png"));
RDebugUtils.currentLine=6684735;
 //BA.debugLineNum = 6684735;BA.debugLine="lista.Add(map9)";
_lista.Add((Object)(_map9.getObject()));
 };
RDebugUtils.currentLine=6684739;
 //BA.debugLineNum = 6684739;BA.debugLine="For i=0 To lista.Size -1 Step 1";
{
final int step51 = 1;
final int limit51 = (int) (_lista.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
RDebugUtils.currentLine=6684741;
 //BA.debugLineNum = 6684741;BA.debugLine="Dim mapaRes As Map";
_mapares = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6684742;
 //BA.debugLineNum = 6684742;BA.debugLine="mapaRes.Initialize";
_mapares.Initialize();
RDebugUtils.currentLine=6684744;
 //BA.debugLineNum = 6684744;BA.debugLine="mapaRes = lista.Get(i)";
_mapares.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_lista.Get(_i)));
RDebugUtils.currentLine=6684746;
 //BA.debugLineNum = 6684746;BA.debugLine="sm.AddItem(mapaRes.Get(\"Nombre\"),LoadBitmap(File";
_sm._additem /*String*/ (null,BA.ObjectToString(_mapares.Get((Object)("Nombre"))),anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),BA.ObjectToString(_mapares.Get((Object)("ruta")))),(Object)(_i+1));
 }
};
RDebugUtils.currentLine=6684750;
 //BA.debugLineNum = 6684750;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ListViewWrapper _lv,int _color,int _height) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "setdivider", false))
	 {return ((String) Debug.delegate(null, "setdivider", new Object[] {_ba,_lv,_color,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub SetDivider(lv As ListView, color As Int, Heigh";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="CD.Initialize(color, 0)";
_cd.Initialize(_color,(int) (0));
RDebugUtils.currentLine=4521989;
 //BA.debugLineNum = 4521989;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD),";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=4521992;
 //BA.debugLineNum = 4521992;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.BitmapDrawable  _getimagen(anywheresoftware.b4a.BA _ba,String _imagenb64) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getimagen", false))
	 {return ((anywheresoftware.b4a.objects.drawable.BitmapDrawable) Debug.delegate(null, "getimagen", new Object[] {_ba,_imagenb64}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
byte[] _imagen = null;
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _draw = null;
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub getImagen(imagenB64 As String) As BitmapDrawab";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim imagen() As Byte";
_imagen = new byte[(int) (0)];
;
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
_imagen = _su.DecodeBase64(_imagenb64);
RDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Dim inp As InputStream";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
_inp.InitializeFromBytesArray(_imagen,(int) (0),_imagen.length);
RDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5570567;
 //BA.debugLineNum = 5570567;BA.debugLine="bmp.Initialize2(inp)";
_bmp.Initialize2((java.io.InputStream)(_inp.getObject()));
RDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="Dim draw As BitmapDrawable";
_draw = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=5570569;
 //BA.debugLineNum = 5570569;BA.debugLine="draw.Initialize(bmp)";
_draw.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=5570570;
 //BA.debugLineNum = 5570570;BA.debugLine="Return draw";
if (true) return _draw;
RDebugUtils.currentLine=5570571;
 //BA.debugLineNum = 5570571;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createpanelproducto(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _map) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "createpanelproducto", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(null, "createpanelproducto", new Object[] {_ba,_map}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _dr = null;
anywheresoftware.b4a.objects.PanelWrapper _panelfondopro = null;
anywheresoftware.b4a.objects.PanelWrapper _panelimagen = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _colpanel = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _drima = null;
anywheresoftware.b4a.objects.ImageViewWrapper _imagenpro = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltitulopro = null;
anywheresoftware.b4a.objects.LabelWrapper _lblpreciopro = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnaddpro = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.ImageViewWrapper _imgfav = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmimgfav = null;
anywheresoftware.b4a.objects.collections.Map _mapaimg = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapafav = null;
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub createPanelProducto(map As Map) As Panel";
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim dr As GradientDrawable";
_dr = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="dr.Initialize(\"TR_BL\", Array As Int(Colors.Red, C";
_dr.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.Red,anywheresoftware.b4a.keywords.Common.Colors.Red});
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = new anywheresoftware.b4a.objects.PanelWrapper();
_panelimagen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
_panelfondopro.Initialize(_ba,"PanelFondoPro");
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="PanelFondoPro.Width = 47%x";
_panelfondopro.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),_ba));
RDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="PanelFondoPro.Height = 4%y";
_panelfondopro.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (4),_ba));
RDebugUtils.currentLine=6488076;
 //BA.debugLineNum = 6488076;BA.debugLine="PanelFondoPro.Background = dr";
_panelfondopro.setBackground((android.graphics.drawable.Drawable)(_dr.getObject()));
RDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="Dim colpanel As ColorDrawable";
_colpanel = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="colpanel.Initialize(Colors.RGB(255, 255, 255),3di";
_colpanel.Initialize(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="PanelFondoPro.Background = colpanel";
_panelfondopro.setBackground((android.graphics.drawable.Drawable)(_colpanel.getObject()));
RDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="PanelFondoPro.Elevation = 5dip";
_panelfondopro.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="map.Put(\"f_destacado\",True)";
_map.Put((Object)("f_destacado"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="PanelImagen.Initialize(\"\")";
_panelimagen.Initialize(_ba,"");
RDebugUtils.currentLine=6488088;
 //BA.debugLineNum = 6488088;BA.debugLine="PanelImagen.Width = PanelFondoPro.Width";
_panelimagen.setWidth(_panelfondopro.getWidth());
RDebugUtils.currentLine=6488089;
 //BA.debugLineNum = 6488089;BA.debugLine="PanelImagen.Height = 20%y";
_panelimagen.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (20),_ba));
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="Dim drima As GradientDrawable";
_drima = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=6488092;
 //BA.debugLineNum = 6488092;BA.debugLine="drima.Initialize(\"TL_BR\" ,Array As Int(Colors.Whi";
_drima.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TL_BR"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White});
RDebugUtils.currentLine=6488094;
 //BA.debugLineNum = 6488094;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6488095;
 //BA.debugLineNum = 6488095;BA.debugLine="imagenPro.Initialize(\"\")";
_imagenpro.Initialize(_ba,"");
RDebugUtils.currentLine=6488097;
 //BA.debugLineNum = 6488097;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6488099;
 //BA.debugLineNum = 6488099;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_foto\"";
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=6488100;
 //BA.debugLineNum = 6488100;BA.debugLine="bm = getImagen(map.Get(\"f_foto\"))";
_bm = _getimagen(_ba,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=6488102;
 //BA.debugLineNum = 6488102;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 };
RDebugUtils.currentLine=6488105;
 //BA.debugLineNum = 6488105;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=6488107;
 //BA.debugLineNum = 6488107;BA.debugLine="imagenPro.Background = bm";
_imagenpro.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=6488108;
 //BA.debugLineNum = 6488108;BA.debugLine="PanelImagen.Background = drima";
_panelimagen.setBackground((android.graphics.drawable.Drawable)(_drima.getObject()));
RDebugUtils.currentLine=6488110;
 //BA.debugLineNum = 6488110;BA.debugLine="PanelImagen.Elevation = 1dip";
_panelimagen.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
RDebugUtils.currentLine=6488112;
 //BA.debugLineNum = 6488112;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0,0,PanelFondoP";
_panelfondopro.AddView((android.view.View)(_panelimagen.getObject()),(int) (0),(int) (0),_panelfondopro.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (17),_ba));
RDebugUtils.currentLine=6488114;
 //BA.debugLineNum = 6488114;BA.debugLine="PanelImagen.AddView(imagenPro,0,0,PanelImagen.Wid";
_panelimagen.AddView((android.view.View)(_imagenpro.getObject()),(int) (0),(int) (0),_panelimagen.getWidth(),_panelimagen.getHeight());
RDebugUtils.currentLine=6488116;
 //BA.debugLineNum = 6488116;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6488117;
 //BA.debugLineNum = 6488117;BA.debugLine="lblTituloPro.Initialize(\"\")";
_lbltitulopro.Initialize(_ba,"");
RDebugUtils.currentLine=6488118;
 //BA.debugLineNum = 6488118;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
_lbltitulopro.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=6488119;
 //BA.debugLineNum = 6488119;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
_lbltitulopro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (97),(int) (97),(int) (97)));
RDebugUtils.currentLine=6488120;
 //BA.debugLineNum = 6488120;BA.debugLine="lblTituloPro.TextSize = 14";
_lbltitulopro.setTextSize((float) (14));
RDebugUtils.currentLine=6488123;
 //BA.debugLineNum = 6488123;BA.debugLine="lblTituloPro.Width = PanelFondoPro.Width - 2%x";
_lbltitulopro.setWidth((int) (_panelfondopro.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba)));
RDebugUtils.currentLine=6488124;
 //BA.debugLineNum = 6488124;BA.debugLine="lblTituloPro.Height = 7%y";
_lbltitulopro.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),_ba));
RDebugUtils.currentLine=6488126;
 //BA.debugLineNum = 6488126;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,2%x,17%y,Panel";
_panelfondopro.AddView((android.view.View)(_lbltitulopro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (17),_ba),(int) (_panelfondopro.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),_ba));
RDebugUtils.currentLine=6488128;
 //BA.debugLineNum = 6488128;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6488129;
 //BA.debugLineNum = 6488129;BA.debugLine="lblPrecioPro.Initialize(\"\")";
_lblpreciopro.Initialize(_ba,"");
RDebugUtils.currentLine=6488130;
 //BA.debugLineNum = 6488130;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
_lblpreciopro.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=6488131;
 //BA.debugLineNum = 6488131;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
_lblpreciopro.setText(BA.ObjectToCharSequence("$ "+_lblpreciopro.getText()));
RDebugUtils.currentLine=6488132;
 //BA.debugLineNum = 6488132;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
_lblpreciopro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (76),(int) (175),(int) (80)));
RDebugUtils.currentLine=6488133;
 //BA.debugLineNum = 6488133;BA.debugLine="lblPrecioPro.TextSize = 16";
_lblpreciopro.setTextSize((float) (16));
RDebugUtils.currentLine=6488135;
 //BA.debugLineNum = 6488135;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,2%x,23%y,28%x,";
_panelfondopro.AddView((android.view.View)(_lblpreciopro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (23),_ba),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (28),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba));
RDebugUtils.currentLine=6488137;
 //BA.debugLineNum = 6488137;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6488138;
 //BA.debugLineNum = 6488138;BA.debugLine="btnAddPro.Initialize(\"btnAddPro\")";
_btnaddpro.Initialize(_ba,"btnAddPro");
RDebugUtils.currentLine=6488139;
 //BA.debugLineNum = 6488139;BA.debugLine="btnAddPro.Tag = map";
_btnaddpro.setTag((Object)(_map.getObject()));
RDebugUtils.currentLine=6488140;
 //BA.debugLineNum = 6488140;BA.debugLine="btnAddPro.Text = \"Agregar\"";
_btnaddpro.setText(BA.ObjectToCharSequence("Agregar"));
RDebugUtils.currentLine=6488141;
 //BA.debugLineNum = 6488141;BA.debugLine="btnAddPro.TextColor = Colors.White";
_btnaddpro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=6488143;
 //BA.debugLineNum = 6488143;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=6488144;
 //BA.debugLineNum = 6488144;BA.debugLine="cd.Initialize(Colors.RGB(244, 67, 54),3dip)";
_cd.Initialize(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (67),(int) (54)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=6488145;
 //BA.debugLineNum = 6488145;BA.debugLine="btnAddPro.Background = cd";
_btnaddpro.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=6488147;
 //BA.debugLineNum = 6488147;BA.debugLine="SetPadding(btnAddPro,0,0,0,0)";
_setpadding(_ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnaddpro.getObject())),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6488149;
 //BA.debugLineNum = 6488149;BA.debugLine="PanelFondoPro.AddView(btnAddPro,2%x,28%y,43%x,6%y";
_panelfondopro.AddView((android.view.View)(_btnaddpro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (28),_ba),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (43),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),_ba));
RDebugUtils.currentLine=6488151;
 //BA.debugLineNum = 6488151;BA.debugLine="Dim imgFav As ImageView";
_imgfav = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6488152;
 //BA.debugLineNum = 6488152;BA.debugLine="imgFav.Initialize(\"imgFav\")";
_imgfav.Initialize(_ba,"imgFav");
RDebugUtils.currentLine=6488153;
 //BA.debugLineNum = 6488153;BA.debugLine="Dim bmImgFav As BitmapDrawable";
_bmimgfav = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6488155;
 //BA.debugLineNum = 6488155;BA.debugLine="Dim mapaimg As Map";
_mapaimg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6488156;
 //BA.debugLineNum = 6488156;BA.debugLine="mapaimg.Initialize";
_mapaimg.Initialize();
RDebugUtils.currentLine=6488158;
 //BA.debugLineNum = 6488158;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=6488160;
 //BA.debugLineNum = 6488160;BA.debugLine="For i=0 To Principal.listafavoritos.Size -1";
{
final int step63 = 1;
final int limit63 = (int) (mostCurrent._principal._listafavoritos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit63 ;_i = _i + step63 ) {
RDebugUtils.currentLine=6488161;
 //BA.debugLineNum = 6488161;BA.debugLine="Dim mapafav As Map";
_mapafav = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6488162;
 //BA.debugLineNum = 6488162;BA.debugLine="mapafav = Principal.listafavoritos.Get(i)";
_mapafav.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._principal._listafavoritos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=6488164;
 //BA.debugLineNum = 6488164;BA.debugLine="If mapafav.Get(\"f_idrecord\") == map.Get(\"f_idre";
if ((_mapafav.Get((Object)("f_idrecord"))).equals(_map.Get((Object)("f_idrecord")))) { 
RDebugUtils.currentLine=6488165;
 //BA.debugLineNum = 6488165;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,";
_bmimgfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=6488166;
 //BA.debugLineNum = 6488166;BA.debugLine="map.Put(\"f_red\",True)";
_map.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=6488167;
 //BA.debugLineNum = 6488167;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
_map.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=6488170;
 //BA.debugLineNum = 6488170;BA.debugLine="mapaimg.Put(\"f_red\",True)";
_mapaimg.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=6488171;
 //BA.debugLineNum = 6488171;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecor";
_mapaimg.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=6488172;
 //BA.debugLineNum = 6488172;BA.debugLine="i = Principal.listafavoritos.Size -1";
_i = (int) (mostCurrent._principal._listafavoritos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
 };
 }
};
 };
RDebugUtils.currentLine=6488179;
 //BA.debugLineNum = 6488179;BA.debugLine="If bmImgFav.IsInitialized == False Then";
if (_bmimgfav.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6488180;
 //BA.debugLineNum = 6488180;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,\"h";
_bmimgfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartWhiteandBlack.png").getObject()));
RDebugUtils.currentLine=6488181;
 //BA.debugLineNum = 6488181;BA.debugLine="map.Put(\"f_red\",False)";
_map.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6488182;
 //BA.debugLineNum = 6488182;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
_map.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=6488185;
 //BA.debugLineNum = 6488185;BA.debugLine="mapaimg.Put(\"f_red\",False)";
_mapaimg.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6488186;
 //BA.debugLineNum = 6488186;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
_mapaimg.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
 };
RDebugUtils.currentLine=6488189;
 //BA.debugLineNum = 6488189;BA.debugLine="PanelFondoPro.Tag = map";
_panelfondopro.setTag((Object)(_map.getObject()));
RDebugUtils.currentLine=6488191;
 //BA.debugLineNum = 6488191;BA.debugLine="bmImgFav.Gravity = Gravity.FILL";
_bmimgfav.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=6488193;
 //BA.debugLineNum = 6488193;BA.debugLine="imgFav.Background = bmImgFav";
_imgfav.setBackground((android.graphics.drawable.Drawable)(_bmimgfav.getObject()));
RDebugUtils.currentLine=6488195;
 //BA.debugLineNum = 6488195;BA.debugLine="imgFav.Tag = mapaimg";
_imgfav.setTag((Object)(_mapaimg.getObject()));
RDebugUtils.currentLine=6488197;
 //BA.debugLineNum = 6488197;BA.debugLine="PanelFondoPro.AddView(imgFav,lblPrecioPro.Left +";
_panelfondopro.AddView((android.view.View)(_imgfav.getObject()),(int) (_lblpreciopro.getLeft()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (32.5),_ba)),_lblpreciopro.getTop(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (8),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),_ba));
RDebugUtils.currentLine=6488199;
 //BA.debugLineNum = 6488199;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
RDebugUtils.currentLine=6488201;
 //BA.debugLineNum = 6488201;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.PanelWrapper  _createpanelproductoscroll(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.Map _map,anywheresoftware.b4a.objects.drawable.BitmapDrawable _imagen) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "createpanelproductoscroll", false))
	 {return ((anywheresoftware.b4a.objects.PanelWrapper) Debug.delegate(null, "createpanelproductoscroll", new Object[] {_ba,_map,_imagen}));}
anywheresoftware.b4a.objects.drawable.GradientDrawable _dr = null;
anywheresoftware.b4a.objects.PanelWrapper _panelfondopro = null;
anywheresoftware.b4a.objects.PanelWrapper _panelimagen = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _colpanel = null;
anywheresoftware.b4a.objects.drawable.GradientDrawable _drima = null;
anywheresoftware.b4a.objects.ImageViewWrapper _imagenpro = null;
anywheresoftware.b4a.objects.LabelWrapper _lbltitulopro = null;
anywheresoftware.b4a.objects.LabelWrapper _lblpreciopro = null;
anywheresoftware.b4a.objects.ButtonWrapper _btnaddpro = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
anywheresoftware.b4a.objects.ImageViewWrapper _imgfav = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmimgfav = null;
anywheresoftware.b4a.objects.collections.Map _mapaimg = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapafav = null;
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub createPanelProductoScroll(map As Map, imagen A";
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="Dim dr As GradientDrawable";
_dr = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="dr.Initialize(\"TR_BL\", Array As Int(Colors.Red, C";
_dr.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TR_BL"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.Red,anywheresoftware.b4a.keywords.Common.Colors.Red});
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = new anywheresoftware.b4a.objects.PanelWrapper();
_panelimagen = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
_panelfondopro.Initialize(_ba,"PanelFondoPro");
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="PanelFondoPro.Width = 47%x";
_panelfondopro.setWidth(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),_ba));
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="PanelFondoPro.Height = 45%y";
_panelfondopro.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (45),_ba));
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="PanelFondoPro.Background = dr";
_panelfondopro.setBackground((android.graphics.drawable.Drawable)(_dr.getObject()));
RDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="Dim colpanel As ColorDrawable";
_colpanel = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=6619150;
 //BA.debugLineNum = 6619150;BA.debugLine="colpanel.Initialize(Colors.RGB(255, 255, 255),3di";
_colpanel.Initialize(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (255),(int) (255),(int) (255)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=6619153;
 //BA.debugLineNum = 6619153;BA.debugLine="PanelFondoPro.Background = colpanel";
_panelfondopro.setBackground((android.graphics.drawable.Drawable)(_colpanel.getObject()));
RDebugUtils.currentLine=6619155;
 //BA.debugLineNum = 6619155;BA.debugLine="PanelFondoPro.Elevation = 5dip";
_panelfondopro.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (5))));
RDebugUtils.currentLine=6619157;
 //BA.debugLineNum = 6619157;BA.debugLine="PanelImagen.Initialize(\"\")";
_panelimagen.Initialize(_ba,"");
RDebugUtils.currentLine=6619158;
 //BA.debugLineNum = 6619158;BA.debugLine="PanelImagen.Width = PanelFondoPro.Width";
_panelimagen.setWidth(_panelfondopro.getWidth());
RDebugUtils.currentLine=6619159;
 //BA.debugLineNum = 6619159;BA.debugLine="PanelImagen.Height = 20%y";
_panelimagen.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (20),_ba));
RDebugUtils.currentLine=6619161;
 //BA.debugLineNum = 6619161;BA.debugLine="Dim drima As GradientDrawable";
_drima = new anywheresoftware.b4a.objects.drawable.GradientDrawable();
RDebugUtils.currentLine=6619162;
 //BA.debugLineNum = 6619162;BA.debugLine="drima.Initialize(\"TL_BR\" ,Array As Int(Colors.Whi";
_drima.Initialize(BA.getEnumFromString(android.graphics.drawable.GradientDrawable.Orientation.class,"TL_BR"),new int[]{anywheresoftware.b4a.keywords.Common.Colors.White,anywheresoftware.b4a.keywords.Common.Colors.White});
RDebugUtils.currentLine=6619164;
 //BA.debugLineNum = 6619164;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6619165;
 //BA.debugLineNum = 6619165;BA.debugLine="imagenPro.Initialize(\"\")";
_imagenpro.Initialize(_ba,"");
RDebugUtils.currentLine=6619168;
 //BA.debugLineNum = 6619168;BA.debugLine="imagen.Gravity = Gravity.FILL";
_imagen.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=6619170;
 //BA.debugLineNum = 6619170;BA.debugLine="imagenPro.Background = imagen";
_imagenpro.setBackground((android.graphics.drawable.Drawable)(_imagen.getObject()));
RDebugUtils.currentLine=6619171;
 //BA.debugLineNum = 6619171;BA.debugLine="PanelImagen.Background = drima";
_panelimagen.setBackground((android.graphics.drawable.Drawable)(_drima.getObject()));
RDebugUtils.currentLine=6619173;
 //BA.debugLineNum = 6619173;BA.debugLine="map.Put(\"f_foto\",imagen)";
_map.Put((Object)("f_foto"),(Object)(_imagen.getObject()));
RDebugUtils.currentLine=6619175;
 //BA.debugLineNum = 6619175;BA.debugLine="map.Put(\"f_destacado\",False)";
_map.Put((Object)("f_destacado"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6619178;
 //BA.debugLineNum = 6619178;BA.debugLine="PanelImagen.Elevation = 1dip";
_panelimagen.setElevation((float) (anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1))));
RDebugUtils.currentLine=6619180;
 //BA.debugLineNum = 6619180;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0,0,PanelFondoP";
_panelfondopro.AddView((android.view.View)(_panelimagen.getObject()),(int) (0),(int) (0),_panelfondopro.getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (17),_ba));
RDebugUtils.currentLine=6619182;
 //BA.debugLineNum = 6619182;BA.debugLine="PanelImagen.AddView(imagenPro,0,0,PanelImagen.Wid";
_panelimagen.AddView((android.view.View)(_imagenpro.getObject()),(int) (0),(int) (0),_panelimagen.getWidth(),_panelimagen.getHeight());
RDebugUtils.currentLine=6619184;
 //BA.debugLineNum = 6619184;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6619185;
 //BA.debugLineNum = 6619185;BA.debugLine="lblTituloPro.Initialize(\"\")";
_lbltitulopro.Initialize(_ba,"");
RDebugUtils.currentLine=6619186;
 //BA.debugLineNum = 6619186;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
_lbltitulopro.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=6619187;
 //BA.debugLineNum = 6619187;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
_lbltitulopro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (97),(int) (97),(int) (97)));
RDebugUtils.currentLine=6619188;
 //BA.debugLineNum = 6619188;BA.debugLine="lblTituloPro.TextSize = 14";
_lbltitulopro.setTextSize((float) (14));
RDebugUtils.currentLine=6619191;
 //BA.debugLineNum = 6619191;BA.debugLine="lblTituloPro.Width = PanelFondoPro.Width - 2%x";
_lbltitulopro.setWidth((int) (_panelfondopro.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba)));
RDebugUtils.currentLine=6619192;
 //BA.debugLineNum = 6619192;BA.debugLine="lblTituloPro.Height = 7%y";
_lbltitulopro.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),_ba));
RDebugUtils.currentLine=6619194;
 //BA.debugLineNum = 6619194;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,2%x,17%y,Panel";
_panelfondopro.AddView((android.view.View)(_lbltitulopro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (17),_ba),(int) (_panelfondopro.getWidth()-anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba)),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (7),_ba));
RDebugUtils.currentLine=6619196;
 //BA.debugLineNum = 6619196;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6619197;
 //BA.debugLineNum = 6619197;BA.debugLine="lblPrecioPro.Initialize(\"\")";
_lblpreciopro.Initialize(_ba,"");
RDebugUtils.currentLine=6619198;
 //BA.debugLineNum = 6619198;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
_lblpreciopro.setText(BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=6619199;
 //BA.debugLineNum = 6619199;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
_lblpreciopro.setText(BA.ObjectToCharSequence("$ "+_lblpreciopro.getText()));
RDebugUtils.currentLine=6619200;
 //BA.debugLineNum = 6619200;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
_lblpreciopro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (76),(int) (175),(int) (80)));
RDebugUtils.currentLine=6619201;
 //BA.debugLineNum = 6619201;BA.debugLine="lblPrecioPro.TextSize = 16";
_lblpreciopro.setTextSize((float) (16));
RDebugUtils.currentLine=6619203;
 //BA.debugLineNum = 6619203;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,2%x,23%y,28%x,";
_panelfondopro.AddView((android.view.View)(_lblpreciopro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (23),_ba),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (28),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),_ba));
RDebugUtils.currentLine=6619205;
 //BA.debugLineNum = 6619205;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=6619206;
 //BA.debugLineNum = 6619206;BA.debugLine="btnAddPro.Initialize(\"btnAddPro\")";
_btnaddpro.Initialize(_ba,"btnAddPro");
RDebugUtils.currentLine=6619207;
 //BA.debugLineNum = 6619207;BA.debugLine="btnAddPro.Text = \"Agregar\"";
_btnaddpro.setText(BA.ObjectToCharSequence("Agregar"));
RDebugUtils.currentLine=6619208;
 //BA.debugLineNum = 6619208;BA.debugLine="btnAddPro.TextColor = Colors.White";
_btnaddpro.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=6619209;
 //BA.debugLineNum = 6619209;BA.debugLine="btnAddPro.Tag = map";
_btnaddpro.setTag((Object)(_map.getObject()));
RDebugUtils.currentLine=6619211;
 //BA.debugLineNum = 6619211;BA.debugLine="Dim cd As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=6619212;
 //BA.debugLineNum = 6619212;BA.debugLine="cd.Initialize(Colors.RGB(244, 67, 54),3dip)";
_cd.Initialize(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (244),(int) (67),(int) (54)),anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (3)));
RDebugUtils.currentLine=6619213;
 //BA.debugLineNum = 6619213;BA.debugLine="btnAddPro.Background = cd";
_btnaddpro.setBackground((android.graphics.drawable.Drawable)(_cd.getObject()));
RDebugUtils.currentLine=6619215;
 //BA.debugLineNum = 6619215;BA.debugLine="SetPadding(btnAddPro,0,0,0,0)";
_setpadding(_ba,(anywheresoftware.b4a.objects.ConcreteViewWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.ConcreteViewWrapper(), (android.view.View)(_btnaddpro.getObject())),(int) (0),(int) (0),(int) (0),(int) (0));
RDebugUtils.currentLine=6619217;
 //BA.debugLineNum = 6619217;BA.debugLine="PanelFondoPro.AddView(btnAddPro,2%x,28%y,43%x,6%y";
_panelfondopro.AddView((android.view.View)(_btnaddpro.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (28),_ba),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (43),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),_ba));
RDebugUtils.currentLine=6619219;
 //BA.debugLineNum = 6619219;BA.debugLine="Dim imgFav As ImageView";
_imgfav = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6619220;
 //BA.debugLineNum = 6619220;BA.debugLine="imgFav.Initialize(\"imgFav\")";
_imgfav.Initialize(_ba,"imgFav");
RDebugUtils.currentLine=6619221;
 //BA.debugLineNum = 6619221;BA.debugLine="Dim bmImgFav As BitmapDrawable";
_bmimgfav = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6619223;
 //BA.debugLineNum = 6619223;BA.debugLine="Dim mapaimg As Map";
_mapaimg = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6619224;
 //BA.debugLineNum = 6619224;BA.debugLine="mapaimg.Initialize";
_mapaimg.Initialize();
RDebugUtils.currentLine=6619226;
 //BA.debugLineNum = 6619226;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=6619228;
 //BA.debugLineNum = 6619228;BA.debugLine="For i=0 To Principal.listafavoritos.Size -1";
{
final int step58 = 1;
final int limit58 = (int) (mostCurrent._principal._listafavoritos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
_i = (int) (0) ;
for (;_i <= limit58 ;_i = _i + step58 ) {
RDebugUtils.currentLine=6619229;
 //BA.debugLineNum = 6619229;BA.debugLine="Dim mapafav As Map";
_mapafav = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6619230;
 //BA.debugLineNum = 6619230;BA.debugLine="mapafav = Principal.listafavoritos.Get(i)";
_mapafav.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._principal._listafavoritos /*anywheresoftware.b4a.objects.collections.List*/ .Get(_i)));
RDebugUtils.currentLine=6619232;
 //BA.debugLineNum = 6619232;BA.debugLine="If mapafav.Get(\"f_idrecord\") == map.Get(\"f_idre";
if ((_mapafav.Get((Object)("f_idrecord"))).equals(_map.Get((Object)("f_idrecord")))) { 
RDebugUtils.currentLine=6619233;
 //BA.debugLineNum = 6619233;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,";
_bmimgfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=6619234;
 //BA.debugLineNum = 6619234;BA.debugLine="i = Principal.listafavoritos.Size -1";
_i = (int) (mostCurrent._principal._listafavoritos /*anywheresoftware.b4a.objects.collections.List*/ .getSize()-1);
RDebugUtils.currentLine=6619235;
 //BA.debugLineNum = 6619235;BA.debugLine="map.Put(\"f_red\",True)";
_map.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=6619236;
 //BA.debugLineNum = 6619236;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
_map.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=6619239;
 //BA.debugLineNum = 6619239;BA.debugLine="mapaimg.Put(\"f_red\",True)";
_mapaimg.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=6619240;
 //BA.debugLineNum = 6619240;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecor";
_mapaimg.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
 };
 }
};
 };
RDebugUtils.currentLine=6619247;
 //BA.debugLineNum = 6619247;BA.debugLine="If bmImgFav.IsInitialized == False Then";
if (_bmimgfav.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6619248;
 //BA.debugLineNum = 6619248;BA.debugLine="bmImgFav.Initialize(LoadBitmap(File.DirAssets,\"h";
_bmimgfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartWhiteandBlack.png").getObject()));
RDebugUtils.currentLine=6619249;
 //BA.debugLineNum = 6619249;BA.debugLine="map.Put(\"f_red\",False)";
_map.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6619250;
 //BA.debugLineNum = 6619250;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
_map.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=6619253;
 //BA.debugLineNum = 6619253;BA.debugLine="mapaimg.Put(\"f_red\",False)";
_mapaimg.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=6619254;
 //BA.debugLineNum = 6619254;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
_mapaimg.Put((Object)("f_idproducto"),_map.Get((Object)("f_idrecord")));
 };
RDebugUtils.currentLine=6619257;
 //BA.debugLineNum = 6619257;BA.debugLine="PanelFondoPro.Tag = map";
_panelfondopro.setTag((Object)(_map.getObject()));
RDebugUtils.currentLine=6619258;
 //BA.debugLineNum = 6619258;BA.debugLine="bmImgFav.Gravity = Gravity.FILL";
_bmimgfav.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=6619260;
 //BA.debugLineNum = 6619260;BA.debugLine="imgFav.Background = bmImgFav";
_imgfav.setBackground((android.graphics.drawable.Drawable)(_bmimgfav.getObject()));
RDebugUtils.currentLine=6619261;
 //BA.debugLineNum = 6619261;BA.debugLine="imgFav.Tag = mapaimg";
_imgfav.setTag((Object)(_mapaimg.getObject()));
RDebugUtils.currentLine=6619263;
 //BA.debugLineNum = 6619263;BA.debugLine="PanelFondoPro.AddView(imgFav,lblPrecioPro.Left +";
_panelfondopro.AddView((android.view.View)(_imgfav.getObject()),(int) (_lblpreciopro.getLeft()+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (32.5),_ba)),_lblpreciopro.getTop(),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (8),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (3),_ba));
RDebugUtils.currentLine=6619265;
 //BA.debugLineNum = 6619265;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
RDebugUtils.currentLine=6619267;
 //BA.debugLineNum = 6619267;BA.debugLine="End Sub";
return null;
}
public static anywheresoftware.b4a.objects.collections.Map  _recalcular(anywheresoftware.b4a.BA _ba,double _precio,double _descuento,double _cantidad,double _tax,boolean _impuestoincluido,boolean _exentoimpuesto) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "recalcular", false))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(null, "recalcular", new Object[] {_ba,_precio,_descuento,_cantidad,_tax,_impuestoincluido,_exentoimpuesto}));}
double _precio_para_mostrar = 0;
double _preciodescuento = 0;
double _total = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
RDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="If exentoImpuesto Then";
if (_exentoimpuesto) { 
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="tax = 0";
_tax = 0;
 };
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="Dim precio_para_mostrar As Double = precio";
_precio_para_mostrar = _precio;
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="If (impuestoIncluido) Then";
if ((_impuestoincluido)) { 
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
_precio_para_mostrar = _precio/(double)((_tax/(double)100)+1);
 };
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
_descuento = _get_descuento(_ba,_precio_para_mostrar,_descuento);
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
_preciodescuento = _precio_para_mostrar-_descuento;
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
_tax = _get_tax(_ba,_preciodescuento,_tax,_cantidad);
RDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
_total = _get_importe(_ba,_cantidad,_preciodescuento,_tax);
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
_map.Put((Object)("f_precio_para_mostrar"),(Object)(_precio_para_mostrar));
RDebugUtils.currentLine=4587541;
 //BA.debugLineNum = 4587541;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
_map.Put((Object)("f_tax"),(Object)(_tax));
RDebugUtils.currentLine=4587542;
 //BA.debugLineNum = 4587542;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
_map.Put((Object)("f_descuento"),(Object)(_descuento));
RDebugUtils.currentLine=4587543;
 //BA.debugLineNum = 4587543;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
_map.Put((Object)("f_total"),(Object)(_total));
RDebugUtils.currentLine=4587546;
 //BA.debugLineNum = 4587546;BA.debugLine="Return map";
if (true) return _map;
RDebugUtils.currentLine=4587547;
 //BA.debugLineNum = 4587547;BA.debugLine="End Sub";
return null;
}
public static void  _changescreen(anywheresoftware.b4a.BA _ba,int _caso,com.jq.pedidos.slidemenu _sm,anywheresoftware.b4a.objects.ActivityWrapper _activiad) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "changescreen", false))
	 {Debug.delegate(null, "changescreen", new Object[] {_ba,_caso,_sm,_activiad}); return;}
ResumableSub_ChangeScreen rsub = new ResumableSub_ChangeScreen(null,_ba,_caso,_sm,_activiad);
rsub.resume((_ba.processBA == null ? _ba : _ba.processBA), null);
}
public static class ResumableSub_ChangeScreen extends BA.ResumableSub {
public ResumableSub_ChangeScreen(com.jq.pedidos.funcion parent,anywheresoftware.b4a.BA _ba,int _caso,com.jq.pedidos.slidemenu _sm,anywheresoftware.b4a.objects.ActivityWrapper _activiad) {
this.parent = parent;
this._ba = _ba;
this._caso = _caso;
this._sm = _sm;
this._activiad = _activiad;
}
com.jq.pedidos.funcion parent;
anywheresoftware.b4a.BA _ba;
int _caso;
com.jq.pedidos.slidemenu _sm;
anywheresoftware.b4a.objects.ActivityWrapper _activiad;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="funcion";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Select caso";
if (true) break;

case 1:
//select
this.state = 30;
switch (_caso) {
case 1: {
this.state = 3;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
case 3: {
this.state = 19;
if (true) break;
}
case 4: {
this.state = 21;
if (true) break;
}
case 5: {
this.state = 23;
if (true) break;
}
case 6: {
this.state = 25;
if (true) break;
}
case 7: {
this.state = 27;
if (true) break;
}
case 8: {
this.state = 29;
if (true) break;
}
}
if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="If Main.logged Then";
if (true) break;

case 4:
//if
this.state = 15;
if (parent.mostCurrent._main._logged /*boolean*/ ) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 15;
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 31;
return;
case 31:
//C
this.state = 15;
;
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="StartActivity(Perfil)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._perfil.getObject()));
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="res = Msgbox2(\"Para ver su perfil primero debe";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para ver su perfil primero debe iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar sesión"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),_ba);
RDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (true) break;

case 9:
//if
this.state = 14;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 11;
}else {
this.state = 13;
}if (true) break;

case 11:
//C
this.state = 14;
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="Main.mostar = True";
parent.mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._main.getObject()));
 if (true) break;

case 13:
//C
this.state = 14;
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="Return";
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
RDebugUtils.currentLine=6750235;
 //BA.debugLineNum = 6750235;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 32;
return;
case 32:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750237;
 //BA.debugLineNum = 6750237;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._principal.getObject()));
 if (true) break;

case 19:
//C
this.state = 30;
RDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750241;
 //BA.debugLineNum = 6750241;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 33;
return;
case 33:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="StartActivity(Categoria)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._categoria.getObject()));
 if (true) break;

case 21:
//C
this.state = 30;
RDebugUtils.currentLine=6750245;
 //BA.debugLineNum = 6750245;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750246;
 //BA.debugLineNum = 6750246;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 34;
return;
case 34:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750247;
 //BA.debugLineNum = 6750247;BA.debugLine="Principal.SendClickFav = True";
parent.mostCurrent._principal._sendclickfav /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6750248;
 //BA.debugLineNum = 6750248;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._principal.getObject()));
 if (true) break;

case 23:
//C
this.state = 30;
RDebugUtils.currentLine=6750251;
 //BA.debugLineNum = 6750251;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750252;
 //BA.debugLineNum = 6750252;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 35;
return;
case 35:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750253;
 //BA.debugLineNum = 6750253;BA.debugLine="StartActivity(Direcciones)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._direcciones.getObject()));
 if (true) break;

case 25:
//C
this.state = 30;
RDebugUtils.currentLine=6750256;
 //BA.debugLineNum = 6750256;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750257;
 //BA.debugLineNum = 6750257;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 36;
return;
case 36:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750258;
 //BA.debugLineNum = 6750258;BA.debugLine="StartActivity(ReporteOrdenes)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._reporteordenes.getObject()));
 if (true) break;

case 27:
//C
this.state = 30;
RDebugUtils.currentLine=6750261;
 //BA.debugLineNum = 6750261;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750262;
 //BA.debugLineNum = 6750262;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 37;
return;
case 37:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750263;
 //BA.debugLineNum = 6750263;BA.debugLine="Principal.SendClickAbout = True";
parent.mostCurrent._principal._sendclickabout /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6750264;
 //BA.debugLineNum = 6750264;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._principal.getObject()));
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=6750267;
 //BA.debugLineNum = 6750267;BA.debugLine="sm.Hide";
_sm._hide /*String*/ (null);
RDebugUtils.currentLine=6750268;
 //BA.debugLineNum = 6750268;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(_ba,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "funcion", "changescreen"),(int) (200));
this.state = 38;
return;
case 38:
//C
this.state = 30;
;
RDebugUtils.currentLine=6750269;
 //BA.debugLineNum = 6750269;BA.debugLine="Main.mostar = True";
parent.mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6750270;
 //BA.debugLineNum = 6750270;BA.debugLine="Main.logged = False";
parent.mostCurrent._main._logged /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=6750271;
 //BA.debugLineNum = 6750271;BA.debugLine="Principal.loadagain = True";
parent.mostCurrent._principal._loadagain /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=6750272;
 //BA.debugLineNum = 6750272;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(parent.mostCurrent._main.getObject()));
 if (true) break;

case 30:
//C
this.state = -1;
;
RDebugUtils.currentLine=6750283;
 //BA.debugLineNum = 6750283;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _a_la_derecha(anywheresoftware.b4a.BA _ba,String _caracter,String _parametro,int _limite) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "a_la_derecha", false))
	 {return ((String) Debug.delegate(null, "a_la_derecha", new Object[] {_ba,_caracter,_parametro,_limite}));}
String _a = "";
int _i = 0;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub A_la_Derecha(caracter As String, parametro As";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim a As String";
_a = "";
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="limite=48";
_limite = (int) (48);
 };
RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="For i=1 To (limite - parametro.Length)";
{
final int step5 = 1;
final int limit5 = (int) ((_limite-_parametro.length()));
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="a=a&caracter";
_a = _a+_caracter;
 }
};
RDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="parametro=a&parametro";
_parametro = _a+_parametro;
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="Return parametro";
if (true) return _parametro;
RDebugUtils.currentLine=5898251;
 //BA.debugLineNum = 5898251;BA.debugLine="End Sub";
return "";
}
public static String  _addlinea(anywheresoftware.b4a.BA _ba,String _parametro,int _cantidad) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "addlinea", false))
	 {return ((String) Debug.delegate(null, "addlinea", new Object[] {_ba,_parametro,_cantidad}));}
String _linea = "";
int _i = 0;
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub AddLinea(parametro As String,cantidad As Int)";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="Dim linea As String";
_linea = "";
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="If cantidad =0 Then";
if (_cantidad==0) { 
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="cantidad=48";
_cantidad = (int) (48);
 };
RDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="For i=1 To cantidad";
{
final int step5 = 1;
final int limit5 = _cantidad;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="linea=linea & parametro";
_linea = _linea+_parametro;
 }
};
RDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="Return linea";
if (true) return _linea;
RDebugUtils.currentLine=5832716;
 //BA.debugLineNum = 5832716;BA.debugLine="End Sub";
return "";
}
public static String  _arrayimagetojson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _listimagen) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "arrayimagetojson", false))
	 {return ((String) Debug.delegate(null, "arrayimagetojson", new Object[] {_ba,_listimagen}));}
String _json = "";
int _i = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub ArrayImageToJson(listImagen As List) As String";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim json As String = \"[\"";
_json = "[";
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="For i=0 To listImagen.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (_listimagen.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="json = json & \",{'f_imagen':'\"&getByteImagen2(li";
_json = _json+",{'f_imagen':'"+_getbyteimagen2(_ba,(byte[])(_listimagen.Get(_i)))+"'}";
 }
};
RDebugUtils.currentLine=4849669;
 //BA.debugLineNum = 4849669;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
_json = _json.replace("[,{","[{");
RDebugUtils.currentLine=4849670;
 //BA.debugLineNum = 4849670;BA.debugLine="json = json & \"]\"";
_json = _json+"]";
RDebugUtils.currentLine=4849671;
 //BA.debugLineNum = 4849671;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=4849672;
 //BA.debugLineNum = 4849672;BA.debugLine="End Sub";
return "";
}
public static String  _getbyteimagen2(anywheresoftware.b4a.BA _ba,byte[] _data) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getbyteimagen2", false))
	 {return ((String) Debug.delegate(null, "getbyteimagen2", new Object[] {_ba,_data}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub getByteImagen2(data() As Byte) As String";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Return su.EncodeBase64(data)";
if (true) return _su.EncodeBase64(_data);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="End Sub";
return "";
}
public static String  _base64_encode(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "base64_encode", false))
	 {return ((String) Debug.delegate(null, "base64_encode", new Object[] {_ba,_text}));}
anywheresoftware.b4a.agraham.encryption.Base64 _base64 = null;
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub base64_Encode(text As String) As String";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim base64 As Base64";
_base64 = new anywheresoftware.b4a.agraham.encryption.Base64();
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Return base64.EncodeStoS(text,\"UTF-8\")";
if (true) return _base64.EncodeStoS(_text,"UTF-8");
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="End Sub";
return "";
}
public static String  _crear_preview(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _scrollviewfotos,anywheresoftware.b4a.objects.collections.List _listimagen) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "crear_preview", false))
	 {return ((String) Debug.delegate(null, "crear_preview", new Object[] {_ba,_scrollviewfotos,_listimagen}));}
byte[] _imagen = null;
int _left = 0;
int _i = 0;
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub crear_preview(ScrollViewFotos As HorizontalScr";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="ScrollViewFotos.Panel.RemoveAllViews";
_scrollviewfotos.getPanel().RemoveAllViews();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="Dim imagen() As Byte";
_imagen = new byte[(int) (0)];
;
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Dim left As Int = 1%x";
_left = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),_ba);
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="For i=0 To listImagen.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (_listimagen.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=4915205;
 //BA.debugLineNum = 4915205;BA.debugLine="imagen = listImagen.Get(i)";
_imagen = (byte[])(_listimagen.Get(_i));
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="img.Initialize(\"View\")";
_img.Initialize(_ba,"View");
RDebugUtils.currentLine=4915208;
 //BA.debugLineNum = 4915208;BA.debugLine="img.Tag = i";
_img.setTag((Object)(_i));
RDebugUtils.currentLine=4915209;
 //BA.debugLineNum = 4915209;BA.debugLine="img.Background = getImagen2(imagen)";
_img.setBackground((android.graphics.drawable.Drawable)(_getimagen2(_ba,_imagen).getObject()));
RDebugUtils.currentLine=4915210;
 //BA.debugLineNum = 4915210;BA.debugLine="ScrollViewFotos.Panel.AddView(img,left,0%y,23%x,";
_scrollviewfotos.getPanel().AddView((android.view.View)(_img.getObject()),_left,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (23),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),_ba));
RDebugUtils.currentLine=4915211;
 //BA.debugLineNum = 4915211;BA.debugLine="left =left+25%x";
_left = (int) (_left+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),_ba));
 }
};
RDebugUtils.currentLine=4915213;
 //BA.debugLineNum = 4915213;BA.debugLine="ScrollViewFotos.Panel.Width = left";
_scrollviewfotos.getPanel().setWidth(_left);
RDebugUtils.currentLine=4915214;
 //BA.debugLineNum = 4915214;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.BitmapDrawable  _getimagen2(anywheresoftware.b4a.BA _ba,byte[] _imagen) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getimagen2", false))
	 {return ((anywheresoftware.b4a.objects.drawable.BitmapDrawable) Debug.delegate(null, "getimagen2", new Object[] {_ba,_imagen}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _draw = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub getImagen2(imagen() As Byte) As BitmapDrawable";
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim inp As InputStream";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
_inp.InitializeFromBytesArray(_imagen,(int) (0),_imagen.length);
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="bmp.Initialize2(inp)";
_bmp.Initialize2((java.io.InputStream)(_inp.getObject()));
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="Dim draw As BitmapDrawable";
_draw = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="draw.Initialize(bmp)";
_draw.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="Return draw";
if (true) return _draw;
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="End Sub";
return null;
}
public static String  _setpadding(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ConcreteViewWrapper _va,int _left,int _top,int _right,int _bottom) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "setpadding", false))
	 {return ((String) Debug.delegate(null, "setpadding", new Object[] {_ba,_va,_left,_top,_right,_bottom}));}
anywheresoftware.b4j.object.JavaObject _jo = null;
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub SetPadding(va As View, Left As Int, Top As Int";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim jo As JavaObject = va";
_jo = new anywheresoftware.b4j.object.JavaObject();
_jo.setObject((java.lang.Object)(_va.getObject()));
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="jo.RunMethod(\"setPadding\", Array As Object(Left,";
_jo.RunMethod("setPadding",new Object[]{(Object)(_left),(Object)(_top),(Object)(_right),(Object)(_bottom)});
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="End Sub";
return "";
}
public static double  _get_descuento(anywheresoftware.b4a.BA _ba,double _precio,double _descuento) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "get_descuento", false))
	 {return ((Double) Debug.delegate(null, "get_descuento", new Object[] {_ba,_precio,_descuento}));}
double _precio2 = 0;
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="Dim precio2 As Double";
_precio2 = 0;
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="precio2 = precio * (descuento / 100)";
_precio2 = _precio*(_descuento/(double)100);
RDebugUtils.currentLine=6225923;
 //BA.debugLineNum = 6225923;BA.debugLine="Return precio2";
if (true) return _precio2;
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="End Sub";
return 0;
}
public static double  _get_importe(anywheresoftware.b4a.BA _ba,double _cantidad,double _precio,double _tax) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "get_importe", false))
	 {return ((Double) Debug.delegate(null, "get_importe", new Object[] {_ba,_cantidad,_precio,_tax}));}
double _dato = 0;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="Dim dato As Double";
_dato = 0;
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="dato = ((precio * cantidad) + tax)";
_dato = ((_precio*_cantidad)+_tax);
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Return  dato";
if (true) return _dato;
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return 0;
}
public static double  _get_tax(anywheresoftware.b4a.BA _ba,double _precio,double _tax,double _cantidad) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "get_tax", false))
	 {return ((Double) Debug.delegate(null, "get_tax", new Object[] {_ba,_precio,_tax,_cantidad}));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
_tax = (_precio*(_tax/(double)100))*_cantidad;
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="Return tax";
if (true) return _tax;
RDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="End Sub";
return 0;
}
public static String  _getallcontacts(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getallcontacts", false))
	 {return ((String) Debug.delegate(null, "getallcontacts", new Object[] {_ba}));}
anywheresoftware.b4a.objects.ContentResolverWrapper _cr = null;
String[] _peopleprojection = null;
String _json = "";
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _u = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _crsr = null;
int _i = 0;
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub GetAllContacts As String";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="Private PeopleProjection() As String = Array As S";
_peopleprojection = new String[]{"times_contacted","last_time_contacted","display_name","has_phone_number","starred","_id","photo_id"};
RDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="Dim json As String = \"[\"";
_json = "[";
RDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Dim u As Uri";
_u = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=6357000;
 //BA.debugLineNum = 6357000;BA.debugLine="u.Parse(\"content://com.android.contacts/contacts\"";
_u.Parse("content://com.android.contacts/contacts");
RDebugUtils.currentLine=6357001;
 //BA.debugLineNum = 6357001;BA.debugLine="Dim Crsr As Cursor = cr.Query(u, PeopleProjection";
_crsr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crsr = _cr.Query(_u,_peopleprojection,"",(String[])(anywheresoftware.b4a.keywords.Common.Null),"");
RDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="For i = 0 To Crsr.RowCount - 1";
{
final int step7 = 1;
final int limit7 = (int) (_crsr.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Crsr.Position = i";
_crsr.setPosition(_i);
RDebugUtils.currentLine=6357005;
 //BA.debugLineNum = 6357005;BA.debugLine="json = json & \",{'f_nombre':'\"& base64_Encode(Cr";
_json = _json+",{'f_nombre':'"+_base64_encode(_ba,_crsr.GetString("display_name"))+"','f_id':'"+_crsr.GetString("_id")+"','f_phone_list':"+_getphonesbyid(_ba,_crsr.GetString("_id"))+"}";
 }
};
RDebugUtils.currentLine=6357010;
 //BA.debugLineNum = 6357010;BA.debugLine="Crsr.Close";
_crsr.Close();
RDebugUtils.currentLine=6357012;
 //BA.debugLineNum = 6357012;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
_json = _json.replace("[,{","[{");
RDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="json = json & \"]\"";
_json = _json+"]";
RDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="json = json.Replace(\"'\",Chr(34))";
_json = _json.replace("'",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34))));
RDebugUtils.currentLine=6357017;
 //BA.debugLineNum = 6357017;BA.debugLine="Log(json)";
anywheresoftware.b4a.keywords.Common.LogImpl("66357017",_json,0);
RDebugUtils.currentLine=6357018;
 //BA.debugLineNum = 6357018;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="End Sub";
return "";
}
public static String  _getphonesbyid(anywheresoftware.b4a.BA _ba,String _id) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getphonesbyid", false))
	 {return ((String) Debug.delegate(null, "getphonesbyid", new Object[] {_ba,_id}));}
anywheresoftware.b4a.objects.ContentResolverWrapper _cr = null;
String _json = "";
anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper _phonesuri = null;
anywheresoftware.b4a.sql.SQL.CursorWrapper _phones = null;
int _i = 0;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub getPhonesByID(id As String) As String";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim json As String = \"[\"";
_json = "[";
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="Dim phonesUri As Uri";
_phonesuri = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="phonesUri.Parse(\"content://com.android.contacts/d";
_phonesuri.Parse("content://com.android.contacts/data/phones");
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Dim phones As Cursor = cr.Query(phonesUri,  Array";
_phones = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_phones = _cr.Query(_phonesuri,new String[]{"data1","data2"},"contact_id = ?",new String[]{_id},"");
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="For i = 0 To phones.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_phones.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="phones.Position = i";
_phones.setPosition(_i);
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="json = json & \",{'f_phone_number':'\"&phones.GetS";
_json = _json+",{'f_phone_number':'"+_phones.GetString("data1")+"','f_type':'"+_phones.GetString("data2")+"'}";
 }
};
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="phones.Close";
_phones.Close();
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="json =  json.Replace(\"[,{\",\"[{\")";
_json = _json.replace("[,{","[{");
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="json = json & \"]\"";
_json = _json+"]";
RDebugUtils.currentLine=6422544;
 //BA.debugLineNum = 6422544;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=6422547;
 //BA.debugLineNum = 6422547;BA.debugLine="End Sub";
return "";
}
public static String  _getbyteimagen(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmap) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getbyteimagen", false))
	 {return ((String) Debug.delegate(null, "getbyteimagen", new Object[] {_ba,_bmap}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As String";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="out.InitializeToBytesArray(1)";
_out.InitializeToBytesArray((int) (1));
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
_bmap.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="out.Flush";
_out.Flush();
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="Return su.EncodeBase64(data)";
if (true) return _su.EncodeBase64(_data);
RDebugUtils.currentLine=5701642;
 //BA.debugLineNum = 5701642;BA.debugLine="End Sub";
return "";
}
public static String  _getday(anywheresoftware.b4a.BA _ba,int _day) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getday", false))
	 {return ((String) Debug.delegate(null, "getday", new Object[] {_ba,_day}));}
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub getDay(day As Int) As String";
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Select day";
switch (_day) {
case 0: {
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Return \"Sunday\"";
if (true) return "Sunday";
 break; }
case 1: {
RDebugUtils.currentLine=5111814;
 //BA.debugLineNum = 5111814;BA.debugLine="Return \"Monday\"";
if (true) return "Monday";
 break; }
case 2: {
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Return \"Tuesday\"";
if (true) return "Tuesday";
 break; }
case 3: {
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="Return \"Wednesday\"";
if (true) return "Wednesday";
 break; }
case 4: {
RDebugUtils.currentLine=5111820;
 //BA.debugLineNum = 5111820;BA.debugLine="Return \"Thursday\"";
if (true) return "Thursday";
 break; }
case 5: {
RDebugUtils.currentLine=5111822;
 //BA.debugLineNum = 5111822;BA.debugLine="Return \"Friday\"";
if (true) return "Friday";
 break; }
case 6: {
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="Return \"Saturday\"";
if (true) return "Saturday";
 break; }
}
;
RDebugUtils.currentLine=5111826;
 //BA.debugLineNum = 5111826;BA.debugLine="End Sub";
return "";
}
public static String  _getdecimal(anywheresoftware.b4a.BA _ba,double _n) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getdecimal", false))
	 {return ((String) Debug.delegate(null, "getdecimal", new Object[] {_ba,_n}));}
String _numero = "";
String _punto = "";
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub getDecimal(n As Double) As String";
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="If IsNumber(n) = False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_n))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="Return n";
if (true) return BA.NumberToString(_n);
 };
RDebugUtils.currentLine=4980742;
 //BA.debugLineNum = 4980742;BA.debugLine="Dim numero, punto As String";
_numero = "";
_punto = "";
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="numero=Round2(n,0)";
_numero = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_n,(int) (0)));
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="If numero>n Then";
if ((double)(Double.parseDouble(_numero))>_n) { 
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="numero=numero-1";
_numero = BA.NumberToString((double)(Double.parseDouble(_numero))-1);
 };
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="If (n-numero) > 0 Then";
if ((_n-(double)(Double.parseDouble(_numero)))>0) { 
RDebugUtils.currentLine=4980750;
 //BA.debugLineNum = 4980750;BA.debugLine="punto = n";
_punto = BA.NumberToString(_n);
RDebugUtils.currentLine=4980751;
 //BA.debugLineNum = 4980751;BA.debugLine="If punto.SubString(punto.IndexOf(\".\")+1).Length<";
if (_punto.substring((int) (_punto.indexOf(".")+1)).length()<=1) { 
RDebugUtils.currentLine=4980752;
 //BA.debugLineNum = 4980752;BA.debugLine="punto= punto&\"0\"";
_punto = _punto+"0";
 };
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="Return punto";
if (true) return _punto;
 }else {
RDebugUtils.currentLine=4980756;
 //BA.debugLineNum = 4980756;BA.debugLine="Return numero&\".00\"";
if (true) return _numero+".00";
 };
RDebugUtils.currentLine=4980758;
 //BA.debugLineNum = 4980758;BA.debugLine="End Sub";
return "";
}
public static double  _getdiferenciacantidad(anywheresoftware.b4a.BA _ba,double _cantidadactual,double _cantidadnueva) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getdiferenciacantidad", false))
	 {return ((Double) Debug.delegate(null, "getdiferenciacantidad", new Object[] {_ba,_cantidadactual,_cantidadnueva}));}
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
if (_cantidadnueva>_cantidadactual && _cantidadactual<0) { 
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 }else {
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="If cantidadActual > 0 Then";
if (_cantidadactual>0) { 
RDebugUtils.currentLine=4653062;
 //BA.debugLineNum = 4653062;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 };
 };
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="Return cantidadActual";
if (true) return _cantidadactual;
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="End Sub";
return 0;
}
public static com.jq.pedidos.slidemenu  _getslidemenu(anywheresoftware.b4a.BA _ba,com.jq.pedidos.slidemenu _sm,int _option) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getslidemenu", false))
	 {return ((com.jq.pedidos.slidemenu) Debug.delegate(null, "getslidemenu", new Object[] {_ba,_sm,_option}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub getSlideMenu(sm As SlideMenu, option As Int) A";
RDebugUtils.currentLine=4718605;
 //BA.debugLineNum = 4718605;BA.debugLine="End Sub";
return null;
}
public static String  _remplace(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "remplace", false))
	 {return ((String) Debug.delegate(null, "remplace", new Object[] {_ba,_text}));}
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub remplace(text As String ) As String";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="text=text.Replace(\"'\",\"´´\")";
_text = _text.replace("'","´´");
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Return text";
if (true) return _text;
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="End Sub";
return "";
}
public static String  _slidemenu_click(anywheresoftware.b4a.BA _ba,Object _item,anywheresoftware.b4a.objects.ActivityWrapper _act) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "slidemenu_click", false))
	 {return ((String) Debug.delegate(null, "slidemenu_click", new Object[] {_ba,_item,_act}));}
int _r = 0;
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub SlideMenu_Click(Item As Object, Act As Activit";
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="If Item <> -1 Then";
if ((_item).equals((Object)(-1)) == false) { 
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Act.Finish";
_act.Finish();
 };
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Select Item";
switch (BA.switchObjectToInt(_item,(Object)(-1))) {
case 0: {
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="r = Msgbox2(\"Seguro que desea salir de la aplic";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea salir de la aplicación?"),BA.ObjectToCharSequence(""),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),_ba);
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Act.Finish";
_act.Finish();
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._main.getObject()));
 };
 break; }
}
;
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="End Sub";
return "";
}
public static String  _titulo(anywheresoftware.b4a.BA _ba,String _parametro,int _limite) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "titulo", false))
	 {return ((String) Debug.delegate(null, "titulo", new Object[] {_ba,_parametro,_limite}));}
String _espacio = "";
String _totals = "";
double _cal = 0;
int _i = 0;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub titulo(parametro As String,limite As Int) As S";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = "";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = " ";
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Dim totals As String : totals=\"\"";
_totals = "";
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Dim totals As String : totals=\"\"";
_totals = "";
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="Dim cal As Double";
_cal = 0;
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="limite=48";
_limite = (int) (48);
 };
RDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="If parametro.Length<limite Then";
if (_parametro.length()<_limite) { 
RDebugUtils.currentLine=6029321;
 //BA.debugLineNum = 6029321;BA.debugLine="cal=limite-parametro.Length";
_cal = _limite-_parametro.length();
RDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="cal= cal/2";
_cal = _cal/(double)2;
RDebugUtils.currentLine=6029324;
 //BA.debugLineNum = 6029324;BA.debugLine="For i=1 To Round(cal)";
{
final int step12 = 1;
final int limit12 = (int) (anywheresoftware.b4a.keywords.Common.Round(_cal));
_i = (int) (1) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=6029325;
 //BA.debugLineNum = 6029325;BA.debugLine="totals=espacio& totals";
_totals = _espacio+_totals;
 }
};
RDebugUtils.currentLine=6029327;
 //BA.debugLineNum = 6029327;BA.debugLine="parametro=totals&parametro";
_parametro = _totals+_parametro;
RDebugUtils.currentLine=6029328;
 //BA.debugLineNum = 6029328;BA.debugLine="Return parametro";
if (true) return _parametro;
 }else {
RDebugUtils.currentLine=6029330;
 //BA.debugLineNum = 6029330;BA.debugLine="Return parametro";
if (true) return _parametro;
 };
RDebugUtils.currentLine=6029333;
 //BA.debugLineNum = 6029333;BA.debugLine="End Sub";
return "";
}
public static String  _v(anywheresoftware.b4a.BA _ba,String _parametro,int _limite) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "v", false))
	 {return ((String) Debug.delegate(null, "v", new Object[] {_ba,_parametro,_limite}));}
String _espacio = "";
int _i = 0;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub V (parametro As String,limite As Int) As Strin";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="limite=47";
_limite = (int) (47);
 };
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="If parametro.Length>limite Then";
if (_parametro.length()>_limite) { 
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="parametro=parametro.SubString2(0,limite-2)&\"..\"";
_parametro = _parametro.substring((int) (0),(int) (_limite-2))+"..";
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="Return parametro";
if (true) return _parametro;
 }else 
{RDebugUtils.currentLine=5963786;
 //BA.debugLineNum = 5963786;BA.debugLine="Else if parametro.Length<limite Then";
if (_parametro.length()<_limite) { 
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = "";
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = " ";
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="For i=1 To (limite-parametro.Length)";
{
final int step10 = 1;
final int limit10 = (int) ((_limite-_parametro.length()));
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="parametro=parametro&espacio";
_parametro = _parametro+_espacio;
 }
};
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="Return parametro";
if (true) return _parametro;
 }}
;
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="End Sub";
return "";
}
}