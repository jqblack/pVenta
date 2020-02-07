
#import "iCore.h"
@interface LS_frmimagen:NSObject
@end

@implementation LS_frmimagen

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[frmImagen/General script]
[B4ILayoutBuilder scaleAll:views :width :height];
//BA.debugLineNum = 5;BA.debugLine="PanelFondoImagen.SetLeftAndRight(0,100%x)"[frmImagen/General script]
[views get:@"panelfondoimagen"].Left = (int)(0.0);
[views get:@"panelfondoimagen"].Width = (int)((100 / 100.0 * width) - (0.0));
//BA.debugLineNum = 6;BA.debugLine="PanelFondoImagen.SetTopAndBottom(0,100%y)"[frmImagen/General script]
[views get:@"panelfondoimagen"].Top = (int)(0.0);
[views get:@"panelfondoimagen"].Height = (int)((100 / 100.0 * height) - (0.0));
//BA.debugLineNum = 8;BA.debugLine="PanelHeaderImagenes.Left = 0"[frmImagen/General script]
[views get:@"panelheaderimagenes"].Left = (int)(0.0);
//BA.debugLineNum = 9;BA.debugLine="PanelHeaderImagenes.SetTopAndBottom(0,8%y)"[frmImagen/General script]
[views get:@"panelheaderimagenes"].Top = (int)(0.0);
[views get:@"panelheaderimagenes"].Height = (int)((8 / 100.0 * height) - (0.0));
//BA.debugLineNum = 10;BA.debugLine="PanelHeaderImagenes.Width = 100%x"[frmImagen/General script]
[views get:@"panelheaderimagenes"].Width = (int)((100 / 100.0 * width));
//BA.debugLineNum = 12;BA.debugLine="btnCancelarFoto.Left = 0"[frmImagen/General script]
[views get:@"btncancelarfoto"].Left = (int)(0.0);
//BA.debugLineNum = 13;BA.debugLine="btnCancelarFoto.Top = 0"[frmImagen/General script]
[views get:@"btncancelarfoto"].Top = (int)(0.0);
//BA.debugLineNum = 14;BA.debugLine="btnCancelarFoto.Width = 17%x"[frmImagen/General script]
[views get:@"btncancelarfoto"].Width = (int)((17 / 100.0 * width));
//BA.debugLineNum = 15;BA.debugLine="btnCancelarFoto.Height = 8%y"[frmImagen/General script]
[views get:@"btncancelarfoto"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 17;BA.debugLine="lbltituloImagen.Left = btnCancelarFoto.Right + 5%x"[frmImagen/General script]
[views get:@"lbltituloimagen"].Left = (int)(([views get:@"btncancelarfoto"].Left + [views get:@"btncancelarfoto"].Width)+(5 / 100.0 * width));
//BA.debugLineNum = 18;BA.debugLine="lbltituloImagen.Top = 0"[frmImagen/General script]
[views get:@"lbltituloimagen"].Top = (int)(0.0);
//BA.debugLineNum = 19;BA.debugLine="lbltituloImagen.Height = 8%y"[frmImagen/General script]
[views get:@"lbltituloimagen"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 20;BA.debugLine="lbltituloImagen.Width = 70%x"[frmImagen/General script]
[views get:@"lbltituloimagen"].Width = (int)((70 / 100.0 * width));
//BA.debugLineNum = 22;BA.debugLine="panelImagen.Top = PanelHeaderImagenes.Bottom + 2%y"[frmImagen/General script]
[views get:@"panelimagen"].Top = (int)(([views get:@"panelheaderimagenes"].Top + [views get:@"panelheaderimagenes"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 23;BA.debugLine="panelImagen.SetLeftAndRight(2%x,98%x)"[frmImagen/General script]
[views get:@"panelimagen"].Left = (int)((2 / 100.0 * width));
[views get:@"panelimagen"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
//BA.debugLineNum = 24;BA.debugLine="panelImagen.Height = 78%y"[frmImagen/General script]
[views get:@"panelimagen"].Height = (int)((78 / 100.0 * height));
//BA.debugLineNum = 26;BA.debugLine="imgMyfoto.Top = 0"[frmImagen/General script]
[views get:@"imgmyfoto"].Top = (int)(0.0);
//BA.debugLineNum = 27;BA.debugLine="imgMyfoto.Left = 0"[frmImagen/General script]
[views get:@"imgmyfoto"].Left = (int)(0.0);
//BA.debugLineNum = 28;BA.debugLine="imgMyfoto.Width = panelImagen.Width"[frmImagen/General script]
[views get:@"imgmyfoto"].Width = (int)(([views get:@"panelimagen"].Width));
//BA.debugLineNum = 29;BA.debugLine="imgMyfoto.Height = panelImagen.Height"[frmImagen/General script]
[views get:@"imgmyfoto"].Height = (int)(([views get:@"panelimagen"].Height));
//BA.debugLineNum = 31;BA.debugLine="btnEnviar.Top = panelImagen.Bottom + 2%y"[frmImagen/General script]
[views get:@"btnenviar"].Top = (int)(([views get:@"panelimagen"].Top + [views get:@"panelimagen"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 32;BA.debugLine="btnEnviar.SetLeftAndRight(5%x,95%x)"[frmImagen/General script]
[views get:@"btnenviar"].Left = (int)((5 / 100.0 * width));
[views get:@"btnenviar"].Width = (int)((95 / 100.0 * width) - ((5 / 100.0 * width)));
//BA.debugLineNum = 33;BA.debugLine="btnEnviar.Height = 8%y"[frmImagen/General script]
[views get:@"btnenviar"].Height = (int)((8 / 100.0 * height));

}
@end