package com.menube.app;


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
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public static float  _getdevicephysicalsize(anywheresoftware.b4a.BA _ba) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getdevicephysicalsize", false))
	 {return ((Float) Debug.delegate(null, "getdevicephysicalsize", new Object[] {_ba}));}
anywheresoftware.b4a.keywords.LayoutValues _lv = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub GetDevicePhysicalSize As Float";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim lv As LayoutValues";
_lv = new anywheresoftware.b4a.keywords.LayoutValues();
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="lv = GetDeviceLayoutValues";
_lv = anywheresoftware.b4a.keywords.Common.GetDeviceLayoutValues(_ba);
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Return Sqrt(Power(lv.Height / lv.Scale / 160, 2";
if (true) return (float) (anywheresoftware.b4a.keywords.Common.Sqrt(anywheresoftware.b4a.keywords.Common.Power(_lv.Height/(double)_lv.Scale/(double)160,2)+anywheresoftware.b4a.keywords.Common.Power(_lv.Width/(double)_lv.Scale/(double)160,2)));
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="End Sub";
return 0f;
}
public static String  _crearjson(anywheresoftware.b4a.BA _ba,String _token,String _data) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "crearjson", false))
	 {return ((String) Debug.delegate(null, "crearjson", new Object[] {_ba,_token,_data}));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub crearJson(token As String,data As String) As S";
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
if (true) return _crearjson2(_ba,_token,"{"+_data+"}");
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="End Sub";
return "";
}
public static String  _crearjson2(anywheresoftware.b4a.BA _ba,String _token,String _data) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "crearjson2", false))
	 {return ((String) Debug.delegate(null, "crearjson2", new Object[] {_ba,_token,_data}));}
String _json = "";
anywheresoftware.b4a.agraham.encryption.Base64 _b64 = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub crearJson2(token As String,data As String) As";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Dim b64 As Base64";
_b64 = new anywheresoftware.b4a.agraham.encryption.Base64();
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
_json = "{'f_key':'"+_token+"','f_data':"+_data+"}";
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="Log(json)";
anywheresoftware.b4a.keywords.Common.LogImpl("43801092",_json,0);
RDebugUtils.currentLine=3801093;
 //BA.debugLineNum = 3801093;BA.debugLine="json = b64.EncodeStoS(json,\"UTF-8\")";
_json = _b64.EncodeStoS(_json,"UTF-8");
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=3801095;
 //BA.debugLineNum = 3801095;BA.debugLine="End Sub";
