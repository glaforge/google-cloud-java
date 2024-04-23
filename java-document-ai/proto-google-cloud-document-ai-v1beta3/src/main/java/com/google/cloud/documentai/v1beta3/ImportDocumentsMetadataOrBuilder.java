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

public interface ImportDocumentsMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.ImportDocumentsMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The basic metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.CommonOperationMetadata common_metadata = 1;</code>
   *
   * @return Whether the commonMetadata field is set.
   */
  boolean hasCommonMetadata();
  /**
   *
   *
   * <pre>
   * The basic metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.CommonOperationMetadata common_metadata = 1;</code>
   *
   * @return The commonMetadata.
   */
  com.google.cloud.documentai.v1beta3.CommonOperationMetadata getCommonMetadata();
  /**
   *
   *
   * <pre>
   * The basic metadata of the long-running operation.
   * </pre>
   *
   * <code>.google.cloud.documentai.v1beta3.CommonOperationMetadata common_metadata = 1;</code>
   */
  com.google.cloud.documentai.v1beta3.CommonOperationMetadataOrBuilder getCommonMetadataOrBuilder();

  /**
   *
   *
   * <pre>
   * The list of response details of each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus individual_import_statuses = 2;
   * </code>
   */
  java.util.List<com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus>
      getIndividualImportStatusesList();
  /**
   *
   *
   * <pre>
   * The list of response details of each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus individual_import_statuses = 2;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus
      getIndividualImportStatuses(int index);
  /**
   *
   *
   * <pre>
   * The list of response details of each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus individual_import_statuses = 2;
   * </code>
   */
  int getIndividualImportStatusesCount();
  /**
   *
   *
   * <pre>
   * The list of response details of each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus individual_import_statuses = 2;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata
                  .IndividualImportStatusOrBuilder>
      getIndividualImportStatusesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of response details of each document.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatus individual_import_statuses = 2;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata.IndividualImportStatusOrBuilder
      getIndividualImportStatusesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Validation statuses of the batch documents import config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult import_config_validation_results = 4;
   * </code>
   */
  java.util.List<
          com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult>
      getImportConfigValidationResultsList();
  /**
   *
   *
   * <pre>
   * Validation statuses of the batch documents import config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult import_config_validation_results = 4;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult
      getImportConfigValidationResults(int index);
  /**
   *
   *
   * <pre>
   * Validation statuses of the batch documents import config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult import_config_validation_results = 4;
   * </code>
   */
  int getImportConfigValidationResultsCount();
  /**
   *
   *
   * <pre>
   * Validation statuses of the batch documents import config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult import_config_validation_results = 4;
   * </code>
   */
  java.util.List<
          ? extends
              com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata
                  .ImportConfigValidationResultOrBuilder>
      getImportConfigValidationResultsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Validation statuses of the batch documents import config.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResult import_config_validation_results = 4;
   * </code>
   */
  com.google.cloud.documentai.v1beta3.ImportDocumentsMetadata.ImportConfigValidationResultOrBuilder
      getImportConfigValidationResultsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Total number of the documents that are qualified for importing.
   * </pre>
   *
   * <code>int32 total_document_count = 3;</code>
   *
   * @return The totalDocumentCount.
   */
  int getTotalDocumentCount();
}
