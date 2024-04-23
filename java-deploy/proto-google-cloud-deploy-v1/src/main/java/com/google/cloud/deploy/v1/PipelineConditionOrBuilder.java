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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

public interface PipelineConditionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.PipelineCondition)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Details around the Pipeline's overall status.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
   *
   * @return Whether the pipelineReadyCondition field is set.
   */
  boolean hasPipelineReadyCondition();
  /**
   *
   *
   * <pre>
   * Details around the Pipeline's overall status.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
   *
   * @return The pipelineReadyCondition.
   */
  com.google.cloud.deploy.v1.PipelineReadyCondition getPipelineReadyCondition();
  /**
   *
   *
   * <pre>
   * Details around the Pipeline's overall status.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.PipelineReadyCondition pipeline_ready_condition = 1;</code>
   */
  com.google.cloud.deploy.v1.PipelineReadyConditionOrBuilder getPipelineReadyConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Details around targets enumerated in the pipeline.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
   *
   * @return Whether the targetsPresentCondition field is set.
   */
  boolean hasTargetsPresentCondition();
  /**
   *
   *
   * <pre>
   * Details around targets enumerated in the pipeline.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
   *
   * @return The targetsPresentCondition.
   */
  com.google.cloud.deploy.v1.TargetsPresentCondition getTargetsPresentCondition();
  /**
   *
   *
   * <pre>
   * Details around targets enumerated in the pipeline.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsPresentCondition targets_present_condition = 3;</code>
   */
  com.google.cloud.deploy.v1.TargetsPresentConditionOrBuilder getTargetsPresentConditionOrBuilder();

  /**
   *
   *
   * <pre>
   * Details on the whether the targets enumerated in the pipeline are of the
   * same type.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsTypeCondition targets_type_condition = 4;</code>
   *
   * @return Whether the targetsTypeCondition field is set.
   */
  boolean hasTargetsTypeCondition();
  /**
   *
   *
   * <pre>
   * Details on the whether the targets enumerated in the pipeline are of the
   * same type.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsTypeCondition targets_type_condition = 4;</code>
   *
   * @return The targetsTypeCondition.
   */
  com.google.cloud.deploy.v1.TargetsTypeCondition getTargetsTypeCondition();
  /**
   *
   *
   * <pre>
   * Details on the whether the targets enumerated in the pipeline are of the
   * same type.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.TargetsTypeCondition targets_type_condition = 4;</code>
   */
  com.google.cloud.deploy.v1.TargetsTypeConditionOrBuilder getTargetsTypeConditionOrBuilder();
}
