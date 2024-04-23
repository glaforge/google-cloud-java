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
// source: google/cloud/networksecurity/v1/client_tls_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networksecurity.v1;

public interface CreateClientTlsPolicyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.networksecurity.v1.CreateClientTlsPolicyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource of the ClientTlsPolicy. Must be in
   * the format `projects/&#42;&#47;locations/{location}`.
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
   * Required. The parent resource of the ClientTlsPolicy. Must be in
   * the format `projects/&#42;&#47;locations/{location}`.
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
   * Required. Short name of the ClientTlsPolicy resource to be created. This value should
   * be 1-63 characters long, containing only letters, numbers, hyphens, and
   * underscores, and should not start with a number. E.g. "client_mtls_policy".
   * </pre>
   *
   * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The clientTlsPolicyId.
   */
  java.lang.String getClientTlsPolicyId();
  /**
   *
   *
   * <pre>
   * Required. Short name of the ClientTlsPolicy resource to be created. This value should
   * be 1-63 characters long, containing only letters, numbers, hyphens, and
   * underscores, and should not start with a number. E.g. "client_mtls_policy".
   * </pre>
   *
   * <code>string client_tls_policy_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for clientTlsPolicyId.
   */
  com.google.protobuf.ByteString getClientTlsPolicyIdBytes();

  /**
   *
   *
   * <pre>
   * Required. ClientTlsPolicy resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the clientTlsPolicy field is set.
   */
  boolean hasClientTlsPolicy();
  /**
   *
   *
   * <pre>
   * Required. ClientTlsPolicy resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The clientTlsPolicy.
   */
  com.google.cloud.networksecurity.v1.ClientTlsPolicy getClientTlsPolicy();
  /**
   *
   *
   * <pre>
   * Required. ClientTlsPolicy resource to be created.
   * </pre>
   *
   * <code>
   * .google.cloud.networksecurity.v1.ClientTlsPolicy client_tls_policy = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.networksecurity.v1.ClientTlsPolicyOrBuilder getClientTlsPolicyOrBuilder();
}
