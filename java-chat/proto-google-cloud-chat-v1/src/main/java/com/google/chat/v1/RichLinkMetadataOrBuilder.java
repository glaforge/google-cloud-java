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
// source: google/chat/v1/annotation.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public interface RichLinkMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.RichLinkMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The URI of this link.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * The URI of this link.
   * </pre>
   *
   * <code>string uri = 1;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * The rich link type.
   * </pre>
   *
   * <code>.google.chat.v1.RichLinkMetadata.RichLinkType rich_link_type = 2;</code>
   *
   * @return The enum numeric value on the wire for richLinkType.
   */
  int getRichLinkTypeValue();
  /**
   *
   *
   * <pre>
   * The rich link type.
   * </pre>
   *
   * <code>.google.chat.v1.RichLinkMetadata.RichLinkType rich_link_type = 2;</code>
   *
   * @return The richLinkType.
   */
  com.google.chat.v1.RichLinkMetadata.RichLinkType getRichLinkType();

  /**
   *
   *
   * <pre>
   * Data for a drive link.
   * </pre>
   *
   * <code>.google.chat.v1.DriveLinkData drive_link_data = 3;</code>
   *
   * @return Whether the driveLinkData field is set.
   */
  boolean hasDriveLinkData();
  /**
   *
   *
   * <pre>
   * Data for a drive link.
   * </pre>
   *
   * <code>.google.chat.v1.DriveLinkData drive_link_data = 3;</code>
   *
   * @return The driveLinkData.
   */
  com.google.chat.v1.DriveLinkData getDriveLinkData();
  /**
   *
   *
   * <pre>
   * Data for a drive link.
   * </pre>
   *
   * <code>.google.chat.v1.DriveLinkData drive_link_data = 3;</code>
   */
  com.google.chat.v1.DriveLinkDataOrBuilder getDriveLinkDataOrBuilder();

  com.google.chat.v1.RichLinkMetadata.DataCase getDataCase();
}
