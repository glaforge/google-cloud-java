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
// source: google/cloud/metastore/v1alpha/metastore.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.metastore.v1alpha;

public interface ExportMetadataRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.metastore.v1alpha.ExportMetadataRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A Cloud Storage URI of a folder, in the format
   * `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;`. A sub-folder
   * `&lt;export_folder&gt;` containing exported files will be created below it.
   * </pre>
   *
   * <code>string destination_gcs_folder = 2;</code>
   *
   * @return Whether the destinationGcsFolder field is set.
   */
  boolean hasDestinationGcsFolder();
  /**
   *
   *
   * <pre>
   * A Cloud Storage URI of a folder, in the format
   * `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;`. A sub-folder
   * `&lt;export_folder&gt;` containing exported files will be created below it.
   * </pre>
   *
   * <code>string destination_gcs_folder = 2;</code>
   *
   * @return The destinationGcsFolder.
   */
  java.lang.String getDestinationGcsFolder();
  /**
   *
   *
   * <pre>
   * A Cloud Storage URI of a folder, in the format
   * `gs://&lt;bucket_name&gt;/&lt;path_inside_bucket&gt;`. A sub-folder
   * `&lt;export_folder&gt;` containing exported files will be created below it.
   * </pre>
   *
   * <code>string destination_gcs_folder = 2;</code>
   *
   * @return The bytes for destinationGcsFolder.
   */
  com.google.protobuf.ByteString getDestinationGcsFolderBytes();

  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to run
   * export, in the following form:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The service.
   */
  java.lang.String getService();
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to run
   * export, in the following form:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for service.
   */
  com.google.protobuf.ByteString getServiceBytes();

  /**
   *
   *
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   *
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   *
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format).
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A request ID. Specify a unique request ID to allow the server to
   * ignore the request if it has completed. The server will ignore subsequent
   * requests that provide a duplicate request ID for at least 60 minutes after
   * the first request.
   *
   * For example, if an initial request times out, followed by another request
   * with the same request ID, the server ignores the second request to prevent
   * the creation of duplicate commitments.
   *
   * The request ID must be a valid
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier#Format).
   * A zero UUID (00000000-0000-0000-0000-000000000000) is not supported.
   * </pre>
   *
   * <code>string request_id = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The type of the database dump. If unspecified, defaults to
   * `MYSQL`.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.DatabaseDumpSpec.Type database_dump_type = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for databaseDumpType.
   */
  int getDatabaseDumpTypeValue();
  /**
   *
   *
   * <pre>
   * Optional. The type of the database dump. If unspecified, defaults to
   * `MYSQL`.
   * </pre>
   *
   * <code>
   * .google.cloud.metastore.v1alpha.DatabaseDumpSpec.Type database_dump_type = 4 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The databaseDumpType.
   */
  com.google.cloud.metastore.v1alpha.DatabaseDumpSpec.Type getDatabaseDumpType();

  com.google.cloud.metastore.v1alpha.ExportMetadataRequest.DestinationCase getDestinationCase();
}
