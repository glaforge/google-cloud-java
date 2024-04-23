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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

public interface RagContextsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.aiplatform.v1beta1.RagContexts)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * All its contexts.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagContexts.Context contexts = 1;</code>
   */
  java.util.List<com.google.cloud.aiplatform.v1beta1.RagContexts.Context> getContextsList();
  /**
   *
   *
   * <pre>
   * All its contexts.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagContexts.Context contexts = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.RagContexts.Context getContexts(int index);
  /**
   *
   *
   * <pre>
   * All its contexts.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagContexts.Context contexts = 1;</code>
   */
  int getContextsCount();
  /**
   *
   *
   * <pre>
   * All its contexts.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagContexts.Context contexts = 1;</code>
   */
  java.util.List<? extends com.google.cloud.aiplatform.v1beta1.RagContexts.ContextOrBuilder>
      getContextsOrBuilderList();
  /**
   *
   *
   * <pre>
   * All its contexts.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.RagContexts.Context contexts = 1;</code>
   */
  com.google.cloud.aiplatform.v1beta1.RagContexts.ContextOrBuilder getContextsOrBuilder(int index);
}
