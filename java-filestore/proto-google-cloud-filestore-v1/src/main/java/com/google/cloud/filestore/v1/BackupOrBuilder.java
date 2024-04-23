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
// source: google/cloud/filestore/v1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.filestore.v1;

public interface BackupOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1.Backup)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Output only. The resource name of the backup, in the format
   * `projects/{project_number}/locations/{location_id}/backups/{backup_id}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A description of the backup with 2048 characters or less.
   * Requests with longer descriptions will be rejected.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of the backup with 2048 characters or less.
   * Requests with longer descriptions will be rejected.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Output only. The backup state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Backup.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The backup state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Backup.State state = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.filestore.v1.Backup.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the backup was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 5;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Capacity of the source file share when the backup was created.
   * </pre>
   *
   * <code>int64 capacity_gb = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The capacityGb.
   */
  long getCapacityGb();

  /**
   *
   *
   * <pre>
   * Output only. The size of the storage used by the backup. As backups share
   * storage, this number is expected to change with backup creation/deletion.
   * </pre>
   *
   * <code>int64 storage_bytes = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The storageBytes.
   */
  long getStorageBytes();

  /**
   *
   *
   * <pre>
   * The resource name of the source Filestore instance, in the format
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`,
   * used to create this backup.
   * </pre>
   *
   * <code>string source_instance = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The sourceInstance.
   */
  java.lang.String getSourceInstance();
  /**
   *
   *
   * <pre>
   * The resource name of the source Filestore instance, in the format
   * `projects/{project_number}/locations/{location_id}/instances/{instance_id}`,
   * used to create this backup.
   * </pre>
   *
   * <code>string source_instance = 8 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for sourceInstance.
   */
  com.google.protobuf.ByteString getSourceInstanceBytes();

  /**
   *
   *
   * <pre>
   * Name of the file share in the source Filestore instance that the
   * backup is created from.
   * </pre>
   *
   * <code>string source_file_share = 9;</code>
   *
   * @return The sourceFileShare.
   */
  java.lang.String getSourceFileShare();
  /**
   *
   *
   * <pre>
   * Name of the file share in the source Filestore instance that the
   * backup is created from.
   * </pre>
   *
   * <code>string source_file_share = 9;</code>
   *
   * @return The bytes for sourceFileShare.
   */
  com.google.protobuf.ByteString getSourceFileShareBytes();

  /**
   *
   *
   * <pre>
   * Output only. The service tier of the source Filestore instance that this
   * backup is created from.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Instance.Tier source_instance_tier = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for sourceInstanceTier.
   */
  int getSourceInstanceTierValue();
  /**
   *
   *
   * <pre>
   * Output only. The service tier of the source Filestore instance that this
   * backup is created from.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1.Instance.Tier source_instance_tier = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The sourceInstanceTier.
   */
  com.google.cloud.filestore.v1.Instance.Tier getSourceInstanceTier();

  /**
   *
   *
   * <pre>
   * Output only. Amount of bytes that will be downloaded if the backup is
   * restored. This may be different than storage bytes, since sequential
   * backups of the same disk will share storage.
   * </pre>
   *
   * <code>int64 download_bytes = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The downloadBytes.
   */
  long getDownloadBytes();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the satisfiesPzs field is set.
   */
  boolean hasSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The satisfiesPzs.
   */
  com.google.protobuf.BoolValue getSatisfiesPzs();
  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>
   * .google.protobuf.BoolValue satisfies_pzs = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.BoolValueOrBuilder getSatisfiesPzsOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Reserved for future use.
   * </pre>
   *
   * <code>bool satisfies_pzi = 14 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The satisfiesPzi.
   */
  boolean getSatisfiesPzi();

  /**
   *
   *
   * <pre>
   * Immutable. KMS key name used for data encryption.
   * </pre>
   *
   * <code>string kms_key = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The kmsKey.
   */
  java.lang.String getKmsKey();
  /**
   *
   *
   * <pre>
   * Immutable. KMS key name used for data encryption.
   * </pre>
   *
   * <code>string kms_key = 13 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for kmsKey.
   */
  com.google.protobuf.ByteString getKmsKeyBytes();
}
