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
// source: google/cloud/dataproc/v1/shared.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface RuntimeConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.RuntimeConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Version of the batch runtime.
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Optional. Version of the batch runtime.
   * </pre>
   *
   * <code>string version = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. Optional custom container image for the job runtime environment.
   * If not specified, a default container image will be used.
   * </pre>
   *
   * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The containerImage.
   */
  java.lang.String getContainerImage();
  /**
   *
   *
   * <pre>
   * Optional. Optional custom container image for the job runtime environment.
   * If not specified, a default container image will be used.
   * </pre>
   *
   * <code>string container_image = 2 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for containerImage.
   */
  com.google.protobuf.ByteString getContainerImageBytes();

  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to
   * configure workload execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getPropertiesCount();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to
   * configure workload execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsProperties(java.lang.String key);
  /** Use {@link #getPropertiesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getProperties();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to
   * configure workload execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getPropertiesMap();
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to
   * configure workload execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getPropertiesOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. A mapping of property names to values, which are used to
   * configure workload execution.
   * </pre>
   *
   * <code>map&lt;string, string&gt; properties = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getPropertiesOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Dependency repository configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RepositoryConfig repository_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the repositoryConfig field is set.
   */
  boolean hasRepositoryConfig();
  /**
   *
   *
   * <pre>
   * Optional. Dependency repository configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RepositoryConfig repository_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The repositoryConfig.
   */
  com.google.cloud.dataproc.v1.RepositoryConfig getRepositoryConfig();
  /**
   *
   *
   * <pre>
   * Optional. Dependency repository configuration.
   * </pre>
   *
   * <code>
   * .google.cloud.dataproc.v1.RepositoryConfig repository_config = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.dataproc.v1.RepositoryConfigOrBuilder getRepositoryConfigOrBuilder();
}
