
#import "b4i_login.h"
#import "b4i_main.h"
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


@implementation b4i_login 


+ (instancetype)new {
    static b4i_login* shared = nil;
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
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
B4IRDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=327683;
 //BA.debugLineNum = 327683;BA.debugLine="If File.Exists(File.DirDocuments, \"db.db\") = Fals";
if ([[self->___c File] Exists:[[self->___c File] DirDocuments] :@"db.db"]==false) { 
B4IRDebugUtils.currentLine=327684;
 //BA.debugLineNum = 327684;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDocum";
[[self->___c File] Copy:[[self->___c File] DirAssets] :@"db.db" :[[self->___c File] DirDocuments] :@"db.db"];
 };
B4IRDebugUtils.currentLine=327686;
 //BA.debugLineNum = 327686;BA.debugLine="SQL.Initialize(File.DirDocuments, \"db.db\", False)";
[self->__sql Initialize:[[self->___c File] DirDocuments] :@"db.db" :false];
B4IRDebugUtils.currentLine=327688;
 //BA.debugLineNum = 327688;BA.debugLine="page.Initialize(\"PageLogin\")";
[self->__page Initialize:self.bi :@"PageLogin"];
B4IRDebugUtils.currentLine=327690;
 //BA.debugLineNum = 327690;BA.debugLine="page.RootPanel.LoadLayout(\"frmLogin\")";
[[self->__page RootPanel] LoadLayout:@"frmLogin" :self.bi];
B4IRDebugUtils.currentLine=327692;
 //BA.debugLineNum = 327692;BA.debugLine="page.Tag = page.RootPanel.Top + 50%y";
[self->__page setTag:(NSObject*)(@([[self->__page RootPanel] Top]+[self->___c PerYToCurrent:(float) (50)]))];
B4IRDebugUtils.currentLine=327694;
 //BA.debugLineNum = 327694;BA.debugLine="Main.NavControl.ShowPage2(page,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__page).object) :true];
B4IRDebugUtils.currentLine=327696;
 //BA.debugLineNum = 327696;BA.debugLine="txtURL.Alpha = 0";
[self->__txturl setAlpha:(float) (0)];
B4IRDebugUtils.currentLine=327697;
 //BA.debugLineNum = 327697;BA.debugLine="txtURL.Text = Main.url";
[self->__txturl setText:self->__main->__url /*NSString**/ ];
B4IRDebugUtils.currentLine=327699;
 //BA.debugLineNum = 327699;BA.debugLine="Main.smc.Tag = \"login\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"login")];
B4IRDebugUtils.currentLine=327709;
 //BA.debugLineNum = 327709;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnconfiguracion_click{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"btnconfiguracion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnconfiguracion_click" :nil]);}
B4IRDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Sub btnConfiguracion_Click";
B4IRDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="If txtURL.Alpha = 0 Then";
if ([self->__txturl Alpha]==0) { 
B4IRDebugUtils.currentLine=393219;
 //BA.debugLineNum = 393219;BA.debugLine="txtURL.SetAlphaAnimated(300,1)";
[self->__txturl SetAlphaAnimated:(int) (300) :(float) (1)];
 }else {
B4IRDebugUtils.currentLine=393221;
 //BA.debugLineNum = 393221;BA.debugLine="txtURL.SetAlphaAnimated(300,0)";
[self->__txturl SetAlphaAnimated:(int) (300) :(float) (0)];
B4IRDebugUtils.currentLine=393222;
 //BA.debugLineNum = 393222;BA.debugLine="updateURL";
[self _updateurl];
 };
B4IRDebugUtils.currentLine=393224;
 //BA.debugLineNum = 393224;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updateurl{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"updateurl"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updateurl" :nil]);}
B4IRDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub updateURL";
B4IRDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE t_preferencia SET f_url";
[self->__sql ExecNonQuery2:@"UPDATE t_preferencia SET f_url = ?" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)([[self->__txturl Text] Trim])]]]]];
B4IRDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="Main.url = txtURL.Text.Trim";
self->__main->__url /*NSString**/  = [[self->__txturl Text] Trim];
B4IRDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="hud.ToastMessageShow(\"URL actializado\",False)";
[self->__hud ToastMessageShow:@"URL actializado" :false];
B4IRDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnlogin_click{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"btnlogin_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnlogin_click" :nil]);}
NSString* _url2 = @"";
NSString* _dato = @"";
NSString* _data = @"";
NSString* _imei = @"";
NSString* _operadora = @"";
B4INativeObject* _device = nil;
b4i_httpjob* _joblogin = nil;
B4IRDebugUtils.currentLine=524288;
 //BA.debugLineNum = 524288;BA.debugLine="Sub btnLogin_Click";
