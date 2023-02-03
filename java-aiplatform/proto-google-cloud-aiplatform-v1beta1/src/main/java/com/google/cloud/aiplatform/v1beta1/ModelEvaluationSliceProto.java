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
// source: google/cloud/aiplatform/v1beta1/model_evaluation_slice.proto

package com.google.cloud.aiplatform.v1beta1;

public final class ModelEvaluationSliceProto {
  private ModelEvaluationSliceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_Slice_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_Slice_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n<google/cloud/aiplatform/v1beta1/model_"
          + "evaluation_slice.proto\022\037google.cloud.aip"
          + "latform.v1beta1\032\037google/api/field_behavi"
          + "or.proto\032\031google/api/resource.proto\032\034goo"
          + "gle/protobuf/struct.proto\032\037google/protob"
          + "uf/timestamp.proto\"\313\003\n\024ModelEvaluationSl"
          + "ice\022\021\n\004name\030\001 \001(\tB\003\340A\003\022O\n\005slice\030\002 \001(\0132;."
          + "google.cloud.aiplatform.v1beta1.ModelEva"
          + "luationSlice.SliceB\003\340A\003\022\037\n\022metrics_schem"
          + "a_uri\030\003 \001(\tB\003\340A\003\022,\n\007metrics\030\004 \001(\0132\026.goog"
          + "le.protobuf.ValueB\003\340A\003\0224\n\013create_time\030\005 "
          + "\001(\0132\032.google.protobuf.TimestampB\003\340A\003\0323\n\005"
          + "Slice\022\026\n\tdimension\030\001 \001(\tB\003\340A\003\022\022\n\005value\030\002"
          + " \001(\tB\003\340A\003:\224\001\352A\220\001\n.aiplatform.googleapis."
          + "com/ModelEvaluationSlice\022^projects/{proj"
          + "ect}/locations/{location}/models/{model}"
          + "/evaluations/{evaluation}/slices/{slice}"
          + "B\360\001\n#com.google.cloud.aiplatform.v1beta1"
          + "B\031ModelEvaluationSliceProtoP\001ZCcloud.goo"
          + "gle.com/go/aiplatform/apiv1beta1/aiplatf"
          + "ormpb;aiplatformpb\252\002\037Google.Cloud.AIPlat"
          + "form.V1Beta1\312\002\037Google\\Cloud\\AIPlatform\\V"
          + "1beta1\352\002\"Google::Cloud::AIPlatform::V1be"
          + "ta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_descriptor,
            new java.lang.String[] {
              "Name", "Slice", "MetricsSchemaUri", "Metrics", "CreateTime",
            });
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_Slice_descriptor =
        internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_Slice_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1beta1_ModelEvaluationSlice_Slice_descriptor,
            new java.lang.String[] {
              "Dimension", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
