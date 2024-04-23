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
// source: google/cloud/contentwarehouse/v1/document_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.contentwarehouse.v1;

public interface QAResultOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.contentwarehouse.v1.QAResult)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Highlighted sections in the snippet.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.QAResult.Highlight highlights = 1;</code>
   */
  java.util.List<com.google.cloud.contentwarehouse.v1.QAResult.Highlight> getHighlightsList();
  /**
   *
   *
   * <pre>
   * Highlighted sections in the snippet.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.QAResult.Highlight highlights = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.QAResult.Highlight getHighlights(int index);
  /**
   *
   *
   * <pre>
   * Highlighted sections in the snippet.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.QAResult.Highlight highlights = 1;</code>
   */
  int getHighlightsCount();
  /**
   *
   *
   * <pre>
   * Highlighted sections in the snippet.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.QAResult.Highlight highlights = 1;</code>
   */
  java.util.List<? extends com.google.cloud.contentwarehouse.v1.QAResult.HighlightOrBuilder>
      getHighlightsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Highlighted sections in the snippet.
   * </pre>
   *
   * <code>repeated .google.cloud.contentwarehouse.v1.QAResult.Highlight highlights = 1;</code>
   */
  com.google.cloud.contentwarehouse.v1.QAResult.HighlightOrBuilder getHighlightsOrBuilder(
      int index);

  /**
   *
   *
   * <pre>
   * The calibrated confidence score for this document, in the range
   * [0., 1.]. This represents the confidence level for whether the returned
   * document and snippet answers the user's query.
   * </pre>
   *
   * <code>float confidence_score = 2;</code>
   *
   * @return The confidenceScore.
   */
  float getConfidenceScore();
}
