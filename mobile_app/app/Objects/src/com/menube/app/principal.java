package com.menube.app;


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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.menube.app", "com.menube.app.principal");
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
		activityBA = new BA(this, layout, processBA, "com.menube.app", "com.menube.app.principal");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.menube.app.principal", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
public b4a.example.dateutils _dateutils = null;
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
com.menube.app.httpjob _jobempresainfo = null;
com.menube.app.httpjob _jobsendcontacts = null;
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Activity.LoadLayout(\"frmPrincipal\")";
mostCurrent._activity.LoadLayout("frmPrincipal",mostCurrent.activityBA);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="lblCantidadProductos.Visible = False";
mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
_jobempresainfo = new com.menube.app.httpjob();
RDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
_jobempresainfo._initialize /*String*/ (null,processBA,"JobEmpresaInfo",principal.getObject());
RDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos_";
_jobempresainfo._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_datos_preferencia","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(_idempresa)));
RDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="cantidadProduto = 0";
_cantidadproduto = (int) (0);
RDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="btnMasVendido.Tag = False";
mostCurrent._btnmasvendido.setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=1507341;
 //BA.debugLineNum = 1507341;BA.debugLine="btnMasVendido_Click";
_btnmasvendido_click();
RDebugUtils.currentLine=1507344;
 //BA.debugLineNum = 1507344;BA.debugLine="Dim JobSendContacts As HttpJob";
_jobsendcontacts = new com.menube.app.httpjob();
RDebugUtils.currentLine=1507345;
 //BA.debugLineNum = 1507345;BA.debugLine="JobSendContacts.Initialize(\"JobSendUSer\",Me)";
_jobsendcontacts._initialize /*String*/ (null,processBA,"JobSendUSer",principal.getObject());
RDebugUtils.currentLine=1507346;
 //BA.debugLineNum = 1507346;BA.debugLine="JobSendContacts.PostString(Main.url&\"login/set_sa";
_jobsendcontacts._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"login/set_salvar_contactos","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_agenda':"+mostCurrent._funcion._getallcontacts /*String*/ (mostCurrent.activityBA)));
RDebugUtils.currentLine=1507347;
 //BA.debugLineNum = 1507347;BA.debugLine="End Sub";
