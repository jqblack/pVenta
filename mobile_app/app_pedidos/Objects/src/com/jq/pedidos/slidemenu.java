package com.jq.pedidos;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;
import anywheresoftware.b4a.BALayout;
import anywheresoftware.b4a.debug.*;

public class slidemenu extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    private static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new anywheresoftware.b4a.ShellBA(_ba, this, htSubs, "com.jq.pedidos.slidemenu");
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            
        }
        if (BA.isShellModeRuntimeCheck(ba)) 
			   this.getClass().getMethod("_class_globals", com.jq.pedidos.slidemenu.class).invoke(this, new Object[] {null});
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
public com.jq.pedidos.main _main = null;
public com.jq.pedidos.starter _starter = null;
public com.jq.pedidos.principal _principal = null;
public com.jq.pedidos.funcion _funcion = null;
public com.jq.pedidos.facturacion _facturacion = null;
public com.jq.pedidos.direcciones _direcciones = null;
public com.jq.pedidos.reporteordenes _reporteordenes = null;
public com.jq.pedidos.categoria _categoria = null;
public com.jq.pedidos.perfil _perfil = null;
public com.jq.pedidos.httputils2service _httputils2service = null;
public String  _initialize(com.jq.pedidos.slidemenu __ref,anywheresoftware.b4a.BA _ba,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,int _top,int _width,int _colorbackgound) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "initialize", false))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba,_activity,_module,_eventname,_top,_width,_colorbackgound}));}
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Initialize(Activity As Activity, Module As Obj";
RDebugUtils.currentLine=6881318;
 //BA.debugLineNum = 6881318;BA.debugLine="mModule = Module";
__ref._mmodule /*Object*/  = _module;
RDebugUtils.currentLine=6881319;
 //BA.debugLineNum = 6881319;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=6881321;
 //BA.debugLineNum = 6881321;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mSlidePanel");
RDebugUtils.currentLine=6881323;
 //BA.debugLineNum = 6881323;BA.debugLine="mListView.Initialize(\"mListView\")";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"mListView");
RDebugUtils.currentLine=6881324;
 //BA.debugLineNum = 6881324;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().SecondLabel.setVisible(__c.False);
RDebugUtils.currentLine=6881325;
 //BA.debugLineNum = 6881325;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().setItemHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=6881326;
 //BA.debugLineNum = 6881326;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=6881327;
 //BA.debugLineNum = 6881327;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setHeight(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().getItemHeight());
RDebugUtils.currentLine=6881328;
 //BA.debugLineNum = 6881328;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTop((int) (0));
RDebugUtils.currentLine=6881329;
 //BA.debugLineNum = 6881329;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextColor = Col";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextColor(__c.Colors.RGB((int) (33),(int) (33),(int) (33)));
RDebugUtils.currentLine=6881330;
 //BA.debugLineNum = 6881330;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().ImageView.SetLayout(__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=6881331;
 //BA.debugLineNum = 6881331;BA.debugLine="mListView.Color = colorBackgound";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setColor(_colorbackgound);
RDebugUtils.currentLine=6881333;
 //BA.debugLineNum = 6881333;BA.debugLine="funcion.SetDivider( mListView,Colors.LightGray,1d";
_funcion._setdivider /*String*/ (ba,__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ ,__c.Colors.LightGray,__c.DipToCurrent((int) (1)));
RDebugUtils.currentLine=6881335;
 //BA.debugLineNum = 6881335;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"",(float) (-_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=6881336;
 //BA.debugLineNum = 6881336;BA.debugLine="mInAnimation.Duration = 350";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (350));
RDebugUtils.currentLine=6881337;
 //BA.debugLineNum = 6881337;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"Out",(float) (_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=6881338;
 //BA.debugLineNum = 6881338;BA.debugLine="mOutAnimation.Duration = 200";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=6881340;
 //BA.debugLineNum = 6881340;BA.debugLine="Activity.AddView(mSlidePanel, 0, Top, Width, 100%";
_activity.AddView((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),_top,_width,(int) (__c.PerYToCurrent((float) (100),ba)-_top));
RDebugUtils.currentLine=6881342;
 //BA.debugLineNum = 6881342;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBackPanel");
RDebugUtils.currentLine=6881343;
 //BA.debugLineNum = 6881343;BA.debugLine="mBackPanel.Color = Colors.Transparent";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=6881344;
 //BA.debugLineNum = 6881344;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
_activity.AddView((android.view.View)(__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (-__c.PerXToCurrent((float) (100),ba)),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=6881346;
 //BA.debugLineNum = 6881346;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6881347;
 //BA.debugLineNum = 6881347;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6881348;
 //BA.debugLineNum = 6881348;BA.debugLine="End Sub";
return "";
}
public String  _show(com.jq.pedidos.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "show", false))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Public Sub Show";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="If isVisible = True Then Return";
if (__ref._isvisible /*boolean*/ (null)==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="mBackPanel.BringToFront";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="mSlidePanel.BringToFront";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .BringToFront();
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="mBackPanel.Left = 0";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="mSlidePanel.Left = 0";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (0));
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="mSlidePanel.Visible = True";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.True);
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="mInAnimation.Start(mSlidePanel)";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .Start((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="End Sub";
return "";
}
public String  _hide(com.jq.pedidos.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "hide", false))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Public Sub Hide";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="If isVisible = False Then Return";
if (__ref._isvisible /*boolean*/ (null)==__c.False) { 
if (true) return "";};
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="mBackPanel.Left = -mBackPanel.Width";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="mSlidePanel.Left = -mSlidePanel.Width";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setLeft((int) (-__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth()));
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="mOutAnimation.Start(mSlidePanel)";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .Start((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()));
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="End Sub";
return "";
}
public String  _additem(com.jq.pedidos.slidemenu __ref,String _text,anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper _image,Object _returnvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "additem", false))
	 {return ((String) Debug.delegate(ba, "additem", new Object[] {_text,_image,_returnvalue}));}
