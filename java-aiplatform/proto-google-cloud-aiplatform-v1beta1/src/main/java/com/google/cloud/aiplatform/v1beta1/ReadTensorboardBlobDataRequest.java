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
// source: google/cloud/aiplatform/v1beta1/tensorboard_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [TensorboardService.ReadTensorboardBlobData][google.cloud.aiplatform.v1beta1.TensorboardService.ReadTensorboardBlobData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest}
 */
public final class ReadTensorboardBlobDataRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest)
    ReadTensorboardBlobDataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReadTensorboardBlobDataRequest.newBuilder() to construct.
  private ReadTensorboardBlobDataRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReadTensorboardBlobDataRequest() {
    timeSeries_ = "";
    blobIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReadTensorboardBlobDataRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardBlobDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardBlobDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest.class,
            com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest.Builder.class);
  }

  public static final int TIME_SERIES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object timeSeries_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to list Blobs.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The timeSeries.
   */
  @java.lang.Override
  public java.lang.String getTimeSeries() {
    java.lang.Object ref = timeSeries_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      timeSeries_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the TensorboardTimeSeries to list Blobs.
   * Format:
   * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
   * </pre>
   *
   * <code>
   * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for timeSeries.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTimeSeriesBytes() {
    java.lang.Object ref = timeSeries_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      timeSeries_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int BLOB_IDS_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList blobIds_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @return A list containing the blobIds.
   */
  public com.google.protobuf.ProtocolStringList getBlobIdsList() {
    return blobIds_;
  }
  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @return The count of blobIds.
   */
  public int getBlobIdsCount() {
    return blobIds_.size();
  }
  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The blobIds at the given index.
   */
  public java.lang.String getBlobIds(int index) {
    return blobIds_.get(index);
  }
  /**
   *
   *
   * <pre>
   * IDs of the blobs to read.
   * </pre>
   *
   * <code>repeated string blob_ids = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the blobIds at the given index.
   */
  public com.google.protobuf.ByteString getBlobIdsBytes(int index) {
    return blobIds_.getByteString(index);
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeSeries_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, timeSeries_);
    }
    for (int i = 0; i < blobIds_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, blobIds_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(timeSeries_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, timeSeries_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < blobIds_.size(); i++) {
        dataSize += computeStringSizeNoTag(blobIds_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getBlobIdsList().size();
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest other =
        (com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest) obj;

    if (!getTimeSeries().equals(other.getTimeSeries())) return false;
    if (!getBlobIdsList().equals(other.getBlobIdsList())) return false;
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
    hash = (37 * hash) + TIME_SERIES_FIELD_NUMBER;
    hash = (53 * hash) + getTimeSeries().hashCode();
    if (getBlobIdsCount() > 0) {
      hash = (37 * hash) + BLOB_IDS_FIELD_NUMBER;
      hash = (53 * hash) + getBlobIdsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest prototype) {
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
   * Request message for
   * [TensorboardService.ReadTensorboardBlobData][google.cloud.aiplatform.v1beta1.TensorboardService.ReadTensorboardBlobData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest)
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardBlobDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardBlobDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest.class,
              com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest.Builder.class);
    }

    // Construct using
    // com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      timeSeries_ = "";
      blobIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.TensorboardServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_ReadTensorboardBlobDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest build() {
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest buildPartial() {
      com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest result =
          new com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.timeSeries_ = timeSeries_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        blobIds_.makeImmutable();
        result.blobIds_ = blobIds_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest) {
        return mergeFrom(
            (com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
              .getDefaultInstance()) return this;
      if (!other.getTimeSeries().isEmpty()) {
        timeSeries_ = other.timeSeries_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.blobIds_.isEmpty()) {
        if (blobIds_.isEmpty()) {
          blobIds_ = other.blobIds_;
          bitField0_ |= 0x00000002;
        } else {
          ensureBlobIdsIsMutable();
          blobIds_.addAll(other.blobIds_);
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
                timeSeries_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureBlobIdsIsMutable();
                blobIds_.add(s);
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

    private java.lang.Object timeSeries_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to list Blobs.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The timeSeries.
     */
    public java.lang.String getTimeSeries() {
      java.lang.Object ref = timeSeries_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        timeSeries_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to list Blobs.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for timeSeries.
     */
    public com.google.protobuf.ByteString getTimeSeriesBytes() {
      java.lang.Object ref = timeSeries_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        timeSeries_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to list Blobs.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The timeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSeries(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      timeSeries_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to list Blobs.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTimeSeries() {
      timeSeries_ = getDefaultInstance().getTimeSeries();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the TensorboardTimeSeries to list Blobs.
     * Format:
     * `projects/{project}/locations/{location}/tensorboards/{tensorboard}/experiments/{experiment}/runs/{run}/timeSeries/{time_series}`
     * </pre>
     *
     * <code>
     * string time_series = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for timeSeries to set.
     * @return This builder for chaining.
     */
    public Builder setTimeSeriesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      timeSeries_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList blobIds_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureBlobIdsIsMutable() {
      if (!blobIds_.isModifiable()) {
        blobIds_ = new com.google.protobuf.LazyStringArrayList(blobIds_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @return A list containing the blobIds.
     */
    public com.google.protobuf.ProtocolStringList getBlobIdsList() {
      blobIds_.makeImmutable();
      return blobIds_;
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @return The count of blobIds.
     */
    public int getBlobIdsCount() {
      return blobIds_.size();
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The blobIds at the given index.
     */
    public java.lang.String getBlobIds(int index) {
      return blobIds_.get(index);
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the blobIds at the given index.
     */
    public com.google.protobuf.ByteString getBlobIdsBytes(int index) {
      return blobIds_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The blobIds to set.
     * @return This builder for chaining.
     */
    public Builder setBlobIds(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBlobIdsIsMutable();
      blobIds_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @param value The blobIds to add.
     * @return This builder for chaining.
     */
    public Builder addBlobIds(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureBlobIdsIsMutable();
      blobIds_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @param values The blobIds to add.
     * @return This builder for chaining.
     */
    public Builder addAllBlobIds(java.lang.Iterable<java.lang.String> values) {
      ensureBlobIdsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, blobIds_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearBlobIds() {
      blobIds_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IDs of the blobs to read.
     * </pre>
     *
     * <code>repeated string blob_ids = 2;</code>
     *
     * @param value The bytes of the blobIds to add.
     * @return This builder for chaining.
     */
    public Builder addBlobIdsBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureBlobIdsIsMutable();
      blobIds_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest)
  private static final com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest();
  }

  public static com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReadTensorboardBlobDataRequest> PARSER =
      new com.google.protobuf.AbstractParser<ReadTensorboardBlobDataRequest>() {
        @java.lang.Override
        public ReadTensorboardBlobDataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReadTensorboardBlobDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReadTensorboardBlobDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.ReadTensorboardBlobDataRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
