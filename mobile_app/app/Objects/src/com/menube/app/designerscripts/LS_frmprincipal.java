package com.menube.app.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_frmprincipal{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
views.get("panelmenu").vw.setLeft((int)(0d));
views.get("panelmenu").vw.setWidth((int)((100d / 100 * width) - (0d)));
views.get("panelmenu").vw.setTop((int)(0d));
views.get("panelmenu").vw.setHeight((int)((100d / 100 * height) - (0d)));
views.get("paneltitulo").vw.setLeft((int)((0d / 100 * width)));
views.get("paneltitulo").vw.setWidth((int)((100d / 100 * width) - ((0d / 100 * width))));
views.get("paneltitulo").vw.setTop((int)((0d / 100 * height)));
views.get("paneltitulo").vw.setHeight((int)((8d / 100 * height) - ((0d / 100 * height))));
views.get("btnprincipalback").vw.setLeft((int)(0d));
views.get("btnprincipalback").vw.setTop((int)(0d));
views.get("btnprincipalback").vw.setWidth((int)((15d / 100 * width)));
views.get("btnprincipalback").vw.setHeight((int)((views.get("paneltitulo").vw.getHeight())));
views.get("btnempresainfo").vw.setTop((int)(0d));
views.get("btnempresainfo").vw.setLeft((int)((views.get("btnprincipalback").vw.getLeft() + views.get("btnprincipalback").vw.getWidth())));
views.get("btnempresainfo").vw.setHeight((int)((views.get("btnprincipalback").vw.getHeight())));
views.get("btnempresainfo").vw.setWidth((int)((100d / 100 * width)-(views.get("btnempresainfo").vw.getLeft())*2d));
views.get("btnorden").vw.setLeft((int)((views.get("btnempresainfo").vw.getLeft() + views.get("btnempresainfo").vw.getWidth())));
views.get("btnorden").vw.setWidth((int)((views.get("btnprincipalback").vw.getWidth())));
views.get("btnorden").vw.setHeight((int)((views.get("btnprincipalback").vw.getHeight())));
views.get("btnorden").vw.setTop((int)((views.get("btnprincipalback").vw.getTop())));
views.get("lblcantidadproductos").vw.setHeight((int)((23d * scale)));
views.get("lblcantidadproductos").vw.setWidth((int)((views.get("lblcantidadproductos").vw.getHeight())));
views.get("lblcantidadproductos").vw.setLeft((int)((views.get("btnorden").vw.getLeft() + views.get("btnorden").vw.getWidth())-(1d / 100 * width) - (views.get("lblcantidadproductos").vw.getWidth())));
views.get("lblcantidadproductos").vw.setTop((int)((views.get("btnorden").vw.getTop())+(0.5d / 100 * height)));
views.get("panel1").vw.setTop((int)((views.get("paneltitulo").vw.getTop() + views.get("paneltitulo").vw.getHeight())+(1d / 100 * height)));
views.get("panel1").vw.setLeft((int)((3d / 100 * width)));
views.get("panel1").vw.setWidth((int)((46d / 100 * width)));
views.get("panel1").vw.setHeight((int)((7d / 100 * height)));
views.get("btnmasvendido").vw.setLeft((int)(0d));
views.get("btnmasvendido").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("btnmasvendido").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("btnmasvendido").vw.setTop((int)(0d));
views.get("panel2").vw.setLeft((int)((views.get("panel1").vw.getLeft() + views.get("panel1").vw.getWidth())+(2d / 100 * width)));
views.get("panel2").vw.setWidth((int)((views.get("panel1").vw.getWidth())));
views.get("panel2").vw.setHeight((int)((views.get("panel1").vw.getHeight())));
views.get("panel2").vw.setTop((int)((views.get("panel1").vw.getTop())));
views.get("btnbuscarproducto").vw.setLeft((int)(0d));
views.get("btnbuscarproducto").vw.setWidth((int)((views.get("panel2").vw.getWidth())));
views.get("btnbuscarproducto").vw.setHeight((int)((views.get("panel2").vw.getHeight())));
views.get("btnbuscarproducto").vw.setTop((int)(0d));
views.get("lblcategoria").vw.setTop((int)((views.get("panel1").vw.getTop() + views.get("panel1").vw.getHeight())+(1d / 100 * height)));
views.get("lblcategoria").vw.setLeft((int)((views.get("panel1").vw.getLeft())));
views.get("lblcategoria").vw.setHeight((int)((5d / 100 * height)));
views.get("lblcategoria").vw.setWidth((int)((90d / 100 * width)));
views.get("panelcategoria").vw.setLeft((int)((views.get("lblcategoria").vw.getLeft())));
views.get("panelcategoria").vw.setTop((int)((views.get("lblcategoria").vw.getTop() + views.get("lblcategoria").vw.getHeight())));
views.get("panelcategoria").vw.setWidth((int)((100d / 100 * width)-(views.get("panelcategoria").vw.getLeft())*2d));
views.get("panelcategoria").vw.setHeight((int)((69d / 100 * height)));
views.get("viewcategoria").vw.setLeft((int)((1d / 100 * width)));
views.get("viewcategoria").vw.setHeight((int)((views.get("panelcategoria").vw.getHeight())));
views.get("viewcategoria").vw.setWidth((int)((views.get("panelcategoria").vw.getWidth())-(views.get("viewcategoria").vw.getLeft())*2d));
views.get("viewcategoria").vw.setTop((int)(0d));
views.get("btnabierto").vw.setTop((int)((views.get("panelcategoria").vw.getTop() + views.get("panelcategoria").vw.getHeight())+(1.5d / 100 * height)));
//BA.debugLineNum = 67;BA.debugLine="btnAbierto.Width = 35%x"[frmPrincipal/General script]
views.get("btnabierto").vw.setWidth((int)((35d / 100 * width)));
//BA.debugLineNum = 68;BA.debugLine="btnAbierto.Left = PanelCategoria.Left"[frmPrincipal/General script]
views.get("btnabierto").vw.setLeft((int)((views.get("panelcategoria").vw.getLeft())));
//BA.debugLineNum = 69;BA.debugLine="btnAbierto.Height = 5.5%y"[frmPrincipal/General script]
views.get("btnabierto").vw.setHeight((int)((5.5d / 100 * height)));
//BA.debugLineNum = 71;BA.debugLine="lblLema.Left = btnAbierto.Right + 2%x"[frmPrincipal/General script]
views.get("lbllema").vw.setLeft((int)((views.get("btnabierto").vw.getLeft() + views.get("btnabierto").vw.getWidth())+(2d / 100 * width)));
//BA.debugLineNum = 72;BA.debugLine="lblLema.Top = PanelCategoria.Bottom"[frmPrincipal/General script]
views.get("lbllema").vw.setTop((int)((views.get("panelcategoria").vw.getTop() + views.get("panelcategoria").vw.getHeight())));
//BA.debugLineNum = 73;BA.debugLine="lblLema.Height = 100%y - lblLema.Top"[frmPrincipal/General script]
views.get("lbllema").vw.setHeight((int)((100d / 100 * height)-(views.get("lbllema").vw.getTop())));
//BA.debugLineNum = 74;BA.debugLine="lblLema.Width = 100%x - lblLema.Left"[frmPrincipal/General script]
views.get("lbllema").vw.setWidth((int)((100d / 100 * width)-(views.get("lbllema").vw.getLeft())));

}
}