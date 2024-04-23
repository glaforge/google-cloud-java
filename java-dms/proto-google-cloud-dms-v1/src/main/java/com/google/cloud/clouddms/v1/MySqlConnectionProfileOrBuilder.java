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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

public interface MySqlConnectionProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.MySqlConnectionProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The IP or hostname of the source MySQL database.
   * </pre>
   *
   * <code>string host = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The host.
   */
  java.lang.String getHost();
  /**
   *
   *
   * <pre>
   * Required. The IP or hostname of the source MySQL database.
   * </pre>
   *
   * <code>string host = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for host.
   */
  com.google.protobuf.ByteString getHostBytes();

  /**
   *
   *
   * <pre>
   * Required. The network port of the source MySQL database.
   * </pre>
   *
   * <code>int32 port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The port.
   */
  int getPort();

  /**
   *
   *
   * <pre>
   * Required. The username that Database Migration Service will use to connect
   * to the database. The value is encrypted when stored in Database Migration
   * Service.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The username.
   */
  java.lang.String getUsername();
  /**
   *
   *
   * <pre>
   * Required. The username that Database Migration Service will use to connect
   * to the database. The value is encrypted when stored in Database Migration
   * Service.
   * </pre>
   *
   * <code>string username = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for username.
   */
  com.google.protobuf.ByteString getUsernameBytes();

  /**
   *
   *
   * <pre>
   * Required. Input only. The password for the user that Database Migration
   * Service will be using to connect to the database. This field is not
   * returned on request, and the value is encrypted when stored in Database
   * Migration Service.
   * </pre>
   *
   * <code>
   * string password = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The password.
   */
  java.lang.String getPassword();
  /**
   *
   *
   * <pre>
   * Required. Input only. The password for the user that Database Migration
   * Service will be using to connect to the database. This field is not
   * returned on request, and the value is encrypted when stored in Database
   * Migration Service.
   * </pre>
   *
   * <code>
   * string password = 4 [(.google.api.field_behavior) = INPUT_ONLY, (.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The bytes for password.
   */
  com.google.protobuf.ByteString getPasswordBytes();

  /**
   *
   *
   * <pre>
   * Output only. Indicates If this connection profile password is stored.
   * </pre>
   *
   * <code>bool password_set = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The passwordSet.
   */
  boolean getPasswordSet();

  /**
   *
   *
   * <pre>
   * SSL configuration for the destination to connect to the source database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SslConfig ssl = 6;</code>
   *
   * @return Whether the ssl field is set.
   */
  boolean hasSsl();
  /**
   *
   *
   * <pre>
   * SSL configuration for the destination to connect to the source database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SslConfig ssl = 6;</code>
   *
   * @return The ssl.
   */
  com.google.cloud.clouddms.v1.SslConfig getSsl();
  /**
   *
   *
   * <pre>
   * SSL configuration for the destination to connect to the source database.
   * </pre>
   *
   * <code>.google.cloud.clouddms.v1.SslConfig ssl = 6;</code>
   */
  com.google.cloud.clouddms.v1.SslConfigOrBuilder getSslOrBuilder();

  /**
   *
   *
   * <pre>
   * If the source is a Cloud SQL database, use this field to
   * provide the Cloud SQL instance ID of the source.
   * </pre>
   *
   * <code>string cloud_sql_id = 7;</code>
   *
   * @return The cloudSqlId.
   */
  java.lang.String getCloudSqlId();
  /**
   *
   *
   * <pre>
   * If the source is a Cloud SQL database, use this field to
   * provide the Cloud SQL instance ID of the source.
   * </pre>
   *
   * <code>string cloud_sql_id = 7;</code>
   *
   * @return The bytes for cloudSqlId.
   */
  com.google.protobuf.ByteString getCloudSqlIdBytes();
}
