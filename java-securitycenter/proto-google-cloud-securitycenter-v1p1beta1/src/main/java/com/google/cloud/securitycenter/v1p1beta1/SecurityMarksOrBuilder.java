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
// source: google/cloud/securitycenter/v1p1beta1/security_marks.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v1p1beta1;

public interface SecurityMarksOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.securitycenter.v1p1beta1.SecurityMarks)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
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
   * The relative resource name of the SecurityMarks. See:
   * https://cloud.google.com/apis/design/resource_names#relative_resource_name
   * Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks".
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
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  int getMarksCount();
  /**
   *
   *
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  boolean containsMarks(java.lang.String key);
  /** Use {@link #getMarksMap()} instead. */
  @java.lang.Deprecated
  java.util.Map<java.lang.String, java.lang.String> getMarks();
  /**
   *
   *
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  java.util.Map<java.lang.String, java.lang.String> getMarksMap();
  /**
   *
   *
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  /* nullable */
  java.lang.String getMarksOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue);
  /**
   *
   *
   * <pre>
   * Mutable user specified security marks belonging to the parent resource.
   * Constraints are as follows:
   *
   *   * Keys and values are treated as case insensitive
   *   * Keys must be between 1 - 256 characters (inclusive)
   *   * Keys must be letters, numbers, underscores, or dashes
   *   * Values have leading and trailing whitespace trimmed, remaining
   *     characters must be between 1 - 4096 characters (inclusive)
   * </pre>
   *
   * <code>map&lt;string, string&gt; marks = 2;</code>
   */
  java.lang.String getMarksOrThrow(java.lang.String key);

  /**
   *
   *
   * <pre>
   * The canonical name of the marks.
   * Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "folders/{folder_id}/assets/{asset_id}/securityMarks"
   * "projects/{project_number}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks"
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}/securityMarks"
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}/securityMarks"
   * </pre>
   *
   * <code>string canonical_name = 3;</code>
   *
   * @return The canonicalName.
   */
  java.lang.String getCanonicalName();
  /**
   *
   *
   * <pre>
   * The canonical name of the marks.
   * Examples:
   * "organizations/{organization_id}/assets/{asset_id}/securityMarks"
   * "folders/{folder_id}/assets/{asset_id}/securityMarks"
   * "projects/{project_number}/assets/{asset_id}/securityMarks"
   * "organizations/{organization_id}/sources/{source_id}/findings/{finding_id}/securityMarks"
   * "folders/{folder_id}/sources/{source_id}/findings/{finding_id}/securityMarks"
   * "projects/{project_number}/sources/{source_id}/findings/{finding_id}/securityMarks"
   * </pre>
   *
   * <code>string canonical_name = 3;</code>
   *
   * @return The bytes for canonicalName.
   */
  com.google.protobuf.ByteString getCanonicalNameBytes();
}
