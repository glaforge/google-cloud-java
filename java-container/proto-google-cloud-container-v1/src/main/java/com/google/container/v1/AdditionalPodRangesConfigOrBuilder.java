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
// source: google/container/v1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1;

public interface AdditionalPodRangesConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.container.v1.AdditionalPodRangesConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @return A list containing the podRangeNames.
   */
  java.util.List<java.lang.String> getPodRangeNamesList();
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @return The count of podRangeNames.
   */
  int getPodRangeNamesCount();
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The podRangeNames at the given index.
   */
  java.lang.String getPodRangeNames(int index);
  /**
   *
   *
   * <pre>
   * Name for pod secondary ipv4 range which has the actual range defined ahead.
   * </pre>
   *
   * <code>repeated string pod_range_names = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the podRangeNames at the given index.
   */
  com.google.protobuf.ByteString getPodRangeNamesBytes(int index);

  /**
   *
   *
   * <pre>
   * Output only. [Output only] Information for additional pod range.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1.RangeInfo pod_range_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<com.google.container.v1.RangeInfo> getPodRangeInfoList();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Information for additional pod range.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1.RangeInfo pod_range_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.container.v1.RangeInfo getPodRangeInfo(int index);
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Information for additional pod range.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1.RangeInfo pod_range_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  int getPodRangeInfoCount();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Information for additional pod range.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1.RangeInfo pod_range_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  java.util.List<? extends com.google.container.v1.RangeInfoOrBuilder>
      getPodRangeInfoOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. [Output only] Information for additional pod range.
   * </pre>
   *
   * <code>
   * repeated .google.container.v1.RangeInfo pod_range_info = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.container.v1.RangeInfoOrBuilder getPodRangeInfoOrBuilder(int index);
}
