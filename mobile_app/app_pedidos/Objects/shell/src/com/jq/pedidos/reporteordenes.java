
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

public class reporteordenes implements IRemote{
	public static reporteordenes mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public reporteordenes() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("reporteordenes"), "com.jq.pedidos.reporteordenes");
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
		pcBA = new PCBA(this, reporteordenes.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _numorden = RemoteObject.createImmutable("");
public static RemoteObject _listaaddall = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listaux = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _btnbuscarreporte = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnreporteback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _chordenesabiertas = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _date = RemoteObject.declareNull("com.jq.pedidos.anotherdatepicker");
public static RemoteObject _listviewordenes = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _panelfondoordedetalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbltituloproorden = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _listproordendetalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _btnbackproorden = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnaddallproorden = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelordenes = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _date2 = RemoteObject.declareNull("com.jq.pedidos.anotherdatepicker");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.perfil _perfil = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",reporteordenes.mostCurrent._activity,"btnAddAllproOrden",reporteordenes.mostCurrent._btnaddallproorden,"btnbackProOrden",reporteordenes.mostCurrent._btnbackproorden,"btnBuscarReporte",reporteordenes.mostCurrent._btnbuscarreporte,"btnReporteBack",reporteordenes.mostCurrent._btnreporteback,"Categoria",Debug.moduleToString(com.jq.pedidos.categoria.class),"chOrdenesAbiertas",reporteordenes.mostCurrent._chordenesabiertas,"date",reporteordenes.mostCurrent._date,"date2",reporteordenes.mostCurrent._date2,"DateUtils",reporteordenes.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.jq.pedidos.direcciones.class),"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.jq.pedidos.httputils2service.class),"Label3",reporteordenes.mostCurrent._label3,"lbltituloProOrden",reporteordenes.mostCurrent._lbltituloproorden,"listaAddAll",reporteordenes._listaaddall,"listAux",reporteordenes._listaux,"ListProOrdenDetalle",reporteordenes.mostCurrent._listproordendetalle,"ListViewOrdenes",reporteordenes.mostCurrent._listviewordenes,"Main",Debug.moduleToString(com.jq.pedidos.main.class),"numOrden",reporteordenes._numorden,"PanelFondoOrdeDetalle",reporteordenes.mostCurrent._panelfondoordedetalle,"PanelOrdenes",reporteordenes.mostCurrent._panelordenes,"Perfil",Debug.moduleToString(com.jq.pedidos.perfil.class),"Principal",Debug.moduleToString(com.jq.pedidos.principal.class),"Starter",Debug.moduleToString(com.jq.pedidos.starter.class)};
}
}