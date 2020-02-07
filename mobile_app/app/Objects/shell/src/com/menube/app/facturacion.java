
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

public class facturacion implements IRemote{
	public static facturacion mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public facturacion() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("facturacion"), "com.menube.app.facturacion");
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
		pcBA = new PCBA(this, facturacion.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _btnordenback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnordenenviar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listviewordenproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _panelordenenviar = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelordenproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelordenproductosdetalles = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelordentitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblordentotalpagar = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbldireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprecioenvio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _paneldireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnordeneliminartodos = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _tax = RemoteObject.createImmutable(0);
public static RemoteObject _subtotal = RemoteObject.createImmutable(0);
public static RemoteObject _total = RemoteObject.createImmutable(0);
public static RemoteObject _btncantidadaumentar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btncantidaddesaumentar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnopcionesback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelopcionesback = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtcantidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblopcionesproductonombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _scrollviewopciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnopcionesproductosalvar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtproductocomentario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnopcioneseliminar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnabrirdireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listviewdirecciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _paneldireccionmodal = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.menube.app.main _main = null;
public static com.menube.app.starter _starter = null;
public static com.menube.app.principal _principal = null;
public static com.menube.app.funcion _funcion = null;
public static com.menube.app.direcciones _direcciones = null;
public static com.menube.app.reporteordenes _reporteordenes = null;
public static com.menube.app.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",facturacion.mostCurrent._activity,"btnAbrirDireccion",facturacion.mostCurrent._btnabrirdireccion,"btnCantidadAumentar",facturacion.mostCurrent._btncantidadaumentar,"btnCantidadDesaumentar",facturacion.mostCurrent._btncantidaddesaumentar,"btnOpcionesBack",facturacion.mostCurrent._btnopcionesback,"btnOpcionesEliminar",facturacion.mostCurrent._btnopcioneseliminar,"btnOpcionesProductoSalvar",facturacion.mostCurrent._btnopcionesproductosalvar,"btnOrdenBack",facturacion.mostCurrent._btnordenback,"btnOrdenEliminarTodos",facturacion.mostCurrent._btnordeneliminartodos,"btnOrdenEnviar",facturacion.mostCurrent._btnordenenviar,"DateUtils",facturacion.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.menube.app.direcciones.class),"funcion",Debug.moduleToString(com.menube.app.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.menube.app.httputils2service.class),"lblDireccion",facturacion.mostCurrent._lbldireccion,"lblOpcionesProductoNombre",facturacion.mostCurrent._lblopcionesproductonombre,"lblOrdenTotalPagar",facturacion.mostCurrent._lblordentotalpagar,"lblPrecioEnvio",facturacion.mostCurrent._lblprecioenvio,"ListViewDirecciones",facturacion.mostCurrent._listviewdirecciones,"ListViewOrdenProducto",facturacion.mostCurrent._listviewordenproducto,"Main",Debug.moduleToString(com.menube.app.main.class),"PanelDireccion",facturacion.mostCurrent._paneldireccion,"PanelDireccionModal",facturacion.mostCurrent._paneldireccionmodal,"PanelOpciones",facturacion.mostCurrent._panelopciones,"PanelOpcionesBack",facturacion.mostCurrent._panelopcionesback,"PanelOrdenEnviar",facturacion.mostCurrent._panelordenenviar,"PanelOrdenProductos",facturacion.mostCurrent._panelordenproductos,"PanelOrdenProductosDetalles",facturacion.mostCurrent._panelordenproductosdetalles,"PanelOrdenTitulo",facturacion.mostCurrent._panelordentitulo,"Principal",Debug.moduleToString(com.menube.app.principal.class),"ReporteOrdenes",Debug.moduleToString(com.menube.app.reporteordenes.class),"ScrollViewOpciones",facturacion.mostCurrent._scrollviewopciones,"Starter",Debug.moduleToString(com.menube.app.starter.class),"subtotal",facturacion._subtotal,"tax",facturacion._tax,"total",facturacion._total,"txtCantidad",facturacion.mostCurrent._txtcantidad,"txtProductoComentario",facturacion.mostCurrent._txtproductocomentario};
}
}