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
// source: google/api/apikeys/v2/apikeys.proto

// Protobuf Java Version: 3.25.3
package com.google.api.apikeys.v2;

public interface UpdateKeyRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.api.apikeys.v2.UpdateKeyRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. Set the `name` field to the resource name of the API key to be
   * updated. You can update only the `display_name`, `restrictions`, and
   * `annotations` fields.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Key key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return Whether the key field is set.
   */
  boolean hasKey();
  /**
   *
   *
   * <pre>
   * Required. Set the `name` field to the resource name of the API key to be
   * updated. You can update only the `display_name`, `restrictions`, and
   * `annotations` fields.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Key key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The key.
   */
  com.google.api.apikeys.v2.Key getKey();
  /**
   *
   *
   * <pre>
   * Required. Set the `name` field to the resource name of the API key to be
   * updated. You can update only the `display_name`, `restrictions`, and
   * `annotations` fields.
   * </pre>
   *
   * <code>.google.api.apikeys.v2.Key key = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   */
  com.google.api.apikeys.v2.KeyOrBuilder getKeyOrBuilder();

  /**
   *
   *
   * <pre>
   * The field mask specifies which fields to be updated as part of this
   * request. All other fields are ignored.
   * Mutable fields are: `display_name`, `restrictions`, and `annotations`.
   * If an update mask is not provided, the service treats it as an implied mask
   * equivalent to all allowed fields that are set on the wire. If the field
   * mask has a special value "*", the service treats it equivalent to replace
   * all allowed mutable fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return Whether the updateMask field is set.
   */
  boolean hasUpdateMask();
  /**
   *
   *
   * <pre>
   * The field mask specifies which fields to be updated as part of this
   * request. All other fields are ignored.
   * Mutable fields are: `display_name`, `restrictions`, and `annotations`.
   * If an update mask is not provided, the service treats it as an implied mask
   * equivalent to all allowed fields that are set on the wire. If the field
   * mask has a special value "*", the service treats it equivalent to replace
   * all allowed mutable fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   *
   * @return The updateMask.
   */
  com.google.protobuf.FieldMask getUpdateMask();
  /**
   *
   *
   * <pre>
   * The field mask specifies which fields to be updated as part of this
   * request. All other fields are ignored.
   * Mutable fields are: `display_name`, `restrictions`, and `annotations`.
   * If an update mask is not provided, the service treats it as an implied mask
   * equivalent to all allowed fields that are set on the wire. If the field
   * mask has a special value "*", the service treats it equivalent to replace
   * all allowed mutable fields.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2;</code>
   */
  com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder();
}
