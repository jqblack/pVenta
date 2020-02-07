
#import "b4i_main.h"
#import "b4i_principal.h"
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
    return 14;
}


- (NSString*)  _application_active{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_active"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_active" :nil]);}
B4IRDebugUtils.currentLine=393216;
 //BA.debugLineNum = 393216;BA.debugLine="Private Sub Application_Active";
B4IRDebugUtils.currentLine=393218;
 //BA.debugLineNum = 393218;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_background{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_background"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_background" :nil]);}
B4IRDebugUtils.currentLine=327680;
 //BA.debugLineNum = 327680;BA.debugLine="Private Sub Application_Background";
B4IRDebugUtils.currentLine=327681;
 //BA.debugLineNum = 327681;BA.debugLine="Log(\"Application_Background\")";
[self->___c LogImpl:@"4327681" :@"Application_Background" :0];
B4IRDebugUtils.currentLine=327682;
 //BA.debugLineNum = 327682;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"application_start"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"application_start:" :@[[B4I nilToNSNull:_nav]]]);}
B4IResultSet* _rs = nil;
B4IRDebugUtils.currentLine=65536;
 //BA.debugLineNum = 65536;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
B4IRDebugUtils.currentLine=65538;
 //BA.debugLineNum = 65538;BA.debugLine="If File.Exists(File.DirDocuments, \"db.db\") = Fals";
if ([[self->___c File] Exists:[[self->___c File] DirDocuments] :@"db.db"]==false) { 
B4IRDebugUtils.currentLine=65539;
 //BA.debugLineNum = 65539;BA.debugLine="File.Copy(File.DirAssets, \"db.db\", File.DirDocum";
[[self->___c File] Copy:[[self->___c File] DirAssets] :@"db.db" :[[self->___c File] DirDocuments] :@"db.db"];
 };
B4IRDebugUtils.currentLine=65541;
 //BA.debugLineNum = 65541;BA.debugLine="SQL.Initialize(File.DirDocuments, \"db.db\", False)";
[self->__sql Initialize:[[self->___c File] DirDocuments] :@"db.db" :false];
B4IRDebugUtils.currentLine=65543;
 //BA.debugLineNum = 65543;BA.debugLine="Dim rs As ResultSet = SQL.ExecQuery(\"SELECT * FRO";
_rs = [self->__sql ExecQuery:@"SELECT * FROM t_preferencia"];
B4IRDebugUtils.currentLine=65544;
 //BA.debugLineNum = 65544;BA.debugLine="Do While rs.NextRow";
while ([_rs NextRow]) {
 }
;
B4IRDebugUtils.currentLine=65548;
 //BA.debugLineNum = 65548;BA.debugLine="NavControl = Nav";
self->__navcontrol = _nav;
B4IRDebugUtils.currentLine=65549;
 //BA.debugLineNum = 65549;BA.debugLine="Page1.Initialize(\"Page1\")";
[self->__page1 Initialize:self.bi :@"Page1"];
B4IRDebugUtils.currentLine=65550;
 //BA.debugLineNum = 65550;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self->__page1 RootPanel] setColor:[[self->___c Colors] White]];
B4IRDebugUtils.currentLine=65551;
 //BA.debugLineNum = 65551;BA.debugLine="Page1.RootPanel.LoadLayout(\"frmLogin\")";
[[self->__page1 RootPanel] LoadLayout:@"frmLogin" :self.bi];
B4IRDebugUtils.currentLine=65553;
 //BA.debugLineNum = 65553;BA.debugLine="NavControl.NavigationBarVisible = False";
[self->__navcontrol setNavigationBarVisible:false];
B4IRDebugUtils.currentLine=65554;
 //BA.debugLineNum = 65554;BA.debugLine="NavControl.ShowPage2(Page1,True)";
[self->__navcontrol ShowPage2:(UIViewController*)((self->__page1).object) :true];
B4IRDebugUtils.currentLine=65555;
 //BA.debugLineNum = 65555;BA.debugLine="funcion.SetTitleColor(Nav,Colors.White)";
[self->__funcion _settitlecolor /*NSString**/ :_nav :[[self->___c Colors] White]];
B4IRDebugUtils.currentLine=65557;
 //BA.debugLineNum = 65557;BA.debugLine="crear";
[self _crear];
B4IRDebugUtils.currentLine=65558;
 //BA.debugLineNum = 65558;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crear{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"crear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crear" :nil]);}
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=131072;
 //BA.debugLineNum = 131072;BA.debugLine="Sub crear";
