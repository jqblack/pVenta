
#import "iCore.h"
@interface LS_frmdirecciones:NSObject
@end

@implementation LS_frmdirecciones

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[frmDirecciones/General script]
[B4ILayoutBuilder scaleAll:views :width :height];
//BA.debugLineNum = 4;BA.debugLine="Label2.Top =  2%y"[frmDirecciones/General script]
[views get:@"label2"].Top = (int)((2 / 100.0 * height));
//BA.debugLineNum = 5;BA.debugLine="Label2.Height = 5%y"[frmDirecciones/General script]
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 6;BA.debugLine="Label2.Left = 5%x"[frmDirecciones/General script]
[views get:@"label2"].Left = (int)((5 / 100.0 * width));
//BA.debugLineNum = 7;BA.debugLine="Label2.Width = 100%x - Label2.Left"[frmDirecciones/General script]
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-([views get:@"label2"].Left));
//BA.debugLineNum = 9;BA.debugLine="Panel2.Top = Label2.Bottom"[frmDirecciones/General script]
[views get:@"panel2"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
//BA.debugLineNum = 10;BA.debugLine="Panel2.Left = Label2.Left"[frmDirecciones/General script]
[views get:@"panel2"].Left = (int)(([views get:@"label2"].Left));
//BA.debugLineNum = 11;BA.debugLine="Panel2.Height = 48.5%y"[frmDirecciones/General script]
[views get:@"panel2"].Height = (int)((48.5 / 100.0 * height));
//BA.debugLineNum = 12;BA.debugLine="Panel2.Width = 100%x - Panel2.Left * 2"[frmDirecciones/General script]
[views get:@"panel2"].Width = (int)((100 / 100.0 * width)-([views get:@"panel2"].Left)*2.0);
//BA.debugLineNum = 14;BA.debugLine="Label3.Top = Panel2.Bottom +2%y"[frmDirecciones/General script]
[views get:@"label3"].Top = (int)(([views get:@"panel2"].Top + [views get:@"panel2"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 15;BA.debugLine="Label3.Width = Label2.Width"[frmDirecciones/General script]
[views get:@"label3"].Width = (int)(([views get:@"label2"].Width));
//BA.debugLineNum = 16;BA.debugLine="Label3.Height = Label2.Height"[frmDirecciones/General script]
[views get:@"label3"].Height = (int)(([views get:@"label2"].Height));
//BA.debugLineNum = 17;BA.debugLine="Label3.Left = Label2.Left"[frmDirecciones/General script]
[views get:@"label3"].Left = (int)(([views get:@"label2"].Left));
//BA.debugLineNum = 19;BA.debugLine="txtDireccion.Top = Label3.Bottom"[frmDirecciones/General script]
[views get:@"txtdireccion"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
//BA.debugLineNum = 20;BA.debugLine="txtDireccion.Left = Panel2.Left"[frmDirecciones/General script]
[views get:@"txtdireccion"].Left = (int)(([views get:@"panel2"].Left));
//BA.debugLineNum = 21;BA.debugLine="txtDireccion.Width = Panel2.Width"[frmDirecciones/General script]
[views get:@"txtdireccion"].Width = (int)(([views get:@"panel2"].Width));
//BA.debugLineNum = 22;BA.debugLine="txtDireccion.Height = 20%y"[frmDirecciones/General script]
[views get:@"txtdireccion"].Height = (int)((20 / 100.0 * height));
//BA.debugLineNum = 24;BA.debugLine="chPrincipal.Width = 60dip"[frmDirecciones/General script]
[views get:@"chprincipal"].Width = (int)((60 * 1));
//BA.debugLineNum = 25;BA.debugLine="chPrincipal.Height = 5%y"[frmDirecciones/General script]
[views get:@"chprincipal"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 26;BA.debugLine="chPrincipal.Top = txtDireccion.Bottom + 1%y"[frmDirecciones/General script]
[views get:@"chprincipal"].Top = (int)(([views get:@"txtdireccion"].Top + [views get:@"txtdireccion"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 27;BA.debugLine="chPrincipal.Left = txtDireccion.Left"[frmDirecciones/General script]
[views get:@"chprincipal"].Left = (int)(([views get:@"txtdireccion"].Left));
//BA.debugLineNum = 29;BA.debugLine="Label1.Left = chPrincipal.Right"[frmDirecciones/General script]
[views get:@"label1"].Left = (int)(([views get:@"chprincipal"].Left + [views get:@"chprincipal"].Width));
//BA.debugLineNum = 30;BA.debugLine="Label1.Width = 100%x - Label1.Left"[frmDirecciones/General script]
[views get:@"label1"].Width = (int)((100 / 100.0 * width)-([views get:@"label1"].Left));
//BA.debugLineNum = 31;BA.debugLine="Label1.Height = chPrincipal.Height"[frmDirecciones/General script]
[views get:@"label1"].Height = (int)(([views get:@"chprincipal"].Height));
//BA.debugLineNum = 32;BA.debugLine="Label1.Top = chPrincipal.Top"[frmDirecciones/General script]
[views get:@"label1"].Top = (int)(([views get:@"chprincipal"].Top));
//BA.debugLineNum = 34;BA.debugLine="btnNuevaDireccion.Left = txtDireccion.Left"[frmDirecciones/General script]
[views get:@"btnnuevadireccion"].Left = (int)(([views get:@"txtdireccion"].Left));
//BA.debugLineNum = 35;BA.debugLine="btnNuevaDireccion.Height = 7%y"[frmDirecciones/General script]
[views get:@"btnnuevadireccion"].Height = (int)((7 / 100.0 * height));
//BA.debugLineNum = 36;BA.debugLine="btnNuevaDireccion.Width = 44%x"[frmDirecciones/General script]
[views get:@"btnnuevadireccion"].Width = (int)((44 / 100.0 * width));
//BA.debugLineNum = 37;BA.debugLine="btnNuevaDireccion.Top = chPrincipal.Bottom + 2%y"[frmDirecciones/General script]
[views get:@"btnnuevadireccion"].Top = (int)(([views get:@"chprincipal"].Top + [views get:@"chprincipal"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 39;BA.debugLine="btnSalvarDireccion.Width = btnNuevaDireccion.Width"[frmDirecciones/General script]
[views get:@"btnsalvardireccion"].Width = (int)(([views get:@"btnnuevadireccion"].Width));
//BA.debugLineNum = 40;BA.debugLine="btnSalvarDireccion.Height = btnNuevaDireccion.Height"[frmDirecciones/General script]
[views get:@"btnsalvardireccion"].Height = (int)(([views get:@"btnnuevadireccion"].Height));
//BA.debugLineNum = 41;BA.debugLine="btnSalvarDireccion.Top = btnNuevaDireccion.Top"[frmDirecciones/General script]
[views get:@"btnsalvardireccion"].Top = (int)(([views get:@"btnnuevadireccion"].Top));
//BA.debugLineNum = 42;BA.debugLine="btnSalvarDireccion.Left = btnNuevaDireccion.Right +2%x"[frmDirecciones/General script]
[views get:@"btnsalvardireccion"].Left = (int)(([views get:@"btnnuevadireccion"].Left + [views get:@"btnnuevadireccion"].Width)+(2 / 100.0 * width));

}
@end