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
// source: google/cloud/channel/v1/offers.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.channel.v1;

/**
 *
 *
 * <pre>
 * Specifies when the payment needs to happen.
 * </pre>
 *
 * Protobuf enum {@code google.cloud.channel.v1.PaymentType}
 */
public enum PaymentType implements com.google.protobuf.ProtocolMessageEnum {
  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>PAYMENT_TYPE_UNSPECIFIED = 0;</code>
   */
  PAYMENT_TYPE_UNSPECIFIED(0),
  /**
   *
   *
   * <pre>
   * Prepay. Amount has to be paid before service is rendered.
   * </pre>
   *
   * <code>PREPAY = 1;</code>
   */
  PREPAY(1),
  /**
   *
   *
   * <pre>
   * Postpay. Reseller is charged at the end of the Payment cycle.
   * </pre>
   *
   * <code>POSTPAY = 2;</code>
   */
  POSTPAY(2),
  UNRECOGNIZED(-1),
  ;

  /**
   *
   *
   * <pre>
   * Not used.
   * </pre>
   *
   * <code>PAYMENT_TYPE_UNSPECIFIED = 0;</code>
   */
  public static final int PAYMENT_TYPE_UNSPECIFIED_VALUE = 0;
  /**
   *
   *
   * <pre>
   * Prepay. Amount has to be paid before service is rendered.
   * </pre>
   *
   * <code>PREPAY = 1;</code>
   */
  public static final int PREPAY_VALUE = 1;
  /**
   *
   *
   * <pre>
   * Postpay. Reseller is charged at the end of the Payment cycle.
   * </pre>
   *
   * <code>POSTPAY = 2;</code>
   */
  public static final int POSTPAY_VALUE = 2;

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
  public static PaymentType valueOf(int value) {
    return forNumber(value);
  }

  /**
   * @param value The numeric wire value of the corresponding enum entry.
   * @return The enum associated with the given numeric wire value.
   */
  public static PaymentType forNumber(int value) {
    switch (value) {
      case 0:
        return PAYMENT_TYPE_UNSPECIFIED;
      case 1:
        return PREPAY;
      case 2:
        return POSTPAY;
      default:
        return null;
    }
  }

  public static com.google.protobuf.Internal.EnumLiteMap<PaymentType> internalGetValueMap() {
    return internalValueMap;
  }

  private static final com.google.protobuf.Internal.EnumLiteMap<PaymentType> internalValueMap =
      new com.google.protobuf.Internal.EnumLiteMap<PaymentType>() {
        public PaymentType findValueByNumber(int number) {
          return PaymentType.forNumber(number);
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
    return com.google.cloud.channel.v1.OffersProto.getDescriptor().getEnumTypes().get(2);
  }

  private static final PaymentType[] VALUES = values();

  public static PaymentType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
    if (desc.getType() != getDescriptor()) {
      throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
    }
    if (desc.getIndex() == -1) {
      return UNRECOGNIZED;
    }
    return VALUES[desc.getIndex()];
  }

  private final int value;

  private PaymentType(int value) {
    this.value = value;
  }

  // @@protoc_insertion_point(enum_scope:google.cloud.channel.v1.PaymentType)
}
