
#import "b4i_funcion.h"
#import "b4i_main.h"
#import "b4i_principal.h"
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


@implementation b4i_funcion 


+ (instancetype)new {
    static b4i_funcion* shared = nil;
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


- (NSString*)  _settitlecolor:(B4INavigationControllerWrapper*) _nav :(int) _color{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"settitlecolor"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"settitlecolor::" :@[[B4I nilToNSNull:_nav],@(_color)]]);}
B4INativeObject* _attributes = nil;
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub SetTitleColor(nav As NavigationController, col";
B4IRDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="Dim attributes As NativeObject";
_attributes = [B4INativeObject new];
B4IRDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="attributes = attributes.Initialize(\"B4IAttributed";
_attributes = [[_attributes Initialize:@"B4IAttributedString"] RunMethod:@"createAttributes::" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(([[self->___c Font] CreateNew:(float) (18)]).object)],[B4I nilToNSNull:(NSObject*)([_attributes ColorToUIColor:_color])]]]];
B4IRDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Dim no As NativeObject = nav";
_no = [B4INativeObject new];
_no.object = (NSObject*)((_nav).object);
B4IRDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="no.GetField(\"navigationBar\").RunMethod(\"setTitleT";
[[_no GetField:@"navigationBar"] RunMethod:@"setTitleTextAttributes:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_attributes).object)]]]];
B4IRDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crearjson:(NSString*) _token :(NSString*) _data{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"crearjson"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crearjson::" :@[[B4I nilToNSNull:_token],[B4I nilToNSNull:_data]]]);}
B4IRDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub crearJson(token As String,data As String) As S";
B4IRDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="Return crearJson2(token, \"{\"&data&\"}\")";
if (true) return [self _crearjson2:_token :[@[@"{",_data,@"}"] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _crearjson2:(NSString*) _token :(NSString*) _data{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"crearjson2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"crearjson2::" :@[[B4I nilToNSNull:_token],[B4I nilToNSNull:_data]]]);}
NSString* _json = @"";
iStringUtils* _su = nil;
B4IRDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub crearJson2(token As String,data As String) As";
B4IRDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="json=\"{'f_key':'\"&token&\"','f_data':\"&data&\"}\"";
_json = [@[@"{'f_key':'",_token,@"','f_data':",_data,@"}"] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="Log(json)";
[self->___c LogImpl:@"42621445" :_json :0];
B4IRDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="json = su.EncodeBase64(json.GetBytes(\"UTF8\") )";
_json = [_su EncodeBase64:[_json GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Return json";
if (true) return _json;
B4IRDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="End Sub";
return @"";
}
- (BOOL)  _verificarjob:(NSString*) _job{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"verificarjob"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"verificarjob:" :@[[B4I nilToNSNull:_job]]]).boolValue;}
B4IMap* _map = nil;
B4IJSONParser* _json = nil;
NSString* _confirm = @"";
B4IRDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub verificarJob(job As String) As Boolean";
B4IRDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="job = base64_Decode(job)";
_job = [self _base64_decode:_job];
B4IRDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="Log(job)";
[self->___c LogImpl:@"42883589" :_job :0];
B4IRDebugUtils.currentLine=2883590;
 //BA.debugLineNum = 2883590;BA.debugLine="Dim Json As JSONParser";
_json = [B4IJSONParser new];
B4IRDebugUtils.currentLine=2883591;
 //BA.debugLineNum = 2883591;BA.debugLine="Json.Initialize(job)";
[_json Initialize:_job];
B4IRDebugUtils.currentLine=2883592;
 //BA.debugLineNum = 2883592;BA.debugLine="map=Json.NextObject";
_map = [_json NextObject];
B4IRDebugUtils.currentLine=2883593;
 //BA.debugLineNum = 2883593;BA.debugLine="Dim confirm As String";
_confirm = @"";
B4IRDebugUtils.currentLine=2883594;
 //BA.debugLineNum = 2883594;BA.debugLine="confirm=map.Get(\"f_key\")";
_confirm = [self.bi ObjectToString:[_map Get:(NSObject*)(@"f_key")]];
B4IRDebugUtils.currentLine=2883596;
 //BA.debugLineNum = 2883596;BA.debugLine="If confirm=\"-1\" Then";
if ([_confirm isEqual:@"-1"]) { 
B4IRDebugUtils.currentLine=2883597;
 //BA.debugLineNum = 2883597;BA.debugLine="Msgbox(\"Usuario o contraseña incorrectos.\",\"Info";
[self->___c Msgbox:@"Usuario o contraseña incorrectos." :@"Información"];
B4IRDebugUtils.currentLine=2883598;
 //BA.debugLineNum = 2883598;BA.debugLine="Return False";
if (true) return false;
 }else if([_confirm isEqual:@"-2"]) { 
B4IRDebugUtils.currentLine=2883600;
 //BA.debugLineNum = 2883600;BA.debugLine="Msgbox(\"Este usuario esta desactivado\",\"Informac";
[self->___c Msgbox:@"Este usuario esta desactivado" :@"Información"];
B4IRDebugUtils.currentLine=2883601;
 //BA.debugLineNum = 2883601;BA.debugLine="Return False";
if (true) return false;
 }else if([_confirm isEqual:@"-3"]) { 
B4IRDebugUtils.currentLine=2883603;
 //BA.debugLineNum = 2883603;BA.debugLine="Msgbox(\"Este usuario ya existe\",\"Información\")";
[self->___c Msgbox:@"Este usuario ya existe" :@"Información"];
B4IRDebugUtils.currentLine=2883604;
 //BA.debugLineNum = 2883604;BA.debugLine="Return False";
if (true) return false;
 }else if([_confirm isEqual:@"-4"]) { 
B4IRDebugUtils.currentLine=2883607;
 //BA.debugLineNum = 2883607;BA.debugLine="Msgbox(\"**The print is not finish yet\",\"Informat";
[self->___c Msgbox:@"**The print is not finish yet" :@"Information"];
B4IRDebugUtils.currentLine=2883608;
 //BA.debugLineNum = 2883608;BA.debugLine="Log(job)";
[self->___c LogImpl:@"42883608" :_job :0];
B4IRDebugUtils.currentLine=2883609;
 //BA.debugLineNum = 2883609;BA.debugLine="Return False";
if (true) return false;
 };
B4IRDebugUtils.currentLine=2883612;
 //BA.debugLineNum = 2883612;BA.debugLine="Return True";
if (true) return true;
B4IRDebugUtils.currentLine=2883614;
 //BA.debugLineNum = 2883614;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _base64_decode:(NSString*) _text{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"base64_decode"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base64_decode:" :@[[B4I nilToNSNull:_text]]]);}
iStringUtils* _su = nil;
B4IArray* _b = nil;
NSString* _res = @"";
B4IRDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub base64_Decode(text As String) As String";
B4IRDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="If text = Null Or text.Length = 0 Then";
if (_text== nil || [_text Length]==0) { 
B4IRDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Return \"\"";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="Dim b() As Byte = su.DecodeBase64(text)";
_b = [_su DecodeBase64:_text];
B4IRDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Dim res As String = BytesToString(b , 0, b.Length";
_res = [self->___c BytesToString:_b :(int) (0) :_b.Length :@"UTF8"];
B4IRDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="Return res";
if (true) return _res;
B4IRDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _keyboardstatechanged:(float) _height :(B4IPage*) _page1 :(double) _top{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"keyboardstatechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"keyboardstatechanged:::" :@[@(_height),[B4I nilToNSNull:_page1],@(_top)]]);}
B4IViewWrapper* _v = nil;
B4IRDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub KeyboardStateChanged (Height As Float, Page1 A";
B4IRDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="If Top = -1 Then";
if (_top==-1) { 
B4IRDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="Top = 20";
_top = 20;
 };
B4IRDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="If Height = 0 Then";
if (_height==0) { 
B4IRDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="Page1.RootPanel.SetLayoutAnimated(200,1,Page1.Ro";
[[_page1 RootPanel] SetLayoutAnimated:(int) (200) :(float) (1) :[[_page1 RootPanel] Left] :(float) (_top) :[[_page1 RootPanel] Width] :[[_page1 RootPanel] Height]];
 }else {
B4IRDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="For Each V As View In Page1.RootPanel.GetAllView";
_v = [B4IViewWrapper new];
{
const id<B4IIterable> group7 = [[_page1 RootPanel] GetAllViewsRecursive];
const int groupLen7 = group7.Size
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_v.object = (UIView*)([group7 Get:index7]);
B4IRDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="If IsFirstResponder(V) Then";
if ([self _isfirstresponder:(B4INativeObject*) [B4IObjectWrapper createWrapper:[B4INativeObject new] object:(NSObject*)((_v).object)]]) { 
B4IRDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="Page1.RootPanel.Top = Min(0,Page1.RootPanel.To";
[[_page1 RootPanel] setTop:(float) (fmin(0,[[_page1 RootPanel] Top]-[self->___c PerYToCurrent:(float) (3)]-(_height-([[_page1 RootPanel] Height]-([_v Top]+[_v Height])))))];
 };
 }
};
 };
B4IRDebugUtils.currentLine=3735567;
 //BA.debugLineNum = 3735567;BA.debugLine="End Sub";
return @"";
}
- (B4IBitmap*)  _getimagen:(NSString*) _imagenb64{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"getimagen"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getimagen:" :@[[B4I nilToNSNull:_imagenb64]]]);}
iStringUtils* _su = nil;
B4IArray* _imagen = nil;
B4IInputStream* _inp = nil;
B4IBitmap* _bmp = nil;
B4IRDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub getImagen(imagenB64 As String) As Bitmap";
B4IRDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim imagen() As Byte";
_imagen = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="imagen = su.DecodeBase64(imagenB64)";
_imagen = [_su DecodeBase64:_imagenb64];
B4IRDebugUtils.currentLine=3014660;
 //BA.debugLineNum = 3014660;BA.debugLine="Dim inp As InputStream";
_inp = [B4IInputStream new];
B4IRDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
[_inp InitializeFromBytesArray:_imagen :(int) (0) :_imagen.Length];
B4IRDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="Dim bmp As Bitmap";
_bmp = [B4IBitmap new];
B4IRDebugUtils.currentLine=3014663;
 //BA.debugLineNum = 3014663;BA.debugLine="bmp.Initialize2(inp)";
[_bmp Initialize2:_inp];
B4IRDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="Return bmp";
if (true) return _bmp;
B4IRDebugUtils.currentLine=3014666;
 //BA.debugLineNum = 3014666;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _setbackgroundimage:(B4IButtonWrapper*) _b :(B4IBitmap*) _bmp :(int) _state{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"setbackgroundimage"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"setbackgroundimage:::" :@[[B4I nilToNSNull:_b],[B4I nilToNSNull:_bmp],@(_state)]]);}
B4INativeObject* _no = nil;
B4IRDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub SetBackgroundImage(b As Button, bmp As Bitmap,";
B4IRDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="Dim no As NativeObject = b";
_no = [B4INativeObject new];
_no.object = (NSObject*)((_b).object);
B4IRDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="no.RunMethod(\"setBackgroundImage:forState:\", Arra";
[_no RunMethod:@"setBackgroundImage:forState:" :[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)((_bmp).object)],[B4I nilToNSNull:(NSObject*)(@(_state))]]]];
B4IRDebugUtils.currentLine=2424835;
 //BA.debugLineNum = 2424835;BA.debugLine="End Sub";
return @"";
}
- (B4IMap*)  _recalcular:(double) _precio :(double) _descuento :(double) _cantidad :(double) _tax :(BOOL) _impuestoincluido :(BOOL) _exentoimpuesto{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"recalcular"])
	 {return ((B4IMap*) [B4IDebug delegate:self.bi :@"recalcular::::::" :@[@(_precio),@(_descuento),@(_cantidad),@(_tax),@(_impuestoincluido),@(_exentoimpuesto)]]);}
double _precio_para_mostrar = 0.0;
double _preciodescuento = 0.0;
double _total = 0.0;
B4IMap* _map = nil;
B4IRDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub recalcular(precio As Double , descuento As Dou";
B4IRDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="If exentoImpuesto Then";
if (_exentoimpuesto) { 
B4IRDebugUtils.currentLine=2293763;
 //BA.debugLineNum = 2293763;BA.debugLine="tax = 0";
_tax = 0;
 };
B4IRDebugUtils.currentLine=2293766;
 //BA.debugLineNum = 2293766;BA.debugLine="Dim precio_para_mostrar As Double = precio";
_precio_para_mostrar = _precio;
B4IRDebugUtils.currentLine=2293767;
 //BA.debugLineNum = 2293767;BA.debugLine="If (impuestoIncluido) Then";
if ((_impuestoincluido)) { 
B4IRDebugUtils.currentLine=2293768;
 //BA.debugLineNum = 2293768;BA.debugLine="precio_para_mostrar = precio / ((tax / 100) + 1)";
_precio_para_mostrar = _precio/(double)((_tax/(double)100)+1);
 };
B4IRDebugUtils.currentLine=2293772;
 //BA.debugLineNum = 2293772;BA.debugLine="descuento = get_descuento(precio_para_mostrar, de";
_descuento = [self _get_descuento:_precio_para_mostrar :_descuento];
B4IRDebugUtils.currentLine=2293773;
 //BA.debugLineNum = 2293773;BA.debugLine="Dim precioDescuento As Double = precio_para_mostr";
_preciodescuento = _precio_para_mostrar-_descuento;
B4IRDebugUtils.currentLine=2293775;
 //BA.debugLineNum = 2293775;BA.debugLine="tax = get_tax(precioDescuento, tax, cantidad)  '";
_tax = [self _get_tax:_preciodescuento :_tax :_cantidad];
B4IRDebugUtils.currentLine=2293776;
 //BA.debugLineNum = 2293776;BA.debugLine="Dim total As Double = get_importe(cantidad, preci";
_total = [self _get_importe:_cantidad :_preciodescuento :_tax];
B4IRDebugUtils.currentLine=2293778;
 //BA.debugLineNum = 2293778;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=2293779;
 //BA.debugLineNum = 2293779;BA.debugLine="map.Initialize";
[_map Initialize];
B4IRDebugUtils.currentLine=2293780;
 //BA.debugLineNum = 2293780;BA.debugLine="map.Put(\"f_precio_para_mostrar\",precio_para_mostr";
[_map Put:(NSObject*)(@"f_precio_para_mostrar") :(NSObject*)(@(_precio_para_mostrar))];
B4IRDebugUtils.currentLine=2293781;
 //BA.debugLineNum = 2293781;BA.debugLine="map.Put(\"f_tax\",tax) 'valores[1] = tax;";
[_map Put:(NSObject*)(@"f_tax") :(NSObject*)(@(_tax))];
B4IRDebugUtils.currentLine=2293782;
 //BA.debugLineNum = 2293782;BA.debugLine="map.Put(\"f_descuento\",descuento) ' valores[2] = d";
[_map Put:(NSObject*)(@"f_descuento") :(NSObject*)(@(_descuento))];
B4IRDebugUtils.currentLine=2293783;
 //BA.debugLineNum = 2293783;BA.debugLine="map.Put(\"f_total\",total) 'valores[3] = total;";
[_map Put:(NSObject*)(@"f_total") :(NSObject*)(@(_total))];
B4IRDebugUtils.currentLine=2293786;
 //BA.debugLineNum = 2293786;BA.debugLine="Return map";
if (true) return _map;
B4IRDebugUtils.currentLine=2293787;
 //BA.debugLineNum = 2293787;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _a_la_derecha:(NSString*) _caracter :(NSString*) _parametro :(int) _limite{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"a_la_derecha"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"a_la_derecha:::" :@[[B4I nilToNSNull:_caracter],[B4I nilToNSNull:_parametro],@(_limite)]]);}
NSString* _a = @"";
int _i = 0;
B4IRDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub A_la_Derecha(caracter As String, parametro As";
B4IRDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim a As String";
_a = @"";
B4IRDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
B4IRDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="limite=48";
_limite = (int) (48);
 };
B4IRDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="For i=1 To (limite - parametro.Length)";
{
const int step5 = 1;
const int limit5 = (int) ((_limite-[_parametro Length]));
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
B4IRDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="a=a&caracter";
_a = [@[_a,_caracter] componentsJoinedByString:@""];
 }
};
B4IRDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="parametro=a&parametro";
_parametro = [@[_a,_parametro] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="Return parametro";
if (true) return _parametro;
B4IRDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _addlinea:(NSString*) _parametro :(int) _cantidad{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"addlinea"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"addlinea::" :@[[B4I nilToNSNull:_parametro],@(_cantidad)]]);}
NSString* _linea = @"";
int _i = 0;
B4IRDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub AddLinea(parametro As String,cantidad As Int)";
B4IRDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="Dim linea As String";
_linea = @"";
B4IRDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="If cantidad =0 Then";
if (_cantidad==0) { 
B4IRDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="cantidad=48";
_cantidad = (int) (48);
 };
B4IRDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="For i=1 To cantidad";
{
const int step5 = 1;
const int limit5 = _cantidad;
_i = (int) (1) ;
for (;_i <= limit5 ;_i = _i + step5 ) {
B4IRDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="linea=linea & parametro";
_linea = [@[_linea,_parametro] componentsJoinedByString:@""];
 }
};
B4IRDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="Return linea";
if (true) return _linea;
B4IRDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base64_encode:(NSString*) _text{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"base64_encode"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"base64_encode:" :@[[B4I nilToNSNull:_text]]]);}
iStringUtils* _su = nil;
B4IRDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub base64_Encode(text As String) As String";
B4IRDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Return  su.EncodeBase64(text.GetBytes(\"UTF8\"))";
if (true) return [_su EncodeBase64:[_text GetBytes:@"UTF8"]];
B4IRDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _disableview:(BOOL) _tipo :(B4IPanelWrapper*) _pan{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"disableview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"disableview::" :@[@(_tipo),[B4I nilToNSNull:_pan]]]);}
B4IViewWrapper* _n = nil;
B4IScrollView* _listv = nil;
B4IRDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub DisableView(tipo As Boolean, pan As Panel)";
B4IRDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="For Each n As View In pan";
_n = [B4IViewWrapper new];
{
const id<B4IIterable> group1 = _pan;
const int groupLen1 = group1.Size
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_n.object = (UIView*)([group1 Get:index1]);
B4IRDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Select GetType(n)";
switch ([self.bi switchObjectToInt:[self->___c GetType:(NSObject*)((_n).object)] :@[@"anywheresoftware.b4a.objects.ScrollViewWrapper$MyScrollView",@"anywheresoftware.b4a.BALayout"]]) {
case 0: {
B4IRDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="Dim listV As ScrollView = n";
_listv = [B4IScrollView new];
_listv.object = (UIScrollView*)((_n).object);
B4IRDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="DisableView(tipo,listV.Panel)";
[self _disableview:_tipo :[_listv Panel]];
 break; }
case 1: {
B4IRDebugUtils.currentLine=2555915;
 //BA.debugLineNum = 2555915;BA.debugLine="DisableView(tipo,n)";
[self _disableview:_tipo :(B4IPanelWrapper*) [B4IObjectWrapper createWrapper:[B4IPanelWrapper new] object:(B4IPanelView*)((_n).object)]];
 break; }
}
;
 }
};
B4IRDebugUtils.currentLine=2555920;
 //BA.debugLineNum = 2555920;BA.debugLine="End Sub";
return @"";
}
- (double)  _get_descuento:(double) _precio :(double) _descuento{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"get_descuento"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get_descuento::" :@[@(_precio),@(_descuento)]]).doubleValue;}
double _precio2 = 0.0;
B4IRDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub  get_descuento( precio As Double,  descuento A";
B4IRDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="Dim precio2 As Double";
_precio2 = 0.0;
B4IRDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="precio2 = precio * (descuento / 100)";
_precio2 = _precio*(_descuento/(double)100);
B4IRDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Return precio2";
if (true) return _precio2;
B4IRDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="End Sub";
return 0.0;
}
- (double)  _get_importe:(double) _cantidad :(double) _precio :(double) _tax{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"get_importe"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get_importe:::" :@[@(_cantidad),@(_precio),@(_tax)]]).doubleValue;}
double _dato = 0.0;
B4IRDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub  get_importe( cantidad As Double,  precio As D";
B4IRDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="Dim dato As Double";
_dato = 0.0;
B4IRDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="dato = ((precio * cantidad) + tax)";
_dato = ((_precio*_cantidad)+_tax);
B4IRDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Return  dato";
if (true) return _dato;
B4IRDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="End Sub";
return 0.0;
}
- (double)  _get_tax:(double) _precio :(double) _tax :(double) _cantidad{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"get_tax"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"get_tax:::" :@[@(_precio),@(_tax),@(_cantidad)]]).doubleValue;}
B4IRDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub  get_tax( precio As Double, tax As Double , ca";
B4IRDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="tax = (precio * (tax / 100)) * cantidad";
_tax = (_precio*(_tax/(double)100))*_cantidad;
B4IRDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="Return tax";
if (true) return _tax;
B4IRDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="End Sub";
return 0.0;
}
- (NSString*)  _getbyteimagen:(B4IBitmap*) _bmap{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"getbyteimagen"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getbyteimagen:" :@[[B4I nilToNSNull:_bmap]]]);}
B4IOutputStream* _out = nil;
B4IArray* _data = nil;
iStringUtils* _su = nil;
B4IRDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As String";
B4IRDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim out As OutputStream";
_out = [B4IOutputStream new];
B4IRDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim data() As Byte";
_data = [[B4IArray alloc]initBytes:@[@((int) (0))]];
B4IRDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="out.InitializeToBytesArray(1)";
[_out InitializeToBytesArray:(int) (1)];
B4IRDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
[_bmap WriteToStream:_out :(int) (100) :@"PNG"];
B4IRDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="data = out.ToBytesArray";
_data = [_out ToBytesArray];
B4IRDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="out.Close";
[_out Close];
B4IRDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="Return su.EncodeBase64(data)";
if (true) return [_su EncodeBase64:_data];
B4IRDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _getbyteimagen2:(B4IArray*) _data{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"getbyteimagen2"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"getbyteimagen2:" :@[[B4I nilToNSNull:_data]]]);}
iStringUtils* _su = nil;
B4IRDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub getByteImagen2(data() As Byte) As String";
B4IRDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
B4IRDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Return su.EncodeBase64(data)";
if (true) return [_su EncodeBase64:_data];
B4IRDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return @"";
}
- (float)  _getdevicephysicalsize{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"getdevicephysicalsize"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getdevicephysicalsize" :nil]).floatValue;}
B4ILayoutValues* _lv = nil;
B4IRDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub GetDevicePhysicalSize As Float";
B4IRDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Dim lv As LayoutValues";
_lv = [B4ILayoutValues new];
B4IRDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="lv = GetDeviceLayoutValues";
_lv = [self->___c GetDeviceLayoutValues];
B4IRDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Return Sqrt(Power(lv.Height / lv.Scale / 160, 2";
if (true) return (float) (sqrt(pow([_lv Height]/(double)[_lv Scale]/(double)160,2)+pow([_lv Width]/(double)[_lv Scale]/(double)160,2)));
B4IRDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="End Sub";
return 0.0f;
}
- (double)  _getdiferenciacantidad:(double) _cantidadactual :(double) _cantidadnueva{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"getdiferenciacantidad"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"getdiferenciacantidad::" :@[@(_cantidadactual),@(_cantidadnueva)]]).doubleValue;}
B4IRDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub getDiferenciaCantidad(cantidadActual As Double";
B4IRDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="If cantidadNueva > cantidadActual And cantidadAct";
if (_cantidadnueva>_cantidadactual && _cantidadactual<0) { 
B4IRDebugUtils.currentLine=2359299;
 //BA.debugLineNum = 2359299;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 }else {
B4IRDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="If cantidadActual > 0 Then";
if (_cantidadactual>0) { 
B4IRDebugUtils.currentLine=2359302;
 //BA.debugLineNum = 2359302;BA.debugLine="cantidadActual = cantidadActual*-1";
_cantidadactual = _cantidadactual*-1;
 };
 };
B4IRDebugUtils.currentLine=2359306;
 //BA.debugLineNum = 2359306;BA.debugLine="Return cantidadActual";
if (true) return _cantidadactual;
B4IRDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="End Sub";
return 0.0;
}
- (B4IBitmap*)  _getimagen2:(B4IArray*) _imagen{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"getimagen2"])
	 {return ((B4IBitmap*) [B4IDebug delegate:self.bi :@"getimagen2:" :@[[B4I nilToNSNull:_imagen]]]);}
