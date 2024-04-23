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
// source: google/monitoring/v3/service_service.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface CreateServiceLevelObjectiveRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.CreateServiceLevelObjectiveRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the parent `Service`. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
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
   * Required. Resource name of the parent `Service`. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/services/[SERVICE_ID]
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
   * Optional. The ServiceLevelObjective id to use for this
   * ServiceLevelObjective. If omitted, an id will be generated instead. Must
   * match the pattern `^[a-zA-Z0-9-_:.]+$`
   * </pre>
   *
   * <code>string service_level_objective_id = 3;</code>
   *
   * @return The serviceLevelObjectiveId.
   */
  java.lang.String getServiceLevelObjectiveId();
  /**
   *
   *
   * <pre>
   * Optional. The ServiceLevelObjective id to use for this
   * ServiceLevelObjective. If omitted, an id will be generated instead. Must
   * match the pattern `^[a-zA-Z0-9-_:.]+$`
   * </pre>
   *
   * <code>string service_level_objective_id = 3;</code>
   *
   * @return The bytes for serviceLevelObjectiveId.
   */
  com.google.protobuf.ByteString getServiceLevelObjectiveIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The `ServiceLevelObjective` to create.
   * The provided `name` will be respected if no `ServiceLevelObjective` exists
   * with this name.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.ServiceLevelObjective service_level_objective = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the serviceLevelObjective field is set.
   */
  boolean hasServiceLevelObjective();
  /**
   *
   *
   * <pre>
   * Required. The `ServiceLevelObjective` to create.
   * The provided `name` will be respected if no `ServiceLevelObjective` exists
   * with this name.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.ServiceLevelObjective service_level_objective = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The serviceLevelObjective.
   */
  com.google.monitoring.v3.ServiceLevelObjective getServiceLevelObjective();
  /**
   *
   *
   * <pre>
   * Required. The `ServiceLevelObjective` to create.
   * The provided `name` will be respected if no `ServiceLevelObjective` exists
   * with this name.
   * </pre>
   *
   * <code>
   * .google.monitoring.v3.ServiceLevelObjective service_level_objective = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.monitoring.v3.ServiceLevelObjectiveOrBuilder getServiceLevelObjectiveOrBuilder();
}
