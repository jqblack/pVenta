
#import "iCore.h"
@interface LS_frmproductoorden:NSObject
@end

@implementation LS_frmproductoorden

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelordenproductosdetalles"].Left = (int)((3 / 100.0 * width));
[views get:@"panelordenproductosdetalles"].Width = (int)((100 / 100.0 * width)-([views get:@"panelordenproductosdetalles"].Left)*2.0);
[views get:@"panelordenproductosdetalles"].Top = (int)((2 / 100.0 * height));
[views get:@"panelordenproductosdetalles"].Height = (int)((55 / 100.0 * height));
[views get:@"paneldireccion"].Top = (int)(([views get:@"panelordenproductosdetalles"].Top + [views get:@"panelordenproductosdetalles"].Height)+(2 / 100.0 * height));
[views get:@"paneldireccion"].Height = (int)((15 / 100.0 * height));
[views get:@"paneldireccion"].Width = (int)(([views get:@"panelordenproductosdetalles"].Width));
[views get:@"paneldireccion"].Left = (int)(([views get:@"panelordenproductosdetalles"].Left));
[views get:@"label3"].Width = (int)(([views get:@"paneldireccion"].Width));
[views get:@"label3"].Height = (int)((5 / 100.0 * height));
[views get:@"label3"].Top = (int)(0.0);
[views get:@"label3"].Left = (int)((2 / 100.0 * width));
[views get:@"lbldireccion"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
[views get:@"lbldireccion"].Left = (int)(([views get:@"label3"].Left));
[views get:@"lbldireccion"].Width = (int)(([views get:@"paneldireccion"].Width)-([views get:@"lbldireccion"].Left));
[views get:@"lbldireccion"].Height = (int)(([views get:@"paneldireccion"].Height)-([views get:@"lbldireccion"].Top));
[views get:@"panelordentotal"].Left = (int)(([views get:@"panelordenproductosdetalles"].Left));
[views get:@"panelordentotal"].Top = (int)(([views get:@"paneldireccion"].Top + [views get:@"paneldireccion"].Height)+(2 / 100.0 * height));
[views get:@"panelordentotal"].Height = (int)((12 / 100.0 * height));
[views get:@"panelordentotal"].Width = (int)(([views get:@"panelordenproductosdetalles"].Width));
[views get:@"label4"].Left = (int)((2 / 100.0 * width));
[views get:@"label4"].Top = (int)(0.0);
[views get:@"label4"].Width = (int)((45 / 100.0 * width));
[views get:@"label4"].Height = (int)(([views get:@"panelordentotal"].Height)/2.0);
[views get:@"lblprecioenvio"].Top = (int)(([views get:@"label4"].Top));
[views get:@"lblprecioenvio"].Left = (int)(([views get:@"label4"].Left + [views get:@"label4"].Width));
[views get:@"lblprecioenvio"].Width = (int)(([views get:@"panelordentotal"].Width)-([views get:@"lblprecioenvio"].Left)-(2 / 100.0 * width));
[views get:@"lblprecioenvio"].Height = (int)(([views get:@"label4"].Height));
[views get:@"label2"].Left = (int)(([views get:@"label4"].Left));
[views get:@"label2"].Top = (int)(([views get:@"label4"].Top + [views get:@"label4"].Height));
[views get:@"label2"].Width = (int)(([views get:@"label4"].Width));
[views get:@"label2"].Height = (int)(([views get:@"label4"].Height));
[views get:@"lblordentotalpagar"].Top = (int)(([views get:@"label2"].Top));
[views get:@"lblordentotalpagar"].Left = (int)(([views get:@"label2"].Left + [views get:@"label2"].Width));
[views get:@"lblordentotalpagar"].Width = (int)(([views get:@"panelordentotal"].Width)-([views get:@"lblordentotalpagar"].Left)-(2 / 100.0 * width));
[views get:@"lblordentotalpagar"].Height = (int)(([views get:@"label2"].Height));
[views get:@"btnordenenviar"].Left = (int)(([views get:@"panelordenproductosdetalles"].Left));
[views get:@"btnordenenviar"].Top = (int)(([views get:@"panelordentotal"].Top + [views get:@"panelordentotal"].Height)+(2 / 100.0 * height));
[views get:@"btnordenenviar"].Height = (int)((7.8 / 100.0 * height));
[views get:@"btnordenenviar"].Width = (int)(([views get:@"panelordenproductosdetalles"].Width));

}
@end