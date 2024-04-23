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
// source: google/cloud/networksecurity/v1/server_tls_policy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networksecurity.v1;

/**
 *
 *
 * <pre>
 * Response returned by the ListServerTlsPolicies method.
 * </pre>
 *
 * Protobuf type {@code google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse}
 */
public final class ListServerTlsPoliciesResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse)
    ListServerTlsPoliciesResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ListServerTlsPoliciesResponse.newBuilder() to construct.
  private ListServerTlsPoliciesResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ListServerTlsPoliciesResponse() {
    serverTlsPolicies_ = java.util.Collections.emptyList();
    nextPageToken_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ListServerTlsPoliciesResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networksecurity.v1.ServerTlsPolicyProto
        .internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networksecurity.v1.ServerTlsPolicyProto
        .internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.class,
            com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.Builder.class);
  }

  public static final int SERVER_TLS_POLICIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.networksecurity.v1.ServerTlsPolicy> serverTlsPolicies_;
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.networksecurity.v1.ServerTlsPolicy>
      getServerTlsPoliciesList() {
    return serverTlsPolicies_;
  }
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder>
      getServerTlsPoliciesOrBuilderList() {
    return serverTlsPolicies_;
  }
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  @java.lang.Override
  public int getServerTlsPoliciesCount() {
    return serverTlsPolicies_.size();
  }
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1.ServerTlsPolicy getServerTlsPolicies(int index) {
    return serverTlsPolicies_.get(index);
  }
  /**
   *
   *
   * <pre>
   * List of ServerTlsPolicy resources.
   * </pre>
   *
   * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder getServerTlsPoliciesOrBuilder(
      int index) {
    return serverTlsPolicies_.get(index);
  }

  public static final int NEXT_PAGE_TOKEN_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object nextPageToken_ = "";
  /**
   *
   *
   * <pre>
   * If there might be more results than those appearing in this response, then
   * `next_page_token` is included. To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
   * If there might be more results than those appearing in this response, then
   * `next_page_token` is included. To get the next set of results, call this
   * method again using the value of `next_page_token` as `page_token`.
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
    for (int i = 0; i < serverTlsPolicies_.size(); i++) {
      output.writeMessage(1, serverTlsPolicies_.get(i));
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
    for (int i = 0; i < serverTlsPolicies_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(1, serverTlsPolicies_.get(i));
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
    if (!(obj instanceof com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse other =
        (com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse) obj;

    if (!getServerTlsPoliciesList().equals(other.getServerTlsPoliciesList())) return false;
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
    if (getServerTlsPoliciesCount() > 0) {
      hash = (37 * hash) + SERVER_TLS_POLICIES_FIELD_NUMBER;
      hash = (53 * hash) + getServerTlsPoliciesList().hashCode();
    }
    hash = (37 * hash) + NEXT_PAGE_TOKEN_FIELD_NUMBER;
    hash = (53 * hash) + getNextPageToken().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse parseFrom(
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
      com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse prototype) {
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
   * Response returned by the ListServerTlsPolicies method.
   * </pre>
   *
   * Protobuf type {@code google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse)
      com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networksecurity.v1.ServerTlsPolicyProto
          .internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networksecurity.v1.ServerTlsPolicyProto
          .internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.class,
              com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.Builder.class);
    }

    // Construct using
    // com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (serverTlsPoliciesBuilder_ == null) {
        serverTlsPolicies_ = java.util.Collections.emptyList();
      } else {
        serverTlsPolicies_ = null;
        serverTlsPoliciesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      nextPageToken_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networksecurity.v1.ServerTlsPolicyProto
          .internal_static_google_cloud_networksecurity_v1_ListServerTlsPoliciesResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse
        getDefaultInstanceForType() {
      return com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse build() {
      com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse buildPartial() {
      com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse result =
          new com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse result) {
      if (serverTlsPoliciesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          serverTlsPolicies_ = java.util.Collections.unmodifiableList(serverTlsPolicies_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.serverTlsPolicies_ = serverTlsPolicies_;
      } else {
        result.serverTlsPolicies_ = serverTlsPoliciesBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse result) {
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
      if (other instanceof com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse) {
        return mergeFrom((com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse other) {
      if (other
          == com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse.getDefaultInstance())
        return this;
      if (serverTlsPoliciesBuilder_ == null) {
        if (!other.serverTlsPolicies_.isEmpty()) {
          if (serverTlsPolicies_.isEmpty()) {
            serverTlsPolicies_ = other.serverTlsPolicies_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureServerTlsPoliciesIsMutable();
            serverTlsPolicies_.addAll(other.serverTlsPolicies_);
          }
          onChanged();
        }
      } else {
        if (!other.serverTlsPolicies_.isEmpty()) {
          if (serverTlsPoliciesBuilder_.isEmpty()) {
            serverTlsPoliciesBuilder_.dispose();
            serverTlsPoliciesBuilder_ = null;
            serverTlsPolicies_ = other.serverTlsPolicies_;
            bitField0_ = (bitField0_ & ~0x00000001);
            serverTlsPoliciesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getServerTlsPoliciesFieldBuilder()
                    : null;
          } else {
            serverTlsPoliciesBuilder_.addAllMessages(other.serverTlsPolicies_);
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
                com.google.cloud.networksecurity.v1.ServerTlsPolicy m =
                    input.readMessage(
                        com.google.cloud.networksecurity.v1.ServerTlsPolicy.parser(),
                        extensionRegistry);
                if (serverTlsPoliciesBuilder_ == null) {
                  ensureServerTlsPoliciesIsMutable();
                  serverTlsPolicies_.add(m);
                } else {
                  serverTlsPoliciesBuilder_.addMessage(m);
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

    private java.util.List<com.google.cloud.networksecurity.v1.ServerTlsPolicy> serverTlsPolicies_ =
        java.util.Collections.emptyList();

    private void ensureServerTlsPoliciesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        serverTlsPolicies_ =
            new java.util.ArrayList<com.google.cloud.networksecurity.v1.ServerTlsPolicy>(
                serverTlsPolicies_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.networksecurity.v1.ServerTlsPolicy,
            com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder,
            com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder>
        serverTlsPoliciesBuilder_;

    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.networksecurity.v1.ServerTlsPolicy>
        getServerTlsPoliciesList() {
      if (serverTlsPoliciesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(serverTlsPolicies_);
      } else {
        return serverTlsPoliciesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public int getServerTlsPoliciesCount() {
      if (serverTlsPoliciesBuilder_ == null) {
        return serverTlsPolicies_.size();
      } else {
        return serverTlsPoliciesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public com.google.cloud.networksecurity.v1.ServerTlsPolicy getServerTlsPolicies(int index) {
      if (serverTlsPoliciesBuilder_ == null) {
        return serverTlsPolicies_.get(index);
      } else {
        return serverTlsPoliciesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder setServerTlsPolicies(
        int index, com.google.cloud.networksecurity.v1.ServerTlsPolicy value) {
      if (serverTlsPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.set(index, value);
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder setServerTlsPolicies(
        int index, com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder builderForValue) {
      if (serverTlsPoliciesBuilder_ == null) {
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.set(index, builderForValue.build());
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder addServerTlsPolicies(com.google.cloud.networksecurity.v1.ServerTlsPolicy value) {
      if (serverTlsPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.add(value);
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder addServerTlsPolicies(
        int index, com.google.cloud.networksecurity.v1.ServerTlsPolicy value) {
      if (serverTlsPoliciesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.add(index, value);
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder addServerTlsPolicies(
        com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder builderForValue) {
      if (serverTlsPoliciesBuilder_ == null) {
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.add(builderForValue.build());
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder addServerTlsPolicies(
        int index, com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder builderForValue) {
      if (serverTlsPoliciesBuilder_ == null) {
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.add(index, builderForValue.build());
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder addAllServerTlsPolicies(
        java.lang.Iterable<? extends com.google.cloud.networksecurity.v1.ServerTlsPolicy> values) {
      if (serverTlsPoliciesBuilder_ == null) {
        ensureServerTlsPoliciesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, serverTlsPolicies_);
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder clearServerTlsPolicies() {
      if (serverTlsPoliciesBuilder_ == null) {
        serverTlsPolicies_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public Builder removeServerTlsPolicies(int index) {
      if (serverTlsPoliciesBuilder_ == null) {
        ensureServerTlsPoliciesIsMutable();
        serverTlsPolicies_.remove(index);
        onChanged();
      } else {
        serverTlsPoliciesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder getServerTlsPoliciesBuilder(
        int index) {
      return getServerTlsPoliciesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder
        getServerTlsPoliciesOrBuilder(int index) {
      if (serverTlsPoliciesBuilder_ == null) {
        return serverTlsPolicies_.get(index);
      } else {
        return serverTlsPoliciesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder>
        getServerTlsPoliciesOrBuilderList() {
      if (serverTlsPoliciesBuilder_ != null) {
        return serverTlsPoliciesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(serverTlsPolicies_);
      }
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder
        addServerTlsPoliciesBuilder() {
      return getServerTlsPoliciesFieldBuilder()
          .addBuilder(com.google.cloud.networksecurity.v1.ServerTlsPolicy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder addServerTlsPoliciesBuilder(
        int index) {
      return getServerTlsPoliciesFieldBuilder()
          .addBuilder(
              index, com.google.cloud.networksecurity.v1.ServerTlsPolicy.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * List of ServerTlsPolicy resources.
     * </pre>
     *
     * <code>repeated .google.cloud.networksecurity.v1.ServerTlsPolicy server_tls_policies = 1;
     * </code>
     */
    public java.util.List<com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder>
        getServerTlsPoliciesBuilderList() {
      return getServerTlsPoliciesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.networksecurity.v1.ServerTlsPolicy,
            com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder,
            com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder>
        getServerTlsPoliciesFieldBuilder() {
      if (serverTlsPoliciesBuilder_ == null) {
        serverTlsPoliciesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.networksecurity.v1.ServerTlsPolicy,
                com.google.cloud.networksecurity.v1.ServerTlsPolicy.Builder,
                com.google.cloud.networksecurity.v1.ServerTlsPolicyOrBuilder>(
                serverTlsPolicies_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        serverTlsPolicies_ = null;
      }
      return serverTlsPoliciesBuilder_;
    }

    private java.lang.Object nextPageToken_ = "";
    /**
     *
     *
     * <pre>
     * If there might be more results than those appearing in this response, then
     * `next_page_token` is included. To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there might be more results than those appearing in this response, then
     * `next_page_token` is included. To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there might be more results than those appearing in this response, then
     * `next_page_token` is included. To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there might be more results than those appearing in this response, then
     * `next_page_token` is included. To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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
     * If there might be more results than those appearing in this response, then
     * `next_page_token` is included. To get the next set of results, call this
     * method again using the value of `next_page_token` as `page_token`.
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse)
  private static final com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse();
  }

  public static com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ListServerTlsPoliciesResponse> PARSER =
      new com.google.protobuf.AbstractParser<ListServerTlsPoliciesResponse>() {
        @java.lang.Override
        public ListServerTlsPoliciesResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ListServerTlsPoliciesResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ListServerTlsPoliciesResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networksecurity.v1.ListServerTlsPoliciesResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
