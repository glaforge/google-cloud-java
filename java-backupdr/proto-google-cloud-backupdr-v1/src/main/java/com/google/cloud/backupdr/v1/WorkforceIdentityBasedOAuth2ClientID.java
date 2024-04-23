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
// source: google/cloud/backupdr/v1/backupdr.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.backupdr.v1;

/**
 *
 *
 * <pre>
 * OAuth Client ID depending on the Workforce Identity i.e. either 1p or 3p,
 * </pre>
 *
 * Protobuf type {@code google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID}
 */
public final class WorkforceIdentityBasedOAuth2ClientID
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID)
    WorkforceIdentityBasedOAuth2ClientIDOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use WorkforceIdentityBasedOAuth2ClientID.newBuilder() to construct.
  private WorkforceIdentityBasedOAuth2ClientID(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private WorkforceIdentityBasedOAuth2ClientID() {
    firstPartyOauth2ClientId_ = "";
    thirdPartyOauth2ClientId_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new WorkforceIdentityBasedOAuth2ClientID();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.backupdr.v1.BackupDRProto
        .internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.backupdr.v1.BackupDRProto
        .internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.class,
            com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.Builder.class);
  }

  public static final int FIRST_PARTY_OAUTH2_CLIENT_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object firstPartyOauth2ClientId_ = "";
  /**
   *
   *
   * <pre>
   * Output only. First party OAuth Client ID for Google Identities.
   * </pre>
   *
   * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The firstPartyOauth2ClientId.
   */
  @java.lang.Override
  public java.lang.String getFirstPartyOauth2ClientId() {
    java.lang.Object ref = firstPartyOauth2ClientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      firstPartyOauth2ClientId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. First party OAuth Client ID for Google Identities.
   * </pre>
   *
   * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for firstPartyOauth2ClientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFirstPartyOauth2ClientIdBytes() {
    java.lang.Object ref = firstPartyOauth2ClientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      firstPartyOauth2ClientId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int THIRD_PARTY_OAUTH2_CLIENT_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object thirdPartyOauth2ClientId_ = "";
  /**
   *
   *
   * <pre>
   * Output only. Third party OAuth Client ID for External Identity Providers.
   * </pre>
   *
   * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The thirdPartyOauth2ClientId.
   */
  @java.lang.Override
  public java.lang.String getThirdPartyOauth2ClientId() {
    java.lang.Object ref = thirdPartyOauth2ClientId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      thirdPartyOauth2ClientId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. Third party OAuth Client ID for External Identity Providers.
   * </pre>
   *
   * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The bytes for thirdPartyOauth2ClientId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getThirdPartyOauth2ClientIdBytes() {
    java.lang.Object ref = thirdPartyOauth2ClientId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      thirdPartyOauth2ClientId_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstPartyOauth2ClientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, firstPartyOauth2ClientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thirdPartyOauth2ClientId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, thirdPartyOauth2ClientId_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(firstPartyOauth2ClientId_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(1, firstPartyOauth2ClientId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(thirdPartyOauth2ClientId_)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(2, thirdPartyOauth2ClientId_);
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
    if (!(obj instanceof com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID)) {
      return super.equals(obj);
    }
    com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID other =
        (com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID) obj;

    if (!getFirstPartyOauth2ClientId().equals(other.getFirstPartyOauth2ClientId())) return false;
    if (!getThirdPartyOauth2ClientId().equals(other.getThirdPartyOauth2ClientId())) return false;
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
    hash = (37 * hash) + FIRST_PARTY_OAUTH2_CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getFirstPartyOauth2ClientId().hashCode();
    hash = (37 * hash) + THIRD_PARTY_OAUTH2_CLIENT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getThirdPartyOauth2ClientId().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID parseFrom(
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
      com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID prototype) {
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
   * OAuth Client ID depending on the Workforce Identity i.e. either 1p or 3p,
   * </pre>
   *
   * Protobuf type {@code google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID)
      com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientIDOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.backupdr.v1.BackupDRProto
          .internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.backupdr.v1.BackupDRProto
          .internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.class,
              com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.Builder.class);
    }

    // Construct using
    // com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      firstPartyOauth2ClientId_ = "";
      thirdPartyOauth2ClientId_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.backupdr.v1.BackupDRProto
          .internal_static_google_cloud_backupdr_v1_WorkforceIdentityBasedOAuth2ClientID_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID
        getDefaultInstanceForType() {
      return com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID build() {
      com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID buildPartial() {
      com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID result =
          new com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.firstPartyOauth2ClientId_ = firstPartyOauth2ClientId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.thirdPartyOauth2ClientId_ = thirdPartyOauth2ClientId_;
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
      if (other instanceof com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID) {
        return mergeFrom((com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID other) {
      if (other
          == com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID.getDefaultInstance())
        return this;
      if (!other.getFirstPartyOauth2ClientId().isEmpty()) {
        firstPartyOauth2ClientId_ = other.firstPartyOauth2ClientId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getThirdPartyOauth2ClientId().isEmpty()) {
        thirdPartyOauth2ClientId_ = other.thirdPartyOauth2ClientId_;
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
                firstPartyOauth2ClientId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                thirdPartyOauth2ClientId_ = input.readStringRequireUtf8();
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

    private java.lang.Object firstPartyOauth2ClientId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. First party OAuth Client ID for Google Identities.
     * </pre>
     *
     * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The firstPartyOauth2ClientId.
     */
    public java.lang.String getFirstPartyOauth2ClientId() {
      java.lang.Object ref = firstPartyOauth2ClientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        firstPartyOauth2ClientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. First party OAuth Client ID for Google Identities.
     * </pre>
     *
     * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The bytes for firstPartyOauth2ClientId.
     */
    public com.google.protobuf.ByteString getFirstPartyOauth2ClientIdBytes() {
      java.lang.Object ref = firstPartyOauth2ClientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        firstPartyOauth2ClientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. First party OAuth Client ID for Google Identities.
     * </pre>
     *
     * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The firstPartyOauth2ClientId to set.
     * @return This builder for chaining.
     */
    public Builder setFirstPartyOauth2ClientId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      firstPartyOauth2ClientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. First party OAuth Client ID for Google Identities.
     * </pre>
     *
     * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFirstPartyOauth2ClientId() {
      firstPartyOauth2ClientId_ = getDefaultInstance().getFirstPartyOauth2ClientId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. First party OAuth Client ID for Google Identities.
     * </pre>
     *
     * <code>string first_party_oauth2_client_id = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The bytes for firstPartyOauth2ClientId to set.
     * @return This builder for chaining.
     */
    public Builder setFirstPartyOauth2ClientIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      firstPartyOauth2ClientId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object thirdPartyOauth2ClientId_ = "";
    /**
     *
     *
     * <pre>
     * Output only. Third party OAuth Client ID for External Identity Providers.
     * </pre>
     *
     * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The thirdPartyOauth2ClientId.
     */
    public java.lang.String getThirdPartyOauth2ClientId() {
      java.lang.Object ref = thirdPartyOauth2ClientId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        thirdPartyOauth2ClientId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Third party OAuth Client ID for External Identity Providers.
     * </pre>
     *
     * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The bytes for thirdPartyOauth2ClientId.
     */
    public com.google.protobuf.ByteString getThirdPartyOauth2ClientIdBytes() {
      java.lang.Object ref = thirdPartyOauth2ClientId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        thirdPartyOauth2ClientId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. Third party OAuth Client ID for External Identity Providers.
     * </pre>
     *
     * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The thirdPartyOauth2ClientId to set.
     * @return This builder for chaining.
     */
    public Builder setThirdPartyOauth2ClientId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      thirdPartyOauth2ClientId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Third party OAuth Client ID for External Identity Providers.
     * </pre>
     *
     * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearThirdPartyOauth2ClientId() {
      thirdPartyOauth2ClientId_ = getDefaultInstance().getThirdPartyOauth2ClientId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. Third party OAuth Client ID for External Identity Providers.
     * </pre>
     *
     * <code>string third_party_oauth2_client_id = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The bytes for thirdPartyOauth2ClientId to set.
     * @return This builder for chaining.
     */
    public Builder setThirdPartyOauth2ClientIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      thirdPartyOauth2ClientId_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID)
  private static final com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID();
  }

  public static com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<WorkforceIdentityBasedOAuth2ClientID> PARSER =
      new com.google.protobuf.AbstractParser<WorkforceIdentityBasedOAuth2ClientID>() {
        @java.lang.Override
        public WorkforceIdentityBasedOAuth2ClientID parsePartialFrom(
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

  public static com.google.protobuf.Parser<WorkforceIdentityBasedOAuth2ClientID> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<WorkforceIdentityBasedOAuth2ClientID> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.backupdr.v1.WorkforceIdentityBasedOAuth2ClientID
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
