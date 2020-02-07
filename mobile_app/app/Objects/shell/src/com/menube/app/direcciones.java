
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

public class direcciones implements IRemote{
	public static direcciones mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public direcciones() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("direcciones"), "com.menube.app.direcciones");
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
		pcBA = new PCBA(this, direcciones.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _btndireccionback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnnuevadireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnsalvardireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listviewdirecciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _paneldireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _chprincipal = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.menube.app.main _main = null;
public static com.menube.app.starter _starter = null;
public static com.menube.app.principal _principal = null;
public static com.menube.app.funcion _funcion = null;
public static com.menube.app.facturacion _facturacion = null;
public static com.menube.app.reporteordenes _reporteordenes = null;
public static com.menube.app.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",direcciones.mostCurrent._activity,"btnDireccionBack",direcciones.mostCurrent._btndireccionback,"btnNuevaDireccion",direcciones.mostCurrent._btnnuevadireccion,"btnSalvarDireccion",direcciones.mostCurrent._btnsalvardireccion,"chPrincipal",direcciones.mostCurrent._chprincipal,"DateUtils",direcciones.mostCurrent._dateutils,"Facturacion",Debug.moduleToString(com.menube.app.facturacion.class),"funcion",Debug.moduleToString(com.menube.app.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.menube.app.httputils2service.class),"ListViewDirecciones",direcciones.mostCurrent._listviewdirecciones,"Main",Debug.moduleToString(com.menube.app.main.class),"PanelDireccion",direcciones.mostCurrent._paneldireccion,"Principal",Debug.moduleToString(com.menube.app.principal.class),"ReporteOrdenes",Debug.moduleToString(com.menube.app.reporteordenes.class),"Starter",Debug.moduleToString(com.menube.app.starter.class),"txtDireccion",direcciones.mostCurrent._txtdireccion};
}
}