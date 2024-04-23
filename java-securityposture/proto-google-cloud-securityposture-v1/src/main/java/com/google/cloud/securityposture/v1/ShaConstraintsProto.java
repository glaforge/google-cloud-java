/*
 * Copyright 2024 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: google/cloud/securityposture/v1/sha_constraints.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securityposture.v1;

public final class ShaConstraintsProto {
  private ShaConstraintsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsCustomModule_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsCustomModule_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n5google/cloud/securityposture/v1/sha_co"
          + "nstraints.proto\022\037google.cloud.securitypo"
          + "sture.v1\032\037google/api/field_behavior.prot"
          + "o\0327google/cloud/securityposture/v1/sha_c"
          + "ustom_config.proto\"\214\001\n\035SecurityHealthAna"
          + "lyticsModule\022\030\n\013module_name\030\001 \001(\tB\003\340A\002\022Q"
          + "\n\027module_enablement_state\030\002 \001(\01620.google"
          + ".cloud.securityposture.v1.EnablementStat"
          + "e\"\353\001\n#SecurityHealthAnalyticsCustomModul"
          + "e\022\022\n\002id\030\001 \001(\tB\006\340A\005\340A\003\022\031\n\014display_name\030\002 "
          + "\001(\tB\003\340A\001\022B\n\006config\030\003 \001(\0132-.google.cloud."
          + "securityposture.v1.CustomConfigB\003\340A\002\022Q\n\027"
          + "module_enablement_state\030\004 \001(\01620.google.c"
          + "loud.securityposture.v1.EnablementState*"
          + "N\n\017EnablementState\022 \n\034ENABLEMENT_STATE_U"
          + "NSPECIFIED\020\000\022\013\n\007ENABLED\020\001\022\014\n\010DISABLED\020\002B"
          + "\213\001\n#com.google.cloud.securityposture.v1B"
          + "\023ShaConstraintsProtoP\001ZMcloud.google.com"
          + "/go/securityposture/apiv1/securitypostur"
          + "epb;securityposturepbb\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.securityposture.v1.ShaCustomConfigProto.getDescriptor(),
            });
    internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsModule_descriptor,
            new java.lang.String[] {
              "ModuleName", "ModuleEnablementState",
            });
    internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsCustomModule_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsCustomModule_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securityposture_v1_SecurityHealthAnalyticsCustomModule_descriptor,
            new java.lang.String[] {
              "Id", "DisplayName", "Config", "ModuleEnablementState",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.securityposture.v1.ShaCustomConfigProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
