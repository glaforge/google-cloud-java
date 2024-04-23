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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

public interface DeployArtifactOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.DeployArtifact)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. All paths are
   * relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The artifactUri.
   */
  java.lang.String getArtifactUri();
  /**
   *
   *
   * <pre>
   * Output only. URI of a directory containing the artifacts. All paths are
   * relative to this location.
   * </pre>
   *
   * <code>string artifact_uri = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for artifactUri.
   */
  com.google.protobuf.ByteString getArtifactUriBytes();

  /**
   *
   *
   * <pre>
   * Output only. File paths of the manifests applied during the deploy
   * operation relative to the URI.
   * </pre>
   *
   * <code>repeated string manifest_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return A list containing the manifestPaths.
   */
  java.util.List<java.lang.String> getManifestPathsList();
  /**
   *
   *
   * <pre>
   * Output only. File paths of the manifests applied during the deploy
   * operation relative to the URI.
   * </pre>
   *
   * <code>repeated string manifest_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The count of manifestPaths.
   */
  int getManifestPathsCount();
  /**
   *
   *
   * <pre>
   * Output only. File paths of the manifests applied during the deploy
   * operation relative to the URI.
   * </pre>
   *
   * <code>repeated string manifest_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the element to return.
   * @return The manifestPaths at the given index.
   */
  java.lang.String getManifestPaths(int index);
  /**
   *
   *
   * <pre>
   * Output only. File paths of the manifests applied during the deploy
   * operation relative to the URI.
   * </pre>
   *
   * <code>repeated string manifest_paths = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the manifestPaths at the given index.
   */
  com.google.protobuf.ByteString getManifestPathsBytes(int index);
}
