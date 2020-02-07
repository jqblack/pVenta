package com.jq;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class b4i_categoria_subs_0 {


public static RemoteObject  _btnaddproducto_click() throws Exception{
try {
		Debug.PushSubsStack("btnAddProducto_Click (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,448);
if (RapidSub.canDelegate("btnaddproducto_click")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","btnaddproducto_click");}
RemoteObject _b = RemoteObject.declareNull("B4IButtonWrapper");
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
 BA.debugLineNum = 448;BA.debugLine="Sub btnAddProducto_Click";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 449;BA.debugLine="Dim b As Button";
Debug.ShouldStop(1);
_b = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 450;BA.debugLine="b.Initialize(\"b\",b.STYLE_CONTACT_ADD)";
Debug.ShouldStop(2);
_b.runVoidMethod ("Initialize:::",(Object)(BA.ObjectToString("b")),b4i_categoria.ba,(Object)(_b.runMethod(false,"STYLE_CONTACT_ADD")));
 BA.debugLineNum = 451;BA.debugLine="b = Sender";
Debug.ShouldStop(4);
_b.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_categoria.ba));
 BA.debugLineNum = 453;BA.debugLine="Dim mapa As Map  = b.Tag";
Debug.ShouldStop(16);
_mapa = (_b.runMethod(false,"Tag"));Debug.locals.put("mapa", _mapa);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 455;BA.debugLine="If mapa.Get(\"f_precio\") <= 0 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("k",BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 457;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
Debug.ShouldStop(256);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este")),(Object)(RemoteObject.createImmutable("Aviso")));
 }else {
 BA.debugLineNum = 461;BA.debugLine="salvar_detalle_temporal(mapa,1)";
Debug.ShouldStop(4096);
_salvar_detalle_temporal(_mapa,BA.numberCast(int.class, 1));
 };
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnagregarcarritodetalle_click() throws Exception{
try {
		Debug.PushSubsStack("btnagregarCarritoDetalle_Click (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,470);
if (RapidSub.canDelegate("btnagregarcarritodetalle_click")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","btnagregarcarritodetalle_click");}
 BA.debugLineNum = 470;BA.debugLine="Sub btnagregarCarritoDetalle_Click";
Debug.ShouldStop(2097152);
 BA.debugLineNum = 471;BA.debugLine="salvar_detalle_temporal(mapaDetalle,lblcantidad.T";
Debug.ShouldStop(4194304);
_salvar_detalle_temporal(b4i_categoria._mapadetalle,BA.numberCast(int.class, b4i_categoria._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 472;BA.debugLine="btnBackDetalles_Click";
Debug.ShouldStop(8388608);
_btnbackdetalles_click();
 BA.debugLineNum = 473;BA.debugLine="End Sub";
Debug.ShouldStop(16777216);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackcat_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackCat_Click (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,209);
if (RapidSub.canDelegate("btnbackcat_click")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","btnbackcat_click");}
 BA.debugLineNum = 209;BA.debugLine="Sub btnBackCat_Click";
Debug.ShouldStop(65536);
 BA.debugLineNum = 211;BA.debugLine="If actualizar Then";
Debug.ShouldStop(262144);
if (b4i_categoria._actualizar.getBoolean()) { 
 BA.debugLineNum = 212;BA.debugLine="Main.actualizarCantidad";
Debug.ShouldStop(524288);
b4i_categoria._main.runVoidMethod ("_actualizarcantidad" /*RemoteObject*/ );
 BA.debugLineNum = 213;BA.debugLine="actualizar = False";
Debug.ShouldStop(1048576);
b4i_categoria._actualizar = b4i_main.__c.runMethod(true,"False");
 };
 BA.debugLineNum = 216;BA.debugLine="Main.smc.Tag = \"inicio\"";
Debug.ShouldStop(8388608);
b4i_categoria._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("inicio")));
 BA.debugLineNum = 217;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(16777216);
b4i_categoria._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.ShouldStop(67108864);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _btnbackdetalles_click() throws Exception{
try {
		Debug.PushSubsStack("btnBackDetalles_Click (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,466);
if (RapidSub.canDelegate("btnbackdetalles_click")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","btnbackdetalles_click");}
 BA.debugLineNum = 466;BA.debugLine="Sub btnBackDetalles_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 467;BA.debugLine="Main.NavControl.RemoveCurrentPage";
Debug.ShouldStop(262144);
b4i_categoria._main._navcontrol /*RemoteObject*/ .runVoidMethod ("RemoveCurrentPage");
 BA.debugLineNum = 468;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("btnbackprobycat_Click (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,274);
if (RapidSub.canDelegate("btnbackprobycat_click")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","btnbackprobycat_click");}
 BA.debugLineNum = 274;BA.debugLine="Sub btnbackprobycat_Click";
Debug.ShouldStop(131072);
 BA.debugLineNum = 276;BA.debugLine="Main.NavControl.ShowPage2(pageCat,True)";
Debug.ShouldStop(524288);
b4i_categoria._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_categoria._pagecat).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.ShouldStop(2097152);
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
		Debug.PushSubsStack("ClearScrollView (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,268);
if (RapidSub.canDelegate("clearscrollview")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","clearscrollview", _sv);}
int _i = 0;
Debug.locals.put("sv", _sv);
 BA.debugLineNum = 268;BA.debugLine="Sub ClearScrollView(sv As ScrollView)";
Debug.ShouldStop(2048);
 BA.debugLineNum = 269;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
Debug.ShouldStop(4096);
{
final int step1 = -1;
final int limit1 = 0;
_i = RemoteObject.solve(new RemoteObject[] {_sv.runMethod(false,"Panel").runMethod(true,"NumberOfViews"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue() ;
for (;(step1 > 0 && _i <= limit1) || (step1 < 0 && _i >= limit1) ;_i = ((int)(0 + _i + step1))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 270;BA.debugLine="sv.Panel.GetView(i).RemoveViewFromParent";
Debug.ShouldStop(8192);
_sv.runMethod(false,"Panel").runMethod(false,"GetView:",(Object)(BA.numberCast(int.class, _i))).runVoidMethod ("RemoveViewFromParent");
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.ShouldStop(32768);
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
		Debug.PushSubsStack("CreateListItem (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,198);
if (RapidSub.canDelegate("createlistitem")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","createlistitem", _nombre, _cantidad, _img, _width, _height);}
RemoteObject _p = RemoteObject.declareNull("B4IPanelWrapper");
Debug.locals.put("Nombre", _nombre);
Debug.locals.put("cantidad", _cantidad);
Debug.locals.put("img", _img);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 198;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As I";
Debug.ShouldStop(32);
 BA.debugLineNum = 199;BA.debugLine="Dim p As Panel";
Debug.ShouldStop(64);
_p = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("p", _p);
 BA.debugLineNum = 200;BA.debugLine="p.Initialize(\"\")";
Debug.ShouldStop(128);
_p.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 201;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
Debug.ShouldStop(256);
_p.runVoidMethod ("SetLayoutAnimated::::::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(float.class, 1)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, 0)),(Object)(BA.numberCast(float.class, _width)),(Object)(BA.numberCast(float.class, _height)));
 BA.debugLineNum = 202;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
Debug.ShouldStop(512);
_p.runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmPanelesItems")),b4i_categoria.ba);
 BA.debugLineNum = 203;BA.debugLine="lblNomCat.Text = Nombre";
Debug.ShouldStop(1024);
b4i_categoria._lblnomcat.runMethod(true,"setText:",_nombre);
 BA.debugLineNum = 204;BA.debugLine="lblCantCat.Text = \"Cantidad de Productos: \"&canti";
Debug.ShouldStop(2048);
b4i_categoria._lblcantcat.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("Cantidad de Productos: "),_cantidad));
 BA.debugLineNum = 205;BA.debugLine="imgCat.Bitmap = img";
Debug.ShouldStop(4096);
b4i_categoria._imgcat.runMethod(false,"setBitmap:",_img);
 BA.debugLineNum = 206;BA.debugLine="Return p";
Debug.ShouldStop(8192);
if (true) return _p;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.ShouldStop(16384);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createpanelproductoscroll(RemoteObject _mapapanel1,RemoteObject _imagen) throws Exception{
try {
		Debug.PushSubsStack("createPanelProductoScroll (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,283);
if (RapidSub.canDelegate("createpanelproductoscroll")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","createpanelproductoscroll", _mapapanel1, _imagen);}
RemoteObject _panelfondopro = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _panelimagen = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _heigimg = RemoteObject.createImmutable(0);
RemoteObject _lef = RemoteObject.createImmutable(0);
RemoteObject _tnom = RemoteObject.createImmutable(0);
RemoteObject _hnom = RemoteObject.createImmutable(0);
RemoteObject _tpre = RemoteObject.createImmutable(0);
RemoteObject _hpre = RemoteObject.createImmutable(0);
RemoteObject _imagenpro = RemoteObject.declareNull("B4IImageViewWrapper");
RemoteObject _lbltitulopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _lblpreciopro = RemoteObject.declareNull("B4ILabelWrapper");
RemoteObject _btnaddpro = RemoteObject.declareNull("B4IButtonWrapper");
Debug.locals.put("mapaPanel1", _mapapanel1);
Debug.locals.put("imagen", _imagen);
 BA.debugLineNum = 283;BA.debugLine="Sub createPanelProductoScroll(mapaPanel1 As Map, i";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 286;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
Debug.ShouldStop(536870912);
_panelfondopro = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelFondoPro", _panelfondopro);
_panelimagen = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("PanelImagen", _panelimagen);
 BA.debugLineNum = 287;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
Debug.ShouldStop(1073741824);
_panelfondopro.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("PanelFondoPro")));
 BA.debugLineNum = 289;BA.debugLine="PanelFondoPro.Width = ScrollViewProByCat.Width *";
Debug.ShouldStop(1);
_panelfondopro.runMethod(true,"setWidth:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Width"),RemoteObject.createImmutable(0.47)}, "*",0, 0)));
 BA.debugLineNum = 290;BA.debugLine="PanelFondoPro.Height = ScrollViewProByCat.Height";
Debug.ShouldStop(2);
_panelfondopro.runMethod(true,"setHeight:",BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0)));
 BA.debugLineNum = 292;BA.debugLine="Dim heigImg As Int = PanelFondoPro.Height * 0.50";
Debug.ShouldStop(8);
_heigimg = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.50)}, "*",0, 0));Debug.locals.put("heigImg", _heigimg);Debug.locals.put("heigImg", _heigimg);
 BA.debugLineNum = 293;BA.debugLine="Dim lef As Int = ScrollViewProByCat.Width * 0.02";
Debug.ShouldStop(16);
_lef = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Width"),RemoteObject.createImmutable(0.02)}, "*",0, 0));Debug.locals.put("lef", _lef);Debug.locals.put("lef", _lef);
 BA.debugLineNum = 296;BA.debugLine="Dim Tnom As Int =   PanelFondoPro.Height * 0.39";
Debug.ShouldStop(128);
_tnom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.39)}, "*",0, 0));Debug.locals.put("Tnom", _tnom);Debug.locals.put("Tnom", _tnom);
 BA.debugLineNum = 297;BA.debugLine="Dim Hnom As Int =   PanelFondoPro.Height * 0.42";
Debug.ShouldStop(256);
_hnom = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.42)}, "*",0, 0));Debug.locals.put("Hnom", _hnom);Debug.locals.put("Hnom", _hnom);
 BA.debugLineNum = 299;BA.debugLine="Dim tPre As Int = PanelFondoPro.Height * 0.51";
Debug.ShouldStop(1024);
_tpre = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.51)}, "*",0, 0));Debug.locals.put("tPre", _tpre);Debug.locals.put("tPre", _tpre);
 BA.debugLineNum = 300;BA.debugLine="Dim hPre As Int  = PanelFondoPro.Height * 0.40";
