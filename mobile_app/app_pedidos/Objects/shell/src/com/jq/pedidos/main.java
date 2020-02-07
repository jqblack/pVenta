
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("main"), "com.jq.pedidos.main");
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
public static RemoteObject _usersdata = RemoteObject.declareNull("com.jq.pedidos.main._typeu");
public static RemoteObject _sql = RemoteObject.declareNull("anywheresoftware.b4a.sql.SQL");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _logged = RemoteObject.createImmutable(false);
public static RemoteObject _tokenpublico = RemoteObject.createImmutable("");
public static RemoteObject _imei = RemoteObject.createImmutable("");
public static RemoteObject _mostar = RemoteObject.createImmutable(false);
public static RemoteObject _cargaragain = RemoteObject.createImmutable(false);
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
public static RemoteObject _btnmenuprincipal = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btniniciarsecion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.perfil _perfil = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",main.mostCurrent._activity,"btnConfiguracion",main.mostCurrent._btnconfiguracion,"btnIniciarSecion",main.mostCurrent._btniniciarsecion,"btnLogin",main.mostCurrent._btnlogin,"btnMenuPrincipal",main.mostCurrent._btnmenuprincipal,"btnRegistroClienteBack",main.mostCurrent._btnregistroclienteback,"btnRegistroClienteRegistrarme",main.mostCurrent._btnregistroclienteregistrarme,"cargaragain",main._cargaragain,"Categoria",Debug.moduleToString(com.jq.pedidos.categoria.class),"DateUtils",main.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.jq.pedidos.direcciones.class),"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.jq.pedidos.httputils2service.class),"imei",main._imei,"jobMsj",main._jobmsj,"jobMsjTitle",main._jobmsjtitle,"Label3",main.mostCurrent._label3,"lblRegistrarme",main.mostCurrent._lblregistrarme,"logged",main._logged,"mostar",main._mostar,"P",main.mostCurrent._p,"Panel1",main.mostCurrent._panel1,"Panel2",main.mostCurrent._panel2,"PanelConfiguracion",main.mostCurrent._panelconfiguracion,"PanelLogin",main.mostCurrent._panellogin,"PanelRegistroCliente",main.mostCurrent._panelregistrocliente,"Perfil",Debug.moduleToString(com.jq.pedidos.perfil.class),"PI",main.mostCurrent._pi,"Principal",Debug.moduleToString(com.jq.pedidos.principal.class),"ReporteOrdenes",Debug.moduleToString(com.jq.pedidos.reporteordenes.class),"SQL",main._sql,"Starter",Debug.moduleToString(com.jq.pedidos.starter.class),"token",main._token,"tokenPublico",main._tokenpublico,"txtContrasena",main.mostCurrent._txtcontrasena,"txtContrasena2",main.mostCurrent._txtcontrasena2,"txtContrasenaRegistro",main.mostCurrent._txtcontrasenaregistro,"txtDireccion",main.mostCurrent._txtdireccion,"txtNombre",main.mostCurrent._txtnombre,"txtTelefono",main.mostCurrent._txttelefono,"txtURL",main.mostCurrent._txturl,"txtUsuario",main.mostCurrent._txtusuario,"txtUsuarioRegistro",main.mostCurrent._txtusuarioregistro,"url",main._url,"usersData",main._usersdata,"ViewLogo",main.mostCurrent._viewlogo};
}
}