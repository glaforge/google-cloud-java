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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface UpdateCustomMetricRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.UpdateCustomMetricRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The CustomMetric to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
   *
   * @return Whether the customMetric field is set.
   */
  boolean hasCustomMetric();
  /**
   *
   *
   * <pre>
   * The CustomMetric to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
   *
   * @return The customMetric.
   */
  com.google.analytics.admin.v1alpha.CustomMetric getCustomMetric();
  /**
   *
   *
   * <pre>
   * The CustomMetric to update
   * </pre>
   *
   * <code>.google.analytics.admin.v1alpha.CustomMetric custom_metric = 1;</code>
   */
  com.google.analytics.admin.v1alpha.CustomMetricOrBuilder getCustomMetricOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
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
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
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
   * Required. The list of fields to be updated. Omitted fields will not be
   * updated. To replace the entire entity, use one path with the string "*" to
   * match all fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
