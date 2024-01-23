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
// source: google/cloud/batch/v1alpha/task.proto

package com.google.cloud.batch.v1alpha;

public interface TaskExecutionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.TaskExecution)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * When task is completed as the status of FAILED or SUCCEEDED,
   * exit code is for one task execution result, default is 0 as success.
   * </pre>
   *
   * <code>int32 exit_code = 1;</code>
   *
   * @return The exitCode.
   */
  int getExitCode();

  /**
   *
   *
   * <pre>
   * Optional. The tail end of any content written to standard error by the task
   * execution. This field will be populated only when the execution failed.
   * </pre>
   *
   * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The stderrSnippet.
   */
  java.lang.String getStderrSnippet();
  /**
   *
   *
   * <pre>
   * Optional. The tail end of any content written to standard error by the task
   * execution. This field will be populated only when the execution failed.
   * </pre>
   *
   * <code>string stderr_snippet = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for stderrSnippet.
   */
  com.google.protobuf.ByteString getStderrSnippetBytes();
}
