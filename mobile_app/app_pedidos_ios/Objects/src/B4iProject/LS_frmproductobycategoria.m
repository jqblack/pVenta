
#import "iCore.h"
@interface LS_frmproductobycategoria:NSObject
@end

@implementation LS_frmproductobycategoria

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondoproductosbycategorias"].Top = (int)(0.0);
[views get:@"panelfondoproductosbycategorias"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondoproductosbycategorias"].Left = (int)(0.0);
[views get:@"panelfondoproductosbycategorias"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadoprobycat"].Left = (int)(0.0);
[views get:@"panelencabezadoprobycat"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadoprobycat"].Top = (int)(0.0);
[views get:@"panelencabezadoprobycat"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackprobycat"].Top = (int)(0.0);
[views get:@"btnbackprobycat"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackprobycat"].Left = (int)(0.0);
[views get:@"btnbackprobycat"].Width = (int)((15 / 100.0 * width));
[views get:@"label1"].Left = (int)((18 / 100.0 * width));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"label1"].Width = (int)((80 / 100.0 * width));
[views get:@"label2"].Left = (int)((2 / 100.0 * width));
[views get:@"label2"].Top = (int)(([views get:@"panelencabezadoprobycat"].Top + [views get:@"panelencabezadoprobycat"].Height));
[views get:@"label2"].Width = (int)((80 / 100.0 * width));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"panelscroll"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height)+(2 / 100.0 * height));
[views get:@"panelscroll"].Height = (int)((98 / 100.0 * height) - (([views get:@"label2"].Top + [views get:@"label2"].Height)+(2 / 100.0 * height)));
[views get:@"panelscroll"].Left = (int)((2 / 100.0 * width));
[views get:@"panelscroll"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"scrollviewprobycat"].Top = (int)(0.0);
[views get:@"scrollviewprobycat"].Left = (int)(0.0);
[views get:@"scrollviewprobycat"].Width = (int)(([views get:@"panelscroll"].Width));
[views get:@"scrollviewprobycat"].Height = (int)(([views get:@"panelscroll"].Height));

}
@end