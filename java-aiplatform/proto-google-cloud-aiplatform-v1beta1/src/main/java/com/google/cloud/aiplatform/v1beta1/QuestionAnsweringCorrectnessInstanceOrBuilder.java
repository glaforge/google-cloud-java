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
// source: google/cloud/aiplatform/v1beta1/evaluation_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface QuestionAnsweringCorrectnessInstanceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.QuestionAnsweringCorrectnessInstance)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the prediction field is set.
   */
  boolean hasPrediction();
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The prediction.
   */
  java.lang.String getPrediction();
  /**
   *
   *
   * <pre>
   * Required. Output of the evaluated model.
   * </pre>
   *
   * <code>optional string prediction = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for prediction.
   */
  com.google.protobuf.ByteString getPredictionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the reference field is set.
   */
  boolean hasReference();
  /**
   *
   *
   * <pre>
   * Optional. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The reference.
   */
  java.lang.String getReference();
  /**
   *
   *
   * <pre>
   * Optional. Ground truth used to compare against the prediction.
   * </pre>
   *
   * <code>optional string reference = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for reference.
   */
  com.google.protobuf.ByteString getReferenceBytes();

  /**
   *
   *
   * <pre>
   * Optional. Text provided as context to answer the question.
   * </pre>
   *
   * <code>optional string context = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the context field is set.
   */
  boolean hasContext();
  /**
   *
   *
   * <pre>
   * Optional. Text provided as context to answer the question.
   * </pre>
   *
   * <code>optional string context = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The context.
   */
  java.lang.String getContext();
  /**
   *
   *
   * <pre>
   * Optional. Text provided as context to answer the question.
   * </pre>
   *
   * <code>optional string context = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for context.
   */
  com.google.protobuf.ByteString getContextBytes();

  /**
   *
   *
   * <pre>
   * Required. The question asked and other instruction in the inference prompt.
   * </pre>
   *
   * <code>optional string instruction = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the instruction field is set.
   */
  boolean hasInstruction();
  /**
   *
   *
   * <pre>
   * Required. The question asked and other instruction in the inference prompt.
   * </pre>
   *
   * <code>optional string instruction = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The instruction.
   */
  java.lang.String getInstruction();
  /**
   *
   *
   * <pre>
   * Required. The question asked and other instruction in the inference prompt.
   * </pre>
   *
   * <code>optional string instruction = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for instruction.
   */
  com.google.protobuf.ByteString getInstructionBytes();
}