B4IRDebugUtils.currentLine=524291;
 //BA.debugLineNum = 524291;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
if ([[[self->__txtcontrasena Text] Trim] Length]==0 || [[[self->__txtusuario Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
[self->___c Msgbox:@"Faltan datos por ingresar" :@"Aviso"];
 }else {
B4IRDebugUtils.currentLine=524295;
 //BA.debugLineNum = 524295;BA.debugLine="toast.ProgressDialogShow(\"Conectando..\")";
[self->__toast ProgressDialogShow:@"Conectando.."];
B4IRDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="txtUsuario.UserInteractionEnabled = True";
[self->__txtusuario setUserInteractionEnabled:true];
B4IRDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="Dim url2 As String";
_url2 = @"";
B4IRDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim dato As String";
_dato = @"";
B4IRDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Dim data As String";
_data = @"";
B4IRDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Dim  imei As String";
_imei = @"";
B4IRDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim operadora As String";
_operadora = @"";
B4IRDebugUtils.currentLine=524303;
 //BA.debugLineNum = 524303;BA.debugLine="correro = txtUsuario.Text.Trim";
self->__correro = [[self->__txtusuario Text] Trim];
B4IRDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="Dim device As NativeObject";
_device = [B4INativeObject new];
B4IRDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="device = device.Initialize(\"UIDevice\").RunMethod";
_device = [[_device Initialize:@"UIDevice"] RunMethod:@"currentDevice" :(B4IArray*)(nil)];
B4IRDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="operadora= App.OSVersion";
_operadora = [self->__app OSVersion];
B4IRDebugUtils.currentLine=524308;
 //BA.debugLineNum = 524308;BA.debugLine="imei = device.GetField(\"identifierForVendor\").As";
_imei = [[_device GetField:@"identifierForVendor"] AsString];
B4IRDebugUtils.currentLine=524310;
 //BA.debugLineNum = 524310;BA.debugLine="data = \"'f_modelo':'','f_banda':'', 'f_operadora";
_data = [@[@"'f_modelo':'','f_banda':'', 'f_operadora': '",_operadora,@"','f_tamano':0,",@"'f_imei':'",_imei,@"','f_usuario':'",[[self->__txtusuario Text] Trim],@"','f_contrasena':'",[[self->__txtcontrasena Text] Trim],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="dato=funciones.crearJson(\"none\",data)";
_dato = [self->__funciones _crearjson /*NSString**/ :@"none" :_data];
B4IRDebugUtils.currentLine=524314;
 //BA.debugLineNum = 524314;BA.debugLine="url2 = Main.url & \"login/login/\"";
_url2 = [@[self->__main->__url /*NSString**/ ,@"login/login/"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="Dim JobLogin As HttpJob";
_joblogin = [b4i_httpjob new];
B4IRDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
[_joblogin _initialize /*NSString**/ :nil :self.bi :@"JobLogin" :self];
B4IRDebugUtils.currentLine=524318;
 //BA.debugLineNum = 524318;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
[_joblogin _poststring /*NSString**/ :nil :_url2 :[@[@"json=",_dato] componentsJoinedByString:@""]];
 };
B4IRDebugUtils.currentLine=524321;
 //BA.debugLineNum = 524321;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnmenuprincipal_click{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"btnmenuprincipal_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnmenuprincipal_click" :nil]);}
B4IRDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub btnMenuPrincipal_Click";
B4IRDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="If Main.reload Then";
if (self->__main->__reload /*BOOL*/ ) { 
B4IRDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="Main.Initialize";
[self->__main _initialize /*NSString**/ ];
 }else {
B4IRDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=589830;
 //BA.debugLineNum = 589830;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
 };
B4IRDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnregistroclienteback_click{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"btnregistroclienteback_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnregistroclienteback_click" :nil]);}
B4IRDebugUtils.currentLine=983040;
 //BA.debugLineNum = 983040;BA.debugLine="Sub btnRegistroClienteBack_Click";
B4IRDebugUtils.currentLine=983042;
 //BA.debugLineNum = 983042;BA.debugLine="clearRegistro";
[self _clearregistro];
B4IRDebugUtils.currentLine=983043;
 //BA.debugLineNum = 983043;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=983045;
 //BA.debugLineNum = 983045;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clearregistro{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"clearregistro"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clearregistro" :nil]);}
B4IRDebugUtils.currentLine=1048576;
 //BA.debugLineNum = 1048576;BA.debugLine="Sub clearRegistro";
B4IRDebugUtils.currentLine=1048578;
 //BA.debugLineNum = 1048578;BA.debugLine="txtNombre.Text = \"\"";
[self->__txtnombre setText:@""];
B4IRDebugUtils.currentLine=1048579;
 //BA.debugLineNum = 1048579;BA.debugLine="txtTelefono.Text = \"\"";
[self->__txttelefono setText:@""];
B4IRDebugUtils.currentLine=1048580;
 //BA.debugLineNum = 1048580;BA.debugLine="txtDireccion.Text = \"\"";
[self->__txtdireccion setText:@""];
B4IRDebugUtils.currentLine=1048581;
 //BA.debugLineNum = 1048581;BA.debugLine="txtUsuarioRegistro.Text = \"\"";
[self->__txtusuarioregistro setText:@""];
B4IRDebugUtils.currentLine=1048582;
 //BA.debugLineNum = 1048582;BA.debugLine="txtContrasenaRegistro.Text = \"\"";
[self->__txtcontrasenaregistro setText:@""];
B4IRDebugUtils.currentLine=1048583;
 //BA.debugLineNum = 1048583;BA.debugLine="txtContrasena2.Text = \"\"";
[self->__txtcontrasena2 setText:@""];
B4IRDebugUtils.currentLine=1048585;
 //BA.debugLineNum = 1048585;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnregistroclienteregistrarme_click{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"btnregistroclienteregistrarme_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnregistroclienteregistrarme_click" :nil]);}
B4IJSONGenerator* _json = nil;
B4IMap* _map = nil;
b4i_httpjob* _jobnewuser = nil;
B4IRDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
B4IRDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
if ([[[self->__txtnombre Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
[self->___c Msgbox:@"Introduzca su nombre" :@"Información"];
B4IRDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="txtNombre.RequestFocus";
[self->__txtnombre RequestFocus];
B4IRDebugUtils.currentLine=917509;
 //BA.debugLineNum = 917509;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txttelefono Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=917511;
 //BA.debugLineNum = 917511;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
[self->___c Msgbox:@"Introduzca su teléfono" :@"Información"];
B4IRDebugUtils.currentLine=917512;
 //BA.debugLineNum = 917512;BA.debugLine="txtTelefono.RequestFocus";
[self->__txttelefono RequestFocus];
B4IRDebugUtils.currentLine=917513;
 //BA.debugLineNum = 917513;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtdireccion Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=917515;
 //BA.debugLineNum = 917515;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
[self->___c Msgbox:@"Introduzca su dirección" :@"Información"];
B4IRDebugUtils.currentLine=917516;
 //BA.debugLineNum = 917516;BA.debugLine="txtDireccion.RequestFocus";
[self->__txtdireccion RequestFocus];
B4IRDebugUtils.currentLine=917517;
 //BA.debugLineNum = 917517;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtusuarioregistro Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=917519;
 //BA.debugLineNum = 917519;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
[self->___c Msgbox:@"Introduzca su correo electrónico" :@"Información"];
B4IRDebugUtils.currentLine=917520;
 //BA.debugLineNum = 917520;BA.debugLine="txtUsuarioRegistro.RequestFocus";
[self->__txtusuarioregistro RequestFocus];
B4IRDebugUtils.currentLine=917521;
 //BA.debugLineNum = 917521;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtcontrasenaregistro Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=917523;
 //BA.debugLineNum = 917523;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
[self->___c Msgbox:@"Introduzca su contraseña" :@"Información"];
B4IRDebugUtils.currentLine=917524;
 //BA.debugLineNum = 917524;BA.debugLine="txtContrasenaRegistro.RequestFocus";
[self->__txtcontrasenaregistro RequestFocus];
B4IRDebugUtils.currentLine=917525;
 //BA.debugLineNum = 917525;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtcontrasena2 Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=917527;
 //BA.debugLineNum = 917527;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
[self->___c Msgbox:@"Introduzca su contraseña nuevamente" :@"Información"];
B4IRDebugUtils.currentLine=917528;
 //BA.debugLineNum = 917528;BA.debugLine="txtContrasena2.RequestFocus";
[self->__txtcontrasena2 RequestFocus];
B4IRDebugUtils.currentLine=917529;
 //BA.debugLineNum = 917529;BA.debugLine="Return";
if (true) return @"";
 }else if([[self->__txtcontrasenaregistro Text] isEqual:[self->__txtcontrasena2 Text]] == false) { 
B4IRDebugUtils.currentLine=917531;
 //BA.debugLineNum = 917531;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
[self->___c Msgbox:@"Las contraseñas no coinciden." :@"Información"];
B4IRDebugUtils.currentLine=917532;
 //BA.debugLineNum = 917532;BA.debugLine="txtContrasenaRegistro.RequestFocus";
[self->__txtcontrasenaregistro RequestFocus];
B4IRDebugUtils.currentLine=917533;
 //BA.debugLineNum = 917533;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=917536;
 //BA.debugLineNum = 917536;BA.debugLine="Dim json As JSONGenerator";
_json = [B4IJSONGenerator new];
B4IRDebugUtils.currentLine=917537;
 //BA.debugLineNum = 917537;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=917538;
 //BA.debugLineNum = 917538;BA.debugLine="map.Initialize";
[_map Initialize];
B4IRDebugUtils.currentLine=917539;
 //BA.debugLineNum = 917539;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
[_map Put:(NSObject*)(@"f_nombre") :(NSObject*)([[self->__txtnombre Text] Trim])];
B4IRDebugUtils.currentLine=917540;
 //BA.debugLineNum = 917540;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
[_map Put:(NSObject*)(@"f_telefono") :(NSObject*)([[self->__txttelefono Text] Trim])];
B4IRDebugUtils.currentLine=917541;
 //BA.debugLineNum = 917541;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
[_map Put:(NSObject*)(@"f_direccion") :(NSObject*)([[self->__txtdireccion Text] Trim])];
B4IRDebugUtils.currentLine=917542;
 //BA.debugLineNum = 917542;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
[_map Put:(NSObject*)(@"f_email") :(NSObject*)([[self->__txtusuarioregistro Text] Trim])];
B4IRDebugUtils.currentLine=917543;
 //BA.debugLineNum = 917543;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
[_map Put:(NSObject*)(@"f_password") :(NSObject*)([[self->__txtcontrasenaregistro Text] Trim])];
B4IRDebugUtils.currentLine=917544;
 //BA.debugLineNum = 917544;BA.debugLine="map.Put(\"f_latitud\",\"\")";
[_map Put:(NSObject*)(@"f_latitud") :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=917545;
 //BA.debugLineNum = 917545;BA.debugLine="map.Put(\"f_longitud\",\"\")";
[_map Put:(NSObject*)(@"f_longitud") :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=917546;
 //BA.debugLineNum = 917546;BA.debugLine="map.Put(\"f_idrecord\",0)";
[_map Put:(NSObject*)(@"f_idrecord") :(NSObject*)(@(0))];
B4IRDebugUtils.currentLine=917547;
 //BA.debugLineNum = 917547;BA.debugLine="json.Initialize(map)";
[_json Initialize:_map];
B4IRDebugUtils.currentLine=917549;
 //BA.debugLineNum = 917549;BA.debugLine="Dim JobNewUser As HttpJob";
_jobnewuser = [b4i_httpjob new];
B4IRDebugUtils.currentLine=917550;
 //BA.debugLineNum = 917550;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
[_jobnewuser _initialize /*NSString**/ :nil :self.bi :@"JobNewUser" :self];
B4IRDebugUtils.currentLine=917551;
 //BA.debugLineNum = 917551;BA.debugLine="JobNewUser.Tag = map";
_jobnewuser->__tag /*NSObject**/  = (NSObject*)(_map);
B4IRDebugUtils.currentLine=917552;
 //BA.debugLineNum = 917552;BA.debugLine="JobNewUser.PostString(Main.url&\"ws/set_salvar_usu";
[_jobnewuser _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"ws/set_salvar_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson2 /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :[_json ToString]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=917554;
 //BA.debugLineNum = 917554;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IJSONParser* _json = nil;
B4IRDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="toast.ProgressDialogHide";
[self->__toast ProgressDialogHide];
B4IRDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=655365;
 //BA.debugLineNum = 655365;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=655366;
 //BA.debugLineNum = 655366;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=655369;
 //BA.debugLineNum = 655369;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=655370;
 //BA.debugLineNum = 655370;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=655373;
 //BA.debugLineNum = 655373;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=655374;
 //BA.debugLineNum = 655374;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=655375;
 //BA.debugLineNum = 655375;BA.debugLine="json.Initialize(funciones.base64_Decode(Job.GetSt";
[_json Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=655376;
 //BA.debugLineNum = 655376;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=655378;
 //BA.debugLineNum = 655378;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobLogin",@"JobNewUser"]]) {
case 0: {
B4IRDebugUtils.currentLine=655382;
 //BA.debugLineNum = 655382;BA.debugLine="Main.token = map.Get(\"f_key\")";
self->__main->__token /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_key")]];
B4IRDebugUtils.currentLine=655383;
 //BA.debugLineNum = 655383;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=655384;
 //BA.debugLineNum = 655384;BA.debugLine="Main.usersData.idUsuario = map.Get(\"f_idrecord\"";
self->__main->__usersdata /*_typeu**/ ->_idUsuario /*int*/  = [self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_idrecord")]].intValue;
B4IRDebugUtils.currentLine=655385;
 //BA.debugLineNum = 655385;BA.debugLine="Main.usersData.nombre = map.Get(\"f_nombre\")";
self->__main->__usersdata /*_typeu**/ ->_nombre /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_nombre")]];
B4IRDebugUtils.currentLine=655386;
 //BA.debugLineNum = 655386;BA.debugLine="Main.usersData.longitud = map.Get(\"f_longitud\")";
self->__main->__usersdata /*_typeu**/ ->_longitud /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_longitud")]];
B4IRDebugUtils.currentLine=655387;
 //BA.debugLineNum = 655387;BA.debugLine="Main.usersData.latitud = map.Get(\"f_latitud\")";
self->__main->__usersdata /*_typeu**/ ->_latitud /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_latitud")]];
B4IRDebugUtils.currentLine=655389;
 //BA.debugLineNum = 655389;BA.debugLine="Main.isLoged= True";
self->__main->__isloged /*BOOL*/  = true;
B4IRDebugUtils.currentLine=655390;
 //BA.debugLineNum = 655390;BA.debugLine="txtContrasena.Text = \"\"";
[self->__txtcontrasena setText:@""];
B4IRDebugUtils.currentLine=655391;
 //BA.debugLineNum = 655391;BA.debugLine="txtUsuario.Text = \"\"";
[self->__txtusuario setText:@""];
B4IRDebugUtils.currentLine=655392;
 //BA.debugLineNum = 655392;BA.debugLine="Main.Initialize";
[self->__main _initialize /*NSString**/ ];
 break; }
case 1: {
B4IRDebugUtils.currentLine=655396;
 //BA.debugLineNum = 655396;BA.debugLine="map = Job.Tag";
_map = (B4IMap*)(_job->__tag /*NSObject**/ );
B4IRDebugUtils.currentLine=655397;
 //BA.debugLineNum = 655397;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
[self->__txtusuario setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_email")]]];
B4IRDebugUtils.currentLine=655398;
 //BA.debugLineNum = 655398;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
[self->__txtcontrasena setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_password")]]];
B4IRDebugUtils.currentLine=655399;
 //BA.debugLineNum = 655399;BA.debugLine="btnRegistroClienteBack_Click";
[self _btnregistroclienteback_click];
B4IRDebugUtils.currentLine=655400;
 //BA.debugLineNum = 655400;BA.debugLine="btnLogin_Click";
[self _btnlogin_click];
 break; }
}
;
B4IRDebugUtils.currentLine=655404;
 //BA.debugLineNum = 655404;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _lblregistrarme_click{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"lblregistrarme_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"lblregistrarme_click" :nil]);}
B4IRDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub lblRegistrarme_Click";
B4IRDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="pageReg.Initialize(\"pageReg\")";
[self->__pagereg Initialize:self.bi :@"pageReg"];
B4IRDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="pageReg.RootPanel.LoadLayout(\"frmRegistarCliente\"";
[[self->__pagereg RootPanel] LoadLayout:@"frmRegistarCliente" :self.bi];
B4IRDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Main.NavControl.ShowPage(pageReg)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage:(UIViewController*)((self->__pagereg).object)];
B4IRDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="pageReg.Tag = pageReg.RootPanel.Top + 50%y";
[self->__pagereg setTag:(NSObject*)(@([[self->__pagereg RootPanel] Top]+[self->___c PerYToCurrent:(float) (50)]))];
B4IRDebugUtils.currentLine=720906;
 //BA.debugLineNum = 720906;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pagelogin_keyboardstatechanged:(float) _height{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"pagelogin_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pagelogin_keyboardstatechanged:" :@[@(_height)]]);}
B4IRDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub PageLogin_KeyboardStateChanged (Height As Floa";
B4IRDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="funciones.KeyboardStateChanged(Height,page,-1)";
[self->__funciones _keyboardstatechanged /*NSString**/ :_height :self->__page :-1];
B4IRDebugUtils.currentLine=851972;
 //BA.debugLineNum = 851972;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pagereg_keyboardstatechanged:(float) _height{
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"pagereg_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pagereg_keyboardstatechanged:" :@[@(_height)]]);}
B4IRDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub pageReg_KeyboardStateChanged (Height As Float)";
B4IRDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="funciones.KeyboardStateChanged(Height,pageReg,pag";
[self->__funciones _keyboardstatechanged /*NSString**/ :_height :self->__pagereg :[self.bi ObjectToNumber:[self->__pagereg Tag]].doubleValue];
B4IRDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__funciones=[b4i_funciones new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"login";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=262148;
 //BA.debugLineNum = 262148;BA.debugLine="Private btnConfiguracion As Button";
self->__btnconfiguracion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=262149;
 //BA.debugLineNum = 262149;BA.debugLine="Private btnLogin As Button";
self->__btnlogin = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=262150;
 //BA.debugLineNum = 262150;BA.debugLine="Private PanelConfiguracion As Panel";
self->__panelconfiguracion = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=262151;
 //BA.debugLineNum = 262151;BA.debugLine="Dim toast As HUD";
self->__toast = [iHUD new];
B4IRDebugUtils.currentLine=262152;
 //BA.debugLineNum = 262152;BA.debugLine="Private page As Page";
self->__page = [B4IPage new];
B4IRDebugUtils.currentLine=262153;
 //BA.debugLineNum = 262153;BA.debugLine="Dim correro As String";
self->__correro = @"";
B4IRDebugUtils.currentLine=262154;
 //BA.debugLineNum = 262154;BA.debugLine="Dim pageReg As Page";
self->__pagereg = [B4IPage new];
B4IRDebugUtils.currentLine=262155;
 //BA.debugLineNum = 262155;BA.debugLine="Dim SQL As SQL";
self->__sql = [B4ISQL new];
B4IRDebugUtils.currentLine=262156;
 //BA.debugLineNum = 262156;BA.debugLine="Dim hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=262158;
 //BA.debugLineNum = 262158;BA.debugLine="Dim width As Int";
self->__width = 0;
B4IRDebugUtils.currentLine=262159;
 //BA.debugLineNum = 262159;BA.debugLine="Dim smcLog As SideMenuController";
self->__smclog = [B4ISideMenuController new];
B4IRDebugUtils.currentLine=262162;
 //BA.debugLineNum = 262162;BA.debugLine="Private btnMenuPrincipal As Button";
self->__btnmenuprincipal = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=262163;
 //BA.debugLineNum = 262163;BA.debugLine="Private txtUsuario As TextField";
self->__txtusuario = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262164;
 //BA.debugLineNum = 262164;BA.debugLine="Private txtContrasena As TextField";
self->__txtcontrasena = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262166;
 //BA.debugLineNum = 262166;BA.debugLine="Dim App As Application";
self->__app = [B4IApplicationWrapper new];
B4IRDebugUtils.currentLine=262167;
 //BA.debugLineNum = 262167;BA.debugLine="Private lblRegistrarme As Label";
self->__lblregistrarme = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=262168;
 //BA.debugLineNum = 262168;BA.debugLine="Private btnRegistroClienteBack As Button";
self->__btnregistroclienteback = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=262169;
 //BA.debugLineNum = 262169;BA.debugLine="Private btnRegistroClienteRegistrarme As Button";
self->__btnregistroclienteregistrarme = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=262170;
 //BA.debugLineNum = 262170;BA.debugLine="Private Panel1 As Panel";
self->__panel1 = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=262171;
 //BA.debugLineNum = 262171;BA.debugLine="Private txtContrasena2 As TextField";
self->__txtcontrasena2 = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262172;
 //BA.debugLineNum = 262172;BA.debugLine="Private txtContrasenaRegistro As TextField";
self->__txtcontrasenaregistro = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262173;
 //BA.debugLineNum = 262173;BA.debugLine="Private txtDireccion As TextField";
self->__txtdireccion = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262174;
 //BA.debugLineNum = 262174;BA.debugLine="Private txtNombre As TextField";
self->__txtnombre = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262175;
 //BA.debugLineNum = 262175;BA.debugLine="Private txtTelefono As TextField";
self->__txttelefono = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262176;
 //BA.debugLineNum = 262176;BA.debugLine="Private txtUsuarioRegistro As TextField";
self->__txtusuarioregistro = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=262179;
 //BA.debugLineNum = 262179;BA.debugLine="Private txtURL As TextView";
self->__txturl = [B4ITextViewWrapper new];
B4IRDebugUtils.currentLine=262180;
 //BA.debugLineNum = 262180;BA.debugLine="Private btnIniciarSecion As Button";
self->__btniniciarsecion = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=262181;
 //BA.debugLineNum = 262181;BA.debugLine="End Sub";
return @"";
}
@end