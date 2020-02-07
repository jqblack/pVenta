
package com.jq;

import java.io.IOException;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RDebug;
import anywheresoftware.b4a.pc.RemoteObject;
import anywheresoftware.b4a.pc.RDebug.IRemote;
import anywheresoftware.b4a.pc.Debug;

public class b4i_reportes implements IRemote{
	public static b4i_reportes mostCurrent;
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
		mostCurrent = new b4i_reportes();
        remoteMe = RemoteObject.declareNull("com.jq.b4i_reportes");
        //anywheresoftware.b4a.pc.RapidSub.moduleToObject.put("com.jq.b4i_reportes", "com.jq.b4i_reportes");
	}
    public static void main (String[] args) throws Exception {
		new RDebug(args[0], Integer.parseInt(args[1]), Integer.parseInt(args[2]), Integer.parseInt(args[3]));
		RDebug.INSTANCE.waitForTask();

	}
    private static PCBA pcBA = new PCBA(null, b4i_reportes.class);
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
		pcBA = new PCBA(this, b4i_reportes.class);
        try {
            BA.init();
            b4i_reportes_subs_0._process_globals();

        } catch(Exception e) {
            throw new RuntimeException(e);
        }
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("B4ICommon");
public static RemoteObject _pagereporte = RemoteObject.declareNull("B4IPage");
public static RemoteObject _panel1 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _lblfechainicio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblfechafinal = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _panelfondodatepicker = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _cualfe = RemoteObject.createImmutable(false);
public static RemoteObject _mapaborrar = RemoteObject.declareNull("B4IMap");
public static RemoteObject _indiceborrar = RemoteObject.createImmutable(0);
public static RemoteObject _numorden = RemoteObject.createImmutable("");
public static RemoteObject _listaaddall = RemoteObject.declareNull("B4IList");
public static RemoteObject _listaux = RemoteObject.declareNull("B4IList");
public static RemoteObject _mapadetalleorden = RemoteObject.declareNull("B4IMap");
public static RemoteObject _indicedetalleorden = RemoteObject.createImmutable(0);
public static RemoteObject _btncancelardate = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnaceptardate = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _datefecha = RemoteObject.declareNull("B4IDatePickerWrapper");
public static RemoteObject _listaordenes = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _label3 = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lbldir = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblfecha = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblprincipal = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnbuscarreporte = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _panelfondodetalleorden = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _lbltituloproorden = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _listproordendetalle = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _btnbackproorden = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnaddallproorden = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _imgcat = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblnomcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblcantcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnreporteback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panel2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelencabezadom = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelencabezadorepo = RemoteObject.declareNull("B4IPanelWrapper");
public static b4i_main _main = null;
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"btnAceptarDate",b4i_reportes._btnaceptardate,"btnAddAllproOrden",b4i_reportes._btnaddallproorden,"btnbackProOrden",b4i_reportes._btnbackproorden,"btnBuscarReporte",b4i_reportes._btnbuscarreporte,"btnCancelarDate",b4i_reportes._btncancelardate,"btnReporteBack",b4i_reportes._btnreporteback,"Categoria",Debug.moduleToString(b4i_categoria.class),"cualFe",b4i_reportes._cualfe,"DateFecha",b4i_reportes._datefecha,"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_reportes._hud,"imgCat",b4i_reportes._imgcat,"indiceBorrar",b4i_reportes._indiceborrar,"indiceDetalleOrden",b4i_reportes._indicedetalleorden,"Label3",b4i_reportes._label3,"lblCantCat",b4i_reportes._lblcantcat,"lblDir",b4i_reportes._lbldir,"lblFecha",b4i_reportes._lblfecha,"lblfechaFinal",b4i_reportes._lblfechafinal,"lblFechaInicio",b4i_reportes._lblfechainicio,"lblNomCat",b4i_reportes._lblnomcat,"lblPrincipal",b4i_reportes._lblprincipal,"lbltituloProOrden",b4i_reportes._lbltituloproorden,"listaAddAll",b4i_reportes._listaaddall,"listaOrdenes",b4i_reportes._listaordenes,"listAux",b4i_reportes._listaux,"ListProOrdenDetalle",b4i_reportes._listproordendetalle,"Login",Debug.moduleToString(b4i_login.class),"Main",Debug.moduleToString(b4i_main.class),"mapaBorrar",b4i_reportes._mapaborrar,"mapaDetalleOrden",b4i_reportes._mapadetalleorden,"numOrden",b4i_reportes._numorden,"pageReporte",b4i_reportes._pagereporte,"Panel1",b4i_reportes._panel1,"Panel2",b4i_reportes._panel2,"Panel3",b4i_reportes._panel3,"PanelEncabezadoM",b4i_reportes._panelencabezadom,"PanelEncabezadoRepo",b4i_reportes._panelencabezadorepo,"PanelFondoDatePicker",b4i_reportes._panelfondodatepicker,"PanelFondoDetalleOrden",b4i_reportes._panelfondodetalleorden,"Perfil",Debug.moduleToString(b4i_perfil.class)};
}
}