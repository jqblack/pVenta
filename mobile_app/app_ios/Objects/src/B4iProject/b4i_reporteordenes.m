
#import "b4i_reporteordenes.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
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

@interface ResumableSub_reporteordenes_ListViewOrdenes_SelectedChanged :B4IResumableSub 
- (instancetype) init: (b4i_reporteordenes*) parent1 :(int) _sectionindex1 :(B4ITableCell*) _cell1;
@end
@implementation ResumableSub_reporteordenes_ListViewOrdenes_SelectedChanged {
b4i_reporteordenes* parent;
int _sectionindex;
B4ITableCell* _cell;
NSString* _buttontext;
B4IMap* _map;
NSString* _json;
b4i_httpjob* _jobeliminar;
}
- (instancetype) init: (b4i_reporteordenes*) parent1 :(int) _sectionindex1 :(B4ITableCell*) _cell1 {
self->_sectionindex = _sectionindex1;
self->_cell = _cell1;
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"reporteordenes";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Msgbox2(\"Msg\", \"Seguro que desea eliminar esta or";
[parent->___c Msgbox2:self.bi :@"Msg" :@"Seguro que desea eliminar esta orden?" :@"Confirmación" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"Volver")]]]]];
B4IRDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
[parent->___c WaitFor:@"msg_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"reporteordenes" :@"listviewordenes_selectedchanged"] :nil];
self->_state = 5;
return;
case 5:
//C
self->_state = 1;
_buttontext = ((NSString*) result[0]);
;
B4IRDebugUtils.currentLine=6160390;
 //BA.debugLineNum = 6160390;BA.debugLine="If ButtonText = \"Si\" Then";
if (true) break;

case 1:
//if
self->_state = 4;
if ([_buttontext isEqual:@"Si"]) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Dim map As Map = Cell.Tag";
_map = (B4IMap*)([_cell Tag]);
B4IRDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=6160393;
 //BA.debugLineNum = 6160393;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
_json = [@[@"'f_idrecord':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_idempresa':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idempresa")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="Dim JobEliminar As HttpJob";
_jobeliminar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
[_jobeliminar _initialize /*NSString**/ :nil :self.bi :@"JobEliminar" :parent];
B4IRDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
[_jobeliminar _poststring /*NSString**/ :nil :[@[parent->__main->__url /*NSString**/ ,@"puntoventa/set_eliminar_orden"] componentsJoinedByString:@""] :[@[@"json=",[parent->__funcion _crearjson /*NSString**/ :parent->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_reporteordenes 


+ (instancetype)new {
    static b4i_reporteordenes* shared = nil;
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
B4IRDebugUtils.currentModule=@"reporteordenes";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="page.Initialize(\"PageReporteOrdenes\")";
[self->__page Initialize:self.bi :@"PageReporteOrdenes"];
B4IRDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="page.RootPanel.LoadLayout(\"frmReporteOrdenes\")";
[[self->__page RootPanel] LoadLayout:@"frmReporteOrdenes" :self.bi];
B4IRDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Main.NavControl.ShowPage(page)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__page).object)];
B4IRDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Main.NavControl.ToolBarVisible = False";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:false];
B4IRDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="chOrdenesAbiertas.Value = True";
[self->__chordenesabiertas setValue:true];
B4IRDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="crear";
[self _crear];
B4IRDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="btnBuscarReporte_Click";
[self _btnbuscarreporte_click];
B4IRDebugUtils.currentLine=5898249;
 //BA.debugLineNum = 5898249;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbuscarreporte_click{
B4IRDebugUtils.currentModule=@"reporteordenes";
if ([B4IDebug shouldDelegate: @"btnbuscarreporte_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbuscarreporte_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobbuscar = nil;
B4IRDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub btnBuscarReporte_Click";
B4IRDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
[[self->___c DateTime] setDateFormat:@"yyyy-MM-dd"];
B4IRDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(date.Ticks)&\"";
_json = [@[@"'f_fecha1':'",[[self->___c DateTime] Date:[self->__date Ticks]],@"','f_pendiente':",[self.bi BooleanToString:[self->__chordenesabiertas Value]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=6029318;
 //BA.debugLineNum = 6029318;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=6029319;
 //BA.debugLineNum = 6029319;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
[_jobbuscar _initialize /*NSString**/ :nil :self.bi :@"JobBuscar" :self];
B4IRDebugUtils.currentLine=6029320;
 //BA.debugLineNum = 6029320;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_ord";
[_jobbuscar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/get_ordenes_cliente"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=6029322;
 //BA.debugLineNum = 6029322;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crear{
B4IRDebugUtils.currentModule=@"reporteordenes";
if ([B4IDebug shouldDelegate: @"crear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crear" :nil]);}
B4IRDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub crear";
B4IRDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Panel1.SetShadow(Colors.Gray, 0dip,0dip, 0.5,Fals";
[self->__panel1 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (0))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Panel2.SetShadow(Colors.Gray, 0dip,0dip, 0.5,Fals";
[self->__panel2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (0))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="ListViewOrdenes.Initialize(\"ListViewDirecciones\",";
[self->__listviewordenes Initialize:self.bi :@"ListViewDirecciones" :false];
B4IRDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Panel2.AddView(ListViewOrdenes,0,0,Panel2.Width,P";
[self->__panel2 AddView:(UIView*)((self->__listviewordenes).object) :(float) (0) :(float) (0) :[self->__panel2 Width] :[self->__panel2 Height]];
B4IRDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="chOrdenesAbiertas.Value = True";
[self->__chordenesabiertas setValue:true];
B4IRDebugUtils.currentLine=5963784;
 //BA.debugLineNum = 5963784;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"reporteordenes";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
NSString* _secondline = @"";
int _i = 0;
B4ITableCell* _cell = nil;
B4IRDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6094855;
 //BA.debugLineNum = 6094855;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if ([self->__funcion _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6094859;
 //BA.debugLineNum = 6094859;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=6094860;
 //BA.debugLineNum = 6094860;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=6094861;
 //BA.debugLineNum = 6094861;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=6094862;
 //BA.debugLineNum = 6094862;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
[_json Initialize:[self->__funcion _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=6094863;
 //BA.debugLineNum = 6094863;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=6094865;
 //BA.debugLineNum = 6094865;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobBuscar",@"JobEliminar"]]) {
case 0: {
B4IRDebugUtils.currentLine=6094868;
 //BA.debugLineNum = 6094868;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6094869;
 //BA.debugLineNum = 6094869;BA.debugLine="ListViewOrdenes.Clear";
[self->__listviewordenes Clear];
B4IRDebugUtils.currentLine=6094871;
 //BA.debugLineNum = 6094871;BA.debugLine="If ListViewOrdenes.IsInitialized Then";
if ([self->__listviewordenes IsInitialized]) { 
B4IRDebugUtils.currentLine=6094872;
 //BA.debugLineNum = 6094872;BA.debugLine="ListViewOrdenes.RemoveViewFromParent";
[self->__listviewordenes RemoveViewFromParent];
B4IRDebugUtils.currentLine=6094873;
 //BA.debugLineNum = 6094873;BA.debugLine="ListViewOrdenes.Initialize(\"ListViewOrdenes\",F";
[self->__listviewordenes Initialize:self.bi :@"ListViewOrdenes" :false];
B4IRDebugUtils.currentLine=6094874;
 //BA.debugLineNum = 6094874;BA.debugLine="Panel2.AddView(ListViewOrdenes,0,0,Panel2.Widt";
[self->__panel2 AddView:(UIView*)((self->__listviewordenes).object) :(float) (0) :(float) (0) :[self->__panel2 Width] :[self->__panel2 Height]];
 };
B4IRDebugUtils.currentLine=6094877;
 //BA.debugLineNum = 6094877;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=6094878;
 //BA.debugLineNum = 6094878;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
[self->___c Msgbox:@"No hay ordenes registradas" :@"Información"];
B4IRDebugUtils.currentLine=6094879;
 //BA.debugLineNum = 6094879;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6094882;
 //BA.debugLineNum = 6094882;BA.debugLine="Dim secondLine As String";
_secondline = @"";
B4IRDebugUtils.currentLine=6094883;
 //BA.debugLineNum = 6094883;BA.debugLine="For i=0 To list.Size - 1";
{
const int step27 = 1;
const int limit27 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
B4IRDebugUtils.currentLine=6094884;
 //BA.debugLineNum = 6094884;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=6094885;
 //BA.debugLineNum = 6094885;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
_secondline = [@[@"Fecha: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_fecha_regstro_orden")]],@"\n",@"Estado: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_status")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=6094887;
 //BA.debugLineNum = 6094887;BA.debugLine="Dim cell As TableCell = ListViewOrdenes.AddTwo";
_cell = [self->__listviewordenes AddTwoLines:[@[[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_negocio")]],@"   $",[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_total")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""] :_secondline];
B4IRDebugUtils.currentLine=6094888;
 //BA.debugLineNum = 6094888;BA.debugLine="cell.Tag = map";
[_cell setTag:(NSObject*)(_map)];
 }
};
 break; }
case 1: {
B4IRDebugUtils.currentLine=6094892;
 //BA.debugLineNum = 6094892;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6094893;
 //BA.debugLineNum = 6094893;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"1")]) { 
B4IRDebugUtils.currentLine=6094894;
 //BA.debugLineNum = 6094894;BA.debugLine="ListViewOrdenes.Clear";
[self->__listviewordenes Clear];
B4IRDebugUtils.currentLine=6094895;
 //BA.debugLineNum = 6094895;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
[self->___c Msgbox:@"Orden cancelada." :@"Información"];
B4IRDebugUtils.currentLine=6094896;
 //BA.debugLineNum = 6094896;BA.debugLine="btnBuscarReporte_Click";
[self _btnbuscarreporte_click];
 }else {
B4IRDebugUtils.currentLine=6094898;
 //BA.debugLineNum = 6094898;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
[self->___c Msgbox:@"La orden ya no se puede ser cancelada." :@"Información"];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=6094903;
 //BA.debugLineNum = 6094903;BA.debugLine="End Sub";
return @"";
}
- (void)  _listviewordenes_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"reporteordenes";
if ([B4IDebug shouldDelegate: @"listviewordenes_selectedchanged"])
	 {[B4IDebug delegate:self.bi :@"listviewordenes_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]; return;}
ResumableSub_reporteordenes_ListViewOrdenes_SelectedChanged* rsub = [[ResumableSub_reporteordenes_ListViewOrdenes_SelectedChanged alloc] init:self : _sectionindex: _cell];
[rsub resume:self.bi :nil];
}
//-1753557769
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"reporteordenes";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="Private page As Page";
self->__page = [B4IPage new];
B4IRDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="Private btnBuscarReporte As Button";
self->__btnbuscarreporte = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="Private chOrdenesAbiertas As Switch";
self->__chordenesabiertas = [B4ISwitchWrapper new];
B4IRDebugUtils.currentLine=5832710;
 //BA.debugLineNum = 5832710;BA.debugLine="Private date As DatePicker";
self->__date = [B4IDatePickerWrapper new];
B4IRDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="Private Panel1 As Panel";
self->__panel1 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=5832712;
 //BA.debugLineNum = 5832712;BA.debugLine="Private Panel2 As Panel";
self->__panel2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=5832713;
 //BA.debugLineNum = 5832713;BA.debugLine="Private ListViewOrdenes As TableView";
self->__listviewordenes = [B4ITableView new];
B4IRDebugUtils.currentLine=5832715;
 //BA.debugLineNum = 5832715;BA.debugLine="End Sub";
return @"";
}
@end