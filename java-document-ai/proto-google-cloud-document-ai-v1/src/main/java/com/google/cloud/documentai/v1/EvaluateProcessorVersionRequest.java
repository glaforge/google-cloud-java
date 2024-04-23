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
// source: google/cloud/documentai/v1/document_processor_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.documentai.v1;

/**
 *
 *
 * <pre>
 * Evaluates the given [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] against the supplied documents.
 * </pre>
 *
 * Protobuf type {@code google.cloud.documentai.v1.EvaluateProcessorVersionRequest}
 */
public final class EvaluateProcessorVersionRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.documentai.v1.EvaluateProcessorVersionRequest)
    EvaluateProcessorVersionRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use EvaluateProcessorVersionRequest.newBuilder() to construct.
  private EvaluateProcessorVersionRequest(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private EvaluateProcessorVersionRequest() {
    processorVersion_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new EvaluateProcessorVersionRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_EvaluateProcessorVersionRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.documentai.v1.DocumentAiProcessorService
        .internal_static_google_cloud_documentai_v1_EvaluateProcessorVersionRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.class,
            com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PROCESSOR_VERSION_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object processorVersion_ = "";
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The processorVersion.
   */
  @java.lang.Override
  public java.lang.String getProcessorVersion() {
    java.lang.Object ref = processorVersion_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      processorVersion_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
   * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
   * </pre>
   *
   * <code>
   * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for processorVersion.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getProcessorVersionBytes() {
    java.lang.Object ref = processorVersion_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      processorVersion_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int EVALUATION_DOCUMENTS_FIELD_NUMBER = 3;
  private com.google.cloud.documentai.v1.BatchDocumentsInputConfig evaluationDocuments_;
  /**
   *
   *
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return Whether the evaluationDocuments field is set.
   */
  @java.lang.Override
  public boolean hasEvaluationDocuments() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   *
   * @return The evaluationDocuments.
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.BatchDocumentsInputConfig getEvaluationDocuments() {
    return evaluationDocuments_ == null
        ? com.google.cloud.documentai.v1.BatchDocumentsInputConfig.getDefaultInstance()
        : evaluationDocuments_;
  }
  /**
   *
   *
   * <pre>
   * Optional. The documents used in the evaluation. If unspecified, use the processor's
   * dataset as evaluation input.
   * </pre>
   *
   * <code>
   * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder
      getEvaluationDocumentsOrBuilder() {
    return evaluationDocuments_ == null
        ? com.google.cloud.documentai.v1.BatchDocumentsInputConfig.getDefaultInstance()
        : evaluationDocuments_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorVersion_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, processorVersion_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(3, getEvaluationDocuments());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(processorVersion_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, processorVersion_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(3, getEvaluationDocuments());
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
    if (!(obj instanceof com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest other =
        (com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest) obj;

    if (!getProcessorVersion().equals(other.getProcessorVersion())) return false;
    if (hasEvaluationDocuments() != other.hasEvaluationDocuments()) return false;
    if (hasEvaluationDocuments()) {
      if (!getEvaluationDocuments().equals(other.getEvaluationDocuments())) return false;
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
    hash = (37 * hash) + PROCESSOR_VERSION_FIELD_NUMBER;
    hash = (53 * hash) + getProcessorVersion().hashCode();
    if (hasEvaluationDocuments()) {
      hash = (37 * hash) + EVALUATION_DOCUMENTS_FIELD_NUMBER;
      hash = (53 * hash) + getEvaluationDocuments().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest parseFrom(
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
      com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest prototype) {
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
   * Evaluates the given [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] against the supplied documents.
   * </pre>
   *
   * Protobuf type {@code google.cloud.documentai.v1.EvaluateProcessorVersionRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.documentai.v1.EvaluateProcessorVersionRequest)
      com.google.cloud.documentai.v1.EvaluateProcessorVersionRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_EvaluateProcessorVersionRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_EvaluateProcessorVersionRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.class,
              com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.Builder.class);
    }

    // Construct using com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getEvaluationDocumentsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      processorVersion_ = "";
      evaluationDocuments_ = null;
      if (evaluationDocumentsBuilder_ != null) {
        evaluationDocumentsBuilder_.dispose();
        evaluationDocumentsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.documentai.v1.DocumentAiProcessorService
          .internal_static_google_cloud_documentai_v1_EvaluateProcessorVersionRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest
        getDefaultInstanceForType() {
      return com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest build() {
      com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest buildPartial() {
      com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest result =
          new com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.processorVersion_ = processorVersion_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.evaluationDocuments_ =
            evaluationDocumentsBuilder_ == null
                ? evaluationDocuments_
                : evaluationDocumentsBuilder_.build();
        to_bitField0_ |= 0x00000001;
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
      if (other instanceof com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest) {
        return mergeFrom((com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest other) {
      if (other
          == com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest.getDefaultInstance())
        return this;
      if (!other.getProcessorVersion().isEmpty()) {
        processorVersion_ = other.processorVersion_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasEvaluationDocuments()) {
        mergeEvaluationDocuments(other.getEvaluationDocuments());
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
                processorVersion_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 26:
              {
                input.readMessage(
                    getEvaluationDocumentsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
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

    private int bitField0_;

    private java.lang.Object processorVersion_ = "";
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>
     * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The processorVersion.
     */
    public java.lang.String getProcessorVersion() {
      java.lang.Object ref = processorVersion_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        processorVersion_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>
     * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for processorVersion.
     */
    public com.google.protobuf.ByteString getProcessorVersionBytes() {
      java.lang.Object ref = processorVersion_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        processorVersion_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>
     * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The processorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorVersion(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      processorVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>
     * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearProcessorVersion() {
      processorVersion_ = getDefaultInstance().getProcessorVersion();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The resource name of the [ProcessorVersion][google.cloud.documentai.v1.ProcessorVersion] to evaluate.
     * `projects/{project}/locations/{location}/processors/{processor}/processorVersions/{processorVersion}`
     * </pre>
     *
     * <code>
     * string processor_version = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for processorVersion to set.
     * @return This builder for chaining.
     */
    public Builder setProcessorVersionBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      processorVersion_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.documentai.v1.BatchDocumentsInputConfig evaluationDocuments_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.BatchDocumentsInputConfig,
            com.google.cloud.documentai.v1.BatchDocumentsInputConfig.Builder,
            com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder>
        evaluationDocumentsBuilder_;
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return Whether the evaluationDocuments field is set.
     */
    public boolean hasEvaluationDocuments() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     *
     * @return The evaluationDocuments.
     */
    public com.google.cloud.documentai.v1.BatchDocumentsInputConfig getEvaluationDocuments() {
      if (evaluationDocumentsBuilder_ == null) {
        return evaluationDocuments_ == null
            ? com.google.cloud.documentai.v1.BatchDocumentsInputConfig.getDefaultInstance()
            : evaluationDocuments_;
      } else {
        return evaluationDocumentsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setEvaluationDocuments(
        com.google.cloud.documentai.v1.BatchDocumentsInputConfig value) {
      if (evaluationDocumentsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        evaluationDocuments_ = value;
      } else {
        evaluationDocumentsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder setEvaluationDocuments(
        com.google.cloud.documentai.v1.BatchDocumentsInputConfig.Builder builderForValue) {
      if (evaluationDocumentsBuilder_ == null) {
        evaluationDocuments_ = builderForValue.build();
      } else {
        evaluationDocumentsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder mergeEvaluationDocuments(
        com.google.cloud.documentai.v1.BatchDocumentsInputConfig value) {
      if (evaluationDocumentsBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && evaluationDocuments_ != null
            && evaluationDocuments_
                != com.google.cloud.documentai.v1.BatchDocumentsInputConfig.getDefaultInstance()) {
          getEvaluationDocumentsBuilder().mergeFrom(value);
        } else {
          evaluationDocuments_ = value;
        }
      } else {
        evaluationDocumentsBuilder_.mergeFrom(value);
      }
      if (evaluationDocuments_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public Builder clearEvaluationDocuments() {
      bitField0_ = (bitField0_ & ~0x00000002);
      evaluationDocuments_ = null;
      if (evaluationDocumentsBuilder_ != null) {
        evaluationDocumentsBuilder_.dispose();
        evaluationDocumentsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.documentai.v1.BatchDocumentsInputConfig.Builder
        getEvaluationDocumentsBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getEvaluationDocumentsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    public com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder
        getEvaluationDocumentsOrBuilder() {
      if (evaluationDocumentsBuilder_ != null) {
        return evaluationDocumentsBuilder_.getMessageOrBuilder();
      } else {
        return evaluationDocuments_ == null
            ? com.google.cloud.documentai.v1.BatchDocumentsInputConfig.getDefaultInstance()
            : evaluationDocuments_;
      }
    }
    /**
     *
     *
     * <pre>
     * Optional. The documents used in the evaluation. If unspecified, use the processor's
     * dataset as evaluation input.
     * </pre>
     *
     * <code>
     * .google.cloud.documentai.v1.BatchDocumentsInputConfig evaluation_documents = 3 [(.google.api.field_behavior) = OPTIONAL];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.documentai.v1.BatchDocumentsInputConfig,
            com.google.cloud.documentai.v1.BatchDocumentsInputConfig.Builder,
            com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder>
        getEvaluationDocumentsFieldBuilder() {
      if (evaluationDocumentsBuilder_ == null) {
        evaluationDocumentsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.documentai.v1.BatchDocumentsInputConfig,
                com.google.cloud.documentai.v1.BatchDocumentsInputConfig.Builder,
                com.google.cloud.documentai.v1.BatchDocumentsInputConfigOrBuilder>(
                getEvaluationDocuments(), getParentForChildren(), isClean());
        evaluationDocuments_ = null;
      }
      return evaluationDocumentsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.documentai.v1.EvaluateProcessorVersionRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.documentai.v1.EvaluateProcessorVersionRequest)
  private static final com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest();
  }

  public static com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<EvaluateProcessorVersionRequest> PARSER =
      new com.google.protobuf.AbstractParser<EvaluateProcessorVersionRequest>() {
        @java.lang.Override
        public EvaluateProcessorVersionRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<EvaluateProcessorVersionRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<EvaluateProcessorVersionRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.documentai.v1.EvaluateProcessorVersionRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