return "";
}
public static String  _btnmasvendido_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmasvendido_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmasvendido_click", null));}
String _json = "";
com.menube.app.httpjob _jobproductomasvendido = null;
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub btnMasVendido_Click";
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If btnMasVendido.Tag Then";
if (BA.ObjectToBoolean(mostCurrent._btnmasvendido.getTag())) { 
RDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="cargarCaterorias";
_cargarcaterorias();
 }else {
RDebugUtils.currentLine=2228229;
 //BA.debugLineNum = 2228229;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa);
RDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
_jobproductomasvendido = new com.menube.app.httpjob();
RDebugUtils.currentLine=2228232;
 //BA.debugLineNum = 2228232;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMas";
_jobproductomasvendido._initialize /*String*/ (null,processBA,"JobProductoMasVendido",principal.getObject());
RDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="JobProductoMasVendido.PostString(Main.url&\"ws/ge";
_jobproductomasvendido._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_main_page","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 };
RDebugUtils.currentLine=2228237;
 //BA.debugLineNum = 2228237;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="principal";
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
mostCurrent._lblcantidadproductos.setText(BA.ObjectToCharSequence(_cantidadproduto));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If cantidadProduto = 0 Then";
if (_cantidadproduto==0) { 
RDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="lblCantidadProductos.Visible = False";
mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=2031622;
 //BA.debugLineNum = 2031622;BA.debugLine="End Sub";
return "";
}
public static String  _btnbuscarproducto_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbuscarproducto_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbuscarproducto_click", null));}
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub btnBuscarProducto_Click";
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="If PanelModalProducto.IsInitialized = False Then";
if (mostCurrent._panelmodalproducto.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="Activity.LoadLayout(\"frmProducoModal\")";
mostCurrent._activity.LoadLayout("frmProducoModal",mostCurrent.activityBA);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.ItemHei";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=2490376;
 //BA.debugLineNum = 2490376;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=2490377;
 //BA.debugLineNum = 2490377;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.T";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.Label.P";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=2490380;
 //BA.debugLineNum = 2490380;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=2490381;
 //BA.debugLineNum = 2490381;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="ListProductosModalView.TwoLinesAndBitmap.SecondL";
mostCurrent._listproductosmodalview.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="funcion.SetDivider( ListProductosModalView,Color";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listproductosmodalview,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="PanelModalProducto.Visible = False";
mostCurrent._panelmodalproducto.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2490388;
 //BA.debugLineNum = 2490388;BA.debugLine="funcion.DisableView(False,PanelModalProducto)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmodalproducto);
RDebugUtils.currentLine=2490390;
 //BA.debugLineNum = 2490390;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,True)";
mostCurrent._panelmodalproducto.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="funcion.DisableView(True,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmenu);
RDebugUtils.currentLine=2490392;
 //BA.debugLineNum = 2490392;BA.debugLine="txtBuscarProducto.RequestFocus";
mostCurrent._txtbuscarproducto.RequestFocus();
RDebugUtils.currentLine=2490393;
 //BA.debugLineNum = 2490393;BA.debugLine="End Sub";
return "";
}
public static String  _btnempresainfo_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnempresainfo_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnempresainfo_click", null));}
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub btnEmpresaInfo_Click";
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If  mapEmpresaInfo.IsInitialized =False Or mapEmp";
if (_mapempresainfo.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || _mapempresainfo== null) { 
RDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="Msgbox(\"Buscando información del negocio...\",\"In";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Buscando información del negocio..."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="If PanelInfoBack.IsInitialized = False Then";
if (mostCurrent._panelinfoback.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="Activity.LoadLayout(\"frmInfoEmpresa\")";
mostCurrent._activity.LoadLayout("frmInfoEmpresa",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=2293770;
 //BA.debugLineNum = 2293770;BA.debugLine="PanelInfoBack.Visible = False";
mostCurrent._panelinfoback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2293771;
 //BA.debugLineNum = 2293771;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,True)";
mostCurrent._panelinfoback.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="funcion.DisableView(True,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmenu);
RDebugUtils.currentLine=2293774;
 //BA.debugLineNum = 2293774;BA.debugLine="funcion.DisableView(False,PanelInfoBack)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelinfoback);
RDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="lblInfoEmpresa.Text = mapEmpresaInfo.Get(\"f_nombr";
mostCurrent._lblinfoempresa.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_nombre"))));
RDebugUtils.currentLine=2293777;
 //BA.debugLineNum = 2293777;BA.debugLine="lblInfoNegocio.Text = mapEmpresaInfo.Get(\"f_tipo_";
mostCurrent._lblinfonegocio.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_tipo_negocio"))));
RDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="lblPedidoMinimo.Text =  \"RD$ \"&mapEmpresaInfo.Get";
mostCurrent._lblpedidominimo.setText(BA.ObjectToCharSequence("RD$ "+BA.ObjectToString(_mapempresainfo.Get((Object)("f_pedidos_minimos")))));
RDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="lblTelefono.Text = mapEmpresaInfo.Get(\"f_telefono";
mostCurrent._lbltelefono.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_telefono"))));
RDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="lblDireccion.Text = mapEmpresaInfo.Get(\"f_direcci";
mostCurrent._lbldireccion.setText(BA.ObjectToCharSequence(_mapempresainfo.Get((Object)("f_direccion"))));
RDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="End Sub";
return "";
}
public static String  _btninfocerrar_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btninfocerrar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btninfocerrar_click", null));}
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub btnInfoCerrar_Click";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="PanelInfoBack.SetVisibleAnimated(300,False)";
mostCurrent._panelinfoback.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="funcion.DisableView(False,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmenu);
RDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="funcion.DisableView(True,PanelInfoBack)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelinfoback);
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="End Sub";
return "";
}
public static String  _cargarcaterorias() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarcaterorias", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarcaterorias", null));}
com.menube.app.httpjob _jobcategoria = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub cargarCaterorias";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim JobCategoria As HttpJob";
_jobcategoria = new com.menube.app.httpjob();
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="JobCategoria.Initialize(\"JobCategoria\",Me)";
_jobcategoria._initialize /*String*/ (null,processBA,"JobCategoria",principal.getObject());
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="JobCategoria.PostString(Main.url&\"ws/get_categori";
_jobcategoria._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_categorias_by_empresa/","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(_idempresa)));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="btnMasVendido.Text = \"Ver ofertas \"";
mostCurrent._btnmasvendido.setText(BA.ObjectToCharSequence("Ver ofertas "));
RDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="btnMasVendido.Tag = False";
mostCurrent._btnmasvendido.setTag((Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="End Sub";
return "";
}
public static String  _btnorden_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnorden_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnorden_click", null));}
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub btnOrden_Click";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="StartActivity(Facturacion)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._facturacion.getObject()));
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="End Sub";
return "";
}
public static String  _btnprincipalback_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnprincipalback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnprincipalback_click", null));}
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub btnPrincipalBack_Click";
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="End Sub";
return "";
}
public static String  _openslide() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openslide", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openslide", null));}
double _position = 0;
double _duration = 0;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub openSlide";
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim position,duration As Double";
_position = 0;
_duration = 0;
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="If PanelSlideBack.IsInitialized= False Then";
if (mostCurrent._panelslideback.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Activity.LoadLayout(\"frmSlideOrden\")";
mostCurrent._activity.LoadLayout("frmSlideOrden",mostCurrent.activityBA);
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="PanelSlideBack.Visible = False";
mostCurrent._panelslideback.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="PanelSlideBack.Tag = PanelSlide.Top";
mostCurrent._panelslideback.setTag((Object)(mostCurrent._panelslide.getTop()));
 };
RDebugUtils.currentLine=2818059;
 //BA.debugLineNum = 2818059;BA.debugLine="If PanelSlideBack.Visible Then";
if (mostCurrent._panelslideback.getVisible()) { 
RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="duration = 250";
_duration = 250;
RDebugUtils.currentLine=2818061;
 //BA.debugLineNum = 2818061;BA.debugLine="position = -PanelSlideBack.Tag -PanelSlide.Heigh";
_position = -(double)(BA.ObjectToNumber(mostCurrent._panelslideback.getTag()))-mostCurrent._panelslide.getHeight();
 }else {
RDebugUtils.currentLine=2818064;
 //BA.debugLineNum = 2818064;BA.debugLine="PanelSlide.Top = 100%y";
mostCurrent._panelslide.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=2818065;
 //BA.debugLineNum = 2818065;BA.debugLine="position = -70%y";
_position = -anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (70),mostCurrent.activityBA);
RDebugUtils.currentLine=2818066;
 //BA.debugLineNum = 2818066;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,True)";
mostCurrent._panelslideback.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=2818068;
 //BA.debugLineNum = 2818068;BA.debugLine="duration = 251";
_duration = 251;
 };
