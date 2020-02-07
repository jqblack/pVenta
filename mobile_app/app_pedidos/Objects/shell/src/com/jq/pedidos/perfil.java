
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

public class perfil implements IRemote{
	public static perfil mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public perfil() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("perfil"), "com.jq.pedidos.perfil");
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
		pcBA = new PCBA(this, perfil.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _txtdir = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttel = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblemail = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btndireccionback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnchangepass = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelfondomodalpass = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelfondouser = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnbackchangepass = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnconfirmchangepass = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _txtnewpass = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpassantigua = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtpassconfirm = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnsave = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",perfil.mostCurrent._activity,"btnBackChangePass",perfil.mostCurrent._btnbackchangepass,"btnChangePass",perfil.mostCurrent._btnchangepass,"btnConfirmChangePass",perfil.mostCurrent._btnconfirmchangepass,"btnDireccionBack",perfil.mostCurrent._btndireccionback,"btnSave",perfil.mostCurrent._btnsave,"Categoria",Debug.moduleToString(com.jq.pedidos.categoria.class),"DateUtils",perfil.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.jq.pedidos.direcciones.class),"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.jq.pedidos.httputils2service.class),"lblemail",perfil.mostCurrent._lblemail,"Main",Debug.moduleToString(com.jq.pedidos.main.class),"PanelFondoModalpass",perfil.mostCurrent._panelfondomodalpass,"PanelFondoUser",perfil.mostCurrent._panelfondouser,"Principal",Debug.moduleToString(com.jq.pedidos.principal.class),"ReporteOrdenes",Debug.moduleToString(com.jq.pedidos.reporteordenes.class),"Starter",Debug.moduleToString(com.jq.pedidos.starter.class),"txtdir",perfil.mostCurrent._txtdir,"txtNewPass",perfil.mostCurrent._txtnewpass,"txtNombre",perfil.mostCurrent._txtnombre,"txtPassAntigua",perfil.mostCurrent._txtpassantigua,"txtPassConfirm",perfil.mostCurrent._txtpassconfirm,"txttel",perfil.mostCurrent._txttel};
}
}