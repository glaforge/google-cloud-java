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
// source: google/cloud/talent/v4beta1/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.talent.v4beta1;

/**
 *
 *
 * <pre>
 * Method for commute.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.talent.v4beta1.CommuteMethod}
 */
public enum CommuteMethod implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Commute method isn't specified.
   * </pre>
   *
   * <code>COMMUTE_METHOD_UNSPECIFIED = 0;</code>
   */
  COMMUTE_METHOD_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on driving time.
   * </pre>
   *
   * <code>DRIVING = 1;</code>
   */
  DRIVING(1),
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on public transit including bus, metro,
   * subway, and so on.
   * </pre>
   *
   * <code>TRANSIT = 2;</code>
   */
  TRANSIT(2),
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on walking time.
   * </pre>
   *
   * <code>WALKING = 3;</code>
   */
  WALKING(3),
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on biking time.
   * </pre>
   *
   * <code>CYCLING = 4;</code>
   */
  CYCLING(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Commute method isn't specified.
   * </pre>
   *
   * <code>COMMUTE_METHOD_UNSPECIFIED = 0;</code>
   */
  public static final int COMMUTE_METHOD_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on driving time.
   * </pre>
   *
   * <code>DRIVING = 1;</code>
   */
  public static final int DRIVING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on public transit including bus, metro,
   * subway, and so on.
   * </pre>
   *
   * <code>TRANSIT = 2;</code>
   */
  public static final int TRANSIT_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on walking time.
   * </pre>
   *
   * <code>WALKING = 3;</code>
   */
  public static final int WALKING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Commute time is calculated based on biking time.
   * </pre>
   *
   * <code>CYCLING = 4;</code>
   */
  public static final int CYCLING_VALUE = 4;

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
  public static CommuteMethod valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static CommuteMethod forNumber(int value) {
    switch (value) {
      case 0:
        return COMMUTE_METHOD_UNSPECIFIED;
      case 1:
        return DRIVING;
      case 2:
        return TRANSIT;
      case 3:
        return WALKING;
      case 4:
        return CYCLING;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<CommuteMethod> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<CommuteMethod> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<CommuteMethod>() {
        public CommuteMethod findValueByNumber(int number) {
          return CommuteMethod.forNumber(number);
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
    return com.google.cloud.talent.v4beta1.CommonProto.getDescriptor().getEnumTypes().get(9);
  }

  private static final CommuteMethod[] VALUES = values();

  public static CommuteMethod valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private CommuteMethod(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.talent.v4beta1.CommuteMethod)
}
