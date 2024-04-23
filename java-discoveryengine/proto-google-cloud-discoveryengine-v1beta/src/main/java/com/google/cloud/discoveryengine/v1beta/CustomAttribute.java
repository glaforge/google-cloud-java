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
// source: google/cloud/discoveryengine/v1beta/common.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * A custom attribute that is not explicitly modeled in a resource, e.g.
 * [UserEvent][google.cloud.discoveryengine.v1beta.UserEvent].
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.CustomAttribute}
 */
public final class CustomAttribute extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.CustomAttribute)
    CustomAttributeOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CustomAttribute.newBuilder() to construct.
  private CustomAttribute(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CustomAttribute() {
    text_ = com.google.protobuf.LazyStringArrayList.emptyList();
    numbers_ = emptyDoubleList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CustomAttribute();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.CommonProto
        .internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.CommonProto
        .internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.CustomAttribute.class,
            com.google.cloud.discoveryengine.v1beta.CustomAttribute.Builder.class);
  }

  public static final int TEXT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList text_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   *
   * @return A list containing the text.
   */
  public com.google.protobuf.ProtocolStringList getTextList() {
    return text_;
  }
  /**
   *
   *
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   *
   * @return The count of text.
   */
  public int getTextCount() {
    return text_.size();
  }
  /**
   *
   *
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The text at the given index.
   */
  public java.lang.String getText(int index) {
    return text_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The textual values of this custom attribute. For example, `["yellow",
   * "green"]` when the key is "color".
   *
   * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
   * returned.
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated string text = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the text at the given index.
   */
  public com.google.protobuf.ByteString getTextBytes(int index) {
    return text_.getByteString(index);
  }

  public static final int NUMBERS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.DoubleList numbers_ = emptyDoubleList();
  /**
   *
   *
   * <pre>
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
   * when the key is "lengths_cm".
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated double numbers = 2;</code>
   *
   * @return A list containing the numbers.
   */
  @java.lang.Override
  public java.util.List<java.lang.Double> getNumbersList() {
    return numbers_;
  }
  /**
   *
   *
   * <pre>
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
   * when the key is "lengths_cm".
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated double numbers = 2;</code>
   *
   * @return The count of numbers.
   */
  public int getNumbersCount() {
    return numbers_.size();
  }
  /**
   *
   *
   * <pre>
   * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
   * when the key is "lengths_cm".
   *
   * Exactly one of
   * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
   * or
   * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
   * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
   * </pre>
   *
   * <code>repeated double numbers = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The numbers at the given index.
   */
  public double getNumbers(int index) {
    return numbers_.getDouble(index);
  }

  private int numbersMemoizedSerializedSize = -1;

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
    getSerializedSize();
    for (int i = 0; i < text_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, text_.getRaw(i));
    }
    if (getNumbersList().size() > 0) {
      output.writeUInt32NoTag(18);
      output.writeUInt32NoTag(numbersMemoizedSerializedSize);
    }
    for (int i = 0; i < numbers_.size(); i++) {
      output.writeDoubleNoTag(numbers_.getDouble(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < text_.size(); i++) {
        dataSize += computeStringSizeNoTag(text_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getTextList().size();
    }
    {
      int dataSize = 0;
      dataSize = 8 * getNumbersList().size();
      size += dataSize;
      if (!getNumbersList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      numbersMemoizedSerializedSize = dataSize;
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.CustomAttribute)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.CustomAttribute other =
        (com.google.cloud.discoveryengine.v1beta.CustomAttribute) obj;

    if (!getTextList().equals(other.getTextList())) return false;
    if (!getNumbersList().equals(other.getNumbersList())) return false;
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
    if (getTextCount() > 0) {
      hash = (37 * hash) + TEXT_FIELD_NUMBER;
      hash = (53 * hash) + getTextList().hashCode();
    }
    if (getNumbersCount() > 0) {
      hash = (37 * hash) + NUMBERS_FIELD_NUMBER;
      hash = (53 * hash) + getNumbersList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute parseFrom(
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
      com.google.cloud.discoveryengine.v1beta.CustomAttribute prototype) {
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
   * A custom attribute that is not explicitly modeled in a resource, e.g.
   * [UserEvent][google.cloud.discoveryengine.v1beta.UserEvent].
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.CustomAttribute}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.CustomAttribute)
      com.google.cloud.discoveryengine.v1beta.CustomAttributeOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.CommonProto
          .internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.CommonProto
          .internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.CustomAttribute.class,
              com.google.cloud.discoveryengine.v1beta.CustomAttribute.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.CustomAttribute.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      text_ = com.google.protobuf.LazyStringArrayList.emptyList();
      numbers_ = emptyDoubleList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.CommonProto
          .internal_static_google_cloud_discoveryengine_v1beta_CustomAttribute_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.CustomAttribute getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.CustomAttribute.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.CustomAttribute build() {
      com.google.cloud.discoveryengine.v1beta.CustomAttribute result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.CustomAttribute buildPartial() {
      com.google.cloud.discoveryengine.v1beta.CustomAttribute result =
          new com.google.cloud.discoveryengine.v1beta.CustomAttribute(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1beta.CustomAttribute result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        text_.makeImmutable();
        result.text_ = text_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        numbers_.makeImmutable();
        result.numbers_ = numbers_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.CustomAttribute) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.CustomAttribute) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1beta.CustomAttribute other) {
      if (other == com.google.cloud.discoveryengine.v1beta.CustomAttribute.getDefaultInstance())
        return this;
      if (!other.text_.isEmpty()) {
        if (text_.isEmpty()) {
          text_ = other.text_;
          bitField0_ |= 0x00000001;
        } else {
          ensureTextIsMutable();
          text_.addAll(other.text_);
        }
        onChanged();
      }
      if (!other.numbers_.isEmpty()) {
        if (numbers_.isEmpty()) {
          numbers_ = other.numbers_;
          numbers_.makeImmutable();
          bitField0_ |= 0x00000002;
        } else {
          ensureNumbersIsMutable();
          numbers_.addAll(other.numbers_);
        }
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
            case 10:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureTextIsMutable();
                text_.add(s);
                break;
              } // case 10
            case 17:
              {
                double v = input.readDouble();
                ensureNumbersIsMutable();
                numbers_.addDouble(v);
                break;
              } // case 17
            case 18:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                int alloc = length > 4096 ? 4096 : length;
                ensureNumbersIsMutable(alloc / 8);
                while (input.getBytesUntilLimit() > 0) {
                  numbers_.addDouble(input.readDouble());
                }
                input.popLimit(limit);
                break;
              } // case 18
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

    private com.google.protobuf.LazyStringArrayList text_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureTextIsMutable() {
      if (!text_.isModifiable()) {
        text_ = new com.google.protobuf.LazyStringArrayList(text_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @return A list containing the text.
     */
    public com.google.protobuf.ProtocolStringList getTextList() {
      text_.makeImmutable();
      return text_;
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @return The count of text.
     */
    public int getTextCount() {
      return text_.size();
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The text at the given index.
     */
    public java.lang.String getText(int index) {
      return text_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the text at the given index.
     */
    public com.google.protobuf.ByteString getTextBytes(int index) {
      return text_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The text to set.
     * @return This builder for chaining.
     */
    public Builder setText(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTextIsMutable();
      text_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @param value The text to add.
     * @return This builder for chaining.
     */
    public Builder addText(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTextIsMutable();
      text_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @param values The text to add.
     * @return This builder for chaining.
     */
    public Builder addAllText(java.lang.Iterable<java.lang.String> values) {
      ensureTextIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, text_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearText() {
      text_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The textual values of this custom attribute. For example, `["yellow",
     * "green"]` when the key is "color".
     *
     * Empty string is not allowed. Otherwise, an `INVALID_ARGUMENT` error is
     * returned.
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated string text = 1;</code>
     *
     * @param value The bytes of the text to add.
     * @return This builder for chaining.
     */
    public Builder addTextBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureTextIsMutable();
      text_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.Internal.DoubleList numbers_ = emptyDoubleList();

    private void ensureNumbersIsMutable() {
      if (!numbers_.isModifiable()) {
        numbers_ = makeMutableCopy(numbers_);
      }
      bitField0_ |= 0x00000002;
    }

    private void ensureNumbersIsMutable(int capacity) {
      if (!numbers_.isModifiable()) {
        numbers_ = makeMutableCopy(numbers_, capacity);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @return A list containing the numbers.
     */
    public java.util.List<java.lang.Double> getNumbersList() {
      numbers_.makeImmutable();
      return numbers_;
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @return The count of numbers.
     */
    public int getNumbersCount() {
      return numbers_.size();
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The numbers at the given index.
     */
    public double getNumbers(int index) {
      return numbers_.getDouble(index);
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The numbers to set.
     * @return This builder for chaining.
     */
    public Builder setNumbers(int index, double value) {

      ensureNumbersIsMutable();
      numbers_.setDouble(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @param value The numbers to add.
     * @return This builder for chaining.
     */
    public Builder addNumbers(double value) {

      ensureNumbersIsMutable();
      numbers_.addDouble(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @param values The numbers to add.
     * @return This builder for chaining.
     */
    public Builder addAllNumbers(java.lang.Iterable<? extends java.lang.Double> values) {
      ensureNumbersIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, numbers_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The numerical values of this custom attribute. For example, `[2.3, 15.4]`
     * when the key is "lengths_cm".
     *
     * Exactly one of
     * [CustomAttribute.text][google.cloud.discoveryengine.v1beta.CustomAttribute.text]
     * or
     * [CustomAttribute.numbers][google.cloud.discoveryengine.v1beta.CustomAttribute.numbers]
     * should be set. Otherwise, an `INVALID_ARGUMENT` error is returned.
     * </pre>
     *
     * <code>repeated double numbers = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumbers() {
      numbers_ = emptyDoubleList();
      bitField0_ = (bitField0_ & ~0x00000002);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.CustomAttribute)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.CustomAttribute)
  private static final com.google.cloud.discoveryengine.v1beta.CustomAttribute DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.CustomAttribute();
  }

  public static com.google.cloud.discoveryengine.v1beta.CustomAttribute getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CustomAttribute> PARSER =
      new com.google.protobuf.AbstractParser<CustomAttribute>() {
        @java.lang.Override
        public CustomAttribute parsePartialFrom(
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

  public static com.google.protobuf.Parser<CustomAttribute> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CustomAttribute> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.CustomAttribute getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
