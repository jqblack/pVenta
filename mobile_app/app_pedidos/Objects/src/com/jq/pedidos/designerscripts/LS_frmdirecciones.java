package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmdirecciones{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("paneldireccion").vw.setLeft((int)(0d));
views.get("paneldireccion").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("paneldireccion").vw.setTop((int)(0d));
views.get("paneldireccion").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((9d / 100 * height) - (0d)));
views.get("btndireccionback").vw.setLeft((int)(0d));
views.get("btndireccionback").vw.setTop((int)(0d));
views.get("btndireccionback").vw.setWidth((int)((15d / 100 * width)));
views.get("btndireccionback").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setLeft((int)((views.get("btndireccionback").vw.getLeft() + views.get("btndireccionback").vw.getWidth())));
views.get("label1").vw.setHeight((int)((views.get("btndireccionback").vw.getHeight())));
views.get("label1").vw.setWidth((int)((100d / 100 * width)-(views.get("label1").vw.getLeft())*2d));
views.get("label2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(2d / 100 * height)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((views.get("paneldireccion").vw.getWidth())-(views.get("label2").vw.getLeft())));
views.get("panel2").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("panel2").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("panel2").vw.setHeight((int)((71d / 100 * height)));
views.get("panel2").vw.setWidth((int)((views.get("paneldireccion").vw.getWidth())-(views.get("panel2").vw.getLeft())*2d));
views.get("listviewdirecciones").vw.setLeft((int)(0d));
views.get("listviewdirecciones").vw.setTop((int)(0d));
views.get("listviewdirecciones").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("listviewdirecciones").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("adddireccion").vw.setWidth((int)((42d / 100 * width)));
views.get("adddireccion").vw.setHeight((int)((8d / 100 * height)));
views.get("adddireccion").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("adddireccion").vw.setLeft((int)((54d / 100 * width)));

}
}