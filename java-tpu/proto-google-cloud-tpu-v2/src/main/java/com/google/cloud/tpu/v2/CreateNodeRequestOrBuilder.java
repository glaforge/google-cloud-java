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
// source: google/cloud/tpu/v2/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2;

public interface CreateNodeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2.CreateNodeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource name.
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
   * Required. The parent resource name.
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
   * The unqualified resource name.
   * </pre>
   *
   * <code>string node_id = 2;</code>
   *
   * @return The nodeId.
   */
  java.lang.String getNodeId();
  /**
   *
   *
   * <pre>
   * The unqualified resource name.
   * </pre>
   *
   * <code>string node_id = 2;</code>
   *
   * @return The bytes for nodeId.
   */
  com.google.protobuf.ByteString getNodeIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node node = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the node field is set.
   */
  boolean hasNode();
  /**
   *
   *
   * <pre>
   * Required. The node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node node = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The node.
   */
  com.google.cloud.tpu.v2.Node getNode();
  /**
   *
   *
   * <pre>
   * Required. The node.
   * </pre>
   *
   * <code>.google.cloud.tpu.v2.Node node = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.cloud.tpu.v2.NodeOrBuilder getNodeOrBuilder();
}
