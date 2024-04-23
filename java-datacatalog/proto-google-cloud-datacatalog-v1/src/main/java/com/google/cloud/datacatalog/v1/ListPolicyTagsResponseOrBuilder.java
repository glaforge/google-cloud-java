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
// source: google/cloud/datacatalog/v1/policytagmanager.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

public interface ListPolicyTagsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.ListPolicyTagsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The policy tags that belong to the taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.PolicyTag policy_tags = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.v1.PolicyTag> getPolicyTagsList();
  /**
   *
   *
   * <pre>
   * The policy tags that belong to the taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.PolicyTag policy_tags = 1;</code>
   */
  com.google.cloud.datacatalog.v1.PolicyTag getPolicyTags(int index);
  /**
   *
   *
   * <pre>
   * The policy tags that belong to the taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.PolicyTag policy_tags = 1;</code>
   */
  int getPolicyTagsCount();
  /**
   *
   *
   * <pre>
   * The policy tags that belong to the taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.PolicyTag policy_tags = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.v1.PolicyTagOrBuilder>
      getPolicyTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The policy tags that belong to the taxonomy.
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.v1.PolicyTag policy_tags = 1;</code>
   */
  com.google.cloud.datacatalog.v1.PolicyTagOrBuilder getPolicyTagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Pagination token of the next results page. Empty if there are no
   * more results in the list.
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
   * Pagination token of the next results page. Empty if there are no
   * more results in the list.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