return "";
}
public static boolean  _verificarjob(anywheresoftware.b4a.BA _ba,String _job) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "verificarjob", false))
	 {return ((Boolean) Debug.delegate(null, "verificarjob", new Object[] {_ba,_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
String _confirm = "";
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub verificarJob(job As String) As Boolean";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="job = base64_Decode(job)";
_job = _base64_decode(_ba,_job);
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Log(job)";
anywheresoftware.b4a.keywords.Common.LogImpl("44063236",_job,0);
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Dim Json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="Json.Initialize(job)";
_json.Initialize(_job);
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="map=Json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="Dim confirm As String";
_confirm = "";
RDebugUtils.currentLine=4063241;
 //BA.debugLineNum = 4063241;BA.debugLine="confirm=map.Get(\"f_key\")";
_confirm = BA.ObjectToString(_map.Get((Object)("f_key")));
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="If confirm=\"-1\" Then";
if ((_confirm).equals("-1")) { 
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Usuario o contraseña incorrectos."),BA.ObjectToCharSequence("Información"),_ba);
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=4063246;
 //BA.debugLineNum = 4063246;BA.debugLine="else if confirm=\"-2\" Then";
if ((_confirm).equals("-2")) { 
RDebugUtils.currentLine=4063247;
 //BA.debugLineNum = 4063247;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este usuario esta desactivado"),BA.ObjectToCharSequence(""),_ba);
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=4063249;
 //BA.debugLineNum = 4063249;BA.debugLine="else if confirm=\"-3\" Then";
if ((_confirm).equals("-3")) { 
RDebugUtils.currentLine=4063250;
 //BA.debugLineNum = 4063250;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este usuario ya existe"),BA.ObjectToCharSequence("Información"),_ba);
RDebugUtils.currentLine=4063251;
 //BA.debugLineNum = 4063251;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }else 
{RDebugUtils.currentLine=4063252;
 //BA.debugLineNum = 4063252;BA.debugLine="else if confirm=\"-4\" Then";
if ((_confirm).equals("-4")) { 
RDebugUtils.currentLine=4063254;
 //BA.debugLineNum = 4063254;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("**The print is not finish yet"),BA.ObjectToCharSequence("Information"),_ba);
RDebugUtils.currentLine=4063255;
 //BA.debugLineNum = 4063255;BA.debugLine="Log(job)";
anywheresoftware.b4a.keywords.Common.LogImpl("44063255",_job,0);
RDebugUtils.currentLine=4063256;
 //BA.debugLineNum = 4063256;BA.debugLine="Return False";
if (true) return anywheresoftware.b4a.keywords.Common.False;
 }}}}
;
RDebugUtils.currentLine=4063259;
 //BA.debugLineNum = 4063259;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4063261;
 //BA.debugLineNum = 4063261;BA.debugLine="End Sub";
return false;
}
public static String  _base64_decode(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "base64_decode", false))
	 {return ((String) Debug.delegate(null, "base64_decode", new Object[] {_ba,_text}));}
anywheresoftware.b4a.agraham.encryption.Base64 _base64 = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub base64_Decode(text As String) As String";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If text = Null Or text.Length = 0 Then";
if (_text== null || _text.length()==0) { 
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="Dim base64 As Base64";
_base64 = new anywheresoftware.b4a.agraham.encryption.Base64();
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Return base64.DecodeStoS(text,\"UTF-8\")";
if (true) return _base64.DecodeStoS(_text,"UTF-8");
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="End Sub";
return "";
}
public static String  _disableview(anywheresoftware.b4a.BA _ba,boolean _tipo,anywheresoftware.b4a.objects.PanelWrapper _pan) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "disableview", false))
	 {return ((String) Debug.delegate(null, "disableview", new Object[] {_ba,_tipo,_pan}));}
anywheresoftware.b4a.objects.ConcreteViewWrapper _n = null;
anywheresoftware.b4a.objects.ScrollViewWrapper _listv = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub DisableView(tipo As Boolean, pan As Panel)";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="For Each n As View In pan";
_n = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group1 = _pan;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_n.setObject((android.view.View)(group1.Get(index1)));
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="n.Enabled= Not(tipo)";
_n.setEnabled(anywheresoftware.b4a.keywords.Common.Not(_tipo));
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="Select GetType(n)";
switch (BA.switchObjectToInt(anywheresoftware.b4a.keywords.Common.GetType((Object)(_n.getObject())),"anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView","anywheresoftware.b4a.BALayout")) {
case 0: {
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Dim listV As ScrollView = n";
_listv = new anywheresoftware.b4a.objects.ScrollViewWrapper();
_listv.setObject((android.widget.ScrollView)(_n.getObject()));
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="DisableView(tipo,listV.Panel)";
_disableview(_ba,_tipo,_listv.getPanel());
 break; }
case 1: {
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="DisableView(tipo,n)";
_disableview(_ba,_tipo,(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(_n.getObject())));
 break; }
}
;
 }
};
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="End Sub";
return "";
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
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub GetAllContacts As String";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Private PeopleProjection() As String = Array As S";
_peopleprojection = new String[]{"times_contacted","last_time_contacted","display_name","has_phone_number","starred","_id","photo_id"};
RDebugUtils.currentLine=4980741;
 //BA.debugLineNum = 4980741;BA.debugLine="Dim json As String = \"[\"";
_json = "[";
RDebugUtils.currentLine=4980743;
 //BA.debugLineNum = 4980743;BA.debugLine="Dim u As Uri";
_u = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=4980744;
 //BA.debugLineNum = 4980744;BA.debugLine="u.Parse(\"content://com.android.contacts/contacts\"";
_u.Parse("content://com.android.contacts/contacts");
RDebugUtils.currentLine=4980745;
 //BA.debugLineNum = 4980745;BA.debugLine="Dim Crsr As Cursor = cr.Query(u, PeopleProjection";
_crsr = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_crsr = _cr.Query(_u,_peopleprojection,"",(String[])(anywheresoftware.b4a.keywords.Common.Null),"");
RDebugUtils.currentLine=4980746;
 //BA.debugLineNum = 4980746;BA.debugLine="For i = 0 To Crsr.RowCount - 1";
{
final int step7 = 1;
final int limit7 = (int) (_crsr.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=4980747;
 //BA.debugLineNum = 4980747;BA.debugLine="Crsr.Position = i";
_crsr.setPosition(_i);
RDebugUtils.currentLine=4980749;
 //BA.debugLineNum = 4980749;BA.debugLine="json = json & \",{'f_nombre':'\"& base64_Encode(Cr";
_json = _json+",{'f_nombre':'"+_base64_encode(_ba,_crsr.GetString("display_name"))+"','f_id':'"+_crsr.GetString("_id")+"','f_phone_list':"+_getphonesbyid(_ba,_crsr.GetString("_id"))+"}";
 }
};
RDebugUtils.currentLine=4980754;
 //BA.debugLineNum = 4980754;BA.debugLine="Crsr.Close";
