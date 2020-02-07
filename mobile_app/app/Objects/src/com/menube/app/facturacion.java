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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.menube.app", "com.menube.app.facturacion");
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
		activityBA = new BA(this, layout, processBA, "com.menube.app", "com.menube.app.facturacion");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.menube.app.facturacion", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewopciones = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnopcionesproductosalvar = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtproductocomentario = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnopcioneseliminar = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnabrirdireccion = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewdirecciones = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldireccionmodal = null;
public b4a.example.dateutils _dateutils = null;
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Activity.LoadLayout(\"frmProductoOrden\")";
mostCurrent._activity.LoadLayout("frmProductoOrden",mostCurrent.activityBA);
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.ItemHeigh";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (11),mostCurrent.activityBA));
RDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Tex";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Tex";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Typ";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.Label.Pad";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=5963787;
 //BA.debugLineNum = 5963787;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=5963788;
 //BA.debugLineNum = 5963788;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=5963789;
 //BA.debugLineNum = 5963789;BA.debugLine="ListViewOrdenProducto.TwoLinesAndBitmap.SecondLab";
mostCurrent._listviewordenproducto.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=5963790;
 //BA.debugLineNum = 5963790;BA.debugLine="funcion.SetDivider(ListViewOrdenProducto,Colors.L";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewordenproducto,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=5963791;
 //BA.debugLineNum = 5963791;BA.debugLine="ListViewOrdenProducto.Padding = Array As Int(2%x,";
mostCurrent._listviewordenproducto.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA)});
RDebugUtils.currentLine=5963793;
 //BA.debugLineNum = 5963793;BA.debugLine="lblDireccion.Tag = 0";
mostCurrent._lbldireccion.setTag((Object)(0));
RDebugUtils.currentLine=5963794;
 //BA.debugLineNum = 5963794;BA.debugLine="lblPrecioEnvio.Text = Principal.mapEmpresaInfo.Ge";
mostCurrent._lblprecioenvio.setText(BA.ObjectToCharSequence(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_precio_envio"))));
RDebugUtils.currentLine=5963796;
 //BA.debugLineNum = 5963796;BA.debugLine="cargarProductosTemporales";
_cargarproductostemporales();
RDebugUtils.currentLine=5963798;
 //BA.debugLineNum = 5963798;BA.debugLine="End Sub";
return "";
}
public static String  _cargarproductostemporales() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarproductostemporales", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarproductostemporales", null));}
com.menube.app.httpjob _jobbuscar = null;
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub cargarProductosTemporales";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = new com.menube.app.httpjob();
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
_jobbuscar._initialize /*String*/ (null,processBA,"JobBuscar",facturacion.getObject());
RDebugUtils.currentLine=6029315;
 //BA.debugLineNum = 6029315;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pro";
