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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.jq.pedidos", "com.jq.pedidos.reporteordenes");
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
		activityBA = new BA(this, layout, processBA, "com.jq.pedidos", "com.jq.pedidos.reporteordenes");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.jq.pedidos.reporteordenes", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
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
public static String _numorden = "";
public static anywheresoftware.b4a.objects.collections.List _listaaddall = null;
public static anywheresoftware.b4a.objects.collections.List _listaux = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbuscarreporte = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnreporteback = null;
public anywheresoftware.b4a.objects.CompoundButtonWrapper.CheckBoxWrapper _chordenesabiertas = null;
public com.jq.pedidos.anotherdatepicker _date = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewordenes = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondoordedetalle = null;
public anywheresoftware.b4a.objects.LabelWrapper _lbltituloproorden = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listproordendetalle = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackproorden = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnaddallproorden = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelordenes = null;
public com.jq.pedidos.anotherdatepicker _date2 = null;
public anywheresoftware.b4a.objects.LabelWrapper _label3 = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
int _r = 0;
RDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=11403269;
 //BA.debugLineNum = 11403269;BA.debugLine="Activity.LoadLayout(\"frmReporteOrdenes\")";
mostCurrent._activity.LoadLayout("frmReporteOrdenes",mostCurrent.activityBA);
RDebugUtils.currentLine=11403271;
 //BA.debugLineNum = 11403271;BA.debugLine="ListViewOrdenes.TwoLinesLayout.ItemHeight = 85di";
mostCurrent._listviewordenes.getTwoLinesLayout().setItemHeight(anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (85)));
RDebugUtils.currentLine=11403272;
 //BA.debugLineNum = 11403272;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextColor =";
mostCurrent._listviewordenes.getTwoLinesLayout().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11403273;
 //BA.debugLineNum = 11403273;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.TextSize =";
mostCurrent._listviewordenes.getTwoLinesLayout().Label.setTextSize((float) (15));
RDebugUtils.currentLine=11403274;
 //BA.debugLineNum = 11403274;BA.debugLine="ListViewOrdenes.TwoLinesLayout.Label.Typeface =";
mostCurrent._listviewordenes.getTwoLinesLayout().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=11403276;
 //BA.debugLineNum = 11403276;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.TextC";
mostCurrent._listviewordenes.getTwoLinesLayout().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=11403277;
 //BA.debugLineNum = 11403277;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Typef";
mostCurrent._listviewordenes.getTwoLinesLayout().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=11403278;
 //BA.debugLineNum = 11403278;BA.debugLine="ListViewOrdenes.TwoLinesLayout.SecondLabel.Heigh";
mostCurrent._listviewordenes.getTwoLinesLayout().SecondLabel.setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=11403279;
 //BA.debugLineNum = 11403279;BA.debugLine="funcion.SetDivider(ListViewOrdenes,Colors.Gray,1";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewordenes,anywheresoftware.b4a.keywords.Common.Colors.Gray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=11403282;
 //BA.debugLineNum = 11403282;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
 }else {
RDebugUtils.currentLine=11403286;
 //BA.debugLineNum = 11403286;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=11403288;
 //BA.debugLineNum = 11403288;BA.debugLine="r = Msgbox2(\"Para ver sus ordenes debe de inici";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para ver sus ordenes debe de iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar Sesión?"),"Si","","Más tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=11403290;
 //BA.debugLineNum = 11403290;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=11403291;
 //BA.debugLineNum = 11403291;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11403292;
 //BA.debugLineNum = 11403292;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=11403295;
 //BA.debugLineNum = 11403295;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
 };
 };
RDebugUtils.currentLine=11403300;
 //BA.debugLineNum = 11403300;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="reporteordenes";
RDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
com.jq.pedidos.httpjob _jobbuscar = null;
int _r = 0;
RDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=11468804;
 //BA.debugLineNum = 11468804;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
_jobbuscar._initialize /*String*/ (null,processBA,"JobBuscar",reporteordenes.getObject());
RDebugUtils.currentLine=11468806;
 //BA.debugLineNum = 11468806;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_or";
