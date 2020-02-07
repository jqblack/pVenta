
#import "iCore.h"
@interface LS_frmlistaproductos:NSObject
@end

@implementation LS_frmlistaproductos

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondo"].Left = (int)(0.0);
[views get:@"panelfondo"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelfondo"].Top = (int)(0.0);
[views get:@"panelfondo"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelheader"].Left = (int)(0.0);
[views get:@"panelheader"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelheader"].Top = (int)(0.0);
[views get:@"panelheader"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"lblhome"].Top = (int)(0.0);
[views get:@"lblhome"].Left = (int)((15 / 100.0 * width));
[views get:@"lblhome"].Width = (int)((68 / 100.0 * width));
[views get:@"lblhome"].Height = (int)((8 / 100.0 * height));
[views get:@"paneltexto"].Top = (int)(([views get:@"panelheader"].Top + [views get:@"panelheader"].Height)+(2 / 100.0 * height));
[views get:@"paneltexto"].Left = (int)((5 / 100.0 * width));
[views get:@"paneltexto"].Width = (int)((80 / 100.0 * width) - ((5 / 100.0 * width)));
[views get:@"paneltexto"].Height = (int)((6 / 100.0 * height));
[views get:@"txtnombreref"].Top = (int)(0.0);
[views get:@"txtnombreref"].Left = (int)(0.0);
[views get:@"txtnombreref"].Width = (int)(([views get:@"paneltexto"].Width));
[views get:@"txtnombreref"].Height = (int)(([views get:@"paneltexto"].Height)+(2 / 100.0 * height));
[views get:@"btntipocategoria"].Top = (int)(([views get:@"paneltexto"].Top + [views get:@"paneltexto"].Height)+(2 / 100.0 * height));
[views get:@"btntipocategoria"].Left = (int)((5 / 100.0 * width));
[views get:@"btntipocategoria"].Width = (int)((80 / 100.0 * width) - ((5 / 100.0 * width)));
[views get:@"btntipocategoria"].Height = (int)((6 / 100.0 * height));
[views get:@"btnbuscar"].Left = (int)(([views get:@"paneltexto"].Left + [views get:@"paneltexto"].Width)+(2 / 100.0 * width));
[views get:@"btnbuscar"].Top = (int)(([views get:@"paneltexto"].Top));
[views get:@"btnbuscar"].Width = (int)((15 / 100.0 * width));
[views get:@"btnbuscar"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 33;BA.debugLine="PanelLista.Top = btnTipoCategoria.Bottom + 2%y"[frmListaProductos/General script]
[views get:@"panellista"].Top = (int)(([views get:@"btntipocategoria"].Top + [views get:@"btntipocategoria"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 34;BA.debugLine="PanelLista.SetLeftAndRight(2%x,98%x)"[frmListaProductos/General script]
[views get:@"panellista"].Left = (int)((2 / 100.0 * width));
[views get:@"panellista"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
//BA.debugLineNum = 35;BA.debugLine="PanelLista.Height = 72%y"[frmListaProductos/General script]
[views get:@"panellista"].Height = (int)((72 / 100.0 * height));
//BA.debugLineNum = 37;BA.debugLine="lista.Top = 0"[frmListaProductos/General script]
[views get:@"lista"].Top = (int)(0.0);
//BA.debugLineNum = 38;BA.debugLine="lista.Left = 0"[frmListaProductos/General script]
[views get:@"lista"].Left = (int)(0.0);
//BA.debugLineNum = 39;BA.debugLine="lista.Width = PanelLista.Width"[frmListaProductos/General script]
[views get:@"lista"].Width = (int)(([views get:@"panellista"].Width));
//BA.debugLineNum = 40;BA.debugLine="lista.Height = PanelLista.Height"[frmListaProductos/General script]
[views get:@"lista"].Height = (int)(([views get:@"panellista"].Height));

}
@end