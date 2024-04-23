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
// source: google/cloud/compute/v1/compute.proto

// Protobuf Java Version: 3.25.3
package com.google.cloud.compute.v1;

/**
 *
 *
 * <pre>
 * </pre>
 *
 * Protobuf type {@code google.cloud.compute.v1.RouteAsPath}
 */
public final class RouteAsPath extends com.google.protobuf.GeneratedMessageV3
    implements
    // @@protoc_insertion_point(message_implements:google.cloud.compute.v1.RouteAsPath)
    RouteAsPathOrBuilder {
  private static final long serialVersionUID = 0L;
  // Use RouteAsPath.newBuilder() to construct.
  private RouteAsPath(com.google.protobuf.GeneratedMessageV3.Builder<?> builder) {
    super(builder);
  }

  private RouteAsPath() {
    asLists_ = emptyIntList();
    pathSegmentType_ = "";
  }

  @java.lang.Override
  @SuppressWarnings({"unused"})
  protected java.lang.Object newInstance(UnusedPrivateParameter unused) {
    return new RouteAsPath();
  }

  public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RouteAsPath_descriptor;
  }

  @java.lang.Override
  protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
      internalGetFieldAccessorTable() {
    return com.google.cloud.compute.v1.Compute
        .internal_static_google_cloud_compute_v1_RouteAsPath_fieldAccessorTable
        .ensureFieldAccessorsInitialized(
            com.google.cloud.compute.v1.RouteAsPath.class,
            com.google.cloud.compute.v1.RouteAsPath.Builder.class);
  }

  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * </pre>
   *
   * Protobuf enum {@code google.cloud.compute.v1.RouteAsPath.PathSegmentType}
   */
  public enum PathSegmentType implements com.google.protobuf.ProtocolMessageEnum {
    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PATH_SEGMENT_TYPE = 0;</code>
     */
    UNDEFINED_PATH_SEGMENT_TYPE(0),
    /** <code>AS_CONFED_SEQUENCE = 222152624;</code> */
    AS_CONFED_SEQUENCE(222152624),
    /** <code>AS_CONFED_SET = 374040307;</code> */
    AS_CONFED_SET(374040307),
    /** <code>AS_SEQUENCE = 106735918;</code> */
    AS_SEQUENCE(106735918),
    /** <code>AS_SET = 329846453;</code> */
    AS_SET(329846453),
    UNRECOGNIZED(-1),
    ;

    /**
     *
     *
     * <pre>
     * A value indicating that the enum field is not set.
     * </pre>
     *
     * <code>UNDEFINED_PATH_SEGMENT_TYPE = 0;</code>
     */
    public static final int UNDEFINED_PATH_SEGMENT_TYPE_VALUE = 0;
    /** <code>AS_CONFED_SEQUENCE = 222152624;</code> */
    public static final int AS_CONFED_SEQUENCE_VALUE = 222152624;
    /** <code>AS_CONFED_SET = 374040307;</code> */
    public static final int AS_CONFED_SET_VALUE = 374040307;
    /** <code>AS_SEQUENCE = 106735918;</code> */
    public static final int AS_SEQUENCE_VALUE = 106735918;
    /** <code>AS_SET = 329846453;</code> */
    public static final int AS_SET_VALUE = 329846453;

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
    public static PathSegmentType valueOf(int value) {
      return forNumber(value);
    }

    /**
     * @param value The numeric wire value of the corresponding enum entry.
     * @return The enum associated with the given numeric wire value.
     */
    public static PathSegmentType forNumber(int value) {
      switch (value) {
        case 0:
          return UNDEFINED_PATH_SEGMENT_TYPE;
        case 222152624:
          return AS_CONFED_SEQUENCE;
        case 374040307:
          return AS_CONFED_SET;
        case 106735918:
          return AS_SEQUENCE;
        case 329846453:
          return AS_SET;
        default:
          return null;
      }
    }

    public static com.google.protobuf.Internal.EnumLiteMap<PathSegmentType> internalGetValueMap() {
      return internalValueMap;
    }

    private static final com.google.protobuf.Internal.EnumLiteMap<PathSegmentType>
        internalValueMap =
            new com.google.protobuf.Internal.EnumLiteMap<PathSegmentType>() {
              public PathSegmentType findValueByNumber(int number) {
                return PathSegmentType.forNumber(number);
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
      return com.google.cloud.compute.v1.RouteAsPath.getDescriptor().getEnumTypes().get(0);
    }

    private static final PathSegmentType[] VALUES = values();

    public static PathSegmentType valueOf(
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

    private PathSegmentType(int value) {
      this.value = value;
    }

    // @@protoc_insertion_point(enum_scope:google.cloud.compute.v1.RouteAsPath.PathSegmentType)
  }

  private int bitField0_;
  public static final int AS_LISTS_FIELD_NUMBER = 134112584;

  @SuppressWarnings("serial")
  private com.google.protobuf.Internal.IntList asLists_ = emptyIntList();
  /**
   *
   *
   * <pre>
   * [Output Only] The AS numbers of the AS Path.
   * </pre>
   *
   * <code>repeated uint32 as_lists = 134112584;</code>
   *
   * @return A list containing the asLists.
   */
  @java.lang.Override
  public java.util.List<java.lang.Integer> getAsListsList() {
    return asLists_;
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The AS numbers of the AS Path.
   * </pre>
   *
   * <code>repeated uint32 as_lists = 134112584;</code>
   *
   * @return The count of asLists.
   */
  public int getAsListsCount() {
    return asLists_.size();
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The AS numbers of the AS Path.
   * </pre>
   *
   * <code>repeated uint32 as_lists = 134112584;</code>
   *
   * @param index The index of the element to return.
   * @return The asLists at the given index.
   */
  public int getAsLists(int index) {
    return asLists_.getInt(index);
  }

  private int asListsMemoizedSerializedSize = -1;

  public static final int PATH_SEGMENT_TYPE_FIELD_NUMBER = 513464992;

  @SuppressWarnings("serial")
  private volatile java.lang.Object pathSegmentType_ = "";
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * Check the PathSegmentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string path_segment_type = 513464992;</code>
   *
   * @return Whether the pathSegmentType field is set.
   */
  @java.lang.Override
  public boolean hasPathSegmentType() {
    return ((bitField0_ & 0x00000001) != 0);
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * Check the PathSegmentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string path_segment_type = 513464992;</code>
   *
   * @return The pathSegmentType.
   */
  @java.lang.Override
  public java.lang.String getPathSegmentType() {
    java.lang.Object ref = pathSegmentType_;
    if (ref instanceof java.lang.String) {
      return (java.lang.String) ref;
    } else {
      com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
      java.lang.String s = bs.toStringUtf8();
      pathSegmentType_ = s;
      return s;
    }
  }
  /**
   *
   *
   * <pre>
   * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
   * Check the PathSegmentType enum for the list of possible values.
   * </pre>
   *
   * <code>optional string path_segment_type = 513464992;</code>
   *
   * @return The bytes for pathSegmentType.
   */
  @java.lang.Override
  public com.google.protobuf.ByteString getPathSegmentTypeBytes() {
    java.lang.Object ref = pathSegmentType_;
    if (ref instanceof java.lang.String) {
      com.google.protobuf.ByteString b =
          com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
      pathSegmentType_ = b;
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
    getSerializedSize();
    if (getAsListsList().size() > 0) {
      output.writeUInt32NoTag(1072900674);
      output.writeUInt32NoTag(asListsMemoizedSerializedSize);
    }
    for (int i = 0; i < asLists_.size(); i++) {
      output.writeUInt32NoTag(asLists_.getInt(i));
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      com.google.protobuf.GeneratedMessageV3.writeString(output, 513464992, pathSegmentType_);
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
      for (int i = 0; i < asLists_.size(); i++) {
        dataSize +=
            com.google.protobuf.CodedOutputStream.computeUInt32SizeNoTag(asLists_.getInt(i));
      }
      size += dataSize;
      if (!getAsListsList().isEmpty()) {
        size += 5;
        size += com.google.protobuf.CodedOutputStream.computeInt32SizeNoTag(dataSize);
      }
      asListsMemoizedSerializedSize = dataSize;
    }
    if (((bitField0_ & 0x00000001) != 0)) {
      size += com.google.protobuf.GeneratedMessageV3.computeStringSize(513464992, pathSegmentType_);
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
    if (!(obj instanceof com.google.cloud.compute.v1.RouteAsPath)) {
      return super.equals(obj);
    }
    com.google.cloud.compute.v1.RouteAsPath other = (com.google.cloud.compute.v1.RouteAsPath) obj;

    if (!getAsListsList().equals(other.getAsListsList())) return false;
    if (hasPathSegmentType() != other.hasPathSegmentType()) return false;
    if (hasPathSegmentType()) {
      if (!getPathSegmentType().equals(other.getPathSegmentType())) return false;
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
    if (getAsListsCount() > 0) {
      hash = (37 * hash) + AS_LISTS_FIELD_NUMBER;
      hash = (53 * hash) + getAsListsList().hashCode();
    }
    if (hasPathSegmentType()) {
      hash = (37 * hash) + PATH_SEGMENT_TYPE_FIELD_NUMBER;
      hash = (53 * hash) + getPathSegmentType().hashCode();
    }
    hash = (29 * hash) + getUnknownFields().hashCode();
    memoizedHashCode = hash;
    return hash;
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(java.nio.ByteBuffer data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
      java.nio.ByteBuffer data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
      com.google.protobuf.ByteString data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
      com.google.protobuf.ByteString data,
      com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(byte[] data)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
      byte[] data, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws com.google.protobuf.InvalidProtocolBufferException {
    return PARSER.parseFrom(data, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(java.io.InputStream input)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseDelimitedFrom(
      java.io.InputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseDelimitedFrom(
      java.io.InputStream input, com.google.protobuf.ExtensionRegistryLite extensionRegistry)
      throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseDelimitedWithIOException(
        PARSER, input, extensionRegistry);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
      com.google.protobuf.CodedInputStream input) throws java.io.IOException {
    return com.google.protobuf.GeneratedMessageV3.parseWithIOException(PARSER, input);
  }

  public static com.google.cloud.compute.v1.RouteAsPath parseFrom(
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

  public static Builder newBuilder(com.google.cloud.compute.v1.RouteAsPath prototype) {
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
   * </pre>
   *
   * Protobuf type {@code google.cloud.compute.v1.RouteAsPath}
   */
  public static final class Builder extends com.google.protobuf.GeneratedMessageV3.Builder<Builder>
      implements
      // @@protoc_insertion_point(builder_implements:google.cloud.compute.v1.RouteAsPath)
      com.google.cloud.compute.v1.RouteAsPathOrBuilder {
    public static final com.google.protobuf.Descriptors.Descriptor getDescriptor() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RouteAsPath_descriptor;
    }

    @java.lang.Override
    protected com.google.protobuf.GeneratedMessageV3.FieldAccessorTable
        internalGetFieldAccessorTable() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RouteAsPath_fieldAccessorTable
          .ensureFieldAccessorsInitialized(
              com.google.cloud.compute.v1.RouteAsPath.class,
              com.google.cloud.compute.v1.RouteAsPath.Builder.class);
    }

    // Construct using com.google.cloud.compute.v1.RouteAsPath.newBuilder()
    private Builder() {}

    private Builder(com.google.protobuf.GeneratedMessageV3.BuilderParent parent) {
      super(parent);
    }

    @java.lang.Override
    public Builder clear() {
      super.clear();
      bitField0_ = 0;
      asLists_ = emptyIntList();
      pathSegmentType_ = "";
      return this;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.Descriptor getDescriptorForType() {
      return com.google.cloud.compute.v1.Compute
          .internal_static_google_cloud_compute_v1_RouteAsPath_descriptor;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouteAsPath getDefaultInstanceForType() {
      return com.google.cloud.compute.v1.RouteAsPath.getDefaultInstance();
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouteAsPath build() {
      com.google.cloud.compute.v1.RouteAsPath result = buildPartial();
      if (!result.isInitialized()) {
        throw newUninitializedMessageException(result);
      }
      return result;
    }

    @java.lang.Override
    public com.google.cloud.compute.v1.RouteAsPath buildPartial() {
      com.google.cloud.compute.v1.RouteAsPath result =
          new com.google.cloud.compute.v1.RouteAsPath(this);
      if (bitField0_ != 0) {
        buildPartial0(result);
      }
      onBuilt();
      return result;
    }

    private void buildPartial0(com.google.cloud.compute.v1.RouteAsPath result) {
      int from_bitField0_ = bitField0_;
      if (((from_bitField0_ & 0x00000001) != 0)) {
        asLists_.makeImmutable();
        result.asLists_ = asLists_;
      }
      int to_bitField0_ = 0;
      if (((from_bitField0_ & 0x00000002) != 0)) {
        result.pathSegmentType_ = pathSegmentType_;
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
      if (other instanceof com.google.cloud.compute.v1.RouteAsPath) {
        return mergeFrom((com.google.cloud.compute.v1.RouteAsPath) other);
      } else {
        super.mergeFrom(other);
        return this;
      }
    }

    public Builder mergeFrom(com.google.cloud.compute.v1.RouteAsPath other) {
      if (other == com.google.cloud.compute.v1.RouteAsPath.getDefaultInstance()) return this;
      if (!other.asLists_.isEmpty()) {
        if (asLists_.isEmpty()) {
          asLists_ = other.asLists_;
          asLists_.makeImmutable();
          bitField0_ |= 0x00000001;
        } else {
          ensureAsListsIsMutable();
          asLists_.addAll(other.asLists_);
        }
        onChanged();
      }
      if (other.hasPathSegmentType()) {
        pathSegmentType_ = other.pathSegmentType_;
        bitField0_ |= 0x00000002;
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
            case 1072900672:
              {
                int v = input.readUInt32();
                ensureAsListsIsMutable();
                asLists_.addInt(v);
                break;
              } // case 1072900672
            case 1072900674:
              {
                int length = input.readRawVarint32();
                int limit = input.pushLimit(length);
                ensureAsListsIsMutable();
                while (input.getBytesUntilLimit() > 0) {
                  asLists_.addInt(input.readUInt32());
                }
                input.popLimit(limit);
                break;
              } // case 1072900674
            case -187247358:
              {
                pathSegmentType_ = input.readStringRequireUtf8();
                bitField0_ |= 0x00000002;
                break;
              } // case -187247358
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

    private com.google.protobuf.Internal.IntList asLists_ = emptyIntList();

    private void ensureAsListsIsMutable() {
      if (!asLists_.isModifiable()) {
        asLists_ = makeMutableCopy(asLists_);
      }
      bitField0_ |= 0x00000001;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @return A list containing the asLists.
     */
    public java.util.List<java.lang.Integer> getAsListsList() {
      asLists_.makeImmutable();
      return asLists_;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @return The count of asLists.
     */
    public int getAsListsCount() {
      return asLists_.size();
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @param index The index of the element to return.
     * @return The asLists at the given index.
     */
    public int getAsLists(int index) {
      return asLists_.getInt(index);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @param index The index to set the value at.
     * @param value The asLists to set.
     * @return This builder for chaining.
     */
    public Builder setAsLists(int index, int value) {

      ensureAsListsIsMutable();
      asLists_.setInt(index, value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @param value The asLists to add.
     * @return This builder for chaining.
     */
    public Builder addAsLists(int value) {

      ensureAsListsIsMutable();
      asLists_.addInt(value);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @param values The asLists to add.
     * @return This builder for chaining.
     */
    public Builder addAllAsLists(java.lang.Iterable<? extends java.lang.Integer> values) {
      ensureAsListsIsMutable();
      com.google.protobuf.AbstractMessageLite.Builder.addAll(values, asLists_);
      bitField0_ |= 0x00000001;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The AS numbers of the AS Path.
     * </pre>
     *
     * <code>repeated uint32 as_lists = 134112584;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearAsLists() {
      asLists_ = emptyIntList();
      bitField0_ = (bitField0_ & ~0x00000001);
      onChanged();
      return this;
    }

    private java.lang.Object pathSegmentType_ = "";
    /**
     *
     *
     * <pre>
     * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * Check the PathSegmentType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string path_segment_type = 513464992;</code>
     *
     * @return Whether the pathSegmentType field is set.
     */
    public boolean hasPathSegmentType() {
      return ((bitField0_ & 0x00000002) != 0);
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * Check the PathSegmentType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string path_segment_type = 513464992;</code>
     *
     * @return The pathSegmentType.
     */
    public java.lang.String getPathSegmentType() {
      java.lang.Object ref = pathSegmentType_;
      if (!(ref instanceof java.lang.String)) {
        com.google.protobuf.ByteString bs = (com.google.protobuf.ByteString) ref;
        java.lang.String s = bs.toStringUtf8();
        pathSegmentType_ = s;
        return s;
      } else {
        return (java.lang.String) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * Check the PathSegmentType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string path_segment_type = 513464992;</code>
     *
     * @return The bytes for pathSegmentType.
     */
    public com.google.protobuf.ByteString getPathSegmentTypeBytes() {
      java.lang.Object ref = pathSegmentType_;
      if (ref instanceof String) {
        com.google.protobuf.ByteString b =
            com.google.protobuf.ByteString.copyFromUtf8((java.lang.String) ref);
        pathSegmentType_ = b;
        return b;
      } else {
        return (com.google.protobuf.ByteString) ref;
      }
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * Check the PathSegmentType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string path_segment_type = 513464992;</code>
     *
     * @param value The pathSegmentType to set.
     * @return This builder for chaining.
     */
    public Builder setPathSegmentType(java.lang.String value) {
      if (value == null) {
        throw new NullPointerException();
      }
      pathSegmentType_ = value;
      bitField0_ |= 0x00000002;
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * Check the PathSegmentType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string path_segment_type = 513464992;</code>
     *
     * @return This builder for chaining.
     */
    public Builder clearPathSegmentType() {
      pathSegmentType_ = getDefaultInstance().getPathSegmentType();
      bitField0_ = (bitField0_ & ~0x00000002);
      onChanged();
      return this;
    }
    /**
     *
     *
     * <pre>
     * [Output Only] The type of the AS Path, which can be one of the following values: - 'AS_SET': unordered set of autonomous systems that the route in has traversed - 'AS_SEQUENCE': ordered set of autonomous systems that the route has traversed - 'AS_CONFED_SEQUENCE': ordered set of Member Autonomous Systems in the local confederation that the route has traversed - 'AS_CONFED_SET': unordered set of Member Autonomous Systems in the local confederation that the route has traversed
     * Check the PathSegmentType enum for the list of possible values.
     * </pre>
     *
     * <code>optional string path_segment_type = 513464992;</code>
     *
     * @param value The bytes for pathSegmentType to set.
     * @return This builder for chaining.
     */
    public Builder setPathSegmentTypeBytes(com.google.protobuf.ByteString value) {
      if (value == null) {
        throw new NullPointerException();
      }
      checkByteStringIsUtf8(value);
      pathSegmentType_ = value;
      bitField0_ |= 0x00000002;
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

    // @@protoc_insertion_point(builder_scope:google.cloud.compute.v1.RouteAsPath)
  }

  // @@protoc_insertion_point(class_scope:google.cloud.compute.v1.RouteAsPath)
  private static final com.google.cloud.compute.v1.RouteAsPath DEFAULT_INSTANCE;

  static {
    DEFAULT_INSTANCE = new com.google.cloud.compute.v1.RouteAsPath();
  }

  public static com.google.cloud.compute.v1.RouteAsPath getDefaultInstance() {
    return DEFAULT_INSTANCE;
  }

  private static final com.google.protobuf.Parser<RouteAsPath> PARSER =
      new com.google.protobuf.AbstractParser<RouteAsPath>() {
        @java.lang.Override
        public RouteAsPath parsePartialFrom(
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

  public static com.google.protobuf.Parser<RouteAsPath> parser() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.protobuf.Parser<RouteAsPath> getParserForType() {
    return PARSER;
  }

  @java.lang.Override
  public com.google.cloud.compute.v1.RouteAsPath getDefaultInstanceForType() {
    return DEFAULT_INSTANCE;
  }
}
