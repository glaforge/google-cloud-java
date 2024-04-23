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
// source: google/cloud/bigquery/analyticshub/v1/analyticshub.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.bigquery.analyticshub.v1;

public interface CreateDataExchangeRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.bigquery.analyticshub.v1.CreateDataExchangeRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource path of the data exchange.
   * e.g. `projects/myproject/locations/US`.
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
   * Required. The parent resource path of the data exchange.
   * e.g. `projects/myproject/locations/US`.
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
   * Required. The ID of the data exchange.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string data_exchange_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dataExchangeId.
   */
  java.lang.String getDataExchangeId();
  /**
   *
   *
   * <pre>
   * Required. The ID of the data exchange.
   * Must contain only Unicode letters, numbers (0-9), underscores (_).
   * Should not use characters that require URL-escaping, or characters
   * outside of ASCII, spaces.
   * Max length: 100 bytes.
   * </pre>
   *
   * <code>string data_exchange_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dataExchangeId.
   */
  com.google.protobuf.ByteString getDataExchangeIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The data exchange to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchange = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the dataExchange field is set.
   */
  boolean hasDataExchange();
  /**
   *
   *
   * <pre>
   * Required. The data exchange to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchange = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The dataExchange.
   */
  com.google.cloud.bigquery.analyticshub.v1.DataExchange getDataExchange();
  /**
   *
   *
   * <pre>
   * Required. The data exchange to create.
   * </pre>
   *
   * <code>
   * .google.cloud.bigquery.analyticshub.v1.DataExchange data_exchange = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.bigquery.analyticshub.v1.DataExchangeOrBuilder getDataExchangeOrBuilder();
}
