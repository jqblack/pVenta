
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

public class principal implements IRemote{
	public static principal mostCurrent;
	public static RemoteObject processBA;
    public static boolean processGlobalsRun;
    public static RemoteObject myClass;
    public static RemoteObject remoteMe;
	public principal() {
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
        anywheresoftware.b4a.pc.RapidSub.moduleToObject.put(new B4XClass("principal"), "com.jq.pedidos.principal");
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
		pcBA = new PCBA(this, principal.class);
        main_subs_0.initializeProcessGlobals();
		return pcBA;
	}
public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _idempresa = RemoteObject.createImmutable(0);
public static RemoteObject _impuestoincluido = RemoteObject.createImmutable(false);
public static RemoteObject _mapempresainfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cantidadproduto = RemoteObject.createImmutable(0);
public static RemoteObject _mapadetalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _ismodal = RemoteObject.createImmutable(false);
public static RemoteObject _isfav = RemoteObject.createImmutable(false);
public static RemoteObject _listafavoritos = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _buscarfavoritosvar = RemoteObject.createImmutable(false);
public static RemoteObject _keyotraparte = RemoteObject.createImmutable(false);
public static RemoteObject _sendclickfav = RemoteObject.createImmutable(false);
public static RemoteObject _sendclickabout = RemoteObject.createImmutable(false);
public static RemoteObject _imgfavdetalle = RemoteObject.createImmutable(false);
public static RemoteObject _actu = RemoteObject.createImmutable(false);
public static RemoteObject _loadagain = RemoteObject.createImmutable(false);
public static RemoteObject _actualizame = RemoteObject.createImmutable(false);
public static RemoteObject _mapadetalleimagen = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _isusa = RemoteObject.createImmutable(false);
public static RemoteObject _sm = RemoteObject.declareNull("com.jq.pedidos.slidemenu");
public static RemoteObject _viewcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.ScrollViewWrapper");
public static RemoteObject _btnabierto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnempresainfo = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnmasvendido = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnorden = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnprincipalback = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lbllema = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelmenu = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _paneltitulo = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblcategoria = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblcantidadproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _btnbuscarproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnproductovolver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _listproductosmodalview = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _panelmodalproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _txtbuscarproducto = RemoteObject.declareNull("anywheresoftware.b4a.objects.EditTextWrapper");
public static RemoteObject _btnproductobuscarmodal = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btninfocerrar = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelinfoback = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lbldireccion = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblinfoempresa = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblinfonegocio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblpedidominimo = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lbltelefono = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelslide = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _panelslideback = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnslidevolver = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _hscrol = RemoteObject.declareNull("anywheresoftware.b4a.objects.HorizontalScrollViewWrapper");
public static RemoteObject _btnagregarcarritodetalle = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbackdetalles = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnless = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnmore = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblcantidad = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _panelfondodetalles = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _lblprecioencabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblnombeencabezado = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _lblprecio = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _imageviewdetalles = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _panelfondofavorito = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _btnbackfavoritos = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _lblcantproductos = RemoteObject.declareNull("anywheresoftware.b4a.objects.LabelWrapper");
public static RemoteObject _llistafavoritos = RemoteObject.declareNull("anywheresoftware.b4a.objects.ListViewWrapper");
public static RemoteObject _btniniciarsecion = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _btnbackaboutus = RemoteObject.declareNull("anywheresoftware.b4a.objects.ButtonWrapper");
public static RemoteObject _panelfondoaboutus = RemoteObject.declareNull("anywheresoftware.b4a.objects.PanelWrapper");
public static RemoteObject _imgdetallefav = RemoteObject.declareNull("anywheresoftware.b4a.objects.ImageViewWrapper");
public static RemoteObject _dateutils = RemoteObject.declareNull("b4a.example.dateutils");
public static com.jq.pedidos.main _main = null;
public static com.jq.pedidos.starter _starter = null;
public static com.jq.pedidos.funcion _funcion = null;
public static com.jq.pedidos.facturacion _facturacion = null;
public static com.jq.pedidos.direcciones _direcciones = null;
public static com.jq.pedidos.reporteordenes _reporteordenes = null;
public static com.jq.pedidos.categoria _categoria = null;
public static com.jq.pedidos.perfil _perfil = null;
public static com.jq.pedidos.httputils2service _httputils2service = null;
  public Object[] GetGlobals() {
		return new Object[] {"Activity",principal.mostCurrent._activity,"actu",principal._actu,"actualizame",principal._actualizame,"btnAbierto",principal.mostCurrent._btnabierto,"btnagregarCarritoDetalle",principal.mostCurrent._btnagregarcarritodetalle,"btnBackAboutus",principal.mostCurrent._btnbackaboutus,"btnBackDetalles",principal.mostCurrent._btnbackdetalles,"btnBackFavoritos",principal.mostCurrent._btnbackfavoritos,"btnBuscarProducto",principal.mostCurrent._btnbuscarproducto,"btnEmpresaInfo",principal.mostCurrent._btnempresainfo,"btnInfoCerrar",principal.mostCurrent._btninfocerrar,"btnIniciarSecion",principal.mostCurrent._btniniciarsecion,"btnless",principal.mostCurrent._btnless,"btnMasVendido",principal.mostCurrent._btnmasvendido,"btnMore",principal.mostCurrent._btnmore,"btnOrden",principal.mostCurrent._btnorden,"btnPrincipalBack",principal.mostCurrent._btnprincipalback,"btnProductoBuscarModal",principal.mostCurrent._btnproductobuscarmodal,"btnProductoVolver",principal.mostCurrent._btnproductovolver,"btnSlideVolver",principal.mostCurrent._btnslidevolver,"buscarfavoritosvar",principal._buscarfavoritosvar,"cantidadProduto",principal._cantidadproduto,"Categoria",Debug.moduleToString(com.jq.pedidos.categoria.class),"DateUtils",principal.mostCurrent._dateutils,"Direcciones",Debug.moduleToString(com.jq.pedidos.direcciones.class),"Facturacion",Debug.moduleToString(com.jq.pedidos.facturacion.class),"funcion",Debug.moduleToString(com.jq.pedidos.funcion.class),"hscrol",principal.mostCurrent._hscrol,"HttpUtils2Service",Debug.moduleToString(com.jq.pedidos.httputils2service.class),"idEmpresa",principal._idempresa,"ImageViewDetalles",principal.mostCurrent._imageviewdetalles,"imgdetallefav",principal.mostCurrent._imgdetallefav,"imgfavDetalle",principal._imgfavdetalle,"impuestoIncluido",principal._impuestoincluido,"isfav",principal._isfav,"ismodal",principal._ismodal,"isUsa",principal._isusa,"keyotraparte",principal._keyotraparte,"lblcantidad",principal.mostCurrent._lblcantidad,"lblCantidadProductos",principal.mostCurrent._lblcantidadproductos,"lblCantProductos",principal.mostCurrent._lblcantproductos,"lblCategoria",principal.mostCurrent._lblcategoria,"lblDireccion",principal.mostCurrent._lbldireccion,"lblInfoEmpresa",principal.mostCurrent._lblinfoempresa,"lblInfoNegocio",principal.mostCurrent._lblinfonegocio,"lblLema",principal.mostCurrent._lbllema,"lblNombeEncabezado",principal.mostCurrent._lblnombeencabezado,"lblPedidoMinimo",principal.mostCurrent._lblpedidominimo,"lblPrecio",principal.mostCurrent._lblprecio,"lblPrecioEncabezado",principal.mostCurrent._lblprecioencabezado,"lblTelefono",principal.mostCurrent._lbltelefono,"listafavoritos",principal._listafavoritos,"ListProductosModalView",principal.mostCurrent._listproductosmodalview,"LlistaFavoritos",principal.mostCurrent._llistafavoritos,"loadagain",principal._loadagain,"Main",Debug.moduleToString(com.jq.pedidos.main.class),"mapaDetalle",principal._mapadetalle,"mapaDetalleImagen",principal._mapadetalleimagen,"mapEmpresaInfo",principal._mapempresainfo,"PanelCategoria",principal.mostCurrent._panelcategoria,"PanelFondoAboutus",principal.mostCurrent._panelfondoaboutus,"PanelFondoDetalles",principal.mostCurrent._panelfondodetalles,"PanelFondoFavorito",principal.mostCurrent._panelfondofavorito,"PanelInfoBack",principal.mostCurrent._panelinfoback,"PanelMenu",principal.mostCurrent._panelmenu,"PanelModalProducto",principal.mostCurrent._panelmodalproducto,"PanelSlide",principal.mostCurrent._panelslide,"PanelSlideBack",principal.mostCurrent._panelslideback,"PanelTitulo",principal.mostCurrent._paneltitulo,"Perfil",Debug.moduleToString(com.jq.pedidos.perfil.class),"ReporteOrdenes",Debug.moduleToString(com.jq.pedidos.reporteordenes.class),"SendClickAbout",principal._sendclickabout,"SendClickFav",principal._sendclickfav,"sm",principal.mostCurrent._sm,"Starter",Debug.moduleToString(com.jq.pedidos.starter.class),"txtBuscarProducto",principal.mostCurrent._txtbuscarproducto,"ViewCategoria",principal.mostCurrent._viewcategoria};
}
}