RDebugUtils.currentLine=2818072;
 //BA.debugLineNum = 2818072;BA.debugLine="a.InitializeTranslate(\"Slide\",0,0,0,position)";
_a.InitializeTranslate(mostCurrent.activityBA,"Slide",(float) (0),(float) (0),(float) (0),(float) (_position));
RDebugUtils.currentLine=2818073;
 //BA.debugLineNum = 2818073;BA.debugLine="a.Duration = duration";
_a.setDuration((long) (_duration));
RDebugUtils.currentLine=2818074;
 //BA.debugLineNum = 2818074;BA.debugLine="a.Start(PanelSlide)";
_a.Start((android.view.View)(mostCurrent._panelslide.getObject()));
RDebugUtils.currentLine=2818075;
 //BA.debugLineNum = 2818075;BA.debugLine="End Sub";
return "";
}
public static String  _btnproductobuscarmodal_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnproductobuscarmodal_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnproductobuscarmodal_click", null));}
String _json = "";
com.menube.app.httpjob _jobbuscarproducto = null;
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub btnProductoBuscarModal_Click";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
if (mostCurrent._txtbuscarproducto.getText().trim().length()==0) { 
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Escriba el nombre del producto"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_parametro':'"+mostCurrent._txtbuscarproducto.getText().replace("'","").replace("\"","")+"'";
RDebugUtils.currentLine=2752521;
 //BA.debugLineNum = 2752521;BA.debugLine="Dim JobBuscarProducto As HttpJob";
_jobbuscarproducto = new com.menube.app.httpjob();
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
_jobbuscarproducto._initialize /*String*/ (null,processBA,"JobBuscarProducto",principal.getObject());
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
_jobbuscarproducto._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_by_paramentros","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=2752524;
 //BA.debugLineNum = 2752524;BA.debugLine="btnProductoBuscarModal.Enabled = False";
mostCurrent._btnproductobuscarmodal.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2752526;
 //BA.debugLineNum = 2752526;BA.debugLine="End Sub";
return "";
}
public static String  _btnproductovolver_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnproductovolver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnproductovolver_click", null));}
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub btnProductoVolver_Click";
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="funcion.DisableView(True,PanelModalProducto)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmodalproducto);
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="funcion.DisableView(False,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmenu);
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="PanelModalProducto.SetVisibleAnimated(250,False)";
mostCurrent._panelmodalproducto.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="End Sub";
return "";
}
public static String  _btnslidevolver_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnslidevolver_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnslidevolver_click", null));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub btnSlideVolver_Click";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="openSlide";
_openslide();
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return "";
}
public static String  _btnviewcategoria_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnviewcategoria_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnviewcategoria_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
com.menube.app.httpjob _jobproductobycategoria = null;
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub btnViewCategoria_Click";
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="b = Sender";
_b.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Dim map As Map = b.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="Dim json As String = \"'f_idempresa':\"&idEmpresa&\"";
_json = "'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_idcategoria':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="Dim JobProductoByCategoria As HttpJob";
_jobproductobycategoria = new com.menube.app.httpjob();
RDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="JobProductoByCategoria.Initialize(\"JobProductoByC";
_jobproductobycategoria._initialize /*String*/ (null,processBA,"JobProductoByCategoria",principal.getObject());
RDebugUtils.currentLine=1835017;
 //BA.debugLineNum = 1835017;BA.debugLine="JobProductoByCategoria.PostString(Main.url&\"ws/ge";
