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
// source: google/cloud/tasks/v2beta2/cloudtasks.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tasks.v2beta2;

public interface CreateQueueRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tasks.v2beta2.CreateQueueRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location name in which the queue will be created.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   *
   * The list of allowed locations can be obtained by calling Cloud
   * Tasks' implementation of
   * [ListLocations][google.cloud.location.Locations.ListLocations].
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The location name in which the queue will be created.
   * For example: `projects/PROJECT_ID/locations/LOCATION_ID`
   *
   * The list of allowed locations can be obtained by calling Cloud
   * Tasks' implementation of
   * [ListLocations][google.cloud.location.Locations.ListLocations].
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The queue to create.
   *
   * [Queue's name][google.cloud.tasks.v2beta2.Queue.name] cannot be the same as
   * an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Queue queue = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the queue field is set.
   */
  boolean hasQueue();
  /**
   *
   *
   * <pre>
   * Required. The queue to create.
   *
   * [Queue's name][google.cloud.tasks.v2beta2.Queue.name] cannot be the same as
   * an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Queue queue = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The queue.
   */
  com.google.cloud.tasks.v2beta2.Queue getQueue();
  /**
   *
   *
   * <pre>
   * Required. The queue to create.
   *
   * [Queue's name][google.cloud.tasks.v2beta2.Queue.name] cannot be the same as
   * an existing queue.
   * </pre>
   *
   * <code>.google.cloud.tasks.v2beta2.Queue queue = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.tasks.v2beta2.QueueOrBuilder getQueueOrBuilder();
}
