package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmproducomodal{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelmodalproducto").vw.setLeft((int)(0d));
views.get("panelmodalproducto").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelmodalproducto").vw.setTop((int)(0d));
views.get("panelmodalproducto").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panel1").vw.setTop((int)((9d / 100 * height)));
views.get("panel1").vw.setLeft((int)((5d / 100 * width)));
views.get("panel1").vw.setHeight((int)((9d / 100 * height)));
views.get("panel1").vw.setWidth((int)((100d / 100 * width)-(views.get("panel1").vw.getLeft())*2d));
views.get("panel3").vw.setLeft((int)((1d / 100 * width)));
views.get("panel3").vw.setTop((int)((0.9d / 100 * height)));
views.get("panel3").vw.setWidth((int)((72d / 100 * width)));
views.get("panel3").vw.setHeight((int)((views.get("panel1").vw.getHeight())-(views.get("panel3").vw.getTop())*2d));
views.get("txtbuscarproducto").vw.setTop((int)(0d));
views.get("txtbuscarproducto").vw.setLeft((int)(0d));
views.get("txtbuscarproducto").vw.setHeight((int)((views.get("panel3").vw.getHeight())+(1d / 100 * height)));
views.get("txtbuscarproducto").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
views.get("btnproductobuscarmodal").vw.setLeft((int)((views.get("txtbuscarproducto").vw.getLeft() + views.get("txtbuscarproducto").vw.getWidth())+(2d / 100 * width)));
views.get("btnproductobuscarmodal").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("btnproductobuscarmodal").vw.setWidth((int)((15d / 100 * width)));
views.get("btnproductobuscarmodal").vw.setTop((int)((views.get("panel3").vw.getTop())));
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(2d / 100 * height)));
views.get("panel2").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((75d / 100 * height)));
views.get("panel4").vw.setLeft((int)((2d / 100 * width)));
views.get("panel4").vw.setTop((int)((1d / 100 * height)));
views.get("panel4").vw.setWidth((int)((views.get("panel2").vw.getWidth())-(views.get("panel4").vw.getLeft())*2d));
views.get("panel4").vw.setHeight((int)((views.get("panel2").vw.getHeight())-(11d / 100 * height)));
views.get("listproductosmodalview").vw.setLeft((int)(0d));
views.get("listproductosmodalview").vw.setTop((int)(0d));
views.get("listproductosmodalview").vw.setWidth((int)((views.get("panel4").vw.getWidth())));
views.get("listproductosmodalview").vw.setHeight((int)((views.get("panel4").vw.getHeight())));
views.get("btnproductovolver").vw.setTop((int)((views.get("panel4").vw.getTop() + views.get("panel4").vw.getHeight())+(1d / 100 * height)));
views.get("btnproductovolver").vw.setLeft((int)((views.get("panel4").vw.getLeft())));
views.get("btnproductovolver").vw.setWidth((int)((views.get("panel4").vw.getWidth())));
views.get("btnproductovolver").vw.setHeight((int)((7d / 100 * height)));
views.get("panel2").vw.setHeight((int)((views.get("btnproductovolver").vw.getTop() + views.get("btnproductovolver").vw.getHeight())+(1d / 100 * height)));

}
}