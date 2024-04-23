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
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.settings.v1beta1;

public interface BatchCalculateEffectiveSettingsResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.settings.v1beta1.BatchCalculateEffectiveSettingsResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings> getSettingsList();
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.Settings getSettings(int index);
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  int getSettingsCount();
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder>
      getSettingsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder getSettingsOrBuilder(
      int index);
}
