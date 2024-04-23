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
// source: google/analytics/data/v1alpha/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1alpha;

public interface UserSegmentCriteriaOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.analytics.data.v1alpha.UserSegmentCriteria)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andConditionGroups` and each of the `andSequenceGroups`.
   * `andConditionGroups` may be empty if `andSequenceGroups` are specified.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.UserSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  java.util.List<com.google.analytics.data.v1alpha.UserSegmentConditionGroup>
      getAndConditionGroupsList();
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andConditionGroups` and each of the `andSequenceGroups`.
   * `andConditionGroups` may be empty if `andSequenceGroups` are specified.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.UserSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  com.google.analytics.data.v1alpha.UserSegmentConditionGroup getAndConditionGroups(int index);
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andConditionGroups` and each of the `andSequenceGroups`.
   * `andConditionGroups` may be empty if `andSequenceGroups` are specified.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.UserSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  int getAndConditionGroupsCount();
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andConditionGroups` and each of the `andSequenceGroups`.
   * `andConditionGroups` may be empty if `andSequenceGroups` are specified.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.UserSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.UserSegmentConditionGroupOrBuilder>
      getAndConditionGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andConditionGroups` and each of the `andSequenceGroups`.
   * `andConditionGroups` may be empty if `andSequenceGroups` are specified.
   * </pre>
   *
   * <code>
   * repeated .google.analytics.data.v1alpha.UserSegmentConditionGroup and_condition_groups = 1;
   * </code>
   */
  com.google.analytics.data.v1alpha.UserSegmentConditionGroupOrBuilder
      getAndConditionGroupsOrBuilder(int index);

  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andSequenceGroups` and each of the `andConditionGroups`.
   * `andSequenceGroups` may be empty if `andConditionGroups` are specified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSegmentSequenceGroup and_sequence_groups = 2;
   * </code>
   */
  java.util.List<com.google.analytics.data.v1alpha.UserSegmentSequenceGroup>
      getAndSequenceGroupsList();
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andSequenceGroups` and each of the `andConditionGroups`.
   * `andSequenceGroups` may be empty if `andConditionGroups` are specified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSegmentSequenceGroup and_sequence_groups = 2;
   * </code>
   */
  com.google.analytics.data.v1alpha.UserSegmentSequenceGroup getAndSequenceGroups(int index);
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andSequenceGroups` and each of the `andConditionGroups`.
   * `andSequenceGroups` may be empty if `andConditionGroups` are specified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSegmentSequenceGroup and_sequence_groups = 2;
   * </code>
   */
  int getAndSequenceGroupsCount();
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andSequenceGroups` and each of the `andConditionGroups`.
   * `andSequenceGroups` may be empty if `andConditionGroups` are specified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSegmentSequenceGroup and_sequence_groups = 2;
   * </code>
   */
  java.util.List<? extends com.google.analytics.data.v1alpha.UserSegmentSequenceGroupOrBuilder>
      getAndSequenceGroupsOrBuilderList();
  /**
   *
   *
   * <pre>
   * A user matches this criteria if the user matches each of these
   * `andSequenceGroups` and each of the `andConditionGroups`.
   * `andSequenceGroups` may be empty if `andConditionGroups` are specified.
   * </pre>
   *
   * <code>repeated .google.analytics.data.v1alpha.UserSegmentSequenceGroup and_sequence_groups = 2;
   * </code>
   */
  com.google.analytics.data.v1alpha.UserSegmentSequenceGroupOrBuilder getAndSequenceGroupsOrBuilder(
      int index);
}