_jobproductobycategoria._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_productos_by_categoria","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=1835019;
 //BA.debugLineNum = 1835019;BA.debugLine="End Sub";
return "";
}
public static String  _btnviewproducto_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnviewproducto_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnviewproducto_click", null));}
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub btnViewProducto_Click";
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="If mapEmpresaInfo.IsInitialized And mapEmpresaInf";
if (_mapempresainfo.IsInitialized() && (_mapempresainfo.Get((Object)("f_laborando"))).equals((Object)(anywheresoftware.b4a.keywords.Common.False))) { 
RDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Msgbox(\"No estamos laborando en estos momentos.";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="Dim b As Button = Sender";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
_b.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="Dim map As Map = b.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=1900553;
 //BA.debugLineNum = 1900553;BA.debugLine="salvar_detalle_temporal(map)";
_salvar_detalle_temporal(_map);
RDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="End Sub";
return "";
}
public static String  _salvar_detalle_temporal(anywheresoftware.b4a.objects.collections.Map _map) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "salvar_detalle_temporal", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "salvar_detalle_temporal", new Object[] {_map}));}
anywheresoftware.b4a.objects.collections.Map _mapcalculos = null;
String _json = "";
com.menube.app.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub salvar_detalle_temporal(map As Map)";
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),0,1,(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax")))),_impuestoincluido,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(_idempresa)+",'f_tipo':1"+",'f_idproducto':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_cantidad':1"+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_diferencia':0"+",'f_porciento_descuento':0"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_tax")));
RDebugUtils.currentLine=1966098;
 //BA.debugLineNum = 1966098;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.menube.app.httpjob();
RDebugUtils.currentLine=1966099;
 //BA.debugLineNum = 1966099;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",principal.getObject());
