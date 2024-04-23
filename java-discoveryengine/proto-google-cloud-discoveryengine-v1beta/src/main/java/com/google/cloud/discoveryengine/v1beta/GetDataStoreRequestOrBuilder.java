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
// source: google/cloud/discoveryengine/v1beta/data_store_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

public interface GetDataStoreRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.discoveryengine.v1beta.GetDataStoreRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore], such as
   * `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}`.
   *
   * If the caller does not have permission to access the
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the requested [DataStore][google.cloud.discoveryengine.v1beta.DataStore]
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Required. Full resource name of
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore], such as
   * `projects/{project}/locations/{location}/collections/{collection_id}/dataStores/{data_store_id}`.
   *
   * If the caller does not have permission to access the
   * [DataStore][google.cloud.discoveryengine.v1beta.DataStore], regardless of
   * whether or not it exists, a PERMISSION_DENIED error is returned.
   *
   * If the requested [DataStore][google.cloud.discoveryengine.v1beta.DataStore]
   * does not exist, a NOT_FOUND error is returned.
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();
}