_crsr.Close();
RDebugUtils.currentLine=4980756;
 //BA.debugLineNum = 4980756;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
_json = _json.replace("[,{","[{");
RDebugUtils.currentLine=4980757;
 //BA.debugLineNum = 4980757;BA.debugLine="json = json & \"]\"";
_json = _json+"]";
RDebugUtils.currentLine=4980759;
 //BA.debugLineNum = 4980759;BA.debugLine="json = json.Replace(\"'\",Chr(34))";
_json = _json.replace("'",BA.ObjectToString(anywheresoftware.b4a.keywords.Common.Chr((int) (34))));
RDebugUtils.currentLine=4980761;
 //BA.debugLineNum = 4980761;BA.debugLine="Log(json)";
anywheresoftware.b4a.keywords.Common.LogImpl("44980761",_json,0);
RDebugUtils.currentLine=4980762;
 //BA.debugLineNum = 4980762;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=4980763;
 //BA.debugLineNum = 4980763;BA.debugLine="End Sub";
return "";
}
public static String  _setdivider(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ListViewWrapper _lv,int _color,int _height) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "setdivider", false))
	 {return ((String) Debug.delegate(null, "setdivider", new Object[] {_ba,_lv,_color,_height}));}
anywheresoftware.b4a.agraham.reflection.Reflection _r = null;
anywheresoftware.b4a.objects.drawable.ColorDrawable _cd = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub SetDivider(lv As ListView, color As Int, Heigh";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim r As Reflector";
_r = new anywheresoftware.b4a.agraham.reflection.Reflection();
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="r.Target = lv";
_r.Target = (Object)(_lv.getObject());
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="Dim CD As ColorDrawable";
_cd = new anywheresoftware.b4a.objects.drawable.ColorDrawable();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="CD.Initialize(color, 0)";
_cd.Initialize(_color,(int) (0));
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="r.RunMethod4(\"setDivider\", Array As Object(CD),";
_r.RunMethod4("setDivider",new Object[]{(Object)(_cd.getObject())},new String[]{"android.graphics.drawable.Drawable"});
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="r.RunMethod2(\"setDividerHeight\", Height, \"java.la";
_r.RunMethod2("setDividerHeight",BA.NumberToString(_height),"java.lang.int");
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub getImagen(imagenB64 As String) As BitmapDrawab";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim imagen() As Byte";
_imagen = new byte[(int) (0)];
;
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
_imagen = _su.DecodeBase64(_imagenb64);
RDebugUtils.currentLine=4194308;
 //BA.debugLineNum = 4194308;BA.debugLine="Dim inp As InputStream";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
_inp.InitializeFromBytesArray(_imagen,(int) (0),_imagen.length);
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="bmp.Initialize2(inp)";
_bmp.Initialize2((java.io.InputStream)(_inp.getObject()));
RDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="Dim draw As BitmapDrawable";
_draw = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="draw.Initialize(bmp)";
_draw.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="Return draw";
if (true) return _draw;
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="If exentoImpuesto Then";
if (_exentoimpuesto) { 
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="tax = 0";
_tax = 0;
 };
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Dim precio_para_mostrar As Double = precio";
_precio_para_mostrar = _precio;
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="If (impuestoIncluido) Then";
if ((_impuestoincluido)) { 
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
_precio_para_mostrar = _precio/(double)((_tax/(double)100)+1);
 };
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
_descuento = _get_descuento(_ba,_precio_para_mostrar,_descuento);
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
_preciodescuento = _precio_para_mostrar-_descuento;
RDebugUtils.currentLine=3211279;
 //BA.debugLineNum = 3211279;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
_tax = _get_tax(_ba,_preciodescuento,_tax,_cantidad);
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
_total = _get_importe(_ba,_cantidad,_preciodescuento,_tax);
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3211283;
 //BA.debugLineNum = 3211283;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=3211284;
 //BA.debugLineNum = 3211284;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
_map.Put((Object)("f_precio_para_mostrar"),(Object)(_precio_para_mostrar));
RDebugUtils.currentLine=3211285;
 //BA.debugLineNum = 3211285;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
_map.Put((Object)("f_tax"),(Object)(_tax));
RDebugUtils.currentLine=3211286;
 //BA.debugLineNum = 3211286;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
_map.Put((Object)("f_descuento"),(Object)(_descuento));
RDebugUtils.currentLine=3211287;
 //BA.debugLineNum = 3211287;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
_map.Put((Object)("f_total"),(Object)(_total));
RDebugUtils.currentLine=3211290;
 //BA.debugLineNum = 3211290;BA.debugLine="Return map";
if (true) return _map;
RDebugUtils.currentLine=3211291;
 //BA.debugLineNum = 3211291;BA.debugLine="End Sub";
return null;
}
public static String  _a_la_derecha(anywheresoftware.b4a.BA _ba,String _caracter,String _parametro,int _limite) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "a_la_derecha", false))
	 {return ((String) Debug.delegate(null, "a_la_derecha", new Object[] {_ba,_caracter,_parametro,_limite}));}
