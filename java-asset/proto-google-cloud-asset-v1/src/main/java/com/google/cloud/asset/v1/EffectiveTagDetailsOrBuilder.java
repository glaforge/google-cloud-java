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
// source: google/cloud/asset/v1/assets.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.asset.v1;

public interface EffectiveTagDetailsOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.asset.v1.EffectiveTagDetails)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The [full resource
   * name](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of the ancestor from which an [effective_tag][] is inherited, according to
   * [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>optional string attached_resource = 1;</code>
   *
   * @return Whether the attachedResource field is set.
   */
  boolean hasAttachedResource();
  /**
   *
   *
   * <pre>
   * The [full resource
   * name](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of the ancestor from which an [effective_tag][] is inherited, according to
   * [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>optional string attached_resource = 1;</code>
   *
   * @return The attachedResource.
   */
  java.lang.String getAttachedResource();
  /**
   *
   *
   * <pre>
   * The [full resource
   * name](https://cloud.google.com/asset-inventory/docs/resource-name-format)
   * of the ancestor from which an [effective_tag][] is inherited, according to
   * [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>optional string attached_resource = 1;</code>
   *
   * @return The bytes for attachedResource.
   */
  com.google.protobuf.ByteString getAttachedResourceBytes();

  /**
   *
   *
   * <pre>
   * The effective tags inherited from the
   * [attached_resource][google.cloud.asset.v1.EffectiveTagDetails.attached_resource].
   * Note that tags with the same key but different values may attach to
   * resources at a different hierarchy levels. The lower hierarchy tag value
   * will overwrite the higher hierarchy tag value of the same tag key. In this
   * case, the tag value at the higher hierarchy level will be removed. For more
   * information, see [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Tag effective_tags = 2;</code>
   */
  java.util.List<com.google.cloud.asset.v1.Tag> getEffectiveTagsList();
  /**
   *
   *
   * <pre>
   * The effective tags inherited from the
   * [attached_resource][google.cloud.asset.v1.EffectiveTagDetails.attached_resource].
   * Note that tags with the same key but different values may attach to
   * resources at a different hierarchy levels. The lower hierarchy tag value
   * will overwrite the higher hierarchy tag value of the same tag key. In this
   * case, the tag value at the higher hierarchy level will be removed. For more
   * information, see [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Tag effective_tags = 2;</code>
   */
  com.google.cloud.asset.v1.Tag getEffectiveTags(int index);
  /**
   *
   *
   * <pre>
   * The effective tags inherited from the
   * [attached_resource][google.cloud.asset.v1.EffectiveTagDetails.attached_resource].
   * Note that tags with the same key but different values may attach to
   * resources at a different hierarchy levels. The lower hierarchy tag value
   * will overwrite the higher hierarchy tag value of the same tag key. In this
   * case, the tag value at the higher hierarchy level will be removed. For more
   * information, see [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Tag effective_tags = 2;</code>
   */
  int getEffectiveTagsCount();
  /**
   *
   *
   * <pre>
   * The effective tags inherited from the
   * [attached_resource][google.cloud.asset.v1.EffectiveTagDetails.attached_resource].
   * Note that tags with the same key but different values may attach to
   * resources at a different hierarchy levels. The lower hierarchy tag value
   * will overwrite the higher hierarchy tag value of the same tag key. In this
   * case, the tag value at the higher hierarchy level will be removed. For more
   * information, see [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Tag effective_tags = 2;</code>
   */
  java.util.List<? extends com.google.cloud.asset.v1.TagOrBuilder> getEffectiveTagsOrBuilderList();
  /**
   *
   *
   * <pre>
   * The effective tags inherited from the
   * [attached_resource][google.cloud.asset.v1.EffectiveTagDetails.attached_resource].
   * Note that tags with the same key but different values may attach to
   * resources at a different hierarchy levels. The lower hierarchy tag value
   * will overwrite the higher hierarchy tag value of the same tag key. In this
   * case, the tag value at the higher hierarchy level will be removed. For more
   * information, see [tag
   * inheritance](https://cloud.google.com/resource-manager/docs/tags/tags-overview#inheritance).
   * </pre>
   *
   * <code>repeated .google.cloud.asset.v1.Tag effective_tags = 2;</code>
   */
  com.google.cloud.asset.v1.TagOrBuilder getEffectiveTagsOrBuilder(int index);
}
