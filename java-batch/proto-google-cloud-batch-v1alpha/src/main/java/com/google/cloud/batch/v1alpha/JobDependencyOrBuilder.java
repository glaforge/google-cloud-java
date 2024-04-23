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
// source: google/cloud/batch/v1alpha/job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.batch.v1alpha;

public interface JobDependencyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.batch.v1alpha.JobDependency)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  boolean containsItems(java.lang.String key);
  /** Use {@link #getItemsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.batch.v1alpha.JobDependency.Type> getItems();
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  java.util.Map<java.lang.String, com.google.cloud.batch.v1alpha.JobDependency.Type> getItemsMap();
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  /* nullable */
  com.google.cloud.batch.v1alpha.JobDependency.Type getItemsOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.batch.v1alpha.JobDependency.Type defaultValue);
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  com.google.cloud.batch.v1alpha.JobDependency.Type getItemsOrThrow(java.lang.String key);
  /** Use {@link #getItemsValueMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getItemsValue();
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getItemsValueMap();
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  int getItemsValueOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * Each item maps a Job name to a Type.
   * All items must be satisfied for the JobDependency to be satisfied (the AND
   * operation).
   * Once a condition for one item becomes true, it won't go back to false
   * even the dependent Job state changes again.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.batch.v1alpha.JobDependency.Type&gt; items = 1;</code>
   */
  int getItemsValueOrThrow(java.lang.String key);
}
