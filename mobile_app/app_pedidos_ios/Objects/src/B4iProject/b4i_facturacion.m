
#import "b4i_facturacion.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"


@implementation b4i_facturacion 


+ (instancetype)new {
    static b4i_facturacion* shared = nil;
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
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="page.Initialize(\"PageLogin\")";
[self->__page Initialize:self.bi :@"PageLogin"];
B4IRDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="page.RootPanel.LoadLayout(\"frmProductoOrden\")";
[[self->__page RootPanel] LoadLayout:@"frmProductoOrden" :self.bi];
B4IRDebugUtils.currentLine=9830406;
 //BA.debugLineNum = 9830406;BA.debugLine="Main.NavControl.ShowPage2(page,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__page).object) :true];
B4IRDebugUtils.currentLine=9830407;
 //BA.debugLineNum = 9830407;BA.debugLine="cargarProductosTemporales";
[self _cargarproductostemporales];
B4IRDebugUtils.currentLine=9830408;
 //BA.debugLineNum = 9830408;BA.debugLine="lblDireccion.Tag = 0";
[self->__lbldireccion setTag:(NSObject*)(@(0))];
B4IRDebugUtils.currentLine=9830410;
 //BA.debugLineNum = 9830410;BA.debugLine="Main.smc.Tag = \"facturacion\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"facturacion")];
B4IRDebugUtils.currentLine=9830412;
 //BA.debugLineNum = 9830412;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnabrirdireccion_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnabrirdireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnabrirdireccion_click" :nil]);}
B4IRDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="Sub btnAbrirDireccion_Click";
B4IRDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="Direcciones.Initialize";
[self->__direcciones _initialize /*NSString**/ ];
B4IRDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackmdaldireccion_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnbackmdaldireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackmdaldireccion_click" :nil]);}
B4IRDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="Sub btnBackMdalDireccion_Click";
B4IRDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="PanelFondoDireccionModal.SetAlphaAnimated(500,0)";
[self->__panelfondodireccionmodal SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnopcionesback_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnopcionesback_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnopcionesback_click" :nil]);}
B4IRDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub btnOpcionesBack_Click";
B4IRDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="PanelOpcionesBack.SetAlphaAnimated(500,0)";
[self->__panelopcionesback SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="If changeValue Then";
if (self->__changevalue) { 
B4IRDebugUtils.currentLine=10420227;
 //BA.debugLineNum = 10420227;BA.debugLine="changeValue = False";
self->__changevalue = false;
 }else {
B4IRDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="stModificarCantidad.Value = valorCantidad";
[self->__stmodificarcantidad setValue:self->__valorcantidad];
 };
B4IRDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnopcioneseliminar_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnopcioneseliminar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnopcioneseliminar_click" :nil]);}
B4IRDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub btnOpcionesEliminar_Click";
B4IRDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Msgbox2(\"msjEliminar\",\"Desea eliminar este produc";
[self->___c Msgbox2:self.bi :@"msjEliminar" :@"Desea eliminar este producto?" :@"Aviso!!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnopcionesproductosalvar_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnopcionesproductosalvar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnopcionesproductosalvar_click" :nil]);}
B4IMap* _map = nil;
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
NSString* _jsonpropiedades = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
B4IRDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = (B4IMap*)([self->__btnopcionesproductosalvar Tag]);
B4IRDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
_mapcalculos = [self->__funciones _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio_original")]].doubleValue :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_descuento")]].doubleValue :[self.bi ObjectToNumber:[self->__txtcantidad Text]].doubleValue :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_porciento_tax")]].doubleValue :self->__main->__impuestoincluido /*BOOL*/  :false];
B4IRDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="Dim jsonPropiedades As String = \"[]\"";
_jsonpropiedades = @"[]";
B4IRDebugUtils.currentLine=10354698;
 //BA.debugLineNum = 10354698;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_propiedades':",_jsonpropiedades,@",'f_tipo':2",@",'f_cantidad':",[self->__txtcantidad Text],@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_idserver':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idserver")]],@",'f_diferencia':",[self.bi NumberToString:@([self->__funciones _getdiferenciacantidad /*double*/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_cantidad")]].doubleValue :[self.bi ObjectToNumber:[self->__txtcantidad Text]].doubleValue])],@",'f_porciento_descuento':0",@",'f_comentario':'",[self->__funciones _base64_encode /*NSString**/ :[self->__txtproductocomentario Text]],@"'",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_porciento_tax")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=10354714;
 //BA.debugLineNum = 10354714;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=10354715;
 //BA.debugLineNum = 10354715;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=10354716;
 //BA.debugLineNum = 10354716;BA.debugLine="JobDetalleTemporal.Tag = False";
