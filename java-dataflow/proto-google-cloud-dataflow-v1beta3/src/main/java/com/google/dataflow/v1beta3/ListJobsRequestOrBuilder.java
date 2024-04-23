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
// source: google/dataflow/v1beta3/jobs.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

public interface ListJobsRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.dataflow.v1beta3.ListJobsRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The kind of filter to use.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ListJobsRequest.Filter filter = 5;</code>
   *
   * @return The enum numeric value on the wire for filter.
   */
  int getFilterValue();
  /**
   *
   *
   * <pre>
   * The kind of filter to use.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.ListJobsRequest.Filter filter = 5;</code>
   *
   * @return The filter.
   */
  com.google.dataflow.v1beta3.ListJobsRequest.Filter getFilter();

  /**
   *
   *
   * <pre>
   * The project which owns the jobs.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  java.lang.String getProjectId();
  /**
   *
   *
   * <pre>
   * The project which owns the jobs.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  com.google.protobuf.ByteString getProjectIdBytes();

  /**
   *
   *
   * <pre>
   * Deprecated. ListJobs always returns summaries now.
   * Use GetJob for other JobViews.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobView view = 2 [deprecated = true];</code>
   *
   * @deprecated google.dataflow.v1beta3.ListJobsRequest.view is deprecated. See
   *     google/dataflow/v1beta3/jobs.proto;l=849
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Deprecated
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Deprecated. ListJobs always returns summaries now.
   * Use GetJob for other JobViews.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobView view = 2 [deprecated = true];</code>
   *
   * @deprecated google.dataflow.v1beta3.ListJobsRequest.view is deprecated. See
   *     google/dataflow/v1beta3/jobs.proto;l=849
   * @return The view.
   */
  @java.lang.Deprecated
  com.google.dataflow.v1beta3.JobView getView();

  /**
   *
   *
   * <pre>
   * If there are many jobs, limit response to at most this many.
   * The actual number of jobs returned will be the lesser of max_responses
   * and an unspecified server-defined limit.
   * </pre>
   *
   * <code>int32 page_size = 3;</code>
   *
   * @return The pageSize.
   */
  int getPageSize();

  /**
   *
   *
   * <pre>
   * Set this to the 'next_page_token' field of a previous response
   * to request additional results in a long list.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The pageToken.
   */
  java.lang.String getPageToken();
  /**
   *
   *
   * <pre>
   * Set this to the 'next_page_token' field of a previous response
   * to request additional results in a long list.
   * </pre>
   *
   * <code>string page_token = 4;</code>
   *
   * @return The bytes for pageToken.
   */
  com.google.protobuf.ByteString getPageTokenBytes();

  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 17;</code>
   *
   * @return The location.
   */
  java.lang.String getLocation();
  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 17;</code>
   *
   * @return The bytes for location.
   */
  com.google.protobuf.ByteString getLocationBytes();
}
