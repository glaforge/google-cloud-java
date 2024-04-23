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
// source: google/cloud/batch/v1alpha/task.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.batch.v1alpha;

public interface StatusEventOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.StatusEvent)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of the event.
   * </pre>
   *
   * <code>string type = 3;</code>
   *
   * @return The type.
   */
  java.lang.String getType();
  /**
   *
   *
   * <pre>
   * Type of the event.
   * </pre>
   *
   * <code>string type = 3;</code>
   *
   * @return The bytes for type.
   */
  com.google.protobuf.ByteString getTypeBytes();

  /**
   *
   *
   * <pre>
   * Description of the event.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Description of the event.
   * </pre>
   *
   * <code>string description = 1;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The time this event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   *
   * @return Whether the eventTime field is set.
   */
  boolean hasEventTime();
  /**
   *
   *
   * <pre>
   * The time this event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   *
   * @return The eventTime.
   */
  com.google.protobuf.Timestamp getEventTime();
  /**
   *
   *
   * <pre>
   * The time this event occurred.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp event_time = 2;</code>
   */
  com.google.protobuf.TimestampOrBuilder getEventTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Task Execution
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
   *
   * @return Whether the taskExecution field is set.
   */
  boolean hasTaskExecution();
  /**
   *
   *
   * <pre>
   * Task Execution
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
   *
   * @return The taskExecution.
   */
  com.google.cloud.batch.v1alpha.TaskExecution getTaskExecution();
  /**
   *
   *
   * <pre>
   * Task Execution
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskExecution task_execution = 4;</code>
   */
  com.google.cloud.batch.v1alpha.TaskExecutionOrBuilder getTaskExecutionOrBuilder();

  /**
   *
   *
   * <pre>
   * Task State
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskStatus.State task_state = 5;</code>
   *
   * @return The enum numeric value on the wire for taskState.
   */
  int getTaskStateValue();
  /**
   *
   *
   * <pre>
   * Task State
   * </pre>
   *
   * <code>.google.cloud.batch.v1alpha.TaskStatus.State task_state = 5;</code>
   *
   * @return The taskState.
   */
  com.google.cloud.batch.v1alpha.TaskStatus.State getTaskState();
}
