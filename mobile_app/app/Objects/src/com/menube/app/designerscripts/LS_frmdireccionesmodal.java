package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmdireccionesmodal{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("paneldireccionmodal").vw.setLeft((int)(0d));
views.get("paneldireccionmodal").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("paneldireccionmodal").vw.setTop((int)(0d));
views.get("paneldireccionmodal").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panel2").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("panel2").vw.setHeight((int)((60d / 100 * height)));
views.get("panel2").vw.setWidth((int)((views.get("paneldireccionmodal").vw.getWidth())-(views.get("panel2").vw.getLeft())*2d));
views.get("panel2").vw.setTop((int)((50d / 100 * height) - (views.get("panel2").vw.getHeight() / 2)));
views.get("label2").vw.setTop((int)(0d));
views.get("label2").vw.setHeight((int)((7d / 100 * height)));
views.get("label2").vw.setLeft((int)((0d / 100 * width)));
views.get("label2").vw.setWidth((int)((views.get("panel2").vw.getWidth())-(15d / 100 * width)));
views.get("btndireccioncerrar").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("btndireccioncerrar").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
views.get("btndireccioncerrar").vw.setWidth((int)((views.get("panel2").vw.getWidth())-(views.get("btndireccioncerrar").vw.getLeft())));
views.get("btndireccioncerrar").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("listviewdirecciones").vw.setLeft((int)(0d));
views.get("listviewdirecciones").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("listviewdirecciones").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("listviewdirecciones").vw.setHeight((int)((views.get("panel2").vw.getHeight())-(views.get("listviewdirecciones").vw.getTop())));
views.get("btnabrirdireccion").vw.setHeight((int)((7d / 100 * height)));
views.get("btnabrirdireccion").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("btnabrirdireccion").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(1d / 100 * height)));
views.get("btnabrirdireccion").vw.setLeft((int)((views.get("panel2").vw.getLeft() + views.get("panel2").vw.getWidth()) - (views.get("btnabrirdireccion").vw.getWidth())));

}
}