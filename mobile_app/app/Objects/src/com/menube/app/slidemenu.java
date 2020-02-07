package com.menube.app;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class slidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.menube.app.slidemenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.menube.app.slidemenu.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _actionitem{
public boolean IsInitialized;
public String Text;
public anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper Image;
public Object Value;
public void Initialize() {
IsInitialized = true;
Text = "";
Image = new anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper();
Value = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.ImageViewWrapper _view = null;
public anywheresoftware.b4a.objects.LabelWrapper _lblnombre = null;
public anywheresoftware.b4a.objects.PanelWrapper _panelmenu = null;
public anywheresoftware.b4a.objects.PanelWrapper _mslidepanel = null;
public anywheresoftware.b4a.objects.PanelWrapper _mbackpanel = null;
public Object _mmodule = null;
public String _meventname = "";
public anywheresoftware.b4a.objects.ListViewWrapper _mlistview = null;
public anywheresoftware.b4a.objects.AnimationWrapper _minanimation = null;
public anywheresoftware.b4a.objects.AnimationWrapper _moutanimation = null;
public int _backgroundcolor = 0;
public b4a.example.dateutils _dateutils = null;
public com.menube.app.main _main = null;
public com.menube.app.starter _starter = null;
public com.menube.app.principal _principal = null;
public com.menube.app.funcion _funcion = null;
public com.menube.app.facturacion _facturacion = null;
public com.menube.app.direcciones _direcciones = null;
public com.menube.app.reporteordenes _reporteordenes = null;
public com.menube.app.httputils2service _httputils2service = null;
public String  _additem(com.menube.app.slidemenu __ref,String _text,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,Object _returnvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "additem", false))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_text,_image,_returnvalue}));}
com.menube.app.slidemenu._actionitem _item = null;
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Public Sub AddItem(Text As String, Image As Bitmap";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="Dim item As ActionItem";
_item = new com.menube.app.slidemenu._actionitem();
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="item.Text = Text";
_item.Text /*String*/  = _text;
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="item.Image = Image";
_item.Image /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = _image;
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="item.Value = ReturnValue";
_item.Value /*Object*/  = _returnvalue;
RDebugUtils.currentLine=5373961;
 //BA.debugLineNum = 5373961;BA.debugLine="If Not(Image.IsInitialized) Then";
if (__c.Not(_image.IsInitialized())) { 
RDebugUtils.currentLine=5373962;
 //BA.debugLineNum = 5373962;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Null,";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(__c.Null),_returnvalue);
 }else {
RDebugUtils.currentLine=5373966;
 //BA.debugLineNum = 5373966;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Image,";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(_image.getObject()),_returnvalue);
 };
RDebugUtils.currentLine=5373968;
 //BA.debugLineNum = 5373968;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.menube.app.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="Type ActionItem (Text As String, Image As Bitmap,";
;
RDebugUtils.currentLine=5111811;
 //BA.debugLineNum = 5111811;BA.debugLine="Private View As ImageView";
_view = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Private lblnombre As Label";
_lblnombre = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Private panelMenu As Panel";
_panelmenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="Private mSlidePanel As Panel";
_mslidepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="Private mBackPanel As Panel";
_mbackpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=5111818;
 //BA.debugLineNum = 5111818;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=5111819;
 //BA.debugLineNum = 5111819;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=5111821;
 //BA.debugLineNum = 5111821;BA.debugLine="Private mListView As ListView";
_mlistview = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=5111823;
 //BA.debugLineNum = 5111823;BA.debugLine="Private mInAnimation As Animation";
_minanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=5111824;
 //BA.debugLineNum = 5111824;BA.debugLine="Private mOutAnimation As Animation";
_moutanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="Dim backgroundColor As Int : backgroundColor = Co";
_backgroundcolor = 0;
RDebugUtils.currentLine=5111825;
 //BA.debugLineNum = 5111825;BA.debugLine="Dim backgroundColor As Int : backgroundColor = Co";
__ref._backgroundcolor /*int*/  = __c.Colors.RGB((int) (31),(int) (154),(int) (176));
RDebugUtils.currentLine=5111827;
 //BA.debugLineNum = 5111827;BA.debugLine="End Sub";
return "";
}
public String  _hide(com.menube.app.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "hide", false))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="If isVisible = False Then Return";
if (__ref._isvisible /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="mBackPanel.Left = -mBackPanel.Width";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="mSlidePanel.Left = -mSlidePanel.Width";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="mOutAnimation.Start(mSlidePanel)";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .Start((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(com.menube.app.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "isvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isvisible", null));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Public Sub isVisible As Boolean";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="Return mSlidePanel.Visible";
if (true) return __ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="End Sub";
return false;
}
public String  _initialize(com.menube.app.slidemenu __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,int _top,int _width) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_top,_width}));}
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub Initialize(Activity As Activity, Module As Obj";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="mModule = Module";
__ref._mmodule /*Object*/  = _module;
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mSlidePanel");
RDebugUtils.currentLine=5177350;
 //BA.debugLineNum = 5177350;BA.debugLine="mListView.Initialize(\"mListView\")";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"mListView");
RDebugUtils.currentLine=5177351;
 //BA.debugLineNum = 5177351;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().SecondLabel.setVisible(__c.False);
RDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().setItemHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setHeight(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().getItemHeight());
RDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTop((int) (0));
RDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextSize = 16";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextSize((float) (16));
RDebugUtils.currentLine=5177357;
 //BA.debugLineNum = 5177357;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().ImageView.SetLayout(__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=5177360;
 //BA.debugLineNum = 5177360;BA.debugLine="mListView.Color = backgroundColor";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setColor(__ref._backgroundcolor /*int*/ );
RDebugUtils.currentLine=5177361;
 //BA.debugLineNum = 5177361;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Typeface = Type";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTypeface(__c.Typeface.LoadFromAssets("comfortaa-light.ttf"));
RDebugUtils.currentLine=5177363;
 //BA.debugLineNum = 5177363;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextColor=Co";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=5177365;
 //BA.debugLineNum = 5177365;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"",(float) (-_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=5177366;
 //BA.debugLineNum = 5177366;BA.debugLine="mInAnimation.Duration = 200";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=5177367;
 //BA.debugLineNum = 5177367;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"Out",(float) (_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=5177368;
 //BA.debugLineNum = 5177368;BA.debugLine="mOutAnimation.Duration = 200";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=5177370;
 //BA.debugLineNum = 5177370;BA.debugLine="Activity.AddView(mSlidePanel, 0,  Top, Width, 100";
_activity.AddView((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),_top,_width,(int) (__c.PerYToCurrent((float) (100),ba)-_top));
RDebugUtils.currentLine=5177372;
 //BA.debugLineNum = 5177372;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBackPanel");
RDebugUtils.currentLine=5177373;
 //BA.debugLineNum = 5177373;BA.debugLine="mBackPanel.Color = Colors.Transparent";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5177374;
 //BA.debugLineNum = 5177374;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
_activity.AddView((android.view.View)(__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (-__c.PerXToCurrent((float) (100),ba)),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=5177376;
 //BA.debugLineNum = 5177376;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=5177377;
 //BA.debugLineNum = 5177377;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5177378;
 //BA.debugLineNum = 5177378;BA.debugLine="mSlidePanel.Color=Colors.White";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=5177379;
 //BA.debugLineNum = 5177379;BA.debugLine="End Sub";
return "";
}
public String  _initialize2(com.menube.app.slidemenu __ref,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,int _top,int _width,String _image_name) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "initialize2", false))
	 {return ((String) Debug.delegate(ba, "initialize2", new Object[] {_activity,_module,_eventname,_top,_width,_image_name}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _a = null;
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub Initialize2(Activity As Activity, Module As Ob";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="panelMenu.Initialize(\"panelMenu\")";
__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"panelMenu");
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="View.Initialize(\"View\")";
__ref._view /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"View");
RDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="lblnombre.Initialize(\"lblnombre\")";
__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"lblnombre");
RDebugUtils.currentLine=5242886;
 //BA.debugLineNum = 5242886;BA.debugLine="lblnombre.TextColor=Colors.White";
__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=5242887;
 //BA.debugLineNum = 5242887;BA.debugLine="lblnombre.TextSize=4%y";
__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__c.PerYToCurrent((float) (4),ba)));
RDebugUtils.currentLine=5242889;
 //BA.debugLineNum = 5242889;BA.debugLine="Dim a As BitmapDrawable";
