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
// source: google/cloud/automl/v1beta1/io.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.automl.v1beta1;

public interface DocumentInputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.DocumentInputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * Max supported size: 512MB.
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return Whether the gcsSource field is set.
   */
  boolean hasGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * Max supported size: 512MB.
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   *
   * @return The gcsSource.
   */
  com.google.cloud.automl.v1beta1.GcsSource getGcsSource();
  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location of the document file. Only a single path
   * should be given.
   * Max supported size: 512MB.
   * Supported extensions: .PDF.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();
}
