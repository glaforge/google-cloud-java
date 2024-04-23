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
// source: google/cloud/contentwarehouse/v1/rule_engine.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

public interface AccessControlActionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.AccessControlAction)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Identifies the type of operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AccessControlAction.OperationType operation_type = 1;
   * </code>
   *
   * @return The enum numeric value on the wire for operationType.
   */
  int getOperationTypeValue();
  /**
   *
   *
   * <pre>
   * Identifies the type of operation.
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.AccessControlAction.OperationType operation_type = 1;
   * </code>
   *
   * @return The operationType.
   */
  com.google.cloud.contentwarehouse.v1.AccessControlAction.OperationType getOperationType();

  /**
   *
   *
   * <pre>
   * Represents the new policy from which bindings are added, removed or
   * replaced based on the type of the operation. the policy is limited to a few
   * 10s of KB.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2;</code>
   *
   * @return Whether the policy field is set.
   */
  boolean hasPolicy();
  /**
   *
   *
   * <pre>
   * Represents the new policy from which bindings are added, removed or
   * replaced based on the type of the operation. the policy is limited to a few
   * 10s of KB.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2;</code>
   *
   * @return The policy.
   */
  com.google.iam.v1.Policy getPolicy();
  /**
   *
   *
   * <pre>
   * Represents the new policy from which bindings are added, removed or
   * replaced based on the type of the operation. the policy is limited to a few
   * 10s of KB.
   * </pre>
   *
   * <code>.google.iam.v1.Policy policy = 2;</code>
   */
  com.google.iam.v1.PolicyOrBuilder getPolicyOrBuilder();
}
