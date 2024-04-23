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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

public interface TransformationLocationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.privacy.dlp.v2.TransformationLocation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * For infotype transformations, link to the corresponding findings ID so
   * that location information does not need to be duplicated. Each findings
   * ID correlates to an entry in the findings output table, this table only
   * gets created when users specify to save findings (add the save findings
   * action to the request).
   * </pre>
   *
   * <code>string finding_id = 1;</code>
   *
   * @return Whether the findingId field is set.
   */
  boolean hasFindingId();
  /**
   *
   *
   * <pre>
   * For infotype transformations, link to the corresponding findings ID so
   * that location information does not need to be duplicated. Each findings
   * ID correlates to an entry in the findings output table, this table only
   * gets created when users specify to save findings (add the save findings
   * action to the request).
   * </pre>
   *
   * <code>string finding_id = 1;</code>
   *
   * @return The findingId.
   */
  java.lang.String getFindingId();
  /**
   *
   *
   * <pre>
   * For infotype transformations, link to the corresponding findings ID so
   * that location information does not need to be duplicated. Each findings
   * ID correlates to an entry in the findings output table, this table only
   * gets created when users specify to save findings (add the save findings
   * action to the request).
   * </pre>
   *
   * <code>string finding_id = 1;</code>
   *
   * @return The bytes for findingId.
   */
  com.google.protobuf.ByteString getFindingIdBytes();

  /**
   *
   *
   * <pre>
   * For record transformations, provide a field and container information.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordTransformation record_transformation = 2;</code>
   *
   * @return Whether the recordTransformation field is set.
   */
  boolean hasRecordTransformation();
  /**
   *
   *
   * <pre>
   * For record transformations, provide a field and container information.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordTransformation record_transformation = 2;</code>
   *
   * @return The recordTransformation.
   */
  com.google.privacy.dlp.v2.RecordTransformation getRecordTransformation();
  /**
   *
   *
   * <pre>
   * For record transformations, provide a field and container information.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.RecordTransformation record_transformation = 2;</code>
   */
  com.google.privacy.dlp.v2.RecordTransformationOrBuilder getRecordTransformationOrBuilder();

  /**
   *
   *
   * <pre>
   * Information about the functionality of the container where this finding
   * occurred, if available.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationContainerType container_type = 3;</code>
   *
   * @return The enum numeric value on the wire for containerType.
   */
  int getContainerTypeValue();
  /**
   *
   *
   * <pre>
   * Information about the functionality of the container where this finding
   * occurred, if available.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.TransformationContainerType container_type = 3;</code>
   *
   * @return The containerType.
   */
  com.google.privacy.dlp.v2.TransformationContainerType getContainerType();

  com.google.privacy.dlp.v2.TransformationLocation.LocationTypeCase getLocationTypeCase();
}
