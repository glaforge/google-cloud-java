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
// source: google/monitoring/v3/span_context.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface SpanContextOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.SpanContext)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the span. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID]
   *
   * `[TRACE_ID]` is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array.
   *
   * `[SPAN_ID]` is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array.
   * </pre>
   *
   * <code>string span_name = 1;</code>
   *
   * @return The spanName.
   */
  java.lang.String getSpanName();
  /**
   *
   *
   * <pre>
   * The resource name of the span. The format is:
   *
   *     projects/[PROJECT_ID_OR_NUMBER]/traces/[TRACE_ID]/spans/[SPAN_ID]
   *
   * `[TRACE_ID]` is a unique identifier for a trace within a project;
   * it is a 32-character hexadecimal encoding of a 16-byte array.
   *
   * `[SPAN_ID]` is a unique identifier for a span within a trace; it
   * is a 16-character hexadecimal encoding of an 8-byte array.
   * </pre>
   *
   * <code>string span_name = 1;</code>
   *
   * @return The bytes for spanName.
   */
  com.google.protobuf.ByteString getSpanNameBytes();
}
