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

public class main extends Activity implements B4AActivity{
	public static main mostCurrent;
	static boolean afterFirstLayout;
	static boolean isFirst = true;
    private static boolean processGlobalsRun = false;
	BALayout layout;
	public static BA processBA;
	BA activityBA;
    ActivityWrapper _activity;
    java.util.ArrayList<B4AMenuItem> menuItems;
	public static final boolean fullScreen = true;
	public static final boolean includeTitle = false;
    public static WeakReference<Activity> previousOne;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
        mostCurrent = this;
		if (processBA == null) {
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.menube.app", "com.menube.app.main");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (main).");
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
		activityBA = new BA(this, layout, processBA, "com.menube.app", "com.menube.app.main");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.menube.app.main", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (main) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (main) Resume **");
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
		return main.class;
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
        BA.LogInfo("** Activity (main) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            main mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (main) Resume **");
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
    
    if (main.processGlobalsRun == false) {
	    main.processGlobalsRun = true;
		try {
		        b4a.example.dateutils._process_globals();
		
        } catch (Exception e) {
			throw new RuntimeException(e);
		}
    }
}
public static boolean isAnyActivityVisible() {
    boolean vis = false;
vis = vis | (main.mostCurrent != null);
vis = vis | (principal.mostCurrent != null);
vis = vis | (facturacion.mostCurrent != null);
vis = vis | (direcciones.mostCurrent != null);
vis = vis | (reporteordenes.mostCurrent != null);
return vis;}

