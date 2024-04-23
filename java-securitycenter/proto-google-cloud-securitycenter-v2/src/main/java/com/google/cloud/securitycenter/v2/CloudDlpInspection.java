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
// source: google/cloud/securitycenter/v2/cloud_dlp_inspection.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.securitycenter.v2;

/**
 *
 *
 * <pre>
 * Details about the Cloud Data Loss Prevention (Cloud DLP) [inspection
 * job](https://cloud.google.com/dlp/docs/concepts-job-triggers) that produced
 * the finding.
 * </pre>
 *
 * Protobuf type {@code google.cloud.securitycenter.v2.CloudDlpInspection}
 */
public final class CloudDlpInspection extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.securitycenter.v2.CloudDlpInspection)
    CloudDlpInspectionOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CloudDlpInspection.newBuilder() to construct.
  private CloudDlpInspection(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CloudDlpInspection() {
    inspectJob_ = "";
    infoType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CloudDlpInspection();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.securitycenter.v2.CloudDlpInspectionProto
        .internal_static_google_cloud_securitycenter_v2_CloudDlpInspection_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.securitycenter.v2.CloudDlpInspectionProto
        .internal_static_google_cloud_securitycenter_v2_CloudDlpInspection_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.securitycenter.v2.CloudDlpInspection.class,
            com.google.cloud.securitycenter.v2.CloudDlpInspection.Builder.class);
  }

  public static final int INSPECT_JOB_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object inspectJob_ = "";
  /**
   *
   *
   * <pre>
   * Name of the inspection job, for example,
   * `projects/123/locations/europe/dlpJobs/i-8383929`.
   * </pre>
   *
   * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The inspectJob.
   */
  @java.lang.Override
  public java.lang.String getInspectJob() {
    java.lang.Object ref = inspectJob_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      inspectJob_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Name of the inspection job, for example,
   * `projects/123/locations/europe/dlpJobs/i-8383929`.
   * </pre>
   *
   * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
   *
   * @return The bytes for inspectJob.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInspectJobBytes() {
    java.lang.Object ref = inspectJob_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      inspectJob_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_TYPE_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object infoType_ = "";
  /**
   *
   *
   * <pre>
   * The type of information (or
   * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
   * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * </pre>
   *
   * <code>string info_type = 2;</code>
   *
   * @return The infoType.
   */
  @java.lang.Override
  public java.lang.String getInfoType() {
    java.lang.Object ref = infoType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      infoType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The type of information (or
   * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
   * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
   * </pre>
   *
   * <code>string info_type = 2;</code>
   *
   * @return The bytes for infoType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getInfoTypeBytes() {
    java.lang.Object ref = infoType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      infoType_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INFO_TYPE_COUNT_FIELD_NUMBER = 3;
  private long infoTypeCount_ = 0L;
  /**
   *
   *
   * <pre>
   * The number of times Cloud DLP found this infoType within this job
   * and resource.
   * </pre>
   *
   * <code>int64 info_type_count = 3;</code>
   *
   * @return The infoTypeCount.
   */
  @java.lang.Override
  public long getInfoTypeCount() {
    return infoTypeCount_;
  }

  public static final int FULL_SCAN_FIELD_NUMBER = 4;
  private boolean fullScan_ = false;
  /**
   *
   *
   * <pre>
   * Whether Cloud DLP scanned the complete resource or a sampled subset.
   * </pre>
   *
   * <code>bool full_scan = 4;</code>
   *
   * @return The fullScan.
   */
  @java.lang.Override
  public boolean getFullScan() {
    return fullScan_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inspectJob_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, inspectJob_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(infoType_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, infoType_);
    }
    if (infoTypeCount_ != 0L) {
      output.writeInt64(3, infoTypeCount_);
    }
    if (fullScan_ != false) {
      output.writeBool(4, fullScan_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(inspectJob_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, inspectJob_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(infoType_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, infoType_);
    }
    if (infoTypeCount_ != 0L) {
      size += com.google.protobuf.CodedOutputStream.computeInt64Size(3, infoTypeCount_);
    }
    if (fullScan_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(4, fullScan_);
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
    if (!(obj instanceof com.google.cloud.securitycenter.v2.CloudDlpInspection)) {
      return super.equals(obj);
    }
    com.google.cloud.securitycenter.v2.CloudDlpInspection other =
        (com.google.cloud.securitycenter.v2.CloudDlpInspection) obj;

    if (!getInspectJob().equals(other.getInspectJob())) return false;
    if (!getInfoType().equals(other.getInfoType())) return false;
    if (getInfoTypeCount() != other.getInfoTypeCount()) return false;
    if (getFullScan() != other.getFullScan()) return false;
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
    hash = (37 * hash) + INSPECT_JOB_FIELD_NUMBER;
    hash = (53 * hash) + getInspectJob().hashCode();
    hash = (37 * hash) + INFO_TYPE_FIELD_NUMBER;
    hash = (53 * hash) + getInfoType().hashCode();
    hash = (37 * hash) + INFO_TYPE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashLong(getInfoTypeCount());
    hash = (37 * hash) + FULL_SCAN_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getFullScan());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection parseFrom(
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
      com.google.cloud.securitycenter.v2.CloudDlpInspection prototype) {
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
   * Details about the Cloud Data Loss Prevention (Cloud DLP) [inspection
   * job](https://cloud.google.com/dlp/docs/concepts-job-triggers) that produced
   * the finding.
   * </pre>
   *
   * Protobuf type {@code google.cloud.securitycenter.v2.CloudDlpInspection}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.securitycenter.v2.CloudDlpInspection)
      com.google.cloud.securitycenter.v2.CloudDlpInspectionOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.securitycenter.v2.CloudDlpInspectionProto
          .internal_static_google_cloud_securitycenter_v2_CloudDlpInspection_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.securitycenter.v2.CloudDlpInspectionProto
          .internal_static_google_cloud_securitycenter_v2_CloudDlpInspection_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.securitycenter.v2.CloudDlpInspection.class,
              com.google.cloud.securitycenter.v2.CloudDlpInspection.Builder.class);
    }

    // Construct using com.google.cloud.securitycenter.v2.CloudDlpInspection.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      inspectJob_ = "";
      infoType_ = "";
      infoTypeCount_ = 0L;
      fullScan_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.securitycenter.v2.CloudDlpInspectionProto
          .internal_static_google_cloud_securitycenter_v2_CloudDlpInspection_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.CloudDlpInspection getDefaultInstanceForType() {
      return com.google.cloud.securitycenter.v2.CloudDlpInspection.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.CloudDlpInspection build() {
      com.google.cloud.securitycenter.v2.CloudDlpInspection result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.securitycenter.v2.CloudDlpInspection buildPartial() {
      com.google.cloud.securitycenter.v2.CloudDlpInspection result =
          new com.google.cloud.securitycenter.v2.CloudDlpInspection(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.securitycenter.v2.CloudDlpInspection result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.inspectJob_ = inspectJob_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.infoType_ = infoType_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.infoTypeCount_ = infoTypeCount_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.fullScan_ = fullScan_;
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
      if (other instanceof com.google.cloud.securitycenter.v2.CloudDlpInspection) {
        return mergeFrom((com.google.cloud.securitycenter.v2.CloudDlpInspection) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.securitycenter.v2.CloudDlpInspection other) {
      if (other == com.google.cloud.securitycenter.v2.CloudDlpInspection.getDefaultInstance())
        return this;
      if (!other.getInspectJob().isEmpty()) {
        inspectJob_ = other.inspectJob_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getInfoType().isEmpty()) {
        infoType_ = other.infoType_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.getInfoTypeCount() != 0L) {
        setInfoTypeCount(other.getInfoTypeCount());
      }
      if (other.getFullScan() != false) {
        setFullScan(other.getFullScan());
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
                inspectJob_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                infoType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                infoTypeCount_ = input.readInt64();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 32:
              {
                fullScan_ = input.readBool();
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

    private java.lang.Object inspectJob_ = "";
    /**
     *
     *
     * <pre>
     * Name of the inspection job, for example,
     * `projects/123/locations/europe/dlpJobs/i-8383929`.
     * </pre>
     *
     * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The inspectJob.
     */
    public java.lang.String getInspectJob() {
      java.lang.Object ref = inspectJob_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        inspectJob_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the inspection job, for example,
     * `projects/123/locations/europe/dlpJobs/i-8383929`.
     * </pre>
     *
     * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return The bytes for inspectJob.
     */
    public com.google.protobuf.ByteString getInspectJobBytes() {
      java.lang.Object ref = inspectJob_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        inspectJob_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Name of the inspection job, for example,
     * `projects/123/locations/europe/dlpJobs/i-8383929`.
     * </pre>
     *
     * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The inspectJob to set.
     * @return This builder for chaining.
     */
    public Builder setInspectJob(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      inspectJob_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the inspection job, for example,
     * `projects/123/locations/europe/dlpJobs/i-8383929`.
     * </pre>
     *
     * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInspectJob() {
      inspectJob_ = getDefaultInstance().getInspectJob();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Name of the inspection job, for example,
     * `projects/123/locations/europe/dlpJobs/i-8383929`.
     * </pre>
     *
     * <code>string inspect_job = 1 [(.google.api.resource_reference) = { ... }</code>
     *
     * @param value The bytes for inspectJob to set.
     * @return This builder for chaining.
     */
    public Builder setInspectJobBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      inspectJob_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object infoType_ = "";
    /**
     *
     *
     * <pre>
     * The type of information (or
     * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
     * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
     * </pre>
     *
     * <code>string info_type = 2;</code>
     *
     * @return The infoType.
     */
    public java.lang.String getInfoType() {
      java.lang.Object ref = infoType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        infoType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of information (or
     * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
     * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
     * </pre>
     *
     * <code>string info_type = 2;</code>
     *
     * @return The bytes for infoType.
     */
    public com.google.protobuf.ByteString getInfoTypeBytes() {
      java.lang.Object ref = infoType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        infoType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of information (or
     * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
     * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
     * </pre>
     *
     * <code>string info_type = 2;</code>
     *
     * @param value The infoType to set.
     * @return This builder for chaining.
     */
    public Builder setInfoType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      infoType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of information (or
     * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
     * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
     * </pre>
     *
     * <code>string info_type = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInfoType() {
      infoType_ = getDefaultInstance().getInfoType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of information (or
     * *[infoType](https://cloud.google.com/dlp/docs/infotypes-reference)*) found,
     * for example, `EMAIL_ADDRESS` or `STREET_ADDRESS`.
     * </pre>
     *
     * <code>string info_type = 2;</code>
     *
     * @param value The bytes for infoType to set.
     * @return This builder for chaining.
     */
    public Builder setInfoTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      infoType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private long infoTypeCount_;
    /**
     *
     *
     * <pre>
     * The number of times Cloud DLP found this infoType within this job
     * and resource.
     * </pre>
     *
     * <code>int64 info_type_count = 3;</code>
     *
     * @return The infoTypeCount.
     */
    @java.lang.Override
    public long getInfoTypeCount() {
      return infoTypeCount_;
    }
    /**
     *
     *
     * <pre>
     * The number of times Cloud DLP found this infoType within this job
     * and resource.
     * </pre>
     *
     * <code>int64 info_type_count = 3;</code>
     *
     * @param value The infoTypeCount to set.
     * @return This builder for chaining.
     */
    public Builder setInfoTypeCount(long value) {

      infoTypeCount_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The number of times Cloud DLP found this infoType within this job
     * and resource.
     * </pre>
     *
     * <code>int64 info_type_count = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearInfoTypeCount() {
      bitField0_ = (bitField0_ & ~0x00000004);
      infoTypeCount_ = 0L;
      onChanged();
      return this;
    }

    private boolean fullScan_;
    /**
     *
     *
     * <pre>
     * Whether Cloud DLP scanned the complete resource or a sampled subset.
     * </pre>
     *
     * <code>bool full_scan = 4;</code>
     *
     * @return The fullScan.
     */
    @java.lang.Override
    public boolean getFullScan() {
      return fullScan_;
    }
    /**
     *
     *
     * <pre>
     * Whether Cloud DLP scanned the complete resource or a sampled subset.
     * </pre>
     *
     * <code>bool full_scan = 4;</code>
     *
     * @param value The fullScan to set.
     * @return This builder for chaining.
     */
    public Builder setFullScan(boolean value) {

      fullScan_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether Cloud DLP scanned the complete resource or a sampled subset.
     * </pre>
     *
     * <code>bool full_scan = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFullScan() {
      bitField0_ = (bitField0_ & ~0x00000008);
      fullScan_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.securitycenter.v2.CloudDlpInspection)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.securitycenter.v2.CloudDlpInspection)
  private static final com.google.cloud.securitycenter.v2.CloudDlpInspection DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.securitycenter.v2.CloudDlpInspection();
  }

  public static com.google.cloud.securitycenter.v2.CloudDlpInspection getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CloudDlpInspection> PARSER =
      new com.google.protobuf.AbstractParser<CloudDlpInspection>() {
        @java.lang.Override
        public CloudDlpInspection parsePartialFrom(
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

  public static com.google.protobuf.Parser<CloudDlpInspection> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CloudDlpInspection> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.securitycenter.v2.CloudDlpInspection getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
