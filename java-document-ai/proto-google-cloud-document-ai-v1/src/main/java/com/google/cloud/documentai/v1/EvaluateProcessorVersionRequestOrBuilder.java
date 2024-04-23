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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1;

public interface EvaluateProcessorVersionRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1.EvaluateProcessorVersionRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The processorVersion.
   */
  java.lang.String getProcessorVersion();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for processorVersion.
   */
  com.google.protobuf.ByteString getProcessorVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the evaluationDocuments field is set.
   */
  boolean hasEvaluationDocuments();
  /**
   *
   *
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The evaluationDocuments.
   */
  com.google.cloud.documentai.v1.BatchDocumentsInputConfig getEvaluationDocuments();
  /**
   *
   *
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder
      getEvaluationDocumentsOrBuilder();
}
