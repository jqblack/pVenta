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

public class direcciones extends Activity implements B4AActivity{
	public static direcciones mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.jq.pedidos", "com.jq.pedidos.direcciones");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (direcciones).");
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
		activityBA = new BA(this, layout, processBA, "com.jq.pedidos", "com.jq.pedidos.direcciones");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.jq.pedidos.direcciones", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (direcciones) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (direcciones) Resume **");
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
		return direcciones.class;
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
        BA.LogInfo("** Activity (direcciones) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            direcciones mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (direcciones) Resume **");
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
public static anywheresoftware.b4a.objects.collections.Map _mapadir = null;
public static boolean _actualizar = false;
public anywheresoftware.b4a.objects.ButtonWrapper _btndireccionback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnuevadireccion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsalvardireccion = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewdirecciones = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldireccion = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdireccion = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chprincipal = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaceptarnombredir = null;
public anywheresoftware.b4a.objects.LabelWrapper _label16 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombredireccion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnagregardirrd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackrd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndeleterd = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _btnprovinciacombo = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chprincipalrd = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdirerd = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtsector = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtzipcoderd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnagregardireccionfinal = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackusa = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndeleteusa = null;
public anywheresoftware.b4a.objects.SpinnerWrapper _btnstate = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress1 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtaddress2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcity = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtzipcode = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondodireccionesusa = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondonombredir = null;
public static boolean _actu = false;
public anywheresoftware.b4a.objects.collections.Map _mapaedit = null;
public static boolean _edition = false;
public static int _update = 0;
public static boolean _reload = false;
public anywheresoftware.b4a.objects.collections.List _estados = null;
public static int _indexcombo = 0;
public anywheresoftware.b4a.objects.IME _ime = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondodireccionesrd = null;
public anywheresoftware.b4a.objects.ButtonWrapper _adddireccion = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelcombousa = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel1 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label5 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label6 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panel3 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label7 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelzipcode = null;
public static int _tlbl6 = 0;
public static int _tpanel3 = 0;
public static int _tlbl7 = 0;
public static int _tpanelcombousa = 0;
public static int _tlbl8 = 0;
public static int _tpanelzip = 0;
public static int _tpanelmarco = 0;
public anywheresoftware.b4a.objects.LabelWrapper _label8 = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmarcodirrd = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmarconombredir = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _r = 0;
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Activity.LoadLayout(\"frmDirecciones\")";
mostCurrent._activity.LoadLayout("frmDirecciones",mostCurrent.activityBA);
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight = 8";
mostCurrent._listviewdirecciones.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextColo";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=9240582;
 //BA.debugLineNum = 9240582;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typeface";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=9240584;
 //BA.debugLineNum = 9240584;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Te";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=9240585;
 //BA.debugLineNum = 9240585;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Ty";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=9240586;
 //BA.debugLineNum = 9240586;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.He";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=9240587;
 //BA.debugLineNum = 9240587;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.Gra";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewdirecciones,anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=9240597;
 //BA.debugLineNum = 9240597;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=9240598;
 //BA.debugLineNum = 9240598;BA.debugLine="cargarDirecciones";
_cargardirecciones();
 }else {
RDebugUtils.currentLine=9240602;
 //BA.debugLineNum = 9240602;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=9240604;
 //BA.debugLineNum = 9240604;BA.debugLine="r = Msgbox2(\"Para ver sus direcciones debe de in";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para ver sus direcciones debe de iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar Sesión?"),"Si","","Más tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=9240606;
 //BA.debugLineNum = 9240606;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=9240607;
 //BA.debugLineNum = 9240607;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9240608;
 //BA.debugLineNum = 9240608;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=9240611;
 //BA.debugLineNum = 9240611;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
 };
 };
RDebugUtils.currentLine=9240615;
 //BA.debugLineNum = 9240615;BA.debugLine="End Sub";
return "";
}
public static String  _cargardirecciones() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargardirecciones", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargardirecciones", null));}
com.jq.pedidos.httpjob _jobdirecciones = null;
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub cargarDirecciones";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
_jobdirecciones._initialize /*String*/ (null,processBA,"JobDirecciones",direcciones.getObject());
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
_jobdirecciones._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,""));
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
return "";
}
public static boolean  _activity_keypress(int _keycode) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_keypress", false))
	 {return ((Boolean) Debug.delegate(mostCurrent.activityBA, "activity_keypress", new Object[] {_keycode}));}
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub Activity_KeyPress (KeyCode As Int) As Boolean";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="If KeyCode = KeyCodes.KEYCODE_BACK Then";
if (_keycode==anywheresoftware.b4a.keywords.Common.KeyCodes.KEYCODE_BACK) { 
RDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="If Principal.isUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="txtCity.RequestFocus";
mostCurrent._txtcity.RequestFocus();
 }else {
RDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="txtSector.RequestFocus";
mostCurrent._txtsector.RequestFocus();
 };
RDebugUtils.currentLine=11075593;
 //BA.debugLineNum = 11075593;BA.debugLine="Return True";
if (true) return anywheresoftware.b4a.keywords.Common.True;
 };
RDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="End Sub";
return false;
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="direcciones";
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="cargarDirecciones";
_cargardirecciones();
 };
RDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="End Sub";
return "";
}
public static String  _actualizardirecciones() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "actualizardirecciones", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "actualizardirecciones", null));}
com.jq.pedidos.httpjob _jobdirecciones = null;
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub actualizarDirecciones";
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="ProgressDialogShow(\"We're reloading your address";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("We're reloading your addresses"));
 }else {
RDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="ProgressDialogShow(\"Actualizando sus direcciónes";
anywheresoftware.b4a.keywords.Common.ProgressDialogShow(mostCurrent.activityBA,BA.ObjectToCharSequence("Actualizando sus direcciónes"));
 };
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=10551305;
 //BA.debugLineNum = 10551305;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
