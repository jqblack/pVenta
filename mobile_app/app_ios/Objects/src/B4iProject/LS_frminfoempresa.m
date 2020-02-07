
#import "iCore.h"
@interface LS_frminfoempresa:NSObject
@end

@implementation LS_frminfoempresa

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelinfoback"].Left = (int)(0.0);
[views get:@"panelinfoback"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelinfoback"].Top = (int)(0.0);
[views get:@"panelinfoback"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelinfo"].Left = (int)((7 / 100.0 * width));
[views get:@"panelinfo"].Height = (int)((51 / 100.0 * height));
[views get:@"panelinfo"].Top = (int)((50 / 100.0 * height) - ([views get:@"panelinfo"].Height / 2));
[views get:@"panelinfo"].Width = (int)((100 / 100.0 * width)-([views get:@"panelinfo"].Left)*2.0);
[views get:@"lblinfoempresa"].Top = (int)((3 / 100.0 * height));
[views get:@"lblinfoempresa"].Left = (int)((5 / 100.0 * width));
[views get:@"lblinfoempresa"].Height = (int)((5 / 100.0 * height));
[views get:@"lblinfoempresa"].Width = (int)(([views get:@"panelinfo"].Width)-([views get:@"lblinfoempresa"].Left));
[views get:@"label1"].Left = (int)(([views get:@"lblinfoempresa"].Left));
[views get:@"label1"].Height = (int)((5 / 100.0 * height));
[views get:@"label1"].Width = (int)((35 / 100.0 * width));
[views get:@"label1"].Top = (int)(([views get:@"lblinfoempresa"].Top + [views get:@"lblinfoempresa"].Height)+(1 / 100.0 * height));
[views get:@"lblinfonegocio"].Top = (int)(([views get:@"label1"].Top));
[views get:@"lblinfonegocio"].Left = (int)(([views get:@"label1"].Left + [views get:@"label1"].Width));
[views get:@"lblinfonegocio"].Height = (int)(([views get:@"label1"].Height));
[views get:@"lblinfonegocio"].Width = (int)(([views get:@"panelinfo"].Width)-([views get:@"lblinfonegocio"].Left));
[views get:@"label2"].Left = (int)(([views get:@"label1"].Left));
[views get:@"label2"].Width = (int)(([views get:@"label1"].Width));
[views get:@"label2"].Height = (int)(([views get:@"label1"].Height));
[views get:@"label2"].Top = (int)(([views get:@"label1"].Top + [views get:@"label1"].Height)+(1 / 100.0 * height));
[views get:@"lblpedidominimo"].Top = (int)(([views get:@"label2"].Top));
[views get:@"lblpedidominimo"].Left = (int)(([views get:@"label1"].Left + [views get:@"label1"].Width));
[views get:@"lblpedidominimo"].Height = (int)(([views get:@"label1"].Height));
[views get:@"lblpedidominimo"].Width = (int)(([views get:@"lblinfonegocio"].Width));
[views get:@"label3"].Left = (int)(([views get:@"label1"].Left));
[views get:@"label3"].Width = (int)(([views get:@"label1"].Width)/1.5);
[views get:@"label3"].Height = (int)(([views get:@"label1"].Height));
[views get:@"label3"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height)+(1 / 100.0 * height));
[views get:@"lbltelefono"].Top = (int)(([views get:@"label3"].Top));
//BA.debugLineNum = 43;BA.debugLine="lblTelefono.Left = Label3.Right"[frmInfoEmpresa/General script]
[views get:@"lbltelefono"].Left = (int)(([views get:@"label3"].Left + [views get:@"label3"].Width));
//BA.debugLineNum = 44;BA.debugLine="lblTelefono.Height = Label1.Height"[frmInfoEmpresa/General script]
[views get:@"lbltelefono"].Height = (int)(([views get:@"label1"].Height));
//BA.debugLineNum = 45;BA.debugLine="lblTelefono.Width = lblInfoNegocio.Width"[frmInfoEmpresa/General script]
[views get:@"lbltelefono"].Width = (int)(([views get:@"lblinfonegocio"].Width));
//BA.debugLineNum = 47;BA.debugLine="Label4.Left = Label1.Left"[frmInfoEmpresa/General script]
[views get:@"label4"].Left = (int)(([views get:@"label1"].Left));
//BA.debugLineNum = 48;BA.debugLine="Label4.Width = Label1.Width"[frmInfoEmpresa/General script]
[views get:@"label4"].Width = (int)(([views get:@"label1"].Width));
//BA.debugLineNum = 49;BA.debugLine="Label4.Height = Label1.Height"[frmInfoEmpresa/General script]
[views get:@"label4"].Height = (int)(([views get:@"label1"].Height));
//BA.debugLineNum = 50;BA.debugLine="Label4.Top = Label3.Bottom + 1%y"[frmInfoEmpresa/General script]
[views get:@"label4"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 52;BA.debugLine="lblDireccion.Top = Label4.Bottom"[frmInfoEmpresa/General script]
[views get:@"lbldireccion"].Top = (int)(([views get:@"label4"].Top + [views get:@"label4"].Height));
//BA.debugLineNum = 53;BA.debugLine="lblDireccion.Left = Label4.Left"[frmInfoEmpresa/General script]
[views get:@"lbldireccion"].Left = (int)(([views get:@"label4"].Left));
//BA.debugLineNum = 54;BA.debugLine="lblDireccion.Height = 10%y"[frmInfoEmpresa/General script]
[views get:@"lbldireccion"].Height = (int)((10 / 100.0 * height));
//BA.debugLineNum = 55;BA.debugLine="lblDireccion.Width = PanelInfo.Width - lblDireccion.Left *2"[frmInfoEmpresa/General script]
[views get:@"lbldireccion"].Width = (int)(([views get:@"panelinfo"].Width)-([views get:@"lbldireccion"].Left)*2.0);
//BA.debugLineNum = 57;BA.debugLine="btnInfoCerrar.Width = 25%x"[frmInfoEmpresa/General script]
[views get:@"btninfocerrar"].Width = (int)((25 / 100.0 * width));
//BA.debugLineNum = 58;BA.debugLine="btnInfoCerrar.Height = 7%y"[frmInfoEmpresa/General script]
[views get:@"btninfocerrar"].Height = (int)((7 / 100.0 * height));
//BA.debugLineNum = 59;BA.debugLine="btnInfoCerrar.Right = PanelInfo.Width - 2%x"[frmInfoEmpresa/General script]
[views get:@"btninfocerrar"].Left = (int)(([views get:@"panelinfo"].Width)-(2 / 100.0 * width) - ([views get:@"btninfocerrar"].Width));
//BA.debugLineNum = 60;BA.debugLine="btnInfoCerrar.Bottom = PanelInfo.Height -1%y"[frmInfoEmpresa/General script]
[views get:@"btninfocerrar"].Top = (int)(([views get:@"panelinfo"].Height)-(1 / 100.0 * height) - ([views get:@"btninfocerrar"].Height));

}
@end