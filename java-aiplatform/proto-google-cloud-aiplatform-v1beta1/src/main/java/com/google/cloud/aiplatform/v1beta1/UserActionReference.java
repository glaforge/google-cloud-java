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
// source: google/cloud/aiplatform/v1beta1/user_action_reference.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * References an API call. It contains more information about long running
 * operation and Jobs that are triggered by the API call.
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.UserActionReference}
 */
public final class UserActionReference extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.UserActionReference)
    UserActionReferenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use UserActionReference.newBuilder() to construct.
  private UserActionReference(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private UserActionReference() {
    method_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new UserActionReference();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.UserActionReferenceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.UserActionReferenceProto
        .internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.UserActionReference.class,
            com.google.cloud.aiplatform.v1beta1.UserActionReference.Builder.class);
  }

  private int referenceCase_ = 0;

  @SuppressWarnings("serial")
  private java.lang.Object reference_;

  public enum ReferenceCase
      implements
          com.google.protobuf.Internal.EnumLite,
          com.google.protobuf.AbstractMessage.InternalOneOfEnum {
    OPERATION(1),
    DATA_LABELING_JOB(2),
    REFERENCE_NOT_SET(0);
    private final int value;

    private ReferenceCase(int value) {
      this.value = value;
    }
    /**
     * @param value The number of the enum to look for.
     * @return The enum associated with the given number.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static ReferenceCase valueOf(int value) {
      return forNumber(value);
    }

    public static ReferenceCase forNumber(int value) {
      switch (value) {
        case 1:
          return OPERATION;
        case 2:
          return DATA_LABELING_JOB;
        case 0:
          return REFERENCE_NOT_SET;
        default:
          return null;
      }
    }

    public int getNumber() {
      return this.value;
    }
  };

  public ReferenceCase getReferenceCase() {
    return ReferenceCase.forNumber(referenceCase_);
  }

  public static final int OPERATION_FIELD_NUMBER = 1;
  /**
   *
   *
   * <pre>
   * For API calls that return a long running operation.
   * Resource name of the long running operation.
   * Format:
   * `projects/{project}/locations/{location}/operations/{operation}`
   * </pre>
   *
   * <code>string operation = 1;</code>
   *
   * @return Whether the operation field is set.
   */
  public boolean hasOperation() {
    return referenceCase_ == 1;
  }
  /**
   *
   *
   * <pre>
   * For API calls that return a long running operation.
   * Resource name of the long running operation.
   * Format:
   * `projects/{project}/locations/{location}/operations/{operation}`
   * </pre>
   *
   * <code>string operation = 1;</code>
   *
   * @return The operation.
   */
  public java.lang.String getOperation() {
    java.lang.Object ref = "";
    if (referenceCase_ == 1) {
      ref = reference_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (referenceCase_ == 1) {
        reference_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * For API calls that return a long running operation.
   * Resource name of the long running operation.
   * Format:
   * `projects/{project}/locations/{location}/operations/{operation}`
   * </pre>
   *
   * <code>string operation = 1;</code>
   *
   * @return The bytes for operation.
   */
  public com.google.protobuf.ByteString getOperationBytes() {
    java.lang.Object ref = "";
    if (referenceCase_ == 1) {
      ref = reference_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (referenceCase_ == 1) {
        reference_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DATA_LABELING_JOB_FIELD_NUMBER = 2;
  /**
   *
   *
   * <pre>
   * For API calls that start a LabelingJob.
   * Resource name of the LabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * </pre>
   *
   * <code>string data_labeling_job = 2;</code>
   *
   * @return Whether the dataLabelingJob field is set.
   */
  public boolean hasDataLabelingJob() {
    return referenceCase_ == 2;
  }
  /**
   *
   *
   * <pre>
   * For API calls that start a LabelingJob.
   * Resource name of the LabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * </pre>
   *
   * <code>string data_labeling_job = 2;</code>
   *
   * @return The dataLabelingJob.
   */
  public java.lang.String getDataLabelingJob() {
    java.lang.Object ref = "";
    if (referenceCase_ == 2) {
      ref = reference_;
    }
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      if (referenceCase_ == 2) {
        reference_ = s;
      }
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * For API calls that start a LabelingJob.
   * Resource name of the LabelingJob.
   * Format:
   * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
   * </pre>
   *
   * <code>string data_labeling_job = 2;</code>
   *
   * @return The bytes for dataLabelingJob.
   */
  public com.google.protobuf.ByteString getDataLabelingJobBytes() {
    java.lang.Object ref = "";
    if (referenceCase_ == 2) {
      ref = reference_;
    }
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      if (referenceCase_ == 2) {
        reference_ = b;
      }
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int METHOD_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object method_ = "";
  /**
   *
   *
   * <pre>
   * The method name of the API RPC call. For example,
   * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
   * </pre>
   *
   * <code>string method = 3;</code>
   *
   * @return The method.
   */
  @java.lang.Override
  public java.lang.String getMethod() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      method_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * The method name of the API RPC call. For example,
   * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
   * </pre>
   *
   * <code>string method = 3;</code>
   *
   * @return The bytes for method.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getMethodBytes() {
    java.lang.Object ref = method_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      method_ = b;
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
    if (referenceCase_ == 1) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, reference_);
    }
    if (referenceCase_ == 2) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, reference_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(method_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, method_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (referenceCase_ == 1) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, reference_);
    }
    if (referenceCase_ == 2) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, reference_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(method_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, method_);
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.UserActionReference)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.UserActionReference other =
        (com.google.cloud.aiplatform.v1beta1.UserActionReference) obj;

    if (!getMethod().equals(other.getMethod())) return false;
    if (!getReferenceCase().equals(other.getReferenceCase())) return false;
    switch (referenceCase_) {
      case 1:
        if (!getOperation().equals(other.getOperation())) return false;
        break;
      case 2:
        if (!getDataLabelingJob().equals(other.getDataLabelingJob())) return false;
        break;
      case 0:
      default:
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
    hash = (37 * hash) + METHOD_FIELD_NUMBER;
    hash = (53 * hash) + getMethod().hashCode();
    switch (referenceCase_) {
      case 1:
        hash = (37 * hash) + OPERATION_FIELD_NUMBER;
        hash = (53 * hash) + getOperation().hashCode();
        break;
      case 2:
        hash = (37 * hash) + DATA_LABELING_JOB_FIELD_NUMBER;
        hash = (53 * hash) + getDataLabelingJob().hashCode();
        break;
      case 0:
      default:
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.UserActionReference prototype) {
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
   * References an API call. It contains more information about long running
   * operation and Jobs that are triggered by the API call.
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.UserActionReference}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.UserActionReference)
      com.google.cloud.aiplatform.v1beta1.UserActionReferenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.UserActionReferenceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.UserActionReferenceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.UserActionReference.class,
              com.google.cloud.aiplatform.v1beta1.UserActionReference.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.UserActionReference.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      method_ = "";
      referenceCase_ = 0;
      reference_ = null;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.UserActionReferenceProto
          .internal_static_google_cloud_aiplatform_v1beta1_UserActionReference_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UserActionReference getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.UserActionReference.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UserActionReference build() {
      com.google.cloud.aiplatform.v1beta1.UserActionReference result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.UserActionReference buildPartial() {
      com.google.cloud.aiplatform.v1beta1.UserActionReference result =
          new com.google.cloud.aiplatform.v1beta1.UserActionReference(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      buildPartialOneofs(result);
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.aiplatform.v1beta1.UserActionReference result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.method_ = method_;
      }
    }

    private void buildPartialOneofs(
        com.google.cloud.aiplatform.v1beta1.UserActionReference result) {
      result.referenceCase_ = referenceCase_;
      result.reference_ = this.reference_;
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.UserActionReference) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.UserActionReference) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.UserActionReference other) {
      if (other == com.google.cloud.aiplatform.v1beta1.UserActionReference.getDefaultInstance())
        return this;
      if (!other.getMethod().isEmpty()) {
        method_ = other.method_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      switch (other.getReferenceCase()) {
        case OPERATION:
          {
            referenceCase_ = 1;
            reference_ = other.reference_;
            onChanged();
            break;
          }
        case DATA_LABELING_JOB:
          {
            referenceCase_ = 2;
            reference_ = other.reference_;
            onChanged();
            break;
          }
        case REFERENCE_NOT_SET:
          {
            break;
          }
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
                java.lang.String s = input.readStringRequireUtf8();
                referenceCase_ = 1;
                reference_ = s;
                break;
              } // case 10
            case 18:
              {
                java.lang.String s = input.readStringRequireUtf8();
                referenceCase_ = 2;
                reference_ = s;
                break;
              } // case 18
            case 26:
              {
                method_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
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

    private int referenceCase_ = 0;
    private java.lang.Object reference_;

    public ReferenceCase getReferenceCase() {
      return ReferenceCase.forNumber(referenceCase_);
    }

    public Builder clearReference() {
      referenceCase_ = 0;
      reference_ = null;
      onChanged();
      return this;
    }

    private int bitField0_;

    /**
     *
     *
     * <pre>
     * For API calls that return a long running operation.
     * Resource name of the long running operation.
     * Format:
     * `projects/{project}/locations/{location}/operations/{operation}`
     * </pre>
     *
     * <code>string operation = 1;</code>
     *
     * @return Whether the operation field is set.
     */
    @java.lang.Override
    public boolean hasOperation() {
      return referenceCase_ == 1;
    }
    /**
     *
     *
     * <pre>
     * For API calls that return a long running operation.
     * Resource name of the long running operation.
     * Format:
     * `projects/{project}/locations/{location}/operations/{operation}`
     * </pre>
     *
     * <code>string operation = 1;</code>
     *
     * @return The operation.
     */
    @java.lang.Override
    public java.lang.String getOperation() {
      java.lang.Object ref = "";
      if (referenceCase_ == 1) {
        ref = reference_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (referenceCase_ == 1) {
          reference_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * For API calls that return a long running operation.
     * Resource name of the long running operation.
     * Format:
     * `projects/{project}/locations/{location}/operations/{operation}`
     * </pre>
     *
     * <code>string operation = 1;</code>
     *
     * @return The bytes for operation.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getOperationBytes() {
      java.lang.Object ref = "";
      if (referenceCase_ == 1) {
        ref = reference_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (referenceCase_ == 1) {
          reference_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * For API calls that return a long running operation.
     * Resource name of the long running operation.
     * Format:
     * `projects/{project}/locations/{location}/operations/{operation}`
     * </pre>
     *
     * <code>string operation = 1;</code>
     *
     * @param value The operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperation(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      referenceCase_ = 1;
      reference_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For API calls that return a long running operation.
     * Resource name of the long running operation.
     * Format:
     * `projects/{project}/locations/{location}/operations/{operation}`
     * </pre>
     *
     * <code>string operation = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOperation() {
      if (referenceCase_ == 1) {
        referenceCase_ = 0;
        reference_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * For API calls that return a long running operation.
     * Resource name of the long running operation.
     * Format:
     * `projects/{project}/locations/{location}/operations/{operation}`
     * </pre>
     *
     * <code>string operation = 1;</code>
     *
     * @param value The bytes for operation to set.
     * @return This builder for chaining.
     */
    public Builder setOperationBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      referenceCase_ = 1;
      reference_ = value;
      onChanged();
      return this;
    }

    /**
     *
     *
     * <pre>
     * For API calls that start a LabelingJob.
     * Resource name of the LabelingJob.
     * Format:
     * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
     * </pre>
     *
     * <code>string data_labeling_job = 2;</code>
     *
     * @return Whether the dataLabelingJob field is set.
     */
    @java.lang.Override
    public boolean hasDataLabelingJob() {
      return referenceCase_ == 2;
    }
    /**
     *
     *
     * <pre>
     * For API calls that start a LabelingJob.
     * Resource name of the LabelingJob.
     * Format:
     * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
     * </pre>
     *
     * <code>string data_labeling_job = 2;</code>
     *
     * @return The dataLabelingJob.
     */
    @java.lang.Override
    public java.lang.String getDataLabelingJob() {
      java.lang.Object ref = "";
      if (referenceCase_ == 2) {
        ref = reference_;
      }
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        if (referenceCase_ == 2) {
          reference_ = s;
        }
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * For API calls that start a LabelingJob.
     * Resource name of the LabelingJob.
     * Format:
     * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
     * </pre>
     *
     * <code>string data_labeling_job = 2;</code>
     *
     * @return The bytes for dataLabelingJob.
     */
    @java.lang.Override
    public com.google.protobuf.ByteString getDataLabelingJobBytes() {
      java.lang.Object ref = "";
      if (referenceCase_ == 2) {
        ref = reference_;
      }
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        if (referenceCase_ == 2) {
          reference_ = b;
        }
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * For API calls that start a LabelingJob.
     * Resource name of the LabelingJob.
     * Format:
     * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
     * </pre>
     *
     * <code>string data_labeling_job = 2;</code>
     *
     * @param value The dataLabelingJob to set.
     * @return This builder for chaining.
     */
    public Builder setDataLabelingJob(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      referenceCase_ = 2;
      reference_ = value;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * For API calls that start a LabelingJob.
     * Resource name of the LabelingJob.
     * Format:
     * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
     * </pre>
     *
     * <code>string data_labeling_job = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDataLabelingJob() {
      if (referenceCase_ == 2) {
        referenceCase_ = 0;
        reference_ = null;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * For API calls that start a LabelingJob.
     * Resource name of the LabelingJob.
     * Format:
     * `projects/{project}/locations/{location}/dataLabelingJobs/{data_labeling_job}`
     * </pre>
     *
     * <code>string data_labeling_job = 2;</code>
     *
     * @param value The bytes for dataLabelingJob to set.
     * @return This builder for chaining.
     */
    public Builder setDataLabelingJobBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      referenceCase_ = 2;
      reference_ = value;
      onChanged();
      return this;
    }

    private java.lang.Object method_ = "";
    /**
     *
     *
     * <pre>
     * The method name of the API RPC call. For example,
     * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
     * </pre>
     *
     * <code>string method = 3;</code>
     *
     * @return The method.
     */
    public java.lang.String getMethod() {
      java.lang.Object ref = method_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        method_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The method name of the API RPC call. For example,
     * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
     * </pre>
     *
     * <code>string method = 3;</code>
     *
     * @return The bytes for method.
     */
    public com.google.protobuf.ByteString getMethodBytes() {
      java.lang.Object ref = method_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        method_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * The method name of the API RPC call. For example,
     * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
     * </pre>
     *
     * <code>string method = 3;</code>
     *
     * @param value The method to set.
     * @return This builder for chaining.
     */
    public Builder setMethod(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      method_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The method name of the API RPC call. For example,
     * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
     * </pre>
     *
     * <code>string method = 3;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearMethod() {
      method_ = getDefaultInstance().getMethod();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The method name of the API RPC call. For example,
     * "/google.cloud.aiplatform.{apiVersion}.DatasetService.CreateDataset"
     * </pre>
     *
     * <code>string method = 3;</code>
     *
     * @param value The bytes for method to set.
     * @return This builder for chaining.
     */
    public Builder setMethodBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      method_ = value;
      bitField0_ |= 0x00000004;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.UserActionReference)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.UserActionReference)
  private static final com.google.cloud.aiplatform.v1beta1.UserActionReference DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.UserActionReference();
  }

  public static com.google.cloud.aiplatform.v1beta1.UserActionReference getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<UserActionReference> PARSER =
      new com.google.protobuf.AbstractParser<UserActionReference>() {
        @java.lang.Override
        public UserActionReference parsePartialFrom(
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

  public static com.google.protobuf.Parser<UserActionReference> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<UserActionReference> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.UserActionReference getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
