
#import "iCore.h"
@interface LS_frmdirecciones:NSObject
@end

@implementation LS_frmdirecciones

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondodireciones"].Left = (int)(0.0);
[views get:@"panelfondodireciones"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelfondodireciones"].Top = (int)(0.0);
[views get:@"panelfondodireciones"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelencabezadodir"].Left = (int)(0.0);
[views get:@"panelencabezadodir"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadodir"].Top = (int)(0.0);
[views get:@"panelencabezadodir"].Height = (int)((9 / 100.0 * height) - (0.0));
[views get:@"btndireccionback"].Left = (int)(0.0);
[views get:@"btndireccionback"].Top = (int)(0.0);
[views get:@"btndireccionback"].Width = (int)((15 / 100.0 * width));
[views get:@"btndireccionback"].Height = (int)(([views get:@"panelencabezadodir"].Height));
[views get:@"label4"].Top = (int)(0.0);
[views get:@"label4"].Left = (int)(([views get:@"btndireccionback"].Left + [views get:@"btndireccionback"].Width)+(2 / 100.0 * width));
[views get:@"label4"].Height = (int)(([views get:@"btndireccionback"].Height));
[views get:@"label4"].Width = (int)((80 / 100.0 * width));
[views get:@"label2"].Top = (int)(([views get:@"panelencabezadodir"].Top + [views get:@"panelencabezadodir"].Height)+(1 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Left = (int)((5 / 100.0 * width));
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-([views get:@"label2"].Left));
[views get:@"panel2"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"panel2"].Left = (int)(([views get:@"label2"].Left));
[views get:@"panel2"].Height = (int)((41 / 100.0 * height));
[views get:@"panel2"].Width = (int)((100 / 100.0 * width)-([views get:@"panel2"].Left)*2.0);
[views get:@"listadirecciones"].Top = (int)((2 / 100.0 * height));
[views get:@"listadirecciones"].Left = (int)((2 / 100.0 * width));
[views get:@"listadirecciones"].Width = (int)(([views get:@"panel2"].Width)-(2 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"listadirecciones"].Height = (int)(([views get:@"panel2"].Height)-(4 / 100.0 * height));
[views get:@"label3"].Top = (int)(([views get:@"panel2"].Top + [views get:@"panel2"].Height)+(2 / 100.0 * height));
[views get:@"label3"].Width = (int)(([views get:@"label2"].Width));
[views get:@"label3"].Height = (int)(([views get:@"label2"].Height));
[views get:@"label3"].Left = (int)(([views get:@"label2"].Left));
[views get:@"txtdireccion"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
[views get:@"txtdireccion"].Left = (int)(([views get:@"panel2"].Left));
[views get:@"txtdireccion"].Width = (int)(([views get:@"panel2"].Width));
[views get:@"txtdireccion"].Height = (int)((20 / 100.0 * height));
[views get:@"chprincipal"].Width = (int)((60 * 1));
[views get:@"chprincipal"].Height = (int)((5 / 100.0 * height));
[views get:@"chprincipal"].Top = (int)(([views get:@"txtdireccion"].Top + [views get:@"txtdireccion"].Height)+(1 / 100.0 * height));
[views get:@"chprincipal"].Left = (int)(([views get:@"txtdireccion"].Left));
[views get:@"label1"].Left = (int)(([views get:@"chprincipal"].Left + [views get:@"chprincipal"].Width));
[views get:@"label1"].Width = (int)((100 / 100.0 * width)-([views get:@"label1"].Left));
[views get:@"label1"].Height = (int)(([views get:@"chprincipal"].Height));
[views get:@"label1"].Top = (int)(([views get:@"chprincipal"].Top));
[views get:@"btnnuevadireccion"].Left = (int)(([views get:@"txtdireccion"].Left));
[views get:@"btnnuevadireccion"].Height = (int)((7 / 100.0 * height));
[views get:@"btnnuevadireccion"].Width = (int)((44 / 100.0 * width));
[views get:@"btnnuevadireccion"].Top = (int)(([views get:@"chprincipal"].Top + [views get:@"chprincipal"].Height)+(2 / 100.0 * height));
[views get:@"btnsalvardireccion"].Width = (int)(([views get:@"btnnuevadireccion"].Width));
[views get:@"btnsalvardireccion"].Height = (int)(([views get:@"btnnuevadireccion"].Height));
[views get:@"btnsalvardireccion"].Top = (int)(([views get:@"btnnuevadireccion"].Top));
[views get:@"btnsalvardireccion"].Left = (int)(([views get:@"btnnuevadireccion"].Left + [views get:@"btnnuevadireccion"].Width)+(2 / 100.0 * width));

}
@end