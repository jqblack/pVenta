
#import "b4i_direcciones.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
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
#import "b4i_b4xlongtexttemplate.h"
#import "b4i_b4xplusminus.h"
#import "b4i_b4xsearchtemplate.h"
#import "b4i_b4xsignaturetemplate.h"
#import "b4i_b4xswitch.h"
#import "b4i_b4xtimedtemplate.h"
#import "b4i_b4xformatter.h"
#import "b4i_roundslider.h"
#import "b4i_scrollinglabel.h"
#import "b4i_swiftbutton.h"


@implementation b4i_direcciones 


+ (instancetype)new {
    static b4i_direcciones* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 14;
}


- (NSString*)  _initialize{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="page.Initialize(\"PageDirecciones\")";
[self->__page Initialize:self.bi :@"PageDirecciones"];
B4IRDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="page.RootPanel.LoadLayout(\"frmDirecciones\")";
[[self->__page RootPanel] LoadLayout:@"frmDirecciones" :self.bi];
B4IRDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Main.NavControl.ShowPage(page)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__page).object)];
B4IRDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="Main.NavControl.ToolBarVisible = False";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:false];
B4IRDebugUtils.currentLine=5111815;
 //BA.debugLineNum = 5111815;BA.debugLine="crear";
[self _crear];
B4IRDebugUtils.currentLine=5111816;
 //BA.debugLineNum = 5111816;BA.debugLine="cargarDirecciones";
[self _cargardirecciones];
B4IRDebugUtils.currentLine=5111817;
 //BA.debugLineNum = 5111817;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnnuevadireccion_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnnuevadireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnnuevadireccion_click" :nil]);}
B4IRDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub btnNuevaDireccion_Click";
B4IRDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="txtDireccion.Text =\"\"";
[self->__txtdireccion setText:@""];
B4IRDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="txtDireccion.Tag = 0";
[self->__txtdireccion setTag:(NSObject*)(@(0))];
B4IRDebugUtils.currentLine=5373955;
 //BA.debugLineNum = 5373955;BA.debugLine="chPrincipal.SetValueAnimated(False)";
