package com.jq.pedidos;


import anywheresoftware.b4a.B4AMenuItem;
import android.app.Activity;
import android.os.Bundle;
import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.B4AActivity;
import anywheresoftware.b4a.ObjectWrapper;
import anywheresoftware.b4a.objects.ActivityWrapper;
import java.lang.reflect.InvocationTargetException;
import anywheresoftware.b4a.B4AUncaughtException;
import anywheresoftware.b4a.debug.*;
import java.lang.ref.WeakReference;

public class principal extends Activity implements B4AActivity{
	public static principal mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = false;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.jq.pedidos", "com.jq.pedidos.principal");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (principal).");
				p.finish();
			}
		}
        processBA.setActivityPaused(true);
        processBA.runHook("oncreate", this, null);
		if (!includeTitle) {
        	this.getWindow().requestFeature(android.view.Window.FEATURE_NO_TITLE);
        }
        if (fullScreen) {
        	getWindow().setFlags(android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN,   
        			android.view.WindowManager.LayoutParams.FLAG_FULLSCREEN);
        }
		
        processBA.sharedProcessBA.activityBA = null;
		layout = new BALayout(this);
		setContentView(layout);
		afterFirstLayout = false;
        WaitForLayout wl = new WaitForLayout();
        if (anywheresoftware.b4a.objects.ServiceHelper.StarterHelper.startFromActivity(this, processBA, wl, false))
		    BA.handler.postDelayed(wl, 5);

	}
	static class WaitForLayout implements Runnable {
		public void run() {
			if (afterFirstLayout)
				return;
			if (mostCurrent == null)
				return;
            
			if (mostCurrent.layout.getWidth() == 0) {
				BA.handler.postDelayed(this, 5);
				return;
			}
			mostCurrent.layout.getLayoutParams().height = mostCurrent.layout.getHeight();
			mostCurrent.layout.getLayoutParams().width = mostCurrent.layout.getWidth();
			afterFirstLayout = true;
			mostCurrent.afterFirstLayout();
		}
	}
	private void afterFirstLayout() {
        if (this != mostCurrent)
			return;
		activityBA = new BA(this, layout, processBA, "com.jq.pedidos", "com.jq.pedidos.principal");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.jq.pedidos.principal", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (principal) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (principal) Resume **");
        processBA.raiseEvent(null, "activity_resume");
        if (android.os.Build.VERSION.SDK_INT >= 11) {
			try {
				android.app.Activity.class.getMethod("invalidateOptionsMenu").invoke(this,(Object[]) null);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}

	}
	public void addMenuItem(B4AMenuItem item) {
		if (menuItems == null)
			menuItems = new java.util.ArrayList<B4AMenuItem>();
		menuItems.add(item);
	}
	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		super.onCreateOptionsMenu(menu);
        try {
            if (processBA.subExists("activity_actionbarhomeclick")) {
                Class.forName("android.app.ActionBar").getMethod("setHomeButtonEnabled", boolean.class).invoke(
                    getClass().getMethod("getActionBar").invoke(this), true);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        if (processBA.runHook("oncreateoptionsmenu", this, new Object[] {menu}))
            return true;
		if (menuItems == null)
			return false;
		for (B4AMenuItem bmi : menuItems) {
			android.view.MenuItem mi = menu.add(bmi.title);
			if (bmi.drawable != null)
				mi.setIcon(bmi.drawable);
            if (android.os.Build.VERSION.SDK_INT >= 11) {
				try {
                    if (bmi.addToBar) {
				        android.view.MenuItem.class.getMethod("setShowAsAction", int.class).invoke(mi, 1);
                    }
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
			mi.setOnMenuItemClickListener(new B4AMenuItemsClickListener(bmi.eventName.toLowerCase(BA.cul)));
		}
        
		return true;
	}   
 @Override
 public boolean onOptionsItemSelected(android.view.MenuItem item) {
    if (item.getItemId() == 16908332) {
        processBA.raiseEvent(null, "activity_actionbarhomeclick");
        return true;
    }
    else
        return super.onOptionsItemSelected(item); 
}
@Override
 public boolean onPrepareOptionsMenu(android.view.Menu menu) {
    super.onPrepareOptionsMenu(menu);
    processBA.runHook("onprepareoptionsmenu", this, new Object[] {menu});
    return true;
    
 }
 protected void onStart() {
    super.onStart();
    processBA.runHook("onstart", this, null);
}
 protected void onStop() {
    super.onStop();
    processBA.runHook("onstop", this, null);
}
    public void onWindowFocusChanged(boolean hasFocus) {
       super.onWindowFocusChanged(hasFocus);
       if (processBA.subExists("activity_windowfocuschanged"))
           processBA.raiseEvent2(null, true, "activity_windowfocuschanged", false, hasFocus);
    }
	private class B4AMenuItemsClickListener implements android.view.MenuItem.OnMenuItemClickListener {
		private final String eventName;
		public B4AMenuItemsClickListener(String eventName) {
			this.eventName = eventName;
		}
		public boolean onMenuItemClick(android.view.MenuItem item) {
			processBA.raiseEventFromUI(item.getTitle(), eventName + "_click");
			return true;
		}
	}
    public static Class<?> getObject() {
		return principal.class;
	}
    private Boolean onKeySubExist = null;
    private Boolean onKeyUpSubExist = null;
	@Override
	public boolean onKeyDown(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeydown", this, new Object[] {keyCode, event}))
            return true;
		if (onKeySubExist == null)
			onKeySubExist = processBA.subExists("activity_keypress");
		if (onKeySubExist) {
			if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK &&
					android.os.Build.VERSION.SDK_INT >= 18) {
				HandleKeyDelayed hk = new HandleKeyDelayed();
				hk.kc = keyCode;
				BA.handler.post(hk);
				return true;
			}
			else {
				boolean res = new HandleKeyDelayed().runDirectly(keyCode);
				if (res)
					return true;
			}
		}
		return super.onKeyDown(keyCode, event);
	}
	private class HandleKeyDelayed implements Runnable {
		int kc;
		public void run() {
			runDirectly(kc);
		}
		public boolean runDirectly(int keyCode) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keypress", false, keyCode);
			if (res == null || res == true) {
                return true;
            }
            else if (keyCode == anywheresoftware.b4a.keywords.constants.KeyCodes.KEYCODE_BACK) {
				finish();
				return true;
			}
            return false;
		}
		
	}
    @Override
	public boolean onKeyUp(int keyCode, android.view.KeyEvent event) {
        if (processBA.runHook("onkeyup", this, new Object[] {keyCode, event}))
            return true;
		if (onKeyUpSubExist == null)
			onKeyUpSubExist = processBA.subExists("activity_keyup");
		if (onKeyUpSubExist) {
			Boolean res =  (Boolean)processBA.raiseEvent2(_activity, false, "activity_keyup", false, keyCode);
			if (res == null || res == true)
				return true;
		}
		return super.onKeyUp(keyCode, event);
	}
	@Override
	public void onNewIntent(android.content.Intent intent) {
        super.onNewIntent(intent);
		this.setIntent(intent);
        processBA.runHook("onnewintent", this, new Object[] {intent});
	}
    @Override 
	public void onPause() {
		super.onPause();
        if (_activity == null)
            return;
        if (this != mostCurrent)
			return;
		anywheresoftware.b4a.Msgbox.dismiss(true);
        BA.LogInfo("** Activity (principal) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
        if (mostCurrent != null)
            processBA.raiseEvent2(_activity, true, "activity_pause", false, activityBA.activity.isFinishing());		
        processBA.setActivityPaused(true);
        mostCurrent = null;
        if (!activityBA.activity.isFinishing())
			previousOne = new WeakReference<Activity>(this);
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        processBA.runHook("onpause", this, null);
	}

	@Override
	public void onDestroy() {
        super.onDestroy();
		previousOne = null;
        processBA.runHook("ondestroy", this, null);
	}
    @Override 
	public void onResume() {
		super.onResume();
        mostCurrent = this;
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (activityBA != null) { //will be null during activity create (which waits for AfterLayout).
        	ResumeMessage rm = new ResumeMessage(mostCurrent);
        	BA.handler.post(rm);
        }
        processBA.runHook("onresume", this, null);
	}
    private static class ResumeMessage implements Runnable {
    	private final WeakReference<Activity> activity;
    	public ResumeMessage(Activity activity) {
    		this.activity = new WeakReference<Activity>(activity);
    	}
		public void run() {
            principal mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (principal) Resume **");
            if (mc != mostCurrent)
                return;
		    processBA.raiseEvent(mc._activity, "activity_resume", (Object[])null);
		}
    }
	@Override
	protected void onActivityResult(int requestCode, int resultCode,
	      android.content.Intent data) {
		processBA.onActivityResult(requestCode, resultCode, data);
        processBA.runHook("onactivityresult", this, new Object[] {requestCode, resultCode});
	}
	private static void initializeGlobals() {
		processBA.raiseEvent2(null, true, "globals", false, (Object[])null);
	}
    public void onRequestPermissionsResult(int requestCode,
        String permissions[], int[] grantResults) {
        for (int i = 0;i < permissions.length;i++) {
            Object[] o = new Object[] {permissions[i], grantResults[i] == 0};
            processBA.raiseEventFromDifferentThread(null,null, 0, "activity_permissionresult", true, o);
        }
            
    }



public static void initializeProcessGlobals() {
             try {
                Class.forName(BA.applicationContext.getPackageName() + ".main").getMethod("initializeProcessGlobals").invoke(null, null);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
}
public anywheresoftware.b4a.keywords.Common __c = null;
public static int _idempresa = 0;
public static boolean _impuestoincluido = false;
public static anywheresoftware.b4a.objects.collections.Map _mapempresainfo = null;
public static int _cantidadproduto = 0;
public static anywheresoftware.b4a.objects.collections.Map _mapadetalle = null;
public static boolean _ismodal = false;
public static boolean _isfav = false;
public static anywheresoftware.b4a.objects.collections.List _listafavoritos = null;
public static boolean _buscarfavoritosvar = false;
public static boolean _keyotraparte = false;
public static boolean _sendclickfav = false;
public static boolean _sendclickabout = false;
public static boolean _imgfavdetalle = false;
public static boolean _actu = false;
public static boolean _loadagain = false;
public static boolean _actualizame = false;
public static anywheresoftware.b4a.objects.collections.Map _mapadetalleimagen = null;
public static boolean _isusa = false;
public com.jq.pedidos.slidemenu _sm = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _viewcategoria = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnabierto = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnempresainfo = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmasvendido = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnorden = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnprincipalback = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbllema = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcategoria = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneltitulo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcategoria = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcantidadproductos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbuscarproducto = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnproductovolver = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listproductosmodalview = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmodalproducto = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtbuscarproducto = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnproductobuscarmodal = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btninfocerrar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelinfoback = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldireccion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblinfoempresa = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblinfonegocio = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblpedidominimo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltelefono = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelslide = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelslideback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnslidevolver = null;
public anywheresoftware.b4a.objects.HorizontalScrollViewWrapper _hscrol = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnagregarcarritodetalle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackdetalles = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnless = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnmore = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcantidad = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondodetalles = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprecioencabezado = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnombeencabezado = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprecio = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageviewdetalles = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondofavorito = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackfavoritos = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcantproductos = null;
public anywheresoftware.b4a.objects.ListViewWrapper _llistafavoritos = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btniniciarsecion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackaboutus = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondoaboutus = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imgdetallefav = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4h.okhttp.OkHttpClientWrapper _hc = null;
String _json = "";
com.jq.pedidos.httpjob _cantidadpro = null;
com.jq.pedidos.httpjob _jobempresainfo = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim hc As OkHttpClient";
_hc = new anywheresoftware.b4h.okhttp.OkHttpClientWrapper();
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="hc.InitializeAcceptAll(\"httpscliente\")";
_hc.InitializeAcceptAll("httpscliente");
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="hscrol.Initialize(100%x,\"\")";
mostCurrent._hscrol.Initialize(mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA),"");
RDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="Activity.LoadLayout(\"frmPrincipalv2\")";
mostCurrent._activity.LoadLayout("frmPrincipalv2",mostCurrent.activityBA);
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="If FirstTime Then";
if (_firsttime) { 
RDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1638414;
 //BA.debugLineNum = 1638414;BA.debugLine="json = \"'f_imei':\"&Main.imei";
_json = "'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="Dim cantidadPro As HttpJob";
_cantidadpro = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="cantidadPro.Initialize(\"cantidadPro\",Me)";
_cantidadpro._initialize /*String*/ (null,processBA,"cantidadPro",principal.getObject());
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="cantidadPro.PostString(Main.url&\"puntoventa/get_";
_cantidadpro._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_canitdad_producto_Login","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
 };
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="BuscarFavoritos";
_buscarfavoritos();
RDebugUtils.currentLine=1638426;
 //BA.debugLineNum = 1638426;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
_jobempresainfo = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
_jobempresainfo._initialize /*String*/ (null,processBA,"JobEmpresaInfo",principal.getObject());
RDebugUtils.currentLine=1638428;
 //BA.debugLineNum = 1638428;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos";
_jobempresainfo._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_datos_preferencia","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(_idempresa)));
 }else {
RDebugUtils.currentLine=1638430;
 //BA.debugLineNum = 1638430;BA.debugLine="cargarDatos";
_cargardatos();
 };
RDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="sm.Initialize(Activity,Me,\"SlideMenu\",8%y,75%x, C";
mostCurrent._sm._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._activity,principal.getObject(),"SlideMenu",anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (230),(int) (255),(int) (250),(int) (250)));
RDebugUtils.currentLine=1638434;
 //BA.debugLineNum = 1638434;BA.debugLine="funcion.GenerarSlideMenu(sm)";
mostCurrent._funcion._generarslidemenu /*String*/ (mostCurrent.activityBA,mostCurrent._sm);
RDebugUtils.currentLine=1638438;
 //BA.debugLineNum = 1638438;BA.debugLine="End Sub";
