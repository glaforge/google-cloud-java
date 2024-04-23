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

public interface BigtableSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.BigtableSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project ID that the Bigtable source is in with a length limit of 128
   * characters. If not specified, inherits the project ID from the parent
   * request.
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
   * The project ID that the Bigtable source is in with a length limit of 128
   * characters. If not specified, inherits the project ID from the parent
   * request.
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
   * Required. The instance ID of the Cloud Bigtable that needs to be imported.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instanceId.
   */
  java.lang.String getInstanceId();
  /**
   *
   *
   * <pre>
   * Required. The instance ID of the Cloud Bigtable that needs to be imported.
   * </pre>
   *
   * <code>string instance_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instanceId.
   */
  com.google.protobuf.ByteString getInstanceIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The table ID of the Cloud Bigtable that needs to be imported.
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
   * Required. The table ID of the Cloud Bigtable that needs to be imported.
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
   * Required. Bigtable options that contains information needed when parsing
   * data into typed structures. For example, column type annotations.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.BigtableOptions bigtable_options = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the bigtableOptions field is set.
   */
  boolean hasBigtableOptions();
  /**
   *
   *
   * <pre>
   * Required. Bigtable options that contains information needed when parsing
   * data into typed structures. For example, column type annotations.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.BigtableOptions bigtable_options = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bigtableOptions.
   */
  com.google.cloud.discoveryengine.v1alpha.BigtableOptions getBigtableOptions();
  /**
   *
   *
   * <pre>
   * Required. Bigtable options that contains information needed when parsing
   * data into typed structures. For example, column type annotations.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1alpha.BigtableOptions bigtable_options = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.BigtableOptionsOrBuilder getBigtableOptionsOrBuilder();
}
