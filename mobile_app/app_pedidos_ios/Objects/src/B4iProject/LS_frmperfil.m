
#import "iCore.h"
@interface LS_frmperfil:NSObject
@end

@implementation LS_frmperfil

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondouser"].Top = (int)(0.0);
[views get:@"panelfondouser"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondouser"].Left = (int)(0.0);
[views get:@"panelfondouser"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadouser"].Top = (int)(0.0);
[views get:@"panelencabezadouser"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"panelencabezadouser"].Left = (int)(0.0);
[views get:@"panelencabezadouser"].Width = (int)((100 / 100.0 * height) - (0.0));
[views get:@"btnperfilback"].Left = (int)(0.0);
[views get:@"btnperfilback"].Top = (int)(0.0);
[views get:@"btnperfilback"].Width = (int)((15 / 100.0 * width));
[views get:@"btnperfilback"].Height = (int)(([views get:@"panelencabezadouser"].Height));
[views get:@"label1"].Left = (int)((18 / 100.0 * width));
[views get:@"label1"].Top = (int)(0.0);
[views get:@"label1"].Height = (int)(([views get:@"panelencabezadouser"].Height));
[views get:@"label1"].Width = (int)((80 / 100.0 * width));
[views get:@"label6"].Left = (int)((2 / 100.0 * width));
[views get:@"label6"].Top = (int)(([views get:@"panelencabezadouser"].Top + [views get:@"panelencabezadouser"].Height)+(1 / 100.0 * height));
[views get:@"label6"].Width = (int)((96 / 100.0 * width));
[views get:@"label6"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Left = (int)(([views get:@"label6"].Left));
[views get:@"label2"].Top = (int)(([views get:@"label6"].Top + [views get:@"label6"].Height)+(5 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((23 / 100.0 * width));
[views get:@"label3"].Left = (int)(([views get:@"label6"].Left));
[views get:@"label3"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height)+(5 / 100.0 * height));
[views get:@"label3"].Height = (int)((5 / 100.0 * height));
[views get:@"label3"].Width = (int)(([views get:@"label2"].Width));
[views get:@"label4"].Left = (int)(([views get:@"label6"].Left));
[views get:@"label4"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height)+(5 / 100.0 * height));
[views get:@"label4"].Height = (int)((5 / 100.0 * height));
[views get:@"label4"].Width = (int)(([views get:@"label2"].Width));
[views get:@"label5"].Left = (int)(([views get:@"label6"].Left));
[views get:@"label5"].Top = (int)(([views get:@"label4"].Top + [views get:@"label4"].Height)+(5 / 100.0 * height));
[views get:@"label5"].Height = (int)((5 / 100.0 * height));
[views get:@"label5"].Width = (int)(([views get:@"label2"].Width)+(2 / 100.0 * width));
[views get:@"panelnombre"].Left = (int)((27 / 100.0 * width));
[views get:@"panelnombre"].Top = (int)(([views get:@"label2"].Top));
[views get:@"panelnombre"].Height = (int)((5 / 100.0 * height));
[views get:@"panelnombre"].Width = (int)((71 / 100.0 * width));
[views get:@"txtnombre"].Left = (int)((1 / 100.0 * width));
[views get:@"txtnombre"].Top = (int)(0.0);
[views get:@"txtnombre"].Width = (int)(([views get:@"panelnombre"].Width)-(2 / 100.0 * width));
[views get:@"txtnombre"].Height = (int)(([views get:@"panelnombre"].Height)+(2 / 100.0 * height));
[views get:@"panelemail"].Left = (int)(([views get:@"panelnombre"].Left));
[views get:@"panelemail"].Top = (int)(([views get:@"label3"].Top));
[views get:@"panelemail"].Height = (int)(([views get:@"panelnombre"].Height));
[views get:@"panelemail"].Width = (int)(([views get:@"panelnombre"].Width));
[views get:@"lblemail"].Left = (int)((2 / 100.0 * width));
[views get:@"lblemail"].Top = (int)(0.0);
[views get:@"lblemail"].Width = (int)(([views get:@"panelemail"].Width)-(4 / 100.0 * width));
[views get:@"lblemail"].Height = (int)(([views get:@"panelemail"].Height));
[views get:@"paneltel"].Left = (int)(([views get:@"panelnombre"].Left));
[views get:@"paneltel"].Top = (int)(([views get:@"label4"].Top));
[views get:@"paneltel"].Height = (int)(([views get:@"panelnombre"].Height));
[views get:@"paneltel"].Width = (int)(([views get:@"panelnombre"].Width));
[views get:@"txttel"].Left = (int)((1 / 100.0 * width));
[views get:@"txttel"].Top = (int)(0.0);
[views get:@"txttel"].Width = (int)(([views get:@"paneltel"].Width)-(2 / 100.0 * width));
[views get:@"txttel"].Height = (int)(([views get:@"paneltel"].Height)+(2 / 100.0 * height));
[views get:@"paneldir"].Left = (int)(([views get:@"panelnombre"].Left));
[views get:@"paneldir"].Top = (int)(([views get:@"label5"].Top));
[views get:@"paneldir"].Height = (int)(([views get:@"panelnombre"].Height));
[views get:@"paneldir"].Width = (int)(([views get:@"panelnombre"].Width));
[views get:@"txtdir"].Left = (int)((1 / 100.0 * width));
[views get:@"txtdir"].Top = (int)(0.0);
[views get:@"txtdir"].Width = (int)(([views get:@"paneldir"].Width)-(2 / 100.0 * width));
[views get:@"txtdir"].Height = (int)(([views get:@"paneldir"].Height)+(2 / 100.0 * height));
[views get:@"btnchangepass"].Top = (int)(([views get:@"paneldir"].Top + [views get:@"paneldir"].Height)+(10 / 100.0 * height));
[views get:@"btnchangepass"].Left = (int)((10 / 100.0 * width));
[views get:@"btnchangepass"].Width = (int)((90 / 100.0 * width) - ((10 / 100.0 * width)));
[views get:@"btnchangepass"].Height = (int)((8 / 100.0 * height));
[views get:@"btnsave"].Left = (int)((5 / 100.0 * width));
[views get:@"btnsave"].Width = (int)((95 / 100.0 * width) - ((5 / 100.0 * width)));
[views get:@"btnsave"].Top = (int)(([views get:@"btnchangepass"].Top + [views get:@"btnchangepass"].Height)+(15 / 100.0 * height));
[views get:@"btnsave"].Height = (int)((8 / 100.0 * height));
[views get:@"panelfondomodalpass"].Top = (int)(0.0);
[views get:@"panelfondomodalpass"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelfondomodalpass"].Left = (int)((100 / 100.0 * width));
[views get:@"panelfondomodalpass"].Width = (int)((200 / 100.0 * width) - ((100 / 100.0 * width)));
[views get:@"panelmarcopass"].Top = (int)((20 / 100.0 * height));
[views get:@"panelmarcopass"].Height = (int)((80 / 100.0 * height) - ((20 / 100.0 * height)));
[views get:@"panelmarcopass"].Left = (int)((5 / 100.0 * width));
[views get:@"panelmarcopass"].Width = (int)((95 / 100.0 * width) - ((5 / 100.0 * width)));
[views get:@"label7"].Top = (int)((3 / 100.0 * height));
[views get:@"label7"].Left = (int)((2 / 100.0 * width));
[views get:@"label7"].Width = (int)((89 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"label7"].Height = (int)((5 / 100.0 * height));
[views get:@"panelant"].Top = (int)(([views get:@"label7"].Top + [views get:@"label7"].Height)+(1 / 100.0 * height));
[views get:@"panelant"].Left = (int)(([views get:@"label7"].Left));
[views get:@"panelant"].Width = (int)(([views get:@"label7"].Width));
[views get:@"panelant"].Height = (int)((6 / 100.0 * height));
[views get:@"txtpassantigua"].Left = (int)((1 / 100.0 * width));
[views get:@"txtpassantigua"].Top = (int)(0.0);
[views get:@"txtpassantigua"].Height = (int)(([views get:@"panelant"].Height)+(2 / 100.0 * height));
[views get:@"txtpassantigua"].Width = (int)(([views get:@"panelant"].Width)-(2 / 100.0 * width));
[views get:@"label8"].Top = (int)(([views get:@"panelant"].Top + [views get:@"panelant"].Height)+(2 / 100.0 * height));
[views get:@"label8"].Left = (int)((2 / 100.0 * width));
[views get:@"label8"].Width = (int)((89 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"label8"].Height = (int)((5 / 100.0 * height));
[views get:@"panelnewpass"].Top = (int)(([views get:@"label8"].Top + [views get:@"label8"].Height)+(1 / 100.0 * height));
[views get:@"panelnewpass"].Left = (int)(([views get:@"label8"].Left));
[views get:@"panelnewpass"].Width = (int)(([views get:@"label8"].Width));
[views get:@"panelnewpass"].Height = (int)(([views get:@"panelant"].Height));
[views get:@"txtnewpass"].Left = (int)((1 / 100.0 * width));
[views get:@"txtnewpass"].Top = (int)(0.0);
[views get:@"txtnewpass"].Height = (int)(([views get:@"panelnewpass"].Height)+(2 / 100.0 * height));
[views get:@"txtnewpass"].Width = (int)(([views get:@"panelnewpass"].Width)-(2 / 100.0 * width));
[views get:@"label9"].Top = (int)(([views get:@"panelnewpass"].Top + [views get:@"panelnewpass"].Height)+(2 / 100.0 * height));
[views get:@"label9"].Left = (int)((2 / 100.0 * width));
[views get:@"label9"].Width = (int)((89 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"label9"].Height = (int)((5 / 100.0 * height));
[views get:@"panelconfirm"].Top = (int)(([views get:@"label9"].Top + [views get:@"label9"].Height)+(1 / 100.0 * height));
[views get:@"panelconfirm"].Left = (int)(([views get:@"label9"].Left));
[views get:@"panelconfirm"].Width = (int)(([views get:@"label9"].Width));
[views get:@"panelconfirm"].Height = (int)(([views get:@"panelant"].Height));
[views get:@"txtpassconfirm"].Left = (int)((1 / 100.0 * width));
[views get:@"txtpassconfirm"].Top = (int)(0.0);
[views get:@"txtpassconfirm"].Height = (int)(([views get:@"panelconfirm"].Height)+(2 / 100.0 * height));
[views get:@"txtpassconfirm"].Width = (int)(([views get:@"panelconfirm"].Width)-(2 / 100.0 * width));
[views get:@"btnbackchangepass"].Left = (int)((2 / 100.0 * width));
[views get:@"btnbackchangepass"].Top = (int)(([views get:@"panelconfirm"].Top + [views get:@"panelconfirm"].Height)+(5 / 100.0 * height));
[views get:@"btnbackchangepass"].Height = (int)((8 / 100.0 * height));
[views get:@"btnbackchangepass"].Width = (int)((42 / 100.0 * width));
[views get:@"btnconfirmchangepass"].Left = (int)((46 / 100.0 * width));
[views get:@"btnconfirmchangepass"].Top = (int)(([views get:@"btnbackchangepass"].Top));
[views get:@"btnconfirmchangepass"].Height = (int)(([views get:@"btnbackchangepass"].Height));
[views get:@"btnconfirmchangepass"].Width = (int)(([views get:@"btnbackchangepass"].Width));

}
@end