B4IInputStream* _inp = nil;
B4IBitmap* _bmp = nil;
B4IRDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub getImagen2(imagen() As Byte) As Bitmap";
B4IRDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim inp As InputStream";
_inp = [B4IInputStream new];
B4IRDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="inp.InitializeFromBytesArray(imagen, 0, imagen.Le";
[_inp InitializeFromBytesArray:_imagen :(int) (0) :_imagen.Length];
B4IRDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Dim bmp As Bitmap";
_bmp = [B4IBitmap new];
B4IRDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="bmp.Initialize2(inp)";
[_bmp Initialize2:_inp];
B4IRDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="Return bmp";
if (true) return _bmp;
B4IRDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="End Sub";
return nil;
}
- (BOOL)  _isfirstresponder:(B4INativeObject*) _v{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"isfirstresponder"])
	 {return ((NSNumber*) [B4IDebug delegate:self.bi :@"isfirstresponder:" :@[[B4I nilToNSNull:_v]]]).boolValue;}
B4IRDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub IsFirstResponder(V As NativeObject) As Boolean";
B4IRDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="If V.RunMethod(\"isFirstResponder\",Null) = 1 Then";
if ([[_v RunMethod:@"isFirstResponder" :(B4IArray*)(nil)] isEqual:(NSObject*)(@(1))]) { 
if (true) return true;};
B4IRDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="Return False";
if (true) return false;
B4IRDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="End Sub";
return false;
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__principal=[b4i_principal new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__reporteordenes=[b4i_reporteordenes new];
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=2228228;
 //BA.debugLineNum = 2228228;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _remplace:(NSString*) _text{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"remplace"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"remplace:" :@[[B4I nilToNSNull:_text]]]);}
B4IRDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="Sub remplace(text As String ) As String";
B4IRDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="text=text.Replace(\"'\",\"´´\")";
_text = [_text Replace:@"'" :@"´´"];
B4IRDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Return text";
if (true) return _text;
B4IRDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _titulo:(NSString*) _parametro :(int) _limite{
B4IRDebugUtils.currentModule=@"funcion";
if ([B4IDebug shouldDelegate: @"titulo"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"titulo::" :@[[B4I nilToNSNull:_parametro],@(_limite)]]);}
NSString* _espacio = @"";
NSString* _totals = @"";
double _cal = 0.0;
int _i = 0;
B4IRDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub titulo(parametro As String,limite As Int) As S";
B4IRDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = @"";
B4IRDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim espacio As String : espacio=\" \"";
_espacio = @" ";
B4IRDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim totals As String : totals=\"\"";
_totals = @"";
B4IRDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim totals As String : totals=\"\"";
_totals = @"";
B4IRDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Dim cal As Double";
_cal = 0.0;
B4IRDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="If limite =0 Then";
if (_limite==0) { 
B4IRDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="limite=48";
_limite = (int) (48);
 };
B4IRDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="If parametro.Length<limite Then";
if ([_parametro Length]<_limite) { 
B4IRDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="cal=limite-parametro.Length";
_cal = _limite-[_parametro Length];
B4IRDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="cal= cal/2";
_cal = _cal/(double)2;
B4IRDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="For i=1 To Round(cal)";
{
const int step12 = 1;
const int limit12 = (int) (((double)lrint(_cal)));
_i = (int) (1) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
B4IRDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="totals=espacio& totals";
_totals = [@[_espacio,_totals] componentsJoinedByString:@""];
 }
};
B4IRDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="parametro=totals&parametro";
_parametro = [@[_totals,_parametro] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="Return parametro";
if (true) return _parametro;
 }else {
B4IRDebugUtils.currentLine=3407890;
 //BA.debugLineNum = 3407890;BA.debugLine="Return parametro";
if (true) return _parametro;
 };
B4IRDebugUtils.currentLine=3407893;
 //BA.debugLineNum = 3407893;BA.debugLine="End Sub";
return @"";
}
@end