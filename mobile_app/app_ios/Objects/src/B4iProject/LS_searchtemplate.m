
#import "iCore.h"
@interface LS_searchtemplate:NSObject
@end

@implementation LS_searchtemplate

- (void)LS_general:(B4ILayoutData*)views :(int)width :(int)height{
[B4ILayoutBuilder setScaleRate:0.3];
[B4ILayoutBuilder scaleAll:views :width :height];

}
@end