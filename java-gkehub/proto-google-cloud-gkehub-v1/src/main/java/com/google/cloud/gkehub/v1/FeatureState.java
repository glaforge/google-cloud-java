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
// source: google/cloud/gkehub/v1/feature.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1;

/**
 *
 *
 * <pre>
 * FeatureState describes the high-level state of a Feature. It may be used to
 * describe a Feature's state at the environ-level, or per-membershop, depending
 * on the context.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1.FeatureState}
 */
public final class FeatureState extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1.FeatureState)
    FeatureStateOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FeatureState.newBuilder() to construct.
  private FeatureState(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FeatureState() {
    code_ = 0;
    description_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FeatureState();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_FeatureState_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1.FeatureProto
        .internal_static_google_cloud_gkehub_v1_FeatureState_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1.FeatureState.class,
            com.google.cloud.gkehub.v1.FeatureState.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Code represents a machine-readable, high-level status of the Feature.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.gkehub.v1.FeatureState.Code}
   */
  public enum Code implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unknown or not set.
     * </pre>
     *
     * <code>CODE_UNSPECIFIED = 0;</code>
     */
    CODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The Feature is operating normally.
     * </pre>
     *
     * <code>OK = 1;</code>
     */
    OK(1),
    /**
     *
     *
     * <pre>
     * The Feature has encountered an issue, and is operating in a degraded
     * state. The Feature may need intervention to return to normal operation.
     * See the description and any associated Feature-specific details for more
     * information.
     * </pre>
     *
     * <code>WARNING = 2;</code>
     */
    WARNING(2),
    /**
     *
     *
     * <pre>
     * The Feature is not operating or is in a severely degraded state.
     * The Feature may need intervention to return to normal operation.
     * See the description and any associated Feature-specific details for more
     * information.
     * </pre>
     *
     * <code>ERROR = 3;</code>
     */
    ERROR(3),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unknown or not set.
     * </pre>
     *
     * <code>CODE_UNSPECIFIED = 0;</code>
     */
    public static final int CODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The Feature is operating normally.
     * </pre>
     *
     * <code>OK = 1;</code>
     */
    public static final int OK_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The Feature has encountered an issue, and is operating in a degraded
     * state. The Feature may need intervention to return to normal operation.
     * See the description and any associated Feature-specific details for more
     * information.
     * </pre>
     *
     * <code>WARNING = 2;</code>
     */
    public static final int WARNING_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The Feature is not operating or is in a severely degraded state.
     * The Feature may need intervention to return to normal operation.
     * See the description and any associated Feature-specific details for more
     * information.
     * </pre>
     *
     * <code>ERROR = 3;</code>
     */
    public static final int ERROR_VALUE = 3;

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
    public static Code valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Code forNumber(int value) {
      switch (value) {
        case 0:
          return CODE_UNSPECIFIED;
        case 1:
          return OK;
        case 2:
          return WARNING;
        case 3:
          return ERROR;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Code> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Code> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Code>() {
          public Code findValueByNumber(int number) {
            return Code.forNumber(number);
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
      return com.google.cloud.gkehub.v1.FeatureState.getDescriptor().getEnumTypes().get(0);
    }

    private static final Code[] VALUES = values();

    public static Code valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Code(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.gkehub.v1.FeatureState.Code)
  }

  private int bitField0_;
  public static final int CODE_FIELD_NUMBER = 1;
  private int code_ = 0;
  /**
   *
   *
   * <pre>
   * The high-level, machine-readable status of this Feature.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
   *
   * @return The enum numeric value on the wire for code.
   */
  @java.lang.Override
  public int getCodeValue() {
    return code_;
  }
  /**
   *
   *
   * <pre>
   * The high-level, machine-readable status of this Feature.
   * </pre>
   *
   * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
   *
   * @return The code.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1.FeatureState.Code getCode() {
    com.google.cloud.gkehub.v1.FeatureState.Code result =
        com.google.cloud.gkehub.v1.FeatureState.Code.forNumber(code_);
    return result == null ? com.google.cloud.gkehub.v1.FeatureState.Code.UNRECOGNIZED : result;
  }

  public static final int DESCRIPTION_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object description_ = "";
  /**
   *
   *
   * <pre>
   * A human-readable description of the current status.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The description.
   */
  @java.lang.Override
  public java.lang.String getDescription() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      description_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A human-readable description of the current status.
   * </pre>
   *
   * <code>string description = 2;</code>
   *
   * @return The bytes for description.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDescriptionBytes() {
    java.lang.Object ref = description_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      description_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int UPDATE_TIME_FIELD_NUMBER = 3;
  private com.google.protobuf.Timestamp updateTime_;
  /**
   *
   *
   * <pre>
   * The time this status and any related Feature-specific details were updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return Whether the updateTime field is set.
   */
  @java.lang.Override
  public boolean hasUpdateTime() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The time this status and any related Feature-specific details were updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   *
   * @return The updateTime.
   */
  @java.lang.Override
  public com.google.protobuf.Timestamp getUpdateTime() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
  }
  /**
   *
   *
   * <pre>
   * The time this status and any related Feature-specific details were updated.
   * </pre>
   *
   * <code>.google.protobuf.Timestamp update_time = 3;</code>
   */
  @java.lang.Override
  public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
    return updateTime_ == null ? com.google.protobuf.Timestamp.getDefaultInstance() : updateTime_;
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
    if (code_ != com.google.cloud.gkehub.v1.FeatureState.Code.CODE_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, description_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getUpdateTime());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (code_ != com.google.cloud.gkehub.v1.FeatureState.Code.CODE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, code_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(description_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, description_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getUpdateTime());
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
    if (!(obj instanceof com.google.cloud.gkehub.v1.FeatureState)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1.FeatureState other = (com.google.cloud.gkehub.v1.FeatureState) obj;

    if (code_ != other.code_) return false;
    if (!getDescription().equals(other.getDescription())) return false;
    if (hasUpdateTime() != other.hasUpdateTime()) return false;
    if (hasUpdateTime()) {
      if (!getUpdateTime().equals(other.getUpdateTime())) return false;
    }
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
    hash = (37 * hash) + CODE_FIELD_NUMBER;
    hash = (53 * hash) + code_;
    hash = (37 * hash) + DESCRIPTION_FIELD_NUMBER;
    hash = (53 * hash) + getDescription().hashCode();
    if (hasUpdateTime()) {
      hash = (37 * hash) + UPDATE_TIME_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateTime().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1.FeatureState parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1.FeatureState prototype) {
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
   * FeatureState describes the high-level state of a Feature. It may be used to
   * describe a Feature's state at the environ-level, or per-membershop, depending
   * on the context.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1.FeatureState}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1.FeatureState)
      com.google.cloud.gkehub.v1.FeatureStateOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_FeatureState_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_FeatureState_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1.FeatureState.class,
              com.google.cloud.gkehub.v1.FeatureState.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1.FeatureState.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getUpdateTimeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      code_ = 0;
      description_ = "";
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1.FeatureProto
          .internal_static_google_cloud_gkehub_v1_FeatureState_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.FeatureState getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.FeatureState build() {
      com.google.cloud.gkehub.v1.FeatureState result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1.FeatureState buildPartial() {
      com.google.cloud.gkehub.v1.FeatureState result =
          new com.google.cloud.gkehub.v1.FeatureState(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1.FeatureState result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.code_ = code_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.description_ = description_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.updateTime_ = updateTimeBuilder_ == null ? updateTime_ : updateTimeBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      result.bitField0_ |= to_bitField0_;
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
      if (other instanceof com.google.cloud.gkehub.v1.FeatureState) {
        return mergeFrom((com.google.cloud.gkehub.v1.FeatureState) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1.FeatureState other) {
      if (other == com.google.cloud.gkehub.v1.FeatureState.getDefaultInstance()) return this;
      if (other.code_ != 0) {
        setCodeValue(other.getCodeValue());
      }
      if (!other.getDescription().isEmpty()) {
        description_ = other.description_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.hasUpdateTime()) {
        mergeUpdateTime(other.getUpdateTime());
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
                code_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                description_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                input.readMessage(getUpdateTimeFieldBuilder().getBuilder(), extensionRegistry);
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

    private int code_ = 0;
    /**
     *
     *
     * <pre>
     * The high-level, machine-readable status of this Feature.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
     *
     * @return The enum numeric value on the wire for code.
     */
    @java.lang.Override
    public int getCodeValue() {
      return code_;
    }
    /**
     *
     *
     * <pre>
     * The high-level, machine-readable status of this Feature.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
     *
     * @param value The enum numeric value on the wire for code to set.
     * @return This builder for chaining.
     */
    public Builder setCodeValue(int value) {
      code_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The high-level, machine-readable status of this Feature.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
     *
     * @return The code.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.v1.FeatureState.Code getCode() {
      com.google.cloud.gkehub.v1.FeatureState.Code result =
          com.google.cloud.gkehub.v1.FeatureState.Code.forNumber(code_);
      return result == null ? com.google.cloud.gkehub.v1.FeatureState.Code.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The high-level, machine-readable status of this Feature.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
     *
     * @param value The code to set.
     * @return This builder for chaining.
     */
    public Builder setCode(com.google.cloud.gkehub.v1.FeatureState.Code value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      code_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The high-level, machine-readable status of this Feature.
     * </pre>
     *
     * <code>.google.cloud.gkehub.v1.FeatureState.Code code = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCode() {
      bitField0_ = (bitField0_ & ~0x00000001);
      code_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object description_ = "";
    /**
     *
     *
     * <pre>
     * A human-readable description of the current status.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The description.
     */
    public java.lang.String getDescription() {
      java.lang.Object ref = description_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        description_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A human-readable description of the current status.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return The bytes for description.
     */
    public com.google.protobuf.ByteString getDescriptionBytes() {
      java.lang.Object ref = description_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        description_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A human-readable description of the current status.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The description to set.
     * @return This builder for chaining.
     */
    public Builder setDescription(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A human-readable description of the current status.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDescription() {
      description_ = getDefaultInstance().getDescription();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A human-readable description of the current status.
     * </pre>
     *
     * <code>string description = 2;</code>
     *
     * @param value The bytes for description to set.
     * @return This builder for chaining.
     */
    public Builder setDescriptionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      description_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private com.google.protobuf.Timestamp updateTime_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        updateTimeBuilder_;
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     *
     * @return Whether the updateTime field is set.
     */
    public boolean hasUpdateTime() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     *
     * @return The updateTime.
     */
    public com.google.protobuf.Timestamp getUpdateTime() {
      if (updateTimeBuilder_ == null) {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      } else {
        return updateTimeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateTime_ = value;
      } else {
        updateTimeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder setUpdateTime(com.google.protobuf.Timestamp.Builder builderForValue) {
      if (updateTimeBuilder_ == null) {
        updateTime_ = builderForValue.build();
      } else {
        updateTimeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder mergeUpdateTime(com.google.protobuf.Timestamp value) {
      if (updateTimeBuilder_ == null) {
        if (((bitField0_ & 0x00000004) != 0)
            && updateTime_ != null
            && updateTime_ != com.google.protobuf.Timestamp.getDefaultInstance()) {
          getUpdateTimeBuilder().mergeFrom(value);
        } else {
          updateTime_ = value;
        }
      } else {
        updateTimeBuilder_.mergeFrom(value);
      }
      if (updateTime_ != null) {
        bitField0_ |= 0x00000004;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public Builder clearUpdateTime() {
      bitField0_ = (bitField0_ & ~0x00000004);
      updateTime_ = null;
      if (updateTimeBuilder_ != null) {
        updateTimeBuilder_.dispose();
        updateTimeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.Timestamp.Builder getUpdateTimeBuilder() {
      bitField0_ |= 0x00000004;
      onChanged();
      return getUpdateTimeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    public com.google.protobuf.TimestampOrBuilder getUpdateTimeOrBuilder() {
      if (updateTimeBuilder_ != null) {
        return updateTimeBuilder_.getMessageOrBuilder();
      } else {
        return updateTime_ == null
            ? com.google.protobuf.Timestamp.getDefaultInstance()
            : updateTime_;
      }
    }
    /**
     *
     *
     * <pre>
     * The time this status and any related Feature-specific details were updated.
     * </pre>
     *
     * <code>.google.protobuf.Timestamp update_time = 3;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.Timestamp,
            com.google.protobuf.Timestamp.Builder,
            com.google.protobuf.TimestampOrBuilder>
        getUpdateTimeFieldBuilder() {
      if (updateTimeBuilder_ == null) {
        updateTimeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.Timestamp,
                com.google.protobuf.Timestamp.Builder,
                com.google.protobuf.TimestampOrBuilder>(
                getUpdateTime(), getParentForChildren(), isClean());
        updateTime_ = null;
      }
      return updateTimeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1.FeatureState)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1.FeatureState)
  private static final com.google.cloud.gkehub.v1.FeatureState DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1.FeatureState();
  }

  public static com.google.cloud.gkehub.v1.FeatureState getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FeatureState> PARSER =
      new com.google.protobuf.AbstractParser<FeatureState>() {
        @java.lang.Override
        public FeatureState parsePartialFrom(
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

  public static com.google.protobuf.Parser<FeatureState> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FeatureState> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1.FeatureState getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