_jobbuscar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_productos_temporales_by_key","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )));
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="facturacion";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="End Sub";
return "";
}
public static String  _btnabrirdireccion_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnabrirdireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnabrirdireccion_click", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub btnAbrirDireccion_Click";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="StartActivity(Direcciones)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._direcciones.getObject()));
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="End Sub";
return "";
}
public static String  _btncantidadaumentar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncantidadaumentar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncantidadaumentar_click", null));}
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub btnCantidadAumentar_Click";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="If IsNumber(txtCantidad.Text) = False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._txtcantidad.getText())==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="txtCantidad.Text = \"1\"";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence("1"));
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="txtCantidad.Text = txtCantidad.Text + 1";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))+1));
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="End Sub";
return "";
}
public static String  _btncantidaddesaumentar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btncantidaddesaumentar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btncantidaddesaumentar_click", null));}
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub btnCantidadDesaumentar_Click";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="If IsNumber(txtCantidad.Text) = False Then";
if (anywheresoftware.b4a.keywords.Common.IsNumber(mostCurrent._txtcantidad.getText())==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="txtCantidad.Text = \"1\"";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence("1"));
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="If (txtCantidad.Text - 1)  <= 0 Then";
if (((double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))-1)<=0) { 
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="txtCantidad.Text = txtCantidad.Text - 1";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence((double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))-1));
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="End Sub";
return "";
}
public static String  _btndireccioncerrar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndireccioncerrar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndireccioncerrar_click", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub btnDireccionCerrar_Click";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="PanelDireccionModal.SetVisibleAnimated(250,False)";
mostCurrent._paneldireccionmodal.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="funcion.DisableView(False,PanelOrdenProductos)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelordenproductos);
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="funcion.DisableView(True,PanelDireccionModal)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._paneldireccionmodal);
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="End Sub";
return "";
}
public static String  _btnopcionesback_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnopcionesback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnopcionesback_click", null));}
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub btnOpcionesBack_Click";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="End Sub";
return "";
}
public static String  _openopcioneslayout() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openopcioneslayout", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openopcioneslayout", null));}
double _posicion = 0;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub openOpcionesLayout";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim posicion As Double = 100%x";
_posicion = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA);
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="If PanelOpciones.IsInitialized = False Or PanelOp";
if (mostCurrent._panelopciones.IsInitialized()==anywheresoftware.b4a.keywords.Common.False || mostCurrent._panelopcionesback.getLeft()==anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="If PanelOpciones.IsInitialized = False Then";
if (mostCurrent._panelopciones.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="Activity.LoadLayout(\"frmProductoOpciones\")";
mostCurrent._activity.LoadLayout("frmProductoOpciones",mostCurrent.activityBA);
 };
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="PanelOpcionesBack.Left = 100%x";
mostCurrent._panelopcionesback.setLeft(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="posicion = posicion * -1";
_posicion = _posicion*-1;
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="PanelOpcionesBack.Tag = 0";
mostCurrent._panelopcionesback.setTag((Object)(0));
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="PanelOpcionesBack.SetColorAnimated(400,Colors.Tr";
mostCurrent._panelopcionesback.SetColorAnimated((int) (400),anywheresoftware.b4a.keywords.Common.Colors.Transparent,anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (180),(int) (0),(int) (0),(int) (0)));
 }else {
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="funcion.DisableView(False,PanelOrdenProductos)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelordenproductos);
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="PanelOpcionesBack.Tag = 100%x";
mostCurrent._panelopcionesback.setTag((Object)(anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (100),mostCurrent.activityBA)));
RDebugUtils.currentLine=6422542;
 //BA.debugLineNum = 6422542;BA.debugLine="PanelOpcionesBack.SetColorAnimated(150,Colors.AR";
mostCurrent._panelopcionesback.SetColorAnimated((int) (150),anywheresoftware.b4a.keywords.Common.Colors.ARGB((int) (180),(int) (0),(int) (0),(int) (0)),anywheresoftware.b4a.keywords.Common.Colors.Transparent);
 };
RDebugUtils.currentLine=6422545;
 //BA.debugLineNum = 6422545;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=6422546;
 //BA.debugLineNum = 6422546;BA.debugLine="a.InitializeTranslate(\"ProductosOpciones\", 0,0,po";
_a.InitializeTranslate(mostCurrent.activityBA,"ProductosOpciones",(float) (0),(float) (0),(float) (_posicion),(float) (0));
RDebugUtils.currentLine=6422547;
 //BA.debugLineNum = 6422547;BA.debugLine="a.Duration = 250";
_a.setDuration((long) (250));
RDebugUtils.currentLine=6422548;
 //BA.debugLineNum = 6422548;BA.debugLine="a.Start(PanelOpcionesBack)";
_a.Start((android.view.View)(mostCurrent._panelopcionesback.getObject()));
RDebugUtils.currentLine=6422549;
 //BA.debugLineNum = 6422549;BA.debugLine="End Sub";
