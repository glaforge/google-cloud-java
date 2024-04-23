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
// source: google/cloud/aiplatform/v1beta1/unmanaged_container_model.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface UnmanagedContainerModelOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UnmanagedContainerModel)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The path to the directory containing the Model artifact and any of its
   * supporting files.
   * </pre>
   *
   * <code>string artifact_uri = 1;</code>
   *
   * @return The artifactUri.
   */
  java.lang.String getArtifactUri();
  /**
   *
   *
   * <pre>
   * The path to the directory containing the Model artifact and any of its
   * supporting files.
   * </pre>
   *
   * <code>string artifact_uri = 1;</code>
   *
   * @return The bytes for artifactUri.
   */
  com.google.protobuf.ByteString getArtifactUriBytes();

  /**
   *
   *
   * <pre>
   * Contains the schemata used in Model's predictions and explanations
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PredictSchemata predict_schemata = 2;</code>
   *
   * @return Whether the predictSchemata field is set.
   */
  boolean hasPredictSchemata();
  /**
   *
   *
   * <pre>
   * Contains the schemata used in Model's predictions and explanations
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PredictSchemata predict_schemata = 2;</code>
   *
   * @return The predictSchemata.
   */
  com.google.cloud.aiplatform.v1beta1.PredictSchemata getPredictSchemata();
  /**
   *
   *
   * <pre>
   * Contains the schemata used in Model's predictions and explanations
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.PredictSchemata predict_schemata = 2;</code>
   */
  com.google.cloud.aiplatform.v1beta1.PredictSchemataOrBuilder getPredictSchemataOrBuilder();

  /**
   *
   *
   * <pre>
   * Input only. The specification of the container that is to be used when
   * deploying this Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return Whether the containerSpec field is set.
   */
  boolean hasContainerSpec();
  /**
   *
   *
   * <pre>
   * Input only. The specification of the container that is to be used when
   * deploying this Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   *
   * @return The containerSpec.
   */
  com.google.cloud.aiplatform.v1beta1.ModelContainerSpec getContainerSpec();
  /**
   *
   *
   * <pre>
   * Input only. The specification of the container that is to be used when
   * deploying this Model.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.ModelContainerSpec container_spec = 3 [(.google.api.field_behavior) = INPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.ModelContainerSpecOrBuilder getContainerSpecOrBuilder();
}
