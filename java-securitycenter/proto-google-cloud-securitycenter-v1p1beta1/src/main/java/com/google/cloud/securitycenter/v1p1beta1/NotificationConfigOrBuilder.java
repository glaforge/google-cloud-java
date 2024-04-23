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
// source: google/cloud/securitycenter/v1p1beta1/notification_config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1p1beta1;

public interface NotificationConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.NotificationConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of this notification config. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
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
   * The relative resource name of this notification config. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/notificationConfigs/notify_public_bucket".
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
   * The description of the notification config (max of 1024 characters).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * The description of the notification config (max of 1024 characters).
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The type of events the config is for, e.g. FINDING.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig.EventType event_type = 3;
   * </code>
   *
   * @return The enum numeric value on the wire for eventType.
   */
  int getEventTypeValue();
  /**
   *
   *
   * <pre>
   * The type of events the config is for, e.g. FINDING.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v1p1beta1.NotificationConfig.EventType event_type = 3;
   * </code>
   *
   * @return The eventType.
   */
  com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.EventType getEventType();

  /**
   *
   *
   * <pre>
   * The Pub/Sub topic to send notifications to. Its format is
   * "projects/[project_id]/topics/[topic]".
   * </pre>
   *
   * <code>string pubsub_topic = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The pubsubTopic.
   */
  java.lang.String getPubsubTopic();
  /**
   *
   *
   * <pre>
   * The Pub/Sub topic to send notifications to. Its format is
   * "projects/[project_id]/topics/[topic]".
   * </pre>
   *
   * <code>string pubsub_topic = 4 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for pubsubTopic.
   */
  com.google.protobuf.ByteString getPubsubTopicBytes();

  /**
   *
   *
   * <pre>
   * Output only. The service account that needs "pubsub.topics.publish"
   * permission to publish to the Pub/Sub topic.
   * </pre>
   *
   * <code>string service_account = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The serviceAccount.
   */
  java.lang.String getServiceAccount();
  /**
   *
   *
   * <pre>
   * Output only. The service account that needs "pubsub.topics.publish"
   * permission to publish to the Pub/Sub topic.
   * </pre>
   *
   * <code>string service_account = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for serviceAccount.
   */
  com.google.protobuf.ByteString getServiceAccountBytes();

  /**
   *
   *
   * <pre>
   * The config for triggering streaming-based notifications.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1p1beta1.NotificationConfig.StreamingConfig streaming_config = 6;
   * </code>
   *
   * @return Whether the streamingConfig field is set.
   */
  boolean hasStreamingConfig();
  /**
   *
   *
   * <pre>
   * The config for triggering streaming-based notifications.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1p1beta1.NotificationConfig.StreamingConfig streaming_config = 6;
   * </code>
   *
   * @return The streamingConfig.
   */
  com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.StreamingConfig getStreamingConfig();
  /**
   *
   *
   * <pre>
   * The config for triggering streaming-based notifications.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1p1beta1.NotificationConfig.StreamingConfig streaming_config = 6;
   * </code>
   */
  com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.StreamingConfigOrBuilder
      getStreamingConfigOrBuilder();

  com.google.cloud.securitycenter.v1p1beta1.NotificationConfig.NotifyConfigCase
      getNotifyConfigCase();
}
