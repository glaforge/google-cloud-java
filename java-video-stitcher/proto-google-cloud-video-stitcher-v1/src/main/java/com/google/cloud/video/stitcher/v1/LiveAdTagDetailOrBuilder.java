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
// source: google/cloud/video/stitcher/v1/ad_tag_details.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.video.stitcher.v1;

public interface LiveAdTagDetailOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.video.stitcher.v1.LiveAdTagDetail)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name in the form of
   * `projects/{project}/locations/{location}/liveSessions/{live_session}/liveAdTagDetails/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name in the form of
   * `projects/{project}/locations/{location}/liveSessions/{live_session}/liveAdTagDetails/{id}`.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * A list of ad requests.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  java.util.List<com.google.cloud.video.stitcher.v1.AdRequest> getAdRequestsList();
  /**
   *
   *
   * <pre>
   * A list of ad requests.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  com.google.cloud.video.stitcher.v1.AdRequest getAdRequests(int index);
  /**
   *
   *
   * <pre>
   * A list of ad requests.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  int getAdRequestsCount();
  /**
   *
   *
   * <pre>
   * A list of ad requests.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  java.util.List<? extends com.google.cloud.video.stitcher.v1.AdRequestOrBuilder>
      getAdRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A list of ad requests.
   * </pre>
   *
   * <code>repeated .google.cloud.video.stitcher.v1.AdRequest ad_requests = 2;</code>
   */
  com.google.cloud.video.stitcher.v1.AdRequestOrBuilder getAdRequestsOrBuilder(int index);
}
