// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: wso2/discovery/subscription/application_key_mapping_list.proto

package org.wso2.choreo.connect.discovery.subscription;

public final class ApplicationKeyMappingListProto {
  private ApplicationKeyMappingListProto() {}
  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistryLite registry) {
  }

  public static void registerAllExtensions(
      com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions(
        (com.google.protobuf.ExtensionRegistryLite) registry);
  }
  static final com.google.protobuf.Descriptors.Descriptor
    internal_static_wso2_discovery_subscription_ApplicationKeyMappingList_descriptor;
  static final 
    com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_wso2_discovery_subscription_ApplicationKeyMappingList_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor
      getDescriptor() {
    return descriptor;
  }
  private static  com.google.protobuf.Descriptors.FileDescriptor
      descriptor;
  static {
    java.lang.String[] descriptorData = {
      "\n>wso2/discovery/subscription/applicatio" +
      "n_key_mapping_list.proto\022\033wso2.discovery" +
      ".subscription\0329wso2/discovery/subscripti" +
      "on/application_key_mapping.proto\"]\n\031Appl" +
      "icationKeyMappingList\022@\n\004list\030\002 \003(\01322.ws" +
      "o2.discovery.subscription.ApplicationKey" +
      "MappingB\243\001\n.org.wso2.choreo.connect.disc" +
      "overy.subscriptionB\036ApplicationKeyMappin" +
      "gListProtoP\001ZOgithub.com/envoyproxy/go-c" +
      "ontrol-plane/wso2/discovery/subscription" +
      ";subscriptionb\006proto3"
    };
    descriptor = com.google.protobuf.Descriptors.FileDescriptor
      .internalBuildGeneratedFileFrom(descriptorData,
        new com.google.protobuf.Descriptors.FileDescriptor[] {
          org.wso2.choreo.connect.discovery.subscription.ApplicationKeyMappingProto.getDescriptor(),
        });
    internal_static_wso2_discovery_subscription_ApplicationKeyMappingList_descriptor =
      getDescriptor().getMessageTypes().get(0);
    internal_static_wso2_discovery_subscription_ApplicationKeyMappingList_fieldAccessorTable = new
      com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
        internal_static_wso2_discovery_subscription_ApplicationKeyMappingList_descriptor,
        new java.lang.String[] { "List", });
    org.wso2.choreo.connect.discovery.subscription.ApplicationKeyMappingProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}