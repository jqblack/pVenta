
#import "b4i_perfil.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
#import "b4i_categoria.h"
#import "b4i_reportes.h"
#import "b4i_facturacion.h"
#import "b4i_direcciones.h"
#import "b4i_customlistview.h"
#import "b4i_b4xcombobox.h"
#import "b4i_favoritos.h"
#import "b4i_b4xdrawer.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"


@implementation b4i_perfil 


+ (instancetype)new {
    static b4i_perfil* shared = nil;
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
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="pagePerfil.Initialize(\"pagePerfil\")";
[self->__pageperfil Initialize:self.bi :@"pagePerfil"];
B4IRDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="pagePerfil.RootPanel.LoadLayout(\"frmPerfil\")";
[[self->__pageperfil RootPanel] LoadLayout:@"frmPerfil" :self.bi];
B4IRDebugUtils.currentLine=16777221;
 //BA.debugLineNum = 16777221;BA.debugLine="Main.NavControl.ShowPage(pagePerfil)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pageperfil).object)];
B4IRDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="BuscarDatos";
[self _buscardatos];
B4IRDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="Main.smc.Tag = \"perfil\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"perfil")];
B4IRDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackchangepass_click{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"btnbackchangepass_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackchangepass_click" :nil]);}
B4IRDebugUtils.currentLine=17235968;
 //BA.debugLineNum = 17235968;BA.debugLine="Sub btnBackChangePass_Click";
B4IRDebugUtils.currentLine=17235969;
 //BA.debugLineNum = 17235969;BA.debugLine="PanelFondoModalpass.SetAlphaAnimated(500,0)";
[self->__panelfondomodalpass SetAlphaAnimated:(int) (500) :(float) (0)];
B4IRDebugUtils.currentLine=17235970;
 //BA.debugLineNum = 17235970;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnchangepass_click{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"btnchangepass_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnchangepass_click" :nil]);}
B4IRDebugUtils.currentLine=17104896;
 //BA.debugLineNum = 17104896;BA.debugLine="Sub btnChangePass_Click";
B4IRDebugUtils.currentLine=17104897;
 //BA.debugLineNum = 17104897;BA.debugLine="PanelFondoModalpass.Left = 0%x";
[self->__panelfondomodalpass setLeft:[self->___c PerXToCurrent:(float) (0)]];
B4IRDebugUtils.currentLine=17104898;
 //BA.debugLineNum = 17104898;BA.debugLine="PanelFondoModalpass.SetAlphaAnimated(500,1)";
[self->__panelfondomodalpass SetAlphaAnimated:(int) (500) :(float) (1)];
B4IRDebugUtils.currentLine=17104899;
 //BA.debugLineNum = 17104899;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnconfirmchangepass_click{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"btnconfirmchangepass_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnconfirmchangepass_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _changepass = nil;
B4IRDebugUtils.currentLine=17170432;
 //BA.debugLineNum = 17170432;BA.debugLine="Sub btnConfirmChangePass_Click";
B4IRDebugUtils.currentLine=17170434;
 //BA.debugLineNum = 17170434;BA.debugLine="If txtPassAntigua.Text == \"\" Then";
