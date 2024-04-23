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
// source: google/cloud/clouddms/v1/clouddms_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.clouddms.v1;

/**
 *
 *
 * <pre>
 * The details needed to configure a reverse SSH tunnel between the source and
 * destination databases. These details will be used when calling the
 * generateSshScript method (see
 * https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs/generateSshScript)
 * to produce the script that will help set up the reverse SSH tunnel, and to
 * set up the VPC peering between the Cloud SQL private network and the VPC.
 * </pre>
 *
 * Protobuf type {@code google.cloud.clouddms.v1.ReverseSshConnectivity}
 */
public final class ReverseSshConnectivity extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.clouddms.v1.ReverseSshConnectivity)
    ReverseSshConnectivityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ReverseSshConnectivity.newBuilder() to construct.
  private ReverseSshConnectivity(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ReverseSshConnectivity() {
    vmIp_ = "";
    vm_ = "";
    vpc_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ReverseSshConnectivity();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.clouddms.v1.ClouddmsResourcesProto
        .internal_static_google_cloud_clouddms_v1_ReverseSshConnectivity_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.clouddms.v1.ClouddmsResourcesProto
        .internal_static_google_cloud_clouddms_v1_ReverseSshConnectivity_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.clouddms.v1.ReverseSshConnectivity.class,
            com.google.cloud.clouddms.v1.ReverseSshConnectivity.Builder.class);
  }

  public static final int VM_IP_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object vmIp_ = "";
  /**
   *
   *
   * <pre>
   * Required. The IP of the virtual machine (Compute Engine) used as the
   * bastion server for the SSH tunnel.
   * </pre>
   *
   * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vmIp.
   */
  @java.lang.Override
  public java.lang.String getVmIp() {
    java.lang.Object ref = vmIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vmIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The IP of the virtual machine (Compute Engine) used as the
   * bastion server for the SSH tunnel.
   * </pre>
   *
   * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for vmIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVmIpBytes() {
    java.lang.Object ref = vmIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      vmIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VM_PORT_FIELD_NUMBER = 2;
  private int vmPort_ = 0;
  /**
   *
   *
   * <pre>
   * Required. The forwarding port of the virtual machine (Compute Engine) used
   * as the bastion server for the SSH tunnel.
   * </pre>
   *
   * <code>int32 vm_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The vmPort.
   */
  @java.lang.Override
  public int getVmPort() {
    return vmPort_;
  }

  public static final int VM_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object vm_ = "";
  /**
   *
   *
   * <pre>
   * The name of the virtual machine (Compute Engine) used as the bastion server
   * for the SSH tunnel.
   * </pre>
   *
   * <code>string vm = 3;</code>
   *
   * @return The vm.
   */
  @java.lang.Override
  public java.lang.String getVm() {
    java.lang.Object ref = vm_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vm_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the virtual machine (Compute Engine) used as the bastion server
   * for the SSH tunnel.
   * </pre>
   *
   * <code>string vm = 3;</code>
   *
   * @return The bytes for vm.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVmBytes() {
    java.lang.Object ref = vm_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      vm_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VPC_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object vpc_ = "";
  /**
   *
   *
   * <pre>
   * The name of the VPC to peer with the Cloud SQL private network.
   * </pre>
   *
   * <code>string vpc = 4;</code>
   *
   * @return The vpc.
   */
  @java.lang.Override
  public java.lang.String getVpc() {
    java.lang.Object ref = vpc_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      vpc_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The name of the VPC to peer with the Cloud SQL private network.
   * </pre>
   *
   * <code>string vpc = 4;</code>
   *
   * @return The bytes for vpc.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getVpcBytes() {
    java.lang.Object ref = vpc_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      vpc_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, vmIp_);
    }
    if (vmPort_ != 0) {
      output.writeInt32(2, vmPort_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vm_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, vm_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vpc_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, vpc_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vmIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, vmIp_);
    }
    if (vmPort_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(2, vmPort_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vm_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, vm_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(vpc_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, vpc_);
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
    if (!(obj instanceof com.google.cloud.clouddms.v1.ReverseSshConnectivity)) {
      return super.equals(obj);
    }
    com.google.cloud.clouddms.v1.ReverseSshConnectivity other =
        (com.google.cloud.clouddms.v1.ReverseSshConnectivity) obj;

    if (!getVmIp().equals(other.getVmIp())) return false;
    if (getVmPort() != other.getVmPort()) return false;
    if (!getVm().equals(other.getVm())) return false;
    if (!getVpc().equals(other.getVpc())) return false;
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
    hash = (37 * hash) + VM_IP_FIELD_NUMBER;
    hash = (53 * hash) + getVmIp().hashCode();
    hash = (37 * hash) + VM_PORT_FIELD_NUMBER;
    hash = (53 * hash) + getVmPort();
    hash = (37 * hash) + VM_FIELD_NUMBER;
    hash = (53 * hash) + getVm().hashCode();
    hash = (37 * hash) + VPC_FIELD_NUMBER;
    hash = (53 * hash) + getVpc().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity parseFrom(
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

  public static Builder newBuilder(com.google.cloud.clouddms.v1.ReverseSshConnectivity prototype) {
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
   * The details needed to configure a reverse SSH tunnel between the source and
   * destination databases. These details will be used when calling the
   * generateSshScript method (see
   * https://cloud.google.com/database-migration/docs/reference/rest/v1/projects.locations.migrationJobs/generateSshScript)
   * to produce the script that will help set up the reverse SSH tunnel, and to
   * set up the VPC peering between the Cloud SQL private network and the VPC.
   * </pre>
   *
   * Protobuf type {@code google.cloud.clouddms.v1.ReverseSshConnectivity}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.clouddms.v1.ReverseSshConnectivity)
      com.google.cloud.clouddms.v1.ReverseSshConnectivityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.clouddms.v1.ClouddmsResourcesProto
          .internal_static_google_cloud_clouddms_v1_ReverseSshConnectivity_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.clouddms.v1.ClouddmsResourcesProto
          .internal_static_google_cloud_clouddms_v1_ReverseSshConnectivity_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.clouddms.v1.ReverseSshConnectivity.class,
              com.google.cloud.clouddms.v1.ReverseSshConnectivity.Builder.class);
    }

    // Construct using com.google.cloud.clouddms.v1.ReverseSshConnectivity.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      vmIp_ = "";
      vmPort_ = 0;
      vm_ = "";
      vpc_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.clouddms.v1.ClouddmsResourcesProto
          .internal_static_google_cloud_clouddms_v1_ReverseSshConnectivity_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ReverseSshConnectivity getDefaultInstanceForType() {
      return com.google.cloud.clouddms.v1.ReverseSshConnectivity.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ReverseSshConnectivity build() {
      com.google.cloud.clouddms.v1.ReverseSshConnectivity result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.clouddms.v1.ReverseSshConnectivity buildPartial() {
      com.google.cloud.clouddms.v1.ReverseSshConnectivity result =
          new com.google.cloud.clouddms.v1.ReverseSshConnectivity(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.clouddms.v1.ReverseSshConnectivity result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.vmIp_ = vmIp_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.vmPort_ = vmPort_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.vm_ = vm_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.vpc_ = vpc_;
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
      if (other instanceof com.google.cloud.clouddms.v1.ReverseSshConnectivity) {
        return mergeFrom((com.google.cloud.clouddms.v1.ReverseSshConnectivity) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.clouddms.v1.ReverseSshConnectivity other) {
      if (other == com.google.cloud.clouddms.v1.ReverseSshConnectivity.getDefaultInstance())
        return this;
      if (!other.getVmIp().isEmpty()) {
        vmIp_ = other.vmIp_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.getVmPort() != 0) {
        setVmPort(other.getVmPort());
      }
      if (!other.getVm().isEmpty()) {
        vm_ = other.vm_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getVpc().isEmpty()) {
        vpc_ = other.vpc_;
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
            case 10:
              {
                vmIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                vmPort_ = input.readInt32();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
            case 26:
              {
                vm_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                vpc_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object vmIp_ = "";
    /**
     *
     *
     * <pre>
     * Required. The IP of the virtual machine (Compute Engine) used as the
     * bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The vmIp.
     */
    public java.lang.String getVmIp() {
      java.lang.Object ref = vmIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vmIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The IP of the virtual machine (Compute Engine) used as the
     * bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for vmIp.
     */
    public com.google.protobuf.ByteString getVmIpBytes() {
      java.lang.Object ref = vmIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        vmIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The IP of the virtual machine (Compute Engine) used as the
     * bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The vmIp to set.
     * @return This builder for chaining.
     */
    public Builder setVmIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      vmIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The IP of the virtual machine (Compute Engine) used as the
     * bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVmIp() {
      vmIp_ = getDefaultInstance().getVmIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The IP of the virtual machine (Compute Engine) used as the
     * bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>string vm_ip = 1 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for vmIp to set.
     * @return This builder for chaining.
     */
    public Builder setVmIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      vmIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int vmPort_;
    /**
     *
     *
     * <pre>
     * Required. The forwarding port of the virtual machine (Compute Engine) used
     * as the bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>int32 vm_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The vmPort.
     */
    @java.lang.Override
    public int getVmPort() {
      return vmPort_;
    }
    /**
     *
     *
     * <pre>
     * Required. The forwarding port of the virtual machine (Compute Engine) used
     * as the bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>int32 vm_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The vmPort to set.
     * @return This builder for chaining.
     */
    public Builder setVmPort(int value) {

      vmPort_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The forwarding port of the virtual machine (Compute Engine) used
     * as the bastion server for the SSH tunnel.
     * </pre>
     *
     * <code>int32 vm_port = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVmPort() {
      bitField0_ = (bitField0_ & ~0x00000002);
      vmPort_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object vm_ = "";
    /**
     *
     *
     * <pre>
     * The name of the virtual machine (Compute Engine) used as the bastion server
     * for the SSH tunnel.
     * </pre>
     *
     * <code>string vm = 3;</code>
     *
     * @return The vm.
     */
    public java.lang.String getVm() {
      java.lang.Object ref = vm_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vm_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the virtual machine (Compute Engine) used as the bastion server
     * for the SSH tunnel.
     * </pre>
     *
     * <code>string vm = 3;</code>
     *
     * @return The bytes for vm.
     */
    public com.google.protobuf.ByteString getVmBytes() {
      java.lang.Object ref = vm_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        vm_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the virtual machine (Compute Engine) used as the bastion server
     * for the SSH tunnel.
     * </pre>
     *
     * <code>string vm = 3;</code>
     *
     * @param value The vm to set.
     * @return This builder for chaining.
     */
    public Builder setVm(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      vm_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the virtual machine (Compute Engine) used as the bastion server
     * for the SSH tunnel.
     * </pre>
     *
     * <code>string vm = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVm() {
      vm_ = getDefaultInstance().getVm();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the virtual machine (Compute Engine) used as the bastion server
     * for the SSH tunnel.
     * </pre>
     *
     * <code>string vm = 3;</code>
     *
     * @param value The bytes for vm to set.
     * @return This builder for chaining.
     */
    public Builder setVmBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      vm_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object vpc_ = "";
    /**
     *
     *
     * <pre>
     * The name of the VPC to peer with the Cloud SQL private network.
     * </pre>
     *
     * <code>string vpc = 4;</code>
     *
     * @return The vpc.
     */
    public java.lang.String getVpc() {
      java.lang.Object ref = vpc_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        vpc_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the VPC to peer with the Cloud SQL private network.
     * </pre>
     *
     * <code>string vpc = 4;</code>
     *
     * @return The bytes for vpc.
     */
    public com.google.protobuf.ByteString getVpcBytes() {
      java.lang.Object ref = vpc_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        vpc_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The name of the VPC to peer with the Cloud SQL private network.
     * </pre>
     *
     * <code>string vpc = 4;</code>
     *
     * @param value The vpc to set.
     * @return This builder for chaining.
     */
    public Builder setVpc(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      vpc_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the VPC to peer with the Cloud SQL private network.
     * </pre>
     *
     * <code>string vpc = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearVpc() {
      vpc_ = getDefaultInstance().getVpc();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The name of the VPC to peer with the Cloud SQL private network.
     * </pre>
     *
     * <code>string vpc = 4;</code>
     *
     * @param value The bytes for vpc to set.
     * @return This builder for chaining.
     */
    public Builder setVpcBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      vpc_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.clouddms.v1.ReverseSshConnectivity)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.clouddms.v1.ReverseSshConnectivity)
  private static final com.google.cloud.clouddms.v1.ReverseSshConnectivity DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.clouddms.v1.ReverseSshConnectivity();
  }

  public static com.google.cloud.clouddms.v1.ReverseSshConnectivity getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ReverseSshConnectivity> PARSER =
      new com.google.protobuf.AbstractParser<ReverseSshConnectivity>() {
        @java.lang.Override
        public ReverseSshConnectivity parsePartialFrom(
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

  public static com.google.protobuf.Parser<ReverseSshConnectivity> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ReverseSshConnectivity> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.clouddms.v1.ReverseSshConnectivity getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
