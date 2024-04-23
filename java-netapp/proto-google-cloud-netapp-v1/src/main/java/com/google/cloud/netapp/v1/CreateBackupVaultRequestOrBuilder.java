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
// source: google/cloud/netapp/v1/backup_vault.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.netapp.v1;

public interface CreateBackupVaultRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.netapp.v1.CreateBackupVaultRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The location to create the backup vaults, in the format
   * `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The location to create the backup vaults, in the format
   * `projects/{project_id}/locations/{location}`
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backupVault.
   * The ID must be unique within the specified location.
   * The max supported length is 63 characters.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * Values that do not match this pattern will trigger an INVALID_ARGUMENT
   * error.
   * </pre>
   *
   * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The backupVaultId.
   */
  java.lang.String getBackupVaultId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the backupVault.
   * The ID must be unique within the specified location.
   * The max supported length is 63 characters.
   * This value must start with a lowercase letter followed by up to 62
   * lowercase letters, numbers, or hyphens, and cannot end with a hyphen.
   * Values that do not match this pattern will trigger an INVALID_ARGUMENT
   * error.
   * </pre>
   *
   * <code>string backup_vault_id = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for backupVaultId.
   */
  com.google.protobuf.ByteString getBackupVaultIdBytes();

  /**
   *
   *
   * <pre>
   * Required. A backupVault resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the backupVault field is set.
   */
  boolean hasBackupVault();
  /**
   *
   *
   * <pre>
   * Required. A backupVault resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The backupVault.
   */
  com.google.cloud.netapp.v1.BackupVault getBackupVault();
  /**
   *
   *
   * <pre>
   * Required. A backupVault resource
   * </pre>
   *
   * <code>
   * .google.cloud.netapp.v1.BackupVault backup_vault = 3 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.netapp.v1.BackupVaultOrBuilder getBackupVaultOrBuilder();
}
