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
// source: google/api/servicecontrol/v1/check_error.proto

// Protobuf Java Version: 3.25.3
package com.google.api.servicecontrol.v1;

public interface CheckErrorOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.servicecontrol.v1.CheckError)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The error code.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.CheckError.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  int getCodeValue();
  /**
   *
   *
   * <pre>
   * The error code.
   * </pre>
   *
   * <code>.google.api.servicecontrol.v1.CheckError.Code code = 1;</code>
   *
   * @return The code.
   */
  com.google.api.servicecontrol.v1.CheckError.Code getCode();

  /**
   *
   *
   * <pre>
   * Subject to whom this error applies. See the specific code enum for more
   * details on this field. For example:
   *
   * - "project:&lt;project-id or project-number&gt;"
   * - "folder:&lt;folder-id&gt;"
   * - "organization:&lt;organization-id&gt;"
   * </pre>
   *
   * <code>string subject = 4;</code>
   *
   * @return The subject.
   */
  java.lang.String getSubject();
  /**
   *
   *
   * <pre>
   * Subject to whom this error applies. See the specific code enum for more
   * details on this field. For example:
   *
   * - "project:&lt;project-id or project-number&gt;"
   * - "folder:&lt;folder-id&gt;"
   * - "organization:&lt;organization-id&gt;"
   * </pre>
   *
   * <code>string subject = 4;</code>
   *
   * @return The bytes for subject.
   */
  com.google.protobuf.ByteString getSubjectBytes();

  /**
   *
   *
   * <pre>
   * Free-form text providing details on the error cause of the error.
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
   * Free-form text providing details on the error cause of the error.
   * </pre>
   *
   * <code>string detail = 2;</code>
   *
   * @return The bytes for detail.
   */
  com.google.protobuf.ByteString getDetailBytes();

  /**
   *
   *
   * <pre>
   * Contains public information about the check error. If available,
   * `status.code` will be non zero and client can propagate it out as public
   * error.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   *
   * @return Whether the status field is set.
   */
  boolean hasStatus();
  /**
   *
   *
   * <pre>
   * Contains public information about the check error. If available,
   * `status.code` will be non zero and client can propagate it out as public
   * error.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   *
   * @return The status.
   */
  com.google.rpc.Status getStatus();
  /**
   *
   *
   * <pre>
   * Contains public information about the check error. If available,
   * `status.code` will be non zero and client can propagate it out as public
   * error.
   * </pre>
   *
   * <code>.google.rpc.Status status = 3;</code>
   */
  com.google.rpc.StatusOrBuilder getStatusOrBuilder();
}