_jobdirecciones._initialize /*String*/ (null,processBA,"JobDirecciones",direcciones.getObject());
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
_jobdirecciones._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,""));
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="End Sub";
return "";
}
public static String  _adddireccion_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "adddireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "adddireccion_click", null));}
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub AddDireccion_Click";
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="If PanelFondoDireccionesUSA.IsInitialized == Fal";
if (mostCurrent._panelfondodireccionesusa.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="Activity.LoadLayout(\"frmDireccionesUsa\")";
mostCurrent._activity.LoadLayout("frmDireccionesUsa",mostCurrent.activityBA);
RDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="PanelFondoDireccionesUSA.Visible = False";
mostCurrent._panelfondodireccionesusa.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10813450;
 //BA.debugLineNum = 10813450;BA.debugLine="PanelFondoDireccionesUSA.SetVisibleAnimated(200,";
mostCurrent._panelfondodireccionesusa.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10813451;
 //BA.debugLineNum = 10813451;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._paneldireccion);
RDebugUtils.currentLine=10813453;
 //BA.debugLineNum = 10813453;BA.debugLine="btnState.DropdownBackgroundColor = Colors.White";
mostCurrent._btnstate.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=10813454;
 //BA.debugLineNum = 10813454;BA.debugLine="btnState.DropdownTextColor = Colors.Black";
mostCurrent._btnstate.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=10813456;
 //BA.debugLineNum = 10813456;BA.debugLine="btnState.AddAll(estados)";
mostCurrent._btnstate.AddAll(mostCurrent._estados);
RDebugUtils.currentLine=10813459;
 //BA.debugLineNum = 10813459;BA.debugLine="If edition Then";
if (_edition) { 
RDebugUtils.currentLine=10813460;
 //BA.debugLineNum = 10813460;BA.debugLine="btnDeleteUsa.Visible = True";
mostCurrent._btndeleteusa.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=10813462;
 //BA.debugLineNum = 10813462;BA.debugLine="btnDeleteUsa.Visible = False";
mostCurrent._btndeleteusa.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10813464;
 //BA.debugLineNum = 10813464;BA.debugLine="actu = False";
_actu = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=10813468;
 //BA.debugLineNum = 10813468;BA.debugLine="If PanelFondoDireccionesRD.IsInitialized == Fals";
if (mostCurrent._panelfondodireccionesrd.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10813469;
 //BA.debugLineNum = 10813469;BA.debugLine="Activity.LoadLayout(\"frmDireccionesRD\")";
mostCurrent._activity.LoadLayout("frmDireccionesRD",mostCurrent.activityBA);
RDebugUtils.currentLine=10813470;
 //BA.debugLineNum = 10813470;BA.debugLine="PanelFondoDireccionesRD.Visible = False";
mostCurrent._panelfondodireccionesrd.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10813473;
 //BA.debugLineNum = 10813473;BA.debugLine="PanelFondoDireccionesRD.SetVisibleAnimated(200,T";
mostCurrent._panelfondodireccionesrd.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10813474;
 //BA.debugLineNum = 10813474;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._paneldireccion);
RDebugUtils.currentLine=10813476;
 //BA.debugLineNum = 10813476;BA.debugLine="btnProvinciaCombo.DropdownBackgroundColor = Colo";
mostCurrent._btnprovinciacombo.setDropdownBackgroundColor(anywheresoftware.b4a.keywords.Common.Colors.White);
RDebugUtils.currentLine=10813477;
 //BA.debugLineNum = 10813477;BA.debugLine="btnProvinciaCombo.DropdownTextColor = Colors.Bla";
mostCurrent._btnprovinciacombo.setDropdownTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=10813479;
 //BA.debugLineNum = 10813479;BA.debugLine="btnProvinciaCombo.AddAll(estados)";
mostCurrent._btnprovinciacombo.AddAll(mostCurrent._estados);
RDebugUtils.currentLine=10813482;
 //BA.debugLineNum = 10813482;BA.debugLine="If edition Then";
if (_edition) { 
RDebugUtils.currentLine=10813483;
 //BA.debugLineNum = 10813483;BA.debugLine="btnDeleteRD.Visible = True";
mostCurrent._btndeleterd.setVisible(anywheresoftware.b4a.keywords.Common.True);
 }else {
RDebugUtils.currentLine=10813485;
 //BA.debugLineNum = 10813485;BA.debugLine="btnDeleteRD.Visible = False";
mostCurrent._btndeleterd.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10813487;
 //BA.debugLineNum = 10813487;BA.debugLine="actu = False";
_actu = anywheresoftware.b4a.keywords.Common.False;
 };
RDebugUtils.currentLine=10813491;
 //BA.debugLineNum = 10813491;BA.debugLine="End Sub";
return "";
}
public static String  _btnaceptarnombredir_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaceptarnombredir_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaceptarnombredir_click", null));}
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub btnAceptarNombreDir_Click";
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="PanelFondoNombreDir.SetVisibleAnimated(200,False)";
mostCurrent._panelfondonombredir.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="ingresarDirUSA";
_ingresardirusa();
 }else {
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="ingresarDirRD";
_ingresardirrd();
 };
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="End Sub";
return "";
}
public static String  _ingresardirusa() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ingresardirusa", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ingresardirusa", null));}
String _json = "";
com.jq.pedidos.httpjob _jobsalvar = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub ingresarDirUSA";
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="If txtAddress1.Text == \"\" Then";
if ((mostCurrent._txtaddress1.getText()).equals("")) { 
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="Msgbox(\"The Addres 1 can't be empty!!\",\"Error\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("The Addres 1 can't be empty!!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10027015;
 //BA.debugLineNum = 10027015;BA.debugLine="If txtCity.Text == \"\" Then";
if ((mostCurrent._txtcity.getText()).equals("")) { 
RDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="Msgbox(\"The City can't be empty!!\",\"Error\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("The City can't be empty!!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10027020;
 //BA.debugLineNum = 10027020;BA.debugLine="If txtZipCode.Text == \"\" Then";
if ((mostCurrent._txtzipcode.getText()).equals("")) { 
RDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="Msgbox(\"The Zip Code can't be empty!!\",\"Error\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("The Zip Code can't be empty!!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10027025;
 //BA.debugLineNum = 10027025;BA.debugLine="If actu Then";
if (_actu) { 
RDebugUtils.currentLine=10027027;
 //BA.debugLineNum = 10027027;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10027028;
 //BA.debugLineNum = 10027028;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipal.getChecked())+",'f_direccion1':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtaddress1.getText().trim())+"','f_direccion2':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtaddress2.getText().trim())+"','f_idrecord':"+BA.NumberToString(_update)+",'f_iddireccion':"+BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_idrecord")))+",'f_usa':"+BA.ObjectToString(mostCurrent._principal._isusa /*boolean*/ )+",'f_sector_city':'"+mostCurrent._txtcity.getText()+"','f_zipcode':"+mostCurrent._txtzipcode.getText()+",'f_state_prov':"+BA.NumberToString((_indexcombo+1))+",'f_nombre_direccion':'"+mostCurrent._txtnombredireccion.getText()+"'";
RDebugUtils.currentLine=10027031;
 //BA.debugLineNum = 10027031;BA.debugLine="actu = False";
_actu = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=10027035;
 //BA.debugLineNum = 10027035;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10027036;
 //BA.debugLineNum = 10027036;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipal.getChecked())+",'f_direccion1':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtaddress1.getText().trim())+"','f_direccion2':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtaddress2.getText().trim())+"','f_idrecord':"+BA.NumberToString(_update)+",'f_usa':"+BA.ObjectToString(mostCurrent._principal._isusa /*boolean*/ )+",'f_sector_city':'"+mostCurrent._txtcity.getText()+"','f_zipcode':"+mostCurrent._txtzipcode.getText()+",'f_state_prov':"+BA.NumberToString((_indexcombo+1))+",'f_nombre_direccion':'"+mostCurrent._txtnombredireccion.getText()+"'";
 };
RDebugUtils.currentLine=10027041;
 //BA.debugLineNum = 10027041;BA.debugLine="reload = True";
_reload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=10027042;
 //BA.debugLineNum = 10027042;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=10027043;
 //BA.debugLineNum = 10027043;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
_jobsalvar._initialize /*String*/ (null,processBA,"JobSalvar",direcciones.getObject());
RDebugUtils.currentLine=10027044;
 //BA.debugLineNum = 10027044;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
_jobsalvar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/set_salvar_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=10027046;
 //BA.debugLineNum = 10027046;BA.debugLine="update = 0";
_update = (int) (0);
RDebugUtils.currentLine=10027047;
 //BA.debugLineNum = 10027047;BA.debugLine="End Sub";
return "";
}
public static String  _ingresardirrd() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "ingresardirrd", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "ingresardirrd", null));}
String _json = "";
com.jq.pedidos.httpjob _jobsalvar = null;
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub ingresarDirRD";
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="If txtDireRD.Text == \"\" Then";
if ((mostCurrent._txtdirerd.getText()).equals("")) { 
RDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="Msgbox(\"La dirección no puede estar vacia!!\",\"Er";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La dirección no puede estar vacia!!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="If txtSector.Text == \"\" Then";
if ((mostCurrent._txtsector.getText()).equals("")) { 
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="Msgbox(\"El sector no puede estar vacio!!\",\"Error";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("El sector no puede estar vacio!!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10158092;
 //BA.debugLineNum = 10158092;BA.debugLine="If txtZipCodeRD.Text == \"\" Then";
if ((mostCurrent._txtzipcoderd.getText()).equals("")) { 
RDebugUtils.currentLine=10158093;
 //BA.debugLineNum = 10158093;BA.debugLine="Msgbox(\"El Zip Code no puede estar vacio!!\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("El Zip Code no puede estar vacio!!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=10158094;
 //BA.debugLineNum = 10158094;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10158097;
 //BA.debugLineNum = 10158097;BA.debugLine="If actu Then";
if (_actu) { 
RDebugUtils.currentLine=10158099;
 //BA.debugLineNum = 10158099;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10158100;
 //BA.debugLineNum = 10158100;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Checked&\",";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipalrd.getChecked())+",'f_direccion1':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtdirerd.getText().trim())+"','f_direccion2':''"+",'f_idrecord':"+BA.NumberToString(_update)+",'f_iddireccion':"+BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_idrecord")))+",'f_usa':"+BA.ObjectToString(mostCurrent._principal._isusa /*boolean*/ )+",'f_sector_city':'"+mostCurrent._txtsector.getText()+"','f_zipcode':"+mostCurrent._txtzipcoderd.getText()+",'f_state_prov':"+BA.NumberToString((_indexcombo+1))+",'f_nombre_direccion':'"+mostCurrent._txtnombredireccion.getText()+"'";
RDebugUtils.currentLine=10158103;
 //BA.debugLineNum = 10158103;BA.debugLine="actu = False";
_actu = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=10158107;
 //BA.debugLineNum = 10158107;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10158108;
 //BA.debugLineNum = 10158108;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Checked&\",";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipalrd.getChecked())+",'f_direccion1':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtdirerd.getText().trim())+"','f_direccion2':'','f_idrecord':"+BA.NumberToString(_update)+",'f_usa':"+BA.ObjectToString(mostCurrent._principal._isusa /*boolean*/ )+",'f_sector_city':'"+mostCurrent._txtsector.getText()+"','f_zipcode':"+mostCurrent._txtzipcoderd.getText()+",'f_state_prov':"+BA.NumberToString((_indexcombo+1))+",'f_nombre_direccion':'"+mostCurrent._txtnombredireccion.getText()+"'";
 };
RDebugUtils.currentLine=10158113;
 //BA.debugLineNum = 10158113;BA.debugLine="reload = True";
_reload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=10158114;
 //BA.debugLineNum = 10158114;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=10158115;
 //BA.debugLineNum = 10158115;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
_jobsalvar._initialize /*String*/ (null,processBA,"JobSalvar",direcciones.getObject());
RDebugUtils.currentLine=10158116;
 //BA.debugLineNum = 10158116;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
_jobsalvar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/set_salvar_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=10158118;
 //BA.debugLineNum = 10158118;BA.debugLine="update = 0";
_update = (int) (0);
RDebugUtils.currentLine=10158120;
 //BA.debugLineNum = 10158120;BA.debugLine="End Sub";
return "";
}
public static String  _btnagregardireccionfinal_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnagregardireccionfinal_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnagregardireccionfinal_click", null));}
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub BtnAgregarDireccionFinal_Click";
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="NombreDireccion";
_nombredireccion();
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="End Sub";
return "";
}
public static String  _nombredireccion() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "nombredireccion", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "nombredireccion", null));}
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub NombreDireccion";
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="If PanelFondoNombreDir.IsInitialized == False The";
if (mostCurrent._panelfondonombredir.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="Activity.LoadLayout(\"frmNombreDireccion\")";
mostCurrent._activity.LoadLayout("frmNombreDireccion",mostCurrent.activityBA);
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="PanelFondoNombreDir.Visible = False";
mostCurrent._panelfondonombredir.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=10747911;
 //BA.debugLineNum = 10747911;BA.debugLine="PanelFondoNombreDir.SetVisibleAnimated(250,True)";
mostCurrent._panelfondonombredir.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10747913;
 //BA.debugLineNum = 10747913;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=10747914;
 //BA.debugLineNum = 10747914;BA.debugLine="Label16.Text = \"Name of the address\"";
mostCurrent._label16.setText(BA.ObjectToCharSequence("Name of the address"));
RDebugUtils.currentLine=10747915;
 //BA.debugLineNum = 10747915;BA.debugLine="txtNombreDireccion.Text = \"\"";
mostCurrent._txtnombredireccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10747916;
 //BA.debugLineNum = 10747916;BA.debugLine="txtNombreDireccion.Hint = \"Name of the address\"";
mostCurrent._txtnombredireccion.setHint("Name of the address");
 }else {
RDebugUtils.currentLine=10747918;
 //BA.debugLineNum = 10747918;BA.debugLine="Label16.Text = \"Nombre de la dirección\"";
mostCurrent._label16.setText(BA.ObjectToCharSequence("Nombre de la dirección"));
RDebugUtils.currentLine=10747919;
 //BA.debugLineNum = 10747919;BA.debugLine="txtNombreDireccion.Text = \"\"";
mostCurrent._txtnombredireccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10747920;
 //BA.debugLineNum = 10747920;BA.debugLine="txtNombreDireccion.Hint = \"Nombre de la direcció";
mostCurrent._txtnombredireccion.setHint("Nombre de la dirección");
 };
