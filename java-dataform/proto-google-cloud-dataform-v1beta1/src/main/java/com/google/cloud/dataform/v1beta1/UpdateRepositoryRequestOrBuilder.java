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

public interface UpdateRepositoryRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.dataform.v1beta1.UpdateRepositoryRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the repository. If left
   * unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the repository. If left
   * unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * Optional. Specifies the fields to be updated in the repository. If left
   * unset, all fields will be updated.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 1 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();

  /**
   *
   *
   * <pre>
   * Required. The repository to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the repository field is set.
   */
  boolean hasRepository();
  /**
   *
   *
   * <pre>
   * Required. The repository to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The repository.
   */
  com.google.cloud.dataform.v1beta1.Repository getRepository();
  /**
   *
   *
   * <pre>
   * Required. The repository to update.
   * </pre>
   *
   * <code>
   * .google.cloud.dataform.v1beta1.Repository repository = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  com.google.cloud.dataform.v1beta1.RepositoryOrBuilder getRepositoryOrBuilder();
}
