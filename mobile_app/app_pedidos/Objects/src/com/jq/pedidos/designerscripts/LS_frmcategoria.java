package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmcategoria{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondoslidecategorias").vw.setTop((int)(0d));
views.get("panelfondoslidecategorias").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondoslidecategorias").vw.setLeft((int)(0d));
views.get("panelfondoslidecategorias").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadoslidecategoria").vw.setLeft((int)(0d));
views.get("panelencabezadoslidecategoria").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadoslidecategoria").vw.setTop((int)(0d));
views.get("panelencabezadoslidecategoria").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackslidecategoria").vw.setTop((int)(0d));
views.get("btnbackslidecategoria").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackslidecategoria").vw.setLeft((int)(0d));
views.get("btnbackslidecategoria").vw.setWidth((int)((15d / 100 * width) - (0d)));
views.get("label1").vw.setLeft((int)((15d / 100 * width)));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("label1").vw.setWidth((int)((80d / 100 * width)));
views.get("listviewslidecategorias").vw.setLeft((int)((2d / 100 * width)));
views.get("listviewslidecategorias").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("listviewslidecategorias").vw.setTop((int)((views.get("panelencabezadoslidecategoria").vw.getTop() + views.get("panelencabezadoslidecategoria").vw.getHeight())+(2d / 100 * height)));
views.get("listviewslidecategorias").vw.setHeight((int)((88d / 100 * height)));

}
}