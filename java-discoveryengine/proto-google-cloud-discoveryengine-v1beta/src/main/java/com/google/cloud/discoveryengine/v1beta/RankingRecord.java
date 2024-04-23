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
// source: google/cloud/discoveryengine/v1beta/rank_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1beta;

/**
 *
 *
 * <pre>
 * Record message for
 * [RankService.Rank][google.cloud.discoveryengine.v1beta.RankService.Rank]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1beta.RankingRecord}
 */
public final class RankingRecord extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1beta.RankingRecord)
    RankingRecordOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RankingRecord.newBuilder() to construct.
  private RankingRecord(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RankingRecord() {
    id_ = "";
    title_ = "";
    content_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RankingRecord();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1beta.RankServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_RankingRecord_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1beta.RankServiceProto
        .internal_static_google_cloud_discoveryengine_v1beta_RankingRecord_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1beta.RankingRecord.class,
            com.google.cloud.discoveryengine.v1beta.RankingRecord.Builder.class);
  }

  public static final int ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object id_ = "";
  /**
   *
   *
   * <pre>
   * The unique ID to represent the record.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The id.
   */
  @java.lang.Override
  public java.lang.String getId() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      id_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The unique ID to represent the record.
   * </pre>
   *
   * <code>string id = 1;</code>
   *
   * @return The bytes for id.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIdBytes() {
    java.lang.Object ref = id_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      id_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TITLE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object title_ = "";
  /**
   *
   *
   * <pre>
   * The title of the record. Empty by default.
   * At least one of
   * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
   * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
   * be set otherwise an INVALID_ARGUMENT error is thrown.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The title.
   */
  @java.lang.Override
  public java.lang.String getTitle() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      title_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The title of the record. Empty by default.
   * At least one of
   * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
   * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
   * be set otherwise an INVALID_ARGUMENT error is thrown.
   * </pre>
   *
   * <code>string title = 2;</code>
   *
   * @return The bytes for title.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTitleBytes() {
    java.lang.Object ref = title_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      title_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CONTENT_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object content_ = "";
  /**
   *
   *
   * <pre>
   * The content of the record. Empty by default.
   * At least one of
   * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
   * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
   * be set otherwise an INVALID_ARGUMENT error is thrown.
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The content.
   */
  @java.lang.Override
  public java.lang.String getContent() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      content_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The content of the record. Empty by default.
   * At least one of
   * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
   * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
   * be set otherwise an INVALID_ARGUMENT error is thrown.
   * </pre>
   *
   * <code>string content = 3;</code>
   *
   * @return The bytes for content.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getContentBytes() {
    java.lang.Object ref = content_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      content_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SCORE_FIELD_NUMBER = 4;
  private float score_ = 0F;
  /**
   *
   *
   * <pre>
   * The score of this record based on the given query and selected model.
   * </pre>
   *
   * <code>float score = 4;</code>
   *
   * @return The score.
   */
  @java.lang.Override
  public float getScore() {
    return score_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, content_);
    }
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      output.writeFloat(4, score_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(id_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, id_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(title_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, title_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(content_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, content_);
    }
    if (java.lang.Float.floatToRawIntBits(score_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(4, score_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1beta.RankingRecord)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1beta.RankingRecord other =
        (com.google.cloud.discoveryengine.v1beta.RankingRecord) obj;

    if (!getId().equals(other.getId())) return false;
    if (!getTitle().equals(other.getTitle())) return false;
    if (!getContent().equals(other.getContent())) return false;
    if (java.lang.Float.floatToIntBits(getScore())
        != java.lang.Float.floatToIntBits(other.getScore())) return false;
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
    hash = (37 * hash) + ID_FIELD_NUMBER;
    hash = (53 * hash) + getId().hashCode();
    hash = (37 * hash) + TITLE_FIELD_NUMBER;
    hash = (53 * hash) + getTitle().hashCode();
    hash = (37 * hash) + CONTENT_FIELD_NUMBER;
    hash = (53 * hash) + getContent().hashCode();
    hash = (37 * hash) + SCORE_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getScore());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord parseFrom(
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
      com.google.cloud.discoveryengine.v1beta.RankingRecord prototype) {
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
   * Record message for
   * [RankService.Rank][google.cloud.discoveryengine.v1beta.RankService.Rank]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1beta.RankingRecord}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1beta.RankingRecord)
      com.google.cloud.discoveryengine.v1beta.RankingRecordOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1beta.RankServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_RankingRecord_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1beta.RankServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_RankingRecord_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1beta.RankingRecord.class,
              com.google.cloud.discoveryengine.v1beta.RankingRecord.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1beta.RankingRecord.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      id_ = "";
      title_ = "";
      content_ = "";
      score_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1beta.RankServiceProto
          .internal_static_google_cloud_discoveryengine_v1beta_RankingRecord_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.RankingRecord getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1beta.RankingRecord.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.RankingRecord build() {
      com.google.cloud.discoveryengine.v1beta.RankingRecord result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1beta.RankingRecord buildPartial() {
      com.google.cloud.discoveryengine.v1beta.RankingRecord result =
          new com.google.cloud.discoveryengine.v1beta.RankingRecord(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1beta.RankingRecord result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.id_ = id_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.title_ = title_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.content_ = content_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.score_ = score_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1beta.RankingRecord) {
        return mergeFrom((com.google.cloud.discoveryengine.v1beta.RankingRecord) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1beta.RankingRecord other) {
      if (other == com.google.cloud.discoveryengine.v1beta.RankingRecord.getDefaultInstance())
        return this;
      if (!other.getId().isEmpty()) {
        id_ = other.id_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTitle().isEmpty()) {
        title_ = other.title_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getContent().isEmpty()) {
        content_ = other.content_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (other.getScore() != 0F) {
        setScore(other.getScore());
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
                id_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                title_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                content_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 37:
              {
                score_ = input.readFloat();
                bitField0_ |= 0x00000008;
                break;
              } // case 37
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

    private java.lang.Object id_ = "";
    /**
     *
     *
     * <pre>
     * The unique ID to represent the record.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The id.
     */
    public java.lang.String getId() {
      java.lang.Object ref = id_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        id_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique ID to represent the record.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return The bytes for id.
     */
    public com.google.protobuf.ByteString getIdBytes() {
      java.lang.Object ref = id_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        id_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The unique ID to represent the record.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The id to set.
     * @return This builder for chaining.
     */
    public Builder setId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique ID to represent the record.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearId() {
      id_ = getDefaultInstance().getId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The unique ID to represent the record.
     * </pre>
     *
     * <code>string id = 1;</code>
     *
     * @param value The bytes for id to set.
     * @return This builder for chaining.
     */
    public Builder setIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      id_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object title_ = "";
    /**
     *
     *
     * <pre>
     * The title of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @return The title.
     */
    public java.lang.String getTitle() {
      java.lang.Object ref = title_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        title_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The title of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @return The bytes for title.
     */
    public com.google.protobuf.ByteString getTitleBytes() {
      java.lang.Object ref = title_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        title_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The title of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @param value The title to set.
     * @return This builder for chaining.
     */
    public Builder setTitle(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The title of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTitle() {
      title_ = getDefaultInstance().getTitle();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The title of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string title = 2;</code>
     *
     * @param value The bytes for title to set.
     * @return This builder for chaining.
     */
    public Builder setTitleBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      title_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object content_ = "";
    /**
     *
     *
     * <pre>
     * The content of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @return The content.
     */
    public java.lang.String getContent() {
      java.lang.Object ref = content_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        content_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The content of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @return The bytes for content.
     */
    public com.google.protobuf.ByteString getContentBytes() {
      java.lang.Object ref = content_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        content_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The content of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @param value The content to set.
     * @return This builder for chaining.
     */
    public Builder setContent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      content_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The content of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearContent() {
      content_ = getDefaultInstance().getContent();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The content of the record. Empty by default.
     * At least one of
     * [title][google.cloud.discoveryengine.v1beta.RankingRecord.title] or
     * [content][google.cloud.discoveryengine.v1beta.RankingRecord.content] should
     * be set otherwise an INVALID_ARGUMENT error is thrown.
     * </pre>
     *
     * <code>string content = 3;</code>
     *
     * @param value The bytes for content to set.
     * @return This builder for chaining.
     */
    public Builder setContentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      content_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private float score_;
    /**
     *
     *
     * <pre>
     * The score of this record based on the given query and selected model.
     * </pre>
     *
     * <code>float score = 4;</code>
     *
     * @return The score.
     */
    @java.lang.Override
    public float getScore() {
      return score_;
    }
    /**
     *
     *
     * <pre>
     * The score of this record based on the given query and selected model.
     * </pre>
     *
     * <code>float score = 4;</code>
     *
     * @param value The score to set.
     * @return This builder for chaining.
     */
    public Builder setScore(float value) {

      score_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The score of this record based on the given query and selected model.
     * </pre>
     *
     * <code>float score = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearScore() {
      bitField0_ = (bitField0_ & ~0x00000008);
      score_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1beta.RankingRecord)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1beta.RankingRecord)
  private static final com.google.cloud.discoveryengine.v1beta.RankingRecord DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1beta.RankingRecord();
  }

  public static com.google.cloud.discoveryengine.v1beta.RankingRecord getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RankingRecord> PARSER =
      new com.google.protobuf.AbstractParser<RankingRecord>() {
        @java.lang.Override
        public RankingRecord parsePartialFrom(
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

  public static com.google.protobuf.Parser<RankingRecord> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RankingRecord> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1beta.RankingRecord getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