com.jq.pedidos.slidemenu._actionitem _item = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Public Sub AddItem(Text As String, Image As Bitmap";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="Dim item As ActionItem";
_item = new com.jq.pedidos.slidemenu._actionitem();
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="item.Initialize";
_item.Initialize();
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="item.Text = Text";
_item.Text /*String*/  = _text;
RDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="item.Image = Image";
_item.Image /*anywheresoftware.b4a.objects.drawable.CanvasWrapper.BitmapWrapper*/  = _image;
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="item.Value = ReturnValue";
_item.Value /*Object*/  = _returnvalue;
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="If Not(Image.IsInitialized) Then";
if (__c.Not(_image.IsInitialized())) { 
RDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Null,";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(__c.Null),_returnvalue);
 }else {
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="mListView.AddTwoLinesAndBitmap2(Text, \"\", Image,";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .AddTwoLinesAndBitmap2(BA.ObjectToCharSequence(_text),BA.ObjectToCharSequence(""),(android.graphics.Bitmap)(_image.getObject()),_returnvalue);
 };
RDebugUtils.currentLine=7077904;
 //BA.debugLineNum = 7077904;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(com.jq.pedidos.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Private Sub Class_Globals";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Type ActionItem (Text As String, Image As Bitmap,";
;
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Private View As ImageView";
_view = new anywheresoftware.b4a.objects.ImageViewWrapper();
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="Private lblnombre As Label";
_lblnombre = new anywheresoftware.b4a.objects.LabelWrapper();
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="Private panelMenu As Panel";
_panelmenu = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="Private mSlidePanel As Panel";
_mslidepanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Private mBackPanel As Panel";
_mbackpanel = new anywheresoftware.b4a.objects.PanelWrapper();
RDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="Private mModule As Object";
_mmodule = new Object();
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="Private mEventName As String";
_meventname = "";
RDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="Private mListView As ListView";
_mlistview = new anywheresoftware.b4a.objects.ListViewWrapper();
RDebugUtils.currentLine=6815759;
 //BA.debugLineNum = 6815759;BA.debugLine="Private mInAnimation As Animation";
_minanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="Private mOutAnimation As Animation";
_moutanimation = new anywheresoftware.b4a.objects.AnimationWrapper();
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="Dim backgroundColor As Int : backgroundColor = Co";
_backgroundcolor = 0;
RDebugUtils.currentLine=6815761;
 //BA.debugLineNum = 6815761;BA.debugLine="Dim backgroundColor As Int : backgroundColor = Co";
__ref._backgroundcolor /*int*/  = __c.Colors.RGB((int) (31),(int) (154),(int) (176));
RDebugUtils.currentLine=6815763;
 //BA.debugLineNum = 6815763;BA.debugLine="End Sub";
return "";
}
public boolean  _isvisible(com.jq.pedidos.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "isvisible", false))
	 {return ((Boolean) Debug.delegate(ba, "isvisible", null));}
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Public Sub isVisible As Boolean";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="Return mSlidePanel.Visible";
if (true) return __ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getVisible();
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="End Sub";
return false;
}
public String  _initialize2(com.jq.pedidos.slidemenu __ref,anywheresoftware.b4a.objects.ActivityWrapper _activity,Object _module,String _eventname,int _top,int _width,String _image_name) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "initialize2", false))
	 {return ((String) Debug.delegate(ba, "initialize2", new Object[] {_activity,_module,_eventname,_top,_width,_image_name}));}
