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
// source: google/cloud/aiplatform/v1/featurestore_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

public interface SearchFeaturesResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1.SearchFeaturesResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The Features matching the request.
   *
   * Fields returned:
   *
   *  * `name`
   *  * `description`
   *  * `labels`
   *  * `create_time`
   *  * `update_time`
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Feature features = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1.Feature> getFeaturesList();
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   *
   * Fields returned:
   *
   *  * `name`
   *  * `description`
   *  * `labels`
   *  * `create_time`
   *  * `update_time`
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Feature features = 1;</code>
   */
  com.google.cloud.aiplatform.v1.Feature getFeatures(int index);
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   *
   * Fields returned:
   *
   *  * `name`
   *  * `description`
   *  * `labels`
   *  * `create_time`
   *  * `update_time`
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Feature features = 1;</code>
   */
  int getFeaturesCount();
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   *
   * Fields returned:
   *
   *  * `name`
   *  * `description`
   *  * `labels`
   *  * `create_time`
   *  * `update_time`
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Feature features = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1.FeatureOrBuilder>
      getFeaturesOrBuilderList();
  /**
   *
   *
   * <pre>
   * The Features matching the request.
   *
   * Fields returned:
   *
   *  * `name`
   *  * `description`
   *  * `labels`
   *  * `create_time`
   *  * `update_time`
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1.Feature features = 1;</code>
   */
  com.google.cloud.aiplatform.v1.FeatureOrBuilder getFeaturesOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A token, which can be sent as
   * [SearchFeaturesRequest.page_token][google.cloud.aiplatform.v1.SearchFeaturesRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
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
   * A token, which can be sent as
   * [SearchFeaturesRequest.page_token][google.cloud.aiplatform.v1.SearchFeaturesRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  com.google.protobuf.ByteString getNextPageTokenBytes();
}
