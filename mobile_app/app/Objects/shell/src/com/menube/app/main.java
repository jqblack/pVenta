
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

public class main implements IRemote{
	public static main mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public main() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.menube.app.main");
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
		pcBA = new PCBA(this, main.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _token = RemoteObject.createImmutable("");
public static RemoteObject _jobmsj = RemoteObject.createImmutable("");
public static RemoteObject _jobmsjtitle = RemoteObject.createImmutable("");
public static RemoteObject _usersdata = RemoteObject.declareNull("com.menube.app.main._typeu");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _panellogin = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtcontrasena = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txtusuario = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _viewlogo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _p = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone");
public static RemoteObject _pi = RemoteObject.declareNull("anywheresoftware.b4a.phone.Phone.PhoneId");
public static RemoteObject _btnregistroclienteback = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _btnregistroclienteregistrarme = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _panelregistrocliente = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtcontrasena2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txttelefono = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtusuarioregistro = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtcontrasenaregistro = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _lblregistrarme = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnconfiguracion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _txturl = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelconfiguracion = RemoteObject.declareNull("anywheresoftware.b4a.objects.B4XViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.menube.app.starter _starter = null;
public static com.menube.app.principal _principal = null;
public static com.menube.app.funcion _funcion = null;
public static com.menube.app.facturacion _facturacion = null;
public static com.menube.app.direcciones _direcciones = null;
public static com.menube.app.reporteordenes _reporteordenes = null;
public static com.menube.app.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"btnConfiguracion",main.mostCurrent._btnconfiguracion,"btnLogin",main.mostCurrent._btnlogin,"btnRegistroClienteBack",main.mostCurrent._btnregistroclienteback,"btnRegistroClienteRegistrarme",main.mostCurrent._btnregistroclienteregistrarme,"DateUtils",main.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.menube.app.direcciones.class),"Facturacion",Debug.moduleToString(com.menube.app.facturacion.class),"funcion",Debug.moduleToString(com.menube.app.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.menube.app.httputils2service.class),"jobMsj",main._jobmsj,"jobMsjTitle",main._jobmsjtitle,"Label3",main.mostCurrent._label3,"lblRegistrarme",main.mostCurrent._lblregistrarme,"P",main.mostCurrent._p,"Panel1",main.mostCurrent._panel1,"Panel2",main.mostCurrent._panel2,"PanelConfiguracion",main.mostCurrent._panelconfiguracion,"PanelLogin",main.mostCurrent._panellogin,"PanelRegistroCliente",main.mostCurrent._panelregistrocliente,"PI",main.mostCurrent._pi,"Principal",Debug.moduleToString(com.menube.app.principal.class),"ReporteOrdenes",Debug.moduleToString(com.menube.app.reporteordenes.class),"SQL",main._sql,"Starter",Debug.moduleToString(com.menube.app.starter.class),"token",main._token,"txtContrasena",main.mostCurrent._txtcontrasena,"txtContrasena2",main.mostCurrent._txtcontrasena2,"txtContrasenaRegistro",main.mostCurrent._txtcontrasenaregistro,"txtDireccion",main.mostCurrent._txtdireccion,"txtNombre",main.mostCurrent._txtnombre,"txtTelefono",main.mostCurrent._txttelefono,"txtURL",main.mostCurrent._txturl,"txtUsuario",main.mostCurrent._txtusuario,"txtUsuarioRegistro",main.mostCurrent._txtusuarioregistro,"url",main._url,"usersData",main._usersdata,"ViewLogo",main.mostCurrent._viewlogo};
}
}