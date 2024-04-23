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
// source: google/cloud/gkemulticloud/v1/azure_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkemulticloud.v1;

public interface AzureDatabaseEncryptionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkemulticloud.v1.AzureDatabaseEncryption)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt data.
   *
   * For example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
   * Encryption will always take the latest version of the key and hence
   * specific version is not supported.
   * </pre>
   *
   * <code>string key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The keyId.
   */
  java.lang.String getKeyId();
  /**
   *
   *
   * <pre>
   * Required. The ARM ID of the Azure Key Vault key to encrypt / decrypt data.
   *
   * For example:
   * `/subscriptions/&lt;subscription-id&gt;/resourceGroups/&lt;resource-group-id&gt;/providers/Microsoft.KeyVault/vaults/&lt;key-vault-id&gt;/keys/&lt;key-name&gt;`
   * Encryption will always take the latest version of the key and hence
   * specific version is not supported.
   * </pre>
   *
   * <code>string key_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for keyId.
   */
  com.google.protobuf.ByteString getKeyIdBytes();
}
