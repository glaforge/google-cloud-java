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
// source: google/cloud/advisorynotifications/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.advisorynotifications.v1;

public interface NotificationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.advisorynotifications.v1.Notification)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the notification.
   * Format:
   * organizations/{organization}/locations/{location}/notifications/{notification}
   * or projects/{project}/locations/{location}/notifications/{notification}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the notification.
   * Format:
   * organizations/{organization}/locations/{location}/notifications/{notification}
   * or projects/{project}/locations/{location}/notifications/{notification}.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The subject line of the notification.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Subject subject = 2;</code>
   *
   * @return Whether the subject field is set.
   */
  boolean hasSubject();
  /**
   *
   *
   * <pre>
   * The subject line of the notification.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Subject subject = 2;</code>
   *
   * @return The subject.
   */
  com.google.cloud.advisorynotifications.v1.Subject getSubject();
  /**
   *
   *
   * <pre>
   * The subject line of the notification.
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.Subject subject = 2;</code>
   */
  com.google.cloud.advisorynotifications.v1.SubjectOrBuilder getSubjectOrBuilder();

  /**
   *
   *
   * <pre>
   * A list of messages in the notification.
   * </pre>
   *
   * <code>repeated .google.cloud.advisorynotifications.v1.Message messages = 3;</code>
   */
  java.util.List<com.google.cloud.advisorynotifications.v1.Message> getMessagesList();
  /**
   *
   *
   * <pre>
   * A list of messages in the notification.
   * </pre>
   *
   * <code>repeated .google.cloud.advisorynotifications.v1.Message messages = 3;</code>
   */
  com.google.cloud.advisorynotifications.v1.Message getMessages(int index);
  /**
   *
   *
   * <pre>
   * A list of messages in the notification.
   * </pre>
   *
   * <code>repeated .google.cloud.advisorynotifications.v1.Message messages = 3;</code>
   */
  int getMessagesCount();
  /**
   *
   *
   * <pre>
   * A list of messages in the notification.
   * </pre>
   *
   * <code>repeated .google.cloud.advisorynotifications.v1.Message messages = 3;</code>
   */
  java.util.List<? extends com.google.cloud.advisorynotifications.v1.MessageOrBuilder>
      getMessagesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of messages in the notification.
   * </pre>
   *
   * <code>repeated .google.cloud.advisorynotifications.v1.Message messages = 3;</code>
   */
  com.google.cloud.advisorynotifications.v1.MessageOrBuilder getMessagesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Time the notification was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the notification was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time the notification was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Type of notification
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.NotificationType notification_type = 12;</code>
   *
   * @return The enum numeric value on the wire for notificationType.
   */
  int getNotificationTypeValue();
  /**
   *
   *
   * <pre>
   * Type of notification
   * </pre>
   *
   * <code>.google.cloud.advisorynotifications.v1.NotificationType notification_type = 12;</code>
   *
   * @return The notificationType.
   */
  com.google.cloud.advisorynotifications.v1.NotificationType getNotificationType();
}
