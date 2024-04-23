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
// source: google/appengine/v1/app_yaml.proto

// Protobuf Java Version: 3.25.3
package com.google.appengine.v1;

/**
 *
 *
 * <pre>
 * Methods to enforce security (HTTPS) on a URL.
 * </pre>
 *
 * Protobuf enum {@code google.appengine.v1.SecurityLevel}
 */
public enum SecurityLevel implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>SECURE_UNSPECIFIED = 0;</code>
   */
  SECURE_UNSPECIFIED(0, 0),
  /**
   *
   *
   * <pre>
   * Requests for a URL that match this handler that use HTTPS are automatically
   * redirected to the HTTP equivalent URL.
   * </pre>
   *
   * <code>SECURE_NEVER = 1;</code>
   */
  SECURE_NEVER(2, 1),
  /**
   *
   *
   * <pre>
   * Both HTTP and HTTPS requests with URLs that match the handler succeed
   * without redirects. The application can examine the request to determine
   * which protocol was used and respond accordingly.
   * </pre>
   *
   * <code>SECURE_OPTIONAL = 2;</code>
   */
  SECURE_OPTIONAL(3, 2),
  /**
   *
   *
   * <pre>
   * Requests for a URL that match this handler that do not use HTTPS are
   * automatically redirected to the HTTPS URL with the same path. Query
   * parameters are reserved for the redirect.
   * </pre>
   *
   * <code>SECURE_ALWAYS = 3;</code>
   */
  SECURE_ALWAYS(4, 3),
  UNRECOGNIZED(-1, -1),
  ;

  /**
   *
   *
   * <pre>
   * Both HTTP and HTTPS requests with URLs that match the handler succeed
   * without redirects. The application can examine the request to determine
   * which protocol was used, and respond accordingly.
   * </pre>
   *
   * <code>SECURE_DEFAULT = 0;</code>
   */
  public static final SecurityLevel SECURE_DEFAULT = SECURE_UNSPECIFIED;
  /**
   *
   *
   * <pre>
   * Not specified.
   * </pre>
   *
   * <code>SECURE_UNSPECIFIED = 0;</code>
   */
  public static final int SECURE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Both HTTP and HTTPS requests with URLs that match the handler succeed
   * without redirects. The application can examine the request to determine
   * which protocol was used, and respond accordingly.
   * </pre>
   *
   * <code>SECURE_DEFAULT = 0;</code>
   */
  public static final int SECURE_DEFAULT_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Requests for a URL that match this handler that use HTTPS are automatically
   * redirected to the HTTP equivalent URL.
   * </pre>
   *
   * <code>SECURE_NEVER = 1;</code>
   */
  public static final int SECURE_NEVER_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Both HTTP and HTTPS requests with URLs that match the handler succeed
   * without redirects. The application can examine the request to determine
   * which protocol was used and respond accordingly.
   * </pre>
   *
   * <code>SECURE_OPTIONAL = 2;</code>
   */
  public static final int SECURE_OPTIONAL_VALUE = 2;
  /**
   *
   *
   * <pre>
   * Requests for a URL that match this handler that do not use HTTPS are
   * automatically redirected to the HTTPS URL with the same path. Query
   * parameters are reserved for the redirect.
   * </pre>
   *
   * <code>SECURE_ALWAYS = 3;</code>
   */
  public static final int SECURE_ALWAYS_VALUE = 3;

  public final int getNumber() {
    if (index == -1) {
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
  public static SecurityLevel valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static SecurityLevel forNumber(int value) {
    switch (value) {
      case 0:
        return SECURE_UNSPECIFIED;
      case 1:
        return SECURE_NEVER;
      case 2:
        return SECURE_OPTIONAL;
      case 3:
        return SECURE_ALWAYS;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<SecurityLevel> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<SecurityLevel> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<SecurityLevel>() {
        public SecurityLevel findValueByNumber(int number) {
          return SecurityLevel.forNumber(number);
        }
      };

  public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
    if (index == -1) {
      throw new java.lang.IllegalStateException(
          "Can't get the descriptor of an unrecognized enum value.");
    }
    return getDescriptor().getValues().get(index);
  }

  public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
    return getDescriptor();
  }

  public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
    return com.google.appengine.v1.AppYamlProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final SecurityLevel[] VALUES = getStaticValuesArray();

  private static SecurityLevel[] getStaticValuesArray() {
    return new SecurityLevel[] {
      SECURE_UNSPECIFIED, SECURE_DEFAULT, SECURE_NEVER, SECURE_OPTIONAL, SECURE_ALWAYS,
    };
  }

  public static SecurityLevel valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int index;
  private final int value;

  private SecurityLevel(int index, int value) {
    this.index = index;
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.appengine.v1.SecurityLevel)
}
