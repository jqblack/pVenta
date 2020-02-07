
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_perfil implements IRemote{
	public static b4i_perfil mostCurrent;
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
		mostCurrent = new b4i_perfil();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_perfil");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_perfil", "com.jq.b4i_perfil");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_perfil.class);
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
		pcBA = new PCBA(this, b4i_perfil.class);
        try {
            BA.init();
            b4i_perfil_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _pageperfil = RemoteObject.declareNull("B4IPage");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _btnchangepass = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnperfilback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnsave = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _lblemail = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelencabezadouser = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _txtdir = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtnombre = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txttel = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _btnbackchangepass = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnconfirmchangepass = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _txtnewpass = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtpassantigua = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtpassconfirm = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _panelfondomodalpass = RemoteObject.declareNull("B4IPanelWrapper");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnBackChangePass",b4i_perfil._btnbackchangepass,"btnChangePass",b4i_perfil._btnchangepass,"btnConfirmChangePass",b4i_perfil._btnconfirmchangepass,"btnPerfilBack",b4i_perfil._btnperfilback,"btnSave",b4i_perfil._btnsave,"Categoria",Debug.moduleToString(b4i_categoria.class),"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_perfil._hud,"lblemail",b4i_perfil._lblemail,"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"pagePerfil",b4i_perfil._pageperfil,"PanelEncabezadoUser",b4i_perfil._panelencabezadouser,"PanelFondoModalpass",b4i_perfil._panelfondomodalpass,"Reportes",Debug.moduleToString(b4i_reportes.class),"txtdir",b4i_perfil._txtdir,"txtNewPass",b4i_perfil._txtnewpass,"txtNombre",b4i_perfil._txtnombre,"txtPassAntigua",b4i_perfil._txtpassantigua,"txtPassConfirm",b4i_perfil._txtpassconfirm,"txttel",b4i_perfil._txttel};
}
}