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
// source: google/cloud/migrationcenter/v1/migrationcenter.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.migrationcenter.v1;

/**
 *
 *
 * <pre>
 * Compute engine migration target.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget}
 */
public final class ComputeEngineMigrationTarget extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget)
    ComputeEngineMigrationTargetOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ComputeEngineMigrationTarget.newBuilder() to construct.
  private ComputeEngineMigrationTarget(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ComputeEngineMigrationTarget() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ComputeEngineMigrationTarget();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_ComputeEngineMigrationTarget_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_ComputeEngineMigrationTarget_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.class,
            com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.Builder.class);
  }

  private int bitField0_;
  public static final int SHAPE_FIELD_NUMBER = 1;
  private com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape_;
  /**
   *
   *
   * <pre>
   * Description of the suggested shape for the migration target.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
   *
   * @return Whether the shape field is set.
   */
  @java.lang.Override
  public boolean hasShape() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Description of the suggested shape for the migration target.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
   *
   * @return The shape.
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor getShape() {
    return shape_ == null
        ? com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.getDefaultInstance()
        : shape_;
  }
  /**
   *
   *
   * <pre>
   * Description of the suggested shape for the migration target.
   * </pre>
   *
   * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptorOrBuilder
      getShapeOrBuilder() {
    return shape_ == null
        ? com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.getDefaultInstance()
        : shape_;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getShape());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getShape());
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget other =
        (com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget) obj;

    if (hasShape() != other.hasShape()) return false;
    if (hasShape()) {
      if (!getShape().equals(other.getShape())) return false;
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
    if (hasShape()) {
      hash = (37 * hash) + SHAPE_FIELD_NUMBER;
      hash = (53 * hash) + getShape().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget parseFrom(
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
      com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget prototype) {
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
   * Compute engine migration target.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget)
      com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTargetOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_ComputeEngineMigrationTarget_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_ComputeEngineMigrationTarget_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.class,
              com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getShapeFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      shape_ = null;
      if (shapeBuilder_ != null) {
        shapeBuilder_.dispose();
        shapeBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_ComputeEngineMigrationTarget_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget
        getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget build() {
      com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget buildPartial() {
      com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget result =
          new com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.shape_ = shapeBuilder_ == null ? shape_ : shapeBuilder_.build();
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
      if (other instanceof com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget other) {
      if (other
          == com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget.getDefaultInstance())
        return this;
      if (other.hasShape()) {
        mergeShape(other.getShape());
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
                input.readMessage(getShapeFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor,
            com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.Builder,
            com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptorOrBuilder>
        shapeBuilder_;
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     *
     * @return Whether the shape field is set.
     */
    public boolean hasShape() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     *
     * @return The shape.
     */
    public com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor getShape() {
      if (shapeBuilder_ == null) {
        return shape_ == null
            ? com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.getDefaultInstance()
            : shape_;
      } else {
        return shapeBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    public Builder setShape(
        com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor value) {
      if (shapeBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        shape_ = value;
      } else {
        shapeBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    public Builder setShape(
        com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.Builder builderForValue) {
      if (shapeBuilder_ == null) {
        shape_ = builderForValue.build();
      } else {
        shapeBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    public Builder mergeShape(
        com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor value) {
      if (shapeBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && shape_ != null
            && shape_
                != com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor
                    .getDefaultInstance()) {
          getShapeBuilder().mergeFrom(value);
        } else {
          shape_ = value;
        }
      } else {
        shapeBuilder_.mergeFrom(value);
      }
      if (shape_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    public Builder clearShape() {
      bitField0_ = (bitField0_ & ~0x00000001);
      shape_ = null;
      if (shapeBuilder_ != null) {
        shapeBuilder_.dispose();
        shapeBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.Builder
        getShapeBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getShapeFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    public com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptorOrBuilder
        getShapeOrBuilder() {
      if (shapeBuilder_ != null) {
        return shapeBuilder_.getMessageOrBuilder();
      } else {
        return shape_ == null
            ? com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.getDefaultInstance()
            : shape_;
      }
    }
    /**
     *
     *
     * <pre>
     * Description of the suggested shape for the migration target.
     * </pre>
     *
     * <code>.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor shape = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor,
            com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.Builder,
            com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptorOrBuilder>
        getShapeFieldBuilder() {
      if (shapeBuilder_ == null) {
        shapeBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor,
                com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptor.Builder,
                com.google.cloud.migrationcenter.v1.ComputeEngineShapeDescriptorOrBuilder>(
                getShape(), getParentForChildren(), isClean());
        shape_ = null;
      }
      return shapeBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget)
  private static final com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget();
  }

  public static com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ComputeEngineMigrationTarget> PARSER =
      new com.google.protobuf.AbstractParser<ComputeEngineMigrationTarget>() {
        @java.lang.Override
        public ComputeEngineMigrationTarget parsePartialFrom(
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

  public static com.google.protobuf.Parser<ComputeEngineMigrationTarget> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ComputeEngineMigrationTarget> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.ComputeEngineMigrationTarget
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
