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
// source: google/cloud/run/v2/execution.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.run.v2;

public interface ListExecutionsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.ListExecutionsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resulting list of Executions.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Execution executions = 1;</code>
   */
  java.util.List<com.google.cloud.run.v2.Execution> getExecutionsList();
  /**
   *
   *
   * <pre>
   * The resulting list of Executions.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Execution executions = 1;</code>
   */
  com.google.cloud.run.v2.Execution getExecutions(int index);
  /**
   *
   *
   * <pre>
   * The resulting list of Executions.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Execution executions = 1;</code>
   */
  int getExecutionsCount();
  /**
   *
   *
   * <pre>
   * The resulting list of Executions.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Execution executions = 1;</code>
   */
  java.util.List<? extends com.google.cloud.run.v2.ExecutionOrBuilder> getExecutionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The resulting list of Executions.
   * </pre>
   *
   * <code>repeated .google.cloud.run.v2.Execution executions = 1;</code>
   */
  com.google.cloud.run.v2.ExecutionOrBuilder getExecutionsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token indicating there are more items than page_size. Use it in the next
   * ListExecutions request to continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * A token indicating there are more items than page_size. Use it in the next
   * ListExecutions request to continue.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
