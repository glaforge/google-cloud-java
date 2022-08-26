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
// source: google/cloud/retail/v2beta/prediction_service.proto

package com.google.cloud.retail.v2beta;

public final class PredictionServiceProto {
  private PredictionServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PredictRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PredictRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PredictRequest_ParamsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PredictRequest_ParamsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PredictRequest_LabelsEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PredictRequest_LabelsEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PredictResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PredictResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_MetadataEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_MetadataEntry_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n3google/cloud/retail/v2beta/prediction_"
          + "service.proto\022\032google.cloud.retail.v2bet"
          + "a\032\034google/api/annotations.proto\032\027google/"
          + "api/client.proto\032\037google/api/field_behav"
          + "ior.proto\032+google/cloud/retail/v2beta/us"
          + "er_event.proto\032\034google/protobuf/struct.p"
          + "roto\"\274\003\n\016PredictRequest\022\026\n\tplacement\030\001 \001"
          + "(\tB\003\340A\002\022>\n\nuser_event\030\002 \001(\0132%.google.clo"
          + "ud.retail.v2beta.UserEventB\003\340A\002\022\021\n\tpage_"
          + "size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022\016\n\006filter"
          + "\030\005 \001(\t\022\025\n\rvalidate_only\030\006 \001(\010\022F\n\006params\030"
          + "\007 \003(\01326.google.cloud.retail.v2beta.Predi"
          + "ctRequest.ParamsEntry\022F\n\006labels\030\010 \003(\01326."
          + "google.cloud.retail.v2beta.PredictReques"
          + "t.LabelsEntry\032E\n\013ParamsEntry\022\013\n\003key\030\001 \001("
          + "\t\022%\n\005value\030\002 \001(\0132\026.google.protobuf.Value"
          + ":\0028\001\032-\n\013LabelsEntry\022\013\n\003key\030\001 \001(\t\022\r\n\005valu"
          + "e\030\002 \001(\t:\0028\001\"\357\002\n\017PredictResponse\022M\n\007resul"
          + "ts\030\001 \003(\0132<.google.cloud.retail.v2beta.Pr"
          + "edictResponse.PredictionResult\022\031\n\021attrib"
          + "ution_token\030\002 \001(\t\022\023\n\013missing_ids\030\003 \003(\t\022\025"
          + "\n\rvalidate_only\030\004 \001(\010\032\305\001\n\020PredictionResu"
          + "lt\022\n\n\002id\030\001 \001(\t\022\\\n\010metadata\030\002 \003(\0132J.googl"
          + "e.cloud.retail.v2beta.PredictResponse.Pr"
          + "edictionResult.MetadataEntry\032G\n\rMetadata"
          + "Entry\022\013\n\003key\030\001 \001(\t\022%\n\005value\030\002 \001(\0132\026.goog"
          + "le.protobuf.Value:\0028\0012\361\002\n\021PredictionServ"
          + "ice\022\220\002\n\007Predict\022*.google.cloud.retail.v2"
          + "beta.PredictRequest\032+.google.cloud.retai"
          + "l.v2beta.PredictResponse\"\253\001\202\323\344\223\002\244\001\"J/v2b"
          + "eta/{placement=projects/*/locations/*/ca"
          + "talogs/*/placements/*}:predict:\001*ZS\"N/v2"
          + "beta/{placement=projects/*/locations/*/c"
          + "atalogs/*/servingConfigs/*}:predict:\001*\032I"
          + "\312A\025retail.googleapis.com\322A.https://www.g"
          + "oogleapis.com/auth/cloud-platformB\337\001\n\036co"
          + "m.google.cloud.retail.v2betaB\026Prediction"
          + "ServiceProtoP\001Z@google.golang.org/genpro"
          + "to/googleapis/cloud/retail/v2beta;retail"
          + "\242\002\006RETAIL\252\002\032Google.Cloud.Retail.V2Beta\312\002"
          + "\032Google\\Cloud\\Retail\\V2beta\352\002\035Google::Cl"
          + "oud::Retail::V2betab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.cloud.retail.v2beta.UserEventProto.getDescriptor(),
              com.google.protobuf.StructProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2beta_PredictRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2beta_PredictRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PredictRequest_descriptor,
            new java.lang.String[] {
              "Placement",
              "UserEvent",
              "PageSize",
              "PageToken",
              "Filter",
              "ValidateOnly",
              "Params",
              "Labels",
            });
    internal_static_google_cloud_retail_v2beta_PredictRequest_ParamsEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_PredictRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_PredictRequest_ParamsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PredictRequest_ParamsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2beta_PredictRequest_LabelsEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_PredictRequest_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_retail_v2beta_PredictRequest_LabelsEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PredictRequest_LabelsEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_retail_v2beta_PredictResponse_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2beta_PredictResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PredictResponse_descriptor,
            new java.lang.String[] {
              "Results", "AttributionToken", "MissingIds", "ValidateOnly",
            });
    internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_descriptor =
        internal_static_google_cloud_retail_v2beta_PredictResponse_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_descriptor,
            new java.lang.String[] {
              "Id", "Metadata",
            });
    internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_MetadataEntry_descriptor =
        internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_MetadataEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2beta_PredictResponse_PredictionResult_MetadataEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.oauthScopes);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.cloud.retail.v2beta.UserEventProto.getDescriptor();
    com.google.protobuf.StructProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}