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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

public interface ResourcePolicyInstanceSchedulePolicyOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicy)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The expiration time of the schedule. The timestamp is an RFC3339 string.
   * </pre>
   *
   * <code>optional string expiration_time = 230299229;</code>
   *
   * @return Whether the expirationTime field is set.
   */
  boolean hasExpirationTime();
  /**
   *
   *
   * <pre>
   * The expiration time of the schedule. The timestamp is an RFC3339 string.
   * </pre>
   *
   * <code>optional string expiration_time = 230299229;</code>
   *
   * @return The expirationTime.
   */
  java.lang.String getExpirationTime();
  /**
   *
   *
   * <pre>
   * The expiration time of the schedule. The timestamp is an RFC3339 string.
   * </pre>
   *
   * <code>optional string expiration_time = 230299229;</code>
   *
   * @return The bytes for expirationTime.
   */
  com.google.protobuf.ByteString getExpirationTimeBytes();

  /**
   *
   *
   * <pre>
   * The start time of the schedule. The timestamp is an RFC3339 string.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return Whether the startTime field is set.
   */
  boolean hasStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the schedule. The timestamp is an RFC3339 string.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The startTime.
   */
  java.lang.String getStartTime();
  /**
   *
   *
   * <pre>
   * The start time of the schedule. The timestamp is an RFC3339 string.
   * </pre>
   *
   * <code>optional string start_time = 37467274;</code>
   *
   * @return The bytes for startTime.
   */
  com.google.protobuf.ByteString getStartTimeBytes();

  /**
   *
   *
   * <pre>
   * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: https://wikipedia.org/wiki/Tz_database.
   * </pre>
   *
   * <code>optional string time_zone = 36848094;</code>
   *
   * @return Whether the timeZone field is set.
   */
  boolean hasTimeZone();
  /**
   *
   *
   * <pre>
   * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: https://wikipedia.org/wiki/Tz_database.
   * </pre>
   *
   * <code>optional string time_zone = 36848094;</code>
   *
   * @return The timeZone.
   */
  java.lang.String getTimeZone();
  /**
   *
   *
   * <pre>
   * Specifies the time zone to be used in interpreting Schedule.schedule. The value of this field must be a time zone name from the tz database: https://wikipedia.org/wiki/Tz_database.
   * </pre>
   *
   * <code>optional string time_zone = 36848094;</code>
   *
   * @return The bytes for timeZone.
   */
  com.google.protobuf.ByteString getTimeZoneBytes();

  /**
   *
   *
   * <pre>
   * Specifies the schedule for starting instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule vm_start_schedule = 17762396;
   * </code>
   *
   * @return Whether the vmStartSchedule field is set.
   */
  boolean hasVmStartSchedule();
  /**
   *
   *
   * <pre>
   * Specifies the schedule for starting instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule vm_start_schedule = 17762396;
   * </code>
   *
   * @return The vmStartSchedule.
   */
  com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule getVmStartSchedule();
  /**
   *
   *
   * <pre>
   * Specifies the schedule for starting instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule vm_start_schedule = 17762396;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicyScheduleOrBuilder
      getVmStartScheduleOrBuilder();

  /**
   *
   *
   * <pre>
   * Specifies the schedule for stopping instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule vm_stop_schedule = 426242732;
   * </code>
   *
   * @return Whether the vmStopSchedule field is set.
   */
  boolean hasVmStopSchedule();
  /**
   *
   *
   * <pre>
   * Specifies the schedule for stopping instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule vm_stop_schedule = 426242732;
   * </code>
   *
   * @return The vmStopSchedule.
   */
  com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule getVmStopSchedule();
  /**
   *
   *
   * <pre>
   * Specifies the schedule for stopping instances.
   * </pre>
   *
   * <code>
   * optional .google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicySchedule vm_stop_schedule = 426242732;
   * </code>
   */
  com.google.cloud.compute.v1.ResourcePolicyInstanceSchedulePolicyScheduleOrBuilder
      getVmStopScheduleOrBuilder();
}
