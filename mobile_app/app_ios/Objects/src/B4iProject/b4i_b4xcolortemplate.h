#import "iCore.h"
#import "iXUI.h"
#import "iHUD.h"
#import "iPhone.h"
#import "iJSON.h"
#import "iStringUtils.h"
#import "iHttp.h"
#import "iSQL.h"
#import "iTableView.h"
#import "iBitmapCreator.h"
#import "iDateUtils.h"
#import "xCustomListView.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_principal;
@class b4i_funcion;
@class b4i_facturacion;
@class b4i_direcciones;
@class b4i_reporteordenes;
@class b4i_httputils2service;
@class _typeu;
@class _multipartfiledata;
@class b4i_httpjob;
@class b4i_animatedcounter;
@class b4i_anotherprogressbar;
@class b4i_b4xbreadcrumb;
@class _colorpickerpart;
@class b4i_b4xcombobox;
@class b4i_b4xdatetemplate;
@class b4i_b4xdialog;
@class b4i_b4xfloattextfield;
@class b4i_b4xinputtemplate;
@class b4i_b4xlisttemplate;
@class b4i_b4xloadingindicator;
@class b4i_b4xlongtexttemplate;
@class b4i_b4xplusminus;
@class b4i_b4xsearchtemplate;
@class b4i_b4xsignaturetemplate;
@class b4i_b4xswitch;
@class b4i_b4xtimedtemplate;
@class _b4xformatdata;
@class b4i_b4xformatter;
@class b4i_roundslider;
@class b4i_scrollinglabel;
@class b4i_swiftbutton;
@interface b4i_b4xcolortemplate : B4IClass
{
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public int __selectedalpha;
@public b4i_bitmapcreator* __bccolors;
@public float __selectedh;
@public float __selecteds;
@public float __selectedv;
@public float __devicescale;
@public float __colorscale;
@public b4i_bitmapcreator* __tempbc;
@public int __dont_change;
@public _colorpickerpart* __huebar;
@public _colorpickerpart* __colorpicker;
@public _colorpickerpart* __alphabar;
@public int __borderscolor;
@public b4i_b4xdialog* __xdialog;
@public B4IArray* __initialcolor;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _alpha_touch:(b4i_b4xcolortemplate*) __ref :(int) _action :(float) _x :(float) _y;
- (NSString*)  _alphabarselectedchange:(b4i_b4xcolortemplate*) __ref :(float) _x;
- (NSString*)  _base_resize:(b4i_b4xcolortemplate*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_b4xcolortemplate*) __ref;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)int _selectedalpha;
@property (nonatomic)b4i_bitmapcreator* _bccolors;
@property (nonatomic)float _selectedh;
@property (nonatomic)float _selecteds;
@property (nonatomic)float _selectedv;
@property (nonatomic)float _devicescale;
@property (nonatomic)float _colorscale;
@property (nonatomic)b4i_bitmapcreator* _tempbc;
@property (nonatomic)int _dont_change;
@property (nonatomic)_colorpickerpart* _huebar;
@property (nonatomic)_colorpickerpart* _colorpicker;
@property (nonatomic)_colorpickerpart* _alphabar;
@property (nonatomic)int _borderscolor;
@property (nonatomic)b4i_b4xdialog* _xdialog;
@property (nonatomic)B4IArray* _initialcolor;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _colors_touch:(b4i_b4xcolortemplate*) __ref :(int) _action :(float) _x :(float) _y;
- (B4IArray*)  _colortohsv:(b4i_b4xcolortemplate*) __ref :(int) _clr;
- (_colorpickerpart*)  _createpanelforbitmapcreator:(b4i_b4xcolortemplate*) __ref :(NSString*) _eventname :(BOOL) _withcheckers;
- (NSString*)  _dialogclosed:(b4i_b4xcolortemplate*) __ref :(int) _result;
- (NSString*)  _drawalphabar:(b4i_b4xcolortemplate*) __ref;
- (NSString*)  _drawcheckers:(b4i_b4xcolortemplate*) __ref :(_colorpickerpart*) _cpp;
- (NSString*)  _drawcolors:(b4i_b4xcolortemplate*) __ref;
- (NSString*)  _drawhuebar:(b4i_b4xcolortemplate*) __ref;
- (B4XViewWrapper*)  _getpanel:(b4i_b4xcolortemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (int)  _getselectedcolor:(b4i_b4xcolortemplate*) __ref;
- (B4IArray*)  _getselectedhsvcolor:(b4i_b4xcolortemplate*) __ref;
- (NSString*)  _handleselectedcolorchanged:(b4i_b4xcolortemplate*) __ref :(int) _x :(int) _y;
- (NSString*)  _huebar_touch:(b4i_b4xcolortemplate*) __ref :(int) _action :(float) _x :(float) _y;
- (NSString*)  _huebarselectedchanged:(b4i_b4xcolortemplate*) __ref :(float) _y;
- (NSString*)  _initialize:(b4i_b4xcolortemplate*) __ref :(B4I*) _ba;
- (NSString*)  _setselectedcolor:(b4i_b4xcolortemplate*) __ref :(int) _i;
- (NSString*)  _setselectedhsvcolor:(b4i_b4xcolortemplate*) __ref :(B4IArray*) _hsv;
- (void)  _show:(b4i_b4xcolortemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (NSString*)  _update:(b4i_b4xcolortemplate*) __ref;
- (NSString*)  _updatebarcolor:(b4i_b4xcolortemplate*) __ref;
@end
@interface _colorpickerpart:NSObject
{
@public BOOL _IsInitialized;
@public B4XCanvas* _cvs;
@public B4XViewWrapper* _pnl;
@public B4XViewWrapper* _iv;
@public B4XCanvas* _checkersCanvas;
@public BOOL _DrawCheckers;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)B4XCanvas* cvs;
@property (nonatomic)B4XViewWrapper* pnl;
@property (nonatomic)B4XViewWrapper* iv;
@property (nonatomic)B4XCanvas* checkersCanvas;
@property (nonatomic)BOOL DrawCheckers;
-(void)Initialize;
@end
