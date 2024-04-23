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
// source: google/chat/v1/reaction.proto

// Protobuf Java Version: 3.25.3
package com.google.chat.v1;

public interface EmojiReactionSummaryOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.chat.v1.EmojiReactionSummary)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Emoji associated with the reactions.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 1;</code>
   *
   * @return Whether the emoji field is set.
   */
  boolean hasEmoji();
  /**
   *
   *
   * <pre>
   * Emoji associated with the reactions.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 1;</code>
   *
   * @return The emoji.
   */
  com.google.chat.v1.Emoji getEmoji();
  /**
   *
   *
   * <pre>
   * Emoji associated with the reactions.
   * </pre>
   *
   * <code>.google.chat.v1.Emoji emoji = 1;</code>
   */
  com.google.chat.v1.EmojiOrBuilder getEmojiOrBuilder();

  /**
   *
   *
   * <pre>
   * The total number of reactions using the associated emoji.
   * </pre>
   *
   * <code>optional int32 reaction_count = 2;</code>
   *
   * @return Whether the reactionCount field is set.
   */
  boolean hasReactionCount();
  /**
   *
   *
   * <pre>
   * The total number of reactions using the associated emoji.
   * </pre>
   *
   * <code>optional int32 reaction_count = 2;</code>
   *
   * @return The reactionCount.
   */
  int getReactionCount();
}
