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
// source: google/cloud/networkmanagement/v1beta1/trace.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.networkmanagement.v1beta1;

/**
 *
 *
 * <pre>
 * For display only. Details of a Google Service sending packets to a
 * VPC network. Although the source IP might be a publicly routable address,
 * some Google Services use special routes within Google production
 * infrastructure to reach Compute Engine Instances.
 * https://cloud.google.com/vpc/docs/routes#special_return_paths
 * </pre>
 *
 * Protobuf type {@code google.cloud.networkmanagement.v1beta1.GoogleServiceInfo}
 */
public final class GoogleServiceInfo extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.networkmanagement.v1beta1.GoogleServiceInfo)
    GoogleServiceInfoOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GoogleServiceInfo.newBuilder() to construct.
  private GoogleServiceInfo(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GoogleServiceInfo() {
    sourceIp_ = "";
    googleServiceType_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GoogleServiceInfo();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.networkmanagement.v1beta1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1beta1_GoogleServiceInfo_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.networkmanagement.v1beta1.TraceProto
        .internal_static_google_cloud_networkmanagement_v1beta1_GoogleServiceInfo_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.class,
            com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Recognized type of a Google Service.
   * </pre>
   *
   * Protobuf enum {@code
   * google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType}
   */
  public enum GoogleServiceType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified Google Service.
     * </pre>
     *
     * <code>GOOGLE_SERVICE_TYPE_UNSPECIFIED = 0;</code>
     */
    GOOGLE_SERVICE_TYPE_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Identity aware proxy.
     * https://cloud.google.com/iap/docs/using-tcp-forwarding
     * </pre>
     *
     * <code>IAP = 1;</code>
     */
    IAP(1),
    /**
     *
     *
     * <pre>
     * One of two services sharing IP ranges:
     * * Load Balancer proxy
     * * Centralized Health Check prober
     * https://cloud.google.com/load-balancing/docs/firewall-rules
     * </pre>
     *
     * <code>GFE_PROXY_OR_HEALTH_CHECK_PROBER = 2;</code>
     */
    GFE_PROXY_OR_HEALTH_CHECK_PROBER(2),
    /**
     *
     *
     * <pre>
     * Connectivity from Cloud DNS to forwarding targets or alternate name
     * servers that use private routing.
     * https://cloud.google.com/dns/docs/zones/forwarding-zones#firewall-rules
     * https://cloud.google.com/dns/docs/policies#firewall-rules
     * </pre>
     *
     * <code>CLOUD_DNS = 3;</code>
     */
    CLOUD_DNS(3),
    /**
     *
     *
     * <pre>
     * private.googleapis.com and restricted.googleapis.com
     * </pre>
     *
     * <code>GOOGLE_API = 4;</code>
     */
    GOOGLE_API(4),
    /**
     *
     *
     * <pre>
     * Google API via Private Service Connect.
     * https://cloud.google.com/vpc/docs/configure-private-service-connect-apis
     * </pre>
     *
     * <code>GOOGLE_API_PSC = 5;</code>
     */
    GOOGLE_API_PSC(5),
    /**
     *
     *
     * <pre>
     * Google API via VPC Service Controls.
     * https://cloud.google.com/vpc/docs/configure-private-service-connect-apis
     * </pre>
     *
     * <code>GOOGLE_API_VPC_SC = 6;</code>
     */
    GOOGLE_API_VPC_SC(6),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified Google Service.
     * </pre>
     *
     * <code>GOOGLE_SERVICE_TYPE_UNSPECIFIED = 0;</code>
     */
    public static final int GOOGLE_SERVICE_TYPE_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Identity aware proxy.
     * https://cloud.google.com/iap/docs/using-tcp-forwarding
     * </pre>
     *
     * <code>IAP = 1;</code>
     */
    public static final int IAP_VALUE = 1;
    /**
     *
     *
     * <pre>
     * One of two services sharing IP ranges:
     * * Load Balancer proxy
     * * Centralized Health Check prober
     * https://cloud.google.com/load-balancing/docs/firewall-rules
     * </pre>
     *
     * <code>GFE_PROXY_OR_HEALTH_CHECK_PROBER = 2;</code>
     */
    public static final int GFE_PROXY_OR_HEALTH_CHECK_PROBER_VALUE = 2;
    /**
     *
     *
     * <pre>
     * Connectivity from Cloud DNS to forwarding targets or alternate name
     * servers that use private routing.
     * https://cloud.google.com/dns/docs/zones/forwarding-zones#firewall-rules
     * https://cloud.google.com/dns/docs/policies#firewall-rules
     * </pre>
     *
     * <code>CLOUD_DNS = 3;</code>
     */
    public static final int CLOUD_DNS_VALUE = 3;
    /**
     *
     *
     * <pre>
     * private.googleapis.com and restricted.googleapis.com
     * </pre>
     *
     * <code>GOOGLE_API = 4;</code>
     */
    public static final int GOOGLE_API_VALUE = 4;
    /**
     *
     *
     * <pre>
     * Google API via Private Service Connect.
     * https://cloud.google.com/vpc/docs/configure-private-service-connect-apis
     * </pre>
     *
     * <code>GOOGLE_API_PSC = 5;</code>
     */
    public static final int GOOGLE_API_PSC_VALUE = 5;
    /**
     *
     *
     * <pre>
     * Google API via VPC Service Controls.
     * https://cloud.google.com/vpc/docs/configure-private-service-connect-apis
     * </pre>
     *
     * <code>GOOGLE_API_VPC_SC = 6;</code>
     */
    public static final int GOOGLE_API_VPC_SC_VALUE = 6;

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
    public static GoogleServiceType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static GoogleServiceType forNumber(int value) {
      switch (value) {
        case 0:
          return GOOGLE_SERVICE_TYPE_UNSPECIFIED;
        case 1:
          return IAP;
        case 2:
          return GFE_PROXY_OR_HEALTH_CHECK_PROBER;
        case 3:
          return CLOUD_DNS;
        case 4:
          return GOOGLE_API;
        case 5:
          return GOOGLE_API_PSC;
        case 6:
          return GOOGLE_API_VPC_SC;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<GoogleServiceType>
        internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<GoogleServiceType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<GoogleServiceType>() {
              public GoogleServiceType findValueByNumber(int number) {
                return GoogleServiceType.forNumber(number);
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
      return com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final GoogleServiceType[] VALUES = values();

    public static GoogleServiceType valueOf(
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

    private GoogleServiceType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType)
  }

  public static final int SOURCE_IP_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object sourceIp_ = "";
  /**
   *
   *
   * <pre>
   * Source IP address.
   * </pre>
   *
   * <code>string source_ip = 1;</code>
   *
   * @return The sourceIp.
   */
  @java.lang.Override
  public java.lang.String getSourceIp() {
    java.lang.Object ref = sourceIp_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      sourceIp_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Source IP address.
   * </pre>
   *
   * <code>string source_ip = 1;</code>
   *
   * @return The bytes for sourceIp.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getSourceIpBytes() {
    java.lang.Object ref = sourceIp_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      sourceIp_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int GOOGLE_SERVICE_TYPE_FIELD_NUMBER = 2;
  private int googleServiceType_ = 0;
  /**
   *
   *
   * <pre>
   * Recognized type of a Google Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
   * </code>
   *
   * @return The enum numeric value on the wire for googleServiceType.
   */
  @java.lang.Override
  public int getGoogleServiceTypeValue() {
    return googleServiceType_;
  }
  /**
   *
   *
   * <pre>
   * Recognized type of a Google Service.
   * </pre>
   *
   * <code>
   * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
   * </code>
   *
   * @return The googleServiceType.
   */
  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType
      getGoogleServiceType() {
    com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType result =
        com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType.forNumber(
            googleServiceType_);
    return result == null
        ? com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType
            .UNRECOGNIZED
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceIp_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, sourceIp_);
    }
    if (googleServiceType_
        != com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType
            .GOOGLE_SERVICE_TYPE_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, googleServiceType_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(sourceIp_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, sourceIp_);
    }
    if (googleServiceType_
        != com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType
            .GOOGLE_SERVICE_TYPE_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, googleServiceType_);
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
    if (!(obj instanceof com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo)) {
      return super.equals(obj);
    }
    com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo other =
        (com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo) obj;

    if (!getSourceIp().equals(other.getSourceIp())) return false;
    if (googleServiceType_ != other.googleServiceType_) return false;
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
    hash = (37 * hash) + SOURCE_IP_FIELD_NUMBER;
    hash = (53 * hash) + getSourceIp().hashCode();
    hash = (37 * hash) + GOOGLE_SERVICE_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + googleServiceType_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo parseFrom(
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
      com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo prototype) {
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
   * For display only. Details of a Google Service sending packets to a
   * VPC network. Although the source IP might be a publicly routable address,
   * some Google Services use special routes within Google production
   * infrastructure to reach Compute Engine Instances.
   * https://cloud.google.com/vpc/docs/routes#special_return_paths
   * </pre>
   *
   * Protobuf type {@code google.cloud.networkmanagement.v1beta1.GoogleServiceInfo}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.networkmanagement.v1beta1.GoogleServiceInfo)
      com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfoOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.networkmanagement.v1beta1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_GoogleServiceInfo_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.networkmanagement.v1beta1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_GoogleServiceInfo_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.class,
              com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.Builder.class);
    }

    // Construct using com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      sourceIp_ = "";
      googleServiceType_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.networkmanagement.v1beta1.TraceProto
          .internal_static_google_cloud_networkmanagement_v1beta1_GoogleServiceInfo_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo
        getDefaultInstanceForType() {
      return com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo build() {
      com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo buildPartial() {
      com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo result =
          new com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.sourceIp_ = sourceIp_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.googleServiceType_ = googleServiceType_;
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
      if (other instanceof com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo) {
        return mergeFrom((com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo other) {
      if (other
          == com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.getDefaultInstance())
        return this;
      if (!other.getSourceIp().isEmpty()) {
        sourceIp_ = other.sourceIp_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.googleServiceType_ != 0) {
        setGoogleServiceTypeValue(other.getGoogleServiceTypeValue());
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
                sourceIp_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                googleServiceType_ = input.readEnum();
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

    private java.lang.Object sourceIp_ = "";
    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 1;</code>
     *
     * @return The sourceIp.
     */
    public java.lang.String getSourceIp() {
      java.lang.Object ref = sourceIp_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        sourceIp_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 1;</code>
     *
     * @return The bytes for sourceIp.
     */
    public com.google.protobuf.ByteString getSourceIpBytes() {
      java.lang.Object ref = sourceIp_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        sourceIp_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 1;</code>
     *
     * @param value The sourceIp to set.
     * @return This builder for chaining.
     */
    public Builder setSourceIp(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      sourceIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSourceIp() {
      sourceIp_ = getDefaultInstance().getSourceIp();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Source IP address.
     * </pre>
     *
     * <code>string source_ip = 1;</code>
     *
     * @param value The bytes for sourceIp to set.
     * @return This builder for chaining.
     */
    public Builder setSourceIpBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      sourceIp_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private int googleServiceType_ = 0;
    /**
     *
     *
     * <pre>
     * Recognized type of a Google Service.
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for googleServiceType.
     */
    @java.lang.Override
    public int getGoogleServiceTypeValue() {
      return googleServiceType_;
    }
    /**
     *
     *
     * <pre>
     * Recognized type of a Google Service.
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for googleServiceType to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleServiceTypeValue(int value) {
      googleServiceType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Recognized type of a Google Service.
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
     * </code>
     *
     * @return The googleServiceType.
     */
    @java.lang.Override
    public com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType
        getGoogleServiceType() {
      com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType result =
          com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType.forNumber(
              googleServiceType_);
      return result == null
          ? com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType
              .UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Recognized type of a Google Service.
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
     * </code>
     *
     * @param value The googleServiceType to set.
     * @return This builder for chaining.
     */
    public Builder setGoogleServiceType(
        com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      googleServiceType_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Recognized type of a Google Service.
     * </pre>
     *
     * <code>
     * .google.cloud.networkmanagement.v1beta1.GoogleServiceInfo.GoogleServiceType google_service_type = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearGoogleServiceType() {
      bitField0_ = (bitField0_ & ~0x00000002);
      googleServiceType_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.networkmanagement.v1beta1.GoogleServiceInfo)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.networkmanagement.v1beta1.GoogleServiceInfo)
  private static final com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo();
  }

  public static com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GoogleServiceInfo> PARSER =
      new com.google.protobuf.AbstractParser<GoogleServiceInfo>() {
        @java.lang.Override
        public GoogleServiceInfo parsePartialFrom(
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

  public static com.google.protobuf.Parser<GoogleServiceInfo> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GoogleServiceInfo> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.networkmanagement.v1beta1.GoogleServiceInfo getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
