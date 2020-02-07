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

public class facturacion extends Activity implements B4AActivity{
	public static facturacion mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.jq.pedidos", "com.jq.pedidos.facturacion");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (facturacion).");
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
		activityBA = new BA(this, layout, processBA, "com.jq.pedidos", "com.jq.pedidos.facturacion");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.jq.pedidos.facturacion", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (facturacion) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (facturacion) Resume **");
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
		return facturacion.class;
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
        BA.LogInfo("** Activity (facturacion) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            facturacion mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (facturacion) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnordenback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnordenenviar = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewordenproducto = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelordenenviar = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelordenproductos = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelordenproductosdetalles = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelordentitulo = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblordentotalpagar = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbldireccion = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprecioenvio = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldireccion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnordeneliminartodos = null;
public static double _tax = 0;
public static double _subtotal = 0;
public static double _total = 0;
public anywheresoftware.b4a.objects.ButtonWrapper _btncantidadaumentar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btncantidaddesaumentar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnopcionesback = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelopciones = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelopcionesback = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcantidad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblopcionesproductonombre = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnopcionesproductosalvar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtproductocomentario = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnopcioneseliminar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnabrirdireccion = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewdirecciones = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldireccionmodal = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="Activity.LoadLayout(\"frmProductoOrden\")";
mostCurrent._activity.LoadLayout("frmProductoOrden",mostCurrent.activityBA);
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.ItemHeigh";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (11),mostCurrent.activityBA));
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Tex";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=7667719;
 //BA.debugLineNum = 7667719;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Tex";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Typ";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Pad";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=7667725;
 //BA.debugLineNum = 7667725;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=7667726;
 //BA.debugLineNum = 7667726;BA.debugLine="funcion.SetDivider(ListViewOrdenProducto,Colors.L";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewordenproducto,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="ListViewOrdenProducto.Padding = Array As Int(2%x,";
mostCurrent._listviewordenproducto.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)});
RDebugUtils.currentLine=7667729;
 //BA.debugLineNum = 7667729;BA.debugLine="lblDireccion.Tag = 0";
mostCurrent._lbldireccion.setTag((Object)(0));
RDebugUtils.currentLine=7667731;
 //BA.debugLineNum = 7667731;BA.debugLine="cargarProductosTemporales";
_cargarproductostemporales();
RDebugUtils.currentLine=7667733;
 //BA.debugLineNum = 7667733;BA.debugLine="End Sub";
return "";
}
public static String  _cargarproductostemporales() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarproductostemporales", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarproductostemporales", null));}
String _json = "";
com.jq.pedidos.httpjob _jobbuscar = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub cargarProductosTemporales";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="If Main.logged And 1==2 Then";
if (mostCurrent._main._logged /*boolean*/  && 1==2) { 
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="Dim json As String  = \"'f_idempresa':\"&Principal";
_json = "'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+" ,'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ );
RDebugUtils.currentLine=7733255;
 //BA.debugLineNum = 7733255;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
_jobbuscar._initialize /*String*/ (null,processBA,"JobBuscar",facturacion.getObject());
RDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pr";
_jobbuscar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_productos_temporalesLogged","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="Dim json As String  = \"'f_idempresa':\"&Principal";
_json = "'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+" ,'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=7733264;
 //BA.debugLineNum = 7733264;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
_jobbuscar._initialize /*String*/ (null,processBA,"JobBuscar",facturacion.getObject());
RDebugUtils.currentLine=7733265;
 //BA.debugLineNum = 7733265;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pr";
_jobbuscar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_productos_temporales_by_key2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
 };
RDebugUtils.currentLine=7733269;
 //BA.debugLineNum = 7733269;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="facturacion";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="End Sub";
