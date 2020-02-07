
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_main implements IRemote{
	public static b4i_main mostCurrent;
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
		mostCurrent = new b4i_main();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_main");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_main", "com.jq.b4i_main");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_main.class);
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
		pcBA = new PCBA(this, b4i_main.class);
        try {
            BA.init();
            b4i_main_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _app = RemoteObject.declareNull("B4IApplicationWrapper");
public static RemoteObject _navcontrol = RemoteObject.declareNull("B4INavigationControllerWrapper");
public static RemoteObject _page1 = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pageregistro = RemoteObject.declareNull("B4IPage");
public static RemoteObject _label3 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _lblregistrarme = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _txtcontrasena = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtusuario = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txturl = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _token = RemoteObject.createImmutable("");
public static RemoteObject _tokenpublico = RemoteObject.createImmutable("");
public static RemoteObject _isloggedin = RemoteObject.createImmutable(false);
public static RemoteObject _jobmsj = RemoteObject.createImmutable("");
public static RemoteObject _jobmsjtitle = RemoteObject.createImmutable("");
public static RemoteObject _usersdata = RemoteObject.declareNull("_typeu");
public static RemoteObject _sql = RemoteObject.declareNull("B4ISQL");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _btnregistroclienteregistrarme = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _txtcontrasena2 = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtcontrasenaregistro = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txttelefono = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtusuarioregistro = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4i_dateutils");
public static b4i_principal _principal = null;
public static b4i_funcion _funcion = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_reporteordenes _reporteordenes = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"App",b4i_main._app,"btnLogin",b4i_main._btnlogin,"btnRegistroClienteRegistrarme",b4i_main._btnregistroclienteregistrarme,"DateUtils",b4i_main._dateutils,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"funcion",Debug.moduleToString(b4i_funcion.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_main._hud,"isLoggedIn",b4i_main._isloggedin,"jobMsj",b4i_main._jobmsj,"jobMsjTitle",b4i_main._jobmsjtitle,"Label3",b4i_main._label3,"lblRegistrarme",b4i_main._lblregistrarme,"NavControl",b4i_main._navcontrol,"Page1",b4i_main._page1,"PageRegistro",b4i_main._pageregistro,"Principal",Debug.moduleToString(b4i_principal.class),"ReporteOrdenes",Debug.moduleToString(b4i_reporteordenes.class),"SQL",b4i_main._sql,"token",b4i_main._token,"tokenPublico",b4i_main._tokenpublico,"txtContrasena",b4i_main._txtcontrasena,"txtContrasena2",b4i_main._txtcontrasena2,"txtContrasenaRegistro",b4i_main._txtcontrasenaregistro,"txtDireccion",b4i_main._txtdireccion,"txtNombre",b4i_main._txtnombre,"txtTelefono",b4i_main._txttelefono,"txtURL",b4i_main._txturl,"txtUsuario",b4i_main._txtusuario,"txtUsuarioRegistro",b4i_main._txtusuarioregistro,"url",b4i_main._url,"usersData",b4i_main._usersdata};
}
}