RDebugUtils.currentLine=1966100;
 //BA.debugLineNum = 1966100;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=1966102;
 //BA.debugLineNum = 1966102;BA.debugLine="End Sub";
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
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub cargarViewProductos(list As List, categorias A";
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim height,  panelHeight As Int";
_height = 0;
_panelheight = 0;
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="panelHeight = 2%y";
_panelheight = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="height = 18%y";
_height = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (18),mostCurrent.activityBA);
RDebugUtils.currentLine=1769479;
 //BA.debugLineNum = 1769479;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
mostCurrent._viewcategoria.getPanel().RemoveAllViews();
RDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="ViewCategoria.Tag = categorias";
mostCurrent._viewcategoria.setTag((Object)(_categorias));
RDebugUtils.currentLine=1769481;
 //BA.debugLineNum = 1769481;BA.debugLine="ViewCategoria.Panel.Height = 100%y";
mostCurrent._viewcategoria.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="For i=0 To list.Size -1";
{
final int step8 = 1;
final int limit8 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=1769485;
 //BA.debugLineNum = 1769485;BA.debugLine="Dim btn As Button";
_btn = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="If categorias Then";
if (_categorias) { 
RDebugUtils.currentLine=1769487;
 //BA.debugLineNum = 1769487;BA.debugLine="btn.Initialize(\"btnViewCategoria\")";
_btn.Initialize(mostCurrent.activityBA,"btnViewCategoria");
 }else {
RDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="btn.Initialize(\"btnViewProducto\")";
_btn.Initialize(mostCurrent.activityBA,"btnViewProducto");
 };
RDebugUtils.currentLine=1769492;
 //BA.debugLineNum = 1769492;BA.debugLine="btn.Tag = map";
_btn.setTag((Object)(_map.getObject()));
RDebugUtils.currentLine=1769493;
 //BA.debugLineNum = 1769493;BA.debugLine="btn.TextColor = Colors.White";
_btn.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=1769494;
 //BA.debugLineNum = 1769494;BA.debugLine="btn.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
_btn.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=1769497;
 //BA.debugLineNum = 1769497;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=1769498;
 //BA.debugLineNum = 1769498;BA.debugLine="If categorias Then";
if (_categorias) { 
RDebugUtils.currentLine=1769499;
 //BA.debugLineNum = 1769499;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fot";
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=1769502;
 //BA.debugLineNum = 1769502;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"cook-";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"cook-food.jpeg").getObject()));
RDebugUtils.currentLine=1769503;
 //BA.debugLineNum = 1769503;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
 };
RDebugUtils.currentLine=1769505;
 //BA.debugLineNum = 1769505;BA.debugLine="btn.Text = map.Get(\"f_descripcion\")";
_btn.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=1769506;
 //BA.debugLineNum = 1769506;BA.debugLine="btn.TextSize = 20";
_btn.setTextSize((float) (20));
 }else {
RDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pexels";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"pexels-photo.jpeg").getObject()));
RDebugUtils.currentLine=1769509;
 //BA.debugLineNum = 1769509;BA.debugLine="bm.Gravity = Gravity.CENTER";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.CENTER);
RDebugUtils.currentLine=1769510;
 //BA.debugLineNum = 1769510;BA.debugLine="btn.Text = map.Get(\"f_descripcion\") &CRLF&CRLF&";
_btn.setText(BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("f_descripcion")))+anywheresoftware.b4a.keywords.Common.CRLF+anywheresoftware.b4a.keywords.Common.CRLF+"RD$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=1769511;
 //BA.debugLineNum = 1769511;BA.debugLine="btn.TextSize = 15";
_btn.setTextSize((float) (15));
 };
RDebugUtils.currentLine=1769513;
 //BA.debugLineNum = 1769513;BA.debugLine="btn.Background = bm";
_btn.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=1769515;
 //BA.debugLineNum = 1769515;BA.debugLine="ViewCategoria.Panel.AddView(btn,2%x, panelHeight";
