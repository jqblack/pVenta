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

public class categoria extends Activity implements B4AActivity{
	public static categoria mostCurrent;
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
			processBA = new anywheresoftware.b4a.ShellBA(this.getApplicationContext(), null, null, "com.jq.pedidos", "com.jq.pedidos.categoria");
			processBA.loadHtSubs(this.getClass());
	        float deviceScale = getApplicationContext().getResources().getDisplayMetrics().density;
	        BALayout.setDeviceScale(deviceScale);
            
		}
		else if (previousOne != null) {
			Activity p = previousOne.get();
			if (p != null && p != this) {
                BA.LogInfo("Killing previous instance (categoria).");
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
		activityBA = new BA(this, layout, processBA, "com.jq.pedidos", "com.jq.pedidos.categoria");
        
        processBA.sharedProcessBA.activityBA = new java.lang.ref.WeakReference<BA>(activityBA);
        anywheresoftware.b4a.objects.ViewWrapper.lastId = 0;
        _activity = new ActivityWrapper(activityBA, "activity");
        anywheresoftware.b4a.Msgbox.isDismissing = false;
        if (BA.isShellModeRuntimeCheck(processBA)) {
			if (isFirst)
				processBA.raiseEvent2(null, true, "SHELL", false);
			processBA.raiseEvent2(null, true, "CREATE", true, "com.jq.pedidos.categoria", processBA, activityBA, _activity, anywheresoftware.b4a.keywords.Common.Density, mostCurrent);
			_activity.reinitializeForShell(activityBA, "activity");
		}
        initializeProcessGlobals();		
        initializeGlobals();
        
        BA.LogInfo("** Activity (categoria) Create, isFirst = " + isFirst + " **");
        processBA.raiseEvent2(null, true, "activity_create", false, isFirst);
		isFirst = false;
		if (this != mostCurrent)
			return;
        processBA.setActivityPaused(false);
        BA.LogInfo("** Activity (categoria) Resume **");
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
		return categoria.class;
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
        BA.LogInfo("** Activity (categoria) Pause, UserClosed = " + activityBA.activity.isFinishing() + " **");
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
            categoria mc = mostCurrent;
			if (mc == null || mc != activity.get())
				return;
			processBA.setActivityPaused(false);
            BA.LogInfo("** Activity (categoria) Resume **");
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
public static anywheresoftware.b4a.objects.collections.List _listacategoria = null;
public static anywheresoftware.b4a.objects.collections.Map _mapadetalle = null;
public anywheresoftware.b4a.objects.ListViewWrapper _listviewslidecategorias = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackslidecategoria = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondoproductosbycategorias = null;
public anywheresoftware.b4a.objects.LabelWrapper _label1 = null;
public anywheresoftware.b4a.objects.ButtonWrapper _btnbackprobycat = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondoslidecategorias = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelscroll = null;
public anywheresoftware.b4a.objects.ScrollViewWrapper _scrollviewprobycat = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelfondodetalles = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _imageviewdetalles = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcantidad = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnombeencabezado = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprecio = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblprecioencabezado = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblcantidadproductos = null;
public b4a.example.dateutils _dateutils = null;
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public static String  _activity_create(boolean _firsttime) throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_create", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_create", new Object[] {_firsttime}));}
com.jq.pedidos.httpjob _jobcategoria = null;
RDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub Activity_Create(FirstTime As Boolean)";
RDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="Activity.LoadLayout(\"frmCategoria\")";
mostCurrent._activity.LoadLayout("frmCategoria",mostCurrent.activityBA);
RDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.ItemHei";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().setItemHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (10),mostCurrent.activityBA));
RDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.T";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().Label.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Black);
RDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.T";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().Label.setTextSize((float) (15));
RDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.T";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().Label.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.Label.P";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().Label.setPadding(new int[]{anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (30)),(int) (0),(int) (0),(int) (0)});
RDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.SecondL";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().SecondLabel.setTextColor(anywheresoftware.b4a.keywords.Common.Colors.Gray);
RDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.SecondL";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().SecondLabel.setTypeface(anywheresoftware.b4a.keywords.Common.Typeface.LoadFromAssets("Roboto-Light.ttf"));
RDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="ListViewSlideCategorias.TwoLinesAndBitmap.SecondL";
mostCurrent._listviewslidecategorias.getTwoLinesAndBitmap().SecondLabel.setHeight((int) (-1));
RDebugUtils.currentLine=13631502;
 //BA.debugLineNum = 13631502;BA.debugLine="funcion.SetDivider(ListViewSlideCategorias,Colors";
mostCurrent._funcion._setdivider /*String*/ (mostCurrent.activityBA,mostCurrent._listviewslidecategorias,anywheresoftware.b4a.keywords.Common.Colors.LightGray,anywheresoftware.b4a.keywords.Common.DipToCurrent((int) (1)));
RDebugUtils.currentLine=13631504;
 //BA.debugLineNum = 13631504;BA.debugLine="If listaCategoria.IsInitialized Then";
