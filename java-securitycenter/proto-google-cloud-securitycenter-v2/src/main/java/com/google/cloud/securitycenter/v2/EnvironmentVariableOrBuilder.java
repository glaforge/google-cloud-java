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
// source: google/cloud/securitycenter/v2/process.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

public interface EnvironmentVariableOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v2.EnvironmentVariable)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Environment variable name as a JSON encoded string.
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
   * Environment variable name as a JSON encoded string.
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
   * Environment variable value as a JSON encoded string.
   * </pre>
   *
   * <code>string val = 2;</code>
   *
   * @return The val.
   */
  java.lang.String getVal();
  /**
   *
   *
   * <pre>
   * Environment variable value as a JSON encoded string.
   * </pre>
   *
   * <code>string val = 2;</code>
   *
   * @return The bytes for val.
   */
  com.google.protobuf.ByteString getValBytes();
}
