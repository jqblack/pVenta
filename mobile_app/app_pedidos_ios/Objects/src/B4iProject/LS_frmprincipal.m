
#import "iCore.h"
@interface LS_frmprincipal:NSObject
@end

@implementation LS_frmprincipal

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelmenu"].Left = (int)(0.0);
[views get:@"panelmenu"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelmenu"].Top = (int)(0.0);
[views get:@"panelmenu"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"paneltitulo"].Left = (int)((0 / 100.0 * width));
[views get:@"paneltitulo"].Width = (int)((100 / 100.0 * width) - ((0 / 100.0 * width)));
[views get:@"paneltitulo"].Top = (int)((0 / 100.0 * height));
[views get:@"paneltitulo"].Height = (int)((8 / 100.0 * height) - ((0 / 100.0 * height)));
[views get:@"btnprincipalback"].Left = (int)(0.0);
[views get:@"btnprincipalback"].Top = (int)(0.0);
[views get:@"btnprincipalback"].Width = (int)((15 / 100.0 * width));
[views get:@"btnprincipalback"].Height = (int)(([views get:@"paneltitulo"].Height));
[views get:@"btnempresainfo"].Top = (int)(0.0);
[views get:@"btnempresainfo"].Left = (int)(([views get:@"btnprincipalback"].Left + [views get:@"btnprincipalback"].Width)+(8 / 100.0 * width));
[views get:@"btnempresainfo"].Height = (int)(([views get:@"btnprincipalback"].Height));
[views get:@"btnempresainfo"].Width = (int)((100 / 100.0 * width)-([views get:@"btnempresainfo"].Left)*2.0);
[views get:@"btnorden"].Left = (int)(([views get:@"btnempresainfo"].Left + [views get:@"btnempresainfo"].Width)+(8 / 100.0 * width));
[views get:@"btnorden"].Width = (int)(([views get:@"btnprincipalback"].Width));
[views get:@"btnorden"].Height = (int)(([views get:@"btnprincipalback"].Height));
[views get:@"btnorden"].Top = (int)(([views get:@"btnprincipalback"].Top));
[views get:@"lblcantidadproductos"].Height = (int)((20 * 1));
[views get:@"lblcantidadproductos"].Width = (int)(([views get:@"lblcantidadproductos"].Height));
[views get:@"lblcantidadproductos"].Left = (int)(([views get:@"btnorden"].Left + [views get:@"btnorden"].Width)-(1 / 100.0 * width) - ([views get:@"lblcantidadproductos"].Width));
[views get:@"lblcantidadproductos"].Top = (int)(([views get:@"btnorden"].Top)+(0.5 / 100.0 * height));
[views get:@"btnmasvendido"].Top = (int)(([views get:@"paneltitulo"].Top + [views get:@"paneltitulo"].Height)+(1 / 100.0 * height));
[views get:@"btnmasvendido"].Left = (int)((3 / 100.0 * width));
[views get:@"btnmasvendido"].Width = (int)((46 / 100.0 * width));
[views get:@"btnmasvendido"].Height = (int)((7 / 100.0 * height));
[views get:@"btnbuscarproducto"].Left = (int)(([views get:@"btnmasvendido"].Left + [views get:@"btnmasvendido"].Width)+(2 / 100.0 * width));
[views get:@"btnbuscarproducto"].Width = (int)(([views get:@"btnmasvendido"].Width));
[views get:@"btnbuscarproducto"].Height = (int)(([views get:@"btnmasvendido"].Height));
[views get:@"btnbuscarproducto"].Top = (int)(([views get:@"btnmasvendido"].Top));
[views get:@"panelcategoria"].Left = (int)((0 / 100.0 * width));
[views get:@"panelcategoria"].Top = (int)(([views get:@"btnmasvendido"].Top + [views get:@"btnmasvendido"].Height)+(1 / 100.0 * height));
[views get:@"panelcategoria"].Width = (int)((100 / 100.0 * width));
[views get:@"panelcategoria"].Height = (int)((72 / 100.0 * height));
[views get:@"viewcategoria"].Top = (int)((2 / 100.0 * height));
[views get:@"viewcategoria"].Left = (int)((1 / 100.0 * width));
[views get:@"viewcategoria"].Height = (int)((68 / 100.0 * height));
[views get:@"viewcategoria"].Width = (int)(([views get:@"panelcategoria"].Width)-([views get:@"viewcategoria"].Left)*2.0);
[views get:@"panelfooterv2"].Left = (int)(0.0);
[views get:@"panelfooterv2"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelfooterv2"].Top = (int)(([views get:@"panelcategoria"].Top + [views get:@"panelcategoria"].Height)+(2 / 100.0 * height));
[views get:@"panelfooterv2"].Height = (int)((9 / 100.0 * height));
[views get:@"btniniciarsecion"].Top = (int)(0.0);
[views get:@"btniniciarsecion"].Height = (int)((9 / 100.0 * height) - (0.0));
[views get:@"btniniciarsecion"].Left = (int)((50 / 100.0 * width));
[views get:@"btniniciarsecion"].Width = (int)((100 / 100.0 * width) - ((50 / 100.0 * width)));
[views get:@"panelmodalproducto"].Width = (int)((100 / 100.0 * width));
[views get:@"panelmodalproducto"].Left = (int)((100 / 100.0 * width));
[views get:@"panelmodalproducto"].Top = (int)(0.0);
[views get:@"panelmodalproducto"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panel1"].Top = (int)((9 / 100.0 * height));
[views get:@"panel1"].Left = (int)((5 / 100.0 * width));
[views get:@"panel1"].Height = (int)((9 / 100.0 * height));
[views get:@"panel1"].Width = (int)((100 / 100.0 * width)-([views get:@"panel1"].Left)*2.0);
[views get:@"txtbuscarproducto"].Left = (int)((1 / 100.0 * width));
[views get:@"txtbuscarproducto"].Top = (int)((0.9 / 100.0 * height));
[views get:@"txtbuscarproducto"].Width = (int)((72 / 100.0 * width));
[views get:@"txtbuscarproducto"].Height = (int)(([views get:@"panel1"].Height)-([views get:@"txtbuscarproducto"].Top)*2.0);
[views get:@"btnproductobuscarmodal"].Left = (int)(([views get:@"txtbuscarproducto"].Left + [views get:@"txtbuscarproducto"].Width)+(1 / 100.0 * width));
[views get:@"btnproductobuscarmodal"].Height = (int)(([views get:@"txtbuscarproducto"].Height));
[views get:@"btnproductobuscarmodal"].Width = (int)((15 / 100.0 * width));
[views get:@"btnproductobuscarmodal"].Top = (int)(([views get:@"txtbuscarproducto"].Top));
[views get:@"panel2buscarpro"].Left = (int)(([views get:@"panel1"].Left));
[views get:@"panel2buscarpro"].Top = (int)(([views get:@"panel1"].Top + [views get:@"panel1"].Height)+(2 / 100.0 * height));
[views get:@"panel2buscarpro"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"panel2buscarpro"].Height = (int)((75 / 100.0 * height));
[views get:@"panelproductosmodalview"].Left = (int)((2 / 100.0 * width));
[views get:@"panelproductosmodalview"].Top = (int)((1 / 100.0 * height));
[views get:@"panelproductosmodalview"].Width = (int)(([views get:@"panel2buscarpro"].Width)-([views get:@"panelproductosmodalview"].Left)*2.0);
[views get:@"panelproductosmodalview"].Height = (int)(([views get:@"panel2buscarpro"].Height)-(11 / 100.0 * height));
[views get:@"listabusquedapro"].Top = (int)(0.0);
[views get:@"listabusquedapro"].Left = (int)(0.0);
[views get:@"listabusquedapro"].Width = (int)(([views get:@"panelproductosmodalview"].Width));
[views get:@"listabusquedapro"].Height = (int)(([views get:@"panelproductosmodalview"].Height));
[views get:@"btnproductovolver"].Top = (int)(([views get:@"panelproductosmodalview"].Top + [views get:@"panelproductosmodalview"].Height)+(1 / 100.0 * height));
[views get:@"btnproductovolver"].Left = (int)(([views get:@"panelproductosmodalview"].Left));
[views get:@"btnproductovolver"].Width = (int)(([views get:@"panelproductosmodalview"].Width));
[views get:@"btnproductovolver"].Height = (int)((7 / 100.0 * height));
[views get:@"panel2buscarpro"].Height = (int)(([views get:@"btnproductovolver"].Top + [views get:@"btnproductovolver"].Height)+(1 / 100.0 * height));

}
@end