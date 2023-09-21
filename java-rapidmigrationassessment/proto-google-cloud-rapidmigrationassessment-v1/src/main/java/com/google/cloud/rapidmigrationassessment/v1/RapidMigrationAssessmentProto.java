/*
 * Copyright 2023 Google LLC
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
// source: google/cloud/rapidmigrationassessment/v1/rapidmigrationassessment.proto

package com.google.cloud.rapidmigrationassessment.v1;

public final class RapidMigrationAssessmentProto {
  private RapidMigrationAssessmentProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_CreateAnnotationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_CreateAnnotationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_GetAnnotationRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_GetAnnotationRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_CreateCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_CreateCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_GetCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_GetCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_DeleteCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_DeleteCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_UpdateCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_UpdateCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_ResumeCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_ResumeCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_RegisterCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_RegisterCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_PauseCollectorRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_PauseCollectorRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_rapidmigrationassessment_v1_OperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_rapidmigrationassessment_v1_OperationMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\nGgoogle/cloud/rapidmigrationassessment/"
          + "v1/rapidmigrationassessment.proto\022(googl"
          + "e.cloud.rapidmigrationassessment.v1\032\034goo"
          + "gle/api/annotations.proto\032\027google/api/cl"
          + "ient.proto\032\037google/api/field_behavior.pr"
          + "oto\032\031google/api/resource.proto\032;google/c"
          + "loud/rapidmigrationassessment/v1/api_ent"
          + "ities.proto\032#google/longrunning/operatio"
          + "ns.proto\032 google/protobuf/field_mask.pro"
          + "to\032\037google/protobuf/timestamp.proto\"\277\001\n\027"
          + "CreateAnnotationRequest\022:\n\006parent\030\001 \001(\tB"
          + "*\342A\001\002\372A#\n!locations.googleapis.com/Locat"
          + "ion\022N\n\nannotation\030\002 \001(\01324.google.cloud.r"
          + "apidmigrationassessment.v1.AnnotationB\004\342"
          + "A\001\002\022\030\n\nrequest_id\030\004 \001(\tB\004\342A\001\001\"a\n\024GetAnno"
          + "tationRequest\022I\n\004name\030\001 \001(\tB;\342A\001\002\372A4\n2ra"
          + "pidmigrationassessment.googleapis.com/An"
          + "notation\"\330\001\n\026CreateCollectorRequest\022:\n\006p"
          + "arent\030\001 \001(\tB*\342A\001\002\372A#\n!locations.googleap"
          + "is.com/Location\022\032\n\014collector_id\030\002 \001(\tB\004\342"
          + "A\001\002\022L\n\tcollector\030\003 \001(\01323.google.cloud.ra"
          + "pidmigrationassessment.v1.CollectorB\004\342A\001"
          + "\002\022\030\n\nrequest_id\030\004 \001(\tB\004\342A\001\001\"\234\001\n\025ListColl"
          + "ectorsRequest\022:\n\006parent\030\001 \001(\tB*\342A\001\002\372A#\n!"
          + "locations.googleapis.com/Location\022\021\n\tpag"
          + "e_size\030\002 \001(\005\022\022\n\npage_token\030\003 \001(\t\022\016\n\006filt"
          + "er\030\004 \001(\t\022\020\n\010order_by\030\005 \001(\t\"\217\001\n\026ListColle"
          + "ctorsResponse\022G\n\ncollectors\030\001 \003(\01323.goog"
          + "le.cloud.rapidmigrationassessment.v1.Col"
          + "lector\022\027\n\017next_page_token\030\002 \001(\t\022\023\n\013unrea"
          + "chable\030\003 \003(\t\"_\n\023GetCollectorRequest\022H\n\004n"
          + "ame\030\001 \001(\tB:\342A\001\002\372A3\n1rapidmigrationassess"
          + "ment.googleapis.com/Collector\"|\n\026DeleteC"
          + "ollectorRequest\022H\n\004name\030\001 \001(\tB:\342A\001\002\372A3\n1"
          + "rapidmigrationassessment.googleapis.com/"
          + "Collector\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\001\"\267\001\n\026"
          + "UpdateCollectorRequest\0225\n\013update_mask\030\001 "
          + "\001(\0132\032.google.protobuf.FieldMaskB\004\342A\001\002\022L\n"
          + "\tcollector\030\002 \001(\01323.google.cloud.rapidmig"
          + "rationassessment.v1.CollectorB\004\342A\001\002\022\030\n\nr"
          + "equest_id\030\003 \001(\tB\004\342A\001\001\"|\n\026ResumeCollector"
          + "Request\022H\n\004name\030\001 \001(\tB:\342A\001\002\372A3\n1rapidmig"
          + "rationassessment.googleapis.com/Collecto"
          + "r\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\001\"~\n\030RegisterC"
          + "ollectorRequest\022H\n\004name\030\001 \001(\tB:\342A\001\002\372A3\n1"
          + "rapidmigrationassessment.googleapis.com/"
          + "Collector\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\001\"{\n\025P"
          + "auseCollectorRequest\022H\n\004name\030\001 \001(\tB:\342A\001\002"
          + "\372A3\n1rapidmigrationassessment.googleapis"
          + ".com/Collector\022\030\n\nrequest_id\030\002 \001(\tB\004\342A\001\001"
          + "\"\207\002\n\021OperationMetadata\0225\n\013create_time\030\001 "
          + "\001(\0132\032.google.protobuf.TimestampB\004\342A\001\003\0222\n"
          + "\010end_time\030\002 \001(\0132\032.google.protobuf.Timest"
          + "ampB\004\342A\001\003\022\024\n\006target\030\003 \001(\tB\004\342A\001\003\022\022\n\004verb\030"
          + "\004 \001(\tB\004\342A\001\003\022\034\n\016status_message\030\005 \001(\tB\004\342A\001"
          + "\003\022$\n\026requested_cancellation\030\006 \001(\010B\004\342A\001\003\022"
          + "\031\n\013api_version\030\007 \001(\tB\004\342A\001\0032\267\022\n\030RapidMigr"
          + "ationAssessment\022\367\001\n\017CreateCollector\022@.go"
          + "ogle.cloud.rapidmigrationassessment.v1.C"
          + "reateCollectorRequest\032\035.google.longrunni"
          + "ng.Operation\"\202\001\312A\036\n\tCollector\022\021Operation"
          + "Metadata\332A\035parent,collector,collector_id"
          + "\202\323\344\223\002;\"./v1/{parent=projects/*/locations"
          + "/*}/collectors:\tcollector\022\357\001\n\020CreateAnno"
          + "tation\022A.google.cloud.rapidmigrationasse"
          + "ssment.v1.CreateAnnotationRequest\032\035.goog"
          + "le.longrunning.Operation\"y\312A\037\n\nAnnotatio"
          + "n\022\021OperationMetadata\332A\021parent,annotation"
          + "\202\323\344\223\002=\"//v1/{parent=projects/*/locations"
          + "/*}/annotations:\nannotation\022\305\001\n\rGetAnnot"
          + "ation\022>.google.cloud.rapidmigrationasses"
          + "sment.v1.GetAnnotationRequest\0324.google.c"
          + "loud.rapidmigrationassessment.v1.Annotat"
          + "ion\">\332A\004name\202\323\344\223\0021\022//v1/{name=projects/*"
          + "/locations/*/annotations/*}\022\324\001\n\016ListColl"
          + "ectors\022?.google.cloud.rapidmigrationasse"
          + "ssment.v1.ListCollectorsRequest\032@.google"
          + ".cloud.rapidmigrationassessment.v1.ListC"
          + "ollectorsResponse\"?\332A\006parent\202\323\344\223\0020\022./v1/"
          + "{parent=projects/*/locations/*}/collecto"
          + "rs\022\301\001\n\014GetCollector\022=.google.cloud.rapid"
          + "migrationassessment.v1.GetCollectorReque"
          + "st\0323.google.cloud.rapidmigrationassessme"
          + "nt.v1.Collector\"=\332A\004name\202\323\344\223\0020\022./v1/{nam"
          + "e=projects/*/locations/*/collectors/*}\022\371"
          + "\001\n\017UpdateCollector\022@.google.cloud.rapidm"
          + "igrationassessment.v1.UpdateCollectorReq"
          + "uest\032\035.google.longrunning.Operation\"\204\001\312A"
          + "\036\n\tCollector\022\021OperationMetadata\332A\025collec"
          + "tor,update_mask\202\323\344\223\002E28/v1/{collector.na"
          + "me=projects/*/locations/*/collectors/*}:"
          + "\tcollector\022\322\001\n\017DeleteCollector\022@.google."
          + "cloud.rapidmigrationassessment.v1.Delete"
          + "CollectorRequest\032\035.google.longrunning.Op"
          + "eration\"^\312A\036\n\tCollector\022\021OperationMetada"
          + "ta\332A\004name\202\323\344\223\0020*./v1/{name=projects/*/lo"
          + "cations/*/collectors/*}\022\334\001\n\017ResumeCollec"
          + "tor\022@.google.cloud.rapidmigrationassessm"
          + "ent.v1.ResumeCollectorRequest\032\035.google.l"
          + "ongrunning.Operation\"h\312A\036\n\tCollector\022\021Op"
          + "erationMetadata\332A\004name\202\323\344\223\002:\"5/v1/{name="
          + "projects/*/locations/*/collectors/*}:res"
          + "ume:\001*\022\342\001\n\021RegisterCollector\022B.google.cl"
          + "oud.rapidmigrationassessment.v1.Register"
          + "CollectorRequest\032\035.google.longrunning.Op"
          + "eration\"j\312A\036\n\tCollector\022\021OperationMetada"
          + "ta\332A\004name\202\323\344\223\002<\"7/v1/{name=projects/*/lo"
          + "cations/*/collectors/*}:register:\001*\022\331\001\n\016"
          + "PauseCollector\022?.google.cloud.rapidmigra"
          + "tionassessment.v1.PauseCollectorRequest\032"
          + "\035.google.longrunning.Operation\"g\312A\036\n\tCol"
          + "lector\022\021OperationMetadata\332A\004name\202\323\344\223\0029\"4"
          + "/v1/{name=projects/*/locations/*/collect"
          + "ors/*}:pause:\001*\032[\312A\'rapidmigrationassess"
          + "ment.googleapis.com\322A.https://www.google"
          + "apis.com/auth/cloud-platformB\275\002\n,com.goo"
          + "gle.cloud.rapidmigrationassessment.v1B\035R"
          + "apidMigrationAssessmentProtoP\001Zhcloud.go"
          + "ogle.com/go/rapidmigrationassessment/api"
          + "v1/rapidmigrationassessmentpb;rapidmigra"
          + "tionassessmentpb\252\002(Google.Cloud.RapidMig"
          + "rationAssessment.V1\312\002(Google\\Cloud\\Rapid"
          + "MigrationAssessment\\V1\352\002+Google::Cloud::"
          + "RapidMigrationAssessment::V1b\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_CreateAnnotationRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_rapidmigrationassessment_v1_CreateAnnotationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_CreateAnnotationRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Annotation", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_GetAnnotationRequest_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_rapidmigrationassessment_v1_GetAnnotationRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_GetAnnotationRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_CreateCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_rapidmigrationassessment_v1_CreateCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_CreateCollectorRequest_descriptor,
            new java.lang.String[] {
              "Parent", "CollectorId", "Collector", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsRequest_descriptor,
            new java.lang.String[] {
              "Parent", "PageSize", "PageToken", "Filter", "OrderBy",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_ListCollectorsResponse_descriptor,
            new java.lang.String[] {
              "Collectors", "NextPageToken", "Unreachable",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_GetCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_rapidmigrationassessment_v1_GetCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_GetCollectorRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_DeleteCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_rapidmigrationassessment_v1_DeleteCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_DeleteCollectorRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_UpdateCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_rapidmigrationassessment_v1_UpdateCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_UpdateCollectorRequest_descriptor,
            new java.lang.String[] {
              "UpdateMask", "Collector", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_ResumeCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_rapidmigrationassessment_v1_ResumeCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_ResumeCollectorRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_RegisterCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_rapidmigrationassessment_v1_RegisterCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_RegisterCollectorRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_PauseCollectorRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_rapidmigrationassessment_v1_PauseCollectorRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_PauseCollectorRequest_descriptor,
            new java.lang.String[] {
              "Name", "RequestId",
            });
    internal_static_google_cloud_rapidmigrationassessment_v1_OperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_rapidmigrationassessment_v1_OperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_rapidmigrationassessment_v1_OperationMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime",
              "EndTime",
              "Target",
              "Verb",
              "StatusMessage",
              "RequestedCancellation",
              "ApiVersion",
            });
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
    com.google.cloud.rapidmigrationassessment.v1.ApiEntitiesProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
