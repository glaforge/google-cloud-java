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
// source: google/cloud/vmwareengine/v1/vmwareengine.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

public interface CreateExternalAccessRuleRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.CreateExternalAccessRuleRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the network policy
   * to create a new external access firewall rule in.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/networkPolicies/my-policy`
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
   * Required. The resource name of the network policy
   * to create a new external access firewall rule in.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1/networkPolicies/my-policy`
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
   * Required. The initial description of a new external access rule.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.ExternalAccessRule external_access_rule = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the externalAccessRule field is set.
   */
  boolean hasExternalAccessRule();
  /**
   *
   *
   * <pre>
   * Required. The initial description of a new external access rule.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.ExternalAccessRule external_access_rule = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The externalAccessRule.
   */
  com.google.cloud.vmwareengine.v1.ExternalAccessRule getExternalAccessRule();
  /**
   *
   *
   * <pre>
   * Required. The initial description of a new external access rule.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.ExternalAccessRule external_access_rule = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.vmwareengine.v1.ExternalAccessRuleOrBuilder getExternalAccessRuleOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The user-provided identifier of the `ExternalAccessRule` to be
   * created. This identifier must be unique among `ExternalAccessRule`
   * resources within the parent and becomes the final token in the name URI.
   * The identifier must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034)
   * (section 3.5)
   * </pre>
   *
   * <code>string external_access_rule_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The externalAccessRuleId.
   */
  java.lang.String getExternalAccessRuleId();
  /**
   *
   *
   * <pre>
   * Required. The user-provided identifier of the `ExternalAccessRule` to be
   * created. This identifier must be unique among `ExternalAccessRule`
   * resources within the parent and becomes the final token in the name URI.
   * The identifier must meet the following requirements:
   *
   * * Only contains 1-63 alphanumeric characters and hyphens
   * * Begins with an alphabetical character
   * * Ends with a non-hyphen character
   * * Not formatted as a UUID
   * * Complies with [RFC 1034](https://datatracker.ietf.org/doc/html/rfc1034)
   * (section 3.5)
   * </pre>
   *
   * <code>string external_access_rule_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for externalAccessRuleId.
   */
  com.google.protobuf.ByteString getExternalAccessRuleIdBytes();

  /**
   *
   *
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server guarantees that a
   * request doesn't result in creation of duplicate commitments for at least 60
   * minutes.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if the original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server guarantees that a
   * request doesn't result in creation of duplicate commitments for at least 60
   * minutes.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request ID,
   * the server can check if the original operation with the same request ID was
   * received, and if so, will ignore the second request. This prevents clients
   * from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 4;</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();
}