private static BA killProgramHelper(BA ba) {
    if (ba == null)
        return null;
    anywheresoftware.b4a.BA.SharedProcessBA sharedProcessBA = ba.sharedProcessBA;
    if (sharedProcessBA == null || sharedProcessBA.activityBA == null)
        return null;
    return sharedProcessBA.activityBA.get();
}
public static void killProgram() {
     {
            Activity __a = null;
            if (main.previousOne != null) {
				__a = main.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(main.mostCurrent == null ? null : main.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, starter.class));
 {
            Activity __a = null;
            if (principal.previousOne != null) {
				__a = principal.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(principal.mostCurrent == null ? null : principal.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (facturacion.previousOne != null) {
				__a = facturacion.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(facturacion.mostCurrent == null ? null : facturacion.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (direcciones.previousOne != null) {
				__a = direcciones.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(direcciones.mostCurrent == null ? null : direcciones.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

 {
            Activity __a = null;
            if (reporteordenes.previousOne != null) {
				__a = reporteordenes.previousOne.get();
			}
            else {
                BA ba = killProgramHelper(reporteordenes.mostCurrent == null ? null : reporteordenes.mostCurrent.processBA);
                if (ba != null) __a = ba.activity;
            }
            if (__a != null)
				__a.finish();}

BA.applicationContext.stopService(new android.content.Intent(BA.applicationContext, httputils2service.class));
}
public static class _typeu{
public boolean IsInitialized;
public int idUsuario;
public String nombre;
public String latitud;
public String longitud;
public void Initialize() {
IsInitialized = true;
idUsuario = 0;
nombre = "";
latitud = "";
longitud = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public static String _token = "";
public static String _jobmsj = "";
public static String _jobmsjtitle = "";
public static com.menube.app.main._typeu _usersdata = null;
public static anywheresoftware.b4a.sql.SQL _sql = null;
public static String _url = "";
public anywheresoftware.b4a.objects.B4XViewWrapper _label3 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnlogin = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel1 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panel2 = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panellogin = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _txtcontrasena = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtusuario = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _viewlogo = null;
public anywheresoftware.b4a.phone.Phone _p = null;
public anywheresoftware.b4a.phone.Phone.PhoneId _pi = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnregistroclienteback = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnregistroclienteregistrarme = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelregistrocliente = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcontrasena2 = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdireccion = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttelefono = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtusuarioregistro = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtcontrasenaregistro = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblregistrarme = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _btnconfiguracion = null;
public anywheresoftware.b4a.objects.LabelWrapper _txturl = null;
public anywheresoftware.b4a.objects.B4XViewWrapper _panelconfiguracion = null;
public b4a.example.dateutils _dateutils = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
anywheresoftware.b4a.sql.SQL.CursorWrapper _cur = null;
RDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="If File.Exists(File.DirDefaultExternal, \"db.db\")";
if (anywheresoftware.b4a.keywords.Common.File.Exists(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db")==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDefau";
anywheresoftware.b4a.keywords.Common.File.Copy(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"db.db",anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db");
 };
RDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="SQL.Initialize(File.DirDefaultExternal,\"db.db\", T";
_sql.Initialize(anywheresoftware.b4a.keywords.Common.File.getDirDefaultExternal(),"db.db",anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="Dim cur As Cursor";
_cur = new anywheresoftware.b4a.sql.SQL.CursorWrapper();
RDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="cur = SQL.ExecQuery(\"SELECT * FROM t_preferencia\"";
_cur.setObject((android.database.Cursor)(_sql.ExecQuery("SELECT * FROM t_preferencia")));
RDebugUtils.currentLine=131081;
 //BA.debugLineNum = 131081;BA.debugLine="cur.Position = 0";
_cur.setPosition((int) (0));
RDebugUtils.currentLine=131082;
 //BA.debugLineNum = 131082;BA.debugLine="url = cur.GetString(\"f_url\")";
_url = _cur.GetString("f_url");
RDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="Activity.LoadLayout(\"frmLogin\")";
mostCurrent._activity.LoadLayout("frmLogin",mostCurrent.activityBA);
RDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="PanelConfiguracion.Top = -PanelConfiguracion.Heig";
mostCurrent._panelconfiguracion.setTop((int) (-mostCurrent._panelconfiguracion.getHeight()-mostCurrent._btnconfiguracion.getTop()));
RDebugUtils.currentLine=131086;
 //BA.debugLineNum = 131086;BA.debugLine="txtURL.Text = url";
mostCurrent._txturl.setText(BA.ObjectToCharSequence(_url));
RDebugUtils.currentLine=131088;
 //BA.debugLineNum = 131088;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="main";
RDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=262146;
 //BA.debugLineNum = 262146;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfiguracion_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconfiguracion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnconfiguracion_click", null));}
int _posicion = 0;
anywheresoftware.b4a.objects.AnimationWrapper _a = null;
RDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub btnConfiguracion_Click";
RDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="Dim posicion As Int = PanelConfiguracion.Height +";
_posicion = (int) (mostCurrent._panelconfiguracion.getHeight()+mostCurrent._btnconfiguracion.getTop()+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (1),mostCurrent.activityBA));
RDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="If PanelConfiguracion.Top > 0%y Then";
if (mostCurrent._panelconfiguracion.getTop()>anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (0),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="posicion = -posicion";
_posicion = (int) (-_posicion);
 };
RDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="PanelConfiguracion.Tag = posicion";
mostCurrent._panelconfiguracion.setTag((Object)(_posicion));
RDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="Dim a As Animation";
_a = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="a.InitializeTranslate(\"url\",0,0,0,posicion)";
_a.InitializeTranslate(mostCurrent.activityBA,"url",(float) (0),(float) (0),(float) (0),(float) (_posicion));
RDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="a.Duration = 300";
_a.setDuration((long) (300));
RDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="a.Start(PanelConfiguracion)";
_a.Start((android.view.View)(mostCurrent._panelconfiguracion.getObject()));
RDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="End Sub";
return "";
}
public static String  _btnlogin_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnlogin_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnlogin_click", null));}
String _url2 = "";
String _dato = "";
String _data = "";
String _banda = "";
String _imei = "";
String _operadora = "";
com.menube.app.httpjob _joblogin = null;
RDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub btnLogin_Click";
RDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
if (mostCurrent._txtcontrasena.getText().trim().length()==0 || mostCurrent._txtusuario.getText().trim().length()==0) { 
RDebugUtils.currentLine=917510;
 //BA.debugLineNum = 917510;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Faltan datos por ingresar"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
 }else {
RDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="ToastMessageShow(\"Conectando..\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Conectando.."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Dim url2 As String";
_url2 = "";
RDebugUtils.currentLine=917514;
 //BA.debugLineNum = 917514;BA.debugLine="Dim dato As String";
_dato = "";
RDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Dim data As String";
_data = "";
RDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="Dim banda As String";
_banda = "";
RDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Dim  imei As String";
_imei = "";
RDebugUtils.currentLine=917518;
 //BA.debugLineNum = 917518;BA.debugLine="Dim operadora As String";
_operadora = "";
RDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="operadora=P.GetNetworkOperatorName";
_operadora = mostCurrent._p.GetNetworkOperatorName();
RDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="imei=PI.GetDeviceId";
_imei = mostCurrent._pi.GetDeviceId();
RDebugUtils.currentLine=917522;
 //BA.debugLineNum = 917522;BA.debugLine="banda=P.GetPhoneType";
_banda = mostCurrent._p.GetPhoneType();
RDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="If operadora = \"Null\" Or operadora = \"\"   Then";
if ((_operadora).equals("Null") || (_operadora).equals("")) { 
RDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="operadora=\"0\"";
_operadora = "0";
 };
RDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="If imei= \"\"  Then";
if ((_imei).equals("")) { 
RDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="imei=P.GetSettings(\"android_id\")";
_imei = mostCurrent._p.GetSettings("android_id");
 };
RDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="If banda= \"\"  Then";
if ((_banda).equals("")) { 
RDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="banda=\"0\"";
_banda = "0";
 };
RDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="data = \"'f_modelo':'\"&P.Model& \" - \"&P.Manufactu";
_data = "'f_modelo':'"+mostCurrent._p.getModel()+" - "+mostCurrent._p.getManufacturer()+"','f_banda':'"+_banda+"', 'f_operadora': '"+_operadora+"','f_tamano':"+BA.NumberToString(mostCurrent._funcion._getdevicephysicalsize /*float*/ (mostCurrent.activityBA))+","+"'f_imei':'"+_imei+"','f_usuario':'"+mostCurrent._txtusuario.getText().trim()+"','f_contrasena':'"+mostCurrent._txtcontrasena.getText().trim()+"'";
RDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="dato=funcion.crearJson(\"none\",data)";
_dato = mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,"none",_data);
RDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="url2 = url & \"login/login/\"";
_url2 = _url+"login/login/";
RDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="Dim JobLogin As HttpJob";
_joblogin = new com.menube.app.httpjob();
RDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
_joblogin._initialize /*String*/ (null,processBA,"JobLogin",main.getObject());
RDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
_joblogin._poststring /*String*/ (null,_url2,"json="+_dato);
 };
RDebugUtils.currentLine=917548;
 //BA.debugLineNum = 917548;BA.debugLine="End Sub";
return "";
}
public static String  _btnregistroclienteback_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnregistroclienteback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnregistroclienteback_click", null));}
RDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub btnRegistroClienteBack_Click";
RDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="openRegistrarCliente";
_openregistrarcliente();
RDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="clearRegistro";
_clearregistro();
RDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="End Sub";
return "";
}
public static String  _openregistrarcliente() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "openregistrarcliente", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "openregistrarcliente", null));}
RDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub openRegistrarCliente";
RDebugUtils.currentLine=1114114;
 //BA.debugLineNum = 1114114;BA.debugLine="If PanelRegistroCliente.IsInitialized = False The";
if (mostCurrent._panelregistrocliente.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Activity.LoadLayout(\"frmRegistroCliente\")";
mostCurrent._activity.LoadLayout("frmRegistroCliente",mostCurrent.activityBA);
RDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="PanelRegistroCliente.Visible = False";
mostCurrent._panelregistrocliente.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="funcion.DisableView(PanelRegistroCliente.Visible,";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,mostCurrent._panelregistrocliente.getVisible(),mostCurrent._panelregistrocliente);
RDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="funcion.DisableView(Not(PanelRegistroCliente.Visi";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.Not(mostCurrent._panelregistrocliente.getVisible()),(anywheresoftware.b4a.objects.PanelWrapper) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.PanelWrapper(), (android.view.ViewGroup)(mostCurrent._panellogin.getObject())));
RDebugUtils.currentLine=1114121;
 //BA.debugLineNum = 1114121;BA.debugLine="PanelRegistroCliente.SetVisibleAnimated(300,Not(P";
mostCurrent._panelregistrocliente.SetVisibleAnimated((int) (300),anywheresoftware.b4a.keywords.Common.Not(mostCurrent._panelregistrocliente.getVisible()));
RDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="End Sub";
return "";
}
public static String  _clearregistro() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clearregistro", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clearregistro", null));}
RDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub clearRegistro";
RDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="txtNombre.Text = \"\"";
mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310723;
 //BA.debugLineNum = 1310723;BA.debugLine="txtTelefono.Text = \"\"";
