package com.jq.pedidos.designerscripts;
import anywheresoftware.b4a.objects.TextViewWrapper;
import anywheresoftware.b4a.objects.ImageViewWrapper;
import anywheresoftware.b4a.BA;


public class LS_datepicker{

public static void LS_general(java.util.LinkedHashMap<String, anywheresoftware.b4a.keywords.LayoutBuilder.ViewWrapperAndAnchor> views, int width, int height, float scale) {
anywheresoftware.b4a.keywords.LayoutBuilder.setScaleRate(0.3);
String _w="";
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll 'uncomment to scale all views based on the device physical size."[datepicker/General script]
anywheresoftware.b4a.keywords.LayoutBuilder.scaleAll(views);
//BA.debugLineNum = 4;BA.debugLine="Base.SetLeftAndRight(3%x,97%x)"[datepicker/General script]
views.get("base").vw.setLeft((int)((3d / 100 * width)));
views.get("base").vw.setWidth((int)((97d / 100 * width) - ((3d / 100 * width))));
//BA.debugLineNum = 5;BA.debugLine="Base.Height = 63%y"[datepicker/General script]
views.get("base").vw.setHeight((int)((63d / 100 * height)));
//BA.debugLineNum = 7;BA.debugLine="btnToday.Height = 7%y"[datepicker/General script]
views.get("btntoday").vw.setHeight((int)((7d / 100 * height)));
//BA.debugLineNum = 8;BA.debugLine="btnCancel.Height = btnToday.Height"[datepicker/General script]
views.get("btncancel").vw.setHeight((int)((views.get("btntoday").vw.getHeight())));
//BA.debugLineNum = 9;BA.debugLine="btnToday.Width = 45%x"[datepicker/General script]
views.get("btntoday").vw.setWidth((int)((45d / 100 * width)));
//BA.debugLineNum = 10;BA.debugLine="btnCancel.Width = btnToday.Width"[datepicker/General script]
views.get("btncancel").vw.setWidth((int)((views.get("btntoday").vw.getWidth())));
//BA.debugLineNum = 13;BA.debugLine="Base.Height = Min(100%y, Base.Height)"[datepicker/General script]
views.get("base").vw.setHeight((int)(Math.min((100d / 100 * height),(views.get("base").vw.getHeight()))));
//BA.debugLineNum = 14;BA.debugLine="TopPanel.SetLeftAndRight(0, Base.Width)"[datepicker/General script]
views.get("toppanel").vw.setLeft((int)(0d));
views.get("toppanel").vw.setWidth((int)((views.get("base").vw.getWidth()) - (0d)));
//BA.debugLineNum = 15;BA.debugLine="Months.VerticalCenter = TopPanel.VerticalCenter"[datepicker/General script]
views.get("months").vw.setTop((int)((views.get("toppanel").vw.getTop() + views.get("toppanel").vw.getHeight()/2) - (views.get("months").vw.getHeight() / 2)));
//BA.debugLineNum = 16;BA.debugLine="Years.VerticalCenter = Months.VerticalCenter"[datepicker/General script]
views.get("years").vw.setTop((int)((views.get("months").vw.getTop() + views.get("months").vw.getHeight()/2) - (views.get("years").vw.getHeight() / 2)));
//BA.debugLineNum = 17;BA.debugLine="lblSelectedDay.HorizontalCenter = TopPanel.HorizontalCenter"[datepicker/General script]
views.get("lblselectedday").vw.setLeft((int)((views.get("toppanel").vw.getLeft() + views.get("toppanel").vw.getWidth()/2) - (views.get("lblselectedday").vw.getWidth() / 2)));
//BA.debugLineNum = 18;BA.debugLine="Months.SetLeftAndRight(2dip, lblSelectedDay.Left)"[datepicker/General script]
views.get("months").vw.setLeft((int)((2d * scale)));
views.get("months").vw.setWidth((int)((views.get("lblselectedday").vw.getLeft()) - ((2d * scale))));
//BA.debugLineNum = 19;BA.debugLine="Years.SetLeftAndRight(lblSelectedDay.Right, TopPanel.Width - 2dip)"[datepicker/General script]
views.get("years").vw.setLeft((int)((views.get("lblselectedday").vw.getLeft() + views.get("lblselectedday").vw.getWidth())));
views.get("years").vw.setWidth((int)((views.get("toppanel").vw.getWidth())-(2d * scale) - ((views.get("lblselectedday").vw.getLeft() + views.get("lblselectedday").vw.getWidth()))));
//BA.debugLineNum = 20;BA.debugLine="w = Base.Width / 7"[datepicker/General script]
_w = BA.NumberToString((views.get("base").vw.getWidth())/7d);
//BA.debugLineNum = 21;BA.debugLine="Label1.SetLeftAndRight(0, w)"[datepicker/General script]
views.get("label1").vw.setLeft((int)(0d));
views.get("label1").vw.setWidth((int)(Double.parseDouble(_w) - (0d)));
//BA.debugLineNum = 22;BA.debugLine="Label2.SetLeftAndRight(w, 2 * w)"[datepicker/General script]
views.get("label2").vw.setLeft((int)(Double.parseDouble(_w)));
views.get("label2").vw.setWidth((int)(2d*Double.parseDouble(_w) - (Double.parseDouble(_w))));
//BA.debugLineNum = 23;BA.debugLine="Label3.SetLeftAndRight(2 * w, 3 * w)"[datepicker/General script]
views.get("label3").vw.setLeft((int)(2d*Double.parseDouble(_w)));
views.get("label3").vw.setWidth((int)(3d*Double.parseDouble(_w) - (2d*Double.parseDouble(_w))));
//BA.debugLineNum = 24;BA.debugLine="Label4.SetLeftAndRight(3 * w, 4 * w)"[datepicker/General script]
views.get("label4").vw.setLeft((int)(3d*Double.parseDouble(_w)));
views.get("label4").vw.setWidth((int)(4d*Double.parseDouble(_w) - (3d*Double.parseDouble(_w))));
//BA.debugLineNum = 25;BA.debugLine="Label5.SetLeftAndRight(4 * w, 5 * w)"[datepicker/General script]
views.get("label5").vw.setLeft((int)(4d*Double.parseDouble(_w)));
views.get("label5").vw.setWidth((int)(5d*Double.parseDouble(_w) - (4d*Double.parseDouble(_w))));
//BA.debugLineNum = 26;BA.debugLine="Label6.SetLeftAndRight(5 * w, 6 * w)"[datepicker/General script]
views.get("label6").vw.setLeft((int)(5d*Double.parseDouble(_w)));
views.get("label6").vw.setWidth((int)(6d*Double.parseDouble(_w) - (5d*Double.parseDouble(_w))));
//BA.debugLineNum = 27;BA.debugLine="Label7.SetLeftAndRight(6 * w, 7 * w)"[datepicker/General script]
views.get("label7").vw.setLeft((int)(6d*Double.parseDouble(_w)));
views.get("label7").vw.setWidth((int)(7d*Double.parseDouble(_w) - (6d*Double.parseDouble(_w))));
//BA.debugLineNum = 28;BA.debugLine="btnToday.Bottom = Base.Height - 1%y"[datepicker/General script]
views.get("btntoday").vw.setTop((int)((views.get("base").vw.getHeight())-(1d / 100 * height) - (views.get("btntoday").vw.getHeight())));
//BA.debugLineNum = 29;BA.debugLine="btnCancel.Bottom = Base.Height - 1%y"[datepicker/General script]
views.get("btncancel").vw.setTop((int)((views.get("base").vw.getHeight())-(1d / 100 * height) - (views.get("btncancel").vw.getHeight())));
//BA.debugLineNum = 30;BA.debugLine="btnToday.HorizontalCenter = Base.Width / 4"[datepicker/General script]
views.get("btntoday").vw.setLeft((int)((views.get("base").vw.getWidth())/4d - (views.get("btntoday").vw.getWidth() / 2)));
//BA.debugLineNum = 31;BA.debugLine="btnCancel.HorizontalCenter = 3 * Base.Width / 4"[datepicker/General script]
views.get("btncancel").vw.setLeft((int)(3d*(views.get("base").vw.getWidth())/4d - (views.get("btncancel").vw.getWidth() / 2)));
//BA.debugLineNum = 32;BA.debugLine="DaysPanel.SetLeftAndRight(1%x, Base.Width - 1%x)"[datepicker/General script]
views.get("dayspanel").vw.setLeft((int)((1d / 100 * width)));
views.get("dayspanel").vw.setWidth((int)((views.get("base").vw.getWidth())-(1d / 100 * width) - ((1d / 100 * width))));
//BA.debugLineNum = 33;BA.debugLine="DaysPanel.SetTopAndBottom(Label1.Bottom, btnToday.Top - 1%y )"[datepicker/General script]
views.get("dayspanel").vw.setTop((int)((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight())));
views.get("dayspanel").vw.setHeight((int)((views.get("btntoday").vw.getTop())-(1d / 100 * height) - ((views.get("label1").vw.getTop() + views.get("label1").vw.getHeight()))));
//BA.debugLineNum = 34;BA.debugLine="DaysPanelBackground.SetLeftAndRight(DaysPanel.Left, DaysPanel.Right)"[datepicker/General script]
views.get("dayspanelbackground").vw.setLeft((int)((views.get("dayspanel").vw.getLeft())));
views.get("dayspanelbackground").vw.setWidth((int)((views.get("dayspanel").vw.getLeft() + views.get("dayspanel").vw.getWidth()) - ((views.get("dayspanel").vw.getLeft()))));
//BA.debugLineNum = 35;BA.debugLine="DaysPanelBackground.SetTopAndBottom(DaysPanel.Top, DaysPanel.Bottom)"[datepicker/General script]
views.get("dayspanelbackground").vw.setTop((int)((views.get("dayspanel").vw.getTop())));
views.get("dayspanelbackground").vw.setHeight((int)((views.get("dayspanel").vw.getTop() + views.get("dayspanel").vw.getHeight()) - ((views.get("dayspanel").vw.getTop()))));
//BA.debugLineNum = 36;BA.debugLine="Base.HorizontalCenter = 50%x"[datepicker/General script]
views.get("base").vw.setLeft((int)((50d / 100 * width) - (views.get("base").vw.getWidth() / 2)));
//BA.debugLineNum = 37;BA.debugLine="Base.VerticalCenter = 50%y"[datepicker/General script]
views.get("base").vw.setTop((int)((50d / 100 * height) - (views.get("base").vw.getHeight() / 2)));

}
}