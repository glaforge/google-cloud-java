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
// source: google/cloud/aiplatform/v1beta1/vertex_rag_service.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.aiplatform.v1beta1;

/**
 *
 *
 * <pre>
 * Response message for
 * [VertexRagService.RetrieveContexts][google.cloud.aiplatform.v1beta1.VertexRagService.RetrieveContexts].
 * </pre>
 *
 * Protobuf type {@code google.cloud.aiplatform.v1beta1.RetrieveContextsResponse}
 */
public final class RetrieveContextsResponse extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.aiplatform.v1beta1.RetrieveContextsResponse)
    RetrieveContextsResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RetrieveContextsResponse.newBuilder() to construct.
  private RetrieveContextsResponse(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RetrieveContextsResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RetrieveContextsResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.aiplatform.v1beta1.VertexRagServiceProto
        .internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.class,
            com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.Builder.class);
  }

  private int bitField0_;
  public static final int CONTEXTS_FIELD_NUMBER = 1;
  private com.google.cloud.aiplatform.v1beta1.RagContexts contexts_;
  /**
   *
   *
   * <pre>
   * The contexts of the query.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
   *
   * @return Whether the contexts field is set.
   */
  @java.lang.Override
  public boolean hasContexts() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * The contexts of the query.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
   *
   * @return The contexts.
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagContexts getContexts() {
    return contexts_ == null
        ? com.google.cloud.aiplatform.v1beta1.RagContexts.getDefaultInstance()
        : contexts_;
  }
  /**
   *
   *
   * <pre>
   * The contexts of the query.
   * </pre>
   *
   * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RagContextsOrBuilder getContextsOrBuilder() {
    return contexts_ == null
        ? com.google.cloud.aiplatform.v1beta1.RagContexts.getDefaultInstance()
        : contexts_;
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
      output.writeMessage(1, getContexts());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getContexts());
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
    if (!(obj instanceof com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse)) {
      return super.equals(obj);
    }
    com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse other =
        (com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse) obj;

    if (hasContexts() != other.hasContexts()) return false;
    if (hasContexts()) {
      if (!getContexts().equals(other.getContexts())) return false;
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
    if (hasContexts()) {
      hash = (37 * hash) + CONTEXTS_FIELD_NUMBER;
      hash = (53 * hash) + getContexts().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse parseFrom(
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
      com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse prototype) {
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
   * Response message for
   * [VertexRagService.RetrieveContexts][google.cloud.aiplatform.v1beta1.VertexRagService.RetrieveContexts].
   * </pre>
   *
   * Protobuf type {@code google.cloud.aiplatform.v1beta1.RetrieveContextsResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.aiplatform.v1beta1.RetrieveContextsResponse)
      com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.class,
              com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.Builder.class);
    }

    // Construct using com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getContextsFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      contexts_ = null;
      if (contextsBuilder_ != null) {
        contextsBuilder_.dispose();
        contextsBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.aiplatform.v1beta1.VertexRagServiceProto
          .internal_static_google_cloud_aiplatform_v1beta1_RetrieveContextsResponse_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse
        getDefaultInstanceForType() {
      return com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse build() {
      com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse buildPartial() {
      com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse result =
          new com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.contexts_ = contextsBuilder_ == null ? contexts_ : contextsBuilder_.build();
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
      if (other instanceof com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse) {
        return mergeFrom((com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse other) {
      if (other
          == com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse.getDefaultInstance())
        return this;
      if (other.hasContexts()) {
        mergeContexts(other.getContexts());
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
                input.readMessage(getContextsFieldBuilder().getBuilder(), extensionRegistry);
                bitField0_ |= 0x00000001;
                break;
              } // case 10
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

    private com.google.cloud.aiplatform.v1beta1.RagContexts contexts_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RagContexts,
            com.google.cloud.aiplatform.v1beta1.RagContexts.Builder,
            com.google.cloud.aiplatform.v1beta1.RagContextsOrBuilder>
        contextsBuilder_;
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     *
     * @return Whether the contexts field is set.
     */
    public boolean hasContexts() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     *
     * @return The contexts.
     */
    public com.google.cloud.aiplatform.v1beta1.RagContexts getContexts() {
      if (contextsBuilder_ == null) {
        return contexts_ == null
            ? com.google.cloud.aiplatform.v1beta1.RagContexts.getDefaultInstance()
            : contexts_;
      } else {
        return contextsBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    public Builder setContexts(com.google.cloud.aiplatform.v1beta1.RagContexts value) {
      if (contextsBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        contexts_ = value;
      } else {
        contextsBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    public Builder setContexts(
        com.google.cloud.aiplatform.v1beta1.RagContexts.Builder builderForValue) {
      if (contextsBuilder_ == null) {
        contexts_ = builderForValue.build();
      } else {
        contextsBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    public Builder mergeContexts(com.google.cloud.aiplatform.v1beta1.RagContexts value) {
      if (contextsBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && contexts_ != null
            && contexts_ != com.google.cloud.aiplatform.v1beta1.RagContexts.getDefaultInstance()) {
          getContextsBuilder().mergeFrom(value);
        } else {
          contexts_ = value;
        }
      } else {
        contextsBuilder_.mergeFrom(value);
      }
      if (contexts_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    public Builder clearContexts() {
      bitField0_ = (bitField0_ & ~0x00000001);
      contexts_ = null;
      if (contextsBuilder_ != null) {
        contextsBuilder_.dispose();
        contextsBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagContexts.Builder getContextsBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getContextsFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    public com.google.cloud.aiplatform.v1beta1.RagContextsOrBuilder getContextsOrBuilder() {
      if (contextsBuilder_ != null) {
        return contextsBuilder_.getMessageOrBuilder();
      } else {
        return contexts_ == null
            ? com.google.cloud.aiplatform.v1beta1.RagContexts.getDefaultInstance()
            : contexts_;
      }
    }
    /**
     *
     *
     * <pre>
     * The contexts of the query.
     * </pre>
     *
     * <code>.google.cloud.aiplatform.v1beta1.RagContexts contexts = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.aiplatform.v1beta1.RagContexts,
            com.google.cloud.aiplatform.v1beta1.RagContexts.Builder,
            com.google.cloud.aiplatform.v1beta1.RagContextsOrBuilder>
        getContextsFieldBuilder() {
      if (contextsBuilder_ == null) {
        contextsBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.aiplatform.v1beta1.RagContexts,
                com.google.cloud.aiplatform.v1beta1.RagContexts.Builder,
                com.google.cloud.aiplatform.v1beta1.RagContextsOrBuilder>(
                getContexts(), getParentForChildren(), isClean());
        contexts_ = null;
      }
      return contextsBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.aiplatform.v1beta1.RetrieveContextsResponse)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.aiplatform.v1beta1.RetrieveContextsResponse)
  private static final com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse();
  }

  public static com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RetrieveContextsResponse> PARSER =
      new com.google.protobuf.AbstractParser<RetrieveContextsResponse>() {
        @java.lang.Override
        public RetrieveContextsResponse parsePartialFrom(
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

  public static com.google.protobuf.Parser<RetrieveContextsResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RetrieveContextsResponse> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.aiplatform.v1beta1.RetrieveContextsResponse getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
