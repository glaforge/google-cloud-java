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
// source: google/cloud/gkehub/v1alpha/servicemesh/servicemesh.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.servicemesh.v1alpha;

public interface AnalysisMessageBaseOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Represents the specific type of a message.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Type type = 1;</code>
   *
   * @return Whether the type field is set.
   */
  boolean hasType();
  /**
   *
   *
   * <pre>
   * Represents the specific type of a message.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Type type = 1;</code>
   *
   * @return The type.
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Type getType();
  /**
   *
   *
   * <pre>
   * Represents the specific type of a message.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Type type = 1;</code>
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.TypeOrBuilder getTypeOrBuilder();

  /**
   *
   *
   * <pre>
   * Represents how severe a message is.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Level level = 2;</code>
   *
   * @return The enum numeric value on the wire for level.
   */
  int getLevelValue();
  /**
   *
   *
   * <pre>
   * Represents how severe a message is.
   * </pre>
   *
   * <code>.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Level level = 2;</code>
   *
   * @return The level.
   */
  com.google.cloud.gkehub.servicemesh.v1alpha.AnalysisMessageBase.Level getLevel();

  /**
   *
   *
   * <pre>
   * A url pointing to the Service Mesh or Istio documentation for this specific
   * error type.
   * </pre>
   *
   * <code>string documentation_url = 3;</code>
   *
   * @return The documentationUrl.
   */
  java.lang.String getDocumentationUrl();
  /**
   *
   *
   * <pre>
   * A url pointing to the Service Mesh or Istio documentation for this specific
   * error type.
   * </pre>
   *
   * <code>string documentation_url = 3;</code>
   *
   * @return The bytes for documentationUrl.
   */
  com.google.protobuf.ByteString getDocumentationUrlBytes();
}