B4IRDebugUtils.currentLine=131073;
 //BA.debugLineNum = 131073;BA.debugLine="txtURL.Alpha = 0";
[self->__txturl setAlpha:(float) (0)];
B4IRDebugUtils.currentLine=131074;
 //BA.debugLineNum = 131074;BA.debugLine="txtURL.Text = url";
[self->__txturl setText:self->__url];
B4IRDebugUtils.currentLine=131075;
 //BA.debugLineNum = 131075;BA.debugLine="Label3.Font = Font.CreateNew2(\"DancingScript-Regu";
[self->__label3 setFont:[[self->___c Font] CreateNew2:@"DancingScript-Regular" :(float) (50)]];
B4IRDebugUtils.currentLine=131077;
 //BA.debugLineNum = 131077;BA.debugLine="Dim no As NativeObject = NavControl";
_no = [B4INativeObject new];
_no.object = (NSObject*)((self->__navcontrol).object);
B4IRDebugUtils.currentLine=131079;
 //BA.debugLineNum = 131079;BA.debugLine="no.GetField(\"navigationBar\").RunMethod(\"setBarTin";
[[_no GetField:@"navigationBar"] RunMethod:@"setBarTintColor:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)([_no ColorToUIColor:[[self->___c Colors] RGB:(int) (244) :(int) (67) :(int) (54)]])]]]];
B4IRDebugUtils.currentLine=131080;
 //BA.debugLineNum = 131080;BA.debugLine="no.GetField(\"navigationBar\").RunMethod(\"setTintCo";
[[_no GetField:@"navigationBar"] RunMethod:@"setTintColor:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)([_no ColorToUIColor:[[self->___c Colors] White]])]]]];
B4IRDebugUtils.currentLine=131084;
 //BA.debugLineNum = 131084;BA.debugLine="Principal.Initialize";
[self->__principal _initialize /*void*/ ];
B4IRDebugUtils.currentLine=131085;
 //BA.debugLineNum = 131085;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnconfiguracion_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnconfiguracion_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnconfiguracion_click" :nil]);}
B4IRDebugUtils.currentLine=851968;
 //BA.debugLineNum = 851968;BA.debugLine="Sub btnConfiguracion_Click";
B4IRDebugUtils.currentLine=851970;
 //BA.debugLineNum = 851970;BA.debugLine="If txtURL.Alpha = 0 Then";
if ([self->__txturl Alpha]==0) { 
B4IRDebugUtils.currentLine=851971;
 //BA.debugLineNum = 851971;BA.debugLine="txtURL.SetAlphaAnimated(300,1)";
[self->__txturl SetAlphaAnimated:(int) (300) :(float) (1)];
 }else {
B4IRDebugUtils.currentLine=851973;
 //BA.debugLineNum = 851973;BA.debugLine="txtURL.SetAlphaAnimated(300,0)";
[self->__txturl SetAlphaAnimated:(int) (300) :(float) (0)];
B4IRDebugUtils.currentLine=851974;
 //BA.debugLineNum = 851974;BA.debugLine="updateURL";
[self _updateurl];
 };
B4IRDebugUtils.currentLine=851977;
 //BA.debugLineNum = 851977;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _updateurl{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"updateurl"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"updateurl" :nil]);}
B4IRDebugUtils.currentLine=917504;
 //BA.debugLineNum = 917504;BA.debugLine="Sub updateURL";
B4IRDebugUtils.currentLine=917505;
 //BA.debugLineNum = 917505;BA.debugLine="SQL.ExecNonQuery2(\"UPDATE t_preferencia SET f_url";
[self->__sql ExecNonQuery2:@"UPDATE t_preferencia SET f_url = ?" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)([[self->__txturl Text] Trim])]]]]];
B4IRDebugUtils.currentLine=917506;
 //BA.debugLineNum = 917506;BA.debugLine="url = txtURL.Text.Trim";
self->__url = [[self->__txturl Text] Trim];
B4IRDebugUtils.currentLine=917507;
 //BA.debugLineNum = 917507;BA.debugLine="hud.ToastMessageShow(\"URL actializado\",False)";
[self->__hud ToastMessageShow:@"URL actializado" :false];
B4IRDebugUtils.currentLine=917508;
 //BA.debugLineNum = 917508;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnlogin_click{
