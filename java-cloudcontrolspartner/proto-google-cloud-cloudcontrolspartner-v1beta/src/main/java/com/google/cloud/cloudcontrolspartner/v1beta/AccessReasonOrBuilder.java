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
// source: google/cloud/cloudcontrolspartner/v1beta/access_approval_requests.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.cloudcontrolspartner.v1beta;

public interface AccessReasonOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.cloudcontrolspartner.v1beta.AccessReason)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.AccessReason.Type type = 1;</code>
   *
   * @return The enum numeric value on the wire for type.
   */
  int getTypeValue();
  /**
   *
   *
   * <pre>
   * Type of access justification.
   * </pre>
   *
   * <code>.google.cloud.cloudcontrolspartner.v1beta.AccessReason.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.cloudcontrolspartner.v1beta.AccessReason.Type getType();

  /**
   *
   *
   * <pre>
   * More detail about certain reason types. See comments for each type above.
   * </pre>
   *
   * <code>string detail = 2;</code>
   *
   * @return The detail.
   */
  java.lang.String getDetail();
  /**
   *
   *
   * <pre>
   * More detail about certain reason types. See comments for each type above.
   * </pre>
   *
   * <code>string detail = 2;</code>
   *
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString getDetailBytes();
}
