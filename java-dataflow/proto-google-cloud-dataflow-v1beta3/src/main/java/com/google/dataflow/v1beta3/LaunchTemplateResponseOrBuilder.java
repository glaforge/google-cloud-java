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
// source: google/dataflow/v1beta3/templates.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

public interface LaunchTemplateResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.LaunchTemplateResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   *
   * @return Whether the job field is set.
   */
  boolean hasJob();
  /**
   *
   *
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   *
   * @return The job.
   */
  com.google.dataflow.v1beta3.Job getJob();
  /**
   *
   *
   * <pre>
   * The job that was launched, if the request was not a dry run and
   * the job was successfully launched.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.Job job = 1;</code>
   */
  com.google.dataflow.v1beta3.JobOrBuilder getJobOrBuilder();
}
