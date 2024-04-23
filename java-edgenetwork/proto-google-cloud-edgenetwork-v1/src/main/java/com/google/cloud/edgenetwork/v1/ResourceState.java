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
// source: google/cloud/edgenetwork/v1/resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.edgenetwork.v1;

/**
 *
 *
 * <pre>
 * ResourceState describes the state the resource.
 * A normal lifecycle of a new resource being created would be: PENDING -&gt;
 * PROVISIONING -&gt; RUNNING. A normal lifecycle of an existing resource being
 * deleted would be: RUNNING -&gt; DELETING. Any failures during processing will
 * result the resource to be in a SUSPENDED state.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.edgenetwork.v1.ResourceState}
 */
public enum ResourceState implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Unspecified state.
   * </pre>
   *
   * <code>STATE_UNKNOWN = 0;</code>
   */
  STATE_UNKNOWN(0),
  /**
   *
   *
   * <pre>
   * The resource is being prepared to be applied to the rack.
   * </pre>
   *
   * <code>STATE_PENDING = 1;</code>
   */
  STATE_PENDING(1),
  /**
   *
   *
   * <pre>
   * The resource has started being applied to the rack.
   * </pre>
   *
   * <code>STATE_PROVISIONING = 2;</code>
   */
  STATE_PROVISIONING(2),
  /**
   *
   *
   * <pre>
   * The resource has been pushed to the rack.
   * </pre>
   *
   * <code>STATE_RUNNING = 3;</code>
   */
  STATE_RUNNING(3),
  /**
   *
   *
   * <pre>
   * The resource failed to push to the rack.
   * </pre>
   *
   * <code>STATE_SUSPENDED = 4;</code>
   */
  STATE_SUSPENDED(4),
  /**
   *
   *
   * <pre>
   * The resource is under deletion.
   * </pre>
   *
   * <code>STATE_DELETING = 5;</code>
   */
  STATE_DELETING(5),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Unspecified state.
   * </pre>
   *
   * <code>STATE_UNKNOWN = 0;</code>
   */
  public static final int STATE_UNKNOWN_VALUE = 0;
  /**
   *
   *
   * <pre>
   * The resource is being prepared to be applied to the rack.
   * </pre>
   *
   * <code>STATE_PENDING = 1;</code>
   */
  public static final int STATE_PENDING_VALUE = 1;
  /**
   *
   *
   * <pre>
   * The resource has started being applied to the rack.
   * </pre>
   *
   * <code>STATE_PROVISIONING = 2;</code>
   */
  public static final int STATE_PROVISIONING_VALUE = 2;
  /**
   *
   *
   * <pre>
   * The resource has been pushed to the rack.
   * </pre>
   *
   * <code>STATE_RUNNING = 3;</code>
   */
  public static final int STATE_RUNNING_VALUE = 3;
  /**
   *
   *
   * <pre>
   * The resource failed to push to the rack.
   * </pre>
   *
   * <code>STATE_SUSPENDED = 4;</code>
   */
  public static final int STATE_SUSPENDED_VALUE = 4;
  /**
   *
   *
   * <pre>
   * The resource is under deletion.
   * </pre>
   *
   * <code>STATE_DELETING = 5;</code>
   */
  public static final int STATE_DELETING_VALUE = 5;

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
  public static ResourceState valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static ResourceState forNumber(int value) {
    switch (value) {
      case 0:
        return STATE_UNKNOWN;
      case 1:
        return STATE_PENDING;
      case 2:
        return STATE_PROVISIONING;
      case 3:
        return STATE_RUNNING;
      case 4:
        return STATE_SUSPENDED;
      case 5:
        return STATE_DELETING;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<ResourceState> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<ResourceState> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<ResourceState>() {
        public ResourceState findValueByNumber(int number) {
          return ResourceState.forNumber(number);
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
    return com.google.cloud.edgenetwork.v1.ResourcesProto.getDescriptor().getEnumTypes().get(0);
  }

  private static final ResourceState[] VALUES = values();

  public static ResourceState valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private ResourceState(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.edgenetwork.v1.ResourceState)
}
