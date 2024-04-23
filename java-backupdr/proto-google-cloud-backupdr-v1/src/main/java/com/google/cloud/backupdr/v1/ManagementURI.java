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
 * ManagementURI for the Management Server resource.
 * </pre>
 *
 * Protobuf type {@code google.cloud.backupdr.v1.ManagementURI}
 */
public final class ManagementURI extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.backupdr.v1.ManagementURI)
    ManagementURIOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ManagementURI.newBuilder() to construct.
  private ManagementURI(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ManagementURI() {
    webUi_ = "";
    api_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ManagementURI();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.backupdr.v1.BackupDRProto
        .internal_static_google_cloud_backupdr_v1_ManagementURI_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.backupdr.v1.BackupDRProto
        .internal_static_google_cloud_backupdr_v1_ManagementURI_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.backupdr.v1.ManagementURI.class,
            com.google.cloud.backupdr.v1.ManagementURI.Builder.class);
  }

  public static final int WEB_UI_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object webUi_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The ManagementServer AGM/RD WebUI URL.
   * </pre>
   *
   * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The webUi.
   */
  @java.lang.Override
  public java.lang.String getWebUi() {
    java.lang.Object ref = webUi_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      webUi_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The ManagementServer AGM/RD WebUI URL.
   * </pre>
   *
   * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for webUi.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getWebUiBytes() {
    java.lang.Object ref = webUi_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      webUi_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int API_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object api_ = "";
  /**
   *
   *
   * <pre>
   * Output only. The ManagementServer AGM/RD API URL.
   * </pre>
   *
   * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The api.
   */
  @java.lang.Override
  public java.lang.String getApi() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      api_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Output only. The ManagementServer AGM/RD API URL.
   * </pre>
   *
   * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The bytes for api.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getApiBytes() {
    java.lang.Object ref = api_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      api_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(webUi_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, webUi_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(api_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, api_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(webUi_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, webUi_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(api_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, api_);
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
    if (!(obj instanceof com.google.cloud.backupdr.v1.ManagementURI)) {
      return super.equals(obj);
    }
    com.google.cloud.backupdr.v1.ManagementURI other =
        (com.google.cloud.backupdr.v1.ManagementURI) obj;

    if (!getWebUi().equals(other.getWebUi())) return false;
    if (!getApi().equals(other.getApi())) return false;
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
    hash = (37 * hash) + WEB_UI_FIELD_NUMBER;
    hash = (53 * hash) + getWebUi().hashCode();
    hash = (37 * hash) + API_FIELD_NUMBER;
    hash = (53 * hash) + getApi().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.backupdr.v1.ManagementURI parseFrom(
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

  public static Builder newBuilder(com.google.cloud.backupdr.v1.ManagementURI prototype) {
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
   * ManagementURI for the Management Server resource.
   * </pre>
   *
   * Protobuf type {@code google.cloud.backupdr.v1.ManagementURI}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.backupdr.v1.ManagementURI)
      com.google.cloud.backupdr.v1.ManagementURIOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.backupdr.v1.BackupDRProto
          .internal_static_google_cloud_backupdr_v1_ManagementURI_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.backupdr.v1.BackupDRProto
          .internal_static_google_cloud_backupdr_v1_ManagementURI_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.backupdr.v1.ManagementURI.class,
              com.google.cloud.backupdr.v1.ManagementURI.Builder.class);
    }

    // Construct using com.google.cloud.backupdr.v1.ManagementURI.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      webUi_ = "";
      api_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.backupdr.v1.BackupDRProto
          .internal_static_google_cloud_backupdr_v1_ManagementURI_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.ManagementURI getDefaultInstanceForType() {
      return com.google.cloud.backupdr.v1.ManagementURI.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.ManagementURI build() {
      com.google.cloud.backupdr.v1.ManagementURI result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.backupdr.v1.ManagementURI buildPartial() {
      com.google.cloud.backupdr.v1.ManagementURI result =
          new com.google.cloud.backupdr.v1.ManagementURI(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.backupdr.v1.ManagementURI result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.webUi_ = webUi_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.api_ = api_;
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
      if (other instanceof com.google.cloud.backupdr.v1.ManagementURI) {
        return mergeFrom((com.google.cloud.backupdr.v1.ManagementURI) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.backupdr.v1.ManagementURI other) {
      if (other == com.google.cloud.backupdr.v1.ManagementURI.getDefaultInstance()) return this;
      if (!other.getWebUi().isEmpty()) {
        webUi_ = other.webUi_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getApi().isEmpty()) {
        api_ = other.api_;
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
                webUi_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                api_ = input.readStringRequireUtf8();
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

    private java.lang.Object webUi_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD WebUI URL.
     * </pre>
     *
     * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The webUi.
     */
    public java.lang.String getWebUi() {
      java.lang.Object ref = webUi_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        webUi_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD WebUI URL.
     * </pre>
     *
     * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for webUi.
     */
    public com.google.protobuf.ByteString getWebUiBytes() {
      java.lang.Object ref = webUi_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        webUi_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD WebUI URL.
     * </pre>
     *
     * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The webUi to set.
     * @return This builder for chaining.
     */
    public Builder setWebUi(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      webUi_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD WebUI URL.
     * </pre>
     *
     * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearWebUi() {
      webUi_ = getDefaultInstance().getWebUi();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD WebUI URL.
     * </pre>
     *
     * <code>string web_ui = 1 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for webUi to set.
     * @return This builder for chaining.
     */
    public Builder setWebUiBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      webUi_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object api_ = "";
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD API URL.
     * </pre>
     *
     * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The api.
     */
    public java.lang.String getApi() {
      java.lang.Object ref = api_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        api_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD API URL.
     * </pre>
     *
     * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The bytes for api.
     */
    public com.google.protobuf.ByteString getApiBytes() {
      java.lang.Object ref = api_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        api_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD API URL.
     * </pre>
     *
     * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The api to set.
     * @return This builder for chaining.
     */
    public Builder setApi(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      api_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD API URL.
     * </pre>
     *
     * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearApi() {
      api_ = getDefaultInstance().getApi();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The ManagementServer AGM/RD API URL.
     * </pre>
     *
     * <code>string api = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The bytes for api to set.
     * @return This builder for chaining.
     */
    public Builder setApiBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      api_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.backupdr.v1.ManagementURI)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.backupdr.v1.ManagementURI)
  private static final com.google.cloud.backupdr.v1.ManagementURI DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.backupdr.v1.ManagementURI();
  }

  public static com.google.cloud.backupdr.v1.ManagementURI getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ManagementURI> PARSER =
      new com.google.protobuf.AbstractParser<ManagementURI>() {
        @java.lang.Override
        public ManagementURI parsePartialFrom(
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

  public static com.google.protobuf.Parser<ManagementURI> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ManagementURI> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.backupdr.v1.ManagementURI getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