if (_listacategoria.IsInitialized()) { 
RDebugUtils.currentLine=13631506;
 //BA.debugLineNum = 13631506;BA.debugLine="If listaCategoria.Size <> 0 Then";
if (_listacategoria.getSize()!=0) { 
RDebugUtils.currentLine=13631508;
 //BA.debugLineNum = 13631508;BA.debugLine="cargarListaCategorias";
_cargarlistacategorias();
 }else {
RDebugUtils.currentLine=13631512;
 //BA.debugLineNum = 13631512;BA.debugLine="Dim jobCategoria As HttpJob";
_jobcategoria = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=13631513;
 //BA.debugLineNum = 13631513;BA.debugLine="jobCategoria.Initialize(\"jobCategorias\",Me)";
_jobcategoria._initialize /*String*/ (null,processBA,"jobCategorias",categoria.getObject());
RDebugUtils.currentLine=13631514;
 //BA.debugLineNum = 13631514;BA.debugLine="jobCategoria.PostString(Main.url&\"/puntoventa/s";
_jobcategoria._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"/puntoventa/searchcategorias","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,""));
 };
 }else {
RDebugUtils.currentLine=13631520;
 //BA.debugLineNum = 13631520;BA.debugLine="Dim jobCategoria As HttpJob";
_jobcategoria = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=13631521;
 //BA.debugLineNum = 13631521;BA.debugLine="jobCategoria.Initialize(\"jobCategorias\",Me)";
_jobcategoria._initialize /*String*/ (null,processBA,"jobCategorias",categoria.getObject());
RDebugUtils.currentLine=13631522;
 //BA.debugLineNum = 13631522;BA.debugLine="jobCategoria.PostString(Main.url&\"/puntoventa/se";
_jobcategoria._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"/puntoventa/searchcategorias","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,""));
 };
RDebugUtils.currentLine=13631526;
 //BA.debugLineNum = 13631526;BA.debugLine="End Sub";
return "";
}
public static String  _cargarlistacategorias() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "cargarlistacategorias", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "cargarlistacategorias", null));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapalist = null;
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub cargarListaCategorias";
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=13959172;
 //BA.debugLineNum = 13959172;BA.debugLine="For i = 0 To listaCategoria.Size-1";
{
final int step2 = 1;
final int limit2 = (int) (_listacategoria.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
RDebugUtils.currentLine=13959174;
 //BA.debugLineNum = 13959174;BA.debugLine="Dim mapalist As Map";
_mapalist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13959175;
 //BA.debugLineNum = 13959175;BA.debugLine="mapalist = listaCategoria.Get(i)";
_mapalist.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_listacategoria.Get(_i)));
RDebugUtils.currentLine=13959177;
 //BA.debugLineNum = 13959177;BA.debugLine="If  mapalist.Get(\"f_fotoCategoria\")<> Null And";
if (_mapalist.Get((Object)("f_fotoCategoria"))!= null && (_mapalist.Get((Object)("f_fotoCategoria"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=13959178;
 //BA.debugLineNum = 13959178;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_fotoCate";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapalist.Get((Object)("f_fotoCategoria"))));
 }else {
RDebugUtils.currentLine=13959180;
 //BA.debugLineNum = 13959180;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 };
RDebugUtils.currentLine=13959183;
 //BA.debugLineNum = 13959183;BA.debugLine="ListViewSlideCategorias.AddTwoLinesAndBitmap2(ma";
mostCurrent._listviewslidecategorias.AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_mapalist.Get((Object)("nombrecategoria"))),BA.ObjectToCharSequence("Cantidad de Productos: "+BA.ObjectToString(_mapalist.Get((Object)("cantproductos")))),_bm.getBitmap(),(Object)(_mapalist.getObject()));
 }
};
RDebugUtils.currentLine=13959187;
 //BA.debugLineNum = 13959187;BA.debugLine="End Sub";
return "";
}
public static String  _activity_pause(boolean _userclosed) throws Exception{
RDebugUtils.currentModule="categoria";
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub Activity_Pause (UserClosed As Boolean)";
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="End Sub";
return "";
}
public static String  _activity_resume() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "activity_resume", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "activity_resume", null));}
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub Activity_Resume";
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="End Sub";
return "";
}
public static String  _btnaddpro_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnaddpro_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnaddpro_click", null));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.ButtonWrapper _b = null;
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub btnAddPro_Click";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Dim b As Button";
_b = new anywheresoftware.b4a.objects.ButtonWrapper();
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="b.Initialize(\"\")";
_b.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14286854;
 //BA.debugLineNum = 14286854;BA.debugLine="b = Sender";
