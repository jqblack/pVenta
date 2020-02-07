
#import "iCore.h"
@interface LS_frmleft:NSObject
@end

@implementation LS_frmleft

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"paneluser"].Top = (int)(0.0);
[views get:@"paneluser"].Height = (int)((15 / 100.0 * height) - (0.0));
[views get:@"paneluser"].Left = (int)(0.0);
[views get:@"paneluser"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"imageuser"].Left = (int)((3 / 100.0 * width));
[views get:@"imageuser"].Top = (int)((5 / 100.0 * height));
[views get:@"imageuser"].Width = (int)((15 / 100.0 * width));
[views get:@"imageuser"].Height = (int)((7 / 100.0 * height));
[views get:@"lblnombreuser"].Left = (int)(([views get:@"imageuser"].Left + [views get:@"imageuser"].Width)+(3 / 100.0 * width));
[views get:@"lblnombreuser"].Top = (int)((4 / 100.0 * height));
[views get:@"lblnombreuser"].Width = (int)((65 / 100.0 * width));
[views get:@"lblnombreuser"].Height = (int)((5 / 100.0 * height));
[views get:@"lblemailuser"].Left = (int)(([views get:@"lblnombreuser"].Left));
[views get:@"lblemailuser"].Top = (int)(([views get:@"lblnombreuser"].Top + [views get:@"lblnombreuser"].Height));
[views get:@"lblemailuser"].Width = (int)(([views get:@"lblnombreuser"].Width));
[views get:@"lblemailuser"].Height = (int)(([views get:@"lblnombreuser"].Height));
[views get:@"panelslide"].Top = (int)(([views get:@"paneluser"].Top + [views get:@"paneluser"].Height));
[views get:@"panelslide"].Left = (int)(0.0);
[views get:@"panelslide"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panelslide"].Height = (int)((85 / 100.0 * height));

}
@end