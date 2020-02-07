package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmdirecciones{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("paneldireccion").vw.setLeft((int)(0d));
views.get("paneldireccion").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("paneldireccion").vw.setTop((int)(0d));
views.get("paneldireccion").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panel1").vw.setLeft((int)(0d));
views.get("panel1").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panel1").vw.setTop((int)(0d));
views.get("panel1").vw.setHeight((int)((9d / 100 * height) - (0d)));
views.get("btndireccionback").vw.setLeft((int)(0d));
views.get("btndireccionback").vw.setTop((int)(0d));
views.get("btndireccionback").vw.setWidth((int)((15d / 100 * width)));
views.get("btndireccionback").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("label1").vw.setTop((int)(0d));
views.get("label1").vw.setLeft((int)((views.get("btndireccionback").vw.getLeft() + views.get("btndireccionback").vw.getWidth())));
views.get("label1").vw.setHeight((int)((views.get("btndireccionback").vw.getHeight())));
views.get("label1").vw.setWidth((int)((100d / 100 * width)-(views.get("label1").vw.getLeft())*2d));
views.get("label2").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(2d / 100 * height)));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("label2").vw.setLeft((int)((5d / 100 * width)));
views.get("label2").vw.setWidth((int)((views.get("paneldireccion").vw.getWidth())-(views.get("label2").vw.getLeft())));
views.get("panel2").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())));
views.get("panel2").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("panel2").vw.setHeight((int)((41.5d / 100 * height)));
views.get("panel2").vw.setWidth((int)((views.get("paneldireccion").vw.getWidth())-(views.get("panel2").vw.getLeft())*2d));
views.get("listviewdirecciones").vw.setLeft((int)(0d));
views.get("listviewdirecciones").vw.setTop((int)(0d));
views.get("listviewdirecciones").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("listviewdirecciones").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("label3").vw.setTop((int)((views.get("panel2").vw.getTop() + views.get("panel2").vw.getHeight())+(2d / 100 * height)));
views.get("label3").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("label3").vw.setHeight((int)((views.get("label2").vw.getHeight())));
views.get("label3").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("panel3").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())));
views.get("panel3").vw.setLeft((int)((views.get("panel2").vw.getLeft())));
//BA.debugLineNum = 42;BA.debugLine="Panel3.Width = Panel2.Width"[frmDirecciones/General script]
views.get("panel3").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
//BA.debugLineNum = 43;BA.debugLine="Panel3.Height = 20%y"[frmDirecciones/General script]
views.get("panel3").vw.setHeight((int)((20d / 100 * height)));
//BA.debugLineNum = 45;BA.debugLine="txtDireccion.Left = 0"[frmDirecciones/General script]
views.get("txtdireccion").vw.setLeft((int)(0d));
//BA.debugLineNum = 46;BA.debugLine="txtDireccion.Top = 0"[frmDirecciones/General script]
views.get("txtdireccion").vw.setTop((int)(0d));
//BA.debugLineNum = 47;BA.debugLine="txtDireccion.Width = Panel3.Width"[frmDirecciones/General script]
views.get("txtdireccion").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
//BA.debugLineNum = 48;BA.debugLine="txtDireccion.Height = Panel3.Height + 1%y"[frmDirecciones/General script]
views.get("txtdireccion").vw.setHeight((int)((views.get("panel3").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 50;BA.debugLine="chPrincipal.Width = Panel3.Width"[frmDirecciones/General script]
views.get("chprincipal").vw.setWidth((int)((views.get("panel3").vw.getWidth())));
//BA.debugLineNum = 51;BA.debugLine="chPrincipal.Height = 5%y"[frmDirecciones/General script]
views.get("chprincipal").vw.setHeight((int)((5d / 100 * height)));
//BA.debugLineNum = 52;BA.debugLine="chPrincipal.Top = Panel3.Bottom"[frmDirecciones/General script]
views.get("chprincipal").vw.setTop((int)((views.get("panel3").vw.getTop() + views.get("panel3").vw.getHeight())));
//BA.debugLineNum = 53;BA.debugLine="chPrincipal.Left = Panel3.Left"[frmDirecciones/General script]
views.get("chprincipal").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
//BA.debugLineNum = 55;BA.debugLine="btnNuevaDireccion.Left = Panel3.Left"[frmDirecciones/General script]
views.get("btnnuevadireccion").vw.setLeft((int)((views.get("panel3").vw.getLeft())));
//BA.debugLineNum = 56;BA.debugLine="btnNuevaDireccion.Height = 7%y"[frmDirecciones/General script]
views.get("btnnuevadireccion").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 57;BA.debugLine="btnNuevaDireccion.Width = 44%x"[frmDirecciones/General script]
views.get("btnnuevadireccion").vw.setWidth((int)((44d / 100 * width)));
//BA.debugLineNum = 58;BA.debugLine="btnNuevaDireccion.Top = chPrincipal.Bottom + 1%y"[frmDirecciones/General script]
views.get("btnnuevadireccion").vw.setTop((int)((views.get("chprincipal").vw.getTop() + views.get("chprincipal").vw.getHeight())+(1d / 100 * height)));
//BA.debugLineNum = 60;BA.debugLine="btnSalvarDireccion.Width = btnNuevaDireccion.Width"[frmDirecciones/General script]
views.get("btnsalvardireccion").vw.setWidth((int)((views.get("btnnuevadireccion").vw.getWidth())));
//BA.debugLineNum = 61;BA.debugLine="btnSalvarDireccion.Height = btnNuevaDireccion.Height"[frmDirecciones/General script]
views.get("btnsalvardireccion").vw.setHeight((int)((views.get("btnnuevadireccion").vw.getHeight())));
//BA.debugLineNum = 62;BA.debugLine="btnSalvarDireccion.Top = btnNuevaDireccion.Top"[frmDirecciones/General script]
views.get("btnsalvardireccion").vw.setTop((int)((views.get("btnnuevadireccion").vw.getTop())));
//BA.debugLineNum = 63;BA.debugLine="btnSalvarDireccion.Left = btnNuevaDireccion.Right +2%x"[frmDirecciones/General script]
views.get("btnsalvardireccion").vw.setLeft((int)((views.get("btnnuevadireccion").vw.getLeft() + views.get("btnnuevadireccion").vw.getWidth())+(2d / 100 * width)));

}
}