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
// source: google/devtools/clouderrorreporting/v1beta1/error_stats_service.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.clouderrorreporting.v1beta1;

/**
 *
 *
 * <pre>
 * A sorting order of error groups.
 * </pre>
 *
 * Protobuf enum {@code google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrder}
 */
public enum ErrorGroupOrder implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * No group order specified.
   * </pre>
   *
   * <code>GROUP_ORDER_UNSPECIFIED = 0;</code>
   */
  GROUP_ORDER_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Total count of errors in the given time window in descending order.
   * </pre>
   *
   * <code>COUNT_DESC = 1;</code>
   */
  COUNT_DESC(1),
  /**
   *
   *
   * <pre>
   * Timestamp when the group was last seen in the given time window
   * in descending order.
   * </pre>
   *
   * <code>LAST_SEEN_DESC = 2;</code>
   */
  LAST_SEEN_DESC(2),
  /**
   *
   *
   * <pre>
   * Timestamp when the group was created in descending order.
   * </pre>
   *
   * <code>CREATED_DESC = 3;</code>
   */
  CREATED_DESC(3),
  /**
   *
   *
   * <pre>
   * Number of affected users in the given time window in descending order.
   * </pre>
   *
   * <code>AFFECTED_USERS_DESC = 4;</code>
   */
  AFFECTED_USERS_DESC(4),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * No group order specified.
   * </pre>
   *
   * <code>GROUP_ORDER_UNSPECIFIED = 0;</code>
   */
  public static final int GROUP_ORDER_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Total count of errors in the given time window in descending order.
   * </pre>
   *
   * <code>COUNT_DESC = 1;</code>
   */
  public static final int COUNT_DESC_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Timestamp when the group was last seen in the given time window
   * in descending order.
   * </pre>
   *
   * <code>LAST_SEEN_DESC = 2;</code>
   */
  public static final int LAST_SEEN_DESC_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Timestamp when the group was created in descending order.
   * </pre>
   *
   * <code>CREATED_DESC = 3;</code>
   */
  public static final int CREATED_DESC_VALUE = 3;
  /**
   *
   *
   * <pre>
   * Number of affected users in the given time window in descending order.
   * </pre>
   *
   * <code>AFFECTED_USERS_DESC = 4;</code>
   */
  public static final int AFFECTED_USERS_DESC_VALUE = 4;

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
  public static ErrorGroupOrder valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ErrorGroupOrder forNumber(int value) {
    switch (value) {
      case 0:
        return GROUP_ORDER_UNSPECIFIED;
      case 1:
        return COUNT_DESC;
      case 2:
        return LAST_SEEN_DESC;
      case 3:
        return CREATED_DESC;
      case 4:
        return AFFECTED_USERS_DESC;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ErrorGroupOrder> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ErrorGroupOrder> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ErrorGroupOrder>() {
        public ErrorGroupOrder findValueByNumber(int number) {
          return ErrorGroupOrder.forNumber(number);
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
    return com.google.devtools.clouderrorreporting.v1beta1.ErrorStatsServiceProto.getDescriptor()
        .getEnumTypes()
        .get(1);
  }

  private static final ErrorGroupOrder[] VALUES = values();

  public static ErrorGroupOrder valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ErrorGroupOrder(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.devtools.clouderrorreporting.v1beta1.ErrorGroupOrder)
}
