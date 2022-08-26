/*
 * Copyright 2020 Google LLC
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

package com.google.iam.admin.v1;

/**
 *
 *
 * <pre>
 * Deprecated. [Migrate to Service Account Credentials
 * API](https://cloud.google.com/iam/help/credentials/migrate-api).
 * The service account sign blob response.
 * </pre>
 *
 * Protobuf type {@code google.iam.admin.v1.SignBlobResponse}
 */
public final class SignBlobResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.iam.admin.v1.SignBlobResponse)
    SignBlobResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SignBlobResponse.newBuilder() to construct.
  private SignBlobResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SignBlobResponse() {
    keyId_ = "";
    signature_ = com.google.protobuf.ByteString.EMPTY;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SignBlobResponse();
  }

  @java.lang.Override
  public final com.google.protobuf.UnknownFieldSet getUnknownFields() {
    return this.unknownFields;
  }

  private SignBlobResponse(
      com.google.protobuf.CodedInputStream input,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    this();
    if (extensionRegistry == null) {
      throw new java.lang.NullPointerException();
    }
    com.google.protobuf.UnknownFieldSet.Builder unknownFields =
        com.google.protobuf.UnknownFieldSet.newBuilder();
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
              java.lang.String s = input.readStringRequireUtf8();

              keyId_ = s;
              break;
            }
          case 18:
            {
              signature_ = input.readBytes();
              break;
            }
          default:
            {
              if (!parseUnknownField(input, unknownFields, extensionRegistry, tag)) {
                done = true;
              }
              break;
            }
        }
      }
    } catch (com.google.protobuf.InvalidProtocolBufferException e) {
      throw e.setUnfinishedMessage(this);
    } catch (com.google.protobuf.UninitializedMessageException e) {
      throw e.asInvalidProtocolBufferException().setUnfinishedMessage(this);
    } catch (java.io.IOException e) {
      throw new com.google.protobuf.InvalidProtocolBufferException(e).setUnfinishedMessage(this);
    } finally {
      this.unknownFields = unknownFields.build();
      makeExtensionsImmutable();
    }
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.iam.admin.v1.IamProto
        .internal_static_google_iam_admin_v1_SignBlobResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.iam.admin.v1.IamProto
        .internal_static_google_iam_admin_v1_SignBlobResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.iam.admin.v1.SignBlobResponse.class,
            com.google.iam.admin.v1.SignBlobResponse.Builder.class);
  }

  public static final int KEY_ID_FIELD_NUMBER = 1;
  private volatile java.lang.Object keyId_;
  /**
   *
   *
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   * The id of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=883
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
   * The id of the key used to sign the blob.
   * </pre>
   *
   * <code>string key_id = 1 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=883
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

  public static final int SIGNATURE_FIELD_NUMBER = 2;
  private com.google.protobuf.ByteString signature_;
  /**
   *
   *
   * <pre>
   * Deprecated. [Migrate to Service Account Credentials
   * API](https://cloud.google.com/iam/help/credentials/migrate-api).
   * The signed blob.
   * </pre>
   *
   * <code>bytes signature = 2 [deprecated = true];</code>
   *
   * @deprecated google.iam.admin.v1.SignBlobResponse.signature is deprecated. See
   *     google/iam/admin/v1/iam.proto;l=889
   * @return The signature.
   */
  @java.lang.Override
  @java.lang.Deprecated
  public com.google.protobuf.ByteString getSignature() {
    return signature_;
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
    if (!signature_.isEmpty()) {
      output.writeBytes(2, signature_);
    }
    unknownFields.writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(keyId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, keyId_);
    }
    if (!signature_.isEmpty()) {
      size += com.google.protobuf.CodedOutputStream.computeBytesSize(2, signature_);
    }
    size += unknownFields.getSerializedSize();
    memoizedSize = size;
    return size;
  }

  @java.lang.Override
  public boolean equals(final java.lang.Object obj) {
    if (obj == this) {
      return true;
    }
    if (!(obj instanceof com.google.iam.admin.v1.SignBlobResponse)) {
      return super.equals(obj);
    }
    com.google.iam.admin.v1.SignBlobResponse other = (com.google.iam.admin.v1.SignBlobResponse) obj;

    if (!getKeyId().equals(other.getKeyId())) return false;
    if (!getSignature().equals(other.getSignature())) return false;
    if (!unknownFields.equals(other.unknownFields)) return false;
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
    hash = (37 * hash) + SIGNATURE_FIELD_NUMBER;
    hash = (53 * hash) + getSignature().hashCode();
    hash = (29 * hash) + unknownFields.hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.iam.admin.v1.SignBlobResponse parseFrom(
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

  public static Builder newBuilder(com.google.iam.admin.v1.SignBlobResponse prototype) {
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
   * The service account sign blob response.
   * </pre>
   *
   * Protobuf type {@code google.iam.admin.v1.SignBlobResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.iam.admin.v1.SignBlobResponse)
      com.google.iam.admin.v1.SignBlobResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.iam.admin.v1.IamProto
          .internal_static_google_iam_admin_v1_SignBlobResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.iam.admin.v1.IamProto
          .internal_static_google_iam_admin_v1_SignBlobResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.iam.admin.v1.SignBlobResponse.class,
              com.google.iam.admin.v1.SignBlobResponse.Builder.class);
    }

    // Construct using com.google.iam.admin.v1.SignBlobResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {}
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      keyId_ = "";

      signature_ = com.google.protobuf.ByteString.EMPTY;

      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.iam.admin.v1.IamProto
          .internal_static_google_iam_admin_v1_SignBlobResponse_descriptor;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignBlobResponse getDefaultInstanceForType() {
      return com.google.iam.admin.v1.SignBlobResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignBlobResponse build() {
      com.google.iam.admin.v1.SignBlobResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.iam.admin.v1.SignBlobResponse buildPartial() {
      com.google.iam.admin.v1.SignBlobResponse result =
          new com.google.iam.admin.v1.SignBlobResponse(this);
      result.keyId_ = keyId_;
      result.signature_ = signature_;
      onBuilt();
      return result;
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
      if (other instanceof com.google.iam.admin.v1.SignBlobResponse) {
        return mergeFrom((com.google.iam.admin.v1.SignBlobResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.iam.admin.v1.SignBlobResponse other) {
      if (other == com.google.iam.admin.v1.SignBlobResponse.getDefaultInstance()) return this;
      if (!other.getKeyId().isEmpty()) {
        keyId_ = other.keyId_;
        onChanged();
      }
      if (other.getSignature() != com.google.protobuf.ByteString.EMPTY) {
        setSignature(other.getSignature());
      }
      this.mergeUnknownFields(other.unknownFields);
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
      com.google.iam.admin.v1.SignBlobResponse parsedMessage = null;
      try {
        parsedMessage = PARSER.parsePartialFrom(input, extensionRegistry);
      } catch (com.google.protobuf.InvalidProtocolBufferException e) {
        parsedMessage = (com.google.iam.admin.v1.SignBlobResponse) e.getUnfinishedMessage();
        throw e.unwrapIOException();
      } finally {
        if (parsedMessage != null) {
          mergeFrom(parsedMessage);
        }
      }
      return this;
    }

    private java.lang.Object keyId_ = "";
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     * The id of the key used to sign the blob.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=883
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
     * The id of the key used to sign the blob.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=883
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
     * The id of the key used to sign the blob.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=883
     * @param value The keyId to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setKeyId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }

      keyId_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     * The id of the key used to sign the blob.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=883
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearKeyId() {

      keyId_ = getDefaultInstance().getKeyId();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     * The id of the key used to sign the blob.
     * </pre>
     *
     * <code>string key_id = 1 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.key_id is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=883
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
      onChanged();
      return this;
    }

    private com.google.protobuf.ByteString signature_ = com.google.protobuf.ByteString.EMPTY;
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     * The signed blob.
     * </pre>
     *
     * <code>bytes signature = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.signature is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=889
     * @return The signature.
     */
    @java.lang.Override
    @java.lang.Deprecated
    public com.google.protobuf.ByteString getSignature() {
      return signature_;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     * The signed blob.
     * </pre>
     *
     * <code>bytes signature = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.signature is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=889
     * @param value The signature to set.
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder setSignature(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }

      signature_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Deprecated. [Migrate to Service Account Credentials
     * API](https://cloud.google.com/iam/help/credentials/migrate-api).
     * The signed blob.
     * </pre>
     *
     * <code>bytes signature = 2 [deprecated = true];</code>
     *
     * @deprecated google.iam.admin.v1.SignBlobResponse.signature is deprecated. See
     *     google/iam/admin/v1/iam.proto;l=889
     * @return This builder for chaining.
     */
    @java.lang.Deprecated
    public Builder clearSignature() {

      signature_ = getDefaultInstance().getSignature();
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

    // @@protoc_insertion_point(builder_scope:google.iam.admin.v1.SignBlobResponse)
  }

  // @@protoc_insertion_point(class_scope:google.iam.admin.v1.SignBlobResponse)
  private static final com.google.iam.admin.v1.SignBlobResponse DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.iam.admin.v1.SignBlobResponse();
  }

  public static com.google.iam.admin.v1.SignBlobResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SignBlobResponse> PARSER =
      new com.google.protobuf.AbstractParser<SignBlobResponse>() {
        @java.lang.Override
        public SignBlobResponse parsePartialFrom(
            com.google.protobuf.CodedInputStream input,
            com.google.protobuf.ExtensionRegistryLite extensionRegistry)
            throws com.google.protobuf.InvalidProtocolBufferException {
          return new SignBlobResponse(input, extensionRegistry);
        }
      };

  public static com.google.protobuf.Parser<SignBlobResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SignBlobResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.iam.admin.v1.SignBlobResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}