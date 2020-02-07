
#import "iCore.h"
@interface LS_frmprincipal:NSObject
@end

@implementation LS_frmprincipal

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"btnmasvendido"].Top = (int)((2 / 100.0 * height));
[views get:@"btnmasvendido"].Left = (int)((3 / 100.0 * width));
[views get:@"btnmasvendido"].Width = (int)((46 / 100.0 * width));
[views get:@"btnmasvendido"].Height = (int)((7 / 100.0 * height));
[views get:@"btnbuscarproducto"].Left = (int)(([views get:@"btnmasvendido"].Left + [views get:@"btnmasvendido"].Width)+(2 / 100.0 * width));
[views get:@"btnbuscarproducto"].Width = (int)(([views get:@"btnmasvendido"].Width));
[views get:@"btnbuscarproducto"].Height = (int)(([views get:@"btnmasvendido"].Height));
[views get:@"btnbuscarproducto"].Top = (int)(([views get:@"btnmasvendido"].Top));
[views get:@"lblcategoria"].Top = (int)(([views get:@"btnmasvendido"].Top + [views get:@"btnmasvendido"].Height)+(1 / 100.0 * height));
[views get:@"lblcategoria"].Left = (int)(([views get:@"btnmasvendido"].Left));
[views get:@"lblcategoria"].Height = (int)((5 / 100.0 * height));
[views get:@"lblcategoria"].Width = (int)((90 / 100.0 * width));
[views get:@"panelcategoria"].Left = (int)(([views get:@"lblcategoria"].Left));
[views get:@"panelcategoria"].Top = (int)(([views get:@"lblcategoria"].Top + [views get:@"lblcategoria"].Height));
[views get:@"panelcategoria"].Width = (int)((100 / 100.0 * width)-([views get:@"viewcategoria"].Left)*2.0);
[views get:@"panelcategoria"].Height = (int)((77 / 100.0 * height));
[views get:@"viewcategoria"].Left = (int)(0.0);
[views get:@"viewcategoria"].Top = (int)(0.0);
[views get:@"viewcategoria"].Width = (int)(([views get:@"panelcategoria"].Width));
[views get:@"viewcategoria"].Height = (int)(([views get:@"panelcategoria"].Height));
[views get:@"btnabierto"].Top = (int)(([views get:@"panelcategoria"].Top + [views get:@"panelcategoria"].Height)+(1.5 / 100.0 * height));
[views get:@"btnabierto"].Width = (int)((35 / 100.0 * width));
[views get:@"btnabierto"].Left = (int)(([views get:@"panelcategoria"].Left));
[views get:@"btnabierto"].Height = (int)((5.5 / 100.0 * height));
[views get:@"lbllema"].Left = (int)(([views get:@"btnabierto"].Left + [views get:@"btnabierto"].Width)+(2 / 100.0 * width));
[views get:@"lbllema"].Top = (int)(([views get:@"panelcategoria"].Top + [views get:@"panelcategoria"].Height));
[views get:@"lbllema"].Height = (int)((100 / 100.0 * height)-([views get:@"lbllema"].Top));
[views get:@"lbllema"].Width = (int)((100 / 100.0 * width)-([views get:@"lbllema"].Left));
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
[views get:@"panel2"].Left = (int)(([views get:@"panel1"].Left));
[views get:@"panel2"].Top = (int)(([views get:@"panel1"].Top + [views get:@"panel1"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 62;BA.debugLine="Panel2.Width = Panel1.Width"[frmPrincipal/General script]
[views get:@"panel2"].Width = (int)(([views get:@"panel1"].Width));
//BA.debugLineNum = 63;BA.debugLine="Panel2.Height = 75%y"[frmPrincipal/General script]
[views get:@"panel2"].Height = (int)((75 / 100.0 * height));
//BA.debugLineNum = 65;BA.debugLine="PanelProductosModalView.Left = 2%x"[frmPrincipal/General script]
[views get:@"panelproductosmodalview"].Left = (int)((2 / 100.0 * width));
//BA.debugLineNum = 66;BA.debugLine="PanelProductosModalView.Top = 1%y"[frmPrincipal/General script]
[views get:@"panelproductosmodalview"].Top = (int)((1 / 100.0 * height));
//BA.debugLineNum = 67;BA.debugLine="PanelProductosModalView.Width = Panel2.Width - PanelProductosModalView.Left*2"[frmPrincipal/General script]
[views get:@"panelproductosmodalview"].Width = (int)(([views get:@"panel2"].Width)-([views get:@"panelproductosmodalview"].Left)*2.0);
//BA.debugLineNum = 68;BA.debugLine="PanelProductosModalView.Height = Panel2.Height - 11%y"[frmPrincipal/General script]
[views get:@"panelproductosmodalview"].Height = (int)(([views get:@"panel2"].Height)-(11 / 100.0 * height));
//BA.debugLineNum = 70;BA.debugLine="btnProductoVolver.Top = PanelProductosModalView.Bottom + 1%y"[frmPrincipal/General script]
[views get:@"btnproductovolver"].Top = (int)(([views get:@"panelproductosmodalview"].Top + [views get:@"panelproductosmodalview"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 71;BA.debugLine="btnProductoVolver.Left = PanelProductosModalView.Left"[frmPrincipal/General script]
[views get:@"btnproductovolver"].Left = (int)(([views get:@"panelproductosmodalview"].Left));
//BA.debugLineNum = 72;BA.debugLine="btnProductoVolver.Width = PanelProductosModalView.Width"[frmPrincipal/General script]
[views get:@"btnproductovolver"].Width = (int)(([views get:@"panelproductosmodalview"].Width));
//BA.debugLineNum = 73;BA.debugLine="btnProductoVolver.Height = 7%y"[frmPrincipal/General script]
[views get:@"btnproductovolver"].Height = (int)((7 / 100.0 * height));
//BA.debugLineNum = 74;BA.debugLine="Panel2.Height = btnProductoVolver.Bottom +1%y"[frmPrincipal/General script]
[views get:@"panel2"].Height = (int)(([views get:@"btnproductovolver"].Top + [views get:@"btnproductovolver"].Height)+(1 / 100.0 * height));

}
@end