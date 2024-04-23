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
// source: google/cloud/discoveryengine/v1/import_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

public interface ImportSuggestionDenyListEntriesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Inline source for the input content for suggestion deny list entries.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest.InlineSource inline_source = 2;
   * </code>
   *
   * @return Whether the inlineSource field is set.
   */
  boolean hasInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for suggestion deny list entries.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest.InlineSource inline_source = 2;
   * </code>
   *
   * @return The inlineSource.
   */
  com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest.InlineSource
      getInlineSource();
  /**
   *
   *
   * <pre>
   * The Inline source for the input content for suggestion deny list entries.
   * </pre>
   *
   * <code>
   * .google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest.InlineSource inline_source = 2;
   * </code>
   */
  com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest.InlineSourceOrBuilder
      getInlineSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   *
   * Only 1 file can be specified that contains all entries to import.
   * Supported values `gcs_source.schema` for autocomplete suggestion deny
   * list entry imports:
   *
   * * `suggestion_deny_list` (default): One JSON [SuggestionDenyListEntry]
   * per line.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.GcsSource gcs_source = 3;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   *
   * Only 1 file can be specified that contains all entries to import.
   * Supported values `gcs_source.schema` for autocomplete suggestion deny
   * list entry imports:
   *
   * * `suggestion_deny_list` (default): One JSON [SuggestionDenyListEntry]
   * per line.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.GcsSource gcs_source = 3;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.discoveryengine.v1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * Cloud Storage location for the input content.
   *
   * Only 1 file can be specified that contains all entries to import.
   * Supported values `gcs_source.schema` for autocomplete suggestion deny
   * list entry imports:
   *
   * * `suggestion_deny_list` (default): One JSON [SuggestionDenyListEntry]
   * per line.
   * </pre>
   *
   * <code>.google.cloud.discoveryengine.v1.GcsSource gcs_source = 3;</code>
   */
  com.google.cloud.discoveryengine.v1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The parent data store resource name for which to import denylist
   * entries. Follows pattern projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;.
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
   * Required. The parent data store resource name for which to import denylist
   * entries. Follows pattern projects/&#42;&#47;locations/&#42;&#47;collections/&#42;&#47;dataStores/&#42;.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  com.google.cloud.discoveryengine.v1.ImportSuggestionDenyListEntriesRequest.SourceCase
      getSourceCase();
}
