
#import "b4i_reportes.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"


@implementation b4i_reportes 


+ (instancetype)new {
    static b4i_reportes* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4IShellBI alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}
- (int)debugAppId {
    return 5;
}


- (NSString*)  _initialize{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="pageReporte.Initialize(\"pageReporte\")";
[self->__pagereporte Initialize:self.bi :@"pageReporte"];
B4IRDebugUtils.currentLine=8388611;
 //BA.debugLineNum = 8388611;BA.debugLine="pageReporte.RootPanel.LoadLayout(\"frmReportesOrde";
[[self->__pagereporte RootPanel] LoadLayout:@"frmReportesOrdenes" :self.bi];
B4IRDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="Main.NavControl.ShowPage(pageReporte)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pagereporte).object)];
B4IRDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="PanelEncabezadoRepo.SetShadow(Colors.Gray,0dip,2d";
[self->__panelencabezadorepo SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388615;
 //BA.debugLineNum = 8388615;BA.debugLine="PanelEncabezadoM.SetShadow(Colors.Gray,0dip,2dip,";
[self->__panelencabezadom SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388616;
 //BA.debugLineNum = 8388616;BA.debugLine="Panel2.SetShadow(Colors.Gray,1dip,2dip,0.3,True)";
[self->__panel2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388617;
 //BA.debugLineNum = 8388617;BA.debugLine="btnBuscarReporte.SetShadow(Colors.Gray,1dip,2dip,";
[self->__btnbuscarreporte SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388618;
 //BA.debugLineNum = 8388618;BA.debugLine="btnAceptarDate.SetShadow(Colors.Gray,1dip,2dip,0.";
[self->__btnaceptardate SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388619;
 //BA.debugLineNum = 8388619;BA.debugLine="btnCancelarDate.SetShadow(Colors.Gray,1dip,2dip,0";
[self->__btncancelardate SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388620;
 //BA.debugLineNum = 8388620;BA.debugLine="btnbackProOrden.SetShadow(Colors.Gray,1dip,2dip,0";
[self->__btnbackproorden SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388621;
 //BA.debugLineNum = 8388621;BA.debugLine="btnAddAllproOrden.SetShadow(Colors.Gray,1dip,2dip";
[self->__btnaddallproorden SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8388623;
 //BA.debugLineNum = 8388623;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
[[self->___c DateTime] setDateFormat:@"yyyy-MM-dd"];
B4IRDebugUtils.currentLine=8388625;
 //BA.debugLineNum = 8388625;BA.debugLine="lblFechaInicio.Text = DateTime.Date(DateTime.Now)";
[self->__lblfechainicio setText:[[self->___c DateTime] Date:[[self->___c DateTime] Now]]];
B4IRDebugUtils.currentLine=8388626;
 //BA.debugLineNum = 8388626;BA.debugLine="lblfechaFinal.Text = DateTime.Date(DateTime.Now)";
[self->__lblfechafinal setText:[[self->___c DateTime] Date:[[self->___c DateTime] Now]]];
B4IRDebugUtils.currentLine=8388627;
 //BA.debugLineNum = 8388627;BA.debugLine="BuscarOrdenes";
[self _buscarordenes];
B4IRDebugUtils.currentLine=8388629;
 //BA.debugLineNum = 8388629;BA.debugLine="Main.smc.Tag = \"reporte\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"reporte")];
B4IRDebugUtils.currentLine=8388632;
 //BA.debugLineNum = 8388632;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnaceptardate_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"btnaceptardate_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnaceptardate_click" :nil]);}
B4IRDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub btnAceptarDate_Click";
B4IRDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
[[self->___c DateTime] setDateFormat:@"yyyy-MM-dd"];
B4IRDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="If cualFe Then";
if (self->__cualfe) { 
B4IRDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="lblFechaInicio.Text = DateTime.Date(DateFecha.Ti";
[self->__lblfechainicio setText:[[self->___c DateTime] Date:[self->__datefecha Ticks]]];
 }else {
B4IRDebugUtils.currentLine=8650759;
 //BA.debugLineNum = 8650759;BA.debugLine="lblfechaFinal.Text =  DateTime.Date(DateFecha.Ti";
[self->__lblfechafinal setText:[[self->___c DateTime] Date:[self->__datefecha Ticks]]];
 };
B4IRDebugUtils.currentLine=8650762;
 //BA.debugLineNum = 8650762;BA.debugLine="btnCancelarDate_Click";
[self _btncancelardate_click];
B4IRDebugUtils.currentLine=8650764;
 //BA.debugLineNum = 8650764;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btncancelardate_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"btncancelardate_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btncancelardate_click" :nil]);}
B4IRDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub btnCancelarDate_Click";
B4IRDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="PanelFondoDatePicker.SetAlphaAnimated(500,0)";
[self->__panelfondodatepicker SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnaddallproorden_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"btnaddallproorden_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnaddallproorden_click" :nil]);}
B4IRDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="Sub btnAddAllproOrden_Click";
B4IRDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Msgbox2(\"Msg3\",\"Desea agregar todos los productos";
[self->___c Msgbox2:self.bi :@"Msg3" :@"Desea agregar todos los productos a su carrito?" :@"Aviso!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackproorden_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"btnbackproorden_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackproorden_click" :nil]);}
B4IRDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub btnbackProOrden_Click";
B4IRDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="PanelFondoDetalleOrden.SetAlphaAnimated(500,0)";
[self->__panelfondodetalleorden SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbuscarreporte_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"btnbuscarreporte_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbuscarreporte_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobbuscar = nil;
B4IRDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub btnBuscarReporte_Click";
B4IRDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="If DateTime.DateParse(lblfechaFinal.Text) >= Date";
if ([[self->___c DateTime] DateParse:[self->__lblfechafinal Text]]>=[[self->___c DateTime] DateParse:[self->__lblfechainicio Text]]) { 
B4IRDebugUtils.currentLine=8978438;
 //BA.debugLineNum = 8978438;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
[[self->___c DateTime] setDateFormat:@"yyyy-MM-dd"];
B4IRDebugUtils.currentLine=8978440;
 //BA.debugLineNum = 8978440;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=8978441;
 //BA.debugLineNum = 8978441;BA.debugLine="json = \"'f_fecha1':'\"&DateTime.Date(DateTime.Dat";
_json = [@[@"'f_fecha1':'",[[self->___c DateTime] Date:[[self->___c DateTime] DateParse:[self->__lblfechainicio Text]]],@"','f_fecha2':",[[self->___c DateTime] Date:[[self->___c DateTime] DateParse:[self->__lblfechafinal Text]]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=8978443;
 //BA.debugLineNum = 8978443;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=8978444;
 //BA.debugLineNum = 8978444;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
[_jobbuscar _initialize /*NSString**/ :nil :self.bi :@"JobBuscar" :self];
B4IRDebugUtils.currentLine=8978445;
 //BA.debugLineNum = 8978445;BA.debugLine="hud.ToastMessageShow(\"Buscando ordenes...\",False";
[self->__hud ToastMessageShow:@"Buscando ordenes..." :false];
B4IRDebugUtils.currentLine=8978446;
 //BA.debugLineNum = 8978446;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_or";
[_jobbuscar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/get_ordenes_cliente2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=8978449;
 //BA.debugLineNum = 8978449;BA.debugLine="Msgbox(\"La fecha final debe ser mayor a la fech";
[self->___c Msgbox:@"La fecha final debe ser mayor a la fecha de inicio para poder realizar la busqueda!!" :@"Advertencia!"];
 };
B4IRDebugUtils.currentLine=8978452;
 //BA.debugLineNum = 8978452;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnreporteback_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"btnreporteback_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnreporteback_click" :nil]);}
B4IRDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub btnReporteBack_Click";
B4IRDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=9699331;
 //BA.debugLineNum = 9699331;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Main.actualizarCantidad";
[self->__main _actualizarcantidad /*NSString**/ ];
B4IRDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buscarordenes{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"buscarordenes"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buscarordenes" :nil]);}
b4i_httpjob* _jobbuscar = nil;
B4IRDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub BuscarOrdenes";
B4IRDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=8716291;
 //BA.debugLineNum = 8716291;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
[_jobbuscar _initialize /*NSString**/ :nil :self.bi :@"JobBuscar" :self];
B4IRDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_ord";
[_jobbuscar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/get_ordenes_cliente"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _dir :(NSString*) _fecha :(NSString*) _principal :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"createlistitem"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem:::::" :@[[B4I nilToNSNull:_dir],[B4I nilToNSNull:_fecha],[B4I nilToNSNull:_principal],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub CreateListItem(Dir As String, fecha As String,";
B4IRDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="p.LoadLayout(\"frmItemsDir\")";
[_p LoadLayout:@"frmItemsDir" :self.bi];
B4IRDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="lblDir.Text = Dir";
[self->__lbldir setText:_dir];
B4IRDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="lblFecha.Text = fecha";
[self->__lblfecha setText:_fecha];
B4IRDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="lblPrincipal.Text = principal";
[self->__lblprincipal setText:_principal];
B4IRDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=8912905;
 //BA.debugLineNum = 8912905;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createlistitem2:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"createlistitem2"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem2:::::" :@[[B4I nilToNSNull:_nombre],[B4I nilToNSNull:_cantidad],[B4I nilToNSNull:_img],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub CreateListItem2(Nombre As String, cantidad As";
B4IRDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=8847363;
 //BA.debugLineNum = 8847363;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
[_p LoadLayout:@"frmPanelesItems" :self.bi];
B4IRDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="lblNomCat.Text = Nombre";
[self->__lblnomcat setText:_nombre];
B4IRDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="lblCantCat.Text = \"$ \"&cantidad";
[self->__lblcantcat setText:[@[@"$ ",_cantidad] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=8847367;
 //BA.debugLineNum = 8847367;BA.debugLine="imgCat.Bitmap = img";
[self->__imgcat setBitmap:_img];
B4IRDebugUtils.currentLine=8847368;
 //BA.debugLineNum = 8847368;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=8847369;
 //BA.debugLineNum = 8847369;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
NSString* _titulo = @"";
NSString* _secondline = @"";
NSString* _estado = @"";
int _i = 0;
B4IBitmap* _bm = nil;
B4IMap* _mapa = nil;
B4IRDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=8781827;
 //BA.debugLineNum = 8781827;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=8781828;
 //BA.debugLineNum = 8781828;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=8781831;
 //BA.debugLineNum = 8781831;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=8781832;
 //BA.debugLineNum = 8781832;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=8781835;
 //BA.debugLineNum = 8781835;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=8781836;
 //BA.debugLineNum = 8781836;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=8781837;
 //BA.debugLineNum = 8781837;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=8781838;
 //BA.debugLineNum = 8781838;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
[_json Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=8781839;
 //BA.debugLineNum = 8781839;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=8781841;
 //BA.debugLineNum = 8781841;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobBuscar",@"JobEliminar",@"BuscarProducto",@"JobDetalleTemporal",@"JobDetalleTemporalAll"]]) {
case 0: {
B4IRDebugUtils.currentLine=8781844;
 //BA.debugLineNum = 8781844;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=8781846;
 //BA.debugLineNum = 8781846;BA.debugLine="If list.Size == 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=8781847;
 //BA.debugLineNum = 8781847;BA.debugLine="Msgbox(\"No hay ordenes registradas\",\"Informaci";
[self->___c Msgbox:@"No hay ordenes registradas" :@"Información"];
B4IRDebugUtils.currentLine=8781848;
 //BA.debugLineNum = 8781848;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=8781851;
 //BA.debugLineNum = 8781851;BA.debugLine="Label3.Text = \"Ordenes registradas: \"&list.Size";
[self->__label3 setText:[@[@"Ordenes registradas: ",[self.bi NumberToString:@([_list Size])]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=8781853;
 //BA.debugLineNum = 8781853;BA.debugLine="Dim titulo As String";
_titulo = @"";
B4IRDebugUtils.currentLine=8781854;
 //BA.debugLineNum = 8781854;BA.debugLine="Dim secondLine As String";
_secondline = @"";
B4IRDebugUtils.currentLine=8781855;
 //BA.debugLineNum = 8781855;BA.debugLine="Dim estado As String";
_estado = @"";
B4IRDebugUtils.currentLine=8781857;
 //BA.debugLineNum = 8781857;BA.debugLine="listaOrdenes.Clear";
[self->__listaordenes _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=8781859;
 //BA.debugLineNum = 8781859;BA.debugLine="For i=0 To list.Size - 1";
{
const int step25 = 1;
const int limit25 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit25 ;_i = _i + step25 ) {
B4IRDebugUtils.currentLine=8781861;
 //BA.debugLineNum = 8781861;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=8781863;
 //BA.debugLineNum = 8781863;BA.debugLine="secondLine = \"Fecha: \"&map.Get(\"f_fecha_regstr";
_secondline = [@[@"Fecha: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_fecha_regstro_orden")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=8781864;
 //BA.debugLineNum = 8781864;BA.debugLine="estado = \"Estado: \"&map.Get(\"f_status\")";
_estado = [@[@"Estado: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_status")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=8781865;
 //BA.debugLineNum = 8781865;BA.debugLine="titulo = map.Get(\"f_negocio\")&\"   $\"&NumberFor";
_titulo = [@[[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_negocio")]],@"   $",[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_total")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=8781867;
 //BA.debugLineNum = 8781867;BA.debugLine="listaOrdenes.Add(CreateListItem(titulo,secondL";
[self->__listaordenes _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem:_titulo :_secondline :_estado :(int) ([[self->__listaordenes _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (65))]).object)] :(NSObject*)(_map)];
 }
};
 break; }
case 1: {
B4IRDebugUtils.currentLine=8781872;
 //BA.debugLineNum = 8781872;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=8781873;
 //BA.debugLineNum = 8781873;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"1")]) { 
B4IRDebugUtils.currentLine=8781874;
 //BA.debugLineNum = 8781874;BA.debugLine="listaOrdenes.RemoveAt(indiceBorrar)";
[self->__listaordenes _removeat /*NSString**/ :nil :self->__indiceborrar];
B4IRDebugUtils.currentLine=8781875;
 //BA.debugLineNum = 8781875;BA.debugLine="Msgbox(\"Orden cancelada.\",\"Información\")";
[self->___c Msgbox:@"Orden cancelada." :@"Información"];
 }else {
B4IRDebugUtils.currentLine=8781878;
 //BA.debugLineNum = 8781878;BA.debugLine="Msgbox(\"La orden ya no se puede ser cancelada.";
[self->___c Msgbox:@"La orden ya no se puede ser cancelada." :@"Información"];
 };
 break; }
case 2: {
B4IRDebugUtils.currentLine=8781883;
 //BA.debugLineNum = 8781883;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=8781884;
 //BA.debugLineNum = 8781884;BA.debugLine="listaAddAll.Clear";
[self->__listaaddall Clear];
B4IRDebugUtils.currentLine=8781885;
 //BA.debugLineNum = 8781885;BA.debugLine="listaAddAll = list";
self->__listaaddall = _list;
B4IRDebugUtils.currentLine=8781887;
 //BA.debugLineNum = 8781887;BA.debugLine="listAux = listaAddAll";
self->__listaux = self->__listaaddall;
B4IRDebugUtils.currentLine=8781889;
 //BA.debugLineNum = 8781889;BA.debugLine="PanelFondoDetalleOrden.Top = 0%y";
[self->__panelfondodetalleorden setTop:[self->___c PerYToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=8781890;
 //BA.debugLineNum = 8781890;BA.debugLine="PanelFondoDetalleOrden.SetAlphaAnimated(500,1)";
[self->__panelfondodetalleorden SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=8781892;
 //BA.debugLineNum = 8781892;BA.debugLine="lbltituloProOrden.Text = numOrden";
[self->__lbltituloproorden setText:self->__numorden];
B4IRDebugUtils.currentLine=8781894;
 //BA.debugLineNum = 8781894;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=8781896;
 //BA.debugLineNum = 8781896;BA.debugLine="ListProOrdenDetalle.Clear";
[self->__listproordendetalle _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=8781898;
 //BA.debugLineNum = 8781898;BA.debugLine="For i = 0 To list.Size-1";
{
const int step50 = 1;
const int limit50 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit50 ;_i = _i + step50 ) {
B4IRDebugUtils.currentLine=8781900;
 //BA.debugLineNum = 8781900;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=8781901;
 //BA.debugLineNum = 8781901;BA.debugLine="mapa = list.Get(i)";
_mapa = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=8781904;
 //BA.debugLineNum = 8781904;BA.debugLine="If  mapa.Get(\"f_foto\")<> Null And  mapa.Get(\"f";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=8781905;
 //BA.debugLineNum = 8781905;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=8781908;
 //BA.debugLineNum = 8781908;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=8781911;
 //BA.debugLineNum = 8781911;BA.debugLine="ListProOrdenDetalle.Add(CreateListItem2(mapa.G";
[self->__listproordendetalle _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem2:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]] :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_precio")]] :_bm :(int) ([[self->__listproordendetalle _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (50))]).object)] :(NSObject*)(_mapa)];
 }
};
 break; }
case 3: {
B4IRDebugUtils.currentLine=8781917;
 //BA.debugLineNum = 8781917;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=8781918;
 //BA.debugLineNum = 8781918;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"0")]) { 
B4IRDebugUtils.currentLine=8781919;
 //BA.debugLineNum = 8781919;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
[self->___c Msgbox:[@[@"Este producto no tiene existencia: ",@"\n",[self.bi ObjectToString:_job->__tag /*NSObject**/ ],@"."] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=8781920;
 //BA.debugLineNum = 8781920;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=8781922;
 //BA.debugLineNum = 8781922;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
self->__main->__cantidadproduto /*int*/  = (int) (self->__main->__cantidadproduto /*int*/ +1);
B4IRDebugUtils.currentLine=8781923;
 //BA.debugLineNum = 8781923;BA.debugLine="hud.ToastMessageShow(\"Producto agregado...\",Fal";
[self->__hud ToastMessageShow:@"Producto agregado..." :false];
 break; }
case 4: {
B4IRDebugUtils.currentLine=8781927;
 //BA.debugLineNum = 8781927;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=8781928;
 //BA.debugLineNum = 8781928;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"0")]) { 
B4IRDebugUtils.currentLine=8781929;
 //BA.debugLineNum = 8781929;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
[self->___c Msgbox:[@[@"Este producto no tiene existencia: ",@"\n",[self.bi ObjectToString:_job->__tag /*NSObject**/ ],@"."] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=8781930;
 //BA.debugLineNum = 8781930;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=8781932;
 //BA.debugLineNum = 8781932;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
self->__main->__cantidadproduto /*int*/  = (int) (self->__main->__cantidadproduto /*int*/ +1);
 break; }
}
;
B4IRDebugUtils.currentLine=8781936;
 //BA.debugLineNum = 8781936;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listaordenes_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"listaordenes_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listaordenes_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _mapa = nil;
NSString* _json = @"";
b4i_httpjob* _buscarproducto = nil;
B4IRDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub listaOrdenes_ItemClick (Index As Int, Value As";
B4IRDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="mapa = Value";
_mapa = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=9175047;
 //BA.debugLineNum = 9175047;BA.debugLine="Dim json As String = \"'f_idrecord':\"&mapa.Get(\"f_";
_json = [@[@"'f_idrecord':",[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=9175049;
 //BA.debugLineNum = 9175049;BA.debugLine="Dim BuscarProducto As HttpJob";
_buscarproducto = [b4i_httpjob new];
B4IRDebugUtils.currentLine=9175050;
 //BA.debugLineNum = 9175050;BA.debugLine="BuscarProducto.Initialize(\"BuscarProducto\",Me)";
[_buscarproducto _initialize /*NSString**/ :nil :self.bi :@"BuscarProducto" :self];
B4IRDebugUtils.currentLine=9175052;
 //BA.debugLineNum = 9175052;BA.debugLine="numOrden = mapa.Get(\"f_numero\")";
self->__numorden = [self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_numero")]];
B4IRDebugUtils.currentLine=9175053;
 //BA.debugLineNum = 9175053;BA.debugLine="listaAddAll.Initialize";
[self->__listaaddall Initialize];
B4IRDebugUtils.currentLine=9175055;
 //BA.debugLineNum = 9175055;BA.debugLine="BuscarProducto.PostString(Main.url&\"puntoventa/bu";
[_buscarproducto _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/buscar_productos_by_orden"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=9175057;
 //BA.debugLineNum = 9175057;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listaordenes_itemlongclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"listaordenes_itemlongclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listaordenes_itemlongclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Sub listaOrdenes_ItemLongClick (Index As Int, Valu";
B4IRDebugUtils.currentLine=9043971;
 //BA.debugLineNum = 9043971;BA.debugLine="Msgbox2(\"Msg1\",\"Desea elimiar esta orden?\",\"Adver";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Desea elimiar esta orden?" :@"Advertencia!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=9043972;
 //BA.debugLineNum = 9043972;BA.debugLine="mapaBorrar.Initialize";
[self->__mapaborrar Initialize];
B4IRDebugUtils.currentLine=9043973;
 //BA.debugLineNum = 9043973;BA.debugLine="mapaBorrar = Value";
self->__mapaborrar = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=9043974;
 //BA.debugLineNum = 9043974;BA.debugLine="indiceBorrar = Index";
self->__indiceborrar = _index;
B4IRDebugUtils.currentLine=9043976;
 //BA.debugLineNum = 9043976;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listproordendetalle_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"listproordendetalle_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listproordendetalle_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub ListProOrdenDetalle_ItemClick (Index As Int, V";
B4IRDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="Msgbox2(\"Msg2\",\"Desea agregar este producto a su";
[self->___c Msgbox2:self.bi :@"Msg2" :@"Desea agregar este producto a su carrito?" :@"Aviso!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="mapaDetalleOrden = Value";
self->__mapadetalleorden = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="indiceDetalleOrden = Index";
self->__indicedetalleorden = _index;
B4IRDebugUtils.currentLine=9240583;
 //BA.debugLineNum = 9240583;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msg1_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"msg1_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msg1_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IMap* _map = nil;
NSString* _json = @"";
b4i_httpjob* _jobeliminar = nil;
B4IRDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Msg1_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=9109508;
 //BA.debugLineNum = 9109508;BA.debugLine="Dim map As Map = mapaBorrar";
_map = self->__mapaborrar;
B4IRDebugUtils.currentLine=9109510;
 //BA.debugLineNum = 9109510;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=9109511;
 //BA.debugLineNum = 9109511;BA.debugLine="json = \"'f_idrecord':\"&map.Get(\"f_idrecord\")&\",'";
_json = [@[@"'f_idrecord':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_idempresa':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idempresa")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=9109513;
 //BA.debugLineNum = 9109513;BA.debugLine="Dim JobEliminar As HttpJob";
_jobeliminar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=9109514;
 //BA.debugLineNum = 9109514;BA.debugLine="JobEliminar.Initialize(\"JobEliminar\",Me)";
[_jobeliminar _initialize /*NSString**/ :nil :self.bi :@"JobEliminar" :self];
B4IRDebugUtils.currentLine=9109515;
 //BA.debugLineNum = 9109515;BA.debugLine="JobEliminar.PostString(Main.url&\"puntoventa/set_";
[_jobeliminar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/set_eliminar_orden"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=9109518;
 //BA.debugLineNum = 9109518;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=9109521;
 //BA.debugLineNum = 9109521;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msg2_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"msg2_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msg2_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IMap* _mapapro = nil;
B4IRDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="Sub Msg2_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="Dim mapaPro As Map";
_mapapro = [B4IMap new];
B4IRDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="mapaPro = mapaDetalleOrden";
_mapapro = self->__mapadetalleorden;
B4IRDebugUtils.currentLine=9437191;
 //BA.debugLineNum = 9437191;BA.debugLine="listAux.RemoveAt(indiceDetalleOrden)";
[self->__listaux RemoveAt:self->__indicedetalleorden];
B4IRDebugUtils.currentLine=9437194;
 //BA.debugLineNum = 9437194;BA.debugLine="salvar_detalle_temporal(mapaPro,1)";
[self _salvar_detalle_temporal:_mapapro :(int) (1)];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=9437197;
 //BA.debugLineNum = 9437197;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=9437200;
 //BA.debugLineNum = 9437200;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"salvar_detalle_temporal"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"salvar_detalle_temporal::" :@[[B4I nilToNSNull:_map],@(_cantidad)]]);}
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
B4IRDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
_mapcalculos = [self->__funciones _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :0 :_cantidad :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :self->__main->__impuestoincluido /*BOOL*/  :false];
B4IRDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_tipo':1",@",'f_idproducto':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_cantidad':",[self.bi NumberToString:@(_cantidad)],@"",@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_diferencia':0",@",'f_porciento_descuento':0",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_tax")]],@",'f_imei':",self->__main->__imei /*NSString**/ ] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=9568275;
 //BA.debugLineNum = 9568275;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=9568276;
 //BA.debugLineNum = 9568276;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=9568277;
 //BA.debugLineNum = 9568277;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=9568279;
 //BA.debugLineNum = 9568279;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msg3_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"msg3_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msg3_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
int _i = 0;
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="Sub Msg3_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="For i=0 To listAux.Size-1";
{
const int step2 = 1;
const int limit2 = (int) ([self->__listaux Size]-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
B4IRDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="map = listAux.Get(i)";
_map = (B4IMap*)([self->__listaux Get:_i]);
B4IRDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="salvar_detalle_temporal_All(map,1)";
[self _salvar_detalle_temporal_all:_map :(int) (1)];
 }
};
B4IRDebugUtils.currentLine=9502732;
 //BA.debugLineNum = 9502732;BA.debugLine="Msgbox(\"Se agregaron todos los productos en exis";
[self->___c Msgbox:@"Se agregaron todos los productos en existencia, verifique en su carrito!" :@"Realizado"];
B4IRDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="btnbackProOrden_Click";
[self _btnbackproorden_click];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=9502736;
 //BA.debugLineNum = 9502736;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _salvar_detalle_temporal_all:(B4IMap*) _map :(int) _cantidad{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"salvar_detalle_temporal_all"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"salvar_detalle_temporal_all::" :@[[B4I nilToNSNull:_map],@(_cantidad)]]);}
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal2 = nil;
B4IRDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="Sub salvar_detalle_temporal_All(map As Map, cantid";
B4IRDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
_mapcalculos = [self->__funciones _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :0 :_cantidad :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :self->__main->__impuestoincluido /*BOOL*/  :false];
B4IRDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_tipo':1",@",'f_idproducto':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_cantidad':",[self.bi NumberToString:@(_cantidad)],@"",@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_diferencia':0",@",'f_porciento_descuento':0",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_tax")]],@",'f_imei':",self->__main->__imei /*NSString**/ ] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=9633811;
 //BA.debugLineNum = 9633811;BA.debugLine="Dim JobDetalleTemporal2 As HttpJob";
_jobdetalletemporal2 = [b4i_httpjob new];
B4IRDebugUtils.currentLine=9633812;
 //BA.debugLineNum = 9633812;BA.debugLine="JobDetalleTemporal2.Initialize(\"JobDetalleTempora";
[_jobdetalletemporal2 _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporalAll" :self];
B4IRDebugUtils.currentLine=9633813;
 //BA.debugLineNum = 9633813;BA.debugLine="JobDetalleTemporal2.PostString(Main.url&\"puntoven";
[_jobdetalletemporal2 _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=9633815;
 //BA.debugLineNum = 9633815;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel1_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"panel1_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel1_click" :nil]);}
B4IRDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub Panel1_Click";
B4IRDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="cualFe = True";
self->__cualfe = true;
B4IRDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="PanelFondoDatePicker.Left = 0";
[self->__panelfondodatepicker setLeft:(float) (0)];
B4IRDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="PanelFondoDatePicker.SetAlphaAnimated(500,1)";
[self->__panelfondodatepicker SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="DateFecha.Ticks = DateTime.Now";
[self->__datefecha setTicks:[[self->___c DateTime] Now]];
B4IRDebugUtils.currentLine=8454152;
 //BA.debugLineNum = 8454152;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel3_click{
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"panel3_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel3_click" :nil]);}
B4IRDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub Panel3_Click";
B4IRDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="cualFe = False";
self->__cualfe = false;
B4IRDebugUtils.currentLine=8519683;
 //BA.debugLineNum = 8519683;BA.debugLine="PanelFondoDatePicker.Left = 0";
[self->__panelfondodatepicker setLeft:(float) (0)];
B4IRDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="PanelFondoDatePicker.SetAlphaAnimated(500,1)";
[self->__panelfondodatepicker SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="DateFecha.Ticks = DateTime.Now";
[self->__datefecha setTicks:[[self->___c DateTime] Now]];
B4IRDebugUtils.currentLine=8519688;
 //BA.debugLineNum = 8519688;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"reportes";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=8323076;
 //BA.debugLineNum = 8323076;BA.debugLine="Private pageReporte As Page";
self->__pagereporte = [B4IPage new];
B4IRDebugUtils.currentLine=8323078;
 //BA.debugLineNum = 8323078;BA.debugLine="Private Panel1 As Panel";
self->__panel1 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323079;
 //BA.debugLineNum = 8323079;BA.debugLine="Private Panel3 As Panel";
self->__panel3 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323080;
 //BA.debugLineNum = 8323080;BA.debugLine="Private lblFechaInicio As Label";
self->__lblfechainicio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323081;
 //BA.debugLineNum = 8323081;BA.debugLine="Private lblfechaFinal As Label";
self->__lblfechafinal = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323082;
 //BA.debugLineNum = 8323082;BA.debugLine="Private PanelFondoDatePicker As Panel";
self->__panelfondodatepicker = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323084;
 //BA.debugLineNum = 8323084;BA.debugLine="Dim cualFe As Boolean";
self->__cualfe = false;
B4IRDebugUtils.currentLine=8323085;
 //BA.debugLineNum = 8323085;BA.debugLine="Dim mapaBorrar As Map";
self->__mapaborrar = [B4IMap new];
B4IRDebugUtils.currentLine=8323086;
 //BA.debugLineNum = 8323086;BA.debugLine="Dim indiceBorrar As Int";
self->__indiceborrar = 0;
B4IRDebugUtils.currentLine=8323087;
 //BA.debugLineNum = 8323087;BA.debugLine="Dim numOrden As String";
self->__numorden = @"";
B4IRDebugUtils.currentLine=8323088;
 //BA.debugLineNum = 8323088;BA.debugLine="Dim listaAddAll As List";
self->__listaaddall = [B4IList new];
B4IRDebugUtils.currentLine=8323089;
 //BA.debugLineNum = 8323089;BA.debugLine="Dim listAux As List";
self->__listaux = [B4IList new];
B4IRDebugUtils.currentLine=8323090;
 //BA.debugLineNum = 8323090;BA.debugLine="Dim mapaDetalleOrden As Map";
self->__mapadetalleorden = [B4IMap new];
B4IRDebugUtils.currentLine=8323091;
 //BA.debugLineNum = 8323091;BA.debugLine="Dim indiceDetalleOrden As Int";
self->__indicedetalleorden = 0;
B4IRDebugUtils.currentLine=8323093;
 //BA.debugLineNum = 8323093;BA.debugLine="Private btnCancelarDate As Button";
self->__btncancelardate = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=8323094;
 //BA.debugLineNum = 8323094;BA.debugLine="Private btnAceptarDate As Button";
self->__btnaceptardate = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=8323095;
 //BA.debugLineNum = 8323095;BA.debugLine="Private DateFecha As DatePicker";
self->__datefecha = [B4IDatePickerWrapper new];
B4IRDebugUtils.currentLine=8323096;
 //BA.debugLineNum = 8323096;BA.debugLine="Private listaOrdenes As CustomListView";
self->__listaordenes = [b4i_customlistview new];
B4IRDebugUtils.currentLine=8323097;
 //BA.debugLineNum = 8323097;BA.debugLine="Private Label3 As Label";
self->__label3 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323098;
 //BA.debugLineNum = 8323098;BA.debugLine="Private lblDir As Label";
self->__lbldir = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323099;
 //BA.debugLineNum = 8323099;BA.debugLine="Private lblFecha As Label";
self->__lblfecha = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323100;
 //BA.debugLineNum = 8323100;BA.debugLine="Private lblPrincipal As Label";
self->__lblprincipal = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323101;
 //BA.debugLineNum = 8323101;BA.debugLine="Private btnBuscarReporte As Button";
self->__btnbuscarreporte = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=8323104;
 //BA.debugLineNum = 8323104;BA.debugLine="Dim hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=8323105;
 //BA.debugLineNum = 8323105;BA.debugLine="Private PanelFondoDetalleOrden As Panel";
self->__panelfondodetalleorden = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323106;
 //BA.debugLineNum = 8323106;BA.debugLine="Private lbltituloProOrden As Label";
self->__lbltituloproorden = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323107;
 //BA.debugLineNum = 8323107;BA.debugLine="Private ListProOrdenDetalle As CustomListView";
self->__listproordendetalle = [b4i_customlistview new];
B4IRDebugUtils.currentLine=8323108;
 //BA.debugLineNum = 8323108;BA.debugLine="Private btnbackProOrden As Button";
self->__btnbackproorden = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=8323109;
 //BA.debugLineNum = 8323109;BA.debugLine="Private btnAddAllproOrden As Button";
self->__btnaddallproorden = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=8323110;
 //BA.debugLineNum = 8323110;BA.debugLine="Private imgCat As ImageView";
self->__imgcat = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=8323111;
 //BA.debugLineNum = 8323111;BA.debugLine="Private lblNomCat As Label";
self->__lblnomcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323112;
 //BA.debugLineNum = 8323112;BA.debugLine="Private lblCantCat As Label";
self->__lblcantcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=8323113;
 //BA.debugLineNum = 8323113;BA.debugLine="Private btnReporteBack As Button";
self->__btnreporteback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=8323114;
 //BA.debugLineNum = 8323114;BA.debugLine="Private Panel2 As Panel";
self->__panel2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323115;
 //BA.debugLineNum = 8323115;BA.debugLine="Private PanelEncabezadoM As Panel";
self->__panelencabezadom = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323116;
 //BA.debugLineNum = 8323116;BA.debugLine="Private PanelEncabezadoRepo As Panel";
self->__panelencabezadorepo = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=8323117;
 //BA.debugLineNum = 8323117;BA.debugLine="End Sub";
return @"";
}
@end