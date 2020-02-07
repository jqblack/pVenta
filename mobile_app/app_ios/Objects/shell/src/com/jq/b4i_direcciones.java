
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_direcciones implements IRemote{
	public static b4i_direcciones mostCurrent;
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
		mostCurrent = new b4i_direcciones();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_direcciones");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_direcciones", "com.jq.b4i_direcciones");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_direcciones.class);
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
		pcBA = new PCBA(this, b4i_direcciones.class);
        try {
            BA.init();
            b4i_direcciones_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _page = RemoteObject.declareNull("B4IPage");
public static RemoteObject _btnnuevadireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnsalvardireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _chprincipal = RemoteObject.declareNull("B4ISwitchWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _listviewdirecciones = RemoteObject.declareNull("B4ITableView");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_main _main = null;
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnNuevaDireccion",b4i_direcciones._btnnuevadireccion,"btnSalvarDireccion",b4i_direcciones._btnsalvardireccion,"chPrincipal",b4i_direcciones._chprincipal,"DateUtils",b4i_direcciones._dateutils,"Facturacion",Debug.moduleToString(b4i_facturacion.class),"funcion",Debug.moduleToString(b4i_funcion.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"ListViewDirecciones",b4i_direcciones._listviewdirecciones,"Main",Debug.moduleToString(b4i_main.class),"page",b4i_direcciones._page,"Panel2",b4i_direcciones._panel2,"Principal",Debug.moduleToString(b4i_principal.class),"ReporteOrdenes",Debug.moduleToString(b4i_reporteordenes.class),"txtDireccion",b4i_direcciones._txtdireccion};
}
}