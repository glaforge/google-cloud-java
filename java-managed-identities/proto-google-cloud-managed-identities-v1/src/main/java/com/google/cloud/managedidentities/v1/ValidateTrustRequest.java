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
// source: google/cloud/managedidentities/v1/managed_identities_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.managedidentities.v1;

/**
 *
 *
 * <pre>
 * Request message for
 * [ValidateTrust][google.cloud.managedidentities.v1.ValidateTrust]
 * </pre>
 *
 * Protobuf type {@code google.cloud.managedidentities.v1.ValidateTrustRequest}
 */
public final class ValidateTrustRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.managedidentities.v1.ValidateTrustRequest)
    ValidateTrustRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ValidateTrustRequest.newBuilder() to construct.
  private ValidateTrustRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ValidateTrustRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ValidateTrustRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
        .internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
        .internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.managedidentities.v1.ValidateTrustRequest.class,
            com.google.cloud.managedidentities.v1.ValidateTrustRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource domain name, project name, and location using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource domain name, project name, and location using the form:
   * `projects/{project_id}/locations/global/domains/{domain_name}`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TRUST_FIELD_NUMBER = 2;
  private com.google.cloud.managedidentities.v1.Trust trust_;
  /**
   *
   *
   * <pre>
   * Required. The domain trust to validate trust state for.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the trust field is set.
   */
  @java.lang.Override
  public boolean hasTrust() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The domain trust to validate trust state for.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The trust.
   */
  @java.lang.Override
  public com.google.cloud.managedidentities.v1.Trust getTrust() {
    return trust_ == null
        ? com.google.cloud.managedidentities.v1.Trust.getDefaultInstance()
        : trust_;
  }
  /**
   *
   *
   * <pre>
   * Required. The domain trust to validate trust state for.
   * </pre>
   *
   * <code>
   * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.managedidentities.v1.TrustOrBuilder getTrustOrBuilder() {
    return trust_ == null
        ? com.google.cloud.managedidentities.v1.Trust.getDefaultInstance()
        : trust_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getTrust());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getTrust());
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
    if (!(obj instanceof com.google.cloud.managedidentities.v1.ValidateTrustRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.managedidentities.v1.ValidateTrustRequest other =
        (com.google.cloud.managedidentities.v1.ValidateTrustRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasTrust() != other.hasTrust()) return false;
    if (hasTrust()) {
      if (!getTrust().equals(other.getTrust())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasTrust()) {
      hash = (37 * hash) + TRUST_FIELD_NUMBER;
      hash = (53 * hash) + getTrust().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest parseFrom(
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
      com.google.cloud.managedidentities.v1.ValidateTrustRequest prototype) {
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
   * [ValidateTrust][google.cloud.managedidentities.v1.ValidateTrust]
   * </pre>
   *
   * Protobuf type {@code google.cloud.managedidentities.v1.ValidateTrustRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.managedidentities.v1.ValidateTrustRequest)
      com.google.cloud.managedidentities.v1.ValidateTrustRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
          .internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
          .internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.managedidentities.v1.ValidateTrustRequest.class,
              com.google.cloud.managedidentities.v1.ValidateTrustRequest.Builder.class);
    }

    // Construct using com.google.cloud.managedidentities.v1.ValidateTrustRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getTrustFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      trust_ = null;
      if (trustBuilder_ != null) {
        trustBuilder_.dispose();
        trustBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.managedidentities.v1.ManagedIdentitiesServiceProto
          .internal_static_google_cloud_managedidentities_v1_ValidateTrustRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.ValidateTrustRequest getDefaultInstanceForType() {
      return com.google.cloud.managedidentities.v1.ValidateTrustRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.ValidateTrustRequest build() {
      com.google.cloud.managedidentities.v1.ValidateTrustRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.managedidentities.v1.ValidateTrustRequest buildPartial() {
      com.google.cloud.managedidentities.v1.ValidateTrustRequest result =
          new com.google.cloud.managedidentities.v1.ValidateTrustRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.managedidentities.v1.ValidateTrustRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.trust_ = trustBuilder_ == null ? trust_ : trustBuilder_.build();
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
      if (other instanceof com.google.cloud.managedidentities.v1.ValidateTrustRequest) {
        return mergeFrom((com.google.cloud.managedidentities.v1.ValidateTrustRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.managedidentities.v1.ValidateTrustRequest other) {
      if (other == com.google.cloud.managedidentities.v1.ValidateTrustRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasTrust()) {
        mergeTrust(other.getTrust());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getTrustFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource domain name, project name, and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource domain name, project name, and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource domain name, project name, and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource domain name, project name, and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource domain name, project name, and location using the form:
     * `projects/{project_id}/locations/global/domains/{domain_name}`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.managedidentities.v1.Trust trust_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.managedidentities.v1.Trust,
            com.google.cloud.managedidentities.v1.Trust.Builder,
            com.google.cloud.managedidentities.v1.TrustOrBuilder>
        trustBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the trust field is set.
     */
    public boolean hasTrust() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The trust.
     */
    public com.google.cloud.managedidentities.v1.Trust getTrust() {
      if (trustBuilder_ == null) {
        return trust_ == null
            ? com.google.cloud.managedidentities.v1.Trust.getDefaultInstance()
            : trust_;
      } else {
        return trustBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTrust(com.google.cloud.managedidentities.v1.Trust value) {
      if (trustBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        trust_ = value;
      } else {
        trustBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setTrust(com.google.cloud.managedidentities.v1.Trust.Builder builderForValue) {
      if (trustBuilder_ == null) {
        trust_ = builderForValue.build();
      } else {
        trustBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeTrust(com.google.cloud.managedidentities.v1.Trust value) {
      if (trustBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && trust_ != null
            && trust_ != com.google.cloud.managedidentities.v1.Trust.getDefaultInstance()) {
          getTrustBuilder().mergeFrom(value);
        } else {
          trust_ = value;
        }
      } else {
        trustBuilder_.mergeFrom(value);
      }
      if (trust_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearTrust() {
      bitField0_ = (bitField0_ & ~0x00000002);
      trust_ = null;
      if (trustBuilder_ != null) {
        trustBuilder_.dispose();
        trustBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedidentities.v1.Trust.Builder getTrustBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getTrustFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.managedidentities.v1.TrustOrBuilder getTrustOrBuilder() {
      if (trustBuilder_ != null) {
        return trustBuilder_.getMessageOrBuilder();
      } else {
        return trust_ == null
            ? com.google.cloud.managedidentities.v1.Trust.getDefaultInstance()
            : trust_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The domain trust to validate trust state for.
     * </pre>
     *
     * <code>
     * .google.cloud.managedidentities.v1.Trust trust = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.managedidentities.v1.Trust,
            com.google.cloud.managedidentities.v1.Trust.Builder,
            com.google.cloud.managedidentities.v1.TrustOrBuilder>
        getTrustFieldBuilder() {
      if (trustBuilder_ == null) {
        trustBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.managedidentities.v1.Trust,
                com.google.cloud.managedidentities.v1.Trust.Builder,
                com.google.cloud.managedidentities.v1.TrustOrBuilder>(
                getTrust(), getParentForChildren(), isClean());
        trust_ = null;
      }
      return trustBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.managedidentities.v1.ValidateTrustRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.managedidentities.v1.ValidateTrustRequest)
  private static final com.google.cloud.managedidentities.v1.ValidateTrustRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.managedidentities.v1.ValidateTrustRequest();
  }

  public static com.google.cloud.managedidentities.v1.ValidateTrustRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ValidateTrustRequest> PARSER =
      new com.google.protobuf.AbstractParser<ValidateTrustRequest>() {
        @java.lang.Override
        public ValidateTrustRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ValidateTrustRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ValidateTrustRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.managedidentities.v1.ValidateTrustRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