return "";
}
public static String  _buscarfavoritos() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buscarfavoritos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buscarfavoritos", null));}
String _json = "";
com.jq.pedidos.httpjob _jobfavoritos = null;
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub BuscarFavoritos";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idempresa':"+BA.NumberToString(1000);
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Dim jobFavoritos As HttpJob";
_jobfavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="jobFavoritos.Initialize(\"buscarFavoritos\",Me)";
_jobfavoritos._initialize /*String*/ (null,processBA,"buscarFavoritos",principal.getObject());
RDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="jobFavoritos.PostString(Main.url&\"puntoventa/busc";
_jobfavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/buscarfav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="End Sub";
return "";
}
public static String  _cargardatos() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargardatos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargardatos", null));}
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub cargarDatos";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="If actu Then";
if (_actu) { 
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
mostCurrent._viewcategoria.getPanel().RemoveAllViews();
 };
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="cargarMasVendido";
_cargarmasvendido();
RDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="cargarAllProductos";
_cargarallproductos();
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="principal";
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
String _json = "";
com.jq.pedidos.httpjob _cantidadpro = null;
com.jq.pedidos.httpjob _jobempresainfo = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="If Main.cargaragain And loadagain Then";
if (mostCurrent._main._cargaragain /*boolean*/  && _loadagain) { 
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="json = \"'f_imei':\"&Main.imei";
_json = "'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Dim cantidadPro As HttpJob";
_cantidadpro = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="cantidadPro.Initialize(\"cantidadPro\",Me)";
_cantidadpro._initialize /*String*/ (null,processBA,"cantidadPro",principal.getObject());
RDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="cantidadPro.PostString(Main.url&\"puntoventa/get_";
_cantidadpro._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_canitdad_producto_Login","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="BuscarFavoritos";
_buscarfavoritos();
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
_jobempresainfo = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
_jobempresainfo._initialize /*String*/ (null,processBA,"JobEmpresaInfo",principal.getObject());
RDebugUtils.currentLine=2883599;
 //BA.debugLineNum = 2883599;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos";
_jobempresainfo._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_datos_preferencia","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(_idempresa)));
RDebugUtils.currentLine=2883602;
 //BA.debugLineNum = 2883602;BA.debugLine="sm.Initialize(Activity,Me,\"SlideMenu\",8%y,75%x,";
mostCurrent._sm._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._activity,principal.getObject(),"SlideMenu",anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (230),(int) (255),(int) (250),(int) (250)));
RDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="funcion.GenerarSlideMenu(sm)";
mostCurrent._funcion._generarslidemenu /*String*/ (mostCurrent.activityBA,mostCurrent._sm);
RDebugUtils.currentLine=2883605;
 //BA.debugLineNum = 2883605;BA.debugLine="btnIniciarSecion.Text = \"Iniciar Sesión\"";
mostCurrent._btniniciarsecion.setText(BA.ObjectToCharSequence("Iniciar Sesión"));
RDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="Main.cargaragain = False";
mostCurrent._main._cargaragain /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="loadagain = False";
_loadagain = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2883612;
 //BA.debugLineNum = 2883612;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
mostCurrent._lblcantidadproductos.setText(BA.ObjectToCharSequence(_cantidadproduto));
RDebugUtils.currentLine=2883613;
 //BA.debugLineNum = 2883613;BA.debugLine="lblCantidadProductos.Visible = True";
mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="If cantidadProduto == 0 Then";
if (_cantidadproduto==0) { 
RDebugUtils.currentLine=2883615;
 //BA.debugLineNum = 2883615;BA.debugLine="lblCantidadProductos.Visible = False";
mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2883618;
 //BA.debugLineNum = 2883618;BA.debugLine="If Main.logged And buscarfavoritosvar And keyotra";
if (mostCurrent._main._logged /*boolean*/  && _buscarfavoritosvar && _keyotraparte) { 
RDebugUtils.currentLine=2883619;
 //BA.debugLineNum = 2883619;BA.debugLine="BuscarFavoritos";
_buscarfavoritos();
RDebugUtils.currentLine=2883621;
 //BA.debugLineNum = 2883621;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
_jobempresainfo = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2883622;
 //BA.debugLineNum = 2883622;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
_jobempresainfo._initialize /*String*/ (null,processBA,"JobEmpresaInfo",principal.getObject());
RDebugUtils.currentLine=2883623;
 //BA.debugLineNum = 2883623;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos";
_jobempresainfo._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_datos_preferencia","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(_idempresa)));
 };
RDebugUtils.currentLine=2883626;
 //BA.debugLineNum = 2883626;BA.debugLine="If SendClickFav Then";
if (_sendclickfav) { 
RDebugUtils.currentLine=2883627;
 //BA.debugLineNum = 2883627;BA.debugLine="btnMasVendido_Click";
_btnmasvendido_click();
RDebugUtils.currentLine=2883628;
 //BA.debugLineNum = 2883628;BA.debugLine="SendClickFav = False";
_sendclickfav = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2883631;
 //BA.debugLineNum = 2883631;BA.debugLine="If SendClickAbout Then";
if (_sendclickabout) { 
RDebugUtils.currentLine=2883632;
 //BA.debugLineNum = 2883632;BA.debugLine="mostrarAbout";
_mostrarabout();
RDebugUtils.currentLine=2883633;
 //BA.debugLineNum = 2883633;BA.debugLine="SendClickAbout = False";
_sendclickabout = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=2883636;
 //BA.debugLineNum = 2883636;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=2883637;
 //BA.debugLineNum = 2883637;BA.debugLine="sm.Initialize(Activity,Me,\"SlideMenu\",8%y,75%x,";
mostCurrent._sm._initialize /*String*/ (null,mostCurrent.activityBA,mostCurrent._activity,principal.getObject(),"SlideMenu",anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (8),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (75),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (230),(int) (255),(int) (250),(int) (250)));
RDebugUtils.currentLine=2883638;
 //BA.debugLineNum = 2883638;BA.debugLine="funcion.GenerarSlideMenu(sm)";
mostCurrent._funcion._generarslidemenu /*String*/ (mostCurrent.activityBA,mostCurrent._sm);
 };
RDebugUtils.currentLine=2883642;
 //BA.debugLineNum = 2883642;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=2883643;
 //BA.debugLineNum = 2883643;BA.debugLine="btnIniciarSecion.Text = \"Sr. \"&Main.usersData.no";
mostCurrent._btniniciarsecion.setText(BA.ObjectToCharSequence("Sr. "+mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .nombre /*String*/ ));
 };
RDebugUtils.currentLine=2883647;
 //BA.debugLineNum = 2883647;BA.debugLine="keyotraparte = True";
_keyotraparte = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2883648;
 //BA.debugLineNum = 2883648;BA.debugLine="End Sub";
return "";
}
public static String  _btnmasvendido_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmasvendido_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmasvendido_click", null));}
String _json = "";
com.jq.pedidos.httpjob _jobfavoritos = null;
int _res = 0;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub btnMasVendido_Click";
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="If PanelFondoFavorito.IsInitialized = False Then";
if (mostCurrent._panelfondofavorito.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="Activity.LoadLayout(\"frmProductosFavoritos\")";
mostCurrent._activity.LoadLayout("frmProductosFavoritos",mostCurrent.activityBA);
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="PanelFondoFavorito.Visible = False";
mostCurrent._panelfondofavorito.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.ItemHeight =";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.TextCol";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.TextSiz";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.Typefac";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.Label.Padding";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=3145743;
 //BA.debugLineNum = 3145743;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.T";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=3145744;
 //BA.debugLineNum = 3145744;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.T";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=3145745;
 //BA.debugLineNum = 3145745;BA.debugLine="LlistaFavoritos.TwoLinesAndBitmap.SecondLabel.H";
mostCurrent._llistafavoritos.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=3145746;
 //BA.debugLineNum = 3145746;BA.debugLine="funcion.SetDivider(LlistaFavoritos,Colors.Light";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._llistafavoritos,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=3145750;
 //BA.debugLineNum = 3145750;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(250,True)";
mostCurrent._panelfondofavorito.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145752;
 //BA.debugLineNum = 3145752;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.users";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idempresa':"+BA.NumberToString(_idempresa);
RDebugUtils.currentLine=3145754;
 //BA.debugLineNum = 3145754;BA.debugLine="Dim jobFavoritos As HttpJob";
_jobfavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=3145755;
 //BA.debugLineNum = 3145755;BA.debugLine="jobFavoritos.Initialize(\"RefreshFavoritos\",Me)";
_jobfavoritos._initialize /*String*/ (null,processBA,"RefreshFavoritos",principal.getObject());
RDebugUtils.currentLine=3145756;
 //BA.debugLineNum = 3145756;BA.debugLine="ToastMessageShow(\"Cargando sus Favoritos\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Cargando sus Favoritos"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145757;
 //BA.debugLineNum = 3145757;BA.debugLine="jobFavoritos.PostString(Main.url&\"puntoventa/bus";
_jobfavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/buscarfav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=3145759;
 //BA.debugLineNum = 3145759;BA.debugLine="PanelMenu.Visible = False";
mostCurrent._panelmenu.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3145760;
 //BA.debugLineNum = 3145760;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(250,True)";
mostCurrent._panelfondofavorito.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3145762;
 //BA.debugLineNum = 3145762;BA.debugLine="lblCantProductos.Text = \"Productos Favoritos: \"&";
mostCurrent._lblcantproductos.setText(BA.ObjectToCharSequence("Productos Favoritos: "+BA.NumberToString(_listafavoritos.getSize())));
RDebugUtils.currentLine=3145764;
 //BA.debugLineNum = 3145764;BA.debugLine="isfav = True";
_isfav = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=3145768;
 //BA.debugLineNum = 3145768;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=3145770;
 //BA.debugLineNum = 3145770;BA.debugLine="res = Msgbox2(\"Para buscar en sus productos fav";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para buscar en sus productos favoritos primero debe iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar sesión"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=3145772;
 //BA.debugLineNum = 3145772;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3145773;
 //BA.debugLineNum = 3145773;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3145774;
 //BA.debugLineNum = 3145774;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=3145777;
 //BA.debugLineNum = 3145777;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=3145783;
 //BA.debugLineNum = 3145783;BA.debugLine="End Sub";
return "";
}
public static String  _mostrarabout() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "mostrarabout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "mostrarabout", null));}
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub mostrarAbout";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="If PanelFondoAboutus.IsInitialized == False Then";
if (mostCurrent._panelfondoaboutus.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Activity.LoadLayout(\"frmAboutUs\")";
mostCurrent._activity.LoadLayout("frmAboutUs",mostCurrent.activityBA);
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="PanelFondoAboutus.Visible = False";
mostCurrent._panelfondoaboutus.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="PanelMenu.SetVisibleAnimated(250,False)";
mostCurrent._panelmenu.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="PanelFondoAboutus.SetVisibleAnimated(250,True)";
mostCurrent._panelfondoaboutus.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddpro_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaddpro_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaddpro_click", null));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub btnAddPro_Click";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="b.Initialize(\"\")";
_b.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=1966086;
 //BA.debugLineNum = 1966086;BA.debugLine="b = Sender";
_b.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=1966088;
 //BA.debugLineNum = 1966088;BA.debugLine="mapa = b.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=1966090;
 //BA.debugLineNum = 1966090;BA.debugLine="If mapa.Get(\"f_precio\") <= 0 Then";
if ((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio"))))<=0) { 
RDebugUtils.currentLine=1966092;
 //BA.debugLineNum = 1966092;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=1966095;
 //BA.debugLineNum = 1966095;BA.debugLine="mapaDetalle.Initialize";
_mapadetalle.Initialize();
RDebugUtils.currentLine=1966096;
 //BA.debugLineNum = 1966096;BA.debugLine="salvar_detalle_temporal(mapa,1)";
_salvar_detalle_temporal(_mapa,(int) (1));
 };
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="End Sub";
return "";
}
public static String  _salvar_detalle_temporal(anywheresoftware.b4a.objects.collections.Map _map,int _cantidad) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "salvar_detalle_temporal", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "salvar_detalle_temporal", new Object[] {_map,_cantidad}));}
anywheresoftware.b4a.objects.collections.Map _mapcalculos = null;
String _json = "";
com.jq.pedidos.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),0,_cantidad,(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax")))),_impuestoincluido,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_tipo':1"+",'f_idproducto':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_cantidad':"+BA.NumberToString(_cantidad)+""+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_diferencia':0"+",'f_porciento_descuento':0"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_tax")))+",'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=2818067;
 //BA.debugLineNum = 2818067;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",principal.getObject());
RDebugUtils.currentLine=2818069;
 //BA.debugLineNum = 2818069;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=2818071;
 //BA.debugLineNum = 2818071;BA.debugLine="End Sub";
return "";
}
public static void  _btnagregarcarritodetalle_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnagregarcarritodetalle_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnagregarcarritodetalle_click", null); return;}
ResumableSub_btnagregarCarritoDetalle_Click rsub = new ResumableSub_btnagregarCarritoDetalle_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnagregarCarritoDetalle_Click extends BA.ResumableSub {
public ResumableSub_btnagregarCarritoDetalle_Click(com.jq.pedidos.principal parent) {
this.parent = parent;
}
com.jq.pedidos.principal parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If lblcantidad.Text < 1 Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((double)(Double.parseDouble(parent.mostCurrent._lblcantidad.getText()))<1) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="Msgbox(\"Si va ha agregar este producto debe sele";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Si va ha agregar este producto debe seleccionar por lo menos una unidad"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="If mapaDetalle.Get(\"f_precio\") <= 0 Then";

case 4:
//if
this.state = 9;
if ((double)(BA.ObjectToNumber(parent._mapadetalle.Get((Object)("f_precio"))))<=0) { 
this.state = 6;
}else {
this.state = 8;
}if (true) break;

case 6:
//C
this.state = 9;
RDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
 if (true) break;

case 8:
//C
this.state = 9;
RDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="salvar_detalle_temporal(mapaDetalle,lblcantidad.";
_salvar_detalle_temporal(parent._mapadetalle,(int)(Double.parseDouble(parent.mostCurrent._lblcantidad.getText())));
RDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "btnagregarcarritodetalle_click"),(int) (200));
this.state = 10;
return;
case 10:
//C
this.state = 9;
;
RDebugUtils.currentLine=2359310;
 //BA.debugLineNum = 2359310;BA.debugLine="btnBackDetalles_Click";
