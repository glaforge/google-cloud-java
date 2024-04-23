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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_data_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface UploadRagFileRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.UploadRagFileRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the RagCorpus resource into which to upload the file.
   * Format:
   * `projects/{project}/locations/{location}/ragCorpora/{rag_corpus}`
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
   * Required. The name of the RagCorpus resource into which to upload the file.
   * Format:
   * `projects/{project}/locations/{location}/ragCorpora/{rag_corpus}`
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
   * Required. The RagFile to upload.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagFile rag_file = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the ragFile field is set.
   */
  boolean hasRagFile();
  /**
   *
   *
   * <pre>
   * Required. The RagFile to upload.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagFile rag_file = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The ragFile.
   */
  com.google.cloud.aiplatform.v1beta1.RagFile getRagFile();
  /**
   *
   *
   * <pre>
   * Required. The RagFile to upload.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.RagFile rag_file = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.RagFileOrBuilder getRagFileOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The config for the RagFiles to be uploaded into the RagCorpus.
   * [VertexRagDataService.UploadRagFile][google.cloud.aiplatform.v1beta1.VertexRagDataService.UploadRagFile].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.UploadRagFileConfig upload_rag_file_config = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the uploadRagFileConfig field is set.
   */
  boolean hasUploadRagFileConfig();
  /**
   *
   *
   * <pre>
   * Required. The config for the RagFiles to be uploaded into the RagCorpus.
   * [VertexRagDataService.UploadRagFile][google.cloud.aiplatform.v1beta1.VertexRagDataService.UploadRagFile].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.UploadRagFileConfig upload_rag_file_config = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The uploadRagFileConfig.
   */
  com.google.cloud.aiplatform.v1beta1.UploadRagFileConfig getUploadRagFileConfig();
  /**
   *
   *
   * <pre>
   * Required. The config for the RagFiles to be uploaded into the RagCorpus.
   * [VertexRagDataService.UploadRagFile][google.cloud.aiplatform.v1beta1.VertexRagDataService.UploadRagFile].
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1beta1.UploadRagFileConfig upload_rag_file_config = 5 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1beta1.UploadRagFileConfigOrBuilder
      getUploadRagFileConfigOrBuilder();
}
