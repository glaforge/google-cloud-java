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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

public interface CustomTargetTypeOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.deploy.v1.CustomTargetType)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Name of the `CustomTargetType`. Format is
   * `projects/{project}/locations/{location}/customTargetTypes/[a-z][a-z0-9&#92;-]{0,62}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The name.
   */
  java.lang.String getName();
  /**
   *
   *
   * <pre>
   * Optional. Name of the `CustomTargetType`. Format is
   * `projects/{project}/locations/{location}/customTargetTypes/[a-z][a-z0-9&#92;-]{0,62}`.
   * </pre>
   *
   * <code>string name = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for name.
   */
  com.google.protobuf.ByteString getNameBytes();

  /**
   *
   *
   * <pre>
   * Output only. Resource id of the `CustomTargetType`.
   * </pre>
   *
   * <code>string custom_target_type_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The customTargetTypeId.
   */
  java.lang.String getCustomTargetTypeId();
  /**
   *
   *
   * <pre>
   * Output only. Resource id of the `CustomTargetType`.
   * </pre>
   *
   * <code>string custom_target_type_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for customTargetTypeId.
   */
  com.google.protobuf.ByteString getCustomTargetTypeIdBytes();

  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `CustomTargetType`.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The uid.
   */
  java.lang.String getUid();
  /**
   *
   *
   * <pre>
   * Output only. Unique identifier of the `CustomTargetType`.
   * </pre>
   *
   * <code>string uid = 3 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for uid.
   */
  com.google.protobuf.ByteString getUidBytes();

  /**
   *
   *
   * <pre>
   * Optional. Description of the `CustomTargetType`. Max length is 255
   * characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The description.
   */
  java.lang.String getDescription();
  /**
   *
   *
   * <pre>
   * Optional. Description of the `CustomTargetType`. Max length is 255
   * characters.
   * </pre>
   *
   * <code>string description = 4 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for description.
   */
  com.google.protobuf.ByteString getDescriptionBytes();

  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  int getAnnotationsCount();
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  boolean containsAnnotations(java.lang.String key);
  /** Use {@link #getAnnotationsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getAnnotations();
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.util.Map<java.lang.String, java.lang.String> getAnnotationsMap();
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  /* nullable */
  java.lang.String getAnnotationsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. User annotations. These attributes can only be set and used by
   * the user, and not by Cloud Deploy. See
   * https://google.aip.dev/128#annotations for more details such as format and
   * size limitations.
   * </pre>
   *
   * <code>map&lt;string, string&gt; annotations = 5 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  java.lang.String getAnnotationsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  int getLabelsCount();
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  boolean containsLabels(java.lang.String key);
  /** Use {@link #getLabelsMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getLabels();
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getLabelsMap();
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  /* nullable */
  java.lang.String getLabelsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Optional. Labels are attributes that can be set and used by both the
   * user and by Cloud Deploy. Labels must meet the following constraints:
   *
   * * Keys and values can contain only lowercase letters, numeric characters,
   * underscores, and dashes.
   * * All characters must use UTF-8 encoding, and international characters are
   * allowed.
   * * Keys must start with a lowercase letter or international character.
   * * Each resource is limited to a maximum of 64 labels.
   *
   * Both keys and values are additionally constrained to be &lt;= 128 bytes.
   * </pre>
   *
   * <code>map&lt;string, string&gt; labels = 6 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  java.lang.String getLabelsOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * Output only. Time at which the `CustomTargetType` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the createTime field is set.
   */
  boolean hasCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `CustomTargetType` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The createTime.
   */
  com.google.protobuf.Timestamp getCreateTime();
  /**
   *
   *
   * <pre>
   * Output only. Time at which the `CustomTargetType` was created.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp create_time = 7 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getCreateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Output only. Most recent time at which the `CustomTargetType` was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return Whether the updateTime field is set.
   */
  boolean hasUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Most recent time at which the `CustomTargetType` was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The updateTime.
   */
  com.google.protobuf.Timestamp getUpdateTime();
  /**
   *
   *
   * <pre>
   * Output only. Most recent time at which the `CustomTargetType` was updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 8 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   */
  com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The etag.
   */
  java.lang.String getEtag();
  /**
   *
   *
   * <pre>
   * Optional. This checksum is computed by the server based on the value of
   * other fields, and may be sent on update and delete requests to ensure the
   * client has an up-to-date value before proceeding.
   * </pre>
   *
   * <code>string etag = 9 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for etag.
   */
  com.google.protobuf.ByteString getEtagBytes();

  /**
   *
   *
   * <pre>
   * Configures render and deploy for the `CustomTargetType` using Skaffold
   * custom actions.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CustomTargetSkaffoldActions custom_actions = 10;</code>
   *
   * @return Whether the customActions field is set.
   */
  boolean hasCustomActions();
  /**
   *
   *
   * <pre>
   * Configures render and deploy for the `CustomTargetType` using Skaffold
   * custom actions.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CustomTargetSkaffoldActions custom_actions = 10;</code>
   *
   * @return The customActions.
   */
  com.google.cloud.deploy.v1.CustomTargetSkaffoldActions getCustomActions();
  /**
   *
   *
   * <pre>
   * Configures render and deploy for the `CustomTargetType` using Skaffold
   * custom actions.
   * </pre>
   *
   * <code>.google.cloud.deploy.v1.CustomTargetSkaffoldActions custom_actions = 10;</code>
   */
  com.google.cloud.deploy.v1.CustomTargetSkaffoldActionsOrBuilder getCustomActionsOrBuilder();

  com.google.cloud.deploy.v1.CustomTargetType.DefinitionCase getDefinitionCase();
}