_btnbackdetalles_click();
 if (true) break;

case 9:
//C
this.state = -1;
;
RDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnbackdetalles_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackdetalles_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnbackdetalles_click", null); return;}
ResumableSub_btnBackDetalles_Click rsub = new ResumableSub_btnBackDetalles_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnBackDetalles_Click extends BA.ResumableSub {
public ResumableSub_btnBackDetalles_Click(com.jq.pedidos.principal parent) {
this.parent = parent;
}
com.jq.pedidos.principal parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If actu Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._actu) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="BuscarFavoritos";
_buscarfavoritos();
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="actu = False";
parent._actu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="ToastMessageShow(\"Actualizando sus productos\",Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Actualizando sus productos"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "btnbackdetalles_click"),(int) (200));
this.state = 13;
return;
case 13:
//C
this.state = 4;
;
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
parent.mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="PanelMenu.SetVisibleAnimated(500,True)";
parent.mostCurrent._panelmenu.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293769;
 //BA.debugLineNum = 2293769;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="If isfav Then";

case 4:
//if
this.state = 7;
if (parent._isfav) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
parent.mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(500,True)";
parent.mostCurrent._panelfondofavorito.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="If ismodal Then";

case 7:
//if
this.state = 12;
if (parent._ismodal) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 12;
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
parent.mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="PanelMenu.SetVisibleAnimated(500,True)";
parent.mostCurrent._panelmenu.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="PanelModalProducto.SetVisibleAnimated(500,True)";
parent.mostCurrent._panelmodalproducto.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=2293785;
 //BA.debugLineNum = 2293785;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,False)";
parent.mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="PanelMenu.SetVisibleAnimated(500,True)";
parent.mostCurrent._panelmenu.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 12:
//C
this.state = -1;
;
RDebugUtils.currentLine=2293789;
 //BA.debugLineNum = 2293789;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnbackaboutus_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackaboutus_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackaboutus_click", null));}
RDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub btnBackAboutus_Click";
RDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="PanelFondoAboutus.SetVisibleAnimated(250,False)";
mostCurrent._panelfondoaboutus.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="PanelMenu.SetVisibleAnimated(250,True)";
mostCurrent._panelmenu.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackfavoritos_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackfavoritos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackfavoritos_click", null));}
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub btnBackFavoritos_Click";
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="isfav = False";
_isfav = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="LlistaFavoritos.Clear";
mostCurrent._llistafavoritos.Clear();
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="PanelFondoFavorito.Visible = False";
mostCurrent._panelfondofavorito.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="PanelMenu.SetVisibleAnimated(250,True)";
mostCurrent._panelmenu.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="If actualizame Then";
if (_actualizame) { 
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="cargarDatos";
_cargardatos();
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="actualizame = False";
_actualizame = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="End Sub";
return "";
}
public static String  _btnbuscarproducto_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbuscarproducto_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbuscarproducto_click", null));}
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub btnBuscarProducto_Click";
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="If PanelModalProducto.IsInitialized = False Then";
if (mostCurrent._panelmodalproducto.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Activity.LoadLayout(\"frmProducoModal\")";
mostCurrent._activity.LoadLayout("frmProducoModal",mostCurrent.activityBA);
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.ItemHei";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.P";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=3670028;
 //BA.debugLineNum = 3670028;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="funcion.SetDivider( ListProductosModalView,Color";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listproductosmodalview,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="PanelModalProducto.Visible = False";
mostCurrent._panelmodalproducto.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="funcion.DisableView(False,PanelModalProducto)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmodalproducto);
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,True)";
mostCurrent._panelmodalproducto.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="funcion.DisableView(True,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmenu);
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="txtBuscarProducto.RequestFocus";
mostCurrent._txtbuscarproducto.RequestFocus();
RDebugUtils.currentLine=3670041;
 //BA.debugLineNum = 3670041;BA.debugLine="End Sub";
return "";
}
public static String  _btnempresainfo_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnempresainfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnempresainfo_click", null));}
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub btnEmpresaInfo_Click";
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="If  mapEmpresaInfo.IsInitialized =False Or mapEmp";
if (_mapempresainfo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _mapempresainfo== null) { 
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Msgbox(\"Buscando información del negocio...\",\"In";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Buscando información del negocio..."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="If PanelInfoBack.IsInitialized = False Then";
if (mostCurrent._panelinfoback.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Activity.LoadLayout(\"frmInfoEmpresa\")";
mostCurrent._activity.LoadLayout("frmInfoEmpresa",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3473418;
 //BA.debugLineNum = 3473418;BA.debugLine="PanelInfoBack.Visible = False";
mostCurrent._panelinfoback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,True)";
mostCurrent._panelinfoback.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="funcion.DisableView(True,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmenu);
RDebugUtils.currentLine=3473422;
 //BA.debugLineNum = 3473422;BA.debugLine="funcion.DisableView(False,PanelInfoBack)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelinfoback);
RDebugUtils.currentLine=3473424;
 //BA.debugLineNum = 3473424;BA.debugLine="lblInfoEmpresa.Text = mapEmpresaInfo.Get(\"f_nombr";
mostCurrent._lblinfoempresa.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_nombre"))));
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="lblInfoNegocio.Text = mapEmpresaInfo.Get(\"f_tipo_";
mostCurrent._lblinfonegocio.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_tipo_negocio"))));
RDebugUtils.currentLine=3473426;
 //BA.debugLineNum = 3473426;BA.debugLine="lblPedidoMinimo.Text =  \"RD$ \"&mapEmpresaInfo.Get";
mostCurrent._lblpedidominimo.setText(BA.ObjectToCharSequence("RD$ "+BA.ObjectToString(_mapempresainfo.Get((Object)("f_pedidos_minimos")))));
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="lblTelefono.Text = mapEmpresaInfo.Get(\"f_telefono";
mostCurrent._lbltelefono.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_telefono"))));
RDebugUtils.currentLine=3473428;
 //BA.debugLineNum = 3473428;BA.debugLine="lblDireccion.Text = mapEmpresaInfo.Get(\"f_direcci";
mostCurrent._lbldireccion.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_direccion"))));
RDebugUtils.currentLine=3473430;
 //BA.debugLineNum = 3473430;BA.debugLine="End Sub";
return "";
}
public static String  _btninfocerrar_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninfocerrar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btninfocerrar_click", null));}
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub btnInfoCerrar_Click";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,False)";
mostCurrent._panelinfoback.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="funcion.DisableView(False,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmenu);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="funcion.DisableView(True,PanelInfoBack)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelinfoback);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="End Sub";
return "";
}
public static String  _btniniciarsecion_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btniniciarsecion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btniniciarsecion_click", null));}
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="Sub btnIniciarSecion_Click";
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
 }else {
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 };
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="End Sub";
return "";
}
public static String  _btnless_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnless_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnless_click", null));}
int _num = 0;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btnless_Click";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Dim num As Int = lblcantidad.Text";
_num = (int)(Double.parseDouble(mostCurrent._lblcantidad.getText()));
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="lblcantidad.Text = num - 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(_num-1));
RDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return "";
}
public static String  _btnmore_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmore_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmore_click", null));}
int _num = 0;
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btnMore_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim num As Int = lblcantidad.Text";
_num = (int)(Double.parseDouble(mostCurrent._lblcantidad.getText()));
RDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="lblcantidad.Text = num + 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(_num+1));
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="End Sub";
return "";
}
public static String  _btnorden_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnorden_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnorden_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub btnOrden_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="StartActivity(Facturacion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._facturacion.getObject()));
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _btnprincipalback_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnprincipalback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnprincipalback_click", null));}
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub btnPrincipalBack_Click";
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="sm.Show";
mostCurrent._sm._show /*String*/ (null);
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="End Sub";
return "";
}
public static String  _btnproductobuscarmodal_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnproductobuscarmodal_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnproductobuscarmodal_click", null));}
String _json = "";
com.jq.pedidos.httpjob _jobbuscarproducto = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub btnProductoBuscarModal_Click";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
if (mostCurrent._txtbuscarproducto.getText().trim().length()==0) { 
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Escriba el nombre del producto"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=3932166;
 //BA.debugLineNum = 3932166;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_parametro':'"+mostCurrent._txtbuscarproducto.getText().replace("'","").replace("\"","")+"'";
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="Dim JobBuscarProducto As HttpJob";
_jobbuscarproducto = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProductoLi";
_jobbuscarproducto._initialize /*String*/ (null,processBA,"JobBuscarProductoLista",principal.getObject());
RDebugUtils.currentLine=3932171;
 //BA.debugLineNum = 3932171;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
_jobbuscarproducto._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_by_paramentros","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="btnProductoBuscarModal.Enabled = False";
mostCurrent._btnproductobuscarmodal.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="End Sub";
return "";
}
public static String  _btnproductovolver_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnproductovolver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnproductovolver_click", null));}
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub btnProductoVolver_Click";
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="funcion.DisableView(True,PanelModalProducto)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmodalproducto);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="funcion.DisableView(False,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmenu);
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,False)";
mostCurrent._panelmodalproducto.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3866630;
 //BA.debugLineNum = 3866630;BA.debugLine="txtBuscarProducto.Text = \"\"";
mostCurrent._txtbuscarproducto.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="ListProductosModalView.Clear";
mostCurrent._listproductosmodalview.Clear();
RDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="End Sub";
return "";
}
public static String  _btnslidevolver_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnslidevolver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnslidevolver_click", null));}
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub btnSlideVolver_Click";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="End Sub";
return "";
}
public static String  _openslide() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openslide", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openslide", null));}
double _position = 0;
double _duration = 0;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub openSlide";
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim position,duration As Double";
_position = 0;
_duration = 0;
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="If PanelSlideBack.IsInitialized= False Then";
if (mostCurrent._panelslideback.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="Activity.LoadLayout(\"frmSlideOrden\")";
mostCurrent._activity.LoadLayout("frmSlideOrden",mostCurrent.activityBA);
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="PanelSlideBack.Visible = False";
mostCurrent._panelslideback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="PanelSlideBack.Tag = PanelSlide.Top";
mostCurrent._panelslideback.setTag((Object)(mostCurrent._panelslide.getTop()));
 };
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="If PanelSlideBack.Visible Then";
if (mostCurrent._panelslideback.getVisible()) { 
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="duration = 250";
_duration = 250;
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="position = -PanelSlideBack.Tag -PanelSlide.Heigh";
_position = -(double)(BA.ObjectToNumber(mostCurrent._panelslideback.getTag()))-mostCurrent._panelslide.getHeight();
 }else {
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="PanelSlide.Top = 100%y";
mostCurrent._panelslide.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=3997713;
 //BA.debugLineNum = 3997713;BA.debugLine="position = -70%y";
_position = -anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA);
RDebugUtils.currentLine=3997714;
 //BA.debugLineNum = 3997714;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,True)";
mostCurrent._panelslideback.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="duration = 251";
_duration = 251;
 };
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="a.InitializeTranslate(\"Slide\",0,0,0,position)";
_a.InitializeTranslate(mostCurrent.activityBA,"Slide",(float) (0),(float) (0),(float) (0),(float) (_position));
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="a.Duration = duration";
_a.setDuration((long) (_duration));
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="a.Start(PanelSlide)";
_a.Start((android.view.View)(mostCurrent._panelslide.getObject()));
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="End Sub";
return "";
}
public static String  _btnviewcategoria_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnviewcategoria_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnviewcategoria_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
com.jq.pedidos.httpjob _jobproductobycategoria = null;
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub btnViewCategoria_Click";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="b = Sender";
_b.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="Dim map As Map = b.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="Dim json As String = \"'f_idempresa':\"&idEmpresa&\"";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_idcategoria':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Dim JobProductoByCategoria As HttpJob";
_jobproductobycategoria = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="JobProductoByCategoria.Initialize(\"JobProductoByC";
_jobproductobycategoria._initialize /*String*/ (null,processBA,"JobProductoByCategoria",principal.getObject());
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="JobProductoByCategoria.PostString(Main.url&\"ws/ge";
_jobproductobycategoria._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_by_categoria","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="End Sub";
return "";
}
public static String  _btnviewproducto_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnviewproducto_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnviewproducto_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub btnViewProducto_Click";
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="If mapEmpresaInfo.IsInitialized And mapEmpresaInf";
if (_mapempresainfo.IsInitialized() && (_mapempresainfo.Get((Object)("f_laborando"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Msgbox(\"No estamos laborando en estos momentos.";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="Dim map As Map = b.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="salvar_detalle_temporal(map,1)";
_salvar_detalle_temporal(_map,(int) (1));
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="End Sub";
return "";
}
public static String  _cargarallproductos() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarallproductos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarallproductos", null));}
String _json = "";
com.jq.pedidos.httpjob _jobbuscarproducto = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub cargarAllProductos";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_parametro':'%'";
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="Dim JobBuscarProducto As HttpJob";
_jobbuscarproducto = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
_jobbuscarproducto._initialize /*String*/ (null,processBA,"JobBuscarProducto",principal.getObject());
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
_jobbuscarproducto._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_by_paramentros","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="End Sub";
return "";
}
public static String  _cargarcaterorias() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarcaterorias", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarcaterorias", null));}
com.jq.pedidos.httpjob _jobcategoria = null;
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub cargarCaterorias";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim JobCategoria As HttpJob";
_jobcategoria = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="JobCategoria.Initialize(\"JobCategoria\",Me)";
_jobcategoria._initialize /*String*/ (null,processBA,"JobCategoria",principal.getObject());
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="JobCategoria.PostString(Main.url&\"ws/get_categori";
_jobcategoria._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_categorias_by_empresa/","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(_idempresa)));
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="btnMasVendido.Text = \"Ver ofertas \"";
mostCurrent._btnmasvendido.setText(BA.ObjectToCharSequence("Ver ofertas "));
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="btnMasVendido.Tag = False";
mostCurrent._btnmasvendido.setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="End Sub";
return "";
}
public static String  _cargarmasvendido() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarmasvendido", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarmasvendido", null));}
String _json = "";
com.jq.pedidos.httpjob _jobproductomasvendido = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub cargarMasVendido";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa);
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
_jobproductomasvendido = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMasV";
_jobproductomasvendido._initialize /*String*/ (null,processBA,"JobProductoMasVendido",principal.getObject());
RDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="JobProductoMasVendido.PostString(Main.url&\"ws/get";
_jobproductomasvendido._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_main_page","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="End Sub";
return "";
}
public static String  _cargarlistafavoritos() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarlistafavoritos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarlistafavoritos", null));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapalist = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub cargarListaFavoritos";
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="LlistaFavoritos.Clear";
mostCurrent._llistafavoritos.Clear();
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="lblCantProductos.Text = \"Productos Favoritos: \"&l";
mostCurrent._lblcantproductos.setText(BA.ObjectToCharSequence("Productos Favoritos: "+BA.NumberToString(_listafavoritos.getSize())));
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="For i = 0 To listafavoritos.Size-1";
{
final int step4 = 1;
final int limit4 = (int) (_listafavoritos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="Dim mapalist As Map";
_mapalist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="mapalist = listafavoritos.Get(i)";
_mapalist.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listafavoritos.Get(_i)));
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="If  mapalist.Get(\"f_foto\")<> Null And  mapalist.";
if (_mapalist.Get((Object)("f_foto"))!= null && (_mapalist.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapalist.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 };
RDebugUtils.currentLine=3211280;
 //BA.debugLineNum = 3211280;BA.debugLine="mapalist.Put(\"f_red\",True)";
_mapalist.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=3211282;
 //BA.debugLineNum = 3211282;BA.debugLine="LlistaFavoritos.AddTwoLinesAndBitmap2(mapalist.G";
mostCurrent._llistafavoritos.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_mapalist.Get((Object)("f_descripcion"))),BA.ObjectToCharSequence("Precio: "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapalist.Get((Object)("f_precio")))),(int) (0),(int) (2))),_bm.getBitmap(),(Object)(_mapalist.getObject()));
 }
};
RDebugUtils.currentLine=3211286;
 //BA.debugLineNum = 3211286;BA.debugLine="End Sub";
