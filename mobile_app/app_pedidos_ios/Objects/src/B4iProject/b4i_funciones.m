
#import "b4i_funciones.h"
#import "b4i_main.h"
#import "b4i_login.h"
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


@implementation b4i_funciones 


+ (instancetype)new {
    static b4i_funciones* shared = nil;
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


- (NSString*)  _crearjson:(NSString*) _token :(NSString*) _data{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"crearjson"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crearjson::" :@[[B4I nilToNSNull:_token],[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=1310720;
 //BA.debugLineNum = 1310720;BA.debugLine="Sub crearJson(token As String,data As String) As S";
B4IRDebugUtils.currentLine=1310727;
 //BA.debugLineNum = 1310727;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
if (true) return [self _crearjson2:_token :[@[@"{",_data,@"}"] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1310729;
 //BA.debugLineNum = 1310729;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getimagen:(NSString*) _imagenb64{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"getimagen"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getimagen:" :@[[B4I nilToNSNull:_imagenb64]]]);}
iStringUtils* _su = nil;
B4IArray* _imagen = nil;
B4IInputStream* _inp = nil;
B4IBitmap* _bmp = nil;
B4IRDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Sub getImagen(imagenB64 As String) As Bitmap";
B4IRDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Dim imagen() As Byte";
_imagen = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
_imagen = [_su DecodeBase64:_imagenb64];
B4IRDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="Dim inp As InputStream";
_inp = [B4IInputStream new];
B4IRDebugUtils.currentLine=1507333;
 //BA.debugLineNum = 1507333;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
[_inp InitializeFromBytesArray:_imagen :(int) (0) :_imagen.Length];
B4IRDebugUtils.currentLine=1507334;
 //BA.debugLineNum = 1507334;BA.debugLine="Dim bmp As Bitmap";
_bmp = [B4IBitmap new];
B4IRDebugUtils.currentLine=1507335;
 //BA.debugLineNum = 1507335;BA.debugLine="bmp.Initialize2(inp)";
[_bmp Initialize2:_inp];
B4IRDebugUtils.currentLine=1507337;
 //BA.debugLineNum = 1507337;BA.debugLine="Return bmp";
if (true) return _bmp;
B4IRDebugUtils.currentLine=1507338;
 //BA.debugLineNum = 1507338;BA.debugLine="End Sub";
return nil;
}
- (BOOL)  _verificarjob:(NSString*) _job{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"verificarjob"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"verificarjob:" :@[[B4I nilToNSNull:_job]]]).boolValue;}
B4IMap* _map = nil;
B4IJSONParser* _json = nil;
NSString* _confirm = @"";
B4IRDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub verificarJob(job As String) As Boolean";
B4IRDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="job = base64_Decode(job)";
_job = [self _base64_decode:_job];
B4IRDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=1572869;
 //BA.debugLineNum = 1572869;BA.debugLine="Dim Json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=1572870;
 //BA.debugLineNum = 1572870;BA.debugLine="Json.Initialize(job)";
[_json Initialize:_job];
B4IRDebugUtils.currentLine=1572871;
 //BA.debugLineNum = 1572871;BA.debugLine="map=Json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=1572872;
 //BA.debugLineNum = 1572872;BA.debugLine="Dim confirm As String";
_confirm = @"";
B4IRDebugUtils.currentLine=1572873;
 //BA.debugLineNum = 1572873;BA.debugLine="confirm=map.Get(\"f_key\")";
_confirm = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_key")]];
B4IRDebugUtils.currentLine=1572875;
 //BA.debugLineNum = 1572875;BA.debugLine="If confirm=\"-1\" Then";
if ([_confirm isEqual:@"-1"]) { 
B4IRDebugUtils.currentLine=1572876;
 //BA.debugLineNum = 1572876;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
[self->___c Msgbox:@"Usuario o contraseña incorrectos." :@"Información"];
B4IRDebugUtils.currentLine=1572877;
 //BA.debugLineNum = 1572877;BA.debugLine="Return False";
if (true) return false;
 }else if([_confirm isEqual:@"-2"]) { 
B4IRDebugUtils.currentLine=1572879;
 //BA.debugLineNum = 1572879;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"Informac";
[self->___c Msgbox:@"Este usuario esta desactivado" :@"Información"];
B4IRDebugUtils.currentLine=1572880;
 //BA.debugLineNum = 1572880;BA.debugLine="Return False";
if (true) return false;
 }else if([_confirm isEqual:@"-3"]) { 
B4IRDebugUtils.currentLine=1572882;
 //BA.debugLineNum = 1572882;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
[self->___c Msgbox:@"Este usuario ya existe" :@"Información"];
B4IRDebugUtils.currentLine=1572883;
 //BA.debugLineNum = 1572883;BA.debugLine="Return False";
if (true) return false;
 }else if([_confirm isEqual:@"-4"]) { 
B4IRDebugUtils.currentLine=1572886;
 //BA.debugLineNum = 1572886;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
[self->___c Msgbox:@"**The print is not finish yet" :@"Information"];
B4IRDebugUtils.currentLine=1572887;
 //BA.debugLineNum = 1572887;BA.debugLine="Return False";
if (true) return false;
 };
B4IRDebugUtils.currentLine=1572890;
 //BA.debugLineNum = 1572890;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=1572892;
 //BA.debugLineNum = 1572892;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _base64_decode:(NSString*) _text{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"base64_decode"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base64_decode:" :@[[B4I nilToNSNull:_text]]]);}
iStringUtils* _su = nil;
B4IArray* _b = nil;
NSString* _res = @"";
B4IRDebugUtils.currentLine=1376256;
 //BA.debugLineNum = 1376256;BA.debugLine="Sub base64_Decode(text As String) As String";
B4IRDebugUtils.currentLine=1376257;
 //BA.debugLineNum = 1376257;BA.debugLine="If text = Null Or text.Length = 0 Or text = \"\" Th";
if (_text== nil || [_text Length]==0 || [_text isEqual:@""]) { 
B4IRDebugUtils.currentLine=1376258;
 //BA.debugLineNum = 1376258;BA.debugLine="Return \"\"";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=1376261;
 //BA.debugLineNum = 1376261;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=1376262;
 //BA.debugLineNum = 1376262;BA.debugLine="Dim b() As Byte = su.DecodeBase64(text)";
_b = [_su DecodeBase64:_text];
B4IRDebugUtils.currentLine=1376264;
 //BA.debugLineNum = 1376264;BA.debugLine="Dim res As String = BytesToString(b , 0, b.Length";
_res = [self->___c BytesToString:_b :(int) (0) :_b.Length :@"UTF8"];
B4IRDebugUtils.currentLine=1376266;
 //BA.debugLineNum = 1376266;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=1376268;
 //BA.debugLineNum = 1376268;BA.debugLine="End Sub";
return @"";
}
- (B4IMap*)  _recalcular:(double) _precio :(double) _descuento :(double) _cantidad :(double) _tax :(BOOL) _impuestoincluido :(BOOL) _exentoimpuesto{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"recalcular"])
	 {return ((B4IMap*) [B4IDebug delegate:self.bi :@"recalcular::::::" :@[@(_precio),@(_descuento),@(_cantidad),@(_tax),@(_impuestoincluido),@(_exentoimpuesto)]]);}
