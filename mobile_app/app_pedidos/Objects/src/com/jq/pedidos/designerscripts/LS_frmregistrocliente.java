package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmregistrocliente{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelregistrocliente").vw.setLeft((int)(0d));
views.get("panelregistrocliente").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelregistrocliente").vw.setTop((int)(0d));
views.get("panelregistrocliente").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnregistroclienteback").vw.setLeft((int)(0d));
views.get("btnregistroclienteback").vw.setTop((int)(0d));
views.get("btnregistroclienteback").vw.setWidth((int)((15d / 100 * width)));
views.get("btnregistroclienteback").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label1").vw.setLeft((int)((views.get("btnregistroclienteback").vw.getLeft() + views.get("btnregistroclienteback").vw.getWidth())));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setWidth((int)((views.get("panel1").vw.getWidth())-(views.get("label1").vw.getLeft())));
views.get("label1").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(1d / 100 * height)));
views.get("label2").vw.setLeft((int)((3d / 100 * width)));
views.get("label2").vw.setWidth((int)((50d / 100 * width)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("panel2").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("panel2").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("panel2").vw.setHeight((int)((7d / 100 * height)));
views.get("panel2").vw.setWidth((int)((100d / 100 * width)-(views.get("panel2").vw.getLeft())*2d));
views.get("txtnombre").vw.setLeft((int)(0d));
views.get("txtnombre").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("txtnombre").vw.setHeight((int)((views.get("panel2").vw.getHeight())+(1.5d / 100 * height)));
views.get("txtnombre").vw.setTop((int)(0d));
views.get("label3").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label3").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("label3").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(1d / 100 * height)));
views.get("label3").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("panel3").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("panel3").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("panel3").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("panel3").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("txttelefono").vw.setLeft((int)((views.get("txtnombre").vw.getLeft())));
views.get("txttelefono").vw.setWidth((int)((views.get("txtnombre").vw.getWidth())));
views.get("txttelefono").vw.setHeight((int)((views.get("txtnombre").vw.getHeight())));
views.get("txttelefono").vw.setTop((int)((views.get("txtnombre").vw.getTop())));
views.get("label4").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label4").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("label4").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())+(1d / 100 * height)));
views.get("label4").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("panel4").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("panel4").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("panel4").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
views.get("panel4").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("txtdireccion").vw.setLeft((int)((views.get("txtnombre").vw.getLeft())));
views.get("txtdireccion").vw.setWidth((int)((views.get("txtnombre").vw.getWidth())));
views.get("txtdireccion").vw.setHeight((int)((views.get("txtnombre").vw.getHeight())));
views.get("txtdireccion").vw.setTop((int)((views.get("txtnombre").vw.getTop())));
views.get("label5").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label5").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("label5").vw.setTop((int)((views.get("panel4").vw.getTop() + views.get("panel4").vw.getHeight())+(1d / 100 * height)));
views.get("label5").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("panel5").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("panel5").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("panel5").vw.setTop((int)((views.get("label5").vw.getTop() + views.get("label5").vw.getHeight())));
views.get("panel5").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("txtusuarioregistro").vw.setLeft((int)((views.get("txtnombre").vw.getLeft())));
views.get("txtusuarioregistro").vw.setWidth((int)((views.get("txtnombre").vw.getWidth())));
views.get("txtusuarioregistro").vw.setHeight((int)((views.get("txtnombre").vw.getHeight())));
views.get("txtusuarioregistro").vw.setTop((int)((views.get("txtnombre").vw.getTop())));
views.get("label5").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label5").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("label5").vw.setTop((int)((views.get("panel4").vw.getTop() + views.get("panel4").vw.getHeight())+(1d / 100 * height)));
views.get("label5").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("panel5").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("panel5").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("panel5").vw.setTop((int)((views.get("label5").vw.getTop() + views.get("label5").vw.getHeight())));
views.get("panel5").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("txtusuarioregistro").vw.setLeft((int)((views.get("txtnombre").vw.getLeft())));
views.get("txtusuarioregistro").vw.setWidth((int)((views.get("txtnombre").vw.getWidth())));
views.get("txtusuarioregistro").vw.setHeight((int)((views.get("txtnombre").vw.getHeight())));
views.get("txtusuarioregistro").vw.setTop((int)((views.get("txtnombre").vw.getTop())));
views.get("label6").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label6").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("label6").vw.setTop((int)((views.get("panel5").vw.getTop() + views.get("panel5").vw.getHeight())+(1d / 100 * height)));
views.get("label6").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("panel6").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("panel6").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("panel6").vw.setTop((int)((views.get("label6").vw.getTop() + views.get("label6").vw.getHeight())));
views.get("panel6").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("txtcontrasenaregistro").vw.setLeft((int)((views.get("txtnombre").vw.getLeft())));
//BA.debugLineNum = 116;BA.debugLine="txtContrasenaRegistro.Width = txtNombre.Width"[frmRegistroCliente/General script]
views.get("txtcontrasenaregistro").vw.setWidth((int)((views.get("txtnombre").vw.getWidth())));
//BA.debugLineNum = 117;BA.debugLine="txtContrasenaRegistro.Height = txtNombre.Height"[frmRegistroCliente/General script]
views.get("txtcontrasenaregistro").vw.setHeight((int)((views.get("txtnombre").vw.getHeight())));
//BA.debugLineNum = 118;BA.debugLine="txtContrasenaRegistro.Top = txtNombre.Top"[frmRegistroCliente/General script]
views.get("txtcontrasenaregistro").vw.setTop((int)((views.get("txtnombre").vw.getTop())));
//BA.debugLineNum = 122;BA.debugLine="Label7.Left = Label2.Left"[frmRegistroCliente/General script]
views.get("label7").vw.setLeft((int)((views.get("label2").vw.getLeft())));
//BA.debugLineNum = 123;BA.debugLine="Label7.Height = Label2.Height"[frmRegistroCliente/General script]
views.get("label7").vw.setHeight((int)((views.get("label2").vw.getHeight())));
//BA.debugLineNum = 124;BA.debugLine="Label7.Top = Panel6.Bottom + 1%y"[frmRegistroCliente/General script]
views.get("label7").vw.setTop((int)((views.get("panel6").vw.getTop() + views.get("panel6").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 125;BA.debugLine="Label7.Width = Label2.Width"[frmRegistroCliente/General script]
views.get("label7").vw.setWidth((int)((views.get("label2").vw.getWidth())));
//BA.debugLineNum = 127;BA.debugLine="Panel7.Left = Panel2.Left"[frmRegistroCliente/General script]
views.get("panel7").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
//BA.debugLineNum = 128;BA.debugLine="Panel7.Width = Panel2.Width"[frmRegistroCliente/General script]
views.get("panel7").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
//BA.debugLineNum = 129;BA.debugLine="Panel7.Top = Label7.Bottom"[frmRegistroCliente/General script]
views.get("panel7").vw.setTop((int)((views.get("label7").vw.getTop() + views.get("label7").vw.getHeight())));
//BA.debugLineNum = 130;BA.debugLine="Panel7.Height = Panel2.Height"[frmRegistroCliente/General script]
views.get("panel7").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
//BA.debugLineNum = 132;BA.debugLine="txtContrasena2.Left = txtNombre.Left"[frmRegistroCliente/General script]
views.get("txtcontrasena2").vw.setLeft((int)((views.get("txtnombre").vw.getLeft())));
//BA.debugLineNum = 133;BA.debugLine="txtContrasena2.Width = txtNombre.Width"[frmRegistroCliente/General script]
views.get("txtcontrasena2").vw.setWidth((int)((views.get("txtnombre").vw.getWidth())));
//BA.debugLineNum = 134;BA.debugLine="txtContrasena2.Height = txtNombre.Height"[frmRegistroCliente/General script]
views.get("txtcontrasena2").vw.setHeight((int)((views.get("txtnombre").vw.getHeight())));
//BA.debugLineNum = 135;BA.debugLine="txtContrasena2.Top = txtNombre.Top"[frmRegistroCliente/General script]
views.get("txtcontrasena2").vw.setTop((int)((views.get("txtnombre").vw.getTop())));
//BA.debugLineNum = 139;BA.debugLine="btnRegistroClienteRegistrarme.Height = 7%y"[frmRegistroCliente/General script]
views.get("btnregistroclienteregistrarme").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 140;BA.debugLine="btnRegistroClienteRegistrarme.Width = Panel2.Width"[frmRegistroCliente/General script]
views.get("btnregistroclienteregistrarme").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
//BA.debugLineNum = 141;BA.debugLine="btnRegistroClienteRegistrarme.Top = Panel7.Bottom + 3%y"[frmRegistroCliente/General script]
views.get("btnregistroclienteregistrarme").vw.setTop((int)((views.get("panel7").vw.getTop() + views.get("panel7").vw.getHeight())+(3d / 100 * height)));
//BA.debugLineNum = 142;BA.debugLine="btnRegistroClienteRegistrarme.Left = Panel2.Left"[frmRegistroCliente/General script]
views.get("btnregistroclienteregistrarme").vw.setLeft((int)((views.get("panel2").vw.getLeft())));

}
}