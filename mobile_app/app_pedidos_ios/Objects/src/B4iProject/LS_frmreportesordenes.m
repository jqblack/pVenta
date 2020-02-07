
#import "iCore.h"
@interface LS_frmreportesordenes:NSObject
@end

@implementation LS_frmreportesordenes

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panelfondoreportes"].Left = (int)(0.0);
[views get:@"panelfondoreportes"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelfondoreportes"].Top = (int)(0.0);
[views get:@"panelfondoreportes"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelencabezadorepo"].Left = (int)(0.0);
[views get:@"panelencabezadorepo"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelencabezadorepo"].Top = (int)(0.0);
[views get:@"panelencabezadorepo"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"btnreporteback"].Left = (int)(0.0);
[views get:@"btnreporteback"].Top = (int)(0.0);
[views get:@"btnreporteback"].Height = (int)(([views get:@"panelencabezadorepo"].Height));
[views get:@"btnreporteback"].Width = (int)((15 / 100.0 * width));
[views get:@"label4"].Left = (int)(([views get:@"btnreporteback"].Left + [views get:@"btnreporteback"].Width));
[views get:@"label4"].Height = (int)(([views get:@"panelencabezadorepo"].Height));
[views get:@"label4"].Width = (int)(([views get:@"panelencabezadorepo"].Width)-([views get:@"label4"].Left));
[views get:@"label4"].Top = (int)(0.0);
[views get:@"label2"].Top = (int)(([views get:@"panelencabezadorepo"].Top + [views get:@"panelencabezadorepo"].Height)+(1 / 100.0 * height));
[views get:@"label2"].Height = (int)((5 / 100.0 * height));
[views get:@"label2"].Width = (int)((30 / 100.0 * width));
[views get:@"label2"].Left = (int)((3 / 100.0 * width));
[views get:@"panel1"].Left = (int)(([views get:@"label2"].Left + [views get:@"label2"].Width)+(4 / 100.0 * width));
[views get:@"panel1"].Top = (int)(([views get:@"label2"].Top));
[views get:@"panel1"].Width = (int)((60 / 100.0 * width));
[views get:@"panel1"].Height = (int)(([views get:@"label2"].Height));
[views get:@"lblfechainicio"].Left = (int)(0.0);
[views get:@"lblfechainicio"].Top = (int)(0.0);
[views get:@"lblfechainicio"].Width = (int)(([views get:@"panel1"].Width));
[views get:@"lblfechainicio"].Height = (int)(([views get:@"panel1"].Height));
[views get:@"label5"].Left = (int)(([views get:@"label2"].Left));
[views get:@"label5"].Top = (int)(([views get:@"label2"].Top + [views get:@"label2"].Height)+(1 / 100.0 * height));
[views get:@"label5"].Width = (int)(([views get:@"label2"].Width));
[views get:@"label5"].Height = (int)(([views get:@"label2"].Height));
[views get:@"panel3"].Left = (int)(([views get:@"label5"].Left + [views get:@"label5"].Width)+(4 / 100.0 * width));
[views get:@"panel3"].Top = (int)(([views get:@"label5"].Top));
[views get:@"panel3"].Width = (int)((60 / 100.0 * width));
[views get:@"panel3"].Height = (int)(([views get:@"label5"].Height));
[views get:@"lblfechafinal"].Left = (int)(0.0);
[views get:@"lblfechafinal"].Top = (int)(0.0);
[views get:@"lblfechafinal"].Width = (int)(([views get:@"panel3"].Width));
[views get:@"lblfechafinal"].Height = (int)(([views get:@"panel3"].Height));
[views get:@"label3"].Top = (int)(([views get:@"label5"].Top + [views get:@"label5"].Height)+(3.5 / 100.0 * height));
[views get:@"label3"].Height = (int)((5 / 100.0 * height));
[views get:@"label3"].Left = (int)(([views get:@"label5"].Left));
[views get:@"label3"].Width = (int)((100 / 100.0 * width)-([views get:@"label3"].Left)*2.0);
[views get:@"panel2"].Top = (int)(([views get:@"label3"].Top + [views get:@"label3"].Height));
[views get:@"panel2"].Width = (int)(([views get:@"label3"].Width));
[views get:@"panel2"].Height = (int)((59 / 100.0 * height));
[views get:@"panel2"].Left = (int)(([views get:@"label3"].Left));
[views get:@"listaordenes"].Top = (int)((2 / 100.0 * height));
[views get:@"listaordenes"].Left = (int)((0 / 100.0 * height));
[views get:@"listaordenes"].Width = (int)(([views get:@"panel2"].Width));
[views get:@"listaordenes"].Height = (int)(([views get:@"panel2"].Height));
[views get:@"btnbuscarreporte"].Left = (int)(([views get:@"panel2"].Left));
[views get:@"btnbuscarreporte"].Height = (int)((7 / 100.0 * height));
[views get:@"btnbuscarreporte"].Top = (int)(([views get:@"panel2"].Top + [views get:@"panel2"].Height)+(3 / 100.0 * height));
[views get:@"btnbuscarreporte"].Width = (int)(([views get:@"panel2"].Width));
[views get:@"panelfondodatepicker"].Left = (int)((100 / 100.0 * width));
[views get:@"panelfondodatepicker"].Width = (int)((200 / 100.0 * width) - ((100 / 100.0 * width)));
[views get:@"panelfondodatepicker"].Top = (int)(0.0);
[views get:@"panelfondodatepicker"].Height = (int)((100 / 100.0 * height) - (0.0));
[views get:@"panelmarcodate"].Left = (int)((2 / 100.0 * width));
[views get:@"panelmarcodate"].Width = (int)((98 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"panelmarcodate"].Top = (int)((30 / 100.0 * height));
[views get:@"panelmarcodate"].Height = (int)((46 / 100.0 * height));
[views get:@"datefecha"].Left = (int)(0.0);
[views get:@"datefecha"].Width = (int)((96 / 100.0 * width) - (0.0));
[views get:@"datefecha"].Top = (int)(0.0);
[views get:@"datefecha"].Height = (int)((33 / 100.0 * height));
[views get:@"btnaceptardate"].Left = (int)((2 / 100.0 * width));
[views get:@"btnaceptardate"].Top = (int)(([views get:@"datefecha"].Top + [views get:@"datefecha"].Height)+(1 / 100.0 * height));
[views get:@"btnaceptardate"].Width = (int)((44 / 100.0 * width));
[views get:@"btnaceptardate"].Height = (int)((8 / 100.0 * height));
[views get:@"btncancelardate"].Left = (int)((50 / 100.0 * width));
[views get:@"btncancelardate"].Top = (int)(([views get:@"btnaceptardate"].Top));
[views get:@"btncancelardate"].Width = (int)(([views get:@"btnaceptardate"].Width));
[views get:@"btncancelardate"].Height = (int)(([views get:@"btnaceptardate"].Height));
[views get:@"panelfondodetalleorden"].Left = (int)(0.0);
[views get:@"panelfondodetalleorden"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelfondodetalleorden"].Top = (int)((100 / 100.0 * height));
[views get:@"panelfondodetalleorden"].Height = (int)((200 / 100.0 * height) - ((100 / 100.0 * height)));
[views get:@"panelmarcoproorden"].Top = (int)((5 / 100.0 * height));
[views get:@"panelmarcoproorden"].Height = (int)((95 / 100.0 * height) - ((5 / 100.0 * height)));
[views get:@"panelmarcoproorden"].Left = (int)((5 / 100.0 * width));
[views get:@"panelmarcoproorden"].Width = (int)((95 / 100.0 * width) - ((5 / 100.0 * width)));
[views get:@"panelencabezadom"].Left = (int)((0 / 100.0 * width));
[views get:@"panelencabezadom"].Width = (int)((90 / 100.0 * width) - ((0 / 100.0 * width)));
[views get:@"panelencabezadom"].Top = (int)(0.0);
[views get:@"panelencabezadom"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"lbltituloproorden"].Top = (int)(0.0);
[views get:@"lbltituloproorden"].Height = (int)((8 / 100.0 * height) - (0.0));
[views get:@"lbltituloproorden"].Left = (int)(0.0);
[views get:@"lbltituloproorden"].Width = (int)((90 / 100.0 * width) - (0.0));
[views get:@"listproordendetalle"].Left = (int)((2 / 100.0 * width));
[views get:@"listproordendetalle"].Width = (int)((88 / 100.0 * width) - ((2 / 100.0 * width)));
[views get:@"listproordendetalle"].Top = (int)(([views get:@"panelencabezadom"].Top + [views get:@"panelencabezadom"].Height)+(1 / 100.0 * height));
[views get:@"listproordendetalle"].Height = (int)((78 / 100.0 * height) - (([views get:@"panelencabezadom"].Top + [views get:@"panelencabezadom"].Height)+(1 / 100.0 * height)));
[views get:@"btnbackproorden"].Left = (int)((2 / 100.0 * width));
[views get:@"btnbackproorden"].Width = (int)((41 / 100.0 * width));
[views get:@"btnbackproorden"].Top = (int)(([views get:@"listproordendetalle"].Top + [views get:@"listproordendetalle"].Height)+(2 / 100.0 * height));
[views get:@"btnbackproorden"].Height = (int)((8 / 100.0 * height));
[views get:@"btnaddallproorden"].Left = (int)(([views get:@"btnbackproorden"].Left + [views get:@"btnbackproorden"].Width)+(4 / 100.0 * width));
[views get:@"btnaddallproorden"].Top = (int)(([views get:@"btnbackproorden"].Top));
[views get:@"btnaddallproorden"].Width = (int)(([views get:@"btnbackproorden"].Width));
[views get:@"btnaddallproorden"].Height = (int)(([views get:@"btnbackproorden"].Height));

}
@end