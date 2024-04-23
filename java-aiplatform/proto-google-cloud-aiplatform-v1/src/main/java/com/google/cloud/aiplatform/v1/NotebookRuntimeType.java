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
// source: google/cloud/aiplatform/v1/notebook_runtime.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1;

/**
 *
 *
 * <pre>
 * Represents a notebook runtime type.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.aiplatform.v1.NotebookRuntimeType}
 */
public enum NotebookRuntimeType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified notebook runtime type, NotebookRuntimeType will default to
   * USER_DEFINED.
   * </pre>
   *
   * <code>NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED = 0;</code>
   */
  NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * runtime or template with coustomized configurations from user.
   * </pre>
   *
   * <code>USER_DEFINED = 1;</code>
   */
  USER_DEFINED(1),
  /**
   *
   *
   * <pre>
   * runtime or template with system defined configurations.
   * </pre>
   *
   * <code>ONE_CLICK = 2;</code>
   */
  ONE_CLICK(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified notebook runtime type, NotebookRuntimeType will default to
   * USER_DEFINED.
   * </pre>
   *
   * <code>NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * runtime or template with coustomized configurations from user.
   * </pre>
   *
   * <code>USER_DEFINED = 1;</code>
   */
  public static final int USER_DEFINED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * runtime or template with system defined configurations.
   * </pre>
   *
   * <code>ONE_CLICK = 2;</code>
   */
  public static final int ONE_CLICK_VALUE = 2;

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
  public static NotebookRuntimeType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static NotebookRuntimeType forNumber(int value) {
    switch (value) {
      case 0:
        return NOTEBOOK_RUNTIME_TYPE_UNSPECIFIED;
      case 1:
        return USER_DEFINED;
      case 2:
        return ONE_CLICK;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<NotebookRuntimeType>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<NotebookRuntimeType>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<NotebookRuntimeType>() {
            public NotebookRuntimeType findValueByNumber(int number) {
              return NotebookRuntimeType.forNumber(number);
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
    return com.google.cloud.aiplatform.v1.NotebookRuntimeProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final NotebookRuntimeType[] VALUES = values();

  public static NotebookRuntimeType valueOf(
      com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private NotebookRuntimeType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.aiplatform.v1.NotebookRuntimeType)
}