_b.setObject((android.widget.Button)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=14286856;
 //BA.debugLineNum = 14286856;BA.debugLine="mapa = b.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=14286858;
 //BA.debugLineNum = 14286858;BA.debugLine="mapadetalle.Initialize";
_mapadetalle.Initialize();
RDebugUtils.currentLine=14286860;
 //BA.debugLineNum = 14286860;BA.debugLine="salvar_detalle_temporal(mapa,1)";
_salvar_detalle_temporal(_mapa,(int) (1));
RDebugUtils.currentLine=14286861;
 //BA.debugLineNum = 14286861;BA.debugLine="End Sub";
return "";
}
public static String  _salvar_detalle_temporal(anywheresoftware.b4a.objects.collections.Map _map,int _cantidad) throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "salvar_detalle_temporal", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "salvar_detalle_temporal", new Object[] {_map,_cantidad}));}
anywheresoftware.b4a.objects.collections.Map _mapcalculos = null;
String _json = "";
com.jq.pedidos.httpjob _jobdetalletemporal = null;
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = new anywheresoftware.b4a.objects.collections.Map();
_mapcalculos = mostCurrent._funcion._recalcular /*anywheresoftware.b4a.objects.collections.Map*/ (mostCurrent.activityBA,(double)(BA.ObjectToNumber(_map.Get((Object)("f_precio")))),0,_cantidad,(double)(BA.ObjectToNumber(_map.Get((Object)("f_tax")))),mostCurrent._principal._impuestoincluido /*boolean*/ ,anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = "'f_regresa':false"+",'f_idempresa':"+BA.NumberToString(mostCurrent._principal._idempresa /*int*/ )+",'f_tipo':1"+",'f_idproducto':"+BA.ObjectToString(_map.Get((Object)("f_idrecord")))+",'f_cantidad':"+BA.NumberToString(_cantidad)+""+",'f_tax':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_tax")))+",'f_precio':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_precio_para_mostrar")))+",'f_importe':"+BA.ObjectToString(_mapcalculos.Get((Object)("f_total")))+",'f_descuento':0"+",'f_diferencia':0"+",'f_porciento_descuento':0"+",'f_porciento_tax':"+BA.ObjectToString(_map.Get((Object)("f_tax")));
RDebugUtils.currentLine=14221330;
 //BA.debugLineNum = 14221330;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=14221331;
 //BA.debugLineNum = 14221331;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
_jobdetalletemporal._initialize /*String*/ (null,processBA,"JobDetalleTemporal",categoria.getObject());
RDebugUtils.currentLine=14221332;
 //BA.debugLineNum = 14221332;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
_jobdetalletemporal._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/salvar_detalle_temporal","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
RDebugUtils.currentLine=14221334;
 //BA.debugLineNum = 14221334;BA.debugLine="End Sub";
return "";
}
public static void  _btnagregarcarritodetalle_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnagregarcarritodetalle_click", false))
	 {Debug.delegate(mostCurrent.activityBA, "btnagregarcarritodetalle_click", null); return;}
