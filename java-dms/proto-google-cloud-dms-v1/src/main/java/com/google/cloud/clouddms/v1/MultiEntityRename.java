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
// source: google/cloud/clouddms/v1/conversionworkspace_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * Options to configure rule type MultiEntityRename.
 * The rule is used to rename multiple entities.
 *
 * The rule filter field can refer to one or more entities.
 *
 * The rule scope can be one of: Database, Schema, Table, Column, Constraint,
 * Index, View, Function, Stored Procedure, Materialized View, Sequence, UDT
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.MultiEntityRename}
 */
public final class MultiEntityRename extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.MultiEntityRename)
    MultiEntityRenameOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MultiEntityRename.newBuilder() to construct.
  private MultiEntityRename(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MultiEntityRename() {
    newNamePattern_ = "";
    sourceNameTransformation_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MultiEntityRename();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_MultiEntityRename_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
        .internal_static_google_cloud_clouddms_v1_MultiEntityRename_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.MultiEntityRename.class,
            com.google.cloud.clouddms.v1.MultiEntityRename.Builder.class);
  }

  public static final int NEW_NAME_PATTERN_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object newNamePattern_ = "";
  /**
   *
   *
   * <pre>
   * Optional. The pattern used to generate the new entity's name. This pattern
   * must include the characters '{name}', which will be replaced with the name
   * of the original entity. For example, the pattern 't_{name}' for an entity
   * name jobs would be converted to 't_jobs'.
   *
   * If unspecified, the default value for this field is '{name}'
   * </pre>
   *
   * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The newNamePattern.
   */
  @java.lang.Override
  public java.lang.String getNewNamePattern() {
    java.lang.Object ref = newNamePattern_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      newNamePattern_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Optional. The pattern used to generate the new entity's name. This pattern
   * must include the characters '{name}', which will be replaced with the name
   * of the original entity. For example, the pattern 't_{name}' for an entity
   * name jobs would be converted to 't_jobs'.
   *
   * If unspecified, the default value for this field is '{name}'
   * </pre>
   *
   * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
   *
   * @return The bytes for newNamePattern.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNewNamePatternBytes() {
    java.lang.Object ref = newNamePattern_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      newNamePattern_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SOURCE_NAME_TRANSFORMATION_FIELD_NUMBER = 2;
  private int sourceNameTransformation_ = 0;
  /**
   *
   *
   * <pre>
   * Optional. Additional transformation that can be done on the source entity
   * name before it is being used by the new_name_pattern, for example lower
   * case. If no transformation is desired, use NO_TRANSFORMATION
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The enum numeric value on the wire for sourceNameTransformation.
   */
  @java.lang.Override
  public int getSourceNameTransformationValue() {
    return sourceNameTransformation_;
  }
  /**
   *
   *
   * <pre>
   * Optional. Additional transformation that can be done on the source entity
   * name before it is being used by the new_name_pattern, for example lower
   * case. If no transformation is desired, use NO_TRANSFORMATION
   * </pre>
   *
   * <code>
   * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The sourceNameTransformation.
   */
  @java.lang.Override
  public com.google.cloud.clouddms.v1.EntityNameTransformation getSourceNameTransformation() {
    com.google.cloud.clouddms.v1.EntityNameTransformation result =
        com.google.cloud.clouddms.v1.EntityNameTransformation.forNumber(sourceNameTransformation_);
    return result == null
        ? com.google.cloud.clouddms.v1.EntityNameTransformation.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newNamePattern_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, newNamePattern_);
    }
    if (sourceNameTransformation_
        != com.google.cloud.clouddms.v1.EntityNameTransformation
            .ENTITY_NAME_TRANSFORMATION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, sourceNameTransformation_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(newNamePattern_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, newNamePattern_);
    }
    if (sourceNameTransformation_
        != com.google.cloud.clouddms.v1.EntityNameTransformation
            .ENTITY_NAME_TRANSFORMATION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, sourceNameTransformation_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.MultiEntityRename)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.MultiEntityRename other =
        (com.google.cloud.clouddms.v1.MultiEntityRename) obj;

    if (!getNewNamePattern().equals(other.getNewNamePattern())) return false;
    if (sourceNameTransformation_ != other.sourceNameTransformation_) return false;
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
    hash = (37 * hash) + NEW_NAME_PATTERN_FIELD_NUMBER;
    hash = (53 * hash) + getNewNamePattern().hashCode();
    hash = (37 * hash) + SOURCE_NAME_TRANSFORMATION_FIELD_NUMBER;
    hash = (53 * hash) + sourceNameTransformation_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.MultiEntityRename prototype) {
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
   * Options to configure rule type MultiEntityRename.
   * The rule is used to rename multiple entities.
   *
   * The rule filter field can refer to one or more entities.
   *
   * The rule scope can be one of: Database, Schema, Table, Column, Constraint,
   * Index, View, Function, Stored Procedure, Materialized View, Sequence, UDT
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.MultiEntityRename}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.MultiEntityRename)
      com.google.cloud.clouddms.v1.MultiEntityRenameOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_MultiEntityRename_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_MultiEntityRename_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.MultiEntityRename.class,
              com.google.cloud.clouddms.v1.MultiEntityRename.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.MultiEntityRename.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      newNamePattern_ = "";
      sourceNameTransformation_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ConversionWorkspaceResourcesProto
          .internal_static_google_cloud_clouddms_v1_MultiEntityRename_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.MultiEntityRename getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.MultiEntityRename.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.MultiEntityRename build() {
      com.google.cloud.clouddms.v1.MultiEntityRename result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.MultiEntityRename buildPartial() {
      com.google.cloud.clouddms.v1.MultiEntityRename result =
          new com.google.cloud.clouddms.v1.MultiEntityRename(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.MultiEntityRename result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.newNamePattern_ = newNamePattern_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.sourceNameTransformation_ = sourceNameTransformation_;
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
      if (other instanceof com.google.cloud.clouddms.v1.MultiEntityRename) {
        return mergeFrom((com.google.cloud.clouddms.v1.MultiEntityRename) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.MultiEntityRename other) {
      if (other == com.google.cloud.clouddms.v1.MultiEntityRename.getDefaultInstance()) return this;
      if (!other.getNewNamePattern().isEmpty()) {
        newNamePattern_ = other.newNamePattern_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.sourceNameTransformation_ != 0) {
        setSourceNameTransformationValue(other.getSourceNameTransformationValue());
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
                newNamePattern_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                sourceNameTransformation_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private java.lang.Object newNamePattern_ = "";
    /**
     *
     *
     * <pre>
     * Optional. The pattern used to generate the new entity's name. This pattern
     * must include the characters '{name}', which will be replaced with the name
     * of the original entity. For example, the pattern 't_{name}' for an entity
     * name jobs would be converted to 't_jobs'.
     *
     * If unspecified, the default value for this field is '{name}'
     * </pre>
     *
     * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The newNamePattern.
     */
    public java.lang.String getNewNamePattern() {
      java.lang.Object ref = newNamePattern_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        newNamePattern_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern used to generate the new entity's name. This pattern
     * must include the characters '{name}', which will be replaced with the name
     * of the original entity. For example, the pattern 't_{name}' for an entity
     * name jobs would be converted to 't_jobs'.
     *
     * If unspecified, the default value for this field is '{name}'
     * </pre>
     *
     * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return The bytes for newNamePattern.
     */
    public com.google.protobuf.ByteString getNewNamePatternBytes() {
      java.lang.Object ref = newNamePattern_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        newNamePattern_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern used to generate the new entity's name. This pattern
     * must include the characters '{name}', which will be replaced with the name
     * of the original entity. For example, the pattern 't_{name}' for an entity
     * name jobs would be converted to 't_jobs'.
     *
     * If unspecified, the default value for this field is '{name}'
     * </pre>
     *
     * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The newNamePattern to set.
     * @return This builder for chaining.
     */
    public Builder setNewNamePattern(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      newNamePattern_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern used to generate the new entity's name. This pattern
     * must include the characters '{name}', which will be replaced with the name
     * of the original entity. For example, the pattern 't_{name}' for an entity
     * name jobs would be converted to 't_jobs'.
     *
     * If unspecified, the default value for this field is '{name}'
     * </pre>
     *
     * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNewNamePattern() {
      newNamePattern_ = getDefaultInstance().getNewNamePattern();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The pattern used to generate the new entity's name. This pattern
     * must include the characters '{name}', which will be replaced with the name
     * of the original entity. For example, the pattern 't_{name}' for an entity
     * name jobs would be converted to 't_jobs'.
     *
     * If unspecified, the default value for this field is '{name}'
     * </pre>
     *
     * <code>string new_name_pattern = 1 [(.google.api.field_behavior) = OPTIONAL];</code>
     *
     * @param value The bytes for newNamePattern to set.
     * @return This builder for chaining.
     */
    public Builder setNewNamePatternBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      newNamePattern_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int sourceNameTransformation_ = 0;
    /**
     *
     *
     * <pre>
     * Optional. Additional transformation that can be done on the source entity
     * name before it is being used by the new_name_pattern, for example lower
     * case. If no transformation is desired, use NO_TRANSFORMATION
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The enum numeric value on the wire for sourceNameTransformation.
     */
    @java.lang.Override
    public int getSourceNameTransformationValue() {
      return sourceNameTransformation_;
    }
    /**
     *
     *
     * <pre>
     * Optional. Additional transformation that can be done on the source entity
     * name before it is being used by the new_name_pattern, for example lower
     * case. If no transformation is desired, use NO_TRANSFORMATION
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The enum numeric value on the wire for sourceNameTransformation to set.
     * @return This builder for chaining.
     */
    public Builder setSourceNameTransformationValue(int value) {
      sourceNameTransformation_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Additional transformation that can be done on the source entity
     * name before it is being used by the new_name_pattern, for example lower
     * case. If no transformation is desired, use NO_TRANSFORMATION
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The sourceNameTransformation.
     */
    @java.lang.Override
    public com.google.cloud.clouddms.v1.EntityNameTransformation getSourceNameTransformation() {
      com.google.cloud.clouddms.v1.EntityNameTransformation result =
          com.google.cloud.clouddms.v1.EntityNameTransformation.forNumber(
              sourceNameTransformation_);
      return result == null
          ? com.google.cloud.clouddms.v1.EntityNameTransformation.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Optional. Additional transformation that can be done on the source entity
     * name before it is being used by the new_name_pattern, for example lower
     * case. If no transformation is desired, use NO_TRANSFORMATION
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @param value The sourceNameTransformation to set.
     * @return This builder for chaining.
     */
    public Builder setSourceNameTransformation(
        com.google.cloud.clouddms.v1.EntityNameTransformation value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      sourceNameTransformation_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. Additional transformation that can be done on the source entity
     * name before it is being used by the new_name_pattern, for example lower
     * case. If no transformation is desired, use NO_TRANSFORMATION
     * </pre>
     *
     * <code>
     * .google.cloud.clouddms.v1.EntityNameTransformation source_name_transformation = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceNameTransformation() {
      bitField0_ = (bitField0_ & ~0x00000002);
      sourceNameTransformation_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.MultiEntityRename)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.MultiEntityRename)
  private static final com.google.cloud.clouddms.v1.MultiEntityRename DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.MultiEntityRename();
  }

  public static com.google.cloud.clouddms.v1.MultiEntityRename getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MultiEntityRename> PARSER =
      new com.google.protobuf.AbstractParser<MultiEntityRename>() {
        @java.lang.Override
        public MultiEntityRename parsePartialFrom(
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

  public static com.google.protobuf.Parser<MultiEntityRename> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MultiEntityRename> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.MultiEntityRename getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
