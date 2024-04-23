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
// source: google/iam/admin/v1/iam.proto

// Protobuf Java Version: 3.25.3
package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * Deprecated. [Migrate to Service Account Credentials
 * API](https://cloud.google.com/iam/help/credentials/migrate-api).
 *
 * The service account sign JWT response.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.SignJwtResponse}
 */
public final class SignJwtResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.SignJwtResponse)
    SignJwtResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SignJwtResponse.newBuilder() to construct.
  private SignJwtResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SignJwtResponse() {
    keyId_ = "";
    signedJwt_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SignJwtResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_SignJwtResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.Iam
        .internal_static_google_iam_admin_v1_SignJwtResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.SignJwtResponse.class,
            com.google.iam.admin.v1.SignJwtResponse.Builder.class);
  }

  public static final int KEY_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object keyId_ = "";
  /**
   *
   *
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The id of the key used to sign the JWT.
   * </pre>
   *
   * <code>string key_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1059
   * @return The keyId.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getKeyId() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      keyId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The id of the key used to sign the JWT.
   * </pre>
   *
   * <code>string key_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1059
   * @return The bytes for keyId.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getKeyIdBytes() {
    java.lang.Object ref = keyId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      keyId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int SIGNED_JWT_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object signedJwt_ = "";
  /**
   *
   *
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The signed JWT.
   * </pre>
   *
   * <code>string signed_jwt = 2 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1065
   * @return The signedJwt.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public java.lang.String getSignedJwt() {
    java.lang.Object ref = signedJwt_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      signedJwt_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The signed JWT.
   * </pre>
   *
   * <code>string signed_jwt = 2 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=1065
   * @return The bytes for signedJwt.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getSignedJwtBytes() {
    java.lang.Object ref = signedJwt_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      signedJwt_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, keyId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signedJwt_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, signedJwt_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(signedJwt_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, signedJwt_);
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
    if (!(obj instanceof com.google.iam.admin.v1.SignJwtResponse)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.SignJwtResponse other = (com.google.iam.admin.v1.SignJwtResponse) obj;

    if (!getKeyId().equals(other.getKeyId())) return false;
    if (!getSignedJwt().equals(other.getSignedJwt())) return false;
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
    hash = (37 * hash) + KEY_ID_FIELD_NUMBER;
    hash = (53 * hash) + getKeyId().hashCode();
    hash = (37 * hash) + SIGNED_JWT_FIELD_NUMBER;
    hash = (53 * hash) + getSignedJwt().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignJwtResponse parseFrom(
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

  public static Builder newBuilder(com.google.iam.admin.v1.SignJwtResponse prototype) {
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
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   *
   * The service account sign JWT response.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.SignJwtResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.SignJwtResponse)
      com.google.iam.admin.v1.SignJwtResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_SignJwtResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_SignJwtResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.SignJwtResponse.class,
              com.google.iam.admin.v1.SignJwtResponse.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.SignJwtResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      keyId_ = "";
      signedJwt_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.Iam
          .internal_static_google_iam_admin_v1_SignJwtResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignJwtResponse getDefaultInstanceForType() {
      return com.google.iam.admin.v1.SignJwtResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignJwtResponse build() {
      com.google.iam.admin.v1.SignJwtResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignJwtResponse buildPartial() {
      com.google.iam.admin.v1.SignJwtResponse result =
          new com.google.iam.admin.v1.SignJwtResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.iam.admin.v1.SignJwtResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.keyId_ = keyId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.signedJwt_ = signedJwt_;
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
      if (other instanceof com.google.iam.admin.v1.SignJwtResponse) {
        return mergeFrom((com.google.iam.admin.v1.SignJwtResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.SignJwtResponse other) {
      if (other == com.google.iam.admin.v1.SignJwtResponse.getDefaultInstance()) return this;
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getSignedJwt().isEmpty()) {
        signedJwt_ = other.signedJwt_;
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
                keyId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                signedJwt_ = input.readStringRequireUtf8();
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

    private java.lang.Object keyId_ = "";
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The id of the key used to sign the JWT.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1059
     * @return The keyId.
     */
    @java.lang.Deprecated
    public java.lang.String getKeyId() {
      java.lang.Object ref = keyId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        keyId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The id of the key used to sign the JWT.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1059
     * @return The bytes for keyId.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getKeyIdBytes() {
      java.lang.Object ref = keyId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        keyId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The id of the key used to sign the JWT.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1059
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      keyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The id of the key used to sign the JWT.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1059
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearKeyId() {
      keyId_ = getDefaultInstance().getKeyId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The id of the key used to sign the JWT.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1059
     * @param value The bytes for keyId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setKeyIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      keyId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object signedJwt_ = "";
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The signed JWT.
     * </pre>
     *
     * <code>string signed_jwt = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1065
     * @return The signedJwt.
     */
    @java.lang.Deprecated
    public java.lang.String getSignedJwt() {
      java.lang.Object ref = signedJwt_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        signedJwt_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The signed JWT.
     * </pre>
     *
     * <code>string signed_jwt = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1065
     * @return The bytes for signedJwt.
     */
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getSignedJwtBytes() {
      java.lang.Object ref = signedJwt_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        signedJwt_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The signed JWT.
     * </pre>
     *
     * <code>string signed_jwt = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1065
     * @param value The signedJwt to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setSignedJwt(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      signedJwt_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The signed JWT.
     * </pre>
     *
     * <code>string signed_jwt = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1065
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearSignedJwt() {
      signedJwt_ = getDefaultInstance().getSignedJwt();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     *
     * The signed JWT.
     * </pre>
     *
     * <code>string signed_jwt = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignJwtResponse.signed_jwt is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=1065
     * @param value The bytes for signedJwt to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setSignedJwtBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      signedJwt_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.SignJwtResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.SignJwtResponse)
  private static final com.google.iam.admin.v1.SignJwtResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.SignJwtResponse();
  }

  public static com.google.iam.admin.v1.SignJwtResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignJwtResponse> PARSER =
      new com.google.protobuf.AbstractParser<SignJwtResponse>() {
        @java.lang.Override
        public SignJwtResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<SignJwtResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignJwtResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.SignJwtResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
