
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

public class funcion implements IRemote{
	public static funcion mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public funcion() {
		mostCurrent = this;
	}
    public RemoteObject getRemoteMe() {
        return remoteMe;    
    }
    
public boolean isSingleton() {
		return true;
	}
     private static PCBA pcBA = new PCBA(null, funcion.class);
    static {
		mostCurrent = new funcion();
        remoteMe = RemoteObject.declareNull("com.menube.app.funcion");
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("funcion"), "com.menube.app.funcion");
        RDebug.INSTANCE.eventTargets.put(new DeviceClass("com.menube.app.funcion"), new java.lang.ref.WeakReference<PCBA> (pcBA));
	}
   
	public static RemoteObject runMethod(boolean notUsed, String method, Object... args) throws Exception{
		return (RemoteObject) pcBA.raiseEvent(method.substring(1), args);
	}
    public static void runVoidMethod(String method, Object... args) throws Exception{
		runMethod(false, method, args);
	}
	public PCBA create(Object[] args) throws ClassNotFoundException{
        throw new RuntimeException("CREATE is not supported.");
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.menube.app.main _main = null;
public static com.menube.app.starter _starter = null;
public static com.menube.app.principal _principal = null;
public static com.menube.app.facturacion _facturacion = null;
public static com.menube.app.direcciones _direcciones = null;
public static com.menube.app.reporteordenes _reporteordenes = null;
public static com.menube.app.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"DateUtils",funcion.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.menube.app.direcciones.class),"Facturacion",Debug.moduleToString(com.menube.app.facturacion.class),"HttpUtils2Service",Debug.moduleToString(com.menube.app.httputils2service.class),"Main",Debug.moduleToString(com.menube.app.main.class),"Principal",Debug.moduleToString(com.menube.app.principal.class),"ReporteOrdenes",Debug.moduleToString(com.menube.app.reporteordenes.class),"Starter",Debug.moduleToString(com.menube.app.starter.class)};
}
}