mostCurrent._txttelefono.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310724;
 //BA.debugLineNum = 1310724;BA.debugLine="txtDireccion.Text = \"\"";
mostCurrent._txtdireccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310725;
 //BA.debugLineNum = 1310725;BA.debugLine="txtUsuarioRegistro.Text = \"\"";
mostCurrent._txtusuarioregistro.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310726;
 //BA.debugLineNum = 1310726;BA.debugLine="txtContrasenaRegistro.Text = \"\"";
mostCurrent._txtcontrasenaregistro.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="txtContrasena2.Text = \"\"";
mostCurrent._txtcontrasena2.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="End Sub";
return "";
}
public static String  _btnregistroclienteregistrarme_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnregistroclienteregistrarme_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnregistroclienteregistrarme_click", null));}
anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator _json = null;
anywheresoftware.b4a.objects.collections.Map _map = null;
com.menube.app.httpjob _jobnewuser = null;
RDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
RDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
if (mostCurrent._txtnombre.getText().trim().length()==0) { 
RDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca su nombre"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="txtNombre.RequestFocus";
mostCurrent._txtnombre.RequestFocus();
RDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Else if txtTelefono.Text.Trim.Length = 0 Then";
if (mostCurrent._txttelefono.getText().trim().length()==0) { 
RDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca su teléfono"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048584;
 //BA.debugLineNum = 1048584;BA.debugLine="txtTelefono.RequestFocus";
mostCurrent._txttelefono.RequestFocus();
RDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="else if txtDireccion.Text.Trim.Length = 0 Then";
if (mostCurrent._txtdireccion.getText().trim().length()==0) { 
RDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca su dirección"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048588;
 //BA.debugLineNum = 1048588;BA.debugLine="txtDireccion.RequestFocus";
mostCurrent._txtdireccion.RequestFocus();
RDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="else if txtUsuarioRegistro.Text.Trim.Length = 0 T";
if (mostCurrent._txtusuarioregistro.getText().trim().length()==0) { 
RDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca su correo electrónico"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="txtUsuarioRegistro.RequestFocus";
mostCurrent._txtusuarioregistro.RequestFocus();
RDebugUtils.currentLine=1048593;
 //BA.debugLineNum = 1048593;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="else if txtContrasenaRegistro.Text.Trim.Length =";
if (mostCurrent._txtcontrasenaregistro.getText().trim().length()==0) { 
RDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca su contraseña"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="txtContrasenaRegistro.RequestFocus";
mostCurrent._txtcontrasenaregistro.RequestFocus();
RDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=1048598;
 //BA.debugLineNum = 1048598;BA.debugLine="else if txtContrasena2.Text.Trim.Length = 0 Then";
if (mostCurrent._txtcontrasena2.getText().trim().length()==0) { 
RDebugUtils.currentLine=1048599;
 //BA.debugLineNum = 1048599;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca su contraseña nuevamente"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048600;
 //BA.debugLineNum = 1048600;BA.debugLine="txtContrasena2.RequestFocus";
mostCurrent._txtcontrasena2.RequestFocus();
RDebugUtils.currentLine=1048601;
 //BA.debugLineNum = 1048601;BA.debugLine="Return";
if (true) return "";
 }else 
{RDebugUtils.currentLine=1048602;
 //BA.debugLineNum = 1048602;BA.debugLine="Else If txtContrasenaRegistro.Text <> txtContrase";
if ((mostCurrent._txtcontrasenaregistro.getText()).equals(mostCurrent._txtcontrasena2.getText()) == false) { 
RDebugUtils.currentLine=1048603;
 //BA.debugLineNum = 1048603;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Las contraseñas no coinciden."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=1048604;
 //BA.debugLineNum = 1048604;BA.debugLine="txtContrasenaRegistro.RequestFocus";
mostCurrent._txtcontrasenaregistro.RequestFocus();
RDebugUtils.currentLine=1048605;
 //BA.debugLineNum = 1048605;BA.debugLine="Return";
if (true) return "";
 }}}}}}}
