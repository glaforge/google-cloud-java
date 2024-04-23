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
// source: google/cloud/deploy/v1/cloud_deploy.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.deploy.v1;

/**
 *
 *
 * <pre>
 * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
 * </pre>
 *
 * Protobuf type {@code google.cloud.deploy.v1.SerialPipeline}
 */
public final class SerialPipeline extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.deploy.v1.SerialPipeline)
    SerialPipelineOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use SerialPipeline.newBuilder() to construct.
  private SerialPipeline(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private SerialPipeline() {
    stages_ = java.util.Collections.emptyList();
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new SerialPipeline();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_SerialPipeline_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.deploy.v1.CloudDeployProto
        .internal_static_google_cloud_deploy_v1_SerialPipeline_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.deploy.v1.SerialPipeline.class,
            com.google.cloud.deploy.v1.SerialPipeline.Builder.class);
  }

  public static final int STAGES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<com.google.cloud.deploy.v1.Stage> stages_;
  /**
   *
   *
   * <pre>
   * Each stage specifies configuration for a `Target`. The ordering
   * of this list defines the promotion flow.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<com.google.cloud.deploy.v1.Stage> getStagesList() {
    return stages_;
  }
  /**
   *
   *
   * <pre>
   * Each stage specifies configuration for a `Target`. The ordering
   * of this list defines the promotion flow.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
   */
  @java.lang.Override
  public java.util.List<? extends com.google.cloud.deploy.v1.StageOrBuilder>
      getStagesOrBuilderList() {
    return stages_;
  }
  /**
   *
   *
   * <pre>
   * Each stage specifies configuration for a `Target`. The ordering
   * of this list defines the promotion flow.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
   */
  @java.lang.Override
  public int getStagesCount() {
    return stages_.size();
  }
  /**
   *
   *
   * <pre>
   * Each stage specifies configuration for a `Target`. The ordering
   * of this list defines the promotion flow.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.Stage getStages(int index) {
    return stages_.get(index);
  }
  /**
   *
   *
   * <pre>
   * Each stage specifies configuration for a `Target`. The ordering
   * of this list defines the promotion flow.
   * </pre>
   *
   * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.deploy.v1.StageOrBuilder getStagesOrBuilder(int index) {
    return stages_.get(index);
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
    for (int i = 0; i < stages_.size(); i++) {
      output.writeMessage(1, stages_.get(i));
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    for (int i = 0; i < stages_.size(); i++) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, stages_.get(i));
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
    if (!(obj instanceof com.google.cloud.deploy.v1.SerialPipeline)) {
      return super.equals(obj);
    }
    com.google.cloud.deploy.v1.SerialPipeline other =
        (com.google.cloud.deploy.v1.SerialPipeline) obj;

    if (!getStagesList().equals(other.getStagesList())) return false;
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
    if (getStagesCount() > 0) {
      hash = (37 * hash) + STAGES_FIELD_NUMBER;
      hash = (53 * hash) + getStagesList().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.deploy.v1.SerialPipeline parseFrom(
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

  public static Builder newBuilder(com.google.cloud.deploy.v1.SerialPipeline prototype) {
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
   * SerialPipeline defines a sequential set of stages for a `DeliveryPipeline`.
   * </pre>
   *
   * Protobuf type {@code google.cloud.deploy.v1.SerialPipeline}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.deploy.v1.SerialPipeline)
      com.google.cloud.deploy.v1.SerialPipelineOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_SerialPipeline_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_SerialPipeline_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.deploy.v1.SerialPipeline.class,
              com.google.cloud.deploy.v1.SerialPipeline.Builder.class);
    }

    // Construct using com.google.cloud.deploy.v1.SerialPipeline.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      if (stagesBuilder_ == null) {
        stages_ = java.util.Collections.emptyList();
      } else {
        stages_ = null;
        stagesBuilder_.clear();
      }
      bitField0_ = (bitField0_ & ~0x00000001);
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.deploy.v1.CloudDeployProto
          .internal_static_google_cloud_deploy_v1_SerialPipeline_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.SerialPipeline getDefaultInstanceForType() {
      return com.google.cloud.deploy.v1.SerialPipeline.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.SerialPipeline build() {
      com.google.cloud.deploy.v1.SerialPipeline result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.deploy.v1.SerialPipeline buildPartial() {
      com.google.cloud.deploy.v1.SerialPipeline result =
          new com.google.cloud.deploy.v1.SerialPipeline(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(com.google.cloud.deploy.v1.SerialPipeline result) {
      if (stagesBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)) {
          stages_ = java.util.Collections.unmodifiableList(stages_);
          bitField0_ = (bitField0_ & ~0x00000001);
        }
        result.stages_ = stages_;
      } else {
        result.stages_ = stagesBuilder_.build();
      }
    }

    private void buildPartial0(com.google.cloud.deploy.v1.SerialPipeline result) {
      int from_bitField0_ = bitField0_;
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
      if (other instanceof com.google.cloud.deploy.v1.SerialPipeline) {
        return mergeFrom((com.google.cloud.deploy.v1.SerialPipeline) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.deploy.v1.SerialPipeline other) {
      if (other == com.google.cloud.deploy.v1.SerialPipeline.getDefaultInstance()) return this;
      if (stagesBuilder_ == null) {
        if (!other.stages_.isEmpty()) {
          if (stages_.isEmpty()) {
            stages_ = other.stages_;
            bitField0_ = (bitField0_ & ~0x00000001);
          } else {
            ensureStagesIsMutable();
            stages_.addAll(other.stages_);
          }
          onChanged();
        }
      } else {
        if (!other.stages_.isEmpty()) {
          if (stagesBuilder_.isEmpty()) {
            stagesBuilder_.dispose();
            stagesBuilder_ = null;
            stages_ = other.stages_;
            bitField0_ = (bitField0_ & ~0x00000001);
            stagesBuilder_ =
                com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders
                    ? getStagesFieldBuilder()
                    : null;
          } else {
            stagesBuilder_.addAllMessages(other.stages_);
          }
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
                com.google.cloud.deploy.v1.Stage m =
                    input.readMessage(com.google.cloud.deploy.v1.Stage.parser(), extensionRegistry);
                if (stagesBuilder_ == null) {
                  ensureStagesIsMutable();
                  stages_.add(m);
                } else {
                  stagesBuilder_.addMessage(m);
                }
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

    private java.util.List<com.google.cloud.deploy.v1.Stage> stages_ =
        java.util.Collections.emptyList();

    private void ensureStagesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        stages_ = new java.util.ArrayList<com.google.cloud.deploy.v1.Stage>(stages_);
        bitField0_ |= 0x00000001;
      }
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.deploy.v1.Stage,
            com.google.cloud.deploy.v1.Stage.Builder,
            com.google.cloud.deploy.v1.StageOrBuilder>
        stagesBuilder_;

    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public java.util.List<com.google.cloud.deploy.v1.Stage> getStagesList() {
      if (stagesBuilder_ == null) {
        return java.util.Collections.unmodifiableList(stages_);
      } else {
        return stagesBuilder_.getMessageList();
      }
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public int getStagesCount() {
      if (stagesBuilder_ == null) {
        return stages_.size();
      } else {
        return stagesBuilder_.getCount();
      }
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public com.google.cloud.deploy.v1.Stage getStages(int index) {
      if (stagesBuilder_ == null) {
        return stages_.get(index);
      } else {
        return stagesBuilder_.getMessage(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder setStages(int index, com.google.cloud.deploy.v1.Stage value) {
      if (stagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStagesIsMutable();
        stages_.set(index, value);
        onChanged();
      } else {
        stagesBuilder_.setMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder setStages(int index, com.google.cloud.deploy.v1.Stage.Builder builderForValue) {
      if (stagesBuilder_ == null) {
        ensureStagesIsMutable();
        stages_.set(index, builderForValue.build());
        onChanged();
      } else {
        stagesBuilder_.setMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder addStages(com.google.cloud.deploy.v1.Stage value) {
      if (stagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStagesIsMutable();
        stages_.add(value);
        onChanged();
      } else {
        stagesBuilder_.addMessage(value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder addStages(int index, com.google.cloud.deploy.v1.Stage value) {
      if (stagesBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        ensureStagesIsMutable();
        stages_.add(index, value);
        onChanged();
      } else {
        stagesBuilder_.addMessage(index, value);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder addStages(com.google.cloud.deploy.v1.Stage.Builder builderForValue) {
      if (stagesBuilder_ == null) {
        ensureStagesIsMutable();
        stages_.add(builderForValue.build());
        onChanged();
      } else {
        stagesBuilder_.addMessage(builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder addStages(int index, com.google.cloud.deploy.v1.Stage.Builder builderForValue) {
      if (stagesBuilder_ == null) {
        ensureStagesIsMutable();
        stages_.add(index, builderForValue.build());
        onChanged();
      } else {
        stagesBuilder_.addMessage(index, builderForValue.build());
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder addAllStages(
        java.lang.Iterable<? extends com.google.cloud.deploy.v1.Stage> values) {
      if (stagesBuilder_ == null) {
        ensureStagesIsMutable();
        com.google.protobuf.AbstractMessageLite.Builder.addAll(values, stages_);
        onChanged();
      } else {
        stagesBuilder_.addAllMessages(values);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder clearStages() {
      if (stagesBuilder_ == null) {
        stages_ = java.util.Collections.emptyList();
        bitField0_ = (bitField0_ & ~0x00000001);
        onChanged();
      } else {
        stagesBuilder_.clear();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public Builder removeStages(int index) {
      if (stagesBuilder_ == null) {
        ensureStagesIsMutable();
        stages_.remove(index);
        onChanged();
      } else {
        stagesBuilder_.remove(index);
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public com.google.cloud.deploy.v1.Stage.Builder getStagesBuilder(int index) {
      return getStagesFieldBuilder().getBuilder(index);
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public com.google.cloud.deploy.v1.StageOrBuilder getStagesOrBuilder(int index) {
      if (stagesBuilder_ == null) {
        return stages_.get(index);
      } else {
        return stagesBuilder_.getMessageOrBuilder(index);
      }
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public java.util.List<? extends com.google.cloud.deploy.v1.StageOrBuilder>
        getStagesOrBuilderList() {
      if (stagesBuilder_ != null) {
        return stagesBuilder_.getMessageOrBuilderList();
      } else {
        return java.util.Collections.unmodifiableList(stages_);
      }
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public com.google.cloud.deploy.v1.Stage.Builder addStagesBuilder() {
      return getStagesFieldBuilder()
          .addBuilder(com.google.cloud.deploy.v1.Stage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public com.google.cloud.deploy.v1.Stage.Builder addStagesBuilder(int index) {
      return getStagesFieldBuilder()
          .addBuilder(index, com.google.cloud.deploy.v1.Stage.getDefaultInstance());
    }
    /**
     *
     *
     * <pre>
     * Each stage specifies configuration for a `Target`. The ordering
     * of this list defines the promotion flow.
     * </pre>
     *
     * <code>repeated .google.cloud.deploy.v1.Stage stages = 1;</code>
     */
    public java.util.List<com.google.cloud.deploy.v1.Stage.Builder> getStagesBuilderList() {
      return getStagesFieldBuilder().getBuilderList();
    }

    private com.google.protobuf.RepeatedFieldBuilderV3<
            com.google.cloud.deploy.v1.Stage,
            com.google.cloud.deploy.v1.Stage.Builder,
            com.google.cloud.deploy.v1.StageOrBuilder>
        getStagesFieldBuilder() {
      if (stagesBuilder_ == null) {
        stagesBuilder_ =
            new com.google.protobuf.RepeatedFieldBuilderV3<
                com.google.cloud.deploy.v1.Stage,
                com.google.cloud.deploy.v1.Stage.Builder,
                com.google.cloud.deploy.v1.StageOrBuilder>(
                stages_, ((bitField0_ & 0x00000001) != 0), getParentForChildren(), isClean());
        stages_ = null;
      }
      return stagesBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.deploy.v1.SerialPipeline)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.deploy.v1.SerialPipeline)
  private static final com.google.cloud.deploy.v1.SerialPipeline DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.deploy.v1.SerialPipeline();
  }

  public static com.google.cloud.deploy.v1.SerialPipeline getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<SerialPipeline> PARSER =
      new com.google.protobuf.AbstractParser<SerialPipeline>() {
        @java.lang.Override
        public SerialPipeline parsePartialFrom(
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

  public static com.google.protobuf.Parser<SerialPipeline> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<SerialPipeline> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.deploy.v1.SerialPipeline getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
