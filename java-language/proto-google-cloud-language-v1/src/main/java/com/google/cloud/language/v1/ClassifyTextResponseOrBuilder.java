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
// source: google/cloud/language/v1/language_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.language.v1;

public interface ClassifyTextResponseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.language.v1.ClassifyTextResponse)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 1;</code>
   */
  java.util.List<com.google.cloud.language.v1.ClassificationCategory> getCategoriesList();
  /**
   *
   *
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 1;</code>
   */
  com.google.cloud.language.v1.ClassificationCategory getCategories(int index);
  /**
   *
   *
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 1;</code>
   */
  int getCategoriesCount();
  /**
   *
   *
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 1;</code>
   */
  java.util.List<? extends com.google.cloud.language.v1.ClassificationCategoryOrBuilder>
      getCategoriesOrBuilderList();
  /**
   *
   *
   * <pre>
   * Categories representing the input document.
   * </pre>
   *
   * <code>repeated .google.cloud.language.v1.ClassificationCategory categories = 1;</code>
   */
  com.google.cloud.language.v1.ClassificationCategoryOrBuilder getCategoriesOrBuilder(int index);
}
