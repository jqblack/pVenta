package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmdireccionesusa{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondodireccionesusa").vw.setTop((int)(0d));
views.get("panelfondodireccionesusa").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondodireccionesusa").vw.setLeft((int)((0d / 100 * width)));
views.get("panelfondodireccionesusa").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelencabezadousa").vw.setLeft((int)(0d));
views.get("panelencabezadousa").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadousa").vw.setTop((int)(0d));
views.get("panelencabezadousa").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackusa").vw.setLeft((int)(0d));
views.get("btnbackusa").vw.setTop((int)(0d));
views.get("btnbackusa").vw.setWidth((int)((15d / 100 * width)));
views.get("btnbackusa").vw.setHeight((int)((8d / 100 * height)));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setLeft((int)((views.get("btnbackusa").vw.getLeft() + views.get("btnbackusa").vw.getWidth())+(5d / 100 * width)));
views.get("label1").vw.setHeight((int)((views.get("btnbackusa").vw.getHeight())));
views.get("label1").vw.setWidth((int)((63d / 100 * width)));
views.get("btndeleteusa").vw.setTop((int)(0d));
views.get("btndeleteusa").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btndeleteusa").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("btndeleteusa").vw.setWidth((int)((15d / 100 * width)));
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
views.get("label3").vw.setTop((int)((views.get("panelencabezadousa").vw.getTop() + views.get("panelencabezadousa").vw.getHeight())+(2d / 100 * height)));
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
views.get("label3").vw.setWidth((int)((50d / 100 * width)));
views.get("panel1").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("panel1").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("panel1").vw.setWidth((int)((96d / 100 * width)));
views.get("panel1").vw.setHeight((int)((10d / 100 * height)));
views.get("txtaddress1").vw.setTop((int)(0d));
views.get("txtaddress1").vw.setLeft((int)(0d));
views.get("txtaddress1").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("txtaddress1").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label5").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(1d / 100 * height)));
views.get("label5").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("label5").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("label5").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("panel2").vw.setTop((int)((views.get("label5").vw.getTop() + views.get("label5").vw.getHeight())));
views.get("panel2").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("panel2").vw.setWidth((int)((96d / 100 * width)));
views.get("panel2").vw.setHeight((int)((10d / 100 * height)));
views.get("txtaddress2").vw.setLeft((int)(0d));
views.get("txtaddress2").vw.setTop((int)(0d));
views.get("txtaddress2").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("txtaddress2").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("label6").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(1d / 100 * height)));
views.get("label6").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("label6").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("label6").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("panel3").vw.setTop((int)((views.get("label6").vw.getTop() + views.get("label6").vw.getHeight())));
views.get("panel3").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("panel3").vw.setWidth((int)((96d / 100 * width)));
views.get("panel3").vw.setHeight((int)((6d / 100 * height)));
views.get("txtcity").vw.setLeft((int)(0d));
views.get("txtcity").vw.setTop((int)(0d));
views.get("txtcity").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
views.get("txtcity").vw.setHeight((int)((views.get("panel3").vw.getHeight())+(2d / 100 * height)));
views.get("label7").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())+(1d / 100 * height)));
views.get("label7").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("label7").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("label7").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("panelcombousa").vw.setTop((int)((views.get("label7").vw.getTop() + views.get("label7").vw.getHeight())));
views.get("panelcombousa").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("panelcombousa").vw.setWidth((int)((96d / 100 * width)));
views.get("panelcombousa").vw.setHeight((int)((8d / 100 * height)));
views.get("btnstate").vw.setTop((int)(0d));
views.get("btnstate").vw.setLeft((int)(0d));
views.get("btnstate").vw.setWidth((int)((96d / 100 * width)));
views.get("btnstate").vw.setHeight((int)((8d / 100 * height)));
views.get("panelzipcode").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("panelzipcode").vw.setTop((int)((views.get("panelcombousa").vw.getTop() + views.get("panelcombousa").vw.getHeight())+(1d / 100 * height)));
views.get("panelzipcode").vw.setWidth((int)((90d / 100 * width)));
views.get("panelzipcode").vw.setHeight((int)((11d / 100 * height)));
views.get("label8").vw.setTop((int)(0d));
views.get("label8").vw.setLeft((int)(0d));
views.get("label8").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("label8").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("txtzipcode").vw.setTop((int)((views.get("label8").vw.getTop() + views.get("label8").vw.getHeight())));
//BA.debugLineNum = 96;BA.debugLine="txtZipCode.Left = 0"[frmDireccionesUsa/General script]
views.get("txtzipcode").vw.setLeft((int)(0d));
//BA.debugLineNum = 97;BA.debugLine="txtZipCode.Width = 90%x"[frmDireccionesUsa/General script]
views.get("txtzipcode").vw.setWidth((int)((90d / 100 * width)));
//BA.debugLineNum = 98;BA.debugLine="txtZipCode.Height = 8%y"[frmDireccionesUsa/General script]
views.get("txtzipcode").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 100;BA.debugLine="chPrincipal.Top = panelZipCode.Bottom + 2%y"[frmDireccionesUsa/General script]
views.get("chprincipal").vw.setTop((int)((views.get("panelzipcode").vw.getTop() + views.get("panelzipcode").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 101;BA.debugLine="chPrincipal.Left = 3%x"[frmDireccionesUsa/General script]
views.get("chprincipal").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 102;BA.debugLine="chPrincipal.Height = 5%y"[frmDireccionesUsa/General script]
views.get("chprincipal").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 103;BA.debugLine="chPrincipal.Width = 78%x"[frmDireccionesUsa/General script]
views.get("chprincipal").vw.setWidth((int)((78d / 100 * width)));
//BA.debugLineNum = 106;BA.debugLine="BtnAgregarDireccionFinal.Top = chPrincipal.Bottom + 2%y"[frmDireccionesUsa/General script]
views.get("btnagregardireccionfinal").vw.setTop((int)((views.get("chprincipal").vw.getTop() + views.get("chprincipal").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 107;BA.debugLine="BtnAgregarDireccionFinal.SetLeftAndRight(10%x,90%x)"[frmDireccionesUsa/General script]
views.get("btnagregardireccionfinal").vw.setLeft((int)((10d / 100 * width)));
views.get("btnagregardireccionfinal").vw.setWidth((int)((90d / 100 * width) - ((10d / 100 * width))));
//BA.debugLineNum = 108;BA.debugLine="BtnAgregarDireccionFinal.Height = 8%y"[frmDireccionesUsa/General script]
views.get("btnagregardireccionfinal").vw.setHeight((int)((8d / 100 * height)));

}
}