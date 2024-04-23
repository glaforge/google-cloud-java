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
// source: google/cloud/securitycenter/v1/organization_settings.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public interface OrganizationSettingsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.OrganizationSettings)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of the settings. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/organizationSettings".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The relative resource name of the settings. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Example:
   * "organizations/{organization_id}/organizationSettings".
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A flag that indicates if Asset Discovery should be enabled. If the flag is
   * set to `true`, then discovery of assets will occur. If it is set to
   * `false`, all historical assets will remain, but discovery of future assets
   * will not occur.
   * </pre>
   *
   * <code>bool enable_asset_discovery = 2;</code>
   *
   * @return The enableAssetDiscovery.
   */
  boolean getEnableAssetDiscovery();

  /**
   *
   *
   * <pre>
   * The configuration used for Asset Discovery runs.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.OrganizationSettings.AssetDiscoveryConfig asset_discovery_config = 3;
   * </code>
   *
   * @return Whether the assetDiscoveryConfig field is set.
   */
  boolean hasAssetDiscoveryConfig();
  /**
   *
   *
   * <pre>
   * The configuration used for Asset Discovery runs.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.OrganizationSettings.AssetDiscoveryConfig asset_discovery_config = 3;
   * </code>
   *
   * @return The assetDiscoveryConfig.
   */
  com.google.cloud.securitycenter.v1.OrganizationSettings.AssetDiscoveryConfig
      getAssetDiscoveryConfig();
  /**
   *
   *
   * <pre>
   * The configuration used for Asset Discovery runs.
   * </pre>
   *
   * <code>
   * .google.cloud.securitycenter.v1.OrganizationSettings.AssetDiscoveryConfig asset_discovery_config = 3;
   * </code>
   */
  com.google.cloud.securitycenter.v1.OrganizationSettings.AssetDiscoveryConfigOrBuilder
      getAssetDiscoveryConfigOrBuilder();
}
