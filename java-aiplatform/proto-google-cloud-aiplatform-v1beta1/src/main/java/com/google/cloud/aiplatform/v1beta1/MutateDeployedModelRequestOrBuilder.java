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
// source: google/cloud/aiplatform/v1beta1/endpoint_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface MutateDeployedModelRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.MutateDeployedModelRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint resource into which to mutate a
   * DeployedModel. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The endpoint.
   */
  java.lang.String getEndpoint();
  /**
   *
   *
   * <pre>
   * Required. The name of the Endpoint resource into which to mutate a
   * DeployedModel. Format:
   * `projects/{project}/locations/{location}/endpoints/{endpoint}`
   * </pre>
   *
   * <code>
   * string endpoint = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for endpoint.
   */
  com.google.protobuf.ByteString getEndpointBytes();

  /**
   *
   *
   * <pre>
   * Required. The DeployedModel to be mutated within the Endpoint. Only the
   * following fields can be mutated:
   *
   * * `min_replica_count` in either
   * [DedicatedResources][google.cloud.aiplatform.v1beta1.DedicatedResources] or
   * [AutomaticResources][google.cloud.aiplatform.v1beta1.AutomaticResources]
   * * `max_replica_count` in either
   * [DedicatedResources][google.cloud.aiplatform.v1beta1.DedicatedResources] or
   * [AutomaticResources][google.cloud.aiplatform.v1beta1.AutomaticResources]
   * * [autoscaling_metric_specs][google.cloud.aiplatform.v1beta1.DedicatedResources.autoscaling_metric_specs]
   * * `disable_container_logging` (v1 only)
   * * `enable_container_logging` (v1beta1 only)
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the deployedModel field is set.
   */
  boolean hasDeployedModel();
  /**
   *
   *
   * <pre>
   * Required. The DeployedModel to be mutated within the Endpoint. Only the
   * following fields can be mutated:
   *
   * * `min_replica_count` in either
   * [DedicatedResources][google.cloud.aiplatform.v1beta1.DedicatedResources] or
   * [AutomaticResources][google.cloud.aiplatform.v1beta1.AutomaticResources]
   * * `max_replica_count` in either
   * [DedicatedResources][google.cloud.aiplatform.v1beta1.DedicatedResources] or
   * [AutomaticResources][google.cloud.aiplatform.v1beta1.AutomaticResources]
   * * [autoscaling_metric_specs][google.cloud.aiplatform.v1beta1.DedicatedResources.autoscaling_metric_specs]
   * * `disable_container_logging` (v1 only)
   * * `enable_container_logging` (v1beta1 only)
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The deployedModel.
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModel getDeployedModel();
  /**
   *
   *
   * <pre>
   * Required. The DeployedModel to be mutated within the Endpoint. Only the
   * following fields can be mutated:
   *
   * * `min_replica_count` in either
   * [DedicatedResources][google.cloud.aiplatform.v1beta1.DedicatedResources] or
   * [AutomaticResources][google.cloud.aiplatform.v1beta1.AutomaticResources]
   * * `max_replica_count` in either
   * [DedicatedResources][google.cloud.aiplatform.v1beta1.DedicatedResources] or
   * [AutomaticResources][google.cloud.aiplatform.v1beta1.AutomaticResources]
   * * [autoscaling_metric_specs][google.cloud.aiplatform.v1beta1.DedicatedResources.autoscaling_metric_specs]
   * * `disable_container_logging` (v1 only)
   * * `enable_container_logging` (v1beta1 only)
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.DeployedModel deployed_model = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.DeployedModelOrBuilder getDeployedModelOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Required. The update mask applies to the resource. See
   * [google.protobuf.FieldMask][google.protobuf.FieldMask].
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 4 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
