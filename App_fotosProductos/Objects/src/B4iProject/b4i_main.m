
#import "b4i_main.h"
#import "b4i_customlistview.h"
#import "b4i_httputils2service.h"
#import "b4i_httpjob.h"

@interface ResumableSub_main_btnTipoCategoria_Click :B4IResumableSub 
- (instancetype) init: (b4i_main*) parent1;
@end
@implementation ResumableSub_main_btnTipoCategoria_Click {
b4i_main* parent;
B4IActionSheetWrapper* _sheet;
B4IList* _li;
int _i;
B4IMap* _mapa;
NSString* _tipo;
}
- (instancetype) init: (b4i_main*) parent1 {
self->parent = parent1;
return self;
}
int step4;
int limit4;
int step12;
int limit12;
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
 //BA.debugLineNum = 128;BA.debugLine="Dim sheet As ActionSheet";
self->_sheet = [B4IActionSheetWrapper new];
 //BA.debugLineNum = 130;BA.debugLine="Dim li As List";
self->_li = [B4IList new];
 //BA.debugLineNum = 131;BA.debugLine="li.Initialize";
[self->_li Initialize];
 //BA.debugLineNum = 133;BA.debugLine="For i=0 To listaCategoria.Size-1";
if (true) break;

case 1:
//for
self->_state = 4;
step4 = 1;
limit4 = (int) ([parent->__listacategoria Size]-1);
self->_i = (int) (0) ;
self->_state = 19;
if (true) break;

case 19:
//C
self->_state = 4;
if ((step4 > 0 && self->_i <= limit4) || (step4 < 0 && self->_i >= limit4)) self->_state = 3;
if (true) break;

case 20:
//C
self->_state = 19;
self->_i = ((int)(0 + self->_i + step4)) ;
if (true) break;

case 3:
//C
self->_state = 20;
 //BA.debugLineNum = 135;BA.debugLine="Dim mapa As Map = listaCategoria.Get(i)";
self->_mapa = (B4IMap*)([parent->__listacategoria Get:self->_i]);
 //BA.debugLineNum = 136;BA.debugLine="li.Add(mapa.Get(\"f_descripcion\"))";
[self->_li Add:[self->_mapa Get:(NSObject*)(@"f_descripcion")]];
 if (true) break;
if (true) break;

case 4:
//C
self->_state = 5;
;
 //BA.debugLineNum = 140;BA.debugLine="sheet.Initialize(\"sheet\", \"Categorias\", \"Cancel\"";
[self->_sheet Initialize:self.bi :@"sheet" :@"Categorias" :@"Cancel" :@"" :self->_li];
 //BA.debugLineNum = 141;BA.debugLine="sheet.Show(Page1.RootPanel)";
[self->_sheet Show:(UIView*)(([parent->__page1 RootPanel]).object)];
 //BA.debugLineNum = 142;BA.debugLine="Wait For sheet_Click (tipo As String)";
[parent->___c WaitFor:@"sheet_click:" :self.bi :self :nil];
self->_state = 21;
return;
case 21:
//C
self->_state = 5;
self->_tipo = ((NSString*) result[0]);
;
 //BA.debugLineNum = 144;BA.debugLine="If tipo <> \"Cancel\" Then";
if (true) break;

case 5:
//if
self->_state = 18;
if ([self->_tipo isEqual:@"Cancel"] == false) { 
self->_state = 7;
}else {
self->_state = 17;
}if (true) break;

case 7:
//C
self->_state = 8;
 //BA.debugLineNum = 146;BA.debugLine="For i = 0 To listaCategoria.Size-1";
if (true) break;

case 8:
//for
self->_state = 15;
step12 = 1;
limit12 = (int) ([parent->__listacategoria Size]-1);
self->_i = (int) (0) ;
self->_state = 22;
if (true) break;

case 22:
//C
self->_state = 15;
if ((step12 > 0 && self->_i <= limit12) || (step12 < 0 && self->_i >= limit12)) self->_state = 10;
if (true) break;

case 23:
//C
self->_state = 22;
self->_i = ((int)(0 + self->_i + step12)) ;
if (true) break;

case 10:
//C
self->_state = 11;
 //BA.debugLineNum = 148;BA.debugLine="Dim mapa As Map = listaCategoria.Get(i)";
self->_mapa = (B4IMap*)([parent->__listacategoria Get:self->_i]);
 //BA.debugLineNum = 150;BA.debugLine="If mapa.Get(\"f_descripcion\") == tipo Then";
if (true) break;

case 11:
//if
self->_state = 14;
if ([[self->_mapa Get:(NSObject*)(@"f_descripcion")] isEqual:(NSObject*)(self->_tipo)]) { 
self->_state = 13;
}if (true) break;

case 13:
//C
self->_state = 14;
 //BA.debugLineNum = 151;BA.debugLine="idCategoria = mapa.Get(\"f_idrecord\")";
parent->__idcategoria = [self.bi ObjectToString:[self->_mapa Get:(NSObject*)(@"f_idrecord")]];
 //BA.debugLineNum = 152;BA.debugLine="btnTipoCategoria.Text = tipo";
[parent->__btntipocategoria setText:self->_tipo];
 if (true) break;

case 14:
//C
self->_state = 23;
;
 if (true) break;
if (true) break;

case 15:
//C
self->_state = 18;
;
 if (true) break;

case 17:
//C
self->_state = 18;
 //BA.debugLineNum = 158;BA.debugLine="sheet.Dismiss";
[self->_sheet Dismiss];
 if (true) break;

