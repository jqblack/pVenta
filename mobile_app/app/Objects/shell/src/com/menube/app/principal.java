
package com.menube.app;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class principal implements IRemote{
	public static principal mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public principal() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
	public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), args[3]);
		RDebug.INSTANCE.waitForTask();

	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("principal"), "com.menube.app.principal");
	}

public boolean isSingleton() {
		return true;
	}
     public static RemoteObject getObject() {
		return myClass;
	 }

	public RemoteObject activityBA;
	public RemoteObject _activity;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
		activityBA = (RemoteObject) args[2];
		_activity = (RemoteObject) args[3];
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[4];
        remoteMe = (RemoteObject) args[5];
		pcBA = new PCBA(this, principal.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _idempresa = RemoteObject.createImmutable(0);
public static RemoteObject _impuestoincluido = RemoteObject.createImmutable(false);
public static RemoteObject _mapempresainfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cantidadproduto = RemoteObject.createImmutable(0);
public static RemoteObject _viewcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnabierto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnempresainfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnmasvendido = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnorden = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnprincipalback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbllema = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneltitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblcantidadproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnbuscarproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnproductovolver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listproductosmodalview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _panelmodalproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtbuscarproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnproductobuscarmodal = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btninfocerrar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelinfoback = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbldireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblinfoempresa = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblinfonegocio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblpedidominimo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltelefono = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelslide = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelslideback = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnslidevolver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.menube.app.main _main = null;
public static com.menube.app.starter _starter = null;
public static com.menube.app.funcion _funcion = null;
public static com.menube.app.facturacion _facturacion = null;
public static com.menube.app.direcciones _direcciones = null;
public static com.menube.app.reporteordenes _reporteordenes = null;
public static com.menube.app.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",principal.mostCurrent._activity,"btnAbierto",principal.mostCurrent._btnabierto,"btnBuscarProducto",principal.mostCurrent._btnbuscarproducto,"btnEmpresaInfo",principal.mostCurrent._btnempresainfo,"btnInfoCerrar",principal.mostCurrent._btninfocerrar,"btnMasVendido",principal.mostCurrent._btnmasvendido,"btnOrden",principal.mostCurrent._btnorden,"btnPrincipalBack",principal.mostCurrent._btnprincipalback,"btnProductoBuscarModal",principal.mostCurrent._btnproductobuscarmodal,"btnProductoVolver",principal.mostCurrent._btnproductovolver,"btnSlideVolver",principal.mostCurrent._btnslidevolver,"cantidadProduto",principal._cantidadproduto,"DateUtils",principal.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.menube.app.direcciones.class),"Facturacion",Debug.moduleToString(com.menube.app.facturacion.class),"funcion",Debug.moduleToString(com.menube.app.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.menube.app.httputils2service.class),"idEmpresa",principal._idempresa,"impuestoIncluido",principal._impuestoincluido,"lblCantidadProductos",principal.mostCurrent._lblcantidadproductos,"lblCategoria",principal.mostCurrent._lblcategoria,"lblDireccion",principal.mostCurrent._lbldireccion,"lblInfoEmpresa",principal.mostCurrent._lblinfoempresa,"lblInfoNegocio",principal.mostCurrent._lblinfonegocio,"lblLema",principal.mostCurrent._lbllema,"lblPedidoMinimo",principal.mostCurrent._lblpedidominimo,"lblTelefono",principal.mostCurrent._lbltelefono,"ListProductosModalView",principal.mostCurrent._listproductosmodalview,"Main",Debug.moduleToString(com.menube.app.main.class),"mapEmpresaInfo",principal._mapempresainfo,"PanelCategoria",principal.mostCurrent._panelcategoria,"PanelInfoBack",principal.mostCurrent._panelinfoback,"PanelMenu",principal.mostCurrent._panelmenu,"PanelModalProducto",principal.mostCurrent._panelmodalproducto,"PanelSlide",principal.mostCurrent._panelslide,"PanelSlideBack",principal.mostCurrent._panelslideback,"PanelTitulo",principal.mostCurrent._paneltitulo,"ReporteOrdenes",Debug.moduleToString(com.menube.app.reporteordenes.class),"Starter",Debug.moduleToString(com.menube.app.starter.class),"txtBuscarProducto",principal.mostCurrent._txtbuscarproducto,"ViewCategoria",principal.mostCurrent._viewcategoria};
}
}