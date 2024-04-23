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
// source: google/cloud/gkemulticloud/v1/common_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkemulticloud.v1;

public interface OperationMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.OperationMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The time at which this operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this operation was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The time at which this operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. The time at which this operation was completed.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The name of the resource associated to this operation.
   * </pre>
   *
   * <code>string target = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The target.
   */
  java.lang.String getTarget();
  /**
   *
   *
   * <pre>
   * Output only. The name of the resource associated to this operation.
   * </pre>
   *
   * <code>string target = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for target.
   */
  com.google.protobuf.ByteString getTargetBytes();

  /**
   *
   *
   * <pre>
   * Output only. Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The statusDetail.
   */
  java.lang.String getStatusDetail();
  /**
   *
   *
   * <pre>
   * Output only. Human-readable status of the operation, if any.
   * </pre>
   *
   * <code>string status_detail = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for statusDetail.
   */
  com.google.protobuf.ByteString getStatusDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. Human-readable status of any error that occurred during the
   * operation.
   * </pre>
   *
   * <code>string error_detail = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The errorDetail.
   */
  java.lang.String getErrorDetail();
  /**
   *
   *
   * <pre>
   * Output only. Human-readable status of any error that occurred during the
   * operation.
   * </pre>
   *
   * <code>string error_detail = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for errorDetail.
   */
  com.google.protobuf.ByteString getErrorDetailBytes();

  /**
   *
   *
   * <pre>
   * Output only. The verb associated with the API method which triggered this
   * operation. Possible values are "create", "delete", "update" and "import".
   * </pre>
   *
   * <code>string verb = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The verb.
   */
  java.lang.String getVerb();
  /**
   *
   *
   * <pre>
   * Output only. The verb associated with the API method which triggered this
   * operation. Possible values are "create", "delete", "update" and "import".
   * </pre>
   *
   * <code>string verb = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for verb.
   */
  com.google.protobuf.ByteString getVerbBytes();

  /**
   *
   *
   * <pre>
   * Output only. Identifies whether it has been requested cancellation
   * for the operation. Operations that have successfully been cancelled
   * have [Operation.error][] value with a
   * [google.rpc.Status.code][google.rpc.Status.code] of 1, corresponding to
   * `Code.CANCELLED`.
   * </pre>
   *
   * <code>bool requested_cancellation = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The requestedCancellation.
   */
  boolean getRequestedCancellation();
}
