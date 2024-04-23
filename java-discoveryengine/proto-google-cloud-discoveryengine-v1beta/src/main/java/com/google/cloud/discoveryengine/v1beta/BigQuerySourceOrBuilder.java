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
// source: google/cloud/discoveryengine/v1beta/import_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface BigQuerySourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.BigQuerySource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.type.Date partition_date = 5;</code>
   *
   * @return Whether the partitionDate field is set.
   */
  boolean hasPartitionDate();
  /**
   *
   *
   * <pre>
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.type.Date partition_date = 5;</code>
   *
   * @return The partitionDate.
   */
  com.google.type.Date getPartitionDate();
  /**
   *
   *
   * <pre>
   * BigQuery time partitioned table's _PARTITIONDATE in YYYY-MM-DD format.
   * </pre>
   *
   * <code>.google.type.Date partition_date = 5;</code>
   */
  com.google.type.DateOrBuilder getPartitionDateOrBuilder();

  /**
   *
   *
   * <pre>
   * The project ID (can be project # or ID) that the BigQuery source is in with
   * a length limit of 128 characters. If not specified, inherits the project
   * ID from the parent request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project ID (can be project # or ID) that the BigQuery source is in with
   * a length limit of 128 characters. If not specified, inherits the project
   * ID from the parent request.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery data set to copy the data from with a length limit
   * of 1,024 characters.
   * </pre>
   *
   * <code>string dataset_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The datasetId.
   */
  java.lang.String getDatasetId();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery data set to copy the data from with a length limit
   * of 1,024 characters.
   * </pre>
   *
   * <code>string dataset_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for datasetId.
   */
  com.google.protobuf.ByteString getDatasetIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to copy the data from with a length limit of
   * 1,024 characters.
   * </pre>
   *
   * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableId.
   */
  java.lang.String getTableId();
  /**
   *
   *
   * <pre>
   * Required. The BigQuery table to copy the data from with a length limit of
   * 1,024 characters.
   * </pre>
   *
   * <code>string table_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableId.
   */
  com.google.protobuf.ByteString getTableIdBytes();

  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * BigQuery export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 4;</code>
   *
   * @return The gcsStagingDir.
   */
  java.lang.String getGcsStagingDir();
  /**
   *
   *
   * <pre>
   * Intermediate Cloud Storage directory used for the import with a length
   * limit of 2,000 characters. Can be specified if one wants to have the
   * BigQuery export to a specific Cloud Storage directory.
   * </pre>
   *
   * <code>string gcs_staging_dir = 4;</code>
   *
   * @return The bytes for gcsStagingDir.
   */
  com.google.protobuf.ByteString getGcsStagingDirBytes();

  /**
   *
   *
   * <pre>
   * The schema to use when parsing the data from the source.
   *
   * Supported values for user event imports:
   *
   * * `user_event` (default): One
   * [UserEvent][google.cloud.discoveryengine.v1beta.UserEvent] per row.
   *
   * Supported values for document imports:
   *
   * * `document` (default): One
   * [Document][google.cloud.discoveryengine.v1beta.Document] format per
   *   row. Each document must have a valid
   *   [Document.id][google.cloud.discoveryengine.v1beta.Document.id] and one of
   *   [Document.json_data][google.cloud.discoveryengine.v1beta.Document.json_data]
   *   or
   *   [Document.struct_data][google.cloud.discoveryengine.v1beta.Document.struct_data].
   * * `custom`: One custom data per row in arbitrary format that conforms to
   *   the defined [Schema][google.cloud.discoveryengine.v1beta.Schema] of the
   *   data store. This can only be used by the GENERIC Data Store vertical.
   * </pre>
   *
   * <code>string data_schema = 6;</code>
   *
   * @return The dataSchema.
   */
  java.lang.String getDataSchema();
  /**
   *
   *
   * <pre>
   * The schema to use when parsing the data from the source.
   *
   * Supported values for user event imports:
   *
   * * `user_event` (default): One
   * [UserEvent][google.cloud.discoveryengine.v1beta.UserEvent] per row.
   *
   * Supported values for document imports:
   *
   * * `document` (default): One
   * [Document][google.cloud.discoveryengine.v1beta.Document] format per
   *   row. Each document must have a valid
   *   [Document.id][google.cloud.discoveryengine.v1beta.Document.id] and one of
   *   [Document.json_data][google.cloud.discoveryengine.v1beta.Document.json_data]
   *   or
   *   [Document.struct_data][google.cloud.discoveryengine.v1beta.Document.struct_data].
   * * `custom`: One custom data per row in arbitrary format that conforms to
   *   the defined [Schema][google.cloud.discoveryengine.v1beta.Schema] of the
   *   data store. This can only be used by the GENERIC Data Store vertical.
   * </pre>
   *
   * <code>string data_schema = 6;</code>
   *
   * @return The bytes for dataSchema.
   */
  com.google.protobuf.ByteString getDataSchemaBytes();

  com.google.cloud.discoveryengine.v1beta.BigQuerySource.PartitionCase getPartitionCase();
}