;
RDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="Dim json As JSONGenerator";
_json = new anywheresoftware.b4a.objects.collections.JSONParser.JSONGenerator();
RDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="map.Initialize";
_map.Initialize();
RDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
_map.Put((Object)("f_nombre"),(Object)(mostCurrent._txtnombre.getText().trim()));
RDebugUtils.currentLine=1048612;
 //BA.debugLineNum = 1048612;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
_map.Put((Object)("f_telefono"),(Object)(mostCurrent._txttelefono.getText().trim()));
RDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
_map.Put((Object)("f_direccion"),(Object)(mostCurrent._txtdireccion.getText().trim()));
RDebugUtils.currentLine=1048614;
 //BA.debugLineNum = 1048614;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
_map.Put((Object)("f_email"),(Object)(mostCurrent._txtusuarioregistro.getText().trim()));
RDebugUtils.currentLine=1048615;
 //BA.debugLineNum = 1048615;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
_map.Put((Object)("f_password"),(Object)(mostCurrent._txtcontrasenaregistro.getText().trim()));
RDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="map.Put(\"f_latitud\",\"\")";
_map.Put((Object)("f_latitud"),(Object)(""));
RDebugUtils.currentLine=1048617;
 //BA.debugLineNum = 1048617;BA.debugLine="map.Put(\"f_longitud\",\"\")";