return "";
}
public static String  _cargarviewproductos(anywheresoftware.b4a.objects.collections.List _list,boolean _categorias) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarviewproductos", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarviewproductos", new Object[] {_list,_categorias}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
int _height = 0;
int _panelheight = 0;
int _i = 0;
anywheresoftware.b4a.objects.ButtonWrapper _btn = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub cargarViewProductos(list As List, categorias A";
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim height,  panelHeight As Int";
_height = 0;
_panelheight = 0;
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="panelHeight = 2%y";
_panelheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="height = 18%y";
_height = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (18),mostCurrent.activityBA);
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
mostCurrent._viewcategoria.getPanel().RemoveAllViews();
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="ViewCategoria.Tag = categorias";
mostCurrent._viewcategoria.setTag((Object)(_categorias));
RDebugUtils.currentLine=2621449;
 //BA.debugLineNum = 2621449;BA.debugLine="ViewCategoria.Panel.Height = 100%y";
mostCurrent._viewcategoria.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="For i=0 To list.Size -1";
{
final int step8 = 1;
final int limit8 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=2621453;
 //BA.debugLineNum = 2621453;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=2621454;
 //BA.debugLineNum = 2621454;BA.debugLine="If categorias Then";
if (_categorias) { 
RDebugUtils.currentLine=2621455;
 //BA.debugLineNum = 2621455;BA.debugLine="btn.Initialize(\"btnViewCategoria\")";
_btn.Initialize(mostCurrent.activityBA,"btnViewCategoria");
 }else {
RDebugUtils.currentLine=2621457;
 //BA.debugLineNum = 2621457;BA.debugLine="btn.Initialize(\"btnViewProducto\")";
_btn.Initialize(mostCurrent.activityBA,"btnViewProducto");
 };
RDebugUtils.currentLine=2621460;
 //BA.debugLineNum = 2621460;BA.debugLine="btn.Tag = map";
_btn.setTag((Object)(_map.getObject()));
RDebugUtils.currentLine=2621461;
 //BA.debugLineNum = 2621461;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=2621462;
 //BA.debugLineNum = 2621462;BA.debugLine="btn.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
_btn.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=2621465;
 //BA.debugLineNum = 2621465;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2621466;
 //BA.debugLineNum = 2621466;BA.debugLine="If categorias Then";
if (_categorias) { 
RDebugUtils.currentLine=2621467;
 //BA.debugLineNum = 2621467;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fot";
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=2621468;
 //BA.debugLineNum = 2621468;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=2621470;
 //BA.debugLineNum = 2621470;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"cook-";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cook-food.jpeg").getObject()));
RDebugUtils.currentLine=2621471;
 //BA.debugLineNum = 2621471;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
RDebugUtils.currentLine=2621473;
 //BA.debugLineNum = 2621473;BA.debugLine="btn.Text = map.Get(\"f_descripcion\")";
_btn.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=2621474;
 //BA.debugLineNum = 2621474;BA.debugLine="btn.TextSize = 20";
_btn.setTextSize((float) (20));
 }else {
RDebugUtils.currentLine=2621476;
 //BA.debugLineNum = 2621476;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pexels";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pexels-photo.jpeg").getObject()));
RDebugUtils.currentLine=2621477;
 //BA.debugLineNum = 2621477;BA.debugLine="bm.Gravity = Gravity.CENTER";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=2621478;
 //BA.debugLineNum = 2621478;BA.debugLine="btn.Text = map.Get(\"f_descripcion\") &CRLF&CRLF&";
_btn.setText(BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("f_descripcion")))+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"RD$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=2621479;
 //BA.debugLineNum = 2621479;BA.debugLine="btn.TextSize = 15";
_btn.setTextSize((float) (15));
 };
RDebugUtils.currentLine=2621481;
 //BA.debugLineNum = 2621481;BA.debugLine="btn.Background = bm";
_btn.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=2621483;
 //BA.debugLineNum = 2621483;BA.debugLine="ViewCategoria.Panel.AddView(btn,2%x, panelHeight";
mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(_btn.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),_panelheight,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=2621484;
 //BA.debugLineNum = 2621484;BA.debugLine="btn.Visible = False";
_btn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2621485;
 //BA.debugLineNum = 2621485;BA.debugLine="btn.SetVisibleAnimated(500,True)";
_btn.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2621487;
 //BA.debugLineNum = 2621487;BA.debugLine="panelHeight = height + panelHeight + 2%y";
_panelheight = (int) (_height+_panelheight+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA));
 }
};
RDebugUtils.currentLine=2621489;
 //BA.debugLineNum = 2621489;BA.debugLine="ViewCategoria.Panel.Height = panelHeight";
mostCurrent._viewcategoria.getPanel().setHeight(_panelheight);
RDebugUtils.currentLine=2621490;
 //BA.debugLineNum = 2621490;BA.debugLine="End Sub";
return "";
}
public static String  _imgdetallefav_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgdetallefav_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgdetallefav_click", null));}
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
int _r = 0;
anywheresoftware.b4a.objects.collections.List _listaaux = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapadel = null;
String _json = "";
com.jq.pedidos.httpjob _deletefavoritos = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmaux = null;
com.jq.pedidos.httpjob _putfavoritos = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub imgdetallefav_Click";
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="If imgfavDetalle Then";
if (_imgfavdetalle) { 
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="img  = Sender";
_img.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="mapa = img.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_img.getTag()));
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="If mapa.Get(\"f_red\") Then";
if (BA.ObjectToBoolean(_mapa.Get((Object)("f_red")))) { 
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=3276816;
 //BA.debugLineNum = 3276816;BA.debugLine="r = Msgbox2(\"Desea eliminar este producto de s";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Desea eliminar este producto de su lista de favoritos?"),BA.ObjectToCharSequence("Aviso"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=3276818;
 //BA.debugLineNum = 3276818;BA.debugLine="If r == DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=3276820;
 //BA.debugLineNum = 3276820;BA.debugLine="Dim listaaux As List";
_listaaux = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3276821;
 //BA.debugLineNum = 3276821;BA.debugLine="listaaux.Initialize";
_listaaux.Initialize();
RDebugUtils.currentLine=3276823;
 //BA.debugLineNum = 3276823;BA.debugLine="For i=0 To listafavoritos.Size-1";
{
final int step13 = 1;
final int limit13 = (int) (_listafavoritos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=3276825;
 //BA.debugLineNum = 3276825;BA.debugLine="Dim mapadel As Map";
_mapadel = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3276826;
 //BA.debugLineNum = 3276826;BA.debugLine="mapadel = listafavoritos.Get(i)";
_mapadel.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listafavoritos.Get(_i)));
RDebugUtils.currentLine=3276828;
 //BA.debugLineNum = 3276828;BA.debugLine="If mapa.Get(\"f_idrecord\") <> mapadel.Get(\"f_";
if ((_mapa.Get((Object)("f_idrecord"))).equals(_mapadel.Get((Object)("f_idrecord"))) == false) { 
RDebugUtils.currentLine=3276830;
 //BA.debugLineNum = 3276830;BA.debugLine="listaaux.Add(mapadel)";
_listaaux.Add((Object)(_mapadel.getObject()));
 };
 }
};
RDebugUtils.currentLine=3276835;
 //BA.debugLineNum = 3276835;BA.debugLine="listafavoritos.Clear";
_listafavoritos.Clear();
RDebugUtils.currentLine=3276836;
 //BA.debugLineNum = 3276836;BA.debugLine="listafavoritos = listaaux";
_listafavoritos = _listaaux;
RDebugUtils.currentLine=3276838;
 //BA.debugLineNum = 3276838;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.us";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapa.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=3276841;
 //BA.debugLineNum = 3276841;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=3276842;
 //BA.debugLineNum = 3276842;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",";
_deletefavoritos._initialize /*String*/ (null,processBA,"deleteFavoritos",principal.getObject());
RDebugUtils.currentLine=3276843;
 //BA.debugLineNum = 3276843;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoven";
_deletefavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/deletefav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=3276845;
 //BA.debugLineNum = 3276845;BA.debugLine="cargarListaFavoritos";
_cargarlistafavoritos();
RDebugUtils.currentLine=3276846;
 //BA.debugLineNum = 3276846;BA.debugLine="isfav = True";
_isfav = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3276847;
 //BA.debugLineNum = 3276847;BA.debugLine="imgfavDetalle= False";
_imgfavdetalle = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=3276848;
 //BA.debugLineNum = 3276848;BA.debugLine="actualizame = True";
_actualizame = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3276849;
 //BA.debugLineNum = 3276849;BA.debugLine="btnBackDetalles_Click";
_btnbackdetalles_click();
 }else {
RDebugUtils.currentLine=3276852;
 //BA.debugLineNum = 3276852;BA.debugLine="Return";
if (true) return "";
 };
 };
 }else {
RDebugUtils.currentLine=3276860;
 //BA.debugLineNum = 3276860;BA.debugLine="Dim bmaux As BitmapDrawable";
_bmaux = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=3276861;
 //BA.debugLineNum = 3276861;BA.debugLine="If mapaDetalle.Get(\"f_red\") Then";
if (BA.ObjectToBoolean(_mapadetalle.Get((Object)("f_red")))) { 
RDebugUtils.currentLine=3276863;
 //BA.debugLineNum = 3276863;BA.debugLine="bmaux.Initialize(LoadBitmap(File.DirAssets,\"he";
_bmaux.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartWhiteandBlack.png").getObject()));
RDebugUtils.currentLine=3276864;
 //BA.debugLineNum = 3276864;BA.debugLine="bmaux.Gravity = Gravity.FILL";
_bmaux.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=3276866;
 //BA.debugLineNum = 3276866;BA.debugLine="imgdetallefav.Background = bmaux";
mostCurrent._imgdetallefav.setBackground((android.graphics.drawable.Drawable)(_bmaux.getObject()));
RDebugUtils.currentLine=3276868;
 //BA.debugLineNum = 3276868;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.use";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapadetalle.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=3276871;
 //BA.debugLineNum = 3276871;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=3276872;
 //BA.debugLineNum = 3276872;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",M";
_deletefavoritos._initialize /*String*/ (null,processBA,"deleteFavoritos",principal.getObject());
RDebugUtils.currentLine=3276873;
 //BA.debugLineNum = 3276873;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntovent";
_deletefavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/deletefav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=3276875;
 //BA.debugLineNum = 3276875;BA.debugLine="mapaDetalle.Put(\"f_red\",False)";
_mapadetalle.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=3276876;
 //BA.debugLineNum = 3276876;BA.debugLine="actu = True";
_actu = anywheresoftware.b4a.keywords.Common.True;
 }else {
RDebugUtils.currentLine=3276880;
 //BA.debugLineNum = 3276880;BA.debugLine="bmaux.Initialize(LoadBitmap(File.DirAssets,\"he";
_bmaux.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=3276881;
 //BA.debugLineNum = 3276881;BA.debugLine="bmaux.Gravity = Gravity.FILL";
_bmaux.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=3276883;
 //BA.debugLineNum = 3276883;BA.debugLine="imgdetallefav.Background = bmaux";
mostCurrent._imgdetallefav.setBackground((android.graphics.drawable.Drawable)(_bmaux.getObject()));
RDebugUtils.currentLine=3276885;
 //BA.debugLineNum = 3276885;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.use";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapadetalle.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=3276888;
 //BA.debugLineNum = 3276888;BA.debugLine="Dim putFavoritos As HttpJob";
_putfavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=3276889;
 //BA.debugLineNum = 3276889;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
_putfavoritos._initialize /*String*/ (null,processBA,"addFavoritos",principal.getObject());
RDebugUtils.currentLine=3276890;
 //BA.debugLineNum = 3276890;BA.debugLine="putFavoritos.PostString(Main.url&\"puntoventa/a";
_putfavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/addfav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=3276892;
 //BA.debugLineNum = 3276892;BA.debugLine="mapaDetalle.Put(\"f_red\",True)";
_mapadetalle.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=3276893;
 //BA.debugLineNum = 3276893;BA.debugLine="actu = True";
_actu = anywheresoftware.b4a.keywords.Common.True;
 };
 };
 }else {
RDebugUtils.currentLine=3276901;
 //BA.debugLineNum = 3276901;BA.debugLine="Msgbox(\"Para agregar productos a favoritos prim";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Para agregar productos a favoritos primero debe iniciar Sesión"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=3276904;
 //BA.debugLineNum = 3276904;BA.debugLine="End Sub";
return "";
}
public static String  _imgfav_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgfav_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgfav_click", null));}
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
String _json = "";
com.jq.pedidos.httpjob _deletefavoritos = null;
com.jq.pedidos.httpjob _putfavoritos = null;
int _res = 0;
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub imgFav_Click";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=2097156;
 //BA.debugLineNum = 2097156;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=2097157;
 //BA.debugLineNum = 2097157;BA.debugLine="img.Initialize(\"\")";
