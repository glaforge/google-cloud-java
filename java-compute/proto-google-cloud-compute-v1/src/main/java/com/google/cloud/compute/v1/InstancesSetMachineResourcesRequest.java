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
 * Protobuf type {@code google.cloud.compute.v1.InstancesSetMachineResourcesRequest}
 */
public final class InstancesSetMachineResourcesRequest
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.InstancesSetMachineResourcesRequest)
    InstancesSetMachineResourcesRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use InstancesSetMachineResourcesRequest.newBuilder() to construct.
  private InstancesSetMachineResourcesRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private InstancesSetMachineResourcesRequest() {
    guestAccelerators_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new InstancesSetMachineResourcesRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesSetMachineResourcesRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_InstancesSetMachineResourcesRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.class,
            com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.Builder.class);
  }

  public static final int GUEST_ACCELERATORS_FIELD_NUMBER = 463595119;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> guestAccelerators_;
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> getGuestAcceleratorsList() {
    return guestAccelerators_;
  }
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
      getGuestAcceleratorsOrBuilderList() {
    return guestAccelerators_;
  }
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  @java.lang.Override
  public int getGuestAcceleratorsCount() {
    return guestAccelerators_.size();
  }
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AcceleratorConfig getGuestAccelerators(int index) {
    return guestAccelerators_.get(index);
  }
  /**
   *
   *
   * <pre>
   * A list of the type and count of accelerator cards attached to the instance.
   * </pre>
   *
   * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getGuestAcceleratorsOrBuilder(
      int index) {
    return guestAccelerators_.get(index);
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
    for (int i = 0; i < guestAccelerators_.size(); i++) {
      output.writeMessage(463595119, guestAccelerators_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < guestAccelerators_.size(); i++) {
      size +=
          com.google.protobuf.CodedOutputStream.computeMessageSize(
              463595119, guestAccelerators_.get(i));
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
    if (!(obj instanceof com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest other =
        (com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest) obj;

    if (!getGuestAcceleratorsList().equals(other.getGuestAcceleratorsList())) return false;
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
    if (getGuestAcceleratorsCount() > 0) {
      hash = (37 * hash) + GUEST_ACCELERATORS_FIELD_NUMBER;
      hash = (53 * hash) + getGuestAcceleratorsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest parseFrom(
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
      com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.InstancesSetMachineResourcesRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.InstancesSetMachineResourcesRequest)
      com.google.cloud.compute.v1.InstancesSetMachineResourcesRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesSetMachineResourcesRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesSetMachineResourcesRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.class,
              com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (guestAcceleratorsBuilder_ == null) {
        guestAccelerators_ = java.util.Collections.emptyList();
      } else {
        guestAccelerators_ = null;
        guestAcceleratorsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_InstancesSetMachineResourcesRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest build() {
      com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest buildPartial() {
      com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest result =
          new com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest result) {
      if (guestAcceleratorsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          guestAccelerators_ = java.util.Collections.unmodifiableList(guestAccelerators_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.guestAccelerators_ = guestAccelerators_;
      } else {
        result.guestAccelerators_ = guestAcceleratorsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest result) {
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
      if (other instanceof com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest) {
        return mergeFrom((com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest other) {
      if (other
          == com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest.getDefaultInstance())
        return this;
      if (guestAcceleratorsBuilder_ == null) {
        if (!other.guestAccelerators_.isEmpty()) {
          if (guestAccelerators_.isEmpty()) {
            guestAccelerators_ = other.guestAccelerators_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureGuestAcceleratorsIsMutable();
            guestAccelerators_.addAll(other.guestAccelerators_);
          }
          onChanged();
        }
      } else {
        if (!other.guestAccelerators_.isEmpty()) {
          if (guestAcceleratorsBuilder_.isEmpty()) {
            guestAcceleratorsBuilder_.dispose();
            guestAcceleratorsBuilder_ = null;
            guestAccelerators_ = other.guestAccelerators_;
            bitField0_ = (bitField0_ & ~0x00000001);
            guestAcceleratorsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getGuestAcceleratorsFieldBuilder()
                    : null;
          } else {
            guestAcceleratorsBuilder_.addAllMessages(other.guestAccelerators_);
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
            case -586206342:
              {
                com.google.cloud.compute.v1.AcceleratorConfig m =
                    input.readMessage(
                        com.google.cloud.compute.v1.AcceleratorConfig.parser(), extensionRegistry);
                if (guestAcceleratorsBuilder_ == null) {
                  ensureGuestAcceleratorsIsMutable();
                  guestAccelerators_.add(m);
                } else {
                  guestAcceleratorsBuilder_.addMessage(m);
                }
                break;
              } // case -586206342
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

    private java.util.List<com.google.cloud.compute.v1.AcceleratorConfig> guestAccelerators_ =
        java.util.Collections.emptyList();

    private void ensureGuestAcceleratorsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        guestAccelerators_ =
            new java.util.ArrayList<com.google.cloud.compute.v1.AcceleratorConfig>(
                guestAccelerators_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.AcceleratorConfig,
            com.google.cloud.compute.v1.AcceleratorConfig.Builder,
            com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
        guestAcceleratorsBuilder_;

    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.AcceleratorConfig>
        getGuestAcceleratorsList() {
      if (guestAcceleratorsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(guestAccelerators_);
      } else {
        return guestAcceleratorsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public int getGuestAcceleratorsCount() {
      if (guestAcceleratorsBuilder_ == null) {
        return guestAccelerators_.size();
      } else {
        return guestAcceleratorsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public com.google.cloud.compute.v1.AcceleratorConfig getGuestAccelerators(int index) {
      if (guestAcceleratorsBuilder_ == null) {
        return guestAccelerators_.get(index);
      } else {
        return guestAcceleratorsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder setGuestAccelerators(
        int index, com.google.cloud.compute.v1.AcceleratorConfig value) {
      if (guestAcceleratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.set(index, value);
        onChanged();
      } else {
        guestAcceleratorsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder setGuestAccelerators(
        int index, com.google.cloud.compute.v1.AcceleratorConfig.Builder builderForValue) {
      if (guestAcceleratorsBuilder_ == null) {
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.set(index, builderForValue.build());
        onChanged();
      } else {
        guestAcceleratorsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder addGuestAccelerators(com.google.cloud.compute.v1.AcceleratorConfig value) {
      if (guestAcceleratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.add(value);
        onChanged();
      } else {
        guestAcceleratorsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder addGuestAccelerators(
        int index, com.google.cloud.compute.v1.AcceleratorConfig value) {
      if (guestAcceleratorsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.add(index, value);
        onChanged();
      } else {
        guestAcceleratorsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder addGuestAccelerators(
        com.google.cloud.compute.v1.AcceleratorConfig.Builder builderForValue) {
      if (guestAcceleratorsBuilder_ == null) {
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.add(builderForValue.build());
        onChanged();
      } else {
        guestAcceleratorsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder addGuestAccelerators(
        int index, com.google.cloud.compute.v1.AcceleratorConfig.Builder builderForValue) {
      if (guestAcceleratorsBuilder_ == null) {
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.add(index, builderForValue.build());
        onChanged();
      } else {
        guestAcceleratorsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder addAllGuestAccelerators(
        java.lang.Iterable<? extends com.google.cloud.compute.v1.AcceleratorConfig> values) {
      if (guestAcceleratorsBuilder_ == null) {
        ensureGuestAcceleratorsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, guestAccelerators_);
        onChanged();
      } else {
        guestAcceleratorsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder clearGuestAccelerators() {
      if (guestAcceleratorsBuilder_ == null) {
        guestAccelerators_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        guestAcceleratorsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public Builder removeGuestAccelerators(int index) {
      if (guestAcceleratorsBuilder_ == null) {
        ensureGuestAcceleratorsIsMutable();
        guestAccelerators_.remove(index);
        onChanged();
      } else {
        guestAcceleratorsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public com.google.cloud.compute.v1.AcceleratorConfig.Builder getGuestAcceleratorsBuilder(
        int index) {
      return getGuestAcceleratorsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public com.google.cloud.compute.v1.AcceleratorConfigOrBuilder getGuestAcceleratorsOrBuilder(
        int index) {
      if (guestAcceleratorsBuilder_ == null) {
        return guestAccelerators_.get(index);
      } else {
        return guestAcceleratorsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public java.util.List<? extends com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
        getGuestAcceleratorsOrBuilderList() {
      if (guestAcceleratorsBuilder_ != null) {
        return guestAcceleratorsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(guestAccelerators_);
      }
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public com.google.cloud.compute.v1.AcceleratorConfig.Builder addGuestAcceleratorsBuilder() {
      return getGuestAcceleratorsFieldBuilder()
          .addBuilder(com.google.cloud.compute.v1.AcceleratorConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public com.google.cloud.compute.v1.AcceleratorConfig.Builder addGuestAcceleratorsBuilder(
        int index) {
      return getGuestAcceleratorsFieldBuilder()
          .addBuilder(index, com.google.cloud.compute.v1.AcceleratorConfig.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * A list of the type and count of accelerator cards attached to the instance.
     * </pre>
     *
     * <code>repeated .google.cloud.compute.v1.AcceleratorConfig guest_accelerators = 463595119;
     * </code>
     */
    public java.util.List<com.google.cloud.compute.v1.AcceleratorConfig.Builder>
        getGuestAcceleratorsBuilderList() {
      return getGuestAcceleratorsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.compute.v1.AcceleratorConfig,
            com.google.cloud.compute.v1.AcceleratorConfig.Builder,
            com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>
        getGuestAcceleratorsFieldBuilder() {
      if (guestAcceleratorsBuilder_ == null) {
        guestAcceleratorsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.compute.v1.AcceleratorConfig,
                com.google.cloud.compute.v1.AcceleratorConfig.Builder,
                com.google.cloud.compute.v1.AcceleratorConfigOrBuilder>(
                guestAccelerators_,
                ((bitField0_ & 0x00000001) != 0),
                getParentForChildren(),
                isClean());
        guestAccelerators_ = null;
      }
      return guestAcceleratorsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.InstancesSetMachineResourcesRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.InstancesSetMachineResourcesRequest)
  private static final com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest();
  }

  public static com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<InstancesSetMachineResourcesRequest> PARSER =
      new com.google.protobuf.AbstractParser<InstancesSetMachineResourcesRequest>() {
        @java.lang.Override
        public InstancesSetMachineResourcesRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<InstancesSetMachineResourcesRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<InstancesSetMachineResourcesRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.InstancesSetMachineResourcesRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
