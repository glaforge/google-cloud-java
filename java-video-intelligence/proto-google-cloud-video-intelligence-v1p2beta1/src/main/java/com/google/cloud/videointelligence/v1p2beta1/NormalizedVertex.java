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
// source: google/cloud/videointelligence/v1p2beta1/video_intelligence.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.videointelligence.v1p2beta1;

/**
 *
 *
 * <pre>
 * A vertex represents a 2D point in the image.
 * NOTE: the normalized vertex coordinates are relative to the original image
 * and range from 0 to 1.
 * </pre>
 *
 * Protobuf type {@code google.cloud.videointelligence.v1p2beta1.NormalizedVertex}
 */
public final class NormalizedVertex extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.videointelligence.v1p2beta1.NormalizedVertex)
    NormalizedVertexOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NormalizedVertex.newBuilder() to construct.
  private NormalizedVertex(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NormalizedVertex() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NormalizedVertex();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p2beta1_NormalizedVertex_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
        .internal_static_google_cloud_videointelligence_v1p2beta1_NormalizedVertex_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.class,
            com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.Builder.class);
  }

  public static final int X_FIELD_NUMBER = 1;
  private float x_ = 0F;
  /**
   *
   *
   * <pre>
   * X coordinate.
   * </pre>
   *
   * <code>float x = 1;</code>
   *
   * @return The x.
   */
  @java.lang.Override
  public float getX() {
    return x_;
  }

  public static final int Y_FIELD_NUMBER = 2;
  private float y_ = 0F;
  /**
   *
   *
   * <pre>
   * Y coordinate.
   * </pre>
   *
   * <code>float y = 2;</code>
   *
   * @return The y.
   */
  @java.lang.Override
  public float getY() {
    return y_;
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
    if (java.lang.Float.floatToRawIntBits(x_) != 0) {
      output.writeFloat(1, x_);
    }
    if (java.lang.Float.floatToRawIntBits(y_) != 0) {
      output.writeFloat(2, y_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (java.lang.Float.floatToRawIntBits(x_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(1, x_);
    }
    if (java.lang.Float.floatToRawIntBits(y_) != 0) {
      size += com.google.protobuf.CodedOutputStream.computeFloatSize(2, y_);
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
    if (!(obj instanceof com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex)) {
      return super.equals(obj);
    }
    com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex other =
        (com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex) obj;

    if (java.lang.Float.floatToIntBits(getX()) != java.lang.Float.floatToIntBits(other.getX()))
      return false;
    if (java.lang.Float.floatToIntBits(getY()) != java.lang.Float.floatToIntBits(other.getY()))
      return false;
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
    hash = (37 * hash) + X_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getX());
    hash = (37 * hash) + Y_FIELD_NUMBER;
    hash = (53 * hash) + java.lang.Float.floatToIntBits(getY());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex parseFrom(
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
      com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex prototype) {
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
   * A vertex represents a 2D point in the image.
   * NOTE: the normalized vertex coordinates are relative to the original image
   * and range from 0 to 1.
   * </pre>
   *
   * Protobuf type {@code google.cloud.videointelligence.v1p2beta1.NormalizedVertex}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.videointelligence.v1p2beta1.NormalizedVertex)
      com.google.cloud.videointelligence.v1p2beta1.NormalizedVertexOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_NormalizedVertex_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_NormalizedVertex_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.class,
              com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.Builder.class);
    }

    // Construct using com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      x_ = 0F;
      y_ = 0F;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.videointelligence.v1p2beta1.VideoIntelligenceServiceProto
          .internal_static_google_cloud_videointelligence_v1p2beta1_NormalizedVertex_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex
        getDefaultInstanceForType() {
      return com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex build() {
      com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex buildPartial() {
      com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex result =
          new com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.x_ = x_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.y_ = y_;
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
      if (other instanceof com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex) {
        return mergeFrom((com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex other) {
      if (other
          == com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex.getDefaultInstance())
        return this;
      if (other.getX() != 0F) {
        setX(other.getX());
      }
      if (other.getY() != 0F) {
        setY(other.getY());
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
            case 13:
              {
                x_ = input.readFloat();
                bitField0_ |= 0x00000001;
                break;
              } // case 13
            case 21:
              {
                y_ = input.readFloat();
                bitField0_ |= 0x00000002;
                break;
              } // case 21
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

    private float x_;
    /**
     *
     *
     * <pre>
     * X coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @return The x.
     */
    @java.lang.Override
    public float getX() {
      return x_;
    }
    /**
     *
     *
     * <pre>
     * X coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @param value The x to set.
     * @return This builder for chaining.
     */
    public Builder setX(float value) {

      x_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * X coordinate.
     * </pre>
     *
     * <code>float x = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearX() {
      bitField0_ = (bitField0_ & ~0x00000001);
      x_ = 0F;
      onChanged();
      return this;
    }

    private float y_;
    /**
     *
     *
     * <pre>
     * Y coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @return The y.
     */
    @java.lang.Override
    public float getY() {
      return y_;
    }
    /**
     *
     *
     * <pre>
     * Y coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @param value The y to set.
     * @return This builder for chaining.
     */
    public Builder setY(float value) {

      y_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Y coordinate.
     * </pre>
     *
     * <code>float y = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearY() {
      bitField0_ = (bitField0_ & ~0x00000002);
      y_ = 0F;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.videointelligence.v1p2beta1.NormalizedVertex)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.videointelligence.v1p2beta1.NormalizedVertex)
  private static final com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex();
  }

  public static com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NormalizedVertex> PARSER =
      new com.google.protobuf.AbstractParser<NormalizedVertex>() {
        @java.lang.Override
        public NormalizedVertex parsePartialFrom(
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

  public static com.google.protobuf.Parser<NormalizedVertex> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NormalizedVertex> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.videointelligence.v1p2beta1.NormalizedVertex getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
