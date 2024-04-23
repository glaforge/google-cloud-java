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
// source: google/cloud/dataproc/v1/sessions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface ListSessionsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.ListSessionsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent, which owns this collection of sessions.
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
   * Required. The parent, which owns this collection of sessions.
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
   * Optional. The maximum number of sessions to return in each response.
   * The service may return fewer than this value.
   * </pre>
   *
   * <code>int32 page_size = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Optional. A page token received from a previous `ListSessions` call.
   * Provide this token to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Optional. A page token received from a previous `ListSessions` call.
   * Provide this token to retrieve the subsequent page.
   * </pre>
   *
   * <code>string page_token = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Optional. A filter for the sessions to return in the response.
   *
   * A filter is a logical expression constraining the values of various fields
   * in each session resource. Filters are case sensitive, and may contain
   * multiple clauses combined with logical operators (AND, OR).
   * Supported fields are `session_id`, `session_uuid`, `state`, and
   * `create_time`.
   *
   * Example: `state = ACTIVE and create_time &lt; "2023-01-01T00:00:00Z"`
   * is a filter for sessions in an ACTIVE state that were created before
   * 2023-01-01.
   *
   * See https://google.aip.dev/assets/misc/ebnf-filtering.txt for a detailed
   * description of the filter syntax and a list of supported comparators.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The filter.
   */
  java.lang.String getFilter();
  /**
   *
   *
   * <pre>
   * Optional. A filter for the sessions to return in the response.
   *
   * A filter is a logical expression constraining the values of various fields
   * in each session resource. Filters are case sensitive, and may contain
   * multiple clauses combined with logical operators (AND, OR).
   * Supported fields are `session_id`, `session_uuid`, `state`, and
   * `create_time`.
   *
   * Example: `state = ACTIVE and create_time &lt; "2023-01-01T00:00:00Z"`
   * is a filter for sessions in an ACTIVE state that were created before
   * 2023-01-01.
   *
   * See https://google.aip.dev/assets/misc/ebnf-filtering.txt for a detailed
   * description of the filter syntax and a list of supported comparators.
   * </pre>
   *
   * <code>string filter = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for filter.
   */
  com.google.protobuf.ByteString getFilterBytes();
}