_img.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="img = Sender";
_img.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="mapa = img.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_img.getTag()));
RDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="mapaDetalleImagen = mapa";
_mapadetalleimagen = _mapa;
RDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="Dim bm As  BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2097169;
 //BA.debugLineNum = 2097169;BA.debugLine="If mapa.Get(\"f_red\") Then";
if (BA.ObjectToBoolean(_mapa.Get((Object)("f_red")))) { 
RDebugUtils.currentLine=2097171;
 //BA.debugLineNum = 2097171;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartW";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartWhiteandBlack.png").getObject()));
RDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="img.Background = bm";
_img.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=2097173;
 //BA.debugLineNum = 2097173;BA.debugLine="mapa.Put(\"f_red\",False)";
_mapa.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=2097175;
 //BA.debugLineNum = 2097175;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapa.Get((Object)("f_idproducto")));
RDebugUtils.currentLine=2097178;
 //BA.debugLineNum = 2097178;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2097179;
 //BA.debugLineNum = 2097179;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me";
_deletefavoritos._initialize /*String*/ (null,processBA,"deleteFavoritos",principal.getObject());
RDebugUtils.currentLine=2097180;
 //BA.debugLineNum = 2097180;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoventa";
_deletefavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/deletefav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=2097185;
 //BA.debugLineNum = 2097185;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartR";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=2097186;
 //BA.debugLineNum = 2097186;BA.debugLine="img.Background = bm";
_img.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=2097187;
 //BA.debugLineNum = 2097187;BA.debugLine="mapa.Put(\"f_red\",True)";
_mapa.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=2097189;
 //BA.debugLineNum = 2097189;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapa.Get((Object)("f_idproducto")));
RDebugUtils.currentLine=2097192;
 //BA.debugLineNum = 2097192;BA.debugLine="Dim putFavoritos As HttpJob";
_putfavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=2097193;
 //BA.debugLineNum = 2097193;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
_putfavoritos._initialize /*String*/ (null,processBA,"addFavoritos",principal.getObject());
RDebugUtils.currentLine=2097194;
 //BA.debugLineNum = 2097194;BA.debugLine="putFavoritos.PostString(Main.url&\"puntoventa/ad";
_putfavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/addfav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 };
 }else {
RDebugUtils.currentLine=2097200;
 //BA.debugLineNum = 2097200;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=2097202;
 //BA.debugLineNum = 2097202;BA.debugLine="res = Msgbox2(\"Para agregar un producto a favori";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para agregar un producto a favoritos primero debe iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar sesión"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=2097204;
 //BA.debugLineNum = 2097204;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=2097205;
 //BA.debugLineNum = 2097205;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=2097206;
 //BA.debugLineNum = 2097206;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=2097209;
 //BA.debugLineNum = 2097209;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=2097213;
 //BA.debugLineNum = 2097213;BA.debugLine="End Sub";
return "";
}
public static void  _jobdone(com.jq.pedidos.httpjob _job) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}); return;}
ResumableSub_JobDone rsub = new ResumableSub_JobDone(null,_job);
rsub.resume(processBA, null);
}
public static class ResumableSub_JobDone extends BA.ResumableSub {
public ResumableSub_JobDone(com.jq.pedidos.principal parent,com.jq.pedidos.httpjob _job) {
this.parent = parent;
this._job = _job;
}
com.jq.pedidos.principal parent;
com.jq.pedidos.httpjob _job;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
int _lef = 0;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
int _widhth = 0;
int _i = 0;
anywheresoftware.b4a.objects.LabelWrapper _lblmasvendidos = null;
anywheresoftware.b4a.objects.LabelWrapper _lblproductos = null;
int _alttop = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
int _lefpro = 0;
anywheresoftware.b4a.objects.collections.Map _mapalist = null;
int step56;
int limit56;
int step83;
int limit83;
int step107;
int limit107;
int step135;
int limit135;
int step162;
int limit162;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If btnProductoBuscarModal.IsInitialized And btnPr";
if (true) break;

case 1:
//if
this.state = 4;
if (parent.mostCurrent._btnproductobuscarmodal.IsInitialized() && parent.mostCurrent._btnproductobuscarmodal.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="btnProductoBuscarModal.Enabled = True";
parent.mostCurrent._btnproductobuscarmodal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;
;
RDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="If Job.Success = False Then";

case 4:
//if
this.state = 7;
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(parent.mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(parent.mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
RDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";

case 7:
//if
this.state = 10;
if (parent.mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
this.state = 9;
}if (true) break;

case 9:
//C
this.state = 10;
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 10:
//C
this.state = 11;
;
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2490385;
 //BA.debugLineNum = 2490385;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=2490386;
 //BA.debugLineNum = 2490386;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(parent.mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="Log(\"KLOK\"&funcion.base64_Decode(Job.GetString))";
anywheresoftware.b4a.keywords.Common.LogImpl("62490387","KLOK"+parent.mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)),0);
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="Select Job.JobName";
if (true) break;

case 11:
//select
this.state = 140;
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobEmpresaInfo","JobCategoria","JobProductoByCategoria","JobDetalleTemporal","JobProductoMasVendido","JobBuscarProducto","JobBuscarProductoLista","buscarFavoritos","addFavoritos","deleteFavoritos","RefreshFavoritos","cantidadPro")) {
case 0: {
this.state = 13;
if (true) break;
}
case 1: {
this.state = 15;
if (true) break;
}
case 2: {
this.state = 17;
if (true) break;
}
case 3: {
this.state = 23;
if (true) break;
}
case 4: {
this.state = 29;
if (true) break;
}
case 5: {
this.state = 35;
if (true) break;
}
case 6: {
this.state = 83;
if (true) break;
}
case 7: {
this.state = 99;
if (true) break;
}
case 8: {
this.state = 105;
if (true) break;
}
case 9: {
this.state = 113;
if (true) break;
}
case 10: {
this.state = 129;
if (true) break;
}
case 11: {
this.state = 135;
if (true) break;
}
}
if (true) break;

case 13:
//C
this.state = 140;
RDebugUtils.currentLine=2490395;
 //BA.debugLineNum = 2490395;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="mapEmpresaInfo = list.Get(0)";
parent._mapempresainfo.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get((int) (0))));
RDebugUtils.currentLine=2490397;
 //BA.debugLineNum = 2490397;BA.debugLine="isUsa = mapEmpresaInfo.Get(\"f_adressusa\")";
parent._isusa = BA.ObjectToBoolean(parent._mapempresainfo.Get((Object)("f_adressusa")));
 if (true) break;

case 15:
//C
this.state = 140;
RDebugUtils.currentLine=2490409;
 //BA.debugLineNum = 2490409;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490410;
 //BA.debugLineNum = 2490410;BA.debugLine="lblCategoria.Text = list.Size & \" Categotias\"";
parent.mostCurrent._lblcategoria.setText(BA.ObjectToCharSequence(BA.NumberToString(_list.getSize())+" Categotias"));
RDebugUtils.currentLine=2490411;
 //BA.debugLineNum = 2490411;BA.debugLine="cargarViewProductos(list, True)";
_cargarviewproductos(_list,anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 17:
//C
this.state = 18;
RDebugUtils.currentLine=2490414;
 //BA.debugLineNum = 2490414;BA.debugLine="Msgbox(\"\",\"PRODUCTOS AHORA\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(""),BA.ObjectToCharSequence("PRODUCTOS AHORA"),mostCurrent.activityBA);
RDebugUtils.currentLine=2490415;
 //BA.debugLineNum = 2490415;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490416;
 //BA.debugLineNum = 2490416;BA.debugLine="Log(map.Get(\"f_data\"))";
anywheresoftware.b4a.keywords.Common.LogImpl("62490416",BA.ObjectToString(_map.Get((Object)("f_data"))),0);
RDebugUtils.currentLine=2490417;
 //BA.debugLineNum = 2490417;BA.debugLine="If list.Size = 0 Then";
if (true) break;

case 18:
//if
this.state = 21;
if (_list.getSize()==0) { 
this.state = 20;
}if (true) break;

case 20:
//C
this.state = 21;
RDebugUtils.currentLine=2490418;
 //BA.debugLineNum = 2490418;BA.debugLine="Msgbox(\"Esta categoria no tiene productos.\",\"I";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Esta categoria no tiene productos."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2490419;
 //BA.debugLineNum = 2490419;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 21:
//C
this.state = 140;
;
RDebugUtils.currentLine=2490422;
 //BA.debugLineNum = 2490422;BA.debugLine="lblCategoria.SetTextColorAnimated(300,Colors.Tr";
parent.mostCurrent._lblcategoria.SetTextColorAnimated((int) (300),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=2490429;
 //BA.debugLineNum = 2490429;BA.debugLine="PanelCategoria.Tag = list";
parent.mostCurrent._panelcategoria.setTag((Object)(_list.getObject()));
RDebugUtils.currentLine=2490430;
 //BA.debugLineNum = 2490430;BA.debugLine="lblCategoria.Text =  list.Size & \" Productos\"";
parent.mostCurrent._lblcategoria.setText(BA.ObjectToCharSequence(BA.NumberToString(_list.getSize())+" Productos"));
RDebugUtils.currentLine=2490431;
 //BA.debugLineNum = 2490431;BA.debugLine="lblCategoria.SetTextColorAnimated(200,Colors.Bl";
parent.mostCurrent._lblcategoria.SetTextColorAnimated((int) (200),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2490432;
 //BA.debugLineNum = 2490432;BA.debugLine="cargarViewProductos(list, False)";
_cargarviewproductos(_list,anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 23:
//C
this.state = 24;
RDebugUtils.currentLine=2490437;
 //BA.debugLineNum = 2490437;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490438;
 //BA.debugLineNum = 2490438;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if (true) break;

case 24:
//if
this.state = 27;
if ((_map.Get((Object)("f_paso"))).equals((Object)("0"))) { 
this.state = 26;
}if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=2490439;
 //BA.debugLineNum = 2490439;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto no tiene existencia: "+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_job._tag /*Object*/ )+"."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2490440;
 //BA.debugLineNum = 2490440;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 27:
//C
this.state = 140;
;
RDebugUtils.currentLine=2490442;
 //BA.debugLineNum = 2490442;BA.debugLine="cantidadProduto = cantidadProduto + 1";
parent._cantidadproduto = (int) (parent._cantidadproduto+1);
RDebugUtils.currentLine=2490443;
 //BA.debugLineNum = 2490443;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
parent.mostCurrent._lblcantidadproductos.setText(BA.ObjectToCharSequence(parent._cantidadproduto));
RDebugUtils.currentLine=2490444;
 //BA.debugLineNum = 2490444;BA.debugLine="lblCantidadProductos.Visible = True";
parent.mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490445;
 //BA.debugLineNum = 2490445;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto agregado al carrito."),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 29:
//C
this.state = 30;
RDebugUtils.currentLine=2490448;
 //BA.debugLineNum = 2490448;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490452;
 //BA.debugLineNum = 2490452;BA.debugLine="Dim lef As Int = 2%x";
_lef = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=2490453;
 //BA.debugLineNum = 2490453;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490454;
 //BA.debugLineNum = 2490454;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=2490456;
 //BA.debugLineNum = 2490456;BA.debugLine="Dim widhth As Int = list.Size*47%x";
_widhth = (int) (_list.getSize()*anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),mostCurrent.activityBA));
RDebugUtils.currentLine=2490457;
 //BA.debugLineNum = 2490457;BA.debugLine="hscrol.Initialize(widhth,\"\")";
parent.mostCurrent._hscrol.Initialize(mostCurrent.activityBA,_widhth,"");
RDebugUtils.currentLine=2490459;
 //BA.debugLineNum = 2490459;BA.debugLine="For i = 0 To list.Size-1";
if (true) break;

case 30:
//for
this.state = 33;
step56 = 1;
limit56 = (int) (_list.getSize()-1);
_i = (int) (0) ;
this.state = 141;
if (true) break;

case 141:
//C
this.state = 33;
if ((step56 > 0 && _i <= limit56) || (step56 < 0 && _i >= limit56)) this.state = 32;
if (true) break;

case 142:
//C
this.state = 141;
_i = ((int)(0 + _i + step56)) ;
if (true) break;

case 32:
//C
this.state = 142;
RDebugUtils.currentLine=2490460;
 //BA.debugLineNum = 2490460;BA.debugLine="mapa = list.Get(i)";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=2490461;
 //BA.debugLineNum = 2490461;BA.debugLine="hscrol.Panel.AddView(funcion.createPanelProduc";
parent.mostCurrent._hscrol.getPanel().AddView((android.view.View)(parent.mostCurrent._funcion._createpanelproducto /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_mapa).getObject()),_lef,anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (38),mostCurrent.activityBA));
RDebugUtils.currentLine=2490462;
 //BA.debugLineNum = 2490462;BA.debugLine="lef = lef + 47%x";
