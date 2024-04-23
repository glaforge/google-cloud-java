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
// source: google/cloud/channel/v1/entitlements.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.channel.v1;

public interface ParameterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.channel.v1.Parameter)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the parameter.
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
   * Name of the parameter.
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
   * Value of the parameter.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Value value = 2;</code>
   *
   * @return Whether the value field is set.
   */
  boolean hasValue();
  /**
   *
   *
   * <pre>
   * Value of the parameter.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Value value = 2;</code>
   *
   * @return The value.
   */
  com.google.cloud.channel.v1.Value getValue();
  /**
   *
   *
   * <pre>
   * Value of the parameter.
   * </pre>
   *
   * <code>.google.cloud.channel.v1.Value value = 2;</code>
   */
  com.google.cloud.channel.v1.ValueOrBuilder getValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Specifies whether this parameter is allowed to be changed. For
   * example, for a Google Workspace Business Starter entitlement in commitment
   * plan, num_units is editable when entitlement is active.
   * </pre>
   *
   * <code>bool editable = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The editable.
   */
  boolean getEditable();
}
