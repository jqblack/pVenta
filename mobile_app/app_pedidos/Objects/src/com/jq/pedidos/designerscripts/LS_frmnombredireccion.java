package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmnombredireccion{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondonombredir").vw.setTop((int)((0d / 100 * height)));
views.get("panelfondonombredir").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("panelfondonombredir").vw.setLeft((int)((0d / 100 * width)));
views.get("panelfondonombredir").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelmarconombredir").vw.setTop((int)((35d / 100 * height)));
views.get("panelmarconombredir").vw.setHeight((int)((65d / 100 * height) - ((35d / 100 * height))));
views.get("panelmarconombredir").vw.setLeft((int)((20d / 100 * width)));
views.get("panelmarconombredir").vw.setWidth((int)((80d / 100 * width) - ((20d / 100 * width))));
views.get("label16").vw.setTop((int)((4d / 100 * height)));
views.get("label16").vw.setLeft((int)((3d / 100 * width)));
views.get("label16").vw.setHeight((int)((5d / 100 * height)));
views.get("label16").vw.setWidth((int)((50d / 100 * width)));
views.get("panel2").vw.setTop((int)((views.get("label16").vw.getTop() + views.get("label16").vw.getHeight())+(1d / 100 * height)));
views.get("panel2").vw.setLeft((int)((views.get("label16").vw.getLeft())));
views.get("panel2").vw.setWidth((int)((54d / 100 * width)));
views.get("panel2").vw.setHeight((int)((7d / 100 * height)));
views.get("txtnombredireccion").vw.setTop((int)(0d));
views.get("txtnombredireccion").vw.setLeft((int)(0d));
views.get("txtnombredireccion").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("txtnombredireccion").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("btnaceptarnombredir").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("btnaceptarnombredir").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("btnaceptarnombredir").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("btnaceptarnombredir").vw.setHeight((int)((8d / 100 * height)));

}
}