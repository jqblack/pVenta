package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmreporteordenes{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelordenes").vw.setLeft((int)(0d));
views.get("panelordenes").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelordenes").vw.setTop((int)(0d));
views.get("panelordenes").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelordentitulo").vw.setLeft((int)(0d));
views.get("panelordentitulo").vw.setTop((int)(0d));
views.get("panelordentitulo").vw.setHeight((int)((8d / 100 * height)));
views.get("panelordentitulo").vw.setWidth((int)((views.get("panelordenes").vw.getWidth())));
views.get("btnreporteback").vw.setLeft((int)(0d));
views.get("btnreporteback").vw.setTop((int)(0d));
views.get("btnreporteback").vw.setHeight((int)((views.get("panelordentitulo").vw.getHeight())));
views.get("btnreporteback").vw.setWidth((int)((15d / 100 * width)));
views.get("label1").vw.setLeft((int)((views.get("btnreporteback").vw.getLeft() + views.get("btnreporteback").vw.getWidth())));
views.get("label1").vw.setHeight((int)((views.get("panelordentitulo").vw.getHeight())));
views.get("label1").vw.setWidth((int)((views.get("panelordentitulo").vw.getWidth())-(views.get("label1").vw.getLeft())));
views.get("label1").vw.setTop((int)(0d));
views.get("label2").vw.setTop((int)((views.get("panelordentitulo").vw.getTop() + views.get("panelordentitulo").vw.getHeight())+(2d / 100 * height)));
views.get("label2").vw.setHeight((int)((7d / 100 * height)));
views.get("label2").vw.setWidth((int)((20d / 100 * width)));
views.get("label2").vw.setLeft((int)((3d / 100 * width)));
views.get("panel1").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("panel1").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
views.get("panel1").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("panel1").vw.setWidth((int)((70d / 100 * width)));
views.get("date").vw.setLeft((int)(0d));
views.get("date").vw.setTop((int)(0d));
views.get("date").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("date").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label4").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label4").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("label4").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(1d / 100 * height)));
views.get("label4").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("panel3").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("panel3").vw.setTop((int)((views.get("label4").vw.getTop())));
views.get("panel3").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("panel3").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("date2").vw.setLeft((int)(0d));
views.get("date2").vw.setTop((int)(0d));
views.get("date2").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
views.get("date2").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("label3").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())+(2d / 100 * height)));
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
views.get("label3").vw.setLeft((int)((views.get("label4").vw.getLeft())));
views.get("label3").vw.setWidth((int)((views.get("panelordenes").vw.getWidth())-(views.get("label3").vw.getLeft())*2d));
views.get("panel2").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("panel2").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((57d / 100 * height)));
views.get("panel2").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("listviewordenes").vw.setLeft((int)(0d));
views.get("listviewordenes").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("listviewordenes").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("listviewordenes").vw.setTop((int)(0d));
views.get("btnbuscarreporte").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
views.get("btnbuscarreporte").vw.setHeight((int)((7d / 100 * height)));
views.get("btnbuscarreporte").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("btnbuscarreporte").vw.setWidth((int)((views.get("panel2").vw.getWidth())));

}
}