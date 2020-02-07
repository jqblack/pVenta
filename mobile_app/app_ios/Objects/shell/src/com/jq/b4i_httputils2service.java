
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_httputils2service implements IRemote{
	public static b4i_httputils2service mostCurrent;
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
		mostCurrent = new b4i_httputils2service();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_httputils2service");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_httputils2service", "com.jq.b4i_httputils2service");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_httputils2service.class);
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
		pcBA = new PCBA(this, b4i_httputils2service.class);
        try {
            BA.init();
            b4i_httputils2service_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _hc = RemoteObject.declareNull("B4IHttp");
public static RemoteObject _taskidtojob = RemoteObject.declareNull("B4IMap");
public static RemoteObject _tempfolder = RemoteObject.createImmutable("");
public static RemoteObject _taskcounter = RemoteObject.createImmutable(0);
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
  public Object[] GetGlobals() {
		return new Object[] {"DateUtils",b4i_httputils2service._dateutils,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"funcion",Debug.moduleToString(b4i_funcion.class),"hc",b4i_httputils2service._hc,"Main",Debug.moduleToString(b4i_main.class),"Principal",Debug.moduleToString(b4i_principal.class),"ReporteOrdenes",Debug.moduleToString(b4i_reporteordenes.class),"taskCounter",b4i_httputils2service._taskcounter,"TaskIdToJob",b4i_httputils2service._taskidtojob,"TempFolder",b4i_httputils2service._tempfolder};
}
}