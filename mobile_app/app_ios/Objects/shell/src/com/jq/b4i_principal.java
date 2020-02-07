
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_principal implements IRemote{
	public static b4i_principal mostCurrent;
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
		mostCurrent = new b4i_principal();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_principal");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_principal", "com.jq.b4i_principal");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_principal.class);
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
		pcBA = new PCBA(this, b4i_principal.class);
        try {
            BA.init();
            b4i_principal_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _page = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pageinfo = RemoteObject.declareNull("B4IPage");
public static RemoteObject _idempresa = RemoteObject.createImmutable(0);
public static RemoteObject _impuestoincluido = RemoteObject.createImmutable(false);
public static RemoteObject _mapempresainfo = RemoteObject.declareNull("B4IMap");
public static RemoteObject _cantidadproduto = RemoteObject.createImmutable(0);
public static RemoteObject _btnabierto = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnbuscarproducto = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnmasvendido = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _lblcategoria = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lbllema = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _viewcategoria = RemoteObject.declareNull("B4IScrollView");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _panelcategoria = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btninfocerrar = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _lbldireccion = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _lblinfoempresa = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblinfonegocio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblpedidominimo = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lbltelefono = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelinfoback = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _listproductosmodalview = RemoteObject.declareNull("B4ITableView");
public static RemoteObject _btnproductobuscarmodal = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnproductovolver = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelproductosmodalview = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _txtbuscarproducto = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _panelmodalproducto = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnAbierto",b4i_principal._btnabierto,"btnBuscarProducto",b4i_principal._btnbuscarproducto,"btnInfoCerrar",b4i_principal._btninfocerrar,"btnMasVendido",b4i_principal._btnmasvendido,"btnProductoBuscarModal",b4i_principal._btnproductobuscarmodal,"btnProductoVolver",b4i_principal._btnproductovolver,"cantidadProduto",b4i_principal._cantidadproduto,"DateUtils",b4i_principal._dateutils,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"funcion",Debug.moduleToString(b4i_funcion.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_principal._hud,"idEmpresa",b4i_principal._idempresa,"impuestoIncluido",b4i_principal._impuestoincluido,"lblCategoria",b4i_principal._lblcategoria,"lblDireccion",b4i_principal._lbldireccion,"lblInfoEmpresa",b4i_principal._lblinfoempresa,"lblInfoNegocio",b4i_principal._lblinfonegocio,"lblLema",b4i_principal._lbllema,"lblPedidoMinimo",b4i_principal._lblpedidominimo,"lblTelefono",b4i_principal._lbltelefono,"ListProductosModalView",b4i_principal._listproductosmodalview,"Main",Debug.moduleToString(b4i_main.class),"mapEmpresaInfo",b4i_principal._mapempresainfo,"page",b4i_principal._page,"pageInfo",b4i_principal._pageinfo,"PanelCategoria",b4i_principal._panelcategoria,"PanelInfoBack",b4i_principal._panelinfoback,"PanelModalProducto",b4i_principal._panelmodalproducto,"PanelProductosModalView",b4i_principal._panelproductosmodalview,"ReporteOrdenes",Debug.moduleToString(b4i_reporteordenes.class),"txtBuscarProducto",b4i_principal._txtbuscarproducto,"ViewCategoria",b4i_principal._viewcategoria};
}
}