anywheresoftware.b4a.objects.drawable.BitmapDrawable _a = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Initialize2(Activity As Activity, Module As Ob";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="panelMenu.Initialize(\"panelMenu\")";
__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"panelMenu");
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="View.Initialize(\"View\")";
__ref._view /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .Initialize(ba,"View");
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="lblnombre.Initialize(\"lblnombre\")";
__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .Initialize(ba,"lblnombre");
RDebugUtils.currentLine=6946822;
 //BA.debugLineNum = 6946822;BA.debugLine="lblnombre.TextColor=Colors.White";
__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextColor(__c.Colors.White);
RDebugUtils.currentLine=6946823;
 //BA.debugLineNum = 6946823;BA.debugLine="lblnombre.TextSize=4%y";
__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .setTextSize((float) (__c.PerYToCurrent((float) (4),ba)));
RDebugUtils.currentLine=6946825;
 //BA.debugLineNum = 6946825;BA.debugLine="Dim a As BitmapDrawable";
_a = new anywheresoftware.b4a.objects.drawable.BitmapDrawable();
RDebugUtils.currentLine=6946826;
 //BA.debugLineNum = 6946826;BA.debugLine="a.Initialize(LoadBitmap(File.DirAssets,image_name";
_a.Initialize((android.graphics.Bitmap)(__c.LoadBitmap(__c.File.getDirAssets(),_image_name).getObject()));
RDebugUtils.currentLine=6946827;
 //BA.debugLineNum = 6946827;BA.debugLine="View.Background=a";
__ref._view /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .setBackground((android.graphics.drawable.Drawable)(_a.getObject()));
RDebugUtils.currentLine=6946830;
 //BA.debugLineNum = 6946830;BA.debugLine="panelMenu.AddView(View,2%x,1%y,4%x,9%y)";
__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._view /*anywheresoftware.b4a.objects.ImageViewWrapper*/ .getObject()),__c.PerXToCurrent((float) (2),ba),__c.PerYToCurrent((float) (1),ba),__c.PerXToCurrent((float) (4),ba),__c.PerYToCurrent((float) (9),ba));
RDebugUtils.currentLine=6946831;
 //BA.debugLineNum = 6946831;BA.debugLine="panelMenu.AddView(lblnombre,10%x,1%y,50%x,8%y)";
__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._lblnombre /*anywheresoftware.b4a.objects.LabelWrapper*/ .getObject()),__c.PerXToCurrent((float) (10),ba),__c.PerYToCurrent((float) (1),ba),__c.PerXToCurrent((float) (50),ba),__c.PerYToCurrent((float) (8),ba));
RDebugUtils.currentLine=6946833;
 //BA.debugLineNum = 6946833;BA.debugLine="Activity.AddView(panelMenu,0%x,0%y,100%x,10%y)";
