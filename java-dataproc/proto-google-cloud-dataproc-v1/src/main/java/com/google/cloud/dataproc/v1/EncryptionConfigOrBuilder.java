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
// source: google/cloud/dataproc/v1/clusters.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataproc.v1;

public interface EncryptionConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataproc.v1.EncryptionConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key name to use for PD disk encryption for all
   * instances in the cluster.
   * </pre>
   *
   * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The gcePdKmsKeyName.
   */
  java.lang.String getGcePdKmsKeyName();
  /**
   *
   *
   * <pre>
   * Optional. The Cloud KMS key name to use for PD disk encryption for all
   * instances in the cluster.
   * </pre>
   *
   * <code>string gce_pd_kms_key_name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for gcePdKmsKeyName.
   */
  com.google.protobuf.ByteString getGcePdKmsKeyNameBytes();
}
