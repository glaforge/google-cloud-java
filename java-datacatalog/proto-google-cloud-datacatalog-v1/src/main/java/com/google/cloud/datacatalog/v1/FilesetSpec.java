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
// source: google/cloud/datacatalog/v1/datacatalog.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datacatalog.v1;

/**
 *
 *
 * <pre>
 * Specification that applies to a fileset. Valid only for entries with the
 * 'FILESET' type.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datacatalog.v1.FilesetSpec}
 */
public final class FilesetSpec extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datacatalog.v1.FilesetSpec)
    FilesetSpecOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use FilesetSpec.newBuilder() to construct.
  private FilesetSpec(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private FilesetSpec() {}

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new FilesetSpec();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_FilesetSpec_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datacatalog.v1.Datacatalog
        .internal_static_google_cloud_datacatalog_v1_FilesetSpec_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datacatalog.v1.FilesetSpec.class,
            com.google.cloud.datacatalog.v1.FilesetSpec.Builder.class);
  }

  private int bitField0_;
  public static final int DATAPLEX_FILESET_FIELD_NUMBER = 1;
  private com.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplexFileset_;
  /**
   *
   *
   * <pre>
   * Fields specific to a Dataplex fileset and present only in the Dataplex
   * fileset entries.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
   *
   * @return Whether the dataplexFileset field is set.
   */
  @java.lang.Override
  public boolean hasDataplexFileset() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * Fields specific to a Dataplex fileset and present only in the Dataplex
   * fileset entries.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
   *
   * @return The dataplexFileset.
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexFilesetSpec getDataplexFileset() {
    return dataplexFileset_ == null
        ? com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance()
        : dataplexFileset_;
  }
  /**
   *
   *
   * <pre>
   * Fields specific to a Dataplex fileset and present only in the Dataplex
   * fileset entries.
   * </pre>
   *
   * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
   */
  @java.lang.Override
  public com.google.cloud.datacatalog.v1.DataplexFilesetSpecOrBuilder
      getDataplexFilesetOrBuilder() {
    return dataplexFileset_ == null
        ? com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance()
        : dataplexFileset_;
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
      output.writeMessage(1, getDataplexFileset());
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.CodedOutputStream.computeMessageSize(1, getDataplexFileset());
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
    if (!(obj instanceof com.google.cloud.datacatalog.v1.FilesetSpec)) {
      return super.equals(obj);
    }
    com.google.cloud.datacatalog.v1.FilesetSpec other =
        (com.google.cloud.datacatalog.v1.FilesetSpec) obj;

    if (hasDataplexFileset() != other.hasDataplexFileset()) return false;
    if (hasDataplexFileset()) {
      if (!getDataplexFileset().equals(other.getDataplexFileset())) return false;
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
    if (hasDataplexFileset()) {
      hash = (37 * hash) + DATAPLEX_FILESET_FIELD_NUMBER;
      hash = (53 * hash) + getDataplexFileset().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datacatalog.v1.FilesetSpec prototype) {
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
   * Specification that applies to a fileset. Valid only for entries with the
   * 'FILESET' type.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datacatalog.v1.FilesetSpec}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datacatalog.v1.FilesetSpec)
      com.google.cloud.datacatalog.v1.FilesetSpecOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_FilesetSpec_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_FilesetSpec_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datacatalog.v1.FilesetSpec.class,
              com.google.cloud.datacatalog.v1.FilesetSpec.Builder.class);
    }

    // Construct using com.google.cloud.datacatalog.v1.FilesetSpec.newBuilder()
    private Builder() {
      maybeForceBuilderInitialization();
    }

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
      maybeForceBuilderInitialization();
    }

    private void maybeForceBuilderInitialization() {
      if (com.google.protobuf.GeneratedMessageV3.alwaysUseFieldBuilders) {
        getDataplexFilesetFieldBuilder();
      }
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      dataplexFileset_ = null;
      if (dataplexFilesetBuilder_ != null) {
        dataplexFilesetBuilder_.dispose();
        dataplexFilesetBuilder_ = null;
      }
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datacatalog.v1.Datacatalog
          .internal_static_google_cloud_datacatalog_v1_FilesetSpec_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.FilesetSpec getDefaultInstanceForType() {
      return com.google.cloud.datacatalog.v1.FilesetSpec.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.FilesetSpec build() {
      com.google.cloud.datacatalog.v1.FilesetSpec result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datacatalog.v1.FilesetSpec buildPartial() {
      com.google.cloud.datacatalog.v1.FilesetSpec result =
          new com.google.cloud.datacatalog.v1.FilesetSpec(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datacatalog.v1.FilesetSpec result) {
      int from_bitField0_ = bitField0_;
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.dataplexFileset_ =
            dataplexFilesetBuilder_ == null ? dataplexFileset_ : dataplexFilesetBuilder_.build();
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
      if (other instanceof com.google.cloud.datacatalog.v1.FilesetSpec) {
        return mergeFrom((com.google.cloud.datacatalog.v1.FilesetSpec) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datacatalog.v1.FilesetSpec other) {
      if (other == com.google.cloud.datacatalog.v1.FilesetSpec.getDefaultInstance()) return this;
      if (other.hasDataplexFileset()) {
        mergeDataplexFileset(other.getDataplexFileset());
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
                input.readMessage(getDataplexFilesetFieldBuilder().getBuilder(), extensionRegistry);
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

    private com.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplexFileset_;
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.DataplexFilesetSpec,
            com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder,
            com.google.cloud.datacatalog.v1.DataplexFilesetSpecOrBuilder>
        dataplexFilesetBuilder_;
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     *
     * @return Whether the dataplexFileset field is set.
     */
    public boolean hasDataplexFileset() {
      return ((bitField0_ & 0x00000001) != 0);
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     *
     * @return The dataplexFileset.
     */
    public com.google.cloud.datacatalog.v1.DataplexFilesetSpec getDataplexFileset() {
      if (dataplexFilesetBuilder_ == null) {
        return dataplexFileset_ == null
            ? com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance()
            : dataplexFileset_;
      } else {
        return dataplexFilesetBuilder_.getMessage();
      }
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    public Builder setDataplexFileset(com.google.cloud.datacatalog.v1.DataplexFilesetSpec value) {
      if (dataplexFilesetBuilder_ == null) {
        if (value == null) {
          throw new NullPointerException();
        }
        dataplexFileset_ = value;
      } else {
        dataplexFilesetBuilder_.setMessage(value);
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    public Builder setDataplexFileset(
        com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder builderForValue) {
      if (dataplexFilesetBuilder_ == null) {
        dataplexFileset_ = builderForValue.build();
      } else {
        dataplexFilesetBuilder_.setMessage(builderForValue.build());
      }
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    public Builder mergeDataplexFileset(com.google.cloud.datacatalog.v1.DataplexFilesetSpec value) {
      if (dataplexFilesetBuilder_ == null) {
        if (((bitField0_ & 0x00000001) != 0)
            && dataplexFileset_ != null
            && dataplexFileset_
                != com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance()) {
          getDataplexFilesetBuilder().mergeFrom(value);
        } else {
          dataplexFileset_ = value;
        }
      } else {
        dataplexFilesetBuilder_.mergeFrom(value);
      }
      if (dataplexFileset_ != null) {
        bitField0_ |= 0x00000001;
        onChanged();
      }
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    public Builder clearDataplexFileset() {
      bitField0_ = (bitField0_ & ~0x00000001);
      dataplexFileset_ = null;
      if (dataplexFilesetBuilder_ != null) {
        dataplexFilesetBuilder_.dispose();
        dataplexFilesetBuilder_ = null;
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder getDataplexFilesetBuilder() {
      bitField0_ |= 0x00000001;
      onChanged();
      return getDataplexFilesetFieldBuilder().getBuilder();
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    public com.google.cloud.datacatalog.v1.DataplexFilesetSpecOrBuilder
        getDataplexFilesetOrBuilder() {
      if (dataplexFilesetBuilder_ != null) {
        return dataplexFilesetBuilder_.getMessageOrBuilder();
      } else {
        return dataplexFileset_ == null
            ? com.google.cloud.datacatalog.v1.DataplexFilesetSpec.getDefaultInstance()
            : dataplexFileset_;
      }
    }
    /**
     *
     *
     * <pre>
     * Fields specific to a Dataplex fileset and present only in the Dataplex
     * fileset entries.
     * </pre>
     *
     * <code>.google.cloud.datacatalog.v1.DataplexFilesetSpec dataplex_fileset = 1;</code>
     */
    private com.google.protobuf.SingleFieldBuilderV3<
            com.google.cloud.datacatalog.v1.DataplexFilesetSpec,
            com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder,
            com.google.cloud.datacatalog.v1.DataplexFilesetSpecOrBuilder>
        getDataplexFilesetFieldBuilder() {
      if (dataplexFilesetBuilder_ == null) {
        dataplexFilesetBuilder_ =
            new com.google.protobuf.SingleFieldBuilderV3<
                com.google.cloud.datacatalog.v1.DataplexFilesetSpec,
                com.google.cloud.datacatalog.v1.DataplexFilesetSpec.Builder,
                com.google.cloud.datacatalog.v1.DataplexFilesetSpecOrBuilder>(
                getDataplexFileset(), getParentForChildren(), isClean());
        dataplexFileset_ = null;
      }
      return dataplexFilesetBuilder_;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datacatalog.v1.FilesetSpec)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datacatalog.v1.FilesetSpec)
  private static final com.google.cloud.datacatalog.v1.FilesetSpec DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datacatalog.v1.FilesetSpec();
  }

  public static com.google.cloud.datacatalog.v1.FilesetSpec getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<FilesetSpec> PARSER =
      new com.google.protobuf.AbstractParser<FilesetSpec>() {
        @java.lang.Override
        public FilesetSpec parsePartialFrom(
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

  public static com.google.protobuf.Parser<FilesetSpec> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<FilesetSpec> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datacatalog.v1.FilesetSpec getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
