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
// source: google/cloud/gkemulticloud/v1/aws_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkemulticloud.v1;

public interface AwsK8sVersionInfoOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AwsK8sVersionInfo)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Kubernetes version name.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The version.
   */
  java.lang.String getVersion();
  /**
   *
   *
   * <pre>
   * Kubernetes version name.
   * </pre>
   *
   * <code>string version = 1;</code>
   *
   * @return The bytes for version.
   */
  com.google.protobuf.ByteString getVersionBytes();

  /**
   *
   *
   * <pre>
   * Optional. True if the version is available for cluster creation. If a
   * version is enabled for creation, it can be used to create new clusters.
   * Otherwise, cluster creation will fail. However, cluster upgrade operations
   * may succeed, even if the version is not enabled.
   * </pre>
   *
   * <code>bool enabled = 3 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * Optional. True if this cluster version belongs to a minor version that has
   * reached its end of life and is no longer in scope to receive security and
   * bug fixes.
   * </pre>
   *
   * <code>bool end_of_life = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The endOfLife.
   */
  boolean getEndOfLife();

  /**
   *
   *
   * <pre>
   * Optional. The estimated date (in Pacific Time) when this cluster version
   * will reach its end of life. Or if this version is no longer supported (the
   * `end_of_life` field is true), this is the actual date (in Pacific time)
   * when the version reached its end of life.
   * </pre>
   *
   * <code>.google.type.Date end_of_life_date = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the endOfLifeDate field is set.
   */
  boolean hasEndOfLifeDate();
  /**
   *
   *
   * <pre>
   * Optional. The estimated date (in Pacific Time) when this cluster version
   * will reach its end of life. Or if this version is no longer supported (the
   * `end_of_life` field is true), this is the actual date (in Pacific time)
   * when the version reached its end of life.
   * </pre>
   *
   * <code>.google.type.Date end_of_life_date = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The endOfLifeDate.
   */
  com.google.type.Date getEndOfLifeDate();
  /**
   *
   *
   * <pre>
   * Optional. The estimated date (in Pacific Time) when this cluster version
   * will reach its end of life. Or if this version is no longer supported (the
   * `end_of_life` field is true), this is the actual date (in Pacific time)
   * when the version reached its end of life.
   * </pre>
   *
   * <code>.google.type.Date end_of_life_date = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.DateOrBuilder getEndOfLifeDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The date (in Pacific Time) when the cluster version was released.
   * </pre>
   *
   * <code>.google.type.Date release_date = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the releaseDate field is set.
   */
  boolean hasReleaseDate();
  /**
   *
   *
   * <pre>
   * Optional. The date (in Pacific Time) when the cluster version was released.
   * </pre>
   *
   * <code>.google.type.Date release_date = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The releaseDate.
   */
  com.google.type.Date getReleaseDate();
  /**
   *
   *
   * <pre>
   * Optional. The date (in Pacific Time) when the cluster version was released.
   * </pre>
   *
   * <code>.google.type.Date release_date = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.type.DateOrBuilder getReleaseDateOrBuilder();
}
