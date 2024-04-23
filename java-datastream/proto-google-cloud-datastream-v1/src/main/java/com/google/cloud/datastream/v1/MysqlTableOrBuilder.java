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
// source: google/cloud/datastream/v1/datastream_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datastream.v1;

public interface MysqlTableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datastream.v1.MysqlTable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table = 1;</code>
   *
   * @return The table.
   */
  java.lang.String getTable();
  /**
   *
   *
   * <pre>
   * Table name.
   * </pre>
   *
   * <code>string table = 1;</code>
   *
   * @return The bytes for table.
   */
  com.google.protobuf.ByteString getTableBytes();

  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude objects, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlColumn mysql_columns = 2;</code>
   */
  java.util.List<com.google.cloud.datastream.v1.MysqlColumn> getMysqlColumnsList();
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude objects, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlColumn mysql_columns = 2;</code>
   */
  com.google.cloud.datastream.v1.MysqlColumn getMysqlColumns(int index);
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude objects, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlColumn mysql_columns = 2;</code>
   */
  int getMysqlColumnsCount();
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude objects, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlColumn mysql_columns = 2;</code>
   */
  java.util.List<? extends com.google.cloud.datastream.v1.MysqlColumnOrBuilder>
      getMysqlColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * MySQL columns in the database.
   * When unspecified as part of include/exclude objects, includes/excludes
   * everything.
   * </pre>
   *
   * <code>repeated .google.cloud.datastream.v1.MysqlColumn mysql_columns = 2;</code>
   */
  com.google.cloud.datastream.v1.MysqlColumnOrBuilder getMysqlColumnsOrBuilder(int index);
}