String _a = "";
int _i = 0;
RDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub A_la_Derecha(caracter As String, parametro As";
RDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim a As String";
_a = "";
RDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
RDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="limite=48";
_limite = (int) (48);
 };
RDebugUtils.currentLine=4521990;
 //BA.debugLineNum = 4521990;BA.debugLine="For i=1 To (limite - parametro.Length)";
{
final int step5 = 1;
final int limit5 = (int) ((_limite-_parametro.length()));
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=4521991;
 //BA.debugLineNum = 4521991;BA.debugLine="a=a&caracter";
_a = _a+_caracter;
 }
};
RDebugUtils.currentLine=4521993;
 //BA.debugLineNum = 4521993;BA.debugLine="parametro=a&parametro";
_parametro = _a+_parametro;
RDebugUtils.currentLine=4521994;
 //BA.debugLineNum = 4521994;BA.debugLine="Return parametro";
if (true) return _parametro;
RDebugUtils.currentLine=4521995;
 //BA.debugLineNum = 4521995;BA.debugLine="End Sub";
return "";
}
public static String  _addlinea(anywheresoftware.b4a.BA _ba,String _parametro,int _cantidad) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "addlinea", false))
	 {return ((String) Debug.delegate(null, "addlinea", new Object[] {_ba,_parametro,_cantidad}));}
String _linea = "";
int _i = 0;
RDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub AddLinea(parametro As String,cantidad As Int)";
RDebugUtils.currentLine=4456449;
 //BA.debugLineNum = 4456449;BA.debugLine="Dim linea As String";
_linea = "";
RDebugUtils.currentLine=4456450;
 //BA.debugLineNum = 4456450;BA.debugLine="If cantidad =0 Then";
if (_cantidad==0) { 
RDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="cantidad=48";
_cantidad = (int) (48);
 };
RDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="For i=1 To cantidad";
{
final int step5 = 1;
final int limit5 = _cantidad;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
RDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="linea=linea & parametro";
_linea = _linea+_parametro;
 }
};
RDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="Return linea";
if (true) return _linea;
RDebugUtils.currentLine=4456460;
 //BA.debugLineNum = 4456460;BA.debugLine="End Sub";
return "";
}
public static String  _arrayimagetojson(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.collections.List _listimagen) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "arrayimagetojson", false))
	 {return ((String) Debug.delegate(null, "arrayimagetojson", new Object[] {_ba,_listimagen}));}
String _json = "";
int _i = 0;
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub ArrayImageToJson(listImagen As List) As String";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim json As String = \"[\"";
_json = "[";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="For i=0 To listImagen.Size -1";
{
final int step2 = 1;
final int limit2 = (int) (_listimagen.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="json = json & \",{'f_imagen':'\"&getByteImagen2(li";
_json = _json+",{'f_imagen':'"+_getbyteimagen2(_ba,(byte[])(_listimagen.Get(_i)))+"'}";
 }
};
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="json = json.Replace(\"[,{\",\"[{\")";
_json = _json.replace("[,{","[{");
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="json = json & \"]\"";
_json = _json+"]";
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="End Sub";
return "";
}
public static String  _getbyteimagen2(anywheresoftware.b4a.BA _ba,byte[] _data) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getbyteimagen2", false))
	 {return ((String) Debug.delegate(null, "getbyteimagen2", new Object[] {_ba,_data}));}
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub getByteImagen2(data() As Byte) As String";
RDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="Return su.EncodeBase64(data)";
if (true) return _su.EncodeBase64(_data);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="End Sub";
return "";
}
public static String  _base64_encode(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "base64_encode", false))
	 {return ((String) Debug.delegate(null, "base64_encode", new Object[] {_ba,_text}));}