_jobbuscar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_ordenes_cliente","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,""));
 }else {
RDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="Dim r As Int";
_r = 0;
RDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="r = Msgbox2(\"Para ver sus ordenes debe de inicia";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Para ver sus ordenes debe de iniciar Sesión"),BA.ObjectToCharSequence("Desea iniciar Sesión?"),"Si","","Más tarde",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=11468813;
 //BA.debugLineNum = 11468813;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=11468814;
 //BA.debugLineNum = 11468814;BA.debugLine="Main.mostar = True";
mostCurrent._main._mostar /*boolean*/  = anywheresoftware.b4a.keywords.Common.True;
RDebugUtils.currentLine=11468815;
 //BA.debugLineNum = 11468815;BA.debugLine="StartActivity(Main)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._main.getObject()));
 }else {
RDebugUtils.currentLine=11468818;
 //BA.debugLineNum = 11468818;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
 };
 };
RDebugUtils.currentLine=11468822;
 //BA.debugLineNum = 11468822;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddallproorden_click() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaddallproorden_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaddallproorden_click", null));}
int _res = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub btnAddAllproOrden_Click";
RDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="Dim res As Int = Msgbox2(\"Desea agregar todos los";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Desea agregar todos los  productos al carrito?"),BA.ObjectToCharSequence("Aviso!"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="If res == DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=11993095;
 //BA.debugLineNum = 11993095;BA.debugLine="For i=0 To listaAddAll.Size-1";
{
final int step3 = 1;
final int limit3 = (int) (_listaaddall.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=11993096;
 //BA.debugLineNum = 11993096;BA.debugLine="Log(i)";
anywheresoftware.b4a.keywords.Common.LogImpl("611993096",BA.NumberToString(_i),0);
RDebugUtils.currentLine=11993097;
 //BA.debugLineNum = 11993097;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="map = listaAddAll.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listaaddall.Get(_i)));
RDebugUtils.currentLine=11993100;
 //BA.debugLineNum = 11993100;BA.debugLine="salvar_detalle_temporal_All(map,1)";
_salvar_detalle_temporal_all(_map,(int) (1));
 }
};
RDebugUtils.currentLine=11993103;
 //BA.debugLineNum = 11993103;BA.debugLine="Msgbox(\"Se agregaron todos los productos en exis";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Se agregaron todos los productos en existencia, verifique en su carrito!"),BA.ObjectToCharSequence("Realizado"),mostCurrent.activityBA);
RDebugUtils.currentLine=11993104;
 //BA.debugLineNum = 11993104;BA.debugLine="btnbackProOrden_Click";
