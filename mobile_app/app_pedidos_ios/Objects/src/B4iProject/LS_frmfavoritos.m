
#import "iCore.h"
@interface LS_frmfavoritos:NSObject
@end

@implementation LS_frmfavoritos

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondofavorito"].Top = (int)(0.0);
[views get:@"panelfondofavorito"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondofavorito"].Left = (int)(0.0);
[views get:@"panelfondofavorito"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadofav"].Left = (int)(0.0);
[views get:@"panelencabezadofav"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadofav"].Top = (int)(0.0);
[views get:@"panelencabezadofav"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackfavoritos"].Left = (int)(0.0);
[views get:@"btnbackfavoritos"].Top = (int)(0.0);
[views get:@"btnbackfavoritos"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackfavoritos"].Width = (int)((15 / 100.0 * width));
[views get:@"label1"].Left = (int)((17 / 100.0 * width));
[views get:@"label1"].Width = (int)((100 / 100.0 * width) - ((17 / 100.0 * width)));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"lblcantproductos"].Left = (int)((2 / 100.0 * width));
[views get:@"lblcantproductos"].Width = (int)((100 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"lblcantproductos"].Top = (int)(([views get:@"panelencabezadofav"].Top + [views get:@"panelencabezadofav"].Height));
[views get:@"lblcantproductos"].Height = (int)((5 / 100.0 * height));
[views get:@"panellista"].Top = (int)(([views get:@"lblcantproductos"].Top + [views get:@"lblcantproductos"].Height)+(1 / 100.0 * height));
[views get:@"panellista"].Left = (int)((0 / 100.0 * width));
[views get:@"panellista"].Width = (int)((100 / 100.0 * width) - ((0 / 100.0 * width)));
[views get:@"panellista"].Height = (int)((84 / 100.0 * height));
[views get:@"llistafavoritos"].Top = (int)(0.0);
[views get:@"llistafavoritos"].Left = (int)((2 / 100.0 * width));
[views get:@"llistafavoritos"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"llistafavoritos"].Height = (int)((84 / 100.0 * height));

}
@end