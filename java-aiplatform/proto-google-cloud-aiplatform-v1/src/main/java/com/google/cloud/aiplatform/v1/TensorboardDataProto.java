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
// source: google/cloud/aiplatform/v1/tensorboard_data.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class TensorboardDataProto {
  private TensorboardDataProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TimeSeriesData_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TimeSeriesData_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TimeSeriesDataPoint_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TimeSeriesDataPoint_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Scalar_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Scalar_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardTensor_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardTensor_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardBlobSequence_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardBlobSequence_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_TensorboardBlob_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_TensorboardBlob_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n1google/cloud/aiplatform/v1/tensorboard"
          + "_data.proto\022\032google.cloud.aiplatform.v1\032"
          + "\037google/api/field_behavior.proto\0328google"
          + "/cloud/aiplatform/v1/tensorboard_time_se"
          + "ries.proto\032\037google/protobuf/timestamp.pr"
          + "oto\"\330\001\n\016TimeSeriesData\022\'\n\032tensorboard_ti"
          + "me_series_id\030\001 \001(\tB\003\340A\002\022W\n\nvalue_type\030\002 "
          + "\001(\0162;.google.cloud.aiplatform.v1.Tensorb"
          + "oardTimeSeries.ValueTypeB\006\340A\002\340A\005\022D\n\006valu"
          + "es\030\003 \003(\0132/.google.cloud.aiplatform.v1.Ti"
          + "meSeriesDataPointB\003\340A\002\"\230\002\n\023TimeSeriesDat"
          + "aPoint\0224\n\006scalar\030\003 \001(\0132\".google.cloud.ai"
          + "platform.v1.ScalarH\000\022?\n\006tensor\030\004 \001(\0132-.g"
          + "oogle.cloud.aiplatform.v1.TensorboardTen"
          + "sorH\000\022D\n\005blobs\030\005 \001(\01323.google.cloud.aipl"
          + "atform.v1.TensorboardBlobSequenceH\000\022-\n\tw"
          + "all_time\030\001 \001(\0132\032.google.protobuf.Timesta"
          + "mp\022\014\n\004step\030\002 \001(\003B\007\n\005value\"\027\n\006Scalar\022\r\n\005v"
          + "alue\030\001 \001(\001\"D\n\021TensorboardTensor\022\022\n\005value"
          + "\030\001 \001(\014B\003\340A\002\022\033\n\016version_number\030\002 \001(\005B\003\340A\001"
          + "\"V\n\027TensorboardBlobSequence\022;\n\006values\030\001 "
          + "\003(\0132+.google.cloud.aiplatform.v1.Tensorb"
          + "oardBlob\"5\n\017TensorboardBlob\022\017\n\002id\030\001 \001(\tB"
          + "\003\340A\003\022\021\n\004data\030\002 \001(\014B\003\340A\001B\322\001\n\036com.google.c"
          + "loud.aiplatform.v1B\024TensorboardDataProto"
          + "P\001Z>cloud.google.com/go/aiplatform/apiv1"
          + "/aiplatformpb;aiplatformpb\252\002\032Google.Clou"
          + "d.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfor"
          + "m\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006pr"
          + "oto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.TensorboardTimeSeriesProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_TimeSeriesData_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_TimeSeriesData_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TimeSeriesData_descriptor,
            new java.lang.String[] {
              "TensorboardTimeSeriesId", "ValueType", "Values",
            });
    internal_static_google_cloud_aiplatform_v1_TimeSeriesDataPoint_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_TimeSeriesDataPoint_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TimeSeriesDataPoint_descriptor,
            new java.lang.String[] {
              "Scalar", "Tensor", "Blobs", "WallTime", "Step", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_Scalar_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_Scalar_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Scalar_descriptor,
            new java.lang.String[] {
              "Value",
            });
    internal_static_google_cloud_aiplatform_v1_TensorboardTensor_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_TensorboardTensor_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardTensor_descriptor,
            new java.lang.String[] {
              "Value", "VersionNumber",
            });
    internal_static_google_cloud_aiplatform_v1_TensorboardBlobSequence_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_TensorboardBlobSequence_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardBlobSequence_descriptor,
            new java.lang.String[] {
              "Values",
            });
    internal_static_google_cloud_aiplatform_v1_TensorboardBlob_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_TensorboardBlob_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_TensorboardBlob_descriptor,
            new java.lang.String[] {
              "Id", "Data",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.aiplatform.v1.TensorboardTimeSeriesProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
