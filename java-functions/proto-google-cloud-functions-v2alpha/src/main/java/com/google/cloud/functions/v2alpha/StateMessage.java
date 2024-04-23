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
// source: google/cloud/functions/v2alpha/functions.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.functions.v2alpha;

/**
 *
 *
 * <pre>
 * Informational messages about the state of the Cloud Function or Operation.
 * </pre>
 *
 * Protobuf type {@code google.cloud.functions.v2alpha.StateMessage}
 */
public final class StateMessage extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.functions.v2alpha.StateMessage)
    StateMessageOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use StateMessage.newBuilder() to construct.
  private StateMessage(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private StateMessage() {
    severity_ = 0;
    type_ = "";
    message_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new StateMessage();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.functions.v2alpha.FunctionsProto
        .internal_static_google_cloud_functions_v2alpha_StateMessage_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.functions.v2alpha.FunctionsProto
        .internal_static_google_cloud_functions_v2alpha_StateMessage_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.functions.v2alpha.StateMessage.class,
            com.google.cloud.functions.v2alpha.StateMessage.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Severity of the state message.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.functions.v2alpha.StateMessage.Severity}
   */
  public enum Severity implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Not specified. Invalid severity.
     * </pre>
     *
     * <code>SEVERITY_UNSPECIFIED = 0;</code>
     */
    SEVERITY_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * ERROR-level severity.
     * </pre>
     *
     * <code>ERROR = 1;</code>
     */
    ERROR(1),
    /**
     *
     *
     * <pre>
     * WARNING-level severity.
     * </pre>
     *
     * <code>WARNING = 2;</code>
     */
    WARNING(2),
    /**
     *
     *
     * <pre>
     * INFO-level severity.
     * </pre>
     *
     * <code>INFO = 3;</code>
     */
    INFO(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Not specified. Invalid severity.
     * </pre>
     *
     * <code>SEVERITY_UNSPECIFIED = 0;</code>
     */
    public static final int SEVERITY_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * ERROR-level severity.
     * </pre>
     *
     * <code>ERROR = 1;</code>
     */
    public static final int ERROR_VALUE = 1;
    /**
     *
     *
     * <pre>
     * WARNING-level severity.
     * </pre>
     *
     * <code>WARNING = 2;</code>
     */
    public static final int WARNING_VALUE = 2;
    /**
     *
     *
     * <pre>
     * INFO-level severity.
     * </pre>
     *
     * <code>INFO = 3;</code>
     */
    public static final int INFO_VALUE = 3;

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
    public static Severity valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Severity forNumber(int value) {
      switch (value) {
        case 0:
          return SEVERITY_UNSPECIFIED;
        case 1:
          return ERROR;
        case 2:
          return WARNING;
        case 3:
          return INFO;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Severity> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Severity> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Severity>() {
          public Severity findValueByNumber(int number) {
            return Severity.forNumber(number);
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
      return com.google.cloud.functions.v2alpha.StateMessage.getDescriptor().getEnumTypes().get(0);
    }

    private static final Severity[] VALUES = values();

    public static Severity valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Severity(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.functions.v2alpha.StateMessage.Severity)
  }

  public static final int SEVERITY_FIELD_NUMBER = 1;
  private int severity_ = 0;
  /**
   *
   *
   * <pre>
   * Severity of the state message.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
   *
   * @return The enum numeric value on the wire for severity.
   */
  @java.lang.Override
  public int getSeverityValue() {
    return severity_;
  }
  /**
   *
   *
   * <pre>
   * Severity of the state message.
   * </pre>
   *
   * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
   *
   * @return The severity.
   */
  @java.lang.Override
  public com.google.cloud.functions.v2alpha.StateMessage.Severity getSeverity() {
    com.google.cloud.functions.v2alpha.StateMessage.Severity result =
        com.google.cloud.functions.v2alpha.StateMessage.Severity.forNumber(severity_);
    return result == null
        ? com.google.cloud.functions.v2alpha.StateMessage.Severity.UNRECOGNIZED
        : result;
  }

  public static final int TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   *
   *
   * <pre>
   * One-word CamelCase type of the state message.
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The type.
   */
  @java.lang.Override
  public java.lang.String getType() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      type_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * One-word CamelCase type of the state message.
   * </pre>
   *
   * <code>string type = 2;</code>
   *
   * @return The bytes for type.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTypeBytes() {
    java.lang.Object ref = type_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      type_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int MESSAGE_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object message_ = "";
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The message.
   */
  @java.lang.Override
  public java.lang.String getMessage() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      message_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The message.
   * </pre>
   *
   * <code>string message = 3;</code>
   *
   * @return The bytes for message.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMessageBytes() {
    java.lang.Object ref = message_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      message_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  private byte memoizedIsInitialized = -1;

  @java.lang.Override
  public final boolean isInitialized() {
    byte isInitialized = memoizedIsInitialized;
    if (isInitialized == 1) return true;
    if (isInitialized == 0) return false;

    memoizedIsInitialized = 1;
    return true;
  }

  @java.lang.Override
  public void writeTo(com.google.protobuf.CodedOutputStream output) throws java.io.IOException {
    if (severity_
        != com.google.cloud.functions.v2alpha.StateMessage.Severity.SEVERITY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, severity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, message_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (severity_
        != com.google.cloud.functions.v2alpha.StateMessage.Severity.SEVERITY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, severity_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, type_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(message_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, message_);
    }
    size += getUnknownFields().getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.cloud.functions.v2alpha.StateMessage)) {
      return super.equals(obj);
    }
    com.google.cloud.functions.v2alpha.StateMessage other =
        (com.google.cloud.functions.v2alpha.StateMessage) obj;

    if (severity_ != other.severity_) return false;
    if (!getType().equals(other.getType())) return false;
    if (!getMessage().equals(other.getMessage())) return false;
    if (!getUnknownFields().equals(other.getUnknownFields())) return false;
    return true;
  }

  @java.lang.Override
  public int hashCode() {
    if (memoizedHashCode != 0) {
      return memoizedHashCode;
    }
    int hash = 41;
    hash = (19 * hash) + getDescriptor().hashCode();
    hash = (37 * hash) + SEVERITY_FIELD_NUMBER;
    hash = (53 * hash) + severity_;
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    hash = (37 * hash) + MESSAGE_FIELD_NUMBER;
    hash = (53 * hash) + getMessage().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.functions.v2alpha.StateMessage parseFrom(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  @java.lang.Override
  public Builder newBuilderForType() {
    return newBuilder();
  }

  public static Builder newBuilder() {
    return DEFAULT_INSTANCE.toBuilder();
  }

  public static Builder newBuilder(com.google.cloud.functions.v2alpha.StateMessage prototype) {
    return DEFAULT_INSTANCE.toBuilder().mergeFrom(prototype);
  }

  @java.lang.Override
  public Builder toBuilder() {
    return this == DEFAULT_INSTANCE ? new Builder() : new Builder().mergeFrom(this);
  }

  @java.lang.Override
  protected Builder newBuilderForType(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
    Builder builder = new Builder(parent);
    return builder;
  }
  /**
   *
   *
   * <pre>
   * Informational messages about the state of the Cloud Function or Operation.
   * </pre>
   *
   * Protobuf type {@code google.cloud.functions.v2alpha.StateMessage}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.functions.v2alpha.StateMessage)
      com.google.cloud.functions.v2alpha.StateMessageOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.functions.v2alpha.FunctionsProto
          .internal_static_google_cloud_functions_v2alpha_StateMessage_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.functions.v2alpha.FunctionsProto
          .internal_static_google_cloud_functions_v2alpha_StateMessage_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.functions.v2alpha.StateMessage.class,
              com.google.cloud.functions.v2alpha.StateMessage.Builder.class);
    }

    // Construct using com.google.cloud.functions.v2alpha.StateMessage.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      severity_ = 0;
      type_ = "";
      message_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.functions.v2alpha.FunctionsProto
          .internal_static_google_cloud_functions_v2alpha_StateMessage_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2alpha.StateMessage getDefaultInstanceForType() {
      return com.google.cloud.functions.v2alpha.StateMessage.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.functions.v2alpha.StateMessage build() {
      com.google.cloud.functions.v2alpha.StateMessage result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.functions.v2alpha.StateMessage buildPartial() {
      com.google.cloud.functions.v2alpha.StateMessage result =
          new com.google.cloud.functions.v2alpha.StateMessage(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.functions.v2alpha.StateMessage result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.severity_ = severity_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.type_ = type_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.message_ = message_;
      }
    }

    @java.lang.Override
    public Builder clone() {
      return super.clone();
    }

    @java.lang.Override
    public Builder setField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.setField(field, value);
    }

    @java.lang.Override
    public Builder clearField(com.google.protobuf.Descriptors.FieldDescriptor field) {
      return super.clearField(field);
    }

    @java.lang.Override
    public Builder clearOneof(com.google.protobuf.Descriptors.OneofDescriptor oneof) {
      return super.clearOneof(oneof);
    }

    @java.lang.Override
    public Builder setRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, int index, java.lang.Object value) {
      return super.setRepeatedField(field, index, value);
    }

    @java.lang.Override
    public Builder addRepeatedField(
        com.google.protobuf.Descriptors.FieldDescriptor field, java.lang.Object value) {
      return super.addRepeatedField(field, value);
    }

    @java.lang.Override
    public Builder mergeFrom(com.google.protobuf.Message other) {
      if (other instanceof com.google.cloud.functions.v2alpha.StateMessage) {
        return mergeFrom((com.google.cloud.functions.v2alpha.StateMessage) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.functions.v2alpha.StateMessage other) {
      if (other == com.google.cloud.functions.v2alpha.StateMessage.getDefaultInstance())
        return this;
      if (other.severity_ != 0) {
        setSeverityValue(other.getSeverityValue());
      }
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getMessage().isEmpty()) {
        message_ = other.message_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      this.mergeUnknownFields(other.getUnknownFields());
      onChanged();
      return this;
    }

    @java.lang.Override
    public final boolean isInitialized() {
      return true;
    }

    @java.lang.Override
    public Builder mergeFrom(
        com.google.protobuf.CodedInputStream input,
        com.google.protobuf.ExtensionRegistryLite extensionRegistry)
        throws java.io.IOException {
      if (extensionRegistry == null) {
        throw new java.lang.NullPointerException();
      }
      try {
        boolean done = false;
        while (!done) {
          int tag = input.readTag();
          switch (tag) {
            case 0:
              done = true;
              break;
            case 8:
              {
                severity_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                message_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            default:
              {
                if (!super.parseUnknownField(input, extensionRegistry, tag)) {
                  done = true; // was an endgroup tag
                }
                break;
              } // default:
          } // switch (tag)
        } // while (!done)
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        throw e.unwrapIOException();
      } finally {
        onChanged();
      } // finally
      return this;
    }

    private int bitField0_;

    private int severity_ = 0;
    /**
     *
     *
     * <pre>
     * Severity of the state message.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
     *
     * @return The enum numeric value on the wire for severity.
     */
    @java.lang.Override
    public int getSeverityValue() {
      return severity_;
    }
    /**
     *
     *
     * <pre>
     * Severity of the state message.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
     *
     * @param value The enum numeric value on the wire for severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverityValue(int value) {
      severity_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Severity of the state message.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
     *
     * @return The severity.
     */
    @java.lang.Override
    public com.google.cloud.functions.v2alpha.StateMessage.Severity getSeverity() {
      com.google.cloud.functions.v2alpha.StateMessage.Severity result =
          com.google.cloud.functions.v2alpha.StateMessage.Severity.forNumber(severity_);
      return result == null
          ? com.google.cloud.functions.v2alpha.StateMessage.Severity.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Severity of the state message.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
     *
     * @param value The severity to set.
     * @return This builder for chaining.
     */
    public Builder setSeverity(com.google.cloud.functions.v2alpha.StateMessage.Severity value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      severity_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Severity of the state message.
     * </pre>
     *
     * <code>.google.cloud.functions.v2alpha.StateMessage.Severity severity = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSeverity() {
      bitField0_ = (bitField0_ & ~0x00000001);
      severity_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object type_ = "";
    /**
     *
     *
     * <pre>
     * One-word CamelCase type of the state message.
     * </pre>
     *
     * <code>string type = 2;</code>
     *
     * @return The type.
     */
    public java.lang.String getType() {
      java.lang.Object ref = type_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        type_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * One-word CamelCase type of the state message.
     * </pre>
     *
     * <code>string type = 2;</code>
     *
     * @return The bytes for type.
     */
    public com.google.protobuf.ByteString getTypeBytes() {
      java.lang.Object ref = type_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        type_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * One-word CamelCase type of the state message.
     * </pre>
     *
     * <code>string type = 2;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * One-word CamelCase type of the state message.
     * </pre>
     *
     * <code>string type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * One-word CamelCase type of the state message.
     * </pre>
     *
     * <code>string type = 2;</code>
     *
     * @param value The bytes for type to set.
     * @return This builder for chaining.
     */
    public Builder setTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      type_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object message_ = "";
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @return The message.
     */
    public java.lang.String getMessage() {
      java.lang.Object ref = message_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        message_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @return The bytes for message.
     */
    public com.google.protobuf.ByteString getMessageBytes() {
      java.lang.Object ref = message_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        message_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @param value The message to set.
     * @return This builder for chaining.
     */
    public Builder setMessage(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMessage() {
      message_ = getDefaultInstance().getMessage();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The message.
     * </pre>
     *
     * <code>string message = 3;</code>
     *
     * @param value The bytes for message to set.
     * @return This builder for chaining.
     */
    public Builder setMessageBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      message_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    @java.lang.Override
    public final Builder setUnknownFields(final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.setUnknownFields(unknownFields);
    }

    @java.lang.Override
    public final Builder mergeUnknownFields(
        final com.google.protobuf.UnknownFieldSet unknownFields) {
      return super.mergeUnknownFields(unknownFields);
    }

    // @@protoc_insertion_point(builder_scope:google.cloud.functions.v2alpha.StateMessage)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.functions.v2alpha.StateMessage)
  private static final com.google.cloud.functions.v2alpha.StateMessage DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.functions.v2alpha.StateMessage();
  }

  public static com.google.cloud.functions.v2alpha.StateMessage getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<StateMessage> PARSER =
      new com.google.protobuf.AbstractParser<StateMessage>() {
        @java.lang.Override
        public StateMessage parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          Builder builder = newBuilder();
          try {
            builder.mergeFrom(input, extensionRegistry);
          } catch (com.google.protobuf.InvalidProtocolBufferException e) {
            throw e.setUnfinishedMessage(builder.buildPartial());
          } catch (com.google.protobuf.UninitializedMessageException e) {
            throw e.asInvalidProtocolBufferException().setUnfinishedMessage(builder.buildPartial());
          } catch (java.io.IOException e) {
            throw new com.google.protobuf.InvalidProtocolBufferException(e)
                .setUnfinishedMessage(builder.buildPartial());
          }
          return builder.buildPartial();
        }
      };

  public static com.google.protobuf.Parser<StateMessage> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<StateMessage> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.functions.v2alpha.StateMessage getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
