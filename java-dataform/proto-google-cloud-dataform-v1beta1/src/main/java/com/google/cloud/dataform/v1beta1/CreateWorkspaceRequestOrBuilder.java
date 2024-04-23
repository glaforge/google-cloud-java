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
// source: google/cloud/dataform/v1beta1/dataform.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dataform.v1beta1;

public interface CreateWorkspaceRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.CreateWorkspaceRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The repository in which to create the workspace. Must be in the
   * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
   * Required. The repository in which to create the workspace. Must be in the
   * format `projects/&#42;&#47;locations/&#42;&#47;repositories/&#42;`.
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
   * Required. The workspace to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Workspace workspace = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the workspace field is set.
   */
  boolean hasWorkspace();
  /**
   *
   *
   * <pre>
   * Required. The workspace to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Workspace workspace = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The workspace.
   */
  com.google.cloud.dataform.v1beta1.Workspace getWorkspace();
  /**
   *
   *
   * <pre>
   * Required. The workspace to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Workspace workspace = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.WorkspaceOrBuilder getWorkspaceOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The ID to use for the workspace, which will become the final
   * component of the workspace's resource name.
   * </pre>
   *
   * <code>string workspace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The workspaceId.
   */
  java.lang.String getWorkspaceId();
  /**
   *
   *
   * <pre>
   * Required. The ID to use for the workspace, which will become the final
   * component of the workspace's resource name.
   * </pre>
   *
   * <code>string workspace_id = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for workspaceId.
   */
  com.google.protobuf.ByteString getWorkspaceIdBytes();
}
