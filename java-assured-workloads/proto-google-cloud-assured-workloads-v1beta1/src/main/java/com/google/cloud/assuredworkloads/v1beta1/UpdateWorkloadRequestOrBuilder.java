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
// source: google/cloud/assuredworkloads/v1beta1/assuredworkloads.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.assuredworkloads.v1beta1;

public interface UpdateWorkloadRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.assuredworkloads.v1beta1.UpdateWorkloadRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The workload to update.
   * The workload's `name` field is used to identify the workload to be updated.
   * Format:
   * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1beta1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workload field is set.
   */
  boolean hasWorkload();
  /**
   *
   *
   * <pre>
   * Required. The workload to update.
   * The workload's `name` field is used to identify the workload to be updated.
   * Format:
   * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1beta1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workload.
   */
  com.google.cloud.assuredworkloads.v1beta1.Workload getWorkload();
  /**
   *
   *
   * <pre>
   * Required. The workload to update.
   * The workload's `name` field is used to identify the workload to be updated.
   * Format:
   * organizations/{org_id}/locations/{location_id}/workloads/{workload_id}
   * </pre>
   *
   * <code>
   * .google.cloud.assuredworkloads.v1beta1.Workload workload = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.assuredworkloads.v1beta1.WorkloadOrBuilder getWorkloadOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated.
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
   * Required. The list of fields to be updated.
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
   * Required. The list of fields to be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
