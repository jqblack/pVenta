
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("direcciones"), "com.jq.pedidos.direcciones");
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
public static RemoteObject _mapadir = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _actualizar = RemoteObject.createImmutable(false);
public static RemoteObject _btndireccionback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnnuevadireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnsalvardireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listviewdirecciones = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _paneldireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtdireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _chprincipal = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _btnaceptarnombredir = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _label16 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _txtnombredireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnagregardirrd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbackrd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndeleterd = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnprovinciacombo = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _chprincipalrd = RemoteObject.declareNull("anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper");
public static RemoteObject _txtdirerd = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtsector = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtzipcoderd = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnagregardireccionfinal = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbackusa = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btndeleteusa = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnstate = RemoteObject.declareNull("anywheresoftware.b4a.objects.SpinnerWrapper");
public static RemoteObject _txtaddress1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtaddress2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtcity = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _txtzipcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _panelfondodireccionesusa = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelfondonombredir = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _actu = RemoteObject.createImmutable(false);
public static RemoteObject _mapaedit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _edition = RemoteObject.createImmutable(false);
public static RemoteObject _update = RemoteObject.createImmutable(0);
public static RemoteObject _reload = RemoteObject.createImmutable(false);
public static RemoteObject _estados = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _indexcombo = RemoteObject.createImmutable(0);
public static RemoteObject _ime = RemoteObject.declareNull("anywheresoftware.b4a.objects.IME");
public static RemoteObject _panelfondodireccionesrd = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _adddireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelcombousa = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label5 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label6 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _label7 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelzipcode = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _tlbl6 = RemoteObject.createImmutable(0);
public static RemoteObject _tpanel3 = RemoteObject.createImmutable(0);
public static RemoteObject _tlbl7 = RemoteObject.createImmutable(0);
public static RemoteObject _tpanelcombousa = RemoteObject.createImmutable(0);
public static RemoteObject _tlbl8 = RemoteObject.createImmutable(0);
public static RemoteObject _tpanelzip = RemoteObject.createImmutable(0);
public static RemoteObject _tpanelmarco = RemoteObject.createImmutable(0);
public static RemoteObject _label8 = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelmarcodirrd = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmarconombredir = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.principal _principal = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.perfil _perfil = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",direcciones.mostCurrent._activity,"actu",direcciones._actu,"actualizar",direcciones._actualizar,"AddDireccion",direcciones.mostCurrent._adddireccion,"btnAceptarNombreDir",direcciones.mostCurrent._btnaceptarnombredir,"BtnAgregarDireccionFinal",direcciones.mostCurrent._btnagregardireccionfinal,"btnAgregarDirRD",direcciones.mostCurrent._btnagregardirrd,"btnBackRd",direcciones.mostCurrent._btnbackrd,"btnBackUsa",direcciones.mostCurrent._btnbackusa,"btnDeleteRD",direcciones.mostCurrent._btndeleterd,"btnDeleteUsa",direcciones.mostCurrent._btndeleteusa,"btnDireccionBack",direcciones.mostCurrent._btndireccionback,"btnNuevaDireccion",direcciones.mostCurrent._btnnuevadireccion,"btnProvinciaCombo",direcciones.mostCurrent._btnprovinciacombo,"btnSalvarDireccion",direcciones.mostCurrent._btnsalvardireccion,"btnState",direcciones.mostCurrent._btnstate,"Categoria",Debug.moduleToString(com.jq.pedidos.categoria.class),"chPrincipal",direcciones.mostCurrent._chprincipal,"chPrincipalRD",direcciones.mostCurrent._chprincipalrd,"DateUtils",direcciones.mostCurrent._dateutils,"edition",direcciones._edition,"estados",direcciones.mostCurrent._estados,"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"HttpUtils2Service",Debug.moduleToString(com.jq.pedidos.httputils2service.class),"IME",direcciones.mostCurrent._ime,"indexCombo",direcciones._indexcombo,"Label16",direcciones.mostCurrent._label16,"Label3",direcciones.mostCurrent._label3,"Label5",direcciones.mostCurrent._label5,"Label6",direcciones.mostCurrent._label6,"Label7",direcciones.mostCurrent._label7,"Label8",direcciones.mostCurrent._label8,"ListViewDirecciones",direcciones.mostCurrent._listviewdirecciones,"Main",Debug.moduleToString(com.jq.pedidos.main.class),"mapadir",direcciones._mapadir,"mapaEdit",direcciones.mostCurrent._mapaedit,"Panel1",direcciones.mostCurrent._panel1,"Panel2",direcciones.mostCurrent._panel2,"Panel3",direcciones.mostCurrent._panel3,"PanelComboUSA",direcciones.mostCurrent._panelcombousa,"PanelDireccion",direcciones.mostCurrent._paneldireccion,"PanelFondoDireccionesRD",direcciones.mostCurrent._panelfondodireccionesrd,"PanelFondoDireccionesUSA",direcciones.mostCurrent._panelfondodireccionesusa,"PanelFondoNombreDir",direcciones.mostCurrent._panelfondonombredir,"PanelMarcoDirRD",direcciones.mostCurrent._panelmarcodirrd,"PanelMarcoNombredir",direcciones.mostCurrent._panelmarconombredir,"panelZipCode",direcciones.mostCurrent._panelzipcode,"Perfil",Debug.moduleToString(com.jq.pedidos.perfil.class),"Principal",Debug.moduleToString(com.jq.pedidos.principal.class),"reload",direcciones._reload,"ReporteOrdenes",Debug.moduleToString(com.jq.pedidos.reporteordenes.class),"Starter",Debug.moduleToString(com.jq.pedidos.starter.class),"tlbl6",direcciones._tlbl6,"tlbl7",direcciones._tlbl7,"tlbl8",direcciones._tlbl8,"tpanel3",direcciones._tpanel3,"tpanelcomboUsa",direcciones._tpanelcombousa,"tpanelMarco",direcciones._tpanelmarco,"tpanelZip",direcciones._tpanelzip,"txtAddress1",direcciones.mostCurrent._txtaddress1,"txtAddress2",direcciones.mostCurrent._txtaddress2,"txtCity",direcciones.mostCurrent._txtcity,"txtDireccion",direcciones.mostCurrent._txtdireccion,"txtDireRD",direcciones.mostCurrent._txtdirerd,"txtNombreDireccion",direcciones.mostCurrent._txtnombredireccion,"txtSector",direcciones.mostCurrent._txtsector,"txtZipCode",direcciones.mostCurrent._txtzipcode,"txtZipCodeRD",direcciones.mostCurrent._txtzipcoderd,"update",direcciones._update};
}
}