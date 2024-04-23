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

public interface UpdateIndexRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.UpdateIndexRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Index which updates the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the index field is set.
   */
  boolean hasIndex();
  /**
   *
   *
   * <pre>
   * Required. The Index which updates the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The index.
   */
  com.google.cloud.aiplatform.v1.Index getIndex();
  /**
   *
   *
   * <pre>
   * Required. The Index which updates the resource on the server.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1.Index index = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.IndexOrBuilder getIndexOrBuilder();

  /**
   *
   *
   * <pre>
   * The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
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
   * The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
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
   * The update mask applies to the resource.
   * For the `FieldMask` definition, see
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
