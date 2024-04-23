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
// source: google/monitoring/v3/uptime.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

@java.lang.Deprecated
public interface InternalCheckerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.InternalChecker)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A unique resource name for this InternalChecker. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID]
   *
   * `[PROJECT_ID_OR_NUMBER]` is the Cloud Monitoring Metrics Scope project for
   * the Uptime check config associated with the internal checker.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * A unique resource name for this InternalChecker. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/internalCheckers/[INTERNAL_CHECKER_ID]
   *
   * `[PROJECT_ID_OR_NUMBER]` is the Cloud Monitoring Metrics Scope project for
   * the Uptime check config associated with the internal checker.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The checker's human-readable name. The display name
   * should be unique within a Cloud Monitoring Metrics Scope in order to make
   * it easier to identify; however, uniqueness is not enforced.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The displayName.
   */
  java.lang.String getDisplayName();
  /**
   *
   *
   * <pre>
   * The checker's human-readable name. The display name
   * should be unique within a Cloud Monitoring Metrics Scope in order to make
   * it easier to identify; however, uniqueness is not enforced.
   * </pre>
   *
   * <code>string display_name = 2;</code>
   *
   * @return The bytes for displayName.
   */
  com.google.protobuf.ByteString getDisplayNameBytes();

  /**
   *
   *
   * <pre>
   * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
   * internal resource lives (ex: "default").
   * </pre>
   *
   * <code>string network = 3;</code>
   *
   * @return The network.
   */
  java.lang.String getNetwork();
  /**
   *
   *
   * <pre>
   * The [GCP VPC network](https://cloud.google.com/vpc/docs/vpc) where the
   * internal resource lives (ex: "default").
   * </pre>
   *
   * <code>string network = 3;</code>
   *
   * @return The bytes for network.
   */
  com.google.protobuf.ByteString getNetworkBytes();

  /**
   *
   *
   * <pre>
   * The GCP zone the Uptime check should egress from. Only respected for
   * internal Uptime checks, where internal_network is specified.
   * </pre>
   *
   * <code>string gcp_zone = 4;</code>
   *
   * @return The gcpZone.
   */
  java.lang.String getGcpZone();
  /**
   *
   *
   * <pre>
   * The GCP zone the Uptime check should egress from. Only respected for
   * internal Uptime checks, where internal_network is specified.
   * </pre>
   *
   * <code>string gcp_zone = 4;</code>
   *
   * @return The bytes for gcpZone.
   */
  com.google.protobuf.ByteString getGcpZoneBytes();

  /**
   *
   *
   * <pre>
   * The GCP project ID where the internal checker lives. Not necessary
   * the same as the Metrics Scope project.
   * </pre>
   *
   * <code>string peer_project_id = 6;</code>
   *
   * @return The peerProjectId.
   */
  java.lang.String getPeerProjectId();
  /**
   *
   *
   * <pre>
   * The GCP project ID where the internal checker lives. Not necessary
   * the same as the Metrics Scope project.
   * </pre>
   *
   * <code>string peer_project_id = 6;</code>
   *
   * @return The bytes for peerProjectId.
   */
  com.google.protobuf.ByteString getPeerProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The current operational state of the internal checker.
   * </pre>
   *
   * <code>.google.monitoring.v3.InternalChecker.State state = 7;</code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * The current operational state of the internal checker.
   * </pre>
   *
   * <code>.google.monitoring.v3.InternalChecker.State state = 7;</code>
   *
   * @return The state.
   */
  com.google.monitoring.v3.InternalChecker.State getState();
}
