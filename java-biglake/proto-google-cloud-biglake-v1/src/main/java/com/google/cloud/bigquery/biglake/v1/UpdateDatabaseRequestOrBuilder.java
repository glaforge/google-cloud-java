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
// source: google/cloud/bigquery/biglake/v1/metastore.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.biglake.v1;

public interface UpdateDatabaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.biglake.v1.UpdateDatabaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The database to update.
   *
   * The database's `name` field is used to identify the database to update.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Database database = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the database field is set.
   */
  boolean hasDatabase();
  /**
   *
   *
   * <pre>
   * Required. The database to update.
   *
   * The database's `name` field is used to identify the database to update.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Database database = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The database.
   */
  com.google.cloud.bigquery.biglake.v1.Database getDatabase();
  /**
   *
   *
   * <pre>
   * Required. The database to update.
   *
   * The database's `name` field is used to identify the database to update.
   * Format:
   * projects/{project_id_or_number}/locations/{location_id}/catalogs/{catalog_id}/databases/{database_id}
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.biglake.v1.Database database = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.biglake.v1.DatabaseOrBuilder getDatabaseOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of fields to update.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If not set, defaults to all of the fields that are allowed to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If not set, defaults to all of the fields that are allowed to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The list of fields to update.
   *
   * For the `FieldMask` definition, see
   * https://developers.google.com/protocol-buffers/docs/reference/google.protobuf#fieldmask
   * If not set, defaults to all of the fields that are allowed to update.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