_jobdetalletemporal->__tag /*NSObject**/  = (NSObject*)(@(false));
B4IRDebugUtils.currentLine=10354718;
 //BA.debugLineNum = 10354718;BA.debugLine="changeValue = True";
self->__changevalue = true;
B4IRDebugUtils.currentLine=10354720;
 //BA.debugLineNum = 10354720;BA.debugLine="If Main.isLoged And 1 == 2 Then";
if (self->__main->__isloged /*BOOL*/  && 1==2) { 
B4IRDebugUtils.currentLine=10354721;
 //BA.debugLineNum = 10354721;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=10354723;
 //BA.debugLineNum = 10354723;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntoven";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
 };
B4IRDebugUtils.currentLine=10354730;
 //BA.debugLineNum = 10354730;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnordenback_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnordenback_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnordenback_click" :nil]);}
B4IRDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="Sub btnOrdenBack_Click";
B4IRDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="Main.actualizarCantidad";
[self->__main _actualizarcantidad /*NSString**/ ];
B4IRDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnordeneliminartodos_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnordeneliminartodos_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnordeneliminartodos_click" :nil]);}
B4IRDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub btnOrdenEliminarTodos_Click";
B4IRDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Msgbox2(\"MsgDelete\",\"Seguro que desea borrar todo";
[self->___c Msgbox2:self.bi :@"MsgDelete" :@"Seguro que desea borrar todos los productos del carrito?" :@"Advertencia!!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnordenenviar_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnordenenviar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnordenenviar_click" :nil]);}
B4IRDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub btnOrdenEnviar_Click";
B4IRDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="If Main.isLoged Then";
if (self->__main->__isloged /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11010052;
 //BA.debugLineNum = 11010052;BA.debugLine="If Main.mapEmpresaInfo.Get(\"f_pedidos_minimos\")";
if ([self.bi ObjectToNumber:[self->__main->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_pedidos_minimos")]].doubleValue>self->__total) { 
B4IRDebugUtils.currentLine=11010053;
 //BA.debugLineNum = 11010053;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de";
[self->___c Msgbox:[@[@"El monto del pedido minimo debe ser de RD$",[self.bi ObjectToString:[self->__main->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_pedidos_minimos")]]] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=11010054;
 //BA.debugLineNum = 11010054;BA.debugLine="Return";
if (true) return @"";
 }else if([self->__listacarrito _getsize /*int*/ :nil]==0) { 
B4IRDebugUtils.currentLine=11010056;
 //BA.debugLineNum = 11010056;BA.debugLine="Msgbox(\"No hay productos para registrar esta or";
[self->___c Msgbox:@"No hay productos para registrar esta orden" :@"Información"];
B4IRDebugUtils.currentLine=11010057;
 //BA.debugLineNum = 11010057;BA.debugLine="Return";
if (true) return @"";
 }else if([[self->__lbldireccion Tag] isEqual:(NSObject*)(@(0))]) { 
B4IRDebugUtils.currentLine=11010059;
 //BA.debugLineNum = 11010059;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",";
[self->___c Msgbox:@"Seleccione la dirección para el envio" :@"Información"];
B4IRDebugUtils.currentLine=11010060;
 //BA.debugLineNum = 11010060;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11010063;
 //BA.debugLineNum = 11010063;BA.debugLine="Msgbox2(\"MsgVender\",\"Desea realizar esta orden?\"";
[self->___c Msgbox2:self.bi :@"MsgVender" :@"Desea realizar esta orden?" :@"Aviso!!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 }else {
B4IRDebugUtils.currentLine=11010067;
 //BA.debugLineNum = 11010067;BA.debugLine="Msgbox2(\"MsgLogin\",\"Antes realizar su orden tien";
[self->___c Msgbox2:self.bi :@"MsgLogin" :@"Antes realizar su orden tiene que iniciar sesion" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=11010071;
 //BA.debugLineNum = 11010071;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargardirecciones{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"cargardirecciones"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargardirecciones" :nil]);}
b4i_httpjob* _jobdirecciones = nil;
B4IRDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="Sub cargarDirecciones";
B4IRDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = [b4i_httpjob new];
B4IRDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
[_jobdirecciones _initialize /*NSString**/ :nil :self.bi :@"JobDirecciones" :self];
B4IRDebugUtils.currentLine=10747907;
 //BA.debugLineNum = 10747907;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
[_jobdirecciones _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarproductostemporales{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"cargarproductostemporales"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarproductostemporales" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobbuscar = nil;
B4IRDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="Sub cargarProductosTemporales";
B4IRDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim json As String  = \"'f_idempresa':\"&Main.idEmp";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@" ,'f_imei':",self->__main->__imei /*NSString**/ ] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
[_jobbuscar _initialize /*NSString**/ :nil :self.bi :@"JobBuscar" :self];
B4IRDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pro";
[_jobbuscar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/get_productos_temporales_by_key2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(NSString*) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"createlistitem"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem:::::" :@[[B4I nilToNSNull:_nombre],[B4I nilToNSNull:_cantidad],[B4I nilToNSNull:_img],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As S";
B4IRDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=10158083;
 //BA.debugLineNum = 10158083;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
[_p LoadLayout:@"frmPanelesItems" :self.bi];
B4IRDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="lblNomCat.Text = Nombre";
[self->__lblnomcat setText:_nombre];
B4IRDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="lblCantCat.Text = cantidad";
[self->__lblcantcat setText:_cantidad];
B4IRDebugUtils.currentLine=10158087;
 //BA.debugLineNum = 10158087;BA.debugLine="imgCat.Bitmap = img";
[self->__imgcat setBitmap:_img];
B4IRDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createlistitemonlystring:(NSString*) _dir :(NSString*) _fecha :(NSString*) _principal :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"createlistitemonlystring"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitemonlystring:::::" :@[[B4I nilToNSNull:_dir],[B4I nilToNSNull:_fecha],[B4I nilToNSNull:_principal],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub CreateListItemOnlyString(Dir As String, fecha";
B4IRDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="p.LoadLayout(\"frmItemsDir\")";
[_p LoadLayout:@"frmItemsDir" :self.bi];
B4IRDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="lblDir.Text = Dir";
[self->__lbldir setText:_dir];
B4IRDebugUtils.currentLine=10092550;
 //BA.debugLineNum = 10092550;BA.debugLine="lblFecha.Text = fecha";
[self->__lblfecha setText:_fecha];
B4IRDebugUtils.currentLine=10092551;
 //BA.debugLineNum = 10092551;BA.debugLine="lblPrincipal.Text = principal";
[self->__lblprincipal setText:_principal];
B4IRDebugUtils.currentLine=10092552;
 //BA.debugLineNum = 10092552;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=10092553;
 //BA.debugLineNum = 10092553;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
int _i = 0;
B4IBitmap* _bm = nil;
NSString* _dr = @"";
NSString* _city = @"";
NSString* _name = @"";
NSString* _default = @"";
B4IRDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=10027016;
 //BA.debugLineNum = 10027016;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=10027017;
 //BA.debugLineNum = 10027017;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=10027018;
 //BA.debugLineNum = 10027018;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=10027021;
 //BA.debugLineNum = 10027021;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=10027022;
 //BA.debugLineNum = 10027022;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=10027025;
 //BA.debugLineNum = 10027025;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=10027026;
 //BA.debugLineNum = 10027026;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=10027027;
 //BA.debugLineNum = 10027027;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=10027028;
 //BA.debugLineNum = 10027028;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
[_json Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=10027029;
 //BA.debugLineNum = 10027029;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=10027032;
 //BA.debugLineNum = 10027032;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobBuscar",@"JobDetalleTemporal",@"JobDirecciones",@"JobSalvar",@"JobEliminarTodo"]]) {
case 0: {
B4IRDebugUtils.currentLine=10027036;
 //BA.debugLineNum = 10027036;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=10027038;
 //BA.debugLineNum = 10027038;BA.debugLine="ListaCarrito.Clear";
[self->__listacarrito _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10027039;
 //BA.debugLineNum = 10027039;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=10027040;
 //BA.debugLineNum = 10027040;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
[self->___c Msgbox:@"No tiene productos registrados" :@"Información"];
B4IRDebugUtils.currentLine=10027041;
 //BA.debugLineNum = 10027041;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=10027045;
 //BA.debugLineNum = 10027045;BA.debugLine="total = 0";
self->__total = 0;
B4IRDebugUtils.currentLine=10027046;
 //BA.debugLineNum = 10027046;BA.debugLine="tax = 0";
self->__tax = 0;
B4IRDebugUtils.currentLine=10027047;
 //BA.debugLineNum = 10027047;BA.debugLine="subtotal = 0";
self->__subtotal = 0;
B4IRDebugUtils.currentLine=10027049;
 //BA.debugLineNum = 10027049;BA.debugLine="For i = 0 To list.Size -1";
{
const int step24 = 1;
const int limit24 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
B4IRDebugUtils.currentLine=10027050;
 //BA.debugLineNum = 10027050;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=10027052;
 //BA.debugLineNum = 10027052;BA.debugLine="total = total + map.Get(\"f_importe\")";
self->__total = self->__total+[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_importe")]].doubleValue;
B4IRDebugUtils.currentLine=10027053;
 //BA.debugLineNum = 10027053;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
self->__tax = self->__tax+([self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue*[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_cantidad")]].doubleValue);
B4IRDebugUtils.currentLine=10027054;
 //BA.debugLineNum = 10027054;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
self->__subtotal = self->__subtotal+([self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue*[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_cantidad")]].doubleValue);
B4IRDebugUtils.currentLine=10027056;
 //BA.debugLineNum = 10027056;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=10027057;
 //BA.debugLineNum = 10027057;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if ([_map Get:(NSObject*)(@"f_foto")]!= nil && [[_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=10027058;
 //BA.debugLineNum = 10027058;BA.debugLine="bm = funciones.getImagen(map.Get(\"f_foto\"))";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=10027060;
 //BA.debugLineNum = 10027060;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=10027067;
 //BA.debugLineNum = 10027067;BA.debugLine="ListaCarrito.Add(CreateListItem(map.Get(\"f_des";
[self->__listacarrito _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]] :[@[@"Cantidad: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_cantidad")]],@"   $",[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio_original")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""] :_bm :(int) ([[self->__listacarrito _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (50))]).object)] :(NSObject*)(_map)];
 }
};
B4IRDebugUtils.currentLine=10027072;
 //BA.debugLineNum = 10027072;BA.debugLine="If Main.isLoged Then";
if (self->__main->__isloged /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=10027073;
 //BA.debugLineNum = 10027073;BA.debugLine="lblPrecioEnvio.Text = Main.mapEmpresaInfo.Get(";
[self->__lblprecioenvio setText:[self.bi ObjectToString:[self->__main->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_precio_envio")]]];
B4IRDebugUtils.currentLine=10027074;
 //BA.debugLineNum = 10027074;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(to";
[self->__lblordentotalpagar setText:[@[@"$",[self->___c NumberFormat:self->__total+[self.bi ObjectToNumber:[self->__main->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_precio_envio")]].doubleValue :(int) (2) :(int) (2)]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=10027078;
 //BA.debugLineNum = 10027078;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat2(t";
[self->__lblordentotalpagar setText:[@[@"$",[self->___c NumberFormat2:self->__total :(int) (0) :(int) (2) :(int) (2) :false]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=10027079;
 //BA.debugLineNum = 10027079;BA.debugLine="hud.ToastMessageShow(\"Precio calculado sin pre";
[self->__hud ToastMessageShow:@"Precio calculado sin precio de envio!!" :false];
 };
 break; }
case 1: {
B4IRDebugUtils.currentLine=10027085;
 //BA.debugLineNum = 10027085;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=10027086;
 //BA.debugLineNum = 10027086;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"1")]) { 
B4IRDebugUtils.currentLine=10027087;
 //BA.debugLineNum = 10027087;BA.debugLine="If Job.Tag Then";
if ([self.bi ObjectToBoolean:_job->__tag /*NSObject**/ ]) { 
B4IRDebugUtils.currentLine=10027088;
 //BA.debugLineNum = 10027088;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado.\",Fa";
[self->__hud ToastMessageShow:@"Producto eliminado." :false];
B4IRDebugUtils.currentLine=10027089;
 //BA.debugLineNum = 10027089;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto -";
self->__main->__cantidadproduto /*int*/  = (int) (self->__main->__cantidadproduto /*int*/ -1);
 }else {
B4IRDebugUtils.currentLine=10027091;
 //BA.debugLineNum = 10027091;BA.debugLine="hud.ToastMessageShow(\"Producto actualizado.\",";
[self->__hud ToastMessageShow:@"Producto actualizado." :false];
 };
B4IRDebugUtils.currentLine=10027094;
 //BA.debugLineNum = 10027094;BA.debugLine="cargarProductosTemporales";
[self _cargarproductostemporales];
B4IRDebugUtils.currentLine=10027095;
 //BA.debugLineNum = 10027095;BA.debugLine="btnOpcionesBack_Click";
[self _btnopcionesback_click];
 }else {
B4IRDebugUtils.currentLine=10027097;
 //BA.debugLineNum = 10027097;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
[self->___c Msgbox:[@[@"No hay unidades suficientes de este producto. La existencia actual es de ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_existencia")]]] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=10027098;
 //BA.debugLineNum = 10027098;BA.debugLine="Return";
if (true) return @"";
 };
 break; }
case 2: {
B4IRDebugUtils.currentLine=10027102;
 //BA.debugLineNum = 10027102;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=10027103;
 //BA.debugLineNum = 10027103;BA.debugLine="MiListaDireccion.Clear";
[self->__milistadireccion _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10027104;
 //BA.debugLineNum = 10027104;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=10027105;
 //BA.debugLineNum = 10027105;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
[self->___c Msgbox:@"No tiene direcciones registradas" :@"Información"];
B4IRDebugUtils.currentLine=10027106;
 //BA.debugLineNum = 10027106;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=10027109;
 //BA.debugLineNum = 10027109;BA.debugLine="Dim dr,city,name,default=\"\" As String";
_dr = @"";
_city = @"";
_name = @"";
_default = @"";
B4IRDebugUtils.currentLine=10027110;
 //BA.debugLineNum = 10027110;BA.debugLine="For i=0 To list.Size -1";
{
const int step67 = 1;
const int limit67 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit67 ;_i = _i + step67 ) {
B4IRDebugUtils.currentLine=10027111;
 //BA.debugLineNum = 10027111;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=10027112;
 //BA.debugLineNum = 10027112;BA.debugLine="dr = funciones.base64_Decode(map.Get(\"f_direcc";
_dr = [self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion1")]]];
B4IRDebugUtils.currentLine=10027113;
 //BA.debugLineNum = 10027113;BA.debugLine="city = \" ,\"&map.Get(\"f_sector_city\")";
_city = [@[@" ,",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_sector_city")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=10027114;
 //BA.debugLineNum = 10027114;BA.debugLine="name = map.Get(\"f_nombre_direccion\")";
_name = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_nombre_direccion")]];
B4IRDebugUtils.currentLine=10027115;
 //BA.debugLineNum = 10027115;BA.debugLine="If dr.Length > 40 Then";
if ([_dr Length]>40) { 
B4IRDebugUtils.currentLine=10027116;
 //BA.debugLineNum = 10027116;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = [@[[_dr SubString2:(int) (0) :(int) (40)],@"..."] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=10027119;
 //BA.debugLineNum = 10027119;BA.debugLine="If map.Get(\"f_principal\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_principal")]]) { 
B4IRDebugUtils.currentLine=10027122;
 //BA.debugLineNum = 10027122;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=10027124;
 //BA.debugLineNum = 10027124;BA.debugLine="default = \"Main address\"";
_default = @"Main address";
 }else {
B4IRDebugUtils.currentLine=10027128;
 //BA.debugLineNum = 10027128;BA.debugLine="default = \"Dirección principal\"";
_default = @"Dirección principal";
 };
 };
B4IRDebugUtils.currentLine=10027133;
 //BA.debugLineNum = 10027133;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy\"";
[[self->___c DateTime] setDateFormat:@"dd/MM/yyyy"];
B4IRDebugUtils.currentLine=10027135;
 //BA.debugLineNum = 10027135;BA.debugLine="MiListaDireccion.Add(CreateListItemOnlyString(";
[self->__milistadireccion _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitemonlystring:[@[_name,@": ",_dr,_city] componentsJoinedByString:@""] :[[self->___c DateTime] Date:[self.bi ObjectToLongNumber:[_map Get:(NSObject*)(@"f_fecha")]]] :_default :(int) ([[self->__milistadireccion _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (80))]).object)] :(NSObject*)(_map)];
 }
};
 break; }
case 3: {
B4IRDebugUtils.currentLine=10027139;
 //BA.debugLineNum = 10027139;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
[self->___c Msgbox:[@[@"Orden registrada.",@"\n",@"Numero de orden: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_data")]]] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=10027140;
 //BA.debugLineNum = 10027140;BA.debugLine="Main.cantidadProduto = 0";
self->__main->__cantidadproduto /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=10027141;
 //BA.debugLineNum = 10027141;BA.debugLine="btnOrdenBack_Click";
[self _btnordenback_click];
 break; }
case 4: {
B4IRDebugUtils.currentLine=10027144;
 //BA.debugLineNum = 10027144;BA.debugLine="map=map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=10027145;
 //BA.debugLineNum = 10027145;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"1")]) { 
B4IRDebugUtils.currentLine=10027146;
 //BA.debugLineNum = 10027146;BA.debugLine="ListaCarrito.Clear";
[self->__listacarrito _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=10027147;
 //BA.debugLineNum = 10027147;BA.debugLine="Main.cantidadProduto = 0";
self->__main->__cantidadproduto /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=10027148;
 //BA.debugLineNum = 10027148;BA.debugLine="lblOrdenTotalPagar.Text = \"0.00\"";
[self->__lblordentotalpagar setText:@"0.00"];
B4IRDebugUtils.currentLine=10027149;
 //BA.debugLineNum = 10027149;BA.debugLine="hud.ToastMessageShow(\"Eliminados Correctamente";
[self->__hud ToastMessageShow:@"Eliminados Correctamente" :true];
B4IRDebugUtils.currentLine=10027151;
 //BA.debugLineNum = 10027151;BA.debugLine="Main.cantidadProduto = 0";
self->__main->__cantidadproduto /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=10027152;
 //BA.debugLineNum = 10027152;BA.debugLine="btnOrdenBack_Click";
[self _btnordenback_click];
 }else {
B4IRDebugUtils.currentLine=10027154;
 //BA.debugLineNum = 10027154;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
[self->___c Msgbox:@"Los productos no fueron eliminados" :@"Información"];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=10027160;
 //BA.debugLineNum = 10027160;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listacarrito_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"listacarrito_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listacarrito_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _mapa = nil;
B4IRDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub ListaCarrito_ItemClick (Index As Int, Value As";
B4IRDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Dim mapa As Map = Value";
_mapa = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=10223619;
 //BA.debugLineNum = 10223619;BA.debugLine="btnOpcionesProductoSalvar.Tag = mapa";
[self->__btnopcionesproductosalvar setTag:(NSObject*)(_mapa)];
B4IRDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="lblOpcionesProductoNombre.Text = mapa.Get(\"f_desc";
[self->__lblopcionesproductonombre setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=10223623;
 //BA.debugLineNum = 10223623;BA.debugLine="txtCantidad.Text =mapa.Get(\"f_cantidad\")";
[self->__txtcantidad setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_cantidad")]]];
B4IRDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="valorCantidad = mapa.Get(\"f_cantidad\")";
self->__valorcantidad = [self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_cantidad")]].intValue;
B4IRDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="txtProductoComentario.Text = mapa.Get(\"f_comentar";
[self->__txtproductocomentario setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_comentario")]]];
B4IRDebugUtils.currentLine=10223627;
 //BA.debugLineNum = 10223627;BA.debugLine="PanelOpcionesBack.Left = 0%x";
[self->__panelopcionesback setLeft:[self->___c PerXToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="PanelOpcionesBack.SetAlphaAnimated(500,1)";
[self->__panelopcionesback SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _milistadireccion_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"milistadireccion_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"milistadireccion_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="Sub MiListaDireccion_ItemClick (Index As Int, Valu";
B4IRDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="Dim map As Map = Value";
_map = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="lblDireccion.Text = funciones.base64_Decode(map.G";
[self->__lbldireccion setText:[@[[self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion1")]]],@", ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_sector_city")]],@", ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_nom_estado")]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
[self->__lbldireccion setTag:[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=10813446;
 //BA.debugLineNum = 10813446;BA.debugLine="btnBackMdalDireccion_Click";
[self _btnbackmdaldireccion_click];
B4IRDebugUtils.currentLine=10813448;
 //BA.debugLineNum = 10813448;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgdelete_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"msgdelete_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgdelete_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
NSString* _json = @"";
b4i_httpjob* _jobeliminartodo = nil;
B4IRDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub MsgDelete_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=11206659;
 //BA.debugLineNum = 11206659;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="json = \"'f_imei':\"&Main.imei";
_json = [@[@"'f_imei':",self->__main->__imei /*NSString**/ ] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="Dim JobEliminarTodo As HttpJob";
_jobeliminartodo = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me)";
[_jobeliminartodo _initialize /*NSString**/ :nil :self.bi :@"JobEliminarTodo" :self];
B4IRDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa/";
[_jobeliminartodo _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/get_eliminar_detalle_usuarios2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msglogin_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"msglogin_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msglogin_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IRDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub MsgLogin_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="Login.Initialize";
[self->__login _initialize /*NSString**/ ];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgvender_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"msgvender_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgvender_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
NSString* _json = @"";
b4i_httpjob* _jobsalvar = nil;
B4IRDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="Sub MsgVender_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=11075587;
 //BA.debugLineNum = 11075587;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempres";
_json = [@[@"'f_comprobante_fiscal':false,'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_itbis':",[self.bi NumberToString:@(self->__tax)],@",'f_subtotal':",[self.bi NumberToString:@(self->__subtotal)],@",'f_total':",[self.bi NumberToString:@(self->__total)],@",'f_nota':'','f_imei':",self->__main->__imei /*NSString**/ ,@",'f_direccion':'",[self->__funciones _base64_encode /*NSString**/ :[self->__lbldireccion Text]],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=11075590;
 //BA.debugLineNum = 11075590;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11075591;
 //BA.debugLineNum = 11075591;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
[_jobsalvar _initialize /*NSString**/ :nil :self.bi :@"JobSalvar" :self];
B4IRDebugUtils.currentLine=11075592;
 //BA.debugLineNum = 11075592;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_sa";
[_jobsalvar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/set_salvar_orden_delivery2/"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=11075595;
 //BA.debugLineNum = 11075595;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11075598;
 //BA.debugLineNum = 11075598;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msjeliminar_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"msjeliminar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msjeliminar_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IMap* _map = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub msjEliminar_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
B4IRDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = (B4IMap*)([self->__btnopcionesproductosalvar Tag]);
B4IRDebugUtils.currentLine=10551301;
 //BA.debugLineNum = 10551301;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=10551303;
 //BA.debugLineNum = 10551303;BA.debugLine="json = \"'f_regresa':true\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':true",@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_tipo':2",@",'f_idserver':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idserver")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTempora";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=10551310;
 //BA.debugLineNum = 10551310;BA.debugLine="JobDetalleTemporal.Tag = True";
_jobdetalletemporal->__tag /*NSObject**/  = (NSObject*)(@(true));
B4IRDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="If Main.isLoged And 1 == 2 Then";
if (self->__main->__isloged /*BOOL*/  && 1==2) { 
B4IRDebugUtils.currentLine=10551313;
 //BA.debugLineNum = 10551313;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntove";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=10551315;
 //BA.debugLineNum = 10551315;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntove";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
 };
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=10551320;
 //BA.debugLineNum = 10551320;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=10551323;
 //BA.debugLineNum = 10551323;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _paneldireccion_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"paneldireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"paneldireccion_click" :nil]);}
B4IRDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub PanelDireccion_Click";
B4IRDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="If Main.isLoged Then";
if (self->__main->__isloged /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="cargarDirecciones";
[self _cargardirecciones];
B4IRDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="PanelFondoDireccionModal.Top = 0%y";
[self->__panelfondodireccionmodal setTop:[self->___c PerYToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="PanelFondoDireccionModal.SetAlphaAnimated(500,1)";
[self->__panelfondodireccionmodal SetAlphaAnimated:(int) (500) :(float) (1)];
 }else {
B4IRDebugUtils.currentLine=10616841;
 //BA.debugLineNum = 10616841;BA.debugLine="Msgbox2(\"MsgLogin\",\"Antes de ver sus direcciones";
[self->___c Msgbox2:self.bi :@"MsgLogin" :@"Antes de ver sus direcciones tiene que iniciar sesion" :@"Advertencia" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=10616844;
 //BA.debugLineNum = 10616844;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Private page As Page";
self->__page = [B4IPage new];
B4IRDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Private btnOrdenBack As Button";
self->__btnordenback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Private PanelOrdenTitulo As Panel";
self->__panelordentitulo = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="Private ListaCarrito As CustomListView";
self->__listacarrito = [b4i_customlistview new];
B4IRDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="Dim hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="Dim changeValue As Boolean = False";
self->__changevalue = false;
B4IRDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="dim valorCantidad as Int = 0";
self->__valorcantidad = (int) (0);
B4IRDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="Dim tax As Double = 0";
self->__tax = 0;
B4IRDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="Dim subtotal As Double = 0";
self->__subtotal = 0;
B4IRDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="Dim total As Double = 0";
self->__total = 0;
B4IRDebugUtils.currentLine=9764882;
 //BA.debugLineNum = 9764882;BA.debugLine="Private lblOrdenTotalPagar As Label";
self->__lblordentotalpagar = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764883;
 //BA.debugLineNum = 9764883;BA.debugLine="Private lblPrecioEnvio As Label";
self->__lblprecioenvio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764884;
 //BA.debugLineNum = 9764884;BA.debugLine="Private lblDireccion As Label";
self->__lbldireccion = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764885;
 //BA.debugLineNum = 9764885;BA.debugLine="Private imgCat As ImageView";
self->__imgcat = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=9764886;
 //BA.debugLineNum = 9764886;BA.debugLine="Private lblNomCat As Label";
self->__lblnomcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764887;
 //BA.debugLineNum = 9764887;BA.debugLine="Private lblCantCat As Label";
self->__lblcantcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764888;
 //BA.debugLineNum = 9764888;BA.debugLine="Private lblOpcionesProductoNombre As Label";
self->__lblopcionesproductonombre = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764889;
 //BA.debugLineNum = 9764889;BA.debugLine="Private txtCantidad As TextField";
self->__txtcantidad = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=9764890;
 //BA.debugLineNum = 9764890;BA.debugLine="Private stModificarCantidad As Stepper";
self->__stmodificarcantidad = [B4IStepperWrapper new];
B4IRDebugUtils.currentLine=9764891;
 //BA.debugLineNum = 9764891;BA.debugLine="Private btnOpcionesProductoSalvar As Button";
self->__btnopcionesproductosalvar = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764892;
 //BA.debugLineNum = 9764892;BA.debugLine="Private PanelOpcionesBack As Panel";
self->__panelopcionesback = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=9764893;
 //BA.debugLineNum = 9764893;BA.debugLine="Private btnOpcionesBack As Button";
self->__btnopcionesback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764894;
 //BA.debugLineNum = 9764894;BA.debugLine="Private btnOpcionesEliminar As Button";
self->__btnopcioneseliminar = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764895;
 //BA.debugLineNum = 9764895;BA.debugLine="Private txtProductoComentario As TextField";
self->__txtproductocomentario = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=9764896;
 //BA.debugLineNum = 9764896;BA.debugLine="Private PanelDireccion As Panel";
self->__paneldireccion = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=9764897;
 //BA.debugLineNum = 9764897;BA.debugLine="Private MiListaDireccion As CustomListView";
self->__milistadireccion = [b4i_customlistview new];
B4IRDebugUtils.currentLine=9764898;
 //BA.debugLineNum = 9764898;BA.debugLine="Private btnBackMdalDireccion As Button";
self->__btnbackmdaldireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764899;
 //BA.debugLineNum = 9764899;BA.debugLine="Private btnAbrirDireccion As Button";
self->__btnabrirdireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764900;
 //BA.debugLineNum = 9764900;BA.debugLine="Private PanelFondoDireccionModal As Panel";
self->__panelfondodireccionmodal = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=9764901;
 //BA.debugLineNum = 9764901;BA.debugLine="Private lblDir As Label";
self->__lbldir = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764902;
 //BA.debugLineNum = 9764902;BA.debugLine="Private lblFecha As Label";
self->__lblfecha = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764903;
 //BA.debugLineNum = 9764903;BA.debugLine="Private lblPrincipal As Label";
self->__lblprincipal = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9764904;
 //BA.debugLineNum = 9764904;BA.debugLine="Private btnOrdenEnviar As Button";
self->__btnordenenviar = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764905;
 //BA.debugLineNum = 9764905;BA.debugLine="Private btnOrdenEliminarTodos As Button";
self->__btnordeneliminartodos = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=9764908;
 //BA.debugLineNum = 9764908;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _stmodificarcantidad_valuechanged:(double) _value{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"stmodificarcantidad_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"stmodificarcantidad_valuechanged:" :@[@(_value)]]);}
B4IRDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub stModificarCantidad_ValueChanged (Value As Dou";
B4IRDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="txtCantidad.Text = Value";
[self->__txtcantidad setText:[self.bi NumberToString:@(_value)]];
B4IRDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="End Sub";
return @"";
}
@end