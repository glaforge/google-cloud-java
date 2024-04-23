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
// source: google/analytics/admin/v1alpha/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Different kinds of actors that can make changes to Google Analytics
 * resources.
 * </pre>
 *
 * Protobuf enum {@code google.analytics.admin.v1alpha.ActorType}
 */
public enum ActorType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unknown or unspecified actor type.
   * </pre>
   *
   * <code>ACTOR_TYPE_UNSPECIFIED = 0;</code>
   */
  ACTOR_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Changes made by the user specified in actor_email.
   * </pre>
   *
   * <code>USER = 1;</code>
   */
  USER(1),
  /**
   *
   *
   * <pre>
   * Changes made by the Google Analytics system.
   * </pre>
   *
   * <code>SYSTEM = 2;</code>
   */
  SYSTEM(2),
  /**
   *
   *
   * <pre>
   * Changes made by Google Analytics support team staff.
   * </pre>
   *
   * <code>SUPPORT = 3;</code>
   */
  SUPPORT(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unknown or unspecified actor type.
   * </pre>
   *
   * <code>ACTOR_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int ACTOR_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Changes made by the user specified in actor_email.
   * </pre>
   *
   * <code>USER = 1;</code>
   */
  public static final int USER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Changes made by the Google Analytics system.
   * </pre>
   *
   * <code>SYSTEM = 2;</code>
   */
  public static final int SYSTEM_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Changes made by Google Analytics support team staff.
   * </pre>
   *
   * <code>SUPPORT = 3;</code>
   */
  public static final int SUPPORT_VALUE = 3;

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
  public static ActorType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ActorType forNumber(int value) {
    switch (value) {
      case 0:
        return ACTOR_TYPE_UNSPECIFIED;
      case 1:
        return USER;
      case 2:
        return SYSTEM;
      case 3:
        return SUPPORT;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ActorType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ActorType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ActorType>() {
        public ActorType findValueByNumber(int number) {
          return ActorType.forNumber(number);
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
    return com.google.analytics.admin.v1alpha.ResourcesProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final ActorType[] VALUES = values();

  public static ActorType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ActorType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.analytics.admin.v1alpha.ActorType)
}