return "";
}
public static String  _btnabrirdireccion_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnabrirdireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnabrirdireccion_click", null));}
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub btnAbrirDireccion_Click";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="StartActivity(Direcciones)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._direcciones.getObject()));
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="End Sub";
return "";
}
public static String  _btncantidadaumentar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncantidadaumentar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncantidadaumentar_click", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub btnCantidadAumentar_Click";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="If IsNumber(txtCantidad.Text) = False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._txtcantidad.getText())==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="txtCantidad.Text = \"1\"";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence("1"));
RDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="txtCantidad.Text = txtCantidad.Text + 1";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))+1));
RDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="End Sub";
return "";
}
public static String  _btncantidaddesaumentar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncantidaddesaumentar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncantidaddesaumentar_click", null));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub btnCantidadDesaumentar_Click";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="If IsNumber(txtCantidad.Text) = False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._txtcantidad.getText())==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="txtCantidad.Text = \"1\"";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence("1"));
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="If (txtCantidad.Text - 1)  <= 0 Then";
if (((double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))-1)<=0) { 
RDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="txtCantidad.Text = txtCantidad.Text - 1";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))-1));
RDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="End Sub";
return "";
}
public static String  _btndireccioncerrar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndireccioncerrar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndireccioncerrar_click", null));}
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub btnDireccionCerrar_Click";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="PanelDireccionModal.SetVisibleAnimated(250,False)";
mostCurrent._paneldireccionmodal.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="funcion.DisableView(False,PanelOrdenProductos)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelordenproductos);
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="funcion.DisableView(True,PanelDireccionModal)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._paneldireccionmodal);
RDebugUtils.currentLine=8978437;
 //BA.debugLineNum = 8978437;BA.debugLine="End Sub";
return "";
}
public static String  _btnopcionesback_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnopcionesback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnopcionesback_click", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub btnOpcionesBack_Click";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public static String  _openopcioneslayout() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openopcioneslayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openopcioneslayout", null));}
double _posicion = 0;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub openOpcionesLayout";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Dim posicion As Double = 100%x";
_posicion = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA);
RDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="If PanelOpciones.IsInitialized = False Or PanelOp";
if (mostCurrent._panelopciones.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || mostCurrent._panelopcionesback.getLeft()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="If PanelOpciones.IsInitialized = False Then";
if (mostCurrent._panelopciones.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8126469;
 //BA.debugLineNum = 8126469;BA.debugLine="Activity.LoadLayout(\"frmProductoOpciones\")";
mostCurrent._activity.LoadLayout("frmProductoOpciones",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=8126471;
 //BA.debugLineNum = 8126471;BA.debugLine="PanelOpcionesBack.Left = 100%x";
mostCurrent._panelopcionesback.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=8126472;
 //BA.debugLineNum = 8126472;BA.debugLine="posicion = posicion * -1";
_posicion = _posicion*-1;
RDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="PanelOpcionesBack.Tag = 0";
mostCurrent._panelopcionesback.setTag((Object)(0));
RDebugUtils.currentLine=8126474;
 //BA.debugLineNum = 8126474;BA.debugLine="PanelOpcionesBack.SetColorAnimated(400,Colors.Tr";
mostCurrent._panelopcionesback.SetColorAnimated((int) (400),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (180),(int) (0),(int) (0),(int) (0)));
 }else {
RDebugUtils.currentLine=8126476;
 //BA.debugLineNum = 8126476;BA.debugLine="funcion.DisableView(False,PanelOrdenProductos)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelordenproductos);
RDebugUtils.currentLine=8126477;
 //BA.debugLineNum = 8126477;BA.debugLine="PanelOpcionesBack.Tag = 100%x";
mostCurrent._panelopcionesback.setTag((Object)(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)));
RDebugUtils.currentLine=8126478;
 //BA.debugLineNum = 8126478;BA.debugLine="PanelOpcionesBack.SetColorAnimated(150,Colors.AR";
mostCurrent._panelopcionesback.SetColorAnimated((int) (150),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (180),(int) (0),(int) (0),(int) (0)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 };
RDebugUtils.currentLine=8126481;
 //BA.debugLineNum = 8126481;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=8126482;
 //BA.debugLineNum = 8126482;BA.debugLine="a.InitializeTranslate(\"ProductosOpciones\", 0,0,po";
_a.InitializeTranslate(mostCurrent.activityBA,"ProductosOpciones",(float) (0),(float) (0),(float) (_posicion),(float) (0));
RDebugUtils.currentLine=8126483;
 //BA.debugLineNum = 8126483;BA.debugLine="a.Duration = 250";
_a.setDuration((long) (250));
RDebugUtils.currentLine=8126484;
 //BA.debugLineNum = 8126484;BA.debugLine="a.Start(PanelOpcionesBack)";
_a.Start((android.view.View)(mostCurrent._panelopcionesback.getObject()));
RDebugUtils.currentLine=8126485;
 //BA.debugLineNum = 8126485;BA.debugLine="End Sub";
return "";
}
public static String  _btnopcioneseliminar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnopcioneseliminar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnopcioneseliminar_click", null));}
int _r = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
com.jq.pedidos.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub btnOpcionesEliminar_Click";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="Dim r As Int = Msgbox2(\"Seguro que desea eliminar";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea eliminar este producto?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="If r <> DialogResponse.POSITIVE Then";
if (_r!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=8650755;
 //BA.debugLineNum = 8650755;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._btnopcionesproductosalvar.getTag()));
RDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=8650761;
 //BA.debugLineNum = 8650761;BA.debugLine="json = \"'f_regresa':true\"& _  			\",'f_idempresa':";
_json = "'f_regresa':true"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_tipo':2"+",'f_idserver':"+BA.ObjectToString(_map.Get((Object)("f_idserver")));
RDebugUtils.currentLine=8650766;
 //BA.debugLineNum = 8650766;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=8650767;
 //BA.debugLineNum = 8650767;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",facturacion.getObject());
RDebugUtils.currentLine=8650768;
 //BA.debugLineNum = 8650768;BA.debugLine="JobDetalleTemporal.Tag = True";
_jobdetalletemporal._tag /*Object*/  = (Object)(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8650770;
 //BA.debugLineNum = 8650770;BA.debugLine="If Main.logged And 1 == 2 Then";
if (mostCurrent._main._logged /*boolean*/  && 1==2) { 
RDebugUtils.currentLine=8650771;
 //BA.debugLineNum = 8650771;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=8650773;
 //BA.debugLineNum = 8650773;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
 };
RDebugUtils.currentLine=8650777;
 //BA.debugLineNum = 8650777;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
mostCurrent._btnopcionesproductosalvar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8650778;
 //BA.debugLineNum = 8650778;BA.debugLine="btnOpcionesEliminar.Enabled = False";
mostCurrent._btnopcioneseliminar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8650779;
 //BA.debugLineNum = 8650779;BA.debugLine="btnOpcionesBack.Enabled = False";
mostCurrent._btnopcionesback.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8650780;
 //BA.debugLineNum = 8650780;BA.debugLine="End Sub";
return "";
}
public static String  _btnopcionesproductosalvar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnopcionesproductosalvar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnopcionesproductosalvar_click", null));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.Map _mapcalculos = null;
String _json = "";
String _jsonpropiedades = "";
com.jq.pedidos.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._btnopcionesproductosalvar.getTag()));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio_original")))),(double)(BA.ObjectToNumber(_map.Get((Object)("f_descuento")))),(double)(Double.parseDouble(mostCurrent._txtcantidad.getText())),(double)(BA.ObjectToNumber(_map.Get((Object)("f_porciento_tax")))),mostCurrent._principal._impuestoincluido /*boolean*/ ,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585219;
 //BA.debugLineNum = 8585219;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Dim jsonPropiedades As String = \"[]\"";
