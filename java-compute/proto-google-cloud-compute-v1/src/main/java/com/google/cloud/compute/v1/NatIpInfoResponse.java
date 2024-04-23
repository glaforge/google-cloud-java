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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.NatIpInfoResponse}
 */
public final class NatIpInfoResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.NatIpInfoResponse)
    NatIpInfoResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NatIpInfoResponse.newBuilder() to construct.
  private NatIpInfoResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NatIpInfoResponse() {
    result_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NatIpInfoResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NatIpInfoResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_NatIpInfoResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.NatIpInfoResponse.class,
            com.google.cloud.compute.v1.NatIpInfoResponse.Builder.class);
  }

  public static final int RESULT_FIELD_NUMBER = 139315229;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.NatIpInfo> result_;
  /**
   *
   *
   * <pre>
   * [Output Only] A list of NAT IP information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.NatIpInfo> getResultList() {
    return result_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of NAT IP information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.NatIpInfoOrBuilder>
      getResultOrBuilderList() {
    return result_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of NAT IP information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
   */
  @java.lang.Override
  public int getResultCount() {
    return result_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of NAT IP information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NatIpInfo getResult(int index) {
    return result_.get(index);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] A list of NAT IP information.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.NatIpInfoOrBuilder getResultOrBuilder(int index) {
    return result_.get(index);
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
    for (int i = 0; i < result_.size(); i++) {
      output.writeMessage(139315229, result_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < result_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(139315229, result_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.NatIpInfoResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.NatIpInfoResponse other =
        (com.google.cloud.compute.v1.NatIpInfoResponse) obj;

    if (!getResultList().equals(other.getResultList())) return false;
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
    if (getResultCount() > 0) {
      hash = (37 * hash) + RESULT_FIELD_NUMBER;
      hash = (53 * hash) + getResultList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.NatIpInfoResponse prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.NatIpInfoResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.NatIpInfoResponse)
      com.google.cloud.compute.v1.NatIpInfoResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NatIpInfoResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NatIpInfoResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.NatIpInfoResponse.class,
              com.google.cloud.compute.v1.NatIpInfoResponse.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.NatIpInfoResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
      } else {
        result_ = null;
        resultBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_NatIpInfoResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NatIpInfoResponse getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.NatIpInfoResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NatIpInfoResponse build() {
      com.google.cloud.compute.v1.NatIpInfoResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.NatIpInfoResponse buildPartial() {
      com.google.cloud.compute.v1.NatIpInfoResponse result =
          new com.google.cloud.compute.v1.NatIpInfoResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.compute.v1.NatIpInfoResponse result) {
      if (resultBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          result_ = java.util.Collections.unmodifiableList(result_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.result_ = result_;
      } else {
        result.result_ = resultBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.compute.v1.NatIpInfoResponse result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.compute.v1.NatIpInfoResponse) {
        return mergeFrom((com.google.cloud.compute.v1.NatIpInfoResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.NatIpInfoResponse other) {
      if (other == com.google.cloud.compute.v1.NatIpInfoResponse.getDefaultInstance()) return this;
      if (resultBuilder_ == null) {
        if (!other.result_.isEmpty()) {
          if (result_.isEmpty()) {
            result_ = other.result_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureResultIsMutable();
            result_.addAll(other.result_);
          }
          onChanged();
        }
      } else {
        if (!other.result_.isEmpty()) {
          if (resultBuilder_.isEmpty()) {
            resultBuilder_.dispose();
            resultBuilder_ = null;
            result_ = other.result_;
            bitField0_ = (bitField0_ & ~0x00000001);
            resultBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getResultFieldBuilder()
                    : null;
          } else {
            resultBuilder_.addAllMessages(other.result_);
          }
        }
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
            case 1114521834:
              {
                com.google.cloud.compute.v1.NatIpInfo m =
                    input.readMessage(
                        com.google.cloud.compute.v1.NatIpInfo.parser(), extensionRegistry);
                if (resultBuilder_ == null) {
                  ensureResultIsMutable();
                  result_.add(m);
                } else {
                  resultBuilder_.addMessage(m);
                }
                break;
              } // case 1114521834
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

    private java.util.List<com.google.cloud.compute.v1.NatIpInfo> result_ =
        java.util.Collections.emptyList();

    private void ensureResultIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        result_ = new java.util.ArrayList<com.google.cloud.compute.v1.NatIpInfo>(result_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NatIpInfo,
            com.google.cloud.compute.v1.NatIpInfo.Builder,
            com.google.cloud.compute.v1.NatIpInfoOrBuilder>
        resultBuilder_;

    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NatIpInfo> getResultList() {
      if (resultBuilder_ == null) {
        return java.util.Collections.unmodifiableList(result_);
      } else {
        return resultBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public int getResultCount() {
      if (resultBuilder_ == null) {
        return result_.size();
      } else {
        return resultBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.NatIpInfo getResult(int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);
      } else {
        return resultBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder setResult(int index, com.google.cloud.compute.v1.NatIpInfo value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.set(index, value);
        onChanged();
      } else {
        resultBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder setResult(
        int index, com.google.cloud.compute.v1.NatIpInfo.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.set(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder addResult(com.google.cloud.compute.v1.NatIpInfo value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(value);
        onChanged();
      } else {
        resultBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder addResult(int index, com.google.cloud.compute.v1.NatIpInfo value) {
      if (resultBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureResultIsMutable();
        result_.add(index, value);
        onChanged();
      } else {
        resultBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder addResult(com.google.cloud.compute.v1.NatIpInfo.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder addResult(
        int index, com.google.cloud.compute.v1.NatIpInfo.Builder builderForValue) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.add(index, builderForValue.build());
        onChanged();
      } else {
        resultBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder addAllResult(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.NatIpInfo> values) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, result_);
        onChanged();
      } else {
        resultBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder clearResult() {
      if (resultBuilder_ == null) {
        result_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        resultBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public Builder removeResult(int index) {
      if (resultBuilder_ == null) {
        ensureResultIsMutable();
        result_.remove(index);
        onChanged();
      } else {
        resultBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.NatIpInfo.Builder getResultBuilder(int index) {
      return getResultFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.NatIpInfoOrBuilder getResultOrBuilder(int index) {
      if (resultBuilder_ == null) {
        return result_.get(index);
      } else {
        return resultBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.NatIpInfoOrBuilder>
        getResultOrBuilderList() {
      if (resultBuilder_ != null) {
        return resultBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(result_);
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.NatIpInfo.Builder addResultBuilder() {
      return getResultFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.NatIpInfo.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public com.google.cloud.compute.v1.NatIpInfo.Builder addResultBuilder(int index) {
      return getResultFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.NatIpInfo.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * [Output Only] A list of NAT IP information.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.NatIpInfo result = 139315229;</code>
     */
    public java.util.List<com.google.cloud.compute.v1.NatIpInfo.Builder> getResultBuilderList() {
      return getResultFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.NatIpInfo,
            com.google.cloud.compute.v1.NatIpInfo.Builder,
            com.google.cloud.compute.v1.NatIpInfoOrBuilder>
        getResultFieldBuilder() {
      if (resultBuilder_ == null) {
        resultBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.NatIpInfo,
                com.google.cloud.compute.v1.NatIpInfo.Builder,
                com.google.cloud.compute.v1.NatIpInfoOrBuilder>(
                result_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        result_ = null;
      }
      return resultBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.NatIpInfoResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.NatIpInfoResponse)
  private static final com.google.cloud.compute.v1.NatIpInfoResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.NatIpInfoResponse();
  }

  public static com.google.cloud.compute.v1.NatIpInfoResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NatIpInfoResponse> PARSER =
      new com.google.protobuf.AbstractParser<NatIpInfoResponse>() {
        @java.lang.Override
        public NatIpInfoResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<NatIpInfoResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NatIpInfoResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.NatIpInfoResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