return "";
}
public static String  _btnopcioneseliminar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnopcioneseliminar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnopcioneseliminar_click", null));}
int _r = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
com.menube.app.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub btnOpcionesEliminar_Click";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim r As Int = Msgbox2(\"Seguro que desea eliminar";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea eliminar este producto?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="If r <> DialogResponse.POSITIVE Then";
if (_r!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6881286;
 //BA.debugLineNum = 6881286;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._btnopcionesproductosalvar.getTag()));
RDebugUtils.currentLine=6881287;
 //BA.debugLineNum = 6881287;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=6881289;
 //BA.debugLineNum = 6881289;BA.debugLine="json = \"'f_regresa':true\"& _ 			\",'f_idempresa':\"";
_json = "'f_regresa':true"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_tipo':2"+",'f_idserver':"+BA.ObjectToString(_map.Get((Object)("f_idserver")));
RDebugUtils.currentLine=6881294;
 //BA.debugLineNum = 6881294;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.menube.app.httpjob();
RDebugUtils.currentLine=6881295;
 //BA.debugLineNum = 6881295;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",facturacion.getObject());
RDebugUtils.currentLine=6881296;
 //BA.debugLineNum = 6881296;BA.debugLine="JobDetalleTemporal.Tag = True";
_jobdetalletemporal._tag /*Object*/  = (Object)(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6881297;
 //BA.debugLineNum = 6881297;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=6881299;
 //BA.debugLineNum = 6881299;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
mostCurrent._btnopcionesproductosalvar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881300;
 //BA.debugLineNum = 6881300;BA.debugLine="btnOpcionesEliminar.Enabled = False";
mostCurrent._btnopcioneseliminar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881301;
 //BA.debugLineNum = 6881301;BA.debugLine="btnOpcionesBack.Enabled = False";
mostCurrent._btnopcionesback.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6881302;
 //BA.debugLineNum = 6881302;BA.debugLine="End Sub";
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
anywheresoftware.b4a.objects.ConcreteViewWrapper _v = null;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _ch = null;
com.menube.app.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(mostCurrent._btnopcionesproductosalvar.getTag()));
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio_original")))),(double)(BA.ObjectToNumber(_map.Get((Object)("f_descuento")))),(double)(Double.parseDouble(mostCurrent._txtcantidad.getText())),(double)(BA.ObjectToNumber(_map.Get((Object)("f_porciento_tax")))),mostCurrent._principal._impuestoincluido /*boolean*/ ,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="Dim jsonPropiedades As String = \"[\"";
_jsonpropiedades = "[";
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="For Each v As View In ScrollViewOpciones.Panel.Ge";
_v = new anywheresoftware.b4a.objects.ConcreteViewWrapper();
{
final anywheresoftware.b4a.BA.IterableList group5 = mostCurrent._scrollviewopciones.getPanel().GetAllViewsRecursive();
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v.setObject((android.view.View)(group5.Get(index5)));
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="If GetType(v) <> \"android.widget.CheckBox\" Then";
if ((anywheresoftware.b4a.keywords.Common.GetType((Object)(_v.getObject()))).equals("android.widget.CheckBox") == false) { 
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Continue";
if (true) continue;
 };
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="Dim ch As CheckBox = v";
_ch = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
_ch.setObject((android.widget.CheckBox)(_v.getObject()));
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="If ch.Checked Then";
if (_ch.getChecked()) { 
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="jsonPropiedades = jsonPropiedades & \",{'f_idrec";
_jsonpropiedades = _jsonpropiedades+",{'f_idrecord':"+BA.ObjectToString(_ch.getTag())+"}";
 };
 }
};
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="jsonPropiedades = jsonPropiedades.Replace(\"[,\",\"[";
_jsonpropiedades = _jsonpropiedades.replace("[,","[");
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="jsonPropiedades = jsonPropiedades& \"]\"";
_jsonpropiedades = _jsonpropiedades+"]";
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_propiedades':"+_jsonpropiedades+",'f_tipo':2"+",'f_cantidad':"+mostCurrent._txtcantidad.getText()+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_idserver':"+BA.ObjectToString(_map.Get((Object)("f_idserver")))+",'f_diferencia':"+BA.NumberToString(mostCurrent._funcion._getdiferenciacantidad /*double*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_cantidad")))),(double)(Double.parseDouble(mostCurrent._txtcantidad.getText()))))+",'f_porciento_descuento':0"+",'f_comentario':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtproductocomentario.getText())+"'"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_porciento_tax")));
RDebugUtils.currentLine=6815779;
 //BA.debugLineNum = 6815779;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.menube.app.httpjob();
RDebugUtils.currentLine=6815780;
 //BA.debugLineNum = 6815780;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",facturacion.getObject());
RDebugUtils.currentLine=6815781;
 //BA.debugLineNum = 6815781;BA.debugLine="JobDetalleTemporal.Tag = False";