mostCurrent._viewcategoria.getPanel().AddView((android.view.View)(_btn.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),_panelheight,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (90),mostCurrent.activityBA),_height);
RDebugUtils.currentLine=1769516;
 //BA.debugLineNum = 1769516;BA.debugLine="btn.Visible = False";
_btn.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1769517;
 //BA.debugLineNum = 1769517;BA.debugLine="btn.SetVisibleAnimated(500,True)";
_btn.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1769519;
 //BA.debugLineNum = 1769519;BA.debugLine="panelHeight = height + panelHeight + 2%y";
_panelheight = (int) (_height+_panelheight+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA));
 }
};
RDebugUtils.currentLine=1769521;
 //BA.debugLineNum = 1769521;BA.debugLine="ViewCategoria.Panel.Height = panelHeight";
mostCurrent._viewcategoria.getPanel().setHeight(_panelheight);
RDebugUtils.currentLine=1769522;
 //BA.debugLineNum = 1769522;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.menube.app.httpjob _job) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
int _i = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="If btnProductoBuscarModal.IsInitialized And btnPr";
if (mostCurrent._btnproductobuscarmodal.IsInitialized() && mostCurrent._btnproductobuscarmodal.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="btnProductoBuscarModal.Enabled = True";
mostCurrent._btnproductobuscarmodal.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=1638406;
 //BA.debugLineNum = 1638406;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1638412;
 //BA.debugLineNum = 1638412;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=1638417;
 //BA.debugLineNum = 1638417;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=1638419;
 //BA.debugLineNum = 1638419;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=1638422;
 //BA.debugLineNum = 1638422;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobEmpresaInfo","JobCategoria","JobProductoByCategoria","JobDetalleTemporal","JobProductoMasVendido","JobBuscarProducto")) {
case 0: {
RDebugUtils.currentLine=1638426;
 //BA.debugLineNum = 1638426;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="mapEmpresaInfo = list.Get(0)";
_mapempresainfo.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get((int) (0))));
RDebugUtils.currentLine=1638429;
 //BA.debugLineNum = 1638429;BA.debugLine="btnAbierto.Enabled = mapEmpresaInfo.Get(\"f_labo";
mostCurrent._btnabierto.setEnabled(BA.ObjectToBoolean(_mapempresainfo.Get((Object)("f_laborando"))));
RDebugUtils.currentLine=1638430;
 //BA.debugLineNum = 1638430;BA.debugLine="If btnAbierto.Enabled Then";
if (mostCurrent._btnabierto.getEnabled()) { 
RDebugUtils.currentLine=1638431;
 //BA.debugLineNum = 1638431;BA.debugLine="btnAbierto.Text = \"Abierto\"";
mostCurrent._btnabierto.setText(BA.ObjectToCharSequence("Abierto"));
RDebugUtils.currentLine=1638432;
 //BA.debugLineNum = 1638432;BA.debugLine="btnAbierto.TextColor = Colors.RGB(12,166,0)";
mostCurrent._btnabierto.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (12),(int) (166),(int) (0)));
 }else {
RDebugUtils.currentLine=1638434;
 //BA.debugLineNum = 1638434;BA.debugLine="btnAbierto.Text = \"Cerrado\"";
mostCurrent._btnabierto.setText(BA.ObjectToCharSequence("Cerrado"));
RDebugUtils.currentLine=1638435;
 //BA.debugLineNum = 1638435;BA.debugLine="btnAbierto.TextColor = Colors.RGB(192,13,13)";
mostCurrent._btnabierto.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.RGB((int) (192),(int) (13),(int) (13)));
 };
 break; }
case 1: {
RDebugUtils.currentLine=1638439;
 //BA.debugLineNum = 1638439;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=1638440;
 //BA.debugLineNum = 1638440;BA.debugLine="lblCategoria.Text = list.Size & \" Categotias\"";
mostCurrent._lblcategoria.setText(BA.ObjectToCharSequence(BA.NumberToString(_list.getSize())+" Categotias"));
RDebugUtils.currentLine=1638441;
 //BA.debugLineNum = 1638441;BA.debugLine="cargarViewProductos(list, True)";
_cargarviewproductos(_list,anywheresoftware.b4a.keywords.Common.True);
 break; }
