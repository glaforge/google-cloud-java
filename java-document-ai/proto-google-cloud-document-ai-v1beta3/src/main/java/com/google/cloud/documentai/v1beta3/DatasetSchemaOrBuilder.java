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
// source: google/cloud/documentai/v1beta3/dataset.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1beta3;

public interface DatasetSchemaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.documentai.v1beta3.DatasetSchema)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Dataset schema resource name.
   * Format:
   * `projects/{project}/locations/{location}/processors/{processor}/dataset/datasetSchema`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Dataset schema resource name.
   * Format:
   * `projects/{project}/locations/{location}/processors/{processor}/dataset/datasetSchema`
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Optional. Schema of the dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentSchema document_schema = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the documentSchema field is set.
   */
  boolean hasDocumentSchema();
  /**
   *
   *
   * <pre>
   * Optional. Schema of the dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentSchema document_schema = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The documentSchema.
   */
  com.google.cloud.documentai.v1beta3.DocumentSchema getDocumentSchema();
  /**
   *
   *
   * <pre>
   * Optional. Schema of the dataset.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1beta3.DocumentSchema document_schema = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.documentai.v1beta3.DocumentSchemaOrBuilder getDocumentSchemaOrBuilder();
}
