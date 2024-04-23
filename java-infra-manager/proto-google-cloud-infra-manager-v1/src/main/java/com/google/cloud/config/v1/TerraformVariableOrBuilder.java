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
// source: google/cloud/config/v1/config.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.config.v1;

public interface TerraformVariableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.config.v1.TerraformVariable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Input variable value.
   * </pre>
   *
   * <code>.google.protobuf.Value input_value = 5;</code>
   *
   * @return Whether the inputValue field is set.
   */
  boolean hasInputValue();
  /**
   *
   *
   * <pre>
   * Input variable value.
   * </pre>
   *
   * <code>.google.protobuf.Value input_value = 5;</code>
   *
   * @return The inputValue.
   */
  com.google.protobuf.Value getInputValue();
  /**
   *
   *
   * <pre>
   * Input variable value.
   * </pre>
   *
   * <code>.google.protobuf.Value input_value = 5;</code>
   */
  com.google.protobuf.ValueOrBuilder getInputValueOrBuilder();
}