B4IRDebugUtils.currentModule=@"main";
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
B4IRDebugUtils.currentLine=524292;
 //BA.debugLineNum = 524292;BA.debugLine="If  txtContrasena.Text.Trim.Length = 0 Or txtUsua";
if ([[[self->__txtcontrasena Text] Trim] Length]==0 || [[[self->__txtusuario Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=524293;
 //BA.debugLineNum = 524293;BA.debugLine="Msgbox(\"Faltan datos por ingresar\",\"Aviso\")";
[self->___c Msgbox:@"Faltan datos por ingresar" :@"Aviso"];
 }else {
B4IRDebugUtils.currentLine=524296;
 //BA.debugLineNum = 524296;BA.debugLine="hud.ProgressDialogShow(\"Conectando..\")";
[self->__hud ProgressDialogShow:@"Conectando.."];
B4IRDebugUtils.currentLine=524297;
 //BA.debugLineNum = 524297;BA.debugLine="txtUsuario.UserInteractionEnabled = True";
[self->__txtusuario setUserInteractionEnabled:true];
B4IRDebugUtils.currentLine=524298;
 //BA.debugLineNum = 524298;BA.debugLine="Dim url2 As String";
_url2 = @"";
B4IRDebugUtils.currentLine=524299;
 //BA.debugLineNum = 524299;BA.debugLine="Dim dato As String";
_dato = @"";
B4IRDebugUtils.currentLine=524300;
 //BA.debugLineNum = 524300;BA.debugLine="Dim data As String";
_data = @"";
B4IRDebugUtils.currentLine=524301;
 //BA.debugLineNum = 524301;BA.debugLine="Dim  imei As String";
_imei = @"";
B4IRDebugUtils.currentLine=524302;
 //BA.debugLineNum = 524302;BA.debugLine="Dim operadora As String";
_operadora = @"";
B4IRDebugUtils.currentLine=524304;
 //BA.debugLineNum = 524304;BA.debugLine="Dim device As NativeObject";
_device = [B4INativeObject new];
B4IRDebugUtils.currentLine=524305;
 //BA.debugLineNum = 524305;BA.debugLine="device = device.Initialize(\"UIDevice\").RunMethod";
_device = [[_device Initialize:@"UIDevice"] RunMethod:@"currentDevice" :(B4IArray*)(nil)];
B4IRDebugUtils.currentLine=524306;
 //BA.debugLineNum = 524306;BA.debugLine="operadora= App.OSVersion";
_operadora = [self->__app OSVersion];
B4IRDebugUtils.currentLine=524307;
 //BA.debugLineNum = 524307;BA.debugLine="imei = device.GetField(\"identifierForVendor\").As";
_imei = [[_device GetField:@"identifierForVendor"] AsString];
B4IRDebugUtils.currentLine=524309;
 //BA.debugLineNum = 524309;BA.debugLine="data = \"'f_modelo':'','f_banda':'', 'f_operadora";
_data = [@[@"'f_modelo':'','f_banda':'', 'f_operadora': '",_operadora,@"','f_tamano':0,",@"'f_imei':'",_imei,@"','f_usuario':'",[[self->__txtusuario Text] Trim],@"','f_contrasena':'",[[self->__txtcontrasena Text] Trim],@"'"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=524312;
 //BA.debugLineNum = 524312;BA.debugLine="dato=funcion.crearJson(\"none\",data)";
_dato = [self->__funcion _crearjson /*NSString**/ :@"none" :_data];
B4IRDebugUtils.currentLine=524313;
 //BA.debugLineNum = 524313;BA.debugLine="url2 = url & \"login/login/\"";
_url2 = [@[self->__url,@"login/login/"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=524315;
 //BA.debugLineNum = 524315;BA.debugLine="Dim JobLogin As HttpJob";
_joblogin = [b4i_httpjob new];
B4IRDebugUtils.currentLine=524316;
 //BA.debugLineNum = 524316;BA.debugLine="JobLogin.Initialize(\"JobLogin\",Me)";
[_joblogin _initialize /*NSString**/ :nil :self.bi :@"JobLogin" :self];
B4IRDebugUtils.currentLine=524317;
 //BA.debugLineNum = 524317;BA.debugLine="JobLogin.PostString(url2 ,\"json=\"&dato)";
[_joblogin _poststring /*NSString**/ :nil :_url2 :[@[@"json=",_dato] componentsJoinedByString:@""]];
 };
B4IRDebugUtils.currentLine=524319;
 //BA.debugLineNum = 524319;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnregistroclienteregistrarme_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"btnregistroclienteregistrarme_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnregistroclienteregistrarme_click" :nil]);}
B4IJSONGenerator* _json = nil;
B4IMap* _map = nil;
b4i_httpjob* _jobnewuser = nil;
B4IRDebugUtils.currentLine=720896;
 //BA.debugLineNum = 720896;BA.debugLine="Sub btnRegistroClienteRegistrarme_Click";
B4IRDebugUtils.currentLine=720898;
 //BA.debugLineNum = 720898;BA.debugLine="If txtNombre.Text.Trim.Length = 0 Then";
if ([[[self->__txtnombre Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=720899;
 //BA.debugLineNum = 720899;BA.debugLine="Msgbox(\"Introduzca su nombre\",\"Información\")";
[self->___c Msgbox:@"Introduzca su nombre" :@"Información"];
B4IRDebugUtils.currentLine=720900;
 //BA.debugLineNum = 720900;BA.debugLine="txtNombre.RequestFocus";
[self->__txtnombre RequestFocus];
B4IRDebugUtils.currentLine=720901;
 //BA.debugLineNum = 720901;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txttelefono Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=720903;
 //BA.debugLineNum = 720903;BA.debugLine="Msgbox(\"Introduzca su teléfono\",\"Información\")";
[self->___c Msgbox:@"Introduzca su teléfono" :@"Información"];
B4IRDebugUtils.currentLine=720904;
 //BA.debugLineNum = 720904;BA.debugLine="txtTelefono.RequestFocus";
[self->__txttelefono RequestFocus];
B4IRDebugUtils.currentLine=720905;
 //BA.debugLineNum = 720905;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtdireccion Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=720907;
 //BA.debugLineNum = 720907;BA.debugLine="Msgbox(\"Introduzca su dirección\",\"Información\")";
[self->___c Msgbox:@"Introduzca su dirección" :@"Información"];
B4IRDebugUtils.currentLine=720908;
 //BA.debugLineNum = 720908;BA.debugLine="txtDireccion.RequestFocus";
[self->__txtdireccion RequestFocus];
B4IRDebugUtils.currentLine=720909;
 //BA.debugLineNum = 720909;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtusuarioregistro Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=720911;
 //BA.debugLineNum = 720911;BA.debugLine="Msgbox(\"Introduzca su correo electrónico\",\"Infor";
[self->___c Msgbox:@"Introduzca su correo electrónico" :@"Información"];
B4IRDebugUtils.currentLine=720912;
 //BA.debugLineNum = 720912;BA.debugLine="txtUsuarioRegistro.RequestFocus";
[self->__txtusuarioregistro RequestFocus];
B4IRDebugUtils.currentLine=720913;
 //BA.debugLineNum = 720913;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtcontrasenaregistro Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=720915;
 //BA.debugLineNum = 720915;BA.debugLine="Msgbox(\"Introduzca su contraseña\",\"Información\")";
[self->___c Msgbox:@"Introduzca su contraseña" :@"Información"];
B4IRDebugUtils.currentLine=720916;
 //BA.debugLineNum = 720916;BA.debugLine="txtContrasenaRegistro.RequestFocus";
[self->__txtcontrasenaregistro RequestFocus];
B4IRDebugUtils.currentLine=720917;
 //BA.debugLineNum = 720917;BA.debugLine="Return";
if (true) return @"";
 }else if([[[self->__txtcontrasena2 Text] Trim] Length]==0) { 
B4IRDebugUtils.currentLine=720919;
 //BA.debugLineNum = 720919;BA.debugLine="Msgbox(\"Introduzca su contraseña nuevamente\",\"In";
[self->___c Msgbox:@"Introduzca su contraseña nuevamente" :@"Información"];
B4IRDebugUtils.currentLine=720920;
 //BA.debugLineNum = 720920;BA.debugLine="txtContrasena2.RequestFocus";
[self->__txtcontrasena2 RequestFocus];
B4IRDebugUtils.currentLine=720921;
 //BA.debugLineNum = 720921;BA.debugLine="Return";
if (true) return @"";
 }else if([[self->__txtcontrasenaregistro Text] isEqual:[self->__txtcontrasena2 Text]] == false) { 
B4IRDebugUtils.currentLine=720923;
 //BA.debugLineNum = 720923;BA.debugLine="Msgbox(\"Las contraseñas no coinciden.\",\"Informac";
[self->___c Msgbox:@"Las contraseñas no coinciden." :@"Información"];
B4IRDebugUtils.currentLine=720924;
 //BA.debugLineNum = 720924;BA.debugLine="txtContrasenaRegistro.RequestFocus";
[self->__txtcontrasenaregistro RequestFocus];
B4IRDebugUtils.currentLine=720925;
 //BA.debugLineNum = 720925;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=720928;
 //BA.debugLineNum = 720928;BA.debugLine="Dim json As JSONGenerator";
_json = [B4IJSONGenerator new];
B4IRDebugUtils.currentLine=720929;
 //BA.debugLineNum = 720929;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=720930;
 //BA.debugLineNum = 720930;BA.debugLine="map.Initialize";
[_map Initialize];
B4IRDebugUtils.currentLine=720931;
 //BA.debugLineNum = 720931;BA.debugLine="map.Put(\"f_nombre\",txtNombre.Text.Trim)";
[_map Put:(NSObject*)(@"f_nombre") :(NSObject*)([[self->__txtnombre Text] Trim])];
B4IRDebugUtils.currentLine=720932;
 //BA.debugLineNum = 720932;BA.debugLine="map.Put(\"f_telefono\", txtTelefono.Text.Trim)";
[_map Put:(NSObject*)(@"f_telefono") :(NSObject*)([[self->__txttelefono Text] Trim])];
B4IRDebugUtils.currentLine=720933;
 //BA.debugLineNum = 720933;BA.debugLine="map.Put(\"f_direccion\", txtDireccion.Text.Trim)";
[_map Put:(NSObject*)(@"f_direccion") :(NSObject*)([[self->__txtdireccion Text] Trim])];
B4IRDebugUtils.currentLine=720934;
 //BA.debugLineNum = 720934;BA.debugLine="map.Put(\"f_email\",txtUsuarioRegistro.Text.Trim)";
[_map Put:(NSObject*)(@"f_email") :(NSObject*)([[self->__txtusuarioregistro Text] Trim])];
B4IRDebugUtils.currentLine=720935;
 //BA.debugLineNum = 720935;BA.debugLine="map.Put(\"f_password\",txtContrasenaRegistro.Text.T";
[_map Put:(NSObject*)(@"f_password") :(NSObject*)([[self->__txtcontrasenaregistro Text] Trim])];
B4IRDebugUtils.currentLine=720936;
 //BA.debugLineNum = 720936;BA.debugLine="map.Put(\"f_latitud\",\"\")";
[_map Put:(NSObject*)(@"f_latitud") :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=720937;
 //BA.debugLineNum = 720937;BA.debugLine="map.Put(\"f_longitud\",\"\")";
[_map Put:(NSObject*)(@"f_longitud") :(NSObject*)(@"")];
B4IRDebugUtils.currentLine=720938;
 //BA.debugLineNum = 720938;BA.debugLine="map.Put(\"f_idrecord\",0)";
[_map Put:(NSObject*)(@"f_idrecord") :(NSObject*)(@(0))];
B4IRDebugUtils.currentLine=720939;
 //BA.debugLineNum = 720939;BA.debugLine="json.Initialize(map)";
[_json Initialize:_map];
B4IRDebugUtils.currentLine=720941;
 //BA.debugLineNum = 720941;BA.debugLine="Dim JobNewUser As HttpJob";
_jobnewuser = [b4i_httpjob new];
B4IRDebugUtils.currentLine=720942;
 //BA.debugLineNum = 720942;BA.debugLine="JobNewUser.Initialize(\"JobNewUser\",Me)";
[_jobnewuser _initialize /*NSString**/ :nil :self.bi :@"JobNewUser" :self];
B4IRDebugUtils.currentLine=720943;
 //BA.debugLineNum = 720943;BA.debugLine="JobNewUser.Tag = map";
_jobnewuser->__tag /*NSObject**/  = (NSObject*)(_map);
B4IRDebugUtils.currentLine=720944;
 //BA.debugLineNum = 720944;BA.debugLine="JobNewUser.PostString(url&\"ws/set_salvar_usuario\"";
[_jobnewuser _poststring /*NSString**/ :nil :[@[self->__url,@"ws/set_salvar_usuario"] componentsJoinedByString:@""] :[@[@"json=",[self->__funcion _crearjson2 /*NSString**/ :self->__token :[_json ToString]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=720946;
 //BA.debugLineNum = 720946;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IJSONParser* _json = nil;
B4IRDebugUtils.currentLine=589824;
 //BA.debugLineNum = 589824;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=589826;
 //BA.debugLineNum = 589826;BA.debugLine="hud.ProgressDialogHide";
[self->__hud ProgressDialogHide];
B4IRDebugUtils.currentLine=589827;
 //BA.debugLineNum = 589827;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=589828;
 //BA.debugLineNum = 589828;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
[self->___c Msgbox:self->__jobmsj :self->__jobmsjtitle];
B4IRDebugUtils.currentLine=589829;
 //BA.debugLineNum = 589829;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=589832;
 //BA.debugLineNum = 589832;BA.debugLine="If funcion.verificarJob(Job.GetString)=False Then";
if ([self->__funcion _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=589833;
 //BA.debugLineNum = 589833;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=589836;
 //BA.debugLineNum = 589836;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=589837;
 //BA.debugLineNum = 589837;BA.debugLine="Dim json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=589838;
 //BA.debugLineNum = 589838;BA.debugLine="json.Initialize(funcion.base64_Decode(Job.GetStri";
[_json Initialize:[self->__funcion _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=589839;
 //BA.debugLineNum = 589839;BA.debugLine="map = json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=589841;
 //BA.debugLineNum = 589841;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"JobLogin",@"JobNewUser"]]) {
case 0: {
B4IRDebugUtils.currentLine=589844;
 //BA.debugLineNum = 589844;BA.debugLine="isLoggedIn = True";
self->__isloggedin = true;
B4IRDebugUtils.currentLine=589845;
 //BA.debugLineNum = 589845;BA.debugLine="token = map.Get(\"f_key\")";
self->__token = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_key")]];
B4IRDebugUtils.currentLine=589846;
 //BA.debugLineNum = 589846;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=589847;
 //BA.debugLineNum = 589847;BA.debugLine="usersData.idUsuario = map.Get(\"f_idrecord\")";
self->__usersdata->_idUsuario /*int*/  = [self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_idrecord")]].intValue;
B4IRDebugUtils.currentLine=589848;
 //BA.debugLineNum = 589848;BA.debugLine="usersData.nombre = map.Get(\"f_nombre\")";
self->__usersdata->_nombre /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_nombre")]];
B4IRDebugUtils.currentLine=589849;
 //BA.debugLineNum = 589849;BA.debugLine="usersData.longitud = map.Get(\"f_longitud\")";
self->__usersdata->_longitud /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_longitud")]];
B4IRDebugUtils.currentLine=589850;
 //BA.debugLineNum = 589850;BA.debugLine="usersData.latitud = map.Get(\"f_latitud\")";
self->__usersdata->_latitud /*NSString**/  = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_latitud")]];
B4IRDebugUtils.currentLine=589851;
 //BA.debugLineNum = 589851;BA.debugLine="Principal.Initialize";
[self->__principal _initialize /*void*/ ];
 break; }
case 1: {
B4IRDebugUtils.currentLine=589855;
 //BA.debugLineNum = 589855;BA.debugLine="NavControl.NavigationBarVisible = False";
[self->__navcontrol setNavigationBarVisible:false];
B4IRDebugUtils.currentLine=589856;
 //BA.debugLineNum = 589856;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=589857;
 //BA.debugLineNum = 589857;BA.debugLine="map = Job.Tag";
_map = (B4IMap*)(_job->__tag /*NSObject**/ );
B4IRDebugUtils.currentLine=589858;
 //BA.debugLineNum = 589858;BA.debugLine="txtUsuario.Text = map.Get(\"f_email\")";
[self->__txtusuario setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_email")]]];
B4IRDebugUtils.currentLine=589859;
 //BA.debugLineNum = 589859;BA.debugLine="txtContrasena.Text = map.Get(\"f_password\")";
[self->__txtcontrasena setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_password")]]];
B4IRDebugUtils.currentLine=589860;
 //BA.debugLineNum = 589860;BA.debugLine="NavControl.RemoveCurrentPage";
[self->__navcontrol RemoveCurrentPage];
B4IRDebugUtils.currentLine=589862;
 //BA.debugLineNum = 589862;BA.debugLine="btnLogin_Click";
[self _btnlogin_click];
 break; }
}
;
B4IRDebugUtils.currentLine=589866;
 //BA.debugLineNum = 589866;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _lblregistrarme_click{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"lblregistrarme_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"lblregistrarme_click" :nil]);}
B4IRDebugUtils.currentLine=458752;
 //BA.debugLineNum = 458752;BA.debugLine="Sub lblRegistrarme_Click";
B4IRDebugUtils.currentLine=458753;
 //BA.debugLineNum = 458753;BA.debugLine="NavControl.SetNavigationBarVisibleAnimated(True)";
[self->__navcontrol SetNavigationBarVisibleAnimated:true];
B4IRDebugUtils.currentLine=458754;
 //BA.debugLineNum = 458754;BA.debugLine="PageRegistro.Initialize(\"pageRegistroCliente\")";
[self->__pageregistro Initialize:self.bi :@"pageRegistroCliente"];
B4IRDebugUtils.currentLine=458755;
 //BA.debugLineNum = 458755;BA.debugLine="PageRegistro.RootPanel.LoadLayout(\"frmRegistroCli";
[[self->__pageregistro RootPanel] LoadLayout:@"frmRegistroCliente" :self.bi];
B4IRDebugUtils.currentLine=458756;
 //BA.debugLineNum = 458756;BA.debugLine="NavControl.ShowPage(PageRegistro)";
[self->__navcontrol ShowPage:(UIViewController*)((self->__pageregistro).object)];
B4IRDebugUtils.currentLine=458757;
 //BA.debugLineNum = 458757;BA.debugLine="PageRegistro.Tag = PageRegistro.RootPanel.Top";
[self->__pageregistro setTag:(NSObject*)(@([[self->__pageregistro RootPanel] Top]))];
B4IRDebugUtils.currentLine=458758;
 //BA.debugLineNum = 458758;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_appear{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_appear"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"page1_appear" :nil]);}
B4IRDebugUtils.currentLine=196608;
 //BA.debugLineNum = 196608;BA.debugLine="Sub Page1_Appear";
B4IRDebugUtils.currentLine=196609;
 //BA.debugLineNum = 196609;BA.debugLine="NavControl.NavigationBarVisible = False";
[self->__navcontrol setNavigationBarVisible:false];
B4IRDebugUtils.currentLine=196610;
 //BA.debugLineNum = 196610;BA.debugLine="NavControl.ToolBarVisible = False";
[self->__navcontrol setToolBarVisible:false];
B4IRDebugUtils.currentLine=196611;
 //BA.debugLineNum = 196611;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_keyboardstatechanged:(float) _height{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"page1_keyboardstatechanged:" :@[@(_height)]]);}
B4IRDebugUtils.currentLine=655360;
 //BA.debugLineNum = 655360;BA.debugLine="Sub Page1_KeyboardStateChanged (Height As Float)";
B4IRDebugUtils.currentLine=655362;
 //BA.debugLineNum = 655362;BA.debugLine="funcion.KeyboardStateChanged(Height,Page1,-1)";
[self->__funcion _keyboardstatechanged /*NSString**/ :_height :self->__page1 :-1];
B4IRDebugUtils.currentLine=655364;
 //BA.debugLineNum = 655364;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"page1_resize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"page1_resize::" :@[@(_width),@(_height)]]);}
B4IRDebugUtils.currentLine=262144;
 //BA.debugLineNum = 262144;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
B4IRDebugUtils.currentLine=262145;
 //BA.debugLineNum = 262145;BA.debugLine="Log(\"Page1_Resize\")";
[self->___c LogImpl:@"4262145" :@"Page1_Resize" :0];
B4IRDebugUtils.currentLine=262147;
 //BA.debugLineNum = 262147;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _pageregistrocliente_keyboardstatechanged:(float) _height{
B4IRDebugUtils.currentModule=@"main";
if ([B4IDebug shouldDelegate: @"pageregistrocliente_keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"pageregistrocliente_keyboardstatechanged:" :@[@(_height)]]);}
B4IRDebugUtils.currentLine=786432;
 //BA.debugLineNum = 786432;BA.debugLine="Sub pageRegistroCliente_KeyboardStateChanged (Heig";
B4IRDebugUtils.currentLine=786434;
 //BA.debugLineNum = 786434;BA.debugLine="funcion.KeyboardStateChanged(Height,PageRegistro,";
[self->__funcion _keyboardstatechanged /*NSString**/ :_height :self->__pageregistro :[self.bi ObjectToNumber:[self->__pageregistro Tag]].doubleValue];
B4IRDebugUtils.currentLine=786436;
 //BA.debugLineNum = 786436;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];
[[b4i_principal new]initializeModule];
[[b4i_funcion new]initializeModule];
[[b4i_facturacion new]initializeModule];
[[b4i_direcciones new]initializeModule];
[[b4i_reporteordenes new]initializeModule];
[[b4i_httputils2service new]initializeModule];
[[b4i_dateutils new]initializeModule];

}
- (NSString*)  _process_globals{
self->__principal=[b4i_principal new];
self->__funcion=[b4i_funcion new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
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
 //BA.debugLineNum = 6;BA.debugLine="Private PageRegistro As Page";
self->__pageregistro = [B4IPage new];
B4IRDebugUtils.currentLine=8;
 //BA.debugLineNum = 8;BA.debugLine="Private Label3 As Label";
self->__label3 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=9;
 //BA.debugLineNum = 9;BA.debugLine="Private btnLogin As Button";
self->__btnlogin = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=10;
 //BA.debugLineNum = 10;BA.debugLine="Private lblRegistrarme As Label";
self->__lblregistrarme = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=11;
 //BA.debugLineNum = 11;BA.debugLine="Private txtContrasena As TextField";
self->__txtcontrasena = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=12;
 //BA.debugLineNum = 12;BA.debugLine="Private txtUsuario As TextField";
self->__txtusuario = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=13;
 //BA.debugLineNum = 13;BA.debugLine="Private txtURL As TextField";
self->__txturl = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=15;
 //BA.debugLineNum = 15;BA.debugLine="Dim token As String";
self->__token = @"";
B4IRDebugUtils.currentLine=17;
 //BA.debugLineNum = 17;BA.debugLine="Dim tokenPublico As String = \"dbea1e74de894c3a37f";
self->__tokenpublico = @"dbea1e74de894c3a37f4696a10ed6dd7";
B4IRDebugUtils.currentLine=18;
 //BA.debugLineNum = 18;BA.debugLine="Dim  isLoggedIn As Boolean = False";
self->__isloggedin = false;
B4IRDebugUtils.currentLine=19;
 //BA.debugLineNum = 19;BA.debugLine="Dim jobMsj As String = \"No se pudo conectar con e";
self->__jobmsj = @"No se pudo conectar con el servidor. Compruebe su conexión a internet.";
B4IRDebugUtils.currentLine=20;
 //BA.debugLineNum = 20;BA.debugLine="Dim jobMsjTitle As String = \"Problemas de conexió";
self->__jobmsjtitle = @"Problemas de conexión";
B4IRDebugUtils.currentLine=21;
 //BA.debugLineNum = 21;BA.debugLine="Type typeU (idUsuario As Int, nombre As String, l";
;
B4IRDebugUtils.currentLine=22;
 //BA.debugLineNum = 22;BA.debugLine="Dim usersData As typeU";
self->__usersdata = [_typeu new];
B4IRDebugUtils.currentLine=23;
 //BA.debugLineNum = 23;BA.debugLine="Dim SQL As SQL";
self->__sql = [B4ISQL new];
B4IRDebugUtils.currentLine=24;
 //BA.debugLineNum = 24;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=26;
 //BA.debugLineNum = 26;BA.debugLine="Dim url As String = \"http://162.211.121.18:8090/m";
self->__url = @"http://162.211.121.18:8090/menube_app_server_ios/";
B4IRDebugUtils.currentLine=29;
 //BA.debugLineNum = 29;BA.debugLine="Private btnRegistroClienteRegistrarme As Button";
self->__btnregistroclienteregistrarme = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=30;
 //BA.debugLineNum = 30;BA.debugLine="Private txtContrasena2 As TextField";
self->__txtcontrasena2 = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=31;
 //BA.debugLineNum = 31;BA.debugLine="Private txtContrasenaRegistro As TextField";
self->__txtcontrasenaregistro = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=32;
 //BA.debugLineNum = 32;BA.debugLine="Private txtDireccion As TextField";
self->__txtdireccion = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=33;
 //BA.debugLineNum = 33;BA.debugLine="Private txtNombre As TextField";
self->__txtnombre = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=34;
 //BA.debugLineNum = 34;BA.debugLine="Private txtTelefono As TextField";
self->__txttelefono = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=35;
 //BA.debugLineNum = 35;BA.debugLine="Private txtUsuarioRegistro As TextField";
self->__txtusuarioregistro = [B4ITextFieldWrapper new];
B4IRDebugUtils.currentLine=37;
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return @"";
}
@end