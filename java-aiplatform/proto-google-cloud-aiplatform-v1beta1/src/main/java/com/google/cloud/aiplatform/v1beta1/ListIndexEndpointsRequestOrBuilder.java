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
// source: google/cloud/aiplatform/v1beta1/index_endpoint_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface ListIndexEndpointsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.ListIndexEndpointsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the Location from which to list the
   * IndexEndpoints. Format: `projects/{project}/locations/{location}`
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
   * Required. The resource name of the Location from which to list the
   * IndexEndpoints. Format: `projects/{project}/locations/{location}`
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
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `index_endpoint` supports = and !=. `index_endpoint` represents the
   *      IndexEndpoint ID, ie. the last segment of the IndexEndpoint's
   *      [resourcename][google.cloud.aiplatform.v1beta1.IndexEndpoint.name].
   *   * `display_name` supports =, != and regex()
   *             (uses [re2](https://github.com/google/re2/wiki/Syntax) syntax)
   *   * `labels` supports general map functions that is:
   *             `labels.key=value` - key:value equality
   *             `labels.key:* or labels:key - key existence
   *              A key including a space must be quoted. `labels."a key"`.
   *
   * Some examples:
   *   * `index_endpoint="1"`
   *   * `display_name="myDisplayName"`
   *   * `regex(display_name, "^A") -&gt; The display name starts with an A.
   *   * `labels.myKey="myValue"`
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. An expression for filtering the results of the request. For field
   * names both snake_case and camelCase are supported.
   *
   *   * `index_endpoint` supports = and !=. `index_endpoint` represents the
   *      IndexEndpoint ID, ie. the last segment of the IndexEndpoint's
   *      [resourcename][google.cloud.aiplatform.v1beta1.IndexEndpoint.name].
   *   * `display_name` supports =, != and regex()
   *             (uses [re2](https://github.com/google/re2/wiki/Syntax) syntax)
   *   * `labels` supports general map functions that is:
   *             `labels.key=value` - key:value equality
   *             `labels.key:* or labels:key - key existence
   *              A key including a space must be quoted. `labels."a key"`.
   *
   * Some examples:
   *   * `index_endpoint="1"`
   *   * `display_name="myDisplayName"`
   *   * `regex(display_name, "^A") -&gt; The display name starts with an A.
   *   * `labels.myKey="myValue"`
   * </pre>
   *
   * <code>string filter = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();

  /**
   *
   *
   * <pre>
   * Optional. The standard list page size.
   * </pre>
   *
   * <code>int32 page_size = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListIndexEndpointsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.next_page_token]
   * of the previous
   * [IndexEndpointService.ListIndexEndpoints][google.cloud.aiplatform.v1beta1.IndexEndpointService.ListIndexEndpoints]
   * call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. The standard list page token.
   * Typically obtained via
   * [ListIndexEndpointsResponse.next_page_token][google.cloud.aiplatform.v1beta1.ListIndexEndpointsResponse.next_page_token]
   * of the previous
   * [IndexEndpointService.ListIndexEndpoints][google.cloud.aiplatform.v1beta1.IndexEndpointService.ListIndexEndpoints]
   * call.
   * </pre>
   *
   * <code>string page_token = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * Optional. Mask specifying which fields to read.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
