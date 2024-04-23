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
// source: google/cloud/documentai/v1beta3/document_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1beta3;

public interface DocumentMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.DocumentMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Document identifier.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentId document_id = 1;</code>
   *
   * @return Whether the documentId field is set.
   */
  boolean hasDocumentId();
  /**
   *
   *
   * <pre>
   * Document identifier.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentId document_id = 1;</code>
   *
   * @return The documentId.
   */
  com.google.cloud.documentai.v1beta3.DocumentId getDocumentId();
  /**
   *
   *
   * <pre>
   * Document identifier.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentId document_id = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.DocumentIdOrBuilder getDocumentIdOrBuilder();

  /**
   *
   *
   * <pre>
   * Number of pages in the document.
   * </pre>
   *
   * <code>int32 page_count = 2;</code>
   *
   * @return The pageCount.
   */
  int getPageCount();

  /**
   *
   *
   * <pre>
   * Type of the dataset split to which the document belongs.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DatasetSplitType dataset_type = 3;</code>
   *
   * @return The enum numeric value on the wire for datasetType.
   */
  int getDatasetTypeValue();
  /**
   *
   *
   * <pre>
   * Type of the dataset split to which the document belongs.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DatasetSplitType dataset_type = 3;</code>
   *
   * @return The datasetType.
   */
  com.google.cloud.documentai.v1beta3.DatasetSplitType getDatasetType();

  /**
   *
   *
   * <pre>
   * Labeling state of the document.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentLabelingState labeling_state = 5;</code>
   *
   * @return The enum numeric value on the wire for labelingState.
   */
  int getLabelingStateValue();
  /**
   *
   *
   * <pre>
   * Labeling state of the document.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.DocumentLabelingState labeling_state = 5;</code>
   *
   * @return The labelingState.
   */
  com.google.cloud.documentai.v1beta3.DocumentLabelingState getLabelingState();

  /**
   *
   *
   * <pre>
   * The display name of the document.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The display name of the document.
   * </pre>
   *
   * <code>string display_name = 6;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();
}