ResumableSub_btnagregarCarritoDetalle_Click rsub = new ResumableSub_btnagregarCarritoDetalle_Click(null);
rsub.resume(processBA, null);
}
public static class ResumableSub_btnagregarCarritoDetalle_Click extends BA.ResumableSub {
public ResumableSub_btnagregarCarritoDetalle_Click(com.jq.pedidos.categoria parent) {
this.parent = parent;
}
com.jq.pedidos.categoria parent;

@Override
public void resume(BA ba, Object[] result) throws Exception{
RDebugUtils.currentModule="categoria";

    while (true) {
        switch (state) {
            case -1:
return;

case 0:
//C
this.state = 1;
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="If lblcantidad.Text < 1 Then";
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
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="Msgbox(\"Si va ha agregar este producto debe sele";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Si va ha agregar este producto debe seleccionar por lo menos una unidad"),BA.ObjectToCharSequence(""),mostCurrent.activityBA);
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 4:
//C
this.state = -1;
;
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="salvar_detalle_temporal(mapadetalle,lblcantidad.T";
_salvar_detalle_temporal(parent._mapadetalle,(int)(Double.parseDouble(parent.mostCurrent._lblcantidad.getText())));
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="Sleep(200)";
anywheresoftware.b4a.keywords.Common.Sleep(mostCurrent.activityBA,new anywheresoftware.b4a.shell.DebugResumableSub.DelegatableResumableSub(this, "categoria", "btnagregarcarritodetalle_click"),(int) (200));
this.state = 5;
return;
case 5:
//C
this.state = -1;
;
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="btnBackDetalles_Click";
_btnbackdetalles_click();
RDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
}
public static String  _btnbackdetalles_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackdetalles_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackdetalles_click", null));}
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub btnBackDetalles_Click";
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(250,False)";
mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
mostCurrent._panelfondoproductosbycategorias.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackprobycat_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackprobycat_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackprobycat_click", null));}
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub btnbackprobycat_Click";
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
mostCurrent._panelfondoproductosbycategorias.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14155779;
 //BA.debugLineNum = 14155779;BA.debugLine="PanelFondoSlideCategorias.SetVisibleAnimated(250,";
mostCurrent._panelfondoslidecategorias.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="End Sub";
return "";
}
public static String  _btnbackslidecategoria_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnbackslidecategoria_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnbackslidecategoria_click", null));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Sub btnBackSlideCategoria_Click";
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="Activity.Finish";
mostCurrent._activity.Finish();
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="Principal.keyotraparte = False";
mostCurrent._principal._keyotraparte /*boolean*/  = anywheresoftware.b4a.keywords.Common.False;
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="StartActivity(Principal)";
anywheresoftware.b4a.keywords.Common.StartActivity(processBA,(Object)(mostCurrent._principal.getObject()));
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="End Sub";
return "";
}
public static String  _btnless_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnless_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnless_click", null));}
int _num = 0;
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub btnless_Click";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="Dim num As Int = lblcantidad.Text";
_num = (int)(Double.parseDouble(mostCurrent._lblcantidad.getText()));
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="lblcantidad.Text = num - 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(_num-1));
RDebugUtils.currentLine=14548996;
 //BA.debugLineNum = 14548996;BA.debugLine="End Sub";
return "";
}
public static String  _btnmore_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "btnmore_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "btnmore_click", null));}
int _num = 0;
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub btnMore_Click";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="Dim num As Int = lblcantidad.Text";
_num = (int)(Double.parseDouble(mostCurrent._lblcantidad.getText()));
RDebugUtils.currentLine=14483459;
 //BA.debugLineNum = 14483459;BA.debugLine="lblcantidad.Text = num + 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(_num+1));
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="End Sub";
return "";
}
public static String  _clearscrollview(anywheresoftware.b4a.objects.ScrollViewWrapper _sv) throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "clearscrollview", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "clearscrollview", new Object[] {_sv}));}
int _i = 0;
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub ClearScrollView(sv As ScrollView)";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_sv.getPanel().getNumberOfViews()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="sv.Panel.GetView(i).RemoveView";
_sv.getPanel().GetView(_i).RemoveView();
 }
};
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="End Sub";
return "";
}
public static String  _imgfav_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "imgfav_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "imgfav_click", null));}
anywheresoftware.b4a.objects.ImageViewWrapper _img = null;
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
String _json = "";
com.jq.pedidos.httpjob _deletefavoritos = null;
com.jq.pedidos.httpjob _putfavoritos = null;
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub imgFav_Click";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Dim img As ImageView";
_img = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="img.Initialize(\"\")";
_img.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14417923;
 //BA.debugLineNum = 14417923;BA.debugLine="img = Sender";
