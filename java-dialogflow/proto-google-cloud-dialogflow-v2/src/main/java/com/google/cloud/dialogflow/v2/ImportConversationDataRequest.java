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
// source: google/cloud/dialogflow/v2/conversation_dataset.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.dialogflow.v2;

/**
 *
 *
 * <pre>
 * The request message for
 * [ConversationDatasets.ImportConversationData][google.cloud.dialogflow.v2.ConversationDatasets.ImportConversationData].
 * </pre>
 *
 * Protobuf type {@code google.cloud.dialogflow.v2.ImportConversationDataRequest}
 */
public final class ImportConversationDataRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.dialogflow.v2.ImportConversationDataRequest)
    ImportConversationDataRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ImportConversationDataRequest.newBuilder() to construct.
  private ImportConversationDataRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ImportConversationDataRequest() {
    name_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ImportConversationDataRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.dialogflow.v2.ConversationDatasetProto
        .internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.dialogflow.v2.ImportConversationDataRequest.class,
            com.google.cloud.dialogflow.v2.ImportConversationDataRequest.Builder.class);
  }

  private int bitField0_;
  public static final int NAME_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object name_ = "";
  /**
   *
   *
   * <pre>
   * Required. Dataset resource name. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The name.
   */
  @java.lang.Override
  public java.lang.String getName() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      name_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. Dataset resource name. Format:
   * `projects/&lt;Project ID&gt;/locations/&lt;Location
   * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
   * </pre>
   *
   * <code>
   * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for name.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getNameBytes() {
    java.lang.Object ref = name_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      name_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int INPUT_CONFIG_FIELD_NUMBER = 2;
  private com.google.cloud.dialogflow.v2.InputConfig inputConfig_;
  /**
   *
   *
   * <pre>
   * Required. Configuration describing where to import data from.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return Whether the inputConfig field is set.
   */
  @java.lang.Override
  public boolean hasInputConfig() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Required. Configuration describing where to import data from.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   *
   * @return The inputConfig.
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.InputConfig getInputConfig() {
    return inputConfig_ == null
        ? com.google.cloud.dialogflow.v2.InputConfig.getDefaultInstance()
        : inputConfig_;
  }
  /**
   *
   *
   * <pre>
   * Required. Configuration describing where to import data from.
   * </pre>
   *
   * <code>
   * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
   * </code>
   */
  @java.lang.Override
  public com.google.cloud.dialogflow.v2.InputConfigOrBuilder getInputConfigOrBuilder() {
    return inputConfig_ == null
        ? com.google.cloud.dialogflow.v2.InputConfig.getDefaultInstance()
        : inputConfig_;
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      output.writeMessage(2, getInputConfig());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(name_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, name_);
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(2, getInputConfig());
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
    if (!(obj instanceof com.google.cloud.dialogflow.v2.ImportConversationDataRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.dialogflow.v2.ImportConversationDataRequest other =
        (com.google.cloud.dialogflow.v2.ImportConversationDataRequest) obj;

    if (!getName().equals(other.getName())) return false;
    if (hasInputConfig() != other.hasInputConfig()) return false;
    if (hasInputConfig()) {
      if (!getInputConfig().equals(other.getInputConfig())) return false;
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
    hash = (37 * hash) + NAME_FIELD_NUMBER;
    hash = (53 * hash) + getName().hashCode();
    if (hasInputConfig()) {
      hash = (37 * hash) + INPUT_CONFIG_FIELD_NUMBER;
      hash = (53 * hash) + getInputConfig().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest parseFrom(
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
      com.google.cloud.dialogflow.v2.ImportConversationDataRequest prototype) {
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
   * The request message for
   * [ConversationDatasets.ImportConversationData][google.cloud.dialogflow.v2.ConversationDatasets.ImportConversationData].
   * </pre>
   *
   * Protobuf type {@code google.cloud.dialogflow.v2.ImportConversationDataRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.dialogflow.v2.ImportConversationDataRequest)
      com.google.cloud.dialogflow.v2.ImportConversationDataRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.dialogflow.v2.ImportConversationDataRequest.class,
              com.google.cloud.dialogflow.v2.ImportConversationDataRequest.Builder.class);
    }

    // Construct using com.google.cloud.dialogflow.v2.ImportConversationDataRequest.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getInputConfigFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      name_ = "";
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.dialogflow.v2.ConversationDatasetProto
          .internal_static_google_cloud_dialogflow_v2_ImportConversationDataRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ImportConversationDataRequest
        getDefaultInstanceForType() {
      return com.google.cloud.dialogflow.v2.ImportConversationDataRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ImportConversationDataRequest build() {
      com.google.cloud.dialogflow.v2.ImportConversationDataRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.dialogflow.v2.ImportConversationDataRequest buildPartial() {
      com.google.cloud.dialogflow.v2.ImportConversationDataRequest result =
          new com.google.cloud.dialogflow.v2.ImportConversationDataRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.dialogflow.v2.ImportConversationDataRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.name_ = name_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.inputConfig_ =
            inputConfigBuilder_ == null ? inputConfig_ : inputConfigBuilder_.build();
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
      if (other instanceof com.google.cloud.dialogflow.v2.ImportConversationDataRequest) {
        return mergeFrom((com.google.cloud.dialogflow.v2.ImportConversationDataRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.dialogflow.v2.ImportConversationDataRequest other) {
      if (other
          == com.google.cloud.dialogflow.v2.ImportConversationDataRequest.getDefaultInstance())
        return this;
      if (!other.getName().isEmpty()) {
        name_ = other.name_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (other.hasInputConfig()) {
        mergeInputConfig(other.getInputConfig());
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
                name_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                input.readMessage(getInputConfigFieldBuilder().getBuilder(), extensionRegistry);
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

    private java.lang.Object name_ = "";
    /**
     *
     *
     * <pre>
     * Required. Dataset resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The name.
     */
    public java.lang.String getName() {
      java.lang.Object ref = name_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        name_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for name.
     */
    public com.google.protobuf.ByteString getNameBytes() {
      java.lang.Object ref = name_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        name_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The name to set.
     * @return This builder for chaining.
     */
    public Builder setName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearName() {
      name_ = getDefaultInstance().getName();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Dataset resource name. Format:
     * `projects/&lt;Project ID&gt;/locations/&lt;Location
     * ID&gt;/conversationDatasets/&lt;Conversation Dataset ID&gt;`
     * </pre>
     *
     * <code>
     * string name = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for name to set.
     * @return This builder for chaining.
     */
    public Builder setNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      name_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private com.google.cloud.dialogflow.v2.InputConfig inputConfig_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.InputConfig,
            com.google.cloud.dialogflow.v2.InputConfig.Builder,
            com.google.cloud.dialogflow.v2.InputConfigOrBuilder>
        inputConfigBuilder_;
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return Whether the inputConfig field is set.
     */
    public boolean hasInputConfig() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     *
     * @return The inputConfig.
     */
    public com.google.cloud.dialogflow.v2.InputConfig getInputConfig() {
      if (inputConfigBuilder_ == null) {
        return inputConfig_ == null
            ? com.google.cloud.dialogflow.v2.InputConfig.getDefaultInstance()
            : inputConfig_;
      } else {
        return inputConfigBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInputConfig(com.google.cloud.dialogflow.v2.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        inputConfig_ = value;
      } else {
        inputConfigBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder setInputConfig(
        com.google.cloud.dialogflow.v2.InputConfig.Builder builderForValue) {
      if (inputConfigBuilder_ == null) {
        inputConfig_ = builderForValue.build();
      } else {
        inputConfigBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder mergeInputConfig(com.google.cloud.dialogflow.v2.InputConfig value) {
      if (inputConfigBuilder_ == null) {
        if (((bitField0_ & 0x00000002) != 0)
            && inputConfig_ != null
            && inputConfig_ != com.google.cloud.dialogflow.v2.InputConfig.getDefaultInstance()) {
          getInputConfigBuilder().mergeFrom(value);
        } else {
          inputConfig_ = value;
        }
      } else {
        inputConfigBuilder_.mergeFrom(value);
      }
      if (inputConfig_ != null) {
        bitField0_ |= 0x00000002;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public Builder clearInputConfig() {
      bitField0_ = (bitField0_ & ~0x00000002);
      inputConfig_ = null;
      if (inputConfigBuilder_ != null) {
        inputConfigBuilder_.dispose();
        inputConfigBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.InputConfig.Builder getInputConfigBuilder() {
      bitField0_ |= 0x00000002;
      onChanged();
      return getInputConfigFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    public com.google.cloud.dialogflow.v2.InputConfigOrBuilder getInputConfigOrBuilder() {
      if (inputConfigBuilder_ != null) {
        return inputConfigBuilder_.getMessageOrBuilder();
      } else {
        return inputConfig_ == null
            ? com.google.cloud.dialogflow.v2.InputConfig.getDefaultInstance()
            : inputConfig_;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. Configuration describing where to import data from.
     * </pre>
     *
     * <code>
     * .google.cloud.dialogflow.v2.InputConfig input_config = 2 [(.google.api.field_behavior) = REQUIRED];
     * </code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.dialogflow.v2.InputConfig,
            com.google.cloud.dialogflow.v2.InputConfig.Builder,
            com.google.cloud.dialogflow.v2.InputConfigOrBuilder>
        getInputConfigFieldBuilder() {
      if (inputConfigBuilder_ == null) {
        inputConfigBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.dialogflow.v2.InputConfig,
                com.google.cloud.dialogflow.v2.InputConfig.Builder,
                com.google.cloud.dialogflow.v2.InputConfigOrBuilder>(
                getInputConfig(), getParentForChildren(), isClean());
        inputConfig_ = null;
      }
      return inputConfigBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.dialogflow.v2.ImportConversationDataRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.dialogflow.v2.ImportConversationDataRequest)
  private static final com.google.cloud.dialogflow.v2.ImportConversationDataRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.dialogflow.v2.ImportConversationDataRequest();
  }

  public static com.google.cloud.dialogflow.v2.ImportConversationDataRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ImportConversationDataRequest> PARSER =
      new com.google.protobuf.AbstractParser<ImportConversationDataRequest>() {
        @java.lang.Override
        public ImportConversationDataRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<ImportConversationDataRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ImportConversationDataRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.dialogflow.v2.ImportConversationDataRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
