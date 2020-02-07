
#import "iCore.h"
@interface LS_frmproductoopciones:NSObject
@end

@implementation LS_frmproductoopciones

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"label2"].Top = (int)((2 / 100.0 * height));
[views get:@"label2"].Left = (int)((3 / 100.0 * width));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-([views get:@"label2"].Left));
[views get:@"lblopcionesproductonombre"].Left = (int)(([views get:@"label2"].Left));
[views get:@"lblopcionesproductonombre"].Height = (int)(([views get:@"label2"].Height));
[views get:@"lblopcionesproductonombre"].Width = (int)(([views get:@"label2"].Width));
[views get:@"lblopcionesproductonombre"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"label4"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label4"].Height = (int)((6 / 100.0 * height));
[views get:@"label4"].Top = (int)(([views get:@"lblopcionesproductonombre"].Top + [views get:@"lblopcionesproductonombre"].Height)+(2 / 100.0 * height));
[views get:@"label4"].Width = (int)((25 / 100.0 * width));
[views get:@"txtcantidad"].Left = (int)(([views get:@"label4"].Left + [views get:@"label4"].Width));
[views get:@"txtcantidad"].Height = (int)(([views get:@"label4"].Height));
[views get:@"txtcantidad"].Width = (int)((25 / 100.0 * width));
[views get:@"txtcantidad"].Top = (int)(([views get:@"label4"].Top));
[views get:@"stmodificarcantidad"].Left = (int)(([views get:@"txtcantidad"].Left + [views get:@"txtcantidad"].Width)+(5 / 100.0 * width));
[views get:@"stmodificarcantidad"].Height = (int)(([views get:@"label4"].Height));
[views get:@"stmodificarcantidad"].Width = (int)((30 / 100.0 * width));
[views get:@"stmodificarcantidad"].Top = (int)(([views get:@"label4"].Top)+(0.5 / 100.0 * height));
[views get:@"label5"].Left = (int)(([views get:@"label4"].Left));
[views get:@"label5"].Top = (int)(([views get:@"label4"].Top + [views get:@"label4"].Height)+(2 / 100.0 * height));
[views get:@"label5"].Width = (int)((100 / 100.0 * width)-([views get:@"label5"].Left));
[views get:@"label5"].Height = (int)((4 / 100.0 * height));
[views get:@"panelscrollviewopciones"].Left = (int)(([views get:@"label5"].Left));
[views get:@"panelscrollviewopciones"].Top = (int)(([views get:@"label5"].Top + [views get:@"label5"].Height));
[views get:@"panelscrollviewopciones"].Width = (int)((100 / 100.0 * width)-([views get:@"panelscrollviewopciones"].Left)*2.0);
[views get:@"panelscrollviewopciones"].Height = (int)((36 / 100.0 * height));
[views get:@"scrollviewopciones"].Left = (int)(0.0);
[views get:@"scrollviewopciones"].Top = (int)(0.0);
[views get:@"scrollviewopciones"].Width = (int)(([views get:@"panelscrollviewopciones"].Width));
[views get:@"scrollviewopciones"].Height = (int)(([views get:@"panelscrollviewopciones"].Height));
[views get:@"label6"].Left = (int)(([views get:@"panelscrollviewopciones"].Left));
[views get:@"label6"].Top = (int)(([views get:@"panelscrollviewopciones"].Top + [views get:@"panelscrollviewopciones"].Height)+(2 / 100.0 * height));
[views get:@"label6"].Width = (int)(([views get:@"panelscrollviewopciones"].Width));
[views get:@"label6"].Height = (int)((5 / 100.0 * height));
[views get:@"txtproductocomentario"].Left = (int)(([views get:@"label6"].Left));
[views get:@"txtproductocomentario"].Top = (int)(([views get:@"label6"].Top + [views get:@"label6"].Height));
[views get:@"txtproductocomentario"].Width = (int)(([views get:@"label6"].Width));
[views get:@"txtproductocomentario"].Height = (int)((20 / 100.0 * height));
[views get:@"btnopcionesproductosalvar"].Left = (int)(([views get:@"panelscrollviewopciones"].Left));
[views get:@"btnopcionesproductosalvar"].Height = (int)((7 / 100.0 * height));
[views get:@"btnopcionesproductosalvar"].Width = (int)(([views get:@"panelscrollviewopciones"].Width));
[views get:@"btnopcionesproductosalvar"].Top = (int)(([views get:@"txtproductocomentario"].Top + [views get:@"txtproductocomentario"].Height)+(2 / 100.0 * height));

}
@end