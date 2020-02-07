package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmlogin{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panellogin").vw.setLeft((int)((0d / 100 * width)));
views.get("panellogin").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panellogin").vw.setTop((int)((0d / 100 * height)));
views.get("panellogin").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("btnconfiguracion").vw.setLeft((int)(0d));
views.get("btnconfiguracion").vw.setTop((int)((1.5d / 100 * height)));
views.get("btnconfiguracion").vw.setHeight((int)((7d / 100 * height)));
views.get("btnconfiguracion").vw.setWidth((int)((15d / 100 * width)));
views.get("panelconfiguracion").vw.setTop((int)((views.get("btnconfiguracion").vw.getTop())));
views.get("panelconfiguracion").vw.setLeft((int)((views.get("btnconfiguracion").vw.getLeft() + views.get("btnconfiguracion").vw.getWidth())));
views.get("panelconfiguracion").vw.setWidth((int)((views.get("panellogin").vw.getWidth())-(views.get("panelconfiguracion").vw.getLeft())-(2d / 100 * width)));
views.get("panelconfiguracion").vw.setHeight((int)((views.get("btnconfiguracion").vw.getHeight())+(3d / 100 * height)));
views.get("txturl").vw.setLeft((int)(0d));
views.get("txturl").vw.setTop((int)(0d));
views.get("txturl").vw.setWidth((int)((views.get("panelconfiguracion").vw.getWidth())));
views.get("txturl").vw.setHeight((int)((views.get("panelconfiguracion").vw.getHeight())+(1.5d / 100 * height)));
views.get("viewlogo").vw.setTop((int)((10d / 100 * height)));
views.get("viewlogo").vw.setWidth((int)((45d / 100 * width)));
views.get("viewlogo").vw.setHeight((int)((views.get("viewlogo").vw.getWidth())-(3d / 100 * width)));
views.get("viewlogo").vw.setLeft((int)((50d / 100 * width) - (views.get("viewlogo").vw.getWidth() / 2)));
views.get("label3").vw.setLeft((int)(0d));
views.get("label3").vw.setWidth((int)((100d / 100 * width)));
views.get("label3").vw.setTop((int)((views.get("viewlogo").vw.getTop() + views.get("viewlogo").vw.getHeight())));
views.get("label3").vw.setHeight((int)((9d / 100 * height)));
views.get("panel1").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())+(6d / 100 * height)));
views.get("panel1").vw.setLeft((int)((7d / 100 * width)));
views.get("panel1").vw.setHeight((int)((7.5d / 100 * height)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width)-(views.get("panel1").vw.getLeft())*2d));
views.get("txtusuario").vw.setLeft((int)(0d));
views.get("txtusuario").vw.setTop((int)(0d));
views.get("txtusuario").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("txtusuario").vw.setHeight((int)((views.get("panel1").vw.getHeight())+(1.5d / 100 * height)));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(3d / 100 * height)));
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("panel2").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("panel2").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("txtcontrasena").vw.setLeft((int)(0d));
views.get("txtcontrasena").vw.setTop((int)(0d));
views.get("txtcontrasena").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("txtcontrasena").vw.setHeight((int)((views.get("txtusuario").vw.getHeight())));
views.get("btnlogin").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("btnlogin").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("btnlogin").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("btnlogin").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("btnmenuprincipal").vw.setTop((int)((views.get("btnlogin").vw.getTop() + views.get("btnlogin").vw.getHeight())+(2d / 100 * height)));
views.get("btnmenuprincipal").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("btnmenuprincipal").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("btnmenuprincipal").vw.setHeight((int)((7d / 100 * height)));
views.get("lblregistrarme").vw.setLeft((int)(0d));
views.get("lblregistrarme").vw.setTop((int)((views.get("btnmenuprincipal").vw.getTop() + views.get("btnmenuprincipal").vw.getHeight())+(1d / 100 * height)));
views.get("lblregistrarme").vw.setWidth((int)((100d / 100 * width)));
views.get("lblregistrarme").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setWidth((int)((100d / 100 * width)));
views.get("label2").vw.setLeft((int)(0d));
views.get("label2").vw.setTop((int)((100d / 100 * height) - (views.get("label2").vw.getHeight())));

}
}