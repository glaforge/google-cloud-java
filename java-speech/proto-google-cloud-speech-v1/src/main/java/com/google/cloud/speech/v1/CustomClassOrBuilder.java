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
// source: google/cloud/speech/v1/resource.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.speech.v1;

public interface CustomClassOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.speech.v1.CustomClass)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The resource name of the custom class.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * The resource name of the custom class.
   * </pre>
   *
   * <code>string name = 1;</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * If this custom class is a resource, the custom_class_id is the resource id
   * of the CustomClass. Case sensitive.
   * </pre>
   *
   * <code>string custom_class_id = 2;</code>
   *
   * @return The customClassId.
   */
  java.lang.String getCustomClassId();
  /**
   *
   *
   * <pre>
   * If this custom class is a resource, the custom_class_id is the resource id
   * of the CustomClass. Case sensitive.
   * </pre>
   *
   * <code>string custom_class_id = 2;</code>
   *
   * @return The bytes for customClassId.
   */
  com.google.protobuf.ByteString getCustomClassIdBytes();

  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass.ClassItem items = 3;</code>
   */
  java.util.List<com.google.cloud.speech.v1.CustomClass.ClassItem> getItemsList();
  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass.ClassItem items = 3;</code>
   */
  com.google.cloud.speech.v1.CustomClass.ClassItem getItems(int index);
  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass.ClassItem items = 3;</code>
   */
  int getItemsCount();
  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass.ClassItem items = 3;</code>
   */
  java.util.List<? extends com.google.cloud.speech.v1.CustomClass.ClassItemOrBuilder>
      getItemsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A collection of class items.
   * </pre>
   *
   * <code>repeated .google.cloud.speech.v1.CustomClass.ClassItem items = 3;</code>
   */
  com.google.cloud.speech.v1.CustomClass.ClassItemOrBuilder getItemsOrBuilder(int index);
}