Debug.ShouldStop(2048);
_hpre = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.40)}, "*",0, 0));Debug.locals.put("hPre", _hpre);Debug.locals.put("hPre", _hpre);
 BA.debugLineNum = 303;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
Debug.ShouldStop(16384);
_panelfondopro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 305;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(65536);
_panelfondopro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 307;BA.debugLine="PanelImagen.Initialize(\"\")";
Debug.ShouldStop(262144);
_panelimagen.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 309;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
Debug.ShouldStop(1048576);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 311;BA.debugLine="Dim imagenPro As ImageView";
Debug.ShouldStop(4194304);
_imagenpro = RemoteObject.createNew ("B4IImageViewWrapper");Debug.locals.put("imagenPro", _imagenpro);
 BA.debugLineNum = 312;BA.debugLine="imagenPro.Initialize(\"\")";
Debug.ShouldStop(8388608);
_imagenpro.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 314;BA.debugLine="imagenPro.Bitmap = imagen";
Debug.ShouldStop(33554432);
_imagenpro.runMethod(false,"setBitmap:",_imagen);
 BA.debugLineNum = 316;BA.debugLine="mapaPanel1.Put(\"f_foto\",imagen)";
Debug.ShouldStop(134217728);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_foto"))),(Object)(((_imagen).getObject())));
 BA.debugLineNum = 318;BA.debugLine="mapaPanel1.Put(\"f_destacado\",False)";
Debug.ShouldStop(536870912);
_mapapanel1.runVoidMethod ("Put::",(Object)(RemoteObject.createImmutable(("f_destacado"))),(Object)((b4i_main.__c.runMethod(true,"False"))));
 BA.debugLineNum = 321;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,T";
Debug.ShouldStop(1);
_panelimagen.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.1)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 323;BA.debugLine="PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondo";
Debug.ShouldStop(4);
_panelimagen.runVoidMethod ("AddView:::::",(Object)(((_imagenpro).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _heigimg)));
 BA.debugLineNum = 325;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelF";
Debug.ShouldStop(16);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_panelimagen).getObject())),(Object)(b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 0)))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(_panelfondopro.runMethod(true,"Width")),(Object)(BA.numberCast(float.class, _heigimg)));
 BA.debugLineNum = 327;BA.debugLine="Dim lblTituloPro As Label";
Debug.ShouldStop(64);
_lbltitulopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblTituloPro", _lbltitulopro);
 BA.debugLineNum = 328;BA.debugLine="lblTituloPro.Initialize(\"\")";
Debug.ShouldStop(128);
_lbltitulopro.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 329;BA.debugLine="lblTituloPro.Text = mapaPanel1.Get(\"f_descripcion";
Debug.ShouldStop(256);
_lbltitulopro.runMethod(true,"setText:",BA.ObjectToString(_mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 330;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
Debug.ShouldStop(512);
_lbltitulopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97)),(Object)(BA.numberCast(int.class, 97))));
 BA.debugLineNum = 331;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(1024);
_lbltitulopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 334;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,lef,Tnom,Panel";
Debug.ShouldStop(8192);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lbltitulopro).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, _tnom)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, _hnom)));
 BA.debugLineNum = 336;BA.debugLine="Dim lblPrecioPro As Label";
