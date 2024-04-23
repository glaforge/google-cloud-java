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
// source: google/devtools/clouddebugger/v2/data.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.clouddebugger.v2;

public interface SourceLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.clouddebugger.v2.SourceLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Path to the source file within the source context of the target binary.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The path.
   */
  java.lang.String getPath();
  /**
   *
   *
   * <pre>
   * Path to the source file within the source context of the target binary.
   * </pre>
   *
   * <code>string path = 1;</code>
   *
   * @return The bytes for path.
   */
  com.google.protobuf.ByteString getPathBytes();

  /**
   *
   *
   * <pre>
   * Line inside the file. The first line in the file has the value `1`.
   * </pre>
   *
   * <code>int32 line = 2;</code>
   *
   * @return The line.
   */
  int getLine();

  /**
   *
   *
   * <pre>
   * Column within a line. The first column in a line as the value `1`.
   * Agents that do not support setting breakpoints on specific columns ignore
   * this field.
   * </pre>
   *
   * <code>int32 column = 3;</code>
   *
   * @return The column.
   */
  int getColumn();
}
