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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1beta1;

public interface GkeClusterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1beta1.GkeCluster)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE cluster. For example:
   *
   *     //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
   *
   * Zonal clusters are also supported.
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The resourceLink.
   */
  java.lang.String getResourceLink();
  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE cluster. For example:
   *
   *     //container.googleapis.com/projects/my-project/locations/us-west1-a/clusters/my-cluster
   *
   * Zonal clusters are also supported.
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for resourceLink.
   */
  com.google.protobuf.ByteString getResourceLinkBytes();

  /**
   *
   *
   * <pre>
   * Output only. If cluster_missing is set then it denotes that the GKE cluster
   * no longer exists in the GKE Control Plane.
   * </pre>
   *
   * <code>bool cluster_missing = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterMissing.
   */
  boolean getClusterMissing();
}
