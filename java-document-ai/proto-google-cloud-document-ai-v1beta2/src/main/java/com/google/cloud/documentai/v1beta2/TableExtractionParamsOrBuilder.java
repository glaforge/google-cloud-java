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
// source: google/cloud/documentai/v1beta2/document_understanding.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1beta2;

public interface TableExtractionParamsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta2.TableExtractionParams)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Whether to enable table extraction.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Optional. Table bounding box hints that can be provided to complex cases
   * which our algorithm cannot locate the table(s) in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta2.TableBoundHint table_bound_hints = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<com.google.cloud.documentai.v1beta2.TableBoundHint> getTableBoundHintsList();
  /**
   *
   *
   * <pre>
   * Optional. Table bounding box hints that can be provided to complex cases
   * which our algorithm cannot locate the table(s) in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta2.TableBoundHint table_bound_hints = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1beta2.TableBoundHint getTableBoundHints(int index);
  /**
   *
   *
   * <pre>
   * Optional. Table bounding box hints that can be provided to complex cases
   * which our algorithm cannot locate the table(s) in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta2.TableBoundHint table_bound_hints = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getTableBoundHintsCount();
  /**
   *
   *
   * <pre>
   * Optional. Table bounding box hints that can be provided to complex cases
   * which our algorithm cannot locate the table(s) in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta2.TableBoundHint table_bound_hints = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.List<? extends com.google.cloud.documentai.v1beta2.TableBoundHintOrBuilder>
      getTableBoundHintsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Optional. Table bounding box hints that can be provided to complex cases
   * which our algorithm cannot locate the table(s) in.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta2.TableBoundHint table_bound_hints = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1beta2.TableBoundHintOrBuilder getTableBoundHintsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>repeated string header_hints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return A list containing the headerHints.
   */
  java.util.List<java.lang.String> getHeaderHintsList();
  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>repeated string header_hints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The count of headerHints.
   */
  int getHeaderHintsCount();
  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>repeated string header_hints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the element to return.
   * @return The headerHints at the given index.
   */
  java.lang.String getHeaderHints(int index);
  /**
   *
   *
   * <pre>
   * Optional. Reserved for future use.
   * </pre>
   *
   * <code>repeated string header_hints = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the headerHints at the given index.
   */
  com.google.protobuf.ByteString getHeaderHintsBytes(int index);

  /**
   *
   *
   * <pre>
   * Model version of the table extraction system. Default is "builtin/stable".
   * Specify "builtin/latest" for the latest model.
   * </pre>
   *
   * <code>string model_version = 4;</code>
   *
   * @return The modelVersion.
   */
  java.lang.String getModelVersion();
  /**
   *
   *
   * <pre>
   * Model version of the table extraction system. Default is "builtin/stable".
   * Specify "builtin/latest" for the latest model.
   * </pre>
   *
   * <code>string model_version = 4;</code>
   *
   * @return The bytes for modelVersion.
   */
  com.google.protobuf.ByteString getModelVersionBytes();
}
