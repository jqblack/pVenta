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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.menube.app", "com.menube.app.direcciones");
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
		activityBA = new BA(this, layout, processBA, "com.menube.app", "com.menube.app.direcciones");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.menube.app.direcciones", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
public anywheresoftware.b4a.objects.ButtonWrapper _btndireccionback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnnuevadireccion = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsalvardireccion = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewdirecciones = null;
public anywheresoftware.b4a.objects.PanelWrapper _paneldireccion = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtdireccion = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chprincipal = null;
public b4a.example.dateutils _dateutils = null;
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Activity.LoadLayout(\"frmDirecciones\")";
mostCurrent._activity.LoadLayout("frmDirecciones",mostCurrent.activityBA);
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="ListViewDirecciones.TwoLinesLayout.ItemHeight = 8";
mostCurrent._listviewdirecciones.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.TextColo";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="ListViewDirecciones.TwoLinesLayout.Label.Typeface";
mostCurrent._listviewdirecciones.getTwoLinesLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Te";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.Ty";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="ListViewDirecciones.TwoLinesLayout.SecondLabel.He";
mostCurrent._listviewdirecciones.getTwoLinesLayout().SecondLabel.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="funcion.SetDivider(ListViewDirecciones,Colors.Gra";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewdirecciones,anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="txtDireccion.Tag = 0";
mostCurrent._txtdireccion.setTag((Object)(0));
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="cargarDirecciones";
_cargardirecciones();
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="End Sub";
return "";
}
public static String  _cargardirecciones() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargardirecciones", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargardirecciones", null));}
com.menube.app.httpjob _jobdirecciones = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub cargarDirecciones";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = new com.menube.app.httpjob();
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
_jobdirecciones._initialize /*String*/ (null,processBA,"JobDirecciones",direcciones.getObject());
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
_jobdirecciones._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/get_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,""));
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="direcciones";
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="End Sub";
return "";
}
public static String  _btndireccionback_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndireccionback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndireccionback_click", null));}
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub btnDireccionBack_Click";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="End Sub";
return "";
}
public static String  _btnnuevadireccion_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnnuevadireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnnuevadireccion_click", null));}
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub btnNuevaDireccion_Click";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="txtDireccion.Text =\"\"";
mostCurrent._txtdireccion.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="txtDireccion.Tag = 0";
mostCurrent._txtdireccion.setTag((Object)(0));
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="chPrincipal.Checked = False";
mostCurrent._chprincipal.setChecked(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="cargarDirecciones";
_cargardirecciones();
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="End Sub";
return "";
}
public static String  _btnsalvardireccion_click() throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsalvardireccion_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsalvardireccion_click", null));}
String _json = "";
com.menube.app.httpjob _jobsalvar = null;
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub btnSalvarDireccion_Click";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
if (mostCurrent._txtdireccion.getText().trim().length()==0) { 
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Introduzca la dirección"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="txtDireccion.RequestFocus";
mostCurrent._txtdireccion.RequestFocus();
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7864327;
 //BA.debugLineNum = 7864327;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Checked&\",'f_";
_json = "'f_principal':"+BA.ObjectToString(mostCurrent._chprincipal.getChecked())+",'f_direccion':'"+mostCurrent._funcion._base64_encode /*String*/ (mostCurrent.activityBA,mostCurrent._txtdireccion.getText().trim())+"','f_idrecord':"+BA.ObjectToString(mostCurrent._txtdireccion.getTag())+",'f_credito_fiscal':false";
RDebugUtils.currentLine=7864330;
 //BA.debugLineNum = 7864330;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = new com.menube.app.httpjob();
RDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
_jobsalvar._initialize /*String*/ (null,processBA,"JobSalvar",direcciones.getObject());
RDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
_jobsalvar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"ws/set_salvar_direcciones_usuario","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=7864334;
 //BA.debugLineNum = 7864334;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.menube.app.httpjob _job) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
String _dr = "";
String _default = "";
int _i = 0;
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobDirecciones","JobSalvar")) {
case 0: {
RDebugUtils.currentLine=7602196;
 //BA.debugLineNum = 7602196;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=7602197;
 //BA.debugLineNum = 7602197;BA.debugLine="ListViewDirecciones.Clear";
mostCurrent._listviewdirecciones.Clear();
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=7602199;
 //BA.debugLineNum = 7602199;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No tiene direcciones registradas"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=7602204;
 //BA.debugLineNum = 7602204;BA.debugLine="Dim dr,default=\"\" As String";
_dr = "";
_default = "";
RDebugUtils.currentLine=7602205;
 //BA.debugLineNum = 7602205;BA.debugLine="For i=0 To list.Size -1";
{
final int step22 = 1;
final int limit22 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=7602207;
 //BA.debugLineNum = 7602207;BA.debugLine="chPrincipal.Checked = map.Get(\"f_principal\")";
mostCurrent._chprincipal.setChecked(BA.ObjectToBoolean(_map.Get((Object)("f_principal"))));
RDebugUtils.currentLine=7602208;
 //BA.debugLineNum = 7602208;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
_dr = mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion"))));
RDebugUtils.currentLine=7602210;
 //BA.debugLineNum = 7602210;BA.debugLine="If dr.Length > 40 Then";
if (_dr.length()>40) { 
RDebugUtils.currentLine=7602211;
 //BA.debugLineNum = 7602211;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = _dr.substring((int) (0),(int) (40))+"...";
 };
RDebugUtils.currentLine=7602214;
 //BA.debugLineNum = 7602214;BA.debugLine="If chPrincipal.Checked Then";
if (mostCurrent._chprincipal.getChecked()) { 
RDebugUtils.currentLine=7602215;
 //BA.debugLineNum = 7602215;BA.debugLine="default = CRLF& \"Dirección principal\"";
_default = anywheresoftware.b4a.keywords.Common.CRLF+"Dirección principal";
 };
RDebugUtils.currentLine=7602218;
 //BA.debugLineNum = 7602218;BA.debugLine="ListViewDirecciones.AddTwoLines2(dr,map.Get(\"f";
mostCurrent._listviewdirecciones.AddTwoLines2(BA.ObjectToCharSequence(_dr),BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("f_fecha")))+_default),(Object)(_map.getObject()));
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=7602222;
 //BA.debugLineNum = 7602222;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Dirección registrada."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=7602223;
 //BA.debugLineNum = 7602223;BA.debugLine="btnNuevaDireccion_Click";
_btnnuevadireccion_click();
 break; }
}
;
RDebugUtils.currentLine=7602227;
 //BA.debugLineNum = 7602227;BA.debugLine="End Sub";
return "";
}
public static String  _listviewdirecciones_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="direcciones";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewdirecciones_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub ListViewDirecciones_ItemClick (Position As Int";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="txtDireccion.Text = funcion.base64_Decode(map.Get";
mostCurrent._txtdireccion.setText(BA.ObjectToCharSequence(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,BA.ObjectToString(_map.Get((Object)("f_direccion"))))));
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="txtDireccion.Tag = map.Get(\"f_idrecord\")";
mostCurrent._txtdireccion.setTag(_map.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="End Sub";
return "";
}
}