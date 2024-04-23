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
// source: google/monitoring/v3/common.proto

// Protobuf Java Version: 3.25.3
package com.google.monitoring.v3;

public interface AggregationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.monitoring.v3.Aggregation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The `alignment_period` specifies a time interval, in seconds, that is used
   * to divide the data in all the
   * [time series][google.monitoring.v3.TimeSeries] into consistent blocks of
   * time. This will be done before the per-series aligner can be applied to
   * the data.
   *
   * The value must be at least 60 seconds. If a per-series
   * aligner other than `ALIGN_NONE` is specified, this field is required or an
   * error is returned. If no per-series aligner is specified, or the aligner
   * `ALIGN_NONE` is specified, then this field is ignored.
   *
   * The maximum value of the `alignment_period` is 104 weeks (2 years) for
   * charts, and 90,000 seconds (25 hours) for alerting policies.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   *
   * @return Whether the alignmentPeriod field is set.
   */
  boolean hasAlignmentPeriod();
  /**
   *
   *
   * <pre>
   * The `alignment_period` specifies a time interval, in seconds, that is used
   * to divide the data in all the
   * [time series][google.monitoring.v3.TimeSeries] into consistent blocks of
   * time. This will be done before the per-series aligner can be applied to
   * the data.
   *
   * The value must be at least 60 seconds. If a per-series
   * aligner other than `ALIGN_NONE` is specified, this field is required or an
   * error is returned. If no per-series aligner is specified, or the aligner
   * `ALIGN_NONE` is specified, then this field is ignored.
   *
   * The maximum value of the `alignment_period` is 104 weeks (2 years) for
   * charts, and 90,000 seconds (25 hours) for alerting policies.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   *
   * @return The alignmentPeriod.
   */
  com.google.protobuf.Duration getAlignmentPeriod();
  /**
   *
   *
   * <pre>
   * The `alignment_period` specifies a time interval, in seconds, that is used
   * to divide the data in all the
   * [time series][google.monitoring.v3.TimeSeries] into consistent blocks of
   * time. This will be done before the per-series aligner can be applied to
   * the data.
   *
   * The value must be at least 60 seconds. If a per-series
   * aligner other than `ALIGN_NONE` is specified, this field is required or an
   * error is returned. If no per-series aligner is specified, or the aligner
   * `ALIGN_NONE` is specified, then this field is ignored.
   *
   * The maximum value of the `alignment_period` is 104 weeks (2 years) for
   * charts, and 90,000 seconds (25 hours) for alerting policies.
   * </pre>
   *
   * <code>.google.protobuf.Duration alignment_period = 1;</code>
   */
  com.google.protobuf.DurationOrBuilder getAlignmentPeriodOrBuilder();

  /**
   *
   *
   * <pre>
   * An `Aligner` describes how to bring the data points in a single
   * time series into temporal alignment. Except for `ALIGN_NONE`, all
   * alignments cause all the data points in an `alignment_period` to be
   * mathematically grouped together, resulting in a single data point for
   * each `alignment_period` with end timestamp at the end of the period.
   *
   * Not all alignment operations may be applied to all time series. The valid
   * choices depend on the `metric_kind` and `value_type` of the original time
   * series. Alignment can change the `metric_kind` or the `value_type` of
   * the time series.
   *
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `cross_series_reducer` is specified, then
   * `per_series_aligner` must be specified and not equal to `ALIGN_NONE`
   * and `alignment_period` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Aligner per_series_aligner = 2;</code>
   *
   * @return The enum numeric value on the wire for perSeriesAligner.
   */
  int getPerSeriesAlignerValue();
  /**
   *
   *
   * <pre>
   * An `Aligner` describes how to bring the data points in a single
   * time series into temporal alignment. Except for `ALIGN_NONE`, all
   * alignments cause all the data points in an `alignment_period` to be
   * mathematically grouped together, resulting in a single data point for
   * each `alignment_period` with end timestamp at the end of the period.
   *
   * Not all alignment operations may be applied to all time series. The valid
   * choices depend on the `metric_kind` and `value_type` of the original time
   * series. Alignment can change the `metric_kind` or the `value_type` of
   * the time series.
   *
   * Time series data must be aligned in order to perform cross-time
   * series reduction. If `cross_series_reducer` is specified, then
   * `per_series_aligner` must be specified and not equal to `ALIGN_NONE`
   * and `alignment_period` must be specified; otherwise, an error is
   * returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Aligner per_series_aligner = 2;</code>
   *
   * @return The perSeriesAligner.
   */
  com.google.monitoring.v3.Aggregation.Aligner getPerSeriesAligner();

  /**
   *
   *
   * <pre>
   * The reduction operation to be used to combine time series into a single
   * time series, where the value of each data point in the resulting series is
   * a function of all the already aligned values in the input time series.
   *
   * Not all reducer operations can be applied to all time series. The valid
   * choices depend on the `metric_kind` and the `value_type` of the original
   * time series. Reduction can yield a time series with a different
   * `metric_kind` or `value_type` than the input time series.
   *
   * Time series data must first be aligned (see `per_series_aligner`) in order
   * to perform cross-time series reduction. If `cross_series_reducer` is
   * specified, then `per_series_aligner` must be specified, and must not be
   * `ALIGN_NONE`. An `alignment_period` must also be specified; otherwise, an
   * error is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Reducer cross_series_reducer = 4;</code>
   *
   * @return The enum numeric value on the wire for crossSeriesReducer.
   */
  int getCrossSeriesReducerValue();
  /**
   *
   *
   * <pre>
   * The reduction operation to be used to combine time series into a single
   * time series, where the value of each data point in the resulting series is
   * a function of all the already aligned values in the input time series.
   *
   * Not all reducer operations can be applied to all time series. The valid
   * choices depend on the `metric_kind` and the `value_type` of the original
   * time series. Reduction can yield a time series with a different
   * `metric_kind` or `value_type` than the input time series.
   *
   * Time series data must first be aligned (see `per_series_aligner`) in order
   * to perform cross-time series reduction. If `cross_series_reducer` is
   * specified, then `per_series_aligner` must be specified, and must not be
   * `ALIGN_NONE`. An `alignment_period` must also be specified; otherwise, an
   * error is returned.
   * </pre>
   *
   * <code>.google.monitoring.v3.Aggregation.Reducer cross_series_reducer = 4;</code>
   *
   * @return The crossSeriesReducer.
   */
  com.google.monitoring.v3.Aggregation.Reducer getCrossSeriesReducer();

  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `cross_series_reducer` is
   * specified. The `group_by_fields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `cross_series_reducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `group_by_fields` are aggregated away.  If
   * `group_by_fields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `cross_series_reducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @return A list containing the groupByFields.
   */
  java.util.List<java.lang.String> getGroupByFieldsList();
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `cross_series_reducer` is
   * specified. The `group_by_fields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `cross_series_reducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `group_by_fields` are aggregated away.  If
   * `group_by_fields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `cross_series_reducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @return The count of groupByFields.
   */
  int getGroupByFieldsCount();
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `cross_series_reducer` is
   * specified. The `group_by_fields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `cross_series_reducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `group_by_fields` are aggregated away.  If
   * `group_by_fields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `cross_series_reducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @param index The index of the element to return.
   * @return The groupByFields at the given index.
   */
  java.lang.String getGroupByFields(int index);
  /**
   *
   *
   * <pre>
   * The set of fields to preserve when `cross_series_reducer` is
   * specified. The `group_by_fields` determine how the time series are
   * partitioned into subsets prior to applying the aggregation
   * operation. Each subset contains time series that have the same
   * value for each of the grouping fields. Each individual time
   * series is a member of exactly one subset. The
   * `cross_series_reducer` is applied to each subset of time series.
   * It is not possible to reduce across different resource types, so
   * this field implicitly contains `resource.type`.  Fields not
   * specified in `group_by_fields` are aggregated away.  If
   * `group_by_fields` is not specified and all the time series have
   * the same resource type, then the time series are aggregated into
   * a single output time series. If `cross_series_reducer` is not
   * defined, this field is ignored.
   * </pre>
   *
   * <code>repeated string group_by_fields = 5;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the groupByFields at the given index.
   */
  com.google.protobuf.ByteString getGroupByFieldsBytes(int index);
}
