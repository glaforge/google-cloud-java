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
// source: google/cloud/documentai/v1beta1/document_understanding.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1beta1;

/**
 *
 *
 * <pre>
 * User-provided hint for key value pair.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1beta1.KeyValuePairHint}
 */
public final class KeyValuePairHint extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1beta1.KeyValuePairHint)
    KeyValuePairHintOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use KeyValuePairHint.newBuilder() to construct.
  private KeyValuePairHint(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private KeyValuePairHint() {
    key_ = "";
    valueTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new KeyValuePairHint();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1beta1.DocumentAiProto
        .internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1beta1.KeyValuePairHint.class,
            com.google.cloud.documentai.v1beta1.KeyValuePairHint.Builder.class);
  }

  public static final int KEY_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object key_ = "";
  /**
   *
   *
   * <pre>
   * The key text for the hint.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The key.
   */
  @java.lang.Override
  public java.lang.String getKey() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      key_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The key text for the hint.
   * </pre>
   *
   * <code>string key = 1;</code>
   *
   * @return The bytes for key.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getKeyBytes() {
    java.lang.Object ref = key_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      key_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VALUE_TYPES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList valueTypes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   *
   * @return A list containing the valueTypes.
   */
  public com.google.protobuf.ProtocolStringList getValueTypesList() {
    return valueTypes_;
  }
  /**
   *
   *
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   *
   * @return The count of valueTypes.
   */
  public int getValueTypesCount() {
    return valueTypes_.size();
  }
  /**
   *
   *
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The valueTypes at the given index.
   */
  public java.lang.String getValueTypes(int index) {
    return valueTypes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Type of the value. This is case-insensitive, and could be one of:
   * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
   * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
   * be ignored.
   * </pre>
   *
   * <code>repeated string value_types = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the valueTypes at the given index.
   */
  public com.google.protobuf.ByteString getValueTypesBytes(int index) {
    return valueTypes_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, key_);
    }
    for (int i = 0; i < valueTypes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, valueTypes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(key_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, key_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < valueTypes_.size(); i++) {
        dataSize += computeStringSizeNoTag(valueTypes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getValueTypesList().size();
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
    if (!(obj instanceof com.google.cloud.documentai.v1beta1.KeyValuePairHint)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1beta1.KeyValuePairHint other =
        (com.google.cloud.documentai.v1beta1.KeyValuePairHint) obj;

    if (!getKey().equals(other.getKey())) return false;
    if (!getValueTypesList().equals(other.getValueTypesList())) return false;
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
    hash = (37 * hash) + KEY_FIELD_NUMBER;
    hash = (53 * hash) + getKey().hashCode();
    if (getValueTypesCount() > 0) {
      hash = (37 * hash) + VALUE_TYPES_FIELD_NUMBER;
      hash = (53 * hash) + getValueTypesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint parseFrom(
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

  public static Builder newBuilder(com.google.cloud.documentai.v1beta1.KeyValuePairHint prototype) {
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
   * User-provided hint for key value pair.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1beta1.KeyValuePairHint}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1beta1.KeyValuePairHint)
      com.google.cloud.documentai.v1beta1.KeyValuePairHintOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1beta1.KeyValuePairHint.class,
              com.google.cloud.documentai.v1beta1.KeyValuePairHint.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1beta1.KeyValuePairHint.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      key_ = "";
      valueTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1beta1.DocumentAiProto
          .internal_static_google_cloud_documentai_v1beta1_KeyValuePairHint_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.KeyValuePairHint getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1beta1.KeyValuePairHint.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.KeyValuePairHint build() {
      com.google.cloud.documentai.v1beta1.KeyValuePairHint result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1beta1.KeyValuePairHint buildPartial() {
      com.google.cloud.documentai.v1beta1.KeyValuePairHint result =
          new com.google.cloud.documentai.v1beta1.KeyValuePairHint(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.documentai.v1beta1.KeyValuePairHint result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.key_ = key_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        valueTypes_.makeImmutable();
        result.valueTypes_ = valueTypes_;
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
      if (other instanceof com.google.cloud.documentai.v1beta1.KeyValuePairHint) {
        return mergeFrom((com.google.cloud.documentai.v1beta1.KeyValuePairHint) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1beta1.KeyValuePairHint other) {
      if (other == com.google.cloud.documentai.v1beta1.KeyValuePairHint.getDefaultInstance())
        return this;
      if (!other.getKey().isEmpty()) {
        key_ = other.key_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.valueTypes_.isEmpty()) {
        if (valueTypes_.isEmpty()) {
          valueTypes_ = other.valueTypes_;
          bitField0_ |= 0x00000002;
        } else {
          ensureValueTypesIsMutable();
          valueTypes_.addAll(other.valueTypes_);
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
                key_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureValueTypesIsMutable();
                valueTypes_.add(s);
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

    private java.lang.Object key_ = "";
    /**
     *
     *
     * <pre>
     * The key text for the hint.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @return The key.
     */
    public java.lang.String getKey() {
      java.lang.Object ref = key_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        key_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The key text for the hint.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @return The bytes for key.
     */
    public com.google.protobuf.ByteString getKeyBytes() {
      java.lang.Object ref = key_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        key_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The key text for the hint.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @param value The key to set.
     * @return This builder for chaining.
     */
    public Builder setKey(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The key text for the hint.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearKey() {
      key_ = getDefaultInstance().getKey();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The key text for the hint.
     * </pre>
     *
     * <code>string key = 1;</code>
     *
     * @param value The bytes for key to set.
     * @return This builder for chaining.
     */
    public Builder setKeyBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      key_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList valueTypes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureValueTypesIsMutable() {
      if (!valueTypes_.isModifiable()) {
        valueTypes_ = new com.google.protobuf.LazyStringArrayList(valueTypes_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @return A list containing the valueTypes.
     */
    public com.google.protobuf.ProtocolStringList getValueTypesList() {
      valueTypes_.makeImmutable();
      return valueTypes_;
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @return The count of valueTypes.
     */
    public int getValueTypesCount() {
      return valueTypes_.size();
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The valueTypes at the given index.
     */
    public java.lang.String getValueTypes(int index) {
      return valueTypes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the valueTypes at the given index.
     */
    public com.google.protobuf.ByteString getValueTypesBytes(int index) {
      return valueTypes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The valueTypes to set.
     * @return This builder for chaining.
     */
    public Builder setValueTypes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValueTypesIsMutable();
      valueTypes_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @param value The valueTypes to add.
     * @return This builder for chaining.
     */
    public Builder addValueTypes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureValueTypesIsMutable();
      valueTypes_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @param values The valueTypes to add.
     * @return This builder for chaining.
     */
    public Builder addAllValueTypes(java.lang.Iterable<java.lang.String> values) {
      ensureValueTypesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, valueTypes_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearValueTypes() {
      valueTypes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Type of the value. This is case-insensitive, and could be one of:
     * ADDRESS, LOCATION, ORGANIZATION, PERSON, PHONE_NUMBER,
     * ID, NUMBER, EMAIL, PRICE, TERMS, DATE, NAME. Types not in this list will
     * be ignored.
     * </pre>
     *
     * <code>repeated string value_types = 2;</code>
     *
     * @param value The bytes of the valueTypes to add.
     * @return This builder for chaining.
     */
    public Builder addValueTypesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureValueTypesIsMutable();
      valueTypes_.add(value);
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1beta1.KeyValuePairHint)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1beta1.KeyValuePairHint)
  private static final com.google.cloud.documentai.v1beta1.KeyValuePairHint DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1beta1.KeyValuePairHint();
  }

  public static com.google.cloud.documentai.v1beta1.KeyValuePairHint getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<KeyValuePairHint> PARSER =
      new com.google.protobuf.AbstractParser<KeyValuePairHint>() {
        @java.lang.Override
        public KeyValuePairHint parsePartialFrom(
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

  public static com.google.protobuf.Parser<KeyValuePairHint> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<KeyValuePairHint> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1beta1.KeyValuePairHint getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