_jobdetalletemporal._tag /*Object*/  = (Object)(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6815782;
 //BA.debugLineNum = 6815782;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=6815783;
 //BA.debugLineNum = 6815783;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
mostCurrent._btnopcionesproductosalvar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6815784;
 //BA.debugLineNum = 6815784;BA.debugLine="btnOpcionesEliminar.Enabled = False";
mostCurrent._btnopcioneseliminar.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6815785;
 //BA.debugLineNum = 6815785;BA.debugLine="btnOpcionesBack.Enabled = False";
mostCurrent._btnopcionesback.setEnabled(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6815786;
 //BA.debugLineNum = 6815786;BA.debugLine="End Sub";
return "";
}
public static String  _btnordenback_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnordenback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnordenback_click", null));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Sub btnOrdenBack_Click";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return "";
}
public static String  _btnordeneliminartodos_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnordeneliminartodos_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnordeneliminartodos_click", null));}
int _r = 0;
com.menube.app.httpjob _jobeliminartodo = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub btnOrdenEliminarTodos_Click";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="Dim r As Int = Msgbox2(\"Seguro que desea eliminar";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea eliminar todos los productos?"),BA.ObjectToCharSequence("Confirmación"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="If r <> DialogResponse.POSITIVE Then";
if (_r!=anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="Dim JobEliminarTodo As HttpJob";
_jobeliminartodo = new com.menube.app.httpjob();
RDebugUtils.currentLine=7274503;
 //BA.debugLineNum = 7274503;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me)";
_jobeliminartodo._initialize /*String*/ (null,processBA,"JobEliminarTodo",facturacion.getObject());
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa/g";
_jobeliminartodo._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_eliminar_detalle_usuarios","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,"'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )));
RDebugUtils.currentLine=7274505;
 //BA.debugLineNum = 7274505;BA.debugLine="End Sub";
return "";
}
public static String  _btnordenenviar_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnordenenviar_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnordenenviar_click", null));}
String _json = "";
com.menube.app.httpjob _jobsalvar = null;
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub btnOrdenEnviar_Click";
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="If Principal.mapEmpresaInfo.Get(\"f_pedidos_minimo";
if ((double)(BA.ObjectToNumber(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_pedidos_minimos"))))>_total) { 
RDebugUtils.currentLine=6291459;
 //BA.debugLineNum = 6291459;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de R";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("El monto del pedido minimo debe ser de RD$"+BA.ObjectToString(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_pedidos_minimos")))),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="Else If ListViewOrdenProducto.Size = 0 Then";
if (mostCurrent._listviewordenproducto.getSize()==0) { 
RDebugUtils.currentLine=6291462;
 //BA.debugLineNum = 6291462;BA.debugLine="Msgbox(\"No hay productos para registrar esta ord";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay productos para registrar esta orden"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6291463;
 //BA.debugLineNum = 6291463;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=6291464;
 //BA.debugLineNum = 6291464;BA.debugLine="else if lblDireccion.Tag = 0 Then";
if ((mostCurrent._lbldireccion.getTag()).equals((Object)(0))) { 
RDebugUtils.currentLine=6291465;
 //BA.debugLineNum = 6291465;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Seleccione la dirección para el envio"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6291466;
 //BA.debugLineNum = 6291466;BA.debugLine="Return";
if (true) return "";
 }}}
;
RDebugUtils.currentLine=6291469;
 //BA.debugLineNum = 6291469;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=6291470;
 //BA.debugLineNum = 6291470;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempresa";
_json = "'f_comprobante_fiscal':false,'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_itbis':"+BA.NumberToString(_tax)+",'f_subtotal':"+BA.NumberToString(_subtotal)+",'f_total':"+BA.NumberToString(_total)+",'f_nota':'','f_direccion':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._lbldireccion.getText())+"'";
RDebugUtils.currentLine=6291472;
 //BA.debugLineNum = 6291472;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = new com.menube.app.httpjob();
RDebugUtils.currentLine=6291473;
 //BA.debugLineNum = 6291473;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
_jobsalvar._initialize /*String*/ (null,processBA,"JobSalvar",facturacion.getObject());
RDebugUtils.currentLine=6291474;
 //BA.debugLineNum = 6291474;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_sal";
_jobsalvar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/set_salvar_orden_delivery/","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=6291476;
 //BA.debugLineNum = 6291476;BA.debugLine="End Sub";
return "";
}
public static String  _cargardirecciones() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargardirecciones", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargardirecciones", null));}
com.menube.app.httpjob _jobdirecciones = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub cargarDirecciones";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = new com.menube.app.httpjob();
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
_jobdirecciones._initialize /*String*/ (null,processBA,"JobDirecciones",facturacion.getObject());
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
_jobdirecciones._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,""));
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.menube.app.httpjob _job) throws Exception{
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
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If btnOpcionesProductoSalvar.IsInitialized And bt";
if (mostCurrent._btnopcionesproductosalvar.IsInitialized() && mostCurrent._btnopcionesproductosalvar.getEnabled()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="btnOpcionesProductoSalvar.Enabled = True";
mostCurrent._btnopcionesproductosalvar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="btnOpcionesEliminar.Enabled = True";
mostCurrent._btnopcioneseliminar.setEnabled(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="btnOpcionesBack.Enabled = True";
mostCurrent._btnopcionesback.setEnabled(anywheresoftware.b4a.keywords.Common.True);
 };
RDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6094857;
 //BA.debugLineNum = 6094857;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=6094858;
 //BA.debugLineNum = 6094858;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6094866;
 //BA.debugLineNum = 6094866;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6094867;
 //BA.debugLineNum = 6094867;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6094868;
 //BA.debugLineNum = 6094868;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=6094869;
 //BA.debugLineNum = 6094869;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=6094871;
 //BA.debugLineNum = 6094871;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobBuscar","JobSalvar","JobDetalleTemporal","JobDirecciones","JobEliminarTodo")) {
case 0: {
RDebugUtils.currentLine=6094875;
 //BA.debugLineNum = 6094875;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=6094876;
 //BA.debugLineNum = 6094876;BA.debugLine="ListViewOrdenProducto.Clear";
mostCurrent._listviewordenproducto.Clear();
RDebugUtils.currentLine=6094877;
 //BA.debugLineNum = 6094877;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=6094878;
 //BA.debugLineNum = 6094878;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No tiene productos registrados"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6094879;
 //BA.debugLineNum = 6094879;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6094883;
 //BA.debugLineNum = 6094883;BA.debugLine="total = 0";
_total = 0;
RDebugUtils.currentLine=6094884;
 //BA.debugLineNum = 6094884;BA.debugLine="tax = 0";
_tax = 0;
RDebugUtils.currentLine=6094885;
 //BA.debugLineNum = 6094885;BA.debugLine="subtotal = 0";
_subtotal = 0;
RDebugUtils.currentLine=6094887;
 //BA.debugLineNum = 6094887;BA.debugLine="For i = 0 To list.Size -1";
{
final int step29 = 1;
final int limit29 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit29 ;_i = _i + step29 ) {
RDebugUtils.currentLine=6094888;
 //BA.debugLineNum = 6094888;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=6094889;
 //BA.debugLineNum = 6094889;BA.debugLine="total = total + map.Get(\"f_importe\")";
_total = _total+(double)(BA.ObjectToNumber(_map.Get((Object)("f_importe"))));
RDebugUtils.currentLine=6094890;
 //BA.debugLineNum = 6094890;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
_tax = _tax+((double)(BA.ObjectToNumber(_map.Get((Object)("f_tax"))))*(double)(BA.ObjectToNumber(_map.Get((Object)("f_cantidad")))));
RDebugUtils.currentLine=6094891;
 //BA.debugLineNum = 6094891;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
_subtotal = _subtotal+((double)(BA.ObjectToNumber(_map.Get((Object)("f_precio"))))*(double)(BA.ObjectToNumber(_map.Get((Object)("f_cantidad")))));
RDebugUtils.currentLine=6094893;
 //BA.debugLineNum = 6094893;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6094894;
 //BA.debugLineNum = 6094894;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if (_map.Get((Object)("f_foto"))!= null && (_map.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=6094895;
 //BA.debugLineNum = 6094895;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=6094897;
 //BA.debugLineNum = 6094897;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"pack";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"packing.png").getObject()));
 };
RDebugUtils.currentLine=6094900;
 //BA.debugLineNum = 6094900;BA.debugLine="ListViewOrdenProducto.AddTwoLinesAndBitmap2(ma";
mostCurrent._listviewordenproducto.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))),BA.ObjectToCharSequence("Cantidad: "+BA.ObjectToString(_map.Get((Object)("f_cantidad")))+"     $"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._funcion._getdecimal /*String*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio"))))+(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax"))))))),(int) (0),(int) (2))),_bm.getBitmap(),(Object)(_map.getObject()));
 }
};
RDebugUtils.currentLine=6094902;
 //BA.debugLineNum = 6094902;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(fun";
mostCurrent._lblordentotalpagar.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(Double.parseDouble(mostCurrent._funcion._getdecimal /*String*/ (mostCurrent.activityBA,_total+(double)(BA.ObjectToNumber(mostCurrent._principal._mapempresainfo /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("f_precio_envio"))))))),(int) (0),(int) (2))));
 break; }
