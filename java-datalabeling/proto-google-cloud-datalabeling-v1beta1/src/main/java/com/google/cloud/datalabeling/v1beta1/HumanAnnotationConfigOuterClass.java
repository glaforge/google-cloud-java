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
// source: google/cloud/datalabeling/v1beta1/human_annotation_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public final class HumanAnnotationConfigOuterClass {
  private HumanAnnotationConfigOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_HumanAnnotationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_HumanAnnotationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_PolylineConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_PolylineConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_SegmentationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_SegmentationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_AnnotationSpecSetConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_AnnotationSpecSetConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_EventConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_EventConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_SentimentConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_SentimentConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionConfig_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n?google/cloud/datalabeling/v1beta1/huma"
          + "n_annotation_config.proto\022!google.cloud."
          + "datalabeling.v1beta1\032\037google/api/field_b"
          + "ehavior.proto\032\036google/protobuf/duration."
          + "proto\"\324\002\n\025HumanAnnotationConfig\022\030\n\013instr"
          + "uction\030\001 \001(\tB\003\340A\002\022+\n\036annotated_dataset_d"
          + "isplay_name\030\002 \001(\tB\003\340A\002\022*\n\035annotated_data"
          + "set_description\030\003 \001(\tB\003\340A\001\022\030\n\013label_grou"
          + "p\030\004 \001(\tB\003\340A\001\022\032\n\rlanguage_code\030\005 \001(\tB\003\340A\001"
          + "\022\032\n\rreplica_count\030\006 \001(\005B\003\340A\001\0229\n\021question"
          + "_duration\030\007 \001(\0132\031.google.protobuf.Durati"
          + "onB\003\340A\001\022\037\n\022contributor_emails\030\t \003(\tB\003\340A\001"
          + "\022\032\n\022user_email_address\030\n \001(\t\"\275\001\n\031ImageCl"
          + "assificationConfig\022 \n\023annotation_spec_se"
          + "t\030\001 \001(\tB\003\340A\002\022\036\n\021allow_multi_label\030\002 \001(\010B"
          + "\003\340A\001\022^\n\027answer_aggregation_type\030\003 \001(\01628."
          + "google.cloud.datalabeling.v1beta1.String"
          + "AggregationTypeB\003\340A\001\"X\n\022BoundingPolyConf"
          + "ig\022 \n\023annotation_spec_set\030\001 \001(\tB\003\340A\002\022 \n\023"
          + "instruction_message\030\002 \001(\tB\003\340A\001\"T\n\016Polyli"
          + "neConfig\022 \n\023annotation_spec_set\030\001 \001(\tB\003\340"
          + "A\002\022 \n\023instruction_message\030\002 \001(\tB\003\340A\001\"S\n\022"
          + "SegmentationConfig\022 \n\023annotation_spec_se"
          + "t\030\001 \001(\tB\003\340A\002\022\033\n\023instruction_message\030\002 \001("
          + "\t\"\233\002\n\031VideoClassificationConfig\022~\n\033annot"
          + "ation_spec_set_configs\030\001 \003(\0132T.google.cl"
          + "oud.datalabeling.v1beta1.VideoClassifica"
          + "tionConfig.AnnotationSpecSetConfigB\003\340A\002\022"
          + "!\n\024apply_shot_detection\030\002 \001(\010B\003\340A\001\032[\n\027An"
          + "notationSpecSetConfig\022 \n\023annotation_spec"
          + "_set\030\001 \001(\tB\003\340A\002\022\036\n\021allow_multi_label\030\002 \001"
          + "(\010B\003\340A\001\"]\n\025ObjectDetectionConfig\022 \n\023anno"
          + "tation_spec_set\030\001 \001(\tB\003\340A\002\022\"\n\025extraction"
          + "_frame_rate\030\003 \001(\001B\003\340A\002\"8\n\024ObjectTracking"
          + "Config\022 \n\023annotation_spec_set\030\001 \001(\tB\003\340A\002"
          + "\"0\n\013EventConfig\022!\n\024annotation_spec_sets\030"
          + "\001 \003(\tB\003\340A\002\"\257\001\n\030TextClassificationConfig\022"
          + "\036\n\021allow_multi_label\030\001 \001(\010B\003\340A\001\022 \n\023annot"
          + "ation_spec_set\030\002 \001(\tB\003\340A\002\022Q\n\020sentiment_c"
          + "onfig\030\003 \001(\01322.google.cloud.datalabeling."
          + "v1beta1.SentimentConfigB\003\340A\001\";\n\017Sentimen"
          + "tConfig\022(\n enable_label_sentiment_select"
          + "ion\030\001 \001(\010\">\n\032TextEntityExtractionConfig\022"
          + " \n\023annotation_spec_set\030\001 \001(\tB\003\340A\002*{\n\025Str"
          + "ingAggregationType\022\'\n#STRING_AGGREGATION"
          + "_TYPE_UNSPECIFIED\020\000\022\021\n\rMAJORITY_VOTE\020\001\022\022"
          + "\n\016UNANIMOUS_VOTE\020\002\022\022\n\016NO_AGGREGATION\020\003B\343"
          + "\001\n%com.google.cloud.datalabeling.v1beta1"
          + "P\001ZIcloud.google.com/go/datalabeling/api"
          + "v1beta1/datalabelingpb;datalabelingpb\252\002!"
          + "Google.Cloud.DataLabeling.V1Beta1\312\002!Goog"
          + "le\\Cloud\\DataLabeling\\V1beta1\352\002$Google::"
          + "Cloud::DataLabeling::V1beta1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.protobuf.DurationProto.getDescriptor(),
            });
    internal_static_google_cloud_datalabeling_v1beta1_HumanAnnotationConfig_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_datalabeling_v1beta1_HumanAnnotationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_HumanAnnotationConfig_descriptor,
            new java.lang.String[] {
              "Instruction",
              "AnnotatedDatasetDisplayName",
              "AnnotatedDatasetDescription",
              "LabelGroup",
              "LanguageCode",
              "ReplicaCount",
              "QuestionDuration",
              "ContributorEmails",
              "UserEmailAddress",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ImageClassificationConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet", "AllowMultiLabel", "AnswerAggregationType",
            });
    internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_BoundingPolyConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet", "InstructionMessage",
            });
    internal_static_google_cloud_datalabeling_v1beta1_PolylineConfig_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_datalabeling_v1beta1_PolylineConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_PolylineConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet", "InstructionMessage",
            });
    internal_static_google_cloud_datalabeling_v1beta1_SegmentationConfig_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_datalabeling_v1beta1_SegmentationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_SegmentationConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet", "InstructionMessage",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSetConfigs", "ApplyShotDetection",
            });
    internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_AnnotationSpecSetConfig_descriptor =
        internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_AnnotationSpecSetConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_VideoClassificationConfig_AnnotationSpecSetConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet", "AllowMultiLabel",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ObjectDetectionConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet", "ExtractionFrameRate",
            });
    internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingConfig_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_ObjectTrackingConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet",
            });
    internal_static_google_cloud_datalabeling_v1beta1_EventConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_datalabeling_v1beta1_EventConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_EventConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSets",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TextClassificationConfig_descriptor,
            new java.lang.String[] {
              "AllowMultiLabel", "AnnotationSpecSet", "SentimentConfig",
            });
    internal_static_google_cloud_datalabeling_v1beta1_SentimentConfig_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_datalabeling_v1beta1_SentimentConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_SentimentConfig_descriptor,
            new java.lang.String[] {
              "EnableLabelSentimentSelection",
            });
    internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionConfig_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_datalabeling_v1beta1_TextEntityExtractionConfig_descriptor,
            new java.lang.String[] {
              "AnnotationSpecSet",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.protobuf.DurationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