_img.setObject((android.widget.ImageView)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=14417925;
 //BA.debugLineNum = 14417925;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14417926;
 //BA.debugLineNum = 14417926;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=14417928;
 //BA.debugLineNum = 14417928;BA.debugLine="mapa = img.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_img.getTag()));
RDebugUtils.currentLine=14417930;
 //BA.debugLineNum = 14417930;BA.debugLine="If Main.logged Then";
if (mostCurrent._main._logged /*boolean*/ ) { 
RDebugUtils.currentLine=14417932;
 //BA.debugLineNum = 14417932;BA.debugLine="Dim bm As  BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=14417934;
 //BA.debugLineNum = 14417934;BA.debugLine="If mapa.Get(\"f_red\") Then";
if (BA.ObjectToBoolean(_mapa.Get((Object)("f_red")))) { 
RDebugUtils.currentLine=14417936;
 //BA.debugLineNum = 14417936;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartW";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartWhiteandBlack.png").getObject()));
RDebugUtils.currentLine=14417937;
 //BA.debugLineNum = 14417937;BA.debugLine="img.Background = bm";
_img.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=14417938;
 //BA.debugLineNum = 14417938;BA.debugLine="mapa.Put(\"f_red\",False)";
_mapa.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.False));
RDebugUtils.currentLine=14417940;
 //BA.debugLineNum = 14417940;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapa.Get((Object)("f_idproducto")));
RDebugUtils.currentLine=14417943;
 //BA.debugLineNum = 14417943;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=14417944;
 //BA.debugLineNum = 14417944;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me";
_deletefavoritos._initialize /*String*/ (null,processBA,"deleteFavoritos",categoria.getObject());
RDebugUtils.currentLine=14417945;
 //BA.debugLineNum = 14417945;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoventa";
_deletefavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/deletefav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 }else {
RDebugUtils.currentLine=14417950;
 //BA.debugLineNum = 14417950;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"heartR";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"heartRed.png").getObject()));
RDebugUtils.currentLine=14417951;
 //BA.debugLineNum = 14417951;BA.debugLine="img.Background = bm";
_img.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
RDebugUtils.currentLine=14417952;
 //BA.debugLineNum = 14417952;BA.debugLine="mapa.Put(\"f_red\",True)";
_mapa.Put((Object)("f_red"),(Object)(anywheresoftware.b4a.keywords.Common.True));
RDebugUtils.currentLine=14417954;
 //BA.debugLineNum = 14417954;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.user";
_json = "'f_idusuario':"+BA.NumberToString(mostCurrent._main._usersdata /*com.jq.pedidos.main._typeu*/ .idUsuario /*int*/ )+",'f_idproducto':"+BA.ObjectToString(_mapa.Get((Object)("f_idproducto")));
RDebugUtils.currentLine=14417957;
 //BA.debugLineNum = 14417957;BA.debugLine="Dim putFavoritos As HttpJob";
_putfavoritos = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=14417958;
 //BA.debugLineNum = 14417958;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
_putfavoritos._initialize /*String*/ (null,processBA,"addFavoritos",categoria.getObject());
RDebugUtils.currentLine=14417959;
 //BA.debugLineNum = 14417959;BA.debugLine="putFavoritos.PostString(Main.url&\"puntoventa/ad";
_putfavoritos._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"puntoventa/addfav","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._token /*String*/ ,_json));
 };
 }else {
RDebugUtils.currentLine=14417965;
 //BA.debugLineNum = 14417965;BA.debugLine="ToastMessageShow(\"Primero debe inicar sesión\",F";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Primero debe inicar sesión"),anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=14417969;
 //BA.debugLineNum = 14417969;BA.debugLine="End Sub";
return "";
}
public static String  _jobdone(com.jq.pedidos.httpjob _job) throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "jobdone", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "jobdone", new Object[] {_job}));}
anywheresoftware.b4a.objects.collections.Map _map = null;
anywheresoftware.b4a.objects.collections.List _list = null;
anywheresoftware.b4a.objects.collections.JSONParser _json = null;
int _tam = 0;
int _alttop = 0;
int _i = 0;
anywheresoftware.b4a.objects.collections.Map _mapalist = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
int _lefpro = 0;
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub JobDone(Job As HttpJob)";
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if (mostCurrent._funcion._verificarjob /*boolean*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null))==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13893638;
 //BA.debugLineNum = 13893638;BA.debugLine="Dim map As Map";
_map = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13893639;
 //BA.debugLineNum = 13893639;BA.debugLine="Dim list As List";
_list = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=13893640;
 //BA.debugLineNum = 13893640;BA.debugLine="Dim json As JSONParser";
_json = new anywheresoftware.b4a.objects.collections.JSONParser();
RDebugUtils.currentLine=13893641;
 //BA.debugLineNum = 13893641;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
_json.Initialize(mostCurrent._funcion._base64_decode /*String*/ (mostCurrent.activityBA,_job._getstring /*String*/ (null)));
RDebugUtils.currentLine=13893642;
 //BA.debugLineNum = 13893642;BA.debugLine="map = json.NextObject";
_map = _json.NextObject();
RDebugUtils.currentLine=13893645;
 //BA.debugLineNum = 13893645;BA.debugLine="Select Job.JobName";