RDebugUtils.currentLine=10747924;
 //BA.debugLineNum = 10747924;BA.debugLine="End Sub";
return "";
}
public static String  _btnagregardirrd_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnagregardirrd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnagregardirrd_click", null));}
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub btnAgregarDirRD_Click";
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="NombreDireccion";
_nombredireccion();
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="End Sub";
return "";
}
public static void  _btnbackrd_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackrd_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnbackrd_click", null); return;}
ResumableSub_btnBackRd_Click rsub = new ResumableSub_btnBackRd_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnBackRd_Click extends BA.ResumableSub {
public ResumableSub_btnBackRd_Click(com.jq.pedidos.direcciones parent) {
this.parent = parent;
}
com.jq.pedidos.direcciones parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="direcciones";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="PanelFondoDireccionesRD.SetVisibleAnimated(250,Fa";
parent.mostCurrent._panelfondodireccionesrd.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="funcion.DisableView(False,PanelDireccion)";
parent.mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._paneldireccion);
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="PanelDireccion.SetVisibleAnimated(200,True)";
parent.mostCurrent._paneldireccion.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="If reload Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._reload) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="actualizarDirecciones";
_actualizardirecciones();
RDebugUtils.currentLine=10354696;
 //BA.debugLineNum = 10354696;BA.debugLine="reload = False";
