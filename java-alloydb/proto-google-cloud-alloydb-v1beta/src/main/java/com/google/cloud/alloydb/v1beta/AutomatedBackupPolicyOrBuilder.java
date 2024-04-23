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
// source: google/cloud/alloydb/v1beta/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.alloydb.v1beta;

public interface AutomatedBackupPolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.alloydb.v1beta.AutomatedBackupPolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Weekly schedule for the Backup.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.WeeklySchedule weekly_schedule = 2;
   * </code>
   *
   * @return Whether the weeklySchedule field is set.
   */
  boolean hasWeeklySchedule();
  /**
   *
   *
   * <pre>
   * Weekly schedule for the Backup.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.WeeklySchedule weekly_schedule = 2;
   * </code>
   *
   * @return The weeklySchedule.
   */
  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.WeeklySchedule getWeeklySchedule();
  /**
   *
   *
   * <pre>
   * Weekly schedule for the Backup.
   * </pre>
   *
   * <code>.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.WeeklySchedule weekly_schedule = 2;
   * </code>
   */
  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.WeeklyScheduleOrBuilder
      getWeeklyScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Time-based Backup retention policy.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.AutomatedBackupPolicy.TimeBasedRetention time_based_retention = 4;
   * </code>
   *
   * @return Whether the timeBasedRetention field is set.
   */
  boolean hasTimeBasedRetention();
  /**
   *
   *
   * <pre>
   * Time-based Backup retention policy.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.AutomatedBackupPolicy.TimeBasedRetention time_based_retention = 4;
   * </code>
   *
   * @return The timeBasedRetention.
   */
  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.TimeBasedRetention getTimeBasedRetention();
  /**
   *
   *
   * <pre>
   * Time-based Backup retention policy.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.AutomatedBackupPolicy.TimeBasedRetention time_based_retention = 4;
   * </code>
   */
  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.TimeBasedRetentionOrBuilder
      getTimeBasedRetentionOrBuilder();

  /**
   *
   *
   * <pre>
   * Quantity-based Backup retention policy to retain recent backups.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.AutomatedBackupPolicy.QuantityBasedRetention quantity_based_retention = 5;
   * </code>
   *
   * @return Whether the quantityBasedRetention field is set.
   */
  boolean hasQuantityBasedRetention();
  /**
   *
   *
   * <pre>
   * Quantity-based Backup retention policy to retain recent backups.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.AutomatedBackupPolicy.QuantityBasedRetention quantity_based_retention = 5;
   * </code>
   *
   * @return The quantityBasedRetention.
   */
  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.QuantityBasedRetention
      getQuantityBasedRetention();
  /**
   *
   *
   * <pre>
   * Quantity-based Backup retention policy to retain recent backups.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.AutomatedBackupPolicy.QuantityBasedRetention quantity_based_retention = 5;
   * </code>
   */
  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.QuantityBasedRetentionOrBuilder
      getQuantityBasedRetentionOrBuilder();

  /**
   *
   *
   * <pre>
   * Whether automated automated backups are enabled. If not set, defaults to
   * true.
   * </pre>
   *
   * <code>optional bool enabled = 1;</code>
   *
   * @return Whether the enabled field is set.
   */
  boolean hasEnabled();
  /**
   *
   *
   * <pre>
   * Whether automated automated backups are enabled. If not set, defaults to
   * true.
   * </pre>
   *
   * <code>optional bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  boolean getEnabled();

  /**
   *
   *
   * <pre>
   * The length of the time window during which a backup can be
   * taken. If a backup does not succeed within this time window, it will be
   * canceled and considered failed.
   *
   * The backup window must be at least 5 minutes long. There is no upper bound
   * on the window. If not set, it defaults to 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration backup_window = 3;</code>
   *
   * @return Whether the backupWindow field is set.
   */
  boolean hasBackupWindow();
  /**
   *
   *
   * <pre>
   * The length of the time window during which a backup can be
   * taken. If a backup does not succeed within this time window, it will be
   * canceled and considered failed.
   *
   * The backup window must be at least 5 minutes long. There is no upper bound
   * on the window. If not set, it defaults to 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration backup_window = 3;</code>
   *
   * @return The backupWindow.
   */
  com.google.protobuf.Duration getBackupWindow();
  /**
   *
   *
   * <pre>
   * The length of the time window during which a backup can be
   * taken. If a backup does not succeed within this time window, it will be
   * canceled and considered failed.
   *
   * The backup window must be at least 5 minutes long. There is no upper bound
   * on the window. If not set, it defaults to 1 hour.
   * </pre>
   *
   * <code>.google.protobuf.Duration backup_window = 3;</code>
   */
  com.google.protobuf.DurationOrBuilder getBackupWindowOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionConfig encryption_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the encryptionConfig field is set.
   */
  boolean hasEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionConfig encryption_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The encryptionConfig.
   */
  com.google.cloud.alloydb.v1beta.EncryptionConfig getEncryptionConfig();
  /**
   *
   *
   * <pre>
   * Optional. The encryption config can be specified to encrypt the
   * backups with a customer-managed encryption key (CMEK). When this field is
   * not specified, the backup will then use default encryption scheme to
   * protect the user data.
   * </pre>
   *
   * <code>
   * .google.cloud.alloydb.v1beta.EncryptionConfig encryption_config = 8 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.alloydb.v1beta.EncryptionConfigOrBuilder getEncryptionConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * The location where the backup will be stored. Currently, the only supported
   * option is to store the backup in the same region as the cluster.
   *
   * If empty, defaults to the region of the cluster.
   * </pre>
   *
   * <code>string location = 6;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The location where the backup will be stored. Currently, the only supported
   * option is to store the backup in the same region as the cluster.
   *
   * If empty, defaults to the region of the cluster.
   * </pre>
   *
   * <code>string location = 6;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();

  /**
   *
   *
   * <pre>
   * Labels to apply to backups created using this configuration.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Labels to apply to backups created using this configuration.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Labels to apply to backups created using this configuration.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Labels to apply to backups created using this configuration.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
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
   * Labels to apply to backups created using this configuration.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 7;</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.ScheduleCase getScheduleCase();

  com.google.cloud.alloydb.v1beta.AutomatedBackupPolicy.RetentionCase getRetentionCase();
}
