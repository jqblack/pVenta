
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_login implements IRemote{
	public static b4i_login mostCurrent;
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
		mostCurrent = new b4i_login();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_login");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_login", "com.jq.b4i_login");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_login.class);
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
		pcBA = new PCBA(this, b4i_login.class);
        try {
            BA.init();
            b4i_login_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _btnconfiguracion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnlogin = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelconfiguracion = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _toast = RemoteObject.declareNull("iHUD");
public static RemoteObject _page = RemoteObject.declareNull("B4IPage");
public static RemoteObject _correro = RemoteObject.createImmutable("");
public static RemoteObject _pagereg = RemoteObject.declareNull("B4IPage");
public static RemoteObject _sql = RemoteObject.declareNull("B4ISQL");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _width = RemoteObject.createImmutable(0);
public static RemoteObject _smclog = RemoteObject.declareNull("B4ISideMenuController");
public static RemoteObject _btnmenuprincipal = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _txtusuario = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtcontrasena = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _app = RemoteObject.declareNull("B4IApplicationWrapper");
public static RemoteObject _lblregistrarme = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnregistroclienteback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnregistroclienteregistrarme = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _txtcontrasena2 = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtcontrasenaregistro = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txttelefono = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtusuarioregistro = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txturl = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _btniniciarsecion = RemoteObject.declareNull("B4IButtonWrapper");
public static b4i_main _main = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"App",b4i_login._app,"btnConfiguracion",b4i_login._btnconfiguracion,"btnIniciarSecion",b4i_login._btniniciarsecion,"btnLogin",b4i_login._btnlogin,"btnMenuPrincipal",b4i_login._btnmenuprincipal,"btnRegistroClienteBack",b4i_login._btnregistroclienteback,"btnRegistroClienteRegistrarme",b4i_login._btnregistroclienteregistrarme,"Categoria",Debug.moduleToString(b4i_categoria.class),"correro",b4i_login._correro,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_login._hud,"lblRegistrarme",b4i_login._lblregistrarme,"Main",Debug.moduleToString(b4i_main.class),"page",b4i_login._page,"pageReg",b4i_login._pagereg,"Panel1",b4i_login._panel1,"PanelConfiguracion",b4i_login._panelconfiguracion,"Perfil",Debug.moduleToString(b4i_perfil.class),"Reportes",Debug.moduleToString(b4i_reportes.class),"smcLog",b4i_login._smclog,"SQL",b4i_login._sql,"toast",b4i_login._toast,"txtContrasena",b4i_login._txtcontrasena,"txtContrasena2",b4i_login._txtcontrasena2,"txtContrasenaRegistro",b4i_login._txtcontrasenaregistro,"txtDireccion",b4i_login._txtdireccion,"txtNombre",b4i_login._txtnombre,"txtTelefono",b4i_login._txttelefono,"txtURL",b4i_login._txturl,"txtUsuario",b4i_login._txtusuario,"txtUsuarioRegistro",b4i_login._txtusuarioregistro,"width",b4i_login._width};
}
}