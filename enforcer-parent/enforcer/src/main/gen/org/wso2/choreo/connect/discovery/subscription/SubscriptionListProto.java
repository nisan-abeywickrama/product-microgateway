// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/subscription_list.proto

package org.wso2.choreo.connect.discovery.subscription;

public final class SubscriptionListProto {
  private SubscriptionListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_SubscriptionList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_SubscriptionList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n3wso2/discovery/subscription/subscripti" +
      "on_list.proto\022\033wso2.discovery.subscripti" +
      "on\032.wso2/discovery/subscription/subscrip" +
      "tion.proto\"K\n\020SubscriptionList\0227\n\004list\030\002" +
      " \003(\0132).wso2.discovery.subscription.Subsc" +
      "riptionB\232\001\n.org.wso2.choreo.connect.disc" +
      "overy.subscriptionB\025SubscriptionListProt" +
      "oP\001ZOgithub.com/envoyproxy/go-control-pl" +
      "ane/wso2/discovery/subscription;subscrip" +
      "tionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.choreo.connect.discovery.subscription.SubscriptionProto.getDescriptor(),
        });
    internal_static_wso2_discovery_subscription_SubscriptionList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_subscription_SubscriptionList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_SubscriptionList_descriptor,
        new java.lang.String[] { "List", });
    org.wso2.choreo.connect.discovery.subscription.SubscriptionProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}