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
// source: google/cloud/contentwarehouse/v1/filters.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

public interface TimeFilterOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.TimeFilter)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>.google.type.Interval time_range = 1;</code>
   *
   * @return Whether the timeRange field is set.
   */
  boolean hasTimeRange();
  /**
   * <code>.google.type.Interval time_range = 1;</code>
   *
   * @return The timeRange.
   */
  com.google.type.Interval getTimeRange();
  /** <code>.google.type.Interval time_range = 1;</code> */
  com.google.type.IntervalOrBuilder getTimeRangeOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies which time field to filter documents on.
   *
   * Defaults to [TimeField.UPLOAD_TIME][].
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
   *
   * @return The enum numeric value on the wire for timeField.
   */
  int getTimeFieldValue();
  /**
   *
   *
   * <pre>
   * Specifies which time field to filter documents on.
   *
   * Defaults to [TimeField.UPLOAD_TIME][].
   * </pre>
   *
   * <code>.google.cloud.contentwarehouse.v1.TimeFilter.TimeField time_field = 2;</code>
   *
   * @return The timeField.
   */
  com.google.cloud.contentwarehouse.v1.TimeFilter.TimeField getTimeField();
}
