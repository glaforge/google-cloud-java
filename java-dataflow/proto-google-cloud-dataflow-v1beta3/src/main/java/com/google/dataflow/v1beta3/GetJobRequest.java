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
// source: google/dataflow/v1beta3/jobs.proto

// Protobuf Java Version: 3.25.3
package com.google.dataflow.v1beta3;

/**
 *
 *
 * <pre>
 * Request to get the state of a Cloud Dataflow job.
 * </pre>
 *
 * Protobuf type {@code google.dataflow.v1beta3.GetJobRequest}
 */
public final class GetJobRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.dataflow.v1beta3.GetJobRequest)
    GetJobRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use GetJobRequest.newBuilder() to construct.
  private GetJobRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private GetJobRequest() {
    projectId_ = "";
    jobId_ = "";
    view_ = 0;
    location_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new GetJobRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_GetJobRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.dataflow.v1beta3.JobsProto
        .internal_static_google_dataflow_v1beta3_GetJobRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.dataflow.v1beta3.GetJobRequest.class,
            com.google.dataflow.v1beta3.GetJobRequest.Builder.class);
  }

  public static final int PROJECT_ID_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object projectId_ = "";
  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The projectId.
   */
  @java.lang.Override
  public java.lang.String getProjectId() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      projectId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The ID of the Cloud Platform project that the job belongs to.
   * </pre>
   *
   * <code>string project_id = 1;</code>
   *
   * @return The bytes for projectId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProjectIdBytes() {
    java.lang.Object ref = projectId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      projectId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int JOB_ID_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object jobId_ = "";
  /**
   *
   *
   * <pre>
   * The job ID.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The jobId.
   */
  @java.lang.Override
  public java.lang.String getJobId() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      jobId_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The job ID.
   * </pre>
   *
   * <code>string job_id = 2;</code>
   *
   * @return The bytes for jobId.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getJobIdBytes() {
    java.lang.Object ref = jobId_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      jobId_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int VIEW_FIELD_NUMBER = 3;
  private int view_ = 0;
  /**
   *
   *
   * <pre>
   * The level of information requested in response.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
   *
   * @return The enum numeric value on the wire for view.
   */
  @java.lang.Override
  public int getViewValue() {
    return view_;
  }
  /**
   *
   *
   * <pre>
   * The level of information requested in response.
   * </pre>
   *
   * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
   *
   * @return The view.
   */
  @java.lang.Override
  public com.google.dataflow.v1beta3.JobView getView() {
    com.google.dataflow.v1beta3.JobView result =
        com.google.dataflow.v1beta3.JobView.forNumber(view_);
    return result == null ? com.google.dataflow.v1beta3.JobView.UNRECOGNIZED : result;
  }

  public static final int LOCATION_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object location_ = "";
  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The location.
   */
  @java.lang.Override
  public java.lang.String getLocation() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      location_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The [regional endpoint]
   * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
   * contains this job.
   * </pre>
   *
   * <code>string location = 4;</code>
   *
   * @return The bytes for location.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getLocationBytes() {
    java.lang.Object ref = location_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      location_ = b;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, jobId_);
    }
    if (view_ != com.google.dataflow.v1beta3.JobView.JOB_VIEW_UNKNOWN.getNumber()) {
      output.writeEnum(3, view_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, location_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(projectId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, projectId_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(jobId_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, jobId_);
    }
    if (view_ != com.google.dataflow.v1beta3.JobView.JOB_VIEW_UNKNOWN.getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(3, view_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(location_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, location_);
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
    if (!(obj instanceof com.google.dataflow.v1beta3.GetJobRequest)) {
      return super.equals(obj);
    }
    com.google.dataflow.v1beta3.GetJobRequest other =
        (com.google.dataflow.v1beta3.GetJobRequest) obj;

    if (!getProjectId().equals(other.getProjectId())) return false;
    if (!getJobId().equals(other.getJobId())) return false;
    if (view_ != other.view_) return false;
    if (!getLocation().equals(other.getLocation())) return false;
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
    hash = (37 * hash) + PROJECT_ID_FIELD_NUMBER;
    hash = (53 * hash) + getProjectId().hashCode();
    hash = (37 * hash) + JOB_ID_FIELD_NUMBER;
    hash = (53 * hash) + getJobId().hashCode();
    hash = (37 * hash) + VIEW_FIELD_NUMBER;
    hash = (53 * hash) + view_;
    hash = (37 * hash) + LOCATION_FIELD_NUMBER;
    hash = (53 * hash) + getLocation().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.dataflow.v1beta3.GetJobRequest parseFrom(
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

  public static Builder newBuilder(com.google.dataflow.v1beta3.GetJobRequest prototype) {
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
   * Request to get the state of a Cloud Dataflow job.
   * </pre>
   *
   * Protobuf type {@code google.dataflow.v1beta3.GetJobRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.dataflow.v1beta3.GetJobRequest)
      com.google.dataflow.v1beta3.GetJobRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_GetJobRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_GetJobRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.dataflow.v1beta3.GetJobRequest.class,
              com.google.dataflow.v1beta3.GetJobRequest.Builder.class);
    }

    // Construct using com.google.dataflow.v1beta3.GetJobRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      projectId_ = "";
      jobId_ = "";
      view_ = 0;
      location_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.dataflow.v1beta3.JobsProto
          .internal_static_google_dataflow_v1beta3_GetJobRequest_descriptor;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.GetJobRequest getDefaultInstanceForType() {
      return com.google.dataflow.v1beta3.GetJobRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.GetJobRequest build() {
      com.google.dataflow.v1beta3.GetJobRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.dataflow.v1beta3.GetJobRequest buildPartial() {
      com.google.dataflow.v1beta3.GetJobRequest result =
          new com.google.dataflow.v1beta3.GetJobRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.dataflow.v1beta3.GetJobRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.projectId_ = projectId_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.jobId_ = jobId_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.view_ = view_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.location_ = location_;
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
      if (other instanceof com.google.dataflow.v1beta3.GetJobRequest) {
        return mergeFrom((com.google.dataflow.v1beta3.GetJobRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.dataflow.v1beta3.GetJobRequest other) {
      if (other == com.google.dataflow.v1beta3.GetJobRequest.getDefaultInstance()) return this;
      if (!other.getProjectId().isEmpty()) {
        projectId_ = other.projectId_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getJobId().isEmpty()) {
        jobId_ = other.jobId_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (other.view_ != 0) {
        setViewValue(other.getViewValue());
      }
      if (!other.getLocation().isEmpty()) {
        location_ = other.location_;
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
                projectId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                jobId_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 24:
              {
                view_ = input.readEnum();
                bitField0_ |= 0x00000004;
                break;
              } // case 24
            case 34:
              {
                location_ = input.readStringRequireUtf8();
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

    private java.lang.Object projectId_ = "";
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The projectId.
     */
    public java.lang.String getProjectId() {
      java.lang.Object ref = projectId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        projectId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return The bytes for projectId.
     */
    public com.google.protobuf.ByteString getProjectIdBytes() {
      java.lang.Object ref = projectId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        projectId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProjectId() {
      projectId_ = getDefaultInstance().getProjectId();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The ID of the Cloud Platform project that the job belongs to.
     * </pre>
     *
     * <code>string project_id = 1;</code>
     *
     * @param value The bytes for projectId to set.
     * @return This builder for chaining.
     */
    public Builder setProjectIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      projectId_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object jobId_ = "";
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @return The jobId.
     */
    public java.lang.String getJobId() {
      java.lang.Object ref = jobId_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        jobId_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @return The bytes for jobId.
     */
    public com.google.protobuf.ByteString getJobIdBytes() {
      java.lang.Object ref = jobId_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        jobId_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @param value The jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobId(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      jobId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearJobId() {
      jobId_ = getDefaultInstance().getJobId();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The job ID.
     * </pre>
     *
     * <code>string job_id = 2;</code>
     *
     * @param value The bytes for jobId to set.
     * @return This builder for chaining.
     */
    public Builder setJobIdBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      jobId_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private int view_ = 0;
    /**
     *
     *
     * <pre>
     * The level of information requested in response.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
     *
     * @return The enum numeric value on the wire for view.
     */
    @java.lang.Override
    public int getViewValue() {
      return view_;
    }
    /**
     *
     *
     * <pre>
     * The level of information requested in response.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
     *
     * @param value The enum numeric value on the wire for view to set.
     * @return This builder for chaining.
     */
    public Builder setViewValue(int value) {
      view_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The level of information requested in response.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
     *
     * @return The view.
     */
    @java.lang.Override
    public com.google.dataflow.v1beta3.JobView getView() {
      com.google.dataflow.v1beta3.JobView result =
          com.google.dataflow.v1beta3.JobView.forNumber(view_);
      return result == null ? com.google.dataflow.v1beta3.JobView.UNRECOGNIZED : result;
    }
    /**
     *
     *
     * <pre>
     * The level of information requested in response.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
     *
     * @param value The view to set.
     * @return This builder for chaining.
     */
    public Builder setView(com.google.dataflow.v1beta3.JobView value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000004;
      view_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The level of information requested in response.
     * </pre>
     *
     * <code>.google.dataflow.v1beta3.JobView view = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearView() {
      bitField0_ = (bitField0_ & ~0x00000004);
      view_ = 0;
      onChanged();
      return this;
    }

    private java.lang.Object location_ = "";
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @return The location.
     */
    public java.lang.String getLocation() {
      java.lang.Object ref = location_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        location_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @return The bytes for location.
     */
    public com.google.protobuf.ByteString getLocationBytes() {
      java.lang.Object ref = location_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        location_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @param value The location to set.
     * @return This builder for chaining.
     */
    public Builder setLocation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      location_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearLocation() {
      location_ = getDefaultInstance().getLocation();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The [regional endpoint]
     * (https://cloud.google.com/dataflow/docs/concepts/regional-endpoints) that
     * contains this job.
     * </pre>
     *
     * <code>string location = 4;</code>
     *
     * @param value The bytes for location to set.
     * @return This builder for chaining.
     */
    public Builder setLocationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      location_ = value;
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

    // @@protoc_insertion_point(builder_scope:google.dataflow.v1beta3.GetJobRequest)
  }

  // @@protoc_insertion_point(class_scope:google.dataflow.v1beta3.GetJobRequest)
  private static final com.google.dataflow.v1beta3.GetJobRequest DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.dataflow.v1beta3.GetJobRequest();
  }

  public static com.google.dataflow.v1beta3.GetJobRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<GetJobRequest> PARSER =
      new com.google.protobuf.AbstractParser<GetJobRequest>() {
        @java.lang.Override
        public GetJobRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<GetJobRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<GetJobRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.dataflow.v1beta3.GetJobRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
