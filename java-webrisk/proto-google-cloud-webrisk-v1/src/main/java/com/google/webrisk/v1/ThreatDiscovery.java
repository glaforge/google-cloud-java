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
// source: google/cloud/webrisk/v1/webrisk.proto

// Protobuf Java Version: 3.25.3
package com.google.webrisk.v1;

/**
 *
 *
 * <pre>
 * Details about how the threat was discovered.
 * </pre>
 *
 * Protobuf type {@code google.cloud.webrisk.v1.ThreatDiscovery}
 */
public final class ThreatDiscovery extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.webrisk.v1.ThreatDiscovery)
    ThreatDiscoveryOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ThreatDiscovery.newBuilder() to construct.
  private ThreatDiscovery(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ThreatDiscovery() {
    platform_ = 0;
    regionCodes_ = com.google.protobuf.LazyStringArrayList.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ThreatDiscovery();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.webrisk.v1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1_ThreatDiscovery_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.webrisk.v1.WebRiskProto
        .internal_static_google_cloud_webrisk_v1_ThreatDiscovery_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.webrisk.v1.ThreatDiscovery.class,
            com.google.webrisk.v1.ThreatDiscovery.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Platform types.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.webrisk.v1.ThreatDiscovery.Platform}
   */
  public enum Platform implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Default.
     * </pre>
     *
     * <code>PLATFORM_UNSPECIFIED = 0;</code>
     */
    PLATFORM_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * General Android platform.
     * </pre>
     *
     * <code>ANDROID = 1;</code>
     */
    ANDROID(1),
    /**
     *
     *
     * <pre>
     * General iOS platform.
     * </pre>
     *
     * <code>IOS = 2;</code>
     */
    IOS(2),
    /**
     *
     *
     * <pre>
     * General macOS platform.
     * </pre>
     *
     * <code>MACOS = 3;</code>
     */
    MACOS(3),
    /**
     *
     *
     * <pre>
     * General Windows platform.
     * </pre>
     *
     * <code>WINDOWS = 4;</code>
     */
    WINDOWS(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Default.
     * </pre>
     *
     * <code>PLATFORM_UNSPECIFIED = 0;</code>
     */
    public static final int PLATFORM_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * General Android platform.
     * </pre>
     *
     * <code>ANDROID = 1;</code>
     */
    public static final int ANDROID_VALUE = 1;
    /**
     *
     *
     * <pre>
     * General iOS platform.
     * </pre>
     *
     * <code>IOS = 2;</code>
     */
    public static final int IOS_VALUE = 2;
    /**
     *
     *
     * <pre>
     * General macOS platform.
     * </pre>
     *
     * <code>MACOS = 3;</code>
     */
    public static final int MACOS_VALUE = 3;
    /**
     *
     *
     * <pre>
     * General Windows platform.
     * </pre>
     *
     * <code>WINDOWS = 4;</code>
     */
    public static final int WINDOWS_VALUE = 4;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static Platform valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static Platform forNumber(int value) {
      switch (value) {
        case 0:
          return PLATFORM_UNSPECIFIED;
        case 1:
          return ANDROID;
        case 2:
          return IOS;
        case 3:
          return MACOS;
        case 4:
          return WINDOWS;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<Platform> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<Platform> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<Platform>() {
          public Platform findValueByNumber(int number) {
            return Platform.forNumber(number);
          }
        };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.webrisk.v1.ThreatDiscovery.getDescriptor().getEnumTypes().get(0);
    }

    private static final Platform[] VALUES = values();

    public static Platform valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private Platform(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.webrisk.v1.ThreatDiscovery.Platform)
  }

  public static final int PLATFORM_FIELD_NUMBER = 1;
  private int platform_ = 0;
  /**
   *
   *
   * <pre>
   * Platform on which the threat was discovered.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
   *
   * @return The enum numeric value on the wire for platform.
   */
  @java.lang.Override
  public int getPlatformValue() {
    return platform_;
  }
  /**
   *
   *
   * <pre>
   * Platform on which the threat was discovered.
   * </pre>
   *
   * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
   *
   * @return The platform.
   */
  @java.lang.Override
  public com.google.webrisk.v1.ThreatDiscovery.Platform getPlatform() {
    com.google.webrisk.v1.ThreatDiscovery.Platform result =
        com.google.webrisk.v1.ThreatDiscovery.Platform.forNumber(platform_);
    return result == null ? com.google.webrisk.v1.ThreatDiscovery.Platform.UNRECOGNIZED : result;
  }

  public static final int REGION_CODES_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private com.google.protobuf.LazyStringArrayList regionCodes_ =
      com.google.protobuf.LazyStringArrayList.emptyList();
  /**
   *
   *
   * <pre>
   * CLDR region code of the countries/regions the URI poses a threat ordered
   * from most impact to least impact. Example: "US" for United States.
   * </pre>
   *
   * <code>repeated string region_codes = 2;</code>
   *
   * @return A list containing the regionCodes.
   */
  public com.google.protobuf.ProtocolStringList getRegionCodesList() {
    return regionCodes_;
  }
  /**
   *
   *
   * <pre>
   * CLDR region code of the countries/regions the URI poses a threat ordered
   * from most impact to least impact. Example: "US" for United States.
   * </pre>
   *
   * <code>repeated string region_codes = 2;</code>
   *
   * @return The count of regionCodes.
   */
  public int getRegionCodesCount() {
    return regionCodes_.size();
  }
  /**
   *
   *
   * <pre>
   * CLDR region code of the countries/regions the URI poses a threat ordered
   * from most impact to least impact. Example: "US" for United States.
   * </pre>
   *
   * <code>repeated string region_codes = 2;</code>
   *
   * @param index The index of the element to return.
   * @return The regionCodes at the given index.
   */
  public java.lang.String getRegionCodes(int index) {
    return regionCodes_.get(index);
  }
  /**
   *
   *
   * <pre>
   * CLDR region code of the countries/regions the URI poses a threat ordered
   * from most impact to least impact. Example: "US" for United States.
   * </pre>
   *
   * <code>repeated string region_codes = 2;</code>
   *
   * @param index The index of the value to return.
   * @return The bytes of the regionCodes at the given index.
   */
  public com.google.protobuf.ByteString getRegionCodesBytes(int index) {
    return regionCodes_.getByteString(index);
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
    if (platform_
        != com.google.webrisk.v1.ThreatDiscovery.Platform.PLATFORM_UNSPECIFIED.getNumber()) {
      output.writeEnum(1, platform_);
    }
    for (int i = 0; i < regionCodes_.size(); i++) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, regionCodes_.getRaw(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (platform_
        != com.google.webrisk.v1.ThreatDiscovery.Platform.PLATFORM_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, platform_);
    }
    {
      int dataSize = 0;
      for (int i = 0; i < regionCodes_.size(); i++) {
        dataSize += computeStringSizeNoTag(regionCodes_.getRaw(i));
      }
      size += dataSize;
      size += 1 * getRegionCodesList().size();
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
    if (!(obj instanceof com.google.webrisk.v1.ThreatDiscovery)) {
      return super.equals(obj);
    }
    com.google.webrisk.v1.ThreatDiscovery other = (com.google.webrisk.v1.ThreatDiscovery) obj;

    if (platform_ != other.platform_) return false;
    if (!getRegionCodesList().equals(other.getRegionCodesList())) return false;
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
    hash = (37 * hash) + PLATFORM_FIELD_NUMBER;
    hash = (53 * hash) + platform_;
    if (getRegionCodesCount() > 0) {
      hash = (37 * hash) + REGION_CODES_FIELD_NUMBER;
      hash = (53 * hash) + getRegionCodesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.webrisk.v1.ThreatDiscovery parseFrom(
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

  public static Builder newBuilder(com.google.webrisk.v1.ThreatDiscovery prototype) {
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
   * Details about how the threat was discovered.
   * </pre>
   *
   * Protobuf type {@code google.cloud.webrisk.v1.ThreatDiscovery}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.webrisk.v1.ThreatDiscovery)
      com.google.webrisk.v1.ThreatDiscoveryOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_ThreatDiscovery_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_ThreatDiscovery_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.webrisk.v1.ThreatDiscovery.class,
              com.google.webrisk.v1.ThreatDiscovery.Builder.class);
    }

    // Construct using com.google.webrisk.v1.ThreatDiscovery.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      platform_ = 0;
      regionCodes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.webrisk.v1.WebRiskProto
          .internal_static_google_cloud_webrisk_v1_ThreatDiscovery_descriptor;
    }

    @java.lang.Override
    public com.google.webrisk.v1.ThreatDiscovery getDefaultInstanceForType() {
      return com.google.webrisk.v1.ThreatDiscovery.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.webrisk.v1.ThreatDiscovery build() {
      com.google.webrisk.v1.ThreatDiscovery result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.webrisk.v1.ThreatDiscovery buildPartial() {
      com.google.webrisk.v1.ThreatDiscovery result =
          new com.google.webrisk.v1.ThreatDiscovery(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.webrisk.v1.ThreatDiscovery result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.platform_ = platform_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        regionCodes_.makeImmutable();
        result.regionCodes_ = regionCodes_;
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
      if (other instanceof com.google.webrisk.v1.ThreatDiscovery) {
        return mergeFrom((com.google.webrisk.v1.ThreatDiscovery) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.webrisk.v1.ThreatDiscovery other) {
      if (other == com.google.webrisk.v1.ThreatDiscovery.getDefaultInstance()) return this;
      if (other.platform_ != 0) {
        setPlatformValue(other.getPlatformValue());
      }
      if (!other.regionCodes_.isEmpty()) {
        if (regionCodes_.isEmpty()) {
          regionCodes_ = other.regionCodes_;
          bitField0_ |= 0x00000002;
        } else {
          ensureRegionCodesIsMutable();
          regionCodes_.addAll(other.regionCodes_);
        }
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
                platform_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                ensureRegionCodesIsMutable();
                regionCodes_.add(s);
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

    private int platform_ = 0;
    /**
     *
     *
     * <pre>
     * Platform on which the threat was discovered.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
     *
     * @return The enum numeric value on the wire for platform.
     */
    @java.lang.Override
    public int getPlatformValue() {
      return platform_;
    }
    /**
     *
     *
     * <pre>
     * Platform on which the threat was discovered.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
     *
     * @param value The enum numeric value on the wire for platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatformValue(int value) {
      platform_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Platform on which the threat was discovered.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
     *
     * @return The platform.
     */
    @java.lang.Override
    public com.google.webrisk.v1.ThreatDiscovery.Platform getPlatform() {
      com.google.webrisk.v1.ThreatDiscovery.Platform result =
          com.google.webrisk.v1.ThreatDiscovery.Platform.forNumber(platform_);
      return result == null ? com.google.webrisk.v1.ThreatDiscovery.Platform.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Platform on which the threat was discovered.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
     *
     * @param value The platform to set.
     * @return This builder for chaining.
     */
    public Builder setPlatform(com.google.webrisk.v1.ThreatDiscovery.Platform value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      platform_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Platform on which the threat was discovered.
     * </pre>
     *
     * <code>.google.cloud.webrisk.v1.ThreatDiscovery.Platform platform = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPlatform() {
      bitField0_ = (bitField0_ & ~0x00000001);
      platform_ = 0;
      onChanged();
      return this;
    }

    private com.google.protobuf.LazyStringArrayList regionCodes_ =
        com.google.protobuf.LazyStringArrayList.emptyList();

    private void ensureRegionCodesIsMutable() {
      if (!regionCodes_.isModifiable()) {
        regionCodes_ = new com.google.protobuf.LazyStringArrayList(regionCodes_);
      }
      bitField0_ |= 0x00000002;
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @return A list containing the regionCodes.
     */
    public com.google.protobuf.ProtocolStringList getRegionCodesList() {
      regionCodes_.makeImmutable();
      return regionCodes_;
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @return The count of regionCodes.
     */
    public int getRegionCodesCount() {
      return regionCodes_.size();
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @param index The index of the element to return.
     * @return The regionCodes at the given index.
     */
    public java.lang.String getRegionCodes(int index) {
      return regionCodes_.get(index);
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @param index The index of the value to return.
     * @return The bytes of the regionCodes at the given index.
     */
    public com.google.protobuf.ByteString getRegionCodesBytes(int index) {
      return regionCodes_.getByteString(index);
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @param index The index to set the value at.
     * @param value The regionCodes to set.
     * @return This builder for chaining.
     */
    public Builder setRegionCodes(int index, java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRegionCodesIsMutable();
      regionCodes_.set(index, value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @param value The regionCodes to add.
     * @return This builder for chaining.
     */
    public Builder addRegionCodes(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureRegionCodesIsMutable();
      regionCodes_.add(value);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @param values The regionCodes to add.
     * @return This builder for chaining.
     */
    public Builder addAllRegionCodes(java.lang.Iterable<java.lang.String> values) {
      ensureRegionCodesIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, regionCodes_);
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearRegionCodes() {
      regionCodes_ = com.google.protobuf.LazyStringArrayList.emptyList();
      bitField0_ = (bitField0_ & ~0x00000002);
      ;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * CLDR region code of the countries/regions the URI poses a threat ordered
     * from most impact to least impact. Example: "US" for United States.
     * </pre>
     *
     * <code>repeated string region_codes = 2;</code>
     *
     * @param value The bytes of the regionCodes to add.
     * @return This builder for chaining.
     */
    public Builder addRegionCodesBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      ensureRegionCodesIsMutable();
      regionCodes_.add(value);
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

    // @@protoc_insertion_point(builder_scope:google.cloud.webrisk.v1.ThreatDiscovery)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.webrisk.v1.ThreatDiscovery)
  private static final com.google.webrisk.v1.ThreatDiscovery DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.webrisk.v1.ThreatDiscovery();
  }

  public static com.google.webrisk.v1.ThreatDiscovery getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ThreatDiscovery> PARSER =
      new com.google.protobuf.AbstractParser<ThreatDiscovery>() {
        @java.lang.Override
        public ThreatDiscovery parsePartialFrom(
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

  public static com.google.protobuf.Parser<ThreatDiscovery> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ThreatDiscovery> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.webrisk.v1.ThreatDiscovery getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
