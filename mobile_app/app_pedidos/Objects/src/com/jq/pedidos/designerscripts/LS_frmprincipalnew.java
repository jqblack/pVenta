package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmprincipalnew{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelmenu").vw.setLeft((int)((0d / 100 * width)));
views.get("panelmenu").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("panelmenu").vw.setTop((int)((0d / 100 * height)));
views.get("panelmenu").vw.setHeight((int)((100d / 100 * height) - ((0d / 100 * height))));
views.get("panelfondopro").vw.setTop((int)((1d / 100 * height)));
views.get("panelfondopro").vw.setLeft((int)((1d / 100 * width)));
views.get("panelfondopro").vw.setHeight((int)((42d / 100 * height)));
views.get("panelfondopro").vw.setWidth((int)((47d / 100 * width)));
views.get("panelimagen").vw.setLeft((int)((0d / 100 * width)));
views.get("panelimagen").vw.setTop((int)((0d / 100 * height)));
views.get("panelimagen").vw.setWidth((int)((views.get("panelfondopro").vw.getWidth())));
views.get("panelimagen").vw.setHeight((int)((20d / 100 * height)));
views.get("imagenpro").vw.setTop((int)((0d / 100 * height)));
views.get("imagenpro").vw.setLeft((int)((0d / 100 * width)));
views.get("imagenpro").vw.setWidth((int)((views.get("panelimagen").vw.getWidth())));
views.get("imagenpro").vw.setHeight((int)((views.get("panelimagen").vw.getHeight())));
views.get("lbltitulopro").vw.setLeft((int)((2d / 100 * width)));
views.get("lbltitulopro").vw.setTop((int)((views.get("imagenpro").vw.getTop() + views.get("imagenpro").vw.getHeight())+(1d / 100 * height)));
views.get("lbltitulopro").vw.setWidth((int)((views.get("panelfondopro").vw.getWidth())-(2d / 100 * width)));
views.get("lbltitulopro").vw.setHeight((int)((5d / 100 * height)));
views.get("lblpreciopro").vw.setLeft((int)((views.get("lbltitulopro").vw.getLeft())));
views.get("lblpreciopro").vw.setTop((int)((views.get("lbltitulopro").vw.getTop() + views.get("lbltitulopro").vw.getHeight())));
views.get("lblpreciopro").vw.setWidth((int)((28d / 100 * width)));
views.get("lblpreciopro").vw.setHeight((int)((views.get("lbltitulopro").vw.getHeight())));
views.get("btnaddpro").vw.setLeft((int)((2d / 100 * width)));
views.get("btnaddpro").vw.setWidth((int)((45d / 100 * width) - ((2d / 100 * width))));
views.get("btnaddpro").vw.setTop((int)((views.get("lblpreciopro").vw.getTop() + views.get("lblpreciopro").vw.getHeight())+(1.5d / 100 * height)));
views.get("btnaddpro").vw.setHeight((int)((8d / 100 * height)));
views.get("btnfav").vw.setLeft((int)((views.get("lblpreciopro").vw.getLeft() + views.get("lblpreciopro").vw.getWidth())+(2d / 100 * width)));
views.get("btnfav").vw.setTop((int)((views.get("lblpreciopro").vw.getTop())));
views.get("btnfav").vw.setHeight((int)((7d / 100 * height)));
views.get("btnfav").vw.setWidth((int)((15d / 100 * width)));

}
}