parent._reload = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=10354699;
 //BA.debugLineNum = 10354699;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "direcciones", "btnbackrd_click"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=10354701;
 //BA.debugLineNum = 10354701;BA.debugLine="txtDireRD.Text = \"\"";
parent.mostCurrent._txtdirerd.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10354702;
 //BA.debugLineNum = 10354702;BA.debugLine="txtSector.Text = \"\"";
parent.mostCurrent._txtsector.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10354703;
 //BA.debugLineNum = 10354703;BA.debugLine="btnProvinciaCombo.SelectedIndex = -1";
parent.mostCurrent._btnprovinciacombo.setSelectedIndex((int) (-1));
RDebugUtils.currentLine=10354704;
 //BA.debugLineNum = 10354704;BA.debugLine="txtZipCodeRD.Text = \"\"";
parent.mostCurrent._txtzipcoderd.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10354705;
 //BA.debugLineNum = 10354705;BA.debugLine="chPrincipalRD.Checked = False";
parent.mostCurrent._chprincipalrd.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=10354707;
 //BA.debugLineNum = 10354707;BA.debugLine="edition = False";
parent._edition = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=10354708;
 //BA.debugLineNum = 10354708;BA.debugLine="actu = False";
parent._actu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=10354710;
 //BA.debugLineNum = 10354710;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static void  _btnbackusa_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackusa_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnbackusa_click", null); return;}
ResumableSub_btnBackUsa_Click rsub = new ResumableSub_btnBackUsa_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnBackUsa_Click extends BA.ResumableSub {
public ResumableSub_btnBackUsa_Click(com.jq.pedidos.direcciones parent) {
this.parent = parent;
}
com.jq.pedidos.direcciones parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="direcciones";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="funcion.DisableView(False,PanelDireccion)";
parent.mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,parent.mostCurrent._paneldireccion);
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="PanelFondoDireccionesUSA.SetVisibleAnimated(200,F";
parent.mostCurrent._panelfondodireccionesusa.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="PanelDireccion.SetVisibleAnimated(200,True)";
parent.mostCurrent._paneldireccion.SetVisibleAnimated((int) (200),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="If reload Then";
if (true) break;

case 1:
//if
this.state = 4;
if (parent._reload) { 
this.state = 3;
}if (true) break;

case 3:
//C
this.state = 4;
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="actualizarDirecciones";
_actualizardirecciones();
RDebugUtils.currentLine=10616840;
 //BA.debugLineNum = 10616840;BA.debugLine="reload = False";
parent._reload = anywheresoftware.b4a.keywords.Common.False;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=10616843;
 //BA.debugLineNum = 10616843;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "direcciones", "btnbackusa_click"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=10616845;
 //BA.debugLineNum = 10616845;BA.debugLine="txtAddress1.Text = \"\"";
parent.mostCurrent._txtaddress1.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10616846;
 //BA.debugLineNum = 10616846;BA.debugLine="txtAddress2.Text = \"\"";
parent.mostCurrent._txtaddress2.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10616847;
 //BA.debugLineNum = 10616847;BA.debugLine="txtCity.Text = \"\"";
parent.mostCurrent._txtcity.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10616848;
 //BA.debugLineNum = 10616848;BA.debugLine="btnState.SelectedIndex = -1";
parent.mostCurrent._btnstate.setSelectedIndex((int) (-1));
RDebugUtils.currentLine=10616849;
 //BA.debugLineNum = 10616849;BA.debugLine="txtZipCode.Text = \"\"";
parent.mostCurrent._txtzipcode.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=10616850;
 //BA.debugLineNum = 10616850;BA.debugLine="chPrincipal.Checked = False";
parent.mostCurrent._chprincipal.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=10616852;
 //BA.debugLineNum = 10616852;BA.debugLine="edition = False";
parent._edition = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=10616853;
 //BA.debugLineNum = 10616853;BA.debugLine="actu = False";
parent._actu = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=10616855;
 //BA.debugLineNum = 10616855;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btndeleterd_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndeleterd_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndeleterd_click", null));}
int _res = 0;
String _json = "";
com.jq.pedidos.httpjob _jobdeletedir = null;
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub btnDeleteRD_Click";
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="res = Msgbox2(\"Desea borrar esta dirección\",\"Avis";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Desea borrar esta dirección"),BA.ObjectToCharSequence("Aviso!"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="If res == DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=10289159;
 //BA.debugLineNum = 10289159;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10289160;
 //BA.debugLineNum = 10289160;BA.debugLine="json = \"'f_idrecord':\"&mapaEdit.Get(\"f_idrecord\"";
_json = "'f_idrecord':"+BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=10289162;
 //BA.debugLineNum = 10289162;BA.debugLine="Dim JobDeleteDir As HttpJob";
_jobdeletedir = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=10289163;
 //BA.debugLineNum = 10289163;BA.debugLine="JobDeleteDir.Initialize(\"JobDeleteDir\",Me)";
_jobdeletedir._initialize /*String*/ (null,processBA,"JobDeleteDir",direcciones.getObject());
RDebugUtils.currentLine=10289164;
 //BA.debugLineNum = 10289164;BA.debugLine="JobDeleteDir.PostString(Main.url&\"ws/borrar_dire";
_jobdeletedir._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/borrar_direccion","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=10289167;
 //BA.debugLineNum = 10289167;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10289170;
 //BA.debugLineNum = 10289170;BA.debugLine="End Sub";
return "";
}
public static String  _btndeleteusa_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndeleteusa_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndeleteusa_click", null));}
int _res = 0;
String _json = "";
com.jq.pedidos.httpjob _jobdeletedir = null;
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub btnDeleteUsa_Click";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim res As Int";
_res = 0;
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="res = Msgbox2(\"Do you want to delete this address";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Do you want to delete this address?"),BA.ObjectToCharSequence("Warning!"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=10485765;
 //BA.debugLineNum = 10485765;BA.debugLine="If res == DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=10485767;
 //BA.debugLineNum = 10485767;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="json = \"'f_idrecord':\"&mapaEdit.Get(\"f_idrecord\"";
_json = "'f_idrecord':"+BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="Dim JobDeleteDir As HttpJob";
_jobdeletedir = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="JobDeleteDir.Initialize(\"JobDeleteDir\",Me)";
_jobdeletedir._initialize /*String*/ (null,processBA,"JobDeleteDir",direcciones.getObject());
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="JobDeleteDir.PostString(Main.url&\"ws/borrar_dire";
_jobdeletedir._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/borrar_direccion","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=10485780;
 //BA.debugLineNum = 10485780;BA.debugLine="End Sub";
