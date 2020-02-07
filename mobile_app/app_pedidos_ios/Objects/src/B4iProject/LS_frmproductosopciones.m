
#import "iCore.h"
@interface LS_frmproductosopciones:NSObject
@end

@implementation LS_frmproductosopciones

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelopcionesback"].Left = (int)(0.0);
[views get:@"panelopcionesback"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelopcionesback"].Top = (int)(0.0);
[views get:@"panelopcionesback"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelopciones"].Top = (int)((15 / 100.0 * height));
[views get:@"panelopciones"].Height = (int)((85 / 100.0 * height) - ((15 / 100.0 * height)));
[views get:@"panelopciones"].Left = (int)((2 / 100.0 * width));
[views get:@"panelopciones"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"panel1"].Left = (int)(0.0);
[views get:@"panel1"].Top = (int)(0.0);
[views get:@"panel1"].Width = (int)(([views get:@"panelopciones"].Width));
[views get:@"panel1"].Height = (int)((8 / 100.0 * height));
[views get:@"btnopcionesback"].Left = (int)(0.0);
[views get:@"btnopcionesback"].Top = (int)(0.0);
[views get:@"btnopcionesback"].Width = (int)((15 / 100.0 * width));
[views get:@"btnopcionesback"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"label1"].Left = (int)(([views get:@"btnopcionesback"].Left + [views get:@"btnopcionesback"].Width)+(2 / 100.0 * width));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Width = (int)(([views get:@"panel1"].Width)-([views get:@"label1"].Left)*2.0);
[views get:@"label1"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"btnopcioneseliminar"].Left = (int)(([views get:@"label1"].Left + [views get:@"label1"].Width));
[views get:@"btnopcioneseliminar"].Width = (int)(([views get:@"btnopcionesback"].Width));
[views get:@"btnopcioneseliminar"].Height = (int)(([views get:@"btnopcionesback"].Height));
[views get:@"btnopcioneseliminar"].Top = (int)(([views get:@"btnopcionesback"].Top));
[views get:@"label2"].Top = (int)(([views get:@"panel1"].Top + [views get:@"panel1"].Height)+(2 / 100.0 * height));
[views get:@"label2"].Left = (int)((2 / 100.0 * width));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-([views get:@"label2"].Left)*3.0);
[views get:@"lblopcionesproductonombre"].Left = (int)(([views get:@"label2"].Left));
[views get:@"lblopcionesproductonombre"].Height = (int)(([views get:@"label2"].Height));
[views get:@"lblopcionesproductonombre"].Width = (int)(([views get:@"label2"].Width));
[views get:@"lblopcionesproductonombre"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"label4"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label4"].Height = (int)((6 / 100.0 * height));
[views get:@"label4"].Top = (int)(([views get:@"lblopcionesproductonombre"].Top + [views get:@"lblopcionesproductonombre"].Height)+(2 / 100.0 * height));
[views get:@"label4"].Width = (int)((25 / 100.0 * width));
[views get:@"txtcantidad"].Left = (int)(([views get:@"label4"].Left + [views get:@"label4"].Width)+(2 / 100.0 * width));
[views get:@"txtcantidad"].Height = (int)(([views get:@"label4"].Height));
[views get:@"txtcantidad"].Width = (int)((25 / 100.0 * width));
[views get:@"txtcantidad"].Top = (int)(([views get:@"label4"].Top));
[views get:@"stmodificarcantidad"].Left = (int)(([views get:@"txtcantidad"].Left + [views get:@"txtcantidad"].Width)+(5 / 100.0 * width));
[views get:@"stmodificarcantidad"].Height = (int)(([views get:@"label4"].Height));
[views get:@"stmodificarcantidad"].Width = (int)((30 / 100.0 * width));
[views get:@"stmodificarcantidad"].Top = (int)(([views get:@"label4"].Top)+(0.2 / 100.0 * height));
[views get:@"label6"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label6"].Top = (int)(([views get:@"label4"].Top + [views get:@"label4"].Height)+(3 / 100.0 * height));
[views get:@"label6"].Width = (int)((92 / 100.0 * width));
[views get:@"label6"].Height = (int)((5 / 100.0 * height));
[views get:@"txtproductocomentario"].Left = (int)(([views get:@"label6"].Left));
[views get:@"txtproductocomentario"].Top = (int)(([views get:@"label6"].Top + [views get:@"label6"].Height));
[views get:@"txtproductocomentario"].Width = (int)(([views get:@"label6"].Width));
[views get:@"txtproductocomentario"].Height = (int)((20 / 100.0 * height));
[views get:@"btnopcionesproductosalvar"].Top = (int)(([views get:@"txtproductocomentario"].Top + [views get:@"txtproductocomentario"].Height)+(3 / 100.0 * height));
[views get:@"btnopcionesproductosalvar"].Left = (int)(([views get:@"label2"].Left));
[views get:@"btnopcionesproductosalvar"].Height = (int)((8 / 100.0 * height));
[views get:@"btnopcionesproductosalvar"].Width = (int)(([views get:@"label6"].Width));

}
@end