case 1: {
RDebugUtils.currentLine=6094905;
 //BA.debugLineNum = 6094905;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Orden registrada."+anywheresoftware.b4a.keywords.Common.CRLF+"Numero de orden: "+BA.ObjectToString(_map.Get((Object)("f_data")))),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6094906;
 //BA.debugLineNum = 6094906;BA.debugLine="Principal.cantidadProduto = 0";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (0);
RDebugUtils.currentLine=6094907;
 //BA.debugLineNum = 6094907;BA.debugLine="btnOrdenBack_Click";
_btnordenback_click();
 break; }
case 2: {
RDebugUtils.currentLine=6094912;
 //BA.debugLineNum = 6094912;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=6094913;
 //BA.debugLineNum = 6094913;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=6094914;
 //BA.debugLineNum = 6094914;BA.debugLine="If Job.Tag Then";
if (BA.ObjectToBoolean(_job._tag /*Object*/ )) { 
RDebugUtils.currentLine=6094915;
 //BA.debugLineNum = 6094915;BA.debugLine="ToastMessageShow(\"Producto eliminado.\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto eliminado."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6094916;
 //BA.debugLineNum = 6094916;BA.debugLine="Principal.cantidadProduto = Principal.cantida";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (mostCurrent._principal._cantidadproduto /*int*/ -1);
 }else {
RDebugUtils.currentLine=6094918;
 //BA.debugLineNum = 6094918;BA.debugLine="ToastMessageShow(\"Producto actualizado.\",Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto actualizado."),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=6094921;
 //BA.debugLineNum = 6094921;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=6094922;
 //BA.debugLineNum = 6094922;BA.debugLine="cargarProductosTemporales";
_cargarproductostemporales();
 }else {
RDebugUtils.currentLine=6094924;
 //BA.debugLineNum = 6094924;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay unidades suficientes de este producto. La existencia actual es de "+BA.ObjectToString(_map.Get((Object)("f_existencia")))),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6094925;
 //BA.debugLineNum = 6094925;BA.debugLine="Return";
if (true) return "";
 };
 break; }
