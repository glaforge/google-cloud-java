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
// source: google/cloud/datacatalog/lineage/v1/lineage.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.lineage.v1;

public interface ProcessOpenLineageRunEventResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.datacatalog.lineage.v1.ProcessOpenLineageRunEventResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Created process name.
   * Format: `projects/{project}/locations/{location}/processes/{process}`.
   * </pre>
   *
   * <code>string process = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The process.
   */
  java.lang.String getProcess();
  /**
   *
   *
   * <pre>
   * Created process name.
   * Format: `projects/{project}/locations/{location}/processes/{process}`.
   * </pre>
   *
   * <code>string process = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for process.
   */
  com.google.protobuf.ByteString getProcessBytes();

  /**
   *
   *
   * <pre>
   * Created run name.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}`.
   * </pre>
   *
   * <code>string run = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The run.
   */
  java.lang.String getRun();
  /**
   *
   *
   * <pre>
   * Created run name.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}`.
   * </pre>
   *
   * <code>string run = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for run.
   */
  com.google.protobuf.ByteString getRunBytes();

  /**
   *
   *
   * <pre>
   * Created lineage event names.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}/lineageEvents/{lineage_event}`.
   * </pre>
   *
   * <code>repeated string lineage_events = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return A list containing the lineageEvents.
   */
  java.util.List<java.lang.String> getLineageEventsList();
  /**
   *
   *
   * <pre>
   * Created lineage event names.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}/lineageEvents/{lineage_event}`.
   * </pre>
   *
   * <code>repeated string lineage_events = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The count of lineageEvents.
   */
  int getLineageEventsCount();
  /**
   *
   *
   * <pre>
   * Created lineage event names.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}/lineageEvents/{lineage_event}`.
   * </pre>
   *
   * <code>repeated string lineage_events = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the element to return.
   * @return The lineageEvents at the given index.
   */
  java.lang.String getLineageEvents(int index);
  /**
   *
   *
   * <pre>
   * Created lineage event names.
   * Format:
   * `projects/{project}/locations/{location}/processes/{process}/runs/{run}/lineageEvents/{lineage_event}`.
   * </pre>
   *
   * <code>repeated string lineage_events = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the lineageEvents at the given index.
   */
  com.google.protobuf.ByteString getLineageEventsBytes(int index);
}
