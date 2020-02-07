package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmaboutus{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondoaboutus").vw.setTop((int)(0d));
views.get("panelfondoaboutus").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondoaboutus").vw.setLeft((int)(0d));
views.get("panelfondoaboutus").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelimagen").vw.setTop((int)((2d / 100 * height)));
views.get("panelimagen").vw.setWidth((int)((48d / 100 * width)));
views.get("panelimagen").vw.setHeight((int)((29d / 100 * height)));
views.get("panelimagen").vw.setLeft((int)((50d / 100 * width) - (views.get("panelimagen").vw.getWidth() / 2)));
views.get("imageviewlogo").vw.setTop((int)((5.5d / 100 * height)));
views.get("imageviewlogo").vw.setLeft((int)((5.5d / 100 * width)));
views.get("imageviewlogo").vw.setWidth((int)((views.get("panelimagen").vw.getWidth())-(11d / 100 * width)));
views.get("imageviewlogo").vw.setHeight((int)((views.get("panelimagen").vw.getHeight())-(11d / 100 * height)));
views.get("label2").vw.setTop((int)((views.get("panelimagen").vw.getTop() + views.get("panelimagen").vw.getHeight())+(1d / 100 * height)));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("panelaboutus").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("panelaboutus").vw.setLeft((int)((2d / 100 * width)));
views.get("panelaboutus").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("panelaboutus").vw.setHeight((int)((27d / 100 * height)));
views.get("label1").vw.setTop((int)((1d / 100 * height)));
views.get("label1").vw.setLeft((int)((1d / 100 * width)));
views.get("label1").vw.setWidth((int)((views.get("panelaboutus").vw.getWidth())-(2d / 100 * width)));
views.get("label1").vw.setHeight((int)((views.get("panelaboutus").vw.getHeight())-(2d / 100 * height)));
views.get("label4").vw.setTop((int)((views.get("panelaboutus").vw.getTop() + views.get("panelaboutus").vw.getHeight())+(1d / 100 * height)));
views.get("label4").vw.setLeft((int)((2d / 100 * width)));
views.get("label4").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("label4").vw.setHeight((int)((5d / 100 * height)));
views.get("paneldir").vw.setTop((int)((views.get("label4").vw.getTop() + views.get("label4").vw.getHeight())));
views.get("paneldir").vw.setLeft((int)((2d / 100 * width)));
views.get("paneldir").vw.setWidth((int)((98d / 100 * width) - ((2d / 100 * width))));
views.get("paneldir").vw.setHeight((int)((19d / 100 * height)));
views.get("label3").vw.setTop((int)((1d / 100 * height)));
views.get("label3").vw.setLeft((int)((1d / 100 * width)));
views.get("label3").vw.setWidth((int)((views.get("paneldir").vw.getWidth())-(2d / 100 * width)));
views.get("label3").vw.setHeight((int)((views.get("paneldir").vw.getHeight())-(2d / 100 * height)));
//BA.debugLineNum = 44;BA.debugLine="btnBackAboutus.Top = PanelDir.Bottom + 1%y"[frmAboutUs/General script]
views.get("btnbackaboutus").vw.setTop((int)((views.get("paneldir").vw.getTop() + views.get("paneldir").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 45;BA.debugLine="btnBackAboutus.SetLeftAndRight(5%x,95%x)"[frmAboutUs/General script]
views.get("btnbackaboutus").vw.setLeft((int)((5d / 100 * width)));
views.get("btnbackaboutus").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
//BA.debugLineNum = 46;BA.debugLine="btnBackAboutus.Height = 8%y"[frmAboutUs/General script]
views.get("btnbackaboutus").vw.setHeight((int)((8d / 100 * height)));

}
}