switch (BA.switchObjectToInt(_job._jobname /*String*/ ,"jobCategorias","ProductosByCategoria","JobDetalleTemporal")) {
case 0: {
RDebugUtils.currentLine=13893649;
 //BA.debugLineNum = 13893649;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=13893650;
 //BA.debugLineNum = 13893650;BA.debugLine="listaCategoria = list";
_listacategoria = _list;
RDebugUtils.currentLine=13893652;
 //BA.debugLineNum = 13893652;BA.debugLine="cargarListaCategorias";
_cargarlistacategorias();
 break; }
case 1: {
RDebugUtils.currentLine=13893657;
 //BA.debugLineNum = 13893657;BA.debugLine="list = map.Get(\"f_data\")";
_list.setObject((java.util.List)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=13893659;
 //BA.debugLineNum = 13893659;BA.debugLine="If list.Size <= 0 Then";
if (_list.getSize()<=0) { 
RDebugUtils.currentLine=13893660;
 //BA.debugLineNum = 13893660;BA.debugLine="Msgbox(\"Esta categoría todavía no tiene produc";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Esta categoría todavía no tiene productos"),BA.ObjectToCharSequence("Aviso"),mostCurrent.activityBA);
 };
RDebugUtils.currentLine=13893663;
 //BA.debugLineNum = 13893663;BA.debugLine="Dim tam As Int = list.Size";
_tam = _list.getSize();
RDebugUtils.currentLine=13893665;
 //BA.debugLineNum = 13893665;BA.debugLine="Dim alttop As Int = 2%y";
_alttop = anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=13893667;
 //BA.debugLineNum = 13893667;BA.debugLine="ScrollViewProByCat.Panel.Height = 100%y";
mostCurrent._scrollviewprobycat.getPanel().setHeight(anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (100),mostCurrent.activityBA));
RDebugUtils.currentLine=13893669;
 //BA.debugLineNum = 13893669;BA.debugLine="For i=0 To list.Size-1";
{
final int step22 = 1;
final int limit22 = (int) (_list.getSize()-1);
_i = (int) (0) ;
for (;_i <= limit22 ;_i = _i + step22 ) {
RDebugUtils.currentLine=13893670;
 //BA.debugLineNum = 13893670;BA.debugLine="Dim mapalist As Map";
_mapalist = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13893671;
 //BA.debugLineNum = 13893671;BA.debugLine="mapalist = list.Get(i)";
_mapalist.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_list.Get(_i)));
RDebugUtils.currentLine=13893673;
 //BA.debugLineNum = 13893673;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=13893675;
 //BA.debugLineNum = 13893675;BA.debugLine="If mapalist.Get(\"f_foto\") <> Null And mapalist";
if (_mapalist.Get((Object)("f_foto"))!= null && (_mapalist.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=13893676;
 //BA.debugLineNum = 13893676;BA.debugLine="bm = funcion.getImagen(mapalist.Get(\"f_foto\")";
_bm = mostCurrent._funcion._getimagen /*anywheresoftware.b4a.objects.drawable.BitmapDrawable*/ (mostCurrent.activityBA,BA.ObjectToString(_mapalist.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=13893679;
 //BA.debugLineNum = 13893679;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-i";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
 };
RDebugUtils.currentLine=13893684;
 //BA.debugLineNum = 13893684;BA.debugLine="Dim lefpro As Int = 2%x";
_lefpro = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=13893686;
 //BA.debugLineNum = 13893686;BA.debugLine="If i Mod 2 == 0 Then";
if (_i%2==0) { 
RDebugUtils.currentLine=13893688;
 //BA.debugLineNum = 13893688;BA.debugLine="lefpro = 2%x";
_lefpro = anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (2),mostCurrent.activityBA);
RDebugUtils.currentLine=13893689;
 //BA.debugLineNum = 13893689;BA.debugLine="ScrollViewProByCat.Panel.AddView(funcion.crea";
mostCurrent._scrollviewprobycat.getPanel().AddView((android.view.View)(mostCurrent._funcion._createpanelproductoscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_mapalist,_bm).getObject()),_lefpro,_alttop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
RDebugUtils.currentLine=13893691;
 //BA.debugLineNum = 13893691;BA.debugLine="If i == list.Size-1 Then";
if (_i==_list.getSize()-1) { 
RDebugUtils.currentLine=13893692;
 //BA.debugLineNum = 13893692;BA.debugLine="alttop = alttop+37%y";
_alttop = (int) (_alttop+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (37),mostCurrent.activityBA));
 };
 }else {
RDebugUtils.currentLine=13893697;
 //BA.debugLineNum = 13893697;BA.debugLine="lefpro = lefpro + 47%x";
_lefpro = (int) (_lefpro+anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (47),mostCurrent.activityBA));
RDebugUtils.currentLine=13893698;
 //BA.debugLineNum = 13893698;BA.debugLine="ScrollViewProByCat.Panel.AddView(funcion.crea";
mostCurrent._scrollviewprobycat.getPanel().AddView((android.view.View)(mostCurrent._funcion._createpanelproductoscroll /*anywheresoftware.b4a.objects.PanelWrapper*/ (mostCurrent.activityBA,_mapalist,_bm).getObject()),_lefpro,_alttop,anywheresoftware.b4a.keywords.Common.PerXToCurrent((float) (46),mostCurrent.activityBA),anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (36),mostCurrent.activityBA));
RDebugUtils.currentLine=13893699;
 //BA.debugLineNum = 13893699;BA.debugLine="alttop = alttop+37%y";
_alttop = (int) (_alttop+anywheresoftware.b4a.keywords.Common.PerYToCurrent((float) (37),mostCurrent.activityBA));
 };
 }
};
RDebugUtils.currentLine=13893704;
 //BA.debugLineNum = 13893704;BA.debugLine="ScrollViewProByCat.Panel.Height = alttop";
mostCurrent._scrollviewprobycat.getPanel().setHeight(_alttop);
 break; }
case 2: {
RDebugUtils.currentLine=13893707;
 //BA.debugLineNum = 13893707;BA.debugLine="map = map.Get(\"f_data\")";
_map.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_map.Get((Object)("f_data"))));
RDebugUtils.currentLine=13893708;
 //BA.debugLineNum = 13893708;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ((_map.Get((Object)("f_paso"))).equals((Object)("0"))) { 
RDebugUtils.currentLine=13893709;
 //BA.debugLineNum = 13893709;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
anywheresoftware.b4a.keywords.Common.Msgbox(BA.ObjectToCharSequence("Este producto no tiene existencia: "+anywheresoftware.b4a.keywords.Common.CRLF+BA.ObjectToString(_job._tag /*Object*/ )+"."),BA.ObjectToCharSequence("Información"),mostCurrent.activityBA);
RDebugUtils.currentLine=13893710;
 //BA.debugLineNum = 13893710;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=13893712;
 //BA.debugLineNum = 13893712;BA.debugLine="Principal.cantidadProduto = Principal.cantidadP";
