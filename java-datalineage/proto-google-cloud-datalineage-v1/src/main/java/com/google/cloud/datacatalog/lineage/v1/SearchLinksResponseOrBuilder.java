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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.lineage.v1;

public interface SearchLinksResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.SearchLinksResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  java.util.List<com.google.cloud.datacatalog.lineage.v1.Link> getLinksList();
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  com.google.cloud.datacatalog.lineage.v1.Link getLinks(int index);
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  int getLinksCount();
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  java.util.List<? extends com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder>
      getLinksOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of links for a given asset. Can be empty if the asset has no
   * relations of requested type (source or target).
   * </pre>
   *
   * <code>repeated .google.cloud.datacatalog.lineage.v1.Link links = 1;</code>
   */
  com.google.cloud.datacatalog.lineage.v1.LinkOrBuilder getLinksOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The token to specify as `page_token` in the subsequent call to get the next
   * page. Omitted if there are no more pages in the response.
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
   * The token to specify as `page_token` in the subsequent call to get the next
   * page. Omitted if there are no more pages in the response.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
