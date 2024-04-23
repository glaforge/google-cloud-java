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
// source: google/cloud/securitycenter/settings/v1beta1/securitycenter_settings_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.settings.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for BatchGetSettings.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse}
 */
public final class BatchGetSettingsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse)
    BatchGetSettingsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use BatchGetSettingsResponse.newBuilder() to construct.
  private BatchGetSettingsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private BatchGetSettingsResponse() {
    settings_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new BatchGetSettingsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
        .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse.class,
            com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse.Builder
                .class);
  }

  public static final int SETTINGS_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings> settings_;
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings>
      getSettingsList() {
    return settings_;
  }
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  @java.lang.Override
  public java.util.List<
          ? extends com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder>
      getSettingsOrBuilderList() {
    return settings_;
  }
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  @java.lang.Override
  public int getSettingsCount() {
    return settings_.size();
  }
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.Settings getSettings(int index) {
    return settings_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Settings requested.
   * </pre>
   *
   * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder getSettingsOrBuilder(
      int index) {
    return settings_.get(index);
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
    for (int i = 0; i < settings_.size(); i++) {
      output.writeMessage(1, settings_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < settings_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, settings_.get(i));
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
    if (!(obj
        instanceof com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse other =
        (com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse) obj;

    if (!getSettingsList().equals(other.getSettingsList())) return false;
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
    if (getSettingsCount() > 0) {
      hash = (37 * hash) + SETTINGS_FIELD_NUMBER;
      hash = (53 * hash) + getSettingsList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse parseFrom(
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
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse prototype) {
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
   * Response message for BatchGetSettings.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse)
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse.class,
              com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse.Builder
                  .class);
    }

    // Construct using
    // com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (settingsBuilder_ == null) {
        settings_ = java.util.Collections.emptyList();
      } else {
        settings_ = null;
        settingsBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.SettingsServiceProto
          .internal_static_google_cloud_securitycenter_settings_v1beta1_BatchGetSettingsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse build() {
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
        buildPartial() {
      com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse result =
          new com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse result) {
      if (settingsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          settings_ = java.util.Collections.unmodifiableList(settings_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.settings_ = settings_;
      } else {
        result.settings_ = settingsBuilder_.build();
      }
    }

    private void buildPartial0(
        com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse result) {
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
      if (other
          instanceof com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse) {
        return mergeFrom(
            (com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse other) {
      if (other
          == com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
              .getDefaultInstance()) return this;
      if (settingsBuilder_ == null) {
        if (!other.settings_.isEmpty()) {
          if (settings_.isEmpty()) {
            settings_ = other.settings_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureSettingsIsMutable();
            settings_.addAll(other.settings_);
          }
          onChanged();
        }
      } else {
        if (!other.settings_.isEmpty()) {
          if (settingsBuilder_.isEmpty()) {
            settingsBuilder_.dispose();
            settingsBuilder_ = null;
            settings_ = other.settings_;
            bitField0_ = (bitField0_ & ~0x00000001);
            settingsBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getSettingsFieldBuilder()
                    : null;
          } else {
            settingsBuilder_.addAllMessages(other.settings_);
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
            case 10:
              {
                com.google.cloud.securitycenter.settings.v1beta1.Settings m =
                    input.readMessage(
                        com.google.cloud.securitycenter.settings.v1beta1.Settings.parser(),
                        extensionRegistry);
                if (settingsBuilder_ == null) {
                  ensureSettingsIsMutable();
                  settings_.add(m);
                } else {
                  settingsBuilder_.addMessage(m);
                }
                break;
              } // case 10
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

    private java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings> settings_ =
        java.util.Collections.emptyList();

    private void ensureSettingsIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        settings_ =
            new java.util.ArrayList<com.google.cloud.securitycenter.settings.v1beta1.Settings>(
                settings_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.settings.v1beta1.Settings,
            com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder,
            com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder>
        settingsBuilder_;

    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings>
        getSettingsList() {
      if (settingsBuilder_ == null) {
        return java.util.Collections.unmodifiableList(settings_);
      } else {
        return settingsBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public int getSettingsCount() {
      if (settingsBuilder_ == null) {
        return settings_.size();
      } else {
        return settingsBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public com.google.cloud.securitycenter.settings.v1beta1.Settings getSettings(int index) {
      if (settingsBuilder_ == null) {
        return settings_.get(index);
      } else {
        return settingsBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder setSettings(
        int index, com.google.cloud.securitycenter.settings.v1beta1.Settings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.set(index, value);
        onChanged();
      } else {
        settingsBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder setSettings(
        int index,
        com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.set(index, builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder addSettings(com.google.cloud.securitycenter.settings.v1beta1.Settings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.add(value);
        onChanged();
      } else {
        settingsBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder addSettings(
        int index, com.google.cloud.securitycenter.settings.v1beta1.Settings value) {
      if (settingsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureSettingsIsMutable();
        settings_.add(index, value);
        onChanged();
      } else {
        settingsBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder addSettings(
        com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.add(builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder addSettings(
        int index,
        com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder builderForValue) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.add(index, builderForValue.build());
        onChanged();
      } else {
        settingsBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder addAllSettings(
        java.lang.Iterable<? extends com.google.cloud.securitycenter.settings.v1beta1.Settings>
            values) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, settings_);
        onChanged();
      } else {
        settingsBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder clearSettings() {
      if (settingsBuilder_ == null) {
        settings_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        settingsBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public Builder removeSettings(int index) {
      if (settingsBuilder_ == null) {
        ensureSettingsIsMutable();
        settings_.remove(index);
        onChanged();
      } else {
        settingsBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder getSettingsBuilder(
        int index) {
      return getSettingsFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder getSettingsOrBuilder(
        int index) {
      if (settingsBuilder_ == null) {
        return settings_.get(index);
      } else {
        return settingsBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public java.util.List<
            ? extends com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder>
        getSettingsOrBuilderList() {
      if (settingsBuilder_ != null) {
        return settingsBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(settings_);
      }
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder addSettingsBuilder() {
      return getSettingsFieldBuilder()
          .addBuilder(
              com.google.cloud.securitycenter.settings.v1beta1.Settings.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder addSettingsBuilder(
        int index) {
      return getSettingsFieldBuilder()
          .addBuilder(
              index,
              com.google.cloud.securitycenter.settings.v1beta1.Settings.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Settings requested.
     * </pre>
     *
     * <code>repeated .google.cloud.securitycenter.settings.v1beta1.Settings settings = 1;</code>
     */
    public java.util.List<com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder>
        getSettingsBuilderList() {
      return getSettingsFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.securitycenter.settings.v1beta1.Settings,
            com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder,
            com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder>
        getSettingsFieldBuilder() {
      if (settingsBuilder_ == null) {
        settingsBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.securitycenter.settings.v1beta1.Settings,
                com.google.cloud.securitycenter.settings.v1beta1.Settings.Builder,
                com.google.cloud.securitycenter.settings.v1beta1.SettingsOrBuilder>(
                settings_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        settings_ = null;
      }
      return settingsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse)
  private static final com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse();
  }

  public static com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<BatchGetSettingsResponse> PARSER =
      new com.google.protobuf.AbstractParser<BatchGetSettingsResponse>() {
        @java.lang.Override
        public BatchGetSettingsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<BatchGetSettingsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<BatchGetSettingsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.settings.v1beta1.BatchGetSettingsResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