mostCurrent._principal._cantidadproduto /*int*/  = (int) (mostCurrent._principal._cantidadproduto /*int*/ +1);
RDebugUtils.currentLine=13893714;
 //BA.debugLineNum = 13893714;BA.debugLine="ToastMessageShow(\"Producto agregado al carrito.";
anywheresoftware.b4a.keywords.Common.ToastMessageShow(BA.ObjectToCharSequence("Producto agregado al carrito."),anywheresoftware.b4a.keywords.Common.False);
 break; }
}
;
RDebugUtils.currentLine=13893718;
 //BA.debugLineNum = 13893718;BA.debugLine="End Sub";
return "";
}
public static String  _listviewslidecategorias_itemclick(int _position,Object _value) throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "listviewslidecategorias_itemclick", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "listviewslidecategorias_itemclick", new Object[] {_position,_value}));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
String _json = "";
com.jq.pedidos.httpjob _jobbusqueda = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub ListViewSlideCategorias_ItemClick (Position As";
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="mapa = Value";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_value));
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="json = \"'f_idcategoria':\"&mapa.Get(\"idcategoria\")";
_json = "'f_idcategoria':"+BA.ObjectToString(_mapa.Get((Object)("idcategoria")));
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="Dim jobBusqueda As HttpJob";
_jobbusqueda = new com.jq.pedidos.httpjob();
RDebugUtils.currentLine=14024713;
 //BA.debugLineNum = 14024713;BA.debugLine="jobBusqueda.Initialize(\"ProductosByCategoria\",Me)";
_jobbusqueda._initialize /*String*/ (null,processBA,"ProductosByCategoria",categoria.getObject());
RDebugUtils.currentLine=14024718;
 //BA.debugLineNum = 14024718;BA.debugLine="If PanelFondoProductosbycategorias.IsInitialized";
if (mostCurrent._panelfondoproductosbycategorias.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=14024719;
 //BA.debugLineNum = 14024719;BA.debugLine="Activity.LoadLayout(\"frmProductosByCatgoria\")";
mostCurrent._activity.LoadLayout("frmProductosByCatgoria",mostCurrent.activityBA);
RDebugUtils.currentLine=14024720;
 //BA.debugLineNum = 14024720;BA.debugLine="PanelFondoProductosbycategorias.Visible = False";
mostCurrent._panelfondoproductosbycategorias.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=14024722;
 //BA.debugLineNum = 14024722;BA.debugLine="ClearScrollView(ScrollViewProByCat)";
_clearscrollview(mostCurrent._scrollviewprobycat);
RDebugUtils.currentLine=14024723;
 //BA.debugLineNum = 14024723;BA.debugLine="Label1.Text = mapa.Get(\"nombrecategoria\")";
mostCurrent._label1.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("nombrecategoria"))));
RDebugUtils.currentLine=14024724;
 //BA.debugLineNum = 14024724;BA.debugLine="PanelFondoSlideCategorias.SetVisibleAnimated(250,";
mostCurrent._panelfondoslidecategorias.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14024725;
 //BA.debugLineNum = 14024725;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
mostCurrent._panelfondoproductosbycategorias.SetVisibleAnimated((int) (250),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14024726;
 //BA.debugLineNum = 14024726;BA.debugLine="jobBusqueda.PostString(Main.url&\"/puntoventa/prod";
_jobbusqueda._poststring /*String*/ (null,mostCurrent._main._url /*String*/ +"/puntoventa/productosbycat","json="+mostCurrent._funcion._crearjson /*String*/ (mostCurrent.activityBA,mostCurrent._main._tokenpublico /*String*/ ,_json));
RDebugUtils.currentLine=14024728;
 //BA.debugLineNum = 14024728;BA.debugLine="End Sub";
return "";
}
public static String  _panelfondopro_click() throws Exception{
RDebugUtils.currentModule="categoria";
if (Debug.shouldDelegate(mostCurrent.activityBA, "panelfondopro_click", false))
	 {return ((String) Debug.delegate(mostCurrent.activityBA, "panelfondopro_click", null));}
anywheresoftware.b4a.objects.collections.Map _mapa = null;
anywheresoftware.b4a.objects.PanelWrapper _b = null;
anywheresoftware.b4a.objects.drawable.BitmapDrawable _bm = null;
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub PanelFondoPro_Click";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="Dim mapa As Map";
_mapa = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="mapa.Initialize";
_mapa.Initialize();
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Dim b As Panel";
_b = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="b.Initialize(\"\")";
_b.Initialize(mostCurrent.activityBA,"");
RDebugUtils.currentLine=14352390;
 //BA.debugLineNum = 14352390;BA.debugLine="b = Sender";
_b.setObject((android.view.ViewGroup)(anywheresoftware.b4a.keywords.Common.Sender(mostCurrent.activityBA)));
RDebugUtils.currentLine=14352392;
 //BA.debugLineNum = 14352392;BA.debugLine="mapa = b.Tag";
_mapa.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_b.getTag()));
RDebugUtils.currentLine=14352393;
 //BA.debugLineNum = 14352393;BA.debugLine="mapadetalle = mapa";