_lef = (int) (_lef+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),mostCurrent.activityBA));
 if (true) break;
if (true) break;

case 33:
//C
this.state = 140;
;
RDebugUtils.currentLine=2490464;
 //BA.debugLineNum = 2490464;BA.debugLine="hscrol.Color = Colors.RGB(237, 237, 238)";
parent.mostCurrent._hscrol.setColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (237),(int) (237),(int) (238)));
RDebugUtils.currentLine=2490466;
 //BA.debugLineNum = 2490466;BA.debugLine="Dim lblmasVendidos As Label";
_lblmasvendidos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490467;
 //BA.debugLineNum = 2490467;BA.debugLine="lblmasVendidos.Initialize(\"\")";
_lblmasvendidos.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=2490469;
 //BA.debugLineNum = 2490469;BA.debugLine="lblmasVendidos.Text = \"Mas vendidos\"";
_lblmasvendidos.setText(BA.ObjectToCharSequence("Mas vendidos"));
RDebugUtils.currentLine=2490470;
 //BA.debugLineNum = 2490470;BA.debugLine="lblmasVendidos.TextColor = Colors.RGB(97, 97, 9";
_lblmasvendidos.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (97),(int) (97),(int) (97)));
RDebugUtils.currentLine=2490471;
 //BA.debugLineNum = 2490471;BA.debugLine="lblmasVendidos.TextSize = 16";
_lblmasvendidos.setTextSize((float) (16));
RDebugUtils.currentLine=2490473;
 //BA.debugLineNum = 2490473;BA.debugLine="ViewCategoria.Panel.AddView(lblmasVendidos,2%x,";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(_lblmasvendidos.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (0),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=2490475;
 //BA.debugLineNum = 2490475;BA.debugLine="ViewCategoria.Panel.AddView(hscrol,1%x,lblmasVe";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(parent.mostCurrent._hscrol.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (_lblmasvendidos.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (95),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
 if (true) break;

case 35:
//C
this.state = 36;
RDebugUtils.currentLine=2490481;
 //BA.debugLineNum = 2490481;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490482;
 //BA.debugLineNum = 2490482;BA.debugLine="If list.Size = 0 Then";
if (true) break;

case 36:
//if
this.state = 39;
if (_list.getSize()==0) { 
this.state = 38;
}if (true) break;

case 38:
//C
this.state = 39;
RDebugUtils.currentLine=2490483;
 //BA.debugLineNum = 2490483;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No se ha encontrado productos con esta referencia"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2490484;
 //BA.debugLineNum = 2490484;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 39:
//C
this.state = 40;
;
RDebugUtils.currentLine=2490487;
 //BA.debugLineNum = 2490487;BA.debugLine="Dim lblProductos As Label";
_lblproductos = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=2490488;
 //BA.debugLineNum = 2490488;BA.debugLine="lblProductos.Initialize(\"\")";
_lblproductos.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=2490490;
 //BA.debugLineNum = 2490490;BA.debugLine="lblProductos.Text = \"Productos\"";
_lblproductos.setText(BA.ObjectToCharSequence("Productos"));
RDebugUtils.currentLine=2490491;
 //BA.debugLineNum = 2490491;BA.debugLine="lblProductos.TextSize = 16";
_lblproductos.setTextSize((float) (16));
RDebugUtils.currentLine=2490492;
 //BA.debugLineNum = 2490492;BA.debugLine="lblProductos.TextColor = Colors.RGB(97, 97, 97)";
_lblproductos.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (97),(int) (97),(int) (97)));
RDebugUtils.currentLine=2490494;
 //BA.debugLineNum = 2490494;BA.debugLine="ViewCategoria.Panel.AddView(lblProductos,1%x,hs";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(_lblproductos.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (1),mostCurrent.activityBA),(int) (parent.mostCurrent._hscrol.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA)),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (70),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=2490496;
 //BA.debugLineNum = 2490496;BA.debugLine="If list.Size > 20 Then";
if (true) break;

case 40:
//if
this.state = 81;
if (_list.getSize()>20) { 
this.state = 42;
}else {
this.state = 64;
}if (true) break;

case 42:
//C
this.state = 43;
RDebugUtils.currentLine=2490498;
 //BA.debugLineNum = 2490498;BA.debugLine="Dim alttop As Int  = lblProductos.Top + 6%y";
_alttop = (int) (_lblproductos.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=2490500;
 //BA.debugLineNum = 2490500;BA.debugLine="For i=0 To 19";
if (true) break;

case 43:
//for
this.state = 62;
step83 = 1;
limit83 = (int) (19);
_i = (int) (0) ;
this.state = 143;
if (true) break;

case 143:
//C
this.state = 62;
if ((step83 > 0 && _i <= limit83) || (step83 < 0 && _i >= limit83)) this.state = 45;
if (true) break;

case 144:
//C
this.state = 143;
_i = ((int)(0 + _i + step83)) ;
if (true) break;

case 45:
//C
this.state = 46;
RDebugUtils.currentLine=2490501;
 //BA.debugLineNum = 2490501;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=2490502;
 //BA.debugLineNum = 2490502;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2490503;
 //BA.debugLineNum = 2490503;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
if (true) break;

case 46:
//if
this.state = 51;
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
this.state = 48;
}else {
this.state = 50;
}if (true) break;

case 48:
//C
this.state = 51;
RDebugUtils.currentLine=2490504;
 //BA.debugLineNum = 2490504;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = parent.mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 if (true) break;

case 50:
//C
this.state = 51;
RDebugUtils.currentLine=2490507;
 //BA.debugLineNum = 2490507;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 if (true) break;

case 51:
//C
this.state = 52;
;
RDebugUtils.currentLine=2490510;
 //BA.debugLineNum = 2490510;BA.debugLine="Dim lefpro As Int = 2%x";
_lefpro = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=2490512;
 //BA.debugLineNum = 2490512;BA.debugLine="If i Mod 2 == 0 Then";
if (true) break;

case 52:
//if
this.state = 61;
if (_i%2==0) { 
this.state = 54;
}else {
this.state = 60;
}if (true) break;

case 54:
//C
this.state = 55;
RDebugUtils.currentLine=2490514;
 //BA.debugLineNum = 2490514;BA.debugLine="lefpro = 2%x";
_lefpro = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=2490515;
 //BA.debugLineNum = 2490515;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(parent.mostCurrent._funcion._createpanelproductoscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_map,_bm).getObject()),_lefpro,_alttop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
RDebugUtils.currentLine=2490517;
 //BA.debugLineNum = 2490517;BA.debugLine="If i == list.Size-1 Then";
if (true) break;

case 55:
//if
this.state = 58;
if (_i==_list.getSize()-1) { 
this.state = 57;
}if (true) break;

case 57:
//C
this.state = 58;
RDebugUtils.currentLine=2490518;
 //BA.debugLineNum = 2490518;BA.debugLine="alttop = alttop+37%y";
_alttop = (int) (_alttop+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (37),mostCurrent.activityBA));
 if (true) break;

case 58:
//C
this.state = 61;
;
 if (true) break;

case 60:
//C
this.state = 61;
RDebugUtils.currentLine=2490523;
 //BA.debugLineNum = 2490523;BA.debugLine="lefpro = lefpro + 47%x";
_lefpro = (int) (_lefpro+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),mostCurrent.activityBA));
RDebugUtils.currentLine=2490524;
 //BA.debugLineNum = 2490524;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(parent.mostCurrent._funcion._createpanelproductoscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_map,_bm).getObject()),_lefpro,_alttop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
RDebugUtils.currentLine=2490525;
 //BA.debugLineNum = 2490525;BA.debugLine="alttop = alttop+37%y";
_alttop = (int) (_alttop+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (37),mostCurrent.activityBA));
 if (true) break;

case 61:
//C
this.state = 144;
;
 if (true) break;
if (true) break;

case 62:
//C
this.state = 81;
;
RDebugUtils.currentLine=2490531;
 //BA.debugLineNum = 2490531;BA.debugLine="ViewCategoria.Panel.Height = alttop";
parent.mostCurrent._viewcategoria.getPanel().setHeight(_alttop);
 if (true) break;

case 64:
//C
this.state = 65;
RDebugUtils.currentLine=2490535;
 //BA.debugLineNum = 2490535;BA.debugLine="Dim alttop As Int  = lblProductos.Top + 6%y";
_alttop = (int) (_lblproductos.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (6),mostCurrent.activityBA));
RDebugUtils.currentLine=2490537;
 //BA.debugLineNum = 2490537;BA.debugLine="For i=0 To list.Size-1";
if (true) break;

case 65:
//for
this.state = 80;
step107 = 1;
limit107 = (int) (_list.getSize()-1);
_i = (int) (0) ;
this.state = 145;
if (true) break;

case 145:
//C
this.state = 80;
if ((step107 > 0 && _i <= limit107) || (step107 < 0 && _i >= limit107)) this.state = 67;
if (true) break;

case 146:
//C
this.state = 145;
_i = ((int)(0 + _i + step107)) ;
if (true) break;

case 67:
//C
this.state = 68;
RDebugUtils.currentLine=2490538;
 //BA.debugLineNum = 2490538;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=2490539;
 //BA.debugLineNum = 2490539;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2490540;
 //BA.debugLineNum = 2490540;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
if (true) break;

case 68:
//if
this.state = 73;
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
this.state = 70;
}else {
this.state = 72;
}if (true) break;

case 70:
//C
this.state = 73;
RDebugUtils.currentLine=2490541;
 //BA.debugLineNum = 2490541;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = parent.mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 if (true) break;

case 72:
//C
this.state = 73;
RDebugUtils.currentLine=2490543;
 //BA.debugLineNum = 2490543;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pac";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"packing.png").getObject()));
 if (true) break;

case 73:
//C
this.state = 74;
;
RDebugUtils.currentLine=2490548;
 //BA.debugLineNum = 2490548;BA.debugLine="Dim lefpro As Int = 2%x";
_lefpro = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=2490550;
 //BA.debugLineNum = 2490550;BA.debugLine="If i Mod 2 == 0 Then";
if (true) break;

case 74:
//if
this.state = 79;
if (_i%2==0) { 
this.state = 76;
}else {
this.state = 78;
}if (true) break;

case 76:
//C
this.state = 79;
RDebugUtils.currentLine=2490552;
 //BA.debugLineNum = 2490552;BA.debugLine="lefpro = 2%x";
_lefpro = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=2490553;
 //BA.debugLineNum = 2490553;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(parent.mostCurrent._funcion._createpanelproductoscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_map,_bm).getObject()),_lefpro,_alttop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
 if (true) break;

case 78:
//C
this.state = 79;
RDebugUtils.currentLine=2490557;
 //BA.debugLineNum = 2490557;BA.debugLine="ViewCategoria.Panel.Height = ViewCategoria.P";
parent.mostCurrent._viewcategoria.getPanel().setHeight((int) (parent.mostCurrent._viewcategoria.getPanel().getHeight()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (32.2),mostCurrent.activityBA)));
RDebugUtils.currentLine=2490558;
 //BA.debugLineNum = 2490558;BA.debugLine="lefpro = lefpro + 47%x";
_lefpro = (int) (_lefpro+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),mostCurrent.activityBA));
RDebugUtils.currentLine=2490559;
 //BA.debugLineNum = 2490559;BA.debugLine="ViewCategoria.Panel.AddView(funcion.createPa";
parent.mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(parent.mostCurrent._funcion._createpanelproductoscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_map,_bm).getObject()),_lefpro,_alttop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
RDebugUtils.currentLine=2490560;
 //BA.debugLineNum = 2490560;BA.debugLine="alttop = alttop+37%y";
_alttop = (int) (_alttop+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (37),mostCurrent.activityBA));
 if (true) break;

case 79:
//C
this.state = 146;
;
 if (true) break;
if (true) break;

case 80:
//C
this.state = 81;
;
 if (true) break;

case 81:
//C
this.state = 140;
;
 if (true) break;

case 83:
//C
this.state = 84;
RDebugUtils.currentLine=2490570;
 //BA.debugLineNum = 2490570;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490571;
 //BA.debugLineNum = 2490571;BA.debugLine="If list.Size = 0 Then";
if (true) break;

case 84:
//if
this.state = 87;
if (_list.getSize()==0) { 
this.state = 86;
}if (true) break;

case 86:
//C
this.state = 87;
RDebugUtils.currentLine=2490572;
 //BA.debugLineNum = 2490572;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No se ha encontrado productos con esta referencia"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2490573;
 //BA.debugLineNum = 2490573;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 87:
//C
this.state = 88;
;
RDebugUtils.currentLine=2490576;
 //BA.debugLineNum = 2490576;BA.debugLine="ListProductosModalView.Clear";
parent.mostCurrent._listproductosmodalview.Clear();
RDebugUtils.currentLine=2490578;
 //BA.debugLineNum = 2490578;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2490579;
 //BA.debugLineNum = 2490579;BA.debugLine="For i = 0 To list.Size-1";
if (true) break;

case 88:
//for
this.state = 97;
step135 = 1;
limit135 = (int) (_list.getSize()-1);
_i = (int) (0) ;
this.state = 147;
if (true) break;

case 147:
//C
this.state = 97;
if ((step135 > 0 && _i <= limit135) || (step135 < 0 && _i >= limit135)) this.state = 90;
if (true) break;

case 148:
//C
this.state = 147;
_i = ((int)(0 + _i + step135)) ;
if (true) break;

case 90:
//C
this.state = 91;
RDebugUtils.currentLine=2490580;
 //BA.debugLineNum = 2490580;BA.debugLine="Dim mapalist As Map";
_mapalist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2490581;
 //BA.debugLineNum = 2490581;BA.debugLine="mapalist = list.Get(i)";
_mapalist.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=2490583;
 //BA.debugLineNum = 2490583;BA.debugLine="If  mapalist.Get(\"f_foto\")<> Null And  mapalis";
if (true) break;

