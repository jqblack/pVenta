
#import "b4i_favoritos.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"

@interface ResumableSub_favoritos_btnagregarCarritoDetalle_Click :B4IResumableSub 
- (instancetype) init: (b4i_favoritos*) parent1;
@end
@implementation ResumableSub_favoritos_btnagregarCarritoDetalle_Click {
b4i_favoritos* parent;
}
- (instancetype) init: (b4i_favoritos*) parent1 {
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"favoritos";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=18415618;
 //BA.debugLineNum = 18415618;BA.debugLine="If mapadetalle.Get(\"f_precio\") <= 0 Then";
if (true) break;

case 1:
//if
self->_state = 6;
if ([self.bi ObjectToNumber:[parent->__mapadetalle Get:(NSObject*)(@"f_precio")]].doubleValue<=0) { 
self->_state = 3;
}else {
self->_state = 5;
}if (true) break;

case 3:
//C
self->_state = 6;
B4IRDebugUtils.currentLine=18415619;
 //BA.debugLineNum = 18415619;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
[parent->___c Msgbox:@"Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este" :@"Aviso"];
 if (true) break;

case 5:
//C
self->_state = 6;
B4IRDebugUtils.currentLine=18415623;
 //BA.debugLineNum = 18415623;BA.debugLine="salvar_detalle_temporal(mapadetalle,lblcantidad.";
[parent _salvar_detalle_temporal:parent->__mapadetalle :[self.bi ObjectToNumber:[parent->__lblcantidad Text]].intValue];
B4IRDebugUtils.currentLine=18415624;
 //BA.debugLineNum = 18415624;BA.debugLine="Sleep(200)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"favoritos" :@"btnagregarcarritodetalle_click"] :(int) (200)];
self->_state = 7;
return;
case 7:
//C
self->_state = 6;
;
B4IRDebugUtils.currentLine=18415625;
 //BA.debugLineNum = 18415625;BA.debugLine="btnBackDetalles_Click";
[parent _btnbackdetalles_click];
 if (true) break;

case 6:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=18415629;
 //BA.debugLineNum = 18415629;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_favoritos 


+ (instancetype)new {
    static b4i_favoritos* shared = nil;
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


- (NSString*)  _initilize{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"initilize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initilize" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobfavoritos = nil;
B4IRDebugUtils.currentLine=18022400;
 //BA.debugLineNum = 18022400;BA.debugLine="Sub Initilize";
B4IRDebugUtils.currentLine=18022402;
 //BA.debugLineNum = 18022402;BA.debugLine="pageFv.Initialize(\"pageFv\")";
[self->__pagefv Initialize:self.bi :@"pageFv"];
B4IRDebugUtils.currentLine=18022403;
 //BA.debugLineNum = 18022403;BA.debugLine="pageFv.RootPanel.LoadLayout(\"frmFavoritos\")";
[[self->__pagefv RootPanel] LoadLayout:@"frmFavoritos" :self.bi];
B4IRDebugUtils.currentLine=18022404;
 //BA.debugLineNum = 18022404;BA.debugLine="Main.NavControl.ShowPage(pageFv)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pagefv).object)];
B4IRDebugUtils.currentLine=18022406;
 //BA.debugLineNum = 18022406;BA.debugLine="pagedetalle.Initialize(\"pagedetalle\")";
[self->__pagedetalle Initialize:self.bi :@"pagedetalle"];
B4IRDebugUtils.currentLine=18022408;
 //BA.debugLineNum = 18022408;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__main->__usersdata /*_typeu**/ ->_idUsuario /*int*/ )],@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=18022410;
 //BA.debugLineNum = 18022410;BA.debugLine="Dim jobFavoritos As HttpJob";
_jobfavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=18022411;
 //BA.debugLineNum = 18022411;BA.debugLine="jobFavoritos.Initialize(\"RefreshFavoritos\",Me)";
[_jobfavoritos _initialize /*NSString**/ :nil :self.bi :@"RefreshFavoritos" :self];
B4IRDebugUtils.currentLine=18022412;
 //BA.debugLineNum = 18022412;BA.debugLine="hud.ToastMessageShow(\"Cargando sus Favoritos\",Fal";
[self->__hud ToastMessageShow:@"Cargando sus Favoritos" :false];
B4IRDebugUtils.currentLine=18022413;
 //BA.debugLineNum = 18022413;BA.debugLine="MilitaFav.Initialize";
[self->__militafav Initialize];
B4IRDebugUtils.currentLine=18022414;
 //BA.debugLineNum = 18022414;BA.debugLine="jobFavoritos.PostString(Main.url&\"puntoventa/busc";
[_jobfavoritos _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/buscarfav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=18022416;
 //BA.debugLineNum = 18022416;BA.debugLine="Main.smc.Tag = \"favoritos\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"favoritos")];
B4IRDebugUtils.currentLine=18022418;
 //BA.debugLineNum = 18022418;BA.debugLine="End Sub";
return @"";
}
- (void)  _btnagregarcarritodetalle_click{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"btnagregarcarritodetalle_click"])
	 {[B4IDebug delegate:self.bi :@"btnagregarcarritodetalle_click" :nil]; return;}
ResumableSub_favoritos_btnagregarCarritoDetalle_Click* rsub = [[ResumableSub_favoritos_btnagregarCarritoDetalle_Click alloc] init:self ];
[rsub resume:self.bi :nil];
}
//-505616658
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"salvar_detalle_temporal"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"salvar_detalle_temporal::" :@[[B4I nilToNSNull:_map],@(_cantidad)]]);}
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=18743296;
 //BA.debugLineNum = 18743296;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