_btnbackproorden_click();
 }else {
RDebugUtils.currentLine=11993107;
 //BA.debugLineNum = 11993107;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11993110;
 //BA.debugLineNum = 11993110;BA.debugLine="End Sub";
return "";
}
public static String  _salvar_detalle_temporal_all(anywheresoftware.b4a.objects.collections.Map _map,int _cantidad) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "salvar_detalle_temporal_all", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "salvar_detalle_temporal_all", new Object[] {_map,_cantidad}));}
anywheresoftware.b4a.objects.collections.Map _mapcalculos = null;
String _json = "";
com.jq.pedidos.httpjob _jobdetalletemporal2 = null;
RDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub salvar_detalle_temporal_All(map As Map, cantid";
RDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),0,_cantidad,(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax")))),mostCurrent._principal._impuestoincluido /*boolean*/ ,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=12189701;
 //BA.debugLineNum = 12189701;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_tipo':1"+",'f_idproducto':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_cantidad':"+BA.NumberToString(_cantidad)+""+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_diferencia':0"+",'f_porciento_descuento':0"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_tax")))+",'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=12189715;
 //BA.debugLineNum = 12189715;BA.debugLine="Dim JobDetalleTemporal2 As HttpJob";
_jobdetalletemporal2 = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=12189716;
 //BA.debugLineNum = 12189716;BA.debugLine="JobDetalleTemporal2.Initialize(\"JobDetalleTempora";
_jobdetalletemporal2._initialize /*String*/ (null,processBA,"JobDetalleTemporalAll",reporteordenes.getObject());
RDebugUtils.currentLine=12189717;
 //BA.debugLineNum = 12189717;BA.debugLine="JobDetalleTemporal2.PostString(Main.url&\"puntoven";
_jobdetalletemporal2._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=12189719;
 //BA.debugLineNum = 12189719;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackproorden_click() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackproorden_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackproorden_click", null));}
RDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub btnbackProOrden_Click";
RDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="funcion.DisableView(False,PanelOrdenes)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.False,mostCurrent._panelordenes);
RDebugUtils.currentLine=11927555;
 //BA.debugLineNum = 11927555;BA.debugLine="PanelFondoOrdeDetalle.SetVisibleAnimated(250,Fals";
mostCurrent._panelfondoordedetalle.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="End Sub";
return "";
}
public static String  _btnbuscarreporte_click() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbuscarreporte_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbuscarreporte_click", null));}
String _json = "";
com.jq.pedidos.httpjob _jobbuscar = null;
RDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub btnBuscarReporte_Click";
RDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
anywheresoftware.b4a.keywords.Common.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="If DateTime.DateParse(DateTime.Date(date.GetDate)";
if (anywheresoftware.b4a.keywords.Common.DateTime.DateParse(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._date._getdate /*long*/ (null)))<=anywheresoftware.b4a.keywords.Common.DateTime.DateParse(anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._date2._getdate /*long*/ (null)))) { 
RDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(date.GetDate";
_json = "'f_fecha1':'"+anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._date._getdate /*long*/ (null))+"','f_fecha2':"+anywheresoftware.b4a.keywords.Common.DateTime.Date(mostCurrent._date2._getdate /*long*/ (null));
RDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
_jobbuscar._initialize /*String*/ (null,processBA,"JobBuscar",reporteordenes.getObject());
RDebugUtils.currentLine=11665418;
 //BA.debugLineNum = 11665418;BA.debugLine="ToastMessageShow(\"Buscando ordenes...\",False)";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Buscando ordenes..."),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11665419;
 //BA.debugLineNum = 11665419;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_or";
_jobbuscar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/get_ordenes_cliente2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=11665422;
 //BA.debugLineNum = 11665422;BA.debugLine="Msgbox(\"La fecha de inicio tiene que ser anteri";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La fecha de inicio tiene que ser anterior a la fecha límite!"),BA.ObjectToCharSequence("Error"),mostCurrent.activityBA);
RDebugUtils.currentLine=11665423;
 //BA.debugLineNum = 11665423;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11665426;
 //BA.debugLineNum = 11665426;BA.debugLine="End Sub";
return "";
}
public static String  _btnreporteback_click() throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnreporteback_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnreporteback_click", null));}
RDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub btnReporteBack_Click";
RDebugUtils.currentLine=11599873;
 //BA.debugLineNum = 11599873;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.jq.pedidos.httpjob _job) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
