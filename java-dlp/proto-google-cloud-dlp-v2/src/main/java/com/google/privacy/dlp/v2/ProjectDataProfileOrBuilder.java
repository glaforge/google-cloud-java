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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

public interface ProjectDataProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.ProjectDataProfile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the profile.
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
   * The resource name of the profile.
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
   * Project ID that was profiled.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * Project ID that was profiled.
   * </pre>
   *
   * <code>string project_id = 2;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * The last time the profile was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp profile_last_generated = 3;</code>
   *
   * @return Whether the profileLastGenerated field is set.
   */
  boolean hasProfileLastGenerated();
  /**
   *
   *
   * <pre>
   * The last time the profile was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp profile_last_generated = 3;</code>
   *
   * @return The profileLastGenerated.
   */
  com.google.protobuf.Timestamp getProfileLastGenerated();
  /**
   *
   *
   * <pre>
   * The last time the profile was generated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp profile_last_generated = 3;</code>
   */
  com.google.protobuf.TimestampOrBuilder getProfileLastGeneratedOrBuilder();

  /**
   *
   *
   * <pre>
   * The sensitivity score of this project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 4;</code>
   *
   * @return Whether the sensitivityScore field is set.
   */
  boolean hasSensitivityScore();
  /**
   *
   *
   * <pre>
   * The sensitivity score of this project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 4;</code>
   *
   * @return The sensitivityScore.
   */
  com.google.privacy.dlp.v2.SensitivityScore getSensitivityScore();
  /**
   *
   *
   * <pre>
   * The sensitivity score of this project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.SensitivityScore sensitivity_score = 4;</code>
   */
  com.google.privacy.dlp.v2.SensitivityScoreOrBuilder getSensitivityScoreOrBuilder();

  /**
   *
   *
   * <pre>
   * The data risk level of this project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel data_risk_level = 5;</code>
   *
   * @return Whether the dataRiskLevel field is set.
   */
  boolean hasDataRiskLevel();
  /**
   *
   *
   * <pre>
   * The data risk level of this project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel data_risk_level = 5;</code>
   *
   * @return The dataRiskLevel.
   */
  com.google.privacy.dlp.v2.DataRiskLevel getDataRiskLevel();
  /**
   *
   *
   * <pre>
   * The data risk level of this project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataRiskLevel data_risk_level = 5;</code>
   */
  com.google.privacy.dlp.v2.DataRiskLevelOrBuilder getDataRiskLevelOrBuilder();

  /**
   *
   *
   * <pre>
   * Success or error status of the last attempt to profile the project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ProfileStatus profile_status = 7;</code>
   *
   * @return Whether the profileStatus field is set.
   */
  boolean hasProfileStatus();
  /**
   *
   *
   * <pre>
   * Success or error status of the last attempt to profile the project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ProfileStatus profile_status = 7;</code>
   *
   * @return The profileStatus.
   */
  com.google.privacy.dlp.v2.ProfileStatus getProfileStatus();
  /**
   *
   *
   * <pre>
   * Success or error status of the last attempt to profile the project.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.ProfileStatus profile_status = 7;</code>
   */
  com.google.privacy.dlp.v2.ProfileStatusOrBuilder getProfileStatusOrBuilder();
}
