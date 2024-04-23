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
// source: google/cloud/datalabeling/v1beta1/evaluation_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datalabeling.v1beta1;

public interface EvaluationJobAlertConfigOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datalabeling.v1beta1.EvaluationJobAlertConfig)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. An email address to send alerts to.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The email.
   */
  java.lang.String getEmail();
  /**
   *
   *
   * <pre>
   * Required. An email address to send alerts to.
   * </pre>
   *
   * <code>string email = 1;</code>
   *
   * @return The bytes for email.
   */
  com.google.protobuf.ByteString getEmailBytes();

  /**
   *
   *
   * <pre>
   * Required. A number between 0 and 1 that describes a minimum mean average
   * precision threshold. When the evaluation job runs, if it calculates that
   * your model version's predictions from the recent interval have
   * [meanAveragePrecision][google.cloud.datalabeling.v1beta1.PrCurve.mean_average_precision] below this
   * threshold, then it sends an alert to your specified email.
   * </pre>
   *
   * <code>double min_acceptable_mean_average_precision = 2;</code>
   *
   * @return The minAcceptableMeanAveragePrecision.
   */
  double getMinAcceptableMeanAveragePrecision();
}
