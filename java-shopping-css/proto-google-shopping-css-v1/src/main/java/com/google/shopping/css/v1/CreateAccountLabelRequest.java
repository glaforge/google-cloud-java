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
// source: google/shopping/css/v1/accounts_labels.proto

// Protobuf Java Version: 3.25.3
package com.google.shopping.css.v1;

/**
 *
 *
 * <pre>
 * Request message for the 'CreateAccountLanel' method.
 * </pre>
 *
 * Protobuf type {@code google.shopping.css.v1.CreateAccountLabelRequest}
 */
public final class CreateAccountLabelRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.shopping.css.v1.CreateAccountLabelRequest)
    CreateAccountLabelRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateAccountLabelRequest.newBuilder() to construct.
  private CreateAccountLabelRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateAccountLabelRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateAccountLabelRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.shopping.css.v1.AccountsLabelsProto
        .internal_static_google_shopping_css_v1_CreateAccountLabelRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.shopping.css.v1.AccountsLabelsProto
        .internal_static_google_shopping_css_v1_CreateAccountLabelRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.shopping.css.v1.CreateAccountLabelRequest.class,
            com.google.shopping.css.v1.CreateAccountLabelRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The parent account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The parent account.
   * Format: accounts/{account}
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int ACCOUNT_LABEL_FIELD_NUMBER = 2;
  private com.google.shopping.css.v1.AccountLabel accountLabel_;
  /**
   *
   *
   * <pre>
   * Required. The label to create.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the accountLabel field is set.
   */
  @java.lang.Override
  public boolean hasAccountLabel() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The label to create.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The accountLabel.
   */
  @java.lang.Override
  public com.google.shopping.css.v1.AccountLabel getAccountLabel() {
    return accountLabel_ == null
        ? com.google.shopping.css.v1.AccountLabel.getDefaultInstance()
        : accountLabel_;
  }
  /**
   *
   *
   * <pre>
   * Required. The label to create.
   * </pre>
   *
   * <code>
   * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.shopping.css.v1.AccountLabelOrBuilder getAccountLabelOrBuilder() {
    return accountLabel_ == null
        ? com.google.shopping.css.v1.AccountLabel.getDefaultInstance()
        : accountLabel_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getAccountLabel());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getAccountLabel());
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
    if (!(obj instanceof com.google.shopping.css.v1.CreateAccountLabelRequest)) {
      return super.equals(obj);
    }
    com.google.shopping.css.v1.CreateAccountLabelRequest other =
        (com.google.shopping.css.v1.CreateAccountLabelRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasAccountLabel() != other.hasAccountLabel()) return false;
    if (hasAccountLabel()) {
      if (!getAccountLabel().equals(other.getAccountLabel())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasAccountLabel()) {
      hash = (37 * hash) + ACCOUNT_LABEL_FIELD_NUMBER;
      hash = (53 * hash) + getAccountLabel().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest parseFrom(
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

  public static Builder newBuilder(com.google.shopping.css.v1.CreateAccountLabelRequest prototype) {
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
   * Request message for the 'CreateAccountLanel' method.
   * </pre>
   *
   * Protobuf type {@code google.shopping.css.v1.CreateAccountLabelRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.shopping.css.v1.CreateAccountLabelRequest)
      com.google.shopping.css.v1.CreateAccountLabelRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.shopping.css.v1.AccountsLabelsProto
          .internal_static_google_shopping_css_v1_CreateAccountLabelRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.shopping.css.v1.AccountsLabelsProto
          .internal_static_google_shopping_css_v1_CreateAccountLabelRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.shopping.css.v1.CreateAccountLabelRequest.class,
              com.google.shopping.css.v1.CreateAccountLabelRequest.Builder.class);
    }

    // Construct using com.google.shopping.css.v1.CreateAccountLabelRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getAccountLabelFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      accountLabel_ = null;
      if (accountLabelBuilder_ != null) {
        accountLabelBuilder_.dispose();
        accountLabelBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.shopping.css.v1.AccountsLabelsProto
          .internal_static_google_shopping_css_v1_CreateAccountLabelRequest_descriptor;
    }

    @java.lang.Override
    public com.google.shopping.css.v1.CreateAccountLabelRequest getDefaultInstanceForType() {
      return com.google.shopping.css.v1.CreateAccountLabelRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.shopping.css.v1.CreateAccountLabelRequest build() {
      com.google.shopping.css.v1.CreateAccountLabelRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.shopping.css.v1.CreateAccountLabelRequest buildPartial() {
      com.google.shopping.css.v1.CreateAccountLabelRequest result =
          new com.google.shopping.css.v1.CreateAccountLabelRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.shopping.css.v1.CreateAccountLabelRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.accountLabel_ =
            accountLabelBuilder_ == null ? accountLabel_ : accountLabelBuilder_.build();
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
      if (other instanceof com.google.shopping.css.v1.CreateAccountLabelRequest) {
        return mergeFrom((com.google.shopping.css.v1.CreateAccountLabelRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.shopping.css.v1.CreateAccountLabelRequest other) {
      if (other == com.google.shopping.css.v1.CreateAccountLabelRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasAccountLabel()) {
        mergeAccountLabel(other.getAccountLabel());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getAccountLabelFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The parent account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The parent account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The parent account.
     * Format: accounts/{account}
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.shopping.css.v1.AccountLabel accountLabel_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.css.v1.AccountLabel,
            com.google.shopping.css.v1.AccountLabel.Builder,
            com.google.shopping.css.v1.AccountLabelOrBuilder>
        accountLabelBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the accountLabel field is set.
     */
    public boolean hasAccountLabel() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The accountLabel.
     */
    public com.google.shopping.css.v1.AccountLabel getAccountLabel() {
      if (accountLabelBuilder_ == null) {
        return accountLabel_ == null
            ? com.google.shopping.css.v1.AccountLabel.getDefaultInstance()
            : accountLabel_;
      } else {
        return accountLabelBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAccountLabel(com.google.shopping.css.v1.AccountLabel value) {
      if (accountLabelBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        accountLabel_ = value;
      } else {
        accountLabelBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setAccountLabel(
        com.google.shopping.css.v1.AccountLabel.Builder builderForValue) {
      if (accountLabelBuilder_ == null) {
        accountLabel_ = builderForValue.build();
      } else {
        accountLabelBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeAccountLabel(com.google.shopping.css.v1.AccountLabel value) {
      if (accountLabelBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && accountLabel_ != null
            && accountLabel_ != com.google.shopping.css.v1.AccountLabel.getDefaultInstance()) {
          getAccountLabelBuilder().mergeFrom(value);
        } else {
          accountLabel_ = value;
        }
      } else {
        accountLabelBuilder_.mergeFrom(value);
      }
      if (accountLabel_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearAccountLabel() {
      bitField0_ = (bitField0_ & ~0x00000002);
      accountLabel_ = null;
      if (accountLabelBuilder_ != null) {
        accountLabelBuilder_.dispose();
        accountLabelBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.css.v1.AccountLabel.Builder getAccountLabelBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getAccountLabelFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.shopping.css.v1.AccountLabelOrBuilder getAccountLabelOrBuilder() {
      if (accountLabelBuilder_ != null) {
        return accountLabelBuilder_.getMessageOrBuilder();
      } else {
        return accountLabel_ == null
            ? com.google.shopping.css.v1.AccountLabel.getDefaultInstance()
            : accountLabel_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The label to create.
     * </pre>
     *
     * <code>
     * .google.shopping.css.v1.AccountLabel account_label = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.shopping.css.v1.AccountLabel,
            com.google.shopping.css.v1.AccountLabel.Builder,
            com.google.shopping.css.v1.AccountLabelOrBuilder>
        getAccountLabelFieldBuilder() {
      if (accountLabelBuilder_ == null) {
        accountLabelBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.shopping.css.v1.AccountLabel,
                com.google.shopping.css.v1.AccountLabel.Builder,
                com.google.shopping.css.v1.AccountLabelOrBuilder>(
                getAccountLabel(), getParentForChildren(), isClean());
        accountLabel_ = null;
      }
      return accountLabelBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.shopping.css.v1.CreateAccountLabelRequest)
  }

  // @@protoc_insertion_point(class_scope:google.shopping.css.v1.CreateAccountLabelRequest)
  private static final com.google.shopping.css.v1.CreateAccountLabelRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.shopping.css.v1.CreateAccountLabelRequest();
  }

  public static com.google.shopping.css.v1.CreateAccountLabelRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateAccountLabelRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateAccountLabelRequest>() {
        @java.lang.Override
        public CreateAccountLabelRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateAccountLabelRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateAccountLabelRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.shopping.css.v1.CreateAccountLabelRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
