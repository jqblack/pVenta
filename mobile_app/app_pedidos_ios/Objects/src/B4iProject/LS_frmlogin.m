
#import "iCore.h"
@interface LS_frmlogin:NSObject
@end

@implementation LS_frmlogin

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"imagenfondo"].Top = (int)(0.0);
[views get:@"imagenfondo"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"imagenfondo"].Left = (int)(0.0);
[views get:@"imagenfondo"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"btnconfiguracion"].Left = (int)(0.0);
[views get:@"btnconfiguracion"].Top = (int)((1.5 / 100.0 * height));
[views get:@"btnconfiguracion"].Height = (int)((7 / 100.0 * height));
[views get:@"btnconfiguracion"].Width = (int)((15 / 100.0 * width));
[views get:@"txturl"].Top = (int)(([views get:@"btnconfiguracion"].Top));
[views get:@"txturl"].Left = (int)(([views get:@"btnconfiguracion"].Left + [views get:@"btnconfiguracion"].Width));
[views get:@"txturl"].Width = (int)((100 / 100.0 * width)-([views get:@"txturl"].Left)-(2 / 100.0 * width));
[views get:@"txturl"].Height = (int)(([views get:@"btnconfiguracion"].Height)+(3 / 100.0 * height));
[views get:@"viewlogo"].Top = (int)((10 / 100.0 * height));
[views get:@"viewlogo"].Width = (int)((45 / 100.0 * width));
[views get:@"viewlogo"].Height = (int)(([views get:@"viewlogo"].Width)-(3 / 100.0 * width));
[views get:@"viewlogo"].Left = (int)((50 / 100.0 * width) - ([views get:@"viewlogo"].Width / 2));
[views get:@"label3"].Left = (int)(0.0);
[views get:@"label3"].Width = (int)((100 / 100.0 * width));
[views get:@"label3"].Top = (int)(([views get:@"viewlogo"].Top + [views get:@"viewlogo"].Height));
[views get:@"label3"].Height = (int)((9 / 100.0 * height));
[views get:@"panel1"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height)+(3 / 100.0 * height));
[views get:@"panel1"].Left = (int)((7 / 100.0 * width));
[views get:@"panel1"].Height = (int)((7.5 / 100.0 * height));
[views get:@"panel1"].Width = (int)((100 / 100.0 * width)-([views get:@"panel1"].Left)*2.0);
[views get:@"txtusuario"].Left = (int)(0.0);
[views get:@"txtusuario"].Top = (int)(0.0);
[views get:@"txtusuario"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"txtusuario"].Height = (int)(([views get:@"panel1"].Height)+(1.5 / 100.0 * height));
[views get:@"panel2"].Top = (int)(([views get:@"panel1"].Top + [views get:@"panel1"].Height)+(3 / 100.0 * height));
[views get:@"panel2"].Left = (int)(([views get:@"panel1"].Left));
[views get:@"panel2"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"panel2"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"txtcontrasena"].Left = (int)(0.0);
[views get:@"txtcontrasena"].Top = (int)(0.0);
[views get:@"txtcontrasena"].Width = (int)(([views get:@"panel2"].Width));
[views get:@"txtcontrasena"].Height = (int)(([views get:@"txtusuario"].Height));
[views get:@"btnlogin"].Top = (int)(([views get:@"panel2"].Top + [views get:@"panel2"].Height)+(4 / 100.0 * height));
[views get:@"btnlogin"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"btnlogin"].Left = (int)(([views get:@"panel1"].Left));
[views get:@"btnlogin"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"btnmenuprincipal"].Top = (int)(([views get:@"btnlogin"].Top + [views get:@"btnlogin"].Height)+(2 / 100.0 * height));
[views get:@"btnmenuprincipal"].Left = (int)(([views get:@"panel1"].Left));
[views get:@"btnmenuprincipal"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"btnmenuprincipal"].Height = (int)((7 / 100.0 * height));
[views get:@"lblregistrarme"].Left = (int)(0.0);
[views get:@"lblregistrarme"].Top = (int)(([views get:@"btnmenuprincipal"].Top + [views get:@"btnmenuprincipal"].Height)+(1 / 100.0 * height));
[views get:@"lblregistrarme"].Width = (int)((100 / 100.0 * width));
[views get:@"lblregistrarme"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((100 / 100.0 * width));
[views get:@"label2"].Left = (int)(0.0);
[views get:@"label2"].Top = (int)((96 / 100.0 * height) - ([views get:@"label2"].Height));

}
@end