Debug.ShouldStop(32768);
_lblpreciopro = RemoteObject.createNew ("B4ILabelWrapper");Debug.locals.put("lblPrecioPro", _lblpreciopro);
 BA.debugLineNum = 337;BA.debugLine="lblPrecioPro.Initialize(\"\")";
Debug.ShouldStop(65536);
_lblpreciopro.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 338;BA.debugLine="lblPrecioPro.Text = NumberFormat(mapaPanel1.Get(\"";
Debug.ShouldStop(131072);
_lblpreciopro.runMethod(true,"setText:",b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapapanel1.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2))));
 BA.debugLineNum = 339;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
Debug.ShouldStop(262144);
_lblpreciopro.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$ "),_lblpreciopro.runMethod(true,"Text")));
 BA.debugLineNum = 340;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
Debug.ShouldStop(524288);
_lblpreciopro.runMethod(true,"setTextColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 76)),(Object)(BA.numberCast(int.class, 175)),(Object)(BA.numberCast(int.class, 80))));
 BA.debugLineNum = 341;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
Debug.ShouldStop(1048576);
_lblpreciopro.runMethod(false,"setFont:",b4i_main.__c.runMethod(false,"Font").runMethod(false,"CreateNew:",(Object)(BA.numberCast(float.class, 15))));
 BA.debugLineNum = 343;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,lef,tPre,Panel";
Debug.ShouldStop(4194304);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_lblpreciopro).getObject())),(Object)(BA.numberCast(float.class, _lef)),(Object)(BA.numberCast(float.class, _tpre)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),RemoteObject.createImmutable(0.50)}, "*",0, 0))),(Object)(BA.numberCast(float.class, _hpre)));
 BA.debugLineNum = 345;BA.debugLine="Dim btnAddPro As Button";
Debug.ShouldStop(16777216);
_btnaddpro = RemoteObject.createNew ("B4IButtonWrapper");Debug.locals.put("btnAddPro", _btnaddpro);
 BA.debugLineNum = 346;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
Debug.ShouldStop(33554432);
_btnaddpro.runVoidMethod ("InitializeCustom::::",(Object)(BA.ObjectToString("btnAddProducto")),b4i_categoria.ba,(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 244)),(Object)(BA.numberCast(int.class, 67)),(Object)(BA.numberCast(int.class, 54)))),(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)))));
 BA.debugLineNum = 347;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
Debug.ShouldStop(67108864);
_btnaddpro.runMethod(true,"setColor:",b4i_main.__c.runMethod(false,"Colors").runMethod(true,"RGB:::",(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255)),(Object)(BA.numberCast(int.class, 255))));
 BA.debugLineNum = 348;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
Debug.ShouldStop(134217728);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.2)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 349;BA.debugLine="btnAddPro.Tag = mapaPanel1";
Debug.ShouldStop(268435456);
_btnaddpro.runMethod(false,"setTag:",(_mapapanel1));
 BA.debugLineNum = 350;BA.debugLine="btnAddPro.Text = \"Agregar\"";
Debug.ShouldStop(536870912);
_btnaddpro.runMethod(true,"setText:",BA.ObjectToString("Agregar"));
 BA.debugLineNum = 352;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
Debug.ShouldStop(-2147483648);
_btnaddpro.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 354;BA.debugLine="PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Wid";
Debug.ShouldStop(2);
_panelfondopro.runVoidMethod ("AddView:::::",(Object)(((_btnaddpro).getObject())),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),RemoteObject.createImmutable(0.02)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.80)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Width"),b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 4)))}, "-",1, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {_panelfondopro.runMethod(true,"Height"),RemoteObject.createImmutable(0.14)}, "*",0, 0))));
 BA.debugLineNum = 356;BA.debugLine="PanelFondoPro.Tag = mapaPanel1";
Debug.ShouldStop(8);
_panelfondopro.runMethod(false,"setTag:",(_mapapanel1));
 BA.debugLineNum = 357;BA.debugLine="btnAddPro.Tag = mapaPanel1";
Debug.ShouldStop(16);
_btnaddpro.runMethod(false,"setTag:",(_mapapanel1));
 BA.debugLineNum = 359;BA.debugLine="Return PanelFondoPro";
Debug.ShouldStop(64);
if (true) return _panelfondopro;
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.ShouldStop(256);
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _customlistviewcategoria_itemclick(RemoteObject _index,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CustomListViewCategoria_ItemClick (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,230);
if (RapidSub.canDelegate("customlistviewcategoria_itemclick")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","customlistviewcategoria_itemclick", _index, _value);}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobbusqueda = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("Index", _index);
Debug.locals.put("Value", _value);
 BA.debugLineNum = 230;BA.debugLine="Sub CustomListViewCategoria_ItemClick (Index As In";
Debug.ShouldStop(32);
 BA.debugLineNum = 232;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(128);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 233;BA.debugLine="mapa = Value";
Debug.ShouldStop(256);
_mapa = (_value);Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 235;BA.debugLine="If mapa.Get(\"f_cantidad\") > 0 Then";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad"))))),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 237;BA.debugLine="Dim json As String";
Debug.ShouldStop(4096);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 238;BA.debugLine="json = \"'f_idcategoria':\"&mapa.Get(\"idcategoria\"";
Debug.ShouldStop(8192);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_idcategoria':"),_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("idcategoria")))));Debug.locals.put("json", _json);
 BA.debugLineNum = 240;BA.debugLine="Dim jobBusqueda As HttpJob";
Debug.ShouldStop(32768);
_jobbusqueda = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("jobBusqueda", _jobbusqueda);
 BA.debugLineNum = 241;BA.debugLine="jobBusqueda.Initialize(\"ProductosByCategoria\",Me";
Debug.ShouldStop(65536);
_jobbusqueda.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_categoria.ba,(Object)(BA.ObjectToString("ProductosByCategoria")),(Object)(b4i_categoria.getObject()));
 BA.debugLineNum = 245;BA.debugLine="If PanelFondoProductosbycategorias.IsInitialized";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("=",b4i_categoria._panelfondoproductosbycategorias.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 247;BA.debugLine="pageProByCat.Initialize(\"pageProByCat\")";
Debug.ShouldStop(4194304);
b4i_categoria._pageprobycat.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("pageProByCat")));
 BA.debugLineNum = 248;BA.debugLine="pageProByCat.RootPanel.LoadLayout(\"frmProductoB";
Debug.ShouldStop(8388608);
b4i_categoria._pageprobycat.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmProductoByCategoria")),b4i_categoria.ba);
 };
 BA.debugLineNum = 253;BA.debugLine="Label1.Text = mapa.Get(\"f_nombre\")";
Debug.ShouldStop(268435456);
b4i_categoria._label1.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))));
 BA.debugLineNum = 254;BA.debugLine="Label2.Text = \"Cantidad de productos: \"&mapa.Get";
Debug.ShouldStop(536870912);
b4i_categoria._label2.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("Cantidad de productos: "),_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad"))))));
 BA.debugLineNum = 256;BA.debugLine="ClearScrollView(ScrollViewProByCat)";
Debug.ShouldStop(-2147483648);
_clearscrollview(b4i_categoria._scrollviewprobycat);
 BA.debugLineNum = 258;BA.debugLine="jobBusqueda.PostString(Main.url&\"/puntoventa/pro";
