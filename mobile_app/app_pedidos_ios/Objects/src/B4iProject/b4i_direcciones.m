
#import "b4i_direcciones.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_customlistview.h"
#import "b4i_perfil.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"

@interface ResumableSub_direcciones_btnBackRd_Click :B4IResumableSub 
- (instancetype) init: (b4i_direcciones*) parent1;
@end
@implementation ResumableSub_direcciones_btnBackRd_Click {
b4i_direcciones* parent;
}
- (instancetype) init: (b4i_direcciones*) parent1 {
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"direcciones";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=13107202;
 //BA.debugLineNum = 13107202;BA.debugLine="If reload Then";
if (true) break;

case 1:
//if
self->_state = 4;
if (parent->__reload) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=13107203;
 //BA.debugLineNum = 13107203;BA.debugLine="actualizarDirecciones";
[parent _actualizardirecciones];
B4IRDebugUtils.currentLine=13107204;
 //BA.debugLineNum = 13107204;BA.debugLine="reload = False";
parent->__reload = false;
 if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=13107207;
 //BA.debugLineNum = 13107207;BA.debugLine="PanelFondoDireccionesRD.SetAlphaAnimated(500,0)";
[parent->__panelfondodireccionesrd SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=13107209;
 //BA.debugLineNum = 13107209;BA.debugLine="Sleep(200)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"direcciones" :@"btnbackrd_click"] :(int) (200)];
self->_state = 5;
return;
case 5:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=13107211;
 //BA.debugLineNum = 13107211;BA.debugLine="txtDireRD.Text = \"\"";
[parent->__txtdirerd setText:@""];
B4IRDebugUtils.currentLine=13107212;
 //BA.debugLineNum = 13107212;BA.debugLine="txtSector.Text = \"\"";
[parent->__txtsector setText:@""];
B4IRDebugUtils.currentLine=13107213;
 //BA.debugLineNum = 13107213;BA.debugLine="btnProvinciaCombo.SelectedIndex = -1";
[parent->__btnprovinciacombo _setselectedindex: /*int*/ nil :(int) (-1)];
B4IRDebugUtils.currentLine=13107214;
 //BA.debugLineNum = 13107214;BA.debugLine="txtZipCodeRD.Text = \"\"";
[parent->__txtzipcoderd setText:@""];
B4IRDebugUtils.currentLine=13107215;
 //BA.debugLineNum = 13107215;BA.debugLine="chPrincipalRD.Value = False";
[parent->__chprincipalrd setValue:false];
B4IRDebugUtils.currentLine=13107217;
 //BA.debugLineNum = 13107217;BA.debugLine="edition = False";
parent->__edition = false;
B4IRDebugUtils.currentLine=13107218;
 //BA.debugLineNum = 13107218;BA.debugLine="actu = False";
parent->__actu = false;
B4IRDebugUtils.currentLine=13107220;
 //BA.debugLineNum = 13107220;BA.debugLine="pageDirecciones.ResignFocus";
[parent->__pagedirecciones ResignFocus];
B4IRDebugUtils.currentLine=13107222;
 //BA.debugLineNum = 13107222;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_direcciones_btnBackUsa_Click :B4IResumableSub 
- (instancetype) init: (b4i_direcciones*) parent1;
@end
@implementation ResumableSub_direcciones_btnBackUsa_Click {
b4i_direcciones* parent;
}
- (instancetype) init: (b4i_direcciones*) parent1 {
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;
B4IRDebugUtils.currentModule=@"direcciones";

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
B4IRDebugUtils.currentLine=12517378;
 //BA.debugLineNum = 12517378;BA.debugLine="If reload Then";
if (true) break;

case 1:
//if
self->_state = 4;
if (parent->__reload) { 
self->_state = 3;
}if (true) break;

case 3:
//C
self->_state = 4;
B4IRDebugUtils.currentLine=12517379;
 //BA.debugLineNum = 12517379;BA.debugLine="actualizarDirecciones";
[parent _actualizardirecciones];
B4IRDebugUtils.currentLine=12517380;
 //BA.debugLineNum = 12517380;BA.debugLine="reload = False";
parent->__reload = false;
 if (true) break;

case 4:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=12517383;
 //BA.debugLineNum = 12517383;BA.debugLine="PanelFondoDireccionesUSA.SetAlphaAnimated(500,0)";
[parent->__panelfondodireccionesusa SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=12517385;
 //BA.debugLineNum = 12517385;BA.debugLine="Sleep(200)";
[parent->___c Sleep:self.bi :[[B4IDelegatableResumableSub alloc]init:self :@"direcciones" :@"btnbackusa_click"] :(int) (200)];
self->_state = 5;
return;
case 5:
//C
self->_state = -1;
;
B4IRDebugUtils.currentLine=12517387;
 //BA.debugLineNum = 12517387;BA.debugLine="txtAddress1.Text = \"\"";
[parent->__txtaddress1 setText:@""];
B4IRDebugUtils.currentLine=12517388;
 //BA.debugLineNum = 12517388;BA.debugLine="txtAddress2.Text = \"\"";
[parent->__txtaddress2 setText:@""];
B4IRDebugUtils.currentLine=12517389;
 //BA.debugLineNum = 12517389;BA.debugLine="txtCity.Text = \"\"";
[parent->__txtcity setText:@""];
B4IRDebugUtils.currentLine=12517390;
 //BA.debugLineNum = 12517390;BA.debugLine="btnState.SelectedIndex = -1";
[parent->__btnstate _setselectedindex: /*int*/ nil :(int) (-1)];
B4IRDebugUtils.currentLine=12517391;
 //BA.debugLineNum = 12517391;BA.debugLine="txtZipCode.Text = \"\"";
[parent->__txtzipcode setText:@""];
B4IRDebugUtils.currentLine=12517392;
 //BA.debugLineNum = 12517392;BA.debugLine="chPrincipal.Value = False";
[parent->__chprincipal setValue:false];
B4IRDebugUtils.currentLine=12517394;
 //BA.debugLineNum = 12517394;BA.debugLine="edition = False";
parent->__edition = false;
B4IRDebugUtils.currentLine=12517395;
 //BA.debugLineNum = 12517395;BA.debugLine="actu = False";
parent->__actu = false;
B4IRDebugUtils.currentLine=12517397;
 //BA.debugLineNum = 12517397;BA.debugLine="pageDirecciones.ResignFocus";
[parent->__pagedirecciones ResignFocus];
B4IRDebugUtils.currentLine=12517398;
 //BA.debugLineNum = 12517398;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

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
    return 5;
}


- (NSString*)  _initialize{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=11337728;
 //BA.debugLineNum = 11337728;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=11337729;
 //BA.debugLineNum = 11337729;BA.debugLine="pageDirecciones.Initialize(\"PageDirecciones\")";
[self->__pagedirecciones Initialize:self.bi :@"PageDirecciones"];
B4IRDebugUtils.currentLine=11337730;
 //BA.debugLineNum = 11337730;BA.debugLine="pageDirecciones.RootPanel.LoadLayout(\"frmDirecion";
[[self->__pagedirecciones RootPanel] LoadLayout:@"frmDirecionUSA" :self.bi];
B4IRDebugUtils.currentLine=11337732;
 //BA.debugLineNum = 11337732;BA.debugLine="Main.NavControl.ShowPage(pageDirecciones)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pagedirecciones).object)];
B4IRDebugUtils.currentLine=11337735;
 //BA.debugLineNum = 11337735;BA.debugLine="crear";
[self _crear];
B4IRDebugUtils.currentLine=11337736;
 //BA.debugLineNum = 11337736;BA.debugLine="cargarDirecciones";
[self _cargardirecciones];
B4IRDebugUtils.currentLine=11337738;
 //BA.debugLineNum = 11337738;BA.debugLine="Main.smc.Tag = \"direcciones\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"direcciones")];
B4IRDebugUtils.currentLine=11337739;
 //BA.debugLineNum = 11337739;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _actualizardirecciones{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"actualizardirecciones"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"actualizardirecciones" :nil]);}
b4i_httpjob* _jobdirecciones = nil;
B4IRDebugUtils.currentLine=11534336;
 //BA.debugLineNum = 11534336;BA.debugLine="Sub actualizarDirecciones";
B4IRDebugUtils.currentLine=11534338;
 //BA.debugLineNum = 11534338;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11534339;
 //BA.debugLineNum = 11534339;BA.debugLine="hud.ProgressDialogShow(\"We're reloading your add";
[self->__hud ProgressDialogShow:@"We're reloading your addresses"];
 }else {
B4IRDebugUtils.currentLine=11534341;
 //BA.debugLineNum = 11534341;BA.debugLine="hud.ProgressDialogShow(\"Actualizando sus direcci";
[self->__hud ProgressDialogShow:@"Actualizando sus direcciónes"];
 };
B4IRDebugUtils.currentLine=11534344;
 //BA.debugLineNum = 11534344;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11534345;
 //BA.debugLineNum = 11534345;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
[_jobdirecciones _initialize /*NSString**/ :nil :self.bi :@"JobDirecciones" :self];
B4IRDebugUtils.currentLine=11534346;
 //BA.debugLineNum = 11534346;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
[_jobdirecciones _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=11534347;
 //BA.debugLineNum = 11534347;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _adddireccion_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"adddireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"adddireccion_click" :nil]);}
B4IRDebugUtils.currentLine=12320768;
 //BA.debugLineNum = 12320768;BA.debugLine="Sub AddDireccion_Click";
B4IRDebugUtils.currentLine=12320770;
 //BA.debugLineNum = 12320770;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=12320772;
 //BA.debugLineNum = 12320772;BA.debugLine="txtAddress1.SetShadow(Colors.Gray, 2dip,2dip,0.5";
[self->__txtaddress1 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320773;
 //BA.debugLineNum = 12320773;BA.debugLine="txtAddress2.SetShadow(Colors.Gray, 2dip,2dip,0.5";
[self->__txtaddress2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320774;
 //BA.debugLineNum = 12320774;BA.debugLine="txtCity.SetShadow(Colors.Gray, 2dip,2dip,0.5,Fal";
[self->__txtcity SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320775;
 //BA.debugLineNum = 12320775;BA.debugLine="txtZipCode.SetShadow(Colors.Gray, 2dip,2dip,0.5,";
[self->__txtzipcode SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320776;
 //BA.debugLineNum = 12320776;BA.debugLine="BtnAgregarDireccionFinal.SetShadow(Colors.Gray,";
[self->__btnagregardireccionfinal SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320777;
 //BA.debugLineNum = 12320777;BA.debugLine="btnDeleteUsa.SetShadow(Colors.Gray, 2dip,2dip,0.";
[self->__btndeleteusa SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320778;
 //BA.debugLineNum = 12320778;BA.debugLine="PanelEncabezadoUsa.SetShadow(Colors.Gray,0dip,3d";
[self->__panelencabezadousa SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320780;
 //BA.debugLineNum = 12320780;BA.debugLine="btnState.SetItems(estados)";
[self->__btnstate _setitems /*NSString**/ :nil :self->__estados];
B4IRDebugUtils.currentLine=12320781;
 //BA.debugLineNum = 12320781;BA.debugLine="PanelFondoDireccionesUSA.SetAlphaAnimated(0,0)";
[self->__panelfondodireccionesusa SetAlphaAnimated:(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=12320782;
 //BA.debugLineNum = 12320782;BA.debugLine="PanelFondoDireccionesUSA.Left = 0%x";
[self->__panelfondodireccionesusa setLeft:[self->___c PerXToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=12320783;
 //BA.debugLineNum = 12320783;BA.debugLine="PanelFondoDireccionesUSA.SetAlphaAnimated(500,1)";
[self->__panelfondodireccionesusa SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=12320785;
 //BA.debugLineNum = 12320785;BA.debugLine="If edition Then";
if (self->__edition) { 
B4IRDebugUtils.currentLine=12320786;
 //BA.debugLineNum = 12320786;BA.debugLine="btnDeleteUsa.Visible = True";
[self->__btndeleteusa setVisible:true];
 }else {
B4IRDebugUtils.currentLine=12320788;
 //BA.debugLineNum = 12320788;BA.debugLine="btnDeleteUsa.Visible = False";
[self->__btndeleteusa setVisible:false];
 };
B4IRDebugUtils.currentLine=12320790;
 //BA.debugLineNum = 12320790;BA.debugLine="actu = False";
self->__actu = false;
 }else {
B4IRDebugUtils.currentLine=12320794;
 //BA.debugLineNum = 12320794;BA.debugLine="btnProvinciaCombo.SetItems(estados)";
[self->__btnprovinciacombo _setitems /*NSString**/ :nil :self->__estados];
B4IRDebugUtils.currentLine=12320796;
 //BA.debugLineNum = 12320796;BA.debugLine="PanelFondoDireccionesRD.SetAlphaAnimated(0,0)";
[self->__panelfondodireccionesrd SetAlphaAnimated:(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=12320797;
 //BA.debugLineNum = 12320797;BA.debugLine="PanelFondoDireccionesRD.Top = 0%y";
[self->__panelfondodireccionesrd setTop:[self->___c PerYToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=12320798;
 //BA.debugLineNum = 12320798;BA.debugLine="PanelFondoDireccionesRD.SetAlphaAnimated(500,1)";
[self->__panelfondodireccionesrd SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=12320800;
 //BA.debugLineNum = 12320800;BA.debugLine="PanelEncabezadoRD.SetShadow(Colors.Gray,0dip,3di";
[self->__panelencabezadord SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320801;
 //BA.debugLineNum = 12320801;BA.debugLine="txtDireRD.SetShadow(Colors.Gray, 2dip,2dip,0.5,F";
[self->__txtdirerd SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320802;
 //BA.debugLineNum = 12320802;BA.debugLine="txtSector.SetShadow(Colors.Gray, 2dip,2dip,0.5,F";
[self->__txtsector SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320803;
 //BA.debugLineNum = 12320803;BA.debugLine="txtZipCodeRD.SetShadow(Colors.Gray, 2dip,2dip,0.";
[self->__txtzipcoderd SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=12320805;
 //BA.debugLineNum = 12320805;BA.debugLine="If edition Then";
if (self->__edition) { 
B4IRDebugUtils.currentLine=12320806;
 //BA.debugLineNum = 12320806;BA.debugLine="btnDeleteRD.Visible = True";
[self->__btndeleterd setVisible:true];
 }else {
B4IRDebugUtils.currentLine=12320808;
 //BA.debugLineNum = 12320808;BA.debugLine="btnDeleteRD.Visible = False";
[self->__btndeleterd setVisible:false];
 };
B4IRDebugUtils.currentLine=12320810;
 //BA.debugLineNum = 12320810;BA.debugLine="actu = False";
self->__actu = false;
 };
B4IRDebugUtils.currentLine=12320814;
 //BA.debugLineNum = 12320814;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _borrardireccion_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"borrardireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"borrardireccion_click" :nil]);}
B4IRDebugUtils.currentLine=12386304;
 //BA.debugLineNum = 12386304;BA.debugLine="Sub BorrarDireccion_Click";
B4IRDebugUtils.currentLine=12386306;
 //BA.debugLineNum = 12386306;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnaceptarnombredir_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnaceptarnombredir_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnaceptarnombredir_click" :nil]);}
B4IRDebugUtils.currentLine=13565952;
 //BA.debugLineNum = 13565952;BA.debugLine="Sub btnAceptarNombreDir_Click";
B4IRDebugUtils.currentLine=13565955;
 //BA.debugLineNum = 13565955;BA.debugLine="PanelFondoNombreDir.SetAlphaAnimated(0,0)";
[self->__panelfondonombredir SetAlphaAnimated:(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=13565956;
 //BA.debugLineNum = 13565956;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=13565957;
 //BA.debugLineNum = 13565957;BA.debugLine="ingresarDirUSA";
[self _ingresardirusa];
 }else {
B4IRDebugUtils.currentLine=13565959;
 //BA.debugLineNum = 13565959;BA.debugLine="ingresarDirRD";
[self _ingresardirrd];
 };
B4IRDebugUtils.currentLine=13565962;
 //BA.debugLineNum = 13565962;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _ingresardirusa{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"ingresardirusa"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"ingresardirusa" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobsalvar = nil;
B4IRDebugUtils.currentLine=12582912;
 //BA.debugLineNum = 12582912;BA.debugLine="Sub ingresarDirUSA";
B4IRDebugUtils.currentLine=12582914;
 //BA.debugLineNum = 12582914;BA.debugLine="If txtAddress1.Text == \"\" Then";
if ([[self->__txtaddress1 Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=12582915;
 //BA.debugLineNum = 12582915;BA.debugLine="Msgbox(\"The Addres 1 can't be empty!!\",\"Error\")";
[self->___c Msgbox:@"The Addres 1 can't be empty!!" :@"Error"];
B4IRDebugUtils.currentLine=12582916;
 //BA.debugLineNum = 12582916;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=12582919;
 //BA.debugLineNum = 12582919;BA.debugLine="If txtCity.Text == \"\" Then";
if ([[self->__txtcity Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=12582920;
 //BA.debugLineNum = 12582920;BA.debugLine="Msgbox(\"The City can't be empty!!\",\"Error\")";
[self->___c Msgbox:@"The City can't be empty!!" :@"Error"];
B4IRDebugUtils.currentLine=12582921;
 //BA.debugLineNum = 12582921;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=12582924;
 //BA.debugLineNum = 12582924;BA.debugLine="If txtZipCode.Text == \"\" Then";
if ([[self->__txtzipcode Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=12582925;
 //BA.debugLineNum = 12582925;BA.debugLine="Msgbox(\"The Zip Code can't be empty!!\",\"Error\")";
[self->___c Msgbox:@"The Zip Code can't be empty!!" :@"Error"];
B4IRDebugUtils.currentLine=12582926;
 //BA.debugLineNum = 12582926;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=12582929;
 //BA.debugLineNum = 12582929;BA.debugLine="If actu Then";
if (self->__actu) { 
B4IRDebugUtils.currentLine=12582931;
 //BA.debugLineNum = 12582931;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=12582932;
 //BA.debugLineNum = 12582932;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipal Value]],@",'f_direccion1':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtaddress1 Text] Trim]],@"','f_direccion2':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtaddress2 Text] Trim]],@"','f_idrecord':",[self.bi NumberToString:@(self->__update)],@",'f_iddireccion':",[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_idrecord")]],@",'f_usa':",[self.bi BooleanToString:self->__main->__isusa /*BOOL*/ ],@",'f_sector_city':'",[self->__txtcity Text],@"','f_zipcode':",[self->__txtzipcode Text],@",'f_state_prov':",[self.bi NumberToString:@((self->__indexcombo+1))],@",'f_nombre_direccion':'",[self->__txtnombredireccion Text],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=12582935;
 //BA.debugLineNum = 12582935;BA.debugLine="actu = False";
self->__actu = false;
 }else {
B4IRDebugUtils.currentLine=12582939;
 //BA.debugLineNum = 12582939;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=12582940;
 //BA.debugLineNum = 12582940;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipal Value]],@",'f_direccion1':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtaddress1 Text] Trim]],@"','f_direccion2':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtaddress2 Text] Trim]],@"','f_idrecord':",[self.bi NumberToString:@(self->__update)],@",'f_usa':",[self.bi BooleanToString:self->__main->__isusa /*BOOL*/ ],@",'f_sector_city':'",[self->__txtcity Text],@"','f_zipcode':",[self->__txtzipcode Text],@",'f_state_prov':",[self.bi NumberToString:@((self->__indexcombo+1))],@",'f_nombre_direccion':'",[self->__txtnombredireccion Text],@"'"] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=12582945;
 //BA.debugLineNum = 12582945;BA.debugLine="reload = True";
self->__reload = true;
B4IRDebugUtils.currentLine=12582946;
 //BA.debugLineNum = 12582946;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=12582947;
 //BA.debugLineNum = 12582947;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
[_jobsalvar _initialize /*NSString**/ :nil :self.bi :@"JobSalvar" :self];
B4IRDebugUtils.currentLine=12582948;
 //BA.debugLineNum = 12582948;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
[_jobsalvar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/set_salvar_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=12582950;
 //BA.debugLineNum = 12582950;BA.debugLine="update = 0";
self->__update = (int) (0);
B4IRDebugUtils.currentLine=12582951;
 //BA.debugLineNum = 12582951;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _ingresardirrd{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"ingresardirrd"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"ingresardirrd" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobsalvar = nil;
B4IRDebugUtils.currentLine=13303808;
 //BA.debugLineNum = 13303808;BA.debugLine="Sub ingresarDirRD";
B4IRDebugUtils.currentLine=13303810;
 //BA.debugLineNum = 13303810;BA.debugLine="If txtDireRD.Text == \"\" Then";
if ([[self->__txtdirerd Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=13303811;
 //BA.debugLineNum = 13303811;BA.debugLine="Msgbox(\"La dirección no puede estar vacia!!\",\"Er";
[self->___c Msgbox:@"La dirección no puede estar vacia!!" :@"Error"];
B4IRDebugUtils.currentLine=13303812;
 //BA.debugLineNum = 13303812;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=13303815;
 //BA.debugLineNum = 13303815;BA.debugLine="If txtSector.Text == \"\" Then";
if ([[self->__txtsector Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=13303816;
 //BA.debugLineNum = 13303816;BA.debugLine="Msgbox(\"El sector no puede estar vacio!!\",\"Error";
[self->___c Msgbox:@"El sector no puede estar vacio!!" :@"Error"];
B4IRDebugUtils.currentLine=13303817;
 //BA.debugLineNum = 13303817;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=13303820;
 //BA.debugLineNum = 13303820;BA.debugLine="If txtZipCodeRD.Text == \"\" Then";
if ([[self->__txtzipcoderd Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=13303821;
 //BA.debugLineNum = 13303821;BA.debugLine="Msgbox(\"El Zip Code no puede estar vacio!!\",\"Err";
[self->___c Msgbox:@"El Zip Code no puede estar vacio!!" :@"Error"];
B4IRDebugUtils.currentLine=13303822;
 //BA.debugLineNum = 13303822;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=13303825;
 //BA.debugLineNum = 13303825;BA.debugLine="If actu Then";
if (self->__actu) { 
B4IRDebugUtils.currentLine=13303827;
 //BA.debugLineNum = 13303827;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=13303828;
 //BA.debugLineNum = 13303828;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Value&\",'f";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipalrd Value]],@",'f_direccion1':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtdirerd Text] Trim]],@"','f_direccion2':''",@",'f_idrecord':",[self.bi NumberToString:@(self->__update)],@",'f_iddireccion':",[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_idrecord")]],@",'f_usa':",[self.bi BooleanToString:self->__main->__isusa /*BOOL*/ ],@",'f_sector_city':'",[self->__txtsector Text],@"','f_zipcode':",[self->__txtzipcoderd Text],@",'f_state_prov':",[self.bi NumberToString:@((self->__indexcombo+1))]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=13303831;
 //BA.debugLineNum = 13303831;BA.debugLine="actu = False";
self->__actu = false;
 }else {
B4IRDebugUtils.currentLine=13303835;
 //BA.debugLineNum = 13303835;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=13303836;
 //BA.debugLineNum = 13303836;BA.debugLine="json = \"'f_principal':\"&chPrincipalRD.Value&\",'f";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipalrd Value]],@",'f_direccion1':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtdirerd Text] Trim]],@"','f_direccion2':'','f_idrecord':",[self.bi NumberToString:@(self->__update)],@",'f_usa':",[self.bi BooleanToString:self->__main->__isusa /*BOOL*/ ],@",'f_sector_city':'",[self->__txtsector Text],@"','f_zipcode':",[self->__txtzipcoderd Text],@",'f_state_prov':",[self.bi NumberToString:@((self->__indexcombo+1))]] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=13303841;
 //BA.debugLineNum = 13303841;BA.debugLine="reload = True";
self->__reload = true;
B4IRDebugUtils.currentLine=13303842;
 //BA.debugLineNum = 13303842;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=13303843;
 //BA.debugLineNum = 13303843;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
[_jobsalvar _initialize /*NSString**/ :nil :self.bi :@"JobSalvar" :self];
B4IRDebugUtils.currentLine=13303844;
 //BA.debugLineNum = 13303844;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
[_jobsalvar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/set_salvar_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=13303846;
 //BA.debugLineNum = 13303846;BA.debugLine="update = 0";
self->__update = (int) (0);
B4IRDebugUtils.currentLine=13303848;
 //BA.debugLineNum = 13303848;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnagregardireccionfinal_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnagregardireccionfinal_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnagregardireccionfinal_click" :nil]);}
B4IRDebugUtils.currentLine=12648448;
 //BA.debugLineNum = 12648448;BA.debugLine="Sub BtnAgregarDireccionFinal_Click";
B4IRDebugUtils.currentLine=12648450;
 //BA.debugLineNum = 12648450;BA.debugLine="NombreDireccion";
[self _nombredireccion];
B4IRDebugUtils.currentLine=12648452;
 //BA.debugLineNum = 12648452;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _nombredireccion{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"nombredireccion"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"nombredireccion" :nil]);}
B4IRDebugUtils.currentLine=13631488;
 //BA.debugLineNum = 13631488;BA.debugLine="Sub NombreDireccion";
B4IRDebugUtils.currentLine=13631490;
 //BA.debugLineNum = 13631490;BA.debugLine="PanelFondoNombreDir.SetAlphaAnimated(0,0)";
[self->__panelfondonombredir SetAlphaAnimated:(int) (0) :(float) (0)];
B4IRDebugUtils.currentLine=13631491;
 //BA.debugLineNum = 13631491;BA.debugLine="PanelFondoNombreDir.Top = 0%y";
[self->__panelfondonombredir setTop:[self->___c PerYToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=13631492;
 //BA.debugLineNum = 13631492;BA.debugLine="PanelFondoNombreDir.Left = 0%x";
[self->__panelfondonombredir setLeft:[self->___c PerXToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=13631494;
 //BA.debugLineNum = 13631494;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=13631495;
 //BA.debugLineNum = 13631495;BA.debugLine="Label16.Text = \"Name of the address\"";
[self->__label16 setText:@"Name of the address"];
B4IRDebugUtils.currentLine=13631496;
 //BA.debugLineNum = 13631496;BA.debugLine="txtNombreDireccion.Text = \"\"";
[self->__txtnombredireccion setText:@""];
B4IRDebugUtils.currentLine=13631497;
 //BA.debugLineNum = 13631497;BA.debugLine="txtNombreDireccion.HintText = \"Name of the addre";
[self->__txtnombredireccion setHintText:@"Name of the address"];
 }else {
B4IRDebugUtils.currentLine=13631499;
 //BA.debugLineNum = 13631499;BA.debugLine="Label16.Text = \"Nombre de la dirección\"";
[self->__label16 setText:@"Nombre de la dirección"];
B4IRDebugUtils.currentLine=13631500;
 //BA.debugLineNum = 13631500;BA.debugLine="txtNombreDireccion.Text = \"\"";
[self->__txtnombredireccion setText:@""];
B4IRDebugUtils.currentLine=13631501;
 //BA.debugLineNum = 13631501;BA.debugLine="txtNombreDireccion.HintText = \"Nombre de la dire";
[self->__txtnombredireccion setHintText:@"Nombre de la dirección"];
 };
B4IRDebugUtils.currentLine=13631504;
 //BA.debugLineNum = 13631504;BA.debugLine="PanelFondoNombreDir.SetAlphaAnimated(500,1)";
[self->__panelfondonombredir SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=13631508;
 //BA.debugLineNum = 13631508;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnagregardirrd_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnagregardirrd_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnagregardirrd_click" :nil]);}
B4IRDebugUtils.currentLine=13238272;
 //BA.debugLineNum = 13238272;BA.debugLine="Sub btnAgregarDirRD_Click";
B4IRDebugUtils.currentLine=13238274;
 //BA.debugLineNum = 13238274;BA.debugLine="NombreDireccion";
[self _nombredireccion];
B4IRDebugUtils.currentLine=13238276;
 //BA.debugLineNum = 13238276;BA.debugLine="End Sub";
return @"";
}
- (void)  _btnbackrd_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnbackrd_click"])
	 {[B4IDebug delegate:self.bi :@"btnbackrd_click" :nil]; return;}
ResumableSub_direcciones_btnBackRd_Click* rsub = [[ResumableSub_direcciones_btnBackRd_Click alloc] init:self ];
[rsub resume:self.bi :nil];
}
//1574250667
- (void)  _btnbackusa_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnbackusa_click"])
	 {[B4IDebug delegate:self.bi :@"btnbackusa_click" :nil]; return;}
ResumableSub_direcciones_btnBackUsa_Click* rsub = [[ResumableSub_direcciones_btnBackUsa_Click alloc] init:self ];
[rsub resume:self.bi :nil];
}
//-711293084
- (NSString*)  _btndeleterd_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btndeleterd_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btndeleterd_click" :nil]);}
B4IRDebugUtils.currentLine=13369344;
 //BA.debugLineNum = 13369344;BA.debugLine="Sub btnDeleteRD_Click";
B4IRDebugUtils.currentLine=13369346;
 //BA.debugLineNum = 13369346;BA.debugLine="Msgbox2(\"MsgDelete\",\"Desea borrar esta dirección\"";
[self->___c Msgbox2:self.bi :@"MsgDelete" :@"Desea borrar esta dirección" :@"Aviso!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=13369348;
 //BA.debugLineNum = 13369348;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btndeleteusa_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btndeleteusa_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btndeleteusa_click" :nil]);}
B4IRDebugUtils.currentLine=12713984;
 //BA.debugLineNum = 12713984;BA.debugLine="Sub btnDeleteUsa_Click";
B4IRDebugUtils.currentLine=12713986;
 //BA.debugLineNum = 12713986;BA.debugLine="Msgbox2(\"MsgDelete\",\"Do you want to delete this";
[self->___c Msgbox2:self.bi :@"MsgDelete" :@"Do you want to delete this address?" :@"Warning!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Yes")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
B4IRDebugUtils.currentLine=12713988;
 //BA.debugLineNum = 12713988;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btndireccionback2_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btndireccionback2_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btndireccionback2_click" :nil]);}
B4IRDebugUtils.currentLine=11862016;
 //BA.debugLineNum = 11862016;BA.debugLine="Sub btnDireccionBack2_Click";
B4IRDebugUtils.currentLine=11862018;
 //BA.debugLineNum = 11862018;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=11862019;
 //BA.debugLineNum = 11862019;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=11862021;
 //BA.debugLineNum = 11862021;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnnuevadireccion_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnnuevadireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnnuevadireccion_click" :nil]);}
B4IRDebugUtils.currentLine=12058624;
 //BA.debugLineNum = 12058624;BA.debugLine="Sub btnNuevaDireccion_Click";
B4IRDebugUtils.currentLine=12058625;
 //BA.debugLineNum = 12058625;BA.debugLine="txtDireccion.Text =\"\"";
[self->__txtdireccion setText:@""];
B4IRDebugUtils.currentLine=12058626;
 //BA.debugLineNum = 12058626;BA.debugLine="txtDireccion.Tag = 0";
[self->__txtdireccion setTag:(NSObject*)(@(0))];
B4IRDebugUtils.currentLine=12058627;
 //BA.debugLineNum = 12058627;BA.debugLine="chPrincipal.Value = False";
[self->__chprincipal setValue:false];
B4IRDebugUtils.currentLine=12058628;
 //BA.debugLineNum = 12058628;BA.debugLine="cargarDirecciones";
[self _cargardirecciones];
B4IRDebugUtils.currentLine=12058629;
 //BA.debugLineNum = 12058629;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cargardirecciones{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"cargardirecciones"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"cargardirecciones" :nil]);}
b4i_httpjob* _jobdirecciones = nil;
B4IRDebugUtils.currentLine=11468800;
 //BA.debugLineNum = 11468800;BA.debugLine="Sub cargarDirecciones";
B4IRDebugUtils.currentLine=11468802;
 //BA.debugLineNum = 11468802;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11468803;
 //BA.debugLineNum = 11468803;BA.debugLine="hud.ProgressDialogShow(\"We're searching your add";
[self->__hud ProgressDialogShow:@"We're searching your addresses"];
 }else {
B4IRDebugUtils.currentLine=11468805;
 //BA.debugLineNum = 11468805;BA.debugLine="hud.ProgressDialogShow(\"Buscando sus direcciones";
[self->__hud ProgressDialogShow:@"Buscando sus direcciones"];
 };
B4IRDebugUtils.currentLine=11468808;
 //BA.debugLineNum = 11468808;BA.debugLine="Dim JobDirecciones As HttpJob";
_jobdirecciones = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11468809;
 //BA.debugLineNum = 11468809;BA.debugLine="JobDirecciones.Initialize(\"JobDirecciones\",Me)";
[_jobdirecciones _initialize /*NSString**/ :nil :self.bi :@"JobDirecciones" :self];
B4IRDebugUtils.currentLine=11468810;
 //BA.debugLineNum = 11468810;BA.debugLine="JobDirecciones.PostString(Main.url&\"ws/get_direcc";
[_jobdirecciones _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/get_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=11468811;
 //BA.debugLineNum = 11468811;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnprovinciacombo_selectedindexchanged:(int) _index{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnprovinciacombo_selectedindexchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnprovinciacombo_selectedindexchanged:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=13172736;
 //BA.debugLineNum = 13172736;BA.debugLine="Sub btnProvinciaCombo_SelectedIndexChanged (Index";
B4IRDebugUtils.currentLine=13172737;
 //BA.debugLineNum = 13172737;BA.debugLine="indexCombo = Index";
self->__indexcombo = _index;
B4IRDebugUtils.currentLine=13172738;
 //BA.debugLineNum = 13172738;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnsalvardireccion_click{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnsalvardireccion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnsalvardireccion_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobsalvar = nil;
B4IRDebugUtils.currentLine=11993088;
 //BA.debugLineNum = 11993088;BA.debugLine="Sub btnSalvarDireccion_Click";
B4IRDebugUtils.currentLine=11993090;
 //BA.debugLineNum = 11993090;BA.debugLine="If txtDireccion.Text.Trim.Length = 0 Then";
if ([[[self->__txtdireccion Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=11993091;
 //BA.debugLineNum = 11993091;BA.debugLine="Msgbox(\"Introduzca la dirección\",\"Información\")";
[self->___c Msgbox:@"Introduzca la dirección" :@"Información"];
B4IRDebugUtils.currentLine=11993092;
 //BA.debugLineNum = 11993092;BA.debugLine="txtDireccion.RequestFocus";
[self->__txtdireccion RequestFocus];
B4IRDebugUtils.currentLine=11993093;
 //BA.debugLineNum = 11993093;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11993098;
 //BA.debugLineNum = 11993098;BA.debugLine="If actualizar Then";
if (self->__actualizar) { 
B4IRDebugUtils.currentLine=11993100;
 //BA.debugLineNum = 11993100;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=11993101;
 //BA.debugLineNum = 11993101;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipal Value]],@",'f_direccion':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtdireccion Text] Trim]],@"','f_idrecord':",[self.bi ObjectToString:[self->__txtdireccion Tag]],@",'f_credito_fiscal':false,'f_iddireccion':",[self.bi ObjectToString:[self->__mapadir Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=11993102;
 //BA.debugLineNum = 11993102;BA.debugLine="actualizar = False";
self->__actualizar = false;
 }else {
B4IRDebugUtils.currentLine=11993106;
 //BA.debugLineNum = 11993106;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=11993107;
 //BA.debugLineNum = 11993107;BA.debugLine="json = \"'f_principal':\"&chPrincipal.Value&\",'f_d";
_json = [@[@"'f_principal':",[self.bi BooleanToString:[self->__chprincipal Value]],@",'f_direccion':'",[self->__funciones _base64_encode /*NSString**/ :[[self->__txtdireccion Text] Trim]],@"','f_idrecord':",[self.bi ObjectToString:[self->__txtdireccion Tag]],@",'f_credito_fiscal':false"] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=11993112;
 //BA.debugLineNum = 11993112;BA.debugLine="Dim JobSalvar As HttpJob";
_jobsalvar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11993113;
 //BA.debugLineNum = 11993113;BA.debugLine="JobSalvar.Initialize(\"JobSalvar\",Me)";
[_jobsalvar _initialize /*NSString**/ :nil :self.bi :@"JobSalvar" :self];
B4IRDebugUtils.currentLine=11993114;
 //BA.debugLineNum = 11993114;BA.debugLine="JobSalvar.PostString(Main.url&\"ws/set_salvar_dire";
[_jobsalvar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/set_salvar_direcciones_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=11993116;
 //BA.debugLineNum = 11993116;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnstate_selectedindexchanged:(int) _index{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"btnstate_selectedindexchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnstate_selectedindexchanged:" :@[@(_index)]]);}
B4IRDebugUtils.currentLine=12451840;
 //BA.debugLineNum = 12451840;BA.debugLine="Sub btnState_SelectedIndexChanged (Index As Int)";
B4IRDebugUtils.currentLine=12451842;
 //BA.debugLineNum = 12451842;BA.debugLine="indexCombo = Index";
self->__indexcombo = _index;
B4IRDebugUtils.currentLine=12451844;
 //BA.debugLineNum = 12451844;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buscarestados{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"buscarestados"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buscarestados" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobestados = nil;
B4IRDebugUtils.currentLine=11730944;
 //BA.debugLineNum = 11730944;BA.debugLine="Sub BuscarEstados";
B4IRDebugUtils.currentLine=11730946;
 //BA.debugLineNum = 11730946;BA.debugLine="Dim json As String = \"'f_usa': true\"";
_json = @"'f_usa': true";
B4IRDebugUtils.currentLine=11730948;
 //BA.debugLineNum = 11730948;BA.debugLine="Dim JobEstados As HttpJob";
_jobestados = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11730949;
 //BA.debugLineNum = 11730949;BA.debugLine="JobEstados.Initialize(\"JobEstados\",Me)";
[_jobestados _initialize /*NSString**/ :nil :self.bi :@"JobEstados" :self];
B4IRDebugUtils.currentLine=11730950;
 //BA.debugLineNum = 11730950;BA.debugLine="JobEstados.PostString(Main.url&\"ws/Buscar_lista_e";
[_jobestados _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/Buscar_lista_estados"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=11730952;
 //BA.debugLineNum = 11730952;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buscarprovincias{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"buscarprovincias"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buscarprovincias" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobprovincia = nil;
B4IRDebugUtils.currentLine=11796480;
 //BA.debugLineNum = 11796480;BA.debugLine="Sub BuscarProvincias";
B4IRDebugUtils.currentLine=11796482;
 //BA.debugLineNum = 11796482;BA.debugLine="Dim json As String = \"'f_usa': false\"";
_json = @"'f_usa': false";
B4IRDebugUtils.currentLine=11796484;
 //BA.debugLineNum = 11796484;BA.debugLine="Dim JobProvincia As HttpJob";
_jobprovincia = [b4i_httpjob new];
B4IRDebugUtils.currentLine=11796485;
 //BA.debugLineNum = 11796485;BA.debugLine="JobProvincia.Initialize(\"JobEstados\",Me)";
[_jobprovincia _initialize /*NSString**/ :nil :self.bi :@"JobEstados" :self];
B4IRDebugUtils.currentLine=11796486;
 //BA.debugLineNum = 11796486;BA.debugLine="JobProvincia.PostString(Main.url&\"ws/Buscar_lista";
[_jobprovincia _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/Buscar_lista_estados"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=11796488;
 //BA.debugLineNum = 11796488;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crear{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"crear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crear" :nil]);}
B4IRDebugUtils.currentLine=11403264;
 //BA.debugLineNum = 11403264;BA.debugLine="Sub crear";
B4IRDebugUtils.currentLine=11403266;
 //BA.debugLineNum = 11403266;BA.debugLine="PanelEncabezadoDir2.SetShadow(Colors.Gray, 0dip,3";
[self->__panelencabezadodir2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=11403267;
 //BA.debugLineNum = 11403267;BA.debugLine="Panel2V2.SetShadow(Colors.Gray,2dip,2dip,0.5,Fals";
[self->__panel2v2 SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=11403268;
 //BA.debugLineNum = 11403268;BA.debugLine="AddDireccion.SetShadow(Colors.Gray,2dip,2dip,0.5,";
[self->__adddireccion SetShadow:[[self->___c Colors] Gray] :(float) (((int) (2))) :(float) (((int) (2))) :(float) (0.5) :false];
B4IRDebugUtils.currentLine=11403270;
 //BA.debugLineNum = 11403270;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _dir :(long long) _fecha :(NSString*) _principal :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"createlistitem"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem:::::" :@[[B4I nilToNSNull:_dir],@(_fecha),[B4I nilToNSNull:_principal],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=11665408;
 //BA.debugLineNum = 11665408;BA.debugLine="Sub CreateListItem(Dir As String, fecha As Long,pr";
B4IRDebugUtils.currentLine=11665409;
 //BA.debugLineNum = 11665409;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11665410;
 //BA.debugLineNum = 11665410;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=11665411;
 //BA.debugLineNum = 11665411;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=11665412;
 //BA.debugLineNum = 11665412;BA.debugLine="p.LoadLayout(\"frmItemsDir\")";
[_p LoadLayout:@"frmItemsDir" :self.bi];
B4IRDebugUtils.currentLine=11665413;
 //BA.debugLineNum = 11665413;BA.debugLine="lblDir.Text = Dir";
[self->__lbldir setText:_dir];
B4IRDebugUtils.currentLine=11665414;
 //BA.debugLineNum = 11665414;BA.debugLine="lblFecha.Text = DateTime.Date(fecha)";
[self->__lblfecha setText:[[self->___c DateTime] Date:_fecha]];
B4IRDebugUtils.currentLine=11665415;
 //BA.debugLineNum = 11665415;BA.debugLine="lblPrincipal.Text = principal";
[self->__lblprincipal setText:_principal];
B4IRDebugUtils.currentLine=11665416;
 //BA.debugLineNum = 11665416;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=11665417;
 //BA.debugLineNum = 11665417;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
int _principaldireccion = 0;
B4IMap* _mymap = nil;
int _i = 0;
NSString* _dr = @"";
NSString* _city = @"";
NSString* _default = @"";
NSString* _name = @"";
B4IMap* _mapa = nil;
B4IRDebugUtils.currentLine=11599872;
 //BA.debugLineNum = 11599872;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=11599874;
 //BA.debugLineNum = 11599874;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=11599875;
 //BA.debugLineNum = 11599875;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=11599876;
 //BA.debugLineNum = 11599876;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11599879;
 //BA.debugLineNum = 11599879;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=11599880;
 //BA.debugLineNum = 11599880;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11599883;
 //BA.debugLineNum = 11599883;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=11599884;
 //BA.debugLineNum = 11599884;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=11599885;
 //BA.debugLineNum = 11599885;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=11599886;
 //BA.debugLineNum = 11599886;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
[_json Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=11599887;
 //BA.debugLineNum = 11599887;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=11599889;
 //BA.debugLineNum = 11599889;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobDirecciones",@"JobSalvar",@"JobEstados",@"JobDeleteDir"]]) {
case 0: {
B4IRDebugUtils.currentLine=11599893;
 //BA.debugLineNum = 11599893;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=11599895;
 //BA.debugLineNum = 11599895;BA.debugLine="ListaDirecciones2.Clear";
[self->__listadirecciones2 _clear /*NSString**/ :nil];
B4IRDebugUtils.currentLine=11599897;
 //BA.debugLineNum = 11599897;BA.debugLine="If list.Size = 0 Then";
if ([_list Size]==0) { 
B4IRDebugUtils.currentLine=11599898;
 //BA.debugLineNum = 11599898;BA.debugLine="Msgbox(\"No tiene direcciones registradas\",\"Inf";
[self->___c Msgbox:@"No tiene direcciones registradas" :@"Información"];
B4IRDebugUtils.currentLine=11599899;
 //BA.debugLineNum = 11599899;BA.debugLine="hud.ProgressDialogHide";
[self->__hud ProgressDialogHide];
B4IRDebugUtils.currentLine=11599901;
 //BA.debugLineNum = 11599901;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11599902;
 //BA.debugLineNum = 11599902;BA.debugLine="BuscarEstados";
[self _buscarestados];
 }else {
B4IRDebugUtils.currentLine=11599904;
 //BA.debugLineNum = 11599904;BA.debugLine="BuscarProvincias";
[self _buscarprovincias];
 };
B4IRDebugUtils.currentLine=11599907;
 //BA.debugLineNum = 11599907;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11599910;
 //BA.debugLineNum = 11599910;BA.debugLine="Dim principalDireccion As  Int";
_principaldireccion = 0;
B4IRDebugUtils.currentLine=11599911;
 //BA.debugLineNum = 11599911;BA.debugLine="Dim mymap As Map";
_mymap = [B4IMap new];
B4IRDebugUtils.currentLine=11599912;
 //BA.debugLineNum = 11599912;BA.debugLine="mymap.Initialize";
[_mymap Initialize];
B4IRDebugUtils.currentLine=11599914;
 //BA.debugLineNum = 11599914;BA.debugLine="For i=0 To list.Size -1";
{
const int step30 = 1;
const int limit30 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit30 ;_i = _i + step30 ) {
B4IRDebugUtils.currentLine=11599915;
 //BA.debugLineNum = 11599915;BA.debugLine="map = list.Get(i)";
_map = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=11599917;
 //BA.debugLineNum = 11599917;BA.debugLine="Dim dr,city,default,name=\"\" As String";
_dr = @"";
_city = @"";
_default = @"";
_name = @"";
B4IRDebugUtils.currentLine=11599919;
 //BA.debugLineNum = 11599919;BA.debugLine="principalDireccion = map.Get(\"f_principal\")";
_principaldireccion = [self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_principal")]].intValue;
B4IRDebugUtils.currentLine=11599920;
 //BA.debugLineNum = 11599920;BA.debugLine="dr = funciones.base64_Decode(map.Get(\"f_direcc";
_dr = [self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion1")]]];
B4IRDebugUtils.currentLine=11599921;
 //BA.debugLineNum = 11599921;BA.debugLine="city = \" ,\"&map.Get(\"f_sector_city\")";
_city = [@[@" ,",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_sector_city")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=11599922;
 //BA.debugLineNum = 11599922;BA.debugLine="name = map.Get(\"f_nombre_direccion\")";
_name = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_nombre_direccion")]];
B4IRDebugUtils.currentLine=11599925;
 //BA.debugLineNum = 11599925;BA.debugLine="If dr.Length > 40 Then";
if ([_dr Length]>40) { 
B4IRDebugUtils.currentLine=11599926;
 //BA.debugLineNum = 11599926;BA.debugLine="dr = dr.SubString2(0,40)&\"...\"";
_dr = [@[[_dr SubString2:(int) (0) :(int) (40)],@"..."] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=11599929;
 //BA.debugLineNum = 11599929;BA.debugLine="If principalDireccion == 1 Then";
if (_principaldireccion==1) { 
B4IRDebugUtils.currentLine=11599931;
 //BA.debugLineNum = 11599931;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11599933;
 //BA.debugLineNum = 11599933;BA.debugLine="default = \"Main address\"";
_default = @"Main address";
 }else {
B4IRDebugUtils.currentLine=11599937;
 //BA.debugLineNum = 11599937;BA.debugLine="default = \"Dirección principal\"";
_default = @"Dirección principal";
 };
 };
B4IRDebugUtils.currentLine=11599943;
 //BA.debugLineNum = 11599943;BA.debugLine="mymap.Clear";
[_mymap Clear];
B4IRDebugUtils.currentLine=11599945;
 //BA.debugLineNum = 11599945;BA.debugLine="mymap.Put(\"f_direccion\",dr)";
[_mymap Put:(NSObject*)(@"f_direccion") :(NSObject*)(_dr)];
B4IRDebugUtils.currentLine=11599946;
 //BA.debugLineNum = 11599946;BA.debugLine="mymap.Put(\"f_principal\",default)";
[_mymap Put:(NSObject*)(@"f_principal") :(NSObject*)(_default)];
B4IRDebugUtils.currentLine=11599947;
 //BA.debugLineNum = 11599947;BA.debugLine="mymap.Put(\"f_fecha\",map.Get(\"f_fecha\"))";
[_mymap Put:(NSObject*)(@"f_fecha") :[_map Get:(NSObject*)(@"f_fecha")]];
B4IRDebugUtils.currentLine=11599949;
 //BA.debugLineNum = 11599949;BA.debugLine="ListaDirecciones2.Add(CreateListItem(name&\": \"";
[self->__listadirecciones2 _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem:[@[_name,@": ",_dr,_city] componentsJoinedByString:@""] :[self.bi ObjectToLongNumber:[_map Get:(NSObject*)(@"f_fecha")]] :_default :(int) ([[self->__listadirecciones2 _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (80))]).object)] :(NSObject*)(_map)];
 }
};
B4IRDebugUtils.currentLine=11599953;
 //BA.debugLineNum = 11599953;BA.debugLine="hud.ProgressDialogHide";
[self->__hud ProgressDialogHide];
B4IRDebugUtils.currentLine=11599955;
 //BA.debugLineNum = 11599955;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11599956;
 //BA.debugLineNum = 11599956;BA.debugLine="BuscarEstados";
[self _buscarestados];
 }else {
B4IRDebugUtils.currentLine=11599958;
 //BA.debugLineNum = 11599958;BA.debugLine="BuscarProvincias";
[self _buscarprovincias];
 };
 break; }
case 1: {
B4IRDebugUtils.currentLine=11599963;
 //BA.debugLineNum = 11599963;BA.debugLine="If map.Get(\"f_data\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_data")]]) { 
B4IRDebugUtils.currentLine=11599965;
 //BA.debugLineNum = 11599965;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11599966;
 //BA.debugLineNum = 11599966;BA.debugLine="Msgbox(\"Address registred.\" ,\"info\")";
[self->___c Msgbox:@"Address registred." :@"info"];
B4IRDebugUtils.currentLine=11599967;
 //BA.debugLineNum = 11599967;BA.debugLine="btnBackUsa_Click";
[self _btnbackusa_click];
 }else {
B4IRDebugUtils.currentLine=11599969;
 //BA.debugLineNum = 11599969;BA.debugLine="Msgbox(\"Dirección registrada.\" ,\"Información\"";
[self->___c Msgbox:@"Dirección registrada." :@"Información"];
B4IRDebugUtils.currentLine=11599970;
 //BA.debugLineNum = 11599970;BA.debugLine="btnBackRd_Click";
[self _btnbackrd_click];
 };
 }else {
B4IRDebugUtils.currentLine=11599975;
 //BA.debugLineNum = 11599975;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11599976;
 //BA.debugLineNum = 11599976;BA.debugLine="Msgbox(\"Error registering your address\",\"Erro";
[self->___c Msgbox:@"Error registering your address" :@"Error"];
 }else {
B4IRDebugUtils.currentLine=11599978;
 //BA.debugLineNum = 11599978;BA.debugLine="Msgbox(\"Error al registrar su dirección\",\"Err";
[self->___c Msgbox:@"Error al registrar su dirección" :@"Error"];
 };
 };
 break; }
case 2: {
B4IRDebugUtils.currentLine=11599984;
 //BA.debugLineNum = 11599984;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=11599986;
 //BA.debugLineNum = 11599986;BA.debugLine="If list.Size <= 0 Then";
if ([_list Size]<=0) { 
B4IRDebugUtils.currentLine=11599987;
 //BA.debugLineNum = 11599987;BA.debugLine="Msgbox(\"No hay Estados en la BD\",\"Aviso!!\")";
[self->___c Msgbox:@"No hay Estados en la BD" :@"Aviso!!"];
B4IRDebugUtils.currentLine=11599988;
 //BA.debugLineNum = 11599988;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=11599991;
 //BA.debugLineNum = 11599991;BA.debugLine="estados.Initialize";
[self->__estados Initialize];
B4IRDebugUtils.currentLine=11599992;
 //BA.debugLineNum = 11599992;BA.debugLine="For i=0 To list.Size-1";
{
const int step82 = 1;
const int limit82 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit82 ;_i = _i + step82 ) {
B4IRDebugUtils.currentLine=11599994;
 //BA.debugLineNum = 11599994;BA.debugLine="Dim mapa As Map = list.Get(i)";
_mapa = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=11599996;
 //BA.debugLineNum = 11599996;BA.debugLine="estados.Add( mapa.Get(\"f_descripcion\"))";
[self->__estados Add:[_mapa Get:(NSObject*)(@"f_descripcion")]];
 }
};
 break; }
case 3: {
B4IRDebugUtils.currentLine=11600002;
 //BA.debugLineNum = 11600002;BA.debugLine="If map.Get(\"f_data\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_data")]]) { 
B4IRDebugUtils.currentLine=11600004;
 //BA.debugLineNum = 11600004;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11600005;
 //BA.debugLineNum = 11600005;BA.debugLine="btnBackUsa_Click";
[self _btnbackusa_click];
B4IRDebugUtils.currentLine=11600006;
 //BA.debugLineNum = 11600006;BA.debugLine="hud.ToastMessageShow(\"The address has deleted";
[self->__hud ToastMessageShow:@"The address has deleted correctly!" :false];
 }else {
B4IRDebugUtils.currentLine=11600009;
 //BA.debugLineNum = 11600009;BA.debugLine="btnBackRd_Click";
[self _btnbackrd_click];
B4IRDebugUtils.currentLine=11600010;
 //BA.debugLineNum = 11600010;BA.debugLine="hud.ToastMessageShow(\"La dirección se ha elim";
[self->__hud ToastMessageShow:@"La dirección se ha eliminado correctamente!" :false];
 };
 }else {
B4IRDebugUtils.currentLine=11600015;
 //BA.debugLineNum = 11600015;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=11600016;
 //BA.debugLineNum = 11600016;BA.debugLine="Msgbox(\"The address could not be deleted\",\"Er";
[self->___c Msgbox:@"The address could not be deleted" :@"Error"];
 }else {
B4IRDebugUtils.currentLine=11600018;
 //BA.debugLineNum = 11600018;BA.debugLine="Msgbox(\"La dirección no pudo ser eliminada\",\"";
[self->___c Msgbox:@"La dirección no pudo ser eliminada" :@"Error"];
 };
 };
 break; }
}
;
B4IRDebugUtils.currentLine=11600025;
 //BA.debugLineNum = 11600025;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listadirecciones_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"listadirecciones_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listadirecciones_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=11927552;
 //BA.debugLineNum = 11927552;BA.debugLine="Sub ListaDirecciones_ItemClick (Index As Int, Valu";
B4IRDebugUtils.currentLine=11927554;
 //BA.debugLineNum = 11927554;BA.debugLine="Dim map As Map = Value";
_map = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=11927556;
 //BA.debugLineNum = 11927556;BA.debugLine="txtDireccion.Text = funciones.base64_Decode(map.G";
[self->__txtdireccion setText:[self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_direccion")]]]];
B4IRDebugUtils.currentLine=11927557;
 //BA.debugLineNum = 11927557;BA.debugLine="txtDireccion.Tag = map.Get(\"f_idrecord\")";
[self->__txtdireccion setTag:[_map Get:(NSObject*)(@"f_idrecord")]];
B4IRDebugUtils.currentLine=11927558;
 //BA.debugLineNum = 11927558;BA.debugLine="mapadir = map";
self->__mapadir = _map;
B4IRDebugUtils.currentLine=11927559;
 //BA.debugLineNum = 11927559;BA.debugLine="actualizar = True";
self->__actualizar = true;
B4IRDebugUtils.currentLine=11927561;
 //BA.debugLineNum = 11927561;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listadirecciones2_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"listadirecciones2_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listadirecciones2_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IRDebugUtils.currentLine=12779520;
 //BA.debugLineNum = 12779520;BA.debugLine="Sub ListaDirecciones2_ItemClick (Index As Int, Val";
B4IRDebugUtils.currentLine=12779522;
 //BA.debugLineNum = 12779522;BA.debugLine="mapaEdit = Value";
self->__mapaedit = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=12779524;
 //BA.debugLineNum = 12779524;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=12779525;
 //BA.debugLineNum = 12779525;BA.debugLine="Msgbox2(\"MsgEdit\",\"Do you want to edit this addr";
[self->___c Msgbox2:self.bi :@"MsgEdit" :@"Do you want to edit this address?" :@"Question" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Yes")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 }else {
B4IRDebugUtils.currentLine=12779527;
 //BA.debugLineNum = 12779527;BA.debugLine="Msgbox2(\"MsgEdit\",\"Desea editar esta dirección?\"";
[self->___c Msgbox2:self.bi :@"MsgEdit" :@"Desea editar esta dirección?" :@"Aviso" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
B4IRDebugUtils.currentLine=12779530;
 //BA.debugLineNum = 12779530;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgdelete_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"msgdelete_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgdelete_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
NSString* _json = @"";
b4i_httpjob* _jobdeletedir = nil;
B4IRDebugUtils.currentLine=12910592;
 //BA.debugLineNum = 12910592;BA.debugLine="Sub MsgDelete_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=12910594;
 //BA.debugLineNum = 12910594;BA.debugLine="If ButtonText = \"Si\" Or ButtonText = \"Yes\" Then";
if ([_buttontext isEqual:@"Si"] || [_buttontext isEqual:@"Yes"]) { 
B4IRDebugUtils.currentLine=12910596;
 //BA.debugLineNum = 12910596;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=12910597;
 //BA.debugLineNum = 12910597;BA.debugLine="json = \"'f_idrecord':\"&mapaEdit.Get(\"f_idrecord\"";
_json = [@[@"'f_idrecord':",[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_idrecord")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=12910599;
 //BA.debugLineNum = 12910599;BA.debugLine="Dim JobDeleteDir As HttpJob";
_jobdeletedir = [b4i_httpjob new];
B4IRDebugUtils.currentLine=12910600;
 //BA.debugLineNum = 12910600;BA.debugLine="JobDeleteDir.Initialize(\"JobDeleteDir\",Me)";
[_jobdeletedir _initialize /*NSString**/ :nil :self.bi :@"JobDeleteDir" :self];
B4IRDebugUtils.currentLine=12910601;
 //BA.debugLineNum = 12910601;BA.debugLine="JobDeleteDir.PostString(Main.url&\"ws/borrar_dire";
[_jobdeletedir _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/borrar_direccion"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=12910604;
 //BA.debugLineNum = 12910604;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=12910607;
 //BA.debugLineNum = 12910607;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _msgedit_click:(NSString*) _buttontext{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"msgedit_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"msgedit_click:" :@[[B4I nilToNSNull:_buttontext]]]);}
B4IRDebugUtils.currentLine=12845056;
 //BA.debugLineNum = 12845056;BA.debugLine="Sub MsgEdit_Click(ButtonText As String)";
B4IRDebugUtils.currentLine=12845058;
 //BA.debugLineNum = 12845058;BA.debugLine="If ButtonText = \"Si\" Or ButtonText = \"Yes\" Then";
if ([_buttontext isEqual:@"Si"] || [_buttontext isEqual:@"Yes"]) { 
B4IRDebugUtils.currentLine=12845060;
 //BA.debugLineNum = 12845060;BA.debugLine="If Main.IsUsa Then";
if (self->__main->__isusa /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=12845062;
 //BA.debugLineNum = 12845062;BA.debugLine="edition = True";
self->__edition = true;
B4IRDebugUtils.currentLine=12845063;
 //BA.debugLineNum = 12845063;BA.debugLine="AddDireccion_Click";
[self _adddireccion_click];
B4IRDebugUtils.currentLine=12845065;
 //BA.debugLineNum = 12845065;BA.debugLine="txtAddress1.Text = funciones.base64_Decode(mapa";
[self->__txtaddress1 setText:[self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_direccion1")]]]];
B4IRDebugUtils.currentLine=12845067;
 //BA.debugLineNum = 12845067;BA.debugLine="If funciones.base64_Decode(mapaEdit.Get(\"f_dire";
if ([self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_direccion2")]]]!= nil && [[self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_direccion2")]]] isEqual:@""] == false) { 
B4IRDebugUtils.currentLine=12845068;
 //BA.debugLineNum = 12845068;BA.debugLine="txtAddress2.Text = funciones.base64_Decode(map";
[self->__txtaddress2 setText:[self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_direccion2")]]]];
 }else {
B4IRDebugUtils.currentLine=12845070;
 //BA.debugLineNum = 12845070;BA.debugLine="txtAddress2.Text = \"\"";
[self->__txtaddress2 setText:@""];
 };
B4IRDebugUtils.currentLine=12845073;
 //BA.debugLineNum = 12845073;BA.debugLine="txtCity.Text = mapaEdit.Get(\"f_sector_city\")";
[self->__txtcity setText:[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_sector_city")]]];
B4IRDebugUtils.currentLine=12845074;
 //BA.debugLineNum = 12845074;BA.debugLine="btnState.SelectedIndex = (mapaEdit.Get(\"f_state";
[self->__btnstate _setselectedindex: /*int*/ nil :(int) (([self.bi ObjectToNumber:[self->__mapaedit Get:(NSObject*)(@"f_state_provincia")]].doubleValue-1))];
B4IRDebugUtils.currentLine=12845075;
 //BA.debugLineNum = 12845075;BA.debugLine="txtZipCode.Text = mapaEdit.Get(\"f_zipcode\")";
[self->__txtzipcode setText:[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_zipcode")]]];
B4IRDebugUtils.currentLine=12845076;
 //BA.debugLineNum = 12845076;BA.debugLine="chPrincipal.Value = mapaEdit.Get(\"f_principal\")";
[self->__chprincipal setValue:[self.bi ObjectToBoolean:[self->__mapaedit Get:(NSObject*)(@"f_principal")]]];
B4IRDebugUtils.currentLine=12845077;
 //BA.debugLineNum = 12845077;BA.debugLine="actu = True";
self->__actu = true;
B4IRDebugUtils.currentLine=12845078;
 //BA.debugLineNum = 12845078;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
self->__update = [self.bi ObjectToNumber:[self->__mapaedit Get:(NSObject*)(@"f_idrecord")]].intValue;
 }else {
B4IRDebugUtils.currentLine=12845082;
 //BA.debugLineNum = 12845082;BA.debugLine="edition = True";
self->__edition = true;
B4IRDebugUtils.currentLine=12845083;
 //BA.debugLineNum = 12845083;BA.debugLine="AddDireccion_Click";
[self _adddireccion_click];
B4IRDebugUtils.currentLine=12845085;
 //BA.debugLineNum = 12845085;BA.debugLine="txtDireRD.Text = funciones.base64_Decode(mapaEd";
[self->__txtdirerd setText:[self->__funciones _base64_decode /*NSString**/ :[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_direccion1")]]]];
B4IRDebugUtils.currentLine=12845087;
 //BA.debugLineNum = 12845087;BA.debugLine="txtSector.Text = mapaEdit.Get(\"f_sector_city\")";
[self->__txtsector setText:[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_sector_city")]]];
B4IRDebugUtils.currentLine=12845088;
 //BA.debugLineNum = 12845088;BA.debugLine="btnProvinciaCombo.SelectedIndex = (mapaEdit.Get";
[self->__btnprovinciacombo _setselectedindex: /*int*/ nil :(int) (([self.bi ObjectToNumber:[self->__mapaedit Get:(NSObject*)(@"f_state_provincia")]].doubleValue-1))];
B4IRDebugUtils.currentLine=12845089;
 //BA.debugLineNum = 12845089;BA.debugLine="txtZipCodeRD.Text = mapaEdit.Get(\"f_zipcode\")";
[self->__txtzipcoderd setText:[self.bi ObjectToString:[self->__mapaedit Get:(NSObject*)(@"f_zipcode")]]];
B4IRDebugUtils.currentLine=12845090;
 //BA.debugLineNum = 12845090;BA.debugLine="chPrincipalRD.Value = mapaEdit.Get(\"f_principal";
[self->__chprincipalrd setValue:[self.bi ObjectToBoolean:[self->__mapaedit Get:(NSObject*)(@"f_principal")]]];
B4IRDebugUtils.currentLine=12845091;
 //BA.debugLineNum = 12845091;BA.debugLine="actu = True";
self->__actu = true;
B4IRDebugUtils.currentLine=12845092;
 //BA.debugLineNum = 12845092;BA.debugLine="update = mapaEdit.Get(\"f_idrecord\")";
self->__update = [self.bi ObjectToNumber:[self->__mapaedit Get:(NSObject*)(@"f_idrecord")]].intValue;
 };
 }else if([_buttontext isEqual:@"No"]) { 
B4IRDebugUtils.currentLine=12845097;
 //BA.debugLineNum = 12845097;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=12845100;
 //BA.debugLineNum = 12845100;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="Dim mapadir As Map";
self->__mapadir = [B4IMap new];
B4IRDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="Dim actualizar As Boolean = False";
self->__actualizar = false;
B4IRDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Dim toped As Int";
self->__toped = 0;
B4IRDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Dim topedLbl As Int";
self->__topedlbl = 0;
B4IRDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="Dim estados As List";
self->__estados = [B4IList new];
B4IRDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="Dim actu As Boolean = False";
self->__actu = false;
B4IRDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="Dim update As Int = 0";
self->__update = (int) (0);
B4IRDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="Dim indexCombo As Int = 0";
self->__indexcombo = (int) (0);
B4IRDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="Dim edition As Boolean = False";
self->__edition = false;
B4IRDebugUtils.currentLine=11272207;
 //BA.debugLineNum = 11272207;BA.debugLine="Dim reload As Boolean = False";
self->__reload = false;
B4IRDebugUtils.currentLine=11272209;
 //BA.debugLineNum = 11272209;BA.debugLine="Dim mapaEdit As Map";
self->__mapaedit = [B4IMap new];
B4IRDebugUtils.currentLine=11272210;
 //BA.debugLineNum = 11272210;BA.debugLine="Dim topMarco As Int";
self->__topmarco = 0;
B4IRDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="Dim toplblAdres2 As Int";
self->__toplbladres2 = 0;
B4IRDebugUtils.currentLine=11272212;
 //BA.debugLineNum = 11272212;BA.debugLine="Dim topadres As Int";
self->__topadres = 0;
B4IRDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="Dim toplbl6 As Int";
self->__toplbl6 = 0;
B4IRDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="Dim toptxtCity As Int";
self->__toptxtcity = 0;
B4IRDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="Dim toplbl7 As Int";
self->__toplbl7 = 0;
B4IRDebugUtils.currentLine=11272216;
 //BA.debugLineNum = 11272216;BA.debugLine="Dim topbtnstate As Int";
self->__topbtnstate = 0;
B4IRDebugUtils.currentLine=11272218;
 //BA.debugLineNum = 11272218;BA.debugLine="Dim TOPlblZip As Int";
self->__toplblzip = 0;
B4IRDebugUtils.currentLine=11272219;
 //BA.debugLineNum = 11272219;BA.debugLine="Dim TOPtxtZip As Int";
self->__toptxtzip = 0;
B4IRDebugUtils.currentLine=11272224;
 //BA.debugLineNum = 11272224;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=11272225;
 //BA.debugLineNum = 11272225;BA.debugLine="Private pageDirecciones As Page";
self->__pagedirecciones = [B4IPage new];
B4IRDebugUtils.currentLine=11272226;
 //BA.debugLineNum = 11272226;BA.debugLine="Private Panel2 As Panel";
self->__panel2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272227;
 //BA.debugLineNum = 11272227;BA.debugLine="Private ListaDirecciones As CustomListView";
self->__listadirecciones = [b4i_customlistview new];
B4IRDebugUtils.currentLine=11272228;
 //BA.debugLineNum = 11272228;BA.debugLine="Private lblDir As Label";
self->__lbldir = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272229;
 //BA.debugLineNum = 11272229;BA.debugLine="Private lblFecha As Label";
self->__lblfecha = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272230;
 //BA.debugLineNum = 11272230;BA.debugLine="Private lblPrincipal As Label";
self->__lblprincipal = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272231;
 //BA.debugLineNum = 11272231;BA.debugLine="Private btnDireccionBack As Button";
self->__btndireccionback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272232;
 //BA.debugLineNum = 11272232;BA.debugLine="Private btnSalvarDireccion As Button";
self->__btnsalvardireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272233;
 //BA.debugLineNum = 11272233;BA.debugLine="Private chPrincipal As Switch";
self->__chprincipal = [B4ISwitchWrapper new];
B4IRDebugUtils.currentLine=11272234;
 //BA.debugLineNum = 11272234;BA.debugLine="Private Label3 As Label";
self->__label3 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272235;
 //BA.debugLineNum = 11272235;BA.debugLine="Private Label2 As Label";
self->__label2 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272236;
 //BA.debugLineNum = 11272236;BA.debugLine="Private txtDireccion As TextView";
self->__txtdireccion = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=11272237;
 //BA.debugLineNum = 11272237;BA.debugLine="Private PanelEncabezadoDir2 As Panel";
self->__panelencabezadodir2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272238;
 //BA.debugLineNum = 11272238;BA.debugLine="Private Panel2V2 As Panel";
self->__panel2v2 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272239;
 //BA.debugLineNum = 11272239;BA.debugLine="Private AddDireccion As Button";
self->__adddireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272240;
 //BA.debugLineNum = 11272240;BA.debugLine="Private BorrarDireccion As Button";
self->__borrardireccion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272241;
 //BA.debugLineNum = 11272241;BA.debugLine="Private ListaDirecciones2 As CustomListView";
self->__listadirecciones2 = [b4i_customlistview new];
B4IRDebugUtils.currentLine=11272242;
 //BA.debugLineNum = 11272242;BA.debugLine="Private btnDireccionBack2 As Button";
self->__btndireccionback2 = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272243;
 //BA.debugLineNum = 11272243;BA.debugLine="Private btnState As B4XComboBox";
self->__btnstate = [b4i_b4xcombobox new];
B4IRDebugUtils.currentLine=11272244;
 //BA.debugLineNum = 11272244;BA.debugLine="Private PanelFondoDireccionesUSA As Panel";
self->__panelfondodireccionesusa = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272245;
 //BA.debugLineNum = 11272245;BA.debugLine="Private btnBackUsa As Button";
self->__btnbackusa = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272246;
 //BA.debugLineNum = 11272246;BA.debugLine="Private txtAddress1 As TextView";
self->__txtaddress1 = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=11272247;
 //BA.debugLineNum = 11272247;BA.debugLine="Private txtAddress2 As TextView";
self->__txtaddress2 = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=11272248;
 //BA.debugLineNum = 11272248;BA.debugLine="Private txtCity As TextField";
self->__txtcity = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=11272249;
 //BA.debugLineNum = 11272249;BA.debugLine="Private BtnAgregarDireccionFinal As Button";
self->__btnagregardireccionfinal = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272250;
 //BA.debugLineNum = 11272250;BA.debugLine="Private txtZipCode As TextField";
self->__txtzipcode = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=11272251;
 //BA.debugLineNum = 11272251;BA.debugLine="Private btnDeleteUsa As Button";
self->__btndeleteusa = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272252;
 //BA.debugLineNum = 11272252;BA.debugLine="Private PanelMarcoDirRD As Panel";
self->__panelmarcodirrd = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272253;
 //BA.debugLineNum = 11272253;BA.debugLine="Private PanelFondoDireccionesRD As Panel";
self->__panelfondodireccionesrd = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272255;
 //BA.debugLineNum = 11272255;BA.debugLine="Private btnProvinciaCombo As B4XComboBox";
self->__btnprovinciacombo = [b4i_b4xcombobox new];
B4IRDebugUtils.currentLine=11272256;
 //BA.debugLineNum = 11272256;BA.debugLine="Private btnBackRd As Button";
self->__btnbackrd = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272257;
 //BA.debugLineNum = 11272257;BA.debugLine="Private PanelEncabezadoRD As Panel";
self->__panelencabezadord = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272258;
 //BA.debugLineNum = 11272258;BA.debugLine="Private txtDireRD As TextView";
self->__txtdirerd = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=11272259;
 //BA.debugLineNum = 11272259;BA.debugLine="Private txtSector As TextField";
self->__txtsector = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=11272260;
 //BA.debugLineNum = 11272260;BA.debugLine="Private txtZipCodeRD As TextField";
self->__txtzipcoderd = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=11272261;
 //BA.debugLineNum = 11272261;BA.debugLine="Private btnAgregarDirRD As Button";
self->__btnagregardirrd = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272262;
 //BA.debugLineNum = 11272262;BA.debugLine="Private chPrincipalRD As Switch";
self->__chprincipalrd = [B4ISwitchWrapper new];
B4IRDebugUtils.currentLine=11272263;
 //BA.debugLineNum = 11272263;BA.debugLine="Private PanelEncabezadoUsa As Panel";
self->__panelencabezadousa = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272264;
 //BA.debugLineNum = 11272264;BA.debugLine="Private btnDeleteRD As Button";
self->__btndeleterd = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272265;
 //BA.debugLineNum = 11272265;BA.debugLine="Private Label5 As Label";
self->__label5 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272266;
 //BA.debugLineNum = 11272266;BA.debugLine="Private Label6 As Label";
self->__label6 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272267;
 //BA.debugLineNum = 11272267;BA.debugLine="Private Label7 As Label";
self->__label7 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272268;
 //BA.debugLineNum = 11272268;BA.debugLine="Private PanelComboUSA As Panel";
self->__panelcombousa = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272269;
 //BA.debugLineNum = 11272269;BA.debugLine="Private Label8 As Label";
self->__label8 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272270;
 //BA.debugLineNum = 11272270;BA.debugLine="Private panelZipCode As Panel";
self->__panelzipcode = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272271;
 //BA.debugLineNum = 11272271;BA.debugLine="Private PanelFondoNombreDir As Panel";
self->__panelfondonombredir = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=11272272;
 //BA.debugLineNum = 11272272;BA.debugLine="Private Label16 As Label";
self->__label16 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11272273;
 //BA.debugLineNum = 11272273;BA.debugLine="Private txtNombreDireccion As TextField";
self->__txtnombredireccion = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=11272274;
 //BA.debugLineNum = 11272274;BA.debugLine="Private btnAceptarNombreDir As Button";
self->__btnaceptarnombredir = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=11272275;
 //BA.debugLineNum = 11272275;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtdireccion_beginedit{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtdireccion_beginedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtdireccion_beginedit" :nil]);}
B4IRDebugUtils.currentLine=12124160;
 //BA.debugLineNum = 12124160;BA.debugLine="Sub txtDireccion_BeginEdit";
B4IRDebugUtils.currentLine=12124163;
 //BA.debugLineNum = 12124163;BA.debugLine="Panel2.Visible = False";
[self->__panel2 setVisible:false];
B4IRDebugUtils.currentLine=12124164;
 //BA.debugLineNum = 12124164;BA.debugLine="topedLbl = Label3.Top";
self->__topedlbl = (int) ([self->__label3 Top]);
B4IRDebugUtils.currentLine=12124165;
 //BA.debugLineNum = 12124165;BA.debugLine="toped  = txtDireccion.Top";
self->__toped = (int) ([self->__txtdireccion Top]);
B4IRDebugUtils.currentLine=12124167;
 //BA.debugLineNum = 12124167;BA.debugLine="Label3.Top = Label2.Top + 45dip";
[self->__label3 setTop:(float) ([self->__label2 Top]+((int) (45)))];
B4IRDebugUtils.currentLine=12124168;
 //BA.debugLineNum = 12124168;BA.debugLine="txtDireccion.Top =  Label3.Top +  28dip";
[self->__txtdireccion setTop:(float) ([self->__label3 Top]+((int) (28)))];
B4IRDebugUtils.currentLine=12124170;
 //BA.debugLineNum = 12124170;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtdireccion_endedit{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtdireccion_endedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtdireccion_endedit" :nil]);}
B4IRDebugUtils.currentLine=12189696;
 //BA.debugLineNum = 12189696;BA.debugLine="Sub txtDireccion_EndEdit";
B4IRDebugUtils.currentLine=12189698;
 //BA.debugLineNum = 12189698;BA.debugLine="Panel2.Visible = True";
[self->__panel2 setVisible:true];
B4IRDebugUtils.currentLine=12189699;
 //BA.debugLineNum = 12189699;BA.debugLine="Label3.Top = topedLbl";
[self->__label3 setTop:(float) (self->__topedlbl)];
B4IRDebugUtils.currentLine=12189700;
 //BA.debugLineNum = 12189700;BA.debugLine="txtDireccion.Top = toped";
[self->__txtdireccion setTop:(float) (self->__toped)];
B4IRDebugUtils.currentLine=12189702;
 //BA.debugLineNum = 12189702;BA.debugLine="pageDirecciones.ResignFocus";
[self->__pagedirecciones ResignFocus];
B4IRDebugUtils.currentLine=12189704;
 //BA.debugLineNum = 12189704;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtdireccion_textchanged:(NSString*) _oldtext :(NSString*) _newtext{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtdireccion_textchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtdireccion_textchanged::" :@[[B4I nilToNSNull:_oldtext],[B4I nilToNSNull:_newtext]]]);}
B4IRDebugUtils.currentLine=12255232;
 //BA.debugLineNum = 12255232;BA.debugLine="Sub txtDireccion_TextChanged (OldText As String, N";
B4IRDebugUtils.currentLine=12255234;
 //BA.debugLineNum = 12255234;BA.debugLine="If NewText.Contains(Chr(10)) Then";
if ([_newtext Contains:[self.bi CharToString:((unichar)((int) (10)))]]) { 
B4IRDebugUtils.currentLine=12255235;
 //BA.debugLineNum = 12255235;BA.debugLine="txtDireccion_EndEdit";
[self _txtdireccion_endedit];
 };
B4IRDebugUtils.currentLine=12255238;
 //BA.debugLineNum = 12255238;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtzipcode_beginedit{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtzipcode_beginedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtzipcode_beginedit" :nil]);}
B4IRDebugUtils.currentLine=12976128;
 //BA.debugLineNum = 12976128;BA.debugLine="Sub txtZipCode_BeginEdit";
B4IRDebugUtils.currentLine=12976130;
 //BA.debugLineNum = 12976130;BA.debugLine="Label3.Visible = False";
[self->__label3 setVisible:false];
B4IRDebugUtils.currentLine=12976131;
 //BA.debugLineNum = 12976131;BA.debugLine="txtAddress1.Visible = False";
[self->__txtaddress1 setVisible:false];
B4IRDebugUtils.currentLine=12976133;
 //BA.debugLineNum = 12976133;BA.debugLine="toplblAdres2 = Label5.Top";
self->__toplbladres2 = (int) ([self->__label5 Top]);
B4IRDebugUtils.currentLine=12976135;
 //BA.debugLineNum = 12976135;BA.debugLine="Label5.Top = Label3.Top * 0.8";
[self->__label5 setTop:(float) ([self->__label3 Top]*0.8)];
B4IRDebugUtils.currentLine=12976137;
 //BA.debugLineNum = 12976137;BA.debugLine="topadres = txtAddress2.Top";
self->__topadres = (int) ([self->__txtaddress2 Top]);
B4IRDebugUtils.currentLine=12976139;
 //BA.debugLineNum = 12976139;BA.debugLine="txtAddress2.Top = Label3.Top *1.2";
[self->__txtaddress2 setTop:(float) ([self->__label3 Top]*1.2)];
B4IRDebugUtils.currentLine=12976141;
 //BA.debugLineNum = 12976141;BA.debugLine="toplbl6 = Label6.Top";
self->__toplbl6 = (int) ([self->__label6 Top]);
B4IRDebugUtils.currentLine=12976142;
 //BA.debugLineNum = 12976142;BA.debugLine="toptxtCity = txtCity.Top";
self->__toptxtcity = (int) ([self->__txtcity Top]);
B4IRDebugUtils.currentLine=12976145;
 //BA.debugLineNum = 12976145;BA.debugLine="Label6.Top = Label3.Top * 2.3";
[self->__label6 setTop:(float) ([self->__label3 Top]*2.3)];
B4IRDebugUtils.currentLine=12976147;
 //BA.debugLineNum = 12976147;BA.debugLine="txtCity.Top = Label3.Top * 2.8";
[self->__txtcity setTop:(float) ([self->__label3 Top]*2.8)];
B4IRDebugUtils.currentLine=12976149;
 //BA.debugLineNum = 12976149;BA.debugLine="toplbl7 = Label7.Top";
self->__toplbl7 = (int) ([self->__label7 Top]);
B4IRDebugUtils.currentLine=12976150;
 //BA.debugLineNum = 12976150;BA.debugLine="topbtnstate = PanelComboUSA.Top";
self->__topbtnstate = (int) ([self->__panelcombousa Top]);
B4IRDebugUtils.currentLine=12976153;
 //BA.debugLineNum = 12976153;BA.debugLine="Label7.Top = Label3.Top * 3.5";
[self->__label7 setTop:(float) ([self->__label3 Top]*3.5)];
B4IRDebugUtils.currentLine=12976154;
 //BA.debugLineNum = 12976154;BA.debugLine="PanelComboUSA.Top = Label3.Top * 3.9";
[self->__panelcombousa setTop:(float) ([self->__label3 Top]*3.9)];
B4IRDebugUtils.currentLine=12976156;
 //BA.debugLineNum = 12976156;BA.debugLine="TOPtxtZip = panelZipCode.Top";
self->__toptxtzip = (int) ([self->__panelzipcode Top]);
B4IRDebugUtils.currentLine=12976158;
 //BA.debugLineNum = 12976158;BA.debugLine="panelZipCode.Top = Label3.Top * 4.8";
[self->__panelzipcode setTop:(float) ([self->__label3 Top]*4.8)];
B4IRDebugUtils.currentLine=12976162;
 //BA.debugLineNum = 12976162;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtzipcode_endedit{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtzipcode_endedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtzipcode_endedit" :nil]);}
B4IRDebugUtils.currentLine=13041664;
 //BA.debugLineNum = 13041664;BA.debugLine="Sub txtZipCode_EndEdit";
B4IRDebugUtils.currentLine=13041666;
 //BA.debugLineNum = 13041666;BA.debugLine="Label3.Visible = True";
[self->__label3 setVisible:true];
B4IRDebugUtils.currentLine=13041667;
 //BA.debugLineNum = 13041667;BA.debugLine="txtAddress1.Visible = True";
[self->__txtaddress1 setVisible:true];
B4IRDebugUtils.currentLine=13041669;
 //BA.debugLineNum = 13041669;BA.debugLine="Label5.Top = toplblAdres2";
[self->__label5 setTop:(float) (self->__toplbladres2)];
B4IRDebugUtils.currentLine=13041670;
 //BA.debugLineNum = 13041670;BA.debugLine="txtAddress2.Top = topadres";
[self->__txtaddress2 setTop:(float) (self->__topadres)];
B4IRDebugUtils.currentLine=13041671;
 //BA.debugLineNum = 13041671;BA.debugLine="Label6.Top = toplbl6";
[self->__label6 setTop:(float) (self->__toplbl6)];
B4IRDebugUtils.currentLine=13041672;
 //BA.debugLineNum = 13041672;BA.debugLine="txtCity.Top = toptxtCity";
[self->__txtcity setTop:(float) (self->__toptxtcity)];
B4IRDebugUtils.currentLine=13041673;
 //BA.debugLineNum = 13041673;BA.debugLine="Label7.Top = toplbl7";
[self->__label7 setTop:(float) (self->__toplbl7)];
B4IRDebugUtils.currentLine=13041674;
 //BA.debugLineNum = 13041674;BA.debugLine="PanelComboUSA.Top = topbtnstate";
[self->__panelcombousa setTop:(float) (self->__topbtnstate)];
B4IRDebugUtils.currentLine=13041675;
 //BA.debugLineNum = 13041675;BA.debugLine="panelZipCode.Top = TOPtxtZip";
[self->__panelzipcode setTop:(float) (self->__toptxtzip)];
B4IRDebugUtils.currentLine=13041677;
 //BA.debugLineNum = 13041677;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtzipcoderd_beginedit{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtzipcoderd_beginedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtzipcoderd_beginedit" :nil]);}
B4IRDebugUtils.currentLine=13434880;
 //BA.debugLineNum = 13434880;BA.debugLine="Sub txtZipCodeRD_BeginEdit";
B4IRDebugUtils.currentLine=13434882;
 //BA.debugLineNum = 13434882;BA.debugLine="topMarco = PanelMarcoDirRD.Top";
self->__topmarco = (int) ([self->__panelmarcodirrd Top]);
B4IRDebugUtils.currentLine=13434883;
 //BA.debugLineNum = 13434883;BA.debugLine="PanelMarcoDirRD.Top = PanelFondoDireccionesRD.Top";
[self->__panelmarcodirrd setTop:[self->__panelfondodireccionesrd Top]];
B4IRDebugUtils.currentLine=13434885;
 //BA.debugLineNum = 13434885;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _txtzipcoderd_endedit{
B4IRDebugUtils.currentModule=@"direcciones";
if ([B4IDebug shouldDelegate: @"txtzipcoderd_endedit"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"txtzipcoderd_endedit" :nil]);}
B4IRDebugUtils.currentLine=13500416;
 //BA.debugLineNum = 13500416;BA.debugLine="Sub txtZipCodeRD_EndEdit";
B4IRDebugUtils.currentLine=13500417;
 //BA.debugLineNum = 13500417;BA.debugLine="PanelMarcoDirRD.Top = topMarco";
[self->__panelmarcodirrd setTop:(float) (self->__topmarco)];
B4IRDebugUtils.currentLine=13500418;
 //BA.debugLineNum = 13500418;BA.debugLine="End Sub";
return @"";
}
@end