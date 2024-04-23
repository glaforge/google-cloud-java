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
// source: google/cloud/run/v2/status.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.run.v2;

/**
 *
 *
 * <pre>
 * Effective settings for the current revision
 * </pre>
 *
 * Protobuf type {@code google.cloud.run.v2.RevisionScalingStatus}
 */
public final class RevisionScalingStatus extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.run.v2.RevisionScalingStatus)
    RevisionScalingStatusOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RevisionScalingStatus.newBuilder() to construct.
  private RevisionScalingStatus(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RevisionScalingStatus() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RevisionScalingStatus();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.run.v2.StatusProto
        .internal_static_google_cloud_run_v2_RevisionScalingStatus_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.run.v2.StatusProto
        .internal_static_google_cloud_run_v2_RevisionScalingStatus_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.run.v2.RevisionScalingStatus.class,
            com.google.cloud.run.v2.RevisionScalingStatus.Builder.class);
  }

  public static final int DESIRED_MIN_INSTANCE_COUNT_FIELD_NUMBER = 1;
  private int desiredMinInstanceCount_ = 0;
  /**
   *
   *
   * <pre>
   * The current number of min instances provisioned for this revision.
   * </pre>
   *
   * <code>int32 desired_min_instance_count = 1;</code>
   *
   * @return The desiredMinInstanceCount.
   */
  @java.lang.Override
  public int getDesiredMinInstanceCount() {
    return desiredMinInstanceCount_;
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
    if (desiredMinInstanceCount_ != 0) {
      output.writeInt32(1, desiredMinInstanceCount_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (desiredMinInstanceCount_ != 0) {
      size += com.google.protobuf.CodedOutputStream.computeInt32Size(1, desiredMinInstanceCount_);
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
    if (!(obj instanceof com.google.cloud.run.v2.RevisionScalingStatus)) {
      return super.equals(obj);
    }
    com.google.cloud.run.v2.RevisionScalingStatus other =
        (com.google.cloud.run.v2.RevisionScalingStatus) obj;

    if (getDesiredMinInstanceCount() != other.getDesiredMinInstanceCount()) return false;
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
    hash = (37 * hash) + DESIRED_MIN_INSTANCE_COUNT_FIELD_NUMBER;
    hash = (53 * hash) + getDesiredMinInstanceCount();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus parseFrom(
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

  public static Builder newBuilder(com.google.cloud.run.v2.RevisionScalingStatus prototype) {
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
   * Effective settings for the current revision
   * </pre>
   *
   * Protobuf type {@code google.cloud.run.v2.RevisionScalingStatus}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.run.v2.RevisionScalingStatus)
      com.google.cloud.run.v2.RevisionScalingStatusOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.run.v2.StatusProto
          .internal_static_google_cloud_run_v2_RevisionScalingStatus_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.run.v2.StatusProto
          .internal_static_google_cloud_run_v2_RevisionScalingStatus_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.run.v2.RevisionScalingStatus.class,
              com.google.cloud.run.v2.RevisionScalingStatus.Builder.class);
    }

    // Construct using com.google.cloud.run.v2.RevisionScalingStatus.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      desiredMinInstanceCount_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.run.v2.StatusProto
          .internal_static_google_cloud_run_v2_RevisionScalingStatus_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.RevisionScalingStatus getDefaultInstanceForType() {
      return com.google.cloud.run.v2.RevisionScalingStatus.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.run.v2.RevisionScalingStatus build() {
      com.google.cloud.run.v2.RevisionScalingStatus result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.run.v2.RevisionScalingStatus buildPartial() {
      com.google.cloud.run.v2.RevisionScalingStatus result =
          new com.google.cloud.run.v2.RevisionScalingStatus(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.run.v2.RevisionScalingStatus result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.desiredMinInstanceCount_ = desiredMinInstanceCount_;
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
      if (other instanceof com.google.cloud.run.v2.RevisionScalingStatus) {
        return mergeFrom((com.google.cloud.run.v2.RevisionScalingStatus) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.run.v2.RevisionScalingStatus other) {
      if (other == com.google.cloud.run.v2.RevisionScalingStatus.getDefaultInstance()) return this;
      if (other.getDesiredMinInstanceCount() != 0) {
        setDesiredMinInstanceCount(other.getDesiredMinInstanceCount());
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
            case 8:
              {
                desiredMinInstanceCount_ = input.readInt32();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
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

    private int desiredMinInstanceCount_;
    /**
     *
     *
     * <pre>
     * The current number of min instances provisioned for this revision.
     * </pre>
     *
     * <code>int32 desired_min_instance_count = 1;</code>
     *
     * @return The desiredMinInstanceCount.
     */
    @java.lang.Override
    public int getDesiredMinInstanceCount() {
      return desiredMinInstanceCount_;
    }
    /**
     *
     *
     * <pre>
     * The current number of min instances provisioned for this revision.
     * </pre>
     *
     * <code>int32 desired_min_instance_count = 1;</code>
     *
     * @param value The desiredMinInstanceCount to set.
     * @return This builder for chaining.
     */
    public Builder setDesiredMinInstanceCount(int value) {

      desiredMinInstanceCount_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The current number of min instances provisioned for this revision.
     * </pre>
     *
     * <code>int32 desired_min_instance_count = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDesiredMinInstanceCount() {
      bitField0_ = (bitField0_ & ~0x00000001);
      desiredMinInstanceCount_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.run.v2.RevisionScalingStatus)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.run.v2.RevisionScalingStatus)
  private static final com.google.cloud.run.v2.RevisionScalingStatus DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.run.v2.RevisionScalingStatus();
  }

  public static com.google.cloud.run.v2.RevisionScalingStatus getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RevisionScalingStatus> PARSER =
      new com.google.protobuf.AbstractParser<RevisionScalingStatus>() {
        @java.lang.Override
        public RevisionScalingStatus parsePartialFrom(
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

  public static com.google.protobuf.Parser<RevisionScalingStatus> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RevisionScalingStatus> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.run.v2.RevisionScalingStatus getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