Debug.ShouldStop(2);
_jobbusqueda.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_categoria._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("/puntoventa/productosbycat"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_categoria._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_categoria._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 }else {
 BA.debugLineNum = 261;BA.debugLine="Msgbox(\"La categoria \"&mapa.Get(\"f_nombre\")&\" no";
Debug.ShouldStop(16);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("La categoria "),_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre")))),RemoteObject.createImmutable(" no tiene Productos!!"))),(Object)(RemoteObject.createImmutable("Ups..")));
 };
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.ShouldStop(512);
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
		Debug.PushSubsStack("Initialize (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,44);
if (RapidSub.canDelegate("initialize")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","initialize");}
RemoteObject _jobcategoria = RemoteObject.declareNull("b4i_httpjob");
 BA.debugLineNum = 44;BA.debugLine="Sub Initialize";
Debug.ShouldStop(2048);
 BA.debugLineNum = 46;BA.debugLine="pageCat.Initialize(\"PageCategoria\")";
Debug.ShouldStop(8192);
b4i_categoria._pagecat.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("PageCategoria")));
 BA.debugLineNum = 48;BA.debugLine="pageCat.RootPanel.LoadLayout(\"frmCategoria\")";
Debug.ShouldStop(32768);
b4i_categoria._pagecat.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmCategoria")),b4i_categoria.ba);
 BA.debugLineNum = 50;BA.debugLine="listaCat.Initialize(\"lista\",False)";
Debug.ShouldStop(131072);
b4i_categoria._listacat.runVoidMethod ("Initialize:::",b4i_categoria.ba,(Object)(BA.ObjectToString("lista")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 53;BA.debugLine="Main.NavControl.ShowPage2(pageCat,True)";
Debug.ShouldStop(1048576);
b4i_categoria._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_categoria._pagecat).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 55;BA.debugLine="Dim jobCategoria As HttpJob";
Debug.ShouldStop(4194304);
_jobcategoria = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("jobCategoria", _jobcategoria);
 BA.debugLineNum = 56;BA.debugLine="jobCategoria.Initialize(\"jobCategorias\",Me)";
Debug.ShouldStop(8388608);
_jobcategoria.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_categoria.ba,(Object)(BA.ObjectToString("jobCategorias")),(Object)(b4i_categoria.getObject()));
 BA.debugLineNum = 57;BA.debugLine="jobCategoria.PostString(Main.url&\"/puntoventa/sea";
