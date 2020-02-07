
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
public static RemoteObject _mapadir = RemoteObject.declareNull("B4IMap");
public static RemoteObject _actualizar = RemoteObject.createImmutable(false);
public static RemoteObject _toped = RemoteObject.createImmutable(0);
public static RemoteObject _topedlbl = RemoteObject.createImmutable(0);
public static RemoteObject _estados = RemoteObject.declareNull("B4IList");
public static RemoteObject _actu = RemoteObject.createImmutable(false);
public static RemoteObject _update = RemoteObject.createImmutable(0);
public static RemoteObject _indexcombo = RemoteObject.createImmutable(0);
public static RemoteObject _edition = RemoteObject.createImmutable(false);
public static RemoteObject _reload = RemoteObject.createImmutable(false);
public static RemoteObject _mapaedit = RemoteObject.declareNull("B4IMap");
public static RemoteObject _topmarco = RemoteObject.createImmutable(0);
public static RemoteObject _toplbladres2 = RemoteObject.createImmutable(0);
public static RemoteObject _topadres = RemoteObject.createImmutable(0);
public static RemoteObject _toplbl6 = RemoteObject.createImmutable(0);
public static RemoteObject _toptxtcity = RemoteObject.createImmutable(0);
public static RemoteObject _toplbl7 = RemoteObject.createImmutable(0);
public static RemoteObject _topbtnstate = RemoteObject.createImmutable(0);
public static RemoteObject _toplblzip = RemoteObject.createImmutable(0);
public static RemoteObject _toptxtzip = RemoteObject.createImmutable(0);
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _pagedirecciones = RemoteObject.declareNull("B4IPage");
public static RemoteObject _panel2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _listadirecciones = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _lbldir = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblfecha = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblprincipal = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btndireccionback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnsalvardireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _chprincipal = RemoteObject.declareNull("B4ISwitchWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _label2 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _panelencabezadodir2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel2v2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _adddireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _borrardireccion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _listadirecciones2 = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _btndireccionback2 = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnstate = RemoteObject.declareNull("b4i_b4xcombobox");
public static RemoteObject _panelfondodireccionesusa = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btnbackusa = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _txtaddress1 = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _txtaddress2 = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _txtcity = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _btnagregardireccionfinal = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _txtzipcode = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _btndeleteusa = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelmarcodirrd = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelfondodireccionesrd = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btnprovinciacombo = RemoteObject.declareNull("b4i_b4xcombobox");
public static RemoteObject _btnbackrd = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelencabezadord = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _txtdirerd = RemoteObject.declareNull("B4ITextViewWrapper");
public static RemoteObject _txtsector = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _txtzipcoderd = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _btnagregardirrd = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _chprincipalrd = RemoteObject.declareNull("B4ISwitchWrapper");
public static RemoteObject _panelencabezadousa = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btndeleterd = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelcombousa = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _label8 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelzipcode = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelfondonombredir = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _label16 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _txtnombredireccion = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _btnaceptarnombredir = RemoteObject.declareNull("B4IButtonWrapper");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"actu",b4i_direcciones._actu,"actualizar",b4i_direcciones._actualizar,"AddDireccion",b4i_direcciones._adddireccion,"BorrarDireccion",b4i_direcciones._borrardireccion,"btnAceptarNombreDir",b4i_direcciones._btnaceptarnombredir,"BtnAgregarDireccionFinal",b4i_direcciones._btnagregardireccionfinal,"btnAgregarDirRD",b4i_direcciones._btnagregardirrd,"btnBackRd",b4i_direcciones._btnbackrd,"btnBackUsa",b4i_direcciones._btnbackusa,"btnDeleteRD",b4i_direcciones._btndeleterd,"btnDeleteUsa",b4i_direcciones._btndeleteusa,"btnDireccionBack",b4i_direcciones._btndireccionback,"btnDireccionBack2",b4i_direcciones._btndireccionback2,"btnProvinciaCombo",b4i_direcciones._btnprovinciacombo,"btnSalvarDireccion",b4i_direcciones._btnsalvardireccion,"btnState",b4i_direcciones._btnstate,"Categoria",Debug.moduleToString(b4i_categoria.class),"chPrincipal",b4i_direcciones._chprincipal,"chPrincipalRD",b4i_direcciones._chprincipalrd,"edition",b4i_direcciones._edition,"estados",b4i_direcciones._estados,"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_direcciones._hud,"indexCombo",b4i_direcciones._indexcombo,"Label16",b4i_direcciones._label16,"Label2",b4i_direcciones._label2,"Label3",b4i_direcciones._label3,"Label5",b4i_direcciones._label5,"Label6",b4i_direcciones._label6,"Label7",b4i_direcciones._label7,"Label8",b4i_direcciones._label8,"lblDir",b4i_direcciones._lbldir,"lblFecha",b4i_direcciones._lblfecha,"lblPrincipal",b4i_direcciones._lblprincipal,"ListaDirecciones",b4i_direcciones._listadirecciones,"ListaDirecciones2",b4i_direcciones._listadirecciones2,"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"mapadir",b4i_direcciones._mapadir,"mapaEdit",b4i_direcciones._mapaedit,"pageDirecciones",b4i_direcciones._pagedirecciones,"Panel2",b4i_direcciones._panel2,"Panel2V2",b4i_direcciones._panel2v2,"PanelComboUSA",b4i_direcciones._panelcombousa,"PanelEncabezadoDir2",b4i_direcciones._panelencabezadodir2,"PanelEncabezadoRD",b4i_direcciones._panelencabezadord,"PanelEncabezadoUsa",b4i_direcciones._panelencabezadousa,"PanelFondoDireccionesRD",b4i_direcciones._panelfondodireccionesrd,"PanelFondoDireccionesUSA",b4i_direcciones._panelfondodireccionesusa,"PanelFondoNombreDir",b4i_direcciones._panelfondonombredir,"PanelMarcoDirRD",b4i_direcciones._panelmarcodirrd,"panelZipCode",b4i_direcciones._panelzipcode,"Perfil",Debug.moduleToString(b4i_perfil.class),"reload",b4i_direcciones._reload,"Reportes",Debug.moduleToString(b4i_reportes.class),"topadres",b4i_direcciones._topadres,"topbtnstate",b4i_direcciones._topbtnstate,"toped",b4i_direcciones._toped,"topedLbl",b4i_direcciones._topedlbl,"toplbl6",b4i_direcciones._toplbl6,"toplbl7",b4i_direcciones._toplbl7,"toplblAdres2",b4i_direcciones._toplbladres2,"TOPlblZip",b4i_direcciones._toplblzip,"topMarco",b4i_direcciones._topmarco,"toptxtCity",b4i_direcciones._toptxtcity,"TOPtxtZip",b4i_direcciones._toptxtzip,"txtAddress1",b4i_direcciones._txtaddress1,"txtAddress2",b4i_direcciones._txtaddress2,"txtCity",b4i_direcciones._txtcity,"txtDireccion",b4i_direcciones._txtdireccion,"txtDireRD",b4i_direcciones._txtdirerd,"txtNombreDireccion",b4i_direcciones._txtnombredireccion,"txtSector",b4i_direcciones._txtsector,"txtZipCode",b4i_direcciones._txtzipcode,"txtZipCodeRD",b4i_direcciones._txtzipcoderd,"update",b4i_direcciones._update};
}
}