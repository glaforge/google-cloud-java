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
// source: google/analytics/admin/v1alpha/audience.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

public interface AudienceEventTriggerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.admin.v1alpha.AudienceEventTrigger)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The event name that will be logged.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The eventName.
   */
  java.lang.String getEventName();
  /**
   *
   *
   * <pre>
   * Required. The event name that will be logged.
   * </pre>
   *
   * <code>string event_name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for eventName.
   */
  com.google.protobuf.ByteString getEventNameBytes();

  /**
   *
   *
   * <pre>
   * Required. When to log the event.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The enum numeric value on the wire for logCondition.
   */
  int getLogConditionValue();
  /**
   *
   *
   * <pre>
   * Required. When to log the event.
   * </pre>
   *
   * <code>
   * .google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition log_condition = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The logCondition.
   */
  com.google.analytics.admin.v1alpha.AudienceEventTrigger.LogCondition getLogCondition();
}