anywheresoftware.b4a.agraham.encryption.Base64 _base64 = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub base64_Encode(text As String) As String";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim base64 As Base64";
_base64 = new anywheresoftware.b4a.agraham.encryption.Base64();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Return base64.EncodeStoS(text,\"UTF-8\")";
if (true) return _base64.EncodeStoS(_text,"UTF-8");
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub crear_preview(ScrollViewFotos As HorizontalScr";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="ScrollViewFotos.Panel.RemoveAllViews";
_scrollviewfotos.getPanel().RemoveAllViews();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Dim imagen() As Byte";
_imagen = new byte[(int) (0)];
;
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="Dim left As Int = 1%x";
_left = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),_ba);
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="For i=0 To listImagen.Size -1";
{
final int step4 = 1;
final int limit4 = (int) (_listimagen.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3538949;
 //BA.debugLineNum = 3538949;BA.debugLine="imagen = listImagen.Get(i)";
_imagen = (byte[])(_listimagen.Get(_i));
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="img.Initialize(\"View\")";
_img.Initialize(_ba,"View");
RDebugUtils.currentLine=3538952;
 //BA.debugLineNum = 3538952;BA.debugLine="img.Tag = i";
_img.setTag((Object)(_i));
RDebugUtils.currentLine=3538953;
 //BA.debugLineNum = 3538953;BA.debugLine="img.Background = getImagen2(imagen)";
_img.setBackground((android.graphics.drawable.Drawable)(_getimagen2(_ba,_imagen).getObject()));
RDebugUtils.currentLine=3538954;
 //BA.debugLineNum = 3538954;BA.debugLine="ScrollViewFotos.Panel.AddView(img,left,0%y,23%x,";
_scrollviewfotos.getPanel().AddView((android.view.View)(_img.getObject()),_left,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),_ba),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (23),_ba),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),_ba));
RDebugUtils.currentLine=3538955;
 //BA.debugLineNum = 3538955;BA.debugLine="left =left+25%x";
_left = (int) (_left+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (25),_ba));
 }
};
RDebugUtils.currentLine=3538957;
 //BA.debugLineNum = 3538957;BA.debugLine="ScrollViewFotos.Panel.Width = left";
_scrollviewfotos.getPanel().setWidth(_left);
RDebugUtils.currentLine=3538958;
 //BA.debugLineNum = 3538958;BA.debugLine="End Sub";
return "";
}
public static anywheresoftware.b4a.objects.drawable.BitmapDrawable  _getimagen2(anywheresoftware.b4a.BA _ba,byte[] _imagen) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getimagen2", false))
	 {return ((anywheresoftware.b4a.objects.drawable.BitmapDrawable) Debug.delegate(null, "getimagen2", new Object[] {_ba,_imagen}));}
anywheresoftware.b4a.objects.streams.File.InputStreamWrapper _inp = null;
anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmp = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _draw = null;
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub getImagen2(imagen() As Byte) As BitmapDrawable";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim inp As InputStream";
_inp = new anywheresoftware.b4a.objects.streams.File.InputStreamWrapper();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
_inp.InitializeFromBytesArray(_imagen,(int) (0),_imagen.length);
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="Dim bmp As Bitmap";
_bmp = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="bmp.Initialize2(inp)";
_bmp.Initialize2((java.io.InputStream)(_inp.getObject()));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Dim draw As BitmapDrawable";
_draw = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="draw.Initialize(bmp)";
_draw.Initialize((android.graphics.Bitmap)(_bmp.getObject()));
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Return draw";
if (true) return _draw;
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="End Sub";
return null;
}
public static double  _get_descuento(anywheresoftware.b4a.BA _ba,double _precio,double _descuento) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "get_descuento", false))
	 {return ((Double) Debug.delegate(null, "get_descuento", new Object[] {_ba,_precio,_descuento}));}
double _precio2 = 0;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim precio2 As Double";
_precio2 = 0;
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="precio2 = precio * (descuento / 100)";
_precio2 = _precio*(_descuento/(double)100);
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Return precio2";
if (true) return _precio2;
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="End Sub";
return 0;
}
public static double  _get_importe(anywheresoftware.b4a.BA _ba,double _cantidad,double _precio,double _tax) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "get_importe", false))
	 {return ((Double) Debug.delegate(null, "get_importe", new Object[] {_ba,_cantidad,_precio,_tax}));}
