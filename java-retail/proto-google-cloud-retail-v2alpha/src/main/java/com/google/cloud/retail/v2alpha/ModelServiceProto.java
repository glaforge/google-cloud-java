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
// source: google/cloud/retail/v2alpha/model_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.retail.v2alpha;

public final class ModelServiceProto {
  private ModelServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CreateModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CreateModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_UpdateModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_UpdateModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_GetModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_GetModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_PauseModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_PauseModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ResumeModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ResumeModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ListModelsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ListModelsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_DeleteModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_DeleteModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_ListModelsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_ListModelsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_TuneModelRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_TuneModelRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_CreateModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_CreateModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_TuneModelMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_TuneModelMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_retail_v2alpha_TuneModelResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_retail_v2alpha_TuneModelResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n/google/cloud/retail/v2alpha/model_serv"
          + "ice.proto\022\033google.cloud.retail.v2alpha\032\034"
          + "google/api/annotations.proto\032\027google/api"
          + "/client.proto\032\037google/api/field_behavior"
          + ".proto\032\031google/api/resource.proto\032\'googl"
          + "e/cloud/retail/v2alpha/model.proto\032#goog"
          + "le/longrunning/operations.proto\032\033google/"
          + "protobuf/empty.proto\032 google/protobuf/fi"
          + "eld_mask.proto\"\231\001\n\022CreateModelRequest\0225\n"
          + "\006parent\030\001 \001(\tB%\340A\002\372A\037\n\035retail.googleapis"
          + ".com/Catalog\0226\n\005model\030\002 \001(\0132\".google.clo"
          + "ud.retail.v2alpha.ModelB\003\340A\002\022\024\n\007dry_run\030"
          + "\003 \001(\010B\003\340A\001\"\202\001\n\022UpdateModelRequest\0226\n\005mod"
          + "el\030\001 \001(\0132\".google.cloud.retail.v2alpha.M"
          + "odelB\003\340A\002\0224\n\013update_mask\030\002 \001(\0132\032.google."
          + "protobuf.FieldMaskB\003\340A\001\"D\n\017GetModelReque"
          + "st\0221\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033retail.googlea"
          + "pis.com/Model\"F\n\021PauseModelRequest\0221\n\004na"
          + "me\030\001 \001(\tB#\340A\002\372A\035\n\033retail.googleapis.com/"
          + "Model\"\'\n\022ResumeModelRequest\022\021\n\004name\030\001 \001("
          + "\tB\003\340A\002\"{\n\021ListModelsRequest\0225\n\006parent\030\001 "
          + "\001(\tB%\340A\002\372A\037\n\035retail.googleapis.com/Catal"
          + "og\022\026\n\tpage_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token"
          + "\030\003 \001(\tB\003\340A\001\"G\n\022DeleteModelRequest\0221\n\004nam"
          + "e\030\001 \001(\tB#\340A\002\372A\035\n\033retail.googleapis.com/M"
          + "odel\"a\n\022ListModelsResponse\0222\n\006models\030\001 \003"
          + "(\0132\".google.cloud.retail.v2alpha.Model\022\027"
          + "\n\017next_page_token\030\002 \001(\t\"E\n\020TuneModelRequ"
          + "est\0221\n\004name\030\001 \001(\tB#\340A\002\372A\035\n\033retail.google"
          + "apis.com/Model\"$\n\023CreateModelMetadata\022\r\n"
          + "\005model\030\001 \001(\t\"\"\n\021TuneModelMetadata\022\r\n\005mod"
          + "el\030\001 \001(\t\"\023\n\021TuneModelResponse2\302\r\n\014ModelS"
          + "ervice\022\217\002\n\013CreateModel\022/.google.cloud.re"
          + "tail.v2alpha.CreateModelRequest\032\035.google"
          + ".longrunning.Operation\"\257\001\312AT\n!google.clo"
          + "ud.retail.v2alpha.Model\022/google.cloud.re"
          + "tail.v2alpha.CreateModelMetadata\332A\014paren"
          + "t,model\202\323\344\223\002C\":/v2alpha/{parent=projects"
          + "/*/locations/*/catalogs/*}/models:\005model"
          + "\022\247\001\n\010GetModel\022,.google.cloud.retail.v2al"
          + "pha.GetModelRequest\032\".google.cloud.retai"
          + "l.v2alpha.Model\"I\332A\004name\202\323\344\223\002<\022:/v2alpha"
          + "/{name=projects/*/locations/*/catalogs/*"
          + "/models/*}\022\264\001\n\nPauseModel\022..google.cloud"
          + ".retail.v2alpha.PauseModelRequest\032\".goog"
          + "le.cloud.retail.v2alpha.Model\"R\332A\004name\202\323"
          + "\344\223\002E\"@/v2alpha/{name=projects/*/location"
          + "s/*/catalogs/*/models/*}:pause:\001*\022\267\001\n\013Re"
          + "sumeModel\022/.google.cloud.retail.v2alpha."
          + "ResumeModelRequest\032\".google.cloud.retail"
          + ".v2alpha.Model\"S\332A\004name\202\323\344\223\002F\"A/v2alpha/"
          + "{name=projects/*/locations/*/catalogs/*/"
          + "models/*}:resume:\001*\022\241\001\n\013DeleteModel\022/.go"
          + "ogle.cloud.retail.v2alpha.DeleteModelReq"
          + "uest\032\026.google.protobuf.Empty\"I\332A\004name\202\323\344"
          + "\223\002<*:/v2alpha/{name=projects/*/locations"
          + "/*/catalogs/*/models/*}\022\272\001\n\nListModels\022."
          + ".google.cloud.retail.v2alpha.ListModelsR"
          + "equest\032/.google.cloud.retail.v2alpha.Lis"
          + "tModelsResponse\"K\332A\006parent\202\323\344\223\002<\022:/v2alp"
          + "ha/{parent=projects/*/locations/*/catalo"
          + "gs/*}/models\022\307\001\n\013UpdateModel\022/.google.cl"
          + "oud.retail.v2alpha.UpdateModelRequest\032\"."
          + "google.cloud.retail.v2alpha.Model\"c\332A\021mo"
          + "del,update_mask\202\323\344\223\002I2@/v2alpha/{model.n"
          + "ame=projects/*/locations/*/catalogs/*/mo"
          + "dels/*}:\005model\022\216\002\n\tTuneModel\022-.google.cl"
          + "oud.retail.v2alpha.TuneModelRequest\032\035.go"
          + "ogle.longrunning.Operation\"\262\001\312A^\n-google"
          + ".cloud.retail.v2alpha.TuneModelResponse\022"
          + "-google.cloud.retail.v2alpha.TuneModelMe"
          + "tadata\332A\004name\202\323\344\223\002D\"?/v2alpha/{name=proj"
          + "ects/*/locations/*/catalogs/*/models/*}:"
          + "tune:\001*\032I\312A\025retail.googleapis.com\322A.http"
          + "s://www.googleapis.com/auth/cloud-platfo"
          + "rmB\325\001\n\037com.google.cloud.retail.v2alphaB\021"
          + "ModelServiceProtoP\001Z7cloud.google.com/go"
          + "/retail/apiv2alpha/retailpb;retailpb\242\002\006R"
          + "ETAIL\252\002\033Google.Cloud.Retail.V2Alpha\312\002\033Go"
          + "ogle\\Cloud\\Retail\\V2alpha\352\002\036Google::Clou"
          + "d::Retail::V2alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.retail.v2alpha.ModelProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_retail_v2alpha_CreateModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_retail_v2alpha_CreateModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CreateModelRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Model", "DryRun",
            });
    internal_static_google_cloud_retail_v2alpha_UpdateModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_retail_v2alpha_UpdateModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_UpdateModelRequest_descriptor,
            new java.lang.String[] {
              "Model", "UpdateMask",
            });
    internal_static_google_cloud_retail_v2alpha_GetModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_retail_v2alpha_GetModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_GetModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2alpha_PauseModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_retail_v2alpha_PauseModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_PauseModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2alpha_ResumeModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_retail_v2alpha_ResumeModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ResumeModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2alpha_ListModelsRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_retail_v2alpha_ListModelsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ListModelsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken",
            });
    internal_static_google_cloud_retail_v2alpha_DeleteModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_retail_v2alpha_DeleteModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_DeleteModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2alpha_ListModelsResponse_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_retail_v2alpha_ListModelsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_ListModelsResponse_descriptor,
            new java.lang.String[] {
              "Models", "NextPageToken",
            });
    internal_static_google_cloud_retail_v2alpha_TuneModelRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_retail_v2alpha_TuneModelRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_TuneModelRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_retail_v2alpha_CreateModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_retail_v2alpha_CreateModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_CreateModelMetadata_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_retail_v2alpha_TuneModelMetadata_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_retail_v2alpha_TuneModelMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_TuneModelMetadata_descriptor,
            new java.lang.String[] {
              "Model",
            });
    internal_static_google_cloud_retail_v2alpha_TuneModelResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_retail_v2alpha_TuneModelResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_retail_v2alpha_TuneModelResponse_descriptor,
            new java.lang.String[] {});
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.ClientProto.defaultHost);
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.AnnotationsProto.http);
    registry.add(com.google.api.ClientProto.methodSignature);
    registry.add(com.google.api.ClientProto.oauthScopes);
    registry.add(com.google.api.ResourceProto.resourceReference);
    registry.add(com.google.longrunning.OperationsProto.operationInfo);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.AnnotationsProto.getDescriptor();
    com.google.api.ClientProto.getDescriptor();
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.retail.v2alpha.ModelProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
