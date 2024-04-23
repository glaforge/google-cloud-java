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
// source: google/cloud/datacatalog/v1beta1/datacatalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1beta1;

public interface ListEntriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1beta1.ListEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the entry group that contains the entries, which can
   * be provided in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
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
   * Required. The name of the entry group that contains the entries, which can
   * be provided in URL format. Example:
   *
   * * projects/{project_id}/locations/{location}/entryGroups/{entry_group_id}
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
   * The maximum number of items to return. Default is 10. Max limit is 1000.
   * Throws an invalid argument for `page_size &gt; 1000`.
   * </pre>
   *
   * <code>int32 page_size = 2;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Token that specifies which page is requested. If empty, the first page is
   * returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Token that specifies which page is requested. If empty, the first page is
   * returned.
   * </pre>
   *
   * <code>string page_token = 3;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The fields to return for each Entry. If not set or empty, all
   * fields are returned.
   * For example, setting read_mask to contain only one path "name" will cause
   * ListEntries to return a list of Entries with only "name" field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   *
   * @return Whether the readMask field is set.
   */
  boolean hasReadMask();
  /**
   *
   *
   * <pre>
   * The fields to return for each Entry. If not set or empty, all
   * fields are returned.
   * For example, setting read_mask to contain only one path "name" will cause
   * ListEntries to return a list of Entries with only "name" field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   *
   * @return The readMask.
   */
  com.google.protobuf.FieldMask getReadMask();
  /**
   *
   *
   * <pre>
   * The fields to return for each Entry. If not set or empty, all
   * fields are returned.
   * For example, setting read_mask to contain only one path "name" will cause
   * ListEntries to return a list of Entries with only "name" field.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask read_mask = 4;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getReadMaskOrBuilder();
}