case 18:
//C
self->_state = -1;
;
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end
@interface ResumableSub_main_Msg1_Click :B4IResumableSub 
- (instancetype) init: (b4i_main*) parent1 :(NSString*) _buttontext1;
@end
@implementation ResumableSub_main_Msg1_Click {
b4i_main* parent;
NSString* _buttontext;
B4IActionSheetWrapper* _sheet;
NSString* _tipo;
}
- (instancetype) init: (b4i_main*) parent1 :(NSString*) _buttontext1 {
self->_buttontext = _buttontext1;
self->parent = parent1;
return self;
}
- (void) resume:(B4I*)bi1 :(NSArray*)result {
self.bi = bi1;

    while (true) {
        switch (self->_state) {
            case -1:
return;

case 0:
//C
self->_state = 1;
 //BA.debugLineNum = 213;BA.debugLine="If ButtonText = \"Si\" Then";
if (true) break;

case 1:
//if
self->_state = 17;
if ([self->_buttontext isEqual:@"Si"]) { 
self->_state = 3;
}else if([self->_buttontext isEqual:@"No"]) { 
self->_state = 16;
}if (true) break;

case 3:
//C
self->_state = 4;
 //BA.debugLineNum = 215;BA.debugLine="Dim sheet As ActionSheet";
self->_sheet = [B4IActionSheetWrapper new];
 //BA.debugLineNum = 216;BA.debugLine="sheet.Initialize(\"sheet\", \"My photo\", \"Cancel\" ,";
[self->_sheet Initialize:self.bi :@"sheet" :@"My photo" :@"Cancel" :@"" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Take Photo")],[B4I nilToNSNull:(NSObject*)(@"Choose Photo")]]]]];
 //BA.debugLineNum = 217;BA.debugLine="sheet.Show(Page1.RootPanel)";
[self->_sheet Show:(UIView*)(([parent->__page1 RootPanel]).object)];
 //BA.debugLineNum = 218;BA.debugLine="Wait For sheet_Click (tipo As String)";
[parent->___c WaitFor:@"sheet_click:" :self.bi :self :nil];
self->_state = 18;
return;
case 18:
//C
self->_state = 4;
self->_tipo = ((NSString*) result[0]);
;
 //BA.debugLineNum = 220;BA.debugLine="If tipo <> \"Cancel\" Then";
if (true) break;

case 4:
//if
self->_state = 14;
if ([self->_tipo isEqual:@"Cancel"] == false) { 
self->_state = 6;
}if (true) break;

case 6:
//C
self->_state = 7;
 //BA.debugLineNum = 222;BA.debugLine="If tipo == \"Take Photo\" Then";
if (true) break;

case 7:
//if
self->_state = 10;
if ([self->_tipo isEqual:@"Take Photo"]) { 
self->_state = 9;
}if (true) break;

case 9:
//C
self->_state = 10;
 //BA.debugLineNum = 223;BA.debugLine="InitCamera";
[parent _initcamera];
 //BA.debugLineNum = 224;BA.debugLine="cam.TakePicture";
[parent->__cam TakePicture];
 if (true) break;
;
 //BA.debugLineNum = 227;BA.debugLine="If tipo == \"Choose Photo\" Then";

case 10:
//if
self->_state = 13;
if ([self->_tipo isEqual:@"Choose Photo"]) { 
self->_state = 12;
}if (true) break;

case 12:
//C
self->_state = 13;
 //BA.debugLineNum = 228;BA.debugLine="InitCamera";
[parent _initcamera];
 //BA.debugLineNum = 229;BA.debugLine="cam.SelectFromSavedPhotos(Sender, cam.TYPE_ALL";
[parent->__cam SelectFromSavedPhotos:[parent->___c Sender:self.bi] :[parent->__cam TYPE_ALL]];
 if (true) break;

case 13:
//C
self->_state = 14;
;
 if (true) break;

case 14:
//C
self->_state = 17;
;
 if (true) break;

case 16:
//C
self->_state = 17;
 //BA.debugLineNum = 236;BA.debugLine="Return";
if (true) return ;
 if (true) break;

case 17:
//C
self->_state = -1;
;
 //BA.debugLineNum = 239;BA.debugLine="End Sub";
if (true) break;

            }
        }
    }
@end

@implementation b4i_main 


+ (instancetype)new {
    static b4i_main* shared = nil;
    if (shared == nil) {
        shared = [self alloc];
        shared.bi = [[B4I alloc] init:shared];
        shared.__c = [B4ICommon new];
    }
    return shared;
}

- (NSString*)  _application_background{
 //BA.debugLineNum = 121;BA.debugLine="Private Sub Application_Background";
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _application_start:(B4INavigationControllerWrapper*) _nav{
[self initializeStaticModules];
B4IMap* _mapa = nil;
b4i_httpjob* _jobcate = nil;
 //BA.debugLineNum = 69;BA.debugLine="Private Sub Application_Start (Nav As NavigationCo";
 //BA.debugLineNum = 71;BA.debugLine="NavControl = Nav";
self->__navcontrol = _nav;
 //BA.debugLineNum = 72;BA.debugLine="Page1.Initialize(\"Page1\")";
[self->__page1 Initialize:self.bi :@"Page1"];
 //BA.debugLineNum = 73;BA.debugLine="Page1.RootPanel.LoadLayout(\"frmListaProductos\")";
[[self->__page1 RootPanel] LoadLayout:@"frmListaProductos" :self.bi];
 //BA.debugLineNum = 74;BA.debugLine="Page1.RootPanel.Color = Colors.White";
[[self->__page1 RootPanel] setColor:[[self->___c Colors] White]];
 //BA.debugLineNum = 75;BA.debugLine="NavControl.ShowPage(Page1)";
[self->__navcontrol ShowPage:(UIViewController*)((self->__page1).object)];
 //BA.debugLineNum = 76;BA.debugLine="NavControl.NavigationBarVisible = False";
[self->__navcontrol setNavigationBarVisible:false];
 //BA.debugLineNum = 77;BA.debugLine="MapaProducto.Initialize";
[self->__mapaproducto Initialize];
 //BA.debugLineNum = 80;BA.debugLine="CallListaPrincipal";
[self _calllistaprincipal];
 //BA.debugLineNum = 83;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
 //BA.debugLineNum = 84;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
 //BA.debugLineNum = 88;BA.debugLine="Dim jobcate As HttpJob";
_jobcate = [b4i_httpjob new];
 //BA.debugLineNum = 89;BA.debugLine="jobcate.Initialize(\"categoria\",Me)";
[_jobcate _initialize /*NSString**/ :self.bi :@"categoria" :self];
 //BA.debugLineNum = 91;BA.debugLine="mapa.Put(\"f_idempresa\",idempresa)";
[_mapa Put:(NSObject*)(@"f_idempresa") :(NSObject*)(@(self->__idempresa))];
 //BA.debugLineNum = 93;BA.debugLine="jobcate.PostString(url&\"/fotos/categoria\",\"dato=\"";
[_jobcate _poststring /*NSString**/ :[@[self->__url,@"/fotos/categoria"] componentsJoinedByString:@""] :[@[@"dato=",[self _convertir:(NSObject*)(_mapa)]] componentsJoinedByString:@""]];
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _base64_decode:(NSString*) _text{
iStringUtils* _su = nil;
B4IArray* _b = nil;
NSString* _res = @"";
 //BA.debugLineNum = 367;BA.debugLine="Sub base64_Decode(text As String) As String";
 //BA.debugLineNum = 369;BA.debugLine="If text = Null Or text.Length = 0 Or text = \"\" Th";
if (_text== nil || [_text Length]==0 || [_text isEqual:@""]) { 
 //BA.debugLineNum = 370;BA.debugLine="Return \"\"";
if (true) return @"";
 };
 //BA.debugLineNum = 373;BA.debugLine="Dim su As StringUtils";
_su = [iStringUtils new];
 //BA.debugLineNum = 374;BA.debugLine="Dim b() As Byte = su.DecodeBase64(text)";
_b = [_su DecodeBase64:_text];
 //BA.debugLineNum = 376;BA.debugLine="Dim res As String = BytesToString(b , 0, b.Length";
_res = [self->___c BytesToString:_b :(int) (0) :_b.Length :@"UTF8"];
 //BA.debugLineNum = 378;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnbuscar_click{
B4IMap* _mapa = nil;
b4i_httpjob* _job = nil;
 //BA.debugLineNum = 303;BA.debugLine="Sub btnBuscar_Click";
 //BA.debugLineNum = 305;BA.debugLine="If txtNombreRef.Text == \"\" And idCategoria <= 0 T";
if ([[self->__txtnombreref Text] isEqual:@""] && [self.bi ObjectToNumber:self->__idcategoria].doubleValue<=0) { 
 //BA.debugLineNum = 306;BA.debugLine="Msgbox(\"Antes de buscar un producto debe de pone";
[self->___c Msgbox:@"Antes de buscar un producto debe de poner su referencia, o seleccionar una categoria" :@"Aviso!"];
 //BA.debugLineNum = 307;BA.debugLine="txtNombreRef.RequestFocus";
[self->__txtnombreref RequestFocus];
 //BA.debugLineNum = 308;BA.debugLine="Return";
if (true) return @"";
 }else {
 //BA.debugLineNum = 312;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
 //BA.debugLineNum = 313;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
 //BA.debugLineNum = 315;BA.debugLine="mapa.Put(\"f_idempresa\",idempresa)";
[_mapa Put:(NSObject*)(@"f_idempresa") :(NSObject*)(@(self->__idempresa))];
 //BA.debugLineNum = 316;BA.debugLine="mapa.Put(\"f_buscando\",True)";
[_mapa Put:(NSObject*)(@"f_buscando") :(NSObject*)(@(true))];
 //BA.debugLineNum = 317;BA.debugLine="mapa.Put(\"f_nombre\",txtNombreRef.Text)";
[_mapa Put:(NSObject*)(@"f_nombre") :(NSObject*)([self->__txtnombreref Text])];
 //BA.debugLineNum = 318;BA.debugLine="mapa.Put(\"f_categoria\",idCategoria)";
[_mapa Put:(NSObject*)(@"f_categoria") :(NSObject*)(self->__idcategoria)];
 //BA.debugLineNum = 320;BA.debugLine="Dim job As HttpJob";
_job = [b4i_httpjob new];
 //BA.debugLineNum = 321;BA.debugLine="job.Initialize(\"busqueda\",Me)";
[_job _initialize /*NSString**/ :self.bi :@"busqueda" :self];
 //BA.debugLineNum = 323;BA.debugLine="hudListacargar.ProgressDialogShow(\"Buscando...\"";
[self->__hudlistacargar ProgressDialogShow:@"Buscando..."];
 //BA.debugLineNum = 324;BA.debugLine="job.PostString(url&\"/fotos/lista\",\"dato=\"&co";
[_job _poststring /*NSString**/ :[@[self->__url,@"/fotos/lista"] componentsJoinedByString:@""] :[@[@"dato=",[self _convertir:(NSObject*)(_mapa)]] componentsJoinedByString:@""]];
 };
 //BA.debugLineNum = 329;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btncancelarfoto_click{
 //BA.debugLineNum = 462;BA.debugLine="Sub btnCancelarFoto_Click";
 //BA.debugLineNum = 464;BA.debugLine="If enviado Then";
if (self->__enviado) { 
 //BA.debugLineNum = 465;BA.debugLine="PanelFondoImagen.Visible = False";
[self->__panelfondoimagen setVisible:false];
 //BA.debugLineNum = 466;BA.debugLine="enviado = False";
self->__enviado = false;
 }else {
 //BA.debugLineNum = 468;BA.debugLine="Msgbox2(\"Msg2\",\"Desea cancelar este proceso? La";
[self->___c Msgbox2:self.bi :@"Msg2" :@"Desea cancelar este proceso? La foto todavia no ha sido guardada" :@"Aviso!" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 };
 //BA.debugLineNum = 471;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _btnenviar_click{
B4IMap* _mapa = nil;
B4IMap* _mapdato = nil;
B4IList* _list = nil;
_multipartfiledata* _multipart = nil;
b4i_httpjob* _job = nil;
 //BA.debugLineNum = 422;BA.debugLine="Sub btnEnviar_Click";
 //BA.debugLineNum = 424;BA.debugLine="Dim mapa,mapDato As Map";
_mapa = [B4IMap new];
_mapdato = [B4IMap new];
 //BA.debugLineNum = 425;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
 //BA.debugLineNum = 426;BA.debugLine="mapDato.Initialize";
[_mapdato Initialize];
 //BA.debugLineNum = 428;BA.debugLine="Dim list As List";
_list = [B4IList new];
 //BA.debugLineNum = 435;BA.debugLine="File.WriteBytes(File.DirTemp,\"f_foto.png\",getByte";
[[self->___c File] WriteBytes:[[self->___c File] DirTemp] :@"f_foto.png" :[self _getbyteimagen:[[self->__imgmyfoto Bitmap] Resize:(float) (500) :(float) (500) :true]]];
 //BA.debugLineNum = 437;BA.debugLine="Dim multipart As MultipartFileData";
_multipart = [_multipartfiledata new];
 //BA.debugLineNum = 438;BA.debugLine="multipart.Initialize";
[_multipart Initialize];
 //BA.debugLineNum = 439;BA.debugLine="multipart.ContentType= \"application/octet-stream\"";
_multipart->_ContentType /*NSString**/  = @"application/octet-stream";
 //BA.debugLineNum = 440;BA.debugLine="multipart.Dir = File.DirTemp";
_multipart->_Dir /*NSString**/  = [[self->___c File] DirTemp];
 //BA.debugLineNum = 441;BA.debugLine="multipart.FileName = \"f_foto.png\"";
_multipart->_FileName /*NSString**/  = @"f_foto.png";
 //BA.debugLineNum = 442;BA.debugLine="multipart.KeyName =\"f_foto\"";
_multipart->_KeyName /*NSString**/  = @"f_foto";
 //BA.debugLineNum = 443;BA.debugLine="list.Initialize";
[_list Initialize];
 //BA.debugLineNum = 444;BA.debugLine="list.Add(multipart)";
[_list Add:(NSObject*)(_multipart)];
 //BA.debugLineNum = 447;BA.debugLine="mapa.Put(\"f_idempresa\",idempresa)";
[_mapa Put:(NSObject*)(@"f_idempresa") :(NSObject*)(@(self->__idempresa))];
 //BA.debugLineNum = 448;BA.debugLine="mapa.Put(\"f_idproducto\",MapaProducto.Get(\"f_idrec";
[_mapa Put:(NSObject*)(@"f_idproducto") :[self->__mapaproducto Get:(NSObject*)(@"f_idrecord")]];
 //BA.debugLineNum = 449;BA.debugLine="mapDato.Put(\"dato\",convertir(mapa))";
[_mapdato Put:(NSObject*)(@"dato") :(NSObject*)([self _convertir:(NSObject*)(_mapa)])];
 //BA.debugLineNum = 452;BA.debugLine="Dim job As HttpJob";
_job = [b4i_httpjob new];
 //BA.debugLineNum = 453;BA.debugLine="job.Initialize(\"actualizar\",Me)";
[_job _initialize /*NSString**/ :self.bi :@"actualizar" :self];
 //BA.debugLineNum = 455;BA.debugLine="hudEnviar.ProgressDialogShow(\"Enviando...\")";
[self->__hudenviar ProgressDialogShow:@"Enviando..."];
 //BA.debugLineNum = 456;BA.debugLine="job.PostMultipart(url&\"/fotos/actualizar\",mapDato";
[_job _postmultipart /*NSString**/ :[@[self->__url,@"/fotos/actualizar"] componentsJoinedByString:@""] :_mapdato :_list];
 //BA.debugLineNum = 460;BA.debugLine="End Sub";
return @"";
}
- (void)  _btntipocategoria_click{
ResumableSub_main_btnTipoCategoria_Click* rsub = [[ResumableSub_main_btnTipoCategoria_Click alloc] init:self ];
[rsub resume:self.bi :nil];
}
//-467500828
- (void)  _sheet_click:(NSString*) _tipo{
}
- (NSString*)  _calllistaprincipal{
B4IMap* _mapa = nil;
b4i_httpjob* _job = nil;
 //BA.debugLineNum = 97;BA.debugLine="Sub CallListaPrincipal";
 //BA.debugLineNum = 99;BA.debugLine="Dim mapa As Map";
_mapa = [B4IMap new];
 //BA.debugLineNum = 100;BA.debugLine="mapa.Initialize";
[_mapa Initialize];
 //BA.debugLineNum = 102;BA.debugLine="mapa.Put(\"f_idempresa\",idempresa)";
[_mapa Put:(NSObject*)(@"f_idempresa") :(NSObject*)(@(self->__idempresa))];
 //BA.debugLineNum = 103;BA.debugLine="mapa.Put(\"f_buscando\",False)";
[_mapa Put:(NSObject*)(@"f_buscando") :(NSObject*)(@(false))];
 //BA.debugLineNum = 104;BA.debugLine="mapa.Put(\"f_nombre\",\"\")";
[_mapa Put:(NSObject*)(@"f_nombre") :(NSObject*)(@"")];
 //BA.debugLineNum = 105;BA.debugLine="mapa.Put(\"f_categoria\",0)";
[_mapa Put:(NSObject*)(@"f_categoria") :(NSObject*)(@(0))];
 //BA.debugLineNum = 107;BA.debugLine="Dim job As HttpJob";
_job = [b4i_httpjob new];
 //BA.debugLineNum = 108;BA.debugLine="job.Initialize(\"lista\",Me)";
[_job _initialize /*NSString**/ :self.bi :@"lista" :self];
 //BA.debugLineNum = 110;BA.debugLine="hudListacargar.ProgressDialogShow(\"Cargando Lista";
[self->__hudlistacargar ProgressDialogShow:@"Cargando Lista!"];
 //BA.debugLineNum = 112;BA.debugLine="job.PostString(url&\"/fotos/lista\",\"dato=\"&convert";
[_job _poststring /*NSString**/ :[@[self->__url,@"/fotos/lista"] componentsJoinedByString:@""] :[@[@"dato=",[self _convertir:(NSObject*)(_mapa)]] componentsJoinedByString:@""]];
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _cam_complete:(BOOL) _success :(B4IBitmap*) _image :(NSString*) _videopath{
 //BA.debugLineNum = 389;BA.debugLine="Sub Cam_Complete (Success As Boolean, Image As Bit";
 //BA.debugLineNum = 391;BA.debugLine="If Success Then";
if (_success) { 
 //BA.debugLineNum = 392;BA.debugLine="If PanelFondoImagen.IsInitialized == False Then";
if ([self->__panelfondoimagen IsInitialized]==false) { 
 //BA.debugLineNum = 393;BA.debugLine="Page1.RootPanel.LoadLayout(\"frmImagen\")";
[[self->__page1 RootPanel] LoadLayout:@"frmImagen" :self.bi];
 };
 //BA.debugLineNum = 396;BA.debugLine="PanelFondoImagen.Visible = True";
[self->__panelfondoimagen setVisible:true];
 //BA.debugLineNum = 397;BA.debugLine="imgMyfoto.Bitmap = Image";
[self->__imgmyfoto setBitmap:_image];
 //BA.debugLineNum = 398;BA.debugLine="lbltituloImagen.Text = MapaProducto.Get(\"f_nombr";
[self->__lbltituloimagen setText:[@[[self.bi ObjectToString:[self->__mapaproducto Get:(NSObject*)(@"f_nombre")]],@" / ",[self.bi ObjectToString:[self->__mapaproducto Get:(NSObject*)(@"f_referencia")]]] componentsJoinedByString:@""]];
 };
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _convertir:(NSObject*) _data{
iStringUtils* _encode = nil;
B4IMap* _map = nil;
B4IJSONGenerator* _json = nil;
 //BA.debugLineNum = 336;BA.debugLine="Sub convertir(data As Object) As String";
 //BA.debugLineNum = 338;BA.debugLine="Dim encode As StringUtils";
_encode = [iStringUtils new];
 //BA.debugLineNum = 339;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
 //BA.debugLineNum = 340;BA.debugLine="map.Initialize";
[_map Initialize];
 //BA.debugLineNum = 341;BA.debugLine="map.Put(\"f_key\",getToken)";
[_map Put:(NSObject*)(@"f_key") :(NSObject*)([self _gettoken])];
 //BA.debugLineNum = 342;BA.debugLine="map.Put(\"f_data\",data)";
[_map Put:(NSObject*)(@"f_data") :_data];
 //BA.debugLineNum = 343;BA.debugLine="Dim json As JSONGenerator";
_json = [B4IJSONGenerator new];
 //BA.debugLineNum = 344;BA.debugLine="json.Initialize(map)";
[_json Initialize:_map];
 //BA.debugLineNum = 345;BA.debugLine="Return encode.EncodeBase64(json.ToString.GetBytes";
if (true) return [_encode EncodeBase64:[[_json ToString] GetBytes:@"UTF8"]];
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return @"";
}
- (B4XViewWrapper*)  _createitem:(NSString*) _nombre :(NSString*) _referencia{
B4XViewWrapper* _p = nil;
 //BA.debugLineNum = 176;BA.debugLine="Private Sub CreateItem(Nombre As String, Referenci";
 //BA.debugLineNum = 178;BA.debugLine="Dim p As B4XView = xui.CreatePanel(\"\")";
_p = [B4XViewWrapper new];
_p = [self->__xui CreatePanel:self.bi :@""];
 //BA.debugLineNum = 179;BA.debugLine="p.SetLayoutAnimated(100, 0,0,100%x,65dip)";
[_p SetLayoutAnimated:(int) (100) :(float) (0) :(float) (0) :[self->___c PerXToCurrent:(float) (100)] :(float) (((int) (65)))];
 //BA.debugLineNum = 180;BA.debugLine="p.LoadLayout(\"ItemList\")";
[_p LoadLayout:@"ItemList" :self.bi];
 //BA.debugLineNum = 183;BA.debugLine="lblNombre.Top = 15dip";
[self->__lblnombre setTop:(float) (((int) (15)))];
 //BA.debugLineNum = 184;BA.debugLine="lblNombre.Left = 15dip";
[self->__lblnombre setLeft:(float) (((int) (15)))];
 //BA.debugLineNum = 185;BA.debugLine="lblNombre.Width = 250dip";
[self->__lblnombre setWidth:(float) (((int) (250)))];
 //BA.debugLineNum = 186;BA.debugLine="lblNombre.Height = 14dip";
[self->__lblnombre setHeight:(float) (((int) (14)))];
 //BA.debugLineNum = 188;BA.debugLine="lblNombre.Text = Nombre";
[self->__lblnombre setText:_nombre];
 //BA.debugLineNum = 190;BA.debugLine="lblreferencia.Top = lblNombre.Top + 25dip";
[self->__lblreferencia setTop:(float) ([self->__lblnombre Top]+((int) (25)))];
 //BA.debugLineNum = 191;BA.debugLine="lblreferencia.Left = 15dip";
[self->__lblreferencia setLeft:(float) (((int) (15)))];
 //BA.debugLineNum = 192;BA.debugLine="lblreferencia.Width = 250dip";
[self->__lblreferencia setWidth:(float) (((int) (250)))];
 //BA.debugLineNum = 193;BA.debugLine="lblreferencia.Height = 14dip";
[self->__lblreferencia setHeight:(float) (((int) (14)))];
 //BA.debugLineNum = 195;BA.debugLine="lblreferencia.Text = Referencia";
[self->__lblreferencia setText:_referencia];
 //BA.debugLineNum = 197;BA.debugLine="p.Color = Colors.RGB(255,255,255)";
[_p setColor:[[self->___c Colors] RGB:(int) (255) :(int) (255) :(int) (255)]];
 //BA.debugLineNum = 199;BA.debugLine="Return p";
if (true) return _p;
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _createlista:(B4IList*) _listapro{
int _i = 0;
B4IMap* _mapa = nil;
 //BA.debugLineNum = 164;BA.debugLine="Sub CreateLista(listapro As List)";
 //BA.debugLineNum = 166;BA.debugLine="lista.Clear";
[self->__lista _clear /*NSString**/ ];
 //BA.debugLineNum = 167;BA.debugLine="For i=0 To listapro.Size-1";
{
const int step2 = 1;
const int limit2 = (int) ([_listapro Size]-1);
_i = (int) (0) ;
for (;_i <= limit2 ;_i = _i + step2 ) {
 //BA.debugLineNum = 169;BA.debugLine="Dim mapa As Map = listapro.Get(i)";
_mapa = (B4IMap*)([_listapro Get:_i]);
 //BA.debugLineNum = 171;BA.debugLine="lista.Add(CreateItem(mapa.Get(\"f_nombre\"),mapa.G";
[self->__lista _add /*NSString**/ :[self _createitem:[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_nombre")]] :[self.bi ObjectToString:[_mapa Get:(NSObject*)(@"f_referencia")]]] :(NSObject*)(_mapa)];
 }
};
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return @"";
}
- (B4IArray*)  _getbyteimagen:(B4IBitmap*) _bmap{
B4IOutputStream* _out = nil;
B4IArray* _data = nil;
 //BA.debugLineNum = 485;BA.debugLine="Sub getByteImagen(bmap As Bitmap) As Byte()";
 //BA.debugLineNum = 486;BA.debugLine="Dim out As OutputStream";
_out = [B4IOutputStream new];
 //BA.debugLineNum = 487;BA.debugLine="Dim data() As Byte";
_data = [[B4IArray alloc]initBytes:@[@((int) (0))]];
 //BA.debugLineNum = 488;BA.debugLine="out.InitializeToBytesArray(1)";
[_out InitializeToBytesArray:(int) (1)];
 //BA.debugLineNum = 489;BA.debugLine="bmap.WriteToStream(out,20,\"PNG\")";
[_bmap WriteToStream:_out :(int) (20) :@"PNG"];
 //BA.debugLineNum = 490;BA.debugLine="data = out.ToBytesArray";
_data = [_out ToBytesArray];
 //BA.debugLineNum = 492;BA.debugLine="out.Close";
[_out Close];
 //BA.debugLineNum = 494;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return nil;
}
- (B4IArray*)  _getbyteimagen2:(B4IBitmap*) _bmap{
B4IOutputStream* _out = nil;
B4IArray* _data = nil;
 //BA.debugLineNum = 501;BA.debugLine="Sub getByteImagen2(bmap As Bitmap) As Byte()";
 //BA.debugLineNum = 502;BA.debugLine="Dim out As OutputStream";
_out = [B4IOutputStream new];
 //BA.debugLineNum = 503;BA.debugLine="Dim data() As Byte";
_data = [[B4IArray alloc]initBytes:@[@((int) (0))]];
 //BA.debugLineNum = 504;BA.debugLine="out.InitializeToBytesArray(1)";
[_out InitializeToBytesArray:(int) (1)];
 //BA.debugLineNum = 505;BA.debugLine="bmap.WriteToStream(out,100,\"PNG\")";
[_bmap WriteToStream:_out :(int) (100) :@"PNG"];
 //BA.debugLineNum = 506;BA.debugLine="data = out.ToBytesArray";
_data = [_out ToBytesArray];
 //BA.debugLineNum = 508;BA.debugLine="Return data";
if (true) return _data;
 //BA.debugLineNum = 509;BA.debugLine="End Sub";
return nil;
}
- (NSString*)  _getmd5:(NSString*) _text{
B4IMessageDigest* _md = nil;
B4IArray* _data = nil;
B4IByteConverter* _bc = nil;
 //BA.debugLineNum = 349;BA.debugLine="Sub GetMD5 (Text As String) As String";
 //BA.debugLineNum = 350;BA.debugLine="Dim MD As MessageDigest";
_md = [B4IMessageDigest new];
 //BA.debugLineNum = 351;BA.debugLine="Dim Data() As Byte =  MD.GetMessageDigest(Text.Ge";
_data = [_md GetMessageDigest:[_text GetBytes:@"UTF8"] :@"MD5"];
 //BA.debugLineNum = 352;BA.debugLine="Dim BC As ByteConverter";
_bc = [B4IByteConverter new];
 //BA.debugLineNum = 353;BA.debugLine="Return BC.HexFromBytes(Data)";
if (true) return [_bc HexFromBytes:_data];
 //BA.debugLineNum = 354;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _gettoken{
NSString* _code = @"";
 //BA.debugLineNum = 356;BA.debugLine="Sub getToken() As String";
 //BA.debugLineNum = 358;BA.debugLine="DateTime.DateFormat = \"MM/dd/yyyy\"";
[[self->___c DateTime] setDateFormat:@"MM/dd/yyyy"];
 //BA.debugLineNum = 360;BA.debugLine="Dim code As String = \"solomujeresamericanas@\"&Dat";
_code = [@[@"solomujeresamericanas@",[[self->___c DateTime] Date:[[self->___c DateTime] Now]]] componentsJoinedByString:@""];
 //BA.debugLineNum = 363;BA.debugLine="Return GetMD5(code)";
if (true) return [self _getmd5:_code];
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _initcamera{
 //BA.debugLineNum = 384;BA.debugLine="Sub InitCamera";
 //BA.debugLineNum = 385;BA.debugLine="cam.Initialize(\"cam\", Page1)";
[self->__cam Initialize:self.bi :@"cam" :self->__page1];
 //BA.debugLineNum = 386;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _jobdone:(b4i_httpjob*) _job{
B4IMap* _map = nil;
B4IList* _list = nil;
B4IJSONParser* _json2 = nil;
B4IMap* _ma = nil;
 //BA.debugLineNum = 242;BA.debugLine="Sub JobDone(Job As HttpJob)";
 //BA.debugLineNum = 244;BA.debugLine="If Job.Success = False Then";
if (_job->__success /*BOOL*/ ==false) { 
 //BA.debugLineNum = 245;BA.debugLine="Msgbox(jobMsj,jobMsjTitle)";
[self->___c Msgbox:self->__jobmsj :self->__jobmsjtitle];
 //BA.debugLineNum = 246;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 249;BA.debugLine="Dim map As Map";
_map = [B4IMap new];
 //BA.debugLineNum = 250;BA.debugLine="Dim list As List";
_list = [B4IList new];
 //BA.debugLineNum = 251;BA.debugLine="Dim json2 As JSONParser";
_json2 = [B4IJSONParser new];
 //BA.debugLineNum = 254;BA.debugLine="json2.Initialize(base64_Decode(Job.GetString))";
[_json2 Initialize:[self _base64_decode:[_job _getstring /*NSString**/ ]]];
 //BA.debugLineNum = 256;BA.debugLine="map = json2.NextObject";
_map = [_json2 NextObject];
 //BA.debugLineNum = 258;BA.debugLine="Select Job.JobName";
switch ([self.bi switchObjectToInt:_job->__jobname /*NSString**/  :@[@"lista",@"categoria",@"busqueda",@"actualizar"]]) {
case 0: {
 //BA.debugLineNum = 262;BA.debugLine="hudListacargar.ProgressDialogHide";
[self->__hudlistacargar ProgressDialogHide];
 //BA.debugLineNum = 264;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
 //BA.debugLineNum = 265;BA.debugLine="CreateLista(list)";
[self _createlista:_list];
 break; }
case 1: {
 //BA.debugLineNum = 269;BA.debugLine="listaCategoria = map.Get(\"f_data\")";
self->__listacategoria.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
 break; }
case 2: {
 //BA.debugLineNum = 273;BA.debugLine="hudListacargar.ProgressDialogHide";
[self->__hudlistacargar ProgressDialogHide];
 //BA.debugLineNum = 275;BA.debugLine="list = map.Get(\"f_data\")";
_list.object = (NSArray*)([_map Get:(NSObject*)(@"f_data")]);
 //BA.debugLineNum = 276;BA.debugLine="idCategoria = 0";
self->__idcategoria = [self.bi NumberToString:@(0)];
 //BA.debugLineNum = 277;BA.debugLine="CreateLista(list)";
[self _createlista:_list];
 break; }
case 3: {
 //BA.debugLineNum = 281;BA.debugLine="hudEnviar.ProgressDialogHide";
[self->__hudenviar ProgressDialogHide];
 //BA.debugLineNum = 282;BA.debugLine="File.Delete(File.DirTemp,\"f_foto.png\")";
[[self->___c File] Delete:[[self->___c File] DirTemp] :@"f_foto.png"];
 //BA.debugLineNum = 284;BA.debugLine="Dim ma As Map";
_ma = [B4IMap new];
 //BA.debugLineNum = 285;BA.debugLine="ma = map.Get(\"f_data\")";
_ma = (B4IMap*)([_map Get:(NSObject*)(@"f_data")]);
 //BA.debugLineNum = 287;BA.debugLine="If ma.Get(\"f_bandera\") Then";
if ([self.bi ObjectToBoolean:[_ma Get:(NSObject*)(@"f_bandera")]]) { 
 //BA.debugLineNum = 288;BA.debugLine="Msgbox(ma.Get(\"f_mensaje\"),\"Exito!!\")";
[self->___c Msgbox:[self.bi ObjectToString:[_ma Get:(NSObject*)(@"f_mensaje")]] :@"Exito!!"];
 //BA.debugLineNum = 290;BA.debugLine="enviado = True";
self->__enviado = true;
 //BA.debugLineNum = 291;BA.debugLine="btnCancelarFoto_Click";
[self _btncancelarfoto_click];
 //BA.debugLineNum = 292;BA.debugLine="CallListaPrincipal";
[self _calllistaprincipal];
 }else {
 //BA.debugLineNum = 295;BA.debugLine="Msgbox(ma.Get(\"f_mensaje\"),\"Ups ha ocurrido un";
[self->___c Msgbox:[self.bi ObjectToString:[_ma Get:(NSObject*)(@"f_mensaje")]] :@"Ups ha ocurrido un error!!"];
 };
 break; }
}
;
 //BA.debugLineNum = 301;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _lista_itemclick:(int) _index :(NSObject*) _value{
 //BA.debugLineNum = 203;BA.debugLine="Sub lista_ItemClick (Index As Int, Value As Object";
 //BA.debugLineNum = 205;BA.debugLine="MapaProducto  = Value";
self->__mapaproducto = (B4IMap*)(_value);
 //BA.debugLineNum = 207;BA.debugLine="Msgbox2(\"Msg1\",\"Desea tomarle una foto al product";
[self->___c Msgbox2:self.bi :@"Msg1" :[@[@"Desea tomarle una foto al producto ",[self.bi ObjectToString:[self->__mapaproducto Get:(NSObject*)(@"f_nombre")]],@"?"] componentsJoinedByString:@""] :@"Pregunta" :[self.bi ArrayToList:[[B4IArray alloc]initObjectsWithData:@[[B4I nilToNSNull:(NSObject*)(@"Si")],[B4I nilToNSNull:(NSObject*)(@"No")]]]]];
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return @"";
}
- (void)  _msg1_click:(NSString*) _buttontext{
ResumableSub_main_Msg1_Click* rsub = [[ResumableSub_main_Msg1_Click alloc] init:self : _buttontext];
[rsub resume:self.bi :nil];
}
//-1173193986
- (NSString*)  _msg2_click:(NSString*) _buttontext{
 //BA.debugLineNum = 473;BA.debugLine="Sub Msg2_Click(ButtonText As String)";
 //BA.debugLineNum = 475;BA.debugLine="If ButtonText = \"Si\" Then";
if ([_buttontext isEqual:@"Si"]) { 
 //BA.debugLineNum = 477;BA.debugLine="PanelFondoImagen.Visible = False";
[self->__panelfondoimagen setVisible:false];
 }else if([_buttontext isEqual:@"No"]) { 
 //BA.debugLineNum = 480;BA.debugLine="Return";
if (true) return @"";
 };
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return @"";
}
- (NSString*)  _page1_resize:(int) _width :(int) _height{
 //BA.debugLineNum = 117;BA.debugLine="Private Sub Page1_Resize(Width As Int, Height As I";
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return @"";
}

- (void)initializeStaticModules {
    [[b4i_main new]initializeModule];
[[b4i_httputils2service new]initializeModule];
[[b4i_dateutils new]initializeModule];

}
- (NSString*)  _process_globals{
self->__httputils2service=[b4i_httputils2service new];
self->__dateutils=[b4i_dateutils new];
 //BA.debugLineNum = 24;BA.debugLine="Sub Process_Globals";
 //BA.debugLineNum = 28;BA.debugLine="Dim xui As XUI";
self->__xui = [B4IXUI new];
 //BA.debugLineNum = 29;BA.debugLine="Dim url As String = \"https://www.fernandezsuperma";
self->__url = @"https://www.fernandezsupermarket.com/api/ios/producto_fotos";
 //BA.debugLineNum = 33;BA.debugLine="Dim idempresa As Int = 1000";
self->__idempresa = (int) (1000);
 //BA.debugLineNum = 35;BA.debugLine="Dim jobMsj As String = \"No se pudo conectar con e";
self->__jobmsj = @"No se pudo conectar con el servidor. Compruebe su conexión a internet.";
 //BA.debugLineNum = 36;BA.debugLine="Dim jobMsjTitle As String = \"Problemas de conexió";
self->__jobmsjtitle = @"Problemas de conexión";
 //BA.debugLineNum = 37;BA.debugLine="Private cam As Camera";
self->__cam = [B4ICamera new];
 //BA.debugLineNum = 38;BA.debugLine="Dim MapaProducto As Map";
self->__mapaproducto = [B4IMap new];
 //BA.debugLineNum = 39;BA.debugLine="Dim listaCategoria As List";
self->__listacategoria = [B4IList new];
 //BA.debugLineNum = 40;BA.debugLine="Dim idCategoria = 0";
self->__idcategoria = [self.bi NumberToString:@(0)];
 //BA.debugLineNum = 41;BA.debugLine="Dim enviado As Boolean = False";
self->__enviado = false;
 //BA.debugLineNum = 44;BA.debugLine="Dim hudListacargar As HUD";
self->__hudlistacargar = [iHUD new];
 //BA.debugLineNum = 45;BA.debugLine="Dim hudEnviar As HUD";
self->__hudenviar = [iHUD new];
 //BA.debugLineNum = 47;BA.debugLine="Public App As Application";
self->__app = [B4IApplicationWrapper new];
 //BA.debugLineNum = 48;BA.debugLine="Public NavControl As NavigationController";
self->__navcontrol = [B4INavigationControllerWrapper new];
 //BA.debugLineNum = 49;BA.debugLine="Private Page1 As Page";
self->__page1 = [B4IPage new];
 //BA.debugLineNum = 51;BA.debugLine="Private btnTipoCategoria As Button";
self->__btntipocategoria = [B4IButtonWrapper new];
 //BA.debugLineNum = 52;BA.debugLine="Private lista As CustomListView";
self->__lista = [b4i_customlistview new];
 //BA.debugLineNum = 53;BA.debugLine="Private PanelFondo As Panel";
self->__panelfondo = [B4IPanelWrapper new];
 //BA.debugLineNum = 54;BA.debugLine="Private txtNombreRef As TextField";
self->__txtnombreref = [B4ITextFieldWrapper new];
 //BA.debugLineNum = 55;BA.debugLine="Private btnTomarFoto As Button";
self->__btntomarfoto = [B4IButtonWrapper new];
 //BA.debugLineNum = 56;BA.debugLine="Private lblNombre As Label";
self->__lblnombre = [B4ILabelWrapper new];
 //BA.debugLineNum = 57;BA.debugLine="Private lblreferencia As Label";
self->__lblreferencia = [B4ILabelWrapper new];
 //BA.debugLineNum = 58;BA.debugLine="Private Panel1 As Panel";
self->__panel1 = [B4IPanelWrapper new];
 //BA.debugLineNum = 61;BA.debugLine="Private btnCancelarFoto As Button";
self->__btncancelarfoto = [B4IButtonWrapper new];
 //BA.debugLineNum = 62;BA.debugLine="Private btnEnviar As Button";
self->__btnenviar = [B4IButtonWrapper new];
 //BA.debugLineNum = 63;BA.debugLine="Private imgMyfoto As ImageView";
self->__imgmyfoto = [B4IImageViewWrapper new];
 //BA.debugLineNum = 64;BA.debugLine="Private lbltituloImagen As Label";
self->__lbltituloimagen = [B4ILabelWrapper new];
 //BA.debugLineNum = 65;BA.debugLine="Private PanelFondoImagen As Panel";
self->__panelfondoimagen = [B4IPanelWrapper new];
 //BA.debugLineNum = 66;BA.debugLine="Private btnBuscar As Button";
self->__btnbuscar = [B4IButtonWrapper new];
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return @"";
}
@end
