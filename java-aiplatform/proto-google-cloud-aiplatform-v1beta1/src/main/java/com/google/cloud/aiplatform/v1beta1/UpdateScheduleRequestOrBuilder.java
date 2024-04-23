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
// source: google/cloud/aiplatform/v1beta1/schedule_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface UpdateScheduleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UpdateScheduleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Schedule which replaces the resource on the server.
   * The following restrictions will be applied:
   *
   *   * The scheduled request type cannot be changed.
   *   * The non-empty fields cannot be unset.
   *   * The output_only fields will be ignored if specified.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the schedule field is set.
   */
  boolean hasSchedule();
  /**
   *
   *
   * <pre>
   * Required. The Schedule which replaces the resource on the server.
   * The following restrictions will be applied:
   *
   *   * The scheduled request type cannot be changed.
   *   * The non-empty fields cannot be unset.
   *   * The output_only fields will be ignored if specified.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The schedule.
   */
  com.google.cloud.aiplatform.v1beta1.Schedule getSchedule();
  /**
   *
   *
   * <pre>
   * Required. The Schedule which replaces the resource on the server.
   * The following restrictions will be applied:
   *
   *   * The scheduled request type cannot be changed.
   *   * The non-empty fields cannot be unset.
   *   * The output_only fields will be ignored if specified.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.Schedule schedule = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ScheduleOrBuilder getScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
