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
// source: google/cloud/support/v2/case_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.support.v2;

public interface EscalateCaseRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.support.v2.EscalateCaseRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The fully qualified name of the Case resource to be escalated.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. The fully qualified name of the Case resource to be escalated.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * The escalation object to be sent with the escalation request.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Escalation escalation = 2;</code>
   *
   * @return Whether the escalation field is set.
   */
  boolean hasEscalation();
  /**
   *
   *
   * <pre>
   * The escalation object to be sent with the escalation request.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Escalation escalation = 2;</code>
   *
   * @return The escalation.
   */
  com.google.cloud.support.v2.Escalation getEscalation();
  /**
   *
   *
   * <pre>
   * The escalation object to be sent with the escalation request.
   * </pre>
   *
   * <code>.google.cloud.support.v2.Escalation escalation = 2;</code>
   */
  com.google.cloud.support.v2.EscalationOrBuilder getEscalationOrBuilder();
}