double _dato = 0;
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim dato As Double";
_dato = 0;
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="dato = ((precio * cantidad) + tax)";
_dato = ((_precio*_cantidad)+_tax);
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="Return  dato";
if (true) return _dato;
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="End Sub";
return 0;
}
public static double  _get_tax(anywheresoftware.b4a.BA _ba,double _precio,double _tax,double _cantidad) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "get_tax", false))
	 {return ((Double) Debug.delegate(null, "get_tax", new Object[] {_ba,_precio,_tax,_cantidad}));}
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
_tax = (_precio*(_tax/(double)100))*_cantidad;
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Return tax";
if (true) return _tax;
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="End Sub";
return 0;
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
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub getPhonesByID(id As String) As String";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="Dim cr As ContentResolver";
_cr = new anywheresoftware.b4a.objects.ContentResolverWrapper();
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Dim json As String = \"[\"";
_json = "[";
RDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Dim phonesUri As Uri";
_phonesuri = new anywheresoftware.b4a.objects.ContentResolverWrapper.UriWrapper();
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="phonesUri.Parse(\"content://com.android.contacts/d";
_phonesuri.Parse("content://com.android.contacts/data/phones");
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Dim phones As Cursor = cr.Query(phonesUri,  Array";
_phones = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
_phones = _cr.Query(_phonesuri,new String[]{"data1","data2"},"contact_id = ?",new String[]{_id},"");
RDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="For i = 0 To phones.RowCount - 1";
{
final int step6 = 1;
final int limit6 = (int) (_phones.getRowCount()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="phones.Position = i";
_phones.setPosition(_i);
RDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="json = json & \",{'f_phone_number':'\"&phones.GetS";
_json = _json+",{'f_phone_number':'"+_phones.GetString("data1")+"','f_type':'"+_phones.GetString("data2")+"'}";
 }
};
RDebugUtils.currentLine=5046283;
 //BA.debugLineNum = 5046283;BA.debugLine="phones.Close";
_phones.Close();
RDebugUtils.currentLine=5046285;
 //BA.debugLineNum = 5046285;BA.debugLine="json =  json.Replace(\"[,{\",\"[{\")";
_json = _json.replace("[,{","[{");
RDebugUtils.currentLine=5046286;
 //BA.debugLineNum = 5046286;BA.debugLine="json = json & \"]\"";
_json = _json+"]";
RDebugUtils.currentLine=5046288;
 //BA.debugLineNum = 5046288;BA.debugLine="Return json";
if (true) return _json;
RDebugUtils.currentLine=5046291;
 //BA.debugLineNum = 5046291;BA.debugLine="End Sub";
return "";
}
public static String  _getbyteimagen(anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _bmap) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getbyteimagen", false))
	 {return ((String) Debug.delegate(null, "getbyteimagen", new Object[] {_ba,_bmap}));}
anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper _out = null;
byte[] _data = null;
anywheresoftware.b4a.objects.StringUtils _su = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As String";
RDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Dim out As OutputStream";
_out = new anywheresoftware.b4a.objects.streams.File.OutputStreamWrapper();
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim data() As Byte";
_data = new byte[(int) (0)];
;
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="out.InitializeToBytesArray(1)";
_out.InitializeToBytesArray((int) (1));
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
_bmap.WriteToStream((java.io.OutputStream)(_out.getObject()),(int) (100),BA.getEnumFromString(android.graphics.Bitmap.CompressFormat.class,"PNG"));
RDebugUtils.currentLine=4325381;
 //BA.debugLineNum = 4325381;BA.debugLine="data = out.ToBytesArray";