return "";
}
public static String  _btndireccionback_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndireccionback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndireccionback_click", null));}
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub btnDireccionBack_Click";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Principal.keyotraparte = False";
mostCurrent._principal._keyotraparte /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="End Sub";
return "";
}
public static String  _btnnuevadireccion_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnuevadireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnuevadireccion_click", null));}
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub btnNuevaDireccion_Click";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="txtDireccion.Text =\"\"";
mostCurrent._txtdireccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="txtDireccion.Tag = 0";
mostCurrent._txtdireccion.setTag((Object)(0));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="chPrincipal.Checked = False";
mostCurrent._chprincipal.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="cargarDirecciones";
_cargardirecciones();
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="End Sub";
return "";
}
public static String  _btnprovinciacombo_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnprovinciacombo_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnprovinciacombo_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub btnProvinciaCombo_ItemClick (Position As Int,";
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="indexCombo = Position";
_indexcombo = _position;
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="End Sub";
return "";
}
public static String  _btnsalvardireccion_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsalvardireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsalvardireccion_click", null));}
String _json = "";
com.jq.pedidos.httpjob _jobsalvar = null;
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub btnSalvarDireccion_Click";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
if (mostCurrent._txtdireccion.getText().trim().length()==0) { 
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca la dirección"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="txtDireccion.RequestFocus";
mostCurrent._txtdireccion.RequestFocus();
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="If actualizar Then";
if (_actualizar) { 
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipal.getChecked())+",'f_direccion':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtdireccion.getText().trim())+"','f_idrecord':"+BA.ObjectToString(mostCurrent._txtdireccion.getTag())+",'f_credito_fiscal':false,'f_iddireccion':"+BA.ObjectToString(_mapadir.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="actualizar = False";
_actualizar = anywheresoftware.b4a.keywords.Common.False;
 }else {
RDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=9764880;
 //BA.debugLineNum = 9764880;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipal.getChecked())+",'f_direccion':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtdireccion.getText().trim())+"','f_idrecord':"+BA.ObjectToString(mostCurrent._txtdireccion.getTag())+",'f_credito_fiscal':false";
 };
RDebugUtils.currentLine=9764885;
 //BA.debugLineNum = 9764885;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=9764886;
 //BA.debugLineNum = 9764886;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
_jobsalvar._initialize /*String*/ (null,processBA,"JobSalvar",direcciones.getObject());
RDebugUtils.currentLine=9764887;
 //BA.debugLineNum = 9764887;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
_jobsalvar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/set_salvar_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=9764889;
 //BA.debugLineNum = 9764889;BA.debugLine="End Sub";
return "";
}
public static String  _btnstate_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnstate_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnstate_itemclick", new Object[] {_position,_value}));}
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub btnState_ItemClick (Position As Int, Value As";
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="indexCombo = Position";
_indexcombo = _position;
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="End Sub";
return "";
}
public static String  _buscarestados() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buscarestados", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buscarestados", null));}
String _json = "";
com.jq.pedidos.httpjob _jobestados = null;
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub BuscarEstados";
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim json As String = \"'f_usa': true\"";
_json = "'f_usa': true";
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim JobEstados As HttpJob";
_jobestados = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="JobEstados.Initialize(\"JobEstados\",Me)";
_jobestados._initialize /*String*/ (null,processBA,"JobEstados",direcciones.getObject());
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="JobEstados.PostString(Main.url&\"ws/Buscar_lista_e";
_jobestados._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/Buscar_lista_estados","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="End Sub";
return "";
}
public static String  _buscarprovincias() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "buscarprovincias", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "buscarprovincias", null));}
String _json = "";
com.jq.pedidos.httpjob _jobprovincia = null;
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub BuscarProvincias";
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim json As String = \"'f_usa': false\"";
_json = "'f_usa': false";
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim JobProvincia As HttpJob";
_jobprovincia = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="JobProvincia.Initialize(\"JobEstados\",Me)";
_jobprovincia._initialize /*String*/ (null,processBA,"JobEstados",direcciones.getObject());
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="JobProvincia.PostString(Main.url&\"ws/Buscar_lista";
_jobprovincia._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/Buscar_lista_estados","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.jq.pedidos.httpjob _job) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
int _i = 0;
String _dr = "";
String _city = "";
String _default = "";
String _name = "";
boolean _principaldireccion = false;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=9371663;
 //BA.debugLineNum = 9371663;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=9371665;
 //BA.debugLineNum = 9371665;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobDirecciones","JobSalvar","JobEstados","JobDeleteDir")) {
case 0: {
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=9371669;
 //BA.debugLineNum = 9371669;BA.debugLine="ListViewDirecciones.Clear";
mostCurrent._listviewdirecciones.Clear();
RDebugUtils.currentLine=9371670;
 //BA.debugLineNum = 9371670;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No tiene direcciones registradas"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=9371673;
 //BA.debugLineNum = 9371673;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371674;
 //BA.debugLineNum = 9371674;BA.debugLine="BuscarEstados";
_buscarestados();
 }else {
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="BuscarProvincias";
_buscarprovincias();
 };
RDebugUtils.currentLine=9371679;
 //BA.debugLineNum = 9371679;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9371685;
 //BA.debugLineNum = 9371685;BA.debugLine="For i=0 To list.Size -1";
{
final int step26 = 1;
final int limit26 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
RDebugUtils.currentLine=9371687;
 //BA.debugLineNum = 9371687;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=9371689;
 //BA.debugLineNum = 9371689;BA.debugLine="Dim dr,city,default,name=\"\" As String";
_dr = "";
_city = "";
_default = "";
_name = "";
RDebugUtils.currentLine=9371691;
 //BA.debugLineNum = 9371691;BA.debugLine="Dim principalDireccion As Boolean";
_principaldireccion = false;
RDebugUtils.currentLine=9371692;
 //BA.debugLineNum = 9371692;BA.debugLine="principalDireccion = map.Get(\"f_principal\")";
_principaldireccion = BA.ObjectToBoolean(_map.Get((Object)("f_principal")));
RDebugUtils.currentLine=9371693;
 //BA.debugLineNum = 9371693;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
_dr = mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion1"))));
RDebugUtils.currentLine=9371694;
 //BA.debugLineNum = 9371694;BA.debugLine="city = \" ,\"&map.Get(\"f_sector_city\")";
_city = " ,"+BA.ObjectToString(_map.Get((Object)("f_sector_city")));
RDebugUtils.currentLine=9371695;
 //BA.debugLineNum = 9371695;BA.debugLine="name = map.Get(\"f_nombre_direccion\")";
_name = BA.ObjectToString(_map.Get((Object)("f_nombre_direccion")));
RDebugUtils.currentLine=9371697;
 //BA.debugLineNum = 9371697;BA.debugLine="If dr.Length > 40 Then";
if (_dr.length()>40) { 
RDebugUtils.currentLine=9371698;
 //BA.debugLineNum = 9371698;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = _dr.substring((int) (0),(int) (40))+"...";
 };
RDebugUtils.currentLine=9371701;
 //BA.debugLineNum = 9371701;BA.debugLine="If principalDireccion Then";
if (_principaldireccion) { 
RDebugUtils.currentLine=9371703;
 //BA.debugLineNum = 9371703;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371705;
 //BA.debugLineNum = 9371705;BA.debugLine="default = \"Main address\"";
_default = "Main address";
 }else {
RDebugUtils.currentLine=9371709;
 //BA.debugLineNum = 9371709;BA.debugLine="default = \"Dirección principal\"";
_default = "Dirección principal";
 };
 };
