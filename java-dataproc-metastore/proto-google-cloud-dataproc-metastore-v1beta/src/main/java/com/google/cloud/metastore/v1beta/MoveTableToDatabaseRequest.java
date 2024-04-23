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
// source: google/cloud/metastore/v1beta/metastore.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.metastore.v1beta;

/**
 *
 *
 * <pre>
 * Request message for
 * [DataprocMetastore.MoveTableToDatabase][google.cloud.metastore.v1beta.DataprocMetastore.MoveTableToDatabase].
 * </pre>
 *
 * Protobuf type {@code google.cloud.metastore.v1beta.MoveTableToDatabaseRequest}
 */
public final class MoveTableToDatabaseRequest extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.metastore.v1beta.MoveTableToDatabaseRequest)
    MoveTableToDatabaseRequestOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use MoveTableToDatabaseRequest.newBuilder() to construct.
  private MoveTableToDatabaseRequest(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private MoveTableToDatabaseRequest() {
    service_ = "";
    tableName_ = "";
    dbName_ = "";
    destinationDbName_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new MoveTableToDatabaseRequest();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.metastore.v1beta.MetastoreProto
        .internal_static_google_cloud_metastore_v1beta_MoveTableToDatabaseRequest_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.metastore.v1beta.MetastoreProto
        .internal_static_google_cloud_metastore_v1beta_MoveTableToDatabaseRequest_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.class,
            com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.Builder.class);
  }

  public static final int SERVICE_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private volatile java.lang.Object service_ = "";
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to mutate
   * metadata, in the following format:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The service.
   */
  @java.lang.Override
  public java.lang.String getService() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      service_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The relative resource name of the metastore service to mutate
   * metadata, in the following format:
   *
   * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
   * </pre>
   *
   * <code>
   * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
   * </code>
   *
   * @return The bytes for service.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getServiceBytes() {
    java.lang.Object ref = service_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      service_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int TABLE_NAME_FIELD_NUMBER = 2;

  @SuppressWarnings("serial")
  private volatile java.lang.Object tableName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the table to be moved.
   * </pre>
   *
   * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The tableName.
   */
  @java.lang.Override
  public java.lang.String getTableName() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      tableName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the table to be moved.
   * </pre>
   *
   * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for tableName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getTableNameBytes() {
    java.lang.Object ref = tableName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      tableName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DB_NAME_FIELD_NUMBER = 3;

  @SuppressWarnings("serial")
  private volatile java.lang.Object dbName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table resides.
   * </pre>
   *
   * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The dbName.
   */
  @java.lang.Override
  public java.lang.String getDbName() {
    java.lang.Object ref = dbName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      dbName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table resides.
   * </pre>
   *
   * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for dbName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDbNameBytes() {
    java.lang.Object ref = dbName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      dbName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
  }

  public static final int DESTINATION_DB_NAME_FIELD_NUMBER = 4;

  @SuppressWarnings("serial")
  private volatile java.lang.Object destinationDbName_ = "";
  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table should be moved.
   * </pre>
   *
   * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The destinationDbName.
   */
  @java.lang.Override
  public java.lang.String getDestinationDbName() {
    java.lang.Object ref = destinationDbName_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      destinationDbName_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * Required. The name of the database where the table should be moved.
   * </pre>
   *
   * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
   *
   * @return The bytes for destinationDbName.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getDestinationDbNameBytes() {
    java.lang.Object ref = destinationDbName_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      destinationDbName_ = b;
      return b;
    } else {
      return (com.google.protobuf.ByteString) ref;
    }
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
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 2, tableName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 3, dbName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationDbName_)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 4, destinationDbName_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(service_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(1, service_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(tableName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(2, tableName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(dbName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(3, dbName_);
    }
    if (!com.google.protobuf.GeneratedMessageV3.isStringEmpty(destinationDbName_)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(4, destinationDbName_);
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
    if (!(obj instanceof com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest)) {
      return super.equals(obj);
    }
    com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest other =
        (com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest) obj;

    if (!getService().equals(other.getService())) return false;
    if (!getTableName().equals(other.getTableName())) return false;
    if (!getDbName().equals(other.getDbName())) return false;
    if (!getDestinationDbName().equals(other.getDestinationDbName())) return false;
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
    hash = (37 * hash) + SERVICE_FIELD_NUMBER;
    hash = (53 * hash) + getService().hashCode();
    hash = (37 * hash) + TABLE_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getTableName().hashCode();
    hash = (37 * hash) + DB_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDbName().hashCode();
    hash = (37 * hash) + DESTINATION_DB_NAME_FIELD_NUMBER;
    hash = (53 * hash) + getDestinationDbName().hashCode();
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest parseFrom(
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
      com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest prototype) {
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
   * [DataprocMetastore.MoveTableToDatabase][google.cloud.metastore.v1beta.DataprocMetastore.MoveTableToDatabase].
   * </pre>
   *
   * Protobuf type {@code google.cloud.metastore.v1beta.MoveTableToDatabaseRequest}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.metastore.v1beta.MoveTableToDatabaseRequest)
      com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequestOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.metastore.v1beta.MetastoreProto
          .internal_static_google_cloud_metastore_v1beta_MoveTableToDatabaseRequest_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.metastore.v1beta.MetastoreProto
          .internal_static_google_cloud_metastore_v1beta_MoveTableToDatabaseRequest_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.class,
              com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.Builder.class);
    }

    // Construct using com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      service_ = "";
      tableName_ = "";
      dbName_ = "";
      destinationDbName_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.metastore.v1beta.MetastoreProto
          .internal_static_google_cloud_metastore_v1beta_MoveTableToDatabaseRequest_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest
        getDefaultInstanceForType() {
      return com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest build() {
      com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest buildPartial() {
      com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest result =
          new com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(
        com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        result.service_ = service_;
      }
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.tableName_ = tableName_;
      }
      if (((from_bitField0_ & 0x00000004) != 0)) {
        result.dbName_ = dbName_;
      }
      if (((from_bitField0_ & 0x00000008) != 0)) {
        result.destinationDbName_ = destinationDbName_;
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
      if (other instanceof com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest) {
        return mergeFrom((com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest other) {
      if (other
          == com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest.getDefaultInstance())
        return this;
      if (!other.getService().isEmpty()) {
        service_ = other.service_;
        bitField0_ |= 0x00000001;
        onChanged();
      }
      if (!other.getTableName().isEmpty()) {
        tableName_ = other.tableName_;
        bitField0_ |= 0x00000002;
        onChanged();
      }
      if (!other.getDbName().isEmpty()) {
        dbName_ = other.dbName_;
        bitField0_ |= 0x00000004;
        onChanged();
      }
      if (!other.getDestinationDbName().isEmpty()) {
        destinationDbName_ = other.destinationDbName_;
        bitField0_ |= 0x00000008;
        onChanged();
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
                service_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000001;
                break;
              } // case 10
            case 18:
              {
                tableName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case 18
            case 26:
              {
                dbName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000004;
                break;
              } // case 26
            case 34:
              {
                destinationDbName_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000008;
                break;
              } // case 34
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

    private java.lang.Object service_ = "";
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The service.
     */
    public java.lang.String getService() {
      java.lang.Object ref = service_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        service_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return The bytes for service.
     */
    public com.google.protobuf.ByteString getServiceBytes() {
      java.lang.Object ref = service_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        service_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The service to set.
     * @return This builder for chaining.
     */
    public Builder setService(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @return This builder for chaining.
     */
    public Builder clearService() {
      service_ = getDefaultInstance().getService();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The relative resource name of the metastore service to mutate
     * metadata, in the following format:
     *
     * `projects/{project_id}/locations/{location_id}/services/{service_id}`.
     * </pre>
     *
     * <code>
     * string service = 1 [(.google.api.field_behavior) = REQUIRED, (.google.api.resource_reference) = { ... }
     * </code>
     *
     * @param value The bytes for service to set.
     * @return This builder for chaining.
     */
    public Builder setServiceBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      service_ = value;
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }

    private java.lang.Object tableName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the table to be moved.
     * </pre>
     *
     * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The tableName.
     */
    public java.lang.String getTableName() {
      java.lang.Object ref = tableName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        tableName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the table to be moved.
     * </pre>
     *
     * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for tableName.
     */
    public com.google.protobuf.ByteString getTableNameBytes() {
      java.lang.Object ref = tableName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        tableName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the table to be moved.
     * </pre>
     *
     * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      tableName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the table to be moved.
     * </pre>
     *
     * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTableName() {
      tableName_ = getDefaultInstance().getTableName();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the table to be moved.
     * </pre>
     *
     * <code>string table_name = 2 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for tableName to set.
     * @return This builder for chaining.
     */
    public Builder setTableNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      tableName_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }

    private java.lang.Object dbName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table resides.
     * </pre>
     *
     * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The dbName.
     */
    public java.lang.String getDbName() {
      java.lang.Object ref = dbName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        dbName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table resides.
     * </pre>
     *
     * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for dbName.
     */
    public com.google.protobuf.ByteString getDbNameBytes() {
      java.lang.Object ref = dbName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        dbName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table resides.
     * </pre>
     *
     * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The dbName to set.
     * @return This builder for chaining.
     */
    public Builder setDbName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      dbName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table resides.
     * </pre>
     *
     * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDbName() {
      dbName_ = getDefaultInstance().getDbName();
      bitField0_ = (bitField0_ & ~0x00000004);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table resides.
     * </pre>
     *
     * <code>string db_name = 3 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for dbName to set.
     * @return This builder for chaining.
     */
    public Builder setDbNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      dbName_ = value;
      bitField0_ |= 0x00000004;
      onChanged();
      return this;
    }

    private java.lang.Object destinationDbName_ = "";
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table should be moved.
     * </pre>
     *
     * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The destinationDbName.
     */
    public java.lang.String getDestinationDbName() {
      java.lang.Object ref = destinationDbName_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        destinationDbName_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table should be moved.
     * </pre>
     *
     * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return The bytes for destinationDbName.
     */
    public com.google.protobuf.ByteString getDestinationDbNameBytes() {
      java.lang.Object ref = destinationDbName_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        destinationDbName_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table should be moved.
     * </pre>
     *
     * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The destinationDbName to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationDbName(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      destinationDbName_ = value;
      bitField0_ |= 0x00000008;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table should be moved.
     * </pre>
     *
     * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearDestinationDbName() {
      destinationDbName_ = getDefaultInstance().getDestinationDbName();
      bitField0_ = (bitField0_ & ~0x00000008);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * Required. The name of the database where the table should be moved.
     * </pre>
     *
     * <code>string destination_db_name = 4 [(.google.api.field_behavior) = REQUIRED];</code>
     *
     * @param value The bytes for destinationDbName to set.
     * @return This builder for chaining.
     */
    public Builder setDestinationDbNameBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      destinationDbName_ = value;
      bitField0_ |= 0x00000008;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.metastore.v1beta.MoveTableToDatabaseRequest)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.metastore.v1beta.MoveTableToDatabaseRequest)
  private static final com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest
      DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest();
  }

  public static com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<MoveTableToDatabaseRequest> PARSER =
      new com.google.protobuf.AbstractParser<MoveTableToDatabaseRequest>() {
        @java.lang.Override
        public MoveTableToDatabaseRequest parsePartialFrom(
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

  public static com.google.protobuf.Parser<MoveTableToDatabaseRequest> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<MoveTableToDatabaseRequest> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.metastore.v1beta.MoveTableToDatabaseRequest getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
