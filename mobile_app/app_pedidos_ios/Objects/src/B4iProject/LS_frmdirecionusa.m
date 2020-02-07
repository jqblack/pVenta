
#import "iCore.h"
@interface LS_frmdirecionusa:NSObject
@end

@implementation LS_frmdirecionusa

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondodirecciones2"].Top = (int)(0.0);
[views get:@"panelfondodirecciones2"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondodirecciones2"].Left = (int)(0.0);
[views get:@"panelfondodirecciones2"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadodir2"].Left = (int)(0.0);
[views get:@"panelencabezadodir2"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadodir2"].Top = (int)(0.0);
[views get:@"panelencabezadodir2"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btndireccionback2"].Left = (int)(0.0);
[views get:@"btndireccionback2"].Top = (int)(0.0);
[views get:@"btndireccionback2"].Width = (int)((15 / 100.0 * width));
[views get:@"btndireccionback2"].Height = (int)(([views get:@"panelencabezadodir2"].Height));
[views get:@"label4"].Top = (int)(0.0);
[views get:@"label4"].Left = (int)(([views get:@"btndireccionback2"].Left + [views get:@"btndireccionback2"].Width)+(2 / 100.0 * width));
[views get:@"label4"].Height = (int)(([views get:@"btndireccionback2"].Height));
[views get:@"label4"].Width = (int)((80 / 100.0 * width));
[views get:@"label2"].Top = (int)(([views get:@"panelencabezadodir2"].Top + [views get:@"panelencabezadodir2"].Height)+(1 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Left = (int)((5 / 100.0 * width));
[views get:@"label2"].Width = (int)((100 / 100.0 * width)-([views get:@"label2"].Left));
[views get:@"panel2v2"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height));
[views get:@"panel2v2"].Left = (int)(([views get:@"label2"].Left));
[views get:@"panel2v2"].Height = (int)((73 / 100.0 * height));
[views get:@"panel2v2"].Width = (int)((100 / 100.0 * width)-([views get:@"panel2v2"].Left)*2.0);
[views get:@"listadirecciones2"].Top = (int)((2 / 100.0 * height));
[views get:@"listadirecciones2"].Left = (int)((2 / 100.0 * width));
[views get:@"listadirecciones2"].Width = (int)(([views get:@"panel2v2"].Width)-(2 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"listadirecciones2"].Height = (int)(([views get:@"panel2v2"].Height)-(4 / 100.0 * height));
[views get:@"adddireccion"].Top = (int)(([views get:@"panel2v2"].Top + [views get:@"panel2v2"].Height)+(4 / 100.0 * height));
[views get:@"adddireccion"].Left = (int)((54 / 100.0 * width));
[views get:@"adddireccion"].Width = (int)((42 / 100.0 * width));
[views get:@"adddireccion"].Height = (int)((8 / 100.0 * height));
[views get:@"panelfondodireccionesusa"].Top = (int)(0.0);
[views get:@"panelfondodireccionesusa"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondodireccionesusa"].Left = (int)((100 / 100.0 * width));
[views get:@"panelfondodireccionesusa"].Width = (int)((200 / 100.0 * width) - ((100 / 100.0 * width)));
[views get:@"panelencabezadousa"].Left = (int)(0.0);
[views get:@"panelencabezadousa"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadousa"].Top = (int)(0.0);
[views get:@"panelencabezadousa"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnbackusa"].Left = (int)(0.0);
[views get:@"btnbackusa"].Top = (int)(0.0);
[views get:@"btnbackusa"].Width = (int)((15 / 100.0 * width));
[views get:@"btnbackusa"].Height = (int)(([views get:@"panelencabezadodir2"].Height));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Left = (int)(([views get:@"btndireccionback2"].Left + [views get:@"btndireccionback2"].Width)+(5 / 100.0 * width));
[views get:@"label1"].Height = (int)(([views get:@"btndireccionback2"].Height));
[views get:@"label1"].Width = (int)((63 / 100.0 * width));
[views get:@"btndeleteusa"].Top = (int)(0.0);
[views get:@"btndeleteusa"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btndeleteusa"].Left = (int)(([views get:@"label1"].Left + [views get:@"label1"].Width));
[views get:@"btndeleteusa"].Width = (int)((15 / 100.0 * width));
[views get:@"label3"].Left = (int)((2 / 100.0 * width));
[views get:@"label3"].Top = (int)(([views get:@"panelencabezadousa"].Top + [views get:@"panelencabezadousa"].Height)+(2 / 100.0 * height));
[views get:@"label3"].Height = (int)((5 / 100.0 * height));
[views get:@"label3"].Width = (int)((50 / 100.0 * width));
[views get:@"txtaddress1"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
[views get:@"txtaddress1"].Left = (int)(([views get:@"label3"].Left));
[views get:@"txtaddress1"].Width = (int)((96 / 100.0 * width));
[views get:@"txtaddress1"].Height = (int)((10 / 100.0 * height));
[views get:@"label5"].Top = (int)(([views get:@"txtaddress1"].Top + [views get:@"txtaddress1"].Height)+(1 / 100.0 * height));
[views get:@"label5"].Left = (int)(([views get:@"label3"].Left));
[views get:@"label5"].Width = (int)(([views get:@"label3"].Width));
[views get:@"label5"].Height = (int)(([views get:@"label3"].Height));
[views get:@"txtaddress2"].Top = (int)(([views get:@"label5"].Top + [views get:@"label5"].Height));
[views get:@"txtaddress2"].Left = (int)(([views get:@"label3"].Left));
[views get:@"txtaddress2"].Width = (int)((96 / 100.0 * width));
[views get:@"txtaddress2"].Height = (int)((10 / 100.0 * height));
[views get:@"label6"].Top = (int)(([views get:@"txtaddress2"].Top + [views get:@"txtaddress2"].Height)+(1 / 100.0 * height));
[views get:@"label6"].Left = (int)(([views get:@"label3"].Left));
[views get:@"label6"].Width = (int)(([views get:@"label3"].Width));
[views get:@"label6"].Height = (int)(([views get:@"label3"].Height));
[views get:@"txtcity"].Top = (int)(([views get:@"label6"].Top + [views get:@"label6"].Height));
//BA.debugLineNum = 87;BA.debugLine="txtCity.Left = Label3.Left"[frmDirecionUSA/General script]
[views get:@"txtcity"].Left = (int)(([views get:@"label3"].Left));
//BA.debugLineNum = 88;BA.debugLine="txtCity.Width = 96%x"[frmDirecionUSA/General script]
[views get:@"txtcity"].Width = (int)((96 / 100.0 * width));
//BA.debugLineNum = 89;BA.debugLine="txtCity.Height = 6%y"[frmDirecionUSA/General script]
[views get:@"txtcity"].Height = (int)((6 / 100.0 * height));
//BA.debugLineNum = 91;BA.debugLine="Label7.Top = txtCity.Bottom + 1%y"[frmDirecionUSA/General script]
[views get:@"label7"].Top = (int)(([views get:@"txtcity"].Top + [views get:@"txtcity"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 92;BA.debugLine="Label7.Left = Label3.Left"[frmDirecionUSA/General script]
[views get:@"label7"].Left = (int)(([views get:@"label3"].Left));
//BA.debugLineNum = 93;BA.debugLine="Label7.Width = Label3.Width"[frmDirecionUSA/General script]
[views get:@"label7"].Width = (int)(([views get:@"label3"].Width));
//BA.debugLineNum = 94;BA.debugLine="Label7.Height = Label3.Height"[frmDirecionUSA/General script]
[views get:@"label7"].Height = (int)(([views get:@"label3"].Height));
//BA.debugLineNum = 96;BA.debugLine="PanelComboUSA.Top = Label7.Bottom"[frmDirecionUSA/General script]
[views get:@"panelcombousa"].Top = (int)(([views get:@"label7"].Top + [views get:@"label7"].Height));
//BA.debugLineNum = 97;BA.debugLine="PanelComboUSA.Left = Label3.Left"[frmDirecionUSA/General script]
[views get:@"panelcombousa"].Left = (int)(([views get:@"label3"].Left));
//BA.debugLineNum = 98;BA.debugLine="PanelComboUSA.Width = 96%x"[frmDirecionUSA/General script]
[views get:@"panelcombousa"].Width = (int)((96 / 100.0 * width));
//BA.debugLineNum = 99;BA.debugLine="PanelComboUSA.Height = 8%y"[frmDirecionUSA/General script]
[views get:@"panelcombousa"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 101;BA.debugLine="btnState.Top = 0"[frmDirecionUSA/General script]
[views get:@"btnstate"].Top = (int)(0.0);
//BA.debugLineNum = 102;BA.debugLine="btnState.Left = 0"[frmDirecionUSA/General script]
[views get:@"btnstate"].Left = (int)(0.0);
//BA.debugLineNum = 103;BA.debugLine="btnState.Width = 96%x"[frmDirecionUSA/General script]
[views get:@"btnstate"].Width = (int)((96 / 100.0 * width));
//BA.debugLineNum = 104;BA.debugLine="btnState.Height = 8%y"[frmDirecionUSA/General script]
[views get:@"btnstate"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 106;BA.debugLine="panelZipCode.Left = Label3.Left"[frmDirecionUSA/General script]
[views get:@"panelzipcode"].Left = (int)(([views get:@"label3"].Left));
//BA.debugLineNum = 107;BA.debugLine="panelZipCode.Top = PanelComboUSA.Bottom + 1%y"[frmDirecionUSA/General script]
[views get:@"panelzipcode"].Top = (int)(([views get:@"panelcombousa"].Top + [views get:@"panelcombousa"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 108;BA.debugLine="panelZipCode.Width = 90%x"[frmDirecionUSA/General script]
[views get:@"panelzipcode"].Width = (int)((90 / 100.0 * width));
//BA.debugLineNum = 109;BA.debugLine="panelZipCode.Height = 11%y"[frmDirecionUSA/General script]
[views get:@"panelzipcode"].Height = (int)((11 / 100.0 * height));
//BA.debugLineNum = 111;BA.debugLine="Label8.Top = 0"[frmDirecionUSA/General script]
[views get:@"label8"].Top = (int)(0.0);
//BA.debugLineNum = 112;BA.debugLine="Label8.Left = 0"[frmDirecionUSA/General script]
[views get:@"label8"].Left = (int)(0.0);
//BA.debugLineNum = 113;BA.debugLine="Label8.Width = Label3.Width"[frmDirecionUSA/General script]
[views get:@"label8"].Width = (int)(([views get:@"label3"].Width));
//BA.debugLineNum = 114;BA.debugLine="Label8.Height = Label3.Height"[frmDirecionUSA/General script]
[views get:@"label8"].Height = (int)(([views get:@"label3"].Height));
//BA.debugLineNum = 116;BA.debugLine="txtZipCode.Top = Label8.Bottom"[frmDirecionUSA/General script]
[views get:@"txtzipcode"].Top = (int)(([views get:@"label8"].Top + [views get:@"label8"].Height));
//BA.debugLineNum = 117;BA.debugLine="txtZipCode.Left = 0"[frmDirecionUSA/General script]
[views get:@"txtzipcode"].Left = (int)(0.0);
//BA.debugLineNum = 118;BA.debugLine="txtZipCode.Width = 90%x"[frmDirecionUSA/General script]
[views get:@"txtzipcode"].Width = (int)((90 / 100.0 * width));
//BA.debugLineNum = 119;BA.debugLine="txtZipCode.Height = 6%y"[frmDirecionUSA/General script]
[views get:@"txtzipcode"].Height = (int)((6 / 100.0 * height));
//BA.debugLineNum = 121;BA.debugLine="chPrincipal.Top = panelZipCode.Bottom + 2%y"[frmDirecionUSA/General script]
[views get:@"chprincipal"].Top = (int)(([views get:@"panelzipcode"].Top + [views get:@"panelzipcode"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 122;BA.debugLine="chPrincipal.Left = 3%x"[frmDirecionUSA/General script]
[views get:@"chprincipal"].Left = (int)((3 / 100.0 * width));
//BA.debugLineNum = 123;BA.debugLine="chPrincipal.Height = 5%y"[frmDirecionUSA/General script]
[views get:@"chprincipal"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 124;BA.debugLine="chPrincipal.Width = 18%x"[frmDirecionUSA/General script]
[views get:@"chprincipal"].Width = (int)((18 / 100.0 * width));
//BA.debugLineNum = 126;BA.debugLine="Label14.Left = chPrincipal.Right"[frmDirecionUSA/General script]
[views get:@"label14"].Left = (int)(([views get:@"chprincipal"].Left + [views get:@"chprincipal"].Width));
//BA.debugLineNum = 127;BA.debugLine="Label14.Top = chPrincipal.Top - 0.5%y"[frmDirecionUSA/General script]
[views get:@"label14"].Top = (int)(([views get:@"chprincipal"].Top)-(0.5 / 100.0 * height));
//BA.debugLineNum = 128;BA.debugLine="Label14.Height = 5%y"[frmDirecionUSA/General script]
[views get:@"label14"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 129;BA.debugLine="Label14.Width = 70%x"[frmDirecionUSA/General script]
[views get:@"label14"].Width = (int)((70 / 100.0 * width));
//BA.debugLineNum = 131;BA.debugLine="BtnAgregarDireccionFinal.Top = chPrincipal.Bottom + 2%y"[frmDirecionUSA/General script]
[views get:@"btnagregardireccionfinal"].Top = (int)(([views get:@"chprincipal"].Top + [views get:@"chprincipal"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 132;BA.debugLine="BtnAgregarDireccionFinal.SetLeftAndRight(10%x,90%x)"[frmDirecionUSA/General script]
[views get:@"btnagregardireccionfinal"].Left = (int)((10 / 100.0 * width));
[views get:@"btnagregardireccionfinal"].Width = (int)((90 / 100.0 * width) - ((10 / 100.0 * width)));
//BA.debugLineNum = 133;BA.debugLine="BtnAgregarDireccionFinal.Height = 8%y"[frmDirecionUSA/General script]
[views get:@"btnagregardireccionfinal"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 139;BA.debugLine="PanelFondoDireccionesRD.SetTopAndBottom(100%y,200%y)"[frmDirecionUSA/General script]
[views get:@"panelfondodireccionesrd"].Top = (int)((100 / 100.0 * height));
[views get:@"panelfondodireccionesrd"].Height = (int)((200 / 100.0 * height) - ((100 / 100.0 * height)));
//BA.debugLineNum = 140;BA.debugLine="PanelFondoDireccionesRD.SetLeftAndRight(0,100%x)"[frmDirecionUSA/General script]
[views get:@"panelfondodireccionesrd"].Left = (int)(0.0);
[views get:@"panelfondodireccionesrd"].Width = (int)((100 / 100.0 * width) - (0.0));
//BA.debugLineNum = 142;BA.debugLine="PanelMarcoDirRD.SetLeftAndRight(3%x,97%x)"[frmDirecionUSA/General script]
[views get:@"panelmarcodirrd"].Left = (int)((3 / 100.0 * width));
[views get:@"panelmarcodirrd"].Width = (int)((97 / 100.0 * width) - ((3 / 100.0 * width)));
//BA.debugLineNum = 143;BA.debugLine="PanelMarcoDirRD.SetTopAndBottom(10%y,90%y)"[frmDirecionUSA/General script]
[views get:@"panelmarcodirrd"].Top = (int)((10 / 100.0 * height));
[views get:@"panelmarcodirrd"].Height = (int)((90 / 100.0 * height) - ((10 / 100.0 * height)));
//BA.debugLineNum = 145;BA.debugLine="PanelEncabezadoRD.Left = 0"[frmDirecionUSA/General script]
[views get:@"panelencabezadord"].Left = (int)(0.0);
//BA.debugLineNum = 146;BA.debugLine="PanelEncabezadoRD.Width = PanelMarcoDirRD.Width"[frmDirecionUSA/General script]
[views get:@"panelencabezadord"].Width = (int)(([views get:@"panelmarcodirrd"].Width));
//BA.debugLineNum = 147;BA.debugLine="PanelEncabezadoRD.SetTopAndBottom(0,8%y)"[frmDirecionUSA/General script]
[views get:@"panelencabezadord"].Top = (int)(0.0);
[views get:@"panelencabezadord"].Height = (int)((8 / 100.0 * height) - (0.0));
//BA.debugLineNum = 149;BA.debugLine="btnBackRd.Left = 0"[frmDirecionUSA/General script]
[views get:@"btnbackrd"].Left = (int)(0.0);
//BA.debugLineNum = 150;BA.debugLine="btnBackRd.Top = 0"[frmDirecionUSA/General script]
[views get:@"btnbackrd"].Top = (int)(0.0);
//BA.debugLineNum = 151;BA.debugLine="btnBackRd.Width = 15%x"[frmDirecionUSA/General script]
[views get:@"btnbackrd"].Width = (int)((15 / 100.0 * width));
//BA.debugLineNum = 152;BA.debugLine="btnBackRd.Height = PanelEncabezadoDir2.Height"[frmDirecionUSA/General script]
[views get:@"btnbackrd"].Height = (int)(([views get:@"panelencabezadodir2"].Height));
//BA.debugLineNum = 154;BA.debugLine="Label9.Top = 0"[frmDirecionUSA/General script]
[views get:@"label9"].Top = (int)(0.0);
//BA.debugLineNum = 155;BA.debugLine="Label9.Left=btnDireccionBack2.Right +5%x"[frmDirecionUSA/General script]
[views get:@"label9"].Left = (int)(([views get:@"btndireccionback2"].Left + [views get:@"btndireccionback2"].Width)+(5 / 100.0 * width));
//BA.debugLineNum = 156;BA.debugLine="Label9.Height = btnDireccionBack2.Height"[frmDirecionUSA/General script]
[views get:@"label9"].Height = (int)(([views get:@"btndireccionback2"].Height));
//BA.debugLineNum = 157;BA.debugLine="Label9.Width = 57%x"[frmDirecionUSA/General script]
[views get:@"label9"].Width = (int)((57 / 100.0 * width));
//BA.debugLineNum = 159;BA.debugLine="btnDeleteRD.SetTopAndBottom(0,8%y)"[frmDirecionUSA/General script]
[views get:@"btndeleterd"].Top = (int)(0.0);
[views get:@"btndeleterd"].Height = (int)((8 / 100.0 * height) - (0.0));
//BA.debugLineNum = 160;BA.debugLine="btnDeleteRD.Left = Label9.Right"[frmDirecionUSA/General script]
[views get:@"btndeleterd"].Left = (int)(([views get:@"label9"].Left + [views get:@"label9"].Width));
//BA.debugLineNum = 161;BA.debugLine="btnDeleteRD.Width = 15%x"[frmDirecionUSA/General script]
[views get:@"btndeleterd"].Width = (int)((15 / 100.0 * width));
//BA.debugLineNum = 163;BA.debugLine="Label10.Top = PanelEncabezadoRD.Bottom + 2%y"[frmDirecionUSA/General script]
[views get:@"label10"].Top = (int)(([views get:@"panelencabezadord"].Top + [views get:@"panelencabezadord"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 164;BA.debugLine="Label10.Left = 2%x"[frmDirecionUSA/General script]
[views get:@"label10"].Left = (int)((2 / 100.0 * width));
//BA.debugLineNum = 165;BA.debugLine="Label10.Height = 5%y"[frmDirecionUSA/General script]
[views get:@"label10"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 166;BA.debugLine="Label10.Width = 50%x"[frmDirecionUSA/General script]
[views get:@"label10"].Width = (int)((50 / 100.0 * width));
//BA.debugLineNum = 168;BA.debugLine="txtDireRD.Top = Label10.Bottom"[frmDirecionUSA/General script]
[views get:@"txtdirerd"].Top = (int)(([views get:@"label10"].Top + [views get:@"label10"].Height));
//BA.debugLineNum = 169;BA.debugLine="txtDireRD.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"txtdirerd"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 170;BA.debugLine="txtDireRD.Width = 90%x"[frmDirecionUSA/General script]
[views get:@"txtdirerd"].Width = (int)((90 / 100.0 * width));
//BA.debugLineNum = 171;BA.debugLine="txtDireRD.Height = 10%y"[frmDirecionUSA/General script]
[views get:@"txtdirerd"].Height = (int)((10 / 100.0 * height));
//BA.debugLineNum = 173;BA.debugLine="Label11.Top = txtDireRD.Bottom + 1%y"[frmDirecionUSA/General script]
[views get:@"label11"].Top = (int)(([views get:@"txtdirerd"].Top + [views get:@"txtdirerd"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 174;BA.debugLine="Label11.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"label11"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 175;BA.debugLine="Label11.Width = Label10.Width"[frmDirecionUSA/General script]
[views get:@"label11"].Width = (int)(([views get:@"label10"].Width));
//BA.debugLineNum = 176;BA.debugLine="Label11.Height = Label10.Height"[frmDirecionUSA/General script]
[views get:@"label11"].Height = (int)(([views get:@"label10"].Height));
//BA.debugLineNum = 178;BA.debugLine="txtSector.Top = Label11.Bottom"[frmDirecionUSA/General script]
[views get:@"txtsector"].Top = (int)(([views get:@"label11"].Top + [views get:@"label11"].Height));
//BA.debugLineNum = 179;BA.debugLine="txtSector.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"txtsector"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 180;BA.debugLine="txtSector.Width = 90%x"[frmDirecionUSA/General script]
[views get:@"txtsector"].Width = (int)((90 / 100.0 * width));
//BA.debugLineNum = 181;BA.debugLine="txtSector.Height = 6%y"[frmDirecionUSA/General script]
[views get:@"txtsector"].Height = (int)((6 / 100.0 * height));
//BA.debugLineNum = 183;BA.debugLine="Label12.Top = txtSector.Bottom + 1%y"[frmDirecionUSA/General script]
[views get:@"label12"].Top = (int)(([views get:@"txtsector"].Top + [views get:@"txtsector"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 184;BA.debugLine="Label12.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"label12"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 185;BA.debugLine="Label12.Width = Label10.Width"[frmDirecionUSA/General script]
[views get:@"label12"].Width = (int)(([views get:@"label10"].Width));
//BA.debugLineNum = 186;BA.debugLine="Label12.Height = Label10.Height"[frmDirecionUSA/General script]
[views get:@"label12"].Height = (int)(([views get:@"label10"].Height));
//BA.debugLineNum = 188;BA.debugLine="btnProvinciaCombo.Top = Label12.Bottom"[frmDirecionUSA/General script]
[views get:@"btnprovinciacombo"].Top = (int)(([views get:@"label12"].Top + [views get:@"label12"].Height));
//BA.debugLineNum = 189;BA.debugLine="btnProvinciaCombo.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"btnprovinciacombo"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 190;BA.debugLine="btnProvinciaCombo.Width = 90%x"[frmDirecionUSA/General script]
[views get:@"btnprovinciacombo"].Width = (int)((90 / 100.0 * width));
//BA.debugLineNum = 191;BA.debugLine="btnProvinciaCombo.Height = 6%y"[frmDirecionUSA/General script]
[views get:@"btnprovinciacombo"].Height = (int)((6 / 100.0 * height));
//BA.debugLineNum = 193;BA.debugLine="Label13.Top = btnProvinciaCombo.Bottom + 1%y"[frmDirecionUSA/General script]
[views get:@"label13"].Top = (int)(([views get:@"btnprovinciacombo"].Top + [views get:@"btnprovinciacombo"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 194;BA.debugLine="Label13.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"label13"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 195;BA.debugLine="Label13.Width = Label10.Width"[frmDirecionUSA/General script]
[views get:@"label13"].Width = (int)(([views get:@"label10"].Width));
//BA.debugLineNum = 196;BA.debugLine="Label13.Height = Label10.Height"[frmDirecionUSA/General script]
[views get:@"label13"].Height = (int)(([views get:@"label10"].Height));
//BA.debugLineNum = 198;BA.debugLine="txtZipCodeRD.Top = Label13.Bottom"[frmDirecionUSA/General script]
[views get:@"txtzipcoderd"].Top = (int)(([views get:@"label13"].Top + [views get:@"label13"].Height));
//BA.debugLineNum = 199;BA.debugLine="txtZipCodeRD.Left = Label10.Left"[frmDirecionUSA/General script]
[views get:@"txtzipcoderd"].Left = (int)(([views get:@"label10"].Left));
//BA.debugLineNum = 200;BA.debugLine="txtZipCodeRD.Width = 80%x"[frmDirecionUSA/General script]
[views get:@"txtzipcoderd"].Width = (int)((80 / 100.0 * width));
//BA.debugLineNum = 201;BA.debugLine="txtZipCodeRD.Height = 6%y"[frmDirecionUSA/General script]
[views get:@"txtzipcoderd"].Height = (int)((6 / 100.0 * height));
//BA.debugLineNum = 203;BA.debugLine="chPrincipalRD.Top = txtZipCodeRD.Bottom + 2%y"[frmDirecionUSA/General script]
[views get:@"chprincipalrd"].Top = (int)(([views get:@"txtzipcoderd"].Top + [views get:@"txtzipcoderd"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 204;BA.debugLine="chPrincipalRD.Left = 3%x"[frmDirecionUSA/General script]
[views get:@"chprincipalrd"].Left = (int)((3 / 100.0 * width));
//BA.debugLineNum = 205;BA.debugLine="chPrincipalRD.Height = 5%y"[frmDirecionUSA/General script]
[views get:@"chprincipalrd"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 206;BA.debugLine="chPrincipalRD.Width = 18%x"[frmDirecionUSA/General script]
[views get:@"chprincipalrd"].Width = (int)((18 / 100.0 * width));
//BA.debugLineNum = 208;BA.debugLine="Label15.Left = chPrincipalRD.Right"[frmDirecionUSA/General script]
[views get:@"label15"].Left = (int)(([views get:@"chprincipalrd"].Left + [views get:@"chprincipalrd"].Width));
//BA.debugLineNum = 209;BA.debugLine="Label15.Top = chPrincipalRD.Top - 0.5%y"[frmDirecionUSA/General script]
[views get:@"label15"].Top = (int)(([views get:@"chprincipalrd"].Top)-(0.5 / 100.0 * height));
//BA.debugLineNum = 210;BA.debugLine="Label15.Height = 5%y"[frmDirecionUSA/General script]
[views get:@"label15"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 211;BA.debugLine="Label15.Width = 70%x"[frmDirecionUSA/General script]
[views get:@"label15"].Width = (int)((70 / 100.0 * width));
//BA.debugLineNum = 213;BA.debugLine="btnAgregarDirRD.Top = chPrincipalRD.Bottom + 2%y"[frmDirecionUSA/General script]
[views get:@"btnagregardirrd"].Top = (int)(([views get:@"chprincipalrd"].Top + [views get:@"chprincipalrd"].Height)+(2 / 100.0 * height));
//BA.debugLineNum = 214;BA.debugLine="btnAgregarDirRD.SetLeftAndRight(5%x,88%x)"[frmDirecionUSA/General script]
[views get:@"btnagregardirrd"].Left = (int)((5 / 100.0 * width));
[views get:@"btnagregardirrd"].Width = (int)((88 / 100.0 * width) - ((5 / 100.0 * width)));
//BA.debugLineNum = 215;BA.debugLine="btnAgregarDirRD.Height = 8%y"[frmDirecionUSA/General script]
[views get:@"btnagregardirrd"].Height = (int)((8 / 100.0 * height));
//BA.debugLineNum = 219;BA.debugLine="PanelFondoNombreDir.SetTopAndBottom(100%y,200%y)"[frmDirecionUSA/General script]
[views get:@"panelfondonombredir"].Top = (int)((100 / 100.0 * height));
[views get:@"panelfondonombredir"].Height = (int)((200 / 100.0 * height) - ((100 / 100.0 * height)));
//BA.debugLineNum = 220;BA.debugLine="PanelFondoNombreDir.SetLeftAndRight(100%x,200%x)"[frmDirecionUSA/General script]
[views get:@"panelfondonombredir"].Left = (int)((100 / 100.0 * width));
[views get:@"panelfondonombredir"].Width = (int)((200 / 100.0 * width) - ((100 / 100.0 * width)));
//BA.debugLineNum = 222;BA.debugLine="PanelMarcoNombredir.SetTopAndBottom(35%y,65%y)"[frmDirecionUSA/General script]
[views get:@"panelmarconombredir"].Top = (int)((35 / 100.0 * height));
[views get:@"panelmarconombredir"].Height = (int)((65 / 100.0 * height) - ((35 / 100.0 * height)));
//BA.debugLineNum = 223;BA.debugLine="PanelMarcoNombredir.SetLeftAndRight(20%x,80%x)"[frmDirecionUSA/General script]
[views get:@"panelmarconombredir"].Left = (int)((20 / 100.0 * width));
[views get:@"panelmarconombredir"].Width = (int)((80 / 100.0 * width) - ((20 / 100.0 * width)));
//BA.debugLineNum = 225;BA.debugLine="Label16.Top = 4%y"[frmDirecionUSA/General script]
[views get:@"label16"].Top = (int)((4 / 100.0 * height));
//BA.debugLineNum = 226;BA.debugLine="Label16.Left = 3%x"[frmDirecionUSA/General script]
[views get:@"label16"].Left = (int)((3 / 100.0 * width));
//BA.debugLineNum = 227;BA.debugLine="Label16.Height = 5%y"[frmDirecionUSA/General script]
[views get:@"label16"].Height = (int)((5 / 100.0 * height));
//BA.debugLineNum = 228;BA.debugLine="Label16.Width = 50%x"[frmDirecionUSA/General script]
[views get:@"label16"].Width = (int)((50 / 100.0 * width));
//BA.debugLineNum = 230;BA.debugLine="txtNombreDireccion.Top = Label16.Bottom + 1%y"[frmDirecionUSA/General script]
[views get:@"txtnombredireccion"].Top = (int)(([views get:@"label16"].Top + [views get:@"label16"].Height)+(1 / 100.0 * height));
//BA.debugLineNum = 231;BA.debugLine="txtNombreDireccion.Left = Label16.Left"[frmDirecionUSA/General script]
[views get:@"txtnombredireccion"].Left = (int)(([views get:@"label16"].Left));
//BA.debugLineNum = 232;BA.debugLine="txtNombreDireccion.Width = 54%x"[frmDirecionUSA/General script]
[views get:@"txtnombredireccion"].Width = (int)((54 / 100.0 * width));
//BA.debugLineNum = 233;BA.debugLine="txtNombreDireccion.Height = 7%y"[frmDirecionUSA/General script]
[views get:@"txtnombredireccion"].Height = (int)((7 / 100.0 * height));
//BA.debugLineNum = 235;BA.debugLine="btnAceptarNombreDir.Top = txtNombreDireccion.Bottom + 4%y"[frmDirecionUSA/General script]
[views get:@"btnaceptarnombredir"].Top = (int)(([views get:@"txtnombredireccion"].Top + [views get:@"txtnombredireccion"].Height)+(4 / 100.0 * height));
//BA.debugLineNum = 236;BA.debugLine="btnAceptarNombreDir.Left = txtNombreDireccion.Left"[frmDirecionUSA/General script]
[views get:@"btnaceptarnombredir"].Left = (int)(([views get:@"txtnombredireccion"].Left));
//BA.debugLineNum = 237;BA.debugLine="btnAceptarNombreDir.Width = txtNombreDireccion.Width"[frmDirecionUSA/General script]
[views get:@"btnaceptarnombredir"].Width = (int)(([views get:@"txtnombredireccion"].Width));
//BA.debugLineNum = 238;BA.debugLine="btnAceptarNombreDir.Height = 6%y"[frmDirecionUSA/General script]
[views get:@"btnaceptarnombredir"].Height = (int)((6 / 100.0 * height));

}
@end