Debug.ShouldStop(16777216);
_jobcategoria.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_categoria._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("/puntoventa/searchcategorias"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_categoria._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_categoria._main._tokenpublico /*RemoteObject*/ ),(Object)(RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 59;BA.debugLine="hud.ProgressDialogShow(\"Cargando lista de Favorit";
Debug.ShouldStop(67108864);
b4i_categoria._hud.runVoidMethod ("ProgressDialogShow:",(Object)(RemoteObject.createImmutable("Cargando lista de Favoritos")));
 BA.debugLineNum = 61;BA.debugLine="Main.smc.Tag = \"categoria\"";
Debug.ShouldStop(268435456);
b4i_categoria._main._smc /*RemoteObject*/ .runMethod(false,"setTag:",RemoteObject.createImmutable(("categoria")));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.ShouldStop(1073741824);
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
		Debug.PushSubsStack("JobDone (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,65);
if (RapidSub.canDelegate("jobdone")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","jobdone", _job);}
RemoteObject _map = RemoteObject.declareNull("B4IMap");
RemoteObject _list = RemoteObject.declareNull("B4IList");
RemoteObject _json2 = RemoteObject.declareNull("B4IJSONParser");
int _i = 0;
RemoteObject _key = RemoteObject.createImmutable(false);
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _imadim = RemoteObject.declareNull("B4IBitmap");
RemoteObject _alttop = RemoteObject.createImmutable(0);
RemoteObject _lef2 = RemoteObject.createImmutable(0);
RemoteObject _lef3 = RemoteObject.createImmutable(0);
RemoteObject _mapamio = RemoteObject.declareNull("B4IMap");
Debug.locals.put("Job", _job);
 BA.debugLineNum = 65;BA.debugLine="Sub JobDone(Job As HttpJob)";
Debug.ShouldStop(1);
 BA.debugLineNum = 68;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(8);
b4i_categoria._hud.runVoidMethod ("ProgressDialogHide");
 BA.debugLineNum = 70;BA.debugLine="If Job.Success = False Then";
Debug.ShouldStop(32);
if (RemoteObject.solveBoolean("=",_job.getField(true,"_success" /*RemoteObject*/ ),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 71;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
Debug.ShouldStop(64);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(b4i_categoria._main._jobmsj /*RemoteObject*/ ),(Object)(b4i_categoria._main._jobmsjtitle /*RemoteObject*/ ));
 BA.debugLineNum = 72;BA.debugLine="Return";
Debug.ShouldStop(128);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 75;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
Debug.ShouldStop(1024);
if (RemoteObject.solveBoolean("=",b4i_categoria._funciones.runMethod(true,"_verificarjob:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ ))),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 76;BA.debugLine="Return";
Debug.ShouldStop(2048);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 79;BA.debugLine="Dim map As Map";
Debug.ShouldStop(16384);
_map = RemoteObject.createNew ("B4IMap");Debug.locals.put("map", _map);
 BA.debugLineNum = 80;BA.debugLine="Dim list As List";
Debug.ShouldStop(32768);
_list = RemoteObject.createNew ("B4IList");Debug.locals.put("list", _list);
 BA.debugLineNum = 81;BA.debugLine="Dim json2 As JSONParser";
Debug.ShouldStop(65536);
_json2 = RemoteObject.createNew ("B4IJSONParser");Debug.locals.put("json2", _json2);
 BA.debugLineNum = 84;BA.debugLine="json2.Initialize(funciones.base64_Decode(Job.GetS";
Debug.ShouldStop(524288);
_json2.runVoidMethod ("Initialize:",(Object)(b4i_categoria._funciones.runMethod(true,"_base64_decode:" /*RemoteObject*/ ,(Object)(_job.runClassMethod (b4i_httpjob.class, "_getstring" /*RemoteObject*/ )))));
 BA.debugLineNum = 86;BA.debugLine="map = json2.NextObject";
Debug.ShouldStop(2097152);
_map = _json2.runMethod(false,"NextObject");Debug.locals.put("map", _map);
 BA.debugLineNum = 88;BA.debugLine="Select Job.JobName";
Debug.ShouldStop(8388608);
switch (BA.switchObjectToInt(_job.getField(true,"_jobname" /*RemoteObject*/ ),BA.ObjectToString("jobCategorias"),BA.ObjectToString("ProductosByCategoria"),BA.ObjectToString("JobDetalleTemporal"))) {
case 0: {
 BA.debugLineNum = 93;BA.debugLine="If listaCat.IsInitialized Then";
Debug.ShouldStop(268435456);
if (b4i_categoria._listacat.runMethod(true,"IsInitialized").getBoolean()) { 
 BA.debugLineNum = 95;BA.debugLine="listaCat.RemoveViewFromParent";
Debug.ShouldStop(1073741824);
b4i_categoria._listacat.runVoidMethod ("RemoveViewFromParent");
 BA.debugLineNum = 96;BA.debugLine="listaCat.Initialize(\"listaCat\",False)";
Debug.ShouldStop(-2147483648);
b4i_categoria._listacat.runVoidMethod ("Initialize:::",b4i_categoria.ba,(Object)(BA.ObjectToString("listaCat")),(Object)(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 101;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(16);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 103;BA.debugLine="For i=0 To list.Size-1";
Debug.ShouldStop(64);
{
final int step21 = 1;
final int limit21 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step21 > 0 && _i <= limit21) || (step21 < 0 && _i >= limit21) ;_i = ((int)(0 + _i + step21))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 105;BA.debugLine="Dim key As Boolean = False";
Debug.ShouldStop(256);
_key = b4i_main.__c.runMethod(true,"False");Debug.locals.put("key", _key);Debug.locals.put("key", _key);
 BA.debugLineNum = 107;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(1024);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 108;BA.debugLine="mapa = list.Get(i)";
Debug.ShouldStop(2048);
_mapa = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 110;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(8192);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 112;BA.debugLine="If mapa.Get(\"f_fotoCategoria\") <> Null And map";
Debug.ShouldStop(32768);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fotoCategoria"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fotoCategoria")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 114;BA.debugLine="Dim imaDim As Bitmap";
Debug.ShouldStop(131072);
_imadim = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("imaDim", _imadim);
 BA.debugLineNum = 115;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_fotoCate";
Debug.ShouldStop(262144);
_bm = b4i_categoria._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_fotoCategoria")))))));Debug.locals.put("bm", _bm);
 BA.debugLineNum = 117;BA.debugLine="imaDim = funciones.ResizeImage(bm,200,200)";
Debug.ShouldStop(1048576);
_imadim = b4i_categoria._funciones.runMethod(false,"_resizeimage:::" /*RemoteObject*/ ,(Object)(_bm),(Object)(BA.numberCast(int.class, 200)),(Object)(BA.numberCast(int.class, 200)));Debug.locals.put("imaDim", _imadim);
 BA.debugLineNum = 119;BA.debugLine="key = True";
Debug.ShouldStop(4194304);
_key = b4i_main.__c.runMethod(true,"True");Debug.locals.put("key", _key);
 }else {
 BA.debugLineNum = 122;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(33554432);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 126;BA.debugLine="If key Then";
Debug.ShouldStop(536870912);
if (_key.getBoolean()) { 
 BA.debugLineNum = 127;BA.debugLine="CustomListViewCategoria.Add(CreateListItem(ma";
Debug.ShouldStop(1073741824);
b4i_categoria._customlistviewcategoria.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))),BA.numberCast(int.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad"))))),_imadim,BA.numberCast(int.class, b4i_categoria._customlistviewcategoria.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_mapa)));
 }else {
 BA.debugLineNum = 129;BA.debugLine="CustomListViewCategoria.Add(CreateListItem(ma";
Debug.ShouldStop(1);
b4i_categoria._customlistviewcategoria.runClassMethod (b4i_customlistview.class, "_add::" /*RemoteObject*/ ,BA.rdebugUtils.runMethod(false, "ConvertToWrapper::", RemoteObject.createNew("B4XViewWrapper"), (_createlistitem(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_nombre"))))),BA.numberCast(int.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_cantidad"))))),_bm,BA.numberCast(int.class, b4i_categoria._customlistviewcategoria.runClassMethod (b4i_customlistview.class, "_getbase" /*RemoteObject*/ ).runMethod(true,"Width")),b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 50))))).getObject()),(Object)((_mapa)));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 134;BA.debugLine="hud.ProgressDialogHide";
Debug.ShouldStop(32);
b4i_categoria._hud.runVoidMethod ("ProgressDialogHide");
 break; }
case 1: {
 BA.debugLineNum = 138;BA.debugLine="list = map.Get(\"f_data\")";
Debug.ShouldStop(512);
_list.setObject(_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));
 BA.debugLineNum = 140;BA.debugLine="If list.Size <= 0 Then";
Debug.ShouldStop(2048);
if (RemoteObject.solveBoolean("k",_list.runMethod(true,"Size"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 141;BA.debugLine="Msgbox(\"Esta categoría todavía no tiene produc";
Debug.ShouldStop(4096);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(BA.ObjectToString("Esta categoría todavía no tiene productos")),(Object)(RemoteObject.createImmutable("Aviso")));
 };
 BA.debugLineNum = 144;BA.debugLine="Main.NavControl.ShowPage2(pageProByCat,True)";
Debug.ShouldStop(32768);
b4i_categoria._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_categoria._pageprobycat).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 147;BA.debugLine="ScrollViewProByCat.ContentWidth = ScrollViewPro";
Debug.ShouldStop(262144);
b4i_categoria._scrollviewprobycat.runMethod(true,"setContentWidth:",BA.numberCast(int.class, b4i_categoria._scrollviewprobycat.runMethod(true,"Width")));
 BA.debugLineNum = 148;BA.debugLine="Dim alttop As Int  = ScrollViewProByCat.Height";
Debug.ShouldStop(524288);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Height"),RemoteObject.createImmutable(0.02)}, "*",0, 0));Debug.locals.put("alttop", _alttop);Debug.locals.put("alttop", _alttop);
 BA.debugLineNum = 149;BA.debugLine="Dim lef2 As Int = 1%x";
Debug.ShouldStop(1048576);
_lef2 = BA.numberCast(int.class, b4i_main.__c.runMethod(true,"PerXToCurrent:",(Object)(BA.numberCast(float.class, 1))));Debug.locals.put("lef2", _lef2);Debug.locals.put("lef2", _lef2);
 BA.debugLineNum = 150;BA.debugLine="Dim lef3 As Int = ScrollViewProByCat.Width * 0.";
Debug.ShouldStop(2097152);
_lef3 = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Width"),RemoteObject.createImmutable(0.50)}, "*",0, 0));Debug.locals.put("lef3", _lef3);Debug.locals.put("lef3", _lef3);
 BA.debugLineNum = 152;BA.debugLine="For i=0 To list.Size -1";
Debug.ShouldStop(8388608);
{
final int step51 = 1;
final int limit51 = RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1).<Number>get().intValue();
_i = 0 ;
for (;(step51 > 0 && _i <= limit51) || (step51 < 0 && _i >= limit51) ;_i = ((int)(0 + _i + step51))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 153;BA.debugLine="Dim mapaMio As Map = list.Get(i)";
Debug.ShouldStop(16777216);
_mapamio = (_list.runMethod(false,"Get:",(Object)(BA.numberCast(int.class, _i))));Debug.locals.put("mapaMio", _mapamio);Debug.locals.put("mapaMio", _mapamio);
 BA.debugLineNum = 155;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(67108864);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 156;BA.debugLine="If mapaMio.Get(\"f_foto\") <> Null And mapaMio.G";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("N",_mapamio.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapamio.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 157;BA.debugLine="bm = funciones.getImagen(mapaMio.Get(\"f_foto\"";
Debug.ShouldStop(268435456);
_bm = b4i_categoria._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapamio.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 }else {
 BA.debugLineNum = 160;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(-2147483648);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 };
 BA.debugLineNum = 163;BA.debugLine="If i Mod 2 == 0 Then";
Debug.ShouldStop(4);
if (RemoteObject.solveBoolean("=",RemoteObject.solve(new RemoteObject[] {RemoteObject.createImmutable(_i),RemoteObject.createImmutable(2)}, "%",0, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 165;BA.debugLine="ScrollViewProByCat.Panel.AddView(createPanelP";
Debug.ShouldStop(16);
b4i_categoria._scrollviewprobycat.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproductoscroll(_mapamio,_bm)).getObject())),(Object)(BA.numberCast(float.class, _lef2)),(Object)(BA.numberCast(float.class, _alttop)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Width"),RemoteObject.createImmutable(0.48)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Height"),RemoteObject.createImmutable(0.41)}, "*",0, 0))));
 BA.debugLineNum = 167;BA.debugLine="If i == list.Size-1 Then";
