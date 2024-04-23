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
// source: google/cloud/dialogflow/cx/v3/intent.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.cx.v3;

public interface ExportIntentsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dialogflow.cx.v3.ExportIntentsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported intents. This field is
   * populated only if `intents_uri` is specified in
   * [ExportIntentsRequest][google.cloud.dialogflow.cx.v3.ExportIntentsRequest].
   * </pre>
   *
   * <code>string intents_uri = 1;</code>
   *
   * @return Whether the intentsUri field is set.
   */
  boolean hasIntentsUri();
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported intents. This field is
   * populated only if `intents_uri` is specified in
   * [ExportIntentsRequest][google.cloud.dialogflow.cx.v3.ExportIntentsRequest].
   * </pre>
   *
   * <code>string intents_uri = 1;</code>
   *
   * @return The intentsUri.
   */
  java.lang.String getIntentsUri();
  /**
   *
   *
   * <pre>
   * The URI to a file containing the exported intents. This field is
   * populated only if `intents_uri` is specified in
   * [ExportIntentsRequest][google.cloud.dialogflow.cx.v3.ExportIntentsRequest].
   * </pre>
   *
   * <code>string intents_uri = 1;</code>
   *
   * @return The bytes for intentsUri.
   */
  com.google.protobuf.ByteString getIntentsUriBytes();

  /**
   *
   *
   * <pre>
   * Uncompressed byte content for intents. This field is populated only if
   * `intents_content_inline` is set to true in
   * [ExportIntentsRequest][google.cloud.dialogflow.cx.v3.ExportIntentsRequest].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.InlineDestination intents_content = 2;</code>
   *
   * @return Whether the intentsContent field is set.
   */
  boolean hasIntentsContent();
  /**
   *
   *
   * <pre>
   * Uncompressed byte content for intents. This field is populated only if
   * `intents_content_inline` is set to true in
   * [ExportIntentsRequest][google.cloud.dialogflow.cx.v3.ExportIntentsRequest].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.InlineDestination intents_content = 2;</code>
   *
   * @return The intentsContent.
   */
  com.google.cloud.dialogflow.cx.v3.InlineDestination getIntentsContent();
  /**
   *
   *
   * <pre>
   * Uncompressed byte content for intents. This field is populated only if
   * `intents_content_inline` is set to true in
   * [ExportIntentsRequest][google.cloud.dialogflow.cx.v3.ExportIntentsRequest].
   * </pre>
   *
   * <code>.google.cloud.dialogflow.cx.v3.InlineDestination intents_content = 2;</code>
   */
  com.google.cloud.dialogflow.cx.v3.InlineDestinationOrBuilder getIntentsContentOrBuilder();

  com.google.cloud.dialogflow.cx.v3.ExportIntentsResponse.IntentsCase getIntentsCase();
}
