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
// source: google/cloud/gkehub/v1beta1/membership.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.gkehub.v1beta1;

/**
 *
 *
 * <pre>
 * OnPremCluster contains information specific to GKE On-Prem clusters.
 * </pre>
 *
 * Protobuf type {@code google.cloud.gkehub.v1beta1.OnPremCluster}
 */
public final class OnPremCluster extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.gkehub.v1beta1.OnPremCluster)
    OnPremClusterOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use OnPremCluster.newBuilder() to construct.
  private OnPremCluster(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private OnPremCluster() {
    resourceLink_ = "";
    clusterType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new OnPremCluster();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
        .internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.gkehub.v1beta1.OnPremCluster.class,
            com.google.cloud.gkehub.v1beta1.OnPremCluster.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * ClusterType describes on prem cluster's type.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType}
   */
  public enum ClusterType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * The ClusterType is not set.
     * </pre>
     *
     * <code>CLUSTERTYPE_UNSPECIFIED = 0;</code>
     */
    CLUSTERTYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The ClusterType is bootstrap cluster.
     * </pre>
     *
     * <code>BOOTSTRAP = 1;</code>
     */
    BOOTSTRAP(1),
    /**
     *
     *
     * <pre>
     * The ClusterType is baremetal hybrid cluster.
     * </pre>
     *
     * <code>HYBRID = 2;</code>
     */
    HYBRID(2),
    /**
     *
     *
     * <pre>
     * The ClusterType is baremetal standalone cluster.
     * </pre>
     *
     * <code>STANDALONE = 3;</code>
     */
    STANDALONE(3),
    /**
     *
     *
     * <pre>
     * The ClusterType is user cluster.
     * </pre>
     *
     * <code>USER = 4;</code>
     */
    USER(4),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * The ClusterType is not set.
     * </pre>
     *
     * <code>CLUSTERTYPE_UNSPECIFIED = 0;</code>
     */
    public static final int CLUSTERTYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The ClusterType is bootstrap cluster.
     * </pre>
     *
     * <code>BOOTSTRAP = 1;</code>
     */
    public static final int BOOTSTRAP_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The ClusterType is baremetal hybrid cluster.
     * </pre>
     *
     * <code>HYBRID = 2;</code>
     */
    public static final int HYBRID_VALUE = 2;
    /**
     *
     *
     * <pre>
     * The ClusterType is baremetal standalone cluster.
     * </pre>
     *
     * <code>STANDALONE = 3;</code>
     */
    public static final int STANDALONE_VALUE = 3;
    /**
     *
     *
     * <pre>
     * The ClusterType is user cluster.
     * </pre>
     *
     * <code>USER = 4;</code>
     */
    public static final int USER_VALUE = 4;

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
    public static ClusterType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static ClusterType forNumber(int value) {
      switch (value) {
        case 0:
          return CLUSTERTYPE_UNSPECIFIED;
        case 1:
          return BOOTSTRAP;
        case 2:
          return HYBRID;
        case 3:
          return STANDALONE;
        case 4:
          return USER;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<ClusterType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<ClusterType> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<ClusterType>() {
          public ClusterType findValueByNumber(int number) {
            return ClusterType.forNumber(number);
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
      return com.google.cloud.gkehub.v1beta1.OnPremCluster.getDescriptor().getEnumTypes().get(0);
    }

    private static final ClusterType[] VALUES = values();

    public static ClusterType valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private ClusterType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType)
  }

  public static final int RESOURCE_LINK_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object resourceLink_ = "";
  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
   * example:
   *
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The resourceLink.
   */
  @java.lang.Override
  public java.lang.String getResourceLink() {
    java.lang.Object ref = resourceLink_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      resourceLink_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
   * example:
   *
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
   *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
   * </pre>
   *
   * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The bytes for resourceLink.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getResourceLinkBytes() {
    java.lang.Object ref = resourceLink_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      resourceLink_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int CLUSTER_MISSING_FIELD_NUMBER = 2;
  private boolean clusterMissing_ = false;
  /**
   *
   *
   * <pre>
   * Output only. If cluster_missing is set then it denotes that
   * API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no
   * longer exists.
   * </pre>
   *
   * <code>bool cluster_missing = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
   *
   * @return The clusterMissing.
   */
  @java.lang.Override
  public boolean getClusterMissing() {
    return clusterMissing_;
  }

  public static final int ADMIN_CLUSTER_FIELD_NUMBER = 3;
  private boolean adminCluster_ = false;
  /**
   *
   *
   * <pre>
   * Immutable. Whether the cluster is an admin cluster.
   * </pre>
   *
   * <code>bool admin_cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
   *
   * @return The adminCluster.
   */
  @java.lang.Override
  public boolean getAdminCluster() {
    return adminCluster_;
  }

  public static final int CLUSTER_TYPE_FIELD_NUMBER = 4;
  private int clusterType_ = 0;
  /**
   *
   *
   * <pre>
   * Immutable. The on prem cluster's type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The enum numeric value on the wire for clusterType.
   */
  @java.lang.Override
  public int getClusterTypeValue() {
    return clusterType_;
  }
  /**
   *
   *
   * <pre>
   * Immutable. The on prem cluster's type.
   * </pre>
   *
   * <code>
   * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
   * </code>
   *
   * @return The clusterType.
   */
  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType getClusterType() {
    com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType result =
        com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType.forNumber(clusterType_);
    return result == null
        ? com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType.UNRECOGNIZED
        : result;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceLink_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, resourceLink_);
    }
    if (clusterMissing_ != false) {
      output.writeBool(2, clusterMissing_);
    }
    if (adminCluster_ != false) {
      output.writeBool(3, adminCluster_);
    }
    if (clusterType_
        != com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType.CLUSTERTYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(4, clusterType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(resourceLink_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, resourceLink_);
    }
    if (clusterMissing_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(2, clusterMissing_);
    }
    if (adminCluster_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(3, adminCluster_);
    }
    if (clusterType_
        != com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType.CLUSTERTYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(4, clusterType_);
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
    if (!(obj instanceof com.google.cloud.gkehub.v1beta1.OnPremCluster)) {
      return super.equals(obj);
    }
    com.google.cloud.gkehub.v1beta1.OnPremCluster other =
        (com.google.cloud.gkehub.v1beta1.OnPremCluster) obj;

    if (!getResourceLink().equals(other.getResourceLink())) return false;
    if (getClusterMissing() != other.getClusterMissing()) return false;
    if (getAdminCluster() != other.getAdminCluster()) return false;
    if (clusterType_ != other.clusterType_) return false;
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
    hash = (37 * hash) + RESOURCE_LINK_FIELD_NUMBER;
    hash = (53 * hash) + getResourceLink().hashCode();
    hash = (37 * hash) + CLUSTER_MISSING_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getClusterMissing());
    hash = (37 * hash) + ADMIN_CLUSTER_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getAdminCluster());
    hash = (37 * hash) + CLUSTER_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + clusterType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster parseFrom(
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

  public static Builder newBuilder(com.google.cloud.gkehub.v1beta1.OnPremCluster prototype) {
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
   * OnPremCluster contains information specific to GKE On-Prem clusters.
   * </pre>
   *
   * Protobuf type {@code google.cloud.gkehub.v1beta1.OnPremCluster}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.gkehub.v1beta1.OnPremCluster)
      com.google.cloud.gkehub.v1beta1.OnPremClusterOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.gkehub.v1beta1.OnPremCluster.class,
              com.google.cloud.gkehub.v1beta1.OnPremCluster.Builder.class);
    }

    // Construct using com.google.cloud.gkehub.v1beta1.OnPremCluster.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      resourceLink_ = "";
      clusterMissing_ = false;
      adminCluster_ = false;
      clusterType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.gkehub.v1beta1.MembershipOuterClass
          .internal_static_google_cloud_gkehub_v1beta1_OnPremCluster_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.OnPremCluster getDefaultInstanceForType() {
      return com.google.cloud.gkehub.v1beta1.OnPremCluster.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.OnPremCluster build() {
      com.google.cloud.gkehub.v1beta1.OnPremCluster result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.OnPremCluster buildPartial() {
      com.google.cloud.gkehub.v1beta1.OnPremCluster result =
          new com.google.cloud.gkehub.v1beta1.OnPremCluster(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.gkehub.v1beta1.OnPremCluster result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.resourceLink_ = resourceLink_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.clusterMissing_ = clusterMissing_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.adminCluster_ = adminCluster_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.clusterType_ = clusterType_;
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
      if (other instanceof com.google.cloud.gkehub.v1beta1.OnPremCluster) {
        return mergeFrom((com.google.cloud.gkehub.v1beta1.OnPremCluster) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.gkehub.v1beta1.OnPremCluster other) {
      if (other == com.google.cloud.gkehub.v1beta1.OnPremCluster.getDefaultInstance()) return this;
      if (!other.getResourceLink().isEmpty()) {
        resourceLink_ = other.resourceLink_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getClusterMissing() != false) {
        setClusterMissing(other.getClusterMissing());
      }
      if (other.getAdminCluster() != false) {
        setAdminCluster(other.getAdminCluster());
      }
      if (other.clusterType_ != 0) {
        setClusterTypeValue(other.getClusterTypeValue());
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
                resourceLink_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                clusterMissing_ = input.readBool();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 24:
              {
                adminCluster_ = input.readBool();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                clusterType_ = input.readEnum();
                bitField0_ |= 0x00000008;
                break;
              } // case 32
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

    private java.lang.Object resourceLink_ = "";
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
     * example:
     *
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The resourceLink.
     */
    public java.lang.String getResourceLink() {
      java.lang.Object ref = resourceLink_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        resourceLink_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
     * example:
     *
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The bytes for resourceLink.
     */
    public com.google.protobuf.ByteString getResourceLinkBytes() {
      java.lang.Object ref = resourceLink_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        resourceLink_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
     * example:
     *
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The resourceLink to set.
     * @return This builder for chaining.
     */
    public Builder setResourceLink(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      resourceLink_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
     * example:
     *
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearResourceLink() {
      resourceLink_ = getDefaultInstance().getResourceLink();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Self-link of the GCP resource for the GKE On-Prem cluster. For
     * example:
     *
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/vmwareClusters/my-cluster
     *  //gkeonprem.googleapis.com/projects/my-project/locations/us-west1-a/bareMetalClusters/my-cluster
     * </pre>
     *
     * <code>string resource_link = 1 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The bytes for resourceLink to set.
     * @return This builder for chaining.
     */
    public Builder setResourceLinkBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      resourceLink_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private boolean clusterMissing_;
    /**
     *
     *
     * <pre>
     * Output only. If cluster_missing is set then it denotes that
     * API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no
     * longer exists.
     * </pre>
     *
     * <code>bool cluster_missing = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return The clusterMissing.
     */
    @java.lang.Override
    public boolean getClusterMissing() {
      return clusterMissing_;
    }
    /**
     *
     *
     * <pre>
     * Output only. If cluster_missing is set then it denotes that
     * API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no
     * longer exists.
     * </pre>
     *
     * <code>bool cluster_missing = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @param value The clusterMissing to set.
     * @return This builder for chaining.
     */
    public Builder setClusterMissing(boolean value) {

      clusterMissing_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. If cluster_missing is set then it denotes that
     * API(gkeonprem.googleapis.com) resource for this GKE On-Prem cluster no
     * longer exists.
     * </pre>
     *
     * <code>bool cluster_missing = 2 [(.google.api.field_behavior) = OUTPUT_ONLY];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterMissing() {
      bitField0_ = (bitField0_ & ~0x00000002);
      clusterMissing_ = false;
      onChanged();
      return this;
    }

    private boolean adminCluster_;
    /**
     *
     *
     * <pre>
     * Immutable. Whether the cluster is an admin cluster.
     * </pre>
     *
     * <code>bool admin_cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return The adminCluster.
     */
    @java.lang.Override
    public boolean getAdminCluster() {
      return adminCluster_;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Whether the cluster is an admin cluster.
     * </pre>
     *
     * <code>bool admin_cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @param value The adminCluster to set.
     * @return This builder for chaining.
     */
    public Builder setAdminCluster(boolean value) {

      adminCluster_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. Whether the cluster is an admin cluster.
     * </pre>
     *
     * <code>bool admin_cluster = 3 [(.google.api.field_behavior) = IMMUTABLE];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAdminCluster() {
      bitField0_ = (bitField0_ & ~0x00000004);
      adminCluster_ = false;
      onChanged();
      return this;
    }

    private int clusterType_ = 0;
    /**
     *
     *
     * <pre>
     * Immutable. The on prem cluster's type.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The enum numeric value on the wire for clusterType.
     */
    @java.lang.Override
    public int getClusterTypeValue() {
      return clusterType_;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The on prem cluster's type.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The enum numeric value on the wire for clusterType to set.
     * @return This builder for chaining.
     */
    public Builder setClusterTypeValue(int value) {
      clusterType_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The on prem cluster's type.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return The clusterType.
     */
    @java.lang.Override
    public com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType getClusterType() {
      com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType result =
          com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType.forNumber(clusterType_);
      return result == null
          ? com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The on prem cluster's type.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @param value The clusterType to set.
     * @return This builder for chaining.
     */
    public Builder setClusterType(com.google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000008;
      clusterType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Immutable. The on prem cluster's type.
     * </pre>
     *
     * <code>
     * .google.cloud.gkehub.v1beta1.OnPremCluster.ClusterType cluster_type = 4 [(.google.api.field_behavior) = IMMUTABLE];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearClusterType() {
      bitField0_ = (bitField0_ & ~0x00000008);
      clusterType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.gkehub.v1beta1.OnPremCluster)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.gkehub.v1beta1.OnPremCluster)
  private static final com.google.cloud.gkehub.v1beta1.OnPremCluster DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.gkehub.v1beta1.OnPremCluster();
  }

  public static com.google.cloud.gkehub.v1beta1.OnPremCluster getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<OnPremCluster> PARSER =
      new com.google.protobuf.AbstractParser<OnPremCluster>() {
        @java.lang.Override
        public OnPremCluster parsePartialFrom(
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

  public static com.google.protobuf.Parser<OnPremCluster> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<OnPremCluster> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.gkehub.v1beta1.OnPremCluster getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
