
#import "b4i_principal.h"
#import "b4i_main.h"
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

@interface ResumableSub_principal_Initialize :B4IResumableSub 
- (instancetype) init: (b4i_principal*) parent1;
@end
@implementation ResumableSub_principal_Initialize {
b4i_principal* parent;
b4i_httpjob* _jobempresainfo;
NSString* _buttontext;
}
- (instancetype) init: (b4i_principal*) parent1 {
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"principal";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="page.Initialize(\"PagePrincipal\")";
[parent->__page Initialize:self.bi :@"PagePrincipal"];
B4IRDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="page.RootPanel.LoadLayout(\"frmPrincipal\")";
[[parent->__page RootPanel] LoadLayout:@"frmPrincipal" :self.bi];
B4IRDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="Main.NavControl.ShowPage2(page,False )";
[parent->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((parent->__page).object) :false];
B4IRDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="Main.NavControl.SetNavigationBarVisibleAnimated(T";
[parent->__main->__navcontrol /*B4INavigationControllerWrapper**/  SetNavigationBarVisibleAnimated:true];
B4IRDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="Main.NavControl.ToolBarVisible = True";
[parent->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:true];
B4IRDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="Dim JobEmpresaInfo As HttpJob";
_jobempresainfo = [b4i_httpjob new];
B4IRDebugUtils.currentLine=1048586;
 //BA.debugLineNum = 1048586;BA.debugLine="JobEmpresaInfo.Initialize(\"JobEmpresaInfo\",Me)";
[_jobempresainfo _initialize /*NSString**/ :nil :self.bi :@"JobEmpresaInfo" :parent];
B4IRDebugUtils.currentLine=1048587;
 //BA.debugLineNum = 1048587;BA.debugLine="JobEmpresaInfo.PostString(Main.url&\"ws/get_datos_";
[_jobempresainfo _poststring /*NSString**/ :nil :[@[parent->__main->__url /*NSString**/ ,@"ws/get_datos_preferencia"] componentsJoinedByString:@""] :[@[@"json=",[parent->__funcion _crearjson /*NSString**/ :parent->__main->__tokenpublico /*NSString**/  :[@[@"'f_idempresa':",[self.bi NumberToString:@(parent->__idempresa)]] componentsJoinedByString:@""]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1048589;
 //BA.debugLineNum = 1048589;BA.debugLine="btnMasVendido.Tag = False";
[parent->__btnmasvendido setTag:(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=1048590;
 //BA.debugLineNum = 1048590;BA.debugLine="btnBuscarProducto.SetShadow(Colors.Gray, 0dip,2di";
[parent->__btnbuscarproducto SetShadow:[[parent->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (1) :false];
B4IRDebugUtils.currentLine=1048591;
 //BA.debugLineNum = 1048591;BA.debugLine="btnMasVendido.SetShadow(Colors.Gray, 0dip,2dip, 1";
[parent->__btnmasvendido SetShadow:[[parent->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (1) :false];
B4IRDebugUtils.currentLine=1048592;
 //BA.debugLineNum = 1048592;BA.debugLine="PanelCategoria.SetShadow(Colors.Gray, 0,0, 1, Fal";
[parent->__panelcategoria SetShadow:[[parent->___c Colors] Gray] :(float) (0) :(float) (0) :(float) (1) :false];
B4IRDebugUtils.currentLine=1048594;
 //BA.debugLineNum = 1048594;BA.debugLine="ViewCategoria.ContentWidth = ViewCategoria.Width";
[parent->__viewcategoria setContentWidth:(int) ([parent->__viewcategoria Width])];
B4IRDebugUtils.currentLine=1048595;
 //BA.debugLineNum = 1048595;BA.debugLine="ViewCategoria.ContentHeight = ViewCategoria.Heigh";
[parent->__viewcategoria setContentHeight:(int) ([parent->__viewcategoria Height])];
B4IRDebugUtils.currentLine=1048596;
 //BA.debugLineNum = 1048596;BA.debugLine="PanelModalProducto.Alpha = 0";
[parent->__panelmodalproducto setAlpha:(float) (0)];
B4IRDebugUtils.currentLine=1048597;
 //BA.debugLineNum = 1048597;BA.debugLine="btnMasVendido_Click";
[parent _btnmasvendido_click];
B4IRDebugUtils.currentLine=1048606;
 //BA.debugLineNum = 1048606;BA.debugLine="Sleep(2000)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"principal" :@"initialize"] :(int) (2000)];
self->_state = 9;
return;
case 9:
//C
self->_state = 1;
;
B4IRDebugUtils.currentLine=1048607;
 //BA.debugLineNum = 1048607;BA.debugLine="If Main.isLoggedIn = False Then";
if (true) break;

case 1:
//if
self->_state = 8;
if (parent->__main->__isloggedin /*BOOL*/ ==false) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=1048608;
 //BA.debugLineNum = 1048608;BA.debugLine="Msgbox2(\"Msg\", \"Desea iniciar sesión y asi poder";
[parent->___c Msgbox2:self.bi :@"Msg" :@"Desea iniciar sesión y asi poder registrar ordenes?" :@"Información" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Iniciar Sesion")],[B4I nilToNSNull:(NSObject*)(@"Mas tarde")]]]]];
B4IRDebugUtils.currentLine=1048609;
 //BA.debugLineNum = 1048609;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
[parent->___c WaitFor:@"msg_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"principal" :@"initialize"] :nil];
self->_state = 10;
return;
case 10:
//C
self->_state = 4;
_buttontext = ((NSString*) result[0]);
;
B4IRDebugUtils.currentLine=1048610;
 //BA.debugLineNum = 1048610;BA.debugLine="If ButtonText = \"Iniciar Sesion\" Then";
if (true) break;

case 4:
//if
self->_state = 7;
if ([_buttontext isEqual:@"Iniciar Sesion"]) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
B4IRDebugUtils.currentLine=1048611;
 //BA.debugLineNum = 1048611;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[parent->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
 if (true) break;

case 7:
//C
self->_state = 8;
;
B4IRDebugUtils.currentLine=1048613;
 //BA.debugLineNum = 1048613;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 8:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=1048616;
 //BA.debugLineNum = 1048616;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_principal_loginUser :B4IResumableSub 
- (instancetype) init: (b4i_principal*) parent1;
@end
@implementation ResumableSub_principal_loginUser {
b4i_principal* parent;
NSString* _buttontext;
}
- (instancetype) init: (b4i_principal*) parent1 {
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"principal";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Msgbox2(\"Msg\", \"Debe iniciar sesión para realizar";
[parent->___c Msgbox2:self.bi :@"Msg" :@"Debe iniciar sesión para realizar esta acción" :@"Información" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Iniciar Sesion")],[B4I nilToNSNull:(NSObject*)(@"Volver")]]]]];
B4IRDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="Wait For Msg_Click (ButtonText As String)";
[parent->___c WaitFor:@"msg_click:" :self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"principal" :@"loginuser"] :nil];
self->_state = 5;
return;
case 5:
//C
self->_state = 1;
_buttontext = ((NSString*) result[0]);
;
B4IRDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="If ButtonText = \"Iniciar Sesion\" Then";
if (true) break;

case 1:
//if
self->_state = 4;
if ([_buttontext isEqual:@"Iniciar Sesion"]) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[parent->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
 if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_principal 


+ (instancetype)new {
    static b4i_principal* shared = nil;
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


- (void)  _initialize{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {[B4IDebug delegate:self.bi :@"initialize" :nil]; return;}
ResumableSub_principal_Initialize* rsub = [[ResumableSub_principal_Initialize alloc] init:self ];
[rsub resume:self.bi :nil];
}
//-2132843762
- (NSString*)  _btnbuscarproducto_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btnbuscarproducto_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbuscarproducto_click" :nil]);}
B4IRDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub btnBuscarProducto_Click";
B4IRDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="PanelModalProducto.Left = 0";
[self->__panelmodalproducto setLeft:(float) (0)];
B4IRDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="PanelModalProducto.SetAlphaAnimated(300,1)";
[self->__panelmodalproducto SetAlphaAnimated:(int) (300) :(float) (1)];
B4IRDebugUtils.currentLine=1900550;
 //BA.debugLineNum = 1900550;BA.debugLine="ListProductosModalView.Initialize(\"ListProductosM";
[self->__listproductosmodalview Initialize:self.bi :@"ListProductosModalView" :false];
B4IRDebugUtils.currentLine=1900551;
 //BA.debugLineNum = 1900551;BA.debugLine="PanelProductosModalView.AddView(ListProductosModa";
[self->__panelproductosmodalview AddView:(UIView*)((self->__listproductosmodalview).object) :(float) (0) :(float) (0) :[self->__panelproductosmodalview Width] :[self->__panelproductosmodalview Height]];
B4IRDebugUtils.currentLine=1900552;
 //BA.debugLineNum = 1900552;BA.debugLine="ListProductosModalView.AddTwoLines(\"\",\"\")";
[self->__listproductosmodalview AddTwoLines:@"" :@""];
B4IRDebugUtils.currentLine=1900554;
 //BA.debugLineNum = 1900554;BA.debugLine="txtBuscarProducto.RequestFocus";
[self->__txtbuscarproducto RequestFocus];
B4IRDebugUtils.currentLine=1900555;
 //BA.debugLineNum = 1900555;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btninfocerrar_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btninfocerrar_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btninfocerrar_click" :nil]);}
B4IRDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub btnInfoCerrar_Click";
B4IRDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="Main.NavControl.RemoveCurrentPage2(True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage2:true];
B4IRDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Main.NavControl.SetNavigationBarVisibleAnimated(T";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  SetNavigationBarVisibleAnimated:true];
B4IRDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="Main.NavControl.ToolBarVisible = True";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:true];
B4IRDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnmasvendido_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btnmasvendido_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnmasvendido_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobproductomasvendido = nil;
B4IRDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub btnMasVendido_Click";
B4IRDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="If btnMasVendido.Tag Then";
if ([self.bi ObjectToBoolean:[self->__btnmasvendido Tag]]) { 
B4IRDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="cargarCaterorias";
[self _cargarcaterorias];
 }else {
B4IRDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="Dim JobProductoMasVendido As HttpJob";
_jobproductomasvendido = [b4i_httpjob new];
B4IRDebugUtils.currentLine=1507336;
 //BA.debugLineNum = 1507336;BA.debugLine="JobProductoMasVendido.Initialize(\"JobProductoMas";
[_jobproductomasvendido _initialize /*NSString**/ :nil :self.bi :@"JobProductoMasVendido" :self];
B4IRDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="JobProductoMasVendido.PostString(Main.url&\"ws/ge";
[_jobproductomasvendido _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_productos_main_page"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
 };
B4IRDebugUtils.currentLine=1507340;
 //BA.debugLineNum = 1507340;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarcaterorias{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"cargarcaterorias"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarcaterorias" :nil]);}
b4i_httpjob* _jobcategoria = nil;
B4IRDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub cargarCaterorias";
B4IRDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="hud.ProgressDialogShow(\"Cargando categorias\")";
[self->__hud ProgressDialogShow:@"Cargando categorias"];
B4IRDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Dim JobCategoria As HttpJob";
_jobcategoria = [b4i_httpjob new];
B4IRDebugUtils.currentLine=1376259;
 //BA.debugLineNum = 1376259;BA.debugLine="JobCategoria.Initialize(\"JobCategoria\",Me)";
[_jobcategoria _initialize /*NSString**/ :nil :self.bi :@"JobCategoria" :self];
B4IRDebugUtils.currentLine=1376260;
 //BA.debugLineNum = 1376260;BA.debugLine="JobCategoria.PostString(Main.url&\"ws/get_categori";
[_jobcategoria _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_categorias_by_empresa/"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :[@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)]] componentsJoinedByString:@""]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="btnMasVendido.Text = \"Ver ofertas \"";
[self->__btnmasvendido setText:@"Ver ofertas "];
B4IRDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="btnMasVendido.Tag = False";
[self->__btnmasvendido setTag:(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=1376263;
 //BA.debugLineNum = 1376263;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnproductobuscarmodal_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btnproductobuscarmodal_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnproductobuscarmodal_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobbuscarproducto = nil;
B4IRDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub btnProductoBuscarModal_Click";
B4IRDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="If txtBuscarProducto.Text.Trim.Length = 0 Then";
if ([[[self->__txtbuscarproducto Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Msgbox(\"Escriba el nombre del producto\",\"Informa";
[self->___c Msgbox:@"Escriba el nombre del producto" :@"Información"];
B4IRDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2031623;
 //BA.debugLineNum = 2031623;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=2031624;
 //BA.debugLineNum = 2031624;BA.debugLine="json = \"'f_idempresa':\"&idEmpresa&\",'f_parametro'";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)],@",'f_parametro':'",[[[self->__txtbuscarproducto Text] Replace:@"'" :@""] Replace:@"\"" :@""],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=2031626;
 //BA.debugLineNum = 2031626;BA.debugLine="Dim JobBuscarProducto As HttpJob";
_jobbuscarproducto = [b4i_httpjob new];
B4IRDebugUtils.currentLine=2031627;
 //BA.debugLineNum = 2031627;BA.debugLine="JobBuscarProducto.Initialize(\"JobBuscarProducto\",";
[_jobbuscarproducto _initialize /*NSString**/ :nil :self.bi :@"JobBuscarProducto" :self];
B4IRDebugUtils.currentLine=2031628;
 //BA.debugLineNum = 2031628;BA.debugLine="JobBuscarProducto.PostString(Main.url&\"ws/get_pro";
[_jobbuscarproducto _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_productos_by_paramentros"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=2031629;
 //BA.debugLineNum = 2031629;BA.debugLine="hud.ProgressDialogShow(\"Buscando producto...\")";
[self->__hud ProgressDialogShow:@"Buscando producto..."];
B4IRDebugUtils.currentLine=2031632;
 //BA.debugLineNum = 2031632;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnproductovolver_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btnproductovolver_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnproductovolver_click" :nil]);}
B4IRDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub btnProductoVolver_Click";
B4IRDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="PanelModalProducto.SetAlphaAnimated(300,0)";
[self->__panelmodalproducto SetAlphaAnimated:(int) (300) :(float) (0)];
B4IRDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnviewcategoria_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btnviewcategoria_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnviewcategoria_click" :nil]);}
B4IButtonWrapper* _b = nil;
B4IMap* _map = nil;
NSString* _json = @"";
b4i_httpjob* _jobproductobycategoria = nil;
B4IRDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub btnViewCategoria_Click";
B4IRDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim b As Button";
_b = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="b = Sender";
_b.object = (UIButton*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="Dim map As Map = b.Tag";
_map = (B4IMap*)([_b Tag]);
B4IRDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="Dim json As String = \"'f_idempresa':\"&idEmpresa&\"";
_json = [@[@"'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)],@",'f_idcategoria':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="Dim JobProductoByCategoria As HttpJob";
_jobproductobycategoria = [b4i_httpjob new];
B4IRDebugUtils.currentLine=1638408;
 //BA.debugLineNum = 1638408;BA.debugLine="JobProductoByCategoria.Initialize(\"JobProductoByC";
[_jobproductobycategoria _initialize /*NSString**/ :nil :self.bi :@"JobProductoByCategoria" :self];
B4IRDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="JobProductoByCategoria.PostString(Main.url&\"ws/ge";
[_jobproductobycategoria _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_productos_by_categoria"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnviewproducto_click{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"btnviewproducto_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnviewproducto_click" :nil]);}
B4IButtonWrapper* _b = nil;
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub btnViewProducto_Click";
B4IRDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="If mapEmpresaInfo.IsInitialized And mapEmpresaInf";
if ([self->__mapempresainfo IsInitialized] && [[self->__mapempresainfo Get:(NSObject*)(@"f_laborando")] isEqual:(NSObject*)(@(false))]) { 
B4IRDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Msgbox(\"No estamos laborando en estos momentos.";
[self->___c Msgbox:@"No estamos laborando en estos momentos. Por favor realise su orden en nuestros horarios laborales." :@"Información"];
B4IRDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="Dim b As Button = Sender";
_b = [B4IButtonWrapper new];
_b.object = (UIButton*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="Dim map As Map = b.Tag";
_map = (B4IMap*)([_b Tag]);
B4IRDebugUtils.currentLine=1703945;
 //BA.debugLineNum = 1703945;BA.debugLine="salvar_detalle_temporal(map)";
[self _salvar_detalle_temporal:_map];
B4IRDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"salvar_detalle_temporal"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"salvar_detalle_temporal:" :@[[B4I nilToNSNull:_map]]]);}
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub salvar_detalle_temporal(map As Map)";
B4IRDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="If Main.isLoggedIn = False Then";
if (self->__main->__isloggedin /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="loginUser";
[self _loginuser];
B4IRDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="Dim mapCalculos As Map = funcion.recalcular(map.G";
_mapcalculos = [self->__funcion _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :0 :1 :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :self->__impuestoincluido :false];
B4IRDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=1769483;
 //BA.debugLineNum = 1769483;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__idempresa)],@",'f_tipo':1",@",'f_idproducto':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_cantidad':1",@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_diferencia':0",@",'f_porciento_descuento':0",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_tax")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=1769496;
 //BA.debugLineNum = 1769496;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=1769497;
 //BA.debugLineNum = 1769497;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=1769498;
 //BA.debugLineNum = 1769498;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargarviewproductos:(B4IList*) _list :(BOOL) _categorias{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"cargarviewproductos"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargarviewproductos::" :@[[B4I nilToNSNull:_list],@(_categorias)]]);}
B4IMap* _map = nil;
int _panelheight = 0;
int _height = 0;
int _left = 0;
int _i = 0;
B4IButtonWrapper* _btn = nil;
B4IBitmap* _bm = nil;
B4IRDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub cargarViewProductos(list As List, categorias A";
B4IRDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Dim panelHeight As Int = 7dip";
_panelheight = ((int) (7));
B4IRDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Dim height As Int = ViewCategoria.Height  * 0.25";
_height = (int) ([self->__viewcategoria Height]*0.25);
B4IRDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Dim left As Int = ViewCategoria.Height  * 0.02";
_left = (int) ([self->__viewcategoria Height]*0.02);
B4IRDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="ViewCategoria.Panel.RemoveAllViews";
[[self->__viewcategoria Panel] RemoveAllViews];
B4IRDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="For i=0 To list.Size -1";
{
const int step6 = 1;
const int limit6 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit6 ;_i = _i + step6 ) {
B4IRDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Dim btn As Button";
_btn = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=1441804;
 //BA.debugLineNum = 1441804;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="If categorias Then";
if (_categorias) { 
B4IRDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="btn.InitializeCustom(\"btnViewCategoria\", Colors";
[_btn InitializeCustom:@"btnViewCategoria" :self.bi :[[self->___c Colors] White] :[[self->___c Colors] Red]];
B4IRDebugUtils.currentLine=1441808;
 //BA.debugLineNum = 1441808;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fot";
if ([_map Get:(NSObject*)(@"f_foto")]!= nil && [[_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=1441809;
 //BA.debugLineNum = 1441809;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = [self->__funcion _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=1441811;
 //BA.debugLineNum = 1441811;BA.debugLine="bm.Initialize(File.DirAssets,\"cook-food.jpeg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"cook-food.jpeg"];
 };
B4IRDebugUtils.currentLine=1441813;
 //BA.debugLineNum = 1441813;BA.debugLine="btn.Text = map.Get(\"f_descripcion\")";
[_btn setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=1441814;
 //BA.debugLineNum = 1441814;BA.debugLine="btn.CustomLabel.Font = Font.CreateNew(20)";
[[_btn CustomLabel] setFont:[[self->___c Font] CreateNew:(float) (20)]];
 }else {
B4IRDebugUtils.currentLine=1441817;
 //BA.debugLineNum = 1441817;BA.debugLine="btn.InitializeCustom(\"btnViewProducto\", Colors.";
[_btn InitializeCustom:@"btnViewProducto" :self.bi :[[self->___c Colors] White] :[[self->___c Colors] Red]];
B4IRDebugUtils.currentLine=1441818;
 //BA.debugLineNum = 1441818;BA.debugLine="bm.Initialize(File.DirAssets,\"pexels-photo.jpeg";
[_bm Initialize:[[self->___c File] DirAssets] :@"pexels-photo.jpeg"];
B4IRDebugUtils.currentLine=1441819;
 //BA.debugLineNum = 1441819;BA.debugLine="btn.Text = map.Get(\"f_descripcion\") &CRLF&CRLF&";
[_btn setText:[@[[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]],@"\n",@"\n",@"RD$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1441820;
 //BA.debugLineNum = 1441820;BA.debugLine="btn.CustomLabel.Font = Font.CreateNew(15)";
[[_btn CustomLabel] setFont:[[self->___c Font] CreateNew:(float) (15)]];
 };
B4IRDebugUtils.currentLine=1441823;
 //BA.debugLineNum = 1441823;BA.debugLine="funcion.SetBackgroundImage(btn,bm,0)";
[self->__funcion _setbackgroundimage /*NSString**/ :_btn :_bm :(int) (0)];
B4IRDebugUtils.currentLine=1441824;
 //BA.debugLineNum = 1441824;BA.debugLine="btn.Color = Colors.Red";
[_btn setColor:[[self->___c Colors] Red]];
B4IRDebugUtils.currentLine=1441825;
 //BA.debugLineNum = 1441825;BA.debugLine="btn.CustomLabel.TextColor = Colors.White";
[[_btn CustomLabel] setTextColor:[[self->___c Colors] White]];
B4IRDebugUtils.currentLine=1441826;
 //BA.debugLineNum = 1441826;BA.debugLine="btn.CustomLabel.Multiline = True";
[[_btn CustomLabel] setMultiline:true];
B4IRDebugUtils.currentLine=1441827;
 //BA.debugLineNum = 1441827;BA.debugLine="btn.CustomLabel.TextAlignment = btn.CustomLabel.";
[[_btn CustomLabel] setTextAlignment:[[_btn CustomLabel] ALIGNMENT_CENTER]];
B4IRDebugUtils.currentLine=1441828;
 //BA.debugLineNum = 1441828;BA.debugLine="btn.Tag = map";
[_btn setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=1441829;
 //BA.debugLineNum = 1441829;BA.debugLine="btn.Alpha = 0";
[_btn setAlpha:(float) (0)];
B4IRDebugUtils.currentLine=1441830;
 //BA.debugLineNum = 1441830;BA.debugLine="btn.SetAlphaAnimated(500,1)";
[_btn SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=1441832;
 //BA.debugLineNum = 1441832;BA.debugLine="ViewCategoria.Panel.AddView(btn, left , panelHei";
[[self->__viewcategoria Panel] AddView:(UIView*)((_btn).object) :(float) (_left) :(float) (_panelheight) :(float) ([self->__viewcategoria Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) (_height)];
B4IRDebugUtils.currentLine=1441833;
 //BA.debugLineNum = 1441833;BA.debugLine="panelHeight = height + panelHeight + ViewCategor";
_panelheight = (int) (_height+_panelheight+[self->__viewcategoria Height]*0.02);
 }
};
B4IRDebugUtils.currentLine=1441836;
 //BA.debugLineNum = 1441836;BA.debugLine="ViewCategoria.ContentHeight = panelHeight";
[self->__viewcategoria setContentHeight:_panelheight];
B4IRDebugUtils.currentLine=1441837;
 //BA.debugLineNum = 1441837;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
int _i = 0;
B4IBitmap* _bm = nil;
B4ITableCell* _cell = nil;
B4IRDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="hud.ProgressDialogHide";
[self->__hud ProgressDialogHide];
B4IRDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if ([self->__funcion _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=1572881;
 //BA.debugLineNum = 1572881;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
[_json Initialize:[self->__funcion _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=1572884;
 //BA.debugLineNum = 1572884;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobEmpresaInfo",@"JobCategoria",@"JobProductoByCategoria",@"JobDetalleTemporal",@"JobProductoMasVendido",@"JobBuscarProducto"]]) {
case 0: {
B4IRDebugUtils.currentLine=1572891;
 //BA.debugLineNum = 1572891;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="mapEmpresaInfo = list.Get(0)";
self->__mapempresainfo = (B4IMap*)([_list Get:(int) (0)]);
B4IRDebugUtils.currentLine=1572894;
 //BA.debugLineNum = 1572894;BA.debugLine="page.Title =  mapEmpresaInfo.Get(\"f_nombre\")";
[self->__page setTitle:[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_nombre")]]];
B4IRDebugUtils.currentLine=1572895;
 //BA.debugLineNum = 1572895;BA.debugLine="btnAbierto.Enabled = mapEmpresaInfo.Get(\"f_labo";
[self->__btnabierto setEnabled:[self.bi ObjectToBoolean:[self->__mapempresainfo Get:(NSObject*)(@"f_laborando")]]];
B4IRDebugUtils.currentLine=1572896;
 //BA.debugLineNum = 1572896;BA.debugLine="lblLema.Text = mapEmpresaInfo.Get(\"f_lema\")";
[self->__lbllema setText:[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_lema")]]];
B4IRDebugUtils.currentLine=1572898;
 //BA.debugLineNum = 1572898;BA.debugLine="If btnAbierto.Enabled Then";
if ([self->__btnabierto Enabled]) { 
B4IRDebugUtils.currentLine=1572899;
 //BA.debugLineNum = 1572899;BA.debugLine="btnAbierto.Text = \"Abierto\"";
[self->__btnabierto setText:@"Abierto"];
B4IRDebugUtils.currentLine=1572900;
 //BA.debugLineNum = 1572900;BA.debugLine="btnAbierto.CustomLabel.TextColor = Colors.RGB(";
[[self->__btnabierto CustomLabel] setTextColor:[[self->___c Colors] RGB:(int) (12) :(int) (166) :(int) (0)]];
B4IRDebugUtils.currentLine=1572901;
 //BA.debugLineNum = 1572901;BA.debugLine="btnAbierto.SetBorder(1, Colors.RGB(12,166,0),1";
[self->__btnabierto SetBorder:(float) (1) :[[self->___c Colors] RGB:(int) (12) :(int) (166) :(int) (0)] :(float) (13)];
 }else {
B4IRDebugUtils.currentLine=1572903;
 //BA.debugLineNum = 1572903;BA.debugLine="btnAbierto.Text = \"Cerrado\"";
[self->__btnabierto setText:@"Cerrado"];
B4IRDebugUtils.currentLine=1572904;
 //BA.debugLineNum = 1572904;BA.debugLine="btnAbierto.SetBorder(1, Colors.RGB(192,13,13),";
[self->__btnabierto SetBorder:(float) (1) :[[self->___c Colors] RGB:(int) (192) :(int) (13) :(int) (13)] :(float) (15)];
B4IRDebugUtils.currentLine=1572905;
 //BA.debugLineNum = 1572905;BA.debugLine="btnAbierto.CustomLabel.TextColor = Colors.RGB(";
[[self->__btnabierto CustomLabel] setTextColor:[[self->___c Colors] RGB:(int) (192) :(int) (13) :(int) (13)]];
 };
 break; }
case 1: {
B4IRDebugUtils.currentLine=1572909;
 //BA.debugLineNum = 1572909;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=1572910;
 //BA.debugLineNum = 1572910;BA.debugLine="lblCategoria.Text = list.Size & \" Categotias\"";
[self->__lblcategoria setText:[@[[self.bi NumberToString:@([_list Size])],@" Categotias"] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1572911;
 //BA.debugLineNum = 1572911;BA.debugLine="cargarViewProductos(list, True)";
[self _cargarviewproductos:_list :true];
 break; }
case 2: {
B4IRDebugUtils.currentLine=1572914;
 //BA.debugLineNum = 1572914;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=1572915;
 //BA.debugLineNum = 1572915;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=1572916;
 //BA.debugLineNum = 1572916;BA.debugLine="Msgbox(\"Esta categoria no tiene productos.\",\"I";
[self->___c Msgbox:@"Esta categoria no tiene productos." :@"Información"];
B4IRDebugUtils.currentLine=1572917;
 //BA.debugLineNum = 1572917;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1572920;
 //BA.debugLineNum = 1572920;BA.debugLine="lblCategoria.Alpha = 0";
[self->__lblcategoria setAlpha:(float) (0)];
B4IRDebugUtils.currentLine=1572921;
 //BA.debugLineNum = 1572921;BA.debugLine="lblCategoria. SetAlphaAnimated(300, 1)";
[self->__lblcategoria SetAlphaAnimated:(int) (300) :(float) (1)];
B4IRDebugUtils.currentLine=1572922;
 //BA.debugLineNum = 1572922;BA.debugLine="lblCategoria.Text =  list.Size & \" Productos\"";
[self->__lblcategoria setText:[@[[self.bi NumberToString:@([_list Size])],@" Productos"] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1572923;
 //BA.debugLineNum = 1572923;BA.debugLine="ViewCategoria.Tag = list";
[self->__viewcategoria setTag:(NSObject*)((_list).object)];
B4IRDebugUtils.currentLine=1572924;
 //BA.debugLineNum = 1572924;BA.debugLine="cargarViewProductos(list, False)";
[self _cargarviewproductos:_list :false];
 break; }
case 3: {
B4IRDebugUtils.currentLine=1572927;
 //BA.debugLineNum = 1572927;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=1572928;
 //BA.debugLineNum = 1572928;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"0")]) { 
B4IRDebugUtils.currentLine=1572929;
 //BA.debugLineNum = 1572929;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
[self->___c Msgbox:[@[@"Este producto no tiene existencia: ",@"\n",[self.bi ObjectToString:_job->__tag /*NSObject**/ ],@"."] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=1572930;
 //BA.debugLineNum = 1572930;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1572932;
 //BA.debugLineNum = 1572932;BA.debugLine="cantidadProduto = cantidadProduto + 1";
self->__cantidadproduto = (int) (self->__cantidadproduto+1);
B4IRDebugUtils.currentLine=1572935;
 //BA.debugLineNum = 1572935;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
[self->__hud ToastMessageShow:@"Producto agregado al carrito." :false];
 break; }
case 4: {
B4IRDebugUtils.currentLine=1572938;
 //BA.debugLineNum = 1572938;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=1572939;
 //BA.debugLineNum = 1572939;BA.debugLine="lblCategoria.Text = list.Size & \" Productos en";
[self->__lblcategoria setText:[@[[self.bi NumberToString:@([_list Size])],@" Productos en oferta"] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1572940;
 //BA.debugLineNum = 1572940;BA.debugLine="cargarViewProductos(list,False)";
[self _cargarviewproductos:_list :false];
B4IRDebugUtils.currentLine=1572941;
 //BA.debugLineNum = 1572941;BA.debugLine="btnMasVendido.Text = \"Ver cartegorias  \"";
[self->__btnmasvendido setText:@"Ver cartegorias  "];
B4IRDebugUtils.currentLine=1572942;
 //BA.debugLineNum = 1572942;BA.debugLine="btnMasVendido.Tag = True";
[self->__btnmasvendido setTag:(NSObject*)(@(true))];
 break; }
case 5: {
B4IRDebugUtils.currentLine=1572946;
 //BA.debugLineNum = 1572946;BA.debugLine="If ListProductosModalView.IsInitialized Then";
if ([self->__listproductosmodalview IsInitialized]) { 
B4IRDebugUtils.currentLine=1572947;
 //BA.debugLineNum = 1572947;BA.debugLine="ListProductosModalView.RemoveViewFromParent";
[self->__listproductosmodalview RemoveViewFromParent];
B4IRDebugUtils.currentLine=1572948;
 //BA.debugLineNum = 1572948;BA.debugLine="ListProductosModalView.Initialize(\"ListProduct";
[self->__listproductosmodalview Initialize:self.bi :@"ListProductosModalView" :false];
B4IRDebugUtils.currentLine=1572949;
 //BA.debugLineNum = 1572949;BA.debugLine="PanelProductosModalView.AddView(ListProductosM";
[self->__panelproductosmodalview AddView:(UIView*)((self->__listproductosmodalview).object) :(float) (0) :(float) (0) :[self->__panelproductosmodalview Width] :[self->__panelproductosmodalview Height]];
 };
B4IRDebugUtils.currentLine=1572952;
 //BA.debugLineNum = 1572952;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=1572953;
 //BA.debugLineNum = 1572953;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=1572954;
 //BA.debugLineNum = 1572954;BA.debugLine="Msgbox(\"No se ha encontrado productos con esta";
[self->___c Msgbox:@"No se ha encontrado productos con esta referencia" :@"Información"];
B4IRDebugUtils.currentLine=1572955;
 //BA.debugLineNum = 1572955;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1572958;
 //BA.debugLineNum = 1572958;BA.debugLine="For i=0 To list.Size -1";
{
const int step70 = 1;
const int limit70 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit70 ;_i = _i + step70 ) {
B4IRDebugUtils.currentLine=1572959;
 //BA.debugLineNum = 1572959;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=1572960;
 //BA.debugLineNum = 1572960;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=1572961;
 //BA.debugLineNum = 1572961;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_fo";
if ([_map Get:(NSObject*)(@"f_foto")]!= nil && [[_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=1572962;
 //BA.debugLineNum = 1572962;BA.debugLine="bm = funcion.getImagen(map.Get(\"f_foto\"))";
_bm = [self->__funcion _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=1572964;
 //BA.debugLineNum = 1572964;BA.debugLine="bm.Initialize(File.DirAssets,\"packing.png\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"packing.png"];
 };
B4IRDebugUtils.currentLine=1572967;
 //BA.debugLineNum = 1572967;BA.debugLine="Dim cell As TableCell  = ListProductosModalVie";
_cell = [self->__listproductosmodalview AddTwoLines:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]] :[@[@"Precio: ",[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1572968;
 //BA.debugLineNum = 1572968;BA.debugLine="cell.Bitmap = bm";
[_cell setBitmap:_bm];
B4IRDebugUtils.currentLine=1572969;
 //BA.debugLineNum = 1572969;BA.debugLine="cell.Tag = map";
[_cell setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=1572971;
 //BA.debugLineNum = 1572971;BA.debugLine="cell.ShowSelection = True";
[_cell setShowSelection:true];
 }
};
 break; }
}
;
B4IRDebugUtils.currentLine=1572976;
 //BA.debugLineNum = 1572976;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listproductosmodalview_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"listproductosmodalview_selectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listproductosmodalview_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]);}
B4IRDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub ListProductosModalView_SelectedChanged (Sectio";
B4IRDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If Cell.Tag = Null Then";
if ([_cell Tag]== nil) { 
B4IRDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="If Main.isLoggedIn = False Then";
if (self->__main->__isloggedin /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=2097159;
 //BA.debugLineNum = 2097159;BA.debugLine="loginUser";
[self _loginuser];
B4IRDebugUtils.currentLine=2097160;
 //BA.debugLineNum = 2097160;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2097163;
 //BA.debugLineNum = 2097163;BA.debugLine="salvar_detalle_temporal(Cell.Tag)";
[self _salvar_detalle_temporal:(B4IMap*)([_cell Tag])];
B4IRDebugUtils.currentLine=2097164;
 //BA.debugLineNum = 2097164;BA.debugLine="End Sub";
return @"";
}
- (void)  _loginuser{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"loginuser"])
	 {[B4IDebug delegate:self.bi :@"loginuser" :nil]; return;}
ResumableSub_principal_loginUser* rsub = [[ResumableSub_principal_loginUser alloc] init:self ];
[rsub resume:self.bi :nil];
}
//-2046063889
- (NSString*)  _pageprincipal_appear{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"pageprincipal_appear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pageprincipal_appear" :nil]);}
B4IRDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub PagePrincipal_Appear";
B4IRDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Main.NavControl.ToolBarVisible = True";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:true];
B4IRDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pageprincipal_barbuttonclick:(NSString*) _tag{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"pageprincipal_barbuttonclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pageprincipal_barbuttonclick:" :@[[B4I nilToNSNull:_tag]]]);}
B4IRDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub PagePrincipal_BarButtonClick (Tag As String)";
B4IRDebugUtils.currentLine=1114113;
 //BA.debugLineNum = 1114113;BA.debugLine="Log(\"BarButtonClicked: \" & Tag)";
[self->___c LogImpl:@"41114113" :[@[@"BarButtonClicked: ",_tag] componentsJoinedByString:@""] :0];
B4IRDebugUtils.currentLine=1114115;
 //BA.debugLineNum = 1114115;BA.debugLine="Select Tag";
switch ([self.bi switchObjectToInt:_tag :@[@"info",@"facturacion",@"direcciones",@"logout",@"ordenes"]]) {
case 0: {
B4IRDebugUtils.currentLine=1114118;
 //BA.debugLineNum = 1114118;BA.debugLine="If  mapEmpresaInfo.IsInitialized =False Or mapE";
if ([self->__mapempresainfo IsInitialized]==false || self->__mapempresainfo== nil) { 
B4IRDebugUtils.currentLine=1114119;
 //BA.debugLineNum = 1114119;BA.debugLine="Msgbox(\"Buscando información del negocio...\",\"";
[self->___c Msgbox:@"Buscando información del negocio..." :@"Información"];
B4IRDebugUtils.currentLine=1114120;
 //BA.debugLineNum = 1114120;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1114123;
 //BA.debugLineNum = 1114123;BA.debugLine="If pageInfo.IsInitialized  = False Then";
if ([self->__pageinfo IsInitialized]==false) { 
B4IRDebugUtils.currentLine=1114124;
 //BA.debugLineNum = 1114124;BA.debugLine="pageInfo.Initialize(\"pageInfo\")";
[self->__pageinfo Initialize:self.bi :@"pageInfo"];
B4IRDebugUtils.currentLine=1114125;
 //BA.debugLineNum = 1114125;BA.debugLine="pageInfo.RootPanel.LoadLayout(\"frmInfoEmpresa\"";
[[self->__pageinfo RootPanel] LoadLayout:@"frmInfoEmpresa" :self.bi];
B4IRDebugUtils.currentLine=1114126;
 //BA.debugLineNum = 1114126;BA.debugLine="pageInfo.HideBackButton = True";
[self->__pageinfo setHideBackButton:true];
 };
B4IRDebugUtils.currentLine=1114129;
 //BA.debugLineNum = 1114129;BA.debugLine="Main.NavControl.SetNavigationBarVisibleAnimated";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  SetNavigationBarVisibleAnimated:false];
B4IRDebugUtils.currentLine=1114130;
 //BA.debugLineNum = 1114130;BA.debugLine="Main.NavControl.ToolBarVisible = False";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  setToolBarVisible:false];
B4IRDebugUtils.currentLine=1114131;
 //BA.debugLineNum = 1114131;BA.debugLine="Main.NavControl.ShowPage2(pageInfo,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__pageinfo).object) :true];
B4IRDebugUtils.currentLine=1114134;
 //BA.debugLineNum = 1114134;BA.debugLine="lblInfoEmpresa.Text = mapEmpresaInfo.Get(\"f_nom";
[self->__lblinfoempresa setText:[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_nombre")]]];
B4IRDebugUtils.currentLine=1114135;
 //BA.debugLineNum = 1114135;BA.debugLine="lblInfoNegocio.Text = mapEmpresaInfo.Get(\"f_tip";
[self->__lblinfonegocio setText:[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_tipo_negocio")]]];
B4IRDebugUtils.currentLine=1114136;
 //BA.debugLineNum = 1114136;BA.debugLine="lblPedidoMinimo.Text =  \"RD$ \"&mapEmpresaInfo.G";
[self->__lblpedidominimo setText:[@[@"RD$ ",[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_pedidos_minimos")]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1114137;
 //BA.debugLineNum = 1114137;BA.debugLine="lblTelefono.Text = mapEmpresaInfo.Get(\"f_telefo";
[self->__lbltelefono setText:[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_telefono")]]];
B4IRDebugUtils.currentLine=1114138;
 //BA.debugLineNum = 1114138;BA.debugLine="lblDireccion.Text = mapEmpresaInfo.Get(\"f_direc";
[self->__lbldireccion setText:[self.bi ObjectToString:[self->__mapempresainfo Get:(NSObject*)(@"f_direccion")]]];
 break; }
case 1: {
B4IRDebugUtils.currentLine=1114141;
 //BA.debugLineNum = 1114141;BA.debugLine="Facturacion.Initialize";
[self->__facturacion _initialize /*NSString**/ ];
 break; }
case 2: {
B4IRDebugUtils.currentLine=1114144;
 //BA.debugLineNum = 1114144;BA.debugLine="If Main.isLoggedIn = False Then";
if (self->__main->__isloggedin /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=1114145;
 //BA.debugLineNum = 1114145;BA.debugLine="loginUser";
[self _loginuser];
B4IRDebugUtils.currentLine=1114146;
 //BA.debugLineNum = 1114146;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1114148;
 //BA.debugLineNum = 1114148;BA.debugLine="Direcciones.Initialize";
[self->__direcciones _initialize /*NSString**/ ];
 break; }
case 3: {
B4IRDebugUtils.currentLine=1114151;
 //BA.debugLineNum = 1114151;BA.debugLine="Main.isLoggedIn = False";
self->__main->__isloggedin /*BOOL*/  = false;
B4IRDebugUtils.currentLine=1114152;
 //BA.debugLineNum = 1114152;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
 break; }
case 4: {
B4IRDebugUtils.currentLine=1114155;
 //BA.debugLineNum = 1114155;BA.debugLine="If Main.isLoggedIn = False Then";
if (self->__main->__isloggedin /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=1114156;
 //BA.debugLineNum = 1114156;BA.debugLine="loginUser";
[self _loginuser];
B4IRDebugUtils.currentLine=1114157;
 //BA.debugLineNum = 1114157;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1114159;
 //BA.debugLineNum = 1114159;BA.debugLine="ReporteOrdenes.Initialize";
[self->__reporteordenes _initialize /*NSString**/ ];
 break; }
}
;
B4IRDebugUtils.currentLine=1114163;
 //BA.debugLineNum = 1114163;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pageprincipal_disappear{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"pageprincipal_disappear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pageprincipal_disappear" :nil]);}
B4IRDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub PagePrincipal_Disappear";
B4IRDebugUtils.currentLine=1245187;
 //BA.debugLineNum = 1245187;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pageprincipal_resize:(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"pageprincipal_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pageprincipal_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub PagePrincipal_Resize(Width As Int, Height As I";
B4IRDebugUtils.currentLine=1310722;
 //BA.debugLineNum = 1310722;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"principal";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Private page As Page";
self->__page = [B4IPage new];
B4IRDebugUtils.currentLine=983044;
 //BA.debugLineNum = 983044;BA.debugLine="Private pageInfo As Page";
self->__pageinfo = [B4IPage new];
B4IRDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="Dim idEmpresa As Int = 5";
self->__idempresa = (int) (5);
B4IRDebugUtils.currentLine=983046;
 //BA.debugLineNum = 983046;BA.debugLine="Dim impuestoIncluido As Boolean = True";
self->__impuestoincluido = true;
B4IRDebugUtils.currentLine=983047;
 //BA.debugLineNum = 983047;BA.debugLine="Dim mapEmpresaInfo As Map = Null";
self->__mapempresainfo = (B4IMap*)(nil);
B4IRDebugUtils.currentLine=983048;
 //BA.debugLineNum = 983048;BA.debugLine="Dim cantidadProduto As Int = 0";
self->__cantidadproduto = (int) (0);
B4IRDebugUtils.currentLine=983050;
 //BA.debugLineNum = 983050;BA.debugLine="Private btnAbierto As Button";
self->__btnabierto = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=983051;
 //BA.debugLineNum = 983051;BA.debugLine="Private btnBuscarProducto As Button";
self->__btnbuscarproducto = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=983052;
 //BA.debugLineNum = 983052;BA.debugLine="Private btnMasVendido As Button";
self->__btnmasvendido = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=983053;
 //BA.debugLineNum = 983053;BA.debugLine="Private lblCategoria As Label";
self->__lblcategoria = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983054;
 //BA.debugLineNum = 983054;BA.debugLine="Private lblLema As Label";
self->__lbllema = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983055;
 //BA.debugLineNum = 983055;BA.debugLine="Private ViewCategoria As ScrollView";
self->__viewcategoria = [B4IScrollView new];
B4IRDebugUtils.currentLine=983056;
 //BA.debugLineNum = 983056;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=983057;
 //BA.debugLineNum = 983057;BA.debugLine="Private PanelCategoria As Panel";
self->__panelcategoria = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=983061;
 //BA.debugLineNum = 983061;BA.debugLine="Private btnInfoCerrar As Button";
self->__btninfocerrar = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=983062;
 //BA.debugLineNum = 983062;BA.debugLine="Private lblDireccion As TextView";
self->__lbldireccion = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=983063;
 //BA.debugLineNum = 983063;BA.debugLine="Private lblInfoEmpresa As Label";
self->__lblinfoempresa = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983064;
 //BA.debugLineNum = 983064;BA.debugLine="Private lblInfoNegocio As Label";
self->__lblinfonegocio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983065;
 //BA.debugLineNum = 983065;BA.debugLine="Private lblPedidoMinimo As Label";
self->__lblpedidominimo = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983066;
 //BA.debugLineNum = 983066;BA.debugLine="Private lblTelefono As Label";
self->__lbltelefono = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=983067;
 //BA.debugLineNum = 983067;BA.debugLine="Private PanelInfoBack As Panel";
self->__panelinfoback = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=983070;
 //BA.debugLineNum = 983070;BA.debugLine="Private ListProductosModalView As TableView";
self->__listproductosmodalview = [B4ITableView new];
B4IRDebugUtils.currentLine=983071;
 //BA.debugLineNum = 983071;BA.debugLine="Private btnProductoBuscarModal As Button";
self->__btnproductobuscarmodal = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=983072;
 //BA.debugLineNum = 983072;BA.debugLine="Private btnProductoVolver As Button";
self->__btnproductovolver = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=983073;
 //BA.debugLineNum = 983073;BA.debugLine="Private PanelProductosModalView As Panel";
self->__panelproductosmodalview = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=983074;
 //BA.debugLineNum = 983074;BA.debugLine="Private txtBuscarProducto As TextField";
self->__txtbuscarproducto = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=983075;
 //BA.debugLineNum = 983075;BA.debugLine="Private PanelModalProducto As Panel";
self->__panelmodalproducto = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=983078;
 //BA.debugLineNum = 983078;BA.debugLine="End Sub";
return @"";
}
@end