case 3: {
RDebugUtils.currentLine=6094929;
 //BA.debugLineNum = 6094929;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=6094930;
 //BA.debugLineNum = 6094930;BA.debugLine="ListViewDirecciones.Clear";
mostCurrent._listviewdirecciones.Clear();
RDebugUtils.currentLine=6094931;
 //BA.debugLineNum = 6094931;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=6094932;
 //BA.debugLineNum = 6094932;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No tiene direcciones registradas"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=6094933;
 //BA.debugLineNum = 6094933;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6094937;
 //BA.debugLineNum = 6094937;BA.debugLine="Dim dr,default=\"\" As String";
_dr = "";
_default = "";
RDebugUtils.currentLine=6094938;
 //BA.debugLineNum = 6094938;BA.debugLine="For i=0 To list.Size -1";
{
final int step70 = 1;
final int limit70 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
RDebugUtils.currentLine=6094939;
 //BA.debugLineNum = 6094939;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=6094940;
 //BA.debugLineNum = 6094940;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
_dr = mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion"))));
RDebugUtils.currentLine=6094941;
 //BA.debugLineNum = 6094941;BA.debugLine="If dr.Length > 40 Then";
if (_dr.length()>40) { 
RDebugUtils.currentLine=6094942;
 //BA.debugLineNum = 6094942;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = _dr.substring((int) (0),(int) (40))+"...";
 };
RDebugUtils.currentLine=6094945;
 //BA.debugLineNum = 6094945;BA.debugLine="If map.Get(\"f_principal\") Then";
if (BA.ObjectToBoolean(_map.Get((Object)("f_principal")))) { 
RDebugUtils.currentLine=6094946;
 //BA.debugLineNum = 6094946;BA.debugLine="default = CRLF& \"Dirección principal\"";
_default = anywheresoftware.b4a.keywords.Common.CRLF+"Dirección principal";
 };
RDebugUtils.currentLine=6094949;
 //BA.debugLineNum = 6094949;BA.debugLine="ListViewDirecciones.AddTwoLines2(dr,map.Get(\"f";
mostCurrent._listviewdirecciones.AddTwoLines2(BA.ObjectToCharSequence(_dr),BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("f_fecha")))+_default),(Object)(_map.getObject()));
 }
};
 break; }
