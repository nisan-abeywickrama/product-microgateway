// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/subscription_policy.proto

package org.wso2.choreo.connect.discovery.subscription;

public final class SubscriptionPolicyProto {
  private SubscriptionPolicyProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_SubscriptionPolicy_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_SubscriptionPolicy_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n5wso2/discovery/subscription/subscripti" +
      "on_policy.proto\022\033wso2.discovery.subscrip" +
      "tion\"\226\002\n\022SubscriptionPolicy\022\n\n\002id\030\001 \001(\005\022" +
      "\020\n\010tenantId\030\002 \001(\005\022\014\n\004name\030\003 \001(\t\022\021\n\tquota" +
      "Type\030\004 \001(\t\022\034\n\024graphQLMaxComplexity\030\005 \001(\005" +
      "\022\027\n\017graphQLMaxDepth\030\006 \001(\005\022\026\n\016rateLimitCo" +
      "unt\030\007 \001(\005\022\031\n\021rateLimitTimeUnit\030\010 \001(\t\022\030\n\020" +
      "stopOnQuotaReach\030\t \001(\010\022\024\n\014tenantDomain\030\n" +
      " \001(\t\022\021\n\ttimestamp\030\013 \001(\003\022\024\n\014organization\030" +
      "\014 \001(\tB\234\001\n.org.wso2.choreo.connect.discov" +
      "ery.subscriptionB\027SubscriptionPolicyProt" +
      "oP\001ZOgithub.com/envoyproxy/go-control-pl" +
      "ane/wso2/discovery/subscription;subscrip" +
      "tionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
        });
    internal_static_wso2_discovery_subscription_SubscriptionPolicy_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_subscription_SubscriptionPolicy_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_SubscriptionPolicy_descriptor,
        new java.lang.String[] { "Id", "TenantId", "Name", "QuotaType", "GraphQLMaxComplexity", "GraphQLMaxDepth", "RateLimitCount", "RateLimitTimeUnit", "StopOnQuotaReach", "TenantDomain", "Timestamp", "Organization", });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
