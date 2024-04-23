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
// source: google/cloud/discoveryengine/v1alpha/project.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1alpha;

public interface ProjectOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1alpha.Project)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Full resource name of the project, for example
   * `projects/{project_number}`.
   * Note that when making requests, project number and project id are both
   * acceptable, but the server will always respond in project number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. Full resource name of the project, for example
   * `projects/{project_number}`.
   * Note that when making requests, project number and project id are both
   * acceptable, but the server will always respond in project number.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this project is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this project is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this project is created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this project is successfully provisioned.
   * Empty value means this project is still provisioning and is not ready for
   * use.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp provision_completion_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the provisionCompletionTime field is set.
   */
  boolean hasProvisionCompletionTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this project is successfully provisioned.
   * Empty value means this project is still provisioning and is not ready for
   * use.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp provision_completion_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The provisionCompletionTime.
   */
  com.google.protobuf.Timestamp getProvisionCompletionTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this project is successfully provisioned.
   * Empty value means this project is still provisioning and is not ready for
   * use.
   * </pre>
   *
   * <code>
   * .google.protobuf.Timestamp provision_completion_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getProvisionCompletionTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A map of terms of services. The key is the `id` of
   * [ServiceTerms][google.cloud.discoveryengine.v1alpha.Project.ServiceTerms].
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.Project.ServiceTerms&gt; service_terms_map = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getServiceTermsMapCount();
  /**
   *
   *
   * <pre>
   * Output only. A map of terms of services. The key is the `id` of
   * [ServiceTerms][google.cloud.discoveryengine.v1alpha.Project.ServiceTerms].
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.Project.ServiceTerms&gt; service_terms_map = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  boolean containsServiceTermsMap(java.lang.String key);
  /** Use {@link #getServiceTermsMapMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.discoveryengine.v1alpha.Project.ServiceTerms>
      getServiceTermsMap();
  /**
   *
   *
   * <pre>
   * Output only. A map of terms of services. The key is the `id` of
   * [ServiceTerms][google.cloud.discoveryengine.v1alpha.Project.ServiceTerms].
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.Project.ServiceTerms&gt; service_terms_map = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.discoveryengine.v1alpha.Project.ServiceTerms>
      getServiceTermsMapMap();
  /**
   *
   *
   * <pre>
   * Output only. A map of terms of services. The key is the `id` of
   * [ServiceTerms][google.cloud.discoveryengine.v1alpha.Project.ServiceTerms].
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.Project.ServiceTerms&gt; service_terms_map = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  /* nullable */
  com.google.cloud.discoveryengine.v1alpha.Project.ServiceTerms getServiceTermsMapOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.discoveryengine.v1alpha.Project.ServiceTerms defaultValue);
  /**
   *
   *
   * <pre>
   * Output only. A map of terms of services. The key is the `id` of
   * [ServiceTerms][google.cloud.discoveryengine.v1alpha.Project.ServiceTerms].
   * </pre>
   *
   * <code>
   * map&lt;string, .google.cloud.discoveryengine.v1alpha.Project.ServiceTerms&gt; service_terms_map = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.discoveryengine.v1alpha.Project.ServiceTerms getServiceTermsMapOrThrow(
      java.lang.String key);
}
