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
// source: google/analytics/data/v1beta/data.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.data.v1beta;

/**
 *
 *
 * <pre>
 * The compatibility for a single metric.
 * </pre>
 *
 * Protobuf type {@code google.analytics.data.v1beta.MetricCompatibility}
 */
public final class MetricCompatibility extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.data.v1beta.MetricCompatibility)
    MetricCompatibilityOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MetricCompatibility.newBuilder() to construct.
  private MetricCompatibility(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MetricCompatibility() {
    compatibility_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MetricCompatibility();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.data.v1beta.ReportingApiProto
        .internal_static_google_analytics_data_v1beta_MetricCompatibility_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.data.v1beta.ReportingApiProto
        .internal_static_google_analytics_data_v1beta_MetricCompatibility_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.data.v1beta.MetricCompatibility.class,
            com.google.analytics.data.v1beta.MetricCompatibility.Builder.class);
  }

  private int bitField0_;
  public static final int METRIC_METADATA_FIELD_NUMBER = 1;
  private com.google.analytics.data.v1beta.MetricMetadata metricMetadata_;
  /**
   *
   *
   * <pre>
   * The metric metadata contains the API name for this compatibility
   * information. The metric metadata also contains other helpful information
   * like the UI name and description.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
   *
   * @return Whether the metricMetadata field is set.
   */
  @java.lang.Override
  public boolean hasMetricMetadata() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The metric metadata contains the API name for this compatibility
   * information. The metric metadata also contains other helpful information
   * like the UI name and description.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
   *
   * @return The metricMetadata.
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.MetricMetadata getMetricMetadata() {
    return metricMetadata_ == null
        ? com.google.analytics.data.v1beta.MetricMetadata.getDefaultInstance()
        : metricMetadata_;
  }
  /**
   *
   *
   * <pre>
   * The metric metadata contains the API name for this compatibility
   * information. The metric metadata also contains other helpful information
   * like the UI name and description.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.MetricMetadataOrBuilder getMetricMetadataOrBuilder() {
    return metricMetadata_ == null
        ? com.google.analytics.data.v1beta.MetricMetadata.getDefaultInstance()
        : metricMetadata_;
  }

  public static final int COMPATIBILITY_FIELD_NUMBER = 2;
  private int compatibility_ = 0;
  /**
   *
   *
   * <pre>
   * The compatibility of this metric. If the compatibility is COMPATIBLE,
   * this metric can be successfully added to the report.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
   *
   * @return Whether the compatibility field is set.
   */
  @java.lang.Override
  public boolean hasCompatibility() {
    return ((bitField0_ & 0x00000002) != 0);
  }
  /**
   *
   *
   * <pre>
   * The compatibility of this metric. If the compatibility is COMPATIBLE,
   * this metric can be successfully added to the report.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
   *
   * @return The enum numeric value on the wire for compatibility.
   */
  @java.lang.Override
  public int getCompatibilityValue() {
    return compatibility_;
  }
  /**
   *
   *
   * <pre>
   * The compatibility of this metric. If the compatibility is COMPATIBLE,
   * this metric can be successfully added to the report.
   * </pre>
   *
   * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
   *
   * @return The compatibility.
   */
  @java.lang.Override
  public com.google.analytics.data.v1beta.Compatibility getCompatibility() {
    com.google.analytics.data.v1beta.Compatibility result =
        com.google.analytics.data.v1beta.Compatibility.forNumber(compatibility_);
    return result == null ? com.google.analytics.data.v1beta.Compatibility.UNRECOGNIZED : result;
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
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(1, getMetricMetadata());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      output.writeEnum(2, compatibility_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getMetricMetadata());
    }
    if (((bitField0_ & 0x00000002) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, compatibility_);
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
    if (!(obj instanceof com.google.analytics.data.v1beta.MetricCompatibility)) {
      return super.equals(obj);
    }
    com.google.analytics.data.v1beta.MetricCompatibility other =
        (com.google.analytics.data.v1beta.MetricCompatibility) obj;

    if (hasMetricMetadata() != other.hasMetricMetadata()) return false;
    if (hasMetricMetadata()) {
      if (!getMetricMetadata().equals(other.getMetricMetadata())) return false;
    }
    if (hasCompatibility() != other.hasCompatibility()) return false;
    if (hasCompatibility()) {
      if (compatibility_ != other.compatibility_) return false;
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
    if (hasMetricMetadata()) {
      hash = (37 * hash) + METRIC_METADATA_FIELD_NUMBER;
      hash = (53 * hash) + getMetricMetadata().hashCode();
    }
    if (hasCompatibility()) {
      hash = (37 * hash) + COMPATIBILITY_FIELD_NUMBER;
      hash = (53 * hash) + compatibility_;
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility parseFrom(
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

  public static Builder newBuilder(com.google.analytics.data.v1beta.MetricCompatibility prototype) {
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
   * The compatibility for a single metric.
   * </pre>
   *
   * Protobuf type {@code google.analytics.data.v1beta.MetricCompatibility}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.data.v1beta.MetricCompatibility)
      com.google.analytics.data.v1beta.MetricCompatibilityOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.data.v1beta.ReportingApiProto
          .internal_static_google_analytics_data_v1beta_MetricCompatibility_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.data.v1beta.ReportingApiProto
          .internal_static_google_analytics_data_v1beta_MetricCompatibility_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.data.v1beta.MetricCompatibility.class,
              com.google.analytics.data.v1beta.MetricCompatibility.Builder.class);
    }

    // Construct using com.google.analytics.data.v1beta.MetricCompatibility.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getMetricMetadataFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      metricMetadata_ = null;
      if (metricMetadataBuilder_ != null) {
        metricMetadataBuilder_.dispose();
        metricMetadataBuilder_ = null;
      }
      compatibility_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.data.v1beta.ReportingApiProto
          .internal_static_google_analytics_data_v1beta_MetricCompatibility_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.MetricCompatibility getDefaultInstanceForType() {
      return com.google.analytics.data.v1beta.MetricCompatibility.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.MetricCompatibility build() {
      com.google.analytics.data.v1beta.MetricCompatibility result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.data.v1beta.MetricCompatibility buildPartial() {
      com.google.analytics.data.v1beta.MetricCompatibility result =
          new com.google.analytics.data.v1beta.MetricCompatibility(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.analytics.data.v1beta.MetricCompatibility result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.metricMetadata_ =
            metricMetadataBuilder_ == null ? metricMetadata_ : metricMetadataBuilder_.build();
        to_bitField0_ |= 0x00000001;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.compatibility_ = compatibility_;
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
      if (other instanceof com.google.analytics.data.v1beta.MetricCompatibility) {
        return mergeFrom((com.google.analytics.data.v1beta.MetricCompatibility) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.analytics.data.v1beta.MetricCompatibility other) {
      if (other == com.google.analytics.data.v1beta.MetricCompatibility.getDefaultInstance())
        return this;
      if (other.hasMetricMetadata()) {
        mergeMetricMetadata(other.getMetricMetadata());
      }
      if (other.hasCompatibility()) {
        setCompatibility(other.getCompatibility());
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
                input.readMessage(getMetricMetadataFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 16:
              {
                compatibility_ = input.readEnum();
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

    private com.google.analytics.data.v1beta.MetricMetadata metricMetadata_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1beta.MetricMetadata,
            com.google.analytics.data.v1beta.MetricMetadata.Builder,
            com.google.analytics.data.v1beta.MetricMetadataOrBuilder>
        metricMetadataBuilder_;
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     *
     * @return Whether the metricMetadata field is set.
     */
    public boolean hasMetricMetadata() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     *
     * @return The metricMetadata.
     */
    public com.google.analytics.data.v1beta.MetricMetadata getMetricMetadata() {
      if (metricMetadataBuilder_ == null) {
        return metricMetadata_ == null
            ? com.google.analytics.data.v1beta.MetricMetadata.getDefaultInstance()
            : metricMetadata_;
      } else {
        return metricMetadataBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    public Builder setMetricMetadata(com.google.analytics.data.v1beta.MetricMetadata value) {
      if (metricMetadataBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        metricMetadata_ = value;
      } else {
        metricMetadataBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    public Builder setMetricMetadata(
        com.google.analytics.data.v1beta.MetricMetadata.Builder builderForValue) {
      if (metricMetadataBuilder_ == null) {
        metricMetadata_ = builderForValue.build();
      } else {
        metricMetadataBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    public Builder mergeMetricMetadata(com.google.analytics.data.v1beta.MetricMetadata value) {
      if (metricMetadataBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && metricMetadata_ != null
            && metricMetadata_
                != com.google.analytics.data.v1beta.MetricMetadata.getDefaultInstance()) {
          getMetricMetadataBuilder().mergeFrom(value);
        } else {
          metricMetadata_ = value;
        }
      } else {
        metricMetadataBuilder_.mergeFrom(value);
      }
      if (metricMetadata_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    public Builder clearMetricMetadata() {
      bitField0_ = (bitField0_ & ~0x00000001);
      metricMetadata_ = null;
      if (metricMetadataBuilder_ != null) {
        metricMetadataBuilder_.dispose();
        metricMetadataBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    public com.google.analytics.data.v1beta.MetricMetadata.Builder getMetricMetadataBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getMetricMetadataFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    public com.google.analytics.data.v1beta.MetricMetadataOrBuilder getMetricMetadataOrBuilder() {
      if (metricMetadataBuilder_ != null) {
        return metricMetadataBuilder_.getMessageOrBuilder();
      } else {
        return metricMetadata_ == null
            ? com.google.analytics.data.v1beta.MetricMetadata.getDefaultInstance()
            : metricMetadata_;
      }
    }
    /**
     *
     *
     * <pre>
     * The metric metadata contains the API name for this compatibility
     * information. The metric metadata also contains other helpful information
     * like the UI name and description.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.MetricMetadata metric_metadata = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.analytics.data.v1beta.MetricMetadata,
            com.google.analytics.data.v1beta.MetricMetadata.Builder,
            com.google.analytics.data.v1beta.MetricMetadataOrBuilder>
        getMetricMetadataFieldBuilder() {
      if (metricMetadataBuilder_ == null) {
        metricMetadataBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.analytics.data.v1beta.MetricMetadata,
                com.google.analytics.data.v1beta.MetricMetadata.Builder,
                com.google.analytics.data.v1beta.MetricMetadataOrBuilder>(
                getMetricMetadata(), getParentForChildren(), isClean());
        metricMetadata_ = null;
      }
      return metricMetadataBuilder_;
    }

    private int compatibility_ = 0;
    /**
     *
     *
     * <pre>
     * The compatibility of this metric. If the compatibility is COMPATIBLE,
     * this metric can be successfully added to the report.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
     *
     * @return Whether the compatibility field is set.
     */
    @java.lang.Override
    public boolean hasCompatibility() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * The compatibility of this metric. If the compatibility is COMPATIBLE,
     * this metric can be successfully added to the report.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
     *
     * @return The enum numeric value on the wire for compatibility.
     */
    @java.lang.Override
    public int getCompatibilityValue() {
      return compatibility_;
    }
    /**
     *
     *
     * <pre>
     * The compatibility of this metric. If the compatibility is COMPATIBLE,
     * this metric can be successfully added to the report.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
     *
     * @param value The enum numeric value on the wire for compatibility to set.
     * @return This builder for chaining.
     */
    public Builder setCompatibilityValue(int value) {
      compatibility_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The compatibility of this metric. If the compatibility is COMPATIBLE,
     * this metric can be successfully added to the report.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
     *
     * @return The compatibility.
     */
    @java.lang.Override
    public com.google.analytics.data.v1beta.Compatibility getCompatibility() {
      com.google.analytics.data.v1beta.Compatibility result =
          com.google.analytics.data.v1beta.Compatibility.forNumber(compatibility_);
      return result == null ? com.google.analytics.data.v1beta.Compatibility.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The compatibility of this metric. If the compatibility is COMPATIBLE,
     * this metric can be successfully added to the report.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
     *
     * @param value The compatibility to set.
     * @return This builder for chaining.
     */
    public Builder setCompatibility(com.google.analytics.data.v1beta.Compatibility value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      compatibility_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The compatibility of this metric. If the compatibility is COMPATIBLE,
     * this metric can be successfully added to the report.
     * </pre>
     *
     * <code>optional .google.analytics.data.v1beta.Compatibility compatibility = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCompatibility() {
      bitField0_ = (bitField0_ & ~0x00000002);
      compatibility_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.data.v1beta.MetricCompatibility)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.data.v1beta.MetricCompatibility)
  private static final com.google.analytics.data.v1beta.MetricCompatibility DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.analytics.data.v1beta.MetricCompatibility();
  }

  public static com.google.analytics.data.v1beta.MetricCompatibility getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MetricCompatibility> PARSER =
      new com.google.protobuf.AbstractParser<MetricCompatibility>() {
        @java.lang.Override
        public MetricCompatibility parsePartialFrom(
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

  public static com.google.protobuf.Parser<MetricCompatibility> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MetricCompatibility> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.data.v1beta.MetricCompatibility getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
