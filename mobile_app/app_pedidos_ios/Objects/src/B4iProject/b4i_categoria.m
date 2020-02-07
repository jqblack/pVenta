
#import "b4i_categoria.h"
#import "b4i_main.h"
#import "b4i_login.h"
#import "b4i_funciones.h"
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


@implementation b4i_categoria 


+ (instancetype)new {
    static b4i_categoria* shared = nil;
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
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"initialize"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"initialize" :nil]);}
b4i_httpjob* _jobcategoria = nil;
B4IRDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub Initialize";
B4IRDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="pageCat.Initialize(\"PageCategoria\")";
[self->__pagecat Initialize:self.bi :@"PageCategoria"];
B4IRDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="pageCat.RootPanel.LoadLayout(\"frmCategoria\")";
[[self->__pagecat RootPanel] LoadLayout:@"frmCategoria" :self.bi];
B4IRDebugUtils.currentLine=2424838;
 //BA.debugLineNum = 2424838;BA.debugLine="listaCat.Initialize(\"lista\",False)";
[self->__listacat Initialize:self.bi :@"lista" :false];
B4IRDebugUtils.currentLine=2424841;
 //BA.debugLineNum = 2424841;BA.debugLine="Main.NavControl.ShowPage2(pageCat,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__pagecat).object) :true];
B4IRDebugUtils.currentLine=2424843;
 //BA.debugLineNum = 2424843;BA.debugLine="Dim jobCategoria As HttpJob";
_jobcategoria = [b4i_httpjob new];
B4IRDebugUtils.currentLine=2424844;
 //BA.debugLineNum = 2424844;BA.debugLine="jobCategoria.Initialize(\"jobCategorias\",Me)";
[_jobcategoria _initialize /*NSString**/ :nil :self.bi :@"jobCategorias" :self];
B4IRDebugUtils.currentLine=2424845;
 //BA.debugLineNum = 2424845;BA.debugLine="jobCategoria.PostString(Main.url&\"/puntoventa/sea";
[_jobcategoria _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"/puntoventa/searchcategorias"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :@""]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=2424847;
 //BA.debugLineNum = 2424847;BA.debugLine="hud.ProgressDialogShow(\"Cargando lista de Favorit";
[self->__hud ProgressDialogShow:@"Cargando lista de Favoritos"];
B4IRDebugUtils.currentLine=2424849;
 //BA.debugLineNum = 2424849;BA.debugLine="Main.smc.Tag = \"categoria\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"categoria")];
B4IRDebugUtils.currentLine=2424851;
 //BA.debugLineNum = 2424851;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnaddproducto_click{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"btnaddproducto_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnaddproducto_click" :nil]);}
B4IButtonWrapper* _b = nil;
B4IMap* _mapa = nil;
B4IRDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="Sub btnAddProducto_Click";
B4IRDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim b As Button";
_b = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="b.Initialize(\"b\",b.STYLE_CONTACT_ADD)";
[_b Initialize:@"b" :self.bi :[_b STYLE_CONTACT_ADD]];
B4IRDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="b = Sender";
_b.object = (UIButton*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="Dim mapa As Map  = b.Tag";
_mapa = (B4IMap*)([_b Tag]);
B4IRDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="If mapa.Get(\"f_precio\") <= 0 Then";
if ([self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue<=0) { 
B4IRDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="Msgbox(\"Este producto tiene un precio el cual no";
[self->___c Msgbox:@"Este producto tiene un precio el cual no es acorde, comuniquese con los titulares de este" :@"Aviso"];
 }else {
B4IRDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="salvar_detalle_temporal(mapa,1)";
[self _salvar_detalle_temporal:_mapa :(int) (1)];
 };
B4IRDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _salvar_detalle_temporal:(B4IMap*) _map :(int) _cantidad{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"salvar_detalle_temporal"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"salvar_detalle_temporal::" :@[[B4I nilToNSNull:_map],@(_cantidad)]]);}
B4IMap* _mapcalculos = nil;
NSString* _json = @"";
b4i_httpjob* _jobdetalletemporal = nil;
B4IRDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub salvar_detalle_temporal(map As Map, cantidad A";
B4IRDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="Dim mapCalculos As Map = funciones.recalcular(map";
_mapcalculos = [self->__funciones _recalcular /*B4IMap**/ :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_precio")]].doubleValue :0 :_cantidad :[self.bi ObjectToNumber:[_map Get:(NSObject*)(@"f_tax")]].doubleValue :self->__main->__impuestoincluido /*BOOL*/  :false];
B4IRDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="json = \"'f_regresa':false\"& _ 			\",'f_idempresa':";
_json = [@[@"'f_regresa':false",@",'f_idempresa':",[self.bi NumberToString:@(self->__main->__idempresa /*int*/ )],@",'f_tipo':1",@",'f_idproducto':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_idrecord")]],@",'f_cantidad':",[self.bi NumberToString:@(_cantidad)],@"",@",'f_tax':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_tax")]],@",'f_precio':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_precio_para_mostrar")]],@",'f_importe':",[self.bi ObjectToString:[_mapcalculos Get:(NSObject*)(@"f_total")]],@",'f_descuento':0",@",'f_diferencia':0",@",'f_porciento_descuento':0",@",'f_porciento_tax':",[self.bi ObjectToString:[_map Get:(NSObject*)(@"f_tax")]],@",'f_imei':",self->__main->__imei /*NSString**/ ] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=3342355;
 //BA.debugLineNum = 3342355;BA.debugLine="Dim JobDetalleTemporal As HttpJob";
_jobdetalletemporal = [b4i_httpjob new];
B4IRDebugUtils.currentLine=3342356;
 //BA.debugLineNum = 3342356;BA.debugLine="JobDetalleTemporal.Initialize(\"JobDetalleTemporal";
[_jobdetalletemporal _initialize /*NSString**/ :nil :self.bi :@"JobDetalleTemporal" :self];
B4IRDebugUtils.currentLine=3342357;
 //BA.debugLineNum = 3342357;BA.debugLine="JobDetalleTemporal.PostString(Main.url&\"puntovent";
[_jobdetalletemporal _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"puntoventa/salvar_detalle_temporal2"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=3342359;
 //BA.debugLineNum = 3342359;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnagregarcarritodetalle_click{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"btnagregarcarritodetalle_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnagregarcarritodetalle_click" :nil]);}
B4IRDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub btnagregarCarritoDetalle_Click";
B4IRDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="salvar_detalle_temporal(mapaDetalle,lblcantidad.T";
[self _salvar_detalle_temporal:self->__mapadetalle :[self.bi ObjectToNumber:[self->__lblcantidad Text]].intValue];
B4IRDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="btnBackDetalles_Click";
[self _btnbackdetalles_click];
B4IRDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackdetalles_click{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"btnbackdetalles_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackdetalles_click" :nil]);}
B4IRDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub btnBackDetalles_Click";
B4IRDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackcat_click{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"btnbackcat_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackcat_click" :nil]);}
B4IRDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="Sub btnBackCat_Click";
B4IRDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="If actualizar Then";
if (self->__actualizar) { 
B4IRDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Main.actualizarCantidad";
[self->__main _actualizarcantidad /*NSString**/ ];
B4IRDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="actualizar = False";
self->__actualizar = false;
 };
