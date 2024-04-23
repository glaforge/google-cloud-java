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
// source: google/cloud/resourcemanager/v3/tag_bindings.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

public interface ListTagBindingsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.resourcemanager.v3.ListTagBindingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagBindings for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagBinding tag_bindings = 1;</code>
   */
  java.util.List<com.google.cloud.resourcemanager.v3.TagBinding> getTagBindingsList();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagBindings for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagBinding tag_bindings = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.TagBinding getTagBindings(int index);
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagBindings for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagBinding tag_bindings = 1;</code>
   */
  int getTagBindingsCount();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagBindings for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagBinding tag_bindings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.resourcemanager.v3.TagBindingOrBuilder>
      getTagBindingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A possibly paginated list of TagBindings for the specified resource.
   * </pre>
   *
   * <code>repeated .google.cloud.resourcemanager.v3.TagBinding tag_bindings = 1;</code>
   */
  com.google.cloud.resourcemanager.v3.TagBindingOrBuilder getTagBindingsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pagination token.
   *
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   *
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   *
   * Pagination tokens have a limited lifetime.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Pagination token.
   *
   * If the result set is too large to fit in a single response, this token
   * is returned. It encodes the position of the current result cursor.
   * Feeding this value into a new list request with the `page_token` parameter
   * gives the next page of the results.
   *
   * When `next_page_token` is not filled in, there is no next page and
   * the list returned is the last page in the result set.
   *
   * Pagination tokens have a limited lifetime.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