RDebugUtils.currentLine=9371715;
 //BA.debugLineNum = 9371715;BA.debugLine="ListViewDirecciones.AddTwoLines2(name&\": \"&dr&";
mostCurrent._listviewdirecciones.AddTwoLines2(BA.ObjectToCharSequence(_name+": "+_dr+_city),BA.ObjectToCharSequence(anywheresoftware.b4a.keywords.Common.DateTime.Date(BA.ObjectToLongNumber(_map.Get((Object)("f_fecha"))))+anywheresoftware.b4a.keywords.Common.CRLF+_default),(Object)(_map.getObject()));
 }
};
RDebugUtils.currentLine=9371718;
 //BA.debugLineNum = 9371718;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371719;
 //BA.debugLineNum = 9371719;BA.debugLine="BuscarEstados";
_buscarestados();
 }else {
RDebugUtils.currentLine=9371721;
 //BA.debugLineNum = 9371721;BA.debugLine="BuscarProvincias";
_buscarprovincias();
 };
RDebugUtils.currentLine=9371724;
 //BA.debugLineNum = 9371724;BA.debugLine="ProgressDialogHide";
anywheresoftware.b4a.keywords.Common.ProgressDialogHide();
 break; }
case 1: {
RDebugUtils.currentLine=9371727;
 //BA.debugLineNum = 9371727;BA.debugLine="If map.Get(\"f_data\") Then";
if (BA.ObjectToBoolean(_map.Get((Object)("f_data")))) { 
RDebugUtils.currentLine=9371729;
 //BA.debugLineNum = 9371729;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371730;
 //BA.debugLineNum = 9371730;BA.debugLine="Msgbox(\"Address registred.\" ,\"info\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Address registred."),BA.ObjectToCharSequence("info"),mostCurrent.activityBA);
RDebugUtils.currentLine=9371731;
 //BA.debugLineNum = 9371731;BA.debugLine="reload = True";
_reload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9371732;
 //BA.debugLineNum = 9371732;BA.debugLine="btnBackUsa_Click";
_btnbackusa_click();
 }else {
RDebugUtils.currentLine=9371735;
 //BA.debugLineNum = 9371735;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Dirección registrada."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=9371736;
 //BA.debugLineNum = 9371736;BA.debugLine="reload = True";
_reload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9371737;
 //BA.debugLineNum = 9371737;BA.debugLine="btnBackRd_Click";
_btnbackrd_click();
 };
 }else {
RDebugUtils.currentLine=9371742;
 //BA.debugLineNum = 9371742;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371743;
 //BA.debugLineNum = 9371743;BA.debugLine="Msgbox(\"Error registering your address\",\"Erro";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Error registering your address"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=9371745;
 //BA.debugLineNum = 9371745;BA.debugLine="Msgbox(\"Error al registrar su dirección\",\"Err";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Error al registrar su dirección"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 };
 };
 break; }
case 2: {
RDebugUtils.currentLine=9371751;
 //BA.debugLineNum = 9371751;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=9371753;
 //BA.debugLineNum = 9371753;BA.debugLine="If list.Size <= 0 Then";
if (_list.getSize()<=0) { 
RDebugUtils.currentLine=9371754;
 //BA.debugLineNum = 9371754;BA.debugLine="Msgbox(\"No hay Estados en la BD\",\"Aviso!!\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay Estados en la BD"),BA.ObjectToCharSequence("Aviso!!"),mostCurrent.activityBA);
RDebugUtils.currentLine=9371755;
 //BA.debugLineNum = 9371755;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9371758;
 //BA.debugLineNum = 9371758;BA.debugLine="estados.Initialize";
mostCurrent._estados.Initialize();
RDebugUtils.currentLine=9371759;
 //BA.debugLineNum = 9371759;BA.debugLine="For i=0 To list.Size-1";
{
final int step77 = 1;
final int limit77 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit77 ;_i = _i + step77 ) {
RDebugUtils.currentLine=9371761;
 //BA.debugLineNum = 9371761;BA.debugLine="Dim mapa As Map = list.Get(i)";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=9371763;
 //BA.debugLineNum = 9371763;BA.debugLine="estados.Add( mapa.Get(\"f_descripcion\"))";
mostCurrent._estados.Add(_mapa.Get((Object)("f_descripcion")));
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=9371768;
 //BA.debugLineNum = 9371768;BA.debugLine="If map.Get(\"f_data\") Then";
if (BA.ObjectToBoolean(_map.Get((Object)("f_data")))) { 
RDebugUtils.currentLine=9371770;
 //BA.debugLineNum = 9371770;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371771;
 //BA.debugLineNum = 9371771;BA.debugLine="reload = True";
_reload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9371772;
 //BA.debugLineNum = 9371772;BA.debugLine="btnBackUsa_Click";
_btnbackusa_click();
RDebugUtils.currentLine=9371773;
 //BA.debugLineNum = 9371773;BA.debugLine="ToastMessageShow(\"The address has deleted cor";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("The address has deleted correctly!"),anywheresoftware.b4a.keywords.Common.False);
 }else {
RDebugUtils.currentLine=9371776;
 //BA.debugLineNum = 9371776;BA.debugLine="reload = True";
_reload = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9371777;
 //BA.debugLineNum = 9371777;BA.debugLine="btnBackRd_Click";
_btnbackrd_click();
RDebugUtils.currentLine=9371778;
 //BA.debugLineNum = 9371778;BA.debugLine="ToastMessageShow(\"La dirección se ha eliminad";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("La dirección se ha eliminado correctamente!"),anywheresoftware.b4a.keywords.Common.False);
 };
 }else {
RDebugUtils.currentLine=9371783;
 //BA.debugLineNum = 9371783;BA.debugLine="If Principal.IsUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9371784;
 //BA.debugLineNum = 9371784;BA.debugLine="Msgbox(\"The address could not be deleted\",\"Er";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("The address could not be deleted"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=9371786;
 //BA.debugLineNum = 9371786;BA.debugLine="Msgbox(\"La dirección no pudo ser eliminada\",\"";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La dirección no pudo ser eliminada"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 };
 };
 break; }
}
;
RDebugUtils.currentLine=9371793;
 //BA.debugLineNum = 9371793;BA.debugLine="End Sub";