_activity.AddView((android.view.View)(__ref._panelmenu /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),__c.PerXToCurrent((float) (0),ba),__c.PerYToCurrent((float) (0),ba),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (10),ba));
RDebugUtils.currentLine=6946835;
 //BA.debugLineNum = 6946835;BA.debugLine="mModule = Module";
__ref._mmodule /*Object*/  = _module;
RDebugUtils.currentLine=6946836;
 //BA.debugLineNum = 6946836;BA.debugLine="mEventName = EventName";
__ref._meventname /*String*/  = _eventname;
RDebugUtils.currentLine=6946838;
 //BA.debugLineNum = 6946838;BA.debugLine="mSlidePanel.Initialize(\"mSlidePanel\")";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mSlidePanel");
RDebugUtils.currentLine=6946840;
 //BA.debugLineNum = 6946840;BA.debugLine="mListView.Initialize(\"mListView\")";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .Initialize(ba,"mListView");
RDebugUtils.currentLine=6946841;
 //BA.debugLineNum = 6946841;BA.debugLine="mListView.TwoLinesAndBitmap.SecondLabel.Visible =";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().SecondLabel.setVisible(__c.False);
RDebugUtils.currentLine=6946842;
 //BA.debugLineNum = 6946842;BA.debugLine="mListView.TwoLinesAndBitmap.ItemHeight = 50dip";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().setItemHeight(__c.DipToCurrent((int) (50)));
RDebugUtils.currentLine=6946843;
 //BA.debugLineNum = 6946843;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Gravity = Gravi";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setGravity(__c.Gravity.CENTER_VERTICAL);
RDebugUtils.currentLine=6946844;
 //BA.debugLineNum = 6946844;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Height = mListV";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setHeight(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().getItemHeight());
RDebugUtils.currentLine=6946845;
 //BA.debugLineNum = 6946845;BA.debugLine="mListView.TwoLinesAndBitmap.Label.Top = 0";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTop((int) (0));
RDebugUtils.currentLine=6946846;
 //BA.debugLineNum = 6946846;BA.debugLine="mListView.TwoLinesAndBitmap.ImageView.SetLayout(1";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().ImageView.SetLayout(__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (13)),__c.DipToCurrent((int) (24)),__c.DipToCurrent((int) (24)));
RDebugUtils.currentLine=6946847;
 //BA.debugLineNum = 6946847;BA.debugLine="mListView.Color = Colors.RGB(168,90,7)";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .setColor(__c.Colors.RGB((int) (168),(int) (90),(int) (7)));
RDebugUtils.currentLine=6946850;
 //BA.debugLineNum = 6946850;BA.debugLine="mListView.TwoLinesAndBitmap.Label.TextColor=Co";
__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getTwoLinesAndBitmap().Label.setTextColor(__c.Colors.White);
RDebugUtils.currentLine=6946853;
 //BA.debugLineNum = 6946853;BA.debugLine="mInAnimation.InitializeTranslate(\"\", -Width, 0, 0";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"",(float) (-_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=6946854;
 //BA.debugLineNum = 6946854;BA.debugLine="mInAnimation.Duration = 200";
__ref._minanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=6946855;
 //BA.debugLineNum = 6946855;BA.debugLine="mOutAnimation.InitializeTranslate(\"Out\", Width, 0";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .InitializeTranslate(ba,"Out",(float) (_width),(float) (0),(float) (0),(float) (0));
RDebugUtils.currentLine=6946856;
 //BA.debugLineNum = 6946856;BA.debugLine="mOutAnimation.Duration = 200";
__ref._moutanimation /*anywheresoftware.b4a.objects.AnimationWrapper*/ .setDuration((long) (200));
RDebugUtils.currentLine=6946858;
 //BA.debugLineNum = 6946858;BA.debugLine="Activity.AddView(mSlidePanel, 0,  Top, Width, 100";
