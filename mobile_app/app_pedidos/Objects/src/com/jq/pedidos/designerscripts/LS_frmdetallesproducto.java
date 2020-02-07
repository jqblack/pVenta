package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmdetallesproducto{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondodetalles").vw.setTop((int)(0d));
views.get("panelfondodetalles").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondodetalles").vw.setLeft((int)(0d));
views.get("panelfondodetalles").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadodetalles").vw.setLeft((int)(0d));
views.get("panelencabezadodetalles").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadodetalles").vw.setTop((int)(0d));
views.get("panelencabezadodetalles").vw.setHeight((int)((8d / 100 * height)));
views.get("btnbackdetalles").vw.setLeft((int)(0d));
views.get("btnbackdetalles").vw.setTop((int)(0d));
views.get("btnbackdetalles").vw.setHeight((int)((9d / 100 * height) - (0d)));
views.get("btnbackdetalles").vw.setWidth((int)((15d / 100 * width)));
views.get("label1").vw.setLeft((int)((views.get("btnbackdetalles").vw.getLeft() + views.get("btnbackdetalles").vw.getWidth())+(4d / 100 * width)));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("label1").vw.setWidth((int)((70d / 100 * width)));
views.get("panelimagendetalles").vw.setTop((int)((views.get("panelencabezadodetalles").vw.getTop() + views.get("panelencabezadodetalles").vw.getHeight())));
views.get("panelimagendetalles").vw.setLeft((int)(0d));
views.get("panelimagendetalles").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelimagendetalles").vw.setHeight((int)((50d / 100 * height)));
views.get("imageviewdetalles").vw.setLeft((int)(0d));
views.get("imageviewdetalles").vw.setTop((int)(0d));
views.get("imageviewdetalles").vw.setWidth((int)((views.get("panelimagendetalles").vw.getWidth())));
views.get("imageviewdetalles").vw.setHeight((int)((views.get("panelimagendetalles").vw.getHeight())));
views.get("panelprecioytitulo").vw.setLeft((int)(0d));
views.get("panelprecioytitulo").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelprecioytitulo").vw.setTop((int)((views.get("panelimagendetalles").vw.getTop() + views.get("panelimagendetalles").vw.getHeight())));
views.get("panelprecioytitulo").vw.setHeight((int)((13d / 100 * height)));
views.get("lblprecioencabezado").vw.setLeft((int)((2d / 100 * width)));
views.get("lblprecioencabezado").vw.setTop((int)((1d / 100 * height)));
views.get("lblprecioencabezado").vw.setHeight((int)((5d / 100 * height)));
views.get("lblprecioencabezado").vw.setWidth((int)((40d / 100 * width)));
views.get("lblnombeencabezado").vw.setLeft((int)((views.get("lblprecioencabezado").vw.getLeft())));
views.get("lblnombeencabezado").vw.setTop((int)((views.get("lblprecioencabezado").vw.getTop() + views.get("lblprecioencabezado").vw.getHeight())));
views.get("lblnombeencabezado").vw.setWidth((int)((70d / 100 * width)));
views.get("lblnombeencabezado").vw.setHeight((int)((views.get("lblprecioencabezado").vw.getHeight())));
views.get("panelfavodetalle").vw.setTop((int)((views.get("lblprecioencabezado").vw.getTop())+(3d / 100 * height)));
views.get("panelfavodetalle").vw.setLeft((int)((views.get("lblnombeencabezado").vw.getLeft() + views.get("lblnombeencabezado").vw.getWidth())+(8d / 100 * width)));
views.get("panelfavodetalle").vw.setWidth((int)((10d / 100 * width)));
views.get("panelfavodetalle").vw.setHeight((int)((views.get("lblnombeencabezado").vw.getTop() + views.get("lblnombeencabezado").vw.getHeight())-(5d / 100 * height)));
views.get("imgdetallefav").vw.setTop((int)(0d));
views.get("imgdetallefav").vw.setLeft((int)(0d));
views.get("imgdetallefav").vw.setWidth((int)((views.get("panelfavodetalle").vw.getWidth())));
views.get("imgdetallefav").vw.setHeight((int)((views.get("panelfavodetalle").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("panelprecioytitulo").vw.getTop() + views.get("panelprecioytitulo").vw.getHeight())+(1d / 100 * height)));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setWidth((int)((46d / 100 * width)));
views.get("label3").vw.setLeft((int)((52d / 100 * width)));
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("label3").vw.setHeight((int)((views.get("label2").vw.getHeight())));
//BA.debugLineNum = 60;BA.debugLine="Label3.Width = Label2.Width"[frmDetallesProducto/General script]
views.get("label3").vw.setWidth((int)((views.get("label2").vw.getWidth())));
//BA.debugLineNum = 62;BA.debugLine="PanellblCantidad.Top = Label2.Bottom + 1%y"[frmDetallesProducto/General script]
views.get("panellblcantidad").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 63;BA.debugLine="PanellblCantidad.Left = 15%x"[frmDetallesProducto/General script]
views.get("panellblcantidad").vw.setLeft((int)((15d / 100 * width)));
//BA.debugLineNum = 64;BA.debugLine="PanellblCantidad.Width = 15%x"[frmDetallesProducto/General script]
views.get("panellblcantidad").vw.setWidth((int)((15d / 100 * width)));
//BA.debugLineNum = 65;BA.debugLine="PanellblCantidad.Height = 6%y"[frmDetallesProducto/General script]
views.get("panellblcantidad").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 67;BA.debugLine="lblcantidad.Left = 0"[frmDetallesProducto/General script]
views.get("lblcantidad").vw.setLeft((int)(0d));
//BA.debugLineNum = 68;BA.debugLine="lblcantidad.Top = 0"[frmDetallesProducto/General script]
views.get("lblcantidad").vw.setTop((int)(0d));
//BA.debugLineNum = 69;BA.debugLine="lblcantidad.Width = PanellblCantidad.Width"[frmDetallesProducto/General script]
views.get("lblcantidad").vw.setWidth((int)((views.get("panellblcantidad").vw.getWidth())));
//BA.debugLineNum = 70;BA.debugLine="lblcantidad.Height = PanellblCantidad.Height"[frmDetallesProducto/General script]
views.get("lblcantidad").vw.setHeight((int)((views.get("panellblcantidad").vw.getHeight())));
//BA.debugLineNum = 72;BA.debugLine="btnless.Left = 2%x"[frmDetallesProducto/General script]
views.get("btnless").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 73;BA.debugLine="btnless.Top = Label2.Bottom + 1%y"[frmDetallesProducto/General script]
views.get("btnless").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 74;BA.debugLine="btnless.Width = 13%x"[frmDetallesProducto/General script]
views.get("btnless").vw.setWidth((int)((13d / 100 * width)));
//BA.debugLineNum = 75;BA.debugLine="btnless.Height = 6%y"[frmDetallesProducto/General script]
views.get("btnless").vw.setHeight((int)((6d / 100 * height)));
//BA.debugLineNum = 77;BA.debugLine="btnMore.Left = 30%x"[frmDetallesProducto/General script]
views.get("btnmore").vw.setLeft((int)((30d / 100 * width)));
//BA.debugLineNum = 78;BA.debugLine="btnMore.Top = btnless.Top"[frmDetallesProducto/General script]
views.get("btnmore").vw.setTop((int)((views.get("btnless").vw.getTop())));
//BA.debugLineNum = 79;BA.debugLine="btnMore.Width = btnless.Width"[frmDetallesProducto/General script]
views.get("btnmore").vw.setWidth((int)((views.get("btnless").vw.getWidth())));
//BA.debugLineNum = 80;BA.debugLine="btnMore.Height = btnless.Height"[frmDetallesProducto/General script]
views.get("btnmore").vw.setHeight((int)((views.get("btnless").vw.getHeight())));
//BA.debugLineNum = 82;BA.debugLine="lblPrecio.Top = Label3.Bottom + 1%y"[frmDetallesProducto/General script]
views.get("lblprecio").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 83;BA.debugLine="lblPrecio.Left = Label3.Left"[frmDetallesProducto/General script]
views.get("lblprecio").vw.setLeft((int)((views.get("label3").vw.getLeft())));
//BA.debugLineNum = 84;BA.debugLine="lblPrecio.Width = Label3.Width"[frmDetallesProducto/General script]
views.get("lblprecio").vw.setWidth((int)((views.get("label3").vw.getWidth())));
//BA.debugLineNum = 85;BA.debugLine="lblPrecio.Height = Label3.Height +1%y"[frmDetallesProducto/General script]
views.get("lblprecio").vw.setHeight((int)((views.get("label3").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 87;BA.debugLine="btnagregarCarritoDetalle.SetLeftAndRight(5%x,95%x)"[frmDetallesProducto/General script]
views.get("btnagregarcarritodetalle").vw.setLeft((int)((5d / 100 * width)));
views.get("btnagregarcarritodetalle").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 88;BA.debugLine="btnagregarCarritoDetalle.Top = lblPrecio.Bottom + 4%y"[frmDetallesProducto/General script]
views.get("btnagregarcarritodetalle").vw.setTop((int)((views.get("lblprecio").vw.getTop() + views.get("lblprecio").vw.getHeight())+(4d / 100 * height)));
//BA.debugLineNum = 89;BA.debugLine="btnagregarCarritoDetalle.Height = 8%y"[frmDetallesProducto/General script]
views.get("btnagregarcarritodetalle").vw.setHeight((int)((8d / 100 * height)));

}
}