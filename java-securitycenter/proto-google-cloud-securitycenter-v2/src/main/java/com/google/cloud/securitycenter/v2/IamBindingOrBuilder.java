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
// source: google/cloud/securitycenter/v2/iam_binding.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public interface IamBindingOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.IamBinding)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The action that was performed on a Binding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.IamBinding.Action action = 1;</code>
   *
   * @return The enum numeric value on the wire for action.
   */
  int getActionValue();
  /**
   *
   *
   * <pre>
   * The action that was performed on a Binding.
   * </pre>
   *
   * <code>.google.cloud.securitycenter.v2.IamBinding.Action action = 1;</code>
   *
   * @return The action.
   */
  com.google.cloud.securitycenter.v2.IamBinding.Action getAction();

  /**
   *
   *
   * <pre>
   * Role that is assigned to "members".
   * For example, "roles/viewer", "roles/editor", or "roles/owner".
   * </pre>
   *
   * <code>string role = 2;</code>
   *
   * @return The role.
   */
  java.lang.String getRole();
  /**
   *
   *
   * <pre>
   * Role that is assigned to "members".
   * For example, "roles/viewer", "roles/editor", or "roles/owner".
   * </pre>
   *
   * <code>string role = 2;</code>
   *
   * @return The bytes for role.
   */
  com.google.protobuf.ByteString getRoleBytes();

  /**
   *
   *
   * <pre>
   * A single identity requesting access for a Cloud Platform resource, for
   * example, "foo&#64;google.com".
   * </pre>
   *
   * <code>string member = 3;</code>
   *
   * @return The member.
   */
  java.lang.String getMember();
  /**
   *
   *
   * <pre>
   * A single identity requesting access for a Cloud Platform resource, for
   * example, "foo&#64;google.com".
   * </pre>
   *
   * <code>string member = 3;</code>
   *
   * @return The bytes for member.
   */
  com.google.protobuf.ByteString getMemberBytes();
}
