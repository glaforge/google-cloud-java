/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/aiplatform/v1/completion_stats.proto

package com.google.cloud.aiplatform.v1;

public final class CompletionStatsProto {
  private CompletionStatsProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CompletionStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CompletionStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/completion_"
          + "stats.proto\022\032google.cloud.aiplatform.v1\032"
          + "\037google/api/field_behavior.proto\"\230\001\n\017Com"
          + "pletionStats\022\035\n\020successful_count\030\001 \001(\003B\003"
          + "\340A\003\022\031\n\014failed_count\030\002 \001(\003B\003\340A\003\022\035\n\020incomp"
          + "lete_count\030\003 \001(\003B\003\340A\003\022,\n\037successful_fore"
          + "cast_point_count\030\005 \001(\003B\003\340A\003B\322\001\n\036com.goog"
          + "le.cloud.aiplatform.v1B\024CompletionStatsP"
          + "rotoP\001Z>cloud.google.com/go/aiplatform/a"
          + "piv1/aiplatformpb;aiplatformpb\252\002\032Google."
          + "Cloud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPla"
          + "tform\\V1\352\002\035Google::Cloud::AIPlatform::V1"
          + "b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CompletionStats_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CompletionStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CompletionStats_descriptor,
            new java.lang.String[] {
              "SuccessfulCount", "FailedCount", "IncompleteCount", "SuccessfulForecastPointCount",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
