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
// source: google/cloud/optimization/v1/fleet_routing.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.optimization.v1;

/**
 *
 *
 * <pre>
 * Deprecated: Use
 * [Vehicle.LoadLimit.Interval][google.cloud.optimization.v1.Vehicle.LoadLimit.Interval]
 * instead.
 * </pre>
 *
 * Protobuf type {@code google.cloud.optimization.v1.CapacityQuantityInterval}
 */
@java.lang.Deprecated
public final class CapacityQuantityInterval extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.optimization.v1.CapacityQuantityInterval)
    CapacityQuantityIntervalOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CapacityQuantityInterval.newBuilder() to construct.
  private CapacityQuantityInterval(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CapacityQuantityInterval() {
    type_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CapacityQuantityInterval();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.optimization.v1.FleetRoutingProto
        .internal_static_google_cloud_optimization_v1_CapacityQuantityInterval_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.optimization.v1.FleetRoutingProto
        .internal_static_google_cloud_optimization_v1_CapacityQuantityInterval_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.optimization.v1.CapacityQuantityInterval.class,
            com.google.cloud.optimization.v1.CapacityQuantityInterval.Builder.class);
  }

  private int bitField0_;
  public static final int TYPE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object type_ = "";
  /**
   * <code>string type = 1;</code>
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
   * <code>string type = 1;</code>
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

  public static final int MIN_VALUE_FIELD_NUMBER = 2;
  private long minValue_ = 0L;
  /**
   * <code>optional int64 min_value = 2;</code>
   *
   * @return Whether the minValue field is set.
   */
  @java.lang.Override
  public boolean hasMinValue() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional int64 min_value = 2;</code>
   *
   * @return The minValue.
   */
  @java.lang.Override
  public long getMinValue() {
    return minValue_;
  }

  public static final int MAX_VALUE_FIELD_NUMBER = 3;
  private long maxValue_ = 0L;
  /**
   * <code>optional int64 max_value = 3;</code>
   *
   * @return Whether the maxValue field is set.
   */
  @java.lang.Override
  public boolean hasMaxValue() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   * <code>optional int64 max_value = 3;</code>
   *
   * @return The maxValue.
   */
  @java.lang.Override
  public long getMaxValue() {
    return maxValue_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt64(2, minValue_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeInt64(3, maxValue_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(type_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, type_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(2, minValue_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, maxValue_);
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
    if (!(obj instanceof com.google.cloud.optimization.v1.CapacityQuantityInterval)) {
      return super.equals(obj);
    }
    com.google.cloud.optimization.v1.CapacityQuantityInterval other =
        (com.google.cloud.optimization.v1.CapacityQuantityInterval) obj;

    if (!getType().equals(other.getType())) return false;
    if (hasMinValue() != other.hasMinValue()) return false;
    if (hasMinValue()) {
      if (getMinValue() != other.getMinValue()) return false;
    }
    if (hasMaxValue() != other.hasMaxValue()) return false;
    if (hasMaxValue()) {
      if (getMaxValue() != other.getMaxValue()) return false;
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
    hash = (37 * hash) + TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getType().hashCode();
    if (hasMinValue()) {
      hash = (37 * hash) + MIN_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMinValue());
    }
    if (hasMaxValue()) {
      hash = (37 * hash) + MAX_VALUE_FIELD_NUMBER;
      hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getMaxValue());
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval parseFrom(
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

  public static Builder newBuilder(
      com.google.cloud.optimization.v1.CapacityQuantityInterval prototype) {
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
   * Deprecated: Use
   * [Vehicle.LoadLimit.Interval][google.cloud.optimization.v1.Vehicle.LoadLimit.Interval]
   * instead.
   * </pre>
   *
   * Protobuf type {@code google.cloud.optimization.v1.CapacityQuantityInterval}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.optimization.v1.CapacityQuantityInterval)
      com.google.cloud.optimization.v1.CapacityQuantityIntervalOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_CapacityQuantityInterval_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_CapacityQuantityInterval_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.optimization.v1.CapacityQuantityInterval.class,
              com.google.cloud.optimization.v1.CapacityQuantityInterval.Builder.class);
    }

    // Construct using com.google.cloud.optimization.v1.CapacityQuantityInterval.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      type_ = "";
      minValue_ = 0L;
      maxValue_ = 0L;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.optimization.v1.FleetRoutingProto
          .internal_static_google_cloud_optimization_v1_CapacityQuantityInterval_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.CapacityQuantityInterval getDefaultInstanceForType() {
      return com.google.cloud.optimization.v1.CapacityQuantityInterval.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.CapacityQuantityInterval build() {
      com.google.cloud.optimization.v1.CapacityQuantityInterval result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.optimization.v1.CapacityQuantityInterval buildPartial() {
      com.google.cloud.optimization.v1.CapacityQuantityInterval result =
          new com.google.cloud.optimization.v1.CapacityQuantityInterval(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.optimization.v1.CapacityQuantityInterval result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.type_ = type_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.minValue_ = minValue_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.maxValue_ = maxValue_;
        to_bitField0_ |= 0x00000002;
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
      if (other instanceof com.google.cloud.optimization.v1.CapacityQuantityInterval) {
        return mergeFrom((com.google.cloud.optimization.v1.CapacityQuantityInterval) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.optimization.v1.CapacityQuantityInterval other) {
      if (other == com.google.cloud.optimization.v1.CapacityQuantityInterval.getDefaultInstance())
        return this;
      if (!other.getType().isEmpty()) {
        type_ = other.type_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasMinValue()) {
        setMinValue(other.getMinValue());
      }
      if (other.hasMaxValue()) {
        setMaxValue(other.getMaxValue());
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
            case 10:
              {
                type_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                minValue_ = input.readInt64();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                maxValue_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
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

    private java.lang.Object type_ = "";
    /**
     * <code>string type = 1;</code>
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
     * <code>string type = 1;</code>
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
     * <code>string type = 1;</code>
     *
     * @param value The type to set.
     * @return This builder for chaining.
     */
    public Builder setType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      type_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearType() {
      type_ = getDefaultInstance().getType();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     * <code>string type = 1;</code>
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
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private long minValue_;
    /**
     * <code>optional int64 min_value = 2;</code>
     *
     * @return Whether the minValue field is set.
     */
    @java.lang.Override
    public boolean hasMinValue() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     * <code>optional int64 min_value = 2;</code>
     *
     * @return The minValue.
     */
    @java.lang.Override
    public long getMinValue() {
      return minValue_;
    }
    /**
     * <code>optional int64 min_value = 2;</code>
     *
     * @param value The minValue to set.
     * @return This builder for chaining.
     */
    public Builder setMinValue(long value) {

      minValue_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 min_value = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMinValue() {
      bitField0_ = (bitField0_ & ~0x00000002);
      minValue_ = 0L;
      onChanged();
      return this;
    }

    private long maxValue_;
    /**
     * <code>optional int64 max_value = 3;</code>
     *
     * @return Whether the maxValue field is set.
     */
    @java.lang.Override
    public boolean hasMaxValue() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     * <code>optional int64 max_value = 3;</code>
     *
     * @return The maxValue.
     */
    @java.lang.Override
    public long getMaxValue() {
      return maxValue_;
    }
    /**
     * <code>optional int64 max_value = 3;</code>
     *
     * @param value The maxValue to set.
     * @return This builder for chaining.
     */
    public Builder setMaxValue(long value) {

      maxValue_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     * <code>optional int64 max_value = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxValue() {
      bitField0_ = (bitField0_ & ~0x00000004);
      maxValue_ = 0L;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.optimization.v1.CapacityQuantityInterval)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.optimization.v1.CapacityQuantityInterval)
  private static final com.google.cloud.optimization.v1.CapacityQuantityInterval DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.optimization.v1.CapacityQuantityInterval();
  }

  public static com.google.cloud.optimization.v1.CapacityQuantityInterval getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CapacityQuantityInterval> PARSER =
      new com.google.protobuf.AbstractParser<CapacityQuantityInterval>() {
        @java.lang.Override
        public CapacityQuantityInterval parsePartialFrom(
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

  public static com.google.protobuf.Parser<CapacityQuantityInterval> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CapacityQuantityInterval> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.optimization.v1.CapacityQuantityInterval getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
