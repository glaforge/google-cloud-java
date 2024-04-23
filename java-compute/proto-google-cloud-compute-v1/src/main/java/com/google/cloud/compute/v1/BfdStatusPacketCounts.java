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
 * Protobuf type {@code google.cloud.compute.v1.BfdStatusPacketCounts}
 */
public final class BfdStatusPacketCounts extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.BfdStatusPacketCounts)
    BfdStatusPacketCountsOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BfdStatusPacketCounts.newBuilder() to construct.
  private BfdStatusPacketCounts(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BfdStatusPacketCounts() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BfdStatusPacketCounts();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BfdStatusPacketCounts_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_BfdStatusPacketCounts_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.BfdStatusPacketCounts.class,
            com.google.cloud.compute.v1.BfdStatusPacketCounts.Builder.class);
  }

  private int bitField0_;
  public static final int NUM_RX_FIELD_NUMBER = 39375263;
  private int numRx_ = 0;
  /**
   *
   *
   * <pre>
   * Number of packets received since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx = 39375263;</code>
   *
   * @return Whether the numRx field is set.
   */
  @java.lang.Override
  public boolean hasNumRx() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Number of packets received since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx = 39375263;</code>
   *
   * @return The numRx.
   */
  @java.lang.Override
  public int getNumRx() {
    return numRx_;
  }

  public static final int NUM_RX_REJECTED_FIELD_NUMBER = 281007902;
  private int numRxRejected_ = 0;
  /**
   *
   *
   * <pre>
   * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_rejected = 281007902;</code>
   *
   * @return Whether the numRxRejected field is set.
   */
  @java.lang.Override
  public boolean hasNumRxRejected() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_rejected = 281007902;</code>
   *
   * @return The numRxRejected.
   */
  @java.lang.Override
  public int getNumRxRejected() {
    return numRxRejected_;
  }

  public static final int NUM_RX_SUCCESSFUL_FIELD_NUMBER = 455361850;
  private int numRxSuccessful_ = 0;
  /**
   *
   *
   * <pre>
   * Number of packets received that were successfully processed since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_successful = 455361850;</code>
   *
   * @return Whether the numRxSuccessful field is set.
   */
  @java.lang.Override
  public boolean hasNumRxSuccessful() {
    return ((bitField0_ & 0x00000004) != 0);
  }
  /**
   *
   *
   * <pre>
   * Number of packets received that were successfully processed since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_rx_successful = 455361850;</code>
   *
   * @return The numRxSuccessful.
   */
  @java.lang.Override
  public int getNumRxSuccessful() {
    return numRxSuccessful_;
  }

  public static final int NUM_TX_FIELD_NUMBER = 39375325;
  private int numTx_ = 0;
  /**
   *
   *
   * <pre>
   * Number of packets transmitted since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_tx = 39375325;</code>
   *
   * @return Whether the numTx field is set.
   */
  @java.lang.Override
  public boolean hasNumTx() {
    return ((bitField0_ & 0x00000008) != 0);
  }
  /**
   *
   *
   * <pre>
   * Number of packets transmitted since the beginning of the current BFD session.
   * </pre>
   *
   * <code>optional uint32 num_tx = 39375325;</code>
   *
   * @return The numTx.
   */
  @java.lang.Override
  public int getNumTx() {
    return numTx_;
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
      output.writeUInt32(39375263, numRx_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      output.writeUInt32(39375325, numTx_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeUInt32(281007902, numRxRejected_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      output.writeUInt32(455361850, numRxSuccessful_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(39375263, numRx_);
    }
    if (((bitField0_ & 0x00000008) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(39375325, numTx_);
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(281007902, numRxRejected_);
    }
    if (((bitField0_ & 0x00000004) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeUInt32Size(455361850, numRxSuccessful_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.BfdStatusPacketCounts)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.BfdStatusPacketCounts other =
        (com.google.cloud.compute.v1.BfdStatusPacketCounts) obj;

    if (hasNumRx() != other.hasNumRx()) return false;
    if (hasNumRx()) {
      if (getNumRx() != other.getNumRx()) return false;
    }
    if (hasNumRxRejected() != other.hasNumRxRejected()) return false;
    if (hasNumRxRejected()) {
      if (getNumRxRejected() != other.getNumRxRejected()) return false;
    }
    if (hasNumRxSuccessful() != other.hasNumRxSuccessful()) return false;
    if (hasNumRxSuccessful()) {
      if (getNumRxSuccessful() != other.getNumRxSuccessful()) return false;
    }
    if (hasNumTx() != other.hasNumTx()) return false;
    if (hasNumTx()) {
      if (getNumTx() != other.getNumTx()) return false;
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
    if (hasNumRx()) {
      hash = (37 * hash) + NUM_RX_FIELD_NUMBER;
      hash = (53 * hash) + getNumRx();
    }
    if (hasNumRxRejected()) {
      hash = (37 * hash) + NUM_RX_REJECTED_FIELD_NUMBER;
      hash = (53 * hash) + getNumRxRejected();
    }
    if (hasNumRxSuccessful()) {
      hash = (37 * hash) + NUM_RX_SUCCESSFUL_FIELD_NUMBER;
      hash = (53 * hash) + getNumRxSuccessful();
    }
    if (hasNumTx()) {
      hash = (37 * hash) + NUM_TX_FIELD_NUMBER;
      hash = (53 * hash) + getNumTx();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.BfdStatusPacketCounts prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.BfdStatusPacketCounts}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.BfdStatusPacketCounts)
      com.google.cloud.compute.v1.BfdStatusPacketCountsOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BfdStatusPacketCounts_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BfdStatusPacketCounts_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.BfdStatusPacketCounts.class,
              com.google.cloud.compute.v1.BfdStatusPacketCounts.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.BfdStatusPacketCounts.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      numRx_ = 0;
      numRxRejected_ = 0;
      numRxSuccessful_ = 0;
      numTx_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_BfdStatusPacketCounts_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BfdStatusPacketCounts getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.BfdStatusPacketCounts.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BfdStatusPacketCounts build() {
      com.google.cloud.compute.v1.BfdStatusPacketCounts result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.BfdStatusPacketCounts buildPartial() {
      com.google.cloud.compute.v1.BfdStatusPacketCounts result =
          new com.google.cloud.compute.v1.BfdStatusPacketCounts(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.BfdStatusPacketCounts result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.numRx_ = numRx_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.numRxRejected_ = numRxRejected_;
        to_bitField0_ |= 0x00000002;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.numRxSuccessful_ = numRxSuccessful_;
        to_bitField0_ |= 0x00000004;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.numTx_ = numTx_;
        to_bitField0_ |= 0x00000008;
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
      if (other instanceof com.google.cloud.compute.v1.BfdStatusPacketCounts) {
        return mergeFrom((com.google.cloud.compute.v1.BfdStatusPacketCounts) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.BfdStatusPacketCounts other) {
      if (other == com.google.cloud.compute.v1.BfdStatusPacketCounts.getDefaultInstance())
        return this;
      if (other.hasNumRx()) {
        setNumRx(other.getNumRx());
      }
      if (other.hasNumRxRejected()) {
        setNumRxRejected(other.getNumRxRejected());
      }
      if (other.hasNumRxSuccessful()) {
        setNumRxSuccessful(other.getNumRxSuccessful());
      }
      if (other.hasNumTx()) {
        setNumTx(other.getNumTx());
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
            case 315002104:
              {
                numRx_ = input.readUInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 315002104
            case 315002600:
              {
                numTx_ = input.readUInt32();
                bitField0_ |= 0x00000008;
                break;
              } // case 315002600
            case -2046904080:
              {
                numRxRejected_ = input.readUInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case -2046904080
            case -652072496:
              {
                numRxSuccessful_ = input.readUInt32();
                bitField0_ |= 0x00000004;
                break;
              } // case -652072496
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

    private int numRx_;
    /**
     *
     *
     * <pre>
     * Number of packets received since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx = 39375263;</code>
     *
     * @return Whether the numRx field is set.
     */
    @java.lang.Override
    public boolean hasNumRx() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Number of packets received since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx = 39375263;</code>
     *
     * @return The numRx.
     */
    @java.lang.Override
    public int getNumRx() {
      return numRx_;
    }
    /**
     *
     *
     * <pre>
     * Number of packets received since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx = 39375263;</code>
     *
     * @param value The numRx to set.
     * @return This builder for chaining.
     */
    public Builder setNumRx(int value) {

      numRx_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of packets received since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx = 39375263;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumRx() {
      bitField0_ = (bitField0_ & ~0x00000001);
      numRx_ = 0;
      onChanged();
      return this;
    }

    private int numRxRejected_;
    /**
     *
     *
     * <pre>
     * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_rejected = 281007902;</code>
     *
     * @return Whether the numRxRejected field is set.
     */
    @java.lang.Override
    public boolean hasNumRxRejected() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_rejected = 281007902;</code>
     *
     * @return The numRxRejected.
     */
    @java.lang.Override
    public int getNumRxRejected() {
      return numRxRejected_;
    }
    /**
     *
     *
     * <pre>
     * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_rejected = 281007902;</code>
     *
     * @param value The numRxRejected to set.
     * @return This builder for chaining.
     */
    public Builder setNumRxRejected(int value) {

      numRxRejected_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of packets received that were rejected because of errors since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_rejected = 281007902;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumRxRejected() {
      bitField0_ = (bitField0_ & ~0x00000002);
      numRxRejected_ = 0;
      onChanged();
      return this;
    }

    private int numRxSuccessful_;
    /**
     *
     *
     * <pre>
     * Number of packets received that were successfully processed since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_successful = 455361850;</code>
     *
     * @return Whether the numRxSuccessful field is set.
     */
    @java.lang.Override
    public boolean hasNumRxSuccessful() {
      return ((bitField0_ & 0x00000004) != 0);
    }
    /**
     *
     *
     * <pre>
     * Number of packets received that were successfully processed since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_successful = 455361850;</code>
     *
     * @return The numRxSuccessful.
     */
    @java.lang.Override
    public int getNumRxSuccessful() {
      return numRxSuccessful_;
    }
    /**
     *
     *
     * <pre>
     * Number of packets received that were successfully processed since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_successful = 455361850;</code>
     *
     * @param value The numRxSuccessful to set.
     * @return This builder for chaining.
     */
    public Builder setNumRxSuccessful(int value) {

      numRxSuccessful_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of packets received that were successfully processed since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_rx_successful = 455361850;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumRxSuccessful() {
      bitField0_ = (bitField0_ & ~0x00000004);
      numRxSuccessful_ = 0;
      onChanged();
      return this;
    }

    private int numTx_;
    /**
     *
     *
     * <pre>
     * Number of packets transmitted since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_tx = 39375325;</code>
     *
     * @return Whether the numTx field is set.
     */
    @java.lang.Override
    public boolean hasNumTx() {
      return ((bitField0_ & 0x00000008) != 0);
    }
    /**
     *
     *
     * <pre>
     * Number of packets transmitted since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_tx = 39375325;</code>
     *
     * @return The numTx.
     */
    @java.lang.Override
    public int getNumTx() {
      return numTx_;
    }
    /**
     *
     *
     * <pre>
     * Number of packets transmitted since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_tx = 39375325;</code>
     *
     * @param value The numTx to set.
     * @return This builder for chaining.
     */
    public Builder setNumTx(int value) {

      numTx_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Number of packets transmitted since the beginning of the current BFD session.
     * </pre>
     *
     * <code>optional uint32 num_tx = 39375325;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNumTx() {
      bitField0_ = (bitField0_ & ~0x00000008);
      numTx_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.BfdStatusPacketCounts)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.BfdStatusPacketCounts)
  private static final com.google.cloud.compute.v1.BfdStatusPacketCounts DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.BfdStatusPacketCounts();
  }

  public static com.google.cloud.compute.v1.BfdStatusPacketCounts getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BfdStatusPacketCounts> PARSER =
      new com.google.protobuf.AbstractParser<BfdStatusPacketCounts>() {
        @java.lang.Override
        public BfdStatusPacketCounts parsePartialFrom(
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

  public static com.google.protobuf.Parser<BfdStatusPacketCounts> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BfdStatusPacketCounts> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.BfdStatusPacketCounts getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
