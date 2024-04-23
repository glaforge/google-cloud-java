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
// source: google/cloud/orgpolicy/v2/orgpolicy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.orgpolicy.v2;

public interface CreatePolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.orgpolicy.v2.CreatePolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The Google Cloud resource that will parent the new policy. Must
   * be in one of the following forms:
   *
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
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
   * Required. The Google Cloud resource that will parent the new policy. Must
   * be in one of the following forms:
   *
   * * `projects/{project_number}`
   * * `projects/{project_id}`
   * * `folders/{folder_id}`
   * * `organizations/{organization_id}`
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
   * Required. Policy to create.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * Required. Policy to create.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The policy.
   */
  com.google.cloud.orgpolicy.v2.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * Required. Policy to create.
   * </pre>
   *
   * <code>.google.cloud.orgpolicy.v2.Policy policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.orgpolicy.v2.PolicyOrBuilder getPolicyOrBuilder();
}