_data = _out.ToBytesArray();
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="out.Close";
_out.Close();
RDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="out.Flush";
_out.Flush();
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="Dim su As StringUtils";
_su = new anywheresoftware.b4a.objects.StringUtils();
RDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="Return su.EncodeBase64(data)";
if (true) return _su.EncodeBase64(_data);
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="End Sub";
return "";
}
public static String  _getday(anywheresoftware.b4a.BA _ba,int _day) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getday", false))
	 {return ((String) Debug.delegate(null, "getday", new Object[] {_ba,_day}));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub getDay(day As Int) As String";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Select day";
switch (_day) {
case 0: {
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="Return \"Sunday\"";
if (true) return "Sunday";
 break; }
case 1: {
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="Return \"Monday\"";
if (true) return "Monday";
 break; }
case 2: {
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="Return \"Tuesday\"";
if (true) return "Tuesday";
 break; }
case 3: {
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="Return \"Wednesday\"";
if (true) return "Wednesday";
 break; }
case 4: {
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="Return \"Thursday\"";
if (true) return "Thursday";
 break; }
case 5: {
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="Return \"Friday\"";
if (true) return "Friday";
 break; }
case 6: {
RDebugUtils.currentLine=3735568;
 //BA.debugLineNum = 3735568;BA.debugLine="Return \"Saturday\"";
if (true) return "Saturday";
 break; }
}
;
RDebugUtils.currentLine=3735570;
 //BA.debugLineNum = 3735570;BA.debugLine="End Sub";
return "";
}
public static String  _getdecimal(anywheresoftware.b4a.BA _ba,double _n) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getdecimal", false))
	 {return ((String) Debug.delegate(null, "getdecimal", new Object[] {_ba,_n}));}
String _numero = "";
String _punto = "";
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub getDecimal(n As Double) As String";
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="If IsNumber(n) = False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(BA.NumberToString(_n))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Return n";
if (true) return BA.NumberToString(_n);
 };
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Dim numero, punto As String";
_numero = "";
_punto = "";
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="numero=Round2(n,0)";
_numero = BA.NumberToString(anywheresoftware.b4a.keywords.Common.Round2(_n,(int) (0)));
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="If numero>n Then";
if ((double)(Double.parseDouble(_numero))>_n) { 
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="numero=numero-1";
_numero = BA.NumberToString((double)(Double.parseDouble(_numero))-1);
 };
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="If (n-numero) > 0 Then";
if ((_n-(double)(Double.parseDouble(_numero)))>0) { 
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="punto = n";
_punto = BA.NumberToString(_n);
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="If punto.SubString(punto.IndexOf(\".\")+1).Length<";
if (_punto.substring((int) (_punto.indexOf(".")+1)).length()<=1) { 
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="punto= punto&\"0\"";
_punto = _punto+"0";
 };
RDebugUtils.currentLine=3604498;
 //BA.debugLineNum = 3604498;BA.debugLine="Return punto";
if (true) return _punto;
 }else {
RDebugUtils.currentLine=3604500;
 //BA.debugLineNum = 3604500;BA.debugLine="Return numero&\".00\"";
if (true) return _numero+".00";
 };
RDebugUtils.currentLine=3604502;
 //BA.debugLineNum = 3604502;BA.debugLine="End Sub";
return "";
}
public static double  _getdiferenciacantidad(anywheresoftware.b4a.BA _ba,double _cantidadactual,double _cantidadnueva) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getdiferenciacantidad", false))
	 {return ((Double) Debug.delegate(null, "getdiferenciacantidad", new Object[] {_ba,_cantidadactual,_cantidadnueva}));}
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
if (_cantidadnueva>_cantidadactual && _cantidadactual<0) { 
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 }else {
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="If cantidadActual > 0 Then";
if (_cantidadactual>0) { 
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 };
 };
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Return cantidadActual";
if (true) return _cantidadactual;
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="End Sub";
return 0;
}
public static com.menube.app.slidemenu  _getslidemenu(anywheresoftware.b4a.BA _ba,com.menube.app.slidemenu _sm,int _option) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "getslidemenu", false))
	 {return ((com.menube.app.slidemenu) Debug.delegate(null, "getslidemenu", new Object[] {_ba,_sm,_option}));}
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub getSlideMenu(sm As SlideMenu, option As Int) A";
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="End Sub";
return null;
}
public static String  _remplace(anywheresoftware.b4a.BA _ba,String _text) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "remplace", false))
	 {return ((String) Debug.delegate(null, "remplace", new Object[] {_ba,_text}));}
RDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub remplace(text As String ) As String";
RDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="text=text.Replace(\"'\",\"´´\")";
_text = _text.replace("'","´´");
RDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Return text";
if (true) return _text;
RDebugUtils.currentLine=4718596;
 //BA.debugLineNum = 4718596;BA.debugLine="End Sub";
return "";
}
public static String  _slidemenu_click(anywheresoftware.b4a.BA _ba,Object _item,anywheresoftware.b4a.objects.ActivityWrapper _act) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "slidemenu_click", false))
	 {return ((String) Debug.delegate(null, "slidemenu_click", new Object[] {_ba,_item,_act}));}
