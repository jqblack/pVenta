
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_favoritos implements IRemote{
	public static b4i_favoritos mostCurrent;
    public static RemoteObject ba;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
		mostCurrent = new b4i_favoritos();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_favoritos");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_favoritos", "com.jq.b4i_favoritos");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_favoritos.class);
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public static RemoteObject getObject() {
		return remoteMe;
	 }
	public PCBA create(Object[] args) throws ClassNotFoundException{
		ba = (RemoteObject) args[1];
        remoteMe = (RemoteObject) args[2];
        __c = (RemoteObject)args[3];
		pcBA = new PCBA(this, b4i_favoritos.class);
        try {
            BA.init();
            b4i_favoritos_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _pagefv = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pagedetalle = RemoteObject.declareNull("B4IPage");
public static RemoteObject _mapadetalle = RemoteObject.declareNull("B4IMap");
public static RemoteObject _actu = RemoteObject.createImmutable(false);
public static RemoteObject _actucantidad = RemoteObject.createImmutable(false);
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _lblcantproductos = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnbackfavoritos = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _llistafavoritos = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _militafav = RemoteObject.declareNull("B4IList");
public static RemoteObject _lblnomcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblcantcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _imgcat = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _panelfondodetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _imageviewdetalles = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblprecioencabezado = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblnombeencabezado = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _imgdetallefav = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblcantidad = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnless = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnmore = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _lblprecio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnagregarcarritodetalle = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnbackdetalles = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelimagendetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panellblcantidad = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelencabezadodetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _steppercantidad = RemoteObject.declareNull("B4IStepperWrapper");
public static RemoteObject _lblcantidadproductos = RemoteObject.declareNull("B4ILabelWrapper");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"actu",b4i_favoritos._actu,"actuCantidad",b4i_favoritos._actucantidad,"btnagregarCarritoDetalle",b4i_favoritos._btnagregarcarritodetalle,"btnBackDetalles",b4i_favoritos._btnbackdetalles,"btnBackFavoritos",b4i_favoritos._btnbackfavoritos,"btnless",b4i_favoritos._btnless,"btnMore",b4i_favoritos._btnmore,"Categoria",Debug.moduleToString(b4i_categoria.class),"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_favoritos._hud,"ImageViewDetalles",b4i_favoritos._imageviewdetalles,"imgCat",b4i_favoritos._imgcat,"imgdetallefav",b4i_favoritos._imgdetallefav,"lblCantCat",b4i_favoritos._lblcantcat,"lblcantidad",b4i_favoritos._lblcantidad,"lblCantidadProductos",b4i_favoritos._lblcantidadproductos,"lblCantProductos",b4i_favoritos._lblcantproductos,"lblNombeEncabezado",b4i_favoritos._lblnombeencabezado,"lblNomCat",b4i_favoritos._lblnomcat,"lblPrecio",b4i_favoritos._lblprecio,"lblPrecioEncabezado",b4i_favoritos._lblprecioencabezado,"LlistaFavoritos",b4i_favoritos._llistafavoritos,"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"mapadetalle",b4i_favoritos._mapadetalle,"MilitaFav",b4i_favoritos._militafav,"pagedetalle",b4i_favoritos._pagedetalle,"pageFv",b4i_favoritos._pagefv,"PanelEncabezadoDetalles",b4i_favoritos._panelencabezadodetalles,"PanelFondoDetalles",b4i_favoritos._panelfondodetalles,"PanelImagenDetalles",b4i_favoritos._panelimagendetalles,"PanellblCantidad",b4i_favoritos._panellblcantidad,"Perfil",Debug.moduleToString(b4i_perfil.class),"Reportes",Debug.moduleToString(b4i_reportes.class),"StepperCantidad",b4i_favoritos._steppercantidad};
}
}