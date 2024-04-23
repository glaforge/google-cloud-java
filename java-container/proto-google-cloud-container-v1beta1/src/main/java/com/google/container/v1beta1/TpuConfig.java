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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Configuration for Cloud TPU.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.TpuConfig}
 */
public final class TpuConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.TpuConfig)
    TpuConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use TpuConfig.newBuilder() to construct.
  private TpuConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private TpuConfig() {
    ipv4CidrBlock_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new TpuConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_TpuConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_TpuConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.TpuConfig.class,
            com.google.container.v1beta1.TpuConfig.Builder.class);
  }

  public static final int ENABLED_FIELD_NUMBER = 1;
  private boolean enabled_ = false;
  /**
   *
   *
   * <pre>
   * Whether Cloud TPU integration is enabled or not.
   * </pre>
   *
   * <code>bool enabled = 1;</code>
   *
   * @return The enabled.
   */
  @java.lang.Override
  public boolean getEnabled() {
    return enabled_;
  }

  public static final int USE_SERVICE_NETWORKING_FIELD_NUMBER = 2;
  private boolean useServiceNetworking_ = false;
  /**
   *
   *
   * <pre>
   * Whether to use service networking for Cloud TPU or not.
   * </pre>
   *
   * <code>bool use_service_networking = 2;</code>
   *
   * @return The useServiceNetworking.
   */
  @java.lang.Override
  public boolean getUseServiceNetworking() {
    return useServiceNetworking_;
  }

  public static final int IPV4_CIDR_BLOCK_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object ipv4CidrBlock_ = "";
  /**
   *
   *
   * <pre>
   * IPv4 CIDR block reserved for Cloud TPU in the VPC.
   * </pre>
   *
   * <code>string ipv4_cidr_block = 3;</code>
   *
   * @return The ipv4CidrBlock.
   */
  @java.lang.Override
  public java.lang.String getIpv4CidrBlock() {
    java.lang.Object ref = ipv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      ipv4CidrBlock_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * IPv4 CIDR block reserved for Cloud TPU in the VPC.
   * </pre>
   *
   * <code>string ipv4_cidr_block = 3;</code>
   *
   * @return The bytes for ipv4CidrBlock.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getIpv4CidrBlockBytes() {
    java.lang.Object ref = ipv4CidrBlock_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      ipv4CidrBlock_ = b;
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
    if (enabled_ != false) {
      output.writeBool(1, enabled_);
    }
    if (useServiceNetworking_ != false) {
      output.writeBool(2, useServiceNetworking_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipv4CidrBlock_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, ipv4CidrBlock_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (enabled_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, enabled_);
    }
    if (useServiceNetworking_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, useServiceNetworking_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(ipv4CidrBlock_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, ipv4CidrBlock_);
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
    if (!(obj instanceof com.google.container.v1beta1.TpuConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.TpuConfig other = (com.google.container.v1beta1.TpuConfig) obj;

    if (getEnabled() != other.getEnabled()) return false;
    if (getUseServiceNetworking() != other.getUseServiceNetworking()) return false;
    if (!getIpv4CidrBlock().equals(other.getIpv4CidrBlock())) return false;
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
    hash = (37 * hash) + ENABLED_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getEnabled());
    hash = (37 * hash) + USE_SERVICE_NETWORKING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getUseServiceNetworking());
    hash = (37 * hash) + IPV4_CIDR_BLOCK_FIELD_NUMBER;
    hash = (53 * hash) + getIpv4CidrBlock().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.TpuConfig parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.TpuConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.TpuConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.TpuConfig prototype) {
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
   * Configuration for Cloud TPU.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.TpuConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.TpuConfig)
      com.google.container.v1beta1.TpuConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_TpuConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_TpuConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.TpuConfig.class,
              com.google.container.v1beta1.TpuConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.TpuConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      enabled_ = false;
      useServiceNetworking_ = false;
      ipv4CidrBlock_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_TpuConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.TpuConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.TpuConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.TpuConfig build() {
      com.google.container.v1beta1.TpuConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.TpuConfig buildPartial() {
      com.google.container.v1beta1.TpuConfig result =
          new com.google.container.v1beta1.TpuConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.TpuConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.enabled_ = enabled_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.useServiceNetworking_ = useServiceNetworking_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.ipv4CidrBlock_ = ipv4CidrBlock_;
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
      if (other instanceof com.google.container.v1beta1.TpuConfig) {
        return mergeFrom((com.google.container.v1beta1.TpuConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.TpuConfig other) {
      if (other == com.google.container.v1beta1.TpuConfig.getDefaultInstance()) return this;
      if (other.getEnabled() != false) {
        setEnabled(other.getEnabled());
      }
      if (other.getUseServiceNetworking() != false) {
        setUseServiceNetworking(other.getUseServiceNetworking());
      }
      if (!other.getIpv4CidrBlock().isEmpty()) {
        ipv4CidrBlock_ = other.ipv4CidrBlock_;
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
                enabled_ = input.readBool();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                useServiceNetworking_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                ipv4CidrBlock_ = input.readStringRequireUtf8();
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

    private boolean enabled_;
    /**
     *
     *
     * <pre>
     * Whether Cloud TPU integration is enabled or not.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return The enabled.
     */
    @java.lang.Override
    public boolean getEnabled() {
      return enabled_;
    }
    /**
     *
     *
     * <pre>
     * Whether Cloud TPU integration is enabled or not.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @param value The enabled to set.
     * @return This builder for chaining.
     */
    public Builder setEnabled(boolean value) {

      enabled_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether Cloud TPU integration is enabled or not.
     * </pre>
     *
     * <code>bool enabled = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearEnabled() {
      bitField0_ = (bitField0_ & ~0x00000001);
      enabled_ = false;
      onChanged();
      return this;
    }

    private boolean useServiceNetworking_;
    /**
     *
     *
     * <pre>
     * Whether to use service networking for Cloud TPU or not.
     * </pre>
     *
     * <code>bool use_service_networking = 2;</code>
     *
     * @return The useServiceNetworking.
     */
    @java.lang.Override
    public boolean getUseServiceNetworking() {
      return useServiceNetworking_;
    }
    /**
     *
     *
     * <pre>
     * Whether to use service networking for Cloud TPU or not.
     * </pre>
     *
     * <code>bool use_service_networking = 2;</code>
     *
     * @param value The useServiceNetworking to set.
     * @return This builder for chaining.
     */
    public Builder setUseServiceNetworking(boolean value) {

      useServiceNetworking_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether to use service networking for Cloud TPU or not.
     * </pre>
     *
     * <code>bool use_service_networking = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearUseServiceNetworking() {
      bitField0_ = (bitField0_ & ~0x00000002);
      useServiceNetworking_ = false;
      onChanged();
      return this;
    }

    private java.lang.Object ipv4CidrBlock_ = "";
    /**
     *
     *
     * <pre>
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * </pre>
     *
     * <code>string ipv4_cidr_block = 3;</code>
     *
     * @return The ipv4CidrBlock.
     */
    public java.lang.String getIpv4CidrBlock() {
      java.lang.Object ref = ipv4CidrBlock_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        ipv4CidrBlock_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * </pre>
     *
     * <code>string ipv4_cidr_block = 3;</code>
     *
     * @return The bytes for ipv4CidrBlock.
     */
    public com.google.protobuf.ByteString getIpv4CidrBlockBytes() {
      java.lang.Object ref = ipv4CidrBlock_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        ipv4CidrBlock_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * </pre>
     *
     * <code>string ipv4_cidr_block = 3;</code>
     *
     * @param value The ipv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setIpv4CidrBlock(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ipv4CidrBlock_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * </pre>
     *
     * <code>string ipv4_cidr_block = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearIpv4CidrBlock() {
      ipv4CidrBlock_ = getDefaultInstance().getIpv4CidrBlock();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * IPv4 CIDR block reserved for Cloud TPU in the VPC.
     * </pre>
     *
     * <code>string ipv4_cidr_block = 3;</code>
     *
     * @param value The bytes for ipv4CidrBlock to set.
     * @return This builder for chaining.
     */
    public Builder setIpv4CidrBlockBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ipv4CidrBlock_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.TpuConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.TpuConfig)
  private static final com.google.container.v1beta1.TpuConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.TpuConfig();
  }

  public static com.google.container.v1beta1.TpuConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<TpuConfig> PARSER =
      new com.google.protobuf.AbstractParser<TpuConfig>() {
        @java.lang.Override
        public TpuConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<TpuConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<TpuConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.TpuConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
