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
// source: google/cloud/gkehub/v1beta/configmanagement/configmanagement.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.configmanagement.v1beta;

public interface PolicyControllerStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.configmanagement.v1beta.PolicyControllerState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerVersion version = 1;</code>
   *
   * @return Whether the version field is set.
   */
  boolean hasVersion();
  /**
   *
   *
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerVersion version = 1;</code>
   *
   * @return The version.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerVersion getVersion();
  /**
   *
   *
   * <pre>
   * The version of Gatekeeper Policy Controller deployed.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerVersion version = 1;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.PolicyControllerVersionOrBuilder
      getVersionOrBuilder();

  /**
   *
   *
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState deployment_state = 2;
   * </code>
   *
   * @return Whether the deploymentState field is set.
   */
  boolean hasDeploymentState();
  /**
   *
   *
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState deployment_state = 2;
   * </code>
   *
   * @return The deploymentState.
   */
  com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState getDeploymentState();
  /**
   *
   *
   * <pre>
   * The state about the policy controller installation.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentState deployment_state = 2;
   * </code>
   */
  com.google.cloud.gkehub.configmanagement.v1beta.GatekeeperDeploymentStateOrBuilder
      getDeploymentStateOrBuilder();
}