double _precio_para_mostrar = 0.0;
double _preciodescuento = 0.0;
double _total = 0.0;
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
B4IRDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="If exentoImpuesto Then";
if (_exentoimpuesto) { 
B4IRDebugUtils.currentLine=1835011;
 //BA.debugLineNum = 1835011;BA.debugLine="tax = 0";
_tax = 0;
 };
B4IRDebugUtils.currentLine=1835014;
 //BA.debugLineNum = 1835014;BA.debugLine="Dim precio_para_mostrar As Double = precio";
_precio_para_mostrar = _precio;
B4IRDebugUtils.currentLine=1835015;
 //BA.debugLineNum = 1835015;BA.debugLine="If (impuestoIncluido) Then";
if ((_impuestoincluido)) { 
B4IRDebugUtils.currentLine=1835016;
 //BA.debugLineNum = 1835016;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
_precio_para_mostrar = _precio/(double)((_tax/(double)100)+1);
 };
B4IRDebugUtils.currentLine=1835020;
 //BA.debugLineNum = 1835020;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
_descuento = [self _get_descuento:_precio_para_mostrar :_descuento];
B4IRDebugUtils.currentLine=1835021;
 //BA.debugLineNum = 1835021;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
_preciodescuento = _precio_para_mostrar-_descuento;
B4IRDebugUtils.currentLine=1835023;
 //BA.debugLineNum = 1835023;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
_tax = [self _get_tax:_preciodescuento :_tax :_cantidad];
B4IRDebugUtils.currentLine=1835024;
 //BA.debugLineNum = 1835024;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
_total = [self _get_importe:_cantidad :_preciodescuento :_tax];
B4IRDebugUtils.currentLine=1835026;
 //BA.debugLineNum = 1835026;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=1835027;
 //BA.debugLineNum = 1835027;BA.debugLine="map.Initialize";
[_map Initialize];
B4IRDebugUtils.currentLine=1835028;
 //BA.debugLineNum = 1835028;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
[_map Put:(NSObject*)(@"f_precio_para_mostrar") :(NSObject*)(@(_precio_para_mostrar))];
B4IRDebugUtils.currentLine=1835029;
 //BA.debugLineNum = 1835029;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
[_map Put:(NSObject*)(@"f_tax") :(NSObject*)(@(_tax))];
B4IRDebugUtils.currentLine=1835030;
 //BA.debugLineNum = 1835030;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
[_map Put:(NSObject*)(@"f_descuento") :(NSObject*)(@(_descuento))];
B4IRDebugUtils.currentLine=1835031;
 //BA.debugLineNum = 1835031;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
