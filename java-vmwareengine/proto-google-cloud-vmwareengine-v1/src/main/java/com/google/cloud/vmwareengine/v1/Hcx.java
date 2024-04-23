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
// source: google/cloud/vmwareengine/v1/vmwareengine_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.vmwareengine.v1;

/**
 *
 *
 * <pre>
 * Details about a HCX Cloud Manager appliance.
 * </pre>
 *
 * Protobuf type {@code google.cloud.vmwareengine.v1.Hcx}
 */
public final class Hcx extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.vmwareengine.v1.Hcx)
    HcxOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use Hcx.newBuilder() to construct.
  private Hcx(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private Hcx() {
    internalIp_ = "";
    version_ = "";
    state_ = 0;
    fqdn_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new Hcx();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
        .internal_static_google_cloud_vmwareengine_v1_Hcx_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
        .internal_static_google_cloud_vmwareengine_v1_Hcx_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.vmwareengine.v1.Hcx.class,
            com.google.cloud.vmwareengine.v1.Hcx.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * State of the appliance
   * </pre>
   *
   * Protobuf enum {@code google.cloud.vmwareengine.v1.Hcx.State}
   */
  public enum State implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified appliance state. This is the default value.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    STATE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * The appliance is operational and can be used.
     * </pre>
     *
     * <code>ACTIVE = 1;</code>
     */
    ACTIVE(1),
    /**
     *
     *
     * <pre>
     * The appliance is being deployed.
     * </pre>
     *
     * <code>CREATING = 2;</code>
     */
    CREATING(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified appliance state. This is the default value.
     * </pre>
     *
     * <code>STATE_UNSPECIFIED = 0;</code>
     */
    public static final int STATE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * The appliance is operational and can be used.
     * </pre>
     *
     * <code>ACTIVE = 1;</code>
     */
    public static final int ACTIVE_VALUE = 1;
    /**
     *
     *
     * <pre>
     * The appliance is being deployed.
     * </pre>
     *
     * <code>CREATING = 2;</code>
     */
    public static final int CREATING_VALUE = 2;

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
    public static State valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static State forNumber(int value) {
      switch (value) {
        case 0:
          return STATE_UNSPECIFIED;
        case 1:
          return ACTIVE;
        case 2:
          return CREATING;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<State> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<State> internalValueMap =
        new com.google.protobuf.Internal.EnumLiteMap<State>() {
          public State findValueByNumber(int number) {
            return State.forNumber(number);
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
      return com.google.cloud.vmwareengine.v1.Hcx.getDescriptor().getEnumTypes().get(0);
    }

    private static final State[] VALUES = values();

    public static State valueOf(com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private State(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.vmwareengine.v1.Hcx.State)
  }

  public static final int INTERNAL_IP_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object internalIp_ = "";
  /**
   *
   *
   * <pre>
   * Internal IP address of the appliance.
   * </pre>
   *
   * <code>string internal_ip = 2;</code>
   *
   * @return The internalIp.
   */
  @java.lang.Override
  public java.lang.String getInternalIp() {
    java.lang.Object ref = internalIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      internalIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Internal IP address of the appliance.
   * </pre>
   *
   * <code>string internal_ip = 2;</code>
   *
   * @return The bytes for internalIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInternalIpBytes() {
    java.lang.Object ref = internalIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      internalIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VERSION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object version_ = "";
  /**
   *
   *
   * <pre>
   * Version of the appliance.
   * </pre>
   *
   * <code>string version = 4;</code>
   *
   * @return The version.
   */
  @java.lang.Override
  public java.lang.String getVersion() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      version_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Version of the appliance.
   * </pre>
   *
   * <code>string version = 4;</code>
   *
   * @return The bytes for version.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVersionBytes() {
    java.lang.Object ref = version_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      version_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int STATE_FIELD_NUMBER = 5;
  private int state_ = 0;
  /**
   *
   *
   * <pre>
   * Output only. The state of the appliance.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The enum numeric value on the wire for state.
   */
  @java.lang.Override
  public int getStateValue() {
    return state_;
  }
  /**
   *
   *
   * <pre>
   * Output only. The state of the appliance.
   * </pre>
   *
   * <code>
   * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
   * </code>
   *
   * @return The state.
   */
  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.Hcx.State getState() {
    com.google.cloud.vmwareengine.v1.Hcx.State result =
        com.google.cloud.vmwareengine.v1.Hcx.State.forNumber(state_);
    return result == null ? com.google.cloud.vmwareengine.v1.Hcx.State.UNRECOGNIZED : result;
  }

  public static final int FQDN_FIELD_NUMBER = 6;

  @SuppressWarnings("serial")
  private volatile java.lang.Object fqdn_ = "";
  /**
   *
   *
   * <pre>
   * Fully qualified domain name of the appliance.
   * </pre>
   *
   * <code>string fqdn = 6;</code>
   *
   * @return The fqdn.
   */
  @java.lang.Override
  public java.lang.String getFqdn() {
    java.lang.Object ref = fqdn_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      fqdn_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Fully qualified domain name of the appliance.
   * </pre>
   *
   * <code>string fqdn = 6;</code>
   *
   * @return The bytes for fqdn.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getFqdnBytes() {
    java.lang.Object ref = fqdn_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      fqdn_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(internalIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, internalIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, version_);
    }
    if (state_ != com.google.cloud.vmwareengine.v1.Hcx.State.STATE_UNSPECIFIED.getNumber()) {
      output.writeEnum(5, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fqdn_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 6, fqdn_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(internalIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, internalIp_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(version_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, version_);
    }
    if (state_ != com.google.cloud.vmwareengine.v1.Hcx.State.STATE_UNSPECIFIED.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(5, state_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(fqdn_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(6, fqdn_);
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
    if (!(obj instanceof com.google.cloud.vmwareengine.v1.Hcx)) {
      return super.equals(obj);
    }
    com.google.cloud.vmwareengine.v1.Hcx other = (com.google.cloud.vmwareengine.v1.Hcx) obj;

    if (!getInternalIp().equals(other.getInternalIp())) return false;
    if (!getVersion().equals(other.getVersion())) return false;
    if (state_ != other.state_) return false;
    if (!getFqdn().equals(other.getFqdn())) return false;
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
    hash = (37 * hash) + INTERNAL_IP_FIELD_NUMBER;
    hash = (53 * hash) + getInternalIp().hashCode();
    hash = (37 * hash) + VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getVersion().hashCode();
    hash = (37 * hash) + STATE_FIELD_NUMBER;
    hash = (53 * hash) + state_;
    hash = (37 * hash) + FQDN_FIELD_NUMBER;
    hash = (53 * hash) + getFqdn().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseDelimitedFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.vmwareengine.v1.Hcx parseFrom(
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

  public static Builder newBuilder(com.google.cloud.vmwareengine.v1.Hcx prototype) {
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
   * Details about a HCX Cloud Manager appliance.
   * </pre>
   *
   * Protobuf type {@code google.cloud.vmwareengine.v1.Hcx}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.vmwareengine.v1.Hcx)
      com.google.cloud.vmwareengine.v1.HcxOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
          .internal_static_google_cloud_vmwareengine_v1_Hcx_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
          .internal_static_google_cloud_vmwareengine_v1_Hcx_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.vmwareengine.v1.Hcx.class,
              com.google.cloud.vmwareengine.v1.Hcx.Builder.class);
    }

    // Construct using com.google.cloud.vmwareengine.v1.Hcx.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      internalIp_ = "";
      version_ = "";
      state_ = 0;
      fqdn_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.vmwareengine.v1.VmwareengineResourcesProto
          .internal_static_google_cloud_vmwareengine_v1_Hcx_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.Hcx getDefaultInstanceForType() {
      return com.google.cloud.vmwareengine.v1.Hcx.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.Hcx build() {
      com.google.cloud.vmwareengine.v1.Hcx result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.Hcx buildPartial() {
      com.google.cloud.vmwareengine.v1.Hcx result = new com.google.cloud.vmwareengine.v1.Hcx(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.vmwareengine.v1.Hcx result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.internalIp_ = internalIp_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.version_ = version_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.state_ = state_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fqdn_ = fqdn_;
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
      if (other instanceof com.google.cloud.vmwareengine.v1.Hcx) {
        return mergeFrom((com.google.cloud.vmwareengine.v1.Hcx) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.vmwareengine.v1.Hcx other) {
      if (other == com.google.cloud.vmwareengine.v1.Hcx.getDefaultInstance()) return this;
      if (!other.getInternalIp().isEmpty()) {
        internalIp_ = other.internalIp_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getVersion().isEmpty()) {
        version_ = other.version_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.state_ != 0) {
        setStateValue(other.getStateValue());
      }
      if (!other.getFqdn().isEmpty()) {
        fqdn_ = other.fqdn_;
        bitField0_ |= 0x00000008;
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
            case 18:
              {
                internalIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 18
            case 34:
              {
                version_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 34
            case 40:
              {
                state_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 40
            case 50:
              {
                fqdn_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 50
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

    private java.lang.Object internalIp_ = "";
    /**
     *
     *
     * <pre>
     * Internal IP address of the appliance.
     * </pre>
     *
     * <code>string internal_ip = 2;</code>
     *
     * @return The internalIp.
     */
    public java.lang.String getInternalIp() {
      java.lang.Object ref = internalIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        internalIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of the appliance.
     * </pre>
     *
     * <code>string internal_ip = 2;</code>
     *
     * @return The bytes for internalIp.
     */
    public com.google.protobuf.ByteString getInternalIpBytes() {
      java.lang.Object ref = internalIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        internalIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of the appliance.
     * </pre>
     *
     * <code>string internal_ip = 2;</code>
     *
     * @param value The internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      internalIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of the appliance.
     * </pre>
     *
     * <code>string internal_ip = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInternalIp() {
      internalIp_ = getDefaultInstance().getInternalIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Internal IP address of the appliance.
     * </pre>
     *
     * <code>string internal_ip = 2;</code>
     *
     * @param value The bytes for internalIp to set.
     * @return This builder for chaining.
     */
    public Builder setInternalIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      internalIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object version_ = "";
    /**
     *
     *
     * <pre>
     * Version of the appliance.
     * </pre>
     *
     * <code>string version = 4;</code>
     *
     * @return The version.
     */
    public java.lang.String getVersion() {
      java.lang.Object ref = version_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        version_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version of the appliance.
     * </pre>
     *
     * <code>string version = 4;</code>
     *
     * @return The bytes for version.
     */
    public com.google.protobuf.ByteString getVersionBytes() {
      java.lang.Object ref = version_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        version_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Version of the appliance.
     * </pre>
     *
     * <code>string version = 4;</code>
     *
     * @param value The version to set.
     * @return This builder for chaining.
     */
    public Builder setVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version of the appliance.
     * </pre>
     *
     * <code>string version = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVersion() {
      version_ = getDefaultInstance().getVersion();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Version of the appliance.
     * </pre>
     *
     * <code>string version = 4;</code>
     *
     * @param value The bytes for version to set.
     * @return This builder for chaining.
     */
    public Builder setVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      version_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int state_ = 0;
    /**
     *
     *
     * <pre>
     * Output only. The state of the appliance.
     * </pre>
     *
     * <code>
     * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The enum numeric value on the wire for state.
     */
    @java.lang.Override
    public int getStateValue() {
      return state_;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of the appliance.
     * </pre>
     *
     * <code>
     * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The enum numeric value on the wire for state to set.
     * @return This builder for chaining.
     */
    public Builder setStateValue(int value) {
      state_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of the appliance.
     * </pre>
     *
     * <code>
     * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return The state.
     */
    @java.lang.Override
    public com.google.cloud.vmwareengine.v1.Hcx.State getState() {
      com.google.cloud.vmwareengine.v1.Hcx.State result =
          com.google.cloud.vmwareengine.v1.Hcx.State.forNumber(state_);
      return result == null ? com.google.cloud.vmwareengine.v1.Hcx.State.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of the appliance.
     * </pre>
     *
     * <code>
     * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @param value The state to set.
     * @return This builder for chaining.
     */
    public Builder setState(com.google.cloud.vmwareengine.v1.Hcx.State value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      state_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Output only. The state of the appliance.
     * </pre>
     *
     * <code>
     * .google.cloud.vmwareengine.v1.Hcx.State state = 5 [(.google.api.field_behavior) = OUTPUT_ONLY];
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearState() {
      bitField0_ = (bitField0_ & ~0x00000004);
      state_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object fqdn_ = "";
    /**
     *
     *
     * <pre>
     * Fully qualified domain name of the appliance.
     * </pre>
     *
     * <code>string fqdn = 6;</code>
     *
     * @return The fqdn.
     */
    public java.lang.String getFqdn() {
      java.lang.Object ref = fqdn_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        fqdn_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name of the appliance.
     * </pre>
     *
     * <code>string fqdn = 6;</code>
     *
     * @return The bytes for fqdn.
     */
    public com.google.protobuf.ByteString getFqdnBytes() {
      java.lang.Object ref = fqdn_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        fqdn_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name of the appliance.
     * </pre>
     *
     * <code>string fqdn = 6;</code>
     *
     * @param value The fqdn to set.
     * @return This builder for chaining.
     */
    public Builder setFqdn(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      fqdn_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name of the appliance.
     * </pre>
     *
     * <code>string fqdn = 6;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFqdn() {
      fqdn_ = getDefaultInstance().getFqdn();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fully qualified domain name of the appliance.
     * </pre>
     *
     * <code>string fqdn = 6;</code>
     *
     * @param value The bytes for fqdn to set.
     * @return This builder for chaining.
     */
    public Builder setFqdnBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      fqdn_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.vmwareengine.v1.Hcx)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.vmwareengine.v1.Hcx)
  private static final com.google.cloud.vmwareengine.v1.Hcx DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.vmwareengine.v1.Hcx();
  }

  public static com.google.cloud.vmwareengine.v1.Hcx getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<Hcx> PARSER =
      new com.google.protobuf.AbstractParser<Hcx>() {
        @java.lang.Override
        public Hcx parsePartialFrom(
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

  public static com.google.protobuf.Parser<Hcx> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<Hcx> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.vmwareengine.v1.Hcx getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
