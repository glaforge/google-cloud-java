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
// source: google/cloud/securitycenter/v2/application.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public final class ApplicationProto {
  private ApplicationProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_securitycenter_v2_Application_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_securitycenter_v2_Application_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n0google/cloud/securitycenter/v2/applica"
          + "tion.proto\022\036google.cloud.securitycenter."
          + "v2\"1\n\013Application\022\020\n\010base_uri\030\001 \001(\t\022\020\n\010f"
          + "ull_uri\030\002 \001(\tB\352\001\n\"com.google.cloud.secur"
          + "itycenter.v2B\020ApplicationProtoP\001ZJcloud."
          + "google.com/go/securitycenter/apiv2/secur"
          + "itycenterpb;securitycenterpb\252\002\036Google.Cl"
          + "oud.SecurityCenter.V2\312\002\036Google\\Cloud\\Sec"
          + "urityCenter\\V2\352\002!Google::Cloud::Security"
          + "Center::V2b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_securitycenter_v2_Application_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_securitycenter_v2_Application_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_securitycenter_v2_Application_descriptor,
            new java.lang.String[] {
              "BaseUri", "FullUri",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
