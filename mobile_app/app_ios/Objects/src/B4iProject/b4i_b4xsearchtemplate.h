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
@class b4i_b4xfloattextfield;
@class b4i_b4xinputtemplate;
@class b4i_b4xlisttemplate;
@class b4i_b4xloadingindicator;
@class b4i_b4xlongtexttemplate;
@class b4i_b4xplusminus;
@class b4i_b4xsignaturetemplate;
@class b4i_b4xswitch;
@class b4i_b4xtimedtemplate;
@class _b4xformatdata;
@class b4i_b4xformatter;
@class b4i_roundslider;
@class b4i_scrollinglabel;
@class b4i_swiftbutton;
@interface b4i_b4xsearchtemplate : B4IClass
{
@public B4IXUI* __xui;
@public B4XViewWrapper* __mbase;
@public b4i_customlistview* __customlistview1;
@public b4i_b4xdialog* __xdialog;
@public b4i_b4xfloattextfield* __searchfield;
@public B4IMap* __prefixlist;
@public B4IMap* __substringlist;
@public int __texthighlightcolor;
@public int __itemhightlightcolor;
@public int __max_limit;
@public int __maxnumberofitemstoshow;
@public B4IList* __itemscache;
@public B4IList* __allitems;
@public NSString* __selecteditem;
@public NSString* __lastterm;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _additemstolist:(b4i_b4xsearchtemplate*) __ref :(B4IList*) _li :(NSString*) _full;
- (NSString*)  _class_globals:(b4i_b4xsearchtemplate*) __ref;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)B4XViewWrapper* _mbase;
@property (nonatomic)b4i_customlistview* _customlistview1;
@property (nonatomic)b4i_b4xdialog* _xdialog;
@property (nonatomic)b4i_b4xfloattextfield* _searchfield;
@property (nonatomic)B4IMap* _prefixlist;
@property (nonatomic)B4IMap* _substringlist;
@property (nonatomic)int _texthighlightcolor;
@property (nonatomic)int _itemhightlightcolor;
@property (nonatomic)int _max_limit;
@property (nonatomic)int _maxnumberofitemstoshow;
@property (nonatomic)B4IList* _itemscache;
@property (nonatomic)B4IList* _allitems;
@property (nonatomic)NSString* _selecteditem;
@property (nonatomic)NSString* _lastterm;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (NSString*)  _customlistview1_itemclick:(b4i_b4xsearchtemplate*) __ref :(int) _index :(NSObject*) _value;
- (NSString*)  _dialogclosed:(b4i_b4xsearchtemplate*) __ref :(int) _result;
- (B4XViewWrapper*)  _getpanel:(b4i_b4xsearchtemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (NSString*)  _initialize:(b4i_b4xsearchtemplate*) __ref :(B4I*) _ba;
- (NSString*)  _resize:(b4i_b4xsearchtemplate*) __ref :(int) _width :(int) _height;
- (NSString*)  _searchfield_enterpressed:(b4i_b4xsearchtemplate*) __ref;
- (NSString*)  _searchfield_textchanged:(b4i_b4xsearchtemplate*) __ref :(NSString*) _old :(NSString*) _new;
- (NSString*)  _setindex:(b4i_b4xsearchtemplate*) __ref :(NSObject*) _index;
- (NSObject*)  _setitems:(b4i_b4xsearchtemplate*) __ref :(B4IList*) _items;
- (void)  _show:(b4i_b4xsearchtemplate*) __ref :(b4i_b4xdialog*) _dialog;
- (NSString*)  _update:(b4i_b4xsearchtemplate*) __ref :(NSString*) _term :(BOOL) _force;
@end
