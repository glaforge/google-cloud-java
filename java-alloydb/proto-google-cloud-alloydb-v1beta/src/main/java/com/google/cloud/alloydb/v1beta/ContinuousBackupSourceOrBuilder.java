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
// source: google/cloud/alloydb/v1beta/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.alloydb.v1beta;

public interface ContinuousBackupSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.ContinuousBackupSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The source cluster from which to restore. This cluster must have
   * continuous backup enabled for this operation to succeed. For the required
   * format, see the comment on the Cluster.name field.
   * </pre>
   *
   * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   *
   *
   * <pre>
   * Required. The source cluster from which to restore. This cluster must have
   * continuous backup enabled for this operation to succeed. For the required
   * format, see the comment on the Cluster.name field.
   * </pre>
   *
   * <code>string cluster = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * Required. The point in time to restore to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the pointInTime field is set.
   */
  boolean hasPointInTime();
  /**
   *
   *
   * <pre>
   * Required. The point in time to restore to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The pointInTime.
   */
  com.google.protobuf.Timestamp getPointInTime();
  /**
   *
   *
   * <pre>
   * Required. The point in time to restore to.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp point_in_time = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getPointInTimeOrBuilder();
}
