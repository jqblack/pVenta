
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

public class httputils2service implements IRemote{
	public static httputils2service mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public httputils2service() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
    static {
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("httputils2service"), "com.jq.pedidos.httputils2service");
	}
     public static RemoteObject getObject() {
		return myClass;
	 }
	public RemoteObject _service;
    private PCBA pcBA;

	public PCBA create(Object[] args) throws ClassNotFoundException{
		processBA = (RemoteObject) args[1];
        _service = (RemoteObject) args[2];
        remoteMe = RemoteObject.declareNull("com.jq.pedidos.httputils2service");
        anywheresoftware.b4a.keywords.Common.Density = (Float)args[3];
		pcBA = new PCBA(this, httputils2service.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _hc = RemoteObject.declareNull("anywheresoftware.b4h.okhttp.OkHttpClientWrapper");
public static RemoteObject _taskidtojob = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _taskcounter = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.perfil _perfil = null;
  public Object[] GetGlobals() {
		return new Object[] {"Categoria",Debug.moduleToString(com.jq.pedidos.categoria.class),"DateUtils",httputils2service.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.jq.pedidos.direcciones.class),"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"hc",httputils2service._hc,"Main",Debug.moduleToString(com.jq.pedidos.main.class),"Perfil",Debug.moduleToString(com.jq.pedidos.perfil.class),"Principal",Debug.moduleToString(com.jq.pedidos.principal.class),"ReporteOrdenes",Debug.moduleToString(com.jq.pedidos.reporteordenes.class),"Service",httputils2service.mostCurrent._service,"Starter",Debug.moduleToString(com.jq.pedidos.starter.class),"taskCounter",httputils2service._taskcounter,"TaskIdToJob",httputils2service._taskidtojob,"TempFolder",httputils2service._tempfolder};
}
}