case 4: {
RDebugUtils.currentLine=6094953;
 //BA.debugLineNum = 6094953;BA.debugLine="map=map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=6094954;
 //BA.debugLineNum = 6094954;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=6094955;
 //BA.debugLineNum = 6094955;BA.debugLine="ListViewOrdenProducto.Clear";
mostCurrent._listviewordenproducto.Clear();
RDebugUtils.currentLine=6094956;
 //BA.debugLineNum = 6094956;BA.debugLine="Principal.cantidadProduto = 0";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (0);
RDebugUtils.currentLine=6094957;
 //BA.debugLineNum = 6094957;BA.debugLine="ToastMessageShow(\"Todos los productos fueron e";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Todos los productos fueron eliminados"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=6094959;
 //BA.debugLineNum = 6094959;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Los productos no fueron eliminados"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
 };
 break; }
}
;
RDebugUtils.currentLine=6094964;
 //BA.debugLineNum = 6094964;BA.debugLine="End Sub";
return "";
}
public static String  _listviewdirecciones_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="lblDireccion.Text = funcion.base64_Decode( map.Ge";
mostCurrent._lbldireccion.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion"))))));
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
mostCurrent._lbldireccion.setTag(_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="btnDireccionCerrar_Click";
_btndireccioncerrar_click();
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="End Sub";
return "";
}
public static String  _listviewordenproducto_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewordenproducto_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewordenproducto_itemlongclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.List _listaproductos = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.LabelWrapper _lbl = null;
double _height = 0;
anywheresoftware.b4a.objects.collections.Map _map2 = null;
int _i = 0;
anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _ch = null;
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub ListViewOrdenProducto_ItemLongClick (Position";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="openOpcionesLayout";
_openopcioneslayout();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim listaProductos As List";
_listaproductos = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="txtCantidad.Text = map.Get(\"f_cantidad\")";
mostCurrent._txtcantidad.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_cantidad"))));
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="txtCantidad.Tag = map.Get(\"f_cantidad\")";
mostCurrent._txtcantidad.setTag(_map.Get((Object)("f_cantidad")));
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="lblOpcionesProductoNombre.Text = map.Get(\"f_descr";
mostCurrent._lblopcionesproductonombre.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="txtProductoComentario.Text = funcion.base64_Decod";
mostCurrent._txtproductocomentario.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_comentario"))))));
RDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="json.Initialize(map.Get(\"f_propiedades\"))";
_json.Initialize(BA.ObjectToString(_map.Get((Object)("f_propiedades"))));
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="listaProductos = json.NextArray";
_listaproductos = _json.NextArray();
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="ScrollViewOpciones.Panel.RemoveAllViews";
mostCurrent._scrollviewopciones.getPanel().RemoveAllViews();
RDebugUtils.currentLine=6750223;
 //BA.debugLineNum = 6750223;BA.debugLine="btnOpcionesProductoSalvar.Tag =Value";
mostCurrent._btnopcionesproductosalvar.setTag(_value);
RDebugUtils.currentLine=6750225;
 //BA.debugLineNum = 6750225;BA.debugLine="If listaProductos.Size = 0 Then";
if (_listaproductos.getSize()==0) { 
RDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="Dim lbl As Label";
_lbl = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="lbl.Initialize(\"-\")";
_lbl.Initialize(mostCurrent.activityBA,"-");
RDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="lbl.Text = \"No hay opciones disponibles\"";
_lbl.setText(BA.ObjectToCharSequence("No hay opciones disponibles"));
RDebugUtils.currentLine=6750229;
 //BA.debugLineNum = 6750229;BA.debugLine="lbl.Gravity = Gravity.CENTER_HORIZONTAL + Gravit";
_lbl.setGravity((int) (anywheresoftware.b4a.keywords.Common.Gravity.CENTER_HORIZONTAL+anywheresoftware.b4a.keywords.Common.Gravity.CENTER_VERTICAL));
RDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="lbl.TextColor = Colors.LightGray";
_lbl.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.LightGray);
RDebugUtils.currentLine=6750231;
 //BA.debugLineNum = 6750231;BA.debugLine="lbl.TextSize = 15";
_lbl.setTextSize((float) (15));
RDebugUtils.currentLine=6750233;
 //BA.debugLineNum = 6750233;BA.debugLine="ScrollViewOpciones.Panel.AddView(lbl,2%x,2%y,Scr";
mostCurrent._scrollviewopciones.getPanel().AddView((android.view.View)(_lbl.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA),mostCurrent._scrollviewopciones.getPanel().getWidth(),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=6750234;
 //BA.debugLineNum = 6750234;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=6750237;
 //BA.debugLineNum = 6750237;BA.debugLine="Dim height As Double = 1%y";
_height = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA);
RDebugUtils.currentLine=6750238;
 //BA.debugLineNum = 6750238;BA.debugLine="Dim map2 As Map";
_map2 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=6750239;
 //BA.debugLineNum = 6750239;BA.debugLine="For i=0 To listaProductos.Size -1";
{
final int step25 = 1;
final int limit25 = (int) (_listaproductos.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
RDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="map2 = listaProductos.Get(i)";
_map2.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listaproductos.Get(_i)));
RDebugUtils.currentLine=6750241;
 //BA.debugLineNum = 6750241;BA.debugLine="Dim ch As CheckBox";
_ch = new anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper();
RDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="ch.Initialize(i&\"ck\")";
_ch.Initialize(mostCurrent.activityBA,BA.NumberToString(_i)+"ck");
RDebugUtils.currentLine=6750243;
 //BA.debugLineNum = 6750243;BA.debugLine="ch.Tag = map2.Get(\"f_idrecord\")";
_ch.setTag(_map2.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=6750244;
 //BA.debugLineNum = 6750244;BA.debugLine="ch.Text = map2.Get(\"f_descripcion\")";
_ch.setText(BA.ObjectToCharSequence(_map2.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=6750245;
 //BA.debugLineNum = 6750245;BA.debugLine="ch.Checked = map2.Get(\"f_agregado\")";
_ch.setChecked(BA.ObjectToBoolean(_map2.Get((Object)("f_agregado"))));
RDebugUtils.currentLine=6750246;
 //BA.debugLineNum = 6750246;BA.debugLine="ch.TextColor = Colors.Black";
_ch.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6750248;
 //BA.debugLineNum = 6750248;BA.debugLine="ScrollViewOpciones.Panel.AddView(ch,2%x,height,9";
mostCurrent._scrollviewopciones.getPanel().AddView((android.view.View)(_ch.getObject()),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA),(int) (_height),anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (96),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA));
RDebugUtils.currentLine=6750249;
 //BA.debugLineNum = 6750249;BA.debugLine="height = height + 5%y";
_height = _height+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (5),mostCurrent.activityBA);
 }
};
RDebugUtils.currentLine=6750251;
 //BA.debugLineNum = 6750251;BA.debugLine="ScrollViewOpciones.Panel.Height = height";
