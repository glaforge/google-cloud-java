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
// source: google/cloud/batch/v1/task.proto

package com.google.cloud.batch.v1;

public interface RunnableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1.Runnable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Container runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Container container = 1;</code>
   *
   * @return Whether the container field is set.
   */
  boolean hasContainer();
  /**
   *
   *
   * <pre>
   * Container runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Container container = 1;</code>
   *
   * @return The container.
   */
  com.google.cloud.batch.v1.Runnable.Container getContainer();
  /**
   *
   *
   * <pre>
   * Container runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Container container = 1;</code>
   */
  com.google.cloud.batch.v1.Runnable.ContainerOrBuilder getContainerOrBuilder();

  /**
   *
   *
   * <pre>
   * Script runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Script script = 2;</code>
   *
   * @return Whether the script field is set.
   */
  boolean hasScript();
  /**
   *
   *
   * <pre>
   * Script runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Script script = 2;</code>
   *
   * @return The script.
   */
  com.google.cloud.batch.v1.Runnable.Script getScript();
  /**
   *
   *
   * <pre>
   * Script runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Script script = 2;</code>
   */
  com.google.cloud.batch.v1.Runnable.ScriptOrBuilder getScriptOrBuilder();

  /**
   *
   *
   * <pre>
   * Barrier runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Barrier barrier = 6;</code>
   *
   * @return Whether the barrier field is set.
   */
  boolean hasBarrier();
  /**
   *
   *
   * <pre>
   * Barrier runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Barrier barrier = 6;</code>
   *
   * @return The barrier.
   */
  com.google.cloud.batch.v1.Runnable.Barrier getBarrier();
  /**
   *
   *
   * <pre>
   * Barrier runnable.
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Runnable.Barrier barrier = 6;</code>
   */
  com.google.cloud.batch.v1.Runnable.BarrierOrBuilder getBarrierOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. DisplayName is an optional field that can be provided by the
   * caller. If provided, it will be used in logs and other outputs to identify
   * the script, making it easier for users to understand the logs. If not
   * provided the index of the runnable will be used for outputs.
   * </pre>
   *
   * <code>string display_name = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * Optional. DisplayName is an optional field that can be provided by the
   * caller. If provided, it will be used in logs and other outputs to identify
   * the script, making it easier for users to understand the logs. If not
   * provided the index of the runnable will be used for outputs.
   * </pre>
   *
   * <code>string display_name = 10 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * Normally, a non-zero exit status causes the Task to fail. This flag allows
   * execution of other Runnables to continue instead.
   * </pre>
   *
   * <code>bool ignore_exit_status = 3;</code>
   *
   * @return The ignoreExitStatus.
   */
  boolean getIgnoreExitStatus();

  /**
   *
   *
   * <pre>
   * This flag allows a Runnable to continue running in the background while the
   * Task executes subsequent Runnables. This is useful to provide services to
   * other Runnables (or to provide debugging support tools like SSH servers).
   * </pre>
   *
   * <code>bool background = 4;</code>
   *
   * @return The background.
   */
  boolean getBackground();

  /**
   *
   *
   * <pre>
   * By default, after a Runnable fails, no further Runnable are executed. This
   * flag indicates that this Runnable must be run even if the Task has already
   * failed. This is useful for Runnables that copy output files off of the VM
   * or for debugging.
   *
   * The always_run flag does not override the Task's overall max_run_duration.
   * If the max_run_duration has expired then no further Runnables will execute,
   * not even always_run Runnables.
   * </pre>
   *
   * <code>bool always_run = 5;</code>
   *
   * @return The alwaysRun.
   */
  boolean getAlwaysRun();

  /**
   *
   *
   * <pre>
   * Environment variables for this Runnable (overrides variables set for the
   * whole Task or TaskGroup).
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Environment environment = 7;</code>
   *
   * @return Whether the environment field is set.
   */
  boolean hasEnvironment();
  /**
   *
   *
   * <pre>
   * Environment variables for this Runnable (overrides variables set for the
   * whole Task or TaskGroup).
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Environment environment = 7;</code>
   *
   * @return The environment.
   */
  com.google.cloud.batch.v1.Environment getEnvironment();
  /**
   *
   *
   * <pre>
   * Environment variables for this Runnable (overrides variables set for the
   * whole Task or TaskGroup).
   * </pre>
   *
   * <code>.google.cloud.batch.v1.Environment environment = 7;</code>
   */
  com.google.cloud.batch.v1.EnvironmentOrBuilder getEnvironmentOrBuilder();

  /**
   *
   *
   * <pre>
   * Timeout for this Runnable.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   *
   * @return Whether the timeout field is set.
   */
  boolean hasTimeout();
  /**
   *
   *
   * <pre>
   * Timeout for this Runnable.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   *
   * @return The timeout.
   */
  com.google.protobuf.Duration getTimeout();
  /**
   *
   *
   * <pre>
   * Timeout for this Runnable.
   * </pre>
   *
   * <code>.google.protobuf.Duration timeout = 8;</code>
   */
  com.google.protobuf.DurationOrBuilder getTimeoutOrBuilder();

  /**
   *
   *
   * <pre>
   * Labels for this Runnable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels for this Runnable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels for this Runnable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels for this Runnable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Labels for this Runnable.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.cloud.batch.v1.Runnable.ExecutableCase getExecutableCase();
}