String _secondline = "";
int _i = 0;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
RDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="If Job.Success = False Then";
if (_job._success /*boolean*/ ==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=11730947;
 //BA.debugLineNum = 11730947;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence(mostCurrent._main._jobmsj /*String*/ ),BA.ObjectToCharSequence(mostCurrent._main._jobmsjtitle /*String*/ ),mostCurrent.activityBA);
RDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11730951;
 //BA.debugLineNum = 11730951;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11730955;
 //BA.debugLineNum = 11730955;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11730956;
 //BA.debugLineNum = 11730956;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=11730957;
 //BA.debugLineNum = 11730957;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=11730958;
 //BA.debugLineNum = 11730958;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=11730959;
 //BA.debugLineNum = 11730959;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=11730961;
 //BA.debugLineNum = 11730961;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"JobBuscar","JobEliminar","BuscarProducto","JobDetalleTemporal","JobDetalleTemporalAll")) {
case 0: {
RDebugUtils.currentLine=11730964;
 //BA.debugLineNum = 11730964;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=11730965;
 //BA.debugLineNum = 11730965;BA.debugLine="ListViewOrdenes.Clear";
mostCurrent._listviewordenes.Clear();
RDebugUtils.currentLine=11730966;
 //BA.debugLineNum = 11730966;BA.debugLine="If list.Size == 0 Then";
if (_list.getSize()==0) { 
RDebugUtils.currentLine=11730967;
 //BA.debugLineNum = 11730967;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("No hay ordenes registradas"),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=11730968;
 //BA.debugLineNum = 11730968;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11730971;
 //BA.debugLineNum = 11730971;BA.debugLine="Label3.Text = \"Ordenes registradas: \"&list.Size";
mostCurrent._label3.setText(BA.ObjectToCharSequence("Ordenes registradas: "+BA.NumberToString(_list.getSize())));
RDebugUtils.currentLine=11730973;
 //BA.debugLineNum = 11730973;BA.debugLine="Dim secondLine As String";
_secondline = "";
RDebugUtils.currentLine=11730974;
 //BA.debugLineNum = 11730974;BA.debugLine="For i=0 To list.Size - 1";
{
final int step23 = 1;
final int limit23 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit23 ;_i = _i + step23 ) {
RDebugUtils.currentLine=11730975;
 //BA.debugLineNum = 11730975;BA.debugLine="map = list.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=11730977;
 //BA.debugLineNum = 11730977;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
_secondline = "Fecha: "+BA.ObjectToString(_map.Get((Object)("f_fecha_regstro_orden")))+anywheresoftware.b4a.keywords.Common.CRLF+"Estado: "+BA.ObjectToString(_map.Get((Object)("f_status")));
RDebugUtils.currentLine=11730978;
 //BA.debugLineNum = 11730978;BA.debugLine="ListViewOrdenes.AddTwoLines2(map.Get(\"f_negoci";
mostCurrent._listviewordenes.AddTwoLines2(BA.ObjectToCharSequence(BA.ObjectToString(_map.Get((Object)("f_negocio")))+"   $"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_map.Get((Object)("f_total")))),(int) (0),(int) (2))),BA.ObjectToCharSequence(_secondline),(Object)(_map.getObject()));
 }
};
 break; }
case 1: {
RDebugUtils.currentLine=11730982;
 //BA.debugLineNum = 11730982;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=11730983;
 //BA.debugLineNum = 11730983;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("1"))) { 
RDebugUtils.currentLine=11730984;
 //BA.debugLineNum = 11730984;BA.debugLine="ListViewOrdenes.Clear";
mostCurrent._listviewordenes.Clear();
RDebugUtils.currentLine=11730985;
 //BA.debugLineNum = 11730985;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Orden cancelada."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=11730986;
 //BA.debugLineNum = 11730986;BA.debugLine="btnBuscarReporte_Click";
_btnbuscarreporte_click();
 }else {
RDebugUtils.currentLine=11730988;
 //BA.debugLineNum = 11730988;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("La orden ya no se puede ser cancelada."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
 };
 break; }
