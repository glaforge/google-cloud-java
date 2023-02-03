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
// source: google/cloud/automl/v1beta1/io.proto

package com.google.cloud.automl.v1beta1;

public final class Io {
  private Io() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_InputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_InputConfig_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_InputConfig_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BatchPredictInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_DocumentInputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_DocumentInputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_OutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_OutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BatchPredictOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BatchPredictOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOutputConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOutputConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_GcsDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_GcsDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_BigQueryDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_BigQueryDestination_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1beta1_GcrDestination_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1beta1_GcrDestination_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n$google/cloud/automl/v1beta1/io.proto\022\033"
          + "google.cloud.automl.v1beta1\"\222\002\n\013InputCon"
          + "fig\022<\n\ngcs_source\030\001 \001(\0132&.google.cloud.a"
          + "utoml.v1beta1.GcsSourceH\000\022F\n\017bigquery_so"
          + "urce\030\003 \001(\0132+.google.cloud.automl.v1beta1"
          + ".BigQuerySourceH\000\022D\n\006params\030\002 \003(\01324.goog"
          + "le.cloud.automl.v1beta1.InputConfig.Para"
          + "msEntry\032-\n\013ParamsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005v"
          + "alue\030\002 \001(\t:\0028\001B\010\n\006source\"\251\001\n\027BatchPredic"
          + "tInputConfig\022<\n\ngcs_source\030\001 \001(\0132&.googl"
          + "e.cloud.automl.v1beta1.GcsSourceH\000\022F\n\017bi"
          + "gquery_source\030\002 \001(\0132+.google.cloud.autom"
          + "l.v1beta1.BigQuerySourceH\000B\010\n\006source\"Q\n\023"
          + "DocumentInputConfig\022:\n\ngcs_source\030\001 \001(\0132"
          + "&.google.cloud.automl.v1beta1.GcsSource\""
          + "\267\001\n\014OutputConfig\022F\n\017gcs_destination\030\001 \001("
          + "\0132+.google.cloud.automl.v1beta1.GcsDesti"
          + "nationH\000\022P\n\024bigquery_destination\030\002 \001(\01320"
          + ".google.cloud.automl.v1beta1.BigQueryDes"
          + "tinationH\000B\r\n\013destination\"\303\001\n\030BatchPredi"
          + "ctOutputConfig\022F\n\017gcs_destination\030\001 \001(\0132"
          + "+.google.cloud.automl.v1beta1.GcsDestina"
          + "tionH\000\022P\n\024bigquery_destination\030\002 \001(\01320.g"
          + "oogle.cloud.automl.v1beta1.BigQueryDesti"
          + "nationH\000B\r\n\013destination\"\317\002\n\027ModelExportO"
          + "utputConfig\022F\n\017gcs_destination\030\001 \001(\0132+.g"
          + "oogle.cloud.automl.v1beta1.GcsDestinatio"
          + "nH\000\022F\n\017gcr_destination\030\003 \001(\0132+.google.cl"
          + "oud.automl.v1beta1.GcrDestinationH\000\022\024\n\014m"
          + "odel_format\030\004 \001(\t\022P\n\006params\030\002 \003(\0132@.goog"
          + "le.cloud.automl.v1beta1.ModelExportOutpu"
          + "tConfig.ParamsEntry\032-\n\013ParamsEntry\022\013\n\003ke"
          + "y\030\001 \001(\t\022\r\n\005value\030\002 \001(\t:\0028\001B\r\n\013destinatio"
          + "n\"\206\001\n#ExportEvaluatedExamplesOutputConfi"
          + "g\022P\n\024bigquery_destination\030\002 \001(\01320.google"
          + ".cloud.automl.v1beta1.BigQueryDestinatio"
          + "nH\000B\r\n\013destination\"\037\n\tGcsSource\022\022\n\ninput"
          + "_uris\030\001 \003(\t\"#\n\016BigQuerySource\022\021\n\tinput_u"
          + "ri\030\001 \001(\t\"+\n\016GcsDestination\022\031\n\021output_uri"
          + "_prefix\030\001 \001(\t\")\n\023BigQueryDestination\022\022\n\n"
          + "output_uri\030\001 \001(\t\"$\n\016GcrDestination\022\022\n\nou"
          + "tput_uri\030\001 \001(\tB\233\001\n\037com.google.cloud.auto"
          + "ml.v1beta1P\001Z7cloud.google.com/go/automl"
          + "/apiv1beta1/automlpb;automlpb\312\002\033Google\\C"
          + "loud\\AutoMl\\V1beta1\352\002\036Google::Cloud::Aut"
          + "oML::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData, new com.google.protobuf.Descriptors.FileDescriptor[] {});
    internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_InputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "Params", "Source",
            });
    internal_static_google_cloud_automl_v1beta1_InputConfig_ParamsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_InputConfig_descriptor.getNestedTypes().get(0);
    internal_static_google_cloud_automl_v1beta1_InputConfig_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_InputConfig_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_BatchPredictInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_automl_v1beta1_BatchPredictInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BatchPredictInputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource", "BigquerySource", "Source",
            });
    internal_static_google_cloud_automl_v1beta1_DocumentInputConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_automl_v1beta1_DocumentInputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_DocumentInputConfig_descriptor,
            new java.lang.String[] {
              "GcsSource",
            });
    internal_static_google_cloud_automl_v1beta1_OutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_automl_v1beta1_OutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_OutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_automl_v1beta1_BatchPredictOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_automl_v1beta1_BatchPredictOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BatchPredictOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_descriptor,
            new java.lang.String[] {
              "GcsDestination", "GcrDestination", "ModelFormat", "Params", "Destination",
            });
    internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_ParamsEntry_descriptor =
        internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ModelExportOutputConfig_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOutputConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOutputConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_ExportEvaluatedExamplesOutputConfig_descriptor,
            new java.lang.String[] {
              "BigqueryDestination", "Destination",
            });
    internal_static_google_cloud_automl_v1beta1_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_automl_v1beta1_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris",
            });
    internal_static_google_cloud_automl_v1beta1_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_automl_v1beta1_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BigQuerySource_descriptor,
            new java.lang.String[] {
              "InputUri",
            });
    internal_static_google_cloud_automl_v1beta1_GcsDestination_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_automl_v1beta1_GcsDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_GcsDestination_descriptor,
            new java.lang.String[] {
              "OutputUriPrefix",
            });
    internal_static_google_cloud_automl_v1beta1_BigQueryDestination_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_automl_v1beta1_BigQueryDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_BigQueryDestination_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
    internal_static_google_cloud_automl_v1beta1_GcrDestination_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_automl_v1beta1_GcrDestination_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1beta1_GcrDestination_descriptor,
            new java.lang.String[] {
              "OutputUri",
            });
  }

  // @@protoc_insertion_point(outer_class_scope)
}
