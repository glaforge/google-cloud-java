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
// source: google/cloud/networkmanagement/v1/reachability.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkmanagement.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networkmanagement.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time the operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * The time the operation finished running.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Target of the operation - for example
   * projects/project-1/locations/global/connectivityTests/test-1
   * </pre>
   *
   * <code>string target = 3;</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Target of the operation - for example
   * projects/project-1/locations/global/connectivityTests/test-1
   * </pre>
   *
   * <code>string target = 3;</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   *
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   *
   *
   * <pre>
   * Name of the verb executed by the operation.
   * </pre>
   *
   * <code>string verb = 4;</code>
   *
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString getVerbBytes();

  /**
   *
   *
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   *
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   *
   *
   * <pre>
   * Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 5;</code>
   *
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString getStatusDetailBytes();

  /**
   *
   *
   * <pre>
   * Specifies if cancellation was requested for the operation.
   * </pre>
   *
   * <code>bool cancel_requested = 6;</code>
   *
   * @return The cancelRequested.
   */
  boolean getCancelRequested();

  /**
   *
   *
   * <pre>
   * API version.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   *
   * @return The apiVersion.
   */
  java.lang.String getApiVersion();
  /**
   *
   *
   * <pre>
   * API version.
   * </pre>
   *
   * <code>string api_version = 7;</code>
   *
   * @return The bytes for apiVersion.
   */
  com.google.protobuf.ByteString getApiVersionBytes();
}
