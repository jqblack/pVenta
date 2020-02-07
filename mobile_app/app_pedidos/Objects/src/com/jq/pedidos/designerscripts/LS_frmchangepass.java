package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmchangepass{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelfondomodalpass").vw.setTop((int)(0d));
views.get("panelfondomodalpass").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("panelfondomodalpass").vw.setLeft((int)(0d));
views.get("panelfondomodalpass").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelmarcopass").vw.setTop((int)((20d / 100 * height)));
views.get("panelmarcopass").vw.setHeight((int)((80d / 100 * height) - ((20d / 100 * height))));
views.get("panelmarcopass").vw.setLeft((int)((5d / 100 * width)));
views.get("panelmarcopass").vw.setWidth((int)((95d / 100 * width) - ((5d / 100 * width))));
views.get("label1").vw.setTop((int)((3d / 100 * height)));
views.get("label1").vw.setLeft((int)((2d / 100 * width)));
views.get("label1").vw.setWidth((int)((89d / 100 * width) - ((2d / 100 * width))));
views.get("label1").vw.setHeight((int)((5d / 100 * height)));
views.get("panelant").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())+(1d / 100 * height)));
views.get("panelant").vw.setLeft((int)((views.get("label1").vw.getLeft())));
views.get("panelant").vw.setWidth((int)((views.get("label1").vw.getWidth())));
views.get("panelant").vw.setHeight((int)((6d / 100 * height)));
views.get("txtpassantigua").vw.setLeft((int)((1d / 100 * width)));
views.get("txtpassantigua").vw.setTop((int)(0d));
views.get("txtpassantigua").vw.setHeight((int)((views.get("panelant").vw.getHeight())+(2d / 100 * height)));
views.get("txtpassantigua").vw.setWidth((int)((views.get("panelant").vw.getWidth())-(2d / 100 * width)));
views.get("label2").vw.setTop((int)((views.get("panelant").vw.getTop() + views.get("panelant").vw.getHeight())+(2d / 100 * height)));
views.get("label2").vw.setLeft((int)((2d / 100 * width)));
views.get("label2").vw.setWidth((int)((89d / 100 * width) - ((2d / 100 * width))));
views.get("label2").vw.setHeight((int)((5d / 100 * height)));
views.get("panelnewpass").vw.setTop((int)((views.get("label2").vw.getTop() + views.get("label2").vw.getHeight())+(1d / 100 * height)));
views.get("panelnewpass").vw.setLeft((int)((views.get("label2").vw.getLeft())));
views.get("panelnewpass").vw.setWidth((int)((views.get("label2").vw.getWidth())));
views.get("panelnewpass").vw.setHeight((int)((views.get("panelant").vw.getHeight())));
views.get("txtnewpass").vw.setLeft((int)((1d / 100 * width)));
views.get("txtnewpass").vw.setTop((int)(0d));
views.get("txtnewpass").vw.setHeight((int)((views.get("panelnewpass").vw.getHeight())+(2d / 100 * height)));
views.get("txtnewpass").vw.setWidth((int)((views.get("panelnewpass").vw.getWidth())-(2d / 100 * width)));
views.get("label3").vw.setTop((int)((views.get("panelnewpass").vw.getTop() + views.get("panelnewpass").vw.getHeight())+(2d / 100 * height)));
views.get("label3").vw.setLeft((int)((2d / 100 * width)));
views.get("label3").vw.setWidth((int)((89d / 100 * width) - ((2d / 100 * width))));
views.get("label3").vw.setHeight((int)((5d / 100 * height)));
views.get("panelconfirm").vw.setTop((int)((views.get("label3").vw.getTop() + views.get("label3").vw.getHeight())+(1d / 100 * height)));
views.get("panelconfirm").vw.setLeft((int)((views.get("label3").vw.getLeft())));
views.get("panelconfirm").vw.setWidth((int)((views.get("label3").vw.getWidth())));
//BA.debugLineNum = 45;BA.debugLine="Panelconfirm.Height = Panelant.Height"[frmChangePass/General script]
views.get("panelconfirm").vw.setHeight((int)((views.get("panelant").vw.getHeight())));
//BA.debugLineNum = 47;BA.debugLine="txtPassConfirm.Left = 1%x"[frmChangePass/General script]
views.get("txtpassconfirm").vw.setLeft((int)((1d / 100 * width)));
//BA.debugLineNum = 48;BA.debugLine="txtPassConfirm.Top = 0"[frmChangePass/General script]
views.get("txtpassconfirm").vw.setTop((int)(0d));
//BA.debugLineNum = 49;BA.debugLine="txtPassConfirm.Height = Panelconfirm.Height + 2%y"[frmChangePass/General script]
views.get("txtpassconfirm").vw.setHeight((int)((views.get("panelconfirm").vw.getHeight())+(2d / 100 * height)));
//BA.debugLineNum = 50;BA.debugLine="txtPassConfirm.Width = Panelconfirm.Width - 2%x"[frmChangePass/General script]
views.get("txtpassconfirm").vw.setWidth((int)((views.get("panelconfirm").vw.getWidth())-(2d / 100 * width)));
//BA.debugLineNum = 52;BA.debugLine="btnBackChangePass.Left = 2%x"[frmChangePass/General script]
views.get("btnbackchangepass").vw.setLeft((int)((2d / 100 * width)));
//BA.debugLineNum = 53;BA.debugLine="btnBackChangePass.Top = Panelconfirm.Bottom + 5%y"[frmChangePass/General script]
views.get("btnbackchangepass").vw.setTop((int)((views.get("panelconfirm").vw.getTop() + views.get("panelconfirm").vw.getHeight())+(5d / 100 * height)));
//BA.debugLineNum = 54;BA.debugLine="btnBackChangePass.Height = 8%y"[frmChangePass/General script]
views.get("btnbackchangepass").vw.setHeight((int)((8d / 100 * height)));
//BA.debugLineNum = 55;BA.debugLine="btnBackChangePass.Width = 42%x"[frmChangePass/General script]
views.get("btnbackchangepass").vw.setWidth((int)((42d / 100 * width)));
//BA.debugLineNum = 57;BA.debugLine="btnConfirmChangePass.Left = 46%x"[frmChangePass/General script]
views.get("btnconfirmchangepass").vw.setLeft((int)((46d / 100 * width)));
//BA.debugLineNum = 58;BA.debugLine="btnConfirmChangePass.Top = btnBackChangePass.Top"[frmChangePass/General script]
views.get("btnconfirmchangepass").vw.setTop((int)((views.get("btnbackchangepass").vw.getTop())));
//BA.debugLineNum = 59;BA.debugLine="btnConfirmChangePass.Height = btnBackChangePass.Height"[frmChangePass/General script]
views.get("btnconfirmchangepass").vw.setHeight((int)((views.get("btnbackchangepass").vw.getHeight())));
//BA.debugLineNum = 60;BA.debugLine="btnConfirmChangePass.Width = btnBackChangePass.Width"[frmChangePass/General script]
views.get("btnconfirmchangepass").vw.setWidth((int)((views.get("btnbackchangepass").vw.getWidth())));

}
}