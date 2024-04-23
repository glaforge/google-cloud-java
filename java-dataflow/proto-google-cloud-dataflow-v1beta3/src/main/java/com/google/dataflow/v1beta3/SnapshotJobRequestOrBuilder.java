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
// source: google/dataflow/v1beta3/jobs.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

public interface SnapshotJobRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.SnapshotJobRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The project which owns the job to be snapshotted.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project which owns the job to be snapshotted.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The job to be snapshotted.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The jobId.
   */
  java.lang.String getJobId();
  /**
   *
   *
   * <pre>
   * The job to be snapshotted.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The bytes for jobId.
   */
  com.google.protobuf.ByteString getJobIdBytes();

  /**
   *
   *
   * <pre>
   * TTL for the snapshot.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   *
   * @return Whether the ttl field is set.
   */
  boolean hasTtl();
  /**
   *
   *
   * <pre>
   * TTL for the snapshot.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   *
   * @return The ttl.
   */
  com.google.protobuf.Duration getTtl();
  /**
   *
   *
   * <pre>
   * TTL for the snapshot.
   * </pre>
   *
   * <code>.google.protobuf.Duration ttl = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getTtlOrBuilder();

  /**
   *
   *
   * <pre>
   * The location that contains this job.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The location that contains this job.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * If true, perform snapshots for sources which support this.
   * </pre>
   *
   * <code>bool snapshot_sources = 5;</code>
   *
   * @return The snapshotSources.
   */
  boolean getSnapshotSources();

  /**
   *
   *
   * <pre>
   * User specified description of the snapshot. Maybe empty.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * User specified description of the snapshot. Maybe empty.
   * </pre>
   *
   * <code>string description = 6;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();
}