B4IRDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Main.smc.Tag = \"inicio\"";
[self->__main->__smc /*B4ISideMenuController**/  setTag:(NSObject*)(@"inicio")];
B4IRDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="Main.NavControl.RemoveCurrentPage";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  RemoveCurrentPage];
B4IRDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbackprobycat_click{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"btnbackprobycat_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"btnbackprobycat_click" :nil]);}
B4IRDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub btnbackprobycat_Click";
B4IRDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="Main.NavControl.ShowPage2(pageCat,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__pagecat).object) :true];
B4IRDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _clearscrollview:(B4IScrollView*) _sv{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"clearscrollview"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"clearscrollview:" :@[[B4I nilToNSNull:_sv]]]);}
int _i = 0;
B4IRDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub ClearScrollView(sv As ScrollView)";
B4IRDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="For i = sv.Panel.NumberOfViews - 1 To 0 Step -1";
{
const int step1 = -1;
const int limit1 = (int) (0);
_i = (int) ([[_sv Panel] NumberOfViews]-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
B4IRDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="sv.Panel.GetView(i).RemoveViewFromParent";
[[[_sv Panel] GetView:_i] RemoveViewFromParent];
 }
};
B4IRDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="End Sub";
return @"";
}
- (B4IPanelWrapper*)  _createlistitem:(NSString*) _nombre :(int) _cantidad :(B4IBitmap*) _img :(int) _width :(int) _height{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"createlistitem"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createlistitem:::::" :@[[B4I nilToNSNull:_nombre],@(_cantidad),[B4I nilToNSNull:_img],@(_width),@(_height)]]);}
B4IPanelWrapper* _p = nil;
B4IRDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub CreateListItem(Nombre As String, cantidad As I";
B4IRDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="Dim p As Panel";
_p = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="p.Initialize(\"\")";
[_p Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=2555907;
 //BA.debugLineNum = 2555907;BA.debugLine="p.SetLayoutAnimated( 0, 1, 0, 0, Width, Height) '";
[_p SetLayoutAnimated:(int) (0) :(float) (1) :(float) (0) :(float) (0) :(float) (_width) :(float) (_height)];
B4IRDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="p.LoadLayout(\"frmPanelesItems\")";
[_p LoadLayout:@"frmPanelesItems" :self.bi];
B4IRDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="lblNomCat.Text = Nombre";
[self->__lblnomcat setText:_nombre];
B4IRDebugUtils.currentLine=2555910;
 //BA.debugLineNum = 2555910;BA.debugLine="lblCantCat.Text = \"Cantidad de Productos: \"&canti";
[self->__lblcantcat setText:[@[@"Cantidad de Productos: ",[self.bi NumberToString:@(_cantidad)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=2555911;
 //BA.debugLineNum = 2555911;BA.debugLine="imgCat.Bitmap = img";
[self->__imgcat setBitmap:_img];
B4IRDebugUtils.currentLine=2555912;
 //BA.debugLineNum = 2555912;BA.debugLine="Return p";
if (true) return _p;
B4IRDebugUtils.currentLine=2555913;
 //BA.debugLineNum = 2555913;BA.debugLine="End Sub";
return nil;
}
- (B4IPanelWrapper*)  _createpanelproductoscroll:(B4IMap*) _mapapanel1 :(B4IBitmap*) _imagen{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"createpanelproductoscroll"])
	 {return ((B4IPanelWrapper*) [B4IDebug delegate:self.bi :@"createpanelproductoscroll::" :@[[B4I nilToNSNull:_mapapanel1],[B4I nilToNSNull:_imagen]]]);}
B4IPanelWrapper* _panelfondopro = nil;
B4IPanelWrapper* _panelimagen = nil;
int _heigimg = 0;
int _lef = 0;
int _tnom = 0;
int _hnom = 0;
int _tpre = 0;
int _hpre = 0;
B4IImageViewWrapper* _imagenpro = nil;
B4ILabelWrapper* _lbltitulopro = nil;
B4ILabelWrapper* _lblpreciopro = nil;
B4IButtonWrapper* _btnaddpro = nil;
B4IRDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Sub createPanelProductoScroll(mapaPanel1 As Map, i";
B4IRDebugUtils.currentLine=2949123;
 //BA.debugLineNum = 2949123;BA.debugLine="Dim PanelFondoPro,PanelImagen As Panel";
_panelfondopro = [B4IPanelWrapper new];
_panelimagen = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2949124;
 //BA.debugLineNum = 2949124;BA.debugLine="PanelFondoPro.Initialize(\"PanelFondoPro\")";
[_panelfondopro Initialize:self.bi :@"PanelFondoPro"];
B4IRDebugUtils.currentLine=2949126;
 //BA.debugLineNum = 2949126;BA.debugLine="PanelFondoPro.Width = ScrollViewProByCat.Width *";
[_panelfondopro setWidth:(float) ([self->__scrollviewprobycat Width]*0.47)];
B4IRDebugUtils.currentLine=2949127;
 //BA.debugLineNum = 2949127;BA.debugLine="PanelFondoPro.Height = ScrollViewProByCat.Height";
[_panelfondopro setHeight:(float) ([self->__scrollviewprobycat Height]*0.40)];
B4IRDebugUtils.currentLine=2949129;
 //BA.debugLineNum = 2949129;BA.debugLine="Dim heigImg As Int = PanelFondoPro.Height * 0.50";
_heigimg = (int) ([_panelfondopro Height]*0.50);
B4IRDebugUtils.currentLine=2949130;
 //BA.debugLineNum = 2949130;BA.debugLine="Dim lef As Int = ScrollViewProByCat.Width * 0.02";
_lef = (int) ([self->__scrollviewprobycat Width]*0.02);
B4IRDebugUtils.currentLine=2949133;
 //BA.debugLineNum = 2949133;BA.debugLine="Dim Tnom As Int =   PanelFondoPro.Height * 0.39";
_tnom = (int) ([_panelfondopro Height]*0.39);
B4IRDebugUtils.currentLine=2949134;
 //BA.debugLineNum = 2949134;BA.debugLine="Dim Hnom As Int =   PanelFondoPro.Height * 0.42";
_hnom = (int) ([_panelfondopro Height]*0.42);
B4IRDebugUtils.currentLine=2949136;
 //BA.debugLineNum = 2949136;BA.debugLine="Dim tPre As Int = PanelFondoPro.Height * 0.51";
_tpre = (int) ([_panelfondopro Height]*0.51);
B4IRDebugUtils.currentLine=2949137;
 //BA.debugLineNum = 2949137;BA.debugLine="Dim hPre As Int  = PanelFondoPro.Height * 0.40";
_hpre = (int) ([_panelfondopro Height]*0.40);
B4IRDebugUtils.currentLine=2949140;
 //BA.debugLineNum = 2949140;BA.debugLine="PanelFondoPro.SetShadow(Colors.Gray,0dip,2dip,0.3";
[_panelfondopro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=2949142;
 //BA.debugLineNum = 2949142;BA.debugLine="PanelFondoPro.Color = Colors.RGB(255, 255, 255)";
[_panelfondopro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=2949144;
 //BA.debugLineNum = 2949144;BA.debugLine="PanelImagen.Initialize(\"\")";
[_panelimagen Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=2949146;
 //BA.debugLineNum = 2949146;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.3,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=2949148;
 //BA.debugLineNum = 2949148;BA.debugLine="Dim imagenPro As ImageView";
_imagenpro = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=2949149;
 //BA.debugLineNum = 2949149;BA.debugLine="imagenPro.Initialize(\"\")";
[_imagenpro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=2949151;
 //BA.debugLineNum = 2949151;BA.debugLine="imagenPro.Bitmap = imagen";
[_imagenpro setBitmap:_imagen];
B4IRDebugUtils.currentLine=2949153;
 //BA.debugLineNum = 2949153;BA.debugLine="mapaPanel1.Put(\"f_foto\",imagen)";
[_mapapanel1 Put:(NSObject*)(@"f_foto") :(NSObject*)((_imagen).object)];
B4IRDebugUtils.currentLine=2949155;
 //BA.debugLineNum = 2949155;BA.debugLine="mapaPanel1.Put(\"f_destacado\",False)";
[_mapapanel1 Put:(NSObject*)(@"f_destacado") :(NSObject*)(@(false))];
B4IRDebugUtils.currentLine=2949158;
 //BA.debugLineNum = 2949158;BA.debugLine="PanelImagen.SetShadow(Colors.Gray,0dip,2dip,0.1,T";
[_panelimagen SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.1) :true];
B4IRDebugUtils.currentLine=2949160;
 //BA.debugLineNum = 2949160;BA.debugLine="PanelImagen.AddView(imagenPro,0%x,0dip,PanelFondo";
[_panelimagen AddView:(UIView*)((_imagenpro).object) :[self->___c PerXToCurrent:(float) (0)] :(float) (((int) (0))) :[_panelfondopro Width] :(float) (_heigimg)];
B4IRDebugUtils.currentLine=2949162;
 //BA.debugLineNum = 2949162;BA.debugLine="PanelFondoPro.AddView(PanelImagen,0%x,0dip,PanelF";
[_panelfondopro AddView:(UIView*)((_panelimagen).object) :[self->___c PerXToCurrent:(float) (0)] :(float) (((int) (0))) :[_panelfondopro Width] :(float) (_heigimg)];
B4IRDebugUtils.currentLine=2949164;
 //BA.debugLineNum = 2949164;BA.debugLine="Dim lblTituloPro As Label";
_lbltitulopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2949165;
 //BA.debugLineNum = 2949165;BA.debugLine="lblTituloPro.Initialize(\"\")";
[_lbltitulopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=2949166;
 //BA.debugLineNum = 2949166;BA.debugLine="lblTituloPro.Text = mapaPanel1.Get(\"f_descripcion";
[_lbltitulopro setText:[self.bi ObjectToString:[_mapapanel1 Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=2949167;
 //BA.debugLineNum = 2949167;BA.debugLine="lblTituloPro.TextColor = Colors.RGB(97, 97, 97)";
[_lbltitulopro setTextColor:[[self->___c Colors] RGB:(int) (97) :(int) (97) :(int) (97)]];
B4IRDebugUtils.currentLine=2949168;
 //BA.debugLineNum = 2949168;BA.debugLine="lblTituloPro.Font = Font.CreateNew(15)";
[_lbltitulopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=2949171;
 //BA.debugLineNum = 2949171;BA.debugLine="PanelFondoPro.AddView(lblTituloPro,lef,Tnom,Panel";
[_panelfondopro AddView:(UIView*)((_lbltitulopro).object) :(float) (_lef) :(float) (_tnom) :(float) ([_panelfondopro Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) (_hnom)];
B4IRDebugUtils.currentLine=2949173;
 //BA.debugLineNum = 2949173;BA.debugLine="Dim lblPrecioPro As Label";
_lblpreciopro = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2949174;
 //BA.debugLineNum = 2949174;BA.debugLine="lblPrecioPro.Initialize(\"\")";
[_lblpreciopro Initialize:self.bi :@""];
B4IRDebugUtils.currentLine=2949175;
 //BA.debugLineNum = 2949175;BA.debugLine="lblPrecioPro.Text = NumberFormat(mapaPanel1.Get(\"";
[_lblpreciopro setText:[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapapanel1 Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]];
B4IRDebugUtils.currentLine=2949176;
 //BA.debugLineNum = 2949176;BA.debugLine="lblPrecioPro.Text = \"$ \"&lblPrecioPro.Text";
[_lblpreciopro setText:[@[@"$ ",[_lblpreciopro Text]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=2949177;
 //BA.debugLineNum = 2949177;BA.debugLine="lblPrecioPro.TextColor = Colors.RGB(76, 175, 80)";
[_lblpreciopro setTextColor:[[self->___c Colors] RGB:(int) (76) :(int) (175) :(int) (80)]];
B4IRDebugUtils.currentLine=2949178;
 //BA.debugLineNum = 2949178;BA.debugLine="lblPrecioPro.Font = Font.CreateNew(15)";
[_lblpreciopro setFont:[[self->___c Font] CreateNew:(float) (15)]];
B4IRDebugUtils.currentLine=2949180;
 //BA.debugLineNum = 2949180;BA.debugLine="PanelFondoPro.AddView(lblPrecioPro,lef,tPre,Panel";
[_panelfondopro AddView:(UIView*)((_lblpreciopro).object) :(float) (_lef) :(float) (_tpre) :(float) ([_panelfondopro Width]*0.50) :(float) (_hpre)];
B4IRDebugUtils.currentLine=2949182;
 //BA.debugLineNum = 2949182;BA.debugLine="Dim btnAddPro As Button";
_btnaddpro = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=2949183;
 //BA.debugLineNum = 2949183;BA.debugLine="btnAddPro.InitializeCustom(\"btnAddProducto\",Color";
[_btnaddpro InitializeCustom:@"btnAddProducto" :self.bi :[[self->___c Colors] RGB:(int) (244) :(int) (67) :(int) (54)] :[[self->___c Colors] RGB:(int) (0) :(int) (0) :(int) (0)]];
B4IRDebugUtils.currentLine=2949184;
 //BA.debugLineNum = 2949184;BA.debugLine="btnAddPro.Color = Colors.RGB(255, 255, 255)";
[_btnaddpro setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
B4IRDebugUtils.currentLine=2949185;
 //BA.debugLineNum = 2949185;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.2,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.2) :true];
B4IRDebugUtils.currentLine=2949186;
 //BA.debugLineNum = 2949186;BA.debugLine="btnAddPro.Tag = mapaPanel1";
[_btnaddpro setTag:(NSObject*)(_mapapanel1)];
B4IRDebugUtils.currentLine=2949187;
 //BA.debugLineNum = 2949187;BA.debugLine="btnAddPro.Text = \"Agregar\"";
[_btnaddpro setText:@"Agregar"];
B4IRDebugUtils.currentLine=2949189;
 //BA.debugLineNum = 2949189;BA.debugLine="btnAddPro.SetShadow(Colors.Gray,0dip,2dip,0.3,Tru";
[_btnaddpro SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=2949191;
 //BA.debugLineNum = 2949191;BA.debugLine="PanelFondoPro.AddView(btnAddPro,PanelFondoPro.Wid";
[_panelfondopro AddView:(UIView*)((_btnaddpro).object) :(float) ([_panelfondopro Width]*0.02) :(float) ([_panelfondopro Height]*0.80) :(float) ([_panelfondopro Width]-[self->___c PerXToCurrent:(float) (4)]) :(float) ([_panelfondopro Height]*0.14)];
B4IRDebugUtils.currentLine=2949193;
 //BA.debugLineNum = 2949193;BA.debugLine="PanelFondoPro.Tag = mapaPanel1";
[_panelfondopro setTag:(NSObject*)(_mapapanel1)];
B4IRDebugUtils.currentLine=2949194;
 //BA.debugLineNum = 2949194;BA.debugLine="btnAddPro.Tag = mapaPanel1";
[_btnaddpro setTag:(NSObject*)(_mapapanel1)];
B4IRDebugUtils.currentLine=2949196;
 //BA.debugLineNum = 2949196;BA.debugLine="Return PanelFondoPro";
if (true) return _panelfondopro;
B4IRDebugUtils.currentLine=2949198;
 //BA.debugLineNum = 2949198;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _customlistviewcategoria_itemclick:(int) _index :(NSObject*) _value{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"customlistviewcategoria_itemclick"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"customlistviewcategoria_itemclick::" :@[@(_index),[B4I nilToNSNull:_value]]]);}
B4IMap* _mapa = nil;
NSString* _json = @"";
b4i_httpjob* _jobbusqueda = nil;
B4IRDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="Sub CustomListViewCategoria_ItemClick (Index As In";
B4IRDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="mapa = Value";
_mapa = (B4IMap*)(_value);
B4IRDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="If mapa.Get(\"f_cantidad\") > 0 Then";
if ([self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_cantidad")]].doubleValue>0) { 
B4IRDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim json As String";
_json = @"";
B4IRDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="json = \"'f_idcategoria':\"&mapa.Get(\"idcategoria\"";
_json = [@[@"'f_idcategoria':",[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"idcategoria")]]] componentsJoinedByString:@""];
B4IRDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Dim jobBusqueda As HttpJob";
_jobbusqueda = [b4i_httpjob new];
B4IRDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="jobBusqueda.Initialize(\"ProductosByCategoria\",Me";
[_jobbusqueda _initialize /*NSString**/ :nil :self.bi :@"ProductosByCategoria" :self];
B4IRDebugUtils.currentLine=2752527;
 //BA.debugLineNum = 2752527;BA.debugLine="If PanelFondoProductosbycategorias.IsInitialized";
if ([self->__panelfondoproductosbycategorias IsInitialized]==false) { 
B4IRDebugUtils.currentLine=2752529;
 //BA.debugLineNum = 2752529;BA.debugLine="pageProByCat.Initialize(\"pageProByCat\")";
[self->__pageprobycat Initialize:self.bi :@"pageProByCat"];
B4IRDebugUtils.currentLine=2752530;
 //BA.debugLineNum = 2752530;BA.debugLine="pageProByCat.RootPanel.LoadLayout(\"frmProductoB";
[[self->__pageprobycat RootPanel] LoadLayout:@"frmProductoByCategoria" :self.bi];
 };
B4IRDebugUtils.currentLine=2752535;
 //BA.debugLineNum = 2752535;BA.debugLine="Label1.Text = mapa.Get(\"f_nombre\")";
[self->__label1 setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]]];
B4IRDebugUtils.currentLine=2752536;
 //BA.debugLineNum = 2752536;BA.debugLine="Label2.Text = \"Cantidad de productos: \"&mapa.Get";
[self->__label2 setText:[@[@"Cantidad de productos: ",[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_cantidad")]]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=2752538;
 //BA.debugLineNum = 2752538;BA.debugLine="ClearScrollView(ScrollViewProByCat)";
[self _clearscrollview:self->__scrollviewprobycat];
B4IRDebugUtils.currentLine=2752540;
 //BA.debugLineNum = 2752540;BA.debugLine="jobBusqueda.PostString(Main.url&\"/puntoventa/pro";
[_jobbusqueda _poststring /*NSString**/ :nil :[@[self->__main->__url /*NSString**/ ,@"/puntoventa/productosbycat"] componentsJoinedByString:@""] :[@[@"json=",[self->__funciones _crearjson /*NSString**/ :self->__main->__tokenpublico /*NSString**/  :_json]] componentsJoinedByString:@""]];
 }else {
B4IRDebugUtils.currentLine=2752543;
 //BA.debugLineNum = 2752543;BA.debugLine="Msgbox(\"La categoria \"&mapa.Get(\"f_nombre\")&\" no";
[self->___c Msgbox:[@[@"La categoria ",[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]],@" no tiene Productos!!"] componentsJoinedByString:@""] :@"Ups.."];
 };
B4IRDebugUtils.currentLine=2752548;
 //BA.debugLineNum = 2752548;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"jobdone"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"jobdone:" :@[[B4I nilToNSNull:_job]]]);}
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json2 = nil;
int _i = 0;
BOOL _key = false;
B4IMap* _mapa = nil;
B4IBitmap* _bm = nil;
B4IBitmap* _imadim = nil;
int _alttop = 0;
int _lef2 = 0;
int _lef3 = 0;
B4IMap* _mapamio = nil;
B4IRDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub JobDone(Job As HttpJob)";
B4IRDebugUtils.currentLine=2490371;
 //BA.debugLineNum = 2490371;BA.debugLine="hud.ProgressDialogHide";
[self->__hud ProgressDialogHide];
B4IRDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
B4IRDebugUtils.currentLine=2490374;
 //BA.debugLineNum = 2490374;BA.debugLine="Msgbox(Main.jobMsj,Main.jobMsjTitle)";
[self->___c Msgbox:self->__main->__jobmsj /*NSString**/  :self->__main->__jobmsjtitle /*NSString**/ ];
B4IRDebugUtils.currentLine=2490375;
 //BA.debugLineNum = 2490375;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2490378;
 //BA.debugLineNum = 2490378;BA.debugLine="If funciones.verificarJob(Job.GetString)=False Th";
if ([self->__funciones _verificarjob /*BOOL*/ :[_job _getstring /*NSString**/ :nil]]==false) { 
B4IRDebugUtils.currentLine=2490379;
 //BA.debugLineNum = 2490379;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2490382;
 //BA.debugLineNum = 2490382;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
B4IRDebugUtils.currentLine=2490383;
 //BA.debugLineNum = 2490383;BA.debugLine="Dim list As List";
_list = [B4IList new];
B4IRDebugUtils.currentLine=2490384;
 //BA.debugLineNum = 2490384;BA.debugLine="Dim json2 As JSONParser";
_json2 = [B4IJSONParser new];
B4IRDebugUtils.currentLine=2490387;
 //BA.debugLineNum = 2490387;BA.debugLine="json2.Initialize(funciones.base64_Decode(Job.GetS";
[_json2 Initialize:[self->__funciones _base64_decode /*NSString**/ :[_job _getstring /*NSString**/ :nil]]];
B4IRDebugUtils.currentLine=2490389;
 //BA.debugLineNum = 2490389;BA.debugLine="map = json2.NextObject";
_map = [_json2 NextObject];
B4IRDebugUtils.currentLine=2490391;
 //BA.debugLineNum = 2490391;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"jobCategorias",@"ProductosByCategoria",@"JobDetalleTemporal"]]) {
case 0: {
B4IRDebugUtils.currentLine=2490396;
 //BA.debugLineNum = 2490396;BA.debugLine="If listaCat.IsInitialized Then";
if ([self->__listacat IsInitialized]) { 
B4IRDebugUtils.currentLine=2490398;
 //BA.debugLineNum = 2490398;BA.debugLine="listaCat.RemoveViewFromParent";
[self->__listacat RemoveViewFromParent];
B4IRDebugUtils.currentLine=2490399;
 //BA.debugLineNum = 2490399;BA.debugLine="listaCat.Initialize(\"listaCat\",False)";
[self->__listacat Initialize:self.bi :@"listaCat" :false];
 };
B4IRDebugUtils.currentLine=2490404;
 //BA.debugLineNum = 2490404;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=2490406;
 //BA.debugLineNum = 2490406;BA.debugLine="For i=0 To list.Size-1";
{
const int step21 = 1;
const int limit21 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit21 ;_i = _i + step21 ) {
B4IRDebugUtils.currentLine=2490408;
 //BA.debugLineNum = 2490408;BA.debugLine="Dim key As Boolean = False";
_key = false;
B4IRDebugUtils.currentLine=2490410;
 //BA.debugLineNum = 2490410;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=2490411;
 //BA.debugLineNum = 2490411;BA.debugLine="mapa = list.Get(i)";
_mapa = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=2490413;
 //BA.debugLineNum = 2490413;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=2490415;
 //BA.debugLineNum = 2490415;BA.debugLine="If mapa.Get(\"f_fotoCategoria\") <> Null And map";
if ([_mapa Get:(NSObject*)(@"f_fotoCategoria")]!= nil && [[_mapa Get:(NSObject*)(@"f_fotoCategoria")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=2490417;
 //BA.debugLineNum = 2490417;BA.debugLine="Dim imaDim As Bitmap";
_imadim = [B4IBitmap new];
B4IRDebugUtils.currentLine=2490418;
 //BA.debugLineNum = 2490418;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_fotoCate";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_fotoCategoria")]]];
B4IRDebugUtils.currentLine=2490420;
 //BA.debugLineNum = 2490420;BA.debugLine="imaDim = funciones.ResizeImage(bm,200,200)";
_imadim = [self->__funciones _resizeimage /*B4IBitmap**/ :_bm :(int) (200) :(int) (200)];
B4IRDebugUtils.currentLine=2490422;
 //BA.debugLineNum = 2490422;BA.debugLine="key = True";
_key = true;
 }else {
B4IRDebugUtils.currentLine=2490425;
 //BA.debugLineNum = 2490425;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=2490429;
 //BA.debugLineNum = 2490429;BA.debugLine="If key Then";
if (_key) { 
B4IRDebugUtils.currentLine=2490430;
 //BA.debugLineNum = 2490430;BA.debugLine="CustomListViewCategoria.Add(CreateListItem(ma";
[self->__customlistviewcategoria _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]] :[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_cantidad")]].intValue :_imadim :(int) ([[self->__customlistviewcategoria _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (50))]).object)] :(NSObject*)(_mapa)];
 }else {
B4IRDebugUtils.currentLine=2490432;
 //BA.debugLineNum = 2490432;BA.debugLine="CustomListViewCategoria.Add(CreateListItem(ma";
[self->__customlistviewcategoria _add /*NSString**/ :nil :(B4XViewWrapper*) [B4IObjectWrapper createWrapper:[B4XViewWrapper new] object:(NSObject*)(([self _createlistitem:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]] :[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_cantidad")]].intValue :_bm :(int) ([[self->__customlistviewcategoria _getbase /*B4XViewWrapper**/ :nil] Width]) :((int) (50))]).object)] :(NSObject*)(_mapa)];
 };
 }
};
B4IRDebugUtils.currentLine=2490437;
 //BA.debugLineNum = 2490437;BA.debugLine="hud.ProgressDialogHide";
[self->__hud ProgressDialogHide];
 break; }
case 1: {
B4IRDebugUtils.currentLine=2490441;
 //BA.debugLineNum = 2490441;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=2490443;
 //BA.debugLineNum = 2490443;BA.debugLine="If list.Size <= 0 Then";
if ([_list Size]<=0) { 
B4IRDebugUtils.currentLine=2490444;
 //BA.debugLineNum = 2490444;BA.debugLine="Msgbox(\"Esta categoría todavía no tiene produc";
[self->___c Msgbox:@"Esta categoría todavía no tiene productos" :@"Aviso"];
 };
B4IRDebugUtils.currentLine=2490447;
 //BA.debugLineNum = 2490447;BA.debugLine="Main.NavControl.ShowPage2(pageProByCat,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__pageprobycat).object) :true];
B4IRDebugUtils.currentLine=2490450;
 //BA.debugLineNum = 2490450;BA.debugLine="ScrollViewProByCat.ContentWidth = ScrollViewPro";
[self->__scrollviewprobycat setContentWidth:(int) ([self->__scrollviewprobycat Width])];
B4IRDebugUtils.currentLine=2490451;
 //BA.debugLineNum = 2490451;BA.debugLine="Dim alttop As Int  = ScrollViewProByCat.Height";
_alttop = (int) ([self->__scrollviewprobycat Height]*0.02);
B4IRDebugUtils.currentLine=2490452;
 //BA.debugLineNum = 2490452;BA.debugLine="Dim lef2 As Int = 1%x";
_lef2 = (int) ([self->___c PerXToCurrent:(float) (1)]);
B4IRDebugUtils.currentLine=2490453;
 //BA.debugLineNum = 2490453;BA.debugLine="Dim lef3 As Int = ScrollViewProByCat.Width * 0.";
_lef3 = (int) ([self->__scrollviewprobycat Width]*0.50);
B4IRDebugUtils.currentLine=2490455;
 //BA.debugLineNum = 2490455;BA.debugLine="For i=0 To list.Size -1";
{
const int step51 = 1;
const int limit51 = (int) ([_list Size]-1);
_i = (int) (0) ;
for (;_i <= limit51 ;_i = _i + step51 ) {
B4IRDebugUtils.currentLine=2490456;
 //BA.debugLineNum = 2490456;BA.debugLine="Dim mapaMio As Map = list.Get(i)";
_mapamio = (B4IMap*)([_list Get:_i]);
B4IRDebugUtils.currentLine=2490458;
 //BA.debugLineNum = 2490458;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=2490459;
 //BA.debugLineNum = 2490459;BA.debugLine="If mapaMio.Get(\"f_foto\") <> Null And mapaMio.G";
if ([_mapamio Get:(NSObject*)(@"f_foto")]!= nil && [[_mapamio Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=2490460;
 //BA.debugLineNum = 2490460;BA.debugLine="bm = funciones.getImagen(mapaMio.Get(\"f_foto\"";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapamio Get:(NSObject*)(@"f_foto")]]];
 }else {
B4IRDebugUtils.currentLine=2490463;
 //BA.debugLineNum = 2490463;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
 };
B4IRDebugUtils.currentLine=2490466;
 //BA.debugLineNum = 2490466;BA.debugLine="If i Mod 2 == 0 Then";
if (_i%2==0) { 
B4IRDebugUtils.currentLine=2490468;
 //BA.debugLineNum = 2490468;BA.debugLine="ScrollViewProByCat.Panel.AddView(createPanelP";
[[self->__scrollviewprobycat Panel] AddView:(UIView*)(([self _createpanelproductoscroll:_mapamio :_bm]).object) :(float) (_lef2) :(float) (_alttop) :(float) ([self->__scrollviewprobycat Width]*0.48) :(float) ([self->__scrollviewprobycat Height]*0.41)];
B4IRDebugUtils.currentLine=2490470;
 //BA.debugLineNum = 2490470;BA.debugLine="If i == list.Size-1 Then";
if (_i==[_list Size]-1) { 
B4IRDebugUtils.currentLine=2490471;
 //BA.debugLineNum = 2490471;BA.debugLine="alttop = alttop +  ScrollViewProByCat.Height";
_alttop = (int) (_alttop+[self->__scrollviewprobycat Height]*0.43);
 };
 }else {
B4IRDebugUtils.currentLine=2490476;
 //BA.debugLineNum = 2490476;BA.debugLine="ScrollViewProByCat.Panel.AddView(createPanelP";
[[self->__scrollviewprobycat Panel] AddView:(UIView*)(([self _createpanelproductoscroll:_mapamio :_bm]).object) :(float) (_lef3) :(float) (_alttop) :(float) ([self->__scrollviewprobycat Width]*0.48) :(float) ([self->__scrollviewprobycat Height]*0.41)];
B4IRDebugUtils.currentLine=2490477;
 //BA.debugLineNum = 2490477;BA.debugLine="alttop = alttop +  ScrollViewProByCat.Height";
_alttop = (int) (_alttop+[self->__scrollviewprobycat Height]*0.43);
 };
 }
};
B4IRDebugUtils.currentLine=2490483;
 //BA.debugLineNum = 2490483;BA.debugLine="ScrollViewProByCat.ScrollTo(0,0,True)";
[self->__scrollviewprobycat ScrollTo:(int) (0) :(int) (0) :true];
B4IRDebugUtils.currentLine=2490484;
 //BA.debugLineNum = 2490484;BA.debugLine="ScrollViewProByCat.ContentHeight = alttop";
[self->__scrollviewprobycat setContentHeight:_alttop];
 break; }
case 2: {
B4IRDebugUtils.currentLine=2490488;
 //BA.debugLineNum = 2490488;BA.debugLine="map = map.Get(\"f_data\")";
_map = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
B4IRDebugUtils.currentLine=2490489;
 //BA.debugLineNum = 2490489;BA.debugLine="If map.Get(\"f_paso\") = \"0\" Then";
if ([[_map Get:(NSObject*)(@"f_paso")] isEqual:(NSObject*)(@"0")]) { 
B4IRDebugUtils.currentLine=2490490;
 //BA.debugLineNum = 2490490;BA.debugLine="Msgbox(\"Este producto no tiene existencia: \"&";
[self->___c Msgbox:[@[@"Este producto no tiene existencia: ",@"\n",[self.bi ObjectToString:_job->__tag /*NSObject**/ ],@"."] componentsJoinedByString:@""] :@"Información"];
B4IRDebugUtils.currentLine=2490491;
 //BA.debugLineNum = 2490491;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2490493;
 //BA.debugLineNum = 2490493;BA.debugLine="Main.cantidadProduto = Main.cantidadProduto + 1";
self->__main->__cantidadproduto /*int*/  = (int) (self->__main->__cantidadproduto /*int*/ +1);
B4IRDebugUtils.currentLine=2490494;
 //BA.debugLineNum = 2490494;BA.debugLine="hud.ToastMessageShow(\"Producto agregado al carr";
[self->__hud ToastMessageShow:@"Producto agregado al carrito." :false];
B4IRDebugUtils.currentLine=2490495;
 //BA.debugLineNum = 2490495;BA.debugLine="actualizar = True";
self->__actualizar = true;
 break; }
}
;
B4IRDebugUtils.currentLine=2490499;
 //BA.debugLineNum = 2490499;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _listacat_selectedchanged:(int) _sectionindex :(B4ITableCell*) _cell{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"listacat_selectedchanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"listacat_selectedchanged::" :@[@(_sectionindex),[B4I nilToNSNull:_cell]]]);}
B4IRDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="Sub listaCat_SelectedChanged (SectionIndex As Int,";
B4IRDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="If Cell.Tag = Null Then";
if ([_cell Tag]== nil) { 
B4IRDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Return";
if (true) return @"";
 };
B4IRDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _panelfondopro_click{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"panelfondopro_click"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"panelfondopro_click" :nil]);}
B4IMap* _mapa = nil;
B4IPanelWrapper* _b = nil;
B4IBitmap* _bm = nil;
B4IBitmap* _bmimgfav = nil;
B4IRDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub PanelFondoPro_Click";
B4IRDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
B4IRDebugUtils.currentLine=3014659;
 //BA.debugLineNum = 3014659;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
B4IRDebugUtils.currentLine=3014661;
 //BA.debugLineNum = 3014661;BA.debugLine="Dim b As Panel";
_b = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=3014662;
 //BA.debugLineNum = 3014662;BA.debugLine="b = Sender";
_b.object = (B4IPanelView*)([self->___c Sender:self.bi]);
B4IRDebugUtils.currentLine=3014664;
 //BA.debugLineNum = 3014664;BA.debugLine="mapa = b.Tag";
_mapa = (B4IMap*)([_b Tag]);
B4IRDebugUtils.currentLine=3014665;
 //BA.debugLineNum = 3014665;BA.debugLine="mapaDetalle = mapa";
self->__mapadetalle = _mapa;
B4IRDebugUtils.currentLine=3014669;
 //BA.debugLineNum = 3014669;BA.debugLine="If PanelFondoDetalles.IsInitialized == False Then";
if ([self->__panelfondodetalles IsInitialized]==false) { 
B4IRDebugUtils.currentLine=3014670;
 //BA.debugLineNum = 3014670;BA.debugLine="pageDetalle.Initialize(\"pageDetalle\")";
[self->__pagedetalle Initialize:self.bi :@"pageDetalle"];
B4IRDebugUtils.currentLine=3014672;
 //BA.debugLineNum = 3014672;BA.debugLine="pageDetalle.RootPanel.LoadLayout(\"frmDetalleProd";
[[self->__pagedetalle RootPanel] LoadLayout:@"frmDetalleProducto" :self.bi];
 };
B4IRDebugUtils.currentLine=3014675;
 //BA.debugLineNum = 3014675;BA.debugLine="Main.NavControl.ShowPage2(pageDetalle,True)";
[self->__main->__navcontrol /*B4INavigationControllerWrapper**/  ShowPage2:(UIViewController*)((self->__pagedetalle).object) :true];
B4IRDebugUtils.currentLine=3014677;
 //BA.debugLineNum = 3014677;BA.debugLine="Dim bm As Bitmap";
_bm = [B4IBitmap new];
B4IRDebugUtils.currentLine=3014679;
 //BA.debugLineNum = 3014679;BA.debugLine="If mapa.Get(\"f_destacado\") Then";
if ([self.bi ObjectToBoolean:[_mapa Get:(NSObject*)(@"f_destacado")]]) { 
B4IRDebugUtils.currentLine=3014681;
 //BA.debugLineNum = 3014681;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=3014682;
 //BA.debugLineNum = 3014682;BA.debugLine="bm = funciones.getImagen(mapa.Get(\"f_foto\"))";
_bm = [self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]];
B4IRDebugUtils.currentLine=3014684;
 //BA.debugLineNum = 3014684;BA.debugLine="ImageViewDetalles.Bitmap= bm";
[self->__imageviewdetalles setBitmap:_bm];
 }else {
B4IRDebugUtils.currentLine=3014688;
 //BA.debugLineNum = 3014688;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
B4IRDebugUtils.currentLine=3014690;
 //BA.debugLineNum = 3014690;BA.debugLine="ImageViewDetalles.Bitmap = bm";
[self->__imageviewdetalles setBitmap:_bm];
 };
 }else {
B4IRDebugUtils.currentLine=3014694;
 //BA.debugLineNum = 3014694;BA.debugLine="If  mapa.Get(\"f_foto\") <> Null And mapa.Get(\"f_f";
if ([_mapa Get:(NSObject*)(@"f_foto")]!= nil && [[_mapa Get:(NSObject*)(@"f_foto")] isEqual:(NSObject*)(@"")] == false) { 
B4IRDebugUtils.currentLine=3014697;
 //BA.debugLineNum = 3014697;BA.debugLine="ImageViewDetalles.Bitmap = funciones.getImagen(";
[self->__imageviewdetalles setBitmap:[self->__funciones _getimagen /*B4IBitmap**/ :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_foto")]]]];
 }else {
B4IRDebugUtils.currentLine=3014700;
 //BA.debugLineNum = 3014700;BA.debugLine="bm.Initialize(File.DirAssets,\"no-image.jpg\")";
[_bm Initialize:[[self->___c File] DirAssets] :@"no-image.jpg"];
B4IRDebugUtils.currentLine=3014702;
 //BA.debugLineNum = 3014702;BA.debugLine="ImageViewDetalles.Bitmap = bm";
[self->__imageviewdetalles setBitmap:_bm];
 };
 };
B4IRDebugUtils.currentLine=3014709;
 //BA.debugLineNum = 3014709;BA.debugLine="Dim bmimgfav As Bitmap";
_bmimgfav = [B4IBitmap new];
B4IRDebugUtils.currentLine=3014713;
 //BA.debugLineNum = 3014713;BA.debugLine="If bmimgfav.IsInitialized == False Then";
if ([_bmimgfav IsInitialized]==false) { 
B4IRDebugUtils.currentLine=3014714;
 //BA.debugLineNum = 3014714;BA.debugLine="bmimgfav.Initialize(File.DirAssets,\"heartWhitean";
[_bmimgfav Initialize:[[self->___c File] DirAssets] :@"heartWhiteandBlack.png"];
B4IRDebugUtils.currentLine=3014715;
 //BA.debugLineNum = 3014715;BA.debugLine="imgdetallefav.Tag = False";
[self->__imgdetallefav setTag:(NSObject*)(@(false))];
 };
B4IRDebugUtils.currentLine=3014718;
 //BA.debugLineNum = 3014718;BA.debugLine="imgdetallefav.Bitmap = bmimgfav";
[self->__imgdetallefav setBitmap:_bmimgfav];
B4IRDebugUtils.currentLine=3014722;
 //BA.debugLineNum = 3014722;BA.debugLine="btnagregarCarritoDetalle.SetShadow(Colors.Gray,0d";
[self->__btnagregarcarritodetalle SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (2))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=3014723;
 //BA.debugLineNum = 3014723;BA.debugLine="PanelImagenDetalles.SetShadow(Colors.Gray,0dip,3d";
[self->__panelimagendetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=3014724;
 //BA.debugLineNum = 3014724;BA.debugLine="PanellblCantidad.SetShadow(Colors.Gray,0dip,1dip,";
[self->__panellblcantidad SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (1))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=3014725;
 //BA.debugLineNum = 3014725;BA.debugLine="PanelEncabezadoDetalles.SetShadow(Colors.Gray,0di";
[self->__panelencabezadodetalles SetShadow:[[self->___c Colors] Gray] :(float) (((int) (0))) :(float) (((int) (3))) :(float) (0.3) :true];
B4IRDebugUtils.currentLine=3014727;
 //BA.debugLineNum = 3014727;BA.debugLine="lblPrecioEncabezado.Text = \"$\"&NumberFormat( mapa";
[self->__lblprecioencabezado setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=3014728;
 //BA.debugLineNum = 3014728;BA.debugLine="lblNombeEncabezado.Text = mapa.Get(\"f_descripcion";
[self->__lblnombeencabezado setText:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_descripcion")]]];
B4IRDebugUtils.currentLine=3014729;
 //BA.debugLineNum = 3014729;BA.debugLine="lblcantidad.Text = 1";
[self->__lblcantidad setText:[self.bi NumberToString:@(1)]];
B4IRDebugUtils.currentLine=3014730;
 //BA.debugLineNum = 3014730;BA.debugLine="StepperCantidad.Value = lblcantidad.Text";
[self->__steppercantidad setValue:[self.bi ObjectToNumber:[self->__lblcantidad Text]].doubleValue];
B4IRDebugUtils.currentLine=3014731;
 //BA.debugLineNum = 3014731;BA.debugLine="lblPrecio.Text = \"$\"&NumberFormat( mapa.Get(\"f_pr";
[self->__lblprecio setText:[@[@"$",[self->___c NumberFormat:[self.bi ObjectToNumber:[_mapa Get:(NSObject*)(@"f_precio")]].doubleValue :(int) (0) :(int) (2)]] componentsJoinedByString:@""]];
B4IRDebugUtils.currentLine=3014735;
 //BA.debugLineNum = 3014735;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _process_globals{
self->__main=[b4i_main new];
self->__login=[b4i_login new];
self->__funciones=[b4i_funciones new];
self->__reportes=[b4i_reportes new];
self->__facturacion=[b4i_facturacion new];
self->__direcciones=[b4i_direcciones new];
self->__perfil=[b4i_perfil new];
self->__favoritos=[b4i_favoritos new];
self->__httputils2service=[b4i_httputils2service new];
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"process_globals"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"process_globals" :nil]);}
B4IRDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub Process_Globals";
B4IRDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Private PanelLista As Panel";
self->__panellista = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="Private listaCat As TableView";
self->__listacat = [B4ITableView new];
B4IRDebugUtils.currentLine=2359303;
 //BA.debugLineNum = 2359303;BA.debugLine="Private hud As HUD";
self->__hud = [iHUD new];
B4IRDebugUtils.currentLine=2359304;
 //BA.debugLineNum = 2359304;BA.debugLine="Dim mapaDetalle As Map";
self->__mapadetalle = [B4IMap new];
B4IRDebugUtils.currentLine=2359305;
 //BA.debugLineNum = 2359305;BA.debugLine="dim actualizar as Boolean = False";
self->__actualizar = false;
B4IRDebugUtils.currentLine=2359307;
 //BA.debugLineNum = 2359307;BA.debugLine="Private pageCat As Page";
self->__pagecat = [B4IPage new];
B4IRDebugUtils.currentLine=2359308;
 //BA.debugLineNum = 2359308;BA.debugLine="Private pageProByCat As Page";
self->__pageprobycat = [B4IPage new];
B4IRDebugUtils.currentLine=2359309;
 //BA.debugLineNum = 2359309;BA.debugLine="Private pageDetalle As Page";
self->__pagedetalle = [B4IPage new];
B4IRDebugUtils.currentLine=2359311;
 //BA.debugLineNum = 2359311;BA.debugLine="Private btnBackCat As Button";
self->__btnbackcat = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=2359312;
 //BA.debugLineNum = 2359312;BA.debugLine="Private CustomListViewCategoria As CustomListView";
self->__customlistviewcategoria = [b4i_customlistview new];
B4IRDebugUtils.currentLine=2359313;
 //BA.debugLineNum = 2359313;BA.debugLine="Private imgCat As ImageView";
self->__imgcat = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=2359314;
 //BA.debugLineNum = 2359314;BA.debugLine="Private lblNomCat As Label";
self->__lblnomcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359315;
 //BA.debugLineNum = 2359315;BA.debugLine="Private lblCantCat As Label";
self->__lblcantcat = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359316;
 //BA.debugLineNum = 2359316;BA.debugLine="Private ScrollViewProByCat As ScrollView";
self->__scrollviewprobycat = [B4IScrollView new];
B4IRDebugUtils.currentLine=2359317;
 //BA.debugLineNum = 2359317;BA.debugLine="Private Label1 As Label";
self->__label1 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359318;
 //BA.debugLineNum = 2359318;BA.debugLine="Private PanelFondoProductosbycategorias As Panel";
self->__panelfondoproductosbycategorias = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2359319;
 //BA.debugLineNum = 2359319;BA.debugLine="Private btnbackprobycat As Button";
self->__btnbackprobycat = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=2359320;
 //BA.debugLineNum = 2359320;BA.debugLine="Private Label2 As Label";
self->__label2 = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359322;
 //BA.debugLineNum = 2359322;BA.debugLine="Private btnBackDetalles As Button";
self->__btnbackdetalles = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=2359323;
 //BA.debugLineNum = 2359323;BA.debugLine="Private ImageViewDetalles As ImageView";
self->__imageviewdetalles = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=2359324;
 //BA.debugLineNum = 2359324;BA.debugLine="Private lblPrecioEncabezado As Label";
self->__lblprecioencabezado = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359325;
 //BA.debugLineNum = 2359325;BA.debugLine="Private lblNombeEncabezado As Label";
self->__lblnombeencabezado = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359326;
 //BA.debugLineNum = 2359326;BA.debugLine="Private imgdetallefav As ImageView";
self->__imgdetallefav = [B4IImageViewWrapper new];
B4IRDebugUtils.currentLine=2359327;
 //BA.debugLineNum = 2359327;BA.debugLine="Private btnagregarCarritoDetalle As Button";
self->__btnagregarcarritodetalle = [B4IButtonWrapper new];
B4IRDebugUtils.currentLine=2359328;
 //BA.debugLineNum = 2359328;BA.debugLine="Private StepperCantidad As Stepper";
self->__steppercantidad = [B4IStepperWrapper new];
B4IRDebugUtils.currentLine=2359329;
 //BA.debugLineNum = 2359329;BA.debugLine="Private lblPrecio As Label";
self->__lblprecio = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359330;
 //BA.debugLineNum = 2359330;BA.debugLine="Private PanelImagenDetalles As Panel";
self->__panelimagendetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2359331;
 //BA.debugLineNum = 2359331;BA.debugLine="Private PanelFondoDetalles As Panel";
self->__panelfondodetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2359332;
 //BA.debugLineNum = 2359332;BA.debugLine="Private lblcantidad As Label";
self->__lblcantidad = [B4ILabelWrapper new];
B4IRDebugUtils.currentLine=2359333;
 //BA.debugLineNum = 2359333;BA.debugLine="Private PanellblCantidad As Panel";
self->__panellblcantidad = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2359334;
 //BA.debugLineNum = 2359334;BA.debugLine="Private PanelEncabezadoDetalles As Panel";
self->__panelencabezadodetalles = [B4IPanelWrapper new];
B4IRDebugUtils.currentLine=2359335;
 //BA.debugLineNum = 2359335;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _steppercantidad_valuechanged:(double) _value{
B4IRDebugUtils.currentModule=@"categoria";
if ([B4IDebug shouldDelegate: @"steppercantidad_valuechanged"])
	 {return ((NSString*) [B4IDebug delegate:self.bi :@"steppercantidad_valuechanged:" :@[@(_value)]]);}
B4IRDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="Sub StepperCantidad_ValueChanged (Value As Double)";
B4IRDebugUtils.currentLine=3276801;
 //BA.debugLineNum = 3276801;BA.debugLine="lblcantidad.Text = Value";
[self->__lblcantidad setText:[self.bi NumberToString:@(_value)]];
B4IRDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="End Sub";
return @"";
}
@end