_jsonpropiedades = "[]";
RDebugUtils.currentLine=8585235;
 //BA.debugLineNum = 8585235;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_propiedades':"+_jsonpropiedades+",'f_tipo':2"+",'f_cantidad':"+mostCurrent._txtcantidad.getText()+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_idserver':"+BA.ObjectToString(_map.Get((Object)("f_idserver")))+",'f_diferencia':"+BA.NumberToString(mostCurrent._funcion._getdiferenciacantidad /*double*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_cantidad")))),(double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))))+",'f_porciento_descuento':0"+",'f_comentario':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtproductocomentario.getText())+"'"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_porciento_tax")));
RDebugUtils.currentLine=8585251;
 //BA.debugLineNum = 8585251;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=8585252;
 //BA.debugLineNum = 8585252;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",facturacion.getObject());
RDebugUtils.currentLine=8585253;
 //BA.debugLineNum = 8585253;BA.debugLine="JobDetalleTemporal.Tag = False";
_jobdetalletemporal._tag /*Object*/  = (Object)(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585255;
 //BA.debugLineNum = 8585255;BA.debugLine="If Main.logged And 1 == 2 Then";
if (mostCurrent._main._logged /*boolean*/  && 1==2) { 
RDebugUtils.currentLine=8585256;
 //BA.debugLineNum = 8585256;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=8585258;
 //BA.debugLineNum = 8585258;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
 };
RDebugUtils.currentLine=8585261;
 //BA.debugLineNum = 8585261;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
mostCurrent._btnopcionesproductosalvar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585262;
 //BA.debugLineNum = 8585262;BA.debugLine="btnOpcionesEliminar.Enabled = False";
mostCurrent._btnopcioneseliminar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585263;
 //BA.debugLineNum = 8585263;BA.debugLine="btnOpcionesBack.Enabled = False";
mostCurrent._btnopcionesback.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8585264;
 //BA.debugLineNum = 8585264;BA.debugLine="End Sub";
return "";
}
public static String  _btnordenback_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnordenback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnordenback_click", null));}
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub btnOrdenBack_Click";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Principal.keyotraparte = False";
mostCurrent._principal._keyotraparte /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="End Sub";
return "";
}
public static String  _btnordeneliminartodos_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnordeneliminartodos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnordeneliminartodos_click", null));}
int _r = 0;
String _json = "";
com.jq.pedidos.httpjob _jobeliminartodo = null;
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub btnOrdenEliminarTodos_Click";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Dim r As Int = Msgbox2(\"Seguro que desea eliminar";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea eliminar todos los productos?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="If r <> DialogResponse.POSITIVE Then";
if (_r!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="json = \"'f_imei':\"&Main.imei";
_json = "'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=9043978;
 //BA.debugLineNum = 9043978;BA.debugLine="Dim JobEliminarTodo As HttpJob";
_jobeliminartodo = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=9043979;
 //BA.debugLineNum = 9043979;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me)";
_jobeliminartodo._initialize /*String*/ (null,processBA,"JobEliminarTodo",facturacion.getObject());
RDebugUtils.currentLine=9043980;
 //BA.debugLineNum = 9043980;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa/g";
_jobeliminartodo._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_eliminar_detalle_usuarios2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=9043981;
 //BA.debugLineNum = 9043981;BA.debugLine="End Sub";
return "";
}
public static String  _btnordenenviar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnordenenviar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnordenenviar_click", null));}
int _res = 0;
String _json = "";
com.jq.pedidos.httpjob _jobsalvar = null;
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub btnOrdenEnviar_Click";
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="If Principal.mapEmpresaInfo.Get(\"f_pedidos_minim";
if ((double)(BA.ObjectToNumber(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_pedidos_minimos"))))>_total) { 
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("El monto del pedido minimo debe ser de RD$"+BA.ObjectToString(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_pedidos_minimos")))),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7995398;
 //BA.debugLineNum = 7995398;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="Else If ListViewOrdenProducto.Size = 0 Then";
if (mostCurrent._listviewordenproducto.getSize()==0) { 
RDebugUtils.currentLine=7995400;
 //BA.debugLineNum = 7995400;BA.debugLine="Msgbox(\"No hay productos para registrar esta or";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay productos para registrar esta orden"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7995401;
 //BA.debugLineNum = 7995401;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=7995402;
 //BA.debugLineNum = 7995402;BA.debugLine="else if lblDireccion.Tag = 0 Then";
if ((mostCurrent._lbldireccion.getTag()).equals((Object)(0))) { 
RDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Seleccione la dirección para el envio"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7995404;
 //BA.debugLineNum = 7995404;BA.debugLine="Return";
if (true) return "";
 }}}
;
RDebugUtils.currentLine=7995407;
 //BA.debugLineNum = 7995407;BA.debugLine="Dim res As Int = Msgbox2(\"Seguro que desea reali";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea realizar este pedido?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=7995409;
 //BA.debugLineNum = 7995409;BA.debugLine="If res = DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=7995411;
 //BA.debugLineNum = 7995411;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=7995412;
 //BA.debugLineNum = 7995412;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempre";
_json = "'f_comprobante_fiscal':false,'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_itbis':"+BA.NumberToString(_tax)+",'f_subtotal':"+BA.NumberToString(_subtotal)+",'f_total':"+BA.NumberToString(_total)+",'f_nota':'','f_imei':"+mostCurrent._main._imei /*String*/ +",'f_direccion':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._lbldireccion.getText())+"'";
RDebugUtils.currentLine=7995414;
 //BA.debugLineNum = 7995414;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=7995415;
 //BA.debugLineNum = 7995415;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
_jobsalvar._initialize /*String*/ (null,processBA,"JobSalvar",facturacion.getObject());
RDebugUtils.currentLine=7995416;
 //BA.debugLineNum = 7995416;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_s";
_jobsalvar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/set_salvar_orden_delivery2/","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=7995420;
 //BA.debugLineNum = 7995420;BA.debugLine="Return";
if (true) return "";
 };
 }else {
RDebugUtils.currentLine=7995427;
 //BA.debugLineNum = 7995427;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=7995429;
 //BA.debugLineNum = 7995429;BA.debugLine="res = Msgbox2(\"Para hacer un pedido primero debe";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para hacer un pedido primero debe iniciar Seción"),BA.ObjectToCharSequence("Desea iniciar seción"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=7995431;
 //BA.debugLineNum = 7995431;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=7995432;
 //BA.debugLineNum = 7995432;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=7995433;
 //BA.debugLineNum = 7995433;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=7995436;
 //BA.debugLineNum = 7995436;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=7995441;
 //BA.debugLineNum = 7995441;BA.debugLine="End Sub";
return "";
}
public static String  _cargardirecciones() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargardirecciones", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargardirecciones", null));}
com.jq.pedidos.httpjob _jobdirecciones = null;
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub cargarDirecciones";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
_jobdirecciones._initialize /*String*/ (null,processBA,"JobDirecciones",facturacion.getObject());
RDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
_jobdirecciones._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,""));
RDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.jq.pedidos.httpjob _job) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
int _i = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
String _dr = "";
String _default = "";
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If btnOpcionesProductoSalvar.IsInitialized And bt";
if (mostCurrent._btnopcionesproductosalvar.IsInitialized() && mostCurrent._btnopcionesproductosalvar.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="btnOpcionesProductoSalvar.Enabled = True";
mostCurrent._btnopcionesproductosalvar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="btnOpcionesEliminar.Enabled = True";
mostCurrent._btnopcioneseliminar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="btnOpcionesBack.Enabled = True";
mostCurrent._btnopcionesback.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7798797;
 //BA.debugLineNum = 7798797;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7798801;
 //BA.debugLineNum = 7798801;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7798802;
 //BA.debugLineNum = 7798802;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7798803;
 //BA.debugLineNum = 7798803;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7798804;
 //BA.debugLineNum = 7798804;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=7798805;
 //BA.debugLineNum = 7798805;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=7798807;
 //BA.debugLineNum = 7798807;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobBuscar","JobSalvar","JobDetalleTemporal","JobDirecciones","JobEliminarTodo")) {
case 0: {
RDebugUtils.currentLine=7798811;
 //BA.debugLineNum = 7798811;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=7798813;
 //BA.debugLineNum = 7798813;BA.debugLine="ListViewOrdenProducto.Clear";
mostCurrent._listviewordenproducto.Clear();
RDebugUtils.currentLine=7798814;
 //BA.debugLineNum = 7798814;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=7798815;
 //BA.debugLineNum = 7798815;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No tiene productos registrados"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7798816;
 //BA.debugLineNum = 7798816;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7798820;
 //BA.debugLineNum = 7798820;BA.debugLine="total = 0";
_total = 0;
RDebugUtils.currentLine=7798821;
 //BA.debugLineNum = 7798821;BA.debugLine="tax = 0";
_tax = 0;
RDebugUtils.currentLine=7798822;
 //BA.debugLineNum = 7798822;BA.debugLine="subtotal = 0";
_subtotal = 0;
RDebugUtils.currentLine=7798824;
 //BA.debugLineNum = 7798824;BA.debugLine="For i = 0 To list.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=7798825;
 //BA.debugLineNum = 7798825;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=7798826;
 //BA.debugLineNum = 7798826;BA.debugLine="total = total + map.Get(\"f_importe\")";
_total = _total+(double)(BA.ObjectToNumber(_map.Get((Object)("f_importe"))));
RDebugUtils.currentLine=7798827;
 //BA.debugLineNum = 7798827;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
_tax = _tax+((double)(BA.ObjectToNumber(_map.Get((Object)("f_tax"))))*(double)(BA.ObjectToNumber(_map.Get((Object)("f_cantidad")))));
RDebugUtils.currentLine=7798828;
 //BA.debugLineNum = 7798828;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
_subtotal = _subtotal+((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio"))))*(double)(BA.ObjectToNumber(_map.Get((Object)("f_cantidad")))));
RDebugUtils.currentLine=7798830;
 //BA.debugLineNum = 7798830;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=7798831;
 //BA.debugLineNum = 7798831;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=7798832;
 //BA.debugLineNum = 7798832;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=7798834;
 //BA.debugLineNum = 7798834;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pack";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"packing.png").getObject()));
 };
RDebugUtils.currentLine=7798837;
 //BA.debugLineNum = 7798837;BA.debugLine="ListViewOrdenProducto.AddTwoLinesAndBitmap2(ma";
mostCurrent._listviewordenproducto.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))),BA.ObjectToCharSequence("Cantidad: "+BA.ObjectToString(_map.Get((Object)("f_cantidad")))+"     $"+(anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._funcion._getdecimal /*String*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio"))))+(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax"))))))),(int) (0),(int) (2)))),_bm.getBitmap(),(Object)(_map.getObject()));
 }
};
RDebugUtils.currentLine=7798840;
 //BA.debugLineNum = 7798840;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=7798841;
 //BA.debugLineNum = 7798841;BA.debugLine="lblPrecioEnvio.Text = Principal.mapEmpresaInfo";
mostCurrent._lblprecioenvio.setText(BA.ObjectToCharSequence(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_precio_envio"))));
RDebugUtils.currentLine=7798842;
 //BA.debugLineNum = 7798842;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(fu";
mostCurrent._lblordentotalpagar.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._funcion._getdecimal /*String*/ (mostCurrent.activityBA,_total+(double)(BA.ObjectToNumber(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_precio_envio"))))))),(int) (2),(int) (2))));
 }else {
RDebugUtils.currentLine=7798846;
 //BA.debugLineNum = 7798846;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat2(t";
mostCurrent._lblordentotalpagar.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat2(_total,(int) (0),(int) (2),(int) (2),anywheresoftware.b4a.keywords.Common.False)));
RDebugUtils.currentLine=7798847;
 //BA.debugLineNum = 7798847;BA.debugLine="ToastMessageShow(\"Dicho precio esta calculado";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Dicho precio esta calculado SIN el precio de envio de la empresa correspondiente"),anywheresoftware.b4a.keywords.Common.False);
 };
 break; }
case 1: {
RDebugUtils.currentLine=7798852;
 //BA.debugLineNum = 7798852;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Orden registrada."+anywheresoftware.b4a.keywords.Common.CRLF+"Numero de orden: "+BA.ObjectToString(_map.Get((Object)("f_data")))),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7798853;
 //BA.debugLineNum = 7798853;BA.debugLine="Principal.cantidadProduto = 0";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (0);
RDebugUtils.currentLine=7798854;
 //BA.debugLineNum = 7798854;BA.debugLine="btnOrdenBack_Click";
_btnordenback_click();
 break; }
case 2: {
RDebugUtils.currentLine=7798859;
 //BA.debugLineNum = 7798859;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=7798860;
 //BA.debugLineNum = 7798860;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=7798861;
 //BA.debugLineNum = 7798861;BA.debugLine="If Job.Tag Then";
if (BA.ObjectToBoolean(_job._tag /*Object*/ )) { 
RDebugUtils.currentLine=7798862;
 //BA.debugLineNum = 7798862;BA.debugLine="ToastMessageShow(\"Producto eliminado.\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto eliminado."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7798863;
 //BA.debugLineNum = 7798863;BA.debugLine="Principal.cantidadProduto = Principal.cantida";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (mostCurrent._principal._cantidadproduto /*int*/ -1);
 }else {
RDebugUtils.currentLine=7798865;
 //BA.debugLineNum = 7798865;BA.debugLine="ToastMessageShow(\"Producto actualizado.\",Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto actualizado."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=7798868;
 //BA.debugLineNum = 7798868;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=7798869;
 //BA.debugLineNum = 7798869;BA.debugLine="cargarProductosTemporales";
_cargarproductostemporales();
 }else {
RDebugUtils.currentLine=7798871;
 //BA.debugLineNum = 7798871;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay unidades suficientes de este producto. La existencia actual es de "+BA.ObjectToString(_map.Get((Object)("f_existencia")))),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7798872;
 //BA.debugLineNum = 7798872;BA.debugLine="Return";
if (true) return "";
 };
 break; }
case 3: {
RDebugUtils.currentLine=7798876;
 //BA.debugLineNum = 7798876;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=7798877;
 //BA.debugLineNum = 7798877;BA.debugLine="ListViewDirecciones.Clear";
mostCurrent._listviewdirecciones.Clear();
RDebugUtils.currentLine=7798878;
 //BA.debugLineNum = 7798878;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=7798879;
 //BA.debugLineNum = 7798879;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No tiene direcciones registradas"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7798880;
 //BA.debugLineNum = 7798880;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7798883;
 //BA.debugLineNum = 7798883;BA.debugLine="Dim dr,default=\"\" As String";
_dr = "";
_default = "";
RDebugUtils.currentLine=7798884;
 //BA.debugLineNum = 7798884;BA.debugLine="For i=0 To list.Size -1";
{
final int step76 = 1;
final int limit76 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit76 ;_i = _i + step76 ) {
RDebugUtils.currentLine=7798885;
 //BA.debugLineNum = 7798885;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=7798886;
 //BA.debugLineNum = 7798886;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
_dr = mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion"))));
RDebugUtils.currentLine=7798887;
 //BA.debugLineNum = 7798887;BA.debugLine="If dr.Length > 40 Then";
if (_dr.length()>40) { 
RDebugUtils.currentLine=7798888;
 //BA.debugLineNum = 7798888;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = _dr.substring((int) (0),(int) (40))+"...";
 };
RDebugUtils.currentLine=7798891;
 //BA.debugLineNum = 7798891;BA.debugLine="If map.Get(\"f_principal\") Then";
if (BA.ObjectToBoolean(_map.Get((Object)("f_principal")))) { 
RDebugUtils.currentLine=7798892;
 //BA.debugLineNum = 7798892;BA.debugLine="default = CRLF& \"Dirección principal\"";
_default = anywheresoftware.b4a.keywords.Common.CRLF+"Dirección principal";
 };
RDebugUtils.currentLine=7798895;
 //BA.debugLineNum = 7798895;BA.debugLine="ListViewDirecciones.AddTwoLines2(dr,DateTime.D";
mostCurrent._listviewdirecciones.AddTwoLines2(BA.ObjectToCharSequence(_dr),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(_map.Get((Object)("f_fecha"))))+_default),(Object)(_map.getObject()));
 }
};
 break; }
