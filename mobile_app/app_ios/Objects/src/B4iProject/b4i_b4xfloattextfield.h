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
@class b4i_b4xcolortemplate;
@class b4i_b4xcombobox;
@class b4i_b4xdatetemplate;
@class b4i_b4xdialog;
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
@interface b4i_b4xfloattextfield : B4IClass
{
@public NSString* __meventname;
@public NSObject* __mcallback;
@public B4XViewWrapper* __mbase;
@public B4IXUI* __xui;
@public B4XViewWrapper* __mtextfield;
@public int __duration;
@public float __largelabeltextsize;
@public float __smalllabeltextsize;
@public BOOL __largelabel;
@public B4XCanvas* __measuringcanvas;
@public int __hintcolor;
@public int __nonfocusedhintcolor;
@public int __horizontalpadding;
@public B4XViewWrapper* __hintimageview;
@public NSString* __hinttext;
@public B4XFont* __hintfont;
@public B4XBitmapWrapper* __largefocused;
@public B4XBitmapWrapper* __largenotfocused;
@public B4XBitmapWrapper* __smallfocused;
@public B4XBitmapWrapper* __smallnotfocused;
@public BOOL __focused;
@public B4XViewWrapper* __lblclear;
@public B4XViewWrapper* __lblv;
@public B4IMap* __mprops;
@public NSObject* __tag;
@public NSString* __keyboardtype;
@public BOOL __multiline;
@public b4i_b4xfloattextfield* __mnexttextfield;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _base_resize:(b4i_b4xfloattextfield*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_b4xfloattextfield*) __ref;
@property (nonatomic)NSString* _meventname;
@property (nonatomic)NSObject* _mcallback;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4XViewWrapper* _mtextfield;
@property (nonatomic)int _duration;
@property (nonatomic)float _largelabeltextsize;
@property (nonatomic)float _smalllabeltextsize;
@property (nonatomic)BOOL _largelabel;
@property (nonatomic)B4XCanvas* _measuringcanvas;
@property (nonatomic)int _hintcolor;
@property (nonatomic)int _nonfocusedhintcolor;
@property (nonatomic)int _horizontalpadding;
@property (nonatomic)B4XViewWrapper* _hintimageview;
@property (nonatomic)NSString* _hinttext;
@property (nonatomic)B4XFont* _hintfont;
@property (nonatomic)B4XBitmapWrapper* _largefocused;
@property (nonatomic)B4XBitmapWrapper* _largenotfocused;
@property (nonatomic)B4XBitmapWrapper* _smallfocused;
@property (nonatomic)B4XBitmapWrapper* _smallnotfocused;
@property (nonatomic)BOOL _focused;
@property (nonatomic)B4XViewWrapper* _lblclear;
@property (nonatomic)B4XViewWrapper* _lblv;
@property (nonatomic)B4IMap* _mprops;
@property (nonatomic)NSObject* _tag;
@property (nonatomic)NSString* _keyboardtype;
@property (nonatomic)BOOL _multiline;
@property (nonatomic)b4i_b4xfloattextfield* _mnexttextfield;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _createacceptbutton:(b4i_b4xfloattextfield*) __ref;
- (B4XBitmapWrapper*)  _createbitmap:(b4i_b4xfloattextfield*) __ref :(B4XRect*) _r :(int) _color :(B4XFont*) _fnt;
- (B4XViewWrapper*)  _createbutton:(b4i_b4xfloattextfield*) __ref :(NSString*) _text;
- (NSString*)  _createclearbutton:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _createrevealbutton:(b4i_b4xfloattextfield*) __ref;
- (B4XViewWrapper*)  _createtextfield:(b4i_b4xfloattextfield*) __ref :(BOOL) _password;
- (NSString*)  _createtextfieldall:(b4i_b4xfloattextfield*) __ref :(BOOL) _passwordmode :(B4XFont*) _font1 :(int) _textcolor;
- (NSString*)  _designercreateview:(b4i_b4xfloattextfield*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (b4i_b4xfloattextfield*)  _getnextfield:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _gettext:(b4i_b4xfloattextfield*) __ref;
- (B4XViewWrapper*)  _gettextfield:(b4i_b4xfloattextfield*) __ref;
- (BOOL)  _ime_handleaction:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _initialize:(b4i_b4xfloattextfield*) __ref :(B4I*) _ba :(NSObject*) _callback :(NSString*) _eventname;
- (NSString*)  _lc_click:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _requestfocusandshowkeyboard:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _setnextfield:(b4i_b4xfloattextfield*) __ref :(b4i_b4xfloattextfield*) _field;
- (NSString*)  _settext:(b4i_b4xfloattextfield*) __ref :(NSString*) _s;
- (NSString*)  _switchfrompasswordtoregular:(b4i_b4xfloattextfield*) __ref :(BOOL) _toregular;
- (NSString*)  _tf_action:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _tf_beginedit:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _tf_endedit:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _tf_enterpressed:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _tf_focuschanged:(b4i_b4xfloattextfield*) __ref :(BOOL) _hasfocus;
- (NSString*)  _tf_textchanged:(b4i_b4xfloattextfield*) __ref :(NSString*) _old :(NSString*) _new;
- (NSString*)  _update:(b4i_b4xfloattextfield*) __ref;
- (NSString*)  _updatelabel:(b4i_b4xfloattextfield*) __ref :(NSString*) _txt :(BOOL) _force;
@end
