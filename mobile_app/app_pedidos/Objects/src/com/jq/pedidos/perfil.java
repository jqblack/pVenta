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

public class perfil extends Activity implements B4AActivity{
	public static perfil mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.jq.pedidos", "com.jq.pedidos.perfil");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (perfil).");
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
		activityBA = new BA(this, layout, processBA, "com.jq.pedidos", "com.jq.pedidos.perfil");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.jq.pedidos.perfil", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (perfil) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (perfil) Resume **");
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
		return perfil.class;
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
        BA.LogInfo("** Activity (perfil) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            perfil mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (perfil) Resume **");
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
public anywheresoftware.b4a.objects.EditTextWrapper _txtdir = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnombre = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txttel = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblemail = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btndireccionback = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnchangepass = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondomodalpass = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondouser = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackchangepass = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnconfirmchangepass = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtnewpass = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassantigua = null;
public anywheresoftware.b4a.objects.EditTextWrapper _txtpassconfirm = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnsave = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
String _json = "";
com.jq.pedidos.httpjob _jobperfil = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="Activity.LoadLayout(\"frmPerfilClient\")";
mostCurrent._activity.LoadLayout("frmPerfilClient",mostCurrent.activityBA);
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ );
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="Dim jobperfil As HttpJob";
_jobperfil = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="jobperfil.Initialize(\"BuscarPerfil\",Me)";
_jobperfil._initialize /*String*/ (null,processBA,"BuscarPerfil",perfil.getObject());
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="jobperfil.PostString(Main.url&\"puntoventa/perfil\"";
_jobperfil._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/perfil","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="perfil";
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackchangepass_click() throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackchangepass_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackchangepass_click", null));}
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub btnBackChangePass_Click";
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="funcion.DisableView(False,PanelFondoUser)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelfondouser);
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="PanelFondoModalpass.SetVisibleAnimated(250,False)";
mostCurrent._panelfondomodalpass.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="End Sub";
return "";
}
public static String  _btnchangepass_click() throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnchangepass_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnchangepass_click", null));}
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub btnChangePass_Click";
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="If  PanelFondoModalpass.IsInitialized == False Th";
if (mostCurrent._panelfondomodalpass.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Activity.LoadLayout(\"frmChangePass\")";
mostCurrent._activity.LoadLayout("frmChangePass",mostCurrent.activityBA);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="PanelFondoModalpass.Visible = False";
mostCurrent._panelfondomodalpass.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="funcion.DisableView(True,PanelFondoUser)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelfondouser);
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="PanelFondoModalpass.SetVisibleAnimated(250,True)";
mostCurrent._panelfondomodalpass.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="End Sub";
return "";
}
public static String  _btnconfirmchangepass_click() throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnconfirmchangepass_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnconfirmchangepass_click", null));}
String _json = "";
com.jq.pedidos.httpjob _changepass = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub btnConfirmChangePass_Click";
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="If txtPassAntigua.Text == \"\" Then";
if ((mostCurrent._txtpassantigua.getText()).equals("")) { 
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Msgbox(\"Debe poner la contrseña antigua para pod";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Debe poner la contrseña antigua para poder actualizar"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15269895;
 //BA.debugLineNum = 15269895;BA.debugLine="If txtNewPass.Text == \"\" Then";
if ((mostCurrent._txtnewpass.getText()).equals("")) { 
RDebugUtils.currentLine=15269896;
 //BA.debugLineNum = 15269896;BA.debugLine="Msgbox(\"Debe poner la  nueva contrseña  para pod";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Debe poner la  nueva contrseña  para poder actualizar"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15269897;
 //BA.debugLineNum = 15269897;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15269900;
 //BA.debugLineNum = 15269900;BA.debugLine="If txtNewPass.Text == txtPassAntigua.Text Then";
if ((mostCurrent._txtnewpass.getText()).equals(mostCurrent._txtpassantigua.getText())) { 
RDebugUtils.currentLine=15269901;
 //BA.debugLineNum = 15269901;BA.debugLine="Msgbox(\"La nueva contrseña debe de ser diferente";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La nueva contrseña debe de ser diferente a la anterior para poder actualizar"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15269902;
 //BA.debugLineNum = 15269902;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15269905;
 //BA.debugLineNum = 15269905;BA.debugLine="If txtPassConfirm.Text == \"\" Then";
if ((mostCurrent._txtpassconfirm.getText()).equals("")) { 
RDebugUtils.currentLine=15269906;
 //BA.debugLineNum = 15269906;BA.debugLine="Msgbox(\"Debe de confirmar su nueva contrseña  pa";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Debe de confirmar su nueva contrseña  para poder actualizar"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15269907;
 //BA.debugLineNum = 15269907;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15269910;
 //BA.debugLineNum = 15269910;BA.debugLine="If txtPassConfirm.Text <> txtPassConfirm.Text The";
if ((mostCurrent._txtpassconfirm.getText()).equals(mostCurrent._txtpassconfirm.getText()) == false) { 
RDebugUtils.currentLine=15269911;
 //BA.debugLineNum = 15269911;BA.debugLine="Msgbox(\"Las contrseñas nuevas no coinciden. Por";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Las contrseñas nuevas no coinciden. Por favor verifique de nuevo"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15269912;
 //BA.debugLineNum = 15269912;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15269915;
 //BA.debugLineNum = 15269915;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=15269916;
 //BA.debugLineNum = 15269916;BA.debugLine="json = \"'f_antigua':\"&txtPassAntigua.Text& _ 	\",'";
_json = "'f_antigua':"+mostCurrent._txtpassantigua.getText()+",'f_nueva':"+mostCurrent._txtnewpass.getText()+", 'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ );
RDebugUtils.currentLine=15269920;
 //BA.debugLineNum = 15269920;BA.debugLine="Dim changePass As HttpJob";
_changepass = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=15269921;
 //BA.debugLineNum = 15269921;BA.debugLine="changePass.Initialize(\"changePass\",Me)";
_changepass._initialize /*String*/ (null,processBA,"changePass",perfil.getObject());
RDebugUtils.currentLine=15269922;
 //BA.debugLineNum = 15269922;BA.debugLine="changePass.PostString(Main.url&\"puntoventa/change";
_changepass._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/changePass","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=15269924;
 //BA.debugLineNum = 15269924;BA.debugLine="End Sub";
return "";
}
public static String  _btndireccionback_click() throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btndireccionback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btndireccionback_click", null));}
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub btnDireccionBack_Click";
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="End Sub";
return "";
}
public static String  _btnsave_click() throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnsave_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnsave_click", null));}
String _json = "";
com.jq.pedidos.httpjob _actualizar = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub btnSave_Click";
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="If txtNombre.Text == \"\" Then";
if ((mostCurrent._txtnombre.getText()).equals("")) { 
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Msgbox(\"No puede dejar el Nombre vacio\",\"Aviso\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No puede dejar el Nombre vacio"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15400967;
 //BA.debugLineNum = 15400967;BA.debugLine="If lblemail.Text == \"\" Then";
if ((mostCurrent._lblemail.getText()).equals("")) { 
RDebugUtils.currentLine=15400968;
 //BA.debugLineNum = 15400968;BA.debugLine="Msgbox(\"No puede dejar el Email vacio\",\"Aviso\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No puede dejar el Email vacio"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15400969;
 //BA.debugLineNum = 15400969;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15400972;
 //BA.debugLineNum = 15400972;BA.debugLine="If txttel.Text == \"\" Then";
if ((mostCurrent._txttel.getText()).equals("")) { 
RDebugUtils.currentLine=15400973;
 //BA.debugLineNum = 15400973;BA.debugLine="Msgbox(\"No puede dejar el Teléfono vacio\",\"Aviso";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No puede dejar el Teléfono vacio"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15400974;
 //BA.debugLineNum = 15400974;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15400977;
 //BA.debugLineNum = 15400977;BA.debugLine="If txtdir.Text == \"\" Then";
if ((mostCurrent._txtdir.getText()).equals("")) { 
RDebugUtils.currentLine=15400978;
 //BA.debugLineNum = 15400978;BA.debugLine="Msgbox(\"No puede dejar la Dirección vacia\",\"Avis";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No puede dejar la Dirección vacia"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
RDebugUtils.currentLine=15400979;
 //BA.debugLineNum = 15400979;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15400983;
 //BA.debugLineNum = 15400983;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=15400984;
 //BA.debugLineNum = 15400984;BA.debugLine="json = \"'f_nombre':\"&txtNombre.Text& _ 	\",'f_emai";
_json = "'f_nombre':"+mostCurrent._txtnombre.getText()+",'f_email':"+mostCurrent._lblemail.getText()+",'f_tel':"+mostCurrent._txttel.getText()+",'f_direccion':"+mostCurrent._txtdir.getText()+", 'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ );
RDebugUtils.currentLine=15400990;
 //BA.debugLineNum = 15400990;BA.debugLine="Dim actualizar As HttpJob";
_actualizar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=15400991;
 //BA.debugLineNum = 15400991;BA.debugLine="actualizar.Initialize(\"actualizar\",Me)";
_actualizar._initialize /*String*/ (null,processBA,"actualizar",perfil.getObject());
RDebugUtils.currentLine=15400992;
 //BA.debugLineNum = 15400992;BA.debugLine="actualizar.PostString(Main.url&\"puntoventa/actual";
_actualizar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/actualizar","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=15400994;
 //BA.debugLineNum = 15400994;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.jq.pedidos.httpjob _job) throws Exception{
RDebugUtils.currentModule="perfil";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=15073291;
 //BA.debugLineNum = 15073291;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15073293;
 //BA.debugLineNum = 15073293;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=15073295;
 //BA.debugLineNum = 15073295;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=15073298;
 //BA.debugLineNum = 15073298;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"BuscarPerfil","actualizar","changePass")) {
case 0: {
RDebugUtils.currentLine=15073303;
 //BA.debugLineNum = 15073303;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15073304;
 //BA.debugLineNum = 15073304;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=15073305;
 //BA.debugLineNum = 15073305;BA.debugLine="mapa = list.Get(0)";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get((int) (0))));
RDebugUtils.currentLine=15073307;
 //BA.debugLineNum = 15073307;BA.debugLine="txtNombre.Text = mapa.Get(\"f_nombre\")";
mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_nombre"))));
RDebugUtils.currentLine=15073308;
 //BA.debugLineNum = 15073308;BA.debugLine="lblemail.Text = mapa.Get(\"f_email\")";
mostCurrent._lblemail.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_email"))));
RDebugUtils.currentLine=15073309;
 //BA.debugLineNum = 15073309;BA.debugLine="txttel.Text = mapa.Get(\"f_telefono\")";
mostCurrent._txttel.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_telefono"))));
RDebugUtils.currentLine=15073310;
 //BA.debugLineNum = 15073310;BA.debugLine="txtdir.Text = mapa.Get(\"f_direccion\")";
mostCurrent._txtdir.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_direccion"))));
 break; }
case 1: {
RDebugUtils.currentLine=15073314;
 //BA.debugLineNum = 15073314;BA.debugLine="If map.Get(\"f_data\") Then";
if (BA.ObjectToBoolean(_map.Get((Object)("f_data")))) { 
RDebugUtils.currentLine=15073315;
 //BA.debugLineNum = 15073315;BA.debugLine="ToastMessageShow(\"Información actualizada\", Fa";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Información actualizada"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15073316;
 //BA.debugLineNum = 15073316;BA.debugLine="btnDireccionBack_Click";
_btndireccionback_click();
RDebugUtils.currentLine=15073318;
 //BA.debugLineNum = 15073318;BA.debugLine="txtNombre.Text = \"\"";
mostCurrent._txtnombre.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073319;
 //BA.debugLineNum = 15073319;BA.debugLine="lblemail.Text = \"\"";
mostCurrent._lblemail.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073320;
 //BA.debugLineNum = 15073320;BA.debugLine="txttel.Text = \"\"";
mostCurrent._txttel.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073321;
 //BA.debugLineNum = 15073321;BA.debugLine="txtdir.Text = \"\"";
mostCurrent._txtdir.setText(BA.ObjectToCharSequence(""));
 }else {
RDebugUtils.currentLine=15073324;
 //BA.debugLineNum = 15073324;BA.debugLine="Msgbox(\"Hubo un error al actualizar la inform";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Hubo un error al actualizar la información"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 };
 break; }
case 2: {
RDebugUtils.currentLine=15073329;
 //BA.debugLineNum = 15073329;BA.debugLine="If map.Get(\"f_data\") Then";
if (BA.ObjectToBoolean(_map.Get((Object)("f_data")))) { 
RDebugUtils.currentLine=15073330;
 //BA.debugLineNum = 15073330;BA.debugLine="ToastMessageShow(\"Contrseña actualizada\", Fals";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Contrseña actualizada"),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=15073331;
 //BA.debugLineNum = 15073331;BA.debugLine="btnBackChangePass_Click";
_btnbackchangepass_click();
RDebugUtils.currentLine=15073333;
 //BA.debugLineNum = 15073333;BA.debugLine="txtPassAntigua.Text = \"\"";
mostCurrent._txtpassantigua.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073334;
 //BA.debugLineNum = 15073334;BA.debugLine="txtNewPass.Text = \"\"";
mostCurrent._txtnewpass.setText(BA.ObjectToCharSequence(""));
RDebugUtils.currentLine=15073335;
 //BA.debugLineNum = 15073335;BA.debugLine="txtPassConfirm.Text = \"\"";
mostCurrent._txtpassconfirm.setText(BA.ObjectToCharSequence(""));
 }else {
RDebugUtils.currentLine=15073338;
 //BA.debugLineNum = 15073338;BA.debugLine="Msgbox(\"La Contraseña introducida no coincide";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La Contraseña introducida no coincide con la anterior"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
 };
 break; }
}
;
RDebugUtils.currentLine=15073344;
 //BA.debugLineNum = 15073344;BA.debugLine="End Sub";
return "";
}
}