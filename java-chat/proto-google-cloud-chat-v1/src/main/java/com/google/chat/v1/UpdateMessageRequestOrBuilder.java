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
// source: google/chat/v1/message.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public interface UpdateMessageRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.UpdateMessageRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Message with fields updated.
   * </pre>
   *
   * <code>.google.chat.v1.Message message = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the message field is set.
   */
  boolean hasMessage();
  /**
   *
   *
   * <pre>
   * Required. Message with fields updated.
   * </pre>
   *
   * <code>.google.chat.v1.Message message = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The message.
   */
  com.google.chat.v1.Message getMessage();
  /**
   *
   *
   * <pre>
   * Required. Message with fields updated.
   * </pre>
   *
   * <code>.google.chat.v1.Message message = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.chat.v1.MessageOrBuilder getMessageOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The field paths to update. Separate multiple values with commas
   * or use `*` to update all field paths.
   *
   * Currently supported field paths:
   *
   * - `text`
   *
   * - `attachment`
   *
   * - `cards` (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   *
   * - `cards_v2`  (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   *
   * - `accessory_widgets`  (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The field paths to update. Separate multiple values with commas
   * or use `*` to update all field paths.
   *
   * Currently supported field paths:
   *
   * - `text`
   *
   * - `attachment`
   *
   * - `cards` (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   *
   * - `cards_v2`  (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   *
   * - `accessory_widgets`  (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The field paths to update. Separate multiple values with commas
   * or use `*` to update all field paths.
   *
   * Currently supported field paths:
   *
   * - `text`
   *
   * - `attachment`
   *
   * - `cards` (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   *
   * - `cards_v2`  (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   *
   * - `accessory_widgets`  (Requires [app
   * authentication](/chat/api/guides/auth/service-accounts).)
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. If `true` and the message isn't found, a new message is created
   * and `updateMask` is ignored. The specified message ID must be
   * [client-assigned](https://developers.google.com/workspace/chat/create-messages#name_a_created_message)
   * or the request fails.
   * </pre>
   *
   * <code>bool allow_missing = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The allowMissing.
   */
  boolean getAllowMissing();
}
