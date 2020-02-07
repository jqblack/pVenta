#import "iCore.h"
#import "iHUD.h"
#import "iXUI.h"
#import "iTableView.h"
#import "iHttp.h"
#import "iJSON.h"
#import "iStringUtils.h"
#import "iSQL.h"
#import "iPhone.h"
#import "iSideMenu.h"
#import "iDebug2.h"
@class b4i_main;
@class b4i_login;
@class b4i_funciones;
@class b4i_categoria;
@class b4i_reportes;
@class b4i_facturacion;
@class b4i_direcciones;
@class b4i_perfil;
@class b4i_favoritos;
@class b4i_httputils2service;
@class _typeu;
@class _clvitem;
@class b4i_b4xcombobox;
@class b4i_b4xdrawer;
@class _multipartfiledata;
@class b4i_httpjob;
@interface b4i_customlistview : B4IClass
{
@public B4XViewWrapper* __mbase;
@public B4XViewWrapper* __sv;
@public B4IList* __items;
@public float __mdividersize;
@public NSString* __eventname;
@public NSObject* __callback;
@public int __defaulttextcolor;
@public int __defaulttextbackgroundcolor;
@public int __animationduration;
@public long long __lastreachendevent;
@public int __pressedcolor;
@public B4IXUI* __xui;
@public B4ILabelWrapper* __designerlabel;
@public BOOL __horizontal;
@public B4INativeObject* __feedbackgenerator;
@public int __mfirstvisibleindex;
@public int __mlastvisibleindex;
@public BOOL __monitorvisiblerange;
@public BOOL __firescrollchanged;
@public BOOL __scrollbarsvisible;
@public b4i_main* __main;
@public b4i_login* __login;
@public b4i_funciones* __funciones;
@public b4i_categoria* __categoria;
@public b4i_reportes* __reportes;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_perfil* __perfil;
@public b4i_favoritos* __favoritos;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _add:(b4i_customlistview*) __ref :(B4XViewWrapper*) _pnl :(NSObject*) _value;
- (NSString*)  _addtextitem:(b4i_customlistview*) __ref :(NSObject*) _text :(NSObject*) _value;
- (B4XViewWrapper*)  _asview:(b4i_customlistview*) __ref;
- (NSString*)  _base_resize:(b4i_customlistview*) __ref :(double) _width :(double) _height;
- (NSString*)  _class_globals:(b4i_customlistview*) __ref;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)B4XViewWrapper* _sv;
@property (nonatomic)B4IList* _items;
@property (nonatomic)float _mdividersize;
@property (nonatomic)NSString* _eventname;
@property (nonatomic)NSObject* _callback;
@property (nonatomic)int _defaulttextcolor;
@property (nonatomic)int _defaulttextbackgroundcolor;
@property (nonatomic)int _animationduration;
@property (nonatomic)long long _lastreachendevent;
@property (nonatomic)int _pressedcolor;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4ILabelWrapper* _designerlabel;
@property (nonatomic)BOOL _horizontal;
@property (nonatomic)B4INativeObject* _feedbackgenerator;
@property (nonatomic)int _mfirstvisibleindex;
@property (nonatomic)int _mlastvisibleindex;
@property (nonatomic)BOOL _monitorvisiblerange;
@property (nonatomic)BOOL _firescrollchanged;
@property (nonatomic)BOOL _scrollbarsvisible;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_login* _login;
@property (nonatomic)b4i_funciones* _funciones;
@property (nonatomic)b4i_categoria* _categoria;
@property (nonatomic)b4i_reportes* _reportes;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_perfil* _perfil;
@property (nonatomic)b4i_favoritos* _favoritos;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _clear:(b4i_customlistview*) __ref;
- (B4XViewWrapper*)  _createlabel:(b4i_customlistview*) __ref :(NSObject*) _txt;
- (B4XViewWrapper*)  _createpanel:(b4i_customlistview*) __ref :(NSString*) _paneleventname;
- (B4XViewWrapper*)  _createscrollview:(b4i_customlistview*) __ref;
- (NSString*)  _designercreateview:(b4i_customlistview*) __ref :(NSObject*) _base :(B4ILabelWrapper*) _lbl :(B4IMap*) _props;
- (int)  _findindexfromoffset:(b4i_customlistview*) __ref :(int) _offset;
- (int)  _finditemoffset:(b4i_customlistview*) __ref :(int) _index;
- (B4XViewWrapper*)  _getbase:(b4i_customlistview*) __ref;
- (float)  _getdividersize:(b4i_customlistview*) __ref;
- (int)  _getfirstvisibleindex:(b4i_customlistview*) __ref;
- (int)  _getitemfromview:(b4i_customlistview*) __ref :(B4XViewWrapper*) _v;
- (int)  _getlastvisibleindex:(b4i_customlistview*) __ref;
- (float)  _getmaxscrolloffset:(b4i_customlistview*) __ref;
- (B4XViewWrapper*)  _getpanel:(b4i_customlistview*) __ref :(int) _index;
- (_clvitem*)  _getrawlistitem:(b4i_customlistview*) __ref :(int) _index;
- (float)  _getscrollviewcontentsize:(b4i_customlistview*) __ref;
- (float)  _getscrollviewoffset:(b4i_customlistview*) __ref;
- (float)  _getscrollviewvisiblesize:(b4i_customlistview*) __ref;
- (int)  _getsize:(b4i_customlistview*) __ref;
- (NSObject*)  _getvalue:(b4i_customlistview*) __ref :(int) _index;
- (NSString*)  _initialize:(b4i_customlistview*) __ref :(B4I*) _ba :(NSObject*) _vcallback :(NSString*) _veventname;
- (NSString*)  _insertat:(b4i_customlistview*) __ref :(int) _index :(B4XViewWrapper*) _pnl :(NSObject*) _value;
- (NSString*)  _insertatimpl:(b4i_customlistview*) __ref :(int) _index :(B4XViewWrapper*) _pnl :(int) _itemsize :(NSObject*) _value :(int) _initialsize;
- (NSString*)  _insertattextitem:(b4i_customlistview*) __ref :(int) _index :(NSObject*) _text :(NSObject*) _value;
- (NSString*)  _jumptoitem:(b4i_customlistview*) __ref :(int) _index;
- (NSString*)  _panel_click:(b4i_customlistview*) __ref;
- (NSString*)  _panel_longclick:(b4i_customlistview*) __ref;
- (void)  _panelclickhandler:(b4i_customlistview*) __ref :(B4XViewWrapper*) _senderpanel;
- (NSString*)  _panellongclickhandler:(b4i_customlistview*) __ref :(B4XViewWrapper*) _senderpanel;
- (NSString*)  _refresh:(b4i_customlistview*) __ref;
- (NSString*)  _removeat:(b4i_customlistview*) __ref :(int) _index;
- (NSString*)  _replaceat:(b4i_customlistview*) __ref :(int) _index :(B4XViewWrapper*) _pnl :(int) _itemheight :(NSObject*) _value;
- (NSString*)  _resetvisibles:(b4i_customlistview*) __ref;
- (NSString*)  _resizeitem:(b4i_customlistview*) __ref :(int) _index :(int) _itemheight;
- (NSString*)  _scrollhandler:(b4i_customlistview*) __ref;
- (NSString*)  _scrolltoitem:(b4i_customlistview*) __ref :(int) _index;
- (NSString*)  _setitemoffset:(b4i_customlistview*) __ref :(_clvitem*) _item :(float) _offset;
- (NSString*)  _setscrollviewcontentsize:(b4i_customlistview*) __ref :(float) _f;
- (NSString*)  _setscrollviewoffset:(b4i_customlistview*) __ref :(float) _offset;
- (NSString*)  _sv_scrollchanged:(b4i_customlistview*) __ref :(int) _offsetx :(int) _offsety;
- (NSString*)  _updatevisiblerange:(b4i_customlistview*) __ref;
@end
@interface _clvitem:NSObject
{
@public BOOL _IsInitialized;
@public B4XViewWrapper* _Panel;
@public int _Size;
@public NSObject* _Value;
@public int _Color;
@public BOOL _TextItem;
@public int _Offset;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)B4XViewWrapper* Panel;
@property (nonatomic)int Size;
@property (nonatomic)NSObject* Value;
@property (nonatomic)int Color;
@property (nonatomic)BOOL TextItem;
@property (nonatomic)int Offset;
-(void)Initialize;
@end
