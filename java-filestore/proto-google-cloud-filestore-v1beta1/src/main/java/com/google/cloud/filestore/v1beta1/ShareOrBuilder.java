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
// source: google/cloud/filestore/v1beta1/cloud_filestore_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.filestore.v1beta1;

public interface ShareOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.filestore.v1beta1.Share)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The resource name of the share, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}/shares/{share_id}`.
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
   * Output only. The resource name of the share, in the format
   * `projects/{project_id}/locations/{location_id}/instances/{instance_id}/shares/{share_id}`.
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
   * The mount name of the share. Must be 63 characters or less and consist of
   * uppercase or lowercase letters, numbers, and underscores.
   * </pre>
   *
   * <code>string mount_name = 2;</code>
   *
   * @return The mountName.
   */
  java.lang.String getMountName();
  /**
   *
   *
   * <pre>
   * The mount name of the share. Must be 63 characters or less and consist of
   * uppercase or lowercase letters, numbers, and underscores.
   * </pre>
   *
   * <code>string mount_name = 2;</code>
   *
   * @return The bytes for mountName.
   */
  com.google.protobuf.ByteString getMountNameBytes();

  /**
   *
   *
   * <pre>
   * A description of the share with 2048 characters or less. Requests with
   * longer descriptions will be rejected.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * A description of the share with 2048 characters or less. Requests with
   * longer descriptions will be rejected.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * File share capacity in gigabytes (GB). Filestore defines 1 GB as
   * 1024^3 bytes. Must be greater than 0.
   * </pre>
   *
   * <code>int64 capacity_gb = 4;</code>
   *
   * @return The capacityGb.
   */
  long getCapacityGb();

  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NfsExportOptions nfs_export_options = 5;</code>
   */
  java.util.List<com.google.cloud.filestore.v1beta1.NfsExportOptions> getNfsExportOptionsList();
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NfsExportOptions nfs_export_options = 5;</code>
   */
  com.google.cloud.filestore.v1beta1.NfsExportOptions getNfsExportOptions(int index);
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NfsExportOptions nfs_export_options = 5;</code>
   */
  int getNfsExportOptionsCount();
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NfsExportOptions nfs_export_options = 5;</code>
   */
  java.util.List<? extends com.google.cloud.filestore.v1beta1.NfsExportOptionsOrBuilder>
      getNfsExportOptionsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Nfs Export Options.
   * There is a limit of 10 export options per file share.
   * </pre>
   *
   * <code>repeated .google.cloud.filestore.v1beta1.NfsExportOptions nfs_export_options = 5;</code>
   */
  com.google.cloud.filestore.v1beta1.NfsExportOptionsOrBuilder getNfsExportOptionsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * Output only. The share state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The share state.
   * </pre>
   *
   * <code>
   * .google.cloud.filestore.v1beta1.Share.State state = 6 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.filestore.v1beta1.Share.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The time when the share was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the share was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The time when the share was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
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
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
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
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Resource labels to represent user provided metadata.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 8;</code>
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
   * <code>map&lt;string, string&gt; labels = 8;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Immutable. Full name of the Cloud Filestore Backup resource that this
   * Share is restored from, in the format of
   * projects/{project_id}/locations/{location_id}/backups/{backup_id}.
   * Empty, if the Share is created from scratch and not restored from a
   * backup.
   * </pre>
   *
   * <code>
   * string backup = 9 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the backup field is set.
   */
  boolean hasBackup();
  /**
   *
   *
   * <pre>
   * Immutable. Full name of the Cloud Filestore Backup resource that this
   * Share is restored from, in the format of
   * projects/{project_id}/locations/{location_id}/backups/{backup_id}.
   * Empty, if the Share is created from scratch and not restored from a
   * backup.
   * </pre>
   *
   * <code>
   * string backup = 9 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backup.
   */
  java.lang.String getBackup();
  /**
   *
   *
   * <pre>
   * Immutable. Full name of the Cloud Filestore Backup resource that this
   * Share is restored from, in the format of
   * projects/{project_id}/locations/{location_id}/backups/{backup_id}.
   * Empty, if the Share is created from scratch and not restored from a
   * backup.
   * </pre>
   *
   * <code>
   * string backup = 9 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backup.
   */
  com.google.protobuf.ByteString getBackupBytes();

  com.google.cloud.filestore.v1beta1.Share.SourceCase getSourceCase();
}
