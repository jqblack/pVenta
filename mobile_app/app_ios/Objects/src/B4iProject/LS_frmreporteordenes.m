
#import "iCore.h"
@interface LS_frmreporteordenes:NSObject
@end

@implementation LS_frmreporteordenes

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"label2"].Top = (int)((1 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((50 / 100.0 * width));
[views get:@"label2"].Left = (int)((3 / 100.0 * width));
[views get:@"panel1"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"panel1"].Left = (int)(([views get:@"label2"].Left));
[views get:@"panel1"].Height = (int)((15 / 100.0 * height));
[views get:@"panel1"].Width = (int)((100 / 100.0 * width)-([views get:@"panel1"].Left)*2.0);
[views get:@"date"].Left = (int)(0.0);
[views get:@"date"].Top = (int)(0.0);
[views get:@"date"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"date"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"chordenesabiertas"].Top = (int)(([views get:@"panel1"].Top + [views get:@"panel1"].Height)+(1.55 / 100.0 * height));
[views get:@"chordenesabiertas"].Width = (int)((15 / 100.0 * width));
[views get:@"chordenesabiertas"].Left = (int)(([views get:@"label2"].Left));
[views get:@"chordenesabiertas"].Height = (int)((5 / 100.0 * height));
[views get:@"label1"].Left = (int)(([views get:@"chordenesabiertas"].Left + [views get:@"chordenesabiertas"].Width));
[views get:@"label1"].Top = (int)(([views get:@"chordenesabiertas"].Top));
[views get:@"label1"].Height = (int)(([views get:@"chordenesabiertas"].Height));
[views get:@"label1"].Width = (int)((100 / 100.0 * width)-([views get:@"label1"].Left));
[views get:@"label3"].Top = (int)(([views get:@"chordenesabiertas"].Top + [views get:@"chordenesabiertas"].Height)+(0.5 / 100.0 * height));
[views get:@"label3"].Height = (int)((5 / 100.0 * height));
[views get:@"label3"].Left = (int)(([views get:@"chordenesabiertas"].Left));
[views get:@"label3"].Width = (int)((100 / 100.0 * width)-([views get:@"label3"].Left)*2.0);
[views get:@"panel2"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
[views get:@"panel2"].Width = (int)(([views get:@"label3"].Width));
[views get:@"panel2"].Height = (int)((57 / 100.0 * height));
[views get:@"panel2"].Left = (int)(([views get:@"label3"].Left));
[views get:@"btnbuscarreporte"].Left = (int)(([views get:@"panel2"].Left));
[views get:@"btnbuscarreporte"].Height = (int)((7 / 100.0 * height));
[views get:@"btnbuscarreporte"].Top = (int)(([views get:@"panel2"].Top + [views get:@"panel2"].Height)+(1 / 100.0 * height));
[views get:@"btnbuscarreporte"].Width = (int)(([views get:@"panel2"].Width));

}
@end