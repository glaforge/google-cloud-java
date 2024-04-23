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
// source: google/cloud/edgecontainer/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.edgecontainer.v1;

public interface ZoneMetadataOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.edgecontainer.v1.ZoneMetadata)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Quota for resources in this zone.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Quota quota = 1;</code>
   */
  java.util.List<com.google.cloud.edgecontainer.v1.Quota> getQuotaList();
  /**
   *
   *
   * <pre>
   * Quota for resources in this zone.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Quota quota = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.Quota getQuota(int index);
  /**
   *
   *
   * <pre>
   * Quota for resources in this zone.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Quota quota = 1;</code>
   */
  int getQuotaCount();
  /**
   *
   *
   * <pre>
   * Quota for resources in this zone.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Quota quota = 1;</code>
   */
  java.util.List<? extends com.google.cloud.edgecontainer.v1.QuotaOrBuilder>
      getQuotaOrBuilderList();
  /**
   *
   *
   * <pre>
   * Quota for resources in this zone.
   * </pre>
   *
   * <code>repeated .google.cloud.edgecontainer.v1.Quota quota = 1;</code>
   */
  com.google.cloud.edgecontainer.v1.QuotaOrBuilder getQuotaOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  int getRackTypesCount();
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  boolean containsRackTypes(java.lang.String key);
  /** Use {@link #getRackTypesMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, com.google.cloud.edgecontainer.v1.ZoneMetadata.RackType>
      getRackTypes();
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  java.util.Map<java.lang.String, com.google.cloud.edgecontainer.v1.ZoneMetadata.RackType>
      getRackTypesMap();
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  /* nullable */
  com.google.cloud.edgecontainer.v1.ZoneMetadata.RackType getRackTypesOrDefault(
      java.lang.String key,
      /* nullable */
      com.google.cloud.edgecontainer.v1.ZoneMetadata.RackType defaultValue);
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  com.google.cloud.edgecontainer.v1.ZoneMetadata.RackType getRackTypesOrThrow(java.lang.String key);
  /** Use {@link #getRackTypesValueMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.Integer> getRackTypesValue();
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.Integer> getRackTypesValueMap();
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  int getRackTypesValueOrDefault(java.lang.String key, int defaultValue);
  /**
   *
   *
   * <pre>
   * The map keyed by rack name and has value of RackType.
   * </pre>
   *
   * <code>map&lt;string, .google.cloud.edgecontainer.v1.ZoneMetadata.RackType&gt; rack_types = 2;
   * </code>
   */
  int getRackTypesValueOrThrow(java.lang.String key);
}
