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

public interface VolumeMountOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.run.v2.VolumeMount)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. This must match the Name of a Volume.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. This must match the Name of a Volume.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Required. Path within the container at which the volume should be mounted.
   * Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must
   * otherwise be `/cloudsql`. All instances defined in the Volume will be
   * available as `/cloudsql/[instance]`. For more information on Cloud SQL
   * volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
   * </pre>
   *
   * <code>string mount_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The mountPath.
   */
  java.lang.String getMountPath();
  /**
   *
   *
   * <pre>
   * Required. Path within the container at which the volume should be mounted.
   * Must not contain ':'. For Cloud SQL volumes, it can be left empty, or must
   * otherwise be `/cloudsql`. All instances defined in the Volume will be
   * available as `/cloudsql/[instance]`. For more information on Cloud SQL
   * volumes, visit https://cloud.google.com/sql/docs/mysql/connect-run
   * </pre>
   *
   * <code>string mount_path = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for mountPath.
   */
  com.google.protobuf.ByteString getMountPathBytes();
}
