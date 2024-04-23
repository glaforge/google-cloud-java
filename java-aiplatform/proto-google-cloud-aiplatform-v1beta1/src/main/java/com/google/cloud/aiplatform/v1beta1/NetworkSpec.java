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
// source: google/cloud/aiplatform/v1beta1/network_spec.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Network spec.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.NetworkSpec}
 */
public final class NetworkSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.NetworkSpec)
    NetworkSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use NetworkSpec.newBuilder() to construct.
  private NetworkSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private NetworkSpec() {
    network_ = "";
    subnetwork_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new NetworkSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.NetworkSpecProto
        .internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.NetworkSpecProto
        .internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.NetworkSpec.class,
            com.google.cloud.aiplatform.v1beta1.NetworkSpec.Builder.class);
  }

  public static final int ENABLE_INTERNET_ACCESS_FIELD_NUMBER = 1;
  private boolean enableInternetAccess_ = false;
  /**
   *
   *
   * <pre>
   * Whether to enable public internet access. Default false.
   * </pre>
   *
   * <code>bool enable_internet_access = 1;</code>
   *
   * @return The enableInternetAccess.
   */
  @java.lang.Override
  public boolean getEnableInternetAccess() {
    return enableInternetAccess_;
  }

  public static final int NETWORK_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object network_ = "";
  /**
   *
   *
   * <pre>
   * The full name of the Google Compute Engine
   * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
   * </pre>
   *
   * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The network.
   */
  @java.lang.Override
  public java.lang.String getNetwork() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      network_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The full name of the Google Compute Engine
   * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
   * </pre>
   *
   * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for network.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNetworkBytes() {
    java.lang.Object ref = network_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      network_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SUBNETWORK_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object subnetwork_ = "";
  /**
   *
   *
   * <pre>
   * The name of the subnet that this instance is in.
   * Format:
   * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
   * </pre>
   *
   * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The subnetwork.
   */
  @java.lang.Override
  public java.lang.String getSubnetwork() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      subnetwork_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the subnet that this instance is in.
   * Format:
   * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
   * </pre>
   *
   * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for subnetwork.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSubnetworkBytes() {
    java.lang.Object ref = subnetwork_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      subnetwork_ = b;
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
    if (enableInternetAccess_ != false) {
      output.writeBool(1, enableInternetAccess_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetwork_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, subnetwork_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enableInternetAccess_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enableInternetAccess_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(network_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, network_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(subnetwork_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, subnetwork_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.NetworkSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.NetworkSpec other =
        (com.google.cloud.aiplatform.v1beta1.NetworkSpec) obj;

    if (getEnableInternetAccess() != other.getEnableInternetAccess()) return false;
    if (!getNetwork().equals(other.getNetwork())) return false;
    if (!getSubnetwork().equals(other.getSubnetwork())) return false;
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
    hash = (37 * hash) + ENABLE_INTERNET_ACCESS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnableInternetAccess());
    hash = (37 * hash) + NETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getNetwork().hashCode();
    hash = (37 * hash) + SUBNETWORK_FIELD_NUMBER;
    hash = (53 * hash) + getSubnetwork().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.aiplatform.v1beta1.NetworkSpec prototype) {
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
   * Network spec.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.NetworkSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.NetworkSpec)
      com.google.cloud.aiplatform.v1beta1.NetworkSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.NetworkSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.NetworkSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.NetworkSpec.class,
              com.google.cloud.aiplatform.v1beta1.NetworkSpec.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.NetworkSpec.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enableInternetAccess_ = false;
      network_ = "";
      subnetwork_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.NetworkSpecProto
          .internal_static_google_cloud_aiplatform_v1beta1_NetworkSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.NetworkSpec getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.NetworkSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.NetworkSpec build() {
      com.google.cloud.aiplatform.v1beta1.NetworkSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.NetworkSpec buildPartial() {
      com.google.cloud.aiplatform.v1beta1.NetworkSpec result =
          new com.google.cloud.aiplatform.v1beta1.NetworkSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.NetworkSpec result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enableInternetAccess_ = enableInternetAccess_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.network_ = network_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.subnetwork_ = subnetwork_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.NetworkSpec) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.NetworkSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.NetworkSpec other) {
      if (other == com.google.cloud.aiplatform.v1beta1.NetworkSpec.getDefaultInstance())
        return this;
      if (other.getEnableInternetAccess() != false) {
        setEnableInternetAccess(other.getEnableInternetAccess());
      }
      if (!other.getNetwork().isEmpty()) {
        network_ = other.network_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getSubnetwork().isEmpty()) {
        subnetwork_ = other.subnetwork_;
        bitField0_ |= 0x00000004;
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
            case 8:
              {
                enableInternetAccess_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                network_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                subnetwork_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private boolean enableInternetAccess_;
    /**
     *
     *
     * <pre>
     * Whether to enable public internet access. Default false.
     * </pre>
     *
     * <code>bool enable_internet_access = 1;</code>
     *
     * @return The enableInternetAccess.
     */
    @java.lang.Override
    public boolean getEnableInternetAccess() {
      return enableInternetAccess_;
    }
    /**
     *
     *
     * <pre>
     * Whether to enable public internet access. Default false.
     * </pre>
     *
     * <code>bool enable_internet_access = 1;</code>
     *
     * @param value The enableInternetAccess to set.
     * @return This builder for chaining.
     */
    public Builder setEnableInternetAccess(boolean value) {

      enableInternetAccess_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to enable public internet access. Default false.
     * </pre>
     *
     * <code>bool enable_internet_access = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnableInternetAccess() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enableInternetAccess_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object network_ = "";
    /**
     *
     *
     * <pre>
     * The full name of the Google Compute Engine
     * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
     * </pre>
     *
     * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The network.
     */
    public java.lang.String getNetwork() {
      java.lang.Object ref = network_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        network_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Compute Engine
     * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
     * </pre>
     *
     * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for network.
     */
    public com.google.protobuf.ByteString getNetworkBytes() {
      java.lang.Object ref = network_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        network_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Compute Engine
     * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
     * </pre>
     *
     * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The network to set.
     * @return This builder for chaining.
     */
    public Builder setNetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      network_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Compute Engine
     * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
     * </pre>
     *
     * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearNetwork() {
      network_ = getDefaultInstance().getNetwork();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The full name of the Google Compute Engine
     * [network](https://cloud.google.com//compute/docs/networks-and-firewalls#networks)
     * </pre>
     *
     * <code>string network = 2 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for network to set.
     * @return This builder for chaining.
     */
    public Builder setNetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      network_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object subnetwork_ = "";
    /**
     *
     *
     * <pre>
     * The name of the subnet that this instance is in.
     * Format:
     * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
     * </pre>
     *
     * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The subnetwork.
     */
    public java.lang.String getSubnetwork() {
      java.lang.Object ref = subnetwork_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        subnetwork_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the subnet that this instance is in.
     * Format:
     * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
     * </pre>
     *
     * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for subnetwork.
     */
    public com.google.protobuf.ByteString getSubnetworkBytes() {
      java.lang.Object ref = subnetwork_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        subnetwork_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the subnet that this instance is in.
     * Format:
     * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
     * </pre>
     *
     * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The subnetwork to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetwork(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      subnetwork_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the subnet that this instance is in.
     * Format:
     * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
     * </pre>
     *
     * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSubnetwork() {
      subnetwork_ = getDefaultInstance().getSubnetwork();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the subnet that this instance is in.
     * Format:
     * `projects/{project_id_or_number}/regions/{region}/subnetworks/{subnetwork_id}`
     * </pre>
     *
     * <code>string subnetwork = 3 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for subnetwork to set.
     * @return This builder for chaining.
     */
    public Builder setSubnetworkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      subnetwork_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.NetworkSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.NetworkSpec)
  private static final com.google.cloud.aiplatform.v1beta1.NetworkSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.NetworkSpec();
  }

  public static com.google.cloud.aiplatform.v1beta1.NetworkSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<NetworkSpec> PARSER =
      new com.google.protobuf.AbstractParser<NetworkSpec>() {
        @java.lang.Override
        public NetworkSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<NetworkSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<NetworkSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.NetworkSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
