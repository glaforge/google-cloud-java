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
// source: google/cloud/datalabeling/v1beta1/data_labeling_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface CreateEvaluationJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.CreateEvaluationJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Evaluation job resource parent. Format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;"
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
   * Required. Evaluation job resource parent. Format:
   * "projects/&lt;var&gt;{project_id}&lt;/var&gt;"
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
   * Required. The evaluation job to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * Required. The evaluation job to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The job.
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJob getJob();
  /**
   *
   *
   * <pre>
   * Required. The evaluation job to create.
   * </pre>
   *
   * <code>
   * .google.cloud.datalabeling.v1beta1.EvaluationJob job = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.EvaluationJobOrBuilder getJobOrBuilder();
}
