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

public interface InputConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.automl.v1beta1.InputConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Google Cloud Storage location for the input content.
   * In ImportData, the gcs_source points to a csv with structure described in
   * the comment.
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
   * The Google Cloud Storage location for the input content.
   * In ImportData, the gcs_source points to a csv with structure described in
   * the comment.
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
   * The Google Cloud Storage location for the input content.
   * In ImportData, the gcs_source points to a csv with structure described in
   * the comment.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.GcsSource gcs_source = 1;</code>
   */
  com.google.cloud.automl.v1beta1.GcsSourceOrBuilder getGcsSourceOrBuilder();

  /**
   *
   *
   * <pre>
   * The BigQuery location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQuerySource bigquery_source = 3;</code>
   *
   * @return Whether the bigquerySource field is set.
   */
  boolean hasBigquerySource();
  /**
   *
   *
   * <pre>
   * The BigQuery location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQuerySource bigquery_source = 3;</code>
   *
   * @return The bigquerySource.
   */
  com.google.cloud.automl.v1beta1.BigQuerySource getBigquerySource();
  /**
   *
   *
   * <pre>
   * The BigQuery location for the input content.
   * </pre>
   *
   * <code>.google.cloud.automl.v1beta1.BigQuerySource bigquery_source = 3;</code>
   */
  com.google.cloud.automl.v1beta1.BigQuerySourceOrBuilder getBigquerySourceOrBuilder();

  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   *
   * *  For Tables:
   *    `schema_inference_version` - (integer) Required. The version of the
   *        algorithm that should be used for the initial inference of the
   *        schema (columns' DataTypes) of the table the data is being imported
   *        into. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  int getParamsCount();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   *
   * *  For Tables:
   *    `schema_inference_version` - (integer) Required. The version of the
   *        algorithm that should be used for the initial inference of the
   *        schema (columns' DataTypes) of the table the data is being imported
   *        into. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  boolean containsParams(java.lang.String key);
  /** Use {@link #getParamsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getParams();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   *
   * *  For Tables:
   *    `schema_inference_version` - (integer) Required. The version of the
   *        algorithm that should be used for the initial inference of the
   *        schema (columns' DataTypes) of the table the data is being imported
   *        into. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getParamsMap();
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   *
   * *  For Tables:
   *    `schema_inference_version` - (integer) Required. The version of the
   *        algorithm that should be used for the initial inference of the
   *        schema (columns' DataTypes) of the table the data is being imported
   *        into. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  /* nullable */
  java.lang.String getParamsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Additional domain-specific parameters describing the semantic of the
   * imported data, any string must be up to 25000
   * characters long.
   *
   * *  For Tables:
   *    `schema_inference_version` - (integer) Required. The version of the
   *        algorithm that should be used for the initial inference of the
   *        schema (columns' DataTypes) of the table the data is being imported
   *        into. Allowed values: "1".
   * </pre>
   *
   * <code>map&lt;string, string&gt; params = 2;</code>
   */
  java.lang.String getParamsOrThrow(java.lang.String key);

  com.google.cloud.automl.v1beta1.InputConfig.SourceCase getSourceCase();
}
