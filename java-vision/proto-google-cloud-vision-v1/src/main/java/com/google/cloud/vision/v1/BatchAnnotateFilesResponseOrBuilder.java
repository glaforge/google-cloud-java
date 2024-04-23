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
// source: google/cloud/vision/v1/image_annotator.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vision.v1;

public interface BatchAnnotateFilesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.vision.v1.BatchAnnotateFilesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of file annotation responses, each response corresponding to each
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileResponse responses = 1;</code>
   */
  java.util.List<com.google.cloud.vision.v1.AnnotateFileResponse> getResponsesList();
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, each response corresponding to each
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileResponse responses = 1;</code>
   */
  com.google.cloud.vision.v1.AnnotateFileResponse getResponses(int index);
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, each response corresponding to each
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileResponse responses = 1;</code>
   */
  int getResponsesCount();
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, each response corresponding to each
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileResponse responses = 1;</code>
   */
  java.util.List<? extends com.google.cloud.vision.v1.AnnotateFileResponseOrBuilder>
      getResponsesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of file annotation responses, each response corresponding to each
   * AnnotateFileRequest in BatchAnnotateFilesRequest.
   * </pre>
   *
   * <code>repeated .google.cloud.vision.v1.AnnotateFileResponse responses = 1;</code>
   */
  com.google.cloud.vision.v1.AnnotateFileResponseOrBuilder getResponsesOrBuilder(int index);
}
