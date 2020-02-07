
#import "iCore.h"
@interface LS_frmregistarcliente:NSObject
@end

@implementation LS_frmregistarcliente

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"imgfondo"].Left = (int)(0.0);
[views get:@"imgfondo"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"imgfondo"].Top = (int)(0.0);
[views get:@"imgfondo"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panel1"].Left = (int)(0.0);
[views get:@"panel1"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panel1"].Top = (int)(0.0);
[views get:@"panel1"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnregistroclienteback"].Left = (int)(0.0);
[views get:@"btnregistroclienteback"].Top = (int)(0.0);
[views get:@"btnregistroclienteback"].Width = (int)((15 / 100.0 * width));
[views get:@"btnregistroclienteback"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"label1"].Left = (int)(([views get:@"btnregistroclienteback"].Left + [views get:@"btnregistroclienteback"].Width)+(2 / 100.0 * width));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Width = (int)(([views get:@"panel1"].Width)-([views get:@"label1"].Left));
[views get:@"label1"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"label2"].Top = (int)(([views get:@"panel1"].Top + [views get:@"panel1"].Height)+(1 / 100.0 * height));
[views get:@"label2"].Left = (int)((3 / 100.0 * width));
[views get:@"label2"].Width = (int)((70 / 100.0 * width));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"txtnombre"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"txtnombre"].Left = (int)(([views get:@"label2"].Left));
[views get:@"txtnombre"].Height = (int)((7 / 100.0 * height));
[views get:@"txtnombre"].Width = (int)((100 / 100.0 * width)-([views get:@"txtnombre"].Left)*2.0);
[views get:@"label3"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label3"].Height = (int)(([views get:@"label2"].Height));
[views get:@"label3"].Top = (int)(([views get:@"txtnombre"].Top + [views get:@"txtnombre"].Height)+(1 / 100.0 * height));
[views get:@"label3"].Width = (int)(([views get:@"label2"].Width));
[views get:@"txttelefono"].Left = (int)(([views get:@"txtnombre"].Left));
[views get:@"txttelefono"].Width = (int)(([views get:@"txtnombre"].Width));
[views get:@"txttelefono"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
[views get:@"txttelefono"].Height = (int)(([views get:@"txtnombre"].Height));
[views get:@"label4"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label4"].Height = (int)(([views get:@"label2"].Height));
[views get:@"label4"].Top = (int)(([views get:@"txttelefono"].Top + [views get:@"txttelefono"].Height)+(1 / 100.0 * height));
[views get:@"label4"].Width = (int)(([views get:@"label2"].Width));
[views get:@"txtdireccion"].Left = (int)(([views get:@"txtnombre"].Left));
[views get:@"txtdireccion"].Width = (int)(([views get:@"txtnombre"].Width));
[views get:@"txtdireccion"].Top = (int)(([views get:@"label4"].Top + [views get:@"label4"].Height));
[views get:@"txtdireccion"].Height = (int)(([views get:@"txtnombre"].Height));
[views get:@"label5"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label5"].Height = (int)(([views get:@"label2"].Height));
[views get:@"label5"].Top = (int)(([views get:@"txtdireccion"].Top + [views get:@"txtdireccion"].Height)+(1 / 100.0 * height));
[views get:@"label5"].Width = (int)(([views get:@"label2"].Width));
[views get:@"txtusuarioregistro"].Left = (int)(([views get:@"txtnombre"].Left));
[views get:@"txtusuarioregistro"].Width = (int)(([views get:@"txtnombre"].Width));
[views get:@"txtusuarioregistro"].Top = (int)(([views get:@"label5"].Top + [views get:@"label5"].Height));
[views get:@"txtusuarioregistro"].Height = (int)(([views get:@"txtnombre"].Height));
[views get:@"label6"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label6"].Height = (int)(([views get:@"label2"].Height));
[views get:@"label6"].Top = (int)(([views get:@"txtusuarioregistro"].Top + [views get:@"txtusuarioregistro"].Height)+(1 / 100.0 * height));
[views get:@"label6"].Width = (int)(([views get:@"label2"].Width));
[views get:@"txtcontrasenaregistro"].Left = (int)(([views get:@"txtnombre"].Left));
[views get:@"txtcontrasenaregistro"].Width = (int)(([views get:@"txtnombre"].Width));
[views get:@"txtcontrasenaregistro"].Top = (int)(([views get:@"label6"].Top + [views get:@"label6"].Height));
[views get:@"txtcontrasenaregistro"].Height = (int)(([views get:@"txtnombre"].Height));
[views get:@"label7"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label7"].Height = (int)(([views get:@"label2"].Height));
[views get:@"label7"].Top = (int)(([views get:@"txtcontrasenaregistro"].Top + [views get:@"txtcontrasenaregistro"].Height)+(1 / 100.0 * height));
[views get:@"label7"].Width = (int)(([views get:@"label2"].Width));
[views get:@"txtcontrasena2"].Left = (int)(([views get:@"txtnombre"].Left));
[views get:@"txtcontrasena2"].Width = (int)(([views get:@"txtnombre"].Width));
[views get:@"txtcontrasena2"].Top = (int)(([views get:@"label7"].Top + [views get:@"label7"].Height));
[views get:@"txtcontrasena2"].Height = (int)(([views get:@"txtnombre"].Height));
[views get:@"btnregistroclienteregistrarme"].Height = (int)((7 / 100.0 * height));
[views get:@"btnregistroclienteregistrarme"].Width = (int)(([views get:@"txtnombre"].Width));
[views get:@"btnregistroclienteregistrarme"].Top = (int)(([views get:@"txtcontrasena2"].Top + [views get:@"txtcontrasena2"].Height)+(3 / 100.0 * height));
[views get:@"btnregistroclienteregistrarme"].Left = (int)(([views get:@"txtnombre"].Left));

}
@end