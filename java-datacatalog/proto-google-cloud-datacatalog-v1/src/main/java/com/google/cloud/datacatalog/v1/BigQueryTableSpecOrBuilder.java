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
// source: google/cloud/datacatalog/v1/table_spec.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

public interface BigQueryTableSpecOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.v1.BigQueryTableSpec)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The table source type.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for tableSourceType.
   */
  int getTableSourceTypeValue();
  /**
   *
   *
   * <pre>
   * Output only. The table source type.
   * </pre>
   *
   * <code>
   * .google.cloud.datacatalog.v1.TableSourceType table_source_type = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The tableSourceType.
   */
  com.google.cloud.datacatalog.v1.TableSourceType getTableSourceType();

  /**
   *
   *
   * <pre>
   * Table view specification. Populated only if
   * the `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ViewSpec view_spec = 2;</code>
   *
   * @return Whether the viewSpec field is set.
   */
  boolean hasViewSpec();
  /**
   *
   *
   * <pre>
   * Table view specification. Populated only if
   * the `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ViewSpec view_spec = 2;</code>
   *
   * @return The viewSpec.
   */
  com.google.cloud.datacatalog.v1.ViewSpec getViewSpec();
  /**
   *
   *
   * <pre>
   * Table view specification. Populated only if
   * the `table_source_type` is `BIGQUERY_VIEW`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.ViewSpec view_spec = 2;</code>
   */
  com.google.cloud.datacatalog.v1.ViewSpecOrBuilder getViewSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Specification of a BigQuery table. Populated only if
   * the `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TableSpec table_spec = 3;</code>
   *
   * @return Whether the tableSpec field is set.
   */
  boolean hasTableSpec();
  /**
   *
   *
   * <pre>
   * Specification of a BigQuery table. Populated only if
   * the `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TableSpec table_spec = 3;</code>
   *
   * @return The tableSpec.
   */
  com.google.cloud.datacatalog.v1.TableSpec getTableSpec();
  /**
   *
   *
   * <pre>
   * Specification of a BigQuery table. Populated only if
   * the `table_source_type` is `BIGQUERY_TABLE`.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.TableSpec table_spec = 3;</code>
   */
  com.google.cloud.datacatalog.v1.TableSpecOrBuilder getTableSpecOrBuilder();

  com.google.cloud.datacatalog.v1.BigQueryTableSpec.TypeSpecCase getTypeSpecCase();
}
