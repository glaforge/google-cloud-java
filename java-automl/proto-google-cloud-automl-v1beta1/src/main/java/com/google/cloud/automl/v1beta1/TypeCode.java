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
// source: google/cloud/automl/v1beta1/data_types.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.automl.v1beta1;

/**
 *
 *
 * <pre>
 * `TypeCode` is used as a part of
 * [DataType][google.cloud.automl.v1beta1.DataType].
 * </pre>
 *
 * Protobuf enum {@code google.cloud.automl.v1beta1.TypeCode}
 */
public enum TypeCode implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified. Should not be used.
   * </pre>
   *
   * <code>TYPE_CODE_UNSPECIFIED = 0;</code>
   */
  TYPE_CODE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Encoded as `number`, or the strings `"NaN"`, `"Infinity"`, or
   * `"-Infinity"`.
   * </pre>
   *
   * <code>FLOAT64 = 3;</code>
   */
  FLOAT64(3),
  /**
   *
   *
   * <pre>
   * Must be between 0AD and 9999AD. Encoded as `string` according to
   * [time_format][google.cloud.automl.v1beta1.DataType.time_format], or, if
   * that format is not set, then in RFC 3339 `date-time` format, where
   * `time-offset` = `"Z"` (e.g. 1985-04-12T23:20:50.52Z).
   * </pre>
   *
   * <code>TIMESTAMP = 4;</code>
   */
  TIMESTAMP(4),
  /**
   *
   *
   * <pre>
   * Encoded as `string`.
   * </pre>
   *
   * <code>STRING = 6;</code>
   */
  STRING(6),
  /**
   *
   *
   * <pre>
   * Encoded as `list`, where the list elements are represented according to
   *
   * [list_element_type][google.cloud.automl.v1beta1.DataType.list_element_type].
   * </pre>
   *
   * <code>ARRAY = 8;</code>
   */
  ARRAY(8),
  /**
   *
   *
   * <pre>
   * Encoded as `struct`, where field values are represented according to
   * [struct_type][google.cloud.automl.v1beta1.DataType.struct_type].
   * </pre>
   *
   * <code>STRUCT = 9;</code>
   */
  STRUCT(9),
  /**
   *
   *
   * <pre>
   * Values of this type are not further understood by AutoML,
   * e.g. AutoML is unable to tell the order of values (as it could with
   * FLOAT64), or is unable to say if one value contains another (as it
   * could with STRING).
   * Encoded as `string` (bytes should be base64-encoded, as described in RFC
   * 4648, section 4).
   * </pre>
   *
   * <code>CATEGORY = 10;</code>
   */
  CATEGORY(10),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not specified. Should not be used.
   * </pre>
   *
   * <code>TYPE_CODE_UNSPECIFIED = 0;</code>
   */
  public static final int TYPE_CODE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Encoded as `number`, or the strings `"NaN"`, `"Infinity"`, or
   * `"-Infinity"`.
   * </pre>
   *
   * <code>FLOAT64 = 3;</code>
   */
  public static final int FLOAT64_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Must be between 0AD and 9999AD. Encoded as `string` according to
   * [time_format][google.cloud.automl.v1beta1.DataType.time_format], or, if
   * that format is not set, then in RFC 3339 `date-time` format, where
   * `time-offset` = `"Z"` (e.g. 1985-04-12T23:20:50.52Z).
   * </pre>
   *
   * <code>TIMESTAMP = 4;</code>
   */
  public static final int TIMESTAMP_VALUE = 4;
  /**
   *
   *
   * <pre>
   * Encoded as `string`.
   * </pre>
   *
   * <code>STRING = 6;</code>
   */
  public static final int STRING_VALUE = 6;
  /**
   *
   *
   * <pre>
   * Encoded as `list`, where the list elements are represented according to
   *
   * [list_element_type][google.cloud.automl.v1beta1.DataType.list_element_type].
   * </pre>
   *
   * <code>ARRAY = 8;</code>
   */
  public static final int ARRAY_VALUE = 8;
  /**
   *
   *
   * <pre>
   * Encoded as `struct`, where field values are represented according to
   * [struct_type][google.cloud.automl.v1beta1.DataType.struct_type].
   * </pre>
   *
   * <code>STRUCT = 9;</code>
   */
  public static final int STRUCT_VALUE = 9;
  /**
   *
   *
   * <pre>
   * Values of this type are not further understood by AutoML,
   * e.g. AutoML is unable to tell the order of values (as it could with
   * FLOAT64), or is unable to say if one value contains another (as it
   * could with STRING).
   * Encoded as `string` (bytes should be base64-encoded, as described in RFC
   * 4648, section 4).
   * </pre>
   *
   * <code>CATEGORY = 10;</code>
   */
  public static final int CATEGORY_VALUE = 10;

  public final int getNumber() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalArgumentException(
          "Can't get the number of an unknown enum value.");
    }
    return value;
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   * @deprecated Use {@link #forNumber(int)} instead.
   */
  @java.lang.Deprecated
  public static TypeCode valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static TypeCode forNumber(int value) {
    switch (value) {
      case 0:
        return TYPE_CODE_UNSPECIFIED;
      case 3:
        return FLOAT64;
      case 4:
        return TIMESTAMP;
      case 6:
        return STRING;
      case 8:
        return ARRAY;
      case 9:
        return STRUCT;
      case 10:
        return CATEGORY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<TypeCode> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<TypeCode> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<TypeCode>() {
        public TypeCode findValueByNumber(int number) {
          return TypeCode.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (this == UNRECOGNIZED) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(ordinal());
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.cloud.automl.v1beta1.DataTypes.getDescriptor().getEnumTypes().get(0);
  }

  private static final TypeCode[] VALUES = values();

  public static TypeCode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private TypeCode(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.automl.v1beta1.TypeCode)
}
