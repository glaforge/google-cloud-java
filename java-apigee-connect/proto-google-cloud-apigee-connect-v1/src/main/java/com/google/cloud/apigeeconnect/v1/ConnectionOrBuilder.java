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
// source: google/cloud/apigeeconnect/v1/connection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.apigeeconnect.v1;

public interface ConnectionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigeeconnect.v1.Connection)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The endpoint that the connection is made against.
   * Format: `projects/{project_number}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1;</code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * The endpoint that the connection is made against.
   * Format: `projects/{project_number}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>string endpoint = 1;</code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Cluster information.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
   *
   * @return Whether the cluster field is set.
   */
  boolean hasCluster();
  /**
   *
   *
   * <pre>
   * Cluster information.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
   *
   * @return The cluster.
   */
  com.google.cloud.apigeeconnect.v1.Cluster getCluster();
  /**
   *
   *
   * <pre>
   * Cluster information.
   * </pre>
   *
   * <code>.google.cloud.apigeeconnect.v1.Cluster cluster = 2;</code>
   */
  com.google.cloud.apigeeconnect.v1.ClusterOrBuilder getClusterOrBuilder();

  /**
   *
   *
   * <pre>
   * The count of streams.
   * </pre>
   *
   * <code>int32 stream_count = 3;</code>
   *
   * @return The streamCount.
   */
  int getStreamCount();
}