return "";
}
public static String  _listviewdirecciones_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", new Object[] {_position,_value}));}
int _r = 0;
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="mapaEdit = Value";
mostCurrent._mapaedit.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="If Principal.isUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="r = Msgbox2(\"Do you want to edit this address?\",";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Do you want to edit this address?"),BA.ObjectToCharSequence("Question"),"Yes","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="r = Msgbox2(\"Desea editar esta dirección?\",\"Avis";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Desea editar esta dirección?"),BA.ObjectToCharSequence("Aviso"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=9699340;
 //BA.debugLineNum = 9699340;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="If Principal.isUsa Then";
if (mostCurrent._principal._isusa /*boolean*/ ) { 
RDebugUtils.currentLine=9699344;
 //BA.debugLineNum = 9699344;BA.debugLine="edition = True";
_edition = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9699346;
 //BA.debugLineNum = 9699346;BA.debugLine="If PanelFondoDireccionesUSA.IsInitialized == Fa";
if (mostCurrent._panelfondodireccionesusa.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9699348;
 //BA.debugLineNum = 9699348;BA.debugLine="Activity.LoadLayout(\"frmDireccionesUsa\")";
mostCurrent._activity.LoadLayout("frmDireccionesUsa",mostCurrent.activityBA);
RDebugUtils.currentLine=9699349;
 //BA.debugLineNum = 9699349;BA.debugLine="PanelFondoDireccionesUSA.Visible = False";
mostCurrent._panelfondodireccionesusa.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9699353;
 //BA.debugLineNum = 9699353;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._paneldireccion);
RDebugUtils.currentLine=9699354;
 //BA.debugLineNum = 9699354;BA.debugLine="PanelFondoDireccionesUSA.SetVisibleAnimated(250";
mostCurrent._panelfondodireccionesusa.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9699356;
 //BA.debugLineNum = 9699356;BA.debugLine="txtAddress1.Text = funcion.base64_Decode(mapaEd";
mostCurrent._txtaddress1.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_direccion1"))))));
RDebugUtils.currentLine=9699358;
 //BA.debugLineNum = 9699358;BA.debugLine="If funcion.base64_Decode(mapaEdit.Get(\"f_direcc";
if (mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_direccion2"))))!= null && (mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_direccion2"))))).equals("") == false) { 
RDebugUtils.currentLine=9699359;
 //BA.debugLineNum = 9699359;BA.debugLine="txtAddress2.Text = funcion.base64_Decode(mapaE";
mostCurrent._txtaddress2.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_direccion2"))))));
 }else {
RDebugUtils.currentLine=9699361;
 //BA.debugLineNum = 9699361;BA.debugLine="txtAddress2.Text = \"\"";
mostCurrent._txtaddress2.setText(BA.ObjectToCharSequence(""));
 };
RDebugUtils.currentLine=9699364;
 //BA.debugLineNum = 9699364;BA.debugLine="btnDeleteUsa.Visible = True";
mostCurrent._btndeleteusa.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9699366;
 //BA.debugLineNum = 9699366;BA.debugLine="btnState.AddAll(estados)";
mostCurrent._btnstate.AddAll(mostCurrent._estados);
RDebugUtils.currentLine=9699368;
 //BA.debugLineNum = 9699368;BA.debugLine="txtCity.Text = mapaEdit.Get(\"f_sector_city\")";
mostCurrent._txtcity.setText(BA.ObjectToCharSequence(mostCurrent._mapaedit.Get((Object)("f_sector_city"))));
RDebugUtils.currentLine=9699369;
 //BA.debugLineNum = 9699369;BA.debugLine="btnState.SelectedIndex = (mapaEdit.Get(\"f_state";
mostCurrent._btnstate.setSelectedIndex((int) (((double)(BA.ObjectToNumber(mostCurrent._mapaedit.Get((Object)("f_state_provincia"))))-1)));
RDebugUtils.currentLine=9699370;
 //BA.debugLineNum = 9699370;BA.debugLine="txtZipCode.Text = mapaEdit.Get(\"f_zipcode\")";
mostCurrent._txtzipcode.setText(BA.ObjectToCharSequence(mostCurrent._mapaedit.Get((Object)("f_zipcode"))));
RDebugUtils.currentLine=9699371;
 //BA.debugLineNum = 9699371;BA.debugLine="chPrincipal.Checked = mapaEdit.Get(\"f_principal";
mostCurrent._chprincipal.setChecked(BA.ObjectToBoolean(mostCurrent._mapaedit.Get((Object)("f_principal"))));
RDebugUtils.currentLine=9699372;
 //BA.debugLineNum = 9699372;BA.debugLine="actu = True";
_actu = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9699373;
 //BA.debugLineNum = 9699373;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
_update = (int)(BA.ObjectToNumber(mostCurrent._mapaedit.Get((Object)("f_idrecord"))));
 }else {
RDebugUtils.currentLine=9699377;
 //BA.debugLineNum = 9699377;BA.debugLine="edition = True";
_edition = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9699378;
 //BA.debugLineNum = 9699378;BA.debugLine="If PanelFondoDireccionesRD.IsInitialized == Fal";
if (mostCurrent._panelfondodireccionesrd.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=9699380;
 //BA.debugLineNum = 9699380;BA.debugLine="Activity.LoadLayout(\"frmDireccionesRD\")";
mostCurrent._activity.LoadLayout("frmDireccionesRD",mostCurrent.activityBA);
RDebugUtils.currentLine=9699381;
 //BA.debugLineNum = 9699381;BA.debugLine="PanelFondoDireccionesRD.Visible = False";
mostCurrent._panelfondodireccionesrd.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=9699385;
 //BA.debugLineNum = 9699385;BA.debugLine="funcion.DisableView(True,PanelDireccion)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._paneldireccion);
RDebugUtils.currentLine=9699386;
 //BA.debugLineNum = 9699386;BA.debugLine="PanelFondoDireccionesRD.SetVisibleAnimated(250,";
mostCurrent._panelfondodireccionesrd.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9699388;
 //BA.debugLineNum = 9699388;BA.debugLine="txtDireRD.Text = funcion.base64_Decode(mapaEdit";
mostCurrent._txtdirerd.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(mostCurrent._mapaedit.Get((Object)("f_direccion1"))))));
RDebugUtils.currentLine=9699390;
 //BA.debugLineNum = 9699390;BA.debugLine="btnDeleteRD.Visible = True";
mostCurrent._btndeleterd.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=9699392;
 //BA.debugLineNum = 9699392;BA.debugLine="btnProvinciaCombo.AddAll(estados)";
mostCurrent._btnprovinciacombo.AddAll(mostCurrent._estados);
RDebugUtils.currentLine=9699394;
 //BA.debugLineNum = 9699394;BA.debugLine="txtSector.Text = mapaEdit.Get(\"f_sector_city\")";
mostCurrent._txtsector.setText(BA.ObjectToCharSequence(mostCurrent._mapaedit.Get((Object)("f_sector_city"))));
RDebugUtils.currentLine=9699395;
 //BA.debugLineNum = 9699395;BA.debugLine="btnProvinciaCombo.SelectedIndex = (mapaEdit.Get";
