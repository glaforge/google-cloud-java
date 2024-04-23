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
// source: google/cloud/bigquery/migration/v2alpha/translation_task.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.migration.v2alpha;

public interface BteqOptionsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.migration.v2alpha.BteqOptions)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Specifies the project and dataset in BigQuery that will be used for
   * external table creation during the translation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.DatasetReference project_dataset = 1;</code>
   *
   * @return Whether the projectDataset field is set.
   */
  boolean hasProjectDataset();
  /**
   *
   *
   * <pre>
   * Specifies the project and dataset in BigQuery that will be used for
   * external table creation during the translation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.DatasetReference project_dataset = 1;</code>
   *
   * @return The projectDataset.
   */
  com.google.cloud.bigquery.migration.v2alpha.DatasetReference getProjectDataset();
  /**
   *
   *
   * <pre>
   * Specifies the project and dataset in BigQuery that will be used for
   * external table creation during the translation.
   * </pre>
   *
   * <code>.google.cloud.bigquery.migration.v2alpha.DatasetReference project_dataset = 1;</code>
   */
  com.google.cloud.bigquery.migration.v2alpha.DatasetReferenceOrBuilder
      getProjectDatasetOrBuilder();

  /**
   *
   *
   * <pre>
   * The Cloud Storage location to be used as the default path for files that
   * are not otherwise specified in the file replacement map.
   * </pre>
   *
   * <code>string default_path_uri = 2;</code>
   *
   * @return The defaultPathUri.
   */
  java.lang.String getDefaultPathUri();
  /**
   *
   *
   * <pre>
   * The Cloud Storage location to be used as the default path for files that
   * are not otherwise specified in the file replacement map.
   * </pre>
   *
   * <code>string default_path_uri = 2;</code>
   *
   * @return The bytes for defaultPathUri.
   */
  com.google.protobuf.ByteString getDefaultPathUriBytes();

  /**
   *
   *
   * <pre>
   * Maps the local paths that are used in BTEQ scripts (the keys) to the paths
   * in Cloud Storage that should be used in their stead in the translation (the
   * value).
   * </pre>
   *
   * <code>map&lt;string, string&gt; file_replacement_map = 3;</code>
   */
  int getFileReplacementMapCount();
  /**
   *
   *
   * <pre>
   * Maps the local paths that are used in BTEQ scripts (the keys) to the paths
   * in Cloud Storage that should be used in their stead in the translation (the
   * value).
   * </pre>
   *
   * <code>map&lt;string, string&gt; file_replacement_map = 3;</code>
   */
  boolean containsFileReplacementMap(java.lang.String key);
  /** Use {@link #getFileReplacementMapMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getFileReplacementMap();
  /**
   *
   *
   * <pre>
   * Maps the local paths that are used in BTEQ scripts (the keys) to the paths
   * in Cloud Storage that should be used in their stead in the translation (the
   * value).
   * </pre>
   *
   * <code>map&lt;string, string&gt; file_replacement_map = 3;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getFileReplacementMapMap();
  /**
   *
   *
   * <pre>
   * Maps the local paths that are used in BTEQ scripts (the keys) to the paths
   * in Cloud Storage that should be used in their stead in the translation (the
   * value).
   * </pre>
   *
   * <code>map&lt;string, string&gt; file_replacement_map = 3;</code>
   */
  /* nullable */
  java.lang.String getFileReplacementMapOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Maps the local paths that are used in BTEQ scripts (the keys) to the paths
   * in Cloud Storage that should be used in their stead in the translation (the
   * value).
   * </pre>
   *
   * <code>map&lt;string, string&gt; file_replacement_map = 3;</code>
   */
  java.lang.String getFileReplacementMapOrThrow(java.lang.String key);
}
