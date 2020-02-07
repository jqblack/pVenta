
#import "iCore.h"
@interface LS_frmdireccionesmodal:NSObject
@end

@implementation LS_frmdireccionesmodal

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"label2"].Top = (int)(0.0);
[views get:@"label2"].Height = (int)((7 / 100.0 * height));
[views get:@"label2"].Left = (int)((3 / 100.0 * width));
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-([views get:@"label2"].Left));
[views get:@"panellistviewdirecciones"].Left = (int)(([views get:@"label2"].Left));
[views get:@"panellistviewdirecciones"].Width = (int)((100 / 100.0 * width)-([views get:@"panellistviewdirecciones"].Left)*2.0);
[views get:@"panellistviewdirecciones"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"panellistviewdirecciones"].Height = (int)((83 / 100.0 * height));
[views get:@"btnabrirdireccion"].Left = (int)(([views get:@"panellistviewdirecciones"].Left));
[views get:@"btnabrirdireccion"].Top = (int)(([views get:@"panellistviewdirecciones"].Top + [views get:@"panellistviewdirecciones"].Height)+(1 / 100.0 * height));
[views get:@"btnabrirdireccion"].Width = (int)(([views get:@"panellistviewdirecciones"].Width));
[views get:@"btnabrirdireccion"].Height = (int)((7 / 100.0 * height));

}
@end