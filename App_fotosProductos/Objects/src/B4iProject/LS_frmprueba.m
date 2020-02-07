
#import "iCore.h"
@interface LS_frmprueba:NSObject
@end

@implementation LS_frmprueba

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];
[views get:@"panel1"].Left = (int)(0.0);
[views get:@"panel1"].Width = (int)((100 / 100.0 * width) - (0.0));
[views get:@"panel1"].Top = (int)(0.0);
[views get:@"panel1"].Height = (int)((100 / 100.0 * height) - (0.0));

}
@end