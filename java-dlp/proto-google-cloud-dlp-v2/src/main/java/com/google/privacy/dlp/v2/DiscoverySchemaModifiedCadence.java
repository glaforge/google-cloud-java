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
// source: google/privacy/dlp/v2/dlp.proto

// Protobuf Java Version: 3.25.3
package com.google.privacy.dlp.v2;

/**
 *
 *
 * <pre>
 * The cadence at which to update data profiles when a schema is modified.
 * </pre>
 *
 * Protobuf type {@code google.privacy.dlp.v2.DiscoverySchemaModifiedCadence}
 */
public final class DiscoverySchemaModifiedCadence extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.privacy.dlp.v2.DiscoverySchemaModifiedCadence)
    DiscoverySchemaModifiedCadenceOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use DiscoverySchemaModifiedCadence.newBuilder() to construct.
  private DiscoverySchemaModifiedCadence(
      com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private DiscoverySchemaModifiedCadence() {
    types_ = java.util.Collections.emptyList();
    frequency_ = 0;
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new DiscoverySchemaModifiedCadence();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoverySchemaModifiedCadence_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.privacy.dlp.v2.DlpProto
        .internal_static_google_privacy_dlp_v2_DiscoverySchemaModifiedCadence_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.class,
            com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder.class);
  }

  public static final int TYPES_FIELD_NUMBER = 1;

  @SuppressWarnings("serial")
  private java.util.List<java.lang.Integer> types_;

  private static final com.google.protobuf.Internal.ListAdapter.Converter<
          java.lang.Integer, com.google.privacy.dlp.v2.BigQuerySchemaModification>
      types_converter_ =
          new com.google.protobuf.Internal.ListAdapter.Converter<
              java.lang.Integer, com.google.privacy.dlp.v2.BigQuerySchemaModification>() {
            public com.google.privacy.dlp.v2.BigQuerySchemaModification convert(
                java.lang.Integer from) {
              com.google.privacy.dlp.v2.BigQuerySchemaModification result =
                  com.google.privacy.dlp.v2.BigQuerySchemaModification.forNumber(from);
              return result == null
                  ? com.google.privacy.dlp.v2.BigQuerySchemaModification.UNRECOGNIZED
                  : result;
            }
          };
  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @return A list containing the types.
   */
  @java.lang.Override
  public java.util.List<com.google.privacy.dlp.v2.BigQuerySchemaModification> getTypesList() {
    return new com.google.protobuf.Internal.ListAdapter<
        java.lang.Integer, com.google.privacy.dlp.v2.BigQuerySchemaModification>(
        types_, types_converter_);
  }
  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @return The count of types.
   */
  @java.lang.Override
  public int getTypesCount() {
    return types_.size();
  }
  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @param index The index of the element to return.
   * @return The types at the given index.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.BigQuerySchemaModification getTypes(int index) {
    return types_converter_.convert(types_.get(index));
  }
  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @return A list containing the enum numeric values on the wire for types.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getTypesValueList() {
    return types_;
  }
  /**
   *
   *
   * <pre>
   * The type of events to consider when deciding if the table's schema
   * has been modified and should have the profile updated. Defaults to
   * NEW_COLUMNS.
   * </pre>
   *
   * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
   *
   * @param index The index of the value to return.
   * @return The enum numeric value on the wire of types at the given index.
   */
  @java.lang.Override
  public int getTypesValue(int index) {
    return types_.get(index);
  }

  private int typesMemoizedSerializedSize;

  public static final int FREQUENCY_FIELD_NUMBER = 2;
  private int frequency_ = 0;
  /**
   *
   *
   * <pre>
   * How frequently profiles may be updated when schemas are
   * modified. Defaults to monthly.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
   *
   * @return The enum numeric value on the wire for frequency.
   */
  @java.lang.Override
  public int getFrequencyValue() {
    return frequency_;
  }
  /**
   *
   *
   * <pre>
   * How frequently profiles may be updated when schemas are
   * modified. Defaults to monthly.
   * </pre>
   *
   * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
   *
   * @return The frequency.
   */
  @java.lang.Override
  public com.google.privacy.dlp.v2.DataProfileUpdateFrequency getFrequency() {
    com.google.privacy.dlp.v2.DataProfileUpdateFrequency result =
        com.google.privacy.dlp.v2.DataProfileUpdateFrequency.forNumber(frequency_);
    return result == null
        ? com.google.privacy.dlp.v2.DataProfileUpdateFrequency.UNRECOGNIZED
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
    getSerializedSize();
    if (getTypesList().size() > 0) {
      output.writeUInt32NoTag(10);
      output.writeUInt32NoTag(typesMemoizedSerializedSize);
    }
    for (int i = 0; i < types_.size(); i++) {
      output.writeEnumNoTag(types_.get(i));
    }
    if (frequency_
        != com.google.privacy.dlp.v2.DataProfileUpdateFrequency.UPDATE_FREQUENCY_UNSPECIFIED
            .getNumber()) {
      output.writeEnum(2, frequency_);
    }
    getUnknownFields().writeTo(output);
  }

  @java.lang.Override
  public int getSerializedSize() {
    int size = memoizedSize;
    if (size != -1) return size;

    size = 0;
    {
      int dataSize = 0;
      for (int i = 0; i < types_.size(); i++) {
        dataSize += com.google.protobuf.CodedOutputStream.computeEnumSizeNoTag(types_.get(i));
      }
      size += dataSize;
      if (!getTypesList().isEmpty()) {
        size += 1;
        size += com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(dataSize);
      }
      typesMemoizedSerializedSize = dataSize;
    }
    if (frequency_
        != com.google.privacy.dlp.v2.DataProfileUpdateFrequency.UPDATE_FREQUENCY_UNSPECIFIED
            .getNumber()) {
      size += com.google.protobuf.CodedOutputStream.computeEnumSize(2, frequency_);
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
    if (!(obj instanceof com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence)) {
      return super.equals(obj);
    }
    com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence other =
        (com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence) obj;

    if (!types_.equals(other.types_)) return false;
    if (frequency_ != other.frequency_) return false;
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
    if (getTypesCount() > 0) {
      hash = (37 * hash) + TYPES_FIELD_NUMBER;
      hash = (53 * hash) + types_.hashCode();
    }
    hash = (37 * hash) + FREQUENCY_FIELD_NUMBER;
    hash = (53 * hash) + frequency_;
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      java.nio.ByteBuffer data) throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence parseFrom(
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
      com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence prototype) {
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
   * The cadence at which to update data profiles when a schema is modified.
   * </pre>
   *
   * Protobuf type {@code google.privacy.dlp.v2.DiscoverySchemaModifiedCadence}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.privacy.dlp.v2.DiscoverySchemaModifiedCadence)
      com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadenceOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoverySchemaModifiedCadence_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoverySchemaModifiedCadence_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.class,
              com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.Builder.class);
    }

    // Construct using com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      frequency_ = 0;
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.privacy.dlp.v2.DlpProto
          .internal_static_google_privacy_dlp_v2_DiscoverySchemaModifiedCadence_descriptor;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence getDefaultInstanceForType() {
      return com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence build() {
      com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence buildPartial() {
      com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence result =
          new com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence(this);
      buildPartialRepeatedFields(result);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartialRepeatedFields(
        com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence result) {
      if (((bitField0_ & 0x00000001) != 0)) {
        types_ = java.util.Collections.unmodifiableList(types_);
        bitField0_ = (bitField0_ & ~0x00000001);
      }
      result.types_ = types_;
    }

    private void buildPartial0(com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.frequency_ = frequency_;
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
      if (other instanceof com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence) {
        return mergeFrom((com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence other) {
      if (other == com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence.getDefaultInstance())
        return this;
      if (!other.types_.isEmpty()) {
        if (types_.isEmpty()) {
          types_ = other.types_;
          bitField0_ = (bitField0_ & ~0x00000001);
        } else {
          ensureTypesIsMutable();
          types_.addAll(other.types_);
        }
        onChanged();
      }
      if (other.frequency_ != 0) {
        setFrequencyValue(other.getFrequencyValue());
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
                int tmpRaw = input.readEnum();
                ensureTypesIsMutable();
                types_.add(tmpRaw);
                break;
              } // case 8
            case 10:
              {
                int length = input.readRawVarint32();
                int oldLimit = input.pushLimit(length);
                while (input.getBytesUntilLimit() > 0) {
                  int tmpRaw = input.readEnum();
                  ensureTypesIsMutable();
                  types_.add(tmpRaw);
                }
                input.popLimit(oldLimit);
                break;
              } // case 10
            case 16:
              {
                frequency_ = input.readEnum();
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

    private java.util.List<java.lang.Integer> types_ = java.util.Collections.emptyList();

    private void ensureTypesIsMutable() {
      if (!((bitField0_ & 0x00000001) != 0)) {
        types_ = new java.util.ArrayList<java.lang.Integer>(types_);
        bitField0_ |= 0x00000001;
      }
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @return A list containing the types.
     */
    public java.util.List<com.google.privacy.dlp.v2.BigQuerySchemaModification> getTypesList() {
      return new com.google.protobuf.Internal.ListAdapter<
          java.lang.Integer, com.google.privacy.dlp.v2.BigQuerySchemaModification>(
          types_, types_converter_);
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @return The count of types.
     */
    public int getTypesCount() {
      return types_.size();
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param index The index of the element to return.
     * @return The types at the given index.
     */
    public com.google.privacy.dlp.v2.BigQuerySchemaModification getTypes(int index) {
      return types_converter_.convert(types_.get(index));
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The types to set.
     * @return This builder for chaining.
     */
    public Builder setTypes(int index, com.google.privacy.dlp.v2.BigQuerySchemaModification value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTypesIsMutable();
      types_.set(index, value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param value The types to add.
     * @return This builder for chaining.
     */
    public Builder addTypes(com.google.privacy.dlp.v2.BigQuerySchemaModification value) {
      if (value == null) {
        throw new NullPointerException();
      }
      ensureTypesIsMutable();
      types_.add(value.getNumber());
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param values The types to add.
     * @return This builder for chaining.
     */
    public Builder addAllTypes(
        java.lang.Iterable<? extends com.google.privacy.dlp.v2.BigQuerySchemaModification> values) {
      ensureTypesIsMutable();
      for (com.google.privacy.dlp.v2.BigQuerySchemaModification value : values) {
        types_.add(value.getNumber());
      }
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearTypes() {
      types_ = java.util.Collections.emptyList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @return A list containing the enum numeric values on the wire for types.
     */
    public java.util.List<java.lang.Integer> getTypesValueList() {
      return java.util.Collections.unmodifiableList(types_);
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param index The index of the value to return.
     * @return The enum numeric value on the wire of types at the given index.
     */
    public int getTypesValue(int index) {
      return types_.get(index);
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param index The index to set the value at.
     * @param value The enum numeric value on the wire for types to set.
     * @return This builder for chaining.
     */
    public Builder setTypesValue(int index, int value) {
      ensureTypesIsMutable();
      types_.set(index, value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param value The enum numeric value on the wire for types to add.
     * @return This builder for chaining.
     */
    public Builder addTypesValue(int value) {
      ensureTypesIsMutable();
      types_.add(value);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * The type of events to consider when deciding if the table's schema
     * has been modified and should have the profile updated. Defaults to
     * NEW_COLUMNS.
     * </pre>
     *
     * <code>repeated .google.privacy.dlp.v2.BigQuerySchemaModification types = 1;</code>
     *
     * @param values The enum numeric values on the wire for types to add.
     * @return This builder for chaining.
     */
    public Builder addAllTypesValue(java.lang.Iterable<java.lang.Integer> values) {
      ensureTypesIsMutable();
      for (int value : values) {
        types_.add(value);
      }
      onChanged();
      return this;
    }

    private int frequency_ = 0;
    /**
     *
     *
     * <pre>
     * How frequently profiles may be updated when schemas are
     * modified. Defaults to monthly.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
     *
     * @return The enum numeric value on the wire for frequency.
     */
    @java.lang.Override
    public int getFrequencyValue() {
      return frequency_;
    }
    /**
     *
     *
     * <pre>
     * How frequently profiles may be updated when schemas are
     * modified. Defaults to monthly.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
     *
     * @param value The enum numeric value on the wire for frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequencyValue(int value) {
      frequency_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How frequently profiles may be updated when schemas are
     * modified. Defaults to monthly.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
     *
     * @return The frequency.
     */
    @java.lang.Override
    public com.google.privacy.dlp.v2.DataProfileUpdateFrequency getFrequency() {
      com.google.privacy.dlp.v2.DataProfileUpdateFrequency result =
          com.google.privacy.dlp.v2.DataProfileUpdateFrequency.forNumber(frequency_);
      return result == null
          ? com.google.privacy.dlp.v2.DataProfileUpdateFrequency.UNRECOGNIZED
          : result;
    }
    /**
     *
     *
     * <pre>
     * How frequently profiles may be updated when schemas are
     * modified. Defaults to monthly.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
     *
     * @param value The frequency to set.
     * @return This builder for chaining.
     */
    public Builder setFrequency(com.google.privacy.dlp.v2.DataProfileUpdateFrequency value) {
      if (value == null) {
        throw new NullPointerException();
      }
      bitField0_ |= 0x00000002;
      frequency_ = value.getNumber();
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * How frequently profiles may be updated when schemas are
     * modified. Defaults to monthly.
     * </pre>
     *
     * <code>.google.privacy.dlp.v2.DataProfileUpdateFrequency frequency = 2;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearFrequency() {
      bitField0_ = (bitField0_ & ~0x00000002);
      frequency_ = 0;
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

    // @@protoc_insertion_point(builder_scope:google.privacy.dlp.v2.DiscoverySchemaModifiedCadence)
  }

  // @@protoc_insertion_point(class_scope:google.privacy.dlp.v2.DiscoverySchemaModifiedCadence)
  private static final com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence();
  }

  public static com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<DiscoverySchemaModifiedCadence> PARSER =
      new com.google.protobuf.AbstractParser<DiscoverySchemaModifiedCadence>() {
        @java.lang.Override
        public DiscoverySchemaModifiedCadence parsePartialFrom(
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

  public static com.google.protobuf.Parser<DiscoverySchemaModifiedCadence> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<DiscoverySchemaModifiedCadence> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.privacy.dlp.v2.DiscoverySchemaModifiedCadence getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
