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
// source: google/cloud/gkebackup/v1/restore_plan.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkebackup.v1;

public interface RestorePlanOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkebackup.v1.RestorePlan)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The full name of the RestorePlan resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`.
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
   * Output only. The full name of the RestorePlan resource.
   * Format: `projects/&#42;&#47;locations/&#42;&#47;restorePlans/&#42;`.
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
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Server generated global unique identifier of
   * [UUID](https://en.wikipedia.org/wiki/Universally_unique_identifier) format.
   * </pre>
   *
   * <code>string uid = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this RestorePlan resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this RestorePlan resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this RestorePlan resource was
   * created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this RestorePlan resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this RestorePlan resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. The timestamp when this RestorePlan resource was last
   * updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. User specified descriptive string for this RestorePlan.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. User specified descriptive string for this RestorePlan.
   * </pre>
   *
   * <code>string description = 5 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. A reference to the
   * [BackupPlan][google.cloud.gkebackup.v1.BackupPlan] from which Backups may
   * be used as the source for Restores created via this RestorePlan. Format:
   * `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;`.
   * </pre>
   *
   * <code>
   * string backup_plan = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The backupPlan.
   */
  java.lang.String getBackupPlan();
  /**
   *
   *
   * <pre>
   * Required. Immutable. A reference to the
   * [BackupPlan][google.cloud.gkebackup.v1.BackupPlan] from which Backups may
   * be used as the source for Restores created via this RestorePlan. Format:
   * `projects/&#42;&#47;locations/&#42;&#47;backupPlans/&#42;`.
   * </pre>
   *
   * <code>
   * string backup_plan = 6 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for backupPlan.
   */
  com.google.protobuf.ByteString getBackupPlanBytes();

  /**
   *
   *
   * <pre>
   * Required. Immutable. The target cluster into which Restores created via
   * this RestorePlan will restore data. NOTE: the cluster's region must be the
   * same as the RestorePlan. Valid formats:
   *
   *   - `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`
   *   - `projects/&#42;&#47;zones/&#42;&#47;clusters/&#42;`
   * </pre>
   *
   * <code>
   * string cluster = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The cluster.
   */
  java.lang.String getCluster();
  /**
   *
   *
   * <pre>
   * Required. Immutable. The target cluster into which Restores created via
   * this RestorePlan will restore data. NOTE: the cluster's region must be the
   * same as the RestorePlan. Valid formats:
   *
   *   - `projects/&#42;&#47;locations/&#42;&#47;clusters/&#42;`
   *   - `projects/&#42;&#47;zones/&#42;&#47;clusters/&#42;`
   * </pre>
   *
   * <code>
   * string cluster = 7 [(.google.api.field_behavior) = IMMUTABLE, (.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for cluster.
   */
  com.google.protobuf.ByteString getClusterBytes();

  /**
   *
   *
   * <pre>
   * Required. Configuration of Restores created via this RestorePlan.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig restore_config = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the restoreConfig field is set.
   */
  boolean hasRestoreConfig();
  /**
   *
   *
   * <pre>
   * Required. Configuration of Restores created via this RestorePlan.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig restore_config = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The restoreConfig.
   */
  com.google.cloud.gkebackup.v1.RestoreConfig getRestoreConfig();
  /**
   *
   *
   * <pre>
   * Required. Configuration of Restores created via this RestorePlan.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestoreConfig restore_config = 8 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.gkebackup.v1.RestoreConfigOrBuilder getRestoreConfigOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
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
   * Optional. A set of custom labels supplied by user.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a restore from overwriting each other.
   * It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform restore updates in order to avoid
   * race conditions: An `etag` is returned in the response to `GetRestorePlan`,
   * and systems are expected to put that etag in the request to
   * `UpdateRestorePlan` or `DeleteRestorePlan` to ensure that their change
   * will be applied to the same version of the resource.
   * </pre>
   *
   * <code>string etag = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Output only. `etag` is used for optimistic concurrency control as a way to
   * help prevent simultaneous updates of a restore from overwriting each other.
   * It is strongly suggested that systems make use of the `etag` in the
   * read-modify-write cycle to perform restore updates in order to avoid
   * race conditions: An `etag` is returned in the response to `GetRestorePlan`,
   * and systems are expected to put that etag in the request to
   * `UpdateRestorePlan` or `DeleteRestorePlan` to ensure that their change
   * will be applied to the same version of the resource.
   * </pre>
   *
   * <code>string etag = 10 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Output only. State of the RestorePlan. This State field reflects the
   * various stages a RestorePlan can be in
   * during the Create operation.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestorePlan.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. State of the RestorePlan. This State field reflects the
   * various stages a RestorePlan can be in
   * during the Create operation.
   * </pre>
   *
   * <code>
   * .google.cloud.gkebackup.v1.RestorePlan.State state = 11 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.gkebackup.v1.RestorePlan.State getState();

  /**
   *
   *
   * <pre>
   * Output only. Human-readable description of why RestorePlan is in the
   * current `state`
   * </pre>
   *
   * <code>string state_reason = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The stateReason.
   */
  java.lang.String getStateReason();
  /**
   *
   *
   * <pre>
   * Output only. Human-readable description of why RestorePlan is in the
   * current `state`
   * </pre>
   *
   * <code>string state_reason = 12 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for stateReason.
   */
  com.google.protobuf.ByteString getStateReasonBytes();
}
