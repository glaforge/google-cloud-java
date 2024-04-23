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
// source: google/shopping/merchant/reports/v1beta/reports.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.merchant.reports.v1beta;

public interface CompetitiveVisibilityBenchmarkViewOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.merchant.reports.v1beta.CompetitiveVisibilityBenchmarkView)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Date of this row.
   *
   * Required in the `SELECT` clause. A condition on `date` is required in the
   * `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return Whether the date field is set.
   */
  boolean hasDate();
  /**
   *
   *
   * <pre>
   * Date of this row.
   *
   * Required in the `SELECT` clause. A condition on `date` is required in the
   * `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   *
   * @return The date.
   */
  com.google.type.Date getDate();
  /**
   *
   *
   * <pre>
   * Date of this row.
   *
   * Required in the `SELECT` clause. A condition on `date` is required in the
   * `WHERE` clause.
   * </pre>
   *
   * <code>.google.type.Date date = 1;</code>
   */
  com.google.type.DateOrBuilder getDateOrBuilder();

  /**
   *
   *
   * <pre>
   * Country where impressions appeared.
   *
   * Required in the `SELECT` clause. A condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 2;</code>
   *
   * @return Whether the reportCountryCode field is set.
   */
  boolean hasReportCountryCode();
  /**
   *
   *
   * <pre>
   * Country where impressions appeared.
   *
   * Required in the `SELECT` clause. A condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 2;</code>
   *
   * @return The reportCountryCode.
   */
  java.lang.String getReportCountryCode();
  /**
   *
   *
   * <pre>
   * Country where impressions appeared.
   *
   * Required in the `SELECT` clause. A condition on `report_country_code` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional string report_country_code = 2;</code>
   *
   * @return The bytes for reportCountryCode.
   */
  com.google.protobuf.ByteString getReportCountryCodeBytes();

  /**
   *
   *
   * <pre>
   * Google product category ID to calculate the report for, represented in
   * [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   *
   * Required in the `SELECT` clause. A condition on `report_category_id` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional int64 report_category_id = 3;</code>
   *
   * @return Whether the reportCategoryId field is set.
   */
  boolean hasReportCategoryId();
  /**
   *
   *
   * <pre>
   * Google product category ID to calculate the report for, represented in
   * [Google's product
   * taxonomy](https://support.google.com/merchants/answer/6324436).
   *
   * Required in the `SELECT` clause. A condition on `report_category_id` is
   * required in the `WHERE` clause.
   * </pre>
   *
   * <code>optional int64 report_category_id = 3;</code>
   *
   * @return The reportCategoryId.
   */
  long getReportCategoryId();

  /**
   *
   *
   * <pre>
   * Traffic source of impressions.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum traffic_source = 4;
   * </code>
   *
   * @return Whether the trafficSource field is set.
   */
  boolean hasTrafficSource();
  /**
   *
   *
   * <pre>
   * Traffic source of impressions.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum traffic_source = 4;
   * </code>
   *
   * @return The enum numeric value on the wire for trafficSource.
   */
  int getTrafficSourceValue();
  /**
   *
   *
   * <pre>
   * Traffic source of impressions.
   *
   * Required in the `SELECT` clause.
   * </pre>
   *
   * <code>
   * optional .google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum traffic_source = 4;
   * </code>
   *
   * @return The trafficSource.
   */
  com.google.shopping.merchant.reports.v1beta.TrafficSource.TrafficSourceEnum getTrafficSource();

  /**
   *
   *
   * <pre>
   * Change in visibility based on impressions for your domain with respect to
   * the start of the selected time range (or first day with non-zero
   * impressions).
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double your_domain_visibility_trend = 5;</code>
   *
   * @return Whether the yourDomainVisibilityTrend field is set.
   */
  boolean hasYourDomainVisibilityTrend();
  /**
   *
   *
   * <pre>
   * Change in visibility based on impressions for your domain with respect to
   * the start of the selected time range (or first day with non-zero
   * impressions).
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double your_domain_visibility_trend = 5;</code>
   *
   * @return The yourDomainVisibilityTrend.
   */
  double getYourDomainVisibilityTrend();

  /**
   *
   *
   * <pre>
   * Change in visibility based on impressions with respect to the start of the
   * selected time range (or first day with non-zero impressions) for a
   * combined set of merchants with highest visibility approximating the
   * market.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double category_benchmark_visibility_trend = 6;</code>
   *
   * @return Whether the categoryBenchmarkVisibilityTrend field is set.
   */
  boolean hasCategoryBenchmarkVisibilityTrend();
  /**
   *
   *
   * <pre>
   * Change in visibility based on impressions with respect to the start of the
   * selected time range (or first day with non-zero impressions) for a
   * combined set of merchants with highest visibility approximating the
   * market.
   *
   * Cannot be filtered on in the 'WHERE' clause.
   * </pre>
   *
   * <code>optional double category_benchmark_visibility_trend = 6;</code>
   *
   * @return The categoryBenchmarkVisibilityTrend.
   */
  double getCategoryBenchmarkVisibilityTrend();
}
