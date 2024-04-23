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
// source: google/cloud/aiplatform/v1/nas_job.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface NasTrialOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.NasTrial)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Output only. The identifier of the NasTrial assigned by the service.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The id.
   */
  java.lang.String getId();
  /**
   *
   *
   * <pre>
   * Output only. The identifier of the NasTrial assigned by the service.
   * </pre>
   *
   * <code>string id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for id.
   */
  com.google.protobuf.ByteString getIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the NasTrial.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NasTrial.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  int getStateValue();
  /**
   *
   *
   * <pre>
   * Output only. The detailed state of the NasTrial.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.NasTrial.State state = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  com.google.cloud.aiplatform.v1.NasTrial.State getState();

  /**
   *
   *
   * <pre>
   * Output only. The final measurement containing the objective value.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Measurement final_measurement = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the finalMeasurement field is set.
   */
  boolean hasFinalMeasurement();
  /**
   *
   *
   * <pre>
   * Output only. The final measurement containing the objective value.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Measurement final_measurement = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The finalMeasurement.
   */
  com.google.cloud.aiplatform.v1.Measurement getFinalMeasurement();
  /**
   *
   *
   * <pre>
   * Output only. The final measurement containing the objective value.
   * </pre>
   *
   * <code>
   * .google.cloud.aiplatform.v1.Measurement final_measurement = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.cloud.aiplatform.v1.MeasurementOrBuilder getFinalMeasurementOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the NasTrial was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the NasTrial was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The startTime.
   */
  com.google.protobuf.Timestamp getStartTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the NasTrial was started.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp start_time = 4 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getStartTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Time when the NasTrial's status changed to `SUCCEEDED` or
   * `INFEASIBLE`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the endTime field is set.
   */
  boolean hasEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the NasTrial's status changed to `SUCCEEDED` or
   * `INFEASIBLE`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The endTime.
   */
  com.google.protobuf.Timestamp getEndTime();
  /**
   *
   *
   * <pre>
   * Output only. Time when the NasTrial's status changed to `SUCCEEDED` or
   * `INFEASIBLE`.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp end_time = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getEndTimeOrBuilder();
}
