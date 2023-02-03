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
// source: google/cloud/aiplatform/v1/dataset.proto

package com.google.cloud.aiplatform.v1;

public final class DatasetProto {
  private DatasetProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Dataset_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Dataset_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ExportDataConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ExportDataConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n(google/cloud/aiplatform/v1/dataset.pro"
          + "to\022\032google.cloud.aiplatform.v1\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0320google/cloud/aiplatform/v1/e"
          + "ncryption_spec.proto\032#google/cloud/aipla"
          + "tform/v1/io.proto\032,google/cloud/aiplatfo"
          + "rm/v1/saved_query.proto\032\034google/protobuf"
          + "/struct.proto\032\037google/protobuf/timestamp"
          + ".proto\"\217\005\n\007Dataset\022\021\n\004name\030\001 \001(\tB\003\340A\003\022\031\n"
          + "\014display_name\030\002 \001(\tB\003\340A\002\022\023\n\013description\030"
          + "\020 \001(\t\022 \n\023metadata_schema_uri\030\003 \001(\tB\003\340A\002\022"
          + "-\n\010metadata\030\010 \001(\0132\026.google.protobuf.Valu"
          + "eB\003\340A\002\0224\n\013create_time\030\004 \001(\0132\032.google.pro"
          + "tobuf.TimestampB\003\340A\003\0224\n\013update_time\030\005 \001("
          + "\0132\032.google.protobuf.TimestampB\003\340A\003\022\014\n\004et"
          + "ag\030\006 \001(\t\022?\n\006labels\030\007 \003(\0132/.google.cloud."
          + "aiplatform.v1.Dataset.LabelsEntry\022=\n\rsav"
          + "ed_queries\030\t \003(\0132&.google.cloud.aiplatfo"
          + "rm.v1.SavedQuery\022C\n\017encryption_spec\030\013 \001("
          + "\0132*.google.cloud.aiplatform.v1.Encryptio"
          + "nSpec\022\036\n\021metadata_artifact\030\021 \001(\tB\003\340A\003\032-\n"
          + "\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t"
          + ":\0028\001:b\352A_\n!aiplatform.googleapis.com/Dat"
          + "aset\022:projects/{project}/locations/{loca"
          + "tion}/datasets/{dataset}\"\244\003\n\020ImportDataC"
          + "onfig\022;\n\ngcs_source\030\001 \001(\0132%.google.cloud"
          + ".aiplatform.v1.GcsSourceH\000\022Z\n\020data_item_"
          + "labels\030\002 \003(\0132@.google.cloud.aiplatform.v"
          + "1.ImportDataConfig.DataItemLabelsEntry\022]"
          + "\n\021annotation_labels\030\003 \003(\0132B.google.cloud"
          + ".aiplatform.v1.ImportDataConfig.Annotati"
          + "onLabelsEntry\022\036\n\021import_schema_uri\030\004 \001(\t"
          + "B\003\340A\002\0325\n\023DataItemLabelsEntry\022\013\n\003key\030\001 \001("
          + "\t\022\r\n\005value\030\002 \001(\t:\0028\001\0327\n\025AnnotationLabels"
          + "Entry\022\013\n\003key\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\010\n"
          + "\006source\"\204\001\n\020ExportDataConfig\022E\n\017gcs_dest"
          + "ination\030\001 \001(\0132*.google.cloud.aiplatform."
          + "v1.GcsDestinationH\000\022\032\n\022annotations_filte"
          + "r\030\002 \001(\tB\r\n\013destinationB\312\001\n\036com.google.cl"
          + "oud.aiplatform.v1B\014DatasetProtoP\001Z>cloud"
          + ".google.com/go/aiplatform/apiv1/aiplatfo"
          + "rmpb;aiplatformpb\252\002\032Google.Cloud.AIPlatf"
          + "orm.V1\312\002\032Google\\Cloud\\AIPlatform\\V1\352\002\035Go"
          + "ogle::Cloud::AIPlatform::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IoProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.SavedQueryProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_Dataset_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Dataset_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Dataset_descriptor,
            new java.lang.String[] {
              "Name",
              "DisplayName",
              "Description",
              "MetadataSchemaUri",
              "Metadata",
              "CreateTime",
              "UpdateTime",
              "Etag",
              "Labels",
              "SavedQueries",
              "EncryptionSpec",
              "MetadataArtifact",
            });
    internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_Dataset_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_Dataset_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "DataItemLabels", "AnnotationLabels", "ImportSchemaUri", "Source",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataConfig_DataItemLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_descriptor =
        internal_static_google_cloud_aiplatform_v1_ImportDataConfig_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ImportDataConfig_AnnotationLabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_aiplatform_v1_ExportDataConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_ExportDataConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ExportDataConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "AnnotationsFilter", "Destination",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resource);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.aiplatform.v1.EncryptionSpecProto.getDescriptor();
    com.google.cloud.aiplatform.v1.IoProto.getDescriptor();
    com.google.cloud.aiplatform.v1.SavedQueryProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
