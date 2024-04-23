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
// source: google/cloud/networksecurity/v1beta1/authorization_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networksecurity.v1beta1;

public interface UpdateAuthorizationPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1beta1.UpdateAuthorizationPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * AuthorizationPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * AuthorizationPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Field mask is used to specify the fields to be overwritten in the
   * AuthorizationPolicy resource by the update.
   * The fields specified in the update_mask are relative to the resource, not
   * the full request. A field will be overwritten if it is in the mask. If the
   * user does not provide a mask then all fields will be overwritten.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. Updated AuthorizationPolicy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the authorizationPolicy field is set.
   */
  boolean hasAuthorizationPolicy();
  /**
   *
   *
   * <pre>
   * Required. Updated AuthorizationPolicy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The authorizationPolicy.
   */
  com.google.cloud.networksecurity.v1beta1.AuthorizationPolicy getAuthorizationPolicy();
  /**
   *
   *
   * <pre>
   * Required. Updated AuthorizationPolicy resource.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1beta1.AuthorizationPolicy authorization_policy = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networksecurity.v1beta1.AuthorizationPolicyOrBuilder
      getAuthorizationPolicyOrBuilder();
}
