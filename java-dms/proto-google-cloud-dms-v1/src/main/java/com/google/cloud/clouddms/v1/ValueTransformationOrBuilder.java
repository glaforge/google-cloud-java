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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

public interface ValueTransformationOrBuilder
    extends
    // @@protoc_insertion_point(interface_extends:google.cloud.clouddms.v1.ValueTransformation)
    com.google.protobuf.MessageOrBuilder {

  /**
   *
   *
   * <pre>
   * Optional. Value is null
   * </pre>
   *
   * <code>.google.protobuf.Empty is_null = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return Whether the isNull field is set.
   */
  boolean hasIsNull();
  /**
   *
   *
   * <pre>
   * Optional. Value is null
   * </pre>
   *
   * <code>.google.protobuf.Empty is_null = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The isNull.
   */
  com.google.protobuf.Empty getIsNull();
  /**
   *
   *
   * <pre>
   * Optional. Value is null
   * </pre>
   *
   * <code>.google.protobuf.Empty is_null = 100 [(.google.api.field_behavior) = OPTIONAL];</code>
   */
  com.google.protobuf.EmptyOrBuilder getIsNullOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Value is found in the specified list.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValueListFilter value_list = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the valueList field is set.
   */
  boolean hasValueList();
  /**
   *
   *
   * <pre>
   * Optional. Value is found in the specified list.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValueListFilter value_list = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The valueList.
   */
  com.google.cloud.clouddms.v1.ValueListFilter getValueList();
  /**
   *
   *
   * <pre>
   * Optional. Value is found in the specified list.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ValueListFilter value_list = 101 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.ValueListFilterOrBuilder getValueListOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Filter on relation between source value and compare value of
   * type integer.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.IntComparisonFilter int_comparison = 102 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the intComparison field is set.
   */
  boolean hasIntComparison();
  /**
   *
   *
   * <pre>
   * Optional. Filter on relation between source value and compare value of
   * type integer.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.IntComparisonFilter int_comparison = 102 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The intComparison.
   */
  com.google.cloud.clouddms.v1.IntComparisonFilter getIntComparison();
  /**
   *
   *
   * <pre>
   * Optional. Filter on relation between source value and compare value of
   * type integer.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.IntComparisonFilter int_comparison = 102 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.IntComparisonFilterOrBuilder getIntComparisonOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Filter on relation between source value and compare value of
   * type double.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.DoubleComparisonFilter double_comparison = 103 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the doubleComparison field is set.
   */
  boolean hasDoubleComparison();
  /**
   *
   *
   * <pre>
   * Optional. Filter on relation between source value and compare value of
   * type double.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.DoubleComparisonFilter double_comparison = 103 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The doubleComparison.
   */
  com.google.cloud.clouddms.v1.DoubleComparisonFilter getDoubleComparison();
  /**
   *
   *
   * <pre>
   * Optional. Filter on relation between source value and compare value of
   * type double.
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.DoubleComparisonFilter double_comparison = 103 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.DoubleComparisonFilterOrBuilder getDoubleComparisonOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set to null
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_null = 200 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assignNull field is set.
   */
  boolean hasAssignNull();
  /**
   *
   *
   * <pre>
   * Optional. Set to null
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_null = 200 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assignNull.
   */
  com.google.protobuf.Empty getAssignNull();
  /**
   *
   *
   * <pre>
   * Optional. Set to null
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_null = 200 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.EmptyOrBuilder getAssignNullOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set to a specific value (value is converted to fit the target
   * data type)
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AssignSpecificValue assign_specific_value = 201 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assignSpecificValue field is set.
   */
  boolean hasAssignSpecificValue();
  /**
   *
   *
   * <pre>
   * Optional. Set to a specific value (value is converted to fit the target
   * data type)
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AssignSpecificValue assign_specific_value = 201 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assignSpecificValue.
   */
  com.google.cloud.clouddms.v1.AssignSpecificValue getAssignSpecificValue();
  /**
   *
   *
   * <pre>
   * Optional. Set to a specific value (value is converted to fit the target
   * data type)
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.AssignSpecificValue assign_specific_value = 201 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.AssignSpecificValueOrBuilder getAssignSpecificValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set to min_value - if integer or numeric, will use
   * int.minvalue, etc
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_min_value = 202 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assignMinValue field is set.
   */
  boolean hasAssignMinValue();
  /**
   *
   *
   * <pre>
   * Optional. Set to min_value - if integer or numeric, will use
   * int.minvalue, etc
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_min_value = 202 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assignMinValue.
   */
  com.google.protobuf.Empty getAssignMinValue();
  /**
   *
   *
   * <pre>
   * Optional. Set to min_value - if integer or numeric, will use
   * int.minvalue, etc
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_min_value = 202 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.EmptyOrBuilder getAssignMinValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Set to max_value - if integer or numeric, will use
   * int.maxvalue, etc
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_max_value = 203 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the assignMaxValue field is set.
   */
  boolean hasAssignMaxValue();
  /**
   *
   *
   * <pre>
   * Optional. Set to max_value - if integer or numeric, will use
   * int.maxvalue, etc
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_max_value = 203 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The assignMaxValue.
   */
  com.google.protobuf.Empty getAssignMaxValue();
  /**
   *
   *
   * <pre>
   * Optional. Set to max_value - if integer or numeric, will use
   * int.maxvalue, etc
   * </pre>
   *
   * <code>.google.protobuf.Empty assign_max_value = 203 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.protobuf.EmptyOrBuilder getAssignMaxValueOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Allows the data to change scale
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.RoundToScale round_scale = 204 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the roundScale field is set.
   */
  boolean hasRoundScale();
  /**
   *
   *
   * <pre>
   * Optional. Allows the data to change scale
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.RoundToScale round_scale = 204 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The roundScale.
   */
  com.google.cloud.clouddms.v1.RoundToScale getRoundScale();
  /**
   *
   *
   * <pre>
   * Optional. Allows the data to change scale
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.RoundToScale round_scale = 204 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.RoundToScaleOrBuilder getRoundScaleOrBuilder();

  /**
   *
   *
   * <pre>
   * Optional. Applies a hash function on the data
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ApplyHash apply_hash = 205 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the applyHash field is set.
   */
  boolean hasApplyHash();
  /**
   *
   *
   * <pre>
   * Optional. Applies a hash function on the data
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ApplyHash apply_hash = 205 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The applyHash.
   */
  com.google.cloud.clouddms.v1.ApplyHash getApplyHash();
  /**
   *
   *
   * <pre>
   * Optional. Applies a hash function on the data
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.ApplyHash apply_hash = 205 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  com.google.cloud.clouddms.v1.ApplyHashOrBuilder getApplyHashOrBuilder();

  com.google.cloud.clouddms.v1.ValueTransformation.FilterCase getFilterCase();

  com.google.cloud.clouddms.v1.ValueTransformation.ActionCase getActionCase();
}
