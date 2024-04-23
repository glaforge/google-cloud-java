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
// source: google/cloud/dialogflow/v2beta1/knowledge_base.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2beta1;

/**
 *
 *
 * <pre>
 * Request message for
 * [KnowledgeBases.CreateKnowledgeBase][google.cloud.dialogflow.v2beta1.KnowledgeBases.CreateKnowledgeBase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest}
 */
public final class CreateKnowledgeBaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
    CreateKnowledgeBaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use CreateKnowledgeBaseRequest.newBuilder() to construct.
  private CreateKnowledgeBaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private CreateKnowledgeBaseRequest() {
    parent_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new CreateKnowledgeBaseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
        .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
        .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.class,
            com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.Builder.class);
  }

  private int bitField0_;
  public static final int PARENT_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object parent_ = "";
  /**
   *
   *
   * <pre>
   * Required. The project to create a knowledge base for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The parent.
   */
  @java.lang.Override
  public java.lang.String getParent() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      parent_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The project to create a knowledge base for.
   * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
   * </pre>
   *
   * <code>
   * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for parent.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getParentBytes() {
    java.lang.Object ref = parent_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      parent_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int KNOWLEDGE_BASE_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledgeBase_;
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the knowledgeBase field is set.
   */
  @java.lang.Override
  public boolean hasKnowledgeBase() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The knowledgeBase.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase() {
    return knowledgeBase_ == null
        ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
        : knowledgeBase_;
  }
  /**
   *
   *
   * <pre>
   * Required. The knowledge base to create.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder() {
    return knowledgeBase_ == null
        ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
        : knowledgeBase_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getKnowledgeBase());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(parent_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, parent_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getKnowledgeBase());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest other =
        (com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest) obj;

    if (!getParent().equals(other.getParent())) return false;
    if (hasKnowledgeBase() != other.hasKnowledgeBase()) return false;
    if (hasKnowledgeBase()) {
      if (!getKnowledgeBase().equals(other.getKnowledgeBase())) return false;
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
    hash = (37 * hash) + PARENT_FIELD_NUMBER;
    hash = (53 * hash) + getParent().hashCode();
    if (hasKnowledgeBase()) {
      hash = (37 * hash) + KNOWLEDGE_BASE_FIELD_NUMBER;
      hash = (53 * hash) + getKnowledgeBase().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest parseFrom(
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
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest prototype) {
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
   * Request message for
   * [KnowledgeBases.CreateKnowledgeBase][google.cloud.dialogflow.v2beta1.KnowledgeBases.CreateKnowledgeBase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.class,
              com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getKnowledgeBaseFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      parent_ = "";
      knowledgeBase_ = null;
      if (knowledgeBaseBuilder_ != null) {
        knowledgeBaseBuilder_.dispose();
        knowledgeBaseBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2beta1.KnowledgeBaseProto
          .internal_static_google_cloud_dialogflow_v2beta1_CreateKnowledgeBaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest build() {
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest buildPartial() {
      com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest result =
          new com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.parent_ = parent_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.knowledgeBase_ =
            knowledgeBaseBuilder_ == null ? knowledgeBase_ : knowledgeBaseBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest.getDefaultInstance())
        return this;
      if (!other.getParent().isEmpty()) {
        parent_ = other.parent_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasKnowledgeBase()) {
        mergeKnowledgeBase(other.getKnowledgeBase());
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
                parent_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getKnowledgeBaseFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000002;
                break;
              } // case 18
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

    private java.lang.Object parent_ = "";
    /**
     *
     *
     * <pre>
     * Required. The project to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The parent.
     */
    public java.lang.String getParent() {
      java.lang.Object ref = parent_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        parent_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for parent.
     */
    public com.google.protobuf.ByteString getParentBytes() {
      java.lang.Object ref = parent_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        parent_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The project to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The parent to set.
     * @return This builder for chaining.
     */
    public Builder setParent(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearParent() {
      parent_ = getDefaultInstance().getParent();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The project to create a knowledge base for.
     * Format: `projects/&lt;Project ID&gt;/locations/&lt;Location ID&gt;`.
     * </pre>
     *
     * <code>
     * string parent = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for parent to set.
     * @return This builder for chaining.
     */
    public Builder setParentBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      parent_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2beta1.KnowledgeBase knowledgeBase_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>
        knowledgeBaseBuilder_;
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the knowledgeBase field is set.
     */
    public boolean hasKnowledgeBase() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The knowledgeBase.
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase getKnowledgeBase() {
      if (knowledgeBaseBuilder_ == null) {
        return knowledgeBase_ == null
            ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
            : knowledgeBase_;
      } else {
        return knowledgeBaseBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setKnowledgeBase(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBaseBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        knowledgeBase_ = value;
      } else {
        knowledgeBaseBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setKnowledgeBase(
        com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder builderForValue) {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBase_ = builderForValue.build();
      } else {
        knowledgeBaseBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeKnowledgeBase(com.google.cloud.dialogflow.v2beta1.KnowledgeBase value) {
      if (knowledgeBaseBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && knowledgeBase_ != null
            && knowledgeBase_
                != com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()) {
          getKnowledgeBaseBuilder().mergeFrom(value);
        } else {
          knowledgeBase_ = value;
        }
      } else {
        knowledgeBaseBuilder_.mergeFrom(value);
      }
      if (knowledgeBase_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearKnowledgeBase() {
      bitField0_ = (bitField0_ & ~0x00000002);
      knowledgeBase_ = null;
      if (knowledgeBaseBuilder_ != null) {
        knowledgeBaseBuilder_.dispose();
        knowledgeBaseBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder getKnowledgeBaseBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getKnowledgeBaseFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder getKnowledgeBaseOrBuilder() {
      if (knowledgeBaseBuilder_ != null) {
        return knowledgeBaseBuilder_.getMessageOrBuilder();
      } else {
        return knowledgeBase_ == null
            ? com.google.cloud.dialogflow.v2beta1.KnowledgeBase.getDefaultInstance()
            : knowledgeBase_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The knowledge base to create.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2beta1.KnowledgeBase knowledge_base = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder,
            com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>
        getKnowledgeBaseFieldBuilder() {
      if (knowledgeBaseBuilder_ == null) {
        knowledgeBaseBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2beta1.KnowledgeBase,
                com.google.cloud.dialogflow.v2beta1.KnowledgeBase.Builder,
                com.google.cloud.dialogflow.v2beta1.KnowledgeBaseOrBuilder>(
                getKnowledgeBase(), getParentForChildren(), isClean());
        knowledgeBase_ = null;
      }
      return knowledgeBaseBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest)
  private static final com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest();
  }

  public static com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<CreateKnowledgeBaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<CreateKnowledgeBaseRequest>() {
        @java.lang.Override
        public CreateKnowledgeBaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<CreateKnowledgeBaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<CreateKnowledgeBaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2beta1.CreateKnowledgeBaseRequest
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
