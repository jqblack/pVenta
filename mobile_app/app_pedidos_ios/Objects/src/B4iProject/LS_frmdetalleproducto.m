
#import "iCore.h"
@interface LS_frmdetalleproducto:NSObject
@end

@implementation LS_frmdetalleproducto

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondodetalles"].Top = (int)(0.0);
[views get:@"panelfondodetalles"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondodetalles"].Left = (int)(0.0);
[views get:@"panelfondodetalles"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadodetalles"].Left = (int)(0.0);
[views get:@"panelencabezadodetalles"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadodetalles"].Top = (int)(0.0);
[views get:@"panelencabezadodetalles"].Height = (int)((8 / 100.0 * height));
[views get:@"btnbackdetalles"].Left = (int)(0.0);
[views get:@"btnbackdetalles"].Top = (int)(0.0);
[views get:@"btnbackdetalles"].Height = (int)((9 / 100.0 * height) - (0.0));
[views get:@"btnbackdetalles"].Width = (int)((15 / 100.0 * width));
[views get:@"label1"].Left = (int)(([views get:@"btnbackdetalles"].Left + [views get:@"btnbackdetalles"].Width)+(8 / 100.0 * width));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"label1"].Width = (int)((70 / 100.0 * width));
[views get:@"panelimagendetalles"].Top = (int)(([views get:@"panelencabezadodetalles"].Top + [views get:@"panelencabezadodetalles"].Height));
[views get:@"panelimagendetalles"].Left = (int)(0.0);
[views get:@"panelimagendetalles"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelimagendetalles"].Height = (int)((50 / 100.0 * height));
[views get:@"imageviewdetalles"].Left = (int)(0.0);
[views get:@"imageviewdetalles"].Top = (int)(0.0);
[views get:@"imageviewdetalles"].Width = (int)(([views get:@"panelimagendetalles"].Width));
[views get:@"imageviewdetalles"].Height = (int)(([views get:@"panelimagendetalles"].Height));
[views get:@"panelprecioytitulo"].Left = (int)(0.0);
[views get:@"panelprecioytitulo"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelprecioytitulo"].Top = (int)(([views get:@"panelimagendetalles"].Top + [views get:@"panelimagendetalles"].Height));
[views get:@"panelprecioytitulo"].Height = (int)((13 / 100.0 * height));
[views get:@"lblprecioencabezado"].Left = (int)((2 / 100.0 * width));
[views get:@"lblprecioencabezado"].Top = (int)((1 / 100.0 * height));
[views get:@"lblprecioencabezado"].Height = (int)((5 / 100.0 * height));
[views get:@"lblprecioencabezado"].Width = (int)((40 / 100.0 * width));
[views get:@"lblnombeencabezado"].Left = (int)(([views get:@"lblprecioencabezado"].Left));
[views get:@"lblnombeencabezado"].Top = (int)(([views get:@"lblprecioencabezado"].Top + [views get:@"lblprecioencabezado"].Height));
[views get:@"lblnombeencabezado"].Width = (int)((70 / 100.0 * width));
[views get:@"lblnombeencabezado"].Height = (int)(([views get:@"lblprecioencabezado"].Height));
[views get:@"panelfavodetalle"].Top = (int)(([views get:@"lblprecioencabezado"].Top)+(5 / 100.0 * height));
[views get:@"panelfavodetalle"].Left = (int)(([views get:@"lblnombeencabezado"].Left + [views get:@"lblnombeencabezado"].Width)+(8 / 100.0 * width));
[views get:@"panelfavodetalle"].Width = (int)((8 / 100.0 * width));
//BA.debugLineNum = 45;BA.debugLine="PanelFavoDetalle.Height = lblNombeEncabezado.Bottom -6%y"[frmDetalleProducto/General script]
[views get:@"panelfavodetalle"].Height = (int)(([views get:@"lblnombeencabezado"].Top + [views get:@"lblnombeencabezado"].Height)-(6 / 100.0 * height));
//BA.debugLineNum = 47;BA.debugLine="imgdetallefav.Top = 0"[frmDetalleProducto/General script]
[views get:@"imgdetallefav"].Top = (int)(0.0);
//BA.debugLineNum = 48;BA.debugLine="imgdetallefav.Left = 0"[frmDetalleProducto/General script]
[views get:@"imgdetallefav"].Left = (int)(0.0);
//BA.debugLineNum = 49;BA.debugLine="imgdetallefav.Width = PanelFavoDetalle.Width"[frmDetalleProducto/General script]
[views get:@"imgdetallefav"].Width = (int)(([views get:@"panelfavodetalle"].Width));
//BA.debugLineNum = 50;BA.debugLine="imgdetallefav.Height = PanelFavoDetalle.Height"[frmDetalleProducto/General script]
[views get:@"imgdetallefav"].Height = (int)(([views get:@"panelfavodetalle"].Height));
//BA.debugLineNum = 52;BA.debugLine="Label2.Top = PanelPrecioyTitulo.Bottom +1%y"[frmDetalleProducto/General script]
[views get:@"label2"].Top = (int)(([views get:@"panelprecioytitulo"].Top + [views get:@"panelprecioytitulo"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 53;BA.debugLine="Label2.Left = 2%x"[frmDetalleProducto/General script]
[views get:@"label2"].Left = (int)((2 / 100.0 * width));
//BA.debugLineNum = 54;BA.debugLine="Label2.Height = 5%y"[frmDetalleProducto/General script]
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 55;BA.debugLine="Label2.Width = 46%x"[frmDetalleProducto/General script]
[views get:@"label2"].Width = (int)((46 / 100.0 * width));
//BA.debugLineNum = 57;BA.debugLine="Label3.Left = 58%x"[frmDetalleProducto/General script]
[views get:@"label3"].Left = (int)((58 / 100.0 * width));
//BA.debugLineNum = 58;BA.debugLine="Label3.Top = Label2.Top"[frmDetalleProducto/General script]
[views get:@"label3"].Top = (int)(([views get:@"label2"].Top));
//BA.debugLineNum = 59;BA.debugLine="Label3.Height = Label2.Height"[frmDetalleProducto/General script]
[views get:@"label3"].Height = (int)(([views get:@"label2"].Height));
//BA.debugLineNum = 60;BA.debugLine="Label3.Width = Label2.Width - 6%x"[frmDetalleProducto/General script]
[views get:@"label3"].Width = (int)(([views get:@"label2"].Width)-(6 / 100.0 * width));
//BA.debugLineNum = 62;BA.debugLine="PanellblCantidad.Top = Label2.Bottom + 1%y"[frmDetalleProducto/General script]
[views get:@"panellblcantidad"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 63;BA.debugLine="PanellblCantidad.Left = 3%x"[frmDetalleProducto/General script]
[views get:@"panellblcantidad"].Left = (int)((3 / 100.0 * width));
//BA.debugLineNum = 64;BA.debugLine="PanellblCantidad.Width = 15%x"[frmDetalleProducto/General script]
[views get:@"panellblcantidad"].Width = (int)((15 / 100.0 * width));
//BA.debugLineNum = 65;BA.debugLine="PanellblCantidad.Height = 6%y"[frmDetalleProducto/General script]
[views get:@"panellblcantidad"].Height = (int)((6 / 100.0 * height));
//BA.debugLineNum = 67;BA.debugLine="lblcantidad.Left = 3%x"[frmDetalleProducto/General script]
[views get:@"lblcantidad"].Left = (int)((3 / 100.0 * width));
//BA.debugLineNum = 68;BA.debugLine="lblcantidad.Top = 0"[frmDetalleProducto/General script]
[views get:@"lblcantidad"].Top = (int)(0.0);
//BA.debugLineNum = 69;BA.debugLine="lblcantidad.Width = PanellblCantidad.Width - 6%x"[frmDetalleProducto/General script]
[views get:@"lblcantidad"].Width = (int)(([views get:@"panellblcantidad"].Width)-(6 / 100.0 * width));
//BA.debugLineNum = 70;BA.debugLine="lblcantidad.Height = PanellblCantidad.Height"[frmDetalleProducto/General script]
[views get:@"lblcantidad"].Height = (int)(([views get:@"panellblcantidad"].Height));
//BA.debugLineNum = 72;BA.debugLine="StepperCantidad.Top = PanellblCantidad.Top"[frmDetalleProducto/General script]
[views get:@"steppercantidad"].Top = (int)(([views get:@"panellblcantidad"].Top));
//BA.debugLineNum = 73;BA.debugLine="StepperCantidad.Left = PanellblCantidad.Right + 3%x"[frmDetalleProducto/General script]
[views get:@"steppercantidad"].Left = (int)(([views get:@"panellblcantidad"].Left + [views get:@"panellblcantidad"].Width)+(3 / 100.0 * width));
//BA.debugLineNum = 74;BA.debugLine="StepperCantidad.Width = 20%x"[frmDetalleProducto/General script]
[views get:@"steppercantidad"].Width = (int)((20 / 100.0 * width));
//BA.debugLineNum = 75;BA.debugLine="StepperCantidad.Height = PanellblCantidad.Height"[frmDetalleProducto/General script]
[views get:@"steppercantidad"].Height = (int)(([views get:@"panellblcantidad"].Height));
//BA.debugLineNum = 77;BA.debugLine="lblPrecio.Top = Label3.Bottom + 1%y"[frmDetalleProducto/General script]
[views get:@"lblprecio"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 78;BA.debugLine="lblPrecio.Left = Label3.Left + 7%x"[frmDetalleProducto/General script]
[views get:@"lblprecio"].Left = (int)(([views get:@"label3"].Left)+(7 / 100.0 * width));
//BA.debugLineNum = 79;BA.debugLine="lblPrecio.Width = Label3.Width - 7%x"[frmDetalleProducto/General script]
[views get:@"lblprecio"].Width = (int)(([views get:@"label3"].Width)-(7 / 100.0 * width));
//BA.debugLineNum = 80;BA.debugLine="lblPrecio.Height = Label3.Height +1%y"[frmDetalleProducto/General script]
[views get:@"lblprecio"].Height = (int)(([views get:@"label3"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 82;BA.debugLine="btnagregarCarritoDetalle.SetLeftAndRight(5%x,95%x)"[frmDetalleProducto/General script]
[views get:@"btnagregarcarritodetalle"].Left = (int)((5 / 100.0 * width));
[views get:@"btnagregarcarritodetalle"].Width = (int)((95 / 100.0 * width) - ((5 / 100.0 * width)));
//BA.debugLineNum = 83;BA.debugLine="btnagregarCarritoDetalle.Top = lblPrecio.Bottom + 4%y"[frmDetalleProducto/General script]
[views get:@"btnagregarcarritodetalle"].Top = (int)(([views get:@"lblprecio"].Top + [views get:@"lblprecio"].Height)+(4 / 100.0 * height));
//BA.debugLineNum = 84;BA.debugLine="btnagregarCarritoDetalle.Height = 8%y"[frmDetalleProducto/General script]
[views get:@"btnagregarcarritodetalle"].Height = (int)((8 / 100.0 * height));

}
@end