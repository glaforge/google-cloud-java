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
// source: google/devtools/cloudprofiler/v2/profiler.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.cloudprofiler.v2;

public interface ProfileOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.cloudprofiler.v2.Profile)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. Opaque, server-assigned, unique ID for this profile.
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
   * Output only. Opaque, server-assigned, unique ID for this profile.
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
   * Type of profile.
   * For offline mode, this must be specified when creating the profile. For
   * online mode it is assigned and returned by the server.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   *
   * @return The enum numeric value on the wire for profileType.
   */
  int getProfileTypeValue();
  /**
   *
   *
   * <pre>
   * Type of profile.
   * For offline mode, this must be specified when creating the profile. For
   * online mode it is assigned and returned by the server.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.ProfileType profile_type = 2;</code>
   *
   * @return The profileType.
   */
  com.google.devtools.cloudprofiler.v2.ProfileType getProfileType();

  /**
   *
   *
   * <pre>
   * Deployment this profile corresponds to.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Deployment deployment = 3;</code>
   *
   * @return Whether the deployment field is set.
   */
  boolean hasDeployment();
  /**
   *
   *
   * <pre>
   * Deployment this profile corresponds to.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Deployment deployment = 3;</code>
   *
   * @return The deployment.
   */
  com.google.devtools.cloudprofiler.v2.Deployment getDeployment();
  /**
   *
   *
   * <pre>
   * Deployment this profile corresponds to.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Deployment deployment = 3;</code>
   */
  com.google.devtools.cloudprofiler.v2.DeploymentOrBuilder getDeploymentOrBuilder();

  /**
   *
   *
   * <pre>
   * Duration of the profiling session.
   * Input (for the offline mode) or output (for the online mode).
   * The field represents requested profiling duration. It may slightly differ
   * from the effective profiling duration, which is recorded in the profile
   * data, in case the profiling can't be stopped immediately (e.g. in case
   * stopping the profiling is handled asynchronously).
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 4;</code>
   *
   * @return Whether the duration field is set.
   */
  boolean hasDuration();
  /**
   *
   *
   * <pre>
   * Duration of the profiling session.
   * Input (for the offline mode) or output (for the online mode).
   * The field represents requested profiling duration. It may slightly differ
   * from the effective profiling duration, which is recorded in the profile
   * data, in case the profiling can't be stopped immediately (e.g. in case
   * stopping the profiling is handled asynchronously).
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 4;</code>
   *
   * @return The duration.
   */
  com.google.protobuf.Duration getDuration();
  /**
   *
   *
   * <pre>
   * Duration of the profiling session.
   * Input (for the offline mode) or output (for the online mode).
   * The field represents requested profiling duration. It may slightly differ
   * from the effective profiling duration, which is recorded in the profile
   * data, in case the profiling can't be stopped immediately (e.g. in case
   * stopping the profiling is handled asynchronously).
   * </pre>
   *
   * <code>.google.protobuf.Duration duration = 4;</code>
   */
  com.google.protobuf.DurationOrBuilder getDurationOrBuilder();

  /**
   *
   *
   * <pre>
   * Input only. Profile bytes, as a gzip compressed serialized proto, the
   * format is https://github.com/google/pprof/blob/master/proto/profile.proto.
   * </pre>
   *
   * <code>bytes profile_bytes = 5 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   *
   * @return The profileBytes.
   */
  com.google.protobuf.ByteString getProfileBytes();

  /**
   *
   *
   * <pre>
   * Input only. Labels associated to this specific profile. These labels will
   * get merged with the deployment labels for the final data set. See
   * documentation on deployment labels for validation rules and limits.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Input only. Labels associated to this specific profile. These labels will
   * get merged with the deployment labels for the final data set. See
   * documentation on deployment labels for validation rules and limits.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Input only. Labels associated to this specific profile. These labels will
   * get merged with the deployment labels for the final data set. See
   * documentation on deployment labels for validation rules and limits.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Input only. Labels associated to this specific profile. These labels will
   * get merged with the deployment labels for the final data set. See
   * documentation on deployment labels for validation rules and limits.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
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
   * Input only. Labels associated to this specific profile. These labels will
   * get merged with the deployment labels for the final data set. See
   * documentation on deployment labels for validation rules and limits.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = INPUT_ONLY];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Start time for the profile.
   * This output is only present in response from the ListProfiles method.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Start time for the profile.
   * This output is only present in response from the ListProfiles method.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Start time for the profile.
   * This output is only present in response from the ListProfiles method.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();
}
