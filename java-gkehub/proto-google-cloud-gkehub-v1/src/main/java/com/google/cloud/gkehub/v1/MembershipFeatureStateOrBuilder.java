/*
 * Copyright 2020 Google LLC
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
// source: google/cloud/gkehub/v1/feature.proto

package com.google.cloud.gkehub.v1;

public interface MembershipFeatureStateOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.v1.MembershipFeatureState)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Config Management-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
   *
   * @return Whether the configmanagement field is set.
   */
  boolean hasConfigmanagement();
  /**
   *
   *
   * <pre>
   * Config Management-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
   *
   * @return The configmanagement.
   */
  com.google.cloud.gkehub.configmanagement.v1.MembershipState getConfigmanagement();
  /**
   *
   *
   * <pre>
   * Config Management-specific state.
   * </pre>
   *
   * <code>.google.cloud.gkehub.configmanagement.v1.MembershipState configmanagement = 106;</code>
   */
  com.google.cloud.gkehub.configmanagement.v1.MembershipStateOrBuilder
      getConfigmanagementOrBuilder();

  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
   *
   * @return Whether the state field is set.
   */
  boolean hasState();
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
   *
   * @return The state.
   */
  com.google.cloud.gkehub.v1.FeatureState getState();
  /**
   *
   *
   * <pre>
   * The high-level state of this Feature for a single membership.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState state = 1;</code>
   */
  com.google.cloud.gkehub.v1.FeatureStateOrBuilder getStateOrBuilder();

  public com.google.cloud.gkehub.v1.MembershipFeatureState.FeatureStateCase getFeatureStateCase();
}