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
// source: google/analytics/admin/v1alpha/analytics_admin.proto

// Protobuf Java Version: 3.25.3
package com.google.analytics.admin.v1alpha;

/**
 *
 *
 * <pre>
 * Response message for fetching the opt out status for the automated GA4 setup
 * process.
 * </pre>
 *
 * Protobuf type {@code google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse}
 */
public final class FetchAutomatedGa4ConfigurationOptOutResponse
    extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse)
    FetchAutomatedGa4ConfigurationOptOutResponseOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FetchAutomatedGa4ConfigurationOptOutResponse.newBuilder() to construct.
  private FetchAutomatedGa4ConfigurationOptOutResponse(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FetchAutomatedGa4ConfigurationOptOutResponse() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FetchAutomatedGa4ConfigurationOptOutResponse();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_FetchAutomatedGa4ConfigurationOptOutResponse_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
        .internal_static_google_analytics_admin_v1alpha_FetchAutomatedGa4ConfigurationOptOutResponse_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse.class,
            com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse.Builder
                .class);
  }

  public static final int OPT_OUT_FIELD_NUMBER = 1;
  private boolean optOut_ = false;
  /**
   *
   *
   * <pre>
   * The opt out status for the UA property.
   * </pre>
   *
   * <code>bool opt_out = 1;</code>
   *
   * @return The optOut.
   */
  @java.lang.Override
  public boolean getOptOut() {
    return optOut_;
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
    if (optOut_ != false) {
      output.writeBool(1, optOut_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (optOut_ != false) {
      size += com.google.protobuf.CodedOutputStream.computeBoolSize(1, optOut_);
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
    if (!(obj
        instanceof
        com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse)) {
      return super.equals(obj);
    }
    com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse other =
        (com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse) obj;

    if (getOptOut() != other.getOptOut()) return false;
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
    hash = (37 * hash) + OPT_OUT_FIELD_NUMBER;
    hash = (53 * hash) + com.google.protobuf.Internal.hashBoolean(getOptOut());
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(java.nio.ByteBuffer data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(
          java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(com.google.protobuf.ByteString data)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(
          com.google.protobuf.ByteString data,
          com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(byte[] data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseDelimitedFrom(java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseDelimitedFrom(
          java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
          throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      parseFrom(
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
      com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse prototype) {
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
   * Response message for fetching the opt out status for the automated GA4 setup
   * process.
   * </pre>
   *
   * Protobuf type {@code
   * google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse)
      com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponseOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_FetchAutomatedGa4ConfigurationOptOutResponse_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_FetchAutomatedGa4ConfigurationOptOutResponse_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse.class,
              com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
                  .Builder.class);
    }

    // Construct using
    // com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      optOut_ = false;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.analytics.admin.v1alpha.AnalyticsAdminProto
          .internal_static_google_analytics_admin_v1alpha_FetchAutomatedGa4ConfigurationOptOutResponse_descriptor;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
        getDefaultInstanceForType() {
      return com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
          .getDefaultInstance();
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse build() {
      com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse result =
          buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
        buildPartial() {
      com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse result =
          new com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.optOut_ = optOut_;
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
      if (other
          instanceof
          com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse) {
        return mergeFrom(
            (com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse)
                other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(
        com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse other) {
      if (other
          == com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
              .getDefaultInstance()) return this;
      if (other.getOptOut() != false) {
        setOptOut(other.getOptOut());
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
                optOut_ = input.readBool();
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

    private boolean optOut_;
    /**
     *
     *
     * <pre>
     * The opt out status for the UA property.
     * </pre>
     *
     * <code>bool opt_out = 1;</code>
     *
     * @return The optOut.
     */
    @java.lang.Override
    public boolean getOptOut() {
      return optOut_;
    }
    /**
     *
     *
     * <pre>
     * The opt out status for the UA property.
     * </pre>
     *
     * <code>bool opt_out = 1;</code>
     *
     * @param value The optOut to set.
     * @return This builder for chaining.
     */
    public Builder setOptOut(boolean value) {

      optOut_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The opt out status for the UA property.
     * </pre>
     *
     * <code>bool opt_out = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearOptOut() {
      bitField0_ = (bitField0_ & ~0x00000001);
      optOut_ = false;
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

    // @@protoc_insertion_point(builder_scope:google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse)
  }

  // @@protoc_insertion_point(class_scope:google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse)
  private static final com.google.analytics.admin.v1alpha
          .FetchAutomatedGa4ConfigurationOptOutResponse
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE =
        new com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse();
  }

  public static com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FetchAutomatedGa4ConfigurationOptOutResponse>
      PARSER =
          new com.google.protobuf.AbstractParser<FetchAutomatedGa4ConfigurationOptOutResponse>() {
            @java.lang.Override
            public FetchAutomatedGa4ConfigurationOptOutResponse parsePartialFrom(
                com.google.protobuf.CodedInputStream input,
                com.google.protobuf.ExtensionRegistryLite extensionRegistry)
                throws com.google.protobuf.InvalidProtocolBufferException {
              Builder builder = newBuilder();
              try {
                builder.mergeFrom(input, extensionRegistry);
              } catch (com.google.protobuf.InvalidProtocolBufferException e) {
                throw e.setUnfinishedMessage(builder.buildPartial());
              } catch (com.google.protobuf.UninitializedMessageException e) {
                throw e.asInvalidProtocolBufferException()
                    .setUnfinishedMessage(builder.buildPartial());
              } catch (java.io.IOException e) {
                throw new com.google.protobuf.InvalidProtocolBufferException(e)
                    .setUnfinishedMessage(builder.buildPartial());
              }
              return builder.buildPartial();
            }
          };

  public static com.google.protobuf.Parser<FetchAutomatedGa4ConfigurationOptOutResponse> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FetchAutomatedGa4ConfigurationOptOutResponse>
      getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.analytics.admin.v1alpha.FetchAutomatedGa4ConfigurationOptOutResponse
      getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
