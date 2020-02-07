package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmproductosfavoritos{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondofavorito").vw.setTop((int)(0d));
views.get("panelfondofavorito").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondofavorito").vw.setLeft((int)(0d));
views.get("panelfondofavorito").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadofav").vw.setLeft((int)(0d));
views.get("panelencabezadofav").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelencabezadofav").vw.setTop((int)(0d));
views.get("panelencabezadofav").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackfavoritos").vw.setLeft((int)(0d));
views.get("btnbackfavoritos").vw.setTop((int)(0d));
views.get("btnbackfavoritos").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("btnbackfavoritos").vw.setWidth((int)((15d / 100 * width)));
views.get("label1").vw.setLeft((int)((15d / 100 * width)));
views.get("label1").vw.setWidth((int)((100d / 100 * width) - ((15d / 100 * width))));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("lblcantproductos").vw.setLeft((int)((2d / 100 * width)));
views.get("lblcantproductos").vw.setWidth((int)((100d / 100 * width) - ((2d / 100 * width))));
views.get("lblcantproductos").vw.setTop((int)((views.get("panelencabezadofav").vw.getTop() + views.get("panelencabezadofav").vw.getHeight())));
views.get("lblcantproductos").vw.setHeight((int)((5d / 100 * height)));
views.get("panellista").vw.setTop((int)((views.get("lblcantproductos").vw.getTop() + views.get("lblcantproductos").vw.getHeight())+(1d / 100 * height)));
views.get("panellista").vw.setLeft((int)((0d / 100 * width)));
views.get("panellista").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panellista").vw.setHeight((int)((84d / 100 * height)));
views.get("llistafavoritos").vw.setTop((int)(0d));
views.get("llistafavoritos").vw.setLeft((int)((2d / 100 * width)));
views.get("llistafavoritos").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("llistafavoritos").vw.setHeight((int)((84d / 100 * height)));

}
}