case 2: {
RDebugUtils.currentLine=11730993;
 //BA.debugLineNum = 11730993;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=11730994;
 //BA.debugLineNum = 11730994;BA.debugLine="listaAddAll.Clear";
_listaaddall.Clear();
RDebugUtils.currentLine=11730995;
 //BA.debugLineNum = 11730995;BA.debugLine="listaAddAll = list";
_listaaddall = _list;
RDebugUtils.currentLine=11730997;
 //BA.debugLineNum = 11730997;BA.debugLine="listAux = listaAddAll";
_listaux = _listaaddall;
RDebugUtils.currentLine=11730999;
 //BA.debugLineNum = 11730999;BA.debugLine="If PanelFondoOrdeDetalle.IsInitialized == False";
if (mostCurrent._panelfondoordedetalle.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=11731001;
 //BA.debugLineNum = 11731001;BA.debugLine="Activity.LoadLayout(\"frmProductosOrdenDetalle\"";
mostCurrent._activity.LoadLayout("frmProductosOrdenDetalle",mostCurrent.activityBA);
RDebugUtils.currentLine=11731002;
 //BA.debugLineNum = 11731002;BA.debugLine="PanelFondoOrdeDetalle.Visible = False";
mostCurrent._panelfondoordedetalle.setVisible(anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=11731004;
 //BA.debugLineNum = 11731004;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.ItemHeig";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (12),mostCurrent.activityBA));
RDebugUtils.currentLine=11731006;
 //BA.debugLineNum = 11731006;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Te";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=11731007;
 //BA.debugLineNum = 11731007;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Te";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=11731008;
 //BA.debugLineNum = 11731008;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Ty";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=11731009;
 //BA.debugLineNum = 11731009;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.Label.Pa";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=11731011;
 //BA.debugLineNum = 11731011;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.SecondLa";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=11731012;
 //BA.debugLineNum = 11731012;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.SecondLa";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=11731013;
 //BA.debugLineNum = 11731013;BA.debugLine="ListProOrdenDetalle.TwoLinesAndBitmap.SecondLa";
mostCurrent._listproordendetalle.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=11731015;
 //BA.debugLineNum = 11731015;BA.debugLine="funcion.SetDivider(ListProOrdenDetalle,Colors.";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listproordendetalle,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
 };
RDebugUtils.currentLine=11731020;
 //BA.debugLineNum = 11731020;BA.debugLine="funcion.DisableView(True,PanelOrdenes)";
mostCurrent._funcion._disableview /*String*/ (mostCurrent.activityBA,anywheresoftware.b4a.keywords.Common.True,mostCurrent._panelordenes);
RDebugUtils.currentLine=11731021;
 //BA.debugLineNum = 11731021;BA.debugLine="lbltituloProOrden.Text = numOrden";
mostCurrent._lbltituloproorden.setText(BA.ObjectToCharSequence(_numorden));
RDebugUtils.currentLine=11731022;
 //BA.debugLineNum = 11731022;BA.debugLine="PanelFondoOrdeDetalle.SetVisibleAnimated(250,Tr";
mostCurrent._panelfondoordedetalle.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=11731024;
 //BA.debugLineNum = 11731024;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=11731026;
 //BA.debugLineNum = 11731026;BA.debugLine="ListProOrdenDetalle.Clear";
mostCurrent._listproordendetalle.Clear();
RDebugUtils.currentLine=11731028;
 //BA.debugLineNum = 11731028;BA.debugLine="For i = 0 To list.Size-1";
{
final int step60 = 1;
final int limit60 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit60 ;_i = _i + step60 ) {
RDebugUtils.currentLine=11731030;
 //BA.debugLineNum = 11731030;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11731031;
 //BA.debugLineNum = 11731031;BA.debugLine="mapa = list.Get(i)";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=11731033;
 //BA.debugLineNum = 11731033;BA.debugLine="If  mapa.Get(\"f_foto\")<> Null And  mapa.Get(\"f";
if (_mapa.Get((Object)("f_foto"))!= null && (_mapa.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=11731034;
 //BA.debugLineNum = 11731034;BA.debugLine="bm = funcion.getImagen(mapa.Get(\"f_foto\"))";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapa.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=11731036;
 //BA.debugLineNum = 11731036;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-i";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 };
RDebugUtils.currentLine=11731039;
 //BA.debugLineNum = 11731039;BA.debugLine="ListProOrdenDetalle.AddTwoLinesAndBitmap2(mapa";
mostCurrent._listproordendetalle.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_mapa.Get((Object)("f_nombre"))),BA.ObjectToCharSequence(_mapa.Get((Object)("f_precio"))),_bm.getBitmap(),(Object)(_mapa.getObject()));
 }
};
 break; }
case 3: {
RDebugUtils.currentLine=11731045;
 //BA.debugLineNum = 11731045;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=11731046;
 //BA.debugLineNum = 11731046;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("0"))) { 
RDebugUtils.currentLine=11731047;
 //BA.debugLineNum = 11731047;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto no tiene existencia: "+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_job._tag /*Object*/ )+"."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=11731048;
 //BA.debugLineNum = 11731048;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11731050;
 //BA.debugLineNum = 11731050;BA.debugLine="Principal.cantidadProduto = Principal.cantidadP";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (mostCurrent._principal._cantidadproduto /*int*/ +1);
RDebugUtils.currentLine=11731053;
 //BA.debugLineNum = 11731053;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto agregado al carrito."),anywheresoftware.b4a.keywords.Common.False);
 break; }
