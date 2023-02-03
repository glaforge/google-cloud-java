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
// source: google/cloud/automl/v1/annotation_payload.proto

package com.google.cloud.automl.v1;

public final class AnnotationPayloadOuterClass {
  private AnnotationPayloadOuterClass() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_automl_v1_AnnotationPayload_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_automl_v1_AnnotationPayload_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/automl/v1/annotation_payl"
          + "oad.proto\022\026google.cloud.automl.v1\032+googl"
          + "e/cloud/automl/v1/classification.proto\032&"
          + "google/cloud/automl/v1/detection.proto\032,"
          + "google/cloud/automl/v1/text_extraction.p"
          + "roto\032+google/cloud/automl/v1/text_sentim"
          + "ent.proto\032(google/cloud/automl/v1/transl"
          + "ation.proto\"\323\003\n\021AnnotationPayload\022D\n\013tra"
          + "nslation\030\002 \001(\0132-.google.cloud.automl.v1."
          + "TranslationAnnotationH\000\022J\n\016classificatio"
          + "n\030\003 \001(\01320.google.cloud.automl.v1.Classif"
          + "icationAnnotationH\000\022X\n\026image_object_dete"
          + "ction\030\004 \001(\01326.google.cloud.automl.v1.Ima"
          + "geObjectDetectionAnnotationH\000\022K\n\017text_ex"
          + "traction\030\006 \001(\01320.google.cloud.automl.v1."
          + "TextExtractionAnnotationH\000\022I\n\016text_senti"
          + "ment\030\007 \001(\0132/.google.cloud.automl.v1.Text"
          + "SentimentAnnotationH\000\022\032\n\022annotation_spec"
          + "_id\030\001 \001(\t\022\024\n\014display_name\030\005 \001(\tB\010\n\006detai"
          + "lB\240\001\n\032com.google.cloud.automl.v1P\001Z2clou"
          + "d.google.com/go/automl/apiv1/automlpb;au"
          + "tomlpb\252\002\026Google.Cloud.AutoML.V1\312\002\026Google"
          + "\\Cloud\\AutoMl\\V1\352\002\031Google::Cloud::AutoML"
          + "::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.cloud.automl.v1.ClassificationProto.getDescriptor(),
              com.google.cloud.automl.v1.Detection.getDescriptor(),
              com.google.cloud.automl.v1.TextExtraction.getDescriptor(),
              com.google.cloud.automl.v1.TextSentimentProto.getDescriptor(),
              com.google.cloud.automl.v1.TranslationProto.getDescriptor(),
            });
    internal_static_google_cloud_automl_v1_AnnotationPayload_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_automl_v1_AnnotationPayload_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_automl_v1_AnnotationPayload_descriptor,
            new java.lang.String[] {
              "Translation",
              "Classification",
              "ImageObjectDetection",
              "TextExtraction",
              "TextSentiment",
              "AnnotationSpecId",
              "DisplayName",
              "Detail",
            });
    com.google.cloud.automl.v1.ClassificationProto.getDescriptor();
    com.google.cloud.automl.v1.Detection.getDescriptor();
    com.google.cloud.automl.v1.TextExtraction.getDescriptor();
    com.google.cloud.automl.v1.TextSentimentProto.getDescriptor();
    com.google.cloud.automl.v1.TranslationProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
