
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
public static RemoteObject _pagedetalle = RemoteObject.declareNull("B4IPage");
public static RemoteObject _pageaboutus = RemoteObject.declareNull("B4IPage");
public static RemoteObject _tokenpublico = RemoteObject.createImmutable("");
public static RemoteObject _token = RemoteObject.createImmutable("");
public static RemoteObject _isloged = RemoteObject.createImmutable(false);
public static RemoteObject _listafavoritos = RemoteObject.declareNull("B4IList");
public static RemoteObject _mapempresainfo = RemoteObject.declareNull("B4IMap");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _idempresa = RemoteObject.createImmutable(0);
public static RemoteObject _jobmsj = RemoteObject.createImmutable("");
public static RemoteObject _jobmsjtitle = RemoteObject.createImmutable("");
public static RemoteObject _impuestoincluido = RemoteObject.createImmutable(false);
public static RemoteObject _cantidadproduto = RemoteObject.createImmutable(0);
public static RemoteObject _mapadetalle = RemoteObject.declareNull("B4IMap");
public static RemoteObject _sql = RemoteObject.declareNull("B4ISQL");
public static RemoteObject _imei = RemoteObject.createImmutable("");
public static RemoteObject _operadora = RemoteObject.createImmutable("");
public static RemoteObject _cargaragain = RemoteObject.createImmutable(false);
public static RemoteObject _reload = RemoteObject.createImmutable(false);
public static RemoteObject _usersdata = RemoteObject.declareNull("_typeu");
public static RemoteObject _isusa = RemoteObject.createImmutable(false);
public static RemoteObject _mapadetalleimagen = RemoteObject.declareNull("B4IMap");
public static RemoteObject _drawer = RemoteObject.declareNull("b4i_b4xdrawer");
public static RemoteObject _listslide = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _btnprincipalback = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnbuscarproducto = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btniniciarsecion = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnorden = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelfooterv2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _paneltitulo = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _lblcantidadproductos = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnmasvendido = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelslide = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _hud = RemoteObject.declareNull("iHUD");
public static RemoteObject _hud2 = RemoteObject.declareNull("iHUD");
public static RemoteObject _panel1 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _txtbuscarproducto = RemoteObject.declareNull("B4ITextFieldWrapper");
public static RemoteObject _btnproductobuscarmodal = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelproductosmodalview = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btnproductovolver = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelmodalproducto = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _viewcategoria = RemoteObject.declareNull("B4IScrollView");
public static RemoteObject _hscroll = RemoteObject.declareNull("B4IScrollView");
public static RemoteObject _paneluser = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _imageuser = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _smc = RemoteObject.declareNull("B4ISideMenuController");
public static RemoteObject _panel2 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel3 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel4 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel5 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel6 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panel7 = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelfondodetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _imageviewdetalles = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblprecioencabezado = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblnombeencabezado = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _imgdetallefav = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblprecio = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblcantidad = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _btnbackdetalles = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnagregarcarritodetalle = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnless = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _btnmore = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _panelimagendetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panellblcantidad = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _panelencabezadodetalles = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _btnbackaboutus = RemoteObject.declareNull("B4IButtonWrapper");
public static RemoteObject _buscarfavoritosvar = RemoteObject.createImmutable(false);
public static RemoteObject _panelcategoria = RemoteObject.declareNull("B4IPanelWrapper");
public static RemoteObject _steppercantidad = RemoteObject.declareNull("B4IStepperWrapper");
public static RemoteObject _lblnombreuser = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblemailuser = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _listabusquedapro = RemoteObject.declareNull("b4i_customlistview");
public static RemoteObject _imgcat = RemoteObject.declareNull("B4IImageViewWrapper");
public static RemoteObject _lblnomcat = RemoteObject.declareNull("B4ILabelWrapper");
public static RemoteObject _lblcantcat = RemoteObject.declareNull("B4ILabelWrapper");
public static b4i_login _login = null;
public static b4i_funciones _funciones = null;
public static b4i_categoria _categoria = null;
public static b4i_reportes _reportes = null;
public static b4i_facturacion _facturacion = null;
public static b4i_direcciones _direcciones = null;
public static b4i_perfil _perfil = null;
public static b4i_favoritos _favoritos = null;
public static b4i_httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"App",b4i_main._app,"btnagregarCarritoDetalle",b4i_main._btnagregarcarritodetalle,"btnBackAboutus",b4i_main._btnbackaboutus,"btnBackDetalles",b4i_main._btnbackdetalles,"btnBuscarProducto",b4i_main._btnbuscarproducto,"btnIniciarSecion",b4i_main._btniniciarsecion,"btnless",b4i_main._btnless,"btnMasVendido",b4i_main._btnmasvendido,"btnMore",b4i_main._btnmore,"btnOrden",b4i_main._btnorden,"btnPrincipalBack",b4i_main._btnprincipalback,"btnProductoBuscarModal",b4i_main._btnproductobuscarmodal,"btnProductoVolver",b4i_main._btnproductovolver,"buscarfavoritosvar",b4i_main._buscarfavoritosvar,"cantidadProduto",b4i_main._cantidadproduto,"CargarAgain",b4i_main._cargaragain,"Categoria",Debug.moduleToString(b4i_categoria.class),"Direcciones",Debug.moduleToString(b4i_direcciones.class),"Drawer",b4i_main._drawer,"Facturacion",Debug.moduleToString(b4i_facturacion.class),"Favoritos",Debug.moduleToString(b4i_favoritos.class),"funciones",Debug.moduleToString(b4i_funciones.class),"Hscroll",b4i_main._hscroll,"HttpUtils2Service",Debug.moduleToString(b4i_httputils2service.class),"hud",b4i_main._hud,"hud2",b4i_main._hud2,"idEmpresa",b4i_main._idempresa,"imageUser",b4i_main._imageuser,"ImageViewDetalles",b4i_main._imageviewdetalles,"imei",b4i_main._imei,"imgCat",b4i_main._imgcat,"imgdetallefav",b4i_main._imgdetallefav,"impuestoIncluido",b4i_main._impuestoincluido,"isLoged",b4i_main._isloged,"IsUsa",b4i_main._isusa,"jobMsj",b4i_main._jobmsj,"jobMsjTitle",b4i_main._jobmsjtitle,"lblCantCat",b4i_main._lblcantcat,"lblcantidad",b4i_main._lblcantidad,"lblCantidadProductos",b4i_main._lblcantidadproductos,"lblEmailUser",b4i_main._lblemailuser,"lblNombeEncabezado",b4i_main._lblnombeencabezado,"lblNombreUser",b4i_main._lblnombreuser,"lblNomCat",b4i_main._lblnomcat,"lblPrecio",b4i_main._lblprecio,"lblPrecioEncabezado",b4i_main._lblprecioencabezado,"ListaBusquedaPro",b4i_main._listabusquedapro,"listafavoritos",b4i_main._listafavoritos,"ListSlide",b4i_main._listslide,"Login",Debug.moduleToString(b4i_login.class),"mapaDetalle",b4i_main._mapadetalle,"mapaDetalleImagen",b4i_main._mapadetalleimagen,"mapEmpresaInfo",b4i_main._mapempresainfo,"NavControl",b4i_main._navcontrol,"operadora",b4i_main._operadora,"Page1",b4i_main._page1,"pageAboutUs",b4i_main._pageaboutus,"pageDetalle",b4i_main._pagedetalle,"Panel1",b4i_main._panel1,"Panel2",b4i_main._panel2,"Panel3",b4i_main._panel3,"Panel4",b4i_main._panel4,"Panel5",b4i_main._panel5,"Panel6",b4i_main._panel6,"Panel7",b4i_main._panel7,"PanelCategoria",b4i_main._panelcategoria,"PanelEncabezadoDetalles",b4i_main._panelencabezadodetalles,"PanelFondoDetalles",b4i_main._panelfondodetalles,"PanelFooterv2",b4i_main._panelfooterv2,"PanelImagenDetalles",b4i_main._panelimagendetalles,"PanellblCantidad",b4i_main._panellblcantidad,"PanelModalProducto",b4i_main._panelmodalproducto,"PanelProductosModalView",b4i_main._panelproductosmodalview,"PanelSlide",b4i_main._panelslide,"PanelTitulo",b4i_main._paneltitulo,"PanelUser",b4i_main._paneluser,"Perfil",Debug.moduleToString(b4i_perfil.class),"reload",b4i_main._reload,"Reportes",Debug.moduleToString(b4i_reportes.class),"smc",b4i_main._smc,"SQL",b4i_main._sql,"StepperCantidad",b4i_main._steppercantidad,"token",b4i_main._token,"tokenPublico",b4i_main._tokenpublico,"txtBuscarProducto",b4i_main._txtbuscarproducto,"url",b4i_main._url,"usersData",b4i_main._usersdata,"ViewCategoria",b4i_main._viewcategoria};
}
}