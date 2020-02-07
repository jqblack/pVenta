package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmdireccionesrd{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondodireccionesrd").vw.setTop((int)((0d / 100 * height)));
views.get("panelfondodireccionesrd").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("panelfondodireccionesrd").vw.setLeft((int)(0d));
views.get("panelfondodireccionesrd").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelmarcodirrd").vw.setLeft((int)((3d / 100 * width)));
views.get("panelmarcodirrd").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
views.get("panelmarcodirrd").vw.setTop((int)((10d / 100 * height)));
views.get("panelmarcodirrd").vw.setHeight((int)((90d / 100 * height) - ((10d / 100 * height))));
views.get("panelencabezadord").vw.setLeft((int)(0d));
views.get("panelencabezadord").vw.setWidth((int)((views.get("panelmarcodirrd").vw.getWidth())));
views.get("panelencabezadord").vw.setTop((int)(0d));
views.get("panelencabezadord").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackrd").vw.setLeft((int)(0d));
views.get("btnbackrd").vw.setTop((int)(0d));
views.get("btnbackrd").vw.setWidth((int)((15d / 100 * width)));
views.get("btnbackrd").vw.setHeight((int)((8d / 100 * height)));
views.get("label9").vw.setTop((int)(0d));
views.get("label9").vw.setLeft((int)((views.get("btnbackrd").vw.getLeft() + views.get("btnbackrd").vw.getWidth())+(5d / 100 * width)));
views.get("label9").vw.setHeight((int)((8d / 100 * height)));
views.get("label9").vw.setWidth((int)((57d / 100 * width)));
views.get("btndeleterd").vw.setTop((int)(0d));
views.get("btndeleterd").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btndeleterd").vw.setLeft((int)((views.get("label9").vw.getLeft() + views.get("label9").vw.getWidth())));
views.get("btndeleterd").vw.setWidth((int)((15d / 100 * width)));
views.get("label10").vw.setTop((int)((views.get("panelencabezadord").vw.getTop() + views.get("panelencabezadord").vw.getHeight())+(2d / 100 * height)));
views.get("label10").vw.setLeft((int)((2d / 100 * width)));
views.get("label10").vw.setHeight((int)((5d / 100 * height)));
views.get("label10").vw.setWidth((int)((50d / 100 * width)));
views.get("panel1rd").vw.setTop((int)((views.get("label10").vw.getTop() + views.get("label10").vw.getHeight())));
views.get("panel1rd").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("panel1rd").vw.setWidth((int)((90d / 100 * width)));
views.get("panel1rd").vw.setHeight((int)((10d / 100 * height)));
views.get("txtdirerd").vw.setTop((int)(0d));
views.get("txtdirerd").vw.setLeft((int)(0d));
views.get("txtdirerd").vw.setWidth((int)((views.get("panel1rd").vw.getWidth())));
views.get("txtdirerd").vw.setHeight((int)((views.get("panel1rd").vw.getHeight())));
views.get("label11").vw.setTop((int)((views.get("panel1rd").vw.getTop() + views.get("panel1rd").vw.getHeight())+(1d / 100 * height)));
views.get("label11").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("label11").vw.setWidth((int)((views.get("label10").vw.getWidth())));
views.get("label11").vw.setHeight((int)((views.get("label10").vw.getHeight())));
views.get("panel3rd").vw.setTop((int)((views.get("label11").vw.getTop() + views.get("label11").vw.getHeight())));
views.get("panel3rd").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("panel3rd").vw.setWidth((int)((90d / 100 * width)));
views.get("panel3rd").vw.setHeight((int)((6d / 100 * height)));
views.get("txtsector").vw.setTop((int)(0d));
views.get("txtsector").vw.setLeft((int)(0d));
views.get("txtsector").vw.setWidth((int)((views.get("panel3rd").vw.getWidth())));
views.get("txtsector").vw.setHeight((int)((views.get("panel3rd").vw.getHeight())+(2d / 100 * height)));
views.get("label12").vw.setTop((int)((views.get("panel3rd").vw.getTop() + views.get("panel3rd").vw.getHeight())+(1d / 100 * height)));
views.get("label12").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("label12").vw.setWidth((int)((views.get("label10").vw.getWidth())));
views.get("label12").vw.setHeight((int)((views.get("label10").vw.getHeight())));
views.get("panelcombord").vw.setTop((int)((views.get("label12").vw.getTop() + views.get("label12").vw.getHeight())));
views.get("panelcombord").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("panelcombord").vw.setWidth((int)((90d / 100 * width)));
views.get("panelcombord").vw.setHeight((int)((6d / 100 * height)));
views.get("btnprovinciacombo").vw.setTop((int)(0d));
views.get("btnprovinciacombo").vw.setLeft((int)(0d));
views.get("btnprovinciacombo").vw.setWidth((int)((views.get("panelcombord").vw.getWidth())));
views.get("btnprovinciacombo").vw.setHeight((int)((views.get("panelcombord").vw.getHeight())));
views.get("label13").vw.setTop((int)((views.get("panelcombord").vw.getTop() + views.get("panelcombord").vw.getHeight())+(1d / 100 * height)));
views.get("label13").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("label13").vw.setWidth((int)((views.get("label10").vw.getWidth())));
views.get("label13").vw.setHeight((int)((views.get("label10").vw.getHeight())));
views.get("panel2rd").vw.setTop((int)((views.get("label13").vw.getTop() + views.get("label13").vw.getHeight())));
views.get("panel2rd").vw.setLeft((int)((views.get("label10").vw.getLeft())));
views.get("panel2rd").vw.setWidth((int)((80d / 100 * width)));
views.get("panel2rd").vw.setHeight((int)((6d / 100 * height)));
views.get("txtzipcoderd").vw.setTop((int)(0d));
views.get("txtzipcoderd").vw.setLeft((int)(0d));
views.get("txtzipcoderd").vw.setWidth((int)((views.get("panel2rd").vw.getWidth())));
views.get("txtzipcoderd").vw.setHeight((int)((views.get("panel2rd").vw.getHeight())+(2d / 100 * height)));
views.get("chprincipalrd").vw.setTop((int)((views.get("panel2rd").vw.getTop() + views.get("panel2rd").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 90;BA.debugLine="chPrincipalRD.Left = 3%x"[frmDireccionesRD/General script]
views.get("chprincipalrd").vw.setLeft((int)((3d / 100 * width)));
//BA.debugLineNum = 91;BA.debugLine="chPrincipalRD.Height = 5%y"[frmDireccionesRD/General script]
views.get("chprincipalrd").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 92;BA.debugLine="chPrincipalRD.Width = 78%x"[frmDireccionesRD/General script]
views.get("chprincipalrd").vw.setWidth((int)((78d / 100 * width)));
//BA.debugLineNum = 94;BA.debugLine="btnAgregarDirRD.Top = chPrincipalRD.Bottom + 2%y"[frmDireccionesRD/General script]
views.get("btnagregardirrd").vw.setTop((int)((views.get("chprincipalrd").vw.getTop() + views.get("chprincipalrd").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 95;BA.debugLine="btnAgregarDirRD.SetLeftAndRight(5%x,88%x)"[frmDireccionesRD/General script]
views.get("btnagregardirrd").vw.setLeft((int)((5d / 100 * width)));
views.get("btnagregardirrd").vw.setWidth((int)((88d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 96;BA.debugLine="btnAgregarDirRD.Height = 8%y"[frmDireccionesRD/General script]
views.get("btnagregardirrd").vw.setHeight((int)((8d / 100 * height)));

}
}