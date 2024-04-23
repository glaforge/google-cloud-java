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
// source: google/cloud/discoveryengine/v1beta/site_search_engine_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface BatchCreateTargetSitesRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.BatchCreateTargetSitesRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The parent resource shared by all TargetSites being created.
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/siteSearchEngine`.
   * The parent field in the CreateBookRequest messages must either be empty or
   * match this field.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Required. The parent resource shared by all TargetSites being created.
   * `projects/{project}/locations/{location}/collections/{collection}/dataStores/{data_store}/siteSearchEngine`.
   * The parent field in the CreateBookRequest messages must either be empty or
   * match this field.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();

  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to create.
   * A maximum of 20 TargetSites can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<com.google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest> getRequestsList();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to create.
   * A maximum of 20 TargetSites can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest getRequests(int index);
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to create.
   * A maximum of 20 TargetSites can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  int getRequestsCount();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to create.
   * A maximum of 20 TargetSites can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  java.util.List<? extends com.google.cloud.discoveryengine.v1beta.CreateTargetSiteRequestOrBuilder>
      getRequestsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Required. The request message specifying the resources to create.
   * A maximum of 20 TargetSites can be created in a batch.
   * </pre>
   *
   * <code>
   * repeated .google.cloud.discoveryengine.v1beta.CreateTargetSiteRequest requests = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.discoveryengine.v1beta.CreateTargetSiteRequestOrBuilder getRequestsOrBuilder(
      int index);
}
