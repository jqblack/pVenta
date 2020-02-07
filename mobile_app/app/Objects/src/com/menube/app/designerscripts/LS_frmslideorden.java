package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmslideorden{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelslideback").vw.setLeft((int)(0d));
views.get("panelslideback").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelslideback").vw.setTop((int)(0d));
views.get("panelslideback").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelslide").vw.setHeight((int)((46d / 100 * height)));
views.get("panelslide").vw.setLeft((int)((5d / 100 * width)));
views.get("panelslide").vw.setWidth((int)((views.get("panelslideback").vw.getWidth())-(views.get("panelslide").vw.getLeft())*2d));
views.get("panelslide").vw.setTop((int)((30d / 100 * height)));
views.get("panel2").vw.setLeft((int)(0d));
views.get("panel2").vw.setWidth((int)((views.get("panelslide").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((8d / 100 * height)));
views.get("panel2").vw.setTop((int)(0d));
views.get("btnslidevolver").vw.setLeft((int)(0d));
views.get("btnslidevolver").vw.setTop((int)(0d));
views.get("btnslidevolver").vw.setWidth((int)((15d / 100 * width)));
views.get("btnslidevolver").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("label1").vw.setLeft((int)((views.get("btnslidevolver").vw.getLeft() + views.get("btnslidevolver").vw.getWidth())));
views.get("label1").vw.setWidth((int)((views.get("panel2").vw.getWidth())-(views.get("label1").vw.getLeft())));
views.get("label1").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("label1").vw.setTop((int)(0d));
views.get("panel3").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(5d / 100 * height)));
views.get("panel3").vw.setLeft((int)((5d / 100 * width)));
views.get("panel3").vw.setHeight((int)((8d / 100 * height)));
views.get("panel3").vw.setWidth((int)((views.get("panelslide").vw.getWidth())-(views.get("panel3").vw.getLeft())*2d));
views.get("label3").vw.setLeft((int)(0d));
views.get("label3").vw.setTop((int)(0d));
views.get("label3").vw.setWidth((int)((15d / 100 * width)));
views.get("label3").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("label2").vw.setLeft((int)((views.get("label3").vw.getLeft() + views.get("label3").vw.getWidth())));
views.get("label2").vw.setTop((int)(0d));
views.get("label2").vw.setWidth((int)((views.get("panel3").vw.getWidth())-(views.get("label2").vw.getLeft())));
views.get("label2").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("panel4").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
views.get("panel4").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
views.get("panel4").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("panel4").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())+(2d / 100 * height)));
views.get("label5").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("label5").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("label5").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("label5").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label4").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label4").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("label4").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("label4").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("panel5").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
views.get("panel5").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
views.get("panel5").vw.setHeight((int)((views.get("panel3").vw.getHeight())));
views.get("panel5").vw.setTop((int)((views.get("panel4").vw.getTop() + views.get("panel4").vw.getHeight())+(2d / 100 * height)));
views.get("label7").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("label7").vw.setTop((int)((views.get("label3").vw.getTop())));
views.get("label7").vw.setWidth((int)((views.get("label3").vw.getWidth())));
views.get("label7").vw.setHeight((int)((views.get("label3").vw.getHeight())));
views.get("label6").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("label6").vw.setTop((int)((views.get("label2").vw.getTop())));
views.get("label6").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("label6").vw.setHeight((int)((views.get("label2").vw.getHeight())));

}
}