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
// source: google/cloud/accessapproval/v1/accessapproval.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.accessapproval.v1;

/**
 *
 *
 * <pre>
 * The properties associated with the resource of the request.
 * </pre>
 *
 * Protobuf type {@code google.cloud.accessapproval.v1.ResourceProperties}
 */
public final class ResourceProperties extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.accessapproval.v1.ResourceProperties)
    ResourcePropertiesOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use ResourceProperties.newBuilder() to construct.
  private ResourceProperties(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private ResourceProperties() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new ResourceProperties();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_ResourceProperties_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.accessapproval.v1.AccessApprovalProto
        .internal_static_google_cloud_accessapproval_v1_ResourceProperties_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.accessapproval.v1.ResourceProperties.class,
            com.google.cloud.accessapproval.v1.ResourceProperties.Builder.class);
  }

  public static final int EXCLUDES_DESCENDANTS_FIELD_NUMBER = 1;
  private boolean excludesDescendants_ = false;
  /**
   *
   *
   * <pre>
   * Whether an approval will exclude the descendants of the resource being
   * requested.
   * </pre>
   *
   * <code>bool excludes_descendants = 1;</code>
   *
   * @return The excludesDescendants.
   */
  @java.lang.Override
  public boolean getExcludesDescendants() {
    return excludesDescendants_;
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
    if (excludesDescendants_ != false) {
      output.writeBool(1, excludesDescendants_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (excludesDescendants_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, excludesDescendants_);
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
    if (!(obj instanceof com.google.cloud.accessapproval.v1.ResourceProperties)) {
      return super.equals(obj);
    }
    com.google.cloud.accessapproval.v1.ResourceProperties other =
        (com.google.cloud.accessapproval.v1.ResourceProperties) obj;

    if (getExcludesDescendants() != other.getExcludesDescendants()) return false;
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
    hash = (37 * hash) + EXCLUDES_DESCENDANTS_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getExcludesDescendants());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties parseFrom(
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
      com.google.cloud.accessapproval.v1.ResourceProperties prototype) {
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
   * The properties associated with the resource of the request.
   * </pre>
   *
   * Protobuf type {@code google.cloud.accessapproval.v1.ResourceProperties}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.accessapproval.v1.ResourceProperties)
      com.google.cloud.accessapproval.v1.ResourcePropertiesOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_ResourceProperties_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_ResourceProperties_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.accessapproval.v1.ResourceProperties.class,
              com.google.cloud.accessapproval.v1.ResourceProperties.Builder.class);
    }

    // Construct using com.google.cloud.accessapproval.v1.ResourceProperties.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      excludesDescendants_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.accessapproval.v1.AccessApprovalProto
          .internal_static_google_cloud_accessapproval_v1_ResourceProperties_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.ResourceProperties getDefaultInstanceForType() {
      return com.google.cloud.accessapproval.v1.ResourceProperties.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.ResourceProperties build() {
      com.google.cloud.accessapproval.v1.ResourceProperties result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.accessapproval.v1.ResourceProperties buildPartial() {
      com.google.cloud.accessapproval.v1.ResourceProperties result =
          new com.google.cloud.accessapproval.v1.ResourceProperties(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.accessapproval.v1.ResourceProperties result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.excludesDescendants_ = excludesDescendants_;
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
      if (other instanceof com.google.cloud.accessapproval.v1.ResourceProperties) {
        return mergeFrom((com.google.cloud.accessapproval.v1.ResourceProperties) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.accessapproval.v1.ResourceProperties other) {
      if (other == com.google.cloud.accessapproval.v1.ResourceProperties.getDefaultInstance())
        return this;
      if (other.getExcludesDescendants() != false) {
        setExcludesDescendants(other.getExcludesDescendants());
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
                excludesDescendants_ = input.readBool();
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

    private boolean excludesDescendants_;
    /**
     *
     *
     * <pre>
     * Whether an approval will exclude the descendants of the resource being
     * requested.
     * </pre>
     *
     * <code>bool excludes_descendants = 1;</code>
     *
     * @return The excludesDescendants.
     */
    @java.lang.Override
    public boolean getExcludesDescendants() {
      return excludesDescendants_;
    }
    /**
     *
     *
     * <pre>
     * Whether an approval will exclude the descendants of the resource being
     * requested.
     * </pre>
     *
     * <code>bool excludes_descendants = 1;</code>
     *
     * @param value The excludesDescendants to set.
     * @return This builder for chaining.
     */
    public Builder setExcludesDescendants(boolean value) {

      excludesDescendants_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Whether an approval will exclude the descendants of the resource being
     * requested.
     * </pre>
     *
     * <code>bool excludes_descendants = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearExcludesDescendants() {
      bitField0_ = (bitField0_ & ~0x00000001);
      excludesDescendants_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.accessapproval.v1.ResourceProperties)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.accessapproval.v1.ResourceProperties)
  private static final com.google.cloud.accessapproval.v1.ResourceProperties DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.accessapproval.v1.ResourceProperties();
  }

  public static com.google.cloud.accessapproval.v1.ResourceProperties getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<ResourceProperties> PARSER =
      new com.google.protobuf.AbstractParser<ResourceProperties>() {
        @java.lang.Override
        public ResourceProperties parsePartialFrom(
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

  public static com.google.protobuf.Parser<ResourceProperties> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<ResourceProperties> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.accessapproval.v1.ResourceProperties getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
