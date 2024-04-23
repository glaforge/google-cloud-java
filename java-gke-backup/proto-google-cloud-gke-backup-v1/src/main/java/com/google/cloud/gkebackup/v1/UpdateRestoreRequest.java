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
// source: google/cloud/gkebackup/v1/gkebackup.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkebackup.v1;

/**
 *
 *
 * <pre>
 * Request message for UpdateRestore.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkebackup.v1.UpdateRestoreRequest}
 */
public final class UpdateRestoreRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkebackup.v1.UpdateRestoreRequest)
    UpdateRestoreRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UpdateRestoreRequest.newBuilder() to construct.
  private UpdateRestoreRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UpdateRestoreRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UpdateRestoreRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_UpdateRestoreRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkebackup.v1.GKEBackupProto
        .internal_static_google_cloud_gkebackup_v1_UpdateRestoreRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkebackup.v1.UpdateRestoreRequest.class,
            com.google.cloud.gkebackup.v1.UpdateRestoreRequest.Builder.class);
  }

  private int bitField0_;
  public static final int RESTORE_FIELD_NUMBER = 1;
  private com.google.cloud.gkebackup.v1.Restore restore_;
  /**
   *
   *
   * <pre>
   * Required. A new version of the Restore resource that contains updated
   * fields. This may be sparsely populated if an `update_mask` is provided.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the restore field is set.
   */
  @java.lang.Override
  public boolean hasRestore() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. A new version of the Restore resource that contains updated
   * fields. This may be sparsely populated if an `update_mask` is provided.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The restore.
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.Restore getRestore() {
    return restore_ == null ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance() : restore_;
  }
  /**
   *
   *
   * <pre>
   * Required. A new version of the Restore resource that contains updated
   * fields. This may be sparsely populated if an `update_mask` is provided.
   * </pre>
   *
   * <code>.google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.gkebackup.v1.RestoreOrBuilder getRestoreOrBuilder() {
    return restore_ == null ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance() : restore_;
  }

  public static final int UPDATE_MASK_FIELD_NUMBER = 2;
  private com.google.protobuf.FieldMask updateMask_;
  /**
   *
   *
   * <pre>
   * Optional. This is used to specify the fields to be overwritten in the
   * Restore targeted for update. The values for each of these
   * updated fields will be taken from the `restore` provided
   * with this request. Field names are relative to the root of the resource.
   * If no `update_mask` is provided, all fields in `restore` will be
   * written to the target Restore resource.
   * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
   * and are not used to update the target Restore.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the updateMask field is set.
   */
  @java.lang.Override
  public boolean hasUpdateMask() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. This is used to specify the fields to be overwritten in the
   * Restore targeted for update. The values for each of these
   * updated fields will be taken from the `restore` provided
   * with this request. Field names are relative to the root of the resource.
   * If no `update_mask` is provided, all fields in `restore` will be
   * written to the target Restore resource.
   * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
   * and are not used to update the target Restore.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The updateMask.
   */
  @java.lang.Override
  public com.google.protobuf.FieldMask getUpdateMask() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
  }
  /**
   *
   *
   * <pre>
   * Optional. This is used to specify the fields to be overwritten in the
   * Restore targeted for update. The values for each of these
   * updated fields will be taken from the `restore` provided
   * with this request. Field names are relative to the root of the resource.
   * If no `update_mask` is provided, all fields in `restore` will be
   * written to the target Restore resource.
   * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
   * and are not used to update the target Restore.
   * </pre>
   *
   * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
    return updateMask_ == null ? com.google.protobuf.FieldMask.getDefaultInstance() : updateMask_;
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
      output.writeMessage(1, getRestore());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeMessage(2, getUpdateMask());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getRestore());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getUpdateMask());
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
    if (!(obj instanceof com.google.cloud.gkebackup.v1.UpdateRestoreRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.gkebackup.v1.UpdateRestoreRequest other =
        (com.google.cloud.gkebackup.v1.UpdateRestoreRequest) obj;

    if (hasRestore() != other.hasRestore()) return false;
    if (hasRestore()) {
      if (!getRestore().equals(other.getRestore())) return false;
    }
    if (hasUpdateMask() != other.hasUpdateMask()) return false;
    if (hasUpdateMask()) {
      if (!getUpdateMask().equals(other.getUpdateMask())) return false;
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
    if (hasRestore()) {
      hash = (37 * hash) + RESTORE_FIELD_NUMBER;
      hash = (53 * hash) + getRestore().hashCode();
    }
    if (hasUpdateMask()) {
      hash = (37 * hash) + UPDATE_MASK_FIELD_NUMBER;
      hash = (53 * hash) + getUpdateMask().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkebackup.v1.UpdateRestoreRequest prototype) {
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
   * Request message for UpdateRestore.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkebackup.v1.UpdateRestoreRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkebackup.v1.UpdateRestoreRequest)
      com.google.cloud.gkebackup.v1.UpdateRestoreRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_UpdateRestoreRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_UpdateRestoreRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkebackup.v1.UpdateRestoreRequest.class,
              com.google.cloud.gkebackup.v1.UpdateRestoreRequest.Builder.class);
    }

    // Construct using com.google.cloud.gkebackup.v1.UpdateRestoreRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getRestoreFieldBuilder();
        getUpdateMaskFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      restore_ = null;
      if (restoreBuilder_ != null) {
        restoreBuilder_.dispose();
        restoreBuilder_ = null;
      }
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkebackup.v1.GKEBackupProto
          .internal_static_google_cloud_gkebackup_v1_UpdateRestoreRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.UpdateRestoreRequest getDefaultInstanceForType() {
      return com.google.cloud.gkebackup.v1.UpdateRestoreRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.UpdateRestoreRequest build() {
      com.google.cloud.gkebackup.v1.UpdateRestoreRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkebackup.v1.UpdateRestoreRequest buildPartial() {
      com.google.cloud.gkebackup.v1.UpdateRestoreRequest result =
          new com.google.cloud.gkebackup.v1.UpdateRestoreRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkebackup.v1.UpdateRestoreRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.restore_ = restoreBuilder_ == null ? restore_ : restoreBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.updateMask_ = updateMaskBuilder_ == null ? updateMask_ : updateMaskBuilder_.build();
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
      if (other instanceof com.google.cloud.gkebackup.v1.UpdateRestoreRequest) {
        return mergeFrom((com.google.cloud.gkebackup.v1.UpdateRestoreRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkebackup.v1.UpdateRestoreRequest other) {
      if (other == com.google.cloud.gkebackup.v1.UpdateRestoreRequest.getDefaultInstance())
        return this;
      if (other.hasRestore()) {
        mergeRestore(other.getRestore());
      }
      if (other.hasUpdateMask()) {
        mergeUpdateMask(other.getUpdateMask());
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
                input.readMessage(getRestoreFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getUpdateMaskFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private com.google.cloud.gkebackup.v1.Restore restore_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkebackup.v1.Restore,
            com.google.cloud.gkebackup.v1.Restore.Builder,
            com.google.cloud.gkebackup.v1.RestoreOrBuilder>
        restoreBuilder_;
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the restore field is set.
     */
    public boolean hasRestore() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The restore.
     */
    public com.google.cloud.gkebackup.v1.Restore getRestore() {
      if (restoreBuilder_ == null) {
        return restore_ == null
            ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance()
            : restore_;
      } else {
        return restoreBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestore(com.google.cloud.gkebackup.v1.Restore value) {
      if (restoreBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        restore_ = value;
      } else {
        restoreBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setRestore(com.google.cloud.gkebackup.v1.Restore.Builder builderForValue) {
      if (restoreBuilder_ == null) {
        restore_ = builderForValue.build();
      } else {
        restoreBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeRestore(com.google.cloud.gkebackup.v1.Restore value) {
      if (restoreBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && restore_ != null
            && restore_ != com.google.cloud.gkebackup.v1.Restore.getDefaultInstance()) {
          getRestoreBuilder().mergeFrom(value);
        } else {
          restore_ = value;
        }
      } else {
        restoreBuilder_.mergeFrom(value);
      }
      if (restore_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearRestore() {
      bitField0_ = (bitField0_ & ~0x00000001);
      restore_ = null;
      if (restoreBuilder_ != null) {
        restoreBuilder_.dispose();
        restoreBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkebackup.v1.Restore.Builder getRestoreBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getRestoreFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.gkebackup.v1.RestoreOrBuilder getRestoreOrBuilder() {
      if (restoreBuilder_ != null) {
        return restoreBuilder_.getMessageOrBuilder();
      } else {
        return restore_ == null
            ? com.google.cloud.gkebackup.v1.Restore.getDefaultInstance()
            : restore_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. A new version of the Restore resource that contains updated
     * fields. This may be sparsely populated if an `update_mask` is provided.
     * </pre>
     *
     * <code>
     * .google.cloud.gkebackup.v1.Restore restore = 1 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.gkebackup.v1.Restore,
            com.google.cloud.gkebackup.v1.Restore.Builder,
            com.google.cloud.gkebackup.v1.RestoreOrBuilder>
        getRestoreFieldBuilder() {
      if (restoreBuilder_ == null) {
        restoreBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.gkebackup.v1.Restore,
                com.google.cloud.gkebackup.v1.Restore.Builder,
                com.google.cloud.gkebackup.v1.RestoreOrBuilder>(
                getRestore(), getParentForChildren(), isClean());
        restore_ = null;
      }
      return restoreBuilder_;
    }

    private com.google.protobuf.FieldMask updateMask_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        updateMaskBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the updateMask field is set.
     */
    public boolean hasUpdateMask() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The updateMask.
     */
    public com.google.protobuf.FieldMask getUpdateMask() {
      if (updateMaskBuilder_ == null) {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      } else {
        return updateMaskBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        updateMask_ = value;
      } else {
        updateMaskBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setUpdateMask(com.google.protobuf.FieldMask.Builder builderForValue) {
      if (updateMaskBuilder_ == null) {
        updateMask_ = builderForValue.build();
      } else {
        updateMaskBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeUpdateMask(com.google.protobuf.FieldMask value) {
      if (updateMaskBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && updateMask_ != null
            && updateMask_ != com.google.protobuf.FieldMask.getDefaultInstance()) {
          getUpdateMaskBuilder().mergeFrom(value);
        } else {
          updateMask_ = value;
        }
      } else {
        updateMaskBuilder_.mergeFrom(value);
      }
      if (updateMask_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearUpdateMask() {
      bitField0_ = (bitField0_ & ~0x00000002);
      updateMask_ = null;
      if (updateMaskBuilder_ != null) {
        updateMaskBuilder_.dispose();
        updateMaskBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMask.Builder getUpdateMaskBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getUpdateMaskFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.protobuf.FieldMaskOrBuilder getUpdateMaskOrBuilder() {
      if (updateMaskBuilder_ != null) {
        return updateMaskBuilder_.getMessageOrBuilder();
      } else {
        return updateMask_ == null
            ? com.google.protobuf.FieldMask.getDefaultInstance()
            : updateMask_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. This is used to specify the fields to be overwritten in the
     * Restore targeted for update. The values for each of these
     * updated fields will be taken from the `restore` provided
     * with this request. Field names are relative to the root of the resource.
     * If no `update_mask` is provided, all fields in `restore` will be
     * written to the target Restore resource.
     * Note that OUTPUT_ONLY and IMMUTABLE fields in `restore` are ignored
     * and are not used to update the target Restore.
     * </pre>
     *
     * <code>.google.protobuf.FieldMask update_mask = 2 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.protobuf.FieldMask,
            com.google.protobuf.FieldMask.Builder,
            com.google.protobuf.FieldMaskOrBuilder>
        getUpdateMaskFieldBuilder() {
      if (updateMaskBuilder_ == null) {
        updateMaskBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.protobuf.FieldMask,
                com.google.protobuf.FieldMask.Builder,
                com.google.protobuf.FieldMaskOrBuilder>(
                getUpdateMask(), getParentForChildren(), isClean());
        updateMask_ = null;
      }
      return updateMaskBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkebackup.v1.UpdateRestoreRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkebackup.v1.UpdateRestoreRequest)
  private static final com.google.cloud.gkebackup.v1.UpdateRestoreRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkebackup.v1.UpdateRestoreRequest();
  }

  public static com.google.cloud.gkebackup.v1.UpdateRestoreRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UpdateRestoreRequest> PARSER =
      new com.google.protobuf.AbstractParser<UpdateRestoreRequest>() {
        @java.lang.Override
        public UpdateRestoreRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<UpdateRestoreRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UpdateRestoreRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkebackup.v1.UpdateRestoreRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
