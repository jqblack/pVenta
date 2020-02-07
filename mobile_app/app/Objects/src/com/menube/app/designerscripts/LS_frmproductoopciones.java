package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmproductoopciones{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelopcionesback").vw.setLeft((int)(0d));
views.get("panelopcionesback").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelopcionesback").vw.setTop((int)(0d));
views.get("panelopcionesback").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelopciones").vw.setLeft((int)((5d / 100 * width)));
views.get("panelopciones").vw.setWidth((int)((views.get("panelopcionesback").vw.getWidth())-(views.get("panelopciones").vw.getLeft())*2d));
views.get("panelopciones").vw.setHeight((int)((95d / 100 * height)));
views.get("panelopciones").vw.setTop((int)((50d / 100 * height) - (views.get("panelopciones").vw.getHeight() / 2)));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setWidth((int)((views.get("panelopciones").vw.getWidth())));
views.get("panel1").vw.setHeight((int)((8d / 100 * height)));
views.get("btnopcionesback").vw.setLeft((int)(0d));
views.get("btnopcionesback").vw.setTop((int)(0d));
views.get("btnopcionesback").vw.setWidth((int)((15d / 100 * width)));
views.get("btnopcionesback").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label1").vw.setLeft((int)((views.get("btnopcionesback").vw.getLeft() + views.get("btnopcionesback").vw.getWidth())));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setWidth((int)((views.get("panel1").vw.getWidth())-(views.get("label1").vw.getLeft())*2d));
views.get("label1").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("btnopcioneseliminar").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("btnopcioneseliminar").vw.setWidth((int)((views.get("btnopcionesback").vw.getWidth())));
views.get("btnopcioneseliminar").vw.setHeight((int)((views.get("btnopcionesback").vw.getHeight())));
views.get("btnopcioneseliminar").vw.setTop((int)((views.get("btnopcionesback").vw.getTop())));
views.get("label2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(1d / 100 * height)));
views.get("label2").vw.setLeft((int)((3d / 100 * width)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setWidth((int)((views.get("panelopciones").vw.getWidth())-(views.get("label2").vw.getLeft())));
views.get("lblopcionesproductonombre").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("lblopcionesproductonombre").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("lblopcionesproductonombre").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("lblopcionesproductonombre").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("label4").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label4").vw.setHeight((int)((6d / 100 * height)));
views.get("label4").vw.setTop((int)((views.get("lblopcionesproductonombre").vw.getTop() + views.get("lblopcionesproductonombre").vw.getHeight())+(2d / 100 * height)));
views.get("label4").vw.setWidth((int)((25d / 100 * width)));
views.get("panel2").vw.setLeft((int)((views.get("label4").vw.getLeft() + views.get("label4").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((views.get("label4").vw.getHeight())));
views.get("panel2").vw.setWidth((int)((25d / 100 * width)));
views.get("panel2").vw.setTop((int)((views.get("label4").vw.getTop())));
views.get("txtcantidad").vw.setLeft((int)(0d));
views.get("txtcantidad").vw.setHeight((int)((views.get("panel2").vw.getHeight())+(1.5d / 100 * height)));
views.get("txtcantidad").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("txtcantidad").vw.setTop((int)(0d));
views.get("btncantidadaumentar").vw.setLeft((int)((views.get("panel2").vw.getLeft() + views.get("panel2").vw.getWidth())+(2d / 100 * width)));
views.get("btncantidadaumentar").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("btncantidadaumentar").vw.setTop((int)((views.get("panel2").vw.getTop())));
views.get("btncantidadaumentar").vw.setWidth((int)((15d / 100 * width)));
views.get("btncantidaddesaumentar").vw.setLeft((int)((views.get("btncantidadaumentar").vw.getLeft() + views.get("btncantidadaumentar").vw.getWidth())+(2d / 100 * width)));
views.get("btncantidaddesaumentar").vw.setTop((int)((views.get("btncantidadaumentar").vw.getTop())));
views.get("btncantidaddesaumentar").vw.setWidth((int)((views.get("btncantidadaumentar").vw.getWidth())));
views.get("btncantidaddesaumentar").vw.setHeight((int)((views.get("btncantidadaumentar").vw.getHeight())));
views.get("label5").vw.setLeft((int)((views.get("label4").vw.getLeft())));
views.get("label5").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())+(2d / 100 * height)));
views.get("label5").vw.setWidth((int)((views.get("panelopciones").vw.getWidth())-(views.get("label5").vw.getLeft())));
views.get("label5").vw.setHeight((int)((4d / 100 * height)));
views.get("panel3").vw.setLeft((int)((views.get("label5").vw.getLeft())));
//BA.debugLineNum = 73;BA.debugLine="Panel3.Top = Label5.Bottom"[frmProductoOpciones/General script]
views.get("panel3").vw.setTop((int)((views.get("label5").vw.getTop() + views.get("label5").vw.getHeight())));
//BA.debugLineNum = 74;BA.debugLine="Panel3.Width = PanelOpciones.Width - Panel3.Left * 2"[frmProductoOpciones/General script]
views.get("panel3").vw.setWidth((int)((views.get("panelopciones").vw.getWidth())-(views.get("panel3").vw.getLeft())*2d));
//BA.debugLineNum = 75;BA.debugLine="Panel3.Height = 25%y"[frmProductoOpciones/General script]
views.get("panel3").vw.setHeight((int)((25d / 100 * height)));
//BA.debugLineNum = 77;BA.debugLine="ScrollViewOpciones.Left = 0"[frmProductoOpciones/General script]
views.get("scrollviewopciones").vw.setLeft((int)(0d));
//BA.debugLineNum = 78;BA.debugLine="ScrollViewOpciones.Top = 0"[frmProductoOpciones/General script]
views.get("scrollviewopciones").vw.setTop((int)(0d));
//BA.debugLineNum = 79;BA.debugLine="ScrollViewOpciones.Width = Panel3.Width"[frmProductoOpciones/General script]
views.get("scrollviewopciones").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
//BA.debugLineNum = 80;BA.debugLine="ScrollViewOpciones.Height = Panel3.Height"[frmProductoOpciones/General script]
views.get("scrollviewopciones").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
//BA.debugLineNum = 82;BA.debugLine="Label6.Left = Panel3.Left"[frmProductoOpciones/General script]
views.get("label6").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
//BA.debugLineNum = 83;BA.debugLine="Label6.Top = Panel3.Bottom"[frmProductoOpciones/General script]
views.get("label6").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())));
//BA.debugLineNum = 84;BA.debugLine="Label6.Width = Panel3.Width"[frmProductoOpciones/General script]
views.get("label6").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
//BA.debugLineNum = 85;BA.debugLine="Label6.Height = 5%y"[frmProductoOpciones/General script]
views.get("label6").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 87;BA.debugLine="Panel4.Left = Label6.Left"[frmProductoOpciones/General script]
views.get("panel4").vw.setLeft((int)((views.get("label6").vw.getLeft())));
//BA.debugLineNum = 88;BA.debugLine="Panel4.Top = Label6.Bottom"[frmProductoOpciones/General script]
views.get("panel4").vw.setTop((int)((views.get("label6").vw.getTop() + views.get("label6").vw.getHeight())));
//BA.debugLineNum = 89;BA.debugLine="Panel4.Width = Label6.Width"[frmProductoOpciones/General script]
views.get("panel4").vw.setWidth((int)((views.get("label6").vw.getWidth())));
//BA.debugLineNum = 90;BA.debugLine="Panel4.Height = 20%y"[frmProductoOpciones/General script]
views.get("panel4").vw.setHeight((int)((20d / 100 * height)));
//BA.debugLineNum = 92;BA.debugLine="txtProductoComentario.Left = 0"[frmProductoOpciones/General script]
views.get("txtproductocomentario").vw.setLeft((int)(0d));
//BA.debugLineNum = 93;BA.debugLine="txtProductoComentario.Top = 0"[frmProductoOpciones/General script]
views.get("txtproductocomentario").vw.setTop((int)(0d));
//BA.debugLineNum = 94;BA.debugLine="txtProductoComentario.Height = Panel4.Height"[frmProductoOpciones/General script]
views.get("txtproductocomentario").vw.setHeight((int)((views.get("panel4").vw.getHeight())));
//BA.debugLineNum = 95;BA.debugLine="txtProductoComentario.Width = Panel4.Width"[frmProductoOpciones/General script]
views.get("txtproductocomentario").vw.setWidth((int)((views.get("panel4").vw.getWidth())));
//BA.debugLineNum = 97;BA.debugLine="btnOpcionesProductoSalvar.Left = Panel3.Left"[frmProductoOpciones/General script]
views.get("btnopcionesproductosalvar").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
//BA.debugLineNum = 98;BA.debugLine="btnOpcionesProductoSalvar.Height = 7%y"[frmProductoOpciones/General script]
views.get("btnopcionesproductosalvar").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 99;BA.debugLine="btnOpcionesProductoSalvar.Width = Panel3.Width"[frmProductoOpciones/General script]
views.get("btnopcionesproductosalvar").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
//BA.debugLineNum = 100;BA.debugLine="btnOpcionesProductoSalvar.Top = Panel4.Bottom + 3%y"[frmProductoOpciones/General script]
views.get("btnopcionesproductosalvar").vw.setTop((int)((views.get("panel4").vw.getTop() + views.get("panel4").vw.getHeight())+(3d / 100 * height)));

}
}