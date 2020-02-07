
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
public static RemoteObject _btnordenback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelordentitulo = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _listacarrito = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _changevalue = RemoteObject.createImmutable(false);
public static RemoteObject _valorcantidad = RemoteObject.createImmutable(0);
public static RemoteObject _tax = RemoteObject.createImmutable(0.0);
public static RemoteObject _subtotal = RemoteObject.createImmutable(0.0);
public static RemoteObject _total = RemoteObject.createImmutable(0.0);
public static RemoteObject _lblordentotalpagar = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblprecioenvio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lbldireccion = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _imgcat = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblnomcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblcantcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblopcionesproductonombre = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _txtcantidad = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _stmodificarcantidad = RemoteObject.declareNull("B4IStepperWrapper");
public static RemoteObject _btnopcionesproductosalvar = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelopcionesback = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btnopcionesback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnopcioneseliminar = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _txtproductocomentario = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _paneldireccion = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _milistadireccion = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _btnbackmdaldireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnabrirdireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelfondodireccionmodal = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _lbldir = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblfecha = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblprincipal = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnordenenviar = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnordeneliminartodos = RemoteObject.declareNull("B4IButtonWrapper");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnAbrirDireccion",b4i_facturacion._btnabrirdireccion,"btnBackMdalDireccion",b4i_facturacion._btnbackmdaldireccion,"btnOpcionesBack",b4i_facturacion._btnopcionesback,"btnOpcionesEliminar",b4i_facturacion._btnopcioneseliminar,"btnOpcionesProductoSalvar",b4i_facturacion._btnopcionesproductosalvar,"btnOrdenBack",b4i_facturacion._btnordenback,"btnOrdenEliminarTodos",b4i_facturacion._btnordeneliminartodos,"btnOrdenEnviar",b4i_facturacion._btnordenenviar,"Categoria",Debug.moduleToString(b4i_categoria.class),"changeValue",b4i_facturacion._changevalue,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_facturacion._hud,"imgCat",b4i_facturacion._imgcat,"lblCantCat",b4i_facturacion._lblcantcat,"lblDir",b4i_facturacion._lbldir,"lblDireccion",b4i_facturacion._lbldireccion,"lblFecha",b4i_facturacion._lblfecha,"lblNomCat",b4i_facturacion._lblnomcat,"lblOpcionesProductoNombre",b4i_facturacion._lblopcionesproductonombre,"lblOrdenTotalPagar",b4i_facturacion._lblordentotalpagar,"lblPrecioEnvio",b4i_facturacion._lblprecioenvio,"lblPrincipal",b4i_facturacion._lblprincipal,"ListaCarrito",b4i_facturacion._listacarrito,"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"MiListaDireccion",b4i_facturacion._milistadireccion,"page",b4i_facturacion._page,"PanelDireccion",b4i_facturacion._paneldireccion,"PanelFondoDireccionModal",b4i_facturacion._panelfondodireccionmodal,"PanelOpcionesBack",b4i_facturacion._panelopcionesback,"PanelOrdenTitulo",b4i_facturacion._panelordentitulo,"Perfil",Debug.moduleToString(b4i_perfil.class),"Reportes",Debug.moduleToString(b4i_reportes.class),"stModificarCantidad",b4i_facturacion._stmodificarcantidad,"subtotal",b4i_facturacion._subtotal,"tax",b4i_facturacion._tax,"total",b4i_facturacion._total,"txtCantidad",b4i_facturacion._txtcantidad,"txtProductoComentario",b4i_facturacion._txtproductocomentario,"valorCantidad",b4i_facturacion._valorcantidad};
}
}