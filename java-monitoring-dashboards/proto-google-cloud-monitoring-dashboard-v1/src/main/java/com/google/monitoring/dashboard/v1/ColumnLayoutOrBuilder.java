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
// source: google/monitoring/dashboard/v1/layouts.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.dashboard.v1;

public interface ColumnLayoutOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.dashboard.v1.ColumnLayout)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The columns of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.ColumnLayout.Column columns = 1;</code>
   */
  java.util.List<com.google.monitoring.dashboard.v1.ColumnLayout.Column> getColumnsList();
  /**
   *
   *
   * <pre>
   * The columns of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.ColumnLayout.Column columns = 1;</code>
   */
  com.google.monitoring.dashboard.v1.ColumnLayout.Column getColumns(int index);
  /**
   *
   *
   * <pre>
   * The columns of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.ColumnLayout.Column columns = 1;</code>
   */
  int getColumnsCount();
  /**
   *
   *
   * <pre>
   * The columns of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.ColumnLayout.Column columns = 1;</code>
   */
  java.util.List<? extends com.google.monitoring.dashboard.v1.ColumnLayout.ColumnOrBuilder>
      getColumnsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The columns of content to display.
   * </pre>
   *
   * <code>repeated .google.monitoring.dashboard.v1.ColumnLayout.Column columns = 1;</code>
   */
  com.google.monitoring.dashboard.v1.ColumnLayout.ColumnOrBuilder getColumnsOrBuilder(int index);
}