_activity.AddView((android.view.View)(__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (0),_top,_width,(int) (__c.PerYToCurrent((float) (100),ba)-_top));
RDebugUtils.currentLine=6946860;
 //BA.debugLineNum = 6946860;BA.debugLine="mBackPanel.Initialize(\"mBackPanel\")";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .Initialize(ba,"mBackPanel");
RDebugUtils.currentLine=6946861;
 //BA.debugLineNum = 6946861;BA.debugLine="mBackPanel.Color = Colors.Transparent";
__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.Transparent);
RDebugUtils.currentLine=6946862;
 //BA.debugLineNum = 6946862;BA.debugLine="Activity.AddView(mBackPanel, -100%x, 0, 100%x, 10";
_activity.AddView((android.view.View)(__ref._mbackpanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getObject()),(int) (-__c.PerXToCurrent((float) (100),ba)),(int) (0),__c.PerXToCurrent((float) (100),ba),__c.PerYToCurrent((float) (100),ba));
RDebugUtils.currentLine=6946865;
 //BA.debugLineNum = 6946865;BA.debugLine="mSlidePanel.AddView(mListView, 0, 0, mSlidePanel.";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .AddView((android.view.View)(__ref._mlistview /*anywheresoftware.b4a.objects.ListViewWrapper*/ .getObject()),(int) (0),(int) (0),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getWidth(),__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .getHeight());
RDebugUtils.currentLine=6946866;
 //BA.debugLineNum = 6946866;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=6946867;
 //BA.debugLineNum = 6946867;BA.debugLine="mSlidePanel.Color=Colors.White";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setColor(__c.Colors.White);
RDebugUtils.currentLine=6946868;
 //BA.debugLineNum = 6946868;BA.debugLine="End Sub";
return "";
}
public String  _mbackpanel_touch(com.jq.pedidos.slidemenu __ref,int _action,float _x,float _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mbackpanel_touch", false))
	 {return ((String) Debug.delegate(ba, "mbackpanel_touch", new Object[] {_action,_x,_y}));}
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Private Sub mBackPanel_Touch (Action As Int, X As";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="If Action = 1 Then";
if (_action==1) { 
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
 };
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="End Sub";
return "";
}
public String  _mlistview_itemclick(com.jq.pedidos.slidemenu __ref,int _position,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "mlistview_itemclick", false))
	 {return ((String) Debug.delegate(ba, "mlistview_itemclick", new Object[] {_position,_value}));}
String _subname = "";
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Private Sub mListView_ItemClick (Position As Int,";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="Dim subname As String";
_subname = "";
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="subname = mEventName & \"_Click\"";
_subname = __ref._meventname /*String*/ +"_Click";
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="If SubExists(mModule, subname) Then";
if (__c.SubExists(ba,__ref._mmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="CallSub2(mModule, subname, Value)";
__c.CallSubNew2(ba,__ref._mmodule /*Object*/ ,_subname,_value);
 };
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="End Sub";
return "";
}
public String  _out_animationend(com.jq.pedidos.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "out_animationend", false))
	 {return ((String) Debug.delegate(ba, "out_animationend", null));}
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Public Sub Out_AnimationEnd";
RDebugUtils.currentLine=7274497;
 //BA.debugLineNum = 7274497;BA.debugLine="mSlidePanel.Visible = False";
__ref._mslidepanel /*anywheresoftware.b4a.objects.PanelWrapper*/ .setVisible(__c.False);
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="End Sub";
return "";
}
public String  _view_click(com.jq.pedidos.slidemenu __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="slidemenu";
if (Debug.shouldDelegate(ba, "view_click", false))
	 {return ((String) Debug.delegate(ba, "view_click", null));}
String _subname = "";
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Public Sub View_Click";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim subname As String";
_subname = "";
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="Hide";
__ref._hide /*String*/ (null);
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="subname = \"sm_Click\"";
_subname = "sm_Click";
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="If SubExists(mModule, subname) Then";
if (__c.SubExists(ba,__ref._mmodule /*Object*/ ,_subname)) { 
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="CallSub(mModule, subname)";
__c.CallSubNew(ba,__ref._mmodule /*Object*/ ,_subname);
 };
RDebugUtils.currentLine=7012359;
 //BA.debugLineNum = 7012359;BA.debugLine="End Sub";
return "";
}
}