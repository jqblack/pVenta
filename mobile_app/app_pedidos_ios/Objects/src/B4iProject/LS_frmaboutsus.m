
#import "iCore.h"
@interface LS_frmaboutsus:NSObject
@end

@implementation LS_frmaboutsus

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
//BA.debugLineNum = 2;BA.debugLine="AutoScaleAll"[frmAboutsUs/General script]
[B4ILayoutBuilder scaleAll:views :width :height];
//BA.debugLineNum = 4;BA.debugLine="PanelFondoAboutus.SetTopAndBottom(0,100%y)"[frmAboutsUs/General script]
[views get:@"panelfondoaboutus"].Top = (int)(0.0);
[views get:@"panelfondoaboutus"].Height = (int)((100 / 100.0 * height) - (0.0));
//BA.debugLineNum = 5;BA.debugLine="PanelFondoAboutus.SetLeftAndRight(0,100%x)"[frmAboutsUs/General script]
[views get:@"panelfondoaboutus"].Left = (int)(0.0);
[views get:@"panelfondoaboutus"].Width = (int)((100 / 100.0 * width) - (0.0));
//BA.debugLineNum = 7;BA.debugLine="PanelImagen.Top = 0%y"[frmAboutsUs/General script]
[views get:@"panelimagen"].Top = (int)((0 / 100.0 * height));
//BA.debugLineNum = 8;BA.debugLine="PanelImagen.Width = 48%x"[frmAboutsUs/General script]
[views get:@"panelimagen"].Width = (int)((48 / 100.0 * width));
//BA.debugLineNum = 9;BA.debugLine="PanelImagen.Height = 18%y"[frmAboutsUs/General script]
[views get:@"panelimagen"].Height = (int)((18 / 100.0 * height));
//BA.debugLineNum = 10;BA.debugLine="PanelImagen.HorizontalCenter = 50%x"[frmAboutsUs/General script]
[views get:@"panelimagen"].Left = (int)((50 / 100.0 * width) - ([views get:@"panelimagen"].Width / 2));
//BA.debugLineNum = 12;BA.debugLine="ImageViewLogo.Top = 0"[frmAboutsUs/General script]
[views get:@"imageviewlogo"].Top = (int)(0.0);
//BA.debugLineNum = 13;BA.debugLine="ImageViewLogo.Left = 8.5%x"[frmAboutsUs/General script]
[views get:@"imageviewlogo"].Left = (int)((8.5 / 100.0 * width));
//BA.debugLineNum = 14;BA.debugLine="ImageViewLogo.Width = PanelImagen.Width - 17%x"[frmAboutsUs/General script]
[views get:@"imageviewlogo"].Width = (int)(([views get:@"panelimagen"].Width)-(17 / 100.0 * width));
//BA.debugLineNum = 15;BA.debugLine="ImageViewLogo.Height = PanelImagen.Height"[frmAboutsUs/General script]
[views get:@"imageviewlogo"].Height = (int)(([views get:@"panelimagen"].Height));
//BA.debugLineNum = 17;BA.debugLine="Label1.Top = PanelImagen.Bottom + 1%y"[frmAboutsUs/General script]
[views get:@"label1"].Top = (int)(([views get:@"panelimagen"].Top + [views get:@"panelimagen"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 18;BA.debugLine="Label1.SetLeftAndRight(2%x,98%x)"[frmAboutsUs/General script]
[views get:@"label1"].Left = (int)((2 / 100.0 * width));
[views get:@"label1"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
//BA.debugLineNum = 19;BA.debugLine="Label1.Height = 5%y"[frmAboutsUs/General script]
[views get:@"label1"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 21;BA.debugLine="PanelAboutus.Top = Label1.Bottom"[frmAboutsUs/General script]
[views get:@"panelaboutus"].Top = (int)(([views get:@"label1"].Top + [views get:@"label1"].Height));
//BA.debugLineNum = 22;BA.debugLine="PanelAboutus.SetLeftAndRight(2%x,98%x)"[frmAboutsUs/General script]
[views get:@"panelaboutus"].Left = (int)((2 / 100.0 * width));
[views get:@"panelaboutus"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
//BA.debugLineNum = 23;BA.debugLine="PanelAboutus.Height = 36%y"[frmAboutsUs/General script]
[views get:@"panelaboutus"].Height = (int)((36 / 100.0 * height));
//BA.debugLineNum = 25;BA.debugLine="Label2.Top = 1%y"[frmAboutsUs/General script]
[views get:@"label2"].Top = (int)((1 / 100.0 * height));
//BA.debugLineNum = 26;BA.debugLine="Label2.Left = 1%x"[frmAboutsUs/General script]
[views get:@"label2"].Left = (int)((1 / 100.0 * width));
//BA.debugLineNum = 27;BA.debugLine="Label2.Width = PanelAboutus.Width - 2%x"[frmAboutsUs/General script]
[views get:@"label2"].Width = (int)(([views get:@"panelaboutus"].Width)-(2 / 100.0 * width));
//BA.debugLineNum = 28;BA.debugLine="Label2.Height = PanelAboutus.Height - 2%y"[frmAboutsUs/General script]
[views get:@"label2"].Height = (int)(([views get:@"panelaboutus"].Height)-(2 / 100.0 * height));
//BA.debugLineNum = 30;BA.debugLine="Label3.Top = PanelAboutus.Bottom + 1%y"[frmAboutsUs/General script]
[views get:@"label3"].Top = (int)(([views get:@"panelaboutus"].Top + [views get:@"panelaboutus"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 31;BA.debugLine="Label3.SetLeftAndRight(2%x,98%x)"[frmAboutsUs/General script]
[views get:@"label3"].Left = (int)((2 / 100.0 * width));
[views get:@"label3"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
//BA.debugLineNum = 32;BA.debugLine="Label3.Height = 5%y"[frmAboutsUs/General script]
[views get:@"label3"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 34;BA.debugLine="PanelDir.Top = Label3.Bottom"[frmAboutsUs/General script]
[views get:@"paneldir"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
//BA.debugLineNum = 35;BA.debugLine="PanelDir.SetLeftAndRight(2%x,98%x)"[frmAboutsUs/General script]
[views get:@"paneldir"].Left = (int)((2 / 100.0 * width));
[views get:@"paneldir"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
//BA.debugLineNum = 36;BA.debugLine="PanelDir.Height = 21%y"[frmAboutsUs/General script]
[views get:@"paneldir"].Height = (int)((21 / 100.0 * height));
//BA.debugLineNum = 38;BA.debugLine="Label4.Top = 1%y"[frmAboutsUs/General script]
[views get:@"label4"].Top = (int)((1 / 100.0 * height));
//BA.debugLineNum = 39;BA.debugLine="Label4.Left = 1%x"[frmAboutsUs/General script]
[views get:@"label4"].Left = (int)((1 / 100.0 * width));
//BA.debugLineNum = 40;BA.debugLine="Label4.Width = PanelDir.Width - 2%x"[frmAboutsUs/General script]
[views get:@"label4"].Width = (int)(([views get:@"paneldir"].Width)-(2 / 100.0 * width));
//BA.debugLineNum = 41;BA.debugLine="Label4.Height = PanelDir.Height - 2%y"[frmAboutsUs/General script]
[views get:@"label4"].Height = (int)(([views get:@"paneldir"].Height)-(2 / 100.0 * height));
//BA.debugLineNum = 44;BA.debugLine="btnBackAboutus.Top = PanelDir.Bottom + 1%y"[frmAboutsUs/General script]
[views get:@"btnbackaboutus"].Top = (int)(([views get:@"paneldir"].Top + [views get:@"paneldir"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 45;BA.debugLine="btnBackAboutus.SetLeftAndRight(5%x,95%x)"[frmAboutsUs/General script]
[views get:@"btnbackaboutus"].Left = (int)((5 / 100.0 * width));
[views get:@"btnbackaboutus"].Width = (int)((95 / 100.0 * width) - ((5 / 100.0 * width)));
//BA.debugLineNum = 46;BA.debugLine="btnBackAboutus.Height = 8%y"[frmAboutsUs/General script]
[views get:@"btnbackaboutus"].Height = (int)((8 / 100.0 * height));

}
@end