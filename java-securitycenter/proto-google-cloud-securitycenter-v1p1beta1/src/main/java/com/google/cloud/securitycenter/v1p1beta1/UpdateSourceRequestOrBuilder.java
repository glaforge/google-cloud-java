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
// source: google/cloud/securitycenter/v1p1beta1/securitycenter_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1p1beta1;

public interface UpdateSourceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.UpdateSourceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The source resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1p1beta1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the source field is set.
   */
  boolean hasSource();
  /**
   *
   *
   * <pre>
   * Required. The source resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1p1beta1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The source.
   */
  com.google.cloud.securitycenter.v1p1beta1.Source getSource();
  /**
   *
   *
   * <pre>
   * Required. The source resource to update.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1p1beta1.Source source = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.securitycenter.v1p1beta1.SourceOrBuilder getSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The FieldMask to use when updating the source resource.
   *
   * If empty all mutable fields will be updated.
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
   * The FieldMask to use when updating the source resource.
   *
   * If empty all mutable fields will be updated.
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
   * The FieldMask to use when updating the source resource.
   *
   * If empty all mutable fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
