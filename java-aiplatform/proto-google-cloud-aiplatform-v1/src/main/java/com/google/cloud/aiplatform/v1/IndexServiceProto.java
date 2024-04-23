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
// source: google/cloud/aiplatform/v1/index_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public final class IndexServiceProto {
  private IndexServiceProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_GetIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n.google/cloud/aiplatform/v1/index_servi"
          + "ce.proto\022\032google.cloud.aiplatform.v1\032\034go"
          + "ogle/api/annotations.proto\032\027google/api/c"
          + "lient.proto\032\037google/api/field_behavior.p"
          + "roto\032\031google/api/resource.proto\032&google/"
          + "cloud/aiplatform/v1/index.proto\032*google/"
          + "cloud/aiplatform/v1/operation.proto\032#goo"
          + "gle/longrunning/operations.proto\032\033google"
          + "/protobuf/empty.proto\032 google/protobuf/f"
          + "ield_mask.proto\"\206\001\n\022CreateIndexRequest\0229"
          + "\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.google"
          + "apis.com/Location\0225\n\005index\030\002 \001(\0132!.googl"
          + "e.cloud.aiplatform.v1.IndexB\003\340A\002\"\346\001\n\034Cre"
          + "ateIndexOperationMetadata\022N\n\020generic_met"
          + "adata\030\001 \001(\01324.google.cloud.aiplatform.v1"
          + ".GenericOperationMetadata\022v\n*nearest_nei"
          + "ghbor_search_operation_metadata\030\002 \001(\0132B."
          + "google.cloud.aiplatform.v1.NearestNeighb"
          + "orSearchOperationMetadata\"H\n\017GetIndexReq"
          + "uest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.g"
          + "oogleapis.com/Index\"\265\001\n\022ListIndexesReque"
          + "st\0229\n\006parent\030\001 \001(\tB)\340A\002\372A#\n!locations.go"
          + "ogleapis.com/Location\022\016\n\006filter\030\002 \001(\t\022\021\n"
          + "\tpage_size\030\003 \001(\005\022\022\n\npage_token\030\004 \001(\t\022-\n\t"
          + "read_mask\030\005 \001(\0132\032.google.protobuf.FieldM"
          + "ask\"b\n\023ListIndexesResponse\0222\n\007indexes\030\001 "
          + "\003(\0132!.google.cloud.aiplatform.v1.Index\022\027"
          + "\n\017next_page_token\030\002 \001(\t\"|\n\022UpdateIndexRe"
          + "quest\0225\n\005index\030\001 \001(\0132!.google.cloud.aipl"
          + "atform.v1.IndexB\003\340A\002\022/\n\013update_mask\030\002 \001("
          + "\0132\032.google.protobuf.FieldMask\"\346\001\n\034Update"
          + "IndexOperationMetadata\022N\n\020generic_metada"
          + "ta\030\001 \001(\01324.google.cloud.aiplatform.v1.Ge"
          + "nericOperationMetadata\022v\n*nearest_neighb"
          + "or_search_operation_metadata\030\002 \001(\0132B.goo"
          + "gle.cloud.aiplatform.v1.NearestNeighborS"
          + "earchOperationMetadata\"K\n\022DeleteIndexReq"
          + "uest\0225\n\004name\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.g"
          + "oogleapis.com/Index\"\307\001\n\027UpsertDatapoints"
          + "Request\0226\n\005index\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatfo"
          + "rm.googleapis.com/Index\022>\n\ndatapoints\030\002 "
          + "\003(\0132*.google.cloud.aiplatform.v1.IndexDa"
          + "tapoint\0224\n\013update_mask\030\003 \001(\0132\032.google.pr"
          + "otobuf.FieldMaskB\003\340A\001\"\032\n\030UpsertDatapoint"
          + "sResponse\"h\n\027RemoveDatapointsRequest\0226\n\005"
          + "index\030\001 \001(\tB\'\340A\002\372A!\n\037aiplatform.googleap"
          + "is.com/Index\022\025\n\rdatapoint_ids\030\002 \003(\t\"\032\n\030R"
          + "emoveDatapointsResponse\"\320\007\n&NearestNeigh"
          + "borSearchOperationMetadata\022{\n\030content_va"
          + "lidation_stats\030\001 \003(\0132Y.google.cloud.aipl"
          + "atform.v1.NearestNeighborSearchOperation"
          + "Metadata.ContentValidationStats\022\030\n\020data_"
          + "bytes_count\030\002 \001(\003\032\271\004\n\013RecordError\022r\n\nerr"
          + "or_type\030\001 \001(\0162^.google.cloud.aiplatform."
          + "v1.NearestNeighborSearchOperationMetadat"
          + "a.RecordError.RecordErrorType\022\025\n\rerror_m"
          + "essage\030\002 \001(\t\022\026\n\016source_gcs_uri\030\003 \001(\t\022\024\n\014"
          + "embedding_id\030\004 \001(\t\022\022\n\nraw_record\030\005 \001(\t\"\334"
          + "\002\n\017RecordErrorType\022\032\n\026ERROR_TYPE_UNSPECI"
          + "FIED\020\000\022\016\n\nEMPTY_LINE\020\001\022\027\n\023INVALID_JSON_S"
          + "YNTAX\020\002\022\026\n\022INVALID_CSV_SYNTAX\020\003\022\027\n\023INVAL"
          + "ID_AVRO_SYNTAX\020\004\022\030\n\024INVALID_EMBEDDING_ID"
          + "\020\005\022\033\n\027EMBEDDING_SIZE_MISMATCH\020\006\022\025\n\021NAMES"
          + "PACE_MISSING\020\007\022\021\n\rPARSING_ERROR\020\010\022\027\n\023DUP"
          + "LICATE_NAMESPACE\020\t\022\023\n\017OP_IN_DATAPOINT\020\n\022"
          + "\023\n\017MULTIPLE_VALUES\020\013\022\031\n\025INVALID_NUMERIC_"
          + "VALUE\020\014\022\024\n\020INVALID_ENCODING\020\r\032\322\001\n\026Conten"
          + "tValidationStats\022\026\n\016source_gcs_uri\030\001 \001(\t"
          + "\022\032\n\022valid_record_count\030\002 \001(\003\022\034\n\024invalid_"
          + "record_count\030\003 \001(\003\022f\n\016partial_errors\030\004 \003"
          + "(\0132N.google.cloud.aiplatform.v1.NearestN"
          + "eighborSearchOperationMetadata.RecordErr"
          + "or2\266\013\n\014IndexService\022\317\001\n\013CreateIndex\022..go"
          + "ogle.cloud.aiplatform.v1.CreateIndexRequ"
          + "est\032\035.google.longrunning.Operation\"q\312A%\n"
          + "\005Index\022\034CreateIndexOperationMetadata\332A\014p"
          + "arent,index\202\323\344\223\0024\"+/v1/{parent=projects/"
          + "*/locations/*}/indexes:\005index\022\226\001\n\010GetInd"
          + "ex\022+.google.cloud.aiplatform.v1.GetIndex"
          + "Request\032!.google.cloud.aiplatform.v1.Ind"
          + "ex\":\332A\004name\202\323\344\223\002-\022+/v1/{name=projects/*/"
          + "locations/*/indexes/*}\022\254\001\n\013ListIndexes\022."
          + ".google.cloud.aiplatform.v1.ListIndexesR"
          + "equest\032/.google.cloud.aiplatform.v1.List"
          + "IndexesResponse\"<\332A\006parent\202\323\344\223\002-\022+/v1/{p"
          + "arent=projects/*/locations/*}/indexes\022\332\001"
          + "\n\013UpdateIndex\022..google.cloud.aiplatform."
          + "v1.UpdateIndexRequest\032\035.google.longrunni"
          + "ng.Operation\"|\312A%\n\005Index\022\034UpdateIndexOpe"
          + "rationMetadata\332A\021index,update_mask\202\323\344\223\002:"
          + "21/v1/{index.name=projects/*/locations/*"
          + "/indexes/*}:\005index\022\313\001\n\013DeleteIndex\022..goo"
          + "gle.cloud.aiplatform.v1.DeleteIndexReque"
          + "st\032\035.google.longrunning.Operation\"m\312A0\n\025"
          + "google.protobuf.Empty\022\027DeleteOperationMe"
          + "tadata\332A\004name\202\323\344\223\002-*+/v1/{name=projects/"
          + "*/locations/*/indexes/*}\022\307\001\n\020UpsertDatap"
          + "oints\0223.google.cloud.aiplatform.v1.Upser"
          + "tDatapointsRequest\0324.google.cloud.aiplat"
          + "form.v1.UpsertDatapointsResponse\"H\202\323\344\223\002B"
          + "\"=/v1/{index=projects/*/locations/*/inde"
          + "xes/*}:upsertDatapoints:\001*\022\307\001\n\020RemoveDat"
          + "apoints\0223.google.cloud.aiplatform.v1.Rem"
          + "oveDatapointsRequest\0324.google.cloud.aipl"
          + "atform.v1.RemoveDatapointsResponse\"H\202\323\344\223"
          + "\002B\"=/v1/{index=projects/*/locations/*/in"
          + "dexes/*}:removeDatapoints:\001*\032M\312A\031aiplatf"
          + "orm.googleapis.com\322A.https://www.googlea"
          + "pis.com/auth/cloud-platformB\317\001\n\036com.goog"
          + "le.cloud.aiplatform.v1B\021IndexServiceProt"
          + "oP\001Z>cloud.google.com/go/aiplatform/apiv"
          + "1/aiplatformpb;aiplatformpb\252\002\032Google.Clo"
          + "ud.AIPlatform.V1\312\002\032Google\\Cloud\\AIPlatfo"
          + "rm\\V1\352\002\035Google::Cloud::AIPlatform::V1b\006p"
          + "roto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.AnnotationsProto.getDescriptor(),
              com.google.api.ClientProto.getDescriptor(),
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.IndexProto.getDescriptor(),
              com.google.cloud.aiplatform.v1.OperationProto.getDescriptor(),
              com.google.longrunning.OperationsProto.getDescriptor(),
              com.google.protobuf.EmptyProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
            });
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateIndexRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Index",
            });
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_CreateIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "NearestNeighborSearchOperationMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_aiplatform_v1_GetIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_GetIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListIndexesRequest_descriptor,
            new java.lang.String[] {
              "Parent", "Filter", "PageSize", "PageToken", "ReadMask",
            });
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_ListIndexesResponse_descriptor,
            new java.lang.String[] {
              "Indexes", "NextPageToken",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateIndexRequest_descriptor,
            new java.lang.String[] {
              "Index", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpdateIndexOperationMetadata_descriptor,
            new java.lang.String[] {
              "GenericMetadata", "NearestNeighborSearchOperationMetadata",
            });
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_DeleteIndexRequest_descriptor,
            new java.lang.String[] {
              "Name",
            });
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpsertDatapointsRequest_descriptor,
            new java.lang.String[] {
              "Index", "Datapoints", "UpdateMask",
            });
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_UpsertDatapointsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RemoveDatapointsRequest_descriptor,
            new java.lang.String[] {
              "Index", "DatapointIds",
            });
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_RemoveDatapointsResponse_descriptor,
            new java.lang.String[] {});
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor,
            new java.lang.String[] {
              "ContentValidationStats", "DataBytesCount",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_RecordError_descriptor,
            new java.lang.String[] {
              "ErrorType", "ErrorMessage", "SourceGcsUri", "EmbeddingId", "RawRecord",
            });
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor =
        internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_aiplatform_v1_NearestNeighborSearchOperationMetadata_ContentValidationStats_descriptor,
            new java.lang.String[] {
              "SourceGcsUri", "ValidRecordCount", "InvalidRecordCount", "PartialErrors",
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
    com.google.cloud.aiplatform.v1.IndexProto.getDescriptor();
    com.google.cloud.aiplatform.v1.OperationProto.getDescriptor();
    com.google.longrunning.OperationsProto.getDescriptor();
    com.google.protobuf.EmptyProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
