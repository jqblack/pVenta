
#import "b4i_facturacion.h"
#import "b4i_main.h"
#import "b4i_principal.h"
#import "b4i_funcion.h"
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

@interface ResumableSub_facturacion_pageProductoOpciones_BarButtonClick :B4IResumableSub 
- (instancetype) init: (b4i_facturacion*) parent1 :(NSString*) _tag1;
@end
@implementation ResumableSub_facturacion_pageProductoOpciones_BarButtonClick {
b4i_facturacion* parent;
NSString* _tag;
NSString* _buttontext;
B4IMap* _map;
NSString* _json;
b4i_httpjob* _jobdetalletemporal;
}
- (instancetype) init: (b4i_facturacion*) parent1 :(NSString*) _tag1 {
self->_tag = _tag1;
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"facturacion";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=4325377;
 //BA.debugLineNum = 4325377;BA.debugLine="Log(\"BarButtonClicked: \" & Tag)";
[parent->___c LogImpl:@"44325377" :[@[@"BarButtonClicked: ",_tag] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Select Tag";
if (true) break;

case 1:
//select
self->_state = 8;
switch ([self.bi switchObjectToInt:_tag :@[@"delete"]]) {
case 0: {
self->_state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="Msgbox2(\"Msg\", \"Seguro que desea eliminar este";
[parent->___c Msgbox2:self.bi :@"Msg" :@"Seguro que desea eliminar este producto?" :@"Confirmación" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=4325383;
 //BA.debugLineNum = 4325383;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
[parent->___c WaitFor:@"msg_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"facturacion" :@"pageproductoopciones_barbuttonclick"] :nil];
self->_state = 9;
return;
case 9:
//C
self->_state = 4;
_buttontext = ((NSString*) result[0]);
;
B4IRDebugUtils.currentLine=4325385;
 //BA.debugLineNum = 4325385;BA.debugLine="If ButtonText <> \"Si\" Then";
if (true) break;

case 4:
//if
self->_state = 7;
if ([_buttontext isEqual:@"Si"] == false) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
self->_state = 8;
;
B4IRDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = (B4IMap*)([parent->__btnopcionesproductosalvar Tag]);
B4IRDebugUtils.currentLine=4325390;
 //BA.debugLineNum = 4325390;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="json = \"'f_regresa':true\"& _ 			\",'f_idempresa'";
_json = [@[@"'f_regresa':true",@",'f_idempresa':",[self.bi NumberToString:@(parent->__principal->__idempresa /*int*/ )],@",'f_tipo':2",@",'f_idserver':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idserver")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=4325398;
 //BA.debugLineNum = 4325398;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTempor";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :parent];
B4IRDebugUtils.currentLine=4325399;
 //BA.debugLineNum = 4325399;BA.debugLine="JobDetalleTemporal.Tag = True";
_jobdetalletemporal->__tag /*NSObject**/  = (NSObject*)(@(true));
B4IRDebugUtils.currentLine=4325400;
 //BA.debugLineNum = 4325400;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntove";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[parent->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal"] componentsJoinedByString:@""] :[@[@"json=",[parent->__funcion _crearjson /*NSString**/ :parent->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4325402;
 //BA.debugLineNum = 4325402;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
[parent->__btnopcionesproductosalvar setEnabled:false];
 if (true) break;

case 8:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_facturacion_ProductoOrden_BarButtonClick :B4IResumableSub 
- (instancetype) init: (b4i_facturacion*) parent1 :(NSString*) _tag1;
@end
@implementation ResumableSub_facturacion_ProductoOrden_BarButtonClick {
b4i_facturacion* parent;
NSString* _tag;
NSString* _buttontext;
b4i_httpjob* _jobeliminartodo;
}
- (instancetype) init: (b4i_facturacion*) parent1 :(NSString*) _tag1 {
self->_tag = _tag1;
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"facturacion";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Log(\"BarButtonClicked: \" & Tag)";
[parent->___c LogImpl:@"44259841" :[@[@"BarButtonClicked: ",_tag] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Select Tag";
if (true) break;

case 1:
//select
self->_state = 8;
switch ([self.bi switchObjectToInt:_tag :@[@"delete"]]) {
case 0: {
self->_state = 3;
if (true) break;
}
}
if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="Msgbox2(\"Msg\", \"Seguro que desea eliminar todos";
[parent->___c Msgbox2:self.bi :@"Msg" :@"Seguro que desea eliminar todos los productos?" :@"Confirmación" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
[parent->___c WaitFor:@"msg_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"facturacion" :@"productoorden_barbuttonclick"] :nil];
self->_state = 9;
return;
case 9:
//C
self->_state = 4;
_buttontext = ((NSString*) result[0]);
;
B4IRDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="If ButtonText <> \"Si\" Then";
if (true) break;

case 4:
//if
self->_state = 7;
if ([_buttontext isEqual:@"Si"] == false) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=4259850;
 //BA.debugLineNum = 4259850;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 7:
//C
self->_state = 8;
;
B4IRDebugUtils.currentLine=4259853;
 //BA.debugLineNum = 4259853;BA.debugLine="Dim JobEliminarTodo As HttpJob";
_jobeliminartodo = [b4i_httpjob new];
B4IRDebugUtils.currentLine=4259854;
 //BA.debugLineNum = 4259854;BA.debugLine="JobEliminarTodo.Initialize(\"JobEliminarTodo\",Me";
[_jobeliminartodo _initialize /*NSString**/ :nil :self.bi :@"JobEliminarTodo" :parent];
B4IRDebugUtils.currentLine=4259855;
 //BA.debugLineNum = 4259855;BA.debugLine="JobEliminarTodo.PostString(Main.url&\"puntoventa";
[_jobeliminartodo _poststring /*NSString**/ :nil :[@[parent->__main->__url /*NSString**/ ,@"puntoventa/get_eliminar_detalle_usuarios"] componentsJoinedByString:@""] :[@[@"json=",[parent->__funcion _crearjson /*NSString**/ :parent->__main->__token /*NSString**/  :[@[@"'f_idempresa':",[self.bi NumberToString:@(parent->__principal->__idempresa /*int*/ )]] componentsJoinedByString:@""]]] componentsJoinedByString:@""]];
 if (true) break;

case 8:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=4259858;
 //BA.debugLineNum = 4259858;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

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
    return 14;
}


- (NSString*)  _initialize{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="page.Initialize(\"ProductoOrden\")";
[self->__page Initialize:self.bi :@"ProductoOrden"];
B4IRDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="page.RootPanel.LoadLayout(\"frmProductoOrden\")";
[[self->__page RootPanel] LoadLayout:@"frmProductoOrden" :self.bi];
B4IRDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="Main.NavControl.ShowPage(page)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__page).object)];
B4IRDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Main.NavControl.ToolBarVisible = False";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:false];
B4IRDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="crear";
[self _crear];
B4IRDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnabrirdireccion_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnabrirdireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnabrirdireccion_click" :nil]);}
B4IRDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub btnAbrirDireccion_Click";
B4IRDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Direcciones.Initialize";
[self->__direcciones _initialize /*NSString**/ ];
B4IRDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="End Sub";
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
B4IViewWrapper* _v = nil;
B4ISwitchWrapper* _ch = nil;
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=4718592;
 //BA.debugLineNum = 4718592;BA.debugLine="Sub btnOpcionesProductoSalvar_Click";
B4IRDebugUtils.currentLine=4718593;
 //BA.debugLineNum = 4718593;BA.debugLine="Dim map As Map = btnOpcionesProductoSalvar.Tag";
_map = (B4IMap*)([self->__btnopcionesproductosalvar Tag]);
B4IRDebugUtils.currentLine=4718594;
 //BA.debugLineNum = 4718594;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = [self->__funcion _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio_original")]].doubleValue :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_descuento")]].doubleValue :[self.bi ObjectToNumber:[self->__txtcantidad Text]].doubleValue :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_porciento_tax")]].doubleValue :self->__principal->__impuestoincluido /*BOOL*/  :false];
B4IRDebugUtils.currentLine=4718595;
 //BA.debugLineNum = 4718595;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=4718597;
 //BA.debugLineNum = 4718597;BA.debugLine="Dim jsonPropiedades As String = \"[\"";
_jsonpropiedades = @"[";
B4IRDebugUtils.currentLine=4718598;
 //BA.debugLineNum = 4718598;BA.debugLine="For Each v As View In ScrollViewOpciones.Panel.Ge";
_v = [B4IViewWrapper new];
{
const id<B4IIterable> group5 = [[self->__scrollviewopciones Panel] GetAllViewsRecursive];
const int groupLen5 = group5.Size
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_v.object = (UIView*)([group5 Get:index5]);
B4IRDebugUtils.currentLine=4718599;
 //BA.debugLineNum = 4718599;BA.debugLine="If v.Tag <> \"label\" Then";
if ([[_v Tag] isEqual:(NSObject*)(@"label")] == false) { 
B4IRDebugUtils.currentLine=4718600;
 //BA.debugLineNum = 4718600;BA.debugLine="Dim ch As Switch = v";
_ch = [B4ISwitchWrapper new];
_ch.object = (UISwitch*)((_v).object);
B4IRDebugUtils.currentLine=4718601;
 //BA.debugLineNum = 4718601;BA.debugLine="If ch.Value Then";
if ([_ch Value]) { 
B4IRDebugUtils.currentLine=4718602;
 //BA.debugLineNum = 4718602;BA.debugLine="jsonPropiedades = jsonPropiedades & \",{'f_idre";
_jsonpropiedades = [@[_jsonpropiedades,@",{'f_idrecord':",[self.bi ObjectToString:[_ch Tag]],@"}"] componentsJoinedByString:@""];
 };
 };
 }
};
B4IRDebugUtils.currentLine=4718606;
 //BA.debugLineNum = 4718606;BA.debugLine="jsonPropiedades = jsonPropiedades.Replace(\"[,\",\"[";
_jsonpropiedades = [_jsonpropiedades Replace:@"[," :@"["];
B4IRDebugUtils.currentLine=4718607;
 //BA.debugLineNum = 4718607;BA.debugLine="jsonPropiedades = jsonPropiedades& \"]\"";
_jsonpropiedades = [@[_jsonpropiedades,@"]"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=4718610;
 //BA.debugLineNum = 4718610;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__principal->__idempresa /*int*/ )],@",'f_propiedades':",_jsonpropiedades,@",'f_tipo':2",@",'f_cantidad':",[self->__txtcantidad Text],@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_idserver':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idserver")]],@",'f_diferencia':",[self.bi NumberToString:@([self->__funcion _getdiferenciacantidad /*double*/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_cantidad")]].doubleValue :[self.bi ObjectToNumber:[self->__txtcantidad Text]].doubleValue])],@",'f_porciento_descuento':0",@",'f_comentario':'",[self->__funcion _base64_encode /*NSString**/ :[self->__txtproductocomentario Text]],@"'",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_porciento_tax")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=4718626;
 //BA.debugLineNum = 4718626;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=4718627;
 //BA.debugLineNum = 4718627;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=4718628;
 //BA.debugLineNum = 4718628;BA.debugLine="JobDetalleTemporal.Tag = False";
_jobdetalletemporal->__tag /*NSObject**/  = (NSObject*)(@(false));
B4IRDebugUtils.currentLine=4718629;
 //BA.debugLineNum = 4718629;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4718630;
 //BA.debugLineNum = 4718630;BA.debugLine="btnOpcionesProductoSalvar.Enabled = False";
[self->__btnopcionesproductosalvar setEnabled:false];
B4IRDebugUtils.currentLine=4718633;
 //BA.debugLineNum = 4718633;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnordenenviar_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"btnordenenviar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnordenenviar_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobsalvar = nil;
B4IRDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub btnOrdenEnviar_Click";
B4IRDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="If Principal.mapEmpresaInfo.Get(\"f_pedidos_minimo";
if ([self.bi ObjectToNumber:[self->__principal->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_pedidos_minimos")]].doubleValue>self->__total) { 
B4IRDebugUtils.currentLine=4128774;
 //BA.debugLineNum = 4128774;BA.debugLine="Msgbox(\"El monto del pedido minimo debe ser de R";
[self->___c Msgbox:[@[@"El monto del pedido minimo debe ser de RD$",[self.bi ObjectToString:[self->__principal->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_pedidos_minimos")]]] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=4128775;
 //BA.debugLineNum = 4128775;BA.debugLine="Return";
if (true) return @"";
 }else if([self->__listviewordenproducto NumberOfSections]==0 || [[self->__listviewordenproducto GetItems:(int) (0)] Size]==0) { 
B4IRDebugUtils.currentLine=4128777;
 //BA.debugLineNum = 4128777;BA.debugLine="Msgbox(\"No hay productos para registrar esta ord";
[self->___c Msgbox:@"No hay productos para registrar esta orden" :@"Información"];
B4IRDebugUtils.currentLine=4128778;
 //BA.debugLineNum = 4128778;BA.debugLine="Return";
if (true) return @"";
 }else if([[self->__lbldireccion Tag] isEqual:(NSObject*)(@(0))]) { 
B4IRDebugUtils.currentLine=4128780;
 //BA.debugLineNum = 4128780;BA.debugLine="Msgbox(\"Seleccione la dirección para el envio\",\"";
[self->___c Msgbox:@"Seleccione la dirección para el envio" :@"Información"];
B4IRDebugUtils.currentLine=4128781;
 //BA.debugLineNum = 4128781;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4128784;
 //BA.debugLineNum = 4128784;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=4128785;
 //BA.debugLineNum = 4128785;BA.debugLine="json = \"'f_comprobante_fiscal':false,'f_idempresa";
_json = [@[@"'f_comprobante_fiscal':false,'f_idempresa':",[self.bi NumberToString:@(self->__principal->__idempresa /*int*/ )],@",'f_itbis':",[self.bi NumberToString:@(self->__tax)],@",'f_subtotal':",[self.bi NumberToString:@(self->__subtotal)],@",'f_total':",[self.bi NumberToString:@(self->__total)],@",'f_nota':'','f_direccion':'",[self->__funcion _base64_encode /*NSString**/ :[self->__lbldireccion Text]],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=4128787;
 //BA.debugLineNum = 4128787;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=4128788;
 //BA.debugLineNum = 4128788;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
[_jobsalvar _initialize /*NSString**/ :nil :self.bi :@"JobSalvar" :self];
B4IRDebugUtils.currentLine=4128789;
 //BA.debugLineNum = 4128789;BA.debugLine="JobSalvar.PostString(Main.url&\"puntoventa/set_sal";
[_jobsalvar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/set_salvar_orden_delivery/"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4128791;
 //BA.debugLineNum = 4128791;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargardirecciones{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"cargardirecciones"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargardirecciones" :nil]);}
b4i_httpjob* _jobdirecciones = nil;
B4IRDebugUtils.currentLine=4521984;
 //BA.debugLineNum = 4521984;BA.debugLine="Sub cargarDirecciones";
B4IRDebugUtils.currentLine=4521985;
 //BA.debugLineNum = 4521985;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = [b4i_httpjob new];
B4IRDebugUtils.currentLine=4521986;
 //BA.debugLineNum = 4521986;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
[_jobdirecciones _initialize /*NSString**/ :nil :self.bi :@"JobDirecciones" :self];
B4IRDebugUtils.currentLine=4521987;
 //BA.debugLineNum = 4521987;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
[_jobdirecciones _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4521988;
 //BA.debugLineNum = 4521988;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarproductostemporales{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"cargarproductostemporales"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarproductostemporales" :nil]);}
b4i_httpjob* _jobbuscar = nil;
B4IRDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub cargarProductosTemporales";
B4IRDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="If Main.isLoggedIn = False Then";
if (self->__main->__isloggedin /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="Msgbox(\"Debe iniciar sesión para facturar un pro";
[self->___c Msgbox:@"Debe iniciar sesión para facturar un producto" :@"Información"];
B4IRDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="Dim JobBuscar As HttpJob";
_jobbuscar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=4063238;
 //BA.debugLineNum = 4063238;BA.debugLine="JobBuscar.Initialize(\"JobBuscar\",Me)";
[_jobbuscar _initialize /*NSString**/ :nil :self.bi :@"JobBuscar" :self];
B4IRDebugUtils.currentLine=4063239;
 //BA.debugLineNum = 4063239;BA.debugLine="JobBuscar.PostString(Main.url&\"puntoventa/get_pro";
[_jobbuscar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/get_productos_temporales_by_key"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :[@[@"'f_idempresa':",[self.bi NumberToString:@(self->__principal->__idempresa /*int*/ )]] componentsJoinedByString:@""]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4063240;
 //BA.debugLineNum = 4063240;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crear{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"crear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crear" :nil]);}
B4IRDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub crear";
B4IRDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="PanelDireccion.SetShadow(Colors.Gray, 0dip,2dip,";
[self->__paneldireccion SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (1) :false];
B4IRDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="PanelOrdenProductosDetalles.SetShadow(Colors.Gray";
[self->__panelordenproductosdetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (1) :false];
B4IRDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="PanelOrdenTotal.SetShadow(Colors.Gray, 0dip,2dip,";
[self->__panelordentotal SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (1) :false];
B4IRDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="lblDireccion.Tag = 0";
[self->__lbldireccion setTag:(NSObject*)(@(0))];
B4IRDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="lblPrecioEnvio.Text = Principal.mapEmpresaInfo.Ge";
[self->__lblprecioenvio setText:[self.bi ObjectToString:[self->__principal->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_precio_envio")]]];
B4IRDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="ListViewOrdenProducto.Initialize(\"ListViewOrdenPr";
[self->__listviewordenproducto Initialize:self.bi :@"ListViewOrdenProducto" :false];
B4IRDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="PanelOrdenProductosDetalles.AddView(ListViewOrden";
[self->__panelordenproductosdetalles AddView:(UIView*)((self->__listviewordenproducto).object) :(float) (0) :(float) (0) :[self->__panelordenproductosdetalles Width] :[self->__panelordenproductosdetalles Height]];
B4IRDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="ListViewOrdenProducto.AddTwoLines(\"\",\"\")";
[self->__listviewordenproducto AddTwoLines:@"" :@""];
B4IRDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="cargarProductosTemporales";
[self _cargarproductostemporales];
B4IRDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="End Sub";
return @"";
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
B4ITableCell* _cell = nil;
NSString* _dr = @"";
NSString* _default = @"";
B4IRDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=4194312;
 //BA.debugLineNum = 4194312;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=4194314;
 //BA.debugLineNum = 4194314;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if ([self->__funcion _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
[_json Initialize:[self->__funcion _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=4194325;
 //BA.debugLineNum = 4194325;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobBuscar",@"JobSalvar",@"JobDetalleTemporal",@"JobDirecciones",@"JobEliminarTodo"]]) {
case 0: {
B4IRDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=4194332;
 //BA.debugLineNum = 4194332;BA.debugLine="ListViewOrdenProducto.RemoveViewFromParent";
[self->__listviewordenproducto RemoveViewFromParent];
B4IRDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="ListViewOrdenProducto.Initialize(\"ListViewOrden";
[self->__listviewordenproducto Initialize:self.bi :@"ListViewOrdenProducto" :false];
B4IRDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="PanelOrdenProductosDetalles.AddView(ListViewOrd";
[self->__panelordenproductosdetalles AddView:(UIView*)((self->__listviewordenproducto).object) :(float) (0) :(float) (0) :[self->__panelordenproductosdetalles Width] :[self->__panelordenproductosdetalles Height]];
B4IRDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=4194336;
 //BA.debugLineNum = 4194336;BA.debugLine="Msgbox(\"No tiene productos registrados\",\"Infor";
[self->___c Msgbox:@"No tiene productos registrados" :@"Información"];
B4IRDebugUtils.currentLine=4194337;
 //BA.debugLineNum = 4194337;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4194340;
 //BA.debugLineNum = 4194340;BA.debugLine="total = 0";
self->__total = 0;
B4IRDebugUtils.currentLine=4194341;
 //BA.debugLineNum = 4194341;BA.debugLine="tax = 0";
self->__tax = 0;
B4IRDebugUtils.currentLine=4194342;
 //BA.debugLineNum = 4194342;BA.debugLine="subtotal = 0";
self->__subtotal = 0;
B4IRDebugUtils.currentLine=4194344;
 //BA.debugLineNum = 4194344;BA.debugLine="For i = 0 To list.Size -1";
{
const int step26 = 1;
const int limit26 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit26 ;_i = _i + step26 ) {
B4IRDebugUtils.currentLine=4194345;
 //BA.debugLineNum = 4194345;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=4194346;
 //BA.debugLineNum = 4194346;BA.debugLine="total = total + map.Get(\"f_importe\")";
self->__total = self->__total+[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_importe")]].doubleValue;
B4IRDebugUtils.currentLine=4194347;
 //BA.debugLineNum = 4194347;BA.debugLine="tax = tax + (map.Get(\"f_tax\") * map.Get(\"f_can";
self->__tax = self->__tax+([self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue*[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_cantidad")]].doubleValue);
B4IRDebugUtils.currentLine=4194348;
 //BA.debugLineNum = 4194348;BA.debugLine="subtotal = subtotal + (map.Get(\"f_precio\") * m";
self->__subtotal = self->__subtotal+([self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue*[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_cantidad")]].doubleValue);
B4IRDebugUtils.currentLine=4194350;
 //BA.debugLineNum = 4194350;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=4194351;
 //BA.debugLineNum = 4194351;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if ([_map Get:(NSObject*)(@"f_foto")]!= nil && [[_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=4194352;
 //BA.debugLineNum = 4194352;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = [self->__funcion _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=4194354;
 //BA.debugLineNum = 4194354;BA.debugLine="bm.Initialize(File.DirAssets,\"packing.png\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"packing.png"];
 };
B4IRDebugUtils.currentLine=4194357;
 //BA.debugLineNum = 4194357;BA.debugLine="Dim cell As TableCell =  ListViewOrdenProducto";
_cell = [self->__listviewordenproducto AddTwoLines:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]] :[@[@"Cantidad: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_cantidad")]],@"     $",[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue+[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4194359;
 //BA.debugLineNum = 4194359;BA.debugLine="cell.Bitmap = bm";
[_cell setBitmap:_bm];
B4IRDebugUtils.currentLine=4194360;
 //BA.debugLineNum = 4194360;BA.debugLine="cell.Tag = map";
[_cell setTag:(NSObject*)(_map)];
 }
};
B4IRDebugUtils.currentLine=4194363;
 //BA.debugLineNum = 4194363;BA.debugLine="lblOrdenTotalPagar.Text = \"$\"& NumberFormat(tot";
[self->__lblordentotalpagar setText:[@[@"$",[self->___c NumberFormat:self->__total+[self.bi ObjectToNumber:[self->__principal->__mapempresainfo /*B4IMap**/  Get:(NSObject*)(@"f_precio_envio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
 break; }
case 1: {
B4IRDebugUtils.currentLine=4194366;
 //BA.debugLineNum = 4194366;BA.debugLine="Msgbox(\"Orden registrada.\"&CRLF&\"Numero de orde";
[self->___c Msgbox:[@[@"Orden registrada.",@"\n",@"Numero de orden: ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_data")]]] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=4194367;
 //BA.debugLineNum = 4194367;BA.debugLine="Principal.cantidadProduto = 0";
self->__principal->__cantidadproduto /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=4194368;
 //BA.debugLineNum = 4194368;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
 break; }
case 2: {
B4IRDebugUtils.currentLine=4194373;
 //BA.debugLineNum = 4194373;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=4194374;
 //BA.debugLineNum = 4194374;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"1")]) { 
B4IRDebugUtils.currentLine=4194375;
 //BA.debugLineNum = 4194375;BA.debugLine="If Job.Tag Then";
if ([self.bi ObjectToBoolean:_job->__tag /*NSObject**/ ]) { 
B4IRDebugUtils.currentLine=4194376;
 //BA.debugLineNum = 4194376;BA.debugLine="hud.ToastMessageShow(\"Producto eliminado.\",Fa";
[self->__hud ToastMessageShow:@"Producto eliminado." :false];
B4IRDebugUtils.currentLine=4194377;
 //BA.debugLineNum = 4194377;BA.debugLine="Principal.cantidadProduto = Principal.cantida";
self->__principal->__cantidadproduto /*int*/  = (int) (self->__principal->__cantidadproduto /*int*/ -1);
 }else {
B4IRDebugUtils.currentLine=4194379;
 //BA.debugLineNum = 4194379;BA.debugLine="hud.ToastMessageShow(\"Producto actualizado.\",";
[self->__hud ToastMessageShow:@"Producto actualizado." :false];
 };
B4IRDebugUtils.currentLine=4194381;
 //BA.debugLineNum = 4194381;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=4194382;
 //BA.debugLineNum = 4194382;BA.debugLine="cargarProductosTemporales";
[self _cargarproductostemporales];
 }else {
B4IRDebugUtils.currentLine=4194386;
 //BA.debugLineNum = 4194386;BA.debugLine="Msgbox(\"No hay unidades suficientes de este pr";
[self->___c Msgbox:[@[@"No hay unidades suficientes de este producto. La existencia actual es de ",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_existencia")]]] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=4194387;
 //BA.debugLineNum = 4194387;BA.debugLine="Return";
if (true) return @"";
 };
 break; }
case 3: {
B4IRDebugUtils.currentLine=4194391;
 //BA.debugLineNum = 4194391;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=4194393;
 //BA.debugLineNum = 4194393;BA.debugLine="If ListViewDirecciones.IsInitialized Then";
if ([self->__listviewdirecciones IsInitialized]) { 
B4IRDebugUtils.currentLine=4194394;
 //BA.debugLineNum = 4194394;BA.debugLine="ListViewDirecciones.RemoveViewFromParent";
[self->__listviewdirecciones RemoveViewFromParent];
B4IRDebugUtils.currentLine=4194395;
 //BA.debugLineNum = 4194395;BA.debugLine="ListViewDirecciones.Initialize(\"ListViewDirecc";
[self->__listviewdirecciones Initialize:self.bi :@"ListViewDirecciones" :false];
B4IRDebugUtils.currentLine=4194396;
 //BA.debugLineNum = 4194396;BA.debugLine="PanelListViewDirecciones.AddView(ListViewDirec";
[self->__panellistviewdirecciones AddView:(UIView*)((self->__listviewdirecciones).object) :(float) (0) :(float) (0) :[self->__panellistviewdirecciones Width] :[self->__panellistviewdirecciones Height]];
 };
B4IRDebugUtils.currentLine=4194399;
 //BA.debugLineNum = 4194399;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=4194400;
 //BA.debugLineNum = 4194400;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
[self->___c Msgbox:@"No tiene direcciones registradas" :@"Información"];
B4IRDebugUtils.currentLine=4194401;
 //BA.debugLineNum = 4194401;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4194405;
 //BA.debugLineNum = 4194405;BA.debugLine="Dim dr,default=\"\" As String";
_dr = @"";
_default = @"";
B4IRDebugUtils.currentLine=4194406;
 //BA.debugLineNum = 4194406;BA.debugLine="For i=0 To list.Size -1";
{
const int step73 = 1;
const int limit73 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit73 ;_i = _i + step73 ) {
B4IRDebugUtils.currentLine=4194407;
 //BA.debugLineNum = 4194407;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=4194408;
 //BA.debugLineNum = 4194408;BA.debugLine="dr = funcion.base64_Decode(map.Get(\"f_direccio";
_dr = [self->__funcion _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion")]]];
B4IRDebugUtils.currentLine=4194409;
 //BA.debugLineNum = 4194409;BA.debugLine="If dr.Length > 40 Then";
if ([_dr Length]>40) { 
B4IRDebugUtils.currentLine=4194410;
 //BA.debugLineNum = 4194410;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = [@[[_dr SubString2:(int) (0) :(int) (40)],@"..."] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=4194413;
 //BA.debugLineNum = 4194413;BA.debugLine="If map.Get(\"f_principal\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_principal")]]) { 
B4IRDebugUtils.currentLine=4194414;
 //BA.debugLineNum = 4194414;BA.debugLine="default = CRLF& \"Dirección principal\"";
_default = [@[@"\n",@"Dirección principal"] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=4194417;
 //BA.debugLineNum = 4194417;BA.debugLine="Dim cell As TableCell = ListViewDirecciones.Ad";
_cell = [self->__listviewdirecciones AddTwoLines:_dr :_default];
B4IRDebugUtils.currentLine=4194418;
 //BA.debugLineNum = 4194418;BA.debugLine="cell.Tag = map";
[_cell setTag:(NSObject*)(_map)];
 }
};
 break; }
case 4: {
B4IRDebugUtils.currentLine=4194422;
 //BA.debugLineNum = 4194422;BA.debugLine="map=map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=4194423;
 //BA.debugLineNum = 4194423;BA.debugLine="If map.Get(\"f_paso\") = \"1\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"1")]) { 
B4IRDebugUtils.currentLine=4194424;
 //BA.debugLineNum = 4194424;BA.debugLine="ListViewOrdenProducto.Clear";
[self->__listviewordenproducto Clear];
B4IRDebugUtils.currentLine=4194425;
 //BA.debugLineNum = 4194425;BA.debugLine="Principal.cantidadProduto = 0";
self->__principal->__cantidadproduto /*int*/  = (int) (0);
B4IRDebugUtils.currentLine=4194426;
 //BA.debugLineNum = 4194426;BA.debugLine="hud.ToastMessageShow(\"Todos los productos fuer";
[self->__hud ToastMessageShow:@"Todos los productos fueron eliminados" :false];
 }else {
B4IRDebugUtils.currentLine=4194428;
 //BA.debugLineNum = 4194428;BA.debugLine="Msgbox(\"Los productos no fueron eliminados\",\"I";
[self->___c Msgbox:@"Los productos no fueron eliminados" :@"Información"];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=4194433;
 //BA.debugLineNum = 4194433;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listviewdirecciones_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"listviewdirecciones_selectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listviewdirecciones_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]);}
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=4390912;
 //BA.debugLineNum = 4390912;BA.debugLine="Sub ListViewDirecciones_SelectedChanged (SectionIn";
B4IRDebugUtils.currentLine=4390913;
 //BA.debugLineNum = 4390913;BA.debugLine="Dim map As Map = Cell.Tag";
_map = (B4IMap*)([_cell Tag]);
B4IRDebugUtils.currentLine=4390914;
 //BA.debugLineNum = 4390914;BA.debugLine="lblDireccion.Text = funcion.base64_Decode( map.Ge";
[self->__lbldireccion setText:[self->__funcion _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion")]]]];
B4IRDebugUtils.currentLine=4390915;
 //BA.debugLineNum = 4390915;BA.debugLine="lblDireccion.Tag = map.Get(\"f_idrecord\")";
[self->__lbldireccion setTag:[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=4390916;
 //BA.debugLineNum = 4390916;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=4390917;
 //BA.debugLineNum = 4390917;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listviewordenproducto_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"listviewordenproducto_selectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listviewordenproducto_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]);}
B4IList* _listaproductos = nil;
B4IJSONParser* _json = nil;
B4IMap* _map = nil;
B4ILabelWrapper* _lbl = nil;
double _height = 0.0;
B4IMap* _map2 = nil;
int _i = 0;
B4ISwitchWrapper* _ch = nil;
B4IRDebugUtils.currentLine=4587520;
 //BA.debugLineNum = 4587520;BA.debugLine="Sub ListViewOrdenProducto_SelectedChanged (Section";
B4IRDebugUtils.currentLine=4587522;
 //BA.debugLineNum = 4587522;BA.debugLine="pageOpciones.Initialize(\"pageProductoOpciones\")";
[self->__pageopciones Initialize:self.bi :@"pageProductoOpciones"];
B4IRDebugUtils.currentLine=4587523;
 //BA.debugLineNum = 4587523;BA.debugLine="pageOpciones.RootPanel.LoadLayout(\"frmProductoOpc";
[[self->__pageopciones RootPanel] LoadLayout:@"frmProductoOpciones" :self.bi];
B4IRDebugUtils.currentLine=4587524;
 //BA.debugLineNum = 4587524;BA.debugLine="pageOpciones.RootPanel.Tag = pageOpciones.RootPan";
[[self->__pageopciones RootPanel] setTag:(NSObject*)(@([[self->__pageopciones RootPanel] Top]))];
B4IRDebugUtils.currentLine=4587526;
 //BA.debugLineNum = 4587526;BA.debugLine="txtCantidad.SetShadow(Colors.Gray, 0dip,0dip, 0.2";
[self->__txtcantidad SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (0))) :(float) (0.2) :false];
B4IRDebugUtils.currentLine=4587527;
 //BA.debugLineNum = 4587527;BA.debugLine="PanelScrollViewOpciones.SetShadow(Colors.Gray, 0d";
[self->__panelscrollviewopciones SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (0))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=4587528;
 //BA.debugLineNum = 4587528;BA.debugLine="txtProductoComentario.SetShadow(Colors.Gray, 0dip";
[self->__txtproductocomentario SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (0))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=4587530;
 //BA.debugLineNum = 4587530;BA.debugLine="Dim listaProductos As List";
_listaproductos = [B4IList new];
B4IRDebugUtils.currentLine=4587531;
 //BA.debugLineNum = 4587531;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=4587532;
 //BA.debugLineNum = 4587532;BA.debugLine="Main.NavControl.ShowPage(pageOpciones)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pageopciones).object)];
B4IRDebugUtils.currentLine=4587534;
 //BA.debugLineNum = 4587534;BA.debugLine="Dim map As Map = Cell.Tag";
_map = (B4IMap*)([_cell Tag]);
B4IRDebugUtils.currentLine=4587535;
 //BA.debugLineNum = 4587535;BA.debugLine="txtCantidad.Tag = map.Get(\"f_cantidad\")";
[self->__txtcantidad setTag:[_map Get:(NSObject*)(@"f_cantidad")]];
B4IRDebugUtils.currentLine=4587536;
 //BA.debugLineNum = 4587536;BA.debugLine="txtCantidad.Text = txtCantidad.Tag";
[self->__txtcantidad setText:[self.bi ObjectToString:[self->__txtcantidad Tag]]];
B4IRDebugUtils.currentLine=4587537;
 //BA.debugLineNum = 4587537;BA.debugLine="stModificarCantidad.Value = txtCantidad.Tag";
[self->__stmodificarcantidad setValue:[self.bi ObjectToNumber:[self->__txtcantidad Tag]].doubleValue];
B4IRDebugUtils.currentLine=4587539;
 //BA.debugLineNum = 4587539;BA.debugLine="lblOpcionesProductoNombre.Text = map.Get(\"f_descr";
[self->__lblopcionesproductonombre setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=4587540;
 //BA.debugLineNum = 4587540;BA.debugLine="txtProductoComentario.Text = funcion.base64_Decod";
[self->__txtproductocomentario setText:[self->__funcion _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_comentario")]]]];
B4IRDebugUtils.currentLine=4587542;
 //BA.debugLineNum = 4587542;BA.debugLine="json.Initialize(map.Get(\"f_propiedades\"))";
[_json Initialize:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_propiedades")]]];
B4IRDebugUtils.currentLine=4587543;
 //BA.debugLineNum = 4587543;BA.debugLine="listaProductos = json.NextArray";
_listaproductos = [_json NextArray];
B4IRDebugUtils.currentLine=4587544;
 //BA.debugLineNum = 4587544;BA.debugLine="ScrollViewOpciones.Panel.RemoveAllViews";
[[self->__scrollviewopciones Panel] RemoveAllViews];
B4IRDebugUtils.currentLine=4587545;
 //BA.debugLineNum = 4587545;BA.debugLine="ScrollViewOpciones.ContentWidth = ScrollViewOpcio";
[self->__scrollviewopciones setContentWidth:(int) ([self->__scrollviewopciones Width])];
B4IRDebugUtils.currentLine=4587546;
 //BA.debugLineNum = 4587546;BA.debugLine="btnOpcionesProductoSalvar.Tag =Cell.Tag";
[self->__btnopcionesproductosalvar setTag:[_cell Tag]];
B4IRDebugUtils.currentLine=4587548;
 //BA.debugLineNum = 4587548;BA.debugLine="If listaProductos.Size = 0 Then";
if ([_listaproductos Size]==0) { 
B4IRDebugUtils.currentLine=4587549;
 //BA.debugLineNum = 4587549;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=4587550;
 //BA.debugLineNum = 4587550;BA.debugLine="lbl.Initialize(\"-\")";
[_lbl Initialize:self.bi :@"-"];
B4IRDebugUtils.currentLine=4587551;
 //BA.debugLineNum = 4587551;BA.debugLine="lbl.Text = \"No hay opciones disponibles\"";
[_lbl setText:@"No hay opciones disponibles"];
B4IRDebugUtils.currentLine=4587552;
 //BA.debugLineNum = 4587552;BA.debugLine="lbl.TextAlignment = lbl.ALIGNMENT_CENTER";
[_lbl setTextAlignment:[_lbl ALIGNMENT_CENTER]];
B4IRDebugUtils.currentLine=4587553;
 //BA.debugLineNum = 4587553;BA.debugLine="lbl.TextColor = Colors.Gray";
[_lbl setTextColor:[[self->___c Colors] Gray]];
B4IRDebugUtils.currentLine=4587554;
 //BA.debugLineNum = 4587554;BA.debugLine="lbl.Font = Font.CreateNew(15)";
[_lbl setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=4587555;
 //BA.debugLineNum = 4587555;BA.debugLine="lbl.Tag = \"label\"";
[_lbl setTag:(NSObject*)(@"label")];
B4IRDebugUtils.currentLine=4587557;
 //BA.debugLineNum = 4587557;BA.debugLine="ScrollViewOpciones.Panel.AddView(lbl,2%x,5%y,Scr";
[[self->__scrollviewopciones Panel] AddView:(UIView*)((_lbl).object) :[self->___c PerXToCurrent:(float) (2)] :[self->___c PerYToCurrent:(float) (5)] :[[self->__scrollviewopciones Panel] Width] :(float) (((int) (20)))];
B4IRDebugUtils.currentLine=4587558;
 //BA.debugLineNum = 4587558;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=4587561;
 //BA.debugLineNum = 4587561;BA.debugLine="Dim height As Double = 10dip";
_height = ((int) (10));
B4IRDebugUtils.currentLine=4587562;
 //BA.debugLineNum = 4587562;BA.debugLine="Dim map2 As Map";
_map2 = [B4IMap new];
B4IRDebugUtils.currentLine=4587563;
 //BA.debugLineNum = 4587563;BA.debugLine="For i=0 To listaProductos.Size -1";
{
const int step34 = 1;
const int limit34 = (int) ([_listaproductos Size]-1);
_i = (int) (0) ;
for (;_i <= limit34 ;_i = _i + step34 ) {
B4IRDebugUtils.currentLine=4587564;
 //BA.debugLineNum = 4587564;BA.debugLine="map2 = listaProductos.Get(i)";
_map2 = (B4IMap*)([_listaproductos Get:_i]);
B4IRDebugUtils.currentLine=4587565;
 //BA.debugLineNum = 4587565;BA.debugLine="Dim ch As Switch";
_ch = [B4ISwitchWrapper new];
B4IRDebugUtils.currentLine=4587566;
 //BA.debugLineNum = 4587566;BA.debugLine="ch.Initialize(i&\"ck\")";
[_ch Initialize:self.bi :[@[[self.bi NumberToString:@(_i)],@"ck"] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=4587567;
 //BA.debugLineNum = 4587567;BA.debugLine="ch.Tag = map2.Get(\"f_idrecord\")";
[_ch setTag:[_map2 Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=4587568;
 //BA.debugLineNum = 4587568;BA.debugLine="ch.Value = map2.Get(\"f_agregado\")";
[_ch setValue:[self.bi ObjectToBoolean:[_map2 Get:(NSObject*)(@"f_agregado")]]];
B4IRDebugUtils.currentLine=4587570;
 //BA.debugLineNum = 4587570;BA.debugLine="Dim lbl As Label";
_lbl = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=4587571;
 //BA.debugLineNum = 4587571;BA.debugLine="lbl.Initialize(\"-\")";
[_lbl Initialize:self.bi :@"-"];
B4IRDebugUtils.currentLine=4587572;
 //BA.debugLineNum = 4587572;BA.debugLine="lbl.Text = map2.Get(\"f_descripcion\")";
[_lbl setText:[self.bi ObjectToString:[_map2 Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=4587573;
 //BA.debugLineNum = 4587573;BA.debugLine="lbl.TextAlignment = lbl.ALIGNMENT_LEFT";
[_lbl setTextAlignment:[_lbl ALIGNMENT_LEFT]];
B4IRDebugUtils.currentLine=4587574;
 //BA.debugLineNum = 4587574;BA.debugLine="lbl.TextColor =  Colors.Black";
[_lbl setTextColor:[[self->___c Colors] Black]];
B4IRDebugUtils.currentLine=4587575;
 //BA.debugLineNum = 4587575;BA.debugLine="lbl.Font = Font.CreateNew(15)";
[_lbl setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=4587576;
 //BA.debugLineNum = 4587576;BA.debugLine="lbl.Tag = \"label\"";
[_lbl setTag:(NSObject*)(@"label")];
B4IRDebugUtils.currentLine=4587578;
 //BA.debugLineNum = 4587578;BA.debugLine="ScrollViewOpciones.Panel.AddView(ch,2%x,height,1";
[[self->__scrollviewopciones Panel] AddView:(UIView*)((_ch).object) :[self->___c PerXToCurrent:(float) (2)] :(float) (_height) :[self->___c PerXToCurrent:(float) (15)] :(float) (((int) (50)))];
B4IRDebugUtils.currentLine=4587579;
 //BA.debugLineNum = 4587579;BA.debugLine="ScrollViewOpciones.Panel.AddView(lbl,ch.Left + c";
[[self->__scrollviewopciones Panel] AddView:(UIView*)((_lbl).object) :(float) ([_ch Left]+[_ch Width]) :(float) (_height) :[self->___c PerXToCurrent:(float) (96)] :(float) (((int) (30)))];
B4IRDebugUtils.currentLine=4587580;
 //BA.debugLineNum = 4587580;BA.debugLine="height = height + 40dip";
_height = _height+((int) (40));
 }
};
B4IRDebugUtils.currentLine=4587582;
 //BA.debugLineNum = 4587582;BA.debugLine="ScrollViewOpciones.ContentHeight = height";
[self->__scrollviewopciones setContentHeight:(int) (_height)];
B4IRDebugUtils.currentLine=4587584;
 //BA.debugLineNum = 4587584;BA.debugLine="End Sub";
return @"";
}
- (void)  _pageproductoopciones_barbuttonclick:(NSString*) _tag{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"pageproductoopciones_barbuttonclick"])
	 {[B4IDebug delegate:self.bi :@"pageproductoopciones_barbuttonclick:" :@[[B4I nilToNSNull:_tag]]]; return;}
ResumableSub_facturacion_pageProductoOpciones_BarButtonClick* rsub = [[ResumableSub_facturacion_pageProductoOpciones_BarButtonClick alloc] init:self : _tag];
[rsub resume:self.bi :nil];
}
//-412941822
- (NSString*)  _pageproductoopciones_keyboardstatechanged:(float) _height{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"pageproductoopciones_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pageproductoopciones_keyboardstatechanged:" :@[@(_height)]]);}
B4IRDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub  pageProductoOpciones_KeyboardStateChanged (He";
B4IRDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="funcion.KeyboardStateChanged(Height,pageOpciones,";
[self->__funcion _keyboardstatechanged /*NSString**/ :_height :self->__pageopciones :[self.bi ObjectToNumber:[[self->__pageopciones RootPanel] Tag]].doubleValue];
B4IRDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _paneldireccion_click{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"paneldireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"paneldireccion_click" :nil]);}
B4IRDebugUtils.currentLine=4456448;
 //BA.debugLineNum = 4456448;BA.debugLine="Sub PanelDireccion_Click";
B4IRDebugUtils.currentLine=4456451;
 //BA.debugLineNum = 4456451;BA.debugLine="pageDirecciones.Initialize(\"pageDireccionesModal\"";
[self->__pagedirecciones Initialize:self.bi :@"pageDireccionesModal"];
B4IRDebugUtils.currentLine=4456452;
 //BA.debugLineNum = 4456452;BA.debugLine="pageDirecciones.RootPanel.LoadLayout(\"frmDireccio";
[[self->__pagedirecciones RootPanel] LoadLayout:@"frmDireccionesModal" :self.bi];
B4IRDebugUtils.currentLine=4456453;
 //BA.debugLineNum = 4456453;BA.debugLine="Main.NavControl.ShowPage(pageDirecciones)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pagedirecciones).object)];
B4IRDebugUtils.currentLine=4456455;
 //BA.debugLineNum = 4456455;BA.debugLine="ListViewDirecciones.Initialize(\"ListViewDireccion";
[self->__listviewdirecciones Initialize:self.bi :@"ListViewDirecciones" :false];
B4IRDebugUtils.currentLine=4456456;
 //BA.debugLineNum = 4456456;BA.debugLine="PanelListViewDirecciones.AddView(ListViewDireccio";
[self->__panellistviewdirecciones AddView:(UIView*)((self->__listviewdirecciones).object) :(float) (0) :(float) (0) :[self->__panellistviewdirecciones Width] :[self->__panellistviewdirecciones Height]];
B4IRDebugUtils.currentLine=4456457;
 //BA.debugLineNum = 4456457;BA.debugLine="PanelListViewDirecciones.SetShadow(Colors.Gray, 0";
[self->__panellistviewdirecciones SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (1) :false];
B4IRDebugUtils.currentLine=4456458;
 //BA.debugLineNum = 4456458;BA.debugLine="cargarDirecciones";
[self _cargardirecciones];
B4IRDebugUtils.currentLine=4456459;
 //BA.debugLineNum = 4456459;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Private page As Page";
self->__page = [B4IPage new];
B4IRDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="Private pageOpciones As Page";
self->__pageopciones = [B4IPage new];
B4IRDebugUtils.currentLine=3866629;
 //BA.debugLineNum = 3866629;BA.debugLine="Private pageDirecciones As Page";
self->__pagedirecciones = [B4IPage new];
B4IRDebugUtils.currentLine=3866631;
 //BA.debugLineNum = 3866631;BA.debugLine="Private btnOrdenEnviar As Button";
self->__btnordenenviar = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=3866632;
 //BA.debugLineNum = 3866632;BA.debugLine="Private lblDireccion As Label";
self->__lbldireccion = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=3866633;
 //BA.debugLineNum = 3866633;BA.debugLine="Private lblOrdenTotalPagar As Label";
self->__lblordentotalpagar = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=3866634;
 //BA.debugLineNum = 3866634;BA.debugLine="Private lblPrecioEnvio As Label";
self->__lblprecioenvio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=3866635;
 //BA.debugLineNum = 3866635;BA.debugLine="Private PanelDireccion As Panel";
self->__paneldireccion = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=3866636;
 //BA.debugLineNum = 3866636;BA.debugLine="Private PanelOrdenProductosDetalles As Panel";
self->__panelordenproductosdetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=3866637;
 //BA.debugLineNum = 3866637;BA.debugLine="Private PanelOrdenTotal As Panel";
self->__panelordentotal = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=3866638;
 //BA.debugLineNum = 3866638;BA.debugLine="Private ListViewOrdenProducto As TableView";
self->__listviewordenproducto = [B4ITableView new];
B4IRDebugUtils.currentLine=3866640;
 //BA.debugLineNum = 3866640;BA.debugLine="Private tax As Double = 0";
self->__tax = 0;
B4IRDebugUtils.currentLine=3866641;
 //BA.debugLineNum = 3866641;BA.debugLine="Private subtotal As Double = 0";
self->__subtotal = 0;
B4IRDebugUtils.currentLine=3866642;
 //BA.debugLineNum = 3866642;BA.debugLine="Private total As Double = 0";
self->__total = 0;
B4IRDebugUtils.currentLine=3866643;
 //BA.debugLineNum = 3866643;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=3866647;
 //BA.debugLineNum = 3866647;BA.debugLine="Private btnOpcionesProductoSalvar As Button";
self->__btnopcionesproductosalvar = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=3866648;
 //BA.debugLineNum = 3866648;BA.debugLine="Private ScrollViewOpciones As ScrollView";
self->__scrollviewopciones = [B4IScrollView new];
B4IRDebugUtils.currentLine=3866649;
 //BA.debugLineNum = 3866649;BA.debugLine="Private stModificarCantidad As Stepper";
self->__stmodificarcantidad = [B4IStepperWrapper new];
B4IRDebugUtils.currentLine=3866650;
 //BA.debugLineNum = 3866650;BA.debugLine="Private txtCantidad As TextField";
self->__txtcantidad = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=3866651;
 //BA.debugLineNum = 3866651;BA.debugLine="Private txtProductoComentario As TextView";
self->__txtproductocomentario = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=3866652;
 //BA.debugLineNum = 3866652;BA.debugLine="Private lblOpcionesProductoNombre As Label";
self->__lblopcionesproductonombre = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=3866653;
 //BA.debugLineNum = 3866653;BA.debugLine="Private PanelScrollViewOpciones As Panel";
self->__panelscrollviewopciones = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=3866656;
 //BA.debugLineNum = 3866656;BA.debugLine="Private ListViewDirecciones As TableView";
self->__listviewdirecciones = [B4ITableView new];
B4IRDebugUtils.currentLine=3866657;
 //BA.debugLineNum = 3866657;BA.debugLine="Private btnAbrirDireccion As Button";
self->__btnabrirdireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=3866658;
 //BA.debugLineNum = 3866658;BA.debugLine="Private PanelListViewDirecciones As Panel";
self->__panellistviewdirecciones = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=3866659;
 //BA.debugLineNum = 3866659;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _productoopciones_disappear{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"productoopciones_disappear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"productoopciones_disappear" :nil]);}
B4IRDebugUtils.currentLine=4653056;
 //BA.debugLineNum = 4653056;BA.debugLine="Sub ProductoOpciones_Disappear";
B4IRDebugUtils.currentLine=4653061;
 //BA.debugLineNum = 4653061;BA.debugLine="End Sub";
return @"";
}
- (void)  _productoorden_barbuttonclick:(NSString*) _tag{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"productoorden_barbuttonclick"])
	 {[B4IDebug delegate:self.bi :@"productoorden_barbuttonclick:" :@[[B4I nilToNSNull:_tag]]]; return;}
ResumableSub_facturacion_ProductoOrden_BarButtonClick* rsub = [[ResumableSub_facturacion_ProductoOrden_BarButtonClick alloc] init:self : _tag];
[rsub resume:self.bi :nil];
}
//-1599408418
- (NSString*)  _stmodificarcantidad_valuechanged:(double) _value{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"stmodificarcantidad_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"stmodificarcantidad_valuechanged:" :@[@(_value)]]);}
B4IRDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub stModificarCantidad_ValueChanged (Value As Dou";
B4IRDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="txtCantidad.Text = Value";
[self->__txtcantidad setText:[self.bi NumberToString:@(_value)]];
B4IRDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtproductocomentario_textchanged:(NSString*) _oldtext :(NSString*) _newtext{
B4IRDebugUtils.currentModule=@"facturacion";
if ([B4IDebug shouldDelegate: @"txtproductocomentario_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtproductocomentario_textchanged::" :@[[B4I nilToNSNull:_oldtext],[B4I nilToNSNull:_newtext]]]);}
B4IRDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub txtProductoComentario_TextChanged (OldText As";
B4IRDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="If NewText.Contains(CRLF) Then";
if ([_newtext Contains:@"\n"]) { 
B4IRDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="pageOpciones.resignfocus";
[self->__pageopciones ResignFocus];
 };
B4IRDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="End Sub";
return @"";
}
@end