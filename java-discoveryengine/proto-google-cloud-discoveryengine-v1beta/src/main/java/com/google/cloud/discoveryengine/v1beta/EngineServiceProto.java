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
// source: google/cloud/discoveryengine/v1beta/engine_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public final class EngineServiceProto {
  private EngineServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_CreateEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_CreateEngineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_GetEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_GetEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListEnginesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListEnginesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ListEnginesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ListEnginesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_UpdateEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_UpdateEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_PauseEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_PauseEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_ResumeEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_ResumeEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TuneEngineRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TuneEngineRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TuneEngineMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TuneEngineMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1beta_TuneEngineResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1beta_TuneEngineResponse_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1beta/en"
          + "gine_service.proto\022#google.cloud.discove"
          + "ryengine.v1beta\032\034google/api/annotations."
          + "proto\032\027google/api/client.proto\032\037google/a"
          + "pi/field_behavior.proto\032\031google/api/reso"
          + "urce.proto\0320google/cloud/discoveryengine"
          + "/v1beta/engine.proto\032#google/longrunning"
          + "/operations.proto\032\033google/protobuf/empty"
          + ".proto\032 google/protobuf/field_mask.proto"
          + "\032\037google/protobuf/timestamp.proto\"\262\001\n\023Cr"
          + "eateEngineRequest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A"
          + "+\n)discoveryengine.googleapis.com/Collec"
          + "tion\022@\n\006engine\030\002 \001(\0132+.google.cloud.disc"
          + "overyengine.v1beta.EngineB\003\340A\002\022\026\n\tengine"
          + "_id\030\003 \001(\tB\003\340A\002\"x\n\024CreateEngineMetadata\022/"
          + "\n\013create_time\030\001 \001(\0132\032.google.protobuf.Ti"
          + "mestamp\022/\n\013update_time\030\002 \001(\0132\032.google.pr"
          + "otobuf.Timestamp\"R\n\023DeleteEngineRequest\022"
          + ";\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%discoveryengine.g"
          + "oogleapis.com/Engine\"x\n\024DeleteEngineMeta"
          + "data\022/\n\013create_time\030\001 \001(\0132\032.google.proto"
          + "buf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032.goo"
          + "gle.protobuf.Timestamp\"O\n\020GetEngineReque"
          + "st\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%discoveryengin"
          + "e.googleapis.com/Engine\"\235\001\n\022ListEnginesR"
          + "equest\022A\n\006parent\030\001 \001(\tB1\340A\002\372A+\n)discover"
          + "yengine.googleapis.com/Collection\022\026\n\tpag"
          + "e_size\030\002 \001(\005B\003\340A\001\022\027\n\npage_token\030\003 \001(\tB\003\340"
          + "A\001\022\023\n\006filter\030\004 \001(\tB\003\340A\001\"l\n\023ListEnginesRe"
          + "sponse\022<\n\007engines\030\001 \003(\0132+.google.cloud.d"
          + "iscoveryengine.v1beta.Engine\022\027\n\017next_pag"
          + "e_token\030\002 \001(\t\"\210\001\n\023UpdateEngineRequest\022@\n"
          + "\006engine\030\001 \001(\0132+.google.cloud.discoveryen"
          + "gine.v1beta.EngineB\003\340A\002\022/\n\013update_mask\030\002"
          + " \001(\0132\032.google.protobuf.FieldMask\"Q\n\022Paus"
          + "eEngineRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'\n%di"
          + "scoveryengine.googleapis.com/Engine\"R\n\023R"
          + "esumeEngineRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372A\'"
          + "\n%discoveryengine.googleapis.com/Engine\""
          + "P\n\021TuneEngineRequest\022;\n\004name\030\001 \001(\tB-\340A\002\372"
          + "A\'\n%discoveryengine.googleapis.com/Engin"
          + "e\"S\n\022TuneEngineMetadata\022=\n\006engine\030\001 \001(\tB"
          + "-\340A\002\372A\'\n%discoveryengine.googleapis.com/"
          + "Engine\"\024\n\022TuneEngineResponse2\247\017\n\rEngineS"
          + "ervice\022\272\002\n\014CreateEngine\0228.google.cloud.d"
          + "iscoveryengine.v1beta.CreateEngineReques"
          + "t\032\035.google.longrunning.Operation\"\320\001\312Af\n*"
          + "google.cloud.discoveryengine.v1beta.Engi"
          + "ne\0228google.cloud.discoveryengine.v1beta."
          + "CreateEngineMetadata\332A\027parent,engine,eng"
          + "ine_id\202\323\344\223\002G\"=/v1beta/{parent=projects/*"
          + "/locations/*/collections/*}/engines:\006eng"
          + "ine\022\212\002\n\014DeleteEngine\0228.google.cloud.disc"
          + "overyengine.v1beta.DeleteEngineRequest\032\035"
          + ".google.longrunning.Operation\"\240\001\312AQ\n\025goo"
          + "gle.protobuf.Empty\0228google.cloud.discove"
          + "ryengine.v1beta.DeleteEngineMetadata\332A\004n"
          + "ame\202\323\344\223\002?*=/v1beta/{name=projects/*/loca"
          + "tions/*/collections/*/engines/*}\022\340\001\n\014Upd"
          + "ateEngine\0228.google.cloud.discoveryengine"
          + ".v1beta.UpdateEngineRequest\032+.google.clo"
          + "ud.discoveryengine.v1beta.Engine\"i\332A\022eng"
          + "ine,update_mask\202\323\344\223\002N2D/v1beta/{engine.n"
          + "ame=projects/*/locations/*/collections/*"
          + "/engines/*}:\006engine\022\275\001\n\tGetEngine\0225.goog"
          + "le.cloud.discoveryengine.v1beta.GetEngin"
          + "eRequest\032+.google.cloud.discoveryengine."
          + "v1beta.Engine\"L\332A\004name\202\323\344\223\002?\022=/v1beta/{n"
          + "ame=projects/*/locations/*/collections/*"
          + "/engines/*}\022\320\001\n\013ListEngines\0227.google.clo"
          + "ud.discoveryengine.v1beta.ListEnginesReq"
          + "uest\0328.google.cloud.discoveryengine.v1be"
          + "ta.ListEnginesResponse\"N\332A\006parent\202\323\344\223\002?\022"
          + "=/v1beta/{parent=projects/*/locations/*/"
          + "collections/*}/engines\022\312\001\n\013PauseEngine\0227"
          + ".google.cloud.discoveryengine.v1beta.Pau"
          + "seEngineRequest\032+.google.cloud.discovery"
          + "engine.v1beta.Engine\"U\332A\004name\202\323\344\223\002H\"C/v1"
          + "beta/{name=projects/*/locations/*/collec"
          + "tions/*/engines/*}:pause:\001*\022\315\001\n\014ResumeEn"
          + "gine\0228.google.cloud.discoveryengine.v1be"
          + "ta.ResumeEngineRequest\032+.google.cloud.di"
          + "scoveryengine.v1beta.Engine\"V\332A\004name\202\323\344\223"
          + "\002I\"D/v1beta/{name=projects/*/locations/*"
          + "/collections/*/engines/*}:resume:\001*\022\344\001\n\n"
          + "TuneEngine\0226.google.cloud.discoveryengin"
          + "e.v1beta.TuneEngineRequest\032\035.google.long"
          + "running.Operation\"\177\312A(\n\022TuneEngineRespon"
          + "se\022\022TuneEngineMetadata\332A\004name\202\323\344\223\002G\"B/v1"
          + "beta/{name=projects/*/locations/*/collec"
          + "tions/*/engines/*}:tune:\001*\032R\312A\036discovery"
          + "engine.googleapis.com\322A.https://www.goog"
          + "leapis.com/auth/cloud-platformB\231\002\n\'com.g"
          + "oogle.cloud.discoveryengine.v1betaB\022Engi"
          + "neServiceProtoP\001ZQcloud.google.com/go/di"
          + "scoveryengine/apiv1beta/discoveryenginep"
          + "b;discoveryenginepb\242\002\017DISCOVERYENGINE\252\002#"
          + "Google.Cloud.DiscoveryEngine.V1Beta\312\002#Go"
          + "ogle\\Cloud\\DiscoveryEngine\\V1beta\352\002&Goog"
          + "le::Cloud::DiscoveryEngine::V1betab\006prot"
          + "o3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1beta.EngineProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1beta_CreateEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateEngineRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Engine", "EngineId",
            });
    internal_static_google_cloud_discoveryengine_v1beta_CreateEngineMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1beta_CreateEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_CreateEngineMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineMetadata_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_DeleteEngineMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    internal_static_google_cloud_discoveryengine_v1beta_GetEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1beta_GetEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_GetEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListEnginesRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1beta_ListEnginesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListEnginesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ListEnginesResponse_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1beta_ListEnginesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ListEnginesResponse_descriptor,
            new java.lang.String[] {
              "Engines", "NextPageToken",
            });
    internal_static_google_cloud_discoveryengine_v1beta_UpdateEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1beta_UpdateEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_UpdateEngineRequest_descriptor,
            new java.lang.String[] {
              "Engine", "UpdateMask",
            });
    internal_static_google_cloud_discoveryengine_v1beta_PauseEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1beta_PauseEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_PauseEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_ResumeEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_discoveryengine_v1beta_ResumeEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_ResumeEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TuneEngineRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_discoveryengine_v1beta_TuneEngineRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TuneEngineRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TuneEngineMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_discoveryengine_v1beta_TuneEngineMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TuneEngineMetadata_descriptor,
            new java.lang.String[] {
              "Engine",
            });
    internal_static_google_cloud_discoveryengine_v1beta_TuneEngineResponse_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_discoveryengine_v1beta_TuneEngineResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1beta_TuneEngineResponse_descriptor,
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
    com.google.cloud.discoveryengine.v1beta.EngineProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
