
#import "iCore.h"
@interface LS_frmcategoria:NSObject
@end

@implementation LS_frmcategoria

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondocategoria"].Top = (int)(0.0);
[views get:@"panelfondocategoria"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondocategoria"].Left = (int)(0.0);
[views get:@"panelfondocategoria"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadocat"].Left = (int)(0.0);
[views get:@"panelencabezadocat"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadocat"].Top = (int)(0.0);
[views get:@"panelencabezadocat"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackcat"].Top = (int)(0.0);
[views get:@"btnbackcat"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackcat"].Left = (int)(0.0);
[views get:@"btnbackcat"].Width = (int)((15 / 100.0 * width) - (0.0));
[views get:@"label1"].Left = (int)(([views get:@"btnbackcat"].Left + [views get:@"btnbackcat"].Width)+(4 / 100.0 * width));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"label1"].Width = (int)((60 / 100.0 * width));
[views get:@"panellista"].Left = (int)(0.0);
[views get:@"panellista"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panellista"].Top = (int)(([views get:@"panelencabezadocat"].Top + [views get:@"panelencabezadocat"].Height));
[views get:@"panellista"].Height = (int)((92 / 100.0 * height));
[views get:@"customlistviewcategoria"].Top = (int)((2 / 100.0 * height));
[views get:@"customlistviewcategoria"].Left = (int)((2 / 100.0 * width));
[views get:@"customlistviewcategoria"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"customlistviewcategoria"].Height = (int)((88 / 100.0 * height));

}
@end