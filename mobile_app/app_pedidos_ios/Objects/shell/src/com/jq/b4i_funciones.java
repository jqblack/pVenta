
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_funciones implements IRemote{
	public static b4i_funciones mostCurrent;
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
		mostCurrent = new b4i_funciones();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_funciones");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_funciones", "com.jq.b4i_funciones");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_funciones.class);
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
		pcBA = new PCBA(this, b4i_funciones.class);
        try {
            BA.init();
            b4i_funciones_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Categoria",Debug.moduleToString(b4i_categoria.class),"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"Perfil",Debug.moduleToString(b4i_perfil.class),"Reportes",Debug.moduleToString(b4i_reportes.class)};
}
}