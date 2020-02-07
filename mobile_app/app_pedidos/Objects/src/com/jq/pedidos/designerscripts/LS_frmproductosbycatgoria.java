package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmproductosbycatgoria{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondoproductosbycategorias").vw.setTop((int)(0d));
views.get("panelfondoproductosbycategorias").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondoproductosbycategorias").vw.setLeft((int)(0d));
views.get("panelfondoproductosbycategorias").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadoprobycat").vw.setLeft((int)(0d));
views.get("panelencabezadoprobycat").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadoprobycat").vw.setTop((int)(0d));
views.get("panelencabezadoprobycat").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackprobycat").vw.setTop((int)(0d));
views.get("btnbackprobycat").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackprobycat").vw.setLeft((int)(0d));
views.get("btnbackprobycat").vw.setWidth((int)((15d / 100 * width)));
views.get("label1").vw.setLeft((int)((15d / 100 * width)));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("label1").vw.setWidth((int)((80d / 100 * width)));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setTop((int)((views.get("panelencabezadoprobycat").vw.getTop() + views.get("panelencabezadoprobycat").vw.getHeight())));
views.get("label2").vw.setWidth((int)((80d / 100 * width)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("panelscroll").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(2d / 100 * height)));
views.get("panelscroll").vw.setHeight((int)((98d / 100 * height) - ((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(2d / 100 * height))));
views.get("panelscroll").vw.setLeft((int)((2d / 100 * width)));
views.get("panelscroll").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("scrollviewprobycat").vw.setTop((int)(0d));
views.get("scrollviewprobycat").vw.setLeft((int)(0d));
views.get("scrollviewprobycat").vw.setWidth((int)((views.get("panelscroll").vw.getWidth())));
views.get("scrollviewprobycat").vw.setHeight((int)((views.get("panelscroll").vw.getHeight())));

}
}