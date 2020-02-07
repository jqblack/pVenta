
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_facturacion implements IRemote{
	public static b4i_facturacion mostCurrent;
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
		mostCurrent = new b4i_facturacion();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_facturacion");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_facturacion", "com.jq.b4i_facturacion");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_facturacion.class);
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
		pcBA = new PCBA(this, b4i_facturacion.class);
        try {
            BA.init();
            b4i_facturacion_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _page = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pageopciones = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pagedirecciones = RemoteObject.declareNull("B4IPage");
public static RemoteObject _btnordenenviar = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _lbldireccion = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblordentotalpagar = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblprecioenvio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _paneldireccion = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelordenproductosdetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelordentotal = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _listviewordenproducto = RemoteObject.declareNull("B4ITableView");
public static RemoteObject _tax = RemoteObject.createImmutable(0.0);
public static RemoteObject _subtotal = RemoteObject.createImmutable(0.0);
public static RemoteObject _total = RemoteObject.createImmutable(0.0);
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _btnopcionesproductosalvar = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _scrollviewopciones = RemoteObject.declareNull("B4IScrollView");
public static RemoteObject _stmodificarcantidad = RemoteObject.declareNull("B4IStepperWrapper");
public static RemoteObject _txtcantidad = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtproductocomentario = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _lblopcionesproductonombre = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelscrollviewopciones = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _listviewdirecciones = RemoteObject.declareNull("B4ITableView");
public static RemoteObject _btnabrirdireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panellistviewdirecciones = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnAbrirDireccion",b4i_facturacion._btnabrirdireccion,"btnOpcionesProductoSalvar",b4i_facturacion._btnopcionesproductosalvar,"btnOrdenEnviar",b4i_facturacion._btnordenenviar,"DateUtils",b4i_facturacion._dateutils,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"funcion",Debug.moduleToString(b4i_funcion.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_facturacion._hud,"lblDireccion",b4i_facturacion._lbldireccion,"lblOpcionesProductoNombre",b4i_facturacion._lblopcionesproductonombre,"lblOrdenTotalPagar",b4i_facturacion._lblordentotalpagar,"lblPrecioEnvio",b4i_facturacion._lblprecioenvio,"ListViewDirecciones",b4i_facturacion._listviewdirecciones,"ListViewOrdenProducto",b4i_facturacion._listviewordenproducto,"Main",Debug.moduleToString(b4i_main.class),"page",b4i_facturacion._page,"pageDirecciones",b4i_facturacion._pagedirecciones,"pageOpciones",b4i_facturacion._pageopciones,"PanelDireccion",b4i_facturacion._paneldireccion,"PanelListViewDirecciones",b4i_facturacion._panellistviewdirecciones,"PanelOrdenProductosDetalles",b4i_facturacion._panelordenproductosdetalles,"PanelOrdenTotal",b4i_facturacion._panelordentotal,"PanelScrollViewOpciones",b4i_facturacion._panelscrollviewopciones,"Principal",Debug.moduleToString(b4i_principal.class),"ReporteOrdenes",Debug.moduleToString(b4i_reporteordenes.class),"ScrollViewOpciones",b4i_facturacion._scrollviewopciones,"stModificarCantidad",b4i_facturacion._stmodificarcantidad,"subtotal",b4i_facturacion._subtotal,"tax",b4i_facturacion._tax,"total",b4i_facturacion._total,"txtCantidad",b4i_facturacion._txtcantidad,"txtProductoComentario",b4i_facturacion._txtproductocomentario};
}
}