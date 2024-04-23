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
// source: google/cloud/aiplatform/v1beta1/match_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * The response message for
 * [MatchService.ReadIndexDatapoints][google.cloud.aiplatform.v1beta1.MatchService.ReadIndexDatapoints].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse}
 */
public final class ReadIndexDatapointsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse)
    ReadIndexDatapointsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadIndexDatapointsResponse.newBuilder() to construct.
  private ReadIndexDatapointsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadIndexDatapointsResponse() {
    datapoints_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadIndexDatapointsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.MatchServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.MatchServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.class,
            com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.Builder.class);
  }

  public static final int DATAPOINTS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> datapoints_;
  /**
   *
   *
   * <pre>
   * The result list of datapoints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> getDatapointsList() {
    return datapoints_;
  }
  /**
   *
   *
   * <pre>
   * The result list of datapoints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
      getDatapointsOrBuilderList() {
    return datapoints_;
  }
  /**
   *
   *
   * <pre>
   * The result list of datapoints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
   */
  @java.lang.Override
  public int getDatapointsCount() {
    return datapoints_.size();
  }
  /**
   *
   *
   * <pre>
   * The result list of datapoints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexDatapoint getDatapoints(int index) {
    return datapoints_.get(index);
  }
  /**
   *
   *
   * <pre>
   * The result list of datapoints.
   * </pre>
   *
   * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder getDatapointsOrBuilder(
      int index) {
    return datapoints_.get(index);
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
    for (int i = 0; i < datapoints_.size(); i++) {
      output.writeMessage(1, datapoints_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < datapoints_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, datapoints_.get(i));
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse other =
        (com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse) obj;

    if (!getDatapointsList().equals(other.getDatapointsList())) return false;
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
    if (getDatapointsCount() > 0) {
      hash = (37 * hash) + DATAPOINTS_FIELD_NUMBER;
      hash = (53 * hash) + getDatapointsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse prototype) {
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
   * The response message for
   * [MatchService.ReadIndexDatapoints][google.cloud.aiplatform.v1beta1.MatchService.ReadIndexDatapoints].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse)
      com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.MatchServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.MatchServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.class,
              com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (datapointsBuilder_ == null) {
        datapoints_ = java.util.Collections.emptyList();
      } else {
        datapoints_ = null;
        datapointsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.MatchServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadIndexDatapointsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse build() {
      com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse result =
          new com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse result) {
      if (datapointsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          datapoints_ = java.util.Collections.unmodifiableList(datapoints_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.datapoints_ = datapoints_;
      } else {
        result.datapoints_ = datapointsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse result) {
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse.getDefaultInstance())
        return this;
      if (datapointsBuilder_ == null) {
        if (!other.datapoints_.isEmpty()) {
          if (datapoints_.isEmpty()) {
            datapoints_ = other.datapoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureDatapointsIsMutable();
            datapoints_.addAll(other.datapoints_);
          }
          onChanged();
        }
      } else {
        if (!other.datapoints_.isEmpty()) {
          if (datapointsBuilder_.isEmpty()) {
            datapointsBuilder_.dispose();
            datapointsBuilder_ = null;
            datapoints_ = other.datapoints_;
            bitField0_ = (bitField0_ & ~0x00000001);
            datapointsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getDatapointsFieldBuilder()
                    : null;
          } else {
            datapointsBuilder_.addAllMessages(other.datapoints_);
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
            case 10:
              {
                com.google.cloud.aiplatform.v1beta1.IndexDatapoint m =
                    input.readMessage(
                        com.google.cloud.aiplatform.v1beta1.IndexDatapoint.parser(),
                        extensionRegistry);
                if (datapointsBuilder_ == null) {
                  ensureDatapointsIsMutable();
                  datapoints_.add(m);
                } else {
                  datapointsBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> datapoints_ =
        java.util.Collections.emptyList();

    private void ensureDatapointsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        datapoints_ =
            new java.util.ArrayList<com.google.cloud.aiplatform.v1beta1.IndexDatapoint>(
                datapoints_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint,
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder,
            com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
        datapointsBuilder_;

    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint> getDatapointsList() {
      if (datapointsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(datapoints_);
      } else {
        return datapointsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public int getDatapointsCount() {
      if (datapointsBuilder_ == null) {
        return datapoints_.size();
      } else {
        return datapointsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint getDatapoints(int index) {
      if (datapointsBuilder_ == null) {
        return datapoints_.get(index);
      } else {
        return datapointsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder setDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint value) {
      if (datapointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatapointsIsMutable();
        datapoints_.set(index, value);
        onChanged();
      } else {
        datapointsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder setDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder builderForValue) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.set(index, builderForValue.build());
        onChanged();
      } else {
        datapointsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder addDatapoints(com.google.cloud.aiplatform.v1beta1.IndexDatapoint value) {
      if (datapointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatapointsIsMutable();
        datapoints_.add(value);
        onChanged();
      } else {
        datapointsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder addDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint value) {
      if (datapointsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureDatapointsIsMutable();
        datapoints_.add(index, value);
        onChanged();
      } else {
        datapointsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder addDatapoints(
        com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder builderForValue) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.add(builderForValue.build());
        onChanged();
      } else {
        datapointsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder addDatapoints(
        int index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder builderForValue) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.add(index, builderForValue.build());
        onChanged();
      } else {
        datapointsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder addAllDatapoints(
        java.lang.Iterable<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapoint> values) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, datapoints_);
        onChanged();
      } else {
        datapointsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder clearDatapoints() {
      if (datapointsBuilder_ == null) {
        datapoints_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        datapointsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public Builder removeDatapoints(int index) {
      if (datapointsBuilder_ == null) {
        ensureDatapointsIsMutable();
        datapoints_.remove(index);
        onChanged();
      } else {
        datapointsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder getDatapointsBuilder(
        int index) {
      return getDatapointsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder getDatapointsOrBuilder(
        int index) {
      if (datapointsBuilder_ == null) {
        return datapoints_.get(index);
      } else {
        return datapointsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
        getDatapointsOrBuilderList() {
      if (datapointsBuilder_ != null) {
        return datapointsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(datapoints_);
      }
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder addDatapointsBuilder() {
      return getDatapointsFieldBuilder()
          .addBuilder(com.google.cloud.aiplatform.v1beta1.IndexDatapoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder addDatapointsBuilder(
        int index) {
      return getDatapointsFieldBuilder()
          .addBuilder(
              index, com.google.cloud.aiplatform.v1beta1.IndexDatapoint.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * The result list of datapoints.
     * </pre>
     *
     * <code>repeated .google.cloud.aiplatform.v1beta1.IndexDatapoint datapoints = 1;</code>
     */
    public java.util.List<com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder>
        getDatapointsBuilderList() {
      return getDatapointsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint,
            com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder,
            com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>
        getDatapointsFieldBuilder() {
      if (datapointsBuilder_ == null) {
        datapointsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.IndexDatapoint,
                com.google.cloud.aiplatform.v1beta1.IndexDatapoint.Builder,
                com.google.cloud.aiplatform.v1beta1.IndexDatapointOrBuilder>(
                datapoints_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        datapoints_ = null;
      }
      return datapointsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadIndexDatapointsResponse> PARSER =
      new com.google.protobuf.AbstractParser<ReadIndexDatapointsResponse>() {
        @java.lang.Override
        public ReadIndexDatapointsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadIndexDatapointsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadIndexDatapointsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ReadIndexDatapointsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
