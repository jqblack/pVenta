package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frminfoempresa{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelinfoback").vw.setLeft((int)(0d));
views.get("panelinfoback").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelinfoback").vw.setTop((int)(0d));
views.get("panelinfoback").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelinfo").vw.setLeft((int)((7d / 100 * width)));
views.get("panelinfo").vw.setHeight((int)((51d / 100 * height)));
views.get("panelinfo").vw.setTop((int)((50d / 100 * height) - (views.get("panelinfo").vw.getHeight() / 2)));
views.get("panelinfo").vw.setWidth((int)((100d / 100 * width)-(views.get("panelinfo").vw.getLeft())*2d));
views.get("lblinfoempresa").vw.setTop((int)((3d / 100 * height)));
views.get("lblinfoempresa").vw.setLeft((int)((5d / 100 * width)));
views.get("lblinfoempresa").vw.setHeight((int)((5d / 100 * height)));
views.get("lblinfoempresa").vw.setWidth((int)((views.get("panelinfo").vw.getWidth())-(views.get("lblinfoempresa").vw.getLeft())));
views.get("label1").vw.setLeft((int)((views.get("lblinfoempresa").vw.getLeft())));
views.get("label1").vw.setHeight((int)((5d / 100 * height)));
views.get("label1").vw.setWidth((int)((35d / 100 * width)));
views.get("label1").vw.setTop((int)((views.get("lblinfoempresa").vw.getTop() + views.get("lblinfoempresa").vw.getHeight())+(1d / 100 * height)));
views.get("lblinfonegocio").vw.setTop((int)((views.get("label1").vw.getTop())));
views.get("lblinfonegocio").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("lblinfonegocio").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("lblinfonegocio").vw.setWidth((int)((views.get("panelinfo").vw.getWidth())-(views.get("lblinfonegocio").vw.getLeft())));
views.get("label2").vw.setLeft((int)((views.get("label1").vw.getLeft())));
views.get("label2").vw.setWidth((int)((views.get("label1").vw.getWidth())));
views.get("label2").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("label2").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(1d / 100 * height)));
views.get("lblpedidominimo").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("lblpedidominimo").vw.setLeft((int)((views.get("label1").vw.getLeft() + views.get("label1").vw.getWidth())));
views.get("lblpedidominimo").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("lblpedidominimo").vw.setWidth((int)((views.get("lblinfonegocio").vw.getWidth())));
views.get("label3").vw.setLeft((int)((views.get("label1").vw.getLeft())));
views.get("label3").vw.setWidth((int)((views.get("label1").vw.getWidth())/1.5d));
views.get("label3").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("label3").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(1d / 100 * height)));
views.get("lbltelefono").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("lbltelefono").vw.setLeft((int)((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth())));
views.get("lbltelefono").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("lbltelefono").vw.setWidth((int)((views.get("lblinfonegocio").vw.getWidth())));
views.get("label4").vw.setLeft((int)((views.get("label1").vw.getLeft())));
views.get("label4").vw.setWidth((int)((views.get("label1").vw.getWidth())));
views.get("label4").vw.setHeight((int)((views.get("label1").vw.getHeight())));
views.get("label4").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())+(1d / 100 * height)));
views.get("lbldireccion").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
views.get("lbldireccion").vw.setLeft((int)((views.get("label4").vw.getLeft())));
views.get("lbldireccion").vw.setHeight((int)((10d / 100 * height)));
views.get("lbldireccion").vw.setWidth((int)((views.get("panelinfo").vw.getWidth())-(views.get("lbldireccion").vw.getLeft())*2d));
views.get("btninfocerrar").vw.setWidth((int)((25d / 100 * width)));
views.get("btninfocerrar").vw.setHeight((int)((7d / 100 * height)));
views.get("btninfocerrar").vw.setLeft((int)((views.get("panelinfo").vw.getWidth())-(2d / 100 * width) - (views.get("btninfocerrar").vw.getWidth())));
views.get("btninfocerrar").vw.setTop((int)((views.get("panelinfo").vw.getHeight())-(1d / 100 * height) - (views.get("btninfocerrar").vw.getHeight())));

}
}