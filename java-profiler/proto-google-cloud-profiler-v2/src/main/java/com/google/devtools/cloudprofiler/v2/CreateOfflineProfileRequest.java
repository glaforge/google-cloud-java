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
// source: google/devtools/cloudprofiler/v2/profiler.proto

// Protobuf Java Version: 3.25.3
package com.google.devtools.cloudprofiler.v2;

/**
 *
 *
 * <pre>
 * CreateOfflineProfileRequest describes a profile resource offline creation
 * request.
 * </pre>
 *
 * Protobuf type {@code google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest}
 */
public final class CreateOfflineProfileRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest)
    CreateOfflineProfileRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateOfflineProfileRequest.newBuilder() to construct.
  private CreateOfflineProfileRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateOfflineProfileRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateOfflineProfileRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.devtools.cloudprofiler.v2.ProfilerProto
        .internal_static_google_devtools_cloudprofiler_v2_CreateOfflineProfileRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.devtools.cloudprofiler.v2.ProfilerProto
        .internal_static_google_devtools_cloudprofiler_v2_CreateOfflineProfileRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.class,
            com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Parent project to create the profile in.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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
   * Parent project to create the profile in.
   * </pre>
   *
   * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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

  public static final int PROFILE_FIELD_NUMBER = 2;
  private com.google.devtools.cloudprofiler.v2.Profile profile_;
  /**
   *
   *
   * <pre>
   * Contents of the profile to create.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
   *
   * @return Whether the profile field is set.
   */
  @java.lang.Override
  public boolean hasProfile() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Contents of the profile to create.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
   *
   * @return The profile.
   */
  @java.lang.Override
  public com.google.devtools.cloudprofiler.v2.Profile getProfile() {
    return profile_ == null
        ? com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance()
        : profile_;
  }
  /**
   *
   *
   * <pre>
   * Contents of the profile to create.
   * </pre>
   *
   * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
   */
  @java.lang.Override
  public com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfileOrBuilder() {
    return profile_ == null
        ? com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance()
        : profile_;
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
      output.writeMessage(2, getProfile());
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
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getProfile());
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
    if (!(obj instanceof com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest)) {
      return super.equals(obj);
    }
    com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest other =
        (com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasProfile() != other.hasProfile()) return false;
    if (hasProfile()) {
      if (!getProfile().equals(other.getProfile())) return false;
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
    if (hasProfile()) {
      hash = (37 * hash) + PROFILE_FIELD_NUMBER;
      hash = (53 * hash) + getProfile().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest parseFrom(
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
      com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest prototype) {
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
   * CreateOfflineProfileRequest describes a profile resource offline creation
   * request.
   * </pre>
   *
   * Protobuf type {@code google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest)
      com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.devtools.cloudprofiler.v2.ProfilerProto
          .internal_static_google_devtools_cloudprofiler_v2_CreateOfflineProfileRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.devtools.cloudprofiler.v2.ProfilerProto
          .internal_static_google_devtools_cloudprofiler_v2_CreateOfflineProfileRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.class,
              com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.Builder.class);
    }

    // Construct using com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getProfileFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      profile_ = null;
      if (profileBuilder_ != null) {
        profileBuilder_.dispose();
        profileBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.devtools.cloudprofiler.v2.ProfilerProto
          .internal_static_google_devtools_cloudprofiler_v2_CreateOfflineProfileRequest_descriptor;
    }

    @java.lang.Override
    public com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest
        getDefaultInstanceForType() {
      return com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest build() {
      com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest buildPartial() {
      com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest result =
          new com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.profile_ = profileBuilder_ == null ? profile_ : profileBuilder_.build();
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
      if (other instanceof com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest) {
        return mergeFrom((com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest other) {
      if (other
          == com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasProfile()) {
        mergeProfile(other.getProfile());
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
                input.readMessage(getProfileFieldBuilder().getBuilder(), extensionRegistry);
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
     * Parent project to create the profile in.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Parent project to create the profile in.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Parent project to create the profile in.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Parent project to create the profile in.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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
     * Parent project to create the profile in.
     * </pre>
     *
     * <code>string parent = 1 [(.google.api.resource_reference) = { ... }</code>
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

    private com.google.devtools.cloudprofiler.v2.Profile profile_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudprofiler.v2.Profile,
            com.google.devtools.cloudprofiler.v2.Profile.Builder,
            com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
        profileBuilder_;
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     *
     * @return Whether the profile field is set.
     */
    public boolean hasProfile() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     *
     * @return The profile.
     */
    public com.google.devtools.cloudprofiler.v2.Profile getProfile() {
      if (profileBuilder_ == null) {
        return profile_ == null
            ? com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance()
            : profile_;
      } else {
        return profileBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    public Builder setProfile(com.google.devtools.cloudprofiler.v2.Profile value) {
      if (profileBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        profile_ = value;
      } else {
        profileBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    public Builder setProfile(
        com.google.devtools.cloudprofiler.v2.Profile.Builder builderForValue) {
      if (profileBuilder_ == null) {
        profile_ = builderForValue.build();
      } else {
        profileBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    public Builder mergeProfile(com.google.devtools.cloudprofiler.v2.Profile value) {
      if (profileBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && profile_ != null
            && profile_ != com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance()) {
          getProfileBuilder().mergeFrom(value);
        } else {
          profile_ = value;
        }
      } else {
        profileBuilder_.mergeFrom(value);
      }
      if (profile_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    public Builder clearProfile() {
      bitField0_ = (bitField0_ & ~0x00000002);
      profile_ = null;
      if (profileBuilder_ != null) {
        profileBuilder_.dispose();
        profileBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    public com.google.devtools.cloudprofiler.v2.Profile.Builder getProfileBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getProfileFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    public com.google.devtools.cloudprofiler.v2.ProfileOrBuilder getProfileOrBuilder() {
      if (profileBuilder_ != null) {
        return profileBuilder_.getMessageOrBuilder();
      } else {
        return profile_ == null
            ? com.google.devtools.cloudprofiler.v2.Profile.getDefaultInstance()
            : profile_;
      }
    }
    /**
     *
     *
     * <pre>
     * Contents of the profile to create.
     * </pre>
     *
     * <code>.google.devtools.cloudprofiler.v2.Profile profile = 2;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.devtools.cloudprofiler.v2.Profile,
            com.google.devtools.cloudprofiler.v2.Profile.Builder,
            com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>
        getProfileFieldBuilder() {
      if (profileBuilder_ == null) {
        profileBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.devtools.cloudprofiler.v2.Profile,
                com.google.devtools.cloudprofiler.v2.Profile.Builder,
                com.google.devtools.cloudprofiler.v2.ProfileOrBuilder>(
                getProfile(), getParentForChildren(), isClean());
        profile_ = null;
      }
      return profileBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest)
  }

  // @@protoc_insertion_point(class_scope:google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest)
  private static final com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest();
  }

  public static com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateOfflineProfileRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateOfflineProfileRequest>() {
        @java.lang.Override
        public CreateOfflineProfileRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateOfflineProfileRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateOfflineProfileRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.devtools.cloudprofiler.v2.CreateOfflineProfileRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