case 4: {
RDebugUtils.currentLine=11731057;
 //BA.debugLineNum = 11731057;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=11731058;
 //BA.debugLineNum = 11731058;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("0"))) { 
RDebugUtils.currentLine=11731059;
 //BA.debugLineNum = 11731059;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto no tiene existencia: "+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_job._tag /*Object*/ )+"."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=11731060;
 //BA.debugLineNum = 11731060;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=11731062;
 //BA.debugLineNum = 11731062;BA.debugLine="Principal.cantidadProduto = Principal.cantidadP";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (mostCurrent._principal._cantidadproduto /*int*/ +1);
 break; }
}
;
RDebugUtils.currentLine=11731066;
 //BA.debugLineNum = 11731066;BA.debugLine="End Sub";
return "";
}
public static String  _listproordendetalle_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listproordendetalle_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listproordendetalle_itemclick", new Object[] {_position,_value}));}
int _res = 0;
anywheresoftware.b4a.objects.collections.Map _mapapro = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
RDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub ListProOrdenDetalle_ItemClick (Position As Int";
RDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="Dim res As Int = Msgbox2(\"Desea agregar este prod";
_res = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Desea agregar este producto al carrito?"),BA.ObjectToCharSequence("Aviso!"),"Si","","No",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="If res == DialogResponse.POSITIVE Then";
if (_res==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=12058630;
 //BA.debugLineNum = 12058630;BA.debugLine="Dim mapaPro As Map";
_mapapro = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12058631;
 //BA.debugLineNum = 12058631;BA.debugLine="mapaPro = Value";
_mapapro.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=12058633;
 //BA.debugLineNum = 12058633;BA.debugLine="listAux.Clear";
_listaux.Clear();
RDebugUtils.currentLine=12058635;
 //BA.debugLineNum = 12058635;BA.debugLine="For i=0 To listaAddAll.Size -1";
{
final int step6 = 1;
final int limit6 = (int) (_listaaddall.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
RDebugUtils.currentLine=12058636;
 //BA.debugLineNum = 12058636;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=12058637;
 //BA.debugLineNum = 12058637;BA.debugLine="map = listaAddAll.Get(i)";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listaaddall.Get(_i)));
RDebugUtils.currentLine=12058639;
 //BA.debugLineNum = 12058639;BA.debugLine="If map.Get(\"f_idrecord\") == mapaPro.Get(\"f_idre";
if ((_map.Get((Object)("f_idrecord"))).equals(_mapapro.Get((Object)("f_idrecord")))) { 
RDebugUtils.currentLine=12058640;
 //BA.debugLineNum = 12058640;BA.debugLine="listaAddAll.RemoveAt(Position)";
_listaaddall.RemoveAt(_position);
 };
 }
};
RDebugUtils.currentLine=12058644;
 //BA.debugLineNum = 12058644;BA.debugLine="salvar_detalle_temporal(mapaPro,1)";
_salvar_detalle_temporal(_mapapro,(int) (1));
 }else {
RDebugUtils.currentLine=12058647;
 //BA.debugLineNum = 12058647;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=12058650;
 //BA.debugLineNum = 12058650;BA.debugLine="End Sub";
return "";
}
public static String  _salvar_detalle_temporal(anywheresoftware.b4a.objects.collections.Map _map,int _cantidad) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "salvar_detalle_temporal", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "salvar_detalle_temporal", new Object[] {_map,_cantidad}));}
anywheresoftware.b4a.objects.collections.Map _mapcalculos = null;
String _json = "";
com.jq.pedidos.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
RDebugUtils.currentLine=12124162;
 //BA.debugLineNum = 12124162;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),0,_cantidad,(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax")))),mostCurrent._principal._impuestoincluido /*boolean*/ ,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_tipo':1"+",'f_idproducto':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_cantidad':"+BA.NumberToString(_cantidad)+""+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_diferencia':0"+",'f_porciento_descuento':0"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_tax")))+",'f_imei':"+mostCurrent._main._imei /*String*/ ;
RDebugUtils.currentLine=12124179;
 //BA.debugLineNum = 12124179;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=12124180;
 //BA.debugLineNum = 12124180;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",reporteordenes.getObject());
