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
// source: google/cloud/binaryauthorization/v1beta1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.binaryauthorization.v1beta1;

public interface CreateAttestorRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.binaryauthorization.v1beta1.CreateAttestorRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent of this [attestor][google.cloud.binaryauthorization.v1beta1.Attestor].
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
   * Required. The parent of this [attestor][google.cloud.binaryauthorization.v1beta1.Attestor].
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
   * Required. The [attestors][google.cloud.binaryauthorization.v1beta1.Attestor] ID.
   * </pre>
   *
   * <code>string attestor_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The attestorId.
   */
  java.lang.String getAttestorId();
  /**
   *
   *
   * <pre>
   * Required. The [attestors][google.cloud.binaryauthorization.v1beta1.Attestor] ID.
   * </pre>
   *
   * <code>string attestor_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for attestorId.
   */
  com.google.protobuf.ByteString getAttestorIdBytes();

  /**
   *
   *
   * <pre>
   * Required. The initial [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
   * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name,
   * in the format `projects/&#42;&#47;attestors/&#42;`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the attestor field is set.
   */
  boolean hasAttestor();
  /**
   *
   *
   * <pre>
   * Required. The initial [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
   * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name,
   * in the format `projects/&#42;&#47;attestors/&#42;`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The attestor.
   */
  com.google.cloud.binaryauthorization.v1beta1.Attestor getAttestor();
  /**
   *
   *
   * <pre>
   * Required. The initial [attestor][google.cloud.binaryauthorization.v1beta1.Attestor] value. The service will
   * overwrite the [attestor name][google.cloud.binaryauthorization.v1beta1.Attestor.name] field with the resource name,
   * in the format `projects/&#42;&#47;attestors/&#42;`.
   * </pre>
   *
   * <code>
   * .google.cloud.binaryauthorization.v1beta1.Attestor attestor = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.binaryauthorization.v1beta1.AttestorOrBuilder getAttestorOrBuilder();
}