_a = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=5242890;
 //BA.debugLineNum = 5242890;BA.debugLine="a.Initialize(LoadBitmap(File.DirAssets,image_name";
_a.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_image_name).getObject()));
RDebugUtils.currentLine=5242891;
 //BA.debugLineNum = 5242891;BA.debugLine="View.Background=a";
__ref._view /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_a.getObject()));
RDebugUtils.currentLine=5242894;
 //BA.debugLineNum = 5242894;BA.debugLine="panelMenu.AddView(View,2%x,1%y,4%x,9%y)";
__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._view /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (1),ba),__c.PerXToCurrent((float) (4),ba),__c.PerYToCurrent((float) (9),ba));
RDebugUtils.currentLine=5242895;
 //BA.debugLineNum = 5242895;BA.debugLine="panelMenu.AddView(lblnombre,10%x,1%y,50%x,8%y)";
__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (1),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (8),ba));
RDebugUtils.currentLine=5242897;
 //BA.debugLineNum = 5242897;BA.debugLine="Activity.AddView(panelMenu,0%x,0%y,100%x,10%y)";
_activity.AddView((android.view.View)(__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=5242899;
 //BA.debugLineNum = 5242899;BA.debugLine="mModule = Module";
__ref._mmodule /*Object*/  = _module;
RDebugUtils.currentLine=5242900;
 //BA.debugLineNum = 5242900;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=5242902;
 //BA.debugLineNum = 5242902;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mSlidePanel");
RDebugUtils.currentLine=5242904;
 //BA.debugLineNum = 5242904;BA.debugLine="mListView.Initialize(\"mListView\")";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"mListView");
RDebugUtils.currentLine=5242905;
 //BA.debugLineNum = 5242905;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().SecondLabel.setVisible(__c.False);
RDebugUtils.currentLine=5242906;
 //BA.debugLineNum = 5242906;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().setItemHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=5242907;
 //BA.debugLineNum = 5242907;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=5242908;
 //BA.debugLineNum = 5242908;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setHeight(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().getItemHeight());
RDebugUtils.currentLine=5242909;
 //BA.debugLineNum = 5242909;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTop((int) (0));
RDebugUtils.currentLine=5242910;
 //BA.debugLineNum = 5242910;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().ImageView.SetLayout(__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=5242911;
 //BA.debugLineNum = 5242911;BA.debugLine="mListView.Color = Colors.RGB(168,90,7)";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setColor(__c.Colors.RGB((int) (168),(int) (90),(int) (7)));
RDebugUtils.currentLine=5242914;
 //BA.debugLineNum = 5242914;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextColor=Co";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=5242917;
 //BA.debugLineNum = 5242917;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"",(float) (-_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=5242918;
 //BA.debugLineNum = 5242918;BA.debugLine="mInAnimation.Duration = 200";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=5242919;
 //BA.debugLineNum = 5242919;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"Out",(float) (_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=5242920;
 //BA.debugLineNum = 5242920;BA.debugLine="mOutAnimation.Duration = 200";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=5242922;
 //BA.debugLineNum = 5242922;BA.debugLine="Activity.AddView(mSlidePanel, 0,  Top, Width, 100";
_activity.AddView((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),_top,_width,(int) (__c.PerYToCurrent((float) (100),ba)-_top));
RDebugUtils.currentLine=5242924;
 //BA.debugLineNum = 5242924;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBackPanel");
RDebugUtils.currentLine=5242925;
 //BA.debugLineNum = 5242925;BA.debugLine="mBackPanel.Color = Colors.Transparent";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=5242926;
 //BA.debugLineNum = 5242926;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
_activity.AddView((android.view.View)(__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (-__c.PerXToCurrent((float) (100),ba)),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=5242929;
 //BA.debugLineNum = 5242929;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=5242930;
 //BA.debugLineNum = 5242930;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5242931;
 //BA.debugLineNum = 5242931;BA.debugLine="mSlidePanel.Color=Colors.White";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=5242932;
 //BA.debugLineNum = 5242932;BA.debugLine="End Sub";
return "";
}
public String  _mbackpanel_touch(com.menube.app.slidemenu __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mbackpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "mbackpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Private Sub mBackPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="End Sub";
return "";
}
public String  _mlistview_itemclick(com.menube.app.slidemenu __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mlistview_itemclick", false))
	 {return ((String) Debug.delegate(ba, "mlistview_itemclick", new Object[] {_position,_value}));}
String _subname = "";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Private Sub mListView_ItemClick (Position As Int,";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim subname As String";
_subname = "";
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="subname = mEventName & \"_Click\"";
_subname = __ref._meventname /*String*/ +"_Click";
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If SubExists(mModule, subname) Then";
if (__c.SubExists(ba,__ref._mmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="CallSub2(mModule, subname, Value)";
__c.CallSubNew2(ba,__ref._mmodule /*Object*/ ,_subname,_value);
 };
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="End Sub";
return "";
}
public String  _out_animationend(com.menube.app.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "out_animationend", false))
	 {return ((String) Debug.delegate(ba, "out_animationend", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Public Sub Out_AnimationEnd";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return "";
}
public String  _show(com.menube.app.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="If isVisible = True Then Return";
if (__ref._isvisible /*boolean*/ (null)==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="mBackPanel.BringToFront";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="mSlidePanel.BringToFront";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="mBackPanel.Left = 0";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="mSlidePanel.Left = 0";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="mSlidePanel.Visible = True";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=5439497;
 //BA.debugLineNum = 5439497;BA.debugLine="mInAnimation.Start(mSlidePanel)";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .Start((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=5439498;
 //BA.debugLineNum = 5439498;BA.debugLine="End Sub";
return "";
}
public String  _view_click(com.menube.app.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "view_click", false))
	 {return ((String) Debug.delegate(ba, "view_click", null));}
String _subname = "";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Public Sub View_Click";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="Dim subname As String";
_subname = "";
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="subname = \"sm_Click\"";
_subname = "sm_Click";
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="If SubExists(mModule, subname) Then";
if (__c.SubExists(ba,__ref._mmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="CallSub(mModule, subname)";
__c.CallSubNew(ba,__ref._mmodule /*Object*/ ,_subname);
 };
RDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="End Sub";
return "";
}
}