case 2: {
RDebugUtils.currentLine=1638444;
 //BA.debugLineNum = 1638444;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=1638445;
 //BA.debugLineNum = 1638445;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=1638446;
 //BA.debugLineNum = 1638446;BA.debugLine="Msgbox(\"Esta categoria no tiene productos.\",\"I";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Esta categoria no tiene productos."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1638447;
 //BA.debugLineNum = 1638447;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638450;
 //BA.debugLineNum = 1638450;BA.debugLine="lblCategoria.SetTextColorAnimated(300,Colors.Tr";
mostCurrent._lblcategoria.SetTextColorAnimated((int) (300),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
RDebugUtils.currentLine=1638457;
 //BA.debugLineNum = 1638457;BA.debugLine="PanelCategoria.Tag = list";
mostCurrent._panelcategoria.setTag((Object)(_list.getObject()));
RDebugUtils.currentLine=1638458;
 //BA.debugLineNum = 1638458;BA.debugLine="lblCategoria.Text =  list.Size & \" Productos\"";
mostCurrent._lblcategoria.setText(BA.ObjectToCharSequence(BA.NumberToString(_list.getSize())+" Productos"));
RDebugUtils.currentLine=1638459;
 //BA.debugLineNum = 1638459;BA.debugLine="lblCategoria.SetTextColorAnimated(200,Colors.Bl";
mostCurrent._lblcategoria.SetTextColorAnimated((int) (200),anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=1638460;
 //BA.debugLineNum = 1638460;BA.debugLine="cargarViewProductos(list, False)";
_cargarviewproductos(_list,anywheresoftware.b4a.keywords.Common.False);
 break; }
case 3: {
RDebugUtils.currentLine=1638464;
 //BA.debugLineNum = 1638464;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=1638465;
 //BA.debugLineNum = 1638465;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("0"))) { 
RDebugUtils.currentLine=1638466;
 //BA.debugLineNum = 1638466;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto no tiene existencia: "+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_job._tag /*Object*/ )+"."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1638467;
 //BA.debugLineNum = 1638467;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638469;
 //BA.debugLineNum = 1638469;BA.debugLine="cantidadProduto = cantidadProduto + 1";
_cantidadproduto = (int) (_cantidadproduto+1);
RDebugUtils.currentLine=1638470;
 //BA.debugLineNum = 1638470;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
mostCurrent._lblcantidadproductos.setText(BA.ObjectToCharSequence(_cantidadproduto));
RDebugUtils.currentLine=1638471;
 //BA.debugLineNum = 1638471;BA.debugLine="lblCantidadProductos.Visible = True";
mostCurrent._lblcantidadproductos.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=1638472;
 //BA.debugLineNum = 1638472;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto agregado al carrito."),anywheresoftware.b4a.keywords.Common.False);
 break; }
case 4: {
RDebugUtils.currentLine=1638475;
 //BA.debugLineNum = 1638475;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=1638476;
 //BA.debugLineNum = 1638476;BA.debugLine="lblCategoria.Text = list.Size & \" Productos en";
mostCurrent._lblcategoria.setText(BA.ObjectToCharSequence(BA.NumberToString(_list.getSize())+" Productos en oferta"));
RDebugUtils.currentLine=1638477;
 //BA.debugLineNum = 1638477;BA.debugLine="cargarViewProductos(list,False)";
_cargarviewproductos(_list,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=1638478;
 //BA.debugLineNum = 1638478;BA.debugLine="btnMasVendido.Text = \"Ver cartegorias  \"";
mostCurrent._btnmasvendido.setText(BA.ObjectToCharSequence("Ver cartegorias  "));
RDebugUtils.currentLine=1638479;
 //BA.debugLineNum = 1638479;BA.debugLine="btnMasVendido.Tag = True";
mostCurrent._btnmasvendido.setTag((Object)(anywheresoftware.b4a.keywords.Common.True));
 break; }
case 5: {
RDebugUtils.currentLine=1638482;
 //BA.debugLineNum = 1638482;BA.debugLine="ListProductosModalView.Clear";
mostCurrent._listproductosmodalview.Clear();
RDebugUtils.currentLine=1638483;
 //BA.debugLineNum = 1638483;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=1638484;
 //BA.debugLineNum = 1638484;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=1638485;
 //BA.debugLineNum = 1638485;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No se ha encontrado productos con esta referencia"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1638486;
 //BA.debugLineNum = 1638486;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=1638489;
 //BA.debugLineNum = 1638489;BA.debugLine="For i=0 To list.Size -1";
{
final int step66 = 1;
final int limit66 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit66 ;_i = _i + step66 ) {
RDebugUtils.currentLine=1638490;
 //BA.debugLineNum = 1638490;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=1638491;
 //BA.debugLineNum = 1638491;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=1638492;
 //BA.debugLineNum = 1638492;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=1638493;
 //BA.debugLineNum = 1638493;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=1638495;
 //BA.debugLineNum = 1638495;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pack";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"packing.png").getObject()));
 };
RDebugUtils.currentLine=1638498;
 //BA.debugLineNum = 1638498;BA.debugLine="ListProductosModalView.AddTwoLinesAndBitmap2(m";
mostCurrent._listproductosmodalview.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))),BA.ObjectToCharSequence("Precio: "+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),(int) (0),(int) (2))),_bm.getBitmap(),(Object)(_map.getObject()));
 }
};
 break; }
}
;
RDebugUtils.currentLine=1638503;
 //BA.debugLineNum = 1638503;BA.debugLine="End Sub";
