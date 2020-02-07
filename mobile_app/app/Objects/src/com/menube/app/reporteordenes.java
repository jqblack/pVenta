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

public class reporteordenes extends Activity implements B4AActivity{
	public static reporteordenes mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.menube.app", "com.menube.app.reporteordenes");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (reporteordenes).");
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
		activityBA = new BA(this, layout, processBA, "com.menube.app", "com.menube.app.reporteordenes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.menube.app.reporteordenes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (reporteordenes) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (reporteordenes) Resume **");
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
		return reporteordenes.class;
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
        BA.LogInfo("** Activity (reporteordenes) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            reporteordenes mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (reporteordenes) Resume **");
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
public anywheresoftware.b4a.objects.ButtonWrapper _btnbuscarreporte = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreporteback = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chordenesabiertas = null;
public com.menube.app.anotherdatepicker _date = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewordenes = null;
public b4a.example.dateutils _dateutils = null;
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Activity.LoadLayout(\"frmReporteOrdenes\")";
mostCurrent._activity.LoadLayout("frmReporteOrdenes",mostCurrent.activityBA);
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="ListViewOrdenes.TwoLinesLayout.ItemHeight = 85dip";
mostCurrent._listviewordenes.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextColor =";
mostCurrent._listviewordenes.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextSize = 1";
mostCurrent._listviewordenes.getTwoLinesLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.Typeface = T";
mostCurrent._listviewordenes.getTwoLinesLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.TextCo";
mostCurrent._listviewordenes.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Typefa";
mostCurrent._listviewordenes.getTwoLinesLayout().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Height";
mostCurrent._listviewordenes.getTwoLinesLayout().SecondLabel.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="funcion.SetDivider(ListViewOrdenes,Colors.Gray,1d";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewordenes,anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="chOrdenesAbiertas.Checked = True";
mostCurrent._chordenesabiertas.setChecked(anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=8192017;
 //BA.debugLineNum = 8192017;BA.debugLine="btnBuscarReporte_Click";
_btnbuscarreporte_click();
RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="End Sub";
return "";
}
public static String  _btnbuscarreporte_click() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbuscarreporte_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbuscarreporte_click", null));}
String _json = "";
com.menube.app.httpjob _jobbuscar = null;
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub btnBuscarReporte_Click";
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(date.GetDate)";
_json = "'f_fecha1':'"+anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._date._getdate /*long*/ (null))+"','f_pendiente':"+BA.ObjectToString(mostCurrent._chordenesabiertas.getChecked());
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = new com.menube.app.httpjob();
RDebugUtils.currentLine=8454151;
 //BA.debugLineNum = 8454151;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
_jobbuscar._initialize /*String*/ (null,processBA,"JobBuscar",reporteordenes.getObject());
RDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_ord";
_jobbuscar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_ordenes_cliente","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=8454154;
 //BA.debugLineNum = 8454154;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="reporteordenes";
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="End Sub";
return "";
}
public static String  _btnreporteback_click() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreporteback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreporteback_click", null));}
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub btnReporteBack_Click";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.menube.app.httpjob _job) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
String _secondline = "";
int _i = 0;
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8519687;
 //BA.debugLineNum = 8519687;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8519691;
 //BA.debugLineNum = 8519691;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8519692;
 //BA.debugLineNum = 8519692;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=8519693;
 //BA.debugLineNum = 8519693;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=8519694;
 //BA.debugLineNum = 8519694;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=8519695;
 //BA.debugLineNum = 8519695;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=8519697;
 //BA.debugLineNum = 8519697;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobBuscar","JobEliminar")) {
case 0: {
RDebugUtils.currentLine=8519700;
 //BA.debugLineNum = 8519700;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=8519701;
 //BA.debugLineNum = 8519701;BA.debugLine="ListViewOrdenes.Clear";
mostCurrent._listviewordenes.Clear();
RDebugUtils.currentLine=8519702;
 //BA.debugLineNum = 8519702;BA.debugLine="If list.Size = 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=8519703;
 //BA.debugLineNum = 8519703;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay ordenes registradas"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=8519704;
 //BA.debugLineNum = 8519704;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=8519707;
 //BA.debugLineNum = 8519707;BA.debugLine="Dim secondLine As String";
_secondline = "";
RDebugUtils.currentLine=8519708;
 //BA.debugLineNum = 8519708;BA.debugLine="For i=0 To list.Size - 1";
{
final int step22 = 1;
final int limit22 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=8519709;
 //BA.debugLineNum = 8519709;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=8519710;
 //BA.debugLineNum = 8519710;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
_secondline = "Fecha: "+BA.ObjectToString(_map.Get((Object)("f_fecha_regstro_orden")))+anywheresoftware.b4a.keywords.Common.CRLF+"Estado: "+BA.ObjectToString(_map.Get((Object)("f_status")));
RDebugUtils.currentLine=8519711;
 //BA.debugLineNum = 8519711;BA.debugLine="ListViewOrdenes.AddTwoLines2(map.Get(\"f_negoci";
mostCurrent._listviewordenes.AddTwoLines2(BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("f_negocio")))+"   $"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_total")))),(int) (0),(int) (2))),BA.ObjectToCharSequence(_secondline),(Object)(_map.getObject()));
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=8519715;
 //BA.debugLineNum = 8519715;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=8519716;
 //BA.debugLineNum = 8519716;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=8519717;
 //BA.debugLineNum = 8519717;BA.debugLine="ListViewOrdenes.Clear";
mostCurrent._listviewordenes.Clear();
RDebugUtils.currentLine=8519718;
 //BA.debugLineNum = 8519718;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Orden cancelada."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=8519719;
 //BA.debugLineNum = 8519719;BA.debugLine="btnBuscarReporte_Click";
_btnbuscarreporte_click();
 }else {
RDebugUtils.currentLine=8519721;
 //BA.debugLineNum = 8519721;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La orden ya no se puede ser cancelada."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
 };
 break; }
}
;
RDebugUtils.currentLine=8519726;
 //BA.debugLineNum = 8519726;BA.debugLine="End Sub";
return "";
}
public static String  _listviewordenes_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewordenes_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewordenes_itemclick", new Object[] {_position,_value}));}
int _r = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
com.menube.app.httpjob _jobeliminar = null;
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub ListViewOrdenes_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Dim r As Int =  Msgbox2(\"Seguro que desea elimina";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea eliminar esta orden?"),BA.ObjectToCharSequence("Confirmación"),"Si","","Volver",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=8585225;
 //BA.debugLineNum = 8585225;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=8585226;
 //BA.debugLineNum = 8585226;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
_json = "'f_idrecord':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_idempresa':"+BA.ObjectToString(_map.Get((Object)("f_idempresa")));
RDebugUtils.currentLine=8585228;
 //BA.debugLineNum = 8585228;BA.debugLine="Dim JobEliminar As HttpJob";
_jobeliminar = new com.menube.app.httpjob();
RDebugUtils.currentLine=8585229;
 //BA.debugLineNum = 8585229;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
_jobeliminar._initialize /*String*/ (null,processBA,"JobEliminar",reporteordenes.getObject());
RDebugUtils.currentLine=8585230;
 //BA.debugLineNum = 8585230;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
_jobeliminar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/set_eliminar_orden","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 };
RDebugUtils.currentLine=8585233;
 //BA.debugLineNum = 8585233;BA.debugLine="End Sub";
return "";
}
}