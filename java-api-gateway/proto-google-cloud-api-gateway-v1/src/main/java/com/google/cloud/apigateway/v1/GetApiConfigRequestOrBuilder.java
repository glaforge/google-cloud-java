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
// source: google/cloud/apigateway/v1/apigateway.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.apigateway.v1;

public interface GetApiConfigRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apigateway.v1.GetApiConfigRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Resource name of the form:
   * `projects/&#42;&#47;locations/global/apis/&#42;&#47;configs/&#42;`
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
   * Required. Resource name of the form:
   * `projects/&#42;&#47;locations/global/apis/&#42;&#47;configs/&#42;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Specifies which fields of the API Config are returned in the response.
   * Defaults to `BASIC` view.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.GetApiConfigRequest.ConfigView view = 3;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  int getViewValue();
  /**
   *
   *
   * <pre>
   * Specifies which fields of the API Config are returned in the response.
   * Defaults to `BASIC` view.
   * </pre>
   *
   * <code>.google.cloud.apigateway.v1.GetApiConfigRequest.ConfigView view = 3;</code>
   *
   * @return The view.
   */
  com.google.cloud.apigateway.v1.GetApiConfigRequest.ConfigView getView();
}