RDebugUtils.currentLine=12124181;
 //BA.debugLineNum = 12124181;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal2","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=12124183;
 //BA.debugLineNum = 12124183;BA.debugLine="End Sub";
return "";
}
public static String  _listviewordenes_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewordenes_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewordenes_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
String _json = "";
com.jq.pedidos.httpjob _buscarproducto = null;
RDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub ListViewOrdenes_ItemClick (Position As Int, Va";
RDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="mapa = Value";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=11796487;
 //BA.debugLineNum = 11796487;BA.debugLine="Dim json As String = \"'f_idrecord':\"&mapa.Get(\"f_";
_json = "'f_idrecord':"+BA.ObjectToString(_mapa.Get((Object)("f_idrecord")));
RDebugUtils.currentLine=11796489;
 //BA.debugLineNum = 11796489;BA.debugLine="Dim BuscarProducto As HttpJob";
_buscarproducto = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=11796490;
 //BA.debugLineNum = 11796490;BA.debugLine="BuscarProducto.Initialize(\"BuscarProducto\",Me)";
_buscarproducto._initialize /*String*/ (null,processBA,"BuscarProducto",reporteordenes.getObject());
RDebugUtils.currentLine=11796492;
 //BA.debugLineNum = 11796492;BA.debugLine="numOrden = mapa.Get(\"f_numero\")";
_numorden = BA.ObjectToString(_mapa.Get((Object)("f_numero")));
RDebugUtils.currentLine=11796493;
 //BA.debugLineNum = 11796493;BA.debugLine="listaAddAll.Initialize";
_listaaddall.Initialize();
RDebugUtils.currentLine=11796495;
 //BA.debugLineNum = 11796495;BA.debugLine="BuscarProducto.PostString(Main.url&\"puntoventa/bu";
_buscarproducto._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/buscar_productos_by_orden","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=11796498;
 //BA.debugLineNum = 11796498;BA.debugLine="End Sub";
return "";
}
public static String  _listviewordenes_itemlongclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="reporteordenes";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewordenes_itemlongclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewordenes_itemlongclick", new Object[] {_position,_value}));}
int _r = 0;
anywheresoftware.b4a.objects.collections.Map _map = null;
String _json = "";
com.jq.pedidos.httpjob _jobeliminar = null;
RDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub ListViewOrdenes_ItemLongClick (Position As Int";
RDebugUtils.currentLine=11862020;
 //BA.debugLineNum = 11862020;BA.debugLine="Dim r As Int =  Msgbox2(\"Seguro que desea elimina";
_r = anywheresoftware.b4a.keywords.Common.Msgbox2(BA.ObjectToCharSequence("Seguro que desea eliminar esta orden?"),BA.ObjectToCharSequence("Confirmación"),"Si","","Volver",(android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.Null),mostCurrent.activityBA);
RDebugUtils.currentLine=11862022;
 //BA.debugLineNum = 11862022;BA.debugLine="If r = DialogResponse.POSITIVE Then";
if (_r==anywheresoftware.b4a.keywords.Common.DialogResponse.POSITIVE) { 
RDebugUtils.currentLine=11862023;
 //BA.debugLineNum = 11862023;BA.debugLine="Dim map As Map = Value";
_map = new anywheresoftware.b4a.objects.collections.Map();
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=11862027;
 //BA.debugLineNum = 11862027;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=11862028;
 //BA.debugLineNum = 11862028;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
_json = "'f_idrecord':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_idempresa':"+BA.ObjectToString(_map.Get((Object)("f_idempresa")));
RDebugUtils.currentLine=11862030;
 //BA.debugLineNum = 11862030;BA.debugLine="Dim JobEliminar As HttpJob";
_jobeliminar = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=11862031;
 //BA.debugLineNum = 11862031;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
_jobeliminar._initialize /*String*/ (null,processBA,"JobEliminar",reporteordenes.getObject());
RDebugUtils.currentLine=11862032;
 //BA.debugLineNum = 11862032;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
_jobeliminar._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/set_eliminar_orden","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 };
RDebugUtils.currentLine=11862036;
 //BA.debugLineNum = 11862036;BA.debugLine="End Sub";
return "";
}
}