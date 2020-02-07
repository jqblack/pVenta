package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmproductoorden{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelordenproductos").vw.setLeft((int)(0d));
views.get("panelordenproductos").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelordenproductos").vw.setTop((int)(0d));
views.get("panelordenproductos").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelordentitulo").vw.setLeft((int)(0d));
views.get("panelordentitulo").vw.setTop((int)(0d));
views.get("panelordentitulo").vw.setHeight((int)((8d / 100 * height)));
views.get("panelordentitulo").vw.setWidth((int)((views.get("panelordenproductos").vw.getWidth())));
views.get("btnordenback").vw.setLeft((int)(0d));
views.get("btnordenback").vw.setTop((int)(0d));
views.get("btnordenback").vw.setHeight((int)((views.get("panelordentitulo").vw.getHeight())));
views.get("btnordenback").vw.setWidth((int)((15d / 100 * width)));
views.get("label1").vw.setLeft((int)((views.get("btnordenback").vw.getLeft() + views.get("btnordenback").vw.getWidth())));
views.get("label1").vw.setHeight((int)((views.get("panelordentitulo").vw.getHeight())));
views.get("label1").vw.setWidth((int)((views.get("panelordentitulo").vw.getWidth())-(views.get("label1").vw.getLeft())*2d));
views.get("label1").vw.setTop((int)(0d));
views.get("btnordeneliminartodos").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("btnordeneliminartodos").vw.setHeight((int)((views.get("btnordenback").vw.getHeight())));
views.get("btnordeneliminartodos").vw.setWidth((int)((views.get("btnordenback").vw.getWidth())));
views.get("btnordeneliminartodos").vw.setTop((int)((views.get("btnordenback").vw.getTop())));
views.get("panelordenproductosdetalles").vw.setLeft((int)((3d / 100 * width)));
views.get("panelordenproductosdetalles").vw.setWidth((int)((views.get("panelordenproductos").vw.getWidth())-(views.get("panelordenproductosdetalles").vw.getLeft())*2d));
views.get("panelordenproductosdetalles").vw.setTop((int)((views.get("panelordentitulo").vw.getTop() + views.get("panelordentitulo").vw.getHeight())+(2d / 100 * height)));
views.get("panelordenproductosdetalles").vw.setHeight((int)((47d / 100 * height)));
views.get("listviewordenproducto").vw.setLeft((int)(0d));
views.get("listviewordenproducto").vw.setWidth((int)((views.get("panelordenproductosdetalles").vw.getWidth())));
views.get("listviewordenproducto").vw.setTop((int)(0d));
views.get("listviewordenproducto").vw.setHeight((int)((views.get("panelordenproductosdetalles").vw.getHeight())));
views.get("paneldireccion").vw.setTop((int)((views.get("panelordenproductosdetalles").vw.getTop() + views.get("panelordenproductosdetalles").vw.getHeight())+(2d / 100 * height)));
views.get("paneldireccion").vw.setHeight((int)((15d / 100 * height)));
views.get("paneldireccion").vw.setWidth((int)((views.get("panelordenproductosdetalles").vw.getWidth())));
views.get("paneldireccion").vw.setLeft((int)((views.get("panelordenproductosdetalles").vw.getLeft())));
views.get("label3").vw.setWidth((int)((views.get("paneldireccion").vw.getWidth())));
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
views.get("label3").vw.setTop((int)(0d));
views.get("label3").vw.setLeft((int)(0d));
views.get("lbldireccion").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("lbldireccion").vw.setWidth((int)((views.get("paneldireccion").vw.getWidth())));
views.get("lbldireccion").vw.setHeight((int)((views.get("paneldireccion").vw.getHeight())-(views.get("lbldireccion").vw.getTop())));
views.get("panelordentotal").vw.setLeft((int)((views.get("panelordenproductosdetalles").vw.getLeft())));
views.get("panelordentotal").vw.setTop((int)((views.get("paneldireccion").vw.getTop() + views.get("paneldireccion").vw.getHeight())+(2d / 100 * height)));
views.get("panelordentotal").vw.setHeight((int)((12d / 100 * height)));
views.get("panelordentotal").vw.setWidth((int)((views.get("panelordenproductosdetalles").vw.getWidth())));
views.get("label4").vw.setLeft((int)(0d));
views.get("label4").vw.setTop((int)(0d));
views.get("label4").vw.setWidth((int)((45d / 100 * width)));
views.get("label4").vw.setHeight((int)((views.get("panelordentotal").vw.getHeight())/2d));
views.get("lblprecioenvio").vw.setTop((int)((views.get("label4").vw.getTop())));
views.get("lblprecioenvio").vw.setLeft((int)((views.get("label4").vw.getLeft() + views.get("label4").vw.getWidth())));
views.get("lblprecioenvio").vw.setWidth((int)((views.get("panelordentotal").vw.getWidth())-(views.get("lblprecioenvio").vw.getLeft())));
views.get("lblprecioenvio").vw.setHeight((int)((views.get("label4").vw.getHeight())));
views.get("label2").vw.setLeft((int)(0d));
views.get("label2").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
views.get("label2").vw.setWidth((int)((views.get("label4").vw.getWidth())));
views.get("label2").vw.setHeight((int)((views.get("label4").vw.getHeight())));
views.get("lblordentotalpagar").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("lblordentotalpagar").vw.setLeft((int)((views.get("label2").vw.getLeft() + views.get("label2").vw.getWidth())));
views.get("lblordentotalpagar").vw.setWidth((int)((views.get("panelordentotal").vw.getWidth())-(views.get("lblordentotalpagar").vw.getLeft())));
views.get("lblordentotalpagar").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("panelordenenviar").vw.setLeft((int)((views.get("panelordenproductosdetalles").vw.getLeft())));
views.get("panelordenenviar").vw.setTop((int)((views.get("panelordentotal").vw.getTop() + views.get("panelordentotal").vw.getHeight())+(2d / 100 * height)));
views.get("panelordenenviar").vw.setHeight((int)((7.8d / 100 * height)));
views.get("panelordenenviar").vw.setWidth((int)((views.get("panelordenproductosdetalles").vw.getWidth())));
views.get("btnordenenviar").vw.setLeft((int)(0d));
views.get("btnordenenviar").vw.setTop((int)(0d));
views.get("btnordenenviar").vw.setWidth((int)((views.get("panelordenenviar").vw.getWidth())));
views.get("btnordenenviar").vw.setHeight((int)((views.get("panelordenenviar").vw.getHeight())));

}
}