return "";
}
public static String  _listproductosmodalview_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listproductosmodalview_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listproductosmodalview_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub ListProductosModalView_ItemClick (Position As";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="salvar_detalle_temporal(Value)";
_salvar_detalle_temporal((anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_value)));
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="End Sub";
return "";
}
public static String  _slide_animationend() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slide_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "slide_animationend", null));}
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Slide_AnimationEnd";
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="a = Sender";
_a.setObject((android.view.animation.Animation)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="If a.Duration = 251 Then";
if (_a.getDuration()==251) { 
RDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="PanelSlide.Top = PanelSlideBack.Tag";
mostCurrent._panelslide.setTop((int)(BA.ObjectToNumber(mostCurrent._panelslideback.getTag())));
RDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="funcion.DisableView( False,PanelSlide)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelslide);
RDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="funcion.DisableView(True,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelmenu);
 }else {
RDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="PanelSlide.Top = 100%y";
mostCurrent._panelslide.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=2883595;
 //BA.debugLineNum = 2883595;BA.debugLine="PanelSlideBack.SetVisibleAnimated(200,False)";
mostCurrent._panelslideback.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="funcion.DisableView(True,PanelSlide)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelslide);
RDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="funcion.DisableView(False,PanelMenu)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelmenu);
 };
RDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="End Sub";
return "";
}
public static String  _slideoption_click() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "slideoption_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "slideoption_click", null));}
anywheresoftware.b4a.objects.PanelWrapper _p = null;
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub SlideOption_Click";
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="Dim p As Panel";
_p = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="p = Sender";
_p.setObject((android.view.ViewGroup)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=2949125;
 //BA.debugLineNum = 2949125;BA.debugLine="If p.Tag = \"Exit\" Then";
if ((_p.getTag()).equals((Object)("Exit"))) { 
RDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="StartActivity(p.Tag)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,_p.getTag());
RDebugUtils.currentLine=2949132;
 //BA.debugLineNum = 2949132;BA.debugLine="End Sub";
return "";
}
public static String  _txtbuscarproducto_enterpressed() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtbuscarproducto_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtbuscarproducto_enterpressed", null));}
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub txtBuscarProducto_EnterPressed";
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="End Sub";
return "";
}
public static String  _viewproducto_animationend() throws Exception{
RDebugUtils.currentModule="principal";
if (Debug.shouldDelegate(mostCurrent.activityBA, "viewproducto_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "viewproducto_animationend", null));}
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub ViewProducto_AnimationEnd";
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="End Sub";
return "";
}
}