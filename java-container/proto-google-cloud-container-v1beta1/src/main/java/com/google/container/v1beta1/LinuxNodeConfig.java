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
// source: google/container/v1beta1/cluster_service.proto

// Protobuf Java Version: 3.25.3
package com.google.container.v1beta1;

/**
 *
 *
 * <pre>
 * Parameters that can be configured on Linux nodes.
 * </pre>
 *
 * Protobuf type {@code google.container.v1beta1.LinuxNodeConfig}
 */
public final class LinuxNodeConfig extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.container.v1beta1.LinuxNodeConfig)
    LinuxNodeConfigOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use LinuxNodeConfig.newBuilder() to construct.
  private LinuxNodeConfig(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private LinuxNodeConfig() {
    cgroupMode_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new LinuxNodeConfig();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LinuxNodeConfig_descriptor;
  }

  @SuppressWarnings({"rawtypes"})
  @java.lang.Override
  protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
      int number) {
    switch (number) {
      case 1:
        return internalGetSysctls();
      default:
        throw new RuntimeException("Invalid map field number: " + number);
    }
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.container.v1beta1.ClusterServiceProto
        .internal_static_google_container_v1beta1_LinuxNodeConfig_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.container.v1beta1.LinuxNodeConfig.class,
            com.google.container.v1beta1.LinuxNodeConfig.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Possible cgroup modes that can be used.
   * </pre>
   *
   * Protobuf enum {@code google.container.v1beta1.LinuxNodeConfig.CgroupMode}
   */
  public enum CgroupMode implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * CGROUP_MODE_UNSPECIFIED is when unspecified cgroup configuration is used.
     * The default for the GKE node OS image will be used.
     * </pre>
     *
     * <code>CGROUP_MODE_UNSPECIFIED = 0;</code>
     */
    CGROUP_MODE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * CGROUP_MODE_V1 specifies to use cgroupv1 for the cgroup configuration on
     * the node image.
     * </pre>
     *
     * <code>CGROUP_MODE_V1 = 1;</code>
     */
    CGROUP_MODE_V1(1),
    /**
     *
     *
     * <pre>
     * CGROUP_MODE_V2 specifies to use cgroupv2 for the cgroup configuration on
     * the node image.
     * </pre>
     *
     * <code>CGROUP_MODE_V2 = 2;</code>
     */
    CGROUP_MODE_V2(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * CGROUP_MODE_UNSPECIFIED is when unspecified cgroup configuration is used.
     * The default for the GKE node OS image will be used.
     * </pre>
     *
     * <code>CGROUP_MODE_UNSPECIFIED = 0;</code>
     */
    public static final int CGROUP_MODE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * CGROUP_MODE_V1 specifies to use cgroupv1 for the cgroup configuration on
     * the node image.
     * </pre>
     *
     * <code>CGROUP_MODE_V1 = 1;</code>
     */
    public static final int CGROUP_MODE_V1_VALUE = 1;
    /**
     *
     *
     * <pre>
     * CGROUP_MODE_V2 specifies to use cgroupv2 for the cgroup configuration on
     * the node image.
     * </pre>
     *
     * <code>CGROUP_MODE_V2 = 2;</code>
     */
    public static final int CGROUP_MODE_V2_VALUE = 2;

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
    public static CgroupMode valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static CgroupMode forNumber(int value) {
      switch (value) {
        case 0:
          return CGROUP_MODE_UNSPECIFIED;
        case 1:
          return CGROUP_MODE_V1;
        case 2:
          return CGROUP_MODE_V2;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<CgroupMode> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<CgroupMode> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<CgroupMode>() {
          public CgroupMode findValueByNumber(int number) {
            return CgroupMode.forNumber(number);
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
      return com.google.container.v1beta1.LinuxNodeConfig.getDescriptor().getEnumTypes().get(0);
    }

    private static final CgroupMode[] VALUES = values();

    public static CgroupMode valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private CgroupMode(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.container.v1beta1.LinuxNodeConfig.CgroupMode)
  }

  public static final int SYSCTLS_FIELD_NUMBER = 1;

  private static final class SysctlsDefaultEntryHolder {
    static final com.google.protobuf.MapEntry<java.lang.String, java.lang.String> defaultEntry =
        com.google.protobuf.MapEntry.<java.lang.String, java.lang.String>newDefaultInstance(
            com.google.container.v1beta1.ClusterServiceProto
                .internal_static_google_container_v1beta1_LinuxNodeConfig_SysctlsEntry_descriptor,
            com.google.protobuf.WireFormat.FieldType.STRING,
            "",
            com.google.protobuf.WireFormat.FieldType.STRING,
            "");
  }

  @SuppressWarnings("serial")
  private com.google.protobuf.MapField<java.lang.String, java.lang.String> sysctls_;

  private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetSysctls() {
    if (sysctls_ == null) {
      return com.google.protobuf.MapField.emptyMapField(SysctlsDefaultEntryHolder.defaultEntry);
    }
    return sysctls_;
  }

  public int getSysctlsCount() {
    return internalGetSysctls().getMap().size();
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   *
   * The following parameters are supported.
   *
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public boolean containsSysctls(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    return internalGetSysctls().getMap().containsKey(key);
  }
  /** Use {@link #getSysctlsMap()} instead. */
  @java.lang.Override
  @java.lang.Deprecated
  public java.util.Map<java.lang.String, java.lang.String> getSysctls() {
    return getSysctlsMap();
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   *
   * The following parameters are supported.
   *
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public java.util.Map<java.lang.String, java.lang.String> getSysctlsMap() {
    return internalGetSysctls().getMap();
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   *
   * The following parameters are supported.
   *
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public /* nullable */ java.lang.String getSysctlsOrDefault(
      java.lang.String key,
      /* nullable */
      java.lang.String defaultValue) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
    return map.containsKey(key) ? map.get(key) : defaultValue;
  }
  /**
   *
   *
   * <pre>
   * The Linux kernel parameters to be applied to the nodes and all pods running
   * on the nodes.
   *
   * The following parameters are supported.
   *
   * net.core.busy_poll
   * net.core.busy_read
   * net.core.netdev_max_backlog
   * net.core.rmem_max
   * net.core.wmem_default
   * net.core.wmem_max
   * net.core.optmem_max
   * net.core.somaxconn
   * net.ipv4.tcp_rmem
   * net.ipv4.tcp_wmem
   * net.ipv4.tcp_tw_reuse
   * </pre>
   *
   * <code>map&lt;string, string&gt; sysctls = 1;</code>
   */
  @java.lang.Override
  public java.lang.String getSysctlsOrThrow(java.lang.String key) {
    if (key == null) {
      throw new NullPointerException("map key");
    }
    java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
    if (!map.containsKey(key)) {
      throw new java.lang.IllegalArgumentException();
    }
    return map.get(key);
  }

  public static final int CGROUP_MODE_FIELD_NUMBER = 2;
  private int cgroupMode_ = 0;
  /**
   *
   *
   * <pre>
   * cgroup_mode specifies the cgroup mode to be used on the node.
   * </pre>
   *
   * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
   *
   * @return The enum numeric value on the wire for cgroupMode.
   */
  @java.lang.Override
  public int getCgroupModeValue() {
    return cgroupMode_;
  }
  /**
   *
   *
   * <pre>
   * cgroup_mode specifies the cgroup mode to be used on the node.
   * </pre>
   *
   * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
   *
   * @return The cgroupMode.
   */
  @java.lang.Override
  public com.google.container.v1beta1.LinuxNodeConfig.CgroupMode getCgroupMode() {
    com.google.container.v1beta1.LinuxNodeConfig.CgroupMode result =
        com.google.container.v1beta1.LinuxNodeConfig.CgroupMode.forNumber(cgroupMode_);
    return result == null
        ? com.google.container.v1beta1.LinuxNodeConfig.CgroupMode.UNRECOGNIZED
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
    com.google.protobuf.GeneratedMessageV3.serializeStringMapTo(
        output, internalGetSysctls(), SysctlsDefaultEntryHolder.defaultEntry, 1);
    if (cgroupMode_
        != com.google.container.v1beta1.LinuxNodeConfig.CgroupMode.CGROUP_MODE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, cgroupMode_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (java.util.Map.Entry<java.lang.String, java.lang.String> entry :
        internalGetSysctls().getMap().entrySet()) {
      com.google.protobuf.MapEntry<java.lang.String, java.lang.String> sysctls__ =
          SysctlsDefaultEntryHolder.defaultEntry
              .newBuilderForType()
              .setKey(entry.getKey())
              .setValue(entry.getValue())
              .build();
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, sysctls__);
    }
    if (cgroupMode_
        != com.google.container.v1beta1.LinuxNodeConfig.CgroupMode.CGROUP_MODE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, cgroupMode_);
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
    if (!(obj instanceof com.google.container.v1beta1.LinuxNodeConfig)) {
      return super.equals(obj);
    }
    com.google.container.v1beta1.LinuxNodeConfig other =
        (com.google.container.v1beta1.LinuxNodeConfig) obj;

    if (!internalGetSysctls().equals(other.internalGetSysctls())) return false;
    if (cgroupMode_ != other.cgroupMode_) return false;
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
    if (!internalGetSysctls().getMap().isEmpty()) {
      hash = (37 * hash) + SYSCTLS_FIELD_NUMBER;
      hash = (53 * hash) + internalGetSysctls().hashCode();
    }
    hash = (37 * hash) + CGROUP_MODE_FIELD_NUMBER;
    hash = (53 * hash) + cgroupMode_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.container.v1beta1.LinuxNodeConfig parseFrom(
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

  public static Builder newBuilder(com.google.container.v1beta1.LinuxNodeConfig prototype) {
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
   * Parameters that can be configured on Linux nodes.
   * </pre>
   *
   * Protobuf type {@code google.container.v1beta1.LinuxNodeConfig}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.container.v1beta1.LinuxNodeConfig)
      com.google.container.v1beta1.LinuxNodeConfigOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LinuxNodeConfig_descriptor;
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetSysctls();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @SuppressWarnings({"rawtypes"})
    protected com.google.protobuf.MapFieldReflectionAccessor internalGetMutableMapFieldReflection(
        int number) {
      switch (number) {
        case 1:
          return internalGetMutableSysctls();
        default:
          throw new RuntimeException("Invalid map field number: " + number);
      }
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LinuxNodeConfig_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.container.v1beta1.LinuxNodeConfig.class,
              com.google.container.v1beta1.LinuxNodeConfig.Builder.class);
    }

    // Construct using com.google.container.v1beta1.LinuxNodeConfig.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalGetMutableSysctls().clear();
      cgroupMode_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.container.v1beta1.ClusterServiceProto
          .internal_static_google_container_v1beta1_LinuxNodeConfig_descriptor;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig getDefaultInstanceForType() {
      return com.google.container.v1beta1.LinuxNodeConfig.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig build() {
      com.google.container.v1beta1.LinuxNodeConfig result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig buildPartial() {
      com.google.container.v1beta1.LinuxNodeConfig result =
          new com.google.container.v1beta1.LinuxNodeConfig(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.container.v1beta1.LinuxNodeConfig result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sysctls_ = internalGetSysctls();
        result.sysctls_.makeImmutable();
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.cgroupMode_ = cgroupMode_;
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
      if (other instanceof com.google.container.v1beta1.LinuxNodeConfig) {
        return mergeFrom((com.google.container.v1beta1.LinuxNodeConfig) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.container.v1beta1.LinuxNodeConfig other) {
      if (other == com.google.container.v1beta1.LinuxNodeConfig.getDefaultInstance()) return this;
      internalGetMutableSysctls().mergeFrom(other.internalGetSysctls());
      bitField0_ |= 0x00000001;
      if (other.cgroupMode_ != 0) {
        setCgroupModeValue(other.getCgroupModeValue());
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
                com.google.protobuf.MapEntry<java.lang.String, java.lang.String> sysctls__ =
                    input.readMessage(
                        SysctlsDefaultEntryHolder.defaultEntry.getParserForType(),
                        extensionRegistry);
                internalGetMutableSysctls()
                    .getMutableMap()
                    .put(sysctls__.getKey(), sysctls__.getValue());
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                cgroupMode_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> sysctls_;

    private com.google.protobuf.MapField<java.lang.String, java.lang.String> internalGetSysctls() {
      if (sysctls_ == null) {
        return com.google.protobuf.MapField.emptyMapField(SysctlsDefaultEntryHolder.defaultEntry);
      }
      return sysctls_;
    }

    private com.google.protobuf.MapField<java.lang.String, java.lang.String>
        internalGetMutableSysctls() {
      if (sysctls_ == null) {
        sysctls_ = com.google.protobuf.MapField.newMapField(SysctlsDefaultEntryHolder.defaultEntry);
      }
      if (!sysctls_.isMutable()) {
        sysctls_ = sysctls_.copy();
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return sysctls_;
    }

    public int getSysctlsCount() {
      return internalGetSysctls().getMap().size();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public boolean containsSysctls(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      return internalGetSysctls().getMap().containsKey(key);
    }
    /** Use {@link #getSysctlsMap()} instead. */
    @java.lang.Override
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getSysctls() {
      return getSysctlsMap();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public java.util.Map<java.lang.String, java.lang.String> getSysctlsMap() {
      return internalGetSysctls().getMap();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public /* nullable */ java.lang.String getSysctlsOrDefault(
        java.lang.String key,
        /* nullable */
        java.lang.String defaultValue) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
      return map.containsKey(key) ? map.get(key) : defaultValue;
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    @java.lang.Override
    public java.lang.String getSysctlsOrThrow(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      java.util.Map<java.lang.String, java.lang.String> map = internalGetSysctls().getMap();
      if (!map.containsKey(key)) {
        throw new java.lang.IllegalArgumentException();
      }
      return map.get(key);
    }

    public Builder clearSysctls() {
      bitField0_ = (bitField0_ & ~0x00000001);
      internalGetMutableSysctls().getMutableMap().clear();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    public Builder removeSysctls(java.lang.String key) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      internalGetMutableSysctls().getMutableMap().remove(key);
      return this;
    }
    /** Use alternate mutation accessors instead. */
    @java.lang.Deprecated
    public java.util.Map<java.lang.String, java.lang.String> getMutableSysctls() {
      bitField0_ |= 0x00000001;
      return internalGetMutableSysctls().getMutableMap();
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    public Builder putSysctls(java.lang.String key, java.lang.String value) {
      if (key == null) {
        throw new NullPointerException("map key");
      }
      if (value == null) {
        throw new NullPointerException("map value");
      }
      internalGetMutableSysctls().getMutableMap().put(key, value);
      bitField0_ |= 0x00000001;
      return this;
    }
    /**
     *
     *
     * <pre>
     * The Linux kernel parameters to be applied to the nodes and all pods running
     * on the nodes.
     *
     * The following parameters are supported.
     *
     * net.core.busy_poll
     * net.core.busy_read
     * net.core.netdev_max_backlog
     * net.core.rmem_max
     * net.core.wmem_default
     * net.core.wmem_max
     * net.core.optmem_max
     * net.core.somaxconn
     * net.ipv4.tcp_rmem
     * net.ipv4.tcp_wmem
     * net.ipv4.tcp_tw_reuse
     * </pre>
     *
     * <code>map&lt;string, string&gt; sysctls = 1;</code>
     */
    public Builder putAllSysctls(java.util.Map<java.lang.String, java.lang.String> values) {
      internalGetMutableSysctls().getMutableMap().putAll(values);
      bitField0_ |= 0x00000001;
      return this;
    }

    private int cgroupMode_ = 0;
    /**
     *
     *
     * <pre>
     * cgroup_mode specifies the cgroup mode to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
     *
     * @return The enum numeric value on the wire for cgroupMode.
     */
    @java.lang.Override
    public int getCgroupModeValue() {
      return cgroupMode_;
    }
    /**
     *
     *
     * <pre>
     * cgroup_mode specifies the cgroup mode to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
     *
     * @param value The enum numeric value on the wire for cgroupMode to set.
     * @return This builder for chaining.
     */
    public Builder setCgroupModeValue(int value) {
      cgroupMode_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * cgroup_mode specifies the cgroup mode to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
     *
     * @return The cgroupMode.
     */
    @java.lang.Override
    public com.google.container.v1beta1.LinuxNodeConfig.CgroupMode getCgroupMode() {
      com.google.container.v1beta1.LinuxNodeConfig.CgroupMode result =
          com.google.container.v1beta1.LinuxNodeConfig.CgroupMode.forNumber(cgroupMode_);
      return result == null
          ? com.google.container.v1beta1.LinuxNodeConfig.CgroupMode.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * cgroup_mode specifies the cgroup mode to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
     *
     * @param value The cgroupMode to set.
     * @return This builder for chaining.
     */
    public Builder setCgroupMode(com.google.container.v1beta1.LinuxNodeConfig.CgroupMode value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      cgroupMode_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * cgroup_mode specifies the cgroup mode to be used on the node.
     * </pre>
     *
     * <code>.google.container.v1beta1.LinuxNodeConfig.CgroupMode cgroup_mode = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCgroupMode() {
      bitField0_ = (bitField0_ & ~0x00000002);
      cgroupMode_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.container.v1beta1.LinuxNodeConfig)
  }

  // @@protoc_insertion_point(class_scope:google.container.v1beta1.LinuxNodeConfig)
  private static final com.google.container.v1beta1.LinuxNodeConfig DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.container.v1beta1.LinuxNodeConfig();
  }

  public static com.google.container.v1beta1.LinuxNodeConfig getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<LinuxNodeConfig> PARSER =
      new com.google.protobuf.AbstractParser<LinuxNodeConfig>() {
        @java.lang.Override
        public LinuxNodeConfig parsePartialFrom(
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

  public static com.google.protobuf.Parser<LinuxNodeConfig> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<LinuxNodeConfig> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.container.v1beta1.LinuxNodeConfig getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