case 4: {
RDebugUtils.currentLine=7798899;
 //BA.debugLineNum = 7798899;BA.debugLine="map=map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=7798900;
 //BA.debugLineNum = 7798900;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=7798901;
 //BA.debugLineNum = 7798901;BA.debugLine="ListViewOrdenProducto.Clear";
mostCurrent._listviewordenproducto.Clear();
RDebugUtils.currentLine=7798902;
 //BA.debugLineNum = 7798902;BA.debugLine="Principal.cantidadProduto = 0";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (0);
RDebugUtils.currentLine=7798903;
 //BA.debugLineNum = 7798903;BA.debugLine="lblOrdenTotalPagar.Text = \"0.00\"";
mostCurrent._lblordentotalpagar.setText(BA.ObjectToCharSequence("0.00"));
RDebugUtils.currentLine=7798904;
 //BA.debugLineNum = 7798904;BA.debugLine="ToastMessageShow(\"Todos los productos fueron e";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Todos los productos fueron eliminados"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=7798906;
 //BA.debugLineNum = 7798906;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Los productos no fueron eliminados"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
 };
 break; }
}
;
RDebugUtils.currentLine=7798911;
 //BA.debugLineNum = 7798911;BA.debugLine="End Sub";
return "";
}
public static String  _listviewdirecciones_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="lblDireccion.Text = funcion.base64_Decode( map.Ge";
mostCurrent._lbldireccion.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion"))))));
RDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
mostCurrent._lbldireccion.setTag(_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="btnDireccionCerrar_Click";
_btndireccioncerrar_click();
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="End Sub";
return "";
}
public static String  _listviewordenproducto_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewordenproducto_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewordenproducto_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _listaproductos = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub ListViewOrdenProducto_ItemClick (Position As I";
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Dim listaProductos As List";
_listaproductos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="txtCantidad.Text = map.Get(\"f_cantidad\")";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_cantidad"))));
RDebugUtils.currentLine=8454153;
 //BA.debugLineNum = 8454153;BA.debugLine="txtCantidad.Tag = map.Get(\"f_cantidad\")";
mostCurrent._txtcantidad.setTag(_map.Get((Object)("f_cantidad")));
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="lblOpcionesProductoNombre.Text = map.Get(\"f_descr";
mostCurrent._lblopcionesproductonombre.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=8454155;
 //BA.debugLineNum = 8454155;BA.debugLine="txtProductoComentario.Text = funcion.base64_Decod";
mostCurrent._txtproductocomentario.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_comentario"))))));
RDebugUtils.currentLine=8454157;
 //BA.debugLineNum = 8454157;BA.debugLine="json.Initialize(map.Get(\"f_propiedades\"))";
_json.Initialize(BA.ObjectToString(_map.Get((Object)("f_propiedades"))));
RDebugUtils.currentLine=8454158;
 //BA.debugLineNum = 8454158;BA.debugLine="listaProductos = json.NextArray";
_listaproductos = _json.NextArray();
RDebugUtils.currentLine=8454160;
 //BA.debugLineNum = 8454160;BA.debugLine="btnOpcionesProductoSalvar.Tag =Value";
mostCurrent._btnopcionesproductosalvar.setTag(_value);
RDebugUtils.currentLine=8454190;
 //BA.debugLineNum = 8454190;BA.debugLine="End Sub";
return "";
}
public static String  _listviewordenproducto_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewordenproducto_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewordenproducto_itemlongclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _listaproductos = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub ListViewOrdenProducto_ItemLongClick (Position";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Dim listaProductos As List";
_listaproductos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="txtCantidad.Text = map.Get(\"f_cantidad\")";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_cantidad"))));
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="txtCantidad.Tag = map.Get(\"f_cantidad\")";
mostCurrent._txtcantidad.setTag(_map.Get((Object)("f_cantidad")));
RDebugUtils.currentLine=8519689;
 //BA.debugLineNum = 8519689;BA.debugLine="lblOpcionesProductoNombre.Text = map.Get(\"f_descr";
mostCurrent._lblopcionesproductonombre.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=8519690;
 //BA.debugLineNum = 8519690;BA.debugLine="txtProductoComentario.Text = funcion.base64_Decod";
mostCurrent._txtproductocomentario.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_comentario"))))));
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="json.Initialize(map.Get(\"f_propiedades\"))";
_json.Initialize(BA.ObjectToString(_map.Get((Object)("f_propiedades"))));
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="listaProductos = json.NextArray";
_listaproductos = _json.NextArray();
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="btnOpcionesProductoSalvar.Tag =Value";
mostCurrent._btnopcionesproductosalvar.setTag(_value);
RDebugUtils.currentLine=8519725;
 //BA.debugLineNum = 8519725;BA.debugLine="End Sub";
return "";
}
public static String  _paneldireccion_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "paneldireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "paneldireccion_click", null));}
int _res = 0;
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub PanelDireccion_Click";
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="If PanelDireccionModal.IsInitialized = False The";
if (mostCurrent._paneldireccionmodal.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Activity.LoadLayout(\"frmDireccionesModal\")";
mostCurrent._activity.LoadLayout("frmDireccionesModal",mostCurrent.activityBA);
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight =";
mostCurrent._listviewdirecciones.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=8716295;
 //BA.debugLineNum = 8716295;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextCo";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8716296;
 //BA.debugLineNum = 8716296;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typefa";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=8716298;
 //BA.debugLineNum = 8716298;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=8716299;
 //BA.debugLineNum = 8716299;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=8716300;
 //BA.debugLineNum = 8716300;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=8716301;
 //BA.debugLineNum = 8716301;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.G";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewdirecciones,anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=8716304;
 //BA.debugLineNum = 8716304;BA.debugLine="PanelDireccionModal.Visible = False";
mostCurrent._paneldireccionmodal.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=8716305;
 //BA.debugLineNum = 8716305;BA.debugLine="PanelDireccionModal.SetVisibleAnimated(250,True)";
mostCurrent._paneldireccionmodal.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8716307;
 //BA.debugLineNum = 8716307;BA.debugLine="funcion.DisableView(True,PanelOrdenProductos)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelordenproductos);
RDebugUtils.currentLine=8716308;
 //BA.debugLineNum = 8716308;BA.debugLine="funcion.DisableView(False,PanelDireccionModal)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._paneldireccionmodal);
RDebugUtils.currentLine=8716309;
 //BA.debugLineNum = 8716309;BA.debugLine="cargarDirecciones";
_cargardirecciones();
 }else {
RDebugUtils.currentLine=8716313;
 //BA.debugLineNum = 8716313;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=8716315;
 //BA.debugLineNum = 8716315;BA.debugLine="res = Msgbox2(\"Para agregar o ver tus direccione";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para agregar o ver tus direcciones primero debe iniciar Seción"),BA.ObjectToCharSequence("Desea iniciar seción"),"Si","","Mas tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=8716317;
 //BA.debugLineNum = 8716317;BA.debugLine="If res ==  DialogResponse.POSITIVE  Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=8716318;
 //BA.debugLineNum = 8716318;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=8716319;
 //BA.debugLineNum = 8716319;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=8716322;
 //BA.debugLineNum = 8716322;BA.debugLine="Return";
if (true) return "";
 };
 };
RDebugUtils.currentLine=8716327;
 //BA.debugLineNum = 8716327;BA.debugLine="End Sub";
return "";
}
public static String  _productosopciones_animationend() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "productosopciones_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "productosopciones_animationend", null));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub ProductosOpciones_AnimationEnd";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="PanelOpcionesBack.Left = PanelOpcionesBack.Tag";
mostCurrent._panelopcionesback.setLeft((int)(BA.ObjectToNumber(mostCurrent._panelopcionesback.getTag())));
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="End Sub";
return "";
}
}