mostCurrent._btnprovinciacombo.setSelectedIndex((int) (((double)(BA.ObjectToNumber(mostCurrent._mapaedit.Get((Object)("f_state_provincia"))))-1)));
RDebugUtils.currentLine=9699396;
 //BA.debugLineNum = 9699396;BA.debugLine="txtZipCodeRD.Text = mapaEdit.Get(\"f_zipcode\")";
mostCurrent._txtzipcoderd.setText(BA.ObjectToCharSequence(mostCurrent._mapaedit.Get((Object)("f_zipcode"))));
RDebugUtils.currentLine=9699397;
 //BA.debugLineNum = 9699397;BA.debugLine="chPrincipalRD.Checked = mapaEdit.Get(\"f_princip";
mostCurrent._chprincipalrd.setChecked(BA.ObjectToBoolean(mostCurrent._mapaedit.Get((Object)("f_principal"))));
RDebugUtils.currentLine=9699398;
 //BA.debugLineNum = 9699398;BA.debugLine="actu = True";
_actu = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=9699399;
 //BA.debugLineNum = 9699399;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
_update = (int)(BA.ObjectToNumber(mostCurrent._mapaedit.Get((Object)("f_idrecord"))));
 };
 }else {
RDebugUtils.currentLine=9699404;
 //BA.debugLineNum = 9699404;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=9699407;
 //BA.debugLineNum = 9699407;BA.debugLine="End Sub";
return "";
}
public static String  _txtcity_enterpressed() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtcity_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtcity_enterpressed", null));}
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub txtCity_EnterPressed";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Msgbox(\"Llego\",\"\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Llego"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return "";
}
public static String  _txtzipcode_enterpressed() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtzipcode_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtzipcode_enterpressed", null));}
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub txtZipCode_EnterPressed";
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="txtCity.RequestFocus";
mostCurrent._txtcity.RequestFocus();
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="End Sub";
return "";
}
public static String  _txtzipcode_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtzipcode_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtzipcode_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub txtZipCode_FocusChanged (HasFocus As Boolean)";
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="Label3.Visible = False";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="Panel1.Visible = False";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="Label5.Visible = False";
mostCurrent._label5.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11010055;
 //BA.debugLineNum = 11010055;BA.debugLine="Panel2.Visible = False";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="tlbl6 = Label6.Top";
_tlbl6 = mostCurrent._label6.getTop();
RDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="tpanel3 = Panel3.Top";
_tpanel3 = mostCurrent._panel3.getTop();
RDebugUtils.currentLine=11010062;
 //BA.debugLineNum = 11010062;BA.debugLine="tlbl7 = Label7.Top";
_tlbl7 = mostCurrent._label7.getTop();
RDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="tpanelcomboUsa = PanelComboUSA.Top";
_tpanelcombousa = mostCurrent._panelcombousa.getTop();
RDebugUtils.currentLine=11010065;
 //BA.debugLineNum = 11010065;BA.debugLine="tlbl8 = Label8.Top";
_tlbl8 = mostCurrent._label8.getTop();
RDebugUtils.currentLine=11010066;
 //BA.debugLineNum = 11010066;BA.debugLine="tpanelZip = panelZipCode.Top";
_tpanelzip = mostCurrent._panelzipcode.getTop();
RDebugUtils.currentLine=11010070;
 //BA.debugLineNum = 11010070;BA.debugLine="Label6.Top = 10%y";
mostCurrent._label6.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="Panel3.Top = 15%y";
mostCurrent._panel3.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (15),mostCurrent.activityBA));
RDebugUtils.currentLine=11010073;
 //BA.debugLineNum = 11010073;BA.debugLine="Label7.Top = 23%y";
mostCurrent._label7.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (23),mostCurrent.activityBA));
RDebugUtils.currentLine=11010074;
 //BA.debugLineNum = 11010074;BA.debugLine="PanelComboUSA.Top = 29%y";
mostCurrent._panelcombousa.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (29),mostCurrent.activityBA));
RDebugUtils.currentLine=11010076;
 //BA.debugLineNum = 11010076;BA.debugLine="panelZipCode.Top = 40%y";
mostCurrent._panelzipcode.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (40),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=11010080;
 //BA.debugLineNum = 11010080;BA.debugLine="Label3.Visible = True";
mostCurrent._label3.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11010081;
 //BA.debugLineNum = 11010081;BA.debugLine="Panel1.Visible = True";
mostCurrent._panel1.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11010083;
 //BA.debugLineNum = 11010083;BA.debugLine="Label5.Visible = True";
mostCurrent._label5.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11010084;
 //BA.debugLineNum = 11010084;BA.debugLine="Panel2.Visible = True";
mostCurrent._panel2.setVisible(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11010086;
 //BA.debugLineNum = 11010086;BA.debugLine="Label6.Top = tlbl6";
mostCurrent._label6.setTop(_tlbl6);
RDebugUtils.currentLine=11010087;
 //BA.debugLineNum = 11010087;BA.debugLine="Panel3.Top = tpanel3";
mostCurrent._panel3.setTop(_tpanel3);
RDebugUtils.currentLine=11010089;
 //BA.debugLineNum = 11010089;BA.debugLine="Label7.Top = tlbl7";
mostCurrent._label7.setTop(_tlbl7);
RDebugUtils.currentLine=11010090;
 //BA.debugLineNum = 11010090;BA.debugLine="PanelComboUSA.Top = tpanelcomboUsa";
mostCurrent._panelcombousa.setTop(_tpanelcombousa);
RDebugUtils.currentLine=11010092;
 //BA.debugLineNum = 11010092;BA.debugLine="Label8.Top = tlbl8";
mostCurrent._label8.setTop(_tlbl8);
RDebugUtils.currentLine=11010093;
 //BA.debugLineNum = 11010093;BA.debugLine="panelZipCode.Top = tpanelZip";
mostCurrent._panelzipcode.setTop(_tpanelzip);
 };
RDebugUtils.currentLine=11010098;
 //BA.debugLineNum = 11010098;BA.debugLine="End Sub";
return "";
}
public static String  _txtzipcoderd_enterpressed() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtzipcoderd_enterpressed", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtzipcoderd_enterpressed", null));}
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub txtZipCodeRD_EnterPressed";
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="txtSector.RequestFocus";
mostCurrent._txtsector.RequestFocus();
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="End Sub";
return "";
}
public static String  _txtzipcoderd_focuschanged(boolean _hasfocus) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "txtzipcoderd_focuschanged", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "txtzipcoderd_focuschanged", new Object[] {_hasfocus}));}
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub txtZipCodeRD_FocusChanged (HasFocus As Boolean";
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="If HasFocus Then";
if (_hasfocus) { 
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="tpanelMarco = PanelMarcoDirRD.Top";
_tpanelmarco = mostCurrent._panelmarcodirrd.getTop();
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="PanelMarcoDirRD.Top = 0%y";
mostCurrent._panelmarcodirrd.setTop(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA));
 }else {
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="PanelMarcoDirRD.Top = tpanelMarco";
mostCurrent._panelmarcodirrd.setTop(_tpanelmarco);
 };
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="End Sub";
return "";
}
}