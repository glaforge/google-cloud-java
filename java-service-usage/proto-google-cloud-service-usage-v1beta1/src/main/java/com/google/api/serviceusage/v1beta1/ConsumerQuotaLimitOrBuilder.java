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
// source: google/api/serviceusage/v1beta1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.api.serviceusage.v1beta1;

public interface ConsumerQuotaLimitOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.serviceusage.v1beta1.ConsumerQuotaLimit)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the quota limit.
   *
   * An example name would be:
   * `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
   *
   * The resource name is intended to be opaque and should not be parsed for
   * its component strings, since its representation could change in the future.
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
   * The resource name of the quota limit.
   *
   * An example name would be:
   * `projects/123/services/compute.googleapis.com/consumerQuotaMetrics/compute.googleapis.com%2Fcpus/limits/%2Fproject%2Fregion`
   *
   * The resource name is intended to be opaque and should not be parsed for
   * its component strings, since its representation could change in the future.
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
   * The name of the parent metric of this limit.
   *
   * An example name would be:
   * `compute.googleapis.com/cpus`
   * </pre>
   *
   * <code>string metric = 8;</code>
   *
   * @return The metric.
   */
  java.lang.String getMetric();
  /**
   *
   *
   * <pre>
   * The name of the parent metric of this limit.
   *
   * An example name would be:
   * `compute.googleapis.com/cpus`
   * </pre>
   *
   * <code>string metric = 8;</code>
   *
   * @return The bytes for metric.
   */
  com.google.protobuf.ByteString getMetricBytes();

  /**
   *
   *
   * <pre>
   * The limit unit.
   *
   * An example unit would be
   * `1/{project}/{region}`
   * Note that `{project}` and `{region}` are not placeholders in this example;
   * the literal characters `{` and `}` occur in the string.
   * </pre>
   *
   * <code>string unit = 2;</code>
   *
   * @return The unit.
   */
  java.lang.String getUnit();
  /**
   *
   *
   * <pre>
   * The limit unit.
   *
   * An example unit would be
   * `1/{project}/{region}`
   * Note that `{project}` and `{region}` are not placeholders in this example;
   * the literal characters `{` and `}` occur in the string.
   * </pre>
   *
   * <code>string unit = 2;</code>
   *
   * @return The bytes for unit.
   */
  com.google.protobuf.ByteString getUnitBytes();

  /**
   *
   *
   * <pre>
   * Whether this limit is precise or imprecise.
   * </pre>
   *
   * <code>bool is_precise = 3;</code>
   *
   * @return The isPrecise.
   */
  boolean getIsPrecise();

  /**
   *
   *
   * <pre>
   * Whether admin overrides are allowed on this limit
   * </pre>
   *
   * <code>bool allows_admin_overrides = 7;</code>
   *
   * @return The allowsAdminOverrides.
   */
  boolean getAllowsAdminOverrides();

  /**
   *
   *
   * <pre>
   * Summary of the enforced quota buckets, organized by quota dimension,
   * ordered from least specific to most specific (for example, the global
   * default bucket, with no quota dimensions, will always appear first).
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaBucket quota_buckets = 9;</code>
   */
  java.util.List<com.google.api.serviceusage.v1beta1.QuotaBucket> getQuotaBucketsList();
  /**
   *
   *
   * <pre>
   * Summary of the enforced quota buckets, organized by quota dimension,
   * ordered from least specific to most specific (for example, the global
   * default bucket, with no quota dimensions, will always appear first).
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaBucket quota_buckets = 9;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaBucket getQuotaBuckets(int index);
  /**
   *
   *
   * <pre>
   * Summary of the enforced quota buckets, organized by quota dimension,
   * ordered from least specific to most specific (for example, the global
   * default bucket, with no quota dimensions, will always appear first).
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaBucket quota_buckets = 9;</code>
   */
  int getQuotaBucketsCount();
  /**
   *
   *
   * <pre>
   * Summary of the enforced quota buckets, organized by quota dimension,
   * ordered from least specific to most specific (for example, the global
   * default bucket, with no quota dimensions, will always appear first).
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaBucket quota_buckets = 9;</code>
   */
  java.util.List<? extends com.google.api.serviceusage.v1beta1.QuotaBucketOrBuilder>
      getQuotaBucketsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Summary of the enforced quota buckets, organized by quota dimension,
   * ordered from least specific to most specific (for example, the global
   * default bucket, with no quota dimensions, will always appear first).
   * </pre>
   *
   * <code>repeated .google.api.serviceusage.v1beta1.QuotaBucket quota_buckets = 9;</code>
   */
  com.google.api.serviceusage.v1beta1.QuotaBucketOrBuilder getQuotaBucketsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * List of all supported locations.
   * This field is present only if the limit has a {region} or {zone} dimension.
   * </pre>
   *
   * <code>repeated string supported_locations = 11;</code>
   *
   * @return A list containing the supportedLocations.
   */
  java.util.List<java.lang.String> getSupportedLocationsList();
  /**
   *
   *
   * <pre>
   * List of all supported locations.
   * This field is present only if the limit has a {region} or {zone} dimension.
   * </pre>
   *
   * <code>repeated string supported_locations = 11;</code>
   *
   * @return The count of supportedLocations.
   */
  int getSupportedLocationsCount();
  /**
   *
   *
   * <pre>
   * List of all supported locations.
   * This field is present only if the limit has a {region} or {zone} dimension.
   * </pre>
   *
   * <code>repeated string supported_locations = 11;</code>
   *
   * @param index The index of the element to return.
   * @return The supportedLocations at the given index.
   */
  java.lang.String getSupportedLocations(int index);
  /**
   *
   *
   * <pre>
   * List of all supported locations.
   * This field is present only if the limit has a {region} or {zone} dimension.
   * </pre>
   *
   * <code>repeated string supported_locations = 11;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the supportedLocations at the given index.
   */
  com.google.protobuf.ByteString getSupportedLocationsBytes(int index);
}
