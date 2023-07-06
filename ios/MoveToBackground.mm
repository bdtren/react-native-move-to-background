#import <React/RCTBridgeModule.h>

@interface RCT_EXTERN_MODULE(MoveToBackground, NSObject)

RCT_EXTERN_METHOD(moveToBackground:(RCTPromiseResolveBlock)resolve
                 withRejecter:(RCTPromiseRejectBlock)reject)

+ (BOOL)requiresMainQueueSetup
{
  return NO;
}

@end
