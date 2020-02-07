
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
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"

@interface ResumableSub_main_JobDone :B4IResumableSub 
- (instancetype) init: (b4i_main*) parent1 :(b4i_httpjob*) _job1;
@end
@implementation ResumableSub_main_JobDone {
b4i_main* parent;
b4i_httpjob* _job;
B4IMap* _map;
B4IList* _list;
B4IJSONParser* _json2;
int _i;
B4IBitmap* _bm;
int _lef;
int _wi;
B4IMap* _mapa;
B4ILabelWrapper* _lblmasvendidos;
int _leflbl;
B4ILabelWrapper* _lblproductos;
int _alttop;
int _lef2;
int _lef3;
}
- (instancetype) init: (b4i_main*) parent1 :(b4i_httpjob*) _job1 {
self->_job = _job1;
self->parent = parent1;
return self;
}
int step22;
int limit22;
int step47;
int limit47;
int step86;
int limit86;
int step109;
int limit109;
int step162;
int limit162;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"main";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=6356995;
 //BA.debugLineNum = 6356995;BA.debugLine="hud.ProgressDialogHide";
[parent->__hud ProgressDialogHide];
B4IRDebugUtils.currentLine=6356997;
 //BA.debugLineNum = 6356997;BA.debugLine="If Job.Success = False Then";
if (true) break;

case 1:
//if
self->_state = 4;
if (self->_job->__success /*BOOL*/ ==false) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=6356998;
 //BA.debugLineNum = 6356998;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
[parent->___c Msgbox:parent->__jobmsj :parent->__jobmsjtitle];
B4IRDebugUtils.currentLine=6356999;
 //BA.debugLineNum = 6356999;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
B4IRDebugUtils.currentLine=6357002;
 //BA.debugLineNum = 6357002;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";

case 4:
//if
self->_state = 7;
if ([parent->__funciones _verificarjob /*BOOL*/ :[self->_job _getstring /*NSString**/ :nil]]==false) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=6357003;
 //BA.debugLineNum = 6357003;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
self->_state = 8;
;
B4IRDebugUtils.currentLine=6357006;
 //BA.debugLineNum = 6357006;BA.debugLine="Dim map As Map";
self->_map = [B4IMap new];
B4IRDebugUtils.currentLine=6357007;
 //BA.debugLineNum = 6357007;BA.debugLine="Dim list As List";
self->_list = [B4IList new];
B4IRDebugUtils.currentLine=6357008;
 //BA.debugLineNum = 6357008;BA.debugLine="Dim json2 As JSONParser";
self->_json2 = [B4IJSONParser new];
B4IRDebugUtils.currentLine=6357011;
 //BA.debugLineNum = 6357011;BA.debugLine="json2.Initialize(funciones.base64_Decode(Job.GetS";
