//
//  Generated file. Do not edit.
//

// clang-format off

#import "GeneratedPluginRegistrant.h"

#if __has_include(<agconnect_auth/AGConnectAuthPlugin.h>)
#import <agconnect_auth/AGConnectAuthPlugin.h>
#else
@import agconnect_auth;
#endif

#if __has_include(<agconnect_clouddb/AGConnectCloudDBPlugin.h>)
#import <agconnect_clouddb/AGConnectCloudDBPlugin.h>
#else
@import agconnect_clouddb;
#endif

#if __has_include(<integration_test/IntegrationTestPlugin.h>)
#import <integration_test/IntegrationTestPlugin.h>
#else
@import integration_test;
#endif

@implementation GeneratedPluginRegistrant

+ (void)registerWithRegistry:(NSObject<FlutterPluginRegistry>*)registry {
  [AGConnectAuthPlugin registerWithRegistrar:[registry registrarForPlugin:@"AGConnectAuthPlugin"]];
  [AGConnectCloudDBPlugin registerWithRegistrar:[registry registrarForPlugin:@"AGConnectCloudDBPlugin"]];
  [IntegrationTestPlugin registerWithRegistrar:[registry registrarForPlugin:@"IntegrationTestPlugin"]];
}

@end