B4IRDebugUtils.currentLine=18743298;
 //BA.debugLineNum = 18743298;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
_mapcalculos = [self->__funciones _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :0 :_cantidad :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :self->__main->__impuestoincluido /*BOOL*/  :false];
B4IRDebugUtils.currentLine=18743300;
 //BA.debugLineNum = 18743300;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=18743301;
 //BA.debugLineNum = 18743301;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_tipo':1",@",'f_idproducto':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_cantidad':",[self.bi NumberToString:@(_cantidad)],@"",@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_diferencia':0",@",'f_porciento_descuento':0",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_tax")]],@",'f_imei':",self->__main->__imei /*NSString**/ ] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=18743315;
 //BA.debugLineNum = 18743315;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=18743316;
 //BA.debugLineNum = 18743316;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=18743317;
 //BA.debugLineNum = 18743317;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=18743319;
 //BA.debugLineNum = 18743319;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackdetalles_click{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"btnbackdetalles_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackdetalles_click" :nil]);}
B4IRDebugUtils.currentLine=18481152;
 //BA.debugLineNum = 18481152;BA.debugLine="Sub btnBackDetalles_Click";
B4IRDebugUtils.currentLine=18481153;
 //BA.debugLineNum = 18481153;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=18481154;
 //BA.debugLineNum = 18481154;BA.debugLine="Main.NavControl.ShowPage(pageFv)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pagefv).object)];
B4IRDebugUtils.currentLine=18481155;
 //BA.debugLineNum = 18481155;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackfavoritos_click{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"btnbackfavoritos_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackfavoritos_click" :nil]);}
B4IRDebugUtils.currentLine=18087936;
 //BA.debugLineNum = 18087936;BA.debugLine="Sub btnBackFavoritos_Click";
B4IRDebugUtils.currentLine=18087938;
 //BA.debugLineNum = 18087938;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=18087939;
 //BA.debugLineNum = 18087939;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=18087941;
 //BA.debugLineNum = 18087941;BA.debugLine="If actuCantidad Then";
if (self->__actucantidad) { 
B4IRDebugUtils.currentLine=18087942;
 //BA.debugLineNum = 18087942;BA.debugLine="actuCantidad = False";
self->__actucantidad = false;
B4IRDebugUtils.currentLine=18087943;
 //BA.debugLineNum = 18087943;BA.debugLine="Main.actualizarCantidad";
[self->__main _actualizarcantidad /*NSString**/ ];
 };
B4IRDebugUtils.currentLine=18087946;
 //BA.debugLineNum = 18087946;BA.debugLine="If actu Then";
if (self->__actu) { 
B4IRDebugUtils.currentLine=18087947;
 //BA.debugLineNum = 18087947;BA.debugLine="actu = False";
self->__actu = false;
B4IRDebugUtils.currentLine=18087948;
 //BA.debugLineNum = 18087948;BA.debugLine="Main.actualizar";
[self->__main _actualizar /*NSString**/ ];
 };