Debug.ShouldStop(64);
if (RemoteObject.solveBoolean("=",RemoteObject.createImmutable(_i),BA.numberCast(double.class, RemoteObject.solve(new RemoteObject[] {_list.runMethod(true,"Size"),RemoteObject.createImmutable(1)}, "-",1, 1)))) { 
 BA.debugLineNum = 168;BA.debugLine="alttop = alttop +  ScrollViewProByCat.Height";
Debug.ShouldStop(128);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_alttop,b4i_categoria._scrollviewprobycat.runMethod(true,"Height"),RemoteObject.createImmutable(0.43)}, "+*",1, 0));Debug.locals.put("alttop", _alttop);
 };
 }else {
 BA.debugLineNum = 173;BA.debugLine="ScrollViewProByCat.Panel.AddView(createPanelP";
Debug.ShouldStop(4096);
b4i_categoria._scrollviewprobycat.runMethod(false,"Panel").runVoidMethod ("AddView:::::",(Object)(((_createpanelproductoscroll(_mapamio,_bm)).getObject())),(Object)(BA.numberCast(float.class, _lef3)),(Object)(BA.numberCast(float.class, _alttop)),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Width"),RemoteObject.createImmutable(0.48)}, "*",0, 0))),(Object)(BA.numberCast(float.class, RemoteObject.solve(new RemoteObject[] {b4i_categoria._scrollviewprobycat.runMethod(true,"Height"),RemoteObject.createImmutable(0.41)}, "*",0, 0))));
 BA.debugLineNum = 174;BA.debugLine="alttop = alttop +  ScrollViewProByCat.Height";
Debug.ShouldStop(8192);
_alttop = BA.numberCast(int.class, RemoteObject.solve(new RemoteObject[] {_alttop,b4i_categoria._scrollviewprobycat.runMethod(true,"Height"),RemoteObject.createImmutable(0.43)}, "+*",1, 0));Debug.locals.put("alttop", _alttop);
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 180;BA.debugLine="ScrollViewProByCat.ScrollTo(0,0,True)";
Debug.ShouldStop(524288);
b4i_categoria._scrollviewprobycat.runVoidMethod ("ScrollTo:::",(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 0)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 181;BA.debugLine="ScrollViewProByCat.ContentHeight = alttop";
Debug.ShouldStop(1048576);
b4i_categoria._scrollviewprobycat.runMethod(true,"setContentHeight:",_alttop);
 break; }
case 2: {
 BA.debugLineNum = 185;BA.debugLine="map = map.Get(\"f_data\")";
Debug.ShouldStop(16777216);
_map = (_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_data")))));Debug.locals.put("map", _map);
 BA.debugLineNum = 186;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
Debug.ShouldStop(33554432);
if (RemoteObject.solveBoolean("=",_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_paso")))),RemoteObject.createImmutable(("0")))) { 
 BA.debugLineNum = 187;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
Debug.ShouldStop(67108864);
b4i_main.__c.runVoidMethodAndSync ("Msgbox::",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Este producto no tiene existencia: "),b4i_main.__c.runMethod(true,"CRLF"),_job.getField(false,"_tag" /*RemoteObject*/ ),RemoteObject.createImmutable("."))),(Object)(RemoteObject.createImmutable("Información")));
 BA.debugLineNum = 188;BA.debugLine="Return";
Debug.ShouldStop(134217728);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 190;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
Debug.ShouldStop(536870912);
b4i_categoria._main._cantidadproduto /*RemoteObject*/  = RemoteObject.solve(new RemoteObject[] {b4i_categoria._main._cantidadproduto /*RemoteObject*/ ,RemoteObject.createImmutable(1)}, "+",1, 1);
 BA.debugLineNum = 191;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
Debug.ShouldStop(1073741824);
b4i_categoria._hud.runVoidMethod ("ToastMessageShow::",(Object)(BA.ObjectToString("Producto agregado al carrito.")),(Object)(b4i_main.__c.runMethod(true,"False")));
 BA.debugLineNum = 192;BA.debugLine="actualizar = True";
Debug.ShouldStop(-2147483648);
b4i_categoria._actualizar = b4i_main.__c.runMethod(true,"True");
 break; }
}
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
public static RemoteObject  _listacat_selectedchanged(RemoteObject _sectionindex,RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("listaCat_SelectedChanged (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,221);
if (RapidSub.canDelegate("listacat_selectedchanged")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","listacat_selectedchanged", _sectionindex, _cell);}
Debug.locals.put("SectionIndex", _sectionindex);
Debug.locals.put("Cell", _cell);
 BA.debugLineNum = 221;BA.debugLine="Sub listaCat_SelectedChanged (SectionIndex As Int,";
Debug.ShouldStop(268435456);
 BA.debugLineNum = 223;BA.debugLine="If Cell.Tag = Null Then";
Debug.ShouldStop(1073741824);
if (RemoteObject.solveBoolean("n",_cell.runMethod(false,"Tag"))) { 
 BA.debugLineNum = 224;BA.debugLine="Return";
Debug.ShouldStop(-2147483648);
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.ShouldStop(8);
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
		Debug.PushSubsStack("PanelFondoPro_Click (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,367);
if (RapidSub.canDelegate("panelfondopro_click")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","panelfondopro_click");}
RemoteObject _mapa = RemoteObject.declareNull("B4IMap");
RemoteObject _b = RemoteObject.declareNull("B4IPanelWrapper");
RemoteObject _bm = RemoteObject.declareNull("B4IBitmap");
RemoteObject _bmimgfav = RemoteObject.declareNull("B4IBitmap");
 BA.debugLineNum = 367;BA.debugLine="Sub PanelFondoPro_Click";
Debug.ShouldStop(16384);
 BA.debugLineNum = 369;BA.debugLine="Dim mapa As Map";
Debug.ShouldStop(65536);
_mapa = RemoteObject.createNew ("B4IMap");Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 370;BA.debugLine="mapa.Initialize";
Debug.ShouldStop(131072);
_mapa.runVoidMethod ("Initialize");
 BA.debugLineNum = 372;BA.debugLine="Dim b As Panel";
Debug.ShouldStop(524288);
_b = RemoteObject.createNew ("B4IPanelWrapper");Debug.locals.put("b", _b);
 BA.debugLineNum = 373;BA.debugLine="b = Sender";
Debug.ShouldStop(1048576);
_b.setObject(b4i_main.__c.runMethod(false,"Sender:",b4i_categoria.ba));
 BA.debugLineNum = 375;BA.debugLine="mapa = b.Tag";
Debug.ShouldStop(4194304);
_mapa = (_b.runMethod(false,"Tag"));Debug.locals.put("mapa", _mapa);
 BA.debugLineNum = 376;BA.debugLine="mapaDetalle = mapa";
Debug.ShouldStop(8388608);
b4i_categoria._mapadetalle = _mapa;
 BA.debugLineNum = 380;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
Debug.ShouldStop(134217728);
if (RemoteObject.solveBoolean("=",b4i_categoria._panelfondodetalles.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 381;BA.debugLine="pageDetalle.Initialize(\"pageDetalle\")";
Debug.ShouldStop(268435456);
b4i_categoria._pagedetalle.runVoidMethod ("Initialize::",b4i_categoria.ba,(Object)(RemoteObject.createImmutable("pageDetalle")));
 BA.debugLineNum = 383;BA.debugLine="pageDetalle.RootPanel.LoadLayout(\"frmDetalleProd";
Debug.ShouldStop(1073741824);
b4i_categoria._pagedetalle.runMethod(false,"RootPanel").runMethodAndSync(false,"LoadLayout::",(Object)(RemoteObject.createImmutable("frmDetalleProducto")),b4i_categoria.ba);
 };
 BA.debugLineNum = 386;BA.debugLine="Main.NavControl.ShowPage2(pageDetalle,True)";
Debug.ShouldStop(2);
b4i_categoria._main._navcontrol /*RemoteObject*/ .runVoidMethod ("ShowPage2::",(Object)(((b4i_categoria._pagedetalle).getObject())),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 388;BA.debugLine="Dim bm As Bitmap";
Debug.ShouldStop(8);
_bm = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bm", _bm);
 BA.debugLineNum = 390;BA.debugLine="If mapa.Get(\"f_destacado\") Then";
Debug.ShouldStop(32);
if (BA.ObjectToBoolean(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_destacado"))))).getBoolean()) { 
 BA.debugLineNum = 392;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 393;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
Debug.ShouldStop(256);
_bm = b4i_categoria._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))))));Debug.locals.put("bm", _bm);
 BA.debugLineNum = 395;BA.debugLine="ImageViewDetalles.Bitmap= bm";
Debug.ShouldStop(1024);
b4i_categoria._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 }else {
 BA.debugLineNum = 399;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(16384);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 BA.debugLineNum = 401;BA.debugLine="ImageViewDetalles.Bitmap = bm";
Debug.ShouldStop(65536);
b4i_categoria._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 };
 }else {
 BA.debugLineNum = 405;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
Debug.ShouldStop(1048576);
if (RemoteObject.solveBoolean("N",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))) && RemoteObject.solveBoolean("!",_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto")))),RemoteObject.createImmutable(("")))) { 
 BA.debugLineNum = 408;BA.debugLine="ImageViewDetalles.Bitmap = funciones.getImagen(";
Debug.ShouldStop(8388608);
b4i_categoria._imageviewdetalles.runMethod(false,"setBitmap:",b4i_categoria._funciones.runMethod(false,"_getimagen:" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_foto"))))))));
 }else {
 BA.debugLineNum = 411;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
Debug.ShouldStop(67108864);
_bm.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("no-image.jpg")));
 BA.debugLineNum = 413;BA.debugLine="ImageViewDetalles.Bitmap = bm";
Debug.ShouldStop(268435456);
b4i_categoria._imageviewdetalles.runMethod(false,"setBitmap:",_bm);
 };
 };
 BA.debugLineNum = 420;BA.debugLine="Dim bmimgfav As Bitmap";
Debug.ShouldStop(8);
_bmimgfav = RemoteObject.createNew ("B4IBitmap");Debug.locals.put("bmimgfav", _bmimgfav);
 BA.debugLineNum = 424;BA.debugLine="If bmimgfav.IsInitialized == False Then";
Debug.ShouldStop(128);
if (RemoteObject.solveBoolean("=",_bmimgfav.runMethod(true,"IsInitialized"),b4i_main.__c.runMethod(true,"False"))) { 
 BA.debugLineNum = 425;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartWhitean";
Debug.ShouldStop(256);
_bmimgfav.runVoidMethod ("Initialize::",(Object)(b4i_main.__c.runMethod(false,"File").runMethod(true,"DirAssets")),(Object)(RemoteObject.createImmutable("heartWhiteandBlack.png")));
 BA.debugLineNum = 426;BA.debugLine="imgdetallefav.Tag = False";
Debug.ShouldStop(512);
b4i_categoria._imgdetallefav.runMethod(false,"setTag:",(b4i_main.__c.runMethod(true,"False")));
 };
 BA.debugLineNum = 429;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
Debug.ShouldStop(4096);
b4i_categoria._imgdetallefav.runMethod(false,"setBitmap:",_bmimgfav);
 BA.debugLineNum = 433;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
Debug.ShouldStop(65536);
b4i_categoria._btnagregarcarritodetalle.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 2))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 434;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
Debug.ShouldStop(131072);
b4i_categoria._panelimagendetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 435;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
Debug.ShouldStop(262144);
b4i_categoria._panellblcantidad.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 1))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 436;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
Debug.ShouldStop(524288);
b4i_categoria._panelencabezadodetalles.runVoidMethod ("SetShadow:::::",(Object)(b4i_main.__c.runMethod(false,"Colors").runMethod(true,"Gray")),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 0))))),(Object)(BA.numberCast(float.class, b4i_main.__c.runMethod(true,"DipToCurrent:",(Object)(BA.numberCast(int.class, 3))))),(Object)(BA.numberCast(float.class, 0.3)),(Object)(b4i_main.__c.runMethod(true,"True")));
 BA.debugLineNum = 438;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
