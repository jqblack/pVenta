
package com.jq.pedidos;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;
import anywheresoftware.b4a.pc.B4XTypes.B4XClass;
import anywheresoftware.b4a.pc.B4XTypes.DeviceClass;

public class categoria implements IRemote{
	public static categoria mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public categoria() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("categoria"), "com.jq.pedidos.categoria");
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
		pcBA = new PCBA(this, categoria.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _listacategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _mapadetalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _listviewslidecategorias = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _btnbackslidecategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelfondoproductosbycategorias = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnbackprobycat = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelfondoslidecategorias = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelscroll = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _scrollviewprobycat = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _panelfondodetalles = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imageviewdetalles = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _lblcantidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblnombeencabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprecio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprecioencabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblcantidadproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.perfil _perfil = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",categoria.mostCurrent._activity,"btnbackprobycat",categoria.mostCurrent._btnbackprobycat,"btnBackSlideCategoria",categoria.mostCurrent._btnbackslidecategoria,"DateUtils",categoria.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.jq.pedidos.direcciones.class),"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.jq.pedidos.httputils2service.class),"ImageViewDetalles",categoria.mostCurrent._imageviewdetalles,"Label1",categoria.mostCurrent._label1,"lblcantidad",categoria.mostCurrent._lblcantidad,"lblCantidadProductos",categoria.mostCurrent._lblcantidadproductos,"lblNombeEncabezado",categoria.mostCurrent._lblnombeencabezado,"lblPrecio",categoria.mostCurrent._lblprecio,"lblPrecioEncabezado",categoria.mostCurrent._lblprecioencabezado,"listaCategoria",categoria._listacategoria,"ListViewSlideCategorias",categoria.mostCurrent._listviewslidecategorias,"Main",Debug.moduleToString(com.jq.pedidos.main.class),"mapadetalle",categoria._mapadetalle,"PanelFondoDetalles",categoria.mostCurrent._panelfondodetalles,"PanelFondoProductosbycategorias",categoria.mostCurrent._panelfondoproductosbycategorias,"PanelFondoSlideCategorias",categoria.mostCurrent._panelfondoslidecategorias,"PanelScroll",categoria.mostCurrent._panelscroll,"Perfil",Debug.moduleToString(com.jq.pedidos.perfil.class),"Principal",Debug.moduleToString(com.jq.pedidos.principal.class),"ReporteOrdenes",Debug.moduleToString(com.jq.pedidos.reporteordenes.class),"ScrollViewProByCat",categoria.mostCurrent._scrollviewprobycat,"Starter",Debug.moduleToString(com.jq.pedidos.starter.class)};
}
}