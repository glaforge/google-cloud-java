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
// source: google/cloud/discoveryengine/v1/data_store_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.discoveryengine.v1;

/**
 *
 *
 * <pre>
 * Response message for
 * [DataStoreService.ListDataStores][google.cloud.discoveryengine.v1.DataStoreService.ListDataStores]
 * method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.discoveryengine.v1.ListDataStoresResponse}
 */
public final class ListDataStoresResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.discoveryengine.v1.ListDataStoresResponse)
    ListDataStoresResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListDataStoresResponse.newBuilder() to construct.
  private ListDataStoresResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListDataStoresResponse() {
    dataStores_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListDataStoresResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.discoveryengine.v1.DataStoreServiceProto
        .internal_static_google_cloud_discoveryengine_v1_ListDataStoresResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.discoveryengine.v1.DataStoreServiceProto
        .internal_static_google_cloud_discoveryengine_v1_ListDataStoresResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.discoveryengine.v1.ListDataStoresResponse.class,
            com.google.cloud.discoveryengine.v1.ListDataStoresResponse.Builder.class);
  }

  public static final int DATA_STORES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.discoveryengine.v1.DataStore> dataStores_;
  /**
   *
   *
   * <pre>
   * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.discoveryengine.v1.DataStore> getDataStoresList() {
    return dataStores_;
  }
  /**
   *
   *
   * <pre>
   * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.discoveryengine.v1.DataStoreOrBuilder>
      getDataStoresOrBuilderList() {
    return dataStores_;
  }
  /**
   *
   *
   * <pre>
   * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
   */
  @java.lang.Override
  public int getDataStoresCount() {
    return dataStores_.size();
  }
  /**
   *
   *
   * <pre>
   * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.DataStore getDataStores(int index) {
    return dataStores_.get(index);
  }
  /**
   *
   *
   * <pre>
   * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
   * </pre>
   *
   * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.DataStoreOrBuilder getDataStoresOrBuilder(int index) {
    return dataStores_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The nextPageToken.
   */
  @java.lang.Override
  public java.lang.String getNextPageToken() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      nextPageToken_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * A token that can be sent as
   * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
   * to retrieve the next page. If this field is omitted, there are no
   * subsequent pages.
   * </pre>
   *
   * <code>string next_page_token = 2;</code>
   *
   * @return The bytes for nextPageToken.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNextPageTokenBytes() {
    java.lang.Object ref = nextPageToken_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      nextPageToken_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    for (int i = 0; i < dataStores_.size(); i++) {
      output.writeMessage(1, dataStores_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, nextPageToken_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < dataStores_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, dataStores_.get(i));
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(nextPageToken_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, nextPageToken_);
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
    if (!(obj instanceof com.google.cloud.discoveryengine.v1.ListDataStoresResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.discoveryengine.v1.ListDataStoresResponse other =
        (com.google.cloud.discoveryengine.v1.ListDataStoresResponse) obj;

    if (!getDataStoresList().equals(other.getDataStoresList())) return false;
    if (!getNextPageToken().equals(other.getNextPageToken())) return false;
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
    if (getDataStoresCount() > 0) {
      hash = (37 * hash) + DATA_STORES_FIELD_NUMBER;
      hash = (53 * hash) + getDataStoresList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse parseFrom(
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
      com.google.cloud.discoveryengine.v1.ListDataStoresResponse prototype) {
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
   * Response message for
   * [DataStoreService.ListDataStores][google.cloud.discoveryengine.v1.DataStoreService.ListDataStores]
   * method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.discoveryengine.v1.ListDataStoresResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.discoveryengine.v1.ListDataStoresResponse)
      com.google.cloud.discoveryengine.v1.ListDataStoresResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.discoveryengine.v1.DataStoreServiceProto
          .internal_static_google_cloud_discoveryengine_v1_ListDataStoresResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.discoveryengine.v1.DataStoreServiceProto
          .internal_static_google_cloud_discoveryengine_v1_ListDataStoresResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.discoveryengine.v1.ListDataStoresResponse.class,
              com.google.cloud.discoveryengine.v1.ListDataStoresResponse.Builder.class);
    }

    // Construct using com.google.cloud.discoveryengine.v1.ListDataStoresResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (dataStoresBuilder_ == null) {
        dataStores_ = java.util.Collections.emptyList();
      } else {
        dataStores_ = null;
        dataStoresBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.discoveryengine.v1.DataStoreServiceProto
          .internal_static_google_cloud_discoveryengine_v1_ListDataStoresResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ListDataStoresResponse getDefaultInstanceForType() {
      return com.google.cloud.discoveryengine.v1.ListDataStoresResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ListDataStoresResponse build() {
      com.google.cloud.discoveryengine.v1.ListDataStoresResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.discoveryengine.v1.ListDataStoresResponse buildPartial() {
      com.google.cloud.discoveryengine.v1.ListDataStoresResponse result =
          new com.google.cloud.discoveryengine.v1.ListDataStoresResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.discoveryengine.v1.ListDataStoresResponse result) {
      if (dataStoresBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          dataStores_ = java.util.Collections.unmodifiableList(dataStores_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.dataStores_ = dataStores_;
      } else {
        result.dataStores_ = dataStoresBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.discoveryengine.v1.ListDataStoresResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.nextPageToken_ = nextPageToken_;
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
      if (other instanceof com.google.cloud.discoveryengine.v1.ListDataStoresResponse) {
        return mergeFrom((com.google.cloud.discoveryengine.v1.ListDataStoresResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.discoveryengine.v1.ListDataStoresResponse other) {
      if (other == com.google.cloud.discoveryengine.v1.ListDataStoresResponse.getDefaultInstance())
        return this;
      if (dataStoresBuilder_ == null) {
        if (!other.dataStores_.isEmpty()) {
          if (dataStores_.isEmpty()) {
            dataStores_ = other.dataStores_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDataStoresIsMutable();
            dataStores_.addAll(other.dataStores_);
          }
          onChanged();
        }
      } else {
        if (!other.dataStores_.isEmpty()) {
          if (dataStoresBuilder_.isEmpty()) {
            dataStoresBuilder_.dispose();
            dataStoresBuilder_ = null;
            dataStores_ = other.dataStores_;
            bitField0_ = (bitField0_ & ~0x00000001);
            dataStoresBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDataStoresFieldBuilder()
                    : null;
          } else {
            dataStoresBuilder_.addAllMessages(other.dataStores_);
          }
        }
      }
      if (!other.getNextPageToken().isEmpty()) {
        nextPageToken_ = other.nextPageToken_;
        bitField0_ |= 0x00000002;
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
                com.google.cloud.discoveryengine.v1.DataStore m =
                    input.readMessage(
                        com.google.cloud.discoveryengine.v1.DataStore.parser(), extensionRegistry);
                if (dataStoresBuilder_ == null) {
                  ensureDataStoresIsMutable();
                  dataStores_.add(m);
                } else {
                  dataStoresBuilder_.addMessage(m);
                }
                break;
              } // case 10
            case 18:
              {
                nextPageToken_ = input.readStringRequireUtf8();
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

    private java.util.List<com.google.cloud.discoveryengine.v1.DataStore> dataStores_ =
        java.util.Collections.emptyList();

    private void ensureDataStoresIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        dataStores_ =
            new java.util.ArrayList<com.google.cloud.discoveryengine.v1.DataStore>(dataStores_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.DataStore,
            com.google.cloud.discoveryengine.v1.DataStore.Builder,
            com.google.cloud.discoveryengine.v1.DataStoreOrBuilder>
        dataStoresBuilder_;

    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1.DataStore> getDataStoresList() {
      if (dataStoresBuilder_ == null) {
        return java.util.Collections.unmodifiableList(dataStores_);
      } else {
        return dataStoresBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public int getDataStoresCount() {
      if (dataStoresBuilder_ == null) {
        return dataStores_.size();
      } else {
        return dataStoresBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.DataStore getDataStores(int index) {
      if (dataStoresBuilder_ == null) {
        return dataStores_.get(index);
      } else {
        return dataStoresBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder setDataStores(int index, com.google.cloud.discoveryengine.v1.DataStore value) {
      if (dataStoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataStoresIsMutable();
        dataStores_.set(index, value);
        onChanged();
      } else {
        dataStoresBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder setDataStores(
        int index, com.google.cloud.discoveryengine.v1.DataStore.Builder builderForValue) {
      if (dataStoresBuilder_ == null) {
        ensureDataStoresIsMutable();
        dataStores_.set(index, builderForValue.build());
        onChanged();
      } else {
        dataStoresBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder addDataStores(com.google.cloud.discoveryengine.v1.DataStore value) {
      if (dataStoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataStoresIsMutable();
        dataStores_.add(value);
        onChanged();
      } else {
        dataStoresBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder addDataStores(int index, com.google.cloud.discoveryengine.v1.DataStore value) {
      if (dataStoresBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDataStoresIsMutable();
        dataStores_.add(index, value);
        onChanged();
      } else {
        dataStoresBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder addDataStores(
        com.google.cloud.discoveryengine.v1.DataStore.Builder builderForValue) {
      if (dataStoresBuilder_ == null) {
        ensureDataStoresIsMutable();
        dataStores_.add(builderForValue.build());
        onChanged();
      } else {
        dataStoresBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder addDataStores(
        int index, com.google.cloud.discoveryengine.v1.DataStore.Builder builderForValue) {
      if (dataStoresBuilder_ == null) {
        ensureDataStoresIsMutable();
        dataStores_.add(index, builderForValue.build());
        onChanged();
      } else {
        dataStoresBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder addAllDataStores(
        java.lang.Iterable<? extends com.google.cloud.discoveryengine.v1.DataStore> values) {
      if (dataStoresBuilder_ == null) {
        ensureDataStoresIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, dataStores_);
        onChanged();
      } else {
        dataStoresBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder clearDataStores() {
      if (dataStoresBuilder_ == null) {
        dataStores_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        dataStoresBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public Builder removeDataStores(int index) {
      if (dataStoresBuilder_ == null) {
        ensureDataStoresIsMutable();
        dataStores_.remove(index);
        onChanged();
      } else {
        dataStoresBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.DataStore.Builder getDataStoresBuilder(int index) {
      return getDataStoresFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.DataStoreOrBuilder getDataStoresOrBuilder(
        int index) {
      if (dataStoresBuilder_ == null) {
        return dataStores_.get(index);
      } else {
        return dataStoresBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.discoveryengine.v1.DataStoreOrBuilder>
        getDataStoresOrBuilderList() {
      if (dataStoresBuilder_ != null) {
        return dataStoresBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(dataStores_);
      }
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.DataStore.Builder addDataStoresBuilder() {
      return getDataStoresFieldBuilder()
          .addBuilder(com.google.cloud.discoveryengine.v1.DataStore.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public com.google.cloud.discoveryengine.v1.DataStore.Builder addDataStoresBuilder(int index) {
      return getDataStoresFieldBuilder()
          .addBuilder(index, com.google.cloud.discoveryengine.v1.DataStore.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * All the customer's [DataStore][google.cloud.discoveryengine.v1.DataStore]s.
     * </pre>
     *
     * <code>repeated .google.cloud.discoveryengine.v1.DataStore data_stores = 1;</code>
     */
    public java.util.List<com.google.cloud.discoveryengine.v1.DataStore.Builder>
        getDataStoresBuilderList() {
      return getDataStoresFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.discoveryengine.v1.DataStore,
            com.google.cloud.discoveryengine.v1.DataStore.Builder,
            com.google.cloud.discoveryengine.v1.DataStoreOrBuilder>
        getDataStoresFieldBuilder() {
      if (dataStoresBuilder_ == null) {
        dataStoresBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.discoveryengine.v1.DataStore,
                com.google.cloud.discoveryengine.v1.DataStore.Builder,
                com.google.cloud.discoveryengine.v1.DataStoreOrBuilder>(
                dataStores_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        dataStores_ = null;
      }
      return dataStoresBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * A token that can be sent as
     * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The nextPageToken.
     */
    public java.lang.String getNextPageToken() {
      java.lang.Object ref = nextPageToken_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        nextPageToken_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as
     * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return The bytes for nextPageToken.
     */
    public com.google.protobuf.ByteString getNextPageTokenBytes() {
      java.lang.Object ref = nextPageToken_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        nextPageToken_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as
     * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageToken(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      nextPageToken_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as
     * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNextPageToken() {
      nextPageToken_ = getDefaultInstance().getNextPageToken();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * A token that can be sent as
     * [ListDataStoresRequest.page_token][google.cloud.discoveryengine.v1.ListDataStoresRequest.page_token]
     * to retrieve the next page. If this field is omitted, there are no
     * subsequent pages.
     * </pre>
     *
     * <code>string next_page_token = 2;</code>
     *
     * @param value The bytes for nextPageToken to set.
     * @return This builder for chaining.
     */
    public Builder setNextPageTokenBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      nextPageToken_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.discoveryengine.v1.ListDataStoresResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.discoveryengine.v1.ListDataStoresResponse)
  private static final com.google.cloud.discoveryengine.v1.ListDataStoresResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.discoveryengine.v1.ListDataStoresResponse();
  }

  public static com.google.cloud.discoveryengine.v1.ListDataStoresResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListDataStoresResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListDataStoresResponse>() {
        @java.lang.Override
        public ListDataStoresResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListDataStoresResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListDataStoresResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.discoveryengine.v1.ListDataStoresResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