Debug.ShouldStop(2097152);
b4i_categoria._lblprecioencabezado.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 439;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
Debug.ShouldStop(4194304);
b4i_categoria._lblnombeencabezado.runMethod(true,"setText:",BA.ObjectToString(_mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_descripcion"))))));
 BA.debugLineNum = 440;BA.debugLine="lblcantidad.Text = 1";
Debug.ShouldStop(8388608);
b4i_categoria._lblcantidad.runMethod(true,"setText:",BA.NumberToString(1));
 BA.debugLineNum = 441;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
Debug.ShouldStop(16777216);
b4i_categoria._steppercantidad.runMethod(true,"setValue:",BA.numberCast(double.class, b4i_categoria._lblcantidad.runMethod(true,"Text")));
 BA.debugLineNum = 442;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
Debug.ShouldStop(33554432);
b4i_categoria._lblprecio.runMethod(true,"setText:",RemoteObject.concat(RemoteObject.createImmutable("$"),b4i_main.__c.runMethod(true,"NumberFormat:::",(Object)(BA.numberCast(double.class, _mapa.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(int.class, 0)),(Object)(BA.numberCast(int.class, 2)))));
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.ShouldStop(536870912);
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
 //BA.debugLineNum = 7;BA.debugLine="Private PanelLista As Panel";
b4i_categoria._panellista = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 8;BA.debugLine="Private listaCat As TableView";
b4i_categoria._listacat = RemoteObject.createNew ("B4ITableView");
 //BA.debugLineNum = 10;BA.debugLine="Private hud As HUD";
b4i_categoria._hud = RemoteObject.createNew ("iHUD");
 //BA.debugLineNum = 11;BA.debugLine="Dim mapaDetalle As Map";
b4i_categoria._mapadetalle = RemoteObject.createNew ("B4IMap");
 //BA.debugLineNum = 12;BA.debugLine="dim actualizar as Boolean = False";
b4i_categoria._actualizar = b4i_main.__c.runMethod(true,"False");
 //BA.debugLineNum = 14;BA.debugLine="Private pageCat As Page";
b4i_categoria._pagecat = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 15;BA.debugLine="Private pageProByCat As Page";
b4i_categoria._pageprobycat = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 16;BA.debugLine="Private pageDetalle As Page";
b4i_categoria._pagedetalle = RemoteObject.createNew ("B4IPage");
 //BA.debugLineNum = 18;BA.debugLine="Private btnBackCat As Button";
b4i_categoria._btnbackcat = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 19;BA.debugLine="Private CustomListViewCategoria As CustomListView";
b4i_categoria._customlistviewcategoria = RemoteObject.createNew ("b4i_customlistview");
 //BA.debugLineNum = 20;BA.debugLine="Private imgCat As ImageView";
b4i_categoria._imgcat = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 21;BA.debugLine="Private lblNomCat As Label";
b4i_categoria._lblnomcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 22;BA.debugLine="Private lblCantCat As Label";
b4i_categoria._lblcantcat = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 23;BA.debugLine="Private ScrollViewProByCat As ScrollView";
b4i_categoria._scrollviewprobycat = RemoteObject.createNew ("B4IScrollView");
 //BA.debugLineNum = 24;BA.debugLine="Private Label1 As Label";
b4i_categoria._label1 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 25;BA.debugLine="Private PanelFondoProductosbycategorias As Panel";
b4i_categoria._panelfondoproductosbycategorias = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 26;BA.debugLine="Private btnbackprobycat As Button";
b4i_categoria._btnbackprobycat = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 27;BA.debugLine="Private Label2 As Label";
b4i_categoria._label2 = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 29;BA.debugLine="Private btnBackDetalles As Button";
b4i_categoria._btnbackdetalles = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 30;BA.debugLine="Private ImageViewDetalles As ImageView";
b4i_categoria._imageviewdetalles = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 31;BA.debugLine="Private lblPrecioEncabezado As Label";
b4i_categoria._lblprecioencabezado = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 32;BA.debugLine="Private lblNombeEncabezado As Label";
b4i_categoria._lblnombeencabezado = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 33;BA.debugLine="Private imgdetallefav As ImageView";
b4i_categoria._imgdetallefav = RemoteObject.createNew ("B4IImageViewWrapper");
 //BA.debugLineNum = 34;BA.debugLine="Private btnagregarCarritoDetalle As Button";
b4i_categoria._btnagregarcarritodetalle = RemoteObject.createNew ("B4IButtonWrapper");
 //BA.debugLineNum = 35;BA.debugLine="Private StepperCantidad As Stepper";
b4i_categoria._steppercantidad = RemoteObject.createNew ("B4IStepperWrapper");
 //BA.debugLineNum = 36;BA.debugLine="Private lblPrecio As Label";
b4i_categoria._lblprecio = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 37;BA.debugLine="Private PanelImagenDetalles As Panel";
b4i_categoria._panelimagendetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 38;BA.debugLine="Private PanelFondoDetalles As Panel";
b4i_categoria._panelfondodetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 39;BA.debugLine="Private lblcantidad As Label";
b4i_categoria._lblcantidad = RemoteObject.createNew ("B4ILabelWrapper");
 //BA.debugLineNum = 40;BA.debugLine="Private PanellblCantidad As Panel";
b4i_categoria._panellblcantidad = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 41;BA.debugLine="Private PanelEncabezadoDetalles As Panel";
b4i_categoria._panelencabezadodetalles = RemoteObject.createNew ("B4IPanelWrapper");
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _salvar_detalle_temporal(RemoteObject _map,RemoteObject _cantidad) throws Exception{
try {
		Debug.PushSubsStack("salvar_detalle_temporal (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,480);
if (RapidSub.canDelegate("salvar_detalle_temporal")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","salvar_detalle_temporal", _map, _cantidad);}
RemoteObject _mapcalculos = RemoteObject.declareNull("B4IMap");
RemoteObject _json = RemoteObject.createImmutable("");
RemoteObject _jobdetalletemporal = RemoteObject.declareNull("b4i_httpjob");
Debug.locals.put("map", _map);
Debug.locals.put("cantidad", _cantidad);
 BA.debugLineNum = 480;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
Debug.ShouldStop(-2147483648);
 BA.debugLineNum = 482;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
Debug.ShouldStop(2);
_mapcalculos = b4i_categoria._funciones.runMethod(false,"_recalcular::::::" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio")))))),(Object)(BA.numberCast(double.class, 0)),(Object)(BA.numberCast(double.class, _cantidad)),(Object)(BA.numberCast(double.class, _map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))))),(Object)(b4i_categoria._main._impuestoincluido /*RemoteObject*/ ),(Object)(b4i_main.__c.runMethod(true,"False")));Debug.locals.put("mapCalculos", _mapcalculos);Debug.locals.put("mapCalculos", _mapcalculos);
 BA.debugLineNum = 484;BA.debugLine="Dim json As String";
Debug.ShouldStop(8);
_json = RemoteObject.createImmutable("");Debug.locals.put("json", _json);
 BA.debugLineNum = 485;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
Debug.ShouldStop(16);
_json = RemoteObject.concat(RemoteObject.createImmutable("'f_regresa':false"),RemoteObject.createImmutable(",'f_idempresa':"),b4i_categoria._main._idempresa /*RemoteObject*/ ,RemoteObject.createImmutable(",'f_tipo':1"),RemoteObject.createImmutable(",'f_idproducto':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_idrecord")))),RemoteObject.createImmutable(",'f_cantidad':"),_cantidad,RemoteObject.createImmutable(""),RemoteObject.createImmutable(",'f_tax':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_precio':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_precio_para_mostrar")))),RemoteObject.createImmutable(",'f_importe':"),_mapcalculos.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_total")))),RemoteObject.createImmutable(",'f_descuento':0"),RemoteObject.createImmutable(",'f_diferencia':0"),RemoteObject.createImmutable(",'f_porciento_descuento':0"),RemoteObject.createImmutable(",'f_porciento_tax':"),_map.runMethod(false,"Get:",(Object)((RemoteObject.createImmutable("f_tax")))),RemoteObject.createImmutable(",'f_imei':"),b4i_categoria._main._imei /*RemoteObject*/ );Debug.locals.put("json", _json);
 BA.debugLineNum = 499;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
Debug.ShouldStop(262144);
_jobdetalletemporal = RemoteObject.createNew ("b4i_httpjob");Debug.locals.put("JobDetalleTemporal", _jobdetalletemporal);
 BA.debugLineNum = 500;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
Debug.ShouldStop(524288);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_initialize:::" /*RemoteObject*/ ,b4i_categoria.ba,(Object)(BA.ObjectToString("JobDetalleTemporal")),(Object)(b4i_categoria.getObject()));
 BA.debugLineNum = 501;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
Debug.ShouldStop(1048576);
_jobdetalletemporal.runClassMethod (b4i_httpjob.class, "_poststring::" /*RemoteObject*/ ,(Object)(RemoteObject.concat(b4i_categoria._main._url /*RemoteObject*/ ,RemoteObject.createImmutable("puntoventa/salvar_detalle_temporal2"))),(Object)(RemoteObject.concat(RemoteObject.createImmutable("json="),b4i_categoria._funciones.runMethod(true,"_crearjson::" /*RemoteObject*/ ,(Object)(b4i_categoria._main._tokenpublico /*RemoteObject*/ ),(Object)(_json)))));
 BA.debugLineNum = 503;BA.debugLine="End Sub";
Debug.ShouldStop(4194304);
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
		Debug.PushSubsStack("StepperCantidad_ValueChanged (categoria) ","categoria",3,b4i_categoria.ba,b4i_categoria.mostCurrent,475);
if (RapidSub.canDelegate("steppercantidad_valuechanged")) { return b4i_categoria.remoteMe.runUserSub(false, "categoria","steppercantidad_valuechanged", _value);}
Debug.locals.put("Value", _value);
 BA.debugLineNum = 475;BA.debugLine="Sub StepperCantidad_ValueChanged (Value As Double)";
Debug.ShouldStop(67108864);
 BA.debugLineNum = 476;BA.debugLine="lblcantidad.Text = Value";
Debug.ShouldStop(134217728);
b4i_categoria._lblcantidad.runMethod(true,"setText:",BA.NumberToString(_value));
 BA.debugLineNum = 477;BA.debugLine="End Sub";
Debug.ShouldStop(268435456);
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}