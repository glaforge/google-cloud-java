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
 * Policy for retention of scheduled snapshots.
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy}
 */
public final class ResourcePolicySnapshotSchedulePolicyRetentionPolicy
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)
    ResourcePolicySnapshotSchedulePolicyRetentionPolicyOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourcePolicySnapshotSchedulePolicyRetentionPolicy.newBuilder() to construct.
  private ResourcePolicySnapshotSchedulePolicyRetentionPolicy(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourcePolicySnapshotSchedulePolicyRetentionPolicy() {
    onSourceDiskDelete_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourcePolicySnapshotSchedulePolicyRetentionPolicy();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicyRetentionPolicy_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicyRetentionPolicy_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.class,
            com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.Builder
                .class);
  }

  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.OnSourceDiskDelete}
   */
  public enum OnSourceDiskDelete implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_ON_SOURCE_DISK_DELETE = 0;</code>
     */
    UNDEFINED_ON_SOURCE_DISK_DELETE(0),
    /** <code>APPLY_RETENTION_POLICY = 535071332;</code> */
    APPLY_RETENTION_POLICY(535071332),
    /** <code>KEEP_AUTO_SNAPSHOTS = 258925689;</code> */
    KEEP_AUTO_SNAPSHOTS(258925689),
    /** <code>UNSPECIFIED_ON_SOURCE_DISK_DELETE = 239140769;</code> */
    UNSPECIFIED_ON_SOURCE_DISK_DELETE(239140769),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_ON_SOURCE_DISK_DELETE = 0;</code>
     */
    public static final int UNDEFINED_ON_SOURCE_DISK_DELETE_VALUE = 0;
    /** <code>APPLY_RETENTION_POLICY = 535071332;</code> */
    public static final int APPLY_RETENTION_POLICY_VALUE = 535071332;
    /** <code>KEEP_AUTO_SNAPSHOTS = 258925689;</code> */
    public static final int KEEP_AUTO_SNAPSHOTS_VALUE = 258925689;
    /** <code>UNSPECIFIED_ON_SOURCE_DISK_DELETE = 239140769;</code> */
    public static final int UNSPECIFIED_ON_SOURCE_DISK_DELETE_VALUE = 239140769;

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
    public static OnSourceDiskDelete valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static OnSourceDiskDelete forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_ON_SOURCE_DISK_DELETE;
        case 535071332:
          return APPLY_RETENTION_POLICY;
        case 258925689:
          return KEEP_AUTO_SNAPSHOTS;
        case 239140769:
          return UNSPECIFIED_ON_SOURCE_DISK_DELETE;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<OnSourceDiskDelete>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<OnSourceDiskDelete>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<OnSourceDiskDelete>() {
              public OnSourceDiskDelete findValueByNumber(int number) {
                return OnSourceDiskDelete.forNumber(number);
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
      return com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
          .getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final OnSourceDiskDelete[] VALUES = values();

    public static OnSourceDiskDelete valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private OnSourceDiskDelete(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.OnSourceDiskDelete)
  }

  private int bitField0_;
  public static final int MAX_RETENTION_DAYS_FIELD_NUMBER = 324296979;
  private int maxRetentionDays_ = 0;
  /**
   *
   *
   * <pre>
   * Maximum age of the snapshot that is allowed to be kept.
   * </pre>
   *
   * <code>optional int32 max_retention_days = 324296979;</code>
   *
   * @return Whether the maxRetentionDays field is set.
   */
  @java.lang.Override
  public boolean hasMaxRetentionDays() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Maximum age of the snapshot that is allowed to be kept.
   * </pre>
   *
   * <code>optional int32 max_retention_days = 324296979;</code>
   *
   * @return The maxRetentionDays.
   */
  @java.lang.Override
  public int getMaxRetentionDays() {
    return maxRetentionDays_;
  }

  public static final int ON_SOURCE_DISK_DELETE_FIELD_NUMBER = 321955529;

  @SuppressWarnings("serial")
  private volatile java.lang.Object onSourceDiskDelete_ = "";
  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * Check the OnSourceDiskDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string on_source_disk_delete = 321955529;</code>
   *
   * @return Whether the onSourceDiskDelete field is set.
   */
  @java.lang.Override
  public boolean hasOnSourceDiskDelete() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * Check the OnSourceDiskDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string on_source_disk_delete = 321955529;</code>
   *
   * @return The onSourceDiskDelete.
   */
  @java.lang.Override
  public java.lang.String getOnSourceDiskDelete() {
    java.lang.Object ref = onSourceDiskDelete_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      onSourceDiskDelete_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
   * Check the OnSourceDiskDelete enum for the list of possible values.
   * </pre>
   *
   * <code>optional string on_source_disk_delete = 321955529;</code>
   *
   * @return The bytes for onSourceDiskDelete.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getOnSourceDiskDeleteBytes() {
    java.lang.Object ref = onSourceDiskDelete_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      onSourceDiskDelete_ = b;
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
    if (((bitField0_ & 0x00000002) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 321955529, onSourceDiskDelete_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeInt32(324296979, maxRetentionDays_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000002) != 0)) {
      size +=
          com.google.protobuf.GeneratedMessageV3.computeStringSize(321955529, onSourceDiskDelete_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(324296979, maxRetentionDays_);
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
        instanceof
        com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy other =
        (com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy) obj;

    if (hasMaxRetentionDays() != other.hasMaxRetentionDays()) return false;
    if (hasMaxRetentionDays()) {
      if (getMaxRetentionDays() != other.getMaxRetentionDays()) return false;
    }
    if (hasOnSourceDiskDelete() != other.hasOnSourceDiskDelete()) return false;
    if (hasOnSourceDiskDelete()) {
      if (!getOnSourceDiskDelete().equals(other.getOnSourceDiskDelete())) return false;
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
    if (hasMaxRetentionDays()) {
      hash = (37 * hash) + MAX_RETENTION_DAYS_FIELD_NUMBER;
      hash = (53 * hash) + getMaxRetentionDays();
    }
    if (hasOnSourceDiskDelete()) {
      hash = (37 * hash) + ON_SOURCE_DISK_DELETE_FIELD_NUMBER;
      hash = (53 * hash) + getOnSourceDiskDelete().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      parseFrom(
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
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy prototype) {
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
   * Policy for retention of scheduled snapshots.
   * </pre>
   *
   * Protobuf type {@code
   * google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicyOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicyRetentionPolicy_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicyRetentionPolicy_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.class,
              com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
                  .Builder.class);
    }

    // Construct using
    // com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      maxRetentionDays_ = 0;
      onSourceDiskDelete_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_ResourcePolicySnapshotSchedulePolicyRetentionPolicy_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
        getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy build() {
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
        buildPartial() {
      com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy result =
          new com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.maxRetentionDays_ = maxRetentionDays_;
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.onSourceDiskDelete_ = onSourceDiskDelete_;
        to_bitField0_ |= 0x00000002;
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
      if (other
          instanceof
          com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy) {
        return mergeFrom(
            (com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy other) {
      if (other
          == com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
              .getDefaultInstance()) return this;
      if (other.hasMaxRetentionDays()) {
        setMaxRetentionDays(other.getMaxRetentionDays());
      }
      if (other.hasOnSourceDiskDelete()) {
        onSourceDiskDelete_ = other.onSourceDiskDelete_;
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
            case -1719323062:
              {
                onSourceDiskDelete_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -1719323062
            case -1700591464:
              {
                maxRetentionDays_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case -1700591464
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

    private int maxRetentionDays_;
    /**
     *
     *
     * <pre>
     * Maximum age of the snapshot that is allowed to be kept.
     * </pre>
     *
     * <code>optional int32 max_retention_days = 324296979;</code>
     *
     * @return Whether the maxRetentionDays field is set.
     */
    @java.lang.Override
    public boolean hasMaxRetentionDays() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Maximum age of the snapshot that is allowed to be kept.
     * </pre>
     *
     * <code>optional int32 max_retention_days = 324296979;</code>
     *
     * @return The maxRetentionDays.
     */
    @java.lang.Override
    public int getMaxRetentionDays() {
      return maxRetentionDays_;
    }
    /**
     *
     *
     * <pre>
     * Maximum age of the snapshot that is allowed to be kept.
     * </pre>
     *
     * <code>optional int32 max_retention_days = 324296979;</code>
     *
     * @param value The maxRetentionDays to set.
     * @return This builder for chaining.
     */
    public Builder setMaxRetentionDays(int value) {

      maxRetentionDays_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Maximum age of the snapshot that is allowed to be kept.
     * </pre>
     *
     * <code>optional int32 max_retention_days = 324296979;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMaxRetentionDays() {
      bitField0_ = (bitField0_ & ~0x00000001);
      maxRetentionDays_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object onSourceDiskDelete_ = "";
    /**
     *
     *
     * <pre>
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * Check the OnSourceDiskDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string on_source_disk_delete = 321955529;</code>
     *
     * @return Whether the onSourceDiskDelete field is set.
     */
    public boolean hasOnSourceDiskDelete() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * Check the OnSourceDiskDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string on_source_disk_delete = 321955529;</code>
     *
     * @return The onSourceDiskDelete.
     */
    public java.lang.String getOnSourceDiskDelete() {
      java.lang.Object ref = onSourceDiskDelete_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        onSourceDiskDelete_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * Check the OnSourceDiskDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string on_source_disk_delete = 321955529;</code>
     *
     * @return The bytes for onSourceDiskDelete.
     */
    public com.google.protobuf.ByteString getOnSourceDiskDeleteBytes() {
      java.lang.Object ref = onSourceDiskDelete_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        onSourceDiskDelete_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * Check the OnSourceDiskDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string on_source_disk_delete = 321955529;</code>
     *
     * @param value The onSourceDiskDelete to set.
     * @return This builder for chaining.
     */
    public Builder setOnSourceDiskDelete(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      onSourceDiskDelete_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * Check the OnSourceDiskDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string on_source_disk_delete = 321955529;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOnSourceDiskDelete() {
      onSourceDiskDelete_ = getDefaultInstance().getOnSourceDiskDelete();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Specifies the behavior to apply to scheduled snapshots when the source disk is deleted.
     * Check the OnSourceDiskDelete enum for the list of possible values.
     * </pre>
     *
     * <code>optional string on_source_disk_delete = 321955529;</code>
     *
     * @param value The bytes for onSourceDiskDelete to set.
     * @return This builder for chaining.
     */
    public Builder setOnSourceDiskDeleteBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      onSourceDiskDelete_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy)
  private static final com.google.cloud.compute.v1
          .ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy();
  }

  public static com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<
          ResourcePolicySnapshotSchedulePolicyRetentionPolicy>
      PARSER =
          new com.google.protobuf.AbstractParser<
              ResourcePolicySnapshotSchedulePolicyRetentionPolicy>() {
            @java.lang.Override
            public ResourcePolicySnapshotSchedulePolicyRetentionPolicy parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<ResourcePolicySnapshotSchedulePolicyRetentionPolicy>
      parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourcePolicySnapshotSchedulePolicyRetentionPolicy>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.ResourcePolicySnapshotSchedulePolicyRetentionPolicy
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
