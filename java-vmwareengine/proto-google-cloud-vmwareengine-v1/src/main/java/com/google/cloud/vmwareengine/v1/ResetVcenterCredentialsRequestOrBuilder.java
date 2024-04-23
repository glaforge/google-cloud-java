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

public interface ResetVcenterCredentialsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vmwareengine.v1.ResetVcenterCredentialsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the private cloud
   * to reset credentials for.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1-a/privateClouds/my-cloud`
   * </pre>
   *
   * <code>
   * string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The privateCloud.
   */
  java.lang.String getPrivateCloud();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the private cloud
   * to reset credentials for.
   * Resource names are schemeless URIs that follow the conventions in
   * https://cloud.google.com/apis/design/resource_names.
   * For example:
   * `projects/my-project/locations/us-central1-a/privateClouds/my-cloud`
   * </pre>
   *
   * <code>
   * string private_cloud = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for privateCloud.
   */
  com.google.protobuf.ByteString getPrivateCloudBytes();

  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server guarantees that a
   * request doesn't result in creation of duplicate commitments for at least 60
   * minutes.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The requestId.
   */
  java.lang.String getRequestId();
  /**
   *
   *
   * <pre>
   * Optional. A request ID to identify requests. Specify a unique request ID
   * so that if you must retry your request, the server will know to ignore
   * the request if it has already been completed. The server guarantees that a
   * request doesn't result in creation of duplicate commitments for at least 60
   * minutes.
   *
   * For example, consider a situation where you make an initial request and the
   * request times out. If you make the request again with the same request
   * ID, the server can check if original operation with the same request ID
   * was received, and if so, will ignore the second request. This prevents
   * clients from accidentally creating duplicate commitments.
   *
   * The request ID must be a valid UUID with the exception that zero UUID is
   * not supported (00000000-0000-0000-0000-000000000000).
   * </pre>
   *
   * <code>string request_id = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for requestId.
   */
  com.google.protobuf.ByteString getRequestIdBytes();

  /**
   *
   *
   * <pre>
   * Optional. The username of the user to be to reset the credentials.
   * The default value of this field is CloudOwner&#64;gve.local.
   * The provided value should be one of the following:
   * solution-user-01&#64;gve.local,
   * solution-user-02&#64;gve.local,
   * solution-user-03&#64;gve.local,
   * solution-user-04&#64;gve.local,
   * solution-user-05&#64;gve.local,
   * zertoadmin&#64;gve.local.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * Optional. The username of the user to be to reset the credentials.
   * The default value of this field is CloudOwner&#64;gve.local.
   * The provided value should be one of the following:
   * solution-user-01&#64;gve.local,
   * solution-user-02&#64;gve.local,
   * solution-user-03&#64;gve.local,
   * solution-user-04&#64;gve.local,
   * solution-user-05&#64;gve.local,
   * zertoadmin&#64;gve.local.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();
}
