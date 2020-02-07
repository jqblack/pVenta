
#import "iCore.h"
@interface LS_frmlogin:NSObject
@end

@implementation LS_frmlogin

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"imageview1"].Left = (int)((0 / 100.0 * width));
[views get:@"imageview1"].Width = (int)((100 / 100.0 * width) - ((0 / 100.0 * width)));
[views get:@"imageview1"].Top = (int)((0 / 100.0 * height));
[views get:@"imageview1"].Height = (int)((100 / 100.0 * height) - ((0 / 100.0 * height)));
[views get:@"btnconfiguracion"].Left = (int)((1 / 100.0 * width));
[views get:@"btnconfiguracion"].Top = (int)((1 / 100.0 * height));
[views get:@"btnconfiguracion"].Height = (int)((7 / 100.0 * height));
[views get:@"btnconfiguracion"].Width = (int)((12 / 100.0 * width));
[views get:@"txturl"].Top = (int)(([views get:@"btnconfiguracion"].Top));
[views get:@"txturl"].Left = (int)(([views get:@"btnconfiguracion"].Left + [views get:@"btnconfiguracion"].Width));
[views get:@"txturl"].Width = (int)((100 / 100.0 * width)-([views get:@"txturl"].Left)-(2 / 100.0 * width));
[views get:@"txturl"].Height = (int)(([views get:@"btnconfiguracion"].Height));
[views get:@"viewlogo"].Top = (int)((10 / 100.0 * height));
[views get:@"viewlogo"].Width = (int)((45 / 100.0 * width));
[views get:@"viewlogo"].Height = (int)(([views get:@"viewlogo"].Width)-(3 / 100.0 * width));
[views get:@"viewlogo"].Left = (int)((50 / 100.0 * width) - ([views get:@"viewlogo"].Width / 2));
[views get:@"label3"].Left = (int)(0.0);
[views get:@"label3"].Width = (int)((100 / 100.0 * width));
[views get:@"label3"].Top = (int)(([views get:@"viewlogo"].Top + [views get:@"viewlogo"].Height));
[views get:@"label3"].Height = (int)((8 / 100.0 * height));
[views get:@"txtusuario"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height)+(13 / 100.0 * height));
[views get:@"txtusuario"].Left = (int)((7 / 100.0 * width));
[views get:@"txtusuario"].Height = (int)((7.5 / 100.0 * height));
[views get:@"txtusuario"].Width = (int)((100 / 100.0 * width)-([views get:@"txtusuario"].Left)*2.0);
[views get:@"txtcontrasena"].Top = (int)(([views get:@"txtusuario"].Top + [views get:@"txtusuario"].Height)+(3 / 100.0 * height));
[views get:@"txtcontrasena"].Left = (int)(([views get:@"txtusuario"].Left));
[views get:@"txtcontrasena"].Height = (int)(([views get:@"txtusuario"].Height));
[views get:@"txtcontrasena"].Width = (int)(([views get:@"txtusuario"].Width));
[views get:@"btnlogin"].Top = (int)(([views get:@"txtcontrasena"].Top + [views get:@"txtcontrasena"].Height)+(2 / 100.0 * height));
[views get:@"btnlogin"].Height = (int)(([views get:@"txtusuario"].Height));
[views get:@"btnlogin"].Left = (int)(([views get:@"txtusuario"].Left));
[views get:@"btnlogin"].Width = (int)(([views get:@"txtusuario"].Width));
[views get:@"lblregistrarme"].Left = (int)(0.0);
[views get:@"lblregistrarme"].Top = (int)(([views get:@"btnlogin"].Top + [views get:@"btnlogin"].Height));
[views get:@"lblregistrarme"].Width = (int)((100 / 100.0 * width));
[views get:@"lblregistrarme"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-(10 * 1));
[views get:@"label2"].Left = (int)(0.0);
[views get:@"label2"].Top = (int)((100 / 100.0 * height) - ([views get:@"label2"].Height));

}
@end