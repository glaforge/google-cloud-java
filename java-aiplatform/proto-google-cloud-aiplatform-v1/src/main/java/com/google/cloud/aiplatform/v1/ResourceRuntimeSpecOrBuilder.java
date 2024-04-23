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
// source: google/cloud/aiplatform/v1/persistent_resource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface ResourceRuntimeSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.ResourceRuntimeSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Configure the use of workload identity on the PersistentResource
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the serviceAccountSpec field is set.
   */
  boolean hasServiceAccountSpec();
  /**
   *
   *
   * <pre>
   * Optional. Configure the use of workload identity on the PersistentResource
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The serviceAccountSpec.
   */
  com.google.cloud.aiplatform.v1.ServiceAccountSpec getServiceAccountSpec();
  /**
   *
   *
   * <pre>
   * Optional. Configure the use of workload identity on the PersistentResource
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.ServiceAccountSpec service_account_spec = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ServiceAccountSpecOrBuilder getServiceAccountSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Ray cluster configuration.
   * Required when creating a dedicated RayCluster on the PersistentResource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the raySpec field is set.
   */
  boolean hasRaySpec();
  /**
   *
   *
   * <pre>
   * Optional. Ray cluster configuration.
   * Required when creating a dedicated RayCluster on the PersistentResource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The raySpec.
   */
  com.google.cloud.aiplatform.v1.RaySpec getRaySpec();
  /**
   *
   *
   * <pre>
   * Optional. Ray cluster configuration.
   * Required when creating a dedicated RayCluster on the PersistentResource.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.RaySpec ray_spec = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.aiplatform.v1.RaySpecOrBuilder getRaySpecOrBuilder();
}
