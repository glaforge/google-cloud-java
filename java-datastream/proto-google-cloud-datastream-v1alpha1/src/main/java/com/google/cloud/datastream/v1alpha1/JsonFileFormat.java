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
// source: google/cloud/datastream/v1alpha1/datastream_resources.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.datastream.v1alpha1;

/**
 *
 *
 * <pre>
 * JSON file format configuration.
 * </pre>
 *
 * Protobuf type {@code google.cloud.datastream.v1alpha1.JsonFileFormat}
 */
public final class JsonFileFormat extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.datastream.v1alpha1.JsonFileFormat)
    JsonFileFormatOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use JsonFileFormat.newBuilder() to construct.
  private JsonFileFormat(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private JsonFileFormat() {
    schemaFileFormat_ = 0;
    compression_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new JsonFileFormat();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_JsonFileFormat_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
        .internal_static_google_cloud_datastream_v1alpha1_JsonFileFormat_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.datastream.v1alpha1.JsonFileFormat.class,
            com.google.cloud.datastream.v1alpha1.JsonFileFormat.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * Json file compression.
   * </pre>
   *
   * Protobuf enum {@code google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression}
   */
  public enum JsonCompression implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * Unspecified json file compression.
     * </pre>
     *
     * <code>JSON_COMPRESSION_UNSPECIFIED = 0;</code>
     */
    JSON_COMPRESSION_UNSPECIFIED(0),
    /**
     *
     *
     * <pre>
     * Do not compress JSON file.
     * </pre>
     *
     * <code>NO_COMPRESSION = 1;</code>
     */
    NO_COMPRESSION(1),
    /**
     *
     *
     * <pre>
     * Gzip compression.
     * </pre>
     *
     * <code>GZIP = 2;</code>
     */
    GZIP(2),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * Unspecified json file compression.
     * </pre>
     *
     * <code>JSON_COMPRESSION_UNSPECIFIED = 0;</code>
     */
    public static final int JSON_COMPRESSION_UNSPECIFIED_VALUE = 0;
    /**
     *
     *
     * <pre>
     * Do not compress JSON file.
     * </pre>
     *
     * <code>NO_COMPRESSION = 1;</code>
     */
    public static final int NO_COMPRESSION_VALUE = 1;
    /**
     *
     *
     * <pre>
     * Gzip compression.
     * </pre>
     *
     * <code>GZIP = 2;</code>
     */
    public static final int GZIP_VALUE = 2;

    public final int getNumber() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalArgumentException(
            "Can't get the number of an unknown enum value.");
      }
      return value;
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     * @deprecated Use {@link #forNumber(int)} instead.
     */
    @java.lang.Deprecated
    public static JsonCompression valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static JsonCompression forNumber(int value) {
      switch (value) {
        case 0:
          return JSON_COMPRESSION_UNSPECIFIED;
        case 1:
          return NO_COMPRESSION;
        case 2:
          return GZIP;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<JsonCompression> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<JsonCompression>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<JsonCompression>() {
              public JsonCompression findValueByNumber(int number) {
                return JsonCompression.forNumber(number);
              }
            };

    public final com.google.protobuf.Descriptors.EnumValueDescriptor getValueDescriptor() {
      if (this == UNRECOGNIZED) {
        throw new java.lang.IllegalStateException(
            "Can't get the descriptor of an unrecognized enum value.");
      }
      return getDescriptor().getValues().get(ordinal());
    }

    public final com.google.protobuf.Descriptors.EnumDescriptor getDescriptorForType() {
      return getDescriptor();
    }

    public static final com.google.protobuf.Descriptors.EnumDescriptor getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.JsonFileFormat.getDescriptor()
          .getEnumTypes()
          .get(0);
    }

    private static final JsonCompression[] VALUES = values();

    public static JsonCompression valueOf(
        com.google.protobuf.Descriptors.EnumValueDescriptor desc) {
      if (desc.getType() != getDescriptor()) {
        throw new java.lang.IllegalArgumentException("EnumValueDescriptor is not for this type.");
      }
      if (desc.getIndex() == -1) {
        return UNRECOGNIZED;
      }
      return VALUES[desc.getIndex()];
    }

    private final int value;

    private JsonCompression(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression)
  }

  public static final int SCHEMA_FILE_FORMAT_FIELD_NUMBER = 1;
  private int schemaFileFormat_ = 0;
  /**
   *
   *
   * <pre>
   * The schema file format along JSON data files.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
   *
   * @return The enum numeric value on the wire for schemaFileFormat.
   */
  @java.lang.Override
  public int getSchemaFileFormatValue() {
    return schemaFileFormat_;
  }
  /**
   *
   *
   * <pre>
   * The schema file format along JSON data files.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
   *
   * @return The schemaFileFormat.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.SchemaFileFormat getSchemaFileFormat() {
    com.google.cloud.datastream.v1alpha1.SchemaFileFormat result =
        com.google.cloud.datastream.v1alpha1.SchemaFileFormat.forNumber(schemaFileFormat_);
    return result == null
        ? com.google.cloud.datastream.v1alpha1.SchemaFileFormat.UNRECOGNIZED
        : result;
  }

  public static final int COMPRESSION_FIELD_NUMBER = 2;
  private int compression_ = 0;
  /**
   *
   *
   * <pre>
   * Compression of the loaded JSON file.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;</code>
   *
   * @return The enum numeric value on the wire for compression.
   */
  @java.lang.Override
  public int getCompressionValue() {
    return compression_;
  }
  /**
   *
   *
   * <pre>
   * Compression of the loaded JSON file.
   * </pre>
   *
   * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;</code>
   *
   * @return The compression.
   */
  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression getCompression() {
    com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression result =
        com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression.forNumber(compression_);
    return result == null
        ? com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression.UNRECOGNIZED
        : result;
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
    if (schemaFileFormat_
        != com.google.cloud.datastream.v1alpha1.SchemaFileFormat.SCHEMA_FILE_FORMAT_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(1, schemaFileFormat_);
    }
    if (compression_
        != com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression
            .JSON_COMPRESSION_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, compression_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (schemaFileFormat_
        != com.google.cloud.datastream.v1alpha1.SchemaFileFormat.SCHEMA_FILE_FORMAT_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(1, schemaFileFormat_);
    }
    if (compression_
        != com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression
            .JSON_COMPRESSION_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, compression_);
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
    if (!(obj instanceof com.google.cloud.datastream.v1alpha1.JsonFileFormat)) {
      return super.equals(obj);
    }
    com.google.cloud.datastream.v1alpha1.JsonFileFormat other =
        (com.google.cloud.datastream.v1alpha1.JsonFileFormat) obj;

    if (schemaFileFormat_ != other.schemaFileFormat_) return false;
    if (compression_ != other.compression_) return false;
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
    hash = (37 * hash) + SCHEMA_FILE_FORMAT_FIELD_NUMBER;
    hash = (53 * hash) + schemaFileFormat_;
    hash = (37 * hash) + COMPRESSION_FIELD_NUMBER;
    hash = (53 * hash) + compression_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat parseFrom(
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

  public static Builder newBuilder(com.google.cloud.datastream.v1alpha1.JsonFileFormat prototype) {
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
   * JSON file format configuration.
   * </pre>
   *
   * Protobuf type {@code google.cloud.datastream.v1alpha1.JsonFileFormat}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.datastream.v1alpha1.JsonFileFormat)
      com.google.cloud.datastream.v1alpha1.JsonFileFormatOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_JsonFileFormat_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_JsonFileFormat_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.datastream.v1alpha1.JsonFileFormat.class,
              com.google.cloud.datastream.v1alpha1.JsonFileFormat.Builder.class);
    }

    // Construct using com.google.cloud.datastream.v1alpha1.JsonFileFormat.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      schemaFileFormat_ = 0;
      compression_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.datastream.v1alpha1.CloudDatastreamResourcesProto
          .internal_static_google_cloud_datastream_v1alpha1_JsonFileFormat_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.JsonFileFormat getDefaultInstanceForType() {
      return com.google.cloud.datastream.v1alpha1.JsonFileFormat.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.JsonFileFormat build() {
      com.google.cloud.datastream.v1alpha1.JsonFileFormat result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.JsonFileFormat buildPartial() {
      com.google.cloud.datastream.v1alpha1.JsonFileFormat result =
          new com.google.cloud.datastream.v1alpha1.JsonFileFormat(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.datastream.v1alpha1.JsonFileFormat result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.schemaFileFormat_ = schemaFileFormat_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.compression_ = compression_;
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
      if (other instanceof com.google.cloud.datastream.v1alpha1.JsonFileFormat) {
        return mergeFrom((com.google.cloud.datastream.v1alpha1.JsonFileFormat) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.datastream.v1alpha1.JsonFileFormat other) {
      if (other == com.google.cloud.datastream.v1alpha1.JsonFileFormat.getDefaultInstance())
        return this;
      if (other.schemaFileFormat_ != 0) {
        setSchemaFileFormatValue(other.getSchemaFileFormatValue());
      }
      if (other.compression_ != 0) {
        setCompressionValue(other.getCompressionValue());
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
                schemaFileFormat_ = input.readEnum();
                bitField0_ |= 0x00000001;
                break;
              } // case 8
            case 16:
              {
                compression_ = input.readEnum();
                bitField0_ |= 0x00000002;
                break;
              } // case 16
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

    private int schemaFileFormat_ = 0;
    /**
     *
     *
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
     *
     * @return The enum numeric value on the wire for schemaFileFormat.
     */
    @java.lang.Override
    public int getSchemaFileFormatValue() {
      return schemaFileFormat_;
    }
    /**
     *
     *
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
     *
     * @param value The enum numeric value on the wire for schemaFileFormat to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaFileFormatValue(int value) {
      schemaFileFormat_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
     *
     * @return The schemaFileFormat.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.SchemaFileFormat getSchemaFileFormat() {
      com.google.cloud.datastream.v1alpha1.SchemaFileFormat result =
          com.google.cloud.datastream.v1alpha1.SchemaFileFormat.forNumber(schemaFileFormat_);
      return result == null
          ? com.google.cloud.datastream.v1alpha1.SchemaFileFormat.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
     *
     * @param value The schemaFileFormat to set.
     * @return This builder for chaining.
     */
    public Builder setSchemaFileFormat(
        com.google.cloud.datastream.v1alpha1.SchemaFileFormat value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000001;
      schemaFileFormat_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The schema file format along JSON data files.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.SchemaFileFormat schema_file_format = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearSchemaFileFormat() {
      bitField0_ = (bitField0_ & ~0x00000001);
      schemaFileFormat_ = 0;
      onChanged();
      return this;
    }

    private int compression_ = 0;
    /**
     *
     *
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;
     * </code>
     *
     * @return The enum numeric value on the wire for compression.
     */
    @java.lang.Override
    public int getCompressionValue() {
      return compression_;
    }
    /**
     *
     *
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;
     * </code>
     *
     * @param value The enum numeric value on the wire for compression to set.
     * @return This builder for chaining.
     */
    public Builder setCompressionValue(int value) {
      compression_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;
     * </code>
     *
     * @return The compression.
     */
    @java.lang.Override
    public com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression getCompression() {
      com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression result =
          com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression.forNumber(
              compression_);
      return result == null
          ? com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;
     * </code>
     *
     * @param value The compression to set.
     * @return This builder for chaining.
     */
    public Builder setCompression(
        com.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      compression_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Compression of the loaded JSON file.
     * </pre>
     *
     * <code>.google.cloud.datastream.v1alpha1.JsonFileFormat.JsonCompression compression = 2;
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearCompression() {
      bitField0_ = (bitField0_ & ~0x00000002);
      compression_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.datastream.v1alpha1.JsonFileFormat)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.datastream.v1alpha1.JsonFileFormat)
  private static final com.google.cloud.datastream.v1alpha1.JsonFileFormat DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.datastream.v1alpha1.JsonFileFormat();
  }

  public static com.google.cloud.datastream.v1alpha1.JsonFileFormat getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<JsonFileFormat> PARSER =
      new com.google.protobuf.AbstractParser<JsonFileFormat>() {
        @java.lang.Override
        public JsonFileFormat parsePartialFrom(
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

  public static com.google.protobuf.Parser<JsonFileFormat> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<JsonFileFormat> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.datastream.v1alpha1.JsonFileFormat getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