case 91:
//if
this.state = 96;
if (_mapalist.Get((Object)("f_foto"))!= null && (_mapalist.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
this.state = 93;
}else {
this.state = 95;
}if (true) break;

case 93:
//C
this.state = 96;
RDebugUtils.currentLine=2490584;
 //BA.debugLineNum = 2490584;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_foto\")";
_bm = parent.mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapalist.Get((Object)("f_foto"))));
 if (true) break;

case 95:
//C
this.state = 96;
RDebugUtils.currentLine=2490586;
 //BA.debugLineNum = 2490586;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-i";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 if (true) break;

case 96:
//C
this.state = 148;
;
RDebugUtils.currentLine=2490589;
 //BA.debugLineNum = 2490589;BA.debugLine="ListProductosModalView.AddTwoLinesAndBitmap2(m";
parent.mostCurrent._listproductosmodalview.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_mapalist.Get((Object)("f_descripcion"))),BA.ObjectToCharSequence("Precio: "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapalist.Get((Object)("f_precio")))),(int) (0),(int) (2))),_bm.getBitmap(),(Object)(_mapalist.getObject()));
 if (true) break;
if (true) break;

case 97:
//C
this.state = 140;
;
 if (true) break;

case 99:
//C
this.state = 100;
RDebugUtils.currentLine=2490594;
 //BA.debugLineNum = 2490594;BA.debugLine="If listafavoritos.IsInitialized Then";
if (true) break;

case 100:
//if
this.state = 103;
if (parent._listafavoritos.IsInitialized()) { 
this.state = 102;
}if (true) break;

case 102:
//C
this.state = 103;
RDebugUtils.currentLine=2490595;
 //BA.debugLineNum = 2490595;BA.debugLine="listafavoritos.Clear";
parent._listafavoritos.Clear();
 if (true) break;

case 103:
//C
this.state = 140;
;
RDebugUtils.currentLine=2490598;
 //BA.debugLineNum = 2490598;BA.debugLine="listafavoritos = map.Get(\"f_data\")";
parent._listafavoritos.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490599;
 //BA.debugLineNum = 2490599;BA.debugLine="buscarfavoritosvar = False";
parent._buscarfavoritosvar = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2490600;
 //BA.debugLineNum = 2490600;BA.debugLine="cargarDatos";
_cargardatos();
 if (true) break;

case 105:
//C
this.state = 106;
RDebugUtils.currentLine=2490604;
 //BA.debugLineNum = 2490604;BA.debugLine="If map.Get(\"f_data\") Then";
if (true) break;

case 106:
//if
this.state = 111;
if (BA.ObjectToBoolean(_map.Get((Object)("f_data")))) { 
this.state = 108;
}else {
this.state = 110;
}if (true) break;

case 108:
//C
this.state = 111;
RDebugUtils.currentLine=2490606;
 //BA.debugLineNum = 2490606;BA.debugLine="listafavoritos.Add(mapaDetalleImagen)";
parent._listafavoritos.Add((Object)(parent._mapadetalleimagen.getObject()));
RDebugUtils.currentLine=2490608;
 //BA.debugLineNum = 2490608;BA.debugLine="ToastMessageShow(\"Producto agregado a favorito";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto agregado a favoritos"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 110:
//C
this.state = 111;
RDebugUtils.currentLine=2490610;
 //BA.debugLineNum = 2490610;BA.debugLine="ToastMessageShow(\"Error al agregar su producto";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Error al agregar su producto a favoritos"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 111:
//C
this.state = 140;
;
 if (true) break;

case 113:
//C
this.state = 114;
RDebugUtils.currentLine=2490615;
 //BA.debugLineNum = 2490615;BA.debugLine="If map.Get(\"f_data\") Then";
if (true) break;

case 114:
//if
this.state = 127;
if (BA.ObjectToBoolean(_map.Get((Object)("f_data")))) { 
this.state = 116;
}else {
this.state = 126;
}if (true) break;

case 116:
//C
this.state = 117;
RDebugUtils.currentLine=2490616;
 //BA.debugLineNum = 2490616;BA.debugLine="ToastMessageShow(\"Producto eliminado de favori";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto eliminado de favorito"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490618;
 //BA.debugLineNum = 2490618;BA.debugLine="For i=0 To listafavoritos.Size-1";
if (true) break;

case 117:
//for
this.state = 124;
step162 = 1;
limit162 = (int) (parent._listafavoritos.getSize()-1);
_i = (int) (0) ;
this.state = 149;
if (true) break;

case 149:
//C
this.state = 124;
if ((step162 > 0 && _i <= limit162) || (step162 < 0 && _i >= limit162)) this.state = 119;
if (true) break;

case 150:
//C
this.state = 149;
_i = ((int)(0 + _i + step162)) ;
if (true) break;

case 119:
//C
this.state = 120;
RDebugUtils.currentLine=2490620;
 //BA.debugLineNum = 2490620;BA.debugLine="Dim map As Map = listafavoritos.Get(i)";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(parent._listafavoritos.Get(_i)));
RDebugUtils.currentLine=2490622;
 //BA.debugLineNum = 2490622;BA.debugLine="If map.Get(\"f_idrecord\") == mapaDetalleImagen";
if (true) break;

case 120:
//if
this.state = 123;
if ((_map.Get((Object)("f_idrecord"))).equals(parent._mapadetalleimagen.Get((Object)("f_idproducto")))) { 
this.state = 122;
}if (true) break;

case 122:
//C
this.state = 123;
RDebugUtils.currentLine=2490623;
 //BA.debugLineNum = 2490623;BA.debugLine="listafavoritos.RemoveAt(i)";
parent._listafavoritos.RemoveAt(_i);
RDebugUtils.currentLine=2490624;
 //BA.debugLineNum = 2490624;BA.debugLine="i = listafavoritos.Size";
_i = parent._listafavoritos.getSize();
 if (true) break;

case 123:
//C
this.state = 150;
;
 if (true) break;
if (true) break;

case 124:
//C
this.state = 127;
;
RDebugUtils.currentLine=2490628;
 //BA.debugLineNum = 2490628;BA.debugLine="Sleep(100)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "jobdone"),(int) (100));
this.state = 151;
return;
case 151:
//C
this.state = 127;
;
 if (true) break;

case 126:
//C
this.state = 127;
RDebugUtils.currentLine=2490631;
 //BA.debugLineNum = 2490631;BA.debugLine="ToastMessageShow(\"Hubo un error a remover este";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Hubo un error a remover este producto de su lista de favritos"),anywheresoftware.b4a.keywords.Common.False);
 if (true) break;

case 127:
//C
this.state = 140;
;
 if (true) break;

case 129:
//C
this.state = 130;
RDebugUtils.currentLine=2490635;
 //BA.debugLineNum = 2490635;BA.debugLine="If listafavoritos.IsInitialized Then";
if (true) break;

case 130:
//if
this.state = 133;
if (parent._listafavoritos.IsInitialized()) { 
this.state = 132;
}if (true) break;

case 132:
//C
this.state = 133;
RDebugUtils.currentLine=2490636;
 //BA.debugLineNum = 2490636;BA.debugLine="listafavoritos.Clear";
parent._listafavoritos.Clear();
 if (true) break;

case 133:
//C
this.state = 140;
;
RDebugUtils.currentLine=2490639;
 //BA.debugLineNum = 2490639;BA.debugLine="listafavoritos = map.Get(\"f_data\")";
parent._listafavoritos.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490640;
 //BA.debugLineNum = 2490640;BA.debugLine="cargarListaFavoritos";
_cargarlistafavoritos();
 if (true) break;

case 135:
//C
this.state = 136;
RDebugUtils.currentLine=2490644;
 //BA.debugLineNum = 2490644;BA.debugLine="cantidadProduto = map.Get(\"f_data\")";
