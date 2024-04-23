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
// source: google/cloud/discoveryengine/v1alpha/import_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public final class ImportConfigProto {
  private ImportConfigProto() {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistryLite registry) {}

  public static void registerAllExtensions(com.google.protobuf.ExtensionRegistry registry) {
    registerAllExtensions((com.google.protobuf.ExtensionRegistryLite) registry);
  }

  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_SpannerSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_SpannerSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumnFamily_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumnFamily_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumn_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumn_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_FamiliesEntry_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_FamiliesEntry_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_BigtableSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_CloudSqlSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_CloudSqlSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_FirestoreSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_FirestoreSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_InlineSource_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_InlineSource_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesResponse_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesResponse_fieldAccessorTable;
  static final com.google.protobuf.Descriptors.Descriptor
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesMetadata_descriptor;
  static final com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesMetadata_fieldAccessorTable;

  public static com.google.protobuf.Descriptors.FileDescriptor getDescriptor() {
    return descriptor;
  }

  private static com.google.protobuf.Descriptors.FileDescriptor descriptor;

  static {
    java.lang.String[] descriptorData = {
      "\n8google/cloud/discoveryengine/v1alpha/i"
          + "mport_config.proto\022$google.cloud.discove"
          + "ryengine.v1alpha\032\037google/api/field_behav"
          + "ior.proto\032\031google/api/resource.proto\0325go"
          + "ogle/cloud/discoveryengine/v1alpha/compl"
          + "etion.proto\0323google/cloud/discoveryengin"
          + "e/v1alpha/document.proto\0325google/cloud/d"
          + "iscoveryengine/v1alpha/user_event.proto\032"
          + " google/protobuf/field_mask.proto\032\037googl"
          + "e/protobuf/timestamp.proto\032\027google/rpc/s"
          + "tatus.proto\032\026google/type/date.proto\"9\n\tG"
          + "csSource\022\027\n\ninput_uris\030\001 \003(\tB\003\340A\002\022\023\n\013dat"
          + "a_schema\030\002 \001(\t\"\274\001\n\016BigQuerySource\022+\n\016par"
          + "tition_date\030\005 \001(\0132\021.google.type.DateH\000\022\022"
          + "\n\nproject_id\030\001 \001(\t\022\027\n\ndataset_id\030\002 \001(\tB\003"
          + "\340A\002\022\025\n\010table_id\030\003 \001(\tB\003\340A\002\022\027\n\017gcs_stagin"
          + "g_dir\030\004 \001(\t\022\023\n\013data_schema\030\006 \001(\tB\013\n\tpart"
          + "ition\"\211\001\n\rSpannerSource\022\022\n\nproject_id\030\001 "
          + "\001(\t\022\030\n\013instance_id\030\002 \001(\tB\003\340A\002\022\030\n\013databas"
          + "e_id\030\003 \001(\tB\003\340A\002\022\025\n\010table_id\030\004 \001(\tB\003\340A\002\022\031"
          + "\n\021enable_data_boost\030\005 \001(\010\"\260\007\n\017BigtableOp"
          + "tions\022\026\n\016key_field_name\030\001 \001(\t\022U\n\010familie"
          + "s\030\002 \003(\0132C.google.cloud.discoveryengine.v"
          + "1alpha.BigtableOptions.FamiliesEntry\032\235\002\n"
          + "\024BigtableColumnFamily\022\022\n\nfield_name\030\001 \001("
          + "\t\022P\n\010encoding\030\002 \001(\0162>.google.cloud.disco"
          + "veryengine.v1alpha.BigtableOptions.Encod"
          + "ing\022H\n\004type\030\003 \001(\0162:.google.cloud.discove"
          + "ryengine.v1alpha.BigtableOptions.Type\022U\n"
          + "\007columns\030\004 \003(\0132D.google.cloud.discoverye"
          + "ngine.v1alpha.BigtableOptions.BigtableCo"
          + "lumn\032\330\001\n\016BigtableColumn\022\026\n\tqualifier\030\001 \001"
          + "(\014B\003\340A\002\022\022\n\nfield_name\030\002 \001(\t\022P\n\010encoding\030"
          + "\003 \001(\0162>.google.cloud.discoveryengine.v1a"
          + "lpha.BigtableOptions.Encoding\022H\n\004type\030\004 "
          + "\001(\0162:.google.cloud.discoveryengine.v1alp"
          + "ha.BigtableOptions.Type\032{\n\rFamiliesEntry"
          + "\022\013\n\003key\030\001 \001(\t\022Y\n\005value\030\002 \001(\0132J.google.cl"
          + "oud.discoveryengine.v1alpha.BigtableOpti"
          + "ons.BigtableColumnFamily:\0028\001\"z\n\004Type\022\024\n\020"
          + "TYPE_UNSPECIFIED\020\000\022\n\n\006STRING\020\001\022\n\n\006NUMBER"
          + "\020\002\022\013\n\007INTEGER\020\003\022\017\n\013VAR_INTEGER\020\004\022\017\n\013BIG_"
          + "NUMERIC\020\005\022\013\n\007BOOLEAN\020\006\022\010\n\004JSON\020\007\":\n\010Enco"
          + "ding\022\030\n\024ENCODING_UNSPECIFIED\020\000\022\010\n\004TEXT\020\001"
          + "\022\n\n\006BINARY\020\002\"\253\001\n\016BigtableSource\022\022\n\nproje"
          + "ct_id\030\001 \001(\t\022\030\n\013instance_id\030\002 \001(\tB\003\340A\002\022\025\n"
          + "\010table_id\030\003 \001(\tB\003\340A\002\022T\n\020bigtable_options"
          + "\030\004 \001(\01325.google.cloud.discoveryengine.v1"
          + "alpha.BigtableOptionsB\003\340A\002\"k\n\017FhirStoreS"
          + "ource\022?\n\nfhir_store\030\001 \001(\tB+\340A\002\372A%\n#healt"
          + "hcare.googleapis.com/FhirStore\022\027\n\017gcs_st"
          + "aging_dir\030\002 \001(\t\"\231\001\n\016CloudSqlSource\022\022\n\npr"
          + "oject_id\030\001 \001(\t\022\030\n\013instance_id\030\002 \001(\tB\003\340A\002"
          + "\022\030\n\013database_id\030\003 \001(\tB\003\340A\002\022\025\n\010table_id\030\004"
          + " \001(\tB\003\340A\002\022\027\n\017gcs_staging_dir\030\005 \001(\t\022\017\n\007of"
          + "fload\030\006 \001(\010\"t\n\017FirestoreSource\022\022\n\nprojec"
          + "t_id\030\001 \001(\t\022\030\n\013database_id\030\002 \001(\tB\003\340A\002\022\032\n\r"
          + "collection_id\030\003 \001(\tB\003\340A\002\022\027\n\017gcs_staging_"
          + "dir\030\004 \001(\t\"8\n\021ImportErrorConfig\022\024\n\ngcs_pr"
          + "efix\030\001 \001(\tH\000B\r\n\013destination\"\214\004\n\027ImportUs"
          + "erEventsRequest\022c\n\rinline_source\030\002 \001(\0132J"
          + ".google.cloud.discoveryengine.v1alpha.Im"
          + "portUserEventsRequest.InlineSourceH\000\022E\n\n"
          + "gcs_source\030\003 \001(\0132/.google.cloud.discover"
          + "yengine.v1alpha.GcsSourceH\000\022O\n\017bigquery_"
          + "source\030\004 \001(\01324.google.cloud.discoveryeng"
          + "ine.v1alpha.BigQuerySourceH\000\022@\n\006parent\030\001"
          + " \001(\tB0\340A\002\372A*\n(discoveryengine.googleapis"
          + ".com/DataStore\022M\n\014error_config\030\005 \001(\01327.g"
          + "oogle.cloud.discoveryengine.v1alpha.Impo"
          + "rtErrorConfig\032Y\n\014InlineSource\022I\n\013user_ev"
          + "ents\030\001 \003(\0132/.google.cloud.discoveryengin"
          + "e.v1alpha.UserEventB\003\340A\002B\010\n\006source\"\320\001\n\030I"
          + "mportUserEventsResponse\022)\n\rerror_samples"
          + "\030\001 \003(\0132\022.google.rpc.Status\022M\n\014error_conf"
          + "ig\030\002 \001(\01327.google.cloud.discoveryengine."
          + "v1alpha.ImportErrorConfig\022\033\n\023joined_even"
          + "ts_count\030\003 \001(\003\022\035\n\025unjoined_events_count\030"
          + "\004 \001(\003\"\252\001\n\030ImportUserEventsMetadata\022/\n\013cr"
          + "eate_time\030\001 \001(\0132\032.google.protobuf.Timest"
          + "amp\022/\n\013update_time\030\002 \001(\0132\032.google.protob"
          + "uf.Timestamp\022\025\n\rsuccess_count\030\003 \001(\003\022\025\n\rf"
          + "ailure_count\030\004 \001(\003\"\276\001\n\027ImportDocumentsMe"
          + "tadata\022/\n\013create_time\030\001 \001(\0132\032.google.pro"
          + "tobuf.Timestamp\022/\n\013update_time\030\002 \001(\0132\032.g"
          + "oogle.protobuf.Timestamp\022\025\n\rsuccess_coun"
          + "t\030\003 \001(\003\022\025\n\rfailure_count\030\004 \001(\003\022\023\n\013total_"
          + "count\030\005 \001(\003\"\277\t\n\026ImportDocumentsRequest\022b"
          + "\n\rinline_source\030\002 \001(\0132I.google.cloud.dis"
          + "coveryengine.v1alpha.ImportDocumentsRequ"
          + "est.InlineSourceH\000\022E\n\ngcs_source\030\003 \001(\0132/"
          + ".google.cloud.discoveryengine.v1alpha.Gc"
          + "sSourceH\000\022O\n\017bigquery_source\030\004 \001(\01324.goo"
          + "gle.cloud.discoveryengine.v1alpha.BigQue"
          + "rySourceH\000\022R\n\021fhir_store_source\030\n \001(\01325."
          + "google.cloud.discoveryengine.v1alpha.Fhi"
          + "rStoreSourceH\000\022M\n\016spanner_source\030\013 \001(\01323"
          + ".google.cloud.discoveryengine.v1alpha.Sp"
          + "annerSourceH\000\022P\n\020cloud_sql_source\030\014 \001(\0132"
          + "4.google.cloud.discoveryengine.v1alpha.C"
          + "loudSqlSourceH\000\022Q\n\020firestore_source\030\r \001("
          + "\01325.google.cloud.discoveryengine.v1alpha"
          + ".FirestoreSourceH\000\022O\n\017bigtable_source\030\017 "
          + "\001(\01324.google.cloud.discoveryengine.v1alp"
          + "ha.BigtableSourceH\000\022=\n\006parent\030\001 \001(\tB-\340A\002"
          + "\372A\'\n%discoveryengine.googleapis.com/Bran"
          + "ch\022M\n\014error_config\030\005 \001(\01327.google.cloud."
          + "discoveryengine.v1alpha.ImportErrorConfi"
          + "g\022l\n\023reconciliation_mode\030\006 \001(\0162O.google."
          + "cloud.discoveryengine.v1alpha.ImportDocu"
          + "mentsRequest.ReconciliationMode\022/\n\013updat"
          + "e_mask\030\007 \001(\0132\032.google.protobuf.FieldMask"
          + "\022\031\n\021auto_generate_ids\030\010 \001(\010\022\020\n\010id_field\030"
          + "\t \001(\t\032V\n\014InlineSource\022F\n\tdocuments\030\001 \003(\013"
          + "2..google.cloud.discoveryengine.v1alpha."
          + "DocumentB\003\340A\002\"T\n\022ReconciliationMode\022#\n\037R"
          + "ECONCILIATION_MODE_UNSPECIFIED\020\000\022\017\n\013INCR"
          + "EMENTAL\020\001\022\010\n\004FULL\020\002B\010\n\006source\"\223\001\n\027Import"
          + "DocumentsResponse\022)\n\rerror_samples\030\001 \003(\013"
          + "2\022.google.rpc.Status\022M\n\014error_config\030\002 \001"
          + "(\01327.google.cloud.discoveryengine.v1alph"
          + "a.ImportErrorConfig\"\224\003\n&ImportSuggestion"
          + "DenyListEntriesRequest\022r\n\rinline_source\030"
          + "\002 \001(\0132Y.google.cloud.discoveryengine.v1a"
          + "lpha.ImportSuggestionDenyListEntriesRequ"
          + "est.InlineSourceH\000\022E\n\ngcs_source\030\003 \001(\0132/"
          + ".google.cloud.discoveryengine.v1alpha.Gc"
          + "sSourceH\000\022@\n\006parent\030\001 \001(\tB0\340A\002\372A*\n(disco"
          + "veryengine.googleapis.com/DataStore\032c\n\014I"
          + "nlineSource\022S\n\007entries\030\001 \003(\0132=.google.cl"
          + "oud.discoveryengine.v1alpha.SuggestionDe"
          + "nyListEntryB\003\340A\002B\010\n\006source\"\222\001\n\'ImportSug"
          + "gestionDenyListEntriesResponse\022)\n\rerror_"
          + "samples\030\001 \003(\0132\022.google.rpc.Status\022\036\n\026imp"
          + "orted_entries_count\030\002 \001(\003\022\034\n\024failed_entr"
          + "ies_count\030\003 \001(\003\"\213\001\n\'ImportSuggestionDeny"
          + "ListEntriesMetadata\022/\n\013create_time\030\001 \001(\013"
          + "2\032.google.protobuf.Timestamp\022/\n\013update_t"
          + "ime\030\002 \001(\0132\032.google.protobuf.TimestampB\235\002"
          + "\n(com.google.cloud.discoveryengine.v1alp"
          + "haB\021ImportConfigProtoP\001ZRcloud.google.co"
          + "m/go/discoveryengine/apiv1alpha/discover"
          + "yenginepb;discoveryenginepb\242\002\017DISCOVERYE"
          + "NGINE\252\002$Google.Cloud.DiscoveryEngine.V1A"
          + "lpha\312\002$Google\\Cloud\\DiscoveryEngine\\V1al"
          + "pha\352\002\'Google::Cloud::DiscoveryEngine::V1"
          + "alphab\006proto3"
    };
    descriptor =
        com.google.protobuf.Descriptors.FileDescriptor.internalBuildGeneratedFileFrom(
            descriptorData,
            new com.google.protobuf.Descriptors.FileDescriptor[] {
              com.google.api.FieldBehaviorProto.getDescriptor(),
              com.google.api.ResourceProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.CompletionProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.DocumentProto.getDescriptor(),
              com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor(),
              com.google.protobuf.FieldMaskProto.getDescriptor(),
              com.google.protobuf.TimestampProto.getDescriptor(),
              com.google.rpc.StatusProto.getDescriptor(),
              com.google.type.DateProto.getDescriptor(),
            });
    internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_descriptor =
        getDescriptor().getMessageTypes().get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_GcsSource_descriptor,
            new java.lang.String[] {
              "InputUris", "DataSchema",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_descriptor =
        getDescriptor().getMessageTypes().get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigQuerySource_descriptor,
            new java.lang.String[] {
              "PartitionDate",
              "ProjectId",
              "DatasetId",
              "TableId",
              "GcsStagingDir",
              "DataSchema",
              "Partition",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_SpannerSource_descriptor =
        getDescriptor().getMessageTypes().get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_SpannerSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_SpannerSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "InstanceId", "DatabaseId", "TableId", "EnableDataBoost",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_descriptor =
        getDescriptor().getMessageTypes().get(3);
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_descriptor,
            new java.lang.String[] {
              "KeyFieldName", "Families",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumnFamily_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumnFamily_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumnFamily_descriptor,
            new java.lang.String[] {
              "FieldName", "Encoding", "Type", "Columns",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumn_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_descriptor
            .getNestedTypes()
            .get(1);
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumn_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_BigtableColumn_descriptor,
            new java.lang.String[] {
              "Qualifier", "FieldName", "Encoding", "Type",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_FamiliesEntry_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_descriptor
            .getNestedTypes()
            .get(2);
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_FamiliesEntry_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigtableOptions_FamiliesEntry_descriptor,
            new java.lang.String[] {
              "Key", "Value",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableSource_descriptor =
        getDescriptor().getMessageTypes().get(4);
    internal_static_google_cloud_discoveryengine_v1alpha_BigtableSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_BigtableSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "InstanceId", "TableId", "BigtableOptions",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_descriptor =
        getDescriptor().getMessageTypes().get(5);
    internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_FhirStoreSource_descriptor,
            new java.lang.String[] {
              "FhirStore", "GcsStagingDir",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_CloudSqlSource_descriptor =
        getDescriptor().getMessageTypes().get(6);
    internal_static_google_cloud_discoveryengine_v1alpha_CloudSqlSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_CloudSqlSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "InstanceId", "DatabaseId", "TableId", "GcsStagingDir", "Offload",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_FirestoreSource_descriptor =
        getDescriptor().getMessageTypes().get(7);
    internal_static_google_cloud_discoveryengine_v1alpha_FirestoreSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_FirestoreSource_descriptor,
            new java.lang.String[] {
              "ProjectId", "DatabaseId", "CollectionId", "GcsStagingDir",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_descriptor =
        getDescriptor().getMessageTypes().get(8);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportErrorConfig_descriptor,
            new java.lang.String[] {
              "GcsPrefix", "Destination",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor =
        getDescriptor().getMessageTypes().get(9);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource", "GcsSource", "BigquerySource", "Parent", "ErrorConfig", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "UserEvents",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_descriptor =
        getDescriptor().getMessageTypes().get(10);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig", "JoinedEventsCount", "UnjoinedEventsCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(11);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportUserEventsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_descriptor =
        getDescriptor().getMessageTypes().get(12);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime", "SuccessCount", "FailureCount", "TotalCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor =
        getDescriptor().getMessageTypes().get(13);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor,
            new java.lang.String[] {
              "InlineSource",
              "GcsSource",
              "BigquerySource",
              "FhirStoreSource",
              "SpannerSource",
              "CloudSqlSource",
              "FirestoreSource",
              "BigtableSource",
              "Parent",
              "ErrorConfig",
              "ReconciliationMode",
              "UpdateMask",
              "AutoGenerateIds",
              "IdField",
              "Source",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Documents",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_descriptor =
        getDescriptor().getMessageTypes().get(14);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportDocumentsResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ErrorConfig",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_descriptor =
        getDescriptor().getMessageTypes().get(15);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_descriptor,
            new java.lang.String[] {
              "InlineSource", "GcsSource", "Parent", "Source",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_InlineSource_descriptor =
        internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_descriptor
            .getNestedTypes()
            .get(0);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_InlineSource_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesRequest_InlineSource_descriptor,
            new java.lang.String[] {
              "Entries",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesResponse_descriptor =
        getDescriptor().getMessageTypes().get(16);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesResponse_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesResponse_descriptor,
            new java.lang.String[] {
              "ErrorSamples", "ImportedEntriesCount", "FailedEntriesCount",
            });
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesMetadata_descriptor =
        getDescriptor().getMessageTypes().get(17);
    internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesMetadata_fieldAccessorTable =
        new com.google.protobuf.GeneratedMessageV3.FieldAccessorTable(
            internal_static_google_cloud_discoveryengine_v1alpha_ImportSuggestionDenyListEntriesMetadata_descriptor,
            new java.lang.String[] {
              "CreateTime", "UpdateTime",
            });
    com.google.protobuf.ExtensionRegistry registry =
        com.google.protobuf.ExtensionRegistry.newInstance();
    registry.add(com.google.api.FieldBehaviorProto.fieldBehavior);
    registry.add(com.google.api.ResourceProto.resourceReference);
    com.google.protobuf.Descriptors.FileDescriptor.internalUpdateFileDescriptor(
        descriptor, registry);
    com.google.api.FieldBehaviorProto.getDescriptor();
    com.google.api.ResourceProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.CompletionProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.DocumentProto.getDescriptor();
    com.google.cloud.discoveryengine.v1alpha.UserEventProto.getDescriptor();
    com.google.protobuf.FieldMaskProto.getDescriptor();
    com.google.protobuf.TimestampProto.getDescriptor();
    com.google.rpc.StatusProto.getDescriptor();
    com.google.type.DateProto.getDescriptor();
  }

  // @@protoc_insertion_point(outer_class_scope)
}
