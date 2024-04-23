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
// source: google/cloud/aiplatform/v1/metadata_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface CreateArtifactRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.CreateArtifactRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The resource name of the MetadataStore where the Artifact should
   * be created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The resource name of the MetadataStore where the Artifact should
   * be created.
   * Format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The Artifact to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the artifact field is set.
   */
  boolean hasArtifact();
  /**
   *
   *
   * <pre>
   * Required. The Artifact to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The artifact.
   */
  com.google.cloud.aiplatform.v1.Artifact getArtifact();
  /**
   *
   *
   * <pre>
   * Required. The Artifact to create.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Artifact artifact = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.aiplatform.v1.ArtifactOrBuilder getArtifactOrBuilder();

  /**
   *
   *
   * <pre>
   * The {artifact} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * If not provided, the Artifact's ID will be a UUID generated by the service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all Artifacts in the parent MetadataStore. (Otherwise
   * the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the
   * caller can't view the preexisting Artifact.)
   * </pre>
   *
   * <code>string artifact_id = 3;</code>
   *
   * @return The artifactId.
   */
  java.lang.String getArtifactId();
  /**
   *
   *
   * <pre>
   * The {artifact} portion of the resource name with the format:
   * `projects/{project}/locations/{location}/metadataStores/{metadatastore}/artifacts/{artifact}`
   * If not provided, the Artifact's ID will be a UUID generated by the service.
   * Must be 4-128 characters in length. Valid characters are `/[a-z][0-9]-/`.
   * Must be unique across all Artifacts in the parent MetadataStore. (Otherwise
   * the request will fail with ALREADY_EXISTS, or PERMISSION_DENIED if the
   * caller can't view the preexisting Artifact.)
   * </pre>
   *
   * <code>string artifact_id = 3;</code>
   *
   * @return The bytes for artifactId.
   */
  com.google.protobuf.ByteString getArtifactIdBytes();
}