B4IRDebugUtils.currentLine=18087951;
 //BA.debugLineNum = 18087951;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarlistafavoritos{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"cargarlistafavoritos"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarlistafavoritos" :nil]);}
B4IBitmap* _bm = nil;
int _i = 0;
B4IMap* _mapalist = nil;
B4IRDebugUtils.currentLine=18219008;
 //BA.debugLineNum = 18219008;BA.debugLine="Sub cargarListaFavoritos";
B4IRDebugUtils.currentLine=18219010;
 //BA.debugLineNum = 18219010;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=18219011;
 //BA.debugLineNum = 18219011;BA.debugLine="LlistaFavoritos.Clear";
[self->__llistafavoritos _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=18219012;
 //BA.debugLineNum = 18219012;BA.debugLine="lblCantProductos.Text = \"Productos Favoritos: \"&M";
[self->__lblcantproductos setText:[@[@"Productos Favoritos: ",[self.bi NumberToString:@([self->__militafav Size])]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=18219013;
 //BA.debugLineNum = 18219013;BA.debugLine="For i = 0 To MilitaFav.Size-1";
{
const int step4 = 1;
const int limit4 = (int) ([self->__militafav Size]-1);
_i = (int) (0) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
B4IRDebugUtils.currentLine=18219014;
 //BA.debugLineNum = 18219014;BA.debugLine="Dim mapalist As Map";
_mapalist = [B4IMap new];
B4IRDebugUtils.currentLine=18219015;
 //BA.debugLineNum = 18219015;BA.debugLine="mapalist = MilitaFav.Get(i)";
_mapalist = (B4IMap*)([self->__militafav Get:_i]);
B4IRDebugUtils.currentLine=18219018;
 //BA.debugLineNum = 18219018;BA.debugLine="If  mapalist.Get(\"f_foto\")<> Null And  mapalist.";
if ([_mapalist Get:(NSObject*)(@"f_foto")]!= nil && [[_mapalist Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=18219019;
 //BA.debugLineNum = 18219019;BA.debugLine="bm = funciones.getImagen(mapalist.Get(\"f_foto\")";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapalist Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=18219021;
 //BA.debugLineNum = 18219021;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=18219024;
 //BA.debugLineNum = 18219024;BA.debugLine="mapalist.Put(\"f_red\",True)";
[_mapalist Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=18219026;
 //BA.debugLineNum = 18219026;BA.debugLine="LlistaFavoritos.Add(CreateListItem(mapalist.Get(";
[self->__llistafavoritos _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem:[self.bi ObjectToString:[_mapalist Get:(NSObject*)(@"f_descripcion")]] :[@[@"Precio: ",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapalist Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""] :_bm :(int) ([[self->__llistafavoritos _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (50))]).object)] :(NSObject*)(_mapalist)];
 }
};
B4IRDebugUtils.currentLine=18219030;
 //BA.debugLineNum = 18219030;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"createlistitem"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem:::::" :@[[B4I nilToNSNull:_nombre],[B4I nilToNSNull:_cantidad],[B4I nilToNSNull:_img],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=18284544;
 //BA.debugLineNum = 18284544;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As S";
B4IRDebugUtils.currentLine=18284546;
 //BA.debugLineNum = 18284546;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=18284547;
 //BA.debugLineNum = 18284547;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=18284548;
 //BA.debugLineNum = 18284548;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=18284549;
 //BA.debugLineNum = 18284549;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
[_p LoadLayout:@"frmPanelesItems" :self.bi];
B4IRDebugUtils.currentLine=18284550;
 //BA.debugLineNum = 18284550;BA.debugLine="lblNomCat.Text = Nombre";
[self->__lblnomcat setText:_nombre];
B4IRDebugUtils.currentLine=18284551;
 //BA.debugLineNum = 18284551;BA.debugLine="lblCantCat.Text = cantidad";
[self->__lblcantcat setText:_cantidad];
B4IRDebugUtils.currentLine=18284552;
 //BA.debugLineNum = 18284552;BA.debugLine="imgCat.Bitmap = img";
[self->__imgcat setBitmap:_img];
B4IRDebugUtils.currentLine=18284553;
 //BA.debugLineNum = 18284553;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=18284555;
 //BA.debugLineNum = 18284555;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _imgdetallefav_click{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"imgdetallefav_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"imgdetallefav_click" :nil]);}
B4IRDebugUtils.currentLine=18612224;
 //BA.debugLineNum = 18612224;BA.debugLine="Sub imgdetallefav_Click";
B4IRDebugUtils.currentLine=18612226;
 //BA.debugLineNum = 18612226;BA.debugLine="Msgbox2(\"msgEliminar\",\"Seguro que quiere quitar e";
[self->___c Msgbox2:self.bi :@"msgEliminar" :@"Seguro que quiere quitar este producto de sus favoritos?" :@"Aviso!!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=18612228;
 //BA.debugLineNum = 18612228;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
int _i = 0;
B4IMap* _mapadel = nil;
B4IRDebugUtils.currentLine=18153472;
 //BA.debugLineNum = 18153472;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=18153475;
 //BA.debugLineNum = 18153475;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=18153476;
 //BA.debugLineNum = 18153476;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=18153477;
 //BA.debugLineNum = 18153477;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=18153480;
 //BA.debugLineNum = 18153480;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=18153481;
 //BA.debugLineNum = 18153481;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=18153484;
 //BA.debugLineNum = 18153484;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=18153485;
 //BA.debugLineNum = 18153485;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=18153486;
 //BA.debugLineNum = 18153486;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=18153487;
 //BA.debugLineNum = 18153487;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
[_json Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=18153488;
 //BA.debugLineNum = 18153488;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=18153490;
 //BA.debugLineNum = 18153490;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"RefreshFavoritos",@"JobDetalleTemporal",@"deleteFavoritos"]]) {
case 0: {
B4IRDebugUtils.currentLine=18153493;
 //BA.debugLineNum = 18153493;BA.debugLine="If MilitaFav.IsInitialized Then";
if ([self->__militafav IsInitialized]) { 
B4IRDebugUtils.currentLine=18153494;
 //BA.debugLineNum = 18153494;BA.debugLine="MilitaFav.Clear";
[self->__militafav Clear];
 };
B4IRDebugUtils.currentLine=18153497;
 //BA.debugLineNum = 18153497;BA.debugLine="MilitaFav = map.Get(\"f_data\")";
self->__militafav.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=18153498;
 //BA.debugLineNum = 18153498;BA.debugLine="cargarListaFavoritos";
[self _cargarlistafavoritos];
 break; }
case 1: {
B4IRDebugUtils.currentLine=18153502;
 //BA.debugLineNum = 18153502;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=18153503;
 //BA.debugLineNum = 18153503;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"0")]) { 
B4IRDebugUtils.currentLine=18153504;
 //BA.debugLineNum = 18153504;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
[self->___c Msgbox:[@[@"Este producto no tiene existencia: ",@"\n",[self.bi ObjectToString:_job->__tag /*NSObject**/ ],@"."] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=18153505;
 //BA.debugLineNum = 18153505;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=18153507;
 //BA.debugLineNum = 18153507;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
self->__main->__cantidadproduto /*int*/  = (int) (self->__main->__cantidadproduto /*int*/ +1);
B4IRDebugUtils.currentLine=18153510;
 //BA.debugLineNum = 18153510;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
[self->__hud ToastMessageShow:@"Producto agregado al carrito." :false];
B4IRDebugUtils.currentLine=18153511;
 //BA.debugLineNum = 18153511;BA.debugLine="actuCantidad = True";
self->__actucantidad = true;
 break; }
case 2: {
B4IRDebugUtils.currentLine=18153515;
 //BA.debugLineNum = 18153515;BA.debugLine="If map.Get(\"f_data\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_data")]]) { 
B4IRDebugUtils.currentLine=18153516;
 //BA.debugLineNum = 18153516;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado de fa";
[self->__hud ToastMessageShow:@"Producto eliminado de favorito" :false];
B4IRDebugUtils.currentLine=18153518;
 //BA.debugLineNum = 18153518;BA.debugLine="For i=0 To MilitaFav.Size-1";
{
const int step32 = 1;
const int limit32 = (int) ([self->__militafav Size]-1);
_i = (int) (0) ;
for (;_i <= limit32 ;_i = _i + step32 ) {
B4IRDebugUtils.currentLine=18153520;
 //BA.debugLineNum = 18153520;BA.debugLine="Dim mapadel As Map";
_mapadel = [B4IMap new];
B4IRDebugUtils.currentLine=18153521;
 //BA.debugLineNum = 18153521;BA.debugLine="mapadel = MilitaFav.Get(i)";
_mapadel = (B4IMap*)([self->__militafav Get:_i]);
B4IRDebugUtils.currentLine=18153523;
 //BA.debugLineNum = 18153523;BA.debugLine="If mapadetalle.Get(\"f_idrecord\") == mapadel.G";
if ([[self->__mapadetalle Get:(NSObject*)(@"f_idrecord")] isEqual:[_mapadel Get:(NSObject*)(@"f_idrecord")]]) { 
B4IRDebugUtils.currentLine=18153524;
 //BA.debugLineNum = 18153524;BA.debugLine="MilitaFav.RemoveAt(i)";
[self->__militafav RemoveAt:_i];
B4IRDebugUtils.currentLine=18153525;
 //BA.debugLineNum = 18153525;BA.debugLine="i = MilitaFav.Size";
_i = [self->__militafav Size];
 };
 }
};
B4IRDebugUtils.currentLine=18153530;
 //BA.debugLineNum = 18153530;BA.debugLine="actu = True";
self->__actu = true;
B4IRDebugUtils.currentLine=18153531;
 //BA.debugLineNum = 18153531;BA.debugLine="cargarListaFavoritos";
[self _cargarlistafavoritos];
B4IRDebugUtils.currentLine=18153532;
 //BA.debugLineNum = 18153532;BA.debugLine="btnBackDetalles_Click";
[self _btnbackdetalles_click];
 }else {
B4IRDebugUtils.currentLine=18153534;
 //BA.debugLineNum = 18153534;BA.debugLine="hud.ToastMessageShow(\"Hubo un error a remover";
[self->__hud ToastMessageShow:@"Hubo un error a remover este producto de su lista de favritos" :false];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=18153539;
 //BA.debugLineNum = 18153539;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _llistafavoritos_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"llistafavoritos_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"llistafavoritos_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _mapa = nil;
B4IBitmap* _bm = nil;
B4IBitmap* _bmimgfav = nil;
B4IRDebugUtils.currentLine=18350080;
 //BA.debugLineNum = 18350080;BA.debugLine="Sub LlistaFavoritos_ItemClick (Index As Int, Value";
B4IRDebugUtils.currentLine=18350082;
 //BA.debugLineNum = 18350082;BA.debugLine="Dim mapa As Map = Value";
_mapa = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=18350083;
 //BA.debugLineNum = 18350083;BA.debugLine="mapadetalle = mapa";
self->__mapadetalle = _mapa;
B4IRDebugUtils.currentLine=18350085;
 //BA.debugLineNum = 18350085;BA.debugLine="pagedetalle.RootPanel.LoadLayout(\"frmDetalleProdu";
[[self->__pagedetalle RootPanel] LoadLayout:@"frmDetalleProducto" :self.bi];
B4IRDebugUtils.currentLine=18350087;
 //BA.debugLineNum = 18350087;BA.debugLine="Main.NavControl.ShowPage2(pagedetalle,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__pagedetalle).object) :true];
B4IRDebugUtils.currentLine=18350089;
 //BA.debugLineNum = 18350089;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=18350091;
 //BA.debugLineNum = 18350091;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_fo";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=18350092;
 //BA.debugLineNum = 18350092;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]];
B4IRDebugUtils.currentLine=18350094;
 //BA.debugLineNum = 18350094;BA.debugLine="ImageViewDetalles.Bitmap= bm";
[self->__imageviewdetalles setBitmap:_bm];
 }else {
B4IRDebugUtils.currentLine=18350097;
 //BA.debugLineNum = 18350097;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
B4IRDebugUtils.currentLine=18350099;
 //BA.debugLineNum = 18350099;BA.debugLine="ImageViewDetalles.Bitmap = bm";
[self->__imageviewdetalles setBitmap:_bm];
 };
B4IRDebugUtils.currentLine=18350104;
 //BA.debugLineNum = 18350104;BA.debugLine="Dim bmimgfav As Bitmap";
_bmimgfav = [B4IBitmap new];
B4IRDebugUtils.currentLine=18350106;
 //BA.debugLineNum = 18350106;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartRed.png\"";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartRed.png"];
B4IRDebugUtils.currentLine=18350108;
 //BA.debugLineNum = 18350108;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
[self->__imgdetallefav setBitmap:_bmimgfav];
B4IRDebugUtils.currentLine=18350111;
 //BA.debugLineNum = 18350111;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
[self->__btnagregarcarritodetalle SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=18350112;
 //BA.debugLineNum = 18350112;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
[self->__panelimagendetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=18350113;
 //BA.debugLineNum = 18350113;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
[self->__panellblcantidad SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (1))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=18350114;
 //BA.debugLineNum = 18350114;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
[self->__panelencabezadodetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=18350116;
 //BA.debugLineNum = 18350116;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
[self->__lblprecioencabezado setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=18350117;
 //BA.debugLineNum = 18350117;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
[self->__lblnombeencabezado setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=18350118;
 //BA.debugLineNum = 18350118;BA.debugLine="lblcantidad.Text = 1";
[self->__lblcantidad setText:[self.bi NumberToString:@(1)]];
B4IRDebugUtils.currentLine=18350119;
 //BA.debugLineNum = 18350119;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
[self->__steppercantidad setValue:[self.bi ObjectToNumber:[self->__lblcantidad Text]].doubleValue];
B4IRDebugUtils.currentLine=18350120;
 //BA.debugLineNum = 18350120;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
[self->__lblprecio setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=18350122;
 //BA.debugLineNum = 18350122;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgeliminar_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"msgeliminar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgeliminar_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
NSString* _json = @"";
b4i_httpjob* _deletefavoritos = nil;
B4IRDebugUtils.currentLine=18677760;
 //BA.debugLineNum = 18677760;BA.debugLine="Sub msgEliminar_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=18677762;
 //BA.debugLineNum = 18677762;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=18677764;
 //BA.debugLineNum = 18677764;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.users";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__main->__usersdata /*_typeu**/ ->_idUsuario /*int*/ )],@",'f_idproducto':",[self.bi ObjectToString:[self->__mapadetalle Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=18677767;
 //BA.debugLineNum = 18677767;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=18677768;
 //BA.debugLineNum = 18677768;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me)";
[_deletefavoritos _initialize /*NSString**/ :nil :self.bi :@"deleteFavoritos" :self];
B4IRDebugUtils.currentLine=18677769;
 //BA.debugLineNum = 18677769;BA.debugLine="deleteFavoritos.PostString(Main.url&\"puntoventa/";
[_deletefavoritos _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/deletefav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=18677773;
 //BA.debugLineNum = 18677773;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=18677776;
 //BA.debugLineNum = 18677776;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=17956864;
 //BA.debugLineNum = 17956864;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=17956868;
 //BA.debugLineNum = 17956868;BA.debugLine="Dim pageFv As Page";
self->__pagefv = [B4IPage new];
B4IRDebugUtils.currentLine=17956869;
 //BA.debugLineNum = 17956869;BA.debugLine="Dim pagedetalle As Page";
self->__pagedetalle = [B4IPage new];
B4IRDebugUtils.currentLine=17956870;
 //BA.debugLineNum = 17956870;BA.debugLine="Dim mapadetalle As Map";
self->__mapadetalle = [B4IMap new];
B4IRDebugUtils.currentLine=17956871;
 //BA.debugLineNum = 17956871;BA.debugLine="Dim actu As Boolean = False";
self->__actu = false;
B4IRDebugUtils.currentLine=17956872;
 //BA.debugLineNum = 17956872;BA.debugLine="Dim actuCantidad As Boolean = False";
self->__actucantidad = false;
B4IRDebugUtils.currentLine=17956874;
 //BA.debugLineNum = 17956874;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=17956876;
 //BA.debugLineNum = 17956876;BA.debugLine="Private lblCantProductos As Label";
self->__lblcantproductos = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956877;
 //BA.debugLineNum = 17956877;BA.debugLine="Private btnBackFavoritos As Button";
self->__btnbackfavoritos = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=17956878;
 //BA.debugLineNum = 17956878;BA.debugLine="Private LlistaFavoritos As CustomListView";
self->__llistafavoritos = [b4i_customlistview new];
B4IRDebugUtils.currentLine=17956880;
 //BA.debugLineNum = 17956880;BA.debugLine="Dim MilitaFav As List";
self->__militafav = [B4IList new];
B4IRDebugUtils.currentLine=17956881;
 //BA.debugLineNum = 17956881;BA.debugLine="Private lblNomCat As Label";
self->__lblnomcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956882;
 //BA.debugLineNum = 17956882;BA.debugLine="Private lblCantCat As Label";
self->__lblcantcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956883;
 //BA.debugLineNum = 17956883;BA.debugLine="Private imgCat As ImageView";
self->__imgcat = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=17956884;
 //BA.debugLineNum = 17956884;BA.debugLine="Private PanelFondoDetalles As Panel";
self->__panelfondodetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=17956885;
 //BA.debugLineNum = 17956885;BA.debugLine="Private ImageViewDetalles As ImageView";
self->__imageviewdetalles = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=17956886;
 //BA.debugLineNum = 17956886;BA.debugLine="Private lblPrecioEncabezado As Label";
self->__lblprecioencabezado = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956887;
 //BA.debugLineNum = 17956887;BA.debugLine="Private lblNombeEncabezado As Label";
self->__lblnombeencabezado = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956888;
 //BA.debugLineNum = 17956888;BA.debugLine="Private imgdetallefav As ImageView";
self->__imgdetallefav = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=17956889;
 //BA.debugLineNum = 17956889;BA.debugLine="Private lblcantidad As Label";
self->__lblcantidad = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956890;
 //BA.debugLineNum = 17956890;BA.debugLine="Private btnless As Button";
self->__btnless = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=17956891;
 //BA.debugLineNum = 17956891;BA.debugLine="Private btnMore As Button";
self->__btnmore = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=17956892;
 //BA.debugLineNum = 17956892;BA.debugLine="Private lblPrecio As Label";
self->__lblprecio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956893;
 //BA.debugLineNum = 17956893;BA.debugLine="Private btnagregarCarritoDetalle As Button";
self->__btnagregarcarritodetalle = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=17956894;
 //BA.debugLineNum = 17956894;BA.debugLine="Private btnBackDetalles As Button";
self->__btnbackdetalles = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=17956895;
 //BA.debugLineNum = 17956895;BA.debugLine="Private PanelImagenDetalles As Panel";
self->__panelimagendetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=17956896;
 //BA.debugLineNum = 17956896;BA.debugLine="Private PanellblCantidad As Panel";
self->__panellblcantidad = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=17956897;
 //BA.debugLineNum = 17956897;BA.debugLine="Private PanelEncabezadoDetalles As Panel";
self->__panelencabezadodetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=17956898;
 //BA.debugLineNum = 17956898;BA.debugLine="Private StepperCantidad As Stepper";
self->__steppercantidad = [B4IStepperWrapper new];
B4IRDebugUtils.currentLine=17956899;
 //BA.debugLineNum = 17956899;BA.debugLine="Private lblCantidadProductos As Label";
self->__lblcantidadproductos = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=17956900;
 //BA.debugLineNum = 17956900;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _steppercantidad_valuechanged:(double) _value{
B4IRDebugUtils.currentModule=@"favoritos";
if ([B4IDebug shouldDelegate: @"steppercantidad_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"steppercantidad_valuechanged:" :@[@(_value)]]);}
B4IRDebugUtils.currentLine=18546688;
 //BA.debugLineNum = 18546688;BA.debugLine="Sub StepperCantidad_ValueChanged (Value As Double)";
B4IRDebugUtils.currentLine=18546689;
 //BA.debugLineNum = 18546689;BA.debugLine="lblcantidad.Text = Value";
[self->__lblcantidad setText:[self.bi NumberToString:@(_value)]];
B4IRDebugUtils.currentLine=18546690;
 //BA.debugLineNum = 18546690;BA.debugLine="End Sub";
return @"";
}
@end