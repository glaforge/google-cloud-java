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
// source: google/dataflow/v1beta3/messages.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

public interface JobMessageOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.JobMessage)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Deprecated.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * The timestamp of the message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   *
   * @return Whether the time field is set.
   */
  boolean hasTime();
  /**
   *
   *
   * <pre>
   * The timestamp of the message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   *
   * @return The time.
   */
  com.google.protobuf.Timestamp getTime();
  /**
   *
   *
   * <pre>
   * The timestamp of the message.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The text of the message.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   *
   * @return The messageText.
   */
  java.lang.String getMessageText();
  /**
   *
   *
   * <pre>
   * The text of the message.
   * </pre>
   *
   * <code>string message_text = 3;</code>
   *
   * @return The bytes for messageText.
   */
  com.google.protobuf.ByteString getMessageTextBytes();

  /**
   *
   *
   * <pre>
   * Importance level of the message.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
   *
   * @return The enum numeric value on the wire for messageImportance.
   */
  int getMessageImportanceValue();
  /**
   *
   *
   * <pre>
   * Importance level of the message.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobMessageImportance message_importance = 4;</code>
   *
   * @return The messageImportance.
   */
  com.google.dataflow.v1beta3.JobMessageImportance getMessageImportance();
}
