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
 * Protobuf type {@code google.cloud.compute.v1.SecurityPoliciesWafConfig}
 */
public final class SecurityPoliciesWafConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.SecurityPoliciesWafConfig)
    SecurityPoliciesWafConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SecurityPoliciesWafConfig.newBuilder() to construct.
  private SecurityPoliciesWafConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SecurityPoliciesWafConfig() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SecurityPoliciesWafConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPoliciesWafConfig_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_SecurityPoliciesWafConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.SecurityPoliciesWafConfig.class,
            com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder.class);
  }

  private int bitField0_;
  public static final int WAF_RULES_FIELD_NUMBER = 74899924;
  private com.google.cloud.compute.v1.PreconfiguredWafSet wafRules_;
  /**
   * <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code>
   *
   * @return Whether the wafRules field is set.
   */
  @java.lang.Override
  public boolean hasWafRules() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   * <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code>
   *
   * @return The wafRules.
   */
  @java.lang.Override
  public com.google.cloud.compute.v1.PreconfiguredWafSet getWafRules() {
    return wafRules_ == null
        ? com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance()
        : wafRules_;
  }
  /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
  @java.lang.Override
  public com.google.cloud.compute.v1.PreconfiguredWafSetOrBuilder getWafRulesOrBuilder() {
    return wafRules_ == null
        ? com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance()
        : wafRules_;
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
      output.writeMessage(74899924, getWafRules());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(74899924, getWafRules());
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
    if (!(obj instanceof com.google.cloud.compute.v1.SecurityPoliciesWafConfig)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.SecurityPoliciesWafConfig other =
        (com.google.cloud.compute.v1.SecurityPoliciesWafConfig) obj;

    if (hasWafRules() != other.hasWafRules()) return false;
    if (hasWafRules()) {
      if (!getWafRules().equals(other.getWafRules())) return false;
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
    if (hasWafRules()) {
      hash = (37 * hash) + WAF_RULES_FIELD_NUMBER;
      hash = (53 * hash) + getWafRules().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig parseFrom(
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
      com.google.cloud.compute.v1.SecurityPoliciesWafConfig prototype) {
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
   * Protobuf type {@code google.cloud.compute.v1.SecurityPoliciesWafConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.SecurityPoliciesWafConfig)
      com.google.cloud.compute.v1.SecurityPoliciesWafConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPoliciesWafConfig_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPoliciesWafConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.SecurityPoliciesWafConfig.class,
              com.google.cloud.compute.v1.SecurityPoliciesWafConfig.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.SecurityPoliciesWafConfig.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getWafRulesFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      wafRules_ = null;
      if (wafRulesBuilder_ != null) {
        wafRulesBuilder_.dispose();
        wafRulesBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_SecurityPoliciesWafConfig_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPoliciesWafConfig getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPoliciesWafConfig build() {
      com.google.cloud.compute.v1.SecurityPoliciesWafConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.SecurityPoliciesWafConfig buildPartial() {
      com.google.cloud.compute.v1.SecurityPoliciesWafConfig result =
          new com.google.cloud.compute.v1.SecurityPoliciesWafConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.SecurityPoliciesWafConfig result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.wafRules_ = wafRulesBuilder_ == null ? wafRules_ : wafRulesBuilder_.build();
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
      if (other instanceof com.google.cloud.compute.v1.SecurityPoliciesWafConfig) {
        return mergeFrom((com.google.cloud.compute.v1.SecurityPoliciesWafConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.SecurityPoliciesWafConfig other) {
      if (other == com.google.cloud.compute.v1.SecurityPoliciesWafConfig.getDefaultInstance())
        return this;
      if (other.hasWafRules()) {
        mergeWafRules(other.getWafRules());
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
            case 599199394:
              {
                input.readMessage(getWafRulesFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 599199394
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

    private com.google.cloud.compute.v1.PreconfiguredWafSet wafRules_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.PreconfiguredWafSet,
            com.google.cloud.compute.v1.PreconfiguredWafSet.Builder,
            com.google.cloud.compute.v1.PreconfiguredWafSetOrBuilder>
        wafRulesBuilder_;
    /**
     * <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code>
     *
     * @return Whether the wafRules field is set.
     */
    public boolean hasWafRules() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     * <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code>
     *
     * @return The wafRules.
     */
    public com.google.cloud.compute.v1.PreconfiguredWafSet getWafRules() {
      if (wafRulesBuilder_ == null) {
        return wafRules_ == null
            ? com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance()
            : wafRules_;
      } else {
        return wafRulesBuilder_.getMessage();
      }
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    public Builder setWafRules(com.google.cloud.compute.v1.PreconfiguredWafSet value) {
      if (wafRulesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        wafRules_ = value;
      } else {
        wafRulesBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    public Builder setWafRules(
        com.google.cloud.compute.v1.PreconfiguredWafSet.Builder builderForValue) {
      if (wafRulesBuilder_ == null) {
        wafRules_ = builderForValue.build();
      } else {
        wafRulesBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    public Builder mergeWafRules(com.google.cloud.compute.v1.PreconfiguredWafSet value) {
      if (wafRulesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && wafRules_ != null
            && wafRules_ != com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance()) {
          getWafRulesBuilder().mergeFrom(value);
        } else {
          wafRules_ = value;
        }
      } else {
        wafRulesBuilder_.mergeFrom(value);
      }
      if (wafRules_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    public Builder clearWafRules() {
      bitField0_ = (bitField0_ & ~0x00000001);
      wafRules_ = null;
      if (wafRulesBuilder_ != null) {
        wafRulesBuilder_.dispose();
        wafRulesBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    public com.google.cloud.compute.v1.PreconfiguredWafSet.Builder getWafRulesBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getWafRulesFieldBuilder().getBuilder();
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    public com.google.cloud.compute.v1.PreconfiguredWafSetOrBuilder getWafRulesOrBuilder() {
      if (wafRulesBuilder_ != null) {
        return wafRulesBuilder_.getMessageOrBuilder();
      } else {
        return wafRules_ == null
            ? com.google.cloud.compute.v1.PreconfiguredWafSet.getDefaultInstance()
            : wafRules_;
      }
    }
    /** <code>optional .google.cloud.compute.v1.PreconfiguredWafSet waf_rules = 74899924;</code> */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.compute.v1.PreconfiguredWafSet,
            com.google.cloud.compute.v1.PreconfiguredWafSet.Builder,
            com.google.cloud.compute.v1.PreconfiguredWafSetOrBuilder>
        getWafRulesFieldBuilder() {
      if (wafRulesBuilder_ == null) {
        wafRulesBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.compute.v1.PreconfiguredWafSet,
                com.google.cloud.compute.v1.PreconfiguredWafSet.Builder,
                com.google.cloud.compute.v1.PreconfiguredWafSetOrBuilder>(
                getWafRules(), getParentForChildren(), isClean());
        wafRules_ = null;
      }
      return wafRulesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.SecurityPoliciesWafConfig)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.SecurityPoliciesWafConfig)
  private static final com.google.cloud.compute.v1.SecurityPoliciesWafConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.SecurityPoliciesWafConfig();
  }

  public static com.google.cloud.compute.v1.SecurityPoliciesWafConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SecurityPoliciesWafConfig> PARSER =
      new com.google.protobuf.AbstractParser<SecurityPoliciesWafConfig>() {
        @java.lang.Override
        public SecurityPoliciesWafConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<SecurityPoliciesWafConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SecurityPoliciesWafConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.SecurityPoliciesWafConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
