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
// source: google/cloud/notebooks/v1/service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.notebooks.v1;

public interface ListSchedulesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.notebooks.v1.ListSchedulesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A list of returned instances.
   * </pre>
   *
   * <code>repeated .google.cloud.notebooks.v1.Schedule schedules = 1;</code>
   */
  java.util.List<com.google.cloud.notebooks.v1.Schedule> getSchedulesList();
  /**
   *
   *
   * <pre>
   * A list of returned instances.
   * </pre>
   *
   * <code>repeated .google.cloud.notebooks.v1.Schedule schedules = 1;</code>
   */
  com.google.cloud.notebooks.v1.Schedule getSchedules(int index);
  /**
   *
   *
   * <pre>
   * A list of returned instances.
   * </pre>
   *
   * <code>repeated .google.cloud.notebooks.v1.Schedule schedules = 1;</code>
   */
  int getSchedulesCount();
  /**
   *
   *
   * <pre>
   * A list of returned instances.
   * </pre>
   *
   * <code>repeated .google.cloud.notebooks.v1.Schedule schedules = 1;</code>
   */
  java.util.List<? extends com.google.cloud.notebooks.v1.ScheduleOrBuilder>
      getSchedulesOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of returned instances.
   * </pre>
   *
   * <code>repeated .google.cloud.notebooks.v1.Schedule schedules = 1;</code>
   */
  com.google.cloud.notebooks.v1.ScheduleOrBuilder getSchedulesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Page token that can be used to continue listing from the last result in the
   * next list call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  java.lang.String getNextPageToken();
  /**
   *
   *
   * <pre>
   * Page token that can be used to continue listing from the last result in the
   * next list call.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();

  /**
   *
   *
   * <pre>
   * Schedules that could not be reached. For example:
   *
   *     ['projects/{project_id}/location/{location}/schedules/monthly_digest',
   *      'projects/{project_id}/location/{location}/schedules/weekly_sentiment']
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return A list containing the unreachable.
   */
  java.util.List<java.lang.String> getUnreachableList();
  /**
   *
   *
   * <pre>
   * Schedules that could not be reached. For example:
   *
   *     ['projects/{project_id}/location/{location}/schedules/monthly_digest',
   *      'projects/{project_id}/location/{location}/schedules/weekly_sentiment']
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @return The count of unreachable.
   */
  int getUnreachableCount();
  /**
   *
   *
   * <pre>
   * Schedules that could not be reached. For example:
   *
   *     ['projects/{project_id}/location/{location}/schedules/monthly_digest',
   *      'projects/{project_id}/location/{location}/schedules/weekly_sentiment']
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the element to return.
   * @return The unreachable at the given index.
   */
  java.lang.String getUnreachable(int index);
  /**
   *
   *
   * <pre>
   * Schedules that could not be reached. For example:
   *
   *     ['projects/{project_id}/location/{location}/schedules/monthly_digest',
   *      'projects/{project_id}/location/{location}/schedules/weekly_sentiment']
   * </pre>
   *
   * <code>repeated string unreachable = 3;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the unreachable at the given index.
   */
  com.google.protobuf.ByteString getUnreachableBytes(int index);
}