if ([[self->__txtpassantigua Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=17170435;
 //BA.debugLineNum = 17170435;BA.debugLine="Msgbox(\"Debe poner la contrseña antigua para pod";
[self->___c Msgbox:@"Debe poner la contrseña antigua para poder actualizar" :@"Aviso"];
B4IRDebugUtils.currentLine=17170436;
 //BA.debugLineNum = 17170436;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=17170439;
 //BA.debugLineNum = 17170439;BA.debugLine="If txtNewPass.Text == \"\" Then";
if ([[self->__txtnewpass Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=17170440;
 //BA.debugLineNum = 17170440;BA.debugLine="Msgbox(\"Debe poner la  nueva contrseña  para pod";
[self->___c Msgbox:@"Debe poner la  nueva contrseña  para poder actualizar" :@"Aviso"];
B4IRDebugUtils.currentLine=17170441;
 //BA.debugLineNum = 17170441;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=17170444;
 //BA.debugLineNum = 17170444;BA.debugLine="If txtNewPass.Text == txtPassAntigua.Text Then";
if ([[self->__txtnewpass Text] isEqual:[self->__txtpassantigua Text]]) { 
B4IRDebugUtils.currentLine=17170445;
 //BA.debugLineNum = 17170445;BA.debugLine="Msgbox(\"La nueva contrseña debe de ser diferente";
[self->___c Msgbox:@"La nueva contrseña debe de ser diferente a la anterior para poder actualizar" :@"Aviso"];
B4IRDebugUtils.currentLine=17170446;
 //BA.debugLineNum = 17170446;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=17170449;
 //BA.debugLineNum = 17170449;BA.debugLine="If txtPassConfirm.Text == \"\" Then";
if ([[self->__txtpassconfirm Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=17170450;
 //BA.debugLineNum = 17170450;BA.debugLine="Msgbox(\"Debe de confirmar su nueva contrseña  pa";
[self->___c Msgbox:@"Debe de confirmar su nueva contrseña  para poder actualizar" :@"Aviso"];
B4IRDebugUtils.currentLine=17170451;
 //BA.debugLineNum = 17170451;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=17170454;
 //BA.debugLineNum = 17170454;BA.debugLine="If txtPassConfirm.Text <> txtPassConfirm.Text The";
if ([[self->__txtpassconfirm Text] isEqual:[self->__txtpassconfirm Text]] == false) { 
B4IRDebugUtils.currentLine=17170455;
 //BA.debugLineNum = 17170455;BA.debugLine="Msgbox(\"Las contrseñas nuevas no coinciden. Por";
[self->___c Msgbox:@"Las contrseñas nuevas no coinciden. Por favor verifique de nuevo" :@"Aviso"];
B4IRDebugUtils.currentLine=17170456;
 //BA.debugLineNum = 17170456;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=17170459;
 //BA.debugLineNum = 17170459;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=17170460;
 //BA.debugLineNum = 17170460;BA.debugLine="json = \"'f_antigua':\"&txtPassAntigua.Text& _ 	\",'";
_json = [@[@"'f_antigua':",[self->__txtpassantigua Text],@",'f_nueva':",[self->__txtnewpass Text],@", 'f_idusuario':",[self.bi NumberToString:@(self->__main->__usersdata /*_typeu**/ ->_idUsuario /*int*/ )]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=17170464;
 //BA.debugLineNum = 17170464;BA.debugLine="Dim changePass As HttpJob";
_changepass = [b4i_httpjob new];
B4IRDebugUtils.currentLine=17170465;
 //BA.debugLineNum = 17170465;BA.debugLine="changePass.Initialize(\"changePass\",Me)";
[_changepass _initialize /*NSString**/ :nil :self.bi :@"changePass" :self];
B4IRDebugUtils.currentLine=17170466;
 //BA.debugLineNum = 17170466;BA.debugLine="changePass.PostString(Main.url&\"puntoventa/change";
[_changepass _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/changePass"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=17170469;
 //BA.debugLineNum = 17170469;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnperfilback_click{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"btnperfilback_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnperfilback_click" :nil]);}
B4IRDebugUtils.currentLine=17039360;
 //BA.debugLineNum = 17039360;BA.debugLine="Sub btnPerfilBack_Click";
B4IRDebugUtils.currentLine=17039361;
 //BA.debugLineNum = 17039361;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=17039362;
 //BA.debugLineNum = 17039362;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=17039363;
 //BA.debugLineNum = 17039363;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnsave_click{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"btnsave_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnsave_click" :nil]);}
NSString* _json = @"";
b4i_httpjob* _actualizar = nil;
B4IRDebugUtils.currentLine=16973824;
 //BA.debugLineNum = 16973824;BA.debugLine="Sub btnSave_Click";
B4IRDebugUtils.currentLine=16973826;
 //BA.debugLineNum = 16973826;BA.debugLine="If txtNombre.Text == \"\" Then";
if ([[self->__txtnombre Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=16973827;
 //BA.debugLineNum = 16973827;BA.debugLine="Msgbox(\"No puede dejar el Nombre vacio\",\"Aviso\")";
[self->___c Msgbox:@"No puede dejar el Nombre vacio" :@"Aviso"];
B4IRDebugUtils.currentLine=16973828;
 //BA.debugLineNum = 16973828;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=16973831;
 //BA.debugLineNum = 16973831;BA.debugLine="If lblemail.Text == \"\" Then";
if ([[self->__lblemail Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=16973832;
 //BA.debugLineNum = 16973832;BA.debugLine="Msgbox(\"No puede dejar el Email vacio\",\"Aviso\")";
[self->___c Msgbox:@"No puede dejar el Email vacio" :@"Aviso"];
B4IRDebugUtils.currentLine=16973833;
 //BA.debugLineNum = 16973833;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=16973836;
 //BA.debugLineNum = 16973836;BA.debugLine="If txttel.Text == \"\" Then";
if ([[self->__txttel Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=16973837;
 //BA.debugLineNum = 16973837;BA.debugLine="Msgbox(\"No puede dejar el Teléfono vacio\",\"Aviso";
[self->___c Msgbox:@"No puede dejar el Teléfono vacio" :@"Aviso"];
B4IRDebugUtils.currentLine=16973838;
 //BA.debugLineNum = 16973838;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=16973841;
 //BA.debugLineNum = 16973841;BA.debugLine="If txtdir.Text == \"\" Then";
if ([[self->__txtdir Text] isEqual:@""]) { 
B4IRDebugUtils.currentLine=16973842;
 //BA.debugLineNum = 16973842;BA.debugLine="Msgbox(\"No puede dejar la Dirección vacia\",\"Avis";
[self->___c Msgbox:@"No puede dejar la Dirección vacia" :@"Aviso"];
B4IRDebugUtils.currentLine=16973843;
 //BA.debugLineNum = 16973843;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=16973847;
 //BA.debugLineNum = 16973847;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=16973848;
 //BA.debugLineNum = 16973848;BA.debugLine="json = \"'f_nombre':\"&txtNombre.Text& _ 	\",'f_emai";
_json = [@[@"'f_nombre':",[self->__txtnombre Text],@",'f_email':",[self->__lblemail Text],@",'f_tel':",[self->__txttel Text],@",'f_direccion':",[self->__txtdir Text],@", 'f_idusuario':",[self.bi NumberToString:@(self->__main->__usersdata /*_typeu**/ ->_idUsuario /*int*/ )]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=16973854;
 //BA.debugLineNum = 16973854;BA.debugLine="Dim actualizar As HttpJob";
_actualizar = [b4i_httpjob new];
B4IRDebugUtils.currentLine=16973855;
 //BA.debugLineNum = 16973855;BA.debugLine="actualizar.Initialize(\"actualizar\",Me)";
[_actualizar _initialize /*NSString**/ :nil :self.bi :@"actualizar" :self];
B4IRDebugUtils.currentLine=16973856;
 //BA.debugLineNum = 16973856;BA.debugLine="actualizar.PostString(Main.url&\"puntoventa/actual";
[_actualizar _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/actualizar"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=16973858;
 //BA.debugLineNum = 16973858;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _buscardatos{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"buscardatos"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"buscardatos" :nil]);}
NSString* _json = @"";
b4i_httpjob* _jobperfil = nil;
B4IRDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub BuscarDatos";
B4IRDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim json As String = \"'f_idusuario':\"&Main.usersD";
_json = [@[@"'f_idusuario':",[self.bi NumberToString:@(self->__main->__usersdata /*_typeu**/ ->_idUsuario /*int*/ )]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=16842755;
 //BA.debugLineNum = 16842755;BA.debugLine="Dim jobperfil As HttpJob";
_jobperfil = [b4i_httpjob new];
B4IRDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="jobperfil.Initialize(\"BuscarPerfil\",Me)";
[_jobperfil _initialize /*NSString**/ :nil :self.bi :@"BuscarPerfil" :self];
B4IRDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="jobperfil.PostString(Main.url&\"puntoventa/perfil\"";
[_jobperfil _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/perfil"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__token /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json = nil;
B4IMap* _mapa = nil;
B4IRDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=16908291;
 //BA.debugLineNum = 16908291;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=16908292;
 //BA.debugLineNum = 16908292;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=16908295;
 //BA.debugLineNum = 16908295;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=16908296;
 //BA.debugLineNum = 16908296;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=16908299;
 //BA.debugLineNum = 16908299;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=16908300;
 //BA.debugLineNum = 16908300;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=16908301;
 //BA.debugLineNum = 16908301;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=16908302;
 //BA.debugLineNum = 16908302;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
[_json Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=16908303;
 //BA.debugLineNum = 16908303;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=16908305;
 //BA.debugLineNum = 16908305;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"BuscarPerfil",@"changePass",@"actualizar"]]) {
case 0: {
B4IRDebugUtils.currentLine=16908309;
 //BA.debugLineNum = 16908309;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=16908310;
 //BA.debugLineNum = 16908310;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=16908311;
 //BA.debugLineNum = 16908311;BA.debugLine="mapa = list.Get(0)";
_mapa = (B4IMap*)([_list Get:(int) (0)]);
B4IRDebugUtils.currentLine=16908313;
 //BA.debugLineNum = 16908313;BA.debugLine="txtNombre.Text = mapa.Get(\"f_nombre\")";
[self->__txtnombre setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]]];
B4IRDebugUtils.currentLine=16908314;
 //BA.debugLineNum = 16908314;BA.debugLine="lblemail.Text = mapa.Get(\"f_email\")";
[self->__lblemail setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_email")]]];
B4IRDebugUtils.currentLine=16908315;
 //BA.debugLineNum = 16908315;BA.debugLine="txttel.Text = mapa.Get(\"f_telefono\")";
[self->__txttel setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_telefono")]]];
B4IRDebugUtils.currentLine=16908316;
 //BA.debugLineNum = 16908316;BA.debugLine="txtdir.Text = mapa.Get(\"f_direccion\")";
[self->__txtdir setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_direccion")]]];
 break; }
case 1: {
B4IRDebugUtils.currentLine=16908320;
 //BA.debugLineNum = 16908320;BA.debugLine="If map.Get(\"f_data\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_data")]]) { 
B4IRDebugUtils.currentLine=16908321;
 //BA.debugLineNum = 16908321;BA.debugLine="hud.ToastMessageShow(\"Contrseña actualizada\",";
[self->__hud ToastMessageShow:@"Contrseña actualizada" :false];
B4IRDebugUtils.currentLine=16908322;
 //BA.debugLineNum = 16908322;BA.debugLine="btnBackChangePass_Click";
[self _btnbackchangepass_click];
B4IRDebugUtils.currentLine=16908324;
 //BA.debugLineNum = 16908324;BA.debugLine="txtPassAntigua.Text = \"\"";
[self->__txtpassantigua setText:@""];
B4IRDebugUtils.currentLine=16908325;
 //BA.debugLineNum = 16908325;BA.debugLine="txtNewPass.Text = \"\"";
[self->__txtnewpass setText:@""];
B4IRDebugUtils.currentLine=16908326;
 //BA.debugLineNum = 16908326;BA.debugLine="txtPassConfirm.Text = \"\"";
[self->__txtpassconfirm setText:@""];
 }else {
B4IRDebugUtils.currentLine=16908329;
 //BA.debugLineNum = 16908329;BA.debugLine="Msgbox(\"La Contraseña introducida no coincide";
[self->___c Msgbox:@"La Contraseña introducida no coincide con la anterior" :@"Error"];
 };
 break; }
case 2: {
B4IRDebugUtils.currentLine=16908334;
 //BA.debugLineNum = 16908334;BA.debugLine="If map.Get(\"f_data\") Then";
if ([self.bi ObjectToBoolean:[_map Get:(NSObject*)(@"f_data")]]) { 
B4IRDebugUtils.currentLine=16908335;
 //BA.debugLineNum = 16908335;BA.debugLine="hud.ToastMessageShow(\"Información actualizada\"";
[self->__hud ToastMessageShow:@"Información actualizada" :false];
B4IRDebugUtils.currentLine=16908336;
 //BA.debugLineNum = 16908336;BA.debugLine="btnPerfilBack_Click";
[self _btnperfilback_click];
B4IRDebugUtils.currentLine=16908338;
 //BA.debugLineNum = 16908338;BA.debugLine="txtNombre.Text = \"\"";
[self->__txtnombre setText:@""];
B4IRDebugUtils.currentLine=16908339;
 //BA.debugLineNum = 16908339;BA.debugLine="lblemail.Text = \"\"";
[self->__lblemail setText:@""];
B4IRDebugUtils.currentLine=16908340;
 //BA.debugLineNum = 16908340;BA.debugLine="txttel.Text = \"\"";
[self->__txttel setText:@""];
B4IRDebugUtils.currentLine=16908341;
 //BA.debugLineNum = 16908341;BA.debugLine="txtdir.Text = \"\"";
[self->__txtdir setText:@""];
 }else {
B4IRDebugUtils.currentLine=16908344;
 //BA.debugLineNum = 16908344;BA.debugLine="Msgbox(\"Hubo un error al actualizar la informa";
[self->___c Msgbox:@"Hubo un error al actualizar la información" :@"Error"];
 };
 break; }
}
;
B4IRDebugUtils.currentLine=16908350;
 //BA.debugLineNum = 16908350;BA.debugLine="End Sub";
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
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"perfil";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="Dim pagePerfil As Page";
self->__pageperfil = [B4IPage new];
B4IRDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="Dim hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="Private btnChangePass As Button";
self->__btnchangepass = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="Private btnPerfilBack As Button";
self->__btnperfilback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="Private btnSave As Button";
self->__btnsave = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="Private lblemail As Label";
self->__lblemail = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="Private PanelEncabezadoUser As Panel";
self->__panelencabezadouser = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="Private txtdir As TextField";
self->__txtdir = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="Private txtNombre As TextField";
self->__txtnombre = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16711694;
 //BA.debugLineNum = 16711694;BA.debugLine="Private txttel As TextField";
self->__txttel = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16711695;
 //BA.debugLineNum = 16711695;BA.debugLine="Private btnBackChangePass As Button";
self->__btnbackchangepass = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=16711696;
 //BA.debugLineNum = 16711696;BA.debugLine="Private btnConfirmChangePass As Button";
self->__btnconfirmchangepass = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=16711697;
 //BA.debugLineNum = 16711697;BA.debugLine="Private txtNewPass As TextField";
self->__txtnewpass = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16711698;
 //BA.debugLineNum = 16711698;BA.debugLine="Private txtPassAntigua As TextField";
self->__txtpassantigua = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16711699;
 //BA.debugLineNum = 16711699;BA.debugLine="Private txtPassConfirm As TextField";
self->__txtpassconfirm = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=16711700;
 //BA.debugLineNum = 16711700;BA.debugLine="Private PanelFondoModalpass As Panel";
self->__panelfondomodalpass = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=16711702;
 //BA.debugLineNum = 16711702;BA.debugLine="End Sub";
return @"";
}
@end