[self->_json2 Initialize:[parent->__funciones _base64_decode /*NSString**/ :[self->_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=6357013;
 //BA.debugLineNum = 6357013;BA.debugLine="map = json2.NextObject";
self->_map = [self->_json2 NextObject];
B4IRDebugUtils.currentLine=6357015;
 //BA.debugLineNum = 6357015;BA.debugLine="Select Job.JobName";
if (true) break;

case 8:
//select
self->_state = 140;
switch ([self.bi switchObjectToInt:self->_job->__jobname /*NSString**/  :@[@"JobBuscarProducto",@"JobProductoMasVendido",@"JobBuscarProductoALL",@"JobDetalleTemporal",@"JobEmpresaInfo",@"buscarFavoritos",@"addFavoritos",@"deleteFavoritos",@"cantidadPro"]]) {
case 0: {
self->_state = 10;
if (true) break;
}
case 1: {
self->_state = 25;
if (true) break;
}
case 2: {
self->_state = 41;
if (true) break;
}
case 3: {
self->_state = 93;
if (true) break;
}
case 4: {
self->_state = 99;
if (true) break;
}
case 5: {
self->_state = 101;
if (true) break;
}
case 6: {
self->_state = 111;
if (true) break;
}
case 7: {
self->_state = 119;
if (true) break;
}
case 8: {
self->_state = 135;
if (true) break;
}
}
if (true) break;

case 10:
//C
self->_state = 11;
B4IRDebugUtils.currentLine=6357019;
 //BA.debugLineNum = 6357019;BA.debugLine="ListaBusquedaPro.Clear";
[parent->__listabusquedapro _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=6357021;
 //BA.debugLineNum = 6357021;BA.debugLine="list = map.Get(\"f_data\")";
self->_list.object = (NSArray*)([self->_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6357022;
 //BA.debugLineNum = 6357022;BA.debugLine="If list.Size = 0 Then";
if (true) break;

case 11:
//if
self->_state = 14;
if ([self->_list Size]==0) { 
self->_state = 13;
}if (true) break;

case 13:
//C
self->_state = 14;
B4IRDebugUtils.currentLine=6357023;
 //BA.debugLineNum = 6357023;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
[parent->___c Msgbox:@"No se ha encontrado productos con esta referencia" :@"Información"];
B4IRDebugUtils.currentLine=6357024;
 //BA.debugLineNum = 6357024;BA.debugLine="Return";
if (true) return ;
 if (true) break;
;
B4IRDebugUtils.currentLine=6357027;
 //BA.debugLineNum = 6357027;BA.debugLine="For i=0 To list.Size -1";

case 14:
//for
self->_state = 23;
step22 = 1;
limit22 = (int) ([self->_list Size]-1);
self->_i = (int) (0) ;
self->_state = 141;
if (true) break;

case 141:
//C
self->_state = 23;
if ((step22 > 0 && self->_i <= limit22) || (step22 < 0 && self->_i >= limit22)) self->_state = 16;
if (true) break;

case 142:
//C
self->_state = 141;
self->_i = ((int)(0 + self->_i + step22)) ;
if (true) break;

case 16:
//C
self->_state = 17;
B4IRDebugUtils.currentLine=6357029;
 //BA.debugLineNum = 6357029;BA.debugLine="map = list.Get(i)";
self->_map = (B4IMap*)([self->_list Get:self->_i]);
B4IRDebugUtils.currentLine=6357030;
 //BA.debugLineNum = 6357030;BA.debugLine="Dim bm As Bitmap";
self->_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=6357032;
 //BA.debugLineNum = 6357032;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if (true) break;

case 17:
//if
self->_state = 22;
if ([self->_map Get:(NSObject*)(@"f_foto")]!= nil && [[self->_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
self->_state = 19;
}else {
self->_state = 21;
}if (true) break;

case 19:
//C
self->_state = 22;
B4IRDebugUtils.currentLine=6357034;
 //BA.debugLineNum = 6357034;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
self->_bm = [parent->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[self->_map Get:(NSObject*)(@"f_foto")]]];
 if (true) break;

case 21:
//C
self->_state = 22;
B4IRDebugUtils.currentLine=6357037;
 //BA.debugLineNum = 6357037;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[self->_bm Initialize:[[parent->___c File] DirAssets] :@"no-image.jpg"];
 if (true) break;

case 22:
//C
self->_state = 142;
;
B4IRDebugUtils.currentLine=6357040;
 //BA.debugLineNum = 6357040;BA.debugLine="ListaBusquedaPro.Add(CreateListItem(map.Get(\"f";
[parent->__listabusquedapro _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([parent _createlistitem:[self.bi ObjectToString:[self->_map Get:(NSObject*)(@"f_descripcion")]] :[@[@"Precio: ",[parent->___c NumberFormat:[self.bi ObjectToNumber:[self->_map Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""] :self->_bm :(int) ([[parent->__listabusquedapro _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (50))]).object)] :(NSObject*)(self->_map)];
 if (true) break;
if (true) break;

case 23:
//C
self->_state = 140;
;
 if (true) break;

case 25:
//C
self->_state = 26;
B4IRDebugUtils.currentLine=6357047;
 //BA.debugLineNum = 6357047;BA.debugLine="list = map.Get(\"f_data\")";
self->_list.object = (NSArray*)([self->_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6357049;
 //BA.debugLineNum = 6357049;BA.debugLine="Dim lef As Int = 0%x";
self->_lef = (int) ([parent->___c PerXToCurrent:(float) (0)]);
B4IRDebugUtils.currentLine=6357050;
 //BA.debugLineNum = 6357050;BA.debugLine="Dim wi As Int =  0%x 'ViewCategoria.Width*(list";
self->_wi = (int) ([parent->___c PerXToCurrent:(float) (0)]);
B4IRDebugUtils.currentLine=6357051;
 //BA.debugLineNum = 6357051;BA.debugLine="Dim mapa As Map";
self->_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=6357052;
 //BA.debugLineNum = 6357052;BA.debugLine="mapa.Initialize";
[self->_mapa Initialize];
B4IRDebugUtils.currentLine=6357054;
 //BA.debugLineNum = 6357054;BA.debugLine="If list.Size < 1 Then";
if (true) break;

case 26:
//if
self->_state = 35;
if ([self->_list Size]<1) { 
self->_state = 28;
}if (true) break;

case 28:
//C
self->_state = 29;
B4IRDebugUtils.currentLine=6357056;
 //BA.debugLineNum = 6357056;BA.debugLine="If IsUsa Then";
if (true) break;

case 29:
//if
self->_state = 34;
if (parent->__isusa) { 
self->_state = 31;
}else {
self->_state = 33;
}if (true) break;

case 31:
//C
self->_state = 34;
B4IRDebugUtils.currentLine=6357057;
 //BA.debugLineNum = 6357057;BA.debugLine="Msgbox(\"there isn't product in register\",\"War";
[parent->___c Msgbox:@"there isn't product in register" :@"Warning!"];
 if (true) break;

case 33:
//C
self->_state = 34;
B4IRDebugUtils.currentLine=6357059;
 //BA.debugLineNum = 6357059;BA.debugLine="Msgbox(\"No tienes productos registrados\",\"Avi";
[parent->___c Msgbox:@"No tienes productos registrados" :@"Aviso!"];
 if (true) break;

case 34:
//C
self->_state = 35;
;
B4IRDebugUtils.currentLine=6357062;
 //BA.debugLineNum = 6357062;BA.debugLine="hud2.ProgressDialogHide";
[parent->__hud2 ProgressDialogHide];
 if (true) break;

case 35:
//C
self->_state = 36;
;
B4IRDebugUtils.currentLine=6357065;
 //BA.debugLineNum = 6357065;BA.debugLine="Hscroll.Initialize(\"\",47%x*list.Size,ViewCatego";
[parent->__hscroll Initialize:self.bi :@"" :(int) ([parent->___c PerXToCurrent:(float) (47)]*[self->_list Size]) :(int) ([parent->__viewcategoria Height]*0.40)];
B4IRDebugUtils.currentLine=6357067;
 //BA.debugLineNum = 6357067;BA.debugLine="For i = 0 To list.Size-1";
if (true) break;

case 36:
//for
self->_state = 39;
step47 = 1;
limit47 = (int) ([self->_list Size]-1);
self->_i = (int) (0) ;
self->_state = 143;
if (true) break;

case 143:
//C
self->_state = 39;
if ((step47 > 0 && self->_i <= limit47) || (step47 < 0 && self->_i >= limit47)) self->_state = 38;
if (true) break;

case 144:
//C
self->_state = 143;
self->_i = ((int)(0 + self->_i + step47)) ;
if (true) break;

case 38:
//C
self->_state = 144;
B4IRDebugUtils.currentLine=6357068;
 //BA.debugLineNum = 6357068;BA.debugLine="mapa = list.Get(i)";
self->_mapa = (B4IMap*)([self->_list Get:self->_i]);
B4IRDebugUtils.currentLine=6357070;
 //BA.debugLineNum = 6357070;BA.debugLine="Hscroll.Panel.AddView(createPanelProducto(mapa";
[[parent->__hscroll Panel] AddView:(UIView*)(([parent _createpanelproducto:self->_mapa]).object) :(float) (self->_lef) :(float) (((int) (0))) :(float) ([parent->__viewcategoria Width]*0.47) :(float) ([parent->__viewcategoria Height]*0.40)];
B4IRDebugUtils.currentLine=6357071;
 //BA.debugLineNum = 6357071;BA.debugLine="lef = lef + ViewCategoria.Width * 0.49";
self->_lef = (int) (self->_lef+[parent->__viewcategoria Width]*0.49);
B4IRDebugUtils.currentLine=6357072;
 //BA.debugLineNum = 6357072;BA.debugLine="wi = wi + ViewCategoria.Width * 0.47";
self->_wi = (int) (self->_wi+[parent->__viewcategoria Width]*0.47);
B4IRDebugUtils.currentLine=6357073;
 //BA.debugLineNum = 6357073;BA.debugLine="Hscroll.Width = wi";
[parent->__hscroll setWidth:(float) (self->_wi)];
 if (true) break;
if (true) break;

case 39:
//C
self->_state = 140;
;
B4IRDebugUtils.currentLine=6357077;
 //BA.debugLineNum = 6357077;BA.debugLine="Hscroll.Color = Colors.RGB(222, 222, 222)";
[parent->__hscroll setColor:[[parent->___c Colors] RGB:(int) (222) :(int) (222) :(int) (222)]];
B4IRDebugUtils.currentLine=6357079;
 //BA.debugLineNum = 6357079;BA.debugLine="cargarAllProductos";
[parent _cargarallproductos];
B4IRDebugUtils.currentLine=6357081;
 //BA.debugLineNum = 6357081;BA.debugLine="Dim lblmasVendidos As Label";
self->_lblmasvendidos = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=6357082;
 //BA.debugLineNum = 6357082;BA.debugLine="lblmasVendidos.Initialize(\"\")";
[self->_lblmasvendidos Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6357083;
 //BA.debugLineNum = 6357083;BA.debugLine="lblmasVendidos.Tag = \"hola\"";
[self->_lblmasvendidos setTag:(NSObject*)(@"hola")];
B4IRDebugUtils.currentLine=6357084;
 //BA.debugLineNum = 6357084;BA.debugLine="lblmasVendidos.Text = \"Mas vendidos\"";
[self->_lblmasvendidos setText:@"Mas vendidos"];
B4IRDebugUtils.currentLine=6357085;
 //BA.debugLineNum = 6357085;BA.debugLine="lblmasVendidos.TextColor = Colors.RGB(97, 97, 9";
[self->_lblmasvendidos setTextColor:[[parent->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=6357086;
 //BA.debugLineNum = 6357086;BA.debugLine="lblmasVendidos.Font = Font.CreateNew(20)";
[self->_lblmasvendidos setFont:[[parent->___c Font] CreateNew:(float) (20)]];
B4IRDebugUtils.currentLine=6357088;
 //BA.debugLineNum = 6357088;BA.debugLine="Dim lefLbl As Int = ViewCategoria.Width * 0.03";
self->_leflbl = (int) ([parent->__viewcategoria Width]*0.03);
B4IRDebugUtils.currentLine=6357090;
 //BA.debugLineNum = 6357090;BA.debugLine="ViewCategoria.Panel.AddView(lblmasVendidos,lefL";
[[parent->__viewcategoria Panel] AddView:(UIView*)((self->_lblmasvendidos).object) :(float) (self->_leflbl) :(float) ([parent->__viewcategoria Height]-[parent->__viewcategoria Height]) :(float) ([parent->__viewcategoria Width]*0.30) :(float) ([parent->__viewcategoria Height]*0.05)];
B4IRDebugUtils.currentLine=6357092;
 //BA.debugLineNum = 6357092;BA.debugLine="ViewCategoria.Panel.AddView(Hscroll,0%x,ViewCat";
[[parent->__viewcategoria Panel] AddView:(UIView*)((parent->__hscroll).object) :[parent->___c PerXToCurrent:(float) (0)] :(float) ([parent->__viewcategoria Height]*0.06) :[parent->__viewcategoria Width] :(float) ([parent->__viewcategoria Height]*0.41)];
 if (true) break;

case 41:
//C
self->_state = 42;
B4IRDebugUtils.currentLine=6357097;
 //BA.debugLineNum = 6357097;BA.debugLine="list = map.Get(\"f_data\")";
self->_list.object = (NSArray*)([self->_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6357098;
 //BA.debugLineNum = 6357098;BA.debugLine="If list.Size < 1 Then";
if (true) break;

case 42:
//if
self->_state = 51;
if ([self->_list Size]<1) { 
self->_state = 44;
}if (true) break;

case 44:
//C
self->_state = 45;
B4IRDebugUtils.currentLine=6357100;
 //BA.debugLineNum = 6357100;BA.debugLine="If IsUsa Then";
if (true) break;

case 45:
//if
self->_state = 50;
if (parent->__isusa) { 
self->_state = 47;
}else {
self->_state = 49;
}if (true) break;

case 47:
//C
self->_state = 50;
B4IRDebugUtils.currentLine=6357101;
 //BA.debugLineNum = 6357101;BA.debugLine="Msgbox(\"we can't found any product for you\",\"";
[parent->___c Msgbox:@"we can't found any product for you" :@"Warning!"];
 if (true) break;

case 49:
//C
self->_state = 50;
B4IRDebugUtils.currentLine=6357103;
 //BA.debugLineNum = 6357103;BA.debugLine="Msgbox(\"No se ha encontrado productos\",\"Infor";
[parent->___c Msgbox:@"No se ha encontrado productos" :@"Información"];
 if (true) break;

case 50:
//C
self->_state = 51;
;
B4IRDebugUtils.currentLine=6357106;
 //BA.debugLineNum = 6357106;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 51:
//C
self->_state = 52;
;
B4IRDebugUtils.currentLine=6357109;
 //BA.debugLineNum = 6357109;BA.debugLine="Dim lblProductos As Label";
self->_lblproductos = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=6357110;
 //BA.debugLineNum = 6357110;BA.debugLine="lblProductos.Initialize(\"\")";
[self->_lblproductos Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6357112;
 //BA.debugLineNum = 6357112;BA.debugLine="lblProductos.Text = \"Productos\"";
[self->_lblproductos setText:@"Productos"];
B4IRDebugUtils.currentLine=6357113;
 //BA.debugLineNum = 6357113;BA.debugLine="lblProductos.Font = Font.CreateNew(20)";
[self->_lblproductos setFont:[[parent->___c Font] CreateNew:(float) (20)]];
B4IRDebugUtils.currentLine=6357114;
 //BA.debugLineNum = 6357114;BA.debugLine="lblProductos.TextColor = Colors.RGB(97, 97, 97)";
[self->_lblproductos setTextColor:[[parent->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=6357116;
 //BA.debugLineNum = 6357116;BA.debugLine="ViewCategoria.Panel.AddView(lblProductos,4dip,V";
[[parent->__viewcategoria Panel] AddView:(UIView*)((self->_lblproductos).object) :(float) (((int) (4))) :(float) ([parent->__viewcategoria Height]*0.50) :(float) ([parent->__viewcategoria Width]*0.30) :(float) ([parent->__viewcategoria Height]*0.05)];
B4IRDebugUtils.currentLine=6357120;
 //BA.debugLineNum = 6357120;BA.debugLine="Dim lef As Int = 0%x";
self->_lef = (int) ([parent->___c PerXToCurrent:(float) (0)]);
B4IRDebugUtils.currentLine=6357122;
 //BA.debugLineNum = 6357122;BA.debugLine="If list.Size > 20 Then";
if (true) break;

case 52:
//if
self->_state = 91;
if ([self->_list Size]>20) { 
self->_state = 54;
}else {
self->_state = 75;
}if (true) break;

case 54:
//C
self->_state = 55;
B4IRDebugUtils.currentLine=6357124;
 //BA.debugLineNum = 6357124;BA.debugLine="Dim alttop As Int  = ViewCategoria.Height * 0.";
self->_alttop = (int) ([parent->__viewcategoria Height]*0.56);
B4IRDebugUtils.currentLine=6357125;
 //BA.debugLineNum = 6357125;BA.debugLine="Dim lef2 As Int = 0%x";
self->_lef2 = (int) ([parent->___c PerXToCurrent:(float) (0)]);
B4IRDebugUtils.currentLine=6357126;
 //BA.debugLineNum = 6357126;BA.debugLine="Dim lef3 As Int = ViewCategoria.Width * 0.49";
self->_lef3 = (int) ([parent->__viewcategoria Width]*0.49);
B4IRDebugUtils.currentLine=6357128;
 //BA.debugLineNum = 6357128;BA.debugLine="For i=0 To 19";
if (true) break;

case 55:
//for
self->_state = 73;
step86 = 1;
limit86 = (int) (19);
self->_i = (int) (0) ;
self->_state = 145;
if (true) break;

case 145:
//C
self->_state = 73;
if ((step86 > 0 && self->_i <= limit86) || (step86 < 0 && self->_i >= limit86)) self->_state = 57;
if (true) break;

case 146:
//C
self->_state = 145;
self->_i = ((int)(0 + self->_i + step86)) ;
if (true) break;

case 57:
//C
self->_state = 58;
B4IRDebugUtils.currentLine=6357129;
 //BA.debugLineNum = 6357129;BA.debugLine="map = list.Get(i)";
self->_map = (B4IMap*)([self->_list Get:self->_i]);
B4IRDebugUtils.currentLine=6357130;
 //BA.debugLineNum = 6357130;BA.debugLine="Dim bm As Bitmap";
self->_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=6357131;
 //BA.debugLineNum = 6357131;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
if (true) break;

case 58:
//if
self->_state = 63;
if ([self->_map Get:(NSObject*)(@"f_foto")]!= nil && [[self->_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
self->_state = 60;
}else {
self->_state = 62;
}if (true) break;

case 60:
//C
self->_state = 63;
B4IRDebugUtils.currentLine=6357132;
 //BA.debugLineNum = 6357132;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
self->_bm = [parent->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[self->_map Get:(NSObject*)(@"f_foto")]]];
 if (true) break;

case 62:
//C
self->_state = 63;
B4IRDebugUtils.currentLine=6357135;
 //BA.debugLineNum = 6357135;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[self->_bm Initialize:[[parent->___c File] DirAssets] :@"no-image.jpg"];
 if (true) break;
;
B4IRDebugUtils.currentLine=6357138;
 //BA.debugLineNum = 6357138;BA.debugLine="If i Mod 2 == 0 Then";

case 63:
//if
self->_state = 72;
if (self->_i%2==0) { 
self->_state = 65;
}else {
self->_state = 71;
}if (true) break;

case 65:
//C
self->_state = 66;
B4IRDebugUtils.currentLine=6357140;
 //BA.debugLineNum = 6357140;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
[[parent->__viewcategoria Panel] AddView:(UIView*)(([parent _createpanelproductoscroll:self->_map :self->_bm]).object) :(float) (self->_lef2) :(float) (self->_alttop) :(float) ([parent->__viewcategoria Width]*0.47) :(float) ([parent->__viewcategoria Height]*0.41)];
B4IRDebugUtils.currentLine=6357142;
 //BA.debugLineNum = 6357142;BA.debugLine="If i == list.Size-1 Then";
if (true) break;

case 66:
//if
self->_state = 69;
if (self->_i==[self->_list Size]-1) { 
self->_state = 68;
}if (true) break;

case 68:
//C
self->_state = 69;
B4IRDebugUtils.currentLine=6357143;
 //BA.debugLineNum = 6357143;BA.debugLine="alttop = alttop +  ViewCategoria.Height * 0";
self->_alttop = (int) (self->_alttop+[parent->__viewcategoria Height]*0.42);
 if (true) break;

case 69:
//C
self->_state = 72;
;
 if (true) break;

case 71:
//C
self->_state = 72;
B4IRDebugUtils.currentLine=6357148;
 //BA.debugLineNum = 6357148;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
[[parent->__viewcategoria Panel] AddView:(UIView*)(([parent _createpanelproductoscroll:self->_map :self->_bm]).object) :(float) (self->_lef3) :(float) (self->_alttop) :(float) ([parent->__viewcategoria Width]*0.47) :(float) ([parent->__viewcategoria Height]*0.41)];
B4IRDebugUtils.currentLine=6357149;
 //BA.debugLineNum = 6357149;BA.debugLine="alttop = alttop +  ViewCategoria.Height * 0.";
self->_alttop = (int) (self->_alttop+[parent->__viewcategoria Height]*0.42);
 if (true) break;

case 72:
//C
self->_state = 146;
;
 if (true) break;
if (true) break;

case 73:
//C
self->_state = 91;
;
B4IRDebugUtils.currentLine=6357155;
 //BA.debugLineNum = 6357155;BA.debugLine="ViewCategoria.ContentHeight = alttop";
[parent->__viewcategoria setContentHeight:self->_alttop];
 if (true) break;

case 75:
//C
self->_state = 76;
B4IRDebugUtils.currentLine=6357159;
 //BA.debugLineNum = 6357159;BA.debugLine="Dim alttop As Int  = ViewCategoria.Height * 0.";
self->_alttop = (int) ([parent->__viewcategoria Height]*0.56);
B4IRDebugUtils.currentLine=6357160;
 //BA.debugLineNum = 6357160;BA.debugLine="Dim lef2 As Int = 0%x";
self->_lef2 = (int) ([parent->___c PerXToCurrent:(float) (0)]);
B4IRDebugUtils.currentLine=6357161;
 //BA.debugLineNum = 6357161;BA.debugLine="Dim lef3 As Int = ViewCategoria.Width * 0.49";
self->_lef3 = (int) ([parent->__viewcategoria Width]*0.49);
B4IRDebugUtils.currentLine=6357164;
 //BA.debugLineNum = 6357164;BA.debugLine="For i=0 To list.Size-1";
if (true) break;

case 76:
//for
self->_state = 90;
step109 = 1;
limit109 = (int) ([self->_list Size]-1);
self->_i = (int) (0) ;
self->_state = 147;
if (true) break;

case 147:
//C
self->_state = 90;
if ((step109 > 0 && self->_i <= limit109) || (step109 < 0 && self->_i >= limit109)) self->_state = 78;
if (true) break;

case 148:
//C
self->_state = 147;
self->_i = ((int)(0 + self->_i + step109)) ;
if (true) break;

case 78:
//C
self->_state = 79;
B4IRDebugUtils.currentLine=6357165;
 //BA.debugLineNum = 6357165;BA.debugLine="map = list.Get(i)";
self->_map = (B4IMap*)([self->_list Get:self->_i]);
B4IRDebugUtils.currentLine=6357166;
 //BA.debugLineNum = 6357166;BA.debugLine="Dim bm As Bitmap";
self->_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=6357167;
 //BA.debugLineNum = 6357167;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_f";
if (true) break;

case 79:
//if
self->_state = 84;
if ([self->_map Get:(NSObject*)(@"f_foto")]!= nil && [[self->_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
self->_state = 81;
}else {
self->_state = 83;
}if (true) break;

case 81:
//C
self->_state = 84;
B4IRDebugUtils.currentLine=6357168;
 //BA.debugLineNum = 6357168;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
self->_bm = [parent->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[self->_map Get:(NSObject*)(@"f_foto")]]];
 if (true) break;

case 83:
//C
self->_state = 84;
B4IRDebugUtils.currentLine=6357170;
 //BA.debugLineNum = 6357170;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[self->_bm Initialize:[[parent->___c File] DirAssets] :@"no-image.jpg"];
 if (true) break;
;
B4IRDebugUtils.currentLine=6357173;
 //BA.debugLineNum = 6357173;BA.debugLine="If i Mod 2 == 0 Then";

case 84:
//if
self->_state = 89;
if (self->_i%2==0) { 
self->_state = 86;
}else {
self->_state = 88;
}if (true) break;

case 86:
//C
self->_state = 89;
B4IRDebugUtils.currentLine=6357176;
 //BA.debugLineNum = 6357176;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
[[parent->__viewcategoria Panel] AddView:(UIView*)(([parent _createpanelproductoscroll:self->_map :self->_bm]).object) :(float) (self->_lef2) :(float) (self->_alttop) :(float) ([parent->__viewcategoria Width]*0.47) :(float) ([parent->__viewcategoria Height]*0.40)];
 if (true) break;

case 88:
//C
self->_state = 89;
B4IRDebugUtils.currentLine=6357180;
 //BA.debugLineNum = 6357180;BA.debugLine="ViewCategoria.ContentHeight = ViewCategoria.";
[parent->__viewcategoria setContentHeight:(int) ([[parent->__viewcategoria Panel] Height])];
B4IRDebugUtils.currentLine=6357182;
 //BA.debugLineNum = 6357182;BA.debugLine="ViewCategoria.Panel.AddView(createPanelProdu";
[[parent->__viewcategoria Panel] AddView:(UIView*)(([parent _createpanelproductoscroll:self->_map :self->_bm]).object) :(float) (self->_lef3) :(float) (self->_alttop) :(float) ([parent->__viewcategoria Width]*0.47) :(float) ([parent->__viewcategoria Height]*0.40)];
B4IRDebugUtils.currentLine=6357184;
 //BA.debugLineNum = 6357184;BA.debugLine="alttop = alttop +  ViewCategoria.Height * 0.";
self->_alttop = (int) (self->_alttop+[parent->__viewcategoria Height]*0.42);
 if (true) break;

case 89:
//C
self->_state = 148;
;
 if (true) break;
if (true) break;

case 90:
//C
self->_state = 91;
;
 if (true) break;

case 91:
//C
self->_state = 140;
;
B4IRDebugUtils.currentLine=6357192;
 //BA.debugLineNum = 6357192;BA.debugLine="hud2.ProgressDialogHide";
[parent->__hud2 ProgressDialogHide];
 if (true) break;

case 93:
//C
self->_state = 94;
B4IRDebugUtils.currentLine=6357197;
 //BA.debugLineNum = 6357197;BA.debugLine="map = map.Get(\"f_data\")";
self->_map = (B4IMap*)([self->_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6357198;
 //BA.debugLineNum = 6357198;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if (true) break;

case 94:
//if
self->_state = 97;
if ([[self->_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"0")]) { 
self->_state = 96;
}if (true) break;

case 96:
//C
self->_state = 97;
B4IRDebugUtils.currentLine=6357199;
 //BA.debugLineNum = 6357199;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
[parent->___c Msgbox:[@[@"Este producto no tiene existencia: ",@"\n",[self.bi ObjectToString:self->_job->__tag /*NSObject**/ ],@"."] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=6357200;
 //BA.debugLineNum = 6357200;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 97:
//C
self->_state = 140;
;
B4IRDebugUtils.currentLine=6357202;
 //BA.debugLineNum = 6357202;BA.debugLine="cantidadProduto = cantidadProduto + 1";
parent->__cantidadproduto = (int) (parent->__cantidadproduto+1);
B4IRDebugUtils.currentLine=6357203;
 //BA.debugLineNum = 6357203;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
[parent->__lblcantidadproductos setText:[self.bi NumberToString:@(parent->__cantidadproduto)]];
B4IRDebugUtils.currentLine=6357204;
 //BA.debugLineNum = 6357204;BA.debugLine="lblCantidadProductos.Visible = True";
[parent->__lblcantidadproductos setVisible:true];
B4IRDebugUtils.currentLine=6357205;
 //BA.debugLineNum = 6357205;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
[parent->__hud ToastMessageShow:@"Producto agregado al carrito." :false];
 if (true) break;

case 99:
//C
self->_state = 140;
B4IRDebugUtils.currentLine=6357209;
 //BA.debugLineNum = 6357209;BA.debugLine="list = map.Get(\"f_data\")";
self->_list.object = (NSArray*)([self->_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6357210;
 //BA.debugLineNum = 6357210;BA.debugLine="mapEmpresaInfo = list.Get(0)";
parent->__mapempresainfo = (B4IMap*)([self->_list Get:(int) (0)]);
B4IRDebugUtils.currentLine=6357212;
 //BA.debugLineNum = 6357212;BA.debugLine="IsUsa = mapEmpresaInfo.Get(\"f_adressusa\")";
parent->__isusa = [self.bi ObjectToBoolean:[parent->__mapempresainfo Get:(NSObject*)(@"f_adressusa")]];
 if (true) break;

case 101:
//C
self->_state = 102;
B4IRDebugUtils.currentLine=6357216;
 //BA.debugLineNum = 6357216;BA.debugLine="If listafavoritos.IsInitialized Then";
if (true) break;

case 102:
//if
self->_state = 105;
if ([parent->__listafavoritos IsInitialized]) { 
self->_state = 104;
}if (true) break;

case 104:
//C
self->_state = 105;
B4IRDebugUtils.currentLine=6357217;
 //BA.debugLineNum = 6357217;BA.debugLine="listafavoritos.Clear";
[parent->__listafavoritos Clear];
 if (true) break;

case 105:
//C
self->_state = 106;
;
B4IRDebugUtils.currentLine=6357220;
 //BA.debugLineNum = 6357220;BA.debugLine="listafavoritos = map.Get(\"f_data\")";
parent->__listafavoritos.object = (NSArray*)([self->_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=6357222;
 //BA.debugLineNum = 6357222;BA.debugLine="buscarfavoritosvar = False";
parent->__buscarfavoritosvar = false;
B4IRDebugUtils.currentLine=6357225;
 //BA.debugLineNum = 6357225;BA.debugLine="If CargarAgain Then";
if (true) break;

case 106:
//if
self->_state = 109;
if (parent->__cargaragain) { 
self->_state = 108;
}if (true) break;

case 108:
//C
self->_state = 109;
B4IRDebugUtils.currentLine=6357226;
 //BA.debugLineNum = 6357226;BA.debugLine="cargarDatos";
[parent _cargardatos];
B4IRDebugUtils.currentLine=6357227;
 //BA.debugLineNum = 6357227;BA.debugLine="CargarAgain = False";
parent->__cargaragain = false;
 if (true) break;

case 109:
//C
self->_state = 140;
;
 if (true) break;

case 111:
//C
self->_state = 112;
B4IRDebugUtils.currentLine=6357233;
 //BA.debugLineNum = 6357233;BA.debugLine="If map.Get(\"f_data\") Then";
if (true) break;

case 112:
//if
self->_state = 117;
if ([self.bi ObjectToBoolean:[self->_map Get:(NSObject*)(@"f_data")]]) { 
self->_state = 114;
}else {
self->_state = 116;
}if (true) break;

case 114:
//C
self->_state = 117;
B4IRDebugUtils.currentLine=6357235;
 //BA.debugLineNum = 6357235;BA.debugLine="listafavoritos.Add(mapaDetalleImagen)";
[parent->__listafavoritos Add:(NSObject*)(parent->__mapadetalleimagen)];
B4IRDebugUtils.currentLine=6357237;
 //BA.debugLineNum = 6357237;BA.debugLine="Sleep(100)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"main" :@"jobdone"] :(int) (100)];
self->_state = 149;
return;
case 149:
//C
self->_state = 117;
;
B4IRDebugUtils.currentLine=6357239;
 //BA.debugLineNum = 6357239;BA.debugLine="hud.ToastMessageShow(\"Producto agregado a favo";
[parent->__hud ToastMessageShow:@"Producto agregado a favoritos" :false];
B4IRDebugUtils.currentLine=6357241;
 //BA.debugLineNum = 6357241;BA.debugLine="BuscarFavoritos";
[parent _buscarfavoritos];
 if (true) break;

case 116:
//C
self->_state = 117;
B4IRDebugUtils.currentLine=6357243;
 //BA.debugLineNum = 6357243;BA.debugLine="hud.ToastMessageShow(\"Error al agregar su prod";
[parent->__hud ToastMessageShow:@"Error al agregar su producto a favoritos" :false];
 if (true) break;

case 117:
//C
self->_state = 140;
;
 if (true) break;

case 119:
//C
self->_state = 120;
B4IRDebugUtils.currentLine=6357248;
 //BA.debugLineNum = 6357248;BA.debugLine="If map.Get(\"f_data\") Then";
if (true) break;

case 120:
//if
self->_state = 133;
if ([self.bi ObjectToBoolean:[self->_map Get:(NSObject*)(@"f_data")]]) { 
self->_state = 122;
}else {
self->_state = 132;
}if (true) break;

case 122:
//C
self->_state = 123;
B4IRDebugUtils.currentLine=6357250;
 //BA.debugLineNum = 6357250;BA.debugLine="For i=0 To listafavoritos.Size-1";
if (true) break;

case 123:
//for
self->_state = 130;
step162 = 1;
limit162 = (int) ([parent->__listafavoritos Size]-1);
self->_i = (int) (0) ;
self->_state = 150;
if (true) break;

case 150:
//C
self->_state = 130;
if ((step162 > 0 && self->_i <= limit162) || (step162 < 0 && self->_i >= limit162)) self->_state = 125;
if (true) break;

case 151:
//C
self->_state = 150;
self->_i = ((int)(0 + self->_i + step162)) ;
if (true) break;

case 125:
//C
self->_state = 126;
B4IRDebugUtils.currentLine=6357252;
 //BA.debugLineNum = 6357252;BA.debugLine="Dim map As Map = listafavoritos.Get(i)";
self->_map = (B4IMap*)([parent->__listafavoritos Get:self->_i]);
B4IRDebugUtils.currentLine=6357254;
 //BA.debugLineNum = 6357254;BA.debugLine="If map.Get(\"f_idrecord\") == mapaDetalleImagen";
if (true) break;

case 126:
//if
self->_state = 129;
if ([[self->_map Get:(NSObject*)(@"f_idrecord")] isEqual:[parent->__mapadetalleimagen Get:(NSObject*)(@"f_idproducto")]]) { 
self->_state = 128;
}if (true) break;

case 128:
//C
self->_state = 129;
B4IRDebugUtils.currentLine=6357255;
 //BA.debugLineNum = 6357255;BA.debugLine="listafavoritos.RemoveAt(i)";
[parent->__listafavoritos RemoveAt:self->_i];
B4IRDebugUtils.currentLine=6357256;
 //BA.debugLineNum = 6357256;BA.debugLine="i = listafavoritos.Size";
self->_i = [parent->__listafavoritos Size];
 if (true) break;

case 129:
//C
self->_state = 151;
;
 if (true) break;
if (true) break;

case 130:
//C
self->_state = 133;
;
B4IRDebugUtils.currentLine=6357260;
 //BA.debugLineNum = 6357260;BA.debugLine="Sleep(100)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"main" :@"jobdone"] :(int) (100)];
self->_state = 152;
return;
case 152:
//C
self->_state = 133;
;
B4IRDebugUtils.currentLine=6357262;
 //BA.debugLineNum = 6357262;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado de fa";
[parent->__hud ToastMessageShow:@"Producto eliminado de favorito" :false];
B4IRDebugUtils.currentLine=6357263;
 //BA.debugLineNum = 6357263;BA.debugLine="BuscarFavoritos";
[parent _buscarfavoritos];
 if (true) break;

case 132:
//C
self->_state = 133;
B4IRDebugUtils.currentLine=6357265;
 //BA.debugLineNum = 6357265;BA.debugLine="hud.ToastMessageShow(\"Hubo un error a remover";
[parent->__hud ToastMessageShow:@"Hubo un error a remover este producto de su lista de favritos" :false];
 if (true) break;

case 133:
//C
self->_state = 140;
;
 if (true) break;

case 135:
//C
self->_state = 136;
B4IRDebugUtils.currentLine=6357270;
 //BA.debugLineNum = 6357270;BA.debugLine="cantidadProduto = map.Get(\"f_data\")";
parent->__cantidadproduto = [self.bi ObjectToNumber:[self->_map Get:(NSObject*)(@"f_data")]].intValue;
B4IRDebugUtils.currentLine=6357272;
 //BA.debugLineNum = 6357272;BA.debugLine="If cantidadProduto <> 0 Then";
if (true) break;

case 136:
//if
self->_state = 139;
if (parent->__cantidadproduto!=0) { 
self->_state = 138;
}if (true) break;

case 138:
//C
self->_state = 139;
B4IRDebugUtils.currentLine=6357274;
 //BA.debugLineNum = 6357274;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
[parent->__lblcantidadproductos setText:[self.bi NumberToString:@(parent->__cantidadproduto)]];
B4IRDebugUtils.currentLine=6357275;
 //BA.debugLineNum = 6357275;BA.debugLine="lblCantidadProductos.Visible = True";
[parent->__lblcantidadproductos setVisible:true];
 if (true) break;

case 139:
//C
self->_state = 140;
;
 if (true) break;

case 140:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=6357281;
 //BA.debugLineNum = 6357281;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@implementation _typeu
-(void)Initialize{
self.IsInitialized = true;
self->_idUsuario = 0;
self->_nombre = @"";
self->_latitud = @"";
self->_longitud = @"";
}
- (NSString*)description {
return [B4I TypeToString:self :false];}
@end

@implementation b4i_main 


+ (instancetype)new {
    static b4i_main* shared = nil;
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


- (NSString*)  _actualizar{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"actualizar"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"actualizar" :nil]);}
B4IRDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub actualizar";
B4IRDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="BuscarFavoritos";
[self _buscarfavoritos];
B4IRDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="cargarDatos";
[self _cargardatos];
 };
B4IRDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buscarfavoritos{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"buscarfavoritos"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buscarfavoritos" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobfavoritos = nil;
B4IRDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub BuscarFavoritos";
B4IRDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData.i";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__usersdata->_idUsuario /*int*/ )],@",'f_idempresa':",[self.bi NumberToString:@(1000)]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=5570564;
 //BA.debugLineNum = 5570564;BA.debugLine="Dim jobFavoritos As HttpJob";
_jobfavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5570565;
 //BA.debugLineNum = 5570565;BA.debugLine="jobFavoritos.Initialize(\"buscarFavoritos\",Me)";
[_jobfavoritos _initialize /*NSString**/ :nil :self.bi :@"buscarFavoritos" :self];
B4IRDebugUtils.currentLine=5570566;
 //BA.debugLineNum = 5570566;BA.debugLine="jobFavoritos.PostString(url&\"puntoventa/buscarfav";
[_jobfavoritos _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/buscarfav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__token :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5570568;
 //BA.debugLineNum = 5570568;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargardatos{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"cargardatos"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargardatos" :nil]);}
B4IRDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub cargarDatos";
B4IRDebugUtils.currentLine=5832709;
 //BA.debugLineNum = 5832709;BA.debugLine="cargarMasVendido";
[self _cargarmasvendido];
B4IRDebugUtils.currentLine=5832711;
 //BA.debugLineNum = 5832711;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _actualizarcantidad{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"actualizarcantidad"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"actualizarcantidad" :nil]);}
B4IRDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub actualizarCantidad";
B4IRDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="lblCantidadProductos.Text = cantidadProduto";
[self->__lblcantidadproductos setText:[self.bi NumberToString:@(self->__cantidadproduto)]];
B4IRDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="If cantidadProduto > 0 Then";
if (self->__cantidadproduto>0) { 
B4IRDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="lblCantidadProductos.Visible = True";
[self->__lblcantidadproductos setVisible:true];
 }else {
B4IRDebugUtils.currentLine=7995399;
 //BA.debugLineNum = 7995399;BA.debugLine="lblCantidadProductos.Visible = False";
[self->__lblcantidadproductos setVisible:false];
 };
B4IRDebugUtils.currentLine=7995403;
 //BA.debugLineNum = 7995403;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_background{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);}
B4IRDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Private Sub Application_Background";
B4IRDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[[B4I nilToNSNull:_nav]]]);}
B4IResultSet* _rs = nil;
B4INativeObject* _device = nil;
B4IRDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
B4IRDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="If File.Exists(File.DirDocuments, \"db.db\") = Fals";
if ([[self->___c File] Exists:[[self->___c File] DirDocuments] :@"db.db"]==false) { 
B4IRDebugUtils.currentLine=65540;
 //BA.debugLineNum = 65540;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDocum";
[[self->___c File] Copy:[[self->___c File] DirAssets] :@"db.db" :[[self->___c File] DirDocuments] :@"db.db"];
 };
B4IRDebugUtils.currentLine=65542;
 //BA.debugLineNum = 65542;BA.debugLine="SQL.Initialize(File.DirDocuments, \"db.db\", False)";
[self->__sql Initialize:[[self->___c File] DirDocuments] :@"db.db" :false];
B4IRDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="Dim rs As ResultSet = SQL.ExecQuery(\"SELECT * FRO";
_rs = [self->__sql ExecQuery:@"SELECT * FROM t_preferencia"];
B4IRDebugUtils.currentLine=65545;
 //BA.debugLineNum = 65545;BA.debugLine="Do While rs.NextRow";
while ([_rs NextRow]) {
B4IRDebugUtils.currentLine=65546;
 //BA.debugLineNum = 65546;BA.debugLine="url = rs.GetString(\"f_url\")";
self->__url = [_rs GetString:@"f_url"];
 }
;
B4IRDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="Dim device As NativeObject";
_device = [B4INativeObject new];
B4IRDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="device = device.Initialize(\"UIDevice\").RunMethod(";
_device = [[_device Initialize:@"UIDevice"] RunMethod:@"currentDevice" :(B4IArray*)(nil)];
B4IRDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="operadora= App.OSVersion";
self->__operadora = [self->__app OSVersion];
B4IRDebugUtils.currentLine=65552;
 //BA.debugLineNum = 65552;BA.debugLine="imei = device.GetField(\"identifierForVendor\").AsS";
self->__imei = [[_device GetField:@"identifierForVendor"] AsString];
B4IRDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="Initialize";
[self _initialize];
B4IRDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initialize{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4INavigationControllerWrapper* _nc = nil;
B4IPage* _lp = nil;
B4IBitmap* _bmuser = nil;
b4i_httpjob* _jobempresainfo = nil;
NSString* _json = @"";
b4i_httpjob* _cantidadpro = nil;
B4IRDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="Dim nc As NavigationController";
_nc = [B4INavigationControllerWrapper new];
B4IRDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="nc.Initialize(\"nc\")";
[_nc Initialize:self.bi :@"nc"];
B4IRDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="NavControl = nc";
self->__navcontrol = _nc;
B4IRDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="Page1.Initialize(\"Page1\")";
[self->__page1 Initialize:self.bi :@"Page1"];
B4IRDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="Page1.Title = \"Page 1\"";
[self->__page1 setTitle:@"Page 1"];
B4IRDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="NavControl.NavigationBarVisible = False";
[self->__navcontrol setNavigationBarVisible:false];
B4IRDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self->__page1 RootPanel] setColor:[[self->___c Colors] White]];
B4IRDebugUtils.currentLine=5505039;
 //BA.debugLineNum = 5505039;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self->__page1 RootPanel] setColor:[[self->___c Colors] White]];
B4IRDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="Page1.RootPanel.LoadLayout(\"frmPrincipal\")";
[[self->__page1 RootPanel] LoadLayout:@"frmPrincipal" :self.bi];
B4IRDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="Dim lp As Page";
_lp = [B4IPage new];
B4IRDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="lp.Initialize(\"lp\")";
[_lp Initialize:self.bi :@"lp"];
B4IRDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="lp.RootPanel.Color = Colors.Red";
[[_lp RootPanel] setColor:[[self->___c Colors] Red]];
B4IRDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="lp.RootPanel.LoadLayout(\"frmSlideNew\")";
[[_lp RootPanel] LoadLayout:@"frmSlideNew" :self.bi];
B4IRDebugUtils.currentLine=5505045;
 //BA.debugLineNum = 5505045;BA.debugLine="smc.Initialize(lp, nc,Null)";
[self->__smc Initialize:_lp :_nc :(B4IPage*) [B4IObjectWrapper createWrapper:[B4IPage new] object:(UIViewController*)(nil)]];
B4IRDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="App.KeyController = smc";
[self->__app setKeyController:(UIViewController*)((self->__smc).object)];
B4IRDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="NavControl.ShowPage(Page1)";
[self->__navcontrol ShowPage:(UIViewController*)((self->__page1).object)];
B4IRDebugUtils.currentLine=5505051;
 //BA.debugLineNum = 5505051;BA.debugLine="lblCantidadProductos.Visible = False";
[self->__lblcantidadproductos setVisible:false];
B4IRDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="PanelTitulo.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
[self->__paneltitulo SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="btnMasVendido.SetShadow(Colors.Gray,0dip,2dip,0.2";
[self->__btnmasvendido SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505057;
 //BA.debugLineNum = 5505057;BA.debugLine="btnBuscarProducto.SetShadow(Colors.Gray,0dip,2dip";
[self->__btnbuscarproducto SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505059;
 //BA.debugLineNum = 5505059;BA.debugLine="PanelFooterv2.SetShadow(Colors.Gray,0dip,-2dip,0.";
[self->__panelfooterv2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (-((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=5505061;
 //BA.debugLineNum = 5505061;BA.debugLine="btnIniciarSecion.SetShadow(Colors.Gray,1dip,2dip,";
[self->__btniniciarsecion SetShadow:[[self->___c Colors] Gray] :(float) (((int) (1))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505064;
 //BA.debugLineNum = 5505064;BA.debugLine="Panel1.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel1 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505065;
 //BA.debugLineNum = 5505065;BA.debugLine="Panel2.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505066;
 //BA.debugLineNum = 5505066;BA.debugLine="Panel3.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel3 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505067;
 //BA.debugLineNum = 5505067;BA.debugLine="Panel4.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel4 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505068;
 //BA.debugLineNum = 5505068;BA.debugLine="Panel5.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel5 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505069;
 //BA.debugLineNum = 5505069;BA.debugLine="Panel6.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel6 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505070;
 //BA.debugLineNum = 5505070;BA.debugLine="Panel7.SetShadow(Colors.Gray,0dip,2dip,0.2,True)";
[self->__panel7 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=5505072;
 //BA.debugLineNum = 5505072;BA.debugLine="Dim bmUser As Bitmap";
_bmuser = [B4IBitmap new];
B4IRDebugUtils.currentLine=5505073;
 //BA.debugLineNum = 5505073;BA.debugLine="bmUser.Initialize(File.DirAssets,\"user32.png\")";
[_bmuser Initialize:[[self->___c File] DirAssets] :@"user32.png"];
B4IRDebugUtils.currentLine=5505075;
 //BA.debugLineNum = 5505075;BA.debugLine="imageUser.Bitmap =bmUser";
[self->__imageuser setBitmap:_bmuser];
B4IRDebugUtils.currentLine=5505081;
 //BA.debugLineNum = 5505081;BA.debugLine="hud2.ProgressDialogShow(\"Cargando productos...\")";
[self->__hud2 ProgressDialogShow:@"Cargando productos..."];
B4IRDebugUtils.currentLine=5505082;
 //BA.debugLineNum = 5505082;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=5505084;
 //BA.debugLineNum = 5505084;BA.debugLine="Panel7.Visible = True";
[self->__panel7 setVisible:true];
B4IRDebugUtils.currentLine=5505085;
 //BA.debugLineNum = 5505085;BA.debugLine="BuscarFavoritos";
[self _buscarfavoritos];
B4IRDebugUtils.currentLine=5505086;
 //BA.debugLineNum = 5505086;BA.debugLine="CargarAgain = True";
self->__cargaragain = true;
B4IRDebugUtils.currentLine=5505087;
 //BA.debugLineNum = 5505087;BA.debugLine="btnIniciarSecion.Text = usersData.nombre";
[self->__btniniciarsecion setText:self->__usersdata->_nombre /*NSString**/ ];
B4IRDebugUtils.currentLine=5505088;
 //BA.debugLineNum = 5505088;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
_jobempresainfo = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5505089;
 //BA.debugLineNum = 5505089;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
[_jobempresainfo _initialize /*NSString**/ :nil :self.bi :@"JobEmpresaInfo" :self];
B4IRDebugUtils.currentLine=5505090;
 //BA.debugLineNum = 5505090;BA.debugLine="JobEmpresaInfo.PostString(url&\"ws/get_datos_pre";
[_jobempresainfo _poststring /*NSString**/ :nil :[@[self->__url,@"ws/get_datos_preferencia"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__token :[@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)]] componentsJoinedByString:@""]]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=5505092;
 //BA.debugLineNum = 5505092;BA.debugLine="Panel7.Visible = False";
[self->__panel7 setVisible:false];
B4IRDebugUtils.currentLine=5505093;
 //BA.debugLineNum = 5505093;BA.debugLine="cargarDatos";
[self _cargardatos];
 };
B4IRDebugUtils.currentLine=5505099;
 //BA.debugLineNum = 5505099;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=5505100;
 //BA.debugLineNum = 5505100;BA.debugLine="json = \"'f_imei':\"&imei";
_json = [@[@"'f_imei':",self->__imei] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=5505102;
 //BA.debugLineNum = 5505102;BA.debugLine="Dim cantidadPro As HttpJob";
_cantidadpro = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5505103;
 //BA.debugLineNum = 5505103;BA.debugLine="cantidadPro.Initialize(\"cantidadPro\",Me)";
[_cantidadpro _initialize /*NSString**/ :nil :self.bi :@"cantidadPro" :self];
B4IRDebugUtils.currentLine=5505104;
 //BA.debugLineNum = 5505104;BA.debugLine="cantidadPro.PostString(url&\"puntoventa/get_canitd";
[_cantidadpro _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/get_canitdad_producto_Login"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__tokenpublico :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5505106;
 //BA.debugLineNum = 5505106;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=5505107;
 //BA.debugLineNum = 5505107;BA.debugLine="lblNombreUser.Text = usersData.nombre";
[self->__lblnombreuser setText:self->__usersdata->_nombre /*NSString**/ ];
B4IRDebugUtils.currentLine=5505108;
 //BA.debugLineNum = 5505108;BA.debugLine="lblEmailUser.Text = Login.correro";
[self->__lblemailuser setText:self->__login->__correro /*NSString**/ ];
 };
B4IRDebugUtils.currentLine=5505111;
 //BA.debugLineNum = 5505111;BA.debugLine="reload = False";
self->__reload = false;
B4IRDebugUtils.currentLine=5505112;
 //BA.debugLineNum = 5505112;BA.debugLine="smc.Tag = \"inicio\"";
[self->__smc setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=5505113;
 //BA.debugLineNum = 5505113;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnaddproducto_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnaddproducto_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnaddproducto_click" :nil]);}
B4IButtonWrapper* _b = nil;
B4IMap* _mapa = nil;
B4IRDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="Sub btnAddProducto_Click";
B4IRDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim b As Button";
_b = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="b.Initialize(\"b\",b.STYLE_CONTACT_ADD)";
[_b Initialize:@"b" :self.bi :[_b STYLE_CONTACT_ADD]];
B4IRDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="b = Sender";
_b.object = (UIButton*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="Dim mapa As Map  = b.Tag";
_mapa = (B4IMap*)([_b Tag]);
B4IRDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="If mapa.Get(\"f_precio\") <= 0 Then";
if ([self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue<=0) { 
B4IRDebugUtils.currentLine=6619145;
 //BA.debugLineNum = 6619145;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
[self->___c Msgbox:@"Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este" :@"Aviso"];
 }else {
B4IRDebugUtils.currentLine=6619149;
 //BA.debugLineNum = 6619149;BA.debugLine="salvar_detalle_temporal(mapa,1)";
[self _salvar_detalle_temporal:_mapa :(int) (1)];
 };
B4IRDebugUtils.currentLine=6619152;
 //BA.debugLineNum = 6619152;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"salvar_detalle_temporal"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"salvar_detalle_temporal::" :@[[B4I nilToNSNull:_map],@(_cantidad)]]);}
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
B4IRDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
_mapcalculos = [self->__funciones _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :0 :_cantidad :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :self->__impuestoincluido :false];
B4IRDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=7274501;
 //BA.debugLineNum = 7274501;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)],@",'f_tipo':1",@",'f_idproducto':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_cantidad':",[self.bi NumberToString:@(_cantidad)],@"",@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_diferencia':0",@",'f_porciento_descuento':0",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_tax")]],@",'f_imei':",self->__imei] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=7274515;
 //BA.debugLineNum = 7274515;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="JobDetalleTemporal.PostString(url&\"puntoventa/sal";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__tokenpublico :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnagregarcarritodetalle_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnagregarcarritodetalle_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnagregarcarritodetalle_click" :nil]);}
B4IRDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub btnagregarCarritoDetalle_Click";
B4IRDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="salvar_detalle_temporal(mapaDetalle,lblcantidad.T";
[self _salvar_detalle_temporal:self->__mapadetalle :[self.bi ObjectToNumber:[self->__lblcantidad Text]].intValue];
B4IRDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="btnBackDetalles_Click";
[self _btnbackdetalles_click];
B4IRDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackdetalles_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnbackdetalles_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackdetalles_click" :nil]);}
B4IRDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub btnBackDetalles_Click";
B4IRDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="NavControl.ShowPage2(Page1,True)";
[self->__navcontrol ShowPage2:(UIViewController*)((self->__page1).object) :true];
B4IRDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackaboutus_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnbackaboutus_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackaboutus_click" :nil]);}
B4IRDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub btnBackAboutus_Click";
B4IRDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="NavControl.ShowPage(Page1)";
[self->__navcontrol ShowPage:(UIViewController*)((self->__page1).object)];
B4IRDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="smc.Tag = \"inicio\"";
[self->__smc setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=8060931;
 //BA.debugLineNum = 8060931;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbuscarproducto_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnbuscarproducto_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbuscarproducto_click" :nil]);}
B4IRDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub btnBuscarProducto_Click";
B4IRDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="PanelModalProducto.Left = 0";
[self->__panelmodalproducto setLeft:(float) (0)];
B4IRDebugUtils.currentLine=6094851;
 //BA.debugLineNum = 6094851;BA.debugLine="PanelModalProducto.SetAlphaAnimated(500,1)";
[self->__panelmodalproducto SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=6094854;
 //BA.debugLineNum = 6094854;BA.debugLine="txtBuscarProducto.RequestFocus";
[self->__txtbuscarproducto RequestFocus];
B4IRDebugUtils.currentLine=6094856;
 //BA.debugLineNum = 6094856;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btniniciarsecion_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btniniciarsecion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btniniciarsecion_click" :nil]);}
B4IRDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="Sub btnIniciarSecion_Click";
B4IRDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Return";
if (true) return @"";
 }else {
B4IRDebugUtils.currentLine=5767172;
 //BA.debugLineNum = 5767172;BA.debugLine="Login.Initialize";
[self->__login _initialize /*NSString**/ ];
 };
B4IRDebugUtils.currentLine=5767175;
 //BA.debugLineNum = 5767175;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnmasvendido_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnmasvendido_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnmasvendido_click" :nil]);}
B4IRDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Sub btnMasVendido_Click";
B4IRDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="Favoritos.Initilize";
[self->__favoritos _initilize /*NSString**/ ];
B4IRDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="actualizar";
[self _actualizar];
 }else {
B4IRDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Para agregar un producto a favoritos primero debe iniciar Sesión" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnorden_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnorden_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnorden_click" :nil]);}
B4IRDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub btnOrden_Click";
B4IRDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="Facturacion.Initialize";
[self->__facturacion _initialize /*NSString**/ ];
B4IRDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnprincipalback_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnprincipalback_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnprincipalback_click" :nil]);}
B4IRDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub btnPrincipalBack_Click";
B4IRDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="smc.OpenLeftMenu";
[self->__smc OpenLeftMenu];
B4IRDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnproductobuscarmodal_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnproductobuscarmodal_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnproductobuscarmodal_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobbuscarproducto = nil;
B4IRDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub btnProductoBuscarModal_Click";
B4IRDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
if ([[[self->__txtbuscarproducto Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=6160387;
 //BA.debugLineNum = 6160387;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
[self->___c Msgbox:@"Escriba el nombre del producto" :@"Información"];
B4IRDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6160391;
 //BA.debugLineNum = 6160391;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=6160392;
 //BA.debugLineNum = 6160392;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)],@",'f_parametro':'",[[[self->__txtbuscarproducto Text] Replace:@"'" :@""] Replace:@"\"" :@""],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=6160394;
 //BA.debugLineNum = 6160394;BA.debugLine="Dim JobBuscarProducto As HttpJob";
_jobbuscarproducto = [b4i_httpjob new];
B4IRDebugUtils.currentLine=6160395;
 //BA.debugLineNum = 6160395;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
[_jobbuscarproducto _initialize /*NSString**/ :nil :self.bi :@"JobBuscarProducto" :self];
B4IRDebugUtils.currentLine=6160396;
 //BA.debugLineNum = 6160396;BA.debugLine="JobBuscarProducto.PostString(url&\"ws/get_producto";
[_jobbuscarproducto _poststring /*NSString**/ :nil :[@[self->__url,@"ws/get_productos_by_paramentros"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__tokenpublico :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=6160397;
 //BA.debugLineNum = 6160397;BA.debugLine="hud.ProgressDialogShow(\"Buscando producto...\")";
[self->__hud ProgressDialogShow:@"Buscando producto..."];
B4IRDebugUtils.currentLine=6160398;
 //BA.debugLineNum = 6160398;BA.debugLine="Page1.ResignFocus";
[self->__page1 ResignFocus];
B4IRDebugUtils.currentLine=6160400;
 //BA.debugLineNum = 6160400;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnproductovolver_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnproductovolver_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnproductovolver_click" :nil]);}
B4IRDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub btnProductoVolver_Click";
B4IRDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="PanelModalProducto.SetAlphaAnimated(300,0)";
[self->__panelmodalproducto SetAlphaAnimated:(int) (300) :(float) (0)];
B4IRDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarallproductos{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"cargarallproductos"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarallproductos" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobbuscarproducto = nil;
B4IRDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="Sub cargarAllProductos";
B4IRDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)],@",'f_parametro':'%'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=5963781;
 //BA.debugLineNum = 5963781;BA.debugLine="Dim JobBuscarProducto As HttpJob";
_jobbuscarproducto = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5963782;
 //BA.debugLineNum = 5963782;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProductoAL";
[_jobbuscarproducto _initialize /*NSString**/ :nil :self.bi :@"JobBuscarProductoALL" :self];
B4IRDebugUtils.currentLine=5963783;
 //BA.debugLineNum = 5963783;BA.debugLine="JobBuscarProducto.PostString(url&\"ws/get_producto";
[_jobbuscarproducto _poststring /*NSString**/ :nil :[@[self->__url,@"ws/get_productos_by_paramentros2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__tokenpublico :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5963785;
 //BA.debugLineNum = 5963785;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarmasvendido{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"cargarmasvendido"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarmasvendido" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobproductomasvendido = nil;
B4IRDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="Sub cargarMasVendido";
B4IRDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
_jobproductomasvendido = [b4i_httpjob new];
B4IRDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMasV";
[_jobproductomasvendido _initialize /*NSString**/ :nil :self.bi :@"JobProductoMasVendido" :self];
B4IRDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="JobProductoMasVendido.PostString(url&\"ws/get_prod";
[_jobproductomasvendido _poststring /*NSString**/ :nil :[@[self->__url,@"ws/get_productos_main_page"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__tokenpublico :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _crearpanel{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"crearpanel"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"crearpanel" :nil]);}
B4IPanelWrapper* _p = nil;
B4IBitmap* _img = nil;
B4IRDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub crearPanel As Panel";
B4IRDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=5439491;
 //BA.debugLineNum = 5439491;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=5439493;
 //BA.debugLineNum = 5439493;BA.debugLine="Dim img As Bitmap";
_img = [B4IBitmap new];
B4IRDebugUtils.currentLine=5439494;
 //BA.debugLineNum = 5439494;BA.debugLine="img.Initialize(File.DirAssets,\"user32.png\")";
[_img Initialize:[[self->___c File] DirAssets] :@"user32.png"];
B4IRDebugUtils.currentLine=5439496;
 //BA.debugLineNum = 5439496;BA.debugLine="p.AddView(img,0%x,0%y,15%x,15%y)";
[_p AddView:(UIView*)((_img).object) :[self->___c PerXToCurrent:(float) (0)] :[self->___c PerYToCurrent:(float) (0)] :[self->___c PerXToCurrent:(float) (15)] :[self->___c PerYToCurrent:(float) (15)]];
B4IRDebugUtils.currentLine=5439500;
 //BA.debugLineNum = 5439500;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=5439502;
 //BA.debugLineNum = 5439502;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img1 :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"createlistitem"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem:::::" :@[[B4I nilToNSNull:_nombre],[B4I nilToNSNull:_cantidad],[B4I nilToNSNull:_img1],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As S";
B4IRDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
[_p LoadLayout:@"frmPanelesItems" :self.bi];
B4IRDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="lblNomCat.Text = Nombre";
[self->__lblnomcat setText:_nombre];
B4IRDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="lblCantCat.Text = cantidad";
[self->__lblcantcat setText:_cantidad];
B4IRDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="imgCat.Bitmap = img1";
[self->__imgcat setBitmap:_img1];
B4IRDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createpanelproducto:(B4IMap*) _map{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"createpanelproducto"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createpanelproducto:" :@[[B4I nilToNSNull:_map]]]);}
B4IPanelWrapper* _panelfondopro = nil;
B4IPanelWrapper* _panelimagen = nil;
int _heigimg = 0;
int _lef = 0;
int _leffav = 0;
int _tnom = 0;
int _hnom = 0;
int _tpre = 0;
int _hpre = 0;
int _timgfav = 0;
B4IMap* _mapaaux = nil;
B4IImageViewWrapper* _imagenpro = nil;
B4IBitmap* _bm = nil;
B4ILabelWrapper* _lbltitulopro = nil;
B4ILabelWrapper* _lblpreciopro = nil;
B4IButtonWrapper* _btnaddpro = nil;
B4IImageViewWrapper* _imgfav = nil;
B4IBitmap* _bmimgfav = nil;
B4IMap* _mapaimg = nil;
int _i = 0;
B4IMap* _mapafav = nil;
B4IRDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="Sub createPanelProducto(map As Map) As Panel";
B4IRDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = [B4IPanelWrapper new];
_panelimagen = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
[_panelfondopro Initialize:self.bi :@"PanelFondoPro"];
B4IRDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="PanelFondoPro.Width = ViewCategoria.Width * 0.47";
[_panelfondopro setWidth:(float) ([self->__viewcategoria Width]*0.47)];
B4IRDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="PanelFondoPro.Height = ViewCategoria.Height * 0.4";
[_panelfondopro setHeight:(float) ([self->__viewcategoria Height]*0.40)];
B4IRDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Dim heigImg As Int = PanelFondoPro.Height * 0.50";
_heigimg = (int) ([_panelfondopro Height]*0.50);
B4IRDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="Dim lef As Int = ViewCategoria.Width * 0.02";
_lef = (int) ([self->__viewcategoria Width]*0.02);
B4IRDebugUtils.currentLine=6488074;
 //BA.debugLineNum = 6488074;BA.debugLine="Dim lefFav As Int =  ViewCategoria.Width * 0.30";
_leffav = (int) ([self->__viewcategoria Width]*0.30);
B4IRDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="Dim Tnom As Int =   PanelFondoPro.Height * 0.39";
_tnom = (int) ([_panelfondopro Height]*0.39);
B4IRDebugUtils.currentLine=6488078;
 //BA.debugLineNum = 6488078;BA.debugLine="Dim Hnom As Int =   PanelFondoPro.Height * 0.42";
_hnom = (int) ([_panelfondopro Height]*0.42);
B4IRDebugUtils.currentLine=6488080;
 //BA.debugLineNum = 6488080;BA.debugLine="Dim tPre As Int = PanelFondoPro.Height * 0.51";
_tpre = (int) ([_panelfondopro Height]*0.51);
B4IRDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="Dim hPre As Int  = PanelFondoPro.Height * 0.40";
_hpre = (int) ([_panelfondopro Height]*0.40);
B4IRDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="Dim tImgFav As Int = PanelFondoPro.Height * 0.68";
_timgfav = (int) ([_panelfondopro Height]*0.68);
B4IRDebugUtils.currentLine=6488086;
 //BA.debugLineNum = 6488086;BA.debugLine="Dim mapaAux As Map";
_mapaaux = [B4IMap new];
B4IRDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="mapaAux.Initialize";
[_mapaaux Initialize];
B4IRDebugUtils.currentLine=6488089;
 //BA.debugLineNum = 6488089;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
[_panelfondopro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
[_panelfondopro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=6488093;
 //BA.debugLineNum = 6488093;BA.debugLine="map.Put(\"f_destacado\",True)";
[_map Put:(NSObject*)(@"f_destacado") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6488095;
 //BA.debugLineNum = 6488095;BA.debugLine="PanelImagen.Initialize(\"\")";
[_panelimagen Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6488097;
 //BA.debugLineNum = 6488097;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=6488098;
 //BA.debugLineNum = 6488098;BA.debugLine="imagenPro.Initialize(\"\")";
[_imagenpro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6488100;
 //BA.debugLineNum = 6488100;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=6488102;
 //BA.debugLineNum = 6488102;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_foto\"";
if ([_map Get:(NSObject*)(@"f_foto")]!= nil && [[_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=6488103;
 //BA.debugLineNum = 6488103;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=6488106;
 //BA.debugLineNum = 6488106;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=6488109;
 //BA.debugLineNum = 6488109;BA.debugLine="imagenPro.Bitmap = bm";
[_imagenpro setBitmap:_bm];
B4IRDebugUtils.currentLine=6488111;
 //BA.debugLineNum = 6488111;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6488113;
 //BA.debugLineNum = 6488113;BA.debugLine="PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondo";
[_panelimagen AddView:(UIView*)((_imagenpro).object) :[self->___c PerXToCurrent:(float) (0)] :(float) (((int) (0))) :[_panelfondopro Width] :(float) (_heigimg)];
B4IRDebugUtils.currentLine=6488115;
 //BA.debugLineNum = 6488115;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelF";
[_panelfondopro AddView:(UIView*)((_panelimagen).object) :[self->___c PerXToCurrent:(float) (0)] :(float) (((int) (0))) :[_panelfondopro Width] :(float) (_heigimg)];
B4IRDebugUtils.currentLine=6488118;
 //BA.debugLineNum = 6488118;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=6488119;
 //BA.debugLineNum = 6488119;BA.debugLine="lblTituloPro.Initialize(\"\")";
[_lbltitulopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6488120;
 //BA.debugLineNum = 6488120;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
[_lbltitulopro setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=6488121;
 //BA.debugLineNum = 6488121;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
[_lbltitulopro setTextColor:[[self->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=6488122;
 //BA.debugLineNum = 6488122;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
[_lbltitulopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=6488124;
 //BA.debugLineNum = 6488124;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,lef,Tnom,Panel";
[_panelfondopro AddView:(UIView*)((_lbltitulopro).object) :(float) (_lef) :(float) (_tnom) :(float) ([_panelfondopro Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) (_hnom)];
B4IRDebugUtils.currentLine=6488126;
 //BA.debugLineNum = 6488126;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=6488127;
 //BA.debugLineNum = 6488127;BA.debugLine="lblPrecioPro.Initialize(\"\")";
[_lblpreciopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6488128;
 //BA.debugLineNum = 6488128;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
[_lblpreciopro setText:[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]];
B4IRDebugUtils.currentLine=6488129;
 //BA.debugLineNum = 6488129;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
[_lblpreciopro setText:[@[@"$ ",[_lblpreciopro Text]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=6488130;
 //BA.debugLineNum = 6488130;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
[_lblpreciopro setTextColor:[[self->___c Colors] RGB:(int) (76) :(int) (175) :(int) (80)]];
B4IRDebugUtils.currentLine=6488131;
 //BA.debugLineNum = 6488131;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
[_lblpreciopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=6488133;
 //BA.debugLineNum = 6488133;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,lef,tPre,Panel";
[_panelfondopro AddView:(UIView*)((_lblpreciopro).object) :(float) (_lef) :(float) (_tpre) :(float) ([_panelfondopro Width]*0.50) :(float) (_hpre)];
B4IRDebugUtils.currentLine=6488135;
 //BA.debugLineNum = 6488135;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=6488136;
 //BA.debugLineNum = 6488136;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
[_btnaddpro InitializeCustom:@"btnAddProducto" :self.bi :[[self->___c Colors] RGB:(int) (244) :(int) (67) :(int) (54)] :[[self->___c Colors] RGB:(int) (0) :(int) (0) :(int) (0)]];
B4IRDebugUtils.currentLine=6488137;
 //BA.debugLineNum = 6488137;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
[_btnaddpro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=6488138;
 //BA.debugLineNum = 6488138;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=6488139;
 //BA.debugLineNum = 6488139;BA.debugLine="btnAddPro.Tag = map";
[_btnaddpro setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=6488140;
 //BA.debugLineNum = 6488140;BA.debugLine="btnAddPro.Text = \"Agregar\"";
[_btnaddpro setText:@"Agregar"];
B4IRDebugUtils.currentLine=6488142;
 //BA.debugLineNum = 6488142;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6488144;
 //BA.debugLineNum = 6488144;BA.debugLine="PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Wid";
[_panelfondopro AddView:(UIView*)((_btnaddpro).object) :(float) ([_panelfondopro Width]*0.02) :(float) ([_panelfondopro Height]*0.80) :(float) ([_panelfondopro Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) ([_panelfondopro Height]*0.14)];
B4IRDebugUtils.currentLine=6488146;
 //BA.debugLineNum = 6488146;BA.debugLine="Dim imgFav As ImageView";
_imgfav = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=6488147;
 //BA.debugLineNum = 6488147;BA.debugLine="imgFav.Initialize(\"imgFav\")";
[_imgfav Initialize:self.bi :@"imgFav"];
B4IRDebugUtils.currentLine=6488148;
 //BA.debugLineNum = 6488148;BA.debugLine="Dim bmImgFav As Bitmap";
_bmimgfav = [B4IBitmap new];
B4IRDebugUtils.currentLine=6488150;
 //BA.debugLineNum = 6488150;BA.debugLine="Dim mapaimg As Map";
_mapaimg = [B4IMap new];
B4IRDebugUtils.currentLine=6488151;
 //BA.debugLineNum = 6488151;BA.debugLine="mapaimg.Initialize";
[_mapaimg Initialize];
B4IRDebugUtils.currentLine=6488153;
 //BA.debugLineNum = 6488153;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=6488155;
 //BA.debugLineNum = 6488155;BA.debugLine="For i=0 To listafavoritos.Size -1";
{
const int step58 = 1;
const int limit58 = (int) ([self->__listafavoritos Size]-1);
_i = (int) (0) ;
for (;_i <= limit58 ;_i = _i + step58 ) {
B4IRDebugUtils.currentLine=6488156;
 //BA.debugLineNum = 6488156;BA.debugLine="Dim mapafav As Map";
_mapafav = [B4IMap new];
B4IRDebugUtils.currentLine=6488157;
 //BA.debugLineNum = 6488157;BA.debugLine="mapafav = listafavoritos.Get(i)";
_mapafav = (B4IMap*)([self->__listafavoritos Get:_i]);
B4IRDebugUtils.currentLine=6488159;
 //BA.debugLineNum = 6488159;BA.debugLine="If mapafav.Get(\"f_idrecord\") == map.Get(\"f_idre";
if ([[_mapafav Get:(NSObject*)(@"f_idrecord")] isEqual:[_map Get:(NSObject*)(@"f_idrecord")]]) { 
B4IRDebugUtils.currentLine=6488160;
 //BA.debugLineNum = 6488160;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartred.p";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartred.png"];
B4IRDebugUtils.currentLine=6488161;
 //BA.debugLineNum = 6488161;BA.debugLine="mapaimg.Put(\"f_red\",True)";
[_mapaimg Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6488162;
 //BA.debugLineNum = 6488162;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecor";
[_mapaimg Put:(NSObject*)(@"f_idproducto") :[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6488165;
 //BA.debugLineNum = 6488165;BA.debugLine="map.Put(\"f_red\",True)";
[_map Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6488166;
 //BA.debugLineNum = 6488166;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
[_map Put:(NSObject*)(@"f_idproducto") :[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6488168;
 //BA.debugLineNum = 6488168;BA.debugLine="mapaAux.Put(\"f_red\",True)";
[_mapaaux Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6488169;
 //BA.debugLineNum = 6488169;BA.debugLine="mapaAux.Put(\"f_idproducto\", map.Get(\"f_idrecor";
[_mapaaux Put:(NSObject*)(@"f_idproducto") :[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6488171;
 //BA.debugLineNum = 6488171;BA.debugLine="i = listafavoritos.Size -1";
_i = (int) ([self->__listafavoritos Size]-1);
 };
 }
};
 };
B4IRDebugUtils.currentLine=6488179;
 //BA.debugLineNum = 6488179;BA.debugLine="If bmImgFav.IsInitialized == False Then";
if ([_bmimgfav IsInitialized]==false) { 
B4IRDebugUtils.currentLine=6488180;
 //BA.debugLineNum = 6488180;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartwhitean";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartwhiteandblack.png"];
B4IRDebugUtils.currentLine=6488181;
 //BA.debugLineNum = 6488181;BA.debugLine="mapaimg.Put(\"f_red\",False)";
[_mapaimg Put:(NSObject*)(@"f_red") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6488182;
 //BA.debugLineNum = 6488182;BA.debugLine="mapaimg.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
[_mapaimg Put:(NSObject*)(@"f_idproducto") :[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6488185;
 //BA.debugLineNum = 6488185;BA.debugLine="map.Put(\"f_red\",False)";
[_map Put:(NSObject*)(@"f_red") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6488186;
 //BA.debugLineNum = 6488186;BA.debugLine="map.Put(\"f_idproducto\", map.Get(\"f_idrecord\"))";
[_map Put:(NSObject*)(@"f_idproducto") :[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6488188;
 //BA.debugLineNum = 6488188;BA.debugLine="mapaAux.Put(\"f_red\",False)";
[_mapaaux Put:(NSObject*)(@"f_red") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6488189;
 //BA.debugLineNum = 6488189;BA.debugLine="mapaAux.Put(\"f_idproducto\", map.Get(\"f_idrecord\"";
[_mapaaux Put:(NSObject*)(@"f_idproducto") :[_map Get:(NSObject*)(@"f_idrecord")]];
 };
B4IRDebugUtils.currentLine=6488192;
 //BA.debugLineNum = 6488192;BA.debugLine="PanelFondoPro.Tag = map";
[_panelfondopro setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=6488194;
 //BA.debugLineNum = 6488194;BA.debugLine="imgFav.Bitmap = bmImgFav";
[_imgfav setBitmap:_bmimgfav];
B4IRDebugUtils.currentLine=6488196;
 //BA.debugLineNum = 6488196;BA.debugLine="imgFav.Tag = mapaimg";
[_imgfav setTag:(NSObject*)(_mapaimg)];
B4IRDebugUtils.currentLine=6488198;
 //BA.debugLineNum = 6488198;BA.debugLine="PanelFondoPro.AddView(imgFav,lefFav,tImgFav,30dip";
[_panelfondopro AddView:(UIView*)((_imgfav).object) :(float) (_leffav) :(float) (_timgfav) :(float) (((int) (30))) :(float) (((int) (17)))];
B4IRDebugUtils.currentLine=6488201;
 //BA.debugLineNum = 6488201;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
B4IRDebugUtils.currentLine=6488203;
 //BA.debugLineNum = 6488203;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createpanelproductoscroll:(B4IMap*) _mapapanel1 :(B4IBitmap*) _imagen{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"createpanelproductoscroll"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createpanelproductoscroll::" :@[[B4I nilToNSNull:_mapapanel1],[B4I nilToNSNull:_imagen]]]);}
B4IPanelWrapper* _panelfondopro = nil;
B4IPanelWrapper* _panelimagen = nil;
int _heigimg = 0;
int _lef = 0;
int _leffav = 0;
int _tnom = 0;
int _hnom = 0;
int _tpre = 0;
int _hpre = 0;
int _timgfav = 0;
B4IImageViewWrapper* _imagenpro = nil;
B4ILabelWrapper* _lbltitulopro = nil;
B4ILabelWrapper* _lblpreciopro = nil;
B4IButtonWrapper* _btnaddpro = nil;
B4IImageViewWrapper* _imgfav = nil;
B4IBitmap* _bmimgfav = nil;
B4IMap* _mapaimg = nil;
int _i = 0;
B4IMap* _mapafav = nil;
B4IRDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="Sub createPanelProductoScroll(mapaPanel1 As Map, i";
B4IRDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = [B4IPanelWrapper new];
_panelimagen = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
[_panelfondopro Initialize:self.bi :@"PanelFondoPro"];
B4IRDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="PanelFondoPro.Width = ViewCategoria.Width * 0.47";
[_panelfondopro setWidth:(float) ([self->__viewcategoria Width]*0.47)];
B4IRDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="PanelFondoPro.Height = ViewCategoria.Height * 0.4";
[_panelfondopro setHeight:(float) ([self->__viewcategoria Height]*0.40)];
B4IRDebugUtils.currentLine=6553609;
 //BA.debugLineNum = 6553609;BA.debugLine="Dim heigImg As Int = PanelFondoPro.Height * 0.50";
_heigimg = (int) ([_panelfondopro Height]*0.50);
B4IRDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Dim lef As Int = ViewCategoria.Width * 0.02";
_lef = (int) ([self->__viewcategoria Width]*0.02);
B4IRDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="Dim lefFav As Int =  ViewCategoria.Width * 0.30";
_leffav = (int) ([self->__viewcategoria Width]*0.30);
B4IRDebugUtils.currentLine=6553614;
 //BA.debugLineNum = 6553614;BA.debugLine="Dim Tnom As Int =   PanelFondoPro.Height * 0.39";
_tnom = (int) ([_panelfondopro Height]*0.39);
B4IRDebugUtils.currentLine=6553615;
 //BA.debugLineNum = 6553615;BA.debugLine="Dim Hnom As Int =   PanelFondoPro.Height * 0.42";
_hnom = (int) ([_panelfondopro Height]*0.42);
B4IRDebugUtils.currentLine=6553617;
 //BA.debugLineNum = 6553617;BA.debugLine="Dim tPre As Int = PanelFondoPro.Height * 0.51";
_tpre = (int) ([_panelfondopro Height]*0.51);
B4IRDebugUtils.currentLine=6553618;
 //BA.debugLineNum = 6553618;BA.debugLine="Dim hPre As Int  = PanelFondoPro.Height * 0.40";
_hpre = (int) ([_panelfondopro Height]*0.40);
B4IRDebugUtils.currentLine=6553620;
 //BA.debugLineNum = 6553620;BA.debugLine="Dim tImgFav As Int = PanelFondoPro.Height * 0.68";
_timgfav = (int) ([_panelfondopro Height]*0.68);
B4IRDebugUtils.currentLine=6553622;
 //BA.debugLineNum = 6553622;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
[_panelfondopro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6553624;
 //BA.debugLineNum = 6553624;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
[_panelfondopro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=6553626;
 //BA.debugLineNum = 6553626;BA.debugLine="PanelImagen.Initialize(\"\")";
[_panelimagen Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6553628;
 //BA.debugLineNum = 6553628;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6553630;
 //BA.debugLineNum = 6553630;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=6553631;
 //BA.debugLineNum = 6553631;BA.debugLine="imagenPro.Initialize(\"\")";
[_imagenpro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6553633;
 //BA.debugLineNum = 6553633;BA.debugLine="imagenPro.Bitmap = imagen";
[_imagenpro setBitmap:_imagen];
B4IRDebugUtils.currentLine=6553635;
 //BA.debugLineNum = 6553635;BA.debugLine="mapaPanel1.Put(\"f_foto\",imagen)";
[_mapapanel1 Put:(NSObject*)(@"f_foto") :(NSObject*)((_imagen).object)];
B4IRDebugUtils.currentLine=6553637;
 //BA.debugLineNum = 6553637;BA.debugLine="mapaPanel1.Put(\"f_destacado\",False)";
[_mapapanel1 Put:(NSObject*)(@"f_destacado") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6553640;
 //BA.debugLineNum = 6553640;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.1) :true];
B4IRDebugUtils.currentLine=6553642;
 //BA.debugLineNum = 6553642;BA.debugLine="PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondo";
[_panelimagen AddView:(UIView*)((_imagenpro).object) :[self->___c PerXToCurrent:(float) (0)] :(float) (((int) (0))) :[_panelfondopro Width] :(float) (_heigimg)];
B4IRDebugUtils.currentLine=6553644;
 //BA.debugLineNum = 6553644;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelF";
[_panelfondopro AddView:(UIView*)((_panelimagen).object) :[self->___c PerXToCurrent:(float) (0)] :(float) (((int) (0))) :[_panelfondopro Width] :(float) (_heigimg)];
B4IRDebugUtils.currentLine=6553646;
 //BA.debugLineNum = 6553646;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=6553647;
 //BA.debugLineNum = 6553647;BA.debugLine="lblTituloPro.Initialize(\"\")";
[_lbltitulopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6553648;
 //BA.debugLineNum = 6553648;BA.debugLine="lblTituloPro.Text = mapaPanel1.Get(\"f_descripcion";
[_lbltitulopro setText:[self.bi ObjectToString:[_mapapanel1 Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=6553649;
 //BA.debugLineNum = 6553649;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
[_lbltitulopro setTextColor:[[self->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=6553650;
 //BA.debugLineNum = 6553650;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
[_lbltitulopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=6553653;
 //BA.debugLineNum = 6553653;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,lef,Tnom,Panel";
[_panelfondopro AddView:(UIView*)((_lbltitulopro).object) :(float) (_lef) :(float) (_tnom) :(float) ([_panelfondopro Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) (_hnom)];
B4IRDebugUtils.currentLine=6553655;
 //BA.debugLineNum = 6553655;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=6553656;
 //BA.debugLineNum = 6553656;BA.debugLine="lblPrecioPro.Initialize(\"\")";
[_lblpreciopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6553657;
 //BA.debugLineNum = 6553657;BA.debugLine="lblPrecioPro.Text = NumberFormat(mapaPanel1.Get(\"";
[_lblpreciopro setText:[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapapanel1 Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]];
B4IRDebugUtils.currentLine=6553658;
 //BA.debugLineNum = 6553658;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
[_lblpreciopro setText:[@[@"$ ",[_lblpreciopro Text]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=6553659;
 //BA.debugLineNum = 6553659;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
[_lblpreciopro setTextColor:[[self->___c Colors] RGB:(int) (76) :(int) (175) :(int) (80)]];
B4IRDebugUtils.currentLine=6553660;
 //BA.debugLineNum = 6553660;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
[_lblpreciopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=6553662;
 //BA.debugLineNum = 6553662;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,lef,tPre,Panel";
[_panelfondopro AddView:(UIView*)((_lblpreciopro).object) :(float) (_lef) :(float) (_tpre) :(float) ([_panelfondopro Width]*0.50) :(float) (_hpre)];
B4IRDebugUtils.currentLine=6553664;
 //BA.debugLineNum = 6553664;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=6553665;
 //BA.debugLineNum = 6553665;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
[_btnaddpro InitializeCustom:@"btnAddProducto" :self.bi :[[self->___c Colors] RGB:(int) (244) :(int) (67) :(int) (54)] :[[self->___c Colors] RGB:(int) (0) :(int) (0) :(int) (0)]];
B4IRDebugUtils.currentLine=6553666;
 //BA.debugLineNum = 6553666;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
[_btnaddpro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=6553667;
 //BA.debugLineNum = 6553667;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=6553668;
 //BA.debugLineNum = 6553668;BA.debugLine="btnAddPro.Tag = mapaPanel1";
[_btnaddpro setTag:(NSObject*)(_mapapanel1)];
B4IRDebugUtils.currentLine=6553669;
 //BA.debugLineNum = 6553669;BA.debugLine="btnAddPro.Text = \"Agregar\"";
[_btnaddpro setText:@"Agregar"];
B4IRDebugUtils.currentLine=6553671;
 //BA.debugLineNum = 6553671;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6553673;
 //BA.debugLineNum = 6553673;BA.debugLine="PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Wid";
[_panelfondopro AddView:(UIView*)((_btnaddpro).object) :(float) ([_panelfondopro Width]*0.02) :(float) ([_panelfondopro Height]*0.80) :(float) ([_panelfondopro Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) ([_panelfondopro Height]*0.14)];
B4IRDebugUtils.currentLine=6553676;
 //BA.debugLineNum = 6553676;BA.debugLine="Dim imgFav As ImageView";
_imgfav = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=6553677;
 //BA.debugLineNum = 6553677;BA.debugLine="imgFav.Initialize(\"imgFav\")";
[_imgfav Initialize:self.bi :@"imgFav"];
B4IRDebugUtils.currentLine=6553678;
 //BA.debugLineNum = 6553678;BA.debugLine="Dim bmImgFav As Bitmap";
_bmimgfav = [B4IBitmap new];
B4IRDebugUtils.currentLine=6553680;
 //BA.debugLineNum = 6553680;BA.debugLine="Dim mapaimg As Map";
_mapaimg = [B4IMap new];
B4IRDebugUtils.currentLine=6553681;
 //BA.debugLineNum = 6553681;BA.debugLine="mapaimg.Initialize";
[_mapaimg Initialize];
B4IRDebugUtils.currentLine=6553683;
 //BA.debugLineNum = 6553683;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=6553685;
 //BA.debugLineNum = 6553685;BA.debugLine="For i=0 To listafavoritos.Size -1";
{
const int step52 = 1;
const int limit52 = (int) ([self->__listafavoritos Size]-1);
_i = (int) (0) ;
for (;_i <= limit52 ;_i = _i + step52 ) {
B4IRDebugUtils.currentLine=6553686;
 //BA.debugLineNum = 6553686;BA.debugLine="Dim mapafav As Map";
_mapafav = [B4IMap new];
B4IRDebugUtils.currentLine=6553687;
 //BA.debugLineNum = 6553687;BA.debugLine="mapafav = listafavoritos.Get(i)";
_mapafav = (B4IMap*)([self->__listafavoritos Get:_i]);
B4IRDebugUtils.currentLine=6553689;
 //BA.debugLineNum = 6553689;BA.debugLine="If mapafav.Get(\"f_idrecord\") == mapaPanel1.Get(";
if ([[_mapafav Get:(NSObject*)(@"f_idrecord")] isEqual:[_mapapanel1 Get:(NSObject*)(@"f_idrecord")]]) { 
B4IRDebugUtils.currentLine=6553690;
 //BA.debugLineNum = 6553690;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartRed.p";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartRed.png"];
B4IRDebugUtils.currentLine=6553691;
 //BA.debugLineNum = 6553691;BA.debugLine="i = listafavoritos.Size -1";
_i = (int) ([self->__listafavoritos Size]-1);
B4IRDebugUtils.currentLine=6553692;
 //BA.debugLineNum = 6553692;BA.debugLine="mapaimg.Put(\"f_red\",True)";
[_mapaimg Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6553693;
 //BA.debugLineNum = 6553693;BA.debugLine="mapaimg.Put(\"f_idproducto\", mapaPanel1.Get(\"f_";
[_mapaimg Put:(NSObject*)(@"f_idproducto") :[_mapapanel1 Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6553696;
 //BA.debugLineNum = 6553696;BA.debugLine="mapaPanel1.Put(\"f_red\",True)";
[_mapapanel1 Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6553697;
 //BA.debugLineNum = 6553697;BA.debugLine="mapaPanel1.Put(\"f_idproducto\", mapaPanel1.Get(";
[_mapapanel1 Put:(NSObject*)(@"f_idproducto") :[_mapapanel1 Get:(NSObject*)(@"f_idrecord")]];
 };
 }
};
 };
B4IRDebugUtils.currentLine=6553704;
 //BA.debugLineNum = 6553704;BA.debugLine="If bmImgFav.IsInitialized == False Then";
if ([_bmimgfav IsInitialized]==false) { 
B4IRDebugUtils.currentLine=6553705;
 //BA.debugLineNum = 6553705;BA.debugLine="bmImgFav.Initialize(File.DirAssets,\"heartWhitean";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartWhiteandBlack.png"];
B4IRDebugUtils.currentLine=6553706;
 //BA.debugLineNum = 6553706;BA.debugLine="mapaimg.Put(\"f_red\",False)";
[_mapaimg Put:(NSObject*)(@"f_red") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6553707;
 //BA.debugLineNum = 6553707;BA.debugLine="mapaimg.Put(\"f_idproducto\", mapaPanel1.Get(\"f_id";
[_mapaimg Put:(NSObject*)(@"f_idproducto") :[_mapapanel1 Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=6553710;
 //BA.debugLineNum = 6553710;BA.debugLine="mapaPanel1.Put(\"f_red\",False)";
[_mapapanel1 Put:(NSObject*)(@"f_red") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6553711;
 //BA.debugLineNum = 6553711;BA.debugLine="mapaPanel1.Put(\"f_idproducto\", mapaPanel1.Get(\"f";
[_mapapanel1 Put:(NSObject*)(@"f_idproducto") :[_mapapanel1 Get:(NSObject*)(@"f_idrecord")]];
 };
B4IRDebugUtils.currentLine=6553716;
 //BA.debugLineNum = 6553716;BA.debugLine="PanelFondoPro.Tag = mapaPanel1";
[_panelfondopro setTag:(NSObject*)(_mapapanel1)];
B4IRDebugUtils.currentLine=6553718;
 //BA.debugLineNum = 6553718;BA.debugLine="imgFav.Bitmap = bmImgFav";
[_imgfav setBitmap:_bmimgfav];
B4IRDebugUtils.currentLine=6553719;
 //BA.debugLineNum = 6553719;BA.debugLine="imgFav.Tag = mapaimg";
[_imgfav setTag:(NSObject*)(_mapaimg)];
B4IRDebugUtils.currentLine=6553721;
 //BA.debugLineNum = 6553721;BA.debugLine="PanelFondoPro.AddView(imgFav,lefFav,tImgFav,30dip";
[_panelfondopro AddView:(UIView*)((_imgfav).object) :(float) (_leffav) :(float) (_timgfav) :(float) (((int) (30))) :(float) (((int) (17)))];
B4IRDebugUtils.currentLine=6553723;
 //BA.debugLineNum = 6553723;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
B4IRDebugUtils.currentLine=6553725;
 //BA.debugLineNum = 6553725;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _imgdetallefav_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"imgdetallefav_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"imgdetallefav_click" :nil]);}
B4IImageViewWrapper* _i = nil;
B4IRDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub imgdetallefav_Click";
B4IRDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim i As ImageView";
_i = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="i.Initialize(\"\")";
[_i Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=7077892;
 //BA.debugLineNum = 7077892;BA.debugLine="i = Sender";
_i.object = (UIImageView*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=7077896;
 //BA.debugLineNum = 7077896;BA.debugLine="If i.Tag == 1 Then";
if ([[_i Tag] isEqual:(NSObject*)(@(1))]) { 
B4IRDebugUtils.currentLine=7077898;
 //BA.debugLineNum = 7077898;BA.debugLine="Msgbox2(\"MsgDeleteFav\",\"Desea eliminar este pro";
[self->___c Msgbox2:self.bi :@"MsgDeleteFav" :@"Desea eliminar este producto de su lista de favoritos?" :@"Advertencia!!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 }else {
B4IRDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="Msgbox2(\"MsgAddFav\",\"Desea agregar este product";
[self->___c Msgbox2:self.bi :@"MsgAddFav" :@"Desea agregar este producto de su lista de favoritos?" :@"Advertencia!!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
 }else {
B4IRDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Para agregar un producto a favoritos primero debe iniciar Sesión" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _imgfav_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"imgfav_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"imgfav_click" :nil]);}
B4IImageViewWrapper* _img = nil;
B4IMap* _mapa = nil;
B4IBitmap* _bm = nil;
NSString* _json = @"";
b4i_httpjob* _deletefavoritos = nil;
b4i_httpjob* _putfavoritos = nil;
B4IRDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="Sub imgFav_Click";
B4IRDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="Dim img As ImageView";
_img = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="img.Initialize(\"\")";
[_img Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="img = Sender";
_img.object = (UIImageView*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
B4IRDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="mapa = img.Tag";
_mapa = (B4IMap*)([_img Tag]);
B4IRDebugUtils.currentLine=6750220;
 //BA.debugLineNum = 6750220;BA.debugLine="mapaDetalleImagen = mapa";
self->__mapadetalleimagen = _mapa;
B4IRDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="Dim bm As  Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=6750224;
 //BA.debugLineNum = 6750224;BA.debugLine="If mapa.Get(\"f_red\") Then";
if ([self.bi ObjectToBoolean:[_mapa Get:(NSObject*)(@"f_red")]]) { 
B4IRDebugUtils.currentLine=6750226;
 //BA.debugLineNum = 6750226;BA.debugLine="bm.Initialize(File.DirAssets,\"heartWhiteandBlac";
[_bm Initialize:[[self->___c File] DirAssets] :@"heartWhiteandBlack.png"];
B4IRDebugUtils.currentLine=6750227;
 //BA.debugLineNum = 6750227;BA.debugLine="img.Bitmap = bm";
[_img setBitmap:_bm];
B4IRDebugUtils.currentLine=6750228;
 //BA.debugLineNum = 6750228;BA.debugLine="mapa.Put(\"f_red\",False)";
[_mapa Put:(NSObject*)(@"f_red") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=6750230;
 //BA.debugLineNum = 6750230;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__usersdata->_idUsuario /*int*/ )],@",'f_idproducto':",[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_idproducto")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=6750233;
 //BA.debugLineNum = 6750233;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=6750234;
 //BA.debugLineNum = 6750234;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me";
[_deletefavoritos _initialize /*NSString**/ :nil :self.bi :@"deleteFavoritos" :self];
B4IRDebugUtils.currentLine=6750235;
 //BA.debugLineNum = 6750235;BA.debugLine="CargarAgain = False";
self->__cargaragain = false;
B4IRDebugUtils.currentLine=6750236;
 //BA.debugLineNum = 6750236;BA.debugLine="deleteFavoritos.PostString(url&\"puntoventa/dele";
[_deletefavoritos _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/deletefav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__token :_json]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=6750240;
 //BA.debugLineNum = 6750240;BA.debugLine="bm.Initialize(File.DirAssets,\"heartRed.png\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"heartRed.png"];
B4IRDebugUtils.currentLine=6750241;
 //BA.debugLineNum = 6750241;BA.debugLine="img.Bitmap = bm";
[_img setBitmap:_bm];
B4IRDebugUtils.currentLine=6750242;
 //BA.debugLineNum = 6750242;BA.debugLine="mapa.Put(\"f_red\",True)";
[_mapa Put:(NSObject*)(@"f_red") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=6750244;
 //BA.debugLineNum = 6750244;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__usersdata->_idUsuario /*int*/ )],@",'f_idproducto':",[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_idproducto")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=6750247;
 //BA.debugLineNum = 6750247;BA.debugLine="Dim putFavoritos As HttpJob";
_putfavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=6750248;
 //BA.debugLineNum = 6750248;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
[_putfavoritos _initialize /*NSString**/ :nil :self.bi :@"addFavoritos" :self];
B4IRDebugUtils.currentLine=6750249;
 //BA.debugLineNum = 6750249;BA.debugLine="CargarAgain = False";
self->__cargaragain = false;
B4IRDebugUtils.currentLine=6750250;
 //BA.debugLineNum = 6750250;BA.debugLine="putFavoritos.PostString(url&\"puntoventa/addfav\"";
[_putfavoritos _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/addfav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__token :_json]] componentsJoinedByString:@""]];
 };
 }else {
B4IRDebugUtils.currentLine=6750256;
 //BA.debugLineNum = 6750256;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Para agregar un producto a favoritos primero debe iniciar Sesión" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=6750260;
 //BA.debugLineNum = 6750260;BA.debugLine="End Sub";
return @"";
}
- (void)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {[B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]; return;}
ResumableSub_main_JobDone* rsub = [[ResumableSub_main_JobDone alloc] init:self : _job];
[rsub resume:self.bi :nil];
}
//-793982099
- (NSString*)  _listabusquedapro_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"listabusquedapro_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listabusquedapro_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _mapa = nil;
B4IBitmap* _bm = nil;
B4IBitmap* _bmimgfav = nil;
int _i = 0;
B4IMap* _mimap = nil;
B4IRDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub ListaBusquedaPro_ItemClick (Index As Int, Valu";
B4IRDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Dim mapa As Map = Value";
_mapa = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="mapaDetalle = mapa";
self->__mapadetalle = _mapa;
B4IRDebugUtils.currentLine=8257541;
 //BA.debugLineNum = 8257541;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if ([self->__panelfondodetalles IsInitialized]==false) { 
B4IRDebugUtils.currentLine=8257542;
 //BA.debugLineNum = 8257542;BA.debugLine="pageDetalle.Initialize(\"pageDetalle\")";
[self->__pagedetalle Initialize:self.bi :@"pageDetalle"];
B4IRDebugUtils.currentLine=8257544;
 //BA.debugLineNum = 8257544;BA.debugLine="pageDetalle.RootPanel.LoadLayout(\"frmDetalleProd";
[[self->__pagedetalle RootPanel] LoadLayout:@"frmDetalleProducto" :self.bi];
 };
B4IRDebugUtils.currentLine=8257547;
 //BA.debugLineNum = 8257547;BA.debugLine="NavControl.ShowPage2(pageDetalle,True)";
[self->__navcontrol ShowPage2:(UIViewController*)((self->__pagedetalle).object) :true];
B4IRDebugUtils.currentLine=8257549;
 //BA.debugLineNum = 8257549;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=8257551;
 //BA.debugLineNum = 8257551;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_fo";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=8257552;
 //BA.debugLineNum = 8257552;BA.debugLine="ImageViewDetalles.Bitmap = funciones.getImagen(m";
[self->__imageviewdetalles setBitmap:[self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]]];
 }else {
B4IRDebugUtils.currentLine=8257555;
 //BA.debugLineNum = 8257555;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
B4IRDebugUtils.currentLine=8257556;
 //BA.debugLineNum = 8257556;BA.debugLine="ImageViewDetalles.Bitmap = bm";
[self->__imageviewdetalles setBitmap:_bm];
 };
B4IRDebugUtils.currentLine=8257560;
 //BA.debugLineNum = 8257560;BA.debugLine="Dim bmimgfav As Bitmap";
_bmimgfav = [B4IBitmap new];
B4IRDebugUtils.currentLine=8257562;
 //BA.debugLineNum = 8257562;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=8257564;
 //BA.debugLineNum = 8257564;BA.debugLine="For i=0 To listafavoritos.Size-1";
{
const int step17 = 1;
const int limit17 = (int) ([self->__listafavoritos Size]-1);
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
B4IRDebugUtils.currentLine=8257566;
 //BA.debugLineNum = 8257566;BA.debugLine="Dim mimap As Map = listafavoritos.Get(i)";
_mimap = (B4IMap*)([self->__listafavoritos Get:_i]);
B4IRDebugUtils.currentLine=8257568;
 //BA.debugLineNum = 8257568;BA.debugLine="If mapa.Get(\"f_idrecord\") == mimap.Get(\"f_idrec";
if ([[_mapa Get:(NSObject*)(@"f_idrecord")] isEqual:[_mimap Get:(NSObject*)(@"f_idrecord")]]) { 
B4IRDebugUtils.currentLine=8257569;
 //BA.debugLineNum = 8257569;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartRed.p";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartRed.png"];
B4IRDebugUtils.currentLine=8257570;
 //BA.debugLineNum = 8257570;BA.debugLine="i = listafavoritos.Size";
_i = [self->__listafavoritos Size];
B4IRDebugUtils.currentLine=8257571;
 //BA.debugLineNum = 8257571;BA.debugLine="imgdetallefav.Tag = True";
[self->__imgdetallefav setTag:(NSObject*)(@(true))];
 };
 }
};
 };
B4IRDebugUtils.currentLine=8257578;
 //BA.debugLineNum = 8257578;BA.debugLine="If bmimgfav.IsInitialized == False Then";
if ([_bmimgfav IsInitialized]==false) { 
B4IRDebugUtils.currentLine=8257579;
 //BA.debugLineNum = 8257579;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartWhitean";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartWhiteandBlack.png"];
B4IRDebugUtils.currentLine=8257580;
 //BA.debugLineNum = 8257580;BA.debugLine="imgdetallefav.Tag = False";
[self->__imgdetallefav setTag:(NSObject*)(@(false))];
 };
B4IRDebugUtils.currentLine=8257583;
 //BA.debugLineNum = 8257583;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
[self->__imgdetallefav setBitmap:_bmimgfav];
B4IRDebugUtils.currentLine=8257586;
 //BA.debugLineNum = 8257586;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
[self->__btnagregarcarritodetalle SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8257587;
 //BA.debugLineNum = 8257587;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
[self->__panelimagendetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8257588;
 //BA.debugLineNum = 8257588;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
[self->__panellblcantidad SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (1))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8257589;
 //BA.debugLineNum = 8257589;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
[self->__panelencabezadodetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=8257591;
 //BA.debugLineNum = 8257591;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
[self->__lblprecioencabezado setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=8257592;
 //BA.debugLineNum = 8257592;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
[self->__lblnombeencabezado setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=8257593;
 //BA.debugLineNum = 8257593;BA.debugLine="lblcantidad.Text = 1";
[self->__lblcantidad setText:[self.bi NumberToString:@(1)]];
B4IRDebugUtils.currentLine=8257594;
 //BA.debugLineNum = 8257594;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
[self->__steppercantidad setValue:[self.bi ObjectToNumber:[self->__lblcantidad Text]].doubleValue];
B4IRDebugUtils.currentLine=8257595;
 //BA.debugLineNum = 8257595;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
[self->__lblprecio setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=8257598;
 //BA.debugLineNum = 8257598;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listproductosmodalview_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"listproductosmodalview_selectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listproductosmodalview_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]);}
B4IRDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub ListProductosModalView_SelectedChanged (Sectio";
B4IRDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="Msgbox(\"HOLA\",\"MUNDO\")";
[self->___c Msgbox:@"HOLA" :@"MUNDO"];
B4IRDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msg1_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"msg1_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msg1_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IRDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="Sub Msg1_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="If smc.Tag <> \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")] == false) { 
B4IRDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=6815754;
 //BA.debugLineNum = 6815754;BA.debugLine="Login.Initialize";
[self->__login _initialize /*NSString**/ ];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=6815757;
 //BA.debugLineNum = 6815757;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=6815760;
 //BA.debugLineNum = 6815760;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgaddfav_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"msgaddfav_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgaddfav_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
NSString* _json = @"";
b4i_httpjob* _putfavoritos = nil;
B4IBitmap* _bm = nil;
B4IRDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub MsgAddFav_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData.";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__usersdata->_idUsuario /*int*/ )],@",'f_idproducto':",[self.bi ObjectToString:[self->__mapadetalle Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Dim putFavoritos As HttpJob";
_putfavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="putFavoritos.Initialize(\"addFavoritos\",Me)";
[_putfavoritos _initialize /*NSString**/ :nil :self.bi :@"addFavoritos" :self];
B4IRDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="putFavoritos.PostString(url&\"puntoventa/addfav\",";
[_putfavoritos _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/addfav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__token :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=7208972;
 //BA.debugLineNum = 7208972;BA.debugLine="bm.Initialize(File.DirAssets,\"heartred.png\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"heartred.png"];
B4IRDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="CargarAgain = True";
self->__cargaragain = true;
B4IRDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="BuscarFavoritos";
[self _buscarfavoritos];
B4IRDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="imgdetallefav.Bitmap = bm";
[self->__imgdetallefav setBitmap:_bm];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgcerrarsesion_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"msgcerrarsesion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgcerrarsesion_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IRDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub MsgCerrarSesion_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="isLoged = False";
self->__isloged = false;
B4IRDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="reload = True";
self->__reload = true;
B4IRDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="lblNombreUser.Text = \"Público\"";
[self->__lblnombreuser setText:@"Público"];
B4IRDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="lblEmailUser.Text = \"\"";
[self->__lblemailuser setText:@""];
B4IRDebugUtils.currentLine=7536649;
 //BA.debugLineNum = 7536649;BA.debugLine="Login.Initialize";
[self->__login _initialize /*NSString**/ ];
B4IRDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="Panel7.Visible = False";
[self->__panel7 setVisible:false];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=7536653;
 //BA.debugLineNum = 7536653;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=7536656;
 //BA.debugLineNum = 7536656;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgdeletefav_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"msgdeletefav_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgdeletefav_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
NSString* _json = @"";
b4i_httpjob* _deletefavoritos = nil;
B4IBitmap* _bm = nil;
B4IRDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub MsgDeleteFav_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="Dim json As String = \"'f_idusuario':\"&usersData.";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__usersdata->_idUsuario /*int*/ )],@",'f_idproducto':",[self.bi ObjectToString:[self->__mapadetalle Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="Dim deleteFavoritos As HttpJob";
_deletefavoritos = [b4i_httpjob new];
B4IRDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="deleteFavoritos.Initialize(\"deleteFavoritos\",Me)";
[_deletefavoritos _initialize /*NSString**/ :nil :self.bi :@"deleteFavoritos" :self];
B4IRDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="deleteFavoritos.PostString(url&\"puntoventa/delet";
[_deletefavoritos _poststring /*NSString**/ :nil :[@[self->__url,@"puntoventa/deletefav"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__token :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="bm.Initialize(File.DirAssets,\"heartwhiteandblack";
[_bm Initialize:[[self->___c File] DirAssets] :@"heartwhiteandblack.png"];
B4IRDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="CargarAgain = True";
self->__cargaragain = true;
B4IRDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="BuscarFavoritos";
[self _buscarfavoritos];
B4IRDebugUtils.currentLine=7143439;
 //BA.debugLineNum = 7143439;BA.debugLine="imgdetallefav.Bitmap = bm";
[self->__imgdetallefav setBitmap:_bm];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=7143442;
 //BA.debugLineNum = 7143442;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=7143445;
 //BA.debugLineNum = 7143445;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"page1_click" :nil]);}
B4IRDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub Page1_Click";
B4IRDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"page1_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
B4IRDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="ViewCategoria.ContentWidth =  PanelCategoria.Widt";
[self->__viewcategoria setContentWidth:(int) ([self->__panelcategoria Width]-[self->___c PerXToCurrent:(float) (4)])];
B4IRDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel1_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel1_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel1_click" :nil]);}
B4IRDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub Panel1_Click";
B4IRDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="If smc.Tag == \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")]) { 
B4IRDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 }else {
B4IRDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="If smc.Tag == \"login\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"login")]) { 
B4IRDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="Initialize";
[self _initialize];
 }else {
B4IRDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
B4IRDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 };
 };
B4IRDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel2_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel2_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel2_click" :nil]);}
B4IRDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub Panel2_Click";
B4IRDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="If smc.Tag == \"categoria\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"categoria")]) { 
B4IRDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 }else {
B4IRDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="If smc.Tag <> \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")] == false) { 
B4IRDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=7798793;
 //BA.debugLineNum = 7798793;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Categoria.Initialize";
[self->__categoria _initialize /*NSString**/ ];
 };
B4IRDebugUtils.currentLine=7798798;
 //BA.debugLineNum = 7798798;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel3_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel3_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel3_click" :nil]);}
B4IRDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub Panel3_Click";
B4IRDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="If smc.Tag == \"favoritos\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"favoritos")]) { 
B4IRDebugUtils.currentLine=7733253;
 //BA.debugLineNum = 7733253;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 }else {
B4IRDebugUtils.currentLine=7733256;
 //BA.debugLineNum = 7733256;BA.debugLine="If smc.Tag <> \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")] == false) { 
B4IRDebugUtils.currentLine=7733257;
 //BA.debugLineNum = 7733257;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=7733259;
 //BA.debugLineNum = 7733259;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7733260;
 //BA.debugLineNum = 7733260;BA.debugLine="Favoritos.Initilize";
[self->__favoritos _initilize /*NSString**/ ];
 };
 }else {
B4IRDebugUtils.currentLine=7733263;
 //BA.debugLineNum = 7733263;BA.debugLine="Msgbox2(\"Msg1\",\"Para agregar un producto a favor";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Para agregar un producto a favoritos primero debe iniciar Sesión" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=7733266;
 //BA.debugLineNum = 7733266;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel4_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel4_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel4_click" :nil]);}
B4IRDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub Panel4_Click";
B4IRDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="If smc.Tag == \"direcciones\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"direcciones")]) { 
B4IRDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 }else {
B4IRDebugUtils.currentLine=7667720;
 //BA.debugLineNum = 7667720;BA.debugLine="If smc.Tag <> \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")] == false) { 
B4IRDebugUtils.currentLine=7667721;
 //BA.debugLineNum = 7667721;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=7667723;
 //BA.debugLineNum = 7667723;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7667724;
 //BA.debugLineNum = 7667724;BA.debugLine="Direcciones.Initialize";
[self->__direcciones _initialize /*NSString**/ ];
 };
 }else {
B4IRDebugUtils.currentLine=7667727;
 //BA.debugLineNum = 7667727;BA.debugLine="Msgbox2(\"Msg1\",\"Antes de ver sus direcciones tie";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Antes de ver sus direcciones tiene que iniciar sesion" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=7667730;
 //BA.debugLineNum = 7667730;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel5_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel5_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel5_click" :nil]);}
B4IRDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub Panel5_Click";
B4IRDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="If smc.Tag == \"reporte\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"reporte")]) { 
B4IRDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 }else {
B4IRDebugUtils.currentLine=7864328;
 //BA.debugLineNum = 7864328;BA.debugLine="If smc.Tag <> \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")] == false) { 
B4IRDebugUtils.currentLine=7864329;
 //BA.debugLineNum = 7864329;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=7864331;
 //BA.debugLineNum = 7864331;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7864332;
 //BA.debugLineNum = 7864332;BA.debugLine="Reportes.Initialize";
[self->__reportes _initialize /*NSString**/ ];
 };
 }else {
B4IRDebugUtils.currentLine=7864336;
 //BA.debugLineNum = 7864336;BA.debugLine="Msgbox2(\"Msg1\",\"Antes de ver sus ordenes tiene q";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Antes de ver sus ordenes tiene que iniciar sesion" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=7864340;
 //BA.debugLineNum = 7864340;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel6_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel6_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel6_click" :nil]);}
B4IRDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Panel6_Click";
B4IRDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="If smc.Tag == \"about\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"about")]) { 
B4IRDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
 }else {
B4IRDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="pageAboutUs.Initialize(\"pageAboutUs\")";
[self->__pageaboutus Initialize:self.bi :@"pageAboutUs"];
B4IRDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="pageAboutUs.RootPanel.LoadLayout(\"frmAboutsUs\")";
[[self->__pageaboutus RootPanel] LoadLayout:@"frmAboutsUs" :self.bi];
B4IRDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="If smc.Tag <> \"inicio\" Then";
if ([[self->__smc Tag] isEqual:(NSObject*)(@"inicio")] == false) { 
B4IRDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="smc.Tag = \"about\"";
[self->__smc setTag:(NSObject*)(@"about")];
B4IRDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="NavControl.ShowPage2(pageAboutUs,True)";
[self->__navcontrol ShowPage2:(UIViewController*)((self->__pageaboutus).object) :true];
 };
B4IRDebugUtils.currentLine=7602195;
 //BA.debugLineNum = 7602195;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panel7_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panel7_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panel7_click" :nil]);}
B4IRDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub Panel7_Click";
B4IRDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Msgbox2(\"MsgCerrarSesion\",\"Desea cerrar sesion?\"";
[self->___c Msgbox2:self.bi :@"MsgCerrarSesion" :@"Desea cerrar sesion?" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 }else {
B4IRDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="btnIniciarSecion_Click";
[self _btniniciarsecion_click];
 };
B4IRDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panelfondopro_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"panelfondopro_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panelfondopro_click" :nil]);}
B4IMap* _mapa = nil;
B4IPanelWrapper* _b = nil;
B4IBitmap* _bm = nil;
B4IBitmap* _bmimgfav = nil;
int _i = 0;
B4IMap* _mimap = nil;
B4IRDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub PanelFondoPro_Click";
B4IRDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
B4IRDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim b As Panel";
_b = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="b = Sender";
_b.object = (B4IPanelView*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="mapa = b.Tag";
_mapa = (B4IMap*)([_b Tag]);
B4IRDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="mapaDetalle = mapa";
self->__mapadetalle = _mapa;
B4IRDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if ([self->__panelfondodetalles IsInitialized]==false) { 
B4IRDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="pageDetalle.Initialize(\"pageDetalle\")";
[self->__pagedetalle Initialize:self.bi :@"pageDetalle"];
B4IRDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="pageDetalle.RootPanel.LoadLayout(\"frmDetalleProd";
[[self->__pagedetalle RootPanel] LoadLayout:@"frmDetalleProducto" :self.bi];
 };
B4IRDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="NavControl.ShowPage2(pageDetalle,True)";
[self->__navcontrol ShowPage2:(UIViewController*)((self->__pagedetalle).object) :true];
B4IRDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=6684693;
 //BA.debugLineNum = 6684693;BA.debugLine="If mapa.Get(\"f_destacado\") Then";
if ([self.bi ObjectToBoolean:[_mapa Get:(NSObject*)(@"f_destacado")]]) { 
B4IRDebugUtils.currentLine=6684695;
 //BA.debugLineNum = 6684695;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_fo";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=6684696;
 //BA.debugLineNum = 6684696;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]];
B4IRDebugUtils.currentLine=6684698;
 //BA.debugLineNum = 6684698;BA.debugLine="ImageViewDetalles.Bitmap= bm";
[self->__imageviewdetalles setBitmap:_bm];
 }else {
B4IRDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
B4IRDebugUtils.currentLine=6684704;
 //BA.debugLineNum = 6684704;BA.debugLine="ImageViewDetalles.Bitmap = bm";
[self->__imageviewdetalles setBitmap:_bm];
 };
 }else {
B4IRDebugUtils.currentLine=6684708;
 //BA.debugLineNum = 6684708;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=6684711;
 //BA.debugLineNum = 6684711;BA.debugLine="ImageViewDetalles.Bitmap = funciones.getImagen(";
[self->__imageviewdetalles setBitmap:[self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]]];
 }else {
B4IRDebugUtils.currentLine=6684714;
 //BA.debugLineNum = 6684714;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
B4IRDebugUtils.currentLine=6684716;
 //BA.debugLineNum = 6684716;BA.debugLine="ImageViewDetalles.Bitmap = bm";
[self->__imageviewdetalles setBitmap:_bm];
 };
 };
B4IRDebugUtils.currentLine=6684723;
 //BA.debugLineNum = 6684723;BA.debugLine="Dim bmimgfav As Bitmap";
_bmimgfav = [B4IBitmap new];
B4IRDebugUtils.currentLine=6684725;
 //BA.debugLineNum = 6684725;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=6684727;
 //BA.debugLineNum = 6684727;BA.debugLine="For i=0 To listafavoritos.Size-1";
{
const int step31 = 1;
const int limit31 = (int) ([self->__listafavoritos Size]-1);
_i = (int) (0) ;
for (;_i <= limit31 ;_i = _i + step31 ) {
B4IRDebugUtils.currentLine=6684729;
 //BA.debugLineNum = 6684729;BA.debugLine="Dim mimap As Map = listafavoritos.Get(i)";
_mimap = (B4IMap*)([self->__listafavoritos Get:_i]);
B4IRDebugUtils.currentLine=6684731;
 //BA.debugLineNum = 6684731;BA.debugLine="If mapa.Get(\"f_idrecord\") == mimap.Get(\"f_idrec";
if ([[_mapa Get:(NSObject*)(@"f_idrecord")] isEqual:[_mimap Get:(NSObject*)(@"f_idrecord")]]) { 
B4IRDebugUtils.currentLine=6684732;
 //BA.debugLineNum = 6684732;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartRed.p";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartRed.png"];
B4IRDebugUtils.currentLine=6684733;
 //BA.debugLineNum = 6684733;BA.debugLine="i = listafavoritos.Size";
_i = [self->__listafavoritos Size];
B4IRDebugUtils.currentLine=6684734;
 //BA.debugLineNum = 6684734;BA.debugLine="imgdetallefav.Tag = True";
[self->__imgdetallefav setTag:(NSObject*)(@(true))];
 };
 }
};
 };
B4IRDebugUtils.currentLine=6684741;
 //BA.debugLineNum = 6684741;BA.debugLine="If bmimgfav.IsInitialized == False Then";
if ([_bmimgfav IsInitialized]==false) { 
B4IRDebugUtils.currentLine=6684742;
 //BA.debugLineNum = 6684742;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartWhitean";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartWhiteandBlack.png"];
B4IRDebugUtils.currentLine=6684743;
 //BA.debugLineNum = 6684743;BA.debugLine="imgdetallefav.Tag = False";
[self->__imgdetallefav setTag:(NSObject*)(@(false))];
 };
B4IRDebugUtils.currentLine=6684746;
 //BA.debugLineNum = 6684746;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
[self->__imgdetallefav setBitmap:_bmimgfav];
B4IRDebugUtils.currentLine=6684750;
 //BA.debugLineNum = 6684750;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
[self->__btnagregarcarritodetalle SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6684751;
 //BA.debugLineNum = 6684751;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
[self->__panelimagendetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6684752;
 //BA.debugLineNum = 6684752;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
[self->__panellblcantidad SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (1))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6684753;
 //BA.debugLineNum = 6684753;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
[self->__panelencabezadodetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=6684755;
 //BA.debugLineNum = 6684755;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
[self->__lblprecioencabezado setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=6684756;
 //BA.debugLineNum = 6684756;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
[self->__lblnombeencabezado setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=6684757;
 //BA.debugLineNum = 6684757;BA.debugLine="lblcantidad.Text = 1";
[self->__lblcantidad setText:[self.bi NumberToString:@(1)]];
B4IRDebugUtils.currentLine=6684758;
 //BA.debugLineNum = 6684758;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
[self->__steppercantidad setValue:[self.bi ObjectToNumber:[self->__lblcantidad Text]].doubleValue];
B4IRDebugUtils.currentLine=6684759;
 //BA.debugLineNum = 6684759;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
[self->__lblprecio setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=6684763;
 //BA.debugLineNum = 6684763;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _paneluser_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"paneluser_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"paneluser_click" :nil]);}
B4IRDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub PanelUser_Click";
B4IRDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="If isLoged Then";
if (self->__isloged) { 
B4IRDebugUtils.currentLine=8126467;
 //BA.debugLineNum = 8126467;BA.debugLine="smc.CloseMenu";
[self->__smc CloseMenu];
B4IRDebugUtils.currentLine=8126468;
 //BA.debugLineNum = 8126468;BA.debugLine="Perfil.Initialize";
[self->__perfil _initialize /*NSString**/ ];
 }else {
B4IRDebugUtils.currentLine=8126470;
 //BA.debugLineNum = 8126470;BA.debugLine="Msgbox2(\"Msg1\",\"Para editar su perfil tiene que";
[self->___c Msgbox2:self.bi :@"Msg1" :@"Para editar su perfil tiene que iniciar sesion" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=8126473;
 //BA.debugLineNum = 8126473;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];
[[b4i_login new]initializeModule];
[[b4i_funciones new]initializeModule];
[[b4i_categoria new]initializeModule];
[[b4i_reportes new]initializeModule];
[[b4i_facturacion new]initializeModule];
[[b4i_direcciones new]initializeModule];
[[b4i_perfil new]initializeModule];
[[b4i_favoritos new]initializeModule];
[[b4i_httputils2service new]initializeModule];

}
- (NSString*)  _process_globals{
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=0;
 //BA.debugLineNum = 0;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=3;
 //BA.debugLineNum = 3;BA.debugLine="Public App As Application";
self->__app = [B4IApplicationWrapper new];
B4IRDebugUtils.currentLine=4;
 //BA.debugLineNum = 4;BA.debugLine="Public NavControl As NavigationController";
self->__navcontrol = [B4INavigationControllerWrapper new];
B4IRDebugUtils.currentLine=5;
 //BA.debugLineNum = 5;BA.debugLine="Private Page1 As Page";
self->__page1 = [B4IPage new];
B4IRDebugUtils.currentLine=6;
 //BA.debugLineNum = 6;BA.debugLine="Private pageDetalle As Page";
self->__pagedetalle = [B4IPage new];
B4IRDebugUtils.currentLine=7;
 //BA.debugLineNum = 7;BA.debugLine="Private pageAboutUs As Page";
self->__pageaboutus = [B4IPage new];
B4IRDebugUtils.currentLine=10;
 //BA.debugLineNum = 10;BA.debugLine="Dim tokenPublico As String = \"dbea1e74de894c3a37f";
self->__tokenpublico = @"dbea1e74de894c3a37f4696a10ed6dd7";
B4IRDebugUtils.currentLine=11;
 //BA.debugLineNum = 11;BA.debugLine="Dim token As String";
self->__token = @"";
B4IRDebugUtils.currentLine=12;
 //BA.debugLineNum = 12;BA.debugLine="Dim isLoged As Boolean = False";
self->__isloged = false;
B4IRDebugUtils.currentLine=13;
 //BA.debugLineNum = 13;BA.debugLine="Dim listafavoritos As List";
self->__listafavoritos = [B4IList new];
B4IRDebugUtils.currentLine=14;
 //BA.debugLineNum = 14;BA.debugLine="Dim mapEmpresaInfo As Map = Null";
self->__mapempresainfo = (B4IMap*)(nil);
B4IRDebugUtils.currentLine=15;
 //BA.debugLineNum = 15;BA.debugLine="Dim url As String '= \"http://10.0.0.108:8010/menu";
self->__url = @"";
B4IRDebugUtils.currentLine=17;
 //BA.debugLineNum = 17;BA.debugLine="Dim idEmpresa As Int = 1053 '1000";
self->__idempresa = (int) (1053);
B4IRDebugUtils.currentLine=18;
 //BA.debugLineNum = 18;BA.debugLine="Dim jobMsj As String = \"No se pudo conectar con e";
self->__jobmsj = @"No se pudo conectar con el servidor. Compruebe su conexión a internet.";
B4IRDebugUtils.currentLine=19;
 //BA.debugLineNum = 19;BA.debugLine="Dim jobMsjTitle As String = \"Problemas de conexió";
self->__jobmsjtitle = @"Problemas de conexión";
B4IRDebugUtils.currentLine=20;
 //BA.debugLineNum = 20;BA.debugLine="Dim impuestoIncluido As Boolean = True";
self->__impuestoincluido = true;
B4IRDebugUtils.currentLine=21;
 //BA.debugLineNum = 21;BA.debugLine="Dim cantidadProduto As Int = 0";
self->__cantidadproduto = (int) (0);
B4IRDebugUtils.currentLine=22;
 //BA.debugLineNum = 22;BA.debugLine="Dim mapaDetalle As Map";
self->__mapadetalle = [B4IMap new];
B4IRDebugUtils.currentLine=23;
 //BA.debugLineNum = 23;BA.debugLine="Dim SQL As SQL";
self->__sql = [B4ISQL new];
B4IRDebugUtils.currentLine=24;
 //BA.debugLineNum = 24;BA.debugLine="Dim  imei As String";
self->__imei = @"";
B4IRDebugUtils.currentLine=25;
 //BA.debugLineNum = 25;BA.debugLine="Dim operadora As String";
self->__operadora = @"";
B4IRDebugUtils.currentLine=26;
 //BA.debugLineNum = 26;BA.debugLine="Dim CargarAgain As Boolean = True";
self->__cargaragain = true;
B4IRDebugUtils.currentLine=27;
 //BA.debugLineNum = 27;BA.debugLine="Dim reload As Boolean = False";
self->__reload = false;
B4IRDebugUtils.currentLine=30;
 //BA.debugLineNum = 30;BA.debugLine="Type typeU (idUsuario As Int, nombre As String, l";
;
B4IRDebugUtils.currentLine=31;
 //BA.debugLineNum = 31;BA.debugLine="Dim usersData As typeU";
self->__usersdata = [_typeu new];
B4IRDebugUtils.currentLine=33;
 //BA.debugLineNum = 33;BA.debugLine="Dim IsUsa As Boolean = False";
self->__isusa = false;
B4IRDebugUtils.currentLine=35;
 //BA.debugLineNum = 35;BA.debugLine="Dim mapaDetalleImagen As Map";
self->__mapadetalleimagen = [B4IMap new];
B4IRDebugUtils.currentLine=39;
 //BA.debugLineNum = 39;BA.debugLine="Private Drawer As B4XDrawer";
self->__drawer = [b4i_b4xdrawer new];
B4IRDebugUtils.currentLine=40;
 //BA.debugLineNum = 40;BA.debugLine="Private ListSlide As CustomListView";
self->__listslide = [b4i_customlistview new];
B4IRDebugUtils.currentLine=41;
 //BA.debugLineNum = 41;BA.debugLine="Private btnPrincipalBack As Button";
self->__btnprincipalback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=42;
 //BA.debugLineNum = 42;BA.debugLine="Private btnBuscarProducto As Button";
self->__btnbuscarproducto = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=43;
 //BA.debugLineNum = 43;BA.debugLine="Private btnIniciarSecion As Button";
self->__btniniciarsecion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=44;
 //BA.debugLineNum = 44;BA.debugLine="Private btnOrden As Button";
self->__btnorden = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=45;
 //BA.debugLineNum = 45;BA.debugLine="Private PanelFooterv2 As Panel";
self->__panelfooterv2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=46;
 //BA.debugLineNum = 46;BA.debugLine="Private PanelTitulo As Panel";
self->__paneltitulo = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=47;
 //BA.debugLineNum = 47;BA.debugLine="Private lblCantidadProductos As Label";
self->__lblcantidadproductos = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=48;
 //BA.debugLineNum = 48;BA.debugLine="Private btnMasVendido As Button";
self->__btnmasvendido = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=49;
 //BA.debugLineNum = 49;BA.debugLine="Private PanelSlide As Panel";
self->__panelslide = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=52;
 //BA.debugLineNum = 52;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=53;
 //BA.debugLineNum = 53;BA.debugLine="Private hud2 As HUD";
self->__hud2 = [iHUD new];
B4IRDebugUtils.currentLine=55;
 //BA.debugLineNum = 55;BA.debugLine="Private Panel1 As Panel";
self->__panel1 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=56;
 //BA.debugLineNum = 56;BA.debugLine="Private txtBuscarProducto As TextField";
self->__txtbuscarproducto = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=57;
 //BA.debugLineNum = 57;BA.debugLine="Private btnProductoBuscarModal As Button";
self->__btnproductobuscarmodal = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=58;
 //BA.debugLineNum = 58;BA.debugLine="Private PanelProductosModalView As Panel";
self->__panelproductosmodalview = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=59;
 //BA.debugLineNum = 59;BA.debugLine="Private btnProductoVolver As Button";
self->__btnproductovolver = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=60;
 //BA.debugLineNum = 60;BA.debugLine="Private PanelModalProducto As Panel";
self->__panelmodalproducto = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=61;
 //BA.debugLineNum = 61;BA.debugLine="Private ViewCategoria As ScrollView";
self->__viewcategoria = [B4IScrollView new];
B4IRDebugUtils.currentLine=64;
 //BA.debugLineNum = 64;BA.debugLine="Dim Hscroll As ScrollView";
self->__hscroll = [B4IScrollView new];
B4IRDebugUtils.currentLine=65;
 //BA.debugLineNum = 65;BA.debugLine="Private PanelUser As Panel";
self->__paneluser = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=66;
 //BA.debugLineNum = 66;BA.debugLine="Private imageUser As ImageView";
self->__imageuser = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=69;
 //BA.debugLineNum = 69;BA.debugLine="Public smc As SideMenuController";
self->__smc = [B4ISideMenuController new];
B4IRDebugUtils.currentLine=70;
 //BA.debugLineNum = 70;BA.debugLine="Private Panel2 As Panel";
self->__panel2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=71;
 //BA.debugLineNum = 71;BA.debugLine="Private Panel3 As Panel";
self->__panel3 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=72;
 //BA.debugLineNum = 72;BA.debugLine="Private Panel4 As Panel";
self->__panel4 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=73;
 //BA.debugLineNum = 73;BA.debugLine="Private Panel5 As Panel";
self->__panel5 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=74;
 //BA.debugLineNum = 74;BA.debugLine="Private Panel6 As Panel";
self->__panel6 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=75;
 //BA.debugLineNum = 75;BA.debugLine="Private  Panel7 As Panel";
self->__panel7 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=76;
 //BA.debugLineNum = 76;BA.debugLine="Private PanelFondoDetalles As Panel";
self->__panelfondodetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=77;
 //BA.debugLineNum = 77;BA.debugLine="Private ImageViewDetalles As ImageView";
self->__imageviewdetalles = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=78;
 //BA.debugLineNum = 78;BA.debugLine="Private lblPrecioEncabezado As Label";
self->__lblprecioencabezado = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=79;
 //BA.debugLineNum = 79;BA.debugLine="Private lblNombeEncabezado As Label";
self->__lblnombeencabezado = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=80;
 //BA.debugLineNum = 80;BA.debugLine="Private imgdetallefav As ImageView";
self->__imgdetallefav = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=81;
 //BA.debugLineNum = 81;BA.debugLine="Private lblPrecio As Label";
self->__lblprecio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=82;
 //BA.debugLineNum = 82;BA.debugLine="Private lblcantidad As Label";
self->__lblcantidad = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=83;
 //BA.debugLineNum = 83;BA.debugLine="Private btnBackDetalles As Button";
self->__btnbackdetalles = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=84;
 //BA.debugLineNum = 84;BA.debugLine="Private btnagregarCarritoDetalle As Button";
self->__btnagregarcarritodetalle = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=85;
 //BA.debugLineNum = 85;BA.debugLine="Private btnless As Button";
self->__btnless = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=86;
 //BA.debugLineNum = 86;BA.debugLine="Private btnMore As Button";
self->__btnmore = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=87;
 //BA.debugLineNum = 87;BA.debugLine="Private PanelImagenDetalles As Panel";
self->__panelimagendetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=88;
 //BA.debugLineNum = 88;BA.debugLine="Private PanellblCantidad As Panel";
self->__panellblcantidad = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=89;
 //BA.debugLineNum = 89;BA.debugLine="Private PanelEncabezadoDetalles As Panel";
self->__panelencabezadodetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=90;
 //BA.debugLineNum = 90;BA.debugLine="Private btnBackAboutus As Button";
self->__btnbackaboutus = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=93;
 //BA.debugLineNum = 93;BA.debugLine="Dim buscarfavoritosvar As Boolean = True";
self->__buscarfavoritosvar = true;
B4IRDebugUtils.currentLine=95;
 //BA.debugLineNum = 95;BA.debugLine="Private PanelCategoria As Panel";
self->__panelcategoria = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=96;
 //BA.debugLineNum = 96;BA.debugLine="Private StepperCantidad As Stepper";
self->__steppercantidad = [B4IStepperWrapper new];
B4IRDebugUtils.currentLine=97;
 //BA.debugLineNum = 97;BA.debugLine="Private lblNombreUser As Label";
self->__lblnombreuser = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=98;
 //BA.debugLineNum = 98;BA.debugLine="Private lblEmailUser As Label";
self->__lblemailuser = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=99;
 //BA.debugLineNum = 99;BA.debugLine="Private ListaBusquedaPro As CustomListView";
self->__listabusquedapro = [b4i_customlistview new];
B4IRDebugUtils.currentLine=100;
 //BA.debugLineNum = 100;BA.debugLine="Private imgCat As ImageView";
self->__imgcat = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=101;
 //BA.debugLineNum = 101;BA.debugLine="Private lblNomCat As Label";
self->__lblnomcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=102;
 //BA.debugLineNum = 102;BA.debugLine="Private lblCantCat As Label";
self->__lblcantcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=103;
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _steppercantidad_valuechanged:(double) _value{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"steppercantidad_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"steppercantidad_valuechanged:" :@[@(_value)]]);}
B4IRDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub StepperCantidad_ValueChanged (Value As Double)";
B4IRDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="lblcantidad.Text = Value";
[self->__lblcantidad setText:[self.bi NumberToString:@(_value)]];
B4IRDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtbuscarproducto_enterpressed{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"txtbuscarproducto_enterpressed"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtbuscarproducto_enterpressed" :nil]);}
B4IRDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub txtBuscarProducto_EnterPressed";
B4IRDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="Page1.ResignFocus";
[self->__page1 ResignFocus];
B4IRDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="End Sub";
return @"";
}
@end