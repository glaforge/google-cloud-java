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
// source: google/cloud/aiplatform/v1/tuning_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface SupervisedHyperParametersOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SupervisedHyperParameters)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Number of training epoches for this tuning job.
   * </pre>
   *
   * <code>int64 epoch_count = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The epochCount.
   */
  long getEpochCount();

  /**
   *
   *
   * <pre>
   * Optional. Learning rate multiplier for tuning.
   * </pre>
   *
   * <code>double learning_rate_multiplier = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The learningRateMultiplier.
   */
  double getLearningRateMultiplier();

  /**
   *
   *
   * <pre>
   * Optional. Adapter size for tuning.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for adapterSize.
   */
  int getAdapterSizeValue();
  /**
   *
   *
   * <pre>
   * Optional. Adapter size for tuning.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.SupervisedHyperParameters.AdapterSize adapter_size = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The adapterSize.
   */
  com.google.cloud.aiplatform.v1.SupervisedHyperParameters.AdapterSize getAdapterSize();
}
