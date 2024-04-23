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
// source: google/cloud/resourcemanager/v3/folders.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.resourcemanager.v3;

/**
 *
 *
 * <pre>
 * The CreateFolder request message.
 * </pre>
 *
 * Protobuf type {@code google.cloud.resourcemanager.v3.CreateFolderRequest}
 */
public final class CreateFolderRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.resourcemanager.v3.CreateFolderRequest)
    CreateFolderRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateFolderRequest.newBuilder() to construct.
  private CreateFolderRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateFolderRequest() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateFolderRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.resourcemanager.v3.FoldersProto
        .internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.resourcemanager.v3.FoldersProto
        .internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.resourcemanager.v3.CreateFolderRequest.class,
            com.google.cloud.resourcemanager.v3.CreateFolderRequest.Builder.class);
  }

  private int bitField0_;
  public static final int FOLDER_FIELD_NUMBER = 2;
  private com.google.cloud.resourcemanager.v3.Folder folder_;
  /**
   *
   *
   * <pre>
   * Required. The folder being created, only the display name and parent will
   * be consulted. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the folder field is set.
   */
  @java.lang.Override
  public boolean hasFolder() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The folder being created, only the display name and parent will
   * be consulted. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The folder.
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.Folder getFolder() {
    return folder_ == null
        ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
        : folder_;
  }
  /**
   *
   *
   * <pre>
   * Required. The folder being created, only the display name and parent will
   * be consulted. All other fields will be ignored.
   * </pre>
   *
   * <code>
   * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.FolderOrBuilder getFolderOrBuilder() {
    return folder_ == null
        ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
        : folder_;
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
      output.writeMessage(2, getFolder());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getFolder());
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
    if (!(obj instanceof com.google.cloud.resourcemanager.v3.CreateFolderRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.resourcemanager.v3.CreateFolderRequest other =
        (com.google.cloud.resourcemanager.v3.CreateFolderRequest) obj;

    if (hasFolder() != other.hasFolder()) return false;
    if (hasFolder()) {
      if (!getFolder().equals(other.getFolder())) return false;
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
    if (hasFolder()) {
      hash = (37 * hash) + FOLDER_FIELD_NUMBER;
      hash = (53 * hash) + getFolder().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest parseFrom(
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
      com.google.cloud.resourcemanager.v3.CreateFolderRequest prototype) {
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
   * The CreateFolder request message.
   * </pre>
   *
   * Protobuf type {@code google.cloud.resourcemanager.v3.CreateFolderRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.resourcemanager.v3.CreateFolderRequest)
      com.google.cloud.resourcemanager.v3.CreateFolderRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.resourcemanager.v3.CreateFolderRequest.class,
              com.google.cloud.resourcemanager.v3.CreateFolderRequest.Builder.class);
    }

    // Construct using com.google.cloud.resourcemanager.v3.CreateFolderRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getFolderFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      folder_ = null;
      if (folderBuilder_ != null) {
        folderBuilder_.dispose();
        folderBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.resourcemanager.v3.FoldersProto
          .internal_static_google_cloud_resourcemanager_v3_CreateFolderRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateFolderRequest getDefaultInstanceForType() {
      return com.google.cloud.resourcemanager.v3.CreateFolderRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateFolderRequest build() {
      com.google.cloud.resourcemanager.v3.CreateFolderRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.resourcemanager.v3.CreateFolderRequest buildPartial() {
      com.google.cloud.resourcemanager.v3.CreateFolderRequest result =
          new com.google.cloud.resourcemanager.v3.CreateFolderRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.resourcemanager.v3.CreateFolderRequest result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.folder_ = folderBuilder_ == null ? folder_ : folderBuilder_.build();
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
      if (other instanceof com.google.cloud.resourcemanager.v3.CreateFolderRequest) {
        return mergeFrom((com.google.cloud.resourcemanager.v3.CreateFolderRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.resourcemanager.v3.CreateFolderRequest other) {
      if (other == com.google.cloud.resourcemanager.v3.CreateFolderRequest.getDefaultInstance())
        return this;
      if (other.hasFolder()) {
        mergeFolder(other.getFolder());
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
            case 18:
              {
                input.readMessage(getFolderFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
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

    private com.google.cloud.resourcemanager.v3.Folder folder_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Folder,
            com.google.cloud.resourcemanager.v3.Folder.Builder,
            com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        folderBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the folder field is set.
     */
    public boolean hasFolder() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The folder.
     */
    public com.google.cloud.resourcemanager.v3.Folder getFolder() {
      if (folderBuilder_ == null) {
        return folder_ == null
            ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
            : folder_;
      } else {
        return folderBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFolder(com.google.cloud.resourcemanager.v3.Folder value) {
      if (folderBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        folder_ = value;
      } else {
        folderBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setFolder(com.google.cloud.resourcemanager.v3.Folder.Builder builderForValue) {
      if (folderBuilder_ == null) {
        folder_ = builderForValue.build();
      } else {
        folderBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeFolder(com.google.cloud.resourcemanager.v3.Folder value) {
      if (folderBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && folder_ != null
            && folder_ != com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()) {
          getFolderBuilder().mergeFrom(value);
        } else {
          folder_ = value;
        }
      } else {
        folderBuilder_.mergeFrom(value);
      }
      if (folder_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearFolder() {
      bitField0_ = (bitField0_ & ~0x00000001);
      folder_ = null;
      if (folderBuilder_ != null) {
        folderBuilder_.dispose();
        folderBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.Folder.Builder getFolderBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getFolderFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.resourcemanager.v3.FolderOrBuilder getFolderOrBuilder() {
      if (folderBuilder_ != null) {
        return folderBuilder_.getMessageOrBuilder();
      } else {
        return folder_ == null
            ? com.google.cloud.resourcemanager.v3.Folder.getDefaultInstance()
            : folder_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The folder being created, only the display name and parent will
     * be consulted. All other fields will be ignored.
     * </pre>
     *
     * <code>
     * .google.cloud.resourcemanager.v3.Folder folder = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.resourcemanager.v3.Folder,
            com.google.cloud.resourcemanager.v3.Folder.Builder,
            com.google.cloud.resourcemanager.v3.FolderOrBuilder>
        getFolderFieldBuilder() {
      if (folderBuilder_ == null) {
        folderBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.resourcemanager.v3.Folder,
                com.google.cloud.resourcemanager.v3.Folder.Builder,
                com.google.cloud.resourcemanager.v3.FolderOrBuilder>(
                getFolder(), getParentForChildren(), isClean());
        folder_ = null;
      }
      return folderBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.resourcemanager.v3.CreateFolderRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.resourcemanager.v3.CreateFolderRequest)
  private static final com.google.cloud.resourcemanager.v3.CreateFolderRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.resourcemanager.v3.CreateFolderRequest();
  }

  public static com.google.cloud.resourcemanager.v3.CreateFolderRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateFolderRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateFolderRequest>() {
        @java.lang.Override
        public CreateFolderRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateFolderRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateFolderRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.resourcemanager.v3.CreateFolderRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
