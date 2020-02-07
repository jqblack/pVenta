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
@class b4i_b4xsearchtemplate;
@class b4i_b4xsignaturetemplate;
@class b4i_b4xswitch;
@class b4i_b4xtimedtemplate;
@class _b4xformatdata;
@class b4i_roundslider;
@class b4i_scrollinglabel;
@class b4i_swiftbutton;
@interface b4i_b4xformatter : B4IClass
{
@public B4IList* __formats;
@public int __max_value;
@public int __min_value;
@public B4IXUI* __xui;
@public b4i_dateutils* __dateutils;
@public b4i_main* __main;
@public b4i_principal* __principal;
@public b4i_funcion* __funcion;
@public b4i_facturacion* __facturacion;
@public b4i_direcciones* __direcciones;
@public b4i_reporteordenes* __reporteordenes;
@public b4i_httputils2service* __httputils2service;

}- (NSString*)  _addformatdata:(b4i_b4xformatter*) __ref :(_b4xformatdata*) _data :(double) _rangestart :(double) _rangeend :(BOOL) _includeedges;
- (NSString*)  _class_globals:(b4i_b4xformatter*) __ref;
@property (nonatomic)B4IList* _formats;
@property (nonatomic)int _max_value;
@property (nonatomic)int _min_value;
@property (nonatomic)B4IXUI* _xui;
@property (nonatomic)b4i_dateutils* _dateutils;
@property (nonatomic)b4i_main* _main;
@property (nonatomic)b4i_principal* _principal;
@property (nonatomic)b4i_funcion* _funcion;
@property (nonatomic)b4i_facturacion* _facturacion;
@property (nonatomic)b4i_direcciones* _direcciones;
@property (nonatomic)b4i_reporteordenes* _reporteordenes;
@property (nonatomic)b4i_httputils2service* _httputils2service;
- (_b4xformatdata*)  _copyformatdata:(b4i_b4xformatter*) __ref :(_b4xformatdata*) _data;
- (_b4xformatdata*)  _createdefaultformat:(b4i_b4xformatter*) __ref;
- (NSString*)  _format:(b4i_b4xformatter*) __ref :(double) _number;
- (NSString*)  _formatlabel:(b4i_b4xformatter*) __ref :(NSString*) _number :(B4XViewWrapper*) _label;
- (_b4xformatdata*)  _getdefaultformat:(b4i_b4xformatter*) __ref;
- (_b4xformatdata*)  _getformatdata:(b4i_b4xformatter*) __ref :(double) _number;
- (NSString*)  _initialize:(b4i_b4xformatter*) __ref :(B4I*) _ba;
- (_b4xformatdata*)  _newformatdata:(b4i_b4xformatter*) __ref;
@end
@interface _b4xformatdata:NSObject
{
@public BOOL _IsInitialized;
@public NSString* _Prefix;
@public NSString* _Postfix;
@public int _MinimumIntegers;
@public int _MinimumFractions;
@public int _MaximumFractions;
@public NSString* _GroupingCharacter;
@public NSString* _DecimalPoint;
@public int _TextColor;
@public B4XFont* _FormatFont;
@public double _RangeStart;
@public double _RangeEnd;
@public BOOL _RemoveMinusSign;
@public NSString* _IntegerPaddingChar;
@public NSString* _FractionPaddingChar;

}
@property (nonatomic)BOOL IsInitialized;
@property (nonatomic)NSString* Prefix;
@property (nonatomic)NSString* Postfix;
@property (nonatomic)int MinimumIntegers;
@property (nonatomic)int MinimumFractions;
@property (nonatomic)int MaximumFractions;
@property (nonatomic)NSString* GroupingCharacter;
@property (nonatomic)NSString* DecimalPoint;
@property (nonatomic)int TextColor;
@property (nonatomic)B4XFont* FormatFont;
@property (nonatomic)double RangeStart;
@property (nonatomic)double RangeEnd;
@property (nonatomic)BOOL RemoveMinusSign;
@property (nonatomic)NSString* IntegerPaddingChar;
@property (nonatomic)NSString* FractionPaddingChar;
-(void)Initialize;
@end