_mapadetalle = _mapa;
RDebugUtils.currentLine=14352396;
 //BA.debugLineNum = 14352396;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if (mostCurrent._panelfondodetalles.IsInitialized()==anywheresoftware.b4a.keywords.Common.False) { 
RDebugUtils.currentLine=14352397;
 //BA.debugLineNum = 14352397;BA.debugLine="Activity.LoadLayout(\"frmDetallesProducto\")";
mostCurrent._activity.LoadLayout("frmDetallesProducto",mostCurrent.activityBA);
RDebugUtils.currentLine=14352398;
 //BA.debugLineNum = 14352398;BA.debugLine="PanelFondoDetalles.Visible = False";
mostCurrent._panelfondodetalles.setVisible(anywheresoftware.b4a.keywords.Common.False);
 };
RDebugUtils.currentLine=14352401;
 //BA.debugLineNum = 14352401;BA.debugLine="Dim bm As BitmapDrawable";
_bm = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=14352402;
 //BA.debugLineNum = 14352402;BA.debugLine="If mapa.ContainsKey(\"f_foto\") Then";
if (_mapa.ContainsKey((Object)("f_foto"))) { 
RDebugUtils.currentLine=14352404;
 //BA.debugLineNum = 14352404;BA.debugLine="If  mapa.Get(\"f_foto\") <> \"\" Then";
if ((_mapa.Get((Object)("f_foto"))).equals((Object)("")) == false) { 
RDebugUtils.currentLine=14352407;
 //BA.debugLineNum = 14352407;BA.debugLine="ImageViewDetalles.Background =  mapa.Get(\"f_fot";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_mapa.Get((Object)("f_foto"))));
 }else {
RDebugUtils.currentLine=14352410;
 //BA.debugLineNum = 14352410;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-ima";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=14352411;
 //BA.debugLineNum = 14352411;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=14352412;
 //BA.debugLineNum = 14352412;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
 };
 }else {
RDebugUtils.currentLine=14352416;
 //BA.debugLineNum = 14352416;BA.debugLine="bm.Initialize(LoadBitmap(File.DirAssets,\"no-imag";
_bm.Initialize((android.graphics.Bitmap)(anywheresoftware.b4a.keywords.Common.LoadBitmap(anywheresoftware.b4a.keywords.Common.File.getDirAssets(),"no-image.jpg").getObject()));
RDebugUtils.currentLine=14352417;
 //BA.debugLineNum = 14352417;BA.debugLine="bm.Gravity = Gravity.FILL";
_bm.setGravity(anywheresoftware.b4a.keywords.Common.Gravity.FILL);
RDebugUtils.currentLine=14352418;
 //BA.debugLineNum = 14352418;BA.debugLine="ImageViewDetalles.Background = bm";
mostCurrent._imageviewdetalles.setBackground((android.graphics.drawable.Drawable)(_bm.getObject()));
 };
RDebugUtils.currentLine=14352421;
 //BA.debugLineNum = 14352421;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
mostCurrent._lblprecioencabezado.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=14352422;
 //BA.debugLineNum = 14352422;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
mostCurrent._lblnombeencabezado.setText(BA.ObjectToCharSequence(_mapa.Get((Object)("f_descripcion"))));
RDebugUtils.currentLine=14352423;
 //BA.debugLineNum = 14352423;BA.debugLine="lblcantidad.Text = 1";
mostCurrent._lblcantidad.setText(BA.ObjectToCharSequence(1));
RDebugUtils.currentLine=14352424;
 //BA.debugLineNum = 14352424;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
mostCurrent._lblprecio.setText(BA.ObjectToCharSequence("$"+anywheresoftware.b4a.keywords.Common.NumberFormat((double)(BA.ObjectToNumber(_mapa.Get((Object)("f_precio")))),(int) (0),(int) (2))));
RDebugUtils.currentLine=14352425;
 //BA.debugLineNum = 14352425;BA.debugLine="PanelFondoProductosbycategorias.SetVisibleAnimate";
mostCurrent._panelfondoproductosbycategorias.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.False);
RDebugUtils.currentLine=14352426;
 //BA.debugLineNum = 14352426;BA.debugLine="PanelFondoDetalles.SetVisibleAnimated(500,True)";
mostCurrent._panelfondodetalles.SetVisibleAnimated((int) (500),anywheresoftware.b4a.keywords.Common.True);
RDebugUtils.currentLine=14352429;
 //BA.debugLineNum = 14352429;BA.debugLine="End Sub";
return "";
}
}