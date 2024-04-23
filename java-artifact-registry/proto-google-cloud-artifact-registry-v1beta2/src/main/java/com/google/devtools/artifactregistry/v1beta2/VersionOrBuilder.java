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
// source: google/devtools/artifactregistry/v1beta2/version.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.artifactregistry.v1beta2;

public interface VersionOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.devtools.artifactregistry.v1beta2.Version)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The name of the version, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1".
   * If the package or version ID parts contain slashes, the slashes are
   * escaped.
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
   * The name of the version, for example:
   * "projects/p1/locations/us-central1/repositories/repo1/packages/pkg1/versions/art1".
   * If the package or version ID parts contain slashes, the slashes are
   * escaped.
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
   * Optional. Description of the version, as specified in its metadata.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the version, as specified in its metadata.
   * </pre>
   *
   * <code>string description = 3;</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * The time when the version was created.
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
   * The time when the version was created.
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
   * The time when the version was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 5;</code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * The time when the version was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the version was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * The time when the version was last updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 6;</code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  java.util.List<com.google.devtools.artifactregistry.v1beta2.Tag> getRelatedTagsList();
  /**
   *
   *
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.Tag getRelatedTags(int index);
  /**
   *
   *
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  int getRelatedTagsCount();
  /**
   *
   *
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  java.util.List<? extends com.google.devtools.artifactregistry.v1beta2.TagOrBuilder>
      getRelatedTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * Output only. A list of related tags. Will contain up to 100 tags that
   * reference this version.
   * </pre>
   *
   * <code>repeated .google.devtools.artifactregistry.v1beta2.Tag related_tags = 7;</code>
   */
  com.google.devtools.artifactregistry.v1beta2.TagOrBuilder getRelatedTagsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * Output only. Repository-specific Metadata stored against this version.
   * The fields returned are defined by the underlying repository-specific
   * resource. Currently, the only resource in use is
   * [DockerImage][google.devtools.artifactregistry.v1.DockerImage]
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return Whether the metadata field is set.
   */
  boolean hasMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Repository-specific Metadata stored against this version.
   * The fields returned are defined by the underlying repository-specific
   * resource. Currently, the only resource in use is
   * [DockerImage][google.devtools.artifactregistry.v1.DockerImage]
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The metadata.
   */
  com.google.protobuf.Struct getMetadata();
  /**
   *
   *
   * <pre>
   * Output only. Repository-specific Metadata stored against this version.
   * The fields returned are defined by the underlying repository-specific
   * resource. Currently, the only resource in use is
   * [DockerImage][google.devtools.artifactregistry.v1.DockerImage]
   * </pre>
   *
   * <code>.google.protobuf.Struct metadata = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   */
  com.google.protobuf.StructOrBuilder getMetadataOrBuilder();
}
