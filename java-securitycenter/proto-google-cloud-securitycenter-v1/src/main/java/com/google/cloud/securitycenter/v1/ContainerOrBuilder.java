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
// source: google/cloud/securitycenter/v1/container.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1;

public interface ContainerOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1.Container)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Name of the container.
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
   * Name of the container.
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
   * Container image URI provided when configuring a pod or container. This
   * string can identify a container image version using mutable tags.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The uri.
   */
  java.lang.String getUri();
  /**
   *
   *
   * <pre>
   * Container image URI provided when configuring a pod or container. This
   * string can identify a container image version using mutable tags.
   * </pre>
   *
   * <code>string uri = 2;</code>
   *
   * @return The bytes for uri.
   */
  com.google.protobuf.ByteString getUriBytes();

  /**
   *
   *
   * <pre>
   * Optional container image ID, if provided by the container runtime. Uniquely
   * identifies the container image launched using a container image digest.
   * </pre>
   *
   * <code>string image_id = 3;</code>
   *
   * @return The imageId.
   */
  java.lang.String getImageId();
  /**
   *
   *
   * <pre>
   * Optional container image ID, if provided by the container runtime. Uniquely
   * identifies the container image launched using a container image digest.
   * </pre>
   *
   * <code>string image_id = 3;</code>
   *
   * @return The bytes for imageId.
   */
  com.google.protobuf.ByteString getImageIdBytes();

  /**
   *
   *
   * <pre>
   * Container labels, as provided by the container runtime.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Label labels = 4;</code>
   */
  java.util.List<com.google.cloud.securitycenter.v1.Label> getLabelsList();
  /**
   *
   *
   * <pre>
   * Container labels, as provided by the container runtime.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Label labels = 4;</code>
   */
  com.google.cloud.securitycenter.v1.Label getLabels(int index);
  /**
   *
   *
   * <pre>
   * Container labels, as provided by the container runtime.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Label labels = 4;</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Container labels, as provided by the container runtime.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Label labels = 4;</code>
   */
  java.util.List<? extends com.google.cloud.securitycenter.v1.LabelOrBuilder>
      getLabelsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Container labels, as provided by the container runtime.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.v1.Label labels = 4;</code>
   */
  com.google.cloud.securitycenter.v1.LabelOrBuilder getLabelsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * The time that the container was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * The time that the container was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * The time that the container was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();
}
