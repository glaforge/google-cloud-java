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
// source:
// google/cloud/aiplatform/v1beta1/schema/trainingjob/definition/automl_video_object_tracking.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition;

public interface AutoMlVideoObjectTrackingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTracking)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
   * </code>
   *
   * @return Whether the inputs field is set.
   */
  boolean hasInputs();
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
   * </code>
   *
   * @return The inputs.
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs
      getInputs();
  /**
   *
   *
   * <pre>
   * The input parameters of this TrainingJob.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.schema.trainingjob.definition.AutoMlVideoObjectTrackingInputs inputs = 1;
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.schema.trainingjob.definition
          .AutoMlVideoObjectTrackingInputsOrBuilder
      getInputsOrBuilder();
}
