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
// source: google/cloud/apphub/v1/apphub_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.apphub.v1;

public interface LookupServiceProjectAttachmentResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.apphub.v1.LookupServiceProjectAttachmentResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Service project attachment for a project if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.ServiceProjectAttachment service_project_attachment = 1;</code>
   *
   * @return Whether the serviceProjectAttachment field is set.
   */
  boolean hasServiceProjectAttachment();
  /**
   *
   *
   * <pre>
   * Service project attachment for a project if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.ServiceProjectAttachment service_project_attachment = 1;</code>
   *
   * @return The serviceProjectAttachment.
   */
  com.google.cloud.apphub.v1.ServiceProjectAttachment getServiceProjectAttachment();
  /**
   *
   *
   * <pre>
   * Service project attachment for a project if exists, empty otherwise.
   * </pre>
   *
   * <code>.google.cloud.apphub.v1.ServiceProjectAttachment service_project_attachment = 1;</code>
   */
  com.google.cloud.apphub.v1.ServiceProjectAttachmentOrBuilder
      getServiceProjectAttachmentOrBuilder();
}