[_map Put:(NSObject*)(@"f_total") :(NSObject*)(@(_total))];
B4IRDebugUtils.currentLine=1835034;
 //BA.debugLineNum = 1835034;BA.debugLine="Return map";
if (true) return _map;
B4IRDebugUtils.currentLine=1835035;
 //BA.debugLineNum = 1835035;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _crearjson2:(NSString*) _token :(NSString*) _data{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"crearjson2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crearjson2::" :@[[B4I nilToNSNull:_token],[B4I nilToNSNull:_data]]]);}
NSString* _json = @"";
iStringUtils* _su = nil;
B4IRDebugUtils.currentLine=1245184;
 //BA.debugLineNum = 1245184;BA.debugLine="Sub crearJson2(token As String,data As String) As";
B4IRDebugUtils.currentLine=1245185;
 //BA.debugLineNum = 1245185;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=1245186;
 //BA.debugLineNum = 1245186;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=1245188;
 //BA.debugLineNum = 1245188;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
_json = [@[@"{'f_key':'",_token,@"','f_data':",_data,@"}"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=1245189;
 //BA.debugLineNum = 1245189;BA.debugLine="json = su.EncodeBase64(json.GetBytes(\"UTF8\") )";
_json = [_su EncodeBase64:[_json GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=1245190;
 //BA.debugLineNum = 1245190;BA.debugLine="Return json";
if (true) return _json;
B4IRDebugUtils.currentLine=1245191;
 //BA.debugLineNum = 1245191;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _keyboardstatechanged:(float) _height :(B4IPage*) _page1 :(double) _top{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"keyboardstatechanged:::" :@[@(_height),[B4I nilToNSNull:_page1],@(_top)]]);}
B4IViewWrapper* _v = nil;
B4IRDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub KeyboardStateChanged (Height As Float, Page1 A";
B4IRDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="If Top = -1 Then";
if (_top==-1) { 
B4IRDebugUtils.currentLine=2228227;
 //BA.debugLineNum = 2228227;BA.debugLine="Top = 20";
_top = 20;
 };
B4IRDebugUtils.currentLine=2228230;
 //BA.debugLineNum = 2228230;BA.debugLine="If Height = 0 Then";
if (_height==0) { 
B4IRDebugUtils.currentLine=2228231;
 //BA.debugLineNum = 2228231;BA.debugLine="Page1.RootPanel.SetLayoutAnimated(200,1,Page1.Ro";
[[_page1 RootPanel] SetLayoutAnimated:(int) (200) :(float) (1) :[[_page1 RootPanel] Left] :(float) (_top) :[[_page1 RootPanel] Width] :[[_page1 RootPanel] Height]];
 }else {
B4IRDebugUtils.currentLine=2228233;
 //BA.debugLineNum = 2228233;BA.debugLine="For Each V As View In Page1.RootPanel.GetAllView";
_v = [B4IViewWrapper new];
{
const id<B4IIterable> group7 = [[_page1 RootPanel] GetAllViewsRecursive];
const int groupLen7 = group7.Size
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.object = (UIView*)([group7 Get:index7]);
B4IRDebugUtils.currentLine=2228234;
 //BA.debugLineNum = 2228234;BA.debugLine="If IsFirstResponder(V) Then";
if ([self _isfirstresponder:(B4INativeObject*) [B4IObjectWrapper createWrapper:[B4INativeObject new] object:(NSObject*)((_v).object)]]) { 
B4IRDebugUtils.currentLine=2228235;
 //BA.debugLineNum = 2228235;BA.debugLine="Page1.RootPanel.Top = Min(0,Page1.RootPanel.To";
[[_page1 RootPanel] setTop:(float) (fmin(0,[[_page1 RootPanel] Top]-[self->___c PerYToCurrent:(float) (3)]-(_height-([[_page1 RootPanel] Height]-([_v Top]+[_v Height])))))];
 };
 }
};
 };
B4IRDebugUtils.currentLine=2228239;
 //BA.debugLineNum = 2228239;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base64_encode:(NSString*) _text{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"base64_encode"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base64_encode:" :@[[B4I nilToNSNull:_text]]]);}
iStringUtils* _su = nil;
B4IRDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub base64_Encode(text As String) As String";
B4IRDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Return  su.EncodeBase64(text.GetBytes(\"UTF8\"))";
if (true) return [_su EncodeBase64:[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _createpanelproducto:(B4IMap*) _map{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"createpanelproducto"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createpanelproducto:" :@[[B4I nilToNSNull:_map]]]);}
B4IPanelWrapper* _panelfondopro = nil;
B4IPanelWrapper* _panelimagen = nil;
B4IImageViewWrapper* _imagenpro = nil;
B4IBitmap* _bm = nil;
B4ILabelWrapper* _lbltitulopro = nil;
B4ILabelWrapper* _lblpreciopro = nil;
B4IButtonWrapper* _btnaddpro = nil;
B4IRDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub createPanelProducto(map As Map) As Panel";
B4IRDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = [B4IPanelWrapper new];
_panelimagen = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
[_panelfondopro Initialize:self.bi :@"PanelFondoPro"];
B4IRDebugUtils.currentLine=1638404;
 //BA.debugLineNum = 1638404;BA.debugLine="PanelFondoPro.Width = 152dip";
[_panelfondopro setWidth:(float) (((int) (152)))];
B4IRDebugUtils.currentLine=1638405;
 //BA.debugLineNum = 1638405;BA.debugLine="PanelFondoPro.Height = 185dip";
[_panelfondopro setHeight:(float) (((int) (185)))];
B4IRDebugUtils.currentLine=1638407;
 //BA.debugLineNum = 1638407;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
[_panelfondopro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=1638409;
 //BA.debugLineNum = 1638409;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
[_panelfondopro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=1638411;
 //BA.debugLineNum = 1638411;BA.debugLine="map.Put(\"f_destacado\",True)";
[_map Put:(NSObject*)(@"f_destacado") :(NSObject*)(@(true))];
B4IRDebugUtils.currentLine=1638413;
 //BA.debugLineNum = 1638413;BA.debugLine="PanelImagen.Initialize(\"\")";
[_panelimagen Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1638415;
 //BA.debugLineNum = 1638415;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=1638416;
 //BA.debugLineNum = 1638416;BA.debugLine="imagenPro.Initialize(\"\")";
[_imagenpro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1638418;
 //BA.debugLineNum = 1638418;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=1638420;
 //BA.debugLineNum = 1638420;BA.debugLine="If map.Get(\"f_foto\") <> Null And map.Get(\"f_foto\"";
if ([_map Get:(NSObject*)(@"f_foto")]!= nil && [[_map Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=1638421;
 //BA.debugLineNum = 1638421;BA.debugLine="bm = getImagen(map.Get(\"f_foto\"))";
_bm = [self _getimagen:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=1638424;
 //BA.debugLineNum = 1638424;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=1638427;
 //BA.debugLineNum = 1638427;BA.debugLine="imagenPro.Bitmap = bm";
[_imagenpro setBitmap:_bm];
B4IRDebugUtils.currentLine=1638429;
 //BA.debugLineNum = 1638429;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=1638431;
 //BA.debugLineNum = 1638431;BA.debugLine="PanelImagen.AddView(imagenPro,0dip,0dip,152dip,85";
[_panelimagen AddView:(UIView*)((_imagenpro).object) :(float) (((int) (0))) :(float) (((int) (0))) :(float) (((int) (152))) :(float) (((int) (85)))];
B4IRDebugUtils.currentLine=1638433;
 //BA.debugLineNum = 1638433;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0dip,0dip,Panel";
[_panelfondopro AddView:(UIView*)((_panelimagen).object) :(float) (((int) (0))) :(float) (((int) (0))) :[_panelfondopro Width] :(float) (((int) (85)))];
B4IRDebugUtils.currentLine=1638436;
 //BA.debugLineNum = 1638436;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=1638437;
 //BA.debugLineNum = 1638437;BA.debugLine="lblTituloPro.Initialize(\"\")";
[_lbltitulopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1638438;
 //BA.debugLineNum = 1638438;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
[_lbltitulopro setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=1638439;
 //BA.debugLineNum = 1638439;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
[_lbltitulopro setTextColor:[[self->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=1638440;
 //BA.debugLineNum = 1638440;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
[_lbltitulopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=1638442;
 //BA.debugLineNum = 1638442;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,4dip,90dip,145";
[_panelfondopro AddView:(UIView*)((_lbltitulopro).object) :(float) (((int) (4))) :(float) (((int) (90))) :(float) (((int) (145))) :(float) (((int) (14)))];
B4IRDebugUtils.currentLine=1638444;
 //BA.debugLineNum = 1638444;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=1638445;
 //BA.debugLineNum = 1638445;BA.debugLine="lblPrecioPro.Initialize(\"\")";
[_lblpreciopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1638446;
 //BA.debugLineNum = 1638446;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
[_lblpreciopro setText:[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]];
B4IRDebugUtils.currentLine=1638447;
 //BA.debugLineNum = 1638447;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
[_lblpreciopro setText:[@[@"$ ",[_lblpreciopro Text]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1638448;
 //BA.debugLineNum = 1638448;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
[_lblpreciopro setTextColor:[[self->___c Colors] RGB:(int) (76) :(int) (175) :(int) (80)]];
B4IRDebugUtils.currentLine=1638449;
 //BA.debugLineNum = 1638449;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
[_lblpreciopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=1638451;
 //BA.debugLineNum = 1638451;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,4dip,122dip,50";
[_panelfondopro AddView:(UIView*)((_lblpreciopro).object) :(float) (((int) (4))) :(float) (((int) (122))) :(float) (((int) (50))) :(float) (((int) (12)))];
B4IRDebugUtils.currentLine=1638453;
 //BA.debugLineNum = 1638453;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=1638454;
 //BA.debugLineNum = 1638454;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
[_btnaddpro InitializeCustom:@"btnAddProducto" :self.bi :[[self->___c Colors] RGB:(int) (244) :(int) (67) :(int) (54)] :[[self->___c Colors] RGB:(int) (0) :(int) (0) :(int) (0)]];
B4IRDebugUtils.currentLine=1638455;
 //BA.debugLineNum = 1638455;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
[_btnaddpro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=1638456;
 //BA.debugLineNum = 1638456;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=1638457;
 //BA.debugLineNum = 1638457;BA.debugLine="btnAddPro.Tag = map";
[_btnaddpro setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=1638458;
 //BA.debugLineNum = 1638458;BA.debugLine="btnAddPro.Text = \"Agregar\"";
[_btnaddpro setText:@"Agregar"];
B4IRDebugUtils.currentLine=1638460;
 //BA.debugLineNum = 1638460;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=1638462;
 //BA.debugLineNum = 1638462;BA.debugLine="PanelFondoPro.AddView(btnAddPro,10dip,145dip,138d";
[_panelfondopro AddView:(UIView*)((_btnaddpro).object) :(float) (((int) (10))) :(float) (((int) (145))) :(float) (((int) (138))) :(float) (((int) (25)))];
B4IRDebugUtils.currentLine=1638502;
 //BA.debugLineNum = 1638502;BA.debugLine="PanelFondoPro.Tag = map";
[_panelfondopro setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=1638513;
 //BA.debugLineNum = 1638513;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
B4IRDebugUtils.currentLine=1638515;
 //BA.debugLineNum = 1638515;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createpanelproductoscroll:(B4IMap*) _map :(B4IBitmap*) _imagen{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"createpanelproductoscroll"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createpanelproductoscroll::" :@[[B4I nilToNSNull:_map],[B4I nilToNSNull:_imagen]]]);}
B4IPanelWrapper* _panelfondopro = nil;
B4IPanelWrapper* _panelimagen = nil;
B4IImageViewWrapper* _imagenpro = nil;
B4ILabelWrapper* _lbltitulopro = nil;
B4ILabelWrapper* _lblpreciopro = nil;
B4IButtonWrapper* _btnaddpro = nil;
B4IRDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub createPanelProductoScroll(map As Map, imagen A";
B4IRDebugUtils.currentLine=1769475;
 //BA.debugLineNum = 1769475;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = [B4IPanelWrapper new];
_panelimagen = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
[_panelfondopro Initialize:self.bi :@"PanelFondoPro"];
B4IRDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="PanelFondoPro.Width = 152dip";
[_panelfondopro setWidth:(float) (((int) (152)))];
B4IRDebugUtils.currentLine=1769478;
 //BA.debugLineNum = 1769478;BA.debugLine="PanelFondoPro.Height = 185dip";
[_panelfondopro setHeight:(float) (((int) (185)))];
B4IRDebugUtils.currentLine=1769480;
 //BA.debugLineNum = 1769480;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
[_panelfondopro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=1769482;
 //BA.debugLineNum = 1769482;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
[_panelfondopro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=1769484;
 //BA.debugLineNum = 1769484;BA.debugLine="PanelImagen.Initialize(\"\")";
[_panelimagen Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1769486;
 //BA.debugLineNum = 1769486;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=1769488;
 //BA.debugLineNum = 1769488;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=1769489;
 //BA.debugLineNum = 1769489;BA.debugLine="imagenPro.Initialize(\"\")";
[_imagenpro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1769491;
 //BA.debugLineNum = 1769491;BA.debugLine="imagenPro.Bitmap = imagen";
[_imagenpro setBitmap:_imagen];
B4IRDebugUtils.currentLine=1769493;
 //BA.debugLineNum = 1769493;BA.debugLine="map.Put(\"f_foto\",imagen)";
[_map Put:(NSObject*)(@"f_foto") :(NSObject*)((_imagen).object)];
B4IRDebugUtils.currentLine=1769495;
 //BA.debugLineNum = 1769495;BA.debugLine="map.Put(\"f_destacado\",False)";
[_map Put:(NSObject*)(@"f_destacado") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=1769498;
 //BA.debugLineNum = 1769498;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.1) :true];
B4IRDebugUtils.currentLine=1769500;
 //BA.debugLineNum = 1769500;BA.debugLine="PanelImagen.AddView(imagenPro,0dip,0dip,152dip,85";
[_panelimagen AddView:(UIView*)((_imagenpro).object) :(float) (((int) (0))) :(float) (((int) (0))) :(float) (((int) (152))) :(float) (((int) (85)))];
B4IRDebugUtils.currentLine=1769502;
 //BA.debugLineNum = 1769502;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0dip,0dip,Panel";
[_panelfondopro AddView:(UIView*)((_panelimagen).object) :(float) (((int) (0))) :(float) (((int) (0))) :[_panelfondopro Width] :(float) (((int) (85)))];
B4IRDebugUtils.currentLine=1769504;
 //BA.debugLineNum = 1769504;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=1769505;
 //BA.debugLineNum = 1769505;BA.debugLine="lblTituloPro.Initialize(\"\")";
[_lbltitulopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1769506;
 //BA.debugLineNum = 1769506;BA.debugLine="lblTituloPro.Text = map.Get(\"f_descripcion\")";
[_lbltitulopro setText:[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=1769507;
 //BA.debugLineNum = 1769507;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
[_lbltitulopro setTextColor:[[self->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=1769508;
 //BA.debugLineNum = 1769508;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
[_lbltitulopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=1769511;
 //BA.debugLineNum = 1769511;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,4dip,90dip,145";
[_panelfondopro AddView:(UIView*)((_lbltitulopro).object) :(float) (((int) (4))) :(float) (((int) (90))) :(float) (((int) (145))) :(float) (((int) (14)))];
B4IRDebugUtils.currentLine=1769513;
 //BA.debugLineNum = 1769513;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=1769514;
 //BA.debugLineNum = 1769514;BA.debugLine="lblPrecioPro.Initialize(\"\")";
[_lblpreciopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1769515;
 //BA.debugLineNum = 1769515;BA.debugLine="lblPrecioPro.Text = NumberFormat(map.Get(\"f_preci";
[_lblpreciopro setText:[self->___c NumberFormat:[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]];
B4IRDebugUtils.currentLine=1769516;
 //BA.debugLineNum = 1769516;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
[_lblpreciopro setText:[@[@"$ ",[_lblpreciopro Text]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=1769517;
 //BA.debugLineNum = 1769517;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
[_lblpreciopro setTextColor:[[self->___c Colors] RGB:(int) (76) :(int) (175) :(int) (80)]];
B4IRDebugUtils.currentLine=1769518;
 //BA.debugLineNum = 1769518;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
[_lblpreciopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=1769520;
 //BA.debugLineNum = 1769520;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,4dip,122dip,50";
[_panelfondopro AddView:(UIView*)((_lblpreciopro).object) :(float) (((int) (4))) :(float) (((int) (122))) :(float) (((int) (50))) :(float) (((int) (12)))];
B4IRDebugUtils.currentLine=1769522;
 //BA.debugLineNum = 1769522;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=1769523;
 //BA.debugLineNum = 1769523;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
[_btnaddpro InitializeCustom:@"btnAddProducto" :self.bi :[[self->___c Colors] RGB:(int) (244) :(int) (67) :(int) (54)] :[[self->___c Colors] RGB:(int) (0) :(int) (0) :(int) (0)]];
B4IRDebugUtils.currentLine=1769524;
 //BA.debugLineNum = 1769524;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
[_btnaddpro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=1769525;
 //BA.debugLineNum = 1769525;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=1769526;
 //BA.debugLineNum = 1769526;BA.debugLine="btnAddPro.Tag = map";
[_btnaddpro setTag:(NSObject*)(_map)];
B4IRDebugUtils.currentLine=1769527;
 //BA.debugLineNum = 1769527;BA.debugLine="btnAddPro.Text = \"Agregar\"";
[_btnaddpro setText:@"Agregar"];
B4IRDebugUtils.currentLine=1769529;
 //BA.debugLineNum = 1769529;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=1769531;
 //BA.debugLineNum = 1769531;BA.debugLine="PanelFondoPro.AddView(btnAddPro,10dip,145dip,138d";
[_panelfondopro AddView:(UIView*)((_btnaddpro).object) :(float) (((int) (10))) :(float) (((int) (145))) :(float) (((int) (138))) :(float) (((int) (25)))];
B4IRDebugUtils.currentLine=1769580;
 //BA.debugLineNum = 1769580;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
B4IRDebugUtils.currentLine=1769582;
 //BA.debugLineNum = 1769582;BA.debugLine="End Sub";
return nil;
}
- (double)  _get_descuento:(double) _precio :(double) _descuento{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"get_descuento"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get_descuento::" :@[@(_precio),@(_descuento)]]).doubleValue;}
double _precio2 = 0.0;
B4IRDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
B4IRDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="Dim precio2 As Double";
_precio2 = 0.0;
B4IRDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="precio2 = precio * (descuento / 100)";
_precio2 = _precio*(_descuento/(double)100);
B4IRDebugUtils.currentLine=1900547;
 //BA.debugLineNum = 1900547;BA.debugLine="Return precio2";
if (true) return _precio2;
B4IRDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="End Sub";
return 0.0;
}
- (double)  _get_importe:(double) _cantidad :(double) _precio :(double) _tax{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"get_importe"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get_importe:::" :@[@(_cantidad),@(_precio),@(_tax)]]).doubleValue;}
double _dato = 0.0;
B4IRDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
B4IRDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="Dim dato As Double";
_dato = 0.0;
B4IRDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="dato = ((precio * cantidad) + tax)";
_dato = ((_precio*_cantidad)+_tax);
B4IRDebugUtils.currentLine=2031619;
 //BA.debugLineNum = 2031619;BA.debugLine="Return  dato";
if (true) return _dato;
B4IRDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="End Sub";
return 0.0;
}
- (double)  _get_tax:(double) _precio :(double) _tax :(double) _cantidad{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"get_tax"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get_tax:::" :@[@(_precio),@(_tax),@(_cantidad)]]).doubleValue;}
B4IRDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
B4IRDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
_tax = (_precio*(_tax/(double)100))*_cantidad;
B4IRDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Return tax";
if (true) return _tax;
B4IRDebugUtils.currentLine=1966083;
 //BA.debugLineNum = 1966083;BA.debugLine="End Sub";
return 0.0;
}
- (NSString*)  _getdecimal:(double) _n{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"getdecimal"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getdecimal:" :@[@(_n)]]);}
NSString* _numero = @"";
NSString* _punto = @"";
B4IRDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub getDecimal(n As Double) As String";
B4IRDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="If IsNumber(n) = False Then";
if ([self->___c IsNumber:[self.bi NumberToString:@(_n)]]==false) { 
B4IRDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="Return n";
if (true) return [self.bi NumberToString:@(_n)];
 };
B4IRDebugUtils.currentLine=2097158;
 //BA.debugLineNum = 2097158;BA.debugLine="Dim numero, punto As String";
_numero = @"";
_punto = @"";
B4IRDebugUtils.currentLine=2097161;
 //BA.debugLineNum = 2097161;BA.debugLine="If numero>n Then";
if ([self.bi ObjectToNumber:_numero].doubleValue>_n) { 
B4IRDebugUtils.currentLine=2097162;
 //BA.debugLineNum = 2097162;BA.debugLine="numero=numero-1";
_numero = [self.bi NumberToString:@([self.bi ObjectToNumber:_numero].doubleValue-1)];
 };
B4IRDebugUtils.currentLine=2097165;
 //BA.debugLineNum = 2097165;BA.debugLine="If (n-numero) > 0 Then";
if ((_n-[self.bi ObjectToNumber:_numero].doubleValue)>0) { 
B4IRDebugUtils.currentLine=2097166;
 //BA.debugLineNum = 2097166;BA.debugLine="punto = n";
_punto = [self.bi NumberToString:@(_n)];
B4IRDebugUtils.currentLine=2097167;
 //BA.debugLineNum = 2097167;BA.debugLine="If punto.SubString(punto.IndexOf(\".\")+1).Length<";
if ([[_punto SubString:(int) ([_punto IndexOf:@"."]+1)] Length]<=1) { 
B4IRDebugUtils.currentLine=2097168;
 //BA.debugLineNum = 2097168;BA.debugLine="punto= punto&\"0\"";
_punto = [@[_punto,@"0"] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=2097170;
 //BA.debugLineNum = 2097170;BA.debugLine="Return punto";
if (true) return _punto;
 }else {
B4IRDebugUtils.currentLine=2097172;
 //BA.debugLineNum = 2097172;BA.debugLine="Return numero&\".00\"";
if (true) return [@[_numero,@".00"] componentsJoinedByString:@""];
 };
B4IRDebugUtils.currentLine=2097174;
 //BA.debugLineNum = 2097174;BA.debugLine="End Sub";
return @"";
}
- (double)  _getdiferenciacantidad:(double) _cantidadactual :(double) _cantidadnueva{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"getdiferenciacantidad"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getdiferenciacantidad::" :@[@(_cantidadactual),@(_cantidadnueva)]]).doubleValue;}
B4IRDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
B4IRDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
if (_cantidadnueva>_cantidadactual && _cantidadactual<0) { 
B4IRDebugUtils.currentLine=2162691;
 //BA.debugLineNum = 2162691;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 }else {
B4IRDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="If cantidadActual > 0 Then";
if (_cantidadactual>0) { 
B4IRDebugUtils.currentLine=2162694;
 //BA.debugLineNum = 2162694;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 };
 };
B4IRDebugUtils.currentLine=2162698;
 //BA.debugLineNum = 2162698;BA.debugLine="Return cantidadActual";
if (true) return _cantidadactual;
B4IRDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="End Sub";
return 0.0;
}
- (BOOL)  _isfirstresponder:(B4INativeObject*) _v{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"isfirstresponder"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"isfirstresponder:" :@[[B4I nilToNSNull:_v]]]).boolValue;}
B4IRDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub IsFirstResponder(V As NativeObject) As Boolean";
B4IRDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="If V.RunMethod(\"isFirstResponder\",Null) = 1 Then";
if ([[_v RunMethod:@"isFirstResponder" :(B4IArray*)(nil)] isEqual:(NSObject*)(@(1))]) { 
if (true) return true;};
B4IRDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="Return False";
if (true) return false;
B4IRDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__categoria=[b4i_categoria new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=1114112;
 //BA.debugLineNum = 1114112;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=1114116;
 //BA.debugLineNum = 1114116;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _resizeimage:(B4IBitmap*) _image :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"resizeimage"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"resizeimage:::" :@[[B4I nilToNSNull:_image],@(_width),@(_height)]]);}
B4ICanvas* _photocanvas = nil;
B4IPanelWrapper* _photopanel = nil;
B4IImageViewWrapper* _photoview = nil;
B4IBitmap* _newimage = nil;
B4IRDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub ResizeImage (Image As Bitmap, Width As Int, He";
B4IRDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="Dim PhotoCanvas As Canvas";
_photocanvas = [B4ICanvas new];
B4IRDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Dim PhotoPanel As Panel";
_photopanel = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=1703939;
 //BA.debugLineNum = 1703939;BA.debugLine="Dim PhotoView As ImageView";
_photoview = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Dim NewImage As Bitmap";
_newimage = [B4IBitmap new];
B4IRDebugUtils.currentLine=1703942;
 //BA.debugLineNum = 1703942;BA.debugLine="PhotoPanel.Initialize(\"\")";
[_photopanel Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1703943;
 //BA.debugLineNum = 1703943;BA.debugLine="PhotoPanel.Width = Width / 2";
[_photopanel setWidth:(float) (_width/(double)2)];
B4IRDebugUtils.currentLine=1703944;
 //BA.debugLineNum = 1703944;BA.debugLine="PhotoPanel.Height = Height / 2";
[_photopanel setHeight:(float) (_height/(double)2)];
B4IRDebugUtils.currentLine=1703946;
 //BA.debugLineNum = 1703946;BA.debugLine="PhotoView.Initialize(\"\")";
[_photoview Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1703947;
 //BA.debugLineNum = 1703947;BA.debugLine="PhotoView.Bitmap = Image";
[_photoview setBitmap:_image];
B4IRDebugUtils.currentLine=1703949;
 //BA.debugLineNum = 1703949;BA.debugLine="PhotoPanel.AddView(PhotoView,0,0,Width / 2,Height";
[_photopanel AddView:(UIView*)((_photoview).object) :(float) (0) :(float) (0) :(float) (_width/(double)2) :(float) (_height/(double)2)];
B4IRDebugUtils.currentLine=1703951;
 //BA.debugLineNum = 1703951;BA.debugLine="PhotoCanvas.Initialize(PhotoPanel)";
[_photocanvas Initialize:(B4IViewWrapper*) [B4IObjectWrapper createWrapper:[B4IViewWrapper new] object:(UIView*)((_photopanel).object)]];
B4IRDebugUtils.currentLine=1703952;
 //BA.debugLineNum = 1703952;BA.debugLine="NewImage = PhotoCanvas.CreateBitmap";
_newimage = [_photocanvas CreateBitmap];
B4IRDebugUtils.currentLine=1703954;
 //BA.debugLineNum = 1703954;BA.debugLine="Return NewImage";
if (true) return _newimage;
B4IRDebugUtils.currentLine=1703955;
 //BA.debugLineNum = 1703955;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _setpaddingtext:(B4ITextFieldWrapper*) _tf :(float) _padding{
B4IRDebugUtils.currentModule=@"funciones";
if ([B4IDebug shouldDelegate: @"setpaddingtext"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setpaddingtext::" :@[[B4I nilToNSNull:_tf],@(_padding)]]);}
B4IPanelWrapper* _pnl = nil;
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=1179648;
 //BA.debugLineNum = 1179648;BA.debugLine="Sub SetPaddingText(tf As TextField, Padding As Flo";
B4IRDebugUtils.currentLine=1179649;
 //BA.debugLineNum = 1179649;BA.debugLine="Dim pnl As Panel";
_pnl = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=1179650;
 //BA.debugLineNum = 1179650;BA.debugLine="pnl.Initialize(\"\")";
[_pnl Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=1179651;
 //BA.debugLineNum = 1179651;BA.debugLine="pnl.SetLayoutAnimated(0, 1, 0, 0, Padding, tf.Hei";
[_pnl SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :_padding :[_tf Height]];
B4IRDebugUtils.currentLine=1179652;
 //BA.debugLineNum = 1179652;BA.debugLine="Dim no As NativeObject = tf";
_no = [B4INativeObject new];
_no.object = (NSObject*)((_tf).object);
B4IRDebugUtils.currentLine=1179653;
 //BA.debugLineNum = 1179653;BA.debugLine="no.SetField(\"leftView\", pnl)";
[_no SetField:@"leftView" :(NSObject*)((_pnl).object)];
B4IRDebugUtils.currentLine=1179654;
 //BA.debugLineNum = 1179654;BA.debugLine="no.SetField(\"leftViewMode\", 3)";
[_no SetField:@"leftViewMode" :(NSObject*)(@(3))];
B4IRDebugUtils.currentLine=1179655;
 //BA.debugLineNum = 1179655;BA.debugLine="End Sub";
return @"";
}
@end