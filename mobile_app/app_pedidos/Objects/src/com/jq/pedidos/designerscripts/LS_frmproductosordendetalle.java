package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmproductosordendetalle{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondoordedetalle").vw.setTop((int)(0d));
views.get("panelfondoordedetalle").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondoordedetalle").vw.setLeft((int)(0d));
views.get("panelfondoordedetalle").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelmarcoproorden").vw.setTop((int)((5d / 100 * height)));
views.get("panelmarcoproorden").vw.setHeight((int)((95d / 100 * height) - ((5d / 100 * height))));
views.get("panelmarcoproorden").vw.setLeft((int)((5d / 100 * width)));
views.get("panelmarcoproorden").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("panelencabezadom").vw.setLeft((int)((0d / 100 * width)));
views.get("panelencabezadom").vw.setWidth((int)((90d / 100 * width) - ((0d / 100 * width))));
views.get("panelencabezadom").vw.setTop((int)(0d));
views.get("panelencabezadom").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("lbltituloproorden").vw.setTop((int)(0d));
views.get("lbltituloproorden").vw.setHeight((int)((8d / 100 * height) - (0d)));
views.get("lbltituloproorden").vw.setLeft((int)(0d));
views.get("lbltituloproorden").vw.setWidth((int)((90d / 100 * width) - (0d)));
views.get("panellistaproorden").vw.setLeft((int)((2d / 100 * width)));
views.get("panellistaproorden").vw.setWidth((int)((88d / 100 * width) - ((2d / 100 * width))));
views.get("panellistaproorden").vw.setTop((int)((views.get("panelencabezadom").vw.getTop() + views.get("panelencabezadom").vw.getHeight())+(1d / 100 * height)));
views.get("panellistaproorden").vw.setHeight((int)((78d / 100 * height) - ((views.get("panelencabezadom").vw.getTop() + views.get("panelencabezadom").vw.getHeight())+(1d / 100 * height))));
views.get("listproordendetalle").vw.setLeft((int)(0d));
views.get("listproordendetalle").vw.setTop((int)(0d));
views.get("listproordendetalle").vw.setWidth((int)((views.get("panellistaproorden").vw.getWidth())));
views.get("listproordendetalle").vw.setHeight((int)((views.get("panellistaproorden").vw.getHeight())));
views.get("btnbackproorden").vw.setLeft((int)((2d / 100 * width)));
views.get("btnbackproorden").vw.setWidth((int)((41d / 100 * width)));
views.get("btnbackproorden").vw.setTop((int)((views.get("panellistaproorden").vw.getTop() + views.get("panellistaproorden").vw.getHeight())+(2d / 100 * height)));
views.get("btnbackproorden").vw.setHeight((int)((8d / 100 * height)));
views.get("btnaddallproorden").vw.setLeft((int)((views.get("btnbackproorden").vw.getLeft() + views.get("btnbackproorden").vw.getWidth())+(4d / 100 * width)));
views.get("btnaddallproorden").vw.setTop((int)((views.get("btnbackproorden").vw.getTop())));
views.get("btnaddallproorden").vw.setWidth((int)((views.get("btnbackproorden").vw.getWidth())));
views.get("btnaddallproorden").vw.setHeight((int)((views.get("btnbackproorden").vw.getHeight())));

}
}