int _r = 0;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub SlideMenu_Click(Item As Object, Act As Activit";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="If Item <> -1 Then";
if ((_item).equals((Object)(-1)) == false) { 
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Act.Finish";
_act.Finish();
 };
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Select Item";
switch (BA.switchObjectToInt(_item,(Object)(-1))) {
case 0: {
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="r = Msgbox2(\"Seguro que desea salir de la aplic";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea salir de la aplicación?"),BA.ObjectToCharSequence(""),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),_ba);
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="Act.Finish";
_act.Finish();
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity((_ba.processBA == null ? _ba : _ba.processBA),(Object)(mostCurrent._main.getObject()));
 };
 break; }
}
;
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub titulo(parametro As String,limite As Int) As S";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = "";
RDebugUtils.currentLine=4653057;
 //BA.debugLineNum = 4653057;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = " ";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim totals As String : totals=\"\"";
_totals = "";
RDebugUtils.currentLine=4653058;
 //BA.debugLineNum = 4653058;BA.debugLine="Dim totals As String : totals=\"\"";
_totals = "";
RDebugUtils.currentLine=4653059;
 //BA.debugLineNum = 4653059;BA.debugLine="Dim cal As Double";
_cal = 0;
RDebugUtils.currentLine=4653060;
 //BA.debugLineNum = 4653060;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
RDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="limite=48";
_limite = (int) (48);
 };
RDebugUtils.currentLine=4653064;
 //BA.debugLineNum = 4653064;BA.debugLine="If parametro.Length<limite Then";
if (_parametro.length()<_limite) { 
RDebugUtils.currentLine=4653065;
 //BA.debugLineNum = 4653065;BA.debugLine="cal=limite-parametro.Length";
_cal = _limite-_parametro.length();
RDebugUtils.currentLine=4653066;
 //BA.debugLineNum = 4653066;BA.debugLine="cal= cal/2";
_cal = _cal/(double)2;
RDebugUtils.currentLine=4653068;
 //BA.debugLineNum = 4653068;BA.debugLine="For i=1 To Round(cal)";
{
final int step12 = 1;
final int limit12 = (int) (anywheresoftware.b4a.keywords.Common.Round(_cal));
_i = (int) (1) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=4653069;
 //BA.debugLineNum = 4653069;BA.debugLine="totals=espacio& totals";
_totals = _espacio+_totals;
 }
};
RDebugUtils.currentLine=4653071;
 //BA.debugLineNum = 4653071;BA.debugLine="parametro=totals&parametro";
_parametro = _totals+_parametro;
RDebugUtils.currentLine=4653072;
 //BA.debugLineNum = 4653072;BA.debugLine="Return parametro";
if (true) return _parametro;
 }else {
RDebugUtils.currentLine=4653074;
 //BA.debugLineNum = 4653074;BA.debugLine="Return parametro";
if (true) return _parametro;
 };
RDebugUtils.currentLine=4653077;
 //BA.debugLineNum = 4653077;BA.debugLine="End Sub";
return "";
}
public static String  _v(anywheresoftware.b4a.BA _ba,String _parametro,int _limite) throws Exception{
RDebugUtils.currentModule="funcion";
if (Debug.shouldDelegate(null, "v", false))
	 {return ((String) Debug.delegate(null, "v", new Object[] {_ba,_parametro,_limite}));}
String _espacio = "";
int _i = 0;
RDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub V (parametro As String,limite As Int) As Strin";
RDebugUtils.currentLine=4587521;
 //BA.debugLineNum = 4587521;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
RDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="limite=47";
_limite = (int) (47);
 };
RDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="If parametro.Length>limite Then";
if (_parametro.length()>_limite) { 
RDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="parametro=parametro.SubString2(0,limite-2)&\"..\"";
_parametro = _parametro.substring((int) (0),(int) (_limite-2))+"..";
RDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="Return parametro";
if (true) return _parametro;
 }else 
{RDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="Else if parametro.Length<limite Then";
if (_parametro.length()<_limite) { 
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = "";
RDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = " ";
RDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="For i=1 To (limite-parametro.Length)";
{
final int step10 = 1;
final int limit10 = (int) ((_limite-_parametro.length()));
_i = (int) (1) ;
for (;_i <= limit10 ;_i = _i + step10 ) {
RDebugUtils.currentLine=4587533;
 //BA.debugLineNum = 4587533;BA.debugLine="parametro=parametro&espacio";
_parametro = _parametro+_espacio;
 }
};
RDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="Return parametro";
if (true) return _parametro;
 }}
;
RDebugUtils.currentLine=4587538;
 //BA.debugLineNum = 4587538;BA.debugLine="End Sub";
return "";
}
}