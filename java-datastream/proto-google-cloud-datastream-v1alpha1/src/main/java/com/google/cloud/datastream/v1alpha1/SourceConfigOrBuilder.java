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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datastream.v1alpha1;

public interface SourceConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1alpha1.SourceConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Source connection profile identifier.
   * </pre>
   *
   * <code>string source_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The sourceConnectionProfileName.
   */
  java.lang.String getSourceConnectionProfileName();
  /**
   *
   *
   * <pre>
   * Required. Source connection profile identifier.
   * </pre>
   *
   * <code>string source_connection_profile_name = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for sourceConnectionProfileName.
   */
  com.google.protobuf.ByteString getSourceConnectionProfileNameBytes();

  /**
   *
   *
   * <pre>
   * Oracle data source configuration
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.OracleSourceConfig oracle_source_config = 100;</code>
   *
   * @return Whether the oracleSourceConfig field is set.
   */
  boolean hasOracleSourceConfig();
  /**
   *
   *
   * <pre>
   * Oracle data source configuration
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.OracleSourceConfig oracle_source_config = 100;</code>
   *
   * @return The oracleSourceConfig.
   */
  com.google.cloud.datastream.v1alpha1.OracleSourceConfig getOracleSourceConfig();
  /**
   *
   *
   * <pre>
   * Oracle data source configuration
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.OracleSourceConfig oracle_source_config = 100;</code>
   */
  com.google.cloud.datastream.v1alpha1.OracleSourceConfigOrBuilder getOracleSourceConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * MySQL data source configuration
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlSourceConfig mysql_source_config = 101;</code>
   *
   * @return Whether the mysqlSourceConfig field is set.
   */
  boolean hasMysqlSourceConfig();
  /**
   *
   *
   * <pre>
   * MySQL data source configuration
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlSourceConfig mysql_source_config = 101;</code>
   *
   * @return The mysqlSourceConfig.
   */
  com.google.cloud.datastream.v1alpha1.MysqlSourceConfig getMysqlSourceConfig();
  /**
   *
   *
   * <pre>
   * MySQL data source configuration
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.MysqlSourceConfig mysql_source_config = 101;</code>
   */
  com.google.cloud.datastream.v1alpha1.MysqlSourceConfigOrBuilder getMysqlSourceConfigOrBuilder();

  com.google.cloud.datastream.v1alpha1.SourceConfig.SourceStreamConfigCase
      getSourceStreamConfigCase();
}
