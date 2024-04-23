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
// source: google/cloud/notebooks/v1/managed_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.notebooks.v1;

public interface CreateRuntimeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.CreateRuntimeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. Format:
   * `parent=projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this Runtime.
   * </pre>
   *
   * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The runtimeId.
   */
  java.lang.String getRuntimeId();
  /**
   *
   *
   * <pre>
   * Required. User-defined unique ID of this Runtime.
   * </pre>
   *
   * <code>string runtime_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for runtimeId.
   */
  com.google.protobuf.ByteString getRuntimeIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The Runtime to be created.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the runtime field is set.
   */
  boolean hasRuntime();
  /**
   *
   *
   * <pre>
   * Required. The Runtime to be created.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The runtime.
   */
  com.google.cloud.notebooks.v1.Runtime getRuntime();
  /**
   *
   *
   * <pre>
   * Required. The Runtime to be created.
   * </pre>
   *
   * <code>.google.cloud.notebooks.v1.Runtime runtime = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.notebooks.v1.RuntimeOrBuilder getRuntimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Idempotent request UUID.
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
