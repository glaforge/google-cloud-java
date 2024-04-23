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
// source: google/shopping/css/v1/accounts.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.css.v1;

public interface GetAccountRequestOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.shopping.css.v1.GetAccountRequest)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Required. The name of the managed CSS/MC account.
   * Format: accounts/{account}
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
   * Required. The name of the managed CSS/MC account.
   * Format: accounts/{account}
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
   * Optional. Only required when retrieving MC account information.
   * The CSS domain that is the parent resource of the MC account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * optional string parent = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return Whether the parent field is set.
   */
  boolean hasParent();
  /**
   *
   *
   * <pre>
   * Optional. Only required when retrieving MC account information.
   * The CSS domain that is the parent resource of the MC account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * optional string parent = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  java.lang.String getParent();
  /**
   *
   *
   * <pre>
   * Optional. Only required when retrieving MC account information.
   * The CSS domain that is the parent resource of the MC account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * optional string parent = 2 [(.google.api.field_behavior) = OPTIONAL, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  com.google.protobuf.ByteString getParentBytes();
}
