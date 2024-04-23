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
// source: google/cloud/run/v2/k8s.min.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.run.v2;

public interface GCSVolumeSourceOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.GCSVolumeSource)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * GCS Bucket name
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bucket.
   */
  java.lang.String getBucket();
  /**
   *
   *
   * <pre>
   * GCS Bucket name
   * </pre>
   *
   * <code>string bucket = 1;</code>
   *
   * @return The bytes for bucket.
   */
  com.google.protobuf.ByteString getBucketBytes();

  /**
   *
   *
   * <pre>
   * If true, mount the GCS bucket as read-only
   * </pre>
   *
   * <code>bool read_only = 2;</code>
   *
   * @return The readOnly.
   */
  boolean getReadOnly();
}
