
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_categoria implements IRemote{
	public static b4i_categoria mostCurrent;
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
		mostCurrent = new b4i_categoria();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_categoria");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_categoria", "com.jq.b4i_categoria");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_categoria.class);
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
		pcBA = new PCBA(this, b4i_categoria.class);
        try {
            BA.init();
            b4i_categoria_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _panellista = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _listacat = RemoteObject.declareNull("B4ITableView");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _mapadetalle = RemoteObject.declareNull("B4IMap");
public static RemoteObject _actualizar = RemoteObject.createImmutable(false);
public static RemoteObject _pagecat = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pageprobycat = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pagedetalle = RemoteObject.declareNull("B4IPage");
public static RemoteObject _btnbackcat = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _customlistviewcategoria = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _imgcat = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblnomcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblcantcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _scrollviewprobycat = RemoteObject.declareNull("B4IScrollView");
public static RemoteObject _label1 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelfondoproductosbycategorias = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btnbackprobycat = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnbackdetalles = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _imageviewdetalles = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblprecioencabezado = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblnombeencabezado = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _imgdetallefav = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _btnagregarcarritodetalle = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _steppercantidad = RemoteObject.declareNull("B4IStepperWrapper");
public static RemoteObject _lblprecio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelimagendetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelfondodetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _lblcantidad = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panellblcantidad = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelencabezadodetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"actualizar",b4i_categoria._actualizar,"btnagregarCarritoDetalle",b4i_categoria._btnagregarcarritodetalle,"btnBackCat",b4i_categoria._btnbackcat,"btnBackDetalles",b4i_categoria._btnbackdetalles,"btnbackprobycat",b4i_categoria._btnbackprobycat,"CustomListViewCategoria",b4i_categoria._customlistviewcategoria,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_categoria._hud,"ImageViewDetalles",b4i_categoria._imageviewdetalles,"imgCat",b4i_categoria._imgcat,"imgdetallefav",b4i_categoria._imgdetallefav,"Label1",b4i_categoria._label1,"Label2",b4i_categoria._label2,"lblCantCat",b4i_categoria._lblcantcat,"lblcantidad",b4i_categoria._lblcantidad,"lblNombeEncabezado",b4i_categoria._lblnombeencabezado,"lblNomCat",b4i_categoria._lblnomcat,"lblPrecio",b4i_categoria._lblprecio,"lblPrecioEncabezado",b4i_categoria._lblprecioencabezado,"listaCat",b4i_categoria._listacat,"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"mapaDetalle",b4i_categoria._mapadetalle,"pageCat",b4i_categoria._pagecat,"pageDetalle",b4i_categoria._pagedetalle,"pageProByCat",b4i_categoria._pageprobycat,"PanelEncabezadoDetalles",b4i_categoria._panelencabezadodetalles,"PanelFondoDetalles",b4i_categoria._panelfondodetalles,"PanelFondoProductosbycategorias",b4i_categoria._panelfondoproductosbycategorias,"PanelImagenDetalles",b4i_categoria._panelimagendetalles,"PanellblCantidad",b4i_categoria._panellblcantidad,"PanelLista",b4i_categoria._panellista,"Perfil",Debug.moduleToString(b4i_perfil.class),"Reportes",Debug.moduleToString(b4i_reportes.class),"ScrollViewProByCat",b4i_categoria._scrollviewprobycat,"StepperCantidad",b4i_categoria._steppercantidad};
}
}