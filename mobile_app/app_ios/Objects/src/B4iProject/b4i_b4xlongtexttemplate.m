
#import "b4i_b4xlongtexttemplate.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_reporteordenes.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"
#import "b4i_animatedcounter.h"
#import "b4i_anotherprogressbar.h"
#import "b4i_b4xbreadcrumb.h"
#import "b4i_b4xcolortemplate.h"
#import "b4i_b4xcombobox.h"
#import "b4i_b4xdatetemplate.h"
#import "b4i_b4xdialog.h"
#import "b4i_b4xfloattextfield.h"
#import "b4i_b4xinputtemplate.h"
#import "b4i_b4xlisttemplate.h"
#import "b4i_b4xloadingindicator.h"
#import "b4i_b4xplusminus.h"
#import "b4i_b4xsearchtemplate.h"
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"


@implementation b4i_b4xlongtexttemplate 


+ (B4I*)createBI {
    return [B4IShellBI alloc];
}

- (void)dealloc {
    if (self.bi != nil)
        NSLog(@"Class (b4i_b4xlongtexttemplate) instance released.");
}

- (B4XViewWrapper*)  _getpanel:(b4i_b4xlongtexttemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlongtexttemplate";
if ([B4IDebug shouldDelegate: @"getpanel"])
	 {return ((B4XViewWrapper*) [B4IDebug delegate:self.bi :@"getpanel:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=19005440;
 //BA.debugLineNum = 19005440;BA.debugLine="Public Sub GetPanel (Dialog As B4XDialog) As B4XVi";
B4IRDebugUtils.currentLine=19005441;
 //BA.debugLineNum = 19005441;BA.debugLine="Return mBase";
if (true) return __ref->__mbase /*B4XViewWrapper**/ ;
B4IRDebugUtils.currentLine=19005442;
 //BA.debugLineNum = 19005442;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _show:(b4i_b4xlongtexttemplate*) __ref :(b4i_b4xdialog*) _dialog{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlongtexttemplate";
if ([B4IDebug shouldDelegate: @"show"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"show:" :@[[B4I nilToNSNull:_dialog]]]);}
B4IRDebugUtils.currentLine=19070976;
 //BA.debugLineNum = 19070976;BA.debugLine="Private Sub Show (Dialog As B4XDialog)";
B4IRDebugUtils.currentLine=19070977;
 //BA.debugLineNum = 19070977;BA.debugLine="CustomListView1.Clear";
[__ref->__customlistview1 /*b4i_customlistview**/  _clear];
B4IRDebugUtils.currentLine=19070978;
 //BA.debugLineNum = 19070978;BA.debugLine="CustomListView1.AddTextItem(Text, \"\")";
[__ref->__customlistview1 /*b4i_customlistview**/  _addtextitem:__ref->__text /*NSObject**/  :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=19070979;
 //BA.debugLineNum = 19070979;BA.debugLine="CustomListView1.GetPanel(0).GetView(0).SetTextAli";
[[[__ref->__customlistview1 /*b4i_customlistview**/  _getpanel:(int) (0)] GetView:(int) (0)] SetTextAlignment:@"TOP" :@"LEFT"];
B4IRDebugUtils.currentLine=19070980;
 //BA.debugLineNum = 19070980;BA.debugLine="Dialog.InternalAddStubToCLVIfNeeded(CustomListVie";
[_dialog _internaladdstubtoclvifneeded /*NSString**/ :nil :__ref->__customlistview1 /*b4i_customlistview**/  :__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor];
B4IRDebugUtils.currentLine=19070981;
 //BA.debugLineNum = 19070981;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _dialogclosed:(b4i_b4xlongtexttemplate*) __ref :(int) _result{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlongtexttemplate";
if ([B4IDebug shouldDelegate: @"dialogclosed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"dialogclosed:" :@[@(_result)]]);}
B4IRDebugUtils.currentLine=19136512;
 //BA.debugLineNum = 19136512;BA.debugLine="Private Sub DialogClosed(Result As Int) 'ignore";
B4IRDebugUtils.currentLine=19136514;
 //BA.debugLineNum = 19136514;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _class_globals:(b4i_b4xlongtexttemplate*) __ref{
__ref = self;
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"b4xlongtexttemplate";
B4IRDebugUtils.currentLine=18808832;
 //BA.debugLineNum = 18808832;BA.debugLine="Sub Class_Globals";
B4IRDebugUtils.currentLine=18808833;
 //BA.debugLineNum = 18808833;BA.debugLine="Private xui As XUI";
self->__xui = [B4IXUI new];
B4IRDebugUtils.currentLine=18808834;
 //BA.debugLineNum = 18808834;BA.debugLine="Public mBase As B4XView";
self->__mbase = [B4XViewWrapper new];
B4IRDebugUtils.currentLine=18808835;
 //BA.debugLineNum = 18808835;BA.debugLine="Public CustomListView1 As CustomListView";
self->__customlistview1 = [b4i_customlistview new];
B4IRDebugUtils.currentLine=18808836;
 //BA.debugLineNum = 18808836;BA.debugLine="Public Text As Object";
self->__text = [NSObject new];
B4IRDebugUtils.currentLine=18808837;
 //BA.debugLineNum = 18808837;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize:(b4i_b4xlongtexttemplate*) __ref :(B4I*) _ba{
__ref = self;
[self initializeClassModule];
B4IRDebugUtils.currentModule=@"b4xlongtexttemplate";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize:" :@[[B4I nilToNSNull:_ba]]]);}
B4IRDebugUtils.currentLine=18874368;
 //BA.debugLineNum = 18874368;BA.debugLine="Public Sub Initialize";
B4IRDebugUtils.currentLine=18874369;
 //BA.debugLineNum = 18874369;BA.debugLine="mBase = xui.CreatePanel(\"mBase\")";
__ref->__mbase /*B4XViewWrapper**/  = [__ref->__xui /*B4IXUI**/  CreatePanel:self.bi :@"mBase"];
B4IRDebugUtils.currentLine=18874370;
 //BA.debugLineNum = 18874370;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, 300dip, 300dip)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (((int) (300))) :(float) (((int) (300)))];
B4IRDebugUtils.currentLine=18874371;
 //BA.debugLineNum = 18874371;BA.debugLine="mBase.LoadLayout(\"LongTextTemplate\")";
[__ref->__mbase /*B4XViewWrapper**/  LoadLayout:@"LongTextTemplate" :self.bi];
B4IRDebugUtils.currentLine=18874372;
 //BA.debugLineNum = 18874372;BA.debugLine="mBase.SetColorAndBorder(xui.Color_Transparent, 0,";
[__ref->__mbase /*B4XViewWrapper**/  SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=18874373;
 //BA.debugLineNum = 18874373;BA.debugLine="CustomListView1.sv.SetColorAndBorder(xui.Color_Tr";
[__ref->__customlistview1 /*b4i_customlistview**/ ->__sv SetColorAndBorder:[__ref->__xui /*B4IXUI**/  Color_Transparent] :(float) (0) :(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=18874374;
 //BA.debugLineNum = 18874374;BA.debugLine="CustomListView1.DefaultTextBackgroundColor = 0xFF";
__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextbackgroundcolor = (int) (0xff555555);
B4IRDebugUtils.currentLine=18874375;
 //BA.debugLineNum = 18874375;BA.debugLine="CustomListView1.DefaultTextColor = xui.Color_Whit";
__ref->__customlistview1 /*b4i_customlistview**/ ->__defaulttextcolor = [__ref->__xui /*B4IXUI**/  Color_White];
B4IRDebugUtils.currentLine=18874376;
 //BA.debugLineNum = 18874376;BA.debugLine="CustomListView1.sv.Color = 0xFF464646";
[__ref->__customlistview1 /*b4i_customlistview**/ ->__sv setColor:(int) (0xff464646)];
B4IRDebugUtils.currentLine=18874381;
 //BA.debugLineNum = 18874381;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _resize:(b4i_b4xlongtexttemplate*) __ref :(int) _width :(int) _height{
__ref = self;
B4IRDebugUtils.currentModule=@"b4xlongtexttemplate";
if ([B4IDebug shouldDelegate: @"resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=18939904;
 //BA.debugLineNum = 18939904;BA.debugLine="Public Sub Resize(Width As Int, Height As Int)";
B4IRDebugUtils.currentLine=18939905;
 //BA.debugLineNum = 18939905;BA.debugLine="mBase.SetLayoutAnimated(0, 0, 0, Width, Height)";
[__ref->__mbase /*B4XViewWrapper**/  SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=18939906;
 //BA.debugLineNum = 18939906;BA.debugLine="CustomListView1.AsView.SetLayoutAnimated(0, 0, 0,";
[[__ref->__customlistview1 /*b4i_customlistview**/  _asview] SetLayoutAnimated:(int) (0) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=18939907;
 //BA.debugLineNum = 18939907;BA.debugLine="CustomListView1.Base_Resize(Width, Height)";
[__ref->__customlistview1 /*b4i_customlistview**/  _base_resize:_width :_height];
B4IRDebugUtils.currentLine=18939908;
 //BA.debugLineNum = 18939908;BA.debugLine="End Sub";
return @"";
}
@end