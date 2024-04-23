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
// source: google/cloud/datalabeling/v1beta1/evaluation.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface PrCurveOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.PrCurve)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The annotation spec of the label for which the precision-recall curve
   * calculated. If this field is empty, that means the precision-recall curve
   * is an aggregate curve for all labels.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return Whether the annotationSpec field is set.
   */
  boolean hasAnnotationSpec();
  /**
   *
   *
   * <pre>
   * The annotation spec of the label for which the precision-recall curve
   * calculated. If this field is empty, that means the precision-recall curve
   * is an aggregate curve for all labels.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   *
   * @return The annotationSpec.
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpec getAnnotationSpec();
  /**
   *
   *
   * <pre>
   * The annotation spec of the label for which the precision-recall curve
   * calculated. If this field is empty, that means the precision-recall curve
   * is an aggregate curve for all labels.
   * </pre>
   *
   * <code>.google.cloud.datalabeling.v1beta1.AnnotationSpec annotation_spec = 1;</code>
   */
  com.google.cloud.datalabeling.v1beta1.AnnotationSpecOrBuilder getAnnotationSpecOrBuilder();

  /**
   *
   *
   * <pre>
   * Area under the precision-recall curve. Not to be confused with area under
   * a receiver operating characteristic (ROC) curve.
   * </pre>
   *
   * <code>float area_under_curve = 2;</code>
   *
   * @return The areaUnderCurve.
   */
  float getAreaUnderCurve();

  /**
   *
   *
   * <pre>
   * Entries that make up the precision-recall graph. Each entry is a "point" on
   * the graph drawn for a different `confidence_threshold`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry confidence_metrics_entries = 3;
   * </code>
   */
  java.util.List<com.google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry>
      getConfidenceMetricsEntriesList();
  /**
   *
   *
   * <pre>
   * Entries that make up the precision-recall graph. Each entry is a "point" on
   * the graph drawn for a different `confidence_threshold`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry confidence_metrics_entries = 3;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry getConfidenceMetricsEntries(
      int index);
  /**
   *
   *
   * <pre>
   * Entries that make up the precision-recall graph. Each entry is a "point" on
   * the graph drawn for a different `confidence_threshold`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry confidence_metrics_entries = 3;
   * </code>
   */
  int getConfidenceMetricsEntriesCount();
  /**
   *
   *
   * <pre>
   * Entries that make up the precision-recall graph. Each entry is a "point" on
   * the graph drawn for a different `confidence_threshold`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry confidence_metrics_entries = 3;
   * </code>
   */
  java.util.List<
          ? extends com.google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntryOrBuilder>
      getConfidenceMetricsEntriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Entries that make up the precision-recall graph. Each entry is a "point" on
   * the graph drawn for a different `confidence_threshold`.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntry confidence_metrics_entries = 3;
   * </code>
   */
  com.google.cloud.datalabeling.v1beta1.PrCurve.ConfidenceMetricsEntryOrBuilder
      getConfidenceMetricsEntriesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Mean average prcision of this curve.
   * </pre>
   *
   * <code>float mean_average_precision = 4;</code>
   *
   * @return The meanAveragePrecision.
   */
  float getMeanAveragePrecision();
}
