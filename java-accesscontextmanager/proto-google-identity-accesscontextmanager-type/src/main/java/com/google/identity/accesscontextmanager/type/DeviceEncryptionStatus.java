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
// source: google/identity/accesscontextmanager/type/device_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.identity.accesscontextmanager.type;

/**
 *
 *
 * <pre>
 * The encryption state of the device.
 * </pre>
 *
 * Protobuf enum {@code google.identity.accesscontextmanager.type.DeviceEncryptionStatus}
 */
public enum DeviceEncryptionStatus implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * The encryption status of the device is not specified or not known.
   * </pre>
   *
   * <code>ENCRYPTION_UNSPECIFIED = 0;</code>
   */
  ENCRYPTION_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * The device does not support encryption.
   * </pre>
   *
   * <code>ENCRYPTION_UNSUPPORTED = 1;</code>
   */
  ENCRYPTION_UNSUPPORTED(1),
  /**
   *
   *
   * <pre>
   * The device supports encryption, but is currently unencrypted.
   * </pre>
   *
   * <code>UNENCRYPTED = 2;</code>
   */
  UNENCRYPTED(2),
  /**
   *
   *
   * <pre>
   * The device is encrypted.
   * </pre>
   *
   * <code>ENCRYPTED = 3;</code>
   */
  ENCRYPTED(3),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * The encryption status of the device is not specified or not known.
   * </pre>
   *
   * <code>ENCRYPTION_UNSPECIFIED = 0;</code>
   */
  public static final int ENCRYPTION_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The device does not support encryption.
   * </pre>
   *
   * <code>ENCRYPTION_UNSUPPORTED = 1;</code>
   */
  public static final int ENCRYPTION_UNSUPPORTED_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The device supports encryption, but is currently unencrypted.
   * </pre>
   *
   * <code>UNENCRYPTED = 2;</code>
   */
  public static final int UNENCRYPTED_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The device is encrypted.
   * </pre>
   *
   * <code>ENCRYPTED = 3;</code>
   */
  public static final int ENCRYPTED_VALUE = 3;

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
  public static DeviceEncryptionStatus valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static DeviceEncryptionStatus forNumber(int value) {
    switch (value) {
      case 0:
        return ENCRYPTION_UNSPECIFIED;
      case 1:
        return ENCRYPTION_UNSUPPORTED;
      case 2:
        return UNENCRYPTED;
      case 3:
        return ENCRYPTED;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<DeviceEncryptionStatus>
      internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<DeviceEncryptionStatus>
      internalValueMap =
          new com.google.protobuf.Internal.EnumLiteMap<DeviceEncryptionStatus>() {
            public DeviceEncryptionStatus findValueByNumber(int number) {
              return DeviceEncryptionStatus.forNumber(number);
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
    return com.google.identity.accesscontextmanager.type.TypeProto.getDescriptor()
        .getEnumTypes()
        .get(0);
  }

  private static final DeviceEncryptionStatus[] VALUES = values();

  public static DeviceEncryptionStatus valueOf(
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

  private DeviceEncryptionStatus(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.identity.accesscontextmanager.type.DeviceEncryptionStatus)
}