mostCurrent._scrollviewopciones.getPanel().setHeight((int) (_height));
RDebugUtils.currentLine=6750253;
 //BA.debugLineNum = 6750253;BA.debugLine="End Sub";
return "";
}
public static String  _paneldireccion_click() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "paneldireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "paneldireccion_click", null));}
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub PanelDireccion_Click";
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="If PanelDireccionModal.IsInitialized = False Then";
if (mostCurrent._paneldireccionmodal.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Activity.LoadLayout(\"frmDireccionesModal\")";
mostCurrent._activity.LoadLayout("frmDireccionesModal",mostCurrent.activityBA);
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight =";
mostCurrent._listviewdirecciones.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextCol";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typefac";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=6946824;
 //BA.debugLineNum = 6946824;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.T";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.T";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.H";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.Gr";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewdirecciones,anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="PanelDireccionModal.Visible = False";
mostCurrent._paneldireccionmodal.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="PanelDireccionModal.SetVisibleAnimated(250,True)";
mostCurrent._paneldireccionmodal.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="funcion.DisableView(True,PanelOrdenProductos)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelordenproductos);
RDebugUtils.currentLine=6946834;
 //BA.debugLineNum = 6946834;BA.debugLine="funcion.DisableView(False,PanelDireccionModal)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._paneldireccionmodal);
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="cargarDirecciones";
_cargardirecciones();
RDebugUtils.currentLine=6946836;
 //BA.debugLineNum = 6946836;BA.debugLine="End Sub";
return "";
}
public static String  _productosopciones_animationend() throws Exception{
RDebugUtils.currentModule="facturacion";
if (Debug.shouldDelegate(mostCurrent.activityBA, "productosopciones_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "productosopciones_animationend", null));}
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub ProductosOpciones_AnimationEnd";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="PanelOpcionesBack.Left = PanelOpcionesBack.Tag";
mostCurrent._panelopcionesback.setLeft((int)(BA.ObjectToNumber(mostCurrent._panelopcionesback.getTag())));
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="End Sub";
return "";
}
}