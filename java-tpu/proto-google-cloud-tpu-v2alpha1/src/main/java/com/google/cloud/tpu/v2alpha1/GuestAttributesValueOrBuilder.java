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
// source: google/cloud/tpu/v2alpha1/cloud_tpu.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.tpu.v2alpha1;

public interface GuestAttributesValueOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.tpu.v2alpha1.GuestAttributesValue)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributesEntry items = 1;</code>
   */
  java.util.List<com.google.cloud.tpu.v2alpha1.GuestAttributesEntry> getItemsList();
  /**
   *
   *
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributesEntry items = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.GuestAttributesEntry getItems(int index);
  /**
   *
   *
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributesEntry items = 1;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributesEntry items = 1;</code>
   */
  java.util.List<? extends com.google.cloud.tpu.v2alpha1.GuestAttributesEntryOrBuilder>
      getItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The list of guest attributes entries.
   * </pre>
   *
   * <code>repeated .google.cloud.tpu.v2alpha1.GuestAttributesEntry items = 1;</code>
   */
  com.google.cloud.tpu.v2alpha1.GuestAttributesEntryOrBuilder getItemsOrBuilder(int index);
}