_map.Put((Object)("f_longitud"),(Object)(""));
RDebugUtils.currentLine=1048618;
 //BA.debugLineNum = 1048618;BA.debugLine="map.Put(\"f_idrecord\",0)";
_map.Put((Object)("f_idrecord"),(Object)(0));
RDebugUtils.currentLine=1048619;
 //BA.debugLineNum = 1048619;BA.debugLine="json.Initialize(map)";
_json.Initialize(_map);
RDebugUtils.currentLine=1048621;
 //BA.debugLineNum = 1048621;BA.debugLine="Dim JobNewUser As HttpJob";
_jobnewuser = new com.menube.app.httpjob();
RDebugUtils.currentLine=1048622;
 //BA.debugLineNum = 1048622;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
_jobnewuser._initialize /*String*/ (null,processBA,"JobNewUser",main.getObject());
RDebugUtils.currentLine=1048623;
 //BA.debugLineNum = 1048623;BA.debugLine="JobNewUser.Tag = map";
_jobnewuser._tag /*Object*/  = (Object)(_map.getObject());
RDebugUtils.currentLine=1048624;
 //BA.debugLineNum = 1048624;BA.debugLine="JobNewUser.PostString(url&\"ws/set_salvar_usuario\"";
_jobnewuser._poststring /*String*/ (null,_url+"ws/set_salvar_usuario","json="+mostCurrent._funcion._crearjson2 /*String*/ (mostCurrent.activityBA,_token,_json.ToString()));
RDebugUtils.currentLine=1048627;
 //BA.debugLineNum = 1048627;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.menube.app.httpjob _job) throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
RDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(_jobmsj),BA.ObjectToCharSequence(_jobmsjtitle),mostCurrent.activityBA);
RDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobLogin","JobNewUser")) {
case 0: {
RDebugUtils.currentLine=983059;
 //BA.debugLineNum = 983059;BA.debugLine="token = map.Get(\"f_key\")";
_token = BA.ObjectToString(_map.Get((Object)("f_key")));
RDebugUtils.currentLine=983060;
 //BA.debugLineNum = 983060;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="usersData.idUsuario = map.Get(\"f_idrecord\")";
_usersdata.idUsuario /*int*/  = (int)(BA.ObjectToNumber(_map.Get((Object)("f_idrecord"))));
RDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="usersData.nombre = map.Get(\"f_nombre\")";
_usersdata.nombre /*String*/  = BA.ObjectToString(_map.Get((Object)("f_nombre")));
RDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="usersData.longitud = map.Get(\"f_longitud\")";
_usersdata.longitud /*String*/  = BA.ObjectToString(_map.Get((Object)("f_longitud")));
RDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="usersData.latitud = map.Get(\"f_latitud\")";
_usersdata.latitud /*String*/  = BA.ObjectToString(_map.Get((Object)("f_latitud")));
RDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
 break; }
case 1: {
RDebugUtils.currentLine=983069;
 //BA.debugLineNum = 983069;BA.debugLine="map = Job.Tag";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_job._tag /*Object*/ ));
RDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
mostCurrent._txtusuario.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_email"))));
RDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
mostCurrent._txtcontrasena.setText(BA.ObjectToCharSequence(_map.Get((Object)("f_password"))));
RDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="btnRegistroClienteBack_Click";
_btnregistroclienteback_click();
RDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="btnLogin_Click";
_btnlogin_click();
 break; }
}
;
RDebugUtils.currentLine=983077;
 //BA.debugLineNum = 983077;BA.debugLine="End Sub";
return "";
}
public static String  _lblregistrarme_click() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "lblregistrarme_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "lblregistrarme_click", null));}
RDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub lblRegistrarme_Click";
RDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="openRegistrarCliente";
_openregistrarcliente();
RDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return "";
}
public static String  _updateurl() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "updateurl", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "updateurl", null));}
RDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub updateURL";
RDebugUtils.currentLine=786433;
 //BA.debugLineNum = 786433;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE t_preferencia SET f_url";
_sql.ExecNonQuery2("UPDATE t_preferencia SET f_url = ?",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(mostCurrent._txturl.getText().trim())}));
RDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="url = txtURL.Text.Trim";
_url = mostCurrent._txturl.getText().trim();
RDebugUtils.currentLine=786435;
 //BA.debugLineNum = 786435;BA.debugLine="ToastMessageShow(\"URL actializado\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("URL actializado"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return "";
}
public static String  _url_animationend() throws Exception{
RDebugUtils.currentModule="main";
if (Debug.shouldDelegate(mostCurrent.activityBA, "url_animationend", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "url_animationend", null));}
RDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub url_AnimationEnd";
RDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If PanelConfiguracion.Tag < 0%x Then";
if ((double)(BA.ObjectToNumber(mostCurrent._panelconfiguracion.getTag()))<anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (0),mostCurrent.activityBA)) { 
RDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="PanelConfiguracion.Top = -PanelConfiguracion.Hei";
mostCurrent._panelconfiguracion.setTop((int) (-mostCurrent._panelconfiguracion.getHeight()-mostCurrent._btnconfiguracion.getTop()));
RDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="updateURL";
_updateurl();
 }else {
RDebugUtils.currentLine=851975;
 //BA.debugLineNum = 851975;BA.debugLine="PanelConfiguracion.Top = btnConfiguracion.Top";
mostCurrent._panelconfiguracion.setTop(mostCurrent._btnconfiguracion.getTop());
 };
RDebugUtils.currentLine=851979;
 //BA.debugLineNum = 851979;BA.debugLine="End Sub";
return "";
}
}