parent._cantidadproduto = (int)(BA.ObjectToNumber(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=2490646;
 //BA.debugLineNum = 2490646;BA.debugLine="If cantidadProduto <> 0 Then";
if (true) break;

case 136:
//if
this.state = 139;
if (parent._cantidadproduto!=0) { 
this.state = 138;
}if (true) break;

case 138:
//C
this.state = 139;
RDebugUtils.currentLine=2490648;
 //BA.debugLineNum = 2490648;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
parent.mostCurrent._lblcantidadproductos.setText(BA.ObjectToCharSequence(parent._cantidadproduto));
RDebugUtils.currentLine=2490649;
 //BA.debugLineNum = 2490649;BA.debugLine="lblCantidadProductos.Visible = True";
parent.mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.True);
 if (true) break;

case 139:
//C
this.state = 140;
;
 if (true) break;

case 140:
//C
this.state = -1;
;
RDebugUtils.currentLine=2490656;
 //BA.debugLineNum = 2490656;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _listproductosmodalview_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listproductosmodalview_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listproductosmodalview_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub ListProductosModalView_ItemClick (Position As";
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="mapa = Value";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=3801094;
 //BA.debugLineNum = 3801094;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=3801096;
 //BA.debugLineNum = 3801096;BA.debugLine="If mapa.ContainsKey(\"f_foto\") Then";
if (_mapa.ContainsKey((Object)("f_foto"))) { 
RDebugUtils.currentLine=3801098;
 //BA.debugLineNum = 3801098;BA.debugLine="If  mapa.Get(\"f_foto\") <> \"\" Then";
if ((_mapa.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=3801099;
 //BA.debugLineNum = 3801099;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapa.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=3801102;
 //BA.debugLineNum = 3801102;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=3801103;
 //BA.debugLineNum = 3801103;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
 }else {
RDebugUtils.currentLine=3801107;
 //BA.debugLineNum = 3801107;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=3801108;
 //BA.debugLineNum = 3801108;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
RDebugUtils.currentLine=3801111;
 //BA.debugLineNum = 3801111;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if (mostCurrent._panelfondodetalles.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3801112;
 //BA.debugLineNum = 3801112;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
mostCurrent._activity.LoadLayout("frmDetallesProducto",mostCurrent.activityBA);
RDebugUtils.currentLine=3801113;
 //BA.debugLineNum = 3801113;BA.debugLine="PanelFondoDetalles.Visible = False";
mostCurrent._panelfondodetalles.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3801116;
 //BA.debugLineNum = 3801116;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=3801117;
 //BA.debugLineNum = 3801117;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
mostCurrent._lblprecioencabezado.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=3801118;
 //BA.debugLineNum = 3801118;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
mostCurrent._lblnombeencabezado.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=3801119;
 //BA.debugLineNum = 3801119;BA.debugLine="lblcantidad.Text = 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=3801120;
 //BA.debugLineNum = 3801120;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
mostCurrent._lblprecio.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=3801121;
 //BA.debugLineNum = 3801121;BA.debugLine="PanelModalProducto.SetVisibleAnimated(500, False)";
mostCurrent._panelmodalproducto.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3801122;
 //BA.debugLineNum = 3801122;BA.debugLine="PanelMenu.SetVisibleAnimated(500, False)";
mostCurrent._panelmenu.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3801123;
 //BA.debugLineNum = 3801123;BA.debugLine="mapaDetalle = mapa";
_mapadetalle = _mapa;
RDebugUtils.currentLine=3801124;
 //BA.debugLineNum = 3801124;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,True)";
mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3801126;
 //BA.debugLineNum = 3801126;BA.debugLine="ismodal = True";
_ismodal = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3801127;
 //BA.debugLineNum = 3801127;BA.debugLine="End Sub";
return "";
}
public static String  _llistafavoritos_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "llistafavoritos_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "llistafavoritos_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmfav = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub LlistaFavoritos_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="imgfavDetalle = True";
_imgfavdetalle = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="mapa = Value";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="Dim bmfav As BitmapDrawable";
_bmfav = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="If mapa.ContainsKey(\"f_foto\") Then";
if (_mapa.ContainsKey((Object)("f_foto"))) { 
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
if (_mapa.Get((Object)("f_foto"))!= null && (_mapa.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapa.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=3342350;
 //BA.debugLineNum = 3342350;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=3342351;
 //BA.debugLineNum = 3342351;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
 }else {
RDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=3342356;
 //BA.debugLineNum = 3342356;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
RDebugUtils.currentLine=3342359;
 //BA.debugLineNum = 3342359;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if (mostCurrent._panelfondodetalles.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=3342360;
 //BA.debugLineNum = 3342360;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
mostCurrent._activity.LoadLayout("frmDetallesProducto",mostCurrent.activityBA);
RDebugUtils.currentLine=3342361;
 //BA.debugLineNum = 3342361;BA.debugLine="PanelFondoDetalles.Visible = False";
mostCurrent._panelfondodetalles.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=3342364;
 //BA.debugLineNum = 3342364;BA.debugLine="bmfav.Initialize(LoadBitmap(File.DirAssets,\"heart";
_bmfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=3342365;
 //BA.debugLineNum = 3342365;BA.debugLine="bmfav.Gravity = Gravity.FILL";
_bmfav.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=3342367;
 //BA.debugLineNum = 3342367;BA.debugLine="imgdetallefav.Background = bmfav";
mostCurrent._imgdetallefav.setBackground((android.graphics.drawable.Drawable)(_bmfav.getObject()));
RDebugUtils.currentLine=3342368;
 //BA.debugLineNum = 3342368;BA.debugLine="imgdetallefav.Tag = mapa";
mostCurrent._imgdetallefav.setTag((Object)(_mapa.getObject()));
RDebugUtils.currentLine=3342370;
 //BA.debugLineNum = 3342370;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=3342371;
 //BA.debugLineNum = 3342371;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
mostCurrent._lblprecioencabezado.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=3342372;
 //BA.debugLineNum = 3342372;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
mostCurrent._lblnombeencabezado.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=3342373;
 //BA.debugLineNum = 3342373;BA.debugLine="lblcantidad.Text = 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=3342374;
 //BA.debugLineNum = 3342374;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
mostCurrent._lblprecio.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=3342375;
 //BA.debugLineNum = 3342375;BA.debugLine="PanelFondoFavorito.SetVisibleAnimated(250, False)";
mostCurrent._panelfondofavorito.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=3342376;
 //BA.debugLineNum = 3342376;BA.debugLine="mapaDetalle = mapa";
_mapadetalle = _mapa;
RDebugUtils.currentLine=3342377;
 //BA.debugLineNum = 3342377;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(250,True)";
mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=3342379;
 //BA.debugLineNum = 3342379;BA.debugLine="End Sub";
return "";
}
public static String  _panelfondopro_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelfondopro_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelfondopro_click", null));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.PanelWrapper _b = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bmimgfav = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mimap = null;
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub PanelFondoPro_Click";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Dim b As Panel";
_b = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="b.Initialize(\"\")";
_b.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="b = Sender";
_b.setObject((android.view.ViewGroup)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="mapa = b.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="mapaDetalle = mapa";
_mapadetalle = _mapa;
RDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if (mostCurrent._panelfondodetalles.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2031630;
 //BA.debugLineNum = 2031630;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
mostCurrent._activity.LoadLayout("frmDetallesProducto",mostCurrent.activityBA);
RDebugUtils.currentLine=2031631;
 //BA.debugLineNum = 2031631;BA.debugLine="PanelFondoDetalles.Visible = False";
mostCurrent._panelfondodetalles.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2031634;
 //BA.debugLineNum = 2031634;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2031636;
 //BA.debugLineNum = 2031636;BA.debugLine="If mapa.Get(\"f_destacado\") Then";
if (BA.ObjectToBoolean(_mapa.Get((Object)("f_destacado")))) { 
RDebugUtils.currentLine=2031638;
 //BA.debugLineNum = 2031638;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
if (_mapa.Get((Object)("f_foto"))!= null && (_mapa.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=2031639;
 //BA.debugLineNum = 2031639;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapa.Get((Object)("f_foto"))));
RDebugUtils.currentLine=2031641;
 //BA.debugLineNum = 2031641;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=2031642;
 //BA.debugLineNum = 2031642;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
 }else {
RDebugUtils.currentLine=2031646;
 //BA.debugLineNum = 2031646;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=2031647;
 //BA.debugLineNum = 2031647;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=2031648;
 //BA.debugLineNum = 2031648;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
 };
 }else {
RDebugUtils.currentLine=2031652;
 //BA.debugLineNum = 2031652;BA.debugLine="If  mapa.Get(\"f_foto\") <> \"\" Then";
if ((_mapa.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=2031655;
 //BA.debugLineNum = 2031655;BA.debugLine="ImageViewDetalles.Background =  mapa.Get(\"f_fot";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_mapa.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=2031658;
 //BA.debugLineNum = 2031658;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=2031659;
 //BA.debugLineNum = 2031659;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=2031660;
 //BA.debugLineNum = 2031660;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
 };
 };
RDebugUtils.currentLine=2031665;
 //BA.debugLineNum = 2031665;BA.debugLine="Dim bmimgfav As BitmapDrawable";
_bmimgfav = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=2031678;
 //BA.debugLineNum = 2031678;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=2031680;
 //BA.debugLineNum = 2031680;BA.debugLine="For i=0 To listafavoritos.Size-1";
{
final int step34 = 1;
final int limit34 = (int) (_listafavoritos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
RDebugUtils.currentLine=2031682;
 //BA.debugLineNum = 2031682;BA.debugLine="Dim mimap As Map = listafavoritos.Get(i)";
_mimap = new anywheresoftware.b4a.objects.collections.Map();
_mimap.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listafavoritos.Get(_i)));
RDebugUtils.currentLine=2031684;
 //BA.debugLineNum = 2031684;BA.debugLine="If mapa.Get(\"f_idrecord\") == mimap.Get(\"f_idpro";
if ((_mapa.Get((Object)("f_idrecord"))).equals(_mimap.Get((Object)("f_idproducto")))) { 
RDebugUtils.currentLine=2031685;
 //BA.debugLineNum = 2031685;BA.debugLine="bmimgfav.Initialize(LoadBitmap(File.DirAssets,";
_bmimgfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=2031686;
 //BA.debugLineNum = 2031686;BA.debugLine="i = listafavoritos.Size";
_i = _listafavoritos.getSize();
RDebugUtils.currentLine=2031687;
 //BA.debugLineNum = 2031687;BA.debugLine="imgdetallefav.Tag = True";
mostCurrent._imgdetallefav.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
 };
 }
};
 };
RDebugUtils.currentLine=2031694;
 //BA.debugLineNum = 2031694;BA.debugLine="If bmimgfav.IsInitialized == False Then";
if (_bmimgfav.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2031695;
 //BA.debugLineNum = 2031695;BA.debugLine="bmimgfav.Initialize(LoadBitmap(File.DirAssets,\"h";
_bmimgfav.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartWhiteandBlack.png").getObject()));
RDebugUtils.currentLine=2031696;
 //BA.debugLineNum = 2031696;BA.debugLine="imgdetallefav.Tag = False";
mostCurrent._imgdetallefav.setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
 };
RDebugUtils.currentLine=2031699;
 //BA.debugLineNum = 2031699;BA.debugLine="imgdetallefav.Background = bmimgfav";
mostCurrent._imgdetallefav.setBackground((android.graphics.drawable.Drawable)(_bmimgfav.getObject()));
RDebugUtils.currentLine=2031701;
 //BA.debugLineNum = 2031701;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
mostCurrent._lblprecioencabezado.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=2031702;
 //BA.debugLineNum = 2031702;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
mostCurrent._lblnombeencabezado.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=2031703;
 //BA.debugLineNum = 2031703;BA.debugLine="lblcantidad.Text = 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=2031704;
 //BA.debugLineNum = 2031704;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
mostCurrent._lblprecio.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=2031705;
 //BA.debugLineNum = 2031705;BA.debugLine="PanelMenu.SetVisibleAnimated(500, False)";
mostCurrent._panelmenu.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2031706;
 //BA.debugLineNum = 2031706;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,True)";
mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2031708;
 //BA.debugLineNum = 2031708;BA.debugLine="ismodal = False";
_ismodal = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=2031710;
 //BA.debugLineNum = 2031710;BA.debugLine="End Sub";
return "";
}
public static String  _slide_animationend() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slide_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "slide_animationend", null));}
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Slide_AnimationEnd";
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="a = Sender";
_a.setObject((android.view.animation.Animation)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="If a.Duration = 251 Then";
if (_a.getDuration()==251) { 
RDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="PanelSlide.Top = PanelSlideBack.Tag";
mostCurrent._panelslide.setTop((int)(BA.ObjectToNumber(mostCurrent._panelslideback.getTag())));
RDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="funcion.DisableView( False,PanelSlide)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelslide);
RDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="funcion.DisableView(True,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmenu);
 }else {
RDebugUtils.currentLine=4063242;
 //BA.debugLineNum = 4063242;BA.debugLine="PanelSlide.Top = 100%y";
mostCurrent._panelslide.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=4063243;
 //BA.debugLineNum = 4063243;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,False)";
mostCurrent._panelslideback.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=4063244;
 //BA.debugLineNum = 4063244;BA.debugLine="funcion.DisableView(True,PanelSlide)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelslide);
RDebugUtils.currentLine=4063245;
 //BA.debugLineNum = 4063245;BA.debugLine="funcion.DisableView(False,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmenu);
 };
RDebugUtils.currentLine=4063248;
 //BA.debugLineNum = 4063248;BA.debugLine="End Sub";
return "";
}
public static String  _slidemenu_click(Object _value) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slidemenu_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "slidemenu_click", new Object[] {_value}));}
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub SlideMenu_Click(Value As Object)";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="funcion.ChangeScreen(Value,sm,Activity)";
mostCurrent._funcion._changescreen /*void*/ (mostCurrent.activityBA,(int)(BA.ObjectToNumber(_value)),mostCurrent._sm,mostCurrent._activity);
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="End Sub";
return "";
}
public static void  _slideoption_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slideoption_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "slideoption_click", null); return;}
ResumableSub_SlideOption_Click rsub = new ResumableSub_SlideOption_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_SlideOption_Click extends BA.ResumableSub {
public ResumableSub_SlideOption_Click(com.jq.pedidos.principal parent) {
this.parent = parent;
}
com.jq.pedidos.principal parent;
anywheresoftware.b4a.objects.PanelWrapper _p = null;
int _res = 0;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="principal";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="p = Sender";
_p.setObject((android.view.ViewGroup)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="If p.Tag = \"Exit\" Then";
if (true) break;

case 1:
//if
this.state = 4;
if ((_p.getTag()).equals((Object)("Exit"))) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Main.mostar = True";
parent.mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=4128776;
 //BA.debugLineNum = 4128776;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "slideoption_click"),(int) (400));
this.state = 35;
return;
case 35:
//C
this.state = 4;
;
RDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="Activity.Finish";
parent.mostCurrent._activity.Finish();
RDebugUtils.currentLine=4128779;
 //BA.debugLineNum = 4128779;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
 if (true) break;
;
RDebugUtils.currentLine=4128782;
 //BA.debugLineNum = 4128782;BA.debugLine="If p.Tag = \"Direcciones\" Then";

case 4:
//if
this.state = 19;
if ((_p.getTag()).equals((Object)("Direcciones"))) { 
this.state = 6;
}if (true) break;

case 6:
//C
this.state = 7;
RDebugUtils.currentLine=4128783;
 //BA.debugLineNum = 4128783;BA.debugLine="If Main.logged Then";
if (true) break;

case 7:
//if
this.state = 18;
if (parent.mostCurrent._main._logged /*boolean*/ ) { 
this.state = 9;
}else {
this.state = 11;
}if (true) break;

case 9:
//C
this.state = 18;
RDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=4128786;
 //BA.debugLineNum = 4128786;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "slideoption_click"),(int) (400));
this.state = 36;
return;
case 36:
//C
this.state = 18;
;
RDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="StartActivity(p.Tag)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,_p.getTag());
RDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 11:
//C
this.state = 12;
RDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=4128793;
 //BA.debugLineNum = 4128793;BA.debugLine="res = Msgbox2(\"Para agregar o ver sus direccion";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para agregar o ver sus direcciones primero debe iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar sesión"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=4128795;
 //BA.debugLineNum = 4128795;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (true) break;

case 12:
//if
this.state = 17;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 14;
}else {
this.state = 16;
}if (true) break;

case 14:
//C
this.state = 17;
RDebugUtils.currentLine=4128796;
 //BA.debugLineNum = 4128796;BA.debugLine="Main.mostar = True";
parent.mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4128797;
 //BA.debugLineNum = 4128797;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
 if (true) break;

case 16:
//C
this.state = 17;
RDebugUtils.currentLine=4128800;
 //BA.debugLineNum = 4128800;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
this.state = 18;
;
 if (true) break;

case 18:
//C
this.state = 19;
;
 if (true) break;
;
RDebugUtils.currentLine=4128806;
 //BA.debugLineNum = 4128806;BA.debugLine="If p.Tag = \"ReporteOrdenes\" Then";

case 19:
//if
this.state = 34;
if ((_p.getTag()).equals((Object)("ReporteOrdenes"))) { 
this.state = 21;
}if (true) break;

case 21:
//C
this.state = 22;
RDebugUtils.currentLine=4128807;
 //BA.debugLineNum = 4128807;BA.debugLine="If Main.logged Then";
if (true) break;

case 22:
//if
this.state = 33;
if (parent.mostCurrent._main._logged /*boolean*/ ) { 
this.state = 24;
}else {
this.state = 26;
}if (true) break;

case 24:
//C
this.state = 33;
RDebugUtils.currentLine=4128809;
 //BA.debugLineNum = 4128809;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=4128810;
 //BA.debugLineNum = 4128810;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "slideoption_click"),(int) (400));
this.state = 37;
return;
case 37:
//C
this.state = 33;
;
RDebugUtils.currentLine=4128811;
 //BA.debugLineNum = 4128811;BA.debugLine="StartActivity(p.Tag)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,_p.getTag());
RDebugUtils.currentLine=4128812;
 //BA.debugLineNum = 4128812;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 26:
//C
this.state = 27;
RDebugUtils.currentLine=4128815;
 //BA.debugLineNum = 4128815;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=4128817;
 //BA.debugLineNum = 4128817;BA.debugLine="res = Msgbox2(\"Para ver sus ordenes realizadas";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para ver sus ordenes realizadas primero debe iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar sesión"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=4128819;
 //BA.debugLineNum = 4128819;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (true) break;

case 27:
//if
this.state = 32;
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
this.state = 29;
}else {
this.state = 31;
}if (true) break;

case 29:
//C
this.state = 32;
RDebugUtils.currentLine=4128820;
 //BA.debugLineNum = 4128820;BA.debugLine="Main.mostar = True";
parent.mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=4128821;
 //BA.debugLineNum = 4128821;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(parent.mostCurrent._main.getObject()));
 if (true) break;

case 31:
//C
this.state = 32;
RDebugUtils.currentLine=4128824;
 //BA.debugLineNum = 4128824;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 32:
//C
this.state = 33;
;
 if (true) break;

case 33:
//C
this.state = 34;
;
 if (true) break;

case 34:
//C
this.state = -1;
;
RDebugUtils.currentLine=4128828;
 //BA.debugLineNum = 4128828;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=4128830;
 //BA.debugLineNum = 4128830;BA.debugLine="Sleep(400)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "principal", "slideoption_click"),(int) (400));
this.state = 38;
return;
case 38:
//C
this.state = -1;
;
RDebugUtils.currentLine=4128831;
 //BA.debugLineNum = 4128831;BA.debugLine="StartActivity(p.Tag)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,_p.getTag());
RDebugUtils.currentLine=4128833;
 //BA.debugLineNum = 4128833;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _txtbuscarproducto_enterpressed() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtbuscarproducto_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtbuscarproducto_enterpressed", null));}
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub txtBuscarProducto_EnterPressed";
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="End Sub";
return "";
}
public static String  _viewproducto_animationend() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "viewproducto_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "viewproducto_animationend", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub ViewProducto_AnimationEnd";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
}