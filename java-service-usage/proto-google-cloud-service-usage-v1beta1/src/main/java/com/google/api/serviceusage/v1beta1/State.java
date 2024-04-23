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
// source: google/api/serviceusage/v1beta1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.api.serviceusage.v1beta1;

/**
 *
 *
 * <pre>
 * Whether or not a service has been enabled for use by a consumer.
 * </pre>
 *
 * Protobuf enum {@code google.api.serviceusage.v1beta1.State}
 */
public enum State implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The default value, which indicates that the enabled state of the service
   * is unspecified or not meaningful. Currently, all consumers other than
   * projects (such as folders and organizations) are always in this state.
   * </pre>
   *
   * <code>STATE_UNSPECIFIED = 0;</code>
   */
  STATE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The service cannot be used by this consumer. It has either been explicitly
   * disabled, or has never been enabled.
   * </pre>
   *
   * <code>DISABLED = 1;</code>
   */
  DISABLED(1),
  /**
   *
   *
   * <pre>
   * The service has been explicitly enabled for use by this consumer.
   * </pre>
   *
   * <code>ENABLED = 2;</code>
   */
  ENABLED(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The default value, which indicates that the enabled state of the service
   * is unspecified or not meaningful. Currently, all consumers other than
   * projects (such as folders and organizations) are always in this state.
   * </pre>
   *
   * <code>STATE_UNSPECIFIED = 0;</code>
   */
  public static final int STATE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The service cannot be used by this consumer. It has either been explicitly
   * disabled, or has never been enabled.
   * </pre>
   *
   * <code>DISABLED = 1;</code>
   */
  public static final int DISABLED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The service has been explicitly enabled for use by this consumer.
   * </pre>
   *
   * <code>ENABLED = 2;</code>
   */
  public static final int ENABLED_VALUE = 2;

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
  public static State valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static State forNumber(int value) {
    switch (value) {
      case 0:
        return STATE_UNSPECIFIED;
      case 1:
        return DISABLED;
      case 2:
        return ENABLED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<State>() {
        public State findValueByNumber(int number) {
          return State.forNumber(number);
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
    return com.google.api.serviceusage.v1beta1.ResourcesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final State[] VALUES = values();

  public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private State(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.api.serviceusage.v1beta1.State)
}
