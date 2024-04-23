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
 * Lists the asset IDs of all assets.
 * </pre>
 *
 * Protobuf type {@code google.cloud.migrationcenter.v1.AssetList}
 */
public final class AssetList extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.migrationcenter.v1.AssetList)
    AssetListOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use AssetList.newBuilder() to construct.
  private AssetList(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private AssetList() {
    assetIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new AssetList();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_AssetList_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.migrationcenter.v1.MigrationCenterProto
        .internal_static_google_cloud_migrationcenter_v1_AssetList_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.migrationcenter.v1.AssetList.class,
            com.google.cloud.migrationcenter.v1.AssetList.Builder.class);
  }

  public static final int ASSET_IDS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList assetIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return A list containing the assetIds.
   */
  public com.google.protobuf.ProtocolStringList getAssetIdsList() {
    return assetIds_;
  }
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The count of assetIds.
   */
  public int getAssetIdsCount() {
    return assetIds_.size();
  }
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the element to return.
   * @return The assetIds at the given index.
   */
  public java.lang.String getAssetIds(int index) {
    return assetIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Required. A list of asset IDs
   * </pre>
   *
   * <code>
   * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the assetIds at the given index.
   */
  public com.google.protobuf.ByteString getAssetIdsBytes(int index) {
    return assetIds_.getByteString(index);
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
    for (int i = 0; i < assetIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, assetIds_.getRaw(i));
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
      for (int i = 0; i < assetIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(assetIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getAssetIdsList().size();
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
    if (!(obj instanceof com.google.cloud.migrationcenter.v1.AssetList)) {
      return super.equals(obj);
    }
    com.google.cloud.migrationcenter.v1.AssetList other =
        (com.google.cloud.migrationcenter.v1.AssetList) obj;

    if (!getAssetIdsList().equals(other.getAssetIdsList())) return false;
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
    if (getAssetIdsCount() > 0) {
      hash = (37 * hash) + ASSET_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getAssetIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.migrationcenter.v1.AssetList parseFrom(
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

  public static Builder newBuilder(com.google.cloud.migrationcenter.v1.AssetList prototype) {
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
   * Lists the asset IDs of all assets.
   * </pre>
   *
   * Protobuf type {@code google.cloud.migrationcenter.v1.AssetList}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.migrationcenter.v1.AssetList)
      com.google.cloud.migrationcenter.v1.AssetListOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_AssetList_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_AssetList_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.migrationcenter.v1.AssetList.class,
              com.google.cloud.migrationcenter.v1.AssetList.Builder.class);
    }

    // Construct using com.google.cloud.migrationcenter.v1.AssetList.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      assetIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.migrationcenter.v1.MigrationCenterProto
          .internal_static_google_cloud_migrationcenter_v1_AssetList_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.AssetList getDefaultInstanceForType() {
      return com.google.cloud.migrationcenter.v1.AssetList.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.AssetList build() {
      com.google.cloud.migrationcenter.v1.AssetList result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.migrationcenter.v1.AssetList buildPartial() {
      com.google.cloud.migrationcenter.v1.AssetList result =
          new com.google.cloud.migrationcenter.v1.AssetList(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.migrationcenter.v1.AssetList result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        assetIds_.makeImmutable();
        result.assetIds_ = assetIds_;
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
      if (other instanceof com.google.cloud.migrationcenter.v1.AssetList) {
        return mergeFrom((com.google.cloud.migrationcenter.v1.AssetList) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.migrationcenter.v1.AssetList other) {
      if (other == com.google.cloud.migrationcenter.v1.AssetList.getDefaultInstance()) return this;
      if (!other.assetIds_.isEmpty()) {
        if (assetIds_.isEmpty()) {
          assetIds_ = other.assetIds_;
          bitField0_ |= 0x00000001;
        } else {
          ensureAssetIdsIsMutable();
          assetIds_.addAll(other.assetIds_);
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
                ensureAssetIdsIsMutable();
                assetIds_.add(s);
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

    private com.google.protobuf.LazyStringArrayList assetIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureAssetIdsIsMutable() {
      if (!assetIds_.isModifiable()) {
        assetIds_ = new com.google.protobuf.LazyStringArrayList(assetIds_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return A list containing the assetIds.
     */
    public com.google.protobuf.ProtocolStringList getAssetIdsList() {
      assetIds_.makeImmutable();
      return assetIds_;
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The count of assetIds.
     */
    public int getAssetIdsCount() {
      return assetIds_.size();
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the element to return.
     * @return The assetIds at the given index.
     */
    public java.lang.String getAssetIds(int index) {
      return assetIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the assetIds at the given index.
     */
    public com.google.protobuf.ByteString getAssetIdsBytes(int index) {
      return assetIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param index The index to set the value at.
     * @param value The assetIds to set.
     * @return This builder for chaining.
     */
    public Builder setAssetIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAssetIdsIsMutable();
      assetIds_.set(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The assetIds to add.
     * @return This builder for chaining.
     */
    public Builder addAssetIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureAssetIdsIsMutable();
      assetIds_.add(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param values The assetIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllAssetIds(java.lang.Iterable<java.lang.String> values) {
      ensureAssetIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, assetIds_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAssetIds() {
      assetIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. A list of asset IDs
     * </pre>
     *
     * <code>
     * repeated string asset_ids = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes of the assetIds to add.
     * @return This builder for chaining.
     */
    public Builder addAssetIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureAssetIdsIsMutable();
      assetIds_.add(value);
      bitField0_ |= 0x00000001;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.migrationcenter.v1.AssetList)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.migrationcenter.v1.AssetList)
  private static final com.google.cloud.migrationcenter.v1.AssetList DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.migrationcenter.v1.AssetList();
  }

  public static com.google.cloud.migrationcenter.v1.AssetList getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<AssetList> PARSER =
      new com.google.protobuf.AbstractParser<AssetList>() {
        @java.lang.Override
        public AssetList parsePartialFrom(
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

  public static com.google.protobuf.Parser<AssetList> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<AssetList> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.migrationcenter.v1.AssetList getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