[self->__chprincipal SetValueAnimated:false];
B4IRDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="cargarDirecciones";
[self _cargardirecciones];
B4IRDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargardirecciones{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"cargardirecciones"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargardirecciones" :nil]);}
b4i_httpjob* _jobdirecciones = nil;
B4IRDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub cargarDirecciones";
B4IRDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
[_jobdirecciones _initialize /*NSString**/ :nil :self.bi :@"JobDirecciones" :self];
B4IRDebugUtils.currentLine=5242883;
 //BA.debugLineNum = 5242883;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
[_jobdirecciones _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnsalvardireccion_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnsalvardireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnsalvardireccion_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobsalvar = nil;
B4IRDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub btnSalvarDireccion_Click";
B4IRDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
if ([[[self->__txtdireccion Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
[self->___c Msgbox:@"Introduzca la dirección" :@"Información"];
B4IRDebugUtils.currentLine=5308419;
 //BA.debugLineNum = 5308419;BA.debugLine="txtDireccion.RequestFocus";
[self->__txtdireccion RequestFocus];
B4IRDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=5308423;
 //BA.debugLineNum = 5308423;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=5308424;
 //BA.debugLineNum = 5308424;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_di";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipal Value]],@",'f_direccion':'",[self->__funcion _base64_encode /*NSString**/ :[[self->__txtdireccion Text] Trim]],@"','f_idrecord':",[self.bi ObjectToString:[self->__txtdireccion Tag]],@",'f_credito_fiscal':false"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=5308426;
 //BA.debugLineNum = 5308426;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5308427;
 //BA.debugLineNum = 5308427;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
[_jobsalvar _initialize /*NSString**/ :nil :self.bi :@"JobSalvar" :self];
B4IRDebugUtils.currentLine=5308428;
 //BA.debugLineNum = 5308428;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
[_jobsalvar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/set_salvar_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5308429;
 //BA.debugLineNum = 5308429;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crear{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"crear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crear" :nil]);}
B4IList* _list = nil;
int _i = 0;
B4IRDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub crear";
B4IRDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="txtDireccion.SetShadow(Colors.Gray, 0dip,2dip, 0.";
[self->__txtdireccion SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Panel2.SetShadow(Colors.Gray, 0dip,2dip, 0.3,Fals";
[self->__panel2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :false];
B4IRDebugUtils.currentLine=5177352;
 //BA.debugLineNum = 5177352;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=5177353;
 //BA.debugLineNum = 5177353;BA.debugLine="list = page.TopLeftButtons";
_list = [self->__page TopLeftButtons];
B4IRDebugUtils.currentLine=5177354;
 //BA.debugLineNum = 5177354;BA.debugLine="Log(list.Size)";
[self->___c LogImpl:@"45177354" :[self.bi NumberToString:@([_list Size])] :0];
B4IRDebugUtils.currentLine=5177355;
 //BA.debugLineNum = 5177355;BA.debugLine="For i=0 To list.Size -1";
{
const int step6 = 1;
const int limit6 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=5177356;
 //BA.debugLineNum = 5177356;BA.debugLine="GetType(list.Get(i))";
[self->___c GetType:[_list Get:_i]];
 }
};
B4IRDebugUtils.currentLine=5177362;
 //BA.debugLineNum = 5177362;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
NSString* _dr = @"";
NSString* _default = @"";
BOOL _principaldireccion = false;
int _i = 0;
B4ITableCell* _cell = nil;
B4IRDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=5439492;
 //BA.debugLineNum = 5439492;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=5439495;
 //BA.debugLineNum = 5439495;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if ([self->__funcion _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=5439499;
 //BA.debugLineNum = 5439499;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=5439501;
 //BA.debugLineNum = 5439501;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
[_json Initialize:[self->__funcion _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=5439503;
 //BA.debugLineNum = 5439503;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=5439505;
 //BA.debugLineNum = 5439505;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobDirecciones",@"JobSalvar"]]) {
case 0: {
B4IRDebugUtils.currentLine=5439508;
 //BA.debugLineNum = 5439508;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=5439510;
 //BA.debugLineNum = 5439510;BA.debugLine="If ListViewDirecciones.IsInitialized  Then";
if ([self->__listviewdirecciones IsInitialized]) { 
B4IRDebugUtils.currentLine=5439511;
 //BA.debugLineNum = 5439511;BA.debugLine="ListViewDirecciones.RemoveViewFromParent";
[self->__listviewdirecciones RemoveViewFromParent];
 };
B4IRDebugUtils.currentLine=5439513;
 //BA.debugLineNum = 5439513;BA.debugLine="ListViewDirecciones.Initialize(\"ListViewDirecci";
[self->__listviewdirecciones Initialize:self.bi :@"ListViewDirecciones" :false];
B4IRDebugUtils.currentLine=5439514;
 //BA.debugLineNum = 5439514;BA.debugLine="Panel2.AddView(ListViewDirecciones,0,0,Panel2.W";
[self->__panel2 AddView:(UIView*)((self->__listviewdirecciones).object) :(float) (0) :(float) (0) :[self->__panel2 Width] :[self->__panel2 Height]];
B4IRDebugUtils.currentLine=5439516;
 //BA.debugLineNum = 5439516;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=5439517;
 //BA.debugLineNum = 5439517;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
[self->___c Msgbox:@"No tiene direcciones registradas" :@"Información"];
B4IRDebugUtils.currentLine=5439518;
 //BA.debugLineNum = 5439518;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=5439522;
 //BA.debugLineNum = 5439522;BA.debugLine="Dim dr,default=\"\" As String";
_dr = @"";
_default = @"";
B4IRDebugUtils.currentLine=5439523;
 //BA.debugLineNum = 5439523;BA.debugLine="Dim principalDireccion As  Boolean";
_principaldireccion = false;
B4IRDebugUtils.currentLine=5439524;
 //BA.debugLineNum = 5439524;BA.debugLine="For i=0 To list.Size -1";
{
const int step27 = 1;
const int limit27 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
B4IRDebugUtils.currentLine=5439525;
 //BA.debugLineNum = 5439525;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=5439527;
 //BA.debugLineNum = 5439527;BA.debugLine="principalDireccion = map.Get(\"f_principal\")";
_principaldireccion = [self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_principal")]];
B4IRDebugUtils.currentLine=5439528;
 //BA.debugLineNum = 5439528;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
_dr = [self->__funcion _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion")]]];
B4IRDebugUtils.currentLine=5439530;
 //BA.debugLineNum = 5439530;BA.debugLine="If dr.Length > 40 Then";
if ([_dr Length]>40) { 
B4IRDebugUtils.currentLine=5439531;
 //BA.debugLineNum = 5439531;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = [@[[_dr SubString2:(int) (0) :(int) (40)],@"..."] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=5439534;
 //BA.debugLineNum = 5439534;BA.debugLine="If principalDireccion Then";
if (_principaldireccion) { 
B4IRDebugUtils.currentLine=5439535;
 //BA.debugLineNum = 5439535;BA.debugLine="default = CRLF& \"Dirección principal\"";
_default = [@[@"\n",@"Dirección principal"] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=5439538;
 //BA.debugLineNum = 5439538;BA.debugLine="Dim cell As  TableCell = ListViewDirecciones.A";
_cell = [self->__listviewdirecciones AddTwoLines:_dr :[@[[[self->___c DateTime] Date:[self.bi ObjectToLongNumber:[_map Get:(NSObject*)(@"f_fecha")]]],_default] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5439539;
 //BA.debugLineNum = 5439539;BA.debugLine="cell.Tag = map";
[_cell setTag:(NSObject*)(_map)];
 }
};
 break; }
case 1: {
B4IRDebugUtils.currentLine=5439544;
 //BA.debugLineNum = 5439544;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\")";
[self->___c Msgbox:@"Dirección registrada." :@"Información"];
B4IRDebugUtils.currentLine=5439545;
 //BA.debugLineNum = 5439545;BA.debugLine="btnNuevaDireccion_Click";
[self _btnnuevadireccion_click];
 break; }
}
;
B4IRDebugUtils.currentLine=5439549;
 //BA.debugLineNum = 5439549;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listviewdirecciones_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"listviewdirecciones_selectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listviewdirecciones_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]);}
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub ListViewDirecciones_SelectedChanged (SectionIn";
B4IRDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="If Cell.Tag = Null Then";
if ([_cell Tag]== nil) { 
B4IRDebugUtils.currentLine=5701635;
 //BA.debugLineNum = 5701635;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=5701638;
 //BA.debugLineNum = 5701638;BA.debugLine="Dim map As Map = Cell.Tag";
_map = (B4IMap*)([_cell Tag]);
B4IRDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="txtDireccion.Text = funcion.base64_Decode(map.Get";
[self->__txtdireccion setText:[self->__funcion _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion")]]]];
B4IRDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="txtDireccion.Tag = map.Get(\"f_idrecord\")";
[self->__txtdireccion setTag:[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="chPrincipal.Value = map.Get(\"f_principal\")";
[self->__chprincipal setValue:[self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_principal")]]];
B4IRDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pagedirecciones_disappear{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"pagedirecciones_disappear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pagedirecciones_disappear" :nil]);}
B4IRDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub PageDirecciones_Disappear";
B4IRDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pagedirecciones_keyboardstatechanged:(float) _height{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"pagedirecciones_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pagedirecciones_keyboardstatechanged:" :@[@(_height)]]);}
B4IRDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub  PageDirecciones_KeyboardStateChanged (Height";
B4IRDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="funcion.KeyboardStateChanged(Height,page,page.Roo";
[self->__funcion _keyboardstatechanged /*NSString**/ :_height :self->__page :[self.bi ObjectToNumber:[[self->__page RootPanel] Tag]].doubleValue];
B4IRDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pagedirecciones_resize:(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"pagedirecciones_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pagedirecciones_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub PageDirecciones_Resize(Width As Int, Height As";
B4IRDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="page.RootPanel.Tag = page.RootPanel.Top";
[[self->__page RootPanel] setTag:(NSObject*)(@([[self->__page RootPanel] Top]))];
B4IRDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=5046275;
 //BA.debugLineNum = 5046275;BA.debugLine="Private page As Page";
self->__page = [B4IPage new];
B4IRDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Private btnNuevaDireccion As Button";
self->__btnnuevadireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="Private btnSalvarDireccion As Button";
self->__btnsalvardireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=5046278;
 //BA.debugLineNum = 5046278;BA.debugLine="Private chPrincipal As Switch";
self->__chprincipal = [B4ISwitchWrapper new];
B4IRDebugUtils.currentLine=5046279;
 //BA.debugLineNum = 5046279;BA.debugLine="Private Panel2 As Panel";
self->__panel2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=5046280;
 //BA.debugLineNum = 5046280;BA.debugLine="Private txtDireccion As TextView";
self->__txtdireccion = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=5046281;
 //BA.debugLineNum = 5046281;BA.debugLine="Private ListViewDirecciones As TableView";
self->__listviewdirecciones = [B4ITableView new];
B4IRDebugUtils.currentLine=5046282;
 //BA.debugLineNum = 5046282;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtdireccion_textchanged:(NSString*) _oldtext :(NSString*) _newtext{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtdireccion_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtdireccion_textchanged::" :@[[B4I nilToNSNull:_oldtext],[B4I nilToNSNull:_newtext]]]);}
B4IRDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub txtDireccion_TextChanged (OldText As String, N";
B4IRDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="If NewText.Contains(CRLF) Then";
if ([_newtext Contains:@"\n"]) { 
B4IRDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="page.resignfocus";
[self->__page ResignFocus];
 };
B4IRDebugUtils.currentLine=5767174;
 //BA.debugLineNum = 5767174;BA.